# NeqSim 3.14.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.13.0 |
| Current | 3.14.0 |
| Source commit | `ba498a941ae7f1ca673275b2b3bfdbb409e98c42` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/40483799429) |
| Status | incomplete |


## benchmark-revision.json

```text
{
  "number": 13,
  "label": "B13-b048238496c5",
  "fingerprint": "b048238496c557d6de94a734de7ddbbf0dec223af649ff65f992cfe1488dfd3c",
  "source_commit": "ba498a941ae7f1ca673275b2b3bfdbb409e98c42",
  "updated_at": "2026-10-22",
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
    "src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java": "ca06f2817fda0161c6e416b61c50e3ffb65999830f1d693dad57384b66bf03a4",
    "src/main/java/com/equinor/neqsim/benchmark/process/TEGprocess.java": "2e3be31a0adf16c5f7ae5c6854babfd8df641e2e9d241ef8467ff16e1de35602",
    "src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java": "8774baa0bf170ed6646a4f67b67cb9d9259b8b765202417a6f16bd0892b3d669",
    "src/main/java/com/equinor/neqsim/benchmark/thermo/PhaseEnvelopeBenchmark.java": "7abf7ec3acdca4a3c1599fa3ee33670b708855c207103f16dc8d3e6bb83ca78c",
    "src/main/java/com/equinor/neqsim/benchmark/util/BenchmarkFluids.java": "87ea44ebc643643e5acffedeadb95d6bba553daaed4a026d076f38646c77fdb0",
    "src/main/resources/fluids/platform_feed.e300": "32f4eb0253f888fa2c96a36fe76d26e085dda3308d5a80b11ce9899993aceb7b"
  },
  "changes": {
    "added": [
      "src/main/java/com/equinor/neqsim/benchmark/process/LargeProcessModelBenchmark.java",
      "src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java"
    ],
    "modified": [
      "src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java"
    ],
    "deleted": []
  }
}

```


## benchmark-environment.txt

```text
openjdk version "21.0.12.1" 2026-08-18 LTS
OpenJDK Runtime Environment Temurin-21.0.12.1+1 (build 21.0.12.1+1-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.12.1+1 (build 21.0.12.1+1-LTS, mixed mode, sharing)
Apache Maven 3.9.15 (98b2cdbfdb5f1ac8781f537ea9acccaed7922349)
Maven home: /usr/share/apache-maven-3.9.15
Java version: 21.0.12.1, vendor: Eclipse Adoptium, runtime: /usr/lib/jvm/temurin-21-jdk-amd64
Default locale: en, platform encoding: UTF-8
OS name: "linux", version: "7.0.0-1017-azure", arch: "amd64", family: "unix"
Linux runnervmr9t6g 7.0.0-1017-azure #17-Ubuntu SMP PREEMPT Thu Sep 24 15:54:51 UTC 2026 x86_64 GNU/Linux
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
| baseline | 3.13.0 | failed (exit 1) |
| current | 3.14.0 | passed |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.13.0",
  "version": "3.13.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.13.0/neqsim-3.13.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.14.0",
  "version": "3.14.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.14.0/neqsim-3.14.0.jar",
  "source": "embedded Maven pom.properties"
}

```


## baseline-build-exit-code.txt

