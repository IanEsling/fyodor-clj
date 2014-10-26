(ns fyodor-clj.core
  (import (uk.org.fyodor.generators RDG)))

(def default-string-length 30)

(defn string
  "Returns a function that generates random strings."
  ([] (string (int default-string-length)))
  ([x]
     (def gen (RDG/string (int x)))
     (fn [] (.next gen))))
