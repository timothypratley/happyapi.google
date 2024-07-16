(ns happyapi.google.networksecurity-v1
  "Network Security API

See: https://cloud.google.com/networking"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-authorizationPolicies-list
  "Lists AuthorizationPolicies in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/authorizationPolicies/list

parent <> 

optional:
pageSize <integer> Maximum number of AuthorizationPolicies to return per call."
  ([parent] (projects-locations-authorizationPolicies-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/authorizationPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-authorizationPolicies-get
  "Gets details of a single AuthorizationPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/authorizationPolicies/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-authorizationPolicies-create
  "Creates a new AuthorizationPolicy in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/authorizationPolicies/create

parent <> 
AuthorizationPolicy:
AuthorizationPolicy

optional:
authorizationPolicyId <string> Required. Short name of the AuthorizationPolicy resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. \"authz_policy\"."
  ([parent AuthorizationPolicy]
    (projects-locations-authorizationPolicies-create
      parent
      AuthorizationPolicy
      nil))
  ([parent AuthorizationPolicy optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/authorizationPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body AuthorizationPolicy})))

(defn projects-locations-authorizationPolicies-patch
  "Updates the parameters of a single AuthorizationPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/authorizationPolicies/patch

name <> 
AuthorizationPolicy:
AuthorizationPolicy

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the AuthorizationPolicy resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name AuthorizationPolicy]
    (projects-locations-authorizationPolicies-patch
      name
      AuthorizationPolicy
      nil))
  ([name AuthorizationPolicy optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body AuthorizationPolicy})))

(defn projects-locations-authorizationPolicies-delete
  "Deletes a single AuthorizationPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/authorizationPolicies/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-authorizationPolicies-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/authorizationPolicies/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1SetIamPolicyRequest}))

(defn projects-locations-authorizationPolicies-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/authorizationPolicies/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-authorizationPolicies-getIamPolicy
      resource
      nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-authorizationPolicies-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/authorizationPolicies/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1TestIamPermissionsRequest}))

(defn projects-locations-gatewaySecurityPolicies-list
  "Lists GatewaySecurityPolicies in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/gatewaySecurityPolicies/list

parent <> 

optional:
pageSize <integer> Maximum number of GatewaySecurityPolicies to return per call."
  ([parent]
    (projects-locations-gatewaySecurityPolicies-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/gatewaySecurityPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-gatewaySecurityPolicies-get
  "Gets details of a single GatewaySecurityPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/gatewaySecurityPolicies/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-gatewaySecurityPolicies-create
  "Creates a new GatewaySecurityPolicy in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/gatewaySecurityPolicies/create

parent <> 
GatewaySecurityPolicy:
GatewaySecurityPolicy

optional:
gatewaySecurityPolicyId <string> Required. Short name of the GatewaySecurityPolicy resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. \"gateway_security_policy1\"."
  ([parent GatewaySecurityPolicy]
    (projects-locations-gatewaySecurityPolicies-create
      parent
      GatewaySecurityPolicy
      nil))
  ([parent GatewaySecurityPolicy optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/gatewaySecurityPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GatewaySecurityPolicy})))

(defn projects-locations-gatewaySecurityPolicies-patch
  "Updates the parameters of a single GatewaySecurityPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/gatewaySecurityPolicies/patch

name <> 
GatewaySecurityPolicy:
GatewaySecurityPolicy

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the GatewaySecurityPolicy resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name GatewaySecurityPolicy]
    (projects-locations-gatewaySecurityPolicies-patch
      name
      GatewaySecurityPolicy
      nil))
  ([name GatewaySecurityPolicy optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GatewaySecurityPolicy})))

