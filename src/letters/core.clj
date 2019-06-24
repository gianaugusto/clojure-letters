(ns letters.core
  (:gen-class))

(def total-lifes 6)

(defn you-lose [] (print "You lose!"))

(defn game [lifes] 
  (if (= lifes 0)
    (you-lose)
    (do 
      (print lifes)
      (game (dec lifes))
    )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
