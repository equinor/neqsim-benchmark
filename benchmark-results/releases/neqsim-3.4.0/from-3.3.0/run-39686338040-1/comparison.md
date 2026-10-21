# NeqSim 3.4.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.3.0 |
| Current | 3.4.0 |
| Source commit | `1de582f68696b8c28b32ac028fa3e7667f4c6416` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39686338040) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B12-7822100cd1e0`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.3.0 | 3.3.0 | embedded Maven pom.properties |
| current | 3.4.0 | 3.4.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.3.0 -> 3.4.0**, using identical benchmark sources.
Benchmark suite revision: `B12-7822100cd1e0`
19 benchmark/parameter cases: 12 lower, 7 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 19.4824 | 19.1733 | -1.59% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.442749 | 0.434216 | -1.93% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.0836 | 3.98792 | -2.34% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 4.00921 | 3.99069 | -0.46% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 7.28187 | 7.14797 | -1.84% | Overlapping CIs |
| flash.TPflash.testFlash | 301.03 | 305.718 | +1.56% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 532.295 | 534.678 | +0.45% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 290.436 | 291.925 | +0.51% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 693.634 | 692.324 | -0.19% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 557.824 | 556.885 | -0.17% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 459.079 | 457.625 | -0.32% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 15.4033 | 13.5464 | -12.06% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 13413.9 | 13125.1 | -2.15% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 35.7256 | 36.0095 | +0.79% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000200435 | 0.00019963 | -0.40% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 46.5972 | 44.8206 | -3.81% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.366319 | 0.378024 | +3.20% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 8.18215 | 8.5099 | +4.01% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 19.7444 | 20.0877 | +1.74% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
