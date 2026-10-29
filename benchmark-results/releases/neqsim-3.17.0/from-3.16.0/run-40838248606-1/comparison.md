# NeqSim 3.17.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.16.0 |
| Current | 3.17.0 |
| Source commit | `0aaaf6272c94827d987c1722185bfd9be9dafe79` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40838248606) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.16.0 | 3.16.0 | embedded Maven pom.properties |
| current | 3.17.0 | 3.17.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.16.0 -> 3.17.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 12 lower, 11 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 12.0081 | 12.1223 | +0.95% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.00895 | 1.04442 | +3.52% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.05503 | 4.30226 | +6.10% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 3.88597 | 4.252 | +9.42% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 8.00993 | 7.89781 | -1.40% | Overlapping CIs |
| flash.TPflash.testFlash | 293.765 | 351.832 | +19.77% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 4023.7 | 3965.93 | -1.44% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 338.367 | 336.013 | -0.70% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 783.359 | 781.942 | -0.18% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.55446 | 6.45985 | -1.44% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0868614 | 0.0837901 | -3.54% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.60163 | 0.623698 | +3.67% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.39617 | 1.35034 | -3.28% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 23.5738 | 23.8556 | +1.20% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 54721.4 | 53163.3 | -2.85% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 8172.55 | 6293.26 | -23.00% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 8666.98 | 11029.3 | +27.26% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 47.1325 | 41.7204 | -11.48% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000225891 | 0.000229693 | +1.68% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 54.3588 | 51.7442 | -4.81% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.475866 | 0.437162 | -8.13% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.82194 | 10.4937 | +6.84% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 17.3511 | 17.9899 | +3.68% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
