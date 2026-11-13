# NeqSim 3.26.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.25.0 |
| Current | 3.26.0 |
| Source commit | `2eb9533414efcc1cbbe6d55f8047058ac0474ff9` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43438092272) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "2eb9533414efcc1cbbe6d55f8047058ac0474ff9",
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
BogoMIPS:                                5192.28
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
[INFO] Total time:  4.630 s
[INFO] Finished at: 2026-11-13T13:56:59Z
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
TEG full process: 8541 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.581 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.940 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.073 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 427956 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 29 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    6.73e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.70e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     7.82e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.70e-03 after 29 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 0.000107 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 263927.5 + 376379.9, oil 1995059.4 + 2849863.4, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.384 MSm3/d, KA27841 A 102.7 bara, pipeline outlet 51.9 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 428.0 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (6 ms)
tpFlashWellFluidSrk                                            83.6406  (40 ms)
tpFlashWellFluidPr                                             83.6541  (31 ms)
tpFlashWellFluidWithProperties                                 5445.46  (27 ms)
phAndPsFlashWellFluid                                          2459.23  (52 ms)
Nov 13, 2026 2:04:29 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 2:04:29 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (826 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (335 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (187 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (70 ms)
saturationPointsWellFluid                                      1601.32  (174 ms)
singlePhaseGasPipelineSteadyState                              121.628  (741 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98717  (1372 ms)
levenbergMarquardtAntoine                                      1837.31  (6 ms)
levenbergMarquardtDoubleExponential                            5.57177  (4 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (11 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.632 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Finished at: 2026-11-13T14:04:41Z
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
# Warmup Iteration   1: 23.298 ms/op
# Warmup Iteration   2: 19.372 ms/op
Iteration   1: 19.252 ms/op
Iteration   2: 19.199 ms/op
Iteration   3: 19.214 ms/op

# Run progress: 2.17% complete, ETA 00:08:50
# Fork: 2 of 2
# Warmup Iteration   1: 24.464 ms/op
# Warmup Iteration   2: 19.290 ms/op
Iteration   1: 19.244 ms/op
Iteration   2: 19.347 ms/op
Iteration   3: 19.231 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  19.248 ±(99.9%) 0.147 ms/op [Average]
  (min, avg, max) = (19.199, 19.248, 19.347), stdev = 0.052
  CI (99.9%): [19.101, 19.395] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.788 ms/op
# Warmup Iteration   2: 0.958 ms/op
Iteration   1: 0.939 ms/op
Iteration   2: 0.917 ms/op
Iteration   3: 0.917 ms/op

# Run progress: 6.52% complete, ETA 00:08:25
# Fork: 2 of 2
# Warmup Iteration   1: 1.528 ms/op
# Warmup Iteration   2: 0.942 ms/op
Iteration   1: 0.942 ms/op
Iteration   2: 0.914 ms/op
Iteration   3: 0.912 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.924 ±(99.9%) 0.038 ms/op [Average]
  (min, avg, max) = (0.912, 0.924, 0.942), stdev = 0.013
  CI (99.9%): [0.886, 0.961] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 7.452 ms/op
# Warmup Iteration   2: 5.977 ms/op
Iteration   1: 5.978 ms/op
Iteration   2: 5.885 ms/op
Iteration   3: 5.853 ms/op

# Run progress: 10.87% complete, ETA 00:08:00
# Fork: 2 of 2
# Warmup Iteration   1: 7.527 ms/op
# Warmup Iteration   2: 5.949 ms/op
Iteration   1: 5.909 ms/op
Iteration   2: 5.896 ms/op
Iteration   3: 5.873 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  5.899 ±(99.9%) 0.122 ms/op [Average]
  (min, avg, max) = (5.853, 5.899, 5.978), stdev = 0.043
  CI (99.9%): [5.777, 6.020] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:48
# Fork: 1 of 2
# Warmup Iteration   1: 8.068 ms/op
# Warmup Iteration   2: 6.504 ms/op
Iteration   1: 6.422 ms/op
Iteration   2: 6.401 ms/op
Iteration   3: 6.395 ms/op

# Run progress: 15.22% complete, ETA 00:07:36
# Fork: 2 of 2
# Warmup Iteration   1: 9.431 ms/op
# Warmup Iteration   2: 6.417 ms/op
Iteration   1: 6.365 ms/op
Iteration   2: 6.320 ms/op
Iteration   3: 6.417 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.386 ±(99.9%) 0.108 ms/op [Average]
  (min, avg, max) = (6.320, 6.386, 6.422), stdev = 0.038
  CI (99.9%): [6.279, 6.494] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:24
# Fork: 1 of 2
# Warmup Iteration   1: 15.937 ms/op
# Warmup Iteration   2: 10.710 ms/op
Iteration   1: 10.758 ms/op
Iteration   2: 10.552 ms/op
Iteration   3: 10.550 ms/op

# Run progress: 19.57% complete, ETA 00:07:12
# Fork: 2 of 2
# Warmup Iteration   1: 14.768 ms/op
# Warmup Iteration   2: 10.802 ms/op
Iteration   1: 10.595 ms/op
Iteration   2: 10.607 ms/op
Iteration   3: 10.650 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.619 ±(99.9%) 0.218 ms/op [Average]
  (min, avg, max) = (10.550, 10.619, 10.758), stdev = 0.078
  CI (99.9%): [10.400, 10.837] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1042.482 ms/op
# Warmup Iteration   2: 409.032 ms/op
Iteration   1: 360.752 ms/op
Iteration   2: 346.372 ms/op
Iteration   3: 339.455 ms/op

# Run progress: 23.91% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 1038.071 ms/op
# Warmup Iteration   2: 405.097 ms/op
Iteration   1: 358.923 ms/op
Iteration   2: 347.587 ms/op
Iteration   3: 342.202 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  349.215 ±(99.9%) 24.528 ms/op [Average]
  (min, avg, max) = (339.455, 349.215, 360.752), stdev = 8.747
  CI (99.9%): [324.688, 373.743] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 3609.130 ms/op
# Warmup Iteration   2: 2079.939 ms/op
Iteration   1: 1852.456 ms/op
Iteration   2: 1847.357 ms/op
Iteration   3: 1844.993 ms/op

# Run progress: 28.26% complete, ETA 00:06:34
# Fork: 2 of 2
# Warmup Iteration   1: 3925.518 ms/op
# Warmup Iteration   2: 2106.922 ms/op
Iteration   1: 1858.123 ms/op
Iteration   2: 1911.512 ms/op
Iteration   3: 1845.369 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  1859.969 ±(99.9%) 72.183 ms/op [Average]
  (min, avg, max) = (1844.993, 1859.969, 1911.512), stdev = 25.741
  CI (99.9%): [1787.786, 1932.152] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 782.539 ms/op
# Warmup Iteration   2: 414.414 ms/op
Iteration   1: 402.143 ms/op
Iteration   2: 410.840 ms/op
Iteration   3: 399.733 ms/op

# Run progress: 32.61% complete, ETA 00:06:20
# Fork: 2 of 2
# Warmup Iteration   1: 788.511 ms/op
# Warmup Iteration   2: 416.035 ms/op
Iteration   1: 402.579 ms/op
Iteration   2: 396.874 ms/op
Iteration   3: 396.828 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  401.499 ±(99.9%) 14.580 ms/op [Average]
  (min, avg, max) = (396.828, 401.499, 410.840), stdev = 5.199
  CI (99.9%): [386.919, 416.079] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1438.087 ms/op
# Warmup Iteration   2: 903.199 ms/op
Iteration   1: 872.089 ms/op
Iteration   2: 864.649 ms/op
Iteration   3: 863.517 ms/op

# Run progress: 36.96% complete, ETA 00:05:56
# Fork: 2 of 2
# Warmup Iteration   1: 1385.023 ms/op
# Warmup Iteration   2: 892.159 ms/op
Iteration   1: 868.992 ms/op
Iteration   2: 875.251 ms/op
Iteration   3: 876.229 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  870.121 ±(99.9%) 14.961 ms/op [Average]
  (min, avg, max) = (863.517, 870.121, 876.229), stdev = 5.335
  CI (99.9%): [855.160, 885.082] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.112 ms/op
# Warmup Iteration   2: 0.081 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:30
# Fork: 2 of 2
# Warmup Iteration   1: 0.117 ms/op
# Warmup Iteration   2: 0.080 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.080 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.080 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.079, 0.080, 0.080), stdev = 0.001
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

# Run progress: 43.48% complete, ETA 00:05:16
# Fork: 1 of 2
# Warmup Iteration   1: 8.943 ms/op
# Warmup Iteration   2: 6.174 ms/op
Iteration   1: 6.148 ms/op
Iteration   2: 6.184 ms/op
Iteration   3: 6.138 ms/op

# Run progress: 45.65% complete, ETA 00:05:01
# Fork: 2 of 2
# Warmup Iteration   1: 7.827 ms/op
# Warmup Iteration   2: 6.160 ms/op
Iteration   1: 6.167 ms/op
Iteration   2: 6.129 ms/op
Iteration   3: 6.130 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.149 ±(99.9%) 0.062 ms/op [Average]
  (min, avg, max) = (6.129, 6.149, 6.184), stdev = 0.022
  CI (99.9%): [6.088, 6.211] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.622 ms/op
# Warmup Iteration   2: 0.469 ms/op
Iteration   1: 0.469 ms/op
Iteration   2: 0.467 ms/op
Iteration   3: 0.468 ms/op

# Run progress: 50.00% complete, ETA 00:04:33
# Fork: 2 of 2
# Warmup Iteration   1: 0.638 ms/op
# Warmup Iteration   2: 0.465 ms/op
Iteration   1: 0.465 ms/op
Iteration   2: 0.468 ms/op
Iteration   3: 0.465 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.467 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.465, 0.467, 0.469), stdev = 0.001
  CI (99.9%): [0.463, 0.471] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.641 ms/op
# Warmup Iteration   2: 1.198 ms/op
Iteration   1: 1.197 ms/op
Iteration   2: 1.198 ms/op
Iteration   3: 1.194 ms/op

# Run progress: 54.35% complete, ETA 00:04:07
# Fork: 2 of 2
# Warmup Iteration   1: 1.610 ms/op
# Warmup Iteration   2: 1.198 ms/op
Iteration   1: 1.202 ms/op
Iteration   2: 1.195 ms/op
Iteration   3: 1.213 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.200 ±(99.9%) 0.020 ms/op [Average]
  (min, avg, max) = (1.194, 1.200, 1.213), stdev = 0.007
  CI (99.9%): [1.180, 1.219] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 77.358 ms/op
# Warmup Iteration   2: 34.549 ms/op
Iteration   1: 23.045 ms/op
Iteration   2: 16.893 ms/op
Iteration   3: 16.145 ms/op

# Run progress: 58.70% complete, ETA 00:03:41
# Fork: 2 of 2
# Warmup Iteration   1: 77.212 ms/op
# Warmup Iteration   2: 22.841 ms/op
Iteration   1: 18.852 ms/op
Iteration   2: 16.699 ms/op
Iteration   3: 16.075 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  17.952 ±(99.9%) 7.548 ms/op [Average]
  (min, avg, max) = (16.075, 17.952, 23.045), stdev = 2.692
  CI (99.9%): [10.403, 25.500] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 97068.793 ms/op
# Warmup Iteration   2: 94437.583 ms/op
Iteration   1: 94581.400 ms/op
Iteration   2: 94882.497 ms/op
Iteration   3: 94653.268 ms/op

# Run progress: 63.04% complete, ETA 00:07:49
# Fork: 2 of 2
# Warmup Iteration   1: 97480.416 ms/op
# Warmup Iteration   2: 94594.387 ms/op
Iteration   1: 94681.573 ms/op
Iteration   2: 94321.834 ms/op
Iteration   3: 94389.209 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  94584.964 ±(99.9%) 574.817 ms/op [Average]
  (min, avg, max) = (94321.834, 94584.964, 94882.497), stdev = 204.985
  CI (99.9%): [94010.147, 95159.780] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:21
# Fork: 1 of 2
# Warmup Iteration   1: 26073.290 ms/op
# Warmup Iteration   2: 10510.188 ms/op
Iteration   1: 22117.115 ms/op
Iteration   2: 9892.749 ms/op
Iteration   3: 19125.715 ms/op

# Run progress: 67.39% complete, ETA 00:13:13
# Fork: 2 of 2
# Warmup Iteration   1: 25673.376 ms/op
# Warmup Iteration   2: 10335.216 ms/op
Iteration   1: 21593.598 ms/op
Iteration   2: 9748.425 ms/op
Iteration   3: 18892.172 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  16894.962 ±(99.9%) 15784.216 ms/op [Average]
  (min, avg, max) = (9748.425, 16894.962, 22117.115), stdev = 5628.804
  CI (99.9%): [1110.746, 32679.179] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:14:32
# Fork: 1 of 2
# Warmup Iteration   1: 8165.925 ms/op
# Warmup Iteration   2: 6518.382 ms/op
Iteration   1: 6233.003 ms/op
Iteration   2: 6266.543 ms/op
Iteration   3: 6181.669 ms/op

# Run progress: 71.74% complete, ETA 00:13:19
# Fork: 2 of 2
# Warmup Iteration   1: 8363.561 ms/op
# Warmup Iteration   2: 6568.721 ms/op
Iteration   1: 6299.190 ms/op
Iteration   2: 6270.692 ms/op
Iteration   3: 6334.895 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6264.332 ±(99.9%) 148.671 ms/op [Average]
  (min, avg, max) = (6181.669, 6264.332, 6334.895), stdev = 53.017
  CI (99.9%): [6115.662, 6413.003] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:12:08
# Fork: 1 of 2
# Warmup Iteration   1: Nov 13, 2026 2:39:06 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 2:39:06 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
65.790 ms/op
# Warmup Iteration   2: 45.291 ms/op
Iteration   1: 44.871 ms/op
Iteration   2: 44.734 ms/op
Iteration   3: 44.690 ms/op

# Run progress: 76.09% complete, ETA 00:10:51
# Fork: 2 of 2
# Warmup Iteration   1: Nov 13, 2026 2:39:17 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 2:39:17 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
61.013 ms/op
# Warmup Iteration   2: 45.187 ms/op
Iteration   1: 44.853 ms/op
Iteration   2: 45.604 ms/op
Iteration   3: 44.614 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  44.894 ±(99.9%) 1.013 ms/op [Average]
  (min, avg, max) = (44.614, 44.894, 45.604), stdev = 0.361
  CI (99.9%): [43.881, 45.908] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:09:39
# Fork: 1 of 2
# Warmup Iteration   1: 64.987 ms/op
# Warmup Iteration   2: 50.770 ms/op
Iteration   1: 50.022 ms/op
Iteration   2: 49.829 ms/op
Iteration   3: 49.583 ms/op

# Run progress: 80.43% complete, ETA 00:08:29
# Fork: 2 of 2
# Warmup Iteration   1: 51.449 ms/op
# Warmup Iteration   2: 50.297 ms/op
Iteration   1: 50.078 ms/op
Iteration   2: 49.729 ms/op
Iteration   3: 49.623 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  49.811 ±(99.9%) 0.575 ms/op [Average]
  (min, avg, max) = (49.583, 49.811, 50.078), stdev = 0.205
  CI (99.9%): [49.236, 50.385] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:06:20
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

# Run progress: 86.96% complete, ETA 00:05:19
# Fork: 1 of 2
# Warmup Iteration   1: 32.400 ms/op
# Warmup Iteration   2: 25.996 ms/op
Iteration   1: 25.563 ms/op
Iteration   2: 24.862 ms/op
Iteration   3: 24.778 ms/op

# Run progress: 89.13% complete, ETA 00:04:21
# Fork: 2 of 2
# Warmup Iteration   1: 32.832 ms/op
# Warmup Iteration   2: 25.376 ms/op
Iteration   1: 24.967 ms/op
Iteration   2: 24.779 ms/op
Iteration   3: 24.693 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  24.940 ±(99.9%) 0.894 ms/op [Average]
  (min, avg, max) = (24.693, 24.940, 25.563), stdev = 0.319
  CI (99.9%): [24.046, 25.835] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 11.717 ms/op
# Warmup Iteration   2: 9.491 ms/op
Iteration   1: 9.463 ms/op
Iteration   2: 9.427 ms/op
Iteration   3: 9.407 ms/op

# Run progress: 93.48% complete, ETA 00:02:30
# Fork: 2 of 2
# Warmup Iteration   1: 12.003 ms/op
# Warmup Iteration   2: 9.651 ms/op
Iteration   1: 9.487 ms/op
Iteration   2: 9.725 ms/op
Iteration   3: 9.403 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.486 ±(99.9%) 0.341 ms/op [Average]
  (min, avg, max) = (9.403, 9.486, 9.725), stdev = 0.122
  CI (99.9%): [9.144, 9.827] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 22.830 ms/op
# Warmup Iteration   2: 20.390 ms/op
Iteration   1: 20.337 ms/op
Iteration   2: 20.302 ms/op
Iteration   3: 20.335 ms/op

# Run progress: 97.83% complete, ETA 00:00:48
# Fork: 2 of 2
# Warmup Iteration   1: 22.649 ms/op
# Warmup Iteration   2: 20.445 ms/op
Iteration   1: 20.427 ms/op
Iteration   2: 20.502 ms/op
Iteration   3: 20.394 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  20.383 ±(99.9%) 0.206 ms/op [Average]
  (min, avg, max) = (20.302, 20.383, 20.502), stdev = 0.074
  CI (99.9%): [20.176, 20.589] (assumes normal distribution)


# Run complete. Total time: 00:36:38

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     19.248 ±     0.147  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.924 ±     0.038  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      5.899 ±     0.122  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.386 ±     0.108  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.619 ±     0.218  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    349.215 ±    24.528  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   1859.969 ±    72.183  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    401.499 ±    14.580  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    870.121 ±    14.961  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.080 ±     0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.149 ±     0.062  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.467 ±     0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.200 ±     0.020  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     17.952 ±     7.548  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  94584.964 ±   574.817  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  16894.962 ± 15784.216  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6264.332 ±   148.671  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     44.894 ±     1.013  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     49.811 ±     0.575  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     24.940 ±     0.894  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.486 ±     0.341  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     20.383 ±     0.206  ms/op

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
[INFO] Total time:  2.512 s
[INFO] Finished at: 2026-11-13T14:41:23Z
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
TEG full process: 8491 ms, solved=true, gas=318849.58 kg/hr, water in/out=0.00027104531/1.5400949e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00019284321, composition error=0.0030760310
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=4.7854811e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.530 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.125 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.056 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 542215 ms
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 542.2 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (6 ms)
tpFlashWellFluidSrk                                            83.6406  (40 ms)
tpFlashWellFluidPr                                             83.6541  (33 ms)
tpFlashWellFluidWithProperties                                 5445.46  (43 ms)
phAndPsFlashWellFluid                                          2459.23  (51 ms)
Nov 13, 2026 2:50:44 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 2:50:44 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (950 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (234 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (139 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (45 ms)
saturationPointsWellFluid                                      1601.32  (124 ms)
singlePhaseGasPipelineSteadyState                              121.628  (772 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98717  (1309 ms)
levenbergMarquardtAntoine                                      1837.31  (6 ms)
levenbergMarquardtDoubleExponential                            5.57177  (4 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (8 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.387 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  09:29 min
[INFO] Finished at: 2026-11-13T14:50:54Z
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
# Warmup Iteration   1: 23.981 ms/op
# Warmup Iteration   2: 19.312 ms/op
Iteration   1: 19.209 ms/op
Iteration   2: 19.087 ms/op
Iteration   3: 19.107 ms/op

# Run progress: 2.17% complete, ETA 00:08:49
# Fork: 2 of 2
# Warmup Iteration   1: 23.598 ms/op
# Warmup Iteration   2: 19.196 ms/op
Iteration   1: 19.094 ms/op
Iteration   2: 19.344 ms/op
Iteration   3: 19.056 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  19.150 ±(99.9%) 0.304 ms/op [Average]
  (min, avg, max) = (19.056, 19.150, 19.344), stdev = 0.108
  CI (99.9%): [18.846, 19.454] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.811 ms/op
# Warmup Iteration   2: 1.046 ms/op
Iteration   1: 1.054 ms/op
Iteration   2: 1.034 ms/op
Iteration   3: 1.031 ms/op

# Run progress: 6.52% complete, ETA 00:08:23
# Fork: 2 of 2
# Warmup Iteration   1: 1.679 ms/op
# Warmup Iteration   2: 1.030 ms/op
Iteration   1: 1.024 ms/op
Iteration   2: 1.025 ms/op
Iteration   3: 1.041 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.035 ±(99.9%) 0.032 ms/op [Average]
  (min, avg, max) = (1.024, 1.035, 1.054), stdev = 0.011
  CI (99.9%): [1.003, 1.067] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:11
# Fork: 1 of 2
# Warmup Iteration   1: 9.076 ms/op
# Warmup Iteration   2: 6.093 ms/op
Iteration   1: 6.063 ms/op
Iteration   2: 6.120 ms/op
Iteration   3: 5.976 ms/op

# Run progress: 10.87% complete, ETA 00:07:59
# Fork: 2 of 2
# Warmup Iteration   1: 7.741 ms/op
# Warmup Iteration   2: 6.146 ms/op
Iteration   1: 6.080 ms/op
Iteration   2: 5.937 ms/op
Iteration   3: 5.956 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.022 ±(99.9%) 0.211 ms/op [Average]
  (min, avg, max) = (5.937, 6.022, 6.120), stdev = 0.075
  CI (99.9%): [5.811, 6.233] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:47
# Fork: 1 of 2
# Warmup Iteration   1: 8.289 ms/op
# Warmup Iteration   2: 6.528 ms/op
Iteration   1: 6.503 ms/op
Iteration   2: 6.383 ms/op
Iteration   3: 6.387 ms/op

# Run progress: 15.22% complete, ETA 00:07:35
# Fork: 2 of 2
# Warmup Iteration   1: 9.160 ms/op
# Warmup Iteration   2: 6.571 ms/op
Iteration   1: 6.496 ms/op
Iteration   2: 6.408 ms/op
Iteration   3: 6.360 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.423 ±(99.9%) 0.172 ms/op [Average]
  (min, avg, max) = (6.360, 6.423, 6.503), stdev = 0.061
  CI (99.9%): [6.251, 6.595] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:23
# Fork: 1 of 2
# Warmup Iteration   1: 15.170 ms/op
# Warmup Iteration   2: 10.859 ms/op
Iteration   1: 10.715 ms/op
Iteration   2: 10.666 ms/op
Iteration   3: 10.629 ms/op

# Run progress: 19.57% complete, ETA 00:07:11
# Fork: 2 of 2
# Warmup Iteration   1: 14.877 ms/op
# Warmup Iteration   2: 10.851 ms/op
Iteration   1: 10.641 ms/op
Iteration   2: 10.726 ms/op
Iteration   3: 10.627 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.667 ±(99.9%) 0.123 ms/op [Average]
  (min, avg, max) = (10.627, 10.667, 10.726), stdev = 0.044
  CI (99.9%): [10.545, 10.790] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:06:59
# Fork: 1 of 2
# Warmup Iteration   1: 1086.702 ms/op
# Warmup Iteration   2: 510.788 ms/op
Iteration   1: 380.701 ms/op
Iteration   2: 370.621 ms/op
Iteration   3: 359.561 ms/op

# Run progress: 23.91% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 1212.268 ms/op
# Warmup Iteration   2: 434.854 ms/op
Iteration   1: 373.631 ms/op
Iteration   2: 366.868 ms/op
Iteration   3: 365.847 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  369.538 ±(99.9%) 20.331 ms/op [Average]
  (min, avg, max) = (359.561, 369.538, 380.701), stdev = 7.250
  CI (99.9%): [349.207, 389.869] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 3725.257 ms/op
# Warmup Iteration   2: 2209.357 ms/op
Iteration   1: 1884.132 ms/op
Iteration   2: 1866.227 ms/op
Iteration   3: 1859.138 ms/op

# Run progress: 28.26% complete, ETA 00:06:37
# Fork: 2 of 2
# Warmup Iteration   1: 3850.745 ms/op
# Warmup Iteration   2: 2405.943 ms/op
Iteration   1: 1877.084 ms/op
Iteration   2: 1842.816 ms/op
Iteration   3: 1843.064 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  1862.077 ±(99.9%) 48.081 ms/op [Average]
  (min, avg, max) = (1842.816, 1862.077, 1884.132), stdev = 17.146
  CI (99.9%): [1813.996, 1910.158] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 756.071 ms/op
# Warmup Iteration   2: 410.303 ms/op
Iteration   1: 407.357 ms/op
Iteration   2: 404.589 ms/op
Iteration   3: 397.230 ms/op

# Run progress: 32.61% complete, ETA 00:06:22
# Fork: 2 of 2
# Warmup Iteration   1: 785.414 ms/op
# Warmup Iteration   2: 419.795 ms/op
Iteration   1: 401.974 ms/op
Iteration   2: 400.699 ms/op
Iteration   3: 397.562 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  401.569 ±(99.9%) 11.106 ms/op [Average]
  (min, avg, max) = (397.230, 401.569, 407.357), stdev = 3.961
  CI (99.9%): [390.462, 412.675] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1437.842 ms/op
# Warmup Iteration   2: 902.482 ms/op
Iteration   1: 866.315 ms/op
Iteration   2: 860.353 ms/op
Iteration   3: 857.339 ms/op

# Run progress: 36.96% complete, ETA 00:05:57
# Fork: 2 of 2
# Warmup Iteration   1: 2028.376 ms/op
# Warmup Iteration   2: 922.064 ms/op
Iteration   1: 870.321 ms/op
Iteration   2: 874.503 ms/op
Iteration   3: 866.838 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  865.945 ±(99.9%) 17.675 ms/op [Average]
  (min, avg, max) = (857.339, 865.945, 874.503), stdev = 6.303
  CI (99.9%): [848.270, 883.620] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.115 ms/op
# Warmup Iteration   2: 0.080 ms/op
Iteration   1: 0.086 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.081 ms/op

# Run progress: 41.30% complete, ETA 00:05:30
# Fork: 2 of 2
# Warmup Iteration   1: 0.106 ms/op
# Warmup Iteration   2: 0.079 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.081 ±(99.9%) 0.008 ms/op [Average]
  (min, avg, max) = (0.079, 0.081, 0.086), stdev = 0.003
  CI (99.9%): [0.072, 0.089] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 7.727 ms/op
# Warmup Iteration   2: 6.189 ms/op
Iteration   1: 6.154 ms/op
Iteration   2: 6.182 ms/op
Iteration   3: 6.136 ms/op

# Run progress: 45.65% complete, ETA 00:05:01
# Fork: 2 of 2
# Warmup Iteration   1: 7.950 ms/op
# Warmup Iteration   2: 6.170 ms/op
Iteration   1: 6.143 ms/op
Iteration   2: 6.138 ms/op
Iteration   3: 6.169 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.154 ±(99.9%) 0.051 ms/op [Average]
  (min, avg, max) = (6.136, 6.154, 6.182), stdev = 0.018
  CI (99.9%): [6.103, 6.205] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.631 ms/op
# Warmup Iteration   2: 0.462 ms/op
Iteration   1: 0.472 ms/op
Iteration   2: 0.460 ms/op
Iteration   3: 0.475 ms/op

# Run progress: 50.00% complete, ETA 00:04:33
# Fork: 2 of 2
# Warmup Iteration   1: 0.642 ms/op
# Warmup Iteration   2: 0.470 ms/op
Iteration   1: 0.464 ms/op
Iteration   2: 0.466 ms/op
Iteration   3: 0.472 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.468 ±(99.9%) 0.016 ms/op [Average]
  (min, avg, max) = (0.460, 0.468, 0.475), stdev = 0.006
  CI (99.9%): [0.452, 0.485] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.625 ms/op
# Warmup Iteration   2: 1.190 ms/op
Iteration   1: 1.191 ms/op
Iteration   2: 1.187 ms/op
Iteration   3: 1.188 ms/op

# Run progress: 54.35% complete, ETA 00:04:07
# Fork: 2 of 2
# Warmup Iteration   1: 1.644 ms/op
# Warmup Iteration   2: 1.224 ms/op
Iteration   1: 1.193 ms/op
Iteration   2: 1.192 ms/op
Iteration   3: 1.194 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.191 ±(99.9%) 0.007 ms/op [Average]
  (min, avg, max) = (1.187, 1.191, 1.194), stdev = 0.003
  CI (99.9%): [1.183, 1.198] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 96.042 ms/op
# Warmup Iteration   2: 36.943 ms/op
Iteration   1: 29.703 ms/op
Iteration   2: 18.920 ms/op
Iteration   3: 16.689 ms/op

# Run progress: 58.70% complete, ETA 00:03:41
# Fork: 2 of 2
# Warmup Iteration   1: 77.547 ms/op
# Warmup Iteration   2: 23.967 ms/op
Iteration   1: 19.823 ms/op
Iteration   2: 17.850 ms/op
Iteration   3: 17.068 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  20.009 ±(99.9%) 13.711 ms/op [Average]
  (min, avg, max) = (16.689, 20.009, 29.703), stdev = 4.889
  CI (99.9%): [6.298, 33.719] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 101892.568 ms/op
# Warmup Iteration   2: 98865.890 ms/op
Iteration   1: 98233.667 ms/op
Iteration   2: 98300.732 ms/op
Iteration   3: 97938.293 ms/op

# Run progress: 63.04% complete, ETA 00:08:01
# Fork: 2 of 2
# Warmup Iteration   1: 101072.106 ms/op
# Warmup Iteration   2: 99086.171 ms/op
Iteration   1: 98295.990 ms/op
Iteration   2: 98116.557 ms/op
Iteration   3: 98059.564 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  98157.467 ±(99.9%) 406.009 ms/op [Average]
  (min, avg, max) = (97938.293, 98157.467, 98300.732), stdev = 144.787
  CI (99.9%): [97751.458, 98563.476] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:42
# Fork: 1 of 2
# Warmup Iteration   1: 17318.296 ms/op
# Warmup Iteration   2: 18137.169 ms/op
Iteration   1: 12037.969 ms/op
Iteration   2: 17938.947 ms/op
Iteration   3: 11882.600 ms/op

# Run progress: 67.39% complete, ETA 00:14:11
# Fork: 2 of 2
# Warmup Iteration   1: 17588.190 ms/op
# Warmup Iteration   2: 18313.566 ms/op
Iteration   1: 12220.885 ms/op
Iteration   2: 18284.003 ms/op
Iteration   3: 12032.278 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  14066.114 ±(99.9%) 8797.453 ms/op [Average]
  (min, avg, max) = (11882.600, 14066.114, 18284.003), stdev = 3137.256
  CI (99.9%): [5268.661, 22863.566] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:16:04
# Fork: 1 of 2
# Warmup Iteration   1: 8603.776 ms/op
# Warmup Iteration   2: 6455.131 ms/op
Iteration   1: 6385.257 ms/op
Iteration   2: 6341.612 ms/op
Iteration   3: 6281.598 ms/op

# Run progress: 71.74% complete, ETA 00:14:41
# Fork: 2 of 2
# Warmup Iteration   1: 8448.493 ms/op
# Warmup Iteration   2: 6464.936 ms/op
Iteration   1: 6406.863 ms/op
Iteration   2: 6245.400 ms/op
Iteration   3: 6298.620 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6326.558 ±(99.9%) 175.164 ms/op [Average]
  (min, avg, max) = (6245.400, 6326.558, 6406.863), stdev = 62.465
  CI (99.9%): [6151.394, 6501.723] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:13:21
# Fork: 1 of 2
# Warmup Iteration   1: Nov 13, 2026 3:28:48 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 3:28:48 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
65.975 ms/op
# Warmup Iteration   2: 45.281 ms/op
Iteration   1: 44.773 ms/op
Iteration   2: 44.687 ms/op
Iteration   3: 45.377 ms/op

# Run progress: 76.09% complete, ETA 00:11:57
# Fork: 2 of 2
# Warmup Iteration   1: Nov 13, 2026 3:28:59 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 3:28:59 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
59.735 ms/op
# Warmup Iteration   2: 44.996 ms/op
Iteration   1: 44.932 ms/op
Iteration   2: 44.704 ms/op
Iteration   3: 44.772 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  44.874 ±(99.9%) 0.732 ms/op [Average]
  (min, avg, max) = (44.687, 44.874, 45.377), stdev = 0.261
  CI (99.9%): [44.142, 45.606] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:10:37
# Fork: 1 of 2
# Warmup Iteration   1: 50.033 ms/op
# Warmup Iteration   2: 47.019 ms/op
Iteration   1: 47.189 ms/op
Iteration   2: 46.626 ms/op
Iteration   3: 46.759 ms/op

# Run progress: 80.43% complete, ETA 00:09:20
# Fork: 2 of 2
# Warmup Iteration   1: 50.938 ms/op
# Warmup Iteration   2: 48.576 ms/op
Iteration   1: 46.874 ms/op
Iteration   2: 47.168 ms/op
Iteration   3: 46.680 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  46.882 ±(99.9%) 0.685 ms/op [Average]
  (min, avg, max) = (46.626, 46.882, 47.189), stdev = 0.244
  CI (99.9%): [46.198, 47.567] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:08:07
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:06:57
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

# Run progress: 86.96% complete, ETA 00:05:50
# Fork: 1 of 2
# Warmup Iteration   1: 24.928 ms/op
# Warmup Iteration   2: 20.007 ms/op
Iteration   1: 19.347 ms/op
Iteration   2: 19.144 ms/op
Iteration   3: 19.130 ms/op

# Run progress: 89.13% complete, ETA 00:04:46
# Fork: 2 of 2
# Warmup Iteration   1: 24.799 ms/op
# Warmup Iteration   2: 20.126 ms/op
Iteration   1: 19.442 ms/op
Iteration   2: 19.189 ms/op
Iteration   3: 19.146 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  19.233 ±(99.9%) 0.365 ms/op [Average]
  (min, avg, max) = (19.130, 19.233, 19.442), stdev = 0.130
  CI (99.9%): [18.868, 19.598] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 11.203 ms/op
# Warmup Iteration   2: 8.445 ms/op
Iteration   1: 8.158 ms/op
Iteration   2: 8.240 ms/op
Iteration   3: 8.089 ms/op

# Run progress: 93.48% complete, ETA 00:02:45
# Fork: 2 of 2
# Warmup Iteration   1: 10.674 ms/op
# Warmup Iteration   2: 8.356 ms/op
Iteration   1: 8.458 ms/op
Iteration   2: 8.130 ms/op
Iteration   3: 8.225 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  8.217 ±(99.9%) 0.369 ms/op [Average]
  (min, avg, max) = (8.089, 8.217, 8.458), stdev = 0.131
  CI (99.9%): [7.848, 8.585] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 22.860 ms/op
# Warmup Iteration   2: 20.518 ms/op
Iteration   1: 20.316 ms/op
Iteration   2: 20.291 ms/op
Iteration   3: 20.456 ms/op

# Run progress: 97.83% complete, ETA 00:00:53
# Fork: 2 of 2
# Warmup Iteration   1: 23.407 ms/op
# Warmup Iteration   2: 20.485 ms/op
Iteration   1: 20.366 ms/op
Iteration   2: 20.351 ms/op
Iteration   3: 20.534 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  20.386 ±(99.9%) 0.258 ms/op [Average]
  (min, avg, max) = (20.291, 20.386, 20.534), stdev = 0.092
  CI (99.9%): [20.127, 20.644] (assumes normal distribution)


# Run complete. Total time: 00:40:07

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     19.150 ±    0.304  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.035 ±    0.032  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.022 ±    0.211  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.423 ±    0.172  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.667 ±    0.123  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    369.538 ±   20.331  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   1862.077 ±   48.081  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    401.569 ±   11.106  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    865.945 ±   17.675  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.081 ±    0.008  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.154 ±    0.051  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.468 ±    0.016  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.191 ±    0.007  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     20.009 ±   13.711  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  98157.467 ±  406.009  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  14066.114 ± 8797.453  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6326.558 ±  175.164  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     44.874 ±    0.732  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     46.882 ±    0.685  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     19.233 ±    0.365  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      8.217 ±    0.369  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     20.386 ±    0.258  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.25.0 -> 3.26.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 8 lower, 15 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 24.9403 | 19.2327 | -22.89% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 16895 | 14066.1 | -16.74% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 9.48551 | 8.21657 | -13.38% | Separate CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.923635 | 1.03494 | +12.05% | Separate CIs |
| process.Compressor_Benchmark.compressorprocess | 17.9515 | 20.0088 | +11.46% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 49.8107 | 46.8825 | -5.88% | Separate CIs |
| flash.TPflash.testFlash | 349.215 | 369.538 | +5.82% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 94585 | 98157.5 | +3.78% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.89888 | 6.02225 | +2.09% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=20) | 0.0798317 | 0.080678 | +1.06% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
