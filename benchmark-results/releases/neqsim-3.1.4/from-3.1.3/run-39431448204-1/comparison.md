# NeqSim 3.1.4 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.1.3 |
| Current | 3.1.4 |
| Source commit | `593abe036c52198879ff68f31cc2aa549b6ea836` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39431448204) |
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
| baseline | 3.1.3 | 3.1.3 | embedded Maven pom.properties |
| current | 3.1.4 | 3.1.4 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.1.3 -> 3.1.4**, using identical benchmark sources.
Benchmark suite revision: `B10-ad6d45cc8250`
15 benchmark/parameter cases: 7 lower, 8 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 35.1529 | 34.7197 | -1.23% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.745674 | 0.752831 | +0.96% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.31825 | 7.34106 | +0.31% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.38065 | 7.3062 | -1.01% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.1275 | 13.0773 | -0.38% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 520.936 | 519.999 | -0.18% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 161.36 | 170.552 | +5.70% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 566.341 | 566.921 | +0.10% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 467.67 | 468.156 | +0.10% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 41.0359 | 40.3665 | -1.63% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000369452 | 0.000362014 | -2.01% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 84.1609 | 83.7639 | -0.47% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.687185 | 0.693535 | +0.92% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 13.8558 | 15.4655 | +11.62% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 32.449 | 34.8219 | +7.31% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
