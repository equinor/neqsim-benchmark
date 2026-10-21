# NeqSim 3.2.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.1.5 |
| Current | 3.2.0 |
| Source commit | `3d4e8be0a3fcabe507c882253a4af5f31f97c316` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39606105753) |
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
15 benchmark/parameter cases: 8 lower, 7 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 35.3467 | 33.9805 | -3.87% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.740191 | 0.73982 | -0.05% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.28571 | 7.30122 | +0.21% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.33048 | 7.17307 | -2.15% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.0136 | 12.6605 | -2.71% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 520.538 | 521.657 | +0.21% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 155.518 | 1196.45 | +669.34% | Separate CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 566.464 | 565.847 | -0.11% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 466.826 | 467.179 | +0.08% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 40.4817 | 42.5435 | +5.09% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000361036 | 0.000361622 | +0.16% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 85.6815 | 86.8596 | +1.37% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.701449 | 0.688741 | -1.81% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 15.6219 | 15.5056 | -0.74% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 34.7314 | 30.0209 | -13.56% | Separate CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
