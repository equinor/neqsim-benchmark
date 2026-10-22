package com.equinor.neqsim.benchmark.process;

import com.equinor.neqsim.benchmark.util.BenchmarkFluids;
import java.util.concurrent.TimeUnit;
import neqsim.process.equipment.stream.Stream;
import neqsim.process.processmodel.ProcessModel;
import neqsim.thermo.system.SystemInterface;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

/**
 * Runs the large {@link OilGasPlatformModel}. One run touches a large share of NeqSim: PR flashes
 * on a 16-component E300 fluid, three-phase separators, recycles, polytropic compressors with
 * charts, an expander coupled through an energy stream, an NGL column, a Beggs and Brill pipeline,
 * dew point analysers and JSON reporting.
 *
 * <p>
 * Converging the full model from scratch takes several minutes on older JARs.
 * To keep the work per operation fixed and the run time manageable, both
 * benchmarks cap the number of outer iterations. Full convergence is checked by
 * {@code OilGasPlatformModelTest}.
 * </p>
 *
 * <p>
 * Inspired by {@code LargeCombinedModelsTest} and {@code ProcessProfilingTest} in NeqSim.
 * </p>
 */
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(1)
@Warmup(iterations = 1, time = 10)
@Measurement(iterations = 3, time = 10)
public class LargeProcessModelBenchmark {

  /** Setup and correctness-test limit; the default 50 is insufficient on NeqSim 3.5.0. */
  public static final int CONVERGENCE_ITERATIONS = 150;

  /** Outer iterations for the cold start benchmark. */
  public static final int COLD_START_ITERATIONS = 5;

  /** Outer iterations after a feed rate change on a converged model. */
  public static final int RERUN_ITERATIONS = 3;

  @State(Scope.Benchmark)
  public static class Fluid {
    public SystemInterface wellFluid;

    @Setup(Level.Trial)
    public void setup() {
      wellFluid = BenchmarkFluids.platformWellFluid();
    }
  }

  /** A converged platform that is perturbed by every invocation. */
  @State(Scope.Thread)
  public static class ConvergedPlatform {
    public ProcessModel model;
    int invocation;

    @Setup(Level.Trial)
    public void setup(Fluid fluid) {
      model = OilGasPlatformModel.build(fluid.wellFluid);
      model.setMaxIterations(CONVERGENCE_ITERATIONS);
      model.run();
      if (!model.isModelConverged()) {
        throw new IllegalStateException(model.getConvergenceSummary());
      }
      model.setMaxIterations(RERUN_ITERATIONS);
    }
  }

  /** Builds the platform, runs a fixed number of outer iterations and writes the JSON report. */
  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  public double coldStartBuildRunReport(Fluid fluid) {
    ProcessModel model = OilGasPlatformModel.build(fluid.wellFluid);
    model.setMaxIterations(COLD_START_ITERATIONS);
    model.run();
    return model.getReport_json().length() + exportGasFlow(model);
  }

  /** Changes the HP well rate by 1 % and re-solves the converged platform for a fixed number of iterations. */
  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  public double rerunAfterRateChange(ConvergedPlatform platform) {
    double rate = (platform.invocation++ % 2 == 0) ? 30.3 : 30.0;
    ((Stream) platform.model.get(OilGasPlatformModel.WELLS).getUnit("HP well stream")).setFlowRate(rate,
        "MSm3/day");
    platform.model.run();
    return exportGasFlow(platform.model);
  }

  public static double exportGasFlow(ProcessModel model) {
    return ((Stream) model.get(OilGasPlatformModel.EXPORT).getUnit("export gas")).getFlowRate("MSm3/day");
  }
}
