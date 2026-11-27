# NeqSim 3.30.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.29.0 |
| Current | 3.30.0 |
| Source commit | `fe2b4d2a297173e93a5ddd1056fe84fc522034e6` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/45952906227) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 16,
  "label": "B16-8d65e2abc344",
  "fingerprint": "8d65e2abc34477bc3de280af8d8c1ed1b19f0004d0ed2f70ac049ae3ab913439",
  "source_commit": "fe2b4d2a297173e93a5ddd1056fe84fc522034e6",
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
BogoMIPS:                                4890.84
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
| baseline | 3.29.0 | passed |
| current | 3.30.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.29.0",
  "version": "3.29.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.29.0/neqsim-3.29.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.30.0",
  "version": "3.30.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.30.0/neqsim-3.30.0.jar",
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
[INFO] Total time:  5.939 s
[INFO] Finished at: 2026-11-27T06:36:36Z
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
[INFO] Total time:  16.240 s
[INFO] Finished at: 2026-11-27T06:36:53Z
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
# Warmup Iteration   1: 25.423 ms/op
# Warmup Iteration   2: 19.708 ms/op
Iteration   1: 19.584 ms/op
Iteration   2: 19.536 ms/op
Iteration   3: 19.565 ms/op

# Run progress: 2.17% complete, ETA 00:09:14
# Fork: 2 of 2
# Warmup Iteration   1: 30.327 ms/op
# Warmup Iteration   2: 19.658 ms/op
Iteration   1: 19.602 ms/op
Iteration   2: 19.444 ms/op
Iteration   3: 19.276 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  19.501 ±(99.9%) 0.346 ms/op [Average]
  (min, avg, max) = (19.276, 19.501, 19.602), stdev = 0.123
  CI (99.9%): [19.155, 19.847] (assumes normal distribution)


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
# Warmup Iteration   1: 2.398 ms/op
# Warmup Iteration   2: 1.150 ms/op
Iteration   1: 1.107 ms/op
Iteration   2: 1.085 ms/op
Iteration   3: 1.079 ms/op

# Run progress: 6.52% complete, ETA 00:08:48
# Fork: 2 of 2
# Warmup Iteration   1: 2.005 ms/op
# Warmup Iteration   2: 1.134 ms/op
Iteration   1: 1.094 ms/op
Iteration   2: 1.092 ms/op
Iteration   3: 1.084 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.090 ±(99.9%) 0.027 ms/op [Average]
  (min, avg, max) = (1.079, 1.090, 1.107), stdev = 0.010
  CI (99.9%): [1.063, 1.118] (assumes normal distribution)


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

# Run progress: 8.70% complete, ETA 00:08:35
# Fork: 1 of 2
# Warmup Iteration   1: 17.419 ms/op
# Warmup Iteration   2: 8.177 ms/op
Iteration   1: 7.967 ms/op
Iteration   2: 7.817 ms/op
Iteration   3: 7.809 ms/op

# Run progress: 10.87% complete, ETA 00:08:22
# Fork: 2 of 2
# Warmup Iteration   1: 17.356 ms/op
# Warmup Iteration   2: 8.463 ms/op
Iteration   1: 7.896 ms/op
Iteration   2: 7.977 ms/op
Iteration   3: 7.812 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.880 ±(99.9%) 0.220 ms/op [Average]
  (min, avg, max) = (7.809, 7.880, 7.977), stdev = 0.079
  CI (99.9%): [7.659, 8.100] (assumes normal distribution)


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
# Warmup Iteration   1: 12.397 ms/op
# Warmup Iteration   2: 8.545 ms/op
Iteration   1: 8.138 ms/op
Iteration   2: 8.163 ms/op
Iteration   3: 8.148 ms/op

# Run progress: 15.22% complete, ETA 00:07:56
# Fork: 2 of 2
# Warmup Iteration   1: 17.898 ms/op
# Warmup Iteration   2: 8.969 ms/op
Iteration   1: 8.116 ms/op
Iteration   2: 8.139 ms/op
Iteration   3: 8.104 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  8.135 ±(99.9%) 0.060 ms/op [Average]
  (min, avg, max) = (8.104, 8.135, 8.163), stdev = 0.021
  CI (99.9%): [8.075, 8.195] (assumes normal distribution)


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

# Run progress: 17.39% complete, ETA 00:07:44
# Fork: 1 of 2
# Warmup Iteration   1: 32.299 ms/op
# Warmup Iteration   2: 15.598 ms/op
Iteration   1: 13.548 ms/op
Iteration   2: 13.482 ms/op
Iteration   3: 13.344 ms/op

# Run progress: 19.57% complete, ETA 00:07:32
# Fork: 2 of 2
# Warmup Iteration   1: 23.665 ms/op
# Warmup Iteration   2: 14.361 ms/op
Iteration   1: 13.427 ms/op
Iteration   2: 13.349 ms/op
Iteration   3: 13.266 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.403 ±(99.9%) 0.289 ms/op [Average]
  (min, avg, max) = (13.266, 13.403, 13.548), stdev = 0.103
  CI (99.9%): [13.114, 13.691] (assumes normal distribution)


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
# Warmup Iteration   1: 2300.122 ms/op
# Warmup Iteration   2: 615.340 ms/op
Iteration   1: 483.394 ms/op
Iteration   2: 463.070 ms/op
Iteration   3: 457.354 ms/op

# Run progress: 23.91% complete, ETA 00:07:07
# Fork: 2 of 2
# Warmup Iteration   1: 2305.335 ms/op
# Warmup Iteration   2: 671.316 ms/op
Iteration   1: 487.450 ms/op
Iteration   2: 464.274 ms/op
Iteration   3: 475.129 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  471.778 ±(99.9%) 33.928 ms/op [Average]
  (min, avg, max) = (457.354, 471.778, 487.450), stdev = 12.099
  CI (99.9%): [437.850, 505.707] (assumes normal distribution)


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

# Run progress: 26.09% complete, ETA 00:06:53
# Fork: 1 of 2
# Warmup Iteration   1: 2640.690 ms/op
# Warmup Iteration   2: 768.668 ms/op
Iteration   1: 611.003 ms/op
Iteration   2: 566.538 ms/op
Iteration   3: 516.456 ms/op

# Run progress: 28.26% complete, ETA 00:06:41
# Fork: 2 of 2
# Warmup Iteration   1: 2520.647 ms/op
# Warmup Iteration   2: 777.544 ms/op
Iteration   1: 591.364 ms/op
Iteration   2: 541.117 ms/op
Iteration   3: 535.300 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  560.296 ±(99.9%) 101.028 ms/op [Average]
  (min, avg, max) = (516.456, 560.296, 611.003), stdev = 36.027
  CI (99.9%): [459.269, 661.324] (assumes normal distribution)


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

