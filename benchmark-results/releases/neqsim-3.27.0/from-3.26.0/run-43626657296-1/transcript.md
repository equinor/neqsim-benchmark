# NeqSim 3.27.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.26.0 |
| Current | 3.27.0 |
| Source commit | `52b4e9b0caa914d644bc09d29d50d5aea5a497b0` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43626657296) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 15,
  "label": "B15-c61b4669e2ef",
  "fingerprint": "c61b4669e2ef0e746fc04e1631684b294bc6f2a829ed71d1c891b79bffb756ee",
  "source_commit": "52b4e9b0caa914d644bc09d29d50d5aea5a497b0",
  "updated_at": "2026-11-14",
  "uncommitted_changes": false,
  "scopes": [
    "src/main/java",
    "src/main/resources",
    ".github/scripts/run-benchmark-timings.sh"
  ],
  "files": {
    ".github/scripts/run-benchmark-timings.sh": "c97e4d5c105cbf7cdce91c6b0111706a770456da0de8b72bffc4a358ca65f634",
    "src/main/java/com/equinor/neqsim/benchmark/flash/FlashBenchmark.java": "16e923506b507f652653ce4709a31c2ffd57aca63da4facbb1acb5a408df33c5",
    "src/main/java/com/equinor/neqsim/benchmark/flash/TPflash.java": "5dfd00a3bd4cb4b497da1d3b47f2303f351c3bc570b61b528765919b920031ab",
    "src/main/java/com/equinor/neqsim/benchmark/flash/TPflash_UMR.java": "925cc33c89f7dad0ec3ba4bf2567d283f80790fc465c963b45f4a8202536773e",
    "src/main/java/com/equinor/neqsim/benchmark/fluidmechanics/PipeFlowSolverBenchmark.java": "76fdf4910236068de1c14af59b07a4fa1c33995047d29f1d320549dc36f08cab",
    "src/main/java/com/equinor/neqsim/benchmark/longrun/DynamicProcessBenchmark.java": "0be5ccf2459d1b32c0dc01e8912b22ce2b49970abf3f57064893d68f442e354b",
    "src/main/java/com/equinor/neqsim/benchmark/longrun/GasProcessingTrain.java": "d93bb96f7c68276f640350dfb9b0d2be4cd1c4f7d4f41d95fb4f0eb43243c2ad",
    "src/main/java/com/equinor/neqsim/benchmark/longrun/MlTrainingDataBenchmark.java": "203f967c089de8b306381ddbeff940b83dd1524f76d40b59f9709ab6eba8ec81",
    "src/main/java/com/equinor/neqsim/benchmark/longrun/ProcessSimulationBenchmark.java": "b9fcfdc54d8b6905e123bd6dd07e206a02924a8896bbeb3daeed8d6c8b222a31",
    "src/main/java/com/equinor/neqsim/benchmark/longrun/PropertyTableBenchmark.java": "82fac010d55dff71be7c997c28d3883e2c03b98c83a28111e42193ffb64fec54",
    "src/main/java/com/equinor/neqsim/benchmark/longrun/TwoFluidTransientBenchmark.java": "8f0fab86864170b00e344994e3d912f69975b20913afb312c0b6cc546724cc9b",
    "src/main/java/com/equinor/neqsim/benchmark/longrun/package-info.java": "349faa2672b4d7ffde90e0e884ddd3bac9d30bc5a1653e28234c77df8275c947",
    "src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java": "c65dc1394ea88648f719e2eb2259a0c496fa188221d96ccb0fb7f039b2a06dc7",
    "src/main/java/com/equinor/neqsim/benchmark/process/Compressor_Benchmark.java": "4c5fd06e5e1e1888b1fc7fe9accef39262ccf310f028c7741a1d43d54dcfdd50",
    "src/main/java/com/equinor/neqsim/benchmark/process/LargeProcessModelBenchmark.java": "43aed65eaf92203243dfb1a06204f28466c06b7c6e1b93f532806f806f94ccd0",
    "src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java": "0a0f4df4c9dd8a00bb43a6ead7a9d8edec2ee337e1e05c21672ed09a0eda7b78",
    "src/main/java/com/equinor/neqsim/benchmark/process/TEGprocess.java": "2e3be31a0adf16c5f7ae5c6854babfd8df641e2e9d241ef8467ff16e1de35602",
    "src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java": "8774baa0bf170ed6646a4f67b67cb9d9259b8b765202417a6f16bd0892b3d669",
    "src/main/java/com/equinor/neqsim/benchmark/thermo/PhaseEnvelopeBenchmark.java": "7abf7ec3acdca4a3c1599fa3ee33670b708855c207103f16dc8d3e6bb83ca78c",
    "src/main/java/com/equinor/neqsim/benchmark/util/BenchmarkFluids.java": "87ea44ebc643643e5acffedeadb95d6bba553daaed4a026d076f38646c77fdb0",
    "src/main/resources/fluids/platform_feed.e300": "32f4eb0253f888fa2c96a36fe76d26e085dda3308d5a80b11ce9899993aceb7b"
  },
  "changes": {
    "added": [
      "src/main/java/com/equinor/neqsim/benchmark/longrun/DynamicProcessBenchmark.java",
      "src/main/java/com/equinor/neqsim/benchmark/longrun/GasProcessingTrain.java",
      "src/main/java/com/equinor/neqsim/benchmark/longrun/MlTrainingDataBenchmark.java",
      "src/main/java/com/equinor/neqsim/benchmark/longrun/ProcessSimulationBenchmark.java",
      "src/main/java/com/equinor/neqsim/benchmark/longrun/PropertyTableBenchmark.java",
      "src/main/java/com/equinor/neqsim/benchmark/longrun/TwoFluidTransientBenchmark.java",
      "src/main/java/com/equinor/neqsim/benchmark/longrun/package-info.java"
    ],
    "modified": [
      ".github/scripts/run-benchmark-timings.sh",
      "src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java"
    ],
    "deleted": []
  }
}

