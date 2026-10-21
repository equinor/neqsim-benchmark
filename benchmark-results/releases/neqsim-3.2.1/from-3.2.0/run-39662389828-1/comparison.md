# NeqSim 3.2.1 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.2.0 |
| Current | 3.2.1 |
| Source commit | `aaa1b39a7c7b5cbdfa73e4d43ad237ae98220902` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39662389828) |
| Status | incomplete |

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
| baseline | 3.2.0 | 3.2.0 | embedded Maven pom.properties |
| current | 3.2.1 | 3.2.1 | embedded Maven pom.properties |

## Maven Build Results

| Variant | Status | Exit Code |
| --- | --- | ---: |
| baseline | failed | 1 |
| current | passed | 0 |

## Benchmark Timing Comparison

NeqSim **3.2.0 -> 3.2.1**, using identical benchmark sources.
Benchmark suite revision: `B11-ebebd4f33f11`
0 benchmark/parameter cases: 0 lower, 0 higher, 0 unchanged mean timings.

All timing changes, sorted by benchmark. Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

**Incomplete comparison: some benchmarks did not produce results.**
Baseline missing: com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid, com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas, com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr, com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk, com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties, com.equinor.neqsim.benchmark.flash.TPflash.testFlash, com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR, com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState, com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState, com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine, com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential, com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess, com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess, com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension, com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate, com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid, com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid
18 benchmark/parameter cases could not be matched across versions.

Incomplete run; no overall gain is reported. Check the transcript.
baseline Maven build failed (exit 1)
baseline-benchmarks.json: [Errno 2] No such file or directory: '/home/runner/work/_temp/baseline-benchmarks.json'