# Run progress: 30.43% complete, ETA 00:06:28
# Fork: 1 of 2
# Warmup Iteration   1: 1238.505 ms/op
# Warmup Iteration   2: 536.859 ms/op
Iteration   1: 506.599 ms/op
Iteration   2: 504.772 ms/op
Iteration   3: 501.929 ms/op

# Run progress: 32.61% complete, ETA 00:06:13
# Fork: 2 of 2
# Warmup Iteration   1: 1233.113 ms/op
# Warmup Iteration   2: 535.621 ms/op
Iteration   1: 501.133 ms/op
Iteration   2: 497.633 ms/op
Iteration   3: 493.422 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  500.915 ±(99.9%) 13.458 ms/op [Average]
  (min, avg, max) = (493.422, 500.915, 506.599), stdev = 4.799
  CI (99.9%): [487.456, 514.373] (assumes normal distribution)


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

# Run progress: 34.78% complete, ETA 00:06:01
# Fork: 1 of 2
# Warmup Iteration   1: 2670.619 ms/op
# Warmup Iteration   2: 1161.164 ms/op
Iteration   1: 1129.208 ms/op
Iteration   2: 1088.539 ms/op
Iteration   3: 1068.097 ms/op

# Run progress: 36.96% complete, ETA 00:05:48
# Fork: 2 of 2
# Warmup Iteration   1: 2824.307 ms/op
# Warmup Iteration   2: 1178.775 ms/op
Iteration   1: 1111.038 ms/op
Iteration   2: 1066.184 ms/op
Iteration   3: 1069.936 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1088.834 ±(99.9%) 73.375 ms/op [Average]
  (min, avg, max) = (1066.184, 1088.834, 1129.208), stdev = 26.166
  CI (99.9%): [1015.459, 1162.208] (assumes normal distribution)


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

# Run progress: 39.13% complete, ETA 00:05:36
# Fork: 1 of 2
# Warmup Iteration   1: 0.149 ms/op
# Warmup Iteration   2: 0.099 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.098 ms/op

# Run progress: 41.30% complete, ETA 00:05:22
# Fork: 2 of 2
# Warmup Iteration   1: 0.160 ms/op
# Warmup Iteration   2: 0.099 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.099 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.099 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.098, 0.099, 0.099), stdev = 0.001
  CI (99.9%): [0.098, 0.099] (assumes normal distribution)


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

# Run progress: 43.48% complete, ETA 00:05:08
# Fork: 1 of 2
# Warmup Iteration   1: 11.591 ms/op
# Warmup Iteration   2: 8.134 ms/op
Iteration   1: 8.095 ms/op
Iteration   2: 8.071 ms/op
Iteration   3: 8.054 ms/op

# Run progress: 45.65% complete, ETA 00:04:54
# Fork: 2 of 2
# Warmup Iteration   1: 11.304 ms/op
# Warmup Iteration   2: 8.224 ms/op
Iteration   1: 8.062 ms/op
Iteration   2: 7.690 ms/op
Iteration   3: 7.392 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.894 ±(99.9%) 0.812 ms/op [Average]
  (min, avg, max) = (7.392, 7.894, 8.095), stdev = 0.290
  CI (99.9%): [7.082, 8.706] (assumes normal distribution)


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

# Run progress: 47.83% complete, ETA 00:04:40
# Fork: 1 of 2
# Warmup Iteration   1: 0.837 ms/op
# Warmup Iteration   2: 0.567 ms/op
Iteration   1: 0.570 ms/op
Iteration   2: 0.571 ms/op
Iteration   3: 0.576 ms/op

# Run progress: 50.00% complete, ETA 00:04:27
# Fork: 2 of 2
# Warmup Iteration   1: 0.847 ms/op
# Warmup Iteration   2: 0.578 ms/op
Iteration   1: 0.588 ms/op
Iteration   2: 0.587 ms/op
Iteration   3: 0.585 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.579 ±(99.9%) 0.023 ms/op [Average]
  (min, avg, max) = (0.570, 0.579, 0.588), stdev = 0.008
  CI (99.9%): [0.557, 0.602] (assumes normal distribution)


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

# Run progress: 52.17% complete, ETA 00:04:14
# Fork: 1 of 2
# Warmup Iteration   1: 2.154 ms/op
# Warmup Iteration   2: 1.534 ms/op
Iteration   1: 1.489 ms/op
Iteration   2: 1.481 ms/op
Iteration   3: 1.484 ms/op

# Run progress: 54.35% complete, ETA 00:04:02
# Fork: 2 of 2
# Warmup Iteration   1: 2.122 ms/op
# Warmup Iteration   2: 1.512 ms/op
Iteration   1: 1.488 ms/op
Iteration   2: 1.480 ms/op
Iteration   3: 1.482 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.484 ±(99.9%) 0.011 ms/op [Average]
  (min, avg, max) = (1.480, 1.484, 1.489), stdev = 0.004
  CI (99.9%): [1.473, 1.495] (assumes normal distribution)


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

# Run progress: 56.52% complete, ETA 00:03:49
# Fork: 1 of 2
# Warmup Iteration   1: 167.779 ms/op
# Warmup Iteration   2: 36.915 ms/op
Iteration   1: 28.239 ms/op
Iteration   2: 23.729 ms/op
Iteration   3: 22.772 ms/op

# Run progress: 58.70% complete, ETA 00:03:37
# Fork: 2 of 2
# Warmup Iteration   1: 182.948 ms/op
# Warmup Iteration   2: 38.629 ms/op
Iteration   1: 45.462 ms/op
Iteration   2: 30.106 ms/op
Iteration   3: 21.881 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  28.698 ±(99.9%) 24.751 ms/op [Average]
  (min, avg, max) = (21.881, 28.698, 45.462), stdev = 8.826
  CI (99.9%): [3.948, 53.449] (assumes normal distribution)


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

# Run progress: 60.87% complete, ETA 00:03:25
# Fork: 1 of 2
# Warmup Iteration   1: 58545.191 ms/op
# Warmup Iteration   2: 55020.649 ms/op
Iteration   1: 54654.086 ms/op
Iteration   2: 54411.218 ms/op
Iteration   3: 54349.117 ms/op

