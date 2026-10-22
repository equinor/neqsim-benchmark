# NeqSim 3.6.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.5.0 |
| Current | 3.6.0 |
| Source commit | `0d0801b12d3ad33c51dc4eeed664c03556c356bc` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39698424162) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B12-7822100cd1e0`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.5.0 | 3.5.0 | embedded Maven pom.properties |
| current | 3.6.0 | 3.6.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.5.0 -> 3.6.0**, using identical benchmark sources.
Benchmark suite revision: `B12-7822100cd1e0`
19 benchmark/parameter cases: 3 lower, 16 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 33.9082 | 35.604 | +5.00% | Separate CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.735053 | 0.996909 | +35.62% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.33661 | 8.62036 | +17.50% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.1218 | 8.59912 | +20.74% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.7029 | 14.563 | +14.64% | Separate CIs |
| flash.TPflash.testFlash | 773.908 | 607.091 | -21.56% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1069.63 | 1079.6 | +0.93% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 531.585 | 529.519 | -0.39% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1194.04 | 1213.73 | +1.65% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 564.343 | 566.375 | +0.36% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 464.998 | 467.796 | +0.60% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 34.6956 | 38.0908 | +9.79% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 22147.6 | 22649.2 | +2.26% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 59.9193 | 62.8919 | +4.96% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000361391 | 0.000369114 | +2.14% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 86.3016 | 87.9887 | +1.95% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.681631 | 0.809213 | +18.72% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 15.6555 | 14.7264 | -5.93% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 29.709 | 32.1161 | +8.10% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