```text
1

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
[INFO] Total time:  7.314 s
[INFO] Finished at: 2026-10-27T09:50:48Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.13.0 (neqsim-3.13.0.jar); requested: 3.13.0
$ mvn clean verify -Dneqsim.version=3.13.0
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
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.644 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (59 ms)
tpFlashWellFluidSrk                                            83.6406  (101 ms)
tpFlashWellFluidPr                                             83.6541  (74 ms)
tpFlashWellFluidWithProperties                                 5445.46  (150 ms)
phAndPsFlashWellFluid                                          2459.23  (92 ms)
Oct 27, 2026 9:51:04 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 27, 2026 9:51:04 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (615 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (387 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (34 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (75 ms)
saturationPointsWellFluid                                      1601.32  (145 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1780 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1667 ms)
levenbergMarquardtAntoine                                      1837.31  (12 ms)
levenbergMarquardtDoubleExponential                            5.57177  (11 ms)
dataReconciliation[20]                                         7.89841  (1 ms)
dataReconciliation[100]                                        37.0132  (18 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.765 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 2718399 ms
=== ProcessModel Convergence Summary ===
Converged: NO
Iterations: 150 / 150
Boundary streams tracked: 26
Boundary values converged: NO
All process areas solved: YES

Final Errors (relative):
  Flow rate:    5.72e-02 (tolerance: 1.00e-04) NOT CONVERGED
  Temperature:  9.87e-03 (tolerance: 1.00e-04) NOT CONVERGED
  Pressure:     8.48e-03 (tolerance: 1.00e-04) NOT CONVERGED

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED

[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 2718 s <<< FAILURE! -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[ERROR] com.equinor.neqsim.benchmark.OilGasPlatformModelTest.platformModelSolves -- Time elapsed: 2718 s <<< FAILURE!
org.opentest4j.AssertionFailedError: Full platform did not converge ==> expected: <true> but was: <false>
	at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
	at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)
	at org.junit.jupiter.api.AssertTrue.failNotTrue(AssertTrue.java:63)
	at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:36)
	at org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:214)
	at com.equinor.neqsim.benchmark.OilGasPlatformModelTest.platformModelSolves(OilGasPlatformModelTest.java:28)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)

[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 15.37 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 26956 ms, solved=true, gas=318849.57 kg/hr, water in/out=0.00027173922/1.5391249e-05
TEG recycle stripping gas recirc: solved=true, flow error=9.9210333e-05, composition error=0.0015789095
TEG recycle lean TEG resycle: solved=true, flow error=1.9984014e-14, composition error=0.00031074765
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 26.96 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Failures: 
[ERROR]   OilGasPlatformModelTest.platformModelSolves:28 Full platform did not converge ==> expected: <true> but was: <false>
[INFO] 
[ERROR] Tests run: 10, Failures: 1, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  46:20 min
[INFO] Finished at: 2026-10-27T10:37:10Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.5.2:test (default-test) on project neqsim-benchmark: There are test failures.
[ERROR] 
[ERROR] See /home/runner/work/_temp/benchmark-project/target/surefire-reports for the individual test results.
[ERROR] See dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```


## baseline-benchmarks.txt

Not produced; the run did not reach this stage.


## baseline-benchmarks.log

Not produced; the run did not reach this stage.


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
[INFO] Total time:  3.580 s
[INFO] Finished at: 2026-10-27T10:37:15Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.14.0 (neqsim-3.14.0.jar); requested: 3.14.0
$ mvn clean verify -Dneqsim.version=3.14.0
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
[INFO] Running com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.746 s -- in com.equinor.neqsim.benchmark.numerics.DataReconciliationTest
[INFO] Running com.equinor.neqsim.benchmark.BenchmarkSmokeTest
tpFlashLeanGas                                                 60.0000  (67 ms)
tpFlashWellFluidSrk                                            83.6406  (102 ms)
tpFlashWellFluidPr                                             83.6541  (67 ms)
tpFlashWellFluidWithProperties                                 5445.46  (178 ms)
phAndPsFlashWellFluid                                          2459.23  (104 ms)
Oct 27, 2026 10:37:26 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 27, 2026 10:37:26 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
gasOilSurfaceTension[Full Gradient Theory]                  0.00951991  (524 ms)
gasOilSurfaceTension[Simple Gradient Theory]                 0.0102537  (332 ms)
gasOilSurfaceTension[Parachor]                              0.00976303  (0 ms)
ptPhaseEnvelopeGasCondensate                                   343.150  (39 ms)
ptPhaseEnvelopeWellFluid                                       638.700  (125 ms)
saturationPointsWellFluid                                      1601.32  (163 ms)
singlePhaseGasPipelineSteadyState                              121.628  (1690 ms)
twoPhaseNonEquilibriumPipeSteadyState                          4.98715  (1751 ms)
levenbergMarquardtAntoine                                      1837.31  (14 ms)
levenbergMarquardtDoubleExponential                            5.57177  (10 ms)
dataReconciliation[20]                                         7.89841  (1 ms)
dataReconciliation[100]                                        37.0132  (21 ms)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.644 s -- in com.equinor.neqsim.benchmark.BenchmarkSmokeTest
[INFO] Running com.equinor.neqsim.benchmark.OilGasPlatformModelTest
platform model cold run: 283011 ms
=== ProcessModel Convergence Summary ===
Converged: YES
Iterations: 95 / 150
Boundary streams tracked: 26
Boundary values converged: YES
All process areas solved: YES

