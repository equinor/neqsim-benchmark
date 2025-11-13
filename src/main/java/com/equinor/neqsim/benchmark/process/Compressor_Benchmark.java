package com.equinor.neqsim.benchmark.process;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Warmup;
import neqsim.process.equipment.compressor.Compressor;
import neqsim.process.equipment.stream.Stream;
import neqsim.process.processmodel.ProcessSystem;
import neqsim.thermo.system.SystemInterface;
import neqsim.thermo.system.SystemSrkEos;

/**
 * <p>
 * Compressor_benchmark class.
 * </p>
 *
 * @author asmund
 * @version $Id: $Id
 */
public class Compressor_Benchmark {

    @Warmup(iterations = 2, time = 5)
    @Measurement(iterations = 2, time = 5)
    @Fork(value = 1, warmups = 1)
    @Benchmark
    public void compressorprocess() {
        SystemInterface testFluid = new SystemSrkEos(298.15, 50.0);

        testFluid.addComponent("nitrogen", 1.205);
        testFluid.addComponent("CO2", 1.340);
        testFluid.addComponent("methane", 87.974);
        testFluid.addComponent("ethane", 5.258);
        testFluid.addComponent("propane", 3.283);
        testFluid.addComponent("i-butane", 0.082);
        testFluid.addComponent("n-butane", 0.487);
        testFluid.addComponent("i-pentane", 0.056);
        testFluid.addComponent("n-pentane", 0.053);
        testFluid.setMixingRule(2);
        testFluid.setMultiPhaseCheck(true);

        testFluid.setTemperature(24.0, "C");
        testFluid.setPressure(48.0, "bara");
        testFluid.setTotalFlowRate(1.0, "MSm3/day");

        Stream stream_1 = new Stream("Stream1", testFluid);
        Compressor comp1 = new Compressor("comp1", stream_1);
        comp1.setOutletPressure(110.0);
        ProcessSystem operations = new ProcessSystem();
        operations.add(stream_1);
        operations.add(comp1);
        operations.run();
    }
}
