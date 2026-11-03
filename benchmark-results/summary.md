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
| 2026-10-28 | 3.19.0 | 3.18.0 | B14-87c78035e6f4 | first recorded suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 11 / 12 | -4.10% | complete | [View results](releases/neqsim-3.19.0/from-3.18.0/run-41401550594-1/comparison.md) |
| 2026-10-28 | 3.18.0 | 3.17.0 | B14-87c78035e6f4 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 15 / 8 | +1.28% | complete | [View results](releases/neqsim-3.18.0/from-3.17.0/run-41029885485-1/comparison.md) |
| 2026-10-28 | 3.17.0 | 3.16.0 | B14-87c78035e6f4 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 12 / 11 | -0.50% | complete | [View results](releases/neqsim-3.17.0/from-3.16.0/run-40838248606-1/comparison.md) |
| 2026-10-28 | 3.16.0 | 3.15.0 | B14-87c78035e6f4 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 10 / 13 | -1.23% | complete | [View results](releases/neqsim-3.16.0/from-3.15.0/run-40801329884-1/comparison.md) |
| 2026-10-28 | 3.15.0 | 3.14.0 | B14-87c78035e6f4 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 19 / 4 | +4.82% | complete | [View results](releases/neqsim-3.15.0/from-3.14.0/run-40778266407-1/comparison.md) |
| 2026-10-28 | 3.14.0 | 3.13.0 | B14-87c78035e6f4 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 16 / 7 | +2.09% | complete | [View results](releases/neqsim-3.14.0/from-3.13.0/run-40731359595-1/comparison.md) |
| 2026-10-22 | 3.13.0 | 3.12.1 | B13-b048238496c5 | changed; not directly comparable | baseline: failed (exit 1); current: failed (exit 1) | 0 | 0 / 0 | n/a | incomplete | [View results](releases/neqsim-3.13.0/from-3.12.1/run-40283428169-1/comparison.md) |
| 2026-10-22 | 3.12.1 | 3.10.0 | B13-b048238496c5 | same suite | baseline: passed (exit 0); current: failed (exit 1) | 0 | 0 / 0 | n/a | incomplete | [View results](releases/neqsim-3.12.1/from-3.10.0/run-40187284828-1/comparison.md) |
| 2026-10-22 | 3.10.0 | 3.9.1 | B13-b048238496c5 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 15 / 8 | +43.64% | complete | [View results](releases/neqsim-3.10.0/from-3.9.1/run-40129456005-1/comparison.md) |
| 2026-10-22 | 3.9.1 | 3.9.0 | B13-b048238496c5 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 10 / 13 | -2.87% | complete | [View results](releases/neqsim-3.9.1/from-3.9.0/run-40076764974-1/comparison.md) |
| 2026-10-22 | 3.9.0 | 3.8.2 | B13-b048238496c5 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 10 / 13 | -3.12% | complete | [View results](releases/neqsim-3.9.0/from-3.8.2/run-40025861313-1/comparison.md) |
| 2026-10-22 | 3.8.2 | 3.8.0 | B13-b048238496c5 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 13 / 10 | +1.80% | complete | [View results](releases/neqsim-3.8.2/from-3.8.0/run-39915467634-1/comparison.md) |
| 2026-10-22 | 3.8.0 | 3.7.0 | B13-b048238496c5 | same suite | baseline: passed (exit 0); current: passed (exit 0) | 23 | 16 / 7 | +7.81% | complete | [View results](releases/neqsim-3.8.0/from-3.7.0/run-39852251284-1/comparison.md) |
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
