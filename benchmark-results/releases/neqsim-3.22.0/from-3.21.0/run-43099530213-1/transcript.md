# NeqSim 3.22.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.21.0 |
| Current | 3.22.0 |
| Source commit | `1d3b0a708b1a352cdb58c65b85a0d6d39d7b837a` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43099530213) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "1d3b0a708b1a352cdb58c65b85a0d6d39d7b837a",
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
Linux runnervmwuk1x 7.0.0-1019-azure #20-Ubuntu SMP PREEMPT Mon Oct 19 22:41:16 UTC 2026 x86_64 GNU/Linux
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
BogoMIPS:                                4890.86
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
| baseline | 3.21.0 | passed |
| current | 3.22.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.21.0",
  "version": "3.21.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.21.0/neqsim-3.21.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.22.0",
  "version": "3.22.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.22.0/neqsim-3.22.0.jar",
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
[INFO] Total time:  6.094 s
[INFO] Finished at: 2026-11-11T21:02:17Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.21.0 (neqsim-3.21.0.jar); requested: 3.21.0
$ mvn clean verify -Dneqsim.version=3.21.0
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
TEG full process: 10755 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.80 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.371 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.119 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 487670 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 30 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    6.30e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.70e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     7.39e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.70e-03 after 30 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 0.000101 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 263973.7 + 376479.9, oil 1995064.2 + 2849922.4, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.387 MSm3/d, KA27841 A 102.7 bara, pipeline outlet 51.8 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 487.7 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (7 ms)
tpFlashWellFluidSrk                                            83.6406  (49 ms)
tpFlashWellFluidPr                                             83.6541  (51 ms)
tpFlashWellFluidWithProperties                                 5445.46  (52 ms)
phAndPsFlashWellFluid                                          2459.23  (95 ms)
Nov 11, 2026 9:10:51 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 11, 2026 9:10:51 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (797 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (364 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (160 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (66 ms)
saturationPointsWellFluid                                      1601.32  (174 ms)
singlePhaseGasPipelineSteadyState                              121.628  (837 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1671 ms)
levenbergMarquardtAntoine                                      1837.31  (7 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (9 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.854 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.21.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] commons-math3-3.6.1.jar, neqsim-3.21.0.jar define 1301 overlapping classes: 
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
[INFO] Total time:  08:47 min
[INFO] Finished at: 2026-11-11T21:11:05Z
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
# Warmup Iteration   1: 29.325 ms/op
# Warmup Iteration   2: 23.175 ms/op
Iteration   1: 22.830 ms/op
Iteration   2: 22.841 ms/op
Iteration   3: 22.642 ms/op

# Run progress: 2.17% complete, ETA 00:08:50
# Fork: 2 of 2
# Warmup Iteration   1: 32.316 ms/op
# Warmup Iteration   2: 22.804 ms/op
Iteration   1: 22.874 ms/op
Iteration   2: 22.739 ms/op
Iteration   3: 22.810 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  22.789 ±(99.9%) 0.238 ms/op [Average]
  (min, avg, max) = (22.642, 22.789, 22.874), stdev = 0.085
  CI (99.9%): [22.551, 23.027] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:38
# Fork: 1 of 2
# Warmup Iteration   1: 2.409 ms/op
# Warmup Iteration   2: 1.514 ms/op
Iteration   1: 1.509 ms/op
Iteration   2: 1.471 ms/op
Iteration   3: 1.465 ms/op

# Run progress: 6.52% complete, ETA 00:08:27
# Fork: 2 of 2
# Warmup Iteration   1: 3.058 ms/op
# Warmup Iteration   2: 1.516 ms/op
Iteration   1: 1.488 ms/op
Iteration   2: 1.449 ms/op
Iteration   3: 1.446 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.471 ±(99.9%) 0.067 ms/op [Average]
  (min, avg, max) = (1.446, 1.471, 1.509), stdev = 0.024
  CI (99.9%): [1.404, 1.538] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 11.066 ms/op
# Warmup Iteration   2: 7.599 ms/op
Iteration   1: 7.290 ms/op
Iteration   2: 7.286 ms/op
Iteration   3: 7.245 ms/op

# Run progress: 10.87% complete, ETA 00:08:02
# Fork: 2 of 2
# Warmup Iteration   1: 10.236 ms/op
# Warmup Iteration   2: 7.423 ms/op
Iteration   1: 7.328 ms/op
Iteration   2: 7.253 ms/op
Iteration   3: 7.267 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.278 ±(99.9%) 0.085 ms/op [Average]
  (min, avg, max) = (7.245, 7.278, 7.328), stdev = 0.030
  CI (99.9%): [7.193, 7.363] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:50
# Fork: 1 of 2
# Warmup Iteration   1: 13.935 ms/op
# Warmup Iteration   2: 7.848 ms/op
Iteration   1: 7.815 ms/op
Iteration   2: 7.812 ms/op
Iteration   3: 7.809 ms/op

# Run progress: 15.22% complete, ETA 00:07:38
# Fork: 2 of 2
# Warmup Iteration   1: 13.535 ms/op
# Warmup Iteration   2: 7.834 ms/op
Iteration   1: 7.779 ms/op
Iteration   2: 7.778 ms/op
Iteration   3: 7.817 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  7.802 ±(99.9%) 0.052 ms/op [Average]
  (min, avg, max) = (7.778, 7.802, 7.817), stdev = 0.018
  CI (99.9%): [7.750, 7.853] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:27
# Fork: 1 of 2
# Warmup Iteration   1: 29.903 ms/op
# Warmup Iteration   2: 14.855 ms/op
Iteration   1: 13.397 ms/op
Iteration   2: 13.243 ms/op
Iteration   3: 13.213 ms/op

# Run progress: 19.57% complete, ETA 00:07:15
# Fork: 2 of 2
# Warmup Iteration   1: 28.216 ms/op
# Warmup Iteration   2: 13.934 ms/op
Iteration   1: 13.367 ms/op
Iteration   2: 13.255 ms/op
Iteration   3: 13.216 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.282 ±(99.9%) 0.223 ms/op [Average]
  (min, avg, max) = (13.213, 13.282, 13.397), stdev = 0.080
  CI (99.9%): [13.058, 13.505] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:03
# Fork: 1 of 2
# Warmup Iteration   1: 2078.173 ms/op
# Warmup Iteration   2: 550.775 ms/op
Iteration   1: 458.630 ms/op
Iteration   2: 438.972 ms/op
Iteration   3: 429.849 ms/op

# Run progress: 23.91% complete, ETA 00:06:49
# Fork: 2 of 2
# Warmup Iteration   1: 2119.467 ms/op
# Warmup Iteration   2: 614.991 ms/op
Iteration   1: 466.898 ms/op
Iteration   2: 459.650 ms/op
Iteration   3: 447.424 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  450.237 ±(99.9%) 39.401 ms/op [Average]
  (min, avg, max) = (429.849, 450.237, 466.898), stdev = 14.051
  CI (99.9%): [410.836, 489.638] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:38
# Fork: 1 of 2
# Warmup Iteration   1: 2312.333 ms/op
# Warmup Iteration   2: 697.513 ms/op
Iteration   1: 506.726 ms/op
Iteration   2: 489.335 ms/op
Iteration   3: 485.381 ms/op

# Run progress: 28.26% complete, ETA 00:06:26
# Fork: 2 of 2
# Warmup Iteration   1: 2313.273 ms/op
# Warmup Iteration   2: 676.471 ms/op
Iteration   1: 523.101 ms/op
Iteration   2: 513.840 ms/op
Iteration   3: 525.916 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  507.383 ±(99.9%) 47.630 ms/op [Average]
  (min, avg, max) = (485.381, 507.383, 525.916), stdev = 16.985
  CI (99.9%): [459.753, 555.014] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:12
# Fork: 1 of 2
# Warmup Iteration   1: 1158.815 ms/op
# Warmup Iteration   2: 524.398 ms/op
Iteration   1: 500.194 ms/op
Iteration   2: 496.817 ms/op
Iteration   3: 492.165 ms/op

# Run progress: 32.61% complete, ETA 00:06:00
# Fork: 2 of 2
# Warmup Iteration   1: 1185.718 ms/op
# Warmup Iteration   2: 516.960 ms/op
Iteration   1: 492.912 ms/op
Iteration   2: 495.383 ms/op
Iteration   3: 490.502 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  494.662 ±(99.9%) 9.904 ms/op [Average]
  (min, avg, max) = (490.502, 494.662, 500.194), stdev = 3.532
  CI (99.9%): [484.758, 504.566] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:50
# Fork: 1 of 2
# Warmup Iteration   1: 2511.115 ms/op
# Warmup Iteration   2: 1159.386 ms/op
Iteration   1: 1129.864 ms/op
Iteration   2: 1117.940 ms/op
Iteration   3: 1106.563 ms/op

# Run progress: 36.96% complete, ETA 00:05:38
# Fork: 2 of 2
# Warmup Iteration   1: 2541.062 ms/op
# Warmup Iteration   2: 1190.822 ms/op
Iteration   1: 1140.498 ms/op
Iteration   2: 1121.248 ms/op
Iteration   3: 1113.052 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1121.528 ±(99.9%) 34.071 ms/op [Average]
  (min, avg, max) = (1106.563, 1121.528, 1140.498), stdev = 12.150
  CI (99.9%): [1087.457, 1155.599] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:27
# Fork: 1 of 2
# Warmup Iteration   1: 0.158 ms/op
# Warmup Iteration   2: 0.100 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.102 ms/op
Iteration   3: 0.100 ms/op

# Run progress: 41.30% complete, ETA 00:05:13
# Fork: 2 of 2
# Warmup Iteration   1: 0.151 ms/op
# Warmup Iteration   2: 0.099 ms/op
Iteration   1: 0.098 ms/op
Iteration   2: 0.098 ms/op
Iteration   3: 0.098 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.099 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.098, 0.099, 0.102), stdev = 0.001
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

# Run progress: 43.48% complete, ETA 00:05:00
# Fork: 1 of 2
# Warmup Iteration   1: 11.468 ms/op
# Warmup Iteration   2: 8.164 ms/op
Iteration   1: 8.100 ms/op
Iteration   2: 8.156 ms/op
Iteration   3: 8.040 ms/op

# Run progress: 45.65% complete, ETA 00:04:47
# Fork: 2 of 2
# Warmup Iteration   1: 11.371 ms/op
# Warmup Iteration   2: 8.127 ms/op
Iteration   1: 8.077 ms/op
Iteration   2: 7.686 ms/op
Iteration   3: 7.410 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.911 ±(99.9%) 0.833 ms/op [Average]
  (min, avg, max) = (7.410, 7.911, 8.156), stdev = 0.297
  CI (99.9%): [7.078, 8.745] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:34
# Fork: 1 of 2
# Warmup Iteration   1: 0.841 ms/op
# Warmup Iteration   2: 0.578 ms/op
Iteration   1: 0.577 ms/op
Iteration   2: 0.572 ms/op
Iteration   3: 0.573 ms/op

# Run progress: 50.00% complete, ETA 00:04:21
# Fork: 2 of 2
# Warmup Iteration   1: 0.839 ms/op
# Warmup Iteration   2: 0.575 ms/op
Iteration   1: 0.572 ms/op
Iteration   2: 0.574 ms/op
Iteration   3: 0.572 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.573 ±(99.9%) 0.005 ms/op [Average]
  (min, avg, max) = (0.572, 0.573, 0.577), stdev = 0.002
  CI (99.9%): [0.568, 0.578] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:09
# Fork: 1 of 2
# Warmup Iteration   1: 2.084 ms/op
# Warmup Iteration   2: 1.517 ms/op
Iteration   1: 1.518 ms/op
Iteration   2: 1.500 ms/op
Iteration   3: 1.498 ms/op

# Run progress: 54.35% complete, ETA 00:03:57
# Fork: 2 of 2
# Warmup Iteration   1: 2.120 ms/op
# Warmup Iteration   2: 1.503 ms/op
Iteration   1: 1.509 ms/op
Iteration   2: 1.490 ms/op
Iteration   3: 1.492 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.501 ±(99.9%) 0.030 ms/op [Average]
  (min, avg, max) = (1.490, 1.501, 1.518), stdev = 0.011
  CI (99.9%): [1.471, 1.531] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:45
# Fork: 1 of 2
# Warmup Iteration   1: 144.033 ms/op
# Warmup Iteration   2: 38.964 ms/op
Iteration   1: 30.547 ms/op
Iteration   2: 25.758 ms/op
Iteration   3: 19.516 ms/op

# Run progress: 58.70% complete, ETA 00:03:33
# Fork: 2 of 2
# Warmup Iteration   1: 145.985 ms/op
# Warmup Iteration   2: 39.528 ms/op
Iteration   1: 33.090 ms/op
Iteration   2: 29.519 ms/op
Iteration   3: 23.531 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  26.993 ±(99.9%) 14.054 ms/op [Average]
  (min, avg, max) = (19.516, 26.993, 33.090), stdev = 5.012
  CI (99.9%): [12.940, 41.047] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:21
# Fork: 1 of 2
# Warmup Iteration   1: 95386.595 ms/op
# Warmup Iteration   2: 90439.417 ms/op
Iteration   1: 89351.426 ms/op
Iteration   2: 89700.104 ms/op
Iteration   3: 89604.060 ms/op

# Run progress: 63.04% complete, ETA 00:07:30
# Fork: 2 of 2
# Warmup Iteration   1: 94992.851 ms/op
# Warmup Iteration   2: 89183.722 ms/op
Iteration   1: 87954.662 ms/op
Iteration   2: 88171.515 ms/op
Iteration   3: 88495.269 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  88879.506 ±(99.9%) 2144.898 ms/op [Average]
  (min, avg, max) = (87954.662, 88879.506, 89700.104), stdev = 764.891
  CI (99.9%): [86734.608, 91024.404] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:10:50
# Fork: 1 of 2
# Warmup Iteration   1: 33664.456 ms/op
# Warmup Iteration   2: 13619.429 ms/op
Iteration   1: 26242.175 ms/op
Iteration   2: 27628.678 ms/op
Iteration   3: 25886.813 ms/op

# Run progress: 67.39% complete, ETA 00:13:24
# Fork: 2 of 2
# Warmup Iteration   1: 36098.476 ms/op
# Warmup Iteration   2: 16267.220 ms/op
Iteration   1: 27208.822 ms/op
Iteration   2: 17088.877 ms/op
Iteration   3: 21758.938 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  24302.384 ±(99.9%) 11513.475 ms/op [Average]
  (min, avg, max) = (17088.877, 24302.384, 27628.678), stdev = 4105.816
  CI (99.9%): [12788.909, 35815.859] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:15:05
# Fork: 1 of 2
# Warmup Iteration   1: 10092.574 ms/op
# Warmup Iteration   2: 7949.070 ms/op
Iteration   1: 7629.636 ms/op
Iteration   2: 7631.688 ms/op
Iteration   3: 7572.290 ms/op

# Run progress: 71.74% complete, ETA 00:13:51
# Fork: 2 of 2
# Warmup Iteration   1: 10180.466 ms/op
# Warmup Iteration   2: 7936.499 ms/op
Iteration   1: 7602.334 ms/op
Iteration   2: 7607.248 ms/op
Iteration   3: 7574.090 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  7602.881 ±(99.9%) 72.365 ms/op [Average]
  (min, avg, max) = (7572.290, 7602.881, 7631.688), stdev = 25.806
  CI (99.9%): [7530.516, 7675.246] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:12:39
# Fork: 1 of 2
# Warmup Iteration   1: Nov 11, 2026 9:46:59 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 11, 2026 9:46:59 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
92.620 ms/op
# Warmup Iteration   2: 65.383 ms/op
Iteration   1: 65.291 ms/op
Iteration   2: 63.649 ms/op
Iteration   3: 63.687 ms/op

# Run progress: 76.09% complete, ETA 00:11:19
# Fork: 2 of 2
# Warmup Iteration   1: Nov 11, 2026 9:47:10 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 11, 2026 9:47:10 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
92.652 ms/op
# Warmup Iteration   2: 64.418 ms/op
Iteration   1: 64.216 ms/op
Iteration   2: 62.539 ms/op
Iteration   3: 62.565 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  63.658 ±(99.9%) 2.921 ms/op [Average]
  (min, avg, max) = (62.539, 63.658, 65.291), stdev = 1.042
  CI (99.9%): [60.737, 66.579] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:10:04
# Fork: 1 of 2
# Warmup Iteration   1: 83.446 ms/op
# Warmup Iteration   2: 53.068 ms/op
Iteration   1: 65.242 ms/op
Iteration   2: 65.469 ms/op
Iteration   3: 65.349 ms/op

# Run progress: 80.43% complete, ETA 00:08:51
# Fork: 2 of 2
# Warmup Iteration   1: 69.685 ms/op
# Warmup Iteration   2: 69.173 ms/op
Iteration   1: 68.305 ms/op
Iteration   2: 68.440 ms/op
Iteration   3: 68.044 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  66.808 ±(99.9%) 4.488 ms/op [Average]
  (min, avg, max) = (65.242, 66.808, 68.440), stdev = 1.600
  CI (99.9%): [62.320, 71.296] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:07:42
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:06:36
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

# Run progress: 86.96% complete, ETA 00:05:32
# Fork: 1 of 2
# Warmup Iteration   1: 43.659 ms/op
# Warmup Iteration   2: 32.243 ms/op
Iteration   1: 30.735 ms/op
Iteration   2: 30.818 ms/op
Iteration   3: 30.339 ms/op

# Run progress: 89.13% complete, ETA 00:04:32
# Fork: 2 of 2
# Warmup Iteration   1: 42.719 ms/op
# Warmup Iteration   2: 31.518 ms/op
Iteration   1: 30.646 ms/op
Iteration   2: 30.535 ms/op
Iteration   3: 30.230 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  30.551 ±(99.9%) 0.643 ms/op [Average]
  (min, avg, max) = (30.230, 30.551, 30.818), stdev = 0.229
  CI (99.9%): [29.908, 31.193] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:33
# Fork: 1 of 2
# Warmup Iteration   1: 15.696 ms/op
# Warmup Iteration   2: 11.927 ms/op
Iteration   1: 11.653 ms/op
Iteration   2: 11.608 ms/op
Iteration   3: 11.651 ms/op

# Run progress: 93.48% complete, ETA 00:02:37
# Fork: 2 of 2
# Warmup Iteration   1: 16.232 ms/op
# Warmup Iteration   2: 12.059 ms/op
Iteration   1: 11.663 ms/op
Iteration   2: 11.574 ms/op
Iteration   3: 11.455 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  11.601 ±(99.9%) 0.221 ms/op [Average]
  (min, avg, max) = (11.455, 11.601, 11.663), stdev = 0.079
  CI (99.9%): [11.379, 11.822] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:43
# Fork: 1 of 2
# Warmup Iteration   1: 28.617 ms/op
# Warmup Iteration   2: 24.436 ms/op
Iteration   1: 24.369 ms/op
Iteration   2: 24.302 ms/op
Iteration   3: 24.347 ms/op

# Run progress: 97.83% complete, ETA 00:00:50
# Fork: 2 of 2
# Warmup Iteration   1: 29.237 ms/op
# Warmup Iteration   2: 24.495 ms/op
Iteration   1: 24.542 ms/op
Iteration   2: 24.421 ms/op
Iteration   3: 24.472 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  24.409 ±(99.9%) 0.247 ms/op [Average]
  (min, avg, max) = (24.302, 24.409, 24.542), stdev = 0.088
  CI (99.9%): [24.162, 24.655] (assumes normal distribution)


# Run complete. Total time: 00:38:09

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     22.789 ±     0.238  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.471 ±     0.067  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      7.278 ±     0.085  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      7.802 ±     0.052  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     13.282 ±     0.223  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    450.237 ±    39.401  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    507.383 ±    47.630  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    494.662 ±     9.904  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1121.528 ±    34.071  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.099 ±     0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.911 ±     0.833  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.573 ±     0.005  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.501 ±     0.030  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     26.993 ±    14.054  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  88879.506 ±  2144.898  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  24302.384 ± 11513.475  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   7602.881 ±    72.365  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     63.658 ±     2.921  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     66.808 ±     4.488  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     30.551 ±     0.643  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     11.601 ±     0.221  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     24.409 ±     0.247  ms/op

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
[INFO] Total time:  5.465 s
[INFO] Finished at: 2026-11-11T21:49:22Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.22.0 (neqsim-3.22.0.jar); requested: 3.22.0
$ mvn clean verify -Dneqsim.version=3.22.0
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
TEG full process: 10285 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.33 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.604 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.110 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 439301 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 27 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    7.67e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.84e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     8.72e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.84e-03 after 27 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 439.3 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (6 ms)
tpFlashWellFluidSrk                                            83.6406  (49 ms)
tpFlashWellFluidPr                                             83.6541  (37 ms)
tpFlashWellFluidWithProperties                                 5445.46  (61 ms)
phAndPsFlashWellFluid                                          2459.23  (80 ms)
Nov 11, 2026 9:57:01 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 11, 2026 9:57:01 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (492 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (205 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (150 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (62 ms)
saturationPointsWellFluid                                      1601.32  (181 ms)
singlePhaseGasPipelineSteadyState                              121.628  (847 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1643 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (6 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (9 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.312 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.22.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.22.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  07:49 min
[INFO] Finished at: 2026-11-11T21:57:12Z
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
# Warmup Iteration   1: 28.294 ms/op
# Warmup Iteration   2: 23.067 ms/op
Iteration   1: 22.746 ms/op
Iteration   2: 22.640 ms/op
Iteration   3: 22.689 ms/op

# Run progress: 2.17% complete, ETA 00:08:50
# Fork: 2 of 2
# Warmup Iteration   1: 30.037 ms/op
# Warmup Iteration   2: 22.876 ms/op
Iteration   1: 22.656 ms/op
Iteration   2: 22.604 ms/op
Iteration   3: 22.624 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  22.660 ±(99.9%) 0.143 ms/op [Average]
  (min, avg, max) = (22.604, 22.660, 22.746), stdev = 0.051
  CI (99.9%): [22.517, 22.803] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:37
# Fork: 1 of 2
# Warmup Iteration   1: 3.375 ms/op
# Warmup Iteration   2: 1.560 ms/op
Iteration   1: 1.541 ms/op
Iteration   2: 1.504 ms/op
Iteration   3: 1.498 ms/op

# Run progress: 6.52% complete, ETA 00:08:24
# Fork: 2 of 2
# Warmup Iteration   1: 2.603 ms/op
# Warmup Iteration   2: 1.512 ms/op
Iteration   1: 1.507 ms/op
Iteration   2: 1.463 ms/op
Iteration   3: 1.463 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.496 ±(99.9%) 0.083 ms/op [Average]
  (min, avg, max) = (1.463, 1.496, 1.541), stdev = 0.030
  CI (99.9%): [1.413, 1.579] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:13
# Fork: 1 of 2
# Warmup Iteration   1: 12.164 ms/op
# Warmup Iteration   2: 7.315 ms/op
Iteration   1: 7.280 ms/op
Iteration   2: 7.329 ms/op
Iteration   3: 7.270 ms/op

# Run progress: 10.87% complete, ETA 00:08:01
# Fork: 2 of 2
# Warmup Iteration   1: 10.289 ms/op
# Warmup Iteration   2: 7.447 ms/op
Iteration   1: 7.355 ms/op
Iteration   2: 7.336 ms/op
Iteration   3: 7.289 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.310 ±(99.9%) 0.098 ms/op [Average]
  (min, avg, max) = (7.270, 7.310, 7.355), stdev = 0.035
  CI (99.9%): [7.212, 7.407] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 14.332 ms/op
# Warmup Iteration   2: 7.840 ms/op
Iteration   1: 7.749 ms/op
Iteration   2: 7.690 ms/op
Iteration   3: 7.751 ms/op

# Run progress: 15.22% complete, ETA 00:07:37
# Fork: 2 of 2
# Warmup Iteration   1: 11.404 ms/op
# Warmup Iteration   2: 8.127 ms/op
Iteration   1: 7.880 ms/op
Iteration   2: 7.889 ms/op
Iteration   3: 7.906 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  7.811 ±(99.9%) 0.258 ms/op [Average]
  (min, avg, max) = (7.690, 7.811, 7.906), stdev = 0.092
  CI (99.9%): [7.553, 8.068] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 25.132 ms/op
# Warmup Iteration   2: 13.657 ms/op
Iteration   1: 13.226 ms/op
Iteration   2: 13.237 ms/op
Iteration   3: 13.167 ms/op

# Run progress: 19.57% complete, ETA 00:07:14
# Fork: 2 of 2
# Warmup Iteration   1: 29.052 ms/op
# Warmup Iteration   2: 13.678 ms/op
Iteration   1: 13.300 ms/op
Iteration   2: 13.328 ms/op
Iteration   3: 13.369 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.271 ±(99.9%) 0.209 ms/op [Average]
  (min, avg, max) = (13.167, 13.271, 13.369), stdev = 0.075
  CI (99.9%): [13.062, 13.481] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2082.740 ms/op
# Warmup Iteration   2: 696.275 ms/op
Iteration   1: 455.414 ms/op
Iteration   2: 442.684 ms/op
Iteration   3: 426.097 ms/op

# Run progress: 23.91% complete, ETA 00:06:48
# Fork: 2 of 2
# Warmup Iteration   1: 2122.266 ms/op
# Warmup Iteration   2: 595.194 ms/op
Iteration   1: 464.630 ms/op
Iteration   2: 447.519 ms/op
Iteration   3: 447.703 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  447.341 ±(99.9%) 36.287 ms/op [Average]
  (min, avg, max) = (426.097, 447.341, 464.630), stdev = 12.940
  CI (99.9%): [411.054, 483.628] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:36
# Fork: 1 of 2
# Warmup Iteration   1: 2281.444 ms/op
# Warmup Iteration   2: 739.164 ms/op
Iteration   1: 500.696 ms/op
Iteration   2: 487.758 ms/op
Iteration   3: 500.495 ms/op

# Run progress: 28.26% complete, ETA 00:06:25
# Fork: 2 of 2
# Warmup Iteration   1: 2142.186 ms/op
# Warmup Iteration   2: 600.167 ms/op
Iteration   1: 577.055 ms/op
Iteration   2: 488.031 ms/op
Iteration   3: 478.911 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  505.491 ±(99.9%) 101.068 ms/op [Average]
  (min, avg, max) = (478.911, 505.491, 577.055), stdev = 36.042
  CI (99.9%): [404.422, 606.559] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:14
# Fork: 1 of 2
# Warmup Iteration   1: 1112.194 ms/op
# Warmup Iteration   2: 520.051 ms/op
Iteration   1: 495.069 ms/op
Iteration   2: 489.798 ms/op
Iteration   3: 491.444 ms/op

# Run progress: 32.61% complete, ETA 00:06:03
# Fork: 2 of 2
# Warmup Iteration   1: 1194.070 ms/op
# Warmup Iteration   2: 516.195 ms/op
Iteration   1: 495.388 ms/op
Iteration   2: 496.854 ms/op
Iteration   3: 491.673 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  493.371 ±(99.9%) 7.776 ms/op [Average]
  (min, avg, max) = (489.798, 493.371, 496.854), stdev = 2.773
  CI (99.9%): [485.595, 501.147] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:52
# Fork: 1 of 2
# Warmup Iteration   1: 2499.636 ms/op
# Warmup Iteration   2: 1184.343 ms/op
Iteration   1: 1120.008 ms/op
Iteration   2: 1115.203 ms/op
Iteration   3: 1099.356 ms/op

# Run progress: 36.96% complete, ETA 00:05:40
# Fork: 2 of 2
# Warmup Iteration   1: 2471.480 ms/op
# Warmup Iteration   2: 1181.926 ms/op
Iteration   1: 1141.081 ms/op
Iteration   2: 1115.852 ms/op
Iteration   3: 1114.328 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1117.638 ±(99.9%) 37.820 ms/op [Average]
  (min, avg, max) = (1099.356, 1117.638, 1141.081), stdev = 13.487
  CI (99.9%): [1079.818, 1155.458] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:28
# Fork: 1 of 2
# Warmup Iteration   1: 0.142 ms/op
# Warmup Iteration   2: 0.098 ms/op
Iteration   1: 0.098 ms/op
Iteration   2: 0.098 ms/op
Iteration   3: 0.098 ms/op

# Run progress: 41.30% complete, ETA 00:05:15
# Fork: 2 of 2
# Warmup Iteration   1: 0.159 ms/op
# Warmup Iteration   2: 0.100 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.099 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.099 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.098, 0.099, 0.099), stdev = 0.001
  CI (99.9%): [0.097, 0.100] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:01
# Fork: 1 of 2
# Warmup Iteration   1: 11.329 ms/op
# Warmup Iteration   2: 8.111 ms/op
Iteration   1: 8.049 ms/op
Iteration   2: 8.069 ms/op
Iteration   3: 8.074 ms/op

# Run progress: 45.65% complete, ETA 00:04:48
# Fork: 2 of 2
# Warmup Iteration   1: 10.496 ms/op
# Warmup Iteration   2: 7.418 ms/op
Iteration   1: 7.396 ms/op
Iteration   2: 7.923 ms/op
Iteration   3: 8.065 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.929 ±(99.9%) 0.750 ms/op [Average]
  (min, avg, max) = (7.396, 7.929, 8.074), stdev = 0.267
  CI (99.9%): [7.179, 8.679] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:35
# Fork: 1 of 2
# Warmup Iteration   1: 0.821 ms/op
# Warmup Iteration   2: 0.578 ms/op
Iteration   1: 0.574 ms/op
Iteration   2: 0.576 ms/op
Iteration   3: 0.576 ms/op

# Run progress: 50.00% complete, ETA 00:04:22
# Fork: 2 of 2
# Warmup Iteration   1: 0.824 ms/op
# Warmup Iteration   2: 0.580 ms/op
Iteration   1: 0.586 ms/op
Iteration   2: 0.594 ms/op
Iteration   3: 0.596 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.584 ±(99.9%) 0.027 ms/op [Average]
  (min, avg, max) = (0.574, 0.584, 0.596), stdev = 0.010
  CI (99.9%): [0.556, 0.611] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:10
# Fork: 1 of 2
# Warmup Iteration   1: 2.076 ms/op
# Warmup Iteration   2: 1.523 ms/op
Iteration   1: 1.503 ms/op
Iteration   2: 1.494 ms/op
Iteration   3: 1.495 ms/op

# Run progress: 54.35% complete, ETA 00:03:58
# Fork: 2 of 2
# Warmup Iteration   1: 2.125 ms/op
# Warmup Iteration   2: 1.499 ms/op
Iteration   1: 1.497 ms/op
Iteration   2: 1.491 ms/op
Iteration   3: 1.493 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.495 ±(99.9%) 0.012 ms/op [Average]
  (min, avg, max) = (1.491, 1.495, 1.503), stdev = 0.004
  CI (99.9%): [1.483, 1.507] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:45
# Fork: 1 of 2
# Warmup Iteration   1: 135.822 ms/op
# Warmup Iteration   2: 28.226 ms/op
Iteration   1: 23.162 ms/op
Iteration   2: 18.605 ms/op
Iteration   3: 16.286 ms/op

# Run progress: 58.70% complete, ETA 00:03:33
# Fork: 2 of 2
# Warmup Iteration   1: 127.305 ms/op
# Warmup Iteration   2: 26.993 ms/op
Iteration   1: 28.582 ms/op
Iteration   2: 20.531 ms/op
Iteration   3: 21.849 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  21.503 ±(99.9%) 11.868 ms/op [Average]
  (min, avg, max) = (16.286, 21.503, 28.582), stdev = 4.232
  CI (99.9%): [9.635, 33.370] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:22
# Fork: 1 of 2
# Warmup Iteration   1: 92020.000 ms/op
# Warmup Iteration   2: 88442.824 ms/op
Iteration   1: 86809.247 ms/op
Iteration   2: 86821.619 ms/op
Iteration   3: 86743.305 ms/op

# Run progress: 63.04% complete, ETA 00:07:23
# Fork: 2 of 2
# Warmup Iteration   1: 95065.410 ms/op
# Warmup Iteration   2: 89825.981 ms/op
Iteration   1: 88882.796 ms/op
Iteration   2: 89000.793 ms/op
Iteration   3: 88458.697 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  87786.076 ±(99.9%) 3097.959 ms/op [Average]
  (min, avg, max) = (86743.305, 87786.076, 89000.793), stdev = 1104.762
  CI (99.9%): [84688.117, 90884.035] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:10:44
# Fork: 1 of 2
# Warmup Iteration   1: 35768.887 ms/op
# Warmup Iteration   2: 18574.562 ms/op
Iteration   1: 31460.415 ms/op
Iteration   2: 15345.413 ms/op
Iteration   3: 23844.857 ms/op

# Run progress: 67.39% complete, ETA 00:13:14
# Fork: 2 of 2
# Warmup Iteration   1: 33340.949 ms/op
# Warmup Iteration   2: 18172.619 ms/op
Iteration   1: 31809.732 ms/op
Iteration   2: 14635.805 ms/op
Iteration   3: 24203.788 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  23550.002 ±(99.9%) 20912.929 ms/op [Average]
  (min, avg, max) = (14635.805, 23550.002, 31809.732), stdev = 7457.752
  CI (99.9%): [2637.072, 44462.931] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:15:05
# Fork: 1 of 2
# Warmup Iteration   1: 10653.281 ms/op
# Warmup Iteration   2: 7917.402 ms/op
Iteration   1: 7711.369 ms/op
Iteration   2: 7677.108 ms/op
Iteration   3: 7551.482 ms/op

# Run progress: 71.74% complete, ETA 00:13:51
# Fork: 2 of 2
# Warmup Iteration   1: 10130.565 ms/op
# Warmup Iteration   2: 8202.400 ms/op
Iteration   1: 7814.018 ms/op
Iteration   2: 7586.644 ms/op
Iteration   3: 7568.318 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  7651.490 ±(99.9%) 285.370 ms/op [Average]
  (min, avg, max) = (7551.482, 7651.490, 7814.018), stdev = 101.766
  CI (99.9%): [7366.120, 7936.860] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:12:40
# Fork: 1 of 2
# Warmup Iteration   1: Nov 11, 2026 10:33:08 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 11, 2026 10:33:08 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
78.150 ms/op
# Warmup Iteration   2: 58.305 ms/op
Iteration   1: 56.201 ms/op
Iteration   2: 55.663 ms/op
Iteration   3: 55.562 ms/op

# Run progress: 76.09% complete, ETA 00:11:20
# Fork: 2 of 2
# Warmup Iteration   1: Nov 11, 2026 10:33:19 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 11, 2026 10:33:19 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
74.786 ms/op
# Warmup Iteration   2: 58.224 ms/op
Iteration   1: 56.367 ms/op
Iteration   2: 55.706 ms/op
Iteration   3: 55.585 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  55.847 ±(99.9%) 0.971 ms/op [Average]
  (min, avg, max) = (55.562, 55.847, 56.367), stdev = 0.346
  CI (99.9%): [54.876, 56.818] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:10:04
# Fork: 1 of 2
# Warmup Iteration   1: 78.884 ms/op
# Warmup Iteration   2: 65.225 ms/op
Iteration   1: 64.138 ms/op
Iteration   2: 64.222 ms/op
Iteration   3: 63.846 ms/op

# Run progress: 80.43% complete, ETA 00:08:52
# Fork: 2 of 2
# Warmup Iteration   1: 72.361 ms/op
# Warmup Iteration   2: 63.223 ms/op
Iteration   1: 66.044 ms/op
Iteration   2: 65.994 ms/op
Iteration   3: 65.925 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  65.028 ±(99.9%) 2.970 ms/op [Average]
  (min, avg, max) = (63.846, 65.028, 66.044), stdev = 1.059
  CI (99.9%): [62.058, 67.999] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:07:43
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:06:36
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

# Run progress: 86.96% complete, ETA 00:05:33
# Fork: 1 of 2
# Warmup Iteration   1: 42.751 ms/op
# Warmup Iteration   2: 31.886 ms/op
Iteration   1: 30.849 ms/op
Iteration   2: 30.895 ms/op
Iteration   3: 30.642 ms/op

# Run progress: 89.13% complete, ETA 00:04:32
# Fork: 2 of 2
# Warmup Iteration   1: 40.193 ms/op
# Warmup Iteration   2: 31.558 ms/op
Iteration   1: 30.676 ms/op
Iteration   2: 30.491 ms/op
Iteration   3: 30.467 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  30.670 ±(99.9%) 0.496 ms/op [Average]
  (min, avg, max) = (30.467, 30.670, 30.895), stdev = 0.177
  CI (99.9%): [30.174, 31.166] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:33
# Fork: 1 of 2
# Warmup Iteration   1: 15.921 ms/op
# Warmup Iteration   2: 11.898 ms/op
Iteration   1: 11.723 ms/op
Iteration   2: 11.625 ms/op
Iteration   3: 11.716 ms/op

# Run progress: 93.48% complete, ETA 00:02:37
# Fork: 2 of 2
# Warmup Iteration   1: 15.240 ms/op
# Warmup Iteration   2: 11.731 ms/op
Iteration   1: 11.494 ms/op
Iteration   2: 11.511 ms/op
Iteration   3: 11.523 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  11.599 ±(99.9%) 0.292 ms/op [Average]
  (min, avg, max) = (11.494, 11.599, 11.723), stdev = 0.104
  CI (99.9%): [11.307, 11.891] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:43
# Fork: 1 of 2
# Warmup Iteration   1: 28.373 ms/op
# Warmup Iteration   2: 24.522 ms/op
Iteration   1: 24.382 ms/op
Iteration   2: 24.375 ms/op
Iteration   3: 24.556 ms/op

# Run progress: 97.83% complete, ETA 00:00:50
# Fork: 2 of 2
# Warmup Iteration   1: 29.194 ms/op
# Warmup Iteration   2: 24.725 ms/op
Iteration   1: 24.716 ms/op
Iteration   2: 24.615 ms/op
Iteration   3: 24.738 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  24.564 ±(99.9%) 0.444 ms/op [Average]
  (min, avg, max) = (24.375, 24.564, 24.738), stdev = 0.158
  CI (99.9%): [24.120, 25.007] (assumes normal distribution)


# Run complete. Total time: 00:38:11

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     22.660 ±     0.143  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.496 ±     0.083  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      7.310 ±     0.098  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      7.811 ±     0.258  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     13.271 ±     0.209  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    447.341 ±    36.287  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    505.491 ±   101.068  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    493.371 ±     7.776  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1117.638 ±    37.820  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.099 ±     0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.929 ±     0.750  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.584 ±     0.027  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.495 ±     0.012  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     21.503 ±    11.868  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  87786.076 ±  3097.959  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  23550.002 ± 20912.929  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   7651.490 ±   285.370  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     55.847 ±     0.971  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     65.028 ±     2.970  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     30.670 ±     0.496  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     11.599 ±     0.292  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     24.564 ±     0.444  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.21.0 -> 3.22.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 14 lower, 9 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| process.Compressor_Benchmark.compressorprocess | 26.9935 | 21.5026 | -20.34% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 63.6579 | 55.8474 | -12.27% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 24302.4 | 23550 | -3.10% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 66.8081 | 65.0283 | -2.66% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.573347 | 0.583535 | +1.78% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.47121 | 1.49599 | +1.68% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 88879.5 | 87786.1 | -1.23% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0993531 | 0.098699 | -0.66% | Overlapping CIs |
| flash.TPflash.testFlash | 450.237 | 447.341 | -0.64% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 7602.88 | 7651.49 | +0.64% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
