(ns happyapi.google.transcoder-v1
  "Transcoder API
This API converts video files into formats suitable for consumer distribution. For more information, see the Transcoder API overview. 
See: https://cloud.google.com/transcoder/docs/")

(defn projects-locations-jobs-create
  "Creates a job in the specified region.
https://cloud.google.com/transcoder/docs/v1/reference/rest/v1/projects/locations/jobs/create

parent <> 
Job:
Job"
  [parent Job]
  {:method :post,
   :uri-template "https://transcoder.googleapis.com/v1/{+parent}/jobs",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body Job})

(defn projects-locations-jobs-list
  "Lists jobs in the specified region.
https://cloud.google.com/transcoder/docs/v1/reference/rest/v1/projects/locations/jobs/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return.
filter <string> The filter expression, following the syntax outlined in https://google.aip.dev/160.
orderBy <string> One or more fields to compare and use to sort the output. See https://google.aip.dev/132#ordering."
  ([parent] (projects-locations-jobs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://transcoder.googleapis.com/v1/{+parent}/jobs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobs-get
  "Returns the job data.
https://cloud.google.com/transcoder/docs/v1/reference/rest/v1/projects/locations/jobs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://transcoder.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-jobs-delete
  "Deletes a job.
https://cloud.google.com/transcoder/docs/v1/reference/rest/v1/projects/locations/jobs/delete

name <> 

optional:
allowMissing <boolean> If set to true, and the job is not found, the request will succeed but no action will be taken on the server."
  ([name] (projects-locations-jobs-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://transcoder.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobTemplates-create
  "Creates a job template in the specified region.
https://cloud.google.com/transcoder/docs/v1/reference/rest/v1/projects/locations/jobTemplates/create

parent <> 
JobTemplate:
JobTemplate

optional:
jobTemplateId <string> Required. The ID to use for the job template, which will become the final component of the job template's resource name. This value should be 4-63 characters, and valid characters must match the regular expression `a-zA-Z*`."
  ([parent JobTemplate]
    (projects-locations-jobTemplates-create parent JobTemplate nil))
  ([parent JobTemplate optional]
    {:method :post,
     :uri-template
     "https://transcoder.googleapis.com/v1/{+parent}/jobTemplates",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body JobTemplate}))

(defn projects-locations-jobTemplates-list
  "Lists job templates in the specified region.
https://cloud.google.com/transcoder/docs/v1/reference/rest/v1/projects/locations/jobTemplates/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return.
filter <string> The filter expression, following the syntax outlined in https://google.aip.dev/160.
orderBy <string> One or more fields to compare and use to sort the output. See https://google.aip.dev/132#ordering."
  ([parent] (projects-locations-jobTemplates-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://transcoder.googleapis.com/v1/{+parent}/jobTemplates",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobTemplates-get
  "Returns the job template data.
https://cloud.google.com/transcoder/docs/v1/reference/rest/v1/projects/locations/jobTemplates/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://transcoder.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-jobTemplates-delete
  "Deletes a job template.
https://cloud.google.com/transcoder/docs/v1/reference/rest/v1/projects/locations/jobTemplates/delete

name <> 

optional:
allowMissing <boolean> If set to true, and the job template is not found, the request will succeed but no action will be taken on the server."
  ([name] (projects-locations-jobTemplates-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://transcoder.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
