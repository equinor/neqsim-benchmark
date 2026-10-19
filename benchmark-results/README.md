# Benchmark Results

[summary.md](summary.md) keeps a cumulative Markdown table of release comparisons.
Positive overall gain means a reduction in average time per operation, computed
as the geometric mean of the current/baseline timing ratios. Compare runs with
the same benchmark cases; incomplete runs have no reported overall gain.

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
  pom.xml
  transcript.md
  baseline-benchmarks.json
  current-benchmarks.json
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