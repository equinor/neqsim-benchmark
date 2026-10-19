package com.equinor.neqsim.benchmark.thermo;

import com.equinor.neqsim.benchmark.util.BenchmarkFluids;
import java.util.concurrent.TimeUnit;
import neqsim.thermo.system.SystemInterface;
import neqsim.thermodynamicoperations.ThermodynamicOperations;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

/**
 * Interfacial tension by simple gradient theory. The gradient theory model uses {@code
 * GTSurfaceTensionSimple}; parachor is included as a non-matrix baseline.
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 3, time = 2)
@Measurement(iterations = 5, time = 2)
@Fork(1)
public class InterfacialTensionBenchmark {

  @Param({"Simple Gradient Theory", "Parachor"})
  public String model;

  SystemInterface system;

  @Setup(Level.Trial)
  public void setup() {
    system = BenchmarkFluids.gasCondensate();
    system.setTemperature(0.0, "C");
    system.setPressure(50.0, "bara");
    new ThermodynamicOperations(system).TPflash();
    system.initProperties();
  }

  @Benchmark
  public double gasOilSurfaceTension() {
    system.getInterphaseProperties().setInterfacialTensionModel("gas", "oil", model);
    return system.getInterphaseProperties().getSurfaceTension(0, 1);
  }
}
