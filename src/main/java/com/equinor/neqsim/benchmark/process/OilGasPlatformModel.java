package com.equinor.neqsim.benchmark.process;

import neqsim.process.equipment.compressor.Compressor;
import neqsim.process.equipment.distillation.DistillationColumn;
import neqsim.process.equipment.expander.Expander;
import neqsim.process.equipment.filter.Filter;
import neqsim.process.equipment.heatexchanger.Cooler;
import neqsim.process.equipment.heatexchanger.Heater;
import neqsim.process.equipment.mixer.Mixer;
import neqsim.process.equipment.pipeline.PipeBeggsAndBrills;
import neqsim.process.equipment.pump.Pump;
import neqsim.process.equipment.separator.Separator;
import neqsim.process.equipment.separator.ThreePhaseSeparator;
import neqsim.process.equipment.splitter.Splitter;
import neqsim.process.equipment.stream.EnergyStream;
import neqsim.process.equipment.stream.Stream;
import neqsim.process.equipment.stream.StreamInterface;
import neqsim.process.equipment.util.Recycle;
import neqsim.process.equipment.valve.ThrottlingValve;
import neqsim.process.measurementdevice.HydrocarbonDewPointAnalyser;
import neqsim.process.measurementdevice.WaterDewPointAnalyser;
import neqsim.process.processmodel.ProcessModel;
import neqsim.process.processmodel.ProcessSystem;
import neqsim.thermo.system.SystemInterface;

/**
 * Large offshore oil and gas platform model used to get broad code coverage in a single benchmark.
 *
 * <p>
 * Ported from {@code LargeCombinedModelsTest} (tagged {@code slow}) in NeqSim and extended with oil
 * export, produced water handling and a gas export pipeline. The {@link ProcessModel} contains:
 * </p>
 * <ul>
 * <li>HP/LP wells and manifolds splitting into two parallel trains</li>
 * <li>Two four-stage three-phase separation trains with recompression and three liquid recycles</li>
 * <li>Two dew point control / turboexpander / NGL stabilizer column units</li>
 * <li>Two export compressor trains with speed-dependent compressor charts</li>
 * <li>Oil export pumping, produced water degassing, gas export pipeline with dew point analysers</li>
 * </ul>
 * <p>
 * The fluid is a 16-component Peng-Robinson oil read from an Eclipse E300 file.
 * </p>
 */
public final class OilGasPlatformModel {

  /** Operating conditions of the platform. */
  public static class Input {
    public double flowFirstStage = 30.0;
    public double flowSecondStage = 4.0;
    public double firstStagePressure = 62.0;
    public double firstStageTemperature = 50.0;
    public double gasCoolerTemperature = 28.0;
    public double secondStagePressure = 20.0;
    public double secondStageTemperature = 65.0;
    public double thirdStagePressure = 7.0;
    public double fourthStagePressure = 3.0;
    public double exportOilTemperature = 20.0;
    public double exportOilPressure = 20.8;
    public double dewPointScrubberTemperature = 24.0;
    public double dewPointScrubberPressure = 60.6;
    public double inletTexTemperature = -24.0;
    public double inletTexPressure = 59.6;
    public double outletTexPressure = 42.5;
    public double preFlashTemperature = -10.0;
    public double preFlashPressure = 20.0;
    public double nglColumnTopPressure = 7.3;
    public double nglColumnBottomPressure = 7.3;
    public double nglColumnBottomTemperature = 45.0;
    public double nglRoutingToOil = 0.9999;
    public double speed27831DXCompressor = 6100.0;
    public double speed27841DXCompressor = 6100.0;
    public double oilExportPumpPressure = 60.0;
    public double exportPipelineLength = 40000.0;
    public double exportPipelineDiameter = 0.9;
  }

  public static final String WELLS = "well and manifold process";
  public static final String TRAIN_A = "separation train A";
  public static final String TRAIN_B = "separation train B";
  public static final String EXPANDER_A = "expander process A";
  public static final String EXPANDER_B = "expander process B";
  public static final String COMPRESSOR_A = "compressor process A";
  public static final String COMPRESSOR_B = "compressor process B";
  public static final String EXPORT = "export and utilities";

  private final Input inp;

  private OilGasPlatformModel(Input input) {
    this.inp = input;
  }

  /** Builds the full platform model with default operating conditions. */
  public static ProcessModel build(SystemInterface wellFluid) {
    return build(wellFluid, new Input());
  }

