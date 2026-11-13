# NeqSim 3.23.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.22.0 |
| Current | 3.23.0 |
| Source commit | `3187e92db438a7c236453bf22eabb24734f8768f` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43397468304) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.22.0 | 3.22.0 | embedded Maven pom.properties |
| current | 3.23.0 | 3.23.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.22.0 -> 3.23.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 9 lower, 14 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 18.6819 | 18.9543 | +1.46% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.1888 | 1.17895 | -0.83% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 6.00169 | 5.96704 | -0.58% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.45209 | 6.43674 | -0.24% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 10.6921 | 10.7036 | +0.11% | Overlapping CIs |
| flash.TPflash.testFlash | 327.986 | 341.415 | +4.09% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 388.976 | 1791.85 | +360.66% | Separate CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 396.633 | 398.456 | +0.46% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 890.356 | 890.689 | +0.04% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.13185 | 6.13297 | +0.02% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0794034 | 0.0792914 | -0.14% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.470909 | 0.470248 | -0.14% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.1928 | 1.1973 | +0.38% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 17.0328 | 26.6577 | +56.51% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 70847 | 72472.7 | +2.29% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 19369.6 | 19623.6 | +1.31% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 6287.75 | 6236.88 | -0.81% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 44.0177 | 44.4375 | +0.95% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000281184 | 0.000284671 | +1.24% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 49.7858 | 48.999 | -1.58% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 24.9054 | 26.4715 | +6.29% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.45849 | 9.44274 | -0.17% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 20.2602 | 20.2508 | -0.05% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
