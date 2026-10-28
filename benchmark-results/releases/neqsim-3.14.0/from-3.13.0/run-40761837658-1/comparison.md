# NeqSim 3.14.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.13.0 |
| Current | 3.14.0 |
| Source commit | `96d22e87417ffd8d50c3ac664da7b75de90d5fdc` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40761837658) |
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
23 benchmark/parameter cases: 10 lower, 13 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 19.1869 | 19.4621 | +1.43% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.50603 | 1.53507 | +1.93% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 6.89182 | 7.12271 | +3.35% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.32965 | 6.7813 | +7.14% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.6741 | 13.1682 | +3.90% | Overlapping CIs |
| flash.TPflash.testFlash | 551.9 | 532.297 | -3.55% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 6064.28 | 6160.04 | +1.58% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 549.717 | 526.759 | -4.18% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1209.82 | 1250.5 | +3.36% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 8.05247 | 7.50716 | -6.77% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0985425 | 0.0996163 | +1.09% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.578978 | 0.592238 | +2.29% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.55906 | 1.5616 | +0.16% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 41.3673 | 40.6021 | -1.85% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 89094.1 | 92006.5 | +3.27% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 11797.7 | 10149.9 | -13.97% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 15221.1 | 13609.4 | -10.59% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 60.9364 | 64.3105 | +5.54% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000361648 | 0.000376293 | +4.05% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 89.5708 | 81.4537 | -9.06% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.707238 | 0.678298 | -4.09% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.9097 | 14.8591 | -0.34% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 28.4513 | 27.9912 | -1.62% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
