# NeqSim 3.28.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.27.0 |
| Current | 3.28.0 |
| Source commit | `81c97af9708bb9357ca73010d150d1e47a5e1769` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43662586415) |
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
| baseline | 3.27.0 | 3.27.0 | embedded Maven pom.properties |
| current | 3.28.0 | 3.28.0 | embedded Maven pom.properties |

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

NeqSim **3.27.0 -> 3.28.0**, using identical benchmark sources.
Benchmark suite revision: `B16-8d65e2abc344`

**Overall: 0.35% slower** (geometric mean of 30 cases). 0 significantly faster, 0 significantly slower (non-overlapping 99.9% confidence intervals).

30 benchmark/parameter cases: 10 lower, 20 higher, 0 unchanged mean timings.

### By area

Positive gain means faster (geometric-mean time reduction).

| Area | Cases | Gain | Significantly faster / slower |
| --- | ---: | ---: | ---: |
| flash | 7 | -0.23% | 0 / 0 |
| fluidmechanics | 2 | -0.36% | 0 / 0 |
| longrun | 7 | -0.41% | 0 / 0 |
| numerics | 4 | -0.41% | 0 / 0 |
| process | 4 | -0.76% | 0 / 0 |
| thermo | 6 | -0.12% | 0 / 0 |

### Cases

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 16.7051 | 16.5736 | -0.79% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.26906 | 1.26272 | -0.50% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 6.49811 | 6.50065 | +0.04% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.78142 | 6.77754 | -0.06% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 10.9493 | 10.9878 | +0.35% | Overlapping CIs |
| flash.TPflash.testFlash | 374.377 | 377.064 | +0.72% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1906.77 | 1941.9 | +1.84% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 415.492 | 416.804 | +0.32% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 871.269 | 874.72 | +0.40% | Overlapping CIs |
| longrun.DynamicProcessBenchmark.separationControlTransient | 44359 | 45658.4 | +2.93% | Overlapping CIs |
| longrun.MlTrainingDataBenchmark.processSurrogateDataset | 222182 | 219578 | -1.17% | Overlapping CIs |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=PR) | 19800 | 20219.3 | +2.12% | Overlapping CIs |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=SRK) | 19489.7 | 19188.8 | -1.54% | Overlapping CIs |
| longrun.PropertyTableBenchmark.olgaThreePhaseTable | 18035.6 | 18060.3 | +0.14% | Overlapping CIs |
| longrun.PropertyTableBenchmark.tpPropertyGrid | 22509.5 | 22675 | +0.74% | Overlapping CIs |
| longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp | 53680.6 | 53563.6 | -0.22% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.13394 | 6.13979 | +0.10% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0788035 | 0.0791883 | +0.49% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.459231 | 0.459964 | +0.16% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.18403 | 1.19474 | +0.90% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 21.3542 | 20.9713 | -1.79% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 47459.6 | 47541.7 | +0.17% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 3520.87 | 3549.48 | +0.81% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 4895.22 | 5087.81 | +3.93% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 2.88343 | 2.88283 | -0.02% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000350187 | 0.000351535 | +0.38% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 14.8418 | 14.9944 | +1.03% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 46.9419 | 47.0353 | +0.20% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 8.06976 | 8.02783 | -0.52% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 19.7754 | 19.7054 | -0.35% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread. Long-running `longrun` cases (30 s to 5 min per operation): one fork, one warmup operation and three measured operations, so their confidence intervals are wide.
