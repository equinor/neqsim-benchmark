# NeqSim 3.2.1 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.2.0 |
| Current | 3.2.1 |
| Source commit | `bcd2defa1c40edcea32bcbac22c143d5ba484d8b` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39645676925) |
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
15 benchmark/parameter cases: 8 lower, 7 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 34.0415 | 34.0162 | -0.07% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.737331 | 0.733912 | -0.46% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.11086 | 7.25199 | +1.98% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.02829 | 7.08642 | +0.83% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.6628 | 12.565 | -0.77% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 519.457 | 512.938 | -1.25% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1190.61 | 1193.51 | +0.24% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 565.517 | 566.258 | +0.13% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 466.875 | 466.508 | -0.08% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 40.1136 | 40.5549 | +1.10% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000360935 | 0.00036532 | +1.21% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 86.5551 | 86.551 | -0.00% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.692786 | 0.686887 | -0.85% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 15.765 | 15.5498 | -1.36% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 32.1712 | 34.3972 | +6.92% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
