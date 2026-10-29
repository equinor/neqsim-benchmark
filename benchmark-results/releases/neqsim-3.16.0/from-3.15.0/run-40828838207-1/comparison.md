# NeqSim 3.16.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.15.0 |
| Current | 3.16.0 |
| Source commit | `f28ba7ac8a88d090454489b8dcb136bb5ee823c3` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40828838207) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.15.0 | 3.15.0 | embedded Maven pom.properties |
| current | 3.16.0 | 3.16.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.15.0 -> 3.16.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 11 lower, 12 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 15.7658 | 15.6371 | -0.82% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.17275 | 1.18137 | +0.73% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.40119 | 5.42423 | +0.43% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 5.27418 | 5.24369 | -0.58% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 9.45758 | 9.59933 | +1.50% | Overlapping CIs |
| flash.TPflash.testFlash | 426.836 | 373.425 | -12.51% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 4643.01 | 4674.67 | +0.68% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 411.917 | 405.039 | -1.67% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 942.574 | 951.27 | +0.92% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.17874 | 6.16386 | -0.24% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.080501 | 0.0815313 | +1.28% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.459614 | 0.462329 | +0.59% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.20766 | 1.19796 | -0.80% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 26.3301 | 26.0506 | -1.06% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 72704.6 | 66932.6 | -7.94% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 8210.8 | 9231.83 | +12.44% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 9931.83 | 9959.33 | +0.28% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 47.1247 | 49.6881 | +5.44% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.00026974 | 0.000269781 | +0.02% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 58.0498 | 56.9666 | -1.87% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.535165 | 0.533149 | -0.38% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 11.2483 | 12.0769 | +7.37% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 25.5247 | 20.7084 | -18.87% | Separate CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
