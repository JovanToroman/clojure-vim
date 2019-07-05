(defproject clojure-vim "0.1.0"
  :description "FIXME: write description"
  :url "https://github.com/maltsev/clojure-vim"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot clojure-vim.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
