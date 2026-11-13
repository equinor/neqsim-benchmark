# NeqSim 3.27.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.26.0 |
| Current | 3.27.0 |
| Source commit | `24f01acea009fa3ebfb689deaf1a98dd5a98ffbf` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43484026927) |
| Status | incomplete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "24f01acea009fa3ebfb689deaf1a98dd5a98ffbf",
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
[INFO] Total time:  11.692 s
[INFO] Finished at: 2026-11-13T18:35:22Z
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
TEG full process: 10773 ms, solved=true, gas=318849.58 kg/hr, water in/out=0.00027104531/1.5400949e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00019284321, composition error=0.0030760310
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=4.7854811e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.83 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.259 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.078 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 751891 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 751.9 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (8 ms)
tpFlashWellFluidSrk                                            83.6406  (53 ms)
tpFlashWellFluidPr                                             83.6541  (55 ms)
tpFlashWellFluidWithProperties                                 5445.46  (53 ms)
phAndPsFlashWellFluid                                          2459.23  (81 ms)
Nov 13, 2026 6:48:20 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 6:48:21 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (606 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (305 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (231 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (101 ms)
saturationPointsWellFluid                                      1601.32  (189 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1025 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98717  (1729 ms)
levenbergMarquardtAntoine                                      1837.31  (9 ms)
levenbergMarquardtDoubleExponential                            5.57177  (8 ms)
dataReconciliation[20]                                         7.89841  (5 ms)
dataReconciliation[100]                                        37.0132  (21 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.475 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  13:12 min
[INFO] Finished at: 2026-11-13T18:48:35Z
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
# Warmup Iteration   1: 32.364 ms/op
# Warmup Iteration   2: 23.148 ms/op
Iteration   1: 23.127 ms/op
Iteration   2: 23.016 ms/op
Iteration   3: 22.949 ms/op

# Run progress: 2.17% complete, ETA 00:09:04
# Fork: 2 of 2
# Warmup Iteration   1: 29.286 ms/op
# Warmup Iteration   2: 23.014 ms/op
Iteration   1: 22.960 ms/op
Iteration   2: 22.956 ms/op
Iteration   3: 22.859 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  22.978 ±(99.9%) 0.249 ms/op [Average]
  (min, avg, max) = (22.859, 22.978, 23.127), stdev = 0.089
  CI (99.9%): [22.729, 23.227] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:54
# Fork: 1 of 2
# Warmup Iteration   1: 2.562 ms/op
# Warmup Iteration   2: 1.309 ms/op
Iteration   1: 1.234 ms/op
Iteration   2: 1.237 ms/op
Iteration   3: 1.237 ms/op

# Run progress: 6.52% complete, ETA 00:08:41
# Fork: 2 of 2
# Warmup Iteration   1: 2.441 ms/op
# Warmup Iteration   2: 1.337 ms/op
Iteration   1: 1.257 ms/op
Iteration   2: 1.258 ms/op
Iteration   3: 1.257 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.247 ±(99.9%) 0.033 ms/op [Average]
  (min, avg, max) = (1.234, 1.247, 1.258), stdev = 0.012
  CI (99.9%): [1.214, 1.279] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:28
# Fork: 1 of 2
# Warmup Iteration   1: 12.915 ms/op
# Warmup Iteration   2: 7.419 ms/op
Iteration   1: 7.169 ms/op
Iteration   2: 7.194 ms/op
Iteration   3: 7.309 ms/op

# Run progress: 10.87% complete, ETA 00:08:16
# Fork: 2 of 2
# Warmup Iteration   1: 10.261 ms/op
# Warmup Iteration   2: 7.493 ms/op
Iteration   1: 7.233 ms/op
Iteration   2: 7.201 ms/op
Iteration   3: 7.171 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.213 ±(99.9%) 0.147 ms/op [Average]
  (min, avg, max) = (7.169, 7.213, 7.309), stdev = 0.053
  CI (99.9%): [7.066, 7.360] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:08:03
# Fork: 1 of 2
# Warmup Iteration   1: 13.120 ms/op
# Warmup Iteration   2: 7.863 ms/op
Iteration   1: 7.723 ms/op
Iteration   2: 7.747 ms/op
Iteration   3: 7.669 ms/op

# Run progress: 15.22% complete, ETA 00:07:52
# Fork: 2 of 2
# Warmup Iteration   1: 11.262 ms/op
# Warmup Iteration   2: 7.961 ms/op
Iteration   1: 7.734 ms/op
Iteration   2: 7.806 ms/op
Iteration   3: 7.680 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  7.727 ±(99.9%) 0.138 ms/op [Average]
  (min, avg, max) = (7.669, 7.727, 7.806), stdev = 0.049
  CI (99.9%): [7.588, 7.865] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:39
# Fork: 1 of 2
# Warmup Iteration   1: 20.919 ms/op
# Warmup Iteration   2: 13.581 ms/op
Iteration   1: 13.347 ms/op
Iteration   2: 13.241 ms/op
Iteration   3: 13.191 ms/op

# Run progress: 19.57% complete, ETA 00:07:27
# Fork: 2 of 2
# Warmup Iteration   1: 23.673 ms/op
# Warmup Iteration   2: 13.632 ms/op
Iteration   1: 13.375 ms/op
Iteration   2: 13.237 ms/op
Iteration   3: 13.503 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.316 ±(99.9%) 0.325 ms/op [Average]
  (min, avg, max) = (13.191, 13.316, 13.503), stdev = 0.116
  CI (99.9%): [12.991, 13.640] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:15
# Fork: 1 of 2
# Warmup Iteration   1: 2176.115 ms/op
# Warmup Iteration   2: 684.976 ms/op
Iteration   1: 511.213 ms/op
Iteration   2: 479.346 ms/op
Iteration   3: 478.280 ms/op

# Run progress: 23.91% complete, ETA 00:07:00
# Fork: 2 of 2
# Warmup Iteration   1: 2253.262 ms/op
# Warmup Iteration   2: 768.030 ms/op
Iteration   1: 507.891 ms/op
Iteration   2: 478.500 ms/op
Iteration   3: 482.305 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  489.589 ±(99.9%) 43.648 ms/op [Average]
  (min, avg, max) = (478.280, 489.589, 511.213), stdev = 15.565
  CI (99.9%): [445.941, 533.237] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:47
# Fork: 1 of 2
# Warmup Iteration   1: 5276.003 ms/op
# Warmup Iteration   2: 2949.825 ms/op
Iteration   1: 2412.433 ms/op
Iteration   2: 2377.045 ms/op
Iteration   3: 2317.794 ms/op

# Run progress: 28.26% complete, ETA 00:06:45
# Fork: 2 of 2
# Warmup Iteration   1: 4927.936 ms/op
# Warmup Iteration   2: 2760.840 ms/op
Iteration   1: 2354.731 ms/op
Iteration   2: 2325.755 ms/op
Iteration   3: 2358.169 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  2357.655 ±(99.9%) 97.074 ms/op [Average]
  (min, avg, max) = (2317.794, 2357.655, 2412.433), stdev = 34.618
  CI (99.9%): [2260.580, 2454.729] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:39
# Fork: 1 of 2
# Warmup Iteration   1: 1203.640 ms/op
# Warmup Iteration   2: 523.719 ms/op
Iteration   1: 498.139 ms/op
Iteration   2: 491.852 ms/op
Iteration   3: 488.736 ms/op

# Run progress: 32.61% complete, ETA 00:06:25
# Fork: 2 of 2
# Warmup Iteration   1: 1225.638 ms/op
# Warmup Iteration   2: 518.900 ms/op
Iteration   1: 498.085 ms/op
Iteration   2: 495.802 ms/op
Iteration   3: 493.091 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  494.284 ±(99.9%) 10.472 ms/op [Average]
  (min, avg, max) = (488.736, 494.284, 498.139), stdev = 3.735
  CI (99.9%): [483.812, 504.756] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2356.718 ms/op
# Warmup Iteration   2: 1188.512 ms/op
Iteration   1: 1099.546 ms/op
Iteration   2: 1068.555 ms/op
Iteration   3: 1068.073 ms/op

# Run progress: 36.96% complete, ETA 00:05:58
# Fork: 2 of 2
# Warmup Iteration   1: 2479.051 ms/op
# Warmup Iteration   2: 1201.995 ms/op
Iteration   1: 1090.801 ms/op
Iteration   2: 1062.583 ms/op
Iteration   3: 1058.053 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1074.602 ±(99.9%) 46.623 ms/op [Average]
  (min, avg, max) = (1058.053, 1074.602, 1099.546), stdev = 16.626
  CI (99.9%): [1027.979, 1121.225] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.165 ms/op
# Warmup Iteration   2: 0.100 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.099 ms/op

# Run progress: 41.30% complete, ETA 00:05:30
# Fork: 2 of 2
# Warmup Iteration   1: 0.155 ms/op
# Warmup Iteration   2: 0.099 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.102 ms/op
Iteration   3: 0.099 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.099 ±(99.9%) 0.003 ms/op [Average]
  (min, avg, max) = (0.099, 0.099, 0.102), stdev = 0.001
  CI (99.9%): [0.096, 0.103] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 11.326 ms/op
# Warmup Iteration   2: 8.146 ms/op
Iteration   1: 8.089 ms/op
Iteration   2: 8.053 ms/op
Iteration   3: 8.019 ms/op

# Run progress: 45.65% complete, ETA 00:05:00
# Fork: 2 of 2
# Warmup Iteration   1: 10.608 ms/op
# Warmup Iteration   2: 7.514 ms/op
Iteration   1: 7.426 ms/op
Iteration   2: 7.930 ms/op
Iteration   3: 8.039 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.926 ±(99.9%) 0.703 ms/op [Average]
  (min, avg, max) = (7.426, 7.926, 8.089), stdev = 0.251
  CI (99.9%): [7.223, 8.629] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:46
# Fork: 1 of 2
# Warmup Iteration   1: 0.825 ms/op
# Warmup Iteration   2: 0.568 ms/op
Iteration   1: 0.566 ms/op
Iteration   2: 0.566 ms/op
Iteration   3: 0.567 ms/op

# Run progress: 50.00% complete, ETA 00:04:33
# Fork: 2 of 2
# Warmup Iteration   1: 0.817 ms/op
# Warmup Iteration   2: 0.567 ms/op
Iteration   1: 0.564 ms/op
Iteration   2: 0.563 ms/op
Iteration   3: 0.566 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.566 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.563, 0.566, 0.567), stdev = 0.001
  CI (99.9%): [0.561, 0.570] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:19
# Fork: 1 of 2
# Warmup Iteration   1: 2.148 ms/op
# Warmup Iteration   2: 1.523 ms/op
Iteration   1: 1.503 ms/op
Iteration   2: 1.497 ms/op
Iteration   3: 1.498 ms/op

# Run progress: 54.35% complete, ETA 00:04:06
# Fork: 2 of 2
# Warmup Iteration   1: 2.124 ms/op
# Warmup Iteration   2: 1.500 ms/op
Iteration   1: 1.506 ms/op
Iteration   2: 1.475 ms/op
Iteration   3: 1.479 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.493 ±(99.9%) 0.036 ms/op [Average]
  (min, avg, max) = (1.475, 1.493, 1.506), stdev = 0.013
  CI (99.9%): [1.457, 1.529] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:53
# Fork: 1 of 2
# Warmup Iteration   1: 182.906 ms/op
# Warmup Iteration   2: 50.631 ms/op
Iteration   1: 40.838 ms/op
Iteration   2: 31.437 ms/op
Iteration   3: 22.982 ms/op

# Run progress: 58.70% complete, ETA 00:03:41
# Fork: 2 of 2
# Warmup Iteration   1: 171.146 ms/op
# Warmup Iteration   2: 48.286 ms/op
Iteration   1: 30.650 ms/op
Iteration   2: 23.275 ms/op
Iteration   3: 22.044 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  28.538 ±(99.9%) 20.411 ms/op [Average]
  (min, avg, max) = (22.044, 28.538, 40.838), stdev = 7.279
  CI (99.9%): [8.127, 48.948] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 125682.440 ms/op
# Warmup Iteration   2: 121627.542 ms/op
Iteration   1: 120888.063 ms/op
Iteration   2: 120890.097 ms/op
Iteration   3: 120747.237 ms/op

# Run progress: 63.04% complete, ETA 00:09:08
# Fork: 2 of 2
# Warmup Iteration   1: 127458.785 ms/op
# Warmup Iteration   2: 124364.037 ms/op
Iteration   1: 123727.773 ms/op
Iteration   2: 123475.652 ms/op
Iteration   3: 123421.694 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  122191.753 ±(99.9%) 4159.480 ms/op [Average]
  (min, avg, max) = (120747.237, 122191.753, 123727.773), stdev = 1483.310
  CI (99.9%): [118032.273, 126351.232] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:13:52
# Fork: 1 of 2
# Warmup Iteration   1: 21562.319 ms/op
# Warmup Iteration   2: 22796.401 ms/op
Iteration   1: 15027.177 ms/op
Iteration   2: 22647.981 ms/op
Iteration   3: 14863.296 ms/op

# Run progress: 67.39% complete, ETA 00:17:00
# Fork: 2 of 2
# Warmup Iteration   1: 21621.071 ms/op
# Warmup Iteration   2: 22732.624 ms/op
Iteration   1: 14992.199 ms/op
Iteration   2: 22654.325 ms/op
Iteration   3: 14834.530 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  17503.251 ±(99.9%) 11183.719 ms/op [Average]
  (min, avg, max) = (14834.530, 17503.251, 22654.325), stdev = 3988.222
  CI (99.9%): [6319.532, 28686.971] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:19:23
# Fork: 1 of 2
# Warmup Iteration   1: 10529.764 ms/op
# Warmup Iteration   2: 7810.884 ms/op
Iteration   1: 7859.673 ms/op
Iteration   2: 7689.187 ms/op
Iteration   3: 7666.932 ms/op

# Run progress: 71.74% complete, ETA 00:17:43
# Fork: 2 of 2
# Warmup Iteration   1: 10352.975 ms/op
# Warmup Iteration   2: 7845.641 ms/op
Iteration   1: 7664.700 ms/op
Iteration   2: 7619.467 ms/op
Iteration   3: 7587.804 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  7681.294 ±(99.9%) 265.810 ms/op [Average]
  (min, avg, max) = (7587.804, 7681.294, 7859.673), stdev = 94.790
  CI (99.9%): [7415.484, 7947.103] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: Nov 13, 2026 7:34:19 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 7:34:19 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
87.441 ms/op
# Warmup Iteration   2: 56.979 ms/op
Iteration   1: 56.937 ms/op
Iteration   2: 56.571 ms/op
Iteration   3: 56.517 ms/op

# Run progress: 76.09% complete, ETA 00:14:25
# Fork: 2 of 2
# Warmup Iteration   1: Nov 13, 2026 7:34:31 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 7:34:31 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
81.161 ms/op
# Warmup Iteration   2: 58.351 ms/op
Iteration   1: 58.560 ms/op
Iteration   2: 57.152 ms/op
Iteration   3: 56.859 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  57.099 ±(99.9%) 2.113 ms/op [Average]
  (min, avg, max) = (56.517, 57.099, 58.560), stdev = 0.753
  CI (99.9%): [54.987, 59.212] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:12:48
# Fork: 1 of 2
# Warmup Iteration   1: 75.953 ms/op
# Warmup Iteration   2: 64.066 ms/op
Iteration   1: 62.792 ms/op
Iteration   2: 62.792 ms/op
Iteration   3: 62.609 ms/op

# Run progress: 80.43% complete, ETA 00:11:15
# Fork: 2 of 2
# Warmup Iteration   1: 66.776 ms/op
# Warmup Iteration   2: 62.938 ms/op
Iteration   1: 61.204 ms/op
Iteration   2: 61.286 ms/op
Iteration   3: 60.879 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  61.927 ±(99.9%) 2.506 ms/op [Average]
  (min, avg, max) = (60.879, 61.927, 62.792), stdev = 0.894
  CI (99.9%): [59.421, 64.433] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 33.376 ms/op
# Warmup Iteration   2: 24.110 ms/op
Iteration   1: 23.426 ms/op
Iteration   2: 24.524 ms/op
Iteration   3: 23.071 ms/op

# Run progress: 89.13% complete, ETA 00:05:44
# Fork: 2 of 2
# Warmup Iteration   1: 32.603 ms/op
# Warmup Iteration   2: 24.401 ms/op
Iteration   1: 23.393 ms/op
Iteration   2: 23.262 ms/op
Iteration   3: 23.227 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  23.484 ±(99.9%) 1.473 ms/op [Average]
  (min, avg, max) = (23.071, 23.484, 24.524), stdev = 0.525
  CI (99.9%): [22.011, 24.957] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:04:29
# Fork: 1 of 2
# Warmup Iteration   1: 15.084 ms/op
# Warmup Iteration   2: 10.181 ms/op
Iteration   1: 9.864 ms/op
Iteration   2: 9.781 ms/op
Iteration   3: 9.808 ms/op

# Run progress: 93.48% complete, ETA 00:03:18
# Fork: 2 of 2
# Warmup Iteration   1: 13.800 ms/op
# Warmup Iteration   2: 10.069 ms/op
Iteration   1: 9.905 ms/op
Iteration   2: 9.785 ms/op
Iteration   3: 9.755 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.816 ±(99.9%) 0.160 ms/op [Average]
  (min, avg, max) = (9.755, 9.816, 9.905), stdev = 0.057
  CI (99.9%): [9.657, 9.976] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:02:09
# Fork: 1 of 2
# Warmup Iteration   1: 29.503 ms/op
# Warmup Iteration   2: 24.844 ms/op
Iteration   1: 24.730 ms/op
Iteration   2: 24.811 ms/op
Iteration   3: 24.808 ms/op

# Run progress: 97.83% complete, ETA 00:01:03
# Fork: 2 of 2
# Warmup Iteration   1: 29.088 ms/op
# Warmup Iteration   2: 24.711 ms/op
Iteration   1: 24.635 ms/op
Iteration   2: 24.797 ms/op
Iteration   3: 24.643 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  24.737 ±(99.9%) 0.228 ms/op [Average]
  (min, avg, max) = (24.635, 24.737, 24.811), stdev = 0.081
  CI (99.9%): [24.509, 24.966] (assumes normal distribution)


# Run complete. Total time: 00:48:01

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6      22.978 ±     0.249  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6       1.247 ±     0.033  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6       7.213 ±     0.147  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6       7.727 ±     0.138  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      13.316 ±     0.325  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6     489.589 ±    43.648  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    2357.655 ±    97.074  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6     494.284 ±    10.472  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    1074.602 ±    46.623  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6       0.099 ±     0.003  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6       7.926 ±     0.703  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6       0.566 ±     0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6       1.493 ±     0.036  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6      28.538 ±    20.411  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  122191.753 ±  4159.480  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   17503.251 ± 11183.719  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6    7681.294 ±   265.810  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6      57.099 ±     2.113  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6      61.927 ±     2.506  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6      ≈ 10⁻³              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      23.484 ±     1.473  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6       9.816 ±     0.160  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6      24.737 ±     0.228  ms/op

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
[INFO] Total time:  3.240 s
[INFO] Finished at: 2026-11-13T19:36:41Z
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
TEG full process: 8853 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5447778e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018746111, composition error=0.0030123554
TEG recycle lean TEG resycle: solved=true, flow error=3.9968029e-14, composition error=4.7067410e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.909 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.212 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.050 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 497484 ms
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
[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 497.5 s <<< FAILURE! -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[ERROR] com.equinor.neqsim.benchmark.OilGasPlatformModelTest.platformModelSolves -- Time elapsed: 497.5 s <<< FAILURE!
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
tpFlashLeanGas                                                 60.0000  (10 ms)
tpFlashWellFluidSrk                                            83.6406  (80 ms)
tpFlashWellFluidPr                                             83.6541  (85 ms)
tpFlashWellFluidWithProperties                                 5445.37  (107 ms)
phAndPsFlashWellFluid                                          2459.22  (187 ms)
Nov 13, 2026 7:45:21 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 7:45:21 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00976303  (230 ms)
gasOilSurfaceTension[Simple Gradient Theory]                0.00976303  (109 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (379 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (45 ms)
saturationPointsWellFluid                                      1601.32  (163 ms)
singlePhaseGasPipelineSteadyState                              121.629  (915 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98718  (1802 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (6 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (8 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.127 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  08:42 min
[INFO] Finished at: 2026-11-13T19:45:25Z
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
