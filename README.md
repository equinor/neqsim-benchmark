# neqsim-benchmark
Release-to-release performance comparisons for NeqSim, with build status and
run evidence retained in the repository.

## Results

[Benchmark timing history](benchmark-results/summary.md) is the main results
index. Each row compares a NeqSim release with its baseline and reports the
suite revision, build status, matched-case count, faster/slower counts, overall
gain, completeness, and a link to the full comparison.

Positive overall gain means lower average time per operation. It is the
geometric-mean reduction across matched cases. Incomplete comparisons have no
overall gain; check the build statuses and linked report for the reason.

Each history row links to a per-run comparison with case-by-case timings,
changes, and confidence-interval notes. Its run folder retains version identity,
suite changes, raw results, the exact measured POM, and the full build/benchmark
transcript. See the [archive guide](benchmark-results/README.md) for details.
Runs and retries are preserved separately, including failures.

The history keeps the first report for each release-to-baseline and
suite-revision pair. Standalone comparisons are not included. Compare results
from matching suite revisions; otherwise benchmark changes can contribute to
the measured difference. Hosted-runner timings are indicative, not a
release-quality performance gate. Inspect individual cases and confidence
intervals before drawing conclusions.

## Update neqsim-jar
Neqsim is available from central repository. Update neqsim dependency in [pom.xml](pom.xml).

The [Check NeqSim Updates workflow](.github/workflows/check-neqsim-updates.yml)
checks Maven Central weekly on Mondays at 06:23 UTC, when a release is published
in this repository, and manually from the GitHub Actions tab. It updates one
stable NeqSim version at a time and includes the comparison results in its PR.
Prereleases are excluded, and the workflow does not merge PRs automatically.
Build failures are retained in the report and make a comparison incomplete;
they do not block the update PR or produce an overall gain.

Enable **Allow GitHub Actions to create and approve pull requests** under
**Settings > Actions > General > Workflow permissions** for PR creation.
The workflow uses the built-in `GITHUB_TOKEN`; no additional secret is required.
Before publishing the update PR, it checks that the default branch still points
to the commit used for measurement. If the branch advanced during benchmarking,
the run fails with a request to rerun against the latest sources. It does not
rebase measured results or push an outdated workflow snapshot. This also avoids
the stale-base workflow-permission rejection when workflow files changed while
the benchmarks were running.

## Automatic releases
The [Release NeqSim Update workflow](.github/workflows/release-neqsim-update.yml)
runs after a successful **Compare Benchmark Timings** run on the default branch.
Release processing continues only when that benchmark run's source commit changes
the resolved NeqSim dependency version in `pom.xml` relative to its first parent.
Benchmark-only changes, result commits, and unrelated POM changes skip release
processing. Manual requests apply the same version-change check to the selected
default-branch commit before starting benchmarks.
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
It uses the built-in `GITHUB_TOKEN` with repository contents and actions write
permissions. After creating a new release, it explicitly dispatches
**Check NeqSim Updates** on the default branch to look for the next available
version. This is necessary because releases created with `GITHUB_TOKEN` do not
trigger release-event workflows. Existing releases do not dispatch another check,
and publication or dispatch failures fail the workflow. Manually published
releases still trigger the update check directly; the weekly schedule and manual
check remain available.

Every comparison records a suite revision. Matching revisions make it easier to
separate NeqSim changes from changes to the measured cases. Version identity is
read from the resolved dependency JAR when available; reports label a requested
version separately if the JAR could not be inspected.

The common compatibility suite, before the restorations below, passed build and
smoke checks for 12 published releases from NeqSim 3.1.0 through 3.5.0 on Java 21.
This is compatibility evidence, not a claim that the short checks provide
statistically meaningful performance measurements.

## Full TEG benchmark restoration

The full [TEG process benchmark](src/main/java/com/equinor/neqsim/benchmark/process/TEGprocess.java)
has been restored from suite commit `3a8c403`, with two duplicate stream names
corrected. The flowsheet, recycles, operating conditions, and measured work are
unchanged. The benchmark now returns the solved process so that the
[TEG smoke test](src/test/java/com/equinor/neqsim/benchmark/TEGprocessTest.java)
can check unique equipment names, process and recycle convergence, finite
outlet conditions, water removal, and absorber mass balance.

The corrected workload was checked against all 33 stable numeric Maven Central
releases from 3.1.0 through 3.26.0 on Java 21:

- **3.1.0 passes**, but **3.1.2 through 3.2.0 fail** with an EJML
  `SimpleMatrix.isIdentical(SimpleBase, double)` linkage error.
- **Every published numeric release from 3.2.1 through 3.26.0 passes** the
  focused TEG test. This does not establish compatibility with future releases.
- The safe reintroduction baseline is therefore **3.2.1**, with the first
  eligible comparison **3.2.2 versus 3.2.1**, not 3.2.1 versus 3.2.0.

Full Maven verification and a forked JMH warmup/measurement check passed on
both 3.2.1 and 3.2.2. These short runs establish execution compatibility, not
performance significance or design-grade process validation. Restoring TEG
changes the suite revision; do not compare its overall gain with the old suite.
See the [compatibility evidence](benchmark-results/compatibility/teg-process.json)
for JAR identities, source hashes, test outcomes, and reproduction commands.

To check the full TEG workload against a specific JAR:

```sh
mvn test -Dneqsim.version=3.2.1 -Dtest=TEGprocessTest \
  -DargLine=-Xmx1g -Dsurefire.forkedProcessTimeoutInSeconds=300
```

## Legacy TP flash restoration

The full historical [SRK](src/main/java/com/equinor/neqsim/benchmark/flash/TPflash.java)
and [UMR](src/main/java/com/equinor/neqsim/benchmark/flash/TPflash_UMR.java)
benchmarks are restored from suite commit `3a8c403`. Each invocation still
constructs the original fluid and performs respectively **1,000** and **500**
TP flashes, initializing physical properties after every flash. Compositions,
mixing rules, operating conditions, and JMH annotations are preserved. The
original repeated propane additions in the UMR fluid are retained.

Both methods now return the final fluid for JMH consumption and
[smoke-test inspection](src/test/java/com/equinor/neqsim/benchmark/LegacyFlashTest.java).
The empty UMR try/catch was removed; it enclosed no work. Tests check the
unchanged temperature and pressure, multiphase results, positive finite density,
and normalized finite phase fractions and compositions.

Full Maven verification (eight tests, including TEG) and forked JMH
warmup/measurement checks passed on **3.2.1 and 3.2.2** on Java 21.
Both legacy cases can therefore participate in the next **3.2.2 versus 3.2.1**
comparison. Short JMH checks establish execution compatibility, not statistically
meaningful performance differences. No historical timing results are rewritten.

```sh
mvn test -Dneqsim.version=3.2.1 -Dtest=LegacyFlashTest -DargLine=-Xmx1g
```

Repeat with `-Dneqsim.version=3.2.2` to check the other side of the comparison.

## Full Gradient Theory restoration

The [interfacial tension benchmark](src/main/java/com/equinor/neqsim/benchmark/thermo/InterfacialTensionBenchmark.java)
again includes all three original models: **Full Gradient Theory**, **Simple
Gradient Theory**, and **Parachor**. The fluid, operating conditions, and
initialization are unchanged. The smoke test checks finite, positive surface
tension for each model.

Full Gradient Theory requires **NeqSim 3.2.2** for this workload; it fails on
3.2.1. It can be restored starting with the 3.2.2 dependency, but the first
compatible release comparison is **3.3.0 versus 3.2.2**, not 3.2.2 versus 3.2.1.
This expansion changes the suite revision and must be measured on both sides
of the comparison.

## NeqSim 3.5.0 benchmark restoration

The following full workloads are restored from suite commit `3a8c403`:

- **Data reconciliation** in the
  [numerical kernels](src/main/java/com/equinor/neqsim/benchmark/numerics/LinearAlgebraKernelBenchmark.java):
  splitter chains with **20 and 100 mass-balance nodes** (41 and 201 measured
  variables). Every invocation builds and reconciles the original perturbed
  measurements. The [correctness test](src/test/java/com/equinor/neqsim/benchmark/numerics/DataReconciliationTest.java)
  requires convergence, a finite positive objective, and every reconciled
  balance residual within `1e-8`.
