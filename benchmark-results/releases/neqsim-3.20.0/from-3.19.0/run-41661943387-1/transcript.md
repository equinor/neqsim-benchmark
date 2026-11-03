# NeqSim 3.20.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.19.0 |
| Current | 3.20.0 |
| Source commit | `ecb28777f7265f413909e5a0128eec861d03acf7` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41661943387) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "ecb28777f7265f413909e5a0128eec861d03acf7",
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
CPU(s):                                  2
On-line CPU(s) list:                     0,1
Vendor ID:                               AuthenticAMD
Model name:                              AMD EPYC 7763 64-Core Processor
CPU family:                              25
Model:                                   1
Thread(s) per core:                      2
Core(s) per socket:                      1
Socket(s):                               1
Stepping:                                1
BogoMIPS:                                4890.85
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid rdseed adx smap clflushopt clwb sha_ni xsaveopt xsavec xgetbv1 xsaves user_shstk clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload umip vaes vpclmulqdq rdpid fsrm
Virtualization:                          AMD-V
Hypervisor vendor:                       Microsoft
Virtualization type:                     full
L1d cache:                               32 KiB (1 instance)
L1i cache:                               32 KiB (1 instance)
L2 cache:                                512 KiB (1 instance)
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
[INFO] Total time:  22.065 s
[INFO] Finished at: 2026-11-03T15:15:52Z
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
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 16978 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 17.06 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.988 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.126 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 624965 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 46 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    2.19e-03 (tolerance: 5.17e-03) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  4.92e-03 (tolerance: 5.17e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     3.40e-04 (tolerance: 5.17e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 4.92e-03 after 46 passes - accepted 5.17e-03 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 3.73e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264462.7 + 377518.2, oil 1995345.5 + 2850484.6, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.426 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.4 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 625.0 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (11 ms)
tpFlashWellFluidSrk                                            83.6406  (70 ms)
tpFlashWellFluidPr                                             83.6541  (83 ms)
tpFlashWellFluidWithProperties                                 5445.46  (93 ms)
phAndPsFlashWellFluid                                          2459.23  (149 ms)
Nov 03, 2026 3:26:56 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 3:26:56 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (1191 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (423 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (175 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (133 ms)
saturationPointsWellFluid                                      1601.32  (331 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1031 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1980 ms)
levenbergMarquardtAntoine                                      1837.31  (12 ms)
levenbergMarquardtDoubleExponential                            5.57177  (13 ms)
dataReconciliation[20]                                         7.89841  (1 ms)
dataReconciliation[100]                                        37.0132  (14 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.418 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  11:21 min
[INFO] Finished at: 2026-11-03T15:27:15Z
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
# Warmup Iteration   1: 47.674 ms/op
# Warmup Iteration   2: 26.765 ms/op
Iteration   1: 21.423 ms/op
Iteration   2: 21.639 ms/op
Iteration   3: 26.029 ms/op

# Run progress: 2.17% complete, ETA 00:09:25
# Fork: 2 of 2
# Warmup Iteration   1: 51.964 ms/op
# Warmup Iteration   2: 27.979 ms/op
Iteration   1: 21.380 ms/op
Iteration   2: 21.808 ms/op
Iteration   3: 21.351 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  22.272 ±(99.9%) 5.185 ms/op [Average]
  (min, avg, max) = (21.351, 22.272, 26.029), stdev = 1.849
  CI (99.9%): [17.087, 27.457] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:09:11
# Fork: 1 of 2
# Warmup Iteration   1: 5.384 ms/op
# Warmup Iteration   2: 3.628 ms/op
Iteration   1: 1.851 ms/op
Iteration   2: 1.578 ms/op
Iteration   3: 1.588 ms/op

# Run progress: 6.52% complete, ETA 00:08:56
# Fork: 2 of 2
# Warmup Iteration   1: 5.130 ms/op
# Warmup Iteration   2: 2.498 ms/op
Iteration   1: 1.576 ms/op
Iteration   2: 1.537 ms/op
Iteration   3: 1.544 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.612 ±(99.9%) 0.333 ms/op [Average]
  (min, avg, max) = (1.537, 1.612, 1.851), stdev = 0.119
  CI (99.9%): [1.280, 1.945] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:43
# Fork: 1 of 2
# Warmup Iteration   1: 25.897 ms/op
# Warmup Iteration   2: 12.259 ms/op
Iteration   1: 8.440 ms/op
Iteration   2: 7.632 ms/op
Iteration   3: 8.138 ms/op

# Run progress: 10.87% complete, ETA 00:08:31
# Fork: 2 of 2
# Warmup Iteration   1: 22.876 ms/op
# Warmup Iteration   2: 12.297 ms/op
Iteration   1: 8.419 ms/op
Iteration   2: 9.581 ms/op
Iteration   3: 7.744 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  8.326 ±(99.9%) 1.965 ms/op [Average]
  (min, avg, max) = (7.632, 8.326, 9.581), stdev = 0.701
  CI (99.9%): [6.361, 10.290] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:08:18
# Fork: 1 of 2
# Warmup Iteration   1: 27.120 ms/op
# Warmup Iteration   2: 14.290 ms/op
Iteration   1: 9.772 ms/op
Iteration   2: 8.048 ms/op
Iteration   3: 7.905 ms/op

# Run progress: 15.22% complete, ETA 00:08:06
# Fork: 2 of 2
# Warmup Iteration   1: 22.122 ms/op
# Warmup Iteration   2: 13.518 ms/op
Iteration   1: 9.209 ms/op
Iteration   2: 7.765 ms/op
Iteration   3: 7.863 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  8.427 ±(99.9%) 2.378 ms/op [Average]
  (min, avg, max) = (7.765, 8.427, 9.772), stdev = 0.848
  CI (99.9%): [6.049, 10.805] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:53
# Fork: 1 of 2
# Warmup Iteration   1: 42.665 ms/op
# Warmup Iteration   2: 23.662 ms/op
Iteration   1: 16.332 ms/op
Iteration   2: 14.430 ms/op
Iteration   3: 13.559 ms/op

# Run progress: 19.57% complete, ETA 00:07:41
# Fork: 2 of 2
# Warmup Iteration   1: 55.639 ms/op
# Warmup Iteration   2: 23.978 ms/op
Iteration   1: 16.947 ms/op
Iteration   2: 15.055 ms/op
Iteration   3: 13.624 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  14.991 ±(99.9%) 3.938 ms/op [Average]
  (min, avg, max) = (13.559, 14.991, 16.947), stdev = 1.404
  CI (99.9%): [11.053, 18.930] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:28
# Fork: 1 of 2
# Warmup Iteration   1: 2972.198 ms/op
# Warmup Iteration   2: 926.145 ms/op
Iteration   1: 832.613 ms/op
Iteration   2: 527.017 ms/op
Iteration   3: 481.264 ms/op

# Run progress: 23.91% complete, ETA 00:07:18
# Fork: 2 of 2
# Warmup Iteration   1: 2910.178 ms/op
# Warmup Iteration   2: 912.070 ms/op
Iteration   1: 585.200 ms/op
Iteration   2: 487.517 ms/op
Iteration   3: 458.105 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  561.953 ±(99.9%) 392.293 ms/op [Average]
  (min, avg, max) = (458.105, 561.953, 832.613), stdev = 139.895
  CI (99.9%): [169.660, 954.245] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:07:07
# Fork: 1 of 2
# Warmup Iteration   1: 3283.099 ms/op
# Warmup Iteration   2: 1229.028 ms/op
Iteration   1: 834.178 ms/op
Iteration   2: 633.751 ms/op
Iteration   3: 581.126 ms/op

# Run progress: 28.26% complete, ETA 00:06:56
# Fork: 2 of 2
# Warmup Iteration   1: 3423.100 ms/op
# Warmup Iteration   2: 1196.140 ms/op
Iteration   1: 1026.016 ms/op
Iteration   2: 720.998 ms/op
Iteration   3: 622.921 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  736.498 ±(99.9%) 471.236 ms/op [Average]
  (min, avg, max) = (581.126, 736.498, 1026.016), stdev = 168.047
  CI (99.9%): [265.262, 1207.734] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:44
# Fork: 1 of 2
# Warmup Iteration   1: 2367.337 ms/op
# Warmup Iteration   2: 610.352 ms/op
Iteration   1: 538.310 ms/op
Iteration   2: 522.151 ms/op
Iteration   3: 500.994 ms/op

# Run progress: 32.61% complete, ETA 00:06:29
# Fork: 2 of 2
# Warmup Iteration   1: 2413.012 ms/op
# Warmup Iteration   2: 797.829 ms/op
Iteration   1: 545.867 ms/op
Iteration   2: 518.345 ms/op
Iteration   3: 506.383 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  522.008 ±(99.9%) 49.120 ms/op [Average]
  (min, avg, max) = (500.994, 522.008, 545.867), stdev = 17.517
  CI (99.9%): [472.889, 571.128] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:14
# Fork: 1 of 2
# Warmup Iteration   1: 3341.407 ms/op
# Warmup Iteration   2: 1412.993 ms/op
Iteration   1: 1326.183 ms/op
Iteration   2: 1187.697 ms/op
Iteration   3: 1125.838 ms/op

# Run progress: 36.96% complete, ETA 00:06:04
# Fork: 2 of 2
# Warmup Iteration   1: 3619.684 ms/op
# Warmup Iteration   2: 1349.561 ms/op
Iteration   1: 1212.437 ms/op
Iteration   2: 1267.940 ms/op
Iteration   3: 1124.917 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1207.502 ±(99.9%) 223.083 ms/op [Average]
  (min, avg, max) = (1124.917, 1207.502, 1326.183), stdev = 79.554
  CI (99.9%): [984.419, 1430.585] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:53
# Fork: 1 of 2
# Warmup Iteration   1: 0.334 ms/op
# Warmup Iteration   2: 0.111 ms/op
Iteration   1: 0.104 ms/op
Iteration   2: 0.102 ms/op
Iteration   3: 0.104 ms/op

# Run progress: 41.30% complete, ETA 00:05:37
# Fork: 2 of 2
# Warmup Iteration   1: 0.400 ms/op
# Warmup Iteration   2: 0.120 ms/op
Iteration   1: 0.102 ms/op
Iteration   2: 0.104 ms/op
Iteration   3: 0.101 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.103 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.101, 0.103, 0.104), stdev = 0.001
  CI (99.9%): [0.099, 0.107] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:22
# Fork: 1 of 2
# Warmup Iteration   1: 18.910 ms/op
# Warmup Iteration   2: 9.191 ms/op
Iteration   1: 9.144 ms/op
Iteration   2: 7.525 ms/op
Iteration   3: 7.496 ms/op

# Run progress: 45.65% complete, ETA 00:05:07
# Fork: 2 of 2
# Warmup Iteration   1: 16.687 ms/op
# Warmup Iteration   2: 7.815 ms/op
Iteration   1: 7.529 ms/op
Iteration   2: 7.460 ms/op
Iteration   3: 7.859 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.835 ±(99.9%) 1.843 ms/op [Average]
  (min, avg, max) = (7.460, 7.835, 9.144), stdev = 0.657
  CI (99.9%): [5.993, 9.678] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:53
# Fork: 1 of 2
# Warmup Iteration   1: 1.129 ms/op
# Warmup Iteration   2: 0.645 ms/op
Iteration   1: 0.579 ms/op
Iteration   2: 0.575 ms/op
Iteration   3: 0.577 ms/op

# Run progress: 50.00% complete, ETA 00:04:39
# Fork: 2 of 2
# Warmup Iteration   1: 1.110 ms/op
# Warmup Iteration   2: 0.651 ms/op
Iteration   1: 0.586 ms/op
Iteration   2: 0.578 ms/op
Iteration   3: 0.578 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.579 ±(99.9%) 0.011 ms/op [Average]
  (min, avg, max) = (0.575, 0.579, 0.586), stdev = 0.004
  CI (99.9%): [0.568, 0.589] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:25
# Fork: 1 of 2
# Warmup Iteration   1: 2.761 ms/op
# Warmup Iteration   2: 1.587 ms/op
Iteration   1: 1.670 ms/op
Iteration   2: 1.506 ms/op
Iteration   3: 1.512 ms/op

# Run progress: 54.35% complete, ETA 00:04:11
# Fork: 2 of 2
# Warmup Iteration   1: 2.841 ms/op
# Warmup Iteration   2: 1.571 ms/op
Iteration   1: 1.662 ms/op
Iteration   2: 1.519 ms/op
Iteration   3: 1.521 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.565 ±(99.9%) 0.220 ms/op [Average]
  (min, avg, max) = (1.506, 1.565, 1.670), stdev = 0.079
  CI (99.9%): [1.345, 1.786] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:58
# Fork: 1 of 2
# Warmup Iteration   1: 1018.279 ms/op
# Warmup Iteration   2: 108.130 ms/op
Iteration   1: 56.749 ms/op
Iteration   2: 38.592 ms/op
Iteration   3: 34.900 ms/op

# Run progress: 58.70% complete, ETA 00:03:45
# Fork: 2 of 2
# Warmup Iteration   1: 516.089 ms/op
# Warmup Iteration   2: 68.655 ms/op
Iteration   1: 49.207 ms/op
Iteration   2: 38.214 ms/op
Iteration   3: 36.146 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  42.302 ±(99.9%) 24.432 ms/op [Average]
  (min, avg, max) = (34.900, 42.302, 56.749), stdev = 8.713
  CI (99.9%): [17.870, 66.734] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:33
# Fork: 1 of 2
# Warmup Iteration   1: 102923.964 ms/op
# Warmup Iteration   2: 90576.767 ms/op
Iteration   1: 88441.069 ms/op
Iteration   2: 87776.185 ms/op
Iteration   3: 87367.916 ms/op

# Run progress: 63.04% complete, ETA 00:07:43
# Fork: 2 of 2
# Warmup Iteration   1: 101724.081 ms/op
# Warmup Iteration   2: 92587.541 ms/op
Iteration   1: 87433.902 ms/op
Iteration   2: 86555.189 ms/op
Iteration   3: 86246.213 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  87303.412 ±(99.9%) 2249.116 ms/op [Average]
  (min, avg, max) = (86246.213, 87303.412, 88441.069), stdev = 802.057
  CI (99.9%): [85054.296, 89552.529] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:05
# Fork: 1 of 2
# Warmup Iteration   1: 29112.546 ms/op
# Warmup Iteration   2: 12523.419 ms/op
Iteration   1: 25474.925 ms/op
Iteration   2: 22320.686 ms/op
Iteration   3: 20301.592 ms/op

# Run progress: 67.39% complete, ETA 00:13:47
# Fork: 2 of 2
# Warmup Iteration   1: 25770.113 ms/op
# Warmup Iteration   2: 25312.373 ms/op
Iteration   1: 23268.553 ms/op
Iteration   2: 22369.653 ms/op
Iteration   3: 21283.130 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  22503.090 ±(99.9%) 4985.416 ms/op [Average]
  (min, avg, max) = (20301.592, 22503.090, 25474.925), stdev = 1777.847
  CI (99.9%): [17517.674, 27488.506] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:15:55
# Fork: 1 of 2
# Warmup Iteration   1: 15912.239 ms/op
# Warmup Iteration   2: 10295.085 ms/op
Iteration   1: 9038.681 ms/op
Iteration   2: 8161.379 ms/op
Iteration   3: 9596.555 ms/op

# Run progress: 71.74% complete, ETA 00:14:41
# Fork: 2 of 2
# Warmup Iteration   1: 13134.116 ms/op
# Warmup Iteration   2: 9808.088 ms/op
Iteration   1: 10588.081 ms/op
Iteration   2: 8043.040 ms/op
Iteration   3: 7822.424 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  8875.027 ±(99.9%) 3017.964 ms/op [Average]
  (min, avg, max) = (7822.424, 8875.027, 10588.081), stdev = 1076.235
  CI (99.9%): [5857.063, 11892.990] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:13:27
# Fork: 1 of 2
# Warmup Iteration   1: Nov 03, 2026 4:05:24 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 4:05:24 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
168.969 ms/op
# Warmup Iteration   2: 92.811 ms/op
Iteration   1: 64.427 ms/op
Iteration   2: 65.635 ms/op
Iteration   3: 63.966 ms/op

# Run progress: 76.09% complete, ETA 00:12:02
# Fork: 2 of 2
# Warmup Iteration   1: Nov 03, 2026 4:05:36 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 4:05:37 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
157.120 ms/op
# Warmup Iteration   2: 59.019 ms/op
Iteration   1: 59.381 ms/op
Iteration   2: 56.880 ms/op
Iteration   3: 56.397 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  61.114 ±(99.9%) 11.407 ms/op [Average]
  (min, avg, max) = (56.397, 61.114, 65.635), stdev = 4.068
  CI (99.9%): [49.707, 72.521] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:10:42
# Fork: 1 of 2
# Warmup Iteration   1: 211.594 ms/op
# Warmup Iteration   2: 72.628 ms/op
Iteration   1: 67.048 ms/op
Iteration   2: 64.738 ms/op
Iteration   3: 65.075 ms/op

# Run progress: 80.43% complete, ETA 00:09:25
# Fork: 2 of 2
# Warmup Iteration   1: 167.610 ms/op
# Warmup Iteration   2: 79.480 ms/op
Iteration   1: 68.572 ms/op
Iteration   2: 68.996 ms/op
Iteration   3: 68.950 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  67.230 ±(99.9%) 5.432 ms/op [Average]
  (min, avg, max) = (64.738, 67.230, 68.996), stdev = 1.937
  CI (99.9%): [61.798, 72.662] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:08:11
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:07:01
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

# Run progress: 86.96% complete, ETA 00:05:53
# Fork: 1 of 2
# Warmup Iteration   1: 42.116 ms/op
# Warmup Iteration   2: 26.086 ms/op
Iteration   1: 20.929 ms/op
Iteration   2: 18.684 ms/op
Iteration   3: 18.978 ms/op

# Run progress: 89.13% complete, ETA 00:04:49
# Fork: 2 of 2
# Warmup Iteration   1: 54.163 ms/op
# Warmup Iteration   2: 28.632 ms/op
Iteration   1: 25.261 ms/op
Iteration   2: 19.019 ms/op
Iteration   3: 19.280 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  20.359 ±(99.9%) 7.097 ms/op [Average]
  (min, avg, max) = (18.684, 20.359, 25.261), stdev = 2.531
  CI (99.9%): [13.261, 27.456] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:47
# Fork: 1 of 2
# Warmup Iteration   1: 31.760 ms/op
# Warmup Iteration   2: 21.225 ms/op
Iteration   1: 15.355 ms/op
Iteration   2: 15.670 ms/op
Iteration   3: 14.623 ms/op

# Run progress: 93.48% complete, ETA 00:02:47
# Fork: 2 of 2
# Warmup Iteration   1: 30.332 ms/op
# Warmup Iteration   2: 18.315 ms/op
Iteration   1: 12.934 ms/op
Iteration   2: 13.264 ms/op
Iteration   3: 13.424 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  14.212 ±(99.9%) 3.259 ms/op [Average]
  (min, avg, max) = (12.934, 14.212, 15.670), stdev = 1.162
  CI (99.9%): [10.953, 17.470] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:49
# Fork: 1 of 2
# Warmup Iteration   1: 36.660 ms/op
# Warmup Iteration   2: 28.634 ms/op
Iteration   1: 26.764 ms/op
Iteration   2: 24.914 ms/op
Iteration   3: 25.565 ms/op

# Run progress: 97.83% complete, ETA 00:00:53
# Fork: 2 of 2
# Warmup Iteration   1: 37.859 ms/op
# Warmup Iteration   2: 25.135 ms/op
Iteration   1: 24.790 ms/op
Iteration   2: 24.753 ms/op
Iteration   3: 24.796 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  25.264 ±(99.9%) 2.233 ms/op [Average]
  (min, avg, max) = (24.753, 25.264, 26.764), stdev = 0.796
  CI (99.9%): [23.031, 27.496] (assumes normal distribution)


# Run complete. Total time: 00:40:32

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     22.272 ±    5.185  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.612 ±    0.333  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      8.326 ±    1.965  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      8.427 ±    2.378  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     14.991 ±    3.938  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    561.953 ±  392.293  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    736.498 ±  471.236  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    522.008 ±   49.120  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1207.502 ±  223.083  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.103 ±    0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.835 ±    1.843  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.579 ±    0.011  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.565 ±    0.220  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     42.302 ±   24.432  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  87303.412 ± 2249.116  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  22503.090 ± 4985.416  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   8875.027 ± 3017.964  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     61.114 ±   11.407  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     67.230 ±    5.432  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     20.359 ±    7.097  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     14.212 ±    3.259  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     25.264 ±    2.233  ms/op

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
[INFO] Total time:  3.650 s
[INFO] Finished at: 2026-11-03T16:07:53Z
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
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 15518 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 15.61 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.225 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.150 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 576408 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 36 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    4.12e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.84e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     7.58e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.84e-03 after 36 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 6.83e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264212.2 + 377016.3, oil 1995208.8 + 2850208.5, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.407 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.6 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 576.4 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (11 ms)
tpFlashWellFluidSrk                                            83.6406  (125 ms)
tpFlashWellFluidPr                                             83.6541  (97 ms)
tpFlashWellFluidWithProperties                                 5445.46  (108 ms)
phAndPsFlashWellFluid                                          2459.23  (158 ms)
Nov 03, 2026 4:17:59 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 4:17:59 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (2069 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (732 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (282 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (227 ms)
saturationPointsWellFluid                                      1601.32  (686 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1143 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (2040 ms)
levenbergMarquardtAntoine                                      1837.31  (14 ms)
levenbergMarquardtDoubleExponential                            5.57177  (9 ms)
dataReconciliation[20]                                         7.89841  (6 ms)
dataReconciliation[100]                                        37.0132  (80 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.600 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
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
[INFO] Total time:  10:20 min
[INFO] Finished at: 2026-11-03T16:18:15Z
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
# Warmup Iteration   1: 50.595 ms/op
# Warmup Iteration   2: 26.482 ms/op
Iteration   1: 21.228 ms/op
Iteration   2: 21.177 ms/op
Iteration   3: 22.710 ms/op

# Run progress: 2.17% complete, ETA 00:09:25
# Fork: 2 of 2
# Warmup Iteration   1: 47.914 ms/op
# Warmup Iteration   2: 26.447 ms/op
Iteration   1: 21.250 ms/op
Iteration   2: 21.017 ms/op
Iteration   3: 21.416 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  21.466 ±(99.9%) 1.746 ms/op [Average]
  (min, avg, max) = (21.017, 21.466, 22.710), stdev = 0.623
  CI (99.9%): [19.720, 23.213] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:09:17
# Fork: 1 of 2
# Warmup Iteration   1: 5.235 ms/op
# Warmup Iteration   2: 2.837 ms/op
Iteration   1: 1.615 ms/op
Iteration   2: 1.572 ms/op
Iteration   3: 1.577 ms/op

# Run progress: 6.52% complete, ETA 00:09:01
# Fork: 2 of 2
# Warmup Iteration   1: 5.245 ms/op
# Warmup Iteration   2: 2.433 ms/op
Iteration   1: 1.607 ms/op
Iteration   2: 1.592 ms/op
Iteration   3: 1.586 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.592 ±(99.9%) 0.047 ms/op [Average]
  (min, avg, max) = (1.572, 1.592, 1.615), stdev = 0.017
  CI (99.9%): [1.545, 1.638] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:46
# Fork: 1 of 2
# Warmup Iteration   1: 20.489 ms/op
# Warmup Iteration   2: 13.117 ms/op
Iteration   1: 9.246 ms/op
Iteration   2: 7.481 ms/op
Iteration   3: 7.605 ms/op

# Run progress: 10.87% complete, ETA 00:08:33
# Fork: 2 of 2
# Warmup Iteration   1: 23.055 ms/op
# Warmup Iteration   2: 13.726 ms/op
Iteration   1: 11.396 ms/op
Iteration   2: 9.358 ms/op
Iteration   3: 8.441 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  8.921 ±(99.9%) 4.056 ms/op [Average]
  (min, avg, max) = (7.481, 8.921, 11.396), stdev = 1.446
  CI (99.9%): [4.866, 12.977] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:08:20
# Fork: 1 of 2
# Warmup Iteration   1: 25.070 ms/op
# Warmup Iteration   2: 13.633 ms/op
Iteration   1: 9.981 ms/op
Iteration   2: 8.112 ms/op
Iteration   3: 8.010 ms/op

# Run progress: 15.22% complete, ETA 00:08:07
# Fork: 2 of 2
# Warmup Iteration   1: 27.519 ms/op
# Warmup Iteration   2: 14.550 ms/op
Iteration   1: 10.778 ms/op
Iteration   2: 8.174 ms/op
Iteration   3: 7.953 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  8.835 ±(99.9%) 3.436 ms/op [Average]
  (min, avg, max) = (7.953, 8.835, 10.778), stdev = 1.225
  CI (99.9%): [5.398, 12.271] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:54
# Fork: 1 of 2
# Warmup Iteration   1: 46.837 ms/op
# Warmup Iteration   2: 24.485 ms/op
Iteration   1: 17.652 ms/op
Iteration   2: 14.612 ms/op
Iteration   3: 13.943 ms/op

# Run progress: 19.57% complete, ETA 00:07:41
# Fork: 2 of 2
# Warmup Iteration   1: 43.084 ms/op
# Warmup Iteration   2: 23.670 ms/op
Iteration   1: 17.321 ms/op
Iteration   2: 14.477 ms/op
Iteration   3: 13.962 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  15.328 ±(99.9%) 4.757 ms/op [Average]
  (min, avg, max) = (13.943, 15.328, 17.652), stdev = 1.697
  CI (99.9%): [10.571, 20.085] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:29
# Fork: 1 of 2
# Warmup Iteration   1: 2929.741 ms/op
# Warmup Iteration   2: 1021.171 ms/op
Iteration   1: 721.860 ms/op
Iteration   2: 623.050 ms/op
Iteration   3: 478.991 ms/op

# Run progress: 23.91% complete, ETA 00:07:16
# Fork: 2 of 2
# Warmup Iteration   1: 2942.852 ms/op
# Warmup Iteration   2: 1002.092 ms/op
Iteration   1: 679.416 ms/op
Iteration   2: 502.927 ms/op
Iteration   3: 480.167 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  581.069 ±(99.9%) 301.926 ms/op [Average]
  (min, avg, max) = (478.991, 581.069, 721.860), stdev = 107.670
  CI (99.9%): [279.143, 882.995] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:07:01
# Fork: 1 of 2
# Warmup Iteration   1: 3182.267 ms/op
# Warmup Iteration   2: 1203.284 ms/op
Iteration   1: 708.776 ms/op
Iteration   2: 603.535 ms/op
Iteration   3: 603.402 ms/op

# Run progress: 28.26% complete, ETA 00:06:50
# Fork: 2 of 2
# Warmup Iteration   1: 3175.151 ms/op
# Warmup Iteration   2: 1139.275 ms/op
Iteration   1: 744.845 ms/op
Iteration   2: 593.940 ms/op
Iteration   3: 564.369 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  636.478 ±(99.9%) 202.830 ms/op [Average]
  (min, avg, max) = (564.369, 636.478, 744.845), stdev = 72.331
  CI (99.9%): [433.648, 839.308] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2534.118 ms/op
# Warmup Iteration   2: 615.116 ms/op
Iteration   1: 539.448 ms/op
Iteration   2: 521.710 ms/op
Iteration   3: 501.408 ms/op

# Run progress: 32.61% complete, ETA 00:06:24
# Fork: 2 of 2
# Warmup Iteration   1: 2438.713 ms/op
# Warmup Iteration   2: 618.986 ms/op
Iteration   1: 593.625 ms/op
Iteration   2: 579.180 ms/op
Iteration   3: 499.307 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  539.113 ±(99.9%) 111.365 ms/op [Average]
  (min, avg, max) = (499.307, 539.113, 593.625), stdev = 39.714
  CI (99.9%): [427.748, 650.478] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 3571.798 ms/op
# Warmup Iteration   2: 1331.535 ms/op
Iteration   1: 1342.478 ms/op
Iteration   2: 1189.065 ms/op
Iteration   3: 1128.551 ms/op

# Run progress: 36.96% complete, ETA 00:06:02
# Fork: 2 of 2
# Warmup Iteration   1: 3355.140 ms/op
# Warmup Iteration   2: 1336.202 ms/op
Iteration   1: 1223.003 ms/op
Iteration   2: 1278.701 ms/op
Iteration   3: 1126.265 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1214.677 ±(99.9%) 239.234 ms/op [Average]
  (min, avg, max) = (1126.265, 1214.677, 1342.478), stdev = 85.313
  CI (99.9%): [975.443, 1453.912] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:51
# Fork: 1 of 2
# Warmup Iteration   1: 0.361 ms/op
# Warmup Iteration   2: 0.108 ms/op
Iteration   1: 0.100 ms/op
Iteration   2: 0.100 ms/op
Iteration   3: 0.100 ms/op

# Run progress: 41.30% complete, ETA 00:05:35
# Fork: 2 of 2
# Warmup Iteration   1: 0.358 ms/op
# Warmup Iteration   2: 0.109 ms/op
Iteration   1: 0.100 ms/op
Iteration   2: 0.101 ms/op
Iteration   3: 0.100 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.100 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.100, 0.100, 0.101), stdev = 0.001
  CI (99.9%): [0.099, 0.101] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:20
# Fork: 1 of 2
# Warmup Iteration   1: 17.745 ms/op
# Warmup Iteration   2: 7.948 ms/op
Iteration   1: 7.592 ms/op
Iteration   2: 10.619 ms/op
Iteration   3: 7.613 ms/op

# Run progress: 45.65% complete, ETA 00:05:05
# Fork: 2 of 2
# Warmup Iteration   1: 17.011 ms/op
# Warmup Iteration   2: 7.905 ms/op
Iteration   1: 7.544 ms/op
Iteration   2: 7.455 ms/op
Iteration   3: 7.495 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  8.053 ±(99.9%) 3.529 ms/op [Average]
  (min, avg, max) = (7.455, 8.053, 10.619), stdev = 1.259
  CI (99.9%): [4.524, 11.582] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:51
# Fork: 1 of 2
# Warmup Iteration   1: 1.198 ms/op
# Warmup Iteration   2: 0.652 ms/op
Iteration   1: 0.587 ms/op
Iteration   2: 0.578 ms/op
Iteration   3: 0.584 ms/op

# Run progress: 50.00% complete, ETA 00:04:37
# Fork: 2 of 2
# Warmup Iteration   1: 1.115 ms/op
# Warmup Iteration   2: 0.651 ms/op
Iteration   1: 0.581 ms/op
Iteration   2: 0.578 ms/op
Iteration   3: 0.576 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.581 ±(99.9%) 0.012 ms/op [Average]
  (min, avg, max) = (0.576, 0.581, 0.587), stdev = 0.004
  CI (99.9%): [0.569, 0.593] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:23
# Fork: 1 of 2
# Warmup Iteration   1: 2.857 ms/op
# Warmup Iteration   2: 1.601 ms/op
Iteration   1: 1.674 ms/op
Iteration   2: 1.513 ms/op
Iteration   3: 1.511 ms/op

# Run progress: 54.35% complete, ETA 00:04:10
# Fork: 2 of 2
# Warmup Iteration   1: 2.827 ms/op
# Warmup Iteration   2: 1.637 ms/op
Iteration   1: 1.665 ms/op
Iteration   2: 1.495 ms/op
Iteration   3: 1.497 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.559 ±(99.9%) 0.240 ms/op [Average]
  (min, avg, max) = (1.495, 1.559, 1.674), stdev = 0.086
  CI (99.9%): [1.319, 1.799] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:57
# Fork: 1 of 2
# Warmup Iteration   1: 535.602 ms/op
# Warmup Iteration   2: 97.224 ms/op
Iteration   1: 57.818 ms/op
Iteration   2: 40.549 ms/op
Iteration   3: 37.157 ms/op

# Run progress: 58.70% complete, ETA 00:03:44
# Fork: 2 of 2
# Warmup Iteration   1: 679.644 ms/op
# Warmup Iteration   2: 72.481 ms/op
Iteration   1: 50.660 ms/op
Iteration   2: 39.320 ms/op
Iteration   3: 41.585 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  44.515 ±(99.9%) 22.439 ms/op [Average]
  (min, avg, max) = (37.157, 44.515, 57.818), stdev = 8.002
  CI (99.9%): [22.076, 66.954] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 60.87% complete, ETA 00:03:32
# Fork: 1 of 2
# Warmup Iteration   1: 103196.366 ms/op
# Warmup Iteration   2: 92564.082 ms/op
Iteration   1: 87938.220 ms/op
Iteration   2: 87321.376 ms/op
Iteration   3: 88178.579 ms/op

# Run progress: 63.04% complete, ETA 00:07:43
# Fork: 2 of 2
# Warmup Iteration   1: 102261.363 ms/op
# Warmup Iteration   2: 92451.856 ms/op
Iteration   1: 89474.102 ms/op
Iteration   2: 86696.419 ms/op
Iteration   3: 87986.400 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  87932.516 ±(99.9%) 2612.984 ms/op [Average]
  (min, avg, max) = (86696.419, 87932.516, 89474.102), stdev = 931.815
  CI (99.9%): [85319.532, 90545.500] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:07
# Fork: 1 of 2
# Warmup Iteration   1: 27590.407 ms/op
# Warmup Iteration   2: 24275.068 ms/op
Iteration   1: 24026.118 ms/op
Iteration   2: 24527.222 ms/op
Iteration   3: 21836.983 ms/op

# Run progress: 67.39% complete, ETA 00:14:00
# Fork: 2 of 2
# Warmup Iteration   1: 32087.839 ms/op
# Warmup Iteration   2: 21026.636 ms/op
Iteration   1: 28069.343 ms/op
Iteration   2: 12680.264 ms/op
Iteration   3: 27021.047 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  23026.829 ±(99.9%) 15516.943 ms/op [Average]
  (min, avg, max) = (12680.264, 23026.829, 28069.343), stdev = 5533.491
  CI (99.9%): [7509.886, 38543.773] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:15:45
# Fork: 1 of 2
# Warmup Iteration   1: 16514.809 ms/op
# Warmup Iteration   2: 11878.005 ms/op
Iteration   1: 10005.502 ms/op
Iteration   2: 8418.768 ms/op
Iteration   3: 8375.966 ms/op

# Run progress: 71.74% complete, ETA 00:14:33
# Fork: 2 of 2
# Warmup Iteration   1: 17163.140 ms/op
# Warmup Iteration   2: 10000.674 ms/op
Iteration   1: 10945.269 ms/op
Iteration   2: 8595.761 ms/op
Iteration   3: 8581.011 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  9153.713 ±(99.9%) 2999.182 ms/op [Average]
  (min, avg, max) = (8375.966, 9153.713, 10945.269), stdev = 1069.537
  CI (99.9%): [6154.531, 12152.895] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:13:22
# Fork: 1 of 2
# Warmup Iteration   1: Nov 03, 2026 4:56:10 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 4:56:10 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
172.801 ms/op
# Warmup Iteration   2: 58.773 ms/op
Iteration   1: 59.448 ms/op
Iteration   2: 56.988 ms/op
Iteration   3: 56.163 ms/op

# Run progress: 76.09% complete, ETA 00:11:58
# Fork: 2 of 2
# Warmup Iteration   1: Nov 03, 2026 4:56:23 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 4:56:23 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
171.524 ms/op
# Warmup Iteration   2: 59.086 ms/op
Iteration   1: 60.853 ms/op
Iteration   2: 75.888 ms/op
Iteration   3: 58.436 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  61.296 ±(99.9%) 20.592 ms/op [Average]
  (min, avg, max) = (56.163, 61.296, 75.888), stdev = 7.343
  CI (99.9%): [40.704, 81.888] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:10:38
# Fork: 1 of 2
# Warmup Iteration   1: 156.429 ms/op
# Warmup Iteration   2: 72.561 ms/op
Iteration   1: 65.355 ms/op
Iteration   2: 64.832 ms/op
Iteration   3: 65.101 ms/op

# Run progress: 80.43% complete, ETA 00:09:21
# Fork: 2 of 2
# Warmup Iteration   1: 168.071 ms/op
# Warmup Iteration   2: 79.663 ms/op
Iteration   1: 69.888 ms/op
Iteration   2: 68.816 ms/op
Iteration   3: 68.779 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  67.128 ±(99.9%) 6.360 ms/op [Average]
  (min, avg, max) = (64.832, 67.128, 69.888), stdev = 2.268
  CI (99.9%): [60.769, 73.488] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:08:08
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:06:58
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

# Run progress: 86.96% complete, ETA 00:05:51
# Fork: 1 of 2
# Warmup Iteration   1: 45.719 ms/op
# Warmup Iteration   2: 27.312 ms/op
Iteration   1: 23.101 ms/op
Iteration   2: 17.590 ms/op
Iteration   3: 17.640 ms/op

# Run progress: 89.13% complete, ETA 00:04:47
# Fork: 2 of 2
# Warmup Iteration   1: 43.773 ms/op
# Warmup Iteration   2: 24.289 ms/op
Iteration   1: 18.359 ms/op
Iteration   2: 17.286 ms/op
Iteration   3: 18.524 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  18.750 ±(99.9%) 6.125 ms/op [Average]
  (min, avg, max) = (17.286, 18.750, 23.101), stdev = 2.184
  CI (99.9%): [12.625, 24.875] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:45
# Fork: 1 of 2
# Warmup Iteration   1: 34.568 ms/op
# Warmup Iteration   2: 21.742 ms/op
Iteration   1: 16.866 ms/op
Iteration   2: 16.070 ms/op
Iteration   3: 15.106 ms/op

# Run progress: 93.48% complete, ETA 00:02:46
# Fork: 2 of 2
# Warmup Iteration   1: 30.861 ms/op
# Warmup Iteration   2: 16.337 ms/op
Iteration   1: 12.594 ms/op
Iteration   2: 13.696 ms/op
Iteration   3: 13.589 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  14.653 ±(99.9%) 4.590 ms/op [Average]
  (min, avg, max) = (12.594, 14.653, 16.866), stdev = 1.637
  CI (99.9%): [10.064, 19.243] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 48.052 ms/op
# Warmup Iteration   2: 31.113 ms/op
Iteration   1: 30.888 ms/op
Iteration   2: 30.804 ms/op
Iteration   3: 31.892 ms/op

# Run progress: 97.83% complete, ETA 00:00:53
# Fork: 2 of 2
# Warmup Iteration   1: 50.610 ms/op
# Warmup Iteration   2: 31.256 ms/op
Iteration   1: 40.253 ms/op
Iteration   2: 30.594 ms/op
Iteration   3: 30.567 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  32.499 ±(99.9%) 10.738 ms/op [Average]
  (min, avg, max) = (30.567, 32.499, 40.253), stdev = 3.829
  CI (99.9%): [21.761, 43.238] (assumes normal distribution)


# Run complete. Total time: 00:40:18

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     21.466 ±     1.746  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.592 ±     0.047  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      8.921 ±     4.056  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      8.835 ±     3.436  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     15.328 ±     4.757  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    581.069 ±   301.926  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    636.478 ±   202.830  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    539.113 ±   111.365  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1214.677 ±   239.234  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.100 ±     0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      8.053 ±     3.529  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.581 ±     0.012  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.559 ±     0.240  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     44.515 ±    22.439  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  87932.516 ±  2612.984  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  23026.829 ± 15516.943  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   9153.713 ±  2999.182  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     61.296 ±    20.592  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     67.128 ±     6.360  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³              ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     18.750 ±     6.125  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     14.653 ±     4.590  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     32.499 ±    10.738  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.19.0 -> 3.20.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 8 lower, 15 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 25.2638 | 32.4994 | +28.64% | Overlapping CIs |
| flash.TPflash_UMR.testFlash_UMR | 736.498 | 636.478 | -13.58% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate | 20.3586 | 18.75 | -7.90% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidPr | 8.32562 | 8.92124 | +7.15% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Parachor) | 0.000386212 | 0.000361724 | -6.34% | Overlapping CIs |
| process.Compressor_Benchmark.compressorprocess | 42.3016 | 44.5148 | +5.23% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 8.4271 | 8.83452 | +4.83% | Overlapping CIs |
| flash.FlashBenchmark.phAndPsFlashWellFluid | 22.2718 | 21.4664 | -3.62% | Overlapping CIs |
| flash.TPflash.testFlash | 561.953 | 581.069 | +3.40% | Overlapping CIs |
| fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState | 522.008 | 539.113 | +3.28% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