Final Errors (relative):
  Flow rate:    9.10e-05 (tolerance: 1.00e-04) OK
  Temperature:  2.26e-05 (tolerance: 1.00e-04) OK
  Pressure:     6.05e-05 (tolerance: 1.00e-04) OK

Process Status:
  well and manifold process     : SOLVED
  separation train A            : SOLVED
  separation train B            : SOLVED
  expander process A            : SOLVED
  expander process B            : SOLVED
  compressor process A          : SOLVED
  compressor process B          : SOLVED
  export and utilities          : SOLVED

feed 5489240.1, gas 264778.6 + 378160.6, oil 1995467.7 + 2850763.3, water 0.0 kg/hr
1st stage gas A 5.309 MSm3/d, export gas 19.449 MSm3/d, KA27841 A 102.5 bara, pipeline outlet 50.8 bara
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 283.0 s -- in com.equinor.neqsim.benchmark.OilGasPlatformModelTest
[INFO] Running com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 14.16 s -- in com.equinor.neqsim.benchmark.LegacyFlashTest
[INFO] Running com.equinor.neqsim.benchmark.TEGprocessTest
TEG full process: 26901 ms, solved=true, gas=318849.57 kg/hr, water in/out=0.00027173922/1.5382411e-05
TEG recycle stripping gas recirc: solved=true, flow error=0.00018460518, composition error=0.0029034392
TEG recycle lean TEG resycle: solved=true, flow error=0.0000000, composition error=0.00013719865
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 26.91 s -- in com.equinor.neqsim.benchmark.TEGprocessTest
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
[INFO] Including com.equinor.neqsim:neqsim:jar:3.14.0 in the shaded jar.
[INFO] Including org.openjdk.jmh:jmh-core:jar:1.37 in the shaded jar.
[INFO] Including net.sf.jopt-simple:jopt-simple:jar:5.0.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
[WARNING] neqsim-3.14.0.jar, commons-math3-3.6.1.jar define 1301 overlapping classes: 
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
[INFO] Total time:  05:50 min
[INFO] Finished at: 2026-10-27T10:43:07Z
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
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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
# Warmup Iteration   1: 39.376 ms/op
# Warmup Iteration   2: 20.361 ms/op
Iteration   1: 19.255 ms/op
Iteration   2: 19.362 ms/op
Iteration   3: 19.198 ms/op

# Run progress: 2.17% complete, ETA 00:09:29
# Fork: 2 of 2
# Warmup Iteration   1: 41.364 ms/op
# Warmup Iteration   2: 20.282 ms/op
Iteration   1: 19.331 ms/op
Iteration   2: 19.665 ms/op
Iteration   3: 19.028 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.phAndPsFlashWellFluid":
  19.307 ±(99.9%) 0.593 ms/op [Average]
  (min, avg, max) = (19.028, 19.307, 19.665), stdev = 0.212
  CI (99.9%): [18.713, 19.900] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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
# Warmup Iteration   1: 6.297 ms/op
# Warmup Iteration   2: 3.542 ms/op
Iteration   1: 1.617 ms/op
Iteration   2: 1.510 ms/op
Iteration   3: 1.507 ms/op

# Run progress: 6.52% complete, ETA 00:09:00
# Fork: 2 of 2
# Warmup Iteration   1: 4.412 ms/op
# Warmup Iteration   2: 1.913 ms/op
Iteration   1: 1.503 ms/op
Iteration   2: 1.499 ms/op
Iteration   3: 1.498 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashLeanGas":
  1.522 ±(99.9%) 0.130 ms/op [Average]
  (min, avg, max) = (1.498, 1.522, 1.617), stdev = 0.046
  CI (99.9%): [1.392, 1.652] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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
# Warmup Iteration   1: 16.833 ms/op
# Warmup Iteration   2: 11.125 ms/op
Iteration   1: 7.286 ms/op
Iteration   2: 6.655 ms/op
Iteration   3: 6.705 ms/op

# Run progress: 10.87% complete, ETA 00:08:32
# Fork: 2 of 2
# Warmup Iteration   1: 18.046 ms/op
# Warmup Iteration   2: 10.936 ms/op
Iteration   1: 6.957 ms/op
Iteration   2: 6.573 ms/op
Iteration   3: 6.534 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidPr":
  6.785 ±(99.9%) 0.805 ms/op [Average]
  (min, avg, max) = (6.534, 6.785, 7.286), stdev = 0.287
  CI (99.9%): [5.980, 7.590] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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