(defn projects-locations-gatewaySecurityPolicies-delete
  "Deletes a single GatewaySecurityPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/gatewaySecurityPolicies/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-gatewaySecurityPolicies-rules-list
  "Lists GatewaySecurityPolicyRules in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/gatewaySecurityPolicies/rules/list

parent <> 

optional:
pageSize <integer> Maximum number of GatewaySecurityPolicyRules to return per call."
  ([parent]
    (projects-locations-gatewaySecurityPolicies-rules-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/rules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-gatewaySecurityPolicies-rules-get
  "Gets details of a single GatewaySecurityPolicyRule.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/gatewaySecurityPolicies/rules/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-gatewaySecurityPolicies-rules-create
  "Creates a new GatewaySecurityPolicy in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/gatewaySecurityPolicies/rules/create

parent <> 
GatewaySecurityPolicyRule:
GatewaySecurityPolicyRule

optional:
gatewaySecurityPolicyRuleId <string> The ID to use for the rule, which will become the final component of the rule's resource name. This value should be 4-63 characters, and valid characters are /a-z-/."
  ([parent GatewaySecurityPolicyRule]
    (projects-locations-gatewaySecurityPolicies-rules-create
      parent
      GatewaySecurityPolicyRule
      nil))
  ([parent GatewaySecurityPolicyRule optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/rules",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GatewaySecurityPolicyRule})))

(defn projects-locations-gatewaySecurityPolicies-rules-patch
  "Updates the parameters of a single GatewaySecurityPolicyRule.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/gatewaySecurityPolicies/rules/patch

name <> 
GatewaySecurityPolicyRule:
GatewaySecurityPolicyRule

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the GatewaySecurityPolicy resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name GatewaySecurityPolicyRule]
    (projects-locations-gatewaySecurityPolicies-rules-patch
      name
      GatewaySecurityPolicyRule
      nil))
  ([name GatewaySecurityPolicyRule optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GatewaySecurityPolicyRule})))

(defn projects-locations-gatewaySecurityPolicies-rules-delete
  "Deletes a single GatewaySecurityPolicyRule.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/gatewaySecurityPolicies/rules/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serverTlsPolicies-list
  "Lists ServerTlsPolicies in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/serverTlsPolicies/list

parent <> 

optional:
pageSize <integer> Maximum number of ServerTlsPolicies to return per call."
  ([parent] (projects-locations-serverTlsPolicies-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/serverTlsPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-serverTlsPolicies-get
  "Gets details of a single ServerTlsPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/serverTlsPolicies/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serverTlsPolicies-create
  "Creates a new ServerTlsPolicy in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/serverTlsPolicies/create

parent <> 
ServerTlsPolicy:
ServerTlsPolicy

optional:
serverTlsPolicyId <string> Required. Short name of the ServerTlsPolicy resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. \"server_mtls_policy\"."
  ([parent ServerTlsPolicy]
    (projects-locations-serverTlsPolicies-create
      parent
      ServerTlsPolicy
      nil))
  ([parent ServerTlsPolicy optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/serverTlsPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ServerTlsPolicy})))

(defn projects-locations-serverTlsPolicies-patch
  "Updates the parameters of a single ServerTlsPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/serverTlsPolicies/patch

name <> 
ServerTlsPolicy:
ServerTlsPolicy

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the ServerTlsPolicy resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name ServerTlsPolicy]
    (projects-locations-serverTlsPolicies-patch
      name
      ServerTlsPolicy
      nil))
  ([name ServerTlsPolicy optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ServerTlsPolicy})))

(defn projects-locations-serverTlsPolicies-delete
  "Deletes a single ServerTlsPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/serverTlsPolicies/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-serverTlsPolicies-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/serverTlsPolicies/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1SetIamPolicyRequest}))

(defn projects-locations-serverTlsPolicies-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/serverTlsPolicies/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-serverTlsPolicies-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-serverTlsPolicies-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/serverTlsPolicies/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1TestIamPermissionsRequest}))

(defn projects-locations-tlsInspectionPolicies-list
  "Lists TlsInspectionPolicies in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/tlsInspectionPolicies/list

parent <> 

optional:
pageSize <integer> Maximum number of TlsInspectionPolicies to return per call."
  ([parent] (projects-locations-tlsInspectionPolicies-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/tlsInspectionPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-tlsInspectionPolicies-get
  "Gets details of a single TlsInspectionPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/tlsInspectionPolicies/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-tlsInspectionPolicies-create
  "Creates a new TlsInspectionPolicy in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/tlsInspectionPolicies/create

parent <> 
TlsInspectionPolicy:
TlsInspectionPolicy

optional:
tlsInspectionPolicyId <string> Required. Short name of the TlsInspectionPolicy resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. \"tls_inspection_policy1\"."
  ([parent TlsInspectionPolicy]
    (projects-locations-tlsInspectionPolicies-create
      parent
      TlsInspectionPolicy
      nil))
  ([parent TlsInspectionPolicy optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/tlsInspectionPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TlsInspectionPolicy})))

(defn projects-locations-tlsInspectionPolicies-patch
  "Updates the parameters of a single TlsInspectionPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/tlsInspectionPolicies/patch

name <> 
TlsInspectionPolicy:
TlsInspectionPolicy

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the TlsInspectionPolicy resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name TlsInspectionPolicy]
    (projects-locations-tlsInspectionPolicies-patch
      name
      TlsInspectionPolicy
      nil))
  ([name TlsInspectionPolicy optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TlsInspectionPolicy})))

