# NeqSim 3.20.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.19.0 |
| Current | 3.20.0 |
| Source commit | `3f1a28af3d858f20918d51508d70ce0d011e4d35` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41686748457) |
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
23 benchmark/parameter cases: 9 lower, 14 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 12.6502 | 12.6035 | -0.37% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.892231 | 0.943477 | +5.74% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.53734 | 4.44963 | -1.93% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 4.80426 | 4.81137 | +0.15% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 8.2206 | 8.51551 | +3.59% | Overlapping CIs |
| flash.TPflash.testFlash | 273.01 | 299.526 | +9.71% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 356.731 | 362.789 | +1.70% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 307.924 | 324.744 | +5.46% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 716.336 | 749.658 | +4.65% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 4.61648 | 4.83725 | +4.78% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0639917 | 0.0661475 | +3.37% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.333605 | 0.350628 | +5.10% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 0.858733 | 0.882924 | +2.82% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 16.5764 | 17.3991 | +4.96% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 49588.5 | 49501.8 | -0.17% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 12655.7 | 12332 | -2.56% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 5559.87 | 5308.75 | -4.52% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 37.1305 | 36.8261 | -0.82% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000213023 | 0.000203457 | -4.49% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 35.9362 | 36.0229 | +0.24% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 10.7729 | 10.7169 | -0.52% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 7.35317 | 8.30658 | +12.97% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 14.6739 | 14.5332 | -0.96% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
