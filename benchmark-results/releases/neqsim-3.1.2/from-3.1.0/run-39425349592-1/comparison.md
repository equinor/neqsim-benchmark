# NeqSim 3.1.2 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.1.0 |
| Current | 3.1.2 |
| Source commit | `e9a799ea73442ccdb3728e0ada7d51bcf1f5f939` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39425349592) |
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
| baseline | 3.1.0 | 3.1.0 | embedded Maven pom.properties |
| current | 3.1.2 | 3.1.2 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.1.0 -> 3.1.2**, using identical benchmark sources.
Benchmark suite revision: `B10-ad6d45cc8250`
15 benchmark/parameter cases: 10 lower, 5 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 34.8512 | 34.8844 | +0.10% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.741886 | 0.736742 | -0.69% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.39402 | 7.30233 | -1.24% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.45856 | 7.35219 | -1.43% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.1177 | 12.9552 | -1.24% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 527.379 | 516.661 | -2.03% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 154.747 | 147.641 | -4.59% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 567.449 | 566.616 | -0.15% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 468.078 | 466.898 | -0.25% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 41.9575 | 38.479 | -8.29% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000362204 | 0.000366605 | +1.22% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 80.8343 | 82.4874 | +2.05% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.712407 | 0.700884 | -1.62% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.443 | 15.8328 | +9.62% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 4.4722 | 34.7575 | +677.19% | Separate CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