- **Full oil and gas platform**:
  [flowsheet](src/main/java/com/equinor/neqsim/benchmark/process/OilGasPlatformModel.java)
  and [both benchmarks](src/main/java/com/equinor/neqsim/benchmark/process/LargeProcessModelBenchmark.java).
  The original 16-component E300 fluid, eight process systems, parallel
  separation/expander/compressor trains, NGL columns, recycles, export utilities,
  and 40 km gas pipeline are retained. The measured methods retain the original
  **five outer iterations** for build/run/JSON reporting and **three** after
  alternating the HP well rate between 30.3 and 30.0 MSm3/day.

Both workloads require **NeqSim 3.5.0**. The first compatible expanded release
comparison is **3.6.0 versus 3.5.0**, not 3.5.0 versus 3.4.0. Restoring them
changes the suite revision; no historical timing reports are rewritten.

The full platform needs more than the JAR's default 50 outer iterations to
converge on 3.5.0. Its unmeasured rerun setup and
[correctness test](src/test/java/com/equinor/neqsim/benchmark/OilGasPlatformModelTest.java)
allow up to **150 iterations**, without relaxing convergence tolerances. Setup
fails explicitly if convergence is not reached. The test additionally checks
gas rates, export pressures, and overall mass balance. This setup takes several
minutes; the fixed-iteration measured methods are not full-convergence solves.
NeqSim 3.5.0 logs intermediate pipeline pressure errors during cold startup;
the final full-model convergence and conservation checks pass. This is execution
compatibility evidence, not design-grade process validation.

**Reactor and looped-network restoration remains deferred.** Compilation and a
finite return value were insufficient in the earlier compatibility assessment.
On 3.5.0 the original water-gas-shift reactor stops after two iterations with a
NaN convergence error. The original 4-by-4 grid reaches its 500-iteration limit
with a NaN residual and violates source mass balance. The JAR also maps its
`NEWTON_RAPHSON` option to Hardy Cross rather than a Newton solver. These are
not valid successful-solve timings, so neither method is enabled. A later JAR
must pass actual convergence and conservation checks before restoration.
The six-solver distillation and critical-point-dependent flash/envelope
expansions also remain deferred (previous execution thresholds: 3.12.1 and
3.13.0 respectively; correctness must be rechecked before restoration).

To reproduce current-JAR verification, including the slow platform solve:

```sh
mvn clean verify -DargLine=-Xmx1g \
  -Dsurefire.forkedProcessTimeoutInSeconds=1200
```

On Java 21 with NeqSim 3.5.0, full Maven verification passed **10 tests**; the
platform converged in **109 outer iterations** at unchanged tolerances.
The PR workflow's short forked JMH command also passed **all 20 methods and
23 parameter cases**, including reconciliation 20/100 and both platform methods.
These short checks establish execution compatibility, not performance significance.

## Pull request compatibility check

The [Verify Benchmark Compatibility workflow](.github/workflows/verify-benchmarks.yml)
runs on every pull request, including new benchmark methods, using Java 21 and
the NeqSim dependency declared in the proposed merged POM. It runs `mvn clean
verify`, then executes every discovered JMH method and parameter combination
in a forked JVM. It fails on build/test errors, benchmark exceptions, missing
method results, and non-finite or non-positive timing results. New methods are
covered automatically even if no dedicated smoke test has been added; focused
correctness tests should still accompany benchmark changes.

This check uses only the current dependency, not the previous release. An older
baseline failing in the timing comparison therefore does not invalidate the
current-JAR compatibility check. Short JMH runs preserve the work inside each
method but are execution checks, not performance comparisons.

To enforce this check before merge, configure the default branch's ruleset or
branch protection to require **Benchmarks on current NeqSim JAR**. Adding the
workflow alone does not make the check mandatory in GitHub branch protection.

`mvn verify` runs the project's smoke tests. Java 17 or later is required; the
default NeqSim dependency is declared in [pom.xml](pom.xml).