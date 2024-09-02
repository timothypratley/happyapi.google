(ns happyapi.google.mybusinesslodging-v1
  "My Business Lodging API
The My Business Lodging API enables managing lodging business information on Google. Note - If you have a quota of 0 after enabling the API, please request for GBP API access.
See: https://developers.google.com/my-business/"
  (:require [happyapi.providers.google :as client]))

(defn locations-getLodging
  "Returns the Lodging of a specific location.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/getLodging

name <> 

optional:
readMask <string> Required. The specific fields to return. Use \"*\" to include all fields. Repeated field items cannot be individually specified."
  ([name] (locations-getLodging name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://mybusinesslodging.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes nil})))

(defn locations-updateLodging
  "Updates the Lodging of a specific location.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/updateLodging

name <> 
Lodging:
Lodging

optional:
updateMask <string> Required. The specific fields to update. Use \"*\" to update all fields, which may include unsetting empty fields in the request. Repeated field items cannot be individually updated."
  ([name Lodging] (locations-updateLodging name Lodging nil))
  ([name Lodging optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://mybusinesslodging.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes nil,
       :body Lodging})))

(defn locations-lodging-getGoogleUpdated
  "Returns the Google updated Lodging of a specific location.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/lodging/getGoogleUpdated

name <> 

optional:
readMask <string> Required. The specific fields to return. Use \"*\" to include all fields. Repeated field items cannot be individually specified."
  ([name] (locations-lodging-getGoogleUpdated name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://mybusinesslodging.googleapis.com/v1/{+name}:getGoogleUpdated",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes nil})))
