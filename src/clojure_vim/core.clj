(ns clojure-vim.core
  (:gen-class))

(defn -main
  []
  (for [i [1 2 3]]
    (let [file-name (str "test" i ".txt")]
      ; Create a temporary empty file
      (spit file-name "")

      ; Now I need to run vim, so I can edit file-name interactively.

      ; YOUR CODE TO RUN vim GOES HERE

      ; After I close vim, this script execution should continue,
      ; so I can do some processing of file-name's new content (isn't relevant to this task)
  )))

; So basically after I compile the project and run
; java -jar target/uberjar/clojure-vim-0.1.0-standalone.jar
; I should be presented with vim to edit test1.txt, then test2.txt, and finally test3.txt.

; I don't need a cover letter,
; but when applying for the job add "hey-ho" text as your cover letter or in a private comment,
; so I know that you read the whole core.clj.
; Applications without "hey-ho" text won't be considered.
