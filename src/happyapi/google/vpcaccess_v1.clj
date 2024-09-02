(ns happyapi.google.vpcaccess-v1
  "Serverless VPC Access API
API for managing VPC access connectors.
See: https://cloud.google.com/vpc/docs/configure-serverless-vpc-access"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/vpc/docs/configure-serverless-vpc-access/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://vpcaccess.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vpc/docs/configure-serverless-vpc-access/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://vpcaccess.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vpc/docs/configure-serverless-vpc-access/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://vpcaccess.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connectors-create
  "Creates a Serverless VPC Access connector, returns an operation.
https://cloud.google.com/vpc/docs/configure-serverless-vpc-access/v1/reference/rest/v1/projects/locations/connectors/create

parent <> 
Connector:
Connector

optional:
connectorId <string> Required. The ID to use for this connector."
  ([parent Connector]
    (projects-locations-connectors-create parent Connector nil))
  ([parent Connector optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://vpcaccess.googleapis.com/v1/{+parent}/connectors",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Connector})))

(defn projects-locations-connectors-patch
  "Updates a Serverless VPC Access connector, returns an operation.
https://cloud.google.com/vpc/docs/configure-serverless-vpc-access/v1/reference/rest/v1/projects/locations/connectors/patch

name <> 
Connector:
Connector

optional:
updateMask <string> The fields to update on the entry group. If absent or empty, all modifiable fields are updated."
  ([name Connector]
    (projects-locations-connectors-patch name Connector nil))
  ([name Connector optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://vpcaccess.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Connector})))

(defn projects-locations-connectors-get
  "Gets a Serverless VPC Access connector. Returns NOT_FOUND if the resource does not exist.
https://cloud.google.com/vpc/docs/configure-serverless-vpc-access/v1/reference/rest/v1/projects/locations/connectors/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://vpcaccess.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connectors-list
  "Lists Serverless VPC Access connectors.
https://cloud.google.com/vpc/docs/configure-serverless-vpc-access/v1/reference/rest/v1/projects/locations/connectors/list

parent <> 

optional:
pageSize <integer> Maximum number of functions to return per call."
  ([parent] (projects-locations-connectors-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://vpcaccess.googleapis.com/v1/{+parent}/connectors",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-connectors-delete
  "Deletes a Serverless VPC Access connector. Returns NOT_FOUND if the resource does not exist.
https://cloud.google.com/vpc/docs/configure-serverless-vpc-access/v1/reference/rest/v1/projects/locations/connectors/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://vpcaccess.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
