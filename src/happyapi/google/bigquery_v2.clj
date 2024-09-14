(ns happyapi.google.bigquery-v2
  "BigQuery API
A data platform for customers to create, manage, share and query data.
See: https://cloud.google.com/bigquery/")

(defn datasets-delete
  "Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying deleteContents. Immediately after deletion, you can create another dataset with the same name.
https://cloud.google.com/bigquery/v2/reference/rest/v2/datasets/delete

projectId <> 
datasetId <> 

optional:
deleteContents <boolean> If True, delete all the tables in the dataset. If False and the dataset contains tables, the request will fail. Default is False"
  ([projectId datasetId] (datasets-delete projectId datasetId nil))
  ([projectId datasetId optional]
    {:method :delete,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}",
     :uri-template-args {"datasetId" datasetId, "projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn datasets-get
  "Returns the dataset specified by datasetID.
https://cloud.google.com/bigquery/v2/reference/rest/v2/datasets/get

projectId <> 
datasetId <> 

optional:
datasetView <string> Optional. Specifies the view that determines which dataset information is returned. By default, metadata and ACL information are returned."
  ([projectId datasetId] (datasets-get projectId datasetId nil))
  ([projectId datasetId optional]
    {:method :get,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}",
     :uri-template-args {"datasetId" datasetId, "projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn datasets-insert
  "Creates a new empty dataset.
https://cloud.google.com/bigquery/v2/reference/rest/v2/datasets/insert

projectId <> 
Dataset:
Dataset"
  [projectId Dataset]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets",
   :uri-template-args {"projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body Dataset})

(defn datasets-list
  "Lists all datasets in the specified project to which the user has been granted the READER dataset role.
https://cloud.google.com/bigquery/v2/reference/rest/v2/datasets/list

projectId <> 

optional:
all <boolean> Whether to list all datasets, including hidden ones
filter <string> An expression for filtering the results of the request by label. The syntax is `labels.[:]`. Multiple filters can be ANDed together by connecting with a space. Example: `labels.department:receiving labels.active`. See [Filtering datasets using labels](https://cloud.google.com/bigquery/docs/filtering-labels#filtering_datasets_using_labels) for details.
maxResults <integer> The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection."
  ([projectId] (datasets-list projectId nil))
  ([projectId optional]
    {:method :get,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets",
     :uri-template-args {"projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn datasets-patch
  "Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted dataset resource. This method supports RFC5789 patch semantics.
https://cloud.google.com/bigquery/v2/reference/rest/v2/datasets/patch

projectId <> 
datasetId <> 
Dataset:
Dataset"
  [projectId datasetId Dataset]
  {:method :patch,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}",
   :uri-template-args {"datasetId" datasetId, "projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body Dataset})

(defn datasets-undelete
  "Undeletes a dataset which is within time travel window based on datasetId. If a time is specified, the dataset version deleted at that time is undeleted, else the last live version is undeleted.
https://cloud.google.com/bigquery/v2/reference/rest/v2/datasets/undelete

projectId <> 
datasetId <> 
UndeleteDatasetRequest:
UndeleteDatasetRequest"
  [projectId datasetId UndeleteDatasetRequest]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}:undelete",
   :uri-template-args {"datasetId" datasetId, "projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body UndeleteDatasetRequest})

(defn datasets-update
  "Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted dataset resource.
https://cloud.google.com/bigquery/v2/reference/rest/v2/datasets/update

projectId <> 
datasetId <> 
Dataset:
Dataset"
  [projectId datasetId Dataset]
  {:method :put,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}",
   :uri-template-args {"datasetId" datasetId, "projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body Dataset})

(defn jobs-cancel
  "Requests that a job be cancelled. This call will return immediately, and the client will need to poll for the job status to see if the cancel completed successfully. Cancelled jobs may still incur costs.
https://cloud.google.com/bigquery/v2/reference/rest/v2/jobs/cancel

projectId <> 
jobId <> 

optional:
location <string> The geographic location of the job. You must specify the location to run the job for the following scenarios: * If the location to run a job is not in the `us` or the `eu` multi-regional location * If the job's location is in a single region (for example, `us-central1`) For more information, see https://cloud.google.com/bigquery/docs/locations#specifying_your_location."
  ([projectId jobId] (jobs-cancel projectId jobId nil))
  ([projectId jobId optional]
    {:method :post,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/jobs/{+jobId}/cancel",
     :uri-template-args {"jobId" jobId, "projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn jobs-delete
  "Requests the deletion of the metadata of a job. This call returns when the job's metadata is deleted.
https://cloud.google.com/bigquery/v2/reference/rest/v2/jobs/delete

projectId <> 
jobId <> 

optional:
location <string> The geographic location of the job. Required. See details at: https://cloud.google.com/bigquery/docs/locations#specifying_your_location."
  ([projectId jobId] (jobs-delete projectId jobId nil))
  ([projectId jobId optional]
    {:method :delete,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/jobs/{+jobId}/delete",
     :uri-template-args {"jobId" jobId, "projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn jobs-get
  "Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran the job, or have the Is Owner project role.
https://cloud.google.com/bigquery/v2/reference/rest/v2/jobs/get

projectId <> 
jobId <> 

optional:
location <string> The geographic location of the job. You must specify the location to run the job for the following scenarios: * If the location to run a job is not in the `us` or the `eu` multi-regional location * If the job's location is in a single region (for example, `us-central1`) For more information, see https://cloud.google.com/bigquery/docs/locations#specifying_your_location."
  ([projectId jobId] (jobs-get projectId jobId nil))
  ([projectId jobId optional]
    {:method :get,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/jobs/{+jobId}",
     :uri-template-args {"jobId" jobId, "projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn jobs-getQueryResults
  "RPC to get the results of a query job.
https://cloud.google.com/bigquery/v2/reference/rest/v2/jobs/getQueryResults

projectId <> 
jobId <> 

optional:
formatOptions.useInt64Timestamp <boolean> Optional. Output timestamp as usec int64. Default is false.
location <string> The geographic location of the job. You must specify the location to run the job for the following scenarios: * If the location to run a job is not in the `us` or the `eu` multi-regional location * If the job's location is in a single region (for example, `us-central1`) For more information, see https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
maxResults <integer> Maximum number of results to read.
startIndex <string> Zero-based index of the starting row.
timeoutMs <integer> Optional: Specifies the maximum amount of time, in milliseconds, that the client is willing to wait for the query to complete. By default, this limit is 10 seconds (10,000 milliseconds). If the query is complete, the jobComplete field in the response is true. If the query has not yet completed, jobComplete is false. You can request a longer timeout period in the timeoutMs field. However, the call is not guaranteed to wait for the specified timeout; it typically returns after around 200 seconds (200,000 milliseconds), even if the query is not complete. If jobComplete is false, you can continue to wait for the query to complete by calling the getQueryResults method until the jobComplete field in the getQueryResults response is true."
  ([projectId jobId] (jobs-getQueryResults projectId jobId nil))
  ([projectId jobId optional]
    {:method :get,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/queries/{+jobId}",
     :uri-template-args {"jobId" jobId, "projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn jobs-insert
  "Starts a new asynchronous job. This API has two different kinds of endpoint URIs, as this method supports a variety of use cases. * The *Metadata* URI is used for most interactions, as it accepts the job configuration directly. * The *Upload* URI is ONLY for the case when you're sending both a load job configuration and a data stream together. In this case, the Upload URI accepts the job configuration and the data as two distinct multipart MIME parts.
https://cloud.google.com/bigquery/v2/reference/rest/v2/jobs/insert

projectId <> 
Job:
Job"
  [projectId Job]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/jobs",
   :uri-template-args {"projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/devstorage.full_control"
    "https://www.googleapis.com/auth/devstorage.read_only"
    "https://www.googleapis.com/auth/devstorage.read_write"],
   :body Job})

(defn jobs-list
  "Lists all jobs that you started in the specified project. Job information is available for a six month period after creation. The job list is sorted in reverse chronological order, by job creation time. Requires the Can View project role, or the Is Owner project role if you set the allUsers property.
https://cloud.google.com/bigquery/v2/reference/rest/v2/jobs/list

projectId <> 

optional:
allUsers <boolean> Whether to display jobs owned by all users in the project. Default False.
maxCreationTime <string> Max value for job creation time, in milliseconds since the POSIX epoch. If set, only jobs created before or at this timestamp are returned.
maxResults <integer> The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection.
parentJobId <string> If set, show only child jobs of the specified parent. Otherwise, show all top-level jobs.
projection <string> Restrict information returned to a set of selected fields
stateFilter <string> Filter for job state
minCreationTime <string> Min value for job creation time, in milliseconds since the POSIX epoch. If set, only jobs created after or at this timestamp are returned."
  ([projectId] (jobs-list projectId nil))
  ([projectId optional]
    {:method :get,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/jobs",
     :uri-template-args {"projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn jobs-query
  "Runs a BigQuery SQL query synchronously and returns query results if the query completes within a specified timeout.
https://cloud.google.com/bigquery/v2/reference/rest/v2/jobs/query

projectId <> 
QueryRequest:
QueryRequest"
  [projectId QueryRequest]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/queries",
   :uri-template-args {"projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"],
   :body QueryRequest})

(defn models-delete
  "Deletes the model specified by modelId from the dataset.
https://cloud.google.com/bigquery/v2/reference/rest/v2/models/delete

projectId <> 
datasetId <> 
modelId <> "
  [projectId datasetId modelId]
  {:method :delete,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/models/{+modelId}",
   :uri-template-args
   {"datasetId" datasetId, "modelId" modelId, "projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn models-get
  "Gets the specified model resource by model ID.
https://cloud.google.com/bigquery/v2/reference/rest/v2/models/get

projectId <> 
datasetId <> 
modelId <> "
  [projectId datasetId modelId]
  {:method :get,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/models/{+modelId}",
   :uri-template-args
   {"datasetId" datasetId, "modelId" modelId, "projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"]})

(defn models-list
  "Lists all models in the specified dataset. Requires the READER dataset role. After retrieving the list of models, you can get information about a particular model by calling the models.get method.
https://cloud.google.com/bigquery/v2/reference/rest/v2/models/list

projectId <> 
datasetId <> 

optional:
maxResults <integer> The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection."
  ([projectId datasetId] (models-list projectId datasetId nil))
  ([projectId datasetId optional]
    {:method :get,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/models",
     :uri-template-args {"datasetId" datasetId, "projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn models-patch
  "Patch specific fields in the specified model.
https://cloud.google.com/bigquery/v2/reference/rest/v2/models/patch

projectId <> 
datasetId <> 
modelId <> 
Model:
Model"
  [projectId datasetId modelId Model]
  {:method :patch,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/models/{+modelId}",
   :uri-template-args
   {"datasetId" datasetId, "modelId" modelId, "projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body Model})

(defn projects-getServiceAccount
  "RPC to get the service account for a project used for interactions with Google Cloud KMS
https://cloud.google.com/bigquery/v2/reference/rest/v2/projects/getServiceAccount

projectId <> "
  [projectId]
  {:method :get,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/serviceAccount",
   :uri-template-args {"projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"]})

(defn projects-list
  "RPC to list projects to which the user has been granted any project role. Users of this method are encouraged to consider the [Resource Manager](https://cloud.google.com/resource-manager/docs/) API, which provides the underlying data for this method and has more capabilities.
https://cloud.google.com/bigquery/v2/reference/rest/v2/projects/list

optional:
maxResults <integer> `maxResults` unset returns all results, up to 50 per page. Additionally, the number of projects in a page may be fewer than `maxResults` because projects are retrieved and then filtered to only projects with the BigQuery API enabled."
  ([] (projects-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn routines-delete
  "Deletes the routine specified by routineId from the dataset.
https://cloud.google.com/bigquery/v2/reference/rest/v2/routines/delete

projectId <> 
datasetId <> 
routineId <> "
  [projectId datasetId routineId]
  {:method :delete,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/routines/{+routineId}",
   :uri-template-args
   {"datasetId" datasetId,
    "projectId" projectId,
    "routineId" routineId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn routines-get
  "Gets the specified routine resource by routine ID.
https://cloud.google.com/bigquery/v2/reference/rest/v2/routines/get

projectId <> 
datasetId <> 
routineId <> 

optional:
readMask <string> If set, only the Routine fields in the field mask are returned in the response. If unset, all Routine fields are returned."
  ([projectId datasetId routineId]
    (routines-get projectId datasetId routineId nil))
  ([projectId datasetId routineId optional]
    {:method :get,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/routines/{+routineId}",
     :uri-template-args
     {"datasetId" datasetId,
      "projectId" projectId,
      "routineId" routineId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn routines-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/bigquery/v2/reference/rest/v2/routines/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"],
   :body GetIamPolicyRequest})

(defn routines-insert
  "Creates a new routine in the dataset.
https://cloud.google.com/bigquery/v2/reference/rest/v2/routines/insert

projectId <> 
datasetId <> 
Routine:
Routine"
  [projectId datasetId Routine]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/routines",
   :uri-template-args {"datasetId" datasetId, "projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body Routine})

(defn routines-list
  "Lists all routines in the specified dataset. Requires the READER dataset role.
https://cloud.google.com/bigquery/v2/reference/rest/v2/routines/list

projectId <> 
datasetId <> 

optional:
filter <string> If set, then only the Routines matching this filter are returned. The supported format is `routineType:{RoutineType}`, where `{RoutineType}` is a RoutineType enum. For example: `routineType:SCALAR_FUNCTION`.
maxResults <integer> The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection.
readMask <string> If set, then only the Routine fields in the field mask, as well as project_id, dataset_id and routine_id, are returned in the response. If unset, then the following Routine fields are returned: etag, project_id, dataset_id, routine_id, routine_type, creation_time, last_modified_time, and language."
  ([projectId datasetId] (routines-list projectId datasetId nil))
  ([projectId datasetId optional]
    {:method :get,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/routines",
     :uri-template-args {"datasetId" datasetId, "projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn routines-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/bigquery/v2/reference/rest/v2/routines/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn routines-update
  "Updates information in an existing routine. The update method replaces the entire Routine resource.
https://cloud.google.com/bigquery/v2/reference/rest/v2/routines/update

projectId <> 
datasetId <> 
routineId <> 
Routine:
Routine"
  [projectId datasetId routineId Routine]
  {:method :put,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/routines/{+routineId}",
   :uri-template-args
   {"datasetId" datasetId,
    "projectId" projectId,
    "routineId" routineId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body Routine})

(defn rowAccessPolicies-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/bigquery/v2/reference/rest/v2/rowAccessPolicies/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"],
   :body GetIamPolicyRequest})

(defn rowAccessPolicies-list
  "Lists all row access policies on the specified table.
https://cloud.google.com/bigquery/v2/reference/rest/v2/rowAccessPolicies/list

projectId <> 
datasetId <> 
tableId <> 

optional:
pageSize <integer> The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection."
  ([projectId datasetId tableId]
    (rowAccessPolicies-list projectId datasetId tableId nil))
  ([projectId datasetId tableId optional]
    {:method :get,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/tables/{+tableId}/rowAccessPolicies",
     :uri-template-args
     {"datasetId" datasetId, "projectId" projectId, "tableId" tableId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn rowAccessPolicies-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/bigquery/v2/reference/rest/v2/rowAccessPolicies/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"],
   :body TestIamPermissionsRequest})

(defn tabledata-insertAll
  "Streams data into BigQuery one record at a time without needing to run a load job.
https://cloud.google.com/bigquery/v2/reference/rest/v2/tabledata/insertAll

projectId <> 
datasetId <> 
tableId <> 
TableDataInsertAllRequest:
TableDataInsertAllRequest"
  [projectId datasetId tableId TableDataInsertAllRequest]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/tables/{+tableId}/insertAll",
   :uri-template-args
   {"datasetId" datasetId, "projectId" projectId, "tableId" tableId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/bigquery.insertdata"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body TableDataInsertAllRequest})

(defn tabledata-list
  "List the content of a table in rows.
https://cloud.google.com/bigquery/v2/reference/rest/v2/tabledata/list

projectId <> 
datasetId <> 
tableId <> 

optional:
formatOptions.useInt64Timestamp <boolean> Optional. Output timestamp as usec int64. Default is false.
maxResults <integer> Row limit of the table.
selectedFields <string> Subset of fields to return, supports select into sub fields. Example: selected_fields = \"a,e.d.f\";
startIndex <string> Start row index of the table."
  ([projectId datasetId tableId]
    (tabledata-list projectId datasetId tableId nil))
  ([projectId datasetId tableId optional]
    {:method :get,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/tables/{+tableId}/data",
     :uri-template-args
     {"datasetId" datasetId, "projectId" projectId, "tableId" tableId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn tables-list
  "Lists all tables in the specified dataset. Requires the READER dataset role.
https://cloud.google.com/bigquery/v2/reference/rest/v2/tables/list

projectId <> 
datasetId <> 

optional:
maxResults <integer> The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection."
  ([projectId datasetId] (tables-list projectId datasetId nil))
  ([projectId datasetId optional]
    {:method :get,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/tables",
     :uri-template-args {"datasetId" datasetId, "projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn tables-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/bigquery/v2/reference/rest/v2/tables/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn tables-delete
  "Deletes the table specified by tableId from the dataset. If the table contains data, all the data will be deleted.
https://cloud.google.com/bigquery/v2/reference/rest/v2/tables/delete

projectId <> 
datasetId <> 
tableId <> "
  [projectId datasetId tableId]
  {:method :delete,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/tables/{+tableId}",
   :uri-template-args
   {"datasetId" datasetId, "projectId" projectId, "tableId" tableId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn tables-update
  "Updates information in an existing table. The update method replaces the entire Table resource, whereas the patch method only replaces fields that are provided in the submitted Table resource.
https://cloud.google.com/bigquery/v2/reference/rest/v2/tables/update

projectId <> 
datasetId <> 
tableId <> 
Table:
Table

optional:
autodetect_schema <boolean> Optional.  When true will autodetect schema, else will keep original schema"
  ([projectId datasetId tableId Table]
    (tables-update projectId datasetId tableId Table nil))
  ([projectId datasetId tableId Table optional]
    {:method :put,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/tables/{+tableId}",
     :uri-template-args
     {"datasetId" datasetId, "projectId" projectId, "tableId" tableId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body Table}))

(defn tables-patch
  "Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are provided in the submitted table resource. This method supports RFC5789 patch semantics.
https://cloud.google.com/bigquery/v2/reference/rest/v2/tables/patch

projectId <> 
datasetId <> 
tableId <> 
Table:
Table

optional:
autodetect_schema <boolean> Optional.  When true will autodetect schema, else will keep original schema"
  ([projectId datasetId tableId Table]
    (tables-patch projectId datasetId tableId Table nil))
  ([projectId datasetId tableId Table optional]
    {:method :patch,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/tables/{+tableId}",
     :uri-template-args
     {"datasetId" datasetId, "projectId" projectId, "tableId" tableId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body Table}))

(defn tables-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/bigquery/v2/reference/rest/v2/tables/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"],
   :body GetIamPolicyRequest})

(defn tables-insert
  "Creates a new, empty table in the dataset.
https://cloud.google.com/bigquery/v2/reference/rest/v2/tables/insert

projectId <> 
datasetId <> 
Table:
Table"
  [projectId datasetId Table]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/tables",
   :uri-template-args {"datasetId" datasetId, "projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body Table})

(defn tables-get
  "Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes the structure of this table.
https://cloud.google.com/bigquery/v2/reference/rest/v2/tables/get

projectId <> 
datasetId <> 
tableId <> 

optional:
selectedFields <string> List of table schema fields to return (comma-separated). If unspecified, all fields are returned. A fieldMask cannot be used here because the fields will automatically be converted from camelCase to snake_case and the conversion will fail if there are underscores. Since these are fields in BigQuery table schemas, underscores are allowed.
view <string> Optional. Specifies the view that determines which table information is returned. By default, basic table information and storage statistics (STORAGE_STATS) are returned."
  ([projectId datasetId tableId]
    (tables-get projectId datasetId tableId nil))
  ([projectId datasetId tableId optional]
    {:method :get,
     :uri-template
     "https://bigquery.googleapis.com/bigquery/v2/projects/{+projectId}/datasets/{+datasetId}/tables/{+tableId}",
     :uri-template-args
     {"datasetId" datasetId, "projectId" projectId, "tableId" tableId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn tables-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/bigquery/v2/reference/rest/v2/tables/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://bigquery.googleapis.com/bigquery/v2/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"],
   :body TestIamPermissionsRequest})
