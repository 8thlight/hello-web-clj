(ns hello-web.handler-spec
  (:require [speclj.core :refer :all]
            [ring.mock.request :refer :all]
            [hello-web.handler :refer :all]))

(describe "Testing the web app"

  (it "GET '/' should say Dear 8th Light."
      (let [response (app (request :get "/"))]
        (should (.contains (:body response) "Dear 8th Light,"))
        (should= 200 (:status response))))

  (it "GET '/invalid' should say Not Found"
      (let [response (app (request :get "/invalid"))]
        (should= 404 (:status response)))))

(run-specs)