# Run progress: 63.04% complete, ETA 00:05:50
# Fork: 2 of 2
# Warmup Iteration   1: 58098.759 ms/op
# Warmup Iteration   2: 54344.270 ms/op
Iteration   1: 53910.237 ms/op
Iteration   2: 53880.346 ms/op
Iteration   3: 53918.555 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  54187.260 ±(99.9%) 919.348 ms/op [Average]
  (min, avg, max) = (53880.346, 54187.260, 54654.086), stdev = 327.848
  CI (99.9%): [53267.912, 55106.607] (assumes normal distribution)


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
# Warmup Iteration   1: 9129.115 ms/op
# Warmup Iteration   2: 5393.481 ms/op
Iteration   1: 8244.697 ms/op
Iteration   2: 4710.742 ms/op
Iteration   3: 5746.136 ms/op

# Run progress: 67.39% complete, ETA 00:09:48
# Fork: 2 of 2
# Warmup Iteration   1: 9146.132 ms/op
# Warmup Iteration   2: 5407.429 ms/op
Iteration   1: 8223.767 ms/op
Iteration   2: 4671.153 ms/op
Iteration   3: 5766.716 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  6227.202 ±(99.9%) 4559.882 ms/op [Average]
  (min, avg, max) = (4671.153, 6227.202, 8244.697), stdev = 1626.098
  CI (99.9%): [1667.320, 10787.084] (assumes normal distribution)


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

# Run progress: 69.57% complete, ETA 00:11:22
# Fork: 1 of 2
# Warmup Iteration   1: 4689.781 ms/op
# Warmup Iteration   2: 2217.625 ms/op
Iteration   1: 2132.739 ms/op
Iteration   2: 2096.717 ms/op
Iteration   3: 1951.486 ms/op

# Run progress: 71.74% complete, ETA 00:10:20
# Fork: 2 of 2
# Warmup Iteration   1: 4767.397 ms/op
# Warmup Iteration   2: 2561.379 ms/op
Iteration   1: 2022.067 ms/op
Iteration   2: 2185.130 ms/op
Iteration   3: 2050.655 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  2073.132 ±(99.9%) 233.147 ms/op [Average]
  (min, avg, max) = (1951.486, 2073.132, 2185.130), stdev = 83.143
  CI (99.9%): [1839.985, 2306.279] (assumes normal distribution)


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
# Warmup Iteration   1: Nov 27, 2026 7:12:33 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 27, 2026 7:12:33 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
6.144 ms/op
# Warmup Iteration   2: 3.609 ms/op
Iteration   1: 3.584 ms/op
Iteration   2: 3.582 ms/op
Iteration   3: 3.571 ms/op

# Run progress: 76.09% complete, ETA 00:08:23
# Fork: 2 of 2
# Warmup Iteration   1: Nov 27, 2026 7:12:45 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 27, 2026 7:12:45 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
6.029 ms/op
# Warmup Iteration   2: 3.623 ms/op
Iteration   1: 3.581 ms/op
Iteration   2: 3.602 ms/op
Iteration   3: 3.583 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  3.584 ±(99.9%) 0.028 ms/op [Average]
  (min, avg, max) = (3.571, 3.584, 3.602), stdev = 0.010
  CI (99.9%): [3.556, 3.612] (assumes normal distribution)


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
# Warmup Iteration   1: 22.371 ms/op
# Warmup Iteration   2: 19.723 ms/op
Iteration   1: 19.814 ms/op
Iteration   2: 19.707 ms/op
Iteration   3: 19.554 ms/op

# Run progress: 80.43% complete, ETA 00:06:34
# Fork: 2 of 2
# Warmup Iteration   1: 21.623 ms/op
# Warmup Iteration   2: 18.724 ms/op
Iteration   1: 19.746 ms/op
Iteration   2: 19.725 ms/op
Iteration   3: 19.471 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  19.669 ±(99.9%) 0.364 ms/op [Average]
  (min, avg, max) = (19.471, 19.669, 19.814), stdev = 0.130
  CI (99.9%): [19.306, 20.033] (assumes normal distribution)


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

# Run progress: 82.61% complete, ETA 00:05:44
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
# Warmup Iteration   1: 82.031 ms/op
# Warmup Iteration   2: 60.117 ms/op
Iteration   1: 58.355 ms/op
Iteration   2: 57.645 ms/op
Iteration   3: 57.459 ms/op

# Run progress: 89.13% complete, ETA 00:03:23
# Fork: 2 of 2
# Warmup Iteration   1: 81.654 ms/op
# Warmup Iteration   2: 61.256 ms/op
Iteration   1: 58.418 ms/op
Iteration   2: 57.770 ms/op
Iteration   3: 57.303 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  57.825 ±(99.9%) 1.300 ms/op [Average]
  (min, avg, max) = (57.303, 57.825, 58.418), stdev = 0.464
  CI (99.9%): [56.525, 59.125] (assumes normal distribution)


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
# Warmup Iteration   1: 15.433 ms/op
# Warmup Iteration   2: 10.006 ms/op
Iteration   1: 9.688 ms/op
Iteration   2: 9.513 ms/op
Iteration   3: 9.542 ms/op

# Run progress: 93.48% complete, ETA 00:01:58
# Fork: 2 of 2
# Warmup Iteration   1: 14.034 ms/op
# Warmup Iteration   2: 10.174 ms/op
Iteration   1: 9.916 ms/op
Iteration   2: 9.789 ms/op
Iteration   3: 9.754 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.700 ±(99.9%) 0.430 ms/op [Average]
  (min, avg, max) = (9.513, 9.700, 9.916), stdev = 0.153
  CI (99.9%): [9.270, 10.130] (assumes normal distribution)


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
# Warmup Iteration   1: 30.125 ms/op
# Warmup Iteration   2: 24.546 ms/op
Iteration   1: 24.442 ms/op
Iteration   2: 24.385 ms/op
Iteration   3: 24.419 ms/op

# Run progress: 97.83% complete, ETA 00:00:38
# Fork: 2 of 2
# Warmup Iteration   1: 29.215 ms/op
# Warmup Iteration   2: 24.430 ms/op
Iteration   1: 24.473 ms/op
Iteration   2: 24.359 ms/op
Iteration   3: 24.378 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  24.409 ±(99.9%) 0.121 ms/op [Average]
  (min, avg, max) = (24.359, 24.409, 24.473), stdev = 0.043
  CI (99.9%): [24.289, 24.530] (assumes normal distribution)


# Run complete. Total time: 00:28:48

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     19.501 ±    0.346  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.090 ±    0.027  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      7.880 ±    0.220  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      8.135 ±    0.060  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     13.403 ±    0.289  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    471.778 ±   33.928  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    560.296 ±  101.028  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    500.915 ±   13.458  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1088.834 ±   73.375  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.099 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.894 ±    0.812  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.579 ±    0.023  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.484 ±    0.011  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     28.698 ±   24.751  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  54187.260 ±  919.348  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   6227.202 ± 4559.882  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   2073.132 ±  233.147  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6      3.584 ±    0.028  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     19.669 ±    0.364  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     57.825 ±    1.300  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.700 ±    0.430  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     24.409 ±    0.121  ms/op

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
# Warmup Iteration   1: 51550.604 ms/op
Iteration   1: 48510.109 ms/op
Iteration   2: 48244.494 ms/op
Iteration   3: 48268.955 ms/op


