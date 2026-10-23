# NeqSim 3.8.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.7.0 |
| Current | 3.8.0 |
| Source commit | `3f724117134662de9ce95a17e6421660f49d2306` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39907244880) |
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
23 benchmark/parameter cases: 17 lower, 6 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 37.1329 | 22.9569 | -38.18% | Separate CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.59048 | 1.48581 | -6.58% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 8.32129 | 7.51263 | -9.72% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 8.21418 | 7.24368 | -11.81% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.8407 | 13.1237 | -5.18% | Overlapping CIs |
| flash.TPflash.testFlash | 616.305 | 519.717 | -15.67% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 982.362 | 994.078 | +1.19% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 526.402 | 522.121 | -0.81% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1204.21 | 1207.46 | +0.27% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 15.2925 | 15.2819 | -0.07% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.17826 | 0.178993 | +0.41% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 562.713 | 564.119 | +0.25% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 463.832 | 463.856 | +0.01% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 36.0456 | 35.5773 | -1.30% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 50238.9 | 33822.4 | -32.68% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 8470.06 | 6312.8 | -25.47% | Separate CIs |
| process.TEGprocess.testTEGprocess | 23690.8 | 20125.1 | -15.05% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 65.4339 | 64.1732 | -1.93% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000351725 | 0.000348959 | -0.79% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 82.0738 | 72.4706 | -11.70% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.735457 | 0.702216 | -4.52% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.8169 | 14.6757 | -0.95% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 33.7235 | 34.5214 | +2.37% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
