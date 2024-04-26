#!/usr/bin/env bash
set -euo pipefail

lein test
lein do clean, uberjar
echo

for JAR in $(find target/uberjar -maxdepth 1 -name '*.jar' -not -name '*SNAPSHOT*'); do
    jar -tf $JAR | grep SparkSession
done
