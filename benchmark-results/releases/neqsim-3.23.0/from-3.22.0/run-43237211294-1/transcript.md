# NeqSim 3.23.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.22.0 |
| Current | 3.23.0 |
| Source commit | `0fb83d041ca6468d4b8f883daf584db3d1401519` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43237211294) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "0fb83d041ca6468d4b8f883daf584db3d1401519",
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
Model name:                              AMD EPYC 9V45 96-Core Processor
CPU family:                              26
Model:                                   2
Thread(s) per core:                      2
Core(s) per socket:                      2
Socket(s):                               1
Stepping:                                1
BogoMIPS:                                5192.24
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 x2apic movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid avx512f avx512dq rdseed adx smap avx512ifma clflushopt clwb avx512cd sha_ni avx512bw avx512vl xsaveopt xsavec xgetbv1 xsaves user_shstk avx_vnni avx512_bf16 clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload avx512vbmi umip avx512_vbmi2 gfni vaes vpclmulqdq avx512_vnni avx512_bitalg avx512_vpopcntdq rdpid fsrm avx512_vp2intersect
Virtualization:                          AMD-V
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               96 KiB (2 instances)
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
Vulnerability Tsa:                       Not affected
Vulnerability Tsx async abort:           Not affected
Vulnerability Vmscape:                   Not affected

```


## benchmark-build-summary.md

```text
## Maven Build Results

