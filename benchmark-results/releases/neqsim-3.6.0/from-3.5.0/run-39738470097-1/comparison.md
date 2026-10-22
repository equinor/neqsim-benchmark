# NeqSim 3.6.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.5.0 |
| Current | 3.6.0 |
| Source commit | `74b8f9f8bde6cf584b1a6eb2dfbd46a08804f43f` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39738470097) |
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
| baseline | 3.5.0 | 3.5.0 | embedded Maven pom.properties |
| current | 3.6.0 | 3.6.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.5.0 -> 3.6.0**, using identical benchmark sources.
Benchmark suite revision: `B13-b048238496c5`
23 benchmark/parameter cases: 5 lower, 18 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 18.6733 | 19.6471 | +5.21% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.414787 | 0.544829 | +31.35% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 3.85686 | 4.75186 | +23.21% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 3.81101 | 4.78099 | +25.45% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 7.0554 | 7.94133 | +12.56% | Separate CIs |
| flash.TPflash.testFlash | 307.03 | 289.605 | -5.68% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 520.758 | 522.138 | +0.27% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 282.906 | 283.172 | +0.09% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 668.994 | 671.827 | +0.42% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 8.74339 | 8.69772 | -0.52% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.100606 | 0.101314 | +0.70% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 556.293 | 556.791 | +0.09% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 457.395 | 457.545 | +0.03% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 11.6445 | 14.1863 | +21.83% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 20723.2 | 24900.8 | +20.16% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 4404.92 | 4129.38 | -6.26% | Separate CIs |
| process.TEGprocess.testTEGprocess | 12690.1 | 13111.1 | +3.32% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 34.768 | 34.5912 | -0.51% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000195126 | 0.00019513 | +0.00% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 45.6793 | 46.1951 | +1.13% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.354895 | 0.424578 | +19.63% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 7.94662 | 8.35549 | +5.15% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 19.3823 | 19.078 | -1.57% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
