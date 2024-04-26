# Demo of building multiple uberjars with lein

Running `lein uberjar` in this project produces two JARs with different names,
compiled with different dependencies. These dependencies are "provided": used
during compilation, and not bundled into the uberjar.

`lein test` will run the tests on each version sequentially.

Try it out by running `./build.sh`.
