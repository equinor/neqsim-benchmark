# NeqSim 3.29.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.28.0 |
| Current | 3.29.0 |
| Source commit | `22d297f1ee5b4918fad3b5f103c60cd72b043f8e` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/44876015235) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B16-8d65e2abc344`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `.github/scripts/run-benchmark-timings.sh` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/longrun/DynamicProcessBenchmark.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/longrun/MlTrainingDataBenchmark.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/longrun/ProcessSimulationBenchmark.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/longrun/PropertyTableBenchmark.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/longrun/TwoFluidTransientBenchmark.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.28.0 | 3.28.0 | embedded Maven pom.properties |
| current | 3.29.0 | 3.29.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Correctness Checks

JUnit checks of benchmark results (convergence, mass balances, expected values). They run
separately from the timings, so a failure is reported without discarding the comparison.

| Variant | Status | Failed tests |
| --- | --- | --- |
| baseline | passed (exit 0) | none |
| current | passed (exit 0) | none |

## Benchmark Timing Comparison

NeqSim **3.28.0 -> 3.29.0**, using identical benchmark sources.
Benchmark suite revision: `B16-8d65e2abc344`

**Overall: 14.98% faster** (geometric mean of 30 cases). 8 significantly faster, 0 significantly slower (non-overlapping 99.9% confidence intervals).

30 benchmark/parameter cases: 26 lower, 4 higher, 0 unchanged mean timings.

### By area

Positive gain means faster (geometric-mean time reduction).

| Area | Cases | Gain | Significantly faster / slower |
| --- | ---: | ---: | ---: |
| flash | 7 | +24.23% | 2 / 0 |
| fluidmechanics | 2 | +1.95% | 0 / 0 |
| longrun | 7 | +22.07% | 4 / 0 |
| numerics | 4 | +0.82% | 0 / 0 |
| process | 4 | +22.03% | 2 / 0 |
| thermo | 6 | +1.88% | 0 / 0 |

### Cases

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 20.0596 | 19.4217 | -3.18% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.52727 | 1.08723 | -28.81% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.99431 | 7.84137 | -1.91% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 8.19553 | 8.14178 | -0.66% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.6291 | 13.4083 | -1.62% | Overlapping CIs |
| flash.TPflash.testFlash | 510.488 | 472.038 | -7.53% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 2427.78 | 569.758 | -76.53% | Separate CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 518.541 | 499.723 | -3.63% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1092.76 | 1090.18 | -0.24% | Overlapping CIs |
| longrun.DynamicProcessBenchmark.separationControlTransient | 54528.6 | 47916.7 | -12.13% | Separate CIs |
| longrun.MlTrainingDataBenchmark.processSurrogateDataset | 274264 | 176724 | -35.56% | Separate CIs |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=PR) | 24607.5 | 15710.9 | -36.15% | Separate CIs |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=SRK) | 24051.1 | 15369.4 | -36.10% | Separate CIs |
| longrun.PropertyTableBenchmark.olgaThreePhaseTable | 23533.8 | 19087.1 | -18.90% | Overlapping CIs |
| longrun.PropertyTableBenchmark.tpPropertyGrid | 27908.8 | 26584.7 | -4.74% | Overlapping CIs |
| longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp | 62738.4 | 61369.2 | -2.18% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 7.91108 | 7.73865 | -2.18% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0998294 | 0.0994401 | -0.39% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.570761 | 0.570118 | -0.11% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.49102 | 1.48248 | -0.57% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 32.2066 | 27.871 | -13.46% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 59114.2 | 54314.3 | -8.12% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 4356.25 | 6230.01 | +43.01% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 6294.88 | 2045.78 | -67.50% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 3.74266 | 3.80782 | +1.74% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000311799 | 0.000303305 | -2.72% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 19.8686 | 19.6207 | -1.25% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 57.7119 | 57.8574 | +0.25% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.74459 | 9.80972 | +0.67% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 26.9885 | 24.4106 | -9.55% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread. Long-running `longrun` cases (30 s to 5 min per operation): one fork, one warmup operation and three measured operations, so their confidence intervals are wide.
