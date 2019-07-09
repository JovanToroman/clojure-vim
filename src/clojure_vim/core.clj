(ns clojure-vim.core
  (:gen-class))
(use '[clojure.string :only [trim-newline]]
     '[clojure.java.shell :only [sh]])

(defn -main
  []
    (doseq [i [1 2 3]]
    (let [file-name (str "test" i ".txt")
          working-directory (trim-newline (:out (sh "printenv" "PWD")))]
      (spit file-name "")

      (let [process-builder (java.lang.ProcessBuilder. (list "vim" (str working-directory "/" file-name)))
            inherit (java.lang.ProcessBuilder$Redirect/INHERIT)]
      (.redirectOutput process-builder inherit)
      (.redirectError process-builder inherit)
      (.redirectInput process-builder inherit)

      (.waitFor (.start process-builder))
      )
      ;additional processing here
    )
    )
    (System/exit 0)
    )
