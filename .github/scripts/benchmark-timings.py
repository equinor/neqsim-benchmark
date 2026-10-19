import argparse
import json
import math
import os
import re
import shutil
from pathlib import Path


def load_results(path):
    results = {}
    for result in json.loads(path.read_text()):
        key = (result["benchmark"], tuple(sorted(result.get("params", {}).items())))
        metric = result["primaryMetric"]
        if result["mode"] != "avgt" or metric["scoreUnit"] != "ms/op":
            raise ValueError(f"Expected average milliseconds per operation: {key}")
        if not math.isfinite(metric["score"]) or metric["score"] <= 0:
            raise ValueError(f"Invalid benchmark timing: {key}")
        if key in results:
            raise ValueError(f"Duplicate benchmark result: {key}")
        results[key] = metric
    if not results:
        raise ValueError(f"No benchmark results in {path}")
    return results


def confidence_note(baseline, current):
    baseline_interval = baseline.get("scoreConfidence", [])
    current_interval = current.get("scoreConfidence", [])
    if (len(baseline_interval) != 2 or len(current_interval) != 2
            or not all(isinstance(value, (int, float)) and math.isfinite(value)
                       for value in baseline_interval + current_interval)):
        return "CI unavailable"
    if current_interval[0] > baseline_interval[1] or baseline_interval[0] > current_interval[1]:
        return "Separate CIs"
    return "Overlapping CIs"


def summarize(baseline, current, baseline_version, current_version, expected, limit=10):
    missing_baseline = expected - {key[0] for key in baseline}
    missing_current = expected - {key[0] for key in current}
    unmatched = baseline.keys() ^ current.keys()
    incomplete = bool(missing_baseline or missing_current or unmatched)
    changes = []
    for key, metric in current.items():
        if key not in baseline:
            continue
        previous = baseline[key]
        percent = 100 * (metric["score"] / previous["score"] - 1)
        changes.append((key, previous, metric, percent))
    changes.sort(key=lambda change: (-abs(change[3]), change[0]))
    slower = sum(change[3] > 0 for change in changes)
    faster = sum(change[3] < 0 for change in changes)
    lines = [
        "## Benchmark Timing Comparison",
        "",
        f"NeqSim **{baseline_version} -> {current_version}**, using identical benchmark sources.",
        f"{len(changes)} benchmark/parameter cases: {faster} lower, {slower} higher, "
        f"{len(changes) - faster - slower} unchanged mean timings.",
        "",
        ("Largest changes (up to 10)." if limit else "All timing changes, sorted by benchmark.")
        + " Lower ms/op is better; positive change means slower.",
        "",
        "| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |",
        "| --- | ---: | ---: | ---: | --- |",
    ]
    displayed = changes[:limit] if limit else sorted(changes, key=lambda change: change[0])
    for (benchmark, params), previous, metric, percent in displayed:
        name = benchmark.removeprefix("com.equinor.neqsim.benchmark.")
        if params:
            name += " (" + ", ".join(f"{name}={value}" for name, value in params) + ")"
        name = name.replace("|", "\\|").replace("\n", " ")
        lines.append(f"| {name} | {previous['score']:.6g} | {metric['score']:.6g} "
                     f"| {percent:+.2f}% | {confidence_note(previous, metric)} |")
    lines.extend([
        "",
        "Hosted-runner timings are indicative, not a regression gate. Overlapping confidence "
        "intervals do not establish a timing difference. Full JMH results are in the run logs.",
        "Two forks, two 2-second warmups and three 2-second measurements per case, one thread.",
    ])
    if incomplete:
        lines.extend(["", "**Incomplete comparison: some benchmarks did not produce results.**"])
        for label, missing in (("Baseline", missing_baseline), ("Current", missing_current)):
            if missing:
                lines.append(f"{label} missing: " + ", ".join(sorted(missing)))
        if unmatched:
            lines.append(f"{len(unmatched)} benchmark/parameter cases could not be matched across versions.")
    return "\n".join(lines), incomplete


