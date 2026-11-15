# NeqSim 3.28.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.27.0 |
| Current | 3.28.0 |
| Source commit | `81c97af9708bb9357ca73010d150d1e47a5e1769` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43662586415) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 16,
  "label": "B16-8d65e2abc344",
  "fingerprint": "8d65e2abc34477bc3de280af8d8c1ed1b19f0004d0ed2f70ac049ae3ab913439",
  "source_commit": "81c97af9708bb9357ca73010d150d1e47a5e1769",
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
OS name: "linux", version: "7.0.0-1019-azure", arch: "amd64", family: "unix"
Linux runnervmccnms 7.0.0-1019-azure #20-Ubuntu SMP PREEMPT Mon Oct 19 22:41:16 UTC 2026 x86_64 GNU/Linux
Architecture:                            x86_64
CPU op-mode(s):                          32-bit, 64-bit
Address sizes:                           48 bits physical, 48 bits virtual
Byte Order:                              Little Endian
CPU(s):                                  4
On-line CPU(s) list:                     0-3
Vendor ID:                               AuthenticAMD
Model name:                              AMD EPYC 9V74 80-Core Processor
CPU family:                              25
Model:                                   17
Thread(s) per core:                      2
Core(s) per socket:                      2
Socket(s):                               1
Stepping:                                1
BogoMIPS:                                5192.27
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid avx512f avx512dq rdseed adx smap avx512ifma clflushopt clwb avx512cd sha_ni avx512bw avx512vl xsaveopt xsavec xgetbv1 xsaves user_shstk avx512_bf16 clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload avx512vbmi umip avx512_vbmi2 gfni vaes vpclmulqdq avx512_vnni avx512_bitalg avx512_vpopcntdq rdpid fsrm
Virtualization:                          AMD-V
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               64 KiB (2 instances)
L1i cache:                               64 KiB (2 instances)
L2 cache:                                2 MiB (2 instances)
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
| baseline | 3.27.0 | passed |
| current | 3.28.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.27.0",
  "version": "3.27.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.27.0/neqsim-3.27.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.28.0",
  "version": "3.28.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.28.0/neqsim-3.28.0.jar",
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
[INFO] Total time:  9.149 s
[INFO] Finished at: 2026-11-15T01:20:23Z
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
[INFO] Total time:  16.344 s
[INFO] Finished at: 2026-11-15T01:20:41Z
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
# Warmup Iteration   1: 21.452 ms/op
# Warmup Iteration   2: 17.098 ms/op
Iteration   1: 16.853 ms/op
Iteration   2: 16.810 ms/op
Iteration   3: 16.525 ms/op

# Run progress: 2.17% complete, ETA 00:08:45
# Fork: 2 of 2
# Warmup Iteration   1: 21.109 ms/op
# Warmup Iteration   2: 17.150 ms/op
Iteration   1: 16.869 ms/op
Iteration   2: 16.624 ms/op
Iteration   3: 16.549 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  16.705 ±(99.9%) 0.440 ms/op [Average]
  (min, avg, max) = (16.525, 16.705, 16.869), stdev = 0.157
  CI (99.9%): [16.265, 17.145] (assumes normal distribution)


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

# Run progress: 4.35% complete, ETA 00:08:31
# Fork: 1 of 2
# Warmup Iteration   1: 2.300 ms/op
# Warmup Iteration   2: 1.302 ms/op
Iteration   1: 1.273 ms/op
Iteration   2: 1.275 ms/op
Iteration   3: 1.275 ms/op

# Run progress: 6.52% complete, ETA 00:08:20
# Fork: 2 of 2
# Warmup Iteration   1: 2.425 ms/op
# Warmup Iteration   2: 1.254 ms/op
Iteration   1: 1.269 ms/op
Iteration   2: 1.251 ms/op
Iteration   3: 1.271 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.269 ±(99.9%) 0.026 ms/op [Average]
  (min, avg, max) = (1.251, 1.269, 1.275), stdev = 0.009
  CI (99.9%): [1.243, 1.295] (assumes normal distribution)


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

# Run progress: 8.70% complete, ETA 00:08:08
# Fork: 1 of 2
# Warmup Iteration   1: 11.731 ms/op
# Warmup Iteration   2: 6.720 ms/op
Iteration   1: 6.595 ms/op
Iteration   2: 6.462 ms/op
Iteration   3: 6.447 ms/op

# Run progress: 10.87% complete, ETA 00:07:56
# Fork: 2 of 2
# Warmup Iteration   1: 9.640 ms/op
# Warmup Iteration   2: 6.854 ms/op
Iteration   1: 6.556 ms/op
Iteration   2: 6.461 ms/op
Iteration   3: 6.469 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.498 ±(99.9%) 0.172 ms/op [Average]
  (min, avg, max) = (6.447, 6.498, 6.595), stdev = 0.061
  CI (99.9%): [6.326, 6.670] (assumes normal distribution)


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

# Run progress: 13.04% complete, ETA 00:07:44
# Fork: 1 of 2
# Warmup Iteration   1: 11.021 ms/op
# Warmup Iteration   2: 6.956 ms/op
Iteration   1: 6.773 ms/op
Iteration   2: 6.771 ms/op
Iteration   3: 6.745 ms/op

# Run progress: 15.22% complete, ETA 00:07:33
# Fork: 2 of 2
# Warmup Iteration   1: 12.546 ms/op
# Warmup Iteration   2: 7.107 ms/op
Iteration   1: 6.878 ms/op
Iteration   2: 6.747 ms/op
Iteration   3: 6.774 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.781 ±(99.9%) 0.138 ms/op [Average]
  (min, avg, max) = (6.745, 6.781, 6.878), stdev = 0.049
  CI (99.9%): [6.643, 6.920] (assumes normal distribution)


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

# Run progress: 17.39% complete, ETA 00:07:21
# Fork: 1 of 2
# Warmup Iteration   1: 21.592 ms/op
# Warmup Iteration   2: 11.393 ms/op
Iteration   1: 10.996 ms/op
Iteration   2: 10.908 ms/op
Iteration   3: 10.834 ms/op

# Run progress: 19.57% complete, ETA 00:07:10
# Fork: 2 of 2
# Warmup Iteration   1: 16.621 ms/op
# Warmup Iteration   2: 11.313 ms/op
Iteration   1: 11.039 ms/op
Iteration   2: 10.935 ms/op
Iteration   3: 10.984 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.949 ±(99.9%) 0.205 ms/op [Average]
  (min, avg, max) = (10.834, 10.949, 11.039), stdev = 0.073
  CI (99.9%): [10.744, 11.154] (assumes normal distribution)


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

# Run progress: 21.74% complete, ETA 00:06:58
# Fork: 1 of 2
# Warmup Iteration   1: 1242.487 ms/op
# Warmup Iteration   2: 455.250 ms/op
Iteration   1: 374.749 ms/op
Iteration   2: 374.088 ms/op
Iteration   3: 373.680 ms/op

