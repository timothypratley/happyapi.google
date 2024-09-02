(ns happyapi.google.playcustomapp-v1
  "Google Play Custom App Publishing API
API to create and publish custom Android apps
See: https://developers.google.com/android/work/play/custom-app-api/"
  (:require [happyapi.providers.google :as client]))

(defn accounts-customApps-create
  "Creates a new custom app.
https://developers.google.com/android/work/play/custom-app-api/v1/reference/rest/v1/accounts/customApps/create

account <> 
CustomApp:
CustomApp"
  [account CustomApp]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://playcustomapp.googleapis.com/playcustomapp/v1/accounts/{account}/customApps",
     :uri-template-args {"account" account},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidpublisher"],
     :body CustomApp}))