  /** Builds the full platform model. */
  public static ProcessModel build(SystemInterface wellFluid, Input input) {
    OilGasPlatformModel builder = new OilGasPlatformModel(input);
    ProcessSystem wells = builder.wellsAndManifolds(wellFluid);

    ProcessSystem trainA = builder.separationTrain(((Splitter) wells.getUnit("HP manifold")).getSplitStream(0),
        ((Splitter) wells.getUnit("LP manifold")).getSplitStream(0));
    ProcessSystem trainB = builder.separationTrain(((Splitter) wells.getUnit("HP manifold")).getSplitStream(1),
        ((Splitter) wells.getUnit("LP manifold")).getSplitStream(1));

    ProcessSystem expanderA = builder.expanderAndNglUnit(trainA);
    ProcessSystem expanderB = builder.expanderAndNglUnit(trainB);

    ProcessSystem compressorA = builder.exportCompressorTrain(
        ((ThrottlingValve) expanderA.getUnit("gas split valve")).getOutletStream());
    ProcessSystem compressorB = builder.exportCompressorTrain(
        ((ThrottlingValve) expanderB.getUnit("gas split valve")).getOutletStream());

    ProcessSystem export = builder.exportAndUtilities(trainA, trainB, expanderA, expanderB, compressorA, compressorB);

    ProcessModel model = new ProcessModel();
    model.add(WELLS, wells);
    model.add(TRAIN_A, trainA);
    model.add(TRAIN_B, trainB);
    model.add(EXPANDER_A, expanderA);
    model.add(EXPANDER_B, expanderB);
    model.add(COMPRESSOR_A, compressorA);
    model.add(COMPRESSOR_B, compressorB);
    model.add(EXPORT, export);
    return model;
  }

  ProcessSystem wellsAndManifolds(SystemInterface feedFluid) {
    ProcessSystem process = new ProcessSystem();

    Stream wellStreamHP = new Stream("HP well stream", feedFluid.clone());
    wellStreamHP.setPressure(inp.firstStagePressure, "bara");
    wellStreamHP.setTemperature(inp.firstStageTemperature, "C");
    wellStreamHP.setFlowRate(inp.flowFirstStage, "MSm3/day");
    process.add(wellStreamHP);

    Stream wellStreamLP = new Stream("LP well stream", feedFluid.clone());
    wellStreamLP.setPressure(inp.firstStagePressure, "bara");
    wellStreamLP.setTemperature(inp.firstStageTemperature, "C");
    wellStreamLP.setFlowRate(inp.flowSecondStage, "MSm3/day");
    process.add(wellStreamLP);

    Splitter hpManifold = new Splitter("HP manifold", wellStreamHP, 2);
    hpManifold.setSplitFactors(new double[] {0.4, 0.6});
    process.add(hpManifold);

    Splitter lpManifold = new Splitter("LP manifold", wellStreamLP, 2);
    lpManifold.setSplitFactors(new double[] {0.5, 0.5});
    process.add(lpManifold);

    return process;
  }