# Run progress: 23.91% complete, ETA 00:06:47
# Fork: 2 of 2
# Warmup Iteration   1: 1261.736 ms/op
# Warmup Iteration   2: 454.575 ms/op
Iteration   1: 373.051 ms/op
Iteration   2: 383.659 ms/op
Iteration   3: 367.036 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  374.377 ±(99.9%) 14.971 ms/op [Average]
  (min, avg, max) = (367.036, 374.377, 383.659), stdev = 5.339
  CI (99.9%): [359.406, 389.348] (assumes normal distribution)


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

# Run progress: 26.09% complete, ETA 00:06:35
# Fork: 1 of 2
# Warmup Iteration   1: 3568.121 ms/op
# Warmup Iteration   2: 2172.847 ms/op
Iteration   1: 1911.116 ms/op
Iteration   2: 1927.945 ms/op
Iteration   3: 1883.865 ms/op

# Run progress: 28.26% complete, ETA 00:06:39
# Fork: 2 of 2
# Warmup Iteration   1: 3959.420 ms/op
# Warmup Iteration   2: 2164.966 ms/op
Iteration   1: 1924.336 ms/op
Iteration   2: 1894.222 ms/op
Iteration   3: 1899.164 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  1906.775 ±(99.9%) 48.825 ms/op [Average]
  (min, avg, max) = (1883.865, 1906.775, 1927.945), stdev = 17.412
  CI (99.9%): [1857.950, 1955.600] (assumes normal distribution)


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

# Run progress: 30.43% complete, ETA 00:06:39
# Fork: 1 of 2
# Warmup Iteration   1: 773.168 ms/op
# Warmup Iteration   2: 432.683 ms/op
Iteration   1: 415.922 ms/op
Iteration   2: 413.177 ms/op
Iteration   3: 412.002 ms/op

# Run progress: 32.61% complete, ETA 00:06:24
# Fork: 2 of 2
# Warmup Iteration   1: 751.566 ms/op
# Warmup Iteration   2: 432.776 ms/op
Iteration   1: 419.451 ms/op
Iteration   2: 417.390 ms/op
Iteration   3: 415.011 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  415.492 ±(99.9%) 7.652 ms/op [Average]
  (min, avg, max) = (412.002, 415.492, 419.451), stdev = 2.729
  CI (99.9%): [407.841, 423.144] (assumes normal distribution)


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

# Run progress: 34.78% complete, ETA 00:06:08
# Fork: 1 of 2
# Warmup Iteration   1: 1423.756 ms/op
# Warmup Iteration   2: 885.237 ms/op
Iteration   1: 865.497 ms/op
Iteration   2: 861.603 ms/op
Iteration   3: 883.360 ms/op

# Run progress: 36.96% complete, ETA 00:05:58
# Fork: 2 of 2
# Warmup Iteration   1: 1385.971 ms/op
# Warmup Iteration   2: 917.826 ms/op
Iteration   1: 872.962 ms/op
Iteration   2: 878.175 ms/op
Iteration   3: 866.016 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  871.269 ±(99.9%) 23.498 ms/op [Average]
  (min, avg, max) = (861.603, 871.269, 883.360), stdev = 8.380
  CI (99.9%): [847.771, 894.766] (assumes normal distribution)


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

# Run progress: 39.13% complete, ETA 00:05:48
# Fork: 1 of 2
# Warmup Iteration   1: 0.104 ms/op
# Warmup Iteration   2: 0.079 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.078 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:32
# Fork: 2 of 2
# Warmup Iteration   1: 0.111 ms/op
# Warmup Iteration   2: 0.079 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.079 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.078, 0.079, 0.079), stdev = 0.001
  CI (99.9%): [0.078, 0.079] (assumes normal distribution)


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

# Run progress: 43.48% complete, ETA 00:05:17
# Fork: 1 of 2
# Warmup Iteration   1: 7.929 ms/op
# Warmup Iteration   2: 6.160 ms/op
Iteration   1: 6.168 ms/op
Iteration   2: 6.132 ms/op
Iteration   3: 6.117 ms/op

# Run progress: 45.65% complete, ETA 00:05:03
# Fork: 2 of 2
# Warmup Iteration   1: 7.777 ms/op
# Warmup Iteration   2: 6.148 ms/op
Iteration   1: 6.133 ms/op
Iteration   2: 6.137 ms/op
Iteration   3: 6.117 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.134 ±(99.9%) 0.052 ms/op [Average]
  (min, avg, max) = (6.117, 6.134, 6.168), stdev = 0.019
  CI (99.9%): [6.082, 6.186] (assumes normal distribution)


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

# Run progress: 47.83% complete, ETA 00:04:48
# Fork: 1 of 2
# Warmup Iteration   1: 0.635 ms/op
# Warmup Iteration   2: 0.457 ms/op
Iteration   1: 0.460 ms/op
Iteration   2: 0.467 ms/op
Iteration   3: 0.457 ms/op

# Run progress: 50.00% complete, ETA 00:04:35
# Fork: 2 of 2
# Warmup Iteration   1: 0.614 ms/op
# Warmup Iteration   2: 0.465 ms/op
Iteration   1: 0.457 ms/op
Iteration   2: 0.458 ms/op
Iteration   3: 0.456 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.459 ±(99.9%) 0.012 ms/op [Average]
  (min, avg, max) = (0.456, 0.459, 0.467), stdev = 0.004
  CI (99.9%): [0.447, 0.471] (assumes normal distribution)


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

# Run progress: 52.17% complete, ETA 00:04:21
# Fork: 1 of 2
# Warmup Iteration   1: 1.595 ms/op
# Warmup Iteration   2: 1.187 ms/op
Iteration   1: 1.183 ms/op
Iteration   2: 1.184 ms/op
Iteration   3: 1.183 ms/op

# Run progress: 54.35% complete, ETA 00:04:08
# Fork: 2 of 2
# Warmup Iteration   1: 1.636 ms/op
# Warmup Iteration   2: 1.187 ms/op
Iteration   1: 1.185 ms/op
Iteration   2: 1.184 ms/op
Iteration   3: 1.185 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.184 ±(99.9%) 0.003 ms/op [Average]
  (min, avg, max) = (1.183, 1.184, 1.185), stdev = 0.001
  CI (99.9%): [1.181, 1.187] (assumes normal distribution)


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

# Run progress: 56.52% complete, ETA 00:03:55
# Fork: 1 of 2
# Warmup Iteration   1: 95.348 ms/op
# Warmup Iteration   2: 24.786 ms/op
Iteration   1: 19.814 ms/op
Iteration   2: 17.872 ms/op
Iteration   3: 16.950 ms/op

# Run progress: 58.70% complete, ETA 00:03:42
# Fork: 2 of 2
# Warmup Iteration   1: 96.793 ms/op
# Warmup Iteration   2: 26.839 ms/op
Iteration   1: 32.309 ms/op
Iteration   2: 22.756 ms/op
Iteration   3: 18.423 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  21.354 ±(99.9%) 16.083 ms/op [Average]
  (min, avg, max) = (16.950, 21.354, 32.309), stdev = 5.735
  CI (99.9%): [5.271, 37.437] (assumes normal distribution)


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
# Warmup Iteration   1: 50768.841 ms/op
# Warmup Iteration   2: 47768.543 ms/op
Iteration   1: 47336.618 ms/op
Iteration   2: 47348.455 ms/op
Iteration   3: 47263.573 ms/op

