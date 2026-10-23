# NeqSim 3.8.2 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.8.0 |
| Current | 3.8.2 |
| Source commit | `93fd6516a6150667e67f5a3649ad6d6662b9b543` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39915467634) |
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
| baseline | 3.8.0 | 3.8.0 | embedded Maven pom.properties |
| current | 3.8.2 | 3.8.2 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.8.0 -> 3.8.2**, using identical benchmark sources.
Benchmark suite revision: `B13-b048238496c5`
23 benchmark/parameter cases: 13 lower, 10 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 22.2842 | 20.5388 | -7.83% | Separate CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.50317 | 1.48003 | -1.54% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.00592 | 6.50313 | -7.18% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.02488 | 6.50482 | -7.40% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.7694 | 12.26 | -3.99% | Overlapping CIs |
| flash.TPflash.testFlash | 530.362 | 615.715 | +16.09% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1016.36 | 1043.94 | +2.71% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 521.588 | 521.916 | +0.06% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1195.38 | 1205.61 | +0.86% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 14.8226 | 14.4741 | -2.35% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.170869 | 0.171635 | +0.45% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 565.104 | 566.007 | +0.16% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 467.249 | 467.379 | +0.03% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 38.8566 | 37.8177 | -2.67% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 33396 | 37344.6 | +11.82% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 6164.93 | 5804.55 | -5.85% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 19956.2 | 17227.6 | -13.67% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 64.3604 | 60.3837 | -6.18% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000366078 | 0.000367109 | +0.28% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 80.1824 | 79.1119 | -1.34% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.705702 | 0.677453 | -4.00% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.4783 | 14.7467 | +1.85% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 30.2209 | 27.9816 | -7.41% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
