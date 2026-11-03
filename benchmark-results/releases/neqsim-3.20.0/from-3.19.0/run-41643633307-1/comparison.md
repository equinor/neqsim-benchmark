# NeqSim 3.20.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.19.0 |
| Current | 3.20.0 |
| Source commit | `26c1c44abbeb1ebfabbe9e4ddbf4831fcf45ae4a` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41643633307) |
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
| flash.FlashBenchmark.phAndPsFlashWellFluid | 13.0747 | 13.3629 | +2.20% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.11925 | 1.07949 | -3.55% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.98527 | 4.73176 | -5.09% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 5.03811 | 4.86662 | -3.40% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 8.82777 | 9.1434 | +3.58% | Overlapping CIs |
| flash.TPflash.testFlash | 298.012 | 309.207 | +3.76% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 458.943 | 406.446 | -11.44% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 336.238 | 334.455 | -0.53% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 859.491 | 845.313 | -1.65% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.56253 | 6.89586 | +5.08% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0879034 | 0.0873016 | -0.68% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.640324 | 0.617757 | -3.52% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.43109 | 1.41099 | -1.40% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 24.0174 | 25.4634 | +6.02% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 54832.4 | 54642.3 | -0.35% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 14230.6 | 11145.3 | -21.68% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 6021.74 | 6202.82 | +3.01% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 43.749 | 46.4121 | +6.09% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000224746 | 0.000231156 | +2.85% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 40.2624 | 43.3419 | +7.65% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 13.1748 | 13.7404 | +4.29% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.50078 | 9.54403 | +0.46% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 15.6638 | 15.3452 | -2.03% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
