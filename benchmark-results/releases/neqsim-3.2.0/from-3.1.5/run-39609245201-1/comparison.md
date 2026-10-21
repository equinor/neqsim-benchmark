# NeqSim 3.2.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.1.5 |
| Current | 3.2.0 |
| Source commit | `eaf00a0d434e88631ace462fca6c1ffc97f438c4` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39609245201) |
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
15 benchmark/parameter cases: 10 lower, 5 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 25.3325 | 24.3572 | -3.85% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.655792 | 0.654631 | -0.18% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.36169 | 5.23263 | -2.41% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 5.28143 | 5.12292 | -3.00% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 9.71331 | 9.32434 | -4.00% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 402.492 | 411.268 | +2.18% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 119.093 | 923.797 | +675.69% | Separate CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 562.177 | 561.905 | -0.05% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 462.38 | 461.999 | -0.08% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 28.1634 | 28.3148 | +0.54% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000254657 | 0.000252503 | -0.85% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 64.6606 | 66.5467 | +2.92% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.581816 | 0.560494 | -3.66% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 10.7161 | 10.3998 | -2.95% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 22.8607 | 24.7521 | +8.27% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