def archive_results(args):
    source_dir = args.current.parent
    requested_versions = {"baseline": args.baseline_version, "current": args.current_version}
    artifact_versions = {}
    for variant in ("baseline", "current"):
        path = source_dir / f"{variant}-artifact.json"
        if path.exists():
            artifact = json.loads(path.read_text())
            version = artifact["version"]
            if not re.fullmatch(r"[0-9][0-9A-Za-z.+_-]*", version):
                raise ValueError(f"Invalid captured JAR version: {version!r}")
            requested_versions[variant] = artifact.get("requested_version", requested_versions[variant])
            artifact_versions[variant] = artifact
            setattr(args, f"{variant}_version", version)
    identifiers = (args.baseline_version, args.current_version, args.run_id, args.run_attempt)
    if not all(value and re.fullmatch(r"[A-Za-z0-9][A-Za-z0-9.+_-]*", value)
               for value in identifiers):
        raise ValueError("Release versions and run identifiers must be safe path components")
    destination = (args.archive_dir / "releases" / f"neqsim-{args.current_version}"
                   / f"from-{args.baseline_version}" / f"run-{args.run_id}-{args.run_attempt}")
    destination.mkdir(parents=True, exist_ok=True)
    errors = []
    for variant, artifact in artifact_versions.items():
        if artifact["version"] != requested_versions[variant]:
            errors.append(f"{variant} JAR version differs from requested version {requested_versions[variant]}")
    build_status = {}
    for variant in ("baseline", "current"):
        exit_path = source_dir / f"{variant}-build-exit-code.txt"
        if exit_path.exists():
            exit_code = int(exit_path.read_text().strip())
            build_status[variant] = {"status": "passed" if exit_code == 0 else "failed",
                                     "exit_code": exit_code}
            if exit_code:
                errors.append(f"{variant} Maven build failed (exit {exit_code})")
    results = []
    for path in (args.baseline, args.current):
        try:
            results.append(load_results(path))
        except (OSError, ValueError, KeyError, TypeError) as error:
            results.append({})
            errors.append(f"{path.name}: {error}")
    baseline, current = results
    expected = {line.strip() for path in (args.baseline_list, args.current_list) if path.exists()
                for line in path.read_text().splitlines()
                if line.strip().startswith("com.equinor.neqsim.benchmark.")}
    report, incomplete = summarize(baseline, current, args.baseline_version,
                                   args.current_version, expected, limit=None)
    complete = (args.status == "success" and bool(expected) and bool(baseline)
                and bool(current) and not errors and not incomplete)
    matched = sorted(baseline.keys() & current.keys())
    ratios = [current[key]["score"] / baseline[key]["score"] for key in matched]
    gain = 100 * (1 - math.exp(math.fsum(math.log(ratio) for ratio in ratios) / len(ratios))) \
        if complete and ratios else None
    record = {
        "baseline_version": args.baseline_version,
        "current_version": args.current_version,
        "run_id": args.run_id,
        "run_attempt": args.run_attempt,
        "source_commit": args.source_commit,
        "run_url": args.run_url,
        "status": "complete" if complete else "incomplete",
        "build_status": build_status,
        "requested_versions": requested_versions,
        "artifact_versions": artifact_versions,
        "matched_cases": len(matched),
        "faster_cases": sum(ratio < 1 for ratio in ratios),
        "slower_cases": sum(ratio > 1 for ratio in ratios),
        "gain_percent": gain,
        "errors": errors,
    }
    run_link = f"[Actions run]({args.run_url})" if args.run_url else "not recorded"
    metadata = (f"# NeqSim {args.current_version} Benchmark Results\n\n"
                "| Field | Value |\n| --- | --- |\n"
                f"| Baseline | {args.baseline_version} |\n"
                f"| Current | {args.current_version} |\n"
                f"| Source commit | `{args.source_commit}` |\n"
                f"| Run | {run_link} |\n| Status | {record['status']} |\n")
    if not complete:
        report += "\n\nIncomplete run; no overall gain is reported. Check the transcript."
    if errors:
        report += "\n" + "\n".join(errors)
    if build_status:
        build_table = ["## Maven Build Results", "", "| Variant | Status | Exit Code |",
                       "| --- | --- | ---: |"]
        build_table.extend(f"| {variant} | {result['status']} | {result['exit_code']} |"
                           for variant, result in build_status.items())
        report = "\n".join(build_table) + "\n\n" + report
    artifact_table = ["## NeqSim JAR Versions", "", "| Variant | Requested | JAR version | Evidence |",
                      "| --- | --- | --- | --- |"]
    for variant in ("baseline", "current"):
        artifact = artifact_versions.get(variant)
        actual = artifact["version"] if artifact else "not resolved"
        evidence = "embedded Maven pom.properties" if artifact else "requested version only; JAR unavailable"
        artifact_table.append(f"| {variant} | {requested_versions[variant]} | {actual} | {evidence} |")
    report = "\n".join(artifact_table) + "\n\n" + report
    (destination / "comparison.md").write_text(metadata + "\n" + report + "\n")
    (destination / "comparison.json").write_text(json.dumps(record, indent=2) + "\n")
    transcript = [metadata]
    for name in ("benchmark-environment.txt", "benchmark-build-summary.md",
                 "baseline-artifact.json", "current-artifact.json",
                 "baseline-build-exit-code.txt", "baseline-build.log", "baseline-benchmarks.txt",
                 "baseline-benchmarks.log", "current-build-exit-code.txt", "current-build.log", "current-benchmarks.txt",
                 "current-benchmarks.log", "benchmark-timing-summary.md"):
        path = source_dir / name
        transcript.append(f"\n## {name}\n")
        if path.exists():
            content = path.read_text(errors="replace")
            fence = "`" * max(3, max((len(match.group()) for match in re.finditer(r"`+", content)), default=0) + 1)
            transcript.append(f"{fence}text\n{content}\n{fence}\n")
        else:
            transcript.append("Not produced; the run did not reach this stage.\n")
    (destination / "transcript.md").write_text("\n".join(transcript))
    for path in (args.baseline, args.current):
        if path.exists():
            shutil.copyfile(path, destination / path.name)
    for variant in artifact_versions:
        path = source_dir / f"{variant}-artifact.json"
        shutil.copyfile(path, destination / path.name)
    if args.pom_file:
        shutil.copyfile(args.pom_file, destination / "pom.xml")
    update_history(args.archive_dir)
    return record


