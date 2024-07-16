(ns happyapi.google.migrationcenter-v1
  "Migration Center API
A unified platform that helps you accelerate your end-to-end cloud journey from your current on-premises or cloud environments to Google Cloud.
See: https://cloud.google.com/migration-center/docs"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-getSettings
  "Gets the details of regional settings.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/getSettings

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://migrationcenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-updateSettings
  "Updates the regional-level project settings.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/updateSettings

name <> 
Settings:
Settings

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the `Settings` resource by the update. The values specified in the `update_mask` field are relative to the resource, not the full request. A field will be overwritten if it is in the mask. A single * value in the mask lets you to overwrite all fields.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Settings]
    (projects-locations-updateSettings name Settings nil))
  ([name Settings optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Settings})))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://migrationcenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://migrationcenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://migrationcenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://migrationcenter.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-assets-list
  "Lists all the assets in a given project and location.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/assets/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Filtering results.
orderBy <string> Field to sort by. See https://google.aip.dev/132#ordering for more details.
view <string> View of the assets. Defaults to BASIC."
  ([parent] (projects-locations-assets-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/assets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-assets-get
  "Gets the details of an asset.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/assets/get

name <> 

optional:
view <string> View of the assets. Defaults to BASIC."
  ([name] (projects-locations-assets-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-assets-patch
  "Updates the parameters of an asset.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/assets/patch

name <> 
Asset:
Asset

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the `Asset` resource by the update. The values specified in the `update_mask` field are relative to the resource, not the full request. A field will be overwritten if it is in the mask. A single * value in the mask lets you to overwrite all fields.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Asset] (projects-locations-assets-patch name Asset nil))
  ([name Asset optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Asset})))

