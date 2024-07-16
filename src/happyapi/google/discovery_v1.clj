(ns happyapi.google.discovery-v1
  "API Discovery Service
Provides information about other Google APIs, such as what APIs are available, the resource, and method details for each API.
See: https://developers.google.com/discovery/"
  (:require [happyapi.providers.google :as client]))

(defn apis-getRest
  "Retrieve the description of a particular version of an api.
https://developers.google.com/discovery/v1/reference/rest/v1/apis/getRest

api <> 
version <> "
  [api version]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/discovery/v1/apis/{api}/{version}/rest",
     :uri-template-args {"api" api, "version" version},
     :query-params {},
     :scopes nil}))

(defn apis-list
  "Retrieve the list of APIs supported at this endpoint.
https://developers.google.com/discovery/v1/reference/rest/v1/apis/list

optional:
name <string> Only include APIs with the given name.
preferred <boolean> Return only the preferred version of an API."
  ([] (apis-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template "https://www.googleapis.com/discovery/v1/apis",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes nil})))
