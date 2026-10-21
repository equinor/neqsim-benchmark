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
It uses the built-in `GITHUB_TOKEN` with repository contents write permission.
Manually published releases trigger the update check directly; for automated releases,
the weekly schedule or manual check continues to the next available NeqSim version.

Every comparison records a suite revision. Matching revisions make it easier to
separate NeqSim changes from changes to the measured cases. Version identity is
read from the resolved dependency JAR when available; reports label a requested
version separately if the JAR could not be inspected.

The common compatibility suite passed build and smoke checks for 12 published
releases from NeqSim 3.1.0 through 3.5.0 on Java 21. This is compatibility
evidence, not a claim that the short checks provide statistically meaningful
performance measurements.

`mvn verify` runs the project's smoke tests. Java 17 or later is required; the
default NeqSim dependency is declared in [pom.xml](pom.xml).