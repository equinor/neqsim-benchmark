#!/usr/bin/env bash
set -euo pipefail

baseline_version="$1"
current_version="$2"
version_property="${NEQSIM_PROPERTY-neqsim.version}"
script_dir="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)"
project_dir="$RUNNER_TEMP/benchmark-project"
mkdir -p "$project_dir"
cp pom.xml "$project_dir/pom.xml"
cp -R src "$project_dir/"

{
  java -version
  mvn -version
  uname -a
  if command -v lscpu > /dev/null; then
    lscpu
  fi
} > "$RUNNER_TEMP/benchmark-environment.txt" 2>&1

build_failures=0
{
  printf '## Maven Build Results\n\n'
  printf '| Variant | NeqSim | Maven build |\n| --- | --- | --- |\n'
} > "$RUNNER_TEMP/benchmark-build-summary.md"

for variant in baseline current; do
  rm -f "$RUNNER_TEMP/$variant-benchmarks.json" "$RUNNER_TEMP/$variant-benchmarks.txt" \
    "$RUNNER_TEMP/$variant-benchmarks.log" "$RUNNER_TEMP/$variant-artifact.json" \
    "$RUNNER_TEMP/$variant-classpath.txt"
  if [[ "$variant" == baseline ]]; then
    version="$baseline_version"
  else
    version="$current_version"
  fi
  if (
    if [[ -z "$version_property" ]]; then
      mvn --batch-mode --no-transfer-progress -f "$project_dir/pom.xml" \
        org.codehaus.mojo:versions-maven-plugin:2.18.0:use-dep-version \
        -Dincludes=com.equinor.neqsim:neqsim -DdepVersion="$version" \
        -DforceVersion=true -DgenerateBackupPoms=false || exit "$?"
    fi
    mvn --batch-mode --no-transfer-progress -f "$project_dir/pom.xml" \
      org.apache.maven.plugins:maven-dependency-plugin:3.8.1:build-classpath \
      "-D${version_property:-neqsim.version}=$version" \
      -DincludeGroupIds=com.equinor.neqsim -DincludeArtifactIds=neqsim \
      -DincludeTypes=jar -DexcludeTransitive=true \
      -Dmdep.outputFile="$RUNNER_TEMP/$variant-classpath.txt" || exit "$?"
    python3 "$script_dir/neqsim-jar-version.py" "$RUNNER_TEMP/$variant-classpath.txt" \
      "$version" "$RUNNER_TEMP/$variant-artifact.json" || exit "$?"
    printf '$ mvn clean verify -D%s=%s\n' "${version_property:-neqsim.version}" "$version"
    mvn --batch-mode --no-transfer-progress -f "$project_dir/pom.xml" clean verify \
      "-D${version_property:-neqsim.version}=$version"
  ) 2>&1 | tee "$RUNNER_TEMP/$variant-build.log"; then
    printf '0\n' > "$RUNNER_TEMP/$variant-build-exit-code.txt"
    printf '| %s | %s | passed |\n' "$variant" "$version" >> "$RUNNER_TEMP/benchmark-build-summary.md"
  else
    build_exit_code="${PIPESTATUS[0]}"
    printf '%s\n' "$build_exit_code" > "$RUNNER_TEMP/$variant-build-exit-code.txt"
    printf '| %s | %s | failed (exit %s) |\n' "$variant" "$version" "$build_exit_code" \
      >> "$RUNNER_TEMP/benchmark-build-summary.md"
    build_failures=$((build_failures + 1))
    continue
  fi
  java -jar "$project_dir/target/benchmarks.jar" -l > "$RUNNER_TEMP/$variant-benchmarks.txt"
  java -jar "$project_dir/target/benchmarks.jar" \
    -bm avgt -tu ms -t 1 -f 2 -wf 0 \
    -wi 2 -w 2s -i 3 -r 2s -foe false \
    -rf json -rff "$RUNNER_TEMP/$variant-benchmarks.json" \
    2>&1 | tee "$RUNNER_TEMP/$variant-benchmarks.log"
done

if [[ "$build_failures" -gt 0 ]]; then
  {
    cat "$RUNNER_TEMP/benchmark-build-summary.md"
    printf '\nIncomplete timing comparison: Maven build failures were recorded. No overall gain is available.\n'
  } | tee "$RUNNER_TEMP/benchmark-timing-summary.md" >> "$GITHUB_STEP_SUMMARY"
  exit 0
fi

exit_code=0
if ! python3 "$script_dir/benchmark-timings.py" \
  "$RUNNER_TEMP/baseline-benchmarks.json" "$RUNNER_TEMP/current-benchmarks.json" \
  --baseline-version "$baseline_version" --current-version "$current_version" \
  --baseline-list "$RUNNER_TEMP/baseline-benchmarks.txt" \
  --current-list "$RUNNER_TEMP/current-benchmarks.txt" \
  | tee "$RUNNER_TEMP/benchmark-timing-summary.md" >> "$GITHUB_STEP_SUMMARY"; then
  exit_code=1
fi
if grep -Eq '<failure>|<forked VM failed' "$RUNNER_TEMP/baseline-benchmarks.log" "$RUNNER_TEMP/current-benchmarks.log"; then
  echo "**Incomplete comparison: JMH reported individual benchmark failures. See the run logs.**" \
    | tee -a "$RUNNER_TEMP/benchmark-timing-summary.md" >> "$GITHUB_STEP_SUMMARY"
  exit_code=1
fi
exit "$exit_code"