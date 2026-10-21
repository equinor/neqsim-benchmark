# Benchmark Results

[summary.md](summary.md) keeps a cumulative Markdown table of release comparisons.
Positive overall gain means a reduction in average time per operation, computed
as the geometric mean of the current/baseline timing ratios. Compare runs with
the same benchmark cases; incomplete runs have no reported overall gain.

Release history is updated only by the dependency updater when NeqSim changes,
with one row for the first report of each baseline-to-release transition and
benchmark-suite revision. Different suite revisions remain separate even for
the same NeqSim version pair.
Standalone benchmark runs save their reports without changing `summary.md`.
Their `comparison.json` sets `include_in_history` to `false`, so later history
rebuilds also exclude them. Deduplicating history does not delete per-run reports.

## Benchmark Suite Identity
Each run captures a revision such as `B12-4fb8a37f291c` before Maven runs, so build
failures still retain the suite identity. The number counts benchmark-changing
commits on the measured commit's first-parent history. The hash covers file paths
and contents in `src/main/java`, `src/main/resources`, and the measurement runner
[run-benchmark-timings.sh](../.github/scripts/run-benchmark-timings.sh).
Uncommitted changes use the next number and a distinct content hash.

The archived `benchmark-revision.json` contains file hashes, the source commit,
and added/modified/deleted file lists relative to the previous suite revision.
These changes appear as a table in `comparison.md`; the history has a **Benchmark
Revision** column. POM-only NeqSim updates and result files are excluded. Old
reports show `not recorded`, not an inferred revision. A change in suite revision
means historical timing changes cannot be attributed to NeqSim alone.

Versions are read from the resolved NeqSim dependency JAR's embedded Maven
`pom.properties` before compilation. This identity survives a failed build and
is retained in `baseline-artifact.json` and `current-artifact.json`. Reports
show requested and actual JAR versions separately. If dependency resolution
fails, the known requested version is labelled `(requested)` in the history;
it is not presented as a verified JAR version. Version-selection failures that
occur before any build do not create `unknown` benchmark records.

The dependency updater includes the result directory and updated POM in the same
PR, so they are merged together. Maven failures do not block the PR: each build's
status and exit code are included in comparison tables, JSON, and the cumulative
summary. Full Maven output is retained in the transcript, and failed variants
have no JMH timings. Such comparisons are incomplete and have no overall gain.
Release creation still requires complete committed results and an exact match between the measured POM snapshot
and the release commit's POM.

Each comparison writes one directory per release, baseline, and run:

```text
releases/neqsim-<release>/from-<baseline>/run-<id>-<attempt>/
  comparison.md
  comparison.json
  benchmark-revision.json
  pom.xml
  transcript.md
  baseline-benchmarks.json
  current-benchmarks.json
  baseline-artifact.json
  current-artifact.json
```

`comparison.md` contains a table of every matched benchmark/parameter case,
including baseline and release timing, percentage change, and confidence-interval
overlap. Negative timing change means faster; positive overall gain in the
history table means faster.

`transcript.md` preserves the Java/Maven and runner environment, complete build
and JMH standard output/error in fenced code blocks, benchmark discovery, and the run summary. Missing
stages are labelled. Raw JMH JSON files are included when they were produced;
`comparison.json` records provenance and rebuilds the cumulative summary.
`pom.xml` is the exact project POM used for the current-version measurements.

Each run is preserved separately, including failures and retries. No benchmark
measurements are invented or recorded until a workflow produces them. No JARs
or GitHub Actions artifacts are stored here.

## Compatibility investigations

The [full TEG compatibility investigation](compatibility/teg-process.json)
records the corrected historical workload's source hashes, resolved JAR
identities, focused-test results, and reproduction commands. It is not a
release timing comparison and does not add a row to the timing history.
The safe TEG baseline is 3.2.1: the original 3.1.0 JAR passes, but published
numeric versions 3.1.2 through 3.2.0 have an EJML linkage failure on this path.