(ns happyapi.google.batch-v1
  "Batch API
An API to manage the running of Batch resources on Google Cloud Platform.
See: https://cloud.google.com/batch/"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/batch/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://batch.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/batch/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://batch.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/batch/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://batch.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/batch/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://batch.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/batch/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://batch.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/batch/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://batch.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-jobs-create
  "Create a Job.
https://cloud.google.com/batch/v1/reference/rest/v1/projects/locations/jobs/create

parent <> 
Job:
Job

optional:
jobId <string> ID used to uniquely identify the Job within its parent scope. This field should contain at most 63 characters and must start with lowercase characters. Only lowercase characters, numbers and '-' are accepted. The '-' character cannot be the first or the last one. A system generated ID will be used if the field is not set. The job.name field in the request will be ignored and the created resource name of the Job will be \"{parent}/jobs/{job_id}\".
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent Job] (projects-locations-jobs-create parent Job nil))
  ([parent Job optional]
    (client/*api-request*
      {:method :post,
       :uri-template "https://batch.googleapis.com/v1/{+parent}/jobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Job})))

(defn projects-locations-jobs-get
  "Get a Job specified by its resource name.
https://cloud.google.com/batch/v1/reference/rest/v1/projects/locations/jobs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://batch.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobs-delete
  "Delete a Job.
https://cloud.google.com/batch/v1/reference/rest/v1/projects/locations/jobs/delete

name <> 

optional:
reason <string> Optional. Reason for this deletion.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-jobs-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://batch.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-jobs-list
  "List all Jobs for a project within a region.
https://cloud.google.com/batch/v1/reference/rest/v1/projects/locations/jobs/list

parent <> 

optional:
filter <string> List filter.
orderBy <string> Optional. Sort results. Supported are \"name\", \"name desc\", \"create_time\", and \"create_time desc\".
pageSize <integer> Page size."
  ([parent] (projects-locations-jobs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://batch.googleapis.com/v1/{+parent}/jobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-jobs-taskGroups-tasks-get
  "Return a single Task.
https://cloud.google.com/batch/v1/reference/rest/v1/projects/locations/jobs/taskGroups/tasks/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://batch.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobs-taskGroups-tasks-list
  "List Tasks associated with a job.
https://cloud.google.com/batch/v1/reference/rest/v1/projects/locations/jobs/taskGroups/tasks/list

parent <> 

optional:
filter <string> Task filter, null filter matches all Tasks. Filter string should be of the format State=TaskStatus.State e.g. State=RUNNING
pageSize <integer> Page size."
  ([parent] (projects-locations-jobs-taskGroups-tasks-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://batch.googleapis.com/v1/{+parent}/tasks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-state-report
  "Report agent's state, e.g. agent status and tasks information
https://cloud.google.com/batch/v1/reference/rest/v1/projects/locations/state/report

parent <> 
ReportAgentStateRequest:
ReportAgentStateRequest"
  [parent ReportAgentStateRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://batch.googleapis.com/v1/{+parent}/state:report",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ReportAgentStateRequest}))
