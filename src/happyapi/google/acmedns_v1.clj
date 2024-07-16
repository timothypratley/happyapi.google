(ns happyapi.google.acmedns-v1
  "ACME DNS API
Google Domains ACME DNS API that allows users to complete ACME DNS-01 challenges for a domain.
See: https://developers.google.com/domains/acme-dns/"
  (:require [happyapi.providers.google :as client]))

(defn acmeChallengeSets-rotateChallenges
  "Rotate the ACME challenges for a given domain name. By default, removes any challenges that are older than 30 days. Domain names must be provided in Punycode.
https://developers.google.com/domains/acme-dns/v1/reference/rest/v1/acmeChallengeSets/rotateChallenges

rootDomain <> 
RotateChallengesRequest:
RotateChallengesRequest"
  [rootDomain RotateChallengesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://acmedns.googleapis.com/v1/acmeChallengeSets/{rootDomain}:rotateChallenges",
     :uri-template-args {"rootDomain" rootDomain},
     :query-params {},
     :scopes nil,
     :body RotateChallengesRequest}))

(defn acmeChallengeSets-get
  "Gets the ACME challenge set for a given domain name. Domain names must be provided in Punycode.
https://developers.google.com/domains/acme-dns/v1/reference/rest/v1/acmeChallengeSets/get

rootDomain <> "
  [rootDomain]
  (client/api-request
    {:method :get,
     :uri-template
     "https://acmedns.googleapis.com/v1/acmeChallengeSets/{rootDomain}",
     :uri-template-args {"rootDomain" rootDomain},
     :query-params {},
     :scopes nil}))
