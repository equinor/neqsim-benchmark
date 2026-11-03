# NeqSim 3.20.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.19.0 |
| Current | 3.20.0 |
| Source commit | `dd837aadfca58ebdfc4dec10a7739c30be4bb067` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/41663848809) |
| Status | complete |


## benchmark-revision.json

```text
{
  "number": 14,
  "label": "B14-87c78035e6f4",
  "fingerprint": "87c78035e6f4900b5258722282bc6a08ad5d68100ac0dc8c4144346d7e10067f",
  "source_commit": "dd837aadfca58ebdfc4dec10a7739c30be4bb067",
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
[INFO] Total time:  12.106 s
[INFO] Finished at: 2026-11-03T15:26:33Z
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
tpFlashLeanGas                                                 60.0000  (73 ms)
tpFlashWellFluidSrk                                            83.6406  (176 ms)
tpFlashWellFluidPr                                             83.6541  (100 ms)
tpFlashWellFluidWithProperties                                 5445.46  (181 ms)
phAndPsFlashWellFluid                                          2459.23  (134 ms)
Nov 03, 2026 3:26:50 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 3:26:50 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (673 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (370 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (144 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (59 ms)
saturationPointsWellFluid                                      1601.32  (148 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1316 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1767 ms)
levenbergMarquardtAntoine                                      1837.31  (15 ms)
levenbergMarquardtDoubleExponential                            5.57177  (10 ms)
dataReconciliation[20]                                         7.89841  (21 ms)
dataReconciliation[100]                                        37.0132  (64 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.370 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.462 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.045 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 525099 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 49 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    1.82e-03 (tolerance: 5.22e-03) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  4.97e-03 (tolerance: 5.22e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     2.64e-04 (tolerance: 5.22e-03) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 4.97e-03 after 49 passes - accepted 5.22e-03 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
  Mass closure:  recycle tear mass closure 0.00 of feed (tolerance 0.00100) - every active recycle tear closes Unit-level closure 3.12e-05 of feed is within the same tolerance.

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED (3 unit(s) bypassed on low flow)

feed 5489240.1, gas 264511.7 + 377617.6, oil 1995374.1 + 2850538.2, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.429 MSm3/d, KA27841 A 102.6 bara, pipeline outlet 51.3 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 525.1 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 17763 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 17.77 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  09:38 min
[INFO] Finished at: 2026-11-03T15:36:13Z
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
# Warmup Iteration   1: 55.656 ms/op
# Warmup Iteration   2: 27.819 ms/op
Iteration   1: 21.313 ms/op
Iteration   2: 21.409 ms/op
Iteration   3: 21.559 ms/op

# Run progress: 2.17% complete, ETA 00:09:28
# Fork: 2 of 2
# Warmup Iteration   1: 49.372 ms/op
# Warmup Iteration   2: 26.065 ms/op
Iteration   1: 20.822 ms/op
Iteration   2: 21.145 ms/op
Iteration   3: 20.731 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  21.163 ±(99.9%) 0.925 ms/op [Average]
  (min, avg, max) = (20.731, 21.163, 21.559), stdev = 0.330
  CI (99.9%): [20.239, 22.088] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:09:13
# Fork: 1 of 2
# Warmup Iteration   1: 6.044 ms/op
# Warmup Iteration   2: 3.904 ms/op
Iteration   1: 1.718 ms/op
Iteration   2: 1.474 ms/op
Iteration   3: 1.477 ms/op

# Run progress: 6.52% complete, ETA 00:08:59
# Fork: 2 of 2
# Warmup Iteration   1: 5.400 ms/op
# Warmup Iteration   2: 3.575 ms/op
Iteration   1: 1.989 ms/op
Iteration   2: 1.528 ms/op
Iteration   3: 1.529 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.619 ±(99.9%) 0.567 ms/op [Average]
  (min, avg, max) = (1.474, 1.619, 1.989), stdev = 0.202
  CI (99.9%): [1.052, 2.186] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 21.192 ms/op
# Warmup Iteration   2: 11.842 ms/op
Iteration   1: 8.161 ms/op
Iteration   2: 7.392 ms/op
Iteration   3: 7.383 ms/op

# Run progress: 10.87% complete, ETA 00:08:33
# Fork: 2 of 2
# Warmup Iteration   1: 23.422 ms/op
# Warmup Iteration   2: 12.629 ms/op
Iteration   1: 8.614 ms/op
Iteration   2: 7.311 ms/op
Iteration   3: 7.441 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.717 ±(99.9%) 1.515 ms/op [Average]
  (min, avg, max) = (7.311, 7.717, 8.614), stdev = 0.540
  CI (99.9%): [6.202, 9.232] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 21.611 ms/op
# Warmup Iteration   2: 13.428 ms/op
Iteration   1: 10.791 ms/op
Iteration   2: 7.965 ms/op
Iteration   3: 7.847 ms/op

# Run progress: 15.22% complete, ETA 00:08:07
# Fork: 2 of 2
# Warmup Iteration   1: 26.126 ms/op
# Warmup Iteration   2: 13.860 ms/op
Iteration   1: 10.042 ms/op
Iteration   2: 7.970 ms/op
Iteration   3: 8.017 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  8.772 ±(99.9%) 3.637 ms/op [Average]
  (min, avg, max) = (7.847, 8.772, 10.791), stdev = 1.297
  CI (99.9%): [5.135, 12.409] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 17.39% complete, ETA 00:07:57
# Fork: 1 of 2
# Warmup Iteration   1: 49.022 ms/op
# Warmup Iteration   2: 24.304 ms/op
Iteration   1: 16.797 ms/op
Iteration   2: 14.352 ms/op
Iteration   3: 13.849 ms/op

# Run progress: 19.57% complete, ETA 00:07:44
# Fork: 2 of 2
# Warmup Iteration   1: 46.595 ms/op
# Warmup Iteration   2: 24.637 ms/op
Iteration   1: 20.164 ms/op
Iteration   2: 14.592 ms/op
Iteration   3: 14.008 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  15.627 ±(99.9%) 6.918 ms/op [Average]
  (min, avg, max) = (13.849, 15.627, 20.164), stdev = 2.467
  CI (99.9%): [8.709, 22.545] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 21.74% complete, ETA 00:07:31
# Fork: 1 of 2
# Warmup Iteration   1: 2903.945 ms/op
# Warmup Iteration   2: 912.842 ms/op
Iteration   1: 613.361 ms/op
Iteration   2: 506.516 ms/op
Iteration   3: 462.734 ms/op

# Run progress: 23.91% complete, ETA 00:07:19
# Fork: 2 of 2
# Warmup Iteration   1: 2924.845 ms/op
# Warmup Iteration   2: 1059.814 ms/op
Iteration   1: 734.982 ms/op
Iteration   2: 535.055 ms/op
Iteration   3: 602.195 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  575.807 ±(99.9%) 270.980 ms/op [Average]
  (min, avg, max) = (462.734, 575.807, 734.982), stdev = 96.634
  CI (99.9%): [304.827, 846.787] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:07:06
# Fork: 1 of 2
# Warmup Iteration   1: 3221.565 ms/op
# Warmup Iteration   2: 1263.809 ms/op
Iteration   1: 853.772 ms/op
Iteration   2: 617.505 ms/op
Iteration   3: 632.350 ms/op

# Run progress: 28.26% complete, ETA 00:06:56
# Fork: 2 of 2
# Warmup Iteration   1: 3510.191 ms/op
# Warmup Iteration   2: 1267.343 ms/op
Iteration   1: 1086.945 ms/op
Iteration   2: 795.781 ms/op
Iteration   3: 611.209 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  766.260 ±(99.9%) 525.319 ms/op [Average]
  (min, avg, max) = (611.209, 766.260, 1086.945), stdev = 187.334
  CI (99.9%): [240.942, 1291.579] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 30.43% complete, ETA 00:06:45
# Fork: 1 of 2
# Warmup Iteration   1: 2361.249 ms/op
# Warmup Iteration   2: 620.653 ms/op
Iteration   1: 543.847 ms/op
Iteration   2: 514.285 ms/op
Iteration   3: 499.764 ms/op

# Run progress: 32.61% complete, ETA 00:06:31
# Fork: 2 of 2
# Warmup Iteration   1: 2492.361 ms/op
# Warmup Iteration   2: 607.770 ms/op
Iteration   1: 551.871 ms/op
Iteration   2: 517.135 ms/op
Iteration   3: 503.910 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  521.802 ±(99.9%) 59.805 ms/op [Average]
  (min, avg, max) = (499.764, 521.802, 551.871), stdev = 21.327
  CI (99.9%): [461.997, 581.607] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:16
# Fork: 1 of 2
# Warmup Iteration   1: 3452.534 ms/op
# Warmup Iteration   2: 1350.544 ms/op
Iteration   1: 1642.977 ms/op
Iteration   2: 1160.726 ms/op
Iteration   3: 1117.805 ms/op

# Run progress: 36.96% complete, ETA 00:06:07
# Fork: 2 of 2
# Warmup Iteration   1: 3411.408 ms/op
# Warmup Iteration   2: 1396.973 ms/op
Iteration   1: 1338.263 ms/op
Iteration   2: 1148.464 ms/op
Iteration   3: 1125.906 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1255.690 ±(99.9%) 579.024 ms/op [Average]
  (min, avg, max) = (1117.805, 1255.690, 1642.977), stdev = 206.485
  CI (99.9%): [676.666, 1834.714] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:56
# Fork: 1 of 2
# Warmup Iteration   1: 0.321 ms/op
# Warmup Iteration   2: 0.104 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.100 ms/op
Iteration   3: 0.098 ms/op

# Run progress: 41.30% complete, ETA 00:05:39
# Fork: 2 of 2
# Warmup Iteration   1: 0.262 ms/op
# Warmup Iteration   2: 0.101 ms/op
Iteration   1: 0.099 ms/op
Iteration   2: 0.098 ms/op
Iteration   3: 0.097 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.098 ±(99.9%) 0.002 ms/op [Average]
  (min, avg, max) = (0.097, 0.098, 0.100), stdev = 0.001
  CI (99.9%): [0.096, 0.101] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 43.48% complete, ETA 00:05:24
# Fork: 1 of 2
# Warmup Iteration   1: 15.931 ms/op
# Warmup Iteration   2: 7.840 ms/op
Iteration   1: 7.525 ms/op
Iteration   2: 7.446 ms/op
Iteration   3: 7.481 ms/op

# Run progress: 45.65% complete, ETA 00:05:09
# Fork: 2 of 2
# Warmup Iteration   1: 16.849 ms/op
# Warmup Iteration   2: 7.800 ms/op
Iteration   1: 7.533 ms/op
Iteration   2: 7.706 ms/op
Iteration   3: 10.532 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  8.037 ±(99.9%) 3.437 ms/op [Average]
  (min, avg, max) = (7.446, 8.037, 10.532), stdev = 1.226
  CI (99.9%): [4.601, 11.474] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 47.83% complete, ETA 00:04:54
# Fork: 1 of 2
# Warmup Iteration   1: 1.092 ms/op
# Warmup Iteration   2: 0.646 ms/op
Iteration   1: 0.578 ms/op
Iteration   2: 0.576 ms/op
Iteration   3: 0.575 ms/op

# Run progress: 50.00% complete, ETA 00:04:40
# Fork: 2 of 2
# Warmup Iteration   1: 1.093 ms/op
# Warmup Iteration   2: 0.652 ms/op
Iteration   1: 0.581 ms/op
Iteration   2: 0.579 ms/op
Iteration   3: 0.579 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.578 ±(99.9%) 0.006 ms/op [Average]
  (min, avg, max) = (0.575, 0.578, 0.581), stdev = 0.002
  CI (99.9%): [0.572, 0.584] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 52.17% complete, ETA 00:04:26
# Fork: 1 of 2
# Warmup Iteration   1: 2.877 ms/op
# Warmup Iteration   2: 1.677 ms/op
Iteration   1: 1.717 ms/op
Iteration   2: 1.532 ms/op
Iteration   3: 1.564 ms/op

# Run progress: 54.35% complete, ETA 00:04:13
# Fork: 2 of 2
# Warmup Iteration   1: 2.783 ms/op
# Warmup Iteration   2: 1.581 ms/op
Iteration   1: 1.652 ms/op
Iteration   2: 1.504 ms/op
Iteration   3: 1.509 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.580 ±(99.9%) 0.242 ms/op [Average]
  (min, avg, max) = (1.504, 1.580, 1.717), stdev = 0.086
  CI (99.9%): [1.338, 1.822] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:59
# Fork: 1 of 2
# Warmup Iteration   1: 425.188 ms/op
# Warmup Iteration   2: 69.450 ms/op
Iteration   1: 42.879 ms/op
Iteration   2: 35.320 ms/op
Iteration   3: 34.014 ms/op

# Run progress: 58.70% complete, ETA 00:03:46
# Fork: 2 of 2
# Warmup Iteration   1: 509.708 ms/op
# Warmup Iteration   2: 67.780 ms/op
Iteration   1: 50.118 ms/op
Iteration   2: 50.972 ms/op
Iteration   3: 37.010 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  41.719 ±(99.9%) 20.985 ms/op [Average]
  (min, avg, max) = (34.014, 41.719, 50.972), stdev = 7.483
  CI (99.9%): [20.734, 62.704] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 101373.728 ms/op
# Warmup Iteration   2: 92484.381 ms/op
Iteration   1: 88523.541 ms/op
Iteration   2: 87999.245 ms/op
Iteration   3: 87803.655 ms/op

# Run progress: 63.04% complete, ETA 00:07:44
# Fork: 2 of 2
# Warmup Iteration   1: 101687.811 ms/op
# Warmup Iteration   2: 89440.972 ms/op
Iteration   1: 87930.637 ms/op
Iteration   2: 87353.352 ms/op
Iteration   3: 87357.278 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  87827.951 ±(99.9%) 1235.816 ms/op [Average]
  (min, avg, max) = (87353.352, 87827.951, 88523.541), stdev = 440.704
  CI (99.9%): [86592.135, 89063.767] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 32932.732 ms/op
# Warmup Iteration   2: 14149.406 ms/op
Iteration   1: 25305.928 ms/op
Iteration   2: 26570.323 ms/op
Iteration   3: 24877.706 ms/op

# Run progress: 67.39% complete, ETA 00:13:43
# Fork: 2 of 2
# Warmup Iteration   1: 32704.842 ms/op
# Warmup Iteration   2: 14384.635 ms/op
Iteration   1: 24873.774 ms/op
Iteration   2: 26173.721 ms/op
Iteration   3: 24906.577 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  25451.338 ±(99.9%) 2081.343 ms/op [Average]
  (min, avg, max) = (24873.774, 25451.338, 26570.323), stdev = 742.227
  CI (99.9%): [23369.995, 27532.682] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 14986.392 ms/op
# Warmup Iteration   2: 11315.392 ms/op
Iteration   1: 10463.681 ms/op
Iteration   2: 8250.922 ms/op
Iteration   3: 8327.240 ms/op

# Run progress: 71.74% complete, ETA 00:14:32
# Fork: 2 of 2
# Warmup Iteration   1: 15634.239 ms/op
# Warmup Iteration   2: 10396.714 ms/op
Iteration   1: 11357.977 ms/op
Iteration   2: 8824.645 ms/op
Iteration   3: 8855.870 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  9346.723 ±(99.9%) 3557.311 ms/op [Average]
  (min, avg, max) = (8250.922, 9346.723, 11357.977), stdev = 1268.571
  CI (99.9%): [5789.412, 12904.034] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:13:21
# Fork: 1 of 2
# Warmup Iteration   1: Nov 03, 2026 4:14:06 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 4:14:06 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
155.443 ms/op
# Warmup Iteration   2: 63.615 ms/op
Iteration   1: 66.435 ms/op
Iteration   2: 63.169 ms/op
Iteration   3: 62.811 ms/op

# Run progress: 76.09% complete, ETA 00:11:57
# Fork: 2 of 2
# Warmup Iteration   1: Nov 03, 2026 4:14:17 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 4:14:17 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
171.184 ms/op
# Warmup Iteration   2: 65.655 ms/op
Iteration   1: 58.940 ms/op
Iteration   2: 56.880 ms/op
Iteration   3: 56.334 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  60.762 ±(99.9%) 11.228 ms/op [Average]
  (min, avg, max) = (56.334, 60.762, 66.435), stdev = 4.004
  CI (99.9%): [49.533, 71.990] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:10:37
# Fork: 1 of 2
# Warmup Iteration   1: 138.620 ms/op
# Warmup Iteration   2: 66.825 ms/op
Iteration   1: 63.163 ms/op
Iteration   2: 62.999 ms/op
Iteration   3: 62.917 ms/op

# Run progress: 80.43% complete, ETA 00:09:20
# Fork: 2 of 2
# Warmup Iteration   1: 205.923 ms/op
# Warmup Iteration   2: 75.939 ms/op
Iteration   1: 67.273 ms/op
Iteration   2: 71.828 ms/op
Iteration   3: 83.432 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  68.602 ±(99.9%) 22.622 ms/op [Average]
  (min, avg, max) = (62.917, 68.602, 83.432), stdev = 8.067
  CI (99.9%): [45.980, 91.224] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:08:07
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
# Warmup Iteration   1: 48.958 ms/op
# Warmup Iteration   2: 26.122 ms/op
Iteration   1: 19.909 ms/op
Iteration   2: 18.606 ms/op
Iteration   3: 18.706 ms/op

# Run progress: 89.13% complete, ETA 00:04:46
# Fork: 2 of 2
# Warmup Iteration   1: 43.690 ms/op
# Warmup Iteration   2: 25.357 ms/op
Iteration   1: 20.535 ms/op
Iteration   2: 18.371 ms/op
Iteration   3: 18.582 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  19.118 ±(99.9%) 2.480 ms/op [Average]
  (min, avg, max) = (18.371, 19.118, 20.535), stdev = 0.884
  CI (99.9%): [16.639, 21.598] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 29.027 ms/op
# Warmup Iteration   2: 27.843 ms/op
Iteration   1: 13.910 ms/op
Iteration   2: 13.438 ms/op
Iteration   3: 13.764 ms/op

# Run progress: 93.48% complete, ETA 00:02:45
# Fork: 2 of 2
# Warmup Iteration   1: 31.475 ms/op
# Warmup Iteration   2: 22.842 ms/op
Iteration   1: 16.894 ms/op
Iteration   2: 15.690 ms/op
Iteration   3: 14.616 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  14.719 ±(99.9%) 3.740 ms/op [Average]
  (min, avg, max) = (13.438, 14.719, 16.894), stdev = 1.334
  CI (99.9%): [10.979, 18.458] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 50.200 ms/op
# Warmup Iteration   2: 34.300 ms/op
Iteration   1: 33.666 ms/op
Iteration   2: 33.241 ms/op
Iteration   3: 35.059 ms/op

# Run progress: 97.83% complete, ETA 00:00:53
# Fork: 2 of 2
# Warmup Iteration   1: 47.140 ms/op
# Warmup Iteration   2: 31.597 ms/op
Iteration   1: 31.117 ms/op
Iteration   2: 31.330 ms/op
Iteration   3: 31.117 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  32.588 ±(99.9%) 4.625 ms/op [Average]
  (min, avg, max) = (31.117, 32.588, 35.059), stdev = 1.649
  CI (99.9%): [27.963, 37.214] (assumes normal distribution)


# Run complete. Total time: 00:40:13

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     21.163 ±    0.925  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.619 ±    0.567  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      7.717 ±    1.515  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      8.772 ±    3.637  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     15.627 ±    6.918  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    575.807 ±  270.980  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    766.260 ±  525.319  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    521.802 ±   59.805  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1255.690 ±  579.024  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.098 ±    0.002  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      8.037 ±    3.437  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.578 ±    0.006  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.580 ±    0.242  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     41.719 ±   20.985  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  87827.951 ± 1235.816  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  25451.338 ± 2081.343  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   9346.723 ± 3557.311  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     60.762 ±   11.228  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     68.602 ±   22.622  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     19.118 ±    2.480  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     14.719 ±    3.740  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     32.588 ±    4.625  ms/op

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
[INFO] Total time:  4.061 s
[INFO] Finished at: 2026-11-03T16:16:33Z
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
tpFlashLeanGas                                                 60.0000  (101 ms)
tpFlashWellFluidSrk                                            83.6406  (236 ms)
tpFlashWellFluidPr                                             83.6541  (200 ms)
tpFlashWellFluidWithProperties                                 5445.46  (250 ms)
phAndPsFlashWellFluid                                          2459.23  (91 ms)
Nov 03, 2026 4:16:45 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 4:16:45 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (613 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (358 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   658.251  (130 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (68 ms)
saturationPointsWellFluid                                      1601.32  (177 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1416 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1754 ms)
levenbergMarquardtAntoine                                      1837.31  (15 ms)
levenbergMarquardtDoubleExponential                            5.57177  (9 ms)
dataReconciliation[20]                                         7.89841  (19 ms)
dataReconciliation[100]                                        37.0132  (62 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.027 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.397 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.036 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 341204 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 28 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    7.18e-03 (tolerance: 1.00e-02) OK [worst: expander process B::NGL pre flash separator -> gasOutStream]
  Temperature:  9.99e-03 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Pressure:     8.26e-04 (tolerance: 1.00e-02) OK [worst: compressor process B::TEE-104 -> Split Stream_0]
  Flow filters: absolute tolerance 36.9 kg/hr, boundary floor 36.9 kg/hr
  Auto-tuning:  auto-tuned to a plant feed rate of 3.693e+07 kg/hr: boundary floor 36.9 kg/hr, absolute flow tolerance 36.9 kg/hr, low-flow bypass 36.9 kg/hr on 131 unit(s), recycle flow tolerance on 6 loop(s), adaptive acceleration on 6 loop(s)
  Auto-accuracy: residual stalled at 9.99e-03 after 28 passes - accepted 1.00e-02 relative (engineering accuracy, ceiling 1.0e-02); set a tolerance explicitly to override
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
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 341.2 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 15026 ms, solved=true, gas=318849.59 kg/hr, water in/out=0.00027104531/1.5429560e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00015320084, composition error=0.0024425301
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=9.7366923e-05
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 15.04 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Total time:  06:22 min
[INFO] Finished at: 2026-11-03T16:22:58Z
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
# Warmup Iteration   1: 47.726 ms/op
# Warmup Iteration   2: 28.041 ms/op
Iteration   1: 21.377 ms/op
Iteration   2: 21.319 ms/op
Iteration   3: 20.993 ms/op

# Run progress: 2.17% complete, ETA 00:09:22
# Fork: 2 of 2
# Warmup Iteration   1: 47.292 ms/op
# Warmup Iteration   2: 25.890 ms/op
Iteration   1: 21.130 ms/op
Iteration   2: 21.524 ms/op
Iteration   3: 21.234 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  21.263 ±(99.9%) 0.526 ms/op [Average]
  (min, avg, max) = (20.993, 21.263, 21.524), stdev = 0.188
  CI (99.9%): [20.737, 21.789] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 4.35% complete, ETA 00:09:10
# Fork: 1 of 2
# Warmup Iteration   1: 5.263 ms/op
# Warmup Iteration   2: 3.298 ms/op
Iteration   1: 1.627 ms/op
Iteration   2: 1.477 ms/op
Iteration   3: 1.472 ms/op

# Run progress: 6.52% complete, ETA 00:08:57
# Fork: 2 of 2
# Warmup Iteration   1: 5.004 ms/op
# Warmup Iteration   2: 2.407 ms/op
Iteration   1: 1.814 ms/op
Iteration   2: 1.646 ms/op
Iteration   3: 1.522 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.593 ±(99.9%) 0.367 ms/op [Average]
  (min, avg, max) = (1.472, 1.593, 1.814), stdev = 0.131
  CI (99.9%): [1.226, 1.960] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 8.70% complete, ETA 00:08:45
# Fork: 1 of 2
# Warmup Iteration   1: 22.076 ms/op
# Warmup Iteration   2: 11.783 ms/op
Iteration   1: 8.175 ms/op
Iteration   2: 7.270 ms/op
Iteration   3: 7.305 ms/op

# Run progress: 10.87% complete, ETA 00:08:32
# Fork: 2 of 2
# Warmup Iteration   1: 20.480 ms/op
# Warmup Iteration   2: 11.840 ms/op
Iteration   1: 7.912 ms/op
Iteration   2: 7.276 ms/op
Iteration   3: 7.347 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  7.548 ±(99.9%) 1.105 ms/op [Average]
  (min, avg, max) = (7.270, 7.548, 8.175), stdev = 0.394
  CI (99.9%): [6.443, 8.653] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 13.04% complete, ETA 00:08:19
# Fork: 1 of 2
# Warmup Iteration   1: 24.576 ms/op
# Warmup Iteration   2: 12.963 ms/op
Iteration   1: 8.817 ms/op
Iteration   2: 7.728 ms/op
Iteration   3: 7.864 ms/op

# Run progress: 15.22% complete, ETA 00:08:06
# Fork: 2 of 2
# Warmup Iteration   1: 21.428 ms/op
# Warmup Iteration   2: 13.642 ms/op
Iteration   1: 9.282 ms/op
Iteration   2: 7.870 ms/op
Iteration   3: 8.003 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  8.261 ±(99.9%) 1.780 ms/op [Average]
  (min, avg, max) = (7.728, 8.261, 9.282), stdev = 0.635
  CI (99.9%): [6.481, 10.040] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 43.729 ms/op
# Warmup Iteration   2: 39.648 ms/op
Iteration   1: 18.421 ms/op
Iteration   2: 14.639 ms/op
Iteration   3: 13.696 ms/op

# Run progress: 19.57% complete, ETA 00:07:41
# Fork: 2 of 2
# Warmup Iteration   1: 47.044 ms/op
# Warmup Iteration   2: 24.941 ms/op
Iteration   1: 20.075 ms/op
Iteration   2: 14.691 ms/op
Iteration   3: 13.958 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  15.913 ±(99.9%) 7.469 ms/op [Average]
  (min, avg, max) = (13.696, 15.913, 20.075), stdev = 2.663
  CI (99.9%): [8.444, 23.382] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2958.097 ms/op
# Warmup Iteration   2: 910.883 ms/op
Iteration   1: 579.280 ms/op
Iteration   2: 484.932 ms/op
Iteration   3: 450.580 ms/op

# Run progress: 23.91% complete, ETA 00:07:17
# Fork: 2 of 2
# Warmup Iteration   1: 2857.067 ms/op
# Warmup Iteration   2: 937.446 ms/op
Iteration   1: 708.723 ms/op
Iteration   2: 503.525 ms/op
Iteration   3: 477.472 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  534.085 ±(99.9%) 269.170 ms/op [Average]
  (min, avg, max) = (450.580, 534.085, 708.723), stdev = 95.989
  CI (99.9%): [264.915, 803.255] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 26.09% complete, ETA 00:07:05
# Fork: 1 of 2
# Warmup Iteration   1: 3326.700 ms/op
# Warmup Iteration   2: 1254.333 ms/op
Iteration   1: 801.153 ms/op
Iteration   2: 589.050 ms/op
Iteration   3: 618.399 ms/op

# Run progress: 28.26% complete, ETA 00:06:55
# Fork: 2 of 2
# Warmup Iteration   1: 3840.173 ms/op
# Warmup Iteration   2: 1199.035 ms/op
Iteration   1: 713.245 ms/op
Iteration   2: 600.886 ms/op
Iteration   3: 598.833 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  653.594 ±(99.9%) 239.634 ms/op [Average]
  (min, avg, max) = (589.050, 653.594, 801.153), stdev = 85.456
  CI (99.9%): [413.961, 893.228] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2448.641 ms/op
# Warmup Iteration   2: 612.143 ms/op
Iteration   1: 541.475 ms/op
Iteration   2: 515.903 ms/op
Iteration   3: 496.365 ms/op

# Run progress: 32.61% complete, ETA 00:06:30
# Fork: 2 of 2
# Warmup Iteration   1: 2416.264 ms/op
# Warmup Iteration   2: 616.734 ms/op
Iteration   1: 544.321 ms/op
Iteration   2: 514.449 ms/op
Iteration   3: 501.522 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  519.006 ±(99.9%) 56.005 ms/op [Average]
  (min, avg, max) = (496.365, 519.006, 544.321), stdev = 19.972
  CI (99.9%): [463.001, 575.010] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 34.78% complete, ETA 00:06:15
# Fork: 1 of 2
# Warmup Iteration   1: 3332.789 ms/op
# Warmup Iteration   2: 1367.376 ms/op
Iteration   1: 1349.334 ms/op
Iteration   2: 1179.374 ms/op
Iteration   3: 1153.292 ms/op

# Run progress: 36.96% complete, ETA 00:06:05
# Fork: 2 of 2
# Warmup Iteration   1: 3329.584 ms/op
# Warmup Iteration   2: 1332.054 ms/op
Iteration   1: 1334.917 ms/op
Iteration   2: 1325.608 ms/op
Iteration   3: 1128.264 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1245.131 ±(99.9%) 285.456 ms/op [Average]
  (min, avg, max) = (1128.264, 1245.131, 1349.334), stdev = 101.796
  CI (99.9%): [959.675, 1530.588] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 39.13% complete, ETA 00:05:54
# Fork: 1 of 2
# Warmup Iteration   1: 0.353 ms/op
# Warmup Iteration   2: 0.106 ms/op
Iteration   1: 0.101 ms/op
Iteration   2: 0.100 ms/op
Iteration   3: 0.100 ms/op

# Run progress: 41.30% complete, ETA 00:05:38
# Fork: 2 of 2
# Warmup Iteration   1: 0.338 ms/op
# Warmup Iteration   2: 0.104 ms/op
Iteration   1: 0.101 ms/op
Iteration   2: 0.100 ms/op
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

# Run progress: 43.48% complete, ETA 00:05:23
# Fork: 1 of 2
# Warmup Iteration   1: 16.600 ms/op
# Warmup Iteration   2: 7.807 ms/op
Iteration   1: 7.505 ms/op
Iteration   2: 7.448 ms/op
Iteration   3: 7.478 ms/op

# Run progress: 45.65% complete, ETA 00:05:08
# Fork: 2 of 2
# Warmup Iteration   1: 16.568 ms/op
# Warmup Iteration   2: 7.915 ms/op
Iteration   1: 7.563 ms/op
Iteration   2: 7.478 ms/op
Iteration   3: 7.842 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.552 ±(99.9%) 0.412 ms/op [Average]
  (min, avg, max) = (7.448, 7.552, 7.842), stdev = 0.147
  CI (99.9%): [7.140, 7.964] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 1.078 ms/op
# Warmup Iteration   2: 0.645 ms/op
Iteration   1: 0.578 ms/op
Iteration   2: 0.574 ms/op
Iteration   3: 0.575 ms/op

# Run progress: 50.00% complete, ETA 00:04:39
# Fork: 2 of 2
# Warmup Iteration   1: 1.085 ms/op
# Warmup Iteration   2: 0.661 ms/op
Iteration   1: 0.819 ms/op
Iteration   2: 0.576 ms/op
Iteration   3: 0.576 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.616 ±(99.9%) 0.278 ms/op [Average]
  (min, avg, max) = (0.574, 0.616, 0.819), stdev = 0.099
  CI (99.9%): [0.338, 0.894] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 2.781 ms/op
# Warmup Iteration   2: 1.567 ms/op
Iteration   1: 1.662 ms/op
Iteration   2: 1.512 ms/op
Iteration   3: 1.500 ms/op

# Run progress: 54.35% complete, ETA 00:04:12
# Fork: 2 of 2
# Warmup Iteration   1: 2.850 ms/op
# Warmup Iteration   2: 1.586 ms/op
Iteration   1: 1.657 ms/op
Iteration   2: 1.501 ms/op
Iteration   3: 1.505 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.556 ±(99.9%) 0.225 ms/op [Average]
  (min, avg, max) = (1.500, 1.556, 1.662), stdev = 0.080
  CI (99.9%): [1.332, 1.781] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 56.52% complete, ETA 00:03:59
# Fork: 1 of 2
# Warmup Iteration   1: 506.084 ms/op
# Warmup Iteration   2: 69.485 ms/op
Iteration   1: 51.375 ms/op
Iteration   2: 38.004 ms/op
Iteration   3: 35.355 ms/op

# Run progress: 58.70% complete, ETA 00:03:46
# Fork: 2 of 2
# Warmup Iteration   1: 523.166 ms/op
# Warmup Iteration   2: 67.972 ms/op
Iteration   1: 47.172 ms/op
Iteration   2: 37.991 ms/op
Iteration   3: 36.603 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  41.083 ±(99.9%) 18.385 ms/op [Average]
  (min, avg, max) = (35.355, 41.083, 51.375), stdev = 6.556
  CI (99.9%): [22.698, 59.469] (assumes normal distribution)


# JMH version: 1.37
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
# Warmup Iteration   1: 104376.888 ms/op
# Warmup Iteration   2: 92006.422 ms/op
Iteration   1: 89799.079 ms/op
Iteration   2: 87985.875 ms/op
Iteration   3: 86169.828 ms/op

# Run progress: 63.04% complete, ETA 00:07:45
# Fork: 2 of 2
# Warmup Iteration   1: 101777.104 ms/op
# Warmup Iteration   2: 92178.896 ms/op
Iteration   1: 89625.226 ms/op
Iteration   2: 89313.246 ms/op
Iteration   3: 87119.975 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  88335.538 ±(99.9%) 4168.972 ms/op [Average]
  (min, avg, max) = (86169.828, 88335.538, 89799.079), stdev = 1486.696
  CI (99.9%): [84166.566, 92504.510] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 65.22% complete, ETA 00:11:09
# Fork: 1 of 2
# Warmup Iteration   1: 27514.019 ms/op
# Warmup Iteration   2: 24153.985 ms/op
Iteration   1: 25269.776 ms/op
Iteration   2: 23953.194 ms/op
Iteration   3: 21540.063 ms/op

# Run progress: 67.39% complete, ETA 00:13:59
# Fork: 2 of 2
# Warmup Iteration   1: 21901.157 ms/op
# Warmup Iteration   2: 24488.601 ms/op
Iteration   1: 20980.328 ms/op
Iteration   2: 23343.656 ms/op
Iteration   3: 19082.388 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  22361.568 ±(99.9%) 6306.760 ms/op [Average]
  (min, avg, max) = (19082.388, 22361.568, 25269.776), stdev = 2249.051
  CI (99.9%): [16054.808, 28668.327] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 69.57% complete, ETA 00:16:10
# Fork: 1 of 2
# Warmup Iteration   1: 14572.818 ms/op
# Warmup Iteration   2: 9463.951 ms/op
Iteration   1: 9820.715 ms/op
Iteration   2: 7944.728 ms/op
Iteration   3: 8217.279 ms/op

# Run progress: 71.74% complete, ETA 00:14:53
# Fork: 2 of 2
# Warmup Iteration   1: 14791.347 ms/op
# Warmup Iteration   2: 10160.723 ms/op
Iteration   1: 9483.591 ms/op
Iteration   2: 8165.031 ms/op
Iteration   3: 8830.708 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  8743.675 ±(99.9%) 2159.516 ms/op [Average]
  (min, avg, max) = (7944.728, 8743.675, 9820.715), stdev = 770.104
  CI (99.9%): [6584.159, 10903.191] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 73.91% complete, ETA 00:13:38
# Fork: 1 of 2
# Warmup Iteration   1: Nov 03, 2026 5:01:41 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 5:01:41 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
184.106 ms/op
# Warmup Iteration   2: 74.562 ms/op
Iteration   1: 59.183 ms/op
Iteration   2: 56.756 ms/op
Iteration   3: 56.125 ms/op

# Run progress: 76.09% complete, ETA 00:12:12
# Fork: 2 of 2
# Warmup Iteration   1: Nov 03, 2026 5:01:53 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Nov 03, 2026 5:01:53 PM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
174.199 ms/op
# Warmup Iteration   2: 69.711 ms/op
Iteration   1: 65.769 ms/op
Iteration   2: 63.349 ms/op
Iteration   3: 62.630 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  60.635 ±(99.9%) 10.875 ms/op [Average]
  (min, avg, max) = (56.125, 60.635, 65.769), stdev = 3.878
  CI (99.9%): [49.760, 71.510] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 78.26% complete, ETA 00:10:51
# Fork: 1 of 2
# Warmup Iteration   1: 137.586 ms/op
# Warmup Iteration   2: 72.088 ms/op
Iteration   1: 69.804 ms/op
Iteration   2: 69.764 ms/op
Iteration   3: 69.665 ms/op

# Run progress: 80.43% complete, ETA 00:09:33
# Fork: 2 of 2
# Warmup Iteration   1: 208.139 ms/op
# Warmup Iteration   2: 81.281 ms/op
Iteration   1: 63.137 ms/op
Iteration   2: 62.823 ms/op
Iteration   3: 63.251 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  66.407 ±(99.9%) 10.259 ms/op [Average]
  (min, avg, max) = (62.823, 66.407, 69.804), stdev = 3.659
  CI (99.9%): [56.148, 76.667] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 82.61% complete, ETA 00:08:18
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:07:07
# Fork: 2 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: 0.001 ms/op
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

# Run progress: 86.96% complete, ETA 00:05:58
# Fork: 1 of 2
# Warmup Iteration   1: 44.918 ms/op
# Warmup Iteration   2: 25.745 ms/op
Iteration   1: 20.455 ms/op
Iteration   2: 18.567 ms/op
Iteration   3: 18.784 ms/op

# Run progress: 89.13% complete, ETA 00:04:53
# Fork: 2 of 2
# Warmup Iteration   1: 44.730 ms/op
# Warmup Iteration   2: 28.020 ms/op
Iteration   1: 20.155 ms/op
Iteration   2: 18.374 ms/op
Iteration   3: 18.818 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  19.192 ±(99.9%) 2.473 ms/op [Average]
  (min, avg, max) = (18.374, 19.192, 20.455), stdev = 0.882
  CI (99.9%): [16.719, 21.665] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 91.30% complete, ETA 00:03:50
# Fork: 1 of 2
# Warmup Iteration   1: 34.141 ms/op
# Warmup Iteration   2: 19.235 ms/op
Iteration   1: 14.091 ms/op
Iteration   2: 15.431 ms/op
Iteration   3: 15.874 ms/op

# Run progress: 93.48% complete, ETA 00:02:49
# Fork: 2 of 2
# Warmup Iteration   1: 33.135 ms/op
# Warmup Iteration   2: 21.700 ms/op
Iteration   1: 15.923 ms/op
Iteration   2: 15.424 ms/op
Iteration   3: 14.328 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  15.179 ±(99.9%) 2.197 ms/op [Average]
  (min, avg, max) = (14.091, 15.179, 15.923), stdev = 0.783
  CI (99.9%): [12.982, 17.375] (assumes normal distribution)


# JMH version: 1.37
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

# Run progress: 95.65% complete, ETA 00:01:50
# Fork: 1 of 2
# Warmup Iteration   1: 44.834 ms/op
# Warmup Iteration   2: 40.056 ms/op
Iteration   1: 30.898 ms/op
Iteration   2: 30.559 ms/op
Iteration   3: 31.676 ms/op

# Run progress: 97.83% complete, ETA 00:00:54
# Fork: 2 of 2
# Warmup Iteration   1: 44.995 ms/op
# Warmup Iteration   2: 32.178 ms/op
Iteration   1: 31.748 ms/op
Iteration   2: 31.777 ms/op
Iteration   3: 31.823 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  31.413 ±(99.9%) 1.523 ms/op [Average]
  (min, avg, max) = (30.559, 31.413, 31.823), stdev = 0.543
  CI (99.9%): [29.890, 32.937] (assumes normal distribution)


# Run complete. Total time: 00:41:03

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
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     21.263 ±    0.526  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.593 ±    0.367  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      7.548 ±    1.105  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      8.261 ±    1.780  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     15.913 ±    7.469  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    534.085 ±  269.170  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6    653.594 ±  239.634  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    519.006 ±   56.005  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1245.131 ±  285.456  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.100 ±    0.001  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.552 ±    0.412  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.616 ±    0.278  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.556 ±    0.225  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     41.083 ±   18.385  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  88335.538 ± 4168.972  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6  22361.568 ± 6306.760  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6   8743.675 ± 2159.516  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     60.635 ±   10.875  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     66.407 ±   10.259  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³             ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6     19.192 ±    2.473  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     15.179 ±    2.197  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     31.413 ±    1.523  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Benchmark Timing Comparison

NeqSim **3.19.0 -> 3.20.0**, using identical benchmark sources.
Benchmark suite revision: `B14-87c78035e6f4`
23 benchmark/parameter cases: 15 lower, 8 higher, 0 unchanged mean timings.

Largest changes (up to 10). Lower ms/op is better; positive change means slower.

| Benchmark | Baseline ms/op | Current ms/op | Change | Confidence |
| --- | ---: | ---: | ---: | --- |
| flash.TPflash_UMR.testFlash_UMR | 766.26 | 653.594 | -14.70% | Overlapping CIs |
| process.LargeProcessModelBenchmark.rerunAfterRateChange | 25451.3 | 22361.6 | -12.14% | Overlapping CIs |
| flash.TPflash.testFlash | 575.807 | 534.085 | -7.25% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine | 0.577867 | 0.616434 | +6.67% | Overlapping CIs |
| process.TEGprocess.testTEGprocess | 9346.72 | 8743.68 | -6.45% | Overlapping CIs |
| numerics.LinearAlgebraKernelBenchmark.dataReconciliation (nodes=100) | 8.03714 | 7.55218 | -6.03% | Overlapping CIs |
| flash.FlashBenchmark.tpFlashWellFluidSrk | 8.77218 | 8.26081 | -5.83% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid | 32.5883 | 31.4134 | -3.61% | Overlapping CIs |
| thermo.InterfacialTensionBenchmark.gasOilSurfaceTension (model=Simple Gradient Theory) | 68.6022 | 66.4073 | -3.20% | Overlapping CIs |
| thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid | 14.7186 | 15.1786 | +3.13% | Overlapping CIs |

Hosted-runner timings are indicative, not a regression gate. Overlapping confidence intervals do not establish a timing difference. Full JMH results are in the run logs.
Two forks, two 2-second warmups and three 2-second measurements per case, one thread.

```
