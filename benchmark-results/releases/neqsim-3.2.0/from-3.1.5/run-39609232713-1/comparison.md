# NeqSim 3.2.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.1.5 |
| Current | 3.2.0 |
| Source commit | `eaf00a0d434e88631ace462fca6c1ffc97f438c4` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39609232713) |
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
| baseline | 3.1.5 | 3.1.5 | embedded Maven pom.properties |
| current | 3.2.0 | 3.2.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.1.5 -> 3.2.0**, using identical benchmark sources.
Benchmark suite revision: `B10-ad6d45cc8250`
15 benchmark/parameter cases: 7 lower, 8 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 34.7711 | 33.8935 | -2.52% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.747062 | 0.750098 | +0.41% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.28899 | 7.1517 | -1.88% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.27721 | 7.18401 | -1.28% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.1007 | 12.7407 | -2.75% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 528.199 | 528.154 | -0.01% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 162.432 | 1209.51 | +644.62% | Separate CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 565.308 | 566.004 | +0.12% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 466.25 | 466.978 | +0.16% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 42.4358 | 41.1704 | -2.98% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.00036226 | 0.000366772 | +1.25% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 84.7777 | 84.7126 | -0.08% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.68187 | 0.685054 | +0.47% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 13.9528 | 14.4618 | +3.65% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 32.3448 | 32.4631 | +0.37% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
