package com.equinor.neqsim.benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.equinor.neqsim.benchmark.flash.TPflash;
import com.equinor.neqsim.benchmark.flash.TPflash_UMR;
import neqsim.thermo.system.SystemInterface;
import org.junit.jupiter.api.Test;

class LegacyFlashTest {

  @Test
  void fullSrkWorkload() {
    check(new TPflash().testFlash(), 303.15, 35.01325);
  }

  @Test
  void fullUmrWorkload() {
    check(new TPflash_UMR().testFlash_UMR(), 268.15, 10.0);
  }

  private static void check(SystemInterface fluid, double temperature, double pressure) {
    assertEquals(temperature, fluid.getTemperature(), 1e-8);
    assertEquals(pressure, fluid.getPressure(), 1e-8);
    assertTrue(fluid.getNumberOfPhases() >= 2, "Expected a multiphase flash");
    double density = fluid.getDensity("kg/m3");
    assertTrue(Double.isFinite(density) && density > 0.0, "Invalid density: " + density);
    double phaseFraction = 0.0;
    for (int phase = 0; phase < fluid.getNumberOfPhases(); phase++) {
      double beta = fluid.getBeta(phase);
      assertTrue(Double.isFinite(beta) && beta >= 0.0 && beta <= 1.0,
          "Invalid phase fraction: " + beta);
      phaseFraction += beta;
      double composition = 0.0;
      for (int component = 0; component < fluid.getPhase(phase).getNumberOfComponents(); component++) {
        double fraction = fluid.getPhase(phase).getComponent(component).getx();
        assertTrue(Double.isFinite(fraction) && fraction >= 0.0 && fraction <= 1.0,
            "Invalid phase composition: " + fraction);
        composition += fraction;
      }
      assertEquals(1.0, composition, 1e-8, "Phase composition sum");
    }
    assertEquals(1.0, phaseFraction, 1e-8, "Phase fraction sum");
  }
}
