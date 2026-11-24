#!/bin/bash
cd "$(dirname "$0")"
mkdir -p out
javac -d out src/main/java/Main.java && java -cp out Main < sample_input.txt
