(ns happyapi.google.gkebackup-v1
  "Backup for GKE API
Backup for GKE is a managed Kubernetes workload backup and restore service for GKE clusters.
See: https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke")

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
GoogleLongrunningCancelOperationRequest:
GoogleLongrunningCancelOperationRequest"
  [name GoogleLongrunningCancelOperationRequest]
  {:method :post,
   :uri-template "https://gkebackup.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleLongrunningCancelOperationRequest})

(defn projects-locations-backupPlans-create
  "Creates a new BackupPlan in a given location.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/create

parent <> 
BackupPlan:
BackupPlan

optional:
backupPlanId <string> Required. The client-provided short name for the BackupPlan resource. This name must: - be between 1 and 63 characters long (inclusive) - consist of only lower-case ASCII letters, numbers, and dashes - start with a lower-case letter - end with a lower-case letter or number - be unique within the set of BackupPlans in this location"
  ([parent BackupPlan]
    (projects-locations-backupPlans-create parent BackupPlan nil))
  ([parent BackupPlan optional]
    {:method :post,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+parent}/backupPlans",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BackupPlan}))

(defn projects-locations-backupPlans-list
  "Lists BackupPlans in a given location.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/list

parent <> 

optional:
pageSize <integer> Optional. The target number of results to return in a single response. If not specified, a default value will be chosen by the service. Note that the response may include a partial list and a caller should only rely on the response's next_page_token to determine if there are more instances left to be queried.
filter <string> Optional. Field match expression used to filter the results.
orderBy <string> Optional. Field by which to sort the results."
  ([parent] (projects-locations-backupPlans-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+parent}/backupPlans",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backupPlans-get
  "Retrieve the details of a single BackupPlan.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-backupPlans-patch
  "Update a BackupPlan.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/patch

name <> 
BackupPlan:
BackupPlan

optional:
updateMask <string> Optional. This is used to specify the fields to be overwritten in the BackupPlan targeted for update. The values for each of these updated fields will be taken from the `backup_plan` provided with this request. Field names are relative to the root of the resource (e.g., `description`, `backup_config.include_volume_data`, etc.) If no `update_mask` is provided, all fields in `backup_plan` will be written to the target BackupPlan resource. Note that OUTPUT_ONLY and IMMUTABLE fields in `backup_plan` are ignored and are not used to update the target BackupPlan."
  ([name BackupPlan]
    (projects-locations-backupPlans-patch name BackupPlan nil))
  ([name BackupPlan optional]
    {:method :patch,
     :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BackupPlan}))

(defn projects-locations-backupPlans-delete
  "Deletes an existing BackupPlan.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/delete

name <> 

optional:
etag <string> Optional. If provided, this value must match the current value of the target BackupPlan's etag field or the request is rejected."
  ([name] (projects-locations-backupPlans-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backupPlans-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://gkebackup.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-backupPlans-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-backupPlans-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backupPlans-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://gkebackup.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-backupPlans-backups-list
  "Lists the Backups for a given BackupPlan.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/list

parent <> 

optional:
pageSize <integer> Optional. The target number of results to return in a single response. If not specified, a default value will be chosen by the service. Note that the response may include a partial list and a caller should only rely on the response's next_page_token to determine if there are more instances left to be queried.
filter <string> Optional. Field match expression used to filter the results.
orderBy <string> Optional. Field by which to sort the results."
  ([parent] (projects-locations-backupPlans-backups-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+parent}/backups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backupPlans-backups-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://gkebackup.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-backupPlans-backups-delete
  "Deletes an existing Backup.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/delete

name <> 

optional:
etag <string> Optional. If provided, this value must match the current value of the target Backup's etag field or the request is rejected.
force <boolean> Optional. If set to true, any VolumeBackups below this Backup will also be deleted. Otherwise, the request will only succeed if the Backup has no VolumeBackups."
  ([name] (projects-locations-backupPlans-backups-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backupPlans-backups-patch
  "Update a Backup.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/patch

name <> 
Backup:
Backup

optional:
updateMask <string> Optional. This is used to specify the fields to be overwritten in the Backup targeted for update. The values for each of these updated fields will be taken from the `backup_plan` provided with this request. Field names are relative to the root of the resource. If no `update_mask` is provided, all fields in `backup` will be written to the target Backup resource. Note that OUTPUT_ONLY and IMMUTABLE fields in `backup` are ignored and are not used to update the target Backup."
  ([name Backup]
    (projects-locations-backupPlans-backups-patch name Backup nil))
  ([name Backup optional]
    {:method :patch,
     :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Backup}))

(defn projects-locations-backupPlans-backups-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-backupPlans-backups-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backupPlans-backups-getBackupIndexDownloadUrl
  "Retrieve the link to the backupIndex.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/getBackupIndexDownloadUrl

backup <> "
  [backup]
  {:method :get,
   :uri-template
   "https://gkebackup.googleapis.com/v1/{+backup}:getBackupIndexDownloadUrl",
   :uri-template-args {"backup" backup},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-backupPlans-backups-create
  "Creates a Backup for the given BackupPlan.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/create

parent <> 
Backup:
Backup

optional:
backupId <string> Optional. The client-provided short name for the Backup resource. This name must: - be between 1 and 63 characters long (inclusive) - consist of only lower-case ASCII letters, numbers, and dashes - start with a lower-case letter - end with a lower-case letter or number - be unique within the set of Backups in this BackupPlan"
  ([parent Backup]
    (projects-locations-backupPlans-backups-create parent Backup nil))
  ([parent Backup optional]
    {:method :post,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+parent}/backups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Backup}))

(defn projects-locations-backupPlans-backups-get
  "Retrieve the details of a single Backup.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-backupPlans-backups-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://gkebackup.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-backupPlans-backups-volumeBackups-list
  "Lists the VolumeBackups for a given Backup.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/volumeBackups/list

parent <> 

optional:
pageSize <integer> Optional. The target number of results to return in a single response. If not specified, a default value will be chosen by the service. Note that the response may include a partial list and a caller should only rely on the response's next_page_token to determine if there are more instances left to be queried.
filter <string> Optional. Field match expression used to filter the results.
orderBy <string> Optional. Field by which to sort the results."
  ([parent]
    (projects-locations-backupPlans-backups-volumeBackups-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+parent}/volumeBackups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backupPlans-backups-volumeBackups-get
  "Retrieve the details of a single VolumeBackup.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/volumeBackups/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-backupPlans-backups-volumeBackups-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/volumeBackups/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://gkebackup.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-backupPlans-backups-volumeBackups-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/volumeBackups/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-backupPlans-backups-volumeBackups-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backupPlans-backups-volumeBackups-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/backupPlans/backups/volumeBackups/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://gkebackup.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-restorePlans-create
  "Creates a new RestorePlan in a given location.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/create

parent <> 
RestorePlan:
RestorePlan

optional:
restorePlanId <string> Required. The client-provided short name for the RestorePlan resource. This name must: - be between 1 and 63 characters long (inclusive) - consist of only lower-case ASCII letters, numbers, and dashes - start with a lower-case letter - end with a lower-case letter or number - be unique within the set of RestorePlans in this location"
  ([parent RestorePlan]
    (projects-locations-restorePlans-create parent RestorePlan nil))
  ([parent RestorePlan optional]
    {:method :post,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+parent}/restorePlans",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RestorePlan}))

(defn projects-locations-restorePlans-list
  "Lists RestorePlans in a given location.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/list

parent <> 

optional:
pageSize <integer> Optional. The target number of results to return in a single response. If not specified, a default value will be chosen by the service. Note that the response may include a partial list and a caller should only rely on the response's next_page_token to determine if there are more instances left to be queried.
filter <string> Optional. Field match expression used to filter the results.
orderBy <string> Optional. Field by which to sort the results."
  ([parent] (projects-locations-restorePlans-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+parent}/restorePlans",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-restorePlans-get
  "Retrieve the details of a single RestorePlan.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-restorePlans-patch
  "Update a RestorePlan.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/patch

name <> 
RestorePlan:
RestorePlan

optional:
updateMask <string> Optional. This is used to specify the fields to be overwritten in the RestorePlan targeted for update. The values for each of these updated fields will be taken from the `restore_plan` provided with this request. Field names are relative to the root of the resource. If no `update_mask` is provided, all fields in `restore_plan` will be written to the target RestorePlan resource. Note that OUTPUT_ONLY and IMMUTABLE fields in `restore_plan` are ignored and are not used to update the target RestorePlan."
  ([name RestorePlan]
    (projects-locations-restorePlans-patch name RestorePlan nil))
  ([name RestorePlan optional]
    {:method :patch,
     :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RestorePlan}))

(defn projects-locations-restorePlans-delete
  "Deletes an existing RestorePlan.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/delete

name <> 

optional:
etag <string> Optional. If provided, this value must match the current value of the target RestorePlan's etag field or the request is rejected.
force <boolean> Optional. If set to true, any Restores below this RestorePlan will also be deleted. Otherwise, the request will only succeed if the RestorePlan has no Restores."
  ([name] (projects-locations-restorePlans-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-restorePlans-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://gkebackup.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-restorePlans-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-restorePlans-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-restorePlans-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://gkebackup.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-restorePlans-restores-create
  "Creates a new Restore for the given RestorePlan.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/restores/create

parent <> 
Restore:
Restore

optional:
restoreId <string> Required. The client-provided short name for the Restore resource. This name must: - be between 1 and 63 characters long (inclusive) - consist of only lower-case ASCII letters, numbers, and dashes - start with a lower-case letter - end with a lower-case letter or number - be unique within the set of Restores in this RestorePlan."
  ([parent Restore]
    (projects-locations-restorePlans-restores-create
      parent
      Restore
      nil))
  ([parent Restore optional]
    {:method :post,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+parent}/restores",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Restore}))

(defn projects-locations-restorePlans-restores-list
  "Lists the Restores for a given RestorePlan.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/restores/list

parent <> 

optional:
pageSize <integer> Optional. The target number of results to return in a single response. If not specified, a default value will be chosen by the service. Note that the response may include a partial list and a caller should only rely on the response's next_page_token to determine if there are more instances left to be queried.
filter <string> Optional. Field match expression used to filter the results.
orderBy <string> Optional. Field by which to sort the results."
  ([parent] (projects-locations-restorePlans-restores-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+parent}/restores",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-restorePlans-restores-get
  "Retrieves the details of a single Restore.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/restores/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-restorePlans-restores-patch
  "Update a Restore.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/restores/patch

name <> 
Restore:
Restore

optional:
updateMask <string> Optional. This is used to specify the fields to be overwritten in the Restore targeted for update. The values for each of these updated fields will be taken from the `restore` provided with this request. Field names are relative to the root of the resource. If no `update_mask` is provided, all fields in `restore` will be written to the target Restore resource. Note that OUTPUT_ONLY and IMMUTABLE fields in `restore` are ignored and are not used to update the target Restore."
  ([name Restore]
    (projects-locations-restorePlans-restores-patch name Restore nil))
  ([name Restore optional]
    {:method :patch,
     :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Restore}))

(defn projects-locations-restorePlans-restores-delete
  "Deletes an existing Restore.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/restores/delete

name <> 

optional:
etag <string> Optional. If provided, this value must match the current value of the target Restore's etag field or the request is rejected.
force <boolean> Optional. If set to true, any VolumeRestores below this restore will also be deleted. Otherwise, the request will only succeed if the restore has no VolumeRestores."
  ([name] (projects-locations-restorePlans-restores-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-restorePlans-restores-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/restores/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://gkebackup.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-restorePlans-restores-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/restores/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-restorePlans-restores-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-restorePlans-restores-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/restores/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://gkebackup.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-restorePlans-restores-volumeRestores-list
  "Lists the VolumeRestores for a given Restore.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/restores/volumeRestores/list

parent <> 

optional:
pageSize <integer> Optional. The target number of results to return in a single response. If not specified, a default value will be chosen by the service. Note that the response may include a partial list and a caller should only rely on the response's next_page_token to determine if there are more instances left to be queried.
filter <string> Optional. Field match expression used to filter the results.
orderBy <string> Optional. Field by which to sort the results."
  ([parent]
    (projects-locations-restorePlans-restores-volumeRestores-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+parent}/volumeRestores",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-restorePlans-restores-volumeRestores-get
  "Retrieve the details of a single VolumeRestore.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/restores/volumeRestores/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkebackup.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-restorePlans-restores-volumeRestores-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/restores/volumeRestores/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://gkebackup.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-restorePlans-restores-volumeRestores-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/restores/volumeRestores/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-restorePlans-restores-volumeRestores-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://gkebackup.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-restorePlans-restores-volumeRestores-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/v1/reference/rest/v1/projects/locations/restorePlans/restores/volumeRestores/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://gkebackup.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})
