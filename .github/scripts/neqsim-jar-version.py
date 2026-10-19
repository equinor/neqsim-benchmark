import argparse
import configparser
import json
import os
import re
from pathlib import Path
from zipfile import ZipFile


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("classpath", type=Path)
    parser.add_argument("requested_version")
    parser.add_argument("output", type=Path)
    args = parser.parse_args()
    paths = [Path(value) for value in args.classpath.read_text().strip().split(os.pathsep) if value]
    if len(paths) != 1:
        raise ValueError("Expected exactly one resolved NeqSim dependency JAR")
    jar = paths[0]
    with ZipFile(jar) as archive:
        metadata = archive.read("META-INF/maven/com.equinor.neqsim/neqsim/pom.properties").decode("utf-8")
    properties = configparser.ConfigParser(interpolation=None, comment_prefixes=("#", "!"))
    properties.read_string("[artifact]\n" + metadata)
    artifact = properties["artifact"]
    if artifact.get("groupId") != "com.equinor.neqsim" or artifact.get("artifactId") != "neqsim":
        raise ValueError("Resolved JAR does not identify com.equinor.neqsim:neqsim")
    version = artifact.get("version", "").strip()
    if not re.fullmatch(r"[0-9][0-9A-Za-z.+_-]*", version):
        raise ValueError(f"Invalid embedded NeqSim JAR version: {version!r}")
    record = {"requested_version": args.requested_version, "version": version,
              "jar": str(jar), "source": "embedded Maven pom.properties"}
    args.output.write_text(json.dumps(record, indent=2) + "\n")
    print(f"NeqSim JAR version: {version} ({jar.name}); requested: {args.requested_version}")
    if version != args.requested_version:
        raise ValueError("Resolved NeqSim JAR version differs from the requested version")


if __name__ == "__main__":
    main()