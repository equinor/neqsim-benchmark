package com.equinor.neqsim.benchmark.longrun;

import com.equinor.neqsim.benchmark.util.BenchmarkFluids;
import java.util.concurrent.TimeUnit;
import neqsim.process.processmodel.ProcessSystem;
import neqsim.thermo.system.SystemInterface;
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
 * Steady-state process simulation with the SRK and Peng-Robinson equations of state.
 *
 * <p>
 * Builds and converges the {@link GasProcessingTrain} (three separation stages, recompression, export compression and
 * two liquid recycles) on the 20-component well fluid for a sweep of feed rates, HP pressures and cooler
 * temperatures. Every case is built from scratch. One operation takes about 30 seconds per equation of state.
 * </p>
 */
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(1)
@Warmup(iterations = 0)
@Measurement(iterations = 2)
public class ProcessSimulationBenchmark {

  /** Number of operating cases solved per operation. */
  public static final int CASES = 48;

  @Param({"SRK", "PR"})
  public String eos;

  SystemInterface fluid;

  @Setup(Level.Trial)
  public void setup() {
    fluid = BenchmarkFluids.wellFluid("PR".equals(eos));
  }

  /** Builds and solves the gas processing train for every operating case. */
  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  public double gasProcessingTrainSweep() {
    return sweep(fluid, CASES);
  }

  /**
   * Builds and solves the train for a deterministic sweep of operating cases.
   *
   * @param fluid feed fluid
   * @param cases number of cases
   * @return sum of the case checksums
   */
  public static double sweep(SystemInterface fluid, int cases) {
    double checksum = 0.0;
    for (int i = 0; i < cases; i++) {
      GasProcessingTrain.Conditions c = new GasProcessingTrain.Conditions();
      c.feedRate = 6.0 + 8.0 * ((i * 7) % cases) / cases;
      c.hpPressure = 55.0 + 30.0 * ((i * 5) % cases) / cases;
      c.coolerTemperature = 20.0 + 20.0 * ((i * 11) % cases) / cases;
      ProcessSystem process = GasProcessingTrain.build(fluid, c);
      process.run();
      checksum += GasProcessingTrain.checksum(process);
    }
    return checksum;
  }
}
