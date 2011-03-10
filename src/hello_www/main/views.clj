(ns hello-www.main.views
  (:use compojure.core
        hiccup.core
        hello-www.routes)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [hello-www.main.controllers :as controllers]))

(def-site-routes patterns 
  (GET "/" [] (controllers/hello-world))
  (route/resources "/" {:root "public"})
  (route/not-found "Page not found"))
