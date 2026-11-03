# NeqSim 3.20.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.19.0 |
| Current | 3.20.0 |
| Source commit | `26c1c44abbeb1ebfabbe9e4ddbf4831fcf45ae4a` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41643633307) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "26c1c44abbeb1ebfabbe9e4ddbf4831fcf45ae4a",
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
Address sizes:                           48 bits physical, 57 bits virtual
Byte Order:                              Little Endian
CPU(s):                                  2
On-line CPU(s) list:                     0,1
Vendor ID:                               GenuineIntel
Model name:                              Intel(R) Xeon(R) 6973P-C
CPU family:                              6
Model:                                   173
Thread(s) per core:                      2
Core(s) per socket:                      1
Socket(s):                               1
Stepping:                                1
CPU(s) scaling MHz:                      162%
CPU max MHz:                             2600.0000
CPU min MHz:                             800.0000
BogoMIPS:                                5200.00
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ss ht syscall nx pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology tsc_reliable nonstop_tsc cpuid aperfmperf tsc_known_freq pni pclmulqdq vmx ssse3 fma cx16 pcid sse4_1 sse4_2 x2apic movbe popcnt tsc_deadline_timer aes xsave avx f16c rdrand hypervisor lahf_lm abm 3dnowprefetch tpr_shadow ept vpid ept_ad fsgsbase tsc_adjust bmi1 hle avx2 smep bmi2 erms invpcid rtm avx512f avx512dq rdseed adx smap avx512ifma clflushopt clwb avx512cd sha_ni avx512bw avx512vl xsaveopt xsavec xgetbv1 xsaves user_shstk avx_vnni avx512_bf16 vnmi avx512vbmi umip waitpkg avx512_vbmi2 gfni vaes vpclmulqdq avx512_vnni avx512_bitalg avx512_vpopcntdq la57 rdpid cldemote movdiri movdir64b fsrm serialize tsxldtrk ibt amx_bf16 avx512_fp16 amx_tile amx_int8 arch_capabilities
Virtualization:                          VT-x
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               48 KiB (1 instance)
L1i cache:                               64 KiB (1 instance)
L2 cache:                                2 MiB (1 instance)
L3 cache:                                480 MiB (1 instance)
NUMA node(s):                            1
NUMA node0 CPU(s):                       0,1
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
[INFO] Total time:  8.276 s
[INFO] Finished at: 2026-11-03T13:22:14Z
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
tpFlashLeanGas                                                 60.0000  (50 ms)
tpFlashWellFluidSrk                                            83.6406  (69 ms)
tpFlashWellFluidPr                                             83.6541  (42 ms)
tpFlashWellFluidWithProperties                                 5445.46  (75 ms)
phAndPsFlashWellFluid                                          2459.23  (103 ms)
Nov 03, 2026 1:22:27 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 1:22:27 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (567 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (214 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (75 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (41 ms)
saturationPointsWellFluid                                      1601.32  (75 ms)
singlePhaseGasPipelineSteadyState                              121.628  (907 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1065 ms)
levenbergMarquardtAntoine                                      1837.31  (7 ms)
levenbergMarquardtDoubleExponential                            5.57177  (5 ms)
dataReconciliation[20]                                         7.89841  (16 ms)
dataReconciliation[100]                                        37.0132  (73 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.607 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.512 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.024 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 242375 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 30 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    6.30e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.84e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     3.73e-03 (tolerance: 1.00e-02) OK [worst: compressor process A::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.84e-03 after 30 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
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
1st stage gas A 5.309 MSm3/d, export gas 19.387 MSm3/d, KA27841 A 103.0 bara, pipeline outlet 51.8 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 242.4 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 10518 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.52 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  04:39 min
[INFO] Finished at: 2026-11-03T13:26:55Z
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
# Warmup Iteration   1: 26.036 ms/op
# Warmup Iteration   2: 13.869 ms/op
Iteration   1: 13.433 ms/op
Iteration   2: 13.227 ms/op
Iteration   3: 13.255 ms/op

# Run progress: 2.17% complete, ETA 00:08:54
# Fork: 2 of 2
# Warmup Iteration   1: 30.518 ms/op
# Warmup Iteration   2: 14.969 ms/op
Iteration   1: 12.944 ms/op
Iteration   2: 12.858 ms/op
Iteration   3: 12.731 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  13.075 ±(99.9%) 0.759 ms/op [Average]
  (min, avg, max) = (12.731, 13.075, 13.433), stdev = 0.271
  CI (99.9%): [12.316, 13.834] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:37
# Fork: 1 of 2
# Warmup Iteration   1: 2.344 ms/op
# Warmup Iteration   2: 1.177 ms/op
Iteration   1: 1.203 ms/op
Iteration   2: 1.212 ms/op
Iteration   3: 1.117 ms/op

# Run progress: 6.52% complete, ETA 00:08:24
# Fork: 2 of 2
# Warmup Iteration   1: 2.545 ms/op
# Warmup Iteration   2: 1.223 ms/op
Iteration   1: 1.058 ms/op
Iteration   2: 1.070 ms/op
Iteration   3: 1.055 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.119 ±(99.9%) 0.201 ms/op [Average]
  (min, avg, max) = (1.055, 1.119, 1.212), stdev = 0.072
  CI (99.9%): [0.918, 1.320] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 11.806 ms/op
# Warmup Iteration   2: 5.967 ms/op
Iteration   1: 4.703 ms/op
Iteration   2: 4.830 ms/op
Iteration   3: 4.811 ms/op

# Run progress: 10.87% complete, ETA 00:08:00
# Fork: 2 of 2
# Warmup Iteration   1: 10.898 ms/op
# Warmup Iteration   2: 6.442 ms/op
Iteration   1: 5.245 ms/op
Iteration   2: 5.376 ms/op
Iteration   3: 4.946 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.985 ±(99.9%) 0.748 ms/op [Average]
  (min, avg, max) = (4.703, 4.985, 5.376), stdev = 0.267
  CI (99.9%): [4.237, 5.733] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 11.666 ms/op
# Warmup Iteration   2: 5.663 ms/op
Iteration   1: 4.939 ms/op
Iteration   2: 4.896 ms/op
Iteration   3: 4.918 ms/op

# Run progress: 15.22% complete, ETA 00:07:36
# Fork: 2 of 2
# Warmup Iteration   1: 12.179 ms/op
# Warmup Iteration   2: 8.249 ms/op
Iteration   1: 5.702 ms/op
Iteration   2: 4.776 ms/op
Iteration   3: 4.997 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  5.038 ±(99.9%) 0.934 ms/op [Average]
  (min, avg, max) = (4.776, 5.038, 5.702), stdev = 0.333
  CI (99.9%): [4.104, 5.973] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 24.161 ms/op
# Warmup Iteration   2: 13.377 ms/op
Iteration   1: 9.621 ms/op
Iteration   2: 8.555 ms/op
Iteration   3: 8.574 ms/op

# Run progress: 19.57% complete, ETA 00:07:12
# Fork: 2 of 2
# Warmup Iteration   1: 20.357 ms/op
# Warmup Iteration   2: 11.456 ms/op
Iteration   1: 9.015 ms/op
Iteration   2: 8.742 ms/op
Iteration   3: 8.460 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  8.828 ±(99.9%) 1.220 ms/op [Average]
  (min, avg, max) = (8.460, 8.828, 9.621), stdev = 0.435
  CI (99.9%): [7.608, 10.047] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1366.634 ms/op
# Warmup Iteration   2: 424.997 ms/op
Iteration   1: 308.272 ms/op
Iteration   2: 284.782 ms/op
Iteration   3: 306.436 ms/op

# Run progress: 23.91% complete, ETA 00:06:49
# Fork: 2 of 2
# Warmup Iteration   1: 2107.565 ms/op
# Warmup Iteration   2: 559.600 ms/op
Iteration   1: 326.186 ms/op
Iteration   2: 288.271 ms/op
Iteration   3: 274.125 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  298.012 ±(99.9%) 53.361 ms/op [Average]
  (min, avg, max) = (274.125, 298.012, 326.186), stdev = 19.029
  CI (99.9%): [244.651, 351.373] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:35
# Fork: 1 of 2
# Warmup Iteration   1: 2204.166 ms/op
# Warmup Iteration   2: 737.553 ms/op
Iteration   1: 516.145 ms/op
Iteration   2: 407.127 ms/op
Iteration   3: 416.239 ms/op

# Run progress: 28.26% complete, ETA 00:06:23
# Fork: 2 of 2
# Warmup Iteration   1: 2116.646 ms/op
# Warmup Iteration   2: 756.441 ms/op
Iteration   1: 528.590 ms/op
Iteration   2: 452.376 ms/op
Iteration   3: 433.178 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  458.943 ±(99.9%) 144.834 ms/op [Average]
  (min, avg, max) = (407.127, 458.943, 528.590), stdev = 51.649
  CI (99.9%): [314.108, 603.777] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:10
# Fork: 1 of 2
# Warmup Iteration   1: 790.091 ms/op
# Warmup Iteration   2: 365.564 ms/op
Iteration   1: 351.536 ms/op
Iteration   2: 338.917 ms/op
Iteration   3: 333.742 ms/op

# Run progress: 32.61% complete, ETA 00:05:57
# Fork: 2 of 2
# Warmup Iteration   1: 1063.769 ms/op
# Warmup Iteration   2: 376.865 ms/op
Iteration   1: 339.987 ms/op
Iteration   2: 328.280 ms/op
Iteration   3: 324.965 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  336.238 ±(99.9%) 26.659 ms/op [Average]
  (min, avg, max) = (324.965, 336.238, 351.536), stdev = 9.507
  CI (99.9%): [309.579, 362.897] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2204.371 ms/op
# Warmup Iteration   2: 844.644 ms/op
Iteration   1: 941.481 ms/op
Iteration   2: 835.419 ms/op
Iteration   3: 789.942 ms/op

# Run progress: 36.96% complete, ETA 00:05:35
# Fork: 2 of 2
# Warmup Iteration   1: 2126.665 ms/op
# Warmup Iteration   2: 860.548 ms/op
Iteration   1: 949.986 ms/op
Iteration   2: 813.022 ms/op
Iteration   3: 827.093 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  859.491 ±(99.9%) 192.397 ms/op [Average]
  (min, avg, max) = (789.942, 859.491, 949.986), stdev = 68.611
  CI (99.9%): [667.093, 1051.888] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:26
# Fork: 1 of 2
# Warmup Iteration   1: 0.238 ms/op
# Warmup Iteration   2: 0.089 ms/op
Iteration   1: 0.086 ms/op
Iteration   2: 0.086 ms/op
Iteration   3: 0.096 ms/op

# Run progress: 41.30% complete, ETA 00:05:12
# Fork: 2 of 2
# Warmup Iteration   1: 0.227 ms/op
# Warmup Iteration   2: 0.089 ms/op
Iteration   1: 0.086 ms/op
Iteration   2: 0.086 ms/op
Iteration   3: 0.086 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.088 ±(99.9%) 0.012 ms/op [Average]
  (min, avg, max) = (0.086, 0.088, 0.096), stdev = 0.004
  CI (99.9%): [0.076, 0.100] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:04:59
# Fork: 1 of 2
# Warmup Iteration   1: 10.085 ms/op
# Warmup Iteration   2: 6.659 ms/op
Iteration   1: 6.453 ms/op
Iteration   2: 6.437 ms/op
Iteration   3: 7.210 ms/op

# Run progress: 45.65% complete, ETA 00:04:46
# Fork: 2 of 2
# Warmup Iteration   1: 11.719 ms/op
# Warmup Iteration   2: 6.670 ms/op
Iteration   1: 6.452 ms/op
Iteration   2: 6.427 ms/op
Iteration   3: 6.396 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.563 ±(99.9%) 0.891 ms/op [Average]
  (min, avg, max) = (6.396, 6.563, 7.210), stdev = 0.318
  CI (99.9%): [5.671, 7.454] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:33
# Fork: 1 of 2
# Warmup Iteration   1: 0.939 ms/op
# Warmup Iteration   2: 0.613 ms/op
Iteration   1: 0.608 ms/op
Iteration   2: 0.689 ms/op
Iteration   3: 0.705 ms/op

# Run progress: 50.00% complete, ETA 00:04:20
# Fork: 2 of 2
# Warmup Iteration   1: 0.946 ms/op
# Warmup Iteration   2: 0.637 ms/op
Iteration   1: 0.597 ms/op
Iteration   2: 0.646 ms/op
Iteration   3: 0.597 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.640 ±(99.9%) 0.133 ms/op [Average]
  (min, avg, max) = (0.597, 0.640, 0.705), stdev = 0.048
  CI (99.9%): [0.507, 0.774] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:08
# Fork: 1 of 2
# Warmup Iteration   1: 2.076 ms/op
# Warmup Iteration   2: 1.510 ms/op
Iteration   1: 1.598 ms/op
Iteration   2: 1.438 ms/op
Iteration   3: 1.367 ms/op

# Run progress: 54.35% complete, ETA 00:03:56
# Fork: 2 of 2
# Warmup Iteration   1: 2.076 ms/op
# Warmup Iteration   2: 1.435 ms/op
Iteration   1: 1.424 ms/op
Iteration   2: 1.391 ms/op
Iteration   3: 1.370 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.431 ±(99.9%) 0.243 ms/op [Average]
  (min, avg, max) = (1.367, 1.431, 1.598), stdev = 0.087
  CI (99.9%): [1.188, 1.674] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:44
# Fork: 1 of 2
# Warmup Iteration   1: 154.713 ms/op
# Warmup Iteration   2: 36.582 ms/op
Iteration   1: 25.267 ms/op
Iteration   2: 24.291 ms/op
Iteration   3: 22.004 ms/op

# Run progress: 58.70% complete, ETA 00:03:32
# Fork: 2 of 2
# Warmup Iteration   1: 157.190 ms/op
# Warmup Iteration   2: 33.730 ms/op
Iteration   1: 26.036 ms/op
Iteration   2: 25.186 ms/op
Iteration   3: 21.320 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  24.017 ±(99.9%) 5.380 ms/op [Average]
  (min, avg, max) = (21.320, 24.017, 26.036), stdev = 1.918
  CI (99.9%): [18.638, 29.397] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:20
# Fork: 1 of 2
# Warmup Iteration   1: 63256.067 ms/op
# Warmup Iteration   2: 58684.140 ms/op
Iteration   1: 55154.354 ms/op
Iteration   2: 53268.520 ms/op
Iteration   3: 54654.839 ms/op

# Run progress: 63.04% complete, ETA 00:05:50
# Fork: 2 of 2
# Warmup Iteration   1: 64574.133 ms/op
# Warmup Iteration   2: 56885.553 ms/op
Iteration   1: 55690.478 ms/op
Iteration   2: 55425.249 ms/op
Iteration   3: 54800.809 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  54832.375 ±(99.9%) 2402.345 ms/op [Average]
  (min, avg, max) = (53268.520, 54832.375, 55690.478), stdev = 856.699
  CI (99.9%): [52430.030, 57234.720] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:53
# Fork: 1 of 2
# Warmup Iteration   1: 19181.577 ms/op
# Warmup Iteration   2: 6940.910 ms/op
Iteration   1: 15942.410 ms/op
Iteration   2: 16062.215 ms/op
Iteration   3: 11878.009 ms/op

# Run progress: 67.39% complete, ETA 00:09:31
# Fork: 2 of 2
# Warmup Iteration   1: 16294.782 ms/op
# Warmup Iteration   2: 13913.061 ms/op
Iteration   1: 14767.646 ms/op
Iteration   2: 13667.373 ms/op
Iteration   3: 13066.186 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  14230.640 ±(99.9%) 4655.507 ms/op [Average]
  (min, avg, max) = (11878.009, 14230.640, 16062.215), stdev = 1660.199
  CI (99.9%): [9575.133, 18886.147] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:10:45
# Fork: 1 of 2
# Warmup Iteration   1: 9999.219 ms/op
# Warmup Iteration   2: 6925.441 ms/op
Iteration   1: 6545.896 ms/op
Iteration   2: 6495.169 ms/op
Iteration   3: 5338.140 ms/op

# Run progress: 71.74% complete, ETA 00:09:54
# Fork: 2 of 2
# Warmup Iteration   1: 10498.029 ms/op
# Warmup Iteration   2: 7141.930 ms/op
Iteration   1: 6580.552 ms/op
Iteration   2: 5695.012 ms/op
Iteration   3: 5475.684 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6021.742 ±(99.9%) 1627.096 ms/op [Average]
  (min, avg, max) = (5338.140, 6021.742, 6580.552), stdev = 580.238
  CI (99.9%): [4394.646, 7648.838] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:09:05
# Fork: 1 of 2
# Warmup Iteration   1: Nov 03, 2026 1:52:42 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 1:52:42 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
75.287 ms/op
# Warmup Iteration   2: 49.243 ms/op
Iteration   1: 46.559 ms/op
Iteration   2: 45.443 ms/op
Iteration   3: 45.262 ms/op

# Run progress: 76.09% complete, ETA 00:08:09
# Fork: 2 of 2
# Warmup Iteration   1: Nov 03, 2026 1:52:54 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 1:52:54 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
75.409 ms/op
# Warmup Iteration   2: 41.779 ms/op
Iteration   1: 40.196 ms/op
Iteration   2: 40.005 ms/op
Iteration   3: 45.029 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  43.749 ±(99.9%) 8.063 ms/op [Average]
  (min, avg, max) = (40.005, 43.749, 46.559), stdev = 2.875
  CI (99.9%): [35.686, 51.812] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:07:15
# Fork: 1 of 2
# Warmup Iteration   1: 76.186 ms/op
# Warmup Iteration   2: 42.953 ms/op
Iteration   1: 40.492 ms/op
Iteration   2: 40.787 ms/op
Iteration   3: 39.402 ms/op

# Run progress: 80.43% complete, ETA 00:06:24
# Fork: 2 of 2
# Warmup Iteration   1: 74.657 ms/op
# Warmup Iteration   2: 44.660 ms/op
Iteration   1: 39.127 ms/op
Iteration   2: 39.311 ms/op
Iteration   3: 42.455 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  40.262 ±(99.9%) 3.563 ms/op [Average]
  (min, avg, max) = (39.127, 40.262, 42.455), stdev = 1.270
  CI (99.9%): [36.700, 43.825] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:05:34
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:47
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

# Run progress: 86.96% complete, ETA 00:04:02
# Fork: 1 of 2
# Warmup Iteration   1: 23.378 ms/op
# Warmup Iteration   2: 15.117 ms/op
Iteration   1: 12.689 ms/op
Iteration   2: 12.229 ms/op
Iteration   3: 12.487 ms/op

# Run progress: 89.13% complete, ETA 00:03:18
# Fork: 2 of 2
# Warmup Iteration   1: 23.742 ms/op
# Warmup Iteration   2: 14.191 ms/op
Iteration   1: 13.683 ms/op
Iteration   2: 14.699 ms/op
Iteration   3: 13.262 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  13.175 ±(99.9%) 2.568 ms/op [Average]
  (min, avg, max) = (12.229, 13.175, 14.699), stdev = 0.916
  CI (99.9%): [10.606, 15.743] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:35
# Fork: 1 of 2
# Warmup Iteration   1: 17.201 ms/op
# Warmup Iteration   2: 9.902 ms/op
Iteration   1: 9.091 ms/op
Iteration   2: 8.783 ms/op
Iteration   3: 8.719 ms/op

# Run progress: 93.48% complete, ETA 00:01:54
# Fork: 2 of 2
# Warmup Iteration   1: 19.929 ms/op
# Warmup Iteration   2: 11.172 ms/op
Iteration   1: 10.437 ms/op
Iteration   2: 10.312 ms/op
Iteration   3: 9.663 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.501 ±(99.9%) 2.120 ms/op [Average]
  (min, avg, max) = (8.719, 9.501, 10.437), stdev = 0.756
  CI (99.9%): [7.381, 11.620] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:15
# Fork: 1 of 2
# Warmup Iteration   1: 18.973 ms/op
# Warmup Iteration   2: 15.015 ms/op
Iteration   1: 16.781 ms/op
Iteration   2: 15.513 ms/op
Iteration   3: 15.712 ms/op

# Run progress: 97.83% complete, ETA 00:00:37
# Fork: 2 of 2
# Warmup Iteration   1: 18.910 ms/op
# Warmup Iteration   2: 15.792 ms/op
Iteration   1: 15.028 ms/op
Iteration   2: 15.667 ms/op
Iteration   3: 15.283 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  15.664 ±(99.9%) 1.693 ms/op [Average]
  (min, avg, max) = (15.028, 15.664, 16.781), stdev = 0.604
  CI (99.9%): [13.971, 17.357] (assumes normal distribution)


# Run complete. Total time: 00:28:02

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     13.075 ±    0.759  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.119 ±    0.201  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.985 ±    0.748  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      5.038 ±    0.934  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      8.828 ±    1.220  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    298.012 ±   53.361  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    458.943 ±  144.834  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    336.238 ±   26.659  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    859.491 ±  192.397  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.088 ±    0.012  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.563 ±    0.891  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.640 ±    0.133  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.431 ±    0.243  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     24.017 ±    5.380  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  54832.375 ± 2402.345  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  14230.640 ± 4655.507  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6021.742 ± 1627.096  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     43.749 ±    8.063  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     40.262 ±    3.563  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     13.175 ±    2.568  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.501 ±    2.120  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     15.664 ±    1.693  ms/op

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
[INFO] Total time:  8.965 s
[INFO] Finished at: 2026-11-03T13:55:08Z
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
tpFlashLeanGas                                                 60.0000  (65 ms)
tpFlashWellFluidSrk                                            83.6406  (81 ms)
tpFlashWellFluidPr                                             83.6541  (51 ms)
tpFlashWellFluidWithProperties                                 5445.46  (74 ms)
phAndPsFlashWellFluid                                          2459.23  (64 ms)
Nov 03, 2026 1:55:16 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 1:55:16 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (581 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (212 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (59 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (31 ms)
saturationPointsWellFluid                                      1601.32  (70 ms)
singlePhaseGasPipelineSteadyState                              121.628  (862 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1128 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (6 ms)
dataReconciliation[20]                                         7.89841  (15 ms)
dataReconciliation[100]                                        37.0132  (80 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.395 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.326 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.031 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 277729 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 39 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    3.40e-03 (tolerance: 5.17e-03) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  4.92e-03 (tolerance: 5.17e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     4.66e-04 (tolerance: 5.17e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 4.92e-03 after 39 passes - accepted 5.17e-03 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 5.74e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264307.4 + 377195.8, oil 1995248.7 + 2850298.5, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.414 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.5 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 277.7 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 9448 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.454 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  05:05 min
[INFO] Finished at: 2026-11-03T14:00:15Z
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
# Warmup Iteration   1: 28.022 ms/op
# Warmup Iteration   2: 14.290 ms/op
Iteration   1: 13.049 ms/op
Iteration   2: 13.000 ms/op
Iteration   3: 13.647 ms/op

# Run progress: 2.17% complete, ETA 00:08:56
# Fork: 2 of 2
# Warmup Iteration   1: 27.452 ms/op
# Warmup Iteration   2: 13.570 ms/op
Iteration   1: 13.099 ms/op
Iteration   2: 13.391 ms/op
Iteration   3: 13.992 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  13.363 ±(99.9%) 1.105 ms/op [Average]
  (min, avg, max) = (13.000, 13.363, 13.992), stdev = 0.394
  CI (99.9%): [12.258, 14.468] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:42
# Fork: 1 of 2
# Warmup Iteration   1: 2.429 ms/op
# Warmup Iteration   2: 1.185 ms/op
Iteration   1: 1.095 ms/op
Iteration   2: 1.068 ms/op
Iteration   3: 1.096 ms/op

# Run progress: 6.52% complete, ETA 00:08:30
# Fork: 2 of 2
# Warmup Iteration   1: 2.408 ms/op
# Warmup Iteration   2: 1.577 ms/op
Iteration   1: 1.051 ms/op
Iteration   2: 1.080 ms/op
Iteration   3: 1.088 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.079 ±(99.9%) 0.049 ms/op [Average]
  (min, avg, max) = (1.051, 1.079, 1.096), stdev = 0.018
  CI (99.9%): [1.030, 1.129] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 12.631 ms/op
# Warmup Iteration   2: 6.696 ms/op
Iteration   1: 4.610 ms/op
Iteration   2: 4.767 ms/op
Iteration   3: 4.652 ms/op

# Run progress: 10.87% complete, ETA 00:08:04
# Fork: 2 of 2
# Warmup Iteration   1: 11.804 ms/op
# Warmup Iteration   2: 5.711 ms/op
Iteration   1: 4.588 ms/op
Iteration   2: 4.719 ms/op
Iteration   3: 5.054 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  4.732 ±(99.9%) 0.481 ms/op [Average]
  (min, avg, max) = (4.588, 4.732, 5.054), stdev = 0.172
  CI (99.9%): [4.251, 5.213] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:07:52
# Fork: 1 of 2
# Warmup Iteration   1: 13.293 ms/op
# Warmup Iteration   2: 5.838 ms/op
Iteration   1: 4.833 ms/op
Iteration   2: 4.783 ms/op
Iteration   3: 5.171 ms/op

# Run progress: 15.22% complete, ETA 00:07:40
# Fork: 2 of 2
# Warmup Iteration   1: 14.338 ms/op
# Warmup Iteration   2: 7.170 ms/op
Iteration   1: 4.845 ms/op
Iteration   2: 4.763 ms/op
Iteration   3: 4.805 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  4.867 ±(99.9%) 0.426 ms/op [Average]
  (min, avg, max) = (4.763, 4.867, 5.171), stdev = 0.152
  CI (99.9%): [4.440, 5.293] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 25.378 ms/op
# Warmup Iteration   2: 14.004 ms/op
Iteration   1: 9.624 ms/op
Iteration   2: 8.841 ms/op
Iteration   3: 8.857 ms/op

# Run progress: 19.57% complete, ETA 00:07:17
# Fork: 2 of 2
# Warmup Iteration   1: 25.408 ms/op
# Warmup Iteration   2: 15.030 ms/op
Iteration   1: 10.045 ms/op
Iteration   2: 8.894 ms/op
Iteration   3: 8.600 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  9.143 ±(99.9%) 1.574 ms/op [Average]
  (min, avg, max) = (8.600, 9.143, 10.045), stdev = 0.561
  CI (99.9%): [7.569, 10.717] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1293.408 ms/op
# Warmup Iteration   2: 512.897 ms/op
Iteration   1: 305.931 ms/op
Iteration   2: 286.434 ms/op
Iteration   3: 283.284 ms/op

# Run progress: 23.91% complete, ETA 00:06:52
# Fork: 2 of 2
# Warmup Iteration   1: 2131.474 ms/op
# Warmup Iteration   2: 582.874 ms/op
Iteration   1: 358.280 ms/op
Iteration   2: 297.298 ms/op
Iteration   3: 324.013 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  309.207 ±(99.9%) 79.021 ms/op [Average]
  (min, avg, max) = (283.284, 309.207, 358.280), stdev = 28.180
  CI (99.9%): [230.185, 388.228] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2152.965 ms/op
# Warmup Iteration   2: 751.211 ms/op
Iteration   1: 456.196 ms/op
Iteration   2: 400.145 ms/op
Iteration   3: 408.861 ms/op

# Run progress: 28.26% complete, ETA 00:06:26
# Fork: 2 of 2
# Warmup Iteration   1: 2235.757 ms/op
# Warmup Iteration   2: 726.386 ms/op
Iteration   1: 422.305 ms/op
Iteration   2: 386.770 ms/op
Iteration   3: 364.403 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  406.446 ±(99.9%) 88.025 ms/op [Average]
  (min, avg, max) = (364.403, 406.446, 456.196), stdev = 31.391
  CI (99.9%): [318.421, 494.471] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:13
# Fork: 1 of 2
# Warmup Iteration   1: 1012.236 ms/op
# Warmup Iteration   2: 365.298 ms/op
Iteration   1: 362.083 ms/op
Iteration   2: 327.001 ms/op
Iteration   3: 326.192 ms/op

# Run progress: 32.61% complete, ETA 00:06:00
# Fork: 2 of 2
# Warmup Iteration   1: 1050.412 ms/op
# Warmup Iteration   2: 402.099 ms/op
Iteration   1: 336.334 ms/op
Iteration   2: 331.306 ms/op
Iteration   3: 323.810 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  334.455 ±(99.9%) 39.932 ms/op [Average]
  (min, avg, max) = (323.810, 334.455, 362.083), stdev = 14.240
  CI (99.9%): [294.522, 374.387] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:05:48
# Fork: 1 of 2
# Warmup Iteration   1: 2166.917 ms/op
# Warmup Iteration   2: 833.347 ms/op
Iteration   1: 892.148 ms/op
Iteration   2: 899.006 ms/op
Iteration   3: 815.707 ms/op

# Run progress: 36.96% complete, ETA 00:05:38
# Fork: 2 of 2
# Warmup Iteration   1: 2257.344 ms/op
# Warmup Iteration   2: 900.551 ms/op
Iteration   1: 886.980 ms/op
Iteration   2: 755.275 ms/op
Iteration   3: 822.760 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  845.313 ±(99.9%) 160.132 ms/op [Average]
  (min, avg, max) = (755.275, 845.313, 899.006), stdev = 57.104
  CI (99.9%): [685.181, 1005.444] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:28
# Fork: 1 of 2
# Warmup Iteration   1: 0.178 ms/op
# Warmup Iteration   2: 0.086 ms/op
Iteration   1: 0.087 ms/op
Iteration   2: 0.085 ms/op
Iteration   3: 0.088 ms/op

# Run progress: 41.30% complete, ETA 00:05:14
# Fork: 2 of 2
# Warmup Iteration   1: 0.206 ms/op
# Warmup Iteration   2: 0.089 ms/op
Iteration   1: 0.091 ms/op
Iteration   2: 0.086 ms/op
Iteration   3: 0.086 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.087 ±(99.9%) 0.006 ms/op [Average]
  (min, avg, max) = (0.085, 0.087, 0.091), stdev = 0.002
  CI (99.9%): [0.081, 0.094] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:01
# Fork: 1 of 2
# Warmup Iteration   1: 10.376 ms/op
# Warmup Iteration   2: 7.093 ms/op
Iteration   1: 6.812 ms/op
Iteration   2: 7.253 ms/op
Iteration   3: 6.400 ms/op

# Run progress: 45.65% complete, ETA 00:04:47
# Fork: 2 of 2
# Warmup Iteration   1: 10.171 ms/op
# Warmup Iteration   2: 6.742 ms/op
Iteration   1: 6.439 ms/op
Iteration   2: 7.161 ms/op
Iteration   3: 7.310 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  6.896 ±(99.9%) 1.143 ms/op [Average]
  (min, avg, max) = (6.400, 6.896, 7.310), stdev = 0.408
  CI (99.9%): [5.752, 8.039] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:35
# Fork: 1 of 2
# Warmup Iteration   1: 1.057 ms/op
# Warmup Iteration   2: 0.699 ms/op
Iteration   1: 0.627 ms/op
Iteration   2: 0.616 ms/op
Iteration   3: 0.649 ms/op

# Run progress: 50.00% complete, ETA 00:04:22
# Fork: 2 of 2
# Warmup Iteration   1: 0.964 ms/op
# Warmup Iteration   2: 0.628 ms/op
Iteration   1: 0.603 ms/op
Iteration   2: 0.613 ms/op
Iteration   3: 0.599 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.618 ±(99.9%) 0.051 ms/op [Average]
  (min, avg, max) = (0.599, 0.618, 0.649), stdev = 0.018
  CI (99.9%): [0.567, 0.669] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:09
# Fork: 1 of 2
# Warmup Iteration   1: 2.087 ms/op
# Warmup Iteration   2: 1.482 ms/op
Iteration   1: 1.432 ms/op
Iteration   2: 1.464 ms/op
Iteration   3: 1.390 ms/op

# Run progress: 54.35% complete, ETA 00:03:57
# Fork: 2 of 2
# Warmup Iteration   1: 2.019 ms/op
# Warmup Iteration   2: 1.535 ms/op
Iteration   1: 1.477 ms/op
Iteration   2: 1.352 ms/op
Iteration   3: 1.350 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.411 ±(99.9%) 0.155 ms/op [Average]
  (min, avg, max) = (1.350, 1.411, 1.477), stdev = 0.055
  CI (99.9%): [1.256, 1.566] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:45
# Fork: 1 of 2
# Warmup Iteration   1: 168.676 ms/op
# Warmup Iteration   2: 39.342 ms/op
Iteration   1: 25.994 ms/op
Iteration   2: 23.433 ms/op
Iteration   3: 26.233 ms/op

# Run progress: 58.70% complete, ETA 00:03:33
# Fork: 2 of 2
# Warmup Iteration   1: 136.954 ms/op
# Warmup Iteration   2: 38.531 ms/op
Iteration   1: 28.674 ms/op
Iteration   2: 24.522 ms/op
Iteration   3: 23.923 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  25.463 ±(99.9%) 5.403 ms/op [Average]
  (min, avg, max) = (23.433, 25.463, 28.674), stdev = 1.927
  CI (99.9%): [20.061, 30.866] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:21
# Fork: 1 of 2
# Warmup Iteration   1: 63154.196 ms/op
# Warmup Iteration   2: 57495.459 ms/op
Iteration   1: 54052.823 ms/op
Iteration   2: 54374.292 ms/op
Iteration   3: 53849.097 ms/op

# Run progress: 63.04% complete, ETA 00:05:50
# Fork: 2 of 2
# Warmup Iteration   1: 65932.668 ms/op
# Warmup Iteration   2: 56640.038 ms/op
Iteration   1: 55457.582 ms/op
Iteration   2: 55009.152 ms/op
Iteration   3: 55110.805 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  54642.292 ±(99.9%) 1803.092 ms/op [Average]
  (min, avg, max) = (53849.097, 54642.292, 55457.582), stdev = 643.000
  CI (99.9%): [52839.200, 56445.384] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:07:53
# Fork: 1 of 2
# Warmup Iteration   1: 14559.147 ms/op
# Warmup Iteration   2: 14512.022 ms/op
Iteration   1: 12533.423 ms/op
Iteration   2: 12747.361 ms/op
Iteration   3: 9528.212 ms/op

# Run progress: 67.39% complete, ETA 00:09:43
# Fork: 2 of 2
# Warmup Iteration   1: 12635.595 ms/op
# Warmup Iteration   2: 13316.213 ms/op
Iteration   1: 11584.291 ms/op
Iteration   2: 10291.760 ms/op
Iteration   3: 10186.652 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  11145.283 ±(99.9%) 3751.475 ms/op [Average]
  (min, avg, max) = (9528.212, 11145.283, 12747.361), stdev = 1337.812
  CI (99.9%): [7393.808, 14896.758] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:11:03
# Fork: 1 of 2
# Warmup Iteration   1: 10329.125 ms/op
# Warmup Iteration   2: 6560.985 ms/op
Iteration   1: 6725.866 ms/op
Iteration   2: 6088.769 ms/op
Iteration   3: 5434.640 ms/op

# Run progress: 71.74% complete, ETA 00:10:11
# Fork: 2 of 2
# Warmup Iteration   1: 10774.550 ms/op
# Warmup Iteration   2: 6844.967 ms/op
Iteration   1: 7033.659 ms/op
Iteration   2: 6556.140 ms/op
Iteration   3: 5377.825 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  6202.817 ±(99.9%) 1931.607 ms/op [Average]
  (min, avg, max) = (5377.825, 6202.817, 7033.659), stdev = 688.830
  CI (99.9%): [4271.210, 8134.423] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:09:20
# Fork: 1 of 2
# Warmup Iteration   1: Nov 03, 2026 2:26:46 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 2:26:46 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
83.808 ms/op
# Warmup Iteration   2: 47.738 ms/op
Iteration   1: 47.184 ms/op
Iteration   2: 46.132 ms/op
Iteration   3: 47.031 ms/op

# Run progress: 76.09% complete, ETA 00:08:22
# Fork: 2 of 2
# Warmup Iteration   1: Nov 03, 2026 2:26:57 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 2:26:57 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
77.669 ms/op
# Warmup Iteration   2: 48.143 ms/op
Iteration   1: 47.482 ms/op
Iteration   2: 44.871 ms/op
Iteration   3: 45.772 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  46.412 ±(99.9%) 2.801 ms/op [Average]
  (min, avg, max) = (44.871, 46.412, 47.482), stdev = 0.999
  CI (99.9%): [43.611, 49.213] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:07:27
# Fork: 1 of 2
# Warmup Iteration   1: 84.308 ms/op
# Warmup Iteration   2: 42.950 ms/op
Iteration   1: 39.372 ms/op
Iteration   2: 39.160 ms/op
Iteration   3: 39.169 ms/op

# Run progress: 80.43% complete, ETA 00:06:34
# Fork: 2 of 2
# Warmup Iteration   1: 105.701 ms/op
# Warmup Iteration   2: 43.262 ms/op
Iteration   1: 46.868 ms/op
Iteration   2: 49.280 ms/op
Iteration   3: 46.202 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  43.342 ±(99.9%) 12.944 ms/op [Average]
  (min, avg, max) = (39.160, 43.342, 49.280), stdev = 4.616
  CI (99.9%): [30.398, 56.286] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:05:44
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻⁴ ms/op
# Warmup Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   1: ≈ 10⁻⁴ ms/op
Iteration   2: ≈ 10⁻⁴ ms/op
Iteration   3: ≈ 10⁻⁴ ms/op

# Run progress: 84.78% complete, ETA 00:04:55
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

# Run progress: 86.96% complete, ETA 00:04:08
# Fork: 1 of 2
# Warmup Iteration   1: 23.519 ms/op
# Warmup Iteration   2: 15.057 ms/op
Iteration   1: 13.284 ms/op
Iteration   2: 15.019 ms/op
Iteration   3: 13.394 ms/op

# Run progress: 89.13% complete, ETA 00:03:23
# Fork: 2 of 2
# Warmup Iteration   1: 23.268 ms/op
# Warmup Iteration   2: 14.306 ms/op
Iteration   1: 13.423 ms/op
Iteration   2: 13.817 ms/op
Iteration   3: 13.506 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  13.740 ±(99.9%) 1.828 ms/op [Average]
  (min, avg, max) = (13.284, 13.740, 15.019), stdev = 0.652
  CI (99.9%): [11.912, 15.568] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:02:40
# Fork: 1 of 2
# Warmup Iteration   1: 16.092 ms/op
# Warmup Iteration   2: 9.395 ms/op
Iteration   1: 9.151 ms/op
Iteration   2: 8.124 ms/op
Iteration   3: 8.412 ms/op

# Run progress: 93.48% complete, ETA 00:01:58
# Fork: 2 of 2
# Warmup Iteration   1: 19.155 ms/op
# Warmup Iteration   2: 13.043 ms/op
Iteration   1: 10.911 ms/op
Iteration   2: 10.720 ms/op
Iteration   3: 9.946 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  9.544 ±(99.9%) 3.286 ms/op [Average]
  (min, avg, max) = (8.124, 9.544, 10.911), stdev = 1.172
  CI (99.9%): [6.258, 12.830] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:17
# Fork: 1 of 2
# Warmup Iteration   1: 19.207 ms/op
# Warmup Iteration   2: 15.850 ms/op
Iteration   1: 14.997 ms/op
Iteration   2: 15.710 ms/op
Iteration   3: 15.280 ms/op

# Run progress: 97.83% complete, ETA 00:00:38
# Fork: 2 of 2
# Warmup Iteration   1: 19.035 ms/op
# Warmup Iteration   2: 15.313 ms/op
Iteration   1: 14.995 ms/op
Iteration   2: 16.131 ms/op
Iteration   3: 14.959 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  15.345 ±(99.9%) 1.344 ms/op [Average]
  (min, avg, max) = (14.959, 15.345, 16.131), stdev = 0.479
  CI (99.9%): [14.002, 16.689] (assumes normal distribution)


# Run complete. Total time: 00:28:46

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     13.363 ±    1.105  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.079 ±    0.049  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      4.732 ±    0.481  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      4.867 ±    0.426  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      9.143 ±    1.574  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    309.207 ±   79.021  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    406.446 ±   88.025  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    334.455 ±   39.932  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    845.313 ±  160.132  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.087 ±    0.006  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      6.896 ±    1.143  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.618 ±    0.051  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.411 ±    0.155  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     25.463 ±    5.403  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  54642.292 ± 1803.092  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  11145.283 ± 3751.475  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   6202.817 ± 1931.607  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     46.412 ±    2.801  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     43.342 ±   12.944  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻⁴             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     13.740 ±    1.828  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      9.544 ±    3.286  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     15.345 ±    1.344  ms/op

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
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 14230.6 | 11145.3 | -21.68% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 458.943 | 406.446 | -11.44% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 40.2624 | 43.3419 | +7.65% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Full Gradient Theory) | 43.749 | 46.4121 | +6.09% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 24.0174 | 25.4634 | +6.02% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 4.98527 | 4.73176 | -5.09% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 6.56253 | 6.89586 | +5.08% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 13.1748 | 13.7404 | +4.29% | Overlapping CIs |
| flash.TPflash.testFlash | 298.012 | 309.207 | +3.76% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidWithProperties | 8.82777 | 9.1434 | +3.58% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
