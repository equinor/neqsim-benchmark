# NeqSim 3.20.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.19.0 |
| Current | 3.20.0 |
| Source commit | `01c0da54cfd560bdd575c713187f7e896ec9887e` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41663451836) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "01c0da54cfd560bdd575c713187f7e896ec9887e",
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
Model name:                              AMD EPYC 9V74 80-Core Processor
CPU family:                              25
Model:                                   17
Thread(s) per core:                      2
Core(s) per socket:                      1
Socket(s):                               1
Stepping:                                1
BogoMIPS:                                5192.27
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid avx512f avx512dq rdseed adx smap avx512ifma clflushopt clwb avx512cd sha_ni avx512bw avx512vl xsaveopt xsavec xgetbv1 xsaves user_shstk avx512_bf16 clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload avx512vbmi umip avx512_vbmi2 gfni vaes vpclmulqdq avx512_vnni avx512_bitalg avx512_vpopcntdq rdpid fsrm
Virtualization:                          AMD-V
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               32 KiB (1 instance)
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
Vulnerability Tsa:                       Vulnerable: No microcode
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
[INFO] Total time:  9.767 s
[INFO] Finished at: 2026-11-03T15:24:15Z
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
tpFlashLeanGas                                                 60.0000  (66 ms)
tpFlashWellFluidSrk                                            83.6406  (135 ms)
tpFlashWellFluidPr                                             83.6541  (69 ms)
tpFlashWellFluidWithProperties                                 5445.46  (117 ms)
phAndPsFlashWellFluid                                          2459.23  (78 ms)
Nov 03, 2026 3:24:28 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 3:24:28 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (509 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (249 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (104 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (48 ms)
saturationPointsWellFluid                                      1601.32  (117 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1124 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1305 ms)
levenbergMarquardtAntoine                                      1837.31  (10 ms)
levenbergMarquardtDoubleExponential                            5.57177  (6 ms)
dataReconciliation[20]                                         7.89841  (16 ms)
dataReconciliation[100]                                        37.0132  (47 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.341 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.915 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.024 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 316774 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 37 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    3.91e-03 (tolerance: 5.27e-03) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  5.02e-03 (tolerance: 5.27e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     3.89e-04 (tolerance: 5.27e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 5.02e-03 after 37 passes - accepted 5.27e-03 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 6.51e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264248.6 + 377074.3, oil 1995226.4 + 2850245.7, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.409 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.5 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 316.8 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 11651 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 11.66 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  05:58 min
[INFO] Finished at: 2026-11-03T15:30:15Z
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
# Warmup Iteration   1: 32.162 ms/op
# Warmup Iteration   2: 18.829 ms/op
Iteration   1: 17.551 ms/op
Iteration   2: 17.558 ms/op
Iteration   3: 17.938 ms/op

# Run progress: 2.17% complete, ETA 00:09:00
# Fork: 2 of 2
# Warmup Iteration   1: 33.745 ms/op
# Warmup Iteration   2: 19.293 ms/op
Iteration   1: 17.325 ms/op
Iteration   2: 17.329 ms/op
Iteration   3: 17.183 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  17.481 ±(99.9%) 0.748 ms/op [Average]
  (min, avg, max) = (17.183, 17.481, 17.938), stdev = 0.267
  CI (99.9%): [16.732, 18.229] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:43
# Fork: 1 of 2
# Warmup Iteration   1: 3.043 ms/op
# Warmup Iteration   2: 1.604 ms/op
Iteration   1: 1.222 ms/op
Iteration   2: 1.215 ms/op
Iteration   3: 1.217 ms/op

# Run progress: 6.52% complete, ETA 00:08:30
# Fork: 2 of 2
# Warmup Iteration   1: 3.027 ms/op
# Warmup Iteration   2: 1.308 ms/op
Iteration   1: 1.230 ms/op
Iteration   2: 1.230 ms/op
Iteration   3: 1.228 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.224 ±(99.9%) 0.019 ms/op [Average]
  (min, avg, max) = (1.215, 1.224, 1.230), stdev = 0.007
  CI (99.9%): [1.204, 1.243] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:17
# Fork: 1 of 2
# Warmup Iteration   1: 16.145 ms/op
# Warmup Iteration   2: 8.384 ms/op
Iteration   1: 6.179 ms/op
Iteration   2: 6.072 ms/op
Iteration   3: 6.215 ms/op

# Run progress: 10.87% complete, ETA 00:08:05
# Fork: 2 of 2
# Warmup Iteration   1: 16.165 ms/op
# Warmup Iteration   2: 8.817 ms/op
Iteration   1: 6.312 ms/op
Iteration   2: 6.080 ms/op
Iteration   3: 6.285 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.191 ±(99.9%) 0.283 ms/op [Average]
  (min, avg, max) = (6.072, 6.191, 6.312), stdev = 0.101
  CI (99.9%): [5.908, 6.473] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:53
# Fork: 1 of 2
# Warmup Iteration   1: 16.047 ms/op
# Warmup Iteration   2: 9.028 ms/op
Iteration   1: 6.553 ms/op
Iteration   2: 6.434 ms/op
Iteration   3: 6.345 ms/op

# Run progress: 15.22% complete, ETA 00:07:41
# Fork: 2 of 2
# Warmup Iteration   1: 15.890 ms/op
# Warmup Iteration   2: 9.081 ms/op
Iteration   1: 6.816 ms/op
Iteration   2: 6.435 ms/op
Iteration   3: 6.433 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.503 ±(99.9%) 0.469 ms/op [Average]
  (min, avg, max) = (6.345, 6.503, 6.816), stdev = 0.167
  CI (99.9%): [6.034, 6.972] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:29
# Fork: 1 of 2
# Warmup Iteration   1: 30.973 ms/op
# Warmup Iteration   2: 16.428 ms/op
Iteration   1: 11.333 ms/op
Iteration   2: 10.889 ms/op
Iteration   3: 10.516 ms/op

# Run progress: 19.57% complete, ETA 00:07:18
# Fork: 2 of 2
# Warmup Iteration   1: 26.561 ms/op
# Warmup Iteration   2: 15.659 ms/op
Iteration   1: 11.677 ms/op
Iteration   2: 10.778 ms/op
Iteration   3: 10.533 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.954 ±(99.9%) 1.297 ms/op [Average]
  (min, avg, max) = (10.516, 10.954, 11.677), stdev = 0.463
  CI (99.9%): [9.657, 12.251] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:06
# Fork: 1 of 2
# Warmup Iteration   1: 2238.932 ms/op
# Warmup Iteration   2: 690.407 ms/op
Iteration   1: 428.189 ms/op
Iteration   2: 376.837 ms/op
Iteration   3: 331.427 ms/op

# Run progress: 23.91% complete, ETA 00:06:53
# Fork: 2 of 2
# Warmup Iteration   1: 2320.476 ms/op
# Warmup Iteration   2: 611.850 ms/op
Iteration   1: 388.718 ms/op
Iteration   2: 350.666 ms/op
Iteration   3: 328.635 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  367.412 ±(99.9%) 107.263 ms/op [Average]
  (min, avg, max) = (328.635, 367.412, 428.189), stdev = 38.251
  CI (99.9%): [260.149, 474.675] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:41
# Fork: 1 of 2
# Warmup Iteration   1: 2428.868 ms/op
# Warmup Iteration   2: 842.311 ms/op
Iteration   1: 542.397 ms/op
Iteration   2: 456.094 ms/op
Iteration   3: 520.303 ms/op

# Run progress: 28.26% complete, ETA 00:06:29
# Fork: 2 of 2
# Warmup Iteration   1: 2485.728 ms/op
# Warmup Iteration   2: 845.127 ms/op
Iteration   1: 522.339 ms/op
Iteration   2: 512.542 ms/op
Iteration   3: 440.996 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  499.112 ±(99.9%) 114.048 ms/op [Average]
  (min, avg, max) = (440.996, 499.112, 542.397), stdev = 40.671
  CI (99.9%): [385.063, 613.160] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:18
# Fork: 1 of 2
# Warmup Iteration   1: 1196.888 ms/op
# Warmup Iteration   2: 441.802 ms/op
Iteration   1: 414.960 ms/op
Iteration   2: 399.476 ms/op
Iteration   3: 400.473 ms/op

# Run progress: 32.61% complete, ETA 00:06:05
# Fork: 2 of 2
# Warmup Iteration   1: 1150.536 ms/op
# Warmup Iteration   2: 441.301 ms/op
Iteration   1: 409.267 ms/op
Iteration   2: 398.100 ms/op
Iteration   3: 398.523 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  403.466 ±(99.9%) 19.584 ms/op [Average]
  (min, avg, max) = (398.100, 403.466, 414.960), stdev = 6.984
  CI (99.9%): [383.882, 423.050] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:53
# Fork: 1 of 2
# Warmup Iteration   1: 2421.802 ms/op
# Warmup Iteration   2: 1034.958 ms/op
Iteration   1: 991.548 ms/op
Iteration   2: 913.509 ms/op
Iteration   3: 914.800 ms/op

# Run progress: 36.96% complete, ETA 00:05:43
# Fork: 2 of 2
# Warmup Iteration   1: 2369.069 ms/op
# Warmup Iteration   2: 1049.102 ms/op
Iteration   1: 1012.569 ms/op
Iteration   2: 921.439 ms/op
Iteration   3: 913.191 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  944.510 ±(99.9%) 126.664 ms/op [Average]
  (min, avg, max) = (913.191, 944.510, 1012.569), stdev = 45.170
  CI (99.9%): [817.845, 1071.174] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:32
# Fork: 1 of 2
# Warmup Iteration   1: 0.228 ms/op
# Warmup Iteration   2: 0.082 ms/op
Iteration   1: 0.081 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.080 ms/op

# Run progress: 41.30% complete, ETA 00:05:18
# Fork: 2 of 2
# Warmup Iteration   1: 0.187 ms/op
# Warmup Iteration   2: 0.083 ms/op
Iteration   1: 0.081 ms/op
Iteration   2: 0.081 ms/op
Iteration   3: 0.081 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.081 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.080, 0.081, 0.081), stdev = 0.001
  CI (99.9%): [0.079, 0.082] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:04
# Fork: 1 of 2
# Warmup Iteration   1: 10.705 ms/op
# Warmup Iteration   2: 6.326 ms/op
Iteration   1: 6.129 ms/op
Iteration   2: 6.133 ms/op
Iteration   3: 6.112 ms/op

# Run progress: 45.65% complete, ETA 00:04:51
# Fork: 2 of 2
# Warmup Iteration   1: 10.936 ms/op
# Warmup Iteration   2: 6.337 ms/op
Iteration   1: 6.353 ms/op
Iteration   2: 6.144 ms/op
Iteration   3: 6.107 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.163 ±(99.9%) 0.264 ms/op [Average]
  (min, avg, max) = (6.107, 6.163, 6.353), stdev = 0.094
  CI (99.9%): [5.899, 6.427] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:38
# Fork: 1 of 2
# Warmup Iteration   1: 0.806 ms/op
# Warmup Iteration   2: 0.469 ms/op
Iteration   1: 0.461 ms/op
Iteration   2: 0.461 ms/op
Iteration   3: 0.462 ms/op

# Run progress: 50.00% complete, ETA 00:04:25
# Fork: 2 of 2
# Warmup Iteration   1: 0.805 ms/op
# Warmup Iteration   2: 0.466 ms/op
Iteration   1: 0.463 ms/op
Iteration   2: 0.459 ms/op
Iteration   3: 0.462 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.461 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.459, 0.461, 0.463), stdev = 0.001
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

# Run progress: 52.17% complete, ETA 00:04:12
# Fork: 1 of 2
# Warmup Iteration   1: 1.975 ms/op
# Warmup Iteration   2: 1.293 ms/op
Iteration   1: 1.204 ms/op
Iteration   2: 1.201 ms/op
Iteration   3: 1.204 ms/op

# Run progress: 54.35% complete, ETA 00:03:59
# Fork: 2 of 2
# Warmup Iteration   1: 1.926 ms/op
# Warmup Iteration   2: 1.299 ms/op
Iteration   1: 1.198 ms/op
Iteration   2: 1.198 ms/op
Iteration   3: 1.199 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.201 ±(99.9%) 0.008 ms/op [Average]
  (min, avg, max) = (1.198, 1.201, 1.204), stdev = 0.003
  CI (99.9%): [1.193, 1.209] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:47
# Fork: 1 of 2
# Warmup Iteration   1: 170.731 ms/op
# Warmup Iteration   2: 36.761 ms/op
Iteration   1: 26.583 ms/op
Iteration   2: 25.567 ms/op
Iteration   3: 24.498 ms/op

# Run progress: 58.70% complete, ETA 00:03:35
# Fork: 2 of 2
# Warmup Iteration   1: 169.909 ms/op
# Warmup Iteration   2: 42.568 ms/op
Iteration   1: 28.855 ms/op
Iteration   2: 26.888 ms/op
Iteration   3: 24.798 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  26.198 ±(99.9%) 4.509 ms/op [Average]
  (min, avg, max) = (24.498, 26.198, 28.855), stdev = 1.608
  CI (99.9%): [21.689, 30.707] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:23
# Fork: 1 of 2
# Warmup Iteration   1: 79819.677 ms/op
# Warmup Iteration   2: 71423.146 ms/op
Iteration   1: 69841.147 ms/op
Iteration   2: 69725.726 ms/op
Iteration   3: 69477.954 ms/op

# Run progress: 63.04% complete, ETA 00:06:37
# Fork: 2 of 2
# Warmup Iteration   1: 80391.894 ms/op
# Warmup Iteration   2: 71178.095 ms/op
Iteration   1: 69146.395 ms/op
Iteration   2: 69313.449 ms/op
Iteration   3: 69206.261 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  69451.822 ±(99.9%) 793.157 ms/op [Average]
  (min, avg, max) = (69146.395, 69451.822, 69841.147), stdev = 282.847
  CI (99.9%): [68658.665, 70244.979] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:09:14
# Fork: 1 of 2
# Warmup Iteration   1: 20830.081 ms/op
# Warmup Iteration   2: 22640.710 ms/op
Iteration   1: 15852.362 ms/op
Iteration   2: 17811.605 ms/op
Iteration   3: 14981.822 ms/op

# Run progress: 67.39% complete, ETA 00:11:26
# Fork: 2 of 2
# Warmup Iteration   1: 20925.516 ms/op
# Warmup Iteration   2: 23011.197 ms/op
Iteration   1: 16031.507 ms/op
Iteration   2: 17987.517 ms/op
Iteration   3: 15081.232 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  16291.007 ±(99.9%) 3683.561 ms/op [Average]
  (min, avg, max) = (14981.822, 16291.007, 17987.517), stdev = 1313.593
  CI (99.9%): [12607.447, 19974.568] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:13:08
# Fork: 1 of 2
# Warmup Iteration   1: 11732.742 ms/op
# Warmup Iteration   2: 8186.414 ms/op
Iteration   1: 7967.963 ms/op
Iteration   2: 7146.703 ms/op
Iteration   3: 6467.825 ms/op

# Run progress: 71.74% complete, ETA 00:12:06
# Fork: 2 of 2
# Warmup Iteration   1: 12423.598 ms/op
# Warmup Iteration   2: 7955.044 ms/op
Iteration   1: 7873.508 ms/op
Iteration   2: 6555.201 ms/op
Iteration   3: 6455.991 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  7077.865 ±(99.9%) 1967.778 ms/op [Average]
  (min, avg, max) = (6455.991, 7077.865, 7967.963), stdev = 701.729
  CI (99.9%): [5110.087, 9045.643] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:11:05
# Fork: 1 of 2
# Warmup Iteration   1: Nov 03, 2026 4:01:41 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 4:01:42 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
101.529 ms/op
# Warmup Iteration   2: 48.893 ms/op
Iteration   1: 49.466 ms/op
Iteration   2: 48.097 ms/op
Iteration   3: 47.854 ms/op

# Run progress: 76.09% complete, ETA 00:09:56
# Fork: 2 of 2
# Warmup Iteration   1: Nov 03, 2026 4:01:53 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 4:01:53 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
80.582 ms/op
# Warmup Iteration   2: 45.927 ms/op
Iteration   1: 44.170 ms/op
Iteration   2: 44.094 ms/op
Iteration   3: 44.012 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  46.282 ±(99.9%) 6.904 ms/op [Average]
  (min, avg, max) = (44.012, 46.282, 49.466), stdev = 2.462
  CI (99.9%): [39.378, 53.186] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:08:49
# Fork: 1 of 2
# Warmup Iteration   1: 119.421 ms/op
# Warmup Iteration   2: 52.454 ms/op
Iteration   1: 50.203 ms/op
Iteration   2: 50.238 ms/op
Iteration   3: 49.952 ms/op

# Run progress: 80.43% complete, ETA 00:07:46
# Fork: 2 of 2
# Warmup Iteration   1: 134.776 ms/op
# Warmup Iteration   2: 62.633 ms/op
Iteration   1: 50.436 ms/op
Iteration   2: 50.542 ms/op
Iteration   3: 51.772 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  50.524 ±(99.9%) 1.807 ms/op [Average]
  (min, avg, max) = (49.952, 50.524, 51.772), stdev = 0.645
  CI (99.9%): [48.716, 52.331] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:06:46
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:48
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

# Run progress: 86.96% complete, ETA 00:04:53
# Fork: 1 of 2
# Warmup Iteration   1: 28.745 ms/op
# Warmup Iteration   2: 15.537 ms/op
Iteration   1: 13.391 ms/op
Iteration   2: 14.242 ms/op
Iteration   3: 13.368 ms/op

# Run progress: 89.13% complete, ETA 00:03:59
# Fork: 2 of 2
# Warmup Iteration   1: 29.944 ms/op
# Warmup Iteration   2: 18.741 ms/op
Iteration   1: 13.741 ms/op
Iteration   2: 14.010 ms/op
Iteration   3: 13.425 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  13.696 ±(99.9%) 1.028 ms/op [Average]
  (min, avg, max) = (13.368, 13.696, 14.242), stdev = 0.367
  CI (99.9%): [12.668, 14.725] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:08
# Fork: 1 of 2
# Warmup Iteration   1: 18.837 ms/op
# Warmup Iteration   2: 11.270 ms/op
Iteration   1: 10.711 ms/op
Iteration   2: 10.565 ms/op
Iteration   3: 9.825 ms/op

# Run progress: 93.48% complete, ETA 00:02:18
# Fork: 2 of 2
# Warmup Iteration   1: 20.115 ms/op
# Warmup Iteration   2: 12.063 ms/op
Iteration   1: 10.421 ms/op
Iteration   2: 10.310 ms/op
Iteration   3: 9.598 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  10.238 ±(99.9%) 1.222 ms/op [Average]
  (min, avg, max) = (9.598, 10.238, 10.711), stdev = 0.436
  CI (99.9%): [9.016, 11.461] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:30
# Fork: 1 of 2
# Warmup Iteration   1: 36.154 ms/op
# Warmup Iteration   2: 25.055 ms/op
Iteration   1: 24.884 ms/op
Iteration   2: 24.891 ms/op
Iteration   3: 24.819 ms/op

# Run progress: 97.83% complete, ETA 00:00:44
# Fork: 2 of 2
# Warmup Iteration   1: 26.885 ms/op
# Warmup Iteration   2: 20.138 ms/op
Iteration   1: 20.093 ms/op
Iteration   2: 20.056 ms/op
Iteration   3: 20.092 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  22.472 ±(99.9%) 7.349 ms/op [Average]
  (min, avg, max) = (20.056, 22.472, 24.891), stdev = 2.621
  CI (99.9%): [15.124, 29.821] (assumes normal distribution)


# Run complete. Total time: 00:33:43

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     17.481 ±    0.748  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.224 ±    0.019  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.191 ±    0.283  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.503 ±    0.469  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.954 ±    1.297  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    367.412 ±  107.263  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    499.112 ±  114.048  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    403.466 ±   19.584  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    944.510 ±  126.664  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.081 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.163 ±    0.264  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.461 ±    0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.201 ±    0.008  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     26.198 ±    4.509  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  69451.822 ±  793.157  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  16291.007 ± 3683.561  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   7077.865 ± 1967.778  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     46.282 ±    6.904  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     50.524 ±    1.807  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     13.696 ±    1.028  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     10.238 ±    1.222  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     22.472 ±    7.349  ms/op

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
[INFO] Total time:  2.383 s
[INFO] Finished at: 2026-11-03T16:04:02Z
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
tpFlashLeanGas                                                 60.0000  (56 ms)
tpFlashWellFluidSrk                                            83.6406  (97 ms)
tpFlashWellFluidPr                                             83.6541  (97 ms)
tpFlashWellFluidWithProperties                                 5445.46  (142 ms)
phAndPsFlashWellFluid                                          2459.23  (107 ms)
Nov 03, 2026 4:04:10 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 4:04:11 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (678 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (255 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (125 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (47 ms)
saturationPointsWellFluid                                      1601.32  (88 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1063 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1312 ms)
levenbergMarquardtAntoine                                      1837.31  (11 ms)
levenbergMarquardtDoubleExponential                            5.57177  (7 ms)
dataReconciliation[20]                                         7.89841  (15 ms)
dataReconciliation[100]                                        37.0132  (68 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.310 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.846 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.018 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 273818 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 28 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    7.18e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.75e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     8.26e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.75e-03 after 28 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 0.000115 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 263846.0 + 376269.0, oil 1995040.1 + 2849809.9, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.379 MSm3/d, KA27841 A 102.7 bara, pipeline outlet 51.9 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 273.8 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 12328 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 12.34 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  05:07 min
[INFO] Finished at: 2026-11-03T16:09:10Z
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
# Warmup Iteration   1: 34.518 ms/op
# Warmup Iteration   2: 19.650 ms/op
Iteration   1: 17.469 ms/op
Iteration   2: 17.221 ms/op
Iteration   3: 17.199 ms/op

# Run progress: 2.17% complete, ETA 00:08:54
# Fork: 2 of 2
# Warmup Iteration   1: 34.164 ms/op
# Warmup Iteration   2: 18.662 ms/op
Iteration   1: 17.313 ms/op
Iteration   2: 17.520 ms/op
Iteration   3: 17.250 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  17.328 ±(99.9%) 0.379 ms/op [Average]
  (min, avg, max) = (17.199, 17.328, 17.520), stdev = 0.135
  CI (99.9%): [16.950, 17.707] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:43
# Fork: 1 of 2
# Warmup Iteration   1: 3.040 ms/op
# Warmup Iteration   2: 1.455 ms/op
Iteration   1: 1.173 ms/op
Iteration   2: 1.168 ms/op
Iteration   3: 1.170 ms/op

# Run progress: 6.52% complete, ETA 00:08:31
# Fork: 2 of 2
# Warmup Iteration   1: 3.023 ms/op
# Warmup Iteration   2: 1.438 ms/op
Iteration   1: 1.175 ms/op
Iteration   2: 1.175 ms/op
Iteration   3: 1.172 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.172 ±(99.9%) 0.008 ms/op [Average]
  (min, avg, max) = (1.168, 1.172, 1.175), stdev = 0.003
  CI (99.9%): [1.164, 1.180] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:18
# Fork: 1 of 2
# Warmup Iteration   1: 14.855 ms/op
# Warmup Iteration   2: 8.783 ms/op
Iteration   1: 6.060 ms/op
Iteration   2: 5.926 ms/op
Iteration   3: 5.968 ms/op

# Run progress: 10.87% complete, ETA 00:08:05
# Fork: 2 of 2
# Warmup Iteration   1: 15.168 ms/op
# Warmup Iteration   2: 8.462 ms/op
Iteration   1: 6.280 ms/op
Iteration   2: 6.072 ms/op
Iteration   3: 6.207 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.085 ±(99.9%) 0.382 ms/op [Average]
  (min, avg, max) = (5.926, 6.085, 6.280), stdev = 0.136
  CI (99.9%): [5.704, 6.467] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:53
# Fork: 1 of 2
# Warmup Iteration   1: 16.541 ms/op
# Warmup Iteration   2: 8.983 ms/op
Iteration   1: 6.605 ms/op
Iteration   2: 6.493 ms/op
Iteration   3: 6.443 ms/op

# Run progress: 15.22% complete, ETA 00:07:41
# Fork: 2 of 2
# Warmup Iteration   1: 15.074 ms/op
# Warmup Iteration   2: 9.936 ms/op
Iteration   1: 6.852 ms/op
Iteration   2: 6.515 ms/op
Iteration   3: 6.453 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.560 ±(99.9%) 0.433 ms/op [Average]
  (min, avg, max) = (6.443, 6.560, 6.852), stdev = 0.154
  CI (99.9%): [6.128, 6.993] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:29
# Fork: 1 of 2
# Warmup Iteration   1: 31.375 ms/op
# Warmup Iteration   2: 16.903 ms/op
Iteration   1: 11.954 ms/op
Iteration   2: 10.974 ms/op
Iteration   3: 10.679 ms/op

# Run progress: 19.57% complete, ETA 00:07:17
# Fork: 2 of 2
# Warmup Iteration   1: 27.427 ms/op
# Warmup Iteration   2: 15.480 ms/op
Iteration   1: 11.263 ms/op
Iteration   2: 10.912 ms/op
Iteration   3: 10.563 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  11.057 ±(99.9%) 1.409 ms/op [Average]
  (min, avg, max) = (10.563, 11.057, 11.954), stdev = 0.502
  CI (99.9%): [9.648, 12.466] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:05
# Fork: 1 of 2
# Warmup Iteration   1: 2117.561 ms/op
# Warmup Iteration   2: 674.609 ms/op
Iteration   1: 451.114 ms/op
Iteration   2: 359.949 ms/op
Iteration   3: 329.573 ms/op

# Run progress: 23.91% complete, ETA 00:06:51
# Fork: 2 of 2
# Warmup Iteration   1: 2184.734 ms/op
# Warmup Iteration   2: 598.952 ms/op
Iteration   1: 411.180 ms/op
Iteration   2: 354.924 ms/op
Iteration   3: 327.643 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  372.397 ±(99.9%) 137.363 ms/op [Average]
  (min, avg, max) = (327.643, 372.397, 451.114), stdev = 48.985
  CI (99.9%): [235.034, 509.760] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2349.911 ms/op
# Warmup Iteration   2: 849.806 ms/op
Iteration   1: 521.243 ms/op
Iteration   2: 472.382 ms/op
Iteration   3: 452.648 ms/op

# Run progress: 28.26% complete, ETA 00:06:27
# Fork: 2 of 2
# Warmup Iteration   1: 2393.994 ms/op
# Warmup Iteration   2: 826.068 ms/op
Iteration   1: 540.796 ms/op
Iteration   2: 464.788 ms/op
Iteration   3: 469.621 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  486.913 ±(99.9%) 99.189 ms/op [Average]
  (min, avg, max) = (452.648, 486.913, 540.796), stdev = 35.372
  CI (99.9%): [387.724, 586.102] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:16
# Fork: 1 of 2
# Warmup Iteration   1: 1152.805 ms/op
# Warmup Iteration   2: 448.199 ms/op
Iteration   1: 407.425 ms/op
Iteration   2: 400.518 ms/op
Iteration   3: 399.016 ms/op

# Run progress: 32.61% complete, ETA 00:06:04
# Fork: 2 of 2
# Warmup Iteration   1: 1143.802 ms/op
# Warmup Iteration   2: 443.921 ms/op
Iteration   1: 409.365 ms/op
Iteration   2: 398.808 ms/op
Iteration   3: 397.364 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  402.083 ±(99.9%) 14.099 ms/op [Average]
  (min, avg, max) = (397.364, 402.083, 409.365), stdev = 5.028
  CI (99.9%): [387.984, 416.182] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2504.729 ms/op
# Warmup Iteration   2: 1052.337 ms/op
Iteration   1: 1009.718 ms/op
Iteration   2: 904.440 ms/op
Iteration   3: 914.446 ms/op

# Run progress: 36.96% complete, ETA 00:05:43
# Fork: 2 of 2
# Warmup Iteration   1: 2419.860 ms/op
# Warmup Iteration   2: 1022.014 ms/op
Iteration   1: 984.047 ms/op
Iteration   2: 901.257 ms/op
Iteration   3: 912.860 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  937.795 ±(99.9%) 131.089 ms/op [Average]
  (min, avg, max) = (901.257, 937.795, 1009.718), stdev = 46.748
  CI (99.9%): [806.705, 1068.884] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:33
# Fork: 1 of 2
# Warmup Iteration   1: 0.239 ms/op
# Warmup Iteration   2: 0.082 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:18
# Fork: 2 of 2
# Warmup Iteration   1: 0.193 ms/op
# Warmup Iteration   2: 0.082 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.080 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.080 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.079, 0.080, 0.080), stdev = 0.001
  CI (99.9%): [0.079, 0.081] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:05
# Fork: 1 of 2
# Warmup Iteration   1: 10.142 ms/op
# Warmup Iteration   2: 6.276 ms/op
Iteration   1: 6.120 ms/op
Iteration   2: 6.126 ms/op
Iteration   3: 6.088 ms/op

# Run progress: 45.65% complete, ETA 00:04:51
# Fork: 2 of 2
# Warmup Iteration   1: 10.009 ms/op
# Warmup Iteration   2: 6.273 ms/op
Iteration   1: 6.141 ms/op
Iteration   2: 6.125 ms/op
Iteration   3: 6.308 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.151 ±(99.9%) 0.220 ms/op [Average]
  (min, avg, max) = (6.088, 6.151, 6.308), stdev = 0.078
  CI (99.9%): [5.931, 6.372] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:38
# Fork: 1 of 2
# Warmup Iteration   1: 0.790 ms/op
# Warmup Iteration   2: 0.465 ms/op
Iteration   1: 0.460 ms/op
Iteration   2: 0.459 ms/op
Iteration   3: 0.459 ms/op

# Run progress: 50.00% complete, ETA 00:04:25
# Fork: 2 of 2
# Warmup Iteration   1: 0.849 ms/op
# Warmup Iteration   2: 0.490 ms/op
Iteration   1: 0.486 ms/op
Iteration   2: 0.486 ms/op
Iteration   3: 0.485 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.473 ±(99.9%) 0.041 ms/op [Average]
  (min, avg, max) = (0.459, 0.473, 0.486), stdev = 0.015
  CI (99.9%): [0.432, 0.513] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:12
# Fork: 1 of 2
# Warmup Iteration   1: 1.957 ms/op
# Warmup Iteration   2: 1.299 ms/op
Iteration   1: 1.191 ms/op
Iteration   2: 1.193 ms/op
Iteration   3: 1.188 ms/op

# Run progress: 54.35% complete, ETA 00:04:00
# Fork: 2 of 2
# Warmup Iteration   1: 1.934 ms/op
# Warmup Iteration   2: 1.298 ms/op
Iteration   1: 1.193 ms/op
Iteration   2: 1.190 ms/op
Iteration   3: 1.188 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.190 ±(99.9%) 0.006 ms/op [Average]
  (min, avg, max) = (1.188, 1.190, 1.193), stdev = 0.002
  CI (99.9%): [1.185, 1.196] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:47
# Fork: 1 of 2
# Warmup Iteration   1: 187.227 ms/op
# Warmup Iteration   2: 47.183 ms/op
Iteration   1: 29.539 ms/op
Iteration   2: 27.552 ms/op
Iteration   3: 24.052 ms/op

# Run progress: 58.70% complete, ETA 00:03:35
# Fork: 2 of 2
# Warmup Iteration   1: 225.577 ms/op
# Warmup Iteration   2: 41.999 ms/op
Iteration   1: 27.676 ms/op
Iteration   2: 26.888 ms/op
Iteration   3: 22.748 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  26.409 ±(99.9%) 7.082 ms/op [Average]
  (min, avg, max) = (22.748, 26.409, 29.539), stdev = 2.526
  CI (99.9%): [19.327, 33.492] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:23
# Fork: 1 of 2
# Warmup Iteration   1: 77055.097 ms/op
# Warmup Iteration   2: 68973.878 ms/op
Iteration   1: 67108.873 ms/op
Iteration   2: 67197.037 ms/op
Iteration   3: 66715.338 ms/op

# Run progress: 63.04% complete, ETA 00:06:30
# Fork: 2 of 2
# Warmup Iteration   1: 79898.125 ms/op
# Warmup Iteration   2: 72345.308 ms/op
Iteration   1: 69470.493 ms/op
Iteration   2: 68543.070 ms/op
Iteration   3: 68743.493 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  67963.050 ±(99.9%) 3095.060 ms/op [Average]
  (min, avg, max) = (66715.338, 67963.050, 69470.493), stdev = 1103.728
  CI (99.9%): [64867.991, 71058.110] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:09:07
# Fork: 1 of 2
# Warmup Iteration   1: 23386.296 ms/op
# Warmup Iteration   2: 9928.116 ms/op
Iteration   1: 19405.583 ms/op
Iteration   2: 16736.648 ms/op
Iteration   3: 16131.701 ms/op

# Run progress: 67.39% complete, ETA 00:11:13
# Fork: 2 of 2
# Warmup Iteration   1: 21563.232 ms/op
# Warmup Iteration   2: 22244.616 ms/op
Iteration   1: 17913.237 ms/op
Iteration   2: 21111.534 ms/op
Iteration   3: 14660.441 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  17659.857 ±(99.9%) 6541.622 ms/op [Average]
  (min, avg, max) = (14660.441, 17659.857, 21111.534), stdev = 2332.806
  CI (99.9%): [11118.235, 24201.480] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:12:57
# Fork: 1 of 2
# Warmup Iteration   1: 12252.914 ms/op
# Warmup Iteration   2: 7976.302 ms/op
Iteration   1: 7354.607 ms/op
Iteration   2: 6163.547 ms/op
Iteration   3: 6196.339 ms/op

# Run progress: 71.74% complete, ETA 00:11:56
# Fork: 2 of 2
# Warmup Iteration   1: 11834.594 ms/op
# Warmup Iteration   2: 7359.484 ms/op
Iteration   1: 6557.703 ms/op
Iteration   2: 6832.789 ms/op
Iteration   3: 6442.254 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6591.206 ±(99.9%) 1256.116 ms/op [Average]
  (min, avg, max) = (6163.547, 6591.206, 7354.607), stdev = 447.943
  CI (99.9%): [5335.090, 7847.322] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:10:55
# Fork: 1 of 2
# Warmup Iteration   1: Nov 03, 2026 4:40:10 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 4:40:10 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
113.833 ms/op
# Warmup Iteration   2: 49.296 ms/op
Iteration   1: 50.651 ms/op
Iteration   2: 48.560 ms/op
Iteration   3: 49.378 ms/op

# Run progress: 76.09% complete, ETA 00:09:47
# Fork: 2 of 2
# Warmup Iteration   1: Nov 03, 2026 4:40:21 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 4:40:22 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
91.888 ms/op
# Warmup Iteration   2: 49.798 ms/op
Iteration   1: 51.889 ms/op
Iteration   2: 48.786 ms/op
Iteration   3: 48.627 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  49.649 ±(99.9%) 3.776 ms/op [Average]
  (min, avg, max) = (48.560, 49.649, 51.889), stdev = 1.347
  CI (99.9%): [45.872, 53.425] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:08:42
# Fork: 1 of 2
# Warmup Iteration   1: 138.612 ms/op
# Warmup Iteration   2: 52.532 ms/op
Iteration   1: 47.398 ms/op
Iteration   2: 47.280 ms/op
Iteration   3: 47.285 ms/op

# Run progress: 80.43% complete, ETA 00:07:40
# Fork: 2 of 2
# Warmup Iteration   1: 81.683 ms/op
# Warmup Iteration   2: 49.744 ms/op
Iteration   1: 47.305 ms/op
Iteration   2: 47.313 ms/op
Iteration   3: 47.202 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  47.297 ±(99.9%) 0.177 ms/op [Average]
  (min, avg, max) = (47.202, 47.297, 47.398), stdev = 0.063
  CI (99.9%): [47.120, 47.474] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:43
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

# Run progress: 86.96% complete, ETA 00:04:49
# Fork: 1 of 2
# Warmup Iteration   1: 29.204 ms/op
# Warmup Iteration   2: 17.367 ms/op
Iteration   1: 14.839 ms/op
Iteration   2: 15.605 ms/op
Iteration   3: 15.281 ms/op

# Run progress: 89.13% complete, ETA 00:03:56
# Fork: 2 of 2
# Warmup Iteration   1: 26.798 ms/op
# Warmup Iteration   2: 15.359 ms/op
Iteration   1: 13.491 ms/op
Iteration   2: 14.270 ms/op
Iteration   3: 13.495 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  14.497 ±(99.9%) 2.516 ms/op [Average]
  (min, avg, max) = (13.491, 14.497, 15.605), stdev = 0.897
  CI (99.9%): [11.981, 17.013] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:05
# Fork: 1 of 2
# Warmup Iteration   1: 19.476 ms/op
# Warmup Iteration   2: 12.486 ms/op
Iteration   1: 10.424 ms/op
Iteration   2: 10.372 ms/op
Iteration   3: 9.654 ms/op

# Run progress: 93.48% complete, ETA 00:02:16
# Fork: 2 of 2
# Warmup Iteration   1: 22.831 ms/op
# Warmup Iteration   2: 13.283 ms/op
Iteration   1: 12.030 ms/op
Iteration   2: 12.069 ms/op
Iteration   3: 11.171 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  10.954 ±(99.9%) 2.735 ms/op [Average]
  (min, avg, max) = (9.654, 10.954, 12.069), stdev = 0.975
  CI (99.9%): [8.219, 13.688] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:29
# Fork: 1 of 2
# Warmup Iteration   1: 32.386 ms/op
# Warmup Iteration   2: 25.155 ms/op
Iteration   1: 24.954 ms/op
Iteration   2: 24.981 ms/op
Iteration   3: 25.700 ms/op

# Run progress: 97.83% complete, ETA 00:00:44
# Fork: 2 of 2
# Warmup Iteration   1: 27.076 ms/op
# Warmup Iteration   2: 20.058 ms/op
Iteration   1: 20.008 ms/op
Iteration   2: 19.987 ms/op
Iteration   3: 20.481 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  22.685 ±(99.9%) 7.814 ms/op [Average]
  (min, avg, max) = (19.987, 22.685, 25.700), stdev = 2.786
  CI (99.9%): [14.872, 30.499] (assumes normal distribution)


# Run complete. Total time: 00:33:16

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     17.328 ±    0.379  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.172 ±    0.008  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.085 ±    0.382  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.560 ±    0.433  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     11.057 ±    1.409  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    372.397 ±  137.363  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    486.913 ±   99.189  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    402.083 ±   14.099  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    937.795 ±  131.089  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.080 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.151 ±    0.220  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.473 ±    0.041  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.190 ±    0.006  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     26.409 ±    7.082  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  67963.050 ± 3095.060  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  17659.857 ± 6541.622  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6591.206 ± 1256.116  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     49.649 ±    3.776  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     47.297 ±    0.177  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     14.497 ±    2.516  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     10.954 ±    2.735  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     22.685 ±    7.814  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.19.0 -> 3.20.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 12 lower, 11 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 16291 | 17659.9 | +8.40% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 46.2821 | 49.6485 | +7.27% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 10.2383 | 10.9535 | +6.99% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 7077.87 | 6591.21 | -6.88% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 50.5238 | 47.297 | -6.39% | Separate CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 13.6962 | 14.4967 | +5.84% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.22361 | 1.17228 | -4.19% | Separate CIs |
| flash.TPflash_UMR.testFlash_UMR | 499.112 | 486.913 | -2.44% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.461343 | 0.472502 | +2.42% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 69451.8 | 67963.1 | -2.14% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
