(ns hello-web.handler
  (:require (compojure [core :refer [defroutes routes]]
                       [handler :as handler]
                       [route :as route])
            (ring.middleware [file-info :refer [wrap-file-info]]
                             [resource :refer [wrap-resource]])
            [hiccup.middleware :refer [wrap-base-url]]
            [hello-web.routes.home :refer [home-routes]]))

(defn init []
  (println "hello-web is starting"))

(defn destroy []
  (println "hello-web is shutting down"))

(defroutes app-routes
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (routes home-routes app-routes)
      (handler/site)
      (wrap-base-url)))
