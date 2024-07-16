(ns happyapi.google.travelimpactmodel-v1
  "Travel Impact Model API
Travel Impact Model API lets you query travel carbon emission estimates.
See: https://developers.google.com/travel/impact-model"
  (:require [happyapi.providers.google :as client]))

(defn flights-computeFlightEmissions
  "Stateless method to retrieve emission estimates. Details on how emission estimates are computed: https://github.com/google/travel-impact-model The response will contain all entries that match the input flight legs, in the same order. If there are no estimates available for a certain flight leg, the response will return the flight leg object with empty emission fields. The request will still be considered successful. Reasons for missing emission estimates include: - The flight is unknown to the server. - The input flight leg is missing one or more identifiers. - The flight date is in the past. - The aircraft type is not supported by the model. - Missing seat configuration. The request can contain up to 1000 flight legs. If the request has more than 1000 direct flights, if will fail with an INVALID_ARGUMENT error.
https://developers.google.com/travel/impact-model/v1/reference/rest/v1/flights/computeFlightEmissions

ComputeFlightEmissionsRequest:
ComputeFlightEmissionsRequest"
  [ComputeFlightEmissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://travelimpactmodel.googleapis.com/v1/flights:computeFlightEmissions",
     :uri-template-args {},
     :query-params {},
     :scopes nil,
     :body ComputeFlightEmissionsRequest}))
