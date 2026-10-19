package com.equinor.neqsim.benchmark.flash;

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
 * Flash benchmarks covering the solvers that depend on the linear algebra backend.
 *
 * <p>
 * Each benchmark sweeps a temperature/pressure grid so that one invocation visits single-phase,
 * two-phase and (where relevant) three-phase states. Covered code paths:
 * </p>
 * <ul>
 * <li>TPflash successive substitution and Rachford-Rice (lean gas, 20-component SRK/PR)</li>
 * <li>Second-order Newton TP flash ({@code SysNewtonRhapsonTPflash}) near the critical point</li>
 * <li>Stability analysis and {@code TPmultiflash} for gas/oil/water</li>
 * <li>CPA association site solver with water and MEG</li>
 * <li>Electrolyte CPA with chemical equilibrium ({@code ChemicalEquilibrium})</li>
 * <li>Newton PH flash ({@code SysNewtonRhapsonPHflash}) and PS flash</li>
 * </ul>
 *
 * <p>
 * Inspired by the {@code @Tag("benchmark")} tests {@code TPFlashBenchmarkTest},
 * {@code StabilityAnalysisBenchmarkTest} and {@code NewtonSolverAnalysisTest} in NeqSim.
 * </p>
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 3, time = 2)
@Measurement(iterations = 5, time = 2)
@Fork(1)
public class FlashBenchmark {

  static final double[] TEMPERATURES_C = {-20.0, 0.0, 20.0, 40.0, 60.0, 80.0};
  static final double[] PRESSURES_BARA = {5.0, 20.0, 50.0, 90.0, 140.0};

  SystemInterface leanGas;
  SystemInterface wellFluidSrk;
  SystemInterface wellFluidPr;
  SystemInterface gasOilWater;
  SystemInterface cpaGasWaterMeg;
  SystemInterface reactiveCO2Water;
  SystemInterface nearCritical;
  SystemInterface enthalpyFluid;

  double nearCriticalTemperatureK;
  double nearCriticalPressureBara;

  @Setup(Level.Trial)
  public void setup() {
    leanGas = BenchmarkFluids.leanGas();
    wellFluidSrk = BenchmarkFluids.wellFluid(false);
    wellFluidPr = BenchmarkFluids.wellFluid(true);
    gasOilWater = BenchmarkFluids.gasOilWater();
    cpaGasWaterMeg = BenchmarkFluids.cpaGasWaterMeg();
    reactiveCO2Water = BenchmarkFluids.reactiveCO2Water();
    enthalpyFluid = BenchmarkFluids.wellFluid(false);

    // Locate the mixture critical point so the near-critical sweep stays where successive
    // substitution stalls and the TP flash hands over to the Newton solver.
    SystemInterface critical = BenchmarkFluids.gasCondensate();
    critical.init(0);
    new ThermodynamicOperations(critical).criticalPointFlash();
    nearCriticalTemperatureK = critical.getTemperature();
    nearCriticalPressureBara = critical.getPressure();
    nearCritical = BenchmarkFluids.gasCondensate();
  }

  public double nearCriticalTemperatureK() {
    return nearCriticalTemperatureK;
  }

  public double nearCriticalPressureBara() {
    return nearCriticalPressureBara;
  }

  static double sweepTP(SystemInterface system) {
    ThermodynamicOperations ops = new ThermodynamicOperations(system);
    double checksum = 0.0;
    for (double t : TEMPERATURES_C) {
      for (double p : PRESSURES_BARA) {
        system.setTemperature(t, "C");
        system.setPressure(p, "bara");
        ops.TPflash();
        checksum += system.getBeta() + system.getNumberOfPhases();
      }
    }
    return checksum;
  }

  @Benchmark
  public double tpFlashLeanGas() {
    return sweepTP(leanGas);
  }

  @Benchmark
  public double tpFlashWellFluidSrk() {
    return sweepTP(wellFluidSrk);
  }

  @Benchmark
  public double tpFlashWellFluidPr() {
    return sweepTP(wellFluidPr);
  }

  /** TP flash with init(3) and physical properties, as done by process equipment. */
  @Benchmark
  public double tpFlashWellFluidWithProperties() {
    ThermodynamicOperations ops = new ThermodynamicOperations(wellFluidSrk);
    double checksum = 0.0;
    for (double t : TEMPERATURES_C) {
      for (double p : PRESSURES_BARA) {
        wellFluidSrk.setTemperature(t, "C");
        wellFluidSrk.setPressure(p, "bara");
        ops.TPflash();
        wellFluidSrk.initProperties();
        checksum += wellFluidSrk.getDensity("kg/m3") + wellFluidSrk.getCp("J/molK");
      }
    }
    return checksum;
  }

  @Benchmark
  public double tpMultiPhaseFlashGasOilWater() {
    return sweepTP(gasOilWater);
  }

  @Benchmark
  public double tpFlashCpaGasWaterMeg() {
    return sweepTP(cpaGasWaterMeg);
  }

  @Benchmark
  public double tpFlashReactiveElectrolyte() {
    ThermodynamicOperations ops = new ThermodynamicOperations(reactiveCO2Water);
    double checksum = 0.0;
    for (double t : new double[] {25.0, 50.0}) {
      for (double p : new double[] {1.01325, 10.0}) {
        reactiveCO2Water.setTemperature(t, "C");
        reactiveCO2Water.setPressure(p, "bara");
        ops.TPflash();
        checksum += reactiveCO2Water.getBeta() + reactiveCO2Water.getNumberOfPhases();
      }
    }
    return checksum;
  }

  /** TP flashes in the two-phase region close to the mixture critical point. */
  @Benchmark
  public double tpFlashNearCritical() {
    ThermodynamicOperations ops = new ThermodynamicOperations(nearCritical);
    double checksum = 0.0;
    for (double dT : new double[] {-8.0, -5.0, -3.0, -1.5}) {
      for (double pFactor : new double[] {0.90, 0.95, 0.98}) {
        nearCritical.setTemperature(nearCriticalTemperatureK + dT);
        nearCritical.setPressure(nearCriticalPressureBara * pFactor);
        ops.TPflash();
        checksum += nearCritical.getBeta() + nearCritical.getNumberOfPhases();
      }
    }
    return checksum;
  }

  /** Direct Newton PH flash (type 1) followed by a PS flash, starting from a TP flash. */
  @Benchmark
  public double phAndPsFlashWellFluid() {
    ThermodynamicOperations ops = new ThermodynamicOperations(enthalpyFluid);
    double checksum = 0.0;
    for (double p : new double[] {10.0, 30.0, 60.0, 100.0}) {
      enthalpyFluid.setTemperature(40.0, "C");
      enthalpyFluid.setPressure(p, "bara");
      ops.TPflash();
      enthalpyFluid.init(3);
      double enthalpy = enthalpyFluid.getEnthalpy();
      double entropy = enthalpyFluid.getEntropy();

      enthalpyFluid.setPressure(p * 0.5, "bara");
      ops.PHflash(enthalpy, 1);
      checksum += enthalpyFluid.getTemperature();

      enthalpyFluid.setPressure(p, "bara");
      ops.PSflash(entropy);
      checksum += enthalpyFluid.getTemperature();
    }
    return checksum;
  }
}
