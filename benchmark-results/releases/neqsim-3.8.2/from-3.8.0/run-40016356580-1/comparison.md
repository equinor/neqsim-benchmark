# NeqSim 3.8.2 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.8.0 |
| Current | 3.8.2 |
| Source commit | `47eef65fcdb56dfbf7e44307a4e37e8a9072488c` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40016356580) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B13-b048238496c5`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| added | `src/main/java/com/equinor/neqsim/benchmark/process/LargeProcessModelBenchmark.java` |
| added | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.8.0 | 3.8.0 | embedded Maven pom.properties |
| current | 3.8.2 | 3.8.2 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.8.0 -> 3.8.2**, using identical benchmark sources.
Benchmark suite revision: `B13-b048238496c5`
23 benchmark/parameter cases: 15 lower, 8 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 22.776 | 20.441 | -10.25% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.4476 | 1.49508 | +3.28% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.24514 | 6.63811 | -8.38% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.93857 | 6.60131 | -4.86% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.9531 | 12.9035 | -0.38% | Overlapping CIs |
| flash.TPflash.testFlash | 551.686 | 527.239 | -4.43% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1136.38 | 1057.13 | -6.97% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 522.294 | 517.066 | -1.00% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1184.14 | 1189.18 | +0.43% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 14.4642 | 15.5567 | +7.55% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.172917 | 0.172496 | -0.24% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 566.436 | 565.962 | -0.08% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 467.487 | 468.273 | +0.17% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 38.0172 | 41.0258 | +7.91% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 33052.2 | 37854 | +14.53% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 6199.68 | 5873.32 | -5.26% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 20150 | 17602.3 | -12.64% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 64.5179 | 64.1194 | -0.62% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000365749 | 0.000361226 | -1.24% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 74.7916 | 76.9422 | +2.88% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.701554 | 0.721842 | +2.89% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.2184 | 14.0203 | -1.39% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 31.6915 | 29.4992 | -6.92% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
