(ns happyapi.google.merchantapi-reports_v1beta
  "Merchant API
Programmatically manage your Merchant Center Accounts.
See: https://login.corp.google.com/request?s=developers.devsite.corp.google.com:443/uberproxy/&d=https://developers.devsite.corp.google.com/merchant/api%3Fupxsrf%3DAIMNFbdwKiGvl4skH_nF87l69K59SzsXfVDT52TBfdOXGKnT7w:1725303358509&maxAge=1200&authLevel=2000000&keyIds=DU5,2O9,Ju3,A_Z&3pd=1&c=1"
  (:require [happyapi.providers.google :as client]))

(defn accounts-reports-search
  "Retrieves a report defined by a search query. The response might contain fewer rows than specified by `page_size`. Rely on `next_page_token` to determine if there are more rows to be requested.
https://login.corp.google.com/request?s=developers.devsite.corp.google.com:443/uberproxy/&d=https://developers.devsite.corp.google.com/merchant/api%3Fupxsrf%3DAIMNFbdwKiGvl4skH_nF87l69K59SzsXfVDT52TBfdOXGKnT7w:1725303358509&maxAge=1200&authLevel=2000000&keyIds=DU5,2O9,Ju3,A_Z&3pd=1&c=1/reports_v1beta/reference/rest/reports_v1beta/accounts/reports/search

parent <> 
SearchRequest:
SearchRequest"
  [parent SearchRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://merchantapi.googleapis.com/reports/v1beta/{+parent}/reports:search",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body SearchRequest}))
