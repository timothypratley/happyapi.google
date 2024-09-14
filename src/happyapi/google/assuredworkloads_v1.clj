(ns happyapi.google.assuredworkloads-v1
  "Assured Workloads API

See: https://cloud.google.com/learnmoreurl")

(defn organizations-locations-workloads-analyzeWorkloadMove
  "Analyzes a hypothetical move of a source resource to a target workload to surface compliance risks. The analysis is best effort and is not guaranteed to be exhaustive.
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/workloads/analyzeWorkloadMove

target <> 

optional:
project <string> The source type is a project. Specify the project's relative resource name, formatted as either a project number or a project ID: \"projects/{PROJECT_NUMBER}\" or \"projects/{PROJECT_ID}\" For example: \"projects/951040570662\" when specifying a project number, or \"projects/my-project-123\" when specifying a project ID.
assetTypes <string> Optional. List of asset types to be analyzed, including and under the source resource. If empty, all assets are analyzed. The complete list of asset types is available [here](https://cloud.google.com/asset-inventory/docs/supported-asset-types).
pageSize <integer> Optional. Page size. If a value is not specified, the default value of 10 is used."
  ([target]
    (organizations-locations-workloads-analyzeWorkloadMove target nil))
  ([target optional]
    {:method :get,
     :uri-template
     "https://assuredworkloads.googleapis.com/v1/{+target}:analyzeWorkloadMove",
     :uri-template-args {"target" target},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-workloads-list
  "Lists Assured Workloads under a CRM Node.
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/workloads/list

parent <> 

optional:
filter <string> A custom filter for filtering by properties of a workload. At this time, only filtering by labels is supported.
pageSize <integer> Page size."
  ([parent] (organizations-locations-workloads-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://assuredworkloads.googleapis.com/v1/{+parent}/workloads",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-workloads-delete
  "Deletes the workload. Make sure that workload's direct children are already in a deleted state, otherwise the request will fail with a FAILED_PRECONDITION error. In addition to assuredworkloads.workload.delete permission, the user should also have orgpolicy.policy.set permission on the deleted folder to remove Assured Workloads OrgPolicies.
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/workloads/delete

name <> 

optional:
etag <string> Optional. The etag of the workload. If this is provided, it must match the server's etag."
  ([name] (organizations-locations-workloads-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://assuredworkloads.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-workloads-restrictAllowedResources
  "Restrict the list of resources allowed in the Workload environment. The current list of allowed products can be found at https://cloud.google.com/assured-workloads/docs/supported-products In addition to assuredworkloads.workload.update permission, the user should also have orgpolicy.policy.set permission on the folder resource to use this functionality.
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/workloads/restrictAllowedResources

name <> 
GoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest:
GoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest"
  [name GoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest]
  {:method :post,
   :uri-template
   "https://assuredworkloads.googleapis.com/v1/{+name}:restrictAllowedResources",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest})

(defn organizations-locations-workloads-patch
  "Updates an existing workload. Currently allows updating of workload display_name and labels. For force updates don't set etag field in the Workload. Only one update operation per workload can be in progress.
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/workloads/patch

name <> 
GoogleCloudAssuredworkloadsV1Workload:
GoogleCloudAssuredworkloadsV1Workload

optional:
updateMask <string> Required. The list of fields to be updated."
  ([name GoogleCloudAssuredworkloadsV1Workload]
    (organizations-locations-workloads-patch
      name
      GoogleCloudAssuredworkloadsV1Workload
      nil))
  ([name GoogleCloudAssuredworkloadsV1Workload optional]
    {:method :patch,
     :uri-template
     "https://assuredworkloads.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAssuredworkloadsV1Workload}))

(defn organizations-locations-workloads-enableResourceMonitoring
  "Enable resource violation monitoring for a workload.
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/workloads/enableResourceMonitoring

name <> "
  [name]
  {:method :post,
   :uri-template
   "https://assuredworkloads.googleapis.com/v1/{+name}:enableResourceMonitoring",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-locations-workloads-create
  "Creates Assured Workload.
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/workloads/create

parent <> 
GoogleCloudAssuredworkloadsV1Workload:
GoogleCloudAssuredworkloadsV1Workload

optional:
externalId <string> Optional. A identifier associated with the workload and underlying projects which allows for the break down of billing costs for a workload. The value provided for the identifier will add a label to the workload and contained projects with the identifier as the value."
  ([parent GoogleCloudAssuredworkloadsV1Workload]
    (organizations-locations-workloads-create
      parent
      GoogleCloudAssuredworkloadsV1Workload
      nil))
  ([parent GoogleCloudAssuredworkloadsV1Workload optional]
    {:method :post,
     :uri-template
     "https://assuredworkloads.googleapis.com/v1/{+parent}/workloads",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudAssuredworkloadsV1Workload}))

(defn organizations-locations-workloads-get
  "Gets Assured Workload associated with a CRM Node
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/workloads/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://assuredworkloads.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-locations-workloads-mutatePartnerPermissions
  "Update the permissions settings for an existing partner workload. For force updates don't set etag field in the Workload. Only one update operation per workload can be in progress.
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/workloads/mutatePartnerPermissions

name <> 
GoogleCloudAssuredworkloadsV1MutatePartnerPermissionsRequest:
GoogleCloudAssuredworkloadsV1MutatePartnerPermissionsRequest"
  [name GoogleCloudAssuredworkloadsV1MutatePartnerPermissionsRequest]
  {:method :patch,
   :uri-template
   "https://assuredworkloads.googleapis.com/v1/{+name}:mutatePartnerPermissions",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudAssuredworkloadsV1MutatePartnerPermissionsRequest})

(defn organizations-locations-workloads-violations-acknowledge
  "Acknowledges an existing violation. By acknowledging a violation, users acknowledge the existence of a compliance violation in their workload and decide to ignore it due to a valid business justification. Acknowledgement is a permanent operation and it cannot be reverted.
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/workloads/violations/acknowledge

name <> 
GoogleCloudAssuredworkloadsV1AcknowledgeViolationRequest:
GoogleCloudAssuredworkloadsV1AcknowledgeViolationRequest"
  [name GoogleCloudAssuredworkloadsV1AcknowledgeViolationRequest]
  {:method :post,
   :uri-template
   "https://assuredworkloads.googleapis.com/v1/{+name}:acknowledge",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudAssuredworkloadsV1AcknowledgeViolationRequest})

(defn organizations-locations-workloads-violations-list
  "Lists the Violations in the AssuredWorkload Environment. Callers may also choose to read across multiple Workloads as per [AIP-159](https://google.aip.dev/159) by using '-' (the hyphen or dash character) as a wildcard character instead of workload-id in the parent. Format `organizations/{org_id}/locations/{location}/workloads/-`
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/workloads/violations/list

parent <> 

optional:
interval.startTime <string> The start of the time window.
pageSize <integer> Optional. Page size.
interval.endTime <string> The end of the time window.
filter <string> Optional. A custom filter for filtering by the Violations properties."
  ([parent]
    (organizations-locations-workloads-violations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://assuredworkloads.googleapis.com/v1/{+parent}/violations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-workloads-violations-get
  "Retrieves Assured Workload Violation based on ID.
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/workloads/violations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://assuredworkloads.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://assuredworkloads.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/learnmoreurl/v1/reference/rest/v1/organizations/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (organizations-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://assuredworkloads.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
