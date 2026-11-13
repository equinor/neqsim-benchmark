# NeqSim 3.26.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.25.0 |
| Current | 3.26.0 |
| Source commit | `19c5b0fa315e8fa2ea5f10dc92cfe1d88a8c7aeb` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43453733160) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.25.0 | 3.25.0 | embedded Maven pom.properties |
| current | 3.26.0 | 3.26.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.25.0 -> 3.26.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 10 lower, 13 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 18.9789 | 19.1834 | +1.08% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.918791 | 1.04229 | +13.44% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.84827 | 5.97163 | +2.11% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.36146 | 6.40686 | +0.71% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 10.5366 | 10.6314 | +0.90% | Overlapping CIs |
| flash.TPflash.testFlash | 347.971 | 368.345 | +5.86% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1805.23 | 1872.23 | +3.71% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 396.246 | 396.818 | +0.14% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 862.796 | 863.269 | +0.05% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.15112 | 6.13754 | -0.22% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0792461 | 0.0792249 | -0.03% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.465712 | 0.461027 | -1.01% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.19196 | 1.18869 | -0.27% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 18.9315 | 20.0645 | +5.98% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 93830.7 | 98497.2 | +4.97% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 16735.9 | 13951.5 | -16.64% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 6243.03 | 6247.35 | +0.07% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 44.467 | 44.4312 | -0.08% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000279544 | 0.000280409 | +0.31% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 49.8531 | 46.1287 | -7.47% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 24.8349 | 19.2268 | -22.58% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.39649 | 8.16582 | -13.10% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 22.4617 | 20.1956 | -10.09% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
