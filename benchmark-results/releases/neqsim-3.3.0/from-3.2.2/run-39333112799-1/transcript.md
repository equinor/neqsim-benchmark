# NeqSim 3.3.0 Benchmark Results

| Field | Value |
| --- | --- |
| Baseline | 3.2.2 |
| Current | 3.3.0 |
| Source commit | `9c8b38ba254e1bae9848c647cbe5b42bca70903c` |
| Run | [Actions run](https://github.com/equinor/neqsim-benchmark/actions/runs/39333112799) |
| Status | incomplete |


## benchmark-revision.json

```text
{
  "number": 7,
  "label": "B7-732030da1a1d",
  "fingerprint": "732030da1a1d80ae6a36321e4115f9a3f76cdc72fb8b82a2307f03170c352aa8",
  "source_commit": "9c8b38ba254e1bae9848c647cbe5b42bca70903c",
  "uncommitted_changes": false,
  "scopes": [
    "src/main/java",
    "src/main/resources",
    ".github/scripts/run-benchmark-timings.sh"
  ],
  "files": {
    ".github/scripts/run-benchmark-timings.sh": "040436630ef312a010d6ea6a711f27a0cc69b966cfa5ee62f1644fd799b05791",
    "src/main/java/com/equinor/neqsim/benchmark/flash/FlashBenchmark.java": "bfe95bd887c62068cf1b8644c4366c1587230454bafe1616f83bf561d05d47a2",
    "src/main/java/com/equinor/neqsim/benchmark/flash/TPflash.java": "32301e90ffc60330dd62dad230181e84739a503b10e8785cac221dcbd2fc7c4a",
    "src/main/java/com/equinor/neqsim/benchmark/flash/TPflash_UMR.java": "00bb0df4688d97db711ca1ad9202c5954634eef6bb0a079d33d161ade7265a0f",
    "src/main/java/com/equinor/neqsim/benchmark/fluidmechanics/PipeFlowSolverBenchmark.java": "76fdf4910236068de1c14af59b07a4fa1c33995047d29f1d320549dc36f08cab",
    "src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java": "27d41323c355c342d297019dc4beae967f97d08dc26dd223240fd46d15f7680a",
    "src/main/java/com/equinor/neqsim/benchmark/process/Compressor_Benchmark.java": "4c5fd06e5e1e1888b1fc7fe9accef39262ccf310f028c7741a1d43d54dcfdd50",
    "src/main/java/com/equinor/neqsim/benchmark/process/DistillationSolverBenchmark.java": "252a69671c18019bd9a2926d432e865a619a3ec83a9455a9b0b7606203746644",
    "src/main/java/com/equinor/neqsim/benchmark/process/LargeProcessModelBenchmark.java": "0fc3eb7f5efab9ce39e34505ec792e2b7851e38dc92b3be9e913ab1ba29d24ad",
    "src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java": "ca06f2817fda0161c6e416b61c50e3ffb65999830f1d693dad57384b66bf03a4",
    "src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java": "bf8fede26f7c4cea7b79e5ac6edda994f78842bc163a7d641c93b6b6d41dd94a",
    "src/main/java/com/equinor/neqsim/benchmark/process/TEGprocess.java": "9ecfece961534778c9659e73fffc908bf46a9710887227617153a635aa87c01d",
    "src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java": "4e974c6a2fae86ec6d0a834f255032e9cf1060f1734d21ee561b0b14a9ccc651",
    "src/main/java/com/equinor/neqsim/benchmark/thermo/PhaseEnvelopeBenchmark.java": "1c63d04901cdfc2857045bbe9db0f809bf4e6393b651b2b6ab0978f09805619d",
    "src/main/java/com/equinor/neqsim/benchmark/util/BenchmarkFluids.java": "87ea44ebc643643e5acffedeadb95d6bba553daaed4a026d076f38646c77fdb0",
    "src/main/resources/fluids/platform_feed.e300": "32f4eb0253f888fa2c96a36fe76d26e085dda3308d5a80b11ce9899993aceb7b"
  },
  "changes": {
    "added": [],
    "modified": [
      ".github/scripts/run-benchmark-timings.sh"
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
Apache Maven 3.10.0 (c43a36b8d67be7e0805a411bc0898af1a51f5472)
Maven home: /usr/share/apache-maven-3.10.0
Java version: 21.0.12.1, vendor: Eclipse Adoptium, runtime: /usr/lib/jvm/temurin-21-jdk-amd64
Default locale: en, platform encoding: UTF-8, time zone: Etc/UTC
OS name: "linux", version: "6.17.0-1022-azure", arch: "amd64", family: "unix"
Linux runnervm8k3b6 6.17.0-1022-azure #22-Ubuntu SMP Mon Jul 27 17:24:03 UTC 2026 x86_64 x86_64 x86_64 GNU/Linux
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
BogoMIPS:                                5192.29
Flags:                                   fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good nopl tsc_reliable nonstop_tsc cpuid extd_apicid aperfmperf tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm cmp_legacy svm cr8_legacy abm sse4a misalignsse 3dnowprefetch osvw topoext vmmcall fsgsbase bmi1 avx2 smep bmi2 erms invpcid rdseed adx smap clflushopt clwb sha_ni xsaveopt xsavec xgetbv1 xsaves user_shstk clzero xsaveerptr rdpru arat npt nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold v_vmsave_vmload umip vaes vpclmulqdq rdpid fsrm
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
| baseline | 3.2.2 | failed (exit 1) |
| current | 3.3.0 | failed (exit 1) |

```


## baseline-artifact.json

```text
{
  "requested_version": "3.2.2",
  "version": "3.2.2",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.2.2/neqsim-3.2.2.jar",
  "source": "embedded Maven pom.properties"
}

```


## current-artifact.json

```text
{
  "requested_version": "3.3.0",
  "version": "3.3.0",
  "jar": "/home/runner/.m2/repository/com/equinor/neqsim/neqsim/3.3.0/neqsim-3.3.0.jar",
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
[INFO] Loaded 24143 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] Loaded 74 auto-discovered prefixes for remote repository apache.snapshots (prefixes-apache.snapshots.txt)
[INFO] 
[INFO] ----------------< com.equinor.neqsim:neqsim-benchmark >-----------------
[INFO] Building JMH benchmark sample: Java 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] Loaded 24143 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] 
[INFO] --- dependency:3.8.1:build-classpath (default-cli) @ neqsim-benchmark ---
[INFO] Wrote classpath file '/home/runner/work/_temp/baseline-classpath.txt'.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.146 s
[INFO] Finished at: 2026-10-19T22:11:36Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.2.2 (neqsim-3.2.2.jar); requested: 3.2.2
$ mvn clean verify -Dneqsim.version=3.2.2
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------< com.equinor.neqsim:neqsim-benchmark >-----------------
[INFO] Building JMH benchmark sample: Java 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] Loaded 24143 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] Loaded 74 auto-discovered prefixes for remote repository apache.snapshots (prefixes-apache.snapshots.txt)
[INFO] Loaded 24143 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] 
[INFO] --- clean:2.5:clean (default-clean) @ neqsim-benchmark ---
[INFO] 
[INFO] --- resources:3.5.0:resources (default-resources) @ neqsim-benchmark ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ neqsim-benchmark ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 14 source files with javac [debug release 17] to target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java:[15,42] package neqsim.process.util.reconciliation does not exist
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java:[16,42] package neqsim.process.util.reconciliation does not exist
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java:[131,10] cannot find symbol
  symbol:   class DataReconciliationEngine
  location: class com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java:[14,40] cannot find symbol
  symbol:   class LoopedPipeNetwork
  location: package neqsim.process.equipment.network
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java:[58,64] package LoopedPipeNetwork does not exist
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java:[58,17] cannot find symbol
  symbol:   class LoopedPipeNetwork
  location: class com.equinor.neqsim.benchmark.process.ReactorAndNetworkBenchmark
[INFO] 6 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[ERROR] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.131 s
[INFO] Finished at: 2026-10-19T22:11:46Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project neqsim-benchmark: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java:[15,42] package neqsim.process.util.reconciliation does not exist
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java:[16,42] package neqsim.process.util.reconciliation does not exist
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java:[131,10] cannot find symbol
[ERROR]   symbol:   class DataReconciliationEngine
[ERROR]   location: class com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java:[14,40] cannot find symbol
[ERROR]   symbol:   class LoopedPipeNetwork
[ERROR]   location: package neqsim.process.equipment.network
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java:[58,64] package LoopedPipeNetwork does not exist
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java:[58,17] cannot find symbol
[ERROR]   symbol:   class LoopedPipeNetwork
[ERROR]   location: class com.equinor.neqsim.benchmark.process.ReactorAndNetworkBenchmark
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
1

```


## current-build.log

```text
[INFO] Scanning for projects...
[INFO] Loaded 24143 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] Loaded 74 auto-discovered prefixes for remote repository apache.snapshots (prefixes-apache.snapshots.txt)
[INFO] 
[INFO] ----------------< com.equinor.neqsim:neqsim-benchmark >-----------------
[INFO] Building JMH benchmark sample: Java 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] Loaded 24143 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] 
[INFO] --- dependency:3.8.1:build-classpath (default-cli) @ neqsim-benchmark ---
[INFO] Wrote classpath file '/home/runner/work/_temp/current-classpath.txt'.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.503 s
[INFO] Finished at: 2026-10-19T22:11:52Z
[INFO] ------------------------------------------------------------------------
NeqSim JAR version: 3.3.0 (neqsim-3.3.0.jar); requested: 3.3.0
$ mvn clean verify -Dneqsim.version=3.3.0
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------< com.equinor.neqsim:neqsim-benchmark >-----------------
[INFO] Building JMH benchmark sample: Java 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] Loaded 24143 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] Loaded 74 auto-discovered prefixes for remote repository apache.snapshots (prefixes-apache.snapshots.txt)
[INFO] Loaded 24143 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] 
[INFO] --- clean:2.5:clean (default-clean) @ neqsim-benchmark ---
[INFO] Deleting /home/runner/work/_temp/benchmark-project/target
[INFO] 
[INFO] --- resources:3.5.0:resources (default-resources) @ neqsim-benchmark ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ neqsim-benchmark ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 14 source files with javac [debug release 17] to target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java:[15,42] package neqsim.process.util.reconciliation does not exist
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java:[16,42] package neqsim.process.util.reconciliation does not exist
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java:[131,10] cannot find symbol
  symbol:   class DataReconciliationEngine
  location: class com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java:[14,40] cannot find symbol
  symbol:   class LoopedPipeNetwork
  location: package neqsim.process.equipment.network
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java:[58,64] package LoopedPipeNetwork does not exist
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java:[58,17] cannot find symbol
  symbol:   class LoopedPipeNetwork
  location: class com.equinor.neqsim.benchmark.process.ReactorAndNetworkBenchmark
[INFO] 6 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[ERROR] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.949 s
[INFO] Finished at: 2026-10-19T22:11:59Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project neqsim-benchmark: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java:[15,42] package neqsim.process.util.reconciliation does not exist
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java:[16,42] package neqsim.process.util.reconciliation does not exist
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java:[131,10] cannot find symbol
[ERROR]   symbol:   class DataReconciliationEngine
[ERROR]   location: class com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java:[14,40] cannot find symbol
[ERROR]   symbol:   class LoopedPipeNetwork
[ERROR]   location: package neqsim.process.equipment.network
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java:[58,64] package LoopedPipeNetwork does not exist
[ERROR] /home/runner/work/_temp/benchmark-project/src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java:[58,17] cannot find symbol
[ERROR]   symbol:   class LoopedPipeNetwork
[ERROR]   location: class com.equinor.neqsim.benchmark.process.ReactorAndNetworkBenchmark
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```


## current-benchmarks.txt

Not produced; the run did not reach this stage.


## current-benchmarks.log

Not produced; the run did not reach this stage.


## benchmark-timing-summary.md

```text
## Maven Build Results

| Variant | NeqSim | Maven build |
| --- | --- | --- |
| baseline | 3.2.2 | failed (exit 1) |
| current | 3.3.0 | failed (exit 1) |

Incomplete timing comparison: Maven build failures were recorded. No overall gain is available.

```
