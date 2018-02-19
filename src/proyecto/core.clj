(ns proyecto.core
  (:gen-class))


  (defn fibonacci [x]
  	(if (<= x 2) 1
  	(+ (fibonacci (- x 2)) (fibonacci (- x 1)))))
(defn factorial [x]
  (if (<= x 1)1
  (* (factorial (- x 1)) x)))

  (defn -main [& args]
  	(let [arg-1 (or (first args) "5")
    n (Integer/parseInt arg-1 )]
  (println "fib(" n ")=" (fibonacci n))
    (println "fact(" n ")=" (factorial n))
  ))
