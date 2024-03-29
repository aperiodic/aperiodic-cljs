(defproject {{raw-name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.0.4"]
                 [hiccup "1.0.0"]]
  :plugins [[lein-cljsbuild "0.2.4"]
            [lein-ring "0.7.1"]]
  :ring {:handler {{namespace}}.routes/handler}
  :source-paths ["src/clj"]
  :cljsbuild
    {:builds
      [{:source-path "src/cljs"
        :compiler
          {:output-to "resources/public/js/main.js"
           :optimizations :whitespace
           :pretty-print true}}]})
