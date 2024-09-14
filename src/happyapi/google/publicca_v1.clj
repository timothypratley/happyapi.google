(ns happyapi.google.publicca-v1
  "Public Certificate Authority API
The Public Certificate Authority API may be used to create and manage ACME external account binding keys associated with Google Trust Services' publicly trusted certificate authority. 
See: https://cloud.google.com/certificate-manager/docs")

(defn projects-locations-externalAccountKeys-create
  "Creates a new ExternalAccountKey bound to the project.
https://cloud.google.com/certificate-manager/docs/v1/reference/rest/v1/projects/locations/externalAccountKeys/create

parent <> 
ExternalAccountKey:
ExternalAccountKey"
  [parent ExternalAccountKey]
  {:method :post,
   :uri-template
   "https://publicca.googleapis.com/v1/{+parent}/externalAccountKeys",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ExternalAccountKey})
