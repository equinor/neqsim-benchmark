# NeqSim 3.25.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.23.0 |
| Current | 3.25.0 |
| Source commit | `b9c107e3f78cc13bd7578303febbc0ecb7ecbdb3` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43425524439) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "b9c107e3f78cc13bd7578303febbc0ecb7ecbdb3",
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
BogoMIPS:                                5192.26
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
| baseline | 3.23.0 | passed |
| current | 3.25.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.23.0",
  "version": "3.23.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.23.0/neqsim-3.23.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.25.0",
  "version": "3.25.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.25.0/neqsim-3.25.0.jar",
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
[INFO] Total time:  9.730 s
[INFO] Finished at: 2026-11-13T12:29:23Z
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
TEG full process: 8650 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.684 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.150 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.091 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 354111 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 27 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    7.67e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.65e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     8.72e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.65e-03 after 27 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 354.1 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (5 ms)
tpFlashWellFluidSrk                                            83.6406  (58 ms)
tpFlashWellFluidPr                                             83.6541  (57 ms)
tpFlashWellFluidWithProperties                                 5445.46  (63 ms)
phAndPsFlashWellFluid                                          2459.23  (88 ms)
Nov 13, 2026 12:35:39 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 12:35:40 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (646 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (232 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (134 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (54 ms)
saturationPointsWellFluid                                      1601.32  (131 ms)
singlePhaseGasPipelineSteadyState                              121.628  (703 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1322 ms)
levenbergMarquardtAntoine                                      1837.31  (6 ms)
levenbergMarquardtDoubleExponential                            5.57177  (4 ms)
dataReconciliation[20]                                         7.89841  (3 ms)
dataReconciliation[100]                                        37.0132  (35 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.144 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  06:28 min
[INFO] Finished at: 2026-11-13T12:35:52Z
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
# Warmup Iteration   1: 22.831 ms/op
# Warmup Iteration   2: 19.382 ms/op
Iteration   1: 19.307 ms/op
Iteration   2: 19.059 ms/op
Iteration   3: 18.960 ms/op

# Run progress: 2.17% complete, ETA 00:08:44
# Fork: 2 of 2
# Warmup Iteration   1: 22.562 ms/op
# Warmup Iteration   2: 19.092 ms/op
Iteration   1: 18.999 ms/op
Iteration   2: 18.909 ms/op
Iteration   3: 19.007 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  19.040 ±(99.9%) 0.392 ms/op [Average]
  (min, avg, max) = (18.909, 19.040, 19.307), stdev = 0.140
  CI (99.9%): [18.647, 19.432] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:32
# Fork: 1 of 2
# Warmup Iteration   1: 1.753 ms/op
# Warmup Iteration   2: 1.236 ms/op
Iteration   1: 1.181 ms/op
Iteration   2: 1.176 ms/op
Iteration   3: 1.176 ms/op

# Run progress: 6.52% complete, ETA 00:08:19
# Fork: 2 of 2
# Warmup Iteration   1: 1.558 ms/op
# Warmup Iteration   2: 1.228 ms/op
Iteration   1: 1.183 ms/op
Iteration   2: 1.170 ms/op
Iteration   3: 1.172 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.177 ±(99.9%) 0.014 ms/op [Average]
  (min, avg, max) = (1.170, 1.177, 1.183), stdev = 0.005
  CI (99.9%): [1.162, 1.191] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:06
# Fork: 1 of 2
# Warmup Iteration   1: 8.628 ms/op
# Warmup Iteration   2: 6.028 ms/op
Iteration   1: 5.979 ms/op
Iteration   2: 5.993 ms/op
Iteration   3: 5.952 ms/op

# Run progress: 10.87% complete, ETA 00:07:55
# Fork: 2 of 2
# Warmup Iteration   1: 9.349 ms/op
# Warmup Iteration   2: 6.090 ms/op
Iteration   1: 5.953 ms/op
Iteration   2: 5.972 ms/op
Iteration   3: 5.994 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  5.974 ±(99.9%) 0.052 ms/op [Average]
  (min, avg, max) = (5.952, 5.974, 5.994), stdev = 0.018
  CI (99.9%): [5.922, 6.026] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:43
# Fork: 1 of 2
# Warmup Iteration   1: 8.688 ms/op
# Warmup Iteration   2: 6.496 ms/op
Iteration   1: 6.443 ms/op
Iteration   2: 6.409 ms/op
Iteration   3: 6.440 ms/op

# Run progress: 15.22% complete, ETA 00:07:32
# Fork: 2 of 2
# Warmup Iteration   1: 8.862 ms/op
# Warmup Iteration   2: 6.522 ms/op
Iteration   1: 6.435 ms/op
Iteration   2: 6.413 ms/op
Iteration   3: 6.427 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.428 ±(99.9%) 0.040 ms/op [Average]
  (min, avg, max) = (6.409, 6.428, 6.443), stdev = 0.014
  CI (99.9%): [6.388, 6.468] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:20
# Fork: 1 of 2
# Warmup Iteration   1: 18.758 ms/op
# Warmup Iteration   2: 10.937 ms/op
Iteration   1: 10.685 ms/op
Iteration   2: 10.751 ms/op
Iteration   3: 10.667 ms/op

# Run progress: 19.57% complete, ETA 00:07:09
# Fork: 2 of 2
# Warmup Iteration   1: 14.823 ms/op
# Warmup Iteration   2: 10.888 ms/op
Iteration   1: 10.715 ms/op
Iteration   2: 10.638 ms/op
Iteration   3: 10.603 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.676 ±(99.9%) 0.149 ms/op [Average]
  (min, avg, max) = (10.603, 10.676, 10.751), stdev = 0.053
  CI (99.9%): [10.527, 10.825] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:06:57
# Fork: 1 of 2
# Warmup Iteration   1: 1003.322 ms/op
# Warmup Iteration   2: 379.084 ms/op
Iteration   1: 349.613 ms/op
Iteration   2: 338.986 ms/op
Iteration   3: 335.446 ms/op

# Run progress: 23.91% complete, ETA 00:06:43
# Fork: 2 of 2
# Warmup Iteration   1: 1019.753 ms/op
# Warmup Iteration   2: 394.493 ms/op
Iteration   1: 342.447 ms/op
Iteration   2: 339.131 ms/op
Iteration   3: 334.875 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  340.083 ±(99.9%) 15.212 ms/op [Average]
  (min, avg, max) = (334.875, 340.083, 349.613), stdev = 5.425
  CI (99.9%): [324.871, 355.296] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:29
# Fork: 1 of 2
# Warmup Iteration   1: 3679.254 ms/op
# Warmup Iteration   2: 1898.752 ms/op
Iteration   1: 1781.730 ms/op
Iteration   2: 1769.983 ms/op
Iteration   3: 1802.465 ms/op

# Run progress: 28.26% complete, ETA 00:06:35
# Fork: 2 of 2
# Warmup Iteration   1: 3156.776 ms/op
# Warmup Iteration   2: 1890.878 ms/op
Iteration   1: 1832.667 ms/op
Iteration   2: 1795.860 ms/op
Iteration   3: 1783.772 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  1794.413 ±(99.9%) 61.453 ms/op [Average]
  (min, avg, max) = (1769.983, 1794.413, 1832.667), stdev = 21.915
  CI (99.9%): [1732.961, 1855.866] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:37
# Fork: 1 of 2
# Warmup Iteration   1: 767.776 ms/op
# Warmup Iteration   2: 406.508 ms/op
Iteration   1: 400.379 ms/op
Iteration   2: 398.056 ms/op
Iteration   3: 396.145 ms/op

# Run progress: 32.61% complete, ETA 00:06:22
# Fork: 2 of 2
# Warmup Iteration   1: 772.665 ms/op
# Warmup Iteration   2: 414.085 ms/op
Iteration   1: 402.940 ms/op
Iteration   2: 398.078 ms/op
Iteration   3: 394.192 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  398.298 ±(99.9%) 8.642 ms/op [Average]
  (min, avg, max) = (394.192, 398.298, 402.940), stdev = 3.082
  CI (99.9%): [389.657, 406.940] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:08
# Fork: 1 of 2
# Warmup Iteration   1: 1496.085 ms/op
# Warmup Iteration   2: 919.416 ms/op
Iteration   1: 894.220 ms/op
Iteration   2: 889.706 ms/op
Iteration   3: 893.790 ms/op

# Run progress: 36.96% complete, ETA 00:05:59
# Fork: 2 of 2
# Warmup Iteration   1: 2009.003 ms/op
# Warmup Iteration   2: 949.224 ms/op
Iteration   1: 900.162 ms/op
Iteration   2: 896.648 ms/op
Iteration   3: 895.492 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  895.003 ±(99.9%) 9.690 ms/op [Average]
  (min, avg, max) = (889.706, 895.003, 900.162), stdev = 3.456
  CI (99.9%): [885.313, 904.693] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.104 ms/op
# Warmup Iteration   2: 0.079 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:32
# Fork: 2 of 2
# Warmup Iteration   1: 0.106 ms/op
# Warmup Iteration   2: 0.079 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.079 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.079, 0.079, 0.080), stdev = 0.001
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

# Run progress: 43.48% complete, ETA 00:05:17
# Fork: 1 of 2
# Warmup Iteration   1: 7.772 ms/op
# Warmup Iteration   2: 6.224 ms/op
Iteration   1: 6.153 ms/op
Iteration   2: 6.153 ms/op
Iteration   3: 6.125 ms/op

# Run progress: 45.65% complete, ETA 00:05:02
# Fork: 2 of 2
# Warmup Iteration   1: 7.943 ms/op
# Warmup Iteration   2: 6.172 ms/op
Iteration   1: 6.170 ms/op
Iteration   2: 6.133 ms/op
Iteration   3: 6.141 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.146 ±(99.9%) 0.046 ms/op [Average]
  (min, avg, max) = (6.125, 6.146, 6.170), stdev = 0.016
  CI (99.9%): [6.100, 6.191] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   2: 0.464 ms/op
Iteration   1: 0.463 ms/op
Iteration   2: 0.464 ms/op
Iteration   3: 0.463 ms/op

# Run progress: 50.00% complete, ETA 00:04:34
# Fork: 2 of 2
# Warmup Iteration   1: 0.623 ms/op
# Warmup Iteration   2: 0.471 ms/op
Iteration   1: 0.464 ms/op
Iteration   2: 0.467 ms/op
Iteration   3: 0.463 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.464 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.463, 0.464, 0.467), stdev = 0.002
  CI (99.9%): [0.460, 0.468] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:21
# Fork: 1 of 2
# Warmup Iteration   1: 1.556 ms/op
# Warmup Iteration   2: 1.195 ms/op
Iteration   1: 1.194 ms/op
Iteration   2: 1.192 ms/op
Iteration   3: 1.203 ms/op

# Run progress: 54.35% complete, ETA 00:04:08
# Fork: 2 of 2
# Warmup Iteration   1: 1.538 ms/op
# Warmup Iteration   2: 1.204 ms/op
Iteration   1: 1.191 ms/op
Iteration   2: 1.192 ms/op
Iteration   3: 1.209 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.197 ±(99.9%) 0.021 ms/op [Average]
  (min, avg, max) = (1.191, 1.197, 1.209), stdev = 0.008
  CI (99.9%): [1.175, 1.218] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 101.887 ms/op
# Warmup Iteration   2: 38.582 ms/op
Iteration   1: 27.401 ms/op
Iteration   2: 24.213 ms/op
Iteration   3: 23.867 ms/op

# Run progress: 58.70% complete, ETA 00:03:42
# Fork: 2 of 2
# Warmup Iteration   1: 143.226 ms/op
# Warmup Iteration   2: 48.496 ms/op
Iteration   1: 34.849 ms/op
Iteration   2: 26.847 ms/op
Iteration   3: 23.336 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  26.752 ±(99.9%) 12.057 ms/op [Average]
  (min, avg, max) = (23.336, 26.752, 34.849), stdev = 4.300
  CI (99.9%): [14.695, 38.809] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 77351.161 ms/op
# Warmup Iteration   2: 72466.703 ms/op
Iteration   1: 72091.461 ms/op
Iteration   2: 72844.491 ms/op
Iteration   3: 72841.062 ms/op

# Run progress: 63.04% complete, ETA 00:06:47
# Fork: 2 of 2
# Warmup Iteration   1: 75634.378 ms/op
# Warmup Iteration   2: 72589.610 ms/op
Iteration   1: 72243.230 ms/op
Iteration   2: 72201.229 ms/op
Iteration   3: 72250.755 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  72412.038 ±(99.9%) 949.121 ms/op [Average]
  (min, avg, max) = (72091.461, 72412.038, 72844.491), stdev = 338.466
  CI (99.9%): [71462.917, 73361.159] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:09:25
# Fork: 1 of 2
# Warmup Iteration   1: 30821.293 ms/op
# Warmup Iteration   2: 11991.953 ms/op
Iteration   1: 25650.054 ms/op
Iteration   2: 11475.793 ms/op
Iteration   3: 21444.576 ms/op

# Run progress: 67.39% complete, ETA 00:11:18
# Fork: 2 of 2
# Warmup Iteration   1: 20996.891 ms/op
# Warmup Iteration   2: 22237.642 ms/op
Iteration   1: 15365.938 ms/op
Iteration   2: 21697.078 ms/op
Iteration   3: 14723.034 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  18392.745 ±(99.9%) 15016.067 ms/op [Average]
  (min, avg, max) = (11475.793, 18392.745, 25650.054), stdev = 5354.874
  CI (99.9%): [3376.678, 33408.812] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:13:24
# Fork: 1 of 2
# Warmup Iteration   1: 8117.767 ms/op
# Warmup Iteration   2: 6493.543 ms/op
Iteration   1: 6273.137 ms/op
Iteration   2: 6240.982 ms/op
Iteration   3: 6201.357 ms/op

# Run progress: 71.74% complete, ETA 00:12:17
# Fork: 2 of 2
# Warmup Iteration   1: 8612.826 ms/op
# Warmup Iteration   2: 6697.365 ms/op
Iteration   1: 6499.403 ms/op
Iteration   2: 6497.622 ms/op
Iteration   3: 6465.146 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6362.941 ±(99.9%) 389.075 ms/op [Average]
  (min, avg, max) = (6201.357, 6362.941, 6499.403), stdev = 138.748
  CI (99.9%): [5973.866, 6752.016] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:11:13
# Fork: 1 of 2
# Warmup Iteration   1: Nov 13, 2026 1:07:41 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 1:07:41 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
63.461 ms/op
# Warmup Iteration   2: 45.296 ms/op
Iteration   1: 44.680 ms/op
Iteration   2: 44.067 ms/op
Iteration   3: 43.919 ms/op

# Run progress: 76.09% complete, ETA 00:10:03
# Fork: 2 of 2
# Warmup Iteration   1: Nov 13, 2026 1:07:52 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 1:07:52 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
60.798 ms/op
# Warmup Iteration   2: 45.797 ms/op
Iteration   1: 44.100 ms/op
Iteration   2: 43.966 ms/op
Iteration   3: 44.041 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  44.129 ±(99.9%) 0.780 ms/op [Average]
  (min, avg, max) = (43.919, 44.129, 44.680), stdev = 0.278
  CI (99.9%): [43.349, 44.909] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:08:56
# Fork: 1 of 2
# Warmup Iteration   1: 60.412 ms/op
# Warmup Iteration   2: 50.207 ms/op
Iteration   1: 49.909 ms/op
Iteration   2: 49.832 ms/op
Iteration   3: 49.560 ms/op

# Run progress: 80.43% complete, ETA 00:07:52
# Fork: 2 of 2
# Warmup Iteration   1: 57.971 ms/op
# Warmup Iteration   2: 50.686 ms/op
Iteration   1: 50.116 ms/op
Iteration   2: 49.938 ms/op
Iteration   3: 49.611 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  49.828 ±(99.9%) 0.589 ms/op [Average]
  (min, avg, max) = (49.560, 49.828, 50.116), stdev = 0.210
  CI (99.9%): [49.239, 50.416] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:06:51
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:52
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

# Run progress: 86.96% complete, ETA 00:04:56
# Fork: 1 of 2
# Warmup Iteration   1: 31.773 ms/op
# Warmup Iteration   2: 25.807 ms/op
Iteration   1: 25.517 ms/op
Iteration   2: 24.875 ms/op
Iteration   3: 24.607 ms/op

# Run progress: 89.13% complete, ETA 00:04:02
# Fork: 2 of 2
# Warmup Iteration   1: 31.555 ms/op
# Warmup Iteration   2: 25.690 ms/op
Iteration   1: 25.365 ms/op
Iteration   2: 25.063 ms/op
Iteration   3: 24.630 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  25.010 ±(99.9%) 1.057 ms/op [Average]
  (min, avg, max) = (24.607, 25.010, 25.517), stdev = 0.377
  CI (99.9%): [23.952, 26.067] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:10
# Fork: 1 of 2
# Warmup Iteration   1: 11.880 ms/op
# Warmup Iteration   2: 9.552 ms/op
Iteration   1: 9.374 ms/op
Iteration   2: 9.336 ms/op
Iteration   3: 9.358 ms/op

# Run progress: 93.48% complete, ETA 00:02:20
# Fork: 2 of 2
# Warmup Iteration   1: 12.237 ms/op
# Warmup Iteration   2: 9.498 ms/op
Iteration   1: 9.480 ms/op
Iteration   2: 9.423 ms/op
Iteration   3: 9.377 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.391 ±(99.9%) 0.146 ms/op [Average]
  (min, avg, max) = (9.336, 9.391, 9.480), stdev = 0.052
  CI (99.9%): [9.245, 9.537] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:31
# Fork: 1 of 2
# Warmup Iteration   1: 23.221 ms/op
# Warmup Iteration   2: 20.336 ms/op
Iteration   1: 20.373 ms/op
Iteration   2: 20.308 ms/op
Iteration   3: 20.338 ms/op

# Run progress: 97.83% complete, ETA 00:00:45
# Fork: 2 of 2
# Warmup Iteration   1: 23.101 ms/op
# Warmup Iteration   2: 20.374 ms/op
Iteration   1: 20.334 ms/op
Iteration   2: 20.342 ms/op
Iteration   3: 20.295 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  20.332 ±(99.9%) 0.077 ms/op [Average]
  (min, avg, max) = (20.295, 20.332, 20.373), stdev = 0.027
  CI (99.9%): [20.255, 20.408] (assumes normal distribution)


# Run complete. Total time: 00:34:02

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     19.040 ±     0.392  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.177 ±     0.014  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      5.974 ±     0.052  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.428 ±     0.040  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.676 ±     0.149  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    340.083 ±    15.212  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   1794.413 ±    61.453  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    398.298 ±     8.642  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    895.003 ±     9.690  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.079 ±     0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.146 ±     0.046  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.464 ±     0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.197 ±     0.021  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     26.752 ±    12.057  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  72412.038 ±   949.121  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  18392.745 ± 15016.067  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6362.941 ±   389.075  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     44.129 ±     0.780  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     49.828 ±     0.589  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     25.010 ±     1.057  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.391 ±     0.146  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     20.332 ±     0.077  ms/op

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
[INFO] Total time:  2.206 s
[INFO] Finished at: 2026-11-13T13:09:58Z
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
TEG full process: 8224 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.267 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.997 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.064 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 551290 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 49 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    1.82e-03 (tolerance: 5.12e-03) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  4.87e-03 (tolerance: 5.12e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     2.62e-04 (tolerance: 5.12e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 4.87e-03 after 49 passes - accepted 5.12e-03 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
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

feed 5489240.1, gas 264519.5 + 377621.9, oil 1995374.5 + 2850534.5, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.430 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.3 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 551.3 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (6 ms)
tpFlashWellFluidSrk                                            83.6406  (39 ms)
tpFlashWellFluidPr                                             83.6541  (20 ms)
tpFlashWellFluidWithProperties                                 5445.46  (30 ms)
phAndPsFlashWellFluid                                          2459.23  (56 ms)
Nov 13, 2026 1:19:27 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 1:19:27 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (540 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (264 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (214 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (80 ms)
saturationPointsWellFluid                                      1601.32  (149 ms)
singlePhaseGasPipelineSteadyState                              121.628  (686 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98717  (1276 ms)
levenbergMarquardtAntoine                                      1837.31  (6 ms)
levenbergMarquardtDoubleExponential                            5.57177  (6 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (10 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.064 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  09:36 min
[INFO] Finished at: 2026-11-13T13:19:36Z
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
# Warmup Iteration   1: 23.916 ms/op
# Warmup Iteration   2: 19.215 ms/op
Iteration   1: 19.371 ms/op
Iteration   2: 19.046 ms/op
Iteration   3: 19.047 ms/op

# Run progress: 2.17% complete, ETA 00:08:46
# Fork: 2 of 2
# Warmup Iteration   1: 23.267 ms/op
# Warmup Iteration   2: 19.046 ms/op
Iteration   1: 19.171 ms/op
Iteration   2: 18.893 ms/op
Iteration   3: 19.026 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  19.092 ±(99.9%) 0.456 ms/op [Average]
  (min, avg, max) = (18.893, 19.092, 19.371), stdev = 0.163
  CI (99.9%): [18.637, 19.548] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:32
# Fork: 1 of 2
# Warmup Iteration   1: 1.355 ms/op
# Warmup Iteration   2: 0.941 ms/op
Iteration   1: 0.934 ms/op
Iteration   2: 0.925 ms/op
Iteration   3: 0.911 ms/op

# Run progress: 6.52% complete, ETA 00:08:20
# Fork: 2 of 2
# Warmup Iteration   1: 1.269 ms/op
# Warmup Iteration   2: 0.942 ms/op
Iteration   1: 0.935 ms/op
Iteration   2: 0.915 ms/op
Iteration   3: 0.913 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.922 ±(99.9%) 0.030 ms/op [Average]
  (min, avg, max) = (0.911, 0.922, 0.935), stdev = 0.011
  CI (99.9%): [0.892, 0.953] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:07
# Fork: 1 of 2
# Warmup Iteration   1: 7.472 ms/op
# Warmup Iteration   2: 5.937 ms/op
Iteration   1: 5.991 ms/op
Iteration   2: 5.899 ms/op
Iteration   3: 5.892 ms/op

# Run progress: 10.87% complete, ETA 00:07:55
# Fork: 2 of 2
# Warmup Iteration   1: 7.315 ms/op
# Warmup Iteration   2: 5.882 ms/op
Iteration   1: 5.903 ms/op
Iteration   2: 5.904 ms/op
Iteration   3: 5.914 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  5.917 ±(99.9%) 0.104 ms/op [Average]
  (min, avg, max) = (5.892, 5.917, 5.991), stdev = 0.037
  CI (99.9%): [5.813, 6.021] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:43
# Fork: 1 of 2
# Warmup Iteration   1: 8.988 ms/op
# Warmup Iteration   2: 6.342 ms/op
Iteration   1: 6.324 ms/op
Iteration   2: 6.291 ms/op
Iteration   3: 6.301 ms/op

# Run progress: 15.22% complete, ETA 00:07:32
# Fork: 2 of 2
# Warmup Iteration   1: 9.275 ms/op
# Warmup Iteration   2: 6.414 ms/op
Iteration   1: 6.341 ms/op
Iteration   2: 6.332 ms/op
Iteration   3: 6.326 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.319 ±(99.9%) 0.054 ms/op [Average]
  (min, avg, max) = (6.291, 6.319, 6.341), stdev = 0.019
  CI (99.9%): [6.266, 6.373] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:20
# Fork: 1 of 2
# Warmup Iteration   1: 14.223 ms/op
# Warmup Iteration   2: 10.751 ms/op
Iteration   1: 10.689 ms/op
Iteration   2: 10.610 ms/op
Iteration   3: 10.907 ms/op

# Run progress: 19.57% complete, ETA 00:07:08
# Fork: 2 of 2
# Warmup Iteration   1: 17.025 ms/op
# Warmup Iteration   2: 10.727 ms/op
Iteration   1: 10.573 ms/op
Iteration   2: 10.512 ms/op
Iteration   3: 10.580 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.645 ±(99.9%) 0.395 ms/op [Average]
  (min, avg, max) = (10.512, 10.645, 10.907), stdev = 0.141
  CI (99.9%): [10.250, 11.040] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:06:57
# Fork: 1 of 2
# Warmup Iteration   1: 1161.078 ms/op
# Warmup Iteration   2: 383.597 ms/op
Iteration   1: 347.042 ms/op
Iteration   2: 363.888 ms/op
Iteration   3: 340.723 ms/op

# Run progress: 23.91% complete, ETA 00:06:44
# Fork: 2 of 2
# Warmup Iteration   1: 1030.126 ms/op
# Warmup Iteration   2: 416.846 ms/op
Iteration   1: 361.049 ms/op
Iteration   2: 340.995 ms/op
Iteration   3: 338.619 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  348.719 ±(99.9%) 30.987 ms/op [Average]
  (min, avg, max) = (338.619, 348.719, 363.888), stdev = 11.050
  CI (99.9%): [317.732, 379.707] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:30
# Fork: 1 of 2
# Warmup Iteration   1: 3275.029 ms/op
# Warmup Iteration   2: 2240.071 ms/op
Iteration   1: 2609.703 ms/op
Iteration   2: 1821.695 ms/op
Iteration   3: 1805.582 ms/op

# Run progress: 28.26% complete, ETA 00:06:29
# Fork: 2 of 2
# Warmup Iteration   1: 3725.336 ms/op
# Warmup Iteration   2: 2070.094 ms/op
Iteration   1: 1844.102 ms/op
Iteration   2: 1808.072 ms/op
Iteration   3: 1787.704 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  1946.143 ±(99.9%) 913.093 ms/op [Average]
  (min, avg, max) = (1787.704, 1946.143, 2609.703), stdev = 325.618
  CI (99.9%): [1033.049, 2859.236] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:28
# Fork: 1 of 2
# Warmup Iteration   1: 741.023 ms/op
# Warmup Iteration   2: 406.346 ms/op
Iteration   1: 404.400 ms/op
Iteration   2: 395.911 ms/op
Iteration   3: 395.527 ms/op

# Run progress: 32.61% complete, ETA 00:06:14
# Fork: 2 of 2
# Warmup Iteration   1: 754.728 ms/op
# Warmup Iteration   2: 400.665 ms/op
Iteration   1: 397.664 ms/op
Iteration   2: 394.588 ms/op
Iteration   3: 391.698 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  396.631 ±(99.9%) 12.008 ms/op [Average]
  (min, avg, max) = (391.698, 396.631, 404.400), stdev = 4.282
  CI (99.9%): [384.624, 408.639] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:01
# Fork: 1 of 2
# Warmup Iteration   1: 1431.585 ms/op
# Warmup Iteration   2: 891.175 ms/op
Iteration   1: 865.602 ms/op
Iteration   2: 856.115 ms/op
Iteration   3: 856.831 ms/op

# Run progress: 36.96% complete, ETA 00:05:52
# Fork: 2 of 2
# Warmup Iteration   1: 1404.298 ms/op
# Warmup Iteration   2: 902.102 ms/op
Iteration   1: 865.994 ms/op
Iteration   2: 860.321 ms/op
Iteration   3: 858.200 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  860.511 ±(99.9%) 12.173 ms/op [Average]
  (min, avg, max) = (856.115, 860.511, 865.994), stdev = 4.341
  CI (99.9%): [848.338, 872.684] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:42
# Fork: 1 of 2
# Warmup Iteration   1: 0.105 ms/op
# Warmup Iteration   2: 0.079 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:27
# Fork: 2 of 2
# Warmup Iteration   1: 0.111 ms/op
# Warmup Iteration   2: 0.082 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.079 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.080 ±(99.9%) 0.002 ms/op [Average]
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

# Run progress: 43.48% complete, ETA 00:05:12
# Fork: 1 of 2
# Warmup Iteration   1: 7.747 ms/op
# Warmup Iteration   2: 6.142 ms/op
Iteration   1: 6.126 ms/op
Iteration   2: 6.134 ms/op
Iteration   3: 6.117 ms/op

# Run progress: 45.65% complete, ETA 00:04:58
# Fork: 2 of 2
# Warmup Iteration   1: 7.619 ms/op
# Warmup Iteration   2: 6.145 ms/op
Iteration   1: 6.146 ms/op
Iteration   2: 6.129 ms/op
Iteration   3: 6.116 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.128 ±(99.9%) 0.032 ms/op [Average]
  (min, avg, max) = (6.116, 6.128, 6.146), stdev = 0.011
  CI (99.9%): [6.096, 6.160] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:44
# Fork: 1 of 2
# Warmup Iteration   1: 0.600 ms/op
# Warmup Iteration   2: 0.464 ms/op
Iteration   1: 0.463 ms/op
Iteration   2: 0.471 ms/op
Iteration   3: 0.464 ms/op

# Run progress: 50.00% complete, ETA 00:04:31
# Fork: 2 of 2
# Warmup Iteration   1: 0.607 ms/op
# Warmup Iteration   2: 0.471 ms/op
Iteration   1: 0.463 ms/op
Iteration   2: 0.463 ms/op
Iteration   3: 0.462 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.464 ±(99.9%) 0.010 ms/op [Average]
  (min, avg, max) = (0.462, 0.464, 0.471), stdev = 0.003
  CI (99.9%): [0.455, 0.474] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:17
# Fork: 1 of 2
# Warmup Iteration   1: 1.550 ms/op
# Warmup Iteration   2: 1.196 ms/op
Iteration   1: 1.194 ms/op
Iteration   2: 1.192 ms/op
Iteration   3: 1.192 ms/op

# Run progress: 54.35% complete, ETA 00:04:04
# Fork: 2 of 2
# Warmup Iteration   1: 1.581 ms/op
# Warmup Iteration   2: 1.198 ms/op
Iteration   1: 1.215 ms/op
Iteration   2: 1.204 ms/op
Iteration   3: 1.214 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.202 ±(99.9%) 0.029 ms/op [Average]
  (min, avg, max) = (1.192, 1.202, 1.215), stdev = 0.010
  CI (99.9%): [1.173, 1.231] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:52
# Fork: 1 of 2
# Warmup Iteration   1: 87.958 ms/op
# Warmup Iteration   2: 23.585 ms/op
Iteration   1: 19.114 ms/op
Iteration   2: 17.140 ms/op
Iteration   3: 16.321 ms/op

# Run progress: 58.70% complete, ETA 00:03:39
# Fork: 2 of 2
# Warmup Iteration   1: 77.546 ms/op
# Warmup Iteration   2: 22.583 ms/op
Iteration   1: 18.710 ms/op
Iteration   2: 17.347 ms/op
Iteration   3: 16.074 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  17.451 ±(99.9%) 3.465 ms/op [Average]
  (min, avg, max) = (16.074, 17.451, 19.114), stdev = 1.236
  CI (99.9%): [13.986, 20.916] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:27
# Fork: 1 of 2
# Warmup Iteration   1: 98647.892 ms/op
# Warmup Iteration   2: 95472.729 ms/op
Iteration   1: 94974.586 ms/op
Iteration   2: 94887.401 ms/op
Iteration   3: 94733.872 ms/op

# Run progress: 63.04% complete, ETA 00:07:50
# Fork: 2 of 2
# Warmup Iteration   1: 97025.845 ms/op
# Warmup Iteration   2: 94717.366 ms/op
Iteration   1: 94226.659 ms/op
Iteration   2: 94105.788 ms/op
Iteration   3: 94158.901 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  94514.534 ±(99.9%) 1104.157 ms/op [Average]
  (min, avg, max) = (94105.788, 94514.534, 94974.586), stdev = 393.753
  CI (99.9%): [93410.378, 95618.691] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 25639.498 ms/op
# Warmup Iteration   2: 10330.536 ms/op
Iteration   1: 21629.330 ms/op
Iteration   2: 9218.730 ms/op
Iteration   3: 18950.468 ms/op

# Run progress: 67.39% complete, ETA 00:13:09
# Fork: 2 of 2
# Warmup Iteration   1: 25758.595 ms/op
# Warmup Iteration   2: 10390.742 ms/op
Iteration   1: 21713.046 ms/op
Iteration   2: 9782.388 ms/op
Iteration   3: 18949.713 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  16707.279 ±(99.9%) 16029.413 ms/op [Average]
  (min, avg, max) = (9218.730, 16707.279, 21713.046), stdev = 5716.243
  CI (99.9%): [677.866, 32736.692] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:14:30
# Fork: 1 of 2
# Warmup Iteration   1: 8218.517 ms/op
# Warmup Iteration   2: 6435.792 ms/op
Iteration   1: 6200.370 ms/op
Iteration   2: 6195.068 ms/op
Iteration   3: 6116.493 ms/op

# Run progress: 71.74% complete, ETA 00:13:17
# Fork: 2 of 2
# Warmup Iteration   1: 8240.903 ms/op
# Warmup Iteration   2: 6521.914 ms/op
Iteration   1: 6309.657 ms/op
Iteration   2: 6231.464 ms/op
Iteration   3: 6127.723 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6196.796 ±(99.9%) 198.978 ms/op [Average]
  (min, avg, max) = (6116.493, 6196.796, 6309.657), stdev = 70.958
  CI (99.9%): [5997.818, 6395.774] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:12:05
# Fork: 1 of 2
# Warmup Iteration   1: Nov 13, 2026 1:53:54 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 1:53:54 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
60.961 ms/op
# Warmup Iteration   2: 44.916 ms/op
Iteration   1: 44.728 ms/op
Iteration   2: 44.566 ms/op
Iteration   3: 44.608 ms/op

# Run progress: 76.09% complete, ETA 00:10:49
# Fork: 2 of 2
# Warmup Iteration   1: Nov 13, 2026 1:54:05 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 1:54:05 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
58.291 ms/op
# Warmup Iteration   2: 44.393 ms/op
Iteration   1: 44.273 ms/op
Iteration   2: 44.450 ms/op
Iteration   3: 44.072 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  44.450 ±(99.9%) 0.675 ms/op [Average]
  (min, avg, max) = (44.072, 44.450, 44.728), stdev = 0.241
  CI (99.9%): [43.774, 45.125] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:09:37
# Fork: 1 of 2
# Warmup Iteration   1: 57.797 ms/op
# Warmup Iteration   2: 50.101 ms/op
Iteration   1: 50.262 ms/op
Iteration   2: 50.455 ms/op
Iteration   3: 49.563 ms/op

# Run progress: 80.43% complete, ETA 00:08:28
# Fork: 2 of 2
# Warmup Iteration   1: 53.222 ms/op
# Warmup Iteration   2: 50.379 ms/op
Iteration   1: 50.031 ms/op
Iteration   2: 50.151 ms/op
Iteration   3: 49.565 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  50.005 ±(99.9%) 1.034 ms/op [Average]
  (min, avg, max) = (49.563, 50.005, 50.455), stdev = 0.369
  CI (99.9%): [48.970, 51.039] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:07:22
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:06:19
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

# Run progress: 86.96% complete, ETA 00:05:18
# Fork: 1 of 2
# Warmup Iteration   1: 30.342 ms/op
# Warmup Iteration   2: 25.552 ms/op
Iteration   1: 25.689 ms/op
Iteration   2: 24.807 ms/op
Iteration   3: 24.859 ms/op

# Run progress: 89.13% complete, ETA 00:04:20
# Fork: 2 of 2
# Warmup Iteration   1: 31.512 ms/op
# Warmup Iteration   2: 25.618 ms/op
Iteration   1: 24.953 ms/op
Iteration   2: 24.800 ms/op
Iteration   3: 24.775 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  24.981 ±(99.9%) 0.990 ms/op [Average]
  (min, avg, max) = (24.775, 24.981, 25.689), stdev = 0.353
  CI (99.9%): [23.991, 25.970] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:24
# Fork: 1 of 2
# Warmup Iteration   1: 12.286 ms/op
# Warmup Iteration   2: 9.618 ms/op
Iteration   1: 9.447 ms/op
Iteration   2: 9.355 ms/op
Iteration   3: 9.394 ms/op

# Run progress: 93.48% complete, ETA 00:02:30
# Fork: 2 of 2
# Warmup Iteration   1: 12.152 ms/op
# Warmup Iteration   2: 9.562 ms/op
Iteration   1: 9.462 ms/op
Iteration   2: 9.377 ms/op
Iteration   3: 9.381 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.403 ±(99.9%) 0.119 ms/op [Average]
  (min, avg, max) = (9.355, 9.403, 9.462), stdev = 0.043
  CI (99.9%): [9.283, 9.522] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 23.088 ms/op
# Warmup Iteration   2: 20.359 ms/op
Iteration   1: 20.359 ms/op
Iteration   2: 20.352 ms/op
Iteration   3: 20.484 ms/op

# Run progress: 97.83% complete, ETA 00:00:48
# Fork: 2 of 2
# Warmup Iteration   1: 22.641 ms/op
# Warmup Iteration   2: 20.405 ms/op
Iteration   1: 20.406 ms/op
Iteration   2: 20.377 ms/op
Iteration   3: 20.445 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  20.404 ±(99.9%) 0.145 ms/op [Average]
  (min, avg, max) = (20.352, 20.404, 20.484), stdev = 0.052
  CI (99.9%): [20.259, 20.549] (assumes normal distribution)


# Run complete. Total time: 00:36:31

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     19.092 ±     0.456  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.922 ±     0.030  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      5.917 ±     0.104  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.319 ±     0.054  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.645 ±     0.395  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    348.719 ±    30.987  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   1946.143 ±   913.093  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    396.631 ±    12.008  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    860.511 ±    12.173  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.080 ±     0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.128 ±     0.032  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.464 ±     0.010  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.202 ±     0.029  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     17.451 ±     3.465  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  94514.534 ±  1104.157  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  16707.279 ± 16029.413  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6196.796 ±   198.978  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     44.450 ±     0.675  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     50.005 ±     1.034  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     24.981 ±     0.990  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.403 ±     0.119  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     20.404 ±     0.145  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.23.0 -> 3.25.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 12 lower, 11 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| process.Compressor_Benchmark.compressorprocess | 26.7522 | 17.4509 | -34.77% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 72412 | 94514.5 | +30.52% | Separate CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.17651 | 0.922308 | -21.61% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 18392.7 | 16707.3 | -9.16% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 1794.41 | 1946.14 | +8.46% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 895.003 | 860.511 | -3.85% | Separate CIs |
| process.TEGprocess.testTEGprocess | 6362.94 | 6196.8 | -2.61% | Overlapping CIs |
| flash.TPflash.testFlash | 340.083 | 348.719 | +2.54% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 6.42772 | 6.31921 | -1.69% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 5.97382 | 5.91707 | -0.95% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
