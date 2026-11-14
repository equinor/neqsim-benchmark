# neqsim-benchmark
Release-to-release performance comparisons for NeqSim, with build status and
run evidence retained in the repository.

## Results

[Benchmark timing history](benchmark-results/summary.md) compares NeqSim
releases and links to the detailed per-run reports. Incomplete comparisons have
no overall gain. Compare matching suite revisions; hosted-runner timings are
indicative, not a release-quality performance gate. See the
[archive guide](benchmark-results/README.md) for retained run evidence.

## Benchmark functions

### Flash

**`tpFlashLeanGas`**
- TP-flashes the lean-gas fixture over six temperatures and five pressures.
- Returns a checksum of phase fraction and phase count across the 30 states.

**`tpFlashWellFluidSrk`**
- TP-flashes the well-fluid fixture with SRK over the same 30-state grid.
- Returns a checksum of phase fraction and phase count.

**`tpFlashWellFluidPr`**
- TP-flashes the well-fluid fixture with PR over the same 30-state grid.
- Returns a checksum of phase fraction and phase count.

**`tpFlashWellFluidWithProperties`**
- TP-flashes the SRK well fluid over the temperature-pressure grid and initializes physical properties.
- Returns accumulated density and heat-capacity values across the 30 states.

**`phAndPsFlashWellFluid`**
- At four pressures, initializes the well fluid with TP flashes, then runs PH and PS flashes.
- Returns the resulting temperatures as a checksum.

**`TPflash.testFlash`**
- Runs 1,000 TP flashes on a multiphase SRK gas-water fluid, initializing physical properties each time.
- Returns the final thermodynamic system.

**`TPflash_UMR.testFlash_UMR`**
- Runs 500 TP flashes on a multiphase UMR-PRU fluid with the HV/UNIFAC_UMRPRU mixing rule.
- Initializes physical properties after each flash and returns the final system.

### Process

**`Compressor_Benchmark.compressorprocess`**
- Builds and runs a steady-state SRK compressor process for a gas stream at 48 bara and 1 MSm3/day.
- Compresses to 110 bara; the timed work includes fluid, stream, compressor, and process setup.

**`DistillationSolverBenchmark.deethanizer`**
- Builds and solves a five-tray deethanizer with a reboiler for each configured solver.
- JMH parameterizes six solver types; the result combines outlet gas flow and liquid outlet temperature.

**`LargeProcessModelBenchmark.coldStartBuildRunReport`**
- Builds the full oil-and-gas platform model, runs five outer iterations, and generates its JSON report.
- Returns report length plus export-gas flow as a checksum.

**`LargeProcessModelBenchmark.rerunAfterRateChange`**
- Perturbs the HP well rate by alternating between 30.0 and 30.3 MSm3/day, then reruns the converged model.
- Runs three outer iterations and returns export-gas flow.

**`TEGprocess.testTEGprocess`**
- Builds and runs a gas-dehydration and TEG-regeneration process with absorber, flash, regeneration column, stripper, and recycles.
- Returns the completed `ProcessSystem`.

### Numerics

**`levenbergMarquardtAntoine`**
- Fits three Antoine-equation parameters to 40 deterministic propane-like vapour-pressure data points.
- Returns the sum of the fitted parameters.

**`levenbergMarquardtDoubleExponential`**
- Fits a five-parameter double-exponential decay model to 60 deterministic data points.
- Returns the sum of the fitted parameters.

**`dataReconciliation`**
- Reconciles a splitter-chain mass balance with perturbed measurements; JMH tests 20- and 100-node cases.
- Returns the weighted least-squares objective value.

### Thermodynamics

**`gasOilSurfaceTension`**
- Calculates gas-oil interfacial tension for a gas-condensate fluid at 0 C and 50 bara.
- JMH compares Full Gradient Theory, Simple Gradient Theory, and Parachor models.

**`ptPhaseEnvelopeGasCondensate`**
- Traces the full PT phase envelope for a gas-condensate fluid with pseudo-components.
- Returns a checksum from the cricondenbar and cricondentherm results.

**`ptPhaseEnvelopeWellFluid`**
- Traces the full PT phase envelope for the 20-component well-fluid fixture.
- Returns a checksum from the cricondenbar and cricondentherm results.

