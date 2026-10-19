package com.equinor.neqsim.benchmark.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import neqsim.thermo.system.SystemElectrolyteCPAstatoil;
import neqsim.thermo.system.SystemInterface;
import neqsim.thermo.system.SystemPrEos;
import neqsim.thermo.system.SystemSrkCPAstatoil;
import neqsim.thermo.system.SystemSrkEos;
import neqsim.thermo.util.readwrite.EclipseFluidReadWrite;

/**
 * Reference fluids shared by the benchmarks and the smoke tests, so that both always exercise the
 * same thermodynamic problems.
 */
public final class BenchmarkFluids {

  private BenchmarkFluids() {}

  /** Three-component lean gas (SRK). */
  public static SystemInterface leanGas() {
    SystemInterface sys = new SystemSrkEos(298.15, 50.0);
    sys.addComponent("methane", 0.90);
    sys.addComponent("ethane", 0.07);
    sys.addComponent("propane", 0.03);
    sys.setMixingRule("classic");
    return sys;
  }

  /** 20-component well fluid (SRK or PR), C1 to nC15 with N2, CO2 and H2S. */
  public static SystemInterface wellFluid(boolean pengRobinson) {
    SystemInterface sys = pengRobinson ? new SystemPrEos(298.15, 50.0) : new SystemSrkEos(298.15, 50.0);
    sys.addComponent("nitrogen", 1.0);
    sys.addComponent("CO2", 2.0);
    sys.addComponent("H2S", 0.5);
    sys.addComponent("methane", 60.0);
    sys.addComponent("ethane", 8.0);
    sys.addComponent("propane", 5.0);
    sys.addComponent("i-butane", 2.0);
    sys.addComponent("n-butane", 3.0);
    sys.addComponent("i-pentane", 1.5);
    sys.addComponent("n-pentane", 1.2);
    sys.addComponent("n-hexane", 1.0);
    sys.addComponent("n-heptane", 0.8);
    sys.addComponent("n-octane", 0.6);
    sys.addComponent("n-nonane", 0.4);
    sys.addComponent("nC10", 0.3);
    sys.addComponent("nC11", 0.2);
    sys.addComponent("nC12", 0.15);
    sys.addComponent("nC13", 0.1);
    sys.addComponent("nC14", 0.08);
    sys.addComponent("nC15", 0.05);
    sys.setMixingRule("classic");
    return sys;
  }

  /** Gas condensate with TBP pseudo-components, used for phase envelopes and saturation points. */
  public static SystemInterface gasCondensate() {
    SystemInterface sys = new SystemSrkEos(273.15 + 20.0, 50.0);
    sys.addComponent("nitrogen", 0.8);
    sys.addComponent("CO2", 2.5);
    sys.addComponent("methane", 80.0);
    sys.addComponent("ethane", 7.0);
    sys.addComponent("propane", 3.5);
    sys.addComponent("i-butane", 0.7);
    sys.addComponent("n-butane", 1.2);
    sys.addComponent("i-pentane", 0.5);
    sys.addComponent("n-pentane", 0.5);
    sys.addComponent("n-hexane", 0.4);
    sys.addTBPfraction("C7", 0.8, 92.0 / 1000.0, 0.73);
    sys.addTBPfraction("C8", 0.6, 104.0 / 1000.0, 0.75);
    sys.addTBPfraction("C9", 0.4, 120.0 / 1000.0, 0.77);
    sys.addTBPfraction("C10", 0.6, 180.0 / 1000.0, 0.80);
    sys.setMixingRule("classic");
    return sys;
  }

  /** Natural gas, oil and free water: three-phase multiflash with stability analysis. */
  public static SystemInterface gasOilWater() {
    SystemInterface sys = wellFluid(false);
    sys.addComponent("water", 20.0);
    sys.setMixingRule(2);
    sys.setMultiPhaseCheck(true);
    return sys;
  }

  /** Natural gas, water and MEG with the CPA EOS (association site solver). */
  public static SystemInterface cpaGasWaterMeg() {
    SystemInterface sys = new SystemSrkCPAstatoil(273.15 + 10.0, 80.0);
    sys.addComponent("nitrogen", 0.5);
    sys.addComponent("CO2", 1.5);
    sys.addComponent("methane", 80.0);
    sys.addComponent("ethane", 6.0);
    sys.addComponent("propane", 3.0);
    sys.addComponent("n-butane", 1.0);
    sys.addComponent("n-hexane", 0.5);
    sys.addComponent("water", 10.0);
    sys.addComponent("MEG", 5.0);
    sys.setMixingRule(10);
    sys.setMultiPhaseCheck(true);
    return sys;
  }

  /** CO2 / methane / water with electrolyte CPA and chemical reactions (chemical equilibrium solver). */
  public static SystemInterface reactiveCO2Water() {
    SystemInterface sys = new SystemElectrolyteCPAstatoil(298.15, 10.0);
    sys.addComponent("methane", 1.0);
    sys.addComponent("CO2", 2.0);
    sys.addComponent("water", 10.0);
    sys.chemicalReactionInit();
    sys.createDatabase(true);
    sys.setMixingRule(10);
    sys.setMultiPhaseCheck(true);
    return sys;
  }

  /** Methane/propane binary used for the critical point flash. */
  public static SystemInterface methanePropane() {
    SystemInterface sys = new SystemSrkEos(300.0, 80.0);
    sys.addComponent("methane", 0.1);
    sys.addComponent("propane", 0.1);
    sys.createDatabase(true);
    sys.setMixingRule(2);
    return sys;
  }

  /**
   * Reads the 16-component PR oil/gas well fluid (E300 format) used by the large platform model.
   * The file is shipped as a classpath resource and copied to a temporary file because the E300
   * reader needs a file path.
   */
  public static SystemInterface platformWellFluid() {
    try (InputStream in = BenchmarkFluids.class.getResourceAsStream("/fluids/platform_feed.e300")) {
      if (in == null) {
        throw new IllegalStateException("Missing resource /fluids/platform_feed.e300");
      }
      Path tmp = Files.createTempFile("neqsim-benchmark-feed", ".e300");
      try {
        Files.copy(in, tmp, StandardCopyOption.REPLACE_EXISTING);
        return EclipseFluidReadWrite.read(tmp.toString());
      } finally {
        Files.deleteIfExists(tmp);
      }
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}
