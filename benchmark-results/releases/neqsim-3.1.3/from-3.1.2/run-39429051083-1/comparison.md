# NeqSim 3.1.3 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.1.2 |
| Current | 3.1.3 |
| Source commit | `2d1d77ae0fbe9b94da7b5e535c2583e8720822d3` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39429051083) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B10-ad6d45cc8250`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/flash/FlashBenchmark.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/thermo/PhaseEnvelopeBenchmark.java` |
| deleted | `src/main/java/com/equinor/neqsim/benchmark/flash/TPflash.java` |
| deleted | `src/main/java/com/equinor/neqsim/benchmark/flash/TPflash_UMR.java` |
| deleted | `src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java` |
| deleted | `src/main/java/com/equinor/neqsim/benchmark/process/TEGprocess.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.1.2 | 3.1.2 | embedded Maven pom.properties |
| current | 3.1.3 | 3.1.3 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.1.2 -> 3.1.3**, using identical benchmark sources.
Benchmark suite revision: `B10-ad6d45cc8250`
15 benchmark/parameter cases: 8 lower, 7 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 36.4405 | 36.2274 | -0.58% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.747225 | 0.749594 | +0.32% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.65019 | 7.66693 | +0.22% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.73296 | 7.73393 | +0.01% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.2842 | 13.1213 | -1.23% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 526.636 | 532.798 | +1.17% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 136.116 | 128.449 | -5.63% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 562.448 | 562.565 | +0.02% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 462.816 | 463.274 | +0.10% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 34.6239 | 38.4321 | +11.00% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000365074 | 0.000353445 | -3.19% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 79.1073 | 78.9372 | -0.21% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.693285 | 0.676739 | -2.39% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.7962 | 14.1177 | -4.59% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 36.0796 | 31.4991 | -12.70% | Separate CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
