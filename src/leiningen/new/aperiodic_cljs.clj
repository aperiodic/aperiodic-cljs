(ns leiningen.new.aperiodic-cljs
  (:use [leiningen.new.templates :only [->files name-to-path project-name
                                        renderer sanitize-ns year]]))

(def render (renderer "aperiodic-cljs"))

(defn aperiodic-cljs
  "My cljs development starting point. Compiles a single cljs file to main.js,
  and serves it using a simple compojure server."
  [name]
  (let [data {:raw-name name
              :name (project-name name)
              :namespace (sanitize-ns name)
              :path (name-to-path name)
              :year (year)}]
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]
             [".gitignore" (render "gitignore" data)]
             ["src/clj/{{path}}/routes.clj" (render "routes.clj" data)]
             ["src/clj/{{path}}/views.clj" (render "views.clj" data)]
             ["src/cljs/{{path}}/{{name}}.cljs" (render "name.cljs" data)])))
