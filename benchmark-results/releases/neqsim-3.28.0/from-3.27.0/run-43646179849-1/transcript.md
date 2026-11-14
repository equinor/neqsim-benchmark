# NeqSim 3.28.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.27.0 |
| Current | 3.28.0 |
| Source commit | `430b3ec36281083a562276bac864c7e163e45939` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43646179849) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 15,
  "label": "B15-c61b4669e2ef",
  "fingerprint": "c61b4669e2ef0e746fc04e1631684b294bc6f2a829ed71d1c891b79bffb756ee",
  "source_commit": "430b3ec36281083a562276bac864c7e163e45939",
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
[INFO] Total time:  3.989 s
[INFO] Finished at: 2026-11-14T22:05:24Z
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
[INFO] Total time:  13.336 s
[INFO] Finished at: 2026-11-14T22:05:38Z
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
# Warmup Iteration   1: 20.293 ms/op
# Warmup Iteration   2: 16.953 ms/op
Iteration   1: 16.719 ms/op
Iteration   2: 16.486 ms/op
Iteration   3: 16.445 ms/op

# Run progress: 2.17% complete, ETA 00:08:44
# Fork: 2 of 2
# Warmup Iteration   1: 20.924 ms/op
# Warmup Iteration   2: 16.935 ms/op
Iteration   1: 16.736 ms/op
Iteration   2: 16.496 ms/op
Iteration   3: 16.436 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  16.553 ±(99.9%) 0.385 ms/op [Average]
  (min, avg, max) = (16.436, 16.553, 16.736), stdev = 0.137
  CI (99.9%): [16.168, 16.937] (assumes normal distribution)


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
# Warmup Iteration   1: 2.393 ms/op
# Warmup Iteration   2: 1.294 ms/op
Iteration   1: 1.270 ms/op
Iteration   2: 1.270 ms/op
Iteration   3: 1.260 ms/op

# Run progress: 6.52% complete, ETA 00:08:19
# Fork: 2 of 2
# Warmup Iteration   1: 2.423 ms/op
# Warmup Iteration   2: 1.278 ms/op
Iteration   1: 1.240 ms/op
Iteration   2: 1.242 ms/op
Iteration   3: 1.244 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.254 ±(99.9%) 0.039 ms/op [Average]
  (min, avg, max) = (1.240, 1.254, 1.270), stdev = 0.014
  CI (99.9%): [1.215, 1.293] (assumes normal distribution)


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
# Warmup Iteration   1: 12.199 ms/op
# Warmup Iteration   2: 6.831 ms/op
Iteration   1: 6.482 ms/op
Iteration   2: 6.428 ms/op
Iteration   3: 6.414 ms/op

# Run progress: 10.87% complete, ETA 00:07:56
# Fork: 2 of 2
# Warmup Iteration   1: 11.053 ms/op
# Warmup Iteration   2: 6.654 ms/op
Iteration   1: 6.503 ms/op
Iteration   2: 6.423 ms/op
Iteration   3: 6.395 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.441 ±(99.9%) 0.118 ms/op [Average]
  (min, avg, max) = (6.395, 6.441, 6.503), stdev = 0.042
  CI (99.9%): [6.323, 6.559] (assumes normal distribution)


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
# Warmup Iteration   1: 11.260 ms/op
# Warmup Iteration   2: 6.861 ms/op
Iteration   1: 6.707 ms/op
Iteration   2: 6.689 ms/op
Iteration   3: 6.630 ms/op

# Run progress: 15.22% complete, ETA 00:07:32
# Fork: 2 of 2
# Warmup Iteration   1: 9.403 ms/op
# Warmup Iteration   2: 7.166 ms/op
Iteration   1: 6.871 ms/op
Iteration   2: 6.694 ms/op
Iteration   3: 6.668 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.710 ±(99.9%) 0.234 ms/op [Average]
  (min, avg, max) = (6.630, 6.710, 6.871), stdev = 0.083
  CI (99.9%): [6.476, 6.944] (assumes normal distribution)


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
# Warmup Iteration   1: 16.538 ms/op
# Warmup Iteration   2: 11.329 ms/op
Iteration   1: 11.049 ms/op
Iteration   2: 10.970 ms/op
Iteration   3: 10.975 ms/op

# Run progress: 19.57% complete, ETA 00:07:09
# Fork: 2 of 2
# Warmup Iteration   1: 22.015 ms/op
# Warmup Iteration   2: 11.510 ms/op
Iteration   1: 11.018 ms/op
Iteration   2: 10.952 ms/op
Iteration   3: 10.891 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.976 ±(99.9%) 0.153 ms/op [Average]
  (min, avg, max) = (10.891, 10.976, 11.049), stdev = 0.055
  CI (99.9%): [10.823, 11.129] (assumes normal distribution)


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
# Warmup Iteration   1: 1082.294 ms/op
# Warmup Iteration   2: 448.923 ms/op
Iteration   1: 377.338 ms/op
Iteration   2: 372.262 ms/op
Iteration   3: 375.980 ms/op

# Run progress: 23.91% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 1241.220 ms/op
# Warmup Iteration   2: 445.460 ms/op
Iteration   1: 375.566 ms/op
Iteration   2: 372.749 ms/op
Iteration   3: 369.849 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  373.957 ±(99.9%) 7.864 ms/op [Average]
  (min, avg, max) = (369.849, 373.957, 377.338), stdev = 2.804
  CI (99.9%): [366.094, 381.821] (assumes normal distribution)


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

# Run progress: 26.09% complete, ETA 00:06:34
# Fork: 1 of 2
# Warmup Iteration   1: 3515.710 ms/op
# Warmup Iteration   2: 2114.879 ms/op
Iteration   1: 1908.490 ms/op
Iteration   2: 1920.914 ms/op
Iteration   3: 1918.706 ms/op

