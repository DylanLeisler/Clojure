(ns basic-clojure)

;; (= '(6 7 8) (map #(+ % 5) '(1 2 3)))

;; (= (quote (6 7)) (filter #(> % 5) '(3 4 5 6 7)))

;; (defn gen-identity
;;   [] ; zero arguments
;;   (fn [x] (= x x)))


;; (def munc "success")

;; munc

;; (def mar (gen-identity))

;; (mar 5)


;; (= [\4 \2]
;;    (vec (str (inc 41)))
;;    (comp '(vec seq str inc) 41))


;; (def trip (comp vec seq str inc))

;; (trip 42)


;; (= (last [1 2 3 4 5]) 5)

;; (= ((fn [x] (second (reverse x)))
;;     (list 1 2 3 4 5))
;;    4)

;; ((fn [x] (second (reverse x)))
;;  (list 1 2 3 4 5))


;; (= (nth '(4 5 6 7) 2) 6)

;; (= (__ 8) '(1 1 2 3 5 8 13 21))

;; ((fn [n]
;;    (let [MAX n]
;;      ((fn [i]
;;         (+ i MAX))
;;       1)))
;;  5)


;; ((fn [n]
;;    ((fn fib [i]
;;       (let [MAX (dec n)]
;;         (if-not (> MAX 0)
;;           (println i)
;;           (if (< (count i) 2)
;;             (conj i 1)
;;             (fib (conj i (+
;;                           (first (reverse i))
;;                           (second (reverse i)))))))))
;;     [1]))
;;  6)

;; (map conj [[1 2 3] [5 6 7]])


;; ((fn [i]
;;    (if (< (count i) 2)
;;      (conj i 1)
;;      (conj
;;       [(first (reverse i))]
;;       (second (reverse i)))))
;;  [1 2 3 4 5 6])

;; ((fn [i]
;;    (if (< (count i) 2)
;;      (conj i 1)
;;      (conj i (+
;;               (first (reverse i))
;;               (second (reverse i))))))
;;  [1 1 2 3 5 8])


((fn [n i]
   (if (> n 0)
     (if (> (count i) 2)
       (recur
        (dec n) (conj i (+'
                         (first (reverse i))
                         (second (reverse i)))))
       (recur
        (dec n) (conj i 1)))
     (count i)))
 4000 [1])


