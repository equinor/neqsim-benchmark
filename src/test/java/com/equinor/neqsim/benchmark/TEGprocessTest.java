package com.equinor.neqsim.benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.equinor.neqsim.benchmark.process.TEGprocess;
import java.util.HashSet;
import java.util.Set;
import neqsim.process.equipment.stream.Stream;
import neqsim.process.equipment.util.Recycle;
import neqsim.process.processmodel.ProcessSystem;
import org.junit.jupiter.api.Test;

class TEGprocessTest {

  @Test
  void fullProcessConvergesAndDehydratesGas() {
    long start = System.nanoTime();
    ProcessSystem process = new TEGprocess().testTEGprocess();
    Set<String> names = new HashSet<>();
    process.getUnitOperations().forEach(unit ->
        assertTrue(names.add(unit.getName()), "Duplicate equipment name: " + unit.getName()));

    Stream feed = (Stream) process.getUnit("feed to TEG absorber");
    Stream gas = (Stream) process.getUnit("dry gas from absorber");
    Stream lean = (Stream) process.getUnit("lean TEG to absorber");
    Stream rich = (Stream) process.getUnit("rich TEG from absorber");
    double feedWater = feed.getFluid().getComponent("water").getz();
    double gasWater = gas.getFluid().getComponent("water").getz();
    double flow = gas.getFlowRate("kg/hr");
    System.out.printf(
        "TEG full process: %d ms, solved=%s, gas=%.8g kg/hr, water in/out=%.8g/%.8g%n",
        (System.nanoTime() - start) / 1_000_000, process.solved(), flow, feedWater, gasWater);
    for (String name : new String[] {"stripping gas recirc", "lean TEG resycle"}) {
      Recycle recycle = (Recycle) process.getUnit(name);
      System.out.printf("TEG recycle %s: solved=%s, flow error=%.8g, composition error=%.8g%n",
          name, recycle.solved(), recycle.getErrorFlow(), recycle.getErrorComposition());
      assertTrue(recycle.solved(), name + " did not converge");
    }
    assertTrue(process.solved(), "TEG process did not converge");
    assertTrue(Double.isFinite(flow) && flow > 0.0, "Invalid dry gas flow: " + flow);
    assertTrue(Double.isFinite(gas.getTemperature()) && gas.getTemperature() > 0.0);
    assertEquals(40.0, gas.getPressure("bara"), 0.1);
    assertTrue(Double.isFinite(feedWater) && feedWater > 0.0);
    assertTrue(Double.isFinite(gasWater) && gasWater >= 0.0 && gasWater < feedWater,
        "Absorber did not reduce gas water content");
    double inlet = feed.getFlowRate("kg/hr") + lean.getFlowRate("kg/hr");
    double outlet = flow + rich.getFlowRate("kg/hr");
    assertTrue(Double.isFinite(inlet) && inlet > 0.0);
    assertTrue(Double.isFinite(outlet));
    assertEquals(inlet, outlet, 0.01 * inlet, "Absorber mass balance");
  }
}
