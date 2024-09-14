(ns happyapi.google.mybusinessverifications-v1
  "My Business Verifications API
The My Business Verifications API provides an interface for taking verifications related actions for locations.
See: https://developers.google.com/my-business/")

(defn locations-getVoiceOfMerchantState
  "Gets the VoiceOfMerchant state.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/getVoiceOfMerchantState

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://mybusinessverifications.googleapis.com/v1/{+name}/VoiceOfMerchantState",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn locations-fetchVerificationOptions
  "Reports all eligible verification options for a location in a specific language.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/fetchVerificationOptions

location <> 
FetchVerificationOptionsRequest:
FetchVerificationOptionsRequest"
  [location FetchVerificationOptionsRequest]
  {:method :post,
   :uri-template
   "https://mybusinessverifications.googleapis.com/v1/{+location}:fetchVerificationOptions",
   :uri-template-args {"location" location},
   :query-params {},
   :scopes nil,
   :body FetchVerificationOptionsRequest})

(defn locations-verify
  "Starts the verification process for a location.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/verify

name <> 
VerifyLocationRequest:
VerifyLocationRequest"
  [name VerifyLocationRequest]
  {:method :post,
   :uri-template
   "https://mybusinessverifications.googleapis.com/v1/{+name}:verify",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil,
   :body VerifyLocationRequest})

(defn locations-verifications-complete
  "Completes a `PENDING` verification. It is only necessary for non `AUTO` verification methods. `AUTO` verification request is instantly `VERIFIED` upon creation.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/verifications/complete

name <> 
CompleteVerificationRequest:
CompleteVerificationRequest"
  [name CompleteVerificationRequest]
  {:method :post,
   :uri-template
   "https://mybusinessverifications.googleapis.com/v1/{+name}:complete",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil,
   :body CompleteVerificationRequest})

(defn locations-verifications-list
  "List verifications of a location, ordered by create time.
https://developers.google.com/my-business/v1/reference/rest/v1/locations/verifications/list

parent <> 

optional:
pageSize <integer> How many verification to include per page. Minimum is 1, and the default and maximum page size is 100."
  ([parent] (locations-verifications-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://mybusinessverifications.googleapis.com/v1/{+parent}/verifications",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes nil}))
