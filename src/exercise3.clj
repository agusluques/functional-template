(ns exercise3)

(defn fibonacci [n]
	(if (< n 2) n 
		(+ (fibonacci (- n 1)) (fibonacci (- n 2)))
	)
)
