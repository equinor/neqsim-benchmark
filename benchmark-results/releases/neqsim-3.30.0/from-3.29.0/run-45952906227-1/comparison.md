# NeqSim 3.30.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.29.0 |
| Current | 3.30.0 |
| Source commit | `fe2b4d2a297173e93a5ddd1056fe84fc522034e6` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/45952906227) |
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
| baseline | 3.29.0 | 3.29.0 | embedded Maven pom.properties |
| current | 3.30.0 | 3.30.0 | embedded Maven pom.properties |

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

NeqSim **3.29.0 -> 3.30.0**, using identical benchmark sources.
Benchmark suite revision: `B16-8d65e2abc344`

**Overall: 8.25% faster** (geometric mean of 30 cases). 3 significantly faster, 3 significantly slower (non-overlapping 99.9% confidence intervals).

30 benchmark/parameter cases: 6 lower, 24 higher, 0 unchanged mean timings.

### By area

Positive gain means faster (geometric-mean time reduction).

| Area | Cases | Gain | Significantly faster / slower |
| --- | ---: | ---: | ---: |
| flash | 7 | -7.83% | 0 / 1 |
| fluidmechanics | 2 | -1.07% | 0 / 0 |
| longrun | 7 | -3.62% | 1 / 1 |
| numerics | 4 | -1.58% | 0 / 1 |
| process | 4 | +62.28% | 2 / 0 |
| thermo | 6 | -7.88% | 0 / 0 |

### Cases

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 19.5013 | 19.5376 | +0.19% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.09004 | 1.08858 | -0.13% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.87966 | 7.88301 | +0.04% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 8.13477 | 8.12044 | -0.18% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 13.4026 | 13.5248 | +0.91% | Overlapping CIs |
| flash.TPflash.testFlash | 471.778 | 477.61 | +1.24% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 560.296 | 930.625 | +66.10% | Separate CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 500.915 | 502.94 | +0.40% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1088.83 | 1107.79 | +1.74% | Overlapping CIs |
| longrun.DynamicProcessBenchmark.separationControlTransient | 48341.2 | 104293 | +115.74% | Separate CIs |
| longrun.MlTrainingDataBenchmark.processSurrogateDataset | 176785 | 177705 | +0.52% | Overlapping CIs |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=PR) | 15767.9 | 15797.3 | +0.19% | Overlapping CIs |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=SRK) | 15125.6 | 15265.2 | +0.92% | Overlapping CIs |
| longrun.PropertyTableBenchmark.olgaThreePhaseTable | 19215.5 | 19255.6 | +0.21% | Overlapping CIs |
| longrun.PropertyTableBenchmark.tpPropertyGrid | 26479.2 | 26538.7 | +0.22% | Overlapping CIs |
| longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp | 61360.8 | 35729.9 | -41.77% | Separate CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 7.89393 | 7.90425 | +0.13% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.098667 | 0.099349 | +0.69% | Separate CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.579423 | 0.611585 | +5.55% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.48402 | 1.4847 | +0.05% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 28.6982 | 27.8097 | -3.10% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 54187.3 | 7478.04 | -86.20% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 6227.2 | 929.119 | -85.08% | Separate CIs |
| process.TEGprocess.testTEGprocess | 2073.13 | 2104.04 | +1.49% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 3.58386 | 3.60955 | +0.72% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000305835 | 0.000459746 | +50.32% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 19.6695 | 19.6714 | +0.01% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 57.825 | 58.4091 | +1.01% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.70031 | 9.91572 | +2.22% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 24.4094 | 24.6071 | +0.81% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread. Long-running `longrun` cases (30 s to 5 min per operation): one fork, one warmup operation and three measured operations, so their confidence intervals are wide.
