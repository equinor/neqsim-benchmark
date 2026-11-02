# NeqSim 3.19.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.18.0 |
| Current | 3.19.0 |
| Source commit | `86a114c6ac4ee9a08249f688499dbe0b3c7fff28` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41401550594) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "86a114c6ac4ee9a08249f688499dbe0b3c7fff28",
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
| baseline | 3.18.0 | passed |
| current | 3.19.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.18.0",
  "version": "3.18.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.18.0/neqsim-3.18.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.19.0",
  "version": "3.19.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.19.0/neqsim-3.19.0.jar",
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
[INFO] Total time:  1.598 s
[INFO] Finished at: 2026-11-02T06:42:19Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.18.0 (neqsim-3.18.0.jar); requested: 3.18.0
$ mvn clean verify -Dneqsim.version=3.18.0
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
tpFlashLeanGas                                                 60.0000  (72 ms)
tpFlashWellFluidSrk                                            83.6406  (116 ms)
tpFlashWellFluidPr                                             83.6541  (93 ms)
tpFlashWellFluidWithProperties                                 5445.46  (158 ms)
phAndPsFlashWellFluid                                          2459.23  (105 ms)
Nov 02, 2026 6:42:33 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 02, 2026 6:42:33 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (909 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (331 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (263 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (79 ms)
saturationPointsWellFluid                                      1601.32  (362 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1707 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1699 ms)
levenbergMarquardtAntoine                                      1837.31  (14 ms)
levenbergMarquardtDoubleExponential                            5.57177  (11 ms)
dataReconciliation[20]                                         7.89841  (29 ms)
dataReconciliation[100]                                        37.0132  (119 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.832 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.757 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.131 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 427145 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 60 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    0.00e+00 (tolerance: 1.00e-03) OK [worst: well and manifold process::LP manifold -> Split Stream_1]
  Temperature:  0.00e+00 (tolerance: 1.00e-03) OK [worst: well and manifold process::LP manifold -> Split Stream_1]
  Pressure:     0.00e+00 (tolerance: 1.00e-03) OK [worst: well and manifold process::LP manifold -> Split Stream_1]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: no tolerance given - using the engineering default 1.0e-03 relative on flow, temperature and pressure
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 1.93e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264564.7 + 377849.4, oil 1995412.1 + 2850668.1, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.437 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.2 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 427.2 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 16253 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 16.27 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.18.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.18.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  07:53 min
[INFO] Finished at: 2026-11-02T06:50:15Z
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
# Warmup Iteration   1: 46.657 ms/op
# Warmup Iteration   2: 24.934 ms/op
Iteration   1: 20.803 ms/op
Iteration   2: 21.004 ms/op
Iteration   3: 20.675 ms/op

# Run progress: 2.17% complete, ETA 00:09:29
# Fork: 2 of 2
# Warmup Iteration   1: 44.865 ms/op
# Warmup Iteration   2: 24.711 ms/op
Iteration   1: 26.102 ms/op
Iteration   2: 21.045 ms/op
Iteration   3: 20.669 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  21.716 ±(99.9%) 6.041 ms/op [Average]
  (min, avg, max) = (20.669, 21.716, 26.102), stdev = 2.154
  CI (99.9%): [15.675, 27.758] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 5.173 ms/op
# Warmup Iteration   2: 3.369 ms/op
Iteration   1: 1.713 ms/op
Iteration   2: 1.593 ms/op
Iteration   3: 1.578 ms/op

# Run progress: 6.52% complete, ETA 00:09:03
# Fork: 2 of 2
# Warmup Iteration   1: 4.704 ms/op
# Warmup Iteration   2: 3.320 ms/op
Iteration   1: 1.936 ms/op
Iteration   2: 1.523 ms/op
Iteration   3: 1.533 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.646 ±(99.9%) 0.442 ms/op [Average]
  (min, avg, max) = (1.523, 1.646, 1.936), stdev = 0.157
  CI (99.9%): [1.205, 2.088] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:50
# Fork: 1 of 2
# Warmup Iteration   1: 20.685 ms/op
# Warmup Iteration   2: 12.654 ms/op
Iteration   1: 9.208 ms/op
Iteration   2: 7.135 ms/op
Iteration   3: 7.269 ms/op

# Run progress: 10.87% complete, ETA 00:08:37
# Fork: 2 of 2
# Warmup Iteration   1: 21.902 ms/op
# Warmup Iteration   2: 12.288 ms/op
Iteration   1: 7.984 ms/op
Iteration   2: 7.235 ms/op
Iteration   3: 7.507 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.723 ±(99.9%) 2.211 ms/op [Average]
  (min, avg, max) = (7.135, 7.723, 9.208), stdev = 0.789
  CI (99.9%): [5.512, 9.935] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:08:24
# Fork: 1 of 2
# Warmup Iteration   1: 29.269 ms/op
# Warmup Iteration   2: 13.834 ms/op
Iteration   1: 10.442 ms/op
Iteration   2: 7.100 ms/op
Iteration   3: 7.048 ms/op

# Run progress: 15.22% complete, ETA 00:08:12
# Fork: 2 of 2
# Warmup Iteration   1: 20.307 ms/op
# Warmup Iteration   2: 11.324 ms/op
Iteration   1: 7.625 ms/op
Iteration   2: 6.869 ms/op
Iteration   3: 6.818 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  7.650 ±(99.9%) 3.919 ms/op [Average]
  (min, avg, max) = (6.818, 7.650, 10.442), stdev = 1.397
  CI (99.9%): [3.732, 11.569] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:08:00
# Fork: 1 of 2
# Warmup Iteration   1: 42.718 ms/op
# Warmup Iteration   2: 23.052 ms/op
Iteration   1: 19.294 ms/op
Iteration   2: 13.912 ms/op
Iteration   3: 12.677 ms/op

# Run progress: 19.57% complete, ETA 00:07:47
# Fork: 2 of 2
# Warmup Iteration   1: 46.732 ms/op
# Warmup Iteration   2: 22.625 ms/op
Iteration   1: 14.663 ms/op
Iteration   2: 13.271 ms/op
Iteration   3: 12.639 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  14.409 ±(99.9%) 7.049 ms/op [Average]
  (min, avg, max) = (12.639, 14.409, 19.294), stdev = 2.514
  CI (99.9%): [7.360, 21.459] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:35
# Fork: 1 of 2
# Warmup Iteration   1: 2995.330 ms/op
# Warmup Iteration   2: 891.423 ms/op
Iteration   1: 873.184 ms/op
Iteration   2: 696.564 ms/op
Iteration   3: 552.515 ms/op

# Run progress: 23.91% complete, ETA 00:07:23
# Fork: 2 of 2
# Warmup Iteration   1: 3333.192 ms/op
# Warmup Iteration   2: 1015.596 ms/op
Iteration   1: 681.681 ms/op
Iteration   2: 504.521 ms/op
Iteration   3: 484.948 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  632.235 ±(99.9%) 414.031 ms/op [Average]
  (min, avg, max) = (484.948, 632.235, 873.184), stdev = 147.648
  CI (99.9%): [218.204, 1046.267] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:07:09
# Fork: 1 of 2
# Warmup Iteration   1: 3238.185 ms/op
# Warmup Iteration   2: 1251.189 ms/op
Iteration   1: 1137.393 ms/op
Iteration   2: 1083.638 ms/op
Iteration   3: 1133.244 ms/op

# Run progress: 28.26% complete, ETA 00:06:58
# Fork: 2 of 2
# Warmup Iteration   1: 3378.033 ms/op
# Warmup Iteration   2: 1218.337 ms/op
Iteration   1: 850.815 ms/op
Iteration   2: 680.570 ms/op
Iteration   3: 636.230 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  920.315 ±(99.9%) 642.089 ms/op [Average]
  (min, avg, max) = (636.230, 920.315, 1137.393), stdev = 228.975
  CI (99.9%): [278.226, 1562.404] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:47
# Fork: 1 of 2
# Warmup Iteration   1: 2546.996 ms/op
# Warmup Iteration   2: 628.016 ms/op
Iteration   1: 565.169 ms/op
Iteration   2: 518.629 ms/op
Iteration   3: 509.037 ms/op

# Run progress: 32.61% complete, ETA 00:06:32
# Fork: 2 of 2
# Warmup Iteration   1: 2562.867 ms/op
# Warmup Iteration   2: 626.134 ms/op
Iteration   1: 555.121 ms/op
Iteration   2: 578.688 ms/op
Iteration   3: 558.964 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  547.601 ±(99.9%) 77.177 ms/op [Average]
  (min, avg, max) = (509.037, 547.601, 578.688), stdev = 27.522
  CI (99.9%): [470.424, 624.778] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:18
# Fork: 1 of 2
# Warmup Iteration   1: 3589.875 ms/op
# Warmup Iteration   2: 1372.735 ms/op
Iteration   1: 1357.853 ms/op
Iteration   2: 1163.947 ms/op
Iteration   3: 1137.922 ms/op

# Run progress: 36.96% complete, ETA 00:06:08
# Fork: 2 of 2
# Warmup Iteration   1: 3489.177 ms/op
# Warmup Iteration   2: 1358.420 ms/op
Iteration   1: 1243.095 ms/op
Iteration   2: 1253.452 ms/op
Iteration   3: 1151.492 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1217.960 ±(99.9%) 235.295 ms/op [Average]
  (min, avg, max) = (1137.922, 1217.960, 1357.853), stdev = 83.908
  CI (99.9%): [982.666, 1453.255] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:57
# Fork: 1 of 2
# Warmup Iteration   1: 0.417 ms/op
# Warmup Iteration   2: 0.108 ms/op
Iteration   1: 0.100 ms/op
Iteration   2: 0.102 ms/op
Iteration   3: 0.102 ms/op

# Run progress: 41.30% complete, ETA 00:05:41
# Fork: 2 of 2
# Warmup Iteration   1: 0.450 ms/op
# Warmup Iteration   2: 0.119 ms/op
Iteration   1: 0.105 ms/op
Iteration   2: 0.105 ms/op
Iteration   3: 0.108 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.104 ±(99.9%) 0.008 ms/op [Average]
  (min, avg, max) = (0.100, 0.104, 0.108), stdev = 0.003
  CI (99.9%): [0.096, 0.111] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 19.100 ms/op
# Warmup Iteration   2: 7.950 ms/op
Iteration   1: 7.681 ms/op
Iteration   2: 7.538 ms/op
Iteration   3: 11.016 ms/op

# Run progress: 45.65% complete, ETA 00:05:10
# Fork: 2 of 2
# Warmup Iteration   1: 17.888 ms/op
# Warmup Iteration   2: 7.895 ms/op
Iteration   1: 7.672 ms/op
Iteration   2: 7.579 ms/op
Iteration   3: 7.550 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  8.173 ±(99.9%) 3.910 ms/op [Average]
  (min, avg, max) = (7.538, 8.173, 11.016), stdev = 1.394
  CI (99.9%): [4.262, 12.083] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:56
# Fork: 1 of 2
# Warmup Iteration   1: 1.188 ms/op
# Warmup Iteration   2: 0.664 ms/op
Iteration   1: 0.592 ms/op
Iteration   2: 0.593 ms/op
Iteration   3: 0.591 ms/op

# Run progress: 50.00% complete, ETA 00:04:41
# Fork: 2 of 2
# Warmup Iteration   1: 1.194 ms/op
# Warmup Iteration   2: 0.686 ms/op
Iteration   1: 0.612 ms/op
Iteration   2: 0.606 ms/op
Iteration   3: 0.608 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.600 ±(99.9%) 0.026 ms/op [Average]
  (min, avg, max) = (0.591, 0.600, 0.612), stdev = 0.009
  CI (99.9%): [0.574, 0.627] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 3.067 ms/op
# Warmup Iteration   2: 1.642 ms/op
Iteration   1: 1.728 ms/op
Iteration   2: 1.577 ms/op
Iteration   3: 1.551 ms/op

# Run progress: 54.35% complete, ETA 00:04:14
# Fork: 2 of 2
# Warmup Iteration   1: 3.038 ms/op
# Warmup Iteration   2: 1.614 ms/op
Iteration   1: 1.718 ms/op
Iteration   2: 1.566 ms/op
Iteration   3: 1.552 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.615 ±(99.9%) 0.236 ms/op [Average]
  (min, avg, max) = (1.551, 1.615, 1.728), stdev = 0.084
  CI (99.9%): [1.379, 1.852] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 704.416 ms/op
# Warmup Iteration   2: 77.060 ms/op
Iteration   1: 57.238 ms/op
Iteration   2: 54.295 ms/op
Iteration   3: 41.578 ms/op

# Run progress: 58.70% complete, ETA 00:03:47
# Fork: 2 of 2
# Warmup Iteration   1: 694.647 ms/op
# Warmup Iteration   2: 77.873 ms/op
Iteration   1: 47.372 ms/op
Iteration   2: 41.388 ms/op
Iteration   3: 43.783 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  47.609 ±(99.9%) 18.902 ms/op [Average]
  (min, avg, max) = (41.388, 47.609, 57.238), stdev = 6.740
  CI (99.9%): [28.707, 66.511] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 93916.516 ms/op
# Warmup Iteration   2: 87189.102 ms/op
Iteration   1: 84300.758 ms/op
Iteration   2: 84740.059 ms/op
Iteration   3: 84673.915 ms/op

# Run progress: 63.04% complete, ETA 00:07:31
# Fork: 2 of 2
# Warmup Iteration   1: 96296.668 ms/op
# Warmup Iteration   2: 86456.272 ms/op
Iteration   1: 85422.046 ms/op
Iteration   2: 84541.068 ms/op
Iteration   3: 85182.436 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  84810.047 ±(99.9%) 1168.624 ms/op [Average]
  (min, avg, max) = (84300.758, 84810.047, 85422.046), stdev = 416.742
  CI (99.9%): [83641.423, 85978.671] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:10:45
# Fork: 1 of 2
# Warmup Iteration   1: 17330.225 ms/op
# Warmup Iteration   2: 12422.539 ms/op
Iteration   1: 9570.282 ms/op
Iteration   2: 7096.878 ms/op
Iteration   3: 10067.106 ms/op

# Run progress: 67.39% complete, ETA 00:12:42
# Fork: 2 of 2
# Warmup Iteration   1: 17497.074 ms/op
# Warmup Iteration   2: 12730.048 ms/op
Iteration   1: 9737.642 ms/op
Iteration   2: 7715.676 ms/op
Iteration   3: 10281.663 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  9078.208 ±(99.9%) 3738.177 ms/op [Average]
  (min, avg, max) = (7096.878, 9078.208, 10281.663), stdev = 1333.070
  CI (99.9%): [5340.031, 12816.385] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:14:14
# Fork: 1 of 2
# Warmup Iteration   1: 16626.584 ms/op
# Warmup Iteration   2: 9918.791 ms/op
Iteration   1: 10386.441 ms/op
Iteration   2: 8218.031 ms/op
Iteration   3: 8786.367 ms/op

# Run progress: 71.74% complete, ETA 00:13:10
# Fork: 2 of 2
# Warmup Iteration   1: 15311.699 ms/op
# Warmup Iteration   2: 10302.384 ms/op
Iteration   1: 9274.583 ms/op
Iteration   2: 7941.864 ms/op
Iteration   3: 8547.069 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  8859.059 ±(99.9%) 2463.966 ms/op [Average]
  (min, avg, max) = (7941.864, 8859.059, 10386.441), stdev = 878.674
  CI (99.9%): [6395.093, 11323.025] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:12:06
# Fork: 1 of 2
# Warmup Iteration   1: Nov 02, 2026 7:24:37 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 02, 2026 7:24:37 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
145.332 ms/op
# Warmup Iteration   2: 57.532 ms/op
Iteration   1: 59.817 ms/op
Iteration   2: 57.302 ms/op
Iteration   3: 56.884 ms/op

# Run progress: 76.09% complete, ETA 00:10:50
# Fork: 2 of 2
# Warmup Iteration   1: Nov 02, 2026 7:24:49 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 02, 2026 7:24:49 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
169.628 ms/op
# Warmup Iteration   2: 64.408 ms/op
Iteration   1: 66.746 ms/op
Iteration   2: 63.227 ms/op
Iteration   3: 62.749 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  61.121 ±(99.9%) 10.712 ms/op [Average]
  (min, avg, max) = (56.884, 61.121, 66.746), stdev = 3.820
  CI (99.9%): [50.408, 71.833] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:09:38
# Fork: 1 of 2
# Warmup Iteration   1: 234.430 ms/op
# Warmup Iteration   2: 105.776 ms/op
Iteration   1: 77.231 ms/op
Iteration   2: 77.565 ms/op
Iteration   3: 76.594 ms/op

# Run progress: 80.43% complete, ETA 00:08:29
# Fork: 2 of 2
# Warmup Iteration   1: 250.847 ms/op
# Warmup Iteration   2: 119.543 ms/op
Iteration   1: 90.437 ms/op
Iteration   2: 82.543 ms/op
Iteration   3: 82.522 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  81.149 ±(99.9%) 14.787 ms/op [Average]
  (min, avg, max) = (76.594, 81.149, 90.437), stdev = 5.273
  CI (99.9%): [66.361, 95.936] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:07:23
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:06:20
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

# Run progress: 86.96% complete, ETA 00:05:19
# Fork: 1 of 2
# Warmup Iteration   1: 41.221 ms/op
# Warmup Iteration   2: 26.748 ms/op
Iteration   1: 19.816 ms/op
Iteration   2: 19.131 ms/op
Iteration   3: 19.450 ms/op

# Run progress: 89.13% complete, ETA 00:04:21
# Fork: 2 of 2
# Warmup Iteration   1: 43.759 ms/op
# Warmup Iteration   2: 26.911 ms/op
Iteration   1: 19.971 ms/op
Iteration   2: 18.862 ms/op
Iteration   3: 19.504 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  19.456 ±(99.9%) 1.160 ms/op [Average]
  (min, avg, max) = (18.862, 19.456, 19.971), stdev = 0.414
  CI (99.9%): [18.296, 20.616] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:25
# Fork: 1 of 2
# Warmup Iteration   1: 36.624 ms/op
# Warmup Iteration   2: 21.142 ms/op
Iteration   1: 14.384 ms/op
Iteration   2: 18.080 ms/op
Iteration   3: 14.563 ms/op

# Run progress: 93.48% complete, ETA 00:02:31
# Fork: 2 of 2
# Warmup Iteration   1: 30.524 ms/op
# Warmup Iteration   2: 21.220 ms/op
Iteration   1: 16.920 ms/op
Iteration   2: 16.160 ms/op
Iteration   3: 17.492 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  16.266 ±(99.9%) 4.284 ms/op [Average]
  (min, avg, max) = (14.384, 16.266, 18.080), stdev = 1.528
  CI (99.9%): [11.982, 20.551] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 47.726 ms/op
# Warmup Iteration   2: 30.963 ms/op
Iteration   1: 30.540 ms/op
Iteration   2: 30.614 ms/op
Iteration   3: 31.669 ms/op

# Run progress: 97.83% complete, ETA 00:00:48
# Fork: 2 of 2
# Warmup Iteration   1: 48.017 ms/op
# Warmup Iteration   2: 33.644 ms/op
Iteration   1: 33.509 ms/op
Iteration   2: 33.339 ms/op
Iteration   3: 33.357 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  32.171 ±(99.9%) 3.945 ms/op [Average]
  (min, avg, max) = (30.540, 32.171, 33.509), stdev = 1.407
  CI (99.9%): [28.227, 36.116] (assumes normal distribution)


# Run complete. Total time: 00:36:44

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     21.716 ±    6.041  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.646 ±    0.442  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      7.723 ±    2.211  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      7.650 ±    3.919  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     14.409 ±    7.049  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    632.235 ±  414.031  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    920.315 ±  642.089  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    547.601 ±   77.177  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1217.960 ±  235.295  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.104 ±    0.008  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      8.173 ±    3.910  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.600 ±    0.026  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.615 ±    0.236  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     47.609 ±   18.902  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  84810.047 ± 1168.624  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   9078.208 ± 3738.177  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   8859.059 ± 2463.966  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     61.121 ±   10.712  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     81.149 ±   14.787  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     19.456 ±    1.160  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     16.266 ±    4.284  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     32.171 ±    3.945  ms/op

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
[INFO] Total time:  1.575 s
[INFO] Finished at: 2026-11-02T07:27:04Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.19.0 (neqsim-3.19.0.jar); requested: 3.19.0
$ mvn clean verify -Dneqsim.version=3.19.0
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
tpFlashLeanGas                                                 60.0000  (92 ms)
tpFlashWellFluidSrk                                            83.6406  (145 ms)
tpFlashWellFluidPr                                             83.6541  (99 ms)
tpFlashWellFluidWithProperties                                 5445.46  (184 ms)
phAndPsFlashWellFluid                                          2459.23  (142 ms)
Nov 02, 2026 7:27:16 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 02, 2026 7:27:16 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (713 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (339 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (132 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (58 ms)
saturationPointsWellFluid                                      1601.32  (160 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1727 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1725 ms)
levenbergMarquardtAntoine                                      1837.31  (15 ms)
levenbergMarquardtDoubleExponential                            5.57177  (10 ms)
dataReconciliation[20]                                         7.89841  (24 ms)
dataReconciliation[100]                                        37.0132  (45 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.694 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.119 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.048 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 346721 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 27 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    7.67e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.80e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     8.47e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.80e-03 after 27 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
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

feed 5489240.1, gas 263818.4 + 376153.6, oil 1994937.7 + 2849750.4, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.376 MSm3/d, KA27841 A 102.7 bara, pipeline outlet 51.9 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 346.7 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 15331 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 15.35 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.19.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] commons-math3-3.6.1.jar, neqsim-3.19.0.jar define 1301 overlapping classes: 
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
[INFO] Total time:  06:30 min
[INFO] Finished at: 2026-11-02T07:33:36Z
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
# Warmup Iteration   1: 50.839 ms/op
# Warmup Iteration   2: 27.617 ms/op
Iteration   1: 21.548 ms/op
Iteration   2: 21.542 ms/op
Iteration   3: 21.388 ms/op

# Run progress: 2.17% complete, ETA 00:09:30
# Fork: 2 of 2
# Warmup Iteration   1: 47.968 ms/op
# Warmup Iteration   2: 28.842 ms/op
Iteration   1: 21.260 ms/op
Iteration   2: 21.568 ms/op
Iteration   3: 21.175 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  21.414 ±(99.9%) 0.469 ms/op [Average]
  (min, avg, max) = (21.175, 21.414, 21.568), stdev = 0.167
  CI (99.9%): [20.945, 21.882] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 4.639 ms/op
# Warmup Iteration   2: 3.027 ms/op
Iteration   1: 1.572 ms/op
Iteration   2: 1.520 ms/op
Iteration   3: 1.520 ms/op

# Run progress: 6.52% complete, ETA 00:09:01
# Fork: 2 of 2
# Warmup Iteration   1: 4.982 ms/op
# Warmup Iteration   2: 3.471 ms/op
Iteration   1: 2.451 ms/op
Iteration   2: 1.602 ms/op
Iteration   3: 1.582 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.708 ±(99.9%) 1.025 ms/op [Average]
  (min, avg, max) = (1.520, 1.708, 2.451), stdev = 0.366
  CI (99.9%): [0.683, 2.733] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:47
# Fork: 1 of 2
# Warmup Iteration   1: 22.084 ms/op
# Warmup Iteration   2: 13.026 ms/op
Iteration   1: 10.264 ms/op
Iteration   2: 9.413 ms/op
Iteration   3: 7.482 ms/op

# Run progress: 10.87% complete, ETA 00:08:35
# Fork: 2 of 2
# Warmup Iteration   1: 23.298 ms/op
# Warmup Iteration   2: 12.523 ms/op
Iteration   1: 8.377 ms/op
Iteration   2: 7.510 ms/op
Iteration   3: 7.650 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  8.449 ±(99.9%) 3.242 ms/op [Average]
  (min, avg, max) = (7.482, 8.449, 10.264), stdev = 1.156
  CI (99.9%): [5.208, 11.691] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:08:22
# Fork: 1 of 2
# Warmup Iteration   1: 25.411 ms/op
# Warmup Iteration   2: 13.443 ms/op
Iteration   1: 10.735 ms/op
Iteration   2: 8.066 ms/op
Iteration   3: 8.011 ms/op

# Run progress: 15.22% complete, ETA 00:08:10
# Fork: 2 of 2
# Warmup Iteration   1: 25.442 ms/op
# Warmup Iteration   2: 13.467 ms/op
Iteration   1: 9.312 ms/op
Iteration   2: 7.782 ms/op
Iteration   3: 7.858 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  8.627 ±(99.9%) 3.297 ms/op [Average]
  (min, avg, max) = (7.782, 8.627, 10.735), stdev = 1.176
  CI (99.9%): [5.330, 11.925] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:57
# Fork: 1 of 2
# Warmup Iteration   1: 50.270 ms/op
# Warmup Iteration   2: 25.498 ms/op
Iteration   1: 18.391 ms/op
Iteration   2: 14.301 ms/op
Iteration   3: 14.121 ms/op

# Run progress: 19.57% complete, ETA 00:07:45
# Fork: 2 of 2
# Warmup Iteration   1: 45.703 ms/op
# Warmup Iteration   2: 31.743 ms/op
Iteration   1: 20.975 ms/op
Iteration   2: 14.490 ms/op
Iteration   3: 14.318 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  16.099 ±(99.9%) 8.120 ms/op [Average]
  (min, avg, max) = (14.121, 16.099, 20.975), stdev = 2.896
  CI (99.9%): [7.979, 24.220] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:32
# Fork: 1 of 2
# Warmup Iteration   1: 2974.849 ms/op
# Warmup Iteration   2: 910.283 ms/op
Iteration   1: 604.912 ms/op
Iteration   2: 486.154 ms/op
Iteration   3: 471.441 ms/op

# Run progress: 23.91% complete, ETA 00:07:22
# Fork: 2 of 2
# Warmup Iteration   1: 2897.001 ms/op
# Warmup Iteration   2: 1047.858 ms/op
Iteration   1: 705.075 ms/op
Iteration   2: 521.010 ms/op
Iteration   3: 498.034 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  547.771 ±(99.9%) 253.379 ms/op [Average]
  (min, avg, max) = (471.441, 547.771, 705.075), stdev = 90.357
  CI (99.9%): [294.392, 801.150] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:07:08
# Fork: 1 of 2
# Warmup Iteration   1: 3537.731 ms/op
# Warmup Iteration   2: 1242.484 ms/op
Iteration   1: 1036.311 ms/op
Iteration   2: 786.281 ms/op
Iteration   3: 631.437 ms/op

# Run progress: 28.26% complete, ETA 00:06:57
# Fork: 2 of 2
# Warmup Iteration   1: 3352.916 ms/op
# Warmup Iteration   2: 1294.031 ms/op
Iteration   1: 1179.922 ms/op
Iteration   2: 1032.794 ms/op
Iteration   3: 991.245 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  942.998 ±(99.9%) 556.420 ms/op [Average]
  (min, avg, max) = (631.437, 942.998, 1179.922), stdev = 198.425
  CI (99.9%): [386.578, 1499.419] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:47
# Fork: 1 of 2
# Warmup Iteration   1: 3088.485 ms/op
# Warmup Iteration   2: 612.998 ms/op
Iteration   1: 549.368 ms/op
Iteration   2: 524.391 ms/op
Iteration   3: 514.206 ms/op

# Run progress: 32.61% complete, ETA 00:06:33
# Fork: 2 of 2
# Warmup Iteration   1: 2633.201 ms/op
# Warmup Iteration   2: 623.295 ms/op
Iteration   1: 551.836 ms/op
Iteration   2: 522.486 ms/op
Iteration   3: 509.407 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  528.616 ±(99.9%) 50.192 ms/op [Average]
  (min, avg, max) = (509.407, 528.616, 551.836), stdev = 17.899
  CI (99.9%): [478.424, 578.808] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:18
# Fork: 1 of 2
# Warmup Iteration   1: 3543.690 ms/op
# Warmup Iteration   2: 1350.745 ms/op
Iteration   1: 1261.178 ms/op
Iteration   2: 1298.169 ms/op
Iteration   3: 1123.201 ms/op

# Run progress: 36.96% complete, ETA 00:06:08
# Fork: 2 of 2
# Warmup Iteration   1: 3598.812 ms/op
# Warmup Iteration   2: 1354.526 ms/op
Iteration   1: 1340.313 ms/op
Iteration   2: 1131.133 ms/op
Iteration   3: 1149.696 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1217.282 ±(99.9%) 264.389 ms/op [Average]
  (min, avg, max) = (1123.201, 1217.282, 1340.313), stdev = 94.284
  CI (99.9%): [952.893, 1481.671] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:57
# Fork: 1 of 2
# Warmup Iteration   1: 0.357 ms/op
# Warmup Iteration   2: 0.109 ms/op
Iteration   1: 0.101 ms/op
Iteration   2: 0.102 ms/op
Iteration   3: 0.141 ms/op

# Run progress: 41.30% complete, ETA 00:05:41
# Fork: 2 of 2
# Warmup Iteration   1: 0.417 ms/op
# Warmup Iteration   2: 0.109 ms/op
Iteration   1: 0.103 ms/op
Iteration   2: 0.104 ms/op
Iteration   3: 0.102 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.109 ±(99.9%) 0.044 ms/op [Average]
  (min, avg, max) = (0.101, 0.109, 0.141), stdev = 0.016
  CI (99.9%): [0.065, 0.153] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 20.509 ms/op
# Warmup Iteration   2: 7.919 ms/op
Iteration   1: 7.879 ms/op
Iteration   2: 7.589 ms/op
Iteration   3: 7.818 ms/op

# Run progress: 45.65% complete, ETA 00:05:10
# Fork: 2 of 2
# Warmup Iteration   1: 17.606 ms/op
# Warmup Iteration   2: 7.910 ms/op
Iteration   1: 7.641 ms/op
Iteration   2: 7.528 ms/op
Iteration   3: 7.887 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.724 ±(99.9%) 0.439 ms/op [Average]
  (min, avg, max) = (7.528, 7.724, 7.887), stdev = 0.157
  CI (99.9%): [7.285, 8.163] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:56
# Fork: 1 of 2
# Warmup Iteration   1: 1.190 ms/op
# Warmup Iteration   2: 0.655 ms/op
Iteration   1: 0.580 ms/op
Iteration   2: 0.578 ms/op
Iteration   3: 0.579 ms/op

# Run progress: 50.00% complete, ETA 00:04:41
# Fork: 2 of 2
# Warmup Iteration   1: 1.229 ms/op
# Warmup Iteration   2: 0.662 ms/op
Iteration   1: 0.586 ms/op
Iteration   2: 0.585 ms/op
Iteration   3: 0.580 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.581 ±(99.9%) 0.009 ms/op [Average]
  (min, avg, max) = (0.578, 0.581, 0.586), stdev = 0.003
  CI (99.9%): [0.572, 0.591] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2.892 ms/op
# Warmup Iteration   2: 1.613 ms/op
Iteration   1: 1.706 ms/op
Iteration   2: 2.149 ms/op
Iteration   3: 1.523 ms/op

# Run progress: 54.35% complete, ETA 00:04:14
# Fork: 2 of 2
# Warmup Iteration   1: 3.031 ms/op
# Warmup Iteration   2: 1.662 ms/op
Iteration   1: 1.717 ms/op
Iteration   2: 1.539 ms/op
Iteration   3: 1.538 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.695 ±(99.9%) 0.670 ms/op [Average]
  (min, avg, max) = (1.523, 1.695, 2.149), stdev = 0.239
  CI (99.9%): [1.026, 2.365] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 691.921 ms/op
# Warmup Iteration   2: 68.067 ms/op
Iteration   1: 47.983 ms/op
Iteration   2: 38.555 ms/op
Iteration   3: 38.113 ms/op

# Run progress: 58.70% complete, ETA 00:03:47
# Fork: 2 of 2
# Warmup Iteration   1: 691.167 ms/op
# Warmup Iteration   2: 84.938 ms/op
Iteration   1: 55.617 ms/op
Iteration   2: 39.202 ms/op
Iteration   3: 38.291 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  42.960 ±(99.9%) 20.386 ms/op [Average]
  (min, avg, max) = (38.113, 42.960, 55.617), stdev = 7.270
  CI (99.9%): [22.575, 63.346] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 103949.692 ms/op
# Warmup Iteration   2: 93381.772 ms/op
Iteration   1: 88078.640 ms/op
Iteration   2: 88521.547 ms/op
Iteration   3: 87518.290 ms/op

# Run progress: 63.04% complete, ETA 00:07:47
# Fork: 2 of 2
# Warmup Iteration   1: 102965.947 ms/op
# Warmup Iteration   2: 92571.145 ms/op
Iteration   1: 87778.306 ms/op
Iteration   2: 88713.921 ms/op
Iteration   3: 87323.798 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  87989.084 ±(99.9%) 1548.970 ms/op [Average]
  (min, avg, max) = (87323.798, 87989.084, 88713.921), stdev = 552.378
  CI (99.9%): [86440.114, 89538.053] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:11
# Fork: 1 of 2
# Warmup Iteration   1: 36494.335 ms/op
# Warmup Iteration   2: 15693.180 ms/op
Iteration   1: 27148.261 ms/op
Iteration   2: 15784.367 ms/op
Iteration   3: 21875.606 ms/op

# Run progress: 67.39% complete, ETA 00:13:37
# Fork: 2 of 2
# Warmup Iteration   1: 34441.213 ms/op
# Warmup Iteration   2: 15379.922 ms/op
Iteration   1: 28017.273 ms/op
Iteration   2: 26831.640 ms/op
Iteration   3: 27954.288 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  24601.906 ±(99.9%) 13711.328 ms/op [Average]
  (min, avg, max) = (15784.367, 24601.906, 28017.273), stdev = 4889.592
  CI (99.9%): [10890.578, 38313.234] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:15:41
# Fork: 1 of 2
# Warmup Iteration   1: 15769.334 ms/op
# Warmup Iteration   2: 9667.766 ms/op
Iteration   1: 10446.803 ms/op
Iteration   2: 8515.783 ms/op
Iteration   3: 7960.537 ms/op

# Run progress: 71.74% complete, ETA 00:14:28
# Fork: 2 of 2
# Warmup Iteration   1: 15967.836 ms/op
# Warmup Iteration   2: 10672.874 ms/op
Iteration   1: 9462.612 ms/op
Iteration   2: 9236.833 ms/op
Iteration   3: 8384.947 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  9001.252 ±(99.9%) 2525.814 ms/op [Average]
  (min, avg, max) = (7960.537, 9001.252, 10446.803), stdev = 900.730
  CI (99.9%): [6475.439, 11527.066] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:13:17
# Fork: 1 of 2
# Warmup Iteration   1: Nov 02, 2026 8:11:17 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 02, 2026 8:11:18 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
167.249 ms/op
# Warmup Iteration   2: 59.158 ms/op
Iteration   1: 59.824 ms/op
Iteration   2: 57.434 ms/op
Iteration   3: 56.810 ms/op

# Run progress: 76.09% complete, ETA 00:11:53
# Fork: 2 of 2
# Warmup Iteration   1: Nov 02, 2026 8:11:29 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 02, 2026 8:11:30 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
157.814 ms/op
# Warmup Iteration   2: 57.848 ms/op
Iteration   1: 65.068 ms/op
Iteration   2: 69.387 ms/op
Iteration   3: 56.767 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  60.882 ±(99.9%) 14.645 ms/op [Average]
  (min, avg, max) = (56.767, 60.882, 69.387), stdev = 5.223
  CI (99.9%): [46.237, 75.527] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:10:34
# Fork: 1 of 2
# Warmup Iteration   1: 211.444 ms/op
# Warmup Iteration   2: 87.805 ms/op
Iteration   1: 66.698 ms/op
Iteration   2: 67.052 ms/op
Iteration   3: 66.438 ms/op

# Run progress: 80.43% complete, ETA 00:09:18
# Fork: 2 of 2
# Warmup Iteration   1: 145.698 ms/op
# Warmup Iteration   2: 79.194 ms/op
Iteration   1: 71.376 ms/op
Iteration   2: 69.144 ms/op
Iteration   3: 69.471 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  68.363 ±(99.9%) 5.482 ms/op [Average]
  (min, avg, max) = (66.438, 68.363, 71.376), stdev = 1.955
  CI (99.9%): [62.881, 73.845] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:08:05
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:06:56
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

# Run progress: 86.96% complete, ETA 00:05:49
# Fork: 1 of 2
# Warmup Iteration   1: 43.652 ms/op
# Warmup Iteration   2: 27.076 ms/op
Iteration   1: 20.676 ms/op
Iteration   2: 19.774 ms/op
Iteration   3: 17.794 ms/op

# Run progress: 89.13% complete, ETA 00:04:45
# Fork: 2 of 2
# Warmup Iteration   1: 44.557 ms/op
# Warmup Iteration   2: 27.493 ms/op
Iteration   1: 20.657 ms/op
Iteration   2: 19.160 ms/op
Iteration   3: 19.192 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  19.542 ±(99.9%) 3.048 ms/op [Average]
  (min, avg, max) = (17.794, 19.542, 20.676), stdev = 1.087
  CI (99.9%): [16.494, 22.590] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:44
# Fork: 1 of 2
# Warmup Iteration   1: 43.205 ms/op
# Warmup Iteration   2: 21.401 ms/op
Iteration   1: 16.429 ms/op
Iteration   2: 16.039 ms/op
Iteration   3: 14.670 ms/op

# Run progress: 93.48% complete, ETA 00:02:45
# Fork: 2 of 2
# Warmup Iteration   1: 32.341 ms/op
# Warmup Iteration   2: 16.734 ms/op
Iteration   1: 12.862 ms/op
Iteration   2: 13.843 ms/op
Iteration   3: 13.816 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  14.610 ±(99.9%) 3.892 ms/op [Average]
  (min, avg, max) = (12.862, 14.610, 16.429), stdev = 1.388
  CI (99.9%): [10.718, 18.502] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:48
# Fork: 1 of 2
# Warmup Iteration   1: 49.374 ms/op
# Warmup Iteration   2: 33.646 ms/op
Iteration   1: 33.371 ms/op
Iteration   2: 33.040 ms/op
Iteration   3: 33.246 ms/op

# Run progress: 97.83% complete, ETA 00:00:53
# Fork: 2 of 2
# Warmup Iteration   1: 51.671 ms/op
# Warmup Iteration   2: 37.156 ms/op
Iteration   1: 42.828 ms/op
Iteration   2: 33.537 ms/op
Iteration   3: 33.464 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  34.914 ±(99.9%) 10.882 ms/op [Average]
  (min, avg, max) = (33.040, 34.914, 42.828), stdev = 3.881
  CI (99.9%): [24.032, 45.797] (assumes normal distribution)


# Run complete. Total time: 00:40:04

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     21.414 ±     0.469  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.708 ±     1.025  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      8.449 ±     3.242  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      8.627 ±     3.297  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     16.099 ±     8.120  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    547.771 ±   253.379  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    942.998 ±   556.420  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    528.616 ±    50.192  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1217.282 ±   264.389  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.109 ±     0.044  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.724 ±     0.439  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.581 ±     0.009  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.695 ±     0.670  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     42.960 ±    20.386  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  87989.084 ±  1548.970  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  24601.906 ± 13711.328  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   9001.252 ±  2525.814  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     60.882 ±    14.645  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     68.363 ±     5.482  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     19.542 ±     3.048  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     14.610 ±     3.892  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     34.914 ±    10.882  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.18.0 -> 3.19.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 11 lower, 12 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 9078.21 | 24601.9 | +171.00% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 81.1486 | 68.3632 | -15.76% | Overlapping CIs |
| flash.TPflash.testFlash | 632.235 | 547.771 | -13.36% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.65035 | 8.62742 | +12.77% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 14.4094 | 16.0994 | +11.73% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 16.2665 | 14.6101 | -10.18% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 47.609 | 42.9603 | -9.76% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.72316 | 8.44937 | +9.40% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 32.1714 | 34.9145 | +8.53% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 8.17267 | 7.72359 | -5.49% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
