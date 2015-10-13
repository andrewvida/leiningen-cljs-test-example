(ns cljs.my-namespaced-app.foo-test
  (:require [cljs.test :refer-macros [deftest is]]))

  (deftest do-i-work
    (is (= 1 2)))
