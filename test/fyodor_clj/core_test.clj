(ns fyodor-clj.core-test
  (:require [clojure.test :refer :all]
            [fyodor-clj.core :refer :all]))

(deftest string-generator
  (testing "string function returns a string of the right length."
    (is (string? ((string))))
    (is (= 15 (count ((string 15)))))
    (is (= 12 (count ((string 12)))))
    (is (= 42 (count ((string 42))))))
  (testing "string generator uses provided characters"
    (is (.matches ((string 10 "ABC")) "[ABC]{10}" ))
    (is (.matches ((string 42 "XYZ")) "[XYZ]{42}"))))
