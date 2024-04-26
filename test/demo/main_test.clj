(ns demo.main-test
  (:require
    [clojure.test :refer [deftest is testing]]))


(deftest it-runs
  (println (org.apache.spark.package/SPARK_VERSION)))
