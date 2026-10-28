# NeqSim 3.14.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.13.0 |
| Current | 3.14.0 |
| Source commit | `96d22e87417ffd8d50c3ac664da7b75de90d5fdc` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40761837658) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "96d22e87417ffd8d50c3ac664da7b75de90d5fdc",
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
Address sizes:                           48 bits physical, 48 bits virtual
Byte Order:                              Little Endian
CPU(s):                                  2
On-line CPU(s) list:                     0,1
Vendor ID:                               AuthenticAMD
Model name:                              AMD EPYC 7763 64-Core Processor
CPU family:                              25
Model:                                   1
Thread(s) per core:                      2
Core(s) per socket:                      1
Socket(s):                               1
Stepping:                                1
BogoMIPS:                                4890.84
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid rdseed adx smap clflushopt clwb sha_ni xsaveopt xsavec xgetbv1 xsaves user_shstk clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload umip vaes vpclmulqdq rdpid fsrm
Virtualization:                          AMD-V
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               32 KiB (1 instance)
L1i cache:                               32 KiB (1 instance)
L2 cache:                                512 KiB (1 instance)
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
| baseline | 3.13.0 | passed |
| current | 3.14.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.13.0",
  "version": "3.13.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.13.0/neqsim-3.13.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.14.0",
  "version": "3.14.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.14.0/neqsim-3.14.0.jar",
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
[INFO] Total time:  12.383 s
[INFO] Finished at: 2026-10-28T20:17:20Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.13.0 (neqsim-3.13.0.jar); requested: 3.13.0
$ mvn clean verify -Dneqsim.version=3.13.0
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
tpFlashLeanGas                                                 60.0000  (51 ms)
tpFlashWellFluidSrk                                            83.6406  (135 ms)
tpFlashWellFluidPr                                             83.6541  (90 ms)
tpFlashWellFluidWithProperties                                 5445.46  (145 ms)
phAndPsFlashWellFluid                                          2459.23  (91 ms)
Oct 28, 2026 8:17:36 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 8:17:36 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (698 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (378 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (42 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (96 ms)
saturationPointsWellFluid                                      1601.32  (155 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1771 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1790 ms)
levenbergMarquardtAntoine                                      1837.31  (11 ms)
levenbergMarquardtDoubleExponential                            5.57177  (9 ms)
dataReconciliation[20]                                         7.89841  (26 ms)
dataReconciliation[100]                                        37.0132  (46 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.518 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.37 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.030 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 619561 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 95 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    9.92e-05 (tolerance: 1.00e-04) OK
  Temperature:  1.68e-05 (tolerance: 1.00e-04) OK
  Pressure:     3.22e-05 (tolerance: 1.00e-04) OK

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED

feed 5489240.1, gas 264777.0 + 378160.4, oil 1995465.3 + 2850766.0, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.449 MSm3/d, KA27841 A 102.5 bara, pipeline outlet 50.8 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 619.6 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 27633 ms, solved=true, gas=318849.57 kg/hr, water in/out=0.00027173922/1.5391249e-05
TEG recycle stripping gas recirc: solved=true, flow error=9.9210333e-05, composition error=0.0015789095
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=0.00031074765
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 27.64 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.13.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.13.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  11:31 min
[INFO] Finished at: 2026-10-28T20:28:53Z
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
# Warmup Iteration   1: 36.742 ms/op
# Warmup Iteration   2: 19.670 ms/op
Iteration   1: 18.868 ms/op
Iteration   2: 19.187 ms/op
Iteration   3: 19.431 ms/op

# Run progress: 2.17% complete, ETA 00:09:30
# Fork: 2 of 2
# Warmup Iteration   1: 38.140 ms/op
# Warmup Iteration   2: 19.913 ms/op
Iteration   1: 19.067 ms/op
Iteration   2: 19.617 ms/op
Iteration   3: 18.951 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  19.187 ±(99.9%) 0.809 ms/op [Average]
  (min, avg, max) = (18.868, 19.187, 19.617), stdev = 0.288
  CI (99.9%): [18.378, 19.996] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:09:19
# Fork: 1 of 2
# Warmup Iteration   1: 4.450 ms/op
# Warmup Iteration   2: 2.382 ms/op
Iteration   1: 1.520 ms/op
Iteration   2: 1.511 ms/op
Iteration   3: 1.516 ms/op

# Run progress: 6.52% complete, ETA 00:09:03
# Fork: 2 of 2
# Warmup Iteration   1: 4.420 ms/op
# Warmup Iteration   2: 2.589 ms/op
Iteration   1: 1.501 ms/op
Iteration   2: 1.497 ms/op
Iteration   3: 1.492 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.506 ±(99.9%) 0.031 ms/op [Average]
  (min, avg, max) = (1.492, 1.506, 1.520), stdev = 0.011
  CI (99.9%): [1.475, 1.537] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:48
# Fork: 1 of 2
# Warmup Iteration   1: 16.167 ms/op
# Warmup Iteration   2: 8.569 ms/op
Iteration   1: 6.718 ms/op
Iteration   2: 6.765 ms/op
Iteration   3: 6.662 ms/op

# Run progress: 10.87% complete, ETA 00:08:34
# Fork: 2 of 2
# Warmup Iteration   1: 16.743 ms/op
# Warmup Iteration   2: 10.221 ms/op
Iteration   1: 7.921 ms/op
Iteration   2: 6.914 ms/op
Iteration   3: 6.371 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.892 ±(99.9%) 1.500 ms/op [Average]
  (min, avg, max) = (6.371, 6.892, 7.921), stdev = 0.535
  CI (99.9%): [5.391, 8.392] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:08:20
# Fork: 1 of 2
# Warmup Iteration   1: 15.657 ms/op
# Warmup Iteration   2: 8.719 ms/op
Iteration   1: 6.279 ms/op
Iteration   2: 6.260 ms/op
Iteration   3: 6.298 ms/op

# Run progress: 15.22% complete, ETA 00:08:07
# Fork: 2 of 2
# Warmup Iteration   1: 14.466 ms/op
# Warmup Iteration   2: 9.464 ms/op
Iteration   1: 6.447 ms/op
Iteration   2: 6.316 ms/op
Iteration   3: 6.377 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.330 ±(99.9%) 0.197 ms/op [Average]
  (min, avg, max) = (6.260, 6.330, 6.447), stdev = 0.070
  CI (99.9%): [6.133, 6.527] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:55
# Fork: 1 of 2
# Warmup Iteration   1: 31.560 ms/op
# Warmup Iteration   2: 18.796 ms/op
Iteration   1: 13.533 ms/op
Iteration   2: 11.717 ms/op
Iteration   3: 11.719 ms/op

# Run progress: 19.57% complete, ETA 00:07:43
# Fork: 2 of 2
# Warmup Iteration   1: 39.286 ms/op
# Warmup Iteration   2: 20.450 ms/op
Iteration   1: 15.024 ms/op
Iteration   2: 12.055 ms/op
Iteration   3: 11.996 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  12.674 ±(99.9%) 3.747 ms/op [Average]
  (min, avg, max) = (11.717, 12.674, 15.024), stdev = 1.336
  CI (99.9%): [8.927, 16.421] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:30
# Fork: 1 of 2
# Warmup Iteration   1: 2845.817 ms/op
# Warmup Iteration   2: 958.298 ms/op
Iteration   1: 781.682 ms/op
Iteration   2: 506.966 ms/op
Iteration   3: 480.123 ms/op

# Run progress: 23.91% complete, ETA 00:07:18
# Fork: 2 of 2
# Warmup Iteration   1: 2863.136 ms/op
# Warmup Iteration   2: 920.309 ms/op
Iteration   1: 586.177 ms/op
Iteration   2: 481.095 ms/op
Iteration   3: 475.358 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  551.900 ±(99.9%) 336.544 ms/op [Average]
  (min, avg, max) = (475.358, 551.900, 781.682), stdev = 120.015
  CI (99.9%): [215.356, 888.444] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:07:07
# Fork: 1 of 2
# Warmup Iteration   1: 12883.008 ms/op
# Warmup Iteration   2: 7084.890 ms/op
Iteration   1: 6110.722 ms/op
Iteration   2: 5963.443 ms/op
Iteration   3: 6040.496 ms/op

# Run progress: 28.26% complete, ETA 00:08:00
# Fork: 2 of 2
# Warmup Iteration   1: 13087.304 ms/op
# Warmup Iteration   2: 7132.446 ms/op
Iteration   1: 6167.400 ms/op
Iteration   2: 6056.958 ms/op
Iteration   3: 6046.654 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  6064.279 ±(99.9%) 193.828 ms/op [Average]
  (min, avg, max) = (5963.443, 6064.279, 6167.400), stdev = 69.121
  CI (99.9%): [5870.450, 6258.107] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:08:41
# Fork: 1 of 2
# Warmup Iteration   1: 2387.085 ms/op
# Warmup Iteration   2: 623.827 ms/op
Iteration   1: 548.338 ms/op
Iteration   2: 515.032 ms/op
Iteration   3: 534.837 ms/op

# Run progress: 32.61% complete, ETA 00:08:15
# Fork: 2 of 2
# Warmup Iteration   1: 2429.851 ms/op
# Warmup Iteration   2: 607.832 ms/op
Iteration   1: 561.029 ms/op
Iteration   2: 520.692 ms/op
Iteration   3: 618.376 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  549.717 ±(99.9%) 105.751 ms/op [Average]
  (min, avg, max) = (515.032, 549.717, 618.376), stdev = 37.712
  CI (99.9%): [443.967, 655.468] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:07:52
# Fork: 1 of 2
# Warmup Iteration   1: 3407.445 ms/op
# Warmup Iteration   2: 1326.355 ms/op
Iteration   1: 1312.438 ms/op
Iteration   2: 1188.269 ms/op
Iteration   3: 1124.361 ms/op

# Run progress: 36.96% complete, ETA 00:07:32
# Fork: 2 of 2
# Warmup Iteration   1: 3295.346 ms/op
# Warmup Iteration   2: 1410.896 ms/op
Iteration   1: 1313.814 ms/op
Iteration   2: 1195.629 ms/op
Iteration   3: 1124.414 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1209.821 ±(99.9%) 239.946 ms/op [Average]
  (min, avg, max) = (1124.361, 1209.821, 1313.814), stdev = 85.567
  CI (99.9%): [969.875, 1449.767] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:07:14
# Fork: 1 of 2
# Warmup Iteration   1: 0.339 ms/op
# Warmup Iteration   2: 0.104 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.098 ms/op

# Run progress: 41.30% complete, ETA 00:06:51
# Fork: 2 of 2
# Warmup Iteration   1: 0.381 ms/op
# Warmup Iteration   2: 0.104 ms/op
Iteration   1: 0.098 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.098 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.099 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.098, 0.099, 0.099), stdev = 0.001
  CI (99.9%): [0.097, 0.100] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:06:29
# Fork: 1 of 2
# Warmup Iteration   1: 15.899 ms/op
# Warmup Iteration   2: 7.753 ms/op
Iteration   1: 7.522 ms/op
Iteration   2: 7.461 ms/op
Iteration   3: 10.882 ms/op

# Run progress: 45.65% complete, ETA 00:06:09
# Fork: 2 of 2
# Warmup Iteration   1: 17.288 ms/op
# Warmup Iteration   2: 7.806 ms/op
Iteration   1: 7.535 ms/op
Iteration   2: 7.463 ms/op
Iteration   3: 7.452 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  8.052 ±(99.9%) 3.889 ms/op [Average]
  (min, avg, max) = (7.452, 8.052, 10.882), stdev = 1.387
  CI (99.9%): [4.164, 11.941] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:05:49
# Fork: 1 of 2
# Warmup Iteration   1: 1.095 ms/op
# Warmup Iteration   2: 0.648 ms/op
Iteration   1: 0.581 ms/op
Iteration   2: 0.580 ms/op
Iteration   3: 0.577 ms/op

# Run progress: 50.00% complete, ETA 00:05:30
# Fork: 2 of 2
# Warmup Iteration   1: 1.089 ms/op
# Warmup Iteration   2: 0.644 ms/op
Iteration   1: 0.581 ms/op
Iteration   2: 0.578 ms/op
Iteration   3: 0.577 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.579 ±(99.9%) 0.006 ms/op [Average]
  (min, avg, max) = (0.577, 0.579, 0.581), stdev = 0.002
  CI (99.9%): [0.573, 0.585] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:05:12
# Fork: 1 of 2
# Warmup Iteration   1: 2.847 ms/op
# Warmup Iteration   2: 1.576 ms/op
Iteration   1: 1.666 ms/op
Iteration   2: 1.503 ms/op
Iteration   3: 1.504 ms/op

# Run progress: 54.35% complete, ETA 00:04:55
# Fork: 2 of 2
# Warmup Iteration   1: 2.767 ms/op
# Warmup Iteration   2: 1.589 ms/op
Iteration   1: 1.667 ms/op
Iteration   2: 1.511 ms/op
Iteration   3: 1.503 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.559 ±(99.9%) 0.234 ms/op [Average]
  (min, avg, max) = (1.503, 1.559, 1.667), stdev = 0.083
  CI (99.9%): [1.325, 1.793] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:04:38
# Fork: 1 of 2
# Warmup Iteration   1: 405.497 ms/op
# Warmup Iteration   2: 67.069 ms/op
Iteration   1: 43.582 ms/op
Iteration   2: 53.086 ms/op
Iteration   3: 38.620 ms/op

# Run progress: 58.70% complete, ETA 00:04:21
# Fork: 2 of 2
# Warmup Iteration   1: 426.839 ms/op
# Warmup Iteration   2: 65.506 ms/op
Iteration   1: 42.014 ms/op
Iteration   2: 37.090 ms/op
Iteration   3: 33.812 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  41.367 ±(99.9%) 18.835 ms/op [Average]
  (min, avg, max) = (33.812, 41.367, 53.086), stdev = 6.717
  CI (99.9%): [22.532, 60.202] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:04:06
# Fork: 1 of 2
# Warmup Iteration   1: 96740.599 ms/op
# Warmup Iteration   2: 89609.333 ms/op
Iteration   1: 88258.793 ms/op
Iteration   2: 88670.591 ms/op
Iteration   3: 87966.275 ms/op

# Run progress: 63.04% complete, ETA 00:08:10
# Fork: 2 of 2
# Warmup Iteration   1: 99507.568 ms/op
# Warmup Iteration   2: 90462.047 ms/op
Iteration   1: 89552.773 ms/op
Iteration   2: 89742.617 ms/op
Iteration   3: 90373.476 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  89094.087 ±(99.9%) 2635.592 ms/op [Average]
  (min, avg, max) = (87966.275, 89094.087, 90373.476), stdev = 939.877
  CI (99.9%): [86458.496, 91729.679] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:31
# Fork: 1 of 2
# Warmup Iteration   1: 9083.440 ms/op
# Warmup Iteration   2: 10137.169 ms/op
Iteration   1: 9556.086 ms/op
Iteration   2: 9214.304 ms/op
Iteration   3: 16710.789 ms/op

# Run progress: 67.39% complete, ETA 00:15:26
# Fork: 2 of 2
# Warmup Iteration   1: 8909.580 ms/op
# Warmup Iteration   2: 9554.088 ms/op
Iteration   1: 9443.544 ms/op
Iteration   2: 9195.645 ms/op
Iteration   3: 16665.834 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  11797.700 ±(99.9%) 10629.953 ms/op [Average]
  (min, avg, max) = (9195.645, 11797.700, 16710.789), stdev = 3790.744
  CI (99.9%): [1167.747, 22427.653] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:18:25
# Fork: 1 of 2
# Warmup Iteration   1: 26123.804 ms/op
# Warmup Iteration   2: 18460.121 ms/op
Iteration   1: 15530.094 ms/op
Iteration   2: 15869.028 ms/op
Iteration   3: 14882.036 ms/op

# Run progress: 71.74% complete, ETA 00:17:11
# Fork: 2 of 2
# Warmup Iteration   1: 57058.408 ms/op
# Warmup Iteration   2: 18625.603 ms/op
Iteration   1: 15435.864 ms/op
Iteration   2: 13995.905 ms/op
Iteration   3: 15613.955 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  15221.147 ±(99.9%) 1915.000 ms/op [Average]
  (min, avg, max) = (13995.905, 15221.147, 15869.028), stdev = 682.908
  CI (99.9%): [13306.147, 17136.147] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:16:07
# Fork: 1 of 2
# Warmup Iteration   1: Oct 28, 2026 9:14:35 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 9:14:35 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
160.080 ms/op
# Warmup Iteration   2: 63.792 ms/op
Iteration   1: 59.630 ms/op
Iteration   2: 57.576 ms/op
Iteration   3: 56.473 ms/op

# Run progress: 76.09% complete, ETA 00:14:24
# Fork: 2 of 2
# Warmup Iteration   1: Oct 28, 2026 9:14:47 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 9:14:47 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
173.339 ms/op
# Warmup Iteration   2: 67.716 ms/op
Iteration   1: 65.839 ms/op
Iteration   2: 63.418 ms/op
Iteration   3: 62.683 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  60.936 ±(99.9%) 10.200 ms/op [Average]
  (min, avg, max) = (56.473, 60.936, 65.839), stdev = 3.637
  CI (99.9%): [50.736, 71.136] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:12:47
# Fork: 1 of 2
# Warmup Iteration   1: 254.423 ms/op
# Warmup Iteration   2: 115.964 ms/op
Iteration   1: 133.391 ms/op
Iteration   2: 81.776 ms/op
Iteration   3: 82.667 ms/op

# Run progress: 80.43% complete, ETA 00:11:15
# Fork: 2 of 2
# Warmup Iteration   1: 174.240 ms/op
# Warmup Iteration   2: 94.075 ms/op
Iteration   1: 80.020 ms/op
Iteration   2: 79.665 ms/op
Iteration   3: 79.906 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  89.571 ±(99.9%) 60.291 ms/op [Average]
  (min, avg, max) = (79.665, 89.571, 133.391), stdev = 21.501
  CI (99.9%): [29.279, 149.862] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:09:46
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:08:22
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

# Run progress: 86.96% complete, ETA 00:07:01
# Fork: 1 of 2
# Warmup Iteration   1: 1.472 ms/op
# Warmup Iteration   2: 0.843 ms/op
Iteration   1: 0.709 ms/op
Iteration   2: 0.706 ms/op
Iteration   3: 0.685 ms/op

# Run progress: 89.13% complete, ETA 00:05:44
# Fork: 2 of 2
# Warmup Iteration   1: 1.666 ms/op
# Warmup Iteration   2: 0.971 ms/op
Iteration   1: 0.809 ms/op
Iteration   2: 0.679 ms/op
Iteration   3: 0.654 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.707 ±(99.9%) 0.151 ms/op [Average]
  (min, avg, max) = (0.654, 0.707, 0.809), stdev = 0.054
  CI (99.9%): [0.556, 0.858] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:04:30
# Fork: 1 of 2
# Warmup Iteration   1: 32.418 ms/op
# Warmup Iteration   2: 21.786 ms/op
Iteration   1: 14.572 ms/op
Iteration   2: 14.766 ms/op
Iteration   3: 15.376 ms/op

# Run progress: 93.48% complete, ETA 00:03:18
# Fork: 2 of 2
# Warmup Iteration   1: 36.566 ms/op
# Warmup Iteration   2: 19.514 ms/op
Iteration   1: 14.343 ms/op
Iteration   2: 14.742 ms/op
Iteration   3: 15.659 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  14.910 ±(99.9%) 1.409 ms/op [Average]
  (min, avg, max) = (14.343, 14.910, 15.659), stdev = 0.503
  CI (99.9%): [13.500, 16.319] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:02:10
# Fork: 1 of 2
# Warmup Iteration   1: 37.802 ms/op
# Warmup Iteration   2: 25.082 ms/op
Iteration   1: 24.918 ms/op
Iteration   2: 24.971 ms/op
Iteration   3: 25.671 ms/op

# Run progress: 97.83% complete, ETA 00:01:03
# Fork: 2 of 2
# Warmup Iteration   1: 50.423 ms/op
# Warmup Iteration   2: 31.981 ms/op
Iteration   1: 31.783 ms/op
Iteration   2: 31.705 ms/op
Iteration   3: 31.659 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  28.451 ±(99.9%) 10.056 ms/op [Average]
  (min, avg, max) = (24.918, 28.451, 31.783), stdev = 3.586
  CI (99.9%): [18.395, 38.508] (assumes normal distribution)


# Run complete. Total time: 00:48:04

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     19.187 ±     0.809  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.506 ±     0.031  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.892 ±     1.500  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.330 ±     0.197  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     12.674 ±     3.747  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    551.900 ±   336.544  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   6064.279 ±   193.828  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    549.717 ±   105.751  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1209.821 ±   239.946  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.099 ±     0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      8.052 ±     3.889  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.579 ±     0.006  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.559 ±     0.234  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     41.367 ±    18.835  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  89094.087 ±  2635.592  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  11797.700 ± 10629.953  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  15221.147 ±  1915.000  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     60.936 ±    10.200  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     89.571 ±    60.291  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.707 ±     0.151  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     14.910 ±     1.409  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     28.451 ±    10.056  ms/op

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
[INFO] Total time:  4.515 s
[INFO] Finished at: 2026-10-28T21:17:04Z
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
tpFlashLeanGas                                                 60.0000  (70 ms)
tpFlashWellFluidSrk                                            83.6406  (170 ms)
tpFlashWellFluidPr                                             83.6541  (87 ms)
tpFlashWellFluidWithProperties                                 5445.46  (151 ms)
phAndPsFlashWellFluid                                          2459.23  (92 ms)
Oct 28, 2026 9:17:16 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 9:17:16 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (872 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (385 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (34 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (104 ms)
saturationPointsWellFluid                                      1601.32  (195 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1709 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1818 ms)
levenbergMarquardtAntoine                                      1837.31  (19 ms)
levenbergMarquardtDoubleExponential                            5.57177  (10 ms)
dataReconciliation[20]                                         7.89841  (24 ms)
dataReconciliation[100]                                        37.0132  (106 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.775 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.32 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.036 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 553910 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 97 / 150
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

feed 5489240.1, gas 264785.9 + 378177.8, oil 1995470.1 + 2850765.9, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.449 MSm3/d, KA27841 A 102.5 bara, pipeline outlet 50.8 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 553.9 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 28167 ms, solved=true, gas=318849.57 kg/hr, water in/out=0.00027173922/1.5382411e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018460518, composition error=0.0029034392
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00013719865
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 28.17 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  10:18 min
[INFO] Finished at: 2026-10-28T21:27:25Z
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
# Warmup Iteration   1: 40.319 ms/op
# Warmup Iteration   2: 20.089 ms/op
Iteration   1: 19.450 ms/op
Iteration   2: 19.455 ms/op
Iteration   3: 19.800 ms/op

# Run progress: 2.17% complete, ETA 00:09:29
# Fork: 2 of 2
# Warmup Iteration   1: 36.839 ms/op
# Warmup Iteration   2: 19.761 ms/op
Iteration   1: 19.234 ms/op
Iteration   2: 19.577 ms/op
Iteration   3: 19.257 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  19.462 ±(99.9%) 0.590 ms/op [Average]
  (min, avg, max) = (19.234, 19.462, 19.800), stdev = 0.211
  CI (99.9%): [18.872, 20.053] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:09:15
# Fork: 1 of 2
# Warmup Iteration   1: 4.561 ms/op
# Warmup Iteration   2: 3.223 ms/op
Iteration   1: 1.667 ms/op
Iteration   2: 1.445 ms/op
Iteration   3: 1.446 ms/op

# Run progress: 6.52% complete, ETA 00:09:00
# Fork: 2 of 2
# Warmup Iteration   1: 4.409 ms/op
# Warmup Iteration   2: 3.137 ms/op
Iteration   1: 1.782 ms/op
Iteration   2: 1.432 ms/op
Iteration   3: 1.439 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.535 ±(99.9%) 0.424 ms/op [Average]
  (min, avg, max) = (1.432, 1.535, 1.782), stdev = 0.151
  CI (99.9%): [1.112, 1.959] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:53
# Fork: 1 of 2
# Warmup Iteration   1: 17.940 ms/op
# Warmup Iteration   2: 11.301 ms/op
Iteration   1: 8.091 ms/op
Iteration   2: 6.697 ms/op
Iteration   3: 6.658 ms/op

# Run progress: 10.87% complete, ETA 00:08:39
# Fork: 2 of 2
# Warmup Iteration   1: 16.684 ms/op
# Warmup Iteration   2: 11.336 ms/op
Iteration   1: 7.984 ms/op
Iteration   2: 6.659 ms/op
Iteration   3: 6.647 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.123 ±(99.9%) 1.989 ms/op [Average]
  (min, avg, max) = (6.647, 7.123, 8.091), stdev = 0.709
  CI (99.9%): [5.133, 9.112] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:08:25
# Fork: 1 of 2
# Warmup Iteration   1: 15.843 ms/op
# Warmup Iteration   2: 10.339 ms/op
Iteration   1: 6.633 ms/op
Iteration   2: 6.270 ms/op
Iteration   3: 6.411 ms/op

# Run progress: 15.22% complete, ETA 00:08:12
# Fork: 2 of 2
# Warmup Iteration   1: 17.423 ms/op
# Warmup Iteration   2: 9.769 ms/op
Iteration   1: 6.467 ms/op
Iteration   2: 8.442 ms/op
Iteration   3: 6.464 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.781 ±(99.9%) 2.305 ms/op [Average]
  (min, avg, max) = (6.270, 6.781, 8.442), stdev = 0.822
  CI (99.9%): [4.476, 9.087] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:58
# Fork: 1 of 2
# Warmup Iteration   1: 37.381 ms/op
# Warmup Iteration   2: 20.356 ms/op
Iteration   1: 15.815 ms/op
Iteration   2: 11.848 ms/op
Iteration   3: 11.780 ms/op

# Run progress: 19.57% complete, ETA 00:07:45
# Fork: 2 of 2
# Warmup Iteration   1: 40.988 ms/op
# Warmup Iteration   2: 20.562 ms/op
Iteration   1: 15.803 ms/op
Iteration   2: 12.032 ms/op
Iteration   3: 11.732 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.168 ±(99.9%) 5.743 ms/op [Average]
  (min, avg, max) = (11.732, 13.168, 15.815), stdev = 2.048
  CI (99.9%): [7.425, 18.912] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:33
# Fork: 1 of 2
# Warmup Iteration   1: 2993.936 ms/op
# Warmup Iteration   2: 880.361 ms/op
Iteration   1: 669.922 ms/op
Iteration   2: 493.531 ms/op
Iteration   3: 482.530 ms/op

# Run progress: 23.91% complete, ETA 00:07:21
# Fork: 2 of 2
# Warmup Iteration   1: 3036.426 ms/op
# Warmup Iteration   2: 900.419 ms/op
Iteration   1: 597.710 ms/op
Iteration   2: 475.101 ms/op
Iteration   3: 474.991 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  532.297 ±(99.9%) 230.402 ms/op [Average]
  (min, avg, max) = (474.991, 532.297, 669.922), stdev = 82.164
  CI (99.9%): [301.895, 762.700] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:07:10
# Fork: 1 of 2
# Warmup Iteration   1: 13939.354 ms/op
# Warmup Iteration   2: 7209.471 ms/op
Iteration   1: 6147.414 ms/op
Iteration   2: 6099.635 ms/op
Iteration   3: 6041.993 ms/op

# Run progress: 28.26% complete, ETA 00:08:06
# Fork: 2 of 2
# Warmup Iteration   1: 12989.112 ms/op
# Warmup Iteration   2: 6856.391 ms/op
Iteration   1: 6418.641 ms/op
Iteration   2: 6286.344 ms/op
Iteration   3: 5966.186 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  6160.036 ±(99.9%) 466.119 ms/op [Average]
  (min, avg, max) = (5966.186, 6160.036, 6418.641), stdev = 166.222
  CI (99.9%): [5693.917, 6626.154] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:08:47
# Fork: 1 of 2
# Warmup Iteration   1: 2436.072 ms/op
# Warmup Iteration   2: 619.964 ms/op
Iteration   1: 548.877 ms/op
Iteration   2: 533.119 ms/op
Iteration   3: 511.163 ms/op

# Run progress: 32.61% complete, ETA 00:08:20
# Fork: 2 of 2
# Warmup Iteration   1: 2398.151 ms/op
# Warmup Iteration   2: 617.057 ms/op
Iteration   1: 549.267 ms/op
Iteration   2: 511.454 ms/op
Iteration   3: 506.677 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  526.759 ±(99.9%) 54.908 ms/op [Average]
  (min, avg, max) = (506.677, 526.759, 549.267), stdev = 19.581
  CI (99.9%): [471.851, 581.667] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:07:55
# Fork: 1 of 2
# Warmup Iteration   1: 3392.112 ms/op
# Warmup Iteration   2: 1356.370 ms/op
Iteration   1: 1343.317 ms/op
Iteration   2: 1169.753 ms/op
Iteration   3: 1129.864 ms/op

# Run progress: 36.96% complete, ETA 00:07:36
# Fork: 2 of 2
# Warmup Iteration   1: 3374.539 ms/op
# Warmup Iteration   2: 1381.361 ms/op
Iteration   1: 1338.062 ms/op
Iteration   2: 1385.650 ms/op
Iteration   3: 1136.369 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1250.503 ±(99.9%) 328.573 ms/op [Average]
  (min, avg, max) = (1129.864, 1250.503, 1385.650), stdev = 117.172
  CI (99.9%): [921.930, 1579.075] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:07:17
# Fork: 1 of 2
# Warmup Iteration   1: 0.350 ms/op
# Warmup Iteration   2: 0.103 ms/op
Iteration   1: 0.100 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.098 ms/op

# Run progress: 41.30% complete, ETA 00:06:54
# Fork: 2 of 2
# Warmup Iteration   1: 0.400 ms/op
# Warmup Iteration   2: 0.115 ms/op
Iteration   1: 0.100 ms/op
Iteration   2: 0.100 ms/op
Iteration   3: 0.100 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.100 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.098, 0.100, 0.100), stdev = 0.001
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

# Run progress: 43.48% complete, ETA 00:06:32
# Fork: 1 of 2
# Warmup Iteration   1: 17.301 ms/op
# Warmup Iteration   2: 7.807 ms/op
Iteration   1: 7.496 ms/op
Iteration   2: 7.465 ms/op
Iteration   3: 7.554 ms/op

# Run progress: 45.65% complete, ETA 00:06:12
# Fork: 2 of 2
# Warmup Iteration   1: 16.583 ms/op
# Warmup Iteration   2: 7.857 ms/op
Iteration   1: 7.557 ms/op
Iteration   2: 7.476 ms/op
Iteration   3: 7.494 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.507 ±(99.9%) 0.110 ms/op [Average]
  (min, avg, max) = (7.465, 7.507, 7.557), stdev = 0.039
  CI (99.9%): [7.397, 7.618] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:05:52
# Fork: 1 of 2
# Warmup Iteration   1: 1.094 ms/op
# Warmup Iteration   2: 0.664 ms/op
Iteration   1: 0.587 ms/op
Iteration   2: 0.582 ms/op
Iteration   3: 0.583 ms/op

# Run progress: 50.00% complete, ETA 00:05:33
# Fork: 2 of 2
# Warmup Iteration   1: 1.116 ms/op
# Warmup Iteration   2: 0.869 ms/op
Iteration   1: 0.639 ms/op
Iteration   2: 0.581 ms/op
Iteration   3: 0.582 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.592 ±(99.9%) 0.064 ms/op [Average]
  (min, avg, max) = (0.581, 0.592, 0.639), stdev = 0.023
  CI (99.9%): [0.528, 0.657] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:05:14
# Fork: 1 of 2
# Warmup Iteration   1: 2.805 ms/op
# Warmup Iteration   2: 1.598 ms/op
Iteration   1: 1.675 ms/op
Iteration   2: 1.510 ms/op
Iteration   3: 1.517 ms/op

# Run progress: 54.35% complete, ETA 00:04:57
# Fork: 2 of 2
# Warmup Iteration   1: 2.815 ms/op
# Warmup Iteration   2: 1.553 ms/op
Iteration   1: 1.662 ms/op
Iteration   2: 1.499 ms/op
Iteration   3: 1.506 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.562 ±(99.9%) 0.233 ms/op [Average]
  (min, avg, max) = (1.499, 1.562, 1.675), stdev = 0.083
  CI (99.9%): [1.328, 1.795] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:04:40
# Fork: 1 of 2
# Warmup Iteration   1: 515.394 ms/op
# Warmup Iteration   2: 74.516 ms/op
Iteration   1: 46.862 ms/op
Iteration   2: 38.794 ms/op
Iteration   3: 35.957 ms/op

# Run progress: 58.70% complete, ETA 00:04:23
# Fork: 2 of 2
# Warmup Iteration   1: 697.617 ms/op
# Warmup Iteration   2: 72.370 ms/op
Iteration   1: 47.540 ms/op
Iteration   2: 37.948 ms/op
Iteration   3: 36.512 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  40.602 ±(99.9%) 14.621 ms/op [Average]
  (min, avg, max) = (35.957, 40.602, 47.540), stdev = 5.214
  CI (99.9%): [25.981, 55.223] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:04:07
# Fork: 1 of 2
# Warmup Iteration   1: 100797.670 ms/op
# Warmup Iteration   2: 93416.132 ms/op
Iteration   1: 91489.564 ms/op
Iteration   2: 91919.978 ms/op
Iteration   3: 91426.093 ms/op

# Run progress: 63.04% complete, ETA 00:08:21
# Fork: 2 of 2
# Warmup Iteration   1: 101797.690 ms/op
# Warmup Iteration   2: 93159.465 ms/op
Iteration   1: 92617.051 ms/op
Iteration   2: 92459.383 ms/op
Iteration   3: 92126.846 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  92006.486 ±(99.9%) 1376.019 ms/op [Average]
  (min, avg, max) = (91426.093, 92006.486, 92617.051), stdev = 490.702
  CI (99.9%): [90630.467, 93382.505] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:49
# Fork: 1 of 2
# Warmup Iteration   1: 13609.356 ms/op
# Warmup Iteration   2: 9648.877 ms/op
Iteration   1: 9490.191 ms/op
Iteration   2: 9431.108 ms/op
Iteration   3: 11857.199 ms/op

# Run progress: 67.39% complete, ETA 00:15:07
# Fork: 2 of 2
# Warmup Iteration   1: 13232.112 ms/op
# Warmup Iteration   2: 9498.544 ms/op
Iteration   1: 9271.356 ms/op
Iteration   2: 9219.363 ms/op
Iteration   3: 11630.264 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  10149.913 ±(99.9%) 3478.991 ms/op [Average]
  (min, avg, max) = (9219.363, 10149.913, 11857.199), stdev = 1240.642
  CI (99.9%): [6670.922, 13628.905] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:17:33
# Fork: 1 of 2
# Warmup Iteration   1: 20779.591 ms/op
# Warmup Iteration   2: 15564.946 ms/op
Iteration   1: 12717.011 ms/op
Iteration   2: 13673.033 ms/op
Iteration   3: 12743.139 ms/op

# Run progress: 71.74% complete, ETA 00:16:18
# Fork: 2 of 2
# Warmup Iteration   1: 24165.559 ms/op
# Warmup Iteration   2: 15827.585 ms/op
Iteration   1: 13831.561 ms/op
Iteration   2: 13530.747 ms/op
Iteration   3: 15160.663 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  13609.359 ±(99.9%) 2512.142 ms/op [Average]
  (min, avg, max) = (12717.011, 13609.359, 15160.663), stdev = 895.854
  CI (99.9%): [11097.217, 16121.501] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:15:06
# Fork: 1 of 2
# Warmup Iteration   1: Oct 28, 2026 10:10:15 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 10:10:15 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
168.880 ms/op
# Warmup Iteration   2: 64.097 ms/op
Iteration   1: 66.164 ms/op
Iteration   2: 63.272 ms/op
Iteration   3: 62.950 ms/op

# Run progress: 76.09% complete, ETA 00:13:30
# Fork: 2 of 2
# Warmup Iteration   1: Oct 28, 2026 10:10:27 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 10:10:27 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
168.601 ms/op
# Warmup Iteration   2: 68.090 ms/op
Iteration   1: 66.825 ms/op
Iteration   2: 63.649 ms/op
Iteration   3: 63.003 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  64.310 ±(99.9%) 4.830 ms/op [Average]
  (min, avg, max) = (62.950, 64.310, 66.825), stdev = 1.722
  CI (99.9%): [59.481, 69.140] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:11:59
# Fork: 1 of 2
# Warmup Iteration   1: 264.211 ms/op
# Warmup Iteration   2: 127.279 ms/op
Iteration   1: 83.848 ms/op
Iteration   2: 83.607 ms/op
Iteration   3: 83.675 ms/op

# Run progress: 80.43% complete, ETA 00:10:33
# Fork: 2 of 2
# Warmup Iteration   1: 231.960 ms/op
# Warmup Iteration   2: 90.337 ms/op
Iteration   1: 79.231 ms/op
Iteration   2: 79.537 ms/op
Iteration   3: 78.823 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  81.454 ±(99.9%) 6.964 ms/op [Average]
  (min, avg, max) = (78.823, 81.454, 83.848), stdev = 2.483
  CI (99.9%): [74.490, 88.418] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:09:10
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:07:51
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

# Run progress: 86.96% complete, ETA 00:06:35
# Fork: 1 of 2
# Warmup Iteration   1: 1.547 ms/op
# Warmup Iteration   2: 0.819 ms/op
Iteration   1: 0.680 ms/op
Iteration   2: 0.695 ms/op
Iteration   3: 0.661 ms/op

# Run progress: 89.13% complete, ETA 00:05:23
# Fork: 2 of 2
# Warmup Iteration   1: 1.379 ms/op
# Warmup Iteration   2: 0.823 ms/op
Iteration   1: 0.687 ms/op
Iteration   2: 0.685 ms/op
Iteration   3: 0.663 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.678 ±(99.9%) 0.038 ms/op [Average]
  (min, avg, max) = (0.661, 0.678, 0.695), stdev = 0.014
  CI (99.9%): [0.640, 0.717] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:04:13
# Fork: 1 of 2
# Warmup Iteration   1: 32.612 ms/op
# Warmup Iteration   2: 21.770 ms/op
Iteration   1: 14.493 ms/op
Iteration   2: 14.690 ms/op
Iteration   3: 15.273 ms/op

# Run progress: 93.48% complete, ETA 00:03:06
# Fork: 2 of 2
# Warmup Iteration   1: 32.371 ms/op
# Warmup Iteration   2: 19.919 ms/op
Iteration   1: 14.245 ms/op
Iteration   2: 14.684 ms/op
Iteration   3: 15.770 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  14.859 ±(99.9%) 1.571 ms/op [Average]
  (min, avg, max) = (14.245, 14.859, 15.770), stdev = 0.560
  CI (99.9%): [13.288, 16.431] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:02:02
# Fork: 1 of 2
# Warmup Iteration   1: 37.798 ms/op
# Warmup Iteration   2: 24.889 ms/op
Iteration   1: 24.849 ms/op
Iteration   2: 24.885 ms/op
Iteration   3: 25.644 ms/op

# Run progress: 97.83% complete, ETA 00:01:00
# Fork: 2 of 2
# Warmup Iteration   1: 50.735 ms/op
# Warmup Iteration   2: 30.864 ms/op
Iteration   1: 30.779 ms/op
Iteration   2: 30.942 ms/op
Iteration   3: 30.848 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  27.991 ±(99.9%) 8.839 ms/op [Average]
  (min, avg, max) = (24.849, 27.991, 30.942), stdev = 3.152
  CI (99.9%): [19.153, 36.830] (assumes normal distribution)


# Run complete. Total time: 00:45:12

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     19.462 ±    0.590  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.535 ±    0.424  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      7.123 ±    1.989  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.781 ±    2.305  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     13.168 ±    5.743  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    532.297 ±  230.402  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   6160.036 ±  466.119  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    526.759 ±   54.908  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1250.503 ±  328.573  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.100 ±    0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.507 ±    0.110  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.592 ±    0.064  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.562 ±    0.233  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     40.602 ±   14.621  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  92006.486 ± 1376.019  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  10149.913 ± 3478.991  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  13609.359 ± 2512.142  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     64.310 ±    4.830  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     81.454 ±    6.964  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.678 ±    0.038  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     14.859 ±    1.571  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     27.991 ±    8.839  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.13.0 -> 3.14.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 10 lower, 13 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 11797.7 | 10149.9 | -13.97% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 15221.1 | 13609.4 | -10.59% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 89.5708 | 81.4537 | -9.06% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.32965 | 6.7813 | +7.14% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 8.05247 | 7.50716 | -6.77% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 60.9364 | 64.3105 | +5.54% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 549.717 | 526.759 | -4.18% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.707238 | 0.678298 | -4.09% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000361648 | 0.000376293 | +4.05% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 12.6741 | 13.1682 | +3.90% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
