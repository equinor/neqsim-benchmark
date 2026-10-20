# NeqSim 3.1.4 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.1.3 |
| Current | 3.1.4 |
| Source commit | `02b0d1eb28cdbe657e2bd97df5c980f31fcba4d7` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39437569021) |
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
15 benchmark/parameter cases: 10 lower, 5 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 35.1198 | 34.7077 | -1.17% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.735147 | 0.734154 | -0.14% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.41022 | 7.27381 | -1.84% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.39545 | 7.27261 | -1.66% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.0132 | 12.9567 | -0.43% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 519.894 | 524.801 | +0.94% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 150.84 | 151.141 | +0.20% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 565.042 | 565.297 | +0.05% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 466.158 | 465.017 | -0.24% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 42.6609 | 38.9698 | -8.65% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000360961 | 0.000370915 | +2.76% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 84.982 | 80.6206 | -5.13% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.685496 | 0.669197 | -2.38% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.4607 | 16.1688 | +11.81% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 34.8313 | 32.2124 | -7.52% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
