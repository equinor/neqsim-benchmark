# NeqSim 3.16.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.15.0 |
| Current | 3.16.0 |
| Source commit | `f28ba7ac8a88d090454489b8dcb136bb5ee823c3` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40828838207) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "f28ba7ac8a88d090454489b8dcb136bb5ee823c3",
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
Model name:                              AMD EPYC 9V74 80-Core Processor
CPU family:                              25
Model:                                   17
Thread(s) per core:                      2
Core(s) per socket:                      1
Socket(s):                               1
Stepping:                                1
BogoMIPS:                                5192.30
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
[INFO] Total time:  11.790 s
[INFO] Finished at: 2026-10-29T06:23:13Z
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
tpFlashLeanGas                                                 60.0000  (32 ms)
tpFlashWellFluidSrk                                            83.6406  (92 ms)
tpFlashWellFluidPr                                             83.6541  (59 ms)
tpFlashWellFluidWithProperties                                 5445.46  (130 ms)
phAndPsFlashWellFluid                                          2459.23  (122 ms)
Oct 29, 2026 6:23:27 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 6:23:27 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (731 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (260 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (27 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (82 ms)
saturationPointsWellFluid                                      1601.32  (121 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1281 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1260 ms)
levenbergMarquardtAntoine                                      1837.31  (10 ms)
levenbergMarquardtDoubleExponential                            5.57177  (7 ms)
dataReconciliation[20]                                         7.89841  (19 ms)
dataReconciliation[100]                                        37.0132  (86 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.875 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.825 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.078 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 436084 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 436.1 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 16044 ms, solved=true, gas=318849.56 kg/hr, water in/out=0.00027104531/1.5353072e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018484305, composition error=0.0029102350
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00013837326
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 16.05 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  08:09 min
[INFO] Finished at: 2026-10-29T06:31:24Z
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
# Warmup Iteration   1: 24.269 ms/op
# Warmup Iteration   2: 15.861 ms/op
Iteration   1: 15.833 ms/op
Iteration   2: 15.474 ms/op
Iteration   3: 15.510 ms/op

# Run progress: 2.17% complete, ETA 00:08:59
# Fork: 2 of 2
# Warmup Iteration   1: 24.157 ms/op
# Warmup Iteration   2: 15.993 ms/op
Iteration   1: 16.139 ms/op
Iteration   2: 15.827 ms/op
Iteration   3: 15.812 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  15.766 ±(99.9%) 0.688 ms/op [Average]
  (min, avg, max) = (15.474, 15.766, 16.139), stdev = 0.245
  CI (99.9%): [15.078, 16.453] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:45
# Fork: 1 of 2
# Warmup Iteration   1: 2.841 ms/op
# Warmup Iteration   2: 1.687 ms/op
Iteration   1: 1.173 ms/op
Iteration   2: 1.157 ms/op
Iteration   3: 1.156 ms/op

# Run progress: 6.52% complete, ETA 00:08:34
# Fork: 2 of 2
# Warmup Iteration   1: 3.235 ms/op
# Warmup Iteration   2: 1.613 ms/op
Iteration   1: 1.198 ms/op
Iteration   2: 1.175 ms/op
Iteration   3: 1.177 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.173 ±(99.9%) 0.043 ms/op [Average]
  (min, avg, max) = (1.156, 1.173, 1.198), stdev = 0.015
  CI (99.9%): [1.130, 1.216] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:21
# Fork: 1 of 2
# Warmup Iteration   1: 12.373 ms/op
# Warmup Iteration   2: 6.711 ms/op
Iteration   1: 5.411 ms/op
Iteration   2: 5.373 ms/op
Iteration   3: 5.546 ms/op

# Run progress: 10.87% complete, ETA 00:08:09
# Fork: 2 of 2
# Warmup Iteration   1: 11.600 ms/op
# Warmup Iteration   2: 5.918 ms/op
Iteration   1: 5.320 ms/op
Iteration   2: 5.430 ms/op
Iteration   3: 5.327 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  5.401 ±(99.9%) 0.233 ms/op [Average]
  (min, avg, max) = (5.320, 5.401, 5.546), stdev = 0.083
  CI (99.9%): [5.168, 5.634] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:58
# Fork: 1 of 2
# Warmup Iteration   1: 11.545 ms/op
# Warmup Iteration   2: 7.451 ms/op
Iteration   1: 5.383 ms/op
Iteration   2: 5.301 ms/op
Iteration   3: 5.342 ms/op

# Run progress: 15.22% complete, ETA 00:07:46
# Fork: 2 of 2
# Warmup Iteration   1: 11.202 ms/op
# Warmup Iteration   2: 6.825 ms/op
Iteration   1: 5.198 ms/op
Iteration   2: 5.211 ms/op
Iteration   3: 5.211 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  5.274 ±(99.9%) 0.221 ms/op [Average]
  (min, avg, max) = (5.198, 5.274, 5.383), stdev = 0.079
  CI (99.9%): [5.054, 5.495] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:34
# Fork: 1 of 2
# Warmup Iteration   1: 24.409 ms/op
# Warmup Iteration   2: 13.191 ms/op
Iteration   1: 9.585 ms/op
Iteration   2: 9.386 ms/op
Iteration   3: 9.372 ms/op

# Run progress: 19.57% complete, ETA 00:07:22
# Fork: 2 of 2
# Warmup Iteration   1: 21.798 ms/op
# Warmup Iteration   2: 12.749 ms/op
Iteration   1: 9.588 ms/op
Iteration   2: 9.437 ms/op
Iteration   3: 9.376 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  9.458 ±(99.9%) 0.288 ms/op [Average]
  (min, avg, max) = (9.372, 9.458, 9.588), stdev = 0.103
  CI (99.9%): [9.169, 9.746] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:10
# Fork: 1 of 2
# Warmup Iteration   1: 2207.143 ms/op
# Warmup Iteration   2: 702.370 ms/op
Iteration   1: 445.140 ms/op
Iteration   2: 373.513 ms/op
Iteration   3: 338.898 ms/op

# Run progress: 23.91% complete, ETA 00:06:55
# Fork: 2 of 2
# Warmup Iteration   1: 2170.715 ms/op
# Warmup Iteration   2: 671.489 ms/op
Iteration   1: 622.597 ms/op
Iteration   2: 424.306 ms/op
Iteration   3: 356.560 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  426.836 ±(99.9%) 291.902 ms/op [Average]
  (min, avg, max) = (338.898, 426.836, 622.597), stdev = 104.095
  CI (99.9%): [134.933, 718.738] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:41
# Fork: 1 of 2
# Warmup Iteration   1: 9113.680 ms/op
# Warmup Iteration   2: 5119.512 ms/op
Iteration   1: 4674.574 ms/op
Iteration   2: 4586.642 ms/op
Iteration   3: 4637.867 ms/op

# Run progress: 28.26% complete, ETA 00:07:12
# Fork: 2 of 2
# Warmup Iteration   1: 8978.311 ms/op
# Warmup Iteration   2: 5135.155 ms/op
Iteration   1: 4723.386 ms/op
Iteration   2: 4654.434 ms/op
Iteration   3: 4581.134 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  4643.006 ±(99.9%) 151.631 ms/op [Average]
  (min, avg, max) = (4581.134, 4643.006, 4723.386), stdev = 54.073
  CI (99.9%): [4491.375, 4794.638] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:07:33
# Fork: 1 of 2
# Warmup Iteration   1: 1231.824 ms/op
# Warmup Iteration   2: 459.995 ms/op
Iteration   1: 423.951 ms/op
Iteration   2: 409.818 ms/op
Iteration   3: 408.703 ms/op

# Run progress: 32.61% complete, ETA 00:07:13
# Fork: 2 of 2
# Warmup Iteration   1: 1179.675 ms/op
# Warmup Iteration   2: 449.821 ms/op
Iteration   1: 414.156 ms/op
Iteration   2: 413.967 ms/op
Iteration   3: 400.909 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  411.917 ±(99.9%) 21.354 ms/op [Average]
  (min, avg, max) = (400.909, 411.917, 423.951), stdev = 7.615
  CI (99.9%): [390.563, 433.271] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:54
# Fork: 1 of 2
# Warmup Iteration   1: 2558.567 ms/op
# Warmup Iteration   2: 1026.190 ms/op
Iteration   1: 989.956 ms/op
Iteration   2: 898.764 ms/op
Iteration   3: 916.717 ms/op

# Run progress: 36.96% complete, ETA 00:06:39
# Fork: 2 of 2
# Warmup Iteration   1: 2524.640 ms/op
# Warmup Iteration   2: 1048.723 ms/op
Iteration   1: 973.156 ms/op
Iteration   2: 949.419 ms/op
Iteration   3: 927.435 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  942.574 ±(99.9%) 97.497 ms/op [Average]
  (min, avg, max) = (898.764, 942.574, 989.956), stdev = 34.768
  CI (99.9%): [845.077, 1040.071] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:06:25
# Fork: 1 of 2
# Warmup Iteration   1: 0.194 ms/op
# Warmup Iteration   2: 0.082 ms/op
Iteration   1: 0.081 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.080 ms/op

# Run progress: 41.30% complete, ETA 00:06:06
# Fork: 2 of 2
# Warmup Iteration   1: 0.181 ms/op
# Warmup Iteration   2: 0.082 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.081 ms/op
Iteration   3: 0.080 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.081 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.080, 0.081, 0.081), stdev = 0.001
  CI (99.9%): [0.079, 0.082] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:48
# Fork: 1 of 2
# Warmup Iteration   1: 10.232 ms/op
# Warmup Iteration   2: 6.320 ms/op
Iteration   1: 6.125 ms/op
Iteration   2: 6.128 ms/op
Iteration   3: 6.107 ms/op

# Run progress: 45.65% complete, ETA 00:05:31
# Fork: 2 of 2
# Warmup Iteration   1: 10.259 ms/op
# Warmup Iteration   2: 6.388 ms/op
Iteration   1: 6.265 ms/op
Iteration   2: 6.239 ms/op
Iteration   3: 6.208 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.179 ±(99.9%) 0.188 ms/op [Average]
  (min, avg, max) = (6.107, 6.179, 6.265), stdev = 0.067
  CI (99.9%): [5.991, 6.367] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:05:14
# Fork: 1 of 2
# Warmup Iteration   1: 0.824 ms/op
# Warmup Iteration   2: 0.466 ms/op
Iteration   1: 0.462 ms/op
Iteration   2: 0.460 ms/op
Iteration   3: 0.459 ms/op

# Run progress: 50.00% complete, ETA 00:04:58
# Fork: 2 of 2
# Warmup Iteration   1: 0.853 ms/op
# Warmup Iteration   2: 0.482 ms/op
Iteration   1: 0.459 ms/op
Iteration   2: 0.458 ms/op
Iteration   3: 0.459 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.460 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.458, 0.460, 0.462), stdev = 0.001
  CI (99.9%): [0.455, 0.464] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:43
# Fork: 1 of 2
# Warmup Iteration   1: 1.966 ms/op
# Warmup Iteration   2: 1.299 ms/op
Iteration   1: 1.196 ms/op
Iteration   2: 1.196 ms/op
Iteration   3: 1.193 ms/op

# Run progress: 54.35% complete, ETA 00:04:28
# Fork: 2 of 2
# Warmup Iteration   1: 1.944 ms/op
# Warmup Iteration   2: 1.314 ms/op
Iteration   1: 1.218 ms/op
Iteration   2: 1.213 ms/op
Iteration   3: 1.230 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.208 ±(99.9%) 0.042 ms/op [Average]
  (min, avg, max) = (1.193, 1.208, 1.230), stdev = 0.015
  CI (99.9%): [1.166, 1.250] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:04:13
# Fork: 1 of 2
# Warmup Iteration   1: 185.578 ms/op
# Warmup Iteration   2: 47.798 ms/op
Iteration   1: 29.605 ms/op
Iteration   2: 27.978 ms/op
Iteration   3: 24.581 ms/op

# Run progress: 58.70% complete, ETA 00:03:59
# Fork: 2 of 2
# Warmup Iteration   1: 185.943 ms/op
# Warmup Iteration   2: 41.765 ms/op
Iteration   1: 27.096 ms/op
Iteration   2: 25.178 ms/op
Iteration   3: 23.543 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  26.330 ±(99.9%) 6.417 ms/op [Average]
  (min, avg, max) = (23.543, 26.330, 29.605), stdev = 2.288
  CI (99.9%): [19.913, 32.747] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:45
# Fork: 1 of 2
# Warmup Iteration   1: 78655.809 ms/op
# Warmup Iteration   2: 73165.281 ms/op
Iteration   1: 72370.250 ms/op
Iteration   2: 72113.491 ms/op
Iteration   3: 72174.817 ms/op

# Run progress: 63.04% complete, ETA 00:07:02
# Fork: 2 of 2
# Warmup Iteration   1: 79620.628 ms/op
# Warmup Iteration   2: 73964.258 ms/op
Iteration   1: 73237.138 ms/op
Iteration   2: 73230.536 ms/op
Iteration   3: 73101.661 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  72704.649 ±(99.9%) 1515.160 ms/op [Average]
  (min, avg, max) = (72113.491, 72704.649, 73237.138), stdev = 540.321
  CI (99.9%): [71189.489, 74219.809] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:09:44
# Fork: 1 of 2
# Warmup Iteration   1: 10605.832 ms/op
# Warmup Iteration   2: 7200.683 ms/op
Iteration   1: 7535.644 ms/op
Iteration   2: 7421.050 ms/op
Iteration   3: 9311.680 ms/op

# Run progress: 67.39% complete, ETA 00:12:16
# Fork: 2 of 2
# Warmup Iteration   1: 11203.964 ms/op
# Warmup Iteration   2: 7476.305 ms/op
Iteration   1: 7707.164 ms/op
Iteration   2: 7658.117 ms/op
Iteration   3: 9631.116 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  8210.795 ±(99.9%) 2766.891 ms/op [Average]
  (min, avg, max) = (7421.050, 8210.795, 9631.116), stdev = 986.700
  CI (99.9%): [5443.904, 10977.686] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:14:18
# Fork: 1 of 2
# Warmup Iteration   1: 16878.186 ms/op
# Warmup Iteration   2: 11066.262 ms/op
Iteration   1: 10028.828 ms/op
Iteration   2: 10197.640 ms/op
Iteration   3: 9562.679 ms/op

# Run progress: 71.74% complete, ETA 00:13:16
# Fork: 2 of 2
# Warmup Iteration   1: 15570.205 ms/op
# Warmup Iteration   2: 11176.374 ms/op
Iteration   1: 10024.084 ms/op
Iteration   2: 10085.481 ms/op
Iteration   3: 9692.267 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  9931.830 ±(99.9%) 693.543 ms/op [Average]
  (min, avg, max) = (9562.679, 9931.830, 10197.640), stdev = 247.324
  CI (99.9%): [9238.287, 10625.372] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:12:13
# Fork: 1 of 2
# Warmup Iteration   1: Oct 29, 2026 7:06:03 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 7:06:03 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
81.536 ms/op
# Warmup Iteration   2: 46.832 ms/op
Iteration   1: 44.851 ms/op
Iteration   2: 45.147 ms/op
Iteration   3: 44.631 ms/op

# Run progress: 76.09% complete, ETA 00:10:56
# Fork: 2 of 2
# Warmup Iteration   1: Oct 29, 2026 7:06:15 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 7:06:15 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
97.012 ms/op
# Warmup Iteration   2: 50.194 ms/op
Iteration   1: 50.301 ms/op
Iteration   2: 48.946 ms/op
Iteration   3: 48.872 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  47.125 ±(99.9%) 7.067 ms/op [Average]
  (min, avg, max) = (44.631, 47.125, 50.301), stdev = 2.520
  CI (99.9%): [40.057, 54.192] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:09:43
# Fork: 1 of 2
# Warmup Iteration   1: 160.442 ms/op
# Warmup Iteration   2: 67.317 ms/op
Iteration   1: 56.162 ms/op
Iteration   2: 57.602 ms/op
Iteration   3: 56.027 ms/op

# Run progress: 80.43% complete, ETA 00:08:33
# Fork: 2 of 2
# Warmup Iteration   1: 157.760 ms/op
# Warmup Iteration   2: 73.553 ms/op
Iteration   1: 59.991 ms/op
Iteration   2: 59.254 ms/op
Iteration   3: 59.263 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  58.050 ±(99.9%) 4.783 ms/op [Average]
  (min, avg, max) = (56.027, 58.050, 59.991), stdev = 1.706
  CI (99.9%): [53.267, 62.833] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:07:27
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:06:23
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

# Run progress: 86.96% complete, ETA 00:05:22
# Fork: 1 of 2
# Warmup Iteration   1: 1.102 ms/op
# Warmup Iteration   2: 0.644 ms/op
Iteration   1: 0.545 ms/op
Iteration   2: 0.535 ms/op
Iteration   3: 0.527 ms/op

# Run progress: 89.13% complete, ETA 00:04:23
# Fork: 2 of 2
# Warmup Iteration   1: 1.027 ms/op
# Warmup Iteration   2: 0.619 ms/op
Iteration   1: 0.547 ms/op
Iteration   2: 0.528 ms/op
Iteration   3: 0.529 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.535 ±(99.9%) 0.025 ms/op [Average]
  (min, avg, max) = (0.527, 0.535, 0.547), stdev = 0.009
  CI (99.9%): [0.511, 0.560] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:26
# Fork: 1 of 2
# Warmup Iteration   1: 19.561 ms/op
# Warmup Iteration   2: 10.952 ms/op
Iteration   1: 10.963 ms/op
Iteration   2: 10.526 ms/op
Iteration   3: 9.846 ms/op

# Run progress: 93.48% complete, ETA 00:02:32
# Fork: 2 of 2
# Warmup Iteration   1: 22.409 ms/op
# Warmup Iteration   2: 15.002 ms/op
Iteration   1: 12.264 ms/op
Iteration   2: 11.939 ms/op
Iteration   3: 11.953 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  11.248 ±(99.9%) 2.682 ms/op [Average]
  (min, avg, max) = (9.846, 11.248, 12.264), stdev = 0.957
  CI (99.9%): [8.566, 13.931] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:39
# Fork: 1 of 2
# Warmup Iteration   1: 34.762 ms/op
# Warmup Iteration   2: 25.524 ms/op
Iteration   1: 25.475 ms/op
Iteration   2: 25.499 ms/op
Iteration   3: 26.278 ms/op

# Run progress: 97.83% complete, ETA 00:00:49
# Fork: 2 of 2
# Warmup Iteration   1: 36.179 ms/op
# Warmup Iteration   2: 25.270 ms/op
Iteration   1: 25.539 ms/op
Iteration   2: 25.239 ms/op
Iteration   3: 25.118 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  25.525 ±(99.9%) 1.134 ms/op [Average]
  (min, avg, max) = (25.118, 25.525, 26.278), stdev = 0.404
  CI (99.9%): [24.390, 26.659] (assumes normal distribution)


# Run complete. Total time: 00:36:57

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     15.766 ±    0.688  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.173 ±    0.043  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      5.401 ±    0.233  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      5.274 ±    0.221  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      9.458 ±    0.288  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    426.836 ±  291.902  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   4643.006 ±  151.631  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    411.917 ±   21.354  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    942.574 ±   97.497  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.081 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.179 ±    0.188  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.460 ±    0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.208 ±    0.042  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     26.330 ±    6.417  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  72704.649 ± 1515.160  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   8210.795 ± 2766.891  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   9931.830 ±  693.543  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     47.125 ±    7.067  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     58.050 ±    4.783  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.535 ±    0.025  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     11.248 ±    2.682  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     25.525 ±    1.134  ms/op

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
[INFO] Total time:  2.520 s
[INFO] Finished at: 2026-10-29T07:08:25Z
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
tpFlashLeanGas                                                 60.0000  (39 ms)
tpFlashWellFluidSrk                                            83.6406  (98 ms)
tpFlashWellFluidPr                                             83.6541  (57 ms)
tpFlashWellFluidWithProperties                                 5445.46  (141 ms)
phAndPsFlashWellFluid                                          2459.23  (66 ms)
Oct 29, 2026 7:08:34 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 7:08:34 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (804 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (267 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (31 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (81 ms)
saturationPointsWellFluid                                      1601.32  (112 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1182 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1265 ms)
levenbergMarquardtAntoine                                      1837.31  (12 ms)
levenbergMarquardtDoubleExponential                            5.57177  (15 ms)
dataReconciliation[20]                                         7.89841  (19 ms)
dataReconciliation[100]                                        37.0132  (92 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.681 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.428 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.032 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 419451 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 419.5 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 18754 ms, solved=true, gas=318849.56 kg/hr, water in/out=0.00027104531/1.5353072e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018484305, composition error=0.0029102350
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00013837326
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 18.76 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  07:46 min
[INFO] Finished at: 2026-10-29T07:16:13Z
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
# Warmup Iteration   1: 24.206 ms/op
# Warmup Iteration   2: 15.493 ms/op
Iteration   1: 15.547 ms/op
Iteration   2: 15.467 ms/op
Iteration   3: 15.516 ms/op

# Run progress: 2.17% complete, ETA 00:08:59
# Fork: 2 of 2
# Warmup Iteration   1: 23.830 ms/op
# Warmup Iteration   2: 15.820 ms/op
Iteration   1: 15.921 ms/op
Iteration   2: 15.569 ms/op
Iteration   3: 15.803 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  15.637 ±(99.9%) 0.508 ms/op [Average]
  (min, avg, max) = (15.467, 15.637, 15.921), stdev = 0.181
  CI (99.9%): [15.129, 16.145] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:46
# Fork: 1 of 2
# Warmup Iteration   1: 3.110 ms/op
# Warmup Iteration   2: 2.036 ms/op
Iteration   1: 1.204 ms/op
Iteration   2: 1.203 ms/op
Iteration   3: 1.197 ms/op

# Run progress: 6.52% complete, ETA 00:08:35
# Fork: 2 of 2
# Warmup Iteration   1: 2.676 ms/op
# Warmup Iteration   2: 1.262 ms/op
Iteration   1: 1.155 ms/op
Iteration   2: 1.171 ms/op
Iteration   3: 1.157 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.181 ±(99.9%) 0.064 ms/op [Average]
  (min, avg, max) = (1.155, 1.181, 1.204), stdev = 0.023
  CI (99.9%): [1.118, 1.245] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:22
# Fork: 1 of 2
# Warmup Iteration   1: 11.960 ms/op
# Warmup Iteration   2: 6.913 ms/op
Iteration   1: 5.380 ms/op
Iteration   2: 5.368 ms/op
Iteration   3: 5.411 ms/op

# Run progress: 10.87% complete, ETA 00:08:09
# Fork: 2 of 2
# Warmup Iteration   1: 12.106 ms/op
# Warmup Iteration   2: 6.416 ms/op
Iteration   1: 5.380 ms/op
Iteration   2: 5.440 ms/op
Iteration   3: 5.567 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  5.424 ±(99.9%) 0.209 ms/op [Average]
  (min, avg, max) = (5.368, 5.424, 5.567), stdev = 0.075
  CI (99.9%): [5.215, 5.634] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:57
# Fork: 1 of 2
# Warmup Iteration   1: 11.520 ms/op
# Warmup Iteration   2: 6.222 ms/op
Iteration   1: 5.287 ms/op
Iteration   2: 5.292 ms/op
Iteration   3: 5.382 ms/op

# Run progress: 15.22% complete, ETA 00:07:45
# Fork: 2 of 2
# Warmup Iteration   1: 10.888 ms/op
# Warmup Iteration   2: 6.039 ms/op
Iteration   1: 5.156 ms/op
Iteration   2: 5.160 ms/op
Iteration   3: 5.185 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  5.244 ±(99.9%) 0.255 ms/op [Average]
  (min, avg, max) = (5.156, 5.244, 5.382), stdev = 0.091
  CI (99.9%): [4.988, 5.499] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:33
# Fork: 1 of 2
# Warmup Iteration   1: 25.395 ms/op
# Warmup Iteration   2: 13.486 ms/op
Iteration   1: 9.838 ms/op
Iteration   2: 9.542 ms/op
Iteration   3: 9.534 ms/op

# Run progress: 19.57% complete, ETA 00:07:21
# Fork: 2 of 2
# Warmup Iteration   1: 22.095 ms/op
# Warmup Iteration   2: 13.674 ms/op
Iteration   1: 9.763 ms/op
Iteration   2: 9.425 ms/op
Iteration   3: 9.494 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  9.599 ±(99.9%) 0.457 ms/op [Average]
  (min, avg, max) = (9.425, 9.599, 9.838), stdev = 0.163
  CI (99.9%): [9.142, 10.057] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:09
# Fork: 1 of 2
# Warmup Iteration   1: 2227.868 ms/op
# Warmup Iteration   2: 639.880 ms/op
Iteration   1: 400.608 ms/op
Iteration   2: 360.565 ms/op
Iteration   3: 331.341 ms/op

# Run progress: 23.91% complete, ETA 00:06:56
# Fork: 2 of 2
# Warmup Iteration   1: 2138.833 ms/op
# Warmup Iteration   2: 669.972 ms/op
Iteration   1: 443.595 ms/op
Iteration   2: 366.114 ms/op
Iteration   3: 338.325 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  373.425 ±(99.9%) 118.207 ms/op [Average]
  (min, avg, max) = (331.341, 373.425, 443.595), stdev = 42.154
  CI (99.9%): [255.218, 491.632] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:41
# Fork: 1 of 2
# Warmup Iteration   1: 9099.480 ms/op
# Warmup Iteration   2: 5124.977 ms/op
Iteration   1: 4664.390 ms/op
Iteration   2: 4618.184 ms/op
Iteration   3: 4625.808 ms/op

# Run progress: 28.26% complete, ETA 00:07:11
# Fork: 2 of 2
# Warmup Iteration   1: 9346.132 ms/op
# Warmup Iteration   2: 5266.577 ms/op
Iteration   1: 4709.983 ms/op
Iteration   2: 4718.240 ms/op
Iteration   3: 4711.397 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  4674.667 ±(99.9%) 126.518 ms/op [Average]
  (min, avg, max) = (4618.184, 4674.667, 4718.240), stdev = 45.117
  CI (99.9%): [4548.149, 4801.185] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:07:34
# Fork: 1 of 2
# Warmup Iteration   1: 1176.916 ms/op
# Warmup Iteration   2: 443.167 ms/op
Iteration   1: 413.099 ms/op
Iteration   2: 401.333 ms/op
Iteration   3: 399.355 ms/op

# Run progress: 32.61% complete, ETA 00:07:14
# Fork: 2 of 2
# Warmup Iteration   1: 1174.197 ms/op
# Warmup Iteration   2: 449.139 ms/op
Iteration   1: 414.672 ms/op
Iteration   2: 402.178 ms/op
Iteration   3: 399.594 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  405.039 ±(99.9%) 19.494 ms/op [Average]
  (min, avg, max) = (399.355, 405.039, 414.672), stdev = 6.952
  CI (99.9%): [385.545, 424.532] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:55
# Fork: 1 of 2
# Warmup Iteration   1: 2563.694 ms/op
# Warmup Iteration   2: 1035.246 ms/op
Iteration   1: 1009.950 ms/op
Iteration   2: 909.106 ms/op
Iteration   3: 909.289 ms/op

# Run progress: 36.96% complete, ETA 00:06:39
# Fork: 2 of 2
# Warmup Iteration   1: 2485.349 ms/op
# Warmup Iteration   2: 1045.063 ms/op
Iteration   1: 1030.992 ms/op
Iteration   2: 927.474 ms/op
Iteration   3: 920.811 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  951.270 ±(99.9%) 152.735 ms/op [Average]
  (min, avg, max) = (909.106, 951.270, 1030.992), stdev = 54.467
  CI (99.9%): [798.535, 1104.005] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:06:23
# Fork: 1 of 2
# Warmup Iteration   1: 0.197 ms/op
# Warmup Iteration   2: 0.082 ms/op
Iteration   1: 0.082 ms/op
Iteration   2: 0.083 ms/op
Iteration   3: 0.080 ms/op

# Run progress: 41.30% complete, ETA 00:06:04
# Fork: 2 of 2
# Warmup Iteration   1: 0.189 ms/op
# Warmup Iteration   2: 0.083 ms/op
Iteration   1: 0.083 ms/op
Iteration   2: 0.081 ms/op
Iteration   3: 0.081 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.082 ±(99.9%) 0.003 ms/op [Average]
  (min, avg, max) = (0.080, 0.082, 0.083), stdev = 0.001
  CI (99.9%): [0.078, 0.085] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:47
# Fork: 1 of 2
# Warmup Iteration   1: 11.281 ms/op
# Warmup Iteration   2: 6.419 ms/op
Iteration   1: 6.231 ms/op
Iteration   2: 6.155 ms/op
Iteration   3: 6.114 ms/op

# Run progress: 45.65% complete, ETA 00:05:30
# Fork: 2 of 2
# Warmup Iteration   1: 10.545 ms/op
# Warmup Iteration   2: 6.343 ms/op
Iteration   1: 6.197 ms/op
Iteration   2: 6.156 ms/op
Iteration   3: 6.130 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.164 ±(99.9%) 0.121 ms/op [Average]
  (min, avg, max) = (6.114, 6.164, 6.231), stdev = 0.043
  CI (99.9%): [6.043, 6.285] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:05:13
# Fork: 1 of 2
# Warmup Iteration   1: 0.852 ms/op
# Warmup Iteration   2: 0.465 ms/op
Iteration   1: 0.462 ms/op
Iteration   2: 0.460 ms/op
Iteration   3: 0.460 ms/op

# Run progress: 50.00% complete, ETA 00:04:57
# Fork: 2 of 2
# Warmup Iteration   1: 0.827 ms/op
# Warmup Iteration   2: 0.467 ms/op
Iteration   1: 0.463 ms/op
Iteration   2: 0.468 ms/op
Iteration   3: 0.461 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.462 ±(99.9%) 0.008 ms/op [Average]
  (min, avg, max) = (0.460, 0.462, 0.468), stdev = 0.003
  CI (99.9%): [0.455, 0.470] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:42
# Fork: 1 of 2
# Warmup Iteration   1: 1.968 ms/op
# Warmup Iteration   2: 1.291 ms/op
Iteration   1: 1.235 ms/op
Iteration   2: 1.193 ms/op
Iteration   3: 1.186 ms/op

# Run progress: 54.35% complete, ETA 00:04:27
# Fork: 2 of 2
# Warmup Iteration   1: 1.930 ms/op
# Warmup Iteration   2: 1.286 ms/op
Iteration   1: 1.191 ms/op
Iteration   2: 1.193 ms/op
Iteration   3: 1.190 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.198 ±(99.9%) 0.052 ms/op [Average]
  (min, avg, max) = (1.186, 1.198, 1.235), stdev = 0.019
  CI (99.9%): [1.146, 1.250] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:04:12
# Fork: 1 of 2
# Warmup Iteration   1: 187.005 ms/op
# Warmup Iteration   2: 41.024 ms/op
Iteration   1: 28.771 ms/op
Iteration   2: 26.486 ms/op
Iteration   3: 24.257 ms/op

# Run progress: 58.70% complete, ETA 00:03:58
# Fork: 2 of 2
# Warmup Iteration   1: 224.995 ms/op
# Warmup Iteration   2: 41.823 ms/op
Iteration   1: 27.258 ms/op
Iteration   2: 25.092 ms/op
Iteration   3: 24.440 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  26.051 ±(99.9%) 4.981 ms/op [Average]
  (min, avg, max) = (24.257, 26.051, 28.771), stdev = 1.776
  CI (99.9%): [21.070, 31.031] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:44
# Fork: 1 of 2
# Warmup Iteration   1: 71862.978 ms/op
# Warmup Iteration   2: 66859.995 ms/op
Iteration   1: 66808.365 ms/op
Iteration   2: 66631.338 ms/op
Iteration   3: 66501.898 ms/op

# Run progress: 63.04% complete, ETA 00:06:44
# Fork: 2 of 2
# Warmup Iteration   1: 73491.646 ms/op
# Warmup Iteration   2: 67900.120 ms/op
Iteration   1: 67186.688 ms/op
Iteration   2: 67251.291 ms/op
Iteration   3: 67215.787 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  66932.561 ±(99.9%) 919.856 ms/op [Average]
  (min, avg, max) = (66501.898, 66932.561, 67251.291), stdev = 328.030
  CI (99.9%): [66012.705, 67852.417] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:09:11
# Fork: 1 of 2
# Warmup Iteration   1: 9107.264 ms/op
# Warmup Iteration   2: 7804.833 ms/op
Iteration   1: 9896.122 ms/op
Iteration   2: 7491.476 ms/op
Iteration   3: 10802.524 ms/op

# Run progress: 67.39% complete, ETA 00:11:56
# Fork: 2 of 2
# Warmup Iteration   1: 8786.991 ms/op
# Warmup Iteration   2: 7608.314 ms/op
Iteration   1: 9511.225 ms/op
Iteration   2: 7255.248 ms/op
Iteration   3: 10434.364 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  9231.827 ±(99.9%) 4228.323 ms/op [Average]
  (min, avg, max) = (7255.248, 9231.827, 10802.524), stdev = 1507.861
  CI (99.9%): [5003.503, 13460.150] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:13:51
# Fork: 1 of 2
# Warmup Iteration   1: 15940.035 ms/op
# Warmup Iteration   2: 12025.877 ms/op
Iteration   1: 9972.341 ms/op
Iteration   2: 10130.306 ms/op
Iteration   3: 9595.635 ms/op

# Run progress: 71.74% complete, ETA 00:12:51
# Fork: 2 of 2
# Warmup Iteration   1: 16857.364 ms/op
# Warmup Iteration   2: 11338.576 ms/op
Iteration   1: 9975.618 ms/op
Iteration   2: 10404.039 ms/op
Iteration   3: 9678.030 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  9959.328 ±(99.9%) 830.757 ms/op [Average]
  (min, avg, max) = (9595.635, 9959.328, 10404.039), stdev = 296.256
  CI (99.9%): [9128.572, 10790.085] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:11:52
# Fork: 1 of 2
# Warmup Iteration   1: Oct 29, 2026 7:49:53 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 7:49:53 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
111.993 ms/op
# Warmup Iteration   2: 49.767 ms/op
Iteration   1: 51.107 ms/op
Iteration   2: 48.882 ms/op
Iteration   3: 48.927 ms/op

# Run progress: 76.09% complete, ETA 00:10:37
# Fork: 2 of 2
# Warmup Iteration   1: Oct 29, 2026 7:50:04 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 7:50:04 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
113.622 ms/op
# Warmup Iteration   2: 49.600 ms/op
Iteration   1: 50.939 ms/op
Iteration   2: 48.986 ms/op
Iteration   3: 49.288 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  49.688 ±(99.9%) 2.931 ms/op [Average]
  (min, avg, max) = (48.882, 49.688, 51.107), stdev = 1.045
  CI (99.9%): [46.757, 52.619] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:09:26
# Fork: 1 of 2
# Warmup Iteration   1: 133.583 ms/op
# Warmup Iteration   2: 61.076 ms/op
Iteration   1: 57.125 ms/op
Iteration   2: 57.372 ms/op
Iteration   3: 57.153 ms/op

# Run progress: 80.43% complete, ETA 00:08:19
# Fork: 2 of 2
# Warmup Iteration   1: 154.569 ms/op
# Warmup Iteration   2: 71.660 ms/op
Iteration   1: 56.754 ms/op
Iteration   2: 56.641 ms/op
Iteration   3: 56.755 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  56.967 ±(99.9%) 0.813 ms/op [Average]
  (min, avg, max) = (56.641, 56.967, 57.372), stdev = 0.290
  CI (99.9%): [56.153, 57.780] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:07:14
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:06:12
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

# Run progress: 86.96% complete, ETA 00:05:13
# Fork: 1 of 2
# Warmup Iteration   1: 0.983 ms/op
# Warmup Iteration   2: 0.593 ms/op
Iteration   1: 0.553 ms/op
Iteration   2: 0.542 ms/op
Iteration   3: 0.530 ms/op

# Run progress: 89.13% complete, ETA 00:04:15
# Fork: 2 of 2
# Warmup Iteration   1: 1.054 ms/op
# Warmup Iteration   2: 0.599 ms/op
Iteration   1: 0.537 ms/op
Iteration   2: 0.521 ms/op
Iteration   3: 0.516 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.533 ±(99.9%) 0.038 ms/op [Average]
  (min, avg, max) = (0.516, 0.533, 0.553), stdev = 0.014
  CI (99.9%): [0.495, 0.572] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:20
# Fork: 1 of 2
# Warmup Iteration   1: 26.426 ms/op
# Warmup Iteration   2: 14.943 ms/op
Iteration   1: 12.039 ms/op
Iteration   2: 12.810 ms/op
Iteration   3: 11.597 ms/op

# Run progress: 93.48% complete, ETA 00:02:28
# Fork: 2 of 2
# Warmup Iteration   1: 21.930 ms/op
# Warmup Iteration   2: 16.350 ms/op
Iteration   1: 12.136 ms/op
Iteration   2: 11.734 ms/op
Iteration   3: 12.146 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  12.077 ±(99.9%) 1.187 ms/op [Average]
  (min, avg, max) = (11.597, 12.077, 12.810), stdev = 0.423
  CI (99.9%): [10.890, 13.264] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:36
# Fork: 1 of 2
# Warmup Iteration   1: 26.699 ms/op
# Warmup Iteration   2: 20.767 ms/op
Iteration   1: 20.762 ms/op
Iteration   2: 20.656 ms/op
Iteration   3: 20.603 ms/op

# Run progress: 97.83% complete, ETA 00:00:47
# Fork: 2 of 2
# Warmup Iteration   1: 28.076 ms/op
# Warmup Iteration   2: 21.293 ms/op
Iteration   1: 20.759 ms/op
Iteration   2: 20.647 ms/op
Iteration   3: 20.824 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  20.708 ±(99.9%) 0.240 ms/op [Average]
  (min, avg, max) = (20.603, 20.708, 20.824), stdev = 0.086
  CI (99.9%): [20.468, 20.949] (assumes normal distribution)


# Run complete. Total time: 00:35:57

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     15.637 ±    0.508  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.181 ±    0.064  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      5.424 ±    0.209  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      5.244 ±    0.255  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      9.599 ±    0.457  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    373.425 ±  118.207  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   4674.667 ±  126.518  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    405.039 ±   19.494  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    951.270 ±  152.735  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.082 ±    0.003  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.164 ±    0.121  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.462 ±    0.008  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.198 ±    0.052  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     26.051 ±    4.981  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  66932.561 ±  919.856  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   9231.827 ± 4228.323  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   9959.328 ±  830.757  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     49.688 ±    2.931  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     56.967 ±    0.813  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.533 ±    0.038  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     12.077 ±    1.187  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     20.708 ±    0.240  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.15.0 -> 3.16.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 11 lower, 12 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 25.5247 | 20.7084 | -18.87% | Separate CIs |
| flash.TPflash.testFlash | 426.836 | 373.425 | -12.51% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 8210.8 | 9231.83 | +12.44% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 72704.6 | 66932.6 | -7.94% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 11.2483 | 12.0769 | +7.37% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 47.1247 | 49.6881 | +5.44% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 58.0498 | 56.9666 | -1.87% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 411.917 | 405.039 | -1.67% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 9.45758 | 9.59933 | +1.50% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.080501 | 0.0815313 | +1.28% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
