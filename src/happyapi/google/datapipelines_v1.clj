(ns happyapi.google.datapipelines-v1
  "Data pipelines API
Data Pipelines provides an interface for creating, updating, and managing recurring Data Analytics jobs.
See: https://cloud.google.com/dataflow/docs/guides/data-pipelines"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-pipelines-stop
  "Freezes pipeline execution permanently. If there's a corresponding scheduler entry, it's deleted, and the pipeline state is changed to \"ARCHIVED\". However, pipeline metadata is retained.
https://cloud.google.com/dataflow/docs/guides/data-pipelines/v1/reference/rest/v1/projects/locations/pipelines/stop

name <> 
GoogleCloudDatapipelinesV1StopPipelineRequest:
GoogleCloudDatapipelinesV1StopPipelineRequest"
  [name GoogleCloudDatapipelinesV1StopPipelineRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://datapipelines.googleapis.com/v1/{+name}:stop",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDatapipelinesV1StopPipelineRequest}))

(defn projects-locations-pipelines-patch
  "Updates a pipeline. If successful, the updated Pipeline is returned. Returns `NOT_FOUND` if the pipeline doesn't exist. If UpdatePipeline does not return successfully, you can retry the UpdatePipeline request until you receive a successful response.
https://cloud.google.com/dataflow/docs/guides/data-pipelines/v1/reference/rest/v1/projects/locations/pipelines/patch

name <> 
GoogleCloudDatapipelinesV1Pipeline:
GoogleCloudDatapipelinesV1Pipeline

optional:
updateMask <string> The list of fields to be updated."
  ([name GoogleCloudDatapipelinesV1Pipeline]
    (projects-locations-pipelines-patch
      name
      GoogleCloudDatapipelinesV1Pipeline
      nil))
  ([name GoogleCloudDatapipelinesV1Pipeline optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://datapipelines.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDatapipelinesV1Pipeline})))

(defn projects-locations-pipelines-run
  "Creates a job for the specified pipeline directly. You can use this method when the internal scheduler is not configured and you want to trigger the job directly or through an external system. Returns a \"NOT_FOUND\" error if the pipeline doesn't exist. Returns a \"FORBIDDEN\" error if the user doesn't have permission to access the pipeline or run jobs for the pipeline.
https://cloud.google.com/dataflow/docs/guides/data-pipelines/v1/reference/rest/v1/projects/locations/pipelines/run

name <> 
GoogleCloudDatapipelinesV1RunPipelineRequest:
GoogleCloudDatapipelinesV1RunPipelineRequest"
  [name GoogleCloudDatapipelinesV1RunPipelineRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://datapipelines.googleapis.com/v1/{+name}:run",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDatapipelinesV1RunPipelineRequest}))

(defn projects-locations-pipelines-get
  "Looks up a single pipeline. Returns a \"NOT_FOUND\" error if no such pipeline exists. Returns a \"FORBIDDEN\" error if the caller doesn't have permission to access it.
https://cloud.google.com/dataflow/docs/guides/data-pipelines/v1/reference/rest/v1/projects/locations/pipelines/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://datapipelines.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-pipelines-create
  "Creates a pipeline. For a batch pipeline, you can pass scheduler information. Data Pipelines uses the scheduler information to create an internal scheduler that runs jobs periodically. If the internal scheduler is not configured, you can use RunPipeline to run jobs.
https://cloud.google.com/dataflow/docs/guides/data-pipelines/v1/reference/rest/v1/projects/locations/pipelines/create

parent <> 
GoogleCloudDatapipelinesV1Pipeline:
GoogleCloudDatapipelinesV1Pipeline"
  [parent GoogleCloudDatapipelinesV1Pipeline]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://datapipelines.googleapis.com/v1/{+parent}/pipelines",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDatapipelinesV1Pipeline}))

(defn projects-locations-pipelines-list
  "Lists pipelines. Returns a \"FORBIDDEN\" error if the caller doesn't have permission to access it.
https://cloud.google.com/dataflow/docs/guides/data-pipelines/v1/reference/rest/v1/projects/locations/pipelines/list

parent <> 

optional:
filter <string> An expression for filtering the results of the request. If unspecified, all pipelines will be returned. Multiple filters can be applied and must be comma separated. Fields eligible for filtering are: + `type`: The type of the pipeline (streaming or batch). Allowed values are `ALL`, `BATCH`, and `STREAMING`. + `status`: The activity status of the pipeline. Allowed values are `ALL`, `ACTIVE`, `ARCHIVED`, and `PAUSED`. For example, to limit results to active batch processing pipelines: type:BATCH,status:ACTIVE
pageSize <integer> The maximum number of entities to return. The service may return fewer than this value, even if there are additional pages. If unspecified, the max limit is yet to be determined by the backend implementation."
  ([parent] (projects-locations-pipelines-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://datapipelines.googleapis.com/v1/{+parent}/pipelines",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-pipelines-delete
  "Deletes a pipeline. If a scheduler job is attached to the pipeline, it will be deleted.
https://cloud.google.com/dataflow/docs/guides/data-pipelines/v1/reference/rest/v1/projects/locations/pipelines/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://datapipelines.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-pipelines-jobs-list
  "Lists jobs for a given pipeline. Throws a \"FORBIDDEN\" error if the caller doesn't have permission to access it.
https://cloud.google.com/dataflow/docs/guides/data-pipelines/v1/reference/rest/v1/projects/locations/pipelines/jobs/list

parent <> 

optional:
pageSize <integer> The maximum number of entities to return. The service may return fewer than this value, even if there are additional pages. If unspecified, the max limit will be determined by the backend implementation."
  ([parent] (projects-locations-pipelines-jobs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://datapipelines.googleapis.com/v1/{+parent}/jobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
