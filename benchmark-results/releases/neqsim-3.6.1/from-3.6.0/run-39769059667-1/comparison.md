# NeqSim 3.6.1 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.6.0 |
| Current | 3.6.1 |
| Source commit | `efa4bf24017ca9c3a8620aa44733ccc397662d54` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39769059667) |
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
| baseline | 3.6.0 | 3.6.0 | embedded Maven pom.properties |
| current | 3.6.1 | 3.6.1 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.6.0 -> 3.6.1**, using identical benchmark sources.
Benchmark suite revision: `B13-b048238496c5`
23 benchmark/parameter cases: 10 lower, 13 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 21.0203 | 20.8681 | -0.72% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.580758 | 0.912122 | +57.06% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.19817 | 4.84254 | -6.84% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 5.04465 | 4.90351 | -2.80% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 8.48934 | 8.04577 | -5.22% | Overlapping CIs |
| flash.TPflash.testFlash | 315.483 | 300.27 | -4.82% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 554.907 | 544.767 | -1.83% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 292.596 | 296.163 | +1.22% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 689.347 | 691.232 | +0.27% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 8.89539 | 8.95912 | +0.72% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.104447 | 0.104983 | +0.51% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 561.687 | 558.204 | -0.62% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 461.262 | 458.491 | -0.60% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 15.1579 | 16.1408 | +6.48% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 26105.4 | 24859.8 | -4.77% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 4472.18 | 4811.66 | +7.59% | Separate CIs |
| process.TEGprocess.testTEGprocess | 13624.1 | 13941.1 | +2.33% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 35.5526 | 36.0562 | +1.42% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000198974 | 0.000197299 | -0.84% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 45.8808 | 48.1273 | +4.90% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.442231 | 0.448551 | +1.43% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 7.77822 | 8.31088 | +6.85% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 19.9664 | 20.1977 | +1.16% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
