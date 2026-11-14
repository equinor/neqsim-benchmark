package com.equinor.neqsim.benchmark;

import static com.equinor.neqsim.benchmark.BenchmarkSmokeTest.check;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.equinor.neqsim.benchmark.longrun.DynamicProcessBenchmark;
import com.equinor.neqsim.benchmark.longrun.GasProcessingTrain;
import com.equinor.neqsim.benchmark.longrun.MlTrainingDataBenchmark;
import com.equinor.neqsim.benchmark.longrun.ProcessSimulationBenchmark;
import com.equinor.neqsim.benchmark.longrun.PropertyTableBenchmark;
import com.equinor.neqsim.benchmark.longrun.TwoFluidTransientBenchmark;
import com.equinor.neqsim.benchmark.util.BenchmarkFluids;
import neqsim.process.processmodel.ProcessSystem;
import org.junit.jupiter.api.Test;

/**
 * Runs the long-running workload benchmarks with small workload sizes, so that broken code paths fail the build
 * quickly. The full-size workloads are only run by JMH.
 */
class LongRunSmokeTest {

  @Test
  void twoFluidTransient() throws Exception {
    double value = check("twoFluidTransient[small]", () -> TwoFluidTransientBenchmark.simulate(10, 20));
    assertTrue(value > 0.0);
  }

  @Test
  void gasProcessingTrainConverges() throws Exception {
    for (boolean pr : new boolean[] {false, true}) {
      ProcessSystem process = GasProcessingTrain.build(BenchmarkFluids.wellFluid(pr),
          new GasProcessingTrain.Conditions());
      process.run();
      assertTrue(process.solved(), "Gas processing train did not converge, PR=" + pr);
      double checksum = GasProcessingTrain.checksum(process);
      assertTrue(Double.isFinite(checksum) && checksum > 0.0, "Invalid checksum " + checksum);
    }
    check("processSimulationSweep[SRK, small]",
        () -> ProcessSimulationBenchmark.sweep(BenchmarkFluids.wellFluid(false), 2));
    check("processSimulationSweep[PR, small]",
        () -> ProcessSimulationBenchmark.sweep(BenchmarkFluids.wellFluid(true), 2));
  }

  @Test
  void propertyTables() throws Exception {
    double size = check("olgaThreePhaseTable[small]", () -> PropertyTableBenchmark.olgaTable(5, 5));
    assertTrue(size > 0.0, "Empty OLGA table");
    check("tpPropertyGrid[small]", () -> PropertyTableBenchmark.propertyGrid(5, 5));
  }

  @Test
  void dynamicProcess() throws Exception {
    check("separationControlTransient[small]", () -> DynamicProcessBenchmark.simulate(40));
  }

  @Test
  void mlTrainingData() throws Exception {
    double value = check("processSurrogateDataset[small]", () -> MlTrainingDataBenchmark.generate(5));
    assertTrue(value > 0.0);
  }
}
