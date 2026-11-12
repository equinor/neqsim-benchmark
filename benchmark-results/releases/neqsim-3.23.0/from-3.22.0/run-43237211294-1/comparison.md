# NeqSim 3.23.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.22.0 |
| Current | 3.23.0 |
| Source commit | `0fb83d041ca6468d4b8f883daf584db3d1401519` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43237211294) |
| Status | complete |

## Benchmark Suite Changes

Suite revision: `B14-87c78035e6f4`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.22.0 | 3.22.0 | embedded Maven pom.properties |
| current | 3.23.0 | 3.23.0 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.22.0 -> 3.23.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 14 lower, 9 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 14.3445 | 13.882 | -3.22% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.906621 | 0.908168 | +0.17% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.43445 | 4.53436 | +2.25% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 4.80503 | 4.69212 | -2.35% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 8.53723 | 8.16885 | -4.31% | Overlapping CIs |
| flash.TPflash.testFlash | 256.204 | 257.434 | +0.48% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 284.713 | 1332.12 | +367.88% | Separate CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 316.634 | 308.703 | -2.50% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 721.386 | 687.533 | -4.69% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 4.90331 | 4.70547 | -4.03% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0657397 | 0.0635049 | -3.40% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.338417 | 0.334472 | -1.17% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 0.86199 | 0.857185 | -0.56% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 10.7243 | 18.5353 | +72.83% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 51308.8 | 51168.4 | -0.27% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 13282.8 | 14053.9 | +5.81% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 4990.58 | 4929.27 | -1.23% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 32.612 | 34.0567 | +4.43% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000216591 | 0.000215626 | -0.45% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 38.3521 | 37.7847 | -1.48% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 18.0393 | 18.0578 | +0.10% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 6.79155 | 6.88473 | +1.37% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 16.2141 | 14.7121 | -9.26% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.
