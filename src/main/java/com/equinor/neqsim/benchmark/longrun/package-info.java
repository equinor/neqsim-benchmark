/**
 * Long-running workload benchmarks, each taking between about 30 seconds and five minutes per operation.
 *
 * <p>
 * The timing runner selects this package separately and measures it with fewer iterations than the rest of the
 * suite, so the long workloads stay within the CI time budget. Every class exposes a static method taking the
 * workload size, which the smoke tests call with a small size.
 * </p>
 */
package com.equinor.neqsim.benchmark.longrun;
