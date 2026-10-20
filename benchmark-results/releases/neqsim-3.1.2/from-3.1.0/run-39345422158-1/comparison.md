# NeqSim 3.1.2 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.1.0 |
| Current | 3.1.2 |
| Source commit | `23e536749b31f76db78dd1debd712faf8db50af5` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39345422158) |
| Status | incomplete |

## Benchmark Suite Changes

Suite revision: `B8-8db61c824b1d`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/flash/FlashBenchmark.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/TEGprocess.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/thermo/PhaseEnvelopeBenchmark.java` |
| deleted | `src/main/java/com/equinor/neqsim/benchmark/process/DistillationSolverBenchmark.java` |
| deleted | `src/main/java/com/equinor/neqsim/benchmark/process/LargeProcessModelBenchmark.java` |
| deleted | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.1.0 | 3.1.0 | embedded Maven pom.properties |
| current | 3.1.2 | 3.1.2 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | failed | 1 |
| current | failed | 1 |

## Benchmark Timing Comparison

NeqSim **3.1.0 -> 3.1.2**, using identical benchmark sources.
Benchmark suite revision: `B8-8db61c824b1d`
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
