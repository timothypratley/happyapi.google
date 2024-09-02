(ns happyapi.google.networkservices-v1
  "Network Services API

See: https://cloud.google.com/products/networking"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-httpRoutes-list
  "Lists HttpRoute in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/httpRoutes/list

parent <> 

optional:
pageSize <integer> Maximum number of HttpRoutes to return per call."
  ([parent] (projects-locations-httpRoutes-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/httpRoutes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-httpRoutes-get
  "Gets details of a single HttpRoute.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/httpRoutes/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-httpRoutes-create
  "Creates a new HttpRoute in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/httpRoutes/create

parent <> 
HttpRoute:
HttpRoute

optional:
httpRouteId <string> Required. Short name of the HttpRoute resource to be created."
  ([parent HttpRoute]
    (projects-locations-httpRoutes-create parent HttpRoute nil))
  ([parent HttpRoute optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/httpRoutes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body HttpRoute})))

(defn projects-locations-httpRoutes-patch
  "Updates the parameters of a single HttpRoute.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/httpRoutes/patch

name <> 
HttpRoute:
HttpRoute

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the HttpRoute resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name HttpRoute]
    (projects-locations-httpRoutes-patch name HttpRoute nil))
  ([name HttpRoute optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body HttpRoute})))

(defn projects-locations-httpRoutes-delete
  "Deletes a single HttpRoute.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/httpRoutes/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-lbTrafficExtensions-list
  "Lists `LbTrafficExtension` resources in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/lbTrafficExtensions/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. The server might return fewer items than requested. If unspecified, the server picks an appropriate default.
filter <string> Optional. Filtering results.
orderBy <string> Optional. Hint for how to order the results."
  ([parent] (projects-locations-lbTrafficExtensions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/lbTrafficExtensions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-lbTrafficExtensions-get
  "Gets details of the specified `LbTrafficExtension` resource.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/lbTrafficExtensions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-lbTrafficExtensions-create
  "Creates a new `LbTrafficExtension` resource in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/lbTrafficExtensions/create

parent <> 
LbTrafficExtension:
LbTrafficExtension

optional:
lbTrafficExtensionId <string> Required. User-provided ID of the `LbTrafficExtension` resource to be created.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server can ignore the request if it has already been completed. The server guarantees that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, ignores the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent LbTrafficExtension]
    (projects-locations-lbTrafficExtensions-create
      parent
      LbTrafficExtension
      nil))
  ([parent LbTrafficExtension optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/lbTrafficExtensions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body LbTrafficExtension})))

(defn projects-locations-lbTrafficExtensions-patch
  "Updates the parameters of the specified `LbTrafficExtension` resource.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/lbTrafficExtensions/patch

name <> 
LbTrafficExtension:
LbTrafficExtension

optional:
updateMask <string> Optional. Used to specify the fields to be overwritten in the `LbTrafficExtension` resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field is overwritten if it is in the mask. If the user does not specify a mask, then all fields are overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server can ignore the request if it has already been completed. The server guarantees that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, ignores the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name LbTrafficExtension]
    (projects-locations-lbTrafficExtensions-patch
      name
      LbTrafficExtension
      nil))
  ([name LbTrafficExtension optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body LbTrafficExtension})))

