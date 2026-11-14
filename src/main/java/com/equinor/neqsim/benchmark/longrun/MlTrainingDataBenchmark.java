package com.equinor.neqsim.benchmark.longrun;

import com.equinor.neqsim.benchmark.util.BenchmarkFluids;
import java.util.SplittableRandom;
import java.util.concurrent.TimeUnit;
import neqsim.process.equipment.compressor.Compressor;
import neqsim.process.equipment.heatexchanger.Cooler;
import neqsim.process.equipment.separator.Separator;
import neqsim.process.equipment.stream.Stream;
import neqsim.process.equipment.valve.ThrottlingValve;
import neqsim.process.ml.TrainingDataCollector;
import neqsim.process.processmodel.ProcessSystem;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;

/**
 * Generation of a training data set for a machine-learning surrogate of a process.
 *
 * <p>
 * The {@link GasProcessingTrain} on the 20-component Peng-Robinson well fluid is built once and then re-solved for a
 * large number of randomly sampled (fixed seed) operating points: feed rate, feed temperature, separator pressures,
 * cooler temperature and export pressure. Inputs and process responses are recorded with NeqSim's
 * {@link TrainingDataCollector} and exported as CSV. One operation takes about five minutes.
 * </p>
 */
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(1)
@Warmup(iterations = 0)
@Measurement(iterations = 2)
public class MlTrainingDataBenchmark {

  /** Number of samples per operation. */
  public static final int SAMPLES = 700;

  /** Generates the surrogate training data set. */
  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  public double processSurrogateDataset() {
    return generate(SAMPLES);
  }

  /**
   * Re-solves the process for sampled operating points and records the results.
   *
   * @param samples number of samples
   * @return CSV length plus the sum of the recorded export gas flows
   */
  public static double generate(int samples) {
    GasProcessingTrain.Conditions base = new GasProcessingTrain.Conditions();
    ProcessSystem process = GasProcessingTrain.build(BenchmarkFluids.wellFluid(true), base);
    process.run();

    Stream feed = (Stream) process.getUnit(GasProcessingTrain.FEED);
    ThrottlingValve mpValve = (ThrottlingValve) process.getUnit(GasProcessingTrain.MP_VALVE);
    ThrottlingValve lpValve = (ThrottlingValve) process.getUnit(GasProcessingTrain.LP_VALVE);
    Cooler gasCooler = (Cooler) process.getUnit(GasProcessingTrain.GAS_COOLER);
    Compressor exportCompressor = (Compressor) process.getUnit(GasProcessingTrain.EXPORT_COMPRESSOR);
    Separator hpSeparator = (Separator) process.getUnit(GasProcessingTrain.HP_SEPARATOR);
    Stream exportGas = (Stream) process.getUnit(GasProcessingTrain.EXPORT_GAS);
    Stream oil = (Stream) process.getUnit(GasProcessingTrain.STABILIZED_OIL);

    TrainingDataCollector collector = new TrainingDataCollector("gas processing surrogate");
    collector.defineInput("feed_rate", "MSm3/day", 6.0, 14.0);
    collector.defineInput("feed_temperature", "C", 40.0, 90.0);
    collector.defineInput("mp_pressure", "bara", 12.0, 30.0);
    collector.defineInput("lp_pressure", "bara", 1.5, 6.0);
    collector.defineInput("export_cooler_temperature", "C", 25.0, 50.0);
    collector.defineInput("export_pressure", "bara", 120.0, 180.0);
    collector.defineOutput("export_gas_rate", "MSm3/day", 0.0, 20.0);
    collector.defineOutput("export_compressor_power", "MW", 0.0, 50.0);
    collector.defineOutput("oil_rate", "m3/hr", 0.0, 500.0);
    collector.defineOutput("oil_density", "kg/m3", 500.0, 1000.0);
    collector.defineOutput("hp_gas_rate", "MSm3/day", 0.0, 20.0);
    collector.defineOutput("export_gas_molar_mass", "kg/mol", 0.0, 0.1);

    SplittableRandom random = new SplittableRandom(42);
    double exportSum = 0.0;
    for (int i = 0; i < samples; i++) {
      double feedRate = 6.0 + 8.0 * random.nextDouble();
      double feedTemperature = 40.0 + 50.0 * random.nextDouble();
      double mpPressure = 12.0 + 18.0 * random.nextDouble();
      double lpPressure = 1.5 + 4.5 * random.nextDouble();
      double coolerTemperature = 25.0 + 25.0 * random.nextDouble();
      double exportPressure = 120.0 + 60.0 * random.nextDouble();

      feed.setFlowRate(feedRate, "MSm3/day");
      feed.setTemperature(feedTemperature, "C");
      mpValve.setOutletPressure(mpPressure, "bara");
      lpValve.setOutletPressure(lpPressure, "bara");
      gasCooler.setOutTemperature(coolerTemperature, "C");
      exportCompressor.setOutletPressure(exportPressure, "bara");
      process.run();

      collector.startSample();
      collector.recordInput("feed_rate", feedRate);
      collector.recordInput("feed_temperature", feedTemperature);
      collector.recordInput("mp_pressure", mpPressure);
      collector.recordInput("lp_pressure", lpPressure);
      collector.recordInput("export_cooler_temperature", coolerTemperature);
      collector.recordInput("export_pressure", exportPressure);
      double exportRate = exportGas.getFlowRate("MSm3/day");
      collector.recordOutput("export_gas_rate", exportRate);
      collector.recordOutput("export_compressor_power", exportCompressor.getPower("MW"));
      collector.recordOutput("oil_rate", oil.getFlowRate("m3/hr"));
      collector.recordOutput("oil_density", oil.getFluid().getDensity("kg/m3"));
      collector.recordOutput("hp_gas_rate", hpSeparator.getGasOutStream().getFlowRate("MSm3/day"));
      collector.recordOutput("export_gas_molar_mass", exportGas.getFluid().getMolarMass());
      collector.endSample();
      exportSum += exportRate;
    }
    return collector.toCSV().length() + exportSum;
  }
}
