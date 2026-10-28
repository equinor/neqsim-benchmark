# NeqSim 3.13.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.12.1 |
| Current | 3.13.0 |
| Source commit | `f7e5a972dcd471d6e664f06f1f3a5d0755963705` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40707103678) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.12.1 | 3.12.1 | embedded Maven pom.properties |
| current | 3.13.0 | 3.13.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.12.1 -> 3.13.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 14 lower, 9 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 11.5075 | 11.4979 | -0.08% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.918542 | 0.917877 | -0.07% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 3.92946 | 4.09395 | +4.19% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 3.96724 | 3.95141 | -0.40% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 7.40805 | 7.56633 | +2.14% | Overlapping CIs |
| flash.TPflash.testFlash | 348.403 | 304.855 | -12.50% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 590.243 | 3482.24 | +489.97% | Separate CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 316.429 | 312.532 | -1.23% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 722.699 | 717.425 | -0.73% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 4.76734 | 4.72137 | -0.96% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0691747 | 0.0644674 | -6.80% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.339678 | 0.338397 | -0.38% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 0.883242 | 0.866896 | -1.85% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 17.8417 | 19.8047 | +11.00% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 51682.8 | 49866.6 | -3.51% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 7090.73 | 6768.74 | -4.54% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 9636.48 | 10357.3 | +7.48% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 35.5076 | 33.9223 | -4.46% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000217148 | 0.000210144 | -3.23% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 43.4174 | 45.648 | +5.14% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.382775 | 0.389573 | +1.78% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 7.8282 | 8.0311 | +2.59% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 16.4138 | 16.7444 | +2.01% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
