# NeqSim 3.14.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.13.0 |
| Current | 3.14.0 |
| Source commit | `e89337a165292727a5c9cf8ad739c5e8f063d834` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40731359595) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "e89337a165292727a5c9cf8ad739c5e8f063d834",
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
Model name:                              AMD EPYC 9V45 96-Core Processor
CPU family:                              26
Model:                                   2
Thread(s) per core:                      2
Core(s) per socket:                      1
Socket(s):                               1
Stepping:                                1
BogoMIPS:                                5192.24
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 x2apic movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid avx512f avx512dq rdseed adx smap avx512ifma clflushopt clwb avx512cd sha_ni avx512bw avx512vl xsaveopt xsavec xgetbv1 xsaves user_shstk avx_vnni avx512_bf16 clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload avx512vbmi umip avx512_vbmi2 gfni vaes vpclmulqdq avx512_vnni avx512_bitalg avx512_vpopcntdq rdpid fsrm avx512_vp2intersect
Virtualization:                          AMD-V
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               48 KiB (1 instance)
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
Vulnerability Tsa:                       Not affected
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
[INFO] Total time:  11.377 s
[INFO] Finished at: 2026-10-28T17:00:16Z
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
tpFlashLeanGas                                                 60.0000  (43 ms)
tpFlashWellFluidSrk                                            83.6406  (91 ms)
tpFlashWellFluidPr                                             83.6541  (55 ms)
tpFlashWellFluidWithProperties                                 5445.46  (93 ms)
phAndPsFlashWellFluid                                          2459.23  (66 ms)
Oct 28, 2026 5:00:30 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 5:00:30 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (373 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (182 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (44 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (45 ms)
saturationPointsWellFluid                                      1601.32  (87 ms)
singlePhaseGasPipelineSteadyState                              121.628  (901 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1061 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (7 ms)
dataReconciliation[20]                                         7.89841  (16 ms)
dataReconciliation[100]                                        37.0132  (40 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.155 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.466 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.025 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 358559 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 358.6 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 16600 ms, solved=true, gas=318849.57 kg/hr, water in/out=0.00027173922/1.5391249e-05
TEG recycle stripping gas recirc: solved=true, flow error=9.9210333e-05, composition error=0.0015789095
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=0.00031074765
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 16.60 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  06:48 min
[INFO] Finished at: 2026-10-28T17:07:05Z
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
# Warmup Iteration   1: 18.726 ms/op
# Warmup Iteration   2: 12.071 ms/op
Iteration   1: 11.949 ms/op
Iteration   2: 11.892 ms/op
Iteration   3: 11.943 ms/op

# Run progress: 2.17% complete, ETA 00:08:49
# Fork: 2 of 2
# Warmup Iteration   1: 16.218 ms/op
# Warmup Iteration   2: 11.558 ms/op
Iteration   1: 11.322 ms/op
Iteration   2: 11.201 ms/op
Iteration   3: 11.240 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  11.591 ±(99.9%) 1.042 ms/op [Average]
  (min, avg, max) = (11.201, 11.591, 11.949), stdev = 0.372
  CI (99.9%): [10.549, 12.634] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2.031 ms/op
# Warmup Iteration   2: 0.976 ms/op
Iteration   1: 0.944 ms/op
Iteration   2: 0.931 ms/op
Iteration   3: 0.938 ms/op

# Run progress: 6.52% complete, ETA 00:08:22
# Fork: 2 of 2
# Warmup Iteration   1: 1.910 ms/op
# Warmup Iteration   2: 0.935 ms/op
Iteration   1: 0.923 ms/op
Iteration   2: 0.916 ms/op
Iteration   3: 0.935 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.931 ±(99.9%) 0.029 ms/op [Average]
  (min, avg, max) = (0.916, 0.931, 0.944), stdev = 0.010
  CI (99.9%): [0.902, 0.960] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 7.864 ms/op
# Warmup Iteration   2: 4.720 ms/op
Iteration   1: 3.990 ms/op
Iteration   2: 4.002 ms/op
Iteration   3: 4.051 ms/op

# Run progress: 10.87% complete, ETA 00:07:57
# Fork: 2 of 2
# Warmup Iteration   1: 7.076 ms/op
# Warmup Iteration   2: 4.093 ms/op
Iteration   1: 3.920 ms/op
Iteration   2: 3.963 ms/op
Iteration   3: 3.888 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  3.969 ±(99.9%) 0.165 ms/op [Average]
  (min, avg, max) = (3.888, 3.969, 4.051), stdev = 0.059
  CI (99.9%): [3.804, 4.134] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 7.639 ms/op
# Warmup Iteration   2: 4.289 ms/op
Iteration   1: 3.940 ms/op
Iteration   2: 4.002 ms/op
Iteration   3: 3.893 ms/op

# Run progress: 15.22% complete, ETA 00:07:34
# Fork: 2 of 2
# Warmup Iteration   1: 7.469 ms/op
# Warmup Iteration   2: 4.090 ms/op
Iteration   1: 3.980 ms/op
Iteration   2: 3.997 ms/op
Iteration   3: 3.974 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  3.964 ±(99.9%) 0.115 ms/op [Average]
  (min, avg, max) = (3.893, 3.964, 4.002), stdev = 0.041
  CI (99.9%): [3.849, 4.080] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 17.648 ms/op
# Warmup Iteration   2: 9.417 ms/op
Iteration   1: 7.569 ms/op
Iteration   2: 7.598 ms/op
Iteration   3: 7.650 ms/op

# Run progress: 19.57% complete, ETA 00:07:11
# Fork: 2 of 2
# Warmup Iteration   1: 16.446 ms/op
# Warmup Iteration   2: 8.472 ms/op
Iteration   1: 7.273 ms/op
Iteration   2: 7.267 ms/op
Iteration   3: 7.398 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  7.459 ±(99.9%) 0.474 ms/op [Average]
  (min, avg, max) = (7.267, 7.459, 7.650), stdev = 0.169
  CI (99.9%): [6.985, 7.934] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1183.542 ms/op
# Warmup Iteration   2: 463.932 ms/op
Iteration   1: 292.379 ms/op
Iteration   2: 269.294 ms/op
Iteration   3: 306.371 ms/op

# Run progress: 23.91% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 1250.010 ms/op
# Warmup Iteration   2: 516.568 ms/op
Iteration   1: 435.315 ms/op
Iteration   2: 297.464 ms/op
Iteration   3: 270.027 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  311.808 ±(99.9%) 174.761 ms/op [Average]
  (min, avg, max) = (269.294, 311.808, 435.315), stdev = 62.321
  CI (99.9%): [137.048, 486.569] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 7138.912 ms/op
# Warmup Iteration   2: 4026.522 ms/op
Iteration   1: 3609.746 ms/op
Iteration   2: 3578.385 ms/op
Iteration   3: 3513.785 ms/op

# Run progress: 28.26% complete, ETA 00:06:48
# Fork: 2 of 2
# Warmup Iteration   1: 7555.111 ms/op
# Warmup Iteration   2: 4666.319 ms/op
Iteration   1: 3558.841 ms/op
Iteration   2: 3509.918 ms/op
Iteration   3: 3493.970 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  3544.107 ±(99.9%) 127.291 ms/op [Average]
  (min, avg, max) = (3493.970, 3544.107, 3609.746), stdev = 45.393
  CI (99.9%): [3416.817, 3671.398] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:07:00
# Fork: 1 of 2
# Warmup Iteration   1: 746.395 ms/op
# Warmup Iteration   2: 341.224 ms/op
Iteration   1: 322.972 ms/op
Iteration   2: 312.585 ms/op
Iteration   3: 315.669 ms/op

# Run progress: 32.61% complete, ETA 00:06:43
# Fork: 2 of 2
# Warmup Iteration   1: 760.567 ms/op
# Warmup Iteration   2: 336.093 ms/op
Iteration   1: 309.378 ms/op
Iteration   2: 311.103 ms/op
Iteration   3: 318.098 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  314.967 ±(99.9%) 14.089 ms/op [Average]
  (min, avg, max) = (309.378, 314.967, 322.972), stdev = 5.024
  CI (99.9%): [300.878, 329.057] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:27
# Fork: 1 of 2
# Warmup Iteration   1: 2000.988 ms/op
# Warmup Iteration   2: 810.911 ms/op
Iteration   1: 768.561 ms/op
Iteration   2: 700.271 ms/op
Iteration   3: 736.589 ms/op

# Run progress: 36.96% complete, ETA 00:06:11
# Fork: 2 of 2
# Warmup Iteration   1: 2053.599 ms/op
# Warmup Iteration   2: 805.119 ms/op
Iteration   1: 736.122 ms/op
Iteration   2: 680.013 ms/op
Iteration   3: 722.830 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  724.064 ±(99.9%) 86.797 ms/op [Average]
  (min, avg, max) = (680.013, 724.064, 768.561), stdev = 30.953
  CI (99.9%): [637.267, 810.862] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:55
# Fork: 1 of 2
# Warmup Iteration   1: 0.113 ms/op
# Warmup Iteration   2: 0.066 ms/op
Iteration   1: 0.068 ms/op
Iteration   2: 0.066 ms/op
Iteration   3: 0.066 ms/op

# Run progress: 41.30% complete, ETA 00:05:39
# Fork: 2 of 2
# Warmup Iteration   1: 0.129 ms/op
# Warmup Iteration   2: 0.065 ms/op
Iteration   1: 0.065 ms/op
Iteration   2: 0.065 ms/op
Iteration   3: 0.065 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.066 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.065, 0.066, 0.068), stdev = 0.001
  CI (99.9%): [0.062, 0.069] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:24
# Fork: 1 of 2
# Warmup Iteration   1: 7.359 ms/op
# Warmup Iteration   2: 4.949 ms/op
Iteration   1: 4.827 ms/op
Iteration   2: 4.754 ms/op
Iteration   3: 4.796 ms/op

# Run progress: 45.65% complete, ETA 00:05:08
# Fork: 2 of 2
# Warmup Iteration   1: 7.154 ms/op
# Warmup Iteration   2: 4.934 ms/op
Iteration   1: 4.798 ms/op
Iteration   2: 4.775 ms/op
Iteration   3: 4.748 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  4.783 ±(99.9%) 0.084 ms/op [Average]
  (min, avg, max) = (4.748, 4.783, 4.827), stdev = 0.030
  CI (99.9%): [4.699, 4.867] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:54
# Fork: 1 of 2
# Warmup Iteration   1: 0.551 ms/op
# Warmup Iteration   2: 0.350 ms/op
Iteration   1: 0.341 ms/op
Iteration   2: 0.340 ms/op
Iteration   3: 0.341 ms/op

# Run progress: 50.00% complete, ETA 00:04:39
# Fork: 2 of 2
# Warmup Iteration   1: 0.542 ms/op
# Warmup Iteration   2: 0.345 ms/op
Iteration   1: 0.341 ms/op
Iteration   2: 0.343 ms/op
Iteration   3: 0.347 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.342 ±(99.9%) 0.007 ms/op [Average]
  (min, avg, max) = (0.340, 0.342, 0.347), stdev = 0.002
  CI (99.9%): [0.336, 0.349] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:26
# Fork: 1 of 2
# Warmup Iteration   1: 1.375 ms/op
# Warmup Iteration   2: 0.941 ms/op
Iteration   1: 0.896 ms/op
Iteration   2: 0.880 ms/op
Iteration   3: 0.869 ms/op

# Run progress: 54.35% complete, ETA 00:04:12
# Fork: 2 of 2
# Warmup Iteration   1: 1.340 ms/op
# Warmup Iteration   2: 0.937 ms/op
Iteration   1: 0.898 ms/op
Iteration   2: 0.871 ms/op
Iteration   3: 0.899 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  0.885 ±(99.9%) 0.039 ms/op [Average]
  (min, avg, max) = (0.869, 0.885, 0.899), stdev = 0.014
  CI (99.9%): [0.847, 0.924] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:59
# Fork: 1 of 2
# Warmup Iteration   1: 114.258 ms/op
# Warmup Iteration   2: 29.272 ms/op
Iteration   1: 20.302 ms/op
Iteration   2: 19.062 ms/op
Iteration   3: 18.201 ms/op

# Run progress: 58.70% complete, ETA 00:03:45
# Fork: 2 of 2
# Warmup Iteration   1: 136.949 ms/op
# Warmup Iteration   2: 32.365 ms/op
Iteration   1: 19.709 ms/op
Iteration   2: 18.228 ms/op
Iteration   3: 17.171 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  18.779 ±(99.9%) 3.194 ms/op [Average]
  (min, avg, max) = (17.171, 18.779, 20.302), stdev = 1.139
  CI (99.9%): [15.585, 21.973] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:33
# Fork: 1 of 2
# Warmup Iteration   1: 55996.396 ms/op
# Warmup Iteration   2: 51556.943 ms/op
Iteration   1: 50310.747 ms/op
Iteration   2: 50304.057 ms/op
Iteration   3: 50067.371 ms/op

# Run progress: 63.04% complete, ETA 00:05:46
# Fork: 2 of 2
# Warmup Iteration   1: 55659.942 ms/op
# Warmup Iteration   2: 51820.100 ms/op
Iteration   1: 51139.866 ms/op
Iteration   2: 51339.941 ms/op
Iteration   3: 51510.872 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  50778.809 ±(99.9%) 1743.006 ms/op [Average]
  (min, avg, max) = (50067.371, 50778.809, 51510.872), stdev = 621.573
  CI (99.9%): [49035.803, 52521.815] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:35
# Fork: 1 of 2
# Warmup Iteration   1: 5204.749 ms/op
# Warmup Iteration   2: 5510.515 ms/op
Iteration   1: 5441.729 ms/op
Iteration   2: 5290.318 ms/op
Iteration   3: 9506.271 ms/op

# Run progress: 67.39% complete, ETA 00:09:42
# Fork: 2 of 2
# Warmup Iteration   1: 5152.759 ms/op
# Warmup Iteration   2: 5553.065 ms/op
Iteration   1: 5400.906 ms/op
Iteration   2: 5226.365 ms/op
Iteration   3: 9502.485 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  6728.012 ±(99.9%) 6034.420 ms/op [Average]
  (min, avg, max) = (5226.365, 6728.012, 9506.271), stdev = 2151.932
  CI (99.9%): [693.592, 12762.433] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:11:20
# Fork: 1 of 2
# Warmup Iteration   1: 15977.892 ms/op
# Warmup Iteration   2: 11478.348 ms/op
Iteration   1: 9724.935 ms/op
Iteration   2: 10577.677 ms/op
Iteration   3: 9061.818 ms/op

# Run progress: 71.74% complete, ETA 00:10:34
# Fork: 2 of 2
# Warmup Iteration   1: 15745.091 ms/op
# Warmup Iteration   2: 11764.155 ms/op
Iteration   1: 9299.638 ms/op
Iteration   2: 10063.827 ms/op
Iteration   3: 10032.469 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  9793.394 ±(99.9%) 1550.731 ms/op [Average]
  (min, avg, max) = (9061.818, 9793.394, 10577.677), stdev = 553.006
  CI (99.9%): [8242.663, 11344.125] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:09:49
# Fork: 1 of 2
# Warmup Iteration   1: Oct 28, 2026 5:34:56 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 5:34:56 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
59.603 ms/op
# Warmup Iteration   2: 38.957 ms/op
Iteration   1: 37.066 ms/op
Iteration   2: 37.199 ms/op
Iteration   3: 36.556 ms/op

# Run progress: 76.09% complete, ETA 00:08:48
# Fork: 2 of 2
# Warmup Iteration   1: Oct 28, 2026 5:35:07 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 5:35:07 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
59.129 ms/op
# Warmup Iteration   2: 38.302 ms/op
Iteration   1: 36.837 ms/op
Iteration   2: 37.527 ms/op
Iteration   3: 36.631 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  36.969 ±(99.9%) 1.031 ms/op [Average]
  (min, avg, max) = (36.556, 36.969, 37.527), stdev = 0.368
  CI (99.9%): [35.938, 38.000] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:07:49
# Fork: 1 of 2
# Warmup Iteration   1: 80.539 ms/op
# Warmup Iteration   2: 42.102 ms/op
Iteration   1: 42.610 ms/op
Iteration   2: 41.810 ms/op
Iteration   3: 42.285 ms/op

# Run progress: 80.43% complete, ETA 00:06:54
# Fork: 2 of 2
# Warmup Iteration   1: 67.755 ms/op
# Warmup Iteration   2: 42.862 ms/op
Iteration   1: 41.988 ms/op
Iteration   2: 44.734 ms/op
Iteration   3: 43.565 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  42.832 ±(99.9%) 3.138 ms/op [Average]
  (min, avg, max) = (41.810, 42.832, 44.734), stdev = 1.119
  CI (99.9%): [39.695, 45.970] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:06:00
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:09
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

# Run progress: 86.96% complete, ETA 00:04:20
# Fork: 1 of 2
# Warmup Iteration   1: 0.617 ms/op
# Warmup Iteration   2: 0.400 ms/op
Iteration   1: 0.382 ms/op
Iteration   2: 0.382 ms/op
Iteration   3: 0.387 ms/op

# Run progress: 89.13% complete, ETA 00:03:33
# Fork: 2 of 2
# Warmup Iteration   1: 0.705 ms/op
# Warmup Iteration   2: 0.398 ms/op
Iteration   1: 0.386 ms/op
Iteration   2: 0.376 ms/op
Iteration   3: 0.381 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.382 ±(99.9%) 0.011 ms/op [Average]
  (min, avg, max) = (0.376, 0.382, 0.387), stdev = 0.004
  CI (99.9%): [0.372, 0.393] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 13.717 ms/op
# Warmup Iteration   2: 8.057 ms/op
Iteration   1: 7.729 ms/op
Iteration   2: 7.262 ms/op
Iteration   3: 7.316 ms/op

# Run progress: 93.48% complete, ETA 00:02:03
# Fork: 2 of 2
# Warmup Iteration   1: 14.301 ms/op
# Warmup Iteration   2: 7.632 ms/op
Iteration   1: 7.775 ms/op
Iteration   2: 7.251 ms/op
Iteration   3: 7.188 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  7.420 ±(99.9%) 0.731 ms/op [Average]
  (min, avg, max) = (7.188, 7.420, 7.775), stdev = 0.261
  CI (99.9%): [6.689, 8.151] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 22.813 ms/op
# Warmup Iteration   2: 18.477 ms/op
Iteration   1: 18.434 ms/op
Iteration   2: 18.822 ms/op
Iteration   3: 18.586 ms/op

# Run progress: 97.83% complete, ETA 00:00:39
# Fork: 2 of 2
# Warmup Iteration   1: 19.470 ms/op
# Warmup Iteration   2: 15.500 ms/op
Iteration   1: 15.418 ms/op
Iteration   2: 15.167 ms/op
Iteration   3: 15.189 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  16.936 ±(99.9%) 5.172 ms/op [Average]
  (min, avg, max) = (15.167, 16.936, 18.822), stdev = 1.844
  CI (99.9%): [11.764, 22.108] (assumes normal distribution)


# Run complete. Total time: 00:30:04

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     11.591 ±    1.042  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.931 ±    0.029  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      3.969 ±    0.165  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      3.964 ±    0.115  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      7.459 ±    0.474  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    311.808 ±  174.761  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   3544.107 ±  127.291  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    314.967 ±   14.089  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    724.064 ±   86.797  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.066 ±    0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      4.783 ±    0.084  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.342 ±    0.007  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      0.885 ±    0.039  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     18.779 ±    3.194  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  50778.809 ± 1743.006  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   6728.012 ± 6034.420  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   9793.394 ± 1550.731  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     36.969 ±    1.031  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     42.832 ±    3.138  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.382 ±    0.011  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      7.420 ±    0.731  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     16.936 ±    5.172  ms/op

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
[INFO] Total time:  3.440 s
[INFO] Finished at: 2026-10-28T17:37:15Z
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
tpFlashLeanGas                                                 60.0000  (41 ms)
tpFlashWellFluidSrk                                            83.6406  (134 ms)
tpFlashWellFluidPr                                             83.6541  (44 ms)
tpFlashWellFluidWithProperties                                 5445.46  (91 ms)
phAndPsFlashWellFluid                                          2459.23  (47 ms)
Oct 28, 2026 5:37:22 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 5:37:22 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (416 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (215 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (23 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (55 ms)
saturationPointsWellFluid                                      1601.32  (112 ms)
singlePhaseGasPipelineSteadyState                              121.628  (843 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (972 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (13 ms)
dataReconciliation[100]                                        37.0132  (48 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.921 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.547 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.019 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 318332 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 318.3 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 13426 ms, solved=true, gas=318849.57 kg/hr, water in/out=0.00027173922/1.5382411e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018460518, composition error=0.0029034392
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00013719865
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.43 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  05:53 min
[INFO] Finished at: 2026-10-28T17:43:10Z
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
# Warmup Iteration   1: 16.338 ms/op
# Warmup Iteration   2: 12.014 ms/op
Iteration   1: 11.911 ms/op
Iteration   2: 11.928 ms/op
Iteration   3: 11.673 ms/op

# Run progress: 2.17% complete, ETA 00:08:42
# Fork: 2 of 2
# Warmup Iteration   1: 16.324 ms/op
# Warmup Iteration   2: 11.807 ms/op
Iteration   1: 11.570 ms/op
Iteration   2: 11.428 ms/op
Iteration   3: 11.638 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  11.691 ±(99.9%) 0.548 ms/op [Average]
  (min, avg, max) = (11.428, 11.691, 11.928), stdev = 0.196
  CI (99.9%): [11.143, 12.240] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:27
# Fork: 1 of 2
# Warmup Iteration   1: 2.106 ms/op
# Warmup Iteration   2: 0.964 ms/op
Iteration   1: 0.918 ms/op
Iteration   2: 0.916 ms/op
Iteration   3: 0.908 ms/op

# Run progress: 6.52% complete, ETA 00:08:17
# Fork: 2 of 2
# Warmup Iteration   1: 1.891 ms/op
# Warmup Iteration   2: 0.962 ms/op
Iteration   1: 0.889 ms/op
Iteration   2: 0.865 ms/op
Iteration   3: 0.865 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.893 ±(99.9%) 0.068 ms/op [Average]
  (min, avg, max) = (0.865, 0.893, 0.918), stdev = 0.024
  CI (99.9%): [0.825, 0.962] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:06
# Fork: 1 of 2
# Warmup Iteration   1: 8.111 ms/op
# Warmup Iteration   2: 4.452 ms/op
Iteration   1: 4.037 ms/op
Iteration   2: 4.143 ms/op
Iteration   3: 4.041 ms/op

# Run progress: 10.87% complete, ETA 00:07:54
# Fork: 2 of 2
# Warmup Iteration   1: 8.511 ms/op
# Warmup Iteration   2: 4.236 ms/op
Iteration   1: 4.209 ms/op
Iteration   2: 4.174 ms/op
Iteration   3: 4.052 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.109 ±(99.9%) 0.212 ms/op [Average]
  (min, avg, max) = (4.037, 4.109, 4.209), stdev = 0.075
  CI (99.9%): [3.898, 4.321] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:43
# Fork: 1 of 2
# Warmup Iteration   1: 6.748 ms/op
# Warmup Iteration   2: 4.058 ms/op
Iteration   1: 3.956 ms/op
Iteration   2: 3.952 ms/op
Iteration   3: 3.918 ms/op

# Run progress: 15.22% complete, ETA 00:07:31
# Fork: 2 of 2
# Warmup Iteration   1: 7.210 ms/op
# Warmup Iteration   2: 3.967 ms/op
Iteration   1: 3.994 ms/op
Iteration   2: 4.017 ms/op
Iteration   3: 3.919 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  3.959 ±(99.9%) 0.112 ms/op [Average]
  (min, avg, max) = (3.918, 3.959, 4.017), stdev = 0.040
  CI (99.9%): [3.847, 4.071] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:20
# Fork: 1 of 2
# Warmup Iteration   1: 15.396 ms/op
# Warmup Iteration   2: 8.133 ms/op
Iteration   1: 7.452 ms/op
Iteration   2: 7.573 ms/op
Iteration   3: 7.509 ms/op

# Run progress: 19.57% complete, ETA 00:07:08
# Fork: 2 of 2
# Warmup Iteration   1: 15.097 ms/op
# Warmup Iteration   2: 8.865 ms/op
Iteration   1: 7.403 ms/op
Iteration   2: 7.308 ms/op
Iteration   3: 7.388 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  7.439 ±(99.9%) 0.264 ms/op [Average]
  (min, avg, max) = (7.308, 7.439, 7.573), stdev = 0.094
  CI (99.9%): [7.175, 7.703] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:06:57
# Fork: 1 of 2
# Warmup Iteration   1: 1203.960 ms/op
# Warmup Iteration   2: 382.773 ms/op
Iteration   1: 273.987 ms/op
Iteration   2: 256.411 ms/op
Iteration   3: 291.513 ms/op

# Run progress: 23.91% complete, ETA 00:06:44
# Fork: 2 of 2
# Warmup Iteration   1: 1169.539 ms/op
# Warmup Iteration   2: 419.178 ms/op
Iteration   1: 307.168 ms/op
Iteration   2: 264.226 ms/op
Iteration   3: 299.322 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  282.104 ±(99.9%) 56.903 ms/op [Average]
  (min, avg, max) = (256.411, 282.104, 307.168), stdev = 20.292
  CI (99.9%): [225.201, 339.007] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:31
# Fork: 1 of 2
# Warmup Iteration   1: 7029.989 ms/op
# Warmup Iteration   2: 4146.840 ms/op
Iteration   1: 3538.611 ms/op
Iteration   2: 3521.323 ms/op
Iteration   3: 3515.973 ms/op

# Run progress: 28.26% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 7043.464 ms/op
# Warmup Iteration   2: 3964.952 ms/op
Iteration   1: 3532.242 ms/op
Iteration   2: 3631.991 ms/op
Iteration   3: 3475.300 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  3535.907 ±(99.9%) 145.905 ms/op [Average]
  (min, avg, max) = (3475.300, 3535.907, 3631.991), stdev = 52.031
  CI (99.9%): [3390.001, 3681.812] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:56
# Fork: 1 of 2
# Warmup Iteration   1: 774.960 ms/op
# Warmup Iteration   2: 334.193 ms/op
Iteration   1: 310.525 ms/op
Iteration   2: 309.248 ms/op
Iteration   3: 306.706 ms/op

# Run progress: 32.61% complete, ETA 00:06:39
# Fork: 2 of 2
# Warmup Iteration   1: 744.908 ms/op
# Warmup Iteration   2: 329.396 ms/op
Iteration   1: 305.305 ms/op
Iteration   2: 311.591 ms/op
Iteration   3: 313.527 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  309.483 ±(99.9%) 8.607 ms/op [Average]
  (min, avg, max) = (305.305, 309.483, 313.527), stdev = 3.069
  CI (99.9%): [300.877, 318.090] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:23
# Fork: 1 of 2
# Warmup Iteration   1: 2009.593 ms/op
# Warmup Iteration   2: 816.168 ms/op
Iteration   1: 766.561 ms/op
Iteration   2: 713.899 ms/op
Iteration   3: 761.962 ms/op

# Run progress: 36.96% complete, ETA 00:06:08
# Fork: 2 of 2
# Warmup Iteration   1: 1426.289 ms/op
# Warmup Iteration   2: 778.830 ms/op
Iteration   1: 706.817 ms/op
Iteration   2: 701.743 ms/op
Iteration   3: 719.159 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  728.357 ±(99.9%) 79.855 ms/op [Average]
  (min, avg, max) = (701.743, 728.357, 766.561), stdev = 28.477
  CI (99.9%): [648.501, 808.212] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:54
# Fork: 1 of 2
# Warmup Iteration   1: 0.117 ms/op
# Warmup Iteration   2: 0.064 ms/op
Iteration   1: 0.063 ms/op
Iteration   2: 0.064 ms/op
Iteration   3: 0.062 ms/op

# Run progress: 41.30% complete, ETA 00:05:37
# Fork: 2 of 2
# Warmup Iteration   1: 0.142 ms/op
# Warmup Iteration   2: 0.064 ms/op
Iteration   1: 0.065 ms/op
Iteration   2: 0.066 ms/op
Iteration   3: 0.065 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.064 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.062, 0.064, 0.066), stdev = 0.002
  CI (99.9%): [0.060, 0.069] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:22
# Fork: 1 of 2
# Warmup Iteration   1: 7.316 ms/op
# Warmup Iteration   2: 4.861 ms/op
Iteration   1: 4.732 ms/op
Iteration   2: 4.639 ms/op
Iteration   3: 4.594 ms/op

# Run progress: 45.65% complete, ETA 00:05:07
# Fork: 2 of 2
# Warmup Iteration   1: 7.084 ms/op
# Warmup Iteration   2: 4.815 ms/op
Iteration   1: 4.722 ms/op
Iteration   2: 4.694 ms/op
Iteration   3: 4.715 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  4.682 ±(99.9%) 0.153 ms/op [Average]
  (min, avg, max) = (4.594, 4.682, 4.732), stdev = 0.055
  CI (99.9%): [4.530, 4.835] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:52
# Fork: 1 of 2
# Warmup Iteration   1: 0.576 ms/op
# Warmup Iteration   2: 0.349 ms/op
Iteration   1: 0.347 ms/op
Iteration   2: 0.338 ms/op
Iteration   3: 0.339 ms/op

# Run progress: 50.00% complete, ETA 00:04:38
# Fork: 2 of 2
# Warmup Iteration   1: 0.548 ms/op
# Warmup Iteration   2: 0.341 ms/op
Iteration   1: 0.335 ms/op
Iteration   2: 0.337 ms/op
Iteration   3: 0.342 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.340 ±(99.9%) 0.012 ms/op [Average]
  (min, avg, max) = (0.335, 0.340, 0.347), stdev = 0.004
  CI (99.9%): [0.328, 0.351] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:24
# Fork: 1 of 2
# Warmup Iteration   1: 1.362 ms/op
# Warmup Iteration   2: 0.912 ms/op
Iteration   1: 0.852 ms/op
Iteration   2: 0.858 ms/op
Iteration   3: 0.842 ms/op

# Run progress: 54.35% complete, ETA 00:04:11
# Fork: 2 of 2
# Warmup Iteration   1: 1.269 ms/op
# Warmup Iteration   2: 0.966 ms/op
Iteration   1: 0.848 ms/op
Iteration   2: 0.848 ms/op
Iteration   3: 0.874 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  0.854 ±(99.9%) 0.032 ms/op [Average]
  (min, avg, max) = (0.842, 0.854, 0.874), stdev = 0.011
  CI (99.9%): [0.822, 0.885] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:58
# Fork: 1 of 2
# Warmup Iteration   1: 125.186 ms/op
# Warmup Iteration   2: 28.047 ms/op
Iteration   1: 19.294 ms/op
Iteration   2: 17.562 ms/op
Iteration   3: 16.683 ms/op

# Run progress: 58.70% complete, ETA 00:03:45
# Fork: 2 of 2
# Warmup Iteration   1: 126.710 ms/op
# Warmup Iteration   2: 26.401 ms/op
Iteration   1: 18.553 ms/op
Iteration   2: 16.707 ms/op
Iteration   3: 16.513 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  17.552 ±(99.9%) 3.218 ms/op [Average]
  (min, avg, max) = (16.513, 17.552, 19.294), stdev = 1.148
  CI (99.9%): [14.334, 20.771] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:32
# Fork: 1 of 2
# Warmup Iteration   1: 56999.321 ms/op
# Warmup Iteration   2: 52573.597 ms/op
Iteration   1: 52067.802 ms/op
Iteration   2: 52194.468 ms/op
Iteration   3: 51487.287 ms/op

# Run progress: 63.04% complete, ETA 00:05:49
# Fork: 2 of 2
# Warmup Iteration   1: 53586.418 ms/op
# Warmup Iteration   2: 52614.696 ms/op
Iteration   1: 49874.744 ms/op
Iteration   2: 50645.682 ms/op
Iteration   3: 50632.021 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  51150.334 ±(99.9%) 2568.840 ms/op [Average]
  (min, avg, max) = (49874.744, 51150.334, 52194.468), stdev = 916.073
  CI (99.9%): [48581.494, 53719.174] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:36
# Fork: 1 of 2
# Warmup Iteration   1: 7610.075 ms/op
# Warmup Iteration   2: 5223.303 ms/op
Iteration   1: 5542.388 ms/op
Iteration   2: 5357.827 ms/op
Iteration   3: 6647.486 ms/op

# Run progress: 67.39% complete, ETA 00:09:21
# Fork: 2 of 2
# Warmup Iteration   1: 7778.842 ms/op
# Warmup Iteration   2: 5217.983 ms/op
Iteration   1: 5380.371 ms/op
Iteration   2: 5222.343 ms/op
Iteration   3: 6573.229 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  5787.274 ±(99.9%) 1811.600 ms/op [Average]
  (min, avg, max) = (5222.343, 5787.274, 6647.486), stdev = 646.034
  CI (99.9%): [3975.674, 7598.874] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:10:40
# Fork: 1 of 2
# Warmup Iteration   1: 14778.716 ms/op
# Warmup Iteration   2: 9794.435 ms/op
Iteration   1: 8273.908 ms/op
Iteration   2: 11324.769 ms/op
Iteration   3: 8481.673 ms/op

# Run progress: 71.74% complete, ETA 00:09:57
# Fork: 2 of 2
# Warmup Iteration   1: 14957.619 ms/op
# Warmup Iteration   2: 9033.807 ms/op
Iteration   1: 9282.308 ms/op
Iteration   2: 8506.092 ms/op
Iteration   3: 8041.802 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  8985.092 ±(99.9%) 3420.849 ms/op [Average]
  (min, avg, max) = (8041.802, 8985.092, 11324.769), stdev = 1219.908
  CI (99.9%): [5564.243, 12405.941] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:09:12
# Fork: 1 of 2
# Warmup Iteration   1: Oct 28, 2026 6:09:18 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 6:09:18 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
62.692 ms/op
# Warmup Iteration   2: 35.020 ms/op
Iteration   1: 32.595 ms/op
Iteration   2: 32.374 ms/op
Iteration   3: 33.391 ms/op

# Run progress: 76.09% complete, ETA 00:08:15
# Fork: 2 of 2
# Warmup Iteration   1: Oct 28, 2026 6:09:29 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 6:09:29 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
63.380 ms/op
# Warmup Iteration   2: 35.277 ms/op
Iteration   1: 33.153 ms/op
Iteration   2: 33.222 ms/op
Iteration   3: 33.289 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  33.004 ±(99.9%) 1.166 ms/op [Average]
  (min, avg, max) = (32.374, 33.004, 33.391), stdev = 0.416
  CI (99.9%): [31.838, 34.170] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:07:21
# Fork: 1 of 2
# Warmup Iteration   1: 93.169 ms/op
# Warmup Iteration   2: 52.953 ms/op
Iteration   1: 43.477 ms/op
Iteration   2: 43.835 ms/op
Iteration   3: 43.916 ms/op

# Run progress: 80.43% complete, ETA 00:06:29
# Fork: 2 of 2
# Warmup Iteration   1: 88.525 ms/op
# Warmup Iteration   2: 45.173 ms/op
Iteration   1: 41.233 ms/op
Iteration   2: 42.069 ms/op
Iteration   3: 41.370 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  42.650 ±(99.9%) 3.474 ms/op [Average]
  (min, avg, max) = (41.233, 42.650, 43.916), stdev = 1.239
  CI (99.9%): [39.176, 46.124] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:05:39
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:51
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

# Run progress: 86.96% complete, ETA 00:04:05
# Fork: 1 of 2
# Warmup Iteration   1: 0.683 ms/op
# Warmup Iteration   2: 0.396 ms/op
Iteration   1: 0.388 ms/op
Iteration   2: 0.378 ms/op
Iteration   3: 0.385 ms/op

# Run progress: 89.13% complete, ETA 00:03:20
# Fork: 2 of 2
# Warmup Iteration   1: 0.749 ms/op
# Warmup Iteration   2: 0.407 ms/op
Iteration   1: 0.387 ms/op
Iteration   2: 0.378 ms/op
Iteration   3: 0.381 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.383 ±(99.9%) 0.013 ms/op [Average]
  (min, avg, max) = (0.378, 0.383, 0.388), stdev = 0.004
  CI (99.9%): [0.370, 0.395] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:37
# Fork: 1 of 2
# Warmup Iteration   1: 13.230 ms/op
# Warmup Iteration   2: 7.895 ms/op
Iteration   1: 7.539 ms/op
Iteration   2: 7.077 ms/op
Iteration   3: 7.161 ms/op

# Run progress: 93.48% complete, ETA 00:01:56
# Fork: 2 of 2
# Warmup Iteration   1: 14.998 ms/op
# Warmup Iteration   2: 9.051 ms/op
Iteration   1: 9.079 ms/op
Iteration   2: 8.452 ms/op
Iteration   3: 8.458 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  7.961 ±(99.9%) 2.291 ms/op [Average]
  (min, avg, max) = (7.077, 7.961, 9.079), stdev = 0.817
  CI (99.9%): [5.670, 10.252] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:16
# Fork: 1 of 2
# Warmup Iteration   1: 23.380 ms/op
# Warmup Iteration   2: 18.442 ms/op
Iteration   1: 18.798 ms/op
Iteration   2: 18.694 ms/op
Iteration   3: 19.347 ms/op

# Run progress: 97.83% complete, ETA 00:00:37
# Fork: 2 of 2
# Warmup Iteration   1: 23.144 ms/op
# Warmup Iteration   2: 18.549 ms/op
Iteration   1: 18.266 ms/op
Iteration   2: 18.585 ms/op
Iteration   3: 18.779 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  18.745 ±(99.9%) 0.991 ms/op [Average]
  (min, avg, max) = (18.266, 18.745, 19.347), stdev = 0.353
  CI (99.9%): [17.754, 19.736] (assumes normal distribution)


# Run complete. Total time: 00:28:22

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     11.691 ±    0.548  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.893 ±    0.068  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.109 ±    0.212  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      3.959 ±    0.112  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      7.439 ±    0.264  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    282.104 ±   56.903  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   3535.907 ±  145.905  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    309.483 ±    8.607  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    728.357 ±   79.855  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.064 ±    0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      4.682 ±    0.153  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.340 ±    0.012  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      0.854 ±    0.032  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     17.552 ±    3.218  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  51150.334 ± 2568.840  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   5787.274 ± 1811.600  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   8985.092 ± 3420.849  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     33.004 ±    1.166  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     42.650 ±    3.474  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.383 ±    0.013  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      7.961 ±    2.291  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     18.745 ±    0.991  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.13.0 -> 3.14.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 16 lower, 7 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 6728.01 | 5787.27 | -13.98% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 36.9692 | 33.0039 | -10.73% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 16.9361 | 18.7447 | +10.68% | Overlapping CIs |
| flash.TPflash.testFlash | 311.808 | 282.104 | -9.53% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 9793.39 | 8985.09 | -8.25% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 7.42008 | 7.96118 | +7.29% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 18.7789 | 17.5523 | -6.53% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.931331 | 0.893427 | -4.07% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.0002149 | 0.000206674 | -3.83% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential | 0.885493 | 0.853863 | -3.57% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