(defn projects-locations-lbTrafficExtensions-delete
  "Deletes the specified `LbTrafficExtension` resource.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/lbTrafficExtensions/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server can ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, ignores the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-lbTrafficExtensions-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-gateways-list
  "Lists Gateways in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/gateways/list

parent <> 

optional:
pageSize <integer> Maximum number of Gateways to return per call."
  ([parent] (projects-locations-gateways-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/gateways",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-gateways-get
  "Gets details of a single Gateway.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/gateways/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-gateways-create
  "Creates a new Gateway in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/gateways/create

parent <> 
Gateway:
Gateway

optional:
gatewayId <string> Required. Short name of the Gateway resource to be created."
  ([parent Gateway]
    (projects-locations-gateways-create parent Gateway nil))
  ([parent Gateway optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/gateways",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Gateway})))

(defn projects-locations-gateways-patch
  "Updates the parameters of a single Gateway.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/gateways/patch

name <> 
Gateway:
Gateway

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the Gateway resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name Gateway] (projects-locations-gateways-patch name Gateway nil))
  ([name Gateway optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Gateway})))

(defn projects-locations-gateways-delete
  "Deletes a single Gateway.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/gateways/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-lbRouteExtensions-list
  "Lists `LbRouteExtension` resources in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/lbRouteExtensions/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. The server might return fewer items than requested. If unspecified, the server picks an appropriate default.
filter <string> Optional. Filtering results.
orderBy <string> Optional. Hint for how to order the results."
  ([parent] (projects-locations-lbRouteExtensions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/lbRouteExtensions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-lbRouteExtensions-get
  "Gets details of the specified `LbRouteExtension` resource.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/lbRouteExtensions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-lbRouteExtensions-create
  "Creates a new `LbRouteExtension` resource in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/lbRouteExtensions/create

parent <> 
LbRouteExtension:
LbRouteExtension

optional:
lbRouteExtensionId <string> Required. User-provided ID of the `LbRouteExtension` resource to be created.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server can ignore the request if it has already been completed. The server guarantees that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, ignores the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent LbRouteExtension]
    (projects-locations-lbRouteExtensions-create
      parent
      LbRouteExtension
      nil))
  ([parent LbRouteExtension optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/lbRouteExtensions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body LbRouteExtension})))

(defn projects-locations-lbRouteExtensions-patch
  "Updates the parameters of the specified `LbRouteExtension` resource.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/lbRouteExtensions/patch

name <> 
LbRouteExtension:
LbRouteExtension

optional:
updateMask <string> Optional. Used to specify the fields to be overwritten in the `LbRouteExtension` resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field is overwritten if it is in the mask. If the user does not specify a mask, then all fields are overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server can ignore the request if it has already been completed. The server guarantees that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, ignores the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name LbRouteExtension]
    (projects-locations-lbRouteExtensions-patch
      name
      LbRouteExtension
      nil))
  ([name LbRouteExtension optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body LbRouteExtension})))

(defn projects-locations-lbRouteExtensions-delete
  "Deletes the specified `LbRouteExtension` resource.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/lbRouteExtensions/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server can ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, ignores the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-lbRouteExtensions-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-serviceBindings-list
  "Lists ServiceBinding in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/serviceBindings/list

parent <> 

optional:
pageSize <integer> Maximum number of ServiceBindings to return per call."
  ([parent] (projects-locations-serviceBindings-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/serviceBindings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-serviceBindings-get
  "Gets details of a single ServiceBinding.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/serviceBindings/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceBindings-create
  "Creates a new ServiceBinding in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/serviceBindings/create

parent <> 
ServiceBinding:
ServiceBinding

optional:
serviceBindingId <string> Required. Short name of the ServiceBinding resource to be created."
  ([parent ServiceBinding]
    (projects-locations-serviceBindings-create
      parent
      ServiceBinding
      nil))
  ([parent ServiceBinding optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/serviceBindings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ServiceBinding})))

(defn projects-locations-serviceBindings-delete
  "Deletes a single ServiceBinding.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/serviceBindings/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-edgeCacheOrigins-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/edgeCacheOrigins/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://networkservices.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-edgeCacheOrigins-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/edgeCacheOrigins/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-edgeCacheOrigins-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-edgeCacheOrigins-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/edgeCacheOrigins/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://networkservices.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-serviceLbPolicies-list
  "Lists ServiceLbPolicies in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/serviceLbPolicies/list

parent <> 

optional:
pageSize <integer> Maximum number of ServiceLbPolicies to return per call."
  ([parent] (projects-locations-serviceLbPolicies-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/serviceLbPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-serviceLbPolicies-get
  "Gets details of a single ServiceLbPolicy.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/serviceLbPolicies/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceLbPolicies-create
  "Creates a new ServiceLbPolicy in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/serviceLbPolicies/create

parent <> 
ServiceLbPolicy:
ServiceLbPolicy

optional:
serviceLbPolicyId <string> Required. Short name of the ServiceLbPolicy resource to be created. E.g. for resource name `projects/{project}/locations/{location}/serviceLbPolicies/{service_lb_policy_name}`. the id is value of {service_lb_policy_name}"
  ([parent ServiceLbPolicy]
    (projects-locations-serviceLbPolicies-create
      parent
      ServiceLbPolicy
      nil))
  ([parent ServiceLbPolicy optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/serviceLbPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ServiceLbPolicy})))

(defn projects-locations-serviceLbPolicies-patch
  "Updates the parameters of a single ServiceLbPolicy.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/serviceLbPolicies/patch

name <> 
ServiceLbPolicy:
ServiceLbPolicy

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the ServiceLbPolicy resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name ServiceLbPolicy]
    (projects-locations-serviceLbPolicies-patch
      name
      ServiceLbPolicy
      nil))
  ([name ServiceLbPolicy optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ServiceLbPolicy})))