def update_history(root):
    records = [(path, json.loads(path.read_text()))
               for path in root.glob("releases/*/from-*/run-*/comparison.json")]
    records.sort(key=lambda item: (len(item[1]["run_id"]), item[1]["run_id"],
                                   int(item[1]["run_attempt"])))
    lines = [
        "# NeqSim Benchmark Timing History",
        "",
        "Positive gain means lower average time per operation. Overall gain is the",
        "geometric-mean time reduction across matched benchmark/parameter cases.",
        "Incomplete runs have no overall gain. Hosted-runner timings are indicative;",
        "compare matching benchmark sets and inspect confidence intervals in comparison.md.",
        "Versions come from embedded dependency JAR metadata when available; (requested) means the JAR could not be inspected.",
        "",
        "| Release | Baseline | Maven Builds | Cases | Lower / Higher | Overall Gain | Status | Report |",
        "| --- | --- | --- | ---: | ---: | ---: | --- | --- |",
    ]
    for path, record in records:
        gain = f"{record['gain_percent']:+.2f}%" if record["gain_percent"] is not None else "n/a"
        report_path = path.with_name("comparison.md")
        if not report_path.exists():
            report_path = path.with_name("comparison.txt")
        report = report_path.relative_to(root).as_posix()
        builds = []
        for variant, result in record.get("build_status", {}).items():
            builds.append(f"{variant}: {result['status']} (exit {result['exit_code']})")
        build_text = "; ".join(builds) or "not recorded"
        current_label = record["current_version"]
        baseline_label = record["baseline_version"]
        if "artifact_versions" in record:
            if "current" not in record["artifact_versions"]:
                current_label += " (requested)"
            if "baseline" not in record["artifact_versions"]:
                baseline_label += " (requested)"
        lines.append(f"| {current_label} | {baseline_label} "
                     f"| {build_text} | {record['matched_cases']} "
                     f"| {record['faster_cases']} / {record['slower_cases']} "
                     f"| {gain} | {record['status']} | [View results]({report}) |")
    (root / "summary.md").write_text("\n".join(lines) + "\n")


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("baseline", type=Path)
    parser.add_argument("current", type=Path)
    parser.add_argument("--baseline-version", required=True)
    parser.add_argument("--current-version", required=True)
    parser.add_argument("--baseline-list", type=Path, required=True)
    parser.add_argument("--current-list", type=Path, required=True)
    parser.add_argument("--archive-dir", type=Path)
    parser.add_argument("--pom-file", type=Path)
    parser.add_argument("--require-complete", action="store_true")
    parser.add_argument("--run-id", default=os.environ.get("GITHUB_RUN_ID"))
    parser.add_argument("--run-attempt", default=os.environ.get("GITHUB_RUN_ATTEMPT", "1"))
    parser.add_argument("--source-commit", default=os.environ.get("GITHUB_SHA", ""))
    parser.add_argument("--run-url", default="")
    parser.add_argument("--status", choices=("success", "failure", "cancelled"), default="success")
    args = parser.parse_args()
    if args.archive_dir:
        record = archive_results(args)
        if args.require_complete and record["status"] != "complete":
            raise SystemExit("Benchmark comparison is incomplete; dependency update is blocked")
        return
    expected = {line.strip() for path in (args.baseline_list, args.current_list)
                for line in path.read_text().splitlines()
                if line.strip().startswith("com.equinor.neqsim.benchmark.")}
    if not expected:
        raise ValueError("JMH did not discover any benchmark methods")
    report, incomplete = summarize(load_results(args.baseline), load_results(args.current),
                                   args.baseline_version, args.current_version, expected)
    print(report)
    if incomplete:
        raise SystemExit(1)


if __name__ == "__main__":
    main()