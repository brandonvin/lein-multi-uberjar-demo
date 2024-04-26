# Demo of building multiple uberjars with lein

Running `lein uberjar` in this project produces two JARs
with different names and different dependencies.

Try it out by running `./build.sh`

```
$ ./build.sh
Performing task 'uberjar' with profile(s): 'v1'
Compiling demo.main
Created /Users/brandon/git/lein-multi-uberjar-demo/target/uberjar/demo-0.1.0-SNAPSHOT.jar
Created /Users/brandon/git/lein-multi-uberjar-demo/target/uberjar/demo_3.5.1.jar
Performing task 'uberjar' with profile(s): 'v2'
Created /Users/brandon/git/lein-multi-uberjar-demo/target/uberjar/demo-0.1.0-SNAPSHOT.jar
Created /Users/brandon/git/lein-multi-uberjar-demo/target/uberjar/demo_3.1.2.jar

Running target/uberjar/demo_3.5.1.jar...
Hello! This is using Spark 3.5.1
Running target/uberjar/demo_3.1.2.jar...
Hello! This is using Spark 3.1.2
```
