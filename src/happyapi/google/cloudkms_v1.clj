(ns happyapi.google.cloudkms-v1
  "Cloud Key Management Service (KMS) API
Manages keys and performs cryptographic operations in a central cloud service, for direct use by other cloud resources and applications. 
See: https://cloud.google.com/security/products/security-key-management")

(defn folders-updateAutokeyConfig
  "Updates the AutokeyConfig for a folder. The caller must have both `cloudkms.autokeyConfigs.update` permission on the parent folder and `cloudkms.cryptoKeys.setIamPolicy` permission on the provided key project. A KeyHandle creation in the folder's descendant projects will use this configuration to determine where to create the resulting CryptoKey.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/folders/updateAutokeyConfig

name <> 
AutokeyConfig:
AutokeyConfig

optional:
updateMask <string> Required. Masks which fields of the AutokeyConfig to update, e.g. `keyProject`."
  ([name AutokeyConfig]
    (folders-updateAutokeyConfig name AutokeyConfig nil))
  ([name AutokeyConfig optional]
    {:method :patch,
     :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"],
     :body AutokeyConfig}))

(defn folders-getAutokeyConfig
  "Returns the AutokeyConfig for a folder.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/folders/getAutokeyConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"]})

(defn projects-showEffectiveAutokeyConfig
  "Returns the effective Cloud KMS Autokey configuration for a given project.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/showEffectiveAutokeyConfig

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+parent}:showEffectiveAutokeyConfig",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"]})

(defn projects-locations-getEkmConfig
  "Returns the EkmConfig singleton resource for a given project and location.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/getEkmConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"]})

(defn projects-locations-updateEkmConfig
  "Updates the EkmConfig singleton resource for a given project and location.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/updateEkmConfig

name <> 
EkmConfig:
EkmConfig

optional:
updateMask <string> Required. List of fields to be updated in this request."
  ([name EkmConfig]
    (projects-locations-updateEkmConfig name EkmConfig nil))
  ([name EkmConfig optional]
    {:method :patch,
     :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"],
     :body EkmConfig}))

(defn projects-locations-generateRandomBytes
  "Generate random bytes using the Cloud KMS randomness source in the provided location.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/generateRandomBytes

location <> 
GenerateRandomBytesRequest:
GenerateRandomBytesRequest"
  [location GenerateRandomBytesRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+location}:generateRandomBytes",
   :uri-template-args {"location" location},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body GenerateRandomBytesRequest})

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"]})

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"]})

(defn projects-locations-keyHandles-create
  "Creates a new KeyHandle, triggering the provisioning of a new CryptoKey for CMEK use with the given resource type in the configured key project and the same location. GetOperation should be used to resolve the resulting long-running operation and get the resulting KeyHandle and CryptoKey.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyHandles/create

parent <> 
KeyHandle:
KeyHandle

optional:
keyHandleId <string> Optional. Id of the KeyHandle. Must be unique to the resource project and location. If not provided by the caller, a new UUID is used."
  ([parent KeyHandle]
    (projects-locations-keyHandles-create parent KeyHandle nil))
  ([parent KeyHandle optional]
    {:method :post,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+parent}/keyHandles",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"],
     :body KeyHandle}))

(defn projects-locations-keyHandles-get
  "Returns the KeyHandle.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyHandles/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"]})

(defn projects-locations-keyHandles-list
  "Lists KeyHandles.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyHandles/list

parent <> 

optional:
pageSize <integer> Optional. Optional limit on the number of KeyHandles to include in the response. The service may return fewer than this value. Further KeyHandles can subsequently be obtained by including the ListKeyHandlesResponse.next_page_token in a subsequent request. If unspecified, at most KeyHandles 100 will be returned.
filter <string> Optional. Filter to apply when listing KeyHandles, e.g. `resource_type_selector=\"{SERVICE}.googleapis.com/{TYPE}\"`."
  ([parent] (projects-locations-keyHandles-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+parent}/keyHandles",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"]}))

(defn projects-locations-ekmConnections-list
  "Lists EkmConnections.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/ekmConnections/list

parent <> 

optional:
pageSize <integer> Optional. Optional limit on the number of EkmConnections to include in the response. Further EkmConnections can subsequently be obtained by including the ListEkmConnectionsResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
filter <string> Optional. Only include resources that match the filter in the response. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering).
orderBy <string> Optional. Specify how the results should be sorted. If not specified, the results will be sorted in the default order. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering)."
  ([parent] (projects-locations-ekmConnections-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+parent}/ekmConnections",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"]}))

(defn projects-locations-ekmConnections-get
  "Returns metadata for a given EkmConnection.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/ekmConnections/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"]})

