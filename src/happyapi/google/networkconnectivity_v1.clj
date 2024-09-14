(ns happyapi.google.networkconnectivity-v1
  "Network Connectivity API
This API enables connectivity with and between Google Cloud resources.
See: https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest")

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-spokes-list
  "Lists the Network Connectivity Center spokes in a specified project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/spokes/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return per page.
filter <string> An expression that filters the list of results.
orderBy <string> Sort the results by a certain order."
  ([parent] (projects-locations-spokes-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/spokes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-spokes-get
  "Gets details about a Network Connectivity Center spoke.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/spokes/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-spokes-create
  "Creates a Network Connectivity Center spoke.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/spokes/create

parent <> 
Spoke:
Spoke

optional:
spokeId <string> Required. Unique id for the spoke to create.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that a request doesn't result in creation of duplicate commitments for at least 60 minutes. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check to see whether the original operation was received. If it was, the server ignores the second request. This behavior prevents clients from mistakenly creating duplicate commitments. The request ID must be a valid UUID, with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent Spoke] (projects-locations-spokes-create parent Spoke nil))
  ([parent Spoke optional]
    {:method :post,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/spokes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Spoke}))

(defn projects-locations-spokes-patch
  "Updates the parameters of a Network Connectivity Center spoke.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/spokes/patch

name <> 
Spoke:
Spoke

optional:
updateMask <string> Optional. In the case of an update to an existing spoke, field mask is used to specify the fields to be overwritten. The fields specified in the update_mask are relative to the resource, not the full request. A field is overwritten if it is in the mask. If the user does not provide a mask, then all fields are overwritten.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that a request doesn't result in creation of duplicate commitments for at least 60 minutes. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check to see whether the original operation was received. If it was, the server ignores the second request. This behavior prevents clients from mistakenly creating duplicate commitments. The request ID must be a valid UUID, with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Spoke] (projects-locations-spokes-patch name Spoke nil))
  ([name Spoke optional]
    {:method :patch,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Spoke}))

(defn projects-locations-spokes-delete
  "Deletes a Network Connectivity Center spoke.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/spokes/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that a request doesn't result in creation of duplicate commitments for at least 60 minutes. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check to see whether the original operation was received. If it was, the server ignores the second request. This behavior prevents clients from mistakenly creating duplicate commitments. The request ID must be a valid UUID, with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-spokes-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-spokes-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/spokes/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-spokes-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/spokes/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-spokes-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-spokes-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/spokes/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-serviceConnectionMaps-list
  "Lists ServiceConnectionMaps in a given project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionMaps/list

parent <> 

optional:
pageSize <integer> The maximum number of results per page that should be returned.
filter <string> A filter expression that filters the results listed in the response.
orderBy <string> Sort the results by a certain order."
  ([parent] (projects-locations-serviceConnectionMaps-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/serviceConnectionMaps",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceConnectionMaps-get
  "Gets details of a single ServiceConnectionMap.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionMaps/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-serviceConnectionMaps-create
  "Creates a new ServiceConnectionMap in a given project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionMaps/create

parent <> 
ServiceConnectionMap:
ServiceConnectionMap

optional:
serviceConnectionMapId <string> Optional. Resource ID (i.e. 'foo' in '[...]/projects/p/locations/l/serviceConnectionMaps/foo') See https://google.aip.dev/122#resource-id-segments Unique per location. If one is not provided, one will be generated.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent ServiceConnectionMap]
    (projects-locations-serviceConnectionMaps-create
      parent
      ServiceConnectionMap
      nil))
  ([parent ServiceConnectionMap optional]
    {:method :post,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/serviceConnectionMaps",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ServiceConnectionMap}))

(defn projects-locations-serviceConnectionMaps-patch
  "Updates the parameters of a single ServiceConnectionMap.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionMaps/patch

name <> 
ServiceConnectionMap:
ServiceConnectionMap

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the ServiceConnectionMap resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name ServiceConnectionMap]
    (projects-locations-serviceConnectionMaps-patch
      name
      ServiceConnectionMap
      nil))
  ([name ServiceConnectionMap optional]
    {:method :patch,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ServiceConnectionMap}))

(defn projects-locations-serviceConnectionMaps-delete
  "Deletes a single ServiceConnectionMap.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionMaps/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
etag <string> Optional. The etag is computed by the server, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding."
  ([name] (projects-locations-serviceConnectionMaps-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceConnectionMaps-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionMaps/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-serviceConnectionMaps-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionMaps/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-serviceConnectionMaps-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceConnectionMaps-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionMaps/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-serviceConnectionTokens-get
  "Gets details of a single ServiceConnectionToken.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionTokens/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-serviceConnectionTokens-list
  "Lists ServiceConnectionTokens in a given project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionTokens/list

parent <> 

optional:
pageSize <integer> The maximum number of results per page that should be returned.
filter <string> A filter expression that filters the results listed in the response.
orderBy <string> Sort the results by a certain order."
  ([parent]
    (projects-locations-serviceConnectionTokens-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/serviceConnectionTokens",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceConnectionTokens-create
  "Creates a new ServiceConnectionToken in a given project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionTokens/create

parent <> 
ServiceConnectionToken:
ServiceConnectionToken

optional:
serviceConnectionTokenId <string> Optional. Resource ID (i.e. 'foo' in '[...]/projects/p/locations/l/ServiceConnectionTokens/foo') See https://google.aip.dev/122#resource-id-segments Unique per location. If one is not provided, one will be generated.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent ServiceConnectionToken]
    (projects-locations-serviceConnectionTokens-create
      parent
      ServiceConnectionToken
      nil))
  ([parent ServiceConnectionToken optional]
    {:method :post,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/serviceConnectionTokens",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ServiceConnectionToken}))

(defn projects-locations-serviceConnectionTokens-delete
  "Deletes a single ServiceConnectionToken.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionTokens/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
etag <string> Optional. The etag is computed by the server, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding."
  ([name] (projects-locations-serviceConnectionTokens-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceClasses-list
  "Lists ServiceClasses in a given project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceClasses/list

parent <> 

optional:
pageSize <integer> The maximum number of results per page that should be returned.
filter <string> A filter expression that filters the results listed in the response.
orderBy <string> Sort the results by a certain order."
  ([parent] (projects-locations-serviceClasses-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/serviceClasses",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceClasses-get
  "Gets details of a single ServiceClass.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceClasses/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-serviceClasses-patch
  "Updates the parameters of a single ServiceClass.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceClasses/patch

name <> 
ServiceClass:
ServiceClass

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the ServiceClass resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name ServiceClass]
    (projects-locations-serviceClasses-patch name ServiceClass nil))
  ([name ServiceClass optional]
    {:method :patch,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ServiceClass}))

(defn projects-locations-serviceClasses-delete
  "Deletes a single ServiceClass.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceClasses/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
etag <string> Optional. The etag is computed by the server, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding."
  ([name] (projects-locations-serviceClasses-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceClasses-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceClasses/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-serviceClasses-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceClasses/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-serviceClasses-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceClasses-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceClasses/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-regionalEndpoints-list
  "Lists RegionalEndpoints in a given project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/regionalEndpoints/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> A filter expression that filters the results listed in the response.
orderBy <string> Sort the results by a certain order."
  ([parent] (projects-locations-regionalEndpoints-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/regionalEndpoints",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-regionalEndpoints-get
  "Gets details of a single RegionalEndpoint.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/regionalEndpoints/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-regionalEndpoints-create
  "Creates a new RegionalEndpoint in a given project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/regionalEndpoints/create

parent <> 
RegionalEndpoint:
RegionalEndpoint

optional:
regionalEndpointId <string> Required. Unique id of the Regional Endpoint to be created.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if the original operation with the same request ID was received, and if so, ignores the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent RegionalEndpoint]
    (projects-locations-regionalEndpoints-create
      parent
      RegionalEndpoint
      nil))
  ([parent RegionalEndpoint optional]
    {:method :post,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/regionalEndpoints",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RegionalEndpoint}))

(defn projects-locations-regionalEndpoints-delete
  "Deletes a single RegionalEndpoint.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/regionalEndpoints/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if the original operation with the same request ID was received, and if so, ignores the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-regionalEndpoints-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-internalRanges-list
  "Lists internal ranges in a given project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/internalRanges/list

parent <> 

optional:
pageSize <integer> The maximum number of results per page that should be returned.
filter <string> A filter expression that filters the results listed in the response.
orderBy <string> Sort the results by a certain order."
  ([parent] (projects-locations-internalRanges-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/internalRanges",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-internalRanges-get
  "Gets details of a single internal range.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/internalRanges/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-internalRanges-create
  "Creates a new internal range in a given project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/internalRanges/create

parent <> 
InternalRange:
InternalRange

optional:
internalRangeId <string> Optional. Resource ID (i.e. 'foo' in '[...]/projects/p/locations/l/internalRanges/foo') See https://google.aip.dev/122#resource-id-segments Unique per location.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent InternalRange]
    (projects-locations-internalRanges-create
      parent
      InternalRange
      nil))
  ([parent InternalRange optional]
    {:method :post,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/internalRanges",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body InternalRange}))

(defn projects-locations-internalRanges-patch
  "Updates the parameters of a single internal range.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/internalRanges/patch

name <> 
InternalRange:
InternalRange

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the InternalRange resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name InternalRange]
    (projects-locations-internalRanges-patch name InternalRange nil))
  ([name InternalRange optional]
    {:method :patch,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body InternalRange}))

(defn projects-locations-internalRanges-delete
  "Deletes a single internal range.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/internalRanges/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-internalRanges-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-hubs-listSpokes
  "Lists the Network Connectivity Center spokes associated with a specified hub and location. The list includes both spokes that are attached to the hub and spokes that have been proposed but not yet accepted.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/listSpokes

name <> 

optional:
spokeLocations <string> A list of locations. Specify one of the following: `[global]`, a single region (for example, `[us-central1]`), or a combination of values (for example, `[global, us-central1, us-west1]`). If the spoke_locations field is populated, the list of results includes only spokes in the specified location. If the spoke_locations field is not populated, the list of results includes spokes in all locations.
pageSize <integer> The maximum number of results to return per page.
filter <string> An expression that filters the list of results.
orderBy <string> Sort the results by name or create_time.
view <string> The view of the spoke to return. The view that you use determines which spoke fields are included in the response."
  ([name] (projects-locations-global-hubs-listSpokes name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}:listSpokes",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-hubs-list
  "Lists the Network Connectivity Center hubs associated with a given project.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/list

parent <> 

optional:
pageSize <integer> The maximum number of results per page to return.
filter <string> An expression that filters the list of results.
orderBy <string> Sort the results by a certain order."
  ([parent] (projects-locations-global-hubs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/hubs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-hubs-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-global-hubs-delete
  "Deletes a Network Connectivity Center hub.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that a request doesn't result in creation of duplicate commitments for at least 60 minutes. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check to see whether the original operation was received. If it was, the server ignores the second request. This behavior prevents clients from mistakenly creating duplicate commitments. The request ID must be a valid UUID, with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-global-hubs-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-hubs-acceptSpoke
  "Accepts a proposal to attach a Network Connectivity Center spoke to a hub.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/acceptSpoke

name <> 
AcceptHubSpokeRequest:
AcceptHubSpokeRequest"
  [name AcceptHubSpokeRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}:acceptSpoke",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body AcceptHubSpokeRequest})

(defn projects-locations-global-hubs-rejectSpoke
  "Rejects a Network Connectivity Center spoke from being attached to a hub. If the spoke was previously in the `ACTIVE` state, it transitions to the `INACTIVE` state and is no longer able to connect to other spokes that are attached to the hub.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/rejectSpoke

name <> 
RejectHubSpokeRequest:
RejectHubSpokeRequest"
  [name RejectHubSpokeRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}:rejectSpoke",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RejectHubSpokeRequest})

(defn projects-locations-global-hubs-patch
  "Updates the description and/or labels of a Network Connectivity Center hub.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/patch

name <> 
Hub:
Hub

optional:
updateMask <string> Optional. In the case of an update to an existing hub, field mask is used to specify the fields to be overwritten. The fields specified in the update_mask are relative to the resource, not the full request. A field is overwritten if it is in the mask. If the user does not provide a mask, then all fields are overwritten.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that a request doesn't result in creation of duplicate commitments for at least 60 minutes. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check to see whether the original operation was received. If it was, the server ignores the second request. This behavior prevents clients from mistakenly creating duplicate commitments. The request ID must be a valid UUID, with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Hub] (projects-locations-global-hubs-patch name Hub nil))
  ([name Hub optional]
    {:method :patch,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Hub}))

(defn projects-locations-global-hubs-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-global-hubs-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-hubs-create
  "Creates a new Network Connectivity Center hub in the specified project.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/create

parent <> 
Hub:
Hub

optional:
hubId <string> Required. A unique identifier for the hub.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that a request doesn't result in creation of duplicate commitments for at least 60 minutes. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check to see whether the original operation was received. If it was, the server ignores the second request. This behavior prevents clients from mistakenly creating duplicate commitments. The request ID must be a valid UUID, with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent Hub] (projects-locations-global-hubs-create parent Hub nil))
  ([parent Hub optional]
    {:method :post,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/hubs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Hub}))

(defn projects-locations-global-hubs-get
  "Gets details about a Network Connectivity Center hub.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-global-hubs-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-global-hubs-routeTables-get
  "Gets details about a Network Connectivity Center route table.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/routeTables/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-global-hubs-routeTables-list
  "Lists route tables in a given hub.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/routeTables/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return per page.
filter <string> An expression that filters the list of results.
orderBy <string> Sort the results by a certain order."
  ([parent]
    (projects-locations-global-hubs-routeTables-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/routeTables",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-hubs-routeTables-routes-get
  "Gets details about the specified route.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/routeTables/routes/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-global-hubs-routeTables-routes-list
  "Lists routes in a given route table.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/routeTables/routes/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return per page.
filter <string> An expression that filters the list of results.
orderBy <string> Sort the results by a certain order."
  ([parent]
    (projects-locations-global-hubs-routeTables-routes-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/routes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-hubs-groups-get
  "Gets details about a Network Connectivity Center group.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/groups/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-global-hubs-groups-list
  "Lists groups in a given hub.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/groups/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return per page.
filter <string> An expression that filters the list of results.
orderBy <string> Sort the results by a certain order."
  ([parent] (projects-locations-global-hubs-groups-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/groups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-hubs-groups-patch
  "Updates the parameters of a Network Connectivity Center group.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/groups/patch

name <> 
Group:
Group

optional:
updateMask <string> Optional. In the case of an update to an existing group, field mask is used to specify the fields to be overwritten. The fields specified in the update_mask are relative to the resource, not the full request. A field is overwritten if it is in the mask. If the user does not provide a mask, then all fields are overwritten.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that a request doesn't result in creation of duplicate commitments for at least 60 minutes. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check to see whether the original operation was received. If it was, the server ignores the second request. This behavior prevents clients from mistakenly creating duplicate commitments. The request ID must be a valid UUID, with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Group]
    (projects-locations-global-hubs-groups-patch name Group nil))
  ([name Group optional]
    {:method :patch,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Group}))

(defn projects-locations-global-hubs-groups-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/groups/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-global-hubs-groups-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/groups/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-global-hubs-groups-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-hubs-groups-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/hubs/groups/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-global-policyBasedRoutes-list
  "Lists policy-based routes in a given project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/policyBasedRoutes/list

parent <> 

optional:
pageSize <integer> The maximum number of results per page that should be returned.
filter <string> A filter expression that filters the results listed in the response.
orderBy <string> Sort the results by a certain order."
  ([parent]
    (projects-locations-global-policyBasedRoutes-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/policyBasedRoutes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-policyBasedRoutes-get
  "Gets details of a single policy-based route.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/policyBasedRoutes/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-global-policyBasedRoutes-create
  "Creates a new policy-based route in a given project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/policyBasedRoutes/create

parent <> 
PolicyBasedRoute:
PolicyBasedRoute

optional:
policyBasedRouteId <string> Required. Unique id for the policy-based route to create.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, ignores the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent PolicyBasedRoute]
    (projects-locations-global-policyBasedRoutes-create
      parent
      PolicyBasedRoute
      nil))
  ([parent PolicyBasedRoute optional]
    {:method :post,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/policyBasedRoutes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body PolicyBasedRoute}))

(defn projects-locations-global-policyBasedRoutes-delete
  "Deletes a single policy-based route.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/policyBasedRoutes/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, ignores the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name]
    (projects-locations-global-policyBasedRoutes-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-policyBasedRoutes-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/policyBasedRoutes/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-global-policyBasedRoutes-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/policyBasedRoutes/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-global-policyBasedRoutes-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-global-policyBasedRoutes-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/global/policyBasedRoutes/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-serviceConnectionPolicies-list
  "Lists ServiceConnectionPolicies in a given project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionPolicies/list

parent <> 

optional:
pageSize <integer> The maximum number of results per page that should be returned.
filter <string> A filter expression that filters the results listed in the response.
orderBy <string> Sort the results by a certain order."
  ([parent]
    (projects-locations-serviceConnectionPolicies-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/serviceConnectionPolicies",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceConnectionPolicies-get
  "Gets details of a single ServiceConnectionPolicy.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionPolicies/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-serviceConnectionPolicies-create
  "Creates a new ServiceConnectionPolicy in a given project and location.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionPolicies/create

parent <> 
ServiceConnectionPolicy:
ServiceConnectionPolicy

optional:
serviceConnectionPolicyId <string> Optional. Resource ID (i.e. 'foo' in '[...]/projects/p/locations/l/serviceConnectionPolicies/foo') See https://google.aip.dev/122#resource-id-segments Unique per location.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent ServiceConnectionPolicy]
    (projects-locations-serviceConnectionPolicies-create
      parent
      ServiceConnectionPolicy
      nil))
  ([parent ServiceConnectionPolicy optional]
    {:method :post,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+parent}/serviceConnectionPolicies",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ServiceConnectionPolicy}))

(defn projects-locations-serviceConnectionPolicies-patch
  "Updates the parameters of a single ServiceConnectionPolicy.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionPolicies/patch

name <> 
ServiceConnectionPolicy:
ServiceConnectionPolicy

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the ServiceConnectionPolicy resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name ServiceConnectionPolicy]
    (projects-locations-serviceConnectionPolicies-patch
      name
      ServiceConnectionPolicy
      nil))
  ([name ServiceConnectionPolicy optional]
    {:method :patch,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ServiceConnectionPolicy}))

(defn projects-locations-serviceConnectionPolicies-delete
  "Deletes a single ServiceConnectionPolicy.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionPolicies/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
etag <string> Optional. The etag is computed by the server, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding."
  ([name]
    (projects-locations-serviceConnectionPolicies-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceConnectionPolicies-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionPolicies/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-serviceConnectionPolicies-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionPolicies/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-serviceConnectionPolicies-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceConnectionPolicies-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/serviceConnectionPolicies/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://networkconnectivity.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
GoogleLongrunningCancelOperationRequest:
GoogleLongrunningCancelOperationRequest"
  [name GoogleLongrunningCancelOperationRequest]
  {:method :post,
   :uri-template
   "https://networkconnectivity.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleLongrunningCancelOperationRequest})
