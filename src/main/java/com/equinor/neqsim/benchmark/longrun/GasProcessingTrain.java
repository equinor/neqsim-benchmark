package com.equinor.neqsim.benchmark.longrun;

import neqsim.process.equipment.compressor.Compressor;
import neqsim.process.equipment.heatexchanger.Cooler;
import neqsim.process.equipment.mixer.Mixer;
import neqsim.process.equipment.separator.Separator;
import neqsim.process.equipment.stream.Stream;
import neqsim.process.equipment.util.Recycle;
import neqsim.process.equipment.valve.ThrottlingValve;
import neqsim.process.processmodel.ProcessSystem;
import neqsim.thermo.system.SystemInterface;

/**
 * Three-stage oil and gas separation with recompression, gas compression to export and two liquid recycles.
 *
 * <p>
 * Shared by {@link ProcessSimulationBenchmark} and {@link MlTrainingDataBenchmark}. Unit operations are reached by
 * name with {@link ProcessSystem#getUnit(String)}.
 * </p>
 */
public final class GasProcessingTrain {

  public static final String FEED = "well stream";
  public static final String HP_SEPARATOR = "HP separator";
  public static final String EXPORT_COMPRESSOR = "export compressor";
  public static final String EXPORT_GAS = "export gas";
  public static final String STABILIZED_OIL = "stabilized oil";
  public static final String MP_VALVE = "MP valve";
  public static final String LP_VALVE = "LP valve";
  public static final String GAS_COOLER = "export gas cooler";

  private GasProcessingTrain() {}

  /** Operating conditions of the train. */
  public static final class Conditions {
    public double feedRate = 10.0;
    public double feedTemperature = 70.0;
    public double hpPressure = 70.0;
    public double mpPressure = 20.0;
    public double lpPressure = 3.0;
    public double coolerTemperature = 30.0;
    public double exportPressure = 150.0;
  }

