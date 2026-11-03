# NeqSim 3.20.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.19.0 |
| Current | 3.20.0 |
| Source commit | `01c0da54cfd560bdd575c713187f7e896ec9887e` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41663451836) |
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
23 benchmark/parameter cases: 12 lower, 11 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 17.4806 | 17.3284 | -0.87% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.22361 | 1.17228 | -4.19% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 6.19065 | 6.08549 | -1.70% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.50263 | 6.56038 | +0.89% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 10.9541 | 11.0573 | +0.94% | Overlapping CIs |
| flash.TPflash.testFlash | 367.412 | 372.397 | +1.36% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 499.112 | 486.913 | -2.44% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 403.466 | 402.083 | -0.34% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 944.51 | 937.795 | -0.71% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.16302 | 6.15146 | -0.19% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0806894 | 0.0798754 | -1.01% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.461343 | 0.472502 | +2.42% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.20062 | 1.19043 | -0.85% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 26.1982 | 26.4092 | +0.81% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 69451.8 | 67963.1 | -2.14% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 16291 | 17659.9 | +8.40% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 7077.87 | 6591.21 | -6.88% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 46.2821 | 49.6485 | +7.27% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000269178 | 0.000272796 | +1.34% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 50.5238 | 47.297 | -6.39% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 13.6962 | 14.4967 | +5.84% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 10.2383 | 10.9535 | +6.99% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 22.4725 | 22.6851 | +0.95% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