(defn projects-locations-assets-batchUpdate
  "Updates the parameters of a list of assets.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/assets/batchUpdate

parent <> 
BatchUpdateAssetsRequest:
BatchUpdateAssetsRequest"
  [parent BatchUpdateAssetsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://migrationcenter.googleapis.com/v1/{+parent}/assets:batchUpdate",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BatchUpdateAssetsRequest}))

(defn projects-locations-assets-delete
  "Deletes an asset.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/assets/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-assets-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-assets-batchDelete
  "Deletes list of Assets.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/assets/batchDelete

parent <> 
BatchDeleteAssetsRequest:
BatchDeleteAssetsRequest"
  [parent BatchDeleteAssetsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://migrationcenter.googleapis.com/v1/{+parent}/assets:batchDelete",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BatchDeleteAssetsRequest}))

(defn projects-locations-assets-reportAssetFrames
  "Reports a set of frames.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/assets/reportAssetFrames

parent <> 
Frames:
Frames

optional:
source <string> Required. Reference to a source."
  ([parent Frames]
    (projects-locations-assets-reportAssetFrames parent Frames nil))
  ([parent Frames optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/assets:reportAssetFrames",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Frames})))

(defn projects-locations-assets-aggregateValues
  "Aggregates the requested fields based on provided function.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/assets/aggregateValues

parent <> 
AggregateAssetsValuesRequest:
AggregateAssetsValuesRequest"
  [parent AggregateAssetsValuesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://migrationcenter.googleapis.com/v1/{+parent}/assets:aggregateValues",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AggregateAssetsValuesRequest}))

(defn projects-locations-importJobs-create
  "Creates an import job.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/importJobs/create

parent <> 
ImportJob:
ImportJob

optional:
importJobId <string> Required. ID of the import job.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent ImportJob]
    (projects-locations-importJobs-create parent ImportJob nil))
  ([parent ImportJob optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/importJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ImportJob})))

(defn projects-locations-importJobs-list
  "Lists all import jobs.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/importJobs/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Filtering results.
orderBy <string> Field to sort by. See https://google.aip.dev/132#ordering for more details.
view <string> Optional. The level of details of each import job. Default value is BASIC."
  ([parent] (projects-locations-importJobs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/importJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-importJobs-get
  "Gets the details of an import job.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/importJobs/get

name <> 

optional:
view <string> Optional. The level of details of the import job. Default value is FULL."
  ([name] (projects-locations-importJobs-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-importJobs-delete
  "Deletes an import job.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/importJobs/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
force <boolean> Optional. If set to `true`, any `ImportDataFiles` of this job will also be deleted If set to `false`, the request only works if the job has no data files."
  ([name] (projects-locations-importJobs-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-importJobs-patch
  "Updates an import job.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/importJobs/patch

name <> 
ImportJob:
ImportJob

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the `Asset` resource by the update. The values specified in the `update_mask` field are relative to the resource, not the full request. A field will be overwritten if it is in the mask. A single * value in the mask lets you to overwrite all fields.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name ImportJob]
    (projects-locations-importJobs-patch name ImportJob nil))
  ([name ImportJob optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ImportJob})))

(defn projects-locations-importJobs-validate
  "Validates an import job.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/importJobs/validate

name <> 
ValidateImportJobRequest:
ValidateImportJobRequest"
  [name ValidateImportJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://migrationcenter.googleapis.com/v1/{+name}:validate",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ValidateImportJobRequest}))

(defn projects-locations-importJobs-run
  "Runs an import job.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/importJobs/run

name <> 
RunImportJobRequest:
RunImportJobRequest"
  [name RunImportJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://migrationcenter.googleapis.com/v1/{+name}:run",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RunImportJobRequest}))

(defn projects-locations-importJobs-importDataFiles-get
  "Gets an import data file.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/importJobs/importDataFiles/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://migrationcenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-importJobs-importDataFiles-list
  "List import data files.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/importJobs/importDataFiles/list

parent <> 

optional:
pageSize <integer> The maximum number of data files to return. The service may return fewer than this value. If unspecified, at most 500 data files will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Filtering results.
orderBy <string> Field to sort by. See https://google.aip.dev/132#ordering for more details."
  ([parent]
    (projects-locations-importJobs-importDataFiles-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/importDataFiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-importJobs-importDataFiles-create
  "Creates an import data file.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/importJobs/importDataFiles/create

parent <> 
ImportDataFile:
ImportDataFile

optional:
importDataFileId <string> Required. The ID of the new data file.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent ImportDataFile]
    (projects-locations-importJobs-importDataFiles-create
      parent
      ImportDataFile
      nil))
  ([parent ImportDataFile optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/importDataFiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ImportDataFile})))

(defn projects-locations-importJobs-importDataFiles-delete
  "Delete an import data file.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/importJobs/importDataFiles/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name]
    (projects-locations-importJobs-importDataFiles-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-groups-list
  "Lists all groups in a given project and location.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/groups/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Filtering results.
orderBy <string> Field to sort by. See https://google.aip.dev/132#ordering for more details."
  ([parent] (projects-locations-groups-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/groups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-groups-get
  "Gets the details of a group.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/groups/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://migrationcenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-groups-create
  "Creates a new group in a given project and location.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/groups/create

parent <> 
Group:
Group

optional:
groupId <string> Required. User specified ID for the group. It will become the last component of the group name. The ID must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. The ID must match the regular expression: `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent Group] (projects-locations-groups-create parent Group nil))
  ([parent Group optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/groups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Group})))

(defn projects-locations-groups-patch
  "Updates the parameters of a group.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/groups/patch

name <> 
Group:
Group

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the `Group` resource by the update. The values specified in the `update_mask` are relative to the resource, not the full request. A field will be overwritten if it is in the mask. A single * value in the mask lets you to overwrite all fields.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Group] (projects-locations-groups-patch name Group nil))
  ([name Group optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Group})))

(defn projects-locations-groups-delete
  "Deletes a group.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/groups/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-groups-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-groups-addAssets
  "Adds assets to a group.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/groups/addAssets

group <> 
AddAssetsToGroupRequest:
AddAssetsToGroupRequest"
  [group AddAssetsToGroupRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://migrationcenter.googleapis.com/v1/{+group}:addAssets",
     :uri-template-args {"group" group},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AddAssetsToGroupRequest}))

(defn projects-locations-groups-removeAssets
  "Removes assets from a group.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/groups/removeAssets

group <> 
RemoveAssetsFromGroupRequest:
RemoveAssetsFromGroupRequest"
  [group RemoveAssetsFromGroupRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://migrationcenter.googleapis.com/v1/{+group}:removeAssets",
     :uri-template-args {"group" group},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RemoveAssetsFromGroupRequest}))

(defn projects-locations-sources-list
  "Lists all the sources in a given project and location.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/sources/list

parent <> 

optional:
pageSize <integer> Requested page size. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default value.
filter <string> Filtering results.
orderBy <string> Field to sort by. See https://google.aip.dev/132#ordering for more details."
  ([parent] (projects-locations-sources-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/sources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-get
  "Gets the details of a source.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/sources/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://migrationcenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-sources-create
  "Creates a new source in a given project and location.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/sources/create

parent <> 
Source:
Source

optional:
sourceId <string> Required. User specified ID for the source. It will become the last component of the source name. The ID must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. The ID must match the regular expression: `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent Source]
    (projects-locations-sources-create parent Source nil))
  ([parent Source optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/sources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Source})))

(defn projects-locations-sources-patch
  "Updates the parameters of a source.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/sources/patch

name <> 
Source:
Source

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the `Source` resource by the update. The values specified in the `update_mask` field are relative to the resource, not the full request. A field will be overwritten if it is in the mask. A single * value in the mask lets you to overwrite all fields.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Source] (projects-locations-sources-patch name Source nil))
  ([name Source optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Source})))

(defn projects-locations-sources-delete
  "Deletes a source.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/sources/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-sources-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-errorFrames-list
  "Lists all error frames in a given source and location.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/sources/errorFrames/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
view <string> Optional. An optional view mode to control the level of details of each error frame. The default is a BASIC frame view."
  ([parent] (projects-locations-sources-errorFrames-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/errorFrames",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-errorFrames-get
  "Gets the details of an error frame.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/sources/errorFrames/get

name <> 

optional:
view <string> Optional. An optional view mode to control the level of details for the frame. The default is a basic frame view."
  ([name] (projects-locations-sources-errorFrames-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-preferenceSets-list
  "Lists all the preference sets in a given project and location.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/preferenceSets/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, at most 500 preference sets will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
orderBy <string> Field to sort by. See https://google.aip.dev/132#ordering for more details."
  ([parent] (projects-locations-preferenceSets-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/preferenceSets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-preferenceSets-get
  "Gets the details of a preference set.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/preferenceSets/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://migrationcenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-preferenceSets-create
  "Creates a new preference set in a given project and location.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/preferenceSets/create

parent <> 
PreferenceSet:
PreferenceSet

optional:
preferenceSetId <string> Required. User specified ID for the preference set. It will become the last component of the preference set name. The ID must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. The ID must match the regular expression `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent PreferenceSet]
    (projects-locations-preferenceSets-create
      parent
      PreferenceSet
      nil))
  ([parent PreferenceSet optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/preferenceSets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body PreferenceSet})))

(defn projects-locations-preferenceSets-patch
  "Updates the parameters of a preference set.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/preferenceSets/patch

name <> 
PreferenceSet:
PreferenceSet

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the `PreferenceSet` resource by the update. The values specified in the `update_mask` field are relative to the resource, not the full request. A field will be overwritten if it is in the mask. A single * value in the mask lets you to overwrite all fields.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name PreferenceSet]
    (projects-locations-preferenceSets-patch name PreferenceSet nil))
  ([name PreferenceSet optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body PreferenceSet})))

(defn projects-locations-preferenceSets-delete
  "Deletes a preference set.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/preferenceSets/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-preferenceSets-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-reportConfigs-create
  "Creates a report configuration.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/reportConfigs/create

parent <> 
ReportConfig:
ReportConfig

optional:
reportConfigId <string> Required. User specified ID for the report config. It will become the last component of the report config name. The ID must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. The ID must match the regular expression: [a-z]([a-z0-9-]{0,61}[a-z0-9])?.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent ReportConfig]
    (projects-locations-reportConfigs-create parent ReportConfig nil))
  ([parent ReportConfig optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/reportConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ReportConfig})))

(defn projects-locations-reportConfigs-get
  "Gets details of a single ReportConfig.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/reportConfigs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://migrationcenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-reportConfigs-list
  "Lists ReportConfigs in a given project and location.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/reportConfigs/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Filtering results.
orderBy <string> Field to sort by. See https://google.aip.dev/132#ordering for more details."
  ([parent] (projects-locations-reportConfigs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/reportConfigs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-reportConfigs-delete
  "Deletes a ReportConfig.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/reportConfigs/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
force <boolean> Optional. If set to `true`, any child `Reports` of this entity will also be deleted. If set to `false`, the request only works if the resource has no children."
  ([name] (projects-locations-reportConfigs-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-reportConfigs-reports-create
  "Creates a report.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/reportConfigs/reports/create

parent <> 
Report:
Report

optional:
reportId <string> Required. User specified id for the report. It will become the last component of the report name. The id must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. The id must match the regular expression: [a-z]([a-z0-9-]{0,61}[a-z0-9])?.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent Report]
    (projects-locations-reportConfigs-reports-create
      parent
      Report
      nil))
  ([parent Report optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/reports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Report})))

(defn projects-locations-reportConfigs-reports-get
  "Gets details of a single Report.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/reportConfigs/reports/get

name <> 

optional:
view <string> Determines what information to retrieve for the Report."
  ([name] (projects-locations-reportConfigs-reports-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-reportConfigs-reports-list
  "Lists Reports in a given ReportConfig.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/reportConfigs/reports/list

parent <> 

optional:
pageSize <integer> Requested page size. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default value.
filter <string> Filtering results.
orderBy <string> Field to sort by. See https://google.aip.dev/132#ordering for more details.
view <string> Determines what information to retrieve for each Report."
  ([parent] (projects-locations-reportConfigs-reports-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/reports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-reportConfigs-reports-delete
  "Deletes a Report.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/reportConfigs/reports/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-reportConfigs-reports-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-discoveryClients-create
  "Creates a new discovery client.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/discoveryClients/create

parent <> 
DiscoveryClient:
DiscoveryClient

optional:
discoveryClientId <string> Required. User specified ID for the discovery client. It will become the last component of the discovery client name. The ID must be unique within the project, is restricted to lower-cased letters and has a maximum length of 63 characters. The ID must match the regular expression: `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent DiscoveryClient]
    (projects-locations-discoveryClients-create
      parent
      DiscoveryClient
      nil))
  ([parent DiscoveryClient optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/discoveryClients",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body DiscoveryClient})))

(defn projects-locations-discoveryClients-get
  "Gets the details of a discovery client.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/discoveryClients/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://migrationcenter.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-discoveryClients-list
  "Lists all the discovery clients in a given project and location.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/discoveryClients/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of items to return. The server may return fewer items than requested. If unspecified, the server will pick an appropriate default value.
filter <string> Optional. Filter expression to filter results by.
orderBy <string> Optional. Field to sort by."
  ([parent] (projects-locations-discoveryClients-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+parent}/discoveryClients",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-discoveryClients-patch
  "Updates a discovery client.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/discoveryClients/patch

name <> 
DiscoveryClient:
DiscoveryClient

optional:
updateMask <string> Required. Update mask is used to specify the fields to be overwritten in the `DiscoveryClient` resource by the update. The values specified in the `update_mask` field are relative to the resource, not the full request. A field will be overwritten if it is in the mask. A single * value in the mask lets you to overwrite all fields.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name DiscoveryClient]
    (projects-locations-discoveryClients-patch
      name
      DiscoveryClient
      nil))
  ([name DiscoveryClient optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body DiscoveryClient})))

(defn projects-locations-discoveryClients-sendHeartbeat
  "Sends a discovery client heartbeat. Healthy clients are expected to send heartbeats regularly (normally every few minutes).
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/discoveryClients/sendHeartbeat

name <> 
SendDiscoveryClientHeartbeatRequest:
SendDiscoveryClientHeartbeatRequest"
  [name SendDiscoveryClientHeartbeatRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://migrationcenter.googleapis.com/v1/{+name}:sendHeartbeat",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SendDiscoveryClientHeartbeatRequest}))

(defn projects-locations-discoveryClients-delete
  "Deletes a discovery client.
https://cloud.google.com/migration-center/docs/v1/reference/rest/v1/projects/locations/discoveryClients/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-discoveryClients-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://migrationcenter.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
