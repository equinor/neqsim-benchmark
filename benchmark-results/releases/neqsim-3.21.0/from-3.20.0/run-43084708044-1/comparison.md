# NeqSim 3.21.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.20.0 |
| Current | 3.21.0 |
| Source commit | `a941eabd3f2da91592e39f71863eab0793ecb0a9` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43084708044) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.20.0 | 3.20.0 | embedded Maven pom.properties |
| current | 3.21.0 | 3.21.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.20.0 -> 3.21.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 10 lower, 13 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 13.4922 | 14.0838 | +4.38% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.0969 | 1.1062 | +0.85% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.77767 | 4.59907 | -3.74% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 4.91645 | 5.08177 | +3.36% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 8.47173 | 8.74908 | +3.27% | Overlapping CIs |
| flash.TPflash.testFlash | 268.627 | 279.001 | +3.86% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 324.454 | 325.963 | +0.47% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 338.486 | 329.399 | -2.68% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 794.941 | 754.376 | -5.10% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.53087 | 6.72336 | +2.95% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0864642 | 0.0857324 | -0.85% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.605299 | 0.589414 | -2.62% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.36642 | 1.37587 | +0.69% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 10.2804 | 11.7993 | +14.77% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 55125.4 | 55083.4 | -0.08% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 11846.4 | 11700.6 | -1.23% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 5128.91 | 5165.39 | +0.71% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 41.2625 | 40.2963 | -2.34% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000247709 | 0.000232178 | -6.27% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 41.9448 | 43.9798 | +4.85% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 11.5798 | 20.3757 | +75.96% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 8.43199 | 7.67709 | -8.95% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 15.1772 | 15.5199 | +2.26% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
