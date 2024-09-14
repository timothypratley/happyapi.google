(ns happyapi.google.apigateway-v1
  "API Gateway API

See: https://cloud.google.com/api-gateway/docs")

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://apigateway.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigateway.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://apigateway.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigateway.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigateway.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
ApigatewayCancelOperationRequest:
ApigatewayCancelOperationRequest"
  [name ApigatewayCancelOperationRequest]
  {:method :post,
   :uri-template "https://apigateway.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ApigatewayCancelOperationRequest})

(defn projects-locations-gateways-list
  "Lists Gateways in a given project and location.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/gateways/list

parent <> 

optional:
pageSize <integer> Page size.
filter <string> Filter.
orderBy <string> Order by parameters."
  ([parent] (projects-locations-gateways-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigateway.googleapis.com/v1/{+parent}/gateways",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-gateways-get
  "Gets details of a single Gateway.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/gateways/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigateway.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-gateways-create
  "Creates a new Gateway in a given project and location.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/gateways/create

parent <> 
ApigatewayGateway:
ApigatewayGateway

optional:
gatewayId <string> Required. Identifier to assign to the Gateway. Must be unique within scope of the parent resource."
  ([parent ApigatewayGateway]
    (projects-locations-gateways-create parent ApigatewayGateway nil))
  ([parent ApigatewayGateway optional]
    {:method :post,
     :uri-template
     "https://apigateway.googleapis.com/v1/{+parent}/gateways",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ApigatewayGateway}))

(defn projects-locations-gateways-patch
  "Updates the parameters of a single Gateway.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/gateways/patch

name <> 
ApigatewayGateway:
ApigatewayGateway

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the Gateway resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name ApigatewayGateway]
    (projects-locations-gateways-patch name ApigatewayGateway nil))
  ([name ApigatewayGateway optional]
    {:method :patch,
     :uri-template "https://apigateway.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ApigatewayGateway}))

(defn projects-locations-gateways-delete
  "Deletes a single Gateway.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/gateways/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigateway.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-gateways-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/gateways/setIamPolicy

resource <> 
ApigatewaySetIamPolicyRequest:
ApigatewaySetIamPolicyRequest"
  [resource ApigatewaySetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://apigateway.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ApigatewaySetIamPolicyRequest})

(defn projects-locations-gateways-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/gateways/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-gateways-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://apigateway.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-gateways-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/gateways/testIamPermissions

resource <> 
ApigatewayTestIamPermissionsRequest:
ApigatewayTestIamPermissionsRequest"
  [resource ApigatewayTestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://apigateway.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ApigatewayTestIamPermissionsRequest})

(defn projects-locations-apis-list
  "Lists Apis in a given project and location.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/list

parent <> 

optional:
pageSize <integer> Page size.
filter <string> Filter.
orderBy <string> Order by parameters."
  ([parent] (projects-locations-apis-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigateway.googleapis.com/v1/{+parent}/apis",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-get
  "Gets details of a single Api.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://apigateway.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-apis-create
  "Creates a new Api in a given project and location.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/create

parent <> 
ApigatewayApi:
ApigatewayApi

optional:
apiId <string> Required. Identifier to assign to the API. Must be unique within scope of the parent resource."
  ([parent ApigatewayApi]
    (projects-locations-apis-create parent ApigatewayApi nil))
  ([parent ApigatewayApi optional]
    {:method :post,
     :uri-template
     "https://apigateway.googleapis.com/v1/{+parent}/apis",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ApigatewayApi}))

(defn projects-locations-apis-patch
  "Updates the parameters of a single Api.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/patch

name <> 
ApigatewayApi:
ApigatewayApi

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the Api resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name ApigatewayApi]
    (projects-locations-apis-patch name ApigatewayApi nil))
  ([name ApigatewayApi optional]
    {:method :patch,
     :uri-template "https://apigateway.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ApigatewayApi}))

(defn projects-locations-apis-delete
  "Deletes a single Api.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigateway.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-apis-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/setIamPolicy

resource <> 
ApigatewaySetIamPolicyRequest:
ApigatewaySetIamPolicyRequest"
  [resource ApigatewaySetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://apigateway.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ApigatewaySetIamPolicyRequest})

(defn projects-locations-apis-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-apis-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://apigateway.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/testIamPermissions

resource <> 
ApigatewayTestIamPermissionsRequest:
ApigatewayTestIamPermissionsRequest"
  [resource ApigatewayTestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://apigateway.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ApigatewayTestIamPermissionsRequest})

(defn projects-locations-apis-configs-list
  "Lists ApiConfigs in a given project and location.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/configs/list

parent <> 

optional:
pageSize <integer> Page size.
filter <string> Filter.
orderBy <string> Order by parameters."
  ([parent] (projects-locations-apis-configs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://apigateway.googleapis.com/v1/{+parent}/configs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-configs-get
  "Gets details of a single ApiConfig.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/configs/get

name <> 

optional:
view <string> Specifies which fields of the API Config are returned in the response. Defaults to `BASIC` view."
  ([name] (projects-locations-apis-configs-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://apigateway.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-configs-create
  "Creates a new ApiConfig in a given project and location.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/configs/create

parent <> 
ApigatewayApiConfig:
ApigatewayApiConfig

optional:
apiConfigId <string> Required. Identifier to assign to the API Config. Must be unique within scope of the parent resource."
  ([parent ApigatewayApiConfig]
    (projects-locations-apis-configs-create
      parent
      ApigatewayApiConfig
      nil))
  ([parent ApigatewayApiConfig optional]
    {:method :post,
     :uri-template
     "https://apigateway.googleapis.com/v1/{+parent}/configs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ApigatewayApiConfig}))

(defn projects-locations-apis-configs-patch
  "Updates the parameters of a single ApiConfig.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/configs/patch

name <> 
ApigatewayApiConfig:
ApigatewayApiConfig

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the ApiConfig resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name ApigatewayApiConfig]
    (projects-locations-apis-configs-patch
      name
      ApigatewayApiConfig
      nil))
  ([name ApigatewayApiConfig optional]
    {:method :patch,
     :uri-template "https://apigateway.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ApigatewayApiConfig}))

(defn projects-locations-apis-configs-delete
  "Deletes a single ApiConfig.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/configs/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://apigateway.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-apis-configs-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/configs/setIamPolicy

resource <> 
ApigatewaySetIamPolicyRequest:
ApigatewaySetIamPolicyRequest"
  [resource ApigatewaySetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://apigateway.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ApigatewaySetIamPolicyRequest})

(defn projects-locations-apis-configs-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/configs/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-apis-configs-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://apigateway.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-apis-configs-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/api-gateway/docs/v1/reference/rest/v1/projects/locations/apis/configs/testIamPermissions

resource <> 
ApigatewayTestIamPermissionsRequest:
ApigatewayTestIamPermissionsRequest"
  [resource ApigatewayTestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://apigateway.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ApigatewayTestIamPermissionsRequest})
