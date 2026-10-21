# NeqSim 3.2.1 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.2.0 |
| Current | 3.2.1 |
| Source commit | `22acea42e737a2c3c5d325cd014a3511947d4462` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39611346005) |
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
| baseline | 3.2.0 | 3.2.0 | embedded Maven pom.properties |
| current | 3.2.1 | 3.2.1 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.2.0 -> 3.2.1**, using identical benchmark sources.
Benchmark suite revision: `B10-ad6d45cc8250`
15 benchmark/parameter cases: 9 lower, 6 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 34.587 | 34.7087 | +0.35% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.751062 | 0.73188 | -2.55% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.16428 | 7.14182 | -0.31% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.11505 | 6.96747 | -2.07% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.6915 | 12.6539 | -0.30% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 514.453 | 522.519 | +1.57% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1199.73 | 1188.1 | -0.97% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 564.961 | 566.27 | +0.23% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 466.266 | 468.085 | +0.39% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 39.3611 | 39.0621 | -0.76% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.00036082 | 0.000365669 | +1.34% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 85.9521 | 84.1348 | -2.11% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.678255 | 0.684687 | +0.95% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.6207 | 14.3265 | -2.01% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 34.6391 | 34.5834 | -0.16% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
