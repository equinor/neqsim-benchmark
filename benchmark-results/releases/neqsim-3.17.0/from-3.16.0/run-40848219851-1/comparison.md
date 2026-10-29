# NeqSim 3.17.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.16.0 |
| Current | 3.17.0 |
| Source commit | `620d4a782d155bbe37b83366bd42fad62f1419a5` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40848219851) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.16.0 | 3.16.0 | embedded Maven pom.properties |
| current | 3.17.0 | 3.17.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.16.0 -> 3.17.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 16 lower, 7 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 11.6349 | 11.4556 | -1.54% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.90667 | 0.888762 | -1.98% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.10908 | 4.02182 | -2.12% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 3.89605 | 4.02706 | +3.36% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 7.25683 | 7.49878 | +3.33% | Overlapping CIs |
| flash.TPflash.testFlash | 309.029 | 296.442 | -4.07% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 3580.4 | 3521.4 | -1.65% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 333.352 | 304.151 | -8.76% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 757.161 | 718.249 | -5.14% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 4.85338 | 4.6918 | -3.33% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0673987 | 0.0643387 | -4.54% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.346275 | 0.337715 | -2.47% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 0.888301 | 0.858317 | -3.38% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 20.894 | 16.9403 | -18.92% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 50362.9 | 50393.3 | +0.06% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 6649.08 | 7446.01 | +11.99% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 8230.53 | 9944.36 | +20.82% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 36.8948 | 33.399 | -9.48% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000212757 | 0.000213495 | +0.35% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 45.0456 | 42.7229 | -5.16% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.38379 | 0.39136 | +1.97% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 8.46211 | 7.85058 | -7.23% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 17.0742 | 14.9634 | -12.36% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
