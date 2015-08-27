(ns antlr-demo.core
  (:import [parsers BusinessLexer BusinessParser]
           [org.antlr.v4.runtime ANTLRFileStream CommonTokenStream])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [tree (-> (ANTLRFileStream. "resources/test")
                 (BusinessLexer.)
                 (CommonTokenStream.)
                 (BusinessParser.))]
    (println (-> tree .r .toStringTree))))
