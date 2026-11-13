# NeqSim 3.25.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.23.0 |
| Current | 3.25.0 |
| Source commit | `6384e0d0e807ec2904366f3da61b544d60a91feb` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/43408114341) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "6384e0d0e807ec2904366f3da61b544d60a91feb",
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
Linux runnervmccnms 7.0.0-1019-azure #20-Ubuntu SMP PREEMPT Mon Oct 19 22:41:16 UTC 2026 x86_64 GNU/Linux
Architecture:                            x86_64
CPU op-mode(s):                          32-bit, 64-bit
Address sizes:                           48 bits physical, 48 bits virtual
Byte Order:                              Little Endian
CPU(s):                                  4
On-line CPU(s) list:                     0-3
Vendor ID:                               AuthenticAMD
Model name:                              AMD EPYC 7763 64-Core Processor
CPU family:                              25
Model:                                   1
Thread(s) per core:                      2
Core(s) per socket:                      2
Socket(s):                               1
Stepping:                                1
BogoMIPS:                                4890.85
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid rdseed adx smap clflushopt clwb sha_ni xsaveopt xsavec xgetbv1 xsaves user_shstk clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload umip vaes vpclmulqdq rdpid fsrm
Virtualization:                          AMD-V
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               64 KiB (2 instances)
L1i cache:                               64 KiB (2 instances)
L2 cache:                                1 MiB (2 instances)
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
[INFO] Total time:  4.226 s
[INFO] Finished at: 2026-11-13T10:18:33Z
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
TEG full process: 11039 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 11.08 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.339 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.073 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 503204 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 32 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    5.52e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.84e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     6.66e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.84e-03 after 32 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 503.2 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (11 ms)
tpFlashWellFluidSrk                                            83.6406  (78 ms)
tpFlashWellFluidPr                                             83.6541  (56 ms)
tpFlashWellFluidWithProperties                                 5445.46  (72 ms)
phAndPsFlashWellFluid                                          2459.23  (149 ms)
Nov 13, 2026 10:27:23 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 10:27:23 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (963 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (286 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (220 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (55 ms)
saturationPointsWellFluid                                      1601.32  (158 ms)
singlePhaseGasPipelineSteadyState                              121.628  (886 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1649 ms)
levenbergMarquardtAntoine                                      1837.31  (8 ms)
levenbergMarquardtDoubleExponential                            5.57177  (9 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (10 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.453 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  09:03 min
[INFO] Finished at: 2026-11-13T10:27:37Z
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
# Warmup Iteration   1: 32.428 ms/op
# Warmup Iteration   2: 23.284 ms/op
Iteration   1: 22.757 ms/op
Iteration   2: 22.655 ms/op
Iteration   3: 22.762 ms/op

# Run progress: 2.17% complete, ETA 00:09:06
# Fork: 2 of 2
# Warmup Iteration   1: 31.332 ms/op
# Warmup Iteration   2: 22.679 ms/op
Iteration   1: 22.535 ms/op
Iteration   2: 22.551 ms/op
Iteration   3: 22.587 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  22.641 ±(99.9%) 0.283 ms/op [Average]
  (min, avg, max) = (22.535, 22.641, 22.762), stdev = 0.101
  CI (99.9%): [22.358, 22.924] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:59
# Fork: 1 of 2
# Warmup Iteration   1: 2.851 ms/op
# Warmup Iteration   2: 1.511 ms/op
Iteration   1: 1.508 ms/op
Iteration   2: 1.461 ms/op
Iteration   3: 1.466 ms/op

# Run progress: 6.52% complete, ETA 00:08:44
# Fork: 2 of 2
# Warmup Iteration   1: 3.032 ms/op
# Warmup Iteration   2: 1.532 ms/op
Iteration   1: 1.531 ms/op
Iteration   2: 1.479 ms/op
Iteration   3: 1.484 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.488 ±(99.9%) 0.075 ms/op [Average]
  (min, avg, max) = (1.461, 1.488, 1.531), stdev = 0.027
  CI (99.9%): [1.413, 1.563] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:30
# Fork: 1 of 2
# Warmup Iteration   1: 13.825 ms/op
# Warmup Iteration   2: 7.384 ms/op
Iteration   1: 7.293 ms/op
Iteration   2: 7.288 ms/op
Iteration   3: 7.243 ms/op

# Run progress: 10.87% complete, ETA 00:08:17
# Fork: 2 of 2
# Warmup Iteration   1: 9.978 ms/op
# Warmup Iteration   2: 7.396 ms/op
Iteration   1: 7.245 ms/op
Iteration   2: 7.247 ms/op
Iteration   3: 7.282 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.266 ±(99.9%) 0.066 ms/op [Average]
  (min, avg, max) = (7.243, 7.266, 7.293), stdev = 0.023
  CI (99.9%): [7.201, 7.332] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:08:04
# Fork: 1 of 2
# Warmup Iteration   1: 12.352 ms/op
# Warmup Iteration   2: 7.898 ms/op
Iteration   1: 7.774 ms/op
Iteration   2: 7.807 ms/op
Iteration   3: 7.747 ms/op

# Run progress: 15.22% complete, ETA 00:07:53
# Fork: 2 of 2
# Warmup Iteration   1: 11.242 ms/op
# Warmup Iteration   2: 7.982 ms/op
Iteration   1: 7.890 ms/op
Iteration   2: 7.932 ms/op
Iteration   3: 7.879 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  7.838 ±(99.9%) 0.204 ms/op [Average]
  (min, avg, max) = (7.747, 7.838, 7.932), stdev = 0.073
  CI (99.9%): [7.634, 8.043] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:41
# Fork: 1 of 2
# Warmup Iteration   1: 27.557 ms/op
# Warmup Iteration   2: 13.772 ms/op
Iteration   1: 13.320 ms/op
Iteration   2: 13.303 ms/op
Iteration   3: 13.200 ms/op

# Run progress: 19.57% complete, ETA 00:07:29
# Fork: 2 of 2
# Warmup Iteration   1: 20.531 ms/op
# Warmup Iteration   2: 13.691 ms/op
Iteration   1: 13.305 ms/op
Iteration   2: 13.301 ms/op
Iteration   3: 13.241 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.279 ±(99.9%) 0.132 ms/op [Average]
  (min, avg, max) = (13.200, 13.279, 13.320), stdev = 0.047
  CI (99.9%): [13.147, 13.411] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:16
# Fork: 1 of 2
# Warmup Iteration   1: 2205.111 ms/op
# Warmup Iteration   2: 553.789 ms/op
Iteration   1: 463.187 ms/op
Iteration   2: 450.681 ms/op
Iteration   3: 445.289 ms/op

# Run progress: 23.91% complete, ETA 00:07:02
# Fork: 2 of 2
# Warmup Iteration   1: 2263.341 ms/op
# Warmup Iteration   2: 609.631 ms/op
Iteration   1: 466.600 ms/op
Iteration   2: 449.839 ms/op
Iteration   3: 445.484 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  453.513 ±(99.9%) 25.655 ms/op [Average]
  (min, avg, max) = (445.289, 453.513, 466.600), stdev = 9.149
  CI (99.9%): [427.859, 479.168] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:49
# Fork: 1 of 2
# Warmup Iteration   1: 4462.162 ms/op
# Warmup Iteration   2: 2675.197 ms/op
Iteration   1: 2370.589 ms/op
Iteration   2: 2274.021 ms/op
Iteration   3: 2257.206 ms/op

# Run progress: 28.26% complete, ETA 00:06:43
# Fork: 2 of 2
# Warmup Iteration   1: 5105.554 ms/op
# Warmup Iteration   2: 2563.136 ms/op
Iteration   1: 2301.569 ms/op
Iteration   2: 2255.206 ms/op
Iteration   3: 2205.305 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  2277.316 ±(99.9%) 155.514 ms/op [Average]
  (min, avg, max) = (2205.305, 2277.316, 2370.589), stdev = 55.458
  CI (99.9%): [2121.802, 2432.830] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1193.704 ms/op
# Warmup Iteration   2: 521.643 ms/op
Iteration   1: 496.878 ms/op
Iteration   2: 493.713 ms/op
Iteration   3: 490.923 ms/op

# Run progress: 32.61% complete, ETA 00:06:23
# Fork: 2 of 2
# Warmup Iteration   1: 1161.550 ms/op
# Warmup Iteration   2: 519.954 ms/op
Iteration   1: 497.840 ms/op
Iteration   2: 503.348 ms/op
Iteration   3: 492.110 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  495.802 ±(99.9%) 12.793 ms/op [Average]
  (min, avg, max) = (490.923, 495.802, 503.348), stdev = 4.562
  CI (99.9%): [483.009, 508.594] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:10
# Fork: 1 of 2
# Warmup Iteration   1: 2416.286 ms/op
# Warmup Iteration   2: 1169.666 ms/op
Iteration   1: 1140.834 ms/op
Iteration   2: 1113.243 ms/op
Iteration   3: 1106.608 ms/op

# Run progress: 36.96% complete, ETA 00:05:56
# Fork: 2 of 2
# Warmup Iteration   1: 2566.938 ms/op
# Warmup Iteration   2: 1220.786 ms/op
Iteration   1: 1138.753 ms/op
Iteration   2: 1119.474 ms/op
Iteration   3: 1107.986 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1121.150 ±(99.9%) 42.479 ms/op [Average]
  (min, avg, max) = (1106.608, 1121.150, 1140.834), stdev = 15.148
  CI (99.9%): [1078.671, 1163.629] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:43
# Fork: 1 of 2
# Warmup Iteration   1: 0.149 ms/op
# Warmup Iteration   2: 0.100 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.099 ms/op

# Run progress: 41.30% complete, ETA 00:05:28
# Fork: 2 of 2
# Warmup Iteration   1: 0.148 ms/op
# Warmup Iteration   2: 0.098 ms/op
Iteration   1: 0.098 ms/op
Iteration   2: 0.098 ms/op
Iteration   3: 0.098 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.098 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.098, 0.098, 0.099), stdev = 0.001
  CI (99.9%): [0.097, 0.100] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:14
# Fork: 1 of 2
# Warmup Iteration   1: 11.283 ms/op
# Warmup Iteration   2: 8.147 ms/op
Iteration   1: 8.072 ms/op
Iteration   2: 8.072 ms/op
Iteration   3: 8.039 ms/op

# Run progress: 45.65% complete, ETA 00:04:59
# Fork: 2 of 2
# Warmup Iteration   1: 11.393 ms/op
# Warmup Iteration   2: 8.184 ms/op
Iteration   1: 8.088 ms/op
Iteration   2: 7.729 ms/op
Iteration   3: 7.471 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.912 ±(99.9%) 0.716 ms/op [Average]
  (min, avg, max) = (7.471, 7.912, 8.088), stdev = 0.255
  CI (99.9%): [7.196, 8.628] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:46
# Fork: 1 of 2
# Warmup Iteration   1: 0.847 ms/op
# Warmup Iteration   2: 0.579 ms/op
Iteration   1: 0.573 ms/op
Iteration   2: 0.573 ms/op
Iteration   3: 0.576 ms/op

# Run progress: 50.00% complete, ETA 00:04:32
# Fork: 2 of 2
# Warmup Iteration   1: 0.824 ms/op
# Warmup Iteration   2: 0.580 ms/op
Iteration   1: 0.576 ms/op
Iteration   2: 0.578 ms/op
Iteration   3: 0.576 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.575 ±(99.9%) 0.005 ms/op [Average]
  (min, avg, max) = (0.573, 0.575, 0.578), stdev = 0.002
  CI (99.9%): [0.570, 0.580] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:19
# Fork: 1 of 2
# Warmup Iteration   1: 2.079 ms/op
# Warmup Iteration   2: 1.521 ms/op
Iteration   1: 1.521 ms/op
Iteration   2: 1.506 ms/op
Iteration   3: 1.507 ms/op

# Run progress: 54.35% complete, ETA 00:04:06
# Fork: 2 of 2
# Warmup Iteration   1: 2.115 ms/op
# Warmup Iteration   2: 1.502 ms/op
Iteration   1: 1.508 ms/op
Iteration   2: 1.508 ms/op
Iteration   3: 1.500 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.508 ±(99.9%) 0.019 ms/op [Average]
  (min, avg, max) = (1.500, 1.508, 1.521), stdev = 0.007
  CI (99.9%): [1.489, 1.527] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:53
# Fork: 1 of 2
# Warmup Iteration   1: 230.956 ms/op
# Warmup Iteration   2: 67.913 ms/op
Iteration   1: 48.114 ms/op
Iteration   2: 32.012 ms/op
Iteration   3: 30.950 ms/op

# Run progress: 58.70% complete, ETA 00:03:40
# Fork: 2 of 2
# Warmup Iteration   1: 286.778 ms/op
# Warmup Iteration   2: 68.670 ms/op
Iteration   1: 40.164 ms/op
Iteration   2: 36.096 ms/op
Iteration   3: 31.757 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  36.515 ±(99.9%) 18.682 ms/op [Average]
  (min, avg, max) = (30.950, 36.515, 48.114), stdev = 6.662
  CI (99.9%): [17.833, 55.198] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 97906.667 ms/op
# Warmup Iteration   2: 93150.212 ms/op
Iteration   1: 91975.620 ms/op
Iteration   2: 92409.526 ms/op
Iteration   3: 93033.004 ms/op

# Run progress: 63.04% complete, ETA 00:07:45
# Fork: 2 of 2
# Warmup Iteration   1: 97077.357 ms/op
# Warmup Iteration   2: 93982.735 ms/op
Iteration   1: 92019.798 ms/op
Iteration   2: 91987.624 ms/op
Iteration   3: 92111.923 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  92256.250 ±(99.9%) 1159.248 ms/op [Average]
  (min, avg, max) = (91975.620, 92256.250, 93033.004), stdev = 413.399
  CI (99.9%): [91097.002, 93415.497] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:13
# Fork: 1 of 2
# Warmup Iteration   1: 39590.580 ms/op
# Warmup Iteration   2: 17150.781 ms/op
Iteration   1: 31731.814 ms/op
Iteration   2: 14446.443 ms/op
Iteration   3: 25690.114 ms/op

# Run progress: 67.39% complete, ETA 00:13:36
# Fork: 2 of 2
# Warmup Iteration   1: 25423.429 ms/op
# Warmup Iteration   2: 28147.414 ms/op
Iteration   1: 21106.593 ms/op
Iteration   2: 28176.331 ms/op
Iteration   3: 19535.459 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  23447.792 ±(99.9%) 17638.488 ms/op [Average]
  (min, avg, max) = (14446.443, 23447.792, 31731.814), stdev = 6290.055
  CI (99.9%): [5809.304, 41086.280] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:16:33
# Fork: 1 of 2
# Warmup Iteration   1: 10346.062 ms/op
# Warmup Iteration   2: 8092.823 ms/op
Iteration   1: 8082.322 ms/op
Iteration   2: 7679.611 ms/op
Iteration   3: 7617.025 ms/op

# Run progress: 71.74% complete, ETA 00:15:11
# Fork: 2 of 2
# Warmup Iteration   1: 10308.211 ms/op
# Warmup Iteration   2: 8073.805 ms/op
Iteration   1: 7763.801 ms/op
Iteration   2: 7758.778 ms/op
Iteration   3: 7671.255 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  7762.132 ±(99.9%) 466.979 ms/op [Average]
  (min, avg, max) = (7617.025, 7762.132, 8082.322), stdev = 166.529
  CI (99.9%): [7295.153, 8229.111] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:13:51
# Fork: 1 of 2
# Warmup Iteration   1: Nov 13, 2026 11:06:54 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 11:06:54 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
83.890 ms/op
# Warmup Iteration   2: 57.100 ms/op
Iteration   1: 57.093 ms/op
Iteration   2: 57.028 ms/op
Iteration   3: 56.990 ms/op

# Run progress: 76.09% complete, ETA 00:12:23
# Fork: 2 of 2
# Warmup Iteration   1: Nov 13, 2026 11:07:06 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 11:07:06 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
91.429 ms/op
# Warmup Iteration   2: 59.129 ms/op
Iteration   1: 57.262 ms/op
Iteration   2: 56.762 ms/op
Iteration   3: 56.836 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  56.996 ±(99.9%) 0.504 ms/op [Average]
  (min, avg, max) = (56.762, 56.996, 57.262), stdev = 0.180
  CI (99.9%): [56.492, 57.499] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:11:00
# Fork: 1 of 2
# Warmup Iteration   1: 70.830 ms/op
# Warmup Iteration   2: 66.337 ms/op
Iteration   1: 65.412 ms/op
Iteration   2: 65.607 ms/op
Iteration   3: 65.755 ms/op

# Run progress: 80.43% complete, ETA 00:09:41
# Fork: 2 of 2
# Warmup Iteration   1: 69.454 ms/op
# Warmup Iteration   2: 61.836 ms/op
Iteration   1: 65.947 ms/op
Iteration   2: 65.928 ms/op
Iteration   3: 65.584 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  65.705 ±(99.9%) 0.589 ms/op [Average]
  (min, avg, max) = (65.412, 65.705, 65.947), stdev = 0.210
  CI (99.9%): [65.116, 66.295] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:08:25
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:07:13
# Fork: 2 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  ≈ 10⁻³ ms/op


# JMH version: 1.37
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

# Run progress: 86.96% complete, ETA 00:06:03
# Fork: 1 of 2
# Warmup Iteration   1: 43.998 ms/op
# Warmup Iteration   2: 31.844 ms/op
Iteration   1: 30.891 ms/op
Iteration   2: 30.729 ms/op
Iteration   3: 30.285 ms/op

# Run progress: 89.13% complete, ETA 00:04:57
# Fork: 2 of 2
# Warmup Iteration   1: 42.606 ms/op
# Warmup Iteration   2: 31.791 ms/op
Iteration   1: 30.765 ms/op
Iteration   2: 30.485 ms/op
Iteration   3: 30.232 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  30.565 ±(99.9%) 0.761 ms/op [Average]
  (min, avg, max) = (30.232, 30.565, 30.891), stdev = 0.271
  CI (99.9%): [29.803, 31.326] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:53
# Fork: 1 of 2
# Warmup Iteration   1: 15.762 ms/op
# Warmup Iteration   2: 11.888 ms/op
Iteration   1: 11.579 ms/op
Iteration   2: 11.558 ms/op
Iteration   3: 11.466 ms/op

# Run progress: 93.48% complete, ETA 00:02:51
# Fork: 2 of 2
# Warmup Iteration   1: 15.291 ms/op
# Warmup Iteration   2: 11.880 ms/op
Iteration   1: 11.645 ms/op
Iteration   2: 11.579 ms/op
Iteration   3: 11.528 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  11.559 ±(99.9%) 0.167 ms/op [Average]
  (min, avg, max) = (11.466, 11.559, 11.645), stdev = 0.060
  CI (99.9%): [11.392, 11.726] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:52
# Fork: 1 of 2
# Warmup Iteration   1: 29.683 ms/op
# Warmup Iteration   2: 24.749 ms/op
Iteration   1: 24.691 ms/op
Iteration   2: 24.722 ms/op
Iteration   3: 24.752 ms/op

# Run progress: 97.83% complete, ETA 00:00:55
# Fork: 2 of 2
# Warmup Iteration   1: 28.342 ms/op
# Warmup Iteration   2: 24.698 ms/op
Iteration   1: 24.713 ms/op
Iteration   2: 24.630 ms/op
Iteration   3: 24.613 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  24.687 ±(99.9%) 0.152 ms/op [Average]
  (min, avg, max) = (24.613, 24.687, 24.752), stdev = 0.054
  CI (99.9%): [24.535, 24.839] (assumes normal distribution)


# Run complete. Total time: 00:41:34

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     22.641 ±     0.283  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.488 ±     0.075  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      7.266 ±     0.066  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      7.838 ±     0.204  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     13.279 ±     0.132  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    453.513 ±    25.655  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   2277.316 ±   155.514  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    495.802 ±    12.793  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1121.150 ±    42.479  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.098 ±     0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.912 ±     0.716  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.575 ±     0.005  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.508 ±     0.019  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     36.515 ±    18.682  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  92256.250 ±  1159.248  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  23447.792 ± 17638.488  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   7762.132 ±   466.979  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     56.996 ±     0.504  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     65.705 ±     0.589  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     30.565 ±     0.761  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     11.559 ±     0.167  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     24.687 ±     0.152  ms/op

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
[INFO] Total time:  3.168 s
[INFO] Finished at: 2026-11-13T11:09:17Z
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
TEG full process: 10944 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015319995, composition error=0.0024425158
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366169e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.99 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.660 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.105 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 729869 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 53 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    1.42e-03 (tolerance: 5.09e-03) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  4.85e-03 (tolerance: 5.09e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     1.93e-04 (tolerance: 5.09e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 4.85e-03 after 53 passes - accepted 5.09e-03 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 2.48e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264559.5 + 377732.1, oil 1995397.9 + 2850596.2, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.433 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.3 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 729.9 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (9 ms)
tpFlashWellFluidSrk                                            83.6406  (45 ms)
tpFlashWellFluidPr                                             83.6541  (41 ms)
tpFlashWellFluidWithProperties                                 5445.46  (36 ms)
phAndPsFlashWellFluid                                          2459.23  (64 ms)
Nov 13, 2026 11:21:51 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 11:21:51 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (895 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (406 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (253 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (94 ms)
saturationPointsWellFluid                                      1601.32  (243 ms)
singlePhaseGasPipelineSteadyState                              121.628  (893 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98717  (1728 ms)
levenbergMarquardtAntoine                                      1837.31  (9 ms)
levenbergMarquardtDoubleExponential                            5.57177  (6 ms)
dataReconciliation[20]                                         7.89841  (0 ms)
dataReconciliation[100]                                        37.0132  (9 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.802 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  12:44 min
[INFO] Finished at: 2026-11-13T11:22:02Z
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
# Warmup Iteration   1: 31.069 ms/op
# Warmup Iteration   2: 24.734 ms/op
Iteration   1: 24.378 ms/op
Iteration   2: 24.303 ms/op
Iteration   3: 24.413 ms/op

# Run progress: 2.17% complete, ETA 00:09:07
# Fork: 2 of 2
# Warmup Iteration   1: 28.645 ms/op
# Warmup Iteration   2: 23.020 ms/op
Iteration   1: 22.803 ms/op
Iteration   2: 22.735 ms/op
Iteration   3: 22.524 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  23.526 ±(99.9%) 2.591 ms/op [Average]
  (min, avg, max) = (22.524, 23.526, 24.413), stdev = 0.924
  CI (99.9%): [20.935, 26.118] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:08:53
# Fork: 1 of 2
# Warmup Iteration   1: 1.839 ms/op
# Warmup Iteration   2: 1.151 ms/op
Iteration   1: 1.150 ms/op
Iteration   2: 1.117 ms/op
Iteration   3: 1.118 ms/op

# Run progress: 6.52% complete, ETA 00:08:41
# Fork: 2 of 2
# Warmup Iteration   1: 2.839 ms/op
# Warmup Iteration   2: 1.207 ms/op
Iteration   1: 1.131 ms/op
Iteration   2: 1.142 ms/op
Iteration   3: 1.117 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.129 ±(99.9%) 0.040 ms/op [Average]
  (min, avg, max) = (1.117, 1.129, 1.150), stdev = 0.014
  CI (99.9%): [1.089, 1.169] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:28
# Fork: 1 of 2
# Warmup Iteration   1: 9.973 ms/op
# Warmup Iteration   2: 7.190 ms/op
Iteration   1: 7.036 ms/op
Iteration   2: 7.115 ms/op
Iteration   3: 7.116 ms/op

# Run progress: 10.87% complete, ETA 00:08:17
# Fork: 2 of 2
# Warmup Iteration   1: 10.442 ms/op
# Warmup Iteration   2: 7.134 ms/op
Iteration   1: 7.103 ms/op
Iteration   2: 7.148 ms/op
Iteration   3: 7.150 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.111 ±(99.9%) 0.117 ms/op [Average]
  (min, avg, max) = (7.036, 7.111, 7.150), stdev = 0.042
  CI (99.9%): [6.995, 7.228] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:08:05
# Fork: 1 of 2
# Warmup Iteration   1: 13.347 ms/op
# Warmup Iteration   2: 7.710 ms/op
Iteration   1: 7.651 ms/op
Iteration   2: 7.643 ms/op
Iteration   3: 7.609 ms/op

# Run progress: 15.22% complete, ETA 00:07:53
# Fork: 2 of 2
# Warmup Iteration   1: 13.291 ms/op
# Warmup Iteration   2: 7.794 ms/op
Iteration   1: 7.633 ms/op
Iteration   2: 7.606 ms/op
Iteration   3: 7.573 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  7.619 ±(99.9%) 0.081 ms/op [Average]
  (min, avg, max) = (7.573, 7.619, 7.651), stdev = 0.029
  CI (99.9%): [7.539, 7.700] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:40
# Fork: 1 of 2
# Warmup Iteration   1: 20.477 ms/op
# Warmup Iteration   2: 13.636 ms/op
Iteration   1: 13.205 ms/op
Iteration   2: 13.135 ms/op
Iteration   3: 13.185 ms/op

# Run progress: 19.57% complete, ETA 00:07:28
# Fork: 2 of 2
# Warmup Iteration   1: 21.181 ms/op
# Warmup Iteration   2: 13.769 ms/op
Iteration   1: 13.260 ms/op
Iteration   2: 13.159 ms/op
Iteration   3: 13.145 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.181 ±(99.9%) 0.130 ms/op [Average]
  (min, avg, max) = (13.135, 13.181, 13.260), stdev = 0.046
  CI (99.9%): [13.052, 13.311] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:16
# Fork: 1 of 2
# Warmup Iteration   1: 1328.274 ms/op
# Warmup Iteration   2: 564.550 ms/op
Iteration   1: 487.162 ms/op
Iteration   2: 449.205 ms/op
Iteration   3: 445.146 ms/op

# Run progress: 23.91% complete, ETA 00:07:04
# Fork: 2 of 2
# Warmup Iteration   1: 2197.011 ms/op
# Warmup Iteration   2: 706.877 ms/op
Iteration   1: 480.858 ms/op
Iteration   2: 458.167 ms/op
Iteration   3: 451.220 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  461.960 ±(99.9%) 49.649 ms/op [Average]
  (min, avg, max) = (445.146, 461.960, 487.162), stdev = 17.705
  CI (99.9%): [412.311, 511.609] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:06:50
# Fork: 1 of 2
# Warmup Iteration   1: 5009.511 ms/op
# Warmup Iteration   2: 2587.384 ms/op
Iteration   1: 2350.016 ms/op
Iteration   2: 2285.684 ms/op
Iteration   3: 2244.730 ms/op

# Run progress: 28.26% complete, ETA 00:06:45
# Fork: 2 of 2
# Warmup Iteration   1: 4483.328 ms/op
# Warmup Iteration   2: 2552.443 ms/op
Iteration   1: 2321.313 ms/op
Iteration   2: 2280.802 ms/op
Iteration   3: 2305.215 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  2297.960 ±(99.9%) 101.776 ms/op [Average]
  (min, avg, max) = (2244.730, 2297.960, 2350.016), stdev = 36.294
  CI (99.9%): [2196.184, 2399.736] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1148.836 ms/op
# Warmup Iteration   2: 524.392 ms/op
Iteration   1: 498.308 ms/op
Iteration   2: 492.783 ms/op
Iteration   3: 491.047 ms/op

# Run progress: 32.61% complete, ETA 00:06:24
# Fork: 2 of 2
# Warmup Iteration   1: 1175.056 ms/op
# Warmup Iteration   2: 516.878 ms/op
Iteration   1: 493.427 ms/op
Iteration   2: 494.186 ms/op
Iteration   3: 491.280 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  493.505 ±(99.9%) 7.424 ms/op [Average]
  (min, avg, max) = (491.047, 493.505, 498.308), stdev = 2.648
  CI (99.9%): [486.081, 500.929] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:11
# Fork: 1 of 2
# Warmup Iteration   1: 2445.143 ms/op
# Warmup Iteration   2: 1117.066 ms/op
Iteration   1: 1086.724 ms/op
Iteration   2: 1072.640 ms/op
Iteration   3: 1062.050 ms/op

# Run progress: 36.96% complete, ETA 00:05:57
# Fork: 2 of 2
# Warmup Iteration   1: 2515.313 ms/op
# Warmup Iteration   2: 1142.941 ms/op
Iteration   1: 1112.633 ms/op
Iteration   2: 1076.396 ms/op
Iteration   3: 1070.286 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1080.121 ±(99.9%) 50.065 ms/op [Average]
  (min, avg, max) = (1062.050, 1080.121, 1112.633), stdev = 17.854
  CI (99.9%): [1030.056, 1130.186] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:43
# Fork: 1 of 2
# Warmup Iteration   1: 0.151 ms/op
# Warmup Iteration   2: 0.099 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.099 ms/op
Iteration   3: 0.099 ms/op

# Run progress: 41.30% complete, ETA 00:05:28
# Fork: 2 of 2
# Warmup Iteration   1: 0.148 ms/op
# Warmup Iteration   2: 0.102 ms/op
Iteration   1: 0.102 ms/op
Iteration   2: 0.102 ms/op
Iteration   3: 0.102 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.100 ±(99.9%) 0.005 ms/op [Average]
  (min, avg, max) = (0.099, 0.100, 0.102), stdev = 0.002
  CI (99.9%): [0.096, 0.105] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:14
# Fork: 1 of 2
# Warmup Iteration   1: 10.815 ms/op
# Warmup Iteration   2: 8.153 ms/op
Iteration   1: 8.076 ms/op
Iteration   2: 8.088 ms/op
Iteration   3: 8.017 ms/op

# Run progress: 45.65% complete, ETA 00:04:59
# Fork: 2 of 2
# Warmup Iteration   1: 11.201 ms/op
# Warmup Iteration   2: 8.133 ms/op
Iteration   1: 8.068 ms/op
Iteration   2: 8.051 ms/op
Iteration   3: 8.029 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  8.055 ±(99.9%) 0.078 ms/op [Average]
  (min, avg, max) = (8.017, 8.055, 8.088), stdev = 0.028
  CI (99.9%): [7.977, 8.133] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:45
# Fork: 1 of 2
# Warmup Iteration   1: 0.817 ms/op
# Warmup Iteration   2: 0.578 ms/op
Iteration   1: 0.577 ms/op
Iteration   2: 0.577 ms/op
Iteration   3: 0.579 ms/op

# Run progress: 50.00% complete, ETA 00:04:32
# Fork: 2 of 2
# Warmup Iteration   1: 0.836 ms/op
# Warmup Iteration   2: 0.574 ms/op
Iteration   1: 0.574 ms/op
Iteration   2: 0.574 ms/op
Iteration   3: 0.575 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.576 ±(99.9%) 0.006 ms/op [Average]
  (min, avg, max) = (0.574, 0.576, 0.579), stdev = 0.002
  CI (99.9%): [0.570, 0.582] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:19
# Fork: 1 of 2
# Warmup Iteration   1: 2.059 ms/op
# Warmup Iteration   2: 1.498 ms/op
Iteration   1: 1.524 ms/op
Iteration   2: 1.500 ms/op
Iteration   3: 1.497 ms/op

# Run progress: 54.35% complete, ETA 00:04:06
# Fork: 2 of 2
# Warmup Iteration   1: 2.124 ms/op
# Warmup Iteration   2: 1.511 ms/op
Iteration   1: 1.503 ms/op
Iteration   2: 1.496 ms/op
Iteration   3: 1.494 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.502 ±(99.9%) 0.031 ms/op [Average]
  (min, avg, max) = (1.494, 1.502, 1.524), stdev = 0.011
  CI (99.9%): [1.471, 1.533] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:53
# Fork: 1 of 2
# Warmup Iteration   1: 183.190 ms/op
# Warmup Iteration   2: 36.666 ms/op
Iteration   1: 27.913 ms/op
Iteration   2: 23.964 ms/op
Iteration   3: 21.780 ms/op

# Run progress: 58.70% complete, ETA 00:03:40
# Fork: 2 of 2
# Warmup Iteration   1: 171.321 ms/op
# Warmup Iteration   2: 50.450 ms/op
Iteration   1: 38.884 ms/op
Iteration   2: 22.875 ms/op
Iteration   3: 22.051 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  26.245 ±(99.9%) 18.457 ms/op [Average]
  (min, avg, max) = (21.780, 26.245, 38.884), stdev = 6.582
  CI (99.9%): [7.787, 44.702] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 122500.027 ms/op
# Warmup Iteration   2: 119546.133 ms/op
Iteration   1: 118104.147 ms/op
Iteration   2: 118997.651 ms/op
Iteration   3: 118651.286 ms/op

# Run progress: 63.04% complete, ETA 00:09:01
# Fork: 2 of 2
# Warmup Iteration   1: 121504.281 ms/op
# Warmup Iteration   2: 119596.355 ms/op
Iteration   1: 118883.339 ms/op
Iteration   2: 118877.419 ms/op
Iteration   3: 119127.608 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  118773.575 ±(99.9%) 1019.945 ms/op [Average]
  (min, avg, max) = (118104.147, 118773.575, 119127.608), stdev = 363.722
  CI (99.9%): [117753.629, 119793.520] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:13:32
# Fork: 1 of 2
# Warmup Iteration   1: 16850.293 ms/op
# Warmup Iteration   2: 22993.580 ms/op
Iteration   1: 11804.240 ms/op
Iteration   2: 22383.576 ms/op
Iteration   3: 12335.950 ms/op

# Run progress: 67.39% complete, ETA 00:17:02
# Fork: 2 of 2
# Warmup Iteration   1: 21816.787 ms/op
# Warmup Iteration   2: 24980.943 ms/op
Iteration   1: 23202.918 ms/op
Iteration   2: 23375.345 ms/op
Iteration   3: 20832.374 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  18989.067 ±(99.9%) 15246.224 ms/op [Average]
  (min, avg, max) = (11804.240, 18989.067, 23375.345), stdev = 5436.951
  CI (99.9%): [3742.843, 34235.292] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:18:58
# Fork: 1 of 2
# Warmup Iteration   1: 10341.117 ms/op
# Warmup Iteration   2: 7993.890 ms/op
Iteration   1: 7738.527 ms/op
Iteration   2: 7732.812 ms/op
Iteration   3: 7587.184 ms/op

# Run progress: 71.74% complete, ETA 00:17:21
# Fork: 2 of 2
# Warmup Iteration   1: 10114.966 ms/op
# Warmup Iteration   2: 8057.295 ms/op
Iteration   1: 7693.654 ms/op
Iteration   2: 7616.463 ms/op
Iteration   3: 7584.727 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  7658.895 ±(99.9%) 200.090 ms/op [Average]
  (min, avg, max) = (7584.727, 7658.895, 7738.527), stdev = 71.354
  CI (99.9%): [7458.805, 7858.985] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:15:47
# Fork: 1 of 2
# Warmup Iteration   1: Nov 13, 2026 12:06:50 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 12:06:50 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
95.731 ms/op
# Warmup Iteration   2: 57.565 ms/op
Iteration   1: 57.148 ms/op
Iteration   2: 57.044 ms/op
Iteration   3: 57.111 ms/op

# Run progress: 76.09% complete, ETA 00:14:07
# Fork: 2 of 2
# Warmup Iteration   1: Nov 13, 2026 12:07:01 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 13, 2026 12:07:01 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
82.233 ms/op
# Warmup Iteration   2: 57.377 ms/op
Iteration   1: 57.308 ms/op
Iteration   2: 57.140 ms/op
Iteration   3: 57.043 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  57.132 ±(99.9%) 0.273 ms/op [Average]
  (min, avg, max) = (57.043, 57.132, 57.308), stdev = 0.097
  CI (99.9%): [56.859, 57.405] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:12:32
# Fork: 1 of 2
# Warmup Iteration   1: 80.180 ms/op
# Warmup Iteration   2: 70.495 ms/op
Iteration   1: 69.398 ms/op
Iteration   2: 69.504 ms/op
Iteration   3: 69.246 ms/op

# Run progress: 80.43% complete, ETA 00:11:01
# Fork: 2 of 2
# Warmup Iteration   1: 65.290 ms/op
# Warmup Iteration   2: 66.308 ms/op
Iteration   1: 65.378 ms/op
Iteration   2: 65.303 ms/op
Iteration   3: 64.974 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  67.300 ±(99.9%) 6.412 ms/op [Average]
  (min, avg, max) = (64.974, 67.300, 69.504), stdev = 2.286
  CI (99.9%): [60.889, 73.712] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:09:35
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:08:12
# Fork: 2 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  ≈ 10⁻³ ms/op


# JMH version: 1.37
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

# Run progress: 86.96% complete, ETA 00:06:53
# Fork: 1 of 2
# Warmup Iteration   1: 43.872 ms/op
# Warmup Iteration   2: 31.863 ms/op
Iteration   1: 30.934 ms/op
Iteration   2: 30.725 ms/op
Iteration   3: 30.514 ms/op

# Run progress: 89.13% complete, ETA 00:05:37
# Fork: 2 of 2
# Warmup Iteration   1: 42.943 ms/op
# Warmup Iteration   2: 31.666 ms/op
Iteration   1: 31.162 ms/op
Iteration   2: 30.789 ms/op
Iteration   3: 30.502 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  30.771 ±(99.9%) 0.710 ms/op [Average]
  (min, avg, max) = (30.502, 30.771, 31.162), stdev = 0.253
  CI (99.9%): [30.061, 31.481] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:04:24
# Fork: 1 of 2
# Warmup Iteration   1: 15.759 ms/op
# Warmup Iteration   2: 12.021 ms/op
Iteration   1: 11.665 ms/op
Iteration   2: 11.640 ms/op
Iteration   3: 11.521 ms/op

# Run progress: 93.48% complete, ETA 00:03:14
# Fork: 2 of 2
# Warmup Iteration   1: 15.957 ms/op
# Warmup Iteration   2: 11.896 ms/op
Iteration   1: 11.684 ms/op
Iteration   2: 11.610 ms/op
Iteration   3: 11.538 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  11.610 ±(99.9%) 0.188 ms/op [Average]
  (min, avg, max) = (11.521, 11.610, 11.684), stdev = 0.067
  CI (99.9%): [11.422, 11.797] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:02:07
# Fork: 1 of 2
# Warmup Iteration   1: 29.053 ms/op
# Warmup Iteration   2: 24.846 ms/op
Iteration   1: 24.869 ms/op
Iteration   2: 24.760 ms/op
Iteration   3: 24.641 ms/op

# Run progress: 97.83% complete, ETA 00:01:02
# Fork: 2 of 2
# Warmup Iteration   1: 35.229 ms/op
# Warmup Iteration   2: 30.820 ms/op
Iteration   1: 30.527 ms/op
Iteration   2: 30.553 ms/op
Iteration   3: 30.558 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  27.651 ±(99.9%) 8.894 ms/op [Average]
  (min, avg, max) = (24.641, 27.651, 30.558), stdev = 3.172
  CI (99.9%): [18.757, 36.545] (assumes normal distribution)


# Run complete. Total time: 00:47:04

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

Benchmark                                                                                            (model)  (nodes)  Mode  Cnt       Score       Error  Units
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6      23.526 ±     2.591  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6       1.129 ±     0.040  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6       7.111 ±     0.117  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6       7.619 ±     0.081  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6      13.181 ±     0.130  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6     461.960 ±    49.649  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    2297.960 ±   101.776  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6     493.505 ±     7.424  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6    1080.121 ±    50.065  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6       0.100 ±     0.005  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6       8.055 ±     0.078  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6       0.576 ±     0.006  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6       1.502 ±     0.031  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6      26.245 ±    18.457  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  118773.575 ±  1019.945  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   18989.067 ± 15246.224  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6    7658.895 ±   200.090  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6      57.132 ±     0.273  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6      67.300 ±     6.412  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6      ≈ 10⁻³              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      30.771 ±     0.710  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6      11.610 ±     0.188  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6      27.651 ±     8.894  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.23.0 -> 3.25.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 11 lower, 12 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| process.LargeProcessModelBenchmark.coldStartBuildRunReport | 92256.2 | 118774 | +28.74% | Separate CIs |
| process.Compressor_Benchmark.compressorprocess | 36.5154 | 26.2446 | -28.13% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashLeanGas | 1.48814 | 1.1293 | -24.11% | Separate CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 23447.8 | 18989.1 | -19.02% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 24.6869 | 27.6512 | +12.01% | Overlapping CIs |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 22.6411 | 23.5261 | +3.91% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState | 1121.15 | 1080.12 | -3.66% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 7.8381 | 7.61939 | -2.79% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 65.7054 | 67.3004 | +2.43% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 7.26634 | 7.11137 | -2.13% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
