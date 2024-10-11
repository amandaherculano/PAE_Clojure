;;  1. 
(println "Eu não tenho  medo de parênteses")
(* ( + 1 2 3) ( - 10 3))
(println "Atividade Concluída")

;; 2.
( if true "Sim" "Não")

;; 3
( if false ( + 10 5) (rand))

;; 4
( do 
 ( + 3 4)
 ( / 8 4)
 ( + 2 3))

;; 5 
( if true ( do (println "Gerando um número randômico") (rand)))

;;  6.
( when true (println "Gerando um número randômico") (rand))

;; 7. 
( def x 10)

;; 8. 
(def nada (fn []))

;; 9.
(def quadrado (fn [par] (* par par)))

;; 10.
(println ((fn [par] (* par par)) 5))