# Run progress: 28.26% complete, ETA 00:06:37
# Fork: 2 of 2
# Warmup Iteration   1: 3525.059 ms/op
# Warmup Iteration   2: 2218.629 ms/op
Iteration   1: 1904.739 ms/op
Iteration   2: 1903.201 ms/op
Iteration   3: 1928.818 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  1914.145 ±(99.9%) 28.656 ms/op [Average]
  (min, avg, max) = (1903.201, 1914.145, 1928.818), stdev = 10.219
  CI (99.9%): [1885.488, 1942.801] (assumes normal distribution)


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
# Warmup Iteration   1: 770.690 ms/op
# Warmup Iteration   2: 433.019 ms/op
Iteration   1: 420.817 ms/op
Iteration   2: 405.513 ms/op
Iteration   3: 407.469 ms/op

# Run progress: 32.61% complete, ETA 00:06:22
# Fork: 2 of 2
# Warmup Iteration   1: 775.850 ms/op
# Warmup Iteration   2: 432.146 ms/op
Iteration   1: 422.331 ms/op
Iteration   2: 411.330 ms/op
Iteration   3: 405.664 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  412.187 ±(99.9%) 21.263 ms/op [Average]
  (min, avg, max) = (405.513, 412.187, 422.331), stdev = 7.582
  CI (99.9%): [390.925, 433.450] (assumes normal distribution)


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
# Warmup Iteration   1: 1429.810 ms/op
# Warmup Iteration   2: 892.591 ms/op
Iteration   1: 868.336 ms/op
Iteration   2: 866.670 ms/op
Iteration   3: 879.439 ms/op

# Run progress: 36.96% complete, ETA 00:05:57
# Fork: 2 of 2
# Warmup Iteration   1: 1440.583 ms/op
# Warmup Iteration   2: 890.575 ms/op
Iteration   1: 878.730 ms/op
Iteration   2: 879.646 ms/op
Iteration   3: 864.566 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  872.898 ±(99.9%) 19.882 ms/op [Average]
  (min, avg, max) = (864.566, 872.898, 879.646), stdev = 7.090
  CI (99.9%): [853.015, 892.780] (assumes normal distribution)


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
# Warmup Iteration   1: 0.110 ms/op
# Warmup Iteration   2: 0.080 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:31
# Fork: 2 of 2
# Warmup Iteration   1: 0.104 ms/op
# Warmup Iteration   2: 0.080 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.079 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.079, 0.079, 0.079), stdev = 0.001
  CI (99.9%): [0.078, 0.080] (assumes normal distribution)


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
# Warmup Iteration   1: 7.887 ms/op
# Warmup Iteration   2: 6.192 ms/op
Iteration   1: 6.154 ms/op
Iteration   2: 6.135 ms/op
Iteration   3: 6.125 ms/op

# Run progress: 45.65% complete, ETA 00:05:02
# Fork: 2 of 2
# Warmup Iteration   1: 7.975 ms/op
# Warmup Iteration   2: 6.167 ms/op
Iteration   1: 6.151 ms/op
Iteration   2: 6.119 ms/op
Iteration   3: 6.117 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.133 ±(99.9%) 0.044 ms/op [Average]
  (min, avg, max) = (6.117, 6.133, 6.154), stdev = 0.016
  CI (99.9%): [6.089, 6.178] (assumes normal distribution)


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
# Warmup Iteration   1: 0.614 ms/op
# Warmup Iteration   2: 0.457 ms/op
Iteration   1: 0.457 ms/op
Iteration   2: 0.458 ms/op
Iteration   3: 0.459 ms/op

# Run progress: 50.00% complete, ETA 00:04:34
# Fork: 2 of 2
# Warmup Iteration   1: 0.612 ms/op
# Warmup Iteration   2: 0.457 ms/op
Iteration   1: 0.456 ms/op
Iteration   2: 0.456 ms/op
Iteration   3: 0.457 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.457 ±(99.9%) 0.003 ms/op [Average]
  (min, avg, max) = (0.456, 0.457, 0.459), stdev = 0.001
  CI (99.9%): [0.454, 0.460] (assumes normal distribution)


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
# Warmup Iteration   1: 1.607 ms/op
# Warmup Iteration   2: 1.187 ms/op
Iteration   1: 1.181 ms/op
Iteration   2: 1.178 ms/op
Iteration   3: 1.181 ms/op

# Run progress: 54.35% complete, ETA 00:04:07
# Fork: 2 of 2
# Warmup Iteration   1: 1.551 ms/op
# Warmup Iteration   2: 1.190 ms/op
Iteration   1: 1.183 ms/op
Iteration   2: 1.184 ms/op
Iteration   3: 1.187 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.182 ±(99.9%) 0.008 ms/op [Average]
  (min, avg, max) = (1.178, 1.182, 1.187), stdev = 0.003
  CI (99.9%): [1.174, 1.191] (assumes normal distribution)


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
# Warmup Iteration   1: 74.305 ms/op
# Warmup Iteration   2: 25.358 ms/op
Iteration   1: 20.126 ms/op
Iteration   2: 18.202 ms/op
Iteration   3: 17.059 ms/op

# Run progress: 58.70% complete, ETA 00:03:41
# Fork: 2 of 2
# Warmup Iteration   1: 92.357 ms/op
# Warmup Iteration   2: 38.007 ms/op
Iteration   1: 30.494 ms/op
Iteration   2: 18.095 ms/op
Iteration   3: 16.931 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  20.151 ±(99.9%) 14.567 ms/op [Average]
  (min, avg, max) = (16.931, 20.151, 30.494), stdev = 5.195
  CI (99.9%): [5.584, 34.719] (assumes normal distribution)


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
# Warmup Iteration   1: 50402.424 ms/op
# Warmup Iteration   2: 47605.870 ms/op
Iteration   1: 47454.232 ms/op
Iteration   2: 47353.570 ms/op
Iteration   3: 47526.801 ms/op

