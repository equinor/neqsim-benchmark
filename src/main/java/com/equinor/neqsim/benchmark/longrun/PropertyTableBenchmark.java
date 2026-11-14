package com.equinor.neqsim.benchmark.longrun;

import com.equinor.neqsim.benchmark.util.BenchmarkFluids;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import neqsim.thermo.system.SystemInterface;
import neqsim.thermo.system.SystemSrkEos;
import neqsim.thermodynamicoperations.ThermodynamicOperations;
import neqsim.thermodynamicoperations.propertygenerator.OLGApropertyTableGeneratorWaterKeywordFormat;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;

/**
 * Generation of large fluid property tables, as used to feed multiphase flow simulators.
 *
 * <p>
 * {@link #olgaThreePhaseTable()} generates and writes a three-phase (gas, oil, water) OLGA keyword-format table with
 * {@link OLGApropertyTableGeneratorWaterKeywordFormat}. {@link #tpPropertyGrid()} fills a dense temperature-pressure
 * grid with TP flashes and physical properties for the 20-component Peng-Robinson well fluid. Each operation takes
 * about 30 seconds.
 * </p>
 *
 * <p>
 * Inspired by {@code OlgaTableGeneratorFluidCoverageTest} in NeqSim.
 * </p>
 */
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(1)
@Warmup(iterations = 0)
@Measurement(iterations = 2)
public class PropertyTableBenchmark {

  /** Pressure points of the OLGA table. */
  public static final int OLGA_PRESSURES = 130;

  /** Temperature points of the OLGA table. */
  public static final int OLGA_TEMPERATURES = 130;

  /** Grid size (in each direction) of the TP property grid. */
  public static final int GRID_POINTS = 150;

  /** Generates and writes a three-phase OLGA keyword-format property table. */
  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  public double olgaThreePhaseTable() {
    return olgaTable(OLGA_PRESSURES, OLGA_TEMPERATURES);
  }

  /** Fills a temperature-pressure grid with phase equilibrium and physical properties. */
  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  public double tpPropertyGrid() {
    return propertyGrid(GRID_POINTS, GRID_POINTS);
  }

  /** Gas, condensate and water fluid for the three-phase OLGA table. */
  public static SystemInterface gasCondensateWater() {
    SystemInterface fluid = new SystemSrkEos(273.15 + 50.0, 60.0);
    fluid.addComponent("nitrogen", 0.5);
    fluid.addComponent("CO2", 1.5);
    fluid.addComponent("methane", 70.0);
    fluid.addComponent("ethane", 6.0);
    fluid.addComponent("propane", 3.0);
    fluid.addComponent("n-butane", 2.0);
    fluid.addComponent("n-pentane", 1.5);
    fluid.addComponent("n-hexane", 1.0);
    fluid.addComponent("n-heptane", 2.0);
    fluid.addComponent("nC10", 2.5);
    fluid.addComponent("water", 10.0);
    fluid.setMixingRule("classic");
    fluid.setMultiPhaseCheck(true);
    return fluid;
  }

  /**
   * Generates a three-phase OLGA table and writes it to a temporary file.
   *
   * @param pressures number of pressure points
   * @param temperatures number of temperature points
   * @return size of the written table in characters
   */
  public static double olgaTable(int pressures, int temperatures) {
    OLGApropertyTableGeneratorWaterKeywordFormat generator =
        new OLGApropertyTableGeneratorWaterKeywordFormat(gasCondensateWater());
    generator.setPressureRange(1.0, 200.0, pressures);
    generator.setTemperatureRange(273.15 - 10.0, 273.15 + 150.0, temperatures);
    generator.run();
    try {
      Path table = Files.createTempFile("neqsim-benchmark-olga", ".tab");
      try {
        generator.writeOLGAinpFile(table.toString());
        return Files.readString(table).length();
      } finally {
        Files.deleteIfExists(table);
      }
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }

  /**
   * TP-flashes the Peng-Robinson well fluid over a grid and evaluates density, enthalpy, entropy, heat capacity,
   * viscosity, thermal conductivity and speed of sound of the mixture.
   *
   * @param pressures number of pressure points
   * @param temperatures number of temperature points
   * @return checksum of the tabulated properties
   */
  public static double propertyGrid(int pressures, int temperatures) {
    SystemInterface fluid = BenchmarkFluids.wellFluid(true);
    ThermodynamicOperations ops = new ThermodynamicOperations(fluid);
    double checksum = 0.0;
    for (int i = 0; i < temperatures; i++) {
      fluid.setTemperature(273.15 - 20.0 + 170.0 * i / Math.max(1, temperatures - 1));
      for (int j = 0; j < pressures; j++) {
        fluid.setPressure(1.0 + 249.0 * j / Math.max(1, pressures - 1));
        ops.TPflash();
        fluid.initProperties();
        checksum += fluid.getDensity("kg/m3") * 1.0e-3 + fluid.getEnthalpy("kJ/kg") * 1.0e-3
            + fluid.getEntropy("kJ/kgK") + fluid.getCp("kJ/kgK") + fluid.getViscosity("cP")
            + fluid.getThermalConductivity("W/mK") + fluid.getSoundSpeed() * 1.0e-3 + fluid.getNumberOfPhases();
      }
    }
    return checksum;
  }
}