Result "com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient":
  48341.186 ±(99.9%) 2678.217 ms/op [Average]
  (min, avg, max) = (48244.494, 48341.186, 48510.109), stdev = 146.802
  CI (99.9%): [45662.969, 51019.403] (assumes normal distribution)


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

# Run progress: 14.29% complete, ETA 00:19:41
# Fork: 1 of 1
# Warmup Iteration   1: 177685.524 ms/op
Iteration   1: 177555.057 ms/op
Iteration   2: 176406.096 ms/op
Iteration   3: 176393.941 ms/op


Result "com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset":
  176785.031 ±(99.9%) 12166.551 ms/op [Average]
  (min, avg, max) = (176393.941, 176785.031, 177555.057), stdev = 666.890
  CI (99.9%): [164618.480, 188951.583] (assumes normal distribution)


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

# Run progress: 28.57% complete, ETA 00:37:43
# Fork: 1 of 1
# Warmup Iteration   1: 19608.006 ms/op
Iteration   1: 15298.308 ms/op
Iteration   2: 15069.548 ms/op
Iteration   3: 15008.953 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  15125.603 ±(99.9%) 2784.080 ms/op [Average]
  (min, avg, max) = (15008.953, 15125.603, 15298.308), stdev = 152.605
  CI (99.9%): [12341.523, 17909.683] (assumes normal distribution)


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

# Run progress: 42.86% complete, ETA 00:21:35
# Fork: 1 of 1
# Warmup Iteration   1: 21266.555 ms/op
Iteration   1: 15864.691 ms/op
Iteration   2: 15755.853 ms/op
Iteration   3: 15683.105 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  15767.883 ±(99.9%) 1667.279 ms/op [Average]
  (min, avg, max) = (15683.105, 15767.883, 15864.691), stdev = 91.389
  CI (99.9%): [14100.604, 17435.162] (assumes normal distribution)


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

# Run progress: 57.14% complete, ETA 00:13:01
# Fork: 1 of 1
# Warmup Iteration   1: 22866.094 ms/op
Iteration   1: 19318.594 ms/op
Iteration   2: 19158.638 ms/op
Iteration   3: 19169.291 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable":
  19215.508 ±(99.9%) 1631.610 ms/op [Average]
  (min, avg, max) = (19158.638, 19215.508, 19318.594), stdev = 89.434
  CI (99.9%): [17583.898, 20847.118] (assumes normal distribution)


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

# Run progress: 71.43% complete, ETA 00:07:29
# Fork: 1 of 1
# Warmup Iteration   1: 32769.647 ms/op
Iteration   1: 26643.707 ms/op
Iteration   2: 26406.656 ms/op
Iteration   3: 26387.306 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid":
  26479.223 ±(99.9%) 2604.750 ms/op [Average]
  (min, avg, max) = (26387.306, 26479.223, 26643.707), stdev = 142.775
  CI (99.9%): [23874.472, 29083.973] (assumes normal distribution)


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

# Run progress: 85.71% complete, ETA 00:03:25
# Fork: 1 of 1
# Warmup Iteration   1: 63814.385 ms/op
Iteration   1: 61304.705 ms/op
Iteration   2: 61416.075 ms/op
Iteration   3: 61361.616 ms/op


Result "com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp":
  61360.799 ±(99.9%) 1015.987 ms/op [Average]
  (min, avg, max) = (61304.705, 61360.799, 61416.075), stdev = 55.690
  CI (99.9%): [60344.812, 62376.786] (assumes normal distribution)


# Run complete. Total time: 00:24:43

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

Benchmark                                               (eos)  Mode  Cnt       Score       Error  Units
DynamicProcessBenchmark.separationControlTransient        N/A  avgt    3   48341.186 ±  2678.217  ms/op
MlTrainingDataBenchmark.processSurrogateDataset           N/A  avgt    3  176785.031 ± 12166.551  ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep        SRK  avgt    3   15125.603 ±  2784.080  ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep         PR  avgt    3   15767.883 ±  1667.279  ms/op
PropertyTableBenchmark.olgaThreePhaseTable                N/A  avgt    3   19215.508 ±  1631.610  ms/op
PropertyTableBenchmark.tpPropertyGrid                     N/A  avgt    3   26479.223 ±  2604.750  ms/op
TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp    N/A  avgt    3   61360.799 ±  1015.987  ms/op

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
[INFO] Total time:  2.875 s
[INFO] Finished at: 2026-11-27T07:39:39Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.30.0 (neqsim-3.30.0.jar); requested: 3.30.0
$ mvn clean package -DskipTests -Dneqsim.version=3.30.0
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.30.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.30.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  11.029 s
[INFO] Finished at: 2026-11-27T07:39:52Z
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
# Warmup Iteration   1: 34.086 ms/op
# Warmup Iteration   2: 19.893 ms/op
Iteration   1: 19.477 ms/op
Iteration   2: 19.495 ms/op
Iteration   3: 19.595 ms/op

# Run progress: 2.17% complete, ETA 00:09:11
# Fork: 2 of 2
# Warmup Iteration   1: 27.247 ms/op
# Warmup Iteration   2: 19.776 ms/op
Iteration   1: 19.647 ms/op
Iteration   2: 19.530 ms/op
Iteration   3: 19.481 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  19.538 ±(99.9%) 0.194 ms/op [Average]
  (min, avg, max) = (19.477, 19.538, 19.647), stdev = 0.069
  CI (99.9%): [19.343, 19.732] (assumes normal distribution)


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
# Warmup Iteration   1: 1.952 ms/op
# Warmup Iteration   2: 1.158 ms/op
Iteration   1: 1.097 ms/op
Iteration   2: 1.091 ms/op
Iteration   3: 1.083 ms/op

# Run progress: 6.52% complete, ETA 00:08:44
# Fork: 2 of 2
# Warmup Iteration   1: 1.871 ms/op
# Warmup Iteration   2: 1.123 ms/op
Iteration   1: 1.093 ms/op
Iteration   2: 1.088 ms/op
Iteration   3: 1.079 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.089 ±(99.9%) 0.019 ms/op [Average]
  (min, avg, max) = (1.079, 1.089, 1.097), stdev = 0.007
  CI (99.9%): [1.070, 1.107] (assumes normal distribution)


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
# Warmup Iteration   1: 17.618 ms/op
# Warmup Iteration   2: 8.329 ms/op
Iteration   1: 7.894 ms/op
Iteration   2: 7.871 ms/op
Iteration   3: 7.916 ms/op

