#!/usr/bin/env bash
set -euo pipefail

lein do clean, test, uberjar
echo

for JAR in $(find target/uberjar -maxdepth 1 -name '*.jar' -not -name '*SNAPSHOT*'); do
    echo "Found uberjar $JAR, checking for unintentionally bundled Spark classes:"
    if jar -tf $JAR | grep SparkSession; then
        echo "Fail"
    else
        echo "Pass"
    fi
done
