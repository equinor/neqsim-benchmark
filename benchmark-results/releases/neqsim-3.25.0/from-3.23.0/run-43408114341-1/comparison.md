# NeqSim 3.25.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.23.0 |
| Current | 3.25.0 |
| Source commit | `6384e0d0e807ec2904366f3da61b544d60a91feb` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43408114341) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.23.0 | 3.23.0 | embedded Maven pom.properties |
| current | 3.25.0 | 3.25.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.23.0 -> 3.25.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 11 lower, 12 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 22.6411 | 23.5261 | +3.91% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.48814 | 1.1293 | -24.11% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.26634 | 7.11137 | -2.13% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.8381 | 7.61939 | -2.79% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.2786 | 13.1815 | -0.73% | Overlapping CIs |
| flash.TPflash.testFlash | 453.513 | 461.96 | +1.86% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 2277.32 | 2297.96 | +0.91% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 495.802 | 493.505 | -0.46% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1121.15 | 1080.12 | -3.66% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 7.91211 | 8.0549 | +1.80% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0984806 | 0.100493 | +2.04% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.575201 | 0.575908 | +0.12% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.5082 | 1.50241 | -0.38% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 36.5154 | 26.2446 | -28.13% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 92256.2 | 118774 | +28.74% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 23447.8 | 18989.1 | -19.02% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 7762.13 | 7658.89 | -1.33% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 56.9955 | 57.1323 | +0.24% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000379029 | 0.000374807 | -1.11% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 65.7054 | 67.3004 | +2.43% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 30.5646 | 30.771 | +0.68% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 11.5591 | 11.6096 | +0.44% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 24.6869 | 27.6512 | +12.01% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
