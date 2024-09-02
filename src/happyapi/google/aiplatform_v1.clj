(ns happyapi.google.aiplatform-v1
  "Vertex AI API
Train high-quality custom machine learning models with minimal machine learning expertise and effort.
See: https://cloud.google.com/vertex-ai/"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-evaluateInstances
  "Evaluates instances based on a given metric.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/evaluateInstances

location <> 
GoogleCloudAiplatformV1EvaluateInstancesRequest:
GoogleCloudAiplatformV1EvaluateInstancesRequest"
  [location GoogleCloudAiplatformV1EvaluateInstancesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+location}:evaluateInstances",
     :uri-template-args {"location" location},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1EvaluateInstancesRequest}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-studies-get
  "Gets a Study by name.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-studies-list
  "Lists all the studies in a region for an associated project.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of studies to return per \"page\" of results. If unspecified, service will pick an appropriate default."
  ([parent] (projects-locations-studies-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/studies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-studies-create
  "Creates a Study. A resource name will be generated after creation of the Study.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/create

parent <> 
GoogleCloudAiplatformV1Study:
GoogleCloudAiplatformV1Study"
  [parent GoogleCloudAiplatformV1Study]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/studies",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1Study}))

(defn projects-locations-studies-delete
  "Deletes a Study.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-studies-lookup
  "Looks a study up using the user-defined display_name field instead of the fully qualified resource name.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/lookup

parent <> 
GoogleCloudAiplatformV1LookupStudyRequest:
GoogleCloudAiplatformV1LookupStudyRequest"
  [parent GoogleCloudAiplatformV1LookupStudyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/studies:lookup",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1LookupStudyRequest}))

(defn projects-locations-studies-trials-stop
  "Stops a Trial.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/stop

name <> 
GoogleCloudAiplatformV1StopTrialRequest:
GoogleCloudAiplatformV1StopTrialRequest"
  [name GoogleCloudAiplatformV1StopTrialRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}:stop",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1StopTrialRequest}))

(defn projects-locations-studies-trials-list
  "Lists the Trials associated with a Study.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/list

parent <> 

optional:
pageSize <integer> Optional. The number of Trials to retrieve per \"page\" of results. If unspecified, the service will pick an appropriate default."
  ([parent] (projects-locations-studies-trials-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/trials",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-studies-trials-delete
  "Deletes a Trial.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-studies-trials-complete
  "Marks a Trial as complete.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/complete

name <> 
GoogleCloudAiplatformV1CompleteTrialRequest:
GoogleCloudAiplatformV1CompleteTrialRequest"
  [name GoogleCloudAiplatformV1CompleteTrialRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:complete",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CompleteTrialRequest}))

(defn projects-locations-studies-trials-listOptimalTrials
  "Lists the pareto-optimal Trials for multi-objective Study or the optimal Trials for single-objective Study. The definition of pareto-optimal can be checked in wiki page. https://en.wikipedia.org/wiki/Pareto_efficiency
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/listOptimalTrials

parent <> 
GoogleCloudAiplatformV1ListOptimalTrialsRequest:
GoogleCloudAiplatformV1ListOptimalTrialsRequest"
  [parent GoogleCloudAiplatformV1ListOptimalTrialsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/trials:listOptimalTrials",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ListOptimalTrialsRequest}))

(defn projects-locations-studies-trials-checkTrialEarlyStoppingState
  "Checks whether a Trial should stop or not. Returns a long-running operation. When the operation is successful, it will contain a CheckTrialEarlyStoppingStateResponse.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/checkTrialEarlyStoppingState

trialName <> 
GoogleCloudAiplatformV1CheckTrialEarlyStoppingStateRequest:
GoogleCloudAiplatformV1CheckTrialEarlyStoppingStateRequest"
  [trialName
   GoogleCloudAiplatformV1CheckTrialEarlyStoppingStateRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+trialName}:checkTrialEarlyStoppingState",
     :uri-template-args {"trialName" trialName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CheckTrialEarlyStoppingStateRequest}))

(defn projects-locations-studies-trials-create
  "Adds a user provided Trial to a Study.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/create

parent <> 
GoogleCloudAiplatformV1Trial:
GoogleCloudAiplatformV1Trial"
  [parent GoogleCloudAiplatformV1Trial]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/trials",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1Trial}))

(defn projects-locations-studies-trials-addTrialMeasurement
  "Adds a measurement of the objective metrics to a Trial. This measurement is assumed to have been taken before the Trial is complete.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/addTrialMeasurement

trialName <> 
GoogleCloudAiplatformV1AddTrialMeasurementRequest:
GoogleCloudAiplatformV1AddTrialMeasurementRequest"
  [trialName GoogleCloudAiplatformV1AddTrialMeasurementRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+trialName}:addTrialMeasurement",
     :uri-template-args {"trialName" trialName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1AddTrialMeasurementRequest}))

(defn projects-locations-studies-trials-get
  "Gets a Trial.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-studies-trials-suggest
  "Adds one or more Trials to a Study, with parameter values suggested by Vertex AI Vizier. Returns a long-running operation associated with the generation of Trial suggestions. When this long-running operation succeeds, it will contain a SuggestTrialsResponse.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/suggest

parent <> 
GoogleCloudAiplatformV1SuggestTrialsRequest:
GoogleCloudAiplatformV1SuggestTrialsRequest"
  [parent GoogleCloudAiplatformV1SuggestTrialsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/trials:suggest",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1SuggestTrialsRequest}))

(defn projects-locations-studies-trials-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-studies-trials-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-studies-trials-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-studies-trials-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-studies-trials-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-studies-trials-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-studies-trials-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-studies-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-studies-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-studies-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-studies-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-studies-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name] (projects-locations-studies-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-studies-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-migratableResources-batchMigrate
  "Batch migrates resources from ml.googleapis.com, automl.googleapis.com, and datalabeling.googleapis.com to Vertex AI.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/migratableResources/batchMigrate

parent <> 
GoogleCloudAiplatformV1BatchMigrateResourcesRequest:
GoogleCloudAiplatformV1BatchMigrateResourcesRequest"
  [parent GoogleCloudAiplatformV1BatchMigrateResourcesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/migratableResources:batchMigrate",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1BatchMigrateResourcesRequest}))

(defn projects-locations-migratableResources-search
  "Searches all of the resources in automl.googleapis.com, datalabeling.googleapis.com and ml.googleapis.com that can be migrated to Vertex AI's given location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/migratableResources/search

parent <> 
GoogleCloudAiplatformV1SearchMigratableResourcesRequest:
GoogleCloudAiplatformV1SearchMigratableResourcesRequest"
  [parent GoogleCloudAiplatformV1SearchMigratableResourcesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/migratableResources:search",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1SearchMigratableResourcesRequest}))

(defn projects-locations-migratableResources-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/migratableResources/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-migratableResources-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-migratableResources-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/migratableResources/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-migratableResources-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/migratableResources/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-migratableResources-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-migratableResources-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/migratableResources/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-migratableResources-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/migratableResources/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-indexEndpoints-list
  "Lists IndexEndpoints in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/list

parent <> 

optional:
readMask <string> Optional. Mask specifying which fields to read.
filter <string> Optional. An expression for filtering the results of the request. For field names both snake_case and camelCase are supported. * `index_endpoint` supports = and !=. `index_endpoint` represents the IndexEndpoint ID, ie. the last segment of the IndexEndpoint's resourcename. * `display_name` supports =, != and regex() (uses [re2](https://github.com/google/re2/wiki/Syntax) syntax) * `labels` supports general map functions that is: `labels.key=value` - key:value equality `labels.key:* or labels:key - key existence A key including a space must be quoted. `labels.\"a key\"`. Some examples: * `index_endpoint=\"1\"` * `display_name=\"myDisplayName\"` * `regex(display_name, \"^A\") -> The display name starts with an A. * `labels.myKey=\"myValue\"`
pageSize <integer> Optional. The standard list page size."
  ([parent] (projects-locations-indexEndpoints-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/indexEndpoints",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-indexEndpoints-delete
  "Deletes an IndexEndpoint.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-indexEndpoints-findNeighbors
  "Finds the nearest neighbors of each vector within the request.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/findNeighbors

indexEndpoint <> 
GoogleCloudAiplatformV1FindNeighborsRequest:
GoogleCloudAiplatformV1FindNeighborsRequest"
  [indexEndpoint GoogleCloudAiplatformV1FindNeighborsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+indexEndpoint}:findNeighbors",
     :uri-template-args {"indexEndpoint" indexEndpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1FindNeighborsRequest}))

(defn projects-locations-indexEndpoints-undeployIndex
  "Undeploys an Index from an IndexEndpoint, removing a DeployedIndex from it, and freeing all resources it's using.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/undeployIndex

indexEndpoint <> 
GoogleCloudAiplatformV1UndeployIndexRequest:
GoogleCloudAiplatformV1UndeployIndexRequest"
  [indexEndpoint GoogleCloudAiplatformV1UndeployIndexRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+indexEndpoint}:undeployIndex",
     :uri-template-args {"indexEndpoint" indexEndpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1UndeployIndexRequest}))

(defn projects-locations-indexEndpoints-mutateDeployedIndex
  "Update an existing DeployedIndex under an IndexEndpoint.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/mutateDeployedIndex

indexEndpoint <> 
GoogleCloudAiplatformV1DeployedIndex:
GoogleCloudAiplatformV1DeployedIndex"
  [indexEndpoint GoogleCloudAiplatformV1DeployedIndex]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+indexEndpoint}:mutateDeployedIndex",
     :uri-template-args {"indexEndpoint" indexEndpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1DeployedIndex}))

(defn projects-locations-indexEndpoints-readIndexDatapoints
  "Reads the datapoints/vectors of the given IDs. A maximum of 1000 datapoints can be retrieved in a batch.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/readIndexDatapoints

indexEndpoint <> 
GoogleCloudAiplatformV1ReadIndexDatapointsRequest:
GoogleCloudAiplatformV1ReadIndexDatapointsRequest"
  [indexEndpoint GoogleCloudAiplatformV1ReadIndexDatapointsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+indexEndpoint}:readIndexDatapoints",
     :uri-template-args {"indexEndpoint" indexEndpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ReadIndexDatapointsRequest}))

(defn projects-locations-indexEndpoints-patch
  "Updates an IndexEndpoint.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/patch

name <> 
GoogleCloudAiplatformV1IndexEndpoint:
GoogleCloudAiplatformV1IndexEndpoint

optional:
updateMask <string> Required. The update mask applies to the resource. See google.protobuf.FieldMask."
  ([name GoogleCloudAiplatformV1IndexEndpoint]
    (projects-locations-indexEndpoints-patch
      name
      GoogleCloudAiplatformV1IndexEndpoint
      nil))
  ([name GoogleCloudAiplatformV1IndexEndpoint optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1IndexEndpoint})))

(defn projects-locations-indexEndpoints-create
  "Creates an IndexEndpoint.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/create

parent <> 
GoogleCloudAiplatformV1IndexEndpoint:
GoogleCloudAiplatformV1IndexEndpoint"
  [parent GoogleCloudAiplatformV1IndexEndpoint]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/indexEndpoints",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1IndexEndpoint}))

(defn projects-locations-indexEndpoints-deployIndex
  "Deploys an Index into this IndexEndpoint, creating a DeployedIndex within it. Only non-empty Indexes can be deployed.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/deployIndex

indexEndpoint <> 
GoogleCloudAiplatformV1DeployIndexRequest:
GoogleCloudAiplatformV1DeployIndexRequest"
  [indexEndpoint GoogleCloudAiplatformV1DeployIndexRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+indexEndpoint}:deployIndex",
     :uri-template-args {"indexEndpoint" indexEndpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1DeployIndexRequest}))

(defn projects-locations-indexEndpoints-get
  "Gets an IndexEndpoint.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-indexEndpoints-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name] (projects-locations-indexEndpoints-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-indexEndpoints-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-indexEndpoints-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-indexEndpoints-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-indexEndpoints-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-indexEndpoints-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexEndpoints/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notebookRuntimes-delete
  "Deletes a NotebookRuntime.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimes/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notebookRuntimes-get
  "Gets a NotebookRuntime.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimes/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notebookRuntimes-assign
  "Assigns a NotebookRuntime to a user for a particular Notebook file. This method will either returns an existing assignment or generates a new one.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimes/assign

parent <> 
GoogleCloudAiplatformV1AssignNotebookRuntimeRequest:
GoogleCloudAiplatformV1AssignNotebookRuntimeRequest"
  [parent GoogleCloudAiplatformV1AssignNotebookRuntimeRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/notebookRuntimes:assign",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1AssignNotebookRuntimeRequest}))

(defn projects-locations-notebookRuntimes-list
  "Lists NotebookRuntimes in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimes/list

parent <> 

optional:
readMask <string> Optional. Mask specifying which fields to read.
filter <string> Optional. An expression for filtering the results of the request. For field names both snake_case and camelCase are supported. * `notebookRuntime` supports = and !=. `notebookRuntime` represents the NotebookRuntime ID, i.e. the last segment of the NotebookRuntime's resource name. * `displayName` supports = and != and regex. * `notebookRuntimeTemplate` supports = and !=. `notebookRuntimeTemplate` represents the NotebookRuntimeTemplate ID, i.e. the last segment of the NotebookRuntimeTemplate's resource name. * `healthState` supports = and !=. healthState enum: [HEALTHY, UNHEALTHY, HEALTH_STATE_UNSPECIFIED]. * `runtimeState` supports = and !=. runtimeState enum: [RUNTIME_STATE_UNSPECIFIED, RUNNING, BEING_STARTED, BEING_STOPPED, STOPPED, BEING_UPGRADED, ERROR, INVALID]. * `runtimeUser` supports = and !=. * API version is UI only: `uiState` supports = and !=. uiState enum: [UI_RESOURCE_STATE_UNSPECIFIED, UI_RESOURCE_STATE_BEING_CREATED, UI_RESOURCE_STATE_ACTIVE, UI_RESOURCE_STATE_BEING_DELETED, UI_RESOURCE_STATE_CREATION_FAILED]. * `notebookRuntimeType` supports = and !=. notebookRuntimeType enum: [USER_DEFINED, ONE_CLICK]. Some examples: * `notebookRuntime=\"notebookRuntime123\"` * `displayName=\"myDisplayName\"` and `displayName=~\"myDisplayNameRegex\"` * `notebookRuntimeTemplate=\"notebookRuntimeTemplate321\"` * `healthState=HEALTHY` * `runtimeState=RUNNING` * `runtimeUser=\"test@google.com\"` * `uiState=UI_RESOURCE_STATE_BEING_DELETED` * `notebookRuntimeType=USER_DEFINED`
pageSize <integer> Optional. The standard list page size.
orderBy <string> Optional. A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `display_name` * `create_time` * `update_time` Example: `display_name, create_time desc`."
  ([parent] (projects-locations-notebookRuntimes-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/notebookRuntimes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-notebookRuntimes-start
  "Starts a NotebookRuntime.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimes/start

name <> 
GoogleCloudAiplatformV1StartNotebookRuntimeRequest:
GoogleCloudAiplatformV1StartNotebookRuntimeRequest"
  [name GoogleCloudAiplatformV1StartNotebookRuntimeRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:start",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1StartNotebookRuntimeRequest}))

(defn projects-locations-notebookRuntimes-upgrade
  "Upgrades a NotebookRuntime.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimes/upgrade

name <> 
GoogleCloudAiplatformV1UpgradeNotebookRuntimeRequest:
GoogleCloudAiplatformV1UpgradeNotebookRuntimeRequest"
  [name GoogleCloudAiplatformV1UpgradeNotebookRuntimeRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:upgrade",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1UpgradeNotebookRuntimeRequest}))

(defn projects-locations-notebookRuntimes-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimes/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-notebookRuntimes-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-notebookRuntimes-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimes/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notebookRuntimes-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimes/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-notebookRuntimes-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-notebookRuntimes-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimes/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notebookRuntimes-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimes/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-pipelineJobs-get
  "Gets a PipelineJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/pipelineJobs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-pipelineJobs-list
  "Lists PipelineJobs in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/pipelineJobs/list

parent <> 

optional:
filter <string> Lists the PipelineJobs that match the filter expression. The following fields are supported: * `pipeline_name`: Supports `=` and `!=` comparisons. * `display_name`: Supports `=`, `!=` comparisons, and `:` wildcard. * `pipeline_job_user_id`: Supports `=`, `!=` comparisons, and `:` wildcard. for example, can check if pipeline's display_name contains *step* by doing display_name:\\\"*step*\\\" * `state`: Supports `=` and `!=` comparisons. * `create_time`: Supports `=`, `!=`, `<`, `>`, `<=`, and `>=` comparisons. Values must be in RFC 3339 format. * `update_time`: Supports `=`, `!=`, `<`, `>`, `<=`, and `>=` comparisons. Values must be in RFC 3339 format. * `end_time`: Supports `=`, `!=`, `<`, `>`, `<=`, and `>=` comparisons. Values must be in RFC 3339 format. * `labels`: Supports key-value equality and key presence. * `template_uri`: Supports `=`, `!=` comparisons, and `:` wildcard. * `template_metadata.version`: Supports `=`, `!=` comparisons, and `:` wildcard. Filter expressions can be combined together using logical operators (`AND` & `OR`). For example: `pipeline_name=\"test\" AND create_time>\"2020-05-18T13:30:00Z\"`. The syntax to define filter expression is based on https://google.aip.dev/160. Examples: * `create_time>\"2021-05-18T00:00:00Z\" OR update_time>\"2020-05-18T00:00:00Z\"` PipelineJobs created or updated after 2020-05-18 00:00:00 UTC. * `labels.env = \"prod\"` PipelineJobs with label \"env\" set to \"prod\".
readMask <string> Mask specifying which fields to read.
pageSize <integer> The standard list page size.
orderBy <string> A comma-separated list of fields to order by. The default sort order is in ascending order. Use \"desc\" after a field name for descending. You can have multiple order_by fields provided e.g. \"create_time desc, end_time\", \"end_time, start_time, update_time\" For example, using \"create_time desc, end_time\" will order results by create time in descending order, and if there are multiple jobs having the same create time, order them by the end time in ascending order. if order_by is not specified, it will order by default order is create time in descending order. Supported fields: * `create_time` * `update_time` * `end_time` * `start_time`"
  ([parent] (projects-locations-pipelineJobs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/pipelineJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-pipelineJobs-batchCancel
  "Batch cancel PipelineJobs. Firstly the server will check if all the jobs are in non-terminal states, and skip the jobs that are already terminated. If the operation failed, none of the pipeline jobs are cancelled. The server will poll the states of all the pipeline jobs periodically to check the cancellation status. This operation will return an LRO.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/pipelineJobs/batchCancel

parent <> 
GoogleCloudAiplatformV1BatchCancelPipelineJobsRequest:
GoogleCloudAiplatformV1BatchCancelPipelineJobsRequest"
  [parent GoogleCloudAiplatformV1BatchCancelPipelineJobsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/pipelineJobs:batchCancel",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1BatchCancelPipelineJobsRequest}))

(defn projects-locations-pipelineJobs-delete
  "Deletes a PipelineJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/pipelineJobs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-pipelineJobs-cancel
  "Cancels a PipelineJob. Starts asynchronous cancellation on the PipelineJob. The server makes a best effort to cancel the pipeline, but success is not guaranteed. Clients can use PipelineService.GetPipelineJob or other methods to check whether the cancellation succeeded or whether the pipeline completed despite cancellation. On successful cancellation, the PipelineJob is not deleted; instead it becomes a pipeline with a PipelineJob.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`, and PipelineJob.state is set to `CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/pipelineJobs/cancel

name <> 
GoogleCloudAiplatformV1CancelPipelineJobRequest:
GoogleCloudAiplatformV1CancelPipelineJobRequest"
  [name GoogleCloudAiplatformV1CancelPipelineJobRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CancelPipelineJobRequest}))

(defn projects-locations-pipelineJobs-batchDelete
  "Batch deletes PipelineJobs The Operation is atomic. If it fails, none of the PipelineJobs are deleted. If it succeeds, all of the PipelineJobs are deleted.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/pipelineJobs/batchDelete

parent <> 
GoogleCloudAiplatformV1BatchDeletePipelineJobsRequest:
GoogleCloudAiplatformV1BatchDeletePipelineJobsRequest"
  [parent GoogleCloudAiplatformV1BatchDeletePipelineJobsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/pipelineJobs:batchDelete",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1BatchDeletePipelineJobsRequest}))

(defn projects-locations-pipelineJobs-create
  "Creates a PipelineJob. A PipelineJob will run immediately when created.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/pipelineJobs/create

parent <> 
GoogleCloudAiplatformV1PipelineJob:
GoogleCloudAiplatformV1PipelineJob

optional:
pipelineJobId <string> The ID to use for the PipelineJob, which will become the final component of the PipelineJob name. If not provided, an ID will be automatically generated. This value should be less than 128 characters, and valid characters are `/a-z-/`."
  ([parent GoogleCloudAiplatformV1PipelineJob]
    (projects-locations-pipelineJobs-create
      parent
      GoogleCloudAiplatformV1PipelineJob
      nil))
  ([parent GoogleCloudAiplatformV1PipelineJob optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/pipelineJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1PipelineJob})))

(defn projects-locations-pipelineJobs-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/pipelineJobs/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-pipelineJobs-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-pipelineJobs-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/pipelineJobs/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-pipelineJobs-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/pipelineJobs/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name] (projects-locations-pipelineJobs-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-pipelineJobs-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/pipelineJobs/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-pipelineJobs-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/pipelineJobs/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataLabelingJobs-list
  "Lists DataLabelingJobs in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/dataLabelingJobs/list

parent <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter. Supported fields: * `display_name` supports `=`, `!=` comparisons, and `:` wildcard. * `state` supports `=`, `!=` comparisons. * `create_time` supports `=`, `!=`,`<`, `<=`,`>`, `>=` comparisons. `create_time` must be in RFC 3339 format. * `labels` supports general map functions that is: `labels.key=value` - key:value equality `labels.key:* - key existence Some examples of using the filter are: * `state=\"JOB_STATE_SUCCEEDED\" AND display_name:\"my_job_*\"` * `state!=\"JOB_STATE_FAILED\" OR display_name=\"my_job\"` * `NOT display_name=\"my_job\"` * `create_time>\"2021-05-18T00:00:00Z\"` * `labels.keyA=valueA` * `labels.keyB:*`
readMask <string> Mask specifying which fields to read. FieldMask represents a set of symbolic field paths. For example, the mask can be `paths: \"name\"`. The \"name\" here is a field in DataLabelingJob. If this field is not set, all fields of the DataLabelingJob are returned.
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order by default. Use `desc` after a field name for descending."
  ([parent] (projects-locations-dataLabelingJobs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/dataLabelingJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataLabelingJobs-get
  "Gets a DataLabelingJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/dataLabelingJobs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataLabelingJobs-delete
  "Deletes a DataLabelingJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/dataLabelingJobs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataLabelingJobs-create
  "Creates a DataLabelingJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/dataLabelingJobs/create

parent <> 
GoogleCloudAiplatformV1DataLabelingJob:
GoogleCloudAiplatformV1DataLabelingJob"
  [parent GoogleCloudAiplatformV1DataLabelingJob]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/dataLabelingJobs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1DataLabelingJob}))

(defn projects-locations-dataLabelingJobs-cancel
  "Cancels a DataLabelingJob. Success of cancellation is not guaranteed.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/dataLabelingJobs/cancel

name <> 
GoogleCloudAiplatformV1CancelDataLabelingJobRequest:
GoogleCloudAiplatformV1CancelDataLabelingJobRequest"
  [name GoogleCloudAiplatformV1CancelDataLabelingJobRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CancelDataLabelingJobRequest}))

(defn projects-locations-dataLabelingJobs-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/dataLabelingJobs/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataLabelingJobs-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/dataLabelingJobs/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-dataLabelingJobs-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataLabelingJobs-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/dataLabelingJobs/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataLabelingJobs-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/dataLabelingJobs/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-dataLabelingJobs-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataLabelingJobs-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/dataLabelingJobs/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureOnlineStores-list
  "Lists FeatureOnlineStores in a given project and location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/list

parent <> 

optional:
filter <string> Lists the FeatureOnlineStores that match the filter expression. The following fields are supported: * `create_time`: Supports `=`, `!=`, `<`, `>`, `<=`, and `>=` comparisons. Values must be in RFC 3339 format. * `update_time`: Supports `=`, `!=`, `<`, `>`, `<=`, and `>=` comparisons. Values must be in RFC 3339 format. * `labels`: Supports key-value equality and key presence. Examples: * `create_time > \"2020-01-01\" OR update_time > \"2020-01-01\"` FeatureOnlineStores created or updated after 2020-01-01. * `labels.env = \"prod\"` FeatureOnlineStores with label \"env\" set to \"prod\".
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported Fields: * `create_time` * `update_time`
pageSize <integer> The maximum number of FeatureOnlineStores to return. The service may return fewer than this value. If unspecified, at most 100 FeatureOnlineStores will be returned. The maximum value is 100; any value greater than 100 will be coerced to 100."
  ([parent] (projects-locations-featureOnlineStores-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/featureOnlineStores",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureOnlineStores-get
  "Gets details of a single FeatureOnlineStore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureOnlineStores-patch
  "Updates the parameters of a single FeatureOnlineStore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/patch

name <> 
GoogleCloudAiplatformV1FeatureOnlineStore:
GoogleCloudAiplatformV1FeatureOnlineStore

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the FeatureOnlineStore resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then only the non-empty fields present in the request will be overwritten. Set the update_mask to `*` to override all fields. Updatable fields: * `labels` * `description` * `bigtable` * `bigtable.auto_scaling` * `bigtable.enable_multi_region_replica`"
  ([name GoogleCloudAiplatformV1FeatureOnlineStore]
    (projects-locations-featureOnlineStores-patch
      name
      GoogleCloudAiplatformV1FeatureOnlineStore
      nil))
  ([name GoogleCloudAiplatformV1FeatureOnlineStore optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1FeatureOnlineStore})))

(defn projects-locations-featureOnlineStores-create
  "Creates a new FeatureOnlineStore in a given project and location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/create

parent <> 
GoogleCloudAiplatformV1FeatureOnlineStore:
GoogleCloudAiplatformV1FeatureOnlineStore

optional:
featureOnlineStoreId <string> Required. The ID to use for this FeatureOnlineStore, which will become the final component of the FeatureOnlineStore's resource name. This value may be up to 60 characters, and valid characters are `[a-z0-9_]`. The first character cannot be a number. The value must be unique within the project and location."
  ([parent GoogleCloudAiplatformV1FeatureOnlineStore]
    (projects-locations-featureOnlineStores-create
      parent
      GoogleCloudAiplatformV1FeatureOnlineStore
      nil))
  ([parent GoogleCloudAiplatformV1FeatureOnlineStore optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/featureOnlineStores",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1FeatureOnlineStore})))

(defn projects-locations-featureOnlineStores-delete
  "Deletes a single FeatureOnlineStore. The FeatureOnlineStore must not contain any FeatureViews.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/delete

name <> 

optional:
force <boolean> If set to true, any FeatureViews and Features for this FeatureOnlineStore will also be deleted. (Otherwise, the request will only work if the FeatureOnlineStore has no FeatureViews.)"
  ([name] (projects-locations-featureOnlineStores-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureOnlineStores-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-featureOnlineStores-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureOnlineStores-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureOnlineStores-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureOnlineStores-operations-listWait
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/operations/listWait

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-featureOnlineStores-operations-listWait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureOnlineStores-featureViews-patch
  "Updates the parameters of a single FeatureView.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/patch

name <> 
GoogleCloudAiplatformV1FeatureView:
GoogleCloudAiplatformV1FeatureView

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the FeatureView resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then only the non-empty fields present in the request will be overwritten. Set the update_mask to `*` to override all fields. Updatable fields: * `labels` * `service_agent_type` * `big_query_source` * `big_query_source.uri` * `big_query_source.entity_id_columns` * `feature_registry_source` * `feature_registry_source.feature_groups` * `sync_config` * `sync_config.cron`"
  ([name GoogleCloudAiplatformV1FeatureView]
    (projects-locations-featureOnlineStores-featureViews-patch
      name
      GoogleCloudAiplatformV1FeatureView
      nil))
  ([name GoogleCloudAiplatformV1FeatureView optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1FeatureView})))

(defn projects-locations-featureOnlineStores-featureViews-searchNearestEntities
  "Search the nearest entities under a FeatureView. Search only works for indexable feature view; if a feature view isn't indexable, returns Invalid argument response.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/searchNearestEntities

featureView <> 
GoogleCloudAiplatformV1SearchNearestEntitiesRequest:
GoogleCloudAiplatformV1SearchNearestEntitiesRequest"
  [featureView GoogleCloudAiplatformV1SearchNearestEntitiesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+featureView}:searchNearestEntities",
     :uri-template-args {"featureView" featureView},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1SearchNearestEntitiesRequest}))

(defn projects-locations-featureOnlineStores-featureViews-delete
  "Deletes a single FeatureView.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureOnlineStores-featureViews-create
  "Creates a new FeatureView in a given FeatureOnlineStore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/create

parent <> 
GoogleCloudAiplatformV1FeatureView:
GoogleCloudAiplatformV1FeatureView

optional:
runSyncImmediately <boolean> Immutable. If set to true, one on demand sync will be run immediately, regardless whether the FeatureView.sync_config is configured or not.
featureViewId <string> Required. The ID to use for the FeatureView, which will become the final component of the FeatureView's resource name. This value may be up to 60 characters, and valid characters are `[a-z0-9_]`. The first character cannot be a number. The value must be unique within a FeatureOnlineStore."
  ([parent GoogleCloudAiplatformV1FeatureView]
    (projects-locations-featureOnlineStores-featureViews-create
      parent
      GoogleCloudAiplatformV1FeatureView
      nil))
  ([parent GoogleCloudAiplatformV1FeatureView optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/featureViews",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1FeatureView})))

(defn projects-locations-featureOnlineStores-featureViews-get
  "Gets details of a single FeatureView.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureOnlineStores-featureViews-sync
  "Triggers on-demand sync for the FeatureView.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/sync

featureView <> 
GoogleCloudAiplatformV1SyncFeatureViewRequest:
GoogleCloudAiplatformV1SyncFeatureViewRequest"
  [featureView GoogleCloudAiplatformV1SyncFeatureViewRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+featureView}:sync",
     :uri-template-args {"featureView" featureView},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1SyncFeatureViewRequest}))

(defn projects-locations-featureOnlineStores-featureViews-fetchFeatureValues
  "Fetch feature values under a FeatureView.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/fetchFeatureValues

featureView <> 
GoogleCloudAiplatformV1FetchFeatureValuesRequest:
GoogleCloudAiplatformV1FetchFeatureValuesRequest"
  [featureView GoogleCloudAiplatformV1FetchFeatureValuesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+featureView}:fetchFeatureValues",
     :uri-template-args {"featureView" featureView},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1FetchFeatureValuesRequest}))

(defn projects-locations-featureOnlineStores-featureViews-list
  "Lists FeatureViews in a given FeatureOnlineStore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/list

parent <> 

optional:
filter <string> Lists the FeatureViews that match the filter expression. The following filters are supported: * `create_time`: Supports `=`, `!=`, `<`, `>`, `>=`, and `<=` comparisons. Values must be in RFC 3339 format. * `update_time`: Supports `=`, `!=`, `<`, `>`, `>=`, and `<=` comparisons. Values must be in RFC 3339 format. * `labels`: Supports key-value equality as well as key presence. Examples: * `create_time > \\\"2020-01-31T15:30:00.000000Z\\\" OR update_time > \\\"2020-01-31T15:30:00.000000Z\\\"` --> FeatureViews created or updated after 2020-01-31T15:30:00.000000Z. * `labels.active = yes AND labels.env = prod` --> FeatureViews having both (active: yes) and (env: prod) labels. * `labels.env: *` --> Any FeatureView which has a label with 'env' as the key.
pageSize <integer> The maximum number of FeatureViews to return. The service may return fewer than this value. If unspecified, at most 1000 FeatureViews will be returned. The maximum value is 1000; any value greater than 1000 will be coerced to 1000.
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `feature_view_id` * `create_time` * `update_time`"
  ([parent]
    (projects-locations-featureOnlineStores-featureViews-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/featureViews",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureOnlineStores-featureViews-featureViewSyncs-get
  "Gets details of a single FeatureViewSync.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/featureViewSyncs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureOnlineStores-featureViews-featureViewSyncs-list
  "Lists FeatureViewSyncs in a given FeatureView.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/featureViewSyncs/list

parent <> 

optional:
pageSize <integer> The maximum number of FeatureViewSyncs to return. The service may return fewer than this value. If unspecified, at most 1000 FeatureViewSyncs will be returned. The maximum value is 1000; any value greater than 1000 will be coerced to 1000.
filter <string> Lists the FeatureViewSyncs that match the filter expression. The following filters are supported: * `create_time`: Supports `=`, `!=`, `<`, `>`, `>=`, and `<=` comparisons. Values must be in RFC 3339 format. Examples: * `create_time > \\\"2020-01-31T15:30:00.000000Z\\\"` --> FeatureViewSyncs created after 2020-01-31T15:30:00.000000Z.
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `create_time`"
  ([parent]
    (projects-locations-featureOnlineStores-featureViews-featureViewSyncs-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/featureViewSyncs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureOnlineStores-featureViews-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureOnlineStores-featureViews-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureOnlineStores-featureViews-operations-listWait
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/operations/listWait

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-featureOnlineStores-featureViews-operations-listWait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureOnlineStores-featureViews-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureOnlineStores/featureViews/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-featureOnlineStores-featureViews-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-endpoints-undeployModel
  "Undeploys a Model from an Endpoint, removing a DeployedModel from it, and freeing all resources it's using.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/undeployModel

endpoint <> 
GoogleCloudAiplatformV1UndeployModelRequest:
GoogleCloudAiplatformV1UndeployModelRequest"
  [endpoint GoogleCloudAiplatformV1UndeployModelRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:undeployModel",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1UndeployModelRequest}))

(defn projects-locations-endpoints-predict
  "Perform an online prediction.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/predict

endpoint <> 
GoogleCloudAiplatformV1PredictRequest:
GoogleCloudAiplatformV1PredictRequest"
  [endpoint GoogleCloudAiplatformV1PredictRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:predict",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1PredictRequest}))

(defn projects-locations-endpoints-list
  "Lists Endpoints in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/list

parent <> 

optional:
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `display_name` * `create_time` * `update_time` Example: `display_name, create_time desc`.
pageSize <integer> Optional. The standard list page size.
filter <string> Optional. An expression for filtering the results of the request. For field names both snake_case and camelCase are supported. * `endpoint` supports `=` and `!=`. `endpoint` represents the Endpoint ID, i.e. the last segment of the Endpoint's resource name. * `display_name` supports `=` and `!=`. * `labels` supports general map functions that is: * `labels.key=value` - key:value equality * `labels.key:*` or `labels:key` - key existence * A key including a space must be quoted. `labels.\"a key\"`. * `base_model_name` only supports `=`. Some examples: * `endpoint=1` * `displayName=\"myDisplayName\"` * `labels.myKey=\"myValue\"` * `baseModelName=\"text-bison\"`
readMask <string> Optional. Mask specifying which fields to read."
  ([parent] (projects-locations-endpoints-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/endpoints",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-endpoints-explain
  "Perform an online explanation. If deployed_model_id is specified, the corresponding DeployModel must have explanation_spec populated. If deployed_model_id is not specified, all DeployedModels must have explanation_spec populated.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/explain

endpoint <> 
GoogleCloudAiplatformV1ExplainRequest:
GoogleCloudAiplatformV1ExplainRequest"
  [endpoint GoogleCloudAiplatformV1ExplainRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:explain",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1ExplainRequest}))

(defn projects-locations-endpoints-delete
  "Deletes an Endpoint.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-endpoints-directRawPredict
  "Perform an unary online prediction request to a gRPC model server for custom containers.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/directRawPredict

endpoint <> 
GoogleCloudAiplatformV1DirectRawPredictRequest:
GoogleCloudAiplatformV1DirectRawPredictRequest"
  [endpoint GoogleCloudAiplatformV1DirectRawPredictRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:directRawPredict",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1DirectRawPredictRequest}))

(defn projects-locations-endpoints-generateContent
  "Generate content with multimodal inputs.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/generateContent

model <> 
GoogleCloudAiplatformV1GenerateContentRequest:
GoogleCloudAiplatformV1GenerateContentRequest"
  [model GoogleCloudAiplatformV1GenerateContentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+model}:generateContent",
     :uri-template-args {"model" model},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1GenerateContentRequest}))

(defn projects-locations-endpoints-mutateDeployedModel
  "Updates an existing deployed model. Updatable fields include `min_replica_count`, `max_replica_count`, `autoscaling_metric_specs`, `disable_container_logging` (v1 only), and `enable_container_logging` (v1beta1 only).
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/mutateDeployedModel

endpoint <> 
GoogleCloudAiplatformV1MutateDeployedModelRequest:
GoogleCloudAiplatformV1MutateDeployedModelRequest"
  [endpoint GoogleCloudAiplatformV1MutateDeployedModelRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:mutateDeployedModel",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1MutateDeployedModelRequest}))

(defn projects-locations-endpoints-streamRawPredict
  "Perform a streaming online prediction with an arbitrary HTTP payload.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/streamRawPredict

endpoint <> 
GoogleCloudAiplatformV1StreamRawPredictRequest:
GoogleCloudAiplatformV1StreamRawPredictRequest"
  [endpoint GoogleCloudAiplatformV1StreamRawPredictRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:streamRawPredict",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1StreamRawPredictRequest}))

(defn projects-locations-endpoints-rawPredict
  "Perform an online prediction with an arbitrary HTTP payload. The response includes the following HTTP headers: * `X-Vertex-AI-Endpoint-Id`: ID of the Endpoint that served this prediction. * `X-Vertex-AI-Deployed-Model-Id`: ID of the Endpoint's DeployedModel that served this prediction.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/rawPredict

endpoint <> 
GoogleCloudAiplatformV1RawPredictRequest:
GoogleCloudAiplatformV1RawPredictRequest"
  [endpoint GoogleCloudAiplatformV1RawPredictRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:rawPredict",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1RawPredictRequest}))

(defn projects-locations-endpoints-deployModel
  "Deploys a Model into this Endpoint, creating a DeployedModel within it.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/deployModel

endpoint <> 
GoogleCloudAiplatformV1DeployModelRequest:
GoogleCloudAiplatformV1DeployModelRequest"
  [endpoint GoogleCloudAiplatformV1DeployModelRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:deployModel",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1DeployModelRequest}))

(defn projects-locations-endpoints-computeTokens
  "Return a list of tokens based on the input text.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/computeTokens

endpoint <> 
GoogleCloudAiplatformV1ComputeTokensRequest:
GoogleCloudAiplatformV1ComputeTokensRequest"
  [endpoint GoogleCloudAiplatformV1ComputeTokensRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:computeTokens",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ComputeTokensRequest}))

(defn projects-locations-endpoints-patch
  "Updates an Endpoint.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/patch

name <> 
GoogleCloudAiplatformV1Endpoint:
GoogleCloudAiplatformV1Endpoint

optional:
updateMask <string> Required. The update mask applies to the resource. See google.protobuf.FieldMask."
  ([name GoogleCloudAiplatformV1Endpoint]
    (projects-locations-endpoints-patch
      name
      GoogleCloudAiplatformV1Endpoint
      nil))
  ([name GoogleCloudAiplatformV1Endpoint optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Endpoint})))

(defn projects-locations-endpoints-serverStreamingPredict
  "Perform a server-side streaming online prediction request for Vertex LLM streaming.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/serverStreamingPredict

endpoint <> 
GoogleCloudAiplatformV1StreamingPredictRequest:
GoogleCloudAiplatformV1StreamingPredictRequest"
  [endpoint GoogleCloudAiplatformV1StreamingPredictRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:serverStreamingPredict",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1StreamingPredictRequest}))

(defn projects-locations-endpoints-directPredict
  "Perform an unary online prediction request to a gRPC model server for Vertex first-party products and frameworks.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/directPredict

endpoint <> 
GoogleCloudAiplatformV1DirectPredictRequest:
GoogleCloudAiplatformV1DirectPredictRequest"
  [endpoint GoogleCloudAiplatformV1DirectPredictRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:directPredict",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1DirectPredictRequest}))

(defn projects-locations-endpoints-create
  "Creates an Endpoint.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/create

parent <> 
GoogleCloudAiplatformV1Endpoint:
GoogleCloudAiplatformV1Endpoint

optional:
endpointId <string> Immutable. The ID to use for endpoint, which will become the final component of the endpoint resource name. If not provided, Vertex AI will generate a value for this ID. If the first character is a letter, this value may be up to 63 characters, and valid characters are `[a-z0-9-]`. The last character must be a letter or number. If the first character is a number, this value may be up to 9 characters, and valid characters are `[0-9]` with no leading zeros. When using HTTP/JSON, this field is populated based on a query string argument, such as `?endpoint_id=12345`. This is the fallback for fields that are not included in either the URI or the body."
  ([parent GoogleCloudAiplatformV1Endpoint]
    (projects-locations-endpoints-create
      parent
      GoogleCloudAiplatformV1Endpoint
      nil))
  ([parent GoogleCloudAiplatformV1Endpoint optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/endpoints",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Endpoint})))

(defn projects-locations-endpoints-streamGenerateContent
  "Generate content with multimodal inputs with streaming support.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/streamGenerateContent

model <> 
GoogleCloudAiplatformV1GenerateContentRequest:
GoogleCloudAiplatformV1GenerateContentRequest"
  [model GoogleCloudAiplatformV1GenerateContentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+model}:streamGenerateContent",
     :uri-template-args {"model" model},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1GenerateContentRequest}))

(defn projects-locations-endpoints-countTokens
  "Perform a token counting.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/countTokens

endpoint <> 
GoogleCloudAiplatformV1CountTokensRequest:
GoogleCloudAiplatformV1CountTokensRequest"
  [endpoint GoogleCloudAiplatformV1CountTokensRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:countTokens",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CountTokensRequest}))

(defn projects-locations-endpoints-get
  "Gets an Endpoint.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-endpoints-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-endpoints-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-endpoints-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-endpoints-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name] (projects-locations-endpoints-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-endpoints-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-endpoints-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/endpoints/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featurestores-list
  "Lists Featurestores in a given project and location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/list

parent <> 

optional:
pageSize <integer> The maximum number of Featurestores to return. The service may return fewer than this value. If unspecified, at most 100 Featurestores will be returned. The maximum value is 100; any value greater than 100 will be coerced to 100.
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported Fields: * `create_time` * `update_time` * `online_serving_config.fixed_node_count`
filter <string> Lists the featurestores that match the filter expression. The following fields are supported: * `create_time`: Supports `=`, `!=`, `<`, `>`, `<=`, and `>=` comparisons. Values must be in RFC 3339 format. * `update_time`: Supports `=`, `!=`, `<`, `>`, `<=`, and `>=` comparisons. Values must be in RFC 3339 format. * `online_serving_config.fixed_node_count`: Supports `=`, `!=`, `<`, `>`, `<=`, and `>=` comparisons. * `labels`: Supports key-value equality and key presence. Examples: * `create_time > \"2020-01-01\" OR update_time > \"2020-01-01\"` Featurestores created or updated after 2020-01-01. * `labels.env = \"prod\"` Featurestores with label \"env\" set to \"prod\".
readMask <string> Mask specifying which fields to read."
  ([parent] (projects-locations-featurestores-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/featurestores",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1SetIamPolicyRequest}))

(defn projects-locations-featurestores-delete
  "Deletes a single Featurestore. The Featurestore must not contain any EntityTypes or `force` must be set to true for the request to succeed.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/delete

name <> 

optional:
force <boolean> If set to true, any EntityTypes and Features for this Featurestore will also be deleted. (Otherwise, the request will only work if the Featurestore has no EntityTypes.)"
  ([name] (projects-locations-featurestores-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-batchReadFeatureValues
  "Batch reads Feature values from a Featurestore. This API enables batch reading Feature values, where each read instance in the batch may read Feature values of entities from one or more EntityTypes. Point-in-time correctness is guaranteed for Feature values of each read instance as of each instance's read timestamp.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/batchReadFeatureValues

featurestore <> 
GoogleCloudAiplatformV1BatchReadFeatureValuesRequest:
GoogleCloudAiplatformV1BatchReadFeatureValuesRequest"
  [featurestore GoogleCloudAiplatformV1BatchReadFeatureValuesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+featurestore}:batchReadFeatureValues",
     :uri-template-args {"featurestore" featurestore},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1BatchReadFeatureValuesRequest}))

(defn projects-locations-featurestores-searchFeatures
  "Searches Features matching a query in a given project.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/searchFeatures

location <> 

optional:
query <string> Query string that is a conjunction of field-restricted queries and/or field-restricted filters. Field-restricted queries and filters can be combined using `AND` to form a conjunction. A field query is in the form FIELD:QUERY. This implicitly checks if QUERY exists as a substring within Feature's FIELD. The QUERY and the FIELD are converted to a sequence of words (i.e. tokens) for comparison. This is done by: * Removing leading/trailing whitespace and tokenizing the search value. Characters that are not one of alphanumeric `[a-zA-Z0-9]`, underscore `_`, or asterisk `*` are treated as delimiters for tokens. `*` is treated as a wildcard that matches characters within a token. * Ignoring case. * Prepending an asterisk to the first and appending an asterisk to the last token in QUERY. A QUERY must be either a singular token or a phrase. A phrase is one or multiple words enclosed in double quotation marks (\"). With phrases, the order of the words is important. Words in the phrase must be matching in order and consecutively. Supported FIELDs for field-restricted queries: * `feature_id` * `description` * `entity_type_id` Examples: * `feature_id: foo` --> Matches a Feature with ID containing the substring `foo` (eg. `foo`, `foofeature`, `barfoo`). * `feature_id: foo*feature` --> Matches a Feature with ID containing the substring `foo*feature` (eg. `foobarfeature`). * `feature_id: foo AND description: bar` --> Matches a Feature with ID containing the substring `foo` and description containing the substring `bar`. Besides field queries, the following exact-match filters are supported. The exact-match filters do not support wildcards. Unlike field-restricted queries, exact-match filters are case-sensitive. * `feature_id`: Supports = comparisons. * `description`: Supports = comparisons. Multi-token filters should be enclosed in quotes. * `entity_type_id`: Supports = comparisons. * `value_type`: Supports = and != comparisons. * `labels`: Supports key-value equality as well as key presence. * `featurestore_id`: Supports = comparisons. Examples: * `description = \"foo bar\"` --> Any Feature with description exactly equal to `foo bar` * `value_type = DOUBLE` --> Features whose type is DOUBLE. * `labels.active = yes AND labels.env = prod` --> Features having both (active: yes) and (env: prod) labels. * `labels.env: *` --> Any Feature which has a label with `env` as the key.
pageSize <integer> The maximum number of Features to return. The service may return fewer than this value. If unspecified, at most 100 Features will be returned. The maximum value is 100; any value greater than 100 will be coerced to 100."
  ([location]
    (projects-locations-featurestores-searchFeatures location nil))
  ([location optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+location}/featurestores:searchFeatures",
       :uri-template-args {"location" location},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-patch
  "Updates the parameters of a single Featurestore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/patch

name <> 
GoogleCloudAiplatformV1Featurestore:
GoogleCloudAiplatformV1Featurestore

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the Featurestore resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then only the non-empty fields present in the request will be overwritten. Set the update_mask to `*` to override all fields. Updatable fields: * `labels` * `online_serving_config.fixed_node_count` * `online_serving_config.scaling` * `online_storage_ttl_days`"
  ([name GoogleCloudAiplatformV1Featurestore]
    (projects-locations-featurestores-patch
      name
      GoogleCloudAiplatformV1Featurestore
      nil))
  ([name GoogleCloudAiplatformV1Featurestore optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Featurestore})))

(defn projects-locations-featurestores-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-featurestores-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-create
  "Creates a new Featurestore in a given project and location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/create

parent <> 
GoogleCloudAiplatformV1Featurestore:
GoogleCloudAiplatformV1Featurestore

optional:
featurestoreId <string> Required. The ID to use for this Featurestore, which will become the final component of the Featurestore's resource name. This value may be up to 60 characters, and valid characters are `[a-z0-9_]`. The first character cannot be a number. The value must be unique within the project and location."
  ([parent GoogleCloudAiplatformV1Featurestore]
    (projects-locations-featurestores-create
      parent
      GoogleCloudAiplatformV1Featurestore
      nil))
  ([parent GoogleCloudAiplatformV1Featurestore optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/featurestores",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Featurestore})))

(defn projects-locations-featurestores-get
  "Gets details of a single Featurestore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featurestores-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/testIamPermissions

resource <> 

optional:
permissions <string> The set of permissions to check for the `resource`. Permissions with wildcards (such as `*` or `storage.*`) are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions)."
  ([resource]
    (projects-locations-featurestores-testIamPermissions resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+resource}:testIamPermissions",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featurestores-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featurestores-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featurestores-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-featurestores-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name] (projects-locations-featurestores-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-entityTypes-list
  "Lists EntityTypes in a given Featurestore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/list

parent <> 

optional:
readMask <string> Mask specifying which fields to read.
pageSize <integer> The maximum number of EntityTypes to return. The service may return fewer than this value. If unspecified, at most 1000 EntityTypes will be returned. The maximum value is 1000; any value greater than 1000 will be coerced to 1000.
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `entity_type_id` * `create_time` * `update_time`
filter <string> Lists the EntityTypes that match the filter expression. The following filters are supported: * `create_time`: Supports `=`, `!=`, `<`, `>`, `>=`, and `<=` comparisons. Values must be in RFC 3339 format. * `update_time`: Supports `=`, `!=`, `<`, `>`, `>=`, and `<=` comparisons. Values must be in RFC 3339 format. * `labels`: Supports key-value equality as well as key presence. Examples: * `create_time > \\\"2020-01-31T15:30:00.000000Z\\\" OR update_time > \\\"2020-01-31T15:30:00.000000Z\\\"` --> EntityTypes created or updated after 2020-01-31T15:30:00.000000Z. * `labels.active = yes AND labels.env = prod` --> EntityTypes having both (active: yes) and (env: prod) labels. * `labels.env: *` --> Any EntityType which has a label with 'env' as the key."
  ([parent]
    (projects-locations-featurestores-entityTypes-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/entityTypes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-entityTypes-readFeatureValues
  "Reads Feature values of a specific entity of an EntityType. For reading feature values of multiple entities of an EntityType, please use StreamingReadFeatureValues.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/readFeatureValues

entityType <> 
GoogleCloudAiplatformV1ReadFeatureValuesRequest:
GoogleCloudAiplatformV1ReadFeatureValuesRequest"
  [entityType GoogleCloudAiplatformV1ReadFeatureValuesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+entityType}:readFeatureValues",
     :uri-template-args {"entityType" entityType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ReadFeatureValuesRequest}))

(defn projects-locations-featurestores-entityTypes-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1SetIamPolicyRequest}))

(defn projects-locations-featurestores-entityTypes-delete
  "Deletes a single EntityType. The EntityType must not have any Features or `force` must be set to true for the request to succeed.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/delete

name <> 

optional:
force <boolean> If set to true, any Features for this EntityType will also be deleted. (Otherwise, the request will only work if the EntityType has no Features.)"
  ([name]
    (projects-locations-featurestores-entityTypes-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-entityTypes-streamingReadFeatureValues
  "Reads Feature values for multiple entities. Depending on their size, data for different entities may be broken up across multiple responses.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/streamingReadFeatureValues

entityType <> 
GoogleCloudAiplatformV1StreamingReadFeatureValuesRequest:
GoogleCloudAiplatformV1StreamingReadFeatureValuesRequest"
  [entityType GoogleCloudAiplatformV1StreamingReadFeatureValuesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+entityType}:streamingReadFeatureValues",
     :uri-template-args {"entityType" entityType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1StreamingReadFeatureValuesRequest}))

(defn projects-locations-featurestores-entityTypes-writeFeatureValues
  "Writes Feature values of one or more entities of an EntityType. The Feature values are merged into existing entities if any. The Feature values to be written must have timestamp within the online storage retention.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/writeFeatureValues

entityType <> 
GoogleCloudAiplatformV1WriteFeatureValuesRequest:
GoogleCloudAiplatformV1WriteFeatureValuesRequest"
  [entityType GoogleCloudAiplatformV1WriteFeatureValuesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+entityType}:writeFeatureValues",
     :uri-template-args {"entityType" entityType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1WriteFeatureValuesRequest}))

(defn projects-locations-featurestores-entityTypes-patch
  "Updates the parameters of a single EntityType.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/patch

name <> 
GoogleCloudAiplatformV1EntityType:
GoogleCloudAiplatformV1EntityType

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the EntityType resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then only the non-empty fields present in the request will be overwritten. Set the update_mask to `*` to override all fields. Updatable fields: * `description` * `labels` * `monitoring_config.snapshot_analysis.disabled` * `monitoring_config.snapshot_analysis.monitoring_interval_days` * `monitoring_config.snapshot_analysis.staleness_days` * `monitoring_config.import_features_analysis.state` * `monitoring_config.import_features_analysis.anomaly_detection_baseline` * `monitoring_config.numerical_threshold_config.value` * `monitoring_config.categorical_threshold_config.value` * `offline_storage_ttl_days`"
  ([name GoogleCloudAiplatformV1EntityType]
    (projects-locations-featurestores-entityTypes-patch
      name
      GoogleCloudAiplatformV1EntityType
      nil))
  ([name GoogleCloudAiplatformV1EntityType optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1EntityType})))

(defn projects-locations-featurestores-entityTypes-deleteFeatureValues
  "Delete Feature values from Featurestore. The progress of the deletion is tracked by the returned operation. The deleted feature values are guaranteed to be invisible to subsequent read operations after the operation is marked as successfully done. If a delete feature values operation fails, the feature values returned from reads and exports may be inconsistent. If consistency is required, the caller must retry the same delete request again and wait till the new operation returned is marked as successfully done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/deleteFeatureValues

entityType <> 
GoogleCloudAiplatformV1DeleteFeatureValuesRequest:
GoogleCloudAiplatformV1DeleteFeatureValuesRequest"
  [entityType GoogleCloudAiplatformV1DeleteFeatureValuesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+entityType}:deleteFeatureValues",
     :uri-template-args {"entityType" entityType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1DeleteFeatureValuesRequest}))

(defn projects-locations-featurestores-entityTypes-importFeatureValues
  "Imports Feature values into the Featurestore from a source storage. The progress of the import is tracked by the returned operation. The imported features are guaranteed to be visible to subsequent read operations after the operation is marked as successfully done. If an import operation fails, the Feature values returned from reads and exports may be inconsistent. If consistency is required, the caller must retry the same import request again and wait till the new operation returned is marked as successfully done. There are also scenarios where the caller can cause inconsistency. - Source data for import contains multiple distinct Feature values for the same entity ID and timestamp. - Source is modified during an import. This includes adding, updating, or removing source data and/or metadata. Examples of updating metadata include but are not limited to changing storage location, storage class, or retention policy. - Online serving cluster is under-provisioned.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/importFeatureValues

entityType <> 
GoogleCloudAiplatformV1ImportFeatureValuesRequest:
GoogleCloudAiplatformV1ImportFeatureValuesRequest"
  [entityType GoogleCloudAiplatformV1ImportFeatureValuesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+entityType}:importFeatureValues",
     :uri-template-args {"entityType" entityType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ImportFeatureValuesRequest}))

(defn projects-locations-featurestores-entityTypes-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-featurestores-entityTypes-getIamPolicy
      resource
      nil))
  ([resource optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-entityTypes-create
  "Creates a new EntityType in a given Featurestore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/create

parent <> 
GoogleCloudAiplatformV1EntityType:
GoogleCloudAiplatformV1EntityType

optional:
entityTypeId <string> Required. The ID to use for the EntityType, which will become the final component of the EntityType's resource name. This value may be up to 60 characters, and valid characters are `[a-z0-9_]`. The first character cannot be a number. The value must be unique within a featurestore."
  ([parent GoogleCloudAiplatformV1EntityType]
    (projects-locations-featurestores-entityTypes-create
      parent
      GoogleCloudAiplatformV1EntityType
      nil))
  ([parent GoogleCloudAiplatformV1EntityType optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/entityTypes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1EntityType})))

(defn projects-locations-featurestores-entityTypes-exportFeatureValues
  "Exports Feature values from all the entities of a target EntityType.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/exportFeatureValues

entityType <> 
GoogleCloudAiplatformV1ExportFeatureValuesRequest:
GoogleCloudAiplatformV1ExportFeatureValuesRequest"
  [entityType GoogleCloudAiplatformV1ExportFeatureValuesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+entityType}:exportFeatureValues",
     :uri-template-args {"entityType" entityType},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ExportFeatureValuesRequest}))

(defn projects-locations-featurestores-entityTypes-get
  "Gets details of a single EntityType.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featurestores-entityTypes-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/testIamPermissions

resource <> 

optional:
permissions <string> The set of permissions to check for the `resource`. Permissions with wildcards (such as `*` or `storage.*`) are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions)."
  ([resource]
    (projects-locations-featurestores-entityTypes-testIamPermissions
      resource
      nil))
  ([resource optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+resource}:testIamPermissions",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-entityTypes-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-featurestores-entityTypes-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-entityTypes-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featurestores-entityTypes-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-featurestores-entityTypes-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-entityTypes-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featurestores-entityTypes-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featurestores-entityTypes-features-get
  "Gets details of a single Feature.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/features/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featurestores-entityTypes-features-batchCreate
  "Creates a batch of Features in a given EntityType.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/features/batchCreate

parent <> 
GoogleCloudAiplatformV1BatchCreateFeaturesRequest:
GoogleCloudAiplatformV1BatchCreateFeaturesRequest"
  [parent GoogleCloudAiplatformV1BatchCreateFeaturesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/features:batchCreate",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1BatchCreateFeaturesRequest}))

(defn projects-locations-featurestores-entityTypes-features-create
  "Creates a new Feature in a given EntityType.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/features/create

parent <> 
GoogleCloudAiplatformV1Feature:
GoogleCloudAiplatformV1Feature

optional:
featureId <string> Required. The ID to use for the Feature, which will become the final component of the Feature's resource name. This value may be up to 128 characters, and valid characters are `[a-z0-9_]`. The first character cannot be a number. The value must be unique within an EntityType/FeatureGroup."
  ([parent GoogleCloudAiplatformV1Feature]
    (projects-locations-featurestores-entityTypes-features-create
      parent
      GoogleCloudAiplatformV1Feature
      nil))
  ([parent GoogleCloudAiplatformV1Feature optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/features",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Feature})))

(defn projects-locations-featurestores-entityTypes-features-delete
  "Deletes a single Feature.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/features/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featurestores-entityTypes-features-list
  "Lists Features in a given EntityType.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/features/list

parent <> 

optional:
pageSize <integer> The maximum number of Features to return. The service may return fewer than this value. If unspecified, at most 1000 Features will be returned. The maximum value is 1000; any value greater than 1000 will be coerced to 1000.
filter <string> Lists the Features that match the filter expression. The following filters are supported: * `value_type`: Supports = and != comparisons. * `create_time`: Supports =, !=, <, >, >=, and <= comparisons. Values must be in RFC 3339 format. * `update_time`: Supports =, !=, <, >, >=, and <= comparisons. Values must be in RFC 3339 format. * `labels`: Supports key-value equality as well as key presence. Examples: * `value_type = DOUBLE` --> Features whose type is DOUBLE. * `create_time > \\\"2020-01-31T15:30:00.000000Z\\\" OR update_time > \\\"2020-01-31T15:30:00.000000Z\\\"` --> EntityTypes created or updated after 2020-01-31T15:30:00.000000Z. * `labels.active = yes AND labels.env = prod` --> Features having both (active: yes) and (env: prod) labels. * `labels.env: *` --> Any Feature which has a label with 'env' as the key.
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `feature_id` * `value_type` (Not supported for FeatureRegistry Feature) * `create_time` * `update_time`
readMask <string> Mask specifying which fields to read.
latestStatsCount <integer> Only applicable for Vertex AI Feature Store (Legacy). If set, return the most recent ListFeaturesRequest.latest_stats_count of stats for each Feature in response. Valid value is [0, 10]. If number of stats exists < ListFeaturesRequest.latest_stats_count, return all existing stats."
  ([parent]
    (projects-locations-featurestores-entityTypes-features-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/features",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-entityTypes-features-patch
  "Updates the parameters of a single Feature.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/features/patch

name <> 
GoogleCloudAiplatformV1Feature:
GoogleCloudAiplatformV1Feature

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the Features resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then only the non-empty fields present in the request will be overwritten. Set the update_mask to `*` to override all fields. Updatable fields: * `description` * `labels` * `disable_monitoring` (Not supported for FeatureRegistryService Feature) * `point_of_contact` (Not supported for FeaturestoreService FeatureStore)"
  ([name GoogleCloudAiplatformV1Feature]
    (projects-locations-featurestores-entityTypes-features-patch
      name
      GoogleCloudAiplatformV1Feature
      nil))
  ([name GoogleCloudAiplatformV1Feature optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Feature})))

(defn projects-locations-featurestores-entityTypes-features-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/features/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-featurestores-entityTypes-features-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-entityTypes-features-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/features/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featurestores-entityTypes-features-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/features/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featurestores-entityTypes-features-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/features/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-featurestores-entityTypes-features-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featurestores-entityTypes-features-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featurestores/entityTypes/features/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-batchPredictionJobs-cancel
  "Cancels a BatchPredictionJob. Starts asynchronous cancellation on the BatchPredictionJob. The server makes the best effort to cancel the job, but success is not guaranteed. Clients can use JobService.GetBatchPredictionJob or other methods to check whether the cancellation succeeded or whether the job completed despite cancellation. On a successful cancellation, the BatchPredictionJob is not deleted;instead its BatchPredictionJob.state is set to `CANCELLED`. Any files already outputted by the job are not deleted.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/batchPredictionJobs/cancel

name <> 
GoogleCloudAiplatformV1CancelBatchPredictionJobRequest:
GoogleCloudAiplatformV1CancelBatchPredictionJobRequest"
  [name GoogleCloudAiplatformV1CancelBatchPredictionJobRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CancelBatchPredictionJobRequest}))

(defn projects-locations-batchPredictionJobs-create
  "Creates a BatchPredictionJob. A BatchPredictionJob once created will right away be attempted to start.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/batchPredictionJobs/create

parent <> 
GoogleCloudAiplatformV1BatchPredictionJob:
GoogleCloudAiplatformV1BatchPredictionJob"
  [parent GoogleCloudAiplatformV1BatchPredictionJob]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/batchPredictionJobs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1BatchPredictionJob}))

(defn projects-locations-batchPredictionJobs-delete
  "Deletes a BatchPredictionJob. Can only be called on jobs that already finished.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/batchPredictionJobs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-batchPredictionJobs-get
  "Gets a BatchPredictionJob
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/batchPredictionJobs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-batchPredictionJobs-list
  "Lists BatchPredictionJobs in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/batchPredictionJobs/list

parent <> 

optional:
pageSize <integer> The standard list page size.
readMask <string> Mask specifying which fields to read.
filter <string> The standard list filter. Supported fields: * `display_name` supports `=`, `!=` comparisons, and `:` wildcard. * `model_display_name` supports `=`, `!=` comparisons. * `state` supports `=`, `!=` comparisons. * `create_time` supports `=`, `!=`,`<`, `<=`,`>`, `>=` comparisons. `create_time` must be in RFC 3339 format. * `labels` supports general map functions that is: `labels.key=value` - key:value equality `labels.key:* - key existence Some examples of using the filter are: * `state=\"JOB_STATE_SUCCEEDED\" AND display_name:\"my_job_*\"` * `state!=\"JOB_STATE_FAILED\" OR display_name=\"my_job\"` * `NOT display_name=\"my_job\"` * `create_time>\"2021-05-18T00:00:00Z\"` * `labels.keyA=valueA` * `labels.keyB:*`"
  ([parent] (projects-locations-batchPredictionJobs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/batchPredictionJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-customJobs-list
  "Lists CustomJobs in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/customJobs/list

parent <> 

optional:
readMask <string> Mask specifying which fields to read.
pageSize <integer> The standard list page size.
filter <string> The standard list filter. Supported fields: * `display_name` supports `=`, `!=` comparisons, and `:` wildcard. * `state` supports `=`, `!=` comparisons. * `create_time` supports `=`, `!=`,`<`, `<=`,`>`, `>=` comparisons. `create_time` must be in RFC 3339 format. * `labels` supports general map functions that is: `labels.key=value` - key:value equality `labels.key:* - key existence Some examples of using the filter are: * `state=\"JOB_STATE_SUCCEEDED\" AND display_name:\"my_job_*\"` * `state!=\"JOB_STATE_FAILED\" OR display_name=\"my_job\"` * `NOT display_name=\"my_job\"` * `create_time>\"2021-05-18T00:00:00Z\"` * `labels.keyA=valueA` * `labels.keyB:*`"
  ([parent] (projects-locations-customJobs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/customJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-customJobs-get
  "Gets a CustomJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/customJobs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-customJobs-create
  "Creates a CustomJob. A created CustomJob right away will be attempted to be run.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/customJobs/create

parent <> 
GoogleCloudAiplatformV1CustomJob:
GoogleCloudAiplatformV1CustomJob"
  [parent GoogleCloudAiplatformV1CustomJob]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/customJobs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CustomJob}))

(defn projects-locations-customJobs-cancel
  "Cancels a CustomJob. Starts asynchronous cancellation on the CustomJob. The server makes a best effort to cancel the job, but success is not guaranteed. Clients can use JobService.GetCustomJob or other methods to check whether the cancellation succeeded or whether the job completed despite cancellation. On successful cancellation, the CustomJob is not deleted; instead it becomes a job with a CustomJob.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`, and CustomJob.state is set to `CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/customJobs/cancel

name <> 
GoogleCloudAiplatformV1CancelCustomJobRequest:
GoogleCloudAiplatformV1CancelCustomJobRequest"
  [name GoogleCloudAiplatformV1CancelCustomJobRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CancelCustomJobRequest}))

(defn projects-locations-customJobs-delete
  "Deletes a CustomJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/customJobs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-customJobs-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/customJobs/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-customJobs-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/customJobs/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-customJobs-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/customJobs/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-customJobs-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/customJobs/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-customJobs-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-customJobs-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/customJobs/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-customJobs-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-notebookRuntimeTemplates-patch
  "Updates a NotebookRuntimeTemplate.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimeTemplates/patch

name <> 
GoogleCloudAiplatformV1NotebookRuntimeTemplate:
GoogleCloudAiplatformV1NotebookRuntimeTemplate

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see google.protobuf.FieldMask. Input format: `{paths: \"${updated_filed}\"}` Updatable fields: * `encryption_spec.kms_key_name`"
  ([name GoogleCloudAiplatformV1NotebookRuntimeTemplate]
    (projects-locations-notebookRuntimeTemplates-patch
      name
      GoogleCloudAiplatformV1NotebookRuntimeTemplate
      nil))
  ([name GoogleCloudAiplatformV1NotebookRuntimeTemplate optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1NotebookRuntimeTemplate})))

(defn projects-locations-notebookRuntimeTemplates-list
  "Lists NotebookRuntimeTemplates in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimeTemplates/list

parent <> 

optional:
orderBy <string> Optional. A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `display_name` * `create_time` * `update_time` Example: `display_name, create_time desc`.
pageSize <integer> Optional. The standard list page size.
filter <string> Optional. An expression for filtering the results of the request. For field names both snake_case and camelCase are supported. * `notebookRuntimeTemplate` supports = and !=. `notebookRuntimeTemplate` represents the NotebookRuntimeTemplate ID, i.e. the last segment of the NotebookRuntimeTemplate's resource name. * `display_name` supports = and != * `labels` supports general map functions that is: * `labels.key=value` - key:value equality * `labels.key:* or labels:key - key existence * A key including a space must be quoted. `labels.\"a key\"`. * `notebookRuntimeType` supports = and !=. notebookRuntimeType enum: [USER_DEFINED, ONE_CLICK]. Some examples: * `notebookRuntimeTemplate=notebookRuntimeTemplate123` * `displayName=\"myDisplayName\"` * `labels.myKey=\"myValue\"` * `notebookRuntimeType=USER_DEFINED`
readMask <string> Optional. Mask specifying which fields to read."
  ([parent]
    (projects-locations-notebookRuntimeTemplates-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/notebookRuntimeTemplates",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-notebookRuntimeTemplates-get
  "Gets a NotebookRuntimeTemplate.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimeTemplates/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notebookRuntimeTemplates-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimeTemplates/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-notebookRuntimeTemplates-getIamPolicy
      resource
      nil))
  ([resource optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-notebookRuntimeTemplates-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimeTemplates/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1SetIamPolicyRequest}))

(defn projects-locations-notebookRuntimeTemplates-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimeTemplates/testIamPermissions

resource <> 

optional:
permissions <string> The set of permissions to check for the `resource`. Permissions with wildcards (such as `*` or `storage.*`) are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions)."
  ([resource]
    (projects-locations-notebookRuntimeTemplates-testIamPermissions
      resource
      nil))
  ([resource optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+resource}:testIamPermissions",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-notebookRuntimeTemplates-create
  "Creates a NotebookRuntimeTemplate.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimeTemplates/create

parent <> 
GoogleCloudAiplatformV1NotebookRuntimeTemplate:
GoogleCloudAiplatformV1NotebookRuntimeTemplate

optional:
notebookRuntimeTemplateId <string> Optional. User specified ID for the notebook runtime template."
  ([parent GoogleCloudAiplatformV1NotebookRuntimeTemplate]
    (projects-locations-notebookRuntimeTemplates-create
      parent
      GoogleCloudAiplatformV1NotebookRuntimeTemplate
      nil))
  ([parent GoogleCloudAiplatformV1NotebookRuntimeTemplate optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/notebookRuntimeTemplates",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1NotebookRuntimeTemplate})))

(defn projects-locations-notebookRuntimeTemplates-delete
  "Deletes a NotebookRuntimeTemplate.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimeTemplates/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notebookRuntimeTemplates-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimeTemplates/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-notebookRuntimeTemplates-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-notebookRuntimeTemplates-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimeTemplates/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notebookRuntimeTemplates-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimeTemplates/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notebookRuntimeTemplates-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimeTemplates/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-notebookRuntimeTemplates-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-notebookRuntimeTemplates-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookRuntimeTemplates/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-modelDeploymentMonitoringJobs-get
  "Gets a ModelDeploymentMonitoringJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/modelDeploymentMonitoringJobs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-modelDeploymentMonitoringJobs-searchModelDeploymentMonitoringStatsAnomalies
  "Searches Model Monitoring Statistics generated within a given time window.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/modelDeploymentMonitoringJobs/searchModelDeploymentMonitoringStatsAnomalies

modelDeploymentMonitoringJob <> 
GoogleCloudAiplatformV1SearchModelDeploymentMonitoringStatsAnomaliesRequest:
GoogleCloudAiplatformV1SearchModelDeploymentMonitoringStatsAnomaliesRequest"
  [modelDeploymentMonitoringJob
   GoogleCloudAiplatformV1SearchModelDeploymentMonitoringStatsAnomaliesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+modelDeploymentMonitoringJob}:searchModelDeploymentMonitoringStatsAnomalies",
     :uri-template-args
     {"modelDeploymentMonitoringJob" modelDeploymentMonitoringJob},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudAiplatformV1SearchModelDeploymentMonitoringStatsAnomaliesRequest}))

(defn projects-locations-modelDeploymentMonitoringJobs-delete
  "Deletes a ModelDeploymentMonitoringJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/modelDeploymentMonitoringJobs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-modelDeploymentMonitoringJobs-create
  "Creates a ModelDeploymentMonitoringJob. It will run periodically on a configured interval.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/modelDeploymentMonitoringJobs/create

parent <> 
GoogleCloudAiplatformV1ModelDeploymentMonitoringJob:
GoogleCloudAiplatformV1ModelDeploymentMonitoringJob"
  [parent GoogleCloudAiplatformV1ModelDeploymentMonitoringJob]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/modelDeploymentMonitoringJobs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ModelDeploymentMonitoringJob}))

(defn projects-locations-modelDeploymentMonitoringJobs-pause
  "Pauses a ModelDeploymentMonitoringJob. If the job is running, the server makes a best effort to cancel the job. Will mark ModelDeploymentMonitoringJob.state to 'PAUSED'.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/modelDeploymentMonitoringJobs/pause

name <> 
GoogleCloudAiplatformV1PauseModelDeploymentMonitoringJobRequest:
GoogleCloudAiplatformV1PauseModelDeploymentMonitoringJobRequest"
  [name
   GoogleCloudAiplatformV1PauseModelDeploymentMonitoringJobRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:pause",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudAiplatformV1PauseModelDeploymentMonitoringJobRequest}))

(defn projects-locations-modelDeploymentMonitoringJobs-resume
  "Resumes a paused ModelDeploymentMonitoringJob. It will start to run from next scheduled time. A deleted ModelDeploymentMonitoringJob can't be resumed.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/modelDeploymentMonitoringJobs/resume

name <> 
GoogleCloudAiplatformV1ResumeModelDeploymentMonitoringJobRequest:
GoogleCloudAiplatformV1ResumeModelDeploymentMonitoringJobRequest"
  [name
   GoogleCloudAiplatformV1ResumeModelDeploymentMonitoringJobRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:resume",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudAiplatformV1ResumeModelDeploymentMonitoringJobRequest}))

(defn projects-locations-modelDeploymentMonitoringJobs-patch
  "Updates a ModelDeploymentMonitoringJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/modelDeploymentMonitoringJobs/patch

name <> 
GoogleCloudAiplatformV1ModelDeploymentMonitoringJob:
GoogleCloudAiplatformV1ModelDeploymentMonitoringJob

optional:
updateMask <string> Required. The update mask is used to specify the fields to be overwritten in the ModelDeploymentMonitoringJob resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then only the non-empty fields present in the request will be overwritten. Set the update_mask to `*` to override all fields. For the objective config, the user can either provide the update mask for model_deployment_monitoring_objective_configs or any combination of its nested fields, such as: model_deployment_monitoring_objective_configs.objective_config.training_dataset. Updatable fields: * `display_name` * `model_deployment_monitoring_schedule_config` * `model_monitoring_alert_config` * `logging_sampling_strategy` * `labels` * `log_ttl` * `enable_monitoring_pipeline_logs` . and * `model_deployment_monitoring_objective_configs` . or * `model_deployment_monitoring_objective_configs.objective_config.training_dataset` * `model_deployment_monitoring_objective_configs.objective_config.training_prediction_skew_detection_config` * `model_deployment_monitoring_objective_configs.objective_config.prediction_drift_detection_config`"
  ([name GoogleCloudAiplatformV1ModelDeploymentMonitoringJob]
    (projects-locations-modelDeploymentMonitoringJobs-patch
      name
      GoogleCloudAiplatformV1ModelDeploymentMonitoringJob
      nil))
  ([name GoogleCloudAiplatformV1ModelDeploymentMonitoringJob optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1ModelDeploymentMonitoringJob})))

(defn projects-locations-modelDeploymentMonitoringJobs-list
  "Lists ModelDeploymentMonitoringJobs in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/modelDeploymentMonitoringJobs/list

parent <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter. Supported fields: * `display_name` supports `=`, `!=` comparisons, and `:` wildcard. * `state` supports `=`, `!=` comparisons. * `create_time` supports `=`, `!=`,`<`, `<=`,`>`, `>=` comparisons. `create_time` must be in RFC 3339 format. * `labels` supports general map functions that is: `labels.key=value` - key:value equality `labels.key:* - key existence Some examples of using the filter are: * `state=\"JOB_STATE_SUCCEEDED\" AND display_name:\"my_job_*\"` * `state!=\"JOB_STATE_FAILED\" OR display_name=\"my_job\"` * `NOT display_name=\"my_job\"` * `create_time>\"2021-05-18T00:00:00Z\"` * `labels.keyA=valueA` * `labels.keyB:*`
readMask <string> Mask specifying which fields to read"
  ([parent]
    (projects-locations-modelDeploymentMonitoringJobs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/modelDeploymentMonitoringJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-modelDeploymentMonitoringJobs-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/modelDeploymentMonitoringJobs/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-modelDeploymentMonitoringJobs-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/modelDeploymentMonitoringJobs/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-modelDeploymentMonitoringJobs-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/modelDeploymentMonitoringJobs/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-modelDeploymentMonitoringJobs-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-modelDeploymentMonitoringJobs-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/modelDeploymentMonitoringJobs/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-modelDeploymentMonitoringJobs-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/modelDeploymentMonitoringJobs/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-modelDeploymentMonitoringJobs-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tuningJobs-list
  "Lists TuningJobs in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tuningJobs/list

parent <> 

optional:
filter <string> Optional. The standard list filter.
pageSize <integer> Optional. The standard list page size."
  ([parent] (projects-locations-tuningJobs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/tuningJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tuningJobs-cancel
  "Cancels a TuningJob. Starts asynchronous cancellation on the TuningJob. The server makes a best effort to cancel the job, but success is not guaranteed. Clients can use GenAiTuningService.GetTuningJob or other methods to check whether the cancellation succeeded or whether the job completed despite cancellation. On successful cancellation, the TuningJob is not deleted; instead it becomes a job with a TuningJob.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`, and TuningJob.state is set to `CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tuningJobs/cancel

name <> 
GoogleCloudAiplatformV1CancelTuningJobRequest:
GoogleCloudAiplatformV1CancelTuningJobRequest"
  [name GoogleCloudAiplatformV1CancelTuningJobRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CancelTuningJobRequest}))

(defn projects-locations-tuningJobs-get
  "Gets a TuningJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tuningJobs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tuningJobs-create
  "Creates a TuningJob. A created TuningJob right away will be attempted to be run.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tuningJobs/create

parent <> 
GoogleCloudAiplatformV1TuningJob:
GoogleCloudAiplatformV1TuningJob"
  [parent GoogleCloudAiplatformV1TuningJob]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/tuningJobs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1TuningJob}))

(defn projects-locations-tuningJobs-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tuningJobs/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-tuningJobs-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tuningJobs-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tuningJobs/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tuningJobs-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tuningJobs/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-trainingPipelines-create
  "Creates a TrainingPipeline. A created TrainingPipeline right away will be attempted to be run.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/trainingPipelines/create

parent <> 
GoogleCloudAiplatformV1TrainingPipeline:
GoogleCloudAiplatformV1TrainingPipeline"
  [parent GoogleCloudAiplatformV1TrainingPipeline]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/trainingPipelines",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1TrainingPipeline}))

(defn projects-locations-trainingPipelines-delete
  "Deletes a TrainingPipeline.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/trainingPipelines/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-trainingPipelines-list
  "Lists TrainingPipelines in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/trainingPipelines/list

parent <> 

optional:
pageSize <integer> The standard list page size.
readMask <string> Mask specifying which fields to read.
filter <string> The standard list filter. Supported fields: * `display_name` supports `=`, `!=` comparisons, and `:` wildcard. * `state` supports `=`, `!=` comparisons. * `training_task_definition` `=`, `!=` comparisons, and `:` wildcard. * `create_time` supports `=`, `!=`,`<`, `<=`,`>`, `>=` comparisons. `create_time` must be in RFC 3339 format. * `labels` supports general map functions that is: `labels.key=value` - key:value equality `labels.key:* - key existence Some examples of using the filter are: * `state=\"PIPELINE_STATE_SUCCEEDED\" AND display_name:\"my_pipeline_*\"` * `state!=\"PIPELINE_STATE_FAILED\" OR display_name=\"my_pipeline\"` * `NOT display_name=\"my_pipeline\"` * `create_time>\"2021-05-18T00:00:00Z\"` * `training_task_definition:\"*automl_text_classification*\"`"
  ([parent] (projects-locations-trainingPipelines-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/trainingPipelines",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-trainingPipelines-cancel
  "Cancels a TrainingPipeline. Starts asynchronous cancellation on the TrainingPipeline. The server makes a best effort to cancel the pipeline, but success is not guaranteed. Clients can use PipelineService.GetTrainingPipeline or other methods to check whether the cancellation succeeded or whether the pipeline completed despite cancellation. On successful cancellation, the TrainingPipeline is not deleted; instead it becomes a pipeline with a TrainingPipeline.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`, and TrainingPipeline.state is set to `CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/trainingPipelines/cancel

name <> 
GoogleCloudAiplatformV1CancelTrainingPipelineRequest:
GoogleCloudAiplatformV1CancelTrainingPipelineRequest"
  [name GoogleCloudAiplatformV1CancelTrainingPipelineRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CancelTrainingPipelineRequest}))

(defn projects-locations-trainingPipelines-get
  "Gets a TrainingPipeline.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/trainingPipelines/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-trainingPipelines-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/trainingPipelines/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-trainingPipelines-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-trainingPipelines-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/trainingPipelines/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-trainingPipelines-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/trainingPipelines/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-trainingPipelines-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/trainingPipelines/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-trainingPipelines-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-trainingPipelines-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/trainingPipelines/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-readUsage
  "Returns a list of monthly active users for a given TensorBoard instance.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/readUsage

tensorboard <> "
  [tensorboard]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+tensorboard}:readUsage",
     :uri-template-args {"tensorboard" tensorboard},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-delete
  "Deletes a Tensorboard.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-create
  "Creates a Tensorboard.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/create

parent <> 
GoogleCloudAiplatformV1Tensorboard:
GoogleCloudAiplatformV1Tensorboard"
  [parent GoogleCloudAiplatformV1Tensorboard]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/tensorboards",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1Tensorboard}))

(defn projects-locations-tensorboards-get
  "Gets a Tensorboard.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-tensorboards-readSize
  "Returns the storage size for a given TensorBoard instance.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/readSize

tensorboard <> "
  [tensorboard]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+tensorboard}:readSize",
     :uri-template-args {"tensorboard" tensorboard},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-batchRead
  "Reads multiple TensorboardTimeSeries' data. The data point number limit is 1000 for scalars, 100 for tensors and blob references. If the number of data points stored is less than the limit, all data is returned. Otherwise, the number limit of data points is randomly selected from this time series and returned.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/batchRead

tensorboard <> 

optional:
timeSeries <string> Required. The resource names of the TensorboardTimeSeries to read data from. Format: `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`"
  ([tensorboard]
    (projects-locations-tensorboards-batchRead tensorboard nil))
  ([tensorboard optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+tensorboard}:batchRead",
       :uri-template-args {"tensorboard" tensorboard},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tensorboards-patch
  "Updates a Tensorboard.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/patch

name <> 
GoogleCloudAiplatformV1Tensorboard:
GoogleCloudAiplatformV1Tensorboard

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the Tensorboard resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field is overwritten if it's in the mask. If the user does not provide a mask then all fields are overwritten if new values are specified."
  ([name GoogleCloudAiplatformV1Tensorboard]
    (projects-locations-tensorboards-patch
      name
      GoogleCloudAiplatformV1Tensorboard
      nil))
  ([name GoogleCloudAiplatformV1Tensorboard optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Tensorboard})))

(defn projects-locations-tensorboards-list
  "Lists Tensorboards in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/list

parent <> 

optional:
pageSize <integer> The maximum number of Tensorboards to return. The service may return fewer than this value. If unspecified, at most 100 Tensorboards are returned. The maximum value is 100; values above 100 are coerced to 100.
readMask <string> Mask specifying which fields to read.
orderBy <string> Field to use to sort the list.
filter <string> Lists the Tensorboards that match the filter expression."
  ([parent] (projects-locations-tensorboards-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/tensorboards",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-tensorboards-experiments-create
  "Creates a TensorboardExperiment.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/create

parent <> 
GoogleCloudAiplatformV1TensorboardExperiment:
GoogleCloudAiplatformV1TensorboardExperiment

optional:
tensorboardExperimentId <string> Required. The ID to use for the Tensorboard experiment, which becomes the final component of the Tensorboard experiment's resource name. This value should be 1-128 characters, and valid characters are `/a-z-/`."
  ([parent GoogleCloudAiplatformV1TensorboardExperiment]
    (projects-locations-tensorboards-experiments-create
      parent
      GoogleCloudAiplatformV1TensorboardExperiment
      nil))
  ([parent GoogleCloudAiplatformV1TensorboardExperiment optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/experiments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1TensorboardExperiment})))

(defn projects-locations-tensorboards-experiments-patch
  "Updates a TensorboardExperiment.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/patch

name <> 
GoogleCloudAiplatformV1TensorboardExperiment:
GoogleCloudAiplatformV1TensorboardExperiment

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the TensorboardExperiment resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field is overwritten if it's in the mask. If the user does not provide a mask then all fields are overwritten if new values are specified."
  ([name GoogleCloudAiplatformV1TensorboardExperiment]
    (projects-locations-tensorboards-experiments-patch
      name
      GoogleCloudAiplatformV1TensorboardExperiment
      nil))
  ([name GoogleCloudAiplatformV1TensorboardExperiment optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1TensorboardExperiment})))

(defn projects-locations-tensorboards-experiments-list
  "Lists TensorboardExperiments in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/list

parent <> 

optional:
pageSize <integer> The maximum number of TensorboardExperiments to return. The service may return fewer than this value. If unspecified, at most 50 TensorboardExperiments are returned. The maximum value is 1000; values above 1000 are coerced to 1000.
orderBy <string> Field to use to sort the list.
readMask <string> Mask specifying which fields to read.
filter <string> Lists the TensorboardExperiments that match the filter expression."
  ([parent]
    (projects-locations-tensorboards-experiments-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/experiments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-tensorboards-experiments-get
  "Gets a TensorboardExperiment.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-tensorboards-experiments-delete
  "Deletes a TensorboardExperiment.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-experiments-write
  "Write time series data points of multiple TensorboardTimeSeries in multiple TensorboardRun's. If any data fail to be ingested, an error is returned.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/write

tensorboardExperiment <> 
GoogleCloudAiplatformV1WriteTensorboardExperimentDataRequest:
GoogleCloudAiplatformV1WriteTensorboardExperimentDataRequest"
  [tensorboardExperiment
   GoogleCloudAiplatformV1WriteTensorboardExperimentDataRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+tensorboardExperiment}:write",
     :uri-template-args
     {"tensorboardExperiment" tensorboardExperiment},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudAiplatformV1WriteTensorboardExperimentDataRequest}))

(defn projects-locations-tensorboards-experiments-batchCreate
  "Batch create TensorboardTimeSeries that belong to a TensorboardExperiment.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/batchCreate

parent <> 
GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest:
GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest"
  [parent
   GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}:batchCreate",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest}))

(defn projects-locations-tensorboards-experiments-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-tensorboards-experiments-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tensorboards-experiments-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-experiments-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-experiments-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-tensorboards-experiments-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tensorboards-experiments-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-experiments-runs-batchCreate
  "Batch create TensorboardRuns.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/batchCreate

parent <> 
GoogleCloudAiplatformV1BatchCreateTensorboardRunsRequest:
GoogleCloudAiplatformV1BatchCreateTensorboardRunsRequest"
  [parent GoogleCloudAiplatformV1BatchCreateTensorboardRunsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/runs:batchCreate",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1BatchCreateTensorboardRunsRequest}))

(defn projects-locations-tensorboards-experiments-runs-create
  "Creates a TensorboardRun.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/create

parent <> 
GoogleCloudAiplatformV1TensorboardRun:
GoogleCloudAiplatformV1TensorboardRun

optional:
tensorboardRunId <string> Required. The ID to use for the Tensorboard run, which becomes the final component of the Tensorboard run's resource name. This value should be 1-128 characters, and valid characters are `/a-z-/`."
  ([parent GoogleCloudAiplatformV1TensorboardRun]
    (projects-locations-tensorboards-experiments-runs-create
      parent
      GoogleCloudAiplatformV1TensorboardRun
      nil))
  ([parent GoogleCloudAiplatformV1TensorboardRun optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/runs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1TensorboardRun})))

(defn projects-locations-tensorboards-experiments-runs-get
  "Gets a TensorboardRun.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-tensorboards-experiments-runs-list
  "Lists TensorboardRuns in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/list

parent <> 

optional:
readMask <string> Mask specifying which fields to read.
orderBy <string> Field to use to sort the list.
pageSize <integer> The maximum number of TensorboardRuns to return. The service may return fewer than this value. If unspecified, at most 50 TensorboardRuns are returned. The maximum value is 1000; values above 1000 are coerced to 1000.
filter <string> Lists the TensorboardRuns that match the filter expression."
  ([parent]
    (projects-locations-tensorboards-experiments-runs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/runs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-tensorboards-experiments-runs-delete
  "Deletes a TensorboardRun.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-experiments-runs-patch
  "Updates a TensorboardRun.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/patch

name <> 
GoogleCloudAiplatformV1TensorboardRun:
GoogleCloudAiplatformV1TensorboardRun

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the TensorboardRun resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field is overwritten if it's in the mask. If the user does not provide a mask then all fields are overwritten if new values are specified."
  ([name GoogleCloudAiplatformV1TensorboardRun]
    (projects-locations-tensorboards-experiments-runs-patch
      name
      GoogleCloudAiplatformV1TensorboardRun
      nil))
  ([name GoogleCloudAiplatformV1TensorboardRun optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1TensorboardRun})))

(defn projects-locations-tensorboards-experiments-runs-write
  "Write time series data points into multiple TensorboardTimeSeries under a TensorboardRun. If any data fail to be ingested, an error is returned.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/write

tensorboardRun <> 
GoogleCloudAiplatformV1WriteTensorboardRunDataRequest:
GoogleCloudAiplatformV1WriteTensorboardRunDataRequest"
  [tensorboardRun
   GoogleCloudAiplatformV1WriteTensorboardRunDataRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+tensorboardRun}:write",
     :uri-template-args {"tensorboardRun" tensorboardRun},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1WriteTensorboardRunDataRequest}))

(defn projects-locations-tensorboards-experiments-runs-timeSeries-readBlobData
  "Gets bytes of TensorboardBlobs. This is to allow reading blob data stored in consumer project's Cloud Storage bucket without users having to obtain Cloud Storage access permission.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/timeSeries/readBlobData

timeSeries <> 

optional:
blobIds <string> IDs of the blobs to read."
  ([timeSeries]
    (projects-locations-tensorboards-experiments-runs-timeSeries-readBlobData
      timeSeries
      nil))
  ([timeSeries optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+timeSeries}:readBlobData",
       :uri-template-args {"timeSeries" timeSeries},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-tensorboards-experiments-runs-timeSeries-get
  "Gets a TensorboardTimeSeries.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/timeSeries/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-tensorboards-experiments-runs-timeSeries-exportTensorboardTimeSeries
  "Exports a TensorboardTimeSeries' data. Data is returned in paginated responses.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/timeSeries/exportTensorboardTimeSeries

tensorboardTimeSeries <> 
GoogleCloudAiplatformV1ExportTensorboardTimeSeriesDataRequest:
GoogleCloudAiplatformV1ExportTensorboardTimeSeriesDataRequest"
  [tensorboardTimeSeries
   GoogleCloudAiplatformV1ExportTensorboardTimeSeriesDataRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+tensorboardTimeSeries}:exportTensorboardTimeSeries",
     :uri-template-args
     {"tensorboardTimeSeries" tensorboardTimeSeries},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudAiplatformV1ExportTensorboardTimeSeriesDataRequest}))

(defn projects-locations-tensorboards-experiments-runs-timeSeries-list
  "Lists TensorboardTimeSeries in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/timeSeries/list

parent <> 

optional:
orderBy <string> Field to use to sort the list.
pageSize <integer> The maximum number of TensorboardTimeSeries to return. The service may return fewer than this value. If unspecified, at most 50 TensorboardTimeSeries are returned. The maximum value is 1000; values above 1000 are coerced to 1000.
filter <string> Lists the TensorboardTimeSeries that match the filter expression.
readMask <string> Mask specifying which fields to read."
  ([parent]
    (projects-locations-tensorboards-experiments-runs-timeSeries-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/timeSeries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-tensorboards-experiments-runs-timeSeries-delete
  "Deletes a TensorboardTimeSeries.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/timeSeries/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-experiments-runs-timeSeries-read
  "Reads a TensorboardTimeSeries' data. By default, if the number of data points stored is less than 1000, all data is returned. Otherwise, 1000 data points is randomly selected from this time series and returned. This value can be changed by changing max_data_points, which can't be greater than 10k.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/timeSeries/read

tensorboardTimeSeries <> 

optional:
filter <string> Reads the TensorboardTimeSeries' data that match the filter expression.
maxDataPoints <integer> The maximum number of TensorboardTimeSeries' data to return. This value should be a positive integer. This value can be set to -1 to return all data."
  ([tensorboardTimeSeries]
    (projects-locations-tensorboards-experiments-runs-timeSeries-read
      tensorboardTimeSeries
      nil))
  ([tensorboardTimeSeries optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+tensorboardTimeSeries}:read",
       :uri-template-args
       {"tensorboardTimeSeries" tensorboardTimeSeries},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-tensorboards-experiments-runs-timeSeries-patch
  "Updates a TensorboardTimeSeries.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/timeSeries/patch

name <> 
GoogleCloudAiplatformV1TensorboardTimeSeries:
GoogleCloudAiplatformV1TensorboardTimeSeries

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the TensorboardTimeSeries resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field is overwritten if it's in the mask. If the user does not provide a mask then all fields are overwritten if new values are specified."
  ([name GoogleCloudAiplatformV1TensorboardTimeSeries]
    (projects-locations-tensorboards-experiments-runs-timeSeries-patch
      name
      GoogleCloudAiplatformV1TensorboardTimeSeries
      nil))
  ([name GoogleCloudAiplatformV1TensorboardTimeSeries optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1TensorboardTimeSeries})))

(defn projects-locations-tensorboards-experiments-runs-timeSeries-create
  "Creates a TensorboardTimeSeries.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/timeSeries/create

parent <> 
GoogleCloudAiplatformV1TensorboardTimeSeries:
GoogleCloudAiplatformV1TensorboardTimeSeries

optional:
tensorboardTimeSeriesId <string> Optional. The user specified unique ID to use for the TensorboardTimeSeries, which becomes the final component of the TensorboardTimeSeries's resource name. This value should match \"a-z0-9{0, 127}\""
  ([parent GoogleCloudAiplatformV1TensorboardTimeSeries]
    (projects-locations-tensorboards-experiments-runs-timeSeries-create
      parent
      GoogleCloudAiplatformV1TensorboardTimeSeries
      nil))
  ([parent GoogleCloudAiplatformV1TensorboardTimeSeries optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/timeSeries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1TensorboardTimeSeries})))

(defn projects-locations-tensorboards-experiments-runs-timeSeries-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/timeSeries/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-tensorboards-experiments-runs-timeSeries-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tensorboards-experiments-runs-timeSeries-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/timeSeries/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-experiments-runs-timeSeries-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/timeSeries/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-experiments-runs-timeSeries-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/timeSeries/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-tensorboards-experiments-runs-timeSeries-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tensorboards-experiments-runs-timeSeries-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/timeSeries/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-experiments-runs-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-tensorboards-experiments-runs-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tensorboards-experiments-runs-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-experiments-runs-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-experiments-runs-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-tensorboards-experiments-runs-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tensorboards-experiments-runs-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/experiments/runs/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-tensorboards-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tensorboards-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tensorboards-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name] (projects-locations-tensorboards-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tensorboards-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/tensorboards/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-nasJobs-create
  "Creates a NasJob
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/nasJobs/create

parent <> 
GoogleCloudAiplatformV1NasJob:
GoogleCloudAiplatformV1NasJob"
  [parent GoogleCloudAiplatformV1NasJob]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/nasJobs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1NasJob}))

(defn projects-locations-nasJobs-delete
  "Deletes a NasJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/nasJobs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-nasJobs-list
  "Lists NasJobs in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/nasJobs/list

parent <> 

optional:
readMask <string> Mask specifying which fields to read.
filter <string> The standard list filter. Supported fields: * `display_name` supports `=`, `!=` comparisons, and `:` wildcard. * `state` supports `=`, `!=` comparisons. * `create_time` supports `=`, `!=`,`<`, `<=`,`>`, `>=` comparisons. `create_time` must be in RFC 3339 format. * `labels` supports general map functions that is: `labels.key=value` - key:value equality `labels.key:* - key existence Some examples of using the filter are: * `state=\"JOB_STATE_SUCCEEDED\" AND display_name:\"my_job_*\"` * `state!=\"JOB_STATE_FAILED\" OR display_name=\"my_job\"` * `NOT display_name=\"my_job\"` * `create_time>\"2021-05-18T00:00:00Z\"` * `labels.keyA=valueA` * `labels.keyB:*`
pageSize <integer> The standard list page size."
  ([parent] (projects-locations-nasJobs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/nasJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-nasJobs-get
  "Gets a NasJob
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/nasJobs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-nasJobs-cancel
  "Cancels a NasJob. Starts asynchronous cancellation on the NasJob. The server makes a best effort to cancel the job, but success is not guaranteed. Clients can use JobService.GetNasJob or other methods to check whether the cancellation succeeded or whether the job completed despite cancellation. On successful cancellation, the NasJob is not deleted; instead it becomes a job with a NasJob.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`, and NasJob.state is set to `CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/nasJobs/cancel

name <> 
GoogleCloudAiplatformV1CancelNasJobRequest:
GoogleCloudAiplatformV1CancelNasJobRequest"
  [name GoogleCloudAiplatformV1CancelNasJobRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CancelNasJobRequest}))

(defn projects-locations-nasJobs-nasTrialDetails-get
  "Gets a NasTrialDetail.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/nasJobs/nasTrialDetails/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-nasJobs-nasTrialDetails-list
  "List top NasTrialDetails of a NasJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/nasJobs/nasTrialDetails/list

parent <> 

optional:
pageSize <integer> The standard list page size."
  ([parent]
    (projects-locations-nasJobs-nasTrialDetails-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/nasTrialDetails",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-persistentResources-get
  "Gets a PersistentResource.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/persistentResources/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-persistentResources-list
  "Lists PersistentResources in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/persistentResources/list

parent <> 

optional:
pageSize <integer> Optional. The standard list page size."
  ([parent] (projects-locations-persistentResources-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/persistentResources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-persistentResources-delete
  "Deletes a PersistentResource.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/persistentResources/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-persistentResources-patch
  "Updates a PersistentResource.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/persistentResources/patch

name <> 
GoogleCloudAiplatformV1PersistentResource:
GoogleCloudAiplatformV1PersistentResource

optional:
updateMask <string> Required. Specify the fields to be overwritten in the PersistentResource by the update method."
  ([name GoogleCloudAiplatformV1PersistentResource]
    (projects-locations-persistentResources-patch
      name
      GoogleCloudAiplatformV1PersistentResource
      nil))
  ([name GoogleCloudAiplatformV1PersistentResource optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1PersistentResource})))

(defn projects-locations-persistentResources-create
  "Creates a PersistentResource.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/persistentResources/create

parent <> 
GoogleCloudAiplatformV1PersistentResource:
GoogleCloudAiplatformV1PersistentResource

optional:
persistentResourceId <string> Required. The ID to use for the PersistentResource, which become the final component of the PersistentResource's resource name. The maximum length is 63 characters, and valid characters are `/^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$/`."
  ([parent GoogleCloudAiplatformV1PersistentResource]
    (projects-locations-persistentResources-create
      parent
      GoogleCloudAiplatformV1PersistentResource
      nil))
  ([parent GoogleCloudAiplatformV1PersistentResource optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/persistentResources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1PersistentResource})))

(defn projects-locations-persistentResources-reboot
  "Reboots a PersistentResource.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/persistentResources/reboot

name <> 
GoogleCloudAiplatformV1RebootPersistentResourceRequest:
GoogleCloudAiplatformV1RebootPersistentResourceRequest"
  [name GoogleCloudAiplatformV1RebootPersistentResourceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:reboot",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1RebootPersistentResourceRequest}))

(defn projects-locations-persistentResources-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/persistentResources/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-persistentResources-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/persistentResources/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-persistentResources-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-persistentResources-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/persistentResources/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-persistentResources-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-persistentResources-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/persistentResources/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-persistentResources-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/persistentResources/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notebookExecutionJobs-delete
  "Deletes a NotebookExecutionJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookExecutionJobs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notebookExecutionJobs-create
  "Creates a NotebookExecutionJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookExecutionJobs/create

parent <> 
GoogleCloudAiplatformV1NotebookExecutionJob:
GoogleCloudAiplatformV1NotebookExecutionJob

optional:
notebookExecutionJobId <string> Optional. User specified ID for the NotebookExecutionJob."
  ([parent GoogleCloudAiplatformV1NotebookExecutionJob]
    (projects-locations-notebookExecutionJobs-create
      parent
      GoogleCloudAiplatformV1NotebookExecutionJob
      nil))
  ([parent GoogleCloudAiplatformV1NotebookExecutionJob optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/notebookExecutionJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1NotebookExecutionJob})))

(defn projects-locations-notebookExecutionJobs-list
  "Lists NotebookExecutionJobs in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookExecutionJobs/list

parent <> 

optional:
pageSize <integer> Optional. The standard list page size.
view <string> Optional. The NotebookExecutionJob view. Defaults to BASIC.
filter <string> Optional. An expression for filtering the results of the request. For field names both snake_case and camelCase are supported. * `notebookExecutionJob` supports = and !=. `notebookExecutionJob` represents the NotebookExecutionJob ID. * `displayName` supports = and != and regex. * `schedule` supports = and != and regex. Some examples: * `notebookExecutionJob=\"123\"` * `notebookExecutionJob=\"my-execution-job\"` * `displayName=\"myDisplayName\"` and `displayName=~\"myDisplayNameRegex\"`
orderBy <string> Optional. A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `display_name` * `create_time` * `update_time` Example: `display_name, create_time desc`."
  ([parent] (projects-locations-notebookExecutionJobs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/notebookExecutionJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-notebookExecutionJobs-get
  "Gets a NotebookExecutionJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookExecutionJobs/get

name <> 

optional:
view <string> Optional. The NotebookExecutionJob view. Defaults to BASIC."
  ([name] (projects-locations-notebookExecutionJobs-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-notebookExecutionJobs-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookExecutionJobs/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notebookExecutionJobs-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookExecutionJobs/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-notebookExecutionJobs-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-notebookExecutionJobs-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookExecutionJobs/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notebookExecutionJobs-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookExecutionJobs/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-notebookExecutionJobs-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-notebookExecutionJobs-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/notebookExecutionJobs/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-hyperparameterTuningJobs-create
  "Creates a HyperparameterTuningJob
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/hyperparameterTuningJobs/create

parent <> 
GoogleCloudAiplatformV1HyperparameterTuningJob:
GoogleCloudAiplatformV1HyperparameterTuningJob"
  [parent GoogleCloudAiplatformV1HyperparameterTuningJob]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/hyperparameterTuningJobs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1HyperparameterTuningJob}))

(defn projects-locations-hyperparameterTuningJobs-get
  "Gets a HyperparameterTuningJob
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/hyperparameterTuningJobs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-hyperparameterTuningJobs-delete
  "Deletes a HyperparameterTuningJob.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/hyperparameterTuningJobs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-hyperparameterTuningJobs-list
  "Lists HyperparameterTuningJobs in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/hyperparameterTuningJobs/list

parent <> 

optional:
readMask <string> Mask specifying which fields to read.
filter <string> The standard list filter. Supported fields: * `display_name` supports `=`, `!=` comparisons, and `:` wildcard. * `state` supports `=`, `!=` comparisons. * `create_time` supports `=`, `!=`,`<`, `<=`,`>`, `>=` comparisons. `create_time` must be in RFC 3339 format. * `labels` supports general map functions that is: `labels.key=value` - key:value equality `labels.key:* - key existence Some examples of using the filter are: * `state=\"JOB_STATE_SUCCEEDED\" AND display_name:\"my_job_*\"` * `state!=\"JOB_STATE_FAILED\" OR display_name=\"my_job\"` * `NOT display_name=\"my_job\"` * `create_time>\"2021-05-18T00:00:00Z\"` * `labels.keyA=valueA` * `labels.keyB:*`
pageSize <integer> The standard list page size."
  ([parent]
    (projects-locations-hyperparameterTuningJobs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/hyperparameterTuningJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-hyperparameterTuningJobs-cancel
  "Cancels a HyperparameterTuningJob. Starts asynchronous cancellation on the HyperparameterTuningJob. The server makes a best effort to cancel the job, but success is not guaranteed. Clients can use JobService.GetHyperparameterTuningJob or other methods to check whether the cancellation succeeded or whether the job completed despite cancellation. On successful cancellation, the HyperparameterTuningJob is not deleted; instead it becomes a job with a HyperparameterTuningJob.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`, and HyperparameterTuningJob.state is set to `CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/hyperparameterTuningJobs/cancel

name <> 
GoogleCloudAiplatformV1CancelHyperparameterTuningJobRequest:
GoogleCloudAiplatformV1CancelHyperparameterTuningJobRequest"
  [name GoogleCloudAiplatformV1CancelHyperparameterTuningJobRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudAiplatformV1CancelHyperparameterTuningJobRequest}))

(defn projects-locations-hyperparameterTuningJobs-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/hyperparameterTuningJobs/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-hyperparameterTuningJobs-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-hyperparameterTuningJobs-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/hyperparameterTuningJobs/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-hyperparameterTuningJobs-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/hyperparameterTuningJobs/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-hyperparameterTuningJobs-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/hyperparameterTuningJobs/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-hyperparameterTuningJobs-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/hyperparameterTuningJobs/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-hyperparameterTuningJobs-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-specialistPools-patch
  "Updates a SpecialistPool.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/specialistPools/patch

name <> 
GoogleCloudAiplatformV1SpecialistPool:
GoogleCloudAiplatformV1SpecialistPool

optional:
updateMask <string> Required. The update mask applies to the resource."
  ([name GoogleCloudAiplatformV1SpecialistPool]
    (projects-locations-specialistPools-patch
      name
      GoogleCloudAiplatformV1SpecialistPool
      nil))
  ([name GoogleCloudAiplatformV1SpecialistPool optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1SpecialistPool})))

(defn projects-locations-specialistPools-list
  "Lists SpecialistPools in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/specialistPools/list

parent <> 

optional:
pageSize <integer> The standard list page size.
readMask <string> Mask specifying which fields to read. FieldMask represents a set of"
  ([parent] (projects-locations-specialistPools-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/specialistPools",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-specialistPools-get
  "Gets a SpecialistPool.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/specialistPools/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-specialistPools-create
  "Creates a SpecialistPool.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/specialistPools/create

parent <> 
GoogleCloudAiplatformV1SpecialistPool:
GoogleCloudAiplatformV1SpecialistPool"
  [parent GoogleCloudAiplatformV1SpecialistPool]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/specialistPools",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1SpecialistPool}))

(defn projects-locations-specialistPools-delete
  "Deletes a SpecialistPool as well as all Specialists in the pool.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/specialistPools/delete

name <> 

optional:
force <boolean> If set to true, any specialist managers in this SpecialistPool will also be deleted. (Otherwise, the request will only work if the SpecialistPool has no specialist managers.)"
  ([name] (projects-locations-specialistPools-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-specialistPools-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/specialistPools/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-specialistPools-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/specialistPools/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-specialistPools-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-specialistPools-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/specialistPools/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-specialistPools-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/specialistPools/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-specialistPools-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-specialistPools-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/specialistPools/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-delete
  "Deletes a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-import
  "Imports data into a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/import

name <> 
GoogleCloudAiplatformV1ImportDataRequest:
GoogleCloudAiplatformV1ImportDataRequest"
  [name GoogleCloudAiplatformV1ImportDataRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:import",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ImportDataRequest}))

(defn projects-locations-datasets-get
  "Gets a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/get

name <> 

optional:
readMask <string> Mask specifying which fields to read."
  ([name] (projects-locations-datasets-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-patch
  "Updates a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/patch

name <> 
GoogleCloudAiplatformV1Dataset:
GoogleCloudAiplatformV1Dataset

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see google.protobuf.FieldMask. Updatable fields: * `display_name` * `description` * `labels`"
  ([name GoogleCloudAiplatformV1Dataset]
    (projects-locations-datasets-patch
      name
      GoogleCloudAiplatformV1Dataset
      nil))
  ([name GoogleCloudAiplatformV1Dataset optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Dataset})))

(defn projects-locations-datasets-searchDataItems
  "Searches DataItems in a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/searchDataItems

dataset <> 

optional:
annotationFilters <string> An expression that specifies what Annotations will be returned per DataItem. Annotations satisfied either of the conditions will be returned. * `annotation_spec_id` - for = or !=. Must specify `saved_query_id=` - saved query id that annotations should belong to.
annotationsFilter <string> An expression for filtering the Annotations that will be returned per DataItem. * `annotation_spec_id` - for = or !=.
dataLabelingJob <string> The resource name of a DataLabelingJob. Format: `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}` If this field is set, all of the search will be done in the context of this DataLabelingJob.
pageSize <integer> Requested page size. Server may return fewer results than requested. Default and maximum page size is 100.
annotationsLimit <integer> If set, only up to this many of Annotations will be returned per DataItemView. The maximum value is 1000. If not set, the maximum value will be used.
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending.
savedQuery <string> The resource name of a SavedQuery(annotation set in UI). Format: `projects/{project}/locations/{location}/datasets/{dataset}/savedQueries/{saved_query}` All of the search will be done in the context of this SavedQuery.
dataItemFilter <string> An expression for filtering the DataItem that will be returned. * `data_item_id` - for = or !=. * `labeled` - for = or !=. * `has_annotation(ANNOTATION_SPEC_ID)` - true only for DataItem that have at least one annotation with annotation_spec_id = `ANNOTATION_SPEC_ID` in the context of SavedQuery or DataLabelingJob. For example: * `data_item=1` * `has_annotation(5)`
orderByAnnotation.savedQuery <string> Required. Saved query of the Annotation. Only Annotations belong to this saved query will be considered for ordering.
orderByDataItem <string> A comma-separated list of data item fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending.
fieldMask <string> Mask specifying which fields of DataItemView to read.
orderByAnnotation.orderBy <string> A comma-separated list of annotation fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Must also specify saved_query."
  ([dataset] (projects-locations-datasets-searchDataItems dataset nil))
  ([dataset optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+dataset}:searchDataItems",
       :uri-template-args {"dataset" dataset},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-create
  "Creates a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/create

parent <> 
GoogleCloudAiplatformV1Dataset:
GoogleCloudAiplatformV1Dataset"
  [parent GoogleCloudAiplatformV1Dataset]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/datasets",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1Dataset}))

(defn projects-locations-datasets-export
  "Exports data from a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/export

name <> 
GoogleCloudAiplatformV1ExportDataRequest:
GoogleCloudAiplatformV1ExportDataRequest"
  [name GoogleCloudAiplatformV1ExportDataRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:export",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ExportDataRequest}))

(defn projects-locations-datasets-list
  "Lists Datasets in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/list

parent <> 

optional:
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `display_name` * `create_time` * `update_time`
readMask <string> Mask specifying which fields to read.
pageSize <integer> The standard list page size.
filter <string> An expression for filtering the results of the request. For field names both snake_case and camelCase are supported. * `display_name`: supports = and != * `metadata_schema_uri`: supports = and != * `labels` supports general map functions that is: * `labels.key=value` - key:value equality * `labels.key:* or labels:key - key existence * A key including a space must be quoted. `labels.\"a key\"`. Some examples: * `displayName=\"myDisplayName\"` * `labels.myKey=\"myValue\"`"
  ([parent] (projects-locations-datasets-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/datasets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-annotationSpecs-get
  "Gets an AnnotationSpec.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/annotationSpecs/get

name <> 

optional:
readMask <string> Mask specifying which fields to read."
  ([name] (projects-locations-datasets-annotationSpecs-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-annotationSpecs-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/annotationSpecs/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-annotationSpecs-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/annotationSpecs/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-annotationSpecs-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/annotationSpecs/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-datasets-annotationSpecs-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-annotationSpecs-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/annotationSpecs/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-datasets-annotationSpecs-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-annotationSpecs-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/annotationSpecs/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-dataItems-list
  "Lists DataItems in a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/dataItems/list

parent <> 

optional:
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending.
filter <string> The standard list filter.
readMask <string> Mask specifying which fields to read.
pageSize <integer> The standard list page size."
  ([parent] (projects-locations-datasets-dataItems-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/dataItems",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-dataItems-annotations-list
  "Lists Annotations belongs to a dataitem
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/dataItems/annotations/list

parent <> 

optional:
readMask <string> Mask specifying which fields to read.
pageSize <integer> The standard list page size.
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending.
filter <string> The standard list filter."
  ([parent]
    (projects-locations-datasets-dataItems-annotations-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/annotations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-dataItems-annotations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/dataItems/annotations/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-dataItems-annotations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/dataItems/annotations/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-datasets-dataItems-annotations-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-dataItems-annotations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/dataItems/annotations/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-dataItems-annotations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/dataItems/annotations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-dataItems-annotations-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/dataItems/annotations/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-datasets-dataItems-annotations-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-dataItems-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/dataItems/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-datasets-dataItems-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-dataItems-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/dataItems/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-dataItems-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/dataItems/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-dataItems-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/dataItems/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-dataItems-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/dataItems/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-datasets-dataItems-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-datasets-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-datasets-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-datasetVersions-delete
  "Deletes a Dataset version.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/datasetVersions/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-datasetVersions-list
  "Lists DatasetVersions in a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/datasetVersions/list

parent <> 

optional:
pageSize <integer> Optional. The standard list page size.
filter <string> Optional. The standard list filter.
orderBy <string> Optional. A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending.
readMask <string> Optional. Mask specifying which fields to read."
  ([parent]
    (projects-locations-datasets-datasetVersions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/datasetVersions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-datasetVersions-get
  "Gets a Dataset version.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/datasetVersions/get

name <> 

optional:
readMask <string> Mask specifying which fields to read."
  ([name] (projects-locations-datasets-datasetVersions-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-datasetVersions-create
  "Create a version from a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/datasetVersions/create

parent <> 
GoogleCloudAiplatformV1DatasetVersion:
GoogleCloudAiplatformV1DatasetVersion"
  [parent GoogleCloudAiplatformV1DatasetVersion]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/datasetVersions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1DatasetVersion}))

(defn projects-locations-datasets-datasetVersions-patch
  "Updates a DatasetVersion.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/datasetVersions/patch

name <> 
GoogleCloudAiplatformV1DatasetVersion:
GoogleCloudAiplatformV1DatasetVersion

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see google.protobuf.FieldMask. Updatable fields: * `display_name`"
  ([name GoogleCloudAiplatformV1DatasetVersion]
    (projects-locations-datasets-datasetVersions-patch
      name
      GoogleCloudAiplatformV1DatasetVersion
      nil))
  ([name GoogleCloudAiplatformV1DatasetVersion optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1DatasetVersion})))

(defn projects-locations-datasets-datasetVersions-restore
  "Restores a dataset version.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/datasetVersions/restore

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:restore",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-savedQueries-list
  "Lists SavedQueries in a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/savedQueries/list

parent <> 

optional:
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending.
pageSize <integer> The standard list page size.
filter <string> The standard list filter.
readMask <string> Mask specifying which fields to read."
  ([parent] (projects-locations-datasets-savedQueries-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/savedQueries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-savedQueries-delete
  "Deletes a SavedQuery.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/savedQueries/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-savedQueries-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/savedQueries/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-datasets-savedQueries-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-savedQueries-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/savedQueries/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-savedQueries-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/savedQueries/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-datasets-savedQueries-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-datasets-savedQueries-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/savedQueries/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-savedQueries-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/datasets/savedQueries/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-publishers-models-predict
  "Perform an online prediction.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/publishers/models/predict

endpoint <> 
GoogleCloudAiplatformV1PredictRequest:
GoogleCloudAiplatformV1PredictRequest"
  [endpoint GoogleCloudAiplatformV1PredictRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:predict",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1PredictRequest}))

(defn projects-locations-publishers-models-generateContent
  "Generate content with multimodal inputs.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/publishers/models/generateContent

model <> 
GoogleCloudAiplatformV1GenerateContentRequest:
GoogleCloudAiplatformV1GenerateContentRequest"
  [model GoogleCloudAiplatformV1GenerateContentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+model}:generateContent",
     :uri-template-args {"model" model},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1GenerateContentRequest}))

(defn projects-locations-publishers-models-streamRawPredict
  "Perform a streaming online prediction with an arbitrary HTTP payload.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/publishers/models/streamRawPredict

endpoint <> 
GoogleCloudAiplatformV1StreamRawPredictRequest:
GoogleCloudAiplatformV1StreamRawPredictRequest"
  [endpoint GoogleCloudAiplatformV1StreamRawPredictRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:streamRawPredict",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1StreamRawPredictRequest}))

(defn projects-locations-publishers-models-computeTokens
  "Return a list of tokens based on the input text.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/publishers/models/computeTokens

endpoint <> 
GoogleCloudAiplatformV1ComputeTokensRequest:
GoogleCloudAiplatformV1ComputeTokensRequest"
  [endpoint GoogleCloudAiplatformV1ComputeTokensRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:computeTokens",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ComputeTokensRequest}))

(defn projects-locations-publishers-models-rawPredict
  "Perform an online prediction with an arbitrary HTTP payload. The response includes the following HTTP headers: * `X-Vertex-AI-Endpoint-Id`: ID of the Endpoint that served this prediction. * `X-Vertex-AI-Deployed-Model-Id`: ID of the Endpoint's DeployedModel that served this prediction.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/publishers/models/rawPredict

endpoint <> 
GoogleCloudAiplatformV1RawPredictRequest:
GoogleCloudAiplatformV1RawPredictRequest"
  [endpoint GoogleCloudAiplatformV1RawPredictRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:rawPredict",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1RawPredictRequest}))

(defn projects-locations-publishers-models-countTokens
  "Perform a token counting.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/publishers/models/countTokens

endpoint <> 
GoogleCloudAiplatformV1CountTokensRequest:
GoogleCloudAiplatformV1CountTokensRequest"
  [endpoint GoogleCloudAiplatformV1CountTokensRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:countTokens",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CountTokensRequest}))

(defn projects-locations-publishers-models-streamGenerateContent
  "Generate content with multimodal inputs with streaming support.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/publishers/models/streamGenerateContent

model <> 
GoogleCloudAiplatformV1GenerateContentRequest:
GoogleCloudAiplatformV1GenerateContentRequest"
  [model GoogleCloudAiplatformV1GenerateContentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+model}:streamGenerateContent",
     :uri-template-args {"model" model},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1GenerateContentRequest}))

(defn projects-locations-publishers-models-serverStreamingPredict
  "Perform a server-side streaming online prediction request for Vertex LLM streaming.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/publishers/models/serverStreamingPredict

endpoint <> 
GoogleCloudAiplatformV1StreamingPredictRequest:
GoogleCloudAiplatformV1StreamingPredictRequest"
  [endpoint GoogleCloudAiplatformV1StreamingPredictRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:serverStreamingPredict",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1StreamingPredictRequest}))

(defn projects-locations-deploymentResourcePools-delete
  "Delete a DeploymentResourcePool.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/deploymentResourcePools/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deploymentResourcePools-create
  "Create a DeploymentResourcePool.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/deploymentResourcePools/create

parent <> 
GoogleCloudAiplatformV1CreateDeploymentResourcePoolRequest:
GoogleCloudAiplatformV1CreateDeploymentResourcePoolRequest"
  [parent GoogleCloudAiplatformV1CreateDeploymentResourcePoolRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/deploymentResourcePools",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CreateDeploymentResourcePoolRequest}))

(defn projects-locations-deploymentResourcePools-list
  "List DeploymentResourcePools in a location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/deploymentResourcePools/list

parent <> 

optional:
pageSize <integer> The maximum number of DeploymentResourcePools to return. The service may return fewer than this value."
  ([parent]
    (projects-locations-deploymentResourcePools-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/deploymentResourcePools",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-deploymentResourcePools-queryDeployedModels
  "List DeployedModels that have been deployed on this DeploymentResourcePool.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/deploymentResourcePools/queryDeployedModels

deploymentResourcePool <> 

optional:
pageSize <integer> The maximum number of DeployedModels to return. The service may return fewer than this value."
  ([deploymentResourcePool]
    (projects-locations-deploymentResourcePools-queryDeployedModels
      deploymentResourcePool
      nil))
  ([deploymentResourcePool optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+deploymentResourcePool}:queryDeployedModels",
       :uri-template-args
       {"deploymentResourcePool" deploymentResourcePool},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-deploymentResourcePools-patch
  "Update a DeploymentResourcePool.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/deploymentResourcePools/patch

name <> 
GoogleCloudAiplatformV1DeploymentResourcePool:
GoogleCloudAiplatformV1DeploymentResourcePool

optional:
updateMask <string> Required. The list of fields to update."
  ([name GoogleCloudAiplatformV1DeploymentResourcePool]
    (projects-locations-deploymentResourcePools-patch
      name
      GoogleCloudAiplatformV1DeploymentResourcePool
      nil))
  ([name GoogleCloudAiplatformV1DeploymentResourcePool optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1DeploymentResourcePool})))

(defn projects-locations-deploymentResourcePools-get
  "Get a DeploymentResourcePool.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/deploymentResourcePools/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deploymentResourcePools-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/deploymentResourcePools/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deploymentResourcePools-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/deploymentResourcePools/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deploymentResourcePools-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/deploymentResourcePools/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deploymentResourcePools-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/deploymentResourcePools/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-deploymentResourcePools-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-deploymentResourcePools-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/deploymentResourcePools/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-deploymentResourcePools-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-indexes-get
  "Gets an Index.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexes/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-indexes-upsertDatapoints
  "Add/update Datapoints into an Index.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexes/upsertDatapoints

index <> 
GoogleCloudAiplatformV1UpsertDatapointsRequest:
GoogleCloudAiplatformV1UpsertDatapointsRequest"
  [index GoogleCloudAiplatformV1UpsertDatapointsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+index}:upsertDatapoints",
     :uri-template-args {"index" index},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1UpsertDatapointsRequest}))

(defn projects-locations-indexes-patch
  "Updates an Index.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexes/patch

name <> 
GoogleCloudAiplatformV1Index:
GoogleCloudAiplatformV1Index

optional:
updateMask <string> The update mask applies to the resource. For the `FieldMask` definition, see google.protobuf.FieldMask."
  ([name GoogleCloudAiplatformV1Index]
    (projects-locations-indexes-patch
      name
      GoogleCloudAiplatformV1Index
      nil))
  ([name GoogleCloudAiplatformV1Index optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Index})))

(defn projects-locations-indexes-delete
  "Deletes an Index. An Index can only be deleted when all its DeployedIndexes had been undeployed.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexes/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-indexes-create
  "Creates an Index.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexes/create

parent <> 
GoogleCloudAiplatformV1Index:
GoogleCloudAiplatformV1Index"
  [parent GoogleCloudAiplatformV1Index]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/indexes",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1Index}))

(defn projects-locations-indexes-list
  "Lists Indexes in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexes/list

parent <> 

optional:
readMask <string> Mask specifying which fields to read.
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([parent] (projects-locations-indexes-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/indexes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-indexes-removeDatapoints
  "Remove Datapoints from an Index.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexes/removeDatapoints

index <> 
GoogleCloudAiplatformV1RemoveDatapointsRequest:
GoogleCloudAiplatformV1RemoveDatapointsRequest"
  [index GoogleCloudAiplatformV1RemoveDatapointsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+index}:removeDatapoints",
     :uri-template-args {"index" index},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1RemoveDatapointsRequest}))

(defn projects-locations-indexes-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexes/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-indexes-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexes/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-indexes-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexes/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name] (projects-locations-indexes-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-indexes-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexes/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-indexes-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/indexes/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-indexes-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-models-list
  "Lists Models in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/list

parent <> 

optional:
filter <string> An expression for filtering the results of the request. For field names both snake_case and camelCase are supported. * `model` supports = and !=. `model` represents the Model ID, i.e. the last segment of the Model's resource name. * `display_name` supports = and != * `labels` supports general map functions that is: * `labels.key=value` - key:value equality * `labels.key:* or labels:key - key existence * A key including a space must be quoted. `labels.\"a key\"`. * `base_model_name` only supports = Some examples: * `model=1234` * `displayName=\"myDisplayName\"` * `labels.myKey=\"myValue\"` * `baseModelName=\"text-bison\"`
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `display_name` * `create_time` * `update_time` Example: `display_name, create_time desc`.
readMask <string> Mask specifying which fields to read.
pageSize <integer> The standard list page size."
  ([parent] (projects-locations-models-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/models",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-models-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1SetIamPolicyRequest}))

(defn projects-locations-models-deleteVersion
  "Deletes a Model version. Model version can only be deleted if there are no DeployedModels created from it. Deleting the only version in the Model is not allowed. Use DeleteModel for deleting the Model instead.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/deleteVersion

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:deleteVersion",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-models-copy
  "Copies an already existing Vertex AI Model into the specified Location. The source Model must exist in the same Project. When copying custom Models, the users themselves are responsible for Model.metadata content to be region-agnostic, as well as making sure that any resources (e.g. files) it depends on remain accessible.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/copy

parent <> 
GoogleCloudAiplatformV1CopyModelRequest:
GoogleCloudAiplatformV1CopyModelRequest"
  [parent GoogleCloudAiplatformV1CopyModelRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/models:copy",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CopyModelRequest}))

(defn projects-locations-models-listVersions
  "Lists versions of the specified model.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/listVersions

name <> 

optional:
readMask <string> Mask specifying which fields to read.
pageSize <integer> The standard list page size.
filter <string> An expression for filtering the results of the request. For field names both snake_case and camelCase are supported. * `labels` supports general map functions that is: * `labels.key=value` - key:value equality * `labels.key:* or labels:key - key existence * A key including a space must be quoted. `labels.\"a key\"`. Some examples: * `labels.myKey=\"myValue\"`
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `create_time` * `update_time` Example: `update_time asc, create_time desc`."
  ([name] (projects-locations-models-listVersions name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:listVersions",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-models-delete
  "Deletes a Model. A model cannot be deleted if any Endpoint resource has a DeployedModel based on the model in its deployed_models field.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-models-export
  "Exports a trained, exportable Model to a location specified by the user. A Model is considered to be exportable if it has at least one supported export format.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/export

name <> 
GoogleCloudAiplatformV1ExportModelRequest:
GoogleCloudAiplatformV1ExportModelRequest"
  [name GoogleCloudAiplatformV1ExportModelRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:export",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ExportModelRequest}))

(defn projects-locations-models-updateExplanationDataset
  "Incrementally update the dataset used for an examples model.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/updateExplanationDataset

model <> 
GoogleCloudAiplatformV1UpdateExplanationDatasetRequest:
GoogleCloudAiplatformV1UpdateExplanationDatasetRequest"
  [model GoogleCloudAiplatformV1UpdateExplanationDatasetRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+model}:updateExplanationDataset",
     :uri-template-args {"model" model},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1UpdateExplanationDatasetRequest}))

(defn projects-locations-models-upload
  "Uploads a Model artifact into Vertex AI.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/upload

parent <> 
GoogleCloudAiplatformV1UploadModelRequest:
GoogleCloudAiplatformV1UploadModelRequest"
  [parent GoogleCloudAiplatformV1UploadModelRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/models:upload",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1UploadModelRequest}))

(defn projects-locations-models-patch
  "Updates a Model.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/patch

name <> 
GoogleCloudAiplatformV1Model:
GoogleCloudAiplatformV1Model

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see google.protobuf.FieldMask."
  ([name GoogleCloudAiplatformV1Model]
    (projects-locations-models-patch
      name
      GoogleCloudAiplatformV1Model
      nil))
  ([name GoogleCloudAiplatformV1Model optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Model})))

(defn projects-locations-models-mergeVersionAliases
  "Merges a set of aliases for a Model version.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/mergeVersionAliases

name <> 
GoogleCloudAiplatformV1MergeVersionAliasesRequest:
GoogleCloudAiplatformV1MergeVersionAliasesRequest"
  [name GoogleCloudAiplatformV1MergeVersionAliasesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:mergeVersionAliases",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1MergeVersionAliasesRequest}))

(defn projects-locations-models-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-models-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-models-get
  "Gets a Model.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-models-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/testIamPermissions

resource <> 

optional:
permissions <string> The set of permissions to check for the `resource`. Permissions with wildcards (such as `*` or `storage.*`) are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions)."
  ([resource]
    (projects-locations-models-testIamPermissions resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+resource}:testIamPermissions",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-models-evaluations-import
  "Imports an externally generated ModelEvaluation.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/evaluations/import

parent <> 
GoogleCloudAiplatformV1ImportModelEvaluationRequest:
GoogleCloudAiplatformV1ImportModelEvaluationRequest"
  [parent GoogleCloudAiplatformV1ImportModelEvaluationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/evaluations:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ImportModelEvaluationRequest}))

(defn projects-locations-models-evaluations-list
  "Lists ModelEvaluations in a Model.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/evaluations/list

parent <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size.
readMask <string> Mask specifying which fields to read."
  ([parent] (projects-locations-models-evaluations-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/evaluations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-models-evaluations-get
  "Gets a ModelEvaluation.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/evaluations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-models-evaluations-slices-get
  "Gets a ModelEvaluationSlice.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/evaluations/slices/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-models-evaluations-slices-batchImport
  "Imports a list of externally generated EvaluatedAnnotations.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/evaluations/slices/batchImport

parent <> 
GoogleCloudAiplatformV1BatchImportEvaluatedAnnotationsRequest:
GoogleCloudAiplatformV1BatchImportEvaluatedAnnotationsRequest"
  [parent
   GoogleCloudAiplatformV1BatchImportEvaluatedAnnotationsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}:batchImport",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudAiplatformV1BatchImportEvaluatedAnnotationsRequest}))

(defn projects-locations-models-evaluations-slices-list
  "Lists ModelEvaluationSlices in a ModelEvaluation.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/evaluations/slices/list

parent <> 

optional:
readMask <string> Mask specifying which fields to read.
pageSize <integer> The standard list page size.
filter <string> The standard list filter. * `slice.dimension` - for =."
  ([parent]
    (projects-locations-models-evaluations-slices-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/slices",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-models-evaluations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/evaluations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-models-evaluations-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/evaluations/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-models-evaluations-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-models-evaluations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/evaluations/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-models-evaluations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/evaluations/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-models-evaluations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/evaluations/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-models-evaluations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-models-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name] (projects-locations-models-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-models-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-models-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-models-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-models-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-models-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/models/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-get
  "Retrieves a specific MetadataStore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-delete
  "Deletes a single MetadataStore and all its child resources (Artifacts, Executions, and Contexts).
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/delete

name <> 

optional:
force <boolean> Deprecated: Field is no longer supported."
  ([name] (projects-locations-metadataStores-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-create
  "Initializes a MetadataStore, including allocation of resources.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/create

parent <> 
GoogleCloudAiplatformV1MetadataStore:
GoogleCloudAiplatformV1MetadataStore

optional:
metadataStoreId <string> The {metadatastore} portion of the resource name with the format: `projects/{project}/locations/{location}/metadataStores/{metadatastore}` If not provided, the MetadataStore's ID will be a UUID generated by the service. Must be 4-128 characters in length. Valid characters are `/a-z-/`. Must be unique across all MetadataStores in the parent Location. (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED if the caller can't view the preexisting MetadataStore.)"
  ([parent GoogleCloudAiplatformV1MetadataStore]
    (projects-locations-metadataStores-create
      parent
      GoogleCloudAiplatformV1MetadataStore
      nil))
  ([parent GoogleCloudAiplatformV1MetadataStore optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/metadataStores",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1MetadataStore})))

(defn projects-locations-metadataStores-list
  "Lists MetadataStores for a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/list

parent <> 

optional:
pageSize <integer> The maximum number of Metadata Stores to return. The service may return fewer. Must be in range 1-1000, inclusive. Defaults to 100."
  ([parent] (projects-locations-metadataStores-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/metadataStores",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-metadataStores-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-metadataStores-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-metadataSchemas-create
  "Creates a MetadataSchema.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/metadataSchemas/create

parent <> 
GoogleCloudAiplatformV1MetadataSchema:
GoogleCloudAiplatformV1MetadataSchema

optional:
metadataSchemaId <string> The {metadata_schema} portion of the resource name with the format: `projects/{project}/locations/{location}/metadataStores/{metadatastore}/metadataSchemas/{metadataschema}` If not provided, the MetadataStore's ID will be a UUID generated by the service. Must be 4-128 characters in length. Valid characters are `/a-z-/`. Must be unique across all MetadataSchemas in the parent Location. (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED if the caller can't view the preexisting MetadataSchema.)"
  ([parent GoogleCloudAiplatformV1MetadataSchema]
    (projects-locations-metadataStores-metadataSchemas-create
      parent
      GoogleCloudAiplatformV1MetadataSchema
      nil))
  ([parent GoogleCloudAiplatformV1MetadataSchema optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/metadataSchemas",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1MetadataSchema})))

(defn projects-locations-metadataStores-metadataSchemas-list
  "Lists MetadataSchemas.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/metadataSchemas/list

parent <> 

optional:
filter <string> A query to filter available MetadataSchemas for matching results.
pageSize <integer> The maximum number of MetadataSchemas to return. The service may return fewer. Must be in range 1-1000, inclusive. Defaults to 100."
  ([parent]
    (projects-locations-metadataStores-metadataSchemas-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/metadataSchemas",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-metadataSchemas-get
  "Retrieves a specific MetadataSchema.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/metadataSchemas/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-contexts-list
  "Lists Contexts on the MetadataStore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/list

parent <> 

optional:
orderBy <string> How the list of messages is ordered. Specify the values to order by and an ordering operation. The default sorting order is ascending. To specify descending order for a field, users append a \" desc\" suffix; for example: \"foo desc, bar\". Subfields are specified with a `.` character, such as foo.bar. see https://google.aip.dev/132#ordering for more details.
filter <string> Filter specifying the boolean condition for the Contexts to satisfy in order to be part of the result set. The syntax to define filter query is based on https://google.aip.dev/160. Following are the supported set of filters: * **Attribute filtering**: For example: `display_name = \"test\"`. Supported fields include: `name`, `display_name`, `schema_title`, `create_time`, and `update_time`. Time fields, such as `create_time` and `update_time`, require values specified in RFC-3339 format. For example: `create_time = \"2020-11-19T11:30:00-04:00\"`. * **Metadata field**: To filter on metadata fields use traversal operation as follows: `metadata..`. For example: `metadata.field_1.number_value = 10.0`. In case the field name contains special characters (such as colon), one can embed it inside double quote. For example: `metadata.\"field:1\".number_value = 10.0` * **Parent Child filtering**: To filter Contexts based on parent-child relationship use the HAS operator as follows: ``` parent_contexts: \"projects//locations//metadataStores//contexts/\" child_contexts: \"projects//locations//metadataStores//contexts/\" ``` Each of the above supported filters can be combined together using logical operators (`AND` & `OR`). Maximum nested expression depth allowed is 5. For example: `display_name = \"test\" AND metadata.field1.bool_value = true`.
pageSize <integer> The maximum number of Contexts to return. The service may return fewer. Must be in range 1-1000, inclusive. Defaults to 100."
  ([parent]
    (projects-locations-metadataStores-contexts-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/contexts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-contexts-delete
  "Deletes a stored Context.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/delete

name <> 

optional:
force <boolean> The force deletion semantics is still undefined. Users should not use this field.
etag <string> Optional. The etag of the Context to delete. If this is provided, it must match the server's etag. Otherwise, the request will fail with a FAILED_PRECONDITION."
  ([name] (projects-locations-metadataStores-contexts-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-contexts-queryContextLineageSubgraph
  "Retrieves Artifacts and Executions within the specified Context, connected by Event edges and returned as a LineageSubgraph.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/queryContextLineageSubgraph

context <> "
  [context]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+context}:queryContextLineageSubgraph",
     :uri-template-args {"context" context},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-contexts-purge
  "Purges Contexts.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/purge

parent <> 
GoogleCloudAiplatformV1PurgeContextsRequest:
GoogleCloudAiplatformV1PurgeContextsRequest"
  [parent GoogleCloudAiplatformV1PurgeContextsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/contexts:purge",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1PurgeContextsRequest}))

(defn projects-locations-metadataStores-contexts-addContextChildren
  "Adds a set of Contexts as children to a parent Context. If any of the child Contexts have already been added to the parent Context, they are simply skipped. If this call would create a cycle or cause any Context to have more than 10 parents, the request will fail with an INVALID_ARGUMENT error.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/addContextChildren

context <> 
GoogleCloudAiplatformV1AddContextChildrenRequest:
GoogleCloudAiplatformV1AddContextChildrenRequest"
  [context GoogleCloudAiplatformV1AddContextChildrenRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+context}:addContextChildren",
     :uri-template-args {"context" context},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1AddContextChildrenRequest}))

(defn projects-locations-metadataStores-contexts-patch
  "Updates a stored Context.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/patch

name <> 
GoogleCloudAiplatformV1Context:
GoogleCloudAiplatformV1Context

optional:
updateMask <string> Optional. A FieldMask indicating which fields should be updated.
allowMissing <boolean> If set to true, and the Context is not found, a new Context is created."
  ([name GoogleCloudAiplatformV1Context]
    (projects-locations-metadataStores-contexts-patch
      name
      GoogleCloudAiplatformV1Context
      nil))
  ([name GoogleCloudAiplatformV1Context optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Context})))

(defn projects-locations-metadataStores-contexts-create
  "Creates a Context associated with a MetadataStore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/create

parent <> 
GoogleCloudAiplatformV1Context:
GoogleCloudAiplatformV1Context

optional:
contextId <string> The {context} portion of the resource name with the format: `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`. If not provided, the Context's ID will be a UUID generated by the service. Must be 4-128 characters in length. Valid characters are `/a-z-/`. Must be unique across all Contexts in the parent MetadataStore. (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED if the caller can't view the preexisting Context.)"
  ([parent GoogleCloudAiplatformV1Context]
    (projects-locations-metadataStores-contexts-create
      parent
      GoogleCloudAiplatformV1Context
      nil))
  ([parent GoogleCloudAiplatformV1Context optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/contexts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Context})))

(defn projects-locations-metadataStores-contexts-addContextArtifactsAndExecutions
  "Adds a set of Artifacts and Executions to a Context. If any of the Artifacts or Executions have already been added to a Context, they are simply skipped.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/addContextArtifactsAndExecutions

context <> 
GoogleCloudAiplatformV1AddContextArtifactsAndExecutionsRequest:
GoogleCloudAiplatformV1AddContextArtifactsAndExecutionsRequest"
  [context
   GoogleCloudAiplatformV1AddContextArtifactsAndExecutionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+context}:addContextArtifactsAndExecutions",
     :uri-template-args {"context" context},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudAiplatformV1AddContextArtifactsAndExecutionsRequest}))

(defn projects-locations-metadataStores-contexts-get
  "Retrieves a specific Context.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-contexts-removeContextChildren
  "Remove a set of children contexts from a parent Context. If any of the child Contexts were NOT added to the parent Context, they are simply skipped.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/removeContextChildren

context <> 
GoogleCloudAiplatformV1RemoveContextChildrenRequest:
GoogleCloudAiplatformV1RemoveContextChildrenRequest"
  [context GoogleCloudAiplatformV1RemoveContextChildrenRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+context}:removeContextChildren",
     :uri-template-args {"context" context},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1RemoveContextChildrenRequest}))

(defn projects-locations-metadataStores-contexts-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-metadataStores-contexts-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-contexts-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-contexts-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-metadataStores-contexts-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-contexts-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-contexts-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/contexts/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-executions-patch
  "Updates a stored Execution.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/executions/patch

name <> 
GoogleCloudAiplatformV1Execution:
GoogleCloudAiplatformV1Execution

optional:
updateMask <string> Optional. A FieldMask indicating which fields should be updated.
allowMissing <boolean> If set to true, and the Execution is not found, a new Execution is created."
  ([name GoogleCloudAiplatformV1Execution]
    (projects-locations-metadataStores-executions-patch
      name
      GoogleCloudAiplatformV1Execution
      nil))
  ([name GoogleCloudAiplatformV1Execution optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Execution})))

(defn projects-locations-metadataStores-executions-get
  "Retrieves a specific Execution.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/executions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-executions-addExecutionEvents
  "Adds Events to the specified Execution. An Event indicates whether an Artifact was used as an input or output for an Execution. If an Event already exists between the Execution and the Artifact, the Event is skipped.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/executions/addExecutionEvents

execution <> 
GoogleCloudAiplatformV1AddExecutionEventsRequest:
GoogleCloudAiplatformV1AddExecutionEventsRequest"
  [execution GoogleCloudAiplatformV1AddExecutionEventsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+execution}:addExecutionEvents",
     :uri-template-args {"execution" execution},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1AddExecutionEventsRequest}))

(defn projects-locations-metadataStores-executions-delete
  "Deletes an Execution.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/executions/delete

name <> 

optional:
etag <string> Optional. The etag of the Execution to delete. If this is provided, it must match the server's etag. Otherwise, the request will fail with a FAILED_PRECONDITION."
  ([name]
    (projects-locations-metadataStores-executions-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-executions-queryExecutionInputsAndOutputs
  "Obtains the set of input and output Artifacts for this Execution, in the form of LineageSubgraph that also contains the Execution and connecting Events.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/executions/queryExecutionInputsAndOutputs

execution <> "
  [execution]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+execution}:queryExecutionInputsAndOutputs",
     :uri-template-args {"execution" execution},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-executions-list
  "Lists Executions in the MetadataStore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/executions/list

parent <> 

optional:
filter <string> Filter specifying the boolean condition for the Executions to satisfy in order to be part of the result set. The syntax to define filter query is based on https://google.aip.dev/160. Following are the supported set of filters: * **Attribute filtering**: For example: `display_name = \"test\"`. Supported fields include: `name`, `display_name`, `state`, `schema_title`, `create_time`, and `update_time`. Time fields, such as `create_time` and `update_time`, require values specified in RFC-3339 format. For example: `create_time = \"2020-11-19T11:30:00-04:00\"`. * **Metadata field**: To filter on metadata fields use traversal operation as follows: `metadata..` For example: `metadata.field_1.number_value = 10.0` In case the field name contains special characters (such as colon), one can embed it inside double quote. For example: `metadata.\"field:1\".number_value = 10.0` * **Context based filtering**: To filter Executions based on the contexts to which they belong use the function operator with the full resource name: `in_context()`. For example: `in_context(\"projects//locations//metadataStores//contexts/\")` Each of the above supported filters can be combined together using logical operators (`AND` & `OR`). Maximum nested expression depth allowed is 5. For example: `display_name = \"test\" AND metadata.field1.bool_value = true`.
pageSize <integer> The maximum number of Executions to return. The service may return fewer. Must be in range 1-1000, inclusive. Defaults to 100.
orderBy <string> How the list of messages is ordered. Specify the values to order by and an ordering operation. The default sorting order is ascending. To specify descending order for a field, users append a \" desc\" suffix; for example: \"foo desc, bar\". Subfields are specified with a `.` character, such as foo.bar. see https://google.aip.dev/132#ordering for more details."
  ([parent]
    (projects-locations-metadataStores-executions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/executions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-executions-create
  "Creates an Execution associated with a MetadataStore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/executions/create

parent <> 
GoogleCloudAiplatformV1Execution:
GoogleCloudAiplatformV1Execution

optional:
executionId <string> The {execution} portion of the resource name with the format: `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}` If not provided, the Execution's ID will be a UUID generated by the service. Must be 4-128 characters in length. Valid characters are `/a-z-/`. Must be unique across all Executions in the parent MetadataStore. (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED if the caller can't view the preexisting Execution.)"
  ([parent GoogleCloudAiplatformV1Execution]
    (projects-locations-metadataStores-executions-create
      parent
      GoogleCloudAiplatformV1Execution
      nil))
  ([parent GoogleCloudAiplatformV1Execution optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/executions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Execution})))

(defn projects-locations-metadataStores-executions-purge
  "Purges Executions.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/executions/purge

parent <> 
GoogleCloudAiplatformV1PurgeExecutionsRequest:
GoogleCloudAiplatformV1PurgeExecutionsRequest"
  [parent GoogleCloudAiplatformV1PurgeExecutionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/executions:purge",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1PurgeExecutionsRequest}))

(defn projects-locations-metadataStores-executions-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/executions/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-metadataStores-executions-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-executions-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/executions/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-executions-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/executions/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-executions-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/executions/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-executions-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/executions/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-metadataStores-executions-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-artifacts-get
  "Retrieves a specific Artifact.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/artifacts/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-artifacts-queryArtifactLineageSubgraph
  "Retrieves lineage of an Artifact represented through Artifacts and Executions connected by Event edges and returned as a LineageSubgraph.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/artifacts/queryArtifactLineageSubgraph

artifact <> 

optional:
filter <string> Filter specifying the boolean condition for the Artifacts to satisfy in order to be part of the Lineage Subgraph. The syntax to define filter query is based on https://google.aip.dev/160. The supported set of filters include the following: * **Attribute filtering**: For example: `display_name = \"test\"` Supported fields include: `name`, `display_name`, `uri`, `state`, `schema_title`, `create_time`, and `update_time`. Time fields, such as `create_time` and `update_time`, require values specified in RFC-3339 format. For example: `create_time = \"2020-11-19T11:30:00-04:00\"` * **Metadata field**: To filter on metadata fields use traversal operation as follows: `metadata..`. For example: `metadata.field_1.number_value = 10.0` In case the field name contains special characters (such as colon), one can embed it inside double quote. For example: `metadata.\"field:1\".number_value = 10.0` Each of the above supported filter types can be combined together using logical operators (`AND` & `OR`). Maximum nested expression depth allowed is 5. For example: `display_name = \"test\" AND metadata.field1.bool_value = true`.
maxHops <integer> Specifies the size of the lineage graph in terms of number of hops from the specified artifact. Negative Value: INVALID_ARGUMENT error is returned 0: Only input artifact is returned. No value: Transitive closure is performed to return the complete graph."
  ([artifact]
    (projects-locations-metadataStores-artifacts-queryArtifactLineageSubgraph
      artifact
      nil))
  ([artifact optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+artifact}:queryArtifactLineageSubgraph",
       :uri-template-args {"artifact" artifact},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-artifacts-list
  "Lists Artifacts in the MetadataStore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/artifacts/list

parent <> 

optional:
orderBy <string> How the list of messages is ordered. Specify the values to order by and an ordering operation. The default sorting order is ascending. To specify descending order for a field, users append a \" desc\" suffix; for example: \"foo desc, bar\". Subfields are specified with a `.` character, such as foo.bar. see https://google.aip.dev/132#ordering for more details.
filter <string> Filter specifying the boolean condition for the Artifacts to satisfy in order to be part of the result set. The syntax to define filter query is based on https://google.aip.dev/160. The supported set of filters include the following: * **Attribute filtering**: For example: `display_name = \"test\"`. Supported fields include: `name`, `display_name`, `uri`, `state`, `schema_title`, `create_time`, and `update_time`. Time fields, such as `create_time` and `update_time`, require values specified in RFC-3339 format. For example: `create_time = \"2020-11-19T11:30:00-04:00\"` * **Metadata field**: To filter on metadata fields use traversal operation as follows: `metadata..`. For example: `metadata.field_1.number_value = 10.0` In case the field name contains special characters (such as colon), one can embed it inside double quote. For example: `metadata.\"field:1\".number_value = 10.0` * **Context based filtering**: To filter Artifacts based on the contexts to which they belong, use the function operator with the full resource name `in_context()`. For example: `in_context(\"projects//locations//metadataStores//contexts/\")` Each of the above supported filter types can be combined together using logical operators (`AND` & `OR`). Maximum nested expression depth allowed is 5. For example: `display_name = \"test\" AND metadata.field1.bool_value = true`.
pageSize <integer> The maximum number of Artifacts to return. The service may return fewer. Must be in range 1-1000, inclusive. Defaults to 100."
  ([parent]
    (projects-locations-metadataStores-artifacts-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/artifacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-artifacts-purge
  "Purges Artifacts.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/artifacts/purge

parent <> 
GoogleCloudAiplatformV1PurgeArtifactsRequest:
GoogleCloudAiplatformV1PurgeArtifactsRequest"
  [parent GoogleCloudAiplatformV1PurgeArtifactsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/artifacts:purge",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1PurgeArtifactsRequest}))

(defn projects-locations-metadataStores-artifacts-create
  "Creates an Artifact associated with a MetadataStore.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/artifacts/create

parent <> 
GoogleCloudAiplatformV1Artifact:
GoogleCloudAiplatformV1Artifact

optional:
artifactId <string> The {artifact} portion of the resource name with the format: `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}` If not provided, the Artifact's ID will be a UUID generated by the service. Must be 4-128 characters in length. Valid characters are `/a-z-/`. Must be unique across all Artifacts in the parent MetadataStore. (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED if the caller can't view the preexisting Artifact.)"
  ([parent GoogleCloudAiplatformV1Artifact]
    (projects-locations-metadataStores-artifacts-create
      parent
      GoogleCloudAiplatformV1Artifact
      nil))
  ([parent GoogleCloudAiplatformV1Artifact optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/artifacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Artifact})))

(defn projects-locations-metadataStores-artifacts-patch
  "Updates a stored Artifact.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/artifacts/patch

name <> 
GoogleCloudAiplatformV1Artifact:
GoogleCloudAiplatformV1Artifact

optional:
updateMask <string> Optional. A FieldMask indicating which fields should be updated.
allowMissing <boolean> If set to true, and the Artifact is not found, a new Artifact is created."
  ([name GoogleCloudAiplatformV1Artifact]
    (projects-locations-metadataStores-artifacts-patch
      name
      GoogleCloudAiplatformV1Artifact
      nil))
  ([name GoogleCloudAiplatformV1Artifact optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Artifact})))

(defn projects-locations-metadataStores-artifacts-delete
  "Deletes an Artifact.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/artifacts/delete

name <> 

optional:
etag <string> Optional. The etag of the Artifact to delete. If this is provided, it must match the server's etag. Otherwise, the request will fail with a FAILED_PRECONDITION."
  ([name]
    (projects-locations-metadataStores-artifacts-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-artifacts-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/artifacts/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-artifacts-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/artifacts/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-metadataStores-artifacts-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-metadataStores-artifacts-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/artifacts/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-artifacts-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/artifacts/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-metadataStores-artifacts-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/metadataStores/artifacts/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-metadataStores-artifacts-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-schedules-create
  "Creates a Schedule.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/schedules/create

parent <> 
GoogleCloudAiplatformV1Schedule:
GoogleCloudAiplatformV1Schedule"
  [parent GoogleCloudAiplatformV1Schedule]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/schedules",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1Schedule}))

(defn projects-locations-schedules-get
  "Gets a Schedule.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/schedules/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-schedules-list
  "Lists Schedules in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/schedules/list

parent <> 

optional:
pageSize <integer> The standard list page size. Default to 100 if not specified.
filter <string> Lists the Schedules that match the filter expression. The following fields are supported: * `display_name`: Supports `=`, `!=` comparisons, and `:` wildcard. * `state`: Supports `=` and `!=` comparisons. * `request`: Supports existence of the check. (e.g. `create_pipeline_job_request:*` --> Schedule has create_pipeline_job_request). * `create_time`: Supports `=`, `!=`, `<`, `>`, `<=`, and `>=` comparisons. Values must be in RFC 3339 format. * `start_time`: Supports `=`, `!=`, `<`, `>`, `<=`, and `>=` comparisons. Values must be in RFC 3339 format. * `end_time`: Supports `=`, `!=`, `<`, `>`, `<=`, `>=` comparisons and `:*` existence check. Values must be in RFC 3339 format. * `next_run_time`: Supports `=`, `!=`, `<`, `>`, `<=`, and `>=` comparisons. Values must be in RFC 3339 format. Filter expressions can be combined together using logical operators (`NOT`, `AND` & `OR`). The syntax to define filter expression is based on https://google.aip.dev/160. Examples: * `state=\"ACTIVE\" AND display_name:\"my_schedule_*\"` * `NOT display_name=\"my_schedule\"` * `create_time>\"2021-05-18T00:00:00Z\"` * `end_time>\"2021-05-18T00:00:00Z\" OR NOT end_time:*` * `create_pipeline_job_request:*`
orderBy <string> A comma-separated list of fields to order by. The default sort order is in ascending order. Use \"desc\" after a field name for descending. You can have multiple order_by fields provided. For example, using \"create_time desc, end_time\" will order results by create time in descending order, and if there are multiple schedules having the same create time, order them by the end time in ascending order. If order_by is not specified, it will order by default with create_time in descending order. Supported fields: * `create_time` * `start_time` * `end_time` * `next_run_time`"
  ([parent] (projects-locations-schedules-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/schedules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-schedules-patch
  "Updates an active or paused Schedule. When the Schedule is updated, new runs will be scheduled starting from the updated next execution time after the update time based on the time_specification in the updated Schedule. All unstarted runs before the update time will be skipped while already created runs will NOT be paused or canceled.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/schedules/patch

name <> 
GoogleCloudAiplatformV1Schedule:
GoogleCloudAiplatformV1Schedule

optional:
updateMask <string> Required. The update mask applies to the resource. See google.protobuf.FieldMask."
  ([name GoogleCloudAiplatformV1Schedule]
    (projects-locations-schedules-patch
      name
      GoogleCloudAiplatformV1Schedule
      nil))
  ([name GoogleCloudAiplatformV1Schedule optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Schedule})))

(defn projects-locations-schedules-pause
  "Pauses a Schedule. Will mark Schedule.state to 'PAUSED'. If the schedule is paused, no new runs will be created. Already created runs will NOT be paused or canceled.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/schedules/pause

name <> 
GoogleCloudAiplatformV1PauseScheduleRequest:
GoogleCloudAiplatformV1PauseScheduleRequest"
  [name GoogleCloudAiplatformV1PauseScheduleRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:pause",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1PauseScheduleRequest}))

(defn projects-locations-schedules-resume
  "Resumes a paused Schedule to start scheduling new runs. Will mark Schedule.state to 'ACTIVE'. Only paused Schedule can be resumed. When the Schedule is resumed, new runs will be scheduled starting from the next execution time after the current time based on the time_specification in the Schedule. If Schedule.catchUp is set up true, all missed runs will be scheduled for backfill first.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/schedules/resume

name <> 
GoogleCloudAiplatformV1ResumeScheduleRequest:
GoogleCloudAiplatformV1ResumeScheduleRequest"
  [name GoogleCloudAiplatformV1ResumeScheduleRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:resume",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ResumeScheduleRequest}))

(defn projects-locations-schedules-delete
  "Deletes a Schedule.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/schedules/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-schedules-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/schedules/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-schedules-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/schedules/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-schedules-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/schedules/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-schedules-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-schedules-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/schedules/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-schedules-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/schedules/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name] (projects-locations-schedules-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureGroups-create
  "Creates a new FeatureGroup in a given project and location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/create

parent <> 
GoogleCloudAiplatformV1FeatureGroup:
GoogleCloudAiplatformV1FeatureGroup

optional:
featureGroupId <string> Required. The ID to use for this FeatureGroup, which will become the final component of the FeatureGroup's resource name. This value may be up to 60 characters, and valid characters are `[a-z0-9_]`. The first character cannot be a number. The value must be unique within the project and location."
  ([parent GoogleCloudAiplatformV1FeatureGroup]
    (projects-locations-featureGroups-create
      parent
      GoogleCloudAiplatformV1FeatureGroup
      nil))
  ([parent GoogleCloudAiplatformV1FeatureGroup optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/featureGroups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1FeatureGroup})))

(defn projects-locations-featureGroups-delete
  "Deletes a single FeatureGroup.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/delete

name <> 

optional:
force <boolean> If set to true, any Features under this FeatureGroup will also be deleted. (Otherwise, the request will only work if the FeatureGroup has no Features.)"
  ([name] (projects-locations-featureGroups-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureGroups-get
  "Gets details of a single FeatureGroup.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureGroups-list
  "Lists FeatureGroups in a given project and location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/list

parent <> 

optional:
pageSize <integer> The maximum number of FeatureGroups to return. The service may return fewer than this value. If unspecified, at most 100 FeatureGroups will be returned. The maximum value is 100; any value greater than 100 will be coerced to 100.
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported Fields: * `create_time` * `update_time`
filter <string> Lists the FeatureGroups that match the filter expression. The following fields are supported: * `create_time`: Supports `=`, `!=`, `<`, `>`, `<=`, and `>=` comparisons. Values must be in RFC 3339 format. * `update_time`: Supports `=`, `!=`, `<`, `>`, `<=`, and `>=` comparisons. Values must be in RFC 3339 format. * `labels`: Supports key-value equality and key presence. Examples: * `create_time > \"2020-01-01\" OR update_time > \"2020-01-01\"` FeatureGroups created or updated after 2020-01-01. * `labels.env = \"prod\"` FeatureGroups with label \"env\" set to \"prod\"."
  ([parent] (projects-locations-featureGroups-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/featureGroups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureGroups-patch
  "Updates the parameters of a single FeatureGroup.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/patch

name <> 
GoogleCloudAiplatformV1FeatureGroup:
GoogleCloudAiplatformV1FeatureGroup

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the FeatureGroup resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then only the non-empty fields present in the request will be overwritten. Set the update_mask to `*` to override all fields. Updatable fields: * `labels` * `description` * `big_query` * `big_query.entity_id_columns`"
  ([name GoogleCloudAiplatformV1FeatureGroup]
    (projects-locations-featureGroups-patch
      name
      GoogleCloudAiplatformV1FeatureGroup
      nil))
  ([name GoogleCloudAiplatformV1FeatureGroup optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1FeatureGroup})))

(defn projects-locations-featureGroups-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureGroups-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureGroups-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name] (projects-locations-featureGroups-operations-wait name nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureGroups-operations-listWait
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/operations/listWait

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-featureGroups-operations-listWait name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureGroups-features-list
  "Lists Features in a given FeatureGroup.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/features/list

parent <> 

optional:
readMask <string> Mask specifying which fields to read.
filter <string> Lists the Features that match the filter expression. The following filters are supported: * `value_type`: Supports = and != comparisons. * `create_time`: Supports =, !=, <, >, >=, and <= comparisons. Values must be in RFC 3339 format. * `update_time`: Supports =, !=, <, >, >=, and <= comparisons. Values must be in RFC 3339 format. * `labels`: Supports key-value equality as well as key presence. Examples: * `value_type = DOUBLE` --> Features whose type is DOUBLE. * `create_time > \\\"2020-01-31T15:30:00.000000Z\\\" OR update_time > \\\"2020-01-31T15:30:00.000000Z\\\"` --> EntityTypes created or updated after 2020-01-31T15:30:00.000000Z. * `labels.active = yes AND labels.env = prod` --> Features having both (active: yes) and (env: prod) labels. * `labels.env: *` --> Any Feature which has a label with 'env' as the key.
latestStatsCount <integer> Only applicable for Vertex AI Feature Store (Legacy). If set, return the most recent ListFeaturesRequest.latest_stats_count of stats for each Feature in response. Valid value is [0, 10]. If number of stats exists < ListFeaturesRequest.latest_stats_count, return all existing stats.
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `feature_id` * `value_type` (Not supported for FeatureRegistry Feature) * `create_time` * `update_time`
pageSize <integer> The maximum number of Features to return. The service may return fewer than this value. If unspecified, at most 1000 Features will be returned. The maximum value is 1000; any value greater than 1000 will be coerced to 1000."
  ([parent]
    (projects-locations-featureGroups-features-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/features",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureGroups-features-create
  "Creates a new Feature in a given FeatureGroup.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/features/create

parent <> 
GoogleCloudAiplatformV1Feature:
GoogleCloudAiplatformV1Feature

optional:
featureId <string> Required. The ID to use for the Feature, which will become the final component of the Feature's resource name. This value may be up to 128 characters, and valid characters are `[a-z0-9_]`. The first character cannot be a number. The value must be unique within an EntityType/FeatureGroup."
  ([parent GoogleCloudAiplatformV1Feature]
    (projects-locations-featureGroups-features-create
      parent
      GoogleCloudAiplatformV1Feature
      nil))
  ([parent GoogleCloudAiplatformV1Feature optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/features",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Feature})))

(defn projects-locations-featureGroups-features-patch
  "Updates the parameters of a single Feature.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/features/patch

name <> 
GoogleCloudAiplatformV1Feature:
GoogleCloudAiplatformV1Feature

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the Features resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then only the non-empty fields present in the request will be overwritten. Set the update_mask to `*` to override all fields. Updatable fields: * `description` * `labels` * `disable_monitoring` (Not supported for FeatureRegistryService Feature) * `point_of_contact` (Not supported for FeaturestoreService FeatureStore)"
  ([name GoogleCloudAiplatformV1Feature]
    (projects-locations-featureGroups-features-patch
      name
      GoogleCloudAiplatformV1Feature
      nil))
  ([name GoogleCloudAiplatformV1Feature optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Feature})))

(defn projects-locations-featureGroups-features-get
  "Gets details of a single Feature.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/features/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureGroups-features-delete
  "Deletes a single Feature.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/features/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureGroups-features-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/features/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureGroups-features-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/features/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-featureGroups-features-operations-listWait
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/features/operations/listWait

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name]
    (projects-locations-featureGroups-features-operations-listWait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-featureGroups-features-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/featureGroups/features/operations/wait

name <> 

optional:
timeout <string> The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used."
  ([name]
    (projects-locations-featureGroups-features-operations-wait
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+name}:wait",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn datasets-patch
  "Updates a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/datasets/patch

name <> 
GoogleCloudAiplatformV1Dataset:
GoogleCloudAiplatformV1Dataset

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see google.protobuf.FieldMask. Updatable fields: * `display_name` * `description` * `labels`"
  ([name GoogleCloudAiplatformV1Dataset]
    (datasets-patch name GoogleCloudAiplatformV1Dataset nil))
  ([name GoogleCloudAiplatformV1Dataset optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Dataset})))

(defn datasets-get
  "Gets a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/datasets/get

name <> 

optional:
readMask <string> Mask specifying which fields to read."
  ([name] (datasets-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn datasets-list
  "Lists Datasets in a Location.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/datasets/list

optional:
filter <string> An expression for filtering the results of the request. For field names both snake_case and camelCase are supported. * `display_name`: supports = and != * `metadata_schema_uri`: supports = and != * `labels` supports general map functions that is: * `labels.key=value` - key:value equality * `labels.key:* or labels:key - key existence * A key including a space must be quoted. `labels.\"a key\"`. Some examples: * `displayName=\"myDisplayName\"` * `labels.myKey=\"myValue\"`
readMask <string> Mask specifying which fields to read.
parent <string> Required. The name of the Dataset's parent resource. Format: `projects/{project}/locations/{location}`
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `display_name` * `create_time` * `update_time`
pageSize <integer> The standard list page size."
  ([] (datasets-list nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://aiplatform.googleapis.com/v1/datasets",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn datasets-delete
  "Deletes a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/datasets/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn datasets-create
  "Creates a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/datasets/create

GoogleCloudAiplatformV1Dataset:
GoogleCloudAiplatformV1Dataset

optional:
parent <string> Required. The resource name of the Location to create the Dataset in. Format: `projects/{project}/locations/{location}`"
  ([GoogleCloudAiplatformV1Dataset]
    (datasets-create GoogleCloudAiplatformV1Dataset nil))
  ([GoogleCloudAiplatformV1Dataset optional]
    (client/*api-request*
      {:method :post,
       :uri-template "https://aiplatform.googleapis.com/v1/datasets",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1Dataset})))

(defn datasets-datasetVersions-patch
  "Updates a DatasetVersion.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/datasets/datasetVersions/patch

name <> 
GoogleCloudAiplatformV1DatasetVersion:
GoogleCloudAiplatformV1DatasetVersion

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see google.protobuf.FieldMask. Updatable fields: * `display_name`"
  ([name GoogleCloudAiplatformV1DatasetVersion]
    (datasets-datasetVersions-patch
      name
      GoogleCloudAiplatformV1DatasetVersion
      nil))
  ([name GoogleCloudAiplatformV1DatasetVersion optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudAiplatformV1DatasetVersion})))

(defn datasets-datasetVersions-list
  "Lists DatasetVersions in a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/datasets/datasetVersions/list

parent <> 

optional:
readMask <string> Optional. Mask specifying which fields to read.
filter <string> Optional. The standard list filter.
orderBy <string> Optional. A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending.
pageSize <integer> Optional. The standard list page size."
  ([parent] (datasets-datasetVersions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://aiplatform.googleapis.com/v1/{+parent}/datasetVersions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn datasets-datasetVersions-restore
  "Restores a dataset version.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/datasets/datasetVersions/restore

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+name}:restore",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn datasets-datasetVersions-create
  "Create a version from a Dataset.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/datasets/datasetVersions/create

parent <> 
GoogleCloudAiplatformV1DatasetVersion:
GoogleCloudAiplatformV1DatasetVersion"
  [parent GoogleCloudAiplatformV1DatasetVersion]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+parent}/datasetVersions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1DatasetVersion}))

(defn datasets-datasetVersions-delete
  "Deletes a Dataset version.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/datasets/datasetVersions/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn datasets-datasetVersions-get
  "Gets a Dataset version.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/datasets/datasetVersions/get

name <> 

optional:
readMask <string> Mask specifying which fields to read."
  ([name] (datasets-datasetVersions-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn endpoints-streamGenerateContent
  "Generate content with multimodal inputs with streaming support.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/endpoints/streamGenerateContent

model <> 
GoogleCloudAiplatformV1GenerateContentRequest:
GoogleCloudAiplatformV1GenerateContentRequest"
  [model GoogleCloudAiplatformV1GenerateContentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+model}:streamGenerateContent",
     :uri-template-args {"model" model},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1GenerateContentRequest}))

(defn endpoints-generateContent
  "Generate content with multimodal inputs.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/endpoints/generateContent

model <> 
GoogleCloudAiplatformV1GenerateContentRequest:
GoogleCloudAiplatformV1GenerateContentRequest"
  [model GoogleCloudAiplatformV1GenerateContentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+model}:generateContent",
     :uri-template-args {"model" model},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1GenerateContentRequest}))

(defn endpoints-countTokens
  "Perform a token counting.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/endpoints/countTokens

endpoint <> 
GoogleCloudAiplatformV1CountTokensRequest:
GoogleCloudAiplatformV1CountTokensRequest"
  [endpoint GoogleCloudAiplatformV1CountTokensRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:countTokens",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CountTokensRequest}))

(defn endpoints-computeTokens
  "Return a list of tokens based on the input text.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/endpoints/computeTokens

endpoint <> 
GoogleCloudAiplatformV1ComputeTokensRequest:
GoogleCloudAiplatformV1ComputeTokensRequest"
  [endpoint GoogleCloudAiplatformV1ComputeTokensRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:computeTokens",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ComputeTokensRequest}))

(defn publishers-models-generateContent
  "Generate content with multimodal inputs.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/publishers/models/generateContent

model <> 
GoogleCloudAiplatformV1GenerateContentRequest:
GoogleCloudAiplatformV1GenerateContentRequest"
  [model GoogleCloudAiplatformV1GenerateContentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+model}:generateContent",
     :uri-template-args {"model" model},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1GenerateContentRequest}))

(defn publishers-models-computeTokens
  "Return a list of tokens based on the input text.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/publishers/models/computeTokens

endpoint <> 
GoogleCloudAiplatformV1ComputeTokensRequest:
GoogleCloudAiplatformV1ComputeTokensRequest"
  [endpoint GoogleCloudAiplatformV1ComputeTokensRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:computeTokens",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1ComputeTokensRequest}))

(defn publishers-models-countTokens
  "Perform a token counting.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/publishers/models/countTokens

endpoint <> 
GoogleCloudAiplatformV1CountTokensRequest:
GoogleCloudAiplatformV1CountTokensRequest"
  [endpoint GoogleCloudAiplatformV1CountTokensRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+endpoint}:countTokens",
     :uri-template-args {"endpoint" endpoint},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAiplatformV1CountTokensRequest}))

(defn publishers-models-get
  "Gets a Model Garden publisher model.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/publishers/models/get

name <> 

optional:
huggingFaceToken <string> Optional. Token used to access Hugging Face gated models.
view <string> Optional. PublisherModel view specifying which fields to read.
languageCode <string> Optional. The IETF BCP-47 language code representing the language in which the publisher model's text information should be written in.
isHuggingFaceModel <boolean> Optional. Boolean indicates whether the requested model is a Hugging Face model."
  ([name] (publishers-models-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://aiplatform.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn publishers-models-streamGenerateContent
  "Generate content with multimodal inputs with streaming support.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/publishers/models/streamGenerateContent

model <> 
GoogleCloudAiplatformV1GenerateContentRequest:
GoogleCloudAiplatformV1GenerateContentRequest"
  [model GoogleCloudAiplatformV1GenerateContentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://aiplatform.googleapis.com/v1/{+model}:streamGenerateContent",
     :uri-template-args {"model" model},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"],
     :body GoogleCloudAiplatformV1GenerateContentRequest}))