# Run progress: 63.04% complete, ETA 00:05:32
# Fork: 2 of 2
# Warmup Iteration   1: 50653.141 ms/op
# Warmup Iteration   2: 47871.315 ms/op
Iteration   1: 47632.189 ms/op
Iteration   2: 47525.699 ms/op
Iteration   3: 47437.493 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  47488.331 ±(99.9%) 267.441 ms/op [Average]
  (min, avg, max) = (47353.570, 47488.331, 47632.189), stdev = 95.372
  CI (99.9%): [47220.890, 47755.772] (assumes normal distribution)


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

# Run progress: 65.22% complete, ETA 00:07:11
# Fork: 1 of 2
# Warmup Iteration   1: 7112.878 ms/op
# Warmup Iteration   2: 2627.113 ms/op
Iteration   1: 4205.184 ms/op
Iteration   2: 2831.328 ms/op
Iteration   3: 3703.326 ms/op

# Run progress: 67.39% complete, ETA 00:08:43
# Fork: 2 of 2
# Warmup Iteration   1: 7134.644 ms/op
# Warmup Iteration   2: 2623.774 ms/op
Iteration   1: 4219.176 ms/op
Iteration   2: 2775.123 ms/op
Iteration   3: 3707.850 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  3573.665 ±(99.9%) 1790.754 ms/op [Average]
  (min, avg, max) = (2775.123, 3573.665, 4219.176), stdev = 638.600
  CI (99.9%): [1782.911, 5364.419] (assumes normal distribution)


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

# Run progress: 69.57% complete, ETA 00:09:51
# Fork: 1 of 2
# Warmup Iteration   1: 7078.427 ms/op
# Warmup Iteration   2: 5094.173 ms/op
Iteration   1: 4901.026 ms/op
Iteration   2: 4962.581 ms/op
Iteration   3: 4831.226 ms/op

# Run progress: 71.74% complete, ETA 00:09:03
# Fork: 2 of 2
# Warmup Iteration   1: 7016.316 ms/op
# Warmup Iteration   2: 5186.899 ms/op
Iteration   1: 4933.626 ms/op
Iteration   2: 4831.714 ms/op
Iteration   3: 4844.608 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  4884.130 ±(99.9%) 158.620 ms/op [Average]
  (min, avg, max) = (4831.226, 4884.130, 4962.581), stdev = 56.565
  CI (99.9%): [4725.510, 5042.750] (assumes normal distribution)


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

# Run progress: 73.91% complete, ETA 00:08:16
# Fork: 1 of 2
# Warmup Iteration   1: Nov 14, 2026 10:36:18 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 14, 2026 10:36:18 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
4.324 ms/op
# Warmup Iteration   2: 2.932 ms/op
Iteration   1: 2.880 ms/op
Iteration   2: 2.904 ms/op
Iteration   3: 2.865 ms/op

# Run progress: 76.09% complete, ETA 00:07:25
# Fork: 2 of 2
# Warmup Iteration   1: Nov 14, 2026 10:36:29 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 14, 2026 10:36:29 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
4.045 ms/op
# Warmup Iteration   2: 2.895 ms/op
Iteration   1: 2.869 ms/op
Iteration   2: 2.870 ms/op
Iteration   3: 2.864 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  2.875 ±(99.9%) 0.042 ms/op [Average]
  (min, avg, max) = (2.864, 2.875, 2.904), stdev = 0.015
  CI (99.9%): [2.833, 2.918] (assumes normal distribution)


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
# Warmup Iteration   1: 16.405 ms/op
# Warmup Iteration   2: 14.804 ms/op
Iteration   1: 14.786 ms/op
Iteration   2: 14.606 ms/op
Iteration   3: 14.583 ms/op

# Run progress: 80.43% complete, ETA 00:05:50
# Fork: 2 of 2
# Warmup Iteration   1: 17.012 ms/op
# Warmup Iteration   2: 15.003 ms/op
Iteration   1: 14.978 ms/op
Iteration   2: 14.723 ms/op
Iteration   3: 14.752 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  14.738 ±(99.9%) 0.399 ms/op [Average]
  (min, avg, max) = (14.583, 14.738, 14.978), stdev = 0.142
  CI (99.9%): [14.339, 15.137] (assumes normal distribution)


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
# Warmup Iteration   1: 61.458 ms/op
# Warmup Iteration   2: 48.916 ms/op
Iteration   1: 47.346 ms/op
Iteration   2: 46.787 ms/op
Iteration   3: 46.761 ms/op

# Run progress: 89.13% complete, ETA 00:03:00
# Fork: 2 of 2
# Warmup Iteration   1: 61.002 ms/op
# Warmup Iteration   2: 48.579 ms/op
Iteration   1: 47.548 ms/op
Iteration   2: 46.644 ms/op
Iteration   3: 46.549 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  46.939 ±(99.9%) 1.143 ms/op [Average]
  (min, avg, max) = (46.549, 46.939, 47.548), stdev = 0.408
  CI (99.9%): [45.796, 48.082] (assumes normal distribution)


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
# Warmup Iteration   1: 10.370 ms/op
# Warmup Iteration   2: 8.132 ms/op
Iteration   1: 8.026 ms/op
Iteration   2: 7.799 ms/op
Iteration   3: 7.796 ms/op

# Run progress: 93.48% complete, ETA 00:01:45
# Fork: 2 of 2
# Warmup Iteration   1: 10.441 ms/op
# Warmup Iteration   2: 8.234 ms/op
Iteration   1: 8.121 ms/op
Iteration   2: 8.000 ms/op
Iteration   3: 7.955 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  7.950 ±(99.9%) 0.363 ms/op [Average]
  (min, avg, max) = (7.796, 7.950, 8.121), stdev = 0.130
  CI (99.9%): [7.586, 8.313] (assumes normal distribution)


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
# Warmup Iteration   1: 22.304 ms/op
# Warmup Iteration   2: 19.773 ms/op
Iteration   1: 19.965 ms/op
Iteration   2: 20.037 ms/op
Iteration   3: 19.789 ms/op

