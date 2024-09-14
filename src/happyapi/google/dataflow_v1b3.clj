(ns happyapi.google.dataflow-v1b3
  "Dataflow API
Manages Google Cloud Dataflow projects on Google Cloud Platform.
See: https://cloud.google.com/products/dataflow")

(defn projects-deleteSnapshots
  "Deletes a snapshot.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/deleteSnapshots

projectId <> 

optional:
snapshotId <string> The ID of the snapshot.
location <string> The location that contains this snapshot."
  ([projectId] (projects-deleteSnapshots projectId nil))
  ([projectId optional]
    {:method :delete,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/snapshots",
     :uri-template-args {"projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-workerMessages
  "Send a worker_message to the service.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/workerMessages

projectId <> 
SendWorkerMessagesRequest:
SendWorkerMessagesRequest"
  [projectId SendWorkerMessagesRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/WorkerMessages",
   :uri-template-args {"projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body SendWorkerMessagesRequest})

(defn projects-snapshots-get
  "Gets information about a snapshot.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/snapshots/get

projectId <> 
snapshotId <> 

optional:
location <string> The location that contains this snapshot."
  ([projectId snapshotId]
    (projects-snapshots-get projectId snapshotId nil))
  ([projectId snapshotId optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/snapshots/{snapshotId}",
     :uri-template-args
     {"projectId" projectId, "snapshotId" snapshotId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-snapshots-list
  "Lists snapshots.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/snapshots/list

projectId <> 

optional:
jobId <string> If specified, list snapshots created from this job.
location <string> The location to list snapshots in."
  ([projectId] (projects-snapshots-list projectId nil))
  ([projectId optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/snapshots",
     :uri-template-args {"projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-jobs-create
  "Creates a Cloud Dataflow job. To create a job, we recommend using `projects.locations.jobs.create` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.create` is not recommended, as your job will always start in `us-central1`. Do not enter confidential information when you supply string values using the API.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/jobs/create

projectId <> 
Job:
Job

optional:
view <string> The level of information requested in response.
replaceJobId <string> Deprecated. This field is now in the Job message.
location <string> The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job."
  ([projectId Job] (projects-jobs-create projectId Job nil))
  ([projectId Job optional]
    {:method :post,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/jobs",
     :uri-template-args {"projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"],
     :body Job}))

(defn projects-jobs-get
  "Gets the state of the specified Cloud Dataflow job. To get the state of a job, we recommend using `projects.locations.jobs.get` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.get` is not recommended, as you can only get the state of jobs that are running in `us-central1`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/jobs/get

projectId <> 
jobId <> 

optional:
view <string> The level of information requested in response.
location <string> The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job."
  ([projectId jobId] (projects-jobs-get projectId jobId nil))
  ([projectId jobId optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/jobs/{jobId}",
     :uri-template-args {"projectId" projectId, "jobId" jobId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-jobs-update
  "Updates the state of an existing Cloud Dataflow job. To update the state of an existing job, we recommend using `projects.locations.jobs.update` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.update` is not recommended, as you can only update the state of jobs that are running in `us-central1`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/jobs/update

projectId <> 
jobId <> 
Job:
Job

optional:
location <string> The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
updateMask <string> The list of fields to update relative to Job. If empty, only RequestedJobState will be considered for update. If the FieldMask is not empty and RequestedJobState is none/empty, The fields specified in the update mask will be the only ones considered for update. If both RequestedJobState and update_mask are specified, an error will be returned as we cannot update both state and mask."
  ([projectId jobId Job]
    (projects-jobs-update projectId jobId Job nil))
  ([projectId jobId Job optional]
    {:method :put,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/jobs/{jobId}",
     :uri-template-args {"projectId" projectId, "jobId" jobId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"],
     :body Job}))

(defn projects-jobs-list
  "List the jobs of a project. To list the jobs of a project in a region, we recommend using `projects.locations.jobs.list` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). To list the all jobs across all regions, use `projects.jobs.aggregated`. Using `projects.jobs.list` is not recommended, because you can only get the list of jobs that are running in `us-central1`. `projects.locations.jobs.list` and `projects.jobs.list` support filtering the list of jobs by name. Filtering by name isn't supported by `projects.jobs.aggregated`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/jobs/list

projectId <> 

optional:
filter <string> The kind of filter to use.
view <string> Deprecated. ListJobs always returns summaries now. Use GetJob for other JobViews.
pageSize <integer> If there are many jobs, limit response to at most this many. The actual number of jobs returned will be the lesser of max_responses and an unspecified server-defined limit.
location <string> The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
name <string> Optional. The job name."
  ([projectId] (projects-jobs-list projectId nil))
  ([projectId optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/jobs",
     :uri-template-args {"projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-jobs-aggregated
  "List the jobs of a project across all regions. **Note:** This method doesn't support filtering the list of jobs by name.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/jobs/aggregated

projectId <> 

optional:
filter <string> The kind of filter to use.
view <string> Deprecated. ListJobs always returns summaries now. Use GetJob for other JobViews.
pageSize <integer> If there are many jobs, limit response to at most this many. The actual number of jobs returned will be the lesser of max_responses and an unspecified server-defined limit.
location <string> The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
name <string> Optional. The job name."
  ([projectId] (projects-jobs-aggregated projectId nil))
  ([projectId optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/jobs:aggregated",
     :uri-template-args {"projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-jobs-snapshot
  "Snapshot the state of a streaming job.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/jobs/snapshot

projectId <> 
jobId <> 
SnapshotJobRequest:
SnapshotJobRequest"
  [projectId jobId SnapshotJobRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/jobs/{jobId}:snapshot",
   :uri-template-args {"projectId" projectId, "jobId" jobId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body SnapshotJobRequest})

(defn projects-jobs-getMetrics
  "Request the job status. To request the status of a job, we recommend using `projects.locations.jobs.getMetrics` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.getMetrics` is not recommended, as you can only request the status of jobs that are running in `us-central1`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/jobs/getMetrics

projectId <> 
jobId <> 

optional:
startTime <string> Return only metric data that has changed since this time. Default is to return all information about all metrics for the job.
location <string> The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id."
  ([projectId jobId] (projects-jobs-getMetrics projectId jobId nil))
  ([projectId jobId optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/jobs/{jobId}/metrics",
     :uri-template-args {"projectId" projectId, "jobId" jobId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-jobs-debug-getConfig
  "Get encoded debug configuration for component. Not cacheable.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/jobs/debug/getConfig

projectId <> 
jobId <> 
GetDebugConfigRequest:
GetDebugConfigRequest"
  [projectId jobId GetDebugConfigRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/jobs/{jobId}/debug/getConfig",
   :uri-template-args {"projectId" projectId, "jobId" jobId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body GetDebugConfigRequest})

(defn projects-jobs-debug-sendCapture
  "Send encoded debug capture data for component.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/jobs/debug/sendCapture

projectId <> 
jobId <> 
SendDebugCaptureRequest:
SendDebugCaptureRequest"
  [projectId jobId SendDebugCaptureRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/jobs/{jobId}/debug/sendCapture",
   :uri-template-args {"projectId" projectId, "jobId" jobId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body SendDebugCaptureRequest})

(defn projects-jobs-messages-list
  "Request the job status. To request the status of a job, we recommend using `projects.locations.jobs.messages.list` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.messages.list` is not recommended, as you can only request the status of jobs that are running in `us-central1`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/jobs/messages/list

projectId <> 
jobId <> 

optional:
minimumImportance <string> Filter to only get messages with importance >= level
pageSize <integer> If specified, determines the maximum number of messages to return. If unspecified, the service may choose an appropriate default, or may return an arbitrarily large number of results.
startTime <string> If specified, return only messages with timestamps >= start_time. The default is the job creation time (i.e. beginning of messages).
endTime <string> Return only messages with timestamps < end_time. The default is now (i.e. return up to the latest messages available).
location <string> The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id."
  ([projectId jobId] (projects-jobs-messages-list projectId jobId nil))
  ([projectId jobId optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/jobs/{jobId}/messages",
     :uri-template-args {"projectId" projectId, "jobId" jobId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-jobs-workItems-reportStatus
  "Reports the status of dataflow WorkItems leased by a worker.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/jobs/workItems/reportStatus

projectId <> 
jobId <> 
ReportWorkItemStatusRequest:
ReportWorkItemStatusRequest"
  [projectId jobId ReportWorkItemStatusRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/jobs/{jobId}/workItems:reportStatus",
   :uri-template-args {"projectId" projectId, "jobId" jobId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body ReportWorkItemStatusRequest})

(defn projects-jobs-workItems-lease
  "Leases a dataflow WorkItem to run.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/jobs/workItems/lease

projectId <> 
jobId <> 
LeaseWorkItemRequest:
LeaseWorkItemRequest"
  [projectId jobId LeaseWorkItemRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/jobs/{jobId}/workItems:lease",
   :uri-template-args {"projectId" projectId, "jobId" jobId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body LeaseWorkItemRequest})

(defn projects-templates-create
  "Creates a Cloud Dataflow job from a template. Do not enter confidential information when you supply string values using the API. To create a job, we recommend using `projects.locations.templates.create` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.templates.create` is not recommended, because your job will always start in `us-central1`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/templates/create

projectId <> 
CreateJobFromTemplateRequest:
CreateJobFromTemplateRequest"
  [projectId CreateJobFromTemplateRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/templates",
   :uri-template-args {"projectId" projectId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body CreateJobFromTemplateRequest})

(defn projects-templates-launch
  "Launches a template. To launch a template, we recommend using `projects.locations.templates.launch` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.templates.launch` is not recommended, because jobs launched from the template will always start in `us-central1`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/templates/launch

projectId <> 
LaunchTemplateParameters:
LaunchTemplateParameters

optional:
validateOnly <boolean> If true, the request is validated but not actually executed. Defaults to false.
gcsPath <string> A Cloud Storage path to the template to use to create the job. Must be valid Cloud Storage URL, beginning with `gs://`.
dynamicTemplate.gcsPath <string> Path to the dynamic template specification file on Cloud Storage. The file must be a JSON serialized `DynamicTemplateFileSpec` object.
dynamicTemplate.stagingLocation <string> Cloud Storage path for staging dependencies. Must be a valid Cloud Storage URL, beginning with `gs://`.
location <string> The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request."
  ([projectId LaunchTemplateParameters]
    (projects-templates-launch projectId LaunchTemplateParameters nil))
  ([projectId LaunchTemplateParameters optional]
    {:method :post,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/templates:launch",
     :uri-template-args {"projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"],
     :body LaunchTemplateParameters}))

(defn projects-templates-get
  "Get the template associated with a template. To get the template, we recommend using `projects.locations.templates.get` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.templates.get` is not recommended, because only templates that are running in `us-central1` are retrieved.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/templates/get

projectId <> 

optional:
gcsPath <string> Required. A Cloud Storage path to the template from which to create the job. Must be valid Cloud Storage URL, beginning with 'gs://'.
view <string> The view to retrieve. Defaults to METADATA_ONLY.
location <string> The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request."
  ([projectId] (projects-templates-get projectId nil))
  ([projectId optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/templates:get",
     :uri-template-args {"projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-locations-workerMessages
  "Send a worker_message to the service.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/workerMessages

projectId <> 
location <> 
SendWorkerMessagesRequest:
SendWorkerMessagesRequest"
  [projectId location SendWorkerMessagesRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/WorkerMessages",
   :uri-template-args {"projectId" projectId, "location" location},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body SendWorkerMessagesRequest})

(defn projects-locations-snapshots-get
  "Gets information about a snapshot.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/snapshots/get

projectId <> 
location <> 
snapshotId <> "
  [projectId location snapshotId]
  {:method :get,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/snapshots/{snapshotId}",
   :uri-template-args
   {"projectId" projectId,
    "location" location,
    "snapshotId" snapshotId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"]})

(defn projects-locations-snapshots-delete
  "Deletes a snapshot.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/snapshots/delete

projectId <> 
location <> 
snapshotId <> "
  [projectId location snapshotId]
  {:method :delete,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/snapshots/{snapshotId}",
   :uri-template-args
   {"projectId" projectId,
    "location" location,
    "snapshotId" snapshotId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"]})

(defn projects-locations-snapshots-list
  "Lists snapshots.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/snapshots/list

projectId <> 
location <> 

optional:
jobId <string> If specified, list snapshots created from this job."
  ([projectId location]
    (projects-locations-snapshots-list projectId location nil))
  ([projectId location optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/snapshots",
     :uri-template-args {"projectId" projectId, "location" location},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-locations-jobs-create
  "Creates a Cloud Dataflow job. To create a job, we recommend using `projects.locations.jobs.create` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.create` is not recommended, as your job will always start in `us-central1`. Do not enter confidential information when you supply string values using the API.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/create

projectId <> 
location <> 
Job:
Job

optional:
view <string> The level of information requested in response.
replaceJobId <string> Deprecated. This field is now in the Job message."
  ([projectId location Job]
    (projects-locations-jobs-create projectId location Job nil))
  ([projectId location Job optional]
    {:method :post,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs",
     :uri-template-args {"projectId" projectId, "location" location},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"],
     :body Job}))

(defn projects-locations-jobs-get
  "Gets the state of the specified Cloud Dataflow job. To get the state of a job, we recommend using `projects.locations.jobs.get` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.get` is not recommended, as you can only get the state of jobs that are running in `us-central1`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/get

projectId <> 
location <> 
jobId <> 

optional:
view <string> The level of information requested in response."
  ([projectId location jobId]
    (projects-locations-jobs-get projectId location jobId nil))
  ([projectId location jobId optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs/{jobId}",
     :uri-template-args
     {"projectId" projectId, "location" location, "jobId" jobId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-locations-jobs-update
  "Updates the state of an existing Cloud Dataflow job. To update the state of an existing job, we recommend using `projects.locations.jobs.update` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.update` is not recommended, as you can only update the state of jobs that are running in `us-central1`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/update

projectId <> 
location <> 
jobId <> 
Job:
Job

optional:
updateMask <string> The list of fields to update relative to Job. If empty, only RequestedJobState will be considered for update. If the FieldMask is not empty and RequestedJobState is none/empty, The fields specified in the update mask will be the only ones considered for update. If both RequestedJobState and update_mask are specified, an error will be returned as we cannot update both state and mask."
  ([projectId location jobId Job]
    (projects-locations-jobs-update projectId location jobId Job nil))
  ([projectId location jobId Job optional]
    {:method :put,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs/{jobId}",
     :uri-template-args
     {"projectId" projectId, "location" location, "jobId" jobId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"],
     :body Job}))

(defn projects-locations-jobs-list
  "List the jobs of a project. To list the jobs of a project in a region, we recommend using `projects.locations.jobs.list` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). To list the all jobs across all regions, use `projects.jobs.aggregated`. Using `projects.jobs.list` is not recommended, because you can only get the list of jobs that are running in `us-central1`. `projects.locations.jobs.list` and `projects.jobs.list` support filtering the list of jobs by name. Filtering by name isn't supported by `projects.jobs.aggregated`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/list

projectId <> 
location <> 

optional:
filter <string> The kind of filter to use.
view <string> Deprecated. ListJobs always returns summaries now. Use GetJob for other JobViews.
pageSize <integer> If there are many jobs, limit response to at most this many. The actual number of jobs returned will be the lesser of max_responses and an unspecified server-defined limit.
name <string> Optional. The job name."
  ([projectId location]
    (projects-locations-jobs-list projectId location nil))
  ([projectId location optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs",
     :uri-template-args {"projectId" projectId, "location" location},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-locations-jobs-snapshot
  "Snapshot the state of a streaming job.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/snapshot

projectId <> 
location <> 
jobId <> 
SnapshotJobRequest:
SnapshotJobRequest"
  [projectId location jobId SnapshotJobRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs/{jobId}:snapshot",
   :uri-template-args
   {"projectId" projectId, "location" location, "jobId" jobId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body SnapshotJobRequest})

(defn projects-locations-jobs-getMetrics
  "Request the job status. To request the status of a job, we recommend using `projects.locations.jobs.getMetrics` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.getMetrics` is not recommended, as you can only request the status of jobs that are running in `us-central1`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/getMetrics

projectId <> 
location <> 
jobId <> 

optional:
startTime <string> Return only metric data that has changed since this time. Default is to return all information about all metrics for the job."
  ([projectId location jobId]
    (projects-locations-jobs-getMetrics projectId location jobId nil))
  ([projectId location jobId optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs/{jobId}/metrics",
     :uri-template-args
     {"projectId" projectId, "location" location, "jobId" jobId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-locations-jobs-getExecutionDetails
  "Request detailed information about the execution status of the job. EXPERIMENTAL. This API is subject to change or removal without notice.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/getExecutionDetails

projectId <> 
location <> 
jobId <> 

optional:
pageSize <integer> If specified, determines the maximum number of stages to return. If unspecified, the service may choose an appropriate default, or may return an arbitrarily large number of results."
  ([projectId location jobId]
    (projects-locations-jobs-getExecutionDetails
      projectId
      location
      jobId
      nil))
  ([projectId location jobId optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs/{jobId}/executionDetails",
     :uri-template-args
     {"projectId" projectId, "location" location, "jobId" jobId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-locations-jobs-debug-getConfig
  "Get encoded debug configuration for component. Not cacheable.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/debug/getConfig

projectId <> 
location <> 
jobId <> 
GetDebugConfigRequest:
GetDebugConfigRequest"
  [projectId location jobId GetDebugConfigRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs/{jobId}/debug/getConfig",
   :uri-template-args
   {"projectId" projectId, "location" location, "jobId" jobId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body GetDebugConfigRequest})

(defn projects-locations-jobs-debug-sendCapture
  "Send encoded debug capture data for component.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/debug/sendCapture

projectId <> 
location <> 
jobId <> 
SendDebugCaptureRequest:
SendDebugCaptureRequest"
  [projectId location jobId SendDebugCaptureRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs/{jobId}/debug/sendCapture",
   :uri-template-args
   {"projectId" projectId, "location" location, "jobId" jobId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body SendDebugCaptureRequest})

(defn projects-locations-jobs-snapshots-list
  "Lists snapshots.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/snapshots/list

projectId <> 
location <> 
jobId <> "
  [projectId location jobId]
  {:method :get,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs/{jobId}/snapshots",
   :uri-template-args
   {"projectId" projectId, "location" location, "jobId" jobId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"]})

(defn projects-locations-jobs-messages-list
  "Request the job status. To request the status of a job, we recommend using `projects.locations.jobs.messages.list` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.messages.list` is not recommended, as you can only request the status of jobs that are running in `us-central1`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/messages/list

projectId <> 
location <> 
jobId <> 

optional:
minimumImportance <string> Filter to only get messages with importance >= level
pageSize <integer> If specified, determines the maximum number of messages to return. If unspecified, the service may choose an appropriate default, or may return an arbitrarily large number of results.
startTime <string> If specified, return only messages with timestamps >= start_time. The default is the job creation time (i.e. beginning of messages).
endTime <string> Return only messages with timestamps < end_time. The default is now (i.e. return up to the latest messages available)."
  ([projectId location jobId]
    (projects-locations-jobs-messages-list
      projectId
      location
      jobId
      nil))
  ([projectId location jobId optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs/{jobId}/messages",
     :uri-template-args
     {"projectId" projectId, "location" location, "jobId" jobId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-locations-jobs-stages-getExecutionDetails
  "Request detailed information about the execution status of a stage of the job. EXPERIMENTAL. This API is subject to change or removal without notice.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/stages/getExecutionDetails

projectId <> 
location <> 
jobId <> 
stageId <> 

optional:
pageSize <integer> If specified, determines the maximum number of work items to return. If unspecified, the service may choose an appropriate default, or may return an arbitrarily large number of results.
startTime <string> Lower time bound of work items to include, by start time.
endTime <string> Upper time bound of work items to include, by start time."
  ([projectId location jobId stageId]
    (projects-locations-jobs-stages-getExecutionDetails
      projectId
      location
      jobId
      stageId
      nil))
  ([projectId location jobId stageId optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs/{jobId}/stages/{stageId}/executionDetails",
     :uri-template-args
     {"projectId" projectId,
      "location" location,
      "jobId" jobId,
      "stageId" stageId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-locations-jobs-workItems-reportStatus
  "Reports the status of dataflow WorkItems leased by a worker.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/workItems/reportStatus

projectId <> 
location <> 
jobId <> 
ReportWorkItemStatusRequest:
ReportWorkItemStatusRequest"
  [projectId location jobId ReportWorkItemStatusRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs/{jobId}/workItems:reportStatus",
   :uri-template-args
   {"projectId" projectId, "location" location, "jobId" jobId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body ReportWorkItemStatusRequest})

(defn projects-locations-jobs-workItems-lease
  "Leases a dataflow WorkItem to run.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/jobs/workItems/lease

projectId <> 
location <> 
jobId <> 
LeaseWorkItemRequest:
LeaseWorkItemRequest"
  [projectId location jobId LeaseWorkItemRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/jobs/{jobId}/workItems:lease",
   :uri-template-args
   {"projectId" projectId, "location" location, "jobId" jobId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body LeaseWorkItemRequest})

(defn projects-locations-templates-create
  "Creates a Cloud Dataflow job from a template. Do not enter confidential information when you supply string values using the API. To create a job, we recommend using `projects.locations.templates.create` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.templates.create` is not recommended, because your job will always start in `us-central1`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/templates/create

projectId <> 
location <> 
CreateJobFromTemplateRequest:
CreateJobFromTemplateRequest"
  [projectId location CreateJobFromTemplateRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/templates",
   :uri-template-args {"projectId" projectId, "location" location},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body CreateJobFromTemplateRequest})

(defn projects-locations-templates-launch
  "Launches a template. To launch a template, we recommend using `projects.locations.templates.launch` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.templates.launch` is not recommended, because jobs launched from the template will always start in `us-central1`.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/templates/launch

projectId <> 
location <> 
LaunchTemplateParameters:
LaunchTemplateParameters

optional:
validateOnly <boolean> If true, the request is validated but not actually executed. Defaults to false.
gcsPath <string> A Cloud Storage path to the template to use to create the job. Must be valid Cloud Storage URL, beginning with `gs://`.
dynamicTemplate.gcsPath <string> Path to the dynamic template specification file on Cloud Storage. The file must be a JSON serialized `DynamicTemplateFileSpec` object.
dynamicTemplate.stagingLocation <string> Cloud Storage path for staging dependencies. Must be a valid Cloud Storage URL, beginning with `gs://`."
  ([projectId location LaunchTemplateParameters]
    (projects-locations-templates-launch
      projectId
      location
      LaunchTemplateParameters
      nil))
  ([projectId location LaunchTemplateParameters optional]
    {:method :post,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/templates:launch",
     :uri-template-args {"projectId" projectId, "location" location},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"],
     :body LaunchTemplateParameters}))

(defn projects-locations-templates-get
  "Get the template associated with a template. To get the template, we recommend using `projects.locations.templates.get` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.templates.get` is not recommended, because only templates that are running in `us-central1` are retrieved.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/templates/get

projectId <> 
location <> 

optional:
gcsPath <string> Required. A Cloud Storage path to the template from which to create the job. Must be valid Cloud Storage URL, beginning with 'gs://'.
view <string> The view to retrieve. Defaults to METADATA_ONLY."
  ([projectId location]
    (projects-locations-templates-get projectId location nil))
  ([projectId location optional]
    {:method :get,
     :uri-template
     "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/templates:get",
     :uri-template-args {"projectId" projectId, "location" location},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/compute"]}))

(defn projects-locations-flexTemplates-launch
  "Launch a job with a FlexTemplate.
https://cloud.google.com/products/dataflow/v1b3/reference/rest/v1b3/projects/locations/flexTemplates/launch

projectId <> 
location <> 
LaunchFlexTemplateRequest:
LaunchFlexTemplateRequest"
  [projectId location LaunchFlexTemplateRequest]
  {:method :post,
   :uri-template
   "https://dataflow.googleapis.com/v1b3/projects/{projectId}/locations/{location}/flexTemplates:launch",
   :uri-template-args {"projectId" projectId, "location" location},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/compute"],
   :body LaunchFlexTemplateRequest})
