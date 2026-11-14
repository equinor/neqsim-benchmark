# NeqSim 3.27.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.26.0 |
| Current | 3.27.0 |
| Source commit | `52b4e9b0caa914d644bc09d29d50d5aea5a497b0` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43626657296) |
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
| baseline | 3.26.0 | 3.26.0 | embedded Maven pom.properties |
| current | 3.27.0 | 3.27.0 | embedded Maven pom.properties |

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

NeqSim **3.26.0 -> 3.27.0**, using identical benchmark sources.
Benchmark suite revision: `B15-c61b4669e2ef`

**Overall: 12.94% faster** (geometric mean of 30 cases). 6 significantly faster, 5 significantly slower (non-overlapping 99.9% confidence intervals).

30 benchmark/parameter cases: 17 lower, 13 higher, 0 unchanged mean timings.

### By area

Positive gain means faster (geometric-mean time reduction).

| Area | Cases | Gain | Significantly faster / slower |
| --- | ---: | ---: | ---: |
| flash | 7 | -5.84% | 1 / 3 |
| fluidmechanics | 2 | -4.20% | 0 / 1 |
| longrun | 7 | +10.55% | 0 / 0 |
| numerics | 4 | +0.30% | 0 / 0 |
| process | 4 | +20.41% | 2 / 0 |
| thermo | 6 | +38.65% | 3 / 1 |

### Cases

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 23.2832 | 19.8885 | -14.58% | Separate CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.42733 | 1.83075 | +28.26% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.1075 | 7.88929 | +11.00% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.57366 | 8.10349 | +7.00% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.0526 | 13.4891 | +3.34% | Overlapping CIs |
| flash.TPflash.testFlash | 499.499 | 524.573 | +5.02% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 2486.62 | 2620.01 | +5.36% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 489.424 | 522.851 | +6.83% | Separate CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1052.87 | 1070.17 | +1.64% | Overlapping CIs |
| longrun.DynamicProcessBenchmark.separationControlTransient | 70783.3 | 66148.6 | -6.55% | CI unavailable |
| longrun.MlTrainingDataBenchmark.processSurrogateDataset | 394619 | 337834 | -14.39% | CI unavailable |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=PR) | 38963.5 | 31827.5 | -18.31% | CI unavailable |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=SRK) | 37939.8 | 31221.8 | -17.71% | CI unavailable |
| longrun.PropertyTableBenchmark.olgaThreePhaseTable | 29253 | 25690.2 | -12.18% | CI unavailable |
| longrun.PropertyTableBenchmark.tpPropertyGrid | 31847.3 | 31409 | -1.38% | CI unavailable |
| longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp | 67753 | 66624.5 | -1.67% | CI unavailable |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 9.27766 | 9.35103 | +0.79% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.137273 | 0.135941 | -0.97% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.632158 | 0.624764 | -1.17% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.64118 | 1.6437 | +0.15% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 26.6173 | 27.2502 | +2.38% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 115432 | 63061.3 | -45.37% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 5098.22 | 4650.48 | -8.78% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 8200.24 | 6450.27 | -21.34% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 61.1952 | 3.85875 | -93.69% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000422617 | 0.000463362 | +9.64% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 57.5774 | 19.343 | -66.41% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 22.3116 | 54.2452 | +143.13% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.86679 | 9.53781 | -3.33% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 22.6505 | 22.1277 | -2.31% | Separate CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread. Long-running `longrun` cases (30 s to 5 min per operation): one fork, no warmup and two measured operations, so their confidence intervals are wide.
