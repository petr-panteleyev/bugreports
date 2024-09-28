# SIGSEGV on launch (Linux)

1. ```export JAVA_HOME=/path/to/jdk-23```
2. Build \
```mvn clean verify jpackage:jpackage```
3. Launch \
```./target/dist/sigsegv/bin/sigsegv``` \
and press button to stop the application
4. Repeat (3) until it crashes

