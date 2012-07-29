(ns {{namespace}}.routes
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response])
  (:use [compojure core]
        [hiccup.middleware :only [wrap-base-url]]
        [{{namespace}}.views :only [index]]))

(defroutes {{name}}-routes
  (GET "/" [] (index))
  (route/resources "/")
  (route/not-found "Page not found"))

(def handler
  (-> (handler/site {{name}}-routes)
    (wrap-base-url)))
