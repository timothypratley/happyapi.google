(ns happyapi.google.doubleclickbidmanager-v2
  "DoubleClick Bid Manager API
DoubleClick Bid Manager API allows users to manage and create campaigns and reports.
See: https://developers.google.com/bid-manager/guides/getting-started-api"
  (:require [happyapi.providers.google :as client]))

(defn queries-create
  "Creates a query.
https://developers.google.com/bid-manager/guides/getting-started-api/v2/reference/rest/v2/queries/create

Query:
Query"
  [Query]
  (client/api-request
    {:method :post,
     :uri-template
     "https://doubleclickbidmanager.googleapis.com/v2/queries",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/doubleclickbidmanager"],
     :body Query}))

(defn queries-delete
  "Deletes a query as well as the associated reports.
https://developers.google.com/bid-manager/guides/getting-started-api/v2/reference/rest/v2/queries/delete

queryId <> "
  [queryId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://doubleclickbidmanager.googleapis.com/v2/queries/{queryId}",
     :uri-template-args {"queryId" queryId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/doubleclickbidmanager"]}))

(defn queries-get
  "Retrieves a query.
https://developers.google.com/bid-manager/guides/getting-started-api/v2/reference/rest/v2/queries/get

queryId <> "
  [queryId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://doubleclickbidmanager.googleapis.com/v2/queries/{queryId}",
     :uri-template-args {"queryId" queryId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/doubleclickbidmanager"]}))

(defn queries-list
  "Lists queries created by the current user.
https://developers.google.com/bid-manager/guides/getting-started-api/v2/reference/rest/v2/queries/list

optional:
pageSize <integer> Maximum number of results per page. Must be between `1` and `100`. Defaults to `100` if unspecified.
orderBy <string> Name of a field used to order results. The default sorting order is ascending. To specify descending order for a field, append a \" desc\" suffix. For example \"metadata.title desc\". Sorting is only supported for the following fields: * `queryId` * `metadata.title`"
  ([] (queries-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://doubleclickbidmanager.googleapis.com/v2/queries",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/doubleclickbidmanager"]})))

(defn queries-run
  "Runs a stored query to generate a report.
https://developers.google.com/bid-manager/guides/getting-started-api/v2/reference/rest/v2/queries/run

queryId <> 
RunQueryRequest:
RunQueryRequest

optional:
synchronous <boolean> Whether the query should be run synchronously. When true, this method will not return until the query has finished running. When false or not specified, this method will return immediately."
  ([queryId RunQueryRequest] (queries-run queryId RunQueryRequest nil))
  ([queryId RunQueryRequest optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://doubleclickbidmanager.googleapis.com/v2/queries/{queryId}:run",
       :uri-template-args {"queryId" queryId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/doubleclickbidmanager"],
       :body RunQueryRequest})))

(defn queries-reports-list
  "Lists reports associated with a query.
https://developers.google.com/bid-manager/guides/getting-started-api/v2/reference/rest/v2/queries/reports/list

queryId <> 

optional:
pageSize <integer> Maximum number of results per page. Must be between `1` and `100`. Defaults to `100` if unspecified.
orderBy <string> Name of a field used to order results. The default sorting order is ascending. To specify descending order for a field, append a \" desc\" suffix. For example \"key.reportId desc\". Sorting is only supported for the following fields: * `key.reportId`"
  ([queryId] (queries-reports-list queryId nil))
  ([queryId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://doubleclickbidmanager.googleapis.com/v2/queries/{queryId}/reports",
       :uri-template-args {"queryId" queryId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/doubleclickbidmanager"]})))

(defn queries-reports-get
  "Retrieves a report.
https://developers.google.com/bid-manager/guides/getting-started-api/v2/reference/rest/v2/queries/reports/get

queryId <> 
reportId <> "
  [queryId reportId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://doubleclickbidmanager.googleapis.com/v2/queries/{queryId}/reports/{reportId}",
     :uri-template-args {"queryId" queryId, "reportId" reportId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/doubleclickbidmanager"]}))
