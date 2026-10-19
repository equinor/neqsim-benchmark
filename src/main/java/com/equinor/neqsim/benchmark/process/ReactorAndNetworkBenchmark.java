package com.equinor.neqsim.benchmark.process;

import java.util.concurrent.TimeUnit;
import neqsim.process.equipment.reactor.GibbsReactor;
import neqsim.process.equipment.stream.Stream;
import neqsim.thermo.system.SystemInterface;
import neqsim.thermo.system.SystemPrEos;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

/**
 * Process equipment whose solvers are built on matrix operations: the Gibbs energy minimization
 * reactor (Newton steps on the element-constrained KKT system).
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 3, time = 2)
@Measurement(iterations = 5, time = 2)
@Fork(1)
public class ReactorAndNetworkBenchmark {

  /** Reverse water-gas shift CO2 + H2 = CO + H2O at 1200 K. */
  public static GibbsReactor waterGasShiftReactor() {
    SystemInterface fluid = new SystemPrEos(1200.0, 1.0);
    fluid.addComponent("CO2", 0.5);
    fluid.addComponent("hydrogen", 0.5);
    fluid.addComponent("CO", 0.0);
    fluid.addComponent("water", 0.0);
    fluid.setMixingRule(2);
    GibbsReactor reactor = new GibbsReactor("reactor", new Stream("feed", fluid));
    reactor.setMaxIterations(3000);
    reactor.setConvergenceTolerance(1e-8);
    return reactor;
  }

  @Benchmark
  public double gibbsReactorWaterGasShift() {
    GibbsReactor reactor = waterGasShiftReactor();
    reactor.run();
    return reactor.getOutletStream().getFluid().getComponent("CO").getz();
  }
}
