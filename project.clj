(defproject leiningen-cljs-test-example "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.7.0"]
                           [org.clojure/clojurescript "1.7.48"]]
            :plugins [[lein-cljsbuild "1.0.6"]
                      [lein-midje "3.1.3"]]
            :test-paths ["test/clj"]
            :cljsbuild {:builds {:minify {:source-paths ["src-cljs"]
                                          :compiler {:output-to "resources/public/js/main.js"
                                                     :output-dir "cljsbuild-output-minify"
                                                     :optimizations :advanced
                                                     :pretty-print false
                                                     :externs ["externs/jquery-externs-1.9.js"
                                                               "externs/externs.js"
                                                               "externs/moment.js"]}}
                                 :dev {:source-paths ["src-cljs"]
                                       :compiler {:output-to "resources/public/js/main.js"
                                                  :output-dir "resources/public/js/build-output-dev"
                                                  :optimizations :whitespace}}
                                 :test {:source-paths ["src-cljs" "test/cljs"]
                                       :compiler {:output-to "resources/public/js/main-test.js"
                                                  :optimizations :whitespace
                                                  :pretty-print true}}}
                        :test-commands {"unit" ["phantomjs"
                                                "resources/test/phantom/runner.js"
                                                "resources/test/test.html"]}} )
