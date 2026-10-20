package com.equinor.neqsim.benchmark.numerics;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import neqsim.statistics.parameterfitting.SampleSet;
import neqsim.statistics.parameterfitting.SampleValue;
import neqsim.statistics.parameterfitting.nonlinearparameterfitting.LevenbergMarquardt;
import neqsim.statistics.parameterfitting.nonlinearparameterfitting.LevenbergMarquardtFunction;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

/**
 * Pure numerical kernels built on the linear algebra backend: Levenberg-Marquardt regression
 * ({@code StatisticsBaseClass}, normal equations, covariance).
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 3, time = 2)
@Measurement(iterations = 5, time = 2)
@Fork(1)
public class LinearAlgebraKernelBenchmark {

  /** Antoine equation ln(P) = A - B / (T + C), fitted with three parameters. */
  public static class AntoineFunction extends LevenbergMarquardtFunction {
    public AntoineFunction() {
      params = new double[] {10.0, 2000.0, -50.0};
    }

    @Override
    public double calcValue(double[] dependentValues) {
      return params[0] - params[1] / (dependentValues[0] + params[2]);
    }

    @Override
    public void setFittingParams(int i, double value) {
      params[i] = value;
    }
  }

  /** Two-term exponential decay a1*exp(-k1*x) + a2*exp(-k2*x) + c, five parameters. */
  public static class DoubleExponentialFunction extends LevenbergMarquardtFunction {
    public DoubleExponentialFunction() {
      params = new double[] {2.0, 0.5, 1.0, 0.05, 0.1};
    }

    @Override
    public double calcValue(double[] x) {
      return params[0] * Math.exp(-params[1] * x[0])
          + params[2] * Math.exp(-params[3] * x[0])
          + params[4];
    }

    @Override
    public void setFittingParams(int i, double value) {
      params[i] = value;
    }
  }

  static LevenbergMarquardt optimizer(
      LevenbergMarquardtFunction function, double[][] xy, double sigma) {
    ArrayList<SampleValue> samples = new ArrayList<>();
    for (double[] point : xy) {
      SampleValue sample = new SampleValue(point[1], sigma, new double[] {point[0]});
      sample.setFunction(function);
      samples.add(sample);
    }
    LevenbergMarquardt optim = new LevenbergMarquardt();
    optim.setSampleSet(new SampleSet(samples));
    optim.setMaxNumberOfIterations(100);
    return optim;
  }

  /**
   * Synthetic propane-like vapour pressure data (ln P in bar) with a deterministic perturbation.
   */
  static double[][] antoineData() {
    double[][] data = new double[40][];
    for (int i = 0; i < data.length; i++) {
      double t = 200.0 + 3.0 * i;
      data[i] = new double[] {t, 9.1 - 1850.0 / (t - 25.0) + 0.002 * Math.sin(i)};
    }
    return data;
  }

  static double[][] doubleExponentialData() {
    double[][] data = new double[60][];
    for (int i = 0; i < data.length; i++) {
      double x = 0.5 * i;
      data[i] =
          new double[] {
            x, 3.0 * Math.exp(-0.8 * x) + 1.5 * Math.exp(-0.07 * x) + 0.2 + 0.001 * Math.cos(i)
          };
    }
    return data;
  }

  @Benchmark
  public double levenbergMarquardtAntoine() {
    AntoineFunction function = new AntoineFunction();
    optimizer(function, antoineData(), 0.01).solve();
    return function.getFittingParams(0)
        + function.getFittingParams(1)
        + function.getFittingParams(2);
  }

  @Benchmark
  public double levenbergMarquardtDoubleExponential() {
    DoubleExponentialFunction function = new DoubleExponentialFunction();
    optimizer(function, doubleExponentialData(), 0.01).solve();
    double sum = 0.0;
    for (int i = 0; i < 5; i++) {
      sum += function.getFittingParams(i);
    }
    return sum;
  }
}
