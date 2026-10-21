# NeqSim 3.2.2 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.2.1 |
| Current | 3.2.2 |
| Source commit | `9edf1ff142cdf746343ac680fb2ff24f674f7073` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39670654157) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B11-ebebd4f33f11`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| added | `src/main/java/com/equinor/neqsim/benchmark/flash/TPflash.java` |
| added | `src/main/java/com/equinor/neqsim/benchmark/flash/TPflash_UMR.java` |
| added | `src/main/java/com/equinor/neqsim/benchmark/process/TEGprocess.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.2.1 | 3.2.1 | embedded Maven pom.properties |
| current | 3.2.2 | 3.2.2 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.2.1 -> 3.2.2**, using identical benchmark sources.
Benchmark suite revision: `B11-ebebd4f33f11`
18 benchmark/parameter cases: 11 lower, 7 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 35.507 | 35.9469 | +1.24% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.770526 | 0.776743 | +0.81% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.70946 | 7.80045 | +1.18% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.46643 | 7.56275 | +1.29% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.0242 | 13.0532 | +0.22% | Overlapping CIs |
| flash.TPflash.testFlash | 647.561 | 638.926 | -1.33% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1206.03 | 1013.45 | -15.97% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 538.352 | 527.868 | -1.95% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1213.8 | 1208.91 | -0.40% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 566.949 | 566.834 | -0.02% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 468.271 | 465.946 | -0.50% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 41.3651 | 39.5581 | -4.37% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 23473.8 | 23286 | -0.80% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000356271 | 0.00036354 | +2.04% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 84.2979 | 83.2984 | -1.19% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.680393 | 0.728144 | +7.02% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 15.0784 | 14.2529 | -5.47% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 36.6577 | 36.2045 | -1.24% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
