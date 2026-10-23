# NeqSim 3.8.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.7.0 |
| Current | 3.8.0 |
| Source commit | `e9f72fd262c6724a4bd825fba8955ea4aa90f60f` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39852251284) |
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
| baseline | 3.7.0 | 3.7.0 | embedded Maven pom.properties |
| current | 3.8.0 | 3.8.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.7.0 -> 3.8.0**, using identical benchmark sources.
Benchmark suite revision: `B13-b048238496c5`
23 benchmark/parameter cases: 16 lower, 7 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 37.4577 | 23.234 | -37.97% | Separate CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.59828 | 1.53008 | -4.27% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 8.49139 | 7.40111 | -12.84% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 8.49583 | 7.39578 | -12.95% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 14.2023 | 13.1882 | -7.14% | Overlapping CIs |
| flash.TPflash.testFlash | 650.225 | 538.666 | -17.16% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1032.42 | 1067.55 | +3.40% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 533.431 | 533.98 | +0.10% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1217.43 | 1208.51 | -0.73% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 15.4437 | 15.408 | -0.23% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.17898 | 0.178916 | -0.04% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 563.415 | 563.949 | +0.09% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 464.592 | 465.179 | +0.13% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 36.5601 | 35.8093 | -2.05% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 50646 | 33553.3 | -33.75% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 8408.68 | 6390.89 | -24.00% | Separate CIs |
| process.TEGprocess.testTEGprocess | 23847.9 | 21254.7 | -10.87% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 63.0039 | 62.2041 | -1.27% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000350133 | 0.000354971 | +1.38% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 83.249 | 76.0744 | -8.62% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.73685 | 0.700042 | -5.00% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 15.561 | 16.1973 | +4.09% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 31.4143 | 34.2211 | +8.93% | Separate CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
