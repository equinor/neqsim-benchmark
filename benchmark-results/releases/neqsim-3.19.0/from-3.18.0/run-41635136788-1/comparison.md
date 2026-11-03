# NeqSim 3.19.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.18.0 |
| Current | 3.19.0 |
| Source commit | `066932028e8d81729f740f8985ceabde73a2dcfc` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41635136788) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.18.0 | 3.18.0 | embedded Maven pom.properties |
| current | 3.19.0 | 3.19.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.18.0 -> 3.19.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 3 lower, 20 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 12.5054 | 13.394 | +7.11% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.897713 | 0.967729 | +7.80% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.1858 | 4.71549 | +12.65% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 4.19597 | 4.97824 | +18.64% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 7.78946 | 8.74913 | +12.32% | Overlapping CIs |
| flash.TPflash.testFlash | 282.002 | 311.097 | +10.32% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 361.755 | 374.85 | +3.62% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 316.219 | 324.703 | +2.68% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 739.739 | 761.6 | +2.96% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 4.6941 | 4.81842 | +2.65% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.06556 | 0.066617 | +1.61% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.341244 | 0.347152 | +1.73% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 0.879676 | 0.89745 | +2.02% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 17.4877 | 19.7835 | +13.13% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 47502.7 | 49022.4 | +3.20% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 4879 | 12169.5 | +149.43% | Separate CIs |
| process.TEGprocess.testTEGprocess | 5498.19 | 5733.28 | +4.28% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 34.5589 | 35.6243 | +3.08% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.00020959 | 0.000208071 | -0.73% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 42.3141 | 35.1946 | -16.83% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 10.6926 | 10.3376 | -3.32% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 7.84456 | 7.96058 | +1.48% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 14.9247 | 16.3852 | +9.79% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
