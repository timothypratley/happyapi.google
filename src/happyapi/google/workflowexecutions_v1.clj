(ns happyapi.google.workflowexecutions-v1
  "Workflow Executions API
Execute workflows created with Workflows API.
See: https://cloud.google.com/workflows")

(defn projects-locations-workflows-triggerPubsubExecution
  "Triggers a new execution using the latest revision of the given workflow by a Pub/Sub push notification.
https://cloud.google.com/workflows/v1/reference/rest/v1/projects/locations/workflows/triggerPubsubExecution

workflow <> 
TriggerPubsubExecutionRequest:
TriggerPubsubExecutionRequest"
  [workflow TriggerPubsubExecutionRequest]
  {:method :post,
   :uri-template
   "https://workflowexecutions.googleapis.com/v1/{+workflow}:triggerPubsubExecution",
   :uri-template-args {"workflow" workflow},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TriggerPubsubExecutionRequest})

(defn projects-locations-workflows-executions-list
  "Returns a list of executions which belong to the workflow with the given name. The method returns executions of all workflow revisions. Returned executions are ordered by their start time (newest first).
https://cloud.google.com/workflows/v1/reference/rest/v1/projects/locations/workflows/executions/list

parent <> 

optional:
pageSize <integer> Maximum number of executions to return per call. Max supported value depends on the selected Execution view: it's 1000 for BASIC and 100 for FULL. The default value used if the field is not specified is 100, regardless of the selected view. Values greater than the max value will be coerced down to it.
view <string> Optional. A view defining which fields should be filled in the returned executions. The API will default to the BASIC view.
filter <string> Optional. Filters applied to the `[Executions.ListExecutions]` results. The following fields are supported for filtering: `executionId`, `state`, `createTime`, `startTime`, `endTime`, `duration`, `workflowRevisionId`, `stepName`, and `label`. For details, see AIP-160. For more information, see Filter executions. For example, if you are using the Google APIs Explorer: `state=\"SUCCEEDED\"` or `startTime>\"2023-08-01\" AND state=\"FAILED\"`
orderBy <string> Optional. Comma-separated list of fields that specify the ordering applied to the `[Executions.ListExecutions]` results. By default the ordering is based on descending `createTime`. The following fields are supported for ordering: `executionId`, `state`, `createTime`, `startTime`, `endTime`, `duration`, and `workflowRevisionId`. For details, see AIP-132."
  ([parent] (projects-locations-workflows-executions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://workflowexecutions.googleapis.com/v1/{+parent}/executions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-workflows-executions-create
  "Creates a new execution using the latest revision of the given workflow. For more information, see Execute a workflow.
https://cloud.google.com/workflows/v1/reference/rest/v1/projects/locations/workflows/executions/create

parent <> 
Execution:
Execution"
  [parent Execution]
  {:method :post,
   :uri-template
   "https://workflowexecutions.googleapis.com/v1/{+parent}/executions",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body Execution})

(defn projects-locations-workflows-executions-get
  "Returns an execution of the given name.
https://cloud.google.com/workflows/v1/reference/rest/v1/projects/locations/workflows/executions/get

name <> 

optional:
view <string> Optional. A view defining which fields should be filled in the returned execution. The API will default to the FULL view."
  ([name] (projects-locations-workflows-executions-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://workflowexecutions.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-workflows-executions-cancel
  "Cancels an execution of the given name.
https://cloud.google.com/workflows/v1/reference/rest/v1/projects/locations/workflows/executions/cancel

name <> 
CancelExecutionRequest:
CancelExecutionRequest"
  [name CancelExecutionRequest]
  {:method :post,
   :uri-template
   "https://workflowexecutions.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CancelExecutionRequest})

(defn projects-locations-workflows-executions-exportData
  "Returns all metadata stored about an execution, excluding most data that is already accessible using other API methods.
https://cloud.google.com/workflows/v1/reference/rest/v1/projects/locations/workflows/executions/exportData

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://workflowexecutions.googleapis.com/v1/{+name}:exportData",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-workflows-executions-deleteExecutionHistory
  "Deletes all step entries for an execution.
https://cloud.google.com/workflows/v1/reference/rest/v1/projects/locations/workflows/executions/deleteExecutionHistory

name <> 
DeleteExecutionHistoryRequest:
DeleteExecutionHistoryRequest"
  [name DeleteExecutionHistoryRequest]
  {:method :post,
   :uri-template
   "https://workflowexecutions.googleapis.com/v1/{+name}:deleteExecutionHistory",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body DeleteExecutionHistoryRequest})

(defn projects-locations-workflows-executions-callbacks-list
  "Returns a list of active callbacks that belong to the execution with the given name. The returned callbacks are ordered by callback ID.
https://cloud.google.com/workflows/v1/reference/rest/v1/projects/locations/workflows/executions/callbacks/list

parent <> 

optional:
pageSize <integer> Maximum number of callbacks to return per call. The default value is 100 and is also the maximum value."
  ([parent]
    (projects-locations-workflows-executions-callbacks-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://workflowexecutions.googleapis.com/v1/{+parent}/callbacks",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-workflows-executions-stepEntries-list
  "Lists step entries for the corresponding workflow execution. Returned entries are ordered by their create_time.
https://cloud.google.com/workflows/v1/reference/rest/v1/projects/locations/workflows/executions/stepEntries/list

parent <> 

optional:
pageSize <integer> Optional. Number of step entries to return per call. The default max is 1000.
skip <integer> Optional. The number of step entries to skip. It can be used with or without a pageToken. If used with a pageToken, then it indicates the number of step entries to skip starting from the requested page.
filter <string> Optional. Filters applied to the `[StepEntries.ListStepEntries]` results. The following fields are supported for filtering: `entryId`, `createTime`, `updateTime`, `routine`, `step`, `stepType`, `parent`, `state`. For details, see AIP-160. For example, if you are using the Google APIs Explorer: `state=\"SUCCEEDED\"` or `createTime>\"2023-08-01\" AND state=\"FAILED\"`
orderBy <string> Optional. Comma-separated list of fields that specify the ordering applied to the `[StepEntries.ListStepEntries]` results. By default the ordering is based on ascending `entryId`. The following fields are supported for ordering: `entryId`, `createTime`, `updateTime`, `routine`, `step`, `stepType`, `state`. For details, see AIP-132.
view <string> Deprecated field."
  ([parent]
    (projects-locations-workflows-executions-stepEntries-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://workflowexecutions.googleapis.com/v1/{+parent}/stepEntries",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-workflows-executions-stepEntries-get
  "Gets a step entry.
https://cloud.google.com/workflows/v1/reference/rest/v1/projects/locations/workflows/executions/stepEntries/get

name <> 

optional:
view <string> Deprecated field."
  ([name]
    (projects-locations-workflows-executions-stepEntries-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://workflowexecutions.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
