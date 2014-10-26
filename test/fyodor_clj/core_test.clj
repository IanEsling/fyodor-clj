(ns fyodor-clj.core-test
  (:require [clojure.test :refer :all]
            [fyodor-clj.core :refer :all]))

(deftest a-test
  (testing "string function returns a string."
    (is (string? ((string))))))
