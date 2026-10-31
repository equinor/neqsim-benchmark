# NeqSim 3.18.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.17.0 |
| Current | 3.18.0 |
| Source commit | `09fcaa63d6e8c8084661d3ec592163d243f445e0` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41195235563) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "09fcaa63d6e8c8084661d3ec592163d243f445e0",
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
BogoMIPS:                                5192.26
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
| baseline | 3.17.0 | passed |
| current | 3.18.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.17.0",
  "version": "3.17.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.17.0/neqsim-3.17.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.18.0",
  "version": "3.18.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.18.0/neqsim-3.18.0.jar",
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
[INFO] Total time:  8.662 s
[INFO] Finished at: 2026-10-31T11:03:32Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.17.0 (neqsim-3.17.0.jar); requested: 3.17.0
$ mvn clean verify -Dneqsim.version=3.17.0
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
tpFlashLeanGas                                                 60.0000  (32 ms)
tpFlashWellFluidSrk                                            83.6406  (121 ms)
tpFlashWellFluidPr                                             83.6541  (69 ms)
tpFlashWellFluidWithProperties                                 5445.46  (109 ms)
phAndPsFlashWellFluid                                          2459.23  (67 ms)
Oct 31, 2026 11:03:45 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 31, 2026 11:03:45 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (578 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (275 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (34 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (90 ms)
saturationPointsWellFluid                                      1601.32  (101 ms)
singlePhaseGasPipelineSteadyState                              121.628  (890 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1285 ms)
levenbergMarquardtAntoine                                      1837.31  (9 ms)
levenbergMarquardtDoubleExponential                            5.57177  (8 ms)
dataReconciliation[20]                                         7.89841  (18 ms)
dataReconciliation[100]                                        37.0132  (70 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.368 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.666 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.032 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 231813 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 27 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    7.66e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.75e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     8.72e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.75e-03 after 27 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
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

feed 5489240.1, gas 263818.8 + 376154.8, oil 1994937.8 + 2849751.0, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.376 MSm3/d, KA27841 A 102.7 bara, pipeline outlet 51.9 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 231.8 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 20939 ms, solved=true, gas=318849.56 kg/hr, water in/out=0.00027104531/1.5353073e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018484308, composition error=0.0029102354
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00013837322
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 20.94 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.17.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.17.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  04:46 min
[INFO] Finished at: 2026-10-31T11:08:20Z
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
# Warmup Iteration   1: 28.414 ms/op
# Warmup Iteration   2: 16.870 ms/op
Iteration   1: 16.691 ms/op
Iteration   2: 16.732 ms/op
Iteration   3: 16.353 ms/op

# Run progress: 2.17% complete, ETA 00:09:02
# Fork: 2 of 2
# Warmup Iteration   1: 30.585 ms/op
# Warmup Iteration   2: 18.066 ms/op
Iteration   1: 17.182 ms/op
Iteration   2: 16.860 ms/op
Iteration   3: 17.021 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  16.806 ±(99.9%) 0.808 ms/op [Average]
  (min, avg, max) = (16.353, 16.806, 17.182), stdev = 0.288
  CI (99.9%): [15.999, 17.614] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:46
# Fork: 1 of 2
# Warmup Iteration   1: 2.785 ms/op
# Warmup Iteration   2: 1.307 ms/op
Iteration   1: 1.160 ms/op
Iteration   2: 1.161 ms/op
Iteration   3: 1.153 ms/op

# Run progress: 6.52% complete, ETA 00:08:33
# Fork: 2 of 2
# Warmup Iteration   1: 2.946 ms/op
# Warmup Iteration   2: 2.100 ms/op
Iteration   1: 1.211 ms/op
Iteration   2: 1.206 ms/op
Iteration   3: 1.206 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.183 ±(99.9%) 0.076 ms/op [Average]
  (min, avg, max) = (1.153, 1.183, 1.211), stdev = 0.027
  CI (99.9%): [1.106, 1.259] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:20
# Fork: 1 of 2
# Warmup Iteration   1: 13.726 ms/op
# Warmup Iteration   2: 7.190 ms/op
Iteration   1: 5.641 ms/op
Iteration   2: 5.630 ms/op
Iteration   3: 5.645 ms/op

# Run progress: 10.87% complete, ETA 00:08:08
# Fork: 2 of 2
# Warmup Iteration   1: 12.237 ms/op
# Warmup Iteration   2: 7.115 ms/op
Iteration   1: 5.442 ms/op
Iteration   2: 5.479 ms/op
Iteration   3: 5.628 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  5.578 ±(99.9%) 0.257 ms/op [Average]
  (min, avg, max) = (5.442, 5.578, 5.645), stdev = 0.092
  CI (99.9%): [5.321, 5.834] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:56
# Fork: 1 of 2
# Warmup Iteration   1: 11.488 ms/op
# Warmup Iteration   2: 7.813 ms/op
Iteration   1: 5.631 ms/op
Iteration   2: 5.417 ms/op
Iteration   3: 5.376 ms/op

# Run progress: 15.22% complete, ETA 00:07:43
# Fork: 2 of 2
# Warmup Iteration   1: 13.487 ms/op
# Warmup Iteration   2: 6.903 ms/op
Iteration   1: 5.690 ms/op
Iteration   2: 5.785 ms/op
Iteration   3: 5.666 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  5.594 ±(99.9%) 0.454 ms/op [Average]
  (min, avg, max) = (5.376, 5.594, 5.785), stdev = 0.162
  CI (99.9%): [5.140, 6.048] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:31
# Fork: 1 of 2
# Warmup Iteration   1: 27.056 ms/op
# Warmup Iteration   2: 14.206 ms/op
Iteration   1: 10.214 ms/op
Iteration   2: 9.729 ms/op
Iteration   3: 9.813 ms/op

# Run progress: 19.57% complete, ETA 00:07:20
# Fork: 2 of 2
# Warmup Iteration   1: 27.451 ms/op
# Warmup Iteration   2: 13.628 ms/op
Iteration   1: 10.329 ms/op
Iteration   2: 9.858 ms/op
Iteration   3: 10.032 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  9.996 ±(99.9%) 0.668 ms/op [Average]
  (min, avg, max) = (9.729, 9.996, 10.329), stdev = 0.238
  CI (99.9%): [9.328, 10.663] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:08
# Fork: 1 of 2
# Warmup Iteration   1: 2153.474 ms/op
# Warmup Iteration   2: 698.508 ms/op
Iteration   1: 504.142 ms/op
Iteration   2: 370.427 ms/op
Iteration   3: 350.667 ms/op

# Run progress: 23.91% complete, ETA 00:06:53
# Fork: 2 of 2
# Warmup Iteration   1: 2414.578 ms/op
# Warmup Iteration   2: 690.420 ms/op
Iteration   1: 459.581 ms/op
Iteration   2: 387.563 ms/op
Iteration   3: 343.641 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  402.670 ±(99.9%) 181.698 ms/op [Average]
  (min, avg, max) = (343.641, 402.670, 504.142), stdev = 64.795
  CI (99.9%): [220.972, 584.368] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:40
# Fork: 1 of 2
# Warmup Iteration   1: 9797.695 ms/op
# Warmup Iteration   2: 6290.759 ms/op
Iteration   1: 4839.227 ms/op
Iteration   2: 4665.886 ms/op
Iteration   3: 4639.331 ms/op

# Run progress: 28.26% complete, ETA 00:07:16
# Fork: 2 of 2
# Warmup Iteration   1: 9139.613 ms/op
# Warmup Iteration   2: 5278.608 ms/op
Iteration   1: 4584.269 ms/op
Iteration   2: 4590.320 ms/op
Iteration   3: 4614.079 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  4655.519 ±(99.9%) 266.509 ms/op [Average]
  (min, avg, max) = (4584.269, 4655.519, 4839.227), stdev = 95.040
  CI (99.9%): [4389.010, 4922.028] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:07:37
# Fork: 1 of 2
# Warmup Iteration   1: 1202.626 ms/op
# Warmup Iteration   2: 456.128 ms/op
Iteration   1: 412.556 ms/op
Iteration   2: 403.263 ms/op
Iteration   3: 403.359 ms/op

# Run progress: 32.61% complete, ETA 00:07:16
# Fork: 2 of 2
# Warmup Iteration   1: 1208.635 ms/op
# Warmup Iteration   2: 454.703 ms/op
Iteration   1: 410.147 ms/op
Iteration   2: 410.331 ms/op
Iteration   3: 403.481 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  407.189 ±(99.9%) 11.980 ms/op [Average]
  (min, avg, max) = (403.263, 407.189, 412.556), stdev = 4.272
  CI (99.9%): [395.209, 419.170] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:56
# Fork: 1 of 2
# Warmup Iteration   1: 2600.967 ms/op
# Warmup Iteration   2: 1035.123 ms/op
Iteration   1: 1038.206 ms/op
Iteration   2: 914.771 ms/op
Iteration   3: 921.507 ms/op

# Run progress: 36.96% complete, ETA 00:06:40
# Fork: 2 of 2
# Warmup Iteration   1: 2541.736 ms/op
# Warmup Iteration   2: 1028.628 ms/op
Iteration   1: 1022.395 ms/op
Iteration   2: 905.442 ms/op
Iteration   3: 925.199 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  954.587 ±(99.9%) 166.128 ms/op [Average]
  (min, avg, max) = (905.442, 954.587, 1038.206), stdev = 59.243
  CI (99.9%): [788.459, 1120.715] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:06:24
# Fork: 1 of 2
# Warmup Iteration   1: 0.213 ms/op
# Warmup Iteration   2: 0.081 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.080 ms/op

# Run progress: 41.30% complete, ETA 00:06:06
# Fork: 2 of 2
# Warmup Iteration   1: 0.267 ms/op
# Warmup Iteration   2: 0.090 ms/op
Iteration   1: 0.081 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.080 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.080 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.080, 0.080, 0.081), stdev = 0.001
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

# Run progress: 43.48% complete, ETA 00:05:48
# Fork: 1 of 2
# Warmup Iteration   1: 9.971 ms/op
# Warmup Iteration   2: 6.303 ms/op
Iteration   1: 6.172 ms/op
Iteration   2: 6.143 ms/op
Iteration   3: 6.123 ms/op

# Run progress: 45.65% complete, ETA 00:05:31
# Fork: 2 of 2
# Warmup Iteration   1: 10.266 ms/op
# Warmup Iteration   2: 6.340 ms/op
Iteration   1: 6.141 ms/op
Iteration   2: 6.140 ms/op
Iteration   3: 6.117 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.139 ±(99.9%) 0.054 ms/op [Average]
  (min, avg, max) = (6.117, 6.139, 6.172), stdev = 0.019
  CI (99.9%): [6.085, 6.194] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:05:14
# Fork: 1 of 2
# Warmup Iteration   1: 0.839 ms/op
# Warmup Iteration   2: 0.475 ms/op
Iteration   1: 0.462 ms/op
Iteration   2: 0.462 ms/op
Iteration   3: 0.460 ms/op

# Run progress: 50.00% complete, ETA 00:04:58
# Fork: 2 of 2
# Warmup Iteration   1: 0.820 ms/op
# Warmup Iteration   2: 0.465 ms/op
Iteration   1: 0.462 ms/op
Iteration   2: 0.461 ms/op
Iteration   3: 0.462 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.461 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.460, 0.461, 0.462), stdev = 0.001
  CI (99.9%): [0.460, 0.463] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:43
# Fork: 1 of 2
# Warmup Iteration   1: 2.003 ms/op
# Warmup Iteration   2: 1.295 ms/op
Iteration   1: 1.199 ms/op
Iteration   2: 1.200 ms/op
Iteration   3: 1.193 ms/op

# Run progress: 54.35% complete, ETA 00:04:28
# Fork: 2 of 2
# Warmup Iteration   1: 2.076 ms/op
# Warmup Iteration   2: 1.313 ms/op
Iteration   1: 1.218 ms/op
Iteration   2: 1.217 ms/op
Iteration   3: 1.222 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.208 ±(99.9%) 0.035 ms/op [Average]
  (min, avg, max) = (1.193, 1.208, 1.222), stdev = 0.012
  CI (99.9%): [1.173, 1.243] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:04:13
# Fork: 1 of 2
# Warmup Iteration   1: 186.998 ms/op
# Warmup Iteration   2: 45.982 ms/op
Iteration   1: 29.042 ms/op
Iteration   2: 26.921 ms/op
Iteration   3: 25.298 ms/op

# Run progress: 58.70% complete, ETA 00:03:59
# Fork: 2 of 2
# Warmup Iteration   1: 202.457 ms/op
# Warmup Iteration   2: 38.293 ms/op
Iteration   1: 29.135 ms/op
Iteration   2: 27.091 ms/op
Iteration   3: 25.008 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  27.082 ±(99.9%) 4.947 ms/op [Average]
  (min, avg, max) = (25.008, 27.082, 29.135), stdev = 1.764
  CI (99.9%): [22.135, 32.030] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:45
# Fork: 1 of 2
# Warmup Iteration   1: 74861.119 ms/op
# Warmup Iteration   2: 69603.214 ms/op
Iteration   1: 68362.399 ms/op
Iteration   2: 68221.877 ms/op
Iteration   3: 68079.889 ms/op

# Run progress: 63.04% complete, ETA 00:06:50
# Fork: 2 of 2
# Warmup Iteration   1: 74913.862 ms/op
# Warmup Iteration   2: 70089.361 ms/op
Iteration   1: 68750.895 ms/op
Iteration   2: 68515.183 ms/op
Iteration   3: 68572.131 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  68417.062 ±(99.9%) 686.756 ms/op [Average]
  (min, avg, max) = (68079.889, 68417.062, 68750.895), stdev = 244.904
  CI (99.9%): [67730.306, 69103.818] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:09:21
# Fork: 1 of 2
# Warmup Iteration   1: 15685.145 ms/op
# Warmup Iteration   2: 14049.157 ms/op
Iteration   1: 10944.181 ms/op
Iteration   2: 8907.070 ms/op
Iteration   3: 11977.978 ms/op

# Run progress: 67.39% complete, ETA 00:10:42
# Fork: 2 of 2
# Warmup Iteration   1: 15369.834 ms/op
# Warmup Iteration   2: 13799.671 ms/op
Iteration   1: 10665.671 ms/op
Iteration   2: 8733.552 ms/op
Iteration   3: 11180.050 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  10401.417 ±(99.9%) 3649.988 ms/op [Average]
  (min, avg, max) = (8733.552, 10401.417, 11977.978), stdev = 1301.621
  CI (99.9%): [6751.429, 14051.405] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:11:38
# Fork: 1 of 2
# Warmup Iteration   1: 20339.554 ms/op
# Warmup Iteration   2: 16605.465 ms/op
Iteration   1: 14961.166 ms/op
Iteration   2: 13628.399 ms/op
Iteration   3: 13343.289 ms/op

# Run progress: 71.74% complete, ETA 00:11:00
# Fork: 2 of 2
# Warmup Iteration   1: 20508.748 ms/op
# Warmup Iteration   2: 14399.491 ms/op
Iteration   1: 12981.291 ms/op
Iteration   2: 13329.944 ms/op
Iteration   3: 12538.769 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  13463.810 ±(99.9%) 2309.035 ms/op [Average]
  (min, avg, max) = (12538.769, 13463.810, 14961.166), stdev = 823.424
  CI (99.9%): [11154.774, 15772.845] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:10:17
# Fork: 1 of 2
# Warmup Iteration   1: Oct 31, 2026 11:37:32 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 31, 2026 11:37:32 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
81.276 ms/op
# Warmup Iteration   2: 46.415 ms/op
Iteration   1: 45.094 ms/op
Iteration   2: 45.850 ms/op
Iteration   3: 44.359 ms/op

# Run progress: 76.09% complete, ETA 00:09:13
# Fork: 2 of 2
# Warmup Iteration   1: Oct 31, 2026 11:37:43 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 31, 2026 11:37:43 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
102.494 ms/op
# Warmup Iteration   2: 49.283 ms/op
Iteration   1: 50.791 ms/op
Iteration   2: 48.875 ms/op
Iteration   3: 48.710 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  47.280 ±(99.9%) 7.124 ms/op [Average]
  (min, avg, max) = (44.359, 47.280, 50.791), stdev = 2.540
  CI (99.9%): [40.156, 54.404] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:08:12
# Fork: 1 of 2
# Warmup Iteration   1: 114.907 ms/op
# Warmup Iteration   2: 60.730 ms/op
Iteration   1: 58.043 ms/op
Iteration   2: 58.253 ms/op
Iteration   3: 58.856 ms/op

# Run progress: 80.43% complete, ETA 00:07:14
# Fork: 2 of 2
# Warmup Iteration   1: 155.391 ms/op
# Warmup Iteration   2: 64.131 ms/op
Iteration   1: 55.971 ms/op
Iteration   2: 55.672 ms/op
Iteration   3: 55.520 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  57.053 ±(99.9%) 4.178 ms/op [Average]
  (min, avg, max) = (55.520, 57.053, 58.856), stdev = 1.490
  CI (99.9%): [52.874, 61.231] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:06:18
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:24
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

# Run progress: 86.96% complete, ETA 00:04:32
# Fork: 1 of 2
# Warmup Iteration   1: 1.126 ms/op
# Warmup Iteration   2: 0.588 ms/op
Iteration   1: 0.557 ms/op
Iteration   2: 0.540 ms/op
Iteration   3: 0.530 ms/op

# Run progress: 89.13% complete, ETA 00:03:43
# Fork: 2 of 2
# Warmup Iteration   1: 1.062 ms/op
# Warmup Iteration   2: 0.562 ms/op
Iteration   1: 0.533 ms/op
Iteration   2: 0.514 ms/op
Iteration   3: 0.538 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.535 ±(99.9%) 0.039 ms/op [Average]
  (min, avg, max) = (0.514, 0.535, 0.557), stdev = 0.014
  CI (99.9%): [0.496, 0.575] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:55
# Fork: 1 of 2
# Warmup Iteration   1: 18.408 ms/op
# Warmup Iteration   2: 10.796 ms/op
Iteration   1: 10.689 ms/op
Iteration   2: 10.570 ms/op
Iteration   3: 9.821 ms/op

# Run progress: 93.48% complete, ETA 00:02:09
# Fork: 2 of 2
# Warmup Iteration   1: 20.940 ms/op
# Warmup Iteration   2: 13.916 ms/op
Iteration   1: 12.711 ms/op
Iteration   2: 11.657 ms/op
Iteration   3: 11.383 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  11.138 ±(99.9%) 2.822 ms/op [Average]
  (min, avg, max) = (9.821, 11.138, 12.711), stdev = 1.006
  CI (99.9%): [8.317, 13.960] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:24
# Fork: 1 of 2
# Warmup Iteration   1: 32.502 ms/op
# Warmup Iteration   2: 25.560 ms/op
Iteration   1: 25.422 ms/op
Iteration   2: 25.468 ms/op
Iteration   3: 26.813 ms/op

# Run progress: 97.83% complete, ETA 00:00:41
# Fork: 2 of 2
# Warmup Iteration   1: 27.608 ms/op
# Warmup Iteration   2: 20.528 ms/op
Iteration   1: 20.510 ms/op
Iteration   2: 20.447 ms/op
Iteration   3: 20.410 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  23.178 ±(99.9%) 8.481 ms/op [Average]
  (min, avg, max) = (20.410, 23.178, 26.813), stdev = 3.024
  CI (99.9%): [14.698, 31.659] (assumes normal distribution)


# Run complete. Total time: 00:31:29

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     16.806 ±    0.808  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.183 ±    0.076  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      5.578 ±    0.257  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      5.594 ±    0.454  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      9.996 ±    0.668  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    402.670 ±  181.698  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   4655.519 ±  266.509  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    407.189 ±   11.980  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    954.587 ±  166.128  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.080 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.139 ±    0.054  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.461 ±    0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.208 ±    0.035  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     27.082 ±    4.947  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  68417.062 ±  686.756  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  10401.417 ± 3649.988  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  13463.810 ± 2309.035  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     47.280 ±    7.124  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     57.053 ±    4.178  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.535 ±    0.039  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     11.138 ±    2.822  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     23.178 ±    8.481  ms/op

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
[INFO] Total time:  3.147 s
[INFO] Finished at: 2026-10-31T11:39:54Z
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
tpFlashLeanGas                                                 60.0000  (39 ms)
tpFlashWellFluidSrk                                            83.6406  (104 ms)
tpFlashWellFluidPr                                             83.6541  (121 ms)
tpFlashWellFluidWithProperties                                 5445.46  (145 ms)
phAndPsFlashWellFluid                                          2459.23  (78 ms)
Oct 31, 2026 11:40:03 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 31, 2026 11:40:03 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (558 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (276 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (82 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (42 ms)
saturationPointsWellFluid                                      1601.32  (106 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1259 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1384 ms)
levenbergMarquardtAntoine                                      1837.31  (9 ms)
levenbergMarquardtDoubleExponential                            5.57177  (9 ms)
dataReconciliation[20]                                         7.89841  (23 ms)
dataReconciliation[100]                                        37.0132  (65 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.595 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.640 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.030 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 330987 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 60 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    0.00e+00 (tolerance: 1.00e-03) OK [worst: separation train A::4th stage separator -> liquidOutStream]
  Temperature:  0.00e+00 (tolerance: 1.00e-03) OK [worst: separation train A::4th stage separator -> liquidOutStream]
  Pressure:     0.00e+00 (tolerance: 1.00e-03) OK [worst: separation train A::4th stage separator -> liquidOutStream]
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 331.0 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 12850 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 12.86 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  06:05 min
[INFO] Finished at: 2026-10-31T11:46:01Z
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
# Warmup Iteration   1: 28.610 ms/op
# Warmup Iteration   2: 16.702 ms/op
Iteration   1: 16.690 ms/op
Iteration   2: 16.489 ms/op
Iteration   3: 16.453 ms/op

# Run progress: 2.17% complete, ETA 00:08:55
# Fork: 2 of 2
# Warmup Iteration   1: 30.171 ms/op
# Warmup Iteration   2: 17.020 ms/op
Iteration   1: 16.768 ms/op
Iteration   2: 16.523 ms/op
Iteration   3: 16.498 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  16.570 ±(99.9%) 0.357 ms/op [Average]
  (min, avg, max) = (16.453, 16.570, 16.768), stdev = 0.127
  CI (99.9%): [16.213, 16.927] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:41
# Fork: 1 of 2
# Warmup Iteration   1: 2.868 ms/op
# Warmup Iteration   2: 1.326 ms/op
Iteration   1: 1.169 ms/op
Iteration   2: 1.178 ms/op
Iteration   3: 1.166 ms/op

# Run progress: 6.52% complete, ETA 00:08:29
# Fork: 2 of 2
# Warmup Iteration   1: 3.254 ms/op
# Warmup Iteration   2: 1.849 ms/op
Iteration   1: 1.227 ms/op
Iteration   2: 1.212 ms/op
Iteration   3: 1.214 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.195 ±(99.9%) 0.074 ms/op [Average]
  (min, avg, max) = (1.166, 1.195, 1.227), stdev = 0.026
  CI (99.9%): [1.121, 1.268] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 13.286 ms/op
# Warmup Iteration   2: 7.531 ms/op
Iteration   1: 5.703 ms/op
Iteration   2: 5.684 ms/op
Iteration   3: 5.686 ms/op

# Run progress: 10.87% complete, ETA 00:08:04
# Fork: 2 of 2
# Warmup Iteration   1: 12.386 ms/op
# Warmup Iteration   2: 6.878 ms/op
Iteration   1: 5.459 ms/op
Iteration   2: 5.474 ms/op
Iteration   3: 5.444 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  5.575 ±(99.9%) 0.358 ms/op [Average]
  (min, avg, max) = (5.444, 5.575, 5.703), stdev = 0.128
  CI (99.9%): [5.217, 5.933] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 13.444 ms/op
# Warmup Iteration   2: 6.653 ms/op
Iteration   1: 5.569 ms/op
Iteration   2: 5.574 ms/op
Iteration   3: 5.637 ms/op

# Run progress: 15.22% complete, ETA 00:07:40
# Fork: 2 of 2
# Warmup Iteration   1: 12.954 ms/op
# Warmup Iteration   2: 6.914 ms/op
Iteration   1: 5.521 ms/op
Iteration   2: 5.581 ms/op
Iteration   3: 5.576 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  5.577 ±(99.9%) 0.104 ms/op [Average]
  (min, avg, max) = (5.521, 5.577, 5.637), stdev = 0.037
  CI (99.9%): [5.473, 5.680] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:28
# Fork: 1 of 2
# Warmup Iteration   1: 26.352 ms/op
# Warmup Iteration   2: 14.334 ms/op
Iteration   1: 10.202 ms/op
Iteration   2: 9.871 ms/op
Iteration   3: 9.680 ms/op

# Run progress: 19.57% complete, ETA 00:07:17
# Fork: 2 of 2
# Warmup Iteration   1: 28.278 ms/op
# Warmup Iteration   2: 14.873 ms/op
Iteration   1: 10.369 ms/op
Iteration   2: 9.829 ms/op
Iteration   3: 9.766 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  9.953 ±(99.9%) 0.759 ms/op [Average]
  (min, avg, max) = (9.680, 9.953, 10.369), stdev = 0.271
  CI (99.9%): [9.193, 10.712] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2265.263 ms/op
# Warmup Iteration   2: 613.745 ms/op
Iteration   1: 376.857 ms/op
Iteration   2: 348.270 ms/op
Iteration   3: 354.732 ms/op

# Run progress: 23.91% complete, ETA 00:06:52
# Fork: 2 of 2
# Warmup Iteration   1: 2167.277 ms/op
# Warmup Iteration   2: 633.744 ms/op
Iteration   1: 566.901 ms/op
Iteration   2: 407.576 ms/op
Iteration   3: 348.410 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  400.458 ±(99.9%) 237.395 ms/op [Average]
  (min, avg, max) = (348.270, 400.458, 566.901), stdev = 84.657
  CI (99.9%): [163.063, 637.853] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:39
# Fork: 1 of 2
# Warmup Iteration   1: 2424.031 ms/op
# Warmup Iteration   2: 838.608 ms/op
Iteration   1: 540.720 ms/op
Iteration   2: 483.050 ms/op
Iteration   3: 487.041 ms/op

# Run progress: 28.26% complete, ETA 00:06:28
# Fork: 2 of 2
# Warmup Iteration   1: 2418.820 ms/op
# Warmup Iteration   2: 894.138 ms/op
Iteration   1: 612.875 ms/op
Iteration   2: 502.633 ms/op
Iteration   3: 474.045 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  516.727 ±(99.9%) 147.618 ms/op [Average]
  (min, avg, max) = (474.045, 516.727, 612.875), stdev = 52.642
  CI (99.9%): [369.109, 664.346] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:17
# Fork: 1 of 2
# Warmup Iteration   1: 1199.394 ms/op
# Warmup Iteration   2: 443.692 ms/op
Iteration   1: 412.082 ms/op
Iteration   2: 398.199 ms/op
Iteration   3: 399.035 ms/op

# Run progress: 32.61% complete, ETA 00:06:05
# Fork: 2 of 2
# Warmup Iteration   1: 1156.819 ms/op
# Warmup Iteration   2: 445.506 ms/op
Iteration   1: 408.761 ms/op
Iteration   2: 400.617 ms/op
Iteration   3: 398.005 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  402.783 ±(99.9%) 17.047 ms/op [Average]
  (min, avg, max) = (398.005, 402.783, 412.082), stdev = 6.079
  CI (99.9%): [385.736, 419.831] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2576.288 ms/op
# Warmup Iteration   2: 1054.552 ms/op
Iteration   1: 1036.073 ms/op
Iteration   2: 918.744 ms/op
Iteration   3: 915.830 ms/op

# Run progress: 36.96% complete, ETA 00:05:42
# Fork: 2 of 2
# Warmup Iteration   1: 2442.657 ms/op
# Warmup Iteration   2: 1025.239 ms/op
Iteration   1: 1034.277 ms/op
Iteration   2: 927.745 ms/op
Iteration   3: 915.739 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  958.068 ±(99.9%) 167.943 ms/op [Average]
  (min, avg, max) = (915.739, 958.068, 1036.073), stdev = 59.890
  CI (99.9%): [790.125, 1126.011] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:31
# Fork: 1 of 2
# Warmup Iteration   1: 0.191 ms/op
# Warmup Iteration   2: 0.082 ms/op
Iteration   1: 0.083 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.080 ms/op

# Run progress: 41.30% complete, ETA 00:05:17
# Fork: 2 of 2
# Warmup Iteration   1: 0.186 ms/op
# Warmup Iteration   2: 0.083 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.081 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.081 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.080, 0.081, 0.083), stdev = 0.001
  CI (99.9%): [0.077, 0.084] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:03
# Fork: 1 of 2
# Warmup Iteration   1: 10.009 ms/op
# Warmup Iteration   2: 6.445 ms/op
Iteration   1: 6.227 ms/op
Iteration   2: 6.177 ms/op
Iteration   3: 6.143 ms/op

# Run progress: 45.65% complete, ETA 00:04:50
# Fork: 2 of 2
# Warmup Iteration   1: 10.184 ms/op
# Warmup Iteration   2: 6.291 ms/op
Iteration   1: 6.145 ms/op
Iteration   2: 6.132 ms/op
Iteration   3: 6.113 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.156 ±(99.9%) 0.114 ms/op [Average]
  (min, avg, max) = (6.113, 6.156, 6.227), stdev = 0.041
  CI (99.9%): [6.043, 6.270] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:37
# Fork: 1 of 2
# Warmup Iteration   1: 0.822 ms/op
# Warmup Iteration   2: 0.466 ms/op
Iteration   1: 0.460 ms/op
Iteration   2: 0.460 ms/op
Iteration   3: 0.461 ms/op

# Run progress: 50.00% complete, ETA 00:04:24
# Fork: 2 of 2
# Warmup Iteration   1: 0.819 ms/op
# Warmup Iteration   2: 0.468 ms/op
Iteration   1: 0.462 ms/op
Iteration   2: 0.459 ms/op
Iteration   3: 0.459 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.460 ±(99.9%) 0.003 ms/op [Average]
  (min, avg, max) = (0.459, 0.460, 0.462), stdev = 0.001
  CI (99.9%): [0.457, 0.463] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:11
# Fork: 1 of 2
# Warmup Iteration   1: 2.055 ms/op
# Warmup Iteration   2: 1.319 ms/op
Iteration   1: 1.200 ms/op
Iteration   2: 1.194 ms/op
Iteration   3: 1.190 ms/op

# Run progress: 54.35% complete, ETA 00:03:59
# Fork: 2 of 2
# Warmup Iteration   1: 1.930 ms/op
# Warmup Iteration   2: 1.300 ms/op
Iteration   1: 1.212 ms/op
Iteration   2: 1.240 ms/op
Iteration   3: 1.191 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.205 ±(99.9%) 0.053 ms/op [Average]
  (min, avg, max) = (1.190, 1.205, 1.240), stdev = 0.019
  CI (99.9%): [1.151, 1.258] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 200.314 ms/op
# Warmup Iteration   2: 47.116 ms/op
Iteration   1: 29.986 ms/op
Iteration   2: 27.956 ms/op
Iteration   3: 25.009 ms/op

# Run progress: 58.70% complete, ETA 00:03:35
# Fork: 2 of 2
# Warmup Iteration   1: 223.095 ms/op
# Warmup Iteration   2: 40.935 ms/op
Iteration   1: 28.647 ms/op
Iteration   2: 27.612 ms/op
Iteration   3: 25.429 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  27.440 ±(99.9%) 5.348 ms/op [Average]
  (min, avg, max) = (25.009, 27.440, 29.986), stdev = 1.907
  CI (99.9%): [22.092, 32.788] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 72436.849 ms/op
# Warmup Iteration   2: 67164.091 ms/op
Iteration   1: 65451.123 ms/op
Iteration   2: 65085.332 ms/op
Iteration   3: 65058.042 ms/op

# Run progress: 63.04% complete, ETA 00:06:22
# Fork: 2 of 2
# Warmup Iteration   1: 72336.990 ms/op
# Warmup Iteration   2: 67006.456 ms/op
Iteration   1: 66170.005 ms/op
Iteration   2: 66244.304 ms/op
Iteration   3: 66232.115 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  65706.820 ±(99.9%) 1611.812 ms/op [Average]
  (min, avg, max) = (65058.042, 65706.820, 66244.304), stdev = 574.788
  CI (99.9%): [64095.008, 67318.632] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:08:49
# Fork: 1 of 2
# Warmup Iteration   1: 13733.424 ms/op
# Warmup Iteration   2: 9800.004 ms/op
Iteration   1: 7541.234 ms/op
Iteration   2: 5611.691 ms/op
Iteration   3: 7935.419 ms/op

# Run progress: 67.39% complete, ETA 00:10:18
# Fork: 2 of 2
# Warmup Iteration   1: 13482.996 ms/op
# Warmup Iteration   2: 10234.421 ms/op
Iteration   1: 7526.150 ms/op
Iteration   2: 5649.672 ms/op
Iteration   3: 8103.668 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  7061.306 ±(99.9%) 3170.368 ms/op [Average]
  (min, avg, max) = (5611.691, 7061.306, 8103.668), stdev = 1130.584
  CI (99.9%): [3890.938, 10231.673] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:11:24
# Fork: 1 of 2
# Warmup Iteration   1: 11580.373 ms/op
# Warmup Iteration   2: 7601.559 ms/op
Iteration   1: 7414.406 ms/op
Iteration   2: 6403.012 ms/op
Iteration   3: 6097.690 ms/op

# Run progress: 71.74% complete, ETA 00:10:32
# Fork: 2 of 2
# Warmup Iteration   1: 12251.811 ms/op
# Warmup Iteration   2: 8076.600 ms/op
Iteration   1: 7130.454 ms/op
Iteration   2: 6384.651 ms/op
Iteration   3: 6053.037 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6580.541 ±(99.9%) 1575.858 ms/op [Average]
  (min, avg, max) = (6053.037, 6580.541, 7414.406), stdev = 561.966
  CI (99.9%): [5004.683, 8156.400] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:09:40
# Fork: 1 of 2
# Warmup Iteration   1: Oct 31, 2026 12:13:27 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 31, 2026 12:13:27 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
111.874 ms/op
# Warmup Iteration   2: 49.171 ms/op
Iteration   1: 50.764 ms/op
Iteration   2: 49.750 ms/op
Iteration   3: 48.329 ms/op

# Run progress: 76.09% complete, ETA 00:08:40
# Fork: 2 of 2
# Warmup Iteration   1: Oct 31, 2026 12:13:39 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 31, 2026 12:13:39 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
92.419 ms/op
# Warmup Iteration   2: 45.715 ms/op
Iteration   1: 45.213 ms/op
Iteration   2: 43.992 ms/op
Iteration   3: 44.612 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  47.110 ±(99.9%) 8.065 ms/op [Average]
  (min, avg, max) = (43.992, 47.110, 50.764), stdev = 2.876
  CI (99.9%): [39.044, 55.175] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:07:43
# Fork: 1 of 2
# Warmup Iteration   1: 109.025 ms/op
# Warmup Iteration   2: 61.612 ms/op
Iteration   1: 58.563 ms/op
Iteration   2: 58.827 ms/op
Iteration   3: 60.324 ms/op

# Run progress: 80.43% complete, ETA 00:06:48
# Fork: 2 of 2
# Warmup Iteration   1: 128.508 ms/op
# Warmup Iteration   2: 68.057 ms/op
Iteration   1: 60.571 ms/op
Iteration   2: 60.352 ms/op
Iteration   3: 61.091 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  59.955 ±(99.9%) 2.853 ms/op [Average]
  (min, avg, max) = (58.563, 59.955, 61.091), stdev = 1.017
  CI (99.9%): [57.102, 62.807] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:05:55
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:05
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

# Run progress: 86.96% complete, ETA 00:04:17
# Fork: 1 of 2
# Warmup Iteration   1: 29.479 ms/op
# Warmup Iteration   2: 18.213 ms/op
Iteration   1: 14.677 ms/op
Iteration   2: 15.066 ms/op
Iteration   3: 15.341 ms/op

# Run progress: 89.13% complete, ETA 00:03:30
# Fork: 2 of 2
# Warmup Iteration   1: 25.729 ms/op
# Warmup Iteration   2: 15.076 ms/op
Iteration   1: 13.340 ms/op
Iteration   2: 14.231 ms/op
Iteration   3: 13.393 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  14.341 ±(99.9%) 2.363 ms/op [Average]
  (min, avg, max) = (13.340, 14.341, 15.341), stdev = 0.843
  CI (99.9%): [11.979, 16.704] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:45
# Fork: 1 of 2
# Warmup Iteration   1: 20.934 ms/op
# Warmup Iteration   2: 13.853 ms/op
Iteration   1: 11.992 ms/op
Iteration   2: 12.125 ms/op
Iteration   3: 11.136 ms/op

# Run progress: 93.48% complete, ETA 00:02:02
# Fork: 2 of 2
# Warmup Iteration   1: 21.194 ms/op
# Warmup Iteration   2: 15.356 ms/op
Iteration   1: 12.099 ms/op
Iteration   2: 12.005 ms/op
Iteration   3: 11.171 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  11.755 ±(99.9%) 1.315 ms/op [Average]
  (min, avg, max) = (11.136, 11.755, 12.125), stdev = 0.469
  CI (99.9%): [10.440, 13.069] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:20
# Fork: 1 of 2
# Warmup Iteration   1: 26.929 ms/op
# Warmup Iteration   2: 20.176 ms/op
Iteration   1: 20.144 ms/op
Iteration   2: 20.168 ms/op
Iteration   3: 20.462 ms/op

# Run progress: 97.83% complete, ETA 00:00:39
# Fork: 2 of 2
# Warmup Iteration   1: 26.118 ms/op
# Warmup Iteration   2: 20.786 ms/op
Iteration   1: 20.329 ms/op
Iteration   2: 20.233 ms/op
Iteration   3: 20.212 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  20.258 ±(99.9%) 0.333 ms/op [Average]
  (min, avg, max) = (20.144, 20.258, 20.462), stdev = 0.119
  CI (99.9%): [19.924, 20.591] (assumes normal distribution)


# Run complete. Total time: 00:29:43

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     16.570 ±    0.357  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.195 ±    0.074  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      5.575 ±    0.358  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      5.577 ±    0.104  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      9.953 ±    0.759  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    400.458 ±  237.395  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    516.727 ±  147.618  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    402.783 ±   17.047  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    958.068 ±  167.943  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.081 ±    0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.156 ±    0.114  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.460 ±    0.003  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.205 ±    0.053  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     27.440 ±    5.348  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  65706.820 ± 1611.812  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   7061.306 ± 3170.368  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6580.541 ± 1575.858  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     47.110 ±    8.065  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     59.955 ±    2.853  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     14.341 ±    2.363  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     11.755 ±    1.315  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     20.258 ±    0.333  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.17.0 -> 3.18.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 14 lower, 9 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 0.535424 | 14.3414 | +2578.51% | Separate CIs |
| flash.TPflash_UMR.testFlash_UMR | 4655.52 | 516.727 | -88.90% | Separate CIs |
| process.TEGprocess.testTEGprocess | 13463.8 | 6580.54 | -51.12% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 10401.4 | 7061.31 | -32.11% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 23.1784 | 20.2578 | -12.60% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 11.1383 | 11.7549 | +5.54% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 57.0525 | 59.9545 | +5.09% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 68417.1 | 65706.8 | -3.96% | Separate CIs |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 16.8065 | 16.5702 | -1.41% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 27.0825 | 27.4397 | +1.32% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