# Run progress: 97.83% complete, ETA 00:00:33
# Fork: 2 of 2
# Warmup Iteration   1: 22.245 ms/op
# Warmup Iteration   2: 19.867 ms/op
Iteration   1: 19.776 ms/op
Iteration   2: 19.806 ms/op
Iteration   3: 19.703 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  19.846 ±(99.9%) 0.357 ms/op [Average]
  (min, avg, max) = (19.703, 19.846, 20.037), stdev = 0.127
  CI (99.9%): [19.489, 20.203] (assumes normal distribution)


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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     16.553 ±    0.385  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.254 ±    0.039  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.441 ±    0.118  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.710 ±    0.234  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.976 ±    0.153  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    373.957 ±    7.864  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   1914.145 ±   28.656  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    412.187 ±   21.263  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    872.898 ±   19.882  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.079 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.133 ±    0.044  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.457 ±    0.003  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.182 ±    0.008  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     20.151 ±   14.567  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  47488.331 ±  267.441  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   3573.665 ± 1790.754  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   4884.130 ±  158.620  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6      2.875 ±    0.042  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     14.738 ±    0.399  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     46.939 ±    1.143  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      7.950 ±    0.363  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     19.846 ±    0.357  ms/op

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
Iteration   1: 47276.918 ms/op
Iteration   2: 44843.124 ms/op


Result "com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient":
  46060.021 ms/op


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

# Run progress: 14.29% complete, ETA 00:09:14
# Fork: 1 of 1
Iteration   1: 227349.486 ms/op
Iteration   2: 222710.042 ms/op


Result "com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset":
  225029.764 ms/op


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

# Run progress: 28.57% complete, ETA 00:22:36
# Fork: 1 of 1
Iteration   1: 21714.300 ms/op
Iteration   2: 18454.072 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  20084.186 ms/op


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

# Run progress: 42.86% complete, ETA 00:12:58
# Fork: 1 of 1
Iteration   1: 23581.440 ms/op
Iteration   2: 20242.127 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  21911.783 ms/op


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

# Run progress: 57.14% complete, ETA 00:07:51
# Fork: 1 of 1
Iteration   1: 21316.853 ms/op
Iteration   2: 18383.629 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable":
  19850.241 ms/op


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

# Run progress: 71.43% complete, ETA 00:04:27
# Fork: 1 of 1
Iteration   1: 25832.408 ms/op
Iteration   2: 22184.206 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid":
  24008.307 ms/op


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

# Run progress: 85.71% complete, ETA 00:01:59
# Fork: 1 of 1
Iteration   1: 55609.553 ms/op
Iteration   2: 53872.891 ms/op


Result "com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp":
  54741.222 ms/op


# Run complete. Total time: 00:13:47

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
DynamicProcessBenchmark.separationControlTransient        N/A  avgt    2   46060.021          ms/op
MlTrainingDataBenchmark.processSurrogateDataset           N/A  avgt    2  225029.764          ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep        SRK  avgt    2   20084.186          ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep         PR  avgt    2   21911.783          ms/op
PropertyTableBenchmark.olgaThreePhaseTable                N/A  avgt    2   19850.241          ms/op
PropertyTableBenchmark.tpPropertyGrid                     N/A  avgt    2   24008.307          ms/op
TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp    N/A  avgt    2   54741.222          ms/op

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
[INFO] Total time:  2.505 s
[INFO] Finished at: 2026-11-14T22:52:22Z
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
[INFO] Total time:  8.772 s
[INFO] Finished at: 2026-11-14T22:52:32Z
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
# Warmup Iteration   1: 21.798 ms/op
# Warmup Iteration   2: 16.956 ms/op
Iteration   1: 16.848 ms/op
Iteration   2: 16.617 ms/op
Iteration   3: 16.430 ms/op

# Run progress: 2.17% complete, ETA 00:08:45
# Fork: 2 of 2
# Warmup Iteration   1: 20.976 ms/op
# Warmup Iteration   2: 16.837 ms/op
Iteration   1: 16.819 ms/op
Iteration   2: 16.864 ms/op
Iteration   3: 16.609 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  16.698 ±(99.9%) 0.487 ms/op [Average]
  (min, avg, max) = (16.430, 16.698, 16.864), stdev = 0.174
  CI (99.9%): [16.211, 17.185] (assumes normal distribution)


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
# Warmup Iteration   1: 2.269 ms/op
# Warmup Iteration   2: 1.255 ms/op
Iteration   1: 1.251 ms/op
Iteration   2: 1.254 ms/op
Iteration   3: 1.252 ms/op

# Run progress: 6.52% complete, ETA 00:08:20
# Fork: 2 of 2
# Warmup Iteration   1: 2.444 ms/op
# Warmup Iteration   2: 1.256 ms/op
Iteration   1: 1.249 ms/op
Iteration   2: 1.248 ms/op
Iteration   3: 1.251 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.251 ±(99.9%) 0.006 ms/op [Average]
  (min, avg, max) = (1.248, 1.251, 1.254), stdev = 0.002
  CI (99.9%): [1.245, 1.257] (assumes normal distribution)


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
# Warmup Iteration   1: 11.875 ms/op
# Warmup Iteration   2: 6.780 ms/op
Iteration   1: 6.516 ms/op
Iteration   2: 6.506 ms/op
Iteration   3: 6.529 ms/op

# Run progress: 10.87% complete, ETA 00:07:56
# Fork: 2 of 2
# Warmup Iteration   1: 10.597 ms/op
# Warmup Iteration   2: 6.749 ms/op
Iteration   1: 6.503 ms/op
Iteration   2: 6.451 ms/op
Iteration   3: 6.390 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.483 ±(99.9%) 0.147 ms/op [Average]
  (min, avg, max) = (6.390, 6.483, 6.529), stdev = 0.052
  CI (99.9%): [6.336, 6.630] (assumes normal distribution)


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

# Run progress: 13.04% complete, ETA 00:07:45
# Fork: 1 of 2
# Warmup Iteration   1: 12.427 ms/op
# Warmup Iteration   2: 6.937 ms/op
Iteration   1: 6.852 ms/op
Iteration   2: 6.707 ms/op
Iteration   3: 6.698 ms/op