# Warmup Iteration   1: 16.155 ms/op
# Warmup Iteration   2: 8.158 ms/op
Iteration   1: 6.368 ms/op
Iteration   2: 6.352 ms/op
Iteration   3: 6.419 ms/op

# Run progress: 15.22% complete, ETA 00:08:07
# Fork: 2 of 2
# Warmup Iteration   1: 18.538 ms/op
# Warmup Iteration   2: 11.050 ms/op
Iteration   1: 6.879 ms/op
Iteration   2: 6.480 ms/op
Iteration   3: 6.471 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidSrk":
  6.495 ±(99.9%) 0.547 ms/op [Average]
  (min, avg, max) = (6.352, 6.495, 6.879), stdev = 0.195
  CI (99.9%): [5.948, 7.042] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties

# Run progress: 17.39% complete, ETA 00:07:58
# Fork: 1 of 2
# Warmup Iteration   1: 32.290 ms/op
# Warmup Iteration   2: 19.279 ms/op
Iteration   1: 13.847 ms/op
Iteration   2: 11.953 ms/op
Iteration   3: 11.802 ms/op

# Run progress: 19.57% complete, ETA 00:07:46
# Fork: 2 of 2
# Warmup Iteration   1: 40.906 ms/op
# Warmup Iteration   2: 20.158 ms/op
Iteration   1: 16.829 ms/op
Iteration   2: 12.482 ms/op
Iteration   3: 12.249 ms/op


Result "com.equinor.neqsim.benchmark.flash.FlashBenchmark.tpFlashWellFluidWithProperties":
  13.193 ±(99.9%) 5.396 ms/op [Average]
  (min, avg, max) = (11.802, 13.193, 16.829), stdev = 1.924
  CI (99.9%): [7.797, 18.590] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.TPflash.testFlash

# Run progress: 21.74% complete, ETA 00:07:33
# Fork: 1 of 2
# Warmup Iteration   1: 3087.581 ms/op
# Warmup Iteration   2: 925.834 ms/op
Iteration   1: 605.008 ms/op
Iteration   2: 502.321 ms/op
Iteration   3: 455.213 ms/op

# Run progress: 23.91% complete, ETA 00:07:23
# Fork: 2 of 2
# Warmup Iteration   1: 2916.724 ms/op
# Warmup Iteration   2: 898.067 ms/op
Iteration   1: 613.029 ms/op
Iteration   2: 595.533 ms/op
Iteration   3: 478.647 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash.testFlash":
  541.625 ±(99.9%) 198.286 ms/op [Average]
  (min, avg, max) = (455.213, 541.625, 613.029), stdev = 70.711
  CI (99.9%): [343.339, 739.911] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR

# Run progress: 26.09% complete, ETA 00:07:12
# Fork: 1 of 2
# Warmup Iteration   1: 12001.158 ms/op
# Warmup Iteration   2: 7250.301 ms/op
Iteration   1: 6125.456 ms/op
Iteration   2: 6092.888 ms/op
Iteration   3: 6022.078 ms/op

# Run progress: 28.26% complete, ETA 00:08:03
# Fork: 2 of 2
# Warmup Iteration   1: 12211.454 ms/op
# Warmup Iteration   2: 7818.421 ms/op
Iteration   1: 6165.855 ms/op
Iteration   2: 6193.440 ms/op
Iteration   3: 6108.098 ms/op


Result "com.equinor.neqsim.benchmark.flash.TPflash_UMR.testFlash_UMR":
  6117.969 ±(99.9%) 168.095 ms/op [Average]
  (min, avg, max) = (6022.078, 6117.969, 6193.440), stdev = 59.944
  CI (99.9%): [5949.874, 6286.064] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState

# Run progress: 30.43% complete, ETA 00:08:43
# Fork: 1 of 2
# Warmup Iteration   1: 2531.515 ms/op
# Warmup Iteration   2: 645.847 ms/op
Iteration   1: 555.268 ms/op
Iteration   2: 514.374 ms/op
Iteration   3: 508.041 ms/op

# Run progress: 32.61% complete, ETA 00:08:17
# Fork: 2 of 2
# Warmup Iteration   1: 2547.018 ms/op
# Warmup Iteration   2: 628.886 ms/op
Iteration   1: 560.052 ms/op
Iteration   2: 518.486 ms/op
Iteration   3: 518.479 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState":
  529.117 ±(99.9%) 63.061 ms/op [Average]
  (min, avg, max) = (508.041, 529.117, 560.052), stdev = 22.488
  CI (99.9%): [466.056, 592.177] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState

# Run progress: 34.78% complete, ETA 00:07:53
# Fork: 1 of 2
# Warmup Iteration   1: 3424.255 ms/op
# Warmup Iteration   2: 1343.355 ms/op
Iteration   1: 1242.785 ms/op
Iteration   2: 1219.533 ms/op
Iteration   3: 1128.684 ms/op

# Run progress: 36.96% complete, ETA 00:07:34
# Fork: 2 of 2
# Warmup Iteration   1: 4131.719 ms/op
# Warmup Iteration   2: 1353.798 ms/op
Iteration   1: 1349.902 ms/op
Iteration   2: 1138.176 ms/op
Iteration   3: 1134.324 ms/op


Result "com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState":
  1202.234 ±(99.9%) 244.059 ms/op [Average]
  (min, avg, max) = (1128.684, 1202.234, 1349.902), stdev = 87.034
  CI (99.9%): [958.175, 1446.293] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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

# Run progress: 39.13% complete, ETA 00:07:16
# Fork: 1 of 2
# Warmup Iteration   1: 0.371 ms/op
# Warmup Iteration   2: 0.105 ms/op
Iteration   1: 0.101 ms/op
Iteration   2: 0.100 ms/op
Iteration   3: 0.100 ms/op

# Run progress: 41.30% complete, ETA 00:06:53
# Fork: 2 of 2
# Warmup Iteration   1: 0.350 ms/op
# Warmup Iteration   2: 0.112 ms/op
Iteration   1: 0.098 ms/op
Iteration   2: 0.098 ms/op
Iteration   3: 0.098 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  0.099 ±(99.9%) 0.004 ms/op [Average]
  (min, avg, max) = (0.098, 0.099, 0.101), stdev = 0.001
  CI (99.9%): [0.095, 0.103] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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

# Run progress: 43.48% complete, ETA 00:06:31
# Fork: 1 of 2
# Warmup Iteration   1: 17.569 ms/op
# Warmup Iteration   2: 7.861 ms/op
Iteration   1: 7.560 ms/op
Iteration   2: 7.480 ms/op
Iteration   3: 7.533 ms/op

# Run progress: 45.65% complete, ETA 00:06:11
# Fork: 2 of 2
# Warmup Iteration   1: 17.459 ms/op
# Warmup Iteration   2: 7.816 ms/op
Iteration   1: 7.568 ms/op
Iteration   2: 7.458 ms/op
Iteration   3: 7.867 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.dataReconciliation":
  7.578 ±(99.9%) 0.415 ms/op [Average]
  (min, avg, max) = (7.458, 7.578, 7.867), stdev = 0.148
  CI (99.9%): [7.162, 7.993] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine

# Run progress: 47.83% complete, ETA 00:05:51
# Fork: 1 of 2
# Warmup Iteration   1: 1.144 ms/op
# Warmup Iteration   2: 0.649 ms/op
Iteration   1: 0.583 ms/op
Iteration   2: 0.839 ms/op
Iteration   3: 0.581 ms/op

# Run progress: 50.00% complete, ETA 00:05:32
# Fork: 2 of 2
# Warmup Iteration   1: 1.109 ms/op
# Warmup Iteration   2: 0.651 ms/op
Iteration   1: 0.589 ms/op
Iteration   2: 0.587 ms/op
Iteration   3: 0.588 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine":
  0.628 ±(99.9%) 0.291 ms/op [Average]
  (min, avg, max) = (0.581, 0.628, 0.839), stdev = 0.104
  CI (99.9%): [0.337, 0.918] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential

# Run progress: 52.17% complete, ETA 00:05:14
# Fork: 1 of 2
# Warmup Iteration   1: 2.882 ms/op
# Warmup Iteration   2: 1.622 ms/op
Iteration   1: 1.668 ms/op
Iteration   2: 1.514 ms/op
Iteration   3: 1.521 ms/op

# Run progress: 54.35% complete, ETA 00:04:56
# Fork: 2 of 2
# Warmup Iteration   1: 2.846 ms/op
# Warmup Iteration   2: 1.596 ms/op
Iteration   1: 1.648 ms/op
Iteration   2: 1.498 ms/op
Iteration   3: 1.501 ms/op


