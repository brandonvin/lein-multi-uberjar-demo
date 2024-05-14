(defproject demo "0.1.0-SNAPSHOT"
  :description "Testing multiple uberjars"

  :dependencies
  [[org.clojure/clojure "1.11.1"]]

  :main demo.main

  :aliases
  {"uberjar" ["with-profile" "uberjar,provided,v1:uberjar,provided,v2" "uberjar"]
   "check" ["with-profile" "+v1:+v2" "check"]
   "test" ["with-profile" "v1:v2" "test"]}

  :target-path "target/%s"

  :profiles
  {;; Use :v1 by default, for example for `lein repl`.
   :default
   [:base :system :user :provided :v1 :dev]

   :v1
   ^{:pom-scope :provided}
   {:uberjar-name "demo_3.5.1.jar"
    :dependencies [[org.apache.spark/spark-core_2.12 "3.5.1"]]}

   :v2
   ^{:pom-scope :provided}
   {:uberjar-name "demo_3.1.2.jar"
    :dependencies [[org.apache.spark/spark-core_2.12 "3.1.2"]]}

   :uberjar
   {:clean-targets [:compile-path]
    :aot :all}})
