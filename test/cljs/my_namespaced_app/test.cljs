(ns cljs.my-namespaced-app.test
  (:require [cljs.test :refer-macros [run-all-tests]]))

(enable-console-print!)

(defn ^:export run []
  (run-all-tests #"cljs.my-namespaced-app.*-test"))
