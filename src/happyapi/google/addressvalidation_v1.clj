(ns happyapi.google.addressvalidation-v1
  "Address Validation API
The Address Validation API allows developers to verify the accuracy of addresses. Given an address, it returns information about the correctness of the components of the parsed address, a geocode, and a verdict on the deliverability of the parsed address.
See: https://developers.google.com/maps/documentation/address-validation")

(defn provideValidationFeedback
  "Feedback about the outcome of the sequence of validation attempts. This should be the last call made after a sequence of validation calls for the same address, and should be called once the transaction is concluded. This should only be sent once for the sequence of `ValidateAddress` requests needed to validate an address fully.
https://developers.google.com/maps/documentation/address-validation/v1/reference/rest/v1/provideValidationFeedback

GoogleMapsAddressvalidationV1ProvideValidationFeedbackRequest:
GoogleMapsAddressvalidationV1ProvideValidationFeedbackRequest"
  [GoogleMapsAddressvalidationV1ProvideValidationFeedbackRequest]
  {:method :post,
   :uri-template
   "https://addressvalidation.googleapis.com/v1:provideValidationFeedback",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/maps-platform.addressvalidation"],
   :body GoogleMapsAddressvalidationV1ProvideValidationFeedbackRequest})

(defn validateAddress
  "Validates an address.
https://developers.google.com/maps/documentation/address-validation/v1/reference/rest/v1/validateAddress

GoogleMapsAddressvalidationV1ValidateAddressRequest:
GoogleMapsAddressvalidationV1ValidateAddressRequest"
  [GoogleMapsAddressvalidationV1ValidateAddressRequest]
  {:method :post,
   :uri-template
   "https://addressvalidation.googleapis.com/v1:validateAddress",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/maps-platform.addressvalidation"],
   :body GoogleMapsAddressvalidationV1ValidateAddressRequest})
