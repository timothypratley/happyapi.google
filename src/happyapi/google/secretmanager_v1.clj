(ns happyapi.google.secretmanager-v1
  "Secret Manager API
Stores sensitive data such as API keys, passwords, and certificates. Provides convenience while improving security. 
See: https://cloud.google.com/security/products/secret-manager"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://secretmanager.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://secretmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-secrets-list
  "Lists Secrets.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to be returned in a single page. If set to 0, the server decides the number of results to return. If the number is greater than 25000, it is capped at 25000.
filter <string> Optional. Filter string, adhering to the rules in [List-operation filtering](https://cloud.google.com/secret-manager/docs/filtering). List only secrets matching the filter. If filter is empty, all secrets are listed."
  ([parent] (projects-locations-secrets-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://secretmanager.googleapis.com/v1/{+parent}/secrets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-secrets-setIamPolicy
  "Sets the access control policy on the specified secret. Replaces any existing policy. Permissions on SecretVersions are enforced according to the policy set on the associated Secret.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-secrets-delete
  "Deletes a Secret.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/delete

name <> 

optional:
etag <string> Optional. Etag of the Secret. The request succeeds if it matches the etag of the currently stored secret object. If the etag is omitted, the request succeeds."
  ([name] (projects-locations-secrets-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://secretmanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-secrets-addVersion
  "Creates a new SecretVersion containing secret data and attaches it to an existing Secret.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/addVersion

parent <> 
AddSecretVersionRequest:
AddSecretVersionRequest"
  [parent AddSecretVersionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+parent}:addVersion",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AddSecretVersionRequest}))

(defn projects-locations-secrets-patch
  "Updates metadata of an existing Secret.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/patch

name <> 
Secret:
Secret

optional:
updateMask <string> Required. Specifies the fields to be updated."
  ([name Secret] (projects-locations-secrets-patch name Secret nil))
  ([name Secret optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://secretmanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Secret})))

(defn projects-locations-secrets-getIamPolicy
  "Gets the access control policy for a secret. Returns empty policy if the secret exists and does not have a policy set.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-secrets-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://secretmanager.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-secrets-create
  "Creates a new Secret containing no SecretVersions.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/create

parent <> 
Secret:
Secret

optional:
secretId <string> Required. This must be unique within the project. A secret ID is a string with a maximum length of 255 characters and can contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and underscore (`_`) characters."
  ([parent Secret]
    (projects-locations-secrets-create parent Secret nil))
  ([parent Secret optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://secretmanager.googleapis.com/v1/{+parent}/secrets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Secret})))

(defn projects-locations-secrets-get
  "Gets metadata for a given Secret.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://secretmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-secrets-testIamPermissions
  "Returns permissions that a caller has for the specified secret. If the secret does not exist, this call returns an empty set of permissions, not a NOT_FOUND error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-secrets-versions-list
  "Lists SecretVersions. This call does not return secret data.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/versions/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to be returned in a single page. If set to 0, the server decides the number of results to return. If the number is greater than 25000, it is capped at 25000.
filter <string> Optional. Filter string, adhering to the rules in [List-operation filtering](https://cloud.google.com/secret-manager/docs/filtering). List only secret versions matching the filter. If filter is empty, all secret versions are listed."
  ([parent] (projects-locations-secrets-versions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://secretmanager.googleapis.com/v1/{+parent}/versions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-secrets-versions-get
  "Gets metadata for a SecretVersion. `projects/*/secrets/*/versions/latest` is an alias to the most recently created SecretVersion.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/versions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://secretmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-secrets-versions-access
  "Accesses a SecretVersion. This call returns the secret data. `projects/*/secrets/*/versions/latest` is an alias to the most recently created SecretVersion.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/versions/access

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+name}:access",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-secrets-versions-disable
  "Disables a SecretVersion. Sets the state of the SecretVersion to DISABLED.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/versions/disable

name <> 
DisableSecretVersionRequest:
DisableSecretVersionRequest"
  [name DisableSecretVersionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+name}:disable",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body DisableSecretVersionRequest}))

(defn projects-locations-secrets-versions-enable
  "Enables a SecretVersion. Sets the state of the SecretVersion to ENABLED.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/versions/enable

name <> 
EnableSecretVersionRequest:
EnableSecretVersionRequest"
  [name EnableSecretVersionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+name}:enable",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body EnableSecretVersionRequest}))

(defn projects-locations-secrets-versions-destroy
  "Destroys a SecretVersion. Sets the state of the SecretVersion to DESTROYED and irrevocably destroys the secret data.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/locations/secrets/versions/destroy

name <> 
DestroySecretVersionRequest:
DestroySecretVersionRequest"
  [name DestroySecretVersionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+name}:destroy",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body DestroySecretVersionRequest}))

(defn projects-secrets-list
  "Lists Secrets.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to be returned in a single page. If set to 0, the server decides the number of results to return. If the number is greater than 25000, it is capped at 25000.
filter <string> Optional. Filter string, adhering to the rules in [List-operation filtering](https://cloud.google.com/secret-manager/docs/filtering). List only secrets matching the filter. If filter is empty, all secrets are listed."
  ([parent] (projects-secrets-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://secretmanager.googleapis.com/v1/{+parent}/secrets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-secrets-setIamPolicy
  "Sets the access control policy on the specified secret. Replaces any existing policy. Permissions on SecretVersions are enforced according to the policy set on the associated Secret.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-secrets-delete
  "Deletes a Secret.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/delete

name <> 

optional:
etag <string> Optional. Etag of the Secret. The request succeeds if it matches the etag of the currently stored secret object. If the etag is omitted, the request succeeds."
  ([name] (projects-secrets-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://secretmanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-secrets-addVersion
  "Creates a new SecretVersion containing secret data and attaches it to an existing Secret.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/addVersion

parent <> 
AddSecretVersionRequest:
AddSecretVersionRequest"
  [parent AddSecretVersionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+parent}:addVersion",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AddSecretVersionRequest}))

(defn projects-secrets-patch
  "Updates metadata of an existing Secret.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/patch

name <> 
Secret:
Secret

optional:
updateMask <string> Required. Specifies the fields to be updated."
  ([name Secret] (projects-secrets-patch name Secret nil))
  ([name Secret optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://secretmanager.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Secret})))

(defn projects-secrets-getIamPolicy
  "Gets the access control policy for a secret. Returns empty policy if the secret exists and does not have a policy set.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-secrets-getIamPolicy resource nil))
  ([resource optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://secretmanager.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-secrets-create
  "Creates a new Secret containing no SecretVersions.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/create

parent <> 
Secret:
Secret

optional:
secretId <string> Required. This must be unique within the project. A secret ID is a string with a maximum length of 255 characters and can contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and underscore (`_`) characters."
  ([parent Secret] (projects-secrets-create parent Secret nil))
  ([parent Secret optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://secretmanager.googleapis.com/v1/{+parent}/secrets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Secret})))

(defn projects-secrets-get
  "Gets metadata for a given Secret.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://secretmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-secrets-testIamPermissions
  "Returns permissions that a caller has for the specified secret. If the secret does not exist, this call returns an empty set of permissions, not a NOT_FOUND error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-secrets-versions-list
  "Lists SecretVersions. This call does not return secret data.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/versions/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to be returned in a single page. If set to 0, the server decides the number of results to return. If the number is greater than 25000, it is capped at 25000.
filter <string> Optional. Filter string, adhering to the rules in [List-operation filtering](https://cloud.google.com/secret-manager/docs/filtering). List only secret versions matching the filter. If filter is empty, all secret versions are listed."
  ([parent] (projects-secrets-versions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://secretmanager.googleapis.com/v1/{+parent}/versions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-secrets-versions-get
  "Gets metadata for a SecretVersion. `projects/*/secrets/*/versions/latest` is an alias to the most recently created SecretVersion.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/versions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://secretmanager.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-secrets-versions-access
  "Accesses a SecretVersion. This call returns the secret data. `projects/*/secrets/*/versions/latest` is an alias to the most recently created SecretVersion.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/versions/access

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+name}:access",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-secrets-versions-disable
  "Disables a SecretVersion. Sets the state of the SecretVersion to DISABLED.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/versions/disable

name <> 
DisableSecretVersionRequest:
DisableSecretVersionRequest"
  [name DisableSecretVersionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+name}:disable",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body DisableSecretVersionRequest}))

(defn projects-secrets-versions-enable
  "Enables a SecretVersion. Sets the state of the SecretVersion to ENABLED.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/versions/enable

name <> 
EnableSecretVersionRequest:
EnableSecretVersionRequest"
  [name EnableSecretVersionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+name}:enable",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body EnableSecretVersionRequest}))

(defn projects-secrets-versions-destroy
  "Destroys a SecretVersion. Sets the state of the SecretVersion to DESTROYED and irrevocably destroys the secret data.
https://cloud.google.com/security/products/secret-manager/v1/reference/rest/v1/projects/secrets/versions/destroy

name <> 
DestroySecretVersionRequest:
DestroySecretVersionRequest"
  [name DestroySecretVersionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://secretmanager.googleapis.com/v1/{+name}:destroy",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body DestroySecretVersionRequest}))
