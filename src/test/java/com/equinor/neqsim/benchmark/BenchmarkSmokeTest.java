package com.equinor.neqsim.benchmark;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.equinor.neqsim.benchmark.flash.FlashBenchmark;
import com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark;
import com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark;
import com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark;
import com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark;
import java.util.concurrent.Callable;
import org.junit.jupiter.api.Test;

/**
 * Runs every benchmark method once so that a NeqSim upgrade (or a linear algebra backend switch)
 * that breaks a benchmarked code path fails the build instead of producing meaningless timings.
 */
class BenchmarkSmokeTest {

  static double check(String name, Callable<Double> call) throws Exception {
    long start = System.nanoTime();
    double value = call.call();
    System.out.printf(
        "%-55s %14.6g  (%d ms)%n", name, value, (System.nanoTime() - start) / 1_000_000);
    assertTrue(Double.isFinite(value), name + " returned " + value);
    return value;
  }

  @Test
  void flashBenchmarks() throws Exception {
    FlashBenchmark b = new FlashBenchmark();
    b.setup();
    check("tpFlashLeanGas", b::tpFlashLeanGas);
    check("tpFlashWellFluidSrk", b::tpFlashWellFluidSrk);
    check("tpFlashWellFluidPr", b::tpFlashWellFluidPr);
    check("tpFlashWellFluidWithProperties", b::tpFlashWellFluidWithProperties);
    check("phAndPsFlashWellFluid", b::phAndPsFlashWellFluid);
  }

  @Test
  void phaseEnvelopeBenchmarks() throws Exception {
    PhaseEnvelopeBenchmark b = new PhaseEnvelopeBenchmark();
    b.setup();
    check("ptPhaseEnvelopeGasCondensate", b::ptPhaseEnvelopeGasCondensate);
    check("ptPhaseEnvelopeWellFluid", b::ptPhaseEnvelopeWellFluid);
    check("saturationPointsWellFluid", b::saturationPointsWellFluid);
  }

  @Test
  void interfacialTensionBenchmarks() throws Exception {
    for (String model : new String[] {"Simple Gradient Theory", "Parachor"}) {
      InterfacialTensionBenchmark b = new InterfacialTensionBenchmark();
      b.model = model;
      b.setup();
      double sigma = check("gasOilSurfaceTension[" + model + "]", b::gasOilSurfaceTension);
      assertTrue(sigma > 0.0, model + " surface tension " + sigma);
    }
  }

  @Test
  void linearAlgebraKernelBenchmarks() throws Exception {
    LinearAlgebraKernelBenchmark b = new LinearAlgebraKernelBenchmark();
    check("levenbergMarquardtAntoine", b::levenbergMarquardtAntoine);
    check("levenbergMarquardtDoubleExponential", b::levenbergMarquardtDoubleExponential);
  }

  @Test
  void pipeFlowSolverBenchmarks() throws Exception {
    PipeFlowSolverBenchmark b = new PipeFlowSolverBenchmark();
    check("singlePhaseGasPipelineSteadyState", b::singlePhaseGasPipelineSteadyState);
    check("twoPhaseNonEquilibriumPipeSteadyState", b::twoPhaseNonEquilibriumPipeSteadyState);
  }
}
