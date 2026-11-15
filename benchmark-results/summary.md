# NeqSim Benchmark Timing History

Positive gain means lower average time per operation. Overall gain is the
geometric-mean time reduction across matched benchmark/parameter cases.
Incomplete runs have no overall gain. Hosted-runner timings are indicative;
compare matching benchmark sets and inspect confidence intervals in comparison.md.
Timing trends are directly comparable only between rows with matching benchmark revisions.
Versions come from embedded dependency JAR metadata when available; (requested) means the JAR could not be inspected.

Benchmark suite revisions identify source and measurement-runner changes; do not attribute cross-revision timing changes to NeqSim alone.

Significant counts cases whose 99.9% confidence intervals do not overlap. Correctness lists
JUnit result checks that fail on the release but pass on the baseline.

| Benchmark Updated | Release | Baseline | Benchmark Revision | Cases | Lower / Higher | Significant Faster / Slower | Overall Gain | Correctness | Status | Report |
| --- | --- | --- | --- | ---: | ---: | ---: | ---: | --- | --- | --- |
| 2026-11-14 | 3.28.0 | 3.27.0 | B15-c61b46 | 30 | 11 / 19 | 0 / 0 | +1.03% | passed | complete | [View results](releases/neqsim-3.28.0/from-3.27.0/run-43646179849-1/comparison.md) |
| 2026-10-28 | 3.27.0 | 3.26.0 | B14-87c780 | 0 | 0 / 0 | not recorded | n/a | not recorded | incomplete (baseline: passed; current: failed) | [View results](releases/neqsim-3.27.0/from-3.26.0/run-43469789898-1/comparison.md) |
| 2026-10-28 | 3.26.0 | 3.25.0 | B14-87c780 | 23 | 8 / 15 | not recorded | +1.26% | not recorded | complete | [View results](releases/neqsim-3.26.0/from-3.25.0/run-43438092272-1/comparison.md) |
| 2026-10-28 | 3.25.0 | 3.23.0 | B14-87c780 | 23 | 11 / 12 | not recorded | +1.88% | not recorded | complete | [View results](releases/neqsim-3.25.0/from-3.23.0/run-43408114341-1/comparison.md) |
| 2026-10-28 | 3.23.0 | 3.22.0 | B14-87c780 | 23 | 14 / 9 | not recorded | -8.30% | not recorded | complete | [View results](releases/neqsim-3.23.0/from-3.22.0/run-43237211294-1/comparison.md) |
| 2026-10-28 | 3.22.0 | 3.21.0 | B14-87c780 | 23 | 14 / 9 | not recorded | +1.73% | not recorded | complete | [View results](releases/neqsim-3.22.0/from-3.21.0/run-43099530213-1/comparison.md) |
| 2026-10-28 | 3.21.0 | 3.20.0 | B14-87c780 | 23 | 12 / 11 | not recorded | -2.42% | not recorded | complete | [View results](releases/neqsim-3.21.0/from-3.20.0/run-42574721125-1/comparison.md) |
| 2026-10-28 | 3.20.0 | 3.19.0 | B14-87c780 | 23 | 12 / 11 | not recorded | +0.66% | not recorded | complete | [View results](releases/neqsim-3.20.0/from-3.19.0/run-41643633307-1/comparison.md) |
| 2026-10-28 | 3.19.0 | 3.18.0 | B14-87c780 | 23 | 11 / 12 | not recorded | -4.10% | not recorded | complete | [View results](releases/neqsim-3.19.0/from-3.18.0/run-41401550594-1/comparison.md) |
| 2026-10-28 | 3.18.0 | 3.17.0 | B14-87c780 | 23 | 15 / 8 | not recorded | +1.28% | not recorded | complete | [View results](releases/neqsim-3.18.0/from-3.17.0/run-41029885485-1/comparison.md) |
| 2026-10-28 | 3.17.0 | 3.16.0 | B14-87c780 | 23 | 12 / 11 | not recorded | -0.50% | not recorded | complete | [View results](releases/neqsim-3.17.0/from-3.16.0/run-40838248606-1/comparison.md) |
| 2026-10-28 | 3.16.0 | 3.15.0 | B14-87c780 | 23 | 10 / 13 | not recorded | -1.23% | not recorded | complete | [View results](releases/neqsim-3.16.0/from-3.15.0/run-40801329884-1/comparison.md) |
| 2026-10-28 | 3.15.0 | 3.14.0 | B14-87c780 | 23 | 19 / 4 | not recorded | +4.82% | not recorded | complete | [View results](releases/neqsim-3.15.0/from-3.14.0/run-40778266407-1/comparison.md) |
| 2026-10-28 | 3.14.0 | 3.13.0 | B14-87c780 | 23 | 16 / 7 | not recorded | +2.09% | not recorded | complete | [View results](releases/neqsim-3.14.0/from-3.13.0/run-40731359595-1/comparison.md) |
| 2026-10-22 | 3.13.0 | 3.12.1 | B13-b04823 | 0 | 0 / 0 | not recorded | n/a | not recorded | incomplete (baseline: failed; current: failed) | [View results](releases/neqsim-3.13.0/from-3.12.1/run-40283428169-1/comparison.md) |
| 2026-10-22 | 3.12.1 | 3.10.0 | B13-b04823 | 0 | 0 / 0 | not recorded | n/a | not recorded | incomplete (baseline: passed; current: failed) | [View results](releases/neqsim-3.12.1/from-3.10.0/run-40187284828-1/comparison.md) |
| 2026-10-22 | 3.10.0 | 3.9.1 | B13-b04823 | 23 | 15 / 8 | not recorded | +43.64% | not recorded | complete | [View results](releases/neqsim-3.10.0/from-3.9.1/run-40129456005-1/comparison.md) |
| 2026-10-22 | 3.9.1 | 3.9.0 | B13-b04823 | 23 | 10 / 13 | not recorded | -2.87% | not recorded | complete | [View results](releases/neqsim-3.9.1/from-3.9.0/run-40076764974-1/comparison.md) |
| 2026-10-22 | 3.9.0 | 3.8.2 | B13-b04823 | 23 | 10 / 13 | not recorded | -3.12% | not recorded | complete | [View results](releases/neqsim-3.9.0/from-3.8.2/run-40025861313-1/comparison.md) |
| 2026-10-22 | 3.8.2 | 3.8.0 | B13-b04823 | 23 | 13 / 10 | not recorded | +1.80% | not recorded | complete | [View results](releases/neqsim-3.8.2/from-3.8.0/run-39915467634-1/comparison.md) |
| 2026-10-22 | 3.8.0 | 3.7.0 | B13-b04823 | 23 | 16 / 7 | not recorded | +7.81% | not recorded | complete | [View results](releases/neqsim-3.8.0/from-3.7.0/run-39852251284-1/comparison.md) |
| 2026-10-22 | 3.7.0 | 3.6.1 | B13-b04823 | 23 | 14 / 9 | not recorded | +1.78% | not recorded | complete | [View results](releases/neqsim-3.7.0/from-3.6.1/run-39776499955-1/comparison.md) |
| 2026-10-22 | 3.6.1 | 3.6.0 | B13-b04823 | 23 | 10 / 13 | not recorded | -1.91% | not recorded | complete | [View results](releases/neqsim-3.6.1/from-3.6.0/run-39744618373-1/comparison.md) |
| 2026-10-22 | 3.6.0 | 3.5.0 | B13-b04823 | 23 | 7 / 16 | not recorded | -4.24% | not recorded | complete | [View results](releases/neqsim-3.6.0/from-3.5.0/run-39728167128-1/comparison.md) |
| 2026-10-21 | 3.5.0 | 3.4.0 | B12-782210 | 19 | 8 / 11 | not recorded | +0.15% | not recorded | complete | [View results](releases/neqsim-3.5.0/from-3.4.0/run-39692791144-1/comparison.md) |
| 2026-10-21 | 3.4.0 | 3.3.0 | B12-782210 | 19 | 12 / 7 | not recorded | +1.33% | not recorded | complete | [View results](releases/neqsim-3.4.0/from-3.3.0/run-39680706774-1/comparison.md) |
| 2026-10-21 | 3.3.0 | 3.2.2 | B12-782210 | 19 | 10 / 9 | not recorded | +0.32% | not recorded | complete | [View results](releases/neqsim-3.3.0/from-3.2.2/run-39674617425-1/comparison.md) |
| 2026-10-21 | 3.2.2 | 3.2.1 | B11-ebebd4 | 18 | 9 / 9 | not recorded | +1.26% | not recorded | complete | [View results](releases/neqsim-3.2.2/from-3.2.1/run-39665588280-1/comparison.md) |
| 2026-10-20 | 3.2.1 | 3.2.0 | B10-ad6d45 | 15 | 9 / 6 | not recorded | +0.44% | not recorded | complete | [View results](releases/neqsim-3.2.1/from-3.2.0/run-39611346005-1/comparison.md) |
| 2026-10-20 | 3.2.0 | 3.1.5 | B10-ad6d45 | 15 | 8 / 7 | not recorded | -13.12% | not recorded | complete | [View results](releases/neqsim-3.2.0/from-3.1.5/run-39606105753-1/comparison.md) |
| 2026-10-20 | 3.1.5 | 3.1.4 | B10-ad6d45 | 15 | 6 / 9 | not recorded | -1.82% | not recorded | complete | [View results](releases/neqsim-3.1.5/from-3.1.4/run-39498168676-1/comparison.md) |
| 2026-10-20 | 3.1.4 | 3.1.3 | B10-ad6d45 | 15 | 7 / 8 | not recorded | -1.28% | not recorded | complete | [View results](releases/neqsim-3.1.4/from-3.1.3/run-39431448204-1/comparison.md) |
| 2026-10-20 | 3.1.3 | 3.1.2 | B10-ad6d45 | 15 | 8 / 7 | not recorded | +0.92% | not recorded | complete | [View results](releases/neqsim-3.1.3/from-3.1.2/run-39426381829-1/comparison.md) |
