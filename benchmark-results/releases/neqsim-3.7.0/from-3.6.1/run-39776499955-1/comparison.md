# NeqSim 3.7.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.6.1 |
| Current | 3.7.0 |
| Source commit | `686df526f8e902d1e0204db78e6e0184b3a3f740` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39776499955) |
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
| baseline | 3.6.1 | 3.6.1 | embedded Maven pom.properties |
| current | 3.7.0 | 3.7.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.6.1 -> 3.7.0**, using identical benchmark sources.
Benchmark suite revision: `B13-b048238496c5`
23 benchmark/parameter cases: 14 lower, 9 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 22.8686 | 20.7292 | -9.36% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.0176 | 0.928897 | -8.72% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.18238 | 4.78351 | -7.70% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 5.09148 | 4.72298 | -7.24% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 8.48335 | 8.04498 | -5.17% | Overlapping CIs |
| flash.TPflash.testFlash | 316.5 | 312.282 | -1.33% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 555.85 | 578.83 | +4.13% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 307.593 | 305.86 | -0.56% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 718.62 | 715.233 | -0.47% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 9.43912 | 9.51103 | +0.76% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.110346 | 0.109911 | -0.39% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 558.263 | 561.304 | +0.54% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 458.589 | 460.47 | +0.41% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 17.3749 | 18.336 | +5.53% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 24872.7 | 28617.9 | +15.06% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 4752.05 | 4886.69 | +2.83% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 14039.8 | 14192.5 | +1.09% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 37.8497 | 36.3404 | -3.99% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000207387 | 0.000209746 | +1.14% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 49.3113 | 48.6744 | -1.29% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.453646 | 0.409797 | -9.67% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.28767 | 8.81071 | -5.14% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 19.6203 | 18.0979 | -7.76% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