(defn projects-locations-serviceLbPolicies-delete
  "Deletes a single ServiceLbPolicy.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/serviceLbPolicies/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serviceLbPolicies-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/serviceLbPolicies/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://networkservices.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-serviceLbPolicies-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/serviceLbPolicies/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-serviceLbPolicies-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-serviceLbPolicies-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/serviceLbPolicies/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://networkservices.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-edgeCacheServices-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/edgeCacheServices/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://networkservices.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-edgeCacheServices-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/edgeCacheServices/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-edgeCacheServices-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-edgeCacheServices-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/edgeCacheServices/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://networkservices.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-edgeCacheKeysets-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/edgeCacheKeysets/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://networkservices.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-edgeCacheKeysets-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/edgeCacheKeysets/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-edgeCacheKeysets-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-edgeCacheKeysets-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/edgeCacheKeysets/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://networkservices.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-tcpRoutes-list
  "Lists TcpRoute in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/tcpRoutes/list

parent <> 

optional:
pageSize <integer> Maximum number of TcpRoutes to return per call."
  ([parent] (projects-locations-tcpRoutes-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/tcpRoutes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tcpRoutes-get
  "Gets details of a single TcpRoute.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/tcpRoutes/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tcpRoutes-create
  "Creates a new TcpRoute in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/tcpRoutes/create

parent <> 
TcpRoute:
TcpRoute

optional:
tcpRouteId <string> Required. Short name of the TcpRoute resource to be created."
  ([parent TcpRoute]
    (projects-locations-tcpRoutes-create parent TcpRoute nil))
  ([parent TcpRoute optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/tcpRoutes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TcpRoute})))

(defn projects-locations-tcpRoutes-patch
  "Updates the parameters of a single TcpRoute.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/tcpRoutes/patch

name <> 
TcpRoute:
TcpRoute

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the TcpRoute resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name TcpRoute]
    (projects-locations-tcpRoutes-patch name TcpRoute nil))
  ([name TcpRoute optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TcpRoute})))

(defn projects-locations-tcpRoutes-delete
  "Deletes a single TcpRoute.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/tcpRoutes/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tlsRoutes-list
  "Lists TlsRoute in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/tlsRoutes/list

parent <> 

optional:
pageSize <integer> Maximum number of TlsRoutes to return per call."
  ([parent] (projects-locations-tlsRoutes-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/tlsRoutes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tlsRoutes-get
  "Gets details of a single TlsRoute.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/tlsRoutes/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tlsRoutes-create
  "Creates a new TlsRoute in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/tlsRoutes/create

parent <> 
TlsRoute:
TlsRoute

optional:
tlsRouteId <string> Required. Short name of the TlsRoute resource to be created."
  ([parent TlsRoute]
    (projects-locations-tlsRoutes-create parent TlsRoute nil))
  ([parent TlsRoute optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/tlsRoutes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TlsRoute})))

(defn projects-locations-tlsRoutes-patch
  "Updates the parameters of a single TlsRoute.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/tlsRoutes/patch

name <> 
TlsRoute:
TlsRoute

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the TlsRoute resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name TlsRoute]
    (projects-locations-tlsRoutes-patch name TlsRoute nil))
  ([name TlsRoute optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TlsRoute})))

