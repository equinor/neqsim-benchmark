# neqsim-benchmark
NeqSim benchmarking project.  
Is implemented as a maven project using [Java Microbenchmark Harness](https://github.com/openjdk/jmh). 

## Install, build and run benchmarks
1. Clone project from github ```git checkout https://github.com/Equinor/neqsim-benchmark```.
2. Call ```mvn validate``` to install the required dependencies.
3. Call ```mvn clean verify``` to build the benchmarks.
4. Call ```java -jar target/benchmarks.jar``` to run the benchmarks. For output to text file add -rf text -rff neqsimx.x.x.txt

## Update neqsim-jar
Neqsim is available from central repository. Update neqsim dependency in [pom.xml](pom.xml).

The [Check NeqSim Updates workflow](.github/workflows/check-neqsim-updates.yml)
checks Maven Central weekly on Mondays at 06:23 UTC and can also be run manually from the
GitHub Actions tab. When newer stable NeqSim releases are available, it updates
the dependency to the next version in order and benchmarks the old and new
versions with Java 21. Maven build failures are recorded without stopping the
other version or blocking the update PR. The PR includes the updated POM,
available timing data, full build logs, explicit build exit codes, and a snapshot
of the measured POM. Failed builds mark the comparison incomplete and report no
overall timing gain. JMH execution failures still fail the benchmark step. Intermediate stable
releases are not skipped. After an update PR is merged, the next weekly or manual
check opens a separate PR for the next version if needed. Merges and published
releases do not trigger update checks.
It does not merge automatically.

Enable **Allow GitHub Actions to create and approve pull requests** under
**Settings > Actions > General > Workflow permissions** for PR creation.
The workflow uses the built-in `GITHUB_TOKEN`; no additional secret is required.

## Automatic releases
The [Release NeqSim Update workflow](.github/workflows/release-neqsim-update.yml)
runs after a successful **Compare Benchmark Timings** run on the default branch.
Merging an update PR starts only **Compare Benchmark Timings**; release verification
waits for that run to finish successfully and uses its committed results.
A GitHub release tagged `neqsim-<version>` targets the commit containing both the
updated POM and results. Before publishing, it verifies that the committed POM
exactly matches the measured snapshot and benchmark sources have not changed
since measurement. Failed, incomplete, missing, or uncommitted results cannot
produce a release.
No JAR or build artifact is uploaded.

Running the release workflow manually on the default branch starts the benchmark
workflow first; release creation follows its successful completion. Existing
releases are left unchanged. The `workflow_run` completion trigger allows release
verification to follow report commits made with `GITHUB_TOKEN`, which do not
trigger push workflows.
It uses the built-in `GITHUB_TOKEN` with repository contents write permission
and Actions write permission to dispatch benchmarks for a manual release request.

## Benchmark timing comparisons
The [Compare Benchmark Timings workflow](.github/workflows/benchmark-timings.yml)
runs all JMH benchmarks for the baseline and current NeqSim versions using the
same benchmark sources and Java 21. It runs on POM or benchmark changes in pull
requests and on `main`, and can also be started manually with a `baseline_version`.
By default, it compares against the version before the change; if that version
is unchanged, it selects the preceding stable release from Maven Central.

The Actions run summary lists the ten largest timing changes in milliseconds
per operation and percent, with confidence-interval overlap noted.
[benchmark-results/summary.md](benchmark-results/summary.md) keeps a cumulative Markdown
table of releases, baselines, case counts, timing gains, and completeness status.
Only the dependency updater changes this history, when it updates NeqSim.
The table keeps the first report for each baseline-to-release transition and
benchmark-suite revision. Different benchmark revisions are never deduplicated together.
Standalone benchmark runs retain their per-run reports and Actions summaries,
but do not update release history or enter it during later rebuilds.
Each release comparison also keeps a full build/JMH transcript, raw JMH JSON,
and a table of every matched benchmark case, including parameters and confidence
intervals. See [benchmark-results/README.md](benchmark-results/README.md) for the
directory layout and gain definition. Runs and retries are preserved separately.
Pull-request runs only display the Actions summary and do not commit reports.
The workflow needs permission to push report
commits to the default branch; branch protection must permit those commits.
Report-only commits do not retrigger benchmarks. No artifacts are uploaded.
Full results are preserved in the per-release transcripts. Timings on shared GitHub runners are indicative,
not a performance regression gate. Update PRs
created by `GITHUB_TOKEN` do not automatically trigger pull-request workflows;
their full comparison runs inside the updater before the PR is opened.
JMH continues after individual benchmark failures. Missing results are called
out in the summary and mark the comparison as incomplete rather than passing.
Maven build failures are fail-tolerant: both versions are attempted, each failed
variant skips JMH, and the failure is saved in the per-run results. Dependency
update failures also appear in the release history's **Maven Builds** column. This does not relax the release
requirement for a complete verified comparison.
The reported NeqSim version comes from the resolved dependency JAR's embedded
Maven metadata, captured before compilation. Failed builds therefore retain
their JAR version. If a JAR cannot be resolved, its requested version is labelled
as such instead of being reported as verified.

### Benchmark suite revisions
Every run records a suite revision such as `B12-4fb8a37f291c` before building.
The number counts first-parent Git commits that change benchmark Java sources,
resources, or the measurement runner; the hash identifies the exact paths and
contents. Adding, editing, renaming, or deleting a benchmark changes its identity.
NeqSim-only POM version changes and generated results do not change it.

The Actions summary, result JSON, archived `benchmark-revision.json`, per-run
comparison, and history table all show the revision. Each comparison lists added,
modified, and deleted files relative to the previous suite revision. Old results
without revision evidence show `not recorded`. Compare core performance across
releases using matching suite revisions; otherwise the benchmark itself changed.
Uncommitted benchmark changes use the next revision number with their own hash.

## Benchmarks
The benchmarks are based on the `@Tag("benchmark")` tests and the slow process tests in
[NeqSim](https://github.com/equinor/neqsim). Most of them exercise code that solves linear
systems or uses dense/sparse matrices, so they can be used to compare linear algebra backends
(for example JAMA/MTJ versus EJML).

| Benchmark class | What it measures | Matrix-dependent code |
| --- | --- | --- |
| [FlashBenchmark](src/main/java/com/equinor/neqsim/benchmark/flash/FlashBenchmark.java) | TP flashes (SRK, PR, CPA, multiphase, reactive electrolyte), standard PH/PS flashes | Stability analysis and chemical equilibrium |
| [PhaseEnvelopeBenchmark](src/main/java/com/equinor/neqsim/benchmark/thermo/PhaseEnvelopeBenchmark.java) | PT phase envelopes, saturation points, CPA hydrate temperature | Newton steps in envelope tracing |
| [InterfacialTensionBenchmark](src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java) | Gas/oil surface tension with Simple Gradient Theory and Parachor | Simple gradient theory and non-matrix baseline |
| [LinearAlgebraKernelBenchmark](src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java) | Levenberg-Marquardt parameter fitting | Jacobian/normal equation solves |
| [PipeFlowSolverBenchmark](src/main/java/com/equinor/neqsim/benchmark/fluidmechanics/PipeFlowSolverBenchmark.java) | Single-phase gas pipeline and two-phase non-equilibrium pipe flow | Sparse/banded staggered-grid solvers and film mass transfer models |
| [ReactorAndNetworkBenchmark](src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java) | Gibbs reactor (water-gas shift) | Gibbs minimisation Newton steps |

The suite targets NeqSim 3.1.0. Data reconciliation and looped-network cases were
removed because their APIs are absent from that release. Fixed-temperature
distillation and platform cases were removed because their required reboiler
outlet-temperature specification is unavailable. Critical-point-dependent cases
and Full Gradient Theory were removed after runtime failures on 3.1.0. The PH/PS
case uses the standard PH solver instead of the slow legacy direct-Newton path.
The original TP flash, compressor, and TEG process benchmarks remain available.

Run a subset with a regular expression, for example:
```
java -jar target/benchmarks.jar "FlashBenchmark|PhaseEnvelope"
java -jar target/benchmarks.jar LinearAlgebraKernel -f 1 -wi 1 -i 3
java -jar target/benchmarks.jar InterfacialTension -p model=Parachor
```

The project needs Java 17 or later. The default dependency and compatibility
baseline is NeqSim 3.1.0. The `-Java8` NeqSim builds are not supported.

## Benchmark a local NeqSim build
The NeqSim version is the `neqsim.version` property in [pom.xml](pom.xml). To benchmark a local
branch, install it in the local Maven repository from the NeqSim checkout
(`mvn install -DskipTests` with a distinct version, for example `3.26.0-LA-SNAPSHOT`) and build
this project with:
```
mvn clean verify -Dneqsim.version=3.26.0-LA-SNAPSHOT
java -jar target/benchmarks.jar -rf text -rff neqsim-la-snapshot.txt
```

## Smoke tests
`mvn verify` runs JUnit smoke tests in [src/test](src/test/java/com/equinor/neqsim/benchmark).
They call the retained flash, phase-envelope, surface-tension, regression, pipe-flow,
and reactor cases and check finite outputs. Surface tensions must also be positive.
The original TP flash, compressor, and TEG classes are exercised through JMH.

## Add benchmark methods
Add methods under folder [benchmark](src/main/java/com/equinor/neqsim/benchmark). Remember to use decorator @Benchmark.
Add a call to the new method in the smoke tests.