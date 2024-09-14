(ns happyapi.google.indexing-v3
  "Web Search Indexing API
Notifies Google Web Search when your web pages change.
See: https://developers.google.com/search/apis/indexing-api/v3/quickstart")

(defn urlNotifications-publish
  "Notifies that a URL has been updated or deleted.
https://developers.google.com/search/apis/indexing-api/v3/quickstart/v3/reference/rest/v3/urlNotifications/publish

UrlNotification:
UrlNotification"
  [UrlNotification]
  {:method :post,
   :uri-template
   "https://indexing.googleapis.com/v3/urlNotifications:publish",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/indexing"],
   :body UrlNotification})

(defn urlNotifications-getMetadata
  "Gets metadata about a Web Document. This method can _only_ be used to query URLs that were previously seen in successful Indexing API notifications. Includes the latest `UrlNotification` received via this API.
https://developers.google.com/search/apis/indexing-api/v3/quickstart/v3/reference/rest/v3/urlNotifications/getMetadata

optional:
url <string> URL that is being queried."
  ([] (urlNotifications-getMetadata nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://indexing.googleapis.com/v3/urlNotifications/metadata",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/indexing"]}))
