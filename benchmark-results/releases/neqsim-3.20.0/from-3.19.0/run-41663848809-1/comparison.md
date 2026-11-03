# NeqSim 3.20.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.19.0 |
| Current | 3.20.0 |
| Source commit | `dd837aadfca58ebdfc4dec10a7739c30be4bb067` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41663848809) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.19.0 | 3.19.0 | embedded Maven pom.properties |
| current | 3.20.0 | 3.20.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.19.0 -> 3.20.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 15 lower, 8 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 21.1633 | 21.2629 | +0.47% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.61887 | 1.59308 | -1.59% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.71705 | 7.54757 | -2.20% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 8.77218 | 8.26081 | -5.83% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 15.6271 | 15.9133 | +1.83% | Overlapping CIs |
| flash.TPflash.testFlash | 575.807 | 534.085 | -7.25% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 766.26 | 653.594 | -14.70% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 521.802 | 519.006 | -0.54% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1255.69 | 1245.13 | -0.84% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 8.03714 | 7.55218 | -6.03% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0984683 | 0.100332 | +1.89% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.577867 | 0.616434 | +6.67% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.57965 | 1.55625 | -1.48% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 41.719 | 41.0835 | -1.52% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 87828 | 88335.5 | +0.58% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 25451.3 | 22361.6 | -12.14% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 9346.72 | 8743.68 | -6.45% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 60.7616 | 60.6353 | -0.21% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000364329 | 0.000364839 | +0.14% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 68.6022 | 66.4073 | -3.20% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 19.1182 | 19.192 | +0.39% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.7186 | 15.1786 | +3.13% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 32.5883 | 31.4134 | -3.61% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
