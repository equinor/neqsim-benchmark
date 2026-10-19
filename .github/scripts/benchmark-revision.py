import argparse
import hashlib
import json
import subprocess
from pathlib import Path


SCOPES = ("src/main/java", "src/main/resources", ".github/scripts/run-benchmark-timings.sh")


def git(repository, *arguments):
    return subprocess.check_output(["git", "-C", str(repository), *arguments])


def committed_files(repository, reference):
    if reference is None:
        return {}
    files = {}
    names = git(repository, "ls-tree", "-r", "--name-only", "-z", reference, "--", *SCOPES)
    for name in names.decode().split("\0"):
        if name:
            files[name] = hashlib.sha256(git(repository, "show", f"{reference}:{name}")).hexdigest()
    return files


def working_files(repository):
    files = {}
    for scope in SCOPES:
        source = repository / scope
        paths = source.rglob("*") if source.is_dir() else [source]
        for path in paths:
            if path.is_file():
                files[path.relative_to(repository).as_posix()] = hashlib.sha256(path.read_bytes()).hexdigest()
    return files


def fingerprint(files):
    payload = json.dumps(files, sort_keys=True, separators=(",", ":")).encode()
    return hashlib.sha256(payload).hexdigest()


def capture_revision(repository, reference=None):
    repository = repository.resolve()
    if git(repository, "rev-parse", "--is-shallow-repository").strip() == b"true":
        raise ValueError("Benchmark revisions require full Git history; use checkout fetch-depth: 0")
    reference = reference or "HEAD"
    commit = git(repository, "rev-parse", "--verify", f"{reference}^{{commit}}").decode().strip()
    history = git(repository, "rev-list", "--first-parent", "--reverse", commit, "--", *SCOPES)
    changes = history.decode().splitlines()
    committed = committed_files(repository, commit)
    files = working_files(repository) if reference == "HEAD" else committed
    dirty = files != committed
    number = len(changes) + int(dirty)
    if dirty:
        previous = committed
    elif changes:
        parents = git(repository, "rev-list", "--parents", "-n", "1", changes[-1]).decode().split()
        previous = committed_files(repository, parents[1] if len(parents) > 1 else None)
    else:
        previous = {}
    digest = fingerprint(files)
    return {
        "number": number,
        "label": f"B{number}-{digest[:12]}",
        "fingerprint": digest,
        "source_commit": commit,
        "uncommitted_changes": dirty,
        "scopes": list(SCOPES),
        "files": dict(sorted(files.items())),
        "changes": {
            "added": sorted(files.keys() - previous.keys()),
            "modified": sorted(name for name in files.keys() & previous.keys() if files[name] != previous[name]),
            "deleted": sorted(previous.keys() - files.keys()),
        },
    }


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--repository", type=Path, default=Path.cwd())
    parser.add_argument("--ref")
    parser.add_argument("--output", type=Path, required=True)
    parser.add_argument("--summary", type=Path)
    args = parser.parse_args()
    revision = capture_revision(args.repository, args.ref)
    args.output.write_text(json.dumps(revision, indent=2) + "\n")
    print(f"Benchmark suite revision: {revision['label']}")
    if args.summary:
        with args.summary.open("a") as summary:
            summary.write(f"## Benchmark Suite Revision\n\n`{revision['label']}`\n\n")
            summary.write("| Change | Files |\n| --- | ---: |\n")
            for kind, paths in revision["changes"].items():
                summary.write(f"| {kind} | {len(paths)} |\n")
            summary.write("\nCompare timings across releases only when suite revisions match.\n\n")


if __name__ == "__main__":
    main()