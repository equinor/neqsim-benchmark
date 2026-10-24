# NeqSim 3.9.1 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.9.0 |
| Current | 3.9.1 |
| Source commit | `b5fc82b0db80cb758fb2d8ef2742fe2875c14343` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40125256053) |
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
| baseline | 3.9.0 | 3.9.0 | embedded Maven pom.properties |
| current | 3.9.1 | 3.9.1 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.9.0 -> 3.9.1**, using identical benchmark sources.
Benchmark suite revision: `B13-b048238496c5`
23 benchmark/parameter cases: 15 lower, 8 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 13.0943 | 12.8909 | -1.55% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.944738 | 0.91102 | -3.57% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.0324 | 3.85015 | -4.52% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 4.0435 | 3.86246 | -4.48% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 7.30374 | 7.40006 | +1.32% | Overlapping CIs |
| flash.TPflash.testFlash | 270.308 | 269.608 | -0.26% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 571.056 | 572.208 | +0.20% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 312.716 | 311.542 | -0.38% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 732.864 | 713.902 | -2.59% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 9.43673 | 9.81493 | +4.01% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.109801 | 0.11095 | +1.05% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 558.638 | 559.846 | +0.22% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 460.7 | 458.771 | -0.42% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 14.7216 | 16.5784 | +12.61% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 21046.7 | 22089.2 | +4.95% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 5921.85 | 5723.8 | -3.34% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 11048 | 10437.7 | -5.52% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 37.2482 | 31.2999 | -15.97% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000215828 | 0.000197666 | -8.42% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 45.0056 | 39.4723 | -12.29% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.389719 | 0.35913 | -7.85% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 7.49702 | 7.32997 | -2.23% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 17.0048 | 17.4257 | +2.47% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
