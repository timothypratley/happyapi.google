(ns happyapi.google.apim-v1alpha
  "API Management API
Enables users to discover shadow APIs in existing Google Cloud infrastructure.
See: https://cloud.google.com/apigee/"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-listApiObservationTags
  "ListApiObservationTags lists all extant tags on any observation in the given project.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/listApiObservationTags

parent <> 

optional:
pageSize <integer> Optional. The maximum number of tags to return. The service may return fewer than this value. If unspecified, at most 10 tags will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-listApiObservationTags parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apim.googleapis.com/v1alpha/{+parent}:listApiObservationTags",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apim.googleapis.com/v1alpha/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apim.googleapis.com/v1alpha/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apim.googleapis.com/v1alpha/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apim.googleapis.com/v1alpha/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://apim.googleapis.com/v1alpha/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apim.googleapis.com/v1alpha/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-observationSources-create
  "CreateObservationSource creates a new ObservationSource but does not affect any deployed infrastructure. It is a configuration that can be used in an Observation Job to collect data about APIs running in user's dataplane.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationSources/create

parent <> 
ObservationSource:
ObservationSource

optional:
observationSourceId <string> Required. The ID to use for the Observation Source. This value should be 4-63 characters, and valid characters are /a-z-/.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent ObservationSource]
    (projects-locations-observationSources-create
      parent
      ObservationSource
      nil))
  ([parent ObservationSource optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://apim.googleapis.com/v1alpha/{+parent}/observationSources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ObservationSource})))

(defn projects-locations-observationSources-get
  "GetObservationSource retrieves a single ObservationSource by name.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationSources/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apim.googleapis.com/v1alpha/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-observationSources-list
  "ListObservationSources gets all ObservationSources for a given project and location.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationSources/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of ObservationSources to return. The service may return fewer than this value. If unspecified, at most 10 ObservationSources will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-observationSources-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apim.googleapis.com/v1alpha/{+parent}/observationSources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-observationSources-delete
  "DeleteObservationSource deletes an observation source. This method will fail if the observation source is currently being used by any ObservationJob, even if not enabled.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationSources/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://apim.googleapis.com/v1alpha/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-observationJobs-create
  "CreateObservationJob creates a new ObservationJob but does not have any effecton its own. It is a configuration that can be used in an Observation Job to collect data about existing APIs.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationJobs/create

parent <> 
ObservationJob:
ObservationJob

optional:
observationJobId <string> Required. The ID to use for the Observation Job. This value should be 4-63 characters, and valid characters are /a-z-/.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent ObservationJob]
    (projects-locations-observationJobs-create
      parent
      ObservationJob
      nil))
  ([parent ObservationJob optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://apim.googleapis.com/v1alpha/{+parent}/observationJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ObservationJob})))

(defn projects-locations-observationJobs-get
  "GetObservationJob retrieves a single ObservationJob by name.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationJobs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apim.googleapis.com/v1alpha/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-observationJobs-list
  "ListObservationJobs gets all ObservationJobs for a given project and location.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationJobs/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of ObservationJobs to return. The service may return fewer than this value. If unspecified, at most 10 ObservationJobs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-observationJobs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apim.googleapis.com/v1alpha/{+parent}/observationJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-observationJobs-delete
  "DeleteObservationJob deletes an ObservationJob. This method will fail if the observation job is currently being used by any ObservationSource, even if not enabled.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationJobs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://apim.googleapis.com/v1alpha/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-observationJobs-enable
  "Enables the given ObservationJob.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationJobs/enable

name <> 
EnableObservationJobRequest:
EnableObservationJobRequest"
  [name EnableObservationJobRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apim.googleapis.com/v1alpha/{+name}:enable",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body EnableObservationJobRequest}))

(defn projects-locations-observationJobs-disable
  "Disables the given ObservationJob.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationJobs/disable

name <> 
DisableObservationJobRequest:
DisableObservationJobRequest"
  [name DisableObservationJobRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apim.googleapis.com/v1alpha/{+name}:disable",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body DisableObservationJobRequest}))

(defn projects-locations-observationJobs-apiObservations-get
  "GetApiObservation retrieves a single ApiObservation by name.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationJobs/apiObservations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apim.googleapis.com/v1alpha/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-observationJobs-apiObservations-list
  "ListApiObservations gets all ApiObservations for a given project and location and ObservationJob.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationJobs/apiObservations/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of ApiObservations to return. The service may return fewer than this value. If unspecified, at most 10 ApiObservations will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent]
    (projects-locations-observationJobs-apiObservations-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apim.googleapis.com/v1alpha/{+parent}/apiObservations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-observationJobs-apiObservations-batchEditTags
  "BatchEditTagsApiObservations adds or removes Tags for ApiObservations.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationJobs/apiObservations/batchEditTags

parent <> 
BatchEditTagsApiObservationsRequest:
BatchEditTagsApiObservationsRequest"
  [parent BatchEditTagsApiObservationsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apim.googleapis.com/v1alpha/{+parent}/apiObservations:batchEditTags",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BatchEditTagsApiObservationsRequest}))

(defn projects-locations-observationJobs-apiObservations-apiOperations-get
  "GetApiOperation retrieves a single ApiOperation by name.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationJobs/apiObservations/apiOperations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apim.googleapis.com/v1alpha/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-observationJobs-apiObservations-apiOperations-list
  "ListApiOperations gets all ApiOperations for a given project and location and ObservationJob and ApiObservation.
https://cloud.google.com/apigee/v1alpha/reference/rest/v1alpha/projects/locations/observationJobs/apiObservations/apiOperations/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of ApiOperations to return. The service may return fewer than this value. If unspecified, at most 10 ApiOperations will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent]
    (projects-locations-observationJobs-apiObservations-apiOperations-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apim.googleapis.com/v1alpha/{+parent}/apiOperations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
