package com.equinor.neqsim.benchmark.thermo;

import java.util.concurrent.TimeUnit;
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
import com.equinor.neqsim.benchmark.util.BenchmarkFluids;
import neqsim.thermo.system.SystemInterface;
import neqsim.thermodynamicoperations.ThermodynamicOperations;

/**
 * Phase envelope, critical point and saturation benchmarks.
 *
 * <p>
 * The phase envelope tracer and the critical point flash solve Jacobian systems through
 * {@code SysNewtonRhapson} / {@code CriticalPointFlash}, so they are sensitive to the linear
 * algebra backend. Saturation and hydrate calculations wrap many nested TP flashes.
 * </p>
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 3, time = 2)
@Measurement(iterations = 5, time = 2)
@Fork(1)
public class PhaseEnvelopeBenchmark {

  SystemInterface gasCondensate;
  SystemInterface wellFluid;
  SystemInterface binary;
  SystemInterface hydrateFluid;

  @Setup(Level.Trial)
  public void setup() {
    gasCondensate = BenchmarkFluids.gasCondensate();
    wellFluid = BenchmarkFluids.wellFluid(false);
    binary = BenchmarkFluids.methanePropane();
    hydrateFluid = BenchmarkFluids.cpaGasWaterMeg();
    hydrateFluid.setHydrateCheck(true);
  }

  /** Full PT phase envelope of a gas condensate with pseudo-components. */
  @Benchmark
  public double ptPhaseEnvelopeGasCondensate() {
    SystemInterface sys = gasCondensate.clone();
    ThermodynamicOperations ops = new ThermodynamicOperations(sys);
    ops.calcPTphaseEnvelope();
    return ops.get("cricondenbar")[1] + ops.get("cricondentherm")[0];
  }

  /** Full PT phase envelope of the 20-component well fluid. */
  @Benchmark
  public double ptPhaseEnvelopeWellFluid() {
    SystemInterface sys = wellFluid.clone();
    ThermodynamicOperations ops = new ThermodynamicOperations(sys);
    ops.calcPTphaseEnvelope();
    return ops.get("cricondenbar")[1] + ops.get("cricondentherm")[0];
  }

  @Benchmark
  public double criticalPointFlashBinary() {
    SystemInterface sys = binary.clone();
    sys.init(0);
    new ThermodynamicOperations(sys).criticalPointFlash();
    return sys.getTemperature() + sys.getPressure();
  }

  @Benchmark
  public double criticalPointFlashGasCondensate() {
    SystemInterface sys = gasCondensate.clone();
    sys.init(0);
    new ThermodynamicOperations(sys).criticalPointFlash();
    return sys.getTemperature() + sys.getPressure();
  }

  /** Dew point temperatures and bubble point pressures for the well fluid. */
  @Benchmark
  public double saturationPointsWellFluid() throws Exception {
    SystemInterface sys = wellFluid.clone();
    ThermodynamicOperations ops = new ThermodynamicOperations(sys);
    double checksum = 0.0;
    for (double p : new double[] {10.0, 30.0, 60.0}) {
      sys.setPressure(p, "bara");
      sys.setTemperature(20.0, "C");
      ops.dewPointTemperatureFlash();
      checksum += sys.getTemperature();
    }
    for (double t : new double[] {-40.0, 0.0, 40.0}) {
      sys.setTemperature(t, "C");
      sys.setPressure(50.0, "bara");
      ops.bubblePointPressureFlash(false);
      checksum += sys.getPressure();
    }
    return checksum;
  }

  /** Hydrate equilibrium temperature with CPA (water + MEG inhibited gas). */
  @Benchmark
  public double hydrateFormationTemperatureCpa() throws Exception {
    SystemInterface sys = hydrateFluid.clone();
    ThermodynamicOperations ops = new ThermodynamicOperations(sys);
    double checksum = 0.0;
    for (double p : new double[] {50.0, 100.0}) {
      sys.setPressure(p, "bara");
      sys.setTemperature(10.0, "C");
      ops.hydrateFormationTemperature();
      checksum += sys.getTemperature();
    }
    return checksum;
  }
}
