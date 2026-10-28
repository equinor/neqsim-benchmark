# NeqSim 3.13.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.12.1 |
| Current | 3.13.0 |
| Source commit | `f7e5a972dcd471d6e664f06f1f3a5d0755963705` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40707103678) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "f7e5a972dcd471d6e664f06f1f3a5d0755963705",
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
BogoMIPS:                                5192.25
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
| baseline | 3.12.1 | passed |
| current | 3.13.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.12.1",
  "version": "3.12.1",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.12.1/neqsim-3.12.1.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.13.0",
  "version": "3.13.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.13.0/neqsim-3.13.0.jar",
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
[INFO] Total time:  4.474 s
[INFO] Finished at: 2026-10-28T14:33:51Z
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
tpFlashLeanGas                                                 60.0000  (38 ms)
tpFlashWellFluidSrk                                            83.6406  (133 ms)
tpFlashWellFluidPr                                             83.6541  (53 ms)
tpFlashWellFluidWithProperties                                 5445.46  (101 ms)
phAndPsFlashWellFluid                                          2459.23  (63 ms)
Oct 28, 2026 2:34:00 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 2:34:00 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (433 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (186 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (23 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (72 ms)
saturationPointsWellFluid                                      1601.32  (102 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1028 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1061 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (8 ms)
dataReconciliation[20]                                         7.89841  (17 ms)
dataReconciliation[100]                                        37.0132  (59 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.451 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.262 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.030 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 379733 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 379.7 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 13851 ms, solved=true, gas=318849.57 kg/hr, water in/out=0.00027173922/1.5391249e-05
TEG recycle stripping gas recirc: solved=true, flow error=9.9210333e-05, composition error=0.0015789095
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00031074765
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.86 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.12.1 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.12.1.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  06:53 min
[INFO] Finished at: 2026-10-28T14:40:46Z
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
# Warmup Iteration   1: 16.536 ms/op
# Warmup Iteration   2: 11.643 ms/op
Iteration   1: 11.319 ms/op
Iteration   2: 11.529 ms/op
Iteration   3: 11.325 ms/op

# Run progress: 2.17% complete, ETA 00:08:51
# Fork: 2 of 2
# Warmup Iteration   1: 17.009 ms/op
# Warmup Iteration   2: 11.878 ms/op
Iteration   1: 11.687 ms/op
Iteration   2: 11.571 ms/op
Iteration   3: 11.614 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  11.508 ±(99.9%) 0.429 ms/op [Average]
  (min, avg, max) = (11.319, 11.508, 11.687), stdev = 0.153
  CI (99.9%): [11.079, 11.937] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:34
# Fork: 1 of 2
# Warmup Iteration   1: 2.302 ms/op
# Warmup Iteration   2: 1.423 ms/op
Iteration   1: 0.941 ms/op
Iteration   2: 0.945 ms/op
Iteration   3: 0.953 ms/op

# Run progress: 6.52% complete, ETA 00:08:22
# Fork: 2 of 2
# Warmup Iteration   1: 1.713 ms/op
# Warmup Iteration   2: 0.890 ms/op
Iteration   1: 0.889 ms/op
Iteration   2: 0.890 ms/op
Iteration   3: 0.892 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.919 ±(99.9%) 0.086 ms/op [Average]
  (min, avg, max) = (0.889, 0.919, 0.953), stdev = 0.031
  CI (99.9%): [0.832, 1.005] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 7.324 ms/op
# Warmup Iteration   2: 4.214 ms/op
Iteration   1: 3.882 ms/op
Iteration   2: 3.883 ms/op
Iteration   3: 3.885 ms/op

# Run progress: 10.87% complete, ETA 00:07:58
# Fork: 2 of 2
# Warmup Iteration   1: 7.537 ms/op
# Warmup Iteration   2: 4.049 ms/op
Iteration   1: 3.980 ms/op
Iteration   2: 3.962 ms/op
Iteration   3: 3.985 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  3.929 ±(99.9%) 0.143 ms/op [Average]
  (min, avg, max) = (3.882, 3.929, 3.985), stdev = 0.051
  CI (99.9%): [3.786, 4.073] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 7.495 ms/op
# Warmup Iteration   2: 4.401 ms/op
Iteration   1: 3.965 ms/op
Iteration   2: 3.997 ms/op
Iteration   3: 3.939 ms/op

# Run progress: 15.22% complete, ETA 00:07:33
# Fork: 2 of 2
# Warmup Iteration   1: 7.744 ms/op
# Warmup Iteration   2: 4.262 ms/op
Iteration   1: 3.959 ms/op
Iteration   2: 3.954 ms/op
Iteration   3: 3.990 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  3.967 ±(99.9%) 0.062 ms/op [Average]
  (min, avg, max) = (3.939, 3.967, 3.997), stdev = 0.022
  CI (99.9%): [3.905, 4.030] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 16.713 ms/op
# Warmup Iteration   2: 8.632 ms/op
Iteration   1: 7.482 ms/op
Iteration   2: 7.388 ms/op
Iteration   3: 7.515 ms/op

# Run progress: 19.57% complete, ETA 00:07:10
# Fork: 2 of 2
# Warmup Iteration   1: 16.147 ms/op
# Warmup Iteration   2: 8.999 ms/op
Iteration   1: 7.343 ms/op
Iteration   2: 7.288 ms/op
Iteration   3: 7.432 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  7.408 ±(99.9%) 0.239 ms/op [Average]
  (min, avg, max) = (7.288, 7.408, 7.515), stdev = 0.085
  CI (99.9%): [7.169, 7.647] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1256.255 ms/op
# Warmup Iteration   2: 533.911 ms/op
Iteration   1: 446.774 ms/op
Iteration   2: 321.879 ms/op
Iteration   3: 278.432 ms/op

# Run progress: 23.91% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 2015.273 ms/op
# Warmup Iteration   2: 502.806 ms/op
Iteration   1: 468.527 ms/op
Iteration   2: 308.639 ms/op
Iteration   3: 266.168 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  348.403 ±(99.9%) 244.624 ms/op [Average]
  (min, avg, max) = (266.168, 348.403, 468.527), stdev = 87.235
  CI (99.9%): [103.779, 593.027] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2536.836 ms/op
# Warmup Iteration   2: 836.083 ms/op
Iteration   1: 657.711 ms/op
Iteration   2: 564.686 ms/op
Iteration   3: 544.988 ms/op

# Run progress: 28.26% complete, ETA 00:06:23
# Fork: 2 of 2
# Warmup Iteration   1: 2499.356 ms/op
# Warmup Iteration   2: 841.600 ms/op
Iteration   1: 597.150 ms/op
Iteration   2: 541.145 ms/op
Iteration   3: 635.778 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  590.243 ±(99.9%) 136.139 ms/op [Average]
  (min, avg, max) = (541.145, 590.243, 657.711), stdev = 48.549
  CI (99.9%): [454.104, 726.382] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:13
# Fork: 1 of 2
# Warmup Iteration   1: 787.716 ms/op
# Warmup Iteration   2: 347.882 ms/op
Iteration   1: 322.506 ms/op
Iteration   2: 316.552 ms/op
Iteration   3: 317.170 ms/op

# Run progress: 32.61% complete, ETA 00:06:01
# Fork: 2 of 2
# Warmup Iteration   1: 1008.416 ms/op
# Warmup Iteration   2: 341.477 ms/op
Iteration   1: 317.877 ms/op
Iteration   2: 310.313 ms/op
Iteration   3: 314.155 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  316.429 ±(99.9%) 11.368 ms/op [Average]
  (min, avg, max) = (310.313, 316.429, 322.506), stdev = 4.054
  CI (99.9%): [305.061, 327.797] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:48
# Fork: 1 of 2
# Warmup Iteration   1: 2031.804 ms/op
# Warmup Iteration   2: 778.709 ms/op
Iteration   1: 758.452 ms/op
Iteration   2: 695.913 ms/op
Iteration   3: 726.508 ms/op

# Run progress: 36.96% complete, ETA 00:05:36
# Fork: 2 of 2
# Warmup Iteration   1: 1390.595 ms/op
# Warmup Iteration   2: 750.046 ms/op
Iteration   1: 742.301 ms/op
Iteration   2: 702.253 ms/op
Iteration   3: 710.768 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  722.699 ±(99.9%) 68.170 ms/op [Average]
  (min, avg, max) = (695.913, 722.699, 758.452), stdev = 24.310
  CI (99.9%): [654.529, 790.869] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:24
# Fork: 1 of 2
# Warmup Iteration   1: 0.133 ms/op
# Warmup Iteration   2: 0.074 ms/op
Iteration   1: 0.087 ms/op
Iteration   2: 0.064 ms/op
Iteration   3: 0.064 ms/op

# Run progress: 41.30% complete, ETA 00:05:11
# Fork: 2 of 2
# Warmup Iteration   1: 0.149 ms/op
# Warmup Iteration   2: 0.068 ms/op
Iteration   1: 0.066 ms/op
Iteration   2: 0.067 ms/op
Iteration   3: 0.066 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.069 ±(99.9%) 0.025 ms/op [Average]
  (min, avg, max) = (0.064, 0.069, 0.087), stdev = 0.009
  CI (99.9%): [0.044, 0.094] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:04:57
# Fork: 1 of 2
# Warmup Iteration   1: 7.373 ms/op
# Warmup Iteration   2: 4.999 ms/op
Iteration   1: 4.846 ms/op
Iteration   2: 4.797 ms/op
Iteration   3: 4.708 ms/op

# Run progress: 45.65% complete, ETA 00:04:44
# Fork: 2 of 2
# Warmup Iteration   1: 6.973 ms/op
# Warmup Iteration   2: 4.868 ms/op
Iteration   1: 4.824 ms/op
Iteration   2: 4.702 ms/op
Iteration   3: 4.727 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  4.767 ±(99.9%) 0.176 ms/op [Average]
  (min, avg, max) = (4.702, 4.767, 4.846), stdev = 0.063
  CI (99.9%): [4.592, 4.943] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:32
# Fork: 1 of 2
# Warmup Iteration   1: 0.578 ms/op
# Warmup Iteration   2: 0.339 ms/op
Iteration   1: 0.351 ms/op
Iteration   2: 0.341 ms/op
Iteration   3: 0.331 ms/op

# Run progress: 50.00% complete, ETA 00:04:19
# Fork: 2 of 2
# Warmup Iteration   1: 0.556 ms/op
# Warmup Iteration   2: 0.340 ms/op
Iteration   1: 0.340 ms/op
Iteration   2: 0.335 ms/op
Iteration   3: 0.339 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.340 ±(99.9%) 0.019 ms/op [Average]
  (min, avg, max) = (0.331, 0.340, 0.351), stdev = 0.007
  CI (99.9%): [0.321, 0.359] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:07
# Fork: 1 of 2
# Warmup Iteration   1: 1.338 ms/op
# Warmup Iteration   2: 0.947 ms/op
Iteration   1: 0.888 ms/op
Iteration   2: 0.873 ms/op
Iteration   3: 0.868 ms/op

# Run progress: 54.35% complete, ETA 00:03:55
# Fork: 2 of 2
# Warmup Iteration   1: 1.353 ms/op
# Warmup Iteration   2: 0.932 ms/op
Iteration   1: 0.903 ms/op
Iteration   2: 0.899 ms/op
Iteration   3: 0.869 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  0.883 ±(99.9%) 0.043 ms/op [Average]
  (min, avg, max) = (0.868, 0.883, 0.903), stdev = 0.015
  CI (99.9%): [0.840, 0.926] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:43
# Fork: 1 of 2
# Warmup Iteration   1: 127.064 ms/op
# Warmup Iteration   2: 26.270 ms/op
Iteration   1: 18.968 ms/op
Iteration   2: 17.214 ms/op
Iteration   3: 16.483 ms/op

# Run progress: 58.70% complete, ETA 00:03:31
# Fork: 2 of 2
# Warmup Iteration   1: 136.427 ms/op
# Warmup Iteration   2: 28.718 ms/op
Iteration   1: 19.975 ms/op
Iteration   2: 17.153 ms/op
Iteration   3: 17.257 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  17.842 ±(99.9%) 3.737 ms/op [Average]
  (min, avg, max) = (16.483, 17.842, 19.975), stdev = 1.333
  CI (99.9%): [14.105, 21.578] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:20
# Fork: 1 of 2
# Warmup Iteration   1: 58981.878 ms/op
# Warmup Iteration   2: 53741.002 ms/op
Iteration   1: 52274.509 ms/op
Iteration   2: 54098.861 ms/op
Iteration   3: 52554.464 ms/op

# Run progress: 63.04% complete, ETA 00:05:42
# Fork: 2 of 2
# Warmup Iteration   1: 56049.426 ms/op
# Warmup Iteration   2: 50982.884 ms/op
Iteration   1: 50270.923 ms/op
Iteration   2: 50664.097 ms/op
Iteration   3: 50233.864 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  51682.786 ±(99.9%) 4358.294 ms/op [Average]
  (min, avg, max) = (50233.864, 51682.786, 54098.861), stdev = 1554.210
  CI (99.9%): [47324.493, 56041.080] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:29
# Fork: 1 of 2
# Warmup Iteration   1: 5358.481 ms/op
# Warmup Iteration   2: 5578.463 ms/op
Iteration   1: 5617.982 ms/op
Iteration   2: 5437.682 ms/op
Iteration   3: 9846.491 ms/op

# Run progress: 67.39% complete, ETA 00:09:41
# Fork: 2 of 2
# Warmup Iteration   1: 5775.863 ms/op
# Warmup Iteration   2: 6024.977 ms/op
Iteration   1: 5773.716 ms/op
Iteration   2: 5685.778 ms/op
Iteration   3: 10182.706 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  7090.726 ±(99.9%) 6365.504 ms/op [Average]
  (min, avg, max) = (5437.682, 7090.726, 10182.706), stdev = 2270.000
  CI (99.9%): [725.222, 13456.230] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:11:26
# Fork: 1 of 2
# Warmup Iteration   1: 15022.637 ms/op
# Warmup Iteration   2: 11439.440 ms/op
Iteration   1: 10145.086 ms/op
Iteration   2: 10230.960 ms/op
Iteration   3: 9592.589 ms/op

# Run progress: 71.74% complete, ETA 00:10:40
# Fork: 2 of 2
# Warmup Iteration   1: 15431.131 ms/op
# Warmup Iteration   2: 11821.047 ms/op
Iteration   1: 9843.846 ms/op
Iteration   2: 9067.104 ms/op
Iteration   3: 8939.304 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  9636.481 ±(99.9%) 1519.060 ms/op [Average]
  (min, avg, max) = (8939.304, 9636.481, 10230.960), stdev = 541.712
  CI (99.9%): [8117.421, 11155.542] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:09:53
# Fork: 1 of 2
# Warmup Iteration   1: Oct 28, 2026 3:08:49 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 3:08:49 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
63.164 ms/op
# Warmup Iteration   2: 39.439 ms/op
Iteration   1: 36.738 ms/op
Iteration   2: 36.376 ms/op
Iteration   3: 37.998 ms/op

# Run progress: 76.09% complete, ETA 00:08:51
# Fork: 2 of 2
# Warmup Iteration   1: Oct 28, 2026 3:09:00 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 3:09:00 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
56.350 ms/op
# Warmup Iteration   2: 34.859 ms/op
Iteration   1: 33.195 ms/op
Iteration   2: 33.163 ms/op
Iteration   3: 35.575 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  35.508 ±(99.9%) 5.513 ms/op [Average]
  (min, avg, max) = (33.163, 35.508, 37.998), stdev = 1.966
  CI (99.9%): [29.995, 41.021] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:07:53
# Fork: 1 of 2
# Warmup Iteration   1: 92.401 ms/op
# Warmup Iteration   2: 46.743 ms/op
Iteration   1: 42.546 ms/op
Iteration   2: 43.734 ms/op
Iteration   3: 43.341 ms/op

# Run progress: 80.43% complete, ETA 00:06:57
# Fork: 2 of 2
# Warmup Iteration   1: 87.341 ms/op
# Warmup Iteration   2: 44.736 ms/op
Iteration   1: 43.954 ms/op
Iteration   2: 43.514 ms/op
Iteration   3: 43.415 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  43.417 ±(99.9%) 1.352 ms/op [Average]
  (min, avg, max) = (42.546, 43.417, 43.954), stdev = 0.482
  CI (99.9%): [42.065, 44.770] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:06:03
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

# Run progress: 86.96% complete, ETA 00:04:22
# Fork: 1 of 2
# Warmup Iteration   1: 0.700 ms/op
# Warmup Iteration   2: 0.423 ms/op
Iteration   1: 0.384 ms/op
Iteration   2: 0.394 ms/op
Iteration   3: 0.406 ms/op

# Run progress: 89.13% complete, ETA 00:03:34
# Fork: 2 of 2
# Warmup Iteration   1: 0.672 ms/op
# Warmup Iteration   2: 0.387 ms/op
Iteration   1: 0.375 ms/op
Iteration   2: 0.371 ms/op
Iteration   3: 0.367 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.383 ±(99.9%) 0.042 ms/op [Average]
  (min, avg, max) = (0.367, 0.383, 0.406), stdev = 0.015
  CI (99.9%): [0.340, 0.425] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 13.269 ms/op
# Warmup Iteration   2: 7.473 ms/op
Iteration   1: 7.952 ms/op
Iteration   2: 7.204 ms/op
Iteration   3: 6.988 ms/op

# Run progress: 93.48% complete, ETA 00:02:04
# Fork: 2 of 2
# Warmup Iteration   1: 14.785 ms/op
# Warmup Iteration   2: 9.363 ms/op
Iteration   1: 8.709 ms/op
Iteration   2: 8.165 ms/op
Iteration   3: 7.950 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  7.828 ±(99.9%) 1.780 ms/op [Average]
  (min, avg, max) = (6.988, 7.828, 8.709), stdev = 0.635
  CI (99.9%): [6.048, 9.609] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 23.787 ms/op
# Warmup Iteration   2: 18.286 ms/op
Iteration   1: 18.338 ms/op
Iteration   2: 17.855 ms/op
Iteration   3: 18.135 ms/op

# Run progress: 97.83% complete, ETA 00:00:40
# Fork: 2 of 2
# Warmup Iteration   1: 19.074 ms/op
# Warmup Iteration   2: 15.094 ms/op
Iteration   1: 14.811 ms/op
Iteration   2: 14.711 ms/op
Iteration   3: 14.632 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  16.414 ±(99.9%) 5.229 ms/op [Average]
  (min, avg, max) = (14.632, 16.414, 18.338), stdev = 1.865
  CI (99.9%): [11.185, 21.643] (assumes normal distribution)


# Run complete. Total time: 00:30:17

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     11.508 ±    0.429  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.919 ±    0.086  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      3.929 ±    0.143  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      3.967 ±    0.062  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      7.408 ±    0.239  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    348.403 ±  244.624  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    590.243 ±  136.139  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    316.429 ±   11.368  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    722.699 ±   68.170  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.069 ±    0.025  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      4.767 ±    0.176  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.340 ±    0.019  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      0.883 ±    0.043  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     17.842 ±    3.737  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  51682.786 ± 4358.294  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   7090.726 ± 6365.504  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   9636.481 ± 1519.060  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     35.508 ±    5.513  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     43.417 ±    1.352  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.383 ±    0.042  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      7.828 ±    1.780  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     16.414 ±    5.229  ms/op

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
[INFO] Total time:  0.953 s
[INFO] Finished at: 2026-10-28T15:11:06Z
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
tpFlashLeanGas                                                 60.0000  (30 ms)
tpFlashWellFluidSrk                                            83.6406  (89 ms)
tpFlashWellFluidPr                                             83.6541  (57 ms)
tpFlashWellFluidWithProperties                                 5445.46  (88 ms)
phAndPsFlashWellFluid                                          2459.23  (44 ms)
Oct 28, 2026 3:11:13 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 3:11:13 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (414 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (196 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (22 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (78 ms)
saturationPointsWellFluid                                      1601.32  (114 ms)
singlePhaseGasPipelineSteadyState                              121.628  (885 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1051 ms)
levenbergMarquardtAntoine                                      1837.31  (7 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (19 ms)
dataReconciliation[100]                                        37.0132  (68 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.818 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.931 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.026 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 363086 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 363.1 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 14975 ms, solved=true, gas=318849.57 kg/hr, water in/out=0.00027173922/1.5389968e-05
TEG recycle stripping gas recirc: solved=true, flow error=9.9035786e-05, composition error=0.0015761407
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=0.00030878453
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 14.98 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  06:40 min
[INFO] Finished at: 2026-10-28T15:17:48Z
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
# Warmup Iteration   1: 17.645 ms/op
# Warmup Iteration   2: 12.005 ms/op
Iteration   1: 11.620 ms/op
Iteration   2: 11.533 ms/op
Iteration   3: 11.648 ms/op

# Run progress: 2.17% complete, ETA 00:08:51
# Fork: 2 of 2
# Warmup Iteration   1: 16.822 ms/op
# Warmup Iteration   2: 11.494 ms/op
Iteration   1: 11.394 ms/op
Iteration   2: 11.398 ms/op
Iteration   3: 11.396 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  11.498 ±(99.9%) 0.331 ms/op [Average]
  (min, avg, max) = (11.394, 11.498, 11.648), stdev = 0.118
  CI (99.9%): [11.167, 11.829] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2.112 ms/op
# Warmup Iteration   2: 0.964 ms/op
Iteration   1: 0.914 ms/op
Iteration   2: 0.912 ms/op
Iteration   3: 0.911 ms/op

# Run progress: 6.52% complete, ETA 00:08:26
# Fork: 2 of 2
# Warmup Iteration   1: 2.315 ms/op
# Warmup Iteration   2: 1.176 ms/op
Iteration   1: 0.950 ms/op
Iteration   2: 0.905 ms/op
Iteration   3: 0.914 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.918 ±(99.9%) 0.045 ms/op [Average]
  (min, avg, max) = (0.905, 0.918, 0.950), stdev = 0.016
  CI (99.9%): [0.872, 0.963] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:15
# Fork: 1 of 2
# Warmup Iteration   1: 7.888 ms/op
# Warmup Iteration   2: 4.086 ms/op
Iteration   1: 3.962 ms/op
Iteration   2: 4.104 ms/op
Iteration   3: 3.866 ms/op

# Run progress: 10.87% complete, ETA 00:08:03
# Fork: 2 of 2
# Warmup Iteration   1: 8.598 ms/op
# Warmup Iteration   2: 4.581 ms/op
Iteration   1: 4.087 ms/op
Iteration   2: 4.169 ms/op
Iteration   3: 4.375 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.094 ±(99.9%) 0.493 ms/op [Average]
  (min, avg, max) = (3.866, 4.094, 4.375), stdev = 0.176
  CI (99.9%): [3.601, 4.586] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:51
# Fork: 1 of 2
# Warmup Iteration   1: 7.948 ms/op
# Warmup Iteration   2: 4.462 ms/op
Iteration   1: 4.005 ms/op
Iteration   2: 4.086 ms/op
Iteration   3: 3.911 ms/op

# Run progress: 15.22% complete, ETA 00:07:38
# Fork: 2 of 2
# Warmup Iteration   1: 7.613 ms/op
# Warmup Iteration   2: 4.638 ms/op
Iteration   1: 3.936 ms/op
Iteration   2: 3.886 ms/op
Iteration   3: 3.884 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  3.951 ±(99.9%) 0.224 ms/op [Average]
  (min, avg, max) = (3.884, 3.951, 4.086), stdev = 0.080
  CI (99.9%): [3.728, 4.175] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 17.440 ms/op
# Warmup Iteration   2: 9.489 ms/op
Iteration   1: 7.554 ms/op
Iteration   2: 7.587 ms/op
Iteration   3: 7.545 ms/op

# Run progress: 19.57% complete, ETA 00:07:14
# Fork: 2 of 2
# Warmup Iteration   1: 20.130 ms/op
# Warmup Iteration   2: 10.159 ms/op
Iteration   1: 7.546 ms/op
Iteration   2: 7.533 ms/op
Iteration   3: 7.633 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  7.566 ±(99.9%) 0.105 ms/op [Average]
  (min, avg, max) = (7.533, 7.566, 7.633), stdev = 0.038
  CI (99.9%): [7.461, 7.672] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:02
# Fork: 1 of 2
# Warmup Iteration   1: 1236.342 ms/op
# Warmup Iteration   2: 468.774 ms/op
Iteration   1: 416.470 ms/op
Iteration   2: 281.561 ms/op
Iteration   3: 254.489 ms/op

# Run progress: 23.91% complete, ETA 00:06:50
# Fork: 2 of 2
# Warmup Iteration   1: 1298.019 ms/op
# Warmup Iteration   2: 437.895 ms/op
Iteration   1: 304.597 ms/op
Iteration   2: 264.413 ms/op
Iteration   3: 307.598 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  304.855 ±(99.9%) 164.376 ms/op [Average]
  (min, avg, max) = (254.489, 304.855, 416.470), stdev = 58.618
  CI (99.9%): [140.479, 469.231] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:37
# Fork: 1 of 2
# Warmup Iteration   1: 7701.394 ms/op
# Warmup Iteration   2: 4569.650 ms/op
Iteration   1: 3662.439 ms/op
Iteration   2: 3513.854 ms/op
Iteration   3: 3446.178 ms/op

# Run progress: 28.26% complete, ETA 00:06:55
# Fork: 2 of 2
# Warmup Iteration   1: 6958.623 ms/op
# Warmup Iteration   2: 3956.184 ms/op
Iteration   1: 3475.881 ms/op
Iteration   2: 3407.858 ms/op
Iteration   3: 3387.234 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  3482.241 ±(99.9%) 278.649 ms/op [Average]
  (min, avg, max) = (3387.234, 3482.241, 3662.439), stdev = 99.369
  CI (99.9%): [3203.591, 3760.890] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:07:02
# Fork: 1 of 2
# Warmup Iteration   1: 1010.858 ms/op
# Warmup Iteration   2: 359.160 ms/op
Iteration   1: 323.685 ms/op
Iteration   2: 316.114 ms/op
Iteration   3: 306.207 ms/op

# Run progress: 32.61% complete, ETA 00:06:44
# Fork: 2 of 2
# Warmup Iteration   1: 771.832 ms/op
# Warmup Iteration   2: 341.714 ms/op
Iteration   1: 309.339 ms/op
Iteration   2: 311.892 ms/op
Iteration   3: 307.954 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  312.532 ±(99.9%) 18.121 ms/op [Average]
  (min, avg, max) = (306.207, 312.532, 323.685), stdev = 6.462
  CI (99.9%): [294.411, 330.652] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:28
# Fork: 1 of 2
# Warmup Iteration   1: 2127.114 ms/op
# Warmup Iteration   2: 818.744 ms/op
Iteration   1: 754.467 ms/op
Iteration   2: 700.560 ms/op
Iteration   3: 743.788 ms/op

# Run progress: 36.96% complete, ETA 00:06:12
# Fork: 2 of 2
# Warmup Iteration   1: 1405.568 ms/op
# Warmup Iteration   2: 782.134 ms/op
Iteration   1: 699.560 ms/op
Iteration   2: 692.570 ms/op
Iteration   3: 713.605 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  717.425 ±(99.9%) 72.074 ms/op [Average]
  (min, avg, max) = (692.570, 717.425, 754.467), stdev = 25.702
  CI (99.9%): [645.351, 789.499] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:58
# Fork: 1 of 2
# Warmup Iteration   1: 0.121 ms/op
# Warmup Iteration   2: 0.065 ms/op
Iteration   1: 0.064 ms/op
Iteration   2: 0.065 ms/op
Iteration   3: 0.065 ms/op

# Run progress: 41.30% complete, ETA 00:05:41
# Fork: 2 of 2
# Warmup Iteration   1: 0.123 ms/op
# Warmup Iteration   2: 0.065 ms/op
Iteration   1: 0.063 ms/op
Iteration   2: 0.064 ms/op
Iteration   3: 0.067 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.064 ±(99.9%) 0.003 ms/op [Average]
  (min, avg, max) = (0.063, 0.064, 0.067), stdev = 0.001
  CI (99.9%): [0.061, 0.068] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:25
# Fork: 1 of 2
# Warmup Iteration   1: 7.926 ms/op
# Warmup Iteration   2: 4.982 ms/op
Iteration   1: 4.758 ms/op
Iteration   2: 4.698 ms/op
Iteration   3: 4.721 ms/op

# Run progress: 45.65% complete, ETA 00:05:10
# Fork: 2 of 2
# Warmup Iteration   1: 7.500 ms/op
# Warmup Iteration   2: 4.852 ms/op
Iteration   1: 4.744 ms/op
Iteration   2: 4.708 ms/op
Iteration   3: 4.699 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  4.721 ±(99.9%) 0.069 ms/op [Average]
  (min, avg, max) = (4.698, 4.721, 4.758), stdev = 0.025
  CI (99.9%): [4.652, 4.791] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:55
# Fork: 1 of 2
# Warmup Iteration   1: 0.573 ms/op
# Warmup Iteration   2: 0.344 ms/op
Iteration   1: 0.335 ms/op
Iteration   2: 0.337 ms/op
Iteration   3: 0.330 ms/op

# Run progress: 50.00% complete, ETA 00:04:41
# Fork: 2 of 2
# Warmup Iteration   1: 0.544 ms/op
# Warmup Iteration   2: 0.354 ms/op
Iteration   1: 0.346 ms/op
Iteration   2: 0.343 ms/op
Iteration   3: 0.340 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.338 ±(99.9%) 0.017 ms/op [Average]
  (min, avg, max) = (0.330, 0.338, 0.346), stdev = 0.006
  CI (99.9%): [0.322, 0.355] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:27
# Fork: 1 of 2
# Warmup Iteration   1: 1.301 ms/op
# Warmup Iteration   2: 0.934 ms/op
Iteration   1: 0.872 ms/op
Iteration   2: 0.867 ms/op
Iteration   3: 0.862 ms/op

# Run progress: 54.35% complete, ETA 00:04:13
# Fork: 2 of 2
# Warmup Iteration   1: 1.352 ms/op
# Warmup Iteration   2: 0.947 ms/op
Iteration   1: 0.877 ms/op
Iteration   2: 0.859 ms/op
Iteration   3: 0.865 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  0.867 ±(99.9%) 0.018 ms/op [Average]
  (min, avg, max) = (0.859, 0.867, 0.877), stdev = 0.006
  CI (99.9%): [0.849, 0.885] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:04:00
# Fork: 1 of 2
# Warmup Iteration   1: 185.211 ms/op
# Warmup Iteration   2: 33.373 ms/op
Iteration   1: 23.763 ms/op
Iteration   2: 19.336 ms/op
Iteration   3: 18.565 ms/op

# Run progress: 58.70% complete, ETA 00:03:46
# Fork: 2 of 2
# Warmup Iteration   1: 145.448 ms/op
# Warmup Iteration   2: 32.013 ms/op
Iteration   1: 21.099 ms/op
Iteration   2: 18.192 ms/op
Iteration   3: 17.874 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  19.805 ±(99.9%) 6.323 ms/op [Average]
  (min, avg, max) = (17.874, 19.805, 23.763), stdev = 2.255
  CI (99.9%): [13.481, 26.128] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 54798.346 ms/op
# Warmup Iteration   2: 49521.826 ms/op
Iteration   1: 49759.879 ms/op
Iteration   2: 50043.152 ms/op
Iteration   3: 49633.416 ms/op

# Run progress: 63.04% complete, ETA 00:05:44
# Fork: 2 of 2
# Warmup Iteration   1: 55346.455 ms/op
# Warmup Iteration   2: 51328.654 ms/op
Iteration   1: 49905.194 ms/op
Iteration   2: 49476.766 ms/op
Iteration   3: 50381.023 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  49866.572 ±(99.9%) 899.988 ms/op [Average]
  (min, avg, max) = (49476.766, 49866.572, 50381.023), stdev = 320.944
  CI (99.9%): [48966.584, 50766.559] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:31
# Fork: 1 of 2
# Warmup Iteration   1: 5332.257 ms/op
# Warmup Iteration   2: 5744.636 ms/op
Iteration   1: 5460.561 ms/op
Iteration   2: 5268.988 ms/op
Iteration   3: 9524.154 ms/op

# Run progress: 67.39% complete, ETA 00:09:39
# Fork: 2 of 2
# Warmup Iteration   1: 5214.374 ms/op
# Warmup Iteration   2: 5667.556 ms/op
Iteration   1: 5527.218 ms/op
Iteration   2: 5314.429 ms/op
Iteration   3: 9517.091 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  6768.740 ±(99.9%) 5983.207 ms/op [Average]
  (min, avg, max) = (5268.988, 6768.740, 9524.154), stdev = 2133.669
  CI (99.9%): [785.533, 12751.947] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:11:18
# Fork: 1 of 2
# Warmup Iteration   1: 16548.792 ms/op
# Warmup Iteration   2: 11612.382 ms/op
Iteration   1: 12010.504 ms/op
Iteration   2: 9976.141 ms/op
Iteration   3: 10527.437 ms/op

# Run progress: 71.74% complete, ETA 00:10:35
# Fork: 2 of 2
# Warmup Iteration   1: 15880.228 ms/op
# Warmup Iteration   2: 11509.567 ms/op
Iteration   1: 10726.011 ms/op
Iteration   2: 9447.725 ms/op
Iteration   3: 9455.998 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  10357.303 ±(99.9%) 2713.819 ms/op [Average]
  (min, avg, max) = (9447.725, 10357.303, 12010.504), stdev = 967.774
  CI (99.9%): [7643.484, 13071.121] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: Oct 28, 2026 3:45:39 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 3:45:39 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
59.412 ms/op
# Warmup Iteration   2: 35.181 ms/op
Iteration   1: 34.648 ms/op
Iteration   2: 33.583 ms/op
Iteration   3: 33.887 ms/op

# Run progress: 76.09% complete, ETA 00:08:48
# Fork: 2 of 2
# Warmup Iteration   1: Oct 28, 2026 3:45:50 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 28, 2026 3:45:50 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
56.155 ms/op
# Warmup Iteration   2: 35.220 ms/op
Iteration   1: 33.719 ms/op
Iteration   2: 33.474 ms/op
Iteration   3: 34.223 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  33.922 ±(99.9%) 1.239 ms/op [Average]
  (min, avg, max) = (33.474, 33.922, 34.648), stdev = 0.442
  CI (99.9%): [32.684, 35.161] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:07:50
# Fork: 1 of 2
# Warmup Iteration   1: 95.568 ms/op
# Warmup Iteration   2: 46.989 ms/op
Iteration   1: 45.751 ms/op
Iteration   2: 45.699 ms/op
Iteration   3: 45.201 ms/op

# Run progress: 80.43% complete, ETA 00:06:54
# Fork: 2 of 2
# Warmup Iteration   1: 113.399 ms/op
# Warmup Iteration   2: 47.621 ms/op
Iteration   1: 45.033 ms/op
Iteration   2: 47.002 ms/op
Iteration   3: 45.203 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  45.648 ±(99.9%) 2.032 ms/op [Average]
  (min, avg, max) = (45.033, 45.648, 47.002), stdev = 0.724
  CI (99.9%): [43.616, 47.680] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:06:01
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
# Warmup Iteration   1: 0.829 ms/op
# Warmup Iteration   2: 0.400 ms/op
Iteration   1: 0.392 ms/op
Iteration   2: 0.401 ms/op
Iteration   3: 0.383 ms/op

# Run progress: 89.13% complete, ETA 00:03:33
# Fork: 2 of 2
# Warmup Iteration   1: 0.765 ms/op
# Warmup Iteration   2: 0.409 ms/op
Iteration   1: 0.396 ms/op
Iteration   2: 0.384 ms/op
Iteration   3: 0.381 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.390 ±(99.9%) 0.022 ms/op [Average]
  (min, avg, max) = (0.381, 0.390, 0.401), stdev = 0.008
  CI (99.9%): [0.367, 0.412] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 15.315 ms/op
# Warmup Iteration   2: 8.945 ms/op
Iteration   1: 8.973 ms/op
Iteration   2: 8.361 ms/op
Iteration   3: 8.214 ms/op

# Run progress: 93.48% complete, ETA 00:02:03
# Fork: 2 of 2
# Warmup Iteration   1: 14.235 ms/op
# Warmup Iteration   2: 8.642 ms/op
Iteration   1: 7.989 ms/op
Iteration   2: 7.318 ms/op
Iteration   3: 7.331 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  8.031 ±(99.9%) 1.787 ms/op [Average]
  (min, avg, max) = (7.318, 8.031, 8.973), stdev = 0.637
  CI (99.9%): [6.244, 9.819] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 23.351 ms/op
# Warmup Iteration   2: 19.258 ms/op
Iteration   1: 18.521 ms/op
Iteration   2: 18.518 ms/op
Iteration   3: 18.930 ms/op

# Run progress: 97.83% complete, ETA 00:00:39
# Fork: 2 of 2
# Warmup Iteration   1: 20.969 ms/op
# Warmup Iteration   2: 14.899 ms/op
Iteration   1: 14.847 ms/op
Iteration   2: 14.836 ms/op
Iteration   3: 14.815 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  16.744 ±(99.9%) 5.888 ms/op [Average]
  (min, avg, max) = (14.815, 16.744, 18.930), stdev = 2.100
  CI (99.9%): [10.857, 22.632] (assumes normal distribution)


# Run complete. Total time: 00:30:06

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     11.498 ±    0.331  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.918 ±    0.045  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.094 ±    0.493  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      3.951 ±    0.224  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      7.566 ±    0.105  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    304.855 ±  164.376  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   3482.241 ±  278.649  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    312.532 ±   18.121  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    717.425 ±   72.074  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.064 ±    0.003  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      4.721 ±    0.069  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.338 ±    0.017  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      0.867 ±    0.018  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     19.805 ±    6.323  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  49866.572 ±  899.988  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   6768.740 ± 5983.207  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  10357.303 ± 2713.819  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     33.922 ±    1.239  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     45.648 ±    2.032  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.390 ±    0.022  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      8.031 ±    1.787  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     16.744 ±    5.888  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.12.1 -> 3.13.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 14 lower, 9 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.TPflash_UMR.testFlash_UMR | 590.243 | 3482.24 | +489.97% | Separate CIs |
| flash.TPflash.testFlash | 348.403 | 304.855 | -12.50% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 17.8417 | 19.8047 | +11.00% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 9636.48 | 10357.3 | +7.48% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0691747 | 0.0644674 | -6.80% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 43.4174 | 45.648 | +5.14% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 7090.73 | 6768.74 | -4.54% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 35.5076 | 33.9223 | -4.46% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 3.92946 | 4.09395 | +4.19% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 51682.8 | 49866.6 | -3.51% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
