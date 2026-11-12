# NeqSim 3.22.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.21.0 |
| Current | 3.22.0 |
| Source commit | `c6c839a503b63a4b65c7f2a64f529790fad431fc` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43223641601) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.21.0 | 3.21.0 | embedded Maven pom.properties |
| current | 3.22.0 | 3.22.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.21.0 -> 3.22.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 13 lower, 10 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 18.826 | 18.8129 | -0.07% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.19118 | 1.17932 | -1.00% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.98904 | 5.99661 | +0.13% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.4235 | 6.41962 | -0.06% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 10.659 | 10.6622 | +0.03% | Overlapping CIs |
| flash.TPflash.testFlash | 341.106 | 338.879 | -0.65% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 386.414 | 391.965 | +1.44% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 396.341 | 393.509 | -0.71% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 889.882 | 889.007 | -0.10% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.12343 | 6.12201 | -0.02% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0789501 | 0.0793094 | +0.46% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.468667 | 0.469184 | +0.11% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.20061 | 1.1988 | -0.15% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 14.0101 | 15.4454 | +10.24% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 70352.8 | 71001.8 | +0.92% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 19068.1 | 18629.3 | -2.30% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 6340.1 | 6227.56 | -1.78% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 43.9588 | 44.0075 | +0.11% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000287169 | 0.000280505 | -2.32% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 49.0097 | 48.995 | -0.03% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 24.9232 | 24.806 | -0.47% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.28143 | 9.33027 | +0.53% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 20.1699 | 20.1724 | +0.01% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
