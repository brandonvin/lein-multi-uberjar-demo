(defproject demo "0.1.0-SNAPSHOT"
  :description "Testing multiple uberjars"

  :dependencies
  [[org.clojure/clojure "1.11.1"]]

  :main demo.main

  ;; By default, lein runs "clean" before building an uberjar, which
  ;; deletes the earlier-built uberjar. :auto-clean false disables this.
  ;; TODO: figure out if this is problematic
  :auto-clean false

  :aliases
  {"uberjar" ["with-profile" "v1:v2" "uberjar"]}

  :profiles
  {;; Use :v1 by default, for example for `lein repl`.
   :default
   [:base :system :user :provided :v1 :dev]

   :v1
   {:uberjar-name "demo_3.5.1.jar"
    :dependencies [[org.apache.spark/spark-core_2.12 "3.5.1"]]}

   :v2
   {:uberjar-name "demo_3.1.2.jar"
    :dependencies [[org.apache.spark/spark-core_2.12 "3.1.2"]]}

   :uberjar
   {:target-path "target/uberjar"
    :aot :all}})
