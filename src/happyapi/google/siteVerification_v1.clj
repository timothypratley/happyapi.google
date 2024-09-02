(ns happyapi.google.siteVerification-v1
  "Google Site Verification API
Verifies ownership of websites or domains with Google.
See: https://developers.google.com/site-verification/"
  (:require [happyapi.providers.google :as client]))

(defn webResource-delete
  "Relinquish ownership of a website or domain.
https://developers.google.com/site-verification/v1/reference/rest/v1/webResource/delete

id <> "
  [id]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://www.googleapis.com/siteVerification/v1/webResource/{id}",
     :uri-template-args {"id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/siteverification"]}))

(defn webResource-get
  "Get the most current data for a website or domain.
https://developers.google.com/site-verification/v1/reference/rest/v1/webResource/get

id <> "
  [id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://www.googleapis.com/siteVerification/v1/webResource/{id}",
     :uri-template-args {"id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/siteverification"]}))

(defn webResource-getToken
  "Get a verification token for placing on a website or domain.
https://developers.google.com/site-verification/v1/reference/rest/v1/webResource/getToken

SiteVerificationWebResourceGettokenRequest:
SiteVerificationWebResourceGettokenRequest"
  [SiteVerificationWebResourceGettokenRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/siteVerification/v1/token",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/siteverification"
      "https://www.googleapis.com/auth/siteverification.verify_only"],
     :body SiteVerificationWebResourceGettokenRequest}))

(defn webResource-insert
  "Attempt verification of a website or domain.
https://developers.google.com/site-verification/v1/reference/rest/v1/webResource/insert

verificationMethod <> 
SiteVerificationWebResourceResource:
SiteVerificationWebResourceResource"
  [verificationMethod SiteVerificationWebResourceResource]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/siteVerification/v1/webResource",
     :uri-template-args {},
     :query-params {"verificationMethod" verificationMethod},
     :scopes
     ["https://www.googleapis.com/auth/siteverification"
      "https://www.googleapis.com/auth/siteverification.verify_only"],
     :body SiteVerificationWebResourceResource}))

(defn webResource-list
  "Get the list of your verified websites and domains.
https://developers.google.com/site-verification/v1/reference/rest/v1/webResource/list"
  []
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://www.googleapis.com/siteVerification/v1/webResource",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/siteverification"]}))

(defn webResource-patch
  "Modify the list of owners for your website or domain. This method supports patch semantics.
https://developers.google.com/site-verification/v1/reference/rest/v1/webResource/patch

id <> 
SiteVerificationWebResourceResource:
SiteVerificationWebResourceResource"
  [id SiteVerificationWebResourceResource]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/siteVerification/v1/webResource/{id}",
     :uri-template-args {"id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/siteverification"],
     :body SiteVerificationWebResourceResource}))

(defn webResource-update
  "Modify the list of owners for your website or domain.
https://developers.google.com/site-verification/v1/reference/rest/v1/webResource/update

id <> 
SiteVerificationWebResourceResource:
SiteVerificationWebResourceResource"
  [id SiteVerificationWebResourceResource]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://www.googleapis.com/siteVerification/v1/webResource/{id}",
     :uri-template-args {"id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/siteverification"],
     :body SiteVerificationWebResourceResource}))
