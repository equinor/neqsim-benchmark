# NeqSim 3.15.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.14.0 |
| Current | 3.15.0 |
| Source commit | `61f718b07d150d4174cbd8b72f324c3c22431492` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40778266407) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.14.0 | 3.14.0 | embedded Maven pom.properties |
| current | 3.15.0 | 3.15.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.14.0 -> 3.15.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 19 lower, 4 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 12.2881 | 11.6543 | -5.16% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.09983 | 1.07618 | -2.15% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.23787 | 4.06825 | -4.00% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 4.21312 | 4.20306 | -0.24% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 7.92874 | 7.53364 | -4.98% | Overlapping CIs |
| flash.TPflash.testFlash | 320.039 | 304.709 | -4.79% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 4003.63 | 4044.9 | +1.03% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 354.087 | 351.766 | -0.66% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 806.848 | 784.726 | -2.74% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.72447 | 6.7851 | +0.90% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0907042 | 0.0859418 | -5.25% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.613898 | 0.613195 | -0.11% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.4645 | 1.41437 | -3.42% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 25.2434 | 22.5788 | -10.56% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 54227.2 | 54260.3 | +0.06% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 6409.75 | 6105.38 | -4.75% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 9740 | 8485.07 | -12.88% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 43.7948 | 38.9239 | -11.12% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000225072 | 0.000230728 | +2.51% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 58.0968 | 51.2591 | -11.77% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.45824 | 0.436783 | -4.68% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.56492 | 9.39941 | -1.73% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 20.1253 | 15.9477 | -20.76% | Separate CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
