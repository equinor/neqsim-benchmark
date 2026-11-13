# NeqSim 3.26.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.25.0 |
| Current | 3.26.0 |
| Source commit | `19c5b0fa315e8fa2ea5f10dc92cfe1d88a8c7aeb` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43453733160) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "19c5b0fa315e8fa2ea5f10dc92cfe1d88a8c7aeb",
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
| baseline | 3.25.0 | passed |
| current | 3.26.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.25.0",
  "version": "3.25.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.25.0/neqsim-3.25.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.26.0",
  "version": "3.26.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.26.0/neqsim-3.26.0.jar",
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
[INFO] Total time:  6.881 s
[INFO] Finished at: 2026-11-13T15:33:25Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.25.0 (neqsim-3.25.0.jar); requested: 3.25.0
$ mvn clean verify -Dneqsim.version=3.25.0
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
TEG full process: 8652 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.689 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.604 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.064 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 429318 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 31 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    5.91e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.75e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     7.04e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.75e-03 after 31 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 9.49e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264022.3 + 376579.1, oil 1995103.4 + 2849969.1, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.391 MSm3/d, KA27841 A 102.7 bara, pipeline outlet 51.8 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 429.3 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (5 ms)
tpFlashWellFluidSrk                                            83.6406  (58 ms)
tpFlashWellFluidPr                                             83.6541  (44 ms)
tpFlashWellFluidWithProperties                                 5445.46  (42 ms)
phAndPsFlashWellFluid                                          2459.23  (64 ms)
Nov 13, 2026 3:40:56 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 3:40:56 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (465 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (229 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (169 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (58 ms)
saturationPointsWellFluid                                      1601.32  (138 ms)
singlePhaseGasPipelineSteadyState                              121.628  (729 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98717  (1367 ms)
levenbergMarquardtAntoine                                      1837.31  (7 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (4 ms)
dataReconciliation[100]                                        37.0132  (32 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.201 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.25.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.25.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  07:41 min
[INFO] Finished at: 2026-11-13T15:41:07Z
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
# Warmup Iteration   1: 23.969 ms/op
# Warmup Iteration   2: 19.157 ms/op
Iteration   1: 18.979 ms/op
Iteration   2: 18.856 ms/op
Iteration   3: 18.922 ms/op

# Run progress: 2.17% complete, ETA 00:08:48
# Fork: 2 of 2
# Warmup Iteration   1: 22.671 ms/op
# Warmup Iteration   2: 18.991 ms/op
Iteration   1: 19.013 ms/op
Iteration   2: 18.943 ms/op
Iteration   3: 19.160 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  18.979 ±(99.9%) 0.290 ms/op [Average]
  (min, avg, max) = (18.856, 18.979, 19.160), stdev = 0.103
  CI (99.9%): [18.689, 19.269] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:33
# Fork: 1 of 2
# Warmup Iteration   1: 1.187 ms/op
# Warmup Iteration   2: 0.940 ms/op
Iteration   1: 0.932 ms/op
Iteration   2: 0.915 ms/op
Iteration   3: 0.914 ms/op

# Run progress: 6.52% complete, ETA 00:08:21
# Fork: 2 of 2
# Warmup Iteration   1: 1.295 ms/op
# Warmup Iteration   2: 0.944 ms/op
Iteration   1: 0.927 ms/op
Iteration   2: 0.913 ms/op
Iteration   3: 0.912 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.919 ±(99.9%) 0.023 ms/op [Average]
  (min, avg, max) = (0.912, 0.919, 0.932), stdev = 0.008
  CI (99.9%): [0.896, 0.942] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:08
# Fork: 1 of 2
# Warmup Iteration   1: 7.845 ms/op
# Warmup Iteration   2: 5.880 ms/op
Iteration   1: 5.857 ms/op
Iteration   2: 5.864 ms/op
Iteration   3: 5.857 ms/op

# Run progress: 10.87% complete, ETA 00:07:56
# Fork: 2 of 2
# Warmup Iteration   1: 7.308 ms/op
# Warmup Iteration   2: 5.914 ms/op
Iteration   1: 5.851 ms/op
Iteration   2: 5.848 ms/op
Iteration   3: 5.812 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  5.848 ±(99.9%) 0.052 ms/op [Average]
  (min, avg, max) = (5.812, 5.848, 5.864), stdev = 0.018
  CI (99.9%): [5.797, 5.900] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:44
# Fork: 1 of 2
# Warmup Iteration   1: 9.017 ms/op
# Warmup Iteration   2: 6.334 ms/op
Iteration   1: 6.342 ms/op
Iteration   2: 6.348 ms/op
Iteration   3: 6.314 ms/op

# Run progress: 15.22% complete, ETA 00:07:33
# Fork: 2 of 2
# Warmup Iteration   1: 8.122 ms/op
# Warmup Iteration   2: 6.470 ms/op
Iteration   1: 6.407 ms/op
Iteration   2: 6.403 ms/op
Iteration   3: 6.353 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.361 ±(99.9%) 0.102 ms/op [Average]
  (min, avg, max) = (6.314, 6.361, 6.407), stdev = 0.037
  CI (99.9%): [6.259, 6.464] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 17.416 ms/op
# Warmup Iteration   2: 10.785 ms/op
Iteration   1: 10.615 ms/op
Iteration   2: 10.491 ms/op
Iteration   3: 10.497 ms/op

# Run progress: 19.57% complete, ETA 00:07:09
# Fork: 2 of 2
# Warmup Iteration   1: 16.863 ms/op
# Warmup Iteration   2: 10.648 ms/op
Iteration   1: 10.564 ms/op
Iteration   2: 10.535 ms/op
Iteration   3: 10.517 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.537 ±(99.9%) 0.131 ms/op [Average]
  (min, avg, max) = (10.491, 10.537, 10.615), stdev = 0.047
  CI (99.9%): [10.405, 10.668] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1170.639 ms/op
# Warmup Iteration   2: 405.567 ms/op
Iteration   1: 349.152 ms/op
Iteration   2: 347.515 ms/op
Iteration   3: 352.419 ms/op

# Run progress: 23.91% complete, ETA 00:06:44
# Fork: 2 of 2
# Warmup Iteration   1: 811.950 ms/op
# Warmup Iteration   2: 380.117 ms/op
Iteration   1: 352.688 ms/op
Iteration   2: 343.981 ms/op
Iteration   3: 342.068 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  347.971 ±(99.9%) 12.185 ms/op [Average]
  (min, avg, max) = (342.068, 347.971, 352.688), stdev = 4.345
  CI (99.9%): [335.785, 360.156] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 3733.079 ms/op
# Warmup Iteration   2: 2255.391 ms/op
Iteration   1: 1847.175 ms/op
Iteration   2: 1818.345 ms/op
Iteration   3: 1795.612 ms/op

# Run progress: 28.26% complete, ETA 00:06:34
# Fork: 2 of 2
# Warmup Iteration   1: 3365.015 ms/op
# Warmup Iteration   2: 1880.392 ms/op
Iteration   1: 1805.825 ms/op
Iteration   2: 1787.661 ms/op
Iteration   3: 1776.769 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  1805.231 ±(99.9%) 70.305 ms/op [Average]
  (min, avg, max) = (1776.769, 1805.231, 1847.175), stdev = 25.072
  CI (99.9%): [1734.926, 1875.537] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:36
# Fork: 1 of 2
# Warmup Iteration   1: 751.685 ms/op
# Warmup Iteration   2: 409.712 ms/op
Iteration   1: 397.609 ms/op
Iteration   2: 396.481 ms/op
Iteration   3: 393.132 ms/op

# Run progress: 32.61% complete, ETA 00:06:22
# Fork: 2 of 2
# Warmup Iteration   1: 741.016 ms/op
# Warmup Iteration   2: 406.907 ms/op
Iteration   1: 400.129 ms/op
Iteration   2: 396.153 ms/op
Iteration   3: 393.974 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  396.246 ±(99.9%) 7.078 ms/op [Average]
  (min, avg, max) = (393.132, 396.246, 400.129), stdev = 2.524
  CI (99.9%): [389.168, 403.324] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:07
# Fork: 1 of 2
# Warmup Iteration   1: 1434.542 ms/op
# Warmup Iteration   2: 891.201 ms/op
Iteration   1: 866.569 ms/op
Iteration   2: 857.361 ms/op
Iteration   3: 856.739 ms/op

# Run progress: 36.96% complete, ETA 00:05:57
# Fork: 2 of 2
# Warmup Iteration   1: 1443.513 ms/op
# Warmup Iteration   2: 891.201 ms/op
Iteration   1: 870.010 ms/op
Iteration   2: 863.396 ms/op
Iteration   3: 862.701 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  862.796 ±(99.9%) 14.456 ms/op [Average]
  (min, avg, max) = (856.739, 862.796, 870.010), stdev = 5.155
  CI (99.9%): [848.340, 877.252] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:47
# Fork: 1 of 2
# Warmup Iteration   1: 0.107 ms/op
# Warmup Iteration   2: 0.080 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:31
# Fork: 2 of 2
# Warmup Iteration   1: 0.107 ms/op
# Warmup Iteration   2: 0.080 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.079 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.079, 0.079, 0.080), stdev = 0.001
  CI (99.9%): [0.079, 0.080] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:16
# Fork: 1 of 2
# Warmup Iteration   1: 7.949 ms/op
# Warmup Iteration   2: 6.164 ms/op
Iteration   1: 6.157 ms/op
Iteration   2: 6.142 ms/op
Iteration   3: 6.141 ms/op

# Run progress: 45.65% complete, ETA 00:05:02
# Fork: 2 of 2
# Warmup Iteration   1: 7.894 ms/op
# Warmup Iteration   2: 6.174 ms/op
Iteration   1: 6.141 ms/op
Iteration   2: 6.194 ms/op
Iteration   3: 6.131 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.151 ±(99.9%) 0.064 ms/op [Average]
  (min, avg, max) = (6.131, 6.151, 6.194), stdev = 0.023
  CI (99.9%): [6.087, 6.215] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:48
# Fork: 1 of 2
# Warmup Iteration   1: 0.621 ms/op
# Warmup Iteration   2: 0.467 ms/op
Iteration   1: 0.466 ms/op
Iteration   2: 0.466 ms/op
Iteration   3: 0.465 ms/op

# Run progress: 50.00% complete, ETA 00:04:34
# Fork: 2 of 2
# Warmup Iteration   1: 0.614 ms/op
# Warmup Iteration   2: 0.465 ms/op
Iteration   1: 0.467 ms/op
Iteration   2: 0.466 ms/op
Iteration   3: 0.464 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.466 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.464, 0.466, 0.467), stdev = 0.001
  CI (99.9%): [0.463, 0.468] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.565 ms/op
# Warmup Iteration   2: 1.197 ms/op
Iteration   1: 1.188 ms/op
Iteration   2: 1.187 ms/op
Iteration   3: 1.190 ms/op

# Run progress: 54.35% complete, ETA 00:04:07
# Fork: 2 of 2
# Warmup Iteration   1: 1.567 ms/op
# Warmup Iteration   2: 1.197 ms/op
Iteration   1: 1.194 ms/op
Iteration   2: 1.196 ms/op
Iteration   3: 1.196 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.192 ±(99.9%) 0.011 ms/op [Average]
  (min, avg, max) = (1.187, 1.192, 1.196), stdev = 0.004
  CI (99.9%): [1.181, 1.203] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 67.462 ms/op
# Warmup Iteration   2: 23.174 ms/op
Iteration   1: 21.827 ms/op
Iteration   2: 21.706 ms/op
Iteration   3: 15.967 ms/op

# Run progress: 58.70% complete, ETA 00:03:41
# Fork: 2 of 2
# Warmup Iteration   1: 71.952 ms/op
# Warmup Iteration   2: 21.816 ms/op
Iteration   1: 20.288 ms/op
Iteration   2: 17.954 ms/op
Iteration   3: 15.848 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  18.932 ±(99.9%) 7.646 ms/op [Average]
  (min, avg, max) = (15.848, 18.932, 21.827), stdev = 2.727
  CI (99.9%): [11.285, 26.578] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 95785.282 ms/op
# Warmup Iteration   2: 93771.253 ms/op
Iteration   1: 93408.599 ms/op
Iteration   2: 93469.350 ms/op
Iteration   3: 93371.211 ms/op

# Run progress: 63.04% complete, ETA 00:07:46
# Fork: 2 of 2
# Warmup Iteration   1: 97433.492 ms/op
# Warmup Iteration   2: 94398.879 ms/op
Iteration   1: 94357.751 ms/op
Iteration   2: 94207.750 ms/op
Iteration   3: 94169.272 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  93830.655 ±(99.9%) 1287.761 ms/op [Average]
  (min, avg, max) = (93371.211, 93830.655, 94357.751), stdev = 459.228
  CI (99.9%): [92542.894, 95118.417] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:18
# Fork: 1 of 2
# Warmup Iteration   1: 25137.494 ms/op
# Warmup Iteration   2: 10422.713 ms/op
Iteration   1: 21698.901 ms/op
Iteration   2: 9791.166 ms/op
Iteration   3: 18964.445 ms/op

# Run progress: 67.39% complete, ETA 00:13:08
# Fork: 2 of 2
# Warmup Iteration   1: 25500.989 ms/op
# Warmup Iteration   2: 10321.990 ms/op
Iteration   1: 21459.939 ms/op
Iteration   2: 9726.189 ms/op
Iteration   3: 18775.002 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  16735.940 ±(99.9%) 15534.164 ms/op [Average]
  (min, avg, max) = (9726.189, 16735.940, 21698.901), stdev = 5539.633
  CI (99.9%): [1201.776, 32270.105] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:14:27
# Fork: 1 of 2
# Warmup Iteration   1: 8245.196 ms/op
# Warmup Iteration   2: 6492.238 ms/op
Iteration   1: 6299.953 ms/op
Iteration   2: 6220.156 ms/op
Iteration   3: 6251.244 ms/op

# Run progress: 71.74% complete, ETA 00:13:14
# Fork: 2 of 2
# Warmup Iteration   1: 8317.155 ms/op
# Warmup Iteration   2: 6472.257 ms/op
Iteration   1: 6291.166 ms/op
Iteration   2: 6216.008 ms/op
Iteration   3: 6179.644 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6243.028 ±(99.9%) 130.905 ms/op [Average]
  (min, avg, max) = (6179.644, 6243.028, 6299.953), stdev = 46.682
  CI (99.9%): [6112.124, 6373.933] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:12:03
# Fork: 1 of 2
# Warmup Iteration   1: Nov 13, 2026 4:15:18 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 4:15:18 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
64.653 ms/op
# Warmup Iteration   2: 44.963 ms/op
Iteration   1: 45.085 ms/op
Iteration   2: 44.497 ms/op
Iteration   3: 44.638 ms/op

# Run progress: 76.09% complete, ETA 00:10:47
# Fork: 2 of 2
# Warmup Iteration   1: Nov 13, 2026 4:15:30 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 4:15:30 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
63.612 ms/op
# Warmup Iteration   2: 44.667 ms/op
Iteration   1: 44.280 ms/op
Iteration   2: 44.222 ms/op
Iteration   3: 44.080 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  44.467 ±(99.9%) 1.017 ms/op [Average]
  (min, avg, max) = (44.080, 44.467, 45.085), stdev = 0.363
  CI (99.9%): [43.450, 45.484] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:09:35
# Fork: 1 of 2
# Warmup Iteration   1: 55.957 ms/op
# Warmup Iteration   2: 50.029 ms/op
Iteration   1: 50.023 ms/op
Iteration   2: 49.769 ms/op
Iteration   3: 49.768 ms/op

# Run progress: 80.43% complete, ETA 00:08:26
# Fork: 2 of 2
# Warmup Iteration   1: 54.331 ms/op
# Warmup Iteration   2: 50.144 ms/op
Iteration   1: 49.883 ms/op
Iteration   2: 49.968 ms/op
Iteration   3: 49.708 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  49.853 ±(99.9%) 0.351 ms/op [Average]
  (min, avg, max) = (49.708, 49.853, 50.023), stdev = 0.125
  CI (99.9%): [49.502, 50.204] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:06:17
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

# Run progress: 86.96% complete, ETA 00:05:17
# Fork: 1 of 2
# Warmup Iteration   1: 32.457 ms/op
# Warmup Iteration   2: 25.588 ms/op
Iteration   1: 24.919 ms/op
Iteration   2: 24.740 ms/op
Iteration   3: 24.633 ms/op

# Run progress: 89.13% complete, ETA 00:04:19
# Fork: 2 of 2
# Warmup Iteration   1: 32.009 ms/op
# Warmup Iteration   2: 25.486 ms/op
Iteration   1: 25.032 ms/op
Iteration   2: 24.943 ms/op
Iteration   3: 24.742 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  24.835 ±(99.9%) 0.427 ms/op [Average]
  (min, avg, max) = (24.633, 24.835, 25.032), stdev = 0.152
  CI (99.9%): [24.407, 25.262] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 11.935 ms/op
# Warmup Iteration   2: 9.627 ms/op
Iteration   1: 9.483 ms/op
Iteration   2: 9.362 ms/op
Iteration   3: 9.339 ms/op

# Run progress: 93.48% complete, ETA 00:02:30
# Fork: 2 of 2
# Warmup Iteration   1: 12.026 ms/op
# Warmup Iteration   2: 9.622 ms/op
Iteration   1: 9.464 ms/op
Iteration   2: 9.369 ms/op
Iteration   3: 9.362 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.396 ±(99.9%) 0.170 ms/op [Average]
  (min, avg, max) = (9.339, 9.396, 9.483), stdev = 0.061
  CI (99.9%): [9.227, 9.566] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 28.100 ms/op
# Warmup Iteration   2: 25.007 ms/op
Iteration   1: 24.968 ms/op
Iteration   2: 24.848 ms/op
Iteration   3: 24.799 ms/op

# Run progress: 97.83% complete, ETA 00:00:48
# Fork: 2 of 2
# Warmup Iteration   1: 22.386 ms/op
# Warmup Iteration   2: 20.022 ms/op
Iteration   1: 20.027 ms/op
Iteration   2: 20.123 ms/op
Iteration   3: 20.005 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  22.462 ±(99.9%) 7.406 ms/op [Average]
  (min, avg, max) = (20.005, 22.462, 24.968), stdev = 2.641
  CI (99.9%): [15.056, 29.868] (assumes normal distribution)


# Run complete. Total time: 00:36:24

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     18.979 ±     0.290  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.919 ±     0.023  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      5.848 ±     0.052  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.361 ±     0.102  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.537 ±     0.131  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    347.971 ±    12.185  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   1805.231 ±    70.305  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    396.246 ±     7.078  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    862.796 ±    14.456  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.079 ±     0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.151 ±     0.064  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.466 ±     0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.192 ±     0.011  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     18.932 ±     7.646  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  93830.655 ±  1287.761  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  16735.940 ± 15534.164  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6243.028 ±   130.905  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     44.467 ±     1.017  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     49.853 ±     0.351  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     24.835 ±     0.427  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.396 ±     0.170  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     22.462 ±     7.406  ms/op

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
[INFO] Total time:  1.624 s
[INFO] Finished at: 2026-11-13T16:17:35Z
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
TEG full process: 8433 ms, solved=true, gas=318849.58 kg/hr, water in/out=0.00027104531/1.5400949e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00019284321, composition error=0.0030760310
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=4.7854811e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.469 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.065 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.062 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 599927 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 599.9 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (5 ms)
tpFlashWellFluidSrk                                            83.6406  (40 ms)
tpFlashWellFluidPr                                             83.6541  (39 ms)
tpFlashWellFluidWithProperties                                 5445.46  (45 ms)
phAndPsFlashWellFluid                                          2459.23  (98 ms)
Nov 13, 2026 4:27:53 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 4:27:53 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (425 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (178 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (124 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (39 ms)
saturationPointsWellFluid                                      1601.32  (132 ms)
singlePhaseGasPipelineSteadyState                              121.628  (730 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98717  (1416 ms)
levenbergMarquardtAntoine                                      1837.31  (12 ms)
levenbergMarquardtDoubleExponential                            5.57177  (4 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (8 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.952 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  10:26 min
[INFO] Finished at: 2026-11-13T16:28:02Z
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
# Warmup Iteration   1: 23.325 ms/op
# Warmup Iteration   2: 19.256 ms/op
Iteration   1: 19.220 ms/op
Iteration   2: 19.187 ms/op
Iteration   3: 19.205 ms/op

# Run progress: 2.17% complete, ETA 00:08:47
# Fork: 2 of 2
# Warmup Iteration   1: 24.533 ms/op
# Warmup Iteration   2: 19.295 ms/op
Iteration   1: 19.212 ms/op
Iteration   2: 19.173 ms/op
Iteration   3: 19.103 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  19.183 ±(99.9%) 0.120 ms/op [Average]
  (min, avg, max) = (19.103, 19.183, 19.220), stdev = 0.043
  CI (99.9%): [19.063, 19.303] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:33
# Fork: 1 of 2
# Warmup Iteration   1: 1.769 ms/op
# Warmup Iteration   2: 1.061 ms/op
Iteration   1: 1.038 ms/op
Iteration   2: 1.038 ms/op
Iteration   3: 1.039 ms/op

# Run progress: 6.52% complete, ETA 00:08:22
# Fork: 2 of 2
# Warmup Iteration   1: 1.647 ms/op
# Warmup Iteration   2: 1.051 ms/op
Iteration   1: 1.046 ms/op
Iteration   2: 1.047 ms/op
Iteration   3: 1.046 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.042 ±(99.9%) 0.012 ms/op [Average]
  (min, avg, max) = (1.038, 1.042, 1.047), stdev = 0.004
  CI (99.9%): [1.030, 1.055] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:09
# Fork: 1 of 2
# Warmup Iteration   1: 8.417 ms/op
# Warmup Iteration   2: 6.080 ms/op
Iteration   1: 6.003 ms/op
Iteration   2: 6.012 ms/op
Iteration   3: 5.890 ms/op

# Run progress: 10.87% complete, ETA 00:07:57
# Fork: 2 of 2
# Warmup Iteration   1: 8.273 ms/op
# Warmup Iteration   2: 6.137 ms/op
Iteration   1: 6.067 ms/op
Iteration   2: 5.945 ms/op
Iteration   3: 5.913 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  5.972 ±(99.9%) 0.188 ms/op [Average]
  (min, avg, max) = (5.890, 5.972, 6.067), stdev = 0.067
  CI (99.9%): [5.783, 6.160] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 8.605 ms/op
# Warmup Iteration   2: 6.534 ms/op
Iteration   1: 6.470 ms/op
Iteration   2: 6.408 ms/op
Iteration   3: 6.384 ms/op

# Run progress: 15.22% complete, ETA 00:07:33
# Fork: 2 of 2
# Warmup Iteration   1: 9.315 ms/op
# Warmup Iteration   2: 6.711 ms/op
Iteration   1: 6.412 ms/op
Iteration   2: 6.413 ms/op
Iteration   3: 6.354 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.407 ±(99.9%) 0.108 ms/op [Average]
  (min, avg, max) = (6.354, 6.407, 6.470), stdev = 0.038
  CI (99.9%): [6.299, 6.514] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:22
# Fork: 1 of 2
# Warmup Iteration   1: 16.884 ms/op
# Warmup Iteration   2: 10.856 ms/op
Iteration   1: 10.709 ms/op
Iteration   2: 10.637 ms/op
Iteration   3: 10.627 ms/op

# Run progress: 19.57% complete, ETA 00:07:10
# Fork: 2 of 2
# Warmup Iteration   1: 16.989 ms/op
# Warmup Iteration   2: 10.729 ms/op
Iteration   1: 10.629 ms/op
Iteration   2: 10.624 ms/op
Iteration   3: 10.562 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.631 ±(99.9%) 0.131 ms/op [Average]
  (min, avg, max) = (10.562, 10.631, 10.709), stdev = 0.047
  CI (99.9%): [10.500, 10.762] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1112.735 ms/op
# Warmup Iteration   2: 420.769 ms/op
Iteration   1: 384.111 ms/op
Iteration   2: 364.082 ms/op
Iteration   3: 364.073 ms/op

# Run progress: 23.91% complete, ETA 00:06:45
# Fork: 2 of 2
# Warmup Iteration   1: 1189.100 ms/op
# Warmup Iteration   2: 423.699 ms/op
Iteration   1: 373.119 ms/op
Iteration   2: 366.432 ms/op
Iteration   3: 358.255 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  368.345 ±(99.9%) 25.493 ms/op [Average]
  (min, avg, max) = (358.255, 368.345, 384.111), stdev = 9.091
  CI (99.9%): [342.852, 393.838] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 3254.569 ms/op
# Warmup Iteration   2: 2115.008 ms/op
Iteration   1: 1896.359 ms/op
Iteration   2: 1857.747 ms/op
Iteration   3: 1872.607 ms/op

# Run progress: 28.26% complete, ETA 00:06:35
# Fork: 2 of 2
# Warmup Iteration   1: 3254.533 ms/op
# Warmup Iteration   2: 2421.065 ms/op
Iteration   1: 1899.261 ms/op
Iteration   2: 1858.103 ms/op
Iteration   3: 1849.302 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  1872.230 ±(99.9%) 59.460 ms/op [Average]
  (min, avg, max) = (1849.302, 1872.230, 1899.261), stdev = 21.204
  CI (99.9%): [1812.770, 1931.690] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:35
# Fork: 1 of 2
# Warmup Iteration   1: 729.423 ms/op
# Warmup Iteration   2: 410.555 ms/op
Iteration   1: 397.753 ms/op
Iteration   2: 396.564 ms/op
Iteration   3: 396.042 ms/op

# Run progress: 32.61% complete, ETA 00:06:21
# Fork: 2 of 2
# Warmup Iteration   1: 723.778 ms/op
# Warmup Iteration   2: 411.785 ms/op
Iteration   1: 400.155 ms/op
Iteration   2: 395.831 ms/op
Iteration   3: 394.561 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  396.818 ±(99.9%) 5.430 ms/op [Average]
  (min, avg, max) = (394.561, 396.818, 400.155), stdev = 1.936
  CI (99.9%): [391.388, 402.247] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:06
# Fork: 1 of 2
# Warmup Iteration   1: 1370.890 ms/op
# Warmup Iteration   2: 887.924 ms/op
Iteration   1: 860.965 ms/op
Iteration   2: 861.208 ms/op
Iteration   3: 863.134 ms/op

# Run progress: 36.96% complete, ETA 00:05:56
# Fork: 2 of 2
# Warmup Iteration   1: 1454.605 ms/op
# Warmup Iteration   2: 882.656 ms/op
Iteration   1: 866.633 ms/op
Iteration   2: 865.104 ms/op
Iteration   3: 862.572 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  863.269 ±(99.9%) 6.238 ms/op [Average]
  (min, avg, max) = (860.965, 863.269, 866.633), stdev = 2.225
  CI (99.9%): [857.031, 869.507] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:46
# Fork: 1 of 2
# Warmup Iteration   1: 0.113 ms/op
# Warmup Iteration   2: 0.080 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:30
# Fork: 2 of 2
# Warmup Iteration   1: 0.108 ms/op
# Warmup Iteration   2: 0.079 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.079 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.079, 0.079, 0.080), stdev = 0.001
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

# Run progress: 43.48% complete, ETA 00:05:15
# Fork: 1 of 2
# Warmup Iteration   1: 7.891 ms/op
# Warmup Iteration   2: 6.175 ms/op
Iteration   1: 6.142 ms/op
Iteration   2: 6.123 ms/op
Iteration   3: 6.134 ms/op

# Run progress: 45.65% complete, ETA 00:05:01
# Fork: 2 of 2
# Warmup Iteration   1: 7.958 ms/op
# Warmup Iteration   2: 6.163 ms/op
Iteration   1: 6.149 ms/op
Iteration   2: 6.140 ms/op
Iteration   3: 6.136 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.138 ±(99.9%) 0.025 ms/op [Average]
  (min, avg, max) = (6.123, 6.138, 6.149), stdev = 0.009
  CI (99.9%): [6.113, 6.162] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.623 ms/op
# Warmup Iteration   2: 0.465 ms/op
Iteration   1: 0.463 ms/op
Iteration   2: 0.462 ms/op
Iteration   3: 0.462 ms/op

# Run progress: 50.00% complete, ETA 00:04:33
# Fork: 2 of 2
# Warmup Iteration   1: 0.629 ms/op
# Warmup Iteration   2: 0.458 ms/op
Iteration   1: 0.459 ms/op
Iteration   2: 0.460 ms/op
Iteration   3: 0.460 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.461 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.459, 0.461, 0.463), stdev = 0.002
  CI (99.9%): [0.457, 0.465] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.630 ms/op
# Warmup Iteration   2: 1.198 ms/op
Iteration   1: 1.184 ms/op
Iteration   2: 1.187 ms/op
Iteration   3: 1.184 ms/op

# Run progress: 54.35% complete, ETA 00:04:06
# Fork: 2 of 2
# Warmup Iteration   1: 1.576 ms/op
# Warmup Iteration   2: 1.196 ms/op
Iteration   1: 1.195 ms/op
Iteration   2: 1.191 ms/op
Iteration   3: 1.191 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.189 ±(99.9%) 0.012 ms/op [Average]
  (min, avg, max) = (1.184, 1.189, 1.195), stdev = 0.004
  CI (99.9%): [1.177, 1.201] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 77.194 ms/op
# Warmup Iteration   2: 30.705 ms/op
Iteration   1: 25.674 ms/op
Iteration   2: 19.172 ms/op
Iteration   3: 17.076 ms/op

# Run progress: 58.70% complete, ETA 00:03:41
# Fork: 2 of 2
# Warmup Iteration   1: 91.588 ms/op
# Warmup Iteration   2: 36.609 ms/op
Iteration   1: 22.593 ms/op
Iteration   2: 19.121 ms/op
Iteration   3: 16.750 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  20.065 ±(99.9%) 9.670 ms/op [Average]
  (min, avg, max) = (16.750, 20.065, 25.674), stdev = 3.449
  CI (99.9%): [10.394, 29.735] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:28
# Fork: 1 of 2
# Warmup Iteration   1: 101573.315 ms/op
# Warmup Iteration   2: 98734.059 ms/op
Iteration   1: 98206.125 ms/op
Iteration   2: 98098.357 ms/op
Iteration   3: 98027.775 ms/op

# Run progress: 63.04% complete, ETA 00:08:01
# Fork: 2 of 2
# Warmup Iteration   1: 101911.689 ms/op
# Warmup Iteration   2: 99218.410 ms/op
Iteration   1: 98984.919 ms/op
Iteration   2: 98982.029 ms/op
Iteration   3: 98684.285 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  98497.248 ±(99.9%) 1236.446 ms/op [Average]
  (min, avg, max) = (98027.775, 98497.248, 98984.919), stdev = 440.928
  CI (99.9%): [97260.803, 99733.694] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:43
# Fork: 1 of 2
# Warmup Iteration   1: 17217.372 ms/op
# Warmup Iteration   2: 17972.595 ms/op
Iteration   1: 11958.078 ms/op
Iteration   2: 17875.300 ms/op
Iteration   3: 11815.646 ms/op

# Run progress: 67.39% complete, ETA 00:14:10
# Fork: 2 of 2
# Warmup Iteration   1: 17368.767 ms/op
# Warmup Iteration   2: 18099.817 ms/op
Iteration   1: 12098.821 ms/op
Iteration   2: 18029.575 ms/op
Iteration   3: 11931.459 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  13951.480 ±(99.9%) 8695.284 ms/op [Average]
  (min, avg, max) = (11815.646, 13951.480, 18029.575), stdev = 3100.822
  CI (99.9%): [5256.195, 22646.764] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:16:02
# Fork: 1 of 2
# Warmup Iteration   1: 8480.542 ms/op
# Warmup Iteration   2: 6411.811 ms/op
Iteration   1: 6293.839 ms/op
Iteration   2: 6186.014 ms/op
Iteration   3: 6202.385 ms/op

# Run progress: 71.74% complete, ETA 00:14:39
# Fork: 2 of 2
# Warmup Iteration   1: 8330.540 ms/op
# Warmup Iteration   2: 6406.211 ms/op
Iteration   1: 6314.306 ms/op
Iteration   2: 6209.890 ms/op
Iteration   3: 6277.687 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6247.353 ±(99.9%) 152.316 ms/op [Average]
  (min, avg, max) = (6186.014, 6247.353, 6314.306), stdev = 54.317
  CI (99.9%): [6095.038, 6399.669] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:13:19
# Fork: 1 of 2
# Warmup Iteration   1: Nov 13, 2026 5:05:50 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 5:05:50 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
57.209 ms/op
# Warmup Iteration   2: 44.754 ms/op
Iteration   1: 44.451 ms/op
Iteration   2: 44.330 ms/op
Iteration   3: 44.213 ms/op

# Run progress: 76.09% complete, ETA 00:11:55
# Fork: 2 of 2
# Warmup Iteration   1: Nov 13, 2026 5:06:01 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 5:06:01 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
61.052 ms/op
# Warmup Iteration   2: 44.729 ms/op
Iteration   1: 44.541 ms/op
Iteration   2: 44.742 ms/op
Iteration   3: 44.310 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  44.431 ±(99.9%) 0.534 ms/op [Average]
  (min, avg, max) = (44.213, 44.431, 44.742), stdev = 0.191
  CI (99.9%): [43.897, 44.965] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:10:35
# Fork: 1 of 2
# Warmup Iteration   1: 60.205 ms/op
# Warmup Iteration   2: 47.543 ms/op
Iteration   1: 47.169 ms/op
Iteration   2: 46.992 ms/op
Iteration   3: 46.679 ms/op

# Run progress: 80.43% complete, ETA 00:09:19
# Fork: 2 of 2
# Warmup Iteration   1: 60.991 ms/op
# Warmup Iteration   2: 46.122 ms/op
Iteration   1: 45.614 ms/op
Iteration   2: 45.209 ms/op
Iteration   3: 45.109 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  46.129 ±(99.9%) 2.595 ms/op [Average]
  (min, avg, max) = (45.109, 46.129, 47.169), stdev = 0.925
  CI (99.9%): [43.534, 48.723] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:08:06
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:06:56
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

# Run progress: 86.96% complete, ETA 00:05:49
# Fork: 1 of 2
# Warmup Iteration   1: 24.862 ms/op
# Warmup Iteration   2: 20.157 ms/op
Iteration   1: 19.353 ms/op
Iteration   2: 19.123 ms/op
Iteration   3: 19.150 ms/op

# Run progress: 89.13% complete, ETA 00:04:45
# Fork: 2 of 2
# Warmup Iteration   1: 24.202 ms/op
# Warmup Iteration   2: 19.991 ms/op
Iteration   1: 19.415 ms/op
Iteration   2: 19.166 ms/op
Iteration   3: 19.154 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  19.227 ±(99.9%) 0.348 ms/op [Average]
  (min, avg, max) = (19.123, 19.227, 19.415), stdev = 0.124
  CI (99.9%): [18.879, 19.575] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 10.163 ms/op
# Warmup Iteration   2: 8.373 ms/op
Iteration   1: 8.202 ms/op
Iteration   2: 8.158 ms/op
Iteration   3: 8.185 ms/op

# Run progress: 93.48% complete, ETA 00:02:45
# Fork: 2 of 2
# Warmup Iteration   1: 10.200 ms/op
# Warmup Iteration   2: 8.437 ms/op
Iteration   1: 8.208 ms/op
Iteration   2: 8.124 ms/op
Iteration   3: 8.119 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  8.166 ±(99.9%) 0.108 ms/op [Average]
  (min, avg, max) = (8.119, 8.166, 8.208), stdev = 0.039
  CI (99.9%): [8.057, 8.274] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 22.568 ms/op
# Warmup Iteration   2: 20.098 ms/op
Iteration   1: 20.068 ms/op
Iteration   2: 20.024 ms/op
Iteration   3: 20.109 ms/op

# Run progress: 97.83% complete, ETA 00:00:53
# Fork: 2 of 2
# Warmup Iteration   1: 22.894 ms/op
# Warmup Iteration   2: 20.379 ms/op
Iteration   1: 20.333 ms/op
Iteration   2: 20.326 ms/op
Iteration   3: 20.313 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  20.196 ±(99.9%) 0.402 ms/op [Average]
  (min, avg, max) = (20.024, 20.196, 20.333), stdev = 0.144
  CI (99.9%): [19.793, 20.598] (assumes normal distribution)


# Run complete. Total time: 00:40:01

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     19.183 ±    0.120  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.042 ±    0.012  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      5.972 ±    0.188  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.407 ±    0.108  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.631 ±    0.131  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    368.345 ±   25.493  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   1872.230 ±   59.460  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    396.818 ±    5.430  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    863.269 ±    6.238  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.079 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.138 ±    0.025  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.461 ±    0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.189 ±    0.012  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     20.065 ±    9.670  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  98497.248 ± 1236.446  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  13951.480 ± 8695.284  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6247.353 ±  152.316  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     44.431 ±    0.534  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     46.129 ±    2.595  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     19.227 ±    0.348  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      8.166 ±    0.108  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     20.196 ±    0.402  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.25.0 -> 3.26.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 10 lower, 13 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 24.8349 | 19.2268 | -22.58% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 16735.9 | 13951.5 | -16.64% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.918791 | 1.04229 | +13.44% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.39649 | 8.16582 | -13.10% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 22.4617 | 20.1956 | -10.09% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 49.8531 | 46.1287 | -7.47% | Separate CIs |
| process.Compressor_Benchmark.compressorprocess | 18.9315 | 20.0645 | +5.98% | Overlapping CIs |
| flash.TPflash.testFlash | 347.971 | 368.345 | +5.86% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 93830.7 | 98497.2 | +4.97% | Separate CIs |
| flash.TPflash_UMR.testFlash_UMR | 1805.23 | 1872.23 | +3.71% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
