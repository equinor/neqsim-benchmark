# NeqSim 3.14.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.13.0 |
| Current | 3.14.0 |
| Source commit | `e89337a165292727a5c9cf8ad739c5e8f063d834` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40731359595) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.13.0 | 3.13.0 | embedded Maven pom.properties |
| current | 3.14.0 | 3.14.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.13.0 -> 3.14.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 16 lower, 7 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 11.5912 | 11.6915 | +0.86% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.931331 | 0.893427 | -4.07% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 3.96903 | 4.10935 | +3.54% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 3.96416 | 3.95946 | -0.12% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 7.45923 | 7.43895 | -0.27% | Overlapping CIs |
| flash.TPflash.testFlash | 311.808 | 282.104 | -9.53% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 3544.11 | 3535.91 | -0.23% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 314.967 | 309.483 | -1.74% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 724.064 | 728.357 | +0.59% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 4.78292 | 4.68245 | -2.10% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0658301 | 0.0642803 | -2.35% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.342358 | 0.339672 | -0.78% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 0.885493 | 0.853863 | -3.57% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 18.7789 | 17.5523 | -6.53% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 50778.8 | 51150.3 | +0.73% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 6728.01 | 5787.27 | -13.98% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 9793.39 | 8985.09 | -8.25% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 36.9692 | 33.0039 | -10.73% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.0002149 | 0.000206674 | -3.83% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 42.8323 | 42.6499 | -0.43% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.382426 | 0.382899 | +0.12% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 7.42008 | 7.96118 | +7.29% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 16.9361 | 18.7447 | +10.68% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
