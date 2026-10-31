# NeqSim 3.18.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.17.0 |
| Current | 3.18.0 |
| Source commit | `1c81001b6611476c297a067119fc9e41c106c07b` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41029885485) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "1c81001b6611476c297a067119fc9e41c106c07b",
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
BogoMIPS:                                5192.29
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid rdseed adx smap clflushopt clwb sha_ni xsaveopt xsavec xgetbv1 xsaves user_shstk clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload umip vaes vpclmulqdq rdpid fsrm
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
| baseline | 3.17.0 | passed |
| current | 3.18.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.17.0",
  "version": "3.17.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.17.0/neqsim-3.17.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.18.0",
  "version": "3.18.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.18.0/neqsim-3.18.0.jar",
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
[INFO] Total time:  7.463 s
[INFO] Finished at: 2026-10-30T08:57:37Z
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
tpFlashLeanGas                                                 60.0000  (57 ms)
tpFlashWellFluidSrk                                            83.6406  (154 ms)
tpFlashWellFluidPr                                             83.6541  (79 ms)
tpFlashWellFluidWithProperties                                 5445.46  (149 ms)
phAndPsFlashWellFluid                                          2459.23  (96 ms)
Oct 30, 2026 8:57:53 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 30, 2026 8:57:53 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (582 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (334 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (41 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (90 ms)
saturationPointsWellFluid                                      1601.32  (148 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1235 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1620 ms)
levenbergMarquardtAntoine                                      1837.31  (12 ms)
levenbergMarquardtDoubleExponential                            5.57177  (8 ms)
dataReconciliation[20]                                         7.89841  (26 ms)
dataReconciliation[100]                                        37.0132  (75 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.637 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 12.57 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.026 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 293301 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 293.3 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 25451 ms, solved=true, gas=318849.56 kg/hr, water in/out=0.00027104531/1.5353073e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018484308, composition error=0.0029102354
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=0.00013837322
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 25.45 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  06:01 min
[INFO] Finished at: 2026-10-30T09:03:41Z
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
# Warmup Iteration   1: 39.369 ms/op
# Warmup Iteration   2: 22.322 ms/op
Iteration   1: 21.048 ms/op
Iteration   2: 21.146 ms/op
Iteration   3: 21.021 ms/op

# Run progress: 2.17% complete, ETA 00:09:18
# Fork: 2 of 2
# Warmup Iteration   1: 37.835 ms/op
# Warmup Iteration   2: 22.830 ms/op
Iteration   1: 20.825 ms/op
Iteration   2: 20.867 ms/op
Iteration   3: 21.315 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  21.037 ±(99.9%) 0.507 ms/op [Average]
  (min, avg, max) = (20.825, 21.037, 21.315), stdev = 0.181
  CI (99.9%): [20.530, 21.544] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:09:06
# Fork: 1 of 2
# Warmup Iteration   1: 3.582 ms/op
# Warmup Iteration   2: 1.668 ms/op
Iteration   1: 1.511 ms/op
Iteration   2: 1.494 ms/op
Iteration   3: 1.490 ms/op

# Run progress: 6.52% complete, ETA 00:08:54
# Fork: 2 of 2
# Warmup Iteration   1: 4.039 ms/op
# Warmup Iteration   2: 1.796 ms/op
Iteration   1: 1.645 ms/op
Iteration   2: 1.616 ms/op
Iteration   3: 1.560 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.553 ±(99.9%) 0.184 ms/op [Average]
  (min, avg, max) = (1.490, 1.553, 1.645), stdev = 0.066
  CI (99.9%): [1.369, 1.737] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 17.346 ms/op
# Warmup Iteration   2: 9.233 ms/op
Iteration   1: 7.266 ms/op
Iteration   2: 7.219 ms/op
Iteration   3: 7.016 ms/op

# Run progress: 10.87% complete, ETA 00:08:28
# Fork: 2 of 2
# Warmup Iteration   1: 18.351 ms/op
# Warmup Iteration   2: 10.732 ms/op
Iteration   1: 7.425 ms/op
Iteration   2: 7.027 ms/op
Iteration   3: 7.095 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.174 ±(99.9%) 0.445 ms/op [Average]
  (min, avg, max) = (7.016, 7.174, 7.425), stdev = 0.159
  CI (99.9%): [6.729, 7.620] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 18.059 ms/op
# Warmup Iteration   2: 9.454 ms/op
Iteration   1: 7.166 ms/op
Iteration   2: 7.039 ms/op
Iteration   3: 6.999 ms/op

# Run progress: 15.22% complete, ETA 00:08:03
# Fork: 2 of 2
# Warmup Iteration   1: 18.068 ms/op
# Warmup Iteration   2: 11.546 ms/op
Iteration   1: 8.063 ms/op
Iteration   2: 7.035 ms/op
Iteration   3: 7.100 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  7.234 ±(99.9%) 1.151 ms/op [Average]
  (min, avg, max) = (6.999, 7.234, 8.063), stdev = 0.410
  CI (99.9%): [6.083, 8.384] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 37.417 ms/op
# Warmup Iteration   2: 20.235 ms/op
Iteration   1: 15.100 ms/op
Iteration   2: 13.005 ms/op
Iteration   3: 12.593 ms/op

# Run progress: 19.57% complete, ETA 00:07:39
# Fork: 2 of 2
# Warmup Iteration   1: 35.981 ms/op
# Warmup Iteration   2: 19.543 ms/op
Iteration   1: 14.325 ms/op
Iteration   2: 12.910 ms/op
Iteration   3: 12.284 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.369 ±(99.9%) 3.080 ms/op [Average]
  (min, avg, max) = (12.284, 13.369, 15.100), stdev = 1.098
  CI (99.9%): [10.290, 16.449] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2702.034 ms/op
# Warmup Iteration   2: 870.584 ms/op
Iteration   1: 602.218 ms/op
Iteration   2: 480.383 ms/op
Iteration   3: 430.857 ms/op

# Run progress: 23.91% complete, ETA 00:07:15
# Fork: 2 of 2
# Warmup Iteration   1: 2746.422 ms/op
# Warmup Iteration   2: 910.697 ms/op
Iteration   1: 814.710 ms/op
Iteration   2: 710.450 ms/op
Iteration   3: 502.005 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  590.104 ±(99.9%) 416.376 ms/op [Average]
  (min, avg, max) = (430.857, 590.104, 814.710), stdev = 148.484
  CI (99.9%): [173.728, 1006.480] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:07:02
# Fork: 1 of 2
# Warmup Iteration   1: 11882.012 ms/op
# Warmup Iteration   2: 7316.938 ms/op
Iteration   1: 6173.691 ms/op
Iteration   2: 6103.911 ms/op
Iteration   3: 6081.377 ms/op

# Run progress: 28.26% complete, ETA 00:07:54
# Fork: 2 of 2
# Warmup Iteration   1: 11897.751 ms/op
# Warmup Iteration   2: 6921.004 ms/op
Iteration   1: 6151.842 ms/op
Iteration   2: 6042.243 ms/op
Iteration   3: 6060.345 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  6102.235 ±(99.9%) 144.945 ms/op [Average]
  (min, avg, max) = (6042.243, 6102.235, 6173.691), stdev = 51.689
  CI (99.9%): [5957.290, 6247.180] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2467.260 ms/op
# Warmup Iteration   2: 608.498 ms/op
Iteration   1: 542.519 ms/op
Iteration   2: 528.368 ms/op
Iteration   3: 512.508 ms/op

# Run progress: 32.61% complete, ETA 00:08:07
# Fork: 2 of 2
# Warmup Iteration   1: 2306.194 ms/op
# Warmup Iteration   2: 607.016 ms/op
Iteration   1: 541.890 ms/op
Iteration   2: 521.470 ms/op
Iteration   3: 510.556 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  526.219 ±(99.9%) 39.093 ms/op [Average]
  (min, avg, max) = (510.556, 526.219, 542.519), stdev = 13.941
  CI (99.9%): [487.125, 565.312] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 3166.997 ms/op
# Warmup Iteration   2: 1331.870 ms/op
Iteration   1: 1224.036 ms/op
Iteration   2: 1246.522 ms/op
Iteration   3: 1151.413 ms/op

# Run progress: 36.96% complete, ETA 00:07:24
# Fork: 2 of 2
# Warmup Iteration   1: 3199.387 ms/op
# Warmup Iteration   2: 1361.571 ms/op
Iteration   1: 1319.977 ms/op
Iteration   2: 1209.577 ms/op
Iteration   3: 1143.798 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1215.887 ±(99.9%) 182.739 ms/op [Average]
  (min, avg, max) = (1143.798, 1215.887, 1319.977), stdev = 65.166
  CI (99.9%): [1033.148, 1398.626] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:07:06
# Fork: 1 of 2
# Warmup Iteration   1: 0.546 ms/op
# Warmup Iteration   2: 0.112 ms/op
Iteration   1: 0.104 ms/op
Iteration   2: 0.110 ms/op
Iteration   3: 0.104 ms/op

# Run progress: 41.30% complete, ETA 00:06:44
# Fork: 2 of 2
# Warmup Iteration   1: 0.354 ms/op
# Warmup Iteration   2: 0.108 ms/op
Iteration   1: 0.103 ms/op
Iteration   2: 0.103 ms/op
Iteration   3: 0.102 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.104 ±(99.9%) 0.008 ms/op [Average]
  (min, avg, max) = (0.102, 0.104, 0.110), stdev = 0.003
  CI (99.9%): [0.096, 0.112] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:06:23
# Fork: 1 of 2
# Warmup Iteration   1: 17.591 ms/op
# Warmup Iteration   2: 8.267 ms/op
Iteration   1: 7.992 ms/op
Iteration   2: 7.912 ms/op
Iteration   3: 7.942 ms/op

# Run progress: 45.65% complete, ETA 00:06:03
# Fork: 2 of 2
# Warmup Iteration   1: 19.166 ms/op
# Warmup Iteration   2: 8.258 ms/op
Iteration   1: 8.294 ms/op
Iteration   2: 7.950 ms/op
Iteration   3: 7.952 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  8.007 ±(99.9%) 0.401 ms/op [Average]
  (min, avg, max) = (7.912, 8.007, 8.294), stdev = 0.143
  CI (99.9%): [7.606, 8.408] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:05:44
# Fork: 1 of 2
# Warmup Iteration   1: 1.080 ms/op
# Warmup Iteration   2: 0.656 ms/op
Iteration   1: 0.636 ms/op
Iteration   2: 0.594 ms/op
Iteration   3: 0.592 ms/op

# Run progress: 50.00% complete, ETA 00:05:25
# Fork: 2 of 2
# Warmup Iteration   1: 1.094 ms/op
# Warmup Iteration   2: 0.661 ms/op
Iteration   1: 0.598 ms/op
Iteration   2: 0.595 ms/op
Iteration   3: 0.637 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.609 ±(99.9%) 0.061 ms/op [Average]
  (min, avg, max) = (0.592, 0.609, 0.637), stdev = 0.022
  CI (99.9%): [0.548, 0.669] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2.811 ms/op
# Warmup Iteration   2: 1.617 ms/op
Iteration   1: 1.663 ms/op
Iteration   2: 1.519 ms/op
Iteration   3: 1.592 ms/op

# Run progress: 54.35% complete, ETA 00:04:51
# Fork: 2 of 2
# Warmup Iteration   1: 2.870 ms/op
# Warmup Iteration   2: 1.618 ms/op
Iteration   1: 1.670 ms/op
Iteration   2: 1.534 ms/op
Iteration   3: 1.524 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.584 ±(99.9%) 0.195 ms/op [Average]
  (min, avg, max) = (1.519, 1.584, 1.670), stdev = 0.069
  CI (99.9%): [1.389, 1.778] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:04:34
# Fork: 1 of 2
# Warmup Iteration   1: 516.790 ms/op
# Warmup Iteration   2: 69.521 ms/op
Iteration   1: 40.106 ms/op
Iteration   2: 35.944 ms/op
Iteration   3: 33.251 ms/op

# Run progress: 58.70% complete, ETA 00:04:18
# Fork: 2 of 2
# Warmup Iteration   1: 520.463 ms/op
# Warmup Iteration   2: 69.900 ms/op
Iteration   1: 43.710 ms/op
Iteration   2: 37.771 ms/op
Iteration   3: 33.985 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  37.461 ±(99.9%) 11.093 ms/op [Average]
  (min, avg, max) = (33.251, 37.461, 43.710), stdev = 3.956
  CI (99.9%): [26.368, 48.555] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:04:02
# Fork: 1 of 2
# Warmup Iteration   1: 96505.073 ms/op
# Warmup Iteration   2: 90133.368 ms/op
Iteration   1: 88124.337 ms/op
Iteration   2: 87777.404 ms/op
Iteration   3: 88008.962 ms/op

# Run progress: 63.04% complete, ETA 00:08:06
# Fork: 2 of 2
# Warmup Iteration   1: 94515.767 ms/op
# Warmup Iteration   2: 87899.711 ms/op
Iteration   1: 86597.219 ms/op
Iteration   2: 86584.900 ms/op
Iteration   3: 86539.911 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  87272.122 ±(99.9%) 2167.916 ms/op [Average]
  (min, avg, max) = (86539.911, 87272.122, 88124.337), stdev = 773.100
  CI (99.9%): [85104.207, 89440.038] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:19
# Fork: 1 of 2
# Warmup Iteration   1: 20005.447 ms/op
# Warmup Iteration   2: 18033.334 ms/op
Iteration   1: 13932.458 ms/op
Iteration   2: 11525.640 ms/op
Iteration   3: 14860.858 ms/op

# Run progress: 67.39% complete, ETA 00:13:06
# Fork: 2 of 2
# Warmup Iteration   1: 19792.244 ms/op
# Warmup Iteration   2: 17746.844 ms/op
Iteration   1: 13718.544 ms/op
Iteration   2: 11277.457 ms/op
Iteration   3: 14820.256 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  13355.869 ±(99.9%) 4441.419 ms/op [Average]
  (min, avg, max) = (11277.457, 13355.869, 14860.858), stdev = 1583.853
  CI (99.9%): [8914.450, 17797.288] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:14:22
# Fork: 1 of 2
# Warmup Iteration   1: 28626.710 ms/op
# Warmup Iteration   2: 19673.191 ms/op
Iteration   1: 17073.114 ms/op
Iteration   2: 17419.824 ms/op
Iteration   3: 16833.372 ms/op

# Run progress: 71.74% complete, ETA 00:13:36
# Fork: 2 of 2
# Warmup Iteration   1: 26834.433 ms/op
# Warmup Iteration   2: 18117.247 ms/op
Iteration   1: 18801.183 ms/op
Iteration   2: 16891.355 ms/op
Iteration   3: 15996.053 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  17169.150 ±(99.9%) 2601.000 ms/op [Average]
  (min, avg, max) = (15996.053, 17169.150, 18801.183), stdev = 927.541
  CI (99.9%): [14568.151, 19770.150] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:12:45
# Fork: 1 of 2
# Warmup Iteration   1: Oct 30, 2026 9:39:52 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 30, 2026 9:39:52 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
143.226 ms/op
# Warmup Iteration   2: 57.328 ms/op
Iteration   1: 58.723 ms/op
Iteration   2: 56.468 ms/op
Iteration   3: 56.457 ms/op

# Run progress: 76.09% complete, ETA 00:11:25
# Fork: 2 of 2
# Warmup Iteration   1: Oct 30, 2026 9:40:04 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 30, 2026 9:40:04 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
171.339 ms/op
# Warmup Iteration   2: 67.400 ms/op
Iteration   1: 67.220 ms/op
Iteration   2: 64.366 ms/op
Iteration   3: 63.812 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  61.174 ±(99.9%) 12.796 ms/op [Average]
  (min, avg, max) = (56.457, 61.174, 67.220), stdev = 4.563
  CI (99.9%): [48.378, 73.970] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:10:09
# Fork: 1 of 2
# Warmup Iteration   1: 222.735 ms/op
# Warmup Iteration   2: 96.955 ms/op
Iteration   1: 78.317 ms/op
Iteration   2: 75.601 ms/op
Iteration   3: 75.570 ms/op

# Run progress: 80.43% complete, ETA 00:08:56
# Fork: 2 of 2
# Warmup Iteration   1: 238.234 ms/op
# Warmup Iteration   2: 103.126 ms/op
Iteration   1: 71.876 ms/op
Iteration   2: 71.679 ms/op
Iteration   3: 71.354 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  74.066 ±(99.9%) 7.984 ms/op [Average]
  (min, avg, max) = (71.354, 74.066, 78.317), stdev = 2.847
  CI (99.9%): [66.082, 82.050] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:07:46
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:06:40
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

# Run progress: 86.96% complete, ETA 00:05:36
# Fork: 1 of 2
# Warmup Iteration   1: 1.733 ms/op
# Warmup Iteration   2: 0.796 ms/op
Iteration   1: 0.701 ms/op
Iteration   2: 0.685 ms/op
Iteration   3: 0.667 ms/op

# Run progress: 89.13% complete, ETA 00:04:34
# Fork: 2 of 2
# Warmup Iteration   1: 1.359 ms/op
# Warmup Iteration   2: 0.779 ms/op
Iteration   1: 0.685 ms/op
Iteration   2: 0.689 ms/op
Iteration   3: 0.658 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.681 ±(99.9%) 0.044 ms/op [Average]
  (min, avg, max) = (0.658, 0.681, 0.701), stdev = 0.016
  CI (99.9%): [0.637, 0.725] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:35
# Fork: 1 of 2
# Warmup Iteration   1: 32.812 ms/op
# Warmup Iteration   2: 20.343 ms/op
Iteration   1: 15.409 ms/op
Iteration   2: 15.964 ms/op
Iteration   3: 16.234 ms/op

# Run progress: 93.48% complete, ETA 00:02:38
# Fork: 2 of 2
# Warmup Iteration   1: 30.536 ms/op
# Warmup Iteration   2: 20.720 ms/op
Iteration   1: 16.524 ms/op
Iteration   2: 15.914 ms/op
Iteration   3: 15.085 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  15.855 ±(99.9%) 1.483 ms/op [Average]
  (min, avg, max) = (15.085, 15.855, 16.524), stdev = 0.529
  CI (99.9%): [14.372, 17.338] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:44
# Fork: 1 of 2
# Warmup Iteration   1: 48.157 ms/op
# Warmup Iteration   2: 32.830 ms/op
Iteration   1: 32.638 ms/op
Iteration   2: 32.671 ms/op
Iteration   3: 33.604 ms/op

# Run progress: 97.83% complete, ETA 00:00:51
# Fork: 2 of 2
# Warmup Iteration   1: 47.696 ms/op
# Warmup Iteration   2: 32.792 ms/op
Iteration   1: 32.610 ms/op
Iteration   2: 32.575 ms/op
Iteration   3: 32.618 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  32.786 ±(99.9%) 1.127 ms/op [Average]
  (min, avg, max) = (32.575, 32.786, 33.604), stdev = 0.402
  CI (99.9%): [31.659, 33.914] (assumes normal distribution)


# Run complete. Total time: 00:38:33

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     21.037 ±    0.507  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.553 ±    0.184  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      7.174 ±    0.445  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      7.234 ±    1.151  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     13.369 ±    3.080  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    590.104 ±  416.376  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   6102.235 ±  144.945  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    526.219 ±   39.093  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1215.887 ±  182.739  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.104 ±    0.008  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      8.007 ±    0.401  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.609 ±    0.061  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.584 ±    0.195  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     37.461 ±   11.093  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  87272.122 ± 2167.916  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  13355.869 ± 4441.419  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  17169.150 ± 2601.000  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     61.174 ±   12.796  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     74.066 ±    7.984  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.681 ±    0.044  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     15.855 ±    1.483  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     32.786 ±    1.127  ms/op

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
[INFO] Total time:  3.800 s
[INFO] Finished at: 2026-10-30T09:42:20Z
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
tpFlashLeanGas                                                 60.0000  (44 ms)
tpFlashWellFluidSrk                                            83.6406  (126 ms)
tpFlashWellFluidPr                                             83.6541  (100 ms)
tpFlashWellFluidWithProperties                                 5445.46  (163 ms)
phAndPsFlashWellFluid                                          2459.23  (134 ms)
Oct 30, 2026 9:42:31 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 30, 2026 9:42:31 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (598 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (322 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (2 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (123 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (63 ms)
saturationPointsWellFluid                                      1601.32  (155 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1683 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1760 ms)
levenbergMarquardtAntoine                                      1837.31  (14 ms)
levenbergMarquardtDoubleExponential                            5.57177  (9 ms)
dataReconciliation[20]                                         7.89841  (24 ms)
dataReconciliation[100]                                        37.0132  (74 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.462 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.306 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.043 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 386460 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 45 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    2.35e-03 (tolerance: 5.04e-03) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  4.80e-03 (tolerance: 5.04e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     5.48e-04 (tolerance: 5.04e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 4.80e-03 after 45 passes - accepted 5.04e-03 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 3.97e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264444.3 + 377473.9, oil 1995334.8 + 2850467.7, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.424 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.4 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 386.5 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 17912 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 17.92 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  07:11 min
[INFO] Finished at: 2026-10-30T09:49:33Z
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
# Warmup Iteration   1: 45.007 ms/op
# Warmup Iteration   2: 22.539 ms/op
Iteration   1: 21.088 ms/op
Iteration   2: 21.053 ms/op
Iteration   3: 20.917 ms/op

# Run progress: 2.17% complete, ETA 00:09:22
# Fork: 2 of 2
# Warmup Iteration   1: 43.562 ms/op
# Warmup Iteration   2: 22.612 ms/op
Iteration   1: 21.295 ms/op
Iteration   2: 21.349 ms/op
Iteration   3: 21.120 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  21.137 ±(99.9%) 0.449 ms/op [Average]
  (min, avg, max) = (20.917, 21.137, 21.349), stdev = 0.160
  CI (99.9%): [20.688, 21.587] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:09:06
# Fork: 1 of 2
# Warmup Iteration   1: 4.606 ms/op
# Warmup Iteration   2: 2.661 ms/op
Iteration   1: 1.552 ms/op
Iteration   2: 1.547 ms/op
Iteration   3: 1.543 ms/op

# Run progress: 6.52% complete, ETA 00:08:53
# Fork: 2 of 2
# Warmup Iteration   1: 4.051 ms/op
# Warmup Iteration   2: 2.399 ms/op
Iteration   1: 1.576 ms/op
Iteration   2: 1.572 ms/op
Iteration   3: 1.568 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.560 ±(99.9%) 0.039 ms/op [Average]
  (min, avg, max) = (1.543, 1.560, 1.576), stdev = 0.014
  CI (99.9%): [1.521, 1.599] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 20.705 ms/op
# Warmup Iteration   2: 11.999 ms/op
Iteration   1: 8.103 ms/op
Iteration   2: 7.218 ms/op
Iteration   3: 7.243 ms/op

# Run progress: 10.87% complete, ETA 00:08:27
# Fork: 2 of 2
# Warmup Iteration   1: 19.615 ms/op
# Warmup Iteration   2: 11.470 ms/op
Iteration   1: 7.804 ms/op
Iteration   2: 7.310 ms/op
Iteration   3: 7.336 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.502 ±(99.9%) 1.023 ms/op [Average]
  (min, avg, max) = (7.218, 7.502, 8.103), stdev = 0.365
  CI (99.9%): [6.480, 8.525] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:08:14
# Fork: 1 of 2
# Warmup Iteration   1: 17.616 ms/op
# Warmup Iteration   2: 10.273 ms/op
Iteration   1: 7.525 ms/op
Iteration   2: 7.085 ms/op
Iteration   3: 7.109 ms/op

# Run progress: 15.22% complete, ETA 00:08:02
# Fork: 2 of 2
# Warmup Iteration   1: 16.505 ms/op
# Warmup Iteration   2: 11.405 ms/op
Iteration   1: 7.834 ms/op
Iteration   2: 6.970 ms/op
Iteration   3: 7.063 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  7.264 ±(99.9%) 0.952 ms/op [Average]
  (min, avg, max) = (6.970, 7.264, 7.834), stdev = 0.339
  CI (99.9%): [6.312, 8.216] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:49
# Fork: 1 of 2
# Warmup Iteration   1: 37.339 ms/op
# Warmup Iteration   2: 20.071 ms/op
Iteration   1: 14.457 ms/op
Iteration   2: 13.017 ms/op
Iteration   3: 12.349 ms/op

# Run progress: 19.57% complete, ETA 00:07:37
# Fork: 2 of 2
# Warmup Iteration   1: 43.783 ms/op
# Warmup Iteration   2: 22.404 ms/op
Iteration   1: 15.694 ms/op
Iteration   2: 13.281 ms/op
Iteration   3: 12.601 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.566 ±(99.9%) 3.573 ms/op [Average]
  (min, avg, max) = (12.349, 13.566, 15.694), stdev = 1.274
  CI (99.9%): [9.993, 17.140] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:24
# Fork: 1 of 2
# Warmup Iteration   1: 2757.501 ms/op
# Warmup Iteration   2: 832.683 ms/op
Iteration   1: 556.358 ms/op
Iteration   2: 473.949 ms/op
Iteration   3: 427.856 ms/op

# Run progress: 23.91% complete, ETA 00:07:12
# Fork: 2 of 2
# Warmup Iteration   1: 2712.314 ms/op
# Warmup Iteration   2: 852.529 ms/op
Iteration   1: 591.339 ms/op
Iteration   2: 478.175 ms/op
Iteration   3: 433.504 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  493.530 ±(99.9%) 186.217 ms/op [Average]
  (min, avg, max) = (427.856, 493.530, 591.339), stdev = 66.407
  CI (99.9%): [307.313, 679.747] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:07:00
# Fork: 1 of 2
# Warmup Iteration   1: 3318.124 ms/op
# Warmup Iteration   2: 1163.652 ms/op
Iteration   1: 808.302 ms/op
Iteration   2: 630.695 ms/op
Iteration   3: 609.619 ms/op

# Run progress: 28.26% complete, ETA 00:06:50
# Fork: 2 of 2
# Warmup Iteration   1: 3085.759 ms/op
# Warmup Iteration   2: 1161.164 ms/op
Iteration   1: 760.663 ms/op
Iteration   2: 626.442 ms/op
Iteration   3: 577.219 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  668.823 ±(99.9%) 260.156 ms/op [Average]
  (min, avg, max) = (577.219, 668.823, 808.302), stdev = 92.774
  CI (99.9%): [408.667, 928.979] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:38
# Fork: 1 of 2
# Warmup Iteration   1: 2352.515 ms/op
# Warmup Iteration   2: 601.996 ms/op
Iteration   1: 539.401 ms/op
Iteration   2: 518.863 ms/op
Iteration   3: 511.879 ms/op

# Run progress: 32.61% complete, ETA 00:06:24
# Fork: 2 of 2
# Warmup Iteration   1: 2278.602 ms/op
# Warmup Iteration   2: 607.388 ms/op
Iteration   1: 544.287 ms/op
Iteration   2: 519.320 ms/op
Iteration   3: 513.644 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  524.566 ±(99.9%) 38.639 ms/op [Average]
  (min, avg, max) = (511.879, 524.566, 544.287), stdev = 13.779
  CI (99.9%): [485.926, 563.205] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:09
# Fork: 1 of 2
# Warmup Iteration   1: 3225.879 ms/op
# Warmup Iteration   2: 1331.252 ms/op
Iteration   1: 1226.866 ms/op
Iteration   2: 1269.800 ms/op
Iteration   3: 1140.232 ms/op

# Run progress: 36.96% complete, ETA 00:05:59
# Fork: 2 of 2
# Warmup Iteration   1: 3319.367 ms/op
# Warmup Iteration   2: 1311.353 ms/op
Iteration   1: 1319.327 ms/op
Iteration   2: 1168.953 ms/op
Iteration   3: 1159.539 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1214.120 ±(99.9%) 197.530 ms/op [Average]
  (min, avg, max) = (1140.232, 1214.120, 1319.327), stdev = 70.441
  CI (99.9%): [1016.590, 1411.650] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:48
# Fork: 1 of 2
# Warmup Iteration   1: 0.345 ms/op
# Warmup Iteration   2: 0.108 ms/op
Iteration   1: 0.103 ms/op
Iteration   2: 0.103 ms/op
Iteration   3: 0.102 ms/op

# Run progress: 41.30% complete, ETA 00:05:33
# Fork: 2 of 2
# Warmup Iteration   1: 0.380 ms/op
# Warmup Iteration   2: 0.108 ms/op
Iteration   1: 0.102 ms/op
Iteration   2: 0.102 ms/op
Iteration   3: 0.101 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.102 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.101, 0.102, 0.103), stdev = 0.001
  CI (99.9%): [0.100, 0.104] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:18
# Fork: 1 of 2
# Warmup Iteration   1: 16.713 ms/op
# Warmup Iteration   2: 8.247 ms/op
Iteration   1: 7.948 ms/op
Iteration   2: 7.895 ms/op
Iteration   3: 7.961 ms/op

# Run progress: 45.65% complete, ETA 00:05:03
# Fork: 2 of 2
# Warmup Iteration   1: 15.295 ms/op
# Warmup Iteration   2: 8.246 ms/op
Iteration   1: 7.992 ms/op
Iteration   2: 7.903 ms/op
Iteration   3: 7.937 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.939 ±(99.9%) 0.102 ms/op [Average]
  (min, avg, max) = (7.895, 7.939, 7.992), stdev = 0.036
  CI (99.9%): [7.837, 8.041] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:49
# Fork: 1 of 2
# Warmup Iteration   1: 1.084 ms/op
# Warmup Iteration   2: 0.657 ms/op
Iteration   1: 0.601 ms/op
Iteration   2: 0.603 ms/op
Iteration   3: 0.594 ms/op

# Run progress: 50.00% complete, ETA 00:04:35
# Fork: 2 of 2
# Warmup Iteration   1: 1.112 ms/op
# Warmup Iteration   2: 0.659 ms/op
Iteration   1: 0.596 ms/op
Iteration   2: 0.593 ms/op
Iteration   3: 0.595 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.597 ±(99.9%) 0.011 ms/op [Average]
  (min, avg, max) = (0.593, 0.597, 0.603), stdev = 0.004
  CI (99.9%): [0.586, 0.608] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:22
# Fork: 1 of 2
# Warmup Iteration   1: 2.793 ms/op
# Warmup Iteration   2: 1.586 ms/op
Iteration   1: 1.656 ms/op
Iteration   2: 1.514 ms/op
Iteration   3: 1.580 ms/op

# Run progress: 54.35% complete, ETA 00:04:09
# Fork: 2 of 2
# Warmup Iteration   1: 2.756 ms/op
# Warmup Iteration   2: 1.609 ms/op
Iteration   1: 1.659 ms/op
Iteration   2: 1.516 ms/op
Iteration   3: 1.519 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.574 ±(99.9%) 0.194 ms/op [Average]
  (min, avg, max) = (1.514, 1.574, 1.659), stdev = 0.069
  CI (99.9%): [1.380, 1.768] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:56
# Fork: 1 of 2
# Warmup Iteration   1: 505.355 ms/op
# Warmup Iteration   2: 66.844 ms/op
Iteration   1: 40.003 ms/op
Iteration   2: 32.746 ms/op
Iteration   3: 33.165 ms/op

# Run progress: 58.70% complete, ETA 00:03:43
# Fork: 2 of 2
# Warmup Iteration   1: 418.290 ms/op
# Warmup Iteration   2: 71.498 ms/op
Iteration   1: 44.819 ms/op
Iteration   2: 36.162 ms/op
Iteration   3: 35.810 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  37.117 ±(99.9%) 12.850 ms/op [Average]
  (min, avg, max) = (32.746, 37.117, 44.819), stdev = 4.582
  CI (99.9%): [24.267, 49.968] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:30
# Fork: 1 of 2
# Warmup Iteration   1: 92379.976 ms/op
# Warmup Iteration   2: 84818.368 ms/op
Iteration   1: 83696.475 ms/op
Iteration   2: 83730.731 ms/op
Iteration   3: 83556.614 ms/op

# Run progress: 63.04% complete, ETA 00:07:24
# Fork: 2 of 2
# Warmup Iteration   1: 92905.331 ms/op
# Warmup Iteration   2: 85767.739 ms/op
Iteration   1: 84837.777 ms/op
Iteration   2: 84611.419 ms/op
Iteration   3: 84718.632 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  84191.941 ±(99.9%) 1650.573 ms/op [Average]
  (min, avg, max) = (83556.614, 84191.941, 84837.777), stdev = 588.610
  CI (99.9%): [82541.368, 85842.514] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:10:36
# Fork: 1 of 2
# Warmup Iteration   1: 17764.810 ms/op
# Warmup Iteration   2: 12757.525 ms/op
Iteration   1: 9806.222 ms/op
Iteration   2: 7291.031 ms/op
Iteration   3: 10416.298 ms/op

# Run progress: 67.39% complete, ETA 00:12:36
# Fork: 2 of 2
# Warmup Iteration   1: 17872.073 ms/op
# Warmup Iteration   2: 12910.010 ms/op
Iteration   1: 9947.917 ms/op
Iteration   2: 7395.288 ms/op
Iteration   3: 10451.250 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  9218.001 ±(99.9%) 4134.839 ms/op [Average]
  (min, avg, max) = (7291.031, 9218.001, 10451.250), stdev = 1474.523
  CI (99.9%): [5083.162, 13352.840] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:14:07
# Fork: 1 of 2
# Warmup Iteration   1: 15180.319 ms/op
# Warmup Iteration   2: 9782.672 ms/op
Iteration   1: 9786.045 ms/op
Iteration   2: 9055.150 ms/op
Iteration   3: 9547.432 ms/op

# Run progress: 71.74% complete, ETA 00:13:04
# Fork: 2 of 2
# Warmup Iteration   1: 15035.072 ms/op
# Warmup Iteration   2: 10403.856 ms/op
Iteration   1: 9894.980 ms/op
Iteration   2: 9138.506 ms/op
Iteration   3: 8396.977 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  9303.182 ±(99.9%) 1562.757 ms/op [Average]
  (min, avg, max) = (8396.977, 9303.182, 9894.980), stdev = 557.294
  CI (99.9%): [7740.425, 10865.939] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:12:01
# Fork: 1 of 2
# Warmup Iteration   1: Oct 30, 2026 10:23:40 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 30, 2026 10:23:40 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
126.165 ms/op
# Warmup Iteration   2: 56.550 ms/op
Iteration   1: 58.737 ms/op
Iteration   2: 56.419 ms/op
Iteration   3: 56.108 ms/op

# Run progress: 76.09% complete, ETA 00:10:46
# Fork: 2 of 2
# Warmup Iteration   1: Oct 30, 2026 10:23:52 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 30, 2026 10:23:52 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
168.934 ms/op
# Warmup Iteration   2: 63.543 ms/op
Iteration   1: 65.227 ms/op
Iteration   2: 62.524 ms/op
Iteration   3: 61.809 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  60.137 ±(99.9%) 10.220 ms/op [Average]
  (min, avg, max) = (56.108, 60.137, 65.227), stdev = 3.645
  CI (99.9%): [49.917, 70.358] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:09:34
# Fork: 1 of 2
# Warmup Iteration   1: 208.600 ms/op
# Warmup Iteration   2: 87.843 ms/op
Iteration   1: 72.745 ms/op
Iteration   2: 72.829 ms/op
Iteration   3: 72.342 ms/op

# Run progress: 80.43% complete, ETA 00:08:26
# Fork: 2 of 2
# Warmup Iteration   1: 205.892 ms/op
# Warmup Iteration   2: 91.438 ms/op
Iteration   1: 75.507 ms/op
Iteration   2: 75.470 ms/op
Iteration   3: 77.686 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  74.430 ±(99.9%) 5.963 ms/op [Average]
  (min, avg, max) = (72.342, 74.430, 77.686), stdev = 2.126
  CI (99.9%): [68.467, 80.393] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:07:20
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:06:17
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

# Run progress: 86.96% complete, ETA 00:05:17
# Fork: 1 of 2
# Warmup Iteration   1: 41.514 ms/op
# Warmup Iteration   2: 25.833 ms/op
Iteration   1: 19.505 ms/op
Iteration   2: 18.922 ms/op
Iteration   3: 19.313 ms/op

# Run progress: 89.13% complete, ETA 00:04:19
# Fork: 2 of 2
# Warmup Iteration   1: 36.711 ms/op
# Warmup Iteration   2: 25.867 ms/op
Iteration   1: 20.346 ms/op
Iteration   2: 17.212 ms/op
Iteration   3: 18.201 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  18.916 ±(99.9%) 3.063 ms/op [Average]
  (min, avg, max) = (17.212, 18.916, 20.346), stdev = 1.092
  CI (99.9%): [15.854, 21.979] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:23
# Fork: 1 of 2
# Warmup Iteration   1: 31.410 ms/op
# Warmup Iteration   2: 20.355 ms/op
Iteration   1: 14.742 ms/op
Iteration   2: 15.882 ms/op
Iteration   3: 15.152 ms/op

# Run progress: 93.48% complete, ETA 00:02:30
# Fork: 2 of 2
# Warmup Iteration   1: 28.744 ms/op
# Warmup Iteration   2: 17.492 ms/op
Iteration   1: 12.688 ms/op
Iteration   2: 13.677 ms/op
Iteration   3: 13.527 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  14.278 ±(99.9%) 3.319 ms/op [Average]
  (min, avg, max) = (12.688, 14.278, 15.882), stdev = 1.184
  CI (99.9%): [10.959, 17.597] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:38
# Fork: 1 of 2
# Warmup Iteration   1: 36.054 ms/op
# Warmup Iteration   2: 26.083 ms/op
Iteration   1: 25.944 ms/op
Iteration   2: 26.060 ms/op
Iteration   3: 26.560 ms/op

# Run progress: 97.83% complete, ETA 00:00:48
# Fork: 2 of 2
# Warmup Iteration   1: 48.053 ms/op
# Warmup Iteration   2: 32.249 ms/op
Iteration   1: 32.184 ms/op
Iteration   2: 32.151 ms/op
Iteration   3: 32.070 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  29.161 ±(99.9%) 9.154 ms/op [Average]
  (min, avg, max) = (25.944, 29.161, 32.184), stdev = 3.264
  CI (99.9%): [20.008, 38.315] (assumes normal distribution)


# Run complete. Total time: 00:36:28

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     21.137 ±    0.449  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.560 ±    0.039  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      7.502 ±    1.023  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      7.264 ±    0.952  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     13.566 ±    3.573  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    493.530 ±  186.217  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    668.823 ±  260.156  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    524.566 ±   38.639  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1214.120 ±  197.530  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.102 ±    0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.939 ±    0.102  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.597 ±    0.011  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.574 ±    0.194  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     37.117 ±   12.850  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  84191.941 ± 1650.573  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   9218.001 ± 4134.839  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   9303.182 ± 1562.757  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     60.137 ±   10.220  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     74.430 ±    5.963  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     18.916 ±    3.063  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     14.278 ±    3.319  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     29.161 ±    9.154  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.17.0 -> 3.18.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 15 lower, 8 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.680937 | 18.9163 | +2677.98% | Separate CIs |
| flash.TPflash_UMR.testFlash_UMR | 6102.23 | 668.823 | -89.04% | Separate CIs |
| process.TEGprocess.testTEGprocess | 17169.2 | 9303.18 | -45.81% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 13355.9 | 9218 | -30.98% | Overlapping CIs |
| flash.TPflash.testFlash | 590.104 | 493.53 | -16.37% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 32.7861 | 29.1615 | -11.06% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 15.8552 | 14.2782 | -9.95% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.17446 | 7.5023 | +4.57% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 87272.1 | 84191.9 | -3.53% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.608637 | 0.597116 | -1.89% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
