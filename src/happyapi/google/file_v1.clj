(ns happyapi.google.file-v1
  "Cloud Filestore API
The Cloud Filestore API is used for creating and managing cloud file servers.
See: https://cloud.google.com/filestore/"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
includeUnrevealedLocations <boolean> If true, the returned list will include locations which are not yet revealed.
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://file.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://file.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://file.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://file.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://file.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://file.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-instances-list
  "Lists all instances in a project for either a specified location or for all locations.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/instances/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return.
orderBy <string> Sort results. Supported values are \"name\", \"name desc\" or \"\" (unsorted).
filter <string> List filter."
  ([parent] (projects-locations-instances-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://file.googleapis.com/v1/{+parent}/instances",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-get
  "Gets the details of a specific instance.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/instances/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://file.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-create
  "Creates an instance. When creating from a backup, the capacity of the new instance needs to be equal to or larger than the capacity of the backup (and also equal to or larger than the minimum capacity of the tier).
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/instances/create

parent <> 
Instance:
Instance

optional:
instanceId <string> Required. The name of the instance to create. The name must be unique for the specified project and location."
  ([parent Instance]
    (projects-locations-instances-create parent Instance nil))
  ([parent Instance optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://file.googleapis.com/v1/{+parent}/instances",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Instance})))

(defn projects-locations-instances-patch
  "Updates the settings of a specific instance.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/instances/patch

name <> 
Instance:
Instance

optional:
updateMask <string> Mask of fields to update. At least one path must be supplied in this field. The elements of the repeated paths field may only include these fields: * \"description\" * \"file_shares\" * \"labels\""
  ([name Instance]
    (projects-locations-instances-patch name Instance nil))
  ([name Instance optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://file.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Instance})))

(defn projects-locations-instances-restore
  "Restores an existing instance's file share from a backup. The capacity of the instance needs to be equal to or larger than the capacity of the backup (and also equal to or larger than the minimum capacity of the tier).
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/instances/restore

name <> 
RestoreInstanceRequest:
RestoreInstanceRequest"
  [name RestoreInstanceRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://file.googleapis.com/v1/{+name}:restore",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RestoreInstanceRequest}))

(defn projects-locations-instances-revert
  "Revert an existing instance's file system to a specified snapshot.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/instances/revert

name <> 
RevertInstanceRequest:
RevertInstanceRequest"
  [name RevertInstanceRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://file.googleapis.com/v1/{+name}:revert",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RevertInstanceRequest}))

(defn projects-locations-instances-delete
  "Deletes an instance.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/instances/delete

name <> 

optional:
force <boolean> If set to true, all snapshots of the instance will also be deleted. (Otherwise, the request will only work if the instance has no snapshots.)"
  ([name] (projects-locations-instances-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://file.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-promoteReplica
  "Promote an standby instance (replica).
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/instances/promoteReplica

name <> 
PromoteReplicaRequest:
PromoteReplicaRequest"
  [name PromoteReplicaRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://file.googleapis.com/v1/{+name}:promoteReplica",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body PromoteReplicaRequest}))

(defn projects-locations-instances-snapshots-list
  "Lists all snapshots in a project for either a specified location or for all locations.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/instances/snapshots/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return.
orderBy <string> Sort results. Supported values are \"name\", \"name desc\" or \"\" (unsorted).
filter <string> List filter."
  ([parent] (projects-locations-instances-snapshots-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://file.googleapis.com/v1/{+parent}/snapshots",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-snapshots-get
  "Gets the details of a specific snapshot.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/instances/snapshots/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://file.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-snapshots-create
  "Creates a snapshot.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/instances/snapshots/create

parent <> 
Snapshot:
Snapshot

optional:
snapshotId <string> Required. The ID to use for the snapshot. The ID must be unique within the specified instance. This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens, and cannot end with a hyphen."
  ([parent Snapshot]
    (projects-locations-instances-snapshots-create
      parent
      Snapshot
      nil))
  ([parent Snapshot optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://file.googleapis.com/v1/{+parent}/snapshots",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Snapshot})))

(defn projects-locations-instances-snapshots-delete
  "Deletes a snapshot.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/instances/snapshots/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://file.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-snapshots-patch
  "Updates the settings of a specific snapshot.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/instances/snapshots/patch

name <> 
Snapshot:
Snapshot

optional:
updateMask <string> Required. Mask of fields to update. At least one path must be supplied in this field."
  ([name Snapshot]
    (projects-locations-instances-snapshots-patch name Snapshot nil))
  ([name Snapshot optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://file.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Snapshot})))

(defn projects-locations-backups-list
  "Lists all backups in a project for either a specified location or for all locations.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/backups/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return.
orderBy <string> Sort results. Supported values are \"name\", \"name desc\" or \"\" (unsorted).
filter <string> List filter."
  ([parent] (projects-locations-backups-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://file.googleapis.com/v1/{+parent}/backups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-backups-get
  "Gets the details of a specific backup.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/backups/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://file.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backups-create
  "Creates a backup.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/backups/create

parent <> 
Backup:
Backup

optional:
backupId <string> Required. The ID to use for the backup. The ID must be unique within the specified project and location. This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens, and cannot end with a hyphen. Values that do not match this pattern will trigger an INVALID_ARGUMENT error."
  ([parent Backup]
    (projects-locations-backups-create parent Backup nil))
  ([parent Backup optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://file.googleapis.com/v1/{+parent}/backups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Backup})))

(defn projects-locations-backups-delete
  "Deletes a backup.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/backups/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://file.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backups-patch
  "Updates the settings of a specific backup.
https://cloud.google.com/filestore/v1/reference/rest/v1/projects/locations/backups/patch

name <> 
Backup:
Backup

optional:
updateMask <string> Required. Mask of fields to update. At least one path must be supplied in this field."
  ([name Backup] (projects-locations-backups-patch name Backup nil))
  ([name Backup optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://file.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Backup})))
