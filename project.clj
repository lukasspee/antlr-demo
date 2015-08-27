(defproject antlr-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.antlr/antlr4-runtime "4.5.1-1"]]
  :plugins [[lein-antlr "0.3.0"]]
  :main ^:skip-aot antlr-demo.core
  :java-source-paths ["gen-src"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
