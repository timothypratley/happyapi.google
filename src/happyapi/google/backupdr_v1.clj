(ns happyapi.google.backupdr-v1
  "Backup and DR Service API

See: https://cloud.google.com/backup-disaster-recovery"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://backupdr.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-managementServers-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/managementServers/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://backupdr.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-managementServers-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/managementServers/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-managementServers-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-managementServers-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/managementServers/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://backupdr.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-managementServers-list
  "Lists ManagementServers in a given project and location.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/managementServers/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Optional. Filtering results.
orderBy <string> Optional. Hint for how to order the results."
  ([parent] (projects-locations-managementServers-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+parent}/managementServers",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-managementServers-get
  "Gets details of a single ManagementServer.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/managementServers/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://backupdr.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-managementServers-create
  "Creates a new ManagementServer in a given project and location.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/managementServers/create

parent <> 
ManagementServer:
ManagementServer

optional:
managementServerId <string> Required. The name of the management server to create. The name must be unique for the specified project and location.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent ManagementServer]
    (projects-locations-managementServers-create
      parent
      ManagementServer
      nil))
  ([parent ManagementServer optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+parent}/managementServers",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ManagementServer})))

(defn projects-locations-managementServers-delete
  "Deletes a single ManagementServer.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/managementServers/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-managementServers-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://backupdr.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://backupdr.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://backupdr.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://backupdr.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-backupVaults-create
  "
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/create

parent <> 
BackupVault:
BackupVault

optional:
backupVaultId <string> Required. ID of the requesting object If auto-generating ID server-side, remove this field and backup_vault_id from the method_signature of Create RPC
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. Only validate the request, but do not perform mutations. The default is 'false'."
  ([parent BackupVault]
    (projects-locations-backupVaults-create parent BackupVault nil))
  ([parent BackupVault optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+parent}/backupVaults",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body BackupVault})))

(defn projects-locations-backupVaults-list
  "Lists BackupVaults in a given project and location.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Optional. Filtering results.
orderBy <string> Optional. Hint for how to order the results."
  ([parent] (projects-locations-backupVaults-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+parent}/backupVaults",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-backupVaults-fetchUsable
  "FetchUsableBackupVaults lists usable BackupVaults in a given project and location. Usable BackupVault are the ones that user has backupdr.backupVaults.get permission.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/fetchUsable

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Optional. Filtering results.
orderBy <string> Optional. Hint for how to order the results."
  ([parent] (projects-locations-backupVaults-fetchUsable parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+parent}/backupVaults:fetchUsable",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-backupVaults-get
  "Gets details of a BackupVault.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://backupdr.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backupVaults-patch
  "Updates the settings of a BackupVault.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/patch

name <> 
BackupVault:
BackupVault

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the BackupVault resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then the request will fail.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. Only validate the request, but do not perform mutations. The default is 'false'.
force <boolean> Optional. If set to true, will not check plan duration against backup vault enforcement duration."
  ([name BackupVault]
    (projects-locations-backupVaults-patch name BackupVault nil))
  ([name BackupVault optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://backupdr.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body BackupVault})))

(defn projects-locations-backupVaults-delete
  "Deletes a BackupVault.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
force <boolean> Optional. If set to true, any data source from this backup vault will also be deleted.
etag <string> The current etag of the backup vault. If an etag is provided and does not match the current etag of the connection, deletion will be blocked.
validateOnly <boolean> Optional. Only validate the request, but do not perform mutations. The default is 'false'.
allowMissing <boolean> Optional. If true and the BackupVault is not found, the request will succeed but no action will be taken."
  ([name] (projects-locations-backupVaults-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://backupdr.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-backupVaults-testIamPermissions
  "Returns the caller's permissions on a BackupVault resource. A caller is not required to have Google IAM permission to make this request.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://backupdr.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-backupVaults-dataSources-abandonBackup
  "Internal only. Abandons a backup.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/abandonBackup

dataSource <> 
AbandonBackupRequest:
AbandonBackupRequest"
  [dataSource AbandonBackupRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://backupdr.googleapis.com/v1/{+dataSource}:abandonBackup",
     :uri-template-args {"dataSource" dataSource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AbandonBackupRequest}))

(defn projects-locations-backupVaults-dataSources-list
  "Lists DataSources in a given project and location.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Optional. Filtering results.
orderBy <string> Optional. Hint for how to order the results."
  ([parent]
    (projects-locations-backupVaults-dataSources-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+parent}/dataSources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-backupVaults-dataSources-fetchAccessToken
  "Internal only. Fetch access token for a given data source.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/fetchAccessToken

name <> 
FetchAccessTokenRequest:
FetchAccessTokenRequest"
  [name FetchAccessTokenRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://backupdr.googleapis.com/v1/{+name}:fetchAccessToken",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body FetchAccessTokenRequest}))

(defn projects-locations-backupVaults-dataSources-setInternalStatus
  "Sets the internal status of a DataSource.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/setInternalStatus

dataSource <> 
SetInternalStatusRequest:
SetInternalStatusRequest"
  [dataSource SetInternalStatusRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://backupdr.googleapis.com/v1/{+dataSource}:setInternalStatus",
     :uri-template-args {"dataSource" dataSource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetInternalStatusRequest}))

(defn projects-locations-backupVaults-dataSources-initiateBackup
  "Internal only. Initiates a backup.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/initiateBackup

dataSource <> 
InitiateBackupRequest:
InitiateBackupRequest"
  [dataSource InitiateBackupRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://backupdr.googleapis.com/v1/{+dataSource}:initiateBackup",
     :uri-template-args {"dataSource" dataSource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body InitiateBackupRequest}))

(defn projects-locations-backupVaults-dataSources-finalizeBackup
  "Internal only. Finalize a backup that was started by a call to InitiateBackup.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/finalizeBackup

dataSource <> 
FinalizeBackupRequest:
FinalizeBackupRequest"
  [dataSource FinalizeBackupRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://backupdr.googleapis.com/v1/{+dataSource}:finalizeBackup",
     :uri-template-args {"dataSource" dataSource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body FinalizeBackupRequest}))

(defn projects-locations-backupVaults-dataSources-remove
  "Deletes a DataSource. This is a custom method instead of a standard delete method because external clients will not delete DataSources except for BackupDR backup appliances.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/remove

name <> 
RemoveDataSourceRequest:
RemoveDataSourceRequest"
  [name RemoveDataSourceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://backupdr.googleapis.com/v1/{+name}:remove",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RemoveDataSourceRequest}))

(defn projects-locations-backupVaults-dataSources-patch
  "Updates the settings of a DataSource.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/patch

name <> 
DataSource:
DataSource

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the DataSource resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then the request will fail.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
allowMissing <boolean> Optional. Enable upsert."
  ([name DataSource]
    (projects-locations-backupVaults-dataSources-patch
      name
      DataSource
      nil))
  ([name DataSource optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://backupdr.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body DataSource})))

(defn projects-locations-backupVaults-dataSources-get
  "Gets details of a DataSource.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://backupdr.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backupVaults-dataSources-backups-list
  "Lists Backups in a given project and location.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/backups/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Optional. Filtering results.
orderBy <string> Optional. Hint for how to order the results."
  ([parent]
    (projects-locations-backupVaults-dataSources-backups-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+parent}/backups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-backupVaults-dataSources-backups-get
  "Gets details of a Backup.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/backups/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://backupdr.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backupVaults-dataSources-backups-patch
  "Updates the settings of a Backup.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/backups/patch

name <> 
Backup:
Backup

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the Backup resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then the request will fail.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Backup]
    (projects-locations-backupVaults-dataSources-backups-patch
      name
      Backup
      nil))
  ([name Backup optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://backupdr.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Backup})))

(defn projects-locations-backupVaults-dataSources-backups-delete
  "Deletes a Backup.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/backups/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name]
    (projects-locations-backupVaults-dataSources-backups-delete
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://backupdr.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-backupVaults-dataSources-backups-restore
  "Restore from a Backup
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupVaults/dataSources/backups/restore

name <> 
RestoreBackupRequest:
RestoreBackupRequest"
  [name RestoreBackupRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://backupdr.googleapis.com/v1/{+name}:restore",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RestoreBackupRequest}))

(defn projects-locations-backupPlans-create
  "Create a BackupPlan
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupPlans/create

parent <> 
BackupPlan:
BackupPlan

optional:
backupPlanId <string> Required. The name of the `BackupPlan` to create. The name must be unique for the specified project and location.The name must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens. Pattern, /a-z{,62}/.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent BackupPlan]
    (projects-locations-backupPlans-create parent BackupPlan nil))
  ([parent BackupPlan optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+parent}/backupPlans",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body BackupPlan})))

(defn projects-locations-backupPlans-get
  "Gets details of a single BackupPlan.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupPlans/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://backupdr.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backupPlans-list
  "Lists BackupPlans in a given project and location.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupPlans/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of `BackupPlans` to return in a single response. If not specified, a default value will be chosen by the service. Note that the response may include a partial list and a caller should only rely on the response's next_page_token to determine if there are more instances left to be queried.
filter <string> Optional. Field match expression used to filter the results.
orderBy <string> Optional. Field by which to sort the results."
  ([parent] (projects-locations-backupPlans-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+parent}/backupPlans",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-backupPlans-delete
  "Deletes a single BackupPlan.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupPlans/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-backupPlans-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://backupdr.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-backupPlanAssociations-create
  "Create a BackupPlanAssociation
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupPlanAssociations/create

parent <> 
BackupPlanAssociation:
BackupPlanAssociation

optional:
backupPlanAssociationId <string> Required. The name of the backup plan association to create. The name must be unique for the specified project and location.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent BackupPlanAssociation]
    (projects-locations-backupPlanAssociations-create
      parent
      BackupPlanAssociation
      nil))
  ([parent BackupPlanAssociation optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+parent}/backupPlanAssociations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body BackupPlanAssociation})))

(defn projects-locations-backupPlanAssociations-get
  "Gets details of a single BackupPlanAssociation.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupPlanAssociations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://backupdr.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backupPlanAssociations-list
  "Lists BackupPlanAssociations in a given project and location.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupPlanAssociations/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Optional. Filtering results"
  ([parent]
    (projects-locations-backupPlanAssociations-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://backupdr.googleapis.com/v1/{+parent}/backupPlanAssociations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-backupPlanAssociations-delete
  "Deletes a single BackupPlanAssociation.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupPlanAssociations/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-backupPlanAssociations-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://backupdr.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-backupPlanAssociations-triggerBackup
  "Triggers a new Backup.
https://cloud.google.com/backup-disaster-recovery/v1/reference/rest/v1/projects/locations/backupPlanAssociations/triggerBackup

name <> 
TriggerBackupRequest:
TriggerBackupRequest"
  [name TriggerBackupRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://backupdr.googleapis.com/v1/{+name}:triggerBackup",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TriggerBackupRequest}))