# Run progress: 63.04% complete, ETA 00:05:32
# Fork: 2 of 2
# Warmup Iteration   1: 50359.775 ms/op
# Warmup Iteration   2: 47887.064 ms/op
Iteration   1: 47492.362 ms/op
Iteration   2: 47663.222 ms/op
Iteration   3: 47653.607 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  47459.639 ±(99.9%) 479.308 ms/op [Average]
  (min, avg, max) = (47263.573, 47459.639, 47663.222), stdev = 170.926
  CI (99.9%): [46980.331, 47938.947] (assumes normal distribution)


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

# Run progress: 65.22% complete, ETA 00:07:12
# Fork: 1 of 2
# Warmup Iteration   1: 6987.842 ms/op
# Warmup Iteration   2: 2572.984 ms/op
Iteration   1: 4175.653 ms/op
Iteration   2: 2726.330 ms/op
Iteration   3: 3682.539 ms/op

# Run progress: 67.39% complete, ETA 00:08:41
# Fork: 2 of 2
# Warmup Iteration   1: 6973.475 ms/op
# Warmup Iteration   2: 2651.939 ms/op
Iteration   1: 4117.293 ms/op
Iteration   2: 2717.553 ms/op
Iteration   3: 3705.855 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  3520.871 ±(99.9%) 1826.569 ms/op [Average]
  (min, avg, max) = (2717.553, 3520.871, 4175.653), stdev = 651.372
  CI (99.9%): [1694.301, 5347.440] (assumes normal distribution)


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

# Run progress: 69.57% complete, ETA 00:09:49
# Fork: 1 of 2
# Warmup Iteration   1: 7057.717 ms/op
# Warmup Iteration   2: 5253.267 ms/op
Iteration   1: 4892.376 ms/op
Iteration   2: 4833.232 ms/op
Iteration   3: 4855.361 ms/op

# Run progress: 71.74% complete, ETA 00:09:01
# Fork: 2 of 2
# Warmup Iteration   1: 7043.235 ms/op
# Warmup Iteration   2: 5116.121 ms/op
Iteration   1: 5018.302 ms/op
Iteration   2: 4958.357 ms/op
Iteration   3: 4813.674 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  4895.217 ±(99.9%) 221.600 ms/op [Average]
  (min, avg, max) = (4813.674, 4895.217, 5018.302), stdev = 79.025
  CI (99.9%): [4673.617, 5116.817] (assumes normal distribution)


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

# Run progress: 73.91% complete, ETA 00:08:14
# Fork: 1 of 2
# Warmup Iteration   1: Nov 15, 2026 1:51:01 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 15, 2026 1:51:01 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
4.400 ms/op
# Warmup Iteration   2: 2.932 ms/op
Iteration   1: 2.872 ms/op
Iteration   2: 2.938 ms/op
Iteration   3: 2.867 ms/op

# Run progress: 76.09% complete, ETA 00:07:23
# Fork: 2 of 2
# Warmup Iteration   1: Nov 15, 2026 1:51:12 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 15, 2026 1:51:12 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
4.162 ms/op
# Warmup Iteration   2: 2.952 ms/op
Iteration   1: 2.883 ms/op
Iteration   2: 2.873 ms/op
Iteration   3: 2.868 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  2.883 ±(99.9%) 0.076 ms/op [Average]
  (min, avg, max) = (2.867, 2.883, 2.938), stdev = 0.027
  CI (99.9%): [2.808, 2.959] (assumes normal distribution)


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

# Run progress: 78.26% complete, ETA 00:06:35
# Fork: 1 of 2
# Warmup Iteration   1: 18.574 ms/op
# Warmup Iteration   2: 14.850 ms/op
Iteration   1: 14.928 ms/op
Iteration   2: 15.045 ms/op
Iteration   3: 14.777 ms/op

# Run progress: 80.43% complete, ETA 00:05:48
# Fork: 2 of 2
# Warmup Iteration   1: 17.339 ms/op
# Warmup Iteration   2: 14.955 ms/op
Iteration   1: 14.932 ms/op
Iteration   2: 14.709 ms/op
Iteration   3: 14.660 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  14.842 ±(99.9%) 0.419 ms/op [Average]
  (min, avg, max) = (14.660, 14.842, 15.045), stdev = 0.149
  CI (99.9%): [14.423, 15.261] (assumes normal distribution)


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

# Run progress: 82.61% complete, ETA 00:05:04
# Fork: 1 of 2
# Warmup Iteration   1: 0.001 ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:04:21
# Fork: 2 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op


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

# Run progress: 86.96% complete, ETA 00:03:40
# Fork: 1 of 2
# Warmup Iteration   1: 61.738 ms/op
# Warmup Iteration   2: 48.938 ms/op
Iteration   1: 47.647 ms/op
Iteration   2: 46.801 ms/op
Iteration   3: 46.850 ms/op

# Run progress: 89.13% complete, ETA 00:03:00
# Fork: 2 of 2
# Warmup Iteration   1: 60.237 ms/op
# Warmup Iteration   2: 48.337 ms/op
Iteration   1: 47.002 ms/op
Iteration   2: 46.630 ms/op
Iteration   3: 46.721 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  46.942 ±(99.9%) 1.031 ms/op [Average]
  (min, avg, max) = (46.630, 46.942, 47.647), stdev = 0.368
  CI (99.9%): [45.911, 47.973] (assumes normal distribution)


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

# Run progress: 91.30% complete, ETA 00:02:21
# Fork: 1 of 2
# Warmup Iteration   1: 10.404 ms/op
# Warmup Iteration   2: 8.240 ms/op
Iteration   1: 8.147 ms/op
Iteration   2: 7.964 ms/op
Iteration   3: 8.109 ms/op

# Run progress: 93.48% complete, ETA 00:01:44
# Fork: 2 of 2
# Warmup Iteration   1: 10.530 ms/op
# Warmup Iteration   2: 8.225 ms/op
Iteration   1: 8.126 ms/op
Iteration   2: 8.127 ms/op
Iteration   3: 7.945 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  8.070 ±(99.9%) 0.253 ms/op [Average]
  (min, avg, max) = (7.945, 8.070, 8.147), stdev = 0.090
  CI (99.9%): [7.816, 8.323] (assumes normal distribution)


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

# Run progress: 95.65% complete, ETA 00:01:08
# Fork: 1 of 2
# Warmup Iteration   1: 22.633 ms/op
# Warmup Iteration   2: 19.833 ms/op
Iteration   1: 19.769 ms/op
Iteration   2: 19.834 ms/op
Iteration   3: 19.785 ms/op

