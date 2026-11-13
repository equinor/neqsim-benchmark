# NeqSim 3.23.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.22.0 |
| Current | 3.23.0 |
| Source commit | `3187e92db438a7c236453bf22eabb24734f8768f` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43397468304) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "3187e92db438a7c236453bf22eabb24734f8768f",
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
BogoMIPS:                                5192.31
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
[INFO] Total time:  7.694 s
[INFO] Finished at: 2026-11-13T08:59:01Z
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
TEG full process: 8541 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.578 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.262 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.148 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 374380 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 28 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    7.18e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.84e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     8.26e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.84e-03 after 28 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 374.4 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (7 ms)
tpFlashWellFluidSrk                                            83.6406  (54 ms)
tpFlashWellFluidPr                                             83.6541  (47 ms)
tpFlashWellFluidWithProperties                                 5445.46  (57 ms)
phAndPsFlashWellFluid                                          2459.23  (105 ms)
Nov 13, 2026 9:05:35 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 9:05:35 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (425 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (209 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (111 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (44 ms)
saturationPointsWellFluid                                      1601.32  (130 ms)
singlePhaseGasPipelineSteadyState                              121.628  (663 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1321 ms)
levenbergMarquardtAntoine                                      1837.31  (6 ms)
levenbergMarquardtDoubleExponential                            5.57177  (4 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (8 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.618 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Finished at: 2026-11-13T09:05:46Z
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
# Warmup Iteration   1: 22.681 ms/op
# Warmup Iteration   2: 19.131 ms/op
Iteration   1: 18.955 ms/op
Iteration   2: 19.065 ms/op
Iteration   3: 18.972 ms/op

# Run progress: 2.17% complete, ETA 00:08:31
# Fork: 2 of 2
# Warmup Iteration   1: 22.298 ms/op
# Warmup Iteration   2: 18.470 ms/op
Iteration   1: 18.459 ms/op
Iteration   2: 18.370 ms/op
Iteration   3: 18.270 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  18.682 ±(99.9%) 0.989 ms/op [Average]
  (min, avg, max) = (18.270, 18.682, 19.065), stdev = 0.353
  CI (99.9%): [17.693, 19.671] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:19
# Fork: 1 of 2
# Warmup Iteration   1: 1.782 ms/op
# Warmup Iteration   2: 1.248 ms/op
Iteration   1: 1.188 ms/op
Iteration   2: 1.178 ms/op
Iteration   3: 1.180 ms/op

# Run progress: 6.52% complete, ETA 00:08:07
# Fork: 2 of 2
# Warmup Iteration   1: 2.099 ms/op
# Warmup Iteration   2: 1.217 ms/op
Iteration   1: 1.210 ms/op
Iteration   2: 1.194 ms/op
Iteration   3: 1.182 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.189 ±(99.9%) 0.034 ms/op [Average]
  (min, avg, max) = (1.178, 1.189, 1.210), stdev = 0.012
  CI (99.9%): [1.155, 1.223] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 8.036 ms/op
# Warmup Iteration   2: 6.105 ms/op
Iteration   1: 6.004 ms/op
Iteration   2: 6.015 ms/op
Iteration   3: 5.977 ms/op

# Run progress: 10.87% complete, ETA 00:07:45
# Fork: 2 of 2
# Warmup Iteration   1: 9.017 ms/op
# Warmup Iteration   2: 6.015 ms/op
Iteration   1: 6.018 ms/op
Iteration   2: 6.021 ms/op
Iteration   3: 5.974 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.002 ±(99.9%) 0.059 ms/op [Average]
  (min, avg, max) = (5.974, 6.002, 6.021), stdev = 0.021
  CI (99.9%): [5.943, 6.060] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 9.534 ms/op
# Warmup Iteration   2: 6.457 ms/op
Iteration   1: 6.497 ms/op
Iteration   2: 6.428 ms/op
Iteration   3: 6.418 ms/op

# Run progress: 15.22% complete, ETA 00:07:22
# Fork: 2 of 2
# Warmup Iteration   1: 8.903 ms/op
# Warmup Iteration   2: 6.407 ms/op
Iteration   1: 6.476 ms/op
Iteration   2: 6.493 ms/op
Iteration   3: 6.401 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.452 ±(99.9%) 0.116 ms/op [Average]
  (min, avg, max) = (6.401, 6.452, 6.497), stdev = 0.041
  CI (99.9%): [6.336, 6.568] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 15.281 ms/op
# Warmup Iteration   2: 10.917 ms/op
Iteration   1: 10.775 ms/op
Iteration   2: 10.688 ms/op
Iteration   3: 10.640 ms/op

# Run progress: 19.57% complete, ETA 00:06:59
# Fork: 2 of 2
# Warmup Iteration   1: 14.867 ms/op
# Warmup Iteration   2: 10.878 ms/op
Iteration   1: 10.733 ms/op
Iteration   2: 10.641 ms/op
Iteration   3: 10.676 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.692 ±(99.9%) 0.149 ms/op [Average]
  (min, avg, max) = (10.640, 10.692, 10.775), stdev = 0.053
  CI (99.9%): [10.543, 10.841] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1117.078 ms/op
# Warmup Iteration   2: 369.315 ms/op
Iteration   1: 340.746 ms/op
Iteration   2: 324.126 ms/op
Iteration   3: 319.779 ms/op

# Run progress: 23.91% complete, ETA 00:06:36
# Fork: 2 of 2
# Warmup Iteration   1: 778.559 ms/op
# Warmup Iteration   2: 360.659 ms/op
Iteration   1: 336.843 ms/op
Iteration   2: 323.800 ms/op
Iteration   3: 322.622 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  327.986 ±(99.9%) 24.117 ms/op [Average]
  (min, avg, max) = (319.779, 327.986, 340.746), stdev = 8.600
  CI (99.9%): [303.869, 352.102] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:25
# Fork: 1 of 2
# Warmup Iteration   1: 1187.030 ms/op
# Warmup Iteration   2: 410.016 ms/op
Iteration   1: 401.551 ms/op
Iteration   2: 378.010 ms/op
Iteration   3: 375.621 ms/op

# Run progress: 28.26% complete, ETA 00:06:13
# Fork: 2 of 2
# Warmup Iteration   1: 1259.142 ms/op
# Warmup Iteration   2: 528.760 ms/op
Iteration   1: 421.423 ms/op
Iteration   2: 381.783 ms/op
Iteration   3: 375.468 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  388.976 ±(99.9%) 52.368 ms/op [Average]
  (min, avg, max) = (375.468, 388.976, 421.423), stdev = 18.675
  CI (99.9%): [336.608, 441.344] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:02
# Fork: 1 of 2
# Warmup Iteration   1: 717.368 ms/op
# Warmup Iteration   2: 407.094 ms/op
Iteration   1: 402.632 ms/op
Iteration   2: 396.221 ms/op
Iteration   3: 393.933 ms/op

# Run progress: 32.61% complete, ETA 00:05:50
# Fork: 2 of 2
# Warmup Iteration   1: 750.337 ms/op
# Warmup Iteration   2: 403.144 ms/op
Iteration   1: 401.114 ms/op
Iteration   2: 396.572 ms/op
Iteration   3: 389.328 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  396.633 ±(99.9%) 13.559 ms/op [Average]
  (min, avg, max) = (389.328, 396.633, 402.632), stdev = 4.835
  CI (99.9%): [383.075, 410.192] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1448.206 ms/op
# Warmup Iteration   2: 903.596 ms/op
Iteration   1: 892.741 ms/op
Iteration   2: 891.215 ms/op
Iteration   3: 889.397 ms/op

# Run progress: 36.96% complete, ETA 00:05:32
# Fork: 2 of 2
# Warmup Iteration   1: 1447.498 ms/op
# Warmup Iteration   2: 910.855 ms/op
Iteration   1: 893.394 ms/op
Iteration   2: 890.393 ms/op
Iteration   3: 884.999 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  890.356 ±(99.9%) 8.437 ms/op [Average]
  (min, avg, max) = (884.999, 890.356, 893.394), stdev = 3.009
  CI (99.9%): [881.919, 898.794] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.105 ms/op
# Warmup Iteration   2: 0.079 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:11
# Fork: 2 of 2
# Warmup Iteration   1: 0.113 ms/op
# Warmup Iteration   2: 0.080 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.080 ms/op
Iteration   3: 0.080 ms/op


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

# Run progress: 43.48% complete, ETA 00:04:57
# Fork: 1 of 2
# Warmup Iteration   1: 7.743 ms/op
# Warmup Iteration   2: 6.174 ms/op
Iteration   1: 6.142 ms/op
Iteration   2: 6.136 ms/op
Iteration   3: 6.122 ms/op

# Run progress: 45.65% complete, ETA 00:04:44
# Fork: 2 of 2
# Warmup Iteration   1: 7.794 ms/op
# Warmup Iteration   2: 6.176 ms/op
Iteration   1: 6.129 ms/op
Iteration   2: 6.122 ms/op
Iteration   3: 6.140 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.132 ±(99.9%) 0.025 ms/op [Average]
  (min, avg, max) = (6.122, 6.132, 6.142), stdev = 0.009
  CI (99.9%): [6.106, 6.157] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 0.633 ms/op
# Warmup Iteration   2: 0.469 ms/op
Iteration   1: 0.465 ms/op
Iteration   2: 0.467 ms/op
Iteration   3: 0.470 ms/op

# Run progress: 50.00% complete, ETA 00:04:19
# Fork: 2 of 2
# Warmup Iteration   1: 0.652 ms/op
# Warmup Iteration   2: 0.472 ms/op
Iteration   1: 0.474 ms/op
Iteration   2: 0.474 ms/op
Iteration   3: 0.475 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.471 ±(99.9%) 0.012 ms/op [Average]
  (min, avg, max) = (0.465, 0.471, 0.475), stdev = 0.004
  CI (99.9%): [0.459, 0.483] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.636 ms/op
# Warmup Iteration   2: 1.208 ms/op
Iteration   1: 1.197 ms/op
Iteration   2: 1.190 ms/op
Iteration   3: 1.190 ms/op

# Run progress: 54.35% complete, ETA 00:03:55
# Fork: 2 of 2
# Warmup Iteration   1: 1.587 ms/op
# Warmup Iteration   2: 1.208 ms/op
Iteration   1: 1.195 ms/op
Iteration   2: 1.192 ms/op
Iteration   3: 1.193 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.193 ±(99.9%) 0.007 ms/op [Average]
  (min, avg, max) = (1.190, 1.193, 1.197), stdev = 0.003
  CI (99.9%): [1.185, 1.200] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 77.127 ms/op
# Warmup Iteration   2: 27.941 ms/op
Iteration   1: 22.375 ms/op
Iteration   2: 13.761 ms/op
Iteration   3: 12.180 ms/op

# Run progress: 58.70% complete, ETA 00:03:31
# Fork: 2 of 2
# Warmup Iteration   1: 80.075 ms/op
# Warmup Iteration   2: 28.374 ms/op
Iteration   1: 25.116 ms/op
Iteration   2: 16.092 ms/op
Iteration   3: 12.673 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  17.033 ±(99.9%) 15.258 ms/op [Average]
  (min, avg, max) = (12.180, 17.033, 25.116), stdev = 5.441
  CI (99.9%): [1.775, 32.291] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 75830.256 ms/op
# Warmup Iteration   2: 71899.855 ms/op
Iteration   1: 70849.483 ms/op
Iteration   2: 71087.216 ms/op
Iteration   3: 71167.864 ms/op

# Run progress: 63.04% complete, ETA 00:06:34
# Fork: 2 of 2
# Warmup Iteration   1: 75533.648 ms/op
# Warmup Iteration   2: 71278.946 ms/op
Iteration   1: 70784.004 ms/op
Iteration   2: 70575.041 ms/op
Iteration   3: 70618.627 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  70847.039 ±(99.9%) 676.207 ms/op [Average]
  (min, avg, max) = (70575.041, 70847.039, 71167.864), stdev = 241.142
  CI (99.9%): [70170.832, 71523.247] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 23428.989 ms/op
# Warmup Iteration   2: 13656.590 ms/op
Iteration   1: 20965.514 ms/op
Iteration   2: 19804.379 ms/op
Iteration   3: 17412.427 ms/op

# Run progress: 67.39% complete, ETA 00:11:16
# Fork: 2 of 2
# Warmup Iteration   1: 23147.958 ms/op
# Warmup Iteration   2: 13927.989 ms/op
Iteration   1: 20832.383 ms/op
Iteration   2: 20020.781 ms/op
Iteration   3: 17181.835 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  19369.553 ±(99.9%) 4678.302 ms/op [Average]
  (min, avg, max) = (17181.835, 19369.553, 20965.514), stdev = 1668.328
  CI (99.9%): [14691.251, 24047.856] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:12:49
# Fork: 1 of 2
# Warmup Iteration   1: 8236.934 ms/op
# Warmup Iteration   2: 6516.367 ms/op
Iteration   1: 6237.175 ms/op
Iteration   2: 6182.244 ms/op
Iteration   3: 6137.732 ms/op

# Run progress: 71.74% complete, ETA 00:11:46
# Fork: 2 of 2
# Warmup Iteration   1: 8145.141 ms/op
# Warmup Iteration   2: 6500.754 ms/op
Iteration   1: 6333.196 ms/op
Iteration   2: 6204.286 ms/op
Iteration   3: 6631.850 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6287.747 ±(99.9%) 507.289 ms/op [Average]
  (min, avg, max) = (6137.732, 6287.747, 6631.850), stdev = 180.904
  CI (99.9%): [5780.459, 6795.036] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:10:44
# Fork: 1 of 2
# Warmup Iteration   1: Nov 13, 2026 9:36:14 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 9:36:14 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
61.824 ms/op
# Warmup Iteration   2: 45.705 ms/op
Iteration   1: 43.771 ms/op
Iteration   2: 43.711 ms/op
Iteration   3: 43.698 ms/op

# Run progress: 76.09% complete, ETA 00:09:37
# Fork: 2 of 2
# Warmup Iteration   1: Nov 13, 2026 9:36:25 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 9:36:26 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
58.290 ms/op
# Warmup Iteration   2: 45.750 ms/op
Iteration   1: 44.377 ms/op
Iteration   2: 44.194 ms/op
Iteration   3: 44.355 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  44.018 ±(99.9%) 0.913 ms/op [Average]
  (min, avg, max) = (43.698, 44.018, 44.377), stdev = 0.326
  CI (99.9%): [43.104, 44.931] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:08:33
# Fork: 1 of 2
# Warmup Iteration   1: 54.566 ms/op
# Warmup Iteration   2: 50.381 ms/op
Iteration   1: 50.114 ms/op
Iteration   2: 49.898 ms/op
Iteration   3: 49.612 ms/op

# Run progress: 80.43% complete, ETA 00:07:32
# Fork: 2 of 2
# Warmup Iteration   1: 61.193 ms/op
# Warmup Iteration   2: 50.551 ms/op
Iteration   1: 49.971 ms/op
Iteration   2: 49.699 ms/op
Iteration   3: 49.420 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  49.786 ±(99.9%) 0.717 ms/op [Average]
  (min, avg, max) = (49.420, 49.786, 50.114), stdev = 0.256
  CI (99.9%): [49.069, 50.502] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:06:33
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:37
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

# Run progress: 86.96% complete, ETA 00:04:43
# Fork: 1 of 2
# Warmup Iteration   1: 32.634 ms/op
# Warmup Iteration   2: 25.441 ms/op
Iteration   1: 25.142 ms/op
Iteration   2: 24.881 ms/op
Iteration   3: 24.871 ms/op

# Run progress: 89.13% complete, ETA 00:03:52
# Fork: 2 of 2
# Warmup Iteration   1: 31.130 ms/op
# Warmup Iteration   2: 25.404 ms/op
Iteration   1: 24.977 ms/op
Iteration   2: 24.779 ms/op
Iteration   3: 24.782 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  24.905 ±(99.9%) 0.385 ms/op [Average]
  (min, avg, max) = (24.779, 24.905, 25.142), stdev = 0.137
  CI (99.9%): [24.520, 25.290] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:02
# Fork: 1 of 2
# Warmup Iteration   1: 12.178 ms/op
# Warmup Iteration   2: 9.540 ms/op
Iteration   1: 9.382 ms/op
Iteration   2: 9.294 ms/op
Iteration   3: 9.354 ms/op

# Run progress: 93.48% complete, ETA 00:02:14
# Fork: 2 of 2
# Warmup Iteration   1: 12.139 ms/op
# Warmup Iteration   2: 9.550 ms/op
Iteration   1: 9.727 ms/op
Iteration   2: 9.455 ms/op
Iteration   3: 9.540 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.458 ±(99.9%) 0.439 ms/op [Average]
  (min, avg, max) = (9.294, 9.458, 9.727), stdev = 0.157
  CI (99.9%): [9.019, 9.898] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:28
# Fork: 1 of 2
# Warmup Iteration   1: 23.029 ms/op
# Warmup Iteration   2: 20.086 ms/op
Iteration   1: 20.050 ms/op
Iteration   2: 20.041 ms/op
Iteration   3: 20.181 ms/op

# Run progress: 97.83% complete, ETA 00:00:43
# Fork: 2 of 2
# Warmup Iteration   1: 23.280 ms/op
# Warmup Iteration   2: 20.472 ms/op
Iteration   1: 20.428 ms/op
Iteration   2: 20.471 ms/op
Iteration   3: 20.389 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  20.260 ±(99.9%) 0.543 ms/op [Average]
  (min, avg, max) = (20.041, 20.260, 20.471), stdev = 0.194
  CI (99.9%): [19.717, 20.804] (assumes normal distribution)


# Run complete. Total time: 00:32:40

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     18.682 ±    0.989  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.189 ±    0.034  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.002 ±    0.059  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.452 ±    0.116  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.692 ±    0.149  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    327.986 ±   24.117  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    388.976 ±   52.368  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    396.633 ±   13.559  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    890.356 ±    8.437  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.079 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.132 ±    0.025  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.471 ±    0.012  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.193 ±    0.007  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     17.033 ±   15.258  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  70847.039 ±  676.207  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  19369.553 ± 4678.302  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6287.747 ±  507.289  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     44.018 ±    0.913  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     49.786 ±    0.717  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     24.905 ±    0.385  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.458 ±    0.439  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     20.260 ±    0.543  ms/op

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
[INFO] Total time:  1.803 s
[INFO] Finished at: 2026-11-13T09:38:30Z
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
TEG full process: 8299 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.336 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.326 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.063 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 373181 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 29 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    6.72e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.84e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     7.78e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 373.2 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (7 ms)
tpFlashWellFluidSrk                                            83.6406  (68 ms)
tpFlashWellFluidPr                                             83.6541  (66 ms)
tpFlashWellFluidWithProperties                                 5445.46  (73 ms)
phAndPsFlashWellFluid                                          2459.23  (125 ms)
Nov 13, 2026 9:45:01 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 9:45:01 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (421 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (242 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (154 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (52 ms)
saturationPointsWellFluid                                      1601.32  (128 ms)
singlePhaseGasPipelineSteadyState                              121.628  (700 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1332 ms)
levenbergMarquardtAntoine                                      1837.31  (6 ms)
levenbergMarquardtDoubleExponential                            5.57177  (4 ms)
dataReconciliation[20]                                         7.89841  (3 ms)
dataReconciliation[100]                                        37.0132  (37 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.078 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  06:39 min
[INFO] Finished at: 2026-11-13T09:45:11Z
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
# Warmup Iteration   1: 23.268 ms/op
# Warmup Iteration   2: 19.168 ms/op
Iteration   1: 19.078 ms/op
Iteration   2: 18.990 ms/op
Iteration   3: 18.934 ms/op

# Run progress: 2.17% complete, ETA 00:08:47
# Fork: 2 of 2
# Warmup Iteration   1: 21.911 ms/op
# Warmup Iteration   2: 18.906 ms/op
Iteration   1: 19.102 ms/op
Iteration   2: 18.815 ms/op
Iteration   3: 18.807 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  18.954 ±(99.9%) 0.356 ms/op [Average]
  (min, avg, max) = (18.807, 18.954, 19.102), stdev = 0.127
  CI (99.9%): [18.599, 19.310] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.658 ms/op
# Warmup Iteration   2: 1.231 ms/op
Iteration   1: 1.179 ms/op
Iteration   2: 1.177 ms/op
Iteration   3: 1.177 ms/op

# Run progress: 6.52% complete, ETA 00:08:19
# Fork: 2 of 2
# Warmup Iteration   1: 1.768 ms/op
# Warmup Iteration   2: 1.236 ms/op
Iteration   1: 1.186 ms/op
Iteration   2: 1.177 ms/op
Iteration   3: 1.178 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.179 ±(99.9%) 0.010 ms/op [Average]
  (min, avg, max) = (1.177, 1.179, 1.186), stdev = 0.004
  CI (99.9%): [1.169, 1.189] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 7.954 ms/op
# Warmup Iteration   2: 6.040 ms/op
Iteration   1: 5.975 ms/op
Iteration   2: 5.978 ms/op
Iteration   3: 5.979 ms/op

# Run progress: 10.87% complete, ETA 00:07:56
# Fork: 2 of 2
# Warmup Iteration   1: 8.102 ms/op
# Warmup Iteration   2: 6.052 ms/op
Iteration   1: 5.960 ms/op
Iteration   2: 5.940 ms/op
Iteration   3: 5.971 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  5.967 ±(99.9%) 0.042 ms/op [Average]
  (min, avg, max) = (5.940, 5.967, 5.979), stdev = 0.015
  CI (99.9%): [5.925, 6.009] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 8.185 ms/op
# Warmup Iteration   2: 6.476 ms/op
Iteration   1: 6.412 ms/op
Iteration   2: 6.414 ms/op
Iteration   3: 6.374 ms/op

# Run progress: 15.22% complete, ETA 00:07:31
# Fork: 2 of 2
# Warmup Iteration   1: 9.482 ms/op
# Warmup Iteration   2: 6.505 ms/op
Iteration   1: 6.448 ms/op
Iteration   2: 6.496 ms/op
Iteration   3: 6.476 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.437 ±(99.9%) 0.127 ms/op [Average]
  (min, avg, max) = (6.374, 6.437, 6.496), stdev = 0.045
  CI (99.9%): [6.310, 6.564] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 19.097 ms/op
# Warmup Iteration   2: 10.872 ms/op
Iteration   1: 10.718 ms/op
Iteration   2: 10.666 ms/op
Iteration   3: 10.700 ms/op

# Run progress: 19.57% complete, ETA 00:07:08
# Fork: 2 of 2
# Warmup Iteration   1: 19.274 ms/op
# Warmup Iteration   2: 10.828 ms/op
Iteration   1: 10.730 ms/op
Iteration   2: 10.716 ms/op
Iteration   3: 10.693 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  10.704 ±(99.9%) 0.063 ms/op [Average]
  (min, avg, max) = (10.666, 10.704, 10.730), stdev = 0.023
  CI (99.9%): [10.640, 10.767] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1013.257 ms/op
# Warmup Iteration   2: 445.342 ms/op
Iteration   1: 347.790 ms/op
Iteration   2: 342.420 ms/op
Iteration   3: 332.033 ms/op

# Run progress: 23.91% complete, ETA 00:06:43
# Fork: 2 of 2
# Warmup Iteration   1: 1159.119 ms/op
# Warmup Iteration   2: 371.951 ms/op
Iteration   1: 343.660 ms/op
Iteration   2: 338.613 ms/op
Iteration   3: 343.974 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  341.415 ±(99.9%) 15.313 ms/op [Average]
  (min, avg, max) = (332.033, 341.415, 347.790), stdev = 5.461
  CI (99.9%): [326.102, 356.728] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 3309.347 ms/op
# Warmup Iteration   2: 1928.074 ms/op
Iteration   1: 1818.164 ms/op
Iteration   2: 1764.971 ms/op
Iteration   3: 1814.869 ms/op

# Run progress: 28.26% complete, ETA 00:06:36
# Fork: 2 of 2
# Warmup Iteration   1: 3741.755 ms/op
# Warmup Iteration   2: 1986.874 ms/op
Iteration   1: 1803.536 ms/op
Iteration   2: 1770.690 ms/op
Iteration   3: 1778.900 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  1791.855 ±(99.9%) 65.126 ms/op [Average]
  (min, avg, max) = (1764.971, 1791.855, 1818.164), stdev = 23.224
  CI (99.9%): [1726.729, 1856.980] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:39
# Fork: 1 of 2
# Warmup Iteration   1: 760.642 ms/op
# Warmup Iteration   2: 404.150 ms/op
Iteration   1: 401.300 ms/op
Iteration   2: 403.710 ms/op
Iteration   3: 394.237 ms/op

# Run progress: 32.61% complete, ETA 00:06:23
# Fork: 2 of 2
# Warmup Iteration   1: 762.510 ms/op
# Warmup Iteration   2: 408.434 ms/op
Iteration   1: 401.211 ms/op
Iteration   2: 394.888 ms/op
Iteration   3: 395.388 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  398.456 ±(99.9%) 11.441 ms/op [Average]
  (min, avg, max) = (394.237, 398.456, 403.710), stdev = 4.080
  CI (99.9%): [387.015, 409.896] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:09
# Fork: 1 of 2
# Warmup Iteration   1: 1428.136 ms/op
# Warmup Iteration   2: 929.794 ms/op
Iteration   1: 896.451 ms/op
Iteration   2: 890.770 ms/op
Iteration   3: 891.118 ms/op

# Run progress: 36.96% complete, ETA 00:05:59
# Fork: 2 of 2
# Warmup Iteration   1: 1460.457 ms/op
# Warmup Iteration   2: 920.415 ms/op
Iteration   1: 887.477 ms/op
Iteration   2: 891.239 ms/op
Iteration   3: 887.076 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  890.689 ±(99.9%) 9.473 ms/op [Average]
  (min, avg, max) = (887.076, 890.689, 896.451), stdev = 3.378
  CI (99.9%): [881.215, 900.162] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:49
# Fork: 1 of 2
# Warmup Iteration   1: 0.105 ms/op
# Warmup Iteration   2: 0.079 ms/op
Iteration   1: 0.079 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.079 ms/op

# Run progress: 41.30% complete, ETA 00:05:33
# Fork: 2 of 2
# Warmup Iteration   1: 0.111 ms/op
# Warmup Iteration   2: 0.080 ms/op
Iteration   1: 0.080 ms/op
Iteration   2: 0.079 ms/op
Iteration   3: 0.081 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.079 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.079, 0.079, 0.081), stdev = 0.001
  CI (99.9%): [0.077, 0.082] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:18
# Fork: 1 of 2
# Warmup Iteration   1: 7.859 ms/op
# Warmup Iteration   2: 6.160 ms/op
Iteration   1: 6.136 ms/op
Iteration   2: 6.117 ms/op
Iteration   3: 6.158 ms/op

# Run progress: 45.65% complete, ETA 00:05:03
# Fork: 2 of 2
# Warmup Iteration   1: 7.763 ms/op
# Warmup Iteration   2: 6.163 ms/op
Iteration   1: 6.138 ms/op
Iteration   2: 6.137 ms/op
Iteration   3: 6.111 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.133 ±(99.9%) 0.047 ms/op [Average]
  (min, avg, max) = (6.111, 6.133, 6.158), stdev = 0.017
  CI (99.9%): [6.085, 6.180] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:49
# Fork: 1 of 2
# Warmup Iteration   1: 0.615 ms/op
# Warmup Iteration   2: 0.467 ms/op
Iteration   1: 0.465 ms/op
Iteration   2: 0.465 ms/op
Iteration   3: 0.464 ms/op

# Run progress: 50.00% complete, ETA 00:04:35
# Fork: 2 of 2
# Warmup Iteration   1: 0.622 ms/op
# Warmup Iteration   2: 0.464 ms/op
Iteration   1: 0.465 ms/op
Iteration   2: 0.486 ms/op
Iteration   3: 0.477 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.470 ±(99.9%) 0.026 ms/op [Average]
  (min, avg, max) = (0.464, 0.470, 0.486), stdev = 0.009
  CI (99.9%): [0.444, 0.496] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:22
# Fork: 1 of 2
# Warmup Iteration   1: 1.606 ms/op
# Warmup Iteration   2: 1.209 ms/op
Iteration   1: 1.194 ms/op
Iteration   2: 1.205 ms/op
Iteration   3: 1.190 ms/op

# Run progress: 54.35% complete, ETA 00:04:08
# Fork: 2 of 2
# Warmup Iteration   1: 1.547 ms/op
# Warmup Iteration   2: 1.214 ms/op
Iteration   1: 1.198 ms/op
Iteration   2: 1.206 ms/op
Iteration   3: 1.190 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.197 ±(99.9%) 0.020 ms/op [Average]
  (min, avg, max) = (1.190, 1.197, 1.206), stdev = 0.007
  CI (99.9%): [1.178, 1.217] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:55
# Fork: 1 of 2
# Warmup Iteration   1: 126.176 ms/op
# Warmup Iteration   2: 45.047 ms/op
Iteration   1: 37.401 ms/op
Iteration   2: 25.077 ms/op
Iteration   3: 23.270 ms/op

# Run progress: 58.70% complete, ETA 00:03:42
# Fork: 2 of 2
# Warmup Iteration   1: 101.420 ms/op
# Warmup Iteration   2: 31.117 ms/op
Iteration   1: 27.640 ms/op
Iteration   2: 23.628 ms/op
Iteration   3: 22.931 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  26.658 ±(99.9%) 15.533 ms/op [Average]
  (min, avg, max) = (22.931, 26.658, 37.401), stdev = 5.539
  CI (99.9%): [11.124, 42.191] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:30
# Fork: 1 of 2
# Warmup Iteration   1: 77087.210 ms/op
# Warmup Iteration   2: 72605.095 ms/op
Iteration   1: 72391.411 ms/op
Iteration   2: 72349.183 ms/op
Iteration   3: 72227.673 ms/op

# Run progress: 63.04% complete, ETA 00:06:47
# Fork: 2 of 2
# Warmup Iteration   1: 77269.767 ms/op
# Warmup Iteration   2: 72911.382 ms/op
Iteration   1: 72584.023 ms/op
Iteration   2: 72647.349 ms/op
Iteration   3: 72636.353 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  72472.665 ±(99.9%) 488.251 ms/op [Average]
  (min, avg, max) = (72227.673, 72472.665, 72647.349), stdev = 174.115
  CI (99.9%): [71984.414, 72960.917] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:09:27
# Fork: 1 of 2
# Warmup Iteration   1: 30882.248 ms/op
# Warmup Iteration   2: 11854.034 ms/op
Iteration   1: 25498.747 ms/op
Iteration   2: 11287.275 ms/op
Iteration   3: 21972.015 ms/op

# Run progress: 67.39% complete, ETA 00:11:20
# Fork: 2 of 2
# Warmup Iteration   1: 30756.376 ms/op
# Warmup Iteration   2: 11999.935 ms/op
Iteration   1: 25836.679 ms/op
Iteration   2: 11487.908 ms/op
Iteration   3: 21658.997 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  19623.603 ±(99.9%) 18535.712 ms/op [Average]
  (min, avg, max) = (11287.275, 19623.603, 25836.679), stdev = 6610.014
  CI (99.9%): [1087.891, 38159.316] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:12:45
# Fork: 1 of 2
# Warmup Iteration   1: 8289.896 ms/op
# Warmup Iteration   2: 6605.980 ms/op
Iteration   1: 6265.144 ms/op
Iteration   2: 6202.168 ms/op
Iteration   3: 6202.302 ms/op

# Run progress: 71.74% complete, ETA 00:11:42
# Fork: 2 of 2
# Warmup Iteration   1: 8969.317 ms/op
# Warmup Iteration   2: 6455.687 ms/op
Iteration   1: 6290.808 ms/op
Iteration   2: 6243.412 ms/op
Iteration   3: 6217.426 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6236.877 ±(99.9%) 101.330 ms/op [Average]
  (min, avg, max) = (6202.168, 6236.877, 6290.808), stdev = 36.135
  CI (99.9%): [6135.547, 6338.207] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:10:41
# Fork: 1 of 2
# Warmup Iteration   1: Nov 13, 2026 10:15:30 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 10:15:30 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
57.669 ms/op
# Warmup Iteration   2: 45.028 ms/op
Iteration   1: 44.632 ms/op
Iteration   2: 44.392 ms/op
Iteration   3: 44.477 ms/op

# Run progress: 76.09% complete, ETA 00:09:34
# Fork: 2 of 2
# Warmup Iteration   1: Nov 13, 2026 10:15:41 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 10:15:41 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
67.268 ms/op
# Warmup Iteration   2: 44.624 ms/op
Iteration   1: 44.523 ms/op
Iteration   2: 44.410 ms/op
Iteration   3: 44.191 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  44.438 ±(99.9%) 0.416 ms/op [Average]
  (min, avg, max) = (44.191, 44.438, 44.632), stdev = 0.149
  CI (99.9%): [44.021, 44.854] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:08:31
# Fork: 1 of 2
# Warmup Iteration   1: 50.483 ms/op
# Warmup Iteration   2: 49.436 ms/op
Iteration   1: 49.952 ms/op
Iteration   2: 49.557 ms/op
Iteration   3: 49.771 ms/op

# Run progress: 80.43% complete, ETA 00:07:30
# Fork: 2 of 2
# Warmup Iteration   1: 58.017 ms/op
# Warmup Iteration   2: 48.811 ms/op
Iteration   1: 48.303 ms/op
Iteration   2: 48.320 ms/op
Iteration   3: 48.090 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  48.999 ±(99.9%) 2.376 ms/op [Average]
  (min, avg, max) = (48.090, 48.999, 49.952), stdev = 0.847
  CI (99.9%): [46.623, 51.374] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:06:32
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:05:36
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

# Run progress: 86.96% complete, ETA 00:04:42
# Fork: 1 of 2
# Warmup Iteration   1: 34.998 ms/op
# Warmup Iteration   2: 28.372 ms/op
Iteration   1: 28.103 ms/op
Iteration   2: 27.926 ms/op
Iteration   3: 28.066 ms/op

# Run progress: 89.13% complete, ETA 00:03:51
# Fork: 2 of 2
# Warmup Iteration   1: 31.812 ms/op
# Warmup Iteration   2: 25.448 ms/op
Iteration   1: 25.040 ms/op
Iteration   2: 24.977 ms/op
Iteration   3: 24.716 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  26.472 ±(99.9%) 4.806 ms/op [Average]
  (min, avg, max) = (24.716, 26.472, 28.103), stdev = 1.714
  CI (99.9%): [21.666, 31.277] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:01
# Fork: 1 of 2
# Warmup Iteration   1: 12.099 ms/op
# Warmup Iteration   2: 9.640 ms/op
Iteration   1: 9.566 ms/op
Iteration   2: 9.394 ms/op
Iteration   3: 9.449 ms/op

# Run progress: 93.48% complete, ETA 00:02:13
# Fork: 2 of 2
# Warmup Iteration   1: 11.956 ms/op
# Warmup Iteration   2: 9.632 ms/op
Iteration   1: 9.473 ms/op
Iteration   2: 9.410 ms/op
Iteration   3: 9.365 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.443 ±(99.9%) 0.200 ms/op [Average]
  (min, avg, max) = (9.365, 9.443, 9.566), stdev = 0.071
  CI (99.9%): [9.242, 9.643] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 22.489 ms/op
# Warmup Iteration   2: 20.444 ms/op
Iteration   1: 20.401 ms/op
Iteration   2: 20.377 ms/op
Iteration   3: 20.417 ms/op

# Run progress: 97.83% complete, ETA 00:00:43
# Fork: 2 of 2
# Warmup Iteration   1: 22.898 ms/op
# Warmup Iteration   2: 20.168 ms/op
Iteration   1: 20.098 ms/op
Iteration   2: 20.110 ms/op
Iteration   3: 20.102 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  20.251 ±(99.9%) 0.455 ms/op [Average]
  (min, avg, max) = (20.098, 20.251, 20.417), stdev = 0.162
  CI (99.9%): [19.796, 20.706] (assumes normal distribution)


# Run complete. Total time: 00:32:32

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     18.954 ±     0.356  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.179 ±     0.010  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      5.967 ±     0.042  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.437 ±     0.127  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     10.704 ±     0.063  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    341.415 ±    15.313  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   1791.855 ±    65.126  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    398.456 ±    11.441  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    890.689 ±     9.473  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.079 ±     0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.133 ±     0.047  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.470 ±     0.026  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.197 ±     0.020  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     26.658 ±    15.533  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  72472.665 ±   488.251  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  19623.603 ± 18535.712  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6236.877 ±   101.330  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     44.438 ±     0.416  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     48.999 ±     2.376  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     26.472 ±     4.806  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.443 ±     0.200  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     20.251 ±     0.455  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.22.0 -> 3.23.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 9 lower, 14 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.TPflash_UMR.testFlash_UMR | 388.976 | 1791.85 | +360.66% | Separate CIs |
| process.Compressor_Benchmark.compressorprocess | 17.0328 | 26.6577 | +56.51% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 24.9054 | 26.4715 | +6.29% | Overlapping CIs |
| flash.TPflash.testFlash | 327.986 | 341.415 | +4.09% | Overlapping CIs |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 70847 | 72472.7 | +2.29% | Separate CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 49.7858 | 48.999 | -1.58% | Overlapping CIs |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 18.6819 | 18.9543 | +1.46% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 19369.6 | 19623.6 | +1.31% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000281184 | 0.000284671 | +1.24% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 44.0177 | 44.4375 | +0.95% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
