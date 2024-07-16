(ns happyapi.google.admob-v1
  "AdMob API
The AdMob API allows publishers to programmatically get information about their AdMob account. 
See: https://developers.google.com/admob/api/"
  (:require [happyapi.providers.google :as client]))

(defn accounts-get
  "Gets information about the specified AdMob publisher account.
https://developers.google.com/admob/api/v1/reference/rest/v1/accounts/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://admob.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/admob.readonly"
      "https://www.googleapis.com/auth/admob.report"]}))

(defn accounts-list
  "Lists the AdMob publisher account that was most recently signed in to from the AdMob UI. For more information, see https://support.google.com/admob/answer/10243672.
https://developers.google.com/admob/api/v1/reference/rest/v1/accounts/list

optional:
pageSize <integer> Maximum number of accounts to return."
  ([] (accounts-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template "https://admob.googleapis.com/v1/accounts",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/admob.readonly"
        "https://www.googleapis.com/auth/admob.report"]})))

(defn accounts-networkReport-generate
  "Generates an AdMob Network report based on the provided report specification. Returns result of a server-side streaming RPC. The result is returned in a sequence of responses.
https://developers.google.com/admob/api/v1/reference/rest/v1/accounts/networkReport/generate

parent <> 
GenerateNetworkReportRequest:
GenerateNetworkReportRequest"
  [parent GenerateNetworkReportRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://admob.googleapis.com/v1/{+parent}/networkReport:generate",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/admob.readonly"
      "https://www.googleapis.com/auth/admob.report"],
     :body GenerateNetworkReportRequest}))

(defn accounts-mediationReport-generate
  "Generates an AdMob Mediation report based on the provided report specification. Returns result of a server-side streaming RPC. The result is returned in a sequence of responses.
https://developers.google.com/admob/api/v1/reference/rest/v1/accounts/mediationReport/generate

parent <> 
GenerateMediationReportRequest:
GenerateMediationReportRequest"
  [parent GenerateMediationReportRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://admob.googleapis.com/v1/{+parent}/mediationReport:generate",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/admob.readonly"
      "https://www.googleapis.com/auth/admob.report"],
     :body GenerateMediationReportRequest}))

(defn accounts-apps-list
  "List the apps under the specified AdMob account.
https://developers.google.com/admob/api/v1/reference/rest/v1/accounts/apps/list

parent <> 

optional:
pageSize <integer> The maximum number of apps to return. If unspecified or 0, at most 10,000 apps will be returned. The maximum value is 20,000; values above 20,000 will be coerced to 20,000."
  ([parent] (accounts-apps-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template "https://admob.googleapis.com/v1/{+parent}/apps",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/admob.readonly"]})))

(defn accounts-adUnits-list
  "List the ad units under the specified AdMob account.
https://developers.google.com/admob/api/v1/reference/rest/v1/accounts/adUnits/list

parent <> 

optional:
pageSize <integer> The maximum number of ad units to return. If unspecified or 0, at most 10,000 ad units will be returned. The maximum value is 20,000; values above 20,000 will be coerced to 20,000."
  ([parent] (accounts-adUnits-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://admob.googleapis.com/v1/{+parent}/adUnits",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/admob.readonly"]})))
