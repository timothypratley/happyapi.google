(ns happyapi.google.iap-v1
  "Cloud Identity-Aware Proxy API
Controls access to cloud applications running on Google Cloud Platform.
See: https://cloud.google.com/security/products/iap")

(defn setIamPolicy
  "Sets the access control policy for an Identity-Aware Proxy protected resource. Replaces any existing policy. More information about managing access via IAP can be found at: https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://iap.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn getIamPolicy
  "Gets the access control policy for an Identity-Aware Proxy protected resource. More information about managing access via IAP can be found at: https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://iap.googleapis.com/v1/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GetIamPolicyRequest})

(defn testIamPermissions
  "Returns permissions that a caller has on the Identity-Aware Proxy protected resource. More information about managing access via IAP can be found at: https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://iap.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn getIapSettings
  "Gets the IAP settings on a particular IAP protected resource.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/getIapSettings

name <> "
  [name]
  {:method :get,
   :uri-template "https://iap.googleapis.com/v1/{+name}:iapSettings",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn updateIapSettings
  "Updates the IAP settings on a particular IAP protected resource. It replaces all fields unless the `update_mask` is set.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/updateIapSettings

name <> 
IapSettings:
IapSettings

optional:
updateMask <string> The field mask specifying which IAP settings should be updated. If omitted, then all of the settings are updated. See https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask. Note: All IAP reauth settings must always be set together, using the field mask: `iapSettings.accessSettings.reauthSettings`."
  ([name IapSettings] (updateIapSettings name IapSettings nil))
  ([name IapSettings optional]
    {:method :patch,
     :uri-template "https://iap.googleapis.com/v1/{+name}:iapSettings",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body IapSettings}))

(defn validateAttributeExpression
  "Validates that a given CEL expression conforms to IAP restrictions.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/validateAttributeExpression

name <> 

optional:
expression <string> Required. User input string expression. Should be of the form `attributes.saml_attributes.filter(attribute, attribute.name in ['{attribute_name}', '{attribute_name}'])`"
  ([name] (validateAttributeExpression name nil))
  ([name optional]
    {:method :post,
     :uri-template
     "https://iap.googleapis.com/v1/{+name}:validateAttributeExpression",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-iap_tunnel-locations-destGroups-list
  "Lists the existing TunnelDestGroups. To group across all locations, use a `-` as the location ID. For example: `/v1/projects/123/iap_tunnel/locations/-/destGroups`
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/projects/iap_tunnel/locations/destGroups/list

parent <> 

optional:
pageSize <integer> The maximum number of groups to return. The service might return fewer than this value. If unspecified, at most 100 groups are returned. The maximum value is 1000; values above 1000 are coerced to 1000."
  ([parent] (projects-iap_tunnel-locations-destGroups-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://iap.googleapis.com/v1/{+parent}/destGroups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-iap_tunnel-locations-destGroups-create
  "Creates a new TunnelDestGroup.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/projects/iap_tunnel/locations/destGroups/create

parent <> 
TunnelDestGroup:
TunnelDestGroup

optional:
tunnelDestGroupId <string> Required. The ID to use for the TunnelDestGroup, which becomes the final component of the resource name. This value must be 4-63 characters, and valid characters are `[a-z]-`."
  ([parent TunnelDestGroup]
    (projects-iap_tunnel-locations-destGroups-create
      parent
      TunnelDestGroup
      nil))
  ([parent TunnelDestGroup optional]
    {:method :post,
     :uri-template
     "https://iap.googleapis.com/v1/{+parent}/destGroups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TunnelDestGroup}))

(defn projects-iap_tunnel-locations-destGroups-get
  "Retrieves an existing TunnelDestGroup.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/projects/iap_tunnel/locations/destGroups/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://iap.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-iap_tunnel-locations-destGroups-delete
  "Deletes a TunnelDestGroup.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/projects/iap_tunnel/locations/destGroups/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://iap.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-iap_tunnel-locations-destGroups-patch
  "Updates a TunnelDestGroup.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/projects/iap_tunnel/locations/destGroups/patch

name <> 
TunnelDestGroup:
TunnelDestGroup

optional:
updateMask <string> A field mask that specifies which IAP settings to update. If omitted, then all of the settings are updated. See https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask"
  ([name TunnelDestGroup]
    (projects-iap_tunnel-locations-destGroups-patch
      name
      TunnelDestGroup
      nil))
  ([name TunnelDestGroup optional]
    {:method :patch,
     :uri-template "https://iap.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TunnelDestGroup}))

(defn projects-brands-list
  "Lists the existing brands for the project.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/projects/brands/list

parent <> "
  [parent]
  {:method :get,
   :uri-template "https://iap.googleapis.com/v1/{+parent}/brands",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-brands-create
  "Constructs a new OAuth brand for the project if one does not exist. The created brand is \"internal only\", meaning that OAuth clients created under it only accept requests from users who belong to the same Google Workspace organization as the project. The brand is created in an un-reviewed status. NOTE: The \"internal only\" status can be manually changed in the Google Cloud Console. Requires that a brand does not already exist for the project, and that the specified support email is owned by the caller.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/projects/brands/create

parent <> 
Brand:
Brand"
  [parent Brand]
  {:method :post,
   :uri-template "https://iap.googleapis.com/v1/{+parent}/brands",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body Brand})

(defn projects-brands-get
  "Retrieves the OAuth brand of the project.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/projects/brands/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://iap.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-brands-identityAwareProxyClients-create
  "Creates an Identity Aware Proxy (IAP) OAuth client. The client is owned by IAP. Requires that the brand for the project exists and that it is set for internal-only use.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/projects/brands/identityAwareProxyClients/create

parent <> 
IdentityAwareProxyClient:
IdentityAwareProxyClient"
  [parent IdentityAwareProxyClient]
  {:method :post,
   :uri-template
   "https://iap.googleapis.com/v1/{+parent}/identityAwareProxyClients",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body IdentityAwareProxyClient})

(defn projects-brands-identityAwareProxyClients-list
  "Lists the existing clients for the brand.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/projects/brands/identityAwareProxyClients/list

parent <> 

optional:
pageSize <integer> The maximum number of clients to return. The service may return fewer than this value. If unspecified, at most 100 clients will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent]
    (projects-brands-identityAwareProxyClients-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://iap.googleapis.com/v1/{+parent}/identityAwareProxyClients",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-brands-identityAwareProxyClients-get
  "Retrieves an Identity Aware Proxy (IAP) OAuth client. Requires that the client is owned by IAP.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/projects/brands/identityAwareProxyClients/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://iap.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-brands-identityAwareProxyClients-resetSecret
  "Resets an Identity Aware Proxy (IAP) OAuth client secret. Useful if the secret was compromised. Requires that the client is owned by IAP.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/projects/brands/identityAwareProxyClients/resetSecret

name <> 
ResetIdentityAwareProxyClientSecretRequest:
ResetIdentityAwareProxyClientSecretRequest"
  [name ResetIdentityAwareProxyClientSecretRequest]
  {:method :post,
   :uri-template "https://iap.googleapis.com/v1/{+name}:resetSecret",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ResetIdentityAwareProxyClientSecretRequest})

(defn projects-brands-identityAwareProxyClients-delete
  "Deletes an Identity Aware Proxy (IAP) OAuth client. Useful for removing obsolete clients, managing the number of clients in a given project, and cleaning up after tests. Requires that the client is owned by IAP.
https://cloud.google.com/security/products/iap/v1/reference/rest/v1/projects/brands/identityAwareProxyClients/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://iap.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})