(defn projects-locations-tlsInspectionPolicies-delete
  "Deletes a single TlsInspectionPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/tlsInspectionPolicies/delete

name <> 

optional:
force <boolean> If set to true, any rules for this TlsInspectionPolicy will also be deleted. (Otherwise, the request will only work if the TlsInspectionPolicy has no rules.)"
  ([name] (projects-locations-tlsInspectionPolicies-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-firewallEndpointAssociations-list
  "Lists Associations in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/firewallEndpointAssociations/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Optional. Filtering results
orderBy <string> Hint for how to order the results"
  ([parent]
    (projects-locations-firewallEndpointAssociations-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/firewallEndpointAssociations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-firewallEndpointAssociations-get
  "Gets details of a single FirewallEndpointAssociation.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/firewallEndpointAssociations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-firewallEndpointAssociations-create
  "Creates a new FirewallEndpointAssociation in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/firewallEndpointAssociations/create

parent <> 
FirewallEndpointAssociation:
FirewallEndpointAssociation

optional:
firewallEndpointAssociationId <string> Optional. Id of the requesting object. If auto-generating Id server-side, remove this field and firewall_endpoint_association_id from the method_signature of Create RPC.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent FirewallEndpointAssociation]
    (projects-locations-firewallEndpointAssociations-create
      parent
      FirewallEndpointAssociation
      nil))
  ([parent FirewallEndpointAssociation optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/firewallEndpointAssociations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body FirewallEndpointAssociation})))

(defn projects-locations-firewallEndpointAssociations-delete
  "Deletes a single FirewallEndpointAssociation.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/firewallEndpointAssociations/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name]
    (projects-locations-firewallEndpointAssociations-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-firewallEndpointAssociations-patch
  "Update a single FirewallEndpointAssociation.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/firewallEndpointAssociations/patch

name <> 
FirewallEndpointAssociation:
FirewallEndpointAssociation

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the Association resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name FirewallEndpointAssociation]
    (projects-locations-firewallEndpointAssociations-patch
      name
      FirewallEndpointAssociation
      nil))
  ([name FirewallEndpointAssociation optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body FirewallEndpointAssociation})))

(defn projects-locations-addressGroups-list
  "Lists address groups in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/addressGroups/list

parent <> 

optional:
pageSize <integer> Maximum number of AddressGroups to return per call."
  ([parent] (projects-locations-addressGroups-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/addressGroups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-addressGroups-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/addressGroups/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1SetIamPolicyRequest}))

(defn projects-locations-addressGroups-delete
  "Deletes a single address group.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/addressGroups/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-addressGroups-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-addressGroups-cloneItems
  "Clones items from one address group to another.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/addressGroups/cloneItems

addressGroup <> 
CloneAddressGroupItemsRequest:
CloneAddressGroupItemsRequest"
  [addressGroup CloneAddressGroupItemsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+addressGroup}:cloneItems",
     :uri-template-args {"addressGroup" addressGroup},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CloneAddressGroupItemsRequest}))

(defn projects-locations-addressGroups-patch
  "Updates the parameters of a single address group.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/addressGroups/patch

name <> 
AddressGroup:
AddressGroup

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the AddressGroup resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name AddressGroup]
    (projects-locations-addressGroups-patch name AddressGroup nil))
  ([name AddressGroup optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body AddressGroup})))

(defn projects-locations-addressGroups-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/addressGroups/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-addressGroups-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-addressGroups-create
  "Creates a new address group in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/addressGroups/create

parent <> 
AddressGroup:
AddressGroup

optional:
addressGroupId <string> Required. Short name of the AddressGroup resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. \"authz_policy\".
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent AddressGroup]
    (projects-locations-addressGroups-create parent AddressGroup nil))
  ([parent AddressGroup optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/addressGroups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body AddressGroup})))