(defn projects-locations-ekmConnections-create
  "Creates a new EkmConnection in a given Project and Location.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/ekmConnections/create

parent <> 
EkmConnection:
EkmConnection

optional:
ekmConnectionId <string> Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`."
  ([parent EkmConnection]
    (projects-locations-ekmConnections-create
      parent
      EkmConnection
      nil))
  ([parent EkmConnection optional]
    {:method :post,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+parent}/ekmConnections",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"],
     :body EkmConnection}))

(defn projects-locations-ekmConnections-patch
  "Updates an EkmConnection's metadata.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/ekmConnections/patch

name <> 
EkmConnection:
EkmConnection

optional:
updateMask <string> Required. List of fields to be updated in this request."
  ([name EkmConnection]
    (projects-locations-ekmConnections-patch name EkmConnection nil))
  ([name EkmConnection optional]
    {:method :patch,
     :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"],
     :body EkmConnection}))

(defn projects-locations-ekmConnections-verifyConnectivity
  "Verifies that Cloud KMS can successfully connect to the external key manager specified by an EkmConnection. If there is an error connecting to the EKM, this method returns a FAILED_PRECONDITION status containing structured information as described at https://cloud.google.com/kms/docs/reference/ekm_errors.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/ekmConnections/verifyConnectivity

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+name}:verifyConnectivity",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"]})

(defn projects-locations-ekmConnections-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/ekmConnections/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body SetIamPolicyRequest})

(defn projects-locations-ekmConnections-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/ekmConnections/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-ekmConnections-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"]}))

(defn projects-locations-ekmConnections-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/ekmConnections/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body TestIamPermissionsRequest})

(defn projects-locations-keyRings-list
  "Lists KeyRings.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/list

parent <> 

optional:
pageSize <integer> Optional. Optional limit on the number of KeyRings to include in the response. Further KeyRings can subsequently be obtained by including the ListKeyRingsResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
filter <string> Optional. Only include resources that match the filter in the response. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering).
orderBy <string> Optional. Specify how the results should be sorted. If not specified, the results will be sorted in the default order. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering)."
  ([parent] (projects-locations-keyRings-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+parent}/keyRings",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"]}))

(defn projects-locations-keyRings-get
  "Returns metadata for a given KeyRing.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"]})

(defn projects-locations-keyRings-create
  "Create a new KeyRing in a given Project and Location.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/create

parent <> 
KeyRing:
KeyRing

optional:
keyRingId <string> Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`"
  ([parent KeyRing]
    (projects-locations-keyRings-create parent KeyRing nil))
  ([parent KeyRing optional]
    {:method :post,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+parent}/keyRings",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"],
     :body KeyRing}))

(defn projects-locations-keyRings-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body SetIamPolicyRequest})

(defn projects-locations-keyRings-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-keyRings-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"]}))

(defn projects-locations-keyRings-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body TestIamPermissionsRequest})

(defn projects-locations-keyRings-cryptoKeys-encrypt
  "Encrypts data, so that it can only be recovered by a call to Decrypt. The CryptoKey.purpose must be ENCRYPT_DECRYPT.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/encrypt

name <> 
EncryptRequest:
EncryptRequest"
  [name EncryptRequest]
  {:method :post,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}:encrypt",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body EncryptRequest})

(defn projects-locations-keyRings-cryptoKeys-list
  "Lists CryptoKeys.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/list

parent <> 

optional:
pageSize <integer> Optional. Optional limit on the number of CryptoKeys to include in the response. Further CryptoKeys can subsequently be obtained by including the ListCryptoKeysResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
versionView <string> The fields of the primary version to include in the response.
filter <string> Optional. Only include resources that match the filter in the response. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering).
orderBy <string> Optional. Specify how the results should be sorted. If not specified, the results will be sorted in the default order. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering)."
  ([parent] (projects-locations-keyRings-cryptoKeys-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+parent}/cryptoKeys",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"]}))

(defn projects-locations-keyRings-cryptoKeys-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body SetIamPolicyRequest})

