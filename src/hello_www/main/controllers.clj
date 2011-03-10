(ns hello-www.main.controllers
  (:use hiccup.core)
  (:require [hello-www.views :as base]))

(defhtml hello-world []
  (base/base {:name "Cristian"}))
