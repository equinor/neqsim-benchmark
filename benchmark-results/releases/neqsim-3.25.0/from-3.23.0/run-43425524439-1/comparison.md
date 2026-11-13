# NeqSim 3.25.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.23.0 |
| Current | 3.25.0 |
| Source commit | `b9c107e3f78cc13bd7578303febbc0ecb7ecbdb3` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43425524439) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.23.0 | 3.23.0 | embedded Maven pom.properties |
| current | 3.25.0 | 3.25.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.23.0 -> 3.25.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 12 lower, 11 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 19.0399 | 19.0925 | +0.28% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.17651 | 0.922308 | -21.61% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.97382 | 5.91707 | -0.95% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.42772 | 6.31921 | -1.69% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 10.6764 | 10.6452 | -0.29% | Overlapping CIs |
| flash.TPflash.testFlash | 340.083 | 348.719 | +2.54% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1794.41 | 1946.14 | +8.46% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 398.298 | 396.631 | -0.42% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 895.003 | 860.511 | -3.85% | Separate CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.14582 | 6.12785 | -0.29% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0793705 | 0.0795662 | +0.25% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.464136 | 0.464446 | +0.07% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.19686 | 1.20186 | +0.42% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 26.7522 | 17.4509 | -34.77% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 72412 | 94514.5 | +30.52% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 18392.7 | 16707.3 | -9.16% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 6362.94 | 6196.8 | -2.61% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 44.1291 | 44.4497 | +0.73% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000280012 | 0.000279462 | -0.20% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 49.8277 | 50.0047 | +0.36% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 25.0095 | 24.9806 | -0.12% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.39123 | 9.40272 | +0.12% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 20.3318 | 20.404 | +0.36% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
