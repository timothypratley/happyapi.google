(ns happyapi.google.datafusion-v1
  "Cloud Data Fusion API
Cloud Data Fusion is a fully-managed, cloud native, enterprise data integration service for quickly building and managing data pipelines. It provides a graphical interface to increase time efficiency and reduce complexity, and allows business users, developers, and data scientists to easily and reliably build scalable data integration solutions to cleanse, prepare, blend, transfer and transform data without having to wrestle with infrastructure.
See: https://cloud.google.com/data-fusion/docs"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datafusion.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://datafusion.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datafusion.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://datafusion.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://datafusion.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://datafusion.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-versions-list
  "Lists possible versions for Data Fusion instances in the specified project and location.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/versions/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return.
latestPatchOnly <boolean> Whether or not to return the latest patch of every available minor version. If true, only the latest patch will be returned. Ex. if allowed versions is [6.1.1, 6.1.2, 6.2.0] then response will be [6.1.2, 6.2.0]"
  ([parent] (projects-locations-versions-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datafusion.googleapis.com/v1/{+parent}/versions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-list
  "Lists Data Fusion instances in the specified project and location.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/instances/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return.
filter <string> List filter.
orderBy <string> Sort results. Supported values are \"name\", \"name desc\", or \"\" (unsorted)."
  ([parent] (projects-locations-instances-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datafusion.googleapis.com/v1/{+parent}/instances",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/instances/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://datafusion.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-instances-delete
  "Deletes a single Date Fusion instance.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/instances/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://datafusion.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-patch
  "Updates a single Data Fusion instance.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/instances/patch

name <> 
Instance:
Instance

optional:
updateMask <string> Field mask is used to specify the fields that the update will overwrite in an instance resource. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask, the label field will be overwritten."
  ([name Instance]
    (projects-locations-instances-patch name Instance nil))
  ([name Instance optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://datafusion.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Instance})))

(defn projects-locations-instances-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/instances/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-instances-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datafusion.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-instances-restart
  "Restart a single Data Fusion instance. At the end of an operation instance is fully restarted.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/instances/restart

name <> 
RestartInstanceRequest:
RestartInstanceRequest"
  [name RestartInstanceRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://datafusion.googleapis.com/v1/{+name}:restart",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RestartInstanceRequest}))

(defn projects-locations-instances-create
  "Creates a new Data Fusion instance in the specified project and location.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/instances/create

parent <> 
Instance:
Instance

optional:
instanceId <string> Required. The name of the instance to create. Instance name can only contain lowercase alphanumeric characters and hyphens. It must start with a letter and must not end with a hyphen. It can have a maximum of 30 characters."
  ([parent Instance]
    (projects-locations-instances-create parent Instance nil))
  ([parent Instance optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://datafusion.googleapis.com/v1/{+parent}/instances",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Instance})))

(defn projects-locations-instances-get
  "Gets details of a single Data Fusion instance.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/instances/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://datafusion.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/instances/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://datafusion.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-instances-dnsPeerings-create
  "Creates DNS peering on the given resource.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/instances/dnsPeerings/create

parent <> 
DnsPeering:
DnsPeering

optional:
dnsPeeringId <string> Required. The name of the peering to create."
  ([parent DnsPeering]
    (projects-locations-instances-dnsPeerings-create
      parent
      DnsPeering
      nil))
  ([parent DnsPeering optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://datafusion.googleapis.com/v1/{+parent}/dnsPeerings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body DnsPeering})))

(defn projects-locations-instances-dnsPeerings-delete
  "Deletes DNS peering on the given resource.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/instances/dnsPeerings/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://datafusion.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-dnsPeerings-list
  "Lists DNS peerings for a given resource.
https://cloud.google.com/data-fusion/docs/v1/reference/rest/v1/projects/locations/instances/dnsPeerings/list

parent <> 

optional:
pageSize <integer> The maximum number of dns peerings to return. The service may return fewer than this value. If unspecified, at most 50 dns peerings will be returned. The maximum value is 200; values above 200 will be coerced to 200."
  ([parent] (projects-locations-instances-dnsPeerings-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datafusion.googleapis.com/v1/{+parent}/dnsPeerings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
