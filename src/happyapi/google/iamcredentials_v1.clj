(ns happyapi.google.iamcredentials-v1
  "IAM Service Account Credentials API
Creates short-lived credentials for impersonating IAM service accounts. Disabling this API also disables the IAM API (iam.googleapis.com). However, enabling this API doesn't enable the IAM API. 
See: https://cloud.google.com/iam/docs/create-short-lived-credentials-direct")

(defn projects-serviceAccounts-generateAccessToken
  "Generates an OAuth 2.0 access token for a service account.
https://cloud.google.com/iam/docs/create-short-lived-credentials-direct/v1/reference/rest/v1/projects/serviceAccounts/generateAccessToken

name <> 
GenerateAccessTokenRequest:
GenerateAccessTokenRequest"
  [name GenerateAccessTokenRequest]
  {:method :post,
   :uri-template
   "https://iamcredentials.googleapis.com/v1/{+name}:generateAccessToken",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GenerateAccessTokenRequest})

(defn projects-serviceAccounts-generateIdToken
  "Generates an OpenID Connect ID token for a service account.
https://cloud.google.com/iam/docs/create-short-lived-credentials-direct/v1/reference/rest/v1/projects/serviceAccounts/generateIdToken

name <> 
GenerateIdTokenRequest:
GenerateIdTokenRequest"
  [name GenerateIdTokenRequest]
  {:method :post,
   :uri-template
   "https://iamcredentials.googleapis.com/v1/{+name}:generateIdToken",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GenerateIdTokenRequest})

(defn projects-serviceAccounts-signBlob
  "Signs a blob using a service account's system-managed private key.
https://cloud.google.com/iam/docs/create-short-lived-credentials-direct/v1/reference/rest/v1/projects/serviceAccounts/signBlob

name <> 
SignBlobRequest:
SignBlobRequest"
  [name SignBlobRequest]
  {:method :post,
   :uri-template
   "https://iamcredentials.googleapis.com/v1/{+name}:signBlob",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SignBlobRequest})

(defn projects-serviceAccounts-signJwt
  "Signs a JWT using a service account's system-managed private key.
https://cloud.google.com/iam/docs/create-short-lived-credentials-direct/v1/reference/rest/v1/projects/serviceAccounts/signJwt

name <> 
SignJwtRequest:
SignJwtRequest"
  [name SignJwtRequest]
  {:method :post,
   :uri-template
   "https://iamcredentials.googleapis.com/v1/{+name}:signJwt",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SignJwtRequest})
