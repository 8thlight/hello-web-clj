(ns hello-web.routes.home
  (:require [compojure.core :refer :all]
            [hello-web.views.layout :as layout]))

(defn home []
  (layout/common [:h1 "Dear 8th Light,"]
  				 [:p  
				 "After watching the promotional video on your splash 
				 page, I noticed a great deal of Clojure on the screens
				 of your developers. My interest was piqued, because
				 I don't often see Clojure in web development."]
				 [:p  
				 "I poked around your company GitHub account, and found
				 this handy little starter repo for web dev in Clojure.
				 I hope to see you at the Fullstack Hiring Day. But if
				 not, I wanted to thank you for this lovely little
				 starter pack."]
				 [:p  
				 "I am attracted to your passionate commitment to quality
				 software and the craftsmanship of code. If we get the
				 chance to talk, I look forward to learning more about
				 your apprenticeship program and the sorts of projects
				 that get you excited."]))
(defroutes home-routes
  (GET "/" [] (home)))
