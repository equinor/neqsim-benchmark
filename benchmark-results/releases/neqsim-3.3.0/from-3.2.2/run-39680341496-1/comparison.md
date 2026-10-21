# NeqSim 3.3.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.2.2 |
| Current | 3.3.0 |
| Source commit | `fbfe35fd2e39854f0deebe980943b9048e809181` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39680341496) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B12-7822100cd1e0`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.2.2 | 3.2.2 | embedded Maven pom.properties |
| current | 3.3.0 | 3.3.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.2.2 -> 3.3.0**, using identical benchmark sources.
Benchmark suite revision: `B12-7822100cd1e0`
19 benchmark/parameter cases: 8 lower, 11 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 34.1979 | 33.9627 | -0.69% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.766229 | 0.75433 | -1.55% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.34162 | 7.27605 | -0.89% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.13142 | 7.15176 | +0.29% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.7716 | 12.8878 | +0.91% | Overlapping CIs |
| flash.TPflash.testFlash | 710.363 | 723.307 | +1.82% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1066.87 | 1066.18 | -0.06% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 529.961 | 527.817 | -0.40% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1215.31 | 1203.64 | -0.96% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 570.208 | 570.053 | -0.03% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 470.737 | 471.117 | +0.08% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 41.1981 | 45.6143 | +10.72% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 22664.3 | 22901.3 | +1.05% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 62.7514 | 66.7089 | +6.31% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000365878 | 0.000370619 | +1.30% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 87.1131 | 91.5893 | +5.14% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.710028 | 0.728977 | +2.67% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 13.9562 | 16.1373 | +15.63% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 32.1715 | 30.1359 | -6.33% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
