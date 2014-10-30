(ns fyodor-clj.core-test
  (:require [clojure.test :refer :all]
            [fyodor-clj.core :refer :all]))

(deftest string-fixed-length-generator
  (testing "string function returns a string of the right length."
    (is (string? ((string-fixed-length))))
    (is (= 15 (count ((string-fixed-length 15)))))
    (is (= 12 (count ((string-fixed-length 12)))))
    (is (= 42 (count ((string-fixed-length 42))))))
  (testing "string generator uses provided characters"
    (is (.matches ((string-fixed-length 10 "ABC")) "[ABC]{10}" ))
    (is (.matches ((string-fixed-length 42 "XYZ")) "[XYZ]{42}"))))

(deftest string-variable-length-generator
  (testing "generate strings of variable length"
    (is (string? ((string-variable-length 10 20))))
    (is (>= (count ((string-variable-length 10 20))) 10))
    (is (<= (count ((string-variable-length 10 20))) 20))
    ))
