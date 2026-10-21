# NeqSim 3.1.5 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.1.4 |
| Current | 3.1.5 |
| Source commit | `ffeb25ddf0ae2f5fcd45214a58cab26b54a582f4` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39498168676) |
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
| baseline | 3.1.4 | 3.1.4 | embedded Maven pom.properties |
| current | 3.1.5 | 3.1.5 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.1.4 -> 3.1.5**, using identical benchmark sources.
Benchmark suite revision: `B10-ad6d45cc8250`
15 benchmark/parameter cases: 6 lower, 9 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 34.4782 | 34.5584 | +0.23% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.749995 | 0.741046 | -1.19% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.33272 | 7.17047 | -2.21% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.20994 | 7.33031 | +1.67% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.9274 | 13.0467 | +0.92% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 510.431 | 517.16 | +1.32% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 159.744 | 151.353 | -5.25% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 565.432 | 565.057 | -0.07% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 465.874 | 466.539 | +0.14% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 38.8376 | 39.1154 | +0.72% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000363383 | 0.000365415 | +0.56% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 82.8697 | 82.4075 | -0.56% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.681866 | 0.673673 | -1.20% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 13.5558 | 15.504 | +14.37% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 29.799 | 35.9362 | +20.60% | Separate CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
