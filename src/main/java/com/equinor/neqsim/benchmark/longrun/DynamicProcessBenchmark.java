package com.equinor.neqsim.benchmark.longrun;

import com.equinor.neqsim.benchmark.util.BenchmarkFluids;
import java.util.concurrent.TimeUnit;
import neqsim.process.controllerdevice.ControllerDeviceBaseClass;
import neqsim.process.controllerdevice.ControllerDeviceInterface;
import neqsim.process.equipment.separator.Separator;
import neqsim.process.equipment.stream.Stream;
import neqsim.process.equipment.valve.ThrottlingValve;
import neqsim.process.measurementdevice.LevelTransmitter;
import neqsim.process.measurementdevice.PressureTransmitter;
import neqsim.process.processmodel.ProcessSystem;
import neqsim.thermo.system.SystemInterface;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;

/**
 * Dynamic simulation of a two-stage separation process with level and pressure control.
 *
 * <p>
 * The 20-component SRK well fluid flows through an inlet valve into an HP separator and on to an LP separator. Each
 * separator has a PID level controller on its liquid valve and a PID pressure controller on its gas valve. After a
 * steady-state initialization, the feed rate is stepped up and down while the process is integrated with
 * {@link ProcessSystem#runTransient()}. One operation takes about one minute.
 * </p>
 *
 * <p>
 * Inspired by {@code ProcessSystemRunTransientTest.testDynamicCalculation2} in NeqSim.
 * </p>
 */
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(1)
@Warmup(iterations = 0)
@Measurement(iterations = 2)
public class DynamicProcessBenchmark {

  /** Transient time steps per operation. */
  public static final int TIME_STEPS = 3600;

  /** Time step in seconds. */
  public static final double TIME_STEP = 2.0;

  /** Integrates the controlled separation process through feed rate disturbances. */
  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  public double separationControlTransient() {
    return simulate(TIME_STEPS);
  }

  /**
   * Builds, initializes and integrates the controlled two-stage separation process.
   *
   * @param steps number of transient time steps
   * @return checksum of separator levels, pressures and valve openings
   */
  public static double simulate(int steps) {
    SystemInterface fluid = BenchmarkFluids.wellFluid(false);
    fluid.setMixingRule(2);

    double baseRate = 20000.0;
    Stream feed = new Stream("feed", fluid);
    feed.setFlowRate(baseRate, "kg/hr");
    feed.setTemperature(50.0, "C");
    feed.setPressure(80.0, "bara");

    ThrottlingValve inletValve = new ThrottlingValve("inlet valve", feed);
    inletValve.setOutletPressure(50.0);
    inletValve.setPercentValveOpening(50);
    inletValve.setCalculateSteadyState(false);

    Separator hpSeparator = new Separator("HP separator");
    hpSeparator.addStream(inletValve.getOutletStream());
    hpSeparator.setCalculateSteadyState(false);
    hpSeparator.setSeparatorLength(5.0);
    hpSeparator.setInternalDiameter(1.5);
    hpSeparator.setLiquidLevel(0.5);

    ThrottlingValve hpGasValve = new ThrottlingValve("HP gas valve", hpSeparator.getGasOutStream());
    hpGasValve.setOutletPressure(40.0);
    hpGasValve.setPercentValveOpening(30);
    hpGasValve.setCalculateSteadyState(false);
    hpGasValve.setMinimumValveOpening(1.0);

    ThrottlingValve hpLiquidValve = new ThrottlingValve("HP liquid valve", hpSeparator.getLiquidOutStream());
    hpLiquidValve.setOutletPressure(10.0);
    hpLiquidValve.setPercentValveOpening(30);
    hpLiquidValve.setCalculateSteadyState(false);
    hpLiquidValve.setMinimumValveOpening(1.0);

    Separator lpSeparator = new Separator("LP separator");
    lpSeparator.addStream(hpLiquidValve.getOutletStream());
    lpSeparator.setCalculateSteadyState(false);
    lpSeparator.setSeparatorLength(4.0);
    lpSeparator.setInternalDiameter(1.2);
    lpSeparator.setLiquidLevel(0.5);

    ThrottlingValve lpGasValve = new ThrottlingValve("LP gas valve", lpSeparator.getGasOutStream());
    lpGasValve.setOutletPressure(2.0);
    lpGasValve.setPercentValveOpening(30);
    lpGasValve.setCalculateSteadyState(false);
    lpGasValve.setMinimumValveOpening(1.0);

    ThrottlingValve lpLiquidValve = new ThrottlingValve("LP liquid valve", lpSeparator.getLiquidOutStream());
    lpLiquidValve.setOutletPressure(2.0);
    lpLiquidValve.setPercentValveOpening(30);
    lpLiquidValve.setCalculateSteadyState(false);
    lpLiquidValve.setMinimumValveOpening(1.0);

    LevelTransmitter hpLevel = new LevelTransmitter("HP level transmitter", hpSeparator);
    hpLevel.setMaximumValue(1.0);
    hpLevel.setMinimumValue(0.0);
    PressureTransmitter hpPressure = new PressureTransmitter(hpSeparator.getGasOutStream());
    hpPressure.setUnit("bar");
    hpPressure.setMaximumValue(80.0);
    hpPressure.setMinimumValue(1.0);
    LevelTransmitter lpLevel = new LevelTransmitter("LP level transmitter", lpSeparator);
    lpLevel.setMaximumValue(1.0);
    lpLevel.setMinimumValue(0.0);
    PressureTransmitter lpPressure = new PressureTransmitter(lpSeparator.getGasOutStream());
    lpPressure.setUnit("bar");
    lpPressure.setMaximumValue(20.0);
    lpPressure.setMinimumValue(1.0);

    hpLiquidValve.setController(controller(hpLevel, 0.5, 2.0, 500.0));
    hpGasValve.setController(controller(hpPressure, 50.0, 1.0, 100.0));
    lpLiquidValve.setController(controller(lpLevel, 0.5, 2.0, 500.0));
    lpGasValve.setController(controller(lpPressure, 10.0, 1.0, 100.0));

    ProcessSystem process = new ProcessSystem();
    process.add(feed);
    process.add(inletValve);
    process.add(hpSeparator);
    process.add(hpGasValve);
    process.add(hpLiquidValve);
    process.add(lpSeparator);
    process.add(lpGasValve);
    process.add(lpLiquidValve);
    process.add(hpLevel);
    process.add(hpPressure);
    process.add(lpLevel);
    process.add(lpPressure);
    process.run();

    process.setTimeStep(TIME_STEP);
    double checksum = 0.0;
    for (int step = 0; step < steps; step++) {
      int phase = 4 * step / steps;
      inletValve.setPercentValveOpening(phase == 1 ? 65.0 : phase == 3 ? 40.0 : 50.0);
      process.runTransient();
      checksum += hpSeparator.getLiquidLevel() + lpSeparator.getLiquidLevel();
    }
    return checksum + hpSeparator.getGasOutStream().getPressure("bara")
        + lpSeparator.getGasOutStream().getPressure("bara") + hpLiquidValve.getPercentValveOpening()
        + lpLiquidValve.getPercentValveOpening();
  }

  private static ControllerDeviceInterface controller(neqsim.process.measurementdevice.MeasurementDeviceInterface
      transmitter, double setPoint, double gain, double integralTime) {
    ControllerDeviceInterface controller = new ControllerDeviceBaseClass();
    controller.setReverseActing(false);
    controller.setTransmitter(transmitter);
    controller.setControllerSetPoint(setPoint);
    controller.setControllerParameters(gain, integralTime, 0.0);
    return controller;
  }
}