# Run progress: 10.87% complete, ETA 00:08:19
# Fork: 2 of 2
# Warmup Iteration   1: 12.702 ms/op
# Warmup Iteration   2: 8.309 ms/op
Iteration   1: 7.865 ms/op
Iteration   2: 7.881 ms/op
Iteration   3: 7.871 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.883 ±(99.9%) 0.054 ms/op [Average]
  (min, avg, max) = (7.865, 7.883, 7.916), stdev = 0.019
  CI (99.9%): [7.829, 7.937] (assumes normal distribution)


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
# Warmup Iteration   1: 18.364 ms/op
# Warmup Iteration   2: 10.323 ms/op
Iteration   1: 8.193 ms/op
Iteration   2: 8.136 ms/op
Iteration   3: 8.081 ms/op

# Run progress: 15.22% complete, ETA 00:07:57
# Fork: 2 of 2
# Warmup Iteration   1: 12.706 ms/op
# Warmup Iteration   2: 8.843 ms/op
Iteration   1: 8.110 ms/op
Iteration   2: 8.122 ms/op
Iteration   3: 8.082 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  8.120 ±(99.9%) 0.117 ms/op [Average]
  (min, avg, max) = (8.081, 8.120, 8.193), stdev = 0.042
  CI (99.9%): [8.004, 8.237] (assumes normal distribution)


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

# Run progress: 17.39% complete, ETA 00:07:44
# Fork: 1 of 2
# Warmup Iteration   1: 24.216 ms/op
# Warmup Iteration   2: 14.789 ms/op
Iteration   1: 13.821 ms/op
Iteration   2: 13.466 ms/op
Iteration   3: 13.395 ms/op

# Run progress: 19.57% complete, ETA 00:07:31
# Fork: 2 of 2
# Warmup Iteration   1: 25.066 ms/op
# Warmup Iteration   2: 14.753 ms/op
Iteration   1: 13.525 ms/op
Iteration   2: 13.406 ms/op
Iteration   3: 13.535 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.525 ±(99.9%) 0.439 ms/op [Average]
  (min, avg, max) = (13.395, 13.525, 13.821), stdev = 0.156
  CI (99.9%): [13.086, 13.963] (assumes normal distribution)


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
# Warmup Iteration   1: 2318.820 ms/op
# Warmup Iteration   2: 601.401 ms/op
Iteration   1: 483.191 ms/op
Iteration   2: 473.143 ms/op
Iteration   3: 462.422 ms/op

# Run progress: 23.91% complete, ETA 00:07:06
# Fork: 2 of 2
# Warmup Iteration   1: 2280.946 ms/op
# Warmup Iteration   2: 674.415 ms/op
Iteration   1: 496.840 ms/op
Iteration   2: 475.148 ms/op
Iteration   3: 474.913 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  477.610 ±(99.9%) 32.337 ms/op [Average]
  (min, avg, max) = (462.422, 477.610, 496.840), stdev = 11.532
  CI (99.9%): [445.272, 509.947] (assumes normal distribution)


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

# Run progress: 26.09% complete, ETA 00:06:53
# Fork: 1 of 2
# Warmup Iteration   1: 3079.086 ms/op
# Warmup Iteration   2: 1235.525 ms/op
Iteration   1: 936.328 ms/op
Iteration   2: 933.235 ms/op
Iteration   3: 935.009 ms/op

# Run progress: 28.26% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 2876.763 ms/op
# Warmup Iteration   2: 1169.408 ms/op
Iteration   1: 949.502 ms/op
Iteration   2: 938.056 ms/op
Iteration   3: 891.621 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  930.625 ±(99.9%) 55.964 ms/op [Average]
  (min, avg, max) = (891.621, 930.625, 949.502), stdev = 19.957
  CI (99.9%): [874.661, 986.589] (assumes normal distribution)


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

# Run progress: 30.43% complete, ETA 00:06:37
# Fork: 1 of 2
# Warmup Iteration   1: 1246.397 ms/op
# Warmup Iteration   2: 519.518 ms/op
Iteration   1: 505.257 ms/op
Iteration   2: 511.336 ms/op
Iteration   3: 496.848 ms/op

# Run progress: 32.61% complete, ETA 00:06:23
# Fork: 2 of 2
# Warmup Iteration   1: 1216.661 ms/op
# Warmup Iteration   2: 531.474 ms/op
Iteration   1: 509.027 ms/op
Iteration   2: 497.832 ms/op
Iteration   3: 497.339 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  502.940 ±(99.9%) 18.064 ms/op [Average]
  (min, avg, max) = (496.848, 502.940, 511.336), stdev = 6.442
  CI (99.9%): [484.875, 521.004] (assumes normal distribution)


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

# Run progress: 34.78% complete, ETA 00:06:09
# Fork: 1 of 2
# Warmup Iteration   1: 2671.380 ms/op
# Warmup Iteration   2: 1194.383 ms/op
Iteration   1: 1141.432 ms/op
Iteration   2: 1083.065 ms/op
Iteration   3: 1101.760 ms/op

# Run progress: 36.96% complete, ETA 00:05:56
# Fork: 2 of 2
# Warmup Iteration   1: 2696.066 ms/op
# Warmup Iteration   2: 1145.603 ms/op
Iteration   1: 1140.094 ms/op
Iteration   2: 1082.401 ms/op
Iteration   3: 1098.003 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1107.792 ±(99.9%) 74.861 ms/op [Average]
  (min, avg, max) = (1082.401, 1107.792, 1141.432), stdev = 26.696
  CI (99.9%): [1032.931, 1182.653] (assumes normal distribution)


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

# Run progress: 39.13% complete, ETA 00:05:43
# Fork: 1 of 2
# Warmup Iteration   1: 0.158 ms/op
# Warmup Iteration   2: 0.100 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.100 ms/op

# Run progress: 41.30% complete, ETA 00:05:28
# Fork: 2 of 2
# Warmup Iteration   1: 0.149 ms/op
# Warmup Iteration   2: 0.099 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.099 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.099 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.099, 0.099, 0.100), stdev = 0.001
  CI (99.9%): [0.099, 0.100] (assumes normal distribution)


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
# Warmup Iteration   1: 14.201 ms/op
# Warmup Iteration   2: 8.147 ms/op
Iteration   1: 8.078 ms/op
Iteration   2: 8.126 ms/op
Iteration   3: 8.059 ms/op

