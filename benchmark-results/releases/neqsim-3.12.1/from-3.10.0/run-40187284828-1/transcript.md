# NeqSim 3.12.1 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.10.0 |
| Current | 3.12.1 |
| Source commit | `1b54b050700acdef09e06a92cecd857c0aecd93a` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40187284828) |
| Status | incomplete |


## benchmark-revision.json

```text
{
  "number": 13,
  "label": "B13-b048238496c5",
  "fingerprint": "b048238496c557d6de94a734de7ddbbf0dec223af649ff65f992cfe1488dfd3c",
  "source_commit": "1b54b050700acdef09e06a92cecd857c0aecd93a",
  "updated_at": "2026-10-22",
  "uncommitted_changes": false,
  "scopes": [
    "src/main/java",
    "src/main/resources",
    ".github/scripts/run-benchmark-timings.sh"
  ],
  "files": {
    ".github/scripts/run-benchmark-timings.sh": "7e6cd1f5a726e6750792500632eac90d1fc63391c2ba28ca9947d7bd14c8ec03",
    "src/main/java/com/equinor/neqsim/benchmark/flash/FlashBenchmark.java": "16e923506b507f652653ce4709a31c2ffd57aca63da4facbb1acb5a408df33c5",
    "src/main/java/com/equinor/neqsim/benchmark/flash/TPflash.java": "5dfd00a3bd4cb4b497da1d3b47f2303f351c3bc570b61b528765919b920031ab",
    "src/main/java/com/equinor/neqsim/benchmark/flash/TPflash_UMR.java": "925cc33c89f7dad0ec3ba4bf2567d283f80790fc465c963b45f4a8202536773e",
    "src/main/java/com/equinor/neqsim/benchmark/fluidmechanics/PipeFlowSolverBenchmark.java": "76fdf4910236068de1c14af59b07a4fa1c33995047d29f1d320549dc36f08cab",
    "src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java": "c65dc1394ea88648f719e2eb2259a0c496fa188221d96ccb0fb7f039b2a06dc7",
    "src/main/java/com/equinor/neqsim/benchmark/process/Compressor_Benchmark.java": "4c5fd06e5e1e1888b1fc7fe9accef39262ccf310f028c7741a1d43d54dcfdd50",
    "src/main/java/com/equinor/neqsim/benchmark/process/LargeProcessModelBenchmark.java": "43aed65eaf92203243dfb1a06204f28466c06b7c6e1b93f532806f806f94ccd0",
    "src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java": "ca06f2817fda0161c6e416b61c50e3ffb65999830f1d693dad57384b66bf03a4",
    "src/main/java/com/equinor/neqsim/benchmark/process/TEGprocess.java": "2e3be31a0adf16c5f7ae5c6854babfd8df641e2e9d241ef8467ff16e1de35602",
    "src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java": "8774baa0bf170ed6646a4f67b67cb9d9259b8b765202417a6f16bd0892b3d669",
    "src/main/java/com/equinor/neqsim/benchmark/thermo/PhaseEnvelopeBenchmark.java": "7abf7ec3acdca4a3c1599fa3ee33670b708855c207103f16dc8d3e6bb83ca78c",
    "src/main/java/com/equinor/neqsim/benchmark/util/BenchmarkFluids.java": "87ea44ebc643643e5acffedeadb95d6bba553daaed4a026d076f38646c77fdb0",
    "src/main/resources/fluids/platform_feed.e300": "32f4eb0253f888fa2c96a36fe76d26e085dda3308d5a80b11ce9899993aceb7b"
  },
  "changes": {
    "added": [
      "src/main/java/com/equinor/neqsim/benchmark/process/LargeProcessModelBenchmark.java",
      "src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java"
    ],
    "modified": [
      "src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java"
    ],
    "deleted": []
  }
}

```


## benchmark-environment.txt

