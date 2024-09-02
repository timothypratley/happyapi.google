(ns happyapi.google.identitytoolkit-v3
  "Google Identity Toolkit API
Help the third party sites to implement federated login.
See: https://developers.google.com/identity/toolkit/migrate-identityplatform"
  (:require [happyapi.providers.google :as client]))

(defn relyingparty-uploadAccount
  "Batch upload existing user accounts.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/uploadAccount

IdentitytoolkitRelyingpartyUploadAccountRequest:
IdentitytoolkitRelyingpartyUploadAccountRequest"
  [IdentitytoolkitRelyingpartyUploadAccountRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/uploadAccount",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"],
     :body IdentitytoolkitRelyingpartyUploadAccountRequest}))

(defn relyingparty-downloadAccount
  "Batch download user accounts.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/downloadAccount

IdentitytoolkitRelyingpartyDownloadAccountRequest:
IdentitytoolkitRelyingpartyDownloadAccountRequest"
  [IdentitytoolkitRelyingpartyDownloadAccountRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/downloadAccount",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"],
     :body IdentitytoolkitRelyingpartyDownloadAccountRequest}))

(defn relyingparty-resetPassword
  "Reset password for a user.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/resetPassword

IdentitytoolkitRelyingpartyResetPasswordRequest:
IdentitytoolkitRelyingpartyResetPasswordRequest"
  [IdentitytoolkitRelyingpartyResetPasswordRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/resetPassword",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartyResetPasswordRequest}))

(defn relyingparty-getProjectConfig
  "Get project configuration.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/getProjectConfig

optional:
delegatedProjectNumber <string> Delegated GCP project number of the request.
projectNumber <string> GCP project number of the request."
  ([] (relyingparty-getProjectConfig nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://www.googleapis.com/identitytoolkit/v3/relyingparty/getProjectConfig",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn relyingparty-setAccountInfo
  "Set account info for a user.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/setAccountInfo

IdentitytoolkitRelyingpartySetAccountInfoRequest:
IdentitytoolkitRelyingpartySetAccountInfoRequest"
  [IdentitytoolkitRelyingpartySetAccountInfoRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/setAccountInfo",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartySetAccountInfoRequest}))

(defn relyingparty-verifyCustomToken
  "Verifies the developer asserted ID token.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/verifyCustomToken

IdentitytoolkitRelyingpartyVerifyCustomTokenRequest:
IdentitytoolkitRelyingpartyVerifyCustomTokenRequest"
  [IdentitytoolkitRelyingpartyVerifyCustomTokenRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/verifyCustomToken",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartyVerifyCustomTokenRequest}))

(defn relyingparty-verifyAssertion
  "Verifies the assertion returned by the IdP.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/verifyAssertion

IdentitytoolkitRelyingpartyVerifyAssertionRequest:
IdentitytoolkitRelyingpartyVerifyAssertionRequest"
  [IdentitytoolkitRelyingpartyVerifyAssertionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/verifyAssertion",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartyVerifyAssertionRequest}))

(defn relyingparty-setProjectConfig
  "Set project configuration.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/setProjectConfig

IdentitytoolkitRelyingpartySetProjectConfigRequest:
IdentitytoolkitRelyingpartySetProjectConfigRequest"
  [IdentitytoolkitRelyingpartySetProjectConfigRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/setProjectConfig",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartySetProjectConfigRequest}))

(defn relyingparty-sendVerificationCode
  "Send SMS verification code.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/sendVerificationCode

IdentitytoolkitRelyingpartySendVerificationCodeRequest:
IdentitytoolkitRelyingpartySendVerificationCodeRequest"
  [IdentitytoolkitRelyingpartySendVerificationCodeRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/sendVerificationCode",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartySendVerificationCodeRequest}))

(defn relyingparty-signOutUser
  "Sign out user.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/signOutUser

IdentitytoolkitRelyingpartySignOutUserRequest:
IdentitytoolkitRelyingpartySignOutUserRequest"
  [IdentitytoolkitRelyingpartySignOutUserRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/signOutUser",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartySignOutUserRequest}))

(defn relyingparty-signupNewUser
  "Signup new user.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/signupNewUser

IdentitytoolkitRelyingpartySignupNewUserRequest:
IdentitytoolkitRelyingpartySignupNewUserRequest"
  [IdentitytoolkitRelyingpartySignupNewUserRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/signupNewUser",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartySignupNewUserRequest}))

(defn relyingparty-deleteAccount
  "Delete user account.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/deleteAccount

IdentitytoolkitRelyingpartyDeleteAccountRequest:
IdentitytoolkitRelyingpartyDeleteAccountRequest"
  [IdentitytoolkitRelyingpartyDeleteAccountRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/deleteAccount",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartyDeleteAccountRequest}))

(defn relyingparty-getAccountInfo
  "Returns the account info.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/getAccountInfo

IdentitytoolkitRelyingpartyGetAccountInfoRequest:
IdentitytoolkitRelyingpartyGetAccountInfoRequest"
  [IdentitytoolkitRelyingpartyGetAccountInfoRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/getAccountInfo",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartyGetAccountInfoRequest}))

(defn relyingparty-getPublicKeys
  "Get token signing public key.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/getPublicKeys"
  []
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/publicKeys",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn relyingparty-getRecaptchaParam
  "Get recaptcha secure param.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/getRecaptchaParam"
  []
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/getRecaptchaParam",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn relyingparty-emailLinkSignin
  "Reset password for a user.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/emailLinkSignin

IdentitytoolkitRelyingpartyEmailLinkSigninRequest:
IdentitytoolkitRelyingpartyEmailLinkSigninRequest"
  [IdentitytoolkitRelyingpartyEmailLinkSigninRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/emailLinkSignin",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartyEmailLinkSigninRequest}))

(defn relyingparty-getOobConfirmationCode
  "Get a code for user action confirmation.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/getOobConfirmationCode

Relyingparty:
Relyingparty"
  [Relyingparty]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/getOobConfirmationCode",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Relyingparty}))

(defn relyingparty-verifyPassword
  "Verifies the user entered password.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/verifyPassword

IdentitytoolkitRelyingpartyVerifyPasswordRequest:
IdentitytoolkitRelyingpartyVerifyPasswordRequest"
  [IdentitytoolkitRelyingpartyVerifyPasswordRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/verifyPassword",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartyVerifyPasswordRequest}))

(defn relyingparty-createAuthUri
  "Creates the URI used by the IdP to authenticate the user.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/createAuthUri

IdentitytoolkitRelyingpartyCreateAuthUriRequest:
IdentitytoolkitRelyingpartyCreateAuthUriRequest"
  [IdentitytoolkitRelyingpartyCreateAuthUriRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/createAuthUri",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartyCreateAuthUriRequest}))

(defn relyingparty-verifyPhoneNumber
  "Verifies ownership of a phone number and creates/updates the user account accordingly.
https://developers.google.com/identity/toolkit/migrate-identityplatform/v3/reference/rest/v3/relyingparty/verifyPhoneNumber

IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest:
IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest"
  [IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://www.googleapis.com/identitytoolkit/v3/relyingparty/verifyPhoneNumber",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest}))
