# NeqSim 3.15.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.14.0 |
| Current | 3.15.0 |
| Source commit | `1bb527eda8ddf9193b2b05dd7e777966c06f8e06` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40789848916) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "1bb527eda8ddf9193b2b05dd7e777966c06f8e06",
  "updated_at": "2026-10-28",
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
    "src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java": "c0419aaf968d5a8c4db946a7c574feb2c89168a2047f10fd207668d78479b501",
    "src/main/java/com/equinor/neqsim/benchmark/process/TEGprocess.java": "2e3be31a0adf16c5f7ae5c6854babfd8df641e2e9d241ef8467ff16e1de35602",
    "src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java": "8774baa0bf170ed6646a4f67b67cb9d9259b8b765202417a6f16bd0892b3d669",
    "src/main/java/com/equinor/neqsim/benchmark/thermo/PhaseEnvelopeBenchmark.java": "7abf7ec3acdca4a3c1599fa3ee33670b708855c207103f16dc8d3e6bb83ca78c",
    "src/main/java/com/equinor/neqsim/benchmark/util/BenchmarkFluids.java": "87ea44ebc643643e5acffedeadb95d6bba553daaed4a026d076f38646c77fdb0",
    "src/main/resources/fluids/platform_feed.e300": "32f4eb0253f888fa2c96a36fe76d26e085dda3308d5a80b11ce9899993aceb7b"
  },
  "changes": {
    "added": [],
    "modified": [
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
OS name: "linux", version: "7.0.0-1017-azure", arch: "amd64", family: "unix"
Linux runnervmnwato 7.0.0-1017-azure #17-Ubuntu SMP PREEMPT Thu Sep 24 15:54:51 UTC 2026 x86_64 GNU/Linux
Architecture:                            x86_64
CPU op-mode(s):                          32-bit, 64-bit
Address sizes:                           46 bits physical, 57 bits virtual
Byte Order:                              Little Endian
CPU(s):                                  2
On-line CPU(s) list:                     0,1
Vendor ID:                               GenuineIntel
Model name:                              Intel(R) Xeon(R) Platinum 8370C CPU @ 2.80GHz
CPU family:                              6
Model:                                   106
Thread(s) per core:                      2
Core(s) per socket:                      1
Socket(s):                               1
Stepping:                                6
CPU(s) scaling MHz:                      125%
CPU max MHz:                             2800.0000
CPU min MHz:                             800.0000
BogoMIPS:                                5586.87
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ss ht syscall nx pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology tsc_reliable nonstop_tsc cpuid aperfmperf tsc_known_freq pni pclmulqdq vmx ssse3 fma cx16 pcid sse4_1 sse4_2 x2apic movbe popcnt tsc_deadline_timer aes xsave avx f16c rdrand hypervisor lahf_lm abm 3dnowprefetch tpr_shadow ept vpid ept_ad fsgsbase tsc_adjust bmi1 hle avx2 smep bmi2 erms invpcid rtm avx512f avx512dq rdseed adx smap avx512ifma clflushopt clwb avx512cd sha_ni avx512bw avx512vl xsaveopt xsavec xgetbv1 xsaves vnmi avx512vbmi umip avx512_vbmi2 gfni vaes vpclmulqdq avx512_vnni avx512_bitalg avx512_vpopcntdq la57 rdpid fsrm arch_capabilities
Virtualization:                          VT-x
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               48 KiB (1 instance)
L1i cache:                               32 KiB (1 instance)
L2 cache:                                1.3 MiB (1 instance)
L3 cache:                                48 MiB (1 instance)
NUMA node(s):                            1
NUMA node0 CPU(s):                       0,1
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
| baseline | 3.14.0 | passed |
| current | 3.15.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.14.0",
  "version": "3.14.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.14.0/neqsim-3.14.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.15.0",
  "version": "3.15.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.15.0/neqsim-3.15.0.jar",
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
[INFO] Total time:  14.157 s
[INFO] Finished at: 2026-10-28T23:48:55Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.14.0 (neqsim-3.14.0.jar); requested: 3.14.0
$ mvn clean verify -Dneqsim.version=3.14.0
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
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (45 ms)
tpFlashWellFluidSrk                                            83.6406  (123 ms)
tpFlashWellFluidPr                                             83.6541  (72 ms)
tpFlashWellFluidWithProperties                                 5445.46  (135 ms)
phAndPsFlashWellFluid                                          2459.23  (86 ms)
Oct 28, 2026 11:49:12 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 11:49:13 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (798 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (326 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (32 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (91 ms)
saturationPointsWellFluid                                      1601.32  (169 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1218 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1646 ms)
levenbergMarquardtAntoine                                      1837.31  (13 ms)
levenbergMarquardtDoubleExponential                            5.57177  (11 ms)
dataReconciliation[20]                                         7.89841  (28 ms)
dataReconciliation[100]                                        37.0132  (129 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.193 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 12.97 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.041 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 543228 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 94 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    8.49e-05 (tolerance: 1.00e-04) OK
  Temperature:  1.34e-05 (tolerance: 1.00e-04) OK
  Pressure:     3.34e-05 (tolerance: 1.00e-04) OK

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED

feed 5489240.1, gas 264785.9 + 378162.7, oil 1995470.1 + 2850761.1, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.449 MSm3/d, KA27841 A 102.5 bara, pipeline outlet 50.8 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 543.2 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 28610 ms, solved=true, gas=318849.57 kg/hr, water in/out=0.00027173922/1.5382411e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018460518, composition error=0.0029034392
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=0.00013719865
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 28.62 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.14.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.14.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  10:16 min
[INFO] Finished at: 2026-10-28T23:59:14Z
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
# Warmup Iteration   1: 36.082 ms/op
# Warmup Iteration   2: 18.620 ms/op
Iteration   1: 17.972 ms/op
Iteration   2: 17.995 ms/op
Iteration   3: 17.772 ms/op

# Run progress: 2.17% complete, ETA 00:09:22
# Fork: 2 of 2
# Warmup Iteration   1: 39.436 ms/op
# Warmup Iteration   2: 18.871 ms/op
Iteration   1: 18.171 ms/op
Iteration   2: 18.409 ms/op
Iteration   3: 18.101 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  18.070 ±(99.9%) 0.601 ms/op [Average]
  (min, avg, max) = (17.772, 18.070, 18.409), stdev = 0.214
  CI (99.9%): [17.469, 18.672] (assumes normal distribution)


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

# Run progress: 4.35% complete, ETA 00:09:08
# Fork: 1 of 2
# Warmup Iteration   1: 4.253 ms/op
# Warmup Iteration   2: 2.452 ms/op
Iteration   1: 1.558 ms/op
Iteration   2: 1.546 ms/op
Iteration   3: 1.544 ms/op

# Run progress: 6.52% complete, ETA 00:08:56
# Fork: 2 of 2
# Warmup Iteration   1: 4.183 ms/op
# Warmup Iteration   2: 3.471 ms/op
Iteration   1: 2.201 ms/op
Iteration   2: 1.484 ms/op
Iteration   3: 1.486 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.637 ±(99.9%) 0.781 ms/op [Average]
  (min, avg, max) = (1.484, 1.637, 2.201), stdev = 0.279
  CI (99.9%): [0.855, 2.418] (assumes normal distribution)


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

# Run progress: 8.70% complete, ETA 00:08:42
# Fork: 1 of 2
# Warmup Iteration   1: 16.832 ms/op
# Warmup Iteration   2: 9.230 ms/op
Iteration   1: 6.130 ms/op
Iteration   2: 6.106 ms/op
Iteration   3: 6.148 ms/op

# Run progress: 10.87% complete, ETA 00:08:29
# Fork: 2 of 2
# Warmup Iteration   1: 17.481 ms/op
# Warmup Iteration   2: 11.531 ms/op
Iteration   1: 7.115 ms/op
Iteration   2: 6.198 ms/op
Iteration   3: 6.213 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.318 ±(99.9%) 1.101 ms/op [Average]
  (min, avg, max) = (6.106, 6.318, 7.115), stdev = 0.393
  CI (99.9%): [5.217, 7.419] (assumes normal distribution)


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

# Run progress: 13.04% complete, ETA 00:08:17
# Fork: 1 of 2
# Warmup Iteration   1: 16.537 ms/op
# Warmup Iteration   2: 10.690 ms/op
Iteration   1: 6.389 ms/op
Iteration   2: 6.211 ms/op
Iteration   3: 6.223 ms/op

# Run progress: 15.22% complete, ETA 00:08:04
# Fork: 2 of 2
# Warmup Iteration   1: 15.826 ms/op
# Warmup Iteration   2: 8.324 ms/op
Iteration   1: 6.004 ms/op
Iteration   2: 5.954 ms/op
Iteration   3: 6.067 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.141 ±(99.9%) 0.456 ms/op [Average]
  (min, avg, max) = (5.954, 6.141, 6.389), stdev = 0.163
  CI (99.9%): [5.685, 6.597] (assumes normal distribution)


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

# Run progress: 17.39% complete, ETA 00:07:52
# Fork: 1 of 2
# Warmup Iteration   1: 42.749 ms/op
# Warmup Iteration   2: 20.701 ms/op
Iteration   1: 14.424 ms/op
Iteration   2: 11.391 ms/op
Iteration   3: 11.237 ms/op

# Run progress: 19.57% complete, ETA 00:07:40
# Fork: 2 of 2
# Warmup Iteration   1: 39.696 ms/op
# Warmup Iteration   2: 21.224 ms/op
Iteration   1: 14.042 ms/op
Iteration   2: 11.602 ms/op
Iteration   3: 11.386 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  12.347 ±(99.9%) 4.124 ms/op [Average]
  (min, avg, max) = (11.237, 12.347, 14.424), stdev = 1.471
  CI (99.9%): [8.223, 16.471] (assumes normal distribution)


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

# Run progress: 21.74% complete, ETA 00:07:28
# Fork: 1 of 2
# Warmup Iteration   1: 2891.439 ms/op
# Warmup Iteration   2: 936.313 ms/op
Iteration   1: 671.219 ms/op
Iteration   2: 476.577 ms/op
Iteration   3: 437.233 ms/op

# Run progress: 23.91% complete, ETA 00:07:16
# Fork: 2 of 2
# Warmup Iteration   1: 2895.076 ms/op
# Warmup Iteration   2: 931.525 ms/op
Iteration   1: 589.479 ms/op
Iteration   2: 483.133 ms/op
Iteration   3: 444.490 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  517.022 ±(99.9%) 261.371 ms/op [Average]
  (min, avg, max) = (437.233, 517.022, 671.219), stdev = 93.207
  CI (99.9%): [255.651, 778.393] (assumes normal distribution)


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

# Run progress: 26.09% complete, ETA 00:07:05
# Fork: 1 of 2
# Warmup Iteration   1: 13048.431 ms/op
# Warmup Iteration   2: 7112.224 ms/op
Iteration   1: 6098.665 ms/op
Iteration   2: 6047.065 ms/op
Iteration   3: 6011.062 ms/op

# Run progress: 28.26% complete, ETA 00:07:59
# Fork: 2 of 2
# Warmup Iteration   1: 12574.357 ms/op
# Warmup Iteration   2: 6855.249 ms/op
Iteration   1: 5925.793 ms/op
Iteration   2: 5857.448 ms/op
Iteration   3: 5777.685 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  5952.953 ±(99.9%) 341.245 ms/op [Average]
  (min, avg, max) = (5777.685, 5952.953, 6098.665), stdev = 121.691
  CI (99.9%): [5611.708, 6294.198] (assumes normal distribution)


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

# Run progress: 30.43% complete, ETA 00:08:36
# Fork: 1 of 2
# Warmup Iteration   1: 2506.929 ms/op
# Warmup Iteration   2: 611.436 ms/op
Iteration   1: 542.861 ms/op
Iteration   2: 508.376 ms/op
Iteration   3: 503.236 ms/op

# Run progress: 32.61% complete, ETA 00:08:10
# Fork: 2 of 2
# Warmup Iteration   1: 2461.683 ms/op
# Warmup Iteration   2: 599.535 ms/op
Iteration   1: 561.455 ms/op
Iteration   2: 510.833 ms/op
Iteration   3: 509.674 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  522.739 ±(99.9%) 66.394 ms/op [Average]
  (min, avg, max) = (503.236, 522.739, 561.455), stdev = 23.677
  CI (99.9%): [456.345, 589.134] (assumes normal distribution)


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

# Run progress: 34.78% complete, ETA 00:07:46
# Fork: 1 of 2
# Warmup Iteration   1: 3274.912 ms/op
# Warmup Iteration   2: 1316.039 ms/op
Iteration   1: 1320.788 ms/op
Iteration   2: 1178.064 ms/op
Iteration   3: 1099.781 ms/op

# Run progress: 36.96% complete, ETA 00:07:27
# Fork: 2 of 2
# Warmup Iteration   1: 3332.017 ms/op
# Warmup Iteration   2: 1379.395 ms/op
Iteration   1: 1292.743 ms/op
Iteration   2: 1110.875 ms/op
Iteration   3: 1093.492 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1182.624 ±(99.9%) 283.741 ms/op [Average]
  (min, avg, max) = (1093.492, 1182.624, 1320.788), stdev = 101.185
  CI (99.9%): [898.883, 1466.364] (assumes normal distribution)


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

# Run progress: 39.13% complete, ETA 00:07:09
# Fork: 1 of 2
# Warmup Iteration   1: 0.376 ms/op
# Warmup Iteration   2: 0.138 ms/op
Iteration   1: 0.122 ms/op
Iteration   2: 0.122 ms/op
Iteration   3: 0.121 ms/op

# Run progress: 41.30% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 0.457 ms/op
# Warmup Iteration   2: 0.179 ms/op
Iteration   1: 0.144 ms/op
Iteration   2: 0.144 ms/op
Iteration   3: 0.143 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.133 ±(99.9%) 0.034 ms/op [Average]
  (min, avg, max) = (0.121, 0.133, 0.144), stdev = 0.012
  CI (99.9%): [0.099, 0.167] (assumes normal distribution)


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

# Run progress: 43.48% complete, ETA 00:06:25
# Fork: 1 of 2
# Warmup Iteration   1: 21.369 ms/op
# Warmup Iteration   2: 9.553 ms/op
Iteration   1: 9.613 ms/op
Iteration   2: 9.709 ms/op
Iteration   3: 9.226 ms/op

# Run progress: 45.65% complete, ETA 00:06:05
# Fork: 2 of 2
# Warmup Iteration   1: 19.075 ms/op
# Warmup Iteration   2: 9.530 ms/op
Iteration   1: 9.678 ms/op
Iteration   2: 9.330 ms/op
Iteration   3: 9.332 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  9.481 ±(99.9%) 0.586 ms/op [Average]
  (min, avg, max) = (9.226, 9.481, 9.709), stdev = 0.209
  CI (99.9%): [8.895, 10.067] (assumes normal distribution)


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

# Run progress: 47.83% complete, ETA 00:05:45
# Fork: 1 of 2
# Warmup Iteration   1: 1.157 ms/op
# Warmup Iteration   2: 0.704 ms/op
Iteration   1: 0.630 ms/op
Iteration   2: 0.628 ms/op
Iteration   3: 0.681 ms/op

# Run progress: 50.00% complete, ETA 00:05:27
# Fork: 2 of 2
# Warmup Iteration   1: 1.145 ms/op
# Warmup Iteration   2: 0.704 ms/op
Iteration   1: 0.624 ms/op
Iteration   2: 0.618 ms/op
Iteration   3: 0.619 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.633 ±(99.9%) 0.067 ms/op [Average]
  (min, avg, max) = (0.618, 0.633, 0.681), stdev = 0.024
  CI (99.9%): [0.567, 0.700] (assumes normal distribution)


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

# Run progress: 52.17% complete, ETA 00:05:09
# Fork: 1 of 2
# Warmup Iteration   1: 2.885 ms/op
# Warmup Iteration   2: 1.751 ms/op
Iteration   1: 1.845 ms/op
Iteration   2: 1.623 ms/op
Iteration   3: 1.570 ms/op

# Run progress: 54.35% complete, ETA 00:04:52
# Fork: 2 of 2
# Warmup Iteration   1: 2.907 ms/op
# Warmup Iteration   2: 1.694 ms/op
Iteration   1: 1.793 ms/op
Iteration   2: 1.593 ms/op
Iteration   3: 1.616 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.673 ±(99.9%) 0.324 ms/op [Average]
  (min, avg, max) = (1.570, 1.673, 1.845), stdev = 0.115
  CI (99.9%): [1.350, 1.997] (assumes normal distribution)


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

# Run progress: 56.52% complete, ETA 00:04:35
# Fork: 1 of 2
# Warmup Iteration   1: 539.010 ms/op
# Warmup Iteration   2: 72.811 ms/op
Iteration   1: 53.623 ms/op
Iteration   2: 39.613 ms/op
Iteration   3: 39.640 ms/op

# Run progress: 58.70% complete, ETA 00:04:19
# Fork: 2 of 2
# Warmup Iteration   1: 533.029 ms/op
# Warmup Iteration   2: 71.737 ms/op
Iteration   1: 53.162 ms/op
Iteration   2: 41.782 ms/op
Iteration   3: 37.781 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  44.267 ±(99.9%) 20.142 ms/op [Average]
  (min, avg, max) = (37.781, 44.267, 53.623), stdev = 7.183
  CI (99.9%): [24.125, 64.409] (assumes normal distribution)


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

# Run progress: 60.87% complete, ETA 00:04:03
# Fork: 1 of 2
# Warmup Iteration   1: 88836.349 ms/op
# Warmup Iteration   2: 81673.049 ms/op
Iteration   1: 80118.711 ms/op
Iteration   2: 80074.582 ms/op
Iteration   3: 80413.484 ms/op

# Run progress: 63.04% complete, ETA 00:07:44
# Fork: 2 of 2
# Warmup Iteration   1: 90201.274 ms/op
# Warmup Iteration   2: 82079.201 ms/op
Iteration   1: 80129.445 ms/op
Iteration   2: 80101.826 ms/op
Iteration   3: 80287.534 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  80187.597 ±(99.9%) 374.689 ms/op [Average]
  (min, avg, max) = (80074.582, 80187.597, 80413.484), stdev = 133.618
  CI (99.9%): [79812.908, 80562.286] (assumes normal distribution)


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

# Run progress: 65.22% complete, ETA 00:10:43
# Fork: 1 of 2
# Warmup Iteration   1: 15327.993 ms/op
# Warmup Iteration   2: 8721.759 ms/op
Iteration   1: 10978.077 ms/op
Iteration   2: 9172.977 ms/op
Iteration   3: 9100.558 ms/op

# Run progress: 67.39% complete, ETA 00:14:05
# Fork: 2 of 2
# Warmup Iteration   1: 14814.520 ms/op
# Warmup Iteration   2: 8328.846 ms/op
Iteration   1: 10736.338 ms/op
Iteration   2: 8813.157 ms/op
Iteration   3: 8760.107 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  9593.536 ±(99.9%) 2789.128 ms/op [Average]
  (min, avg, max) = (8760.107, 9593.536, 10978.077), stdev = 994.630
  CI (99.9%): [6804.407, 12382.664] (assumes normal distribution)


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

# Run progress: 69.57% complete, ETA 00:16:34
# Fork: 1 of 2
# Warmup Iteration   1: 23555.746 ms/op
# Warmup Iteration   2: 16124.283 ms/op
Iteration   1: 14031.268 ms/op
Iteration   2: 14283.794 ms/op
Iteration   3: 13078.614 ms/op

# Run progress: 71.74% complete, ETA 00:15:27
# Fork: 2 of 2
# Warmup Iteration   1: 33488.799 ms/op
# Warmup Iteration   2: 17935.435 ms/op
Iteration   1: 13378.722 ms/op
Iteration   2: 15069.776 ms/op
Iteration   3: 13319.532 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  13860.284 ±(99.9%) 2101.005 ms/op [Average]
  (min, avg, max) = (13078.614, 13860.284, 15069.776), stdev = 749.238
  CI (99.9%): [11759.280, 15961.289] (assumes normal distribution)


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

# Run progress: 73.91% complete, ETA 00:14:24
# Fork: 1 of 2
# Warmup Iteration   1: Oct 29, 2026 12:40:05 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 12:40:05 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
169.016 ms/op
# Warmup Iteration   2: 66.576 ms/op
Iteration   1: 68.810 ms/op
Iteration   2: 66.359 ms/op
Iteration   3: 65.373 ms/op

# Run progress: 76.09% complete, ETA 00:12:53
# Fork: 2 of 2
# Warmup Iteration   1: Oct 29, 2026 12:40:17 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 12:40:17 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
185.065 ms/op
# Warmup Iteration   2: 66.655 ms/op
Iteration   1: 69.352 ms/op
Iteration   2: 65.909 ms/op
Iteration   3: 65.801 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  66.934 ±(99.9%) 4.770 ms/op [Average]
  (min, avg, max) = (65.373, 66.934, 69.352), stdev = 1.701
  CI (99.9%): [62.164, 71.704] (assumes normal distribution)


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

# Run progress: 78.26% complete, ETA 00:11:26
# Fork: 1 of 2
# Warmup Iteration   1: 233.355 ms/op
# Warmup Iteration   2: 97.807 ms/op
Iteration   1: 76.031 ms/op
Iteration   2: 75.956 ms/op
Iteration   3: 75.945 ms/op

# Run progress: 80.43% complete, ETA 00:10:04
# Fork: 2 of 2
# Warmup Iteration   1: 224.679 ms/op
# Warmup Iteration   2: 97.567 ms/op
Iteration   1: 79.234 ms/op
Iteration   2: 78.834 ms/op
Iteration   3: 78.943 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  77.491 ±(99.9%) 4.664 ms/op [Average]
  (min, avg, max) = (75.945, 77.491, 79.234), stdev = 1.663
  CI (99.9%): [72.827, 82.154] (assumes normal distribution)


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

# Run progress: 82.61% complete, ETA 00:08:45
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:07:30
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

# Run progress: 86.96% complete, ETA 00:06:18
# Fork: 1 of 2
# Warmup Iteration   1: 1.414 ms/op
# Warmup Iteration   2: 0.849 ms/op
Iteration   1: 0.706 ms/op
Iteration   2: 0.715 ms/op
Iteration   3: 0.686 ms/op

# Run progress: 89.13% complete, ETA 00:05:08
# Fork: 2 of 2
# Warmup Iteration   1: 1.614 ms/op
# Warmup Iteration   2: 0.787 ms/op
Iteration   1: 0.685 ms/op
Iteration   2: 0.693 ms/op
Iteration   3: 0.671 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.693 ±(99.9%) 0.044 ms/op [Average]
  (min, avg, max) = (0.671, 0.693, 0.715), stdev = 0.016
  CI (99.9%): [0.649, 0.737] (assumes normal distribution)


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

# Run progress: 91.30% complete, ETA 00:04:02
# Fork: 1 of 2
# Warmup Iteration   1: 37.993 ms/op
# Warmup Iteration   2: 21.991 ms/op
Iteration   1: 14.252 ms/op
Iteration   2: 14.564 ms/op
Iteration   3: 14.376 ms/op

# Run progress: 93.48% complete, ETA 00:02:58
# Fork: 2 of 2
# Warmup Iteration   1: 35.125 ms/op
# Warmup Iteration   2: 20.642 ms/op
Iteration   1: 13.550 ms/op
Iteration   2: 14.030 ms/op
Iteration   3: 15.393 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  14.361 ±(99.9%) 1.722 ms/op [Average]
  (min, avg, max) = (13.550, 14.361, 15.393), stdev = 0.614
  CI (99.9%): [12.639, 16.083] (assumes normal distribution)


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

# Run progress: 95.65% complete, ETA 00:01:56
# Fork: 1 of 2
# Warmup Iteration   1: 45.055 ms/op
# Warmup Iteration   2: 29.450 ms/op
Iteration   1: 29.176 ms/op
Iteration   2: 29.318 ms/op
Iteration   3: 29.214 ms/op

# Run progress: 97.83% complete, ETA 00:00:57
# Fork: 2 of 2
# Warmup Iteration   1: 36.033 ms/op
# Warmup Iteration   2: 23.636 ms/op
Iteration   1: 22.644 ms/op
Iteration   2: 22.570 ms/op
Iteration   3: 22.673 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  25.932 ±(99.9%) 10.149 ms/op [Average]
  (min, avg, max) = (22.570, 25.932, 29.318), stdev = 3.619
  CI (99.9%): [15.783, 36.082] (assumes normal distribution)


# Run complete. Total time: 00:43:12

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     18.070 ±    0.601  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.637 ±    0.781  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.318 ±    1.101  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.141 ±    0.456  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     12.347 ±    4.124  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    517.022 ±  261.371  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   5952.953 ±  341.245  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    522.739 ±   66.394  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1182.624 ±  283.741  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.133 ±    0.034  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      9.481 ±    0.586  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.633 ±    0.067  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.673 ±    0.324  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     44.267 ±   20.142  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  80187.597 ±  374.689  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   9593.536 ± 2789.128  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  13860.284 ± 2101.005  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     66.934 ±    4.770  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     77.491 ±    4.664  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.693 ±    0.044  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     14.361 ±    1.722  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     25.932 ±   10.149  ms/op

Benchmark result is saved to /home/runner/work/_temp/baseline-benchmarks.json

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
[INFO] Total time:  4.697 s
[INFO] Finished at: 2026-10-29T00:42:34Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.15.0 (neqsim-3.15.0.jar); requested: 3.15.0
$ mvn clean verify -Dneqsim.version=3.15.0
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
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (40 ms)
tpFlashWellFluidSrk                                            83.6406  (126 ms)
tpFlashWellFluidPr                                             83.6541  (85 ms)
tpFlashWellFluidWithProperties                                 5445.46  (127 ms)
phAndPsFlashWellFluid                                          2459.23  (83 ms)
Oct 29, 2026 12:42:44 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 12:42:44 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (594 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (383 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (39 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (82 ms)
saturationPointsWellFluid                                      1601.32  (140 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1078 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1548 ms)
levenbergMarquardtAntoine                                      1837.31  (13 ms)
levenbergMarquardtDoubleExponential                            5.57177  (11 ms)
dataReconciliation[20]                                         7.89841  (27 ms)
dataReconciliation[100]                                        37.0132  (125 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.432 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.35 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.127 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 511162 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 94 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    8.49e-05 (tolerance: 1.00e-04) OK
  Temperature:  1.34e-05 (tolerance: 1.00e-04) OK
  Pressure:     3.34e-05 (tolerance: 1.00e-04) OK

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED

feed 5489240.1, gas 264785.9 + 378162.7, oil 1995470.1 + 2850761.1, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.449 MSm3/d, KA27841 A 102.5 bara, pipeline outlet 50.8 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 511.2 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 22327 ms, solved=true, gas=318849.56 kg/hr, water in/out=0.00027104531/1.5353072e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018484305, composition error=0.0029102350
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00013837326
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 22.34 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.15.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.15.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  09:27 min
[INFO] Finished at: 2026-10-29T00:52:03Z
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
# Warmup Iteration   1: 35.811 ms/op
# Warmup Iteration   2: 18.336 ms/op
Iteration   1: 17.941 ms/op
Iteration   2: 18.027 ms/op
Iteration   3: 17.568 ms/op

# Run progress: 2.17% complete, ETA 00:09:18
# Fork: 2 of 2
# Warmup Iteration   1: 34.816 ms/op
# Warmup Iteration   2: 18.642 ms/op
Iteration   1: 18.451 ms/op
Iteration   2: 18.257 ms/op
Iteration   3: 18.037 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  18.047 ±(99.9%) 0.839 ms/op [Average]
  (min, avg, max) = (17.568, 18.047, 18.451), stdev = 0.299
  CI (99.9%): [17.207, 18.886] (assumes normal distribution)


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

# Run progress: 4.35% complete, ETA 00:09:03
# Fork: 1 of 2
# Warmup Iteration   1: 4.179 ms/op
# Warmup Iteration   2: 2.824 ms/op
Iteration   1: 1.555 ms/op
Iteration   2: 1.533 ms/op
Iteration   3: 1.539 ms/op

# Run progress: 6.52% complete, ETA 00:08:50
# Fork: 2 of 2
# Warmup Iteration   1: 3.816 ms/op
# Warmup Iteration   2: 2.436 ms/op
Iteration   1: 1.474 ms/op
Iteration   2: 1.448 ms/op
Iteration   3: 1.462 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.502 ±(99.9%) 0.128 ms/op [Average]
  (min, avg, max) = (1.448, 1.502, 1.555), stdev = 0.046
  CI (99.9%): [1.374, 1.630] (assumes normal distribution)


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

# Run progress: 8.70% complete, ETA 00:08:39
# Fork: 1 of 2
# Warmup Iteration   1: 17.042 ms/op
# Warmup Iteration   2: 9.416 ms/op
Iteration   1: 6.344 ms/op
Iteration   2: 6.237 ms/op
Iteration   3: 6.299 ms/op

# Run progress: 10.87% complete, ETA 00:08:27
# Fork: 2 of 2
# Warmup Iteration   1: 15.896 ms/op
# Warmup Iteration   2: 10.229 ms/op
Iteration   1: 6.305 ms/op
Iteration   2: 6.165 ms/op
Iteration   3: 6.266 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.269 ±(99.9%) 0.176 ms/op [Average]
  (min, avg, max) = (6.165, 6.269, 6.344), stdev = 0.063
  CI (99.9%): [6.093, 6.446] (assumes normal distribution)


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

# Run progress: 13.04% complete, ETA 00:08:14
# Fork: 1 of 2
# Warmup Iteration   1: 15.884 ms/op
# Warmup Iteration   2: 11.360 ms/op
Iteration   1: 6.909 ms/op
Iteration   2: 6.127 ms/op
Iteration   3: 6.163 ms/op

# Run progress: 15.22% complete, ETA 00:08:02
# Fork: 2 of 2
# Warmup Iteration   1: 15.937 ms/op
# Warmup Iteration   2: 10.552 ms/op
Iteration   1: 6.112 ms/op
Iteration   2: 6.004 ms/op
Iteration   3: 6.338 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.276 ±(99.9%) 0.921 ms/op [Average]
  (min, avg, max) = (6.004, 6.276, 6.909), stdev = 0.328
  CI (99.9%): [5.355, 7.197] (assumes normal distribution)


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

# Run progress: 17.39% complete, ETA 00:07:50
# Fork: 1 of 2
# Warmup Iteration   1: 38.889 ms/op
# Warmup Iteration   2: 21.394 ms/op
Iteration   1: 14.532 ms/op
Iteration   2: 11.795 ms/op
Iteration   3: 11.596 ms/op

# Run progress: 19.57% complete, ETA 00:07:37
# Fork: 2 of 2
# Warmup Iteration   1: 36.723 ms/op
# Warmup Iteration   2: 19.424 ms/op
Iteration   1: 12.363 ms/op
Iteration   2: 11.647 ms/op
Iteration   3: 11.617 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  12.258 ±(99.9%) 3.226 ms/op [Average]
  (min, avg, max) = (11.596, 12.258, 14.532), stdev = 1.151
  CI (99.9%): [9.032, 15.485] (assumes normal distribution)


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

# Run progress: 21.74% complete, ETA 00:07:25
# Fork: 1 of 2
# Warmup Iteration   1: 2766.202 ms/op
# Warmup Iteration   2: 897.710 ms/op
Iteration   1: 585.566 ms/op
Iteration   2: 476.664 ms/op
Iteration   3: 415.429 ms/op

# Run progress: 23.91% complete, ETA 00:07:13
# Fork: 2 of 2
# Warmup Iteration   1: 2819.900 ms/op
# Warmup Iteration   2: 1001.651 ms/op
Iteration   1: 687.809 ms/op
Iteration   2: 483.338 ms/op
Iteration   3: 422.430 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  511.873 ±(99.9%) 296.077 ms/op [Average]
  (min, avg, max) = (415.429, 511.873, 687.809), stdev = 105.584
  CI (99.9%): [215.796, 807.949] (assumes normal distribution)


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

# Run progress: 26.09% complete, ETA 00:06:59
# Fork: 1 of 2
# Warmup Iteration   1: 12760.792 ms/op
# Warmup Iteration   2: 6807.236 ms/op
Iteration   1: 5964.818 ms/op
Iteration   2: 5867.104 ms/op
Iteration   3: 5895.870 ms/op

# Run progress: 28.26% complete, ETA 00:07:51
# Fork: 2 of 2
# Warmup Iteration   1: 13276.856 ms/op
# Warmup Iteration   2: 7835.334 ms/op
Iteration   1: 6197.657 ms/op
Iteration   2: 6187.459 ms/op
Iteration   3: 6030.245 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  6023.859 ±(99.9%) 399.438 ms/op [Average]
  (min, avg, max) = (5867.104, 6023.859, 6197.657), stdev = 142.443
  CI (99.9%): [5624.421, 6423.297] (assumes normal distribution)


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

# Run progress: 30.43% complete, ETA 00:08:35
# Fork: 1 of 2
# Warmup Iteration   1: 2427.368 ms/op
# Warmup Iteration   2: 634.701 ms/op
Iteration   1: 552.092 ms/op
Iteration   2: 508.622 ms/op
Iteration   3: 493.858 ms/op

# Run progress: 32.61% complete, ETA 00:08:10
# Fork: 2 of 2
# Warmup Iteration   1: 2318.275 ms/op
# Warmup Iteration   2: 594.977 ms/op
Iteration   1: 539.023 ms/op
Iteration   2: 501.499 ms/op
Iteration   3: 492.422 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  514.586 ±(99.9%) 70.179 ms/op [Average]
  (min, avg, max) = (492.422, 514.586, 552.092), stdev = 25.026
  CI (99.9%): [444.407, 584.764] (assumes normal distribution)


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

# Run progress: 34.78% complete, ETA 00:07:47
# Fork: 1 of 2
# Warmup Iteration   1: 3155.058 ms/op
# Warmup Iteration   2: 1320.904 ms/op
Iteration   1: 1276.319 ms/op
Iteration   2: 1161.447 ms/op
Iteration   3: 1094.170 ms/op

# Run progress: 36.96% complete, ETA 00:07:28
# Fork: 2 of 2
# Warmup Iteration   1: 3129.174 ms/op
# Warmup Iteration   2: 1331.701 ms/op
Iteration   1: 1318.969 ms/op
Iteration   2: 1150.926 ms/op
Iteration   3: 1080.700 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1180.422 ±(99.9%) 271.892 ms/op [Average]
  (min, avg, max) = (1080.700, 1180.422, 1318.969), stdev = 96.959
  CI (99.9%): [908.530, 1452.313] (assumes normal distribution)


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

# Run progress: 39.13% complete, ETA 00:07:09
# Fork: 1 of 2
# Warmup Iteration   1: 0.427 ms/op
# Warmup Iteration   2: 0.146 ms/op
Iteration   1: 0.130 ms/op
Iteration   2: 0.128 ms/op
Iteration   3: 0.127 ms/op

# Run progress: 41.30% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 0.427 ms/op
# Warmup Iteration   2: 0.151 ms/op
Iteration   1: 0.137 ms/op
Iteration   2: 0.136 ms/op
Iteration   3: 0.139 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.133 ±(99.9%) 0.014 ms/op [Average]
  (min, avg, max) = (0.127, 0.133, 0.139), stdev = 0.005
  CI (99.9%): [0.119, 0.147] (assumes normal distribution)


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

# Run progress: 43.48% complete, ETA 00:06:25
# Fork: 1 of 2
# Warmup Iteration   1: 19.084 ms/op
# Warmup Iteration   2: 9.439 ms/op
Iteration   1: 9.555 ms/op
Iteration   2: 9.234 ms/op
Iteration   3: 9.185 ms/op

# Run progress: 45.65% complete, ETA 00:06:05
# Fork: 2 of 2
# Warmup Iteration   1: 18.751 ms/op
# Warmup Iteration   2: 9.494 ms/op
Iteration   1: 9.567 ms/op
Iteration   2: 9.273 ms/op
Iteration   3: 9.183 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  9.333 ±(99.9%) 0.504 ms/op [Average]
  (min, avg, max) = (9.183, 9.333, 9.567), stdev = 0.180
  CI (99.9%): [8.829, 9.837] (assumes normal distribution)


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

# Run progress: 47.83% complete, ETA 00:05:45
# Fork: 1 of 2
# Warmup Iteration   1: 1.085 ms/op
# Warmup Iteration   2: 0.694 ms/op
Iteration   1: 0.620 ms/op
Iteration   2: 0.616 ms/op
Iteration   3: 0.617 ms/op

# Run progress: 50.00% complete, ETA 00:05:27
# Fork: 2 of 2
# Warmup Iteration   1: 1.081 ms/op
# Warmup Iteration   2: 0.690 ms/op
Iteration   1: 0.620 ms/op
Iteration   2: 0.611 ms/op
Iteration   3: 0.614 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.616 ±(99.9%) 0.009 ms/op [Average]
  (min, avg, max) = (0.611, 0.616, 0.620), stdev = 0.003
  CI (99.9%): [0.607, 0.625] (assumes normal distribution)


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

# Run progress: 52.17% complete, ETA 00:05:09
# Fork: 1 of 2
# Warmup Iteration   1: 3.206 ms/op
# Warmup Iteration   2: 1.696 ms/op
Iteration   1: 1.751 ms/op
Iteration   2: 1.581 ms/op
Iteration   3: 1.577 ms/op

# Run progress: 54.35% complete, ETA 00:04:52
# Fork: 2 of 2
# Warmup Iteration   1: 2.792 ms/op
# Warmup Iteration   2: 1.690 ms/op
Iteration   1: 1.742 ms/op
Iteration   2: 1.579 ms/op
Iteration   3: 1.579 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.635 ±(99.9%) 0.243 ms/op [Average]
  (min, avg, max) = (1.577, 1.635, 1.751), stdev = 0.087
  CI (99.9%): [1.392, 1.878] (assumes normal distribution)


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

# Run progress: 56.52% complete, ETA 00:04:35
# Fork: 1 of 2
# Warmup Iteration   1: 338.827 ms/op
# Warmup Iteration   2: 64.917 ms/op
Iteration   1: 45.558 ms/op
Iteration   2: 36.839 ms/op
Iteration   3: 35.534 ms/op

# Run progress: 58.70% complete, ETA 00:04:19
# Fork: 2 of 2
# Warmup Iteration   1: 411.621 ms/op
# Warmup Iteration   2: 68.889 ms/op
Iteration   1: 46.788 ms/op
Iteration   2: 39.839 ms/op
Iteration   3: 37.488 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  40.341 ±(99.9%) 13.304 ms/op [Average]
  (min, avg, max) = (35.534, 40.341, 46.788), stdev = 4.744
  CI (99.9%): [27.037, 53.645] (assumes normal distribution)


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

# Run progress: 60.87% complete, ETA 00:04:03
# Fork: 1 of 2
# Warmup Iteration   1: 93527.413 ms/op
# Warmup Iteration   2: 86157.098 ms/op
Iteration   1: 83614.494 ms/op
Iteration   2: 83536.635 ms/op
Iteration   3: 83489.325 ms/op

# Run progress: 63.04% complete, ETA 00:07:55
# Fork: 2 of 2
# Warmup Iteration   1: 92624.372 ms/op
# Warmup Iteration   2: 85651.496 ms/op
Iteration   1: 83444.926 ms/op
Iteration   2: 83100.394 ms/op
Iteration   3: 83239.350 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  83404.187 ±(99.9%) 546.839 ms/op [Average]
  (min, avg, max) = (83100.394, 83404.187, 83614.494), stdev = 195.008
  CI (99.9%): [82857.348, 83951.027] (assumes normal distribution)


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

# Run progress: 65.22% complete, ETA 00:11:02
# Fork: 1 of 2
# Warmup Iteration   1: 14829.038 ms/op
# Warmup Iteration   2: 8250.061 ms/op
Iteration   1: 10509.324 ms/op
Iteration   2: 8811.777 ms/op
Iteration   3: 8698.814 ms/op

# Run progress: 67.39% complete, ETA 00:14:13
# Fork: 2 of 2
# Warmup Iteration   1: 14240.187 ms/op
# Warmup Iteration   2: 7982.598 ms/op
Iteration   1: 10190.201 ms/op
Iteration   2: 8652.250 ms/op
Iteration   3: 8412.651 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  9212.503 ±(99.9%) 2513.072 ms/op [Average]
  (min, avg, max) = (8412.651, 9212.503, 10509.324), stdev = 896.186
  CI (99.9%): [6699.431, 11725.574] (assumes normal distribution)


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

# Run progress: 69.57% complete, ETA 00:16:34
# Fork: 1 of 2
# Warmup Iteration   1: 22962.326 ms/op
# Warmup Iteration   2: 15583.914 ms/op
Iteration   1: 12527.112 ms/op
Iteration   2: 12786.902 ms/op
Iteration   3: 11917.294 ms/op

# Run progress: 71.74% complete, ETA 00:15:25
# Fork: 2 of 2
# Warmup Iteration   1: 21932.028 ms/op
# Warmup Iteration   2: 14517.071 ms/op
Iteration   1: 12435.731 ms/op
Iteration   2: 12836.582 ms/op
Iteration   3: 12305.826 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  12468.241 ±(99.9%) 948.184 ms/op [Average]
  (min, avg, max) = (11917.294, 12468.241, 12836.582), stdev = 338.131
  CI (99.9%): [11520.058, 13416.425] (assumes normal distribution)


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

# Run progress: 73.91% complete, ETA 00:14:15
# Fork: 1 of 2
# Warmup Iteration   1: Oct 29, 2026 1:32:28 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 1:32:28 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
201.614 ms/op
# Warmup Iteration   2: 71.214 ms/op
Iteration   1: 71.428 ms/op
Iteration   2: 68.031 ms/op
Iteration   3: 67.578 ms/op

# Run progress: 76.09% complete, ETA 00:12:45
# Fork: 2 of 2
# Warmup Iteration   1: Oct 29, 2026 1:32:40 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 1:32:40 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
192.443 ms/op
# Warmup Iteration   2: 79.460 ms/op
Iteration   1: 69.115 ms/op
Iteration   2: 69.823 ms/op
Iteration   3: 68.569 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  69.091 ±(99.9%) 3.902 ms/op [Average]
  (min, avg, max) = (67.578, 69.091, 71.428), stdev = 1.392
  CI (99.9%): [65.188, 72.993] (assumes normal distribution)


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

# Run progress: 78.26% complete, ETA 00:11:19
# Fork: 1 of 2
# Warmup Iteration   1: 170.553 ms/op
# Warmup Iteration   2: 97.119 ms/op
Iteration   1: 75.863 ms/op
Iteration   2: 75.369 ms/op
Iteration   3: 75.888 ms/op

# Run progress: 80.43% complete, ETA 00:09:58
# Fork: 2 of 2
# Warmup Iteration   1: 240.864 ms/op
# Warmup Iteration   2: 92.027 ms/op
Iteration   1: 76.162 ms/op
Iteration   2: 75.561 ms/op
Iteration   3: 76.361 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  75.868 ±(99.9%) 1.030 ms/op [Average]
  (min, avg, max) = (75.369, 75.868, 76.361), stdev = 0.367
  CI (99.9%): [74.838, 76.897] (assumes normal distribution)


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

# Run progress: 82.61% complete, ETA 00:08:40
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:07:25
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

# Run progress: 86.96% complete, ETA 00:06:14
# Fork: 1 of 2
# Warmup Iteration   1: 1.647 ms/op
# Warmup Iteration   2: 0.903 ms/op
Iteration   1: 0.727 ms/op
Iteration   2: 0.681 ms/op
Iteration   3: 0.673 ms/op

# Run progress: 89.13% complete, ETA 00:05:05
# Fork: 2 of 2
# Warmup Iteration   1: 1.687 ms/op
# Warmup Iteration   2: 0.861 ms/op
Iteration   1: 0.738 ms/op
Iteration   2: 0.703 ms/op
Iteration   3: 0.696 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.703 ±(99.9%) 0.071 ms/op [Average]
  (min, avg, max) = (0.673, 0.703, 0.738), stdev = 0.025
  CI (99.9%): [0.632, 0.774] (assumes normal distribution)


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

# Run progress: 91.30% complete, ETA 00:03:59
# Fork: 1 of 2
# Warmup Iteration   1: 35.454 ms/op
# Warmup Iteration   2: 20.725 ms/op
Iteration   1: 13.581 ms/op
Iteration   2: 15.236 ms/op
Iteration   3: 15.571 ms/op

# Run progress: 93.48% complete, ETA 00:02:56
# Fork: 2 of 2
# Warmup Iteration   1: 27.065 ms/op
# Warmup Iteration   2: 16.588 ms/op
Iteration   1: 11.878 ms/op
Iteration   2: 14.046 ms/op
Iteration   3: 11.344 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  13.609 ±(99.9%) 4.827 ms/op [Average]
  (min, avg, max) = (11.344, 13.609, 15.571), stdev = 1.721
  CI (99.9%): [8.782, 18.436] (assumes normal distribution)


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

# Run progress: 95.65% complete, ETA 00:01:55
# Fork: 1 of 2
# Warmup Iteration   1: 35.403 ms/op
# Warmup Iteration   2: 22.853 ms/op
Iteration   1: 22.780 ms/op
Iteration   2: 22.788 ms/op
Iteration   3: 23.623 ms/op

# Run progress: 97.83% complete, ETA 00:00:56
# Fork: 2 of 2
# Warmup Iteration   1: 36.024 ms/op
# Warmup Iteration   2: 22.604 ms/op
Iteration   1: 22.605 ms/op
Iteration   2: 22.494 ms/op
Iteration   3: 22.513 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  22.801 ±(99.9%) 1.184 ms/op [Average]
  (min, avg, max) = (22.494, 22.801, 23.623), stdev = 0.422
  CI (99.9%): [21.616, 23.985] (assumes normal distribution)


# Run complete. Total time: 00:42:46

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     18.047 ±    0.839  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.502 ±    0.128  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.269 ±    0.176  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.276 ±    0.921  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     12.258 ±    3.226  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    511.873 ±  296.077  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   6023.859 ±  399.438  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    514.586 ±   70.179  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1180.422 ±  271.892  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.133 ±    0.014  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      9.333 ±    0.504  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.616 ±    0.009  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.635 ±    0.243  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     40.341 ±   13.304  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  83404.187 ±  546.839  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   9212.503 ± 2513.072  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  12468.241 ±  948.184  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     69.091 ±    3.902  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     75.868 ±    1.030  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.703 ±    0.071  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     13.609 ±    4.827  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     22.801 ±    1.184  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.14.0 -> 3.15.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 17 lower, 6 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 25.9324 | 22.8006 | -12.08% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 13860.3 | 12468.2 | -10.04% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 44.267 | 40.3409 | -8.87% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.63655 | 1.50158 | -8.25% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.3611 | 13.6093 | -5.24% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 80187.6 | 83404.2 | +4.01% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 9593.54 | 9212.5 | -3.97% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 66.934 | 69.0908 | +3.22% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.633498 | 0.616382 | -2.70% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 1.6733 | 1.63495 | -2.29% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
