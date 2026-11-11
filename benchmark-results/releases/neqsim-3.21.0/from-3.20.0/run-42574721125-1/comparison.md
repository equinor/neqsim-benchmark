# NeqSim 3.21.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.20.0 |
| Current | 3.21.0 |
| Source commit | `62b26392a9c34feddf5ab0f9a0c9744378bece95` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/42574721125) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.20.0 | 3.20.0 | embedded Maven pom.properties |
| current | 3.21.0 | 3.21.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.20.0 -> 3.21.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 12 lower, 11 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 17.4882 | 19.4743 | +11.36% | Separate CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.18333 | 1.18036 | -0.25% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 6.01518 | 5.90402 | -1.85% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.51174 | 6.53773 | +0.40% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 10.7456 | 10.6763 | -0.64% | Overlapping CIs |
| flash.TPflash.testFlash | 321.983 | 340.441 | +5.73% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 388.346 | 382.4 | -1.53% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 393.753 | 395.092 | +0.34% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 888.315 | 886.935 | -0.16% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.1275 | 6.14074 | +0.22% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0792515 | 0.0792022 | -0.06% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.463693 | 0.464607 | +0.20% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.18636 | 1.19433 | +0.67% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 13.577 | 13.6809 | +0.77% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 70400 | 70337.4 | -0.09% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 16966.9 | 16124.8 | -4.96% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 6134.91 | 6226.84 | +1.50% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 46.459 | 43.9604 | -5.38% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000282857 | 0.000280209 | -0.94% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 48.3823 | 50.9273 | +5.26% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 13.3242 | 24.7861 | +86.02% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.78681 | 9.32034 | -4.77% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 22.8213 | 20.3156 | -10.98% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
