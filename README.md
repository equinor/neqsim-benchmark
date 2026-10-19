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
releases are not skipped. Each merge that changes [pom.xml](pom.xml) on `main`
triggers another check, so the next version gets a separate PR after the previous
one is merged. Publishing a release in this repository also triggers a check.
The automated release workflow explicitly dispatches that check because releases
created with `GITHUB_TOKEN` do not trigger other workflows automatically.
It does not merge automatically.

Enable **Allow GitHub Actions to create and approve pull requests** under
**Settings > Actions > General > Workflow permissions** for PR creation.
The workflow uses the built-in `GITHUB_TOKEN`; no additional secret is required.

## Automatic releases
The [Release NeqSim Update workflow](.github/workflows/release-neqsim-update.yml)
runs when an update PR containing complete benchmark records is merged into the
default branch, or after a successful standalone **Compare Benchmark Timings** run.
A GitHub release tagged `neqsim-<version>` targets the commit containing both the
updated POM and results. Before publishing, it verifies that the committed POM
exactly matches the measured snapshot and benchmark sources have not changed
since measurement. Failed, incomplete, missing, or uncommitted results cannot
produce a release.
No JAR or build artifact is uploaded.

Running the release workflow manually on the default branch starts the benchmark
workflow first; release creation follows its successful completion. Existing
releases are left unchanged. Merged result records are detected by a path filter;
standalone report commits made with `GITHUB_TOKEN` use a `workflow_run` completion
trigger because those commits do not trigger push workflows.
It uses the built-in `GITHUB_TOKEN` with repository contents write permission
and Actions write permission to dispatch the next update check.

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
variant skips JMH, and the failure is saved in the per-release results and the
cumulative summary's **Maven Builds** column. This does not relax the release
requirement for a complete verified comparison.

## Benchmarks
The benchmarks are based on the `@Tag("benchmark")` tests and the slow process tests in
[NeqSim](https://github.com/equinor/neqsim). Most of them exercise code that solves linear
systems or uses dense/sparse matrices, so they can be used to compare linear algebra backends
(for example JAMA/MTJ versus EJML).

| Benchmark class | What it measures | Matrix-dependent code |
| --- | --- | --- |
| [FlashBenchmark](src/main/java/com/equinor/neqsim/benchmark/flash/FlashBenchmark.java) | TP flashes (SRK, PR, CPA, multiphase, reactive electrolyte), near-critical TP flash grid, PH/PS flashes | Stability analysis, second-order Newton TP flash, chemical equilibrium |
| [PhaseEnvelopeBenchmark](src/main/java/com/equinor/neqsim/benchmark/thermo/PhaseEnvelopeBenchmark.java) | PT phase envelopes, critical point flash, saturation points, CPA hydrate temperature | Newton steps in envelope tracing and critical point solver |
| [InterfacialTensionBenchmark](src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java) | Gas/oil interfacial tension, `@Param` model: Full Gradient Theory, Simple Gradient Theory, Parachor | Full gradient theory uses LAPACK through MTJ in older NeqSim versions |
| [LinearAlgebraKernelBenchmark](src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java) | Levenberg-Marquardt parameter fitting, data reconciliation with 20 or 100 nodes | Jacobian/normal equation solves, weighted least squares |
| [PipeFlowSolverBenchmark](src/main/java/com/equinor/neqsim/benchmark/fluidmechanics/PipeFlowSolverBenchmark.java) | Single-phase gas pipeline and two-phase non-equilibrium pipe flow | Sparse/banded staggered-grid solvers and film mass transfer models |
| [DistillationSolverBenchmark](src/main/java/com/equinor/neqsim/benchmark/process/DistillationSolverBenchmark.java) | Deethanizer with every column solver type | Newton, Naphtali-Sandholm, matrix inside-out, MESH residual |
| [ReactorAndNetworkBenchmark](src/main/java/com/equinor/neqsim/benchmark/process/ReactorAndNetworkBenchmark.java) | Gibbs reactor (water-gas shift), Newton-Raphson looped gas network on a 4x4 or 8x8 grid | Gibbs minimisation Newton steps, network Jacobian solves |
| [LargeProcessModelBenchmark](src/main/java/com/equinor/neqsim/benchmark/process/LargeProcessModelBenchmark.java) | Large oil and gas platform (8 process systems, about 130 units) | Broad coverage: flashes, recycles, compressor charts, NGL column, pipeline, reporting |

The large platform model is in
[OilGasPlatformModel](src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java)
and is ported from NeqSim `LargeCombinedModelsTest`. Converging it from scratch takes about
40 outer iterations and one minute, so the benchmarks cap the number of outer iterations:
`coldStartBuildRunReport` (about 20 s/op) and `rerunAfterRateChange` (about 10-20 s/op).
The deethanizer runs about 5 s per solve.

Run a subset with a regular expression, for example:
```
java -jar target/benchmarks.jar "FlashBenchmark|PhaseEnvelope"
java -jar target/benchmarks.jar LinearAlgebraKernel -f 1 -wi 1 -i 3
java -jar target/benchmarks.jar InterfacialTension -p model=Parachor
```

The project needs Java 17 or later. The benchmarks compile and the smoke tests pass with NeqSim
3.15.0 and later. The `-Java8` NeqSim builds are not supported.

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
They call every benchmark method once and check that the result is finite. They also check
that the near-critical flash grid reaches the second-order Newton solver, that the distillation
solvers agree, and that the full platform model converges with the expected flows and pressures.
The tests take about two to three minutes.

## Add benchmark methods
Add methods under folder [benchmark](src/main/java/com/equinor/neqsim/benchmark). Remember to use decorator @Benchmark.
Add a call to the new method in the smoke tests.