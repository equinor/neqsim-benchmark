package com.equinor.neqsim.benchmark.process;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import neqsim.process.equipment.distillation.DistillationColumn;
import neqsim.process.equipment.stream.Stream;
import neqsim.thermo.system.SystemInterface;
import neqsim.thermo.system.SystemSrkEos;

/**
 * Deethanizer column solved with the different {@link DistillationColumn.SolverType} algorithms.
 * The Newton, Naphtali-Sandholm, matrix inside-out and MESH residual solvers assemble and factorize
 * block Jacobians, the substitution solvers are kept as non-matrix baselines.
 *
 * <p>
 * Inspired by {@code DistillationSolverBenchmarkTest} and {@code SolverSpeedBenchmark} in NeqSim.
 * </p>
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 2, time = 3)
@Measurement(iterations = 5, time = 3)
@Fork(1)
public class DistillationSolverBenchmark {

  @Param({"DIRECT_SUBSTITUTION", "INSIDE_OUT", "MATRIX_INSIDE_OUT", "NEWTON", "NAPHTALI_SANDHOLM",
      "MESH_RESIDUAL"})
  public String solver;

  public static SystemInterface deethanizerFeed() {
    SystemInterface gas = new SystemSrkEos(216, 30.00);
    gas.addComponent("nitrogen", 1.67366E-3);
    gas.addComponent("CO2", 1.06819E-4);
    gas.addComponent("methane", 5.14168E-1);
    gas.addComponent("ethane", 1.92528E-1);
    gas.addComponent("propane", 1.70001E-1);
    gas.addComponent("i-butane", 3.14561E-2);
    gas.addComponent("n-butane", 5.58678E-2);
    gas.addComponent("i-pentane", 1.29573E-2);
    gas.addComponent("n-pentane", 1.23719E-2);
    gas.addComponent("n-hexane", 5.12878E-3);
    gas.addComponent("n-heptane", 1.0E-2);
    gas.setMixingRule("classic");
    return gas;
  }

  /** Builds and solves a 5-tray deethanizer with reboiler. */
  public static DistillationColumn runDeethanizer(DistillationColumn.SolverType solverType) {
    Stream feed = new Stream("feed", deethanizerFeed());
    feed.setFlowRate(100.0, "kg/hr");
    feed.run();

    DistillationColumn column = new DistillationColumn("deethanizer", 5, true, false);
    column.addFeedStream(feed, 5);
    column.getReboiler().setOutletTemperature(105.0 + 273.15);
    column.setTopPressure(30.0);
    column.setBottomPressure(32.0);
    column.setMaxNumberOfIterations(50);
    column.setSolverType(solverType);
    column.run();
    return column;
  }

  @Benchmark
  public double deethanizer() {
    DistillationColumn column = runDeethanizer(DistillationColumn.SolverType.valueOf(solver));
    return column.getGasOutStream().getFlowRate("kg/hr") + column.getLiquidOutStream().getTemperature();
  }
}
