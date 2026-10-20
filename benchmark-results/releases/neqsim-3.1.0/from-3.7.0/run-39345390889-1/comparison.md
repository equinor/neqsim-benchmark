# NeqSim 3.1.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.7.0 |
| Current | 3.1.0 |
| Source commit | `23e536749b31f76db78dd1debd712faf8db50af5` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39345390889) |
| Status | complete |

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
| baseline | 3.7.0 | 3.7.0 | embedded Maven pom.properties |
| current | 3.1.0 | 3.1.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.7.0 -> 3.1.0**, using identical benchmark sources.
Benchmark suite revision: `B8-8db61c824b1d`
23 benchmark/parameter cases: 20 lower, 3 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 21.8215 | 20.9661 | -3.92% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashCpaGasWaterMeg | 491.508 | 362.972 | -26.15% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.914266 | 0.428398 | -53.14% | Separate CIs |
| flash.FlashBenchmark.tpFlashReactiveElectrolyte | 5964.32 | 609.925 | -89.77% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.03913 | 4.21655 | -16.32% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 4.86241 | 4.24276 | -12.74% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 8.12911 | 7.61115 | -6.37% | Overlapping CIs |
| flash.FlashBenchmark.tpMultiPhaseFlashGasOilWater | 44.2732 | 27.9668 | -36.83% | Separate CIs |
| flash.TPflash.testFlash | 309.53 | 314.936 | +1.75% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 559.647 | 529.38 | -5.41% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 306.061 | 294.361 | -3.82% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 695.657 | 59.7 | -91.42% | Separate CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 561.853 | 560.234 | -0.29% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 461.725 | 460.749 | -0.21% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 17.7486 | 12.9162 | -27.23% | Overlapping CIs |
| process.ReactorAndNetworkBenchmark.gibbsReactorWaterGasShift | 4.75078 | 4.95864 | +4.38% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 14667.3 | 8441.49 | -42.45% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000203532 | 0.000197052 | -3.18% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 48.8465 | 46.9048 | -3.98% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.hydrateFormationTemperatureCpa | 323.515 | 1989.86 | +515.07% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.419172 | 0.380023 | -9.34% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.09291 | 8.06808 | -11.27% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 19.6879 | 2.36062 | -88.01% | Separate CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
