# NeqSim 3.9.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.8.2 |
| Current | 3.9.0 |
| Source commit | `6eb3f0070bfea1e694471d83a26b2081c3a111d3` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40025861313) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B13-b048238496c5`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| added | `src/main/java/com/equinor/neqsim/benchmark/process/LargeProcessModelBenchmark.java` |
| added | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.8.2 | 3.8.2 | embedded Maven pom.properties |
| current | 3.9.0 | 3.9.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.8.2 -> 3.9.0**, using identical benchmark sources.
Benchmark suite revision: `B13-b048238496c5`
23 benchmark/parameter cases: 10 lower, 13 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 20.5667 | 21.2515 | +3.33% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.56461 | 1.53851 | -1.67% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 6.46577 | 6.40821 | -0.89% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.33119 | 6.38811 | +0.90% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.6091 | 12.4916 | -0.93% | Overlapping CIs |
| flash.TPflash.testFlash | 512.123 | 620.792 | +21.22% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1077.29 | 1111.24 | +3.15% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 520.029 | 524.043 | +0.77% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1245.16 | 1227.93 | -1.38% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 14.6718 | 15.7759 | +7.53% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.171923 | 0.172398 | +0.28% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 567.451 | 568.246 | +0.14% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 467.462 | 469.856 | +0.51% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 38.1223 | 42.4786 | +11.43% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 38203.7 | 37508.2 | -1.82% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 5955.14 | 10210 | +71.45% | Separate CIs |
| process.TEGprocess.testTEGprocess | 17727.5 | 17568.3 | -0.90% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 60.9669 | 60.3998 | -0.93% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000361682 | 0.000383635 | +6.07% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 84.2316 | 75.3002 | -10.60% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.742029 | 0.680992 | -8.23% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.7986 | 15.4461 | +4.38% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 31.4429 | 28.0946 | -10.65% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
