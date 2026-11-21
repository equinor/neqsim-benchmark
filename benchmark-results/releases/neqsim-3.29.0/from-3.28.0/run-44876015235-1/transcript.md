# NeqSim 3.29.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.28.0 |
| Current | 3.29.0 |
| Source commit | `22d297f1ee5b4918fad3b5f103c60cd72b043f8e` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/44876015235) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 16,
  "label": "B16-8d65e2abc344",
  "fingerprint": "8d65e2abc34477bc3de280af8d8c1ed1b19f0004d0ed2f70ac049ae3ab913439",
  "source_commit": "22d297f1ee5b4918fad3b5f103c60cd72b043f8e",
  "updated_at": "2026-11-15",
  "uncommitted_changes": false,
  "scopes": [
    "src/main/java",
    "src/main/resources",
    ".github/scripts/run-benchmark-timings.sh"
  ],
  "files": {
    ".github/scripts/run-benchmark-timings.sh": "0089740a2d51811a4a5949fed8d074d0f1036485eaf0b3ed9907dbc7a742d943",
    "src/main/java/com/equinor/neqsim/benchmark/flash/FlashBenchmark.java": "16e923506b507f652653ce4709a31c2ffd57aca63da4facbb1acb5a408df33c5",
    "src/main/java/com/equinor/neqsim/benchmark/flash/TPflash.java": "5dfd00a3bd4cb4b497da1d3b47f2303f351c3bc570b61b528765919b920031ab",
    "src/main/java/com/equinor/neqsim/benchmark/flash/TPflash_UMR.java": "925cc33c89f7dad0ec3ba4bf2567d283f80790fc465c963b45f4a8202536773e",
    "src/main/java/com/equinor/neqsim/benchmark/fluidmechanics/PipeFlowSolverBenchmark.java": "76fdf4910236068de1c14af59b07a4fa1c33995047d29f1d320549dc36f08cab",
    "src/main/java/com/equinor/neqsim/benchmark/longrun/DynamicProcessBenchmark.java": "3bab84ac0f7f8385726e7ec929741875419736d6381da78025732e80d41d3558",
    "src/main/java/com/equinor/neqsim/benchmark/longrun/GasProcessingTrain.java": "d93bb96f7c68276f640350dfb9b0d2be4cd1c4f7d4f41d95fb4f0eb43243c2ad",
    "src/main/java/com/equinor/neqsim/benchmark/longrun/MlTrainingDataBenchmark.java": "ae97558f81d8ed44723329cab636df8e370b769d612aee08542a73f1ee4fb804",
    "src/main/java/com/equinor/neqsim/benchmark/longrun/ProcessSimulationBenchmark.java": "1538f5dab093c51dd7693e8ae621aee8544c18d8d6c55f2e131dc5bc282e5b89",
    "src/main/java/com/equinor/neqsim/benchmark/longrun/PropertyTableBenchmark.java": "9f4a2a4ffa38be670d5034cd8ee337db4529cd2945a78d41cdeb97d4418df7b1",
    "src/main/java/com/equinor/neqsim/benchmark/longrun/TwoFluidTransientBenchmark.java": "36607f1e7c2d1438dbf73e26c0e6787561e513ab963740f78e27059834121af6",
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
    "added": [],
    "modified": [
      ".github/scripts/run-benchmark-timings.sh",
      "src/main/java/com/equinor/neqsim/benchmark/longrun/DynamicProcessBenchmark.java",
      "src/main/java/com/equinor/neqsim/benchmark/longrun/MlTrainingDataBenchmark.java",
      "src/main/java/com/equinor/neqsim/benchmark/longrun/ProcessSimulationBenchmark.java",
      "src/main/java/com/equinor/neqsim/benchmark/longrun/PropertyTableBenchmark.java",
      "src/main/java/com/equinor/neqsim/benchmark/longrun/TwoFluidTransientBenchmark.java"
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
OS name: "linux", version: "7.0.0-1020-azure", arch: "amd64", family: "unix"
Linux runnervm0hi8g 7.0.0-1020-azure #21-Ubuntu SMP PREEMPT Tue Oct 27 22:34:38 UTC 2026 x86_64 GNU/Linux
Architecture:                            x86_64
CPU op-mode(s):                          32-bit, 64-bit
Address sizes:                           48 bits physical, 48 bits virtual
Byte Order:                              Little Endian
CPU(s):                                  4
On-line CPU(s) list:                     0-3
Vendor ID:                               AuthenticAMD
Model name:                              AMD EPYC 7763 64-Core Processor
CPU family:                              25
Model:                                   1
Thread(s) per core:                      2
Core(s) per socket:                      2
Socket(s):                               1
Stepping:                                1
BogoMIPS:                                4890.86
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid rdseed adx smap clflushopt clwb sha_ni xsaveopt xsavec xgetbv1 xsaves user_shstk clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload umip vaes vpclmulqdq rdpid fsrm
Virtualization:                          AMD-V
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               64 KiB (2 instances)
L1i cache:                               64 KiB (2 instances)
L2 cache:                                1 MiB (2 instances)
L3 cache:                                32 MiB (1 instance)
NUMA node(s):                            1
NUMA node0 CPU(s):                       0-3
Vulnerability Gather data sampling:      Not affected
Vulnerability Ghostwrite:                Not affected
Vulnerability Indirect target selection: Not affected
Vulnerability Itlb multihit:             Not affected
Vulnerability L1tf:                      Not affected
Vulnerability Mds:                       Not affected
Vulnerability Meltdown:                  Not affected
Vulnerability Mmio stale data:           Not affected
Vulnerability Old microcode:             Not affected
Vulnerability Reg file data sampling:    Not affected
Vulnerability Retbleed:                  Not affected
Vulnerability Spec rstack overflow:      Vulnerable: Safe RET, no microcode
Vulnerability Spec store bypass:         Vulnerable
Vulnerability Spectre v1:                Mitigation; usercopy/swapgs barriers and __user pointer sanitization
Vulnerability Spectre v2:                Mitigation; Retpolines; STIBP disabled; RSB filling; PBRSB-eIBRS Not affected; BHI Not affected
Vulnerability Srbds:                     Not affected
Vulnerability Tsa:                       Vulnerable: No microcode
Vulnerability Tsx async abort:           Not affected
Vulnerability Vmscape:                   Not affected

```


## benchmark-build-summary.md

```text
## Maven Build Results

| Variant | NeqSim | Maven build |
| --- | --- | --- |
| baseline | 3.28.0 | passed |
| current | 3.29.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.28.0",
  "version": "3.28.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.28.0/neqsim-3.28.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.29.0",
  "version": "3.29.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.29.0/neqsim-3.29.0.jar",
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
[INFO] Total time:  5.888 s
[INFO] Finished at: 2026-11-21T06:32:43Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.28.0 (neqsim-3.28.0.jar); requested: 3.28.0
$ mvn clean package -DskipTests -Dneqsim.version=3.28.0
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.28.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.28.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  14.628 s
[INFO] Finished at: 2026-11-21T06:32:59Z
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
# Warmup Iteration   1: 28.249 ms/op
# Warmup Iteration   2: 20.502 ms/op
Iteration   1: 20.103 ms/op
Iteration   2: 20.069 ms/op
Iteration   3: 19.932 ms/op

# Run progress: 2.17% complete, ETA 00:09:14
# Fork: 2 of 2
# Warmup Iteration   1: 27.226 ms/op
# Warmup Iteration   2: 20.424 ms/op
Iteration   1: 20.347 ms/op
Iteration   2: 20.034 ms/op
Iteration   3: 19.873 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  20.060 ±(99.9%) 0.463 ms/op [Average]
  (min, avg, max) = (19.873, 20.060, 20.347), stdev = 0.165
  CI (99.9%): [19.597, 20.522] (assumes normal distribution)


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

# Run progress: 4.35% complete, ETA 00:08:57
# Fork: 1 of 2
# Warmup Iteration   1: 3.123 ms/op
# Warmup Iteration   2: 1.591 ms/op
Iteration   1: 1.528 ms/op
Iteration   2: 1.538 ms/op
Iteration   3: 1.528 ms/op

# Run progress: 6.52% complete, ETA 00:08:44
# Fork: 2 of 2
# Warmup Iteration   1: 3.108 ms/op
# Warmup Iteration   2: 1.620 ms/op
Iteration   1: 1.520 ms/op
Iteration   2: 1.523 ms/op
Iteration   3: 1.526 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.527 ±(99.9%) 0.017 ms/op [Average]
  (min, avg, max) = (1.520, 1.527, 1.538), stdev = 0.006
  CI (99.9%): [1.510, 1.544] (assumes normal distribution)


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

# Run progress: 8.70% complete, ETA 00:08:31
# Fork: 1 of 2
# Warmup Iteration   1: 17.935 ms/op
# Warmup Iteration   2: 9.230 ms/op
Iteration   1: 8.154 ms/op
Iteration   2: 7.910 ms/op
Iteration   3: 7.903 ms/op

# Run progress: 10.87% complete, ETA 00:08:22
# Fork: 2 of 2
# Warmup Iteration   1: 17.488 ms/op
# Warmup Iteration   2: 8.375 ms/op
Iteration   1: 8.148 ms/op
Iteration   2: 7.963 ms/op
Iteration   3: 7.887 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.994 ±(99.9%) 0.348 ms/op [Average]
  (min, avg, max) = (7.887, 7.994, 8.154), stdev = 0.124
  CI (99.9%): [7.646, 8.342] (assumes normal distribution)


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

# Run progress: 13.04% complete, ETA 00:08:09
# Fork: 1 of 2
# Warmup Iteration   1: 12.723 ms/op
# Warmup Iteration   2: 9.769 ms/op
Iteration   1: 8.339 ms/op
Iteration   2: 8.182 ms/op
Iteration   3: 8.071 ms/op

# Run progress: 15.22% complete, ETA 00:07:56
# Fork: 2 of 2
# Warmup Iteration   1: 17.865 ms/op
# Warmup Iteration   2: 9.074 ms/op
Iteration   1: 8.322 ms/op
Iteration   2: 8.133 ms/op
Iteration   3: 8.127 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  8.196 ±(99.9%) 0.309 ms/op [Average]
  (min, avg, max) = (8.071, 8.196, 8.339), stdev = 0.110
  CI (99.9%): [7.886, 8.505] (assumes normal distribution)


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

# Run progress: 17.39% complete, ETA 00:07:43
# Fork: 1 of 2
# Warmup Iteration   1: 33.732 ms/op
# Warmup Iteration   2: 16.448 ms/op
Iteration   1: 13.651 ms/op
Iteration   2: 13.610 ms/op
Iteration   3: 13.617 ms/op

# Run progress: 19.57% complete, ETA 00:07:31
# Fork: 2 of 2
# Warmup Iteration   1: 23.556 ms/op
# Warmup Iteration   2: 15.125 ms/op
Iteration   1: 13.715 ms/op
Iteration   2: 13.579 ms/op
Iteration   3: 13.602 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.629 ±(99.9%) 0.135 ms/op [Average]
  (min, avg, max) = (13.579, 13.629, 13.715), stdev = 0.048
  CI (99.9%): [13.494, 13.764] (assumes normal distribution)


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

# Run progress: 21.74% complete, ETA 00:07:19
# Fork: 1 of 2
# Warmup Iteration   1: 2304.387 ms/op
# Warmup Iteration   2: 765.977 ms/op
Iteration   1: 537.587 ms/op
Iteration   2: 497.761 ms/op
Iteration   3: 499.543 ms/op

# Run progress: 23.91% complete, ETA 00:07:06
# Fork: 2 of 2
# Warmup Iteration   1: 2384.708 ms/op
# Warmup Iteration   2: 758.431 ms/op
Iteration   1: 531.741 ms/op
Iteration   2: 508.394 ms/op
Iteration   3: 487.900 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  510.488 ±(99.9%) 55.837 ms/op [Average]
  (min, avg, max) = (487.900, 510.488, 537.587), stdev = 19.912
  CI (99.9%): [454.651, 566.324] (assumes normal distribution)


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

# Run progress: 26.09% complete, ETA 00:06:52
# Fork: 1 of 2
# Warmup Iteration   1: 4436.294 ms/op
# Warmup Iteration   2: 3106.319 ms/op
Iteration   1: 2424.962 ms/op
Iteration   2: 2394.234 ms/op
Iteration   3: 2372.016 ms/op

# Run progress: 28.26% complete, ETA 00:06:47
# Fork: 2 of 2
# Warmup Iteration   1: 4427.157 ms/op
# Warmup Iteration   2: 2717.272 ms/op
Iteration   1: 2466.844 ms/op
Iteration   2: 2483.145 ms/op
Iteration   3: 2425.495 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  2427.783 ±(99.9%) 117.905 ms/op [Average]
  (min, avg, max) = (2372.016, 2427.783, 2483.145), stdev = 42.046
  CI (99.9%): [2309.878, 2545.688] (assumes normal distribution)


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

# Run progress: 30.43% complete, ETA 00:06:41
# Fork: 1 of 2
# Warmup Iteration   1: 1237.209 ms/op
# Warmup Iteration   2: 545.451 ms/op
Iteration   1: 534.894 ms/op
Iteration   2: 517.537 ms/op
Iteration   3: 518.811 ms/op

# Run progress: 32.61% complete, ETA 00:06:25
# Fork: 2 of 2
# Warmup Iteration   1: 1259.243 ms/op
# Warmup Iteration   2: 562.150 ms/op
Iteration   1: 520.089 ms/op
Iteration   2: 514.207 ms/op
Iteration   3: 505.710 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  518.541 ±(99.9%) 26.730 ms/op [Average]
  (min, avg, max) = (505.710, 518.541, 534.894), stdev = 9.532
  CI (99.9%): [491.811, 545.272] (assumes normal distribution)


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

# Run progress: 34.78% complete, ETA 00:06:11
# Fork: 1 of 2
# Warmup Iteration   1: 2541.050 ms/op
# Warmup Iteration   2: 1167.638 ms/op
Iteration   1: 1103.561 ms/op
Iteration   2: 1086.515 ms/op
Iteration   3: 1075.265 ms/op

# Run progress: 36.96% complete, ETA 00:05:57
# Fork: 2 of 2
# Warmup Iteration   1: 2626.654 ms/op
# Warmup Iteration   2: 1141.523 ms/op
Iteration   1: 1129.793 ms/op
Iteration   2: 1080.171 ms/op
Iteration   3: 1081.282 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1092.765 ±(99.9%) 57.788 ms/op [Average]
  (min, avg, max) = (1075.265, 1092.765, 1129.793), stdev = 20.608
  CI (99.9%): [1034.977, 1150.553] (assumes normal distribution)


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

# Run progress: 39.13% complete, ETA 00:05:44
# Fork: 1 of 2
# Warmup Iteration   1: 0.150 ms/op
# Warmup Iteration   2: 0.100 ms/op
Iteration   1: 0.100 ms/op
Iteration   2: 0.100 ms/op
Iteration   3: 0.101 ms/op

# Run progress: 41.30% complete, ETA 00:05:29
# Fork: 2 of 2
# Warmup Iteration   1: 0.164 ms/op
# Warmup Iteration   2: 0.100 ms/op
Iteration   1: 0.100 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.099 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.100 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.099, 0.100, 0.101), stdev = 0.001
  CI (99.9%): [0.097, 0.102] (assumes normal distribution)


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

# Run progress: 43.48% complete, ETA 00:05:14
# Fork: 1 of 2
# Warmup Iteration   1: 11.200 ms/op
# Warmup Iteration   2: 8.130 ms/op
Iteration   1: 8.084 ms/op
Iteration   2: 7.706 ms/op
Iteration   3: 7.455 ms/op

# Run progress: 45.65% complete, ETA 00:05:00
# Fork: 2 of 2
# Warmup Iteration   1: 11.466 ms/op
# Warmup Iteration   2: 8.224 ms/op
Iteration   1: 8.076 ms/op
Iteration   2: 8.071 ms/op
Iteration   3: 8.074 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.911 ±(99.9%) 0.752 ms/op [Average]
  (min, avg, max) = (7.455, 7.911, 8.084), stdev = 0.268
  CI (99.9%): [7.159, 8.663] (assumes normal distribution)


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
# Warmup Iteration   1: 0.859 ms/op
# Warmup Iteration   2: 0.570 ms/op
Iteration   1: 0.573 ms/op
Iteration   2: 0.573 ms/op
Iteration   3: 0.573 ms/op

# Run progress: 50.00% complete, ETA 00:04:32
# Fork: 2 of 2
# Warmup Iteration   1: 0.878 ms/op
# Warmup Iteration   2: 0.568 ms/op
Iteration   1: 0.568 ms/op
Iteration   2: 0.569 ms/op
Iteration   3: 0.569 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.571 ±(99.9%) 0.006 ms/op [Average]
  (min, avg, max) = (0.568, 0.571, 0.573), stdev = 0.002
  CI (99.9%): [0.564, 0.577] (assumes normal distribution)


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
# Warmup Iteration   1: 2.207 ms/op
# Warmup Iteration   2: 1.520 ms/op
Iteration   1: 1.496 ms/op
Iteration   2: 1.510 ms/op
Iteration   3: 1.478 ms/op

# Run progress: 54.35% complete, ETA 00:04:06
# Fork: 2 of 2
# Warmup Iteration   1: 2.185 ms/op
# Warmup Iteration   2: 1.523 ms/op
Iteration   1: 1.489 ms/op
Iteration   2: 1.483 ms/op
Iteration   3: 1.490 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.491 ±(99.9%) 0.032 ms/op [Average]
  (min, avg, max) = (1.478, 1.491, 1.510), stdev = 0.011
  CI (99.9%): [1.459, 1.523] (assumes normal distribution)


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
# Warmup Iteration   1: 226.370 ms/op
# Warmup Iteration   2: 54.737 ms/op
Iteration   1: 37.157 ms/op
Iteration   2: 25.479 ms/op
Iteration   3: 23.289 ms/op

# Run progress: 58.70% complete, ETA 00:03:40
# Fork: 2 of 2
# Warmup Iteration   1: 203.257 ms/op
# Warmup Iteration   2: 54.268 ms/op
Iteration   1: 46.253 ms/op
Iteration   2: 35.030 ms/op
Iteration   3: 26.031 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  32.207 ±(99.9%) 24.851 ms/op [Average]
  (min, avg, max) = (23.289, 32.207, 46.253), stdev = 8.862
  CI (99.9%): [7.355, 57.058] (assumes normal distribution)


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
# Warmup Iteration   1: 62969.398 ms/op
# Warmup Iteration   2: 59840.124 ms/op
Iteration   1: 59229.394 ms/op
Iteration   2: 59111.977 ms/op
Iteration   3: 59019.277 ms/op

# Run progress: 63.04% complete, ETA 00:06:07
# Fork: 2 of 2
# Warmup Iteration   1: 63411.790 ms/op
# Warmup Iteration   2: 59500.372 ms/op
Iteration   1: 59222.521 ms/op
Iteration   2: 59169.070 ms/op
Iteration   3: 58933.065 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  59114.217 ±(99.9%) 331.414 ms/op [Average]
  (min, avg, max) = (58933.065, 59114.217, 59229.394), stdev = 118.185
  CI (99.9%): [58782.803, 59445.632] (assumes normal distribution)


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

# Run progress: 65.22% complete, ETA 00:08:14
# Fork: 1 of 2
# Warmup Iteration   1: 8735.825 ms/op
# Warmup Iteration   2: 3170.742 ms/op
Iteration   1: 5167.048 ms/op
Iteration   2: 3354.033 ms/op
Iteration   3: 4523.489 ms/op

# Run progress: 67.39% complete, ETA 00:10:09
# Fork: 2 of 2
# Warmup Iteration   1: 8642.794 ms/op
# Warmup Iteration   2: 3219.212 ms/op
Iteration   1: 5120.589 ms/op
Iteration   2: 3396.621 ms/op
Iteration   3: 4575.710 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  4356.248 ±(99.9%) 2258.395 ms/op [Average]
  (min, avg, max) = (3354.033, 4356.248, 5167.048), stdev = 805.365
  CI (99.9%): [2097.854, 6614.643] (assumes normal distribution)


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

# Run progress: 69.57% complete, ETA 00:11:36
# Fork: 1 of 2
# Warmup Iteration   1: 8903.979 ms/op
# Warmup Iteration   2: 6638.040 ms/op
Iteration   1: 6271.607 ms/op
Iteration   2: 6236.244 ms/op
Iteration   3: 6134.752 ms/op

# Run progress: 71.74% complete, ETA 00:10:40
# Fork: 2 of 2
# Warmup Iteration   1: 9369.890 ms/op
# Warmup Iteration   2: 6690.409 ms/op
Iteration   1: 6416.561 ms/op
Iteration   2: 6349.104 ms/op
Iteration   3: 6361.004 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6294.879 ±(99.9%) 285.255 ms/op [Average]
  (min, avg, max) = (6134.752, 6294.879, 6416.561), stdev = 101.725
  CI (99.9%): [6009.623, 6580.134] (assumes normal distribution)


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

# Run progress: 73.91% complete, ETA 00:09:46
# Fork: 1 of 2
# Warmup Iteration   1: Nov 21, 2026 7:09:36 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 21, 2026 7:09:37 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
5.564 ms/op
# Warmup Iteration   2: 3.734 ms/op
Iteration   1: 3.735 ms/op
Iteration   2: 3.876 ms/op
Iteration   3: 3.697 ms/op

# Run progress: 76.09% complete, ETA 00:08:45
# Fork: 2 of 2
# Warmup Iteration   1: Nov 21, 2026 7:09:48 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 21, 2026 7:09:48 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
5.626 ms/op
# Warmup Iteration   2: 3.779 ms/op
Iteration   1: 3.730 ms/op
Iteration   2: 3.709 ms/op
Iteration   3: 3.709 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  3.743 ±(99.9%) 0.187 ms/op [Average]
  (min, avg, max) = (3.697, 3.743, 3.876), stdev = 0.067
  CI (99.9%): [3.555, 3.930] (assumes normal distribution)


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

# Run progress: 78.26% complete, ETA 00:07:47
# Fork: 1 of 2
# Warmup Iteration   1: 23.010 ms/op
# Warmup Iteration   2: 20.276 ms/op
Iteration   1: 20.029 ms/op
Iteration   2: 20.003 ms/op
Iteration   3: 19.848 ms/op

# Run progress: 80.43% complete, ETA 00:06:52
# Fork: 2 of 2
# Warmup Iteration   1: 26.779 ms/op
# Warmup Iteration   2: 18.111 ms/op
Iteration   1: 19.919 ms/op
Iteration   2: 19.854 ms/op
Iteration   3: 19.558 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  19.869 ±(99.9%) 0.475 ms/op [Average]
  (min, avg, max) = (19.558, 19.869, 20.029), stdev = 0.169
  CI (99.9%): [19.394, 20.344] (assumes normal distribution)


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

# Run progress: 82.61% complete, ETA 00:05:59
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:08
# Fork: 2 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  ≈ 10⁻⁴ ms/op


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

# Run progress: 86.96% complete, ETA 00:04:19
# Fork: 1 of 2
# Warmup Iteration   1: 81.544 ms/op
# Warmup Iteration   2: 60.831 ms/op
Iteration   1: 58.372 ms/op
Iteration   2: 57.466 ms/op
Iteration   3: 57.087 ms/op

# Run progress: 89.13% complete, ETA 00:03:32
# Fork: 2 of 2
# Warmup Iteration   1: 81.459 ms/op
# Warmup Iteration   2: 59.678 ms/op
Iteration   1: 58.534 ms/op
Iteration   2: 57.752 ms/op
Iteration   3: 57.059 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  57.712 ±(99.9%) 1.769 ms/op [Average]
  (min, avg, max) = (57.059, 57.712, 58.534), stdev = 0.631
  CI (99.9%): [55.943, 59.481] (assumes normal distribution)


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

# Run progress: 91.30% complete, ETA 00:02:47
# Fork: 1 of 2
# Warmup Iteration   1: 13.908 ms/op
# Warmup Iteration   2: 10.159 ms/op
Iteration   1: 10.031 ms/op
Iteration   2: 9.691 ms/op
Iteration   3: 9.717 ms/op

# Run progress: 93.48% complete, ETA 00:02:03
# Fork: 2 of 2
# Warmup Iteration   1: 13.277 ms/op
# Warmup Iteration   2: 10.093 ms/op
Iteration   1: 9.752 ms/op
Iteration   2: 9.661 ms/op
Iteration   3: 9.615 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.745 ±(99.9%) 0.415 ms/op [Average]
  (min, avg, max) = (9.615, 9.745, 10.031), stdev = 0.148
  CI (99.9%): [9.329, 10.160] (assumes normal distribution)


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

# Run progress: 95.65% complete, ETA 00:01:20
# Fork: 1 of 2
# Warmup Iteration   1: 35.512 ms/op
# Warmup Iteration   2: 29.810 ms/op
Iteration   1: 29.701 ms/op
Iteration   2: 29.641 ms/op
Iteration   3: 30.242 ms/op

# Run progress: 97.83% complete, ETA 00:00:39
# Fork: 2 of 2
# Warmup Iteration   1: 28.659 ms/op
# Warmup Iteration   2: 24.157 ms/op
Iteration   1: 24.045 ms/op
Iteration   2: 24.031 ms/op
Iteration   3: 24.271 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  26.988 ±(99.9%) 8.848 ms/op [Average]
  (min, avg, max) = (24.031, 26.988, 30.242), stdev = 3.155
  CI (99.9%): [18.141, 35.836] (assumes normal distribution)


# Run complete. Total time: 00:30:01

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     20.060 ±    0.463  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.527 ±    0.017  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      7.994 ±    0.348  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      8.196 ±    0.309  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     13.629 ±    0.135  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    510.488 ±   55.837  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   2427.783 ±  117.905  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    518.541 ±   26.730  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1092.765 ±   57.788  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.100 ±    0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.911 ±    0.752  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.571 ±    0.006  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.491 ±    0.032  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     32.207 ±   24.851  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  59114.217 ±  331.414  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   4356.248 ± 2258.395  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6294.879 ±  285.255  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6      3.743 ±    0.187  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     19.869 ±    0.475  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     57.712 ±    1.769  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.745 ±    0.415  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     26.988 ±    8.848  ms/op

Benchmark result is saved to /home/runner/work/_temp/baseline-regular-benchmarks.json
# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient

# Run progress: 0.00% complete, ETA 00:00:00
# Fork: 1 of 1
# Warmup Iteration   1: 58320.698 ms/op
Iteration   1: 54634.383 ms/op
Iteration   2: 54413.107 ms/op
Iteration   3: 54538.374 ms/op


Result "com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient":
  54528.621 ±(99.9%) 2024.318 ms/op [Average]
  (min, avg, max) = (54413.107, 54528.621, 54634.383), stdev = 110.960
  CI (99.9%): [52504.303, 56552.939] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset

# Run progress: 14.29% complete, ETA 00:22:13
# Fork: 1 of 1
# Warmup Iteration   1: 284500.314 ms/op
Iteration   1: 274353.021 ms/op
Iteration   2: 274022.272 ms/op
Iteration   3: 274416.821 ms/op


Result "com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset":
  274264.038 ±(99.9%) 3863.871 ms/op [Average]
  (min, avg, max) = (274022.272, 274264.038, 274416.821), stdev = 211.792
  CI (99.9%): [270400.167, 278127.909] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep
# Parameters: (eos = SRK)

# Run progress: 28.57% complete, ETA 00:55:24
# Fork: 1 of 1
# Warmup Iteration   1: 28908.402 ms/op
Iteration   1: 24137.460 ms/op
Iteration   2: 24095.603 ms/op
Iteration   3: 23920.309 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  24051.124 ±(99.9%) 2101.783 ms/op [Average]
  (min, avg, max) = (23920.309, 24051.124, 24137.460), stdev = 115.206
  CI (99.9%): [21949.341, 26152.907] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep
# Parameters: (eos = PR)

# Run progress: 42.86% complete, ETA 00:31:50
# Fork: 1 of 1
# Warmup Iteration   1: 28397.335 ms/op
Iteration   1: 24691.427 ms/op
Iteration   2: 24413.400 ms/op
Iteration   3: 24717.588 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  24607.471 ±(99.9%) 3075.514 ms/op [Average]
  (min, avg, max) = (24413.400, 24607.471, 24717.588), stdev = 168.579
  CI (99.9%): [21531.957, 27682.985] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable

# Run progress: 57.14% complete, ETA 00:19:12
# Fork: 1 of 1
# Warmup Iteration   1: 27306.759 ms/op
Iteration   1: 23824.658 ms/op
Iteration   2: 23384.573 ms/op
Iteration   3: 23392.229 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable":
  23533.820 ±(99.9%) 4595.629 ms/op [Average]
  (min, avg, max) = (23384.573, 23533.820, 23824.658), stdev = 251.902
  CI (99.9%): [18938.191, 28129.449] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid

# Run progress: 71.43% complete, ETA 00:10:53
# Fork: 1 of 1
# Warmup Iteration   1: 32846.777 ms/op
Iteration   1: 28182.494 ms/op
Iteration   2: 27778.196 ms/op
Iteration   3: 27765.642 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid":
  27908.777 ±(99.9%) 4326.115 ms/op [Average]
  (min, avg, max) = (27765.642, 27908.777, 28182.494), stdev = 237.129
  CI (99.9%): [23582.662, 32234.892] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp

# Run progress: 85.71% complete, ETA 00:04:51
# Fork: 1 of 1
# Warmup Iteration   1: 65379.121 ms/op
Iteration   1: 62937.797 ms/op
Iteration   2: 62746.288 ms/op
Iteration   3: 62531.114 ms/op


Result "com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp":
  62738.399 ±(99.9%) 3711.797 ms/op [Average]
  (min, avg, max) = (62531.114, 62738.399, 62937.797), stdev = 203.456
  CI (99.9%): [59026.602, 66450.197] (assumes normal distribution)


# Run complete. Total time: 00:33:25

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

Benchmark                                               (eos)  Mode  Cnt       Score      Error  Units
DynamicProcessBenchmark.separationControlTransient        N/A  avgt    3   54528.621 ± 2024.318  ms/op
MlTrainingDataBenchmark.processSurrogateDataset           N/A  avgt    3  274264.038 ± 3863.871  ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep        SRK  avgt    3   24051.124 ± 2101.783  ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep         PR  avgt    3   24607.471 ± 3075.514  ms/op
PropertyTableBenchmark.olgaThreePhaseTable                N/A  avgt    3   23533.820 ± 4595.629  ms/op
PropertyTableBenchmark.tpPropertyGrid                     N/A  avgt    3   27908.777 ± 4326.115  ms/op
TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp    N/A  avgt    3   62738.399 ± 3711.797  ms/op

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
[INFO] Total time:  2.786 s
[INFO] Finished at: 2026-11-21T07:45:25Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.29.0 (neqsim-3.29.0.jar); requested: 3.29.0
$ mvn clean package -DskipTests -Dneqsim.version=3.29.0
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.29.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.29.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  10.995 s
[INFO] Finished at: 2026-11-21T07:45:37Z
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
# Warmup Iteration   1: 27.862 ms/op
# Warmup Iteration   2: 19.558 ms/op
Iteration   1: 19.339 ms/op
Iteration   2: 19.245 ms/op
Iteration   3: 19.260 ms/op

# Run progress: 2.17% complete, ETA 00:09:08
# Fork: 2 of 2
# Warmup Iteration   1: 25.168 ms/op
# Warmup Iteration   2: 19.596 ms/op
Iteration   1: 19.763 ms/op
Iteration   2: 19.429 ms/op
Iteration   3: 19.494 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  19.422 ±(99.9%) 0.541 ms/op [Average]
  (min, avg, max) = (19.245, 19.422, 19.763), stdev = 0.193
  CI (99.9%): [18.881, 19.962] (assumes normal distribution)


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

# Run progress: 4.35% complete, ETA 00:08:54
# Fork: 1 of 2
# Warmup Iteration   1: 2.510 ms/op
# Warmup Iteration   2: 1.112 ms/op
Iteration   1: 1.106 ms/op
Iteration   2: 1.086 ms/op
Iteration   3: 1.080 ms/op

# Run progress: 6.52% complete, ETA 00:08:41
# Fork: 2 of 2
# Warmup Iteration   1: 1.839 ms/op
# Warmup Iteration   2: 1.117 ms/op
Iteration   1: 1.088 ms/op
Iteration   2: 1.085 ms/op
Iteration   3: 1.078 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.087 ±(99.9%) 0.028 ms/op [Average]
  (min, avg, max) = (1.078, 1.087, 1.106), stdev = 0.010
  CI (99.9%): [1.059, 1.115] (assumes normal distribution)


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

# Run progress: 8.70% complete, ETA 00:08:28
# Fork: 1 of 2
# Warmup Iteration   1: 17.780 ms/op
# Warmup Iteration   2: 8.362 ms/op
Iteration   1: 7.876 ms/op
Iteration   2: 7.867 ms/op
Iteration   3: 7.815 ms/op

# Run progress: 10.87% complete, ETA 00:08:17
# Fork: 2 of 2
# Warmup Iteration   1: 13.025 ms/op
# Warmup Iteration   2: 8.410 ms/op
Iteration   1: 7.865 ms/op
Iteration   2: 7.844 ms/op
Iteration   3: 7.780 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.841 ±(99.9%) 0.104 ms/op [Average]
  (min, avg, max) = (7.780, 7.841, 7.876), stdev = 0.037
  CI (99.9%): [7.738, 7.945] (assumes normal distribution)


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
# Warmup Iteration   1: 12.250 ms/op
# Warmup Iteration   2: 8.513 ms/op
Iteration   1: 8.281 ms/op
Iteration   2: 8.066 ms/op
Iteration   3: 8.054 ms/op

# Run progress: 15.22% complete, ETA 00:07:53
# Fork: 2 of 2
# Warmup Iteration   1: 14.425 ms/op
# Warmup Iteration   2: 8.939 ms/op
Iteration   1: 8.115 ms/op
Iteration   2: 8.102 ms/op
Iteration   3: 8.232 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  8.142 ±(99.9%) 0.261 ms/op [Average]
  (min, avg, max) = (8.054, 8.142, 8.281), stdev = 0.093
  CI (99.9%): [7.881, 8.403] (assumes normal distribution)


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
# Warmup Iteration   1: 23.874 ms/op
# Warmup Iteration   2: 14.392 ms/op
Iteration   1: 13.500 ms/op
Iteration   2: 13.388 ms/op
Iteration   3: 13.368 ms/op

# Run progress: 19.57% complete, ETA 00:07:29
# Fork: 2 of 2
# Warmup Iteration   1: 28.189 ms/op
# Warmup Iteration   2: 15.121 ms/op
Iteration   1: 13.484 ms/op
Iteration   2: 13.384 ms/op
Iteration   3: 13.327 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.408 ±(99.9%) 0.191 ms/op [Average]
  (min, avg, max) = (13.327, 13.408, 13.500), stdev = 0.068
  CI (99.9%): [13.217, 13.600] (assumes normal distribution)


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
# Warmup Iteration   1: 2012.739 ms/op
# Warmup Iteration   2: 581.826 ms/op
Iteration   1: 479.883 ms/op
Iteration   2: 466.349 ms/op
Iteration   3: 458.086 ms/op

# Run progress: 23.91% complete, ETA 00:07:03
# Fork: 2 of 2
# Warmup Iteration   1: 2240.519 ms/op
# Warmup Iteration   2: 638.247 ms/op
Iteration   1: 509.753 ms/op
Iteration   2: 460.100 ms/op
Iteration   3: 458.056 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  472.038 ±(99.9%) 56.767 ms/op [Average]
  (min, avg, max) = (458.056, 472.038, 509.753), stdev = 20.244
  CI (99.9%): [415.271, 528.805] (assumes normal distribution)


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

# Run progress: 26.09% complete, ETA 00:06:50
# Fork: 1 of 2
# Warmup Iteration   1: 2396.764 ms/op
# Warmup Iteration   2: 784.901 ms/op
Iteration   1: 599.762 ms/op
Iteration   2: 571.799 ms/op
Iteration   3: 545.542 ms/op

# Run progress: 28.26% complete, ETA 00:06:37
# Fork: 2 of 2
# Warmup Iteration   1: 2517.568 ms/op
# Warmup Iteration   2: 737.475 ms/op
Iteration   1: 608.564 ms/op
Iteration   2: 566.456 ms/op
Iteration   3: 526.427 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  569.758 ±(99.9%) 87.652 ms/op [Average]
  (min, avg, max) = (526.427, 569.758, 608.564), stdev = 31.257
  CI (99.9%): [482.107, 657.410] (assumes normal distribution)


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

# Run progress: 30.43% complete, ETA 00:06:24
# Fork: 1 of 2
# Warmup Iteration   1: 1205.669 ms/op
# Warmup Iteration   2: 518.197 ms/op
Iteration   1: 501.885 ms/op
Iteration   2: 495.036 ms/op
Iteration   3: 493.331 ms/op

# Run progress: 32.61% complete, ETA 00:06:12
# Fork: 2 of 2
# Warmup Iteration   1: 1158.789 ms/op
# Warmup Iteration   2: 527.501 ms/op
Iteration   1: 508.385 ms/op
Iteration   2: 502.394 ms/op
Iteration   3: 497.308 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  499.723 ±(99.9%) 15.638 ms/op [Average]
  (min, avg, max) = (493.331, 499.723, 508.385), stdev = 5.577
  CI (99.9%): [484.085, 515.361] (assumes normal distribution)


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

# Run progress: 34.78% complete, ETA 00:05:58
# Fork: 1 of 2
# Warmup Iteration   1: 2566.133 ms/op
# Warmup Iteration   2: 1192.829 ms/op
Iteration   1: 1129.142 ms/op
Iteration   2: 1088.206 ms/op
Iteration   3: 1053.522 ms/op

# Run progress: 36.96% complete, ETA 00:05:46
# Fork: 2 of 2
# Warmup Iteration   1: 2444.316 ms/op
# Warmup Iteration   2: 1195.085 ms/op
Iteration   1: 1129.724 ms/op
Iteration   2: 1080.461 ms/op
Iteration   3: 1060.045 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1090.183 ±(99.9%) 92.428 ms/op [Average]
  (min, avg, max) = (1053.522, 1090.183, 1129.724), stdev = 32.961
  CI (99.9%): [997.755, 1182.611] (assumes normal distribution)


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

# Run progress: 39.13% complete, ETA 00:05:34
# Fork: 1 of 2
# Warmup Iteration   1: 0.159 ms/op
# Warmup Iteration   2: 0.100 ms/op
Iteration   1: 0.100 ms/op
Iteration   2: 0.100 ms/op
Iteration   3: 0.100 ms/op

# Run progress: 41.30% complete, ETA 00:05:19
# Fork: 2 of 2
# Warmup Iteration   1: 0.145 ms/op
# Warmup Iteration   2: 0.099 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.099 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.099 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.099, 0.099, 0.100), stdev = 0.001
  CI (99.9%): [0.098, 0.101] (assumes normal distribution)


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

# Run progress: 43.48% complete, ETA 00:05:05
# Fork: 1 of 2
# Warmup Iteration   1: 11.220 ms/op
# Warmup Iteration   2: 8.145 ms/op
Iteration   1: 8.093 ms/op
Iteration   2: 7.702 ms/op
Iteration   3: 7.453 ms/op

# Run progress: 45.65% complete, ETA 00:04:52
# Fork: 2 of 2
# Warmup Iteration   1: 11.255 ms/op
# Warmup Iteration   2: 8.140 ms/op
Iteration   1: 8.058 ms/op
Iteration   2: 7.693 ms/op
Iteration   3: 7.433 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.739 ±(99.9%) 0.799 ms/op [Average]
  (min, avg, max) = (7.433, 7.739, 8.093), stdev = 0.285
  CI (99.9%): [6.939, 8.538] (assumes normal distribution)


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

# Run progress: 47.83% complete, ETA 00:04:39
# Fork: 1 of 2
# Warmup Iteration   1: 0.867 ms/op
# Warmup Iteration   2: 0.582 ms/op
Iteration   1: 0.574 ms/op
Iteration   2: 0.574 ms/op
Iteration   3: 0.575 ms/op

# Run progress: 50.00% complete, ETA 00:04:26
# Fork: 2 of 2
# Warmup Iteration   1: 0.816 ms/op
# Warmup Iteration   2: 0.566 ms/op
Iteration   1: 0.565 ms/op
Iteration   2: 0.567 ms/op
Iteration   3: 0.567 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.570 ±(99.9%) 0.013 ms/op [Average]
  (min, avg, max) = (0.565, 0.570, 0.575), stdev = 0.005
  CI (99.9%): [0.557, 0.583] (assumes normal distribution)


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

# Run progress: 52.17% complete, ETA 00:04:13
# Fork: 1 of 2
# Warmup Iteration   1: 2.141 ms/op
# Warmup Iteration   2: 1.516 ms/op
Iteration   1: 1.485 ms/op
Iteration   2: 1.477 ms/op
Iteration   3: 1.480 ms/op

# Run progress: 54.35% complete, ETA 00:04:00
# Fork: 2 of 2
# Warmup Iteration   1: 2.173 ms/op
# Warmup Iteration   2: 1.527 ms/op
Iteration   1: 1.486 ms/op
Iteration   2: 1.479 ms/op
Iteration   3: 1.489 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.482 ±(99.9%) 0.014 ms/op [Average]
  (min, avg, max) = (1.477, 1.482, 1.489), stdev = 0.005
  CI (99.9%): [1.469, 1.496] (assumes normal distribution)


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

# Run progress: 56.52% complete, ETA 00:03:48
# Fork: 1 of 2
# Warmup Iteration   1: 187.664 ms/op
# Warmup Iteration   2: 52.247 ms/op
Iteration   1: 29.478 ms/op
Iteration   2: 22.964 ms/op
Iteration   3: 21.128 ms/op

# Run progress: 58.70% complete, ETA 00:03:36
# Fork: 2 of 2
# Warmup Iteration   1: 170.023 ms/op
# Warmup Iteration   2: 52.017 ms/op
Iteration   1: 41.475 ms/op
Iteration   2: 28.847 ms/op
Iteration   3: 23.333 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  27.871 ±(99.9%) 20.938 ms/op [Average]
  (min, avg, max) = (21.128, 27.871, 41.475), stdev = 7.467
  CI (99.9%): [6.933, 48.809] (assumes normal distribution)


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

# Run progress: 60.87% complete, ETA 00:03:24
# Fork: 1 of 2
# Warmup Iteration   1: 57706.006 ms/op
# Warmup Iteration   2: 54411.869 ms/op
Iteration   1: 54090.280 ms/op
Iteration   2: 54101.436 ms/op
Iteration   3: 54083.664 ms/op

# Run progress: 63.04% complete, ETA 00:05:48
# Fork: 2 of 2
# Warmup Iteration   1: 58614.269 ms/op
# Warmup Iteration   2: 54814.246 ms/op
Iteration   1: 54499.645 ms/op
Iteration   2: 54597.814 ms/op
Iteration   3: 54512.997 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  54314.306 ±(99.9%) 690.197 ms/op [Average]
  (min, avg, max) = (54083.664, 54314.306, 54597.814), stdev = 246.131
  CI (99.9%): [53624.109, 55004.503] (assumes normal distribution)


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

# Run progress: 65.22% complete, ETA 00:07:45
# Fork: 1 of 2
# Warmup Iteration   1: 9158.947 ms/op
# Warmup Iteration   2: 5397.249 ms/op
Iteration   1: 8240.182 ms/op
Iteration   2: 4673.685 ms/op
Iteration   3: 5744.219 ms/op

# Run progress: 67.39% complete, ETA 00:09:47
# Fork: 2 of 2
# Warmup Iteration   1: 9141.803 ms/op
# Warmup Iteration   2: 5409.809 ms/op
Iteration   1: 8264.599 ms/op
Iteration   2: 4705.864 ms/op
Iteration   3: 5751.540 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  6230.015 ±(99.9%) 4589.013 ms/op [Average]
  (min, avg, max) = (4673.685, 6230.015, 8264.599), stdev = 1636.486
  CI (99.9%): [1641.002, 10819.028] (assumes normal distribution)


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

# Run progress: 69.57% complete, ETA 00:11:21
# Fork: 1 of 2
# Warmup Iteration   1: 4548.274 ms/op
# Warmup Iteration   2: 2250.606 ms/op
Iteration   1: 2064.159 ms/op
Iteration   2: 2075.630 ms/op
Iteration   3: 1930.706 ms/op

# Run progress: 71.74% complete, ETA 00:10:19
# Fork: 2 of 2
# Warmup Iteration   1: 4730.332 ms/op
# Warmup Iteration   2: 2712.169 ms/op
Iteration   1: 2191.980 ms/op
Iteration   2: 2057.655 ms/op
Iteration   3: 1954.549 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  2045.780 ±(99.9%) 263.979 ms/op [Average]
  (min, avg, max) = (1930.706, 2045.780, 2191.980), stdev = 94.137
  CI (99.9%): [1781.801, 2309.759] (assumes normal distribution)


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

# Run progress: 73.91% complete, ETA 00:09:20
# Fork: 1 of 2
# Warmup Iteration   1: Nov 21, 2026 8:20:52 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 21, 2026 8:20:53 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
7.394 ms/op
# Warmup Iteration   2: 4.029 ms/op
Iteration   1: 4.031 ms/op
Iteration   2: 3.994 ms/op
Iteration   3: 3.986 ms/op

# Run progress: 76.09% complete, ETA 00:08:22
# Fork: 2 of 2
# Warmup Iteration   1: Nov 21, 2026 8:21:04 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 21, 2026 8:21:04 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
6.630 ms/op
# Warmup Iteration   2: 3.640 ms/op
Iteration   1: 3.657 ms/op
Iteration   2: 3.595 ms/op
Iteration   3: 3.584 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  3.808 ±(99.9%) 0.606 ms/op [Average]
  (min, avg, max) = (3.584, 3.808, 4.031), stdev = 0.216
  CI (99.9%): [3.201, 4.414] (assumes normal distribution)


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

# Run progress: 78.26% complete, ETA 00:07:27
# Fork: 1 of 2
# Warmup Iteration   1: 24.701 ms/op
# Warmup Iteration   2: 20.066 ms/op
Iteration   1: 19.704 ms/op
Iteration   2: 19.754 ms/op
Iteration   3: 19.522 ms/op

# Run progress: 80.43% complete, ETA 00:06:34
# Fork: 2 of 2
# Warmup Iteration   1: 20.920 ms/op
# Warmup Iteration   2: 18.470 ms/op
Iteration   1: 19.666 ms/op
Iteration   2: 19.644 ms/op
Iteration   3: 19.434 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  19.621 ±(99.9%) 0.336 ms/op [Average]
  (min, avg, max) = (19.434, 19.621, 19.754), stdev = 0.120
  CI (99.9%): [19.284, 19.957] (assumes normal distribution)


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

# Run progress: 82.61% complete, ETA 00:05:43
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:55
# Fork: 2 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  ≈ 10⁻⁴ ms/op


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

# Run progress: 86.96% complete, ETA 00:04:08
# Fork: 1 of 2
# Warmup Iteration   1: 84.063 ms/op
# Warmup Iteration   2: 60.543 ms/op
Iteration   1: 58.481 ms/op
Iteration   2: 57.862 ms/op
Iteration   3: 57.433 ms/op

# Run progress: 89.13% complete, ETA 00:03:23
# Fork: 2 of 2
# Warmup Iteration   1: 81.969 ms/op
# Warmup Iteration   2: 61.114 ms/op
Iteration   1: 58.249 ms/op
Iteration   2: 58.057 ms/op
Iteration   3: 57.062 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  57.857 ±(99.9%) 1.481 ms/op [Average]
  (min, avg, max) = (57.062, 57.857, 58.481), stdev = 0.528
  CI (99.9%): [56.376, 59.339] (assumes normal distribution)


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

# Run progress: 91.30% complete, ETA 00:02:40
# Fork: 1 of 2
# Warmup Iteration   1: 14.029 ms/op
# Warmup Iteration   2: 10.095 ms/op
Iteration   1: 9.868 ms/op
Iteration   2: 9.724 ms/op
Iteration   3: 9.697 ms/op

# Run progress: 93.48% complete, ETA 00:01:58
# Fork: 2 of 2
# Warmup Iteration   1: 14.032 ms/op
# Warmup Iteration   2: 10.089 ms/op
Iteration   1: 10.170 ms/op
Iteration   2: 9.701 ms/op
Iteration   3: 9.699 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.810 ±(99.9%) 0.528 ms/op [Average]
  (min, avg, max) = (9.697, 9.810, 10.170), stdev = 0.188
  CI (99.9%): [9.282, 10.338] (assumes normal distribution)


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

# Run progress: 95.65% complete, ETA 00:01:17
# Fork: 1 of 2
# Warmup Iteration   1: 29.070 ms/op
# Warmup Iteration   2: 24.342 ms/op
Iteration   1: 24.364 ms/op
Iteration   2: 24.326 ms/op
Iteration   3: 24.577 ms/op

# Run progress: 97.83% complete, ETA 00:00:38
# Fork: 2 of 2
# Warmup Iteration   1: 28.743 ms/op
# Warmup Iteration   2: 24.493 ms/op
Iteration   1: 24.460 ms/op
Iteration   2: 24.416 ms/op
Iteration   3: 24.322 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  24.411 ±(99.9%) 0.273 ms/op [Average]
  (min, avg, max) = (24.322, 24.411, 24.577), stdev = 0.097
  CI (99.9%): [24.138, 24.683] (assumes normal distribution)


# Run complete. Total time: 00:28:47

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     19.422 ±    0.541  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.087 ±    0.028  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      7.841 ±    0.104  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      8.142 ±    0.261  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     13.408 ±    0.191  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    472.038 ±   56.767  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    569.758 ±   87.652  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    499.723 ±   15.638  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1090.183 ±   92.428  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.099 ±    0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.739 ±    0.799  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.570 ±    0.013  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.482 ±    0.014  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     27.871 ±   20.938  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  54314.306 ±  690.197  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   6230.015 ± 4589.013  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   2045.780 ±  263.979  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6      3.808 ±    0.606  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     19.621 ±    0.336  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     57.857 ±    1.481  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.810 ±    0.528  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     24.411 ±    0.273  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-regular-benchmarks.json
# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient

# Run progress: 0.00% complete, ETA 00:00:00
# Fork: 1 of 1
# Warmup Iteration   1: 51582.963 ms/op
Iteration   1: 48002.290 ms/op
Iteration   2: 47898.241 ms/op
Iteration   3: 47849.568 ms/op


Result "com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient":
  47916.700 ±(99.9%) 1423.309 ms/op [Average]
  (min, avg, max) = (47849.568, 47916.700, 48002.290), stdev = 78.016
  CI (99.9%): [46493.391, 49340.008] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset

# Run progress: 14.29% complete, ETA 00:19:33
# Fork: 1 of 1
# Warmup Iteration   1: 181488.678 ms/op
Iteration   1: 176881.939 ms/op
Iteration   2: 176519.600 ms/op
Iteration   3: 176770.915 ms/op


Result "com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset":
  176724.151 ±(99.9%) 3386.782 ms/op [Average]
  (min, avg, max) = (176519.600, 176724.151, 176881.939), stdev = 185.641
  CI (99.9%): [173337.370, 180110.933] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep
# Parameters: (eos = SRK)

# Run progress: 28.57% complete, ETA 00:37:49
# Fork: 1 of 1
# Warmup Iteration   1: 20139.101 ms/op
Iteration   1: 15576.093 ms/op
Iteration   2: 15293.747 ms/op
Iteration   3: 15238.251 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  15369.364 ±(99.9%) 3305.221 ms/op [Average]
  (min, avg, max) = (15238.251, 15369.364, 15576.093), stdev = 181.170
  CI (99.9%): [12064.143, 18674.584] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep
# Parameters: (eos = PR)

# Run progress: 42.86% complete, ETA 00:21:40
# Fork: 1 of 1
# Warmup Iteration   1: 21035.296 ms/op
Iteration   1: 15797.543 ms/op
Iteration   2: 15698.380 ms/op
Iteration   3: 15636.872 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  15710.932 ±(99.9%) 1478.977 ms/op [Average]
  (min, avg, max) = (15636.872, 15710.932, 15797.543), stdev = 81.068
  CI (99.9%): [14231.955, 17189.909] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable

# Run progress: 57.14% complete, ETA 00:13:04
# Fork: 1 of 1
# Warmup Iteration   1: 24023.543 ms/op
Iteration   1: 19242.282 ms/op
Iteration   2: 19075.254 ms/op
Iteration   3: 18943.776 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable":
  19087.104 ±(99.9%) 2729.353 ms/op [Average]
  (min, avg, max) = (18943.776, 19087.104, 19242.282), stdev = 149.605
  CI (99.9%): [16357.751, 21816.457] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid

# Run progress: 71.43% complete, ETA 00:07:30
# Fork: 1 of 1
# Warmup Iteration   1: 33716.058 ms/op
Iteration   1: 26943.270 ms/op
Iteration   2: 26437.027 ms/op
Iteration   3: 26373.734 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid":
  26584.677 ±(99.9%) 5694.940 ms/op [Average]
  (min, avg, max) = (26373.734, 26584.677, 26943.270), stdev = 312.159
  CI (99.9%): [20889.737, 32279.617] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.13, OpenJDK 64-Bit Server VM, 21.0.13+9-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 1 ms each
# Measurement: 3 iterations, 1 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp

# Run progress: 85.71% complete, ETA 00:03:26
# Fork: 1 of 1
# Warmup Iteration   1: 63423.913 ms/op
Iteration   1: 61524.144 ms/op
Iteration   2: 61284.278 ms/op
Iteration   3: 61299.194 ms/op


Result "com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp":
  61369.205 ±(99.9%) 2451.740 ms/op [Average]
  (min, avg, max) = (61284.278, 61369.205, 61524.144), stdev = 134.388
  CI (99.9%): [58917.465, 63820.946] (assumes normal distribution)


# Run complete. Total time: 00:24:48

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

Benchmark                                               (eos)  Mode  Cnt       Score      Error  Units
DynamicProcessBenchmark.separationControlTransient        N/A  avgt    3   47916.700 ± 1423.309  ms/op
MlTrainingDataBenchmark.processSurrogateDataset           N/A  avgt    3  176724.151 ± 3386.782  ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep        SRK  avgt    3   15369.364 ± 3305.221  ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep         PR  avgt    3   15710.932 ± 1478.977  ms/op
PropertyTableBenchmark.olgaThreePhaseTable                N/A  avgt    3   19087.104 ± 2729.353  ms/op
PropertyTableBenchmark.tpPropertyGrid                     N/A  avgt    3   26584.677 ± 5694.940  ms/op
TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp    N/A  avgt    3   61369.205 ± 2451.740  ms/op

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
$ mvn surefire:test -Dneqsim.version=3.28.0
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
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.263 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 9212 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5447778e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018746111, composition error=0.0030123554
TEG recycle lean TEG resycle: solved=true, flow error=3.9968029e-14, composition error=4.7067410e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.221 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 495207 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 495.2 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.053 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.LongRunSmokeTest
olgaThreePhaseTable[small]                                     16296.0  (450 ms)
tpPropertyGrid[small]                                          103.077  (367 ms)
separationControlTransient[small]                              158.784  (2267 ms)
processSimulationSweep[SRK, small]                             380.828  (2004 ms)
processSimulationSweep[PR, small]                              382.559  (2247 ms)
processSurrogateDataset[small]                                 1419.23  (4614 ms)
twoFluidTransient[small]                                       688.187  (447 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 15.44 s -- in com.equinor.neqsim.benchmark.LongRunSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (2 ms)
tpFlashWellFluidSrk                                            83.6406  (20 ms)
tpFlashWellFluidPr                                             83.6541  (23 ms)
tpFlashWellFluidWithProperties                                 5445.37  (24 ms)
phAndPsFlashWellFluid                                          2459.22  (28 ms)
Nov 21, 2026 6:41:50 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 21, 2026 6:41:50 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00976303  (183 ms)
gasOilSurfaceTension[Simple Gradient Theory]                0.00976303  (96 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (218 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (38 ms)
saturationPointsWellFluid                                      1601.32  (159 ms)
singlePhaseGasPipelineSteadyState                              121.629  (763 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98718  (1487 ms)
levenbergMarquardtAntoine                                      1837.31  (9 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (10 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.814 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  08:52 min
[INFO] Finished at: 2026-11-21T06:41:53Z
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
$ mvn surefire:test -Dneqsim.version=3.29.0
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
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.657 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 4041 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5447778e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018746111, composition error=0.0030123554
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=4.7067410e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.048 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 497244 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 59 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    9.78e-04 (tolerance: 1.00e-03) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  2.13e-05 (tolerance: 1.00e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     1.08e-04 (tolerance: 1.00e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: no tolerance given - using the engineering default 1.0e-03 relative on flow, temperature and pressure
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 1.99e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264558.9 + 377858.7, oil 1995395.0 + 2850659.6, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.437 MSm3/d, KA27841 A 100.3 bara, pipeline outlet 78.9 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 497.3 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.055 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.LongRunSmokeTest
olgaThreePhaseTable[small]                                     16322.0  (497 ms)
tpPropertyGrid[small]                                          103.077  (412 ms)
separationControlTransient[small]                              158.784  (2160 ms)
processSimulationSweep[SRK, small]                             380.828  (1860 ms)
processSimulationSweep[PR, small]                              382.559  (2091 ms)
processSurrogateDataset[small]                                 1419.23  (3055 ms)
twoFluidTransient[small]                                       688.187  (371 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 12.26 s -- in com.equinor.neqsim.benchmark.LongRunSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (4 ms)
tpFlashWellFluidSrk                                            83.6406  (24 ms)
tpFlashWellFluidPr                                             83.6541  (30 ms)
tpFlashWellFluidWithProperties                                 5445.37  (34 ms)
phAndPsFlashWellFluid                                          2459.22  (46 ms)
Nov 21, 2026 7:54:19 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 21, 2026 7:54:19 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00976303  (226 ms)
gasOilSurfaceTension[Simple Gradient Theory]                0.00976303  (105 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (196 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (35 ms)
saturationPointsWellFluid                                      1601.32  (212 ms)
singlePhaseGasPipelineSteadyState                              121.629  (803 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98718  (1583 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (9 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (13 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.258 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  08:44 min
[INFO] Finished at: 2026-11-21T07:54:22Z
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

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.TPflash_UMR.testFlash_UMR | 2427.78 | 569.758 | -76.53% | Separate CIs |
| process.TEGprocess.testTEGprocess | 6294.88 | 2045.78 | -67.50% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 4356.25 | 6230.01 | +43.01% | Overlapping CIs |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=PR) | 24607.5 | 15710.9 | -36.15% | Separate CIs |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=SRK) | 24051.1 | 15369.4 | -36.10% | Separate CIs |
| longrun.MlTrainingDataBenchmark.processSurrogateDataset | 274264 | 176724 | -35.56% | Separate CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.52727 | 1.08723 | -28.81% | Separate CIs |
| longrun.PropertyTableBenchmark.olgaThreePhaseTable | 23533.8 | 19087.1 | -18.90% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 32.2066 | 27.871 | -13.46% | Overlapping CIs |
| longrun.DynamicProcessBenchmark.separationControlTransient | 54528.6 | 47916.7 | -12.13% | Separate CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread. Long-running `longrun` cases (30 s to 5 min per operation): one fork, one warmup operation and three measured operations, so their confidence intervals are wide.

```
