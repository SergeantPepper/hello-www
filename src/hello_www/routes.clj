(ns hello-www.routes
  (:use compojure.core)
  (:require [compojure.handler :as handler]))

(defn site-routes
  "Convenience function that wraps the handlers made from routes with site handlers"
  [& handlers]
  (handler/site (apply routes handlers)))

(defmacro def-site-routes [name & handlers]
  `(def ~name (site-routes ~@handlers)))
