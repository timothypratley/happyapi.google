(ns happyapi.google.chromeuxreport-v1
  "Chrome UX Report API
The Chrome UX Report API lets you view real user experience data for millions of websites. 
See: https://developer.chrome.com/docs/crux/api/")

(defn records-queryRecord
  "Queries the Chrome User Experience for a single `record` for a given site. Returns a `record` that contains one or more `metrics` corresponding to performance data about the requested site.
https://developer.chrome.com/docs/crux/api/v1/reference/rest/v1/records/queryRecord

QueryRequest:
QueryRequest"
  [QueryRequest]
  {:method :post,
   :uri-template
   "https://chromeuxreport.googleapis.com/v1/records:queryRecord",
   :uri-template-args {},
   :query-params {},
   :scopes nil,
   :body QueryRequest})

(defn records-queryHistoryRecord
  "Queries the Chrome User Experience Report for a timeseries `history record` for a given site. Returns a `history record` that contains one or more `metric timeseries` corresponding to performance data about the requested site.
https://developer.chrome.com/docs/crux/api/v1/reference/rest/v1/records/queryHistoryRecord

QueryHistoryRequest:
QueryHistoryRequest"
  [QueryHistoryRequest]
  {:method :post,
   :uri-template
   "https://chromeuxreport.googleapis.com/v1/records:queryHistoryRecord",
   :uri-template-args {},
   :query-params {},
   :scopes nil,
   :body QueryHistoryRequest})