# Run progress: 97.83% complete, ETA 00:00:33
# Fork: 2 of 2
# Warmup Iteration   1: 22.165 ms/op
# Warmup Iteration   2: 19.810 ms/op
Iteration   1: 19.747 ms/op
Iteration   2: 19.780 ms/op
Iteration   3: 19.738 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  19.775 ±(99.9%) 0.095 ms/op [Average]
  (min, avg, max) = (19.738, 19.775, 19.834), stdev = 0.034
  CI (99.9%): [19.681, 19.870] (assumes normal distribution)


# Run complete. Total time: 00:25:35

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     16.705 ±    0.440  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.269 ±    0.026  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.498 ±    0.172  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.781 ±    0.138  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.949 ±    0.205  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    374.377 ±   14.971  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   1906.775 ±   48.825  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    415.492 ±    7.652  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    871.269 ±   23.498  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.079 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.134 ±    0.052  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.459 ±    0.012  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.184 ±    0.003  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     21.354 ±   16.083  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  47459.639 ±  479.308  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   3520.871 ± 1826.569  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   4895.217 ±  221.600  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6      2.883 ±    0.076  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     14.842 ±    0.419  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     46.942 ±    1.031  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      8.070 ±    0.253  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     19.775 ±    0.095  ms/op

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
# Warmup Iteration   1: 47209.153 ms/op
Iteration   1: 44506.515 ms/op
Iteration   2: 44366.278 ms/op
Iteration   3: 44204.095 ms/op


Result "com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient":
  44358.963 ±(99.9%) 2761.051 ms/op [Average]
  (min, avg, max) = (44204.095, 44358.963, 44506.515), stdev = 151.343
  CI (99.9%): [41597.912, 47120.014] (assumes normal distribution)


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

# Run progress: 14.29% complete, ETA 00:18:03
# Fork: 1 of 1
# Warmup Iteration   1: 228174.168 ms/op
Iteration   1: 222137.582 ms/op
Iteration   2: 222231.573 ms/op
Iteration   3: 222177.387 ms/op


Result "com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset":
  222182.181 ±(99.9%) 860.719 ms/op [Average]
  (min, avg, max) = (222137.582, 222182.181, 222231.573), stdev = 47.179
  CI (99.9%): [221321.462, 223042.900] (assumes normal distribution)


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

# Run progress: 28.57% complete, ETA 00:44:48
# Fork: 1 of 1
# Warmup Iteration   1: 23484.859 ms/op
Iteration   1: 19692.335 ms/op
Iteration   2: 19462.944 ms/op
Iteration   3: 19313.868 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  19489.716 ±(99.9%) 3478.143 ms/op [Average]
  (min, avg, max) = (19313.868, 19489.716, 19692.335), stdev = 190.649
  CI (99.9%): [16011.573, 22967.859] (assumes normal distribution)


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

# Run progress: 42.86% complete, ETA 00:25:45
# Fork: 1 of 1
# Warmup Iteration   1: 23876.229 ms/op
Iteration   1: 19958.935 ms/op
Iteration   2: 19878.205 ms/op
Iteration   3: 19562.905 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  19800.015 ±(99.9%) 3817.918 ms/op [Average]
  (min, avg, max) = (19562.905, 19800.015, 19958.935), stdev = 209.273
  CI (99.9%): [15982.096, 23617.933] (assumes normal distribution)


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

# Run progress: 57.14% complete, ETA 00:15:32
# Fork: 1 of 1
# Warmup Iteration   1: 21669.678 ms/op
Iteration   1: 18314.019 ms/op
Iteration   2: 17895.389 ms/op
Iteration   3: 17897.453 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable":
  18035.620 ±(99.9%) 4398.606 ms/op [Average]
  (min, avg, max) = (17895.389, 18035.620, 18314.019), stdev = 241.102
  CI (99.9%): [13637.015, 22434.226] (assumes normal distribution)


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

# Run progress: 71.43% complete, ETA 00:08:47
# Fork: 1 of 1
# Warmup Iteration   1: 26106.440 ms/op
Iteration   1: 22606.659 ms/op
Iteration   2: 22540.846 ms/op
Iteration   3: 22380.857 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid":
  22509.454 ±(99.9%) 2118.606 ms/op [Average]
  (min, avg, max) = (22380.857, 22509.454, 22606.659), stdev = 116.128
  CI (99.9%): [20390.849, 24628.060] (assumes normal distribution)


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

# Run progress: 85.71% complete, ETA 00:03:55
# Fork: 1 of 1
# Warmup Iteration   1: 55911.094 ms/op
Iteration   1: 53817.722 ms/op
Iteration   2: 53647.634 ms/op
Iteration   3: 53576.310 ms/op


Result "com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp":
  53680.555 ±(99.9%) 2262.716 ms/op [Average]
  (min, avg, max) = (53576.310, 53680.555, 53817.722), stdev = 124.027
  CI (99.9%): [51417.839, 55943.271] (assumes normal distribution)


# Run complete. Total time: 00:27:10

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
DynamicProcessBenchmark.separationControlTransient        N/A  avgt    3   44358.963 ± 2761.051  ms/op
MlTrainingDataBenchmark.processSurrogateDataset           N/A  avgt    3  222182.181 ±  860.719  ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep        SRK  avgt    3   19489.716 ± 3478.143  ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep         PR  avgt    3   19800.015 ± 3817.918  ms/op
PropertyTableBenchmark.olgaThreePhaseTable                N/A  avgt    3   18035.620 ± 4398.606  ms/op
PropertyTableBenchmark.tpPropertyGrid                     N/A  avgt    3   22509.454 ± 2118.606  ms/op
TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp    N/A  avgt    3   53680.555 ± 2262.716  ms/op

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
[INFO] Total time:  3.474 s
[INFO] Finished at: 2026-11-15T02:20:30Z
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
[INFO] Total time:  8.596 s
[INFO] Finished at: 2026-11-15T02:20:40Z
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
# Warmup Iteration   1: 21.783 ms/op
# Warmup Iteration   2: 16.902 ms/op
Iteration   1: 16.703 ms/op
Iteration   2: 16.525 ms/op
Iteration   3: 16.406 ms/op

# Run progress: 2.17% complete, ETA 00:08:44
# Fork: 2 of 2
# Warmup Iteration   1: 20.527 ms/op
# Warmup Iteration   2: 17.178 ms/op
Iteration   1: 16.925 ms/op
Iteration   2: 16.481 ms/op
Iteration   3: 16.402 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  16.574 ±(99.9%) 0.573 ms/op [Average]
  (min, avg, max) = (16.402, 16.574, 16.925), stdev = 0.204
  CI (99.9%): [16.001, 17.146] (assumes normal distribution)


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

# Run progress: 4.35% complete, ETA 00:08:32
# Fork: 1 of 2
# Warmup Iteration   1: 2.200 ms/op
# Warmup Iteration   2: 1.269 ms/op
Iteration   1: 1.261 ms/op
Iteration   2: 1.298 ms/op
Iteration   3: 1.265 ms/op

