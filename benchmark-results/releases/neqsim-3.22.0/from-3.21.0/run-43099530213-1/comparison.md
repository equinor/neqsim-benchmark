# NeqSim 3.22.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.21.0 |
| Current | 3.22.0 |
| Source commit | `1d3b0a708b1a352cdb58c65b85a0d6d39d7b837a` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43099530213) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.21.0 | 3.21.0 | embedded Maven pom.properties |
| current | 3.22.0 | 3.22.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.21.0 -> 3.22.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 14 lower, 9 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 22.7892 | 22.6598 | -0.57% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.47121 | 1.49599 | +1.68% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.2782 | 7.30987 | +0.44% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.80175 | 7.81078 | +0.12% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.2817 | 13.2714 | -0.08% | Overlapping CIs |
| flash.TPflash.testFlash | 450.237 | 447.341 | -0.64% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 507.383 | 505.491 | -0.37% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 494.662 | 493.371 | -0.26% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1121.53 | 1117.64 | -0.35% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 7.91145 | 7.92938 | +0.23% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0993531 | 0.098699 | -0.66% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.573347 | 0.583535 | +1.78% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.50139 | 1.49528 | -0.41% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 26.9935 | 21.5026 | -20.34% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 88879.5 | 87786.1 | -1.23% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 24302.4 | 23550 | -3.10% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 7602.88 | 7651.49 | +0.64% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 63.6579 | 55.8474 | -12.27% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000373997 | 0.000375348 | +0.36% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 66.8081 | 65.0283 | -2.66% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 30.5506 | 30.6699 | +0.39% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 11.6006 | 11.5986 | -0.02% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 24.4088 | 24.5638 | +0.63% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
