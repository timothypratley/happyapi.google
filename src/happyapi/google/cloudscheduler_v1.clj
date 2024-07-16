(ns happyapi.google.cloudscheduler-v1
  "Cloud Scheduler API
Creates and manages jobs run on a regular recurring schedule.
See: https://cloud.google.com/scheduler/"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/scheduler/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://cloudscheduler.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/scheduler/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://cloudscheduler.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobs-list
  "Lists jobs.
https://cloud.google.com/scheduler/v1/reference/rest/v1/projects/locations/jobs/list

parent <> 

optional:
pageSize <integer> Requested page size. The maximum page size is 500. If unspecified, the page size will be the maximum. Fewer jobs than requested might be returned, even if more jobs exist; use next_page_token to determine if more jobs exist."
  ([parent] (projects-locations-jobs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://cloudscheduler.googleapis.com/v1/{+parent}/jobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-jobs-get
  "Gets a job.
https://cloud.google.com/scheduler/v1/reference/rest/v1/projects/locations/jobs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://cloudscheduler.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobs-create
  "Creates a job.
https://cloud.google.com/scheduler/v1/reference/rest/v1/projects/locations/jobs/create

parent <> 
Job:
Job"
  [parent Job]
  (client/api-request
    {:method :post,
     :uri-template
     "https://cloudscheduler.googleapis.com/v1/{+parent}/jobs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Job}))

(defn projects-locations-jobs-patch
  "Updates a job. If successful, the updated Job is returned. If the job does not exist, `NOT_FOUND` is returned. If UpdateJob does not successfully return, it is possible for the job to be in an Job.State.UPDATE_FAILED state. A job in this state may not be executed. If this happens, retry the UpdateJob request until a successful response is received.
https://cloud.google.com/scheduler/v1/reference/rest/v1/projects/locations/jobs/patch

name <> 
Job:
Job

optional:
updateMask <string> A mask used to specify which fields of the job are being updated."
  ([name Job] (projects-locations-jobs-patch name Job nil))
  ([name Job optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://cloudscheduler.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Job})))

(defn projects-locations-jobs-delete
  "Deletes a job.
https://cloud.google.com/scheduler/v1/reference/rest/v1/projects/locations/jobs/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://cloudscheduler.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobs-pause
  "Pauses a job. If a job is paused then the system will stop executing the job until it is re-enabled via ResumeJob. The state of the job is stored in state; if paused it will be set to Job.State.PAUSED. A job must be in Job.State.ENABLED to be paused.
https://cloud.google.com/scheduler/v1/reference/rest/v1/projects/locations/jobs/pause

name <> 
PauseJobRequest:
PauseJobRequest"
  [name PauseJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://cloudscheduler.googleapis.com/v1/{+name}:pause",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body PauseJobRequest}))

(defn projects-locations-jobs-resume
  "Resume a job. This method reenables a job after it has been Job.State.PAUSED. The state of a job is stored in Job.state; after calling this method it will be set to Job.State.ENABLED. A job must be in Job.State.PAUSED to be resumed.
https://cloud.google.com/scheduler/v1/reference/rest/v1/projects/locations/jobs/resume

name <> 
ResumeJobRequest:
ResumeJobRequest"
  [name ResumeJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://cloudscheduler.googleapis.com/v1/{+name}:resume",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ResumeJobRequest}))

(defn projects-locations-jobs-run
  "Forces a job to run now. When this method is called, Cloud Scheduler will dispatch the job, even if the job is already running.
https://cloud.google.com/scheduler/v1/reference/rest/v1/projects/locations/jobs/run

name <> 
RunJobRequest:
RunJobRequest"
  [name RunJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://cloudscheduler.googleapis.com/v1/{+name}:run",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RunJobRequest}))
