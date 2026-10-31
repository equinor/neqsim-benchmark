# NeqSim 3.18.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.17.0 |
| Current | 3.18.0 |
| Source commit | `09fcaa63d6e8c8084661d3ec592163d243f445e0` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41195235563) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.17.0 | 3.17.0 | embedded Maven pom.properties |
| current | 3.18.0 | 3.18.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.17.0 -> 3.18.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 14 lower, 9 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 16.8065 | 16.5702 | -1.41% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.18283 | 1.19451 | +0.99% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.57751 | 5.57508 | -0.04% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 5.59419 | 5.5766 | -0.31% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 9.99575 | 9.95275 | -0.43% | Overlapping CIs |
| flash.TPflash.testFlash | 402.67 | 400.458 | -0.55% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 4655.52 | 516.727 | -88.90% | Separate CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 407.189 | 402.783 | -1.08% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 954.587 | 958.068 | +0.36% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.13928 | 6.15618 | +0.28% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0800784 | 0.0805586 | +0.60% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.461424 | 0.460257 | -0.25% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.20805 | 1.20452 | -0.29% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 27.0825 | 27.4397 | +1.32% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 68417.1 | 65706.8 | -3.96% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 10401.4 | 7061.31 | -32.11% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 13463.8 | 6580.54 | -51.12% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 47.28 | 47.1099 | -0.36% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000271172 | 0.000274089 | +1.08% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 57.0525 | 59.9545 | +5.09% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.535424 | 14.3414 | +2578.51% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 11.1383 | 11.7549 | +5.54% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 23.1784 | 20.2578 | -12.60% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