(defn projects-locations-keyRings-cryptoKeys-updatePrimaryVersion
  "Update the version of a CryptoKey that will be used in Encrypt. Returns an error if called on a key whose purpose is not ENCRYPT_DECRYPT.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/updatePrimaryVersion

name <> 
UpdateCryptoKeyPrimaryVersionRequest:
UpdateCryptoKeyPrimaryVersionRequest"
  [name UpdateCryptoKeyPrimaryVersionRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+name}:updatePrimaryVersion",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body UpdateCryptoKeyPrimaryVersionRequest})

(defn projects-locations-keyRings-cryptoKeys-patch
  "Update a CryptoKey.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/patch

name <> 
CryptoKey:
CryptoKey

optional:
updateMask <string> Required. List of fields to be updated in this request."
  ([name CryptoKey]
    (projects-locations-keyRings-cryptoKeys-patch name CryptoKey nil))
  ([name CryptoKey optional]
    {:method :patch,
     :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"],
     :body CryptoKey}))

(defn projects-locations-keyRings-cryptoKeys-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-keyRings-cryptoKeys-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"]}))

(defn projects-locations-keyRings-cryptoKeys-decrypt
  "Decrypts data that was protected by Encrypt. The CryptoKey.purpose must be ENCRYPT_DECRYPT.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/decrypt

name <> 
DecryptRequest:
DecryptRequest"
  [name DecryptRequest]
  {:method :post,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}:decrypt",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body DecryptRequest})

(defn projects-locations-keyRings-cryptoKeys-create
  "Create a new CryptoKey within a KeyRing. CryptoKey.purpose and CryptoKey.version_template.algorithm are required.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/create

parent <> 
CryptoKey:
CryptoKey

optional:
cryptoKeyId <string> Required. It must be unique within a KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63}`
skipInitialVersionCreation <boolean> If set to true, the request will create a CryptoKey without any CryptoKeyVersions. You must manually call CreateCryptoKeyVersion or ImportCryptoKeyVersion before you can use this CryptoKey."
  ([parent CryptoKey]
    (projects-locations-keyRings-cryptoKeys-create
      parent
      CryptoKey
      nil))
  ([parent CryptoKey optional]
    {:method :post,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+parent}/cryptoKeys",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"],
     :body CryptoKey}))

(defn projects-locations-keyRings-cryptoKeys-get
  "Returns metadata for a given CryptoKey, as well as its primary CryptoKeyVersion.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"]})

(defn projects-locations-keyRings-cryptoKeys-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body TestIamPermissionsRequest})

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-list
  "Lists CryptoKeyVersions.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/list

parent <> 

optional:
pageSize <integer> Optional. Optional limit on the number of CryptoKeyVersions to include in the response. Further CryptoKeyVersions can subsequently be obtained by including the ListCryptoKeyVersionsResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
view <string> The fields to include in the response.
filter <string> Optional. Only include resources that match the filter in the response. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering).
orderBy <string> Optional. Specify how the results should be sorted. If not specified, the results will be sorted in the default order. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering)."
  ([parent]
    (projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+parent}/cryptoKeyVersions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"]}))

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-macVerify
  "Verifies MAC tag using a CryptoKeyVersion with CryptoKey.purpose MAC, and returns a response that indicates whether or not the verification was successful.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/macVerify

name <> 
MacVerifyRequest:
MacVerifyRequest"
  [name MacVerifyRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+name}:macVerify",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body MacVerifyRequest})

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-asymmetricDecrypt
  "Decrypts data that was encrypted with a public key retrieved from GetPublicKey corresponding to a CryptoKeyVersion with CryptoKey.purpose ASYMMETRIC_DECRYPT.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/asymmetricDecrypt

name <> 
AsymmetricDecryptRequest:
AsymmetricDecryptRequest"
  [name AsymmetricDecryptRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+name}:asymmetricDecrypt",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body AsymmetricDecryptRequest})

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-macSign
  "Signs data using a CryptoKeyVersion with CryptoKey.purpose MAC, producing a tag that can be verified by another source with the same key.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/macSign

name <> 
MacSignRequest:
MacSignRequest"
  [name MacSignRequest]
  {:method :post,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}:macSign",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body MacSignRequest})

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-rawDecrypt
  "Decrypts data that was originally encrypted using a raw cryptographic mechanism. The CryptoKey.purpose must be RAW_ENCRYPT_DECRYPT.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/rawDecrypt

name <> 
RawDecryptRequest:
RawDecryptRequest"
  [name RawDecryptRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+name}:rawDecrypt",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body RawDecryptRequest})

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-destroy
  "Schedule a CryptoKeyVersion for destruction. Upon calling this method, CryptoKeyVersion.state will be set to DESTROY_SCHEDULED, and destroy_time will be set to the time destroy_scheduled_duration in the future. At that time, the state will automatically change to DESTROYED, and the key material will be irrevocably destroyed. Before the destroy_time is reached, RestoreCryptoKeyVersion may be called to reverse the process.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/destroy

name <> 
DestroyCryptoKeyVersionRequest:
DestroyCryptoKeyVersionRequest"
  [name DestroyCryptoKeyVersionRequest]
  {:method :post,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}:destroy",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body DestroyCryptoKeyVersionRequest})

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-import
  "Import wrapped key material into a CryptoKeyVersion. All requests must specify a CryptoKey. If a CryptoKeyVersion is additionally specified in the request, key material will be reimported into that version. Otherwise, a new version will be created, and will be assigned the next sequential id within the CryptoKey.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/import

parent <> 
ImportCryptoKeyVersionRequest:
ImportCryptoKeyVersionRequest"
  [parent ImportCryptoKeyVersionRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+parent}/cryptoKeyVersions:import",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body ImportCryptoKeyVersionRequest})

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-patch
  "Update a CryptoKeyVersion's metadata. state may be changed between ENABLED and DISABLED using this method. See DestroyCryptoKeyVersion and RestoreCryptoKeyVersion to move between other states.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/patch

name <> 
CryptoKeyVersion:
CryptoKeyVersion

optional:
updateMask <string> Required. List of fields to be updated in this request."
  ([name CryptoKeyVersion]
    (projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-patch
      name
      CryptoKeyVersion
      nil))
  ([name CryptoKeyVersion optional]
    {:method :patch,
     :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"],
     :body CryptoKeyVersion}))

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-getPublicKey
  "Returns the public key for the given CryptoKeyVersion. The CryptoKey.purpose must be ASYMMETRIC_SIGN or ASYMMETRIC_DECRYPT.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/getPublicKey

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+name}/publicKey",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"]})

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-rawEncrypt
  "Encrypts data using portable cryptographic primitives. Most users should choose Encrypt and Decrypt rather than their raw counterparts. The CryptoKey.purpose must be RAW_ENCRYPT_DECRYPT.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/rawEncrypt

name <> 
RawEncryptRequest:
RawEncryptRequest"
  [name RawEncryptRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+name}:rawEncrypt",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body RawEncryptRequest})

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-asymmetricSign
  "Signs data using a CryptoKeyVersion with CryptoKey.purpose ASYMMETRIC_SIGN, producing a signature that can be verified with the public key retrieved from GetPublicKey.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/asymmetricSign

name <> 
AsymmetricSignRequest:
AsymmetricSignRequest"
  [name AsymmetricSignRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+name}:asymmetricSign",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body AsymmetricSignRequest})

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-create
  "Create a new CryptoKeyVersion in a CryptoKey. The server will assign the next sequential id. If unset, state will be set to ENABLED.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/create

parent <> 
CryptoKeyVersion:
CryptoKeyVersion"
  [parent CryptoKeyVersion]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+parent}/cryptoKeyVersions",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body CryptoKeyVersion})

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-restore
  "Restore a CryptoKeyVersion in the DESTROY_SCHEDULED state. Upon restoration of the CryptoKeyVersion, state will be set to DISABLED, and destroy_time will be cleared.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/restore

name <> 
RestoreCryptoKeyVersionRequest:
RestoreCryptoKeyVersionRequest"
  [name RestoreCryptoKeyVersionRequest]
  {:method :post,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}:restore",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body RestoreCryptoKeyVersionRequest})

(defn projects-locations-keyRings-cryptoKeys-cryptoKeyVersions-get
  "Returns metadata for a given CryptoKeyVersion.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/cryptoKeys/cryptoKeyVersions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"]})

(defn projects-locations-keyRings-importJobs-list
  "Lists ImportJobs.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/importJobs/list

parent <> 

optional:
pageSize <integer> Optional. Optional limit on the number of ImportJobs to include in the response. Further ImportJobs can subsequently be obtained by including the ListImportJobsResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
filter <string> Optional. Only include resources that match the filter in the response. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering).
orderBy <string> Optional. Specify how the results should be sorted. If not specified, the results will be sorted in the default order. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering)."
  ([parent] (projects-locations-keyRings-importJobs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+parent}/importJobs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"]}))

(defn projects-locations-keyRings-importJobs-get
  "Returns metadata for a given ImportJob.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/importJobs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudkms.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"]})

(defn projects-locations-keyRings-importJobs-create
  "Create a new ImportJob within a KeyRing. ImportJob.import_method is required.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/importJobs/create

parent <> 
ImportJob:
ImportJob

optional:
importJobId <string> Required. It must be unique within a KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63}`"
  ([parent ImportJob]
    (projects-locations-keyRings-importJobs-create
      parent
      ImportJob
      nil))
  ([parent ImportJob optional]
    {:method :post,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+parent}/importJobs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"],
     :body ImportJob}))

(defn projects-locations-keyRings-importJobs-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/importJobs/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body SetIamPolicyRequest})

(defn projects-locations-keyRings-importJobs-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/importJobs/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-keyRings-importJobs-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"]}))

(defn projects-locations-keyRings-importJobs-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/keyRings/importJobs/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body TestIamPermissionsRequest})

(defn projects-locations-ekmConfig-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/ekmConfig/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body SetIamPolicyRequest})

(defn projects-locations-ekmConfig-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/ekmConfig/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-ekmConfig-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://cloudkms.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloudkms"]}))

(defn projects-locations-ekmConfig-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/security/products/security-key-management/v1/reference/rest/v1/projects/locations/ekmConfig/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://cloudkms.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloudkms"],
   :body TestIamPermissionsRequest})
