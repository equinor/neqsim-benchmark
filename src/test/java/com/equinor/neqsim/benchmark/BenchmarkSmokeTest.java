package com.equinor.neqsim.benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.Callable;
import org.junit.jupiter.api.Test;
import com.equinor.neqsim.benchmark.flash.FlashBenchmark;
import com.equinor.neqsim.benchmark.fluidmechanics.PipeFlowSolverBenchmark;
import com.equinor.neqsim.benchmark.numerics.LinearAlgebraKernelBenchmark;
import com.equinor.neqsim.benchmark.process.DistillationSolverBenchmark;
import com.equinor.neqsim.benchmark.process.ReactorAndNetworkBenchmark;
import com.equinor.neqsim.benchmark.thermo.InterfacialTensionBenchmark;
import com.equinor.neqsim.benchmark.thermo.PhaseEnvelopeBenchmark;
import com.equinor.neqsim.benchmark.util.BenchmarkFluids;
import neqsim.thermo.system.SystemInterface;
import neqsim.thermodynamicoperations.flashops.TPflash;

/**
 * Runs every benchmark method once so that a NeqSim upgrade (or a linear algebra backend switch)
 * that breaks a benchmarked code path fails the build instead of producing meaningless timings.
 */
class BenchmarkSmokeTest {

  static double check(String name, Callable<Double> call) throws Exception {
    long start = System.nanoTime();
    double value = call.call();
    System.out.printf("%-55s %14.6g  (%d ms)%n", name, value, (System.nanoTime() - start) / 1_000_000);
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
    check("tpMultiPhaseFlashGasOilWater", b::tpMultiPhaseFlashGasOilWater);
    check("tpFlashCpaGasWaterMeg", b::tpFlashCpaGasWaterMeg);
    check("tpFlashReactiveElectrolyte", b::tpFlashReactiveElectrolyte);
    check("tpFlashNearCritical", b::tpFlashNearCritical);
    check("phAndPsFlashWellFluid", b::phAndPsFlashWellFluid);
  }

  @Test
  void phaseEnvelopeBenchmarks() throws Exception {
    PhaseEnvelopeBenchmark b = new PhaseEnvelopeBenchmark();
    b.setup();
    check("ptPhaseEnvelopeGasCondensate", b::ptPhaseEnvelopeGasCondensate);
    check("ptPhaseEnvelopeWellFluid", b::ptPhaseEnvelopeWellFluid);
    check("criticalPointFlashBinary", b::criticalPointFlashBinary);
    check("criticalPointFlashGasCondensate", b::criticalPointFlashGasCondensate);
    check("saturationPointsWellFluid", b::saturationPointsWellFluid);
    check("hydrateFormationTemperatureCpa", b::hydrateFormationTemperatureCpa);
  }

  @Test
  void interfacialTensionBenchmarks() throws Exception {
    for (String model : new String[] {"Full Gradient Theory", "Simple Gradient Theory", "Parachor"}) {
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
    LinearAlgebraKernelBenchmark.ReconciliationSize size = new LinearAlgebraKernelBenchmark.ReconciliationSize();
    size.nodes = 20;
    check("levenbergMarquardtAntoine", b::levenbergMarquardtAntoine);
    check("levenbergMarquardtDoubleExponential", b::levenbergMarquardtDoubleExponential);
    check("dataReconciliation[20]", () -> b.dataReconciliation(size));
  }

  @Test
  void pipeFlowSolverBenchmarks() throws Exception {
    PipeFlowSolverBenchmark b = new PipeFlowSolverBenchmark();
    check("singlePhaseGasPipelineSteadyState", b::singlePhaseGasPipelineSteadyState);
    check("twoPhaseNonEquilibriumPipeSteadyState", b::twoPhaseNonEquilibriumPipeSteadyState);
  }

  /** All column solvers, including the matrix based ones, must agree with direct substitution. */
  @Test
  void distillationSolverBenchmarks() throws Exception {
    double reference = Double.NaN;
    for (String solver : new String[] {"DIRECT_SUBSTITUTION", "INSIDE_OUT", "MATRIX_INSIDE_OUT", "NEWTON",
        "NAPHTALI_SANDHOLM", "MESH_RESIDUAL"}) {
      DistillationSolverBenchmark b = new DistillationSolverBenchmark();
      b.solver = solver;
      double value = check("deethanizer[" + solver + "]", b::deethanizer);
      if (Double.isNaN(reference)) {
        reference = value;
      }
      assertEquals(reference, value, 0.01 * reference, solver + " deviates from direct substitution");
    }
  }

  @Test
  void reactorAndNetworkBenchmarks() throws Exception {
    ReactorAndNetworkBenchmark b = new ReactorAndNetworkBenchmark();
    check("gibbsReactorWaterGasShift", b::gibbsReactorWaterGasShift);
    for (int size : new int[] {4, 8}) {
      ReactorAndNetworkBenchmark.NetworkSize state = new ReactorAndNetworkBenchmark.NetworkSize();
      state.gridSize = size;
      double flow = check("loopedGasNetworkNewton[" + size + "]", () -> b.loopedGasNetworkNewton(state));
      assertTrue(Math.abs(flow) < 1.0e6, "network pipe flow " + flow);
    }
  }

  /**
   * The near-critical sweep is only meaningful if TPflash hands over to the second-order Newton
   * solver. NeqSim creates that solver lazily, so a non-null field shows that it was used.
   */
  @Test
  void nearCriticalSweepReachesNewtonSolver() throws Exception {
    FlashBenchmark b = new FlashBenchmark();
    b.setup();
    java.lang.reflect.Field field =
        Class.forName("neqsim.thermodynamicoperations.flashops.Flash").getDeclaredField("secondOrderSolver");
    field.setAccessible(true);
    SystemInterface fluid = BenchmarkFluids.gasCondensate();
    fluid.setTemperature(b.nearCriticalTemperatureK() - 3.0);
    fluid.setPressure(b.nearCriticalPressureBara() * 0.95);
    TPflash flash = new TPflash(fluid);
    flash.run();
    assertEquals(2, fluid.getNumberOfPhases());
    assertNotNull(field.get(flash), "near-critical TP flash did not use SysNewtonRhapsonTPflash");
  }
}
