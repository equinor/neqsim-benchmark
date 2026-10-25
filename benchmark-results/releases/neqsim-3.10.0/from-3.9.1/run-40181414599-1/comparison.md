# NeqSim 3.10.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.9.1 |
| Current | 3.10.0 |
| Source commit | `81de06238cff6321f1490ee2f20aa33bbfce3e7e` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40181414599) |
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
| baseline | 3.9.1 | 3.9.1 | embedded Maven pom.properties |
| current | 3.10.0 | 3.10.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.9.1 -> 3.10.0**, using identical benchmark sources.
Benchmark suite revision: `B13-b048238496c5`
23 benchmark/parameter cases: 11 lower, 12 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 21.2686 | 20.7341 | -2.51% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.53367 | 1.51197 | -1.41% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 6.70311 | 6.88918 | +2.78% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.63866 | 6.57743 | -0.92% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.4972 | 13.3569 | -1.04% | Overlapping CIs |
| flash.TPflash.testFlash | 549.581 | 539.08 | -1.91% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1121.4 | 1258.48 | +12.22% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 530.915 | 541.336 | +1.96% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1211.54 | 1219.18 | +0.63% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 14.6388 | 14.996 | +2.44% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.173485 | 0.174653 | +0.67% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 567.963 | 0.585592 | -99.90% | Separate CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 470.096 | 1.57303 | -99.67% | Separate CIs |
| process.Compressor_Benchmark.compressorprocess | 44.6917 | 46.6731 | +4.43% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 37327.7 | 36375.8 | -2.55% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 10024.6 | 9821.67 | -2.02% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 16972.9 | 17265.3 | +1.72% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 60.9338 | 64.5764 | +5.98% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.00036725 | 0.000364498 | -0.75% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 76.731 | 79.9721 | +4.22% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.680647 | 0.688428 | +1.14% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 15.7163 | 14.1625 | -9.89% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 28.2027 | 31.7009 | +12.40% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
