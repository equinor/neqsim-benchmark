# NeqSim 3.5.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.4.0 |
| Current | 3.5.0 |
| Source commit | `a04c7755599ad594ff0008a1072f19b7931d2d30` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39692791144) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B12-7822100cd1e0`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.4.0 | 3.4.0 | embedded Maven pom.properties |
| current | 3.5.0 | 3.5.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.4.0 -> 3.5.0**, using identical benchmark sources.
Benchmark suite revision: `B12-7822100cd1e0`
19 benchmark/parameter cases: 8 lower, 11 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 34.1513 | 35.2837 | +3.32% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.75093 | 0.770648 | +2.63% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.26535 | 7.20576 | -0.82% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.15873 | 7.18148 | +0.32% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.7767 | 12.6273 | -1.17% | Overlapping CIs |
| flash.TPflash.testFlash | 614.173 | 630.105 | +2.59% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1062.64 | 1055.6 | -0.66% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 528.763 | 522.784 | -1.13% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1208.79 | 1217.74 | +0.74% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 567.162 | 568.607 | +0.25% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 467.22 | 469.141 | +0.41% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 41.1744 | 34.968 | -15.07% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 22041.9 | 22344.9 | +1.37% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 66.0607 | 65.5043 | -0.84% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000360983 | 0.000364883 | +1.08% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 84.4509 | 87.3008 | +3.37% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.702629 | 0.691938 | -1.52% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 15.438 | 14.7767 | -4.28% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 32.3171 | 35.0881 | +8.57% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