# Run progress: 15.22% complete, ETA 00:07:33
# Fork: 2 of 2
# Warmup Iteration   1: 12.066 ms/op
# Warmup Iteration   2: 7.041 ms/op
Iteration   1: 6.725 ms/op
Iteration   2: 6.688 ms/op
Iteration   3: 6.653 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.720 ±(99.9%) 0.193 ms/op [Average]
  (min, avg, max) = (6.653, 6.720, 6.852), stdev = 0.069
  CI (99.9%): [6.528, 6.913] (assumes normal distribution)


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

# Run progress: 17.39% complete, ETA 00:07:22
# Fork: 1 of 2
# Warmup Iteration   1: 21.529 ms/op
# Warmup Iteration   2: 11.364 ms/op
Iteration   1: 10.995 ms/op
Iteration   2: 10.935 ms/op
Iteration   3: 10.921 ms/op

# Run progress: 19.57% complete, ETA 00:07:10
# Fork: 2 of 2
# Warmup Iteration   1: 17.143 ms/op
# Warmup Iteration   2: 11.611 ms/op
Iteration   1: 11.054 ms/op
Iteration   2: 10.929 ms/op
Iteration   3: 10.967 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.967 ±(99.9%) 0.143 ms/op [Average]
  (min, avg, max) = (10.921, 10.967, 11.054), stdev = 0.051
  CI (99.9%): [10.824, 11.110] (assumes normal distribution)


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

# Run progress: 21.74% complete, ETA 00:06:59
# Fork: 1 of 2
# Warmup Iteration   1: 1245.219 ms/op
# Warmup Iteration   2: 440.918 ms/op
Iteration   1: 387.296 ms/op
Iteration   2: 378.150 ms/op
Iteration   3: 369.711 ms/op

# Run progress: 23.91% complete, ETA 00:06:47
# Fork: 2 of 2
# Warmup Iteration   1: 1257.529 ms/op
# Warmup Iteration   2: 456.765 ms/op
Iteration   1: 373.482 ms/op
Iteration   2: 369.457 ms/op
Iteration   3: 365.657 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  373.959 ±(99.9%) 21.825 ms/op [Average]
  (min, avg, max) = (365.657, 373.959, 387.296), stdev = 7.783
  CI (99.9%): [352.134, 395.784] (assumes normal distribution)


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

# Run progress: 26.09% complete, ETA 00:06:36
# Fork: 1 of 2
# Warmup Iteration   1: 3726.768 ms/op
# Warmup Iteration   2: 2132.955 ms/op
Iteration   1: 1956.011 ms/op
Iteration   2: 2005.604 ms/op
Iteration   3: 1899.420 ms/op

# Run progress: 28.26% complete, ETA 00:06:35
# Fork: 2 of 2
# Warmup Iteration   1: 3642.845 ms/op
# Warmup Iteration   2: 2213.960 ms/op
Iteration   1: 1929.561 ms/op
Iteration   2: 2005.522 ms/op
Iteration   3: 1908.382 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  1950.750 ±(99.9%) 131.022 ms/op [Average]
  (min, avg, max) = (1899.420, 1950.750, 2005.604), stdev = 46.724
  CI (99.9%): [1819.728, 2081.772] (assumes normal distribution)


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

# Run progress: 30.43% complete, ETA 00:06:31
# Fork: 1 of 2
# Warmup Iteration   1: 772.356 ms/op
# Warmup Iteration   2: 430.338 ms/op
Iteration   1: 418.106 ms/op
Iteration   2: 417.298 ms/op
Iteration   3: 418.192 ms/op

# Run progress: 32.61% complete, ETA 00:06:16
# Fork: 2 of 2
# Warmup Iteration   1: 762.633 ms/op
# Warmup Iteration   2: 435.285 ms/op
Iteration   1: 423.498 ms/op
Iteration   2: 409.386 ms/op
Iteration   3: 416.875 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  417.226 ±(99.9%) 12.705 ms/op [Average]
  (min, avg, max) = (409.386, 417.226, 423.498), stdev = 4.531
  CI (99.9%): [404.521, 429.931] (assumes normal distribution)


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

# Run progress: 34.78% complete, ETA 00:06:02
# Fork: 1 of 2
# Warmup Iteration   1: 1485.572 ms/op
# Warmup Iteration   2: 887.476 ms/op
Iteration   1: 877.031 ms/op
Iteration   2: 868.250 ms/op
Iteration   3: 885.522 ms/op

# Run progress: 36.96% complete, ETA 00:05:53
# Fork: 2 of 2
# Warmup Iteration   1: 1415.747 ms/op
# Warmup Iteration   2: 912.215 ms/op
Iteration   1: 874.760 ms/op
Iteration   2: 884.554 ms/op
Iteration   3: 870.878 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  876.832 ±(99.9%) 19.773 ms/op [Average]
  (min, avg, max) = (868.250, 876.832, 885.522), stdev = 7.051
  CI (99.9%): [857.060, 896.605] (assumes normal distribution)


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
# Warmup Iteration   1: 0.112 ms/op
# Warmup Iteration   2: 0.080 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:28
# Fork: 2 of 2
# Warmup Iteration   1: 0.111 ms/op
# Warmup Iteration   2: 0.080 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.079 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.079, 0.079, 0.080), stdev = 0.001
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

# Run progress: 43.48% complete, ETA 00:05:13
# Fork: 1 of 2
# Warmup Iteration   1: 8.037 ms/op
# Warmup Iteration   2: 6.181 ms/op
Iteration   1: 6.148 ms/op
Iteration   2: 6.134 ms/op
Iteration   3: 6.118 ms/op

# Run progress: 45.65% complete, ETA 00:04:59
# Fork: 2 of 2
# Warmup Iteration   1: 8.023 ms/op
# Warmup Iteration   2: 6.151 ms/op
Iteration   1: 6.149 ms/op
Iteration   2: 6.131 ms/op
Iteration   3: 6.128 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.135 ±(99.9%) 0.034 ms/op [Average]
  (min, avg, max) = (6.118, 6.135, 6.149), stdev = 0.012
  CI (99.9%): [6.101, 6.168] (assumes normal distribution)


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
# Warmup Iteration   1: 0.604 ms/op
# Warmup Iteration   2: 0.458 ms/op
Iteration   1: 0.456 ms/op
Iteration   2: 0.456 ms/op
Iteration   3: 0.455 ms/op

