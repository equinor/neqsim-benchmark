# NeqSim 3.15.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.14.0 |
| Current | 3.15.0 |
| Source commit | `1bb527eda8ddf9193b2b05dd7e777966c06f8e06` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40789848916) |
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
23 benchmark/parameter cases: 17 lower, 6 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 18.0701 | 18.0467 | -0.13% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.63655 | 1.50158 | -8.25% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 6.31821 | 6.2693 | -0.77% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.14119 | 6.27568 | +2.19% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.3469 | 12.2583 | -0.72% | Overlapping CIs |
| flash.TPflash.testFlash | 517.022 | 511.873 | -1.00% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 5952.95 | 6023.86 | +1.19% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 522.739 | 514.586 | -1.56% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1182.62 | 1180.42 | -0.19% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 9.48118 | 9.33303 | -1.56% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.132611 | 0.132754 | +0.11% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.633498 | 0.616382 | -2.70% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.6733 | 1.63495 | -2.29% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 44.267 | 40.3409 | -8.87% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 80187.6 | 83404.2 | +4.01% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 9593.54 | 9212.5 | -3.97% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 13860.3 | 12468.2 | -10.04% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 66.934 | 69.0908 | +3.22% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000408094 | 0.000407798 | -0.07% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 77.4907 | 75.8675 | -2.09% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.692888 | 0.702932 | +1.45% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.3611 | 13.6093 | -5.24% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 25.9324 | 22.8006 | -12.08% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
