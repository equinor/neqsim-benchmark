package com.equinor.neqsim.benchmark.flash;

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
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

/**
 * Flash benchmarks covering the solvers that depend on the linear algebra backend.
 *
 * <p>Each benchmark sweeps a temperature/pressure grid so that one invocation visits single-phase,
 * two-phase and (where relevant) three-phase states. Covered code paths:
 *
 * <ul>
 *   <li>TPflash successive substitution and Rachford-Rice (lean gas, 20-component SRK/PR)
 *   <li>Stability analysis and {@code TPmultiflash} for gas/oil/water
 *   <li>CPA association site solver with water and MEG
 *   <li>Electrolyte CPA with chemical equilibrium ({@code ChemicalEquilibrium})
 *   <li>PH flash and PS flash
 * </ul>
 *
 * <p>Inspired by the {@code @Tag("benchmark")} tests {@code TPFlashBenchmarkTest}, {@code
 * StabilityAnalysisBenchmarkTest} and {@code NewtonSolverAnalysisTest} in NeqSim.
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
  SystemInterface enthalpyFluid;

  @Setup(Level.Trial)
  public void setup() {
    leanGas = BenchmarkFluids.leanGas();
    wellFluidSrk = BenchmarkFluids.wellFluid(false);
    wellFluidPr = BenchmarkFluids.wellFluid(true);
    gasOilWater = BenchmarkFluids.gasOilWater();
    cpaGasWaterMeg = BenchmarkFluids.cpaGasWaterMeg();
    reactiveCO2Water = BenchmarkFluids.reactiveCO2Water();
    enthalpyFluid = BenchmarkFluids.wellFluid(false);
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

  /** PH flash followed by a PS flash, starting from a TP flash. */
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
      ops.PHflash(enthalpy);
      checksum += enthalpyFluid.getTemperature();

      enthalpyFluid.setPressure(p, "bara");
      ops.PSflash(entropy);
      checksum += enthalpyFluid.getTemperature();
    }
    return checksum;
  }
}
