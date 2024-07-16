(ns happyapi.google.storagetransfer-v1
  "Storage Transfer API
Transfers data from external data sources to a Google Cloud Storage bucket or between Google Cloud Storage buckets. 
See: https://cloud.google.com/storage-transfer/docs/overview"
  (:require [happyapi.providers.google :as client]))

(defn transferOperations-list
  "Lists transfer operations. Operations are ordered by their creation time in reverse chronological order.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/transferOperations/list

name <> 
filter <> 

optional:
pageSize <integer> The list page size. The max allowed value is 256."
  ([name filter] (transferOperations-list name filter nil))
  ([name filter optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://storagetransfer.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {"filter" filter} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn transferOperations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/transferOperations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://storagetransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn transferOperations-cancel
  "Cancels a transfer. Use the transferOperations.get method to check if the cancellation succeeded or if the operation completed despite the `cancel` request. When you cancel an operation, the currently running transfer is interrupted. For recurring transfer jobs, the next instance of the transfer job will still run. For example, if your job is configured to run every day at 1pm and you cancel Monday's operation at 1:05pm, Monday's transfer will stop. However, a transfer job will still be attempted on Tuesday. This applies only to currently running operations. If an operation is not currently running, `cancel` does nothing. *Caution:* Canceling a transfer job can leave your data in an unknown state. We recommend that you restore the state at both the destination and the source after the `cancel` request completes so that your data is in a consistent state. When you cancel a job, the next job computes a delta of files and may repair any inconsistent state. For instance, if you run a job every day, and today's job found 10 new files and transferred five files before you canceled the job, tomorrow's transfer operation will compute a new delta with the five files that were not copied today plus any new files discovered tomorrow.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/transferOperations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://storagetransfer.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn transferOperations-pause
  "Pauses a transfer operation.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/transferOperations/pause

name <> 
PauseTransferOperationRequest:
PauseTransferOperationRequest"
  [name PauseTransferOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://storagetransfer.googleapis.com/v1/{+name}:pause",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body PauseTransferOperationRequest}))

(defn transferOperations-resume
  "Resumes a transfer operation that is paused.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/transferOperations/resume

name <> 
ResumeTransferOperationRequest:
ResumeTransferOperationRequest"
  [name ResumeTransferOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://storagetransfer.googleapis.com/v1/{+name}:resume",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ResumeTransferOperationRequest}))

(defn googleServiceAccounts-get
  "Returns the Google service account that is used by Storage Transfer Service to access buckets in the project where transfers run or in other projects. Each Google service account is associated with one Google Cloud project. Users should add this service account to the Google Cloud Storage bucket ACLs to grant access to Storage Transfer Service. This service account is created and owned by Storage Transfer Service and can only be used by Storage Transfer Service.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/googleServiceAccounts/get

projectId <> "
  [projectId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://storagetransfer.googleapis.com/v1/googleServiceAccounts/{projectId}",
     :uri-template-args {"projectId" projectId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn transferJobs-create
  "Creates a transfer job that runs periodically.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/transferJobs/create

TransferJob:
TransferJob"
  [TransferJob]
  (client/api-request
    {:method :post,
     :uri-template
     "https://storagetransfer.googleapis.com/v1/transferJobs",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TransferJob}))

(defn transferJobs-patch
  "Updates a transfer job. Updating a job's transfer spec does not affect transfer operations that are running already. **Note:** The job's status field can be modified using this RPC (for example, to set a job's status to DELETED, DISABLED, or ENABLED).
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/transferJobs/patch

jobName <> 
UpdateTransferJobRequest:
UpdateTransferJobRequest"
  [jobName UpdateTransferJobRequest]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://storagetransfer.googleapis.com/v1/{+jobName}",
     :uri-template-args {"jobName" jobName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UpdateTransferJobRequest}))

(defn transferJobs-get
  "Gets a transfer job.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/transferJobs/get

jobName <> 
projectId <> "
  [jobName projectId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://storagetransfer.googleapis.com/v1/{+jobName}",
     :uri-template-args {"jobName" jobName},
     :query-params {"projectId" projectId},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn transferJobs-list
  "Lists transfer jobs.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/transferJobs/list

filter <> 

optional:
pageSize <integer> The list page size. The max allowed value is 256."
  ([filter] (transferJobs-list filter nil))
  ([filter optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://storagetransfer.googleapis.com/v1/transferJobs",
       :uri-template-args {},
       :query-params (merge {"filter" filter} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn transferJobs-run
  "Starts a new operation for the specified transfer job. A `TransferJob` has a maximum of one active `TransferOperation`. If this method is called while a `TransferOperation` is active, an error is returned.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/transferJobs/run

jobName <> 
RunTransferJobRequest:
RunTransferJobRequest"
  [jobName RunTransferJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://storagetransfer.googleapis.com/v1/{+jobName}:run",
     :uri-template-args {"jobName" jobName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RunTransferJobRequest}))

(defn transferJobs-delete
  "Deletes a transfer job. Deleting a transfer job sets its status to DELETED.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/transferJobs/delete

jobName <> 
projectId <> "
  [jobName projectId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://storagetransfer.googleapis.com/v1/{+jobName}",
     :uri-template-args {"jobName" jobName},
     :query-params {"projectId" projectId},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-agentPools-create
  "Creates an agent pool resource.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/projects/agentPools/create

projectId <> 
AgentPool:
AgentPool

optional:
agentPoolId <string> Required. The ID of the agent pool to create. The `agent_pool_id` must meet the following requirements: * Length of 128 characters or less. * Not start with the string `goog`. * Start with a lowercase ASCII character, followed by: * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (`-`), periods (`.`), underscores (`_`), or tildes (`~`). * One or more numerals or lowercase ASCII characters. As expressed by the regular expression: `^(?!goog)[a-z]([a-z0-9-._~]*[a-z0-9])?$`."
  ([projectId AgentPool]
    (projects-agentPools-create projectId AgentPool nil))
  ([projectId AgentPool optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://storagetransfer.googleapis.com/v1/projects/{+projectId}/agentPools",
       :uri-template-args {"projectId" projectId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body AgentPool})))

(defn projects-agentPools-patch
  "Updates an existing agent pool resource.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/projects/agentPools/patch

name <> 
AgentPool:
AgentPool

optional:
updateMask <string> The [field mask] (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf) of the fields in `agentPool` to update in this request. The following `agentPool` fields can be updated: * display_name * bandwidth_limit"
  ([name AgentPool] (projects-agentPools-patch name AgentPool nil))
  ([name AgentPool optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://storagetransfer.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body AgentPool})))

(defn projects-agentPools-get
  "Gets an agent pool.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/projects/agentPools/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://storagetransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-agentPools-list
  "Lists agent pools.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/projects/agentPools/list

projectId <> 

optional:
filter <string> An optional list of query parameters specified as JSON text in the form of: `{\"agentPoolNames\":[\"agentpool1\",\"agentpool2\",...]}` Since `agentPoolNames` support multiple values, its values must be specified with array notation. When the filter is either empty or not provided, the list returns all agent pools for the project.
pageSize <integer> The list page size. The max allowed value is `256`."
  ([projectId] (projects-agentPools-list projectId nil))
  ([projectId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://storagetransfer.googleapis.com/v1/projects/{+projectId}/agentPools",
       :uri-template-args {"projectId" projectId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-agentPools-delete
  "Deletes an agent pool.
https://cloud.google.com/storage-transfer/docs/overview/v1/reference/rest/v1/projects/agentPools/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://storagetransfer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
