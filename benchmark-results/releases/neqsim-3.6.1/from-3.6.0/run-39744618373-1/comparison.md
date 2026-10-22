# NeqSim 3.6.1 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.6.0 |
| Current | 3.6.1 |
| Source commit | `0cb44dfc1b2e2d41ab507a011e4f63eb01acf42c` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39744618373) |
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
| baseline | 3.6.0 | 3.6.0 | embedded Maven pom.properties |
| current | 3.6.1 | 3.6.1 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.6.0 -> 3.6.1**, using identical benchmark sources.
Benchmark suite revision: `B13-b048238496c5`
23 benchmark/parameter cases: 10 lower, 13 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 36.3433 | 35.5767 | -2.11% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.978395 | 1.59952 | +63.48% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 8.70278 | 8.22448 | -5.50% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 8.6386 | 7.86832 | -8.92% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 14.3302 | 14.1476 | -1.27% | Overlapping CIs |
| flash.TPflash.testFlash | 598.238 | 643.625 | +7.59% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1020.53 | 1039.42 | +1.85% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 517.769 | 525.522 | +1.50% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1212.76 | 1214.41 | +0.14% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 14.4414 | 14.5356 | +0.65% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.172457 | 0.173836 | +0.80% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 565.103 | 566.253 | +0.20% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 468.049 | 467.861 | -0.04% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 37.0726 | 41.3931 | +11.65% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 44872.9 | 41067.4 | -8.48% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 7490.49 | 8038.27 | +7.31% | Separate CIs |
| process.TEGprocess.testTEGprocess | 23378.3 | 23019.1 | -1.54% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 66.3923 | 62.873 | -5.30% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000359213 | 0.0003597 | +0.14% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 88.2494 | 87.0646 | -1.34% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.817376 | 0.80154 | -1.94% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.735 | 14.8873 | +1.03% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 32.1717 | 32.2436 | +0.22% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
