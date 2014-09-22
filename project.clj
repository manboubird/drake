(def HADOOP-CDH-MR1-VERSION  (str "2.0.0-mr1-cdh4.5.0"))
(def HADOOP-CDH-VERSION  (str "2.0.0-cdh4.5.0"))

(defproject factual/drake "0.1.6-mr1-cdh4.5.0"
  :description "Drake: the data processing workflow tool (a.k.a. 'make for data')"
  :url "https://github.com/Factual/drake"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"cdh.releases.repo" "https://repository.cloudera.com/artifactory/cloudera-repos/"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/core.memoize "0.5.6"]
                 [factual/drake-interface "0.0.1"]
                 [org.clojure/tools.logging "0.2.3"]
                 [clj-logging-config "1.9.6"]
                 [clojopts/clojopts "0.3.2"]
                 [fs "1.3.2"]
                 [factual/jlk-time "0.1"]
                 [clj-time "0.6.0"]
                 [digest "1.4.0"]
                 [com.google.guava/guava "14.0.1"]
                 [cheshire "5.2.0"]
                 [slingshot "0.10.3"]
                 [factual/fnparse "2.3.0"]
                 [commons-codec/commons-codec "1.6"]
                 [factual/sosueme "0.0.15"]
                 [factual/c4 "0.2.0"]
                 ;; for HDFS support
                 [hdfs-clj "0.1.0"]
                 ;; you may need to change this to be compatible with your cluster
                 [org.apache.hadoop/hadoop-core ~HADOOP-CDH-MR1-VERSION]
                 [org.apache.hadoop/hadoop-hdfs ~HADOOP-CDH-VERSION]
                 [org.apache.hadoop/hadoop-common ~HADOOP-CDH-VERSION]
                 ;; for AWS S3 support
                 [clj-aws-s3 "0.3.3"]
                 ;; for plugins
                 [com.cemerick/pomegranate "0.2.0"]]
  :test-selectors {:regression   :regression
                   :default      (complement :regression)
                   :all          (constantly true)}
  :main drake.core
  :aot :all)
