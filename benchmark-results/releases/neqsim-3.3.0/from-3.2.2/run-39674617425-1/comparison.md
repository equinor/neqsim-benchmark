# NeqSim 3.3.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.2.2 |
| Current | 3.3.0 |
| Source commit | `d7d3c3214b8ed84abc97b2cfd6c81f3052dd8535` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39674617425) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B12-7822100cd1e0`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.2.2 | 3.2.2 | embedded Maven pom.properties |
| current | 3.3.0 | 3.3.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.2.2 -> 3.3.0**, using identical benchmark sources.
Benchmark suite revision: `B12-7822100cd1e0`
19 benchmark/parameter cases: 10 lower, 9 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 24.9014 | 24.374 | -2.12% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.659081 | 0.6484 | -1.62% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.19601 | 5.27015 | +1.43% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 5.14693 | 5.1697 | +0.44% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 9.41804 | 9.40099 | -0.18% | Overlapping CIs |
| flash.TPflash.testFlash | 481.731 | 414.561 | -13.94% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 748.072 | 855.045 | +14.30% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 389.148 | 392.17 | +0.78% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 923.739 | 906.25 | -1.89% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 562.727 | 562.425 | -0.05% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 462.62 | 462.34 | -0.06% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 28.4796 | 26.1194 | -8.29% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 17311.9 | 17402.4 | +0.52% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 51.0676 | 53.9741 | +5.69% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000253837 | 0.000252319 | -0.60% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 67.4029 | 67.5769 | +0.26% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.568371 | 0.566481 | -0.33% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 11.2554 | 11.4872 | +2.06% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 22.5664 | 22.6158 | +0.22% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
