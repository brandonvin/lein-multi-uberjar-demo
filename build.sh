#!/usr/bin/env bash
set -euo pipefail

lein do clean, uberjar
echo

for JAR in $(find target/uberjar -maxdepth 1 -name '*.jar' -not -name '*SNAPSHOT*'); do
    echo "Running $JAR..."
    java -jar $JAR
done