```text
openjdk version "21.0.12.1" 2026-08-18 LTS
OpenJDK Runtime Environment Temurin-21.0.12.1+1 (build 21.0.12.1+1-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.12.1+1 (build 21.0.12.1+1-LTS, mixed mode, sharing)
Apache Maven 3.9.15 (98b2cdbfdb5f1ac8781f537ea9acccaed7922349)
Maven home: /usr/share/apache-maven-3.9.15
Java version: 21.0.12.1, vendor: Eclipse Adoptium, runtime: /usr/lib/jvm/temurin-21-jdk-amd64
Default locale: en, platform encoding: UTF-8
OS name: "linux", version: "7.0.0-1017-azure", arch: "amd64", family: "unix"
Linux runnervmr9t6g 7.0.0-1017-azure #17-Ubuntu SMP PREEMPT Thu Sep 24 15:54:51 UTC 2026 x86_64 GNU/Linux
Architecture:                            x86_64
CPU op-mode(s):                          32-bit, 64-bit
Address sizes:                           48 bits physical, 48 bits virtual
Byte Order:                              Little Endian
CPU(s):                                  2
On-line CPU(s) list:                     0,1
Vendor ID:                               AuthenticAMD
Model name:                              AMD EPYC 9V74 80-Core Processor
CPU family:                              25
Model:                                   17
Thread(s) per core:                      2
Core(s) per socket:                      1
Socket(s):                               1
Stepping:                                1
BogoMIPS:                                5192.29
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid avx512f avx512dq rdseed adx smap avx512ifma clflushopt clwb avx512cd sha_ni avx512bw avx512vl xsaveopt xsavec xgetbv1 xsaves user_shstk avx512_bf16 clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload avx512vbmi umip avx512_vbmi2 gfni vaes vpclmulqdq avx512_vnni avx512_bitalg avx512_vpopcntdq rdpid fsrm
Virtualization:                          AMD-V
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               32 KiB (1 instance)
L1i cache:                               32 KiB (1 instance)
L2 cache:                                1 MiB (1 instance)
L3 cache:                                32 MiB (1 instance)
NUMA node(s):                            1
NUMA node0 CPU(s):                       0,1
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
| baseline | 3.10.0 | passed |
| current | 3.12.1 | failed (exit 1) |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.10.0",
  "version": "3.10.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.10.0/neqsim-3.10.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.12.1",
  "version": "3.12.1",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.12.1/neqsim-3.12.1.jar",
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
[INFO] Total time:  8.033 s
[INFO] Finished at: 2026-10-25T11:04:13Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.10.0 (neqsim-3.10.0.jar); requested: 3.10.0
$ mvn clean verify -Dneqsim.version=3.10.0
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
[INFO] Compiling 12 source files with javac [debug release 17] to target/classes
[INFO] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java: Some input files use or override a deprecated API.
[INFO] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- resources:3.4.0:testResources (default-testResources) @ neqsim-benchmark ---
[INFO] skip non existing resourceDirectory /home/runner/work/_temp/benchmark-project/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ neqsim-benchmark ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 5 source files with javac [debug release 17] to target/test-classes
[INFO] 
[INFO] --- surefire:3.5.2:test (default-test) @ neqsim-benchmark ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.480 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (32 ms)
tpFlashWellFluidSrk                                            83.6406  (88 ms)
tpFlashWellFluidPr                                             83.6541  (50 ms)
tpFlashWellFluidWithProperties                                 5445.46  (116 ms)
phAndPsFlashWellFluid                                          2459.23  (87 ms)
Oct 25, 2026 11:04:28 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 25, 2026 11:04:28 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (473 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (251 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (47 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (82 ms)
saturationPointsWellFluid                                      1601.32  (99 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1083 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1332 ms)
levenbergMarquardtAntoine                                      1837.31  (10 ms)
levenbergMarquardtDoubleExponential                            5.57177  (8 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (24 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.751 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 387025 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 97 / 150
Boundary streams tracked: 24
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    2.42e-05 (tolerance: 1.00e-04) OK
  Temperature:  5.77e-06 (tolerance: 1.00e-04) OK
  Pressure:     2.97e-05 (tolerance: 1.00e-04) OK

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED

feed 5489240.1, gas 264797.2 + 378188.1, oil 1995476.8 + 2850774.2, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.450 MSm3/d, KA27841 A 102.5 bara, pipeline outlet 50.8 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 387.0 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.221 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 18692 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027173922/1.5453817e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00013184845, composition error=0.0021041876
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=9.7288502e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 18.70 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- jar:2.4:jar (default-jar) @ neqsim-benchmark ---
[INFO] Building jar: /home/runner/work/_temp/benchmark-project/target/neqsim-benchmark-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- shade:3.2.1:shade (default) @ neqsim-benchmark ---
[INFO] Including com.equinor.neqsim:neqsim:jar:3.10.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.10.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  07:18 min
[INFO] Finished at: 2026-10-25T11:11:33Z
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
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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
# Warmup Iteration   1: 26.884 ms/op
# Warmup Iteration   2: 16.671 ms/op
Iteration   1: 16.729 ms/op
Iteration   2: 16.531 ms/op
Iteration   3: 16.532 ms/op

# Run progress: 2.17% complete, ETA 00:08:58
# Fork: 2 of 2
# Warmup Iteration   1: 27.521 ms/op
# Warmup Iteration   2: 17.023 ms/op
Iteration   1: 17.037 ms/op
Iteration   2: 16.765 ms/op
Iteration   3: 17.207 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  16.800 ±(99.9%) 0.765 ms/op [Average]
  (min, avg, max) = (16.531, 16.800, 17.207), stdev = 0.273
  CI (99.9%): [16.035, 17.566] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas

# Run progress: 4.35% complete, ETA 00:08:45
# Fork: 1 of 2
# Warmup Iteration   1: 3.036 ms/op
# Warmup Iteration   2: 1.613 ms/op
Iteration   1: 1.209 ms/op
Iteration   2: 1.204 ms/op
Iteration   3: 1.203 ms/op

# Run progress: 6.52% complete, ETA 00:08:33
# Fork: 2 of 2
# Warmup Iteration   1: 2.904 ms/op
# Warmup Iteration   2: 1.881 ms/op
Iteration   1: 1.212 ms/op
Iteration   2: 1.226 ms/op
Iteration   3: 1.205 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.210 ±(99.9%) 0.025 ms/op [Average]
  (min, avg, max) = (1.203, 1.210, 1.226), stdev = 0.009
  CI (99.9%): [1.185, 1.234] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr

# Run progress: 8.70% complete, ETA 00:08:20
# Fork: 1 of 2
# Warmup Iteration   1: 10.852 ms/op
# Warmup Iteration   2: 6.069 ms/op
Iteration   1: 5.293 ms/op
Iteration   2: 5.286 ms/op
Iteration   3: 5.338 ms/op

# Run progress: 10.87% complete, ETA 00:08:07
# Fork: 2 of 2
# Warmup Iteration   1: 12.671 ms/op
# Warmup Iteration   2: 6.770 ms/op
Iteration   1: 5.363 ms/op
Iteration   2: 5.336 ms/op
Iteration   3: 5.499 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  5.353 ±(99.9%) 0.217 ms/op [Average]
  (min, avg, max) = (5.286, 5.353, 5.499), stdev = 0.077
  CI (99.9%): [5.136, 5.570] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk

# Run progress: 13.04% complete, ETA 00:07:55
# Fork: 1 of 2
# Warmup Iteration   1: 10.685 ms/op
# Warmup Iteration   2: 6.724 ms/op
Iteration   1: 5.175 ms/op
Iteration   2: 5.194 ms/op
Iteration   3: 5.333 ms/op

# Run progress: 15.22% complete, ETA 00:07:44
# Fork: 2 of 2
# Warmup Iteration   1: 11.391 ms/op
# Warmup Iteration   2: 7.086 ms/op
Iteration   1: 5.239 ms/op
Iteration   2: 5.236 ms/op
Iteration   3: 5.369 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  5.258 ±(99.9%) 0.216 ms/op [Average]
  (min, avg, max) = (5.175, 5.258, 5.369), stdev = 0.077
  CI (99.9%): [5.041, 5.474] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties

# Run progress: 17.39% complete, ETA 00:07:32
# Fork: 1 of 2
# Warmup Iteration   1: 20.912 ms/op
# Warmup Iteration   2: 13.357 ms/op
Iteration   1: 9.543 ms/op
Iteration   2: 9.335 ms/op
Iteration   3: 9.326 ms/op

# Run progress: 19.57% complete, ETA 00:07:20
# Fork: 2 of 2
# Warmup Iteration   1: 25.379 ms/op
# Warmup Iteration   2: 13.991 ms/op
Iteration   1: 9.911 ms/op
Iteration   2: 9.590 ms/op
Iteration   3: 9.574 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  9.546 ±(99.9%) 0.600 ms/op [Average]
  (min, avg, max) = (9.326, 9.546, 9.911), stdev = 0.214
  CI (99.9%): [8.947, 10.146] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.TPflash.testFlash

# Run progress: 21.74% complete, ETA 00:07:08
# Fork: 1 of 2
# Warmup Iteration   1: 2205.253 ms/op
# Warmup Iteration   2: 699.453 ms/op
Iteration   1: 436.653 ms/op
Iteration   2: 362.702 ms/op
Iteration   3: 353.592 ms/op

# Run progress: 23.91% complete, ETA 00:06:53
# Fork: 2 of 2
# Warmup Iteration   1: 2266.221 ms/op
# Warmup Iteration   2: 628.093 ms/op
Iteration   1: 384.240 ms/op
Iteration   2: 360.986 ms/op
Iteration   3: 326.725 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  370.816 ±(99.9%) 104.305 ms/op [Average]
  (min, avg, max) = (326.725, 370.816, 436.653), stdev = 37.196
  CI (99.9%): [266.511, 475.121] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR

# Run progress: 26.09% complete, ETA 00:06:42
# Fork: 1 of 2
# Warmup Iteration   1: 2933.132 ms/op
# Warmup Iteration   2: 1241.691 ms/op
Iteration   1: 891.252 ms/op
Iteration   2: 772.135 ms/op
Iteration   3: 762.463 ms/op

# Run progress: 28.26% complete, ETA 00:06:33
# Fork: 2 of 2
# Warmup Iteration   1: 2979.419 ms/op
# Warmup Iteration   2: 1205.212 ms/op
Iteration   1: 860.741 ms/op
Iteration   2: 769.041 ms/op
Iteration   3: 793.961 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  808.265 ±(99.9%) 152.496 ms/op [Average]
  (min, avg, max) = (762.463, 808.265, 891.252), stdev = 54.382
  CI (99.9%): [655.769, 960.762] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState

# Run progress: 30.43% complete, ETA 00:06:23
# Fork: 1 of 2
# Warmup Iteration   1: 1219.072 ms/op
# Warmup Iteration   2: 449.282 ms/op
Iteration   1: 416.869 ms/op
Iteration   2: 405.278 ms/op
Iteration   3: 403.744 ms/op

# Run progress: 32.61% complete, ETA 00:06:09
# Fork: 2 of 2
# Warmup Iteration   1: 1233.416 ms/op
# Warmup Iteration   2: 446.096 ms/op
Iteration   1: 415.025 ms/op
Iteration   2: 409.088 ms/op
Iteration   3: 403.857 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  408.977 ±(99.9%) 16.165 ms/op [Average]
  (min, avg, max) = (403.744, 408.977, 416.869), stdev = 5.765
  CI (99.9%): [392.812, 425.142] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState

# Run progress: 34.78% complete, ETA 00:05:56
# Fork: 1 of 2
# Warmup Iteration   1: 2483.188 ms/op
# Warmup Iteration   2: 1036.189 ms/op
Iteration   1: 977.548 ms/op
Iteration   2: 910.632 ms/op
Iteration   3: 931.965 ms/op

# Run progress: 36.96% complete, ETA 00:05:46
# Fork: 2 of 2
# Warmup Iteration   1: 2539.851 ms/op
# Warmup Iteration   2: 1071.258 ms/op
Iteration   1: 1028.181 ms/op
Iteration   2: 927.249 ms/op
Iteration   3: 927.621 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  950.533 ±(99.9%) 123.913 ms/op [Average]
  (min, avg, max) = (910.632, 950.533, 1028.181), stdev = 44.189
  CI (99.9%): [826.620, 1074.445] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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

# Run progress: 39.13% complete, ETA 00:05:35
# Fork: 1 of 2
# Warmup Iteration   1: 0.346 ms/op
# Warmup Iteration   2: 0.147 ms/op
Iteration   1: 0.141 ms/op
Iteration   2: 0.141 ms/op
Iteration   3: 0.141 ms/op

# Run progress: 41.30% complete, ETA 00:05:21
# Fork: 2 of 2
# Warmup Iteration   1: 0.365 ms/op
# Warmup Iteration   2: 0.148 ms/op
Iteration   1: 0.141 ms/op
Iteration   2: 0.141 ms/op
Iteration   3: 0.141 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.141 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.141, 0.141, 0.141), stdev = 0.001
  CI (99.9%): [0.140, 0.141] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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

# Run progress: 43.48% complete, ETA 00:05:07
# Fork: 1 of 2
# Warmup Iteration   1: 20.270 ms/op
# Warmup Iteration   2: 11.955 ms/op
Iteration   1: 12.057 ms/op
Iteration   2: 11.812 ms/op
Iteration   3: 11.715 ms/op

# Run progress: 45.65% complete, ETA 00:04:53
# Fork: 2 of 2
# Warmup Iteration   1: 23.143 ms/op
# Warmup Iteration   2: 11.923 ms/op
Iteration   1: 12.063 ms/op
Iteration   2: 11.702 ms/op
Iteration   3: 11.764 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  11.852 ±(99.9%) 0.465 ms/op [Average]
  (min, avg, max) = (11.702, 11.852, 12.063), stdev = 0.166
  CI (99.9%): [11.387, 12.317] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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
# Warmup Iteration   1: 0.816 ms/op
# Warmup Iteration   2: 0.465 ms/op
Iteration   1: 0.460 ms/op
Iteration   2: 0.476 ms/op
Iteration   3: 0.459 ms/op

# Run progress: 50.00% complete, ETA 00:04:27
# Fork: 2 of 2
# Warmup Iteration   1: 0.835 ms/op
# Warmup Iteration   2: 0.467 ms/op
Iteration   1: 0.459 ms/op
Iteration   2: 0.461 ms/op
Iteration   3: 0.460 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.462 ±(99.9%) 0.019 ms/op [Average]
  (min, avg, max) = (0.459, 0.462, 0.476), stdev = 0.007
  CI (99.9%): [0.444, 0.481] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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
# Warmup Iteration   1: 1.938 ms/op
# Warmup Iteration   2: 1.287 ms/op
Iteration   1: 1.190 ms/op
Iteration   2: 1.191 ms/op
Iteration   3: 1.188 ms/op

# Run progress: 54.35% complete, ETA 00:04:01
# Fork: 2 of 2
# Warmup Iteration   1: 2.118 ms/op
# Warmup Iteration   2: 1.300 ms/op
Iteration   1: 1.192 ms/op
Iteration   2: 1.190 ms/op
Iteration   3: 1.185 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.189 ±(99.9%) 0.007 ms/op [Average]
  (min, avg, max) = (1.185, 1.189, 1.192), stdev = 0.003
  CI (99.9%): [1.182, 1.197] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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
# Warmup Iteration   1: 205.548 ms/op
# Warmup Iteration   2: 38.770 ms/op
Iteration   1: 29.147 ms/op
Iteration   2: 25.457 ms/op
Iteration   3: 24.218 ms/op

# Run progress: 58.70% complete, ETA 00:03:37
# Fork: 2 of 2
# Warmup Iteration   1: 201.831 ms/op
# Warmup Iteration   2: 36.740 ms/op
Iteration   1: 27.661 ms/op
Iteration   2: 26.010 ms/op
Iteration   3: 24.613 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  26.184 ±(99.9%) 5.299 ms/op [Average]
  (min, avg, max) = (24.218, 26.184, 29.147), stdev = 1.890
  CI (99.9%): [20.886, 31.483] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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
# Warmup Iteration   1: 34333.136 ms/op
# Warmup Iteration   2: 29575.237 ms/op
Iteration   1: 28715.813 ms/op
Iteration   2: 28623.043 ms/op
Iteration   3: 28658.599 ms/op

# Run progress: 63.04% complete, ETA 00:04:35
# Fork: 2 of 2
# Warmup Iteration   1: 34879.645 ms/op
# Warmup Iteration   2: 30349.320 ms/op
Iteration   1: 30185.038 ms/op
Iteration   2: 29800.767 ms/op
Iteration   3: 29436.991 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  29236.708 ±(99.9%) 1876.809 ms/op [Average]
  (min, avg, max) = (28623.043, 29236.708, 30185.038), stdev = 669.288
  CI (99.9%): [27359.899, 31113.517] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange

# Run progress: 65.22% complete, ETA 00:05:34
# Fork: 1 of 2
# Warmup Iteration   1: 8436.812 ms/op
# Warmup Iteration   2: 8178.077 ms/op
Iteration   1: 8490.409 ms/op
Iteration   2: 8371.179 ms/op
Iteration   3: 8262.194 ms/op

# Run progress: 67.39% complete, ETA 00:08:18
# Fork: 2 of 2
# Warmup Iteration   1: 7916.628 ms/op
# Warmup Iteration   2: 7644.594 ms/op
Iteration   1: 7931.179 ms/op
Iteration   2: 7803.845 ms/op
Iteration   3: 7768.692 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  8104.583 ±(99.9%) 867.135 ms/op [Average]
  (min, avg, max) = (7768.692, 8104.583, 8490.409), stdev = 309.229
  CI (99.9%): [7237.448, 8971.718] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess

# Run progress: 69.57% complete, ETA 00:10:15
# Fork: 1 of 2
# Warmup Iteration   1: 19309.453 ms/op
# Warmup Iteration   2: 13976.853 ms/op
Iteration   1: 13336.777 ms/op
Iteration   2: 13352.533 ms/op
Iteration   3: 13201.379 ms/op

# Run progress: 71.74% complete, ETA 00:09:43
# Fork: 2 of 2
# Warmup Iteration   1: 18845.837 ms/op
# Warmup Iteration   2: 14193.840 ms/op
Iteration   1: 14428.880 ms/op
Iteration   2: 13081.865 ms/op
Iteration   3: 13252.591 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  13442.338 ±(99.9%) 1383.166 ms/op [Average]
  (min, avg, max) = (13081.865, 13442.338, 14428.880), stdev = 493.250
  CI (99.9%): [12059.172, 14825.503] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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

# Run progress: 73.91% complete, ETA 00:09:08
# Fork: 1 of 2
# Warmup Iteration   1: Oct 25, 2026 11:37:30 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 25, 2026 11:37:30 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
95.926 ms/op
# Warmup Iteration   2: 45.140 ms/op
Iteration   1: 45.335 ms/op
Iteration   2: 44.407 ms/op
Iteration   3: 44.040 ms/op

# Run progress: 76.09% complete, ETA 00:08:12
# Fork: 2 of 2
# Warmup Iteration   1: Oct 25, 2026 11:37:42 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 25, 2026 11:37:42 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
83.929 ms/op
# Warmup Iteration   2: 46.209 ms/op
Iteration   1: 44.587 ms/op
Iteration   2: 44.183 ms/op
Iteration   3: 43.964 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  44.419 ±(99.9%) 1.416 ms/op [Average]
  (min, avg, max) = (43.964, 44.419, 45.335), stdev = 0.505
  CI (99.9%): [43.004, 45.835] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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

# Run progress: 78.26% complete, ETA 00:07:18
# Fork: 1 of 2
# Warmup Iteration   1: 155.324 ms/op
# Warmup Iteration   2: 72.420 ms/op
Iteration   1: 56.492 ms/op
Iteration   2: 55.855 ms/op
Iteration   3: 55.698 ms/op

# Run progress: 80.43% complete, ETA 00:06:26
# Fork: 2 of 2
# Warmup Iteration   1: 112.392 ms/op
# Warmup Iteration   2: 63.222 ms/op
Iteration   1: 59.176 ms/op
Iteration   2: 59.193 ms/op
Iteration   3: 59.699 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  57.686 ±(99.9%) 5.212 ms/op [Average]
  (min, avg, max) = (55.698, 57.686, 59.699), stdev = 1.859
  CI (99.9%): [52.473, 62.898] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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

# Run progress: 82.61% complete, ETA 00:05:37
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:49
# Fork: 2 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  ≈ 10⁻⁴ ms/op


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate

# Run progress: 86.96% complete, ETA 00:04:03
# Fork: 1 of 2
# Warmup Iteration   1: 1.002 ms/op
# Warmup Iteration   2: 0.579 ms/op
Iteration   1: 0.540 ms/op
Iteration   2: 0.533 ms/op
Iteration   3: 0.524 ms/op

# Run progress: 89.13% complete, ETA 00:03:19
# Fork: 2 of 2
# Warmup Iteration   1: 0.994 ms/op
# Warmup Iteration   2: 0.571 ms/op
Iteration   1: 0.563 ms/op
Iteration   2: 0.536 ms/op
Iteration   3: 0.525 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.537 ±(99.9%) 0.040 ms/op [Average]
  (min, avg, max) = (0.524, 0.537, 0.563), stdev = 0.014
  CI (99.9%): [0.497, 0.576] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid

# Run progress: 91.30% complete, ETA 00:02:36
# Fork: 1 of 2
# Warmup Iteration   1: 19.129 ms/op
# Warmup Iteration   2: 10.838 ms/op
Iteration   1: 10.225 ms/op
Iteration   2: 10.562 ms/op
Iteration   3: 9.887 ms/op

# Run progress: 93.48% complete, ETA 00:01:55
# Fork: 2 of 2
# Warmup Iteration   1: 21.839 ms/op
# Warmup Iteration   2: 16.030 ms/op
Iteration   1: 11.659 ms/op
Iteration   2: 12.383 ms/op
Iteration   3: 11.660 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  11.063 ±(99.9%) 2.745 ms/op [Average]
  (min, avg, max) = (9.887, 11.063, 12.383), stdev = 0.979
  CI (99.9%): [8.318, 13.807] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid

# Run progress: 95.65% complete, ETA 00:01:15
# Fork: 1 of 2
# Warmup Iteration   1: 34.875 ms/op
# Warmup Iteration   2: 25.633 ms/op
Iteration   1: 25.374 ms/op
Iteration   2: 25.535 ms/op
Iteration   3: 25.930 ms/op

# Run progress: 97.83% complete, ETA 00:00:37
# Fork: 2 of 2
# Warmup Iteration   1: 36.626 ms/op
# Warmup Iteration   2: 25.434 ms/op
Iteration   1: 25.353 ms/op
Iteration   2: 25.306 ms/op
Iteration   3: 25.293 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  25.465 ±(99.9%) 0.683 ms/op [Average]
  (min, avg, max) = (25.293, 25.465, 25.930), stdev = 0.244
  CI (99.9%): [24.782, 26.148] (assumes normal distribution)


# Run complete. Total time: 00:28:14

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     16.800 ±    0.765  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.210 ±    0.025  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      5.353 ±    0.217  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      5.258 ±    0.216  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      9.546 ±    0.600  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    370.816 ±  104.305  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    808.265 ±  152.496  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    408.977 ±   16.165  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    950.533 ±  123.913  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.141 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6     11.852 ±    0.465  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.462 ±    0.019  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.189 ±    0.007  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     26.184 ±    5.299  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  29236.708 ± 1876.809  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   8104.583 ±  867.135  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  13442.338 ± 1383.166  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     44.419 ±    1.416  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     57.686 ±    5.212  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.537 ±    0.040  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     11.063 ±    2.745  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     25.465 ±    0.683  ms/op

Benchmark result is saved to /home/runner/work/_temp/baseline-benchmarks.json

```


