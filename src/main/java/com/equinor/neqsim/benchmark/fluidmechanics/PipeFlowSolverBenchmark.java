package com.equinor.neqsim.benchmark.fluidmechanics;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import neqsim.fluidmechanics.flowsystem.FlowSystemInterface;
import neqsim.fluidmechanics.flowsystem.onephaseflowsystem.pipeflowsystem.PipeFlowSystem;
import neqsim.fluidmechanics.flowsystem.twophaseflowsystem.twophasepipeflowsystem.TwoPhasePipeFlowSystem;
import neqsim.fluidmechanics.geometrydefinitions.GeometryDefinitionInterface;
import neqsim.fluidmechanics.geometrydefinitions.pipe.PipeData;
import neqsim.thermo.system.SystemInterface;
import neqsim.thermo.system.SystemSrkEos;

/**
 * Fluid mechanics solvers that assemble and solve sparse/banded matrix systems on a staggered grid:
 * the single-phase gas pipeline solver ({@code OnePhaseFixedStaggeredGrid}) and the two-phase
 * non-equilibrium pipe solver ({@code TwoPhaseFixedStaggeredGridSolver} with the film/boundary mass
 * transfer models in {@code fluidboundary}).
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 3, time = 3)
@Measurement(iterations = 5, time = 3)
@Fork(1)
public class PipeFlowSolverBenchmark {

  /** 740 km gas export pipeline, 10 legs x 20 nodes. */
  public static FlowSystemInterface gasExportPipeline() {
    PipeFlowSystem pipe = new PipeFlowSystem();
    SystemInterface gas = new SystemSrkEos(285.15, 200.0);
    gas.addComponent("methane", 0.9);
    gas.addComponent("ethane", 0.1);
    gas.createDatabase(true);
    gas.init(0);
    gas.init(3);
    gas.initPhysicalProperties();
    gas.setTotalFlowRate(60.0, "MSm3/day");

    double[] length = {0, 10000, 50000, 150000, 200000, 400000, 500000, 600000, 650000, 700000, 740000};
    int points = length.length;
    GeometryDefinitionInterface[] geometry = new PipeData[points];
    for (int i = 0; i < points; i++) {
      geometry[i] = new PipeData();
      geometry[i].setDiameter(1.0);
      geometry[i].setInnerSurfaceRoughness(1.0e-5);
    }
    pipe.setInletThermoSystem(gas);
    pipe.setNumberOfLegs(points - 1);
    pipe.setNumberOfNodesInLeg(20);
    pipe.setEquipmentGeometry(geometry);
    pipe.setLegHeights(new double[points]);
    pipe.setLegPositions(length);
    pipe.setLegOuterTemperatures(filled(points, 278.0));
    pipe.setLegWallHeatTransferCoefficients(filled(points, 15.0));
    pipe.setLegOuterHeatTransferCoefficients(filled(points, 5.0));
    pipe.createSystem();
    pipe.init();
    return pipe;
  }

  /** Short stratified methane/water pipe with interphase mass and heat transfer. */
  public static FlowSystemInterface twoPhaseNonEquilibriumPipe() {
    TwoPhasePipeFlowSystem pipe = new TwoPhasePipeFlowSystem();
    SystemInterface fluid = new SystemSrkEos(295.3, 5.0);
    fluid.addComponent("methane", 0.1, 0);
    fluid.addComponent("water", 0.05, 1);
    fluid.createDatabase(true);
    fluid.setMixingRule(2);

    int points = 4;
    pipe.setInletThermoSystem(fluid);
    pipe.setInitialFlowPattern("stratified");
    pipe.setNumberOfLegs(points - 1);
    pipe.setNumberOfNodesInLeg(10);
    pipe.setLegHeights(new double[points]);
    pipe.setLegPositions(new double[] {0.0, 1.0, 2.0, 3.0});
    pipe.setLegOuterTemperatures(filled(points, 278.0));
    pipe.setLegOuterHeatTransferCoefficients(filled(points, 5.0));
    pipe.setLegWallHeatTransferCoefficients(filled(points, 15.0));
    GeometryDefinitionInterface[] geometry = new PipeData[points];
    for (int i = 0; i < points; i++) {
      geometry[i] = new PipeData(0.025);
    }
    pipe.setEquipmentGeometry(geometry);
    pipe.createSystem();
    pipe.init();
    return pipe;
  }

  static double[] filled(int n, double value) {
    double[] array = new double[n];
    Arrays.fill(array, value);
    return array;
  }

  static double outletPressure(FlowSystemInterface pipe) {
    return pipe.getNode(pipe.getTotalNumberOfNodes() - 1).getBulkSystem().getPressure();
  }

  @Benchmark
  public double singlePhaseGasPipelineSteadyState() {
    FlowSystemInterface pipe = gasExportPipeline();
    pipe.solveSteadyState(10);
    return outletPressure(pipe);
  }

  @Benchmark
  public double twoPhaseNonEquilibriumPipeSteadyState() {
    FlowSystemInterface pipe = twoPhaseNonEquilibriumPipe();
    pipe.solveSteadyState(2);
    return outletPressure(pipe);
  }
}
