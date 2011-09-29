(defproject necessary-evil "2.0.0-SNAPSHOT"
  :description "An implementation of XML-RPC for the Clojure Ring HTTP stack"
  :repositories {"sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots/"}
  :dependencies [[org.clojure/clojure "[1.2.1],[1.3.0]"]
                 [org.clojure/data.zip "0.1.0"]
                 [org.clojure/algo.monads "0.1.1-SNAPSHOT"]
                 [clj-http "0.1.3"]
                 [commons-codec "1.4"]
                 [clj-time "0.3.0"]
                 [commons-lang "2.6"]]
  :dev-dependencies [[ring/ring-jetty-adapter "0.3.11"]
                     [marginalia "0.5.0-alpha"]])
