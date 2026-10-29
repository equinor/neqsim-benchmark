# NeqSim 3.17.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.16.0 |
| Current | 3.17.0 |
| Source commit | `0aaaf6272c94827d987c1722185bfd9be9dafe79` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40838248606) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "0aaaf6272c94827d987c1722185bfd9be9dafe79",
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
Address sizes:                           48 bits physical, 57 bits virtual
Byte Order:                              Little Endian
CPU(s):                                  2
On-line CPU(s) list:                     0,1
Vendor ID:                               GenuineIntel
Model name:                              Intel(R) Xeon(R) 6973P-C
CPU family:                              6
Model:                                   173
Thread(s) per core:                      2
Core(s) per socket:                      1
Socket(s):                               1
Stepping:                                1
CPU(s) scaling MHz:                      160%
CPU max MHz:                             2600.0000
CPU min MHz:                             800.0000
BogoMIPS:                                5199.99
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ss ht syscall nx pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology tsc_reliable nonstop_tsc cpuid aperfmperf tsc_known_freq pni pclmulqdq vmx ssse3 fma cx16 pcid sse4_1 sse4_2 x2apic movbe popcnt tsc_deadline_timer aes xsave avx f16c rdrand hypervisor lahf_lm abm 3dnowprefetch tpr_shadow ept vpid ept_ad fsgsbase tsc_adjust bmi1 hle avx2 smep bmi2 erms invpcid rtm avx512f avx512dq rdseed adx smap avx512ifma clflushopt clwb avx512cd sha_ni avx512bw avx512vl xsaveopt xsavec xgetbv1 xsaves user_shstk avx_vnni avx512_bf16 vnmi avx512vbmi umip waitpkg avx512_vbmi2 gfni vaes vpclmulqdq avx512_vnni avx512_bitalg avx512_vpopcntdq la57 rdpid cldemote movdiri movdir64b fsrm serialize tsxldtrk ibt amx_bf16 avx512_fp16 amx_tile amx_int8 arch_capabilities
Virtualization:                          VT-x
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               48 KiB (1 instance)
L1i cache:                               64 KiB (1 instance)
L2 cache:                                2 MiB (1 instance)
L3 cache:                                480 MiB (1 instance)
NUMA node(s):                            1
NUMA node0 CPU(s):                       0,1
Vulnerability Gather data sampling:      Not affected
Vulnerability Ghostwrite:                Not affected
Vulnerability Indirect target selection: Mitigation; Aligned branch/return thunks
Vulnerability Itlb multihit:             Not affected
Vulnerability L1tf:                      Not affected
Vulnerability Mds:                       Not affected
Vulnerability Meltdown:                  Not affected
Vulnerability Mmio stale data:           Not affected
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
| baseline | 3.16.0 | passed |
| current | 3.17.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.16.0",
  "version": "3.16.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.16.0/neqsim-3.16.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.17.0",
  "version": "3.17.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.17.0/neqsim-3.17.0.jar",
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
[INFO] Total time:  5.721 s
[INFO] Finished at: 2026-10-29T07:53:07Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.16.0 (neqsim-3.16.0.jar); requested: 3.16.0
$ mvn clean verify -Dneqsim.version=3.16.0
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
tpFlashLeanGas                                                 60.0000  (32 ms)
tpFlashWellFluidSrk                                            83.6406  (75 ms)
tpFlashWellFluidPr                                             83.6541  (51 ms)
tpFlashWellFluidWithProperties                                 5445.46  (76 ms)
phAndPsFlashWellFluid                                          2459.23  (71 ms)
Oct 29, 2026 7:53:18 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 7:53:18 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (455 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (221 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (20 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (53 ms)
saturationPointsWellFluid                                      1601.32  (70 ms)
singlePhaseGasPipelineSteadyState                              121.628  (867 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1075 ms)
levenbergMarquardtAntoine                                      1837.31  (7 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (17 ms)
dataReconciliation[100]                                        37.0132  (68 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.130 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.281 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.024 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 353712 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 92 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    0.00e+00 (tolerance: 1.00e-04) OK
  Temperature:  0.00e+00 (tolerance: 1.00e-04) OK
  Pressure:     0.00e+00 (tolerance: 1.00e-04) OK

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED

feed 5489240.1, gas 264776.8 + 378165.3, oil 1995465.5 + 2850762.6, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.449 MSm3/d, KA27841 A 102.5 bara, pipeline outlet 50.8 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 353.7 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 13509 ms, solved=true, gas=318849.56 kg/hr, water in/out=0.00027104531/1.5353072e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018484305, composition error=0.0029102350
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00013837326
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.51 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.16.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.16.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  06:36 min
[INFO] Finished at: 2026-10-29T07:59:45Z
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
# Warmup Iteration   1: 17.778 ms/op
# Warmup Iteration   2: 11.931 ms/op
Iteration   1: 12.051 ms/op
Iteration   2: 13.428 ms/op
Iteration   3: 12.239 ms/op

# Run progress: 2.17% complete, ETA 00:08:53
# Fork: 2 of 2
# Warmup Iteration   1: 18.790 ms/op
# Warmup Iteration   2: 11.596 ms/op
Iteration   1: 11.503 ms/op
Iteration   2: 11.414 ms/op
Iteration   3: 11.414 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  12.008 ±(99.9%) 2.184 ms/op [Average]
  (min, avg, max) = (11.414, 12.008, 13.428), stdev = 0.779
  CI (99.9%): [9.824, 14.192] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:35
# Fork: 1 of 2
# Warmup Iteration   1: 1.667 ms/op
# Warmup Iteration   2: 1.025 ms/op
Iteration   1: 1.005 ms/op
Iteration   2: 1.015 ms/op
Iteration   3: 1.008 ms/op

# Run progress: 6.52% complete, ETA 00:08:22
# Fork: 2 of 2
# Warmup Iteration   1: 2.074 ms/op
# Warmup Iteration   2: 1.063 ms/op
Iteration   1: 1.010 ms/op
Iteration   2: 1.008 ms/op
Iteration   3: 1.008 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.009 ±(99.9%) 0.009 ms/op [Average]
  (min, avg, max) = (1.005, 1.009, 1.015), stdev = 0.003
  CI (99.9%): [1.000, 1.018] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:09
# Fork: 1 of 2
# Warmup Iteration   1: 8.615 ms/op
# Warmup Iteration   2: 4.435 ms/op
Iteration   1: 4.090 ms/op
Iteration   2: 4.191 ms/op
Iteration   3: 4.096 ms/op

# Run progress: 10.87% complete, ETA 00:07:57
# Fork: 2 of 2
# Warmup Iteration   1: 9.288 ms/op
# Warmup Iteration   2: 4.297 ms/op
Iteration   1: 3.951 ms/op
Iteration   2: 4.082 ms/op
Iteration   3: 3.920 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.055 ±(99.9%) 0.284 ms/op [Average]
  (min, avg, max) = (3.920, 4.055, 4.191), stdev = 0.101
  CI (99.9%): [3.771, 4.339] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 8.246 ms/op
# Warmup Iteration   2: 3.900 ms/op
Iteration   1: 3.835 ms/op
Iteration   2: 3.845 ms/op
Iteration   3: 3.800 ms/op

# Run progress: 15.22% complete, ETA 00:07:34
# Fork: 2 of 2
# Warmup Iteration   1: 8.453 ms/op
# Warmup Iteration   2: 4.326 ms/op
Iteration   1: 3.922 ms/op
Iteration   2: 4.021 ms/op
Iteration   3: 3.892 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  3.886 ±(99.9%) 0.221 ms/op [Average]
  (min, avg, max) = (3.800, 3.886, 4.021), stdev = 0.079
  CI (99.9%): [3.665, 4.107] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 20.233 ms/op
# Warmup Iteration   2: 9.583 ms/op
Iteration   1: 7.581 ms/op
Iteration   2: 7.443 ms/op
Iteration   3: 7.492 ms/op

# Run progress: 19.57% complete, ETA 00:07:10
# Fork: 2 of 2
# Warmup Iteration   1: 18.391 ms/op
# Warmup Iteration   2: 9.924 ms/op
Iteration   1: 8.602 ms/op
Iteration   2: 8.469 ms/op
Iteration   3: 8.472 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  8.010 ±(99.9%) 1.560 ms/op [Average]
  (min, avg, max) = (7.443, 8.010, 8.602), stdev = 0.556
  CI (99.9%): [6.450, 9.570] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1198.093 ms/op
# Warmup Iteration   2: 534.097 ms/op
Iteration   1: 334.050 ms/op
Iteration   2: 280.442 ms/op
Iteration   3: 280.342 ms/op

# Run progress: 23.91% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 1208.138 ms/op
# Warmup Iteration   2: 451.539 ms/op
Iteration   1: 307.568 ms/op
Iteration   2: 271.362 ms/op
Iteration   3: 288.829 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  293.765 ±(99.9%) 65.131 ms/op [Average]
  (min, avg, max) = (271.362, 293.765, 334.050), stdev = 23.226
  CI (99.9%): [228.634, 358.897] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:33
# Fork: 1 of 2
# Warmup Iteration   1: 8423.782 ms/op
# Warmup Iteration   2: 4465.325 ms/op
Iteration   1: 4224.215 ms/op
Iteration   2: 3905.774 ms/op
Iteration   3: 3853.485 ms/op

# Run progress: 28.26% complete, ETA 00:06:56
# Fork: 2 of 2
# Warmup Iteration   1: 7901.112 ms/op
# Warmup Iteration   2: 4687.150 ms/op
Iteration   1: 4360.859 ms/op
Iteration   2: 3927.227 ms/op
Iteration   3: 3870.611 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  4023.695 ±(99.9%) 600.784 ms/op [Average]
  (min, avg, max) = (3853.485, 4023.695, 4360.859), stdev = 214.245
  CI (99.9%): [3422.911, 4624.479] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:07:12
# Fork: 1 of 2
# Warmup Iteration   1: 789.138 ms/op
# Warmup Iteration   2: 366.863 ms/op
Iteration   1: 340.578 ms/op
Iteration   2: 333.362 ms/op
Iteration   3: 336.254 ms/op

# Run progress: 32.61% complete, ETA 00:06:53
# Fork: 2 of 2
# Warmup Iteration   1: 1075.390 ms/op
# Warmup Iteration   2: 414.052 ms/op
Iteration   1: 348.882 ms/op
Iteration   2: 336.634 ms/op
Iteration   3: 334.495 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  338.367 ±(99.9%) 16.009 ms/op [Average]
  (min, avg, max) = (333.362, 338.367, 348.882), stdev = 5.709
  CI (99.9%): [322.358, 354.377] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:35
# Fork: 1 of 2
# Warmup Iteration   1: 2046.881 ms/op
# Warmup Iteration   2: 955.461 ms/op
Iteration   1: 815.208 ms/op
Iteration   2: 752.562 ms/op
Iteration   3: 796.208 ms/op

# Run progress: 36.96% complete, ETA 00:06:20
# Fork: 2 of 2
# Warmup Iteration   1: 2133.884 ms/op
# Warmup Iteration   2: 826.080 ms/op
Iteration   1: 798.646 ms/op
Iteration   2: 750.131 ms/op
Iteration   3: 787.397 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  783.359 ±(99.9%) 74.001 ms/op [Average]
  (min, avg, max) = (750.131, 783.359, 815.208), stdev = 26.389
  CI (99.9%): [709.358, 857.359] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:06:05
# Fork: 1 of 2
# Warmup Iteration   1: 0.196 ms/op
# Warmup Iteration   2: 0.086 ms/op
Iteration   1: 0.089 ms/op
Iteration   2: 0.085 ms/op
Iteration   3: 0.085 ms/op

# Run progress: 41.30% complete, ETA 00:05:48
# Fork: 2 of 2
# Warmup Iteration   1: 0.172 ms/op
# Warmup Iteration   2: 0.090 ms/op
Iteration   1: 0.094 ms/op
Iteration   2: 0.085 ms/op
Iteration   3: 0.084 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.087 ±(99.9%) 0.011 ms/op [Average]
  (min, avg, max) = (0.084, 0.087, 0.094), stdev = 0.004
  CI (99.9%): [0.076, 0.098] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:31
# Fork: 1 of 2
# Warmup Iteration   1: 9.918 ms/op
# Warmup Iteration   2: 6.593 ms/op
Iteration   1: 6.453 ms/op
Iteration   2: 6.429 ms/op
Iteration   3: 6.394 ms/op

# Run progress: 45.65% complete, ETA 00:05:16
# Fork: 2 of 2
# Warmup Iteration   1: 9.982 ms/op
# Warmup Iteration   2: 6.591 ms/op
Iteration   1: 6.452 ms/op
Iteration   2: 6.429 ms/op
Iteration   3: 7.170 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.554 ±(99.9%) 0.847 ms/op [Average]
  (min, avg, max) = (6.394, 6.554, 7.170), stdev = 0.302
  CI (99.9%): [5.707, 7.402] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:05:00
# Fork: 1 of 2
# Warmup Iteration   1: 0.975 ms/op
# Warmup Iteration   2: 0.624 ms/op
Iteration   1: 0.612 ms/op
Iteration   2: 0.612 ms/op
Iteration   3: 0.598 ms/op

# Run progress: 50.00% complete, ETA 00:04:46
# Fork: 2 of 2
# Warmup Iteration   1: 0.893 ms/op
# Warmup Iteration   2: 0.601 ms/op
Iteration   1: 0.596 ms/op
Iteration   2: 0.596 ms/op
Iteration   3: 0.596 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.602 ±(99.9%) 0.023 ms/op [Average]
  (min, avg, max) = (0.596, 0.602, 0.612), stdev = 0.008
  CI (99.9%): [0.579, 0.625] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:31
# Fork: 1 of 2
# Warmup Iteration   1: 1.960 ms/op
# Warmup Iteration   2: 1.502 ms/op
Iteration   1: 1.563 ms/op
Iteration   2: 1.403 ms/op
Iteration   3: 1.335 ms/op

# Run progress: 54.35% complete, ETA 00:04:17
# Fork: 2 of 2
# Warmup Iteration   1: 1.979 ms/op
# Warmup Iteration   2: 1.447 ms/op
Iteration   1: 1.367 ms/op
Iteration   2: 1.347 ms/op
Iteration   3: 1.361 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.396 ±(99.9%) 0.239 ms/op [Average]
  (min, avg, max) = (1.335, 1.396, 1.563), stdev = 0.085
  CI (99.9%): [1.158, 1.635] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:04:03
# Fork: 1 of 2
# Warmup Iteration   1: 168.170 ms/op
# Warmup Iteration   2: 33.784 ms/op
Iteration   1: 25.786 ms/op
Iteration   2: 22.715 ms/op
Iteration   3: 23.008 ms/op

# Run progress: 58.70% complete, ETA 00:03:50
# Fork: 2 of 2
# Warmup Iteration   1: 183.208 ms/op
# Warmup Iteration   2: 36.889 ms/op
Iteration   1: 24.718 ms/op
Iteration   2: 23.316 ms/op
Iteration   3: 21.899 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  23.574 ±(99.9%) 3.992 ms/op [Average]
  (min, avg, max) = (21.899, 23.574, 25.786), stdev = 1.423
  CI (99.9%): [19.582, 27.565] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:36
# Fork: 1 of 2
# Warmup Iteration   1: 59865.112 ms/op
# Warmup Iteration   2: 56512.352 ms/op
Iteration   1: 55120.420 ms/op
Iteration   2: 55407.173 ms/op
Iteration   3: 54398.226 ms/op

# Run progress: 63.04% complete, ETA 00:06:03
# Fork: 2 of 2
# Warmup Iteration   1: 59790.209 ms/op
# Warmup Iteration   2: 54786.479 ms/op
Iteration   1: 55299.132 ms/op
Iteration   2: 53931.699 ms/op
Iteration   3: 54171.580 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  54721.372 ±(99.9%) 1770.704 ms/op [Average]
  (min, avg, max) = (53931.699, 54721.372, 55407.173), stdev = 631.450
  CI (99.9%): [52950.667, 56492.076] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:59
# Fork: 1 of 2
# Warmup Iteration   1: 5549.435 ms/op
# Warmup Iteration   2: 6004.722 ms/op
Iteration   1: 5707.730 ms/op
Iteration   2: 5778.992 ms/op
Iteration   3: 12933.122 ms/op

# Run progress: 67.39% complete, ETA 00:09:55
# Fork: 2 of 2
# Warmup Iteration   1: 5456.869 ms/op
# Warmup Iteration   2: 6030.534 ms/op
Iteration   1: 5771.476 ms/op
Iteration   2: 5809.743 ms/op
Iteration   3: 13034.227 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  8172.548 ±(99.9%) 10451.112 ms/op [Average]
  (min, avg, max) = (5707.730, 8172.548, 13034.227), stdev = 3726.967
  CI (99.9%): [≈ 0, 18623.660] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:11:23
# Fork: 1 of 2
# Warmup Iteration   1: 13773.511 ms/op
# Warmup Iteration   2: 9428.029 ms/op
Iteration   1: 8127.036 ms/op
Iteration   2: 8557.758 ms/op
Iteration   3: 7877.671 ms/op

# Run progress: 71.74% complete, ETA 00:10:34
# Fork: 2 of 2
# Warmup Iteration   1: 14439.903 ms/op
# Warmup Iteration   2: 9223.453 ms/op
Iteration   1: 10037.423 ms/op
Iteration   2: 9567.504 ms/op
Iteration   3: 7834.478 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  8666.978 ±(99.9%) 2603.093 ms/op [Average]
  (min, avg, max) = (7834.478, 8666.978, 10037.423), stdev = 928.288
  CI (99.9%): [6063.885, 11270.072] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: Oct 29, 2026 8:27:29 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 8:27:29 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
75.668 ms/op
# Warmup Iteration   2: 46.608 ms/op
Iteration   1: 49.758 ms/op
Iteration   2: 44.187 ms/op
Iteration   3: 42.198 ms/op

# Run progress: 76.09% complete, ETA 00:08:46
# Fork: 2 of 2
# Warmup Iteration   1: Oct 29, 2026 8:27:41 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 8:27:41 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
71.856 ms/op
# Warmup Iteration   2: 45.945 ms/op
Iteration   1: 46.798 ms/op
Iteration   2: 51.454 ms/op
Iteration   3: 48.400 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  47.133 ±(99.9%) 9.739 ms/op [Average]
  (min, avg, max) = (42.198, 47.133, 51.454), stdev = 3.473
  CI (99.9%): [37.394, 56.871] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:07:48
# Fork: 1 of 2
# Warmup Iteration   1: 80.996 ms/op
# Warmup Iteration   2: 54.515 ms/op
Iteration   1: 57.015 ms/op
Iteration   2: 56.451 ms/op
Iteration   3: 56.382 ms/op

# Run progress: 80.43% complete, ETA 00:06:52
# Fork: 2 of 2
# Warmup Iteration   1: 121.560 ms/op
# Warmup Iteration   2: 66.398 ms/op
Iteration   1: 53.403 ms/op
Iteration   2: 51.466 ms/op
Iteration   3: 51.436 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  54.359 ±(99.9%) 7.242 ms/op [Average]
  (min, avg, max) = (51.436, 54.359, 57.015), stdev = 2.583
  CI (99.9%): [47.117, 61.601] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:08
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

# Run progress: 86.96% complete, ETA 00:04:19
# Fork: 1 of 2
# Warmup Iteration   1: 0.784 ms/op
# Warmup Iteration   2: 0.459 ms/op
Iteration   1: 0.517 ms/op
Iteration   2: 0.482 ms/op
Iteration   3: 0.467 ms/op

# Run progress: 89.13% complete, ETA 00:03:32
# Fork: 2 of 2
# Warmup Iteration   1: 1.045 ms/op
# Warmup Iteration   2: 0.501 ms/op
Iteration   1: 0.470 ms/op
Iteration   2: 0.459 ms/op
Iteration   3: 0.460 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.476 ±(99.9%) 0.061 ms/op [Average]
  (min, avg, max) = (0.459, 0.476, 0.517), stdev = 0.022
  CI (99.9%): [0.414, 0.537] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:46
# Fork: 1 of 2
# Warmup Iteration   1: 17.666 ms/op
# Warmup Iteration   2: 10.596 ms/op
Iteration   1: 10.450 ms/op
Iteration   2: 10.289 ms/op
Iteration   3: 9.619 ms/op

# Run progress: 93.48% complete, ETA 00:02:03
# Fork: 2 of 2
# Warmup Iteration   1: 15.955 ms/op
# Warmup Iteration   2: 10.077 ms/op
Iteration   1: 9.055 ms/op
Iteration   2: 9.794 ms/op
Iteration   3: 9.725 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.822 ±(99.9%) 1.404 ms/op [Average]
  (min, avg, max) = (9.055, 9.822, 10.450), stdev = 0.501
  CI (99.9%): [8.418, 11.226] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 29.276 ms/op
# Warmup Iteration   2: 19.262 ms/op
Iteration   1: 19.277 ms/op
Iteration   2: 19.213 ms/op
Iteration   3: 19.684 ms/op

# Run progress: 97.83% complete, ETA 00:00:39
# Fork: 2 of 2
# Warmup Iteration   1: 18.588 ms/op
# Warmup Iteration   2: 15.337 ms/op
Iteration   1: 15.299 ms/op
Iteration   2: 15.347 ms/op
Iteration   3: 15.286 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  17.351 ±(99.9%) 6.284 ms/op [Average]
  (min, avg, max) = (15.286, 17.351, 19.684), stdev = 2.241
  CI (99.9%): [11.067, 23.635] (assumes normal distribution)


# Run complete. Total time: 00:29:59

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

Benchmark                                                                                            (model)  (nodes)  Mode  Cnt      Score       Error  Units
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     12.008 ±     2.184  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.009 ±     0.009  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.055 ±     0.284  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      3.886 ±     0.221  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      8.010 ±     1.560  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    293.765 ±    65.131  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   4023.695 ±   600.784  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    338.367 ±    16.009  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    783.359 ±    74.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.087 ±     0.011  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.554 ±     0.847  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.602 ±     0.023  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.396 ±     0.239  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     23.574 ±     3.992  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  54721.372 ±  1770.704  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   8172.548 ± 10451.112  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   8666.978 ±  2603.093  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     47.133 ±     9.739  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     54.359 ±     7.242  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.476 ±     0.061  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.822 ±     1.404  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     17.351 ±     6.284  ms/op

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
[INFO] Total time:  4.063 s
[INFO] Finished at: 2026-10-29T08:29:50Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.17.0 (neqsim-3.17.0.jar); requested: 3.17.0
$ mvn clean verify -Dneqsim.version=3.17.0
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
tpFlashLeanGas                                                 60.0000  (33 ms)
tpFlashWellFluidSrk                                            83.6406  (85 ms)
tpFlashWellFluidPr                                             83.6541  (45 ms)
tpFlashWellFluidWithProperties                                 5445.46  (81 ms)
phAndPsFlashWellFluid                                          2459.23  (83 ms)
Oct 29, 2026 8:29:58 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 8:29:58 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (518 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (247 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (22 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (54 ms)
saturationPointsWellFluid                                      1601.32  (76 ms)
singlePhaseGasPipelineSteadyState                              121.628  (988 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1059 ms)
levenbergMarquardtAntoine                                      1837.31  (6 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (22 ms)
dataReconciliation[100]                                        37.0132  (51 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.484 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.785 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.037 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 193929 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 27 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    7.66e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.75e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     8.72e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.75e-03 after 27 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 0.000122 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 263818.8 + 376154.8, oil 1994937.8 + 2849751.0, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.376 MSm3/d, KA27841 A 102.7 bara, pipeline outlet 51.9 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 193.9 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 18636 ms, solved=true, gas=318849.56 kg/hr, water in/out=0.00027104531/1.5353073e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018484308, composition error=0.0029102354
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00013837322
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 18.64 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.17.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.17.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  03:57 min
[INFO] Finished at: 2026-10-29T08:33:48Z
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
# Warmup Iteration   1: 18.999 ms/op
# Warmup Iteration   2: 12.493 ms/op
Iteration   1: 12.457 ms/op
Iteration   2: 12.258 ms/op
Iteration   3: 12.259 ms/op

# Run progress: 2.17% complete, ETA 00:08:50
# Fork: 2 of 2
# Warmup Iteration   1: 20.903 ms/op
# Warmup Iteration   2: 12.317 ms/op
Iteration   1: 11.977 ms/op
Iteration   2: 12.019 ms/op
Iteration   3: 11.763 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  12.122 ±(99.9%) 0.698 ms/op [Average]
  (min, avg, max) = (11.763, 12.122, 12.457), stdev = 0.249
  CI (99.9%): [11.424, 12.821] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:36
# Fork: 1 of 2
# Warmup Iteration   1: 2.317 ms/op
# Warmup Iteration   2: 1.295 ms/op
Iteration   1: 1.064 ms/op
Iteration   2: 1.061 ms/op
Iteration   3: 1.056 ms/op

# Run progress: 6.52% complete, ETA 00:08:22
# Fork: 2 of 2
# Warmup Iteration   1: 2.116 ms/op
# Warmup Iteration   2: 1.139 ms/op
Iteration   1: 1.028 ms/op
Iteration   2: 1.029 ms/op
Iteration   3: 1.029 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.044 ±(99.9%) 0.049 ms/op [Average]
  (min, avg, max) = (1.028, 1.044, 1.064), stdev = 0.018
  CI (99.9%): [0.995, 1.094] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:09
# Fork: 1 of 2
# Warmup Iteration   1: 9.731 ms/op
# Warmup Iteration   2: 5.612 ms/op
Iteration   1: 4.495 ms/op
Iteration   2: 4.073 ms/op
Iteration   3: 4.421 ms/op

# Run progress: 10.87% complete, ETA 00:07:57
# Fork: 2 of 2
# Warmup Iteration   1: 10.483 ms/op
# Warmup Iteration   2: 5.301 ms/op
Iteration   1: 4.272 ms/op
Iteration   2: 4.290 ms/op
Iteration   3: 4.263 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.302 ±(99.9%) 0.410 ms/op [Average]
  (min, avg, max) = (4.073, 4.302, 4.495), stdev = 0.146
  CI (99.9%): [3.893, 4.712] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:46
# Fork: 1 of 2
# Warmup Iteration   1: 9.358 ms/op
# Warmup Iteration   2: 4.817 ms/op
Iteration   1: 4.207 ms/op
Iteration   2: 4.238 ms/op
Iteration   3: 4.531 ms/op

# Run progress: 15.22% complete, ETA 00:07:34
# Fork: 2 of 2
# Warmup Iteration   1: 9.867 ms/op
# Warmup Iteration   2: 5.411 ms/op
Iteration   1: 4.207 ms/op
Iteration   2: 4.207 ms/op
Iteration   3: 4.123 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  4.252 ±(99.9%) 0.398 ms/op [Average]
  (min, avg, max) = (4.123, 4.252, 4.531), stdev = 0.142
  CI (99.9%): [3.854, 4.650] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:24
# Fork: 1 of 2
# Warmup Iteration   1: 18.998 ms/op
# Warmup Iteration   2: 11.537 ms/op
Iteration   1: 7.874 ms/op
Iteration   2: 7.664 ms/op
Iteration   3: 7.770 ms/op

# Run progress: 19.57% complete, ETA 00:07:12
# Fork: 2 of 2
# Warmup Iteration   1: 18.883 ms/op
# Warmup Iteration   2: 12.009 ms/op
Iteration   1: 8.099 ms/op
Iteration   2: 7.671 ms/op
Iteration   3: 8.308 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  7.898 ±(99.9%) 0.723 ms/op [Average]
  (min, avg, max) = (7.664, 7.898, 8.308), stdev = 0.258
  CI (99.9%): [7.175, 8.620] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:00
# Fork: 1 of 2
# Warmup Iteration   1: 2214.852 ms/op
# Warmup Iteration   2: 572.480 ms/op
Iteration   1: 504.667 ms/op
Iteration   2: 359.416 ms/op
Iteration   3: 290.931 ms/op

# Run progress: 23.91% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 2135.711 ms/op
# Warmup Iteration   2: 599.096 ms/op
Iteration   1: 347.743 ms/op
Iteration   2: 292.007 ms/op
Iteration   3: 316.232 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  351.832 ±(99.9%) 224.293 ms/op [Average]
  (min, avg, max) = (290.931, 351.832, 504.667), stdev = 79.985
  CI (99.9%): [127.540, 576.125] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:33
# Fork: 1 of 2
# Warmup Iteration   1: 7280.626 ms/op
# Warmup Iteration   2: 4929.173 ms/op
Iteration   1: 4070.474 ms/op
Iteration   2: 4019.796 ms/op
Iteration   3: 3915.401 ms/op

# Run progress: 28.26% complete, ETA 00:06:54
# Fork: 2 of 2
# Warmup Iteration   1: 8132.905 ms/op
# Warmup Iteration   2: 4403.586 ms/op
Iteration   1: 4033.485 ms/op
Iteration   2: 3888.039 ms/op
Iteration   3: 3868.400 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  3965.932 ±(99.9%) 239.678 ms/op [Average]
  (min, avg, max) = (3868.400, 3965.932, 4070.474), stdev = 85.472
  CI (99.9%): [3726.254, 4205.611] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:07:09
# Fork: 1 of 2
# Warmup Iteration   1: 1091.263 ms/op
# Warmup Iteration   2: 415.041 ms/op
Iteration   1: 336.572 ms/op
Iteration   2: 325.861 ms/op
Iteration   3: 328.313 ms/op

# Run progress: 32.61% complete, ETA 00:06:51
# Fork: 2 of 2
# Warmup Iteration   1: 769.573 ms/op
# Warmup Iteration   2: 407.190 ms/op
Iteration   1: 372.185 ms/op
Iteration   2: 326.119 ms/op
Iteration   3: 327.028 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  336.013 ±(99.9%) 50.937 ms/op [Average]
  (min, avg, max) = (325.861, 336.013, 372.185), stdev = 18.165
  CI (99.9%): [285.076, 386.950] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:34
# Fork: 1 of 2
# Warmup Iteration   1: 2033.233 ms/op
# Warmup Iteration   2: 837.328 ms/op
Iteration   1: 817.842 ms/op
Iteration   2: 749.891 ms/op
Iteration   3: 793.150 ms/op

# Run progress: 36.96% complete, ETA 00:06:19
# Fork: 2 of 2
# Warmup Iteration   1: 2189.038 ms/op
# Warmup Iteration   2: 833.819 ms/op
Iteration   1: 802.897 ms/op
Iteration   2: 741.266 ms/op
Iteration   3: 786.609 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  781.942 ±(99.9%) 84.658 ms/op [Average]
  (min, avg, max) = (741.266, 781.942, 817.842), stdev = 30.190
  CI (99.9%): [697.285, 866.600] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:06:04
# Fork: 1 of 2
# Warmup Iteration   1: 0.238 ms/op
# Warmup Iteration   2: 0.102 ms/op
Iteration   1: 0.086 ms/op
Iteration   2: 0.083 ms/op
Iteration   3: 0.083 ms/op

# Run progress: 41.30% complete, ETA 00:05:47
# Fork: 2 of 2
# Warmup Iteration   1: 0.181 ms/op
# Warmup Iteration   2: 0.085 ms/op
Iteration   1: 0.084 ms/op
Iteration   2: 0.083 ms/op
Iteration   3: 0.083 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.084 ±(99.9%) 0.003 ms/op [Average]
  (min, avg, max) = (0.083, 0.084, 0.086), stdev = 0.001
  CI (99.9%): [0.081, 0.087] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:31
# Fork: 1 of 2
# Warmup Iteration   1: 10.015 ms/op
# Warmup Iteration   2: 6.647 ms/op
Iteration   1: 6.480 ms/op
Iteration   2: 6.414 ms/op
Iteration   3: 6.384 ms/op

# Run progress: 45.65% complete, ETA 00:05:15
# Fork: 2 of 2
# Warmup Iteration   1: 11.270 ms/op
# Warmup Iteration   2: 7.606 ms/op
Iteration   1: 6.649 ms/op
Iteration   2: 6.445 ms/op
Iteration   3: 6.388 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.460 ±(99.9%) 0.279 ms/op [Average]
  (min, avg, max) = (6.384, 6.460, 6.649), stdev = 0.099
  CI (99.9%): [6.181, 6.739] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:05:00
# Fork: 1 of 2
# Warmup Iteration   1: 0.903 ms/op
# Warmup Iteration   2: 0.601 ms/op
Iteration   1: 0.594 ms/op
Iteration   2: 0.594 ms/op
Iteration   3: 0.596 ms/op

# Run progress: 50.00% complete, ETA 00:04:45
# Fork: 2 of 2
# Warmup Iteration   1: 0.908 ms/op
# Warmup Iteration   2: 0.634 ms/op
Iteration   1: 0.679 ms/op
Iteration   2: 0.639 ms/op
Iteration   3: 0.640 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.624 ±(99.9%) 0.099 ms/op [Average]
  (min, avg, max) = (0.594, 0.624, 0.679), stdev = 0.035
  CI (99.9%): [0.525, 0.722] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:30
# Fork: 1 of 2
# Warmup Iteration   1: 2.163 ms/op
# Warmup Iteration   2: 1.414 ms/op
Iteration   1: 1.394 ms/op
Iteration   2: 1.343 ms/op
Iteration   3: 1.341 ms/op

# Run progress: 54.35% complete, ETA 00:04:16
# Fork: 2 of 2
# Warmup Iteration   1: 1.977 ms/op
# Warmup Iteration   2: 1.435 ms/op
Iteration   1: 1.345 ms/op
Iteration   2: 1.342 ms/op
Iteration   3: 1.338 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.350 ±(99.9%) 0.060 ms/op [Average]
  (min, avg, max) = (1.338, 1.350, 1.394), stdev = 0.021
  CI (99.9%): [1.290, 1.410] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:04:03
# Fork: 1 of 2
# Warmup Iteration   1: 143.963 ms/op
# Warmup Iteration   2: 35.181 ms/op
Iteration   1: 25.885 ms/op
Iteration   2: 24.194 ms/op
Iteration   3: 21.629 ms/op

# Run progress: 58.70% complete, ETA 00:03:49
# Fork: 2 of 2
# Warmup Iteration   1: 169.410 ms/op
# Warmup Iteration   2: 38.291 ms/op
Iteration   1: 26.029 ms/op
Iteration   2: 23.685 ms/op
Iteration   3: 21.712 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  23.856 ±(99.9%) 5.399 ms/op [Average]
  (min, avg, max) = (21.629, 23.856, 26.029), stdev = 1.925
  CI (99.9%): [18.456, 29.255] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:36
# Fork: 1 of 2
# Warmup Iteration   1: 58360.841 ms/op
# Warmup Iteration   2: 55400.849 ms/op
Iteration   1: 53754.237 ms/op
Iteration   2: 53667.583 ms/op
Iteration   3: 52781.369 ms/op

# Run progress: 63.04% complete, ETA 00:05:58
# Fork: 2 of 2
# Warmup Iteration   1: 57446.889 ms/op
# Warmup Iteration   2: 53795.799 ms/op
Iteration   1: 52838.319 ms/op
Iteration   2: 53106.028 ms/op
Iteration   3: 52832.457 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  53163.332 ±(99.9%) 1233.669 ms/op [Average]
  (min, avg, max) = (52781.369, 53163.332, 53754.237), stdev = 439.938
  CI (99.9%): [51929.663, 54397.002] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:51
# Fork: 1 of 2
# Warmup Iteration   1: 11913.063 ms/op
# Warmup Iteration   2: 10944.783 ms/op
Iteration   1: 8161.235 ms/op
Iteration   2: 7195.865 ms/op
Iteration   3: 8485.814 ms/op

# Run progress: 67.39% complete, ETA 00:08:48
# Fork: 2 of 2
# Warmup Iteration   1: 6671.439 ms/op
# Warmup Iteration   2: 4565.779 ms/op
Iteration   1: 5312.126 ms/op
Iteration   2: 3849.996 ms/op
Iteration   3: 4754.519 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  6293.259 ±(99.9%) 5381.001 ms/op [Average]
  (min, avg, max) = (3849.996, 6293.259, 8485.814), stdev = 1918.917
  CI (99.9%): [912.258, 11674.260] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:09:41
# Fork: 1 of 2
# Warmup Iteration   1: 17063.041 ms/op
# Warmup Iteration   2: 11892.143 ms/op
Iteration   1: 11162.722 ms/op
Iteration   2: 11223.707 ms/op
Iteration   3: 10589.323 ms/op

# Run progress: 71.74% complete, ETA 00:09:08
# Fork: 2 of 2
# Warmup Iteration   1: 18289.564 ms/op
# Warmup Iteration   2: 13269.482 ms/op
Iteration   1: 11167.397 ms/op
Iteration   2: 11385.680 ms/op
Iteration   3: 10647.082 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  11029.319 ±(99.9%) 922.695 ms/op [Average]
  (min, avg, max) = (10589.323, 11029.319, 11385.680), stdev = 329.042
  CI (99.9%): [10106.624, 11952.013] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:08:34
# Fork: 1 of 2
# Warmup Iteration   1: Oct 29, 2026 8:58:07 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 8:58:07 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
96.330 ms/op
# Warmup Iteration   2: 51.469 ms/op
Iteration   1: 45.991 ms/op
Iteration   2: 44.428 ms/op
Iteration   3: 43.542 ms/op

# Run progress: 76.09% complete, ETA 00:07:41
# Fork: 2 of 2
# Warmup Iteration   1: Oct 29, 2026 8:58:18 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 8:58:18 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
72.521 ms/op
# Warmup Iteration   2: 40.629 ms/op
Iteration   1: 38.960 ms/op
Iteration   2: 38.632 ms/op
Iteration   3: 38.769 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  41.720 ±(99.9%) 9.280 ms/op [Average]
  (min, avg, max) = (38.632, 41.720, 45.991), stdev = 3.309
  CI (99.9%): [32.440, 51.001] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:06:51
# Fork: 1 of 2
# Warmup Iteration   1: 101.706 ms/op
# Warmup Iteration   2: 56.609 ms/op
Iteration   1: 52.061 ms/op
Iteration   2: 49.844 ms/op
Iteration   3: 51.409 ms/op

# Run progress: 80.43% complete, ETA 00:06:02
# Fork: 2 of 2
# Warmup Iteration   1: 107.785 ms/op
# Warmup Iteration   2: 51.998 ms/op
Iteration   1: 54.117 ms/op
Iteration   2: 51.928 ms/op
Iteration   3: 51.106 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  51.744 ±(99.9%) 3.945 ms/op [Average]
  (min, avg, max) = (49.844, 51.744, 54.117), stdev = 1.407
  CI (99.9%): [47.799, 55.689] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:05:16
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:31
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

# Run progress: 86.96% complete, ETA 00:03:48
# Fork: 1 of 2
# Warmup Iteration   1: 0.769 ms/op
# Warmup Iteration   2: 0.463 ms/op
Iteration   1: 0.443 ms/op
Iteration   2: 0.425 ms/op
Iteration   3: 0.428 ms/op

# Run progress: 89.13% complete, ETA 00:03:07
# Fork: 2 of 2
# Warmup Iteration   1: 0.791 ms/op
# Warmup Iteration   2: 0.461 ms/op
Iteration   1: 0.445 ms/op
Iteration   2: 0.441 ms/op
Iteration   3: 0.441 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.437 ±(99.9%) 0.024 ms/op [Average]
  (min, avg, max) = (0.425, 0.437, 0.445), stdev = 0.009
  CI (99.9%): [0.413, 0.462] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:27
# Fork: 1 of 2
# Warmup Iteration   1: 17.181 ms/op
# Warmup Iteration   2: 12.264 ms/op
Iteration   1: 12.108 ms/op
Iteration   2: 10.793 ms/op
Iteration   3: 10.087 ms/op

# Run progress: 93.48% complete, ETA 00:01:48
# Fork: 2 of 2
# Warmup Iteration   1: 17.440 ms/op
# Warmup Iteration   2: 10.427 ms/op
Iteration   1: 10.382 ms/op
Iteration   2: 10.085 ms/op
Iteration   3: 9.507 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  10.494 ±(99.9%) 2.513 ms/op [Average]
  (min, avg, max) = (9.507, 10.494, 12.108), stdev = 0.896
  CI (99.9%): [7.981, 13.006] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:11
# Fork: 1 of 2
# Warmup Iteration   1: 24.155 ms/op
# Warmup Iteration   2: 19.231 ms/op
Iteration   1: 19.171 ms/op
Iteration   2: 21.982 ms/op
Iteration   3: 21.186 ms/op

# Run progress: 97.83% complete, ETA 00:00:35
# Fork: 2 of 2
# Warmup Iteration   1: 20.547 ms/op
# Warmup Iteration   2: 15.237 ms/op
Iteration   1: 15.214 ms/op
Iteration   2: 15.214 ms/op
Iteration   3: 15.171 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  17.990 ±(99.9%) 8.948 ms/op [Average]
  (min, avg, max) = (15.171, 17.990, 21.982), stdev = 3.191
  CI (99.9%): [9.042, 26.938] (assumes normal distribution)


# Run complete. Total time: 00:26:33

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     12.122 ±    0.698  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.044 ±    0.049  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.302 ±    0.410  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      4.252 ±    0.398  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      7.898 ±    0.723  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    351.832 ±  224.293  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   3965.932 ±  239.678  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    336.013 ±   50.937  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    781.942 ±   84.658  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.084 ±    0.003  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.460 ±    0.279  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.624 ±    0.099  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.350 ±    0.060  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     23.856 ±    5.399  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  53163.332 ± 1233.669  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   6293.259 ± 5381.001  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  11029.319 ±  922.695  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     41.720 ±    9.280  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     51.744 ±    3.945  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.437 ±    0.024  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     10.494 ±    2.513  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     17.990 ±    8.948  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.16.0 -> 3.17.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 12 lower, 11 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| process.TEGprocess.testTEGprocess | 8666.98 | 11029.3 | +27.26% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 8172.55 | 6293.26 | -23.00% | Overlapping CIs |
| flash.TPflash.testFlash | 293.765 | 351.832 | +19.77% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 47.1325 | 41.7204 | -11.48% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 3.88597 | 4.252 | +9.42% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.475866 | 0.437162 | -8.13% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.82194 | 10.4937 | +6.84% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.05503 | 4.30226 | +6.10% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 54.3588 | 51.7442 | -4.81% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 17.3511 | 17.9899 | +3.68% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
