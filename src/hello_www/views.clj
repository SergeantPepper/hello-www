(ns hello-www.views
  (:use hiccup.core))

(defhtml base [data]
  (html [:head [:title "Welcome"]]
        [:body
         [:h1 "Welcome "
          (if (contains? data :name)
            (:name data))]
         [:div [:img {:src "/public/logo.png"}]]]))