Result "com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential":
  1.558 ±(99.9%) 0.219 ms/op [Average]
  (min, avg, max) = (1.498, 1.558, 1.668), stdev = 0.078
  CI (99.9%): [1.340, 1.777] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess

# Run progress: 56.52% complete, ETA 00:04:39
# Fork: 1 of 2
# Warmup Iteration   1: 516.437 ms/op
# Warmup Iteration   2: 70.159 ms/op
Iteration   1: 50.194 ms/op
Iteration   2: 38.822 ms/op
Iteration   3: 35.463 ms/op

# Run progress: 58.70% complete, ETA 00:04:23
# Fork: 2 of 2
# Warmup Iteration   1: 667.144 ms/op
# Warmup Iteration   2: 78.840 ms/op
Iteration   1: 48.066 ms/op
Iteration   2: 38.436 ms/op
Iteration   3: 35.164 ms/op


Result "com.equinor.neqsim.benchmark.process.Compressor_Benchmark.compressorprocess":
  41.024 ±(99.9%) 18.194 ms/op [Average]
  (min, avg, max) = (35.164, 41.024, 50.194), stdev = 6.488
  CI (99.9%): [22.830, 59.218] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport

# Run progress: 60.87% complete, ETA 00:04:07
# Fork: 1 of 2
# Warmup Iteration   1: 27903.868 ms/op
# Warmup Iteration   2: 20712.343 ms/op
Iteration   1: 20474.388 ms/op
Iteration   2: 19923.286 ms/op
Iteration   3: 19927.978 ms/op

# Run progress: 63.04% complete, ETA 00:04:50
# Fork: 2 of 2
# Warmup Iteration   1: 26958.257 ms/op
# Warmup Iteration   2: 20578.159 ms/op
Iteration   1: 19939.331 ms/op
Iteration   2: 20398.280 ms/op
Iteration   3: 19951.279 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.coldStartBuildRunReport":
  20102.424 ±(99.9%) 728.931 ms/op [Average]
  (min, avg, max) = (19923.286, 20102.424, 20474.388), stdev = 259.944
  CI (99.9%): [19373.493, 20831.355] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange

# Run progress: 65.22% complete, ETA 00:05:22
# Fork: 1 of 2
# Warmup Iteration   1: 8471.445 ms/op
# Warmup Iteration   2: 8056.310 ms/op
Iteration   1: 8002.426 ms/op
Iteration   2: 8021.871 ms/op
Iteration   3: 7957.656 ms/op

# Run progress: 67.39% complete, ETA 00:07:19
# Fork: 2 of 2
# Warmup Iteration   1: 8041.869 ms/op
# Warmup Iteration   2: 8086.299 ms/op
Iteration   1: 8004.319 ms/op
Iteration   2: 8136.770 ms/op
Iteration   3: 7974.127 ms/op


Result "com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark.rerunAfterRateChange":
  8016.195 ±(99.9%) 177.785 ms/op [Average]
  (min, avg, max) = (7957.656, 8016.195, 8136.770), stdev = 63.400
  CI (99.9%): [7838.410, 8193.979] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess

# Run progress: 69.57% complete, ETA 00:08:49
# Fork: 1 of 2
# Warmup Iteration   1: 25815.366 ms/op
# Warmup Iteration   2: 16347.497 ms/op
Iteration   1: 14223.619 ms/op
Iteration   2: 13363.584 ms/op
Iteration   3: 13805.713 ms/op

# Run progress: 71.74% complete, ETA 00:08:30
# Fork: 2 of 2
# Warmup Iteration   1: 22774.117 ms/op
# Warmup Iteration   2: 15543.364 ms/op
Iteration   1: 13347.812 ms/op
Iteration   2: 13618.819 ms/op
Iteration   3: 13575.722 ms/op


Result "com.equinor.neqsim.benchmark.process.TEGprocess.testTEGprocess":
  13655.878 ±(99.9%) 915.488 ms/op [Average]
  (min, avg, max) = (13347.812, 13655.878, 14223.619), stdev = 326.472
  CI (99.9%): [12740.390, 14571.366] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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

# Run progress: 73.91% complete, ETA 00:08:04
# Fork: 1 of 2
# Warmup Iteration   1: Oct 27, 2026 11:06:04 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 27, 2026 11:06:04 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
169.388 ms/op
# Warmup Iteration   2: 64.114 ms/op
Iteration   1: 66.252 ms/op
Iteration   2: 63.562 ms/op
Iteration   3: 62.810 ms/op

