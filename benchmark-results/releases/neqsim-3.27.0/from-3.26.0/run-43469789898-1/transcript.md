# NeqSim 3.27.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.26.0 |
| Current | 3.27.0 |
| Source commit | `645ee3006646f4e010243af29fdd28c3b580dc81` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43469789898) |
| Status | incomplete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "645ee3006646f4e010243af29fdd28c3b580dc81",
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
OS name: "linux", version: "7.0.0-1019-azure", arch: "amd64", family: "unix"
Linux runnervmccnms 7.0.0-1019-azure #20-Ubuntu SMP PREEMPT Mon Oct 19 22:41:16 UTC 2026 x86_64 GNU/Linux
Architecture:                            x86_64
CPU op-mode(s):                          32-bit, 64-bit
Address sizes:                           48 bits physical, 48 bits virtual
Byte Order:                              Little Endian
CPU(s):                                  4
On-line CPU(s) list:                     0-3
Vendor ID:                               AuthenticAMD
Model name:                              AMD EPYC 7763 64-Core Processor
CPU family:                              25
Model:                                   1
Thread(s) per core:                      2
Core(s) per socket:                      2
Socket(s):                               1
Stepping:                                1
BogoMIPS:                                4890.85
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid rdseed adx smap clflushopt clwb sha_ni xsaveopt xsavec xgetbv1 xsaves user_shstk clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload umip vaes vpclmulqdq rdpid fsrm
Virtualization:                          AMD-V
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               64 KiB (2 instances)
L1i cache:                               64 KiB (2 instances)
L2 cache:                                1 MiB (2 instances)
L3 cache:                                32 MiB (1 instance)
NUMA node(s):                            1
NUMA node0 CPU(s):                       0-3
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
| baseline | 3.26.0 | passed |
| current | 3.27.0 | failed (exit 1) |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.26.0",
  "version": "3.26.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.26.0/neqsim-3.26.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.27.0",
  "version": "3.27.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.27.0/neqsim-3.27.0.jar",
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
[INFO] Total time:  4.757 s
[INFO] Finished at: 2026-11-13T17:08:56Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.26.0 (neqsim-3.26.0.jar); requested: 3.26.0
$ mvn clean verify -Dneqsim.version=3.26.0
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
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 11900 ms, solved=true, gas=318849.58 kg/hr, water in/out=0.00027104531/1.5400949e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00019284321, composition error=0.0030760310
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=4.7854811e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 11.95 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.524 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.091 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 745868 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 49 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    1.81e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.75e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     2.42e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.75e-03 after 49 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 3.10e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264519.5 + 377623.3, oil 1995374.5 + 2850534.0, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.430 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.3 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 745.9 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (9 ms)
tpFlashWellFluidSrk                                            83.6406  (76 ms)
tpFlashWellFluidPr                                             83.6541  (80 ms)
tpFlashWellFluidWithProperties                                 5445.46  (82 ms)
phAndPsFlashWellFluid                                          2459.23  (131 ms)
Nov 13, 2026 5:21:51 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 5:21:51 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (1082 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (372 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (281 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (123 ms)
saturationPointsWellFluid                                      1601.32  (223 ms)
singlePhaseGasPipelineSteadyState                              121.628  (928 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98717  (1717 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (6 ms)
dataReconciliation[20]                                         7.89841  (4 ms)
dataReconciliation[100]                                        37.0132  (44 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.017 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.26.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.26.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  13:07 min
[INFO] Finished at: 2026-11-13T17:22:05Z
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
# Warmup Iteration   1: 29.923 ms/op
# Warmup Iteration   2: 23.262 ms/op
Iteration   1: 23.091 ms/op
Iteration   2: 23.236 ms/op
Iteration   3: 23.022 ms/op

# Run progress: 2.17% complete, ETA 00:09:09
# Fork: 2 of 2
# Warmup Iteration   1: 33.939 ms/op
# Warmup Iteration   2: 25.473 ms/op
Iteration   1: 24.800 ms/op
Iteration   2: 24.797 ms/op
Iteration   3: 24.672 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  23.936 ±(99.9%) 2.529 ms/op [Average]
  (min, avg, max) = (23.022, 23.936, 24.800), stdev = 0.902
  CI (99.9%): [21.407, 26.466] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:57
# Fork: 1 of 2
# Warmup Iteration   1: 2.883 ms/op
# Warmup Iteration   2: 1.329 ms/op
Iteration   1: 1.251 ms/op
Iteration   2: 1.246 ms/op
Iteration   3: 1.261 ms/op

# Run progress: 6.52% complete, ETA 00:08:45
# Fork: 2 of 2
# Warmup Iteration   1: 2.089 ms/op
# Warmup Iteration   2: 1.324 ms/op
Iteration   1: 1.255 ms/op
Iteration   2: 1.255 ms/op
Iteration   3: 1.259 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.254 ±(99.9%) 0.016 ms/op [Average]
  (min, avg, max) = (1.246, 1.254, 1.261), stdev = 0.006
  CI (99.9%): [1.239, 1.270] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:32
# Fork: 1 of 2
# Warmup Iteration   1: 12.084 ms/op
# Warmup Iteration   2: 7.428 ms/op
Iteration   1: 7.236 ms/op
Iteration   2: 7.244 ms/op
Iteration   3: 7.195 ms/op

# Run progress: 10.87% complete, ETA 00:08:19
# Fork: 2 of 2
# Warmup Iteration   1: 12.364 ms/op
# Warmup Iteration   2: 7.428 ms/op
Iteration   1: 7.239 ms/op
Iteration   2: 7.624 ms/op
Iteration   3: 7.223 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.293 ±(99.9%) 0.457 ms/op [Average]
  (min, avg, max) = (7.195, 7.293, 7.624), stdev = 0.163
  CI (99.9%): [6.836, 7.750] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:08:07
# Fork: 1 of 2
# Warmup Iteration   1: 14.241 ms/op
# Warmup Iteration   2: 8.295 ms/op
Iteration   1: 7.714 ms/op
Iteration   2: 7.716 ms/op
Iteration   3: 7.683 ms/op

# Run progress: 15.22% complete, ETA 00:07:55
# Fork: 2 of 2
# Warmup Iteration   1: 10.901 ms/op
# Warmup Iteration   2: 8.202 ms/op
Iteration   1: 7.723 ms/op
Iteration   2: 7.771 ms/op
Iteration   3: 7.652 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  7.710 ±(99.9%) 0.113 ms/op [Average]
  (min, avg, max) = (7.652, 7.710, 7.771), stdev = 0.040
  CI (99.9%): [7.597, 7.823] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:42
# Fork: 1 of 2
# Warmup Iteration   1: 21.136 ms/op
# Warmup Iteration   2: 14.986 ms/op
Iteration   1: 13.538 ms/op
Iteration   2: 13.392 ms/op
Iteration   3: 13.339 ms/op

# Run progress: 19.57% complete, ETA 00:07:30
# Fork: 2 of 2
# Warmup Iteration   1: 21.314 ms/op
# Warmup Iteration   2: 13.845 ms/op
Iteration   1: 13.438 ms/op
Iteration   2: 13.306 ms/op
Iteration   3: 13.281 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.382 ±(99.9%) 0.267 ms/op [Average]
  (min, avg, max) = (13.281, 13.382, 13.538), stdev = 0.095
  CI (99.9%): [13.115, 13.650] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:17
# Fork: 1 of 2
# Warmup Iteration   1: 2265.312 ms/op
# Warmup Iteration   2: 637.215 ms/op
Iteration   1: 505.875 ms/op
Iteration   2: 488.726 ms/op
Iteration   3: 481.892 ms/op

# Run progress: 23.91% complete, ETA 00:07:04
# Fork: 2 of 2
# Warmup Iteration   1: 2226.819 ms/op
# Warmup Iteration   2: 668.074 ms/op
Iteration   1: 521.742 ms/op
Iteration   2: 484.985 ms/op
Iteration   3: 485.133 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  494.725 ±(99.9%) 44.192 ms/op [Average]
  (min, avg, max) = (481.892, 494.725, 521.742), stdev = 15.759
  CI (99.9%): [450.533, 538.918] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:50
# Fork: 1 of 2
# Warmup Iteration   1: 4993.659 ms/op
# Warmup Iteration   2: 2670.723 ms/op
Iteration   1: 2442.498 ms/op
Iteration   2: 2371.611 ms/op
Iteration   3: 2333.982 ms/op

# Run progress: 28.26% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 4897.770 ms/op
# Warmup Iteration   2: 2582.985 ms/op
Iteration   1: 2427.486 ms/op
Iteration   2: 2365.822 ms/op
Iteration   3: 2341.388 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  2380.465 ±(99.9%) 125.655 ms/op [Average]
  (min, avg, max) = (2333.982, 2380.465, 2442.498), stdev = 44.810
  CI (99.9%): [2254.810, 2506.119] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 1204.859 ms/op
# Warmup Iteration   2: 514.008 ms/op
Iteration   1: 497.625 ms/op
Iteration   2: 492.038 ms/op
Iteration   3: 493.418 ms/op

# Run progress: 32.61% complete, ETA 00:06:26
# Fork: 2 of 2
# Warmup Iteration   1: 1213.427 ms/op
# Warmup Iteration   2: 532.294 ms/op
Iteration   1: 501.445 ms/op
Iteration   2: 500.248 ms/op
Iteration   3: 495.747 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  496.754 ±(99.9%) 10.444 ms/op [Average]
  (min, avg, max) = (492.038, 496.754, 501.445), stdev = 3.724
  CI (99.9%): [486.309, 507.198] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:13
# Fork: 1 of 2
# Warmup Iteration   1: 2521.053 ms/op
# Warmup Iteration   2: 1198.479 ms/op
Iteration   1: 1103.465 ms/op
Iteration   2: 1071.223 ms/op
Iteration   3: 1066.713 ms/op

# Run progress: 36.96% complete, ETA 00:05:59
# Fork: 2 of 2
# Warmup Iteration   1: 2525.275 ms/op
# Warmup Iteration   2: 1196.454 ms/op
Iteration   1: 1108.077 ms/op
Iteration   2: 1075.044 ms/op
Iteration   3: 1073.467 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1082.998 ±(99.9%) 50.253 ms/op [Average]
  (min, avg, max) = (1066.713, 1082.998, 1108.077), stdev = 17.921
  CI (99.9%): [1032.744, 1133.251] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:45
# Fork: 1 of 2
# Warmup Iteration   1: 0.147 ms/op
# Warmup Iteration   2: 0.100 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.099 ms/op

# Run progress: 41.30% complete, ETA 00:05:30
# Fork: 2 of 2
# Warmup Iteration   1: 0.150 ms/op
# Warmup Iteration   2: 0.103 ms/op
Iteration   1: 0.102 ms/op
Iteration   2: 0.102 ms/op
Iteration   3: 0.102 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.101 ±(99.9%) 0.006 ms/op [Average]
  (min, avg, max) = (0.099, 0.101, 0.102), stdev = 0.002
  CI (99.9%): [0.095, 0.106] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:15
# Fork: 1 of 2
# Warmup Iteration   1: 11.327 ms/op
# Warmup Iteration   2: 8.157 ms/op
Iteration   1: 8.085 ms/op
Iteration   2: 8.209 ms/op
Iteration   3: 8.075 ms/op

# Run progress: 45.65% complete, ETA 00:05:01
# Fork: 2 of 2
# Warmup Iteration   1: 11.397 ms/op
# Warmup Iteration   2: 8.170 ms/op
Iteration   1: 8.063 ms/op
Iteration   2: 7.702 ms/op
Iteration   3: 7.436 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.928 ±(99.9%) 0.828 ms/op [Average]
  (min, avg, max) = (7.436, 7.928, 8.209), stdev = 0.295
  CI (99.9%): [7.100, 8.757] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:47
# Fork: 1 of 2
# Warmup Iteration   1: 0.824 ms/op
# Warmup Iteration   2: 0.571 ms/op
Iteration   1: 0.571 ms/op
Iteration   2: 0.569 ms/op
Iteration   3: 0.569 ms/op

# Run progress: 50.00% complete, ETA 00:04:33
# Fork: 2 of 2
# Warmup Iteration   1: 0.825 ms/op
# Warmup Iteration   2: 0.572 ms/op
Iteration   1: 0.578 ms/op
Iteration   2: 0.572 ms/op
Iteration   3: 0.575 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.572 ±(99.9%) 0.009 ms/op [Average]
  (min, avg, max) = (0.569, 0.572, 0.578), stdev = 0.003
  CI (99.9%): [0.563, 0.582] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:20
# Fork: 1 of 2
# Warmup Iteration   1: 2.176 ms/op
# Warmup Iteration   2: 1.525 ms/op
Iteration   1: 1.488 ms/op
Iteration   2: 1.486 ms/op
Iteration   3: 1.491 ms/op

# Run progress: 54.35% complete, ETA 00:04:07
# Fork: 2 of 2
# Warmup Iteration   1: 2.140 ms/op
# Warmup Iteration   2: 1.533 ms/op
Iteration   1: 1.503 ms/op
Iteration   2: 1.495 ms/op
Iteration   3: 1.492 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.493 ±(99.9%) 0.016 ms/op [Average]
  (min, avg, max) = (1.486, 1.493, 1.503), stdev = 0.006
  CI (99.9%): [1.476, 1.509] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:54
# Fork: 1 of 2
# Warmup Iteration   1: 184.333 ms/op
# Warmup Iteration   2: 39.693 ms/op
Iteration   1: 38.032 ms/op
Iteration   2: 34.414 ms/op
Iteration   3: 30.845 ms/op

# Run progress: 58.70% complete, ETA 00:03:41
# Fork: 2 of 2
# Warmup Iteration   1: 182.991 ms/op
# Warmup Iteration   2: 51.389 ms/op
Iteration   1: 32.390 ms/op
Iteration   2: 24.151 ms/op
Iteration   3: 22.939 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  30.462 ±(99.9%) 16.505 ms/op [Average]
  (min, avg, max) = (22.939, 30.462, 38.032), stdev = 5.886
  CI (99.9%): [13.957, 46.967] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:29
# Fork: 1 of 2
# Warmup Iteration   1: 128897.892 ms/op
# Warmup Iteration   2: 125128.709 ms/op
Iteration   1: 124567.809 ms/op
Iteration   2: 124443.578 ms/op
Iteration   3: 124244.139 ms/op

# Run progress: 63.04% complete, ETA 00:09:19
# Fork: 2 of 2
# Warmup Iteration   1: 125875.323 ms/op
# Warmup Iteration   2: 122818.293 ms/op
Iteration   1: 122055.377 ms/op
Iteration   2: 121770.359 ms/op
Iteration   3: 121938.398 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  123169.943 ±(99.9%) 3854.685 ms/op [Average]
  (min, avg, max) = (121770.359, 123169.943, 124567.809), stdev = 1374.618
  CI (99.9%): [119315.259, 127024.628] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:13:57
# Fork: 1 of 2
# Warmup Iteration   1: 22020.892 ms/op
# Warmup Iteration   2: 23176.394 ms/op
Iteration   1: 15347.924 ms/op
Iteration   2: 23111.040 ms/op
Iteration   3: 15223.156 ms/op

# Run progress: 67.39% complete, ETA 00:17:11
# Fork: 2 of 2
# Warmup Iteration   1: 21875.319 ms/op
# Warmup Iteration   2: 23148.646 ms/op
Iteration   1: 15353.021 ms/op
Iteration   2: 22992.321 ms/op
Iteration   3: 15041.296 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  17844.793 ±(99.9%) 11314.903 ms/op [Average]
  (min, avg, max) = (15041.296, 17844.793, 23111.040), stdev = 4035.003
  CI (99.9%): [6529.890, 29159.696] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:19:37
# Fork: 1 of 2
# Warmup Iteration   1: 10621.873 ms/op
# Warmup Iteration   2: 7913.706 ms/op
Iteration   1: 7877.097 ms/op
Iteration   2: 7720.377 ms/op
Iteration   3: 7728.844 ms/op

# Run progress: 71.74% complete, ETA 00:17:57
# Fork: 2 of 2
# Warmup Iteration   1: 10272.114 ms/op
# Warmup Iteration   2: 7816.515 ms/op
Iteration   1: 7792.980 ms/op
Iteration   2: 7647.414 ms/op
Iteration   3: 7668.438 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  7739.192 ±(99.9%) 237.286 ms/op [Average]
  (min, avg, max) = (7647.414, 7739.192, 7877.097), stdev = 84.619
  CI (99.9%): [7501.906, 7976.478] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:16:19
# Fork: 1 of 2
# Warmup Iteration   1: Nov 13, 2026 6:08:23 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 6:08:23 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
88.266 ms/op
# Warmup Iteration   2: 58.220 ms/op
Iteration   1: 57.906 ms/op
Iteration   2: 57.453 ms/op
Iteration   3: 57.262 ms/op

# Run progress: 76.09% complete, ETA 00:14:35
# Fork: 2 of 2
# Warmup Iteration   1: Nov 13, 2026 6:08:34 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 6:08:34 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
81.513 ms/op
# Warmup Iteration   2: 57.052 ms/op
Iteration   1: 57.141 ms/op
Iteration   2: 56.906 ms/op
Iteration   3: 56.623 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  57.215 ±(99.9%) 1.247 ms/op [Average]
  (min, avg, max) = (56.623, 57.215, 57.906), stdev = 0.445
  CI (99.9%): [55.968, 58.462] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:12:57
# Fork: 1 of 2
# Warmup Iteration   1: 64.741 ms/op
# Warmup Iteration   2: 62.911 ms/op
Iteration   1: 62.019 ms/op
Iteration   2: 62.026 ms/op
Iteration   3: 61.935 ms/op

# Run progress: 80.43% complete, ETA 00:11:23
# Fork: 2 of 2
# Warmup Iteration   1: 74.789 ms/op
# Warmup Iteration   2: 62.197 ms/op
Iteration   1: 61.456 ms/op
Iteration   2: 61.862 ms/op
Iteration   3: 61.054 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  61.725 ±(99.9%) 1.095 ms/op [Average]
  (min, avg, max) = (61.054, 61.725, 62.026), stdev = 0.390
  CI (99.9%): [60.631, 62.820] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:09:54
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:08:28
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

# Run progress: 86.96% complete, ETA 00:07:06
# Fork: 1 of 2
# Warmup Iteration   1: 31.854 ms/op
# Warmup Iteration   2: 24.301 ms/op
Iteration   1: 23.300 ms/op
Iteration   2: 23.211 ms/op
Iteration   3: 23.016 ms/op

# Run progress: 89.13% complete, ETA 00:05:48
# Fork: 2 of 2
# Warmup Iteration   1: 31.604 ms/op
# Warmup Iteration   2: 24.501 ms/op
Iteration   1: 23.403 ms/op
Iteration   2: 23.386 ms/op
Iteration   3: 23.350 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  23.278 ±(99.9%) 0.408 ms/op [Average]
  (min, avg, max) = (23.016, 23.278, 23.403), stdev = 0.146
  CI (99.9%): [22.869, 23.686] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:04:33
# Fork: 1 of 2
# Warmup Iteration   1: 14.328 ms/op
# Warmup Iteration   2: 10.335 ms/op
Iteration   1: 10.024 ms/op
Iteration   2: 9.860 ms/op
Iteration   3: 9.845 ms/op

# Run progress: 93.48% complete, ETA 00:03:20
# Fork: 2 of 2
# Warmup Iteration   1: 18.107 ms/op
# Warmup Iteration   2: 13.084 ms/op
Iteration   1: 12.959 ms/op
Iteration   2: 12.647 ms/op
Iteration   3: 12.683 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  11.336 ±(99.9%) 4.397 ms/op [Average]
  (min, avg, max) = (9.845, 11.336, 12.959), stdev = 1.568
  CI (99.9%): [6.940, 15.733] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:02:11
# Fork: 1 of 2
# Warmup Iteration   1: 36.784 ms/op
# Warmup Iteration   2: 31.629 ms/op
Iteration   1: 31.578 ms/op
Iteration   2: 31.487 ms/op
Iteration   3: 31.566 ms/op

# Run progress: 97.83% complete, ETA 00:01:04
# Fork: 2 of 2
# Warmup Iteration   1: 28.627 ms/op
# Warmup Iteration   2: 24.753 ms/op
Iteration   1: 24.653 ms/op
Iteration   2: 24.626 ms/op
Iteration   3: 24.675 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  28.097 ±(99.9%) 10.586 ms/op [Average]
  (min, avg, max) = (24.626, 28.097, 31.578), stdev = 3.775
  CI (99.9%): [17.511, 38.684] (assumes normal distribution)


# Run complete. Total time: 00:48:35

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

Benchmark                                                                                            (model)  (nodes)  Mode  Cnt       Score       Error  Units
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6      23.936 ±     2.529  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6       1.254 ±     0.016  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6       7.293 ±     0.457  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6       7.710 ±     0.113  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      13.382 ±     0.267  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6     494.725 ±    44.192  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    2380.465 ±   125.655  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6     496.754 ±    10.444  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    1082.998 ±    50.253  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6       0.101 ±     0.006  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6       7.928 ±     0.828  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6       0.572 ±     0.009  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6       1.493 ±     0.016  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6      30.462 ±    16.505  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  123169.943 ±  3854.685  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   17844.793 ± 11314.903  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6    7739.192 ±   237.286  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6      57.215 ±     1.247  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6      61.725 ±     1.095  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6      ≈ 10⁻³              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      23.278 ±     0.408  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      11.336 ±     4.397  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6      28.097 ±    10.586  ms/op

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
[INFO] Total time:  5.546 s
[INFO] Finished at: 2026-11-13T18:10:48Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.27.0 (neqsim-3.27.0.jar); requested: 3.27.0
$ mvn clean verify -Dneqsim.version=3.27.0
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
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 8820 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5447778e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018746111, composition error=0.0030123554
TEG recycle lean TEG resycle: solved=true, flow error=3.9968029e-14, composition error=4.7067410e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.871 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.356 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.071 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 492550 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 59 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    9.80e-04 (tolerance: 1.00e-03) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.39e-06 (tolerance: 1.00e-03) OK [worst: expander process B::NGL column -> gasOutStream]
  Pressure:     6.76e-08 (tolerance: 1.00e-03) OK [worst: expander process B::gas split valve -> gas split valve out stream]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: no tolerance given - using the engineering default 1.0e-03 relative on flow, temperature and pressure
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 0.259 of feed exceeds 0.00100 (reported, not gating) - non-recycle units are creating or destroying mass, which the recycle-tear gate does not cover. Worst: compressor process B::TEE-104 4.843e+06 kg/hr, compressor process B::KA27841 4.466e+06 kg/hr, export and utilities::gas export pipeline 2.646e+05 kg/hr

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264558.0 + 377857.7, oil 1995396.7 + 2850665.0, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 38.004 MSm3/d, KA27841 A 100.3 bara, pipeline outlet 2.0 bara
[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 492.6 s <<< FAILURE! -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[ERROR] com.equinor.neqsim.benchmark.OilGasPlatformModelTest.platformModelSolves -- Time elapsed: 492.6 s <<< FAILURE!
org.opentest4j.AssertionFailedError: export gas 38.00375342760483 ==> expected: <true> but was: <false>
	at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
	at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)
	at org.junit.jupiter.api.AssertTrue.failNotTrue(AssertTrue.java:63)
	at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:36)
	at org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:214)
	at com.equinor.neqsim.benchmark.OilGasPlatformModelTest.platformModelSolves(OilGasPlatformModelTest.java:73)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)

[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (8 ms)
tpFlashWellFluidSrk                                            83.6406  (69 ms)
tpFlashWellFluidPr                                             83.6541  (50 ms)
tpFlashWellFluidWithProperties                                 5445.37  (39 ms)
phAndPsFlashWellFluid                                          2459.22  (59 ms)
Nov 13, 2026 6:19:21 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 6:19:21 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00976303  (192 ms)
gasOilSurfaceTension[Simple Gradient Theory]                0.00976303  (107 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (304 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (49 ms)
saturationPointsWellFluid                                      1601.32  (165 ms)
singlePhaseGasPipelineSteadyState                              121.629  (892 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98718  (1816 ms)
levenbergMarquardtAntoine                                      1837.31  (7 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (14 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.656 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Failures: 
[ERROR]   OilGasPlatformModelTest.platformModelSolves:73 export gas 38.00375342760483 ==> expected: <true> but was: <false>
[INFO] 
[ERROR] Tests run: 10, Failures: 1, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  08:35 min
[INFO] Finished at: 2026-11-13T18:19:25Z
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
| baseline | 3.26.0 | passed |
| current | 3.27.0 | failed (exit 1) |

Incomplete timing comparison: Maven build failures were recorded. No overall gain is available.

```
