# NeqSim 3.1.2 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.1.0 |
| Current | 3.1.2 |
| Source commit | `0ba9f09e697d1b19be6680a0394dd3ac31de7327` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39346231884) |
| Status | incomplete |

## Benchmark Suite Changes

Suite revision: `B9-622f61efe4c9`. Compare historical timings only for matching revisions.

| Change | Benchmark file |
| --- | --- |
| modified | `.github/scripts/run-benchmark-timings.sh` |

## NeqSim JAR Versions

| Variant | Requested | JAR version | Evidence |
| --- | --- | --- | --- |
| baseline | 3.1.0 | 3.1.0 | embedded Maven pom.properties |
| current | 3.1.2 | 3.1.2 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | passed | 0 |
| current | failed | 1 |

## Benchmark Timing Comparison

NeqSim **3.1.0 -> 3.1.2**, using identical benchmark sources.
Benchmark suite revision: `B9-622f61efe4c9`
0 benchmark/parameter cases: 0 lower, 0 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

**Incomplete comparison: some benchmarks did not produce results.**
Current missing: com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid, com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashCpaGasWaterMeg, com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas, com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashReactiveElectrolyte, com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr, com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk, com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties, com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpMultiPhaseFlashGasOilWater, com.equinor.neqsim.benchmark.flash.TPflash.testFlash, com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR, com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState, com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState, com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine, com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential, com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess, com.equinor.neqsim.benchmark.process.ReactorAndNetworkBenchmark.gibbsReactorWaterGasShift, com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess, com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension, com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.hydrateFormationTemperatureCpa, com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate, com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid, com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid
23 benchmark/parameter cases could not be matched across versions.

Incomplete run; no overall gain is reported. Check the transcript.
current Maven build failed (exit 1)
current-benchmarks.json: [Errno 2] No such file or directory: '/home/runner/work/_temp/current-benchmarks.json'
