"""Print one line per failed or errored JUnit test case found in Surefire XML reports."""
import sys
import xml.etree.ElementTree as ET
from pathlib import Path


def failures(report_dir):
    found = []
    for path in sorted(Path(report_dir).glob("TEST-*.xml")):
        try:
            root = ET.parse(path).getroot()
        except ET.ParseError as error:
            found.append(f"{path.name}: unreadable report ({error})")
            continue
        for case in root.iter("testcase"):
            for kind in ("failure", "error"):
                problem = case.find(kind)
                if problem is not None:
                    message = " ".join((problem.get("message") or problem.get("type") or "").split())[:200]
                    found.append(f"{case.get('classname', '')}.{case.get('name', '')} [{kind}] {message}".strip())
    return found


if __name__ == "__main__":
    for line in failures(sys.argv[1]):
        print(line)
