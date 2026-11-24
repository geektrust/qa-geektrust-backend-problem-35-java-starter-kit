#!/bin/bash
cd "$(dirname "$0")"
mkdir -p out
javac -d out src/main/java/Main.java src/test/java/TestSample.java && java -cp out TestSample
