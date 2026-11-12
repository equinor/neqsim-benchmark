# NeqSim 3.22.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.21.0 |
| Current | 3.22.0 |
| Source commit | `c6c839a503b63a4b65c7f2a64f529790fad431fc` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43223641601) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "c6c839a503b63a4b65c7f2a64f529790fad431fc",
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
Model name:                              AMD EPYC 9V74 80-Core Processor
CPU family:                              25
Model:                                   17
Thread(s) per core:                      2
Core(s) per socket:                      2
Socket(s):                               1
Stepping:                                1
BogoMIPS:                                5192.30
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid avx512f avx512dq rdseed adx smap avx512ifma clflushopt clwb avx512cd sha_ni avx512bw avx512vl xsaveopt xsavec xgetbv1 xsaves user_shstk avx512_bf16 clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload avx512vbmi umip avx512_vbmi2 gfni vaes vpclmulqdq avx512_vnni avx512_bitalg avx512_vpopcntdq rdpid fsrm
Virtualization:                          AMD-V
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               64 KiB (2 instances)
L1i cache:                               64 KiB (2 instances)
L2 cache:                                2 MiB (2 instances)
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
[INFO] Total time:  10.995 s
[INFO] Finished at: 2026-11-12T13:03:56Z
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
TEG full process: 8774 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.810 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.410 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.063 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 584580 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 59 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    9.85e-04 (tolerance: 1.00e-03) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  3.23e-06 (tolerance: 1.00e-03) OK [worst: separation train B::4th stage separator -> liquidOutStream]
  Pressure:     1.29e-04 (tolerance: 1.00e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 584.6 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (7 ms)
tpFlashWellFluidSrk                                            83.6406  (46 ms)
tpFlashWellFluidPr                                             83.6541  (43 ms)
tpFlashWellFluidWithProperties                                 5445.46  (52 ms)
phAndPsFlashWellFluid                                          2459.23  (101 ms)
Nov 12, 2026 1:14:01 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 12, 2026 1:14:02 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (356 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (141 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (122 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (45 ms)
saturationPointsWellFluid                                      1601.32  (134 ms)
singlePhaseGasPipelineSteadyState                              121.628  (688 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1422 ms)
levenbergMarquardtAntoine                                      1837.31  (5 ms)
levenbergMarquardtDoubleExponential                            5.57177  (4 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (8 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.520 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  10:17 min
[INFO] Finished at: 2026-11-12T13:14:15Z
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
# Warmup Iteration   1: 25.187 ms/op
# Warmup Iteration   2: 18.868 ms/op
Iteration   1: 18.751 ms/op
Iteration   2: 18.714 ms/op
Iteration   3: 18.659 ms/op

# Run progress: 2.17% complete, ETA 00:08:35
# Fork: 2 of 2
# Warmup Iteration   1: 23.037 ms/op
# Warmup Iteration   2: 18.932 ms/op
Iteration   1: 18.983 ms/op
Iteration   2: 18.945 ms/op
Iteration   3: 18.903 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  18.826 ±(99.9%) 0.377 ms/op [Average]
  (min, avg, max) = (18.659, 18.826, 18.983), stdev = 0.135
  CI (99.9%): [18.449, 19.203] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:22
# Fork: 1 of 2
# Warmup Iteration   1: 1.554 ms/op
# Warmup Iteration   2: 1.233 ms/op
Iteration   1: 1.181 ms/op
Iteration   2: 1.178 ms/op
Iteration   3: 1.179 ms/op

# Run progress: 6.52% complete, ETA 00:08:09
# Fork: 2 of 2
# Warmup Iteration   1: 1.884 ms/op
# Warmup Iteration   2: 1.235 ms/op
Iteration   1: 1.220 ms/op
Iteration   2: 1.195 ms/op
Iteration   3: 1.194 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.191 ±(99.9%) 0.045 ms/op [Average]
  (min, avg, max) = (1.178, 1.191, 1.220), stdev = 0.016
  CI (99.9%): [1.146, 1.236] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:07:57
# Fork: 1 of 2
# Warmup Iteration   1: 8.759 ms/op
# Warmup Iteration   2: 6.020 ms/op
Iteration   1: 6.013 ms/op
Iteration   2: 5.991 ms/op
Iteration   3: 5.974 ms/op

# Run progress: 10.87% complete, ETA 00:07:46
# Fork: 2 of 2
# Warmup Iteration   1: 8.760 ms/op
# Warmup Iteration   2: 6.023 ms/op
Iteration   1: 6.014 ms/op
Iteration   2: 5.976 ms/op
Iteration   3: 5.966 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  5.989 ±(99.9%) 0.057 ms/op [Average]
  (min, avg, max) = (5.966, 5.989, 6.014), stdev = 0.020
  CI (99.9%): [5.932, 6.046] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:34
# Fork: 1 of 2
# Warmup Iteration   1: 9.687 ms/op
# Warmup Iteration   2: 6.439 ms/op
Iteration   1: 6.417 ms/op
Iteration   2: 6.409 ms/op
Iteration   3: 6.390 ms/op

# Run progress: 15.22% complete, ETA 00:07:22
# Fork: 2 of 2
# Warmup Iteration   1: 8.173 ms/op
# Warmup Iteration   2: 6.484 ms/op
Iteration   1: 6.448 ms/op
Iteration   2: 6.414 ms/op
Iteration   3: 6.462 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.423 ±(99.9%) 0.075 ms/op [Average]
  (min, avg, max) = (6.390, 6.423, 6.462), stdev = 0.027
  CI (99.9%): [6.349, 6.498] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:11
# Fork: 1 of 2
# Warmup Iteration   1: 18.950 ms/op
# Warmup Iteration   2: 10.803 ms/op
Iteration   1: 10.743 ms/op
Iteration   2: 10.679 ms/op
Iteration   3: 10.656 ms/op

# Run progress: 19.57% complete, ETA 00:06:59
# Fork: 2 of 2
# Warmup Iteration   1: 20.485 ms/op
# Warmup Iteration   2: 11.079 ms/op
Iteration   1: 10.718 ms/op
Iteration   2: 10.598 ms/op
Iteration   3: 10.560 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.659 ±(99.9%) 0.196 ms/op [Average]
  (min, avg, max) = (10.560, 10.659, 10.743), stdev = 0.070
  CI (99.9%): [10.463, 10.855] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:06:48
# Fork: 1 of 2
# Warmup Iteration   1: 1108.566 ms/op
# Warmup Iteration   2: 366.293 ms/op
Iteration   1: 346.415 ms/op
Iteration   2: 338.055 ms/op
Iteration   3: 333.981 ms/op

# Run progress: 23.91% complete, ETA 00:06:34
# Fork: 2 of 2
# Warmup Iteration   1: 780.264 ms/op
# Warmup Iteration   2: 373.022 ms/op
Iteration   1: 346.695 ms/op
Iteration   2: 342.777 ms/op
Iteration   3: 338.714 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  341.106 ±(99.9%) 14.189 ms/op [Average]
  (min, avg, max) = (333.981, 341.106, 346.695), stdev = 5.060
  CI (99.9%): [326.917, 355.295] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:22
# Fork: 1 of 2
# Warmup Iteration   1: 1077.467 ms/op
# Warmup Iteration   2: 446.450 ms/op
Iteration   1: 408.116 ms/op
Iteration   2: 382.228 ms/op
Iteration   3: 375.131 ms/op

# Run progress: 28.26% complete, ETA 00:06:11
# Fork: 2 of 2
# Warmup Iteration   1: 1200.016 ms/op
# Warmup Iteration   2: 411.464 ms/op
Iteration   1: 401.721 ms/op
Iteration   2: 378.388 ms/op
Iteration   3: 372.900 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  386.414 ±(99.9%) 41.539 ms/op [Average]
  (min, avg, max) = (372.900, 386.414, 408.116), stdev = 14.813
  CI (99.9%): [344.875, 427.953] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:05:59
# Fork: 1 of 2
# Warmup Iteration   1: 752.617 ms/op
# Warmup Iteration   2: 401.240 ms/op
Iteration   1: 398.521 ms/op
Iteration   2: 396.298 ms/op
Iteration   3: 396.182 ms/op

# Run progress: 32.61% complete, ETA 00:05:49
# Fork: 2 of 2
# Warmup Iteration   1: 739.062 ms/op
# Warmup Iteration   2: 403.762 ms/op
Iteration   1: 401.453 ms/op
Iteration   2: 396.214 ms/op
Iteration   3: 389.379 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  396.341 ±(99.9%) 11.174 ms/op [Average]
  (min, avg, max) = (389.379, 396.341, 401.453), stdev = 3.985
  CI (99.9%): [385.167, 407.515] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:37
# Fork: 1 of 2
# Warmup Iteration   1: 1420.914 ms/op
# Warmup Iteration   2: 915.888 ms/op
Iteration   1: 896.845 ms/op
Iteration   2: 891.741 ms/op
Iteration   3: 887.302 ms/op

# Run progress: 36.96% complete, ETA 00:05:31
# Fork: 2 of 2
# Warmup Iteration   1: 1423.809 ms/op
# Warmup Iteration   2: 916.989 ms/op
Iteration   1: 891.244 ms/op
Iteration   2: 888.610 ms/op
Iteration   3: 883.548 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  889.882 ±(99.9%) 12.678 ms/op [Average]
  (min, avg, max) = (883.548, 889.882, 896.845), stdev = 4.521
  CI (99.9%): [877.204, 902.559] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:23
# Fork: 1 of 2
# Warmup Iteration   1: 0.105 ms/op
# Warmup Iteration   2: 0.079 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:09
# Fork: 2 of 2
# Warmup Iteration   1: 0.112 ms/op
# Warmup Iteration   2: 0.081 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.079 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.079, 0.079, 0.079), stdev = 0.001
  CI (99.9%): [0.078, 0.080] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:04:56
# Fork: 1 of 2
# Warmup Iteration   1: 7.896 ms/op
# Warmup Iteration   2: 6.135 ms/op
Iteration   1: 6.123 ms/op
Iteration   2: 6.116 ms/op
Iteration   3: 6.117 ms/op

# Run progress: 45.65% complete, ETA 00:04:43
# Fork: 2 of 2
# Warmup Iteration   1: 7.855 ms/op
# Warmup Iteration   2: 6.150 ms/op
Iteration   1: 6.135 ms/op
Iteration   2: 6.130 ms/op
Iteration   3: 6.120 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.123 ±(99.9%) 0.021 ms/op [Average]
  (min, avg, max) = (6.116, 6.123, 6.135), stdev = 0.008
  CI (99.9%): [6.102, 6.145] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:31
# Fork: 1 of 2
# Warmup Iteration   1: 0.610 ms/op
# Warmup Iteration   2: 0.467 ms/op
Iteration   1: 0.467 ms/op
Iteration   2: 0.465 ms/op
Iteration   3: 0.466 ms/op

# Run progress: 50.00% complete, ETA 00:04:18
# Fork: 2 of 2
# Warmup Iteration   1: 0.630 ms/op
# Warmup Iteration   2: 0.469 ms/op
Iteration   1: 0.468 ms/op
Iteration   2: 0.469 ms/op
Iteration   3: 0.478 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.469 ±(99.9%) 0.013 ms/op [Average]
  (min, avg, max) = (0.465, 0.469, 0.478), stdev = 0.005
  CI (99.9%): [0.456, 0.481] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:06
# Fork: 1 of 2
# Warmup Iteration   1: 1.572 ms/op
# Warmup Iteration   2: 1.214 ms/op
Iteration   1: 1.207 ms/op
Iteration   2: 1.207 ms/op
Iteration   3: 1.208 ms/op

# Run progress: 54.35% complete, ETA 00:03:54
# Fork: 2 of 2
# Warmup Iteration   1: 1.577 ms/op
# Warmup Iteration   2: 1.200 ms/op
Iteration   1: 1.193 ms/op
Iteration   2: 1.189 ms/op
Iteration   3: 1.198 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.201 ±(99.9%) 0.023 ms/op [Average]
  (min, avg, max) = (1.189, 1.201, 1.208), stdev = 0.008
  CI (99.9%): [1.178, 1.224] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:42
# Fork: 1 of 2
# Warmup Iteration   1: 69.901 ms/op
# Warmup Iteration   2: 24.895 ms/op
Iteration   1: 14.049 ms/op
Iteration   2: 13.233 ms/op
Iteration   3: 11.933 ms/op

# Run progress: 58.70% complete, ETA 00:03:31
# Fork: 2 of 2
# Warmup Iteration   1: 71.762 ms/op
# Warmup Iteration   2: 25.540 ms/op
Iteration   1: 19.131 ms/op
Iteration   2: 13.938 ms/op
Iteration   3: 11.778 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  14.010 ±(99.9%) 7.538 ms/op [Average]
  (min, avg, max) = (11.778, 14.010, 19.131), stdev = 2.688
  CI (99.9%): [6.472, 21.548] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:19
# Fork: 1 of 2
# Warmup Iteration   1: 73823.691 ms/op
# Warmup Iteration   2: 70768.827 ms/op
Iteration   1: 70407.893 ms/op
Iteration   2: 70352.600 ms/op
Iteration   3: 70269.271 ms/op

# Run progress: 63.04% complete, ETA 00:06:30
# Fork: 2 of 2
# Warmup Iteration   1: 74672.720 ms/op
# Warmup Iteration   2: 70927.815 ms/op
Iteration   1: 70397.967 ms/op
Iteration   2: 70401.454 ms/op
Iteration   3: 70287.774 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  70352.826 ±(99.9%) 171.253 ms/op [Average]
  (min, avg, max) = (70269.271, 70352.826, 70407.893), stdev = 61.070
  CI (99.9%): [70181.574, 70524.079] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:09:06
# Fork: 1 of 2
# Warmup Iteration   1: 22881.820 ms/op
# Warmup Iteration   2: 13821.683 ms/op
Iteration   1: 20646.099 ms/op
Iteration   2: 19754.361 ms/op
Iteration   3: 17109.963 ms/op

# Run progress: 67.39% complete, ETA 00:11:09
# Fork: 2 of 2
# Warmup Iteration   1: 22651.627 ms/op
# Warmup Iteration   2: 13667.531 ms/op
Iteration   1: 20391.361 ms/op
Iteration   2: 19514.595 ms/op
Iteration   3: 16992.450 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  19068.138 ±(99.9%) 4531.003 ms/op [Average]
  (min, avg, max) = (16992.450, 19068.138, 20646.099), stdev = 1615.799
  CI (99.9%): [14537.135, 23599.141] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:12:41
# Fork: 1 of 2
# Warmup Iteration   1: 8144.768 ms/op
# Warmup Iteration   2: 6435.312 ms/op
Iteration   1: 6227.293 ms/op
Iteration   2: 6136.963 ms/op
Iteration   3: 6109.213 ms/op

# Run progress: 71.74% complete, ETA 00:11:38
# Fork: 2 of 2
# Warmup Iteration   1: 8215.527 ms/op
# Warmup Iteration   2: 6539.858 ms/op
Iteration   1: 6255.269 ms/op
Iteration   2: 7137.140 ms/op
Iteration   3: 6174.747 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6340.104 ±(99.9%) 1105.511 ms/op [Average]
  (min, avg, max) = (6109.213, 6340.104, 7137.140), stdev = 394.236
  CI (99.9%): [5234.593, 7445.615] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:10:38
# Fork: 1 of 2
# Warmup Iteration   1: Nov 12, 2026 1:44:24 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 12, 2026 1:44:25 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
64.693 ms/op
# Warmup Iteration   2: 45.568 ms/op
Iteration   1: 44.271 ms/op
Iteration   2: 44.112 ms/op
Iteration   3: 44.184 ms/op

# Run progress: 76.09% complete, ETA 00:09:31
# Fork: 2 of 2
# Warmup Iteration   1: Nov 12, 2026 1:44:36 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 12, 2026 1:44:36 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
59.327 ms/op
# Warmup Iteration   2: 45.199 ms/op
Iteration   1: 43.777 ms/op
Iteration   2: 43.645 ms/op
Iteration   3: 43.764 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  43.959 ±(99.9%) 0.733 ms/op [Average]
  (min, avg, max) = (43.645, 43.959, 44.271), stdev = 0.261
  CI (99.9%): [43.226, 44.691] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:08:28
# Fork: 1 of 2
# Warmup Iteration   1: 63.178 ms/op
# Warmup Iteration   2: 49.126 ms/op
Iteration   1: 48.396 ms/op
Iteration   2: 48.128 ms/op
Iteration   3: 48.080 ms/op

# Run progress: 80.43% complete, ETA 00:07:27
# Fork: 2 of 2
# Warmup Iteration   1: 48.543 ms/op
# Warmup Iteration   2: 50.040 ms/op
Iteration   1: 49.933 ms/op
Iteration   2: 50.052 ms/op
Iteration   3: 49.468 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  49.010 ±(99.9%) 2.560 ms/op [Average]
  (min, avg, max) = (48.080, 49.010, 50.052), stdev = 0.913
  CI (99.9%): [46.450, 51.570] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:06:30
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:34
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

# Run progress: 86.96% complete, ETA 00:04:41
# Fork: 1 of 2
# Warmup Iteration   1: 31.851 ms/op
# Warmup Iteration   2: 25.656 ms/op
Iteration   1: 25.124 ms/op
Iteration   2: 24.798 ms/op
Iteration   3: 24.679 ms/op

# Run progress: 89.13% complete, ETA 00:03:49
# Fork: 2 of 2
# Warmup Iteration   1: 32.022 ms/op
# Warmup Iteration   2: 25.676 ms/op
Iteration   1: 25.269 ms/op
Iteration   2: 24.856 ms/op
Iteration   3: 24.814 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  24.923 ±(99.9%) 0.629 ms/op [Average]
  (min, avg, max) = (24.679, 24.923, 25.269), stdev = 0.224
  CI (99.9%): [24.294, 25.552] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:00
# Fork: 1 of 2
# Warmup Iteration   1: 11.960 ms/op
# Warmup Iteration   2: 9.385 ms/op
Iteration   1: 9.358 ms/op
Iteration   2: 9.248 ms/op
Iteration   3: 9.251 ms/op

# Run progress: 93.48% complete, ETA 00:02:13
# Fork: 2 of 2
# Warmup Iteration   1: 12.155 ms/op
# Warmup Iteration   2: 9.500 ms/op
Iteration   1: 9.386 ms/op
Iteration   2: 9.253 ms/op
Iteration   3: 9.192 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.281 ±(99.9%) 0.208 ms/op [Average]
  (min, avg, max) = (9.192, 9.281, 9.386), stdev = 0.074
  CI (99.9%): [9.073, 9.490] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:27
# Fork: 1 of 2
# Warmup Iteration   1: 22.549 ms/op
# Warmup Iteration   2: 19.947 ms/op
Iteration   1: 19.939 ms/op
Iteration   2: 19.953 ms/op
Iteration   3: 20.193 ms/op

# Run progress: 97.83% complete, ETA 00:00:42
# Fork: 2 of 2
# Warmup Iteration   1: 23.157 ms/op
# Warmup Iteration   2: 20.343 ms/op
Iteration   1: 20.307 ms/op
Iteration   2: 20.334 ms/op
Iteration   3: 20.292 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  20.170 ±(99.9%) 0.504 ms/op [Average]
  (min, avg, max) = (19.939, 20.170, 20.334), stdev = 0.180
  CI (99.9%): [19.665, 20.674] (assumes normal distribution)


# Run complete. Total time: 00:32:21

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     18.826 ±    0.377  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.191 ±    0.045  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      5.989 ±    0.057  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.423 ±    0.075  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.659 ±    0.196  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    341.106 ±   14.189  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    386.414 ±   41.539  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    396.341 ±   11.174  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    889.882 ±   12.678  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.079 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.123 ±    0.021  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.469 ±    0.013  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.201 ±    0.023  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     14.010 ±    7.538  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  70352.826 ±  171.253  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  19068.138 ± 4531.003  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6340.104 ± 1105.511  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     43.959 ±    0.733  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     49.010 ±    2.560  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     24.923 ±    0.629  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.281 ±    0.208  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     20.170 ±    0.504  ms/op

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
[INFO] Total time:  2.644 s
[INFO] Finished at: 2026-11-12T13:46:41Z
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
TEG full process: 8088 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.124 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.342 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.058 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 403180 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 34 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    4.85e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.94e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     5.97e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.94e-03 after 34 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 7.94e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264129.7 + 376837.1, oil 1995166.0 + 2850119.6, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.400 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.7 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 403.2 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (7 ms)
tpFlashWellFluidSrk                                            83.6406  (48 ms)
tpFlashWellFluidPr                                             83.6541  (53 ms)
tpFlashWellFluidWithProperties                                 5445.46  (57 ms)
phAndPsFlashWellFluid                                          2459.23  (113 ms)
Nov 12, 2026 1:53:39 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 12, 2026 1:53:39 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (581 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (260 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (122 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (46 ms)
saturationPointsWellFluid                                      1601.32  (129 ms)
singlePhaseGasPipelineSteadyState                              121.628  (665 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1298 ms)
levenbergMarquardtAntoine                                      1837.31  (6 ms)
levenbergMarquardtDoubleExponential                            5.57177  (6 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (9 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.837 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  07:06 min
[INFO] Finished at: 2026-11-12T13:53:48Z
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
# Warmup Iteration   1: 23.415 ms/op
# Warmup Iteration   2: 18.927 ms/op
Iteration   1: 18.842 ms/op
Iteration   2: 18.751 ms/op
Iteration   3: 18.687 ms/op

# Run progress: 2.17% complete, ETA 00:08:34
# Fork: 2 of 2
# Warmup Iteration   1: 23.726 ms/op
# Warmup Iteration   2: 19.004 ms/op
Iteration   1: 18.897 ms/op
Iteration   2: 18.918 ms/op
Iteration   3: 18.782 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  18.813 ±(99.9%) 0.249 ms/op [Average]
  (min, avg, max) = (18.687, 18.813, 18.918), stdev = 0.089
  CI (99.9%): [18.564, 19.062] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:21
# Fork: 1 of 2
# Warmup Iteration   1: 1.702 ms/op
# Warmup Iteration   2: 1.235 ms/op
Iteration   1: 1.186 ms/op
Iteration   2: 1.183 ms/op
Iteration   3: 1.180 ms/op

# Run progress: 6.52% complete, ETA 00:08:09
# Fork: 2 of 2
# Warmup Iteration   1: 1.659 ms/op
# Warmup Iteration   2: 1.231 ms/op
Iteration   1: 1.178 ms/op
Iteration   2: 1.174 ms/op
Iteration   3: 1.175 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.179 ±(99.9%) 0.012 ms/op [Average]
  (min, avg, max) = (1.174, 1.179, 1.186), stdev = 0.004
  CI (99.9%): [1.167, 1.192] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:07:56
# Fork: 1 of 2
# Warmup Iteration   1: 8.255 ms/op
# Warmup Iteration   2: 6.022 ms/op
Iteration   1: 6.017 ms/op
Iteration   2: 5.988 ms/op
Iteration   3: 5.982 ms/op

# Run progress: 10.87% complete, ETA 00:07:45
# Fork: 2 of 2
# Warmup Iteration   1: 8.661 ms/op
# Warmup Iteration   2: 6.050 ms/op
Iteration   1: 6.037 ms/op
Iteration   2: 5.979 ms/op
Iteration   3: 5.977 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  5.997 ±(99.9%) 0.069 ms/op [Average]
  (min, avg, max) = (5.977, 5.997, 6.037), stdev = 0.025
  CI (99.9%): [5.927, 6.066] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:33
# Fork: 1 of 2
# Warmup Iteration   1: 9.673 ms/op
# Warmup Iteration   2: 6.470 ms/op
Iteration   1: 6.446 ms/op
Iteration   2: 6.444 ms/op
Iteration   3: 6.395 ms/op

# Run progress: 15.22% complete, ETA 00:07:21
# Fork: 2 of 2
# Warmup Iteration   1: 8.155 ms/op
# Warmup Iteration   2: 6.524 ms/op
Iteration   1: 6.410 ms/op
Iteration   2: 6.418 ms/op
Iteration   3: 6.404 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.420 ±(99.9%) 0.060 ms/op [Average]
  (min, avg, max) = (6.395, 6.420, 6.446), stdev = 0.021
  CI (99.9%): [6.360, 6.479] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:10
# Fork: 1 of 2
# Warmup Iteration   1: 14.682 ms/op
# Warmup Iteration   2: 10.767 ms/op
Iteration   1: 10.706 ms/op
Iteration   2: 10.625 ms/op
Iteration   3: 10.608 ms/op

# Run progress: 19.57% complete, ETA 00:06:58
# Fork: 2 of 2
# Warmup Iteration   1: 15.197 ms/op
# Warmup Iteration   2: 10.978 ms/op
Iteration   1: 10.694 ms/op
Iteration   2: 10.661 ms/op
Iteration   3: 10.679 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.662 ±(99.9%) 0.109 ms/op [Average]
  (min, avg, max) = (10.608, 10.662, 10.706), stdev = 0.039
  CI (99.9%): [10.553, 10.772] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:06:47
# Fork: 1 of 2
# Warmup Iteration   1: 1097.354 ms/op
# Warmup Iteration   2: 387.023 ms/op
Iteration   1: 346.175 ms/op
Iteration   2: 336.751 ms/op
Iteration   3: 333.996 ms/op

# Run progress: 23.91% complete, ETA 00:06:34
# Fork: 2 of 2
# Warmup Iteration   1: 797.489 ms/op
# Warmup Iteration   2: 374.249 ms/op
Iteration   1: 343.721 ms/op
Iteration   2: 337.818 ms/op
Iteration   3: 334.810 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  338.879 ±(99.9%) 13.893 ms/op [Average]
  (min, avg, max) = (333.996, 338.879, 346.175), stdev = 4.954
  CI (99.9%): [324.985, 352.772] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:22
# Fork: 1 of 2
# Warmup Iteration   1: 1115.607 ms/op
# Warmup Iteration   2: 455.749 ms/op
Iteration   1: 395.787 ms/op
Iteration   2: 395.995 ms/op
Iteration   3: 373.065 ms/op

# Run progress: 28.26% complete, ETA 00:06:12
# Fork: 2 of 2
# Warmup Iteration   1: 1219.782 ms/op
# Warmup Iteration   2: 518.201 ms/op
Iteration   1: 393.887 ms/op
Iteration   2: 412.481 ms/op
Iteration   3: 380.576 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  391.965 ±(99.9%) 38.498 ms/op [Average]
  (min, avg, max) = (373.065, 391.965, 412.481), stdev = 13.729
  CI (99.9%): [353.467, 430.463] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:01
# Fork: 1 of 2
# Warmup Iteration   1: 738.600 ms/op
# Warmup Iteration   2: 401.669 ms/op
Iteration   1: 396.869 ms/op
Iteration   2: 391.994 ms/op
Iteration   3: 392.340 ms/op

# Run progress: 32.61% complete, ETA 00:05:50
# Fork: 2 of 2
# Warmup Iteration   1: 747.509 ms/op
# Warmup Iteration   2: 401.292 ms/op
Iteration   1: 397.530 ms/op
Iteration   2: 392.419 ms/op
Iteration   3: 389.899 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  393.509 ±(99.9%) 8.444 ms/op [Average]
  (min, avg, max) = (389.899, 393.509, 397.530), stdev = 3.011
  CI (99.9%): [385.065, 401.952] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:39
# Fork: 1 of 2
# Warmup Iteration   1: 1455.740 ms/op
# Warmup Iteration   2: 912.025 ms/op
Iteration   1: 893.255 ms/op
Iteration   2: 888.149 ms/op
Iteration   3: 887.889 ms/op

# Run progress: 36.96% complete, ETA 00:05:32
# Fork: 2 of 2
# Warmup Iteration   1: 1459.049 ms/op
# Warmup Iteration   2: 914.224 ms/op
Iteration   1: 886.664 ms/op
Iteration   2: 890.613 ms/op
Iteration   3: 887.471 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  889.007 ±(99.9%) 6.922 ms/op [Average]
  (min, avg, max) = (886.664, 889.007, 893.255), stdev = 2.468
  CI (99.9%): [882.085, 895.928] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.111 ms/op
# Warmup Iteration   2: 0.079 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:11
# Fork: 2 of 2
# Warmup Iteration   1: 0.106 ms/op
# Warmup Iteration   2: 0.079 ms/op
Iteration   1: 0.081 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.079 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.079, 0.079, 0.081), stdev = 0.001
  CI (99.9%): [0.078, 0.081] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:04:58
# Fork: 1 of 2
# Warmup Iteration   1: 7.867 ms/op
# Warmup Iteration   2: 6.141 ms/op
Iteration   1: 6.130 ms/op
Iteration   2: 6.117 ms/op
Iteration   3: 6.112 ms/op

# Run progress: 45.65% complete, ETA 00:04:45
# Fork: 2 of 2
# Warmup Iteration   1: 7.845 ms/op
# Warmup Iteration   2: 6.163 ms/op
Iteration   1: 6.135 ms/op
Iteration   2: 6.133 ms/op
Iteration   3: 6.105 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.122 ±(99.9%) 0.035 ms/op [Average]
  (min, avg, max) = (6.105, 6.122, 6.135), stdev = 0.012
  CI (99.9%): [6.087, 6.157] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.625 ms/op
# Warmup Iteration   2: 0.475 ms/op
Iteration   1: 0.475 ms/op
Iteration   2: 0.472 ms/op
Iteration   3: 0.472 ms/op

# Run progress: 50.00% complete, ETA 00:04:19
# Fork: 2 of 2
# Warmup Iteration   1: 0.611 ms/op
# Warmup Iteration   2: 0.466 ms/op
Iteration   1: 0.465 ms/op
Iteration   2: 0.465 ms/op
Iteration   3: 0.466 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.469 ±(99.9%) 0.012 ms/op [Average]
  (min, avg, max) = (0.465, 0.469, 0.475), stdev = 0.004
  CI (99.9%): [0.457, 0.482] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.561 ms/op
# Warmup Iteration   2: 1.200 ms/op
Iteration   1: 1.223 ms/op
Iteration   2: 1.195 ms/op
Iteration   3: 1.197 ms/op

# Run progress: 54.35% complete, ETA 00:03:55
# Fork: 2 of 2
# Warmup Iteration   1: 1.575 ms/op
# Warmup Iteration   2: 1.200 ms/op
Iteration   1: 1.195 ms/op
Iteration   2: 1.189 ms/op
Iteration   3: 1.195 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.199 ±(99.9%) 0.034 ms/op [Average]
  (min, avg, max) = (1.189, 1.199, 1.223), stdev = 0.012
  CI (99.9%): [1.165, 1.233] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 69.753 ms/op
# Warmup Iteration   2: 25.392 ms/op
Iteration   1: 15.968 ms/op
Iteration   2: 13.508 ms/op
Iteration   3: 11.988 ms/op

# Run progress: 58.70% complete, ETA 00:03:31
# Fork: 2 of 2
# Warmup Iteration   1: 57.577 ms/op
# Warmup Iteration   2: 27.250 ms/op
Iteration   1: 23.417 ms/op
Iteration   2: 15.607 ms/op
Iteration   3: 12.183 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  15.445 ±(99.9%) 11.910 ms/op [Average]
  (min, avg, max) = (11.988, 15.445, 23.417), stdev = 4.247
  CI (99.9%): [3.535, 27.355] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 75334.552 ms/op
# Warmup Iteration   2: 71285.171 ms/op
Iteration   1: 70712.314 ms/op
Iteration   2: 70670.872 ms/op
Iteration   3: 70582.306 ms/op

# Run progress: 63.04% complete, ETA 00:06:33
# Fork: 2 of 2
# Warmup Iteration   1: 75127.142 ms/op
# Warmup Iteration   2: 71409.577 ms/op
Iteration   1: 70881.479 ms/op
Iteration   2: 70962.126 ms/op
Iteration   3: 72201.870 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  71001.828 ±(99.9%) 1694.393 ms/op [Average]
  (min, avg, max) = (70582.306, 71001.828, 72201.870), stdev = 604.237
  CI (99.9%): [69307.435, 72696.220] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:09:10
# Fork: 1 of 2
# Warmup Iteration   1: 27838.248 ms/op
# Warmup Iteration   2: 14373.529 ms/op
Iteration   1: 24762.478 ms/op
Iteration   2: 12004.709 ms/op
Iteration   3: 18702.660 ms/op

# Run progress: 67.39% complete, ETA 00:11:05
# Fork: 2 of 2
# Warmup Iteration   1: 22703.584 ms/op
# Warmup Iteration   2: 13665.254 ms/op
Iteration   1: 20396.880 ms/op
Iteration   2: 18898.871 ms/op
Iteration   3: 17010.358 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  18629.326 ±(99.9%) 11718.981 ms/op [Average]
  (min, avg, max) = (12004.709, 18629.326, 24762.478), stdev = 4179.101
  CI (99.9%): [6910.345, 30348.307] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:12:38
# Fork: 1 of 2
# Warmup Iteration   1: 8181.815 ms/op
# Warmup Iteration   2: 6487.573 ms/op
Iteration   1: 6323.914 ms/op
Iteration   2: 6256.427 ms/op
Iteration   3: 6179.949 ms/op

# Run progress: 71.74% complete, ETA 00:11:36
# Fork: 2 of 2
# Warmup Iteration   1: 8224.126 ms/op
# Warmup Iteration   2: 6440.574 ms/op
Iteration   1: 6246.027 ms/op
Iteration   2: 6195.510 ms/op
Iteration   3: 6163.542 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6227.561 ±(99.9%) 167.552 ms/op [Average]
  (min, avg, max) = (6163.542, 6227.561, 6323.914), stdev = 59.751
  CI (99.9%): [6060.009, 6395.113] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:10:35
# Fork: 1 of 2
# Warmup Iteration   1: Nov 12, 2026 2:23:51 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 12, 2026 2:23:51 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
74.105 ms/op
# Warmup Iteration   2: 46.325 ms/op
Iteration   1: 44.643 ms/op
Iteration   2: 44.232 ms/op
Iteration   3: 44.143 ms/op

# Run progress: 76.09% complete, ETA 00:09:29
# Fork: 2 of 2
# Warmup Iteration   1: Nov 12, 2026 2:24:02 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 12, 2026 2:24:02 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
63.594 ms/op
# Warmup Iteration   2: 45.656 ms/op
Iteration   1: 43.783 ms/op
Iteration   2: 43.641 ms/op
Iteration   3: 43.604 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  44.008 ±(99.9%) 1.136 ms/op [Average]
  (min, avg, max) = (43.604, 44.008, 44.643), stdev = 0.405
  CI (99.9%): [42.872, 45.143] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:08:26
# Fork: 1 of 2
# Warmup Iteration   1: 63.728 ms/op
# Warmup Iteration   2: 50.550 ms/op
Iteration   1: 49.919 ms/op
Iteration   2: 49.632 ms/op
Iteration   3: 49.385 ms/op

# Run progress: 80.43% complete, ETA 00:07:26
# Fork: 2 of 2
# Warmup Iteration   1: 51.026 ms/op
# Warmup Iteration   2: 48.748 ms/op
Iteration   1: 48.606 ms/op
Iteration   2: 48.256 ms/op
Iteration   3: 48.172 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  48.995 ±(99.9%) 2.094 ms/op [Average]
  (min, avg, max) = (48.172, 48.995, 49.919), stdev = 0.747
  CI (99.9%): [46.901, 51.089] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:06:28
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:33
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

# Run progress: 86.96% complete, ETA 00:04:40
# Fork: 1 of 2
# Warmup Iteration   1: 32.355 ms/op
# Warmup Iteration   2: 25.273 ms/op
Iteration   1: 24.861 ms/op
Iteration   2: 24.910 ms/op
Iteration   3: 24.649 ms/op

# Run progress: 89.13% complete, ETA 00:03:49
# Fork: 2 of 2
# Warmup Iteration   1: 32.505 ms/op
# Warmup Iteration   2: 25.248 ms/op
Iteration   1: 24.989 ms/op
Iteration   2: 24.734 ms/op
Iteration   3: 24.694 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  24.806 ±(99.9%) 0.376 ms/op [Average]
  (min, avg, max) = (24.649, 24.806, 24.989), stdev = 0.134
  CI (99.9%): [24.430, 25.182] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:00
# Fork: 1 of 2
# Warmup Iteration   1: 11.478 ms/op
# Warmup Iteration   2: 9.622 ms/op
Iteration   1: 9.325 ms/op
Iteration   2: 9.307 ms/op
Iteration   3: 9.239 ms/op

# Run progress: 93.48% complete, ETA 00:02:12
# Fork: 2 of 2
# Warmup Iteration   1: 12.243 ms/op
# Warmup Iteration   2: 9.494 ms/op
Iteration   1: 9.422 ms/op
Iteration   2: 9.365 ms/op
Iteration   3: 9.324 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.330 ±(99.9%) 0.171 ms/op [Average]
  (min, avg, max) = (9.239, 9.330, 9.422), stdev = 0.061
  CI (99.9%): [9.159, 9.501] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:26
# Fork: 1 of 2
# Warmup Iteration   1: 23.113 ms/op
# Warmup Iteration   2: 20.313 ms/op
Iteration   1: 20.332 ms/op
Iteration   2: 20.306 ms/op
Iteration   3: 20.307 ms/op

# Run progress: 97.83% complete, ETA 00:00:42
# Fork: 2 of 2
# Warmup Iteration   1: 22.745 ms/op
# Warmup Iteration   2: 19.988 ms/op
Iteration   1: 20.010 ms/op
Iteration   2: 20.015 ms/op
Iteration   3: 20.065 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  20.172 ±(99.9%) 0.442 ms/op [Average]
  (min, avg, max) = (20.010, 20.172, 20.332), stdev = 0.158
  CI (99.9%): [19.730, 20.615] (assumes normal distribution)


# Run complete. Total time: 00:32:14

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     18.813 ±     0.249  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.179 ±     0.012  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      5.997 ±     0.069  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.420 ±     0.060  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.662 ±     0.109  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    338.879 ±    13.893  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    391.965 ±    38.498  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    393.509 ±     8.444  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    889.007 ±     6.922  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.079 ±     0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.122 ±     0.035  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.469 ±     0.012  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.199 ±     0.034  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     15.445 ±    11.910  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  71001.828 ±  1694.393  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  18629.326 ± 11718.981  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6227.561 ±   167.552  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     44.008 ±     1.136  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     48.995 ±     2.094  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     24.806 ±     0.376  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.330 ±     0.171  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     20.172 ±     0.442  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.21.0 -> 3.22.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 13 lower, 10 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| process.Compressor_Benchmark.compressorprocess | 14.0101 | 15.4454 | +10.24% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000287169 | 0.000280505 | -2.32% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 19068.1 | 18629.3 | -2.30% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 6340.1 | 6227.56 | -1.78% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 386.414 | 391.965 | +1.44% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.19118 | 1.17932 | -1.00% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 70352.8 | 71001.8 | +0.92% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 396.341 | 393.509 | -0.71% | Overlapping CIs |
| flash.TPflash.testFlash | 341.106 | 338.879 | -0.65% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.28143 | 9.33027 | +0.53% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
