(ns happyapi.google.networkmanagement-v1
  "Network Management API
The Network Management API provides a collection of network performance monitoring and diagnostic capabilities.
See: https://cloud.google.com/"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkmanagement.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://networkmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/global/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-global-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkmanagement.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-global-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/global/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://networkmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/global/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://networkmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/global/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://networkmanagement.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-global-connectivityTests-list
  "Lists all Connectivity Tests owned by a project.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/global/connectivityTests/list

parent <> 

optional:
pageSize <integer> Number of `ConnectivityTests` to return.
filter <string> Lists the `ConnectivityTests` that match the filter expression. A filter expression filters the resources listed in the response. The expression must be of the form ` ` where operators: `<`, `>`, `<=`, `>=`, `!=`, `=`, `:` are supported (colon `:` represents a HAS operator which is roughly synonymous with equality). can refer to a proto or JSON field, or a synthetic field. Field names can be camelCase or snake_case. Examples: - Filter by name: name = \"projects/proj-1/locations/global/connectivityTests/test-1 - Filter by labels: - Resources that have a key called `foo` labels.foo:* - Resources that have a key called `foo` whose value is `bar` labels.foo = bar
orderBy <string> Field to use to sort the list."
  ([parent]
    (projects-locations-global-connectivityTests-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkmanagement.googleapis.com/v1/{+parent}/connectivityTests",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-global-connectivityTests-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/global/connectivityTests/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://networkmanagement.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-global-connectivityTests-delete
  "Deletes a specific `ConnectivityTest`.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/global/connectivityTests/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://networkmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-connectivityTests-patch
  "Updates the configuration of an existing `ConnectivityTest`. After you update a test, the reachability analysis is performed as part of the long running operation, which completes when the analysis completes. The Reachability state in the test resource is updated with the new result. If the endpoint specifications in `ConnectivityTest` are invalid (for example, they contain non-existent resources in the network, or the user does not have read permissions to the network configurations of listed projects), then the reachability result returns a value of UNKNOWN. If the endpoint specifications in `ConnectivityTest` are incomplete, the reachability result returns a value of `AMBIGUOUS`. See the documentation in `ConnectivityTest` for more details.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/global/connectivityTests/patch

name <> 
ConnectivityTest:
ConnectivityTest

optional:
updateMask <string> Required. Mask of fields to update. At least one path must be supplied in this field."
  ([name ConnectivityTest]
    (projects-locations-global-connectivityTests-patch
      name
      ConnectivityTest
      nil))
  ([name ConnectivityTest optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://networkmanagement.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ConnectivityTest})))

(defn projects-locations-global-connectivityTests-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/global/connectivityTests/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-global-connectivityTests-getIamPolicy
      resource
      nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkmanagement.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-global-connectivityTests-create
  "Creates a new Connectivity Test. After you create a test, the reachability analysis is performed as part of the long running operation, which completes when the analysis completes. If the endpoint specifications in `ConnectivityTest` are invalid (for example, containing non-existent resources in the network, or you don't have read permissions to the network configurations of listed projects), then the reachability result returns a value of `UNKNOWN`. If the endpoint specifications in `ConnectivityTest` are incomplete, the reachability result returns a value of AMBIGUOUS. For more information, see the Connectivity Test documentation.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/global/connectivityTests/create

parent <> 
ConnectivityTest:
ConnectivityTest

optional:
testId <string> Required. The logical name of the Connectivity Test in your project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the customer project"
  ([parent ConnectivityTest]
    (projects-locations-global-connectivityTests-create
      parent
      ConnectivityTest
      nil))
  ([parent ConnectivityTest optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://networkmanagement.googleapis.com/v1/{+parent}/connectivityTests",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ConnectivityTest})))

(defn projects-locations-global-connectivityTests-get
  "Gets the details of a specific Connectivity Test.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/global/connectivityTests/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://networkmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-connectivityTests-rerun
  "Rerun an existing `ConnectivityTest`. After the user triggers the rerun, the reachability analysis is performed as part of the long running operation, which completes when the analysis completes. Even though the test configuration remains the same, the reachability result may change due to underlying network configuration changes. If the endpoint specifications in `ConnectivityTest` become invalid (for example, specified resources are deleted in the network, or you lost read permissions to the network configurations of listed projects), then the reachability result returns a value of `UNKNOWN`.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/global/connectivityTests/rerun

name <> 
RerunConnectivityTestRequest:
RerunConnectivityTestRequest"
  [name RerunConnectivityTestRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://networkmanagement.googleapis.com/v1/{+name}:rerun",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RerunConnectivityTestRequest}))

(defn projects-locations-global-connectivityTests-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/global/connectivityTests/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://networkmanagement.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))
