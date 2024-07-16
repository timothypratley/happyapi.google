(ns happyapi.google.osconfig-v1
  "OS Config API
OS management tools that can be used for patch management, patch compliance, and configuration management on VM instances.
See: https://cloud.google.com/compute/docs/osconfig/rest"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-global-getProjectFeatureSettings
  "GetProjectFeatureSettings returns the VM Manager feature settings for a project.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/global/getProjectFeatureSettings

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://osconfig.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-updateProjectFeatureSettings
  "UpdateProjectFeatureSettings sets the VM Manager features for a project.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/global/updateProjectFeatureSettings

name <> 
ProjectFeatureSettings:
ProjectFeatureSettings

optional:
updateMask <string> Optional. Field mask that controls which fields of the ProjectFeatureSettings should be updated."
  ([name ProjectFeatureSettings]
    (projects-locations-global-updateProjectFeatureSettings
      name
      ProjectFeatureSettings
      nil))
  ([name ProjectFeatureSettings optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://osconfig.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ProjectFeatureSettings})))

(defn projects-locations-osPolicyAssignments-create
  "Create an OS policy assignment. This method also creates the first revision of the OS policy assignment. This method returns a long running operation (LRO) that contains the rollout details. The rollout can be cancelled by cancelling the LRO. For more information, see [Method: projects.locations.osPolicyAssignments.operations.cancel](https://cloud.google.com/compute/docs/osconfig/rest/v1/projects.locations.osPolicyAssignments.operations/cancel).
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/osPolicyAssignments/create

parent <> 
OSPolicyAssignment:
OSPolicyAssignment

optional:
osPolicyAssignmentId <string> Required. The logical name of the OS policy assignment in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
requestId <string> Optional. A unique identifier for this request. Restricted to 36 ASCII characters. A random UUID is recommended. This request is only idempotent if a `request_id` is provided."
  ([parent OSPolicyAssignment]
    (projects-locations-osPolicyAssignments-create
      parent
      OSPolicyAssignment
      nil))
  ([parent OSPolicyAssignment optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://osconfig.googleapis.com/v1/{+parent}/osPolicyAssignments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body OSPolicyAssignment})))

(defn projects-locations-osPolicyAssignments-patch
  "Update an existing OS policy assignment. This method creates a new revision of the OS policy assignment. This method returns a long running operation (LRO) that contains the rollout details. The rollout can be cancelled by cancelling the LRO. For more information, see [Method: projects.locations.osPolicyAssignments.operations.cancel](https://cloud.google.com/compute/docs/osconfig/rest/v1/projects.locations.osPolicyAssignments.operations/cancel).
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/osPolicyAssignments/patch

name <> 
OSPolicyAssignment:
OSPolicyAssignment

optional:
updateMask <string> Optional. Field mask that controls which fields of the assignment should be updated.
allowMissing <boolean> Optional. If set to true, and the OS policy assignment is not found, a new OS policy assignment will be created. In this situation, `update_mask` is ignored.
requestId <string> Optional. A unique identifier for this request. Restricted to 36 ASCII characters. A random UUID is recommended. This request is only idempotent if a `request_id` is provided."
  ([name OSPolicyAssignment]
    (projects-locations-osPolicyAssignments-patch
      name
      OSPolicyAssignment
      nil))
  ([name OSPolicyAssignment optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://osconfig.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body OSPolicyAssignment})))

(defn projects-locations-osPolicyAssignments-get
  "Retrieve an existing OS policy assignment. This method always returns the latest revision. In order to retrieve a previous revision of the assignment, also provide the revision ID in the `name` parameter.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/osPolicyAssignments/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://osconfig.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-osPolicyAssignments-list
  "List the OS policy assignments under the parent resource. For each OS policy assignment, the latest revision is returned.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/osPolicyAssignments/list

parent <> 

optional:
pageSize <integer> The maximum number of assignments to return."
  ([parent] (projects-locations-osPolicyAssignments-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://osconfig.googleapis.com/v1/{+parent}/osPolicyAssignments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-osPolicyAssignments-listRevisions
  "List the OS policy assignment revisions for a given OS policy assignment.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/osPolicyAssignments/listRevisions

name <> 

optional:
pageSize <integer> The maximum number of revisions to return."
  ([name]
    (projects-locations-osPolicyAssignments-listRevisions name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://osconfig.googleapis.com/v1/{+name}:listRevisions",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-osPolicyAssignments-delete
  "Delete the OS policy assignment. This method creates a new revision of the OS policy assignment. This method returns a long running operation (LRO) that contains the rollout details. The rollout can be cancelled by cancelling the LRO. If the LRO completes and is not cancelled, all revisions associated with the OS policy assignment are deleted. For more information, see [Method: projects.locations.osPolicyAssignments.operations.cancel](https://cloud.google.com/compute/docs/osconfig/rest/v1/projects.locations.osPolicyAssignments.operations/cancel).
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/osPolicyAssignments/delete

name <> 

optional:
requestId <string> Optional. A unique identifier for this request. Restricted to 36 ASCII characters. A random UUID is recommended. This request is only idempotent if a `request_id` is provided."
  ([name] (projects-locations-osPolicyAssignments-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://osconfig.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-osPolicyAssignments-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/osPolicyAssignments/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://osconfig.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-osPolicyAssignments-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/osPolicyAssignments/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://osconfig.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-instances-osPolicyAssignments-reports-get
  "Get the OS policy assignment report for the specified Compute Engine VM instance.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/instances/osPolicyAssignments/reports/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://osconfig.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-osPolicyAssignments-reports-list
  "List OS policy assignment reports for all Compute Engine VM instances in the specified zone.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/instances/osPolicyAssignments/reports/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return.
filter <string> If provided, this field specifies the criteria that must be met by the `OSPolicyAssignmentReport` API resource that is included in the response."
  ([parent]
    (projects-locations-instances-osPolicyAssignments-reports-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://osconfig.googleapis.com/v1/{+parent}/reports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-inventories-get
  "Get inventory data for the specified VM instance. If the VM has no associated inventory, the message `NOT_FOUND` is returned.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/instances/inventories/get

name <> 

optional:
view <string> Inventory view indicating what information should be included in the inventory resource. If unspecified, the default view is BASIC."
  ([name] (projects-locations-instances-inventories-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://osconfig.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-inventories-list
  "List inventory data for all VM instances in the specified zone.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/instances/inventories/list

parent <> 

optional:
view <string> Inventory view indicating what information should be included in the inventory resource. If unspecified, the default view is BASIC.
pageSize <integer> The maximum number of results to return.
filter <string> If provided, this field specifies the criteria that must be met by a `Inventory` API resource to be included in the response."
  ([parent] (projects-locations-instances-inventories-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://osconfig.googleapis.com/v1/{+parent}/inventories",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-vulnerabilityReports-get
  "Gets the vulnerability report for the specified VM instance. Only VMs with inventory data have vulnerability reports associated with them.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/instances/vulnerabilityReports/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://osconfig.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-vulnerabilityReports-list
  "List vulnerability reports for all VM instances in the specified zone.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/locations/instances/vulnerabilityReports/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return.
filter <string> This field supports filtering by the severity level for the vulnerability. For a list of severity levels, see [Severity levels for vulnerabilities](https://cloud.google.com/container-analysis/docs/container-scanning-overview#severity_levels_for_vulnerabilities). The filter field follows the rules described in the [AIP-160](https://google.aip.dev/160) guidelines as follows: + **Filter for a specific severity type**: you can list reports that contain vulnerabilities that are classified as medium by specifying `vulnerabilities.details.severity:MEDIUM`. + **Filter for a range of severities** : you can list reports that have vulnerabilities that are classified as critical or high by specifying `vulnerabilities.details.severity:HIGH OR vulnerabilities.details.severity:CRITICAL`"
  ([parent]
    (projects-locations-instances-vulnerabilityReports-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://osconfig.googleapis.com/v1/{+parent}/vulnerabilityReports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-patchJobs-execute
  "Patch VM instances by creating and running a patch job.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/patchJobs/execute

parent <> 
ExecutePatchJobRequest:
ExecutePatchJobRequest"
  [parent ExecutePatchJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://osconfig.googleapis.com/v1/{+parent}/patchJobs:execute",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ExecutePatchJobRequest}))

(defn projects-patchJobs-get
  "Get the patch job. This can be used to track the progress of an ongoing patch job or review the details of completed jobs.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/patchJobs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://osconfig.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-patchJobs-cancel
  "Cancel a patch job. The patch job must be active. Canceled patch jobs cannot be restarted.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/patchJobs/cancel

name <> 
CancelPatchJobRequest:
CancelPatchJobRequest"
  [name CancelPatchJobRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://osconfig.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelPatchJobRequest}))

(defn projects-patchJobs-list
  "Get a list of patch jobs.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/patchJobs/list

parent <> 

optional:
pageSize <integer> The maximum number of instance status to return.
filter <string> If provided, this field specifies the criteria that must be met by patch jobs to be included in the response. Currently, filtering is only available on the patch_deployment field."
  ([parent] (projects-patchJobs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://osconfig.googleapis.com/v1/{+parent}/patchJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-patchJobs-instanceDetails-list
  "Get a list of instance details for a given patch job.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/patchJobs/instanceDetails/list

parent <> 

optional:
pageSize <integer> The maximum number of instance details records to return. Default is 100.
filter <string> A filter expression that filters results listed in the response. This field supports filtering results by instance zone, name, state, or `failure_reason`."
  ([parent] (projects-patchJobs-instanceDetails-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://osconfig.googleapis.com/v1/{+parent}/instanceDetails",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-patchDeployments-create
  "Create an OS Config patch deployment.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/patchDeployments/create

parent <> 
PatchDeployment:
PatchDeployment

optional:
patchDeploymentId <string> Required. A name for the patch deployment in the project. When creating a name the following rules apply: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project."
  ([parent PatchDeployment]
    (projects-patchDeployments-create parent PatchDeployment nil))
  ([parent PatchDeployment optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://osconfig.googleapis.com/v1/{+parent}/patchDeployments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body PatchDeployment})))

(defn projects-patchDeployments-get
  "Get an OS Config patch deployment.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/patchDeployments/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://osconfig.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-patchDeployments-list
  "Get a page of OS Config patch deployments.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/patchDeployments/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of patch deployments to return. Default is 100."
  ([parent] (projects-patchDeployments-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://osconfig.googleapis.com/v1/{+parent}/patchDeployments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-patchDeployments-delete
  "Delete an OS Config patch deployment.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/patchDeployments/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://osconfig.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-patchDeployments-patch
  "Update an OS Config patch deployment.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/patchDeployments/patch

name <> 
PatchDeployment:
PatchDeployment

optional:
updateMask <string> Optional. Field mask that controls which fields of the patch deployment should be updated."
  ([name PatchDeployment]
    (projects-patchDeployments-patch name PatchDeployment nil))
  ([name PatchDeployment optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://osconfig.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body PatchDeployment})))

(defn projects-patchDeployments-pause
  "Change state of patch deployment to \"PAUSED\". Patch deployment in paused state doesn't generate patch jobs.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/patchDeployments/pause

name <> 
PausePatchDeploymentRequest:
PausePatchDeploymentRequest"
  [name PausePatchDeploymentRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://osconfig.googleapis.com/v1/{+name}:pause",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body PausePatchDeploymentRequest}))

(defn projects-patchDeployments-resume
  "Change state of patch deployment back to \"ACTIVE\". Patch deployment in active state continues to generate patch jobs.
https://cloud.google.com/compute/docs/osconfig/rest/v1/reference/rest/v1/projects/patchDeployments/resume

name <> 
ResumePatchDeploymentRequest:
ResumePatchDeploymentRequest"
  [name ResumePatchDeploymentRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://osconfig.googleapis.com/v1/{+name}:resume",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ResumePatchDeploymentRequest}))
