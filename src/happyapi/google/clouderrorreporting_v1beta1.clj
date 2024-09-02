(ns happyapi.google.clouderrorreporting-v1beta1
  "Error Reporting API
Groups and counts similar errors from cloud services and applications, reports new errors, and provides access to error groups and their associated errors. 
See: https://cloud.google.com/error-reporting/"
  (:require [happyapi.providers.google :as client]))

(defn projects-deleteEvents
  "Deletes all error events of a given project.
https://cloud.google.com/error-reporting/v1beta1/reference/rest/v1beta1/projects/deleteEvents

projectName <> "
  [projectName]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://clouderrorreporting.googleapis.com/v1beta1/{+projectName}/events",
     :uri-template-args {"projectName" projectName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-groups-get
  "Get the specified group.
https://cloud.google.com/error-reporting/v1beta1/reference/rest/v1beta1/projects/groups/get

groupName <> "
  [groupName]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://clouderrorreporting.googleapis.com/v1beta1/{+groupName}",
     :uri-template-args {"groupName" groupName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-groups-update
  "Replace the data for the specified group. Fails if the group does not exist.
https://cloud.google.com/error-reporting/v1beta1/reference/rest/v1beta1/projects/groups/update

name <> 
ErrorGroup:
ErrorGroup"
  [name ErrorGroup]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://clouderrorreporting.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ErrorGroup}))

(defn projects-groupStats-list
  "Lists the specified groups.
https://cloud.google.com/error-reporting/v1beta1/reference/rest/v1beta1/projects/groupStats/list

projectName <> 

optional:
groupId <string> Optional. List all ErrorGroupStats with these IDs. The `group_id` is a unique identifier for a particular error group. The identifier is derived from key parts of the error-log content and is treated as Service Data. For information about how Service Data is handled, see [Google Cloud Privacy Notice] (https://cloud.google.com/terms/cloud-privacy-notice).
alignment <string> Optional. The alignment of the timed counts to be returned. Default is `ALIGNMENT_EQUAL_AT_END`.
pageSize <integer> Optional. The maximum number of results to return per response. Default is 20.
timeRange.period <string> Restricts the query to the specified time range.
alignmentTime <string> Optional. Time where the timed counts shall be aligned if rounded alignment is chosen. Default is 00:00 UTC.
serviceFilter.service <string> Optional. The exact value to match against [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
order <string> Optional. The sort order in which the results are returned. Default is `COUNT_DESC`.
serviceFilter.resourceType <string> Optional. The exact value to match against [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
serviceFilter.version <string> Optional. The exact value to match against [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
timedCountDuration <string> Optional. The preferred duration for a single returned TimedCount. If not set, no timed counts are returned."
  ([projectName] (projects-groupStats-list projectName nil))
  ([projectName optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://clouderrorreporting.googleapis.com/v1beta1/{+projectName}/groupStats",
       :uri-template-args {"projectName" projectName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-events-list
  "Lists the specified events.
https://cloud.google.com/error-reporting/v1beta1/reference/rest/v1beta1/projects/events/list

projectName <> 

optional:
groupId <string> Required. The group for which events shall be returned. The `group_id` is a unique identifier for a particular error group. The identifier is derived from key parts of the error-log content and is treated as Service Data. For information about how Service Data is handled, see [Google Cloud Privacy Notice](https://cloud.google.com/terms/cloud-privacy-notice).
serviceFilter.service <string> Optional. The exact value to match against [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
serviceFilter.version <string> Optional. The exact value to match against [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
serviceFilter.resourceType <string> Optional. The exact value to match against [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
timeRange.period <string> Restricts the query to the specified time range.
pageSize <integer> Optional. The maximum number of results to return per response."
  ([projectName] (projects-events-list projectName nil))
  ([projectName optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://clouderrorreporting.googleapis.com/v1beta1/{+projectName}/events",
       :uri-template-args {"projectName" projectName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-events-report
  "Report an individual error event and record the event to a log. This endpoint accepts **either** an OAuth token, **or** an [API key](https://support.google.com/cloud/answer/6158862) for authentication. To use an API key, append it to the URL as the value of a `key` parameter. For example: `POST https://clouderrorreporting.googleapis.com/v1beta1/{projectName}/events:report?key=123ABC456` **Note:** [Error Reporting] (https://cloud.google.com/error-reporting) is a service built on Cloud Logging and can analyze log entries when all of the following are true: * Customer-managed encryption keys (CMEK) are disabled on the log bucket. * The log bucket satisfies one of the following: * The log bucket is stored in the same project where the logs originated. * The logs were routed to a project, and then that project stored those logs in a log bucket that it owns.
https://cloud.google.com/error-reporting/v1beta1/reference/rest/v1beta1/projects/events/report

projectName <> 
ReportedErrorEvent:
ReportedErrorEvent"
  [projectName ReportedErrorEvent]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://clouderrorreporting.googleapis.com/v1beta1/{+projectName}/events:report",
     :uri-template-args {"projectName" projectName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ReportedErrorEvent}))

(defn projects-locations-deleteEvents
  "Deletes all error events of a given project.
https://cloud.google.com/error-reporting/v1beta1/reference/rest/v1beta1/projects/locations/deleteEvents

projectName <> "
  [projectName]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://clouderrorreporting.googleapis.com/v1beta1/{+projectName}/events",
     :uri-template-args {"projectName" projectName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-groups-get
  "Get the specified group.
https://cloud.google.com/error-reporting/v1beta1/reference/rest/v1beta1/projects/locations/groups/get

groupName <> "
  [groupName]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://clouderrorreporting.googleapis.com/v1beta1/{+groupName}",
     :uri-template-args {"groupName" groupName},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-groups-update
  "Replace the data for the specified group. Fails if the group does not exist.
https://cloud.google.com/error-reporting/v1beta1/reference/rest/v1beta1/projects/locations/groups/update

name <> 
ErrorGroup:
ErrorGroup"
  [name ErrorGroup]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://clouderrorreporting.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ErrorGroup}))

(defn projects-locations-groupStats-list
  "Lists the specified groups.
https://cloud.google.com/error-reporting/v1beta1/reference/rest/v1beta1/projects/locations/groupStats/list

projectName <> 

optional:
groupId <string> Optional. List all ErrorGroupStats with these IDs. The `group_id` is a unique identifier for a particular error group. The identifier is derived from key parts of the error-log content and is treated as Service Data. For information about how Service Data is handled, see [Google Cloud Privacy Notice] (https://cloud.google.com/terms/cloud-privacy-notice).
alignment <string> Optional. The alignment of the timed counts to be returned. Default is `ALIGNMENT_EQUAL_AT_END`.
pageSize <integer> Optional. The maximum number of results to return per response. Default is 20.
timeRange.period <string> Restricts the query to the specified time range.
alignmentTime <string> Optional. Time where the timed counts shall be aligned if rounded alignment is chosen. Default is 00:00 UTC.
serviceFilter.service <string> Optional. The exact value to match against [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
order <string> Optional. The sort order in which the results are returned. Default is `COUNT_DESC`.
serviceFilter.resourceType <string> Optional. The exact value to match against [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
serviceFilter.version <string> Optional. The exact value to match against [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
timedCountDuration <string> Optional. The preferred duration for a single returned TimedCount. If not set, no timed counts are returned."
  ([projectName] (projects-locations-groupStats-list projectName nil))
  ([projectName optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://clouderrorreporting.googleapis.com/v1beta1/{+projectName}/groupStats",
       :uri-template-args {"projectName" projectName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-events-list
  "Lists the specified events.
https://cloud.google.com/error-reporting/v1beta1/reference/rest/v1beta1/projects/locations/events/list

projectName <> 

optional:
groupId <string> Required. The group for which events shall be returned. The `group_id` is a unique identifier for a particular error group. The identifier is derived from key parts of the error-log content and is treated as Service Data. For information about how Service Data is handled, see [Google Cloud Privacy Notice](https://cloud.google.com/terms/cloud-privacy-notice).
serviceFilter.service <string> Optional. The exact value to match against [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
serviceFilter.version <string> Optional. The exact value to match against [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
serviceFilter.resourceType <string> Optional. The exact value to match against [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
timeRange.period <string> Restricts the query to the specified time range.
pageSize <integer> Optional. The maximum number of results to return per response."
  ([projectName] (projects-locations-events-list projectName nil))
  ([projectName optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://clouderrorreporting.googleapis.com/v1beta1/{+projectName}/events",
       :uri-template-args {"projectName" projectName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
