package com.equinor.neqsim.benchmark.flash;

import neqsim.thermo.system.SystemInterface;
import neqsim.thermo.system.SystemSrkEos;
import neqsim.thermodynamicoperations.ThermodynamicOperations;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Warmup;

/** Legacy SRK multiphase workload: 1,000 TP flashes with physical properties. */
public class TPflash {

  @Warmup(iterations = 2, time = 10)
  @Measurement(iterations = 2, time = 10)
  @Fork(value = 2, warmups = 2)
  @Benchmark
  public SystemInterface testFlash() {
    SystemInterface testSystem = new SystemSrkEos(303.15, 35.01325);
    ThermodynamicOperations testOps = new ThermodynamicOperations(testSystem);

    testSystem.addComponent("nitrogen", 0.0028941);
    testSystem.addComponent("CO2", 0.054069291);
    testSystem.addComponent("methane", 0.730570915);
    testSystem.addComponent("ethane", 0.109004002);
    testSystem.addComponent("propane", 0.061518891);
    testSystem.addComponent("n-butane", 0.0164998);
    testSystem.addComponent("i-butane", 0.006585);
    testSystem.addComponent("n-pentane", 0.005953);
    testSystem.addComponent("i-pentane", 0.0040184);
    testSystem.addTBPfraction("C6", 0.6178399, 86.17801 / 1000.0, 0.6639999);
    testSystem.addComponent("water", 0.27082);
    testSystem.setMixingRule(2);
    testSystem.setMultiPhaseCheck(true);

    for (int i = 0; i < 1000; i++) {
      testOps.TPflash();
      testSystem.initProperties();
    }
    return testSystem;
  }
}
