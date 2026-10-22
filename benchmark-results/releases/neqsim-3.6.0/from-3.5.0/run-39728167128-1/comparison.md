# NeqSim 3.6.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.5.0 |
| Current | 3.6.0 |
| Source commit | `4b6ce8e223157c8daf6246081e6398735c195591` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39728167128) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B13-b048238496c5`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| added | `src/main/java/com/equinor/neqsim/benchmark/process/LargeProcessModelBenchmark.java` |
| added | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |
| modified | `src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.5.0 | 3.5.0 | embedded Maven pom.properties |
| current | 3.6.0 | 3.6.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.5.0 -> 3.6.0**, using identical benchmark sources.
Benchmark suite revision: `B13-b048238496c5`
23 benchmark/parameter cases: 7 lower, 16 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 27.9447 | 29.2458 | +4.66% | Separate CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.576941 | 0.767934 | +33.10% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.93005 | 7.01695 | +18.33% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 5.72172 | 7.12595 | +24.54% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 10.017 | 11.3625 | +13.43% | Separate CIs |
| flash.TPflash.testFlash | 509.112 | 441.784 | -13.22% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 910.939 | 782.855 | -14.06% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 401.296 | 406.407 | +1.27% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 935.358 | 931.732 | -0.39% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 11.7578 | 11.8965 | +1.18% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.139933 | 0.140058 | +0.09% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 560.289 | 561.485 | +0.21% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 460.457 | 463.038 | +0.56% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 22.4256 | 25.0578 | +11.74% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 31598.4 | 36647.3 | +15.98% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 6592.03 | 6116.8 | -7.21% | Separate CIs |
| process.TEGprocess.testTEGprocess | 17564.8 | 17697.7 | +0.76% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 48.9586 | 48.9208 | -0.08% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.00027046 | 0.000269095 | -0.50% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 64.7093 | 65.2632 | +0.86% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.529965 | 0.625228 | +17.98% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 12.2758 | 11.5534 | -5.88% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 26.0565 | 28.1018 | +7.85% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
