#!/bin/bash
cd "$(dirname "$0")"
args=()
while IFS= read -r line || [ -n "$line" ]; do args+=("$line"); done < sample_input.txt
mkdir -p out
javac -d out src/main/java/Main.java && java -cp out Main "${args[@]}"
