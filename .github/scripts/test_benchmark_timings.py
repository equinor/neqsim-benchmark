"""Unit tests for benchmark-timings.py. Run with: python3 -m unittest discover -s .github/scripts"""
import importlib.util
import tempfile
import unittest
from pathlib import Path

spec = importlib.util.spec_from_file_location("timings", Path(__file__).with_name("benchmark-timings.py"))
timings = importlib.util.module_from_spec(spec)
spec.loader.exec_module(timings)

PREFIX = "com.equinor.neqsim.benchmark."


def metric(score, low=None, high=None):
    return {"score": score, "scoreUnit": "ms/op",
            "scoreConfidence": [score * 0.99 if low is None else low, score * 1.01 if high is None else high]}


class TimingReportTest(unittest.TestCase):
    def test_geometric_mean_gain(self):
        self.assertAlmostEqual(timings.geometric_mean_gain([0.5, 2.0]), 0.0)
        self.assertAlmostEqual(timings.geometric_mean_gain([0.9]), 10.0)
        self.assertIsNone(timings.geometric_mean_gain([]))

    def test_benchmark_area(self):
        self.assertEqual(timings.benchmark_area(PREFIX + "longrun.DynamicProcessBenchmark.run"), "longrun")
        self.assertEqual(timings.benchmark_area(PREFIX + "flash.TPflash.testFlash"), "flash")

    def test_summary_verdict_and_areas(self):
        baseline = {(PREFIX + "flash.A.a", ()): metric(10.0), (PREFIX + "longrun.B.b", ()): metric(100.0)}
        current = {(PREFIX + "flash.A.a", ()): metric(8.0), (PREFIX + "longrun.B.b", ()): metric(100.5)}
        expected = {PREFIX + "flash.A.a", PREFIX + "longrun.B.b"}
        report, incomplete = timings.summarize(baseline, current, "1.0", "1.1", expected)
        self.assertFalse(incomplete)
        self.assertIn("faster** (geometric mean of 2 cases). 1 significantly faster, 0 significantly slower", report)
        self.assertIn("| flash | 1 | +20.00% | 1 / 0 |", report)
        self.assertIn("| longrun | 1 | -0.50% | 0 / 0 |", report)

    def test_missing_case_is_incomplete(self):
        baseline = {(PREFIX + "flash.A.a", ()): metric(10.0)}
        report, incomplete = timings.summarize(baseline, {}, "1.0", "1.1", {PREFIX + "flash.A.a"})
        self.assertTrue(incomplete)
        self.assertIn("No matched benchmark cases", report)

    def test_correctness_regressions(self):
        with tempfile.TemporaryDirectory() as name:
            directory = Path(name)
            (directory / "baseline-tests-exit-code.txt").write_text("1\n")
            (directory / "baseline-test-failures.txt").write_text("a.Old.test [failure] old\n")
            (directory / "current-tests-exit-code.txt").write_text("1\n")
            (directory / "current-test-failures.txt").write_text(
                "a.Old.test [failure] old\na.New.test [error] boom\n")
            correctness = timings.load_correctness(directory)
        self.assertEqual(correctness["current"]["status"], "failed")
        self.assertEqual(timings.new_correctness_failures(correctness), ["a.New.test"])
        self.assertIn("Correctness regression", "\n".join(timings.correctness_section(correctness)))


if __name__ == "__main__":
    unittest.main()
