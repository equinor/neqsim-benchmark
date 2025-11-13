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

## Add benchmark methods
Add methods under folder [benchmark](src/main/java/com/equinor/neqsim/benchmark). Remember to use decorator @Benchmark.