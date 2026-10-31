# NeqSim 3.18.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.17.0 |
| Current | 3.18.0 |
| Source commit | `1c81001b6611476c297a067119fc9e41c106c07b` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41029885485) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.17.0 | 3.17.0 | embedded Maven pom.properties |
| current | 3.18.0 | 3.18.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.17.0 -> 3.18.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 15 lower, 8 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 21.0369 | 21.1372 | +0.48% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.55267 | 1.55975 | +0.46% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.17446 | 7.5023 | +4.57% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.23355 | 7.26424 | +0.42% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.3694 | 13.5663 | +1.47% | Overlapping CIs |
| flash.TPflash.testFlash | 590.104 | 493.53 | -16.37% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 6102.23 | 668.823 | -89.04% | Separate CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 526.219 | 524.566 | -0.31% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1215.89 | 1214.12 | -0.15% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 8.0069 | 7.93922 | -0.85% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.104099 | 0.102195 | -1.83% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.608637 | 0.597116 | -1.89% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.58355 | 1.57401 | -0.60% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 37.4613 | 37.1175 | -0.92% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 87272.1 | 84191.9 | -3.53% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 13355.9 | 9218 | -30.98% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 17169.2 | 9303.18 | -45.81% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 61.1742 | 60.1373 | -1.70% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.00035753 | 0.000363123 | +1.56% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 74.0662 | 74.4299 | +0.49% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.680937 | 18.9163 | +2677.98% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 15.8552 | 14.2782 | -9.95% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 32.7861 | 29.1615 | -11.06% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