**`saturationPointsWellFluid`**
- Calculates dew-point temperatures at three pressures and bubble-point pressures at three temperatures.
- Returns a checksum of the six saturation results.

### Pipe flow

**`singlePhaseGasPipelineSteadyState`**
- Solves steady-state gas flow in a 740 km export pipeline model with ten legs and 20 nodes per leg.
- Returns the outlet pressure.

**`twoPhaseNonEquilibriumPipeSteadyState`**
- Solves a short stratified methane-water pipe with non-equilibrium interphase heat and mass transfer.
- Returns the outlet pressure.

### Long-running workloads

Benchmarks in the `longrun` package take from about 30 seconds to five minutes
per operation. The timing runner measures them separately with one fork, no
warmup iteration and two measured operations; their confidence intervals are
therefore wide. Each class exposes a static method taking the workload size,
which `LongRunSmokeTest` calls with a small size.

**`TwoFluidTransientBenchmark.gasCondensateFlowlineRampUp`** (about 1 min)
- Solves a 5 km hilly gas-condensate flowline (40 sections) with the `TwoFluidPipe` two-fluid model at steady state.
- Ramps the inlet rate up by 60 % and back down while integrating 1,200 one-second transient steps; returns outlet pressure, liquid inventory and pressure profile.

**`ProcessSimulationBenchmark.gasProcessingTrainSweep`** (about 30 s per EOS)
- Builds and converges a three-stage separation, recompression and export compression train with two liquid recycles for 48 operating cases.
- JMH parameterizes the 20-component well fluid with SRK and PR.

**`PropertyTableBenchmark.olgaThreePhaseTable`** (about 30 s)
- Generates and writes a 130 x 130 three-phase OLGA keyword-format property table for a gas-condensate-water fluid.
- Returns the table size in characters.

**`PropertyTableBenchmark.tpPropertyGrid`** (about 30 s)
- TP-flashes the PR well fluid on a 150 x 150 temperature-pressure grid and evaluates physical and transport properties at every point.
- Returns a checksum of the tabulated properties.

**`DynamicProcessBenchmark.separationControlTransient`** (about 1 min)
- Integrates an HP and LP separation process with PID level and pressure control through inlet valve opening steps: 3,600 two-second steps.
- Returns a checksum of separator levels, pressures and valve openings.

**`MlTrainingDataBenchmark.processSurrogateDataset`** (about 5 min)
- Re-solves the PR gas processing train for 700 randomly sampled (fixed seed) operating points, as when generating surrogate model training data.
- Records inputs and responses with NeqSim's `TrainingDataCollector` and exports them as CSV.

## Update neqsim-jar
NeqSim is available from Maven Central; update its dependency in [pom.xml](pom.xml).
The [Check NeqSim Updates workflow](.github/workflows/check-neqsim-updates.yml)
checks for stable releases weekly and when a release is published. It opens a
reviewable PR with the dependency update and benchmark comparison; it does not
merge automatically.

## Automatic releases
The [Release NeqSim Update workflow](.github/workflows/release-neqsim-update.yml)
publishes a tagged release after a successful comparison confirms a dependency
version update. A manual request starts a comparison when the dependency version
has changed. Otherwise, it finds the newest complete successful comparison for
the current NeqSim version and verifies its committed evidence. A benchmark run
ID can be supplied to select a specific comparison instead. Existing releases
are left unchanged. No JAR is uploaded.

## Local verification

Run the current-JAR compatibility checks with:

```sh
mvn clean verify -DargLine=-Xmx1g \
  -Dsurefire.forkedProcessTimeoutInSeconds=1200
```

## Pull request compatibility check

The [Verify Benchmark Compatibility workflow](.github/workflows/verify-benchmarks.yml)
runs when benchmark sources, tests, or fluid fixtures change. POM-only NeqSim
version updates do not trigger it. This verifies compatibility; it does not
archive timing results. Because the workflow is path-filtered, an unconditional
required-check rule can block PRs that do not change benchmark files.

`mvn verify` runs the project's smoke tests. Java 17 or later is required; the
default NeqSim dependency is declared in [pom.xml](pom.xml).