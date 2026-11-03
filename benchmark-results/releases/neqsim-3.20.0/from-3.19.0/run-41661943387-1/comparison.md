# NeqSim 3.20.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.19.0 |
| Current | 3.20.0 |
| Source commit | `ecb28777f7265f413909e5a0128eec861d03acf7` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41661943387) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.19.0 | 3.19.0 | embedded Maven pom.properties |
| current | 3.20.0 | 3.20.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.19.0 -> 3.20.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 8 lower, 15 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 22.2718 | 21.4664 | -3.62% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.61218 | 1.59153 | -1.28% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 8.32562 | 8.92124 | +7.15% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 8.4271 | 8.83452 | +4.83% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 14.9913 | 15.328 | +2.25% | Overlapping CIs |
| flash.TPflash.testFlash | 561.953 | 581.069 | +3.40% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 736.498 | 636.478 | -13.58% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 522.008 | 539.113 | +3.28% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1207.5 | 1214.68 | +0.59% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 7.83532 | 8.05278 | +2.78% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.102832 | 0.100034 | -2.72% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.578775 | 0.580862 | +0.36% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.56521 | 1.55906 | -0.39% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 42.3016 | 44.5148 | +5.23% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 87303.4 | 87932.5 | +0.72% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 22503.1 | 23026.8 | +2.33% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 8875.03 | 9153.71 | +3.14% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 61.1142 | 61.296 | +0.30% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000386212 | 0.000361724 | -6.34% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 67.2298 | 67.1284 | -0.15% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 20.3586 | 18.75 | -7.90% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.2117 | 14.6534 | +3.11% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 25.2638 | 32.4994 | +28.64% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