## current-build-exit-code.txt

```text
1

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
[INFO] Total time:  3.164 s
[INFO] Finished at: 2026-10-25T11:39:52Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.12.1 (neqsim-3.12.1.jar); requested: 3.12.1
$ mvn clean verify -Dneqsim.version=3.12.1
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
[INFO] Compiling 12 source files with javac [debug release 17] to target/classes
[INFO] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java: Some input files use or override a deprecated API.
[INFO] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- resources:3.4.0:testResources (default-testResources) @ neqsim-benchmark ---
[INFO] skip non existing resourceDirectory /home/runner/work/_temp/benchmark-project/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ neqsim-benchmark ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 5 source files with javac [debug release 17] to target/test-classes
[INFO] 
[INFO] --- surefire:3.5.2:test (default-test) @ neqsim-benchmark ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.430 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (33 ms)
tpFlashWellFluidSrk                                            83.6406  (101 ms)
tpFlashWellFluidPr                                             83.6541  (58 ms)
tpFlashWellFluidWithProperties                                 5445.46  (113 ms)
phAndPsFlashWellFluid                                          2459.23  (79 ms)
Oct 25, 2026 11:40:01 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 25, 2026 11:40:01 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (388 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (254 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (35 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (82 ms)
saturationPointsWellFluid                                      1601.32  (115 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1181 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1240 ms)
levenbergMarquardtAntoine                                      1837.31  (9 ms)
levenbergMarquardtDoubleExponential                            5.57177  (7 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (13 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.530 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 2189602 ms
=== ProcessModel Convergence Summary ===
Converged: NO
Iterations: 150 / 150
Boundary streams tracked: 26
Boundary values converged: NO
All process areas solved: YES

Final Errors (relative):
  Flow rate:    5.72e-02 (tolerance: 1.00e-04) NOT CONVERGED
  Temperature:  9.87e-03 (tolerance: 1.00e-04) NOT CONVERGED
  Pressure:     8.48e-03 (tolerance: 1.00e-04) NOT CONVERGED

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED

[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 2190 s <<< FAILURE! -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[ERROR] com.equinor.neqsim.benchmark.OilGasPlatformModelTest.platformModelSolves -- Time elapsed: 2190 s <<< FAILURE!
org.opentest4j.AssertionFailedError: Full platform did not converge ==> expected: <true> but was: <false>
	at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
	at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)
	at org.junit.jupiter.api.AssertTrue.failNotTrue(AssertTrue.java:63)
	at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:36)
	at org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:214)
	at com.equinor.neqsim.benchmark.OilGasPlatformModelTest.platformModelSolves(OilGasPlatformModelTest.java:28)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)

[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.926 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 19782 ms, solved=true, gas=318849.57 kg/hr, water in/out=0.00027173922/1.5391418e-05
TEG recycle stripping gas recirc: solved=true, flow error=9.9232214e-05, composition error=0.0015792566
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=0.00031100847
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 19.79 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Failures: 
[ERROR]   OilGasPlatformModelTest.platformModelSolves:28 Full platform did not converge ==> expected: <true> but was: <false>
[INFO] 
[ERROR] Tests run: 10, Failures: 1, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  37:04 min
[INFO] Finished at: 2026-10-25T12:16:58Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.5.2:test (default-test) on project neqsim-benchmark: There are test failures.
[ERROR] 
[ERROR] See /home/runner/work/_temp/benchmark-project/target/surefire-reports for the individual test results.
[ERROR] See dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```


## current-benchmarks.txt

Not produced; the run did not reach this stage.


## current-benchmarks.log

Not produced; the run did not reach this stage.


## benchmark-timing-summary.md

```text
## Maven Build Results

| Variant | NeqSim | Maven build |
| --- | --- | --- |
| baseline | 3.10.0 | passed |
| current | 3.12.1 | failed (exit 1) |

Incomplete timing comparison: Maven build failures were recorded. No overall gain is available.

```
