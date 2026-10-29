# NeqSim 3.16.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.15.0 |
| Current | 3.16.0 |
| Source commit | `3fc5c93d57416b810f13a8204c1163139a09f66f` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40801329884) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.15.0 | 3.15.0 | embedded Maven pom.properties |
| current | 3.16.0 | 3.16.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.15.0 -> 3.16.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 10 lower, 13 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 20.2179 | 19.0684 | -5.69% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.51103 | 1.44772 | -4.19% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 6.62861 | 6.55903 | -1.05% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.48952 | 6.38878 | -1.55% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.6175 | 13.1182 | +3.97% | Overlapping CIs |
| flash.TPflash.testFlash | 616.939 | 629.966 | +2.11% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 5974.73 | 6085.21 | +1.85% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 524.996 | 556.811 | +6.06% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1244.63 | 1216.14 | -2.29% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 7.60841 | 7.66808 | +0.78% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0979101 | 0.103779 | +5.99% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.582059 | 0.594802 | +2.19% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.58381 | 1.57136 | -0.79% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 37.4787 | 37.5036 | +0.07% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 91784.5 | 84359.3 | -8.09% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 10664.5 | 11464.2 | +7.50% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 12611.3 | 12408.7 | -1.61% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 60.1847 | 64.0446 | +6.41% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000366976 | 0.000369668 | +0.73% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 81.0636 | 77.5858 | -4.29% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.701252 | 0.692853 | -1.20% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.0988 | 14.6772 | +4.10% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 26.1072 | 31.5245 | +20.75% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
