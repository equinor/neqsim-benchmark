# NeqSim 3.19.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.18.0 |
| Current | 3.19.0 |
| Source commit | `86a114c6ac4ee9a08249f688499dbe0b3c7fff28` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41401550594) |
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
23 benchmark/parameter cases: 11 lower, 12 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 21.7162 | 21.4136 | -1.39% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.64612 | 1.70798 | +3.76% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.72316 | 8.44937 | +9.40% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.65035 | 8.62742 | +12.77% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 14.4094 | 16.0994 | +11.73% | Overlapping CIs |
| flash.TPflash.testFlash | 632.235 | 547.771 | -13.36% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 920.315 | 942.998 | +2.46% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 547.601 | 528.616 | -3.47% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1217.96 | 1217.28 | -0.06% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 8.17267 | 7.72359 | -5.49% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.103603 | 0.108803 | +5.02% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.600332 | 0.581484 | -3.14% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.61532 | 1.69517 | +4.94% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 47.609 | 42.9603 | -9.76% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 84810 | 87989.1 | +3.75% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 9078.21 | 24601.9 | +171.00% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 8859.06 | 9001.25 | +1.61% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 61.1208 | 60.8816 | -0.39% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000369725 | 0.000360704 | -2.44% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 81.1486 | 68.3632 | -15.76% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 19.4558 | 19.5422 | +0.44% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 16.2665 | 14.6101 | -10.18% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 32.1714 | 34.9145 | +8.53% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
