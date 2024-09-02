(ns happyapi.google.verifiedaccess-v2
  "Chrome Verified Access API
API for Verified Access chrome extension to provide credential verification for chrome devices connecting to an enterprise network
See: https://developers.google.com/chrome/verified-access"
  (:require [happyapi.providers.google :as client]))

(defn challenge-generate
  "Generates a new challenge.
https://developers.google.com/chrome/verified-access/v2/reference/rest/v2/challenge/generate

Empty:
Empty"
  [Empty]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://verifiedaccess.googleapis.com/v2/challenge:generate",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/verifiedaccess"],
     :body Empty}))

(defn challenge-verify
  "Verifies the challenge response.
https://developers.google.com/chrome/verified-access/v2/reference/rest/v2/challenge/verify

VerifyChallengeResponseRequest:
VerifyChallengeResponseRequest"
  [VerifyChallengeResponseRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://verifiedaccess.googleapis.com/v2/challenge:verify",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/verifiedaccess"],
     :body VerifyChallengeResponseRequest}))
