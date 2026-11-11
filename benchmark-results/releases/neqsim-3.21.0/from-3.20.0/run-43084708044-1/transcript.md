# NeqSim 3.21.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.20.0 |
| Current | 3.21.0 |
| Source commit | `a941eabd3f2da91592e39f71863eab0793ecb0a9` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43084708044) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "a941eabd3f2da91592e39f71863eab0793ecb0a9",
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
Address sizes:                           48 bits physical, 57 bits virtual
Byte Order:                              Little Endian
CPU(s):                                  4
On-line CPU(s) list:                     0-3
Vendor ID:                               GenuineIntel
Model name:                              Intel(R) Xeon(R) 6973P-C
CPU family:                              6
Model:                                   173
Thread(s) per core:                      2
Core(s) per socket:                      2
Socket(s):                               1
Stepping:                                1
CPU(s) scaling MHz:                      137%
CPU max MHz:                             2600.0000
CPU min MHz:                             800.0000
BogoMIPS:                                5199.99
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ss ht syscall nx pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology tsc_reliable nonstop_tsc cpuid aperfmperf tsc_known_freq pni pclmulqdq vmx ssse3 fma cx16 pcid sse4_1 sse4_2 x2apic movbe popcnt tsc_deadline_timer aes xsave avx f16c rdrand hypervisor lahf_lm abm 3dnowprefetch tpr_shadow ept vpid ept_ad fsgsbase tsc_adjust bmi1 hle avx2 smep bmi2 erms invpcid rtm avx512f avx512dq rdseed adx smap avx512ifma clflushopt clwb avx512cd sha_ni avx512bw avx512vl xsaveopt xsavec xgetbv1 xsaves user_shstk avx_vnni avx512_bf16 vnmi avx512vbmi umip waitpkg avx512_vbmi2 gfni vaes vpclmulqdq avx512_vnni avx512_bitalg avx512_vpopcntdq la57 rdpid cldemote movdiri movdir64b fsrm serialize tsxldtrk ibt amx_bf16 avx512_fp16 amx_tile amx_int8 arch_capabilities
Virtualization:                          VT-x
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               96 KiB (2 instances)
L1i cache:                               128 KiB (2 instances)
L2 cache:                                4 MiB (2 instances)
L3 cache:                                480 MiB (1 instance)
NUMA node(s):                            1
NUMA node0 CPU(s):                       0-3
Vulnerability Gather data sampling:      Not affected
Vulnerability Ghostwrite:                Not affected
Vulnerability Indirect target selection: Mitigation; Aligned branch/return thunks
Vulnerability Itlb multihit:             Not affected
Vulnerability L1tf:                      Not affected
Vulnerability Mds:                       Not affected
Vulnerability Meltdown:                  Not affected
Vulnerability Mmio stale data:           Not affected
Vulnerability Old microcode:             Not affected
Vulnerability Reg file data sampling:    Not affected
Vulnerability Retbleed:                  Vulnerable
Vulnerability Spec rstack overflow:      Not affected
Vulnerability Spec store bypass:         Vulnerable
Vulnerability Spectre v1:                Mitigation; usercopy/swapgs barriers and __user pointer sanitization
Vulnerability Spectre v2:                Mitigation; Retpolines; STIBP disabled; RSB filling; PBRSB-eIBRS Not affected; BHI Retpoline
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
| baseline | 3.20.0 | passed |
| current | 3.21.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.20.0",
  "version": "3.20.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.20.0/neqsim-3.20.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.21.0",
  "version": "3.21.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.21.0/neqsim-3.21.0.jar",
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
[INFO] Total time:  14.353 s
[INFO] Finished at: 2026-11-11T19:10:58Z
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
TEG full process: 7626 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.657 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.053 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.050 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 303522 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 30 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    6.30e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.94e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     7.39e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.94e-03 after 30 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 0.000101 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 263973.7 + 376479.9, oil 1995064.2 + 2849922.4, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.387 MSm3/d, KA27841 A 102.7 bara, pipeline outlet 51.8 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 303.5 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (5 ms)
tpFlashWellFluidSrk                                            83.6406  (40 ms)
tpFlashWellFluidPr                                             83.6541  (36 ms)
tpFlashWellFluidWithProperties                                 5445.46  (42 ms)
phAndPsFlashWellFluid                                          2459.23  (59 ms)
Nov 11, 2026 7:16:20 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 11, 2026 7:16:20 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (742 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (230 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (87 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (58 ms)
saturationPointsWellFluid                                      1601.32  (123 ms)
singlePhaseGasPipelineSteadyState                              121.628  (503 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1053 ms)
levenbergMarquardtAntoine                                      1837.31  (5 ms)
levenbergMarquardtDoubleExponential                            5.57177  (3 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (7 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.399 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  05:34 min
[INFO] Finished at: 2026-11-11T19:16:33Z
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
# Warmup Iteration   1: 16.203 ms/op
# Warmup Iteration   2: 13.138 ms/op
Iteration   1: 13.285 ms/op
Iteration   2: 12.979 ms/op
Iteration   3: 12.985 ms/op

# Run progress: 2.17% complete, ETA 00:08:30
# Fork: 2 of 2
# Warmup Iteration   1: 15.413 ms/op
# Warmup Iteration   2: 12.922 ms/op
Iteration   1: 12.778 ms/op
Iteration   2: 14.031 ms/op
Iteration   3: 14.896 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  13.492 ±(99.9%) 2.290 ms/op [Average]
  (min, avg, max) = (12.778, 13.492, 14.896), stdev = 0.816
  CI (99.9%): [11.203, 15.782] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:17
# Fork: 1 of 2
# Warmup Iteration   1: 1.808 ms/op
# Warmup Iteration   2: 1.089 ms/op
Iteration   1: 1.083 ms/op
Iteration   2: 1.155 ms/op
Iteration   3: 1.062 ms/op

# Run progress: 6.52% complete, ETA 00:08:07
# Fork: 2 of 2
# Warmup Iteration   1: 1.526 ms/op
# Warmup Iteration   2: 1.184 ms/op
Iteration   1: 1.125 ms/op
Iteration   2: 1.099 ms/op
Iteration   3: 1.057 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.097 ±(99.9%) 0.106 ms/op [Average]
  (min, avg, max) = (1.057, 1.097, 1.155), stdev = 0.038
  CI (99.9%): [0.991, 1.203] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:07:54
# Fork: 1 of 2
# Warmup Iteration   1: 5.587 ms/op
# Warmup Iteration   2: 4.590 ms/op
Iteration   1: 4.547 ms/op
Iteration   2: 4.766 ms/op
Iteration   3: 5.225 ms/op

# Run progress: 10.87% complete, ETA 00:07:41
# Fork: 2 of 2
# Warmup Iteration   1: 6.322 ms/op
# Warmup Iteration   2: 4.605 ms/op
Iteration   1: 4.646 ms/op
Iteration   2: 4.698 ms/op
Iteration   3: 4.784 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.778 ±(99.9%) 0.660 ms/op [Average]
  (min, avg, max) = (4.547, 4.778, 5.225), stdev = 0.235
  CI (99.9%): [4.118, 5.438] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:30
# Fork: 1 of 2
# Warmup Iteration   1: 6.393 ms/op
# Warmup Iteration   2: 5.093 ms/op
Iteration   1: 4.981 ms/op
Iteration   2: 4.914 ms/op
Iteration   3: 4.915 ms/op

# Run progress: 15.22% complete, ETA 00:07:19
# Fork: 2 of 2
# Warmup Iteration   1: 6.125 ms/op
# Warmup Iteration   2: 4.859 ms/op
Iteration   1: 5.062 ms/op
Iteration   2: 4.826 ms/op
Iteration   3: 4.801 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  4.916 ±(99.9%) 0.272 ms/op [Average]
  (min, avg, max) = (4.801, 4.916, 5.062), stdev = 0.097
  CI (99.9%): [4.645, 5.188] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:07
# Fork: 1 of 2
# Warmup Iteration   1: 13.350 ms/op
# Warmup Iteration   2: 9.366 ms/op
Iteration   1: 8.394 ms/op
Iteration   2: 8.759 ms/op
Iteration   3: 8.421 ms/op

# Run progress: 19.57% complete, ETA 00:06:56
# Fork: 2 of 2
# Warmup Iteration   1: 12.777 ms/op
# Warmup Iteration   2: 8.645 ms/op
Iteration   1: 8.454 ms/op
Iteration   2: 8.388 ms/op
Iteration   3: 8.414 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  8.472 ±(99.9%) 0.400 ms/op [Average]
  (min, avg, max) = (8.388, 8.472, 8.759), stdev = 0.143
  CI (99.9%): [8.071, 8.872] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:06:45
# Fork: 1 of 2
# Warmup Iteration   1: 742.775 ms/op
# Warmup Iteration   2: 284.441 ms/op
Iteration   1: 269.847 ms/op
Iteration   2: 267.981 ms/op
Iteration   3: 257.049 ms/op

# Run progress: 23.91% complete, ETA 00:06:33
# Fork: 2 of 2
# Warmup Iteration   1: 799.815 ms/op
# Warmup Iteration   2: 334.113 ms/op
Iteration   1: 292.867 ms/op
Iteration   2: 262.081 ms/op
Iteration   3: 261.936 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  268.627 ±(99.9%) 35.717 ms/op [Average]
  (min, avg, max) = (257.049, 268.627, 292.867), stdev = 12.737
  CI (99.9%): [232.910, 304.344] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:20
# Fork: 1 of 2
# Warmup Iteration   1: 1060.120 ms/op
# Warmup Iteration   2: 325.438 ms/op
Iteration   1: 318.445 ms/op
Iteration   2: 302.549 ms/op
Iteration   3: 299.706 ms/op

# Run progress: 28.26% complete, ETA 00:06:09
# Fork: 2 of 2
# Warmup Iteration   1: 1122.631 ms/op
# Warmup Iteration   2: 410.521 ms/op
Iteration   1: 378.695 ms/op
Iteration   2: 336.825 ms/op
Iteration   3: 310.500 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  324.454 ±(99.9%) 83.358 ms/op [Average]
  (min, avg, max) = (299.706, 324.454, 378.695), stdev = 29.726
  CI (99.9%): [241.095, 407.812] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:05:57
# Fork: 1 of 2
# Warmup Iteration   1: 575.446 ms/op
# Warmup Iteration   2: 349.999 ms/op
Iteration   1: 346.319 ms/op
Iteration   2: 329.874 ms/op
Iteration   3: 322.745 ms/op

# Run progress: 32.61% complete, ETA 00:05:46
# Fork: 2 of 2
# Warmup Iteration   1: 551.262 ms/op
# Warmup Iteration   2: 327.123 ms/op
Iteration   1: 325.168 ms/op
Iteration   2: 370.045 ms/op
Iteration   3: 336.764 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  338.486 ±(99.9%) 49.526 ms/op [Average]
  (min, avg, max) = (322.745, 338.486, 370.045), stdev = 17.661
  CI (99.9%): [288.960, 388.012] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:35
# Fork: 1 of 2
# Warmup Iteration   1: 1157.701 ms/op
# Warmup Iteration   2: 776.453 ms/op
Iteration   1: 751.730 ms/op
Iteration   2: 861.258 ms/op
Iteration   3: 856.985 ms/op

# Run progress: 36.96% complete, ETA 00:05:25
# Fork: 2 of 2
# Warmup Iteration   1: 1225.507 ms/op
# Warmup Iteration   2: 774.664 ms/op
Iteration   1: 767.446 ms/op
Iteration   2: 782.625 ms/op
Iteration   3: 749.600 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  794.941 ±(99.9%) 143.414 ms/op [Average]
  (min, avg, max) = (749.600, 794.941, 861.258), stdev = 51.143
  CI (99.9%): [651.526, 938.355] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:15
# Fork: 1 of 2
# Warmup Iteration   1: 0.117 ms/op
# Warmup Iteration   2: 0.090 ms/op
Iteration   1: 0.086 ms/op
Iteration   2: 0.085 ms/op
Iteration   3: 0.088 ms/op

# Run progress: 41.30% complete, ETA 00:05:02
# Fork: 2 of 2
# Warmup Iteration   1: 0.118 ms/op
# Warmup Iteration   2: 0.087 ms/op
Iteration   1: 0.090 ms/op
Iteration   2: 0.085 ms/op
Iteration   3: 0.085 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.086 ±(99.9%) 0.005 ms/op [Average]
  (min, avg, max) = (0.085, 0.086, 0.090), stdev = 0.002
  CI (99.9%): [0.081, 0.092] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:04:50
# Fork: 1 of 2
# Warmup Iteration   1: 8.417 ms/op
# Warmup Iteration   2: 6.674 ms/op
Iteration   1: 6.722 ms/op
Iteration   2: 6.499 ms/op
Iteration   3: 6.522 ms/op

# Run progress: 45.65% complete, ETA 00:04:38
# Fork: 2 of 2
# Warmup Iteration   1: 8.113 ms/op
# Warmup Iteration   2: 6.453 ms/op
Iteration   1: 6.479 ms/op
Iteration   2: 6.483 ms/op
Iteration   3: 6.480 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.531 ±(99.9%) 0.267 ms/op [Average]
  (min, avg, max) = (6.479, 6.531, 6.722), stdev = 0.095
  CI (99.9%): [6.264, 6.798] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:25
# Fork: 1 of 2
# Warmup Iteration   1: 0.715 ms/op
# Warmup Iteration   2: 0.576 ms/op
Iteration   1: 0.607 ms/op
Iteration   2: 0.650 ms/op
Iteration   3: 0.628 ms/op

# Run progress: 50.00% complete, ETA 00:04:13
# Fork: 2 of 2
# Warmup Iteration   1: 0.718 ms/op
# Warmup Iteration   2: 0.585 ms/op
Iteration   1: 0.573 ms/op
Iteration   2: 0.574 ms/op
Iteration   3: 0.600 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.605 ±(99.9%) 0.085 ms/op [Average]
  (min, avg, max) = (0.573, 0.605, 0.650), stdev = 0.030
  CI (99.9%): [0.521, 0.690] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:02
# Fork: 1 of 2
# Warmup Iteration   1: 1.982 ms/op
# Warmup Iteration   2: 1.486 ms/op
Iteration   1: 1.351 ms/op
Iteration   2: 1.428 ms/op
Iteration   3: 1.397 ms/op

# Run progress: 54.35% complete, ETA 00:03:50
# Fork: 2 of 2
# Warmup Iteration   1: 1.725 ms/op
# Warmup Iteration   2: 1.428 ms/op
Iteration   1: 1.339 ms/op
Iteration   2: 1.352 ms/op
Iteration   3: 1.332 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.366 ±(99.9%) 0.106 ms/op [Average]
  (min, avg, max) = (1.332, 1.366, 1.428), stdev = 0.038
  CI (99.9%): [1.261, 1.472] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:38
# Fork: 1 of 2
# Warmup Iteration   1: 54.380 ms/op
# Warmup Iteration   2: 21.389 ms/op
Iteration   1: 11.767 ms/op
Iteration   2: 11.014 ms/op
Iteration   3: 9.619 ms/op

# Run progress: 58.70% complete, ETA 00:03:27
# Fork: 2 of 2
# Warmup Iteration   1: 42.701 ms/op
# Warmup Iteration   2: 14.971 ms/op
Iteration   1: 10.299 ms/op
Iteration   2: 9.599 ms/op
Iteration   3: 9.383 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  10.280 ±(99.9%) 2.647 ms/op [Average]
  (min, avg, max) = (9.383, 10.280, 11.767), stdev = 0.944
  CI (99.9%): [7.633, 12.928] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:16
# Fork: 1 of 2
# Warmup Iteration   1: 58309.596 ms/op
# Warmup Iteration   2: 54662.939 ms/op
Iteration   1: 55857.969 ms/op
Iteration   2: 54843.106 ms/op
Iteration   3: 53746.078 ms/op

# Run progress: 63.04% complete, ETA 00:05:41
# Fork: 2 of 2
# Warmup Iteration   1: 59097.046 ms/op
# Warmup Iteration   2: 55539.166 ms/op
Iteration   1: 55336.668 ms/op
Iteration   2: 54176.889 ms/op
Iteration   3: 56791.557 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  55125.378 ±(99.9%) 3132.482 ms/op [Average]
  (min, avg, max) = (53746.078, 55125.378, 56791.557), stdev = 1117.073
  CI (99.9%): [51992.896, 58257.860] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:41
# Fork: 1 of 2
# Warmup Iteration   1: 14757.083 ms/op
# Warmup Iteration   2: 14795.208 ms/op
Iteration   1: 12170.314 ms/op
Iteration   2: 14299.268 ms/op
Iteration   3: 10202.787 ms/op

# Run progress: 67.39% complete, ETA 00:09:26
# Fork: 2 of 2
# Warmup Iteration   1: 16024.840 ms/op
# Warmup Iteration   2: 12602.878 ms/op
Iteration   1: 11818.926 ms/op
Iteration   2: 11220.344 ms/op
Iteration   3: 11366.480 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  11846.353 ±(99.9%) 3854.297 ms/op [Average]
  (min, avg, max) = (10202.787, 11846.353, 14299.268), stdev = 1374.480
  CI (99.9%): [7992.056, 15700.650] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:10:47
# Fork: 1 of 2
# Warmup Iteration   1: 7240.503 ms/op
# Warmup Iteration   2: 5334.664 ms/op
Iteration   1: 5212.348 ms/op
Iteration   2: 5080.917 ms/op
Iteration   3: 5002.657 ms/op

# Run progress: 71.74% complete, ETA 00:09:53
# Fork: 2 of 2
# Warmup Iteration   1: 7097.475 ms/op
# Warmup Iteration   2: 5212.538 ms/op
Iteration   1: 5068.432 ms/op
Iteration   2: 5048.137 ms/op
Iteration   3: 5360.952 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  5128.907 ±(99.9%) 374.609 ms/op [Average]
  (min, avg, max) = (5002.657, 5128.907, 5360.952), stdev = 133.589
  CI (99.9%): [4754.298, 5503.516] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:09:01
# Fork: 1 of 2
# Warmup Iteration   1: Nov 11, 2026 7:42:09 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 11, 2026 7:42:09 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
54.331 ms/op
# Warmup Iteration   2: 41.772 ms/op
Iteration   1: 42.212 ms/op
Iteration   2: 39.996 ms/op
Iteration   3: 39.591 ms/op

# Run progress: 76.09% complete, ETA 00:08:05
# Fork: 2 of 2
# Warmup Iteration   1: Nov 11, 2026 7:42:20 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 11, 2026 7:42:20 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
56.064 ms/op
# Warmup Iteration   2: 41.015 ms/op
Iteration   1: 39.629 ms/op
Iteration   2: 41.285 ms/op
Iteration   3: 44.862 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  41.262 ±(99.9%) 5.737 ms/op [Average]
  (min, avg, max) = (39.591, 41.262, 44.862), stdev = 2.046
  CI (99.9%): [35.526, 46.999] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:07:12
# Fork: 1 of 2
# Warmup Iteration   1: 47.807 ms/op
# Warmup Iteration   2: 41.743 ms/op
Iteration   1: 43.415 ms/op
Iteration   2: 42.955 ms/op
Iteration   3: 41.835 ms/op

# Run progress: 80.43% complete, ETA 00:06:21
# Fork: 2 of 2
# Warmup Iteration   1: 51.503 ms/op
# Warmup Iteration   2: 41.280 ms/op
Iteration   1: 40.969 ms/op
Iteration   2: 39.715 ms/op
Iteration   3: 42.781 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  41.945 ±(99.9%) 3.929 ms/op [Average]
  (min, avg, max) = (39.715, 41.945, 43.415), stdev = 1.401
  CI (99.9%): [38.015, 45.874] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:05:32
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:45
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

# Run progress: 86.96% complete, ETA 00:04:00
# Fork: 1 of 2
# Warmup Iteration   1: 15.825 ms/op
# Warmup Iteration   2: 11.796 ms/op
Iteration   1: 11.765 ms/op
Iteration   2: 12.018 ms/op
Iteration   3: 11.316 ms/op

# Run progress: 89.13% complete, ETA 00:03:16
# Fork: 2 of 2
# Warmup Iteration   1: 14.103 ms/op
# Warmup Iteration   2: 11.940 ms/op
Iteration   1: 11.481 ms/op
Iteration   2: 11.458 ms/op
Iteration   3: 11.441 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  11.580 ±(99.9%) 0.731 ms/op [Average]
  (min, avg, max) = (11.316, 11.580, 12.018), stdev = 0.261
  CI (99.9%): [10.849, 12.311] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:34
# Fork: 1 of 2
# Warmup Iteration   1: 10.042 ms/op
# Warmup Iteration   2: 8.222 ms/op
Iteration   1: 8.084 ms/op
Iteration   2: 8.215 ms/op
Iteration   3: 9.233 ms/op

# Run progress: 93.48% complete, ETA 00:01:54
# Fork: 2 of 2
# Warmup Iteration   1: 11.208 ms/op
# Warmup Iteration   2: 9.038 ms/op
Iteration   1: 8.616 ms/op
Iteration   2: 8.209 ms/op
Iteration   3: 8.235 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  8.432 ±(99.9%) 1.210 ms/op [Average]
  (min, avg, max) = (8.084, 8.432, 9.233), stdev = 0.432
  CI (99.9%): [7.222, 9.642] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:14
# Fork: 1 of 2
# Warmup Iteration   1: 16.715 ms/op
# Warmup Iteration   2: 16.093 ms/op
Iteration   1: 15.164 ms/op
Iteration   2: 15.461 ms/op
Iteration   3: 15.837 ms/op

# Run progress: 97.83% complete, ETA 00:00:36
# Fork: 2 of 2
# Warmup Iteration   1: 18.251 ms/op
# Warmup Iteration   2: 15.458 ms/op
Iteration   1: 14.893 ms/op
Iteration   2: 14.830 ms/op
Iteration   3: 14.879 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  15.177 ±(99.9%) 1.126 ms/op [Average]
  (min, avg, max) = (14.830, 15.177, 15.837), stdev = 0.402
  CI (99.9%): [14.051, 16.304] (assumes normal distribution)


# Run complete. Total time: 00:27:47

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     13.492 ±    2.290  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.097 ±    0.106  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.778 ±    0.660  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      4.916 ±    0.272  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      8.472 ±    0.400  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    268.627 ±   35.717  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    324.454 ±   83.358  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    338.486 ±   49.526  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    794.941 ±  143.414  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.086 ±    0.005  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.531 ±    0.267  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.605 ±    0.085  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.366 ±    0.106  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     10.280 ±    2.647  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  55125.378 ± 3132.482  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  11846.353 ± 3854.297  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   5128.907 ±  374.609  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     41.262 ±    5.737  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     41.945 ±    3.929  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     11.580 ±    0.731  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      8.432 ±    1.210  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     15.177 ±    1.126  ms/op

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
[INFO] Total time:  3.032 s
[INFO] Finished at: 2026-11-11T19:44:25Z
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
TEG full process: 7050 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.085 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.695 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.049 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 401088 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 42 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    2.82e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.84e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     3.57e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 401.1 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (6 ms)
tpFlashWellFluidSrk                                            83.6406  (52 ms)
tpFlashWellFluidPr                                             83.6541  (49 ms)
tpFlashWellFluidWithProperties                                 5445.46  (54 ms)
phAndPsFlashWellFluid                                          2459.23  (95 ms)
Nov 11, 2026 7:51:19 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 11, 2026 7:51:19 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (849 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (318 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (139 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (44 ms)
saturationPointsWellFluid                                      1601.32  (89 ms)
singlePhaseGasPipelineSteadyState                              121.628  (518 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1071 ms)
levenbergMarquardtAntoine                                      1837.31  (5 ms)
levenbergMarquardtDoubleExponential                            5.57177  (4 ms)
dataReconciliation[20]                                         7.89841  (2 ms)
dataReconciliation[100]                                        37.0132  (30 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.764 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  07:02 min
[INFO] Finished at: 2026-11-11T19:51:28Z
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
# Warmup Iteration   1: 16.493 ms/op
# Warmup Iteration   2: 13.637 ms/op
Iteration   1: 13.784 ms/op
Iteration   2: 14.419 ms/op
Iteration   3: 13.810 ms/op

# Run progress: 2.17% complete, ETA 00:08:24
# Fork: 2 of 2
# Warmup Iteration   1: 17.176 ms/op
# Warmup Iteration   2: 15.047 ms/op
Iteration   1: 14.128 ms/op
Iteration   2: 14.077 ms/op
Iteration   3: 14.283 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  14.084 ±(99.9%) 0.708 ms/op [Average]
  (min, avg, max) = (13.784, 14.084, 14.419), stdev = 0.253
  CI (99.9%): [13.375, 14.792] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:13
# Fork: 1 of 2
# Warmup Iteration   1: 1.439 ms/op
# Warmup Iteration   2: 1.141 ms/op
Iteration   1: 1.095 ms/op
Iteration   2: 1.148 ms/op
Iteration   3: 1.086 ms/op

# Run progress: 6.52% complete, ETA 00:08:02
# Fork: 2 of 2
# Warmup Iteration   1: 1.515 ms/op
# Warmup Iteration   2: 1.104 ms/op
Iteration   1: 1.061 ms/op
Iteration   2: 1.055 ms/op
Iteration   3: 1.192 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.106 ±(99.9%) 0.150 ms/op [Average]
  (min, avg, max) = (1.055, 1.106, 1.192), stdev = 0.054
  CI (99.9%): [0.956, 1.256] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:07:51
# Fork: 1 of 2
# Warmup Iteration   1: 5.977 ms/op
# Warmup Iteration   2: 4.634 ms/op
Iteration   1: 4.531 ms/op
Iteration   2: 4.709 ms/op
Iteration   3: 4.520 ms/op

# Run progress: 10.87% complete, ETA 00:07:41
# Fork: 2 of 2
# Warmup Iteration   1: 7.311 ms/op
# Warmup Iteration   2: 4.795 ms/op
Iteration   1: 4.622 ms/op
Iteration   2: 4.591 ms/op
Iteration   3: 4.622 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.599 ±(99.9%) 0.195 ms/op [Average]
  (min, avg, max) = (4.520, 4.599, 4.709), stdev = 0.069
  CI (99.9%): [4.404, 4.794] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:29
# Fork: 1 of 2
# Warmup Iteration   1: 7.182 ms/op
# Warmup Iteration   2: 4.923 ms/op
Iteration   1: 4.833 ms/op
Iteration   2: 4.815 ms/op
Iteration   3: 4.790 ms/op

# Run progress: 15.22% complete, ETA 00:07:18
# Fork: 2 of 2
# Warmup Iteration   1: 6.102 ms/op
# Warmup Iteration   2: 4.984 ms/op
Iteration   1: 5.531 ms/op
Iteration   2: 5.425 ms/op
Iteration   3: 5.097 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  5.082 ±(99.9%) 0.920 ms/op [Average]
  (min, avg, max) = (4.790, 5.082, 5.531), stdev = 0.328
  CI (99.9%): [4.162, 6.002] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:06
# Fork: 1 of 2
# Warmup Iteration   1: 10.849 ms/op
# Warmup Iteration   2: 8.498 ms/op
Iteration   1: 8.772 ms/op
Iteration   2: 8.625 ms/op
Iteration   3: 9.103 ms/op

# Run progress: 19.57% complete, ETA 00:06:55
# Fork: 2 of 2
# Warmup Iteration   1: 13.666 ms/op
# Warmup Iteration   2: 8.560 ms/op
Iteration   1: 8.849 ms/op
Iteration   2: 8.730 ms/op
Iteration   3: 8.415 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  8.749 ±(99.9%) 0.643 ms/op [Average]
  (min, avg, max) = (8.415, 8.749, 9.103), stdev = 0.229
  CI (99.9%): [8.106, 9.392] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:06:43
# Fork: 1 of 2
# Warmup Iteration   1: 733.927 ms/op
# Warmup Iteration   2: 299.773 ms/op
Iteration   1: 298.546 ms/op
Iteration   2: 291.006 ms/op
Iteration   3: 269.469 ms/op

# Run progress: 23.91% complete, ETA 00:06:31
# Fork: 2 of 2
# Warmup Iteration   1: 736.239 ms/op
# Warmup Iteration   2: 293.914 ms/op
Iteration   1: 274.808 ms/op
Iteration   2: 271.491 ms/op
Iteration   3: 268.683 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  279.001 ±(99.9%) 35.414 ms/op [Average]
  (min, avg, max) = (268.683, 279.001, 298.546), stdev = 12.629
  CI (99.9%): [243.587, 314.414] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:19
# Fork: 1 of 2
# Warmup Iteration   1: 1087.384 ms/op
# Warmup Iteration   2: 412.153 ms/op
Iteration   1: 334.620 ms/op
Iteration   2: 312.215 ms/op
Iteration   3: 310.254 ms/op

# Run progress: 28.26% complete, ETA 00:06:07
# Fork: 2 of 2
# Warmup Iteration   1: 1081.478 ms/op
# Warmup Iteration   2: 358.188 ms/op
Iteration   1: 387.777 ms/op
Iteration   2: 303.917 ms/op
Iteration   3: 306.996 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  325.963 ±(99.9%) 90.237 ms/op [Average]
  (min, avg, max) = (303.917, 325.963, 387.777), stdev = 32.179
  CI (99.9%): [235.727, 416.200] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:05:56
# Fork: 1 of 2
# Warmup Iteration   1: 553.964 ms/op
# Warmup Iteration   2: 353.017 ms/op
Iteration   1: 339.436 ms/op
Iteration   2: 324.582 ms/op
Iteration   3: 336.718 ms/op

# Run progress: 32.61% complete, ETA 00:05:44
# Fork: 2 of 2
# Warmup Iteration   1: 559.495 ms/op
# Warmup Iteration   2: 342.200 ms/op
Iteration   1: 326.903 ms/op
Iteration   2: 329.439 ms/op
Iteration   3: 319.315 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  329.399 ±(99.9%) 21.187 ms/op [Average]
  (min, avg, max) = (319.315, 329.399, 339.436), stdev = 7.556
  CI (99.9%): [308.211, 350.586] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:33
# Fork: 1 of 2
# Warmup Iteration   1: 1230.339 ms/op
# Warmup Iteration   2: 789.508 ms/op
Iteration   1: 754.855 ms/op
Iteration   2: 744.699 ms/op
Iteration   3: 744.114 ms/op

# Run progress: 36.96% complete, ETA 00:05:23
# Fork: 2 of 2
# Warmup Iteration   1: 1384.317 ms/op
# Warmup Iteration   2: 802.769 ms/op
Iteration   1: 742.256 ms/op
Iteration   2: 740.295 ms/op
Iteration   3: 800.040 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  754.376 ±(99.9%) 64.308 ms/op [Average]
  (min, avg, max) = (740.295, 754.376, 800.040), stdev = 22.933
  CI (99.9%): [690.068, 818.685] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:14
# Fork: 1 of 2
# Warmup Iteration   1: 0.128 ms/op
# Warmup Iteration   2: 0.087 ms/op
Iteration   1: 0.086 ms/op
Iteration   2: 0.089 ms/op
Iteration   3: 0.085 ms/op

# Run progress: 41.30% complete, ETA 00:05:01
# Fork: 2 of 2
# Warmup Iteration   1: 0.111 ms/op
# Warmup Iteration   2: 0.085 ms/op
Iteration   1: 0.085 ms/op
Iteration   2: 0.085 ms/op
Iteration   3: 0.085 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.086 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.085, 0.086, 0.089), stdev = 0.001
  CI (99.9%): [0.082, 0.090] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:04:49
# Fork: 1 of 2
# Warmup Iteration   1: 8.297 ms/op
# Warmup Iteration   2: 7.353 ms/op
Iteration   1: 7.208 ms/op
Iteration   2: 6.798 ms/op
Iteration   3: 6.712 ms/op

# Run progress: 45.65% complete, ETA 00:04:36
# Fork: 2 of 2
# Warmup Iteration   1: 8.029 ms/op
# Warmup Iteration   2: 6.546 ms/op
Iteration   1: 6.466 ms/op
Iteration   2: 6.651 ms/op
Iteration   3: 6.505 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.723 ±(99.9%) 0.752 ms/op [Average]
  (min, avg, max) = (6.466, 6.723, 7.208), stdev = 0.268
  CI (99.9%): [5.971, 7.476] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:24
# Fork: 1 of 2
# Warmup Iteration   1: 0.723 ms/op
# Warmup Iteration   2: 0.583 ms/op
Iteration   1: 0.579 ms/op
Iteration   2: 0.615 ms/op
Iteration   3: 0.614 ms/op

# Run progress: 50.00% complete, ETA 00:04:13
# Fork: 2 of 2
# Warmup Iteration   1: 0.738 ms/op
# Warmup Iteration   2: 0.577 ms/op
Iteration   1: 0.573 ms/op
Iteration   2: 0.571 ms/op
Iteration   3: 0.584 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.589 ±(99.9%) 0.057 ms/op [Average]
  (min, avg, max) = (0.571, 0.589, 0.615), stdev = 0.020
  CI (99.9%): [0.533, 0.646] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:01
# Fork: 1 of 2
# Warmup Iteration   1: 1.922 ms/op
# Warmup Iteration   2: 1.448 ms/op
Iteration   1: 1.338 ms/op
Iteration   2: 1.500 ms/op
Iteration   3: 1.398 ms/op

# Run progress: 54.35% complete, ETA 00:03:49
# Fork: 2 of 2
# Warmup Iteration   1: 1.733 ms/op
# Warmup Iteration   2: 1.362 ms/op
Iteration   1: 1.347 ms/op
Iteration   2: 1.338 ms/op
Iteration   3: 1.334 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.376 ±(99.9%) 0.183 ms/op [Average]
  (min, avg, max) = (1.334, 1.376, 1.500), stdev = 0.065
  CI (99.9%): [1.192, 1.559] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:38
# Fork: 1 of 2
# Warmup Iteration   1: 39.403 ms/op
# Warmup Iteration   2: 24.310 ms/op
Iteration   1: 16.590 ms/op
Iteration   2: 10.822 ms/op
Iteration   3: 9.699 ms/op

# Run progress: 58.70% complete, ETA 00:03:26
# Fork: 2 of 2
# Warmup Iteration   1: 57.715 ms/op
# Warmup Iteration   2: 22.448 ms/op
Iteration   1: 13.634 ms/op
Iteration   2: 10.367 ms/op
Iteration   3: 9.683 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  11.799 ±(99.9%) 7.752 ms/op [Average]
  (min, avg, max) = (9.683, 11.799, 16.590), stdev = 2.764
  CI (99.9%): [4.048, 19.551] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:15
# Fork: 1 of 2
# Warmup Iteration   1: 58870.171 ms/op
# Warmup Iteration   2: 56686.543 ms/op
Iteration   1: 55044.104 ms/op
Iteration   2: 55643.700 ms/op
Iteration   3: 55029.795 ms/op

# Run progress: 63.04% complete, ETA 00:05:43
# Fork: 2 of 2
# Warmup Iteration   1: 58443.863 ms/op
# Warmup Iteration   2: 56261.019 ms/op
Iteration   1: 53864.579 ms/op
Iteration   2: 55063.318 ms/op
Iteration   3: 55855.044 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  55083.423 ±(99.9%) 1942.683 ms/op [Average]
  (min, avg, max) = (53864.579, 55083.423, 55855.044), stdev = 692.779
  CI (99.9%): [53140.741, 57026.106] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:42
# Fork: 1 of 2
# Warmup Iteration   1: 22129.288 ms/op
# Warmup Iteration   2: 11575.823 ms/op
Iteration   1: 19301.209 ms/op
Iteration   2: 8515.473 ms/op
Iteration   3: 14247.366 ms/op

# Run progress: 67.39% complete, ETA 00:09:11
# Fork: 2 of 2
# Warmup Iteration   1: 11330.864 ms/op
# Warmup Iteration   2: 15857.812 ms/op
Iteration   1: 8217.071 ms/op
Iteration   2: 11921.259 ms/op
Iteration   3: 8000.941 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  11700.553 ±(99.9%) 12557.714 ms/op [Average]
  (min, avg, max) = (8000.941, 11700.553, 19301.209), stdev = 4478.202
  CI (99.9%): [≈ 0, 24258.267] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:11:00
# Fork: 1 of 2
# Warmup Iteration   1: 7068.393 ms/op
# Warmup Iteration   2: 5701.205 ms/op
Iteration   1: 5129.274 ms/op
Iteration   2: 5043.335 ms/op
Iteration   3: 5085.912 ms/op

# Run progress: 71.74% complete, ETA 00:10:05
# Fork: 2 of 2
# Warmup Iteration   1: 7267.150 ms/op
# Warmup Iteration   2: 5495.502 ms/op
Iteration   1: 5249.231 ms/op
Iteration   2: 5358.850 ms/op
Iteration   3: 5125.758 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  5165.393 ±(99.9%) 328.330 ms/op [Average]
  (min, avg, max) = (5043.335, 5165.393, 5358.850), stdev = 117.086
  CI (99.9%): [4837.063, 5493.724] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:09:12
# Fork: 1 of 2
# Warmup Iteration   1: Nov 11, 2026 8:17:36 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 11, 2026 8:17:36 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
59.674 ms/op
# Warmup Iteration   2: 41.223 ms/op
Iteration   1: 39.941 ms/op
Iteration   2: 39.790 ms/op
Iteration   3: 42.890 ms/op

# Run progress: 76.09% complete, ETA 00:08:15
# Fork: 2 of 2
# Warmup Iteration   1: Nov 11, 2026 8:17:47 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 11, 2026 8:17:47 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
50.773 ms/op
# Warmup Iteration   2: 40.851 ms/op
Iteration   1: 39.769 ms/op
Iteration   2: 39.700 ms/op
Iteration   3: 39.688 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  40.296 ±(99.9%) 3.571 ms/op [Average]
  (min, avg, max) = (39.688, 40.296, 42.890), stdev = 1.274
  CI (99.9%): [36.725, 43.868] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:07:21
# Fork: 1 of 2
# Warmup Iteration   1: 49.266 ms/op
# Warmup Iteration   2: 48.671 ms/op
Iteration   1: 49.971 ms/op
Iteration   2: 43.260 ms/op
Iteration   3: 42.981 ms/op

# Run progress: 80.43% complete, ETA 00:06:28
# Fork: 2 of 2
# Warmup Iteration   1: 42.416 ms/op
# Warmup Iteration   2: 42.813 ms/op
Iteration   1: 42.955 ms/op
Iteration   2: 42.131 ms/op
Iteration   3: 42.582 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  43.980 ±(99.9%) 8.303 ms/op [Average]
  (min, avg, max) = (42.131, 43.980, 49.971), stdev = 2.961
  CI (99.9%): [35.677, 52.282] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:05:38
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:50
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

# Run progress: 86.96% complete, ETA 00:04:04
# Fork: 1 of 2
# Warmup Iteration   1: 24.428 ms/op
# Warmup Iteration   2: 20.746 ms/op
Iteration   1: 20.377 ms/op
Iteration   2: 20.159 ms/op
Iteration   3: 20.040 ms/op

# Run progress: 89.13% complete, ETA 00:03:20
# Fork: 2 of 2
# Warmup Iteration   1: 24.898 ms/op
# Warmup Iteration   2: 21.162 ms/op
Iteration   1: 21.236 ms/op
Iteration   2: 20.238 ms/op
Iteration   3: 20.204 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  20.376 ±(99.9%) 1.221 ms/op [Average]
  (min, avg, max) = (20.040, 20.376, 21.236), stdev = 0.435
  CI (99.9%): [19.155, 21.597] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:37
# Fork: 1 of 2
# Warmup Iteration   1: 9.477 ms/op
# Warmup Iteration   2: 7.869 ms/op
Iteration   1: 7.755 ms/op
Iteration   2: 7.657 ms/op
Iteration   3: 7.627 ms/op

# Run progress: 93.48% complete, ETA 00:01:56
# Fork: 2 of 2
# Warmup Iteration   1: 11.477 ms/op
# Warmup Iteration   2: 8.719 ms/op
Iteration   1: 7.752 ms/op
Iteration   2: 7.649 ms/op
Iteration   3: 7.624 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  7.677 ±(99.9%) 0.169 ms/op [Average]
  (min, avg, max) = (7.624, 7.677, 7.755), stdev = 0.060
  CI (99.9%): [7.508, 7.846] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:16
# Fork: 1 of 2
# Warmup Iteration   1: 16.518 ms/op
# Warmup Iteration   2: 15.042 ms/op
Iteration   1: 15.011 ms/op
Iteration   2: 15.022 ms/op
Iteration   3: 15.080 ms/op

# Run progress: 97.83% complete, ETA 00:00:37
# Fork: 2 of 2
# Warmup Iteration   1: 16.683 ms/op
# Warmup Iteration   2: 15.091 ms/op
Iteration   1: 15.034 ms/op
Iteration   2: 15.996 ms/op
Iteration   3: 16.976 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  15.520 ±(99.9%) 2.272 ms/op [Average]
  (min, avg, max) = (15.011, 15.520, 16.976), stdev = 0.810
  CI (99.9%): [13.248, 17.792] (assumes normal distribution)


# Run complete. Total time: 00:28:18

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     14.084 ±     0.708  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.106 ±     0.150  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.599 ±     0.195  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      5.082 ±     0.920  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      8.749 ±     0.643  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    279.001 ±    35.414  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    325.963 ±    90.237  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    329.399 ±    21.187  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    754.376 ±    64.308  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.086 ±     0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.723 ±     0.752  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.589 ±     0.057  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.376 ±     0.183  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     11.799 ±     7.752  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  55083.423 ±  1942.683  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  11700.553 ± 12557.714  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   5165.393 ±   328.330  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     40.296 ±     3.571  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     43.980 ±     8.303  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     20.376 ±     1.221  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      7.677 ±     0.169  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     15.520 ±     2.272  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.20.0 -> 3.21.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 10 lower, 13 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 11.5798 | 20.3757 | +75.96% | Separate CIs |
| process.Compressor_Benchmark.compressorprocess | 10.2804 | 11.7993 | +14.77% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 8.43199 | 7.67709 | -8.95% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000247709 | 0.000232178 | -6.27% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 794.941 | 754.376 | -5.10% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 41.9448 | 43.9798 | +4.85% | Overlapping CIs |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 13.4922 | 14.0838 | +4.38% | Overlapping CIs |
| flash.TPflash.testFlash | 268.627 | 279.001 | +3.86% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.77767 | 4.59907 | -3.74% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 4.91645 | 5.08177 | +3.36% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
