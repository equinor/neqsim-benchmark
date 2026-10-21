# NeqSim 3.2.2 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.2.1 |
| Current | 3.2.2 |
| Source commit | `a81936253957c676a098d09ac70d7a095ae4ce58` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39665588280) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B11-ebebd4f33f11`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| added | `src/main/java/com/equinor/neqsim/benchmark/flash/TPflash.java` |
| added | `src/main/java/com/equinor/neqsim/benchmark/flash/TPflash_UMR.java` |
| added | `src/main/java/com/equinor/neqsim/benchmark/process/TEGprocess.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.2.1 | 3.2.1 | embedded Maven pom.properties |
| current | 3.2.2 | 3.2.2 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.2.1 -> 3.2.2**, using identical benchmark sources.
Benchmark suite revision: `B11-ebebd4f33f11`
18 benchmark/parameter cases: 9 lower, 9 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 20.8046 | 21.1424 | +1.62% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.460633 | 0.461674 | +0.23% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.36627 | 4.30202 | -1.47% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 4.30216 | 4.37216 | +1.63% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 7.90084 | 7.69983 | -2.54% | Overlapping CIs |
| flash.TPflash.testFlash | 355.193 | 326.7 | -8.02% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 581.791 | 550.611 | -5.36% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 309.278 | 304.413 | -1.57% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 727.051 | 710.703 | -2.25% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 562.302 | 562.75 | +0.08% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 462.177 | 462.275 | +0.02% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 19.8363 | 17.6632 | -10.96% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 14087.8 | 14032.4 | -0.39% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000205361 | 0.000205999 | +0.31% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 49.5766 | 49.7202 | +0.29% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.397581 | 0.3961 | -0.37% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 8.53614 | 8.91737 | +4.47% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 20.3091 | 20.8748 | +2.79% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
