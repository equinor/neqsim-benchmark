# NeqSim 3.5.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.4.0 |
| Current | 3.5.0 |
| Source commit | `2470cfa7c2b8f9779f1d422eb5d2ba31bb4aa545` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39695710048) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B12-7822100cd1e0`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.4.0 | 3.4.0 | embedded Maven pom.properties |
| current | 3.5.0 | 3.5.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.4.0 -> 3.5.0**, using identical benchmark sources.
Benchmark suite revision: `B12-7822100cd1e0`
19 benchmark/parameter cases: 13 lower, 6 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 34.4896 | 34.0533 | -1.27% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.749022 | 0.750461 | +0.19% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.26538 | 7.31972 | +0.75% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.19588 | 7.16439 | -0.44% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.6485 | 12.6488 | +0.00% | Overlapping CIs |
| flash.TPflash.testFlash | 675.303 | 616.505 | -8.71% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1186.16 | 1043.54 | -12.02% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 525.23 | 524.042 | -0.23% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1206.21 | 1200.7 | -0.46% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 565.221 | 566.342 | +0.20% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 467.802 | 466.904 | -0.19% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 39.3619 | 33.9828 | -13.67% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 22144.6 | 22883.8 | +3.34% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 62.7192 | 63.4654 | +1.19% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000364757 | 0.000359261 | -1.51% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 87.8186 | 87.5316 | -0.33% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.713132 | 0.675392 | -5.29% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 15.4764 | 15.3469 | -0.84% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 34.9746 | 32.0416 | -8.39% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