# Run progress: 6.52% complete, ETA 00:08:20
# Fork: 2 of 2
# Warmup Iteration   1: 2.474 ms/op
# Warmup Iteration   2: 1.251 ms/op
Iteration   1: 1.252 ms/op
Iteration   2: 1.250 ms/op
Iteration   3: 1.250 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.263 ±(99.9%) 0.052 ms/op [Average]
  (min, avg, max) = (1.250, 1.263, 1.298), stdev = 0.018
  CI (99.9%): [1.211, 1.314] (assumes normal distribution)


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

# Run progress: 8.70% complete, ETA 00:08:07
# Fork: 1 of 2
# Warmup Iteration   1: 10.900 ms/op
# Warmup Iteration   2: 6.729 ms/op
Iteration   1: 6.489 ms/op
Iteration   2: 6.480 ms/op
Iteration   3: 6.453 ms/op

# Run progress: 10.87% complete, ETA 00:07:56
# Fork: 2 of 2
# Warmup Iteration   1: 10.278 ms/op
# Warmup Iteration   2: 6.816 ms/op
Iteration   1: 6.606 ms/op
Iteration   2: 6.516 ms/op
Iteration   3: 6.460 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.501 ±(99.9%) 0.157 ms/op [Average]
  (min, avg, max) = (6.453, 6.501, 6.606), stdev = 0.056
  CI (99.9%): [6.344, 6.658] (assumes normal distribution)


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

# Run progress: 13.04% complete, ETA 00:07:44
# Fork: 1 of 2
# Warmup Iteration   1: 12.514 ms/op
# Warmup Iteration   2: 7.250 ms/op
Iteration   1: 6.963 ms/op
Iteration   2: 6.731 ms/op
Iteration   3: 6.691 ms/op

# Run progress: 15.22% complete, ETA 00:07:33
# Fork: 2 of 2
# Warmup Iteration   1: 10.562 ms/op
# Warmup Iteration   2: 6.846 ms/op
Iteration   1: 6.874 ms/op
Iteration   2: 6.680 ms/op
Iteration   3: 6.727 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.778 ±(99.9%) 0.321 ms/op [Average]
  (min, avg, max) = (6.680, 6.778, 6.963), stdev = 0.114
  CI (99.9%): [6.457, 7.098] (assumes normal distribution)


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

# Run progress: 17.39% complete, ETA 00:07:21
# Fork: 1 of 2
# Warmup Iteration   1: 22.381 ms/op
# Warmup Iteration   2: 11.361 ms/op
Iteration   1: 10.976 ms/op
Iteration   2: 11.021 ms/op
Iteration   3: 10.835 ms/op

# Run progress: 19.57% complete, ETA 00:07:10
# Fork: 2 of 2
# Warmup Iteration   1: 16.292 ms/op
# Warmup Iteration   2: 11.463 ms/op
Iteration   1: 11.118 ms/op
Iteration   2: 11.007 ms/op
Iteration   3: 10.970 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.988 ±(99.9%) 0.258 ms/op [Average]
  (min, avg, max) = (10.835, 10.988, 11.118), stdev = 0.092
  CI (99.9%): [10.730, 11.246] (assumes normal distribution)


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

# Run progress: 21.74% complete, ETA 00:06:58
# Fork: 1 of 2
# Warmup Iteration   1: 1258.313 ms/op
# Warmup Iteration   2: 510.085 ms/op
Iteration   1: 393.007 ms/op
Iteration   2: 371.407 ms/op
Iteration   3: 373.796 ms/op

# Run progress: 23.91% complete, ETA 00:06:47
# Fork: 2 of 2
# Warmup Iteration   1: 1239.679 ms/op
# Warmup Iteration   2: 450.969 ms/op
Iteration   1: 373.738 ms/op
Iteration   2: 382.297 ms/op
Iteration   3: 368.139 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  377.064 ±(99.9%) 25.546 ms/op [Average]
  (min, avg, max) = (368.139, 377.064, 393.007), stdev = 9.110
  CI (99.9%): [351.518, 402.610] (assumes normal distribution)


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

# Run progress: 26.09% complete, ETA 00:06:35
# Fork: 1 of 2
# Warmup Iteration   1: 4129.111 ms/op
# Warmup Iteration   2: 2132.408 ms/op
Iteration   1: 1930.547 ms/op
Iteration   2: 1925.376 ms/op
Iteration   3: 1903.274 ms/op

# Run progress: 28.26% complete, ETA 00:06:40
# Fork: 2 of 2
# Warmup Iteration   1: 3976.395 ms/op
# Warmup Iteration   2: 2141.984 ms/op
Iteration   1: 1955.631 ms/op
Iteration   2: 2007.494 ms/op
Iteration   3: 1929.102 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  1941.904 ±(99.9%) 101.485 ms/op [Average]
  (min, avg, max) = (1903.274, 1941.904, 2007.494), stdev = 36.190
  CI (99.9%): [1840.419, 2043.389] (assumes normal distribution)


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
# Warmup Iteration   1: 801.849 ms/op
# Warmup Iteration   2: 434.952 ms/op
Iteration   1: 424.406 ms/op
Iteration   2: 418.868 ms/op
Iteration   3: 414.624 ms/op

# Run progress: 32.61% complete, ETA 00:06:22
# Fork: 2 of 2
# Warmup Iteration   1: 794.890 ms/op
# Warmup Iteration   2: 432.237 ms/op
Iteration   1: 416.322 ms/op
Iteration   2: 412.252 ms/op
Iteration   3: 414.349 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  416.804 ±(99.9%) 12.144 ms/op [Average]
  (min, avg, max) = (412.252, 416.804, 424.406), stdev = 4.331
  CI (99.9%): [404.659, 428.948] (assumes normal distribution)


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

# Run progress: 34.78% complete, ETA 00:06:07
# Fork: 1 of 2
# Warmup Iteration   1: 1450.849 ms/op
# Warmup Iteration   2: 903.434 ms/op
Iteration   1: 874.710 ms/op
Iteration   2: 866.340 ms/op
Iteration   3: 883.743 ms/op

# Run progress: 36.96% complete, ETA 00:05:57
# Fork: 2 of 2
# Warmup Iteration   1: 1455.815 ms/op
# Warmup Iteration   2: 894.240 ms/op
Iteration   1: 875.084 ms/op
Iteration   2: 879.933 ms/op
Iteration   3: 868.508 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  874.720 ±(99.9%) 18.496 ms/op [Average]
  (min, avg, max) = (866.340, 874.720, 883.743), stdev = 6.596
  CI (99.9%): [856.223, 893.216] (assumes normal distribution)


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

# Run progress: 39.13% complete, ETA 00:05:47
# Fork: 1 of 2
# Warmup Iteration   1: 0.114 ms/op
# Warmup Iteration   2: 0.080 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:31
# Fork: 2 of 2
# Warmup Iteration   1: 0.111 ms/op
# Warmup Iteration   2: 0.080 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.079 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.079, 0.079, 0.079), stdev = 0.001
  CI (99.9%): [0.079, 0.080] (assumes normal distribution)


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
# Warmup Iteration   1: 7.979 ms/op
# Warmup Iteration   2: 6.226 ms/op
Iteration   1: 6.147 ms/op
Iteration   2: 6.139 ms/op
Iteration   3: 6.139 ms/op

# Run progress: 45.65% complete, ETA 00:05:02
# Fork: 2 of 2
# Warmup Iteration   1: 7.924 ms/op
# Warmup Iteration   2: 6.221 ms/op
Iteration   1: 6.156 ms/op
Iteration   2: 6.127 ms/op
Iteration   3: 6.131 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.140 ±(99.9%) 0.030 ms/op [Average]
  (min, avg, max) = (6.127, 6.140, 6.156), stdev = 0.011
  CI (99.9%): [6.110, 6.170] (assumes normal distribution)


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

# Run progress: 47.83% complete, ETA 00:04:48
# Fork: 1 of 2
# Warmup Iteration   1: 0.623 ms/op
# Warmup Iteration   2: 0.458 ms/op
Iteration   1: 0.458 ms/op
Iteration   2: 0.458 ms/op
Iteration   3: 0.466 ms/op

# Run progress: 50.00% complete, ETA 00:04:34
# Fork: 2 of 2
# Warmup Iteration   1: 0.623 ms/op
# Warmup Iteration   2: 0.459 ms/op
Iteration   1: 0.459 ms/op
Iteration   2: 0.460 ms/op
Iteration   3: 0.459 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.460 ±(99.9%) 0.008 ms/op [Average]
  (min, avg, max) = (0.458, 0.460, 0.466), stdev = 0.003
  CI (99.9%): [0.452, 0.468] (assumes normal distribution)


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
# Warmup Iteration   1: 1.633 ms/op
# Warmup Iteration   2: 1.214 ms/op
Iteration   1: 1.208 ms/op
Iteration   2: 1.207 ms/op
Iteration   3: 1.203 ms/op

# Run progress: 54.35% complete, ETA 00:04:07
# Fork: 2 of 2
# Warmup Iteration   1: 1.586 ms/op
# Warmup Iteration   2: 1.194 ms/op
Iteration   1: 1.186 ms/op
Iteration   2: 1.183 ms/op
Iteration   3: 1.182 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.195 ±(99.9%) 0.034 ms/op [Average]
  (min, avg, max) = (1.182, 1.195, 1.208), stdev = 0.012
  CI (99.9%): [1.160, 1.229] (assumes normal distribution)


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
# Warmup Iteration   1: 101.500 ms/op
# Warmup Iteration   2: 37.952 ms/op
Iteration   1: 32.045 ms/op
Iteration   2: 19.483 ms/op
Iteration   3: 17.775 ms/op

# Run progress: 58.70% complete, ETA 00:03:41
# Fork: 2 of 2
# Warmup Iteration   1: 80.050 ms/op
# Warmup Iteration   2: 25.749 ms/op
Iteration   1: 21.088 ms/op
Iteration   2: 18.208 ms/op
Iteration   3: 17.229 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  20.971 ±(99.9%) 15.699 ms/op [Average]
  (min, avg, max) = (17.229, 20.971, 32.045), stdev = 5.598
  CI (99.9%): [5.272, 36.670] (assumes normal distribution)


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
# Warmup Iteration   1: 51155.083 ms/op
# Warmup Iteration   2: 48015.489 ms/op
Iteration   1: 47781.682 ms/op
Iteration   2: 47600.381 ms/op
Iteration   3: 47774.036 ms/op

# Run progress: 63.04% complete, ETA 00:05:33
# Fork: 2 of 2
# Warmup Iteration   1: 50656.267 ms/op
# Warmup Iteration   2: 47500.035 ms/op
Iteration   1: 47324.944 ms/op
Iteration   2: 47402.359 ms/op
Iteration   3: 47367.043 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  47541.741 ±(99.9%) 577.308 ms/op [Average]
  (min, avg, max) = (47324.944, 47541.741, 47781.682), stdev = 205.874
  CI (99.9%): [46964.433, 48119.049] (assumes normal distribution)


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

# Run progress: 65.22% complete, ETA 00:07:12
# Fork: 1 of 2
# Warmup Iteration   1: 6924.723 ms/op
# Warmup Iteration   2: 2570.058 ms/op
Iteration   1: 4132.037 ms/op
Iteration   2: 2732.920 ms/op
Iteration   3: 3795.529 ms/op

# Run progress: 67.39% complete, ETA 00:08:42
# Fork: 2 of 2
# Warmup Iteration   1: 6940.797 ms/op
# Warmup Iteration   2: 2591.263 ms/op
Iteration   1: 4138.060 ms/op
Iteration   2: 2831.753 ms/op
Iteration   3: 3666.561 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  3549.477 ±(99.9%) 1747.595 ms/op [Average]
  (min, avg, max) = (2732.920, 3549.477, 4138.060), stdev = 623.209
  CI (99.9%): [1801.882, 5297.071] (assumes normal distribution)


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

# Run progress: 69.57% complete, ETA 00:09:49
# Fork: 1 of 2
# Warmup Iteration   1: 7867.747 ms/op
# Warmup Iteration   2: 5429.506 ms/op
Iteration   1: 5198.865 ms/op
Iteration   2: 5186.131 ms/op
Iteration   3: 5128.678 ms/op

# Run progress: 71.74% complete, ETA 00:09:02
# Fork: 2 of 2
# Warmup Iteration   1: 7323.789 ms/op
# Warmup Iteration   2: 5189.765 ms/op
Iteration   1: 4983.539 ms/op
Iteration   2: 5065.545 ms/op
Iteration   3: 4964.105 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  5087.810 ±(99.9%) 281.375 ms/op [Average]
  (min, avg, max) = (4964.105, 5087.810, 5198.865), stdev = 100.341
  CI (99.9%): [4806.435, 5369.186] (assumes normal distribution)


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

# Run progress: 73.91% complete, ETA 00:08:15
# Fork: 1 of 2
# Warmup Iteration   1: Nov 15, 2026 2:51:19 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 15, 2026 2:51:19 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
4.294 ms/op
# Warmup Iteration   2: 2.921 ms/op
Iteration   1: 2.909 ms/op
Iteration   2: 2.886 ms/op
Iteration   3: 2.867 ms/op

# Run progress: 76.09% complete, ETA 00:07:25
# Fork: 2 of 2
# Warmup Iteration   1: Nov 15, 2026 2:51:30 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 15, 2026 2:51:30 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
4.134 ms/op
# Warmup Iteration   2: 2.931 ms/op
Iteration   1: 2.883 ms/op
Iteration   2: 2.883 ms/op
Iteration   3: 2.869 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  2.883 ±(99.9%) 0.042 ms/op [Average]
  (min, avg, max) = (2.867, 2.883, 2.909), stdev = 0.015
  CI (99.9%): [2.841, 2.925] (assumes normal distribution)


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