(defn projects-locations-addressGroups-removeItems
  "Removes items from an address group.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/addressGroups/removeItems

addressGroup <> 
RemoveAddressGroupItemsRequest:
RemoveAddressGroupItemsRequest"
  [addressGroup RemoveAddressGroupItemsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+addressGroup}:removeItems",
     :uri-template-args {"addressGroup" addressGroup},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RemoveAddressGroupItemsRequest}))

(defn projects-locations-addressGroups-listReferences
  "Lists references of an address group.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/addressGroups/listReferences

addressGroup <> 

optional:
pageSize <integer> The maximum number of references to return. If unspecified, server will pick an appropriate default. Server may return fewer items than requested. A caller should only rely on response's next_page_token to determine if there are more AddressGroupUsers left to be queried."
  ([addressGroup]
    (projects-locations-addressGroups-listReferences addressGroup nil))
  ([addressGroup optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+addressGroup}:listReferences",
       :uri-template-args {"addressGroup" addressGroup},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-addressGroups-addItems
  "Adds items to an address group.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/addressGroups/addItems

addressGroup <> 
AddAddressGroupItemsRequest:
AddAddressGroupItemsRequest"
  [addressGroup AddAddressGroupItemsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+addressGroup}:addItems",
     :uri-template-args {"addressGroup" addressGroup},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AddAddressGroupItemsRequest}))

(defn projects-locations-addressGroups-get
  "Gets details of a single address group.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/addressGroups/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-addressGroups-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/addressGroups/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1TestIamPermissionsRequest}))

(defn projects-locations-clientTlsPolicies-list
  "Lists ClientTlsPolicies in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/clientTlsPolicies/list

parent <> 

optional:
pageSize <integer> Maximum number of ClientTlsPolicies to return per call."
  ([parent] (projects-locations-clientTlsPolicies-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/clientTlsPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-clientTlsPolicies-get
  "Gets details of a single ClientTlsPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/clientTlsPolicies/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clientTlsPolicies-create
  "Creates a new ClientTlsPolicy in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/clientTlsPolicies/create

parent <> 
ClientTlsPolicy:
ClientTlsPolicy

optional:
clientTlsPolicyId <string> Required. Short name of the ClientTlsPolicy resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. \"client_mtls_policy\"."
  ([parent ClientTlsPolicy]
    (projects-locations-clientTlsPolicies-create
      parent
      ClientTlsPolicy
      nil))
  ([parent ClientTlsPolicy optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/clientTlsPolicies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ClientTlsPolicy})))

(defn projects-locations-clientTlsPolicies-patch
  "Updates the parameters of a single ClientTlsPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/clientTlsPolicies/patch

name <> 
ClientTlsPolicy:
ClientTlsPolicy

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the ClientTlsPolicy resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name ClientTlsPolicy]
    (projects-locations-clientTlsPolicies-patch
      name
      ClientTlsPolicy
      nil))
  ([name ClientTlsPolicy optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ClientTlsPolicy})))

(defn projects-locations-clientTlsPolicies-delete
  "Deletes a single ClientTlsPolicy.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/clientTlsPolicies/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clientTlsPolicies-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/clientTlsPolicies/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1SetIamPolicyRequest}))

(defn projects-locations-clientTlsPolicies-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/clientTlsPolicies/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-clientTlsPolicies-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-clientTlsPolicies-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/clientTlsPolicies/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1TestIamPermissionsRequest}))