# Run progress: 45.65% complete, ETA 00:04:59
# Fork: 2 of 2
# Warmup Iteration   1: 10.894 ms/op
# Warmup Iteration   2: 8.120 ms/op
Iteration   1: 8.053 ms/op
Iteration   2: 7.665 ms/op
Iteration   3: 7.445 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.904 ±(99.9%) 0.787 ms/op [Average]
  (min, avg, max) = (7.445, 7.904, 8.126), stdev = 0.281
  CI (99.9%): [7.118, 8.691] (assumes normal distribution)


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

# Run progress: 47.83% complete, ETA 00:04:45
# Fork: 1 of 2
# Warmup Iteration   1: 0.847 ms/op
# Warmup Iteration   2: 0.633 ms/op
Iteration   1: 0.654 ms/op
Iteration   2: 0.655 ms/op
Iteration   3: 0.653 ms/op

# Run progress: 50.00% complete, ETA 00:04:32
# Fork: 2 of 2
# Warmup Iteration   1: 0.835 ms/op
# Warmup Iteration   2: 0.570 ms/op
Iteration   1: 0.566 ms/op
Iteration   2: 0.567 ms/op
Iteration   3: 0.574 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.612 ±(99.9%) 0.131 ms/op [Average]
  (min, avg, max) = (0.566, 0.612, 0.655), stdev = 0.047
  CI (99.9%): [0.481, 0.742] (assumes normal distribution)


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
# Warmup Iteration   1: 2.171 ms/op
# Warmup Iteration   2: 1.492 ms/op
Iteration   1: 1.486 ms/op
Iteration   2: 1.483 ms/op
Iteration   3: 1.482 ms/op

# Run progress: 54.35% complete, ETA 00:04:06
# Fork: 2 of 2
# Warmup Iteration   1: 2.118 ms/op
# Warmup Iteration   2: 1.517 ms/op
Iteration   1: 1.482 ms/op
Iteration   2: 1.478 ms/op
Iteration   3: 1.497 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.485 ±(99.9%) 0.018 ms/op [Average]
  (min, avg, max) = (1.478, 1.485, 1.497), stdev = 0.006
  CI (99.9%): [1.467, 1.502] (assumes normal distribution)


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
# Warmup Iteration   1: 200.558 ms/op
# Warmup Iteration   2: 36.829 ms/op
Iteration   1: 28.388 ms/op
Iteration   2: 25.288 ms/op
Iteration   3: 22.766 ms/op

# Run progress: 58.70% complete, ETA 00:03:40
# Fork: 2 of 2
# Warmup Iteration   1: 186.995 ms/op
# Warmup Iteration   2: 52.450 ms/op
Iteration   1: 43.041 ms/op
Iteration   2: 25.787 ms/op
Iteration   3: 21.588 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  27.810 ±(99.9%) 21.970 ms/op [Average]
  (min, avg, max) = (21.588, 27.810, 43.041), stdev = 7.835
  CI (99.9%): [5.840, 49.780] (assumes normal distribution)


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
# Warmup Iteration   1: 10951.035 ms/op
# Warmup Iteration   2: 8063.884 ms/op
Iteration   1: 7529.654 ms/op
Iteration   2: 7499.938 ms/op
Iteration   3: 7526.674 ms/op

# Run progress: 63.04% complete, ETA 00:03:35
# Fork: 2 of 2
# Warmup Iteration   1: 11492.630 ms/op
# Warmup Iteration   2: 7886.549 ms/op
Iteration   1: 7483.829 ms/op
Iteration   2: 7439.289 ms/op
Iteration   3: 7388.848 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  7478.038 ±(99.9%) 153.588 ms/op [Average]
  (min, avg, max) = (7388.848, 7478.038, 7529.654), stdev = 54.771
  CI (99.9%): [7324.451, 7631.626] (assumes normal distribution)


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

# Run progress: 65.22% complete, ETA 00:03:38
# Fork: 1 of 2
# Warmup Iteration   1: 1220.847 ms/op
# Warmup Iteration   2: 1187.401 ms/op
Iteration   1: 936.203 ms/op
Iteration   2: 906.498 ms/op
Iteration   3: 943.976 ms/op

# Run progress: 67.39% complete, ETA 00:03:45
# Fork: 2 of 2
# Warmup Iteration   1: 1248.917 ms/op
# Warmup Iteration   2: 1194.460 ms/op
Iteration   1: 941.851 ms/op
Iteration   2: 908.455 ms/op
Iteration   3: 937.730 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  929.119 ±(99.9%) 47.685 ms/op [Average]
  (min, avg, max) = (906.498, 929.119, 943.976), stdev = 17.005
  CI (99.9%): [881.433, 976.804] (assumes normal distribution)


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

# Run progress: 69.57% complete, ETA 00:03:48
# Fork: 1 of 2
# Warmup Iteration   1: 4638.512 ms/op
# Warmup Iteration   2: 2307.380 ms/op
Iteration   1: 2333.341 ms/op
Iteration   2: 2296.372 ms/op
Iteration   3: 1876.049 ms/op

# Run progress: 71.74% complete, ETA 00:03:31
# Fork: 2 of 2
# Warmup Iteration   1: 4727.765 ms/op
# Warmup Iteration   2: 2443.346 ms/op
Iteration   1: 2031.668 ms/op
Iteration   2: 2232.612 ms/op
Iteration   3: 1854.209 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  2104.042 ±(99.9%) 595.828 ms/op [Average]
  (min, avg, max) = (1854.209, 2104.042, 2333.341), stdev = 212.478
  CI (99.9%): [1508.214, 2699.870] (assumes normal distribution)


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

# Run progress: 73.91% complete, ETA 00:03:15
# Fork: 1 of 2
# Warmup Iteration   1: Nov 27, 2026 7:50:41 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 27, 2026 7:50:41 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
5.837 ms/op
# Warmup Iteration   2: 3.655 ms/op
Iteration   1: 3.662 ms/op
Iteration   2: 3.603 ms/op
Iteration   3: 3.585 ms/op

# Run progress: 76.09% complete, ETA 00:02:57
# Fork: 2 of 2
# Warmup Iteration   1: Nov 27, 2026 7:50:52 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 27, 2026 7:50:52 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
6.359 ms/op
# Warmup Iteration   2: 3.651 ms/op
Iteration   1: 3.617 ms/op
Iteration   2: 3.606 ms/op
Iteration   3: 3.584 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  3.610 ±(99.9%) 0.080 ms/op [Average]
  (min, avg, max) = (3.584, 3.610, 3.662), stdev = 0.029
  CI (99.9%): [3.529, 3.690] (assumes normal distribution)


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