# Run progress: 78.26% complete, ETA 00:06:36
# Fork: 1 of 2
# Warmup Iteration   1: 17.456 ms/op
# Warmup Iteration   2: 15.134 ms/op
Iteration   1: 15.242 ms/op
Iteration   2: 14.934 ms/op
Iteration   3: 14.927 ms/op

# Run progress: 80.43% complete, ETA 00:05:49
# Fork: 2 of 2
# Warmup Iteration   1: 16.824 ms/op
# Warmup Iteration   2: 15.072 ms/op
Iteration   1: 15.153 ms/op
Iteration   2: 14.838 ms/op
Iteration   3: 14.872 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  14.994 ±(99.9%) 0.459 ms/op [Average]
  (min, avg, max) = (14.838, 14.994, 15.242), stdev = 0.164
  CI (99.9%): [14.535, 15.454] (assumes normal distribution)


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

# Run progress: 82.61% complete, ETA 00:05:05
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:04:22
# Fork: 2 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op


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

# Run progress: 86.96% complete, ETA 00:03:40
# Fork: 1 of 2
# Warmup Iteration   1: 59.468 ms/op
# Warmup Iteration   2: 48.869 ms/op
Iteration   1: 47.369 ms/op
Iteration   2: 46.710 ms/op
Iteration   3: 46.750 ms/op

# Run progress: 89.13% complete, ETA 00:03:00
# Fork: 2 of 2
# Warmup Iteration   1: 60.665 ms/op
# Warmup Iteration   2: 49.103 ms/op
Iteration   1: 47.468 ms/op
Iteration   2: 47.203 ms/op
Iteration   3: 46.712 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  47.035 ±(99.9%) 0.986 ms/op [Average]
  (min, avg, max) = (46.710, 47.035, 47.468), stdev = 0.352
  CI (99.9%): [46.049, 48.022] (assumes normal distribution)


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

# Run progress: 91.30% complete, ETA 00:02:22
# Fork: 1 of 2
# Warmup Iteration   1: 10.434 ms/op
# Warmup Iteration   2: 8.319 ms/op
Iteration   1: 8.183 ms/op
Iteration   2: 8.012 ms/op
Iteration   3: 7.999 ms/op

# Run progress: 93.48% complete, ETA 00:01:45
# Fork: 2 of 2
# Warmup Iteration   1: 10.670 ms/op
# Warmup Iteration   2: 8.225 ms/op
Iteration   1: 8.061 ms/op
Iteration   2: 7.909 ms/op
Iteration   3: 8.002 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  8.028 ±(99.9%) 0.254 ms/op [Average]
  (min, avg, max) = (7.909, 8.028, 8.183), stdev = 0.091
  CI (99.9%): [7.774, 8.282] (assumes normal distribution)


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

# Run progress: 95.65% complete, ETA 00:01:08
# Fork: 1 of 2
# Warmup Iteration   1: 22.593 ms/op
# Warmup Iteration   2: 20.124 ms/op
Iteration   1: 19.863 ms/op
Iteration   2: 19.854 ms/op
Iteration   3: 19.812 ms/op

# Run progress: 97.83% complete, ETA 00:00:33
# Fork: 2 of 2
# Warmup Iteration   1: 22.665 ms/op
# Warmup Iteration   2: 19.583 ms/op
Iteration   1: 19.549 ms/op
Iteration   2: 19.589 ms/op
Iteration   3: 19.566 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  19.705 ±(99.9%) 0.427 ms/op [Average]
  (min, avg, max) = (19.549, 19.705, 19.863), stdev = 0.152
  CI (99.9%): [19.278, 20.133] (assumes normal distribution)


# Run complete. Total time: 00:25:40

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     16.574 ±    0.573  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.263 ±    0.052  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.501 ±    0.157  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.778 ±    0.321  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.988 ±    0.258  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    377.064 ±   25.546  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   1941.904 ±  101.485  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    416.804 ±   12.144  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    874.720 ±   18.496  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.079 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.140 ±    0.030  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.460 ±    0.008  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.195 ±    0.034  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     20.971 ±   15.699  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  47541.741 ±  577.308  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   3549.477 ± 1747.595  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   5087.810 ±  281.375  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6      2.883 ±    0.042  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     14.994 ±    0.459  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     47.035 ±    0.986  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      8.028 ±    0.254  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     19.705 ±    0.427  ms/op

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
# Warmup Iteration   1: 48347.316 ms/op
Iteration   1: 45721.056 ms/op
Iteration   2: 45529.585 ms/op
Iteration   3: 45724.456 ms/op


Result "com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient":
  45658.366 ±(99.9%) 2034.907 ms/op [Average]
  (min, avg, max) = (45529.585, 45658.366, 45724.456), stdev = 111.540
  CI (99.9%): [43623.459, 47693.273] (assumes normal distribution)


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

# Run progress: 14.29% complete, ETA 00:18:33
# Fork: 1 of 1
# Warmup Iteration   1: 227579.441 ms/op
Iteration   1: 220644.181 ms/op
Iteration   2: 218775.665 ms/op
Iteration   3: 219314.759 ms/op


Result "com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset":
  219578.202 ±(99.9%) 17545.201 ms/op [Average]
  (min, avg, max) = (218775.665, 219578.202, 220644.181), stdev = 961.712
  CI (99.9%): [202033.001, 237123.403] (assumes normal distribution)


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

# Run progress: 28.57% complete, ETA 00:44:40
# Fork: 1 of 1
# Warmup Iteration   1: 23471.703 ms/op
Iteration   1: 19351.962 ms/op
Iteration   2: 19216.739 ms/op
Iteration   3: 18997.673 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  19188.791 ±(99.9%) 3261.801 ms/op [Average]
  (min, avg, max) = (18997.673, 19188.791, 19351.962), stdev = 178.790
  CI (99.9%): [15926.990, 22450.592] (assumes normal distribution)


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

# Run progress: 42.86% complete, ETA 00:25:39
# Fork: 1 of 1
# Warmup Iteration   1: 24204.998 ms/op
Iteration   1: 20399.857 ms/op
Iteration   2: 20090.013 ms/op
Iteration   3: 20168.027 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  20219.299 ±(99.9%) 2940.147 ms/op [Average]
  (min, avg, max) = (20090.013, 20219.299, 20399.857), stdev = 161.159
  CI (99.9%): [17279.152, 23159.446] (assumes normal distribution)


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

# Run progress: 57.14% complete, ETA 00:15:30
# Fork: 1 of 1
# Warmup Iteration   1: 21063.578 ms/op
Iteration   1: 18478.565 ms/op
Iteration   2: 17924.563 ms/op
Iteration   3: 17777.639 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable":
  18060.256 ±(99.9%) 6743.610 ms/op [Average]
  (min, avg, max) = (17777.639, 18060.256, 18478.565), stdev = 369.640
  CI (99.9%): [11316.645, 24803.866] (assumes normal distribution)


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

# Run progress: 71.43% complete, ETA 00:08:46
# Fork: 1 of 1
# Warmup Iteration   1: 26779.209 ms/op
Iteration   1: 22807.874 ms/op
Iteration   2: 22593.552 ms/op
Iteration   3: 22623.488 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid":
  22674.971 ±(99.9%) 2117.483 ms/op [Average]
  (min, avg, max) = (22593.552, 22674.971, 22807.874), stdev = 116.066
  CI (99.9%): [20557.489, 24792.454] (assumes normal distribution)


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

# Run progress: 85.71% complete, ETA 00:03:55
# Fork: 1 of 1
# Warmup Iteration   1: 55581.364 ms/op
Iteration   1: 53747.519 ms/op
Iteration   2: 53595.767 ms/op
Iteration   3: 53347.662 ms/op


Result "com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp":
  53563.649 ±(99.9%) 3682.572 ms/op [Average]
  (min, avg, max) = (53347.662, 53563.649, 53747.519), stdev = 201.854
  CI (99.9%): [49881.077, 57246.221] (assumes normal distribution)


# Run complete. Total time: 00:27:07

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
DynamicProcessBenchmark.separationControlTransient        N/A  avgt    3   45658.366 ±  2034.907  ms/op
MlTrainingDataBenchmark.processSurrogateDataset           N/A  avgt    3  219578.202 ± 17545.201  ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep        SRK  avgt    3   19188.791 ±  3261.801  ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep         PR  avgt    3   20219.299 ±  2940.147  ms/op
PropertyTableBenchmark.olgaThreePhaseTable                N/A  avgt    3   18060.256 ±  6743.610  ms/op
PropertyTableBenchmark.tpPropertyGrid                     N/A  avgt    3   22674.971 ±  2117.483  ms/op
TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp    N/A  avgt    3   53563.649 ±  3682.572  ms/op

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
TEG full process: 7362 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5447778e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018746111, composition error=0.0030123554
TEG recycle lean TEG resycle: solved=true, flow error=3.9968029e-14, composition error=4.7067410e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.395 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.164 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.LongRunSmokeTest
olgaThreePhaseTable[small]                                     16296.0  (446 ms)
tpPropertyGrid[small]                                          103.077  (469 ms)
separationControlTransient[small]                              158.784  (2285 ms)
processSimulationSweep[SRK, small]                             380.828  (2126 ms)
processSimulationSweep[PR, small]                              382.559  (2229 ms)
processSurrogateDataset[small]                                 1419.23  (4285 ms)
twoFluidTransient[small]                                       1096.75  (406 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 15.08 s -- in com.equinor.neqsim.benchmark.LongRunSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.089 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 383725 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 383.7 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (3 ms)
tpFlashWellFluidSrk                                            83.6406  (21 ms)
tpFlashWellFluidPr                                             83.6541  (23 ms)
tpFlashWellFluidWithProperties                                 5445.37  (39 ms)
phAndPsFlashWellFluid                                          2459.22  (45 ms)
Nov 15, 2026 1:27:36 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 15, 2026 1:27:36 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00976303  (257 ms)
gasOilSurfaceTension[Simple Gradient Theory]                0.00976303  (78 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (204 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (24 ms)
saturationPointsWellFluid                                      1601.32  (104 ms)
singlePhaseGasPipelineSteadyState                              121.629  (698 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98718  (1345 ms)
levenbergMarquardtAntoine                                      1837.31  (6 ms)
levenbergMarquardtDoubleExponential                            5.57177  (4 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (8 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.579 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  06:57 min
[INFO] Finished at: 2026-11-15T01:27:39Z
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
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 6936 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5447778e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018746111, composition error=0.0030123554
TEG recycle lean TEG resycle: solved=true, flow error=3.9968029e-14, composition error=4.7067410e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.979 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.067 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.LongRunSmokeTest
olgaThreePhaseTable[small]                                     16296.0  (444 ms)
tpPropertyGrid[small]                                          103.077  (334 ms)
separationControlTransient[small]                              158.784  (2208 ms)
processSimulationSweep[SRK, small]                             380.828  (2524 ms)
processSimulationSweep[PR, small]                              382.559  (1808 ms)
processSurrogateDataset[small]                                 1419.23  (3420 ms)
twoFluidTransient[small]                                       688.187  (380 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.94 s -- in com.equinor.neqsim.benchmark.LongRunSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.074 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 401383 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 401.4 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (3 ms)
tpFlashWellFluidSrk                                            83.6406  (29 ms)
tpFlashWellFluidPr                                             83.6541  (29 ms)
tpFlashWellFluidWithProperties                                 5445.37  (41 ms)
phAndPsFlashWellFluid                                          2459.22  (77 ms)
Nov 15, 2026 2:27:49 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 15, 2026 2:27:49 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00976303  (293 ms)
gasOilSurfaceTension[Simple Gradient Theory]                0.00976303  (84 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (285 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (42 ms)
saturationPointsWellFluid                                      1601.32  (137 ms)
singlePhaseGasPipelineSteadyState                              121.629  (684 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98718  (1275 ms)
levenbergMarquardtAntoine                                      1837.31  (7 ms)
levenbergMarquardtDoubleExponential                            5.57177  (4 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (8 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.556 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  07:11 min
[INFO] Finished at: 2026-11-15T02:27:52Z
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

NeqSim **3.27.0 -> 3.28.0**, using identical benchmark sources.
Benchmark suite revision: `B16-8d65e2abc344`

**Overall: 0.35% slower** (geometric mean of 30 cases). 0 significantly faster, 0 significantly slower (non-overlapping 99.9% confidence intervals).

30 benchmark/parameter cases: 10 lower, 20 higher, 0 unchanged mean timings.

### By area

Positive gain means faster (geometric-mean time reduction).

| Area | Cases | Gain | Significantly faster / slower |
| --- | ---: | ---: | ---: |
| flash | 7 | -0.23% | 0 / 0 |
| fluidmechanics | 2 | -0.36% | 0 / 0 |
| longrun | 7 | -0.41% | 0 / 0 |
| numerics | 4 | -0.41% | 0 / 0 |
| process | 4 | -0.76% | 0 / 0 |
| thermo | 6 | -0.12% | 0 / 0 |

### Cases

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| process.TEGprocess.testTEGprocess | 4895.22 | 5087.81 | +3.93% | Overlapping CIs |
| longrun.DynamicProcessBenchmark.separationControlTransient | 44359 | 45658.4 | +2.93% | Overlapping CIs |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=PR) | 19800 | 20219.3 | +2.12% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1906.77 | 1941.9 | +1.84% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 21.3542 | 20.9713 | -1.79% | Overlapping CIs |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=SRK) | 19489.7 | 19188.8 | -1.54% | Overlapping CIs |
| longrun.MlTrainingDataBenchmark.processSurrogateDataset | 222182 | 219578 | -1.17% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 14.8418 | 14.9944 | +1.03% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.18403 | 1.19474 | +0.90% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 3520.87 | 3549.48 | +0.81% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread. Long-running `longrun` cases (30 s to 5 min per operation): one fork, one warmup operation and three measured operations, so their confidence intervals are wide.

```