# Run progress: 50.00% complete, ETA 00:04:31
# Fork: 2 of 2
# Warmup Iteration   1: 0.626 ms/op
# Warmup Iteration   2: 0.467 ms/op
Iteration   1: 0.465 ms/op
Iteration   2: 0.465 ms/op
Iteration   3: 0.465 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.460 ±(99.9%) 0.015 ms/op [Average]
  (min, avg, max) = (0.455, 0.460, 0.465), stdev = 0.005
  CI (99.9%): [0.446, 0.475] (assumes normal distribution)


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

# Run progress: 52.17% complete, ETA 00:04:18
# Fork: 1 of 2
# Warmup Iteration   1: 1.577 ms/op
# Warmup Iteration   2: 1.198 ms/op
Iteration   1: 1.185 ms/op
Iteration   2: 1.184 ms/op
Iteration   3: 1.186 ms/op

# Run progress: 54.35% complete, ETA 00:04:05
# Fork: 2 of 2
# Warmup Iteration   1: 1.623 ms/op
# Warmup Iteration   2: 1.207 ms/op
Iteration   1: 1.202 ms/op
Iteration   2: 1.200 ms/op
Iteration   3: 1.200 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.193 ±(99.9%) 0.024 ms/op [Average]
  (min, avg, max) = (1.184, 1.193, 1.202), stdev = 0.009
  CI (99.9%): [1.169, 1.217] (assumes normal distribution)


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

# Run progress: 56.52% complete, ETA 00:03:52
# Fork: 1 of 2
# Warmup Iteration   1: 97.297 ms/op
# Warmup Iteration   2: 35.970 ms/op
Iteration   1: 20.685 ms/op
Iteration   2: 18.984 ms/op
Iteration   3: 17.299 ms/op

# Run progress: 58.70% complete, ETA 00:03:40
# Fork: 2 of 2
# Warmup Iteration   1: 88.044 ms/op
# Warmup Iteration   2: 34.218 ms/op
Iteration   1: 19.939 ms/op
Iteration   2: 17.593 ms/op
Iteration   3: 16.699 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  18.533 ±(99.9%) 4.448 ms/op [Average]
  (min, avg, max) = (16.699, 18.533, 20.685), stdev = 1.586
  CI (99.9%): [14.085, 22.982] (assumes normal distribution)


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

# Run progress: 60.87% complete, ETA 00:03:27
# Fork: 1 of 2
# Warmup Iteration   1: 50226.701 ms/op
# Warmup Iteration   2: 47420.737 ms/op
Iteration   1: 47194.330 ms/op
Iteration   2: 47237.755 ms/op
Iteration   3: 47246.572 ms/op

# Run progress: 63.04% complete, ETA 00:05:30
# Fork: 2 of 2
# Warmup Iteration   1: 50905.584 ms/op
# Warmup Iteration   2: 48717.083 ms/op
Iteration   1: 48123.445 ms/op
Iteration   2: 48048.122 ms/op
Iteration   3: 48025.749 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  47645.996 ±(99.9%) 1293.626 ms/op [Average]
  (min, avg, max) = (47194.330, 47645.996, 48123.445), stdev = 461.319
  CI (99.9%): [46352.370, 48939.621] (assumes normal distribution)


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

# Run progress: 65.22% complete, ETA 00:07:11
# Fork: 1 of 2
# Warmup Iteration   1: 6929.212 ms/op
# Warmup Iteration   2: 2628.033 ms/op
Iteration   1: 4110.148 ms/op
Iteration   2: 2725.467 ms/op
Iteration   3: 3652.346 ms/op

# Run progress: 67.39% complete, ETA 00:08:40
# Fork: 2 of 2
# Warmup Iteration   1: 7053.787 ms/op
# Warmup Iteration   2: 2657.154 ms/op
Iteration   1: 4133.596 ms/op
Iteration   2: 2784.667 ms/op
Iteration   3: 3714.268 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  3520.082 ±(99.9%) 1752.124 ms/op [Average]
  (min, avg, max) = (2725.467, 3520.082, 4133.596), stdev = 624.824
  CI (99.9%): [1767.958, 5272.206] (assumes normal distribution)


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

# Run progress: 69.57% complete, ETA 00:09:48
# Fork: 1 of 2
# Warmup Iteration   1: 7138.209 ms/op
# Warmup Iteration   2: 5203.718 ms/op
Iteration   1: 4946.926 ms/op
Iteration   2: 5003.354 ms/op
Iteration   3: 4919.296 ms/op

# Run progress: 71.74% complete, ETA 00:09:00
# Fork: 2 of 2
# Warmup Iteration   1: 7305.784 ms/op
# Warmup Iteration   2: 5171.402 ms/op
Iteration   1: 5046.974 ms/op
Iteration   2: 4930.653 ms/op
Iteration   3: 4863.581 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  4951.797 ±(99.9%) 181.845 ms/op [Average]
  (min, avg, max) = (4863.581, 4951.797, 5046.974), stdev = 64.848
  CI (99.9%): [4769.953, 5133.642] (assumes normal distribution)


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
# Warmup Iteration   1: Nov 14, 2026 11:23:10 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 14, 2026 11:23:10 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
4.802 ms/op
# Warmup Iteration   2: 2.947 ms/op
Iteration   1: 2.920 ms/op
Iteration   2: 2.887 ms/op
Iteration   3: 2.874 ms/op

# Run progress: 76.09% complete, ETA 00:07:23
# Fork: 2 of 2
# Warmup Iteration   1: Nov 14, 2026 11:23:21 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 14, 2026 11:23:21 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
4.208 ms/op
# Warmup Iteration   2: 2.965 ms/op
Iteration   1: 2.886 ms/op
Iteration   2: 2.880 ms/op
Iteration   3: 2.865 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  2.885 ±(99.9%) 0.052 ms/op [Average]
  (min, avg, max) = (2.865, 2.885, 2.920), stdev = 0.019
  CI (99.9%): [2.833, 2.938] (assumes normal distribution)


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
# Warmup Iteration   1: 19.638 ms/op
# Warmup Iteration   2: 15.030 ms/op
Iteration   1: 14.934 ms/op
Iteration   2: 14.869 ms/op
Iteration   3: 14.832 ms/op

# Run progress: 80.43% complete, ETA 00:05:48
# Fork: 2 of 2
# Warmup Iteration   1: 16.934 ms/op
# Warmup Iteration   2: 15.009 ms/op
Iteration   1: 14.878 ms/op
Iteration   2: 14.762 ms/op
Iteration   3: 14.763 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  14.840 ±(99.9%) 0.191 ms/op [Average]
  (min, avg, max) = (14.762, 14.840, 14.934), stdev = 0.068
  CI (99.9%): [14.649, 15.031] (assumes normal distribution)


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
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:21
# Fork: 2 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
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

# Run progress: 86.96% complete, ETA 00:03:40
# Fork: 1 of 2
# Warmup Iteration   1: 59.025 ms/op
# Warmup Iteration   2: 48.520 ms/op
Iteration   1: 47.397 ms/op
Iteration   2: 46.668 ms/op
Iteration   3: 46.430 ms/op

# Run progress: 89.13% complete, ETA 00:03:00
# Fork: 2 of 2
# Warmup Iteration   1: 59.389 ms/op
# Warmup Iteration   2: 48.816 ms/op
Iteration   1: 47.380 ms/op
Iteration   2: 46.621 ms/op
Iteration   3: 46.697 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  46.866 ±(99.9%) 1.166 ms/op [Average]
  (min, avg, max) = (46.430, 46.866, 47.397), stdev = 0.416
  CI (99.9%): [45.700, 48.031] (assumes normal distribution)


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
# Warmup Iteration   1: 10.186 ms/op
# Warmup Iteration   2: 8.167 ms/op
Iteration   1: 7.932 ms/op
Iteration   2: 7.895 ms/op
Iteration   3: 7.823 ms/op

# Run progress: 93.48% complete, ETA 00:01:44
# Fork: 2 of 2
# Warmup Iteration   1: 10.022 ms/op
# Warmup Iteration   2: 8.221 ms/op
Iteration   1: 8.051 ms/op
Iteration   2: 7.982 ms/op
Iteration   3: 8.008 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  7.948 ±(99.9%) 0.232 ms/op [Average]
  (min, avg, max) = (7.823, 7.948, 8.051), stdev = 0.083
  CI (99.9%): [7.717, 8.180] (assumes normal distribution)


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
# Warmup Iteration   1: 22.465 ms/op
# Warmup Iteration   2: 19.844 ms/op
Iteration   1: 19.769 ms/op
Iteration   2: 19.834 ms/op
Iteration   3: 19.722 ms/op

# Run progress: 97.83% complete, ETA 00:00:33
# Fork: 2 of 2
# Warmup Iteration   1: 22.377 ms/op
# Warmup Iteration   2: 19.856 ms/op
Iteration   1: 19.744 ms/op
Iteration   2: 19.792 ms/op
Iteration   3: 19.738 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  19.767 ±(99.9%) 0.116 ms/op [Average]
  (min, avg, max) = (19.722, 19.767, 19.834), stdev = 0.041
  CI (99.9%): [19.651, 19.882] (assumes normal distribution)


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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     16.698 ±    0.487  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.251 ±    0.006  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.483 ±    0.147  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.720 ±    0.193  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.967 ±    0.143  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    373.959 ±   21.825  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   1950.750 ±  131.022  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    417.226 ±   12.705  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    876.832 ±   19.773  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.079 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.135 ±    0.034  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.460 ±    0.015  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.193 ±    0.024  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     18.533 ±    4.448  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  47645.996 ± 1293.626  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   3520.082 ± 1752.124  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   4951.797 ±  181.845  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6      2.885 ±    0.052  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     14.840 ±    0.191  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     46.866 ±    1.166  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      7.948 ±    0.232  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     19.767 ±    0.116  ms/op

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
Iteration   1: 47399.431 ms/op
Iteration   2: 44886.019 ms/op


Result "com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark.separationControlTransient":
  46142.725 ms/op


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

# Run progress: 14.29% complete, ETA 00:09:15
# Fork: 1 of 1
Iteration   1: 224764.159 ms/op
Iteration   2: 218978.734 ms/op


Result "com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark.processSurrogateDataset":
  221871.447 ms/op


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

# Run progress: 28.57% complete, ETA 00:22:21
# Fork: 1 of 1
Iteration   1: 23239.567 ms/op
Iteration   2: 20092.235 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  21665.901 ms/op


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

# Run progress: 42.86% complete, ETA 00:12:54
# Fork: 1 of 1
Iteration   1: 23309.990 ms/op
Iteration   2: 20044.675 ms/op


Result "com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep":
  21677.332 ms/op


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

# Run progress: 57.14% complete, ETA 00:07:49
# Fork: 1 of 1
Iteration   1: 21611.310 ms/op
Iteration   2: 18398.634 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.olgaThreePhaseTable":
  20004.972 ms/op


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

# Run progress: 71.43% complete, ETA 00:04:26
# Fork: 1 of 1
Iteration   1: 27201.454 ms/op
Iteration   2: 22185.723 ms/op


Result "com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark.tpPropertyGrid":
  24693.589 ms/op


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

# Run progress: 85.71% complete, ETA 00:01:59
# Fork: 1 of 1
Iteration   1: 55611.839 ms/op
Iteration   2: 53854.215 ms/op


Result "com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp":
  54733.027 ms/op


# Run complete. Total time: 00:13:45

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
DynamicProcessBenchmark.separationControlTransient        N/A  avgt    2   46142.725          ms/op
MlTrainingDataBenchmark.processSurrogateDataset           N/A  avgt    2  221871.447          ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep        SRK  avgt    2   21665.901          ms/op
ProcessSimulationBenchmark.gasProcessingTrainSweep         PR  avgt    2   21677.332          ms/op
PropertyTableBenchmark.olgaThreePhaseTable                N/A  avgt    2   20004.972          ms/op
PropertyTableBenchmark.tpPropertyGrid                     N/A  avgt    2   24693.589          ms/op
TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp    N/A  avgt    2   54733.027          ms/op

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
TEG full process: 7325 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5447778e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018746111, composition error=0.0030123554
TEG recycle lean TEG resycle: solved=true, flow error=3.9968029e-14, composition error=4.7067410e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.364 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.071 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.LongRunSmokeTest
olgaThreePhaseTable[small]                                     16296.0  (488 ms)
tpPropertyGrid[small]                                          103.077  (306 ms)
separationControlTransient[small]                              158.784  (1545 ms)
processSimulationSweep[SRK, small]                             380.828  (1883 ms)
processSimulationSweep[PR, small]                              382.559  (2142 ms)
processSurrogateDataset[small]                                 1419.23  (3759 ms)
twoFluidTransient[small]                                       1096.75  (381 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.10 s -- in com.equinor.neqsim.benchmark.LongRunSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.083 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 401265 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 401.3 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (3 ms)
tpFlashWellFluidSrk                                            83.6406  (15 ms)
tpFlashWellFluidPr                                             83.6541  (17 ms)
tpFlashWellFluidWithProperties                                 5445.37  (19 ms)
phAndPsFlashWellFluid                                          2459.22  (29 ms)
Nov 14, 2026 10:12:47 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 14, 2026 10:12:47 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00976303  (194 ms)
gasOilSurfaceTension[Simple Gradient Theory]                0.00976303  (81 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (252 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (34 ms)
saturationPointsWellFluid                                      1601.32  (117 ms)
singlePhaseGasPipelineSteadyState                              121.629  (665 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98718  (1312 ms)
levenbergMarquardtAntoine                                      1837.31  (7 ms)
levenbergMarquardtDoubleExponential                            5.57177  (4 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (7 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.382 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  07:10 min
[INFO] Finished at: 2026-11-14T22:12:50Z
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
TEG full process: 7072 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5447778e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018746111, composition error=0.0030123554
TEG recycle lean TEG resycle: solved=true, flow error=3.9968029e-14, composition error=4.7067410e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.106 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.804 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.LongRunSmokeTest
olgaThreePhaseTable[small]                                     16296.0  (480 ms)
tpPropertyGrid[small]                                          103.077  (391 ms)
separationControlTransient[small]                              158.784  (2232 ms)
processSimulationSweep[SRK, small]                             380.828  (1707 ms)
processSimulationSweep[PR, small]                              382.559  (1862 ms)
processSurrogateDataset[small]                                 1419.23  (3716 ms)
twoFluidTransient[small]                                       688.187  (360 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.60 s -- in com.equinor.neqsim.benchmark.LongRunSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.029 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 404253 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 404.3 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (2 ms)
tpFlashWellFluidSrk                                            83.6406  (29 ms)
tpFlashWellFluidPr                                             83.6541  (15 ms)
tpFlashWellFluidWithProperties                                 5445.37  (20 ms)
phAndPsFlashWellFluid                                          2459.22  (36 ms)
Nov 14, 2026 10:59:45 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 14, 2026 10:59:45 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00976303  (149 ms)
gasOilSurfaceTension[Simple Gradient Theory]                0.00976303  (76 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (201 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (32 ms)
saturationPointsWellFluid                                      1601.32  (128 ms)
singlePhaseGasPipelineSteadyState                              121.629  (680 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98718  (1283 ms)
levenbergMarquardtAntoine                                      1837.31  (6 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (9 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.137 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  07:15 min
[INFO] Finished at: 2026-11-14T22:59:48Z
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
Benchmark suite revision: `B15-c61b4669e2ef`

**Overall: 1.03% faster** (geometric mean of 30 cases). 0 significantly faster, 0 significantly slower (non-overlapping 99.9% confidence intervals).

30 benchmark/parameter cases: 11 lower, 19 higher, 0 unchanged mean timings.

### By area

Positive gain means faster (geometric-mean time reduction).

| Area | Cases | Gain | Significantly faster / slower |
| --- | ---: | ---: | ---: |
| flash | 7 | -0.46% | 0 / 0 |
| fluidmechanics | 2 | -0.84% | 0 / 0 |
| longrun | 7 | -1.27% | 0 / 0 |
| numerics | 4 | -0.51% | 0 / 0 |
| process | 4 | +2.02% | 0 / 0 |
| thermo | 6 | +6.22% | 0 / 0 |

### Cases

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000348378 | 0.00023595 | -32.27% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 20.1513 | 18.5333 | -8.03% | Overlapping CIs |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=SRK) | 20084.2 | 21665.9 | +7.88% | CI unavailable |
| longrun.PropertyTableBenchmark.tpPropertyGrid | 24008.3 | 24693.6 | +2.85% | CI unavailable |
| flash.TPflash_UMR.testFlash_UMR | 1914.14 | 1950.75 | +1.91% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 3573.66 | 3520.08 | -1.50% | Overlapping CIs |
| longrun.MlTrainingDataBenchmark.processSurrogateDataset | 225030 | 221871 | -1.40% | CI unavailable |
| process.TEGprocess.testTEGprocess | 4884.13 | 4951.8 | +1.39% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 412.187 | 417.226 | +1.22% | Overlapping CIs |
| longrun.ProcessSimulationBenchmark.gasProcessingTrainSweep (eos=PR) | 21911.8 | 21677.3 | -1.07% | CI unavailable |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread. Long-running `longrun` cases (30 s to 5 min per operation): one fork, no warmup and two measured operations, so their confidence intervals are wide.

```
