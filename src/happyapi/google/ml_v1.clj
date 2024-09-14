(ns happyapi.google.ml-v1
  "AI Platform Training & Prediction API
An API to enable creating and using machine learning models.
See: https://cloud.google.com/vertex-ai/")

(defn projects-predict
  "Performs online prediction on the data in the request. {% dynamic include \"/ai-platform/includes/___predict-request\" %} 
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/predict

name <> 
GoogleCloudMlV1__PredictRequest:
GoogleCloudMlV1__PredictRequest"
  [name GoogleCloudMlV1__PredictRequest]
  {:method :post,
   :uri-template "https://ml.googleapis.com/v1/{+name}:predict",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__PredictRequest})

(defn projects-explain
  "Performs explanation on the data in the request. {% dynamic include \"/ai-platform/includes/___explain-request\" %} 
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/explain

name <> 
GoogleCloudMlV1__ExplainRequest:
GoogleCloudMlV1__ExplainRequest"
  [name GoogleCloudMlV1__ExplainRequest]
  {:method :post,
   :uri-template "https://ml.googleapis.com/v1/{+name}:explain",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__ExplainRequest})

(defn projects-getConfig
  "Get the service account information associated with your project. You need this information in order to grant the service account permissions for the Google Cloud Storage location where you put your model training code for training the model with Google Cloud Machine Learning.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/getConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://ml.googleapis.com/v1/{+name}:getConfig",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-jobs-create
  "Creates a training or a batch prediction job.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/jobs/create

parent <> 
GoogleCloudMlV1__Job:
GoogleCloudMlV1__Job"
  [parent GoogleCloudMlV1__Job]
  {:method :post,
   :uri-template "https://ml.googleapis.com/v1/{+parent}/jobs",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__Job})

(defn projects-jobs-list
  "Lists the jobs in the project. If there are no jobs that match the request parameters, the list request returns an empty response body: {}.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/jobs/list

parent <> 

optional:
filter <string> Optional. Specifies the subset of jobs to retrieve. You can filter on the value of one or more attributes of the job object. For example, retrieve jobs with a job identifier that starts with 'census': gcloud ai-platform jobs list --filter='jobId:census*' List all failed jobs with names that start with 'rnn': gcloud ai-platform jobs list --filter='jobId:rnn* AND state:FAILED' For more examples, see the guide to monitoring jobs.
pageSize <integer> Optional. The number of jobs to retrieve per \"page\" of results. If there are more remaining results than this number, the response message will contain a valid value in the `next_page_token` field. The default value is 20, and the maximum page size is 100."
  ([parent] (projects-jobs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://ml.googleapis.com/v1/{+parent}/jobs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-jobs-get
  "Describes a job.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/jobs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://ml.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"]})

(defn projects-jobs-cancel
  "Cancels a running job.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/jobs/cancel

name <> 
GoogleCloudMlV1__CancelJobRequest:
GoogleCloudMlV1__CancelJobRequest"
  [name GoogleCloudMlV1__CancelJobRequest]
  {:method :post,
   :uri-template "https://ml.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__CancelJobRequest})

(defn projects-jobs-patch
  "Updates a specific job resource. Currently the only supported fields to update are `labels`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/jobs/patch

name <> 
GoogleCloudMlV1__Job:
GoogleCloudMlV1__Job

optional:
updateMask <string> Required. Specifies the path, relative to `Job`, of the field to update. To adopt etag mechanism, include `etag` field in the mask, and include the `etag` value in your job resource. For example, to change the labels of a job, the `update_mask` parameter would be specified as `labels`, `etag`, and the `PATCH` request body would specify the new value, as follows: { \"labels\": { \"owner\": \"Google\", \"color\": \"Blue\" } \"etag\": \"33a64df551425fcc55e4d42a148795d9f25f89d4\" } If `etag` matches the one on the server, the labels of the job will be replaced with the given ones, and the server end `etag` will be recalculated. Currently the only supported update masks are `labels` and `etag`."
  ([name GoogleCloudMlV1__Job]
    (projects-jobs-patch name GoogleCloudMlV1__Job nil))
  ([name GoogleCloudMlV1__Job optional]
    {:method :patch,
     :uri-template "https://ml.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudMlV1__Job}))

(defn projects-jobs-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/jobs/setIamPolicy

resource <> 
GoogleIamV1__SetIamPolicyRequest:
GoogleIamV1__SetIamPolicyRequest"
  [resource GoogleIamV1__SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://ml.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1__SetIamPolicyRequest})

(defn projects-jobs-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/jobs/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-jobs-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://ml.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-jobs-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/jobs/testIamPermissions

resource <> 
GoogleIamV1__TestIamPermissionsRequest:
GoogleIamV1__TestIamPermissionsRequest"
  [resource GoogleIamV1__TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://ml.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1__TestIamPermissionsRequest})

(defn projects-locations-get
  "Get the complete list of CMLE capabilities in a location, along with their location-specific properties.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://ml.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"]})

(defn projects-locations-list
  "List all locations that provides at least one type of CMLE capability.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/list

parent <> 

optional:
pageSize <integer> Optional. The number of locations to retrieve per \"page\" of results. If there are more remaining results than this number, the response message will contain a valid value in the `next_page_token` field. The default value is 20, and the maximum page size is 100."
  ([parent] (projects-locations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://ml.googleapis.com/v1/{+parent}/locations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://ml.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/operations/cancel

name <> "
  [name]
  {:method :post,
   :uri-template "https://ml.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-studies-create
  "Creates a study.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/create

parent <> 
GoogleCloudMlV1__Study:
GoogleCloudMlV1__Study

optional:
studyId <string> Required. The ID to use for the study, which will become the final component of the study's resource name."
  ([parent GoogleCloudMlV1__Study]
    (projects-locations-studies-create
      parent
      GoogleCloudMlV1__Study
      nil))
  ([parent GoogleCloudMlV1__Study optional]
    {:method :post,
     :uri-template "https://ml.googleapis.com/v1/{+parent}/studies",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudMlV1__Study}))

(defn projects-locations-studies-get
  "Gets a study.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://ml.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-studies-list
  "Lists all the studies in a region for an associated project.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/list

parent <> "
  [parent]
  {:method :get,
   :uri-template "https://ml.googleapis.com/v1/{+parent}/studies",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-studies-delete
  "Deletes a study.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://ml.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-studies-trials-stop
  "Stops a trial.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/stop

name <> 
GoogleCloudMlV1__StopTrialRequest:
GoogleCloudMlV1__StopTrialRequest"
  [name GoogleCloudMlV1__StopTrialRequest]
  {:method :post,
   :uri-template "https://ml.googleapis.com/v1/{+name}:stop",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__StopTrialRequest})

(defn projects-locations-studies-trials-addMeasurement
  "Adds a measurement of the objective metrics to a trial. This measurement is assumed to have been taken before the trial is complete.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/addMeasurement

name <> 
GoogleCloudMlV1__AddTrialMeasurementRequest:
GoogleCloudMlV1__AddTrialMeasurementRequest"
  [name GoogleCloudMlV1__AddTrialMeasurementRequest]
  {:method :post,
   :uri-template "https://ml.googleapis.com/v1/{+name}:addMeasurement",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__AddTrialMeasurementRequest})

(defn projects-locations-studies-trials-list
  "Lists the trials associated with a study.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/list

parent <> "
  [parent]
  {:method :get,
   :uri-template "https://ml.googleapis.com/v1/{+parent}/trials",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-studies-trials-delete
  "Deletes a trial.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://ml.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-studies-trials-checkEarlyStoppingState
  "Checks whether a trial should stop or not. Returns a long-running operation. When the operation is successful, it will contain a CheckTrialEarlyStoppingStateResponse.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/checkEarlyStoppingState

name <> 
GoogleCloudMlV1__CheckTrialEarlyStoppingStateRequest:
GoogleCloudMlV1__CheckTrialEarlyStoppingStateRequest"
  [name GoogleCloudMlV1__CheckTrialEarlyStoppingStateRequest]
  {:method :post,
   :uri-template
   "https://ml.googleapis.com/v1/{+name}:checkEarlyStoppingState",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__CheckTrialEarlyStoppingStateRequest})

(defn projects-locations-studies-trials-complete
  "Marks a trial as complete.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/complete

name <> 
GoogleCloudMlV1__CompleteTrialRequest:
GoogleCloudMlV1__CompleteTrialRequest"
  [name GoogleCloudMlV1__CompleteTrialRequest]
  {:method :post,
   :uri-template "https://ml.googleapis.com/v1/{+name}:complete",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__CompleteTrialRequest})

(defn projects-locations-studies-trials-listOptimalTrials
  "Lists the pareto-optimal trials for multi-objective study or the optimal trials for single-objective study. The definition of pareto-optimal can be checked in wiki page. https://en.wikipedia.org/wiki/Pareto_efficiency
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/listOptimalTrials

parent <> 
GoogleCloudMlV1__ListOptimalTrialsRequest:
GoogleCloudMlV1__ListOptimalTrialsRequest"
  [parent GoogleCloudMlV1__ListOptimalTrialsRequest]
  {:method :post,
   :uri-template
   "https://ml.googleapis.com/v1/{+parent}/trials:listOptimalTrials",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__ListOptimalTrialsRequest})

(defn projects-locations-studies-trials-create
  "Adds a user provided trial to a study.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/create

parent <> 
GoogleCloudMlV1__Trial:
GoogleCloudMlV1__Trial"
  [parent GoogleCloudMlV1__Trial]
  {:method :post,
   :uri-template "https://ml.googleapis.com/v1/{+parent}/trials",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__Trial})

(defn projects-locations-studies-trials-get
  "Gets a trial.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://ml.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-studies-trials-suggest
  "Adds one or more trials to a study, with parameter values suggested by AI Platform Vizier. Returns a long-running operation associated with the generation of trial suggestions. When this long-running operation succeeds, it will contain a SuggestTrialsResponse.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/locations/studies/trials/suggest

parent <> 
GoogleCloudMlV1__SuggestTrialsRequest:
GoogleCloudMlV1__SuggestTrialsRequest"
  [parent GoogleCloudMlV1__SuggestTrialsRequest]
  {:method :post,
   :uri-template
   "https://ml.googleapis.com/v1/{+parent}/trials:suggest",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__SuggestTrialsRequest})

(defn projects-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://ml.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://ml.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/operations/cancel

name <> "
  [name]
  {:method :post,
   :uri-template "https://ml.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-models-create
  "Creates a model which will later contain one or more versions. You must add at least one version before you can request predictions from the model. Add versions by calling projects.models.versions.create.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/create

parent <> 
GoogleCloudMlV1__Model:
GoogleCloudMlV1__Model"
  [parent GoogleCloudMlV1__Model]
  {:method :post,
   :uri-template "https://ml.googleapis.com/v1/{+parent}/models",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__Model})

(defn projects-models-list
  "Lists the models in a project. Each project can contain multiple models, and each model can have multiple versions. If there are no models that match the request parameters, the list request returns an empty response body: {}.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/list

parent <> 

optional:
filter <string> Optional. Specifies the subset of models to retrieve.
pageSize <integer> Optional. The number of models to retrieve per \"page\" of results. If there are more remaining results than this number, the response message will contain a valid value in the `next_page_token` field. The default value is 20, and the maximum page size is 100."
  ([parent] (projects-models-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://ml.googleapis.com/v1/{+parent}/models",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-models-get
  "Gets information about a model, including its name, the description (if set), and the default version (if at least one version of the model has been deployed).
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://ml.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"]})

(defn projects-models-delete
  "Deletes a model. You can only delete a model if there are no versions in it. You can delete versions by calling projects.models.versions.delete.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://ml.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-models-patch
  "Updates a specific model resource. Currently the only supported fields to update are `description` and `default_version.name`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/patch

name <> 
GoogleCloudMlV1__Model:
GoogleCloudMlV1__Model

optional:
updateMask <string> Required. Specifies the path, relative to `Model`, of the field to update. For example, to change the description of a model to \"foo\" and set its default version to \"version_1\", the `update_mask` parameter would be specified as `description`, `default_version.name`, and the `PATCH` request body would specify the new value, as follows: { \"description\": \"foo\", \"defaultVersion\": { \"name\":\"version_1\" } } Currently the supported update masks are `description` and `default_version.name`."
  ([name GoogleCloudMlV1__Model]
    (projects-models-patch name GoogleCloudMlV1__Model nil))
  ([name GoogleCloudMlV1__Model optional]
    {:method :patch,
     :uri-template "https://ml.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudMlV1__Model}))

(defn projects-models-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/setIamPolicy

resource <> 
GoogleIamV1__SetIamPolicyRequest:
GoogleIamV1__SetIamPolicyRequest"
  [resource GoogleIamV1__SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://ml.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1__SetIamPolicyRequest})

(defn projects-models-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-models-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://ml.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-models-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/testIamPermissions

resource <> 
GoogleIamV1__TestIamPermissionsRequest:
GoogleIamV1__TestIamPermissionsRequest"
  [resource GoogleIamV1__TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://ml.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1__TestIamPermissionsRequest})

(defn projects-models-versions-create
  "Creates a new version of a model from a trained TensorFlow model. If the version created in the cloud by this call is the first deployed version of the specified model, it will be made the default version of the model. When you add a version to a model that already has one or more versions, the default version does not automatically change. If you want a new version to be the default, you must call projects.models.versions.setDefault.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/versions/create

parent <> 
GoogleCloudMlV1__Version:
GoogleCloudMlV1__Version"
  [parent GoogleCloudMlV1__Version]
  {:method :post,
   :uri-template "https://ml.googleapis.com/v1/{+parent}/versions",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__Version})

(defn projects-models-versions-patch
  "Updates the specified Version resource. Currently the only update-able fields are `description`, `requestLoggingConfig`, `autoScaling.minNodes`, and `manualScaling.nodes`.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/versions/patch

name <> 
GoogleCloudMlV1__Version:
GoogleCloudMlV1__Version

optional:
updateMask <string> Required. Specifies the path, relative to `Version`, of the field to update. Must be present and non-empty. For example, to change the description of a version to \"foo\", the `update_mask` parameter would be specified as `description`, and the `PATCH` request body would specify the new value, as follows: ``` { \"description\": \"foo\" } ``` Currently the only supported update mask fields are `description`, `requestLoggingConfig`, `autoScaling.minNodes`, and `manualScaling.nodes`. However, you can only update `manualScaling.nodes` if the version uses a [Compute Engine (N1) machine type](/ml-engine/docs/machine-types-online-prediction)."
  ([name GoogleCloudMlV1__Version]
    (projects-models-versions-patch name GoogleCloudMlV1__Version nil))
  ([name GoogleCloudMlV1__Version optional]
    {:method :patch,
     :uri-template "https://ml.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudMlV1__Version}))

(defn projects-models-versions-list
  "Gets basic information about all the versions of a model. If you expect that a model has many versions, or if you need to handle only a limited number of results at a time, you can request that the list be retrieved in batches (called pages). If there are no versions that match the request parameters, the list request returns an empty response body: {}.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/versions/list

parent <> 

optional:
filter <string> Optional. Specifies the subset of versions to retrieve.
pageSize <integer> Optional. The number of versions to retrieve per \"page\" of results. If there are more remaining results than this number, the response message will contain a valid value in the `next_page_token` field. The default value is 20, and the maximum page size is 100."
  ([parent] (projects-models-versions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://ml.googleapis.com/v1/{+parent}/versions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-models-versions-get
  "Gets information about a model version. Models can have multiple versions. You can call projects.models.versions.list to get the same information that this method returns for all of the versions of a model.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/versions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://ml.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-models-versions-delete
  "Deletes a model version. Each model can have multiple versions deployed and in use at any given time. Use this method to remove a single version. Note: You cannot delete the version that is set as the default version of the model unless it is the only remaining version.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/versions/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://ml.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-models-versions-setDefault
  "Designates a version to be the default for the model. The default version is used for prediction requests made against the model that don't specify a version. The first version to be created for a model is automatically set as the default. You must make any subsequent changes to the default version setting manually using this method.
https://cloud.google.com/vertex-ai/v1/reference/rest/v1/projects/models/versions/setDefault

name <> 
GoogleCloudMlV1__SetDefaultVersionRequest:
GoogleCloudMlV1__SetDefaultVersionRequest"
  [name GoogleCloudMlV1__SetDefaultVersionRequest]
  {:method :post,
   :uri-template "https://ml.googleapis.com/v1/{+name}:setDefault",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudMlV1__SetDefaultVersionRequest})