```


## benchmark-environment.txt

```text
openjdk version "21.0.13" 2026-10-20 LTS
OpenJDK Runtime Environment Temurin-21.0.13+9 (build 21.0.13+9-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.13+9 (build 21.0.13+9-LTS, mixed mode, sharing)
Apache Maven 3.9.15 (98b2cdbfdb5f1ac8781f537ea9acccaed7922349)
Maven home: /usr/share/apache-maven-3.9.15
Java version: 21.0.13, vendor: Eclipse Adoptium, runtime: /usr/lib/jvm/temurin-21-jdk-amd64
Default locale: en, platform encoding: UTF-8
OS name: "linux", version: "7.0.0-1019-azure", arch: "amd64", family: "unix"
Linux runnervmccnms 7.0.0-1019-azure #20-Ubuntu SMP PREEMPT Mon Oct 19 22:41:16 UTC 2026 x86_64 GNU/Linux
Architecture:                            x86_64
CPU op-mode(s):                          32-bit, 64-bit
Address sizes:                           46 bits physical, 57 bits virtual
Byte Order:                              Little Endian
CPU(s):                                  4
On-line CPU(s) list:                     0-3
Vendor ID:                               GenuineIntel
Model name:                              Intel(R) Xeon(R) Platinum 8370C CPU @ 2.80GHz
CPU family:                              6
Model:                                   106
Thread(s) per core:                      2
Core(s) per socket:                      2
Socket(s):                               1
Stepping:                                6
CPU(s) scaling MHz:                      125%
CPU max MHz:                             2800.0000
CPU min MHz:                             800.0000
BogoMIPS:                                5586.90
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ss ht syscall nx pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology tsc_reliable nonstop_tsc cpuid aperfmperf tsc_known_freq pni pclmulqdq vmx ssse3 fma cx16 pcid sse4_1 sse4_2 x2apic movbe popcnt tsc_deadline_timer aes xsave avx f16c rdrand hypervisor lahf_lm abm 3dnowprefetch tpr_shadow ept vpid ept_ad fsgsbase tsc_adjust bmi1 hle avx2 smep bmi2 erms invpcid rtm avx512f avx512dq rdseed adx smap avx512ifma clflushopt clwb avx512cd sha_ni avx512bw avx512vl xsaveopt xsavec xgetbv1 xsaves vnmi avx512vbmi umip avx512_vbmi2 gfni vaes vpclmulqdq avx512_vnni avx512_bitalg avx512_vpopcntdq la57 rdpid fsrm arch_capabilities
Virtualization:                          VT-x
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               96 KiB (2 instances)
L1i cache:                               64 KiB (2 instances)
L2 cache:                                2.5 MiB (2 instances)
L3 cache:                                48 MiB (1 instance)
NUMA node(s):                            1
NUMA node0 CPU(s):                       0-3
Vulnerability Gather data sampling:      Not affected
Vulnerability Ghostwrite:                Not affected
Vulnerability Indirect target selection: Mitigation; Aligned branch/return thunks
Vulnerability Itlb multihit:             Not affected
Vulnerability L1tf:                      Not affected
Vulnerability Mds:                       Not affected
Vulnerability Meltdown:                  Not affected
Vulnerability Mmio stale data:           Vulnerable: Clear CPU buffers attempted, no microcode; SMT Host state unknown
Vulnerability Old microcode:             Not affected
Vulnerability Reg file data sampling:    Not affected
Vulnerability Retbleed:                  Vulnerable
Vulnerability Spec rstack overflow:      Not affected
Vulnerability Spec store bypass:         Vulnerable
Vulnerability Spectre v1:                Mitigation; usercopy/swapgs barriers and __user pointer sanitization
Vulnerability Spectre v2:                Mitigation; Retpolines; STIBP disabled; RSB filling; PBRSB-eIBRS Not affected; BHI Retpoline
Vulnerability Srbds:                     Not affected
Vulnerability Tsa:                       Not affected
Vulnerability Tsx async abort:           Not affected
Vulnerability Vmscape:                   Not affected

```


## benchmark-build-summary.md

```text
## Maven Build Results

| Variant | NeqSim | Maven build |
| --- | --- | --- |
| baseline | 3.26.0 | passed |
| current | 3.27.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.26.0",
  "version": "3.26.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.26.0/neqsim-3.26.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.27.0",
  "version": "3.27.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.27.0/neqsim-3.27.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## baseline-build-exit-code.txt

```text
0

```


## baseline-build.log

```text
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------< com.equinor.neqsim:neqsim-benchmark >-----------------
[INFO] Building JMH benchmark sample: Java 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- dependency:3.8.1:build-classpath (default-cli) @ neqsim-benchmark ---
[INFO] Wrote classpath file '/home/runner/work/_temp/baseline-classpath.txt'.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  10.877 s
[INFO] Finished at: 2026-11-14T18:27:26Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.26.0 (neqsim-3.26.0.jar); requested: 3.26.0
$ mvn clean package -DskipTests -Dneqsim.version=3.26.0
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------< com.equinor.neqsim:neqsim-benchmark >-----------------
[INFO] Building JMH benchmark sample: Java 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:2.5:clean (default-clean) @ neqsim-benchmark ---
[INFO] 
[INFO] --- resources:3.4.0:resources (default-resources) @ neqsim-benchmark ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ neqsim-benchmark ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 19 source files with javac [debug release 17] to target/classes
[INFO] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/longrun/GasProcessingTrain.java: Some input files use or override a deprecated API.
[INFO] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/longrun/GasProcessingTrain.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- resources:3.4.0:testResources (default-testResources) @ neqsim-benchmark ---
[INFO] skip non existing resourceDirectory /home/runner/work/_temp/benchmark-project/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ neqsim-benchmark ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 6 source files with javac [debug release 17] to target/test-classes
[INFO] 
[INFO] --- surefire:3.5.2:test (default-test) @ neqsim-benchmark ---
[INFO] Tests are skipped.
[INFO] 
[INFO] --- jar:2.4:jar (default-jar) @ neqsim-benchmark ---
[INFO] Building jar: /home/runner/work/_temp/benchmark-project/target/neqsim-benchmark-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- shade:3.2.1:shade (default) @ neqsim-benchmark ---
[INFO] Including com.equinor.neqsim:neqsim:jar:3.26.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.26.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
[WARNING]   - org.apache.commons.math3.optim.linear.LinearOptimizer
[WARNING]   - org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaFieldStepInterpolator
[WARNING]   - org.apache.commons.math3.linear.LUDecomposition$Solver
[WARNING]   - org.apache.commons.math3.analysis.function.Gaussian$Parametric
[WARNING]   - org.apache.commons.math3.stat.descriptive.WeightedEvaluation
[WARNING]   - org.apache.commons.math3.analysis.FunctionUtils$3
[WARNING]   - org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic
[WARNING]   - org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer
[WARNING]   - org.apache.commons.math3.analysis.FunctionUtils$3$1
[WARNING]   - org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator
[WARNING]   - 1291 more...
[WARNING] maven-shade-plugin has detected that some class files are
[WARNING] present in two or more JARs. When this happens, only one
[WARNING] single version of the class is copied to the uber jar.
[WARNING] Usually this is not harmful and you can skip these warnings,
[WARNING] otherwise try to manually exclude artifacts based on
[WARNING] mvn dependency:tree -Ddetail=true and the above output.
[WARNING] See http://maven.apache.org/plugins/maven-shade-plugin/
[INFO] Replacing /home/runner/work/_temp/benchmark-project/target/benchmarks.jar with /home/runner/work/_temp/benchmark-project/target/neqsim-benchmark-1.0-SNAPSHOT-shaded.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  17.380 s
[INFO] Finished at: 2026-11-14T18:27:44Z
[INFO] ------------------------------------------------------------------------

```


## baseline-benchmarks.txt

```text
Benchmarks: 
com.equinor.neqsim.benchmark.flash.TPflash.testFlash
com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR
com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess
com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess
com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid
com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas
com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr
com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk
com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties
com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState
com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState
com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient
com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset
com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep
com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable
com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid
com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp
com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation
com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine
com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential
com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport
com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange
com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension
com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate
com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid
com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid

```


## baseline-benchmarks.log

```text
# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid

# Run progress: 0.00% complete, ETA 00:07:40
# Fork: 1 of 2
# Warmup Iteration   1: 31.075 ms/op
# Warmup Iteration   2: 23.891 ms/op
Iteration   1: 23.734 ms/op
Iteration   2: 23.417 ms/op
Iteration   3: 23.271 ms/op

# Run progress: 2.17% complete, ETA 00:09:13
# Fork: 2 of 2
# Warmup Iteration   1: 32.011 ms/op
# Warmup Iteration   2: 23.130 ms/op
Iteration   1: 23.193 ms/op
Iteration   2: 23.075 ms/op
Iteration   3: 23.009 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  23.283 ±(99.9%) 0.740 ms/op [Average]
  (min, avg, max) = (23.009, 23.283, 23.734), stdev = 0.264
  CI (99.9%): [22.543, 24.023] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas

# Run progress: 4.35% complete, ETA 00:08:59
# Fork: 1 of 2
# Warmup Iteration   1: 2.391 ms/op
# Warmup Iteration   2: 1.473 ms/op
Iteration   1: 1.417 ms/op
Iteration   2: 1.413 ms/op
Iteration   3: 1.420 ms/op

# Run progress: 6.52% complete, ETA 00:08:46
# Fork: 2 of 2
# Warmup Iteration   1: 3.618 ms/op
# Warmup Iteration   2: 1.647 ms/op
Iteration   1: 1.438 ms/op
Iteration   2: 1.436 ms/op
Iteration   3: 1.439 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.427 ±(99.9%) 0.033 ms/op [Average]
  (min, avg, max) = (1.413, 1.427, 1.439), stdev = 0.012
  CI (99.9%): [1.394, 1.460] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr

# Run progress: 8.70% complete, ETA 00:08:32
# Fork: 1 of 2
# Warmup Iteration   1: 12.675 ms/op
# Warmup Iteration   2: 7.254 ms/op
Iteration   1: 7.249 ms/op
Iteration   2: 7.096 ms/op
Iteration   3: 7.047 ms/op

# Run progress: 10.87% complete, ETA 00:08:19
# Fork: 2 of 2
# Warmup Iteration   1: 9.686 ms/op
# Warmup Iteration   2: 7.370 ms/op
Iteration   1: 7.221 ms/op
Iteration   2: 7.051 ms/op
Iteration   3: 6.980 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.107 ±(99.9%) 0.297 ms/op [Average]
  (min, avg, max) = (6.980, 7.107, 7.249), stdev = 0.106
  CI (99.9%): [6.810, 7.405] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk

# Run progress: 13.04% complete, ETA 00:08:06
# Fork: 1 of 2
# Warmup Iteration   1: 11.118 ms/op
# Warmup Iteration   2: 7.716 ms/op
Iteration   1: 7.626 ms/op
Iteration   2: 7.512 ms/op
Iteration   3: 7.475 ms/op

# Run progress: 15.22% complete, ETA 00:07:53
# Fork: 2 of 2
# Warmup Iteration   1: 12.283 ms/op
# Warmup Iteration   2: 7.734 ms/op
Iteration   1: 7.643 ms/op
Iteration   2: 7.646 ms/op
Iteration   3: 7.539 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  7.574 ±(99.9%) 0.208 ms/op [Average]
  (min, avg, max) = (7.475, 7.574, 7.646), stdev = 0.074
  CI (99.9%): [7.366, 7.782] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties

# Run progress: 17.39% complete, ETA 00:07:40
# Fork: 1 of 2
# Warmup Iteration   1: 28.337 ms/op
# Warmup Iteration   2: 13.258 ms/op
Iteration   1: 13.037 ms/op
Iteration   2: 13.153 ms/op
Iteration   3: 12.994 ms/op

# Run progress: 19.57% complete, ETA 00:07:28
# Fork: 2 of 2
# Warmup Iteration   1: 26.390 ms/op
# Warmup Iteration   2: 13.347 ms/op
Iteration   1: 13.251 ms/op
Iteration   2: 12.950 ms/op
Iteration   3: 12.930 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.053 ±(99.9%) 0.352 ms/op [Average]
  (min, avg, max) = (12.930, 13.053, 13.251), stdev = 0.126
  CI (99.9%): [12.700, 13.405] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.TPflash.testFlash

# Run progress: 21.74% complete, ETA 00:07:16
# Fork: 1 of 2
# Warmup Iteration   1: 2333.488 ms/op
# Warmup Iteration   2: 671.075 ms/op
Iteration   1: 524.742 ms/op
Iteration   2: 480.812 ms/op
Iteration   3: 487.540 ms/op

# Run progress: 23.91% complete, ETA 00:07:02
# Fork: 2 of 2
# Warmup Iteration   1: 2079.617 ms/op
# Warmup Iteration   2: 625.375 ms/op
Iteration   1: 536.168 ms/op
Iteration   2: 485.248 ms/op
Iteration   3: 482.486 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  499.499 ±(99.9%) 68.304 ms/op [Average]
  (min, avg, max) = (480.812, 499.499, 536.168), stdev = 24.358
  CI (99.9%): [431.195, 567.803] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR

# Run progress: 26.09% complete, ETA 00:06:49
# Fork: 1 of 2
# Warmup Iteration   1: 5305.310 ms/op
# Warmup Iteration   2: 2743.367 ms/op
Iteration   1: 2489.111 ms/op
Iteration   2: 2452.292 ms/op
Iteration   3: 2436.816 ms/op

# Run progress: 28.26% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 4393.939 ms/op
# Warmup Iteration   2: 4240.007 ms/op
Iteration   1: 2598.814 ms/op
Iteration   2: 2474.331 ms/op
Iteration   3: 2468.354 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  2486.619 ±(99.9%) 162.242 ms/op [Average]
  (min, avg, max) = (2436.816, 2486.619, 2598.814), stdev = 57.857
  CI (99.9%): [2324.377, 2648.861] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState

# Run progress: 30.43% complete, ETA 00:06:43
# Fork: 1 of 2
# Warmup Iteration   1: 1161.950 ms/op
# Warmup Iteration   2: 515.351 ms/op
Iteration   1: 494.014 ms/op
Iteration   2: 488.509 ms/op
Iteration   3: 488.665 ms/op

# Run progress: 32.61% complete, ETA 00:06:30
# Fork: 2 of 2
# Warmup Iteration   1: 1145.222 ms/op
# Warmup Iteration   2: 514.473 ms/op
Iteration   1: 493.635 ms/op
Iteration   2: 487.139 ms/op
Iteration   3: 484.580 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  489.424 ±(99.9%) 10.409 ms/op [Average]
  (min, avg, max) = (484.580, 489.424, 494.014), stdev = 3.712
  CI (99.9%): [479.014, 499.833] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState

# Run progress: 34.78% complete, ETA 00:06:16
# Fork: 1 of 2
# Warmup Iteration   1: 2309.890 ms/op
# Warmup Iteration   2: 1142.199 ms/op
Iteration   1: 1070.771 ms/op
Iteration   2: 1050.412 ms/op
Iteration   3: 1046.349 ms/op

# Run progress: 36.96% complete, ETA 00:06:01
# Fork: 2 of 2
# Warmup Iteration   1: 2274.766 ms/op
# Warmup Iteration   2: 1120.838 ms/op
Iteration   1: 1066.814 ms/op
Iteration   2: 1043.366 ms/op
Iteration   3: 1039.485 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1052.866 ±(99.9%) 36.193 ms/op [Average]
  (min, avg, max) = (1039.485, 1052.866, 1070.771), stdev = 12.907
  CI (99.9%): [1016.673, 1089.059] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation
# Parameters: (nodes = 20)

# Run progress: 39.13% complete, ETA 00:05:46
# Fork: 1 of 2
# Warmup Iteration   1: 0.199 ms/op
# Warmup Iteration   2: 0.137 ms/op
Iteration   1: 0.139 ms/op
Iteration   2: 0.135 ms/op
Iteration   3: 0.135 ms/op

# Run progress: 41.30% complete, ETA 00:05:31
# Fork: 2 of 2
# Warmup Iteration   1: 0.206 ms/op
# Warmup Iteration   2: 0.135 ms/op
Iteration   1: 0.139 ms/op
Iteration   2: 0.137 ms/op
Iteration   3: 0.138 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.137 ±(99.9%) 0.005 ms/op [Average]
  (min, avg, max) = (0.135, 0.137, 0.139), stdev = 0.002
  CI (99.9%): [0.132, 0.143] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation
# Parameters: (nodes = 100)

# Run progress: 43.48% complete, ETA 00:05:16
# Fork: 1 of 2
# Warmup Iteration   1: 12.942 ms/op
# Warmup Iteration   2: 9.405 ms/op
Iteration   1: 9.274 ms/op
Iteration   2: 9.270 ms/op
Iteration   3: 9.282 ms/op

# Run progress: 45.65% complete, ETA 00:05:02
# Fork: 2 of 2
# Warmup Iteration   1: 13.037 ms/op
# Warmup Iteration   2: 9.415 ms/op
Iteration   1: 9.284 ms/op
Iteration   2: 9.277 ms/op
Iteration   3: 9.278 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  9.278 ±(99.9%) 0.014 ms/op [Average]
  (min, avg, max) = (9.270, 9.278, 9.284), stdev = 0.005
  CI (99.9%): [9.263, 9.292] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine

# Run progress: 47.83% complete, ETA 00:04:47
# Fork: 1 of 2
# Warmup Iteration   1: 0.910 ms/op
# Warmup Iteration   2: 0.636 ms/op
Iteration   1: 0.630 ms/op
Iteration   2: 0.632 ms/op
Iteration   3: 0.632 ms/op

# Run progress: 50.00% complete, ETA 00:04:34
# Fork: 2 of 2
# Warmup Iteration   1: 0.903 ms/op
# Warmup Iteration   2: 0.636 ms/op
Iteration   1: 0.633 ms/op
Iteration   2: 0.632 ms/op
Iteration   3: 0.633 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.632 ±(99.9%) 0.003 ms/op [Average]
  (min, avg, max) = (0.630, 0.632, 0.633), stdev = 0.001
  CI (99.9%): [0.629, 0.635] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential

# Run progress: 52.17% complete, ETA 00:04:20
# Fork: 1 of 2
# Warmup Iteration   1: 2.295 ms/op
# Warmup Iteration   2: 1.670 ms/op
Iteration   1: 1.649 ms/op
Iteration   2: 1.640 ms/op
Iteration   3: 1.634 ms/op

# Run progress: 54.35% complete, ETA 00:04:07
# Fork: 2 of 2
# Warmup Iteration   1: 2.266 ms/op
# Warmup Iteration   2: 1.689 ms/op
Iteration   1: 1.649 ms/op
Iteration   2: 1.643 ms/op
Iteration   3: 1.633 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.641 ±(99.9%) 0.020 ms/op [Average]
  (min, avg, max) = (1.633, 1.641, 1.649), stdev = 0.007
  CI (99.9%): [1.621, 1.661] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess

# Run progress: 56.52% complete, ETA 00:03:54
# Fork: 1 of 2
# Warmup Iteration   1: 204.211 ms/op
# Warmup Iteration   2: 52.852 ms/op
Iteration   1: 31.890 ms/op
Iteration   2: 29.977 ms/op
Iteration   3: 24.230 ms/op

# Run progress: 58.70% complete, ETA 00:03:41
# Fork: 2 of 2
# Warmup Iteration   1: 202.870 ms/op
# Warmup Iteration   2: 37.217 ms/op
Iteration   1: 27.294 ms/op
Iteration   2: 23.464 ms/op
Iteration   3: 22.849 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  26.617 ±(99.9%) 10.446 ms/op [Average]
  (min, avg, max) = (22.849, 26.617, 31.890), stdev = 3.725
  CI (99.9%): [16.171, 37.064] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport

# Run progress: 60.87% complete, ETA 00:03:29
# Fork: 1 of 2
# Warmup Iteration   1: 120194.790 ms/op
# Warmup Iteration   2: 115850.075 ms/op
Iteration   1: 115552.394 ms/op
Iteration   2: 115523.260 ms/op
Iteration   3: 115260.463 ms/op

# Run progress: 63.04% complete, ETA 00:08:53
# Fork: 2 of 2
# Warmup Iteration   1: 120232.984 ms/op
# Warmup Iteration   2: 115582.200 ms/op
Iteration   1: 115688.093 ms/op
Iteration   2: 115499.056 ms/op
Iteration   3: 115068.105 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  115431.895 ±(99.9%) 632.961 ms/op [Average]
  (min, avg, max) = (115068.105, 115431.895, 115688.093), stdev = 225.720
  CI (99.9%): [114798.934, 116064.857] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange

# Run progress: 65.22% complete, ETA 00:13:16
# Fork: 1 of 2
# Warmup Iteration   1: 9736.992 ms/op
# Warmup Iteration   2: 6220.935 ms/op
Iteration   1: 5882.306 ms/op
Iteration   2: 3698.904 ms/op
Iteration   3: 5807.791 ms/op

# Run progress: 67.39% complete, ETA 00:15:38
# Fork: 2 of 2
# Warmup Iteration   1: 9642.633 ms/op
# Warmup Iteration   2: 6092.381 ms/op
Iteration   1: 5821.548 ms/op
Iteration   2: 3619.011 ms/op
Iteration   3: 5759.735 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  5098.216 ±(99.9%) 3128.958 ms/op [Average]
  (min, avg, max) = (3619.011, 5098.216, 5882.306), stdev = 1115.816
  CI (99.9%): [1969.258, 8227.173] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess

# Run progress: 69.57% complete, ETA 00:17:19
# Fork: 1 of 2
# Warmup Iteration   1: 10856.060 ms/op
# Warmup Iteration   2: 8409.636 ms/op
Iteration   1: 8163.053 ms/op
Iteration   2: 8275.540 ms/op
Iteration   3: 8169.942 ms/op

# Run progress: 71.74% complete, ETA 00:15:53
# Fork: 2 of 2
# Warmup Iteration   1: 10989.089 ms/op
# Warmup Iteration   2: 8428.426 ms/op
Iteration   1: 8205.356 ms/op
Iteration   2: 8269.788 ms/op
Iteration   3: 8117.776 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  8200.242 ±(99.9%) 175.724 ms/op [Average]
  (min, avg, max) = (8117.776, 8200.242, 8275.540), stdev = 62.665
  CI (99.9%): [8024.518, 8375.966] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension
# Parameters: (model = Full Gradient Theory)

# Run progress: 73.91% complete, ETA 00:14:29
# Fork: 1 of 2
# Warmup Iteration   1: Nov 14, 2026 7:21:06 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 14, 2026 7:21:06 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
81.761 ms/op
# Warmup Iteration   2: 61.706 ms/op
Iteration   1: 61.536 ms/op
Iteration   2: 60.908 ms/op
Iteration   3: 61.208 ms/op

# Run progress: 76.09% complete, ETA 00:12:58
# Fork: 2 of 2
# Warmup Iteration   1: Nov 14, 2026 7:21:17 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 14, 2026 7:21:17 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
91.094 ms/op
# Warmup Iteration   2: 61.415 ms/op
Iteration   1: 61.259 ms/op
Iteration   2: 61.100 ms/op
Iteration   3: 61.160 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  61.195 ±(99.9%) 0.579 ms/op [Average]
  (min, avg, max) = (60.908, 61.195, 61.536), stdev = 0.206
  CI (99.9%): [60.617, 61.774] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension
# Parameters: (model = Simple Gradient Theory)

# Run progress: 78.26% complete, ETA 00:11:30
# Fork: 1 of 2
# Warmup Iteration   1: 65.646 ms/op
# Warmup Iteration   2: 58.727 ms/op
Iteration   1: 58.530 ms/op
Iteration   2: 58.201 ms/op
Iteration   3: 58.059 ms/op

# Run progress: 80.43% complete, ETA 00:10:07
# Fork: 2 of 2
# Warmup Iteration   1: 85.563 ms/op
# Warmup Iteration   2: 57.931 ms/op
Iteration   1: 57.571 ms/op
Iteration   2: 56.527 ms/op
Iteration   3: 56.576 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  57.577 ±(99.9%) 2.391 ms/op [Average]
  (min, avg, max) = (56.527, 57.577, 58.530), stdev = 0.853
  CI (99.9%): [55.186, 59.969] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension
# Parameters: (model = Parachor)

# Run progress: 82.61% complete, ETA 00:08:48
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:07:32
# Fork: 2 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  ≈ 10⁻³ ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate

# Run progress: 86.96% complete, ETA 00:06:20
# Fork: 1 of 2
# Warmup Iteration   1: 29.928 ms/op
# Warmup Iteration   2: 23.821 ms/op
Iteration   1: 22.714 ms/op
Iteration   2: 21.997 ms/op
Iteration   3: 21.935 ms/op

# Run progress: 89.13% complete, ETA 00:05:10
# Fork: 2 of 2
# Warmup Iteration   1: 31.297 ms/op
# Warmup Iteration   2: 23.426 ms/op
Iteration   1: 22.871 ms/op
Iteration   2: 22.341 ms/op
Iteration   3: 22.012 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  22.312 ±(99.9%) 1.126 ms/op [Average]
  (min, avg, max) = (21.935, 22.312, 22.871), stdev = 0.401
  CI (99.9%): [21.186, 23.437] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid

# Run progress: 91.30% complete, ETA 00:04:03
# Fork: 1 of 2
# Warmup Iteration   1: 13.897 ms/op
# Warmup Iteration   2: 10.338 ms/op
Iteration   1: 10.055 ms/op
Iteration   2: 9.832 ms/op
Iteration   3: 9.803 ms/op

# Run progress: 93.48% complete, ETA 00:02:59
# Fork: 2 of 2
# Warmup Iteration   1: 13.194 ms/op
# Warmup Iteration   2: 10.090 ms/op
Iteration   1: 10.077 ms/op
Iteration   2: 9.673 ms/op
Iteration   3: 9.759 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.867 ±(99.9%) 0.459 ms/op [Average]
  (min, avg, max) = (9.673, 9.867, 10.077), stdev = 0.164
  CI (99.9%): [9.407, 10.326] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid

# Run progress: 95.65% complete, ETA 00:01:57
# Fork: 1 of 2
# Warmup Iteration   1: 26.890 ms/op
# Warmup Iteration   2: 22.687 ms/op
Iteration   1: 22.826 ms/op
Iteration   2: 22.682 ms/op
Iteration   3: 22.588 ms/op

# Run progress: 97.83% complete, ETA 00:00:57
# Fork: 2 of 2
# Warmup Iteration   1: 26.263 ms/op
# Warmup Iteration   2: 22.679 ms/op
Iteration   1: 22.693 ms/op
Iteration   2: 22.587 ms/op
Iteration   3: 22.526 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  22.651 ±(99.9%) 0.299 ms/op [Average]
  (min, avg, max) = (22.526, 22.651, 22.826), stdev = 0.107
  CI (99.9%): [22.351, 22.950] (assumes normal distribution)


# Run complete. Total time: 00:43:24

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark                                                                                            (model)  (nodes)  Mode  Cnt       Score      Error  Units
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6      23.283 ±    0.740  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6       1.427 ±    0.033  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6       7.107 ±    0.297  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6       7.574 ±    0.208  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      13.053 ±    0.352  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6     499.499 ±   68.304  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    2486.619 ±  162.242  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6     489.424 ±   10.409  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    1052.866 ±   36.193  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6       0.137 ±    0.005  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6       9.278 ±    0.014  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6       0.632 ±    0.003  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6       1.641 ±    0.020  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6      26.617 ±   10.446  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  115431.895 ±  632.961  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6    5098.216 ± 3128.958  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6    8200.242 ±  175.724  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6      61.195 ±    0.579  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6      57.577 ±    2.391  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6      ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      22.312 ±    1.126  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6       9.867 ±    0.459  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6      22.651 ±    0.299  ms/op

Benchmark result is saved to /home/runner/work/_temp/baseline-regular-benchmarks.json
# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient

# Run progress: 0.00% complete, ETA 00:00:00
# Fork: 1 of 1
Iteration   1: 72553.266 ms/op
Iteration   2: 69013.414 ms/op


Result "com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient":
  70783.340 ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset

# Run progress: 14.29% complete, ETA 00:14:11
# Fork: 1 of 1
Iteration   1: 396404.750 ms/op
Iteration   2: 392832.871 ms/op


Result "com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset":
  394618.811 ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep
# Parameters: (eos = SRK)

# Run progress: 28.57% complete, ETA 00:38:48
# Fork: 1 of 1
Iteration   1: 40713.450 ms/op
Iteration   2: 35166.193 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  37939.822 ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep
# Parameters: (eos = PR)

# Run progress: 42.86% complete, ETA 00:22:25
# Fork: 1 of 1
Iteration   1: 41516.314 ms/op
Iteration   2: 36410.700 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  38963.507 ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable

# Run progress: 57.14% complete, ETA 00:13:36
# Fork: 1 of 1
Iteration   1: 31351.676 ms/op
Iteration   2: 27154.321 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable":
  29252.999 ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid

# Run progress: 71.43% complete, ETA 00:07:38
# Fork: 1 of 1
Iteration   1: 34968.327 ms/op
Iteration   2: 28726.255 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid":
  31847.291 ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp

# Run progress: 85.71% complete, ETA 00:03:21
# Fork: 1 of 1
Iteration   1: 68780.309 ms/op
Iteration   2: 66725.630 ms/op


Result "com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp":
  67752.970 ms/op


# Run complete. Total time: 00:22:26

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark                                               (eos)  Mode  Cnt       Score   Error  Units
DynamicProcessBenchmark.separationControlTransient        N/A  avgt    2   70783.340          ms/op
MlTrainingDataBenchmark.processSurrogateDataset           N/A  avgt    2  394618.811          ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep        SRK  avgt    2   37939.822          ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep         PR  avgt    2   38963.507          ms/op
PropertyTableBenchmark.olgaThreePhaseTable                N/A  avgt    2   29252.999          ms/op
PropertyTableBenchmark.tpPropertyGrid                     N/A  avgt    2   31847.291          ms/op
TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp    N/A  avgt    2   67752.970          ms/op

Benchmark result is saved to /home/runner/work/_temp/baseline-long-running-benchmarks.json

```


## current-build-exit-code.txt

```text
0

```


## current-build.log

```text
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------< com.equinor.neqsim:neqsim-benchmark >-----------------
[INFO] Building JMH benchmark sample: Java 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- dependency:3.8.1:build-classpath (default-cli) @ neqsim-benchmark ---
[INFO] Wrote classpath file '/home/runner/work/_temp/current-classpath.txt'.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.089 s
[INFO] Finished at: 2026-11-14T19:45:56Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.27.0 (neqsim-3.27.0.jar); requested: 3.27.0
$ mvn clean package -DskipTests -Dneqsim.version=3.27.0
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------< com.equinor.neqsim:neqsim-benchmark >-----------------
[INFO] Building JMH benchmark sample: Java 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:2.5:clean (default-clean) @ neqsim-benchmark ---
[INFO] Deleting /home/runner/work/_temp/benchmark-project/target
[INFO] 
[INFO] --- resources:3.4.0:resources (default-resources) @ neqsim-benchmark ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ neqsim-benchmark ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 19 source files with javac [debug release 17] to target/classes
[INFO] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/longrun/GasProcessingTrain.java: Some input files use or override a deprecated API.
[INFO] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/longrun/GasProcessingTrain.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- resources:3.4.0:testResources (default-testResources) @ neqsim-benchmark ---
[INFO] skip non existing resourceDirectory /home/runner/work/_temp/benchmark-project/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ neqsim-benchmark ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 6 source files with javac [debug release 17] to target/test-classes
[INFO] 
[INFO] --- surefire:3.5.2:test (default-test) @ neqsim-benchmark ---
[INFO] Tests are skipped.
[INFO] 
[INFO] --- jar:2.4:jar (default-jar) @ neqsim-benchmark ---
[INFO] Building jar: /home/runner/work/_temp/benchmark-project/target/neqsim-benchmark-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- shade:3.2.1:shade (default) @ neqsim-benchmark ---
[INFO] Including com.equinor.neqsim:neqsim:jar:3.27.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] commons-math3-3.6.1.jar, neqsim-3.27.0.jar define 1301 overlapping classes: 
[WARNING]   - org.apache.commons.math3.optim.linear.LinearOptimizer
[WARNING]   - org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaFieldStepInterpolator
[WARNING]   - org.apache.commons.math3.linear.LUDecomposition$Solver
[WARNING]   - org.apache.commons.math3.analysis.function.Gaussian$Parametric
[WARNING]   - org.apache.commons.math3.stat.descriptive.WeightedEvaluation
[WARNING]   - org.apache.commons.math3.analysis.FunctionUtils$3
[WARNING]   - org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic
[WARNING]   - org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer
[WARNING]   - org.apache.commons.math3.analysis.FunctionUtils$3$1
[WARNING]   - org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator
[WARNING]   - 1291 more...
[WARNING] maven-shade-plugin has detected that some class files are
[WARNING] present in two or more JARs. When this happens, only one
[WARNING] single version of the class is copied to the uber jar.
[WARNING] Usually this is not harmful and you can skip these warnings,
[WARNING] otherwise try to manually exclude artifacts based on
[WARNING] mvn dependency:tree -Ddetail=true and the above output.
[WARNING] See http://maven.apache.org/plugins/maven-shade-plugin/
[INFO] Replacing /home/runner/work/_temp/benchmark-project/target/benchmarks.jar with /home/runner/work/_temp/benchmark-project/target/neqsim-benchmark-1.0-SNAPSHOT-shaded.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  10.665 s
[INFO] Finished at: 2026-11-14T19:46:08Z
[INFO] ------------------------------------------------------------------------

```


## current-benchmarks.txt

```text
Benchmarks: 
com.equinor.neqsim.benchmark.flash.TPflash.testFlash
com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR
com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess
com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess
com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid
com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas
com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr
com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk
com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties
com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState
com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState
com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient
com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset
com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep
com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable
com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid
com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp
com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation
com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine
com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential
com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport
com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange
com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension
com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate
com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid
com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid

```


## current-benchmarks.log

```text
# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid

# Run progress: 0.00% complete, ETA 00:07:40
# Fork: 1 of 2
# Warmup Iteration   1: 30.006 ms/op
# Warmup Iteration   2: 20.554 ms/op
Iteration   1: 20.243 ms/op
Iteration   2: 19.781 ms/op
Iteration   3: 19.619 ms/op

# Run progress: 2.17% complete, ETA 00:09:12
# Fork: 2 of 2
# Warmup Iteration   1: 25.109 ms/op
# Warmup Iteration   2: 20.097 ms/op
Iteration   1: 20.033 ms/op
Iteration   2: 19.786 ms/op
Iteration   3: 19.868 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  19.888 ±(99.9%) 0.617 ms/op [Average]
  (min, avg, max) = (19.619, 19.888, 20.243), stdev = 0.220
  CI (99.9%): [19.272, 20.505] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas

# Run progress: 4.35% complete, ETA 00:08:56
# Fork: 1 of 2
# Warmup Iteration   1: 3.822 ms/op
# Warmup Iteration   2: 2.039 ms/op
Iteration   1: 1.826 ms/op
Iteration   2: 1.824 ms/op
Iteration   3: 1.824 ms/op

# Run progress: 6.52% complete, ETA 00:08:43
# Fork: 2 of 2
# Warmup Iteration   1: 3.194 ms/op
# Warmup Iteration   2: 1.941 ms/op
Iteration   1: 1.838 ms/op
Iteration   2: 1.844 ms/op
Iteration   3: 1.828 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.831 ±(99.9%) 0.023 ms/op [Average]
  (min, avg, max) = (1.824, 1.831, 1.844), stdev = 0.008
  CI (99.9%): [1.808, 1.854] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr

# Run progress: 8.70% complete, ETA 00:08:29
# Fork: 1 of 2
# Warmup Iteration   1: 13.446 ms/op
# Warmup Iteration   2: 8.697 ms/op
Iteration   1: 7.884 ms/op
Iteration   2: 7.994 ms/op
Iteration   3: 7.715 ms/op

# Run progress: 10.87% complete, ETA 00:08:17
# Fork: 2 of 2
# Warmup Iteration   1: 15.230 ms/op
# Warmup Iteration   2: 9.188 ms/op
Iteration   1: 7.973 ms/op
Iteration   2: 7.945 ms/op
Iteration   3: 7.824 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.889 ±(99.9%) 0.296 ms/op [Average]
  (min, avg, max) = (7.715, 7.889, 7.994), stdev = 0.105
  CI (99.9%): [7.593, 8.185] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk

# Run progress: 13.04% complete, ETA 00:08:05
# Fork: 1 of 2
# Warmup Iteration   1: 12.852 ms/op
# Warmup Iteration   2: 9.511 ms/op
Iteration   1: 8.237 ms/op
Iteration   2: 8.122 ms/op
Iteration   3: 8.030 ms/op

# Run progress: 15.22% complete, ETA 00:07:53
# Fork: 2 of 2
# Warmup Iteration   1: 14.112 ms/op
# Warmup Iteration   2: 8.459 ms/op
Iteration   1: 8.174 ms/op
Iteration   2: 8.134 ms/op
Iteration   3: 7.924 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  8.103 ±(99.9%) 0.311 ms/op [Average]
  (min, avg, max) = (7.924, 8.103, 8.237), stdev = 0.111
  CI (99.9%): [7.792, 8.415] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties

# Run progress: 17.39% complete, ETA 00:07:41
# Fork: 1 of 2
# Warmup Iteration   1: 32.426 ms/op
# Warmup Iteration   2: 15.129 ms/op
Iteration   1: 13.725 ms/op
Iteration   2: 13.412 ms/op
Iteration   3: 13.517 ms/op

# Run progress: 19.57% complete, ETA 00:07:29
# Fork: 2 of 2
# Warmup Iteration   1: 23.540 ms/op
# Warmup Iteration   2: 14.305 ms/op
Iteration   1: 13.537 ms/op
Iteration   2: 13.377 ms/op
Iteration   3: 13.368 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.489 ±(99.9%) 0.381 ms/op [Average]
  (min, avg, max) = (13.368, 13.489, 13.725), stdev = 0.136
  CI (99.9%): [13.108, 13.870] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.TPflash.testFlash

# Run progress: 21.74% complete, ETA 00:07:17
# Fork: 1 of 2
# Warmup Iteration   1: 2374.360 ms/op
# Warmup Iteration   2: 776.581 ms/op
Iteration   1: 546.825 ms/op
Iteration   2: 513.340 ms/op
Iteration   3: 519.702 ms/op

# Run progress: 23.91% complete, ETA 00:07:02
# Fork: 2 of 2
# Warmup Iteration   1: 2143.699 ms/op
# Warmup Iteration   2: 711.493 ms/op
Iteration   1: 550.909 ms/op
Iteration   2: 509.832 ms/op
Iteration   3: 506.831 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  524.573 ±(99.9%) 54.241 ms/op [Average]
  (min, avg, max) = (506.831, 524.573, 550.909), stdev = 19.343
  CI (99.9%): [470.332, 578.814] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR

# Run progress: 26.09% complete, ETA 00:06:46
# Fork: 1 of 2
# Warmup Iteration   1: 5254.435 ms/op
# Warmup Iteration   2: 2876.248 ms/op
Iteration   1: 2616.176 ms/op
Iteration   2: 2569.964 ms/op
Iteration   3: 2600.445 ms/op

# Run progress: 28.26% complete, ETA 00:06:45
# Fork: 2 of 2
# Warmup Iteration   1: 5496.539 ms/op
# Warmup Iteration   2: 3322.973 ms/op
Iteration   1: 2654.308 ms/op
Iteration   2: 2648.091 ms/op
Iteration   3: 2631.082 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  2620.011 ±(99.9%) 88.584 ms/op [Average]
  (min, avg, max) = (2569.964, 2620.011, 2654.308), stdev = 31.590
  CI (99.9%): [2531.427, 2708.595] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState

# Run progress: 30.43% complete, ETA 00:06:44
# Fork: 1 of 2
# Warmup Iteration   1: 1200.108 ms/op
# Warmup Iteration   2: 556.427 ms/op
Iteration   1: 534.183 ms/op
Iteration   2: 525.059 ms/op
Iteration   3: 519.751 ms/op

# Run progress: 32.61% complete, ETA 00:06:28
# Fork: 2 of 2
# Warmup Iteration   1: 1194.280 ms/op
# Warmup Iteration   2: 549.947 ms/op
Iteration   1: 527.867 ms/op
Iteration   2: 517.492 ms/op
Iteration   3: 512.751 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  522.851 ±(99.9%) 21.678 ms/op [Average]
  (min, avg, max) = (512.751, 522.851, 534.183), stdev = 7.730
  CI (99.9%): [501.173, 544.528] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState

# Run progress: 34.78% complete, ETA 00:06:13
# Fork: 1 of 2
# Warmup Iteration   1: 2474.549 ms/op
# Warmup Iteration   2: 1175.427 ms/op
Iteration   1: 1085.987 ms/op
Iteration   2: 1057.550 ms/op
Iteration   3: 1051.667 ms/op

# Run progress: 36.96% complete, ETA 00:05:59
# Fork: 2 of 2
# Warmup Iteration   1: 2410.875 ms/op
# Warmup Iteration   2: 1106.413 ms/op
Iteration   1: 1121.465 ms/op
Iteration   2: 1052.209 ms/op
Iteration   3: 1052.164 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1070.174 ±(99.9%) 79.609 ms/op [Average]
  (min, avg, max) = (1051.667, 1070.174, 1121.465), stdev = 28.389
  CI (99.9%): [990.565, 1149.782] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation
# Parameters: (nodes = 20)

# Run progress: 39.13% complete, ETA 00:05:45
# Fork: 1 of 2
# Warmup Iteration   1: 0.181 ms/op
# Warmup Iteration   2: 0.142 ms/op
Iteration   1: 0.136 ms/op
Iteration   2: 0.140 ms/op
Iteration   3: 0.143 ms/op

# Run progress: 41.30% complete, ETA 00:05:29
# Fork: 2 of 2
# Warmup Iteration   1: 0.216 ms/op
# Warmup Iteration   2: 0.138 ms/op
Iteration   1: 0.133 ms/op
Iteration   2: 0.132 ms/op
Iteration   3: 0.131 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.136 ±(99.9%) 0.013 ms/op [Average]
  (min, avg, max) = (0.131, 0.136, 0.143), stdev = 0.005
  CI (99.9%): [0.123, 0.149] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation
# Parameters: (nodes = 100)

# Run progress: 43.48% complete, ETA 00:05:15
# Fork: 1 of 2
# Warmup Iteration   1: 12.789 ms/op
# Warmup Iteration   2: 9.409 ms/op
Iteration   1: 9.356 ms/op
Iteration   2: 9.396 ms/op
Iteration   3: 9.357 ms/op

# Run progress: 45.65% complete, ETA 00:05:00
# Fork: 2 of 2
# Warmup Iteration   1: 13.115 ms/op
# Warmup Iteration   2: 9.450 ms/op
Iteration   1: 9.313 ms/op
Iteration   2: 9.362 ms/op
Iteration   3: 9.322 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  9.351 ±(99.9%) 0.084 ms/op [Average]
  (min, avg, max) = (9.313, 9.351, 9.396), stdev = 0.030
  CI (99.9%): [9.267, 9.435] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine

# Run progress: 47.83% complete, ETA 00:04:46
# Fork: 1 of 2
# Warmup Iteration   1: 0.910 ms/op
# Warmup Iteration   2: 0.630 ms/op
Iteration   1: 0.628 ms/op
Iteration   2: 0.624 ms/op
Iteration   3: 0.625 ms/op

# Run progress: 50.00% complete, ETA 00:04:33
# Fork: 2 of 2
# Warmup Iteration   1: 0.922 ms/op
# Warmup Iteration   2: 0.626 ms/op
Iteration   1: 0.623 ms/op
Iteration   2: 0.624 ms/op
Iteration   3: 0.624 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.625 ±(99.9%) 0.005 ms/op [Average]
  (min, avg, max) = (0.623, 0.625, 0.628), stdev = 0.002
  CI (99.9%): [0.620, 0.630] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential

# Run progress: 52.17% complete, ETA 00:04:19
# Fork: 1 of 2
# Warmup Iteration   1: 2.352 ms/op
# Warmup Iteration   2: 1.670 ms/op
Iteration   1: 1.634 ms/op
Iteration   2: 1.630 ms/op
Iteration   3: 1.633 ms/op

# Run progress: 54.35% complete, ETA 00:04:06
# Fork: 2 of 2
# Warmup Iteration   1: 2.345 ms/op
# Warmup Iteration   2: 1.664 ms/op
Iteration   1: 1.651 ms/op
Iteration   2: 1.654 ms/op
Iteration   3: 1.660 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.644 ±(99.9%) 0.036 ms/op [Average]
  (min, avg, max) = (1.630, 1.644, 1.660), stdev = 0.013
  CI (99.9%): [1.607, 1.680] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess

# Run progress: 56.52% complete, ETA 00:03:53
# Fork: 1 of 2
# Warmup Iteration   1: 258.913 ms/op
# Warmup Iteration   2: 39.712 ms/op
Iteration   1: 29.757 ms/op
Iteration   2: 25.145 ms/op
Iteration   3: 23.369 ms/op

# Run progress: 58.70% complete, ETA 00:03:41
# Fork: 2 of 2
# Warmup Iteration   1: 202.515 ms/op
# Warmup Iteration   2: 56.412 ms/op
Iteration   1: 32.839 ms/op
Iteration   2: 25.649 ms/op
Iteration   3: 26.742 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  27.250 ±(99.9%) 9.701 ms/op [Average]
  (min, avg, max) = (23.369, 27.250, 32.839), stdev = 3.460
  CI (99.9%): [17.549, 36.952] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport

# Run progress: 60.87% complete, ETA 00:03:28
# Fork: 1 of 2
# Warmup Iteration   1: 67697.133 ms/op
# Warmup Iteration   2: 63967.743 ms/op
Iteration   1: 63527.749 ms/op
Iteration   2: 63659.845 ms/op
Iteration   3: 63854.741 ms/op

# Run progress: 63.04% complete, ETA 00:06:20
# Fork: 2 of 2
# Warmup Iteration   1: 66404.628 ms/op
# Warmup Iteration   2: 62683.391 ms/op
Iteration   1: 62528.037 ms/op
Iteration   2: 62400.206 ms/op
Iteration   3: 62396.942 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  63061.253 ±(99.9%) 1929.870 ms/op [Average]
  (min, avg, max) = (62396.942, 63061.253, 63854.741), stdev = 688.210
  CI (99.9%): [61131.384, 64991.123] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange

# Run progress: 65.22% complete, ETA 00:08:35
# Fork: 1 of 2
# Warmup Iteration   1: 9145.899 ms/op
# Warmup Iteration   2: 3518.772 ms/op
Iteration   1: 5504.031 ms/op
Iteration   2: 3644.368 ms/op
Iteration   3: 4947.857 ms/op

# Run progress: 67.39% complete, ETA 00:10:40
# Fork: 2 of 2
# Warmup Iteration   1: 8922.680 ms/op
# Warmup Iteration   2: 3412.680 ms/op
Iteration   1: 5381.957 ms/op
Iteration   2: 3589.123 ms/op
Iteration   3: 4835.532 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  4650.478 ±(99.9%) 2354.524 ms/op [Average]
  (min, avg, max) = (3589.123, 4650.478, 5504.031), stdev = 839.646
  CI (99.9%): [2295.954, 7005.002] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess

# Run progress: 69.57% complete, ETA 00:12:12
# Fork: 1 of 2
# Warmup Iteration   1: 9305.343 ms/op
# Warmup Iteration   2: 6901.111 ms/op
Iteration   1: 6492.905 ms/op
Iteration   2: 6470.612 ms/op
Iteration   3: 6384.652 ms/op

# Run progress: 71.74% complete, ETA 00:11:13
# Fork: 2 of 2
# Warmup Iteration   1: 9483.724 ms/op
# Warmup Iteration   2: 6938.429 ms/op
Iteration   1: 6479.244 ms/op
Iteration   2: 6462.915 ms/op
Iteration   3: 6411.276 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6450.267 ±(99.9%) 119.350 ms/op [Average]
  (min, avg, max) = (6384.652, 6450.267, 6492.905), stdev = 42.561
  CI (99.9%): [6330.918, 6569.617] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension
# Parameters: (model = Full Gradient Theory)

# Run progress: 73.91% complete, ETA 00:10:15
# Fork: 1 of 2
# Warmup Iteration   1: Nov 14, 2026 8:25:11 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 14, 2026 8:25:11 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
6.715 ms/op
# Warmup Iteration   2: 3.930 ms/op
Iteration   1: 3.870 ms/op
Iteration   2: 3.852 ms/op
Iteration   3: 3.837 ms/op

# Run progress: 76.09% complete, ETA 00:09:12
# Fork: 2 of 2
# Warmup Iteration   1: Nov 14, 2026 8:25:22 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 14, 2026 8:25:22 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
6.605 ms/op
# Warmup Iteration   2: 4.015 ms/op
Iteration   1: 3.877 ms/op
Iteration   2: 3.874 ms/op
Iteration   3: 3.843 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  3.859 ±(99.9%) 0.048 ms/op [Average]
  (min, avg, max) = (3.837, 3.859, 3.877), stdev = 0.017
  CI (99.9%): [3.811, 3.906] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension
# Parameters: (model = Simple Gradient Theory)

# Run progress: 78.26% complete, ETA 00:08:11
# Fork: 1 of 2
# Warmup Iteration   1: 22.636 ms/op
# Warmup Iteration   2: 18.468 ms/op
Iteration   1: 20.019 ms/op
Iteration   2: 19.945 ms/op
Iteration   3: 19.766 ms/op

# Run progress: 80.43% complete, ETA 00:07:12
# Fork: 2 of 2
# Warmup Iteration   1: 23.606 ms/op
# Warmup Iteration   2: 18.695 ms/op
Iteration   1: 18.977 ms/op
Iteration   2: 18.672 ms/op
Iteration   3: 18.677 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  19.343 ±(99.9%) 1.785 ms/op [Average]
  (min, avg, max) = (18.672, 19.343, 20.019), stdev = 0.637
  CI (99.9%): [17.558, 21.128] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension
# Parameters: (model = Parachor)

# Run progress: 82.61% complete, ETA 00:06:17
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:05:23
# Fork: 2 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: 0.001 ms/op
Iteration   1: 0.001 ms/op
Iteration   2: 0.001 ms/op
Iteration   3: 0.001 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  ≈ 10⁻³ ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate

# Run progress: 86.96% complete, ETA 00:04:32
# Fork: 1 of 2
# Warmup Iteration   1: 71.059 ms/op
# Warmup Iteration   2: 56.148 ms/op
Iteration   1: 54.791 ms/op
Iteration   2: 54.097 ms/op
Iteration   3: 53.044 ms/op

# Run progress: 89.13% complete, ETA 00:03:42
# Fork: 2 of 2
# Warmup Iteration   1: 69.909 ms/op
# Warmup Iteration   2: 56.285 ms/op
Iteration   1: 55.712 ms/op
Iteration   2: 54.130 ms/op
Iteration   3: 53.698 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  54.245 ±(99.9%) 2.578 ms/op [Average]
  (min, avg, max) = (53.044, 54.245, 55.712), stdev = 0.919
  CI (99.9%): [51.667, 56.824] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid

# Run progress: 91.30% complete, ETA 00:02:54
# Fork: 1 of 2
# Warmup Iteration   1: 12.785 ms/op
# Warmup Iteration   2: 9.961 ms/op
Iteration   1: 9.762 ms/op
Iteration   2: 9.443 ms/op
Iteration   3: 9.414 ms/op

# Run progress: 93.48% complete, ETA 00:02:09
# Fork: 2 of 2
# Warmup Iteration   1: 13.196 ms/op
# Warmup Iteration   2: 9.919 ms/op
Iteration   1: 9.732 ms/op
Iteration   2: 9.431 ms/op
Iteration   3: 9.445 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.538 ±(99.9%) 0.456 ms/op [Average]
  (min, avg, max) = (9.414, 9.538, 9.762), stdev = 0.163
  CI (99.9%): [9.082, 9.994] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid

# Run progress: 95.65% complete, ETA 00:01:24
# Fork: 1 of 2
# Warmup Iteration   1: 25.880 ms/op
# Warmup Iteration   2: 22.462 ms/op
Iteration   1: 22.176 ms/op
Iteration   2: 22.249 ms/op
Iteration   3: 22.059 ms/op

# Run progress: 97.83% complete, ETA 00:00:41
# Fork: 2 of 2
# Warmup Iteration   1: 26.091 ms/op
# Warmup Iteration   2: 22.225 ms/op
Iteration   1: 22.118 ms/op
Iteration   2: 22.042 ms/op
Iteration   3: 22.121 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  22.128 ±(99.9%) 0.214 ms/op [Average]
  (min, avg, max) = (22.042, 22.128, 22.249), stdev = 0.076
  CI (99.9%): [21.913, 22.342] (assumes normal distribution)


# Run complete. Total time: 00:31:24

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark                                                                                            (model)  (nodes)  Mode  Cnt      Score      Error  Units
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     19.888 ±    0.617  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.831 ±    0.023  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      7.889 ±    0.296  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      8.103 ±    0.311  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     13.489 ±    0.381  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    524.573 ±   54.241  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   2620.011 ±   88.584  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    522.851 ±   21.678  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1070.174 ±   79.609  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.136 ±    0.013  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      9.351 ±    0.084  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.625 ±    0.005  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.644 ±    0.036  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     27.250 ±    9.701  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  63061.253 ± 1929.870  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   4650.478 ± 2354.524  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6450.267 ±  119.350  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6      3.859 ±    0.048  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     19.343 ±    1.785  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     54.245 ±    2.578  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.538 ±    0.456  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     22.128 ±    0.214  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-regular-benchmarks.json
# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient

# Run progress: 0.00% complete, ETA 00:00:00
# Fork: 1 of 1
Iteration   1: 67951.808 ms/op
Iteration   2: 64345.436 ms/op


Result "com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient":
  66148.622 ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset

# Run progress: 14.29% complete, ETA 00:13:15
# Fork: 1 of 1
Iteration   1: 342463.668 ms/op
Iteration   2: 333204.381 ms/op


Result "com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset":
  337834.024 ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep
# Parameters: (eos = SRK)

# Run progress: 28.57% complete, ETA 00:33:41
# Fork: 1 of 1
Iteration   1: 33526.766 ms/op
Iteration   2: 28916.767 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  31221.767 ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep
# Parameters: (eos = PR)

# Run progress: 42.86% complete, ETA 00:19:23
# Fork: 1 of 1
Iteration   1: 33868.303 ms/op
Iteration   2: 29786.764 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  31827.534 ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable

# Run progress: 57.14% complete, ETA 00:11:43
# Fork: 1 of 1
Iteration   1: 28040.078 ms/op
Iteration   2: 23340.270 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable":
  25690.174 ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid

# Run progress: 71.43% complete, ETA 00:06:35
# Fork: 1 of 1
Iteration   1: 33842.680 ms/op
Iteration   2: 28975.230 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid":
  31408.955 ms/op


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 2 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp

# Run progress: 85.71% complete, ETA 00:02:55
# Fork: 1 of 1
Iteration   1: 67898.426 ms/op
Iteration   2: 65350.556 ms/op


Result "com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp":
  66624.491 ms/op


# Run complete. Total time: 00:19:46

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark                                               (eos)  Mode  Cnt       Score   Error  Units
DynamicProcessBenchmark.separationControlTransient        N/A  avgt    2   66148.622          ms/op
MlTrainingDataBenchmark.processSurrogateDataset           N/A  avgt    2  337834.024          ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep        SRK  avgt    2   31221.767          ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep         PR  avgt    2   31827.534          ms/op
PropertyTableBenchmark.olgaThreePhaseTable                N/A  avgt    2   25690.174          ms/op
PropertyTableBenchmark.tpPropertyGrid                     N/A  avgt    2   31408.955          ms/op
TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp    N/A  avgt    2   66624.491          ms/op

Benchmark result is saved to /home/runner/work/_temp/current-long-running-benchmarks.json

```


## baseline-tests-exit-code.txt

```text
0

```


## baseline-test-failures.txt

```text

```


## baseline-tests.log

```text
$ mvn surefire:test -Dneqsim.version=3.26.0
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------< com.equinor.neqsim:neqsim-benchmark >-----------------
[INFO] Building JMH benchmark sample: Java 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- surefire:3.5.2:test (default-cli) @ neqsim-benchmark ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 11410 ms, solved=true, gas=318849.58 kg/hr, water in/out=0.00027104531/1.5400949e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00019284321, composition error=0.0030760310
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=4.7854811e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 11.46 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.240 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.LongRunSmokeTest
olgaThreePhaseTable[small]                                     16436.0  (1020 ms)
tpPropertyGrid[small]                                          103.081  (389 ms)
separationControlTransient[small]                              158.784  (3791 ms)
processSimulationSweep[SRK, small]                             380.827  (3227 ms)
processSimulationSweep[PR, small]                              382.559  (2876 ms)
processSurrogateDataset[small]                                 1409.23  (5739 ms)
twoFluidTransient[small]                                       8177.41  (451 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 22.08 s -- in com.equinor.neqsim.benchmark.LongRunSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.081 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 687109 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 59 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    9.86e-04 (tolerance: 1.00e-03) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  1.95e-05 (tolerance: 1.00e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     1.04e-04 (tolerance: 1.00e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: no tolerance given - using the engineering default 1.0e-03 relative on flow, temperature and pressure
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 1.98e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264559.5 + 377853.0, oil 1995397.9 + 2850664.5, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.436 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 81.0 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 687.1 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (3 ms)
tpFlashWellFluidSrk                                            83.6406  (42 ms)
tpFlashWellFluidPr                                             83.6541  (48 ms)
tpFlashWellFluidWithProperties                                 5445.46  (70 ms)
phAndPsFlashWellFluid                                          2459.23  (140 ms)
Nov 14, 2026 6:39:56 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 14, 2026 6:39:56 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (496 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (304 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (159 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (68 ms)
saturationPointsWellFluid                                      1601.32  (184 ms)
singlePhaseGasPipelineSteadyState                              121.628  (851 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98717  (1560 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (10 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.827 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  12:14 min
[INFO] Finished at: 2026-11-14T18:40:00Z
[INFO] ------------------------------------------------------------------------

```


## current-tests-exit-code.txt

```text
0

```


## current-test-failures.txt

```text

```


## current-tests.log

```text
$ mvn surefire:test -Dneqsim.version=3.27.0
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------< com.equinor.neqsim:neqsim-benchmark >-----------------
[INFO] Building JMH benchmark sample: Java 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- surefire:3.5.2:test (default-cli) @ neqsim-benchmark ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 9445 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5447778e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018746111, composition error=0.0030123554
TEG recycle lean TEG resycle: solved=true, flow error=3.9968029e-14, composition error=4.7067410e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.493 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.886 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.LongRunSmokeTest
olgaThreePhaseTable[small]                                     16296.0  (704 ms)
tpPropertyGrid[small]                                          103.077  (598 ms)
separationControlTransient[small]                              158.784  (2578 ms)
processSimulationSweep[SRK, small]                             380.828  (3166 ms)
processSimulationSweep[PR, small]                              382.559  (2932 ms)
processSurrogateDataset[small]                                 1419.23  (5112 ms)
twoFluidTransient[small]                                       1096.75  (498 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 19.90 s -- in com.equinor.neqsim.benchmark.LongRunSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.271 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 551571 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 59 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    9.80e-04 (tolerance: 1.00e-03) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  2.59e-05 (tolerance: 1.00e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     1.31e-04 (tolerance: 1.00e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: no tolerance given - using the engineering default 1.0e-03 relative on flow, temperature and pressure
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 1.98e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264558.0 + 377857.7, oil 1995396.7 + 2850665.0, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.436 MSm3/d, KA27841 A 100.3 bara, pipeline outlet 78.9 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 551.6 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (6 ms)
tpFlashWellFluidSrk                                            83.6406  (44 ms)
tpFlashWellFluidPr                                             83.6541  (34 ms)
tpFlashWellFluidWithProperties                                 5445.37  (45 ms)
phAndPsFlashWellFluid                                          2459.22  (66 ms)
Nov 14, 2026 7:56:00 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 14, 2026 7:56:00 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00976303  (224 ms)
gasOilSurfaceTension[Simple Gradient Theory]                0.00976303  (110 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (276 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (46 ms)
saturationPointsWellFluid                                      1601.32  (131 ms)
singlePhaseGasPipelineSteadyState                              121.629  (859 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98718  (1580 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (2 ms)
dataReconciliation[100]                                        37.0132  (46 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.374 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  09:54 min
[INFO] Finished at: 2026-11-14T19:56:04Z
[INFO] ------------------------------------------------------------------------

```


## benchmark-timing-summary.md

```text
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

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 22.3116 | 54.2452 | +143.13% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 61.1952 | 3.85875 | -93.69% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 57.5774 | 19.343 | -66.41% | Separate CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 115432 | 63061.3 | -45.37% | Separate CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.42733 | 1.83075 | +28.26% | Separate CIs |
| process.TEGprocess.testTEGprocess | 8200.24 | 6450.27 | -21.34% | Separate CIs |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=PR) | 38963.5 | 31827.5 | -18.31% | CI unavailable |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=SRK) | 37939.8 | 31221.8 | -17.71% | CI unavailable |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 23.2832 | 19.8885 | -14.58% | Separate CIs |
| longrun.MlTrainingDataBenchmark.processSurrogateDataset | 394619 | 337834 | -14.39% | CI unavailable |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread. Long-running `longrun` cases (30 s to 5 min per operation): one fork, no warmup and two measured operations, so their confidence intervals are wide.

```
