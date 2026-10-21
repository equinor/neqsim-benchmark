# NeqSim 3.1.5 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.1.4 |
| Current | 3.1.5 |
| Source commit | `48f7fbf5b63c75e44324e5bbf5018cfaf5147607` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39574539548) |
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
| baseline | 3.1.4 | 3.1.4 | embedded Maven pom.properties |
| current | 3.1.5 | 3.1.5 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.1.4 -> 3.1.5**, using identical benchmark sources.
Benchmark suite revision: `B10-ad6d45cc8250`
15 benchmark/parameter cases: 8 lower, 7 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 36.2817 | 36.4437 | +0.45% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.752541 | 0.782745 | +4.01% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.67808 | 7.66695 | -0.14% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.60102 | 7.66986 | +0.91% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.3659 | 13.198 | -1.26% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 522.135 | 523.001 | +0.17% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 145.781 | 142.991 | -1.91% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 563.068 | 562.422 | -0.11% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 463.621 | 463.155 | -0.10% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 34.4909 | 35.9523 | +4.24% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000350829 | 0.000365359 | +4.14% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 83.2948 | 79.3525 | -4.73% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.680556 | 0.679279 | -0.19% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 15.1136 | 14.9043 | -1.38% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 36.2341 | 36.4558 | +0.61% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
