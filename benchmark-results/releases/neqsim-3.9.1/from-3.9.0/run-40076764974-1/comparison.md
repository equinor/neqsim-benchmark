# NeqSim 3.9.1 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.9.0 |
| Current | 3.9.1 |
| Source commit | `f2ad0001b4213ef025afdea8011fc41cef63e836` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40076764974) |
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
23 benchmark/parameter cases: 10 lower, 13 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 21.4328 | 22.0805 | +3.02% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.49114 | 1.53684 | +3.06% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 6.77077 | 6.69265 | -1.15% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.47365 | 6.88988 | +6.43% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.063 | 12.6597 | -3.09% | Overlapping CIs |
| flash.TPflash.testFlash | 505.909 | 615.141 | +21.59% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1152.79 | 1096.8 | -4.86% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 522.982 | 565.831 | +8.19% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1201.45 | 1219.15 | +1.47% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 14.5114 | 15.9717 | +10.06% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.172235 | 0.172833 | +0.35% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 568.034 | 568.184 | +0.03% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 469.613 | 469.539 | -0.02% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 40.8901 | 40.7088 | -0.44% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 37453.3 | 37388.1 | -0.17% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 10058 | 9964.78 | -0.93% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 17925.7 | 17751.6 | -0.97% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 61.3537 | 61.3838 | +0.05% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000362767 | 0.000390141 | +7.55% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 75.2258 | 78.4398 | +4.27% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.686581 | 0.682336 | -0.62% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.8037 | 13.7234 | -7.30% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 25.1514 | 31.4737 | +25.14% | Separate CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
