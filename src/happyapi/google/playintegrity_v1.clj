(ns happyapi.google.playintegrity-v1
  "Google Play Integrity API
The Play Integrity API helps you check that you're interacting with your genuine app on a genuine Android device powered by Google Play services. The Play Integrity API has replaced SafetyNet Attestation and Android Device Verification.
See: https://developer.android.com/google/play/integrity"
  (:require [happyapi.providers.google :as client]))

(defn decodeIntegrityToken
  "Decodes the integrity token and returns the token payload.
https://developer.android.com/google/play/integrity/v1/reference/rest/v1/decodeIntegrityToken

packageName <> 
DecodeIntegrityTokenRequest:
DecodeIntegrityTokenRequest"
  [packageName DecodeIntegrityTokenRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://playintegrity.googleapis.com/v1/{+packageName}:decodeIntegrityToken",
     :uri-template-args {"packageName" packageName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/playintegrity"],
     :body DecodeIntegrityTokenRequest}))

(defn deviceRecall-write
  "Writes recall bits for the device where Play Integrity API token is obtained. The endpoint is available to select Play partners in an early access program (EAP).
https://developer.android.com/google/play/integrity/v1/reference/rest/v1/deviceRecall/write

packageName <> 
WriteDeviceRecallRequest:
WriteDeviceRecallRequest"
  [packageName WriteDeviceRecallRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://playintegrity.googleapis.com/v1/{+packageName}/deviceRecall:write",
     :uri-template-args {"packageName" packageName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/playintegrity"],
     :body WriteDeviceRecallRequest}))
