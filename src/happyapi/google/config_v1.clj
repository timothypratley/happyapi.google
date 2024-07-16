(ns happyapi.google.config-v1
  "Infrastructure Manager API
Creates and manages Google Cloud Platform resources and infrastructure.
See: https://cloud.google.com/infrastructure-manager/docs"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://config.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://config.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://config.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://config.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://config.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://config.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-deployments-list
  "Lists Deployments in a given project and location.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/list

parent <> 

optional:
pageSize <integer> When requesting a page of resources, 'page_size' specifies number of resources to return. If unspecified, at most 500 will be returned. The maximum value is 1000.
filter <string> Lists the Deployments that match the filter expression. A filter expression filters the resources listed in the response. The expression must be of the form '{field} {operator} {value}' where operators: '<', '>', '<=', '>=', '!=', '=', ':' are supported (colon ':' represents a HAS operator which is roughly synonymous with equality). {field} can refer to a proto or JSON field, or a synthetic field. Field names can be camelCase or snake_case. Examples: - Filter by name: name = \"projects/foo/locations/us-central1/deployments/bar - Filter by labels: - Resources that have a key called 'foo' labels.foo:* - Resources that have a key called 'foo' whose value is 'bar' labels.foo = bar - Filter by state: - Deployments in CREATING state. state=CREATING
orderBy <string> Field to use to sort the list."
  ([parent] (projects-locations-deployments-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://config.googleapis.com/v1/{+parent}/deployments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-deployments-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://config.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-deployments-exportLock
  "Exports the lock info on a locked deployment.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/exportLock

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://config.googleapis.com/v1/{+name}:exportLock",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deployments-delete
  "Deletes a Deployment.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
force <boolean> Optional. If set to true, any revisions for this deployment will also be deleted. (Otherwise, the request will only work if the deployment has no revisions.)
deletePolicy <string> Optional. Policy on how resources actuated by the deployment should be deleted. If unspecified, the default behavior is to delete the underlying resources."
  ([name] (projects-locations-deployments-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://config.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-deployments-unlock
  "Unlocks a locked deployment.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/unlock

name <> 
UnlockDeploymentRequest:
UnlockDeploymentRequest"
  [name UnlockDeploymentRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://config.googleapis.com/v1/{+name}:unlock",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UnlockDeploymentRequest}))

(defn projects-locations-deployments-deleteState
  "Deletes Terraform state file in a given deployment.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/deleteState

name <> 
DeleteStatefileRequest:
DeleteStatefileRequest"
  [name DeleteStatefileRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://config.googleapis.com/v1/{+name}:deleteState",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body DeleteStatefileRequest}))

(defn projects-locations-deployments-importState
  "Imports Terraform state file in a given deployment. The state file does not take effect until the Deployment has been unlocked.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/importState

parent <> 
ImportStatefileRequest:
ImportStatefileRequest"
  [parent ImportStatefileRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://config.googleapis.com/v1/{+parent}:importState",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ImportStatefileRequest}))

(defn projects-locations-deployments-exportState
  "Exports Terraform state file from a given deployment.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/exportState

parent <> 
ExportDeploymentStatefileRequest:
ExportDeploymentStatefileRequest"
  [parent ExportDeploymentStatefileRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://config.googleapis.com/v1/{+parent}:exportState",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ExportDeploymentStatefileRequest}))

(defn projects-locations-deployments-patch
  "Updates a Deployment.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/patch

name <> 
Deployment:
Deployment

optional:
updateMask <string> Optional. Field mask used to specify the fields to be overwritten in the Deployment resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Deployment]
    (projects-locations-deployments-patch name Deployment nil))
  ([name Deployment optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://config.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Deployment})))

(defn projects-locations-deployments-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-deployments-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://config.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-deployments-lock
  "Locks a deployment.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/lock

name <> 
LockDeploymentRequest:
LockDeploymentRequest"
  [name LockDeploymentRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://config.googleapis.com/v1/{+name}:lock",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body LockDeploymentRequest}))

(defn projects-locations-deployments-create
  "Creates a Deployment.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/create

parent <> 
Deployment:
Deployment

optional:
deploymentId <string> Required. The Deployment ID.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent Deployment]
    (projects-locations-deployments-create parent Deployment nil))
  ([parent Deployment optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://config.googleapis.com/v1/{+parent}/deployments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Deployment})))

(defn projects-locations-deployments-get
  "Gets details about a Deployment.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://config.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deployments-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://config.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-deployments-revisions-list
  "Lists Revisions of a deployment.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/revisions/list

parent <> 

optional:
pageSize <integer> When requesting a page of resources, `page_size` specifies number of resources to return. If unspecified, at most 500 will be returned. The maximum value is 1000.
filter <string> Lists the Revisions that match the filter expression. A filter expression filters the resources listed in the response. The expression must be of the form '{field} {operator} {value}' where operators: '<', '>', '<=', '>=', '!=', '=', ':' are supported (colon ':' represents a HAS operator which is roughly synonymous with equality). {field} can refer to a proto or JSON field, or a synthetic field. Field names can be camelCase or snake_case. Examples: - Filter by name: name = \"projects/foo/locations/us-central1/deployments/dep/revisions/bar - Filter by labels: - Resources that have a key called 'foo' labels.foo:* - Resources that have a key called 'foo' whose value is 'bar' labels.foo = bar - Filter by state: - Revisions in CREATING state. state=CREATING
orderBy <string> Field to use to sort the list."
  ([parent] (projects-locations-deployments-revisions-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://config.googleapis.com/v1/{+parent}/revisions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-deployments-revisions-get
  "Gets details about a Revision.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/revisions/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://config.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deployments-revisions-exportState
  "Exports Terraform state file from a given revision.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/revisions/exportState

parent <> 
ExportRevisionStatefileRequest:
ExportRevisionStatefileRequest"
  [parent ExportRevisionStatefileRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://config.googleapis.com/v1/{+parent}:exportState",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ExportRevisionStatefileRequest}))

(defn projects-locations-deployments-revisions-resources-get
  "Gets details about a Resource deployed by Infra Manager.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/revisions/resources/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://config.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deployments-revisions-resources-list
  "Lists Resources in a given revision.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/deployments/revisions/resources/list

parent <> 

optional:
pageSize <integer> When requesting a page of resources, 'page_size' specifies number of resources to return. If unspecified, at most 500 will be returned. The maximum value is 1000.
filter <string> Lists the Resources that match the filter expression. A filter expression filters the resources listed in the response. The expression must be of the form '{field} {operator} {value}' where operators: '<', '>', '<=', '>=', '!=', '=', ':' are supported (colon ':' represents a HAS operator which is roughly synonymous with equality). {field} can refer to a proto or JSON field, or a synthetic field. Field names can be camelCase or snake_case. Examples: - Filter by name: name = \"projects/foo/locations/us-central1/deployments/dep/revisions/bar/resources/baz
orderBy <string> Field to use to sort the list."
  ([parent]
    (projects-locations-deployments-revisions-resources-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://config.googleapis.com/v1/{+parent}/resources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-previews-create
  "Creates a Preview.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/previews/create

parent <> 
Preview:
Preview

optional:
previewId <string> Optional. The preview ID.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent Preview]
    (projects-locations-previews-create parent Preview nil))
  ([parent Preview optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://config.googleapis.com/v1/{+parent}/previews",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Preview})))

(defn projects-locations-previews-get
  "Gets details about a Preview.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/previews/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://config.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-previews-list
  "Lists Previews in a given project and location.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/previews/list

parent <> 

optional:
pageSize <integer> Optional. When requesting a page of resources, 'page_size' specifies number of resources to return. If unspecified, at most 500 will be returned. The maximum value is 1000.
filter <string> Optional. Lists the Deployments that match the filter expression. A filter expression filters the resources listed in the response. The expression must be of the form '{field} {operator} {value}' where operators: '<', '>', '<=', '>=', '!=', '=', ':' are supported (colon ':' represents a HAS operator which is roughly synonymous with equality). {field} can refer to a proto or JSON field, or a synthetic field. Field names can be camelCase or snake_case. Examples: - Filter by name: name = \"projects/foo/locations/us-central1/deployments/bar - Filter by labels: - Resources that have a key called 'foo' labels.foo:* - Resources that have a key called 'foo' whose value is 'bar' labels.foo = bar - Filter by state: - Deployments in CREATING state. state=CREATING
orderBy <string> Optional. Field to use to sort the list."
  ([parent] (projects-locations-previews-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://config.googleapis.com/v1/{+parent}/previews",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-previews-delete
  "Deletes a Preview.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/previews/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-previews-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://config.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-previews-export
  "Export Preview results.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/previews/export

parent <> 
ExportPreviewResultRequest:
ExportPreviewResultRequest"
  [parent ExportPreviewResultRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://config.googleapis.com/v1/{+parent}:export",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ExportPreviewResultRequest}))

(defn projects-locations-terraformVersions-list
  "Lists TerraformVersions in a given project and location.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/terraformVersions/list

parent <> 

optional:
pageSize <integer> Optional. When requesting a page of resources, 'page_size' specifies number of resources to return. If unspecified, at most 500 will be returned. The maximum value is 1000.
filter <string> Optional. Lists the TerraformVersions that match the filter expression. A filter expression filters the resources listed in the response. The expression must be of the form '{field} {operator} {value}' where operators: '<', '>', '<=', '>=', '!=', '=', ':' are supported (colon ':' represents a HAS operator which is roughly synonymous with equality). {field} can refer to a proto or JSON field, or a synthetic field. Field names can be camelCase or snake_case.
orderBy <string> Optional. Field to use to sort the list."
  ([parent] (projects-locations-terraformVersions-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://config.googleapis.com/v1/{+parent}/terraformVersions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-terraformVersions-get
  "Gets details about a TerraformVersion.
https://cloud.google.com/infrastructure-manager/docs/v1/reference/rest/v1/projects/locations/terraformVersions/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://config.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