# Run progress: 76.09% complete, ETA 00:07:15
# Fork: 2 of 2
# Warmup Iteration   1: Oct 27, 2026 11:06:16 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeSystemLAPACK
Oct 27, 2026 11:06:16 AM com.github.fommil.netlib.LAPACK <clinit>
WARNING: Failed to load implementation from: com.github.fommil.netlib.NativeRefLAPACK
182.120 ms/op
# Warmup Iteration   2: 69.180 ms/op
Iteration   1: 66.009 ms/op
Iteration   2: 63.055 ms/op
Iteration   3: 62.588 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  64.046 ±(99.9%) 4.623 ms/op [Average]
  (min, avg, max) = (62.588, 64.046, 66.252), stdev = 1.649
  CI (99.9%): [59.423, 68.669] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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

# Run progress: 78.26% complete, ETA 00:06:28
# Fork: 1 of 2
# Warmup Iteration   1: 205.694 ms/op
# Warmup Iteration   2: 93.574 ms/op
Iteration   1: 77.904 ms/op
Iteration   2: 77.586 ms/op
Iteration   3: 92.934 ms/op

# Run progress: 80.43% complete, ETA 00:05:42
# Fork: 2 of 2
# Warmup Iteration   1: 258.380 ms/op
# Warmup Iteration   2: 108.610 ms/op
Iteration   1: 77.164 ms/op
Iteration   2: 76.568 ms/op
Iteration   3: 76.576 ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  79.789 ±(99.9%) 18.121 ms/op [Average]
  (min, avg, max) = (76.568, 79.789, 92.934), stdev = 6.462
  CI (99.9%): [61.668, 97.910] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
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

# Run progress: 82.61% complete, ETA 00:04:59
# Fork: 1 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op

# Run progress: 84.78% complete, ETA 00:04:17
# Fork: 2 of 2
# Warmup Iteration   1: ≈ 10⁻³ ms/op
# Warmup Iteration   2: ≈ 10⁻³ ms/op
Iteration   1: ≈ 10⁻³ ms/op
Iteration   2: ≈ 10⁻³ ms/op
Iteration   3: ≈ 10⁻³ ms/op


Result "com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension":
  ≈ 10⁻³ ms/op


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate

# Run progress: 86.96% complete, ETA 00:03:36
# Fork: 1 of 2
# Warmup Iteration   1: 1.357 ms/op
# Warmup Iteration   2: 0.829 ms/op
Iteration   1: 0.687 ms/op
Iteration   2: 0.694 ms/op
Iteration   3: 0.663 ms/op

# Run progress: 89.13% complete, ETA 00:02:57
# Fork: 2 of 2
# Warmup Iteration   1: 1.413 ms/op
# Warmup Iteration   2: 0.816 ms/op
Iteration   1: 0.680 ms/op
Iteration   2: 0.673 ms/op
Iteration   3: 0.791 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate":
  0.698 ±(99.9%) 0.131 ms/op [Average]
  (min, avg, max) = (0.663, 0.698, 0.791), stdev = 0.047
  CI (99.9%): [0.567, 0.829] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid

# Run progress: 91.30% complete, ETA 00:02:19
# Fork: 1 of 2
# Warmup Iteration   1: 38.568 ms/op
# Warmup Iteration   2: 22.157 ms/op
Iteration   1: 15.891 ms/op
Iteration   2: 14.341 ms/op
Iteration   3: 14.414 ms/op

# Run progress: 93.48% complete, ETA 00:01:43
# Fork: 2 of 2
# Warmup Iteration   1: 34.179 ms/op
# Warmup Iteration   2: 19.253 ms/op
Iteration   1: 12.612 ms/op
Iteration   2: 12.673 ms/op
Iteration   3: 13.400 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid":
  13.889 ±(99.9%) 3.511 ms/op [Average]
  (min, avg, max) = (12.612, 13.889, 15.891), stdev = 1.252
  CI (99.9%): [10.378, 17.399] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.12.1, OpenJDK 64-Bit Server VM, 21.0.12.1+1-LTS
# VM invoker: /usr/lib/jvm/temurin-21-jdk-amd64/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 2 iterations, 2 s each
# Measurement: 3 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid

