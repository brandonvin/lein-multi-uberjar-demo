(ns demo.main
  (:gen-class))

(println "Compilation is using Spark" (org.apache.spark.package/SPARK_VERSION))

(defn -main
  [& args]
  (println "Hello! Runtime is using Spark" (org.apache.spark.package/SPARK_VERSION)))
