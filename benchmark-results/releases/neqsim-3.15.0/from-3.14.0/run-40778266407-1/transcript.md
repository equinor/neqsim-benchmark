# NeqSim 3.15.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.14.0 |
| Current | 3.15.0 |
| Source commit | `61f718b07d150d4174cbd8b72f324c3c22431492` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40778266407) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "61f718b07d150d4174cbd8b72f324c3c22431492",
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
CPU(s) scaling MHz:                      161%
CPU max MHz:                             2600.0000
CPU min MHz:                             800.0000
BogoMIPS:                                5200.00
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
[INFO] Total time:  6.458 s
[INFO] Finished at: 2026-10-28T22:13:56Z
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
tpFlashLeanGas                                                 60.0000  (28 ms)
tpFlashWellFluidSrk                                            83.6406  (74 ms)
tpFlashWellFluidPr                                             83.6541  (49 ms)
tpFlashWellFluidWithProperties                                 5445.46  (60 ms)
phAndPsFlashWellFluid                                          2459.23  (56 ms)
Oct 28, 2026 10:14:09 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 10:14:09 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (436 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (221 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (17 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (69 ms)
saturationPointsWellFluid                                      1601.32  (59 ms)
singlePhaseGasPipelineSteadyState                              121.628  (851 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1061 ms)
levenbergMarquardtAntoine                                      1837.31  (15 ms)
levenbergMarquardtDoubleExponential                            5.57177  (4 ms)
dataReconciliation[20]                                         7.89841  (18 ms)
dataReconciliation[100]                                        37.0132  (73 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.456 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.917 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.035 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 367648 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 367.7 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 16255 ms, solved=true, gas=318849.57 kg/hr, water in/out=0.00027173922/1.5382411e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018460518, composition error=0.0029034392
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=0.00013719865
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 16.26 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  06:58 min
[INFO] Finished at: 2026-10-28T22:20:55Z
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
# Warmup Iteration   1: 18.119 ms/op
# Warmup Iteration   2: 12.239 ms/op
Iteration   1: 12.199 ms/op
Iteration   2: 11.638 ms/op
Iteration   3: 11.568 ms/op

# Run progress: 2.17% complete, ETA 00:08:52
# Fork: 2 of 2
# Warmup Iteration   1: 17.825 ms/op
# Warmup Iteration   2: 14.107 ms/op
Iteration   1: 13.620 ms/op
Iteration   2: 12.935 ms/op
Iteration   3: 11.770 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  12.288 ±(99.9%) 2.316 ms/op [Average]
  (min, avg, max) = (11.568, 12.288, 13.620), stdev = 0.826
  CI (99.9%): [9.972, 14.604] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:37
# Fork: 1 of 2
# Warmup Iteration   1: 2.344 ms/op
# Warmup Iteration   2: 1.132 ms/op
Iteration   1: 1.095 ms/op
Iteration   2: 1.127 ms/op
Iteration   3: 1.180 ms/op

# Run progress: 6.52% complete, ETA 00:08:24
# Fork: 2 of 2
# Warmup Iteration   1: 2.140 ms/op
# Warmup Iteration   2: 1.099 ms/op
Iteration   1: 1.066 ms/op
Iteration   2: 1.077 ms/op
Iteration   3: 1.053 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.100 ±(99.9%) 0.132 ms/op [Average]
  (min, avg, max) = (1.053, 1.100, 1.180), stdev = 0.047
  CI (99.9%): [0.968, 1.232] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:13
# Fork: 1 of 2
# Warmup Iteration   1: 9.341 ms/op
# Warmup Iteration   2: 5.042 ms/op
Iteration   1: 4.146 ms/op
Iteration   2: 4.155 ms/op
Iteration   3: 4.247 ms/op

# Run progress: 10.87% complete, ETA 00:08:01
# Fork: 2 of 2
# Warmup Iteration   1: 8.821 ms/op
# Warmup Iteration   2: 4.398 ms/op
Iteration   1: 4.077 ms/op
Iteration   2: 4.412 ms/op
Iteration   3: 4.389 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.238 ±(99.9%) 0.385 ms/op [Average]
  (min, avg, max) = (4.077, 4.238, 4.412), stdev = 0.137
  CI (99.9%): [3.853, 4.623] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:49
# Fork: 1 of 2
# Warmup Iteration   1: 9.574 ms/op
# Warmup Iteration   2: 4.647 ms/op
Iteration   1: 4.149 ms/op
Iteration   2: 4.099 ms/op
Iteration   3: 4.284 ms/op

# Run progress: 15.22% complete, ETA 00:07:38
# Fork: 2 of 2
# Warmup Iteration   1: 8.974 ms/op
# Warmup Iteration   2: 4.524 ms/op
Iteration   1: 3.969 ms/op
Iteration   2: 4.256 ms/op
Iteration   3: 4.522 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  4.213 ±(99.9%) 0.531 ms/op [Average]
  (min, avg, max) = (3.969, 4.213, 4.522), stdev = 0.189
  CI (99.9%): [3.682, 4.744] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:26
# Fork: 1 of 2
# Warmup Iteration   1: 19.324 ms/op
# Warmup Iteration   2: 9.697 ms/op
Iteration   1: 7.772 ms/op
Iteration   2: 7.761 ms/op
Iteration   3: 8.345 ms/op

# Run progress: 19.57% complete, ETA 00:07:14
# Fork: 2 of 2
# Warmup Iteration   1: 23.357 ms/op
# Warmup Iteration   2: 10.182 ms/op
Iteration   1: 7.894 ms/op
Iteration   2: 7.802 ms/op
Iteration   3: 7.998 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  7.929 ±(99.9%) 0.624 ms/op [Average]
  (min, avg, max) = (7.761, 7.929, 8.345), stdev = 0.223
  CI (99.9%): [7.305, 8.553] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:03
# Fork: 1 of 2
# Warmup Iteration   1: 1286.362 ms/op
# Warmup Iteration   2: 526.514 ms/op
Iteration   1: 337.719 ms/op
Iteration   2: 293.937 ms/op
Iteration   3: 287.983 ms/op

# Run progress: 23.91% complete, ETA 00:06:49
# Fork: 2 of 2
# Warmup Iteration   1: 1342.824 ms/op
# Warmup Iteration   2: 548.648 ms/op
Iteration   1: 342.840 ms/op
Iteration   2: 329.649 ms/op
Iteration   3: 328.106 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  320.039 ±(99.9%) 65.149 ms/op [Average]
  (min, avg, max) = (287.983, 320.039, 342.840), stdev = 23.233
  CI (99.9%): [254.890, 385.187] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:38
# Fork: 1 of 2
# Warmup Iteration   1: 8020.320 ms/op
# Warmup Iteration   2: 4710.555 ms/op
Iteration   1: 4009.689 ms/op
Iteration   2: 3936.148 ms/op
Iteration   3: 4020.204 ms/op

# Run progress: 28.26% complete, ETA 00:06:59
# Fork: 2 of 2
# Warmup Iteration   1: 8638.068 ms/op
# Warmup Iteration   2: 4674.066 ms/op
Iteration   1: 4004.167 ms/op
Iteration   2: 3979.032 ms/op
Iteration   3: 4072.515 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  4003.626 ±(99.9%) 126.752 ms/op [Average]
  (min, avg, max) = (3936.148, 4003.626, 4072.515), stdev = 45.201
  CI (99.9%): [3876.873, 4130.378] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:07:16
# Fork: 1 of 2
# Warmup Iteration   1: 1148.121 ms/op
# Warmup Iteration   2: 407.164 ms/op
Iteration   1: 373.777 ms/op
Iteration   2: 357.364 ms/op
Iteration   3: 344.499 ms/op

# Run progress: 32.61% complete, ETA 00:06:58
# Fork: 2 of 2
# Warmup Iteration   1: 1073.593 ms/op
# Warmup Iteration   2: 386.071 ms/op
Iteration   1: 356.139 ms/op
Iteration   2: 344.755 ms/op
Iteration   3: 347.987 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  354.087 ±(99.9%) 31.197 ms/op [Average]
  (min, avg, max) = (344.499, 354.087, 373.777), stdev = 11.125
  CI (99.9%): [322.889, 385.284] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 2111.377 ms/op
# Warmup Iteration   2: 845.836 ms/op
Iteration   1: 821.917 ms/op
Iteration   2: 758.792 ms/op
Iteration   3: 812.681 ms/op

# Run progress: 36.96% complete, ETA 00:06:24
# Fork: 2 of 2
# Warmup Iteration   1: 2089.291 ms/op
# Warmup Iteration   2: 928.801 ms/op
Iteration   1: 850.707 ms/op
Iteration   2: 777.517 ms/op
Iteration   3: 819.475 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  806.848 ±(99.9%) 93.121 ms/op [Average]
  (min, avg, max) = (758.792, 806.848, 850.707), stdev = 33.208
  CI (99.9%): [713.727, 899.969] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:06:10
# Fork: 1 of 2
# Warmup Iteration   1: 0.186 ms/op
# Warmup Iteration   2: 0.089 ms/op
Iteration   1: 0.088 ms/op
Iteration   2: 0.093 ms/op
Iteration   3: 0.090 ms/op

# Run progress: 41.30% complete, ETA 00:05:52
# Fork: 2 of 2
# Warmup Iteration   1: 0.239 ms/op
# Warmup Iteration   2: 0.089 ms/op
Iteration   1: 0.093 ms/op
Iteration   2: 0.093 ms/op
Iteration   3: 0.087 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.091 ±(99.9%) 0.008 ms/op [Average]
  (min, avg, max) = (0.087, 0.091, 0.093), stdev = 0.003
  CI (99.9%): [0.083, 0.098] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:35
# Fork: 1 of 2
# Warmup Iteration   1: 10.590 ms/op
# Warmup Iteration   2: 6.673 ms/op
Iteration   1: 6.554 ms/op
Iteration   2: 6.596 ms/op
Iteration   3: 6.579 ms/op

# Run progress: 45.65% complete, ETA 00:05:19
# Fork: 2 of 2
# Warmup Iteration   1: 11.818 ms/op
# Warmup Iteration   2: 7.573 ms/op
Iteration   1: 7.372 ms/op
Iteration   2: 6.626 ms/op
Iteration   3: 6.620 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.724 ±(99.9%) 0.892 ms/op [Average]
  (min, avg, max) = (6.554, 6.724, 7.372), stdev = 0.318
  CI (99.9%): [5.832, 7.617] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:05:04
# Fork: 1 of 2
# Warmup Iteration   1: 1.024 ms/op
# Warmup Iteration   2: 0.644 ms/op
Iteration   1: 0.635 ms/op
Iteration   2: 0.610 ms/op
Iteration   3: 0.615 ms/op

# Run progress: 50.00% complete, ETA 00:04:49
# Fork: 2 of 2
# Warmup Iteration   1: 0.942 ms/op
# Warmup Iteration   2: 0.610 ms/op
Iteration   1: 0.600 ms/op
Iteration   2: 0.606 ms/op
Iteration   3: 0.618 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.614 ±(99.9%) 0.034 ms/op [Average]
  (min, avg, max) = (0.600, 0.614, 0.635), stdev = 0.012
  CI (99.9%): [0.580, 0.648] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:34
# Fork: 1 of 2
# Warmup Iteration   1: 2.029 ms/op
# Warmup Iteration   2: 1.472 ms/op
Iteration   1: 1.422 ms/op
Iteration   2: 1.374 ms/op
Iteration   3: 1.383 ms/op

# Run progress: 54.35% complete, ETA 00:04:20
# Fork: 2 of 2
# Warmup Iteration   1: 2.056 ms/op
# Warmup Iteration   2: 1.439 ms/op
Iteration   1: 1.627 ms/op
Iteration   2: 1.533 ms/op
Iteration   3: 1.448 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.464 ±(99.9%) 0.276 ms/op [Average]
  (min, avg, max) = (1.374, 1.464, 1.627), stdev = 0.098
  CI (99.9%): [1.189, 1.740] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:04:06
# Fork: 1 of 2
# Warmup Iteration   1: 154.900 ms/op
# Warmup Iteration   2: 36.225 ms/op
Iteration   1: 27.571 ms/op
Iteration   2: 25.343 ms/op
Iteration   3: 25.447 ms/op

# Run progress: 58.70% complete, ETA 00:03:52
# Fork: 2 of 2
# Warmup Iteration   1: 184.243 ms/op
# Warmup Iteration   2: 36.220 ms/op
Iteration   1: 25.973 ms/op
Iteration   2: 23.629 ms/op
Iteration   3: 23.497 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  25.243 ±(99.9%) 4.281 ms/op [Average]
  (min, avg, max) = (23.497, 25.243, 27.571), stdev = 1.527
  CI (99.9%): [20.962, 29.525] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:38
# Fork: 1 of 2
# Warmup Iteration   1: 60935.718 ms/op
# Warmup Iteration   2: 54971.230 ms/op
Iteration   1: 55301.803 ms/op
Iteration   2: 53344.604 ms/op
Iteration   3: 54389.898 ms/op

# Run progress: 63.04% complete, ETA 00:06:03
# Fork: 2 of 2
# Warmup Iteration   1: 59187.806 ms/op
# Warmup Iteration   2: 53751.632 ms/op
Iteration   1: 53850.284 ms/op
Iteration   2: 54446.496 ms/op
Iteration   3: 54030.002 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  54227.181 ±(99.9%) 1855.542 ms/op [Average]
  (min, avg, max) = (53344.604, 54227.181, 55301.803), stdev = 661.704
  CI (99.9%): [52371.640, 56082.723] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:58
# Fork: 1 of 2
# Warmup Iteration   1: 9959.783 ms/op
# Warmup Iteration   2: 5583.706 ms/op
Iteration   1: 7156.513 ms/op
Iteration   2: 6109.897 ms/op
Iteration   3: 5737.254 ms/op

# Run progress: 67.39% complete, ETA 00:10:01
# Fork: 2 of 2
# Warmup Iteration   1: 9681.716 ms/op
# Warmup Iteration   2: 5574.452 ms/op
Iteration   1: 7324.057 ms/op
Iteration   2: 5774.138 ms/op
Iteration   3: 6356.617 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  6409.746 ±(99.9%) 1919.425 ms/op [Average]
  (min, avg, max) = (5737.254, 6409.746, 7324.057), stdev = 684.485
  CI (99.9%): [4490.321, 8329.171] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:11:35
# Fork: 1 of 2
# Warmup Iteration   1: 15311.038 ms/op
# Warmup Iteration   2: 10379.002 ms/op
Iteration   1: 10185.753 ms/op
Iteration   2: 9603.092 ms/op
Iteration   3: 8528.107 ms/op

# Run progress: 71.74% complete, ETA 00:10:48
# Fork: 2 of 2
# Warmup Iteration   1: 14569.085 ms/op
# Warmup Iteration   2: 11483.194 ms/op
Iteration   1: 10044.988 ms/op
Iteration   2: 9515.621 ms/op
Iteration   3: 10562.423 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  9739.997 ±(99.9%) 1985.185 ms/op [Average]
  (min, avg, max) = (8528.107, 9739.997, 10562.423), stdev = 707.936
  CI (99.9%): [7754.813, 11725.182] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:10:00
# Fork: 1 of 2
# Warmup Iteration   1: Oct 28, 2026 10:49:18 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 10:49:18 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
85.245 ms/op
# Warmup Iteration   2: 46.709 ms/op
Iteration   1: 44.857 ms/op
Iteration   2: 43.781 ms/op
Iteration   3: 44.126 ms/op

# Run progress: 76.09% complete, ETA 00:08:58
# Fork: 2 of 2
# Warmup Iteration   1: Oct 28, 2026 10:49:30 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 10:49:30 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
83.897 ms/op
# Warmup Iteration   2: 41.243 ms/op
Iteration   1: 41.447 ms/op
Iteration   2: 45.367 ms/op
Iteration   3: 43.190 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  43.795 ±(99.9%) 3.883 ms/op [Average]
  (min, avg, max) = (41.447, 43.795, 45.367), stdev = 1.385
  CI (99.9%): [39.911, 47.678] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:07:58
# Fork: 1 of 2
# Warmup Iteration   1: 102.702 ms/op
# Warmup Iteration   2: 65.071 ms/op
Iteration   1: 58.751 ms/op
Iteration   2: 59.957 ms/op
Iteration   3: 59.831 ms/op

# Run progress: 80.43% complete, ETA 00:07:02
# Fork: 2 of 2
# Warmup Iteration   1: 81.746 ms/op
# Warmup Iteration   2: 55.204 ms/op
Iteration   1: 55.235 ms/op
Iteration   2: 54.548 ms/op
Iteration   3: 60.259 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  58.097 ±(99.9%) 7.133 ms/op [Average]
  (min, avg, max) = (54.548, 58.097, 60.259), stdev = 2.544
  CI (99.9%): [50.964, 65.230] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:06:07
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:15
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

# Run progress: 86.96% complete, ETA 00:04:25
# Fork: 1 of 2
# Warmup Iteration   1: 0.736 ms/op
# Warmup Iteration   2: 0.534 ms/op
Iteration   1: 0.505 ms/op
Iteration   2: 0.440 ms/op
Iteration   3: 0.444 ms/op

# Run progress: 89.13% complete, ETA 00:03:37
# Fork: 2 of 2
# Warmup Iteration   1: 0.753 ms/op
# Warmup Iteration   2: 0.462 ms/op
Iteration   1: 0.445 ms/op
Iteration   2: 0.449 ms/op
Iteration   3: 0.466 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.458 ±(99.9%) 0.070 ms/op [Average]
  (min, avg, max) = (0.440, 0.458, 0.505), stdev = 0.025
  CI (99.9%): [0.389, 0.528] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:50
# Fork: 1 of 2
# Warmup Iteration   1: 19.340 ms/op
# Warmup Iteration   2: 10.942 ms/op
Iteration   1: 9.972 ms/op
Iteration   2: 10.218 ms/op
Iteration   3: 9.550 ms/op

# Run progress: 93.48% complete, ETA 00:02:05
# Fork: 2 of 2
# Warmup Iteration   1: 15.566 ms/op
# Warmup Iteration   2: 11.490 ms/op
Iteration   1: 9.782 ms/op
Iteration   2: 9.238 ms/op
Iteration   3: 8.630 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.565 ±(99.9%) 1.596 ms/op [Average]
  (min, avg, max) = (8.630, 9.565, 10.218), stdev = 0.569
  CI (99.9%): [7.969, 11.161] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:22
# Fork: 1 of 2
# Warmup Iteration   1: 25.422 ms/op
# Warmup Iteration   2: 20.206 ms/op
Iteration   1: 20.216 ms/op
Iteration   2: 20.197 ms/op
Iteration   3: 20.632 ms/op

# Run progress: 97.83% complete, ETA 00:00:40
# Fork: 2 of 2
# Warmup Iteration   1: 25.343 ms/op
# Warmup Iteration   2: 19.942 ms/op
Iteration   1: 19.955 ms/op
Iteration   2: 19.867 ms/op
Iteration   3: 19.884 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  20.125 ±(99.9%) 0.817 ms/op [Average]
  (min, avg, max) = (19.867, 20.125, 20.632), stdev = 0.291
  CI (99.9%): [19.308, 20.942] (assumes normal distribution)


# Run complete. Total time: 00:30:38

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     12.288 ±    2.316  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.100 ±    0.132  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.238 ±    0.385  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      4.213 ±    0.531  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      7.929 ±    0.624  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    320.039 ±   65.149  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   4003.626 ±  126.752  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    354.087 ±   31.197  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    806.848 ±   93.121  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.091 ±    0.008  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.724 ±    0.892  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.614 ±    0.034  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.464 ±    0.276  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     25.243 ±    4.281  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  54227.181 ± 1855.542  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   6409.746 ± 1919.425  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   9739.997 ± 1985.185  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     43.795 ±    3.883  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     58.097 ±    7.133  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.458 ±    0.070  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.565 ±    1.596  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     20.125 ±    0.817  ms/op

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
[INFO] Total time:  5.027 s
[INFO] Finished at: 2026-10-28T22:51:40Z
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
tpFlashLeanGas                                                 60.0000  (27 ms)
tpFlashWellFluidSrk                                            83.6406  (73 ms)
tpFlashWellFluidPr                                             83.6541  (48 ms)
tpFlashWellFluidWithProperties                                 5445.46  (97 ms)
phAndPsFlashWellFluid                                          2459.23  (72 ms)
Oct 28, 2026 10:51:48 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 10:51:48 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (444 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (241 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (27 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (69 ms)
saturationPointsWellFluid                                      1601.32  (104 ms)
singlePhaseGasPipelineSteadyState                              121.628  (877 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1043 ms)
levenbergMarquardtAntoine                                      1837.31  (6 ms)
levenbergMarquardtDoubleExponential                            5.57177  (10 ms)
dataReconciliation[20]                                         7.89841  (18 ms)
dataReconciliation[100]                                        37.0132  (81 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.382 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.420 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.029 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 350643 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 350.7 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 14426 ms, solved=true, gas=318849.56 kg/hr, water in/out=0.00027104531/1.5353072e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018484305, composition error=0.0029102350
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00013837326
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 14.43 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  06:29 min
[INFO] Finished at: 2026-10-28T22:58:10Z
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
# Warmup Iteration   1: 19.150 ms/op
# Warmup Iteration   2: 11.667 ms/op
Iteration   1: 12.013 ms/op
Iteration   2: 11.204 ms/op
Iteration   3: 11.245 ms/op

# Run progress: 2.17% complete, ETA 00:08:44
# Fork: 2 of 2
# Warmup Iteration   1: 17.047 ms/op
# Warmup Iteration   2: 11.548 ms/op
Iteration   1: 11.340 ms/op
Iteration   2: 11.772 ms/op
Iteration   3: 12.352 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  11.654 ±(99.9%) 1.314 ms/op [Average]
  (min, avg, max) = (11.204, 11.654, 12.352), stdev = 0.469
  CI (99.9%): [10.340, 12.969] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2.181 ms/op
# Warmup Iteration   2: 1.171 ms/op
Iteration   1: 1.118 ms/op
Iteration   2: 1.064 ms/op
Iteration   3: 1.101 ms/op

# Run progress: 6.52% complete, ETA 00:08:22
# Fork: 2 of 2
# Warmup Iteration   1: 2.079 ms/op
# Warmup Iteration   2: 1.067 ms/op
Iteration   1: 1.054 ms/op
Iteration   2: 1.049 ms/op
Iteration   3: 1.070 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.076 ±(99.9%) 0.077 ms/op [Average]
  (min, avg, max) = (1.049, 1.076, 1.118), stdev = 0.027
  CI (99.9%): [0.999, 1.153] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:10
# Fork: 1 of 2
# Warmup Iteration   1: 8.932 ms/op
# Warmup Iteration   2: 4.554 ms/op
Iteration   1: 4.139 ms/op
Iteration   2: 4.147 ms/op
Iteration   3: 4.035 ms/op

# Run progress: 10.87% complete, ETA 00:07:58
# Fork: 2 of 2
# Warmup Iteration   1: 9.157 ms/op
# Warmup Iteration   2: 4.149 ms/op
Iteration   1: 3.965 ms/op
Iteration   2: 4.091 ms/op
Iteration   3: 4.032 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.068 ±(99.9%) 0.198 ms/op [Average]
  (min, avg, max) = (3.965, 4.068, 4.147), stdev = 0.071
  CI (99.9%): [3.870, 4.267] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 8.478 ms/op
# Warmup Iteration   2: 4.749 ms/op
Iteration   1: 4.252 ms/op
Iteration   2: 4.072 ms/op
Iteration   3: 3.929 ms/op

# Run progress: 15.22% complete, ETA 00:07:33
# Fork: 2 of 2
# Warmup Iteration   1: 8.129 ms/op
# Warmup Iteration   2: 4.201 ms/op
Iteration   1: 4.318 ms/op
Iteration   2: 4.367 ms/op
Iteration   3: 4.281 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  4.203 ±(99.9%) 0.471 ms/op [Average]
  (min, avg, max) = (3.929, 4.203, 4.367), stdev = 0.168
  CI (99.9%): [3.732, 4.674] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 18.411 ms/op
# Warmup Iteration   2: 9.723 ms/op
Iteration   1: 7.498 ms/op
Iteration   2: 7.665 ms/op
Iteration   3: 7.513 ms/op

# Run progress: 19.57% complete, ETA 00:07:10
# Fork: 2 of 2
# Warmup Iteration   1: 16.867 ms/op
# Warmup Iteration   2: 8.506 ms/op
Iteration   1: 7.461 ms/op
Iteration   2: 7.417 ms/op
Iteration   3: 7.647 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  7.534 ±(99.9%) 0.282 ms/op [Average]
  (min, avg, max) = (7.417, 7.534, 7.665), stdev = 0.101
  CI (99.9%): [7.252, 7.816] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1320.073 ms/op
# Warmup Iteration   2: 571.921 ms/op
Iteration   1: 343.565 ms/op
Iteration   2: 291.006 ms/op
Iteration   3: 292.960 ms/op

# Run progress: 23.91% complete, ETA 00:06:45
# Fork: 2 of 2
# Warmup Iteration   1: 1283.936 ms/op
# Warmup Iteration   2: 424.767 ms/op
Iteration   1: 311.978 ms/op
Iteration   2: 274.632 ms/op
Iteration   3: 314.113 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  304.709 ±(99.9%) 67.318 ms/op [Average]
  (min, avg, max) = (274.632, 304.709, 343.565), stdev = 24.006
  CI (99.9%): [237.391, 372.027] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 8323.564 ms/op
# Warmup Iteration   2: 4686.651 ms/op
Iteration   1: 4187.793 ms/op
Iteration   2: 3888.162 ms/op
Iteration   3: 4103.368 ms/op

# Run progress: 28.26% complete, ETA 00:06:57
# Fork: 2 of 2
# Warmup Iteration   1: 8516.365 ms/op
# Warmup Iteration   2: 4895.456 ms/op
Iteration   1: 4161.551 ms/op
Iteration   2: 3949.189 ms/op
Iteration   3: 3979.316 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  4044.896 ±(99.9%) 344.523 ms/op [Average]
  (min, avg, max) = (3888.162, 4044.896, 4187.793), stdev = 122.860
  CI (99.9%): [3700.373, 4389.419] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:07:14
# Fork: 1 of 2
# Warmup Iteration   1: 1036.272 ms/op
# Warmup Iteration   2: 372.208 ms/op
Iteration   1: 346.226 ms/op
Iteration   2: 336.738 ms/op
Iteration   3: 338.786 ms/op

# Run progress: 32.61% complete, ETA 00:06:55
# Fork: 2 of 2
# Warmup Iteration   1: 1023.987 ms/op
# Warmup Iteration   2: 427.731 ms/op
Iteration   1: 382.585 ms/op
Iteration   2: 354.015 ms/op
Iteration   3: 352.247 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  351.766 ±(99.9%) 46.588 ms/op [Average]
  (min, avg, max) = (336.738, 351.766, 382.585), stdev = 16.614
  CI (99.9%): [305.178, 398.355] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:37
# Fork: 1 of 2
# Warmup Iteration   1: 2024.180 ms/op
# Warmup Iteration   2: 883.240 ms/op
Iteration   1: 812.085 ms/op
Iteration   2: 758.495 ms/op
Iteration   3: 787.617 ms/op

# Run progress: 36.96% complete, ETA 00:06:21
# Fork: 2 of 2
# Warmup Iteration   1: 2099.669 ms/op
# Warmup Iteration   2: 868.750 ms/op
Iteration   1: 813.657 ms/op
Iteration   2: 748.051 ms/op
Iteration   3: 788.454 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  784.726 ±(99.9%) 75.670 ms/op [Average]
  (min, avg, max) = (748.051, 784.726, 813.657), stdev = 26.985
  CI (99.9%): [709.056, 860.397] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:06:06
# Fork: 1 of 2
# Warmup Iteration   1: 0.194 ms/op
# Warmup Iteration   2: 0.101 ms/op
Iteration   1: 0.089 ms/op
Iteration   2: 0.084 ms/op
Iteration   3: 0.085 ms/op

# Run progress: 41.30% complete, ETA 00:05:49
# Fork: 2 of 2
# Warmup Iteration   1: 0.209 ms/op
# Warmup Iteration   2: 0.089 ms/op
Iteration   1: 0.086 ms/op
Iteration   2: 0.086 ms/op
Iteration   3: 0.086 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.086 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.084, 0.086, 0.089), stdev = 0.002
  CI (99.9%): [0.082, 0.090] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:33
# Fork: 1 of 2
# Warmup Iteration   1: 11.394 ms/op
# Warmup Iteration   2: 7.436 ms/op
Iteration   1: 7.246 ms/op
Iteration   2: 7.320 ms/op
Iteration   3: 6.818 ms/op

# Run progress: 45.65% complete, ETA 00:05:17
# Fork: 2 of 2
# Warmup Iteration   1: 10.116 ms/op
# Warmup Iteration   2: 6.696 ms/op
Iteration   1: 6.504 ms/op
Iteration   2: 6.416 ms/op
Iteration   3: 6.406 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.785 ±(99.9%) 1.162 ms/op [Average]
  (min, avg, max) = (6.406, 6.785, 7.320), stdev = 0.414
  CI (99.9%): [5.623, 7.947] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:05:01
# Fork: 1 of 2
# Warmup Iteration   1: 0.963 ms/op
# Warmup Iteration   2: 0.608 ms/op
Iteration   1: 0.606 ms/op
Iteration   2: 0.599 ms/op
Iteration   3: 0.598 ms/op

# Run progress: 50.00% complete, ETA 00:04:46
# Fork: 2 of 2
# Warmup Iteration   1: 0.940 ms/op
# Warmup Iteration   2: 0.630 ms/op
Iteration   1: 0.628 ms/op
Iteration   2: 0.624 ms/op
Iteration   3: 0.624 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.613 ±(99.9%) 0.038 ms/op [Average]
  (min, avg, max) = (0.598, 0.613, 0.628), stdev = 0.014
  CI (99.9%): [0.575, 0.651] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:32
# Fork: 1 of 2
# Warmup Iteration   1: 1.980 ms/op
# Warmup Iteration   2: 1.520 ms/op
Iteration   1: 1.349 ms/op
Iteration   2: 1.348 ms/op
Iteration   3: 1.545 ms/op

# Run progress: 54.35% complete, ETA 00:04:18
# Fork: 2 of 2
# Warmup Iteration   1: 2.306 ms/op
# Warmup Iteration   2: 1.471 ms/op
Iteration   1: 1.419 ms/op
Iteration   2: 1.360 ms/op
Iteration   3: 1.466 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.414 ±(99.9%) 0.222 ms/op [Average]
  (min, avg, max) = (1.348, 1.414, 1.545), stdev = 0.079
  CI (99.9%): [1.192, 1.637] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:04:04
# Fork: 1 of 2
# Warmup Iteration   1: 137.023 ms/op
# Warmup Iteration   2: 31.509 ms/op
Iteration   1: 24.534 ms/op
Iteration   2: 21.926 ms/op
Iteration   3: 17.463 ms/op

# Run progress: 58.70% complete, ETA 00:03:50
# Fork: 2 of 2
# Warmup Iteration   1: 119.831 ms/op
# Warmup Iteration   2: 30.781 ms/op
Iteration   1: 25.907 ms/op
Iteration   2: 23.115 ms/op
Iteration   3: 22.527 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  22.579 ±(99.9%) 8.106 ms/op [Average]
  (min, avg, max) = (17.463, 22.579, 25.907), stdev = 2.891
  CI (99.9%): [14.473, 30.685] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:37
# Fork: 1 of 2
# Warmup Iteration   1: 59410.184 ms/op
# Warmup Iteration   2: 55401.970 ms/op
Iteration   1: 53332.989 ms/op
Iteration   2: 52857.726 ms/op
Iteration   3: 53088.005 ms/op

# Run progress: 63.04% complete, ETA 00:05:59
# Fork: 2 of 2
# Warmup Iteration   1: 58756.535 ms/op
# Warmup Iteration   2: 54331.132 ms/op
Iteration   1: 56969.657 ms/op
Iteration   2: 54289.795 ms/op
Iteration   3: 55023.812 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  54260.331 ±(99.9%) 4366.945 ms/op [Average]
  (min, avg, max) = (52857.726, 54260.331, 56969.657), stdev = 1557.295
  CI (99.9%): [49893.385, 58627.276] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:57
# Fork: 1 of 2
# Warmup Iteration   1: 9816.073 ms/op
# Warmup Iteration   2: 5324.692 ms/op
Iteration   1: 6953.531 ms/op
Iteration   2: 5803.819 ms/op
Iteration   3: 5835.782 ms/op

# Run progress: 67.39% complete, ETA 00:09:58
# Fork: 2 of 2
# Warmup Iteration   1: 9749.296 ms/op
# Warmup Iteration   2: 5420.262 ms/op
Iteration   1: 6829.193 ms/op
Iteration   2: 5623.572 ms/op
Iteration   3: 5586.371 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  6105.378 ±(99.9%) 1732.432 ms/op [Average]
  (min, avg, max) = (5586.371, 6105.378, 6953.531), stdev = 617.802
  CI (99.9%): [4372.946, 7837.810] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:11:30
# Fork: 1 of 2
# Warmup Iteration   1: 14184.345 ms/op
# Warmup Iteration   2: 10051.820 ms/op
Iteration   1: 8082.505 ms/op
Iteration   2: 9717.793 ms/op
Iteration   3: 8513.866 ms/op

# Run progress: 71.74% complete, ETA 00:10:41
# Fork: 2 of 2
# Warmup Iteration   1: 14043.410 ms/op
# Warmup Iteration   2: 10064.412 ms/op
Iteration   1: 8077.309 ms/op
Iteration   2: 8236.802 ms/op
Iteration   3: 8282.164 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  8485.073 ±(99.9%) 1751.919 ms/op [Average]
  (min, avg, max) = (8077.309, 8485.073, 9717.793), stdev = 624.751
  CI (99.9%): [6733.154, 10236.992] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:09:52
# Fork: 1 of 2
# Warmup Iteration   1: Oct 28, 2026 11:26:09 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 11:26:09 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
101.829 ms/op
# Warmup Iteration   2: 42.214 ms/op
Iteration   1: 40.628 ms/op
Iteration   2: 39.063 ms/op
Iteration   3: 37.573 ms/op

# Run progress: 76.09% complete, ETA 00:08:50
# Fork: 2 of 2
# Warmup Iteration   1: Oct 28, 2026 11:26:21 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 11:26:21 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
69.727 ms/op
# Warmup Iteration   2: 42.633 ms/op
Iteration   1: 39.212 ms/op
Iteration   2: 38.869 ms/op
Iteration   3: 38.198 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  38.924 ±(99.9%) 2.904 ms/op [Average]
  (min, avg, max) = (37.573, 38.924, 40.628), stdev = 1.036
  CI (99.9%): [36.020, 41.828] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:07:52
# Fork: 1 of 2
# Warmup Iteration   1: 101.767 ms/op
# Warmup Iteration   2: 51.916 ms/op
Iteration   1: 48.953 ms/op
Iteration   2: 49.616 ms/op
Iteration   3: 49.923 ms/op

# Run progress: 80.43% complete, ETA 00:06:56
# Fork: 2 of 2
# Warmup Iteration   1: 129.633 ms/op
# Warmup Iteration   2: 53.768 ms/op
Iteration   1: 53.706 ms/op
Iteration   2: 53.050 ms/op
Iteration   3: 52.307 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  51.259 ±(99.9%) 5.622 ms/op [Average]
  (min, avg, max) = (48.953, 51.259, 53.706), stdev = 2.005
  CI (99.9%): [45.637, 56.881] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:06:02
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:11
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

# Run progress: 86.96% complete, ETA 00:04:21
# Fork: 1 of 2
# Warmup Iteration   1: 0.768 ms/op
# Warmup Iteration   2: 0.463 ms/op
Iteration   1: 0.454 ms/op
Iteration   2: 0.435 ms/op
Iteration   3: 0.434 ms/op

# Run progress: 89.13% complete, ETA 00:03:34
# Fork: 2 of 2
# Warmup Iteration   1: 0.819 ms/op
# Warmup Iteration   2: 0.481 ms/op
Iteration   1: 0.444 ms/op
Iteration   2: 0.427 ms/op
Iteration   3: 0.428 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.437 ±(99.9%) 0.029 ms/op [Average]
  (min, avg, max) = (0.427, 0.437, 0.454), stdev = 0.010
  CI (99.9%): [0.408, 0.466] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:48
# Fork: 1 of 2
# Warmup Iteration   1: 17.383 ms/op
# Warmup Iteration   2: 10.892 ms/op
Iteration   1: 10.725 ms/op
Iteration   2: 10.211 ms/op
Iteration   3: 9.758 ms/op

# Run progress: 93.48% complete, ETA 00:02:04
# Fork: 2 of 2
# Warmup Iteration   1: 15.338 ms/op
# Warmup Iteration   2: 9.977 ms/op
Iteration   1: 9.279 ms/op
Iteration   2: 8.181 ms/op
Iteration   3: 8.242 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.399 ±(99.9%) 2.910 ms/op [Average]
  (min, avg, max) = (8.181, 9.399, 10.725), stdev = 1.038
  CI (99.9%): [6.490, 12.309] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:21
# Fork: 1 of 2
# Warmup Iteration   1: 19.708 ms/op
# Warmup Iteration   2: 17.030 ms/op
Iteration   1: 16.698 ms/op
Iteration   2: 15.865 ms/op
Iteration   3: 15.258 ms/op

# Run progress: 97.83% complete, ETA 00:00:40
# Fork: 2 of 2
# Warmup Iteration   1: 18.788 ms/op
# Warmup Iteration   2: 16.983 ms/op
Iteration   1: 17.063 ms/op
Iteration   2: 15.461 ms/op
Iteration   3: 15.342 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  15.948 ±(99.9%) 2.133 ms/op [Average]
  (min, avg, max) = (15.258, 15.948, 17.063), stdev = 0.761
  CI (99.9%): [13.815, 18.081] (assumes normal distribution)


# Run complete. Total time: 00:30:14

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     11.654 ±    1.314  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.076 ±    0.077  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.068 ±    0.198  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      4.203 ±    0.471  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      7.534 ±    0.282  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    304.709 ±   67.318  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   4044.896 ±  344.523  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    351.766 ±   46.588  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    784.726 ±   75.670  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.086 ±    0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.785 ±    1.162  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.613 ±    0.038  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.414 ±    0.222  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     22.579 ±    8.106  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  54260.331 ± 4366.945  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   6105.378 ± 1732.432  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   8485.073 ± 1751.919  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     38.924 ±    2.904  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     51.259 ±    5.622  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.437 ±    0.029  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.399 ±    2.910  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     15.948 ±    2.133  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.14.0 -> 3.15.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 19 lower, 4 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 20.1253 | 15.9477 | -20.76% | Separate CIs |
| process.TEGprocess.testTEGprocess | 9740 | 8485.07 | -12.88% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 58.0968 | 51.2591 | -11.77% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 43.7948 | 38.9239 | -11.12% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 25.2434 | 22.5788 | -10.56% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0907042 | 0.0859418 | -5.25% | Overlapping CIs |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 12.2881 | 11.6543 | -5.16% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 7.92874 | 7.53364 | -4.98% | Overlapping CIs |
| flash.TPflash.testFlash | 320.039 | 304.709 | -4.79% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 6409.75 | 6105.38 | -4.75% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