# Run progress: 78.26% complete, ETA 00:02:39
# Fork: 1 of 2
# Warmup Iteration   1: 26.446 ms/op
# Warmup Iteration   2: 18.486 ms/op
Iteration   1: 19.658 ms/op
Iteration   2: 19.605 ms/op
Iteration   3: 19.540 ms/op

# Run progress: 80.43% complete, ETA 00:02:22
# Fork: 2 of 2
# Warmup Iteration   1: 21.204 ms/op
# Warmup Iteration   2: 20.110 ms/op
Iteration   1: 19.822 ms/op
Iteration   2: 19.739 ms/op
Iteration   3: 19.664 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  19.671 ±(99.9%) 0.279 ms/op [Average]
  (min, avg, max) = (19.540, 19.671, 19.822), stdev = 0.099
  CI (99.9%): [19.393, 19.950] (assumes normal distribution)


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

# Run progress: 82.61% complete, ETA 00:02:05
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:01:49
# Fork: 2 of 2
# Warmup Iteration   1: 0.001 ms/op
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

# Run progress: 86.96% complete, ETA 00:01:33
# Fork: 1 of 2
# Warmup Iteration   1: 81.886 ms/op
# Warmup Iteration   2: 61.440 ms/op
Iteration   1: 59.278 ms/op
Iteration   2: 58.014 ms/op
Iteration   3: 57.560 ms/op

# Run progress: 89.13% complete, ETA 00:01:17
# Fork: 2 of 2
# Warmup Iteration   1: 83.434 ms/op
# Warmup Iteration   2: 61.531 ms/op
Iteration   1: 59.283 ms/op
Iteration   2: 58.414 ms/op
Iteration   3: 57.905 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  58.409 ±(99.9%) 2.042 ms/op [Average]
  (min, avg, max) = (57.560, 58.409, 59.283), stdev = 0.728
  CI (99.9%): [56.367, 60.451] (assumes normal distribution)


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

# Run progress: 91.30% complete, ETA 00:01:01
# Fork: 1 of 2
# Warmup Iteration   1: 14.731 ms/op
# Warmup Iteration   2: 10.082 ms/op
Iteration   1: 9.901 ms/op
Iteration   2: 9.799 ms/op
Iteration   3: 9.711 ms/op

# Run progress: 93.48% complete, ETA 00:00:45
# Fork: 2 of 2
# Warmup Iteration   1: 14.332 ms/op
# Warmup Iteration   2: 10.337 ms/op
Iteration   1: 10.550 ms/op
Iteration   2: 9.795 ms/op
Iteration   3: 9.739 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.916 ±(99.9%) 0.890 ms/op [Average]
  (min, avg, max) = (9.711, 9.916, 10.550), stdev = 0.317
  CI (99.9%): [9.026, 10.806] (assumes normal distribution)


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

# Run progress: 95.65% complete, ETA 00:00:30
# Fork: 1 of 2
# Warmup Iteration   1: 29.082 ms/op
# Warmup Iteration   2: 24.686 ms/op
Iteration   1: 24.716 ms/op
Iteration   2: 24.604 ms/op
Iteration   3: 24.599 ms/op

# Run progress: 97.83% complete, ETA 00:00:15
# Fork: 2 of 2
# Warmup Iteration   1: 29.038 ms/op
# Warmup Iteration   2: 24.738 ms/op
Iteration   1: 24.664 ms/op
Iteration   2: 24.485 ms/op
Iteration   3: 24.574 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  24.607 ±(99.9%) 0.222 ms/op [Average]
  (min, avg, max) = (24.485, 24.607, 24.716), stdev = 0.079
  CI (99.9%): [24.385, 24.829] (assumes normal distribution)


# Run complete. Total time: 00:11:32

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

Benchmark                                                                                            (model)  (nodes)  Mode  Cnt     Score     Error  Units
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6    19.538 ±   0.194  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6     1.089 ±   0.019  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6     7.883 ±   0.054  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6     8.120 ±   0.117  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6    13.525 ±   0.439  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6   477.610 ±  32.337  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   930.625 ±  55.964  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6   502.940 ±  18.064  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6  1107.792 ±  74.861  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6     0.099 ±   0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6     7.904 ±   0.787  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6     0.612 ±   0.131  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6     1.485 ±   0.018  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6    27.810 ±  21.970  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  7478.038 ± 153.588  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   929.119 ±  47.685  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  2104.042 ± 595.828  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     3.610 ±   0.080  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6    19.671 ±   0.279  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6    ≈ 10⁻³            ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6    58.409 ±   2.042  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     9.916 ±   0.890  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6    24.607 ±   0.222  ms/op

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
# Warmup Iteration   1: 111816.402 ms/op
Iteration   1: 103749.670 ms/op
Iteration   2: 104404.310 ms/op
Iteration   3: 104726.162 ms/op


Result "com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient":
  104293.381 ±(99.9%) 9078.216 ms/op [Average]
  (min, avg, max) = (103749.670, 104293.381, 104726.162), stdev = 497.608
  CI (99.9%): [95215.165, 113371.596] (assumes normal distribution)


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

# Run progress: 14.29% complete, ETA 00:42:30
# Fork: 1 of 1
# Warmup Iteration   1: 178910.950 ms/op
Iteration   1: 177519.492 ms/op
Iteration   2: 177931.213 ms/op
Iteration   3: 177662.974 ms/op


Result "com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset":
  177704.560 ±(99.9%) 3812.697 ms/op [Average]
  (min, avg, max) = (177519.492, 177704.560, 177931.213), stdev = 208.987
  CI (99.9%): [173891.863, 181517.257] (assumes normal distribution)


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

# Run progress: 28.57% complete, ETA 00:47:23
# Fork: 1 of 1
# Warmup Iteration   1: 21075.174 ms/op
Iteration   1: 15566.842 ms/op
Iteration   2: 15097.851 ms/op
Iteration   3: 15130.818 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  15265.170 ±(99.9%) 4775.744 ms/op [Average]
  (min, avg, max) = (15097.851, 15265.170, 15566.842), stdev = 261.775
  CI (99.9%): [10489.426, 20040.914] (assumes normal distribution)


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

# Run progress: 42.86% complete, ETA 00:26:47
# Fork: 1 of 1
# Warmup Iteration   1: 20680.190 ms/op
Iteration   1: 15890.414 ms/op
Iteration   2: 15793.073 ms/op
Iteration   3: 15708.319 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  15797.268 ±(99.9%) 1662.372 ms/op [Average]
  (min, avg, max) = (15708.319, 15797.268, 15890.414), stdev = 91.120
  CI (99.9%): [14134.897, 17459.640] (assumes normal distribution)


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

