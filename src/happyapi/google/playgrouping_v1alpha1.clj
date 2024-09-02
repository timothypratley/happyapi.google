(ns happyapi.google.playgrouping-v1alpha1
  "Google Play Grouping API
playgrouping.googleapis.com API.
See: https://cloud.google.com/playgrouping/"
  (:require [happyapi.providers.google :as client]))

(defn apps-tokens-verify
  "Verify an API token by asserting the app and persona it belongs to. The verification is a protection against client-side attacks and will fail if the contents of the token don't match the provided values. A token must be verified before it can be used to manipulate user tags.
https://cloud.google.com/playgrouping/v1alpha1/reference/rest/v1alpha1/apps/tokens/verify

appPackage <> 
token <> 
VerifyTokenRequest:
VerifyTokenRequest"
  [appPackage token VerifyTokenRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://playgrouping.googleapis.com/v1alpha1/{+appPackage}/{+token}:verify",
     :uri-template-args {"token" token, "appPackage" appPackage},
     :query-params {},
     :scopes nil,
     :body VerifyTokenRequest}))

(defn apps-tokens-tags-createOrUpdate
  "Create or update tags for the user and app that are represented by the given token.
https://cloud.google.com/playgrouping/v1alpha1/reference/rest/v1alpha1/apps/tokens/tags/createOrUpdate

appPackage <> 
token <> 
CreateOrUpdateTagsRequest:
CreateOrUpdateTagsRequest"
  [appPackage token CreateOrUpdateTagsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://playgrouping.googleapis.com/v1alpha1/{+appPackage}/{+token}/tags:createOrUpdate",
     :uri-template-args {"token" token, "appPackage" appPackage},
     :query-params {},
     :scopes nil,
     :body CreateOrUpdateTagsRequest}))
