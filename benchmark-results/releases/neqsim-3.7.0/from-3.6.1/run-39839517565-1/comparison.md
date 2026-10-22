# NeqSim 3.7.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.6.1 |
| Current | 3.7.0 |
| Source commit | `d05142c12445c4a7ce6f0822260a3427eee36853` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39839517565) |
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
| baseline | 3.6.1 | 3.6.1 | embedded Maven pom.properties |
| current | 3.7.0 | 3.7.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.6.1 -> 3.7.0**, using identical benchmark sources.
Benchmark suite revision: `B13-b048238496c5`
23 benchmark/parameter cases: 16 lower, 7 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 37.5814 | 37.4832 | -0.26% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.60305 | 1.57776 | -1.58% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 8.35727 | 8.39009 | +0.39% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 8.28146 | 8.22348 | -0.70% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 14.0728 | 13.8196 | -1.80% | Overlapping CIs |
| flash.TPflash.testFlash | 569.861 | 676.658 | +18.74% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1092.6 | 1019.78 | -6.67% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 523.388 | 525.902 | +0.48% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1214.17 | 1210.06 | -0.34% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 15.3645 | 15.2889 | -0.49% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.179384 | 0.179339 | -0.03% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 563.815 | 562.904 | -0.16% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 463.354 | 463.143 | -0.05% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 36.1274 | 35.2986 | -2.29% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 42092.2 | 49940.5 | +18.65% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 8347.28 | 8345 | -0.03% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 22712.8 | 23259.1 | +2.40% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 65.5846 | 63.0552 | -3.86% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.00035534 | 0.000345086 | -2.89% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 82.5072 | 85.7834 | +3.97% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.798835 | 0.749085 | -6.23% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 15.501 | 15.3081 | -1.24% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 31.4966 | 33.7335 | +7.10% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
