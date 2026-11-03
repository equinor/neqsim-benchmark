# NeqSim 3.19.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.18.0 |
| Current | 3.19.0 |
| Source commit | `066932028e8d81729f740f8985ceabde73a2dcfc` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41635136788) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "066932028e8d81729f740f8985ceabde73a2dcfc",
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
Model name:                              AMD EPYC 9V45 96-Core Processor
CPU family:                              26
Model:                                   2
Thread(s) per core:                      2
Core(s) per socket:                      1
Socket(s):                               1
Stepping:                                1
BogoMIPS:                                5192.24
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 x2apic movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid avx512f avx512dq rdseed adx smap avx512ifma clflushopt clwb avx512cd sha_ni avx512bw avx512vl xsaveopt xsavec xgetbv1 xsaves user_shstk avx_vnni avx512_bf16 clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload avx512vbmi umip avx512_vbmi2 gfni vaes vpclmulqdq avx512_vnni avx512_bitalg avx512_vpopcntdq rdpid fsrm avx512_vp2intersect
Virtualization:                          AMD-V
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               48 KiB (1 instance)
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
Vulnerability Tsa:                       Not affected
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
[INFO] Total time:  10.025 s
[INFO] Finished at: 2026-11-03T12:22:44Z
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
tpFlashLeanGas                                                 60.0000  (38 ms)
tpFlashWellFluidSrk                                            83.6406  (92 ms)
tpFlashWellFluidPr                                             83.6541  (67 ms)
tpFlashWellFluidWithProperties                                 5445.46  (109 ms)
phAndPsFlashWellFluid                                          2459.23  (74 ms)
Nov 03, 2026 12:22:56 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 12:22:56 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (484 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (228 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (89 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (38 ms)
saturationPointsWellFluid                                      1601.32  (114 ms)
singlePhaseGasPipelineSteadyState                              121.628  (969 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1082 ms)
levenbergMarquardtAntoine                                      1837.31  (7 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (18 ms)
dataReconciliation[100]                                        37.0132  (56 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.579 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.033 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.027 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 255978 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 60 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    0.00e+00 (tolerance: 1.00e-03) OK [worst: export oil]
  Temperature:  0.00e+00 (tolerance: 1.00e-03) OK [worst: export oil]
  Pressure:     0.00e+00 (tolerance: 1.00e-03) OK [worst: export oil]
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 256.0 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 7764 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.771 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  04:47 min
[INFO] Finished at: 2026-11-03T12:27:33Z
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
# Warmup Iteration   1: 19.252 ms/op
# Warmup Iteration   2: 12.489 ms/op
Iteration   1: 12.727 ms/op
Iteration   2: 12.096 ms/op
Iteration   3: 12.404 ms/op

# Run progress: 2.17% complete, ETA 00:08:46
# Fork: 2 of 2
# Warmup Iteration   1: 19.172 ms/op
# Warmup Iteration   2: 12.569 ms/op
Iteration   1: 12.974 ms/op
Iteration   2: 12.466 ms/op
Iteration   3: 12.365 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  12.505 ±(99.9%) 0.858 ms/op [Average]
  (min, avg, max) = (12.096, 12.505, 12.974), stdev = 0.306
  CI (99.9%): [11.647, 13.364] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:31
# Fork: 1 of 2
# Warmup Iteration   1: 1.984 ms/op
# Warmup Iteration   2: 0.958 ms/op
Iteration   1: 0.896 ms/op
Iteration   2: 0.906 ms/op
Iteration   3: 0.901 ms/op

# Run progress: 6.52% complete, ETA 00:08:18
# Fork: 2 of 2
# Warmup Iteration   1: 2.252 ms/op
# Warmup Iteration   2: 1.090 ms/op
Iteration   1: 0.897 ms/op
Iteration   2: 0.894 ms/op
Iteration   3: 0.893 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.898 ±(99.9%) 0.014 ms/op [Average]
  (min, avg, max) = (0.893, 0.898, 0.906), stdev = 0.005
  CI (99.9%): [0.884, 0.912] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 8.591 ms/op
# Warmup Iteration   2: 4.590 ms/op
Iteration   1: 4.195 ms/op
Iteration   2: 4.085 ms/op
Iteration   3: 4.089 ms/op

# Run progress: 10.87% complete, ETA 00:07:55
# Fork: 2 of 2
# Warmup Iteration   1: 8.704 ms/op
# Warmup Iteration   2: 5.021 ms/op
Iteration   1: 4.230 ms/op
Iteration   2: 4.238 ms/op
Iteration   3: 4.279 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.186 ±(99.9%) 0.228 ms/op [Average]
  (min, avg, max) = (4.085, 4.186, 4.279), stdev = 0.081
  CI (99.9%): [3.958, 4.414] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 8.630 ms/op
# Warmup Iteration   2: 4.619 ms/op
Iteration   1: 4.110 ms/op
Iteration   2: 4.180 ms/op
Iteration   3: 4.159 ms/op

# Run progress: 15.22% complete, ETA 00:07:31
# Fork: 2 of 2
# Warmup Iteration   1: 8.200 ms/op
# Warmup Iteration   2: 4.839 ms/op
Iteration   1: 4.153 ms/op
Iteration   2: 4.290 ms/op
Iteration   3: 4.284 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  4.196 ±(99.9%) 0.208 ms/op [Average]
  (min, avg, max) = (4.110, 4.196, 4.290), stdev = 0.074
  CI (99.9%): [3.988, 4.404] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 17.048 ms/op
# Warmup Iteration   2: 9.133 ms/op
Iteration   1: 7.979 ms/op
Iteration   2: 7.800 ms/op
Iteration   3: 7.812 ms/op

# Run progress: 19.57% complete, ETA 00:07:08
# Fork: 2 of 2
# Warmup Iteration   1: 17.152 ms/op
# Warmup Iteration   2: 9.032 ms/op
Iteration   1: 7.771 ms/op
Iteration   2: 7.706 ms/op
Iteration   3: 7.670 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  7.789 ±(99.9%) 0.303 ms/op [Average]
  (min, avg, max) = (7.670, 7.789, 7.979), stdev = 0.108
  CI (99.9%): [7.487, 8.092] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1154.947 ms/op
# Warmup Iteration   2: 460.370 ms/op
Iteration   1: 301.496 ms/op
Iteration   2: 258.828 ms/op
Iteration   3: 266.536 ms/op

# Run progress: 23.91% complete, ETA 00:06:44
# Fork: 2 of 2
# Warmup Iteration   1: 1246.055 ms/op
# Warmup Iteration   2: 461.343 ms/op
Iteration   1: 305.966 ms/op
Iteration   2: 267.914 ms/op
Iteration   3: 291.273 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  282.002 ±(99.9%) 56.293 ms/op [Average]
  (min, avg, max) = (258.828, 282.002, 305.966), stdev = 20.075
  CI (99.9%): [225.709, 338.295] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:32
# Fork: 1 of 2
# Warmup Iteration   1: 2031.110 ms/op
# Warmup Iteration   2: 582.795 ms/op
Iteration   1: 374.110 ms/op
Iteration   2: 367.169 ms/op
Iteration   3: 332.423 ms/op

# Run progress: 28.26% complete, ETA 00:06:20
# Fork: 2 of 2
# Warmup Iteration   1: 1367.465 ms/op
# Warmup Iteration   2: 537.316 ms/op
Iteration   1: 402.579 ms/op
Iteration   2: 341.296 ms/op
Iteration   3: 352.953 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  361.755 ±(99.9%) 70.996 ms/op [Average]
  (min, avg, max) = (332.423, 361.755, 402.579), stdev = 25.318
  CI (99.9%): [290.758, 432.751] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:08
# Fork: 1 of 2
# Warmup Iteration   1: 755.768 ms/op
# Warmup Iteration   2: 339.521 ms/op
Iteration   1: 321.571 ms/op
Iteration   2: 311.562 ms/op
Iteration   3: 315.166 ms/op

# Run progress: 32.61% complete, ETA 00:05:55
# Fork: 2 of 2
# Warmup Iteration   1: 1001.735 ms/op
# Warmup Iteration   2: 352.481 ms/op
Iteration   1: 319.126 ms/op
Iteration   2: 316.619 ms/op
Iteration   3: 313.270 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  316.219 ±(99.9%) 10.398 ms/op [Average]
  (min, avg, max) = (311.562, 316.219, 321.571), stdev = 3.708
  CI (99.9%): [305.821, 326.617] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:43
# Fork: 1 of 2
# Warmup Iteration   1: 1421.735 ms/op
# Warmup Iteration   2: 762.104 ms/op
Iteration   1: 744.362 ms/op
Iteration   2: 728.148 ms/op
Iteration   3: 739.132 ms/op

# Run progress: 36.96% complete, ETA 00:05:32
# Fork: 2 of 2
# Warmup Iteration   1: 2006.828 ms/op
# Warmup Iteration   2: 801.120 ms/op
Iteration   1: 767.553 ms/op
Iteration   2: 716.881 ms/op
Iteration   3: 742.358 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  739.739 ±(99.9%) 47.903 ms/op [Average]
  (min, avg, max) = (716.881, 739.739, 767.553), stdev = 17.083
  CI (99.9%): [691.836, 787.642] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:21
# Fork: 1 of 2
# Warmup Iteration   1: 0.145 ms/op
# Warmup Iteration   2: 0.069 ms/op
Iteration   1: 0.065 ms/op
Iteration   2: 0.065 ms/op
Iteration   3: 0.066 ms/op

# Run progress: 41.30% complete, ETA 00:05:07
# Fork: 2 of 2
# Warmup Iteration   1: 0.127 ms/op
# Warmup Iteration   2: 0.066 ms/op
Iteration   1: 0.066 ms/op
Iteration   2: 0.065 ms/op
Iteration   3: 0.066 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.066 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.065, 0.066, 0.066), stdev = 0.001
  CI (99.9%): [0.064, 0.067] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:04:55
# Fork: 1 of 2
# Warmup Iteration   1: 7.007 ms/op
# Warmup Iteration   2: 4.853 ms/op
Iteration   1: 4.739 ms/op
Iteration   2: 4.619 ms/op
Iteration   3: 4.676 ms/op

# Run progress: 45.65% complete, ETA 00:04:42
# Fork: 2 of 2
# Warmup Iteration   1: 6.750 ms/op
# Warmup Iteration   2: 4.814 ms/op
Iteration   1: 4.765 ms/op
Iteration   2: 4.671 ms/op
Iteration   3: 4.695 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  4.694 ±(99.9%) 0.146 ms/op [Average]
  (min, avg, max) = (4.619, 4.694, 4.765), stdev = 0.052
  CI (99.9%): [4.548, 4.840] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:29
# Fork: 1 of 2
# Warmup Iteration   1: 0.539 ms/op
# Warmup Iteration   2: 0.342 ms/op
Iteration   1: 0.341 ms/op
Iteration   2: 0.340 ms/op
Iteration   3: 0.347 ms/op

# Run progress: 50.00% complete, ETA 00:04:17
# Fork: 2 of 2
# Warmup Iteration   1: 0.550 ms/op
# Warmup Iteration   2: 0.349 ms/op
Iteration   1: 0.335 ms/op
Iteration   2: 0.344 ms/op
Iteration   3: 0.341 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.341 ±(99.9%) 0.011 ms/op [Average]
  (min, avg, max) = (0.335, 0.341, 0.347), stdev = 0.004
  CI (99.9%): [0.330, 0.352] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:05
# Fork: 1 of 2
# Warmup Iteration   1: 1.323 ms/op
# Warmup Iteration   2: 0.931 ms/op
Iteration   1: 0.904 ms/op
Iteration   2: 0.877 ms/op
Iteration   3: 0.872 ms/op

# Run progress: 54.35% complete, ETA 00:03:53
# Fork: 2 of 2
# Warmup Iteration   1: 1.359 ms/op
# Warmup Iteration   2: 0.916 ms/op
Iteration   1: 0.873 ms/op
Iteration   2: 0.881 ms/op
Iteration   3: 0.871 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  0.880 ±(99.9%) 0.035 ms/op [Average]
  (min, avg, max) = (0.871, 0.880, 0.904), stdev = 0.012
  CI (99.9%): [0.845, 0.915] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:41
# Fork: 1 of 2
# Warmup Iteration   1: 100.285 ms/op
# Warmup Iteration   2: 25.448 ms/op
Iteration   1: 18.791 ms/op
Iteration   2: 16.872 ms/op
Iteration   3: 15.357 ms/op

# Run progress: 58.70% complete, ETA 00:03:30
# Fork: 2 of 2
# Warmup Iteration   1: 135.751 ms/op
# Warmup Iteration   2: 24.880 ms/op
Iteration   1: 19.472 ms/op
Iteration   2: 17.489 ms/op
Iteration   3: 16.945 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  17.488 ±(99.9%) 4.131 ms/op [Average]
  (min, avg, max) = (15.357, 17.488, 19.472), stdev = 1.473
  CI (99.9%): [13.357, 21.618] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:18
# Fork: 1 of 2
# Warmup Iteration   1: 54138.289 ms/op
# Warmup Iteration   2: 49614.809 ms/op
Iteration   1: 49487.193 ms/op
Iteration   2: 47756.748 ms/op
Iteration   3: 47825.105 ms/op

# Run progress: 63.04% complete, ETA 00:05:27
# Fork: 2 of 2
# Warmup Iteration   1: 51564.693 ms/op
# Warmup Iteration   2: 47458.619 ms/op
Iteration   1: 46334.531 ms/op
Iteration   2: 46635.225 ms/op
Iteration   3: 46977.431 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  47502.705 ±(99.9%) 3197.200 ms/op [Average]
  (min, avg, max) = (46334.531, 47502.705, 49487.193), stdev = 1140.152
  CI (99.9%): [44305.506, 50699.905] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:06
# Fork: 1 of 2
# Warmup Iteration   1: 5902.087 ms/op
# Warmup Iteration   2: 3879.427 ms/op
Iteration   1: 5467.434 ms/op
Iteration   2: 3310.629 ms/op
Iteration   3: 5186.969 ms/op

# Run progress: 67.39% complete, ETA 00:08:16
# Fork: 2 of 2
# Warmup Iteration   1: 9512.143 ms/op
# Warmup Iteration   2: 7033.314 ms/op
Iteration   1: 5468.625 ms/op
Iteration   2: 4062.321 ms/op
Iteration   3: 5778.039 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  4879.003 ±(99.9%) 2725.630 ms/op [Average]
  (min, avg, max) = (3310.629, 4879.003, 5778.039), stdev = 971.986
  CI (99.9%): [2153.373, 7604.633] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:08:58
# Fork: 1 of 2
# Warmup Iteration   1: 9449.639 ms/op
# Warmup Iteration   2: 6190.067 ms/op
Iteration   1: 5951.101 ms/op
Iteration   2: 5290.634 ms/op
Iteration   3: 4951.095 ms/op

# Run progress: 71.74% complete, ETA 00:08:17
# Fork: 2 of 2
# Warmup Iteration   1: 9167.310 ms/op
# Warmup Iteration   2: 5945.126 ms/op
Iteration   1: 6005.293 ms/op
Iteration   2: 5530.525 ms/op
Iteration   3: 5260.495 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  5498.191 ±(99.9%) 1164.476 ms/op [Average]
  (min, avg, max) = (4951.095, 5498.191, 6005.293), stdev = 415.263
  CI (99.9%): [4333.715, 6662.667] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:07:37
# Fork: 1 of 2
# Warmup Iteration   1: Nov 03, 2026 12:49:10 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 12:49:10 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
51.863 ms/op
# Warmup Iteration   2: 32.932 ms/op
Iteration   1: 32.689 ms/op
Iteration   2: 32.936 ms/op
Iteration   3: 32.562 ms/op

# Run progress: 76.09% complete, ETA 00:06:50
# Fork: 2 of 2
# Warmup Iteration   1: Nov 03, 2026 12:49:21 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 12:49:22 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
59.687 ms/op
# Warmup Iteration   2: 36.796 ms/op
Iteration   1: 36.314 ms/op
Iteration   2: 36.534 ms/op
Iteration   3: 36.317 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  34.559 ±(99.9%) 5.634 ms/op [Average]
  (min, avg, max) = (32.562, 34.559, 36.534), stdev = 2.009
  CI (99.9%): [28.925, 40.193] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:06:06
# Fork: 1 of 2
# Warmup Iteration   1: 89.484 ms/op
# Warmup Iteration   2: 54.208 ms/op
Iteration   1: 44.398 ms/op
Iteration   2: 42.268 ms/op
Iteration   3: 41.867 ms/op

# Run progress: 80.43% complete, ETA 00:05:23
# Fork: 2 of 2
# Warmup Iteration   1: 87.801 ms/op
# Warmup Iteration   2: 44.928 ms/op
Iteration   1: 41.871 ms/op
Iteration   2: 41.816 ms/op
Iteration   3: 41.664 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  42.314 ±(99.9%) 2.917 ms/op [Average]
  (min, avg, max) = (41.664, 42.314, 44.398), stdev = 1.040
  CI (99.9%): [39.397, 45.231] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:04:42
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:02
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

# Run progress: 86.96% complete, ETA 00:03:24
# Fork: 1 of 2
# Warmup Iteration   1: 21.023 ms/op
# Warmup Iteration   2: 11.007 ms/op
Iteration   1: 10.454 ms/op
Iteration   2: 10.119 ms/op
Iteration   3: 10.138 ms/op

# Run progress: 89.13% complete, ETA 00:02:47
# Fork: 2 of 2
# Warmup Iteration   1: 20.795 ms/op
# Warmup Iteration   2: 11.668 ms/op
Iteration   1: 11.053 ms/op
Iteration   2: 11.417 ms/op
Iteration   3: 10.975 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  10.693 ±(99.9%) 1.498 ms/op [Average]
  (min, avg, max) = (10.119, 10.693, 11.417), stdev = 0.534
  CI (99.9%): [9.194, 12.191] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:11
# Fork: 1 of 2
# Warmup Iteration   1: 14.248 ms/op
# Warmup Iteration   2: 8.920 ms/op
Iteration   1: 9.142 ms/op
Iteration   2: 8.092 ms/op
Iteration   3: 8.090 ms/op

# Run progress: 93.48% complete, ETA 00:01:37
# Fork: 2 of 2
# Warmup Iteration   1: 12.836 ms/op
# Warmup Iteration   2: 7.444 ms/op
Iteration   1: 7.686 ms/op
Iteration   2: 7.091 ms/op
Iteration   3: 6.967 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  7.845 ±(99.9%) 2.232 ms/op [Average]
  (min, avg, max) = (6.967, 7.845, 9.142), stdev = 0.796
  CI (99.9%): [5.612, 10.077] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:04
# Fork: 1 of 2
# Warmup Iteration   1: 18.307 ms/op
# Warmup Iteration   2: 14.750 ms/op
Iteration   1: 14.818 ms/op
Iteration   2: 15.046 ms/op
Iteration   3: 14.905 ms/op

# Run progress: 97.83% complete, ETA 00:00:31
# Fork: 2 of 2
# Warmup Iteration   1: 18.218 ms/op
# Warmup Iteration   2: 14.590 ms/op
Iteration   1: 14.870 ms/op
Iteration   2: 15.322 ms/op
Iteration   3: 14.587 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  14.925 ±(99.9%) 0.689 ms/op [Average]
  (min, avg, max) = (14.587, 14.925, 15.322), stdev = 0.246
  CI (99.9%): [14.236, 15.613] (assumes normal distribution)


# Run complete. Total time: 00:23:51

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     12.505 ±    0.858  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.898 ±    0.014  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.186 ±    0.228  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      4.196 ±    0.208  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      7.789 ±    0.303  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    282.002 ±   56.293  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    361.755 ±   70.996  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    316.219 ±   10.398  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    739.739 ±   47.903  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.066 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      4.694 ±    0.146  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.341 ±    0.011  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      0.880 ±    0.035  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     17.488 ±    4.131  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  47502.705 ± 3197.200  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   4879.003 ± 2725.630  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   5498.191 ± 1164.476  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     34.559 ±    5.634  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     42.314 ±    2.917  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     10.693 ±    1.498  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      7.845 ±    2.232  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     14.925 ±    0.689  ms/op

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
[INFO] Total time:  2.574 s
[INFO] Finished at: 2026-11-03T12:51:29Z
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
tpFlashLeanGas                                                 60.0000  (43 ms)
tpFlashWellFluidSrk                                            83.6406  (127 ms)
tpFlashWellFluidPr                                             83.6541  (73 ms)
tpFlashWellFluidWithProperties                                 5445.46  (99 ms)
phAndPsFlashWellFluid                                          2459.23  (81 ms)
Nov 03, 2026 12:51:36 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 12:51:36 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (412 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (190 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (87 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (40 ms)
saturationPointsWellFluid                                      1601.32  (83 ms)
singlePhaseGasPipelineSteadyState                              121.628  (823 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1012 ms)
levenbergMarquardtAntoine                                      1837.31  (7 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (15 ms)
dataReconciliation[100]                                        37.0132  (50 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.955 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.213 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.014 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 199021 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 27 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    7.67e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.70e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     8.72e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.70e-03 after 27 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 199.0 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 8865 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.878 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  03:44 min
[INFO] Finished at: 2026-11-03T12:55:15Z
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
# Warmup Iteration   1: 25.027 ms/op
# Warmup Iteration   2: 14.080 ms/op
Iteration   1: 13.593 ms/op
Iteration   2: 13.660 ms/op
Iteration   3: 13.470 ms/op

# Run progress: 2.17% complete, ETA 00:08:48
# Fork: 2 of 2
# Warmup Iteration   1: 22.351 ms/op
# Warmup Iteration   2: 13.704 ms/op
Iteration   1: 13.323 ms/op
Iteration   2: 13.203 ms/op
Iteration   3: 13.115 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  13.394 ±(99.9%) 0.608 ms/op [Average]
  (min, avg, max) = (13.115, 13.394, 13.660), stdev = 0.217
  CI (99.9%): [12.786, 14.002] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:34
# Fork: 1 of 2
# Warmup Iteration   1: 2.404 ms/op
# Warmup Iteration   2: 1.122 ms/op
Iteration   1: 1.013 ms/op
Iteration   2: 1.005 ms/op
Iteration   3: 1.006 ms/op

# Run progress: 6.52% complete, ETA 00:08:23
# Fork: 2 of 2
# Warmup Iteration   1: 2.267 ms/op
# Warmup Iteration   2: 1.062 ms/op
Iteration   1: 0.928 ms/op
Iteration   2: 0.935 ms/op
Iteration   3: 0.920 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.968 ±(99.9%) 0.124 ms/op [Average]
  (min, avg, max) = (0.920, 0.968, 1.013), stdev = 0.044
  CI (99.9%): [0.843, 1.092] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:10
# Fork: 1 of 2
# Warmup Iteration   1: 10.011 ms/op
# Warmup Iteration   2: 5.916 ms/op
Iteration   1: 4.754 ms/op
Iteration   2: 4.880 ms/op
Iteration   3: 4.682 ms/op

# Run progress: 10.87% complete, ETA 00:07:58
# Fork: 2 of 2
# Warmup Iteration   1: 11.447 ms/op
# Warmup Iteration   2: 5.787 ms/op
Iteration   1: 4.649 ms/op
Iteration   2: 4.664 ms/op
Iteration   3: 4.664 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.715 ±(99.9%) 0.249 ms/op [Average]
  (min, avg, max) = (4.649, 4.715, 4.880), stdev = 0.089
  CI (99.9%): [4.467, 4.964] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:46
# Fork: 1 of 2
# Warmup Iteration   1: 11.405 ms/op
# Warmup Iteration   2: 6.679 ms/op
Iteration   1: 4.991 ms/op
Iteration   2: 5.004 ms/op
Iteration   3: 4.974 ms/op

# Run progress: 15.22% complete, ETA 00:07:34
# Fork: 2 of 2
# Warmup Iteration   1: 10.920 ms/op
# Warmup Iteration   2: 6.205 ms/op
Iteration   1: 5.003 ms/op
Iteration   2: 4.955 ms/op
Iteration   3: 4.944 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  4.978 ±(99.9%) 0.071 ms/op [Average]
  (min, avg, max) = (4.944, 4.978, 5.004), stdev = 0.025
  CI (99.9%): [4.908, 5.049] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 21.358 ms/op
# Warmup Iteration   2: 10.637 ms/op
Iteration   1: 9.029 ms/op
Iteration   2: 8.602 ms/op
Iteration   3: 8.720 ms/op

# Run progress: 19.57% complete, ETA 00:07:10
# Fork: 2 of 2
# Warmup Iteration   1: 19.611 ms/op
# Warmup Iteration   2: 12.257 ms/op
Iteration   1: 9.028 ms/op
Iteration   2: 8.393 ms/op
Iteration   3: 8.723 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  8.749 ±(99.9%) 0.694 ms/op [Average]
  (min, avg, max) = (8.393, 8.749, 9.029), stdev = 0.247
  CI (99.9%): [8.055, 9.443] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1239.164 ms/op
# Warmup Iteration   2: 557.021 ms/op
Iteration   1: 416.407 ms/op
Iteration   2: 284.077 ms/op
Iteration   3: 286.551 ms/op

# Run progress: 23.91% complete, ETA 00:06:46
# Fork: 2 of 2
# Warmup Iteration   1: 1280.354 ms/op
# Warmup Iteration   2: 445.404 ms/op
Iteration   1: 301.868 ms/op
Iteration   2: 270.857 ms/op
Iteration   3: 306.820 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  311.097 ±(99.9%) 149.153 ms/op [Average]
  (min, avg, max) = (270.857, 311.097, 416.407), stdev = 53.189
  CI (99.9%): [161.944, 460.250] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2239.672 ms/op
# Warmup Iteration   2: 671.391 ms/op
Iteration   1: 407.422 ms/op
Iteration   2: 341.020 ms/op
Iteration   3: 382.513 ms/op

# Run progress: 28.26% complete, ETA 00:06:21
# Fork: 2 of 2
# Warmup Iteration   1: 2136.093 ms/op
# Warmup Iteration   2: 603.950 ms/op
Iteration   1: 388.156 ms/op
Iteration   2: 384.333 ms/op
Iteration   3: 345.654 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  374.850 ±(99.9%) 72.946 ms/op [Average]
  (min, avg, max) = (341.020, 374.850, 407.422), stdev = 26.013
  CI (99.9%): [301.904, 447.796] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:09
# Fork: 1 of 2
# Warmup Iteration   1: 1034.952 ms/op
# Warmup Iteration   2: 359.357 ms/op
Iteration   1: 324.484 ms/op
Iteration   2: 328.158 ms/op
Iteration   3: 325.778 ms/op

# Run progress: 32.61% complete, ETA 00:05:57
# Fork: 2 of 2
# Warmup Iteration   1: 1055.537 ms/op
# Warmup Iteration   2: 373.522 ms/op
Iteration   1: 328.962 ms/op
Iteration   2: 319.887 ms/op
Iteration   3: 320.948 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  324.703 ±(99.9%) 10.385 ms/op [Average]
  (min, avg, max) = (319.887, 324.703, 328.962), stdev = 3.703
  CI (99.9%): [314.318, 335.088] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:45
# Fork: 1 of 2
# Warmup Iteration   1: 2087.420 ms/op
# Warmup Iteration   2: 836.246 ms/op
Iteration   1: 791.574 ms/op
Iteration   2: 744.635 ms/op
Iteration   3: 772.317 ms/op

# Run progress: 36.96% complete, ETA 00:05:34
# Fork: 2 of 2
# Warmup Iteration   1: 2280.412 ms/op
# Warmup Iteration   2: 814.497 ms/op
Iteration   1: 769.944 ms/op
Iteration   2: 734.138 ms/op
Iteration   3: 756.994 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  761.600 ±(99.9%) 58.097 ms/op [Average]
  (min, avg, max) = (734.138, 761.600, 791.574), stdev = 20.718
  CI (99.9%): [703.504, 819.697] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.129 ms/op
# Warmup Iteration   2: 0.067 ms/op
Iteration   1: 0.067 ms/op
Iteration   2: 0.068 ms/op
Iteration   3: 0.067 ms/op

# Run progress: 41.30% complete, ETA 00:05:09
# Fork: 2 of 2
# Warmup Iteration   1: 0.128 ms/op
# Warmup Iteration   2: 0.065 ms/op
Iteration   1: 0.066 ms/op
Iteration   2: 0.066 ms/op
Iteration   3: 0.066 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.067 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.066, 0.067, 0.068), stdev = 0.001
  CI (99.9%): [0.064, 0.069] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 8.015 ms/op
# Warmup Iteration   2: 4.985 ms/op
Iteration   1: 4.808 ms/op
Iteration   2: 4.910 ms/op
Iteration   3: 4.818 ms/op

# Run progress: 45.65% complete, ETA 00:04:44
# Fork: 2 of 2
# Warmup Iteration   1: 7.337 ms/op
# Warmup Iteration   2: 4.981 ms/op
Iteration   1: 4.833 ms/op
Iteration   2: 4.764 ms/op
Iteration   3: 4.777 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  4.818 ±(99.9%) 0.146 ms/op [Average]
  (min, avg, max) = (4.764, 4.818, 4.910), stdev = 0.052
  CI (99.9%): [4.673, 4.964] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.574 ms/op
# Warmup Iteration   2: 0.348 ms/op
Iteration   1: 0.351 ms/op
Iteration   2: 0.342 ms/op
Iteration   3: 0.337 ms/op

# Run progress: 50.00% complete, ETA 00:04:19
# Fork: 2 of 2
# Warmup Iteration   1: 0.558 ms/op
# Warmup Iteration   2: 0.354 ms/op
Iteration   1: 0.357 ms/op
Iteration   2: 0.349 ms/op
Iteration   3: 0.347 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.347 ±(99.9%) 0.019 ms/op [Average]
  (min, avg, max) = (0.337, 0.347, 0.357), stdev = 0.007
  CI (99.9%): [0.328, 0.366] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.418 ms/op
# Warmup Iteration   2: 0.974 ms/op
Iteration   1: 0.891 ms/op
Iteration   2: 0.889 ms/op
Iteration   3: 0.920 ms/op

# Run progress: 54.35% complete, ETA 00:03:54
# Fork: 2 of 2
# Warmup Iteration   1: 1.449 ms/op
# Warmup Iteration   2: 0.974 ms/op
Iteration   1: 0.896 ms/op
Iteration   2: 0.902 ms/op
Iteration   3: 0.887 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  0.897 ±(99.9%) 0.034 ms/op [Average]
  (min, avg, max) = (0.887, 0.897, 0.920), stdev = 0.012
  CI (99.9%): [0.863, 0.932] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 169.388 ms/op
# Warmup Iteration   2: 33.987 ms/op
Iteration   1: 21.839 ms/op
Iteration   2: 19.076 ms/op
Iteration   3: 17.914 ms/op

# Run progress: 58.70% complete, ETA 00:03:31
# Fork: 2 of 2
# Warmup Iteration   1: 135.248 ms/op
# Warmup Iteration   2: 30.642 ms/op
Iteration   1: 22.262 ms/op
Iteration   2: 19.301 ms/op
Iteration   3: 18.309 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  19.784 ±(99.9%) 5.136 ms/op [Average]
  (min, avg, max) = (17.914, 19.784, 22.262), stdev = 1.831
  CI (99.9%): [14.648, 24.919] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 59736.392 ms/op
# Warmup Iteration   2: 51703.660 ms/op
Iteration   1: 50673.769 ms/op
Iteration   2: 49400.625 ms/op
Iteration   3: 49373.239 ms/op

# Run progress: 63.04% complete, ETA 00:05:35
# Fork: 2 of 2
# Warmup Iteration   1: 56238.330 ms/op
# Warmup Iteration   2: 50592.407 ms/op
Iteration   1: 48133.118 ms/op
Iteration   2: 48581.780 ms/op
Iteration   3: 47971.944 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  49022.413 ±(99.9%) 2826.973 ms/op [Average]
  (min, avg, max) = (47971.944, 49022.413, 50673.769), stdev = 1008.126
  CI (99.9%): [46195.439, 51849.386] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:20
# Fork: 1 of 2
# Warmup Iteration   1: 11540.079 ms/op
# Warmup Iteration   2: 13451.367 ms/op
Iteration   1: 11648.852 ms/op
Iteration   2: 13191.986 ms/op
Iteration   3: 10148.448 ms/op

# Run progress: 67.39% complete, ETA 00:08:48
# Fork: 2 of 2
# Warmup Iteration   1: 17647.476 ms/op
# Warmup Iteration   2: 7952.508 ms/op
Iteration   1: 12297.257 ms/op
Iteration   2: 13633.158 ms/op
Iteration   3: 12097.552 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  12169.542 ±(99.9%) 3449.263 ms/op [Average]
  (min, avg, max) = (10148.448, 12169.542, 13633.158), stdev = 1230.040
  CI (99.9%): [8720.279, 15618.805] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:09:49
# Fork: 1 of 2
# Warmup Iteration   1: 9604.528 ms/op
# Warmup Iteration   2: 6100.634 ms/op
Iteration   1: 6504.614 ms/op
Iteration   2: 5806.264 ms/op
Iteration   3: 5090.604 ms/op

# Run progress: 71.74% complete, ETA 00:09:04
# Fork: 2 of 2
# Warmup Iteration   1: 9859.392 ms/op
# Warmup Iteration   2: 6909.981 ms/op
Iteration   1: 6098.498 ms/op
Iteration   2: 5558.263 ms/op
Iteration   3: 5341.446 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  5733.282 ±(99.9%) 1446.735 ms/op [Average]
  (min, avg, max) = (5090.604, 5733.282, 6504.614), stdev = 515.919
  CI (99.9%): [4286.547, 7180.016] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:08:19
# Fork: 1 of 2
# Warmup Iteration   1: Nov 03, 2026 1:18:52 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 1:18:52 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
63.680 ms/op
# Warmup Iteration   2: 39.333 ms/op
Iteration   1: 37.878 ms/op
Iteration   2: 37.884 ms/op
Iteration   3: 36.871 ms/op

# Run progress: 76.09% complete, ETA 00:07:28
# Fork: 2 of 2
# Warmup Iteration   1: Nov 03, 2026 1:19:03 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 1:19:03 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
57.471 ms/op
# Warmup Iteration   2: 35.464 ms/op
Iteration   1: 33.284 ms/op
Iteration   2: 33.387 ms/op
Iteration   3: 34.442 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  35.624 ±(99.9%) 6.094 ms/op [Average]
  (min, avg, max) = (33.284, 35.624, 37.884), stdev = 2.173
  CI (99.9%): [29.530, 41.719] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:06:39
# Fork: 1 of 2
# Warmup Iteration   1: 54.600 ms/op
# Warmup Iteration   2: 35.686 ms/op
Iteration   1: 35.747 ms/op
Iteration   2: 35.810 ms/op
Iteration   3: 36.012 ms/op

# Run progress: 80.43% complete, ETA 00:05:52
# Fork: 2 of 2
# Warmup Iteration   1: 59.469 ms/op
# Warmup Iteration   2: 35.264 ms/op
Iteration   1: 34.756 ms/op
Iteration   2: 34.734 ms/op
Iteration   3: 34.109 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  35.195 ±(99.9%) 2.149 ms/op [Average]
  (min, avg, max) = (34.109, 35.195, 36.012), stdev = 0.766
  CI (99.9%): [33.046, 37.343] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:05:07
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:24
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

# Run progress: 86.96% complete, ETA 00:03:42
# Fork: 1 of 2
# Warmup Iteration   1: 20.688 ms/op
# Warmup Iteration   2: 10.746 ms/op
Iteration   1: 10.652 ms/op
Iteration   2: 10.454 ms/op
Iteration   3: 10.188 ms/op

# Run progress: 89.13% complete, ETA 00:03:02
# Fork: 2 of 2
# Warmup Iteration   1: 19.060 ms/op
# Warmup Iteration   2: 10.696 ms/op
Iteration   1: 10.597 ms/op
Iteration   2: 10.198 ms/op
Iteration   3: 9.936 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  10.338 ±(99.9%) 0.776 ms/op [Average]
  (min, avg, max) = (9.936, 10.338, 10.652), stdev = 0.277
  CI (99.9%): [9.562, 11.113] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:23
# Fork: 1 of 2
# Warmup Iteration   1: 13.522 ms/op
# Warmup Iteration   2: 7.687 ms/op
Iteration   1: 7.679 ms/op
Iteration   2: 7.120 ms/op
Iteration   3: 6.985 ms/op

# Run progress: 93.48% complete, ETA 00:01:45
# Fork: 2 of 2
# Warmup Iteration   1: 16.344 ms/op
# Warmup Iteration   2: 8.915 ms/op
Iteration   1: 9.150 ms/op
Iteration   2: 8.504 ms/op
Iteration   3: 8.325 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  7.961 ±(99.9%) 2.374 ms/op [Average]
  (min, avg, max) = (6.985, 7.961, 9.150), stdev = 0.846
  CI (99.9%): [5.587, 10.334] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 19.645 ms/op
# Warmup Iteration   2: 15.117 ms/op
Iteration   1: 14.877 ms/op
Iteration   2: 14.798 ms/op
Iteration   3: 14.912 ms/op

# Run progress: 97.83% complete, ETA 00:00:34
# Fork: 2 of 2
# Warmup Iteration   1: 23.294 ms/op
# Warmup Iteration   2: 17.751 ms/op
Iteration   1: 17.987 ms/op
Iteration   2: 17.666 ms/op
Iteration   3: 18.071 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  16.385 ±(99.9%) 4.694 ms/op [Average]
  (min, avg, max) = (14.798, 16.385, 18.071), stdev = 1.674
  CI (99.9%): [11.692, 21.079] (assumes normal distribution)


# Run complete. Total time: 00:25:51

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     13.394 ±    0.608  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.968 ±    0.124  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.715 ±    0.249  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      4.978 ±    0.071  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      8.749 ±    0.694  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    311.097 ±  149.153  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    374.850 ±   72.946  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    324.703 ±   10.385  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    761.600 ±   58.097  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.067 ±    0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      4.818 ±    0.146  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.347 ±    0.019  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      0.897 ±    0.034  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     19.784 ±    5.136  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  49022.413 ± 2826.973  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  12169.542 ± 3449.263  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   5733.282 ± 1446.735  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     35.624 ±    6.094  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     35.195 ±    2.149  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     10.338 ±    0.776  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      7.961 ±    2.374  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     16.385 ±    4.694  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.18.0 -> 3.19.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 3 lower, 20 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 4879 | 12169.5 | +149.43% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 4.19597 | 4.97824 | +18.64% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 42.3141 | 35.1946 | -16.83% | Separate CIs |
| process.Compressor_Benchmark.compressorprocess | 17.4877 | 19.7835 | +13.13% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.1858 | 4.71549 | +12.65% | Separate CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 7.78946 | 8.74913 | +12.32% | Overlapping CIs |
| flash.TPflash.testFlash | 282.002 | 311.097 | +10.32% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 14.9247 | 16.3852 | +9.79% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.897713 | 0.967729 | +7.80% | Overlapping CIs |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 12.5054 | 13.394 | +7.11% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
