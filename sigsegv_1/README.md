# SIGSEGV on launch (Linux)

1. ```export JAVA_HOME=/path/to/jdk-23```
2. Build \
```mvn clean verify jpackage:jpackage```
3. Launch \
```./target/dist/sigsegv/bin/sigsegv``` \
and wait for 1 sec for application exit
4. Repeat (3) until it crashes

The problem does not reproduce if example is launched directly with java (no jpackage involved): \
```java --module-path target/jmods --module sigsegv/sigsegv.Main```
