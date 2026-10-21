# NeqSim 3.4.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.3.0 |
| Current | 3.4.0 |
| Source commit | `fbfe35fd2e39854f0deebe980943b9048e809181` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39680706774) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B12-7822100cd1e0`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.3.0 | 3.3.0 | embedded Maven pom.properties |
| current | 3.4.0 | 3.4.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.3.0 -> 3.4.0**, using identical benchmark sources.
Benchmark suite revision: `B12-7822100cd1e0`
19 benchmark/parameter cases: 12 lower, 7 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 33.9193 | 34.0014 | +0.24% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.750423 | 0.735903 | -1.93% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.20538 | 7.19902 | -0.09% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.11172 | 7.0975 | -0.20% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.5737 | 12.6645 | +0.72% | Overlapping CIs |
| flash.TPflash.testFlash | 629.949 | 610.329 | -3.11% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1191.32 | 1029.18 | -13.61% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 523.619 | 517.419 | -1.18% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1191.73 | 1201.4 | +0.81% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 564.64 | 564.984 | +0.06% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 466.631 | 465.891 | -0.16% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 41.3005 | 41.5771 | +0.67% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 22581.5 | 22519.3 | -0.28% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 65.4409 | 65.025 | -0.64% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000360761 | 0.000366984 | +1.72% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 87.6152 | 89.0342 | +1.62% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.693402 | 0.683136 | -1.48% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.7633 | 13.7774 | -6.68% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 29.868 | 29.719 | -0.50% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
