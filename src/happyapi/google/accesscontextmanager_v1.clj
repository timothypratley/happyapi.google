(ns happyapi.google.accesscontextmanager-v1
  "Access Context Manager API
An API for setting attribute based access control to requests to Google Cloud services. *Warning:* Do not mix *v1alpha* and *v1* API usage in the same access policy. The v1alpha API supports new Access Context Manager features, which may have different attributes or behaviors that are not supported by v1. The practice of mixed API usage within a policy may result in the inability to update that policy, including any access levels or service perimeters belonging to it. It is not recommended to use both v1 and v1alpha for modifying policies with critical service perimeters. Modifications using v1alpha should be limited to policies with non-production/non-critical service perimeters.
See: https://cloud.google.com/access-context-manager/docs/reference/rest/"
  (:require [happyapi.providers.google :as client]))

(defn operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://accesscontextmanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn accessPolicies-list
  "Lists all access policies in an organization.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/list

optional:
parent <string> Required. Resource name for the container to list AccessPolicy instances from. Format: `organizations/{org_id}`
pageSize <integer> Number of AccessPolicy instances to include in the list. Default 100."
  ([] (accessPolicies-list nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://accesscontextmanager.googleapis.com/v1/accessPolicies",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn accessPolicies-get
  "Returns an access policy based on the name.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn accessPolicies-create
  "Creates an access policy. This method fails if the organization already has an access policy. The long-running operation has a successful status after the access policy propagates to long-lasting storage. Syntactic and basic semantic errors are returned in `metadata` as a BadRequest proto.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/create

AccessPolicy:
AccessPolicy"
  [AccessPolicy]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/accessPolicies",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AccessPolicy}))

(defn accessPolicies-patch
  "Updates an access policy. The long-running operation from this RPC has a successful status after the changes to the access policy propagate to long-lasting storage.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/patch

name <> 
AccessPolicy:
AccessPolicy

optional:
updateMask <string> Required. Mask to control which fields get updated. Must be non-empty."
  ([name AccessPolicy] (accessPolicies-patch name AccessPolicy nil))
  ([name AccessPolicy optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://accesscontextmanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body AccessPolicy})))

(defn accessPolicies-delete
  "Deletes an access policy based on the resource name. The long-running operation has a successful status after the access policy is removed from long-lasting storage.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn accessPolicies-setIamPolicy
  "Sets the IAM policy for the specified Access Context Manager access policy. This method replaces the existing IAM policy on the access policy. The IAM policy controls the set of users who can perform specific operations on the Access Context Manager access policy.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn accessPolicies-getIamPolicy
  "Gets the IAM policy for the specified Access Context Manager access policy.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GetIamPolicyRequest}))

(defn accessPolicies-testIamPermissions
  "Returns the IAM permissions that the caller has on the specified Access Context Manager resource. The resource can be an AccessPolicy, AccessLevel, or ServicePerimeter. This method does not support other resources.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn accessPolicies-accessLevels-list
  "Lists all access levels for an access policy.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/accessLevels/list

parent <> 

optional:
pageSize <integer> Number of Access Levels to include in the list. Default 100.
accessLevelFormat <string> Whether to return `BasicLevels` in the Cloud Common Expression language, as `CustomLevels`, rather than as `BasicLevels`. Defaults to returning `AccessLevels` in the format they were defined."
  ([parent] (accessPolicies-accessLevels-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://accesscontextmanager.googleapis.com/v1/{+parent}/accessLevels",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn accessPolicies-accessLevels-get
  "Gets an access level based on the resource name.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/accessLevels/get

name <> 

optional:
accessLevelFormat <string> Whether to return `BasicLevels` in the Cloud Common Expression Language rather than as `BasicLevels`. Defaults to AS_DEFINED, where Access Levels are returned as `BasicLevels` or `CustomLevels` based on how they were created. If set to CEL, all Access Levels are returned as `CustomLevels`. In the CEL case, `BasicLevels` are translated to equivalent `CustomLevels`."
  ([name] (accessPolicies-accessLevels-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://accesscontextmanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn accessPolicies-accessLevels-create
  "Creates an access level. The long-running operation from this RPC has a successful status after the access level propagates to long-lasting storage. If access levels contain errors, an error response is returned for the first error encountered.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/accessLevels/create

parent <> 
AccessLevel:
AccessLevel"
  [parent AccessLevel]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+parent}/accessLevels",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AccessLevel}))

(defn accessPolicies-accessLevels-patch
  "Updates an access level. The long-running operation from this RPC has a successful status after the changes to the access level propagate to long-lasting storage. If access levels contain errors, an error response is returned for the first error encountered.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/accessLevels/patch

name <> 
AccessLevel:
AccessLevel

optional:
updateMask <string> Required. Mask to control which fields get updated. Must be non-empty."
  ([name AccessLevel]
    (accessPolicies-accessLevels-patch name AccessLevel nil))
  ([name AccessLevel optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://accesscontextmanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body AccessLevel})))

(defn accessPolicies-accessLevels-delete
  "Deletes an access level based on the resource name. The long-running operation from this RPC has a successful status after the access level has been removed from long-lasting storage.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/accessLevels/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn accessPolicies-accessLevels-replaceAll
  "Replaces all existing access levels in an access policy with the access levels provided. This is done atomically. The long-running operation from this RPC has a successful status after all replacements propagate to long-lasting storage. If the replacement contains errors, an error response is returned for the first error encountered. Upon error, the replacement is cancelled, and existing access levels are not affected. The Operation.response field contains ReplaceAccessLevelsResponse. Removing access levels contained in existing service perimeters result in an error.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/accessLevels/replaceAll

parent <> 
ReplaceAccessLevelsRequest:
ReplaceAccessLevelsRequest"
  [parent ReplaceAccessLevelsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+parent}/accessLevels:replaceAll",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ReplaceAccessLevelsRequest}))

(defn accessPolicies-accessLevels-testIamPermissions
  "Returns the IAM permissions that the caller has on the specified Access Context Manager resource. The resource can be an AccessPolicy, AccessLevel, or ServicePerimeter. This method does not support other resources.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/accessLevels/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn accessPolicies-servicePerimeters-list
  "Lists all service perimeters for an access policy.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/servicePerimeters/list

parent <> 

optional:
pageSize <integer> Number of Service Perimeters to include in the list. Default 100."
  ([parent] (accessPolicies-servicePerimeters-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://accesscontextmanager.googleapis.com/v1/{+parent}/servicePerimeters",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn accessPolicies-servicePerimeters-get
  "Gets a service perimeter based on the resource name.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/servicePerimeters/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn accessPolicies-servicePerimeters-create
  "Creates a service perimeter. The long-running operation from this RPC has a successful status after the service perimeter propagates to long-lasting storage. If a service perimeter contains errors, an error response is returned for the first error encountered.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/servicePerimeters/create

parent <> 
ServicePerimeter:
ServicePerimeter"
  [parent ServicePerimeter]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+parent}/servicePerimeters",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ServicePerimeter}))

(defn accessPolicies-servicePerimeters-patch
  "Updates a service perimeter. The long-running operation from this RPC has a successful status after the service perimeter propagates to long-lasting storage. If a service perimeter contains errors, an error response is returned for the first error encountered.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/servicePerimeters/patch

name <> 
ServicePerimeter:
ServicePerimeter

optional:
updateMask <string> Required. Mask to control which fields get updated. Must be non-empty."
  ([name ServicePerimeter]
    (accessPolicies-servicePerimeters-patch name ServicePerimeter nil))
  ([name ServicePerimeter optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://accesscontextmanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ServicePerimeter})))

(defn accessPolicies-servicePerimeters-delete
  "Deletes a service perimeter based on the resource name. The long-running operation from this RPC has a successful status after the service perimeter is removed from long-lasting storage.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/servicePerimeters/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn accessPolicies-servicePerimeters-replaceAll
  "Replace all existing service perimeters in an access policy with the service perimeters provided. This is done atomically. The long-running operation from this RPC has a successful status after all replacements propagate to long-lasting storage. Replacements containing errors result in an error response for the first error encountered. Upon an error, replacement are cancelled and existing service perimeters are not affected. The Operation.response field contains ReplaceServicePerimetersResponse.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/servicePerimeters/replaceAll

parent <> 
ReplaceServicePerimetersRequest:
ReplaceServicePerimetersRequest"
  [parent ReplaceServicePerimetersRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+parent}/servicePerimeters:replaceAll",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ReplaceServicePerimetersRequest}))

(defn accessPolicies-servicePerimeters-commit
  "Commits the dry-run specification for all the service perimeters in an access policy. A commit operation on a service perimeter involves copying its `spec` field to the `status` field of the service perimeter. Only service perimeters with `use_explicit_dry_run_spec` field set to true are affected by a commit operation. The long-running operation from this RPC has a successful status after the dry-run specifications for all the service perimeters have been committed. If a commit fails, it causes the long-running operation to return an error response and the entire commit operation is cancelled. When successful, the Operation.response field contains CommitServicePerimetersResponse. The `dry_run` and the `spec` fields are cleared after a successful commit operation.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/servicePerimeters/commit

parent <> 
CommitServicePerimetersRequest:
CommitServicePerimetersRequest"
  [parent CommitServicePerimetersRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+parent}/servicePerimeters:commit",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CommitServicePerimetersRequest}))

(defn accessPolicies-servicePerimeters-testIamPermissions
  "Returns the IAM permissions that the caller has on the specified Access Context Manager resource. The resource can be an AccessPolicy, AccessLevel, or ServicePerimeter. This method does not support other resources.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/servicePerimeters/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn accessPolicies-authorizedOrgsDescs-list
  "Lists all authorized orgs descs for an access policy.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/authorizedOrgsDescs/list

parent <> 

optional:
pageSize <integer> Number of Authorized Orgs Descs to include in the list. Default 100."
  ([parent] (accessPolicies-authorizedOrgsDescs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://accesscontextmanager.googleapis.com/v1/{+parent}/authorizedOrgsDescs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn accessPolicies-authorizedOrgsDescs-get
  "Gets an authorized orgs desc based on the resource name.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/authorizedOrgsDescs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn accessPolicies-authorizedOrgsDescs-create
  "Creates an authorized orgs desc. The long-running operation from this RPC has a successful status after the authorized orgs desc propagates to long-lasting storage. If a authorized orgs desc contains errors, an error response is returned for the first error encountered. The name of this `AuthorizedOrgsDesc` will be assigned during creation.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/authorizedOrgsDescs/create

parent <> 
AuthorizedOrgsDesc:
AuthorizedOrgsDesc"
  [parent AuthorizedOrgsDesc]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+parent}/authorizedOrgsDescs",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AuthorizedOrgsDesc}))

(defn accessPolicies-authorizedOrgsDescs-patch
  "Updates an authorized orgs desc. The long-running operation from this RPC has a successful status after the authorized orgs desc propagates to long-lasting storage. If a authorized orgs desc contains errors, an error response is returned for the first error encountered. Only the organization list in `AuthorizedOrgsDesc` can be updated. The name, authorization_type, asset_type and authorization_direction cannot be updated.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/authorizedOrgsDescs/patch

name <> 
AuthorizedOrgsDesc:
AuthorizedOrgsDesc

optional:
updateMask <string> Required. Mask to control which fields get updated. Must be non-empty."
  ([name AuthorizedOrgsDesc]
    (accessPolicies-authorizedOrgsDescs-patch
      name
      AuthorizedOrgsDesc
      nil))
  ([name AuthorizedOrgsDesc optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://accesscontextmanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body AuthorizedOrgsDesc})))

(defn accessPolicies-authorizedOrgsDescs-delete
  "Deletes an authorized orgs desc based on the resource name. The long-running operation from this RPC has a successful status after the authorized orgs desc is removed from long-lasting storage.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/accessPolicies/authorizedOrgsDescs/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn services-list
  "Lists all VPC-SC supported services.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/services/list

optional:
pageSize <integer> This flag specifies the maximum number of services to return per page. Default is 100."
  ([] (services-list nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://accesscontextmanager.googleapis.com/v1/services",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn services-get
  "Returns a VPC-SC supported service based on the service name.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/services/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/services/{name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-gcpUserAccessBindings-list
  "Lists all GcpUserAccessBindings for a Google Cloud organization.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/organizations/gcpUserAccessBindings/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of items to return. The server may return fewer items. If left blank, the server may return any number of items."
  ([parent] (organizations-gcpUserAccessBindings-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://accesscontextmanager.googleapis.com/v1/{+parent}/gcpUserAccessBindings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-gcpUserAccessBindings-get
  "Gets the GcpUserAccessBinding with the given name.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/organizations/gcpUserAccessBindings/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-gcpUserAccessBindings-create
  "Creates a GcpUserAccessBinding. If the client specifies a name, the server ignores it. Fails if a resource already exists with the same group_key. Completion of this long-running operation does not necessarily signify that the new binding is deployed onto all affected users, which may take more time.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/organizations/gcpUserAccessBindings/create

parent <> 
GcpUserAccessBinding:
GcpUserAccessBinding"
  [parent GcpUserAccessBinding]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+parent}/gcpUserAccessBindings",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GcpUserAccessBinding}))

(defn organizations-gcpUserAccessBindings-patch
  "Updates a GcpUserAccessBinding. Completion of this long-running operation does not necessarily signify that the changed binding is deployed onto all affected users, which may take more time.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/organizations/gcpUserAccessBindings/patch

name <> 
GcpUserAccessBinding:
GcpUserAccessBinding

optional:
updateMask <string> Required. Only the fields specified in this mask are updated. Because name and group_key cannot be changed, update_mask is required and may only contain the following fields: `access_levels`, `dry_run_access_levels`. update_mask { paths: \"access_levels\" }"
  ([name GcpUserAccessBinding]
    (organizations-gcpUserAccessBindings-patch
      name
      GcpUserAccessBinding
      nil))
  ([name GcpUserAccessBinding optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://accesscontextmanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GcpUserAccessBinding})))

(defn organizations-gcpUserAccessBindings-delete
  "Deletes a GcpUserAccessBinding. Completion of this long-running operation does not necessarily signify that the binding deletion is deployed onto all affected users, which may take more time.
https://cloud.google.com/access-context-manager/docs/reference/rest/v1/reference/rest/v1/organizations/gcpUserAccessBindings/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://accesscontextmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
