# NeqSim Benchmark Timing History

Positive gain means lower average time per operation. Overall gain is the
geometric-mean time reduction across matched benchmark/parameter cases.
Incomplete runs have no overall gain. Hosted-runner timings are indicative;
compare matching benchmark sets and inspect confidence intervals in comparison.md.
Versions come from embedded dependency JAR metadata when available; (requested) means the JAR could not be inspected.

Benchmark suite revisions identify source and measurement-runner changes; do not attribute cross-revision timing changes to NeqSim alone.

| Release | Baseline | Benchmark Revision | Maven Builds | Cases | Lower / Higher | Overall Gain | Status | Report |
| --- | --- | --- | --- | ---: | ---: | ---: | --- | --- |
| 3.1.5 | 3.1.4 | B10-ad6d45cc8250 | baseline: passed (exit 0); current: passed (exit 0) | 15 | 6 / 9 | -1.82% | complete | [View results](releases/neqsim-3.1.5/from-3.1.4/run-39498168676-1/comparison.md) |
| 3.1.4 | 3.1.3 | B10-ad6d45cc8250 | baseline: passed (exit 0); current: passed (exit 0) | 15 | 7 / 8 | -1.28% | complete | [View results](releases/neqsim-3.1.4/from-3.1.3/run-39431448204-1/comparison.md) |
| 3.1.3 | 3.1.2 | B10-ad6d45cc8250 | baseline: passed (exit 0); current: passed (exit 0) | 15 | 8 / 7 | +0.92% | complete | [View results](releases/neqsim-3.1.3/from-3.1.2/run-39426381829-1/comparison.md) |
| 3.1.2 | 3.1.0 | B9-622f61efe4c9 | baseline: passed (exit 0); current: failed (exit 1) | 0 | 0 / 0 | n/a | incomplete | [View results](releases/neqsim-3.1.2/from-3.1.0/run-39346231884-1/comparison.md) |
| 3.7.0 | 3.6.1 | B7-732030da1a1d | baseline: failed (exit 1); current: failed (exit 1) | 0 | 0 / 0 | n/a | incomplete | [View results](releases/neqsim-3.7.0/from-3.6.1/run-39341389204-1/comparison.md) |
| 3.6.1 | 3.6.0 | B7-732030da1a1d | baseline: failed (exit 1); current: failed (exit 1) | 0 | 0 / 0 | n/a | incomplete | [View results](releases/neqsim-3.6.1/from-3.6.0/run-39338287369-1/comparison.md) |
| 3.6.0 | 3.5.0 | B7-732030da1a1d | baseline: failed (exit 1); current: failed (exit 1) | 0 | 0 / 0 | n/a | incomplete | [View results](releases/neqsim-3.6.0/from-3.5.0/run-39335521295-1/comparison.md) |
