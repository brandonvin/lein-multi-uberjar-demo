(ns demo.main
  (:gen-class))

(defn -main
  [& args]
  (println "Hello! This is using Spark" (org.apache.spark.package/SPARK_VERSION)))
