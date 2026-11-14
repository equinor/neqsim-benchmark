package com.equinor.neqsim.benchmark.longrun;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import neqsim.process.equipment.pipeline.TwoFluidPipe;
import neqsim.process.equipment.stream.Stream;
import neqsim.thermo.system.SystemInterface;
import neqsim.thermo.system.SystemSrkEos;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;

/**
 * Transient simulation of a hilly gas-condensate flowline with the {@link TwoFluidPipe} two-fluid model.
 *
 * <p>
 * The pipe is initialized at steady state, then the inlet rate is ramped up by 60 % and back down again while the
 * pipe is integrated in time. This exercises the two-fluid conservation equations, the flow regime and closure
 * models, and the periodic thermodynamic updates of the sections. One operation takes about one minute.
 * </p>
 *
 * <p>
 * Inspired by {@code TwoFluidPipeBenchmarkTest} and {@code TransientThreePhaseFlowTest} in NeqSim.
 * </p>
 */
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(1)
@Warmup(iterations = 0)
@Measurement(iterations = 2)
public class TwoFluidTransientBenchmark {

  /** Number of pipe sections in the benchmark. */
  public static final int SECTIONS = 40;

  /** Number of transient time steps in the benchmark. */
  public static final int TIME_STEPS = 1200;

  /** Time step in seconds. */
  public static final double TIME_STEP = 1.0;

  /** Ramps the inlet rate of a 5 km hilly flowline and integrates the two-fluid model in time. */
  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  public double gasCondensateFlowlineRampUp() {
    return simulate(SECTIONS, TIME_STEPS);
  }

  /**
   * Builds the flowline, solves it at steady state and runs the transient.
   *
   * @param sections number of pipe sections
   * @param steps number of transient time steps
   * @return checksum of outlet pressure, liquid inventory and the pressure profile
   */
  public static double simulate(int sections, int steps) {
    SystemInterface fluid = new SystemSrkEos(273.15 + 50.0, 80.0);
    fluid.addComponent("nitrogen", 0.5);
    fluid.addComponent("CO2", 1.5);
    fluid.addComponent("methane", 80.0);
    fluid.addComponent("ethane", 6.0);
    fluid.addComponent("propane", 3.5);
    fluid.addComponent("n-butane", 2.0);
    fluid.addComponent("n-pentane", 2.0);
    fluid.addComponent("n-hexane", 1.5);
    fluid.addComponent("n-heptane", 1.5);
    fluid.addComponent("n-octane", 1.0);
    fluid.addComponent("nC10", 0.5);
    fluid.setMixingRule("classic");

    double baseRate = 40000.0;
    Stream inlet = new Stream("flowline inlet", fluid);
    inlet.setFlowRate(baseRate, "kg/hr");
    inlet.setTemperature(50.0, "C");
    inlet.setPressure(80.0, "bara");
    inlet.run();

    TwoFluidPipe pipe = new TwoFluidPipe("flowline", inlet);
    pipe.setLength(5000.0);
    pipe.setDiameter(0.254);
    pipe.setRoughness(4.6e-5);
    pipe.setNumberOfSections(sections);
    double[] elevation = new double[sections];
    for (int i = 0; i < sections; i++) {
      double x = (double) i / Math.max(1, sections - 1);
      elevation[i] = 15.0 * Math.sin(3.0 * Math.PI * x) + 10.0 * x;
    }
    pipe.setElevationProfile(elevation);
    pipe.setOutletPressure(60.0, "bara");
    pipe.run();

    UUID id = UUID.randomUUID();
    for (int step = 0; step < steps; step++) {
      double fraction = (double) step / steps;
      double rate = fraction < 0.5 ? baseRate * (1.0 + 1.2 * fraction) : baseRate * (1.6 - 1.2 * (fraction - 0.5));
      inlet.setFlowRate(rate, "kg/hr");
      inlet.run();
      pipe.runTransient(TIME_STEP, id);
    }

    double checksum = pipe.getOutletStream().getPressure("bara") + pipe.getLiquidInventory("m3");
    for (double pressure : pipe.getPressureProfile()) {
      checksum += pressure * 1.0e-5;
    }
    return checksum;
  }
}
