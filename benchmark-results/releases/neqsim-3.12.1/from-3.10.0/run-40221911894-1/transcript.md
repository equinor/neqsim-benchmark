# NeqSim 3.12.1 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.10.0 |
| Current | 3.12.1 |
| Source commit | `fc2ebade931f69e60b5e72372162b22c665ca190` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40221911894) |
| Status | incomplete |


## benchmark-revision.json

```text
{
  "number": 13,
  "label": "B13-b048238496c5",
  "fingerprint": "b048238496c557d6de94a734de7ddbbf0dec223af649ff65f992cfe1488dfd3c",
  "source_commit": "fc2ebade931f69e60b5e72372162b22c665ca190",
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
[INFO] Total time:  10.093 s
[INFO] Finished at: 2026-10-25T18:35:14Z
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.518 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (44 ms)
tpFlashWellFluidSrk                                            83.6406  (94 ms)
tpFlashWellFluidPr                                             83.6541  (56 ms)
tpFlashWellFluidWithProperties                                 5445.46  (89 ms)
phAndPsFlashWellFluid                                          2459.23  (51 ms)
Oct 25, 2026 6:35:27 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 25, 2026 6:35:27 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (337 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (225 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (23 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (48 ms)
saturationPointsWellFluid                                      1601.32  (111 ms)
singlePhaseGasPipelineSteadyState                              121.628  (838 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1029 ms)
levenbergMarquardtAntoine                                      1837.31  (7 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (1 ms)
dataReconciliation[100]                                        37.0132  (19 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.777 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 282186 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 282.2 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.013 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 17374 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027173922/1.5453817e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00013184845, composition error=0.0021041876
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=9.7288502e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 17.39 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  05:27 min
[INFO] Finished at: 2026-10-25T18:40:43Z
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
# Warmup Iteration   1: 16.435 ms/op
# Warmup Iteration   2: 12.375 ms/op
Iteration   1: 12.213 ms/op
Iteration   2: 12.147 ms/op
Iteration   3: 12.073 ms/op

# Run progress: 2.17% complete, ETA 00:08:41
# Fork: 2 of 2
# Warmup Iteration   1: 16.566 ms/op
# Warmup Iteration   2: 12.616 ms/op
Iteration   1: 12.415 ms/op
Iteration   2: 12.226 ms/op
Iteration   3: 12.063 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  12.190 ±(99.9%) 0.364 ms/op [Average]
  (min, avg, max) = (12.063, 12.190, 12.415), stdev = 0.130
  CI (99.9%): [11.826, 12.553] (assumes normal distribution)


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

# Run progress: 4.35% complete, ETA 00:08:27
# Fork: 1 of 2
# Warmup Iteration   1: 1.769 ms/op
# Warmup Iteration   2: 0.899 ms/op
Iteration   1: 0.885 ms/op
Iteration   2: 0.936 ms/op
Iteration   3: 0.916 ms/op

# Run progress: 6.52% complete, ETA 00:08:15
# Fork: 2 of 2
# Warmup Iteration   1: 1.613 ms/op
# Warmup Iteration   2: 0.893 ms/op
Iteration   1: 0.882 ms/op
Iteration   2: 0.900 ms/op
Iteration   3: 0.877 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.900 ±(99.9%) 0.064 ms/op [Average]
  (min, avg, max) = (0.877, 0.900, 0.936), stdev = 0.023
  CI (99.9%): [0.836, 0.963] (assumes normal distribution)


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

# Run progress: 8.70% complete, ETA 00:08:03
# Fork: 1 of 2
# Warmup Iteration   1: 6.883 ms/op
# Warmup Iteration   2: 3.902 ms/op
Iteration   1: 3.829 ms/op
Iteration   2: 3.886 ms/op
Iteration   3: 3.806 ms/op

# Run progress: 10.87% complete, ETA 00:07:52
# Fork: 2 of 2
# Warmup Iteration   1: 7.229 ms/op
# Warmup Iteration   2: 4.109 ms/op
Iteration   1: 3.844 ms/op
Iteration   2: 3.808 ms/op
Iteration   3: 3.796 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  3.828 ±(99.9%) 0.093 ms/op [Average]
  (min, avg, max) = (3.796, 3.828, 3.886), stdev = 0.033
  CI (99.9%): [3.735, 3.921] (assumes normal distribution)


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

# Run progress: 13.04% complete, ETA 00:07:40
# Fork: 1 of 2
# Warmup Iteration   1: 7.343 ms/op
# Warmup Iteration   2: 4.004 ms/op
Iteration   1: 3.879 ms/op
Iteration   2: 3.877 ms/op
Iteration   3: 3.796 ms/op

# Run progress: 15.22% complete, ETA 00:07:29
# Fork: 2 of 2
# Warmup Iteration   1: 6.934 ms/op
# Warmup Iteration   2: 4.029 ms/op
Iteration   1: 3.942 ms/op
Iteration   2: 4.024 ms/op
Iteration   3: 3.925 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  3.907 ±(99.9%) 0.215 ms/op [Average]
  (min, avg, max) = (3.796, 3.907, 4.024), stdev = 0.077
  CI (99.9%): [3.692, 4.122] (assumes normal distribution)


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

# Run progress: 17.39% complete, ETA 00:07:17
# Fork: 1 of 2
# Warmup Iteration   1: 16.870 ms/op
# Warmup Iteration   2: 8.615 ms/op
Iteration   1: 7.283 ms/op
Iteration   2: 7.318 ms/op
Iteration   3: 7.308 ms/op

# Run progress: 19.57% complete, ETA 00:07:06
# Fork: 2 of 2
# Warmup Iteration   1: 15.209 ms/op
# Warmup Iteration   2: 7.954 ms/op
Iteration   1: 7.157 ms/op
Iteration   2: 7.125 ms/op
Iteration   3: 7.312 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  7.251 ±(99.9%) 0.242 ms/op [Average]
  (min, avg, max) = (7.125, 7.251, 7.318), stdev = 0.086
  CI (99.9%): [7.009, 7.492] (assumes normal distribution)


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

# Run progress: 21.74% complete, ETA 00:06:54
# Fork: 1 of 2
# Warmup Iteration   1: 1125.017 ms/op
# Warmup Iteration   2: 434.849 ms/op
Iteration   1: 347.817 ms/op
Iteration   2: 258.633 ms/op
Iteration   3: 262.744 ms/op

# Run progress: 23.91% complete, ETA 00:06:41
# Fork: 2 of 2
# Warmup Iteration   1: 1175.548 ms/op
# Warmup Iteration   2: 428.380 ms/op
Iteration   1: 282.346 ms/op
Iteration   2: 258.079 ms/op
Iteration   3: 288.159 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  282.963 ±(99.9%) 95.945 ms/op [Average]
  (min, avg, max) = (258.079, 282.963, 347.817), stdev = 34.215
  CI (99.9%): [187.018, 378.908] (assumes normal distribution)


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

# Run progress: 26.09% complete, ETA 00:06:29
# Fork: 1 of 2
# Warmup Iteration   1: 2257.015 ms/op
# Warmup Iteration   2: 855.469 ms/op
Iteration   1: 569.826 ms/op
Iteration   2: 595.134 ms/op
Iteration   3: 539.845 ms/op

# Run progress: 28.26% complete, ETA 00:06:18
# Fork: 2 of 2
# Warmup Iteration   1: 2320.734 ms/op
# Warmup Iteration   2: 829.673 ms/op
Iteration   1: 603.394 ms/op
Iteration   2: 562.924 ms/op
Iteration   3: 616.725 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  581.308 ±(99.9%) 80.517 ms/op [Average]
  (min, avg, max) = (539.845, 581.308, 616.725), stdev = 28.713
  CI (99.9%): [500.790, 661.825] (assumes normal distribution)


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

# Run progress: 30.43% complete, ETA 00:06:09
# Fork: 1 of 2
# Warmup Iteration   1: 750.215 ms/op
# Warmup Iteration   2: 345.620 ms/op
Iteration   1: 311.407 ms/op
Iteration   2: 309.108 ms/op
Iteration   3: 312.324 ms/op

# Run progress: 32.61% complete, ETA 00:05:56
# Fork: 2 of 2
# Warmup Iteration   1: 775.961 ms/op
# Warmup Iteration   2: 342.991 ms/op
Iteration   1: 324.888 ms/op
Iteration   2: 317.829 ms/op
Iteration   3: 305.910 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  313.578 ±(99.9%) 19.062 ms/op [Average]
  (min, avg, max) = (305.910, 313.578, 324.888), stdev = 6.798
  CI (99.9%): [294.516, 332.640] (assumes normal distribution)


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

# Run progress: 34.78% complete, ETA 00:05:44
# Fork: 1 of 2
# Warmup Iteration   1: 1351.032 ms/op
# Warmup Iteration   2: 776.853 ms/op
Iteration   1: 695.533 ms/op
Iteration   2: 690.007 ms/op
Iteration   3: 721.970 ms/op

# Run progress: 36.96% complete, ETA 00:05:33
# Fork: 2 of 2
# Warmup Iteration   1: 2047.430 ms/op
# Warmup Iteration   2: 771.688 ms/op
Iteration   1: 744.434 ms/op
Iteration   2: 706.301 ms/op
Iteration   3: 726.234 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  714.080 ±(99.9%) 57.678 ms/op [Average]
  (min, avg, max) = (690.007, 714.080, 744.434), stdev = 20.569
  CI (99.9%): [656.402, 771.758] (assumes normal distribution)


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

# Run progress: 39.13% complete, ETA 00:05:21
# Fork: 1 of 2
# Warmup Iteration   1: 0.186 ms/op
# Warmup Iteration   2: 0.111 ms/op
Iteration   1: 0.110 ms/op
Iteration   2: 0.111 ms/op
Iteration   3: 0.109 ms/op

# Run progress: 41.30% complete, ETA 00:05:07
# Fork: 2 of 2
# Warmup Iteration   1: 0.200 ms/op
# Warmup Iteration   2: 0.110 ms/op
Iteration   1: 0.110 ms/op
Iteration   2: 0.110 ms/op
Iteration   3: 0.109 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.110 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.109, 0.110, 0.111), stdev = 0.001
  CI (99.9%): [0.108, 0.112] (assumes normal distribution)


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

# Run progress: 43.48% complete, ETA 00:04:54
# Fork: 1 of 2
# Warmup Iteration   1: 13.839 ms/op
# Warmup Iteration   2: 9.751 ms/op
Iteration   1: 9.523 ms/op
Iteration   2: 9.496 ms/op
Iteration   3: 9.288 ms/op

# Run progress: 45.65% complete, ETA 00:04:42
# Fork: 2 of 2
# Warmup Iteration   1: 13.851 ms/op
# Warmup Iteration   2: 9.599 ms/op
Iteration   1: 9.502 ms/op
Iteration   2: 9.455 ms/op
Iteration   3: 9.400 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  9.444 ±(99.9%) 0.247 ms/op [Average]
  (min, avg, max) = (9.288, 9.444, 9.523), stdev = 0.088
  CI (99.9%): [9.197, 9.691] (assumes normal distribution)


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

# Run progress: 47.83% complete, ETA 00:04:29
# Fork: 1 of 2
# Warmup Iteration   1: 0.557 ms/op
# Warmup Iteration   2: 0.347 ms/op
Iteration   1: 0.334 ms/op
Iteration   2: 0.337 ms/op
Iteration   3: 0.361 ms/op

# Run progress: 50.00% complete, ETA 00:04:17
# Fork: 2 of 2
# Warmup Iteration   1: 0.579 ms/op
# Warmup Iteration   2: 0.343 ms/op
Iteration   1: 0.337 ms/op
Iteration   2: 0.340 ms/op
Iteration   3: 0.340 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.341 ±(99.9%) 0.027 ms/op [Average]
  (min, avg, max) = (0.334, 0.341, 0.361), stdev = 0.010
  CI (99.9%): [0.314, 0.369] (assumes normal distribution)


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

# Run progress: 52.17% complete, ETA 00:04:05
# Fork: 1 of 2
# Warmup Iteration   1: 1.366 ms/op
# Warmup Iteration   2: 0.948 ms/op
Iteration   1: 0.881 ms/op
Iteration   2: 0.868 ms/op
Iteration   3: 0.896 ms/op

# Run progress: 54.35% complete, ETA 00:03:53
# Fork: 2 of 2
# Warmup Iteration   1: 1.342 ms/op
# Warmup Iteration   2: 0.923 ms/op
Iteration   1: 0.892 ms/op
Iteration   2: 0.879 ms/op
Iteration   3: 0.865 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  0.880 ±(99.9%) 0.035 ms/op [Average]
  (min, avg, max) = (0.865, 0.880, 0.896), stdev = 0.012
  CI (99.9%): [0.845, 0.915] (assumes normal distribution)


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

# Run progress: 56.52% complete, ETA 00:03:41
# Fork: 1 of 2
# Warmup Iteration   1: 107.589 ms/op
# Warmup Iteration   2: 26.774 ms/op
Iteration   1: 20.076 ms/op
Iteration   2: 18.379 ms/op
Iteration   3: 17.334 ms/op

# Run progress: 58.70% complete, ETA 00:03:30
# Fork: 2 of 2
# Warmup Iteration   1: 134.961 ms/op
# Warmup Iteration   2: 27.569 ms/op
Iteration   1: 20.273 ms/op
Iteration   2: 16.930 ms/op
Iteration   3: 16.473 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  18.244 ±(99.9%) 4.553 ms/op [Average]
  (min, avg, max) = (16.473, 18.244, 20.273), stdev = 1.624
  CI (99.9%): [13.691, 22.797] (assumes normal distribution)


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

# Run progress: 60.87% complete, ETA 00:03:18
# Fork: 1 of 2
# Warmup Iteration   1: 25041.543 ms/op
# Warmup Iteration   2: 21809.489 ms/op
Iteration   1: 21178.829 ms/op
Iteration   2: 21388.027 ms/op
Iteration   3: 21175.295 ms/op

# Run progress: 63.04% complete, ETA 00:04:06
# Fork: 2 of 2
# Warmup Iteration   1: 25488.582 ms/op
# Warmup Iteration   2: 21992.122 ms/op
Iteration   1: 21738.063 ms/op
Iteration   2: 21787.519 ms/op
Iteration   3: 21649.944 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  21486.280 ±(99.9%) 774.907 ms/op [Average]
  (min, avg, max) = (21175.295, 21486.280, 21787.519), stdev = 276.339
  CI (99.9%): [20711.372, 22261.187] (assumes normal distribution)


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

# Run progress: 65.22% complete, ETA 00:04:45
# Fork: 1 of 2
# Warmup Iteration   1: 5834.765 ms/op
# Warmup Iteration   2: 5589.792 ms/op
Iteration   1: 5789.540 ms/op
Iteration   2: 5720.586 ms/op
Iteration   3: 5726.527 ms/op

# Run progress: 67.39% complete, ETA 00:06:35
# Fork: 2 of 2
# Warmup Iteration   1: 5669.073 ms/op
# Warmup Iteration   2: 5513.418 ms/op
Iteration   1: 5731.370 ms/op
Iteration   2: 5574.226 ms/op
Iteration   3: 5430.514 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  5662.127 ±(99.9%) 376.147 ms/op [Average]
  (min, avg, max) = (5430.514, 5662.127, 5789.540), stdev = 134.138
  CI (99.9%): [5285.980, 6038.275] (assumes normal distribution)


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

# Run progress: 69.57% complete, ETA 00:07:56
# Fork: 1 of 2
# Warmup Iteration   1: 14771.899 ms/op
# Warmup Iteration   2: 10570.003 ms/op
Iteration   1: 10508.468 ms/op
Iteration   2: 10102.881 ms/op
Iteration   3: 10294.371 ms/op

# Run progress: 71.74% complete, ETA 00:07:31
# Fork: 2 of 2
# Warmup Iteration   1: 16073.980 ms/op
# Warmup Iteration   2: 11353.496 ms/op
Iteration   1: 12227.402 ms/op
Iteration   2: 11407.511 ms/op
Iteration   3: 9595.764 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  10689.400 ±(99.9%) 2692.593 ms/op [Average]
  (min, avg, max) = (9595.764, 10689.400, 12227.402), stdev = 960.204
  CI (99.9%): [7996.807, 13381.992] (assumes normal distribution)


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

# Run progress: 73.91% complete, ETA 00:07:05
# Fork: 1 of 2
# Warmup Iteration   1: Oct 25, 2026 7:00:51 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 25, 2026 7:00:51 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
48.917 ms/op
# Warmup Iteration   2: 33.104 ms/op
Iteration   1: 32.750 ms/op
Iteration   2: 32.563 ms/op
Iteration   3: 31.654 ms/op

# Run progress: 76.09% complete, ETA 00:06:22
# Fork: 2 of 2
# Warmup Iteration   1: Oct 25, 2026 7:01:02 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 25, 2026 7:01:02 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
54.637 ms/op
# Warmup Iteration   2: 37.371 ms/op
Iteration   1: 36.349 ms/op
Iteration   2: 36.712 ms/op
Iteration   3: 36.426 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  34.409 ±(99.9%) 6.502 ms/op [Average]
  (min, avg, max) = (31.654, 34.409, 36.712), stdev = 2.319
  CI (99.9%): [27.907, 40.912] (assumes normal distribution)


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

# Run progress: 78.26% complete, ETA 00:05:41
# Fork: 1 of 2
# Warmup Iteration   1: 69.989 ms/op
# Warmup Iteration   2: 45.588 ms/op
Iteration   1: 45.192 ms/op
Iteration   2: 43.063 ms/op
Iteration   3: 46.524 ms/op

# Run progress: 80.43% complete, ETA 00:05:01
# Fork: 2 of 2
# Warmup Iteration   1: 97.642 ms/op
# Warmup Iteration   2: 51.475 ms/op
Iteration   1: 43.927 ms/op
Iteration   2: 43.987 ms/op
Iteration   3: 43.831 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  44.421 ±(99.9%) 3.467 ms/op [Average]
  (min, avg, max) = (43.063, 44.421, 46.524), stdev = 1.236
  CI (99.9%): [40.954, 47.887] (assumes normal distribution)


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

# Run progress: 82.61% complete, ETA 00:04:23
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:03:46
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

# Run progress: 86.96% complete, ETA 00:03:11
# Fork: 1 of 2
# Warmup Iteration   1: 0.618 ms/op
# Warmup Iteration   2: 0.387 ms/op
Iteration   1: 0.375 ms/op
Iteration   2: 0.379 ms/op
Iteration   3: 0.374 ms/op

# Run progress: 89.13% complete, ETA 00:02:36
# Fork: 2 of 2
# Warmup Iteration   1: 0.780 ms/op
# Warmup Iteration   2: 0.423 ms/op
Iteration   1: 0.390 ms/op
Iteration   2: 0.389 ms/op
Iteration   3: 0.400 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.385 ±(99.9%) 0.028 ms/op [Average]
  (min, avg, max) = (0.374, 0.385, 0.400), stdev = 0.010
  CI (99.9%): [0.356, 0.413] (assumes normal distribution)


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

# Run progress: 91.30% complete, ETA 00:02:03
# Fork: 1 of 2
# Warmup Iteration   1: 14.326 ms/op
# Warmup Iteration   2: 8.594 ms/op
Iteration   1: 8.503 ms/op
Iteration   2: 7.976 ms/op
Iteration   3: 8.014 ms/op

# Run progress: 93.48% complete, ETA 00:01:31
# Fork: 2 of 2
# Warmup Iteration   1: 16.177 ms/op
# Warmup Iteration   2: 8.685 ms/op
Iteration   1: 8.797 ms/op
Iteration   2: 8.081 ms/op
Iteration   3: 8.102 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  8.246 ±(99.9%) 0.925 ms/op [Average]
  (min, avg, max) = (7.976, 8.246, 8.797), stdev = 0.330
  CI (99.9%): [7.321, 9.171] (assumes normal distribution)


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

# Run progress: 95.65% complete, ETA 00:00:59
# Fork: 1 of 2
# Warmup Iteration   1: 16.790 ms/op
# Warmup Iteration   2: 14.568 ms/op
Iteration   1: 14.746 ms/op
Iteration   2: 14.848 ms/op
Iteration   3: 14.898 ms/op

# Run progress: 97.83% complete, ETA 00:00:29
# Fork: 2 of 2
# Warmup Iteration   1: 19.113 ms/op
# Warmup Iteration   2: 15.009 ms/op
Iteration   1: 14.742 ms/op
Iteration   2: 15.106 ms/op
Iteration   3: 15.033 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  14.896 ±(99.9%) 0.419 ms/op [Average]
  (min, avg, max) = (14.742, 14.896, 15.106), stdev = 0.149
  CI (99.9%): [14.477, 15.314] (assumes normal distribution)


# Run complete. Total time: 00:22:21

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     12.190 ±    0.364  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.900 ±    0.064  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      3.828 ±    0.093  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      3.907 ±    0.215  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      7.251 ±    0.242  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    282.963 ±   95.945  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    581.308 ±   80.517  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    313.578 ±   19.062  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    714.080 ±   57.678  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.110 ±    0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      9.444 ±    0.247  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.341 ±    0.027  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      0.880 ±    0.035  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     18.244 ±    4.553  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  21486.280 ±  774.907  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   5662.127 ±  376.147  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  10689.400 ± 2692.593  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     34.409 ±    6.502  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     44.421 ±    3.467  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.385 ±    0.028  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      8.246 ±    0.925  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     14.896 ±    0.419  ms/op

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
[INFO] Total time:  2.307 s
[INFO] Finished at: 2026-10-25T19:03:09Z
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.385 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (35 ms)
tpFlashWellFluidSrk                                            83.6406  (73 ms)
tpFlashWellFluidPr                                             83.6541  (49 ms)
tpFlashWellFluidWithProperties                                 5445.46  (96 ms)
phAndPsFlashWellFluid                                          2459.23  (49 ms)
Oct 25, 2026 7:03:16 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 25, 2026 7:03:16 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (369 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (214 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (27 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (56 ms)
saturationPointsWellFluid                                      1601.32  (92 ms)
singlePhaseGasPipelineSteadyState                              121.628  (907 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1047 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (1 ms)
dataReconciliation[100]                                        37.0132  (11 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.602 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 1683560 ms
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

[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 1684 s <<< FAILURE! -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[ERROR] com.equinor.neqsim.benchmark.OilGasPlatformModelTest.platformModelSolves -- Time elapsed: 1684 s <<< FAILURE!
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
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.860 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 13723 ms, solved=true, gas=318849.57 kg/hr, water in/out=0.00027173922/1.5391411e-05
TEG recycle stripping gas recirc: solved=true, flow error=9.9231280e-05, composition error=0.0015792418
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=0.00031099734
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.73 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  28:29 min
[INFO] Finished at: 2026-10-25T19:31:39Z
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