(defn projects-locations-urlLists-list
  "Lists UrlLists in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/urlLists/list

parent <> 

optional:
pageSize <integer> Maximum number of UrlLists to return per call."
  ([parent] (projects-locations-urlLists-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/urlLists",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-urlLists-get
  "Gets details of a single UrlList.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/urlLists/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-urlLists-create
  "Creates a new UrlList in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/urlLists/create

parent <> 
UrlList:
UrlList

optional:
urlListId <string> Required. Short name of the UrlList resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. \"url_list\"."
  ([parent UrlList]
    (projects-locations-urlLists-create parent UrlList nil))
  ([parent UrlList optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/urlLists",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body UrlList})))

(defn projects-locations-urlLists-patch
  "Updates the parameters of a single UrlList.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/urlLists/patch

name <> 
UrlList:
UrlList

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the UrlList resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten."
  ([name UrlList] (projects-locations-urlLists-patch name UrlList nil))
  ([name UrlList optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body UrlList})))

(defn projects-locations-urlLists-delete
  "Deletes a single UrlList.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/urlLists/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/networking/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn organizations-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (organizations-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn organizations-locations-addressGroups-list
  "Lists address groups in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/addressGroups/list

parent <> 

optional:
pageSize <integer> Maximum number of AddressGroups to return per call."
  ([parent] (organizations-locations-addressGroups-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/addressGroups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-addressGroups-delete
  "Deletes an address group.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/addressGroups/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (organizations-locations-addressGroups-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-addressGroups-cloneItems
  "Clones items from one address group to another.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/addressGroups/cloneItems

addressGroup <> 
CloneAddressGroupItemsRequest:
CloneAddressGroupItemsRequest"
  [addressGroup CloneAddressGroupItemsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+addressGroup}:cloneItems",
     :uri-template-args {"addressGroup" addressGroup},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CloneAddressGroupItemsRequest}))

(defn organizations-locations-addressGroups-patch
  "Updates parameters of an address group.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/addressGroups/patch

name <> 
AddressGroup:
AddressGroup

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the AddressGroup resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name AddressGroup]
    (organizations-locations-addressGroups-patch
      name
      AddressGroup
      nil))
  ([name AddressGroup optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body AddressGroup})))

(defn organizations-locations-addressGroups-create
  "Creates a new address group in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/addressGroups/create

parent <> 
AddressGroup:
AddressGroup

optional:
addressGroupId <string> Required. Short name of the AddressGroup resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. \"authz_policy\".
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent AddressGroup]
    (organizations-locations-addressGroups-create
      parent
      AddressGroup
      nil))
  ([parent AddressGroup optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/addressGroups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body AddressGroup})))

(defn organizations-locations-addressGroups-removeItems
  "Removes items from an address group.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/addressGroups/removeItems

addressGroup <> 
RemoveAddressGroupItemsRequest:
RemoveAddressGroupItemsRequest"
  [addressGroup RemoveAddressGroupItemsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+addressGroup}:removeItems",
     :uri-template-args {"addressGroup" addressGroup},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RemoveAddressGroupItemsRequest}))

(defn organizations-locations-addressGroups-listReferences
  "Lists references of an address group.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/addressGroups/listReferences

addressGroup <> 

optional:
pageSize <integer> The maximum number of references to return. If unspecified, server will pick an appropriate default. Server may return fewer items than requested. A caller should only rely on response's next_page_token to determine if there are more AddressGroupUsers left to be queried."
  ([addressGroup]
    (organizations-locations-addressGroups-listReferences
      addressGroup
      nil))
  ([addressGroup optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+addressGroup}:listReferences",
       :uri-template-args {"addressGroup" addressGroup},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-addressGroups-addItems
  "Adds items to an address group.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/addressGroups/addItems

addressGroup <> 
AddAddressGroupItemsRequest:
AddAddressGroupItemsRequest"
  [addressGroup AddAddressGroupItemsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://networksecurity.googleapis.com/v1/{+addressGroup}:addItems",
     :uri-template-args {"addressGroup" addressGroup},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AddAddressGroupItemsRequest}))

(defn organizations-locations-addressGroups-get
  "Gets details of a single address group.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/addressGroups/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-firewallEndpoints-list
  "Lists FirewallEndpoints in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/firewallEndpoints/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Optional. Filtering results
orderBy <string> Hint for how to order the results"
  ([parent]
    (organizations-locations-firewallEndpoints-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/firewallEndpoints",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-firewallEndpoints-get
  "Gets details of a single Endpoint.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/firewallEndpoints/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-firewallEndpoints-create
  "Creates a new FirewallEndpoint in a given project and location.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/firewallEndpoints/create

parent <> 
FirewallEndpoint:
FirewallEndpoint

optional:
firewallEndpointId <string> Required. Id of the requesting object. If auto-generating Id server-side, remove this field and firewall_endpoint_id from the method_signature of Create RPC.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent FirewallEndpoint]
    (organizations-locations-firewallEndpoints-create
      parent
      FirewallEndpoint
      nil))
  ([parent FirewallEndpoint optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/firewallEndpoints",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body FirewallEndpoint})))

(defn organizations-locations-firewallEndpoints-delete
  "Deletes a single Endpoint.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/firewallEndpoints/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (organizations-locations-firewallEndpoints-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-firewallEndpoints-patch
  "Update a single Endpoint.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/firewallEndpoints/patch

name <> 
FirewallEndpoint:
FirewallEndpoint

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the Endpoint resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name FirewallEndpoint]
    (organizations-locations-firewallEndpoints-patch
      name
      FirewallEndpoint
      nil))
  ([name FirewallEndpoint optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body FirewallEndpoint})))