# Run progress: 95.65% complete, ETA 00:01:07
# Fork: 1 of 2
# Warmup Iteration   1: 47.044 ms/op
# Warmup Iteration   2: 31.161 ms/op
Iteration   1: 30.954 ms/op
Iteration   2: 30.855 ms/op
Iteration   3: 31.801 ms/op

# Run progress: 97.83% complete, ETA 00:00:33
# Fork: 2 of 2
# Warmup Iteration   1: 49.038 ms/op
# Warmup Iteration   2: 31.387 ms/op
Iteration   1: 31.300 ms/op
Iteration   2: 31.271 ms/op
Iteration   3: 31.214 ms/op


Result "com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid":
  31.233 ±(99.9%) 0.930 ms/op [Average]
  (min, avg, max) = (30.855, 31.233, 31.801), stdev = 0.332
  CI (99.9%): [30.303, 32.162] (assumes normal distribution)


# Run complete. Total time: 00:25:18

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

Benchmark                                                                                            (model)  (nodes)  Mode  Cnt      Score     Error  Units
c.e.n.b.flash.FlashBenchmark.phAndPsFlashWellFluid                                                       N/A      N/A  avgt    6     19.307 ±   0.593  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashLeanGas                                                              N/A      N/A  avgt    6      1.522 ±   0.130  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidPr                                                          N/A      N/A  avgt    6      6.785 ±   0.805  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidSrk                                                         N/A      N/A  avgt    6      6.495 ±   0.547  ms/op
c.e.n.b.flash.FlashBenchmark.tpFlashWellFluidWithProperties                                              N/A      N/A  avgt    6     13.193 ±   5.396  ms/op
c.e.n.b.flash.TPflash.testFlash                                                                          N/A      N/A  avgt    6    541.625 ± 198.286  ms/op
c.e.n.b.flash.TPflash_UMR.testFlash_UMR                                                                  N/A      N/A  avgt    6   6117.969 ± 168.095  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.singlePhaseGasPipelineSteadyState                         N/A      N/A  avgt    6    529.117 ±  63.061  ms/op
c.e.n.b.fluidmechanics.PipeFlowSolverBenchmark.twoPhaseNonEquilibriumPipeSteadyState                     N/A      N/A  avgt    6   1202.234 ± 244.059  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A       20  avgt    6      0.099 ±   0.004  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.dataReconciliation                                         N/A      100  avgt    6      7.578 ±   0.415  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtAntoine                                  N/A      N/A  avgt    6      0.628 ±   0.291  ms/op
c.e.n.b.numerics.LinearAlgebraKernelBenchmark.levenbergMarquardtDoubleExponential                        N/A      N/A  avgt    6      1.558 ±   0.219  ms/op
c.e.n.b.process.Compressor_Benchmark.compressorprocess                                                   N/A      N/A  avgt    6     41.024 ±  18.194  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.coldStartBuildRunReport                                       N/A      N/A  avgt    6  20102.424 ± 728.931  ms/op
c.e.n.b.process.LargeProcessModelBenchmark.rerunAfterRateChange                                          N/A      N/A  avgt    6   8016.195 ± 177.785  ms/op
c.e.n.b.process.TEGprocess.testTEGprocess                                                                N/A      N/A  avgt    6  13655.878 ± 915.488  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                         Full Gradient Theory      N/A  avgt    6     64.046 ±   4.623  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                       Simple Gradient Theory      N/A  avgt    6     79.789 ±  18.121  ms/op
c.e.n.b.thermo.InterfacialTensionBenchmark.gasOilSurfaceTension                                     Parachor      N/A  avgt    6     ≈ 10⁻³            ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeGasCondensate                                       N/A      N/A  avgt    6      0.698 ±   0.131  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.ptPhaseEnvelopeWellFluid                                           N/A      N/A  avgt    6     13.889 ±   3.511  ms/op
c.e.n.b.thermo.PhaseEnvelopeBenchmark.saturationPointsWellFluid                                          N/A      N/A  avgt    6     31.233 ±   0.930  ms/op

Benchmark result is saved to /home/runner/work/_temp/current-benchmarks.json

```


## benchmark-timing-summary.md

```text
## Maven Build Results

| Variant | NeqSim | Maven build |
| --- | --- | --- |
| baseline | 3.13.0 | failed (exit 1) |
| current | 3.14.0 | passed |

Incomplete timing comparison: Maven build failures were recorded. No overall gain is available.

```
