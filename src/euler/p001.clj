(ns euler.p001)

(defn multiple-of [x m]
  (= (mod x m) 0))

(defn valid [x]
  (or
   (multiple-of x 3)
   (multiple-of x 5)))

(defn solution []
  (->> (range 1000)
       (filter valid)
       (apply +)))
