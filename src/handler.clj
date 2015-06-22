(ns clojure-cocktails.handler
  (:require [compojure.core :refer :all]
            [clojure-cocktails.views :as views]
            [clojure-cocktails.db :as db]
            [compojure.route :as route]
            [compojure.handler :as handler]
        
            ))

(defroutes app-routes
  (GET "/"
       []
       (views/home-page))
  (GET "/all-cocktails"
       []
       (views/all-cocktails-page))
  (GET "/select-cocktail"
       []
       (views/select-cocktail-page))
  
  (route/resources "/")
  (route/not-found "Not Found"))
