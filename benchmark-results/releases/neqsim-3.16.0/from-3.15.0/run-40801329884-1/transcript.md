# NeqSim 3.16.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.15.0 |
| Current | 3.16.0 |
| Source commit | `3fc5c93d57416b810f13a8204c1163139a09f66f` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40801329884) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "3fc5c93d57416b810f13a8204c1163139a09f66f",
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
BogoMIPS:                                4890.86
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
| baseline | 3.15.0 | passed |
| current | 3.16.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.15.0",
  "version": "3.15.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.15.0/neqsim-3.15.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.16.0",
  "version": "3.16.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.16.0/neqsim-3.16.0.jar",
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
[INFO] Total time:  8.392 s
[INFO] Finished at: 2026-10-29T01:36:05Z
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
tpFlashLeanGas                                                 60.0000  (49 ms)
tpFlashWellFluidSrk                                            83.6406  (120 ms)
tpFlashWellFluidPr                                             83.6541  (117 ms)
tpFlashWellFluidWithProperties                                 5445.46  (148 ms)
phAndPsFlashWellFluid                                          2459.23  (97 ms)
Oct 29, 2026 1:36:22 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 1:36:22 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (624 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (313 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (39 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (101 ms)
saturationPointsWellFluid                                      1601.32  (179 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1504 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1672 ms)
levenbergMarquardtAntoine                                      1837.31  (15 ms)
levenbergMarquardtDoubleExponential                            5.57177  (9 ms)
dataReconciliation[20]                                         7.89841  (24 ms)
dataReconciliation[100]                                        37.0132  (84 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.184 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 14.45 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.028 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 539935 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 539.9 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 20517 ms, solved=true, gas=318849.56 kg/hr, water in/out=0.00027104531/1.5353072e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018484305, composition error=0.0029102350
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00013837326
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 20.52 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  10:05 min
[INFO] Finished at: 2026-10-29T01:46:13Z
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
# Warmup Iteration   1: 38.124 ms/op
# Warmup Iteration   2: 19.887 ms/op
Iteration   1: 19.300 ms/op
Iteration   2: 19.387 ms/op
Iteration   3: 19.348 ms/op

# Run progress: 2.17% complete, ETA 00:09:19
# Fork: 2 of 2
# Warmup Iteration   1: 39.287 ms/op
# Warmup Iteration   2: 19.837 ms/op
Iteration   1: 24.510 ms/op
Iteration   2: 19.827 ms/op
Iteration   3: 18.934 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  20.218 ±(99.9%) 5.950 ms/op [Average]
  (min, avg, max) = (18.934, 20.218, 24.510), stdev = 2.122
  CI (99.9%): [14.268, 26.168] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:09:05
# Fork: 1 of 2
# Warmup Iteration   1: 4.288 ms/op
# Warmup Iteration   2: 2.607 ms/op
Iteration   1: 1.525 ms/op
Iteration   2: 1.509 ms/op
Iteration   3: 1.513 ms/op

# Run progress: 6.52% complete, ETA 00:08:53
# Fork: 2 of 2
# Warmup Iteration   1: 4.450 ms/op
# Warmup Iteration   2: 2.385 ms/op
Iteration   1: 1.520 ms/op
Iteration   2: 1.501 ms/op
Iteration   3: 1.498 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.511 ±(99.9%) 0.030 ms/op [Average]
  (min, avg, max) = (1.498, 1.511, 1.525), stdev = 0.011
  CI (99.9%): [1.481, 1.541] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:40
# Fork: 1 of 2
# Warmup Iteration   1: 17.132 ms/op
# Warmup Iteration   2: 9.288 ms/op
Iteration   1: 6.640 ms/op
Iteration   2: 6.609 ms/op
Iteration   3: 6.667 ms/op

# Run progress: 10.87% complete, ETA 00:08:28
# Fork: 2 of 2
# Warmup Iteration   1: 16.325 ms/op
# Warmup Iteration   2: 10.396 ms/op
Iteration   1: 6.761 ms/op
Iteration   2: 6.564 ms/op
Iteration   3: 6.530 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.629 ±(99.9%) 0.229 ms/op [Average]
  (min, avg, max) = (6.530, 6.629, 6.761), stdev = 0.082
  CI (99.9%): [6.399, 6.858] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:08:16
# Fork: 1 of 2
# Warmup Iteration   1: 14.623 ms/op
# Warmup Iteration   2: 14.250 ms/op
Iteration   1: 7.564 ms/op
Iteration   2: 6.259 ms/op
Iteration   3: 6.237 ms/op

# Run progress: 15.22% complete, ETA 00:08:03
# Fork: 2 of 2
# Warmup Iteration   1: 16.458 ms/op
# Warmup Iteration   2: 8.491 ms/op
Iteration   1: 6.300 ms/op
Iteration   2: 6.284 ms/op
Iteration   3: 6.294 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.490 ±(99.9%) 1.478 ms/op [Average]
  (min, avg, max) = (6.237, 6.490, 7.564), stdev = 0.527
  CI (99.9%): [5.012, 7.968] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:51
# Fork: 1 of 2
# Warmup Iteration   1: 36.048 ms/op
# Warmup Iteration   2: 19.272 ms/op
Iteration   1: 14.636 ms/op
Iteration   2: 11.970 ms/op
Iteration   3: 11.671 ms/op

# Run progress: 19.57% complete, ETA 00:07:38
# Fork: 2 of 2
# Warmup Iteration   1: 36.635 ms/op
# Warmup Iteration   2: 19.689 ms/op
Iteration   1: 13.753 ms/op
Iteration   2: 11.884 ms/op
Iteration   3: 11.791 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  12.617 ±(99.9%) 3.525 ms/op [Average]
  (min, avg, max) = (11.671, 12.617, 14.636), stdev = 1.257
  CI (99.9%): [9.093, 16.142] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:26
# Fork: 1 of 2
# Warmup Iteration   1: 2872.844 ms/op
# Warmup Iteration   2: 1012.077 ms/op
Iteration   1: 726.396 ms/op
Iteration   2: 525.644 ms/op
Iteration   3: 477.401 ms/op

# Run progress: 23.91% complete, ETA 00:07:12
# Fork: 2 of 2
# Warmup Iteration   1: 3481.953 ms/op
# Warmup Iteration   2: 1025.823 ms/op
Iteration   1: 782.463 ms/op
Iteration   2: 674.032 ms/op
Iteration   3: 515.698 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  616.939 ±(99.9%) 356.239 ms/op [Average]
  (min, avg, max) = (477.401, 616.939, 782.463), stdev = 127.038
  CI (99.9%): [260.700, 973.178] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 12187.774 ms/op
# Warmup Iteration   2: 6792.630 ms/op
Iteration   1: 6021.687 ms/op
Iteration   2: 5903.516 ms/op
Iteration   3: 5975.360 ms/op

# Run progress: 28.26% complete, ETA 00:07:50
# Fork: 2 of 2
# Warmup Iteration   1: 13160.519 ms/op
# Warmup Iteration   2: 7325.346 ms/op
Iteration   1: 6117.280 ms/op
Iteration   2: 5922.012 ms/op
Iteration   3: 5908.531 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  5974.731 ±(99.9%) 233.805 ms/op [Average]
  (min, avg, max) = (5903.516, 5974.731, 6117.280), stdev = 83.377
  CI (99.9%): [5740.926, 6208.536] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:08:32
# Fork: 1 of 2
# Warmup Iteration   1: 2426.654 ms/op
# Warmup Iteration   2: 614.162 ms/op
Iteration   1: 541.865 ms/op
Iteration   2: 519.340 ms/op
Iteration   3: 508.760 ms/op

# Run progress: 32.61% complete, ETA 00:08:06
# Fork: 2 of 2
# Warmup Iteration   1: 2473.758 ms/op
# Warmup Iteration   2: 615.774 ms/op
Iteration   1: 554.408 ms/op
Iteration   2: 519.854 ms/op
Iteration   3: 505.749 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  524.996 ±(99.9%) 53.824 ms/op [Average]
  (min, avg, max) = (505.749, 524.996, 554.408), stdev = 19.194
  CI (99.9%): [471.172, 578.821] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:07:43
# Fork: 1 of 2
# Warmup Iteration   1: 3320.144 ms/op
# Warmup Iteration   2: 1323.789 ms/op
Iteration   1: 1259.144 ms/op
Iteration   2: 1306.185 ms/op
Iteration   3: 1314.787 ms/op

# Run progress: 36.96% complete, ETA 00:07:25
# Fork: 2 of 2
# Warmup Iteration   1: 3485.531 ms/op
# Warmup Iteration   2: 1364.187 ms/op
Iteration   1: 1308.926 ms/op
Iteration   2: 1176.345 ms/op
Iteration   3: 1102.379 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1244.628 ±(99.9%) 244.315 ms/op [Average]
  (min, avg, max) = (1102.379, 1244.628, 1314.787), stdev = 87.125
  CI (99.9%): [1000.312, 1488.943] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:07:07
# Fork: 1 of 2
# Warmup Iteration   1: 0.382 ms/op
# Warmup Iteration   2: 0.148 ms/op
Iteration   1: 0.098 ms/op
Iteration   2: 0.098 ms/op
Iteration   3: 0.097 ms/op

# Run progress: 41.30% complete, ETA 00:06:45
# Fork: 2 of 2
# Warmup Iteration   1: 0.358 ms/op
# Warmup Iteration   2: 0.103 ms/op
Iteration   1: 0.098 ms/op
Iteration   2: 0.098 ms/op
Iteration   3: 0.098 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.098 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.097, 0.098, 0.098), stdev = 0.001
  CI (99.9%): [0.097, 0.099] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:06:24
# Fork: 1 of 2
# Warmup Iteration   1: 16.051 ms/op
# Warmup Iteration   2: 7.809 ms/op
Iteration   1: 7.563 ms/op
Iteration   2: 7.446 ms/op
Iteration   3: 7.872 ms/op

# Run progress: 45.65% complete, ETA 00:06:04
# Fork: 2 of 2
# Warmup Iteration   1: 16.177 ms/op
# Warmup Iteration   2: 7.775 ms/op
Iteration   1: 7.500 ms/op
Iteration   2: 7.459 ms/op
Iteration   3: 7.810 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.608 ±(99.9%) 0.521 ms/op [Average]
  (min, avg, max) = (7.446, 7.608, 7.872), stdev = 0.186
  CI (99.9%): [7.088, 8.129] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.094 ms/op
# Warmup Iteration   2: 0.965 ms/op
Iteration   1: 0.584 ms/op
Iteration   2: 0.579 ms/op
Iteration   3: 0.579 ms/op

# Run progress: 50.00% complete, ETA 00:05:26
# Fork: 2 of 2
# Warmup Iteration   1: 1.088 ms/op
# Warmup Iteration   2: 0.651 ms/op
Iteration   1: 0.586 ms/op
Iteration   2: 0.582 ms/op
Iteration   3: 0.581 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.582 ±(99.9%) 0.008 ms/op [Average]
  (min, avg, max) = (0.579, 0.582, 0.586), stdev = 0.003
  CI (99.9%): [0.574, 0.590] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:05:08
# Fork: 1 of 2
# Warmup Iteration   1: 2.849 ms/op
# Warmup Iteration   2: 1.619 ms/op
Iteration   1: 1.706 ms/op
Iteration   2: 1.556 ms/op
Iteration   3: 1.556 ms/op

# Run progress: 54.35% complete, ETA 00:04:51
# Fork: 2 of 2
# Warmup Iteration   1: 2.873 ms/op
# Warmup Iteration   2: 1.572 ms/op
Iteration   1: 1.662 ms/op
Iteration   2: 1.515 ms/op
Iteration   3: 1.508 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.584 ±(99.9%) 0.228 ms/op [Average]
  (min, avg, max) = (1.508, 1.584, 1.706), stdev = 0.081
  CI (99.9%): [1.355, 1.812] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 505.565 ms/op
# Warmup Iteration   2: 68.211 ms/op
Iteration   1: 40.447 ms/op
Iteration   2: 37.321 ms/op
Iteration   3: 34.564 ms/op

# Run progress: 58.70% complete, ETA 00:04:19
# Fork: 2 of 2
# Warmup Iteration   1: 417.827 ms/op
# Warmup Iteration   2: 62.654 ms/op
Iteration   1: 42.871 ms/op
Iteration   2: 36.392 ms/op
Iteration   3: 33.277 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  37.479 ±(99.9%) 10.129 ms/op [Average]
  (min, avg, max) = (33.277, 37.479, 42.871), stdev = 3.612
  CI (99.9%): [27.350, 47.608] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 99055.459 ms/op
# Warmup Iteration   2: 93385.593 ms/op
Iteration   1: 92240.709 ms/op
Iteration   2: 91521.665 ms/op
Iteration   3: 91118.463 ms/op

# Run progress: 63.04% complete, ETA 00:08:17
# Fork: 2 of 2
# Warmup Iteration   1: 100624.176 ms/op
# Warmup Iteration   2: 93963.194 ms/op
Iteration   1: 91794.581 ms/op
Iteration   2: 92287.845 ms/op
Iteration   3: 91743.596 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  91784.476 ±(99.9%) 1238.895 ms/op [Average]
  (min, avg, max) = (91118.463, 91784.476, 92287.845), stdev = 441.802
  CI (99.9%): [90545.581, 93023.372] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:44
# Fork: 1 of 2
# Warmup Iteration   1: 14088.693 ms/op
# Warmup Iteration   2: 9711.273 ms/op
Iteration   1: 10015.486 ms/op
Iteration   2: 9915.407 ms/op
Iteration   3: 12933.515 ms/op

# Run progress: 67.39% complete, ETA 00:15:12
# Fork: 2 of 2
# Warmup Iteration   1: 13509.661 ms/op
# Warmup Iteration   2: 9156.872 ms/op
Iteration   1: 9450.143 ms/op
Iteration   2: 9370.241 ms/op
Iteration   3: 12302.429 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  10664.537 ±(99.9%) 4337.592 ms/op [Average]
  (min, avg, max) = (9370.241, 10664.537, 12933.515), stdev = 1546.827
  CI (99.9%): [6326.946, 15002.129] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:17:42
# Fork: 1 of 2
# Warmup Iteration   1: 21304.474 ms/op
# Warmup Iteration   2: 13916.560 ms/op
Iteration   1: 12246.852 ms/op
Iteration   2: 13104.150 ms/op
Iteration   3: 12058.062 ms/op

# Run progress: 71.74% complete, ETA 00:16:25
# Fork: 2 of 2
# Warmup Iteration   1: 21464.410 ms/op
# Warmup Iteration   2: 14845.219 ms/op
Iteration   1: 12769.277 ms/op
Iteration   2: 12567.139 ms/op
Iteration   3: 12922.285 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  12611.294 ±(99.9%) 1125.464 ms/op [Average]
  (min, avg, max) = (12058.062, 12611.294, 13104.150), stdev = 401.351
  CI (99.9%): [11485.830, 13736.758] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:15:09
# Fork: 1 of 2
# Warmup Iteration   1: Oct 29, 2026 2:29:12 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 2:29:12 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
147.562 ms/op
# Warmup Iteration   2: 58.135 ms/op
Iteration   1: 59.646 ms/op
Iteration   2: 57.061 ms/op
Iteration   3: 56.755 ms/op

# Run progress: 76.09% complete, ETA 00:13:33
# Fork: 2 of 2
# Warmup Iteration   1: Oct 29, 2026 2:29:24 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 2:29:24 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
144.530 ms/op
# Warmup Iteration   2: 57.329 ms/op
Iteration   1: 59.459 ms/op
Iteration   2: 57.184 ms/op
Iteration   3: 71.004 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  60.185 ±(99.9%) 15.277 ms/op [Average]
  (min, avg, max) = (56.755, 60.185, 71.004), stdev = 5.448
  CI (99.9%): [44.908, 75.462] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:12:02
# Fork: 1 of 2
# Warmup Iteration   1: 201.824 ms/op
# Warmup Iteration   2: 84.536 ms/op
Iteration   1: 79.999 ms/op
Iteration   2: 79.546 ms/op
Iteration   3: 79.695 ms/op

# Run progress: 80.43% complete, ETA 00:10:35
# Fork: 2 of 2
# Warmup Iteration   1: 201.613 ms/op
# Warmup Iteration   2: 96.397 ms/op
Iteration   1: 83.432 ms/op
Iteration   2: 82.044 ms/op
Iteration   3: 81.665 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  81.064 ±(99.9%) 4.387 ms/op [Average]
  (min, avg, max) = (79.546, 81.064, 83.432), stdev = 1.565
  CI (99.9%): [76.676, 85.451] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:09:12
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:07:53
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

# Run progress: 86.96% complete, ETA 00:06:37
# Fork: 1 of 2
# Warmup Iteration   1: 1.505 ms/op
# Warmup Iteration   2: 0.832 ms/op
Iteration   1: 0.699 ms/op
Iteration   2: 0.689 ms/op
Iteration   3: 0.784 ms/op

# Run progress: 89.13% complete, ETA 00:05:24
# Fork: 2 of 2
# Warmup Iteration   1: 1.533 ms/op
# Warmup Iteration   2: 0.832 ms/op
Iteration   1: 0.695 ms/op
Iteration   2: 0.687 ms/op
Iteration   3: 0.654 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.701 ±(99.9%) 0.122 ms/op [Average]
  (min, avg, max) = (0.654, 0.701, 0.784), stdev = 0.044
  CI (99.9%): [0.579, 0.824] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:04:14
# Fork: 1 of 2
# Warmup Iteration   1: 32.369 ms/op
# Warmup Iteration   2: 20.626 ms/op
Iteration   1: 14.161 ms/op
Iteration   2: 15.569 ms/op
Iteration   3: 15.264 ms/op

# Run progress: 93.48% complete, ETA 00:03:07
# Fork: 2 of 2
# Warmup Iteration   1: 31.566 ms/op
# Warmup Iteration   2: 18.777 ms/op
Iteration   1: 12.694 ms/op
Iteration   2: 13.460 ms/op
Iteration   3: 13.444 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  14.099 ±(99.9%) 3.156 ms/op [Average]
  (min, avg, max) = (12.694, 14.099, 15.569), stdev = 1.125
  CI (99.9%): [10.943, 17.255] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 36.782 ms/op
# Warmup Iteration   2: 25.097 ms/op
Iteration   1: 25.087 ms/op
Iteration   2: 24.948 ms/op
Iteration   3: 25.740 ms/op

# Run progress: 97.83% complete, ETA 00:01:00
# Fork: 2 of 2
# Warmup Iteration   1: 39.557 ms/op
# Warmup Iteration   2: 24.962 ms/op
Iteration   1: 24.853 ms/op
Iteration   2: 24.875 ms/op
Iteration   3: 31.142 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  26.107 ±(99.9%) 6.978 ms/op [Average]
  (min, avg, max) = (24.853, 26.107, 31.142), stdev = 2.488
  CI (99.9%): [19.129, 33.085] (assumes normal distribution)


# Run complete. Total time: 00:45:21

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     20.218 ±    5.950  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.511 ±    0.030  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.629 ±    0.229  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.490 ±    1.478  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     12.617 ±    3.525  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    616.939 ±  356.239  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   5974.731 ±  233.805  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    524.996 ±   53.824  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1244.628 ±  244.315  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.098 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.608 ±    0.521  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.582 ±    0.008  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.584 ±    0.228  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     37.479 ±   10.129  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  91784.476 ± 1238.895  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  10664.537 ± 4337.592  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  12611.294 ± 1125.464  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     60.185 ±   15.277  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     81.064 ±    4.387  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.701 ±    0.122  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     14.099 ±    3.156  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     26.107 ±    6.978  ms/op

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
[INFO] Total time:  4.013 s
[INFO] Finished at: 2026-10-29T02:31:41Z
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
tpFlashLeanGas                                                 60.0000  (55 ms)
tpFlashWellFluidSrk                                            83.6406  (168 ms)
tpFlashWellFluidPr                                             83.6541  (89 ms)
tpFlashWellFluidWithProperties                                 5445.46  (146 ms)
phAndPsFlashWellFluid                                          2459.23  (89 ms)
Oct 29, 2026 2:31:52 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 2:31:52 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (653 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (394 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (37 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (120 ms)
saturationPointsWellFluid                                      1601.32  (190 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1516 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1681 ms)
levenbergMarquardtAntoine                                      1837.31  (12 ms)
levenbergMarquardtDoubleExponential                            5.57177  (13 ms)
dataReconciliation[20]                                         7.89841  (28 ms)
dataReconciliation[100]                                        37.0132  (87 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.266 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 12.71 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.031 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 537803 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 96 / 150
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

feed 5489240.1, gas 264776.8 + 378168.9, oil 1995465.5 + 2850765.5, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.449 MSm3/d, KA27841 A 102.5 bara, pipeline outlet 50.8 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 537.8 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 26450 ms, solved=true, gas=318849.56 kg/hr, water in/out=0.00027104531/1.5353072e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018484305, composition error=0.0029102350
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00013837326
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 26.46 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  10:00 min
[INFO] Finished at: 2026-10-29T02:41:42Z
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
# Warmup Iteration   1: 36.421 ms/op
# Warmup Iteration   2: 19.907 ms/op
Iteration   1: 19.180 ms/op
Iteration   2: 19.346 ms/op
Iteration   3: 19.165 ms/op

# Run progress: 2.17% complete, ETA 00:09:21
# Fork: 2 of 2
# Warmup Iteration   1: 35.739 ms/op
# Warmup Iteration   2: 19.213 ms/op
Iteration   1: 18.808 ms/op
Iteration   2: 19.043 ms/op
Iteration   3: 18.868 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  19.068 ±(99.9%) 0.571 ms/op [Average]
  (min, avg, max) = (18.808, 19.068, 19.346), stdev = 0.203
  CI (99.9%): [18.498, 19.639] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:09:07
# Fork: 1 of 2
# Warmup Iteration   1: 4.186 ms/op
# Warmup Iteration   2: 2.834 ms/op
Iteration   1: 1.453 ms/op
Iteration   2: 1.451 ms/op
Iteration   3: 1.445 ms/op

# Run progress: 6.52% complete, ETA 00:08:55
# Fork: 2 of 2
# Warmup Iteration   1: 4.232 ms/op
# Warmup Iteration   2: 2.841 ms/op
Iteration   1: 1.466 ms/op
Iteration   2: 1.435 ms/op
Iteration   3: 1.437 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.448 ±(99.9%) 0.032 ms/op [Average]
  (min, avg, max) = (1.435, 1.448, 1.466), stdev = 0.011
  CI (99.9%): [1.416, 1.480] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 36.037 ms/op
# Warmup Iteration   2: 11.176 ms/op
Iteration   1: 7.076 ms/op
Iteration   2: 6.363 ms/op
Iteration   3: 6.397 ms/op

# Run progress: 10.87% complete, ETA 00:08:30
# Fork: 2 of 2
# Warmup Iteration   1: 14.886 ms/op
# Warmup Iteration   2: 10.129 ms/op
Iteration   1: 6.647 ms/op
Iteration   2: 6.409 ms/op
Iteration   3: 6.462 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.559 ±(99.9%) 0.765 ms/op [Average]
  (min, avg, max) = (6.363, 6.559, 7.076), stdev = 0.273
  CI (99.9%): [5.795, 7.324] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 15.455 ms/op
# Warmup Iteration   2: 9.128 ms/op
Iteration   1: 6.314 ms/op
Iteration   2: 6.274 ms/op
Iteration   3: 6.304 ms/op

# Run progress: 15.22% complete, ETA 00:08:04
# Fork: 2 of 2
# Warmup Iteration   1: 15.783 ms/op
# Warmup Iteration   2: 9.459 ms/op
Iteration   1: 6.517 ms/op
Iteration   2: 6.449 ms/op
Iteration   3: 6.475 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.389 ±(99.9%) 0.290 ms/op [Average]
  (min, avg, max) = (6.274, 6.389, 6.517), stdev = 0.103
  CI (99.9%): [6.099, 6.679] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:51
# Fork: 1 of 2
# Warmup Iteration   1: 33.428 ms/op
# Warmup Iteration   2: 19.560 ms/op
Iteration   1: 15.249 ms/op
Iteration   2: 11.885 ms/op
Iteration   3: 14.231 ms/op

# Run progress: 19.57% complete, ETA 00:07:39
# Fork: 2 of 2
# Warmup Iteration   1: 36.042 ms/op
# Warmup Iteration   2: 19.750 ms/op
Iteration   1: 13.743 ms/op
Iteration   2: 11.859 ms/op
Iteration   3: 11.742 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.118 ±(99.9%) 4.191 ms/op [Average]
  (min, avg, max) = (11.742, 13.118, 15.249), stdev = 1.495
  CI (99.9%): [8.927, 17.309] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:27
# Fork: 1 of 2
# Warmup Iteration   1: 2974.379 ms/op
# Warmup Iteration   2: 929.180 ms/op
Iteration   1: 783.716 ms/op
Iteration   2: 786.892 ms/op
Iteration   3: 573.691 ms/op

# Run progress: 23.91% complete, ETA 00:07:16
# Fork: 2 of 2
# Warmup Iteration   1: 2886.020 ms/op
# Warmup Iteration   2: 892.165 ms/op
Iteration   1: 672.512 ms/op
Iteration   2: 490.381 ms/op
Iteration   3: 472.604 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  629.966 ±(99.9%) 391.561 ms/op [Average]
  (min, avg, max) = (472.604, 629.966, 786.892), stdev = 139.635
  CI (99.9%): [238.404, 1021.527] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 11936.728 ms/op
# Warmup Iteration   2: 6690.011 ms/op
Iteration   1: 6548.433 ms/op
Iteration   2: 5918.482 ms/op
Iteration   3: 5840.417 ms/op

# Run progress: 28.26% complete, ETA 00:07:55
# Fork: 2 of 2
# Warmup Iteration   1: 12353.386 ms/op
# Warmup Iteration   2: 7049.189 ms/op
Iteration   1: 6126.700 ms/op
Iteration   2: 6083.157 ms/op
Iteration   3: 5994.058 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  6085.208 ±(99.9%) 700.858 ms/op [Average]
  (min, avg, max) = (5840.417, 6085.208, 6548.433), stdev = 249.933
  CI (99.9%): [5384.350, 6786.066] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:08:34
# Fork: 1 of 2
# Warmup Iteration   1: 2431.503 ms/op
# Warmup Iteration   2: 626.265 ms/op
Iteration   1: 733.504 ms/op
Iteration   2: 514.837 ms/op
Iteration   3: 508.170 ms/op

# Run progress: 32.61% complete, ETA 00:08:09
# Fork: 2 of 2
# Warmup Iteration   1: 2430.205 ms/op
# Warmup Iteration   2: 615.050 ms/op
Iteration   1: 555.397 ms/op
Iteration   2: 515.728 ms/op
Iteration   3: 513.228 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  556.811 ±(99.9%) 247.460 ms/op [Average]
  (min, avg, max) = (508.170, 556.811, 733.504), stdev = 88.247
  CI (99.9%): [309.351, 804.271] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:07:45
# Fork: 1 of 2
# Warmup Iteration   1: 3281.166 ms/op
# Warmup Iteration   2: 1304.661 ms/op
Iteration   1: 1230.246 ms/op
Iteration   2: 1278.647 ms/op
Iteration   3: 1119.345 ms/op

# Run progress: 36.96% complete, ETA 00:07:26
# Fork: 2 of 2
# Warmup Iteration   1: 3390.786 ms/op
# Warmup Iteration   2: 1376.603 ms/op
Iteration   1: 1247.534 ms/op
Iteration   2: 1289.767 ms/op
Iteration   3: 1131.302 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1216.140 ±(99.9%) 206.368 ms/op [Average]
  (min, avg, max) = (1119.345, 1216.140, 1289.767), stdev = 73.593
  CI (99.9%): [1009.773, 1422.508] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:07:08
# Fork: 1 of 2
# Warmup Iteration   1: 0.382 ms/op
# Warmup Iteration   2: 0.109 ms/op
Iteration   1: 0.098 ms/op
Iteration   2: 0.098 ms/op
Iteration   3: 0.098 ms/op

# Run progress: 41.30% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 0.315 ms/op
# Warmup Iteration   2: 0.107 ms/op
Iteration   1: 0.131 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.099 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.104 ±(99.9%) 0.037 ms/op [Average]
  (min, avg, max) = (0.098, 0.104, 0.131), stdev = 0.013
  CI (99.9%): [0.067, 0.141] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 19.328 ms/op
# Warmup Iteration   2: 8.087 ms/op
Iteration   1: 7.819 ms/op
Iteration   2: 7.488 ms/op
Iteration   3: 7.798 ms/op

# Run progress: 45.65% complete, ETA 00:06:05
# Fork: 2 of 2
# Warmup Iteration   1: 16.154 ms/op
# Warmup Iteration   2: 7.867 ms/op
Iteration   1: 7.584 ms/op
Iteration   2: 7.451 ms/op
Iteration   3: 7.868 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.668 ±(99.9%) 0.511 ms/op [Average]
  (min, avg, max) = (7.451, 7.668, 7.868), stdev = 0.182
  CI (99.9%): [7.157, 8.180] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.120 ms/op
# Warmup Iteration   2: 0.680 ms/op
Iteration   1: 0.609 ms/op
Iteration   2: 0.604 ms/op
Iteration   3: 0.605 ms/op

# Run progress: 50.00% complete, ETA 00:05:27
# Fork: 2 of 2
# Warmup Iteration   1: 1.101 ms/op
# Warmup Iteration   2: 0.652 ms/op
Iteration   1: 0.583 ms/op
Iteration   2: 0.584 ms/op
Iteration   3: 0.583 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.595 ±(99.9%) 0.035 ms/op [Average]
  (min, avg, max) = (0.583, 0.595, 0.609), stdev = 0.013
  CI (99.9%): [0.560, 0.630] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2.774 ms/op
# Warmup Iteration   2: 1.596 ms/op
Iteration   1: 1.668 ms/op
Iteration   2: 1.509 ms/op
Iteration   3: 1.519 ms/op

# Run progress: 54.35% complete, ETA 00:04:52
# Fork: 2 of 2
# Warmup Iteration   1: 2.729 ms/op
# Warmup Iteration   2: 2.293 ms/op
Iteration   1: 1.679 ms/op
Iteration   2: 1.531 ms/op
Iteration   3: 1.522 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.571 ±(99.9%) 0.223 ms/op [Average]
  (min, avg, max) = (1.509, 1.571, 1.679), stdev = 0.080
  CI (99.9%): [1.348, 1.794] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 422.260 ms/op
# Warmup Iteration   2: 66.047 ms/op
Iteration   1: 40.381 ms/op
Iteration   2: 35.475 ms/op
Iteration   3: 34.011 ms/op

# Run progress: 58.70% complete, ETA 00:04:19
# Fork: 2 of 2
# Warmup Iteration   1: 524.028 ms/op
# Warmup Iteration   2: 73.410 ms/op
Iteration   1: 45.103 ms/op
Iteration   2: 36.016 ms/op
Iteration   3: 34.035 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  37.504 ±(99.9%) 12.325 ms/op [Average]
  (min, avg, max) = (34.011, 37.504, 45.103), stdev = 4.395
  CI (99.9%): [25.179, 49.828] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 93060.422 ms/op
# Warmup Iteration   2: 86347.600 ms/op
Iteration   1: 84692.642 ms/op
Iteration   2: 85101.574 ms/op
Iteration   3: 84681.390 ms/op

# Run progress: 63.04% complete, ETA 00:07:57
# Fork: 2 of 2
# Warmup Iteration   1: 91935.168 ms/op
# Warmup Iteration   2: 84536.718 ms/op
Iteration   1: 84188.903 ms/op
Iteration   2: 83679.138 ms/op
Iteration   3: 83812.121 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  84359.295 ±(99.9%) 1564.771 ms/op [Average]
  (min, avg, max) = (83679.138, 84359.295, 85101.574), stdev = 558.013
  CI (99.9%): [82794.523, 85924.066] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:04
# Fork: 1 of 2
# Warmup Iteration   1: 11518.049 ms/op
# Warmup Iteration   2: 9501.261 ms/op
Iteration   1: 11939.607 ms/op
Iteration   2: 9129.360 ms/op
Iteration   3: 13199.059 ms/op

# Run progress: 67.39% complete, ETA 00:14:21
# Fork: 2 of 2
# Warmup Iteration   1: 11097.894 ms/op
# Warmup Iteration   2: 10043.084 ms/op
Iteration   1: 12014.741 ms/op
Iteration   2: 9234.832 ms/op
Iteration   3: 13267.850 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  11464.241 ±(99.9%) 5203.040 ms/op [Average]
  (min, avg, max) = (9129.360, 11464.241, 13267.850), stdev = 1855.454
  CI (99.9%): [6261.201, 16667.282] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:16:52
# Fork: 1 of 2
# Warmup Iteration   1: 22104.924 ms/op
# Warmup Iteration   2: 14756.235 ms/op
Iteration   1: 12436.538 ms/op
Iteration   2: 12657.958 ms/op
Iteration   3: 11960.587 ms/op

# Run progress: 71.74% complete, ETA 00:15:40
# Fork: 2 of 2
# Warmup Iteration   1: 20923.116 ms/op
# Warmup Iteration   2: 13617.214 ms/op
Iteration   1: 12290.309 ms/op
Iteration   2: 12702.762 ms/op
Iteration   3: 12404.296 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  12408.742 ±(99.9%) 756.837 ms/op [Average]
  (min, avg, max) = (11960.587, 12408.742, 12702.762), stdev = 269.895
  CI (99.9%): [11651.904, 13165.579] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:14:28
# Fork: 1 of 2
# Warmup Iteration   1: Oct 29, 2026 3:22:45 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 3:22:46 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
169.917 ms/op
# Warmup Iteration   2: 72.128 ms/op
Iteration   1: 65.824 ms/op
Iteration   2: 63.011 ms/op
Iteration   3: 62.592 ms/op

# Run progress: 76.09% complete, ETA 00:12:57
# Fork: 2 of 2
# Warmup Iteration   1: Oct 29, 2026 3:22:57 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 3:22:57 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
168.388 ms/op
# Warmup Iteration   2: 66.794 ms/op
Iteration   1: 66.191 ms/op
Iteration   2: 63.457 ms/op
Iteration   3: 63.193 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  64.045 ±(99.9%) 4.348 ms/op [Average]
  (min, avg, max) = (62.592, 64.045, 66.191), stdev = 1.551
  CI (99.9%): [59.696, 68.393] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 233.406 ms/op
# Warmup Iteration   2: 102.659 ms/op
Iteration   1: 79.541 ms/op
Iteration   2: 79.285 ms/op
Iteration   3: 79.407 ms/op

# Run progress: 80.43% complete, ETA 00:10:07
# Fork: 2 of 2
# Warmup Iteration   1: 233.803 ms/op
# Warmup Iteration   2: 134.924 ms/op
Iteration   1: 76.721 ms/op
Iteration   2: 75.358 ms/op
Iteration   3: 75.204 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  77.586 ±(99.9%) 5.803 ms/op [Average]
  (min, avg, max) = (75.204, 77.586, 79.541), stdev = 2.069
  CI (99.9%): [71.783, 83.389] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.001 ms/op
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

# Run progress: 86.96% complete, ETA 00:06:19
# Fork: 1 of 2
# Warmup Iteration   1: 1.443 ms/op
# Warmup Iteration   2: 0.830 ms/op
Iteration   1: 0.693 ms/op
Iteration   2: 0.692 ms/op
Iteration   3: 0.657 ms/op

# Run progress: 89.13% complete, ETA 00:05:10
# Fork: 2 of 2
# Warmup Iteration   1: 1.795 ms/op
# Warmup Iteration   2: 0.792 ms/op
Iteration   1: 0.713 ms/op
Iteration   2: 0.703 ms/op
Iteration   3: 0.699 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.693 ±(99.9%) 0.053 ms/op [Average]
  (min, avg, max) = (0.657, 0.693, 0.713), stdev = 0.019
  CI (99.9%): [0.640, 0.746] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 30.567 ms/op
# Warmup Iteration   2: 18.088 ms/op
Iteration   1: 12.468 ms/op
Iteration   2: 13.637 ms/op
Iteration   3: 13.466 ms/op

# Run progress: 93.48% complete, ETA 00:02:59
# Fork: 2 of 2
# Warmup Iteration   1: 56.049 ms/op
# Warmup Iteration   2: 21.846 ms/op
Iteration   1: 17.731 ms/op
Iteration   2: 15.196 ms/op
Iteration   3: 15.565 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  14.677 ±(99.9%) 5.292 ms/op [Average]
  (min, avg, max) = (12.468, 14.677, 17.731), stdev = 1.887
  CI (99.9%): [9.385, 19.969] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 50.756 ms/op
# Warmup Iteration   2: 32.050 ms/op
Iteration   1: 31.750 ms/op
Iteration   2: 31.687 ms/op
Iteration   3: 33.070 ms/op

# Run progress: 97.83% complete, ETA 00:00:57
# Fork: 2 of 2
# Warmup Iteration   1: 50.511 ms/op
# Warmup Iteration   2: 31.075 ms/op
Iteration   1: 30.900 ms/op
Iteration   2: 30.881 ms/op
Iteration   3: 30.859 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  31.525 ±(99.9%) 2.417 ms/op [Average]
  (min, avg, max) = (30.859, 31.525, 33.070), stdev = 0.862
  CI (99.9%): [29.108, 33.941] (assumes normal distribution)


# Run complete. Total time: 00:43:25

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     19.068 ±    0.571  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.448 ±    0.032  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.559 ±    0.765  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.389 ±    0.290  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     13.118 ±    4.191  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    629.966 ±  391.561  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   6085.208 ±  700.858  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    556.811 ±  247.460  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1216.140 ±  206.368  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.104 ±    0.037  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.668 ±    0.511  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.595 ±    0.035  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.571 ±    0.223  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     37.504 ±   12.325  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  84359.295 ± 1564.771  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  11464.241 ± 5203.040  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  12408.742 ±  756.837  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     64.045 ±    4.348  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     77.586 ±    5.803  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.693 ±    0.053  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     14.677 ±    5.292  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     31.525 ±    2.417  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.15.0 -> 3.16.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 10 lower, 13 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 26.1072 | 31.5245 | +20.75% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 91784.5 | 84359.3 | -8.09% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 10664.5 | 11464.2 | +7.50% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 60.1847 | 64.0446 | +6.41% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 524.996 | 556.811 | +6.06% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0979101 | 0.103779 | +5.99% | Overlapping CIs |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 20.2179 | 19.0684 | -5.69% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 81.0636 | 77.5858 | -4.29% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.51103 | 1.44772 | -4.19% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.0988 | 14.6772 | +4.10% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