(defn projects-locations-tlsRoutes-delete
  "Deletes a single TlsRoute.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/tlsRoutes/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-grpcRoutes-list
  "Lists GrpcRoutes in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/grpcRoutes/list

parent <> 

optional:
pageSize <integer> Maximum number of GrpcRoutes to return per call."
  ([parent] (projects-locations-grpcRoutes-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/grpcRoutes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-grpcRoutes-get
  "Gets details of a single GrpcRoute.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/grpcRoutes/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-grpcRoutes-create
  "Creates a new GrpcRoute in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/grpcRoutes/create

parent <> 
GrpcRoute:
GrpcRoute

optional:
grpcRouteId <string> Required. Short name of the GrpcRoute resource to be created."
  ([parent GrpcRoute]
    (projects-locations-grpcRoutes-create parent GrpcRoute nil))
  ([parent GrpcRoute optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/grpcRoutes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GrpcRoute})))

(defn projects-locations-grpcRoutes-patch
  "Updates the parameters of a single GrpcRoute.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/grpcRoutes/patch

name <> 
GrpcRoute:
GrpcRoute

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the GrpcRoute resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name GrpcRoute]
    (projects-locations-grpcRoutes-patch name GrpcRoute nil))
  ([name GrpcRoute optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GrpcRoute})))

(defn projects-locations-grpcRoutes-delete
  "Deletes a single GrpcRoute.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/grpcRoutes/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-meshes-list
  "Lists Meshes in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/meshes/list

parent <> 

optional:
pageSize <integer> Maximum number of Meshes to return per call."
  ([parent] (projects-locations-meshes-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/meshes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-meshes-get
  "Gets details of a single Mesh.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/meshes/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-meshes-create
  "Creates a new Mesh in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/meshes/create

parent <> 
Mesh:
Mesh

optional:
meshId <string> Required. Short name of the Mesh resource to be created."
  ([parent Mesh] (projects-locations-meshes-create parent Mesh nil))
  ([parent Mesh optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/meshes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Mesh})))

(defn projects-locations-meshes-patch
  "Updates the parameters of a single Mesh.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/meshes/patch

name <> 
Mesh:
Mesh

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the Mesh resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name Mesh] (projects-locations-meshes-patch name Mesh nil))
  ([name Mesh optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Mesh})))

(defn projects-locations-meshes-delete
  "Deletes a single Mesh.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/meshes/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-endpointPolicies-list
  "Lists EndpointPolicies in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/endpointPolicies/list

parent <> 

optional:
pageSize <integer> Maximum number of EndpointPolicies to return per call."
  ([parent] (projects-locations-endpointPolicies-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/endpointPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-endpointPolicies-get
  "Gets details of a single EndpointPolicy.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/endpointPolicies/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-endpointPolicies-create
  "Creates a new EndpointPolicy in a given project and location.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/endpointPolicies/create

parent <> 
EndpointPolicy:
EndpointPolicy

optional:
endpointPolicyId <string> Required. Short name of the EndpointPolicy resource to be created. E.g. \"CustomECS\"."
  ([parent EndpointPolicy]
    (projects-locations-endpointPolicies-create
      parent
      EndpointPolicy
      nil))
  ([parent EndpointPolicy optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+parent}/endpointPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body EndpointPolicy})))

(defn projects-locations-endpointPolicies-patch
  "Updates the parameters of a single EndpointPolicy.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/endpointPolicies/patch

name <> 
EndpointPolicy:
EndpointPolicy

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the EndpointPolicy resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name EndpointPolicy]
    (projects-locations-endpointPolicies-patch
      name
      EndpointPolicy
      nil))
  ([name EndpointPolicy optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body EndpointPolicy})))

(defn projects-locations-endpointPolicies-delete
  "Deletes a single EndpointPolicy.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/endpointPolicies/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://networkservices.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://networkservices.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/products/networking/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://networkservices.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))
