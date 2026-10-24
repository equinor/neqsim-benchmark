# NeqSim 3.9.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.8.2 |
| Current | 3.9.0 |
| Source commit | `c618187e9d47ae624db2f060fde48134ad9bc30d` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40073286956) |
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
23 benchmark/parameter cases: 7 lower, 16 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 12.7835 | 12.9541 | +1.33% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.913017 | 0.916711 | +0.40% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.04006 | 4.00867 | -0.78% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 3.83968 | 3.99321 | +4.00% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 7.22415 | 7.40294 | +2.47% | Overlapping CIs |
| flash.TPflash.testFlash | 279.052 | 280.638 | +0.57% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 612.981 | 587.626 | -4.14% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 311.722 | 321.315 | +3.08% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 738.551 | 756.507 | +2.43% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 9.66533 | 9.65703 | -0.09% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.111625 | 0.111037 | -0.53% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 562.439 | 561.803 | -0.11% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 461.767 | 462.072 | +0.07% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 18.6912 | 19.7053 | +5.43% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 22407.3 | 21887.4 | -2.32% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 3411.64 | 6038.97 | +77.01% | Separate CIs |
| process.TEGprocess.testTEGprocess | 11005.9 | 10873.2 | -1.21% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 36.5272 | 36.6253 | +0.27% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000204763 | 0.000209509 | +2.32% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 42.9092 | 43.3946 | +1.13% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.377129 | 0.381064 | +1.04% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 8.12803 | 8.42356 | +3.64% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 16.3282 | 16.6451 | +1.94% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
