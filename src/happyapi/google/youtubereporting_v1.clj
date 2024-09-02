(ns happyapi.google.youtubereporting-v1
  "YouTube Reporting API
Schedules reporting jobs containing your YouTube Analytics data and downloads the resulting bulk data reports in the form of CSV files.
See: https://developers.google.com/youtube/reporting/v1/reports/"
  (:require [happyapi.providers.google :as client]))

(defn media-download
  "Method for media download. Download is supported on the URI `/v1/media/{+name}?alt=media`.
https://developers.google.com/youtube/reporting/v1/reports/v1/reference/rest/v1/media/download

resourceName <> "
  [resourceName]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://youtubereporting.googleapis.com/v1/media/{+resourceName}",
     :uri-template-args {"resourceName" resourceName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/yt-analytics-monetary.readonly"
      "https://www.googleapis.com/auth/yt-analytics.readonly"]}))

(defn jobs-delete
  "Deletes a job.
https://developers.google.com/youtube/reporting/v1/reports/v1/reference/rest/v1/jobs/delete

jobId <> 

optional:
onBehalfOfContentOwner <string> The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel)."
  ([jobId] (jobs-delete jobId nil))
  ([jobId optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://youtubereporting.googleapis.com/v1/jobs/{jobId}",
       :uri-template-args {"jobId" jobId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/yt-analytics-monetary.readonly"
        "https://www.googleapis.com/auth/yt-analytics.readonly"]})))

(defn jobs-list
  "Lists jobs.
https://developers.google.com/youtube/reporting/v1/reports/v1/reference/rest/v1/jobs/list

optional:
pageSize <integer> Requested page size. Server may return fewer jobs than requested. If unspecified, server will pick an appropriate default.
includeSystemManaged <boolean> If set to true, also system-managed jobs will be returned; otherwise only user-created jobs will be returned. System-managed jobs can neither be modified nor deleted.
onBehalfOfContentOwner <string> The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel)."
  ([] (jobs-list nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://youtubereporting.googleapis.com/v1/jobs",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/yt-analytics-monetary.readonly"
        "https://www.googleapis.com/auth/yt-analytics.readonly"]})))

(defn jobs-get
  "Gets a job.
https://developers.google.com/youtube/reporting/v1/reports/v1/reference/rest/v1/jobs/get

jobId <> 

optional:
onBehalfOfContentOwner <string> The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel)."
  ([jobId] (jobs-get jobId nil))
  ([jobId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://youtubereporting.googleapis.com/v1/jobs/{jobId}",
       :uri-template-args {"jobId" jobId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/yt-analytics-monetary.readonly"
        "https://www.googleapis.com/auth/yt-analytics.readonly"]})))

(defn jobs-create
  "Creates a job and returns it.
https://developers.google.com/youtube/reporting/v1/reports/v1/reference/rest/v1/jobs/create

Job:
Job

optional:
onBehalfOfContentOwner <string> The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel)."
  ([Job] (jobs-create Job nil))
  ([Job optional]
    (client/*api-request*
      {:method :post,
       :uri-template "https://youtubereporting.googleapis.com/v1/jobs",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/yt-analytics-monetary.readonly"
        "https://www.googleapis.com/auth/yt-analytics.readonly"],
       :body Job})))

(defn jobs-reports-get
  "Gets the metadata of a specific report.
https://developers.google.com/youtube/reporting/v1/reports/v1/reference/rest/v1/jobs/reports/get

jobId <> 
reportId <> 

optional:
onBehalfOfContentOwner <string> The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel)."
  ([jobId reportId] (jobs-reports-get jobId reportId nil))
  ([jobId reportId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://youtubereporting.googleapis.com/v1/jobs/{jobId}/reports/{reportId}",
       :uri-template-args {"reportId" reportId, "jobId" jobId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/yt-analytics-monetary.readonly"
        "https://www.googleapis.com/auth/yt-analytics.readonly"]})))

(defn jobs-reports-list
  "Lists reports created by a specific job. Returns NOT_FOUND if the job does not exist.
https://developers.google.com/youtube/reporting/v1/reports/v1/reference/rest/v1/jobs/reports/list

jobId <> 

optional:
startTimeAtOrAfter <string> If set, only reports whose start time is greater than or equal the specified date/time are returned.
onBehalfOfContentOwner <string> The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
createdAfter <string> If set, only reports created after the specified date/time are returned.
pageSize <integer> Requested page size. Server may return fewer report types than requested. If unspecified, server will pick an appropriate default.
startTimeBefore <string> If set, only reports whose start time is smaller than the specified date/time are returned."
  ([jobId] (jobs-reports-list jobId nil))
  ([jobId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://youtubereporting.googleapis.com/v1/jobs/{jobId}/reports",
       :uri-template-args {"jobId" jobId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/yt-analytics-monetary.readonly"
        "https://www.googleapis.com/auth/yt-analytics.readonly"]})))

(defn reportTypes-list
  "Lists report types.
https://developers.google.com/youtube/reporting/v1/reports/v1/reference/rest/v1/reportTypes/list

optional:
pageSize <integer> Requested page size. Server may return fewer report types than requested. If unspecified, server will pick an appropriate default.
includeSystemManaged <boolean> If set to true, also system-managed report types will be returned; otherwise only the report types that can be used to create new reporting jobs will be returned.
onBehalfOfContentOwner <string> The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel)."
  ([] (reportTypes-list nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://youtubereporting.googleapis.com/v1/reportTypes",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/yt-analytics-monetary.readonly"
        "https://www.googleapis.com/auth/yt-analytics.readonly"]})))