  ProcessSystem separationTrain(StreamInterface firstStageStream, StreamInterface secondStageStream) {
    ProcessSystem process = new ProcessSystem();

    Heater feedTPsetterFirstStage = new Heater("feed TP setter", firstStageStream);
    feedTPsetterFirstStage.setOutPressure(inp.firstStagePressure, "bara");
    feedTPsetterFirstStage.setOutTemperature(inp.firstStageTemperature, "C");

    ThreePhaseSeparator firstStageSeparator = new ThreePhaseSeparator("1st stage separator",
        feedTPsetterFirstStage.getOutletStream());

    ThrottlingValve oilValve1 = new ThrottlingValve("oil depres valve", firstStageSeparator.getOilOutStream());
    oilValve1.setOutletPressure(inp.secondStagePressure, "bara");

    Stream oilFirstStage = new Stream("first stage oil reflux", firstStageStream.getFluid().clone());
    oilFirstStage.setFlowRate(10.0, "kg/hr");
    oilFirstStage.setPressure(inp.secondStagePressure, "bara");
    oilFirstStage.setTemperature(inp.gasCoolerTemperature, "C");

    Mixer oilFirstStageMixer = new Mixer("first stage oil mixer");
    oilFirstStageMixer.addStream(oilValve1.getOutletStream());
    oilFirstStageMixer.addStream(oilFirstStage);

    Heater oilHeaterFromFirstStage = new Heater("oil heater second stage", oilFirstStageMixer.getOutletStream());
    oilHeaterFromFirstStage.setOutTemperature(inp.secondStageTemperature, "C");

    Heater tempPresControlLPstream = new Heater("LP stream temp controller", secondStageStream);
    tempPresControlLPstream.setOutPressure(inp.secondStagePressure, "bara");
    tempPresControlLPstream.setOutTemperature(inp.secondStageTemperature, "C");

    ThreePhaseSeparator secondStageSeparator = new ThreePhaseSeparator("2nd stage separator",
        oilHeaterFromFirstStage.getOutletStream());
    secondStageSeparator.addStream(tempPresControlLPstream.getOutletStream());

    Stream oilSecondStage = new Stream("second stage oil reflux", firstStageStream.getFluid().clone());
    oilSecondStage.setFlowRate(10.0, "kg/hr");
    oilSecondStage.setPressure(inp.thirdStagePressure, "bara");
    oilSecondStage.setTemperature(inp.gasCoolerTemperature, "C");

    ThrottlingValve valveOilFromSecondStage = new ThrottlingValve("valve oil from second stage",
        secondStageSeparator.getOilOutStream());
    valveOilFromSecondStage.setOutletPressure(inp.thirdStagePressure, "bara");

    Mixer oilSecondStageMixer = new Mixer("seccond stage oil mixer");
    oilSecondStageMixer.addStream(valveOilFromSecondStage.getOutletStream());
    oilSecondStageMixer.addStream(oilSecondStage);

    ThreePhaseSeparator thirdStageSeparator = new ThreePhaseSeparator("3rd stage separator",
        oilSecondStageMixer.getOutletStream());

    ThrottlingValve valveOilFromThirdStage = new ThrottlingValve("valve oil from third stage",
        thirdStageSeparator.getOilOutStream());
    valveOilFromThirdStage.setOutletPressure(inp.fourthStagePressure, "bara");

    Stream oilThirdStage = new Stream("third stage oil reflux", firstStageStream.getFluid().clone());
    oilThirdStage.setFlowRate(10.0, "kg/hr");
    oilThirdStage.setPressure(inp.fourthStagePressure, "bara");
    oilThirdStage.setTemperature(inp.gasCoolerTemperature, "C");

    Mixer oilThirdStageMixer = new Mixer("third stage oil mixer");
    oilThirdStageMixer.addStream(valveOilFromThirdStage.getOutletStream());
    oilThirdStageMixer.addStream(oilThirdStage);

    ThreePhaseSeparator fourthStageSeparator = new ThreePhaseSeparator("4th stage separator",
        oilThirdStageMixer.getOutletStream());

    Cooler firstStageCooler = new Cooler("1st stage cooler", fourthStageSeparator.getGasOutStream());
    firstStageCooler.setOutTemperature(inp.gasCoolerTemperature, "C");

    Separator firstStageScrubber = new Separator("1st stage scrubber", firstStageCooler.getOutletStream());

    Pump firstStageScrubberPump = new Pump("1st stage scrubber pump", firstStageScrubber.getLiquidOutStream());
    firstStageScrubberPump.setOutletPressure(inp.thirdStagePressure);

    Compressor firstStageCompressor = new Compressor("1st stage compressor", firstStageScrubber.getGasOutStream());
    firstStageCompressor.setOutletPressure(inp.thirdStagePressure, "bara");
    firstStageCompressor.setUsePolytropicCalc(true);
    firstStageCompressor.setPolytropicEfficiency(0.8);

    Mixer firstStageGasMixer = new Mixer("first stage mixer");
    firstStageGasMixer.addStream(firstStageCompressor.getOutletStream());
    firstStageGasMixer.addStream(thirdStageSeparator.getGasOutStream());

    Cooler firstStageCooler2 = new Cooler("1st stage cooler2", firstStageGasMixer.getOutletStream());
    firstStageCooler2.setOutTemperature(inp.gasCoolerTemperature, "C");

    Separator firstStageScrubber2 = new Separator("1st stage scrubber2", firstStageCooler2.getOutletStream());

    Compressor secondStageCompressor = new Compressor("2nd stage compressor", firstStageScrubber2.getGasOutStream());
    secondStageCompressor.setUsePolytropicCalc(true);
    secondStageCompressor.setPolytropicEfficiency(0.8);
    secondStageCompressor.setOutletPressure(inp.secondStagePressure, "bara");

    Mixer secondStageGasMixer = new Mixer("second Stage mixer");
    secondStageGasMixer.addStream(secondStageCompressor.getOutletStream());
    secondStageGasMixer.addStream(secondStageSeparator.getGasOutStream());

    Cooler secondStageCooler = new Cooler("2nd stage cooler", secondStageGasMixer.getOutletStream());
    secondStageCooler.setOutTemperature(inp.gasCoolerTemperature, "C");

    Separator secondStageScrubber = new Separator("2nd stage scrubber", secondStageCooler.getOutletStream());

    Compressor thirdStageCompressor = new Compressor("3rd stage compressor", secondStageScrubber.getGasOutStream());
    thirdStageCompressor.setUsePolytropicCalc(true);
    thirdStageCompressor.setPolytropicEfficiency(0.8);
    thirdStageCompressor.setOutletPressure(inp.firstStagePressure, "bara");

    Mixer richGasMixer = new Mixer("fourth Stage mixer");
    richGasMixer.addStream(thirdStageCompressor.getOutletStream());
    richGasMixer.addStream(firstStageSeparator.getGasOutStream());

    Cooler dewPointControlCooler = new Cooler("dew point cooler", richGasMixer.getOutletStream());
    dewPointControlCooler.setOutTemperature(inp.dewPointScrubberTemperature, "C");
    dewPointControlCooler.setOutPressure(inp.dewPointScrubberPressure, "bara");

    Separator dewPointScrubber = new Separator("dew point scrubber", dewPointControlCooler.getOutletStream());

    Cooler dewPointControlCooler2 = new Cooler("dew point cooler 2", dewPointScrubber.getGasOutStream());
    dewPointControlCooler2.setOutTemperature(inp.inletTexTemperature, "C");
    dewPointControlCooler2.setOutPressure(inp.inletTexPressure, "bara");

    Separator dewPointScrubber2 = new Separator("dew point scrubber 2", dewPointControlCooler2.getOutletStream());

    Mixer hpLiqMixer = new Mixer("HP liq gas mixer");
    hpLiqMixer.addStream(dewPointScrubber.getLiquidOutStream());

    Mixer mpLiqMixer = new Mixer("MP liq gas mixer");
    mpLiqMixer.addStream(secondStageScrubber.getLiquidOutStream());

    Mixer lpLiqMixer = new Mixer("LP liq gas mixer");
    lpLiqMixer.addStream(firstStageScrubberPump.getOutletStream());
    lpLiqMixer.addStream(firstStageScrubber2.getLiquidOutStream());

    Recycle hpRecycle = new Recycle("HP liq resycle");
    hpRecycle.addStream(hpLiqMixer.getOutletStream());
    hpRecycle.setOutletStream(oilFirstStage);
    hpRecycle.setTolerance(1e-1);

    Recycle mpRecycle = new Recycle("MP liq resycle");
    mpRecycle.addStream(mpLiqMixer.getOutletStream());
    mpRecycle.setOutletStream(oilSecondStage);
    mpRecycle.setTolerance(1e-1);

    Recycle lpRecycle = new Recycle("LP liq resycle");
    lpRecycle.addStream(lpLiqMixer.getOutletStream());
    lpRecycle.setOutletStream(oilThirdStage);
    lpRecycle.setTolerance(1e-1);

    Stream exportOil = new Stream("export oil", fourthStageSeparator.getOilOutStream());

    process.add(feedTPsetterFirstStage);
    process.add(firstStageSeparator);
    process.add(oilValve1);
    process.add(oilFirstStage);
    process.add(oilFirstStageMixer);
    process.add(oilHeaterFromFirstStage);
    process.add(tempPresControlLPstream);
    process.add(secondStageSeparator);
    process.add(oilSecondStage);
    process.add(valveOilFromSecondStage);
    process.add(oilSecondStageMixer);
    process.add(thirdStageSeparator);
    process.add(valveOilFromThirdStage);
    process.add(oilThirdStage);
    process.add(oilThirdStageMixer);
    process.add(fourthStageSeparator);
    process.add(firstStageCooler);
    process.add(firstStageScrubber);
    process.add(firstStageScrubberPump);
    process.add(firstStageCompressor);
    process.add(firstStageGasMixer);
    process.add(firstStageCooler2);
    process.add(firstStageScrubber2);
    process.add(secondStageCompressor);
    process.add(secondStageGasMixer);
    process.add(secondStageCooler);
    process.add(secondStageScrubber);
    process.add(thirdStageCompressor);
    process.add(richGasMixer);
    process.add(dewPointControlCooler);
    process.add(dewPointScrubber);
    process.add(dewPointControlCooler2);
    process.add(dewPointScrubber2);
    process.add(hpLiqMixer);
    process.add(mpLiqMixer);
    process.add(lpLiqMixer);
    process.add(hpRecycle);
    process.add(mpRecycle);
    process.add(lpRecycle);
    process.add(exportOil);
    return process;
  }

