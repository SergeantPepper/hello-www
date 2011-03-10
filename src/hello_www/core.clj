(ns hello-www.core
  (:use compojure.core)
  (:require hello-www.main.views ))

(def app
     (routes hello-www.main.views/patterns))
