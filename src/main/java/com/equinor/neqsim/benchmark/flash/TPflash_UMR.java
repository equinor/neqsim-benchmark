package com.equinor.neqsim.benchmark.flash;

import neqsim.thermo.system.SystemInterface;
import neqsim.thermo.system.SystemUMRPRUMCEos;
import neqsim.thermodynamicoperations.ThermodynamicOperations;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Warmup;

/** Legacy UMR multiphase workload: 500 TP flashes with physical properties. */
public class TPflash_UMR {

  @Warmup(iterations = 2, time = 10)
  @Measurement(iterations = 2, time = 10)
  @Fork(value = 2, warmups = 2)
  @Benchmark
  public SystemInterface testFlash_UMR() {
    SystemInterface testSystem = new SystemUMRPRUMCEos(273.15 - 5.0, 10.0);
    testSystem.addComponent("CO2", 2.1);
    testSystem.addComponent("nitrogen", 1.16);
    testSystem.addComponent("methane", 26.19);
    testSystem.addComponent("propane", 8.27);
    testSystem.addComponent("propane", 7.5);
    testSystem.addComponent("i-butane", 1.83);
    testSystem.addComponent("n-butane", 4.05);
    testSystem.addComponent("i-pentane", 1.85);
    testSystem.addComponent("n-pentane", 2.45);
    testSystem.addComponent("n-hexane", 40.6);
    testSystem.addComponent("water", 40.6);
    testSystem.setMultiPhaseCheck(true);
    testSystem.setMixingRule("HV", "UNIFAC_UMRPRU");

    ThermodynamicOperations testOps = new ThermodynamicOperations(testSystem);

    for (int i = 0; i < 500; i++) {
      testOps.TPflash();
      testSystem.initProperties();
    }
    return testSystem;
  }
}
