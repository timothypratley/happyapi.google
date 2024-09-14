(ns happyapi.google.sts-v1
  "Security Token Service API
The Security Token Service exchanges Google or third-party credentials for a short-lived access token to Google Cloud resources.
See: https://cloud.google.com/iam/docs/workload-identity-federation")

(defn token
  "Exchanges a credential for a Google OAuth 2.0 access token. The token asserts an external identity within an identity pool, or it applies a Credential Access Boundary to a Google access token. Note that workforce pools do not support Credential Access Boundaries. When you call this method, do not send the `Authorization` HTTP header in the request. This method does not require the `Authorization` header, and using the header can cause the request to fail.
https://cloud.google.com/iam/docs/workload-identity-federation/v1/reference/rest/v1/token

GoogleIdentityStsV1ExchangeTokenRequest:
GoogleIdentityStsV1ExchangeTokenRequest"
  [GoogleIdentityStsV1ExchangeTokenRequest]
  {:method :post,
   :uri-template "https://sts.googleapis.com/v1/token",
   :uri-template-args {},
   :query-params {},
   :scopes nil,
   :body GoogleIdentityStsV1ExchangeTokenRequest})
