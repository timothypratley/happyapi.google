(ns happyapi.google.bigqueryconnection-v1
  "BigQuery Connection API
Allows users to manage BigQuery connections to external data sources.
See: https://cloud.google.com/bigquery/docs/connections-api-intro"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-connections-create
  "Creates a new connection.
https://cloud.google.com/bigquery/docs/connections-api-intro/v1/reference/rest/v1/projects/locations/connections/create

parent <> 
Connection:
Connection

optional:
connectionId <string> Optional. Connection id that should be assigned to the created connection."
  ([parent Connection]
    (projects-locations-connections-create parent Connection nil))
  ([parent Connection optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://bigqueryconnection.googleapis.com/v1/{+parent}/connections",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body Connection})))

(defn projects-locations-connections-get
  "Returns specified connection.
https://cloud.google.com/bigquery/docs/connections-api-intro/v1/reference/rest/v1/projects/locations/connections/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://bigqueryconnection.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-list
  "Returns a list of connections in the given project.
https://cloud.google.com/bigquery/docs/connections-api-intro/v1/reference/rest/v1/projects/locations/connections/list

parent <> 

optional:
pageSize <integer> Required. Page size."
  ([parent] (projects-locations-connections-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://bigqueryconnection.googleapis.com/v1/{+parent}/connections",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-connections-patch
  "Updates the specified connection. For security reasons, also resets credential if connection properties are in the update field mask.
https://cloud.google.com/bigquery/docs/connections-api-intro/v1/reference/rest/v1/projects/locations/connections/patch

name <> 
Connection:
Connection

optional:
updateMask <string> Required. Update mask for the connection fields to be updated."
  ([name Connection]
    (projects-locations-connections-patch name Connection nil))
  ([name Connection optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://bigqueryconnection.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/bigquery"
        "https://www.googleapis.com/auth/cloud-platform"],
       :body Connection})))

(defn projects-locations-connections-delete
  "Deletes connection and associated credential.
https://cloud.google.com/bigquery/docs/connections-api-intro/v1/reference/rest/v1/projects/locations/connections/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://bigqueryconnection.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/bigquery/docs/connections-api-intro/v1/reference/rest/v1/projects/locations/connections/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://bigqueryconnection.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body GetIamPolicyRequest}))

(defn projects-locations-connections-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/bigquery/docs/connections-api-intro/v1/reference/rest/v1/projects/locations/connections/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://bigqueryconnection.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-connections-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/bigquery/docs/connections-api-intro/v1/reference/rest/v1/projects/locations/connections/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://bigqueryconnection.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))