  ProcessSystem expanderAndNglUnit(ProcessSystem train) {
    Separator dewPointScrubber2 = (Separator) train.getUnit("dew point scrubber 2");
    ThreePhaseSeparator fourthStageSeparator = (ThreePhaseSeparator) train.getUnit("4th stage separator");
    Mixer secondStageGasMixer = (Mixer) train.getUnit("second Stage mixer");
    Mixer firstStageGasMixer = (Mixer) train.getUnit("first stage mixer");
    Mixer mpLiqMixer = (Mixer) train.getUnit("MP liq gas mixer");

    ProcessSystem process = new ProcessSystem();

    EnergyStream expanderEnergyStream = new EnergyStream("expander energy");

    Expander turboExpander = new Expander("TEX", dewPointScrubber2.getGasOutStream());
    turboExpander.setPolytropicEfficiency(0.75);
    turboExpander.setUsePolytropicCalc(true);
    turboExpander.setOutletPressure(inp.outletTexPressure, "bara");
    turboExpander.setEnergyStream(expanderEnergyStream);
    process.add(turboExpander);

    Separator texScrubber = new Separator("TEX LT scrubber", turboExpander.getOutletStream());
    process.add(texScrubber);

    Mixer nglPreMixer = new Mixer("NGL pre mixer");
    nglPreMixer.addStream(texScrubber.getLiquidOutStream());
    nglPreMixer.addStream(dewPointScrubber2.getLiquidOutStream());
    process.add(nglPreMixer);

    Heater nglPreflashHeater = new Heater("NGL preflash heater", nglPreMixer.getOutletStream());
    nglPreflashHeater.setOutTemperature(inp.preFlashTemperature, "C");
    nglPreflashHeater.setOutPressure(inp.preFlashPressure, "bara");
    process.add(nglPreflashHeater);

    Separator nglPreflashSeparator = new Separator("NGL pre flash separator", nglPreflashHeater.getOutletStream());
    process.add(nglPreflashSeparator);

    ThrottlingValve nglFeedValve = new ThrottlingValve("NGL column feed valve",
        nglPreflashSeparator.getLiquidOutStream());
    nglFeedValve.setOutletPressure(inp.nglColumnTopPressure, "bara");
    process.add(nglFeedValve);

    DistillationColumn nglColumn = new DistillationColumn("NGL column", 5, true, false);
    nglColumn.setTemperatureTolerance(2.5e-1);
    nglColumn.setMassBalanceTolerance(1.0);
    nglColumn.setEnthalpyBalanceTolerance(1.0);
    nglColumn.addFeedStream(nglFeedValve.getOutletStream(), 5);
    nglColumn.getReboiler().setOutletTemperature(273.15 + inp.nglColumnBottomTemperature);
    nglColumn.setTopPressure(inp.nglColumnTopPressure);
    nglColumn.setBottomPressure(inp.nglColumnBottomPressure);
    process.add(nglColumn);

    firstStageGasMixer.addStream(nglColumn.getGasOutStream());
    secondStageGasMixer.addStream(nglPreflashSeparator.getGasOutStream());

    Splitter nglSplitter = new Splitter("NGL splitter", nglColumn.getLiquidOutStream(), 2);
    nglSplitter.setSplitFactors(new double[] {inp.nglRoutingToOil, 1.0 - inp.nglRoutingToOil});
    process.add(nglSplitter);

    Mixer nglLiqMixer = new Mixer("NGL mixer");
    nglLiqMixer.addStream(fourthStageSeparator.getOilOutStream());
    nglLiqMixer.addStream(nglSplitter.getSplitStream(0));
    mpLiqMixer.addStream(nglSplitter.getSplitStream(1));
    process.add(nglLiqMixer);

    Heater exportOilCooler = new Heater("export oil cooler", nglLiqMixer.getOutletStream());
    exportOilCooler.setOutTemperature(inp.exportOilTemperature, "C");
    exportOilCooler.setOutPressure(inp.exportOilPressure, "bara");
    process.add(exportOilCooler);

    Stream exportOil = new Stream("export oil", exportOilCooler.getOutletStream());
    process.add(exportOil);

    Heater preheater = new Heater("compresor pre heater", texScrubber.getGasOutStream());
    preheater.setOutTemperature(15.0, "C");
    process.add(preheater);

    Compressor texCompressor = new Compressor("comp_KX25831", preheater.getOutletStream());
    texCompressor.setUsePolytropicCalc(true);
    texCompressor.setPolytropicEfficiency(0.75);
    texCompressor.setEnergyStream(expanderEnergyStream);
    texCompressor.setCalcPressureOut(true);
    process.add(texCompressor);

    ThrottlingValve gasSplitValve = new ThrottlingValve("gas split valve", texCompressor.getOutletStream());
    gasSplitValve.setDeltaPressure(1.0, "bara");
    process.add(gasSplitValve);

    return process;
  }

