# NeqSim 3.1.4 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.1.3 |
| Current | 3.1.4 |
| Source commit | `0ad03097adf8cb470dee9e9b20ea3f0cd67fa9d9` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39330645302) |
| Status | incomplete |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.1.3 | 3.1.3 | embedded Maven pom.properties |
| current | 3.1.4 | 3.1.4 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | failed | 1 |
| current | failed | 1 |

## Benchmark Timing Comparison

NeqSim **3.1.3 -> 3.1.4**, using identical benchmark sources.
0 benchmark/parameter cases: 0 lower, 0 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

Incomplete run; no overall gain is reported. Check the transcript.
baseline Maven build failed (exit 1)
current Maven build failed (exit 1)
baseline-benchmarks.json: [Errno 2] No such file or directory: '/home/runner/work/_temp/baseline-benchmarks.json'
current-benchmarks.json: [Errno 2] No such file or directory: '/home/runner/work/_temp/current-benchmarks.json'
