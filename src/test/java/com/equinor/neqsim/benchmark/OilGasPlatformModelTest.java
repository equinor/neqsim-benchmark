package com.equinor.neqsim.benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.equinor.neqsim.benchmark.process.LargeProcessModelBenchmark;
import com.equinor.neqsim.benchmark.process.OilGasPlatformModel;
import com.equinor.neqsim.benchmark.util.BenchmarkFluids;
import neqsim.process.equipment.compressor.Compressor;
import neqsim.process.equipment.pipeline.PipeBeggsAndBrills;
import neqsim.process.equipment.separator.ThreePhaseSeparator;
import neqsim.process.equipment.stream.Stream;
import neqsim.process.equipment.valve.ThrottlingValve;
import neqsim.process.processmodel.ProcessModel;
import org.junit.jupiter.api.Test;

/** Checks that the large platform model builds, solves and gives plausible results. */
class OilGasPlatformModelTest {

  @Test
  void platformModelSolves() {
    long start = System.nanoTime();
    ProcessModel model = OilGasPlatformModel.build(BenchmarkFluids.platformWellFluid());
    model.setMaxIterations(LargeProcessModelBenchmark.CONVERGENCE_ITERATIONS);
    model.run();
    System.out.printf("platform model cold run: %d ms%n", (System.nanoTime() - start) / 1_000_000);
    System.out.println(model.getConvergenceSummary());
    assertTrue(model.isModelConverged(), "Full platform did not converge");

    double feed = ((Stream) model.get(OilGasPlatformModel.WELLS).getUnit("HP well stream")).getFlowRate("kg/hr")
        + ((Stream) model.get(OilGasPlatformModel.WELLS).getUnit("LP well stream")).getFlowRate("kg/hr");
    double gasA = ((ThrottlingValve) model.get(OilGasPlatformModel.EXPANDER_A).getUnit("gas split valve"))
        .getOutletStream().getFlowRate("kg/hr");
    double gasB = ((ThrottlingValve) model.get(OilGasPlatformModel.EXPANDER_B).getUnit("gas split valve"))
        .getOutletStream().getFlowRate("kg/hr");
    double oilA = ((Stream) model.get(OilGasPlatformModel.EXPANDER_A).getUnit("export oil")).getFlowRate("kg/hr");
    double oilB = ((Stream) model.get(OilGasPlatformModel.EXPANDER_B).getUnit("export oil")).getFlowRate("kg/hr");
    double water = model.get(OilGasPlatformModel.EXPORT).getUnit("produced water mixer").getFluid()
        .getFlowRate("kg/hr");
    System.out.printf("feed %.1f, gas %.1f + %.1f, oil %.1f + %.1f, water %.1f kg/hr%n", feed, gasA, gasB, oilA,
        oilB, water);

    double firstStageGasA = ((ThreePhaseSeparator) model.get(OilGasPlatformModel.TRAIN_A)
        .getUnit("1st stage separator")).getGasOutStream().getFlowRate("MSm3/day");
    double exportGas = LargeProcessModelBenchmark.exportGasFlow(model);
    double ka27841A = ((Compressor) model.get(OilGasPlatformModel.COMPRESSOR_A).getUnit("KA27841"))
        .getOutletStream().getPressure("bara");
    double pipelineOutlet = ((PipeBeggsAndBrills) model.get(OilGasPlatformModel.EXPORT)
        .getUnit("gas export pipeline")).getOutletStream().getPressure("bara");
    System.out.printf(
        "1st stage gas A %.3f MSm3/d, export gas %.3f MSm3/d, KA27841 A %.1f bara, pipeline outlet %.1f bara%n",
        firstStageGasA, exportGas, ka27841A, pipelineOutlet);

    // Same expectations as the NeqSim LargeCombinedModelsTest, with loose tolerances.
    assertEquals(5.31, firstStageGasA, 0.3);
    assertTrue(exportGas > 10.0 && exportGas < 25.0, "export gas " + exportGas);
    assertTrue(ka27841A > 40.0, "KA27841 A outlet " + ka27841A);
    assertTrue(pipelineOutlet > 20.0, "export pipeline outlet " + pipelineOutlet);
    assertEquals(feed, gasA + gasB + oilA + oilB + water, 0.02 * feed, "overall mass balance");
  }
}
