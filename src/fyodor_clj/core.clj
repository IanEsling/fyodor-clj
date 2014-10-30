(ns fyodor-clj.core
  (import (uk.org.fyodor.generators RDG)
          (uk.org.fyodor.range Range)))

(def default-string-length (int  30))

(defn string-fixed-length
  "Returns a function that generates random strings of fixed length."
  ([] (string-fixed-length (int default-string-length)))
  ([x]
     (def gen (RDG/string (int x)))
     (fn [] (.next gen)))
  ([x chars]
     (def gen (RDG/string (int x) (str chars)))
     (fn [] (.next gen))))

(defn string-variable-length
  "returns a function that generates random strings of variable length."
  [min max]
  (def gen (RDG/string (Range/closed (int min) (int max))))
  (fn [] (.next gen)))