| Variant | NeqSim | Maven build |
| --- | --- | --- |
| baseline | 3.22.0 | passed |
| current | 3.23.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.22.0",
  "version": "3.22.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.22.0/neqsim-3.22.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.23.0",
  "version": "3.23.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.23.0/neqsim-3.23.0.jar",
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
[INFO] Total time:  6.662 s
[INFO] Finished at: 2026-11-12T14:26:56Z
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
TEG full process: 6520 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.551 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.697 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.046 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 375844 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 42 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    2.82e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.84e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     3.60e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.84e-03 after 42 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 4.78e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264381.9 + 377349.1, oil 1995299.1 + 2850383.1, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.419 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.4 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 375.9 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (5 ms)
tpFlashWellFluidSrk                                            83.6406  (42 ms)
tpFlashWellFluidPr                                             83.6541  (39 ms)
tpFlashWellFluidWithProperties                                 5445.46  (56 ms)
phAndPsFlashWellFluid                                          2459.23  (66 ms)
Nov 12, 2026 2:33:28 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 12, 2026 2:33:29 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (738 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (402 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (229 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (49 ms)
saturationPointsWellFluid                                      1601.32  (120 ms)
singlePhaseGasPipelineSteadyState                              121.628  (563 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1039 ms)
levenbergMarquardtAntoine                                      1837.31  (5 ms)
levenbergMarquardtDoubleExponential                            5.57177  (3 ms)
dataReconciliation[20]                                         7.89841  (2 ms)
dataReconciliation[100]                                        37.0132  (37 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.758 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  06:44 min
[INFO] Finished at: 2026-11-12T14:33:42Z
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
# Warmup Iteration   1: 17.330 ms/op
# Warmup Iteration   2: 14.831 ms/op
Iteration   1: 14.719 ms/op
Iteration   2: 14.718 ms/op
Iteration   3: 14.792 ms/op

# Run progress: 2.17% complete, ETA 00:08:23
# Fork: 2 of 2
# Warmup Iteration   1: 15.860 ms/op
# Warmup Iteration   2: 14.091 ms/op
Iteration   1: 13.810 ms/op
Iteration   2: 13.971 ms/op
Iteration   3: 14.057 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  14.344 ±(99.9%) 1.247 ms/op [Average]
  (min, avg, max) = (13.810, 14.344, 14.792), stdev = 0.445
  CI (99.9%): [13.098, 15.591] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:11
# Fork: 1 of 2
# Warmup Iteration   1: 1.297 ms/op
# Warmup Iteration   2: 0.942 ms/op
Iteration   1: 0.911 ms/op
Iteration   2: 0.907 ms/op
Iteration   3: 0.904 ms/op

# Run progress: 6.52% complete, ETA 00:07:59
# Fork: 2 of 2
# Warmup Iteration   1: 1.241 ms/op
# Warmup Iteration   2: 0.930 ms/op
Iteration   1: 0.899 ms/op
Iteration   2: 0.909 ms/op
Iteration   3: 0.910 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.907 ±(99.9%) 0.013 ms/op [Average]
  (min, avg, max) = (0.899, 0.907, 0.911), stdev = 0.005
  CI (99.9%): [0.894, 0.920] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:07:47
# Fork: 1 of 2
# Warmup Iteration   1: 5.739 ms/op
# Warmup Iteration   2: 4.435 ms/op
Iteration   1: 4.478 ms/op
Iteration   2: 4.376 ms/op
Iteration   3: 4.370 ms/op

# Run progress: 10.87% complete, ETA 00:07:36
# Fork: 2 of 2
# Warmup Iteration   1: 6.170 ms/op
# Warmup Iteration   2: 4.531 ms/op
Iteration   1: 4.490 ms/op
Iteration   2: 4.479 ms/op
Iteration   3: 4.413 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.434 ±(99.9%) 0.154 ms/op [Average]
  (min, avg, max) = (4.370, 4.434, 4.490), stdev = 0.055
  CI (99.9%): [4.280, 4.589] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:25
# Fork: 1 of 2
# Warmup Iteration   1: 6.102 ms/op
# Warmup Iteration   2: 4.859 ms/op
Iteration   1: 4.903 ms/op
Iteration   2: 4.907 ms/op
Iteration   3: 4.783 ms/op

# Run progress: 15.22% complete, ETA 00:07:13
# Fork: 2 of 2
# Warmup Iteration   1: 6.693 ms/op
# Warmup Iteration   2: 4.715 ms/op
Iteration   1: 4.766 ms/op
Iteration   2: 4.806 ms/op
Iteration   3: 4.664 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  4.805 ±(99.9%) 0.257 ms/op [Average]
  (min, avg, max) = (4.664, 4.805, 4.907), stdev = 0.092
  CI (99.9%): [4.548, 5.062] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:02
# Fork: 1 of 2
# Warmup Iteration   1: 11.308 ms/op
# Warmup Iteration   2: 8.529 ms/op
Iteration   1: 8.616 ms/op
Iteration   2: 8.668 ms/op
Iteration   3: 8.472 ms/op

# Run progress: 19.57% complete, ETA 00:06:51
# Fork: 2 of 2
# Warmup Iteration   1: 12.548 ms/op
# Warmup Iteration   2: 8.510 ms/op
Iteration   1: 8.482 ms/op
Iteration   2: 8.440 ms/op
Iteration   3: 8.545 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  8.537 ±(99.9%) 0.252 ms/op [Average]
  (min, avg, max) = (8.440, 8.537, 8.668), stdev = 0.090
  CI (99.9%): [8.285, 8.789] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 681.625 ms/op
# Warmup Iteration   2: 271.551 ms/op
Iteration   1: 256.496 ms/op
Iteration   2: 250.207 ms/op
Iteration   3: 244.675 ms/op

# Run progress: 23.91% complete, ETA 00:06:28
# Fork: 2 of 2
# Warmup Iteration   1: 710.500 ms/op
# Warmup Iteration   2: 286.661 ms/op
Iteration   1: 264.672 ms/op
Iteration   2: 262.643 ms/op
Iteration   3: 258.532 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  256.204 ±(99.9%) 21.266 ms/op [Average]
  (min, avg, max) = (244.675, 256.204, 264.672), stdev = 7.584
  CI (99.9%): [234.938, 277.470] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:15
# Fork: 1 of 2
# Warmup Iteration   1: 671.592 ms/op
# Warmup Iteration   2: 361.114 ms/op
Iteration   1: 293.452 ms/op
Iteration   2: 278.991 ms/op
Iteration   3: 280.586 ms/op

# Run progress: 28.26% complete, ETA 00:06:04
# Fork: 2 of 2
# Warmup Iteration   1: 677.438 ms/op
# Warmup Iteration   2: 316.547 ms/op
Iteration   1: 288.827 ms/op
Iteration   2: 282.703 ms/op
Iteration   3: 283.719 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  284.713 ±(99.9%) 15.261 ms/op [Average]
  (min, avg, max) = (278.991, 284.713, 293.452), stdev = 5.442
  CI (99.9%): [269.451, 299.974] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:05:53
# Fork: 1 of 2
# Warmup Iteration   1: 563.345 ms/op
# Warmup Iteration   2: 325.315 ms/op
Iteration   1: 328.248 ms/op
Iteration   2: 321.647 ms/op
Iteration   3: 314.693 ms/op

# Run progress: 32.61% complete, ETA 00:05:42
# Fork: 2 of 2
# Warmup Iteration   1: 546.835 ms/op
# Warmup Iteration   2: 322.058 ms/op
Iteration   1: 317.598 ms/op
Iteration   2: 308.776 ms/op
Iteration   3: 308.844 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  316.634 ±(99.9%) 21.251 ms/op [Average]
  (min, avg, max) = (308.776, 316.634, 328.248), stdev = 7.578
  CI (99.9%): [295.383, 337.885] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:32
# Fork: 1 of 2
# Warmup Iteration   1: 1182.683 ms/op
# Warmup Iteration   2: 715.854 ms/op
Iteration   1: 718.586 ms/op
Iteration   2: 711.673 ms/op
Iteration   3: 730.585 ms/op

# Run progress: 36.96% complete, ETA 00:05:21
# Fork: 2 of 2
# Warmup Iteration   1: 1147.058 ms/op
# Warmup Iteration   2: 738.291 ms/op
Iteration   1: 725.597 ms/op
Iteration   2: 727.335 ms/op
Iteration   3: 714.541 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  721.386 ±(99.9%) 21.238 ms/op [Average]
  (min, avg, max) = (711.673, 721.386, 730.585), stdev = 7.574
  CI (99.9%): [700.148, 742.624] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:10
# Fork: 1 of 2
# Warmup Iteration   1: 0.089 ms/op
# Warmup Iteration   2: 0.066 ms/op
Iteration   1: 0.065 ms/op
Iteration   2: 0.064 ms/op
Iteration   3: 0.064 ms/op

# Run progress: 41.30% complete, ETA 00:04:57
# Fork: 2 of 2
# Warmup Iteration   1: 0.087 ms/op
# Warmup Iteration   2: 0.066 ms/op
Iteration   1: 0.067 ms/op
Iteration   2: 0.068 ms/op
Iteration   3: 0.066 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.066 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.064, 0.066, 0.068), stdev = 0.001
  CI (99.9%): [0.062, 0.070] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:04:45
# Fork: 1 of 2
# Warmup Iteration   1: 5.942 ms/op
# Warmup Iteration   2: 4.819 ms/op
Iteration   1: 4.810 ms/op
Iteration   2: 4.980 ms/op
Iteration   3: 4.921 ms/op

# Run progress: 45.65% complete, ETA 00:04:33
# Fork: 2 of 2
# Warmup Iteration   1: 5.898 ms/op
# Warmup Iteration   2: 4.858 ms/op
Iteration   1: 4.878 ms/op
Iteration   2: 4.958 ms/op
Iteration   3: 4.874 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  4.903 ±(99.9%) 0.174 ms/op [Average]
  (min, avg, max) = (4.810, 4.903, 4.980), stdev = 0.062
  CI (99.9%): [4.729, 5.078] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:22
# Fork: 1 of 2
# Warmup Iteration   1: 0.449 ms/op
# Warmup Iteration   2: 0.345 ms/op
Iteration   1: 0.342 ms/op
Iteration   2: 0.341 ms/op
Iteration   3: 0.343 ms/op

# Run progress: 50.00% complete, ETA 00:04:10
# Fork: 2 of 2
# Warmup Iteration   1: 0.433 ms/op
# Warmup Iteration   2: 0.335 ms/op
Iteration   1: 0.334 ms/op
Iteration   2: 0.338 ms/op
Iteration   3: 0.333 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.338 ±(99.9%) 0.013 ms/op [Average]
  (min, avg, max) = (0.333, 0.338, 0.343), stdev = 0.004
  CI (99.9%): [0.326, 0.351] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:03:59
# Fork: 1 of 2
# Warmup Iteration   1: 1.155 ms/op
# Warmup Iteration   2: 0.864 ms/op
Iteration   1: 0.841 ms/op
Iteration   2: 0.831 ms/op
Iteration   3: 0.847 ms/op

# Run progress: 54.35% complete, ETA 00:03:47
# Fork: 2 of 2
# Warmup Iteration   1: 1.141 ms/op
# Warmup Iteration   2: 0.887 ms/op
Iteration   1: 0.876 ms/op
Iteration   2: 0.878 ms/op
Iteration   3: 0.900 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  0.862 ±(99.9%) 0.074 ms/op [Average]
  (min, avg, max) = (0.831, 0.862, 0.900), stdev = 0.026
  CI (99.9%): [0.788, 0.936] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:36
# Fork: 1 of 2
# Warmup Iteration   1: 54.400 ms/op
# Warmup Iteration   2: 19.314 ms/op
Iteration   1: 15.512 ms/op
Iteration   2: 9.679 ms/op
Iteration   3: 8.780 ms/op

# Run progress: 58.70% complete, ETA 00:03:25
# Fork: 2 of 2
# Warmup Iteration   1: 34.583 ms/op
# Warmup Iteration   2: 16.151 ms/op
Iteration   1: 11.067 ms/op
Iteration   2: 11.006 ms/op
Iteration   3: 8.303 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  10.724 ±(99.9%) 7.297 ms/op [Average]
  (min, avg, max) = (8.303, 10.724, 15.512), stdev = 2.602
  CI (99.9%): [3.428, 18.021] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:13
# Fork: 1 of 2
# Warmup Iteration   1: 54960.778 ms/op
# Warmup Iteration   2: 52650.487 ms/op
Iteration   1: 52724.037 ms/op
Iteration   2: 52462.590 ms/op
Iteration   3: 52054.372 ms/op

# Run progress: 63.04% complete, ETA 00:05:32
# Fork: 2 of 2
# Warmup Iteration   1: 53188.693 ms/op
# Warmup Iteration   2: 50407.562 ms/op
Iteration   1: 50557.101 ms/op
Iteration   2: 49662.166 ms/op
Iteration   3: 50392.596 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  51308.811 ±(99.9%) 3548.352 ms/op [Average]
  (min, avg, max) = (49662.166, 51308.811, 52724.037), stdev = 1265.377
  CI (99.9%): [47760.458, 54857.163] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:18
# Fork: 1 of 2
# Warmup Iteration   1: 16352.672 ms/op
# Warmup Iteration   2: 9898.198 ms/op
Iteration   1: 14095.930 ms/op
Iteration   2: 13694.589 ms/op
Iteration   3: 12249.488 ms/op

# Run progress: 67.39% complete, ETA 00:08:43
# Fork: 2 of 2
# Warmup Iteration   1: 15887.726 ms/op
# Warmup Iteration   2: 8991.790 ms/op
Iteration   1: 13707.911 ms/op
Iteration   2: 13953.446 ms/op
Iteration   3: 11995.372 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  13282.789 ±(99.9%) 2565.928 ms/op [Average]
  (min, avg, max) = (11995.372, 13282.789, 14095.930), stdev = 915.035
  CI (99.9%): [10716.862, 15848.717] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:09:45
# Fork: 1 of 2
# Warmup Iteration   1: 6754.415 ms/op
# Warmup Iteration   2: 5348.513 ms/op
Iteration   1: 4977.870 ms/op
Iteration   2: 5046.234 ms/op
Iteration   3: 5052.236 ms/op

# Run progress: 71.74% complete, ETA 00:08:58
# Fork: 2 of 2
# Warmup Iteration   1: 7219.838 ms/op
# Warmup Iteration   2: 5216.667 ms/op
Iteration   1: 4946.785 ms/op
Iteration   2: 4973.514 ms/op
Iteration   3: 4946.857 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  4990.583 ±(99.9%) 132.608 ms/op [Average]
  (min, avg, max) = (4946.785, 4990.583, 5052.236), stdev = 47.289
  CI (99.9%): [4857.974, 5123.191] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:08:11
# Fork: 1 of 2
# Warmup Iteration   1: Nov 12, 2026 2:56:57 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 12, 2026 2:56:57 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
43.490 ms/op
# Warmup Iteration   2: 33.132 ms/op
Iteration   1: 31.961 ms/op
Iteration   2: 32.181 ms/op
Iteration   3: 32.086 ms/op

# Run progress: 76.09% complete, ETA 00:07:21
# Fork: 2 of 2
# Warmup Iteration   1: Nov 12, 2026 2:57:08 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 12, 2026 2:57:08 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
44.036 ms/op
# Warmup Iteration   2: 33.555 ms/op
Iteration   1: 32.751 ms/op
Iteration   2: 33.015 ms/op
Iteration   3: 33.679 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  32.612 ±(99.9%) 1.863 ms/op [Average]
  (min, avg, max) = (31.961, 32.612, 33.679), stdev = 0.664
  CI (99.9%): [30.749, 34.475] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:06:33
# Fork: 1 of 2
# Warmup Iteration   1: 39.022 ms/op
# Warmup Iteration   2: 36.473 ms/op
Iteration   1: 35.882 ms/op
Iteration   2: 36.764 ms/op
Iteration   3: 37.726 ms/op

# Run progress: 80.43% complete, ETA 00:05:46
# Fork: 2 of 2
# Warmup Iteration   1: 44.568 ms/op
# Warmup Iteration   2: 41.894 ms/op
Iteration   1: 40.120 ms/op
Iteration   2: 39.748 ms/op
Iteration   3: 39.874 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  38.352 ±(99.9%) 5.079 ms/op [Average]
  (min, avg, max) = (35.882, 38.352, 40.120), stdev = 1.811
  CI (99.9%): [33.273, 43.431] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:05:02
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:19
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

# Run progress: 86.96% complete, ETA 00:03:38
# Fork: 1 of 2
# Warmup Iteration   1: 22.174 ms/op
# Warmup Iteration   2: 19.308 ms/op
Iteration   1: 18.204 ms/op
Iteration   2: 18.218 ms/op
Iteration   3: 18.203 ms/op

# Run progress: 89.13% complete, ETA 00:02:59
# Fork: 2 of 2
# Warmup Iteration   1: 22.578 ms/op
# Warmup Iteration   2: 18.159 ms/op
Iteration   1: 18.426 ms/op
Iteration   2: 17.704 ms/op
Iteration   3: 17.481 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  18.039 ±(99.9%) 1.019 ms/op [Average]
  (min, avg, max) = (17.481, 18.039, 18.426), stdev = 0.363
  CI (99.9%): [17.021, 19.058] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:21
# Fork: 1 of 2
# Warmup Iteration   1: 8.318 ms/op
# Warmup Iteration   2: 6.670 ms/op
Iteration   1: 6.776 ms/op
Iteration   2: 6.605 ms/op
Iteration   3: 6.482 ms/op

# Run progress: 93.48% complete, ETA 00:01:44
# Fork: 2 of 2
# Warmup Iteration   1: 8.537 ms/op
# Warmup Iteration   2: 7.033 ms/op
Iteration   1: 6.704 ms/op
Iteration   2: 7.062 ms/op
Iteration   3: 7.120 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  6.792 ±(99.9%) 0.708 ms/op [Average]
  (min, avg, max) = (6.482, 6.792, 7.120), stdev = 0.253
  CI (99.9%): [6.083, 7.500] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:08
# Fork: 1 of 2
# Warmup Iteration   1: 16.057 ms/op
# Warmup Iteration   2: 14.579 ms/op
Iteration   1: 14.655 ms/op
Iteration   2: 14.631 ms/op
Iteration   3: 14.522 ms/op

# Run progress: 97.83% complete, ETA 00:00:33
# Fork: 2 of 2
# Warmup Iteration   1: 20.080 ms/op
# Warmup Iteration   2: 18.299 ms/op
Iteration   1: 18.029 ms/op
Iteration   2: 17.656 ms/op
Iteration   3: 17.791 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  16.214 ±(99.9%) 4.963 ms/op [Average]
  (min, avg, max) = (14.522, 16.214, 18.029), stdev = 1.770
  CI (99.9%): [11.252, 21.177] (assumes normal distribution)


# Run complete. Total time: 00:25:25

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     14.344 ±    1.247  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.907 ±    0.013  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.434 ±    0.154  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      4.805 ±    0.257  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      8.537 ±    0.252  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    256.204 ±   21.266  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    284.713 ±   15.261  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    316.634 ±   21.251  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    721.386 ±   21.238  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.066 ±    0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      4.903 ±    0.174  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.338 ±    0.013  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      0.862 ±    0.074  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     10.724 ±    7.297  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  51308.811 ± 3548.352  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  13282.789 ± 2565.928  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   4990.583 ±  132.608  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     32.612 ±    1.863  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     38.352 ±    5.079  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     18.039 ±    1.019  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      6.792 ±    0.708  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     16.214 ±    4.963  ms/op

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
[INFO] Total time:  4.781 s
[INFO] Finished at: 2026-11-12T14:59:13Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.23.0 (neqsim-3.23.0.jar); requested: 3.23.0
$ mvn clean verify -Dneqsim.version=3.23.0
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
TEG full process: 6639 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.671 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.667 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.067 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 286386 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 29 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    6.72e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.84e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     3.86e-03 (tolerance: 1.00e-02) OK [worst: compressor process A::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.84e-03 after 29 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 0.000108 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 263924.9 + 376377.4, oil 1995045.1 + 2849867.2, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.384 MSm3/d, KA27841 A 102.7 bara, pipeline outlet 51.9 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 286.4 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (4 ms)
tpFlashWellFluidSrk                                            83.6406  (45 ms)
tpFlashWellFluidPr                                             83.6541  (37 ms)
tpFlashWellFluidWithProperties                                 5445.46  (39 ms)
phAndPsFlashWellFluid                                          2459.23  (69 ms)
Nov 12, 2026 3:04:14 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 12, 2026 3:04:14 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (459 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (130 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (102 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (34 ms)
saturationPointsWellFluid                                      1601.32  (102 ms)
singlePhaseGasPipelineSteadyState                              121.628  (544 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1031 ms)
levenbergMarquardtAntoine                                      1837.31  (5 ms)
levenbergMarquardtDoubleExponential                            5.57177  (3 ms)
dataReconciliation[20]                                         7.89841  (2 ms)
dataReconciliation[100]                                        37.0132  (31 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.136 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.23.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.23.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  05:07 min
[INFO] Finished at: 2026-11-12T15:04:22Z
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
# Warmup Iteration   1: 16.234 ms/op
# Warmup Iteration   2: 14.074 ms/op
Iteration   1: 14.167 ms/op
Iteration   2: 14.129 ms/op
Iteration   3: 13.866 ms/op

# Run progress: 2.17% complete, ETA 00:08:34
# Fork: 2 of 2
# Warmup Iteration   1: 16.653 ms/op
# Warmup Iteration   2: 14.005 ms/op
Iteration   1: 13.717 ms/op
Iteration   2: 13.637 ms/op
Iteration   3: 13.777 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  13.882 ±(99.9%) 0.616 ms/op [Average]
  (min, avg, max) = (13.637, 13.882, 14.167), stdev = 0.220
  CI (99.9%): [13.266, 14.498] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.238 ms/op
# Warmup Iteration   2: 0.947 ms/op
Iteration   1: 0.921 ms/op
Iteration   2: 0.929 ms/op
Iteration   3: 0.907 ms/op

# Run progress: 6.52% complete, ETA 00:08:09
# Fork: 2 of 2
# Warmup Iteration   1: 1.314 ms/op
# Warmup Iteration   2: 0.928 ms/op
Iteration   1: 0.888 ms/op
Iteration   2: 0.895 ms/op
Iteration   3: 0.909 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.908 ±(99.9%) 0.043 ms/op [Average]
  (min, avg, max) = (0.888, 0.908, 0.929), stdev = 0.015
  CI (99.9%): [0.865, 0.951] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 5.468 ms/op
# Warmup Iteration   2: 4.625 ms/op
Iteration   1: 4.513 ms/op
Iteration   2: 4.409 ms/op
Iteration   3: 4.393 ms/op

# Run progress: 10.87% complete, ETA 00:07:45
# Fork: 2 of 2
# Warmup Iteration   1: 5.426 ms/op
# Warmup Iteration   2: 4.571 ms/op
Iteration   1: 4.474 ms/op
Iteration   2: 4.673 ms/op
Iteration   3: 4.744 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.534 ±(99.9%) 0.403 ms/op [Average]
  (min, avg, max) = (4.393, 4.534, 4.744), stdev = 0.144
  CI (99.9%): [4.132, 4.937] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 6.374 ms/op
# Warmup Iteration   2: 4.774 ms/op
Iteration   1: 4.717 ms/op
Iteration   2: 4.721 ms/op
Iteration   3: 4.587 ms/op

# Run progress: 15.22% complete, ETA 00:07:22
# Fork: 2 of 2
# Warmup Iteration   1: 6.227 ms/op
# Warmup Iteration   2: 4.723 ms/op
Iteration   1: 4.812 ms/op
Iteration   2: 4.684 ms/op
Iteration   3: 4.632 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  4.692 ±(99.9%) 0.219 ms/op [Average]
  (min, avg, max) = (4.587, 4.692, 4.812), stdev = 0.078
  CI (99.9%): [4.473, 4.911] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 11.865 ms/op
# Warmup Iteration   2: 8.265 ms/op
Iteration   1: 8.240 ms/op
Iteration   2: 8.323 ms/op
Iteration   3: 8.099 ms/op

# Run progress: 19.57% complete, ETA 00:06:59
# Fork: 2 of 2
# Warmup Iteration   1: 11.883 ms/op
# Warmup Iteration   2: 8.317 ms/op
Iteration   1: 8.080 ms/op
Iteration   2: 8.215 ms/op
Iteration   3: 8.056 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  8.169 ±(99.9%) 0.298 ms/op [Average]
  (min, avg, max) = (8.056, 8.169, 8.323), stdev = 0.106
  CI (99.9%): [7.871, 8.467] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 552.188 ms/op
# Warmup Iteration   2: 286.889 ms/op
Iteration   1: 256.065 ms/op
Iteration   2: 247.606 ms/op
Iteration   3: 255.877 ms/op

# Run progress: 23.91% complete, ETA 00:06:34
# Fork: 2 of 2
# Warmup Iteration   1: 753.869 ms/op
# Warmup Iteration   2: 290.200 ms/op
Iteration   1: 262.179 ms/op
Iteration   2: 263.323 ms/op
Iteration   3: 259.555 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  257.434 ±(99.9%) 15.990 ms/op [Average]
  (min, avg, max) = (247.606, 257.434, 263.323), stdev = 5.702
  CI (99.9%): [241.444, 273.425] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2927.879 ms/op
# Warmup Iteration   2: 1398.608 ms/op
Iteration   1: 1309.544 ms/op
Iteration   2: 1389.212 ms/op
Iteration   3: 1378.064 ms/op

# Run progress: 28.26% complete, ETA 00:06:18
# Fork: 2 of 2
# Warmup Iteration   1: 2930.818 ms/op
# Warmup Iteration   2: 1559.855 ms/op
Iteration   1: 1288.555 ms/op
Iteration   2: 1288.943 ms/op
Iteration   3: 1338.411 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  1332.122 ±(99.9%) 123.395 ms/op [Average]
  (min, avg, max) = (1288.555, 1332.122, 1389.212), stdev = 44.004
  CI (99.9%): [1208.727, 1455.516] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 531.086 ms/op
# Warmup Iteration   2: 312.276 ms/op
Iteration   1: 313.294 ms/op
Iteration   2: 304.946 ms/op
Iteration   3: 308.112 ms/op

# Run progress: 32.61% complete, ETA 00:05:59
# Fork: 2 of 2
# Warmup Iteration   1: 565.365 ms/op
# Warmup Iteration   2: 326.487 ms/op
Iteration   1: 315.984 ms/op
Iteration   2: 313.292 ms/op
Iteration   3: 296.590 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  308.703 ±(99.9%) 20.078 ms/op [Average]
  (min, avg, max) = (296.590, 308.703, 315.984), stdev = 7.160
  CI (99.9%): [288.625, 328.781] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:47
# Fork: 1 of 2
# Warmup Iteration   1: 1155.160 ms/op
# Warmup Iteration   2: 692.113 ms/op
Iteration   1: 698.653 ms/op
Iteration   2: 714.469 ms/op
Iteration   3: 712.184 ms/op

# Run progress: 36.96% complete, ETA 00:05:34
# Fork: 2 of 2
# Warmup Iteration   1: 1120.407 ms/op
# Warmup Iteration   2: 683.839 ms/op
Iteration   1: 664.317 ms/op
Iteration   2: 658.956 ms/op
Iteration   3: 676.621 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  687.533 ±(99.9%) 67.901 ms/op [Average]
  (min, avg, max) = (658.956, 687.533, 714.469), stdev = 24.214
  CI (99.9%): [619.633, 755.434] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.077 ms/op
# Warmup Iteration   2: 0.060 ms/op
Iteration   1: 0.063 ms/op
Iteration   2: 0.062 ms/op
Iteration   3: 0.064 ms/op

# Run progress: 41.30% complete, ETA 00:05:10
# Fork: 2 of 2
# Warmup Iteration   1: 0.084 ms/op
# Warmup Iteration   2: 0.062 ms/op
Iteration   1: 0.063 ms/op
Iteration   2: 0.064 ms/op
Iteration   3: 0.064 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.064 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.062, 0.064, 0.064), stdev = 0.001
  CI (99.9%): [0.061, 0.066] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 5.801 ms/op
# Warmup Iteration   2: 4.873 ms/op
Iteration   1: 4.738 ms/op
Iteration   2: 4.784 ms/op
Iteration   3: 4.610 ms/op

# Run progress: 45.65% complete, ETA 00:04:44
# Fork: 2 of 2
# Warmup Iteration   1: 5.640 ms/op
# Warmup Iteration   2: 4.636 ms/op
Iteration   1: 4.700 ms/op
Iteration   2: 4.729 ms/op
Iteration   3: 4.672 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  4.705 ±(99.9%) 0.169 ms/op [Average]
  (min, avg, max) = (4.610, 4.705, 4.784), stdev = 0.060
  CI (99.9%): [4.537, 4.874] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.430 ms/op
# Warmup Iteration   2: 0.343 ms/op
Iteration   1: 0.340 ms/op
Iteration   2: 0.341 ms/op
Iteration   3: 0.331 ms/op

# Run progress: 50.00% complete, ETA 00:04:18
# Fork: 2 of 2
# Warmup Iteration   1: 0.441 ms/op
# Warmup Iteration   2: 0.333 ms/op
Iteration   1: 0.328 ms/op
Iteration   2: 0.335 ms/op
Iteration   3: 0.331 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.334 ±(99.9%) 0.015 ms/op [Average]
  (min, avg, max) = (0.328, 0.334, 0.341), stdev = 0.005
  CI (99.9%): [0.320, 0.349] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.120 ms/op
# Warmup Iteration   2: 0.880 ms/op
Iteration   1: 0.863 ms/op
Iteration   2: 0.861 ms/op
Iteration   3: 0.880 ms/op

# Run progress: 54.35% complete, ETA 00:03:54
# Fork: 2 of 2
# Warmup Iteration   1: 1.079 ms/op
# Warmup Iteration   2: 0.847 ms/op
Iteration   1: 0.847 ms/op
Iteration   2: 0.840 ms/op
Iteration   3: 0.852 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  0.857 ±(99.9%) 0.039 ms/op [Average]
  (min, avg, max) = (0.840, 0.857, 0.880), stdev = 0.014
  CI (99.9%): [0.818, 0.897] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 80.789 ms/op
# Warmup Iteration   2: 32.774 ms/op
Iteration   1: 23.179 ms/op
Iteration   2: 18.136 ms/op
Iteration   3: 16.686 ms/op

# Run progress: 58.70% complete, ETA 00:03:31
# Fork: 2 of 2
# Warmup Iteration   1: 60.950 ms/op
# Warmup Iteration   2: 21.434 ms/op
Iteration   1: 17.963 ms/op
Iteration   2: 18.433 ms/op
Iteration   3: 16.815 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  18.535 ±(99.9%) 6.688 ms/op [Average]
  (min, avg, max) = (16.686, 18.535, 23.179), stdev = 2.385
  CI (99.9%): [11.848, 25.223] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 55865.779 ms/op
# Warmup Iteration   2: 51368.288 ms/op
Iteration   1: 49418.848 ms/op
Iteration   2: 49671.011 ms/op
Iteration   3: 50521.579 ms/op

# Run progress: 63.04% complete, ETA 00:05:32
# Fork: 2 of 2
# Warmup Iteration   1: 57066.433 ms/op
# Warmup Iteration   2: 53229.508 ms/op
Iteration   1: 52433.871 ms/op
Iteration   2: 52505.206 ms/op
Iteration   3: 52459.818 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  51168.389 ±(99.9%) 4117.041 ms/op [Average]
  (min, avg, max) = (49418.848, 51168.389, 52505.206), stdev = 1468.177
  CI (99.9%): [47051.348, 55285.430] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:26
# Fork: 1 of 2
# Warmup Iteration   1: 18200.298 ms/op
# Warmup Iteration   2: 18738.112 ms/op
Iteration   1: 13527.630 ms/op
Iteration   2: 15181.264 ms/op
Iteration   3: 13198.419 ms/op

# Run progress: 67.39% complete, ETA 00:09:02
# Fork: 2 of 2
# Warmup Iteration   1: 23846.769 ms/op
# Warmup Iteration   2: 9093.753 ms/op
Iteration   1: 18692.937 ms/op
Iteration   2: 8484.512 ms/op
Iteration   3: 15238.791 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  14053.925 ±(99.9%) 9403.226 ms/op [Average]
  (min, avg, max) = (8484.512, 14053.925, 18692.937), stdev = 3353.281
  CI (99.9%): [4650.699, 23457.152] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:10:01
# Fork: 1 of 2
# Warmup Iteration   1: 6941.295 ms/op
# Warmup Iteration   2: 5194.318 ms/op
Iteration   1: 5156.221 ms/op
Iteration   2: 4910.963 ms/op
Iteration   3: 4855.473 ms/op

# Run progress: 71.74% complete, ETA 00:09:11
# Fork: 2 of 2
# Warmup Iteration   1: 6422.054 ms/op
# Warmup Iteration   2: 5423.060 ms/op
Iteration   1: 4942.485 ms/op
Iteration   2: 4890.436 ms/op
Iteration   3: 4820.022 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  4929.266 ±(99.9%) 333.936 ms/op [Average]
  (min, avg, max) = (4820.022, 4929.266, 5156.221), stdev = 119.085
  CI (99.9%): [4595.331, 5263.202] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:08:23
# Fork: 1 of 2
# Warmup Iteration   1: Nov 12, 2026 3:28:11 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 12, 2026 3:28:11 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
43.783 ms/op
# Warmup Iteration   2: 34.815 ms/op
Iteration   1: 34.373 ms/op
Iteration   2: 34.370 ms/op
Iteration   3: 33.298 ms/op

# Run progress: 76.09% complete, ETA 00:07:32
# Fork: 2 of 2
# Warmup Iteration   1: Nov 12, 2026 3:28:22 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 12, 2026 3:28:22 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
43.228 ms/op
# Warmup Iteration   2: 34.596 ms/op
Iteration   1: 34.068 ms/op
Iteration   2: 34.418 ms/op
Iteration   3: 33.813 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  34.057 ±(99.9%) 1.231 ms/op [Average]
  (min, avg, max) = (33.298, 34.057, 34.418), stdev = 0.439
  CI (99.9%): [32.825, 35.288] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:06:42
# Fork: 1 of 2
# Warmup Iteration   1: 37.475 ms/op
# Warmup Iteration   2: 37.548 ms/op
Iteration   1: 39.078 ms/op
Iteration   2: 37.055 ms/op
Iteration   3: 37.117 ms/op

# Run progress: 80.43% complete, ETA 00:05:55
# Fork: 2 of 2
# Warmup Iteration   1: 39.889 ms/op
# Warmup Iteration   2: 37.754 ms/op
Iteration   1: 37.341 ms/op
Iteration   2: 37.334 ms/op
Iteration   3: 38.784 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  37.785 ±(99.9%) 2.524 ms/op [Average]
  (min, avg, max) = (37.055, 37.785, 39.078), stdev = 0.900
  CI (99.9%): [35.261, 40.308] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:05:09
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:26
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

# Run progress: 86.96% complete, ETA 00:03:44
# Fork: 1 of 2
# Warmup Iteration   1: 22.265 ms/op
# Warmup Iteration   2: 19.410 ms/op
Iteration   1: 18.244 ms/op
Iteration   2: 17.461 ms/op
Iteration   3: 18.020 ms/op

# Run progress: 89.13% complete, ETA 00:03:03
# Fork: 2 of 2
# Warmup Iteration   1: 21.903 ms/op
# Warmup Iteration   2: 18.963 ms/op
Iteration   1: 18.345 ms/op
Iteration   2: 18.050 ms/op
Iteration   3: 18.227 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  18.058 ±(99.9%) 0.889 ms/op [Average]
  (min, avg, max) = (17.461, 18.058, 18.345), stdev = 0.317
  CI (99.9%): [17.168, 18.947] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:24
# Fork: 1 of 2
# Warmup Iteration   1: 8.391 ms/op
# Warmup Iteration   2: 7.046 ms/op
Iteration   1: 7.036 ms/op
Iteration   2: 6.969 ms/op
Iteration   3: 6.861 ms/op

# Run progress: 93.48% complete, ETA 00:01:46
# Fork: 2 of 2
# Warmup Iteration   1: 8.776 ms/op
# Warmup Iteration   2: 7.121 ms/op
Iteration   1: 6.920 ms/op
Iteration   2: 6.757 ms/op
Iteration   3: 6.766 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  6.885 ±(99.9%) 0.313 ms/op [Average]
  (min, avg, max) = (6.757, 6.885, 7.036), stdev = 0.112
  CI (99.9%): [6.572, 7.198] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:09
# Fork: 1 of 2
# Warmup Iteration   1: 16.078 ms/op
# Warmup Iteration   2: 14.739 ms/op
Iteration   1: 14.573 ms/op
Iteration   2: 14.693 ms/op
Iteration   3: 14.814 ms/op

# Run progress: 97.83% complete, ETA 00:00:34
# Fork: 2 of 2
# Warmup Iteration   1: 16.104 ms/op
# Warmup Iteration   2: 14.256 ms/op
Iteration   1: 14.798 ms/op
Iteration   2: 14.866 ms/op
Iteration   3: 14.530 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  14.712 ±(99.9%) 0.385 ms/op [Average]
  (min, avg, max) = (14.530, 14.712, 14.866), stdev = 0.137
  CI (99.9%): [14.327, 15.097] (assumes normal distribution)


# Run complete. Total time: 00:26:00

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     13.882 ±    0.616  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.908 ±    0.043  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.534 ±    0.403  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      4.692 ±    0.219  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      8.169 ±    0.298  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    257.434 ±   15.990  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   1332.122 ±  123.395  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    308.703 ±   20.078  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    687.533 ±   67.901  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.064 ±    0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      4.705 ±    0.169  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.334 ±    0.015  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      0.857 ±    0.039  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     18.535 ±    6.688  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  51168.389 ± 4117.041  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  14053.925 ± 9403.226  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   4929.266 ±  333.936  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     34.057 ±    1.231  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     37.785 ±    2.524  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     18.058 ±    0.889  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      6.885 ±    0.313  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     14.712 ±    0.385  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.22.0 -> 3.23.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 14 lower, 9 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.TPflash_UMR.testFlash_UMR | 284.713 | 1332.12 | +367.88% | Separate CIs |
| process.Compressor_Benchmark.compressorprocess | 10.7243 | 18.5353 | +72.83% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 16.2141 | 14.7121 | -9.26% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 13282.8 | 14053.9 | +5.81% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 721.386 | 687.533 | -4.69% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 32.612 | 34.0567 | +4.43% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 8.53723 | 8.16885 | -4.31% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 4.90331 | 4.70547 | -4.03% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0657397 | 0.0635049 | -3.40% | Overlapping CIs |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 14.3445 | 13.882 | -3.22% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
