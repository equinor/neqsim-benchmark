package com.equinor.neqsim.benchmark.numerics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import neqsim.process.util.reconciliation.ReconciliationResult;
import org.junit.jupiter.api.Test;

class DataReconciliationTest {

  @Test
  void reconcilesEverySplitterBalance() {
    for (int nodes : new int[] {20, 100}) {
      ReconciliationResult result =
          LinearAlgebraKernelBenchmark.reconciliationProblem(nodes).reconcile();
      assertTrue(result.isConverged(), "Nodes " + nodes + ": " + result.getErrorMessage());
      assertEquals(2 * nodes + 1, result.getVariables().size());
      assertTrue(Double.isFinite(result.getObjectiveValue()));
      assertTrue(result.getObjectiveValue() > 0.0, "Perturbed measurements need correction");
      double[] before = result.getConstraintResidualsBefore();
      double[] after = result.getConstraintResidualsAfter();
      assertEquals(nodes, before.length);
      assertEquals(nodes, after.length);
      double maxBefore = 0.0;
      for (int i = 0; i < nodes; i++) {
        assertTrue(Double.isFinite(before[i]));
        maxBefore = Math.max(maxBefore, Math.abs(before[i]));
        assertEquals(0.0, after[i], 1e-8, "Nodes " + nodes + ", balance " + i);
      }
      assertTrue(maxBefore > 1.0, "Initial measurements should not already balance");
    }
  }
}
