# NeqSim 3.1.3 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.1.2 |
| Current | 3.1.3 |
| Source commit | `e9a799ea73442ccdb3728e0ada7d51bcf1f5f939` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39426381829) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B10-ad6d45cc8250`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/flash/FlashBenchmark.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/thermo/PhaseEnvelopeBenchmark.java` |
| deleted | `src/main/java/com/equinor/neqsim/benchmark/flash/TPflash.java` |
| deleted | `src/main/java/com/equinor/neqsim/benchmark/flash/TPflash_UMR.java` |
| deleted | `src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java` |
| deleted | `src/main/java/com/equinor/neqsim/benchmark/process/TEGprocess.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.1.2 | 3.1.2 | embedded Maven pom.properties |
| current | 3.1.3 | 3.1.3 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.1.2 -> 3.1.3**, using identical benchmark sources.
Benchmark suite revision: `B10-ad6d45cc8250`
15 benchmark/parameter cases: 8 lower, 7 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 34.846 | 35.4426 | +1.71% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.752278 | 0.74975 | -0.34% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.36041 | 7.34832 | -0.16% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.34813 | 7.38197 | +0.46% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.1179 | 13.0313 | -0.66% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 522.62 | 528.586 | +1.14% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 158.837 | 156.138 | -1.70% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 565.277 | 565.363 | +0.02% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 466.19 | 465.783 | -0.09% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 38.6417 | 40.1202 | +3.83% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000362357 | 0.000367276 | +1.36% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 86.1555 | 79.9464 | -7.21% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.689813 | 0.693613 | +0.55% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 15.9941 | 15.3228 | -4.20% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 32.4408 | 29.9395 | -7.71% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
