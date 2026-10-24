# NeqSim 3.10.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.9.1 |
| Current | 3.10.0 |
| Source commit | `f5900d226529550322570da3194d8038be44b713` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40129456005) |
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
| baseline | 3.9.1 | 3.9.1 | embedded Maven pom.properties |
| current | 3.10.0 | 3.10.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.9.1 -> 3.10.0**, using identical benchmark sources.
Benchmark suite revision: `B13-b048238496c5`
23 benchmark/parameter cases: 15 lower, 8 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 17.3829 | 16.5812 | -4.61% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.18265 | 1.20069 | +1.52% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.46186 | 5.26665 | -3.57% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 5.26305 | 5.23035 | -0.62% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 9.49223 | 9.46832 | -0.25% | Overlapping CIs |
| flash.TPflash.testFlash | 378.316 | 370.513 | -2.06% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 817.86 | 803.731 | -1.73% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 406.371 | 407.454 | +0.27% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 948.33 | 949.246 | +0.10% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 11.851 | 11.9345 | +0.70% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.141347 | 0.141083 | -0.19% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 562.571 | 0.459967 | -99.92% | Separate CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 462.921 | 1.19117 | -99.74% | Separate CIs |
| process.Compressor_Benchmark.compressorprocess | 26.1664 | 26.3182 | +0.58% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 30387.3 | 28964.5 | -4.68% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 7987.27 | 7863.28 | -1.55% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 13913.5 | 13712.3 | -1.45% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 47.3651 | 44.3163 | -6.44% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000268291 | 0.000269201 | +0.34% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 56.1983 | 59.615 | +6.08% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.540789 | 0.528987 | -2.18% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 10.185 | 10.1462 | -0.38% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 23.0845 | 25.2727 | +9.48% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