  ProcessSystem exportCompressorTrain(StreamInterface feedStream) {
    ProcessSystem process = new ProcessSystem();

    Filter inletFilter = new Filter("export compressor inlet filter", feedStream);
    inletFilter.setDeltaP(1.0, "bara");
    process.add(inletFilter);

    double[] chartConditions = {};
    double[] speed = {6056, 6922, 7788, 8452, 8653, 9062};
    double[][] flow = {{5142.0765, 6978.1421, 8087.4317, 9120.2186}, {5848.6679, 7627.7535, 9001.4248, 10434.2025},
        {6663.9168, 6684.2612, 8968.5565, 10866.4216, 12176.113}, {7842.1913, 9985.0959, 11963.8853, 13415.3073},
        {8288.4078, 9986.9093, 12007.0675, 13862.3171}, {8736.8911, 11001.182, 12657.5213, 14593.6951}};
    double[][] head = {{63.51995404800001, 59.95565633700001, 52.876617111, 42.72948567000001},
        {82.842135201, 77.94996177600001, 69.992872614, 55.8786330900000},
        {106.11871754400002, 106.557742512, 99.451383417, 84.443210586, 63.7378782930000},
        {124.987260753, 118.76466984300001, 103.75395524100001, 83.483835750000},
        {129.36988610100002, 125.79923445300001, 114.30453176100002, 90.94408372800001},
        {142.54571770200002, 136.319314626, 126.15502941900002, 102.7920396150000}};
    double[][] flowPolyEff = {{5142.0765, 6978.1421, 8087.4317, 9120.2186},
        {5868.8525, 7743.1694, 8508.1967, 9273.224, 10459.0164},
        {6748.6339, 9005.4645, 10114.7541, 10918.0328, 12161.2022},
        {7896.1749, 10650.2732, 11568.306, 12065.5738, 13404.3716},
        {8278.6885, 10956.2842, 11912.5683, 12486.3388, 13863.388},
        {8775.9563, 10803.2787, 11989.071, 12868.8525, 14551.9126}};
    double[][] polyEff = {{75.6796, 79.4536, 76.4411, 65.3459}, {75.2319, 79.0048, 78.556, 75.9795, 64.8797},
        {75.6307, 79.8175, 78.9327, 75.0785, 59.7215}, {76.0214, 78.9164, 78.0374, 75.0436, 63.088},
        {75.5842, 78.9071, 78.027, 75.0308, 64.7762}, {75.9947, 78.4862, 79.7268, 76.7213, 65.6063}};
    double[] surgeFlow = {5588.855374539698, 5600, 5626.89941, 5826.08345, 6025.26749, 6224.45153, 6423.63557,
        6622.8196100000005, 6822.003650000001, 7021.18769, 7220.37173, 7419.55577, 7618.73981, 7817.92385, 8017.10789,
        8216.29193, 8415.47597, 8614.66001, 8813.84405, 9013.02809, 9212.21213, 9411.39617, 9546.675330043363};
    double[] surgeHead = {42.72948567000001, 62.60864535225944, 63.51995404800001, 68.29121833446465, 73.06248262092927,
        77.8337469073939, 82.60501119385853, 87.7551980890982, 92.92520167324781, 98.09520525739738, 103.26520884154696,
        107.41797208771176, 110.31767659420001, 113.21738110068823, 116.11708560717645, 119.01679011366468,
        121.9164946201529, 124.81619912664114, 126.6608293908074, 128.43931588909822, 131.9061592019831,
        137.22593845199154, 140.8389551804265};
    double[] chokeFlow = {9136.016, 10434.202, 12176.113, 13415.308, 13862.317, 14593.695, 12657.521, 11001.182,
        8736.891};
    double[] chokeHead = {42.729485, 55.87863, 63.737877, 83.48383, 90.944084, 102.79204, 126.15503, 136.31932,
        142.54572};

    Compressor firstCompressor = new Compressor("KA27831", inletFilter.getOutletStream());
    firstCompressor.setUsePolytropicCalc(true);
    firstCompressor.setSpeed(inp.speed27831DXCompressor);
    firstCompressor.setUseGERG2008(false);
    firstCompressor.getCompressorChart().setCurves(chartConditions, speed, flow, head, flowPolyEff, polyEff);
    firstCompressor.getCompressorChart().setHeadUnit("kJ/kg");
    firstCompressor.getCompressorChart().getSurgeCurve().setCurve(chartConditions, surgeFlow, surgeHead);
    firstCompressor.getCompressorChart().getStoneWallCurve().setCurve(chartConditions, chokeFlow, chokeHead);
    process.add(firstCompressor);

    Cooler interCooler = new Cooler("HA27831", firstCompressor.getOutletStream());
    interCooler.setOutTemperature(30, "C");
    process.add(interCooler);

    double[] speed2 = {6057, 6922, 7890, 8653, 9086};
    double[][] flow2 = {{2061.8, 2494.38, 3241.57, 3772.47, 4106.74}, {2356.74, 3064.61, 3831.46, 4735.96},
        {2848.31, 3949.44, 4657.3, 5365.17}, {3398.88, 4441.01, 5306.18, 6033.71}, {3634.83, 4500, 5483.15, 6367.98}};
    double[][] head2 = {{41.44, 40.18, 35.99, 30.53, 25.92}, {53.61, 51.52, 46.06, 33.05},
        {67.88, 63.69, 56.55, 41.44}, {84.25, 78.38, 69.14, 53.61}, {92.64, 87.61, 77.54, 58.65}};
    double[][] flowPolyEff2 = {{2032.085, 2856.825, 3393.439, 3795.561, 4120.573},
        {2415.522, 3451.125, 3949.375, 4724.254}, {3009.797, 3987.866, 4658.589, 4984.06, 5471.654},
        {3450.717, 4754.537, 5329.311, 6056.369}, {3623.19, 4869.604, 5501.988, 6343.96}};
    double[][] polyEff2 = {{74.468, 78.298, 77.234, 73.617, 66.383}, {74.894, 78.723, 77.447, 65.106},
        {75.106, 78.723, 77.021, 73.617, 63.404}, {75.319, 77.872, 75.319, 63.83}, {74.894, 78.298, 76.596, 64.255}};
    double[] surgeFlow2 = {2254.705013080774, 2260.705013080774, 2267.9775799999998, 2354.4944334999996,
        2441.011287, 2527.5281404999996, 2614.044994, 2700.5618474999997, 2787.0787009999995, 2873.5955544999997,
        2960.112408, 3046.6292614999998, 3133.1461149999996, 3219.6629685, 3306.179822, 3392.6966755,
        3479.2135289999997, 3565.7303825, 3652.2472359999997, 3738.7640895, 3825.2809429999998, 3911.7977965,
        3944.639486569277};
    double[] surgeHead2 = {25.915186872000003, 40.94541953943677, 41.443315209000005, 44.68883410252227,
        47.93435299604455, 51.179871889566826, 54.18477452074823, 56.46782928268527, 58.75088404462232,
        61.03393880655938, 63.31699356849644, 65.60004833043348, 67.88310309625099, 70.17226196517589,
        72.46142083410078, 74.75057970302565, 77.03973857195052, 79.32889744087541, 81.7325145287474, 84.25058989377591,
        87.04845041018393, 89.84631092659198, 90.90837530156303};
    double[] chokeFlow2 = {4106.7416, 4735.9551, 5365.1685, 5876.4045, 6033.7079, 6367.98, 5483.15, 4500,
        3634.83};
    double[] chokeHead2 = {25.91518687, 33.04973304, 41.44331521, 49.83689836, 53.61401029, 58.65, 77.54, 87.61,
        92.64};

    Compressor secondCompressor = new Compressor("KA27841", interCooler.getOutletStream());
    secondCompressor.setUsePolytropicCalc(true);
    secondCompressor.setSpeed(inp.speed27841DXCompressor);
    secondCompressor.setUseGERG2008(false);
    secondCompressor.getCompressorChart().setCurves(chartConditions, speed2, flow2, head2, flowPolyEff2, polyEff2);
    secondCompressor.getCompressorChart().setHeadUnit("kJ/kg");
    secondCompressor.getCompressorChart().getSurgeCurve().setCurve(chartConditions, surgeFlow2, surgeHead2);
    secondCompressor.getCompressorChart().getStoneWallCurve().setCurve(chartConditions, chokeFlow2, chokeHead2);
    process.add(secondCompressor);

    Splitter tee = new Splitter("TEE-104", secondCompressor.getOutletStream(), 2);
    tee.setFlowRates(new double[] {-1, 0.0001}, "MSm3/day");
    process.add(tee);

    return process;
  }

