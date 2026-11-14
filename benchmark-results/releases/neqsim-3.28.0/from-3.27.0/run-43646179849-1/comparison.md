# NeqSim 3.28.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.27.0 |
| Current | 3.28.0 |
| Source commit | `430b3ec36281083a562276bac864c7e163e45939` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43646179849) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B15-c61b4669e2ef`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| added | `src/main/java/com/equinor/neqsim/benchmark/longrun/DynamicProcessBenchmark.java` |
| added | `src/main/java/com/equinor/neqsim/benchmark/longrun/GasProcessingTrain.java` |
| added | `src/main/java/com/equinor/neqsim/benchmark/longrun/MlTrainingDataBenchmark.java` |
| added | `src/main/java/com/equinor/neqsim/benchmark/longrun/ProcessSimulationBenchmark.java` |
| added | `src/main/java/com/equinor/neqsim/benchmark/longrun/PropertyTableBenchmark.java` |
| added | `src/main/java/com/equinor/neqsim/benchmark/longrun/TwoFluidTransientBenchmark.java` |
| added | `src/main/java/com/equinor/neqsim/benchmark/longrun/package-info.java` |
| modified | `.github/scripts/run-benchmark-timings.sh` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

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
Benchmark suite revision: `B15-c61b4669e2ef`

**Overall: 1.03% faster** (geometric mean of 30 cases). 0 significantly faster, 0 significantly slower (non-overlapping 99.9% confidence intervals).

30 benchmark/parameter cases: 11 lower, 19 higher, 0 unchanged mean timings.

### By area

Positive gain means faster (geometric-mean time reduction).

| Area | Cases | Gain | Significantly faster / slower |
| --- | ---: | ---: | ---: |
| flash | 7 | -0.46% | 0 / 0 |
| fluidmechanics | 2 | -0.84% | 0 / 0 |
| longrun | 7 | -1.27% | 0 / 0 |
| numerics | 4 | -0.51% | 0 / 0 |
| process | 4 | +2.02% | 0 / 0 |
| thermo | 6 | +6.22% | 0 / 0 |

### Cases

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 16.5529 | 16.6977 | +0.88% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.25428 | 1.25101 | -0.26% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 6.44091 | 6.48262 | +0.65% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.70997 | 6.72034 | +0.15% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 10.976 | 10.9669 | -0.08% | Overlapping CIs |
| flash.TPflash.testFlash | 373.957 | 373.959 | +0.00% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1914.14 | 1950.75 | +1.91% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 412.187 | 417.226 | +1.22% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 872.898 | 876.832 | +0.45% | Overlapping CIs |
| longrun.DynamicProcessBenchmark.separationControlTransient | 46060 | 46142.7 | +0.18% | CI unavailable |
| longrun.MlTrainingDataBenchmark.processSurrogateDataset | 225030 | 221871 | -1.40% | CI unavailable |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=PR) | 21911.8 | 21677.3 | -1.07% | CI unavailable |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=SRK) | 20084.2 | 21665.9 | +7.88% | CI unavailable |
| longrun.PropertyTableBenchmark.olgaThreePhaseTable | 19850.2 | 20005 | +0.78% | CI unavailable |
| longrun.PropertyTableBenchmark.tpPropertyGrid | 24008.3 | 24693.6 | +2.85% | CI unavailable |
| longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp | 54741.2 | 54733 | -0.01% | CI unavailable |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.1335 | 6.13459 | +0.02% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0790627 | 0.0793705 | +0.39% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.457177 | 0.460495 | +0.73% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.18245 | 1.19309 | +0.90% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 20.1513 | 18.5333 | -8.03% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 47488.3 | 47646 | +0.33% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 3573.66 | 3520.08 | -1.50% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 4884.13 | 4951.8 | +1.39% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 2.87522 | 2.8852 | +0.35% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000348378 | 0.00023595 | -32.27% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 14.738 | 14.8398 | +0.69% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 46.9392 | 46.8657 | -0.16% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 7.94952 | 7.94831 | -0.02% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 19.846 | 19.7666 | -0.40% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread. Long-running `longrun` cases (30 s to 5 min per operation): one fork, no warmup and two measured operations, so their confidence intervals are wide.
