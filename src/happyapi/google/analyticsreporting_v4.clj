(ns happyapi.google.analyticsreporting-v4
  "Analytics Reporting API
Accesses Analytics report data.
See: https://developers.google.com/analytics/legacy/universal-analytics"
  (:require [happyapi.providers.google :as client]))

(defn reports-batchGet
  "Returns the Analytics data.
https://developers.google.com/analytics/legacy/universal-analytics/v4/reference/rest/v4/reports/batchGet

GetReportsRequest:
GetReportsRequest"
  [GetReportsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://analyticsreporting.googleapis.com/v4/reports:batchGet",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.readonly"],
     :body GetReportsRequest}))

(defn userActivity-search
  "Returns User Activity data.
https://developers.google.com/analytics/legacy/universal-analytics/v4/reference/rest/v4/userActivity/search

SearchUserActivityRequest:
SearchUserActivityRequest"
  [SearchUserActivityRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://analyticsreporting.googleapis.com/v4/userActivity:search",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics"
      "https://www.googleapis.com/auth/analytics.readonly"],
     :body SearchUserActivityRequest}))
