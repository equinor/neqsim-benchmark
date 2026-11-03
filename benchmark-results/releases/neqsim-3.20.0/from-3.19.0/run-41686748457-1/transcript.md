# NeqSim 3.20.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.19.0 |
| Current | 3.20.0 |
| Source commit | `3f1a28af3d858f20918d51508d70ce0d011e4d35` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41686748457) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "3f1a28af3d858f20918d51508d70ce0d011e4d35",
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
BogoMIPS:                                5192.25
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
| baseline | 3.19.0 | passed |
| current | 3.20.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.19.0",
  "version": "3.19.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.19.0/neqsim-3.19.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.20.0",
  "version": "3.20.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.20.0/neqsim-3.20.0.jar",
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
[INFO] Total time:  11.481 s
[INFO] Finished at: 2026-11-03T17:43:00Z
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
tpFlashLeanGas                                                 60.0000  (45 ms)
tpFlashWellFluidSrk                                            83.6406  (86 ms)
tpFlashWellFluidPr                                             83.6541  (67 ms)
tpFlashWellFluidWithProperties                                 5445.46  (95 ms)
phAndPsFlashWellFluid                                          2459.23  (61 ms)
Nov 03, 2026 5:43:12 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 5:43:12 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (859 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (173 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (86 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (37 ms)
saturationPointsWellFluid                                      1601.32  (95 ms)
singlePhaseGasPipelineSteadyState                              121.628  (729 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1005 ms)
levenbergMarquardtAntoine                                      1837.31  (9 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (14 ms)
dataReconciliation[100]                                        37.0132  (61 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.435 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.997 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.023 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 246296 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 40 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    3.19e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.80e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     3.99e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.80e-03 after 40 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 5.40e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264330.3 + 377250.3, oil 1995270.2 + 2850325.3, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.416 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.5 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 246.3 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 9775 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.787 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  04:42 min
[INFO] Finished at: 2026-11-03T17:47:43Z
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
# Warmup Iteration   1: 21.135 ms/op
# Warmup Iteration   2: 13.096 ms/op
Iteration   1: 12.743 ms/op
Iteration   2: 12.491 ms/op
Iteration   3: 12.768 ms/op

# Run progress: 2.17% complete, ETA 00:08:41
# Fork: 2 of 2
# Warmup Iteration   1: 21.168 ms/op
# Warmup Iteration   2: 12.679 ms/op
Iteration   1: 12.655 ms/op
Iteration   2: 12.562 ms/op
Iteration   3: 12.683 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  12.650 ±(99.9%) 0.299 ms/op [Average]
  (min, avg, max) = (12.491, 12.650, 12.768), stdev = 0.106
  CI (99.9%): [12.352, 12.949] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:30
# Fork: 1 of 2
# Warmup Iteration   1: 1.617 ms/op
# Warmup Iteration   2: 0.878 ms/op
Iteration   1: 0.886 ms/op
Iteration   2: 0.924 ms/op
Iteration   3: 0.891 ms/op

# Run progress: 6.52% complete, ETA 00:08:18
# Fork: 2 of 2
# Warmup Iteration   1: 2.118 ms/op
# Warmup Iteration   2: 0.958 ms/op
Iteration   1: 0.885 ms/op
Iteration   2: 0.879 ms/op
Iteration   3: 0.888 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.892 ±(99.9%) 0.046 ms/op [Average]
  (min, avg, max) = (0.879, 0.892, 0.924), stdev = 0.016
  CI (99.9%): [0.847, 0.938] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:05
# Fork: 1 of 2
# Warmup Iteration   1: 10.620 ms/op
# Warmup Iteration   2: 5.750 ms/op
Iteration   1: 4.494 ms/op
Iteration   2: 4.583 ms/op
Iteration   3: 4.559 ms/op

# Run progress: 10.87% complete, ETA 00:07:53
# Fork: 2 of 2
# Warmup Iteration   1: 10.133 ms/op
# Warmup Iteration   2: 5.234 ms/op
Iteration   1: 4.473 ms/op
Iteration   2: 4.650 ms/op
Iteration   3: 4.464 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.537 ±(99.9%) 0.205 ms/op [Average]
  (min, avg, max) = (4.464, 4.537, 4.650), stdev = 0.073
  CI (99.9%): [4.332, 4.742] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:42
# Fork: 1 of 2
# Warmup Iteration   1: 10.452 ms/op
# Warmup Iteration   2: 5.538 ms/op
Iteration   1: 4.747 ms/op
Iteration   2: 4.866 ms/op
Iteration   3: 4.699 ms/op

# Run progress: 15.22% complete, ETA 00:07:31
# Fork: 2 of 2
# Warmup Iteration   1: 10.087 ms/op
# Warmup Iteration   2: 5.417 ms/op
Iteration   1: 4.844 ms/op
Iteration   2: 4.804 ms/op
Iteration   3: 4.865 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  4.804 ±(99.9%) 0.192 ms/op [Average]
  (min, avg, max) = (4.699, 4.804, 4.866), stdev = 0.068
  CI (99.9%): [4.612, 4.996] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:19
# Fork: 1 of 2
# Warmup Iteration   1: 20.701 ms/op
# Warmup Iteration   2: 11.963 ms/op
Iteration   1: 8.602 ms/op
Iteration   2: 7.988 ms/op
Iteration   3: 8.008 ms/op

# Run progress: 19.57% complete, ETA 00:07:07
# Fork: 2 of 2
# Warmup Iteration   1: 18.353 ms/op
# Warmup Iteration   2: 9.977 ms/op
Iteration   1: 8.294 ms/op
Iteration   2: 8.294 ms/op
Iteration   3: 8.137 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  8.221 ±(99.9%) 0.642 ms/op [Average]
  (min, avg, max) = (7.988, 8.221, 8.602), stdev = 0.229
  CI (99.9%): [7.578, 8.863] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:06:56
# Fork: 1 of 2
# Warmup Iteration   1: 1164.299 ms/op
# Warmup Iteration   2: 430.628 ms/op
Iteration   1: 278.806 ms/op
Iteration   2: 250.462 ms/op
Iteration   3: 287.587 ms/op

# Run progress: 23.91% complete, ETA 00:06:43
# Fork: 2 of 2
# Warmup Iteration   1: 1215.302 ms/op
# Warmup Iteration   2: 436.901 ms/op
Iteration   1: 280.856 ms/op
Iteration   2: 261.889 ms/op
Iteration   3: 278.461 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  273.010 ±(99.9%) 39.046 ms/op [Average]
  (min, avg, max) = (250.462, 273.010, 287.587), stdev = 13.924
  CI (99.9%): [233.964, 312.056] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2055.133 ms/op
# Warmup Iteration   2: 600.777 ms/op
Iteration   1: 366.667 ms/op
Iteration   2: 345.320 ms/op
Iteration   3: 352.055 ms/op

# Run progress: 28.26% complete, ETA 00:06:19
# Fork: 2 of 2
# Warmup Iteration   1: 2182.428 ms/op
# Warmup Iteration   2: 611.763 ms/op
Iteration   1: 371.745 ms/op
Iteration   2: 357.915 ms/op
Iteration   3: 346.683 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  356.731 ±(99.9%) 30.165 ms/op [Average]
  (min, avg, max) = (345.320, 356.731, 371.745), stdev = 10.757
  CI (99.9%): [326.566, 386.895] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:07
# Fork: 1 of 2
# Warmup Iteration   1: 763.803 ms/op
# Warmup Iteration   2: 325.791 ms/op
Iteration   1: 309.684 ms/op
Iteration   2: 310.923 ms/op
Iteration   3: 304.797 ms/op

# Run progress: 32.61% complete, ETA 00:05:55
# Fork: 2 of 2
# Warmup Iteration   1: 752.589 ms/op
# Warmup Iteration   2: 326.923 ms/op
Iteration   1: 312.696 ms/op
Iteration   2: 306.180 ms/op
Iteration   3: 303.265 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  307.924 ±(99.9%) 10.447 ms/op [Average]
  (min, avg, max) = (303.265, 307.924, 312.696), stdev = 3.725
  CI (99.9%): [297.477, 318.371] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1392.323 ms/op
# Warmup Iteration   2: 766.490 ms/op
Iteration   1: 712.851 ms/op
Iteration   2: 707.829 ms/op
Iteration   3: 713.079 ms/op

# Run progress: 36.96% complete, ETA 00:05:32
# Fork: 2 of 2
# Warmup Iteration   1: 1374.801 ms/op
# Warmup Iteration   2: 781.231 ms/op
Iteration   1: 721.631 ms/op
Iteration   2: 717.952 ms/op
Iteration   3: 724.675 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  716.336 ±(99.9%) 17.526 ms/op [Average]
  (min, avg, max) = (707.829, 716.336, 724.675), stdev = 6.250
  CI (99.9%): [698.811, 733.862] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.118 ms/op
# Warmup Iteration   2: 0.064 ms/op
Iteration   1: 0.062 ms/op
Iteration   2: 0.062 ms/op
Iteration   3: 0.064 ms/op

# Run progress: 41.30% complete, ETA 00:05:08
# Fork: 2 of 2
# Warmup Iteration   1: 0.114 ms/op
# Warmup Iteration   2: 0.067 ms/op
Iteration   1: 0.065 ms/op
Iteration   2: 0.066 ms/op
Iteration   3: 0.065 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.064 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.062, 0.064, 0.066), stdev = 0.001
  CI (99.9%): [0.060, 0.068] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 6.837 ms/op
# Warmup Iteration   2: 4.683 ms/op
Iteration   1: 4.557 ms/op
Iteration   2: 4.598 ms/op
Iteration   3: 4.640 ms/op

# Run progress: 45.65% complete, ETA 00:04:42
# Fork: 2 of 2
# Warmup Iteration   1: 7.128 ms/op
# Warmup Iteration   2: 4.708 ms/op
Iteration   1: 4.638 ms/op
Iteration   2: 4.570 ms/op
Iteration   3: 4.696 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  4.616 ±(99.9%) 0.144 ms/op [Average]
  (min, avg, max) = (4.557, 4.616, 4.696), stdev = 0.051
  CI (99.9%): [4.472, 4.761] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:30
# Fork: 1 of 2
# Warmup Iteration   1: 0.500 ms/op
# Warmup Iteration   2: 0.342 ms/op
Iteration   1: 0.331 ms/op
Iteration   2: 0.331 ms/op
Iteration   3: 0.339 ms/op

# Run progress: 50.00% complete, ETA 00:04:17
# Fork: 2 of 2
# Warmup Iteration   1: 0.530 ms/op
# Warmup Iteration   2: 0.339 ms/op
Iteration   1: 0.332 ms/op
Iteration   2: 0.330 ms/op
Iteration   3: 0.339 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.334 ±(99.9%) 0.012 ms/op [Average]
  (min, avg, max) = (0.330, 0.334, 0.339), stdev = 0.004
  CI (99.9%): [0.322, 0.346] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.263 ms/op
# Warmup Iteration   2: 0.909 ms/op
Iteration   1: 0.861 ms/op
Iteration   2: 0.871 ms/op
Iteration   3: 0.849 ms/op

# Run progress: 54.35% complete, ETA 00:03:53
# Fork: 2 of 2
# Warmup Iteration   1: 1.347 ms/op
# Warmup Iteration   2: 0.900 ms/op
Iteration   1: 0.863 ms/op
Iteration   2: 0.850 ms/op
Iteration   3: 0.859 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  0.859 ±(99.9%) 0.023 ms/op [Average]
  (min, avg, max) = (0.849, 0.859, 0.871), stdev = 0.008
  CI (99.9%): [0.836, 0.882] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 105.705 ms/op
# Warmup Iteration   2: 24.861 ms/op
Iteration   1: 18.099 ms/op
Iteration   2: 15.389 ms/op
Iteration   3: 14.546 ms/op

# Run progress: 58.70% complete, ETA 00:03:30
# Fork: 2 of 2
# Warmup Iteration   1: 95.498 ms/op
# Warmup Iteration   2: 23.084 ms/op
Iteration   1: 18.194 ms/op
Iteration   2: 17.161 ms/op
Iteration   3: 16.069 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  16.576 ±(99.9%) 4.172 ms/op [Average]
  (min, avg, max) = (14.546, 16.576, 18.194), stdev = 1.488
  CI (99.9%): [12.404, 20.749] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 58453.696 ms/op
# Warmup Iteration   2: 53263.938 ms/op
Iteration   1: 52128.862 ms/op
Iteration   2: 50950.094 ms/op
Iteration   3: 51073.660 ms/op

# Run progress: 63.04% complete, ETA 00:05:37
# Fork: 2 of 2
# Warmup Iteration   1: 55857.026 ms/op
# Warmup Iteration   2: 49997.849 ms/op
Iteration   1: 47530.718 ms/op
Iteration   2: 47978.540 ms/op
Iteration   3: 47869.363 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  49588.539 ±(99.9%) 5649.577 ms/op [Average]
  (min, avg, max) = (47530.718, 49588.539, 52128.862), stdev = 2014.693
  CI (99.9%): [43938.963, 55238.116] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 13170.703 ms/op
# Warmup Iteration   2: 14424.731 ms/op
Iteration   1: 10121.354 ms/op
Iteration   2: 13271.883 ms/op
Iteration   3: 8346.823 ms/op

# Run progress: 67.39% complete, ETA 00:09:15
# Fork: 2 of 2
# Warmup Iteration   1: 19121.963 ms/op
# Warmup Iteration   2: 9618.935 ms/op
Iteration   1: 16289.998 ms/op
Iteration   2: 14363.926 ms/op
Iteration   3: 13540.295 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  12655.713 ±(99.9%) 8154.127 ms/op [Average]
  (min, avg, max) = (8346.823, 12655.713, 16289.998), stdev = 2907.840
  CI (99.9%): [4501.586, 20809.840] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:10:16
# Fork: 1 of 2
# Warmup Iteration   1: 10078.253 ms/op
# Warmup Iteration   2: 6351.387 ms/op
Iteration   1: 6124.182 ms/op
Iteration   2: 5669.431 ms/op
Iteration   3: 5206.595 ms/op

# Run progress: 71.74% complete, ETA 00:09:28
# Fork: 2 of 2
# Warmup Iteration   1: 9598.388 ms/op
# Warmup Iteration   2: 6190.112 ms/op
Iteration   1: 5758.411 ms/op
Iteration   2: 5402.098 ms/op
Iteration   3: 5198.509 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  5559.871 ±(99.9%) 1011.178 ms/op [Average]
  (min, avg, max) = (5198.509, 5559.871, 6124.182), stdev = 360.596
  CI (99.9%): [4548.693, 6571.050] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:08:41
# Fork: 1 of 2
# Warmup Iteration   1: Nov 03, 2026 6:12:21 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 6:12:21 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
62.570 ms/op
# Warmup Iteration   2: 38.731 ms/op
Iteration   1: 37.536 ms/op
Iteration   2: 36.832 ms/op
Iteration   3: 36.633 ms/op

# Run progress: 76.09% complete, ETA 00:07:47
# Fork: 2 of 2
# Warmup Iteration   1: Nov 03, 2026 6:12:32 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 6:12:32 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
69.040 ms/op
# Warmup Iteration   2: 38.131 ms/op
Iteration   1: 38.786 ms/op
Iteration   2: 36.585 ms/op
Iteration   3: 36.412 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  37.131 ±(99.9%) 2.525 ms/op [Average]
  (min, avg, max) = (36.412, 37.131, 38.786), stdev = 0.901
  CI (99.9%): [34.605, 39.656] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:06:56
# Fork: 1 of 2
# Warmup Iteration   1: 95.486 ms/op
# Warmup Iteration   2: 37.409 ms/op
Iteration   1: 37.640 ms/op
Iteration   2: 36.517 ms/op
Iteration   3: 37.068 ms/op

# Run progress: 80.43% complete, ETA 00:06:07
# Fork: 2 of 2
# Warmup Iteration   1: 57.179 ms/op
# Warmup Iteration   2: 35.064 ms/op
Iteration   1: 34.838 ms/op
Iteration   2: 35.283 ms/op
Iteration   3: 34.271 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  35.936 ±(99.9%) 3.747 ms/op [Average]
  (min, avg, max) = (34.271, 35.936, 37.640), stdev = 1.336
  CI (99.9%): [32.189, 39.683] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:05:20
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:35
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

# Run progress: 86.96% complete, ETA 00:03:51
# Fork: 1 of 2
# Warmup Iteration   1: 21.412 ms/op
# Warmup Iteration   2: 11.993 ms/op
Iteration   1: 11.093 ms/op
Iteration   2: 11.268 ms/op
Iteration   3: 11.258 ms/op

# Run progress: 89.13% complete, ETA 00:03:09
# Fork: 2 of 2
# Warmup Iteration   1: 18.997 ms/op
# Warmup Iteration   2: 10.959 ms/op
Iteration   1: 10.936 ms/op
Iteration   2: 10.071 ms/op
Iteration   3: 10.010 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  10.773 ±(99.9%) 1.628 ms/op [Average]
  (min, avg, max) = (10.010, 10.773, 11.268), stdev = 0.581
  CI (99.9%): [9.145, 12.401] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:29
# Fork: 1 of 2
# Warmup Iteration   1: 13.118 ms/op
# Warmup Iteration   2: 7.508 ms/op
Iteration   1: 7.418 ms/op
Iteration   2: 7.268 ms/op
Iteration   3: 6.941 ms/op

# Run progress: 93.48% complete, ETA 00:01:50
# Fork: 2 of 2
# Warmup Iteration   1: 13.464 ms/op
# Warmup Iteration   2: 7.906 ms/op
Iteration   1: 7.895 ms/op
Iteration   2: 7.497 ms/op
Iteration   3: 7.101 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  7.353 ±(99.9%) 0.938 ms/op [Average]
  (min, avg, max) = (6.941, 7.353, 7.895), stdev = 0.334
  CI (99.9%): [6.415, 8.291] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:12
# Fork: 1 of 2
# Warmup Iteration   1: 17.949 ms/op
# Warmup Iteration   2: 14.877 ms/op
Iteration   1: 14.902 ms/op
Iteration   2: 14.581 ms/op
Iteration   3: 14.955 ms/op

# Run progress: 97.83% complete, ETA 00:00:35
# Fork: 2 of 2
# Warmup Iteration   1: 18.330 ms/op
# Warmup Iteration   2: 14.753 ms/op
Iteration   1: 14.609 ms/op
Iteration   2: 14.482 ms/op
Iteration   3: 14.514 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  14.674 ±(99.9%) 0.569 ms/op [Average]
  (min, avg, max) = (14.482, 14.674, 14.955), stdev = 0.203
  CI (99.9%): [14.104, 15.243] (assumes normal distribution)


# Run complete. Total time: 00:26:52

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     12.650 ±    0.299  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.892 ±    0.046  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.537 ±    0.205  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      4.804 ±    0.192  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      8.221 ±    0.642  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    273.010 ±   39.046  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    356.731 ±   30.165  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    307.924 ±   10.447  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    716.336 ±   17.526  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.064 ±    0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      4.616 ±    0.144  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.334 ±    0.012  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      0.859 ±    0.023  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     16.576 ±    4.172  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  49588.539 ± 5649.577  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  12655.713 ± 8154.127  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   5559.871 ± 1011.178  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     37.131 ±    2.525  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     35.936 ±    3.747  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     10.773 ±    1.628  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      7.353 ±    0.938  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     14.674 ±    0.569  ms/op

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
[INFO] Total time:  2.142 s
[INFO] Finished at: 2026-11-03T18:14:39Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.20.0 (neqsim-3.20.0.jar); requested: 3.20.0
$ mvn clean verify -Dneqsim.version=3.20.0
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
tpFlashLeanGas                                                 60.0000  (30 ms)
tpFlashWellFluidSrk                                            83.6406  (77 ms)
tpFlashWellFluidPr                                             83.6541  (64 ms)
tpFlashWellFluidWithProperties                                 5445.46  (120 ms)
phAndPsFlashWellFluid                                          2459.23  (129 ms)
Nov 03, 2026 6:14:46 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 6:14:46 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (491 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (220 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (78 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (36 ms)
saturationPointsWellFluid                                      1601.32  (96 ms)
singlePhaseGasPipelineSteadyState                              121.628  (829 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1003 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (14 ms)
dataReconciliation[100]                                        37.0132  (60 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.180 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.041 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.020 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 219004 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 32 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    5.52e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.70e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     6.66e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.70e-03 after 32 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 9.06e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264044.1 + 376668.9, oil 1995127.7 + 2850024.0, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.394 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.7 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 219.0 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 8787 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.799 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.20.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.20.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  04:04 min
[INFO] Finished at: 2026-11-03T18:18:45Z
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
# Warmup Iteration   1: 22.035 ms/op
# Warmup Iteration   2: 12.983 ms/op
Iteration   1: 12.734 ms/op
Iteration   2: 12.571 ms/op
Iteration   3: 12.442 ms/op

# Run progress: 2.17% complete, ETA 00:08:46
# Fork: 2 of 2
# Warmup Iteration   1: 21.592 ms/op
# Warmup Iteration   2: 12.852 ms/op
Iteration   1: 12.720 ms/op
Iteration   2: 12.556 ms/op
Iteration   3: 12.597 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  12.604 ±(99.9%) 0.307 ms/op [Average]
  (min, avg, max) = (12.442, 12.604, 12.734), stdev = 0.109
  CI (99.9%): [12.297, 12.910] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.979 ms/op
# Warmup Iteration   2: 0.949 ms/op
Iteration   1: 0.936 ms/op
Iteration   2: 0.956 ms/op
Iteration   3: 0.947 ms/op

# Run progress: 6.52% complete, ETA 00:08:18
# Fork: 2 of 2
# Warmup Iteration   1: 2.242 ms/op
# Warmup Iteration   2: 1.083 ms/op
Iteration   1: 0.944 ms/op
Iteration   2: 0.921 ms/op
Iteration   3: 0.958 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  0.943 ±(99.9%) 0.038 ms/op [Average]
  (min, avg, max) = (0.921, 0.943, 0.958), stdev = 0.014
  CI (99.9%): [0.905, 0.982] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 10.021 ms/op
# Warmup Iteration   2: 5.339 ms/op
Iteration   1: 4.404 ms/op
Iteration   2: 4.560 ms/op
Iteration   3: 4.462 ms/op

# Run progress: 10.87% complete, ETA 00:07:54
# Fork: 2 of 2
# Warmup Iteration   1: 10.079 ms/op
# Warmup Iteration   2: 5.166 ms/op
Iteration   1: 4.460 ms/op
Iteration   2: 4.483 ms/op
Iteration   3: 4.329 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.450 ±(99.9%) 0.218 ms/op [Average]
  (min, avg, max) = (4.329, 4.450, 4.560), stdev = 0.078
  CI (99.9%): [4.232, 4.667] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:42
# Fork: 1 of 2
# Warmup Iteration   1: 10.115 ms/op
# Warmup Iteration   2: 5.457 ms/op
Iteration   1: 4.864 ms/op
Iteration   2: 4.897 ms/op
Iteration   3: 4.851 ms/op

# Run progress: 15.22% complete, ETA 00:07:30
# Fork: 2 of 2
# Warmup Iteration   1: 10.395 ms/op
# Warmup Iteration   2: 5.513 ms/op
Iteration   1: 4.724 ms/op
Iteration   2: 4.791 ms/op
Iteration   3: 4.741 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  4.811 ±(99.9%) 0.197 ms/op [Average]
  (min, avg, max) = (4.724, 4.811, 4.897), stdev = 0.070
  CI (99.9%): [4.614, 5.008] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:19
# Fork: 1 of 2
# Warmup Iteration   1: 20.559 ms/op
# Warmup Iteration   2: 10.379 ms/op
Iteration   1: 8.649 ms/op
Iteration   2: 8.352 ms/op
Iteration   3: 8.582 ms/op

# Run progress: 19.57% complete, ETA 00:07:07
# Fork: 2 of 2
# Warmup Iteration   1: 20.653 ms/op
# Warmup Iteration   2: 11.347 ms/op
Iteration   1: 8.661 ms/op
Iteration   2: 8.431 ms/op
Iteration   3: 8.418 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  8.516 ±(99.9%) 0.369 ms/op [Average]
  (min, avg, max) = (8.352, 8.516, 8.661), stdev = 0.132
  CI (99.9%): [8.146, 8.885] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:06:56
# Fork: 1 of 2
# Warmup Iteration   1: 1230.568 ms/op
# Warmup Iteration   2: 486.057 ms/op
Iteration   1: 366.585 ms/op
Iteration   2: 279.002 ms/op
Iteration   3: 292.442 ms/op

# Run progress: 23.91% complete, ETA 00:06:44
# Fork: 2 of 2
# Warmup Iteration   1: 1228.346 ms/op
# Warmup Iteration   2: 414.614 ms/op
Iteration   1: 299.832 ms/op
Iteration   2: 271.437 ms/op
Iteration   3: 287.856 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  299.526 ±(99.9%) 96.275 ms/op [Average]
  (min, avg, max) = (271.437, 299.526, 366.585), stdev = 34.332
  CI (99.9%): [203.251, 395.800] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2072.762 ms/op
# Warmup Iteration   2: 678.001 ms/op
Iteration   1: 420.103 ms/op
Iteration   2: 319.042 ms/op
Iteration   3: 357.385 ms/op

# Run progress: 28.26% complete, ETA 00:06:18
# Fork: 2 of 2
# Warmup Iteration   1: 2031.694 ms/op
# Warmup Iteration   2: 598.179 ms/op
Iteration   1: 363.299 ms/op
Iteration   2: 366.888 ms/op
Iteration   3: 350.016 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  362.789 ±(99.9%) 92.224 ms/op [Average]
  (min, avg, max) = (319.042, 362.789, 420.103), stdev = 32.888
  CI (99.9%): [270.565, 455.013] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:06
# Fork: 1 of 2
# Warmup Iteration   1: 1019.783 ms/op
# Warmup Iteration   2: 353.303 ms/op
Iteration   1: 334.976 ms/op
Iteration   2: 324.140 ms/op
Iteration   3: 325.118 ms/op

# Run progress: 32.61% complete, ETA 00:05:53
# Fork: 2 of 2
# Warmup Iteration   1: 1032.077 ms/op
# Warmup Iteration   2: 352.156 ms/op
Iteration   1: 321.234 ms/op
Iteration   2: 323.825 ms/op
Iteration   3: 319.169 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  324.744 ±(99.9%) 15.330 ms/op [Average]
  (min, avg, max) = (319.169, 324.744, 334.976), stdev = 5.467
  CI (99.9%): [309.413, 340.074] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:41
# Fork: 1 of 2
# Warmup Iteration   1: 2052.759 ms/op
# Warmup Iteration   2: 813.065 ms/op
Iteration   1: 778.919 ms/op
Iteration   2: 717.057 ms/op
Iteration   3: 757.408 ms/op

# Run progress: 36.96% complete, ETA 00:05:30
# Fork: 2 of 2
# Warmup Iteration   1: 2049.397 ms/op
# Warmup Iteration   2: 819.188 ms/op
Iteration   1: 773.771 ms/op
Iteration   2: 722.587 ms/op
Iteration   3: 748.207 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  749.658 ±(99.9%) 71.991 ms/op [Average]
  (min, avg, max) = (717.057, 749.658, 778.919), stdev = 25.673
  CI (99.9%): [677.667, 821.650] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:19
# Fork: 1 of 2
# Warmup Iteration   1: 0.120 ms/op
# Warmup Iteration   2: 0.067 ms/op
Iteration   1: 0.068 ms/op
Iteration   2: 0.068 ms/op
Iteration   3: 0.065 ms/op

# Run progress: 41.30% complete, ETA 00:05:06
# Fork: 2 of 2
# Warmup Iteration   1: 0.130 ms/op
# Warmup Iteration   2: 0.066 ms/op
Iteration   1: 0.066 ms/op
Iteration   2: 0.065 ms/op
Iteration   3: 0.065 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.066 ±(99.9%) 0.005 ms/op [Average]
  (min, avg, max) = (0.065, 0.066, 0.068), stdev = 0.002
  CI (99.9%): [0.061, 0.071] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:04:53
# Fork: 1 of 2
# Warmup Iteration   1: 7.283 ms/op
# Warmup Iteration   2: 4.923 ms/op
Iteration   1: 4.774 ms/op
Iteration   2: 4.829 ms/op
Iteration   3: 4.781 ms/op

# Run progress: 45.65% complete, ETA 00:04:40
# Fork: 2 of 2
# Warmup Iteration   1: 7.733 ms/op
# Warmup Iteration   2: 4.936 ms/op
Iteration   1: 4.883 ms/op
Iteration   2: 4.840 ms/op
Iteration   3: 4.917 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  4.837 ±(99.9%) 0.157 ms/op [Average]
  (min, avg, max) = (4.774, 4.837, 4.917), stdev = 0.056
  CI (99.9%): [4.681, 4.994] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:28
# Fork: 1 of 2
# Warmup Iteration   1: 0.562 ms/op
# Warmup Iteration   2: 0.357 ms/op
Iteration   1: 0.346 ms/op
Iteration   2: 0.356 ms/op
Iteration   3: 0.355 ms/op

# Run progress: 50.00% complete, ETA 00:04:16
# Fork: 2 of 2
# Warmup Iteration   1: 0.546 ms/op
# Warmup Iteration   2: 0.351 ms/op
Iteration   1: 0.346 ms/op
Iteration   2: 0.348 ms/op
Iteration   3: 0.352 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.351 ±(99.9%) 0.013 ms/op [Average]
  (min, avg, max) = (0.346, 0.351, 0.356), stdev = 0.005
  CI (99.9%): [0.338, 0.363] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:04
# Fork: 1 of 2
# Warmup Iteration   1: 1.320 ms/op
# Warmup Iteration   2: 0.938 ms/op
Iteration   1: 0.890 ms/op
Iteration   2: 0.880 ms/op
Iteration   3: 0.878 ms/op

# Run progress: 54.35% complete, ETA 00:03:52
# Fork: 2 of 2
# Warmup Iteration   1: 1.357 ms/op
# Warmup Iteration   2: 1.011 ms/op
Iteration   1: 0.889 ms/op
Iteration   2: 0.880 ms/op
Iteration   3: 0.880 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  0.883 ±(99.9%) 0.014 ms/op [Average]
  (min, avg, max) = (0.878, 0.883, 0.890), stdev = 0.005
  CI (99.9%): [0.869, 0.897] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:40
# Fork: 1 of 2
# Warmup Iteration   1: 143.761 ms/op
# Warmup Iteration   2: 24.910 ms/op
Iteration   1: 19.847 ms/op
Iteration   2: 17.159 ms/op
Iteration   3: 15.069 ms/op

# Run progress: 58.70% complete, ETA 00:03:29
# Fork: 2 of 2
# Warmup Iteration   1: 112.828 ms/op
# Warmup Iteration   2: 23.154 ms/op
Iteration   1: 19.841 ms/op
Iteration   2: 17.286 ms/op
Iteration   3: 15.192 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  17.399 ±(99.9%) 5.925 ms/op [Average]
  (min, avg, max) = (15.069, 17.399, 19.847), stdev = 2.113
  CI (99.9%): [11.474, 23.324] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:17
# Fork: 1 of 2
# Warmup Iteration   1: 59775.571 ms/op
# Warmup Iteration   2: 51698.661 ms/op
Iteration   1: 51013.717 ms/op
Iteration   2: 50773.706 ms/op
Iteration   3: 49190.387 ms/op

# Run progress: 63.04% complete, ETA 00:05:35
# Fork: 2 of 2
# Warmup Iteration   1: 57589.311 ms/op
# Warmup Iteration   2: 51150.663 ms/op
Iteration   1: 49130.531 ms/op
Iteration   2: 48248.980 ms/op
Iteration   3: 48653.457 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  49501.796 ±(99.9%) 3179.433 ms/op [Average]
  (min, avg, max) = (48248.980, 49501.796, 51013.717), stdev = 1133.817
  CI (99.9%): [46322.363, 52681.230] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:21
# Fork: 1 of 2
# Warmup Iteration   1: 19266.166 ms/op
# Warmup Iteration   2: 8794.865 ms/op
Iteration   1: 13727.196 ms/op
Iteration   2: 13927.350 ms/op
Iteration   3: 11606.003 ms/op

# Run progress: 67.39% complete, ETA 00:08:50
# Fork: 2 of 2
# Warmup Iteration   1: 19272.415 ms/op
# Warmup Iteration   2: 8865.213 ms/op
Iteration   1: 14505.731 ms/op
Iteration   2: 8445.248 ms/op
Iteration   3: 11780.643 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  12332.029 ±(99.9%) 6289.726 ms/op [Average]
  (min, avg, max) = (8445.248, 12332.029, 14505.731), stdev = 2242.977
  CI (99.9%): [6042.302, 18621.755] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:09:41
# Fork: 1 of 2
# Warmup Iteration   1: 9148.733 ms/op
# Warmup Iteration   2: 6098.397 ms/op
Iteration   1: 5858.670 ms/op
Iteration   2: 5225.515 ms/op
Iteration   3: 4821.413 ms/op

# Run progress: 71.74% complete, ETA 00:08:55
# Fork: 2 of 2
# Warmup Iteration   1: 9751.672 ms/op
# Warmup Iteration   2: 6249.823 ms/op
Iteration   1: 5764.536 ms/op
Iteration   2: 5266.238 ms/op
Iteration   3: 4916.105 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  5308.746 ±(99.9%) 1196.672 ms/op [Average]
  (min, avg, max) = (4821.413, 5308.746, 5858.670), stdev = 426.745
  CI (99.9%): [4112.074, 6505.419] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: Nov 03, 2026 6:41:58 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 6:41:58 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
61.395 ms/op
# Warmup Iteration   2: 38.425 ms/op
Iteration   1: 36.652 ms/op
Iteration   2: 36.477 ms/op
Iteration   3: 36.542 ms/op

# Run progress: 76.09% complete, ETA 00:07:21
# Fork: 2 of 2
# Warmup Iteration   1: Nov 03, 2026 6:42:10 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 6:42:10 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
61.081 ms/op
# Warmup Iteration   2: 37.711 ms/op
Iteration   1: 37.997 ms/op
Iteration   2: 36.192 ms/op
Iteration   3: 37.098 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  36.826 ±(99.9%) 1.809 ms/op [Average]
  (min, avg, max) = (36.192, 36.826, 37.997), stdev = 0.645
  CI (99.9%): [35.017, 38.635] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:06:32
# Fork: 1 of 2
# Warmup Iteration   1: 59.641 ms/op
# Warmup Iteration   2: 37.509 ms/op
Iteration   1: 36.690 ms/op
Iteration   2: 37.799 ms/op
Iteration   3: 36.912 ms/op

# Run progress: 80.43% complete, ETA 00:05:46
# Fork: 2 of 2
# Warmup Iteration   1: 55.245 ms/op
# Warmup Iteration   2: 35.332 ms/op
Iteration   1: 34.761 ms/op
Iteration   2: 35.513 ms/op
Iteration   3: 34.463 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  36.023 ±(99.9%) 3.694 ms/op [Average]
  (min, avg, max) = (34.463, 36.023, 37.799), stdev = 1.317
  CI (99.9%): [32.329, 39.717] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 20.495 ms/op
# Warmup Iteration   2: 13.571 ms/op
Iteration   1: 10.706 ms/op
Iteration   2: 10.907 ms/op
Iteration   3: 10.674 ms/op

# Run progress: 89.13% complete, ETA 00:02:59
# Fork: 2 of 2
# Warmup Iteration   1: 19.648 ms/op
# Warmup Iteration   2: 11.218 ms/op
Iteration   1: 11.055 ms/op
Iteration   2: 10.619 ms/op
Iteration   3: 10.340 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  10.717 ±(99.9%) 0.692 ms/op [Average]
  (min, avg, max) = (10.340, 10.717, 11.055), stdev = 0.247
  CI (99.9%): [10.025, 11.409] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 14.310 ms/op
# Warmup Iteration   2: 8.912 ms/op
Iteration   1: 8.793 ms/op
Iteration   2: 8.028 ms/op
Iteration   3: 8.042 ms/op

# Run progress: 93.48% complete, ETA 00:01:44
# Fork: 2 of 2
# Warmup Iteration   1: 14.861 ms/op
# Warmup Iteration   2: 8.936 ms/op
Iteration   1: 9.025 ms/op
Iteration   2: 7.947 ms/op
Iteration   3: 8.004 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  8.307 ±(99.9%) 1.328 ms/op [Average]
  (min, avg, max) = (7.947, 8.307, 9.025), stdev = 0.474
  CI (99.9%): [6.978, 9.635] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 17.581 ms/op
# Warmup Iteration   2: 14.469 ms/op
Iteration   1: 14.994 ms/op
Iteration   2: 14.126 ms/op
Iteration   3: 14.173 ms/op

# Run progress: 97.83% complete, ETA 00:00:33
# Fork: 2 of 2
# Warmup Iteration   1: 18.596 ms/op
# Warmup Iteration   2: 14.134 ms/op
Iteration   1: 15.007 ms/op
Iteration   2: 14.410 ms/op
Iteration   3: 14.490 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  14.533 ±(99.9%) 1.086 ms/op [Average]
  (min, avg, max) = (14.126, 14.533, 15.007), stdev = 0.387
  CI (99.9%): [13.447, 15.619] (assumes normal distribution)


# Run complete. Total time: 00:25:27

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     12.604 ±    0.307  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      0.943 ±    0.038  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.450 ±    0.218  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      4.811 ±    0.197  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      8.516 ±    0.369  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    299.526 ±   96.275  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    362.789 ±   92.224  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    324.744 ±   15.330  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    749.658 ±   71.991  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.066 ±    0.005  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      4.837 ±    0.157  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.351 ±    0.013  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      0.883 ±    0.014  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     17.399 ±    5.925  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  49501.796 ± 3179.433  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  12332.029 ± 6289.726  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   5308.746 ± 1196.672  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     36.826 ±    1.809  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     36.023 ±    3.694  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     10.717 ±    0.692  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      8.307 ±    1.328  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     14.533 ±    1.086  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.19.0 -> 3.20.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 9 lower, 14 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 7.35317 | 8.30658 | +12.97% | Overlapping CIs |
| flash.TPflash.testFlash | 273.01 | 299.526 | +9.71% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 0.892231 | 0.943477 | +5.74% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 307.924 | 324.744 | +5.46% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.333605 | 0.350628 | +5.10% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 16.5764 | 17.3991 | +4.96% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 4.61648 | 4.83725 | +4.78% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 716.336 | 749.658 | +4.65% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 5559.87 | 5308.75 | -4.52% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000213023 | 0.000203457 | -4.49% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
