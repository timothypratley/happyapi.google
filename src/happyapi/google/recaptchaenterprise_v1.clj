(ns happyapi.google.recaptchaenterprise-v1
  "reCAPTCHA Enterprise API
Help protect your website from fraudulent activity, spam, and abuse without creating friction.
See: https://cloud.google.com/security/products/recaptcha")

(defn projects-firewallpolicies-patch
  "Updates the specified firewall policy.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/firewallpolicies/patch

name <> 
GoogleCloudRecaptchaenterpriseV1FirewallPolicy:
GoogleCloudRecaptchaenterpriseV1FirewallPolicy

optional:
updateMask <string> Optional. The mask to control which fields of the policy get updated. If the mask is not present, all fields will be updated."
  ([name GoogleCloudRecaptchaenterpriseV1FirewallPolicy]
    (projects-firewallpolicies-patch
      name
      GoogleCloudRecaptchaenterpriseV1FirewallPolicy
      nil))
  ([name GoogleCloudRecaptchaenterpriseV1FirewallPolicy optional]
    {:method :patch,
     :uri-template
     "https://recaptchaenterprise.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecaptchaenterpriseV1FirewallPolicy}))

(defn projects-firewallpolicies-reorder
  "Reorders all firewall policies.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/firewallpolicies/reorder

parent <> 
GoogleCloudRecaptchaenterpriseV1ReorderFirewallPoliciesRequest:
GoogleCloudRecaptchaenterpriseV1ReorderFirewallPoliciesRequest"
  [parent
   GoogleCloudRecaptchaenterpriseV1ReorderFirewallPoliciesRequest]
  {:method :post,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+parent}/firewallpolicies:reorder",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body
   GoogleCloudRecaptchaenterpriseV1ReorderFirewallPoliciesRequest})

(defn projects-firewallpolicies-list
  "Returns the list of all firewall policies that belong to a project.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/firewallpolicies/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of policies to return. Default is 10. Max limit is 1000."
  ([parent] (projects-firewallpolicies-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://recaptchaenterprise.googleapis.com/v1/{+parent}/firewallpolicies",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-firewallpolicies-delete
  "Deletes the specified firewall policy.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/firewallpolicies/delete

name <> "
  [name]
  {:method :delete,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-firewallpolicies-create
  "Creates a new FirewallPolicy, specifying conditions at which reCAPTCHA Enterprise actions can be executed. A project may have a maximum of 1000 policies.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/firewallpolicies/create

parent <> 
GoogleCloudRecaptchaenterpriseV1FirewallPolicy:
GoogleCloudRecaptchaenterpriseV1FirewallPolicy"
  [parent GoogleCloudRecaptchaenterpriseV1FirewallPolicy]
  {:method :post,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+parent}/firewallpolicies",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRecaptchaenterpriseV1FirewallPolicy})

(defn projects-firewallpolicies-get
  "Returns the specified firewall policy.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/firewallpolicies/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-keys-list
  "Returns the list of all keys that belong to a project.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/keys/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of keys to return. Default is 10. Max limit is 1000."
  ([parent] (projects-keys-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://recaptchaenterprise.googleapis.com/v1/{+parent}/keys",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-keys-migrate
  "Migrates an existing key from reCAPTCHA to reCAPTCHA Enterprise. Once a key is migrated, it can be used from either product. SiteVerify requests are billed as CreateAssessment calls. You must be authenticated as one of the current owners of the reCAPTCHA Key, and your user must have the reCAPTCHA Enterprise Admin IAM role in the destination project.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/keys/migrate

name <> 
GoogleCloudRecaptchaenterpriseV1MigrateKeyRequest:
GoogleCloudRecaptchaenterpriseV1MigrateKeyRequest"
  [name GoogleCloudRecaptchaenterpriseV1MigrateKeyRequest]
  {:method :post,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+name}:migrate",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRecaptchaenterpriseV1MigrateKeyRequest})

(defn projects-keys-delete
  "Deletes the specified key.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/keys/delete

name <> "
  [name]
  {:method :delete,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-keys-patch
  "Updates the specified key.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/keys/patch

name <> 
GoogleCloudRecaptchaenterpriseV1Key:
GoogleCloudRecaptchaenterpriseV1Key

optional:
updateMask <string> Optional. The mask to control which fields of the key get updated. If the mask is not present, all fields will be updated."
  ([name GoogleCloudRecaptchaenterpriseV1Key]
    (projects-keys-patch name GoogleCloudRecaptchaenterpriseV1Key nil))
  ([name GoogleCloudRecaptchaenterpriseV1Key optional]
    {:method :patch,
     :uri-template
     "https://recaptchaenterprise.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecaptchaenterpriseV1Key}))

(defn projects-keys-addIpOverride
  "Adds an IP override to a key. The following restrictions hold: * The maximum number of IP overrides per key is 100. * For any conflict (such as IP already exists or IP part of an existing IP range), an error will be returned.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/keys/addIpOverride

name <> 
GoogleCloudRecaptchaenterpriseV1AddIpOverrideRequest:
GoogleCloudRecaptchaenterpriseV1AddIpOverrideRequest"
  [name GoogleCloudRecaptchaenterpriseV1AddIpOverrideRequest]
  {:method :post,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+name}:addIpOverride",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRecaptchaenterpriseV1AddIpOverrideRequest})

(defn projects-keys-create
  "Creates a new reCAPTCHA Enterprise key.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/keys/create

parent <> 
GoogleCloudRecaptchaenterpriseV1Key:
GoogleCloudRecaptchaenterpriseV1Key"
  [parent GoogleCloudRecaptchaenterpriseV1Key]
  {:method :post,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+parent}/keys",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRecaptchaenterpriseV1Key})

(defn projects-keys-retrieveLegacySecretKey
  "Returns the secret key related to the specified public key. You must use the legacy secret key only in a 3rd party integration with legacy reCAPTCHA.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/keys/retrieveLegacySecretKey

key <> "
  [key]
  {:method :get,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+key}:retrieveLegacySecretKey",
   :uri-template-args {"key" key},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-keys-removeIpOverride
  "Removes an IP override from a key. The following restrictions hold: * If the IP isn't found in an existing IP override, a `NOT_FOUND` error will be returned. * If the IP is found in an existing IP override, but the override type does not match, a `NOT_FOUND` error will be returned.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/keys/removeIpOverride

name <> 
GoogleCloudRecaptchaenterpriseV1RemoveIpOverrideRequest:
GoogleCloudRecaptchaenterpriseV1RemoveIpOverrideRequest"
  [name GoogleCloudRecaptchaenterpriseV1RemoveIpOverrideRequest]
  {:method :post,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+name}:removeIpOverride",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRecaptchaenterpriseV1RemoveIpOverrideRequest})

(defn projects-keys-listIpOverrides
  "Lists all IP overrides for a key.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/keys/listIpOverrides

parent <> 

optional:
pageSize <integer> Optional. The maximum number of overrides to return. Default is 10. Max limit is 100. If the number of overrides is less than the page_size, all overrides are returned. If the page size is more than 100, it is coerced to 100."
  ([parent] (projects-keys-listIpOverrides parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://recaptchaenterprise.googleapis.com/v1/{+parent}:listIpOverrides",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-keys-getMetrics
  "Get some aggregated metrics for a Key. This data can be used to build dashboards.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/keys/getMetrics

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-keys-get
  "Returns the specified key.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/keys/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-relatedaccountgroups-list
  "List groups of related accounts.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/relatedaccountgroups/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of groups to return. The service might return fewer than this value. If unspecified, at most 50 groups are returned. The maximum value is 1000; values above 1000 are coerced to 1000."
  ([parent] (projects-relatedaccountgroups-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://recaptchaenterprise.googleapis.com/v1/{+parent}/relatedaccountgroups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-relatedaccountgroups-memberships-list
  "Get memberships in a group of related accounts.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/relatedaccountgroups/memberships/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of accounts to return. The service might return fewer than this value. If unspecified, at most 50 accounts are returned. The maximum value is 1000; values above 1000 are coerced to 1000."
  ([parent]
    (projects-relatedaccountgroups-memberships-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://recaptchaenterprise.googleapis.com/v1/{+parent}/memberships",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-assessments-annotate
  "Annotates a previously created Assessment to provide additional information on whether the event turned out to be authentic or fraudulent.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/assessments/annotate

name <> 
GoogleCloudRecaptchaenterpriseV1AnnotateAssessmentRequest:
GoogleCloudRecaptchaenterpriseV1AnnotateAssessmentRequest"
  [name GoogleCloudRecaptchaenterpriseV1AnnotateAssessmentRequest]
  {:method :post,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+name}:annotate",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRecaptchaenterpriseV1AnnotateAssessmentRequest})

(defn projects-assessments-create
  "Creates an Assessment of the likelihood an event is legitimate.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/assessments/create

parent <> 
GoogleCloudRecaptchaenterpriseV1Assessment:
GoogleCloudRecaptchaenterpriseV1Assessment"
  [parent GoogleCloudRecaptchaenterpriseV1Assessment]
  {:method :post,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+parent}/assessments",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRecaptchaenterpriseV1Assessment})

(defn projects-relatedaccountgroupmemberships-search
  "Search group memberships related to a given account.
https://cloud.google.com/security/products/recaptcha/v1/reference/rest/v1/projects/relatedaccountgroupmemberships/search

project <> 
GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsRequest:
GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsRequest"
  [project
   GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsRequest]
  {:method :post,
   :uri-template
   "https://recaptchaenterprise.googleapis.com/v1/{+project}/relatedaccountgroupmemberships:search",
   :uri-template-args {"project" project},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body
   GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsRequest})
