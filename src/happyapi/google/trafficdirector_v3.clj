(ns happyapi.google.trafficdirector-v3
  "Traffic Director API

See: https://cloud.google.com/products/service-mesh")

(defn discovery-client_status
  "
https://cloud.google.com/products/service-mesh/v3/reference/rest/v3/discovery/client_status

ClientStatusRequest:
ClientStatusRequest"
  [ClientStatusRequest]
  {:method :post,
   :uri-template
   "https://trafficdirector.googleapis.com/v3/discovery:client_status",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ClientStatusRequest})