# Run progress: 57.14% complete, ETA 00:15:56
# Fork: 1 of 1
# Warmup Iteration   1: 23702.954 ms/op
Iteration   1: 19510.159 ms/op
Iteration   2: 19109.531 ms/op
Iteration   3: 19147.061 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable":
  19255.584 ±(99.9%) 4036.720 ms/op [Average]
  (min, avg, max) = (19109.531, 19255.584, 19510.159), stdev = 221.266
  CI (99.9%): [15218.864, 23292.304] (assumes normal distribution)


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

# Run progress: 71.43% complete, ETA 00:09:03
# Fork: 1 of 1
# Warmup Iteration   1: 31585.147 ms/op
Iteration   1: 26689.934 ms/op
Iteration   2: 26516.641 ms/op
Iteration   3: 26409.487 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid":
  26538.687 ±(99.9%) 2581.805 ms/op [Average]
  (min, avg, max) = (26409.487, 26538.687, 26689.934), stdev = 141.517
  CI (99.9%): [23956.883, 29120.492] (assumes normal distribution)


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

# Run progress: 85.71% complete, ETA 00:04:04
# Fork: 1 of 1
# Warmup Iteration   1: 38260.043 ms/op
Iteration   1: 35935.768 ms/op
Iteration   2: 35614.141 ms/op
Iteration   3: 35639.699 ms/op


Result "com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp":
  35729.869 ±(99.9%) 3261.450 ms/op [Average]
  (min, avg, max) = (35614.141, 35729.869, 35935.768), stdev = 178.771
  CI (99.9%): [32468.419, 38991.319] (assumes normal distribution)


# Run complete. Total time: 00:26:54

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
DynamicProcessBenchmark.separationControlTransient        N/A  avgt    3  104293.381 ± 9078.216  ms/op
MlTrainingDataBenchmark.processSurrogateDataset           N/A  avgt    3  177704.560 ± 3812.697  ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep        SRK  avgt    3   15265.170 ± 4775.744  ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep         PR  avgt    3   15797.268 ± 1662.372  ms/op
PropertyTableBenchmark.olgaThreePhaseTable                N/A  avgt    3   19255.584 ± 4036.720  ms/op
PropertyTableBenchmark.tpPropertyGrid                     N/A  avgt    3   26538.687 ± 2581.805  ms/op
TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp    N/A  avgt    3   35729.869 ± 3261.450  ms/op

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
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.551 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 4687 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5447778e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018746111, composition error=0.0030123554
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=4.7067410e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.695 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 521484 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 521.5 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.033 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.LongRunSmokeTest
olgaThreePhaseTable[small]                                     16322.0  (537 ms)
tpPropertyGrid[small]                                          103.077  (361 ms)
separationControlTransient[small]                              158.784  (2031 ms)
processSimulationSweep[SRK, small]                             380.828  (1242 ms)
processSimulationSweep[PR, small]                              382.559  (1354 ms)
processSurrogateDataset[small]                                 1419.23  (2905 ms)
twoFluidTransient[small]                                       688.187  (412 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.67 s -- in com.equinor.neqsim.benchmark.LongRunSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (2 ms)
tpFlashWellFluidSrk                                            83.6406  (20 ms)
tpFlashWellFluidPr                                             83.6541  (18 ms)
tpFlashWellFluidWithProperties                                 5445.37  (21 ms)
phAndPsFlashWellFluid                                          2459.22  (35 ms)
Nov 27, 2026 6:45:59 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 27, 2026 6:45:59 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00976303  (247 ms)
gasOilSurfaceTension[Simple Gradient Theory]                0.00976303  (88 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (199 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (38 ms)
saturationPointsWellFluid                                      1601.32  (159 ms)
singlePhaseGasPipelineSteadyState                              121.629  (849 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98718  (1466 ms)
levenbergMarquardtAntoine                                      1837.31  (9 ms)
levenbergMarquardtDoubleExponential                            5.57177  (9 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (13 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.885 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  09:07 min
[INFO] Finished at: 2026-11-27T06:46:02Z
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
$ mvn surefire:test -Dneqsim.version=3.30.0
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
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.328 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 3727 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5447778e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018746111, composition error=0.0030123554
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=4.7067410e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.732 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 64763 ms
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

feed 5489240.1, gas 264558.9 + 377858.7, oil 1995395.1 + 2850659.7, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.437 MSm3/d, KA27841 A 100.3 bara, pipeline outlet 78.9 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 64.78 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.057 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.LongRunSmokeTest
olgaThreePhaseTable[small]                                     16322.0  (549 ms)
tpPropertyGrid[small]                                          103.077  (425 ms)
separationControlTransient[small]                              158.826  (3616 ms)
processSimulationSweep[SRK, small]                             380.828  (1868 ms)
processSimulationSweep[PR, small]                              382.559  (1680 ms)
processSurrogateDataset[small]                                 1419.23  (3145 ms)
twoFluidTransient[small]                                       685.784  (422 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.56 s -- in com.equinor.neqsim.benchmark.LongRunSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (4 ms)
tpFlashWellFluidSrk                                            83.6406  (18 ms)
tpFlashWellFluidPr                                             83.6541  (19 ms)
tpFlashWellFluidWithProperties                                 5445.37  (22 ms)
phAndPsFlashWellFluid                                          2459.22  (29 ms)
Nov 27, 2026 7:41:23 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 27, 2026 7:41:23 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00976303  (178 ms)
gasOilSurfaceTension[Simple Gradient Theory]                0.00976303  (94 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (208 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (37 ms)
saturationPointsWellFluid                                      1601.32  (159 ms)
singlePhaseGasPipelineSteadyState                              121.599  (816 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98718  (1466 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (9 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (10 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.861 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:33 min
[INFO] Finished at: 2026-11-27T07:41:26Z
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

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| longrun.DynamicProcessBenchmark.separationControlTransient | 48341.2 | 104293 | +115.74% | Separate CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 54187.3 | 7478.04 | -86.20% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 6227.2 | 929.119 | -85.08% | Separate CIs |
| flash.TPflash_UMR.testFlash_UMR | 560.296 | 930.625 | +66.10% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000305835 | 0.000459746 | +50.32% | Overlapping CIs |
| longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp | 61360.8 | 35729.9 | -41.77% | Separate CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.579423 | 0.611585 | +5.55% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 28.6982 | 27.8097 | -3.10% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.70031 | 9.91572 | +2.22% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1088.83 | 1107.79 | +1.74% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread. Long-running `longrun` cases (30 s to 5 min per operation): one fork, one warmup operation and three measured operations, so their confidence intervals are wide.

```
