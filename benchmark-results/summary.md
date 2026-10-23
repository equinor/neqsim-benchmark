# NeqSim Benchmark Timing History

Positive gain means lower average time per operation. Overall gain is the
geometric-mean time reduction across matched benchmark/parameter cases.
Incomplete runs have no overall gain. Hosted-runner timings are indicative;
compare matching benchmark sets and inspect confidence intervals in comparison.md.
Release-to-release timing trends are directly comparable only while the benchmark suite revision stays the same.
Versions come from embedded dependency JAR metadata when available; (requested) means the JAR could not be inspected.

Benchmark suite revisions identify source and measurement-runner changes; do not attribute cross-revision timing changes to NeqSim alone.

| Benchmark Updated | Release | Baseline | Benchmark Revision | Suite vs previous | Maven Builds | Cases | Lower / Higher | Overall Gain | Status | Report |
| --- | --- | --- | --- | --- | --- | ---: | ---: | ---: | --- | --- |
| 2026-10-22 | 3.8.0 | 3.7.0 | B13-b048238496c5 | first recorded suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 16 / 7 | +7.81% | complete | [View results](releases/neqsim-3.8.0/from-3.7.0/run-39852251284-1/comparison.md) |
| 2026-10-22 | 3.7.0 | 3.6.1 | B13-b048238496c5 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 14 / 9 | +1.78% | complete | [View results](releases/neqsim-3.7.0/from-3.6.1/run-39776499955-1/comparison.md) |
| 2026-10-22 | 3.6.1 | 3.6.0 | B13-b048238496c5 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 10 / 13 | -1.91% | complete | [View results](releases/neqsim-3.6.1/from-3.6.0/run-39744618373-1/comparison.md) |
| 2026-10-22 | 3.6.0 | 3.5.0 | B13-b048238496c5 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 7 / 16 | -4.24% | complete | [View results](releases/neqsim-3.6.0/from-3.5.0/run-39728167128-1/comparison.md) |
| 2026-10-21 | 3.5.0 | 3.4.0 | B12-7822100cd1e0 | changed; not directly comparable | baseline: passed (exit 0); current: passed (exit 0) | 19 | 8 / 11 | +0.15% | complete | [View results](releases/neqsim-3.5.0/from-3.4.0/run-39692791144-1/comparison.md) |
| 2026-10-21 | 3.4.0 | 3.3.0 | B12-7822100cd1e0 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 19 | 12 / 7 | +1.33% | complete | [View results](releases/neqsim-3.4.0/from-3.3.0/run-39680706774-1/comparison.md) |
| 2026-10-21 | 3.3.0 | 3.2.2 | B12-7822100cd1e0 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 19 | 10 / 9 | +0.32% | complete | [View results](releases/neqsim-3.3.0/from-3.2.2/run-39674617425-1/comparison.md) |
| 2026-10-21 | 3.2.2 | 3.2.1 | B11-ebebd4f33f11 | changed; not directly comparable | baseline: passed (exit 0); current: passed (exit 0) | 18 | 9 / 9 | +1.26% | complete | [View results](releases/neqsim-3.2.2/from-3.2.1/run-39665588280-1/comparison.md) |
| 2026-10-20 | 3.2.1 | 3.2.0 | B10-ad6d45cc8250 | changed; not directly comparable | baseline: passed (exit 0); current: passed (exit 0) | 15 | 9 / 6 | +0.44% | complete | [View results](releases/neqsim-3.2.1/from-3.2.0/run-39611346005-1/comparison.md) |
| 2026-10-20 | 3.2.0 | 3.1.5 | B10-ad6d45cc8250 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 15 | 8 / 7 | -13.12% | complete | [View results](releases/neqsim-3.2.0/from-3.1.5/run-39606105753-1/comparison.md) |
| 2026-10-20 | 3.1.5 | 3.1.4 | B10-ad6d45cc8250 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 15 | 6 / 9 | -1.82% | complete | [View results](releases/neqsim-3.1.5/from-3.1.4/run-39498168676-1/comparison.md) |
| 2026-10-20 | 3.1.4 | 3.1.3 | B10-ad6d45cc8250 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 15 | 7 / 8 | -1.28% | complete | [View results](releases/neqsim-3.1.4/from-3.1.3/run-39431448204-1/comparison.md) |
| 2026-10-20 | 3.1.3 | 3.1.2 | B10-ad6d45cc8250 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 15 | 8 / 7 | +0.92% | complete | [View results](releases/neqsim-3.1.3/from-3.1.2/run-39426381829-1/comparison.md) |
| 2026-10-20 | 3.1.2 | 3.1.0 | B9-622f61efe4c9 | changed; not directly comparable | baseline: passed (exit 0); current: failed (exit 1) | 0 | 0 / 0 | n/a | incomplete | [View results](releases/neqsim-3.1.2/from-3.1.0/run-39346231884-1/comparison.md) |
| 2026-10-20 | 3.7.0 | 3.6.1 | B7-732030da1a1d | changed; not directly comparable | baseline: failed (exit 1); current: failed (exit 1) | 0 | 0 / 0 | n/a | incomplete | [View results](releases/neqsim-3.7.0/from-3.6.1/run-39341389204-1/comparison.md) |
| 2026-10-20 | 3.6.1 | 3.6.0 | B7-732030da1a1d | same suite | baseline: failed (exit 1); current: failed (exit 1) | 0 | 0 / 0 | n/a | incomplete | [View results](releases/neqsim-3.6.1/from-3.6.0/run-39338287369-1/comparison.md) |
| 2026-10-20 | 3.6.0 | 3.5.0 | B7-732030da1a1d | same suite | baseline: failed (exit 1); current: failed (exit 1) | 0 | 0 / 0 | n/a | incomplete | [View results](releases/neqsim-3.6.0/from-3.5.0/run-39335521295-1/comparison.md) |
