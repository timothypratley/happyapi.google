(ns happyapi.google.acceleratedmobilepageurl-v1
  "Accelerated Mobile Pages (AMP) URL API
Retrieves the list of AMP URLs (and equivalent AMP Cache URLs) for a given list of public URL(s). 
See: https://developers.google.com/amp/cache/"
  (:require [happyapi.providers.google :as client]))

(defn ampUrls-batchGet
  "Returns AMP URL(s) and equivalent [AMP Cache URL(s)](/amp/cache/overview#amp-cache-url-format).
https://developers.google.com/amp/cache/v1/reference/rest/v1/ampUrls/batchGet

BatchGetAmpUrlsRequest:
BatchGetAmpUrlsRequest"
  [BatchGetAmpUrlsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://acceleratedmobilepageurl.googleapis.com/v1/ampUrls:batchGet",
     :uri-template-args {},
     :query-params {},
     :scopes nil,
     :body BatchGetAmpUrlsRequest}))