(defn organizations-locations-securityProfileGroups-list
  "Lists SecurityProfileGroups in a given organization and location.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/securityProfileGroups/list

parent <> 

optional:
pageSize <integer> Maximum number of SecurityProfileGroups to return per call."
  ([parent]
    (organizations-locations-securityProfileGroups-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/securityProfileGroups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-securityProfileGroups-get
  "Gets details of a single SecurityProfileGroup.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/securityProfileGroups/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-securityProfileGroups-create
  "Creates a new SecurityProfileGroup in a given organization and location.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/securityProfileGroups/create

parent <> 
SecurityProfileGroup:
SecurityProfileGroup

optional:
securityProfileGroupId <string> Required. Short name of the SecurityProfileGroup resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. \"security_profile_group1\"."
  ([parent SecurityProfileGroup]
    (organizations-locations-securityProfileGroups-create
      parent
      SecurityProfileGroup
      nil))
  ([parent SecurityProfileGroup optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/securityProfileGroups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body SecurityProfileGroup})))

(defn organizations-locations-securityProfileGroups-patch
  "Updates the parameters of a single SecurityProfileGroup.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/securityProfileGroups/patch

name <> 
SecurityProfileGroup:
SecurityProfileGroup

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the SecurityProfileGroup resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask."
  ([name SecurityProfileGroup]
    (organizations-locations-securityProfileGroups-patch
      name
      SecurityProfileGroup
      nil))
  ([name SecurityProfileGroup optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body SecurityProfileGroup})))

(defn organizations-locations-securityProfileGroups-delete
  "Deletes a single SecurityProfileGroup.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/securityProfileGroups/delete

name <> 

optional:
etag <string> Optional. If client provided etag is out of date, delete will return FAILED_PRECONDITION error."
  ([name]
    (organizations-locations-securityProfileGroups-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-securityProfiles-list
  "Lists SecurityProfiles in a given organization and location.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/securityProfiles/list

parent <> 

optional:
pageSize <integer> Maximum number of SecurityProfiles to return per call."
  ([parent] (organizations-locations-securityProfiles-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/securityProfiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-locations-securityProfiles-get
  "Gets details of a single SecurityProfile.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/securityProfiles/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://networksecurity.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-securityProfiles-create
  "Creates a new SecurityProfile in a given organization and location.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/securityProfiles/create

parent <> 
SecurityProfile:
SecurityProfile

optional:
securityProfileId <string> Required. Short name of the SecurityProfile resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. \"security_profile1\"."
  ([parent SecurityProfile]
    (organizations-locations-securityProfiles-create
      parent
      SecurityProfile
      nil))
  ([parent SecurityProfile optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+parent}/securityProfiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body SecurityProfile})))

(defn organizations-locations-securityProfiles-patch
  "Updates the parameters of a single SecurityProfile.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/securityProfiles/patch

name <> 
SecurityProfile:
SecurityProfile

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the SecurityProfile resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask."
  ([name SecurityProfile]
    (organizations-locations-securityProfiles-patch
      name
      SecurityProfile
      nil))
  ([name SecurityProfile optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body SecurityProfile})))

(defn organizations-locations-securityProfiles-delete
  "Deletes a single SecurityProfile.
https://cloud.google.com/networking/v1/reference/rest/v1/organizations/locations/securityProfiles/delete

name <> 

optional:
etag <string> Optional. If client provided etag is out of date, delete will return FAILED_PRECONDITION error."
  ([name] (organizations-locations-securityProfiles-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://networksecurity.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