  ProcessSystem exportAndUtilities(ProcessSystem trainA, ProcessSystem trainB, ProcessSystem expanderA,
      ProcessSystem expanderB, ProcessSystem compressorA, ProcessSystem compressorB) {
    ProcessSystem process = new ProcessSystem();

    Mixer exportGasMixer = new Mixer("export gas mixer");
    exportGasMixer.addStream(((Splitter) compressorA.getUnit("TEE-104")).getSplitStream(0));
    exportGasMixer.addStream(((Splitter) compressorB.getUnit("TEE-104")).getSplitStream(0));
    process.add(exportGasMixer);

    Cooler exportGasCooler = new Cooler("export gas cooler", exportGasMixer.getOutletStream());
    exportGasCooler.setOutTemperature(40.0, "C");
    process.add(exportGasCooler);

    Stream exportGas = new Stream("export gas", exportGasCooler.getOutletStream());
    process.add(exportGas);

    HydrocarbonDewPointAnalyser hcDewPoint = new HydrocarbonDewPointAnalyser("export gas HC dew point", exportGas);
    hcDewPoint.setReferencePressure(50.0);
    process.add(hcDewPoint);

    WaterDewPointAnalyser waterDewPoint = new WaterDewPointAnalyser("export gas water dew point", exportGas);
    waterDewPoint.setReferencePressure(70.0);
    process.add(waterDewPoint);

    PipeBeggsAndBrills exportPipeline = new PipeBeggsAndBrills("gas export pipeline", exportGas);
    exportPipeline.setLength(inp.exportPipelineLength);
    exportPipeline.setDiameter(inp.exportPipelineDiameter);
    exportPipeline.setElevation(0.0);
    exportPipeline.setPipeWallRoughness(5.0e-6);
    exportPipeline.setNumberOfIncrements(20);
    exportPipeline.setConstantSurfaceTemperature(5.0, "C");
    exportPipeline.setHeatTransferCoefficient(10.0);
    process.add(exportPipeline);

    Mixer exportOilMixer = new Mixer("export oil mixer");
    exportOilMixer.addStream(((Stream) expanderA.getUnit("export oil")).getOutletStream());
    exportOilMixer.addStream(((Stream) expanderB.getUnit("export oil")).getOutletStream());
    process.add(exportOilMixer);

    Pump oilExportPump = new Pump("oil export pump", exportOilMixer.getOutletStream());
    oilExportPump.setOutletPressure(inp.oilExportPumpPressure);
    oilExportPump.setIsentropicEfficiency(0.75);
    process.add(oilExportPump);

    Mixer producedWaterMixer = new Mixer("produced water mixer");
    for (ProcessSystem train : new ProcessSystem[] {trainA, trainB}) {
      producedWaterMixer.addStream(((ThreePhaseSeparator) train.getUnit("1st stage separator")).getWaterOutStream());
      producedWaterMixer.addStream(((ThreePhaseSeparator) train.getUnit("2nd stage separator")).getWaterOutStream());
    }
    process.add(producedWaterMixer);

    ThrottlingValve degasserValve = new ThrottlingValve("degasser valve", producedWaterMixer.getOutletStream());
    degasserValve.setOutletPressure(1.5, "bara");
    process.add(degasserValve);

    Separator degasser = new Separator("produced water degasser", degasserValve.getOutletStream());
    process.add(degasser);

    return process;
  }
}