  /**
   * Builds the train for a feed fluid.
   *
   * @param feedFluid feed fluid, cloned by the builder
   * @param c operating conditions
   * @return unsolved process
   */
  public static ProcessSystem build(SystemInterface feedFluid, Conditions c) {
    ProcessSystem process = new ProcessSystem();

    Stream feed = new Stream(FEED, feedFluid.clone());
    feed.setFlowRate(c.feedRate, "MSm3/day");
    feed.setTemperature(c.feedTemperature, "C");
    feed.setPressure(c.hpPressure, "bara");
    process.add(feed);

    Stream hpRecycleStream = new Stream("HP liquid recycle", feedFluid.clone());
    hpRecycleStream.setFlowRate(10.0, "kg/hr");
    hpRecycleStream.setTemperature(c.coolerTemperature, "C");
    hpRecycleStream.setPressure(c.hpPressure, "bara");
    process.add(hpRecycleStream);

    Mixer hpMixer = new Mixer("HP mixer");
    hpMixer.addStream(feed);
    hpMixer.addStream(hpRecycleStream);
    process.add(hpMixer);

    Separator hpSeparator = new Separator(HP_SEPARATOR, hpMixer.getOutletStream());
    process.add(hpSeparator);

    ThrottlingValve mpValve = new ThrottlingValve(MP_VALVE, hpSeparator.getLiquidOutStream());
    mpValve.setOutletPressure(c.mpPressure, "bara");
    process.add(mpValve);

    Stream mpRecycleStream = new Stream("MP liquid recycle", feedFluid.clone());
    mpRecycleStream.setFlowRate(10.0, "kg/hr");
    mpRecycleStream.setTemperature(c.coolerTemperature, "C");
    mpRecycleStream.setPressure(c.mpPressure, "bara");
    process.add(mpRecycleStream);

    Mixer mpMixer = new Mixer("MP mixer");
    mpMixer.addStream(mpValve.getOutletStream());
    mpMixer.addStream(mpRecycleStream);
    process.add(mpMixer);

    Separator mpSeparator = new Separator("MP separator", mpMixer.getOutletStream());
    process.add(mpSeparator);

    ThrottlingValve lpValve = new ThrottlingValve(LP_VALVE, mpSeparator.getLiquidOutStream());
    lpValve.setOutletPressure(c.lpPressure, "bara");
    process.add(lpValve);

    Separator lpSeparator = new Separator("LP separator", lpValve.getOutletStream());
    process.add(lpSeparator);

    Stream oil = new Stream(STABILIZED_OIL, lpSeparator.getLiquidOutStream());
    process.add(oil);

    // LP gas recompression to MP pressure; scrubber liquid is recycled to the MP separator.
    Cooler lpCooler = new Cooler("LP gas cooler", lpSeparator.getGasOutStream());
    lpCooler.setOutTemperature(c.coolerTemperature, "C");
    process.add(lpCooler);

    Separator lpScrubber = new Separator("LP scrubber", lpCooler.getOutletStream());
    process.add(lpScrubber);

    Compressor lpCompressor = new Compressor("LP compressor", lpScrubber.getGasOutStream());
    lpCompressor.setOutletPressure(c.mpPressure, "bara");
    lpCompressor.setUsePolytropicCalc(true);
    lpCompressor.setPolytropicEfficiency(0.75);
    process.add(lpCompressor);

    ThrottlingValve lpScrubberValve = new ThrottlingValve("LP scrubber liquid pump", lpScrubber.getLiquidOutStream());
    lpScrubberValve.setOutletPressure(c.mpPressure, "bara");
    process.add(lpScrubberValve);

    Mixer mpGasMixer = new Mixer("MP gas mixer");
    mpGasMixer.addStream(lpCompressor.getOutletStream());
    mpGasMixer.addStream(mpSeparator.getGasOutStream());
    process.add(mpGasMixer);

    Cooler mpCooler = new Cooler("MP gas cooler", mpGasMixer.getOutletStream());
    mpCooler.setOutTemperature(c.coolerTemperature, "C");
    process.add(mpCooler);

    Separator mpScrubber = new Separator("MP scrubber", mpCooler.getOutletStream());
    process.add(mpScrubber);

    Mixer mpLiquidMixer = new Mixer("MP scrubber liquid mixer");
    mpLiquidMixer.addStream(lpScrubberValve.getOutletStream());
    mpLiquidMixer.addStream(mpScrubber.getLiquidOutStream());
    process.add(mpLiquidMixer);

    Recycle mpRecycle = new Recycle("MP liquid recycle loop");
    mpRecycle.addStream(mpLiquidMixer.getOutletStream());
    mpRecycle.setOutletStream(mpRecycleStream);
    mpRecycle.setTolerance(1e-2);
    process.add(mpRecycle);

    Compressor mpCompressor = new Compressor("MP compressor", mpScrubber.getGasOutStream());
    mpCompressor.setOutletPressure(c.hpPressure, "bara");
    mpCompressor.setUsePolytropicCalc(true);
    mpCompressor.setPolytropicEfficiency(0.75);
    process.add(mpCompressor);

    // HP gas compression to export; scrubber liquid is recycled to the HP separator.
    Mixer hpGasMixer = new Mixer("HP gas mixer");
    hpGasMixer.addStream(hpSeparator.getGasOutStream());
    hpGasMixer.addStream(mpCompressor.getOutletStream());
    process.add(hpGasMixer);

    Cooler hpCooler = new Cooler("HP gas cooler", hpGasMixer.getOutletStream());
    hpCooler.setOutTemperature(c.coolerTemperature, "C");
    process.add(hpCooler);

    Separator hpScrubber = new Separator("HP scrubber", hpCooler.getOutletStream());
    process.add(hpScrubber);

    Recycle hpRecycle = new Recycle("HP liquid recycle loop");
    hpRecycle.addStream(hpScrubber.getLiquidOutStream());
    hpRecycle.setOutletStream(hpRecycleStream);
    hpRecycle.setTolerance(1e-2);
    process.add(hpRecycle);

    Compressor exportCompressor = new Compressor(EXPORT_COMPRESSOR, hpScrubber.getGasOutStream());
    exportCompressor.setOutletPressure(c.exportPressure, "bara");
    exportCompressor.setUsePolytropicCalc(true);
    exportCompressor.setPolytropicEfficiency(0.78);
    process.add(exportCompressor);

    Cooler exportCooler = new Cooler(GAS_COOLER, exportCompressor.getOutletStream());
    exportCooler.setOutTemperature(c.coolerTemperature + 10.0, "C");
    process.add(exportCooler);

    Stream exportGas = new Stream(EXPORT_GAS, exportCooler.getOutletStream());
    process.add(exportGas);
    return process;
  }

  /** Export gas flow plus stabilized oil flow and compressor power, as a result checksum. */
  public static double checksum(ProcessSystem process) {
    return ((Stream) process.getUnit(EXPORT_GAS)).getFlowRate("MSm3/day")
        + ((Stream) process.getUnit(STABILIZED_OIL)).getFlowRate("m3/hr")
        + ((Compressor) process.getUnit(EXPORT_COMPRESSOR)).getPower("MW");
  }
}
