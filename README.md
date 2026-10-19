# neqsim-benchmark
NeqSim benchmarking project.  
Is implemented as a maven project using [Java Microbenchmark Harness](https://github.com/openjdk/jmh). 

## Install, build and run benchmarks
1. Clone project from github ```git checkout https://github.com/Equinor/neqsim-benchmark```.
2. Call ```mvn validate``` to install the required dependencies.
3. Call ```mvn clean verify``` to build the benchmarks.
4. Call ```java -jar target/benchmarks.jar``` to run the benchmarks. For output to text file add -rf text -rff neqsimx.x.x.txt

## Update neqsim-jar
Neqsim is available from central repository. Update neqsim dependency in [pom.xml](pom.xml).

The [Check NeqSim Updates workflow](.github/workflows/check-neqsim-updates.yml)
checks Maven Central weekly on Mondays at 06:23 UTC and can also be run manually from the
GitHub Actions tab. When a newer stable NeqSim release is available, it updates
only that dependency, runs `mvn clean verify` with Java 21, and opens or refreshes
an update pull request. It does not run the JMH benchmarks or merge automatically.

Enable **Allow GitHub Actions to create and approve pull requests** under
**Settings > Actions > General > Workflow permissions** for PR creation.
The workflow uses the built-in `GITHUB_TOKEN`; no additional secret is required.

## Add benchmark methods
Add methods under folder [benchmark](src/main/java/com/equinor/neqsim/benchmark). Remember to use decorator @Benchmark.