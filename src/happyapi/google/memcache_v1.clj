(ns happyapi.google.memcache-v1
  "Cloud Memorystore for Memcached API
Google Cloud Memorystore for Memcached API is used for creating and managing Memcached instances in GCP.
See: https://cloud.google.com/memorystore/"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://memcache.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://memcache.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://memcache.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://memcache.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://memcache.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://memcache.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-instances-applyParameters
  "`ApplyParameters` restarts the set of specified nodes in order to update them to the current set of parameters for the Memcached Instance.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/instances/applyParameters

name <> 
ApplyParametersRequest:
ApplyParametersRequest"
  [name ApplyParametersRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://memcache.googleapis.com/v1/{+name}:applyParameters",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ApplyParametersRequest}))

(defn projects-locations-instances-rescheduleMaintenance
  "Reschedules upcoming maintenance event.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/instances/rescheduleMaintenance

instance <> 
RescheduleMaintenanceRequest:
RescheduleMaintenanceRequest"
  [instance RescheduleMaintenanceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://memcache.googleapis.com/v1/{+instance}:rescheduleMaintenance",
     :uri-template-args {"instance" instance},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RescheduleMaintenanceRequest}))

(defn projects-locations-instances-list
  "Lists Instances in a given location.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/instances/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return. If not specified, a default value of 1000 will be used by the service. Regardless of the `page_size` value, the response may include a partial list and a caller should only rely on response's `next_page_token` to determine if there are more instances left to be queried.
filter <string> List filter. For example, exclude all Memcached instances with name as my-instance by specifying `\"name != my-instance\"`.
orderBy <string> Sort results. Supported values are \"name\", \"name desc\" or \"\" (unsorted)."
  ([parent] (projects-locations-instances-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://memcache.googleapis.com/v1/{+parent}/instances",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-delete
  "Deletes a single Instance.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/instances/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://memcache.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-upgrade
  "Upgrades the Memcache instance to a newer memcached engine version specified in the request.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/instances/upgrade

name <> 
GoogleCloudMemcacheV1UpgradeInstanceRequest:
GoogleCloudMemcacheV1UpgradeInstanceRequest"
  [name GoogleCloudMemcacheV1UpgradeInstanceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://memcache.googleapis.com/v1/{+name}:upgrade",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudMemcacheV1UpgradeInstanceRequest}))

(defn projects-locations-instances-updateParameters
  "Updates the defined Memcached parameters for an existing instance. This method only stages the parameters, it must be followed by `ApplyParameters` to apply the parameters to nodes of the Memcached instance.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/instances/updateParameters

name <> 
UpdateParametersRequest:
UpdateParametersRequest"
  [name UpdateParametersRequest]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://memcache.googleapis.com/v1/{+name}:updateParameters",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UpdateParametersRequest}))

(defn projects-locations-instances-patch
  "Updates an existing Instance in a given project and location.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/instances/patch

name <> 
Instance:
Instance

optional:
updateMask <string> Required. Mask of fields to update. * `displayName`"
  ([name Instance]
    (projects-locations-instances-patch name Instance nil))
  ([name Instance optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://memcache.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Instance})))

(defn projects-locations-instances-create
  "Creates a new Instance in a given location.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/instances/create

parent <> 
Instance:
Instance

optional:
instanceId <string> Required. The logical name of the Memcached instance in the user project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the user project / location. If any of the above are not met, the API raises an invalid argument error."
  ([parent Instance]
    (projects-locations-instances-create parent Instance nil))
  ([parent Instance optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://memcache.googleapis.com/v1/{+parent}/instances",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Instance})))

(defn projects-locations-instances-get
  "Gets details of a single Instance.
https://cloud.google.com/memorystore/v1/reference/rest/v1/projects/locations/instances/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://memcache.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
