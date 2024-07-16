(ns happyapi.google.gkehub-v1
  "GKE Hub API

See: https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-memberships-list
  "Lists Memberships in a given project and location.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/list

parent <> 

optional:
pageSize <integer> Optional. When requesting a 'page' of resources, `page_size` specifies number of resources to return. If unspecified or set to 0, all resources will be returned.
filter <string> Optional. Lists Memberships that match the filter expression, following the syntax outlined in https://google.aip.dev/160. Examples: - Name is `bar` in project `foo-proj` and location `global`: name = \"projects/foo-proj/locations/global/membership/bar\" - Memberships that have a label called `foo`: labels.foo:* - Memberships that have a label called `foo` whose value is `bar`: labels.foo = bar - Memberships in the CREATING state: state = CREATING
orderBy <string> Optional. One or more fields to compare and use to sort the output. See https://google.aip.dev/132#ordering."
  ([parent] (projects-locations-memberships-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/memberships",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-memberships-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://gkehub.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-memberships-delete
  "Removes a Membership. **This is currently only supported for GKE clusters on Google Cloud**. To unregister other clusters, follow the instructions at https://cloud.google.com/anthos/multicluster-management/connect/unregistering-a-cluster.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
force <boolean> Optional. If set to true, any subresource from this Membership will also be deleted. Otherwise, the request will only work if the Membership has no subresource."
  ([name] (projects-locations-memberships-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://gkehub.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-memberships-patch
  "Updates an existing Membership.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/patch

name <> 
Membership:
Membership

optional:
updateMask <string> Required. Mask of fields to update.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Membership]
    (projects-locations-memberships-patch name Membership nil))
  ([name Membership optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://gkehub.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Membership})))

(defn projects-locations-memberships-generateConnectManifest
  "Generates the manifest for deployment of the GKE connect agent. **This method is used internally by Google-provided libraries.** Most clients should not need to call this method directly.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/generateConnectManifest

name <> 

optional:
namespace <string> Optional. Namespace for GKE Connect agent resources. Defaults to `gke-connect`. The Connect Agent is authorized automatically when run in the default namespace. Otherwise, explicit authorization must be granted with an additional IAM binding.
proxy <string> Optional. URI of a proxy if connectivity from the agent to gkeconnect.googleapis.com requires the use of a proxy. Format must be in the form `http(s)://{proxy_address}`, depending on the HTTP/HTTPS protocol supported by the proxy. This will direct the connect agent's outbound traffic through a HTTP(S) proxy.
version <string> Optional. The Connect agent version to use. Defaults to the most current version.
isUpgrade <boolean> Optional. If true, generate the resources for upgrade only. Some resources generated only for installation (e.g. secrets) will be excluded.
registry <string> Optional. The registry to fetch the connect agent image from. Defaults to gcr.io/gkeconnect.
imagePullSecretContent <string> Optional. The image pull secret content for the registry, if not public."
  ([name]
    (projects-locations-memberships-generateConnectManifest name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+name}:generateConnectManifest",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-memberships-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-memberships-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-memberships-create
  "Creates a new Membership. **This is currently only supported for GKE clusters on Google Cloud**. To register other clusters, follow the instructions at https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/create

parent <> 
Membership:
Membership

optional:
membershipId <string> Required. Client chosen ID for the membership. `membership_id` must be a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum length of 63 characters.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent Membership]
    (projects-locations-memberships-create parent Membership nil))
  ([parent Membership optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/memberships",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Membership})))

(defn projects-locations-memberships-get
  "Gets the details of a Membership.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-memberships-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://gkehub.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-memberships-bindings-get
  "Returns the details of a MembershipBinding.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/bindings/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-memberships-bindings-create
  "Creates a MembershipBinding.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/bindings/create

parent <> 
MembershipBinding:
MembershipBinding

optional:
membershipBindingId <string> Required. The ID to use for the MembershipBinding."
  ([parent MembershipBinding]
    (projects-locations-memberships-bindings-create
      parent
      MembershipBinding
      nil))
  ([parent MembershipBinding optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/bindings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body MembershipBinding})))

(defn projects-locations-memberships-bindings-patch
  "Updates a MembershipBinding.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/bindings/patch

name <> 
MembershipBinding:
MembershipBinding

optional:
updateMask <string> Required. The fields to be updated."
  ([name MembershipBinding]
    (projects-locations-memberships-bindings-patch
      name
      MembershipBinding
      nil))
  ([name MembershipBinding optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://gkehub.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body MembershipBinding})))

(defn projects-locations-memberships-bindings-delete
  "Deletes a MembershipBinding.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/bindings/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-memberships-bindings-list
  "Lists MembershipBindings.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/bindings/list

parent <> 

optional:
pageSize <integer> Optional. When requesting a 'page' of resources, `page_size` specifies number of resources to return. If unspecified or set to 0, all resources will be returned.
filter <string> Optional. Lists MembershipBindings that match the filter expression, following the syntax outlined in https://google.aip.dev/160."
  ([parent] (projects-locations-memberships-bindings-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/bindings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-memberships-rbacrolebindings-get
  "Returns the details of a Membership RBACRoleBinding.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/rbacrolebindings/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-memberships-rbacrolebindings-create
  "Creates a Membership RBACRoleBinding.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/rbacrolebindings/create

parent <> 
RBACRoleBinding:
RBACRoleBinding

optional:
rbacrolebindingId <string> Required. Client chosen ID for the RBACRoleBinding. `rbacrolebinding_id` must be a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum length of 63 characters."
  ([parent RBACRoleBinding]
    (projects-locations-memberships-rbacrolebindings-create
      parent
      RBACRoleBinding
      nil))
  ([parent RBACRoleBinding optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/rbacrolebindings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body RBACRoleBinding})))

(defn projects-locations-memberships-rbacrolebindings-patch
  "Updates a Membership RBACRoleBinding.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/rbacrolebindings/patch

name <> 
RBACRoleBinding:
RBACRoleBinding

optional:
updateMask <string> Required. The fields to be updated."
  ([name RBACRoleBinding]
    (projects-locations-memberships-rbacrolebindings-patch
      name
      RBACRoleBinding
      nil))
  ([name RBACRoleBinding optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://gkehub.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body RBACRoleBinding})))

(defn projects-locations-memberships-rbacrolebindings-delete
  "Deletes a Membership RBACRoleBinding.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/rbacrolebindings/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-memberships-rbacrolebindings-list
  "Lists all Membership RBACRoleBindings.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/rbacrolebindings/list

parent <> 

optional:
pageSize <integer> Optional. When requesting a 'page' of resources, `page_size` specifies number of resources to return. If unspecified or set to 0, all resources will be returned."
  ([parent]
    (projects-locations-memberships-rbacrolebindings-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/rbacrolebindings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-memberships-rbacrolebindings-generateMembershipRBACRoleBindingYAML
  "Generates a YAML of the RBAC policies for the specified RoleBinding and its associated impersonation resources.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/memberships/rbacrolebindings/generateMembershipRBACRoleBindingYAML

parent <> 
RBACRoleBinding:
RBACRoleBinding

optional:
rbacrolebindingId <string> Required. Client chosen ID for the RBACRoleBinding. `rbacrolebinding_id` must be a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum length of 63 characters."
  ([parent RBACRoleBinding]
    (projects-locations-memberships-rbacrolebindings-generateMembershipRBACRoleBindingYAML
      parent
      RBACRoleBinding
      nil))
  ([parent RBACRoleBinding optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/rbacrolebindings:generateMembershipRBACRoleBindingYAML",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body RBACRoleBinding})))

(defn projects-locations-scopes-list
  "Lists Scopes.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/list

parent <> 

optional:
pageSize <integer> Optional. When requesting a 'page' of resources, `page_size` specifies number of resources to return. If unspecified or set to 0, all resources will be returned."
  ([parent] (projects-locations-scopes-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/scopes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-scopes-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://gkehub.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-scopes-delete
  "Deletes a Scope.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-scopes-patch
  "Updates a scopes.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/patch

name <> 
Scope:
Scope

optional:
updateMask <string> Required. The fields to be updated."
  ([name Scope] (projects-locations-scopes-patch name Scope nil))
  ([name Scope optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://gkehub.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Scope})))

(defn projects-locations-scopes-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-scopes-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-scopes-listMemberships
  "Lists Memberships bound to a Scope. The response includes relevant Memberships from all regions.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/listMemberships

scopeName <> 

optional:
filter <string> Optional. Lists Memberships that match the filter expression, following the syntax outlined in https://google.aip.dev/160. Currently, filtering can be done only based on Memberships's `name`, `labels`, `create_time`, `update_time`, and `unique_id`.
pageSize <integer> Optional. When requesting a 'page' of resources, `page_size` specifies number of resources to return. If unspecified or set to 0, all resources will be returned. Pagination is currently not supported; therefore, setting this field does not have any impact for now."
  ([scopeName]
    (projects-locations-scopes-listMemberships scopeName nil))
  ([scopeName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+scopeName}:listMemberships",
       :uri-template-args {"scopeName" scopeName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-scopes-create
  "Creates a Scope.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/create

parent <> 
Scope:
Scope

optional:
scopeId <string> Required. Client chosen ID for the Scope. `scope_id` must be a ????"
  ([parent Scope] (projects-locations-scopes-create parent Scope nil))
  ([parent Scope optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/scopes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Scope})))

(defn projects-locations-scopes-listPermitted
  "Lists permitted Scopes.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/listPermitted

parent <> 

optional:
pageSize <integer> Optional. When requesting a 'page' of resources, `page_size` specifies number of resources to return. If unspecified or set to 0, all resources will be returned."
  ([parent] (projects-locations-scopes-listPermitted parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/scopes:listPermitted",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-scopes-get
  "Returns the details of a Scope.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-scopes-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://gkehub.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-scopes-namespaces-get
  "Returns the details of a fleet namespace.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/namespaces/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-scopes-namespaces-create
  "Creates a fleet namespace.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/namespaces/create

parent <> 
Namespace:
Namespace

optional:
scopeNamespaceId <string> Required. Client chosen ID for the Namespace. `namespace_id` must be a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum length of 63 characters."
  ([parent Namespace]
    (projects-locations-scopes-namespaces-create parent Namespace nil))
  ([parent Namespace optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/namespaces",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Namespace})))

(defn projects-locations-scopes-namespaces-patch
  "Updates a fleet namespace.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/namespaces/patch

name <> 
Namespace:
Namespace

optional:
updateMask <string> Required. The fields to be updated."
  ([name Namespace]
    (projects-locations-scopes-namespaces-patch name Namespace nil))
  ([name Namespace optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://gkehub.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Namespace})))

(defn projects-locations-scopes-namespaces-delete
  "Deletes a fleet namespace.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/namespaces/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-scopes-namespaces-list
  "Lists fleet namespaces.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/namespaces/list

parent <> 

optional:
pageSize <integer> Optional. When requesting a 'page' of resources, `page_size` specifies number of resources to return. If unspecified or set to 0, all resources will be returned."
  ([parent] (projects-locations-scopes-namespaces-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/namespaces",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-scopes-rbacrolebindings-get
  "Returns the details of a Scope RBACRoleBinding.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/rbacrolebindings/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-scopes-rbacrolebindings-create
  "Creates a Scope RBACRoleBinding.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/rbacrolebindings/create

parent <> 
RBACRoleBinding:
RBACRoleBinding

optional:
rbacrolebindingId <string> Required. Client chosen ID for the RBACRoleBinding. `rbacrolebinding_id` must be a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum length of 63 characters."
  ([parent RBACRoleBinding]
    (projects-locations-scopes-rbacrolebindings-create
      parent
      RBACRoleBinding
      nil))
  ([parent RBACRoleBinding optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/rbacrolebindings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body RBACRoleBinding})))

(defn projects-locations-scopes-rbacrolebindings-patch
  "Updates a Scope RBACRoleBinding.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/rbacrolebindings/patch

name <> 
RBACRoleBinding:
RBACRoleBinding

optional:
updateMask <string> Required. The fields to be updated."
  ([name RBACRoleBinding]
    (projects-locations-scopes-rbacrolebindings-patch
      name
      RBACRoleBinding
      nil))
  ([name RBACRoleBinding optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://gkehub.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body RBACRoleBinding})))

(defn projects-locations-scopes-rbacrolebindings-delete
  "Deletes a Scope RBACRoleBinding.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/rbacrolebindings/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-scopes-rbacrolebindings-list
  "Lists all Scope RBACRoleBindings.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/scopes/rbacrolebindings/list

parent <> 

optional:
pageSize <integer> Optional. When requesting a 'page' of resources, `page_size` specifies number of resources to return. If unspecified or set to 0, all resources will be returned."
  ([parent]
    (projects-locations-scopes-rbacrolebindings-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/rbacrolebindings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-features-list
  "Lists Features in a given project and location.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/features/list

parent <> 

optional:
pageSize <integer> When requesting a 'page' of resources, `page_size` specifies number of resources to return. If unspecified or set to 0, all resources will be returned.
filter <string> Lists Features that match the filter expression, following the syntax outlined in https://google.aip.dev/160. Examples: - Feature with the name \"servicemesh\" in project \"foo-proj\": name = \"projects/foo-proj/locations/global/features/servicemesh\" - Features that have a label called `foo`: labels.foo:* - Features that have a label called `foo` whose value is `bar`: labels.foo = bar
orderBy <string> One or more fields to compare and use to sort the output. See https://google.aip.dev/132#ordering."
  ([parent] (projects-locations-features-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/features",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-features-get
  "Gets details of a single Feature.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/features/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-features-create
  "Adds a new Feature.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/features/create

parent <> 
Feature:
Feature

optional:
featureId <string> The ID of the feature to create.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent Feature]
    (projects-locations-features-create parent Feature nil))
  ([parent Feature optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/features",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Feature})))

(defn projects-locations-features-delete
  "Removes a Feature.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/features/delete

name <> 

optional:
force <boolean> If set to true, the delete will ignore any outstanding resources for this Feature (that is, `FeatureState.has_resources` is set to true). These resources will NOT be cleaned up or modified in any way.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-features-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://gkehub.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-features-patch
  "Updates an existing Feature.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/features/patch

name <> 
Feature:
Feature

optional:
updateMask <string> Mask of fields to update.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Feature] (projects-locations-features-patch name Feature nil))
  ([name Feature optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://gkehub.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Feature})))

(defn projects-locations-features-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/features/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://gkehub.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-features-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/features/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-features-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-features-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/features/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://gkehub.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-fleets-create
  "Creates a fleet.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/fleets/create

parent <> 
Fleet:
Fleet"
  [parent Fleet]
  (client/api-request
    {:method :post,
     :uri-template "https://gkehub.googleapis.com/v1/{+parent}/fleets",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Fleet}))

(defn projects-locations-fleets-get
  "Returns the details of a fleet.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/fleets/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-fleets-patch
  "Updates a fleet.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/fleets/patch

name <> 
Fleet:
Fleet

optional:
updateMask <string> Required. The fields to be updated;"
  ([name Fleet] (projects-locations-fleets-patch name Fleet nil))
  ([name Fleet optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://gkehub.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Fleet})))

(defn projects-locations-fleets-delete
  "Removes a Fleet. There must be no memberships remaining in the Fleet.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/fleets/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://gkehub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-fleets-list
  "Returns all fleets within an organization or a project that the caller has access to.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/projects/locations/fleets/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of fleets to return. The service may return fewer than this value. If unspecified, at most 200 fleets will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-fleets-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/fleets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-fleets-list
  "Returns all fleets within an organization or a project that the caller has access to.
https://cloud.google.com/kubernetes-engine/fleet-management/docs/fleet-creation/v1/reference/rest/v1/organizations/locations/fleets/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of fleets to return. The service may return fewer than this value. If unspecified, at most 200 fleets will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (organizations-locations-fleets-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://gkehub.googleapis.com/v1/{+parent}/fleets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
