(ns happyapi.google.rapidmigrationassessment-v1
  "Rapid Migration Assessment API
The Rapid Migration Assessment service is our first-party migration assessment and planning tool.
See: https://cloud.google.com/migration-center/docs"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://rapidmigrationassessment.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://rapidmigrationassessment.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://rapidmigrationassessment.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://rapidmigrationassessment.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://rapidmigrationassessment.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://rapidmigrationassessment.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-collectors-create
  "Create a Collector to manage the on-prem appliance which collects information about Customer assets.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/collectors/create

parent <> 
Collector:
Collector

optional:
collectorId <string> Required. Id of the requesting object.
requestId <string> Optional. An optional request ID to identify requests."
  ([parent Collector]
    (projects-locations-collectors-create parent Collector nil))
  ([parent Collector optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://rapidmigrationassessment.googleapis.com/v1/{+parent}/collectors",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Collector})))

(defn projects-locations-collectors-list
  "Lists Collectors in a given project and location.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/collectors/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Filtering results.
orderBy <string> Hint for how to order the results."
  ([parent] (projects-locations-collectors-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://rapidmigrationassessment.googleapis.com/v1/{+parent}/collectors",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collectors-get
  "Gets details of a single Collector.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/collectors/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://rapidmigrationassessment.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collectors-patch
  "Updates the parameters of a single Collector.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/collectors/patch

name <> 
Collector:
Collector

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the Collector resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Collector]
    (projects-locations-collectors-patch name Collector nil))
  ([name Collector optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://rapidmigrationassessment.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Collector})))

(defn projects-locations-collectors-delete
  "Deletes a single Collector - changes state of collector to \"Deleting\". Background jobs does final deletion thorugh producer api.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/collectors/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-collectors-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://rapidmigrationassessment.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collectors-resume
  "Resumes the given collector.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/collectors/resume

name <> 
ResumeCollectorRequest:
ResumeCollectorRequest"
  [name ResumeCollectorRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://rapidmigrationassessment.googleapis.com/v1/{+name}:resume",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ResumeCollectorRequest}))

(defn projects-locations-collectors-register
  "Registers the given collector.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/collectors/register

name <> 
RegisterCollectorRequest:
RegisterCollectorRequest"
  [name RegisterCollectorRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://rapidmigrationassessment.googleapis.com/v1/{+name}:register",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RegisterCollectorRequest}))

(defn projects-locations-collectors-pause
  "Pauses the given collector.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/collectors/pause

name <> 
PauseCollectorRequest:
PauseCollectorRequest"
  [name PauseCollectorRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://rapidmigrationassessment.googleapis.com/v1/{+name}:pause",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body PauseCollectorRequest}))

(defn projects-locations-annotations-create
  "Creates an Annotation
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/annotations/create

parent <> 
Annotation:
Annotation

optional:
requestId <string> Optional. An optional request ID to identify requests."
  ([parent Annotation]
    (projects-locations-annotations-create parent Annotation nil))
  ([parent Annotation optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://rapidmigrationassessment.googleapis.com/v1/{+parent}/annotations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Annotation})))

(defn projects-locations-annotations-get
  "Gets details of a single Annotation.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/annotations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://rapidmigrationassessment.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
