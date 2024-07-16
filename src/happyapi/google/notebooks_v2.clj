(ns happyapi.google.notebooks-v2
  "Notebooks API
Notebooks API is used to manage notebook resources in Google Cloud.
See: https://cloud.google.com/vertex-ai/docs/workbench/user-managed"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://notebooks.googleapis.com/v2/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://notebooks.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://notebooks.googleapis.com/v2/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://notebooks.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://notebooks.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://notebooks.googleapis.com/v2/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-instances-stop
  "Stops a notebook instance.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/stop

name <> 
StopInstanceRequest:
StopInstanceRequest"
  [name StopInstanceRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://notebooks.googleapis.com/v2/{+name}:stop",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body StopInstanceRequest}))

(defn projects-locations-instances-list
  "Lists instances in a given project and location.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/list

parent <> 

optional:
pageSize <integer> Optional. Maximum return size of the list call.
orderBy <string> Optional. Sort results. Supported values are \"name\", \"name desc\" or \"\" (unsorted).
filter <string> Optional. List filter."
  ([parent] (projects-locations-instances-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://notebooks.googleapis.com/v2/{+parent}/instances",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://notebooks.googleapis.com/v2/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-instances-delete
  "Deletes a single Instance.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/delete

name <> 

optional:
requestId <string> Optional. Idempotent request UUID."
  ([name] (projects-locations-instances-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://notebooks.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-upgrade
  "Upgrades a notebook instance to the latest version.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/upgrade

name <> 
UpgradeInstanceRequest:
UpgradeInstanceRequest"
  [name UpgradeInstanceRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://notebooks.googleapis.com/v2/{+name}:upgrade",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UpgradeInstanceRequest}))

(defn projects-locations-instances-reset
  "Resets a notebook instance.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/reset

name <> 
ResetInstanceRequest:
ResetInstanceRequest"
  [name ResetInstanceRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://notebooks.googleapis.com/v2/{+name}:reset",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ResetInstanceRequest}))

(defn projects-locations-instances-start
  "Starts a notebook instance.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/start

name <> 
StartInstanceRequest:
StartInstanceRequest"
  [name StartInstanceRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://notebooks.googleapis.com/v2/{+name}:start",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body StartInstanceRequest}))

(defn projects-locations-instances-checkUpgradability
  "Checks whether a notebook instance is upgradable.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/checkUpgradability

notebookInstance <> "
  [notebookInstance]
  (client/api-request
    {:method :get,
     :uri-template
     "https://notebooks.googleapis.com/v2/{+notebookInstance}:checkUpgradability",
     :uri-template-args {"notebookInstance" notebookInstance},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-patch
  "UpdateInstance updates an Instance.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/patch

name <> 
Instance:
Instance

optional:
updateMask <string> Required. Mask used to update an instance
requestId <string> Optional. Idempotent request UUID."
  ([name Instance]
    (projects-locations-instances-patch name Instance nil))
  ([name Instance optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://notebooks.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Instance})))

(defn projects-locations-instances-reportInfoSystem
  "Allows notebook instances to report their latest instance information to the Notebooks API server. The server will merge the reported information to the instance metadata store. Do not use this method directly.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/reportInfoSystem

name <> 
ReportInstanceInfoSystemRequest:
ReportInstanceInfoSystemRequest"
  [name ReportInstanceInfoSystemRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://notebooks.googleapis.com/v2/{+name}:reportInfoSystem",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ReportInstanceInfoSystemRequest}))

(defn projects-locations-instances-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-instances-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://notebooks.googleapis.com/v2/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-diagnose
  "Creates a Diagnostic File and runs Diagnostic Tool given an Instance.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/diagnose

name <> 
DiagnoseInstanceRequest:
DiagnoseInstanceRequest"
  [name DiagnoseInstanceRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://notebooks.googleapis.com/v2/{+name}:diagnose",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body DiagnoseInstanceRequest}))

(defn projects-locations-instances-upgradeSystem
  "Allows notebook instances to upgrade themselves. Do not use this method directly.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/upgradeSystem

name <> 
UpgradeInstanceSystemRequest:
UpgradeInstanceSystemRequest"
  [name UpgradeInstanceSystemRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://notebooks.googleapis.com/v2/{+name}:upgradeSystem",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UpgradeInstanceSystemRequest}))

(defn projects-locations-instances-create
  "Creates a new Instance in a given project and location.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/create

parent <> 
Instance:
Instance

optional:
instanceId <string> Required. User-defined unique ID of this instance.
requestId <string> Optional. Idempotent request UUID."
  ([parent Instance]
    (projects-locations-instances-create parent Instance nil))
  ([parent Instance optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://notebooks.googleapis.com/v2/{+parent}/instances",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Instance})))

(defn projects-locations-instances-rollback
  "Rollbacks a notebook instance to the previous version.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/rollback

name <> 
RollbackInstanceRequest:
RollbackInstanceRequest"
  [name RollbackInstanceRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://notebooks.googleapis.com/v2/{+name}:rollback",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RollbackInstanceRequest}))

(defn projects-locations-instances-resizeDisk
  "Resize a notebook instance disk to a higher capacity.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/resizeDisk

notebookInstance <> 
ResizeDiskRequest:
ResizeDiskRequest"
  [notebookInstance ResizeDiskRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://notebooks.googleapis.com/v2/{+notebookInstance}:resizeDisk",
     :uri-template-args {"notebookInstance" notebookInstance},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ResizeDiskRequest}))

(defn projects-locations-instances-getConfig
  "Gets general backend configurations that might also affect the frontend. Location is required by CCFE. Although we could bypass it to send location- less request directly to the backend job, we would need CPE (go/cloud-cpe). Having the location might also be useful depending on the query.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/getConfig

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://notebooks.googleapis.com/v2/{+name}/instances:getConfig",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-get
  "Gets details of a single Instance.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://notebooks.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/vertex-ai/docs/workbench/user-managed/v2/reference/rest/v2/projects/locations/instances/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://notebooks.googleapis.com/v2/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))
