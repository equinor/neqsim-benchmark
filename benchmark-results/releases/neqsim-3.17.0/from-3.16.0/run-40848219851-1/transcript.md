# NeqSim 3.17.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.16.0 |
| Current | 3.17.0 |
| Source commit | `620d4a782d155bbe37b83366bd42fad62f1419a5` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40848219851) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "620d4a782d155bbe37b83366bd42fad62f1419a5",
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
[INFO] Total time:  8.272 s
[INFO] Finished at: 2026-10-29T09:15:53Z
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
tpFlashLeanGas                                                 60.0000  (31 ms)
tpFlashWellFluidSrk                                            83.6406  (99 ms)
tpFlashWellFluidPr                                             83.6541  (56 ms)
tpFlashWellFluidWithProperties                                 5445.46  (102 ms)
phAndPsFlashWellFluid                                          2459.23  (73 ms)
Oct 29, 2026 9:16:05 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 9:16:05 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (545 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (225 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (38 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (63 ms)
saturationPointsWellFluid                                      1601.32  (117 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1292 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1078 ms)
levenbergMarquardtAntoine                                      1837.31  (10 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (18 ms)
dataReconciliation[100]                                        37.0132  (43 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.203 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.100 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.028 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 329062 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 329.1 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 13538 ms, solved=true, gas=318849.56 kg/hr, water in/out=0.00027104531/1.5353072e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018484305, composition error=0.0029102350
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00013837326
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.54 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  06:13 min
[INFO] Finished at: 2026-10-29T09:22:08Z
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
# Warmup Iteration   1: 17.891 ms/op
# Warmup Iteration   2: 12.013 ms/op
Iteration   1: 11.373 ms/op
Iteration   2: 11.908 ms/op
Iteration   3: 11.979 ms/op

# Run progress: 2.17% complete, ETA 00:08:55
# Fork: 2 of 2
# Warmup Iteration   1: 16.267 ms/op
# Warmup Iteration   2: 11.719 ms/op
Iteration   1: 11.243 ms/op
Iteration   2: 11.886 ms/op
Iteration   3: 11.420 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  11.635 ±(99.9%) 0.908 ms/op [Average]
  (min, avg, max) = (11.243, 11.635, 11.979), stdev = 0.324
  CI (99.9%): [10.727, 12.543] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:39
# Fork: 1 of 2
# Warmup Iteration   1: 2.042 ms/op
# Warmup Iteration   2: 0.999 ms/op
Iteration   1: 0.934 ms/op
Iteration   2: 0.891 ms/op
Iteration   3: 0.898 ms/op

# Run progress: 6.52% complete, ETA 00:08:26
# Fork: 2 of 2
# Warmup Iteration   1: 2.229 ms/op
# Warmup Iteration   2: 1.368 ms/op
Iteration   1: 0.918 ms/op
Iteration   2: 0.890 ms/op
Iteration   3: 0.910 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.907 ±(99.9%) 0.049 ms/op [Average]
  (min, avg, max) = (0.890, 0.907, 0.934), stdev = 0.017
  CI (99.9%): [0.858, 0.955] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:14
# Fork: 1 of 2
# Warmup Iteration   1: 7.629 ms/op
# Warmup Iteration   2: 4.157 ms/op
Iteration   1: 4.057 ms/op
Iteration   2: 4.359 ms/op
Iteration   3: 3.979 ms/op

# Run progress: 10.87% complete, ETA 00:08:01
# Fork: 2 of 2
# Warmup Iteration   1: 8.295 ms/op
# Warmup Iteration   2: 4.579 ms/op
Iteration   1: 4.048 ms/op
Iteration   2: 4.186 ms/op
Iteration   3: 4.026 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.109 ±(99.9%) 0.393 ms/op [Average]
  (min, avg, max) = (3.979, 4.109, 4.359), stdev = 0.140
  CI (99.9%): [3.716, 4.502] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 7.931 ms/op
# Warmup Iteration   2: 4.631 ms/op
Iteration   1: 4.050 ms/op
Iteration   2: 4.055 ms/op
Iteration   3: 3.979 ms/op

# Run progress: 15.22% complete, ETA 00:07:37
# Fork: 2 of 2
# Warmup Iteration   1: 8.148 ms/op
# Warmup Iteration   2: 4.101 ms/op
Iteration   1: 3.756 ms/op
Iteration   2: 3.787 ms/op
Iteration   3: 3.749 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  3.896 ±(99.9%) 0.413 ms/op [Average]
  (min, avg, max) = (3.749, 3.896, 4.055), stdev = 0.147
  CI (99.9%): [3.483, 4.309] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:25
# Fork: 1 of 2
# Warmup Iteration   1: 17.331 ms/op
# Warmup Iteration   2: 8.638 ms/op
Iteration   1: 7.315 ms/op
Iteration   2: 7.073 ms/op
Iteration   3: 7.342 ms/op

# Run progress: 19.57% complete, ETA 00:07:13
# Fork: 2 of 2
# Warmup Iteration   1: 17.438 ms/op
# Warmup Iteration   2: 8.742 ms/op
Iteration   1: 7.292 ms/op
Iteration   2: 7.275 ms/op
Iteration   3: 7.243 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  7.257 ±(99.9%) 0.270 ms/op [Average]
  (min, avg, max) = (7.073, 7.257, 7.342), stdev = 0.096
  CI (99.9%): [6.987, 7.527] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:01
# Fork: 1 of 2
# Warmup Iteration   1: 1258.574 ms/op
# Warmup Iteration   2: 437.402 ms/op
Iteration   1: 290.240 ms/op
Iteration   2: 265.296 ms/op
Iteration   3: 311.489 ms/op

# Run progress: 23.91% complete, ETA 00:06:48
# Fork: 2 of 2
# Warmup Iteration   1: 1271.386 ms/op
# Warmup Iteration   2: 508.390 ms/op
Iteration   1: 406.276 ms/op
Iteration   2: 293.941 ms/op
Iteration   3: 286.933 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  309.029 ±(99.9%) 139.897 ms/op [Average]
  (min, avg, max) = (265.296, 309.029, 406.276), stdev = 49.889
  CI (99.9%): [169.132, 448.927] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:34
# Fork: 1 of 2
# Warmup Iteration   1: 7294.073 ms/op
# Warmup Iteration   2: 4093.299 ms/op
Iteration   1: 3754.673 ms/op
Iteration   2: 3586.375 ms/op
Iteration   3: 3608.211 ms/op

# Run progress: 28.26% complete, ETA 00:06:50
# Fork: 2 of 2
# Warmup Iteration   1: 7249.334 ms/op
# Warmup Iteration   2: 5065.834 ms/op
Iteration   1: 3562.728 ms/op
Iteration   2: 3503.965 ms/op
Iteration   3: 3466.431 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  3580.397 ±(99.9%) 281.325 ms/op [Average]
  (min, avg, max) = (3466.431, 3580.397, 3754.673), stdev = 100.323
  CI (99.9%): [3299.072, 3861.722] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1044.988 ms/op
# Warmup Iteration   2: 389.060 ms/op
Iteration   1: 349.679 ms/op
Iteration   2: 327.713 ms/op
Iteration   3: 330.413 ms/op

# Run progress: 32.61% complete, ETA 00:06:45
# Fork: 2 of 2
# Warmup Iteration   1: 1056.734 ms/op
# Warmup Iteration   2: 366.157 ms/op
Iteration   1: 345.224 ms/op
Iteration   2: 325.046 ms/op
Iteration   3: 322.036 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  333.352 ±(99.9%) 31.849 ms/op [Average]
  (min, avg, max) = (322.036, 333.352, 349.679), stdev = 11.358
  CI (99.9%): [301.502, 365.201] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:29
# Fork: 1 of 2
# Warmup Iteration   1: 2302.902 ms/op
# Warmup Iteration   2: 807.119 ms/op
Iteration   1: 782.211 ms/op
Iteration   2: 734.100 ms/op
Iteration   3: 768.717 ms/op

# Run progress: 36.96% complete, ETA 00:06:14
# Fork: 2 of 2
# Warmup Iteration   1: 2476.419 ms/op
# Warmup Iteration   2: 830.509 ms/op
Iteration   1: 779.376 ms/op
Iteration   2: 720.491 ms/op
Iteration   3: 758.069 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  757.161 ±(99.9%) 70.182 ms/op [Average]
  (min, avg, max) = (720.491, 757.161, 782.211), stdev = 25.027
  CI (99.9%): [686.979, 827.342] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:59
# Fork: 1 of 2
# Warmup Iteration   1: 0.151 ms/op
# Warmup Iteration   2: 0.067 ms/op
Iteration   1: 0.068 ms/op
Iteration   2: 0.066 ms/op
Iteration   3: 0.067 ms/op

# Run progress: 41.30% complete, ETA 00:05:43
# Fork: 2 of 2
# Warmup Iteration   1: 0.151 ms/op
# Warmup Iteration   2: 0.070 ms/op
Iteration   1: 0.068 ms/op
Iteration   2: 0.069 ms/op
Iteration   3: 0.067 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.067 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.066, 0.067, 0.069), stdev = 0.001
  CI (99.9%): [0.065, 0.069] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:27
# Fork: 1 of 2
# Warmup Iteration   1: 8.042 ms/op
# Warmup Iteration   2: 5.003 ms/op
Iteration   1: 4.930 ms/op
Iteration   2: 4.843 ms/op
Iteration   3: 4.778 ms/op

# Run progress: 45.65% complete, ETA 00:05:12
# Fork: 2 of 2
# Warmup Iteration   1: 7.834 ms/op
# Warmup Iteration   2: 4.998 ms/op
Iteration   1: 4.842 ms/op
Iteration   2: 4.880 ms/op
Iteration   3: 4.847 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  4.853 ±(99.9%) 0.141 ms/op [Average]
  (min, avg, max) = (4.778, 4.853, 4.930), stdev = 0.050
  CI (99.9%): [4.713, 4.994] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:57
# Fork: 1 of 2
# Warmup Iteration   1: 0.604 ms/op
# Warmup Iteration   2: 0.343 ms/op
Iteration   1: 0.346 ms/op
Iteration   2: 0.353 ms/op
Iteration   3: 0.340 ms/op

# Run progress: 50.00% complete, ETA 00:04:42
# Fork: 2 of 2
# Warmup Iteration   1: 0.600 ms/op
# Warmup Iteration   2: 0.348 ms/op
Iteration   1: 0.351 ms/op
Iteration   2: 0.343 ms/op
Iteration   3: 0.344 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.346 ±(99.9%) 0.013 ms/op [Average]
  (min, avg, max) = (0.340, 0.346, 0.353), stdev = 0.005
  CI (99.9%): [0.333, 0.360] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:28
# Fork: 1 of 2
# Warmup Iteration   1: 1.375 ms/op
# Warmup Iteration   2: 0.951 ms/op
Iteration   1: 0.911 ms/op
Iteration   2: 0.868 ms/op
Iteration   3: 0.869 ms/op

# Run progress: 54.35% complete, ETA 00:04:14
# Fork: 2 of 2
# Warmup Iteration   1: 1.454 ms/op
# Warmup Iteration   2: 0.944 ms/op
Iteration   1: 0.893 ms/op
Iteration   2: 0.893 ms/op
Iteration   3: 0.896 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  0.888 ±(99.9%) 0.047 ms/op [Average]
  (min, avg, max) = (0.868, 0.888, 0.911), stdev = 0.017
  CI (99.9%): [0.841, 0.935] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:04:01
# Fork: 1 of 2
# Warmup Iteration   1: 204.619 ms/op
# Warmup Iteration   2: 34.219 ms/op
Iteration   1: 23.607 ms/op
Iteration   2: 19.980 ms/op
Iteration   3: 20.004 ms/op

# Run progress: 58.70% complete, ETA 00:03:47
# Fork: 2 of 2
# Warmup Iteration   1: 154.469 ms/op
# Warmup Iteration   2: 40.135 ms/op
Iteration   1: 23.378 ms/op
Iteration   2: 19.728 ms/op
Iteration   3: 18.667 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  20.894 ±(99.9%) 5.812 ms/op [Average]
  (min, avg, max) = (18.667, 20.894, 23.607), stdev = 2.072
  CI (99.9%): [15.082, 26.706] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:34
# Fork: 1 of 2
# Warmup Iteration   1: 55846.746 ms/op
# Warmup Iteration   2: 51768.635 ms/op
Iteration   1: 51435.596 ms/op
Iteration   2: 51315.420 ms/op
Iteration   3: 51526.929 ms/op

# Run progress: 63.04% complete, ETA 00:05:50
# Fork: 2 of 2
# Warmup Iteration   1: 54924.218 ms/op
# Warmup Iteration   2: 49325.870 ms/op
Iteration   1: 49271.016 ms/op
Iteration   2: 49583.653 ms/op
Iteration   3: 49044.857 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  50362.912 ±(99.9%) 3305.995 ms/op [Average]
  (min, avg, max) = (49044.857, 50362.912, 51526.929), stdev = 1178.950
  CI (99.9%): [47056.917, 53668.907] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:33
# Fork: 1 of 2
# Warmup Iteration   1: 6393.287 ms/op
# Warmup Iteration   2: 5576.466 ms/op
Iteration   1: 6870.979 ms/op
Iteration   2: 5287.994 ms/op
Iteration   3: 7601.827 ms/op

# Run progress: 67.39% complete, ETA 00:09:23
# Fork: 2 of 2
# Warmup Iteration   1: 6514.817 ms/op
# Warmup Iteration   2: 5609.734 ms/op
Iteration   1: 7122.146 ms/op
Iteration   2: 5416.745 ms/op
Iteration   3: 7594.780 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  6649.079 ±(99.9%) 2926.666 ms/op [Average]
  (min, avg, max) = (5287.994, 6649.079, 7601.827), stdev = 1043.677
  CI (99.9%): [3722.413, 9575.744] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:10:46
# Fork: 1 of 2
# Warmup Iteration   1: 12740.408 ms/op
# Warmup Iteration   2: 10097.684 ms/op
Iteration   1: 8209.113 ms/op
Iteration   2: 8048.321 ms/op
Iteration   3: 8075.101 ms/op

# Run progress: 71.74% complete, ETA 00:10:00
# Fork: 2 of 2
# Warmup Iteration   1: 15326.761 ms/op
# Warmup Iteration   2: 9300.379 ms/op
Iteration   1: 8548.545 ms/op
Iteration   2: 8198.864 ms/op
Iteration   3: 8303.224 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  8230.528 ±(99.9%) 509.773 ms/op [Average]
  (min, avg, max) = (8048.321, 8230.528, 8548.545), stdev = 181.790
  CI (99.9%): [7720.755, 8740.301] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:09:15
# Fork: 1 of 2
# Warmup Iteration   1: Oct 29, 2026 9:48:25 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 9:48:25 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
72.615 ms/op
# Warmup Iteration   2: 36.950 ms/op
Iteration   1: 36.052 ms/op
Iteration   2: 35.835 ms/op
Iteration   3: 34.697 ms/op

# Run progress: 76.09% complete, ETA 00:08:18
# Fork: 2 of 2
# Warmup Iteration   1: Oct 29, 2026 9:48:37 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 9:48:37 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
71.696 ms/op
# Warmup Iteration   2: 39.965 ms/op
Iteration   1: 38.761 ms/op
Iteration   2: 37.869 ms/op
Iteration   3: 38.155 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  36.895 ±(99.9%) 4.466 ms/op [Average]
  (min, avg, max) = (34.697, 36.895, 38.761), stdev = 1.593
  CI (99.9%): [32.429, 41.361] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:07:23
# Fork: 1 of 2
# Warmup Iteration   1: 106.650 ms/op
# Warmup Iteration   2: 58.185 ms/op
Iteration   1: 43.166 ms/op
Iteration   2: 43.216 ms/op
Iteration   3: 43.730 ms/op

# Run progress: 80.43% complete, ETA 00:06:31
# Fork: 2 of 2
# Warmup Iteration   1: 81.960 ms/op
# Warmup Iteration   2: 47.389 ms/op
Iteration   1: 47.664 ms/op
Iteration   2: 46.722 ms/op
Iteration   3: 45.776 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  45.046 ±(99.9%) 5.439 ms/op [Average]
  (min, avg, max) = (43.166, 45.046, 47.664), stdev = 1.940
  CI (99.9%): [39.607, 50.485] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:05:41
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:53
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

# Run progress: 86.96% complete, ETA 00:04:06
# Fork: 1 of 2
# Warmup Iteration   1: 0.792 ms/op
# Warmup Iteration   2: 0.419 ms/op
Iteration   1: 0.400 ms/op
Iteration   2: 0.386 ms/op
Iteration   3: 0.388 ms/op

# Run progress: 89.13% complete, ETA 00:03:21
# Fork: 2 of 2
# Warmup Iteration   1: 0.767 ms/op
# Warmup Iteration   2: 0.410 ms/op
Iteration   1: 0.376 ms/op
Iteration   2: 0.378 ms/op
Iteration   3: 0.374 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.384 ±(99.9%) 0.027 ms/op [Average]
  (min, avg, max) = (0.374, 0.384, 0.400), stdev = 0.010
  CI (99.9%): [0.357, 0.411] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:38
# Fork: 1 of 2
# Warmup Iteration   1: 16.029 ms/op
# Warmup Iteration   2: 9.160 ms/op
Iteration   1: 9.267 ms/op
Iteration   2: 9.189 ms/op
Iteration   3: 8.918 ms/op

# Run progress: 93.48% complete, ETA 00:01:57
# Fork: 2 of 2
# Warmup Iteration   1: 14.315 ms/op
# Warmup Iteration   2: 8.685 ms/op
Iteration   1: 8.410 ms/op
Iteration   2: 7.491 ms/op
Iteration   3: 7.499 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  8.462 ±(99.9%) 2.264 ms/op [Average]
  (min, avg, max) = (7.491, 8.462, 9.267), stdev = 0.807
  CI (99.9%): [6.198, 10.726] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 19.147 ms/op
# Warmup Iteration   2: 15.839 ms/op
Iteration   1: 15.628 ms/op
Iteration   2: 15.536 ms/op
Iteration   3: 15.465 ms/op

# Run progress: 97.83% complete, ETA 00:00:37
# Fork: 2 of 2
# Warmup Iteration   1: 27.871 ms/op
# Warmup Iteration   2: 19.772 ms/op
Iteration   1: 18.528 ms/op
Iteration   2: 18.744 ms/op
Iteration   3: 18.544 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  17.074 ±(99.9%) 4.711 ms/op [Average]
  (min, avg, max) = (15.465, 17.074, 18.744), stdev = 1.680
  CI (99.9%): [12.364, 21.785] (assumes normal distribution)


# Run complete. Total time: 00:28:33

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     11.635 ±    0.908  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.907 ±    0.049  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.109 ±    0.393  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      3.896 ±    0.413  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      7.257 ±    0.270  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    309.029 ±  139.897  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   3580.397 ±  281.325  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    333.352 ±   31.849  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    757.161 ±   70.182  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.067 ±    0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      4.853 ±    0.141  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.346 ±    0.013  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      0.888 ±    0.047  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     20.894 ±    5.812  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  50362.912 ± 3305.995  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   6649.079 ± 2926.666  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   8230.528 ±  509.773  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     36.895 ±    4.466  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     45.046 ±    5.439  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.384 ±    0.027  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      8.462 ±    2.264  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     17.074 ±    4.711  ms/op

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
[INFO] Total time:  2.691 s
[INFO] Finished at: 2026-10-29T09:50:46Z
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
tpFlashLeanGas                                                 60.0000  (46 ms)
tpFlashWellFluidSrk                                            83.6406  (107 ms)
tpFlashWellFluidPr                                             83.6541  (53 ms)
tpFlashWellFluidWithProperties                                 5445.46  (88 ms)
phAndPsFlashWellFluid                                          2459.23  (58 ms)
Oct 29, 2026 9:50:55 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 9:50:55 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (429 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (253 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (37 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (43 ms)
saturationPointsWellFluid                                      1601.32  (115 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1069 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1068 ms)
levenbergMarquardtAntoine                                      1837.31  (9 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (16 ms)
dataReconciliation[100]                                        37.0132  (48 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.650 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.870 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.026 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 179988 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 180.0 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 16001 ms, solved=true, gas=318849.56 kg/hr, water in/out=0.00027104531/1.5353073e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018484308, composition error=0.0029102354
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00013837322
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 16.01 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  03:40 min
[INFO] Finished at: 2026-10-29T09:54:28Z
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
# Warmup Iteration   1: 17.904 ms/op
# Warmup Iteration   2: 11.821 ms/op
Iteration   1: 11.592 ms/op
Iteration   2: 11.379 ms/op
Iteration   3: 11.342 ms/op

# Run progress: 2.17% complete, ETA 00:08:41
# Fork: 2 of 2
# Warmup Iteration   1: 17.498 ms/op
# Warmup Iteration   2: 11.726 ms/op
Iteration   1: 11.482 ms/op
Iteration   2: 11.413 ms/op
Iteration   3: 11.525 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  11.456 ±(99.9%) 0.266 ms/op [Average]
  (min, avg, max) = (11.342, 11.456, 11.592), stdev = 0.095
  CI (99.9%): [11.190, 11.721] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.954 ms/op
# Warmup Iteration   2: 0.955 ms/op
Iteration   1: 0.830 ms/op
Iteration   2: 0.827 ms/op
Iteration   3: 0.844 ms/op

# Run progress: 6.52% complete, ETA 00:08:17
# Fork: 2 of 2
# Warmup Iteration   1: 2.239 ms/op
# Warmup Iteration   2: 1.187 ms/op
Iteration   1: 0.927 ms/op
Iteration   2: 0.943 ms/op
Iteration   3: 0.961 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.889 ±(99.9%) 0.173 ms/op [Average]
  (min, avg, max) = (0.827, 0.889, 0.961), stdev = 0.062
  CI (99.9%): [0.716, 1.062] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:04
# Fork: 1 of 2
# Warmup Iteration   1: 8.100 ms/op
# Warmup Iteration   2: 4.883 ms/op
Iteration   1: 4.112 ms/op
Iteration   2: 4.109 ms/op
Iteration   3: 4.058 ms/op

# Run progress: 10.87% complete, ETA 00:07:52
# Fork: 2 of 2
# Warmup Iteration   1: 8.555 ms/op
# Warmup Iteration   2: 4.398 ms/op
Iteration   1: 4.030 ms/op
Iteration   2: 3.939 ms/op
Iteration   3: 3.883 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.022 ±(99.9%) 0.260 ms/op [Average]
  (min, avg, max) = (3.883, 4.022, 4.112), stdev = 0.093
  CI (99.9%): [3.762, 4.282] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:41
# Fork: 1 of 2
# Warmup Iteration   1: 7.154 ms/op
# Warmup Iteration   2: 4.572 ms/op
Iteration   1: 4.071 ms/op
Iteration   2: 4.086 ms/op
Iteration   3: 3.914 ms/op

# Run progress: 15.22% complete, ETA 00:07:29
# Fork: 2 of 2
# Warmup Iteration   1: 8.100 ms/op
# Warmup Iteration   2: 4.433 ms/op
Iteration   1: 4.056 ms/op
Iteration   2: 4.048 ms/op
Iteration   3: 3.988 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  4.027 ±(99.9%) 0.181 ms/op [Average]
  (min, avg, max) = (3.914, 4.027, 4.086), stdev = 0.065
  CI (99.9%): [3.846, 4.208] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:17
# Fork: 1 of 2
# Warmup Iteration   1: 15.945 ms/op
# Warmup Iteration   2: 8.803 ms/op
Iteration   1: 7.655 ms/op
Iteration   2: 7.412 ms/op
Iteration   3: 7.392 ms/op

# Run progress: 19.57% complete, ETA 00:07:06
# Fork: 2 of 2
# Warmup Iteration   1: 16.309 ms/op
# Warmup Iteration   2: 9.684 ms/op
Iteration   1: 7.586 ms/op
Iteration   2: 7.497 ms/op
Iteration   3: 7.451 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  7.499 ±(99.9%) 0.289 ms/op [Average]
  (min, avg, max) = (7.392, 7.499, 7.655), stdev = 0.103
  CI (99.9%): [7.210, 7.788] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:06:55
# Fork: 1 of 2
# Warmup Iteration   1: 1219.663 ms/op
# Warmup Iteration   2: 483.089 ms/op
Iteration   1: 356.036 ms/op
Iteration   2: 287.817 ms/op
Iteration   3: 276.289 ms/op

# Run progress: 23.91% complete, ETA 00:06:43
# Fork: 2 of 2
# Warmup Iteration   1: 1240.611 ms/op
# Warmup Iteration   2: 466.054 ms/op
Iteration   1: 295.908 ms/op
Iteration   2: 269.435 ms/op
Iteration   3: 293.164 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  296.442 ±(99.9%) 86.634 ms/op [Average]
  (min, avg, max) = (269.435, 296.442, 356.036), stdev = 30.895
  CI (99.9%): [209.807, 383.076] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 7020.572 ms/op
# Warmup Iteration   2: 4136.899 ms/op
Iteration   1: 3600.311 ms/op
Iteration   2: 3526.015 ms/op
Iteration   3: 3463.097 ms/op

# Run progress: 28.26% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 7201.585 ms/op
# Warmup Iteration   2: 4076.222 ms/op
Iteration   1: 3536.122 ms/op
Iteration   2: 3531.671 ms/op
Iteration   3: 3471.186 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  3521.400 ±(99.9%) 140.160 ms/op [Average]
  (min, avg, max) = (3463.097, 3521.400, 3600.311), stdev = 49.983
  CI (99.9%): [3381.240, 3661.561] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 730.191 ms/op
# Warmup Iteration   2: 324.603 ms/op
Iteration   1: 309.097 ms/op
Iteration   2: 303.895 ms/op
Iteration   3: 301.845 ms/op

# Run progress: 32.61% complete, ETA 00:06:39
# Fork: 2 of 2
# Warmup Iteration   1: 724.403 ms/op
# Warmup Iteration   2: 326.642 ms/op
Iteration   1: 305.346 ms/op
Iteration   2: 301.695 ms/op
Iteration   3: 303.026 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  304.151 ±(99.9%) 7.789 ms/op [Average]
  (min, avg, max) = (301.695, 304.151, 309.097), stdev = 2.778
  CI (99.9%): [296.362, 311.940] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:22
# Fork: 1 of 2
# Warmup Iteration   1: 1359.389 ms/op
# Warmup Iteration   2: 719.178 ms/op
Iteration   1: 703.556 ms/op
Iteration   2: 723.215 ms/op
Iteration   3: 714.075 ms/op

# Run progress: 36.96% complete, ETA 00:06:08
# Fork: 2 of 2
# Warmup Iteration   1: 2084.806 ms/op
# Warmup Iteration   2: 769.197 ms/op
Iteration   1: 743.073 ms/op
Iteration   2: 697.897 ms/op
Iteration   3: 727.681 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  718.249 ±(99.9%) 46.542 ms/op [Average]
  (min, avg, max) = (697.897, 718.249, 743.073), stdev = 16.597
  CI (99.9%): [671.707, 764.792] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:52
# Fork: 1 of 2
# Warmup Iteration   1: 0.125 ms/op
# Warmup Iteration   2: 0.065 ms/op
Iteration   1: 0.064 ms/op
Iteration   2: 0.064 ms/op
Iteration   3: 0.066 ms/op

# Run progress: 41.30% complete, ETA 00:05:36
# Fork: 2 of 2
# Warmup Iteration   1: 0.135 ms/op
# Warmup Iteration   2: 0.066 ms/op
Iteration   1: 0.065 ms/op
Iteration   2: 0.063 ms/op
Iteration   3: 0.064 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.064 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.063, 0.064, 0.066), stdev = 0.001
  CI (99.9%): [0.062, 0.067] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:21
# Fork: 1 of 2
# Warmup Iteration   1: 6.972 ms/op
# Warmup Iteration   2: 4.836 ms/op
Iteration   1: 4.669 ms/op
Iteration   2: 4.758 ms/op
Iteration   3: 4.786 ms/op

# Run progress: 45.65% complete, ETA 00:05:06
# Fork: 2 of 2
# Warmup Iteration   1: 7.104 ms/op
# Warmup Iteration   2: 4.744 ms/op
Iteration   1: 4.740 ms/op
Iteration   2: 4.607 ms/op
Iteration   3: 4.591 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  4.692 ±(99.9%) 0.230 ms/op [Average]
  (min, avg, max) = (4.591, 4.692, 4.786), stdev = 0.082
  CI (99.9%): [4.462, 4.922] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.523 ms/op
# Warmup Iteration   2: 0.330 ms/op
Iteration   1: 0.337 ms/op
Iteration   2: 0.329 ms/op
Iteration   3: 0.354 ms/op

# Run progress: 50.00% complete, ETA 00:04:38
# Fork: 2 of 2
# Warmup Iteration   1: 0.519 ms/op
# Warmup Iteration   2: 0.341 ms/op
Iteration   1: 0.333 ms/op
Iteration   2: 0.341 ms/op
Iteration   3: 0.332 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.338 ±(99.9%) 0.025 ms/op [Average]
  (min, avg, max) = (0.329, 0.338, 0.354), stdev = 0.009
  CI (99.9%): [0.313, 0.363] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.383 ms/op
# Warmup Iteration   2: 0.904 ms/op
Iteration   1: 0.862 ms/op
Iteration   2: 0.847 ms/op
Iteration   3: 0.849 ms/op

# Run progress: 54.35% complete, ETA 00:04:10
# Fork: 2 of 2
# Warmup Iteration   1: 1.274 ms/op
# Warmup Iteration   2: 0.903 ms/op
Iteration   1: 0.873 ms/op
Iteration   2: 0.854 ms/op
Iteration   3: 0.863 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  0.858 ±(99.9%) 0.028 ms/op [Average]
  (min, avg, max) = (0.847, 0.858, 0.873), stdev = 0.010
  CI (99.9%): [0.830, 0.886] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:57
# Fork: 1 of 2
# Warmup Iteration   1: 113.499 ms/op
# Warmup Iteration   2: 23.058 ms/op
Iteration   1: 18.550 ms/op
Iteration   2: 17.607 ms/op
Iteration   3: 15.407 ms/op

# Run progress: 58.70% complete, ETA 00:03:44
# Fork: 2 of 2
# Warmup Iteration   1: 119.783 ms/op
# Warmup Iteration   2: 24.803 ms/op
Iteration   1: 18.553 ms/op
Iteration   2: 16.595 ms/op
Iteration   3: 14.930 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  16.940 ±(99.9%) 4.371 ms/op [Average]
  (min, avg, max) = (14.930, 16.940, 18.553), stdev = 1.559
  CI (99.9%): [12.569, 21.311] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:31
# Fork: 1 of 2
# Warmup Iteration   1: 53354.557 ms/op
# Warmup Iteration   2: 49420.860 ms/op
Iteration   1: 48360.085 ms/op
Iteration   2: 47960.100 ms/op
Iteration   3: 48657.368 ms/op

# Run progress: 63.04% complete, ETA 00:05:38
# Fork: 2 of 2
# Warmup Iteration   1: 56387.229 ms/op
# Warmup Iteration   2: 53099.261 ms/op
Iteration   1: 51389.801 ms/op
Iteration   2: 52454.708 ms/op
Iteration   3: 53537.567 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  50393.272 ±(99.9%) 6659.187 ms/op [Average]
  (min, avg, max) = (47960.100, 50393.272, 53537.567), stdev = 2374.730
  CI (99.9%): [43734.085, 57052.459] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 11061.690 ms/op
# Warmup Iteration   2: 9913.222 ms/op
Iteration   1: 7761.955 ms/op
Iteration   2: 6361.401 ms/op
Iteration   3: 8122.121 ms/op

# Run progress: 67.39% complete, ETA 00:08:27
# Fork: 2 of 2
# Warmup Iteration   1: 11072.649 ms/op
# Warmup Iteration   2: 10098.974 ms/op
Iteration   1: 7670.656 ms/op
Iteration   2: 6375.066 ms/op
Iteration   3: 8384.840 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  7446.007 ±(99.9%) 2448.527 ms/op [Average]
  (min, avg, max) = (6361.401, 7446.007, 8384.840), stdev = 873.168
  CI (99.9%): [4997.479, 9894.534] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:09:05
# Fork: 1 of 2
# Warmup Iteration   1: 15832.323 ms/op
# Warmup Iteration   2: 11145.586 ms/op
Iteration   1: 9792.054 ms/op
Iteration   2: 10019.767 ms/op
Iteration   3: 9864.038 ms/op

# Run progress: 71.74% complete, ETA 00:08:33
# Fork: 2 of 2
# Warmup Iteration   1: 15943.418 ms/op
# Warmup Iteration   2: 13002.059 ms/op
Iteration   1: 10060.658 ms/op
Iteration   2: 10037.502 ms/op
Iteration   3: 9892.133 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  9944.359 ±(99.9%) 307.857 ms/op [Average]
  (min, avg, max) = (9792.054, 9944.359, 10060.658), stdev = 109.785
  CI (99.9%): [9636.502, 10252.215] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:08:00
# Fork: 1 of 2
# Warmup Iteration   1: Oct 29, 2026 10:17:12 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 10:17:12 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
55.798 ms/op
# Warmup Iteration   2: 34.274 ms/op
Iteration   1: 33.192 ms/op
Iteration   2: 33.053 ms/op
Iteration   3: 33.522 ms/op

# Run progress: 76.09% complete, ETA 00:07:11
# Fork: 2 of 2
# Warmup Iteration   1: Oct 29, 2026 10:17:23 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 29, 2026 10:17:23 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
56.023 ms/op
# Warmup Iteration   2: 35.293 ms/op
Iteration   1: 33.454 ms/op
Iteration   2: 34.303 ms/op
Iteration   3: 32.869 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  33.399 ±(99.9%) 1.418 ms/op [Average]
  (min, avg, max) = (32.869, 33.399, 34.303), stdev = 0.506
  CI (99.9%): [31.981, 34.817] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:06:24
# Fork: 1 of 2
# Warmup Iteration   1: 89.286 ms/op
# Warmup Iteration   2: 43.854 ms/op
Iteration   1: 41.488 ms/op
Iteration   2: 42.120 ms/op
Iteration   3: 41.440 ms/op

# Run progress: 80.43% complete, ETA 00:05:39
# Fork: 2 of 2
# Warmup Iteration   1: 101.725 ms/op
# Warmup Iteration   2: 47.698 ms/op
Iteration   1: 43.255 ms/op
Iteration   2: 44.144 ms/op
Iteration   3: 43.890 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  42.723 ±(99.9%) 3.365 ms/op [Average]
  (min, avg, max) = (41.440, 42.723, 44.144), stdev = 1.200
  CI (99.9%): [39.358, 46.088] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:04:56
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:14
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

# Run progress: 86.96% complete, ETA 00:03:34
# Fork: 1 of 2
# Warmup Iteration   1: 0.917 ms/op
# Warmup Iteration   2: 0.433 ms/op
Iteration   1: 0.411 ms/op
Iteration   2: 0.403 ms/op
Iteration   3: 0.399 ms/op

# Run progress: 89.13% complete, ETA 00:02:55
# Fork: 2 of 2
# Warmup Iteration   1: 0.705 ms/op
# Warmup Iteration   2: 0.405 ms/op
Iteration   1: 0.385 ms/op
Iteration   2: 0.378 ms/op
Iteration   3: 0.372 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.391 ±(99.9%) 0.043 ms/op [Average]
  (min, avg, max) = (0.372, 0.391, 0.411), stdev = 0.015
  CI (99.9%): [0.349, 0.434] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:18
# Fork: 1 of 2
# Warmup Iteration   1: 14.835 ms/op
# Warmup Iteration   2: 8.761 ms/op
Iteration   1: 8.978 ms/op
Iteration   2: 8.151 ms/op
Iteration   3: 8.195 ms/op

# Run progress: 93.48% complete, ETA 00:01:42
# Fork: 2 of 2
# Warmup Iteration   1: 12.750 ms/op
# Warmup Iteration   2: 7.450 ms/op
Iteration   1: 7.490 ms/op
Iteration   2: 7.198 ms/op
Iteration   3: 7.091 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  7.851 ±(99.9%) 2.027 ms/op [Average]
  (min, avg, max) = (7.091, 7.851, 8.978), stdev = 0.723
  CI (99.9%): [5.824, 9.877] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:07
# Fork: 1 of 2
# Warmup Iteration   1: 19.821 ms/op
# Warmup Iteration   2: 14.841 ms/op
Iteration   1: 14.599 ms/op
Iteration   2: 14.858 ms/op
Iteration   3: 14.911 ms/op

# Run progress: 97.83% complete, ETA 00:00:33
# Fork: 2 of 2
# Warmup Iteration   1: 18.968 ms/op
# Warmup Iteration   2: 15.118 ms/op
Iteration   1: 15.011 ms/op
Iteration   2: 14.983 ms/op
Iteration   3: 15.418 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  14.963 ±(99.9%) 0.748 ms/op [Average]
  (min, avg, max) = (14.599, 14.963, 15.418), stdev = 0.267
  CI (99.9%): [14.215, 15.712] (assumes normal distribution)


# Run complete. Total time: 00:24:58

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     11.456 ±    0.266  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.889 ±    0.173  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.022 ±    0.260  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      4.027 ±    0.181  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      7.499 ±    0.289  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    296.442 ±   86.634  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   3521.400 ±  140.160  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    304.151 ±    7.789  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    718.249 ±   46.542  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.064 ±    0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      4.692 ±    0.230  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.338 ±    0.025  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      0.858 ±    0.028  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     16.940 ±    4.371  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  50393.272 ± 6659.187  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   7446.007 ± 2448.527  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   9944.359 ±  307.857  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     33.399 ±    1.418  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     42.723 ±    3.365  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.391 ±    0.043  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      7.851 ±    2.027  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     14.963 ±    0.748  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.16.0 -> 3.17.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 16 lower, 7 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| process.TEGprocess.testTEGprocess | 8230.53 | 9944.36 | +20.82% | Separate CIs |
| process.Compressor_Benchmark.compressorprocess | 20.894 | 16.9403 | -18.92% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 17.0742 | 14.9634 | -12.36% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 6649.08 | 7446.01 | +11.99% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 36.8948 | 33.399 | -9.48% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 333.352 | 304.151 | -8.76% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 8.46211 | 7.85058 | -7.23% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 45.0456 | 42.7229 | -5.16% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 757.161 | 718.249 | -5.14% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0673987 | 0.0643387 | -4.54% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
