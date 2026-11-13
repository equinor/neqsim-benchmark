# NeqSim 3.26.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.25.0 |
| Current | 3.26.0 |
| Source commit | `2eb9533414efcc1cbbe6d55f8047058ac0474ff9` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43438092272) |
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
23 benchmark/parameter cases: 8 lower, 15 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 19.2478 | 19.1497 | -0.51% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.923635 | 1.03494 | +12.05% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.89888 | 6.02225 | +2.09% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.38646 | 6.42297 | +0.57% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 10.6186 | 10.6674 | +0.46% | Overlapping CIs |
| flash.TPflash.testFlash | 349.215 | 369.538 | +5.82% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1859.97 | 1862.08 | +0.11% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 401.499 | 401.569 | +0.02% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 870.121 | 865.945 | -0.48% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.14946 | 6.15383 | +0.07% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0798317 | 0.080678 | +1.06% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.46702 | 0.468109 | +0.23% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.1996 | 1.19076 | -0.74% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 17.9515 | 20.0088 | +11.46% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 94585 | 98157.5 | +3.78% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 16895 | 14066.1 | -16.74% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 6264.33 | 6326.56 | +0.99% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 44.8942 | 44.8741 | -0.04% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000280924 | 0.000281627 | +0.25% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 49.8107 | 46.8825 | -5.88% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 24.9403 | 19.2327 | -22.89% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.48551 | 8.21657 | -13.38% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 20.3829 | 20.3855 | +0.01% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
