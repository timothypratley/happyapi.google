(ns happyapi.google.apigeeregistry-v1
  "Apigee Registry API

See: https://cloud.google.com/apigee/docs/apihub/what-is-api-hub"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-instances-create
  "Provisions instance resources for the Registry.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/instances/create

parent <> 
Instance:
Instance

optional:
instanceId <string> Required. Identifier to assign to the Instance. Must be unique within scope of the parent resource."
  ([parent Instance]
    (projects-locations-instances-create parent Instance nil))
  ([parent Instance optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/instances",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Instance})))

(defn projects-locations-instances-delete
  "Deletes the Registry instance.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/instances/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-get
  "Gets details of a single Instance.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/instances/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/instances/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-instances-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/instances/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-instances-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/instances/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-apis-list
  "Returns matching APIs.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/list

parent <> 

optional:
pageSize <integer> The maximum number of APIs to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
filter <string> An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields.
orderBy <string> A comma-separated list of fields, e.g. \"foo,bar\" Fields can be sorted in descending order using the \"desc\" identifier, e.g. \"foo desc,bar\""
  ([parent] (projects-locations-apis-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/apis",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-get
  "Returns a specified API.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-create
  "Creates a specified API.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/create

parent <> 
Api:
Api

optional:
apiId <string> Required. The ID to use for the API, which will become the final component of the API's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID."
  ([parent Api] (projects-locations-apis-create parent Api nil))
  ([parent Api optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/apis",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Api})))

(defn projects-locations-apis-patch
  "Used to modify a specified API.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/patch

name <> 
Api:
Api

optional:
updateMask <string> The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If an asterisk \"*\" is specified, all fields are updated, including fields that are unspecified/default in the request.
allowMissing <boolean> If set to true, and the API is not found, a new API will be created. In this situation, `update_mask` is ignored."
  ([name Api] (projects-locations-apis-patch name Api nil))
  ([name Api optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Api})))

(defn projects-locations-apis-delete
  "Removes a specified API and all of the resources that it owns.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/delete

name <> 

optional:
force <boolean> If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.)"
  ([name] (projects-locations-apis-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-apis-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-apis-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-apis-versions-list
  "Returns matching versions.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/list

parent <> 

optional:
pageSize <integer> The maximum number of versions to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
filter <string> An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields.
orderBy <string> A comma-separated list of fields, e.g. \"foo,bar\" Fields can be sorted in descending order using the \"desc\" identifier, e.g. \"foo desc,bar\""
  ([parent] (projects-locations-apis-versions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/versions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-versions-get
  "Returns a specified version.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-versions-create
  "Creates a specified version.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/create

parent <> 
ApiVersion:
ApiVersion

optional:
apiVersionId <string> Required. The ID to use for the version, which will become the final component of the version's resource name. This value should be 1-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID."
  ([parent ApiVersion]
    (projects-locations-apis-versions-create parent ApiVersion nil))
  ([parent ApiVersion optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/versions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ApiVersion})))

(defn projects-locations-apis-versions-patch
  "Used to modify a specified version.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/patch

name <> 
ApiVersion:
ApiVersion

optional:
updateMask <string> The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If an asterisk \"*\" is specified, all fields are updated, including fields that are unspecified/default in the request.
allowMissing <boolean> If set to true, and the version is not found, a new version will be created. In this situation, `update_mask` is ignored."
  ([name ApiVersion]
    (projects-locations-apis-versions-patch name ApiVersion nil))
  ([name ApiVersion optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ApiVersion})))

(defn projects-locations-apis-versions-delete
  "Removes a specified version and all of the resources that it owns.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/delete

name <> 

optional:
force <boolean> If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.)"
  ([name] (projects-locations-apis-versions-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-versions-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-apis-versions-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-apis-versions-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-versions-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-apis-versions-specs-list
  "Returns matching specs.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/list

parent <> 

optional:
pageSize <integer> The maximum number of specs to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
filter <string> An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields except contents.
orderBy <string> A comma-separated list of fields, e.g. \"foo,bar\" Fields can be sorted in descending order using the \"desc\" identifier, e.g. \"foo desc,bar\""
  ([parent] (projects-locations-apis-versions-specs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/specs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-versions-specs-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-apis-versions-specs-delete
  "Removes a specified spec, all revisions, and all child resources (e.g., artifacts).
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/delete

name <> 

optional:
force <boolean> If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.)"
  ([name] (projects-locations-apis-versions-specs-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-versions-specs-patch
  "Used to modify a specified spec.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/patch

name <> 
ApiSpec:
ApiSpec

optional:
updateMask <string> The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If an asterisk \"*\" is specified, all fields are updated, including fields that are unspecified/default in the request.
allowMissing <boolean> If set to true, and the spec is not found, a new spec will be created. In this situation, `update_mask` is ignored."
  ([name ApiSpec]
    (projects-locations-apis-versions-specs-patch name ApiSpec nil))
  ([name ApiSpec optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ApiSpec})))

(defn projects-locations-apis-versions-specs-listRevisions
  "Lists all revisions of a spec. Revisions are returned in descending order of revision creation time.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/listRevisions

name <> 

optional:
pageSize <integer> The maximum number of revisions to return per page.
filter <string> An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields."
  ([name]
    (projects-locations-apis-versions-specs-listRevisions name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+name}:listRevisions",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-versions-specs-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-apis-versions-specs-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-versions-specs-create
  "Creates a specified spec.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/create

parent <> 
ApiSpec:
ApiSpec

optional:
apiSpecId <string> Required. The ID to use for the spec, which will become the final component of the spec's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID."
  ([parent ApiSpec]
    (projects-locations-apis-versions-specs-create parent ApiSpec nil))
  ([parent ApiSpec optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/specs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ApiSpec})))

(defn projects-locations-apis-versions-specs-rollback
  "Sets the current revision to a specified prior revision. Note that this creates a new revision with a new revision ID.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/rollback

name <> 
RollbackApiSpecRequest:
RollbackApiSpecRequest"
  [name RollbackApiSpecRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+name}:rollback",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RollbackApiSpecRequest}))

(defn projects-locations-apis-versions-specs-getContents
  "Returns the contents of a specified spec. If specs are stored with GZip compression, the default behavior is to return the spec uncompressed (the mime_type response field indicates the exact format returned).
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/getContents

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+name}:getContents",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-versions-specs-get
  "Returns a specified spec.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-versions-specs-tagRevision
  "Adds a tag to a specified revision of a spec.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/tagRevision

name <> 
TagApiSpecRevisionRequest:
TagApiSpecRevisionRequest"
  [name TagApiSpecRevisionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+name}:tagRevision",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TagApiSpecRevisionRequest}))

(defn projects-locations-apis-versions-specs-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-apis-versions-specs-deleteRevision
  "Deletes a revision of a spec.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/deleteRevision

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+name}:deleteRevision",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-versions-specs-artifacts-list
  "Returns matching artifacts.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/artifacts/list

parent <> 

optional:
pageSize <integer> The maximum number of artifacts to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
filter <string> An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields except contents.
orderBy <string> A comma-separated list of fields, e.g. \"foo,bar\" Fields can be sorted in descending order using the \"desc\" identifier, e.g. \"foo desc,bar\""
  ([parent]
    (projects-locations-apis-versions-specs-artifacts-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/artifacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-versions-specs-artifacts-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/artifacts/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-apis-versions-specs-artifacts-delete
  "Removes a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/artifacts/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-versions-specs-artifacts-replaceArtifact
  "Used to replace a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/artifacts/replaceArtifact

name <> 
Artifact:
Artifact"
  [name Artifact]
  (client/*api-request*
    {:method :put,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Artifact}))

(defn projects-locations-apis-versions-specs-artifacts-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/artifacts/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-apis-versions-specs-artifacts-getIamPolicy
      resource
      nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-versions-specs-artifacts-create
  "Creates a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/artifacts/create

parent <> 
Artifact:
Artifact

optional:
artifactId <string> Required. The ID to use for the artifact, which will become the final component of the artifact's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID."
  ([parent Artifact]
    (projects-locations-apis-versions-specs-artifacts-create
      parent
      Artifact
      nil))
  ([parent Artifact optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/artifacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Artifact})))

(defn projects-locations-apis-versions-specs-artifacts-getContents
  "Returns the contents of a specified artifact. If artifacts are stored with GZip compression, the default behavior is to return the artifact uncompressed (the mime_type response field indicates the exact format returned).
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/artifacts/getContents

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+name}:getContents",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-versions-specs-artifacts-get
  "Returns a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/artifacts/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-versions-specs-artifacts-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/specs/artifacts/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-apis-versions-artifacts-list
  "Returns matching artifacts.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/artifacts/list

parent <> 

optional:
pageSize <integer> The maximum number of artifacts to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
filter <string> An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields except contents.
orderBy <string> A comma-separated list of fields, e.g. \"foo,bar\" Fields can be sorted in descending order using the \"desc\" identifier, e.g. \"foo desc,bar\""
  ([parent]
    (projects-locations-apis-versions-artifacts-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/artifacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-versions-artifacts-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/artifacts/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-apis-versions-artifacts-delete
  "Removes a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/artifacts/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-versions-artifacts-replaceArtifact
  "Used to replace a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/artifacts/replaceArtifact

name <> 
Artifact:
Artifact"
  [name Artifact]
  (client/*api-request*
    {:method :put,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Artifact}))

(defn projects-locations-apis-versions-artifacts-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/artifacts/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-apis-versions-artifacts-getIamPolicy
      resource
      nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-versions-artifacts-create
  "Creates a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/artifacts/create

parent <> 
Artifact:
Artifact

optional:
artifactId <string> Required. The ID to use for the artifact, which will become the final component of the artifact's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID."
  ([parent Artifact]
    (projects-locations-apis-versions-artifacts-create
      parent
      Artifact
      nil))
  ([parent Artifact optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/artifacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Artifact})))

(defn projects-locations-apis-versions-artifacts-getContents
  "Returns the contents of a specified artifact. If artifacts are stored with GZip compression, the default behavior is to return the artifact uncompressed (the mime_type response field indicates the exact format returned).
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/artifacts/getContents

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+name}:getContents",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-versions-artifacts-get
  "Returns a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/artifacts/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-versions-artifacts-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/versions/artifacts/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-apis-deployments-list
  "Returns matching deployments.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/list

parent <> 

optional:
pageSize <integer> The maximum number of deployments to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
filter <string> An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields.
orderBy <string> A comma-separated list of fields, e.g. \"foo,bar\" Fields can be sorted in descending order using the \"desc\" identifier, e.g. \"foo desc,bar\""
  ([parent] (projects-locations-apis-deployments-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/deployments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-deployments-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-apis-deployments-delete
  "Removes a specified deployment, all revisions, and all child resources (e.g., artifacts).
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/delete

name <> 

optional:
force <boolean> If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.)"
  ([name] (projects-locations-apis-deployments-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-deployments-patch
  "Used to modify a specified deployment.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/patch

name <> 
ApiDeployment:
ApiDeployment

optional:
updateMask <string> The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If an asterisk \"*\" is specified, all fields are updated, including fields that are unspecified/default in the request.
allowMissing <boolean> If set to true, and the deployment is not found, a new deployment will be created. In this situation, `update_mask` is ignored."
  ([name ApiDeployment]
    (projects-locations-apis-deployments-patch name ApiDeployment nil))
  ([name ApiDeployment optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ApiDeployment})))

(defn projects-locations-apis-deployments-listRevisions
  "Lists all revisions of a deployment. Revisions are returned in descending order of revision creation time.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/listRevisions

name <> 

optional:
pageSize <integer> The maximum number of revisions to return per page.
filter <string> An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields."
  ([name] (projects-locations-apis-deployments-listRevisions name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+name}:listRevisions",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-deployments-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-apis-deployments-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-deployments-create
  "Creates a specified deployment.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/create

parent <> 
ApiDeployment:
ApiDeployment

optional:
apiDeploymentId <string> Required. The ID to use for the deployment, which will become the final component of the deployment's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID."
  ([parent ApiDeployment]
    (projects-locations-apis-deployments-create
      parent
      ApiDeployment
      nil))
  ([parent ApiDeployment optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/deployments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ApiDeployment})))

(defn projects-locations-apis-deployments-rollback
  "Sets the current revision to a specified prior revision. Note that this creates a new revision with a new revision ID.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/rollback

name <> 
RollbackApiDeploymentRequest:
RollbackApiDeploymentRequest"
  [name RollbackApiDeploymentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+name}:rollback",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RollbackApiDeploymentRequest}))

(defn projects-locations-apis-deployments-get
  "Returns a specified deployment.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-deployments-tagRevision
  "Adds a tag to a specified revision of a deployment.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/tagRevision

name <> 
TagApiDeploymentRevisionRequest:
TagApiDeploymentRevisionRequest"
  [name TagApiDeploymentRevisionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+name}:tagRevision",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TagApiDeploymentRevisionRequest}))

(defn projects-locations-apis-deployments-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-apis-deployments-deleteRevision
  "Deletes a revision of a deployment.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/deleteRevision

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+name}:deleteRevision",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-deployments-artifacts-list
  "Returns matching artifacts.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/artifacts/list

parent <> 

optional:
pageSize <integer> The maximum number of artifacts to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
filter <string> An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields except contents.
orderBy <string> A comma-separated list of fields, e.g. \"foo,bar\" Fields can be sorted in descending order using the \"desc\" identifier, e.g. \"foo desc,bar\""
  ([parent]
    (projects-locations-apis-deployments-artifacts-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/artifacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-deployments-artifacts-get
  "Returns a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/artifacts/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-deployments-artifacts-getContents
  "Returns the contents of a specified artifact. If artifacts are stored with GZip compression, the default behavior is to return the artifact uncompressed (the mime_type response field indicates the exact format returned).
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/artifacts/getContents

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+name}:getContents",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-deployments-artifacts-create
  "Creates a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/artifacts/create

parent <> 
Artifact:
Artifact

optional:
artifactId <string> Required. The ID to use for the artifact, which will become the final component of the artifact's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID."
  ([parent Artifact]
    (projects-locations-apis-deployments-artifacts-create
      parent
      Artifact
      nil))
  ([parent Artifact optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/artifacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Artifact})))

(defn projects-locations-apis-deployments-artifacts-replaceArtifact
  "Used to replace a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/artifacts/replaceArtifact

name <> 
Artifact:
Artifact"
  [name Artifact]
  (client/*api-request*
    {:method :put,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Artifact}))

(defn projects-locations-apis-deployments-artifacts-delete
  "Removes a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/deployments/artifacts/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-artifacts-list
  "Returns matching artifacts.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/artifacts/list

parent <> 

optional:
pageSize <integer> The maximum number of artifacts to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
filter <string> An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields except contents.
orderBy <string> A comma-separated list of fields, e.g. \"foo,bar\" Fields can be sorted in descending order using the \"desc\" identifier, e.g. \"foo desc,bar\""
  ([parent] (projects-locations-apis-artifacts-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/artifacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-artifacts-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/artifacts/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-apis-artifacts-delete
  "Removes a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/artifacts/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-artifacts-replaceArtifact
  "Used to replace a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/artifacts/replaceArtifact

name <> 
Artifact:
Artifact"
  [name Artifact]
  (client/*api-request*
    {:method :put,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Artifact}))

(defn projects-locations-apis-artifacts-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/artifacts/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-apis-artifacts-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-apis-artifacts-create
  "Creates a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/artifacts/create

parent <> 
Artifact:
Artifact

optional:
artifactId <string> Required. The ID to use for the artifact, which will become the final component of the artifact's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID."
  ([parent Artifact]
    (projects-locations-apis-artifacts-create parent Artifact nil))
  ([parent Artifact optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/artifacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Artifact})))

(defn projects-locations-apis-artifacts-getContents
  "Returns the contents of a specified artifact. If artifacts are stored with GZip compression, the default behavior is to return the artifact uncompressed (the mime_type response field indicates the exact format returned).
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/artifacts/getContents

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+name}:getContents",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-artifacts-get
  "Returns a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/artifacts/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-artifacts-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/apis/artifacts/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-artifacts-list
  "Returns matching artifacts.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/artifacts/list

parent <> 

optional:
pageSize <integer> The maximum number of artifacts to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
filter <string> An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields except contents.
orderBy <string> A comma-separated list of fields, e.g. \"foo,bar\" Fields can be sorted in descending order using the \"desc\" identifier, e.g. \"foo desc,bar\""
  ([parent] (projects-locations-artifacts-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/artifacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-artifacts-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/artifacts/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-artifacts-delete
  "Removes a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/artifacts/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-artifacts-replaceArtifact
  "Used to replace a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/artifacts/replaceArtifact

name <> 
Artifact:
Artifact"
  [name Artifact]
  (client/*api-request*
    {:method :put,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Artifact}))

(defn projects-locations-artifacts-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/artifacts/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-artifacts-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-artifacts-create
  "Creates a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/artifacts/create

parent <> 
Artifact:
Artifact

optional:
artifactId <string> Required. The ID to use for the artifact, which will become the final component of the artifact's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID."
  ([parent Artifact]
    (projects-locations-artifacts-create parent Artifact nil))
  ([parent Artifact optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+parent}/artifacts",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Artifact})))

(defn projects-locations-artifacts-getContents
  "Returns the contents of a specified artifact. If artifacts are stored with GZip compression, the default behavior is to return the artifact uncompressed (the mime_type response field indicates the exact format returned).
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/artifacts/getContents

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+name}:getContents",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-artifacts-get
  "Returns a specified artifact.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/artifacts/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://apigeeregistry.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-artifacts-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/artifacts/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-runtime-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/runtime/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-runtime-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/runtime/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-runtime-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-runtime-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/runtime/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-documents-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/documents/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-documents-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/documents/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-documents-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://apigeeregistry.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-documents-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/apigee/docs/apihub/what-is-api-hub/v1/reference/rest/v1/projects/locations/documents/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://apigeeregistry.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))
