(ns happyapi.google.dns-v1
  "Cloud DNS API

See: https://cloud.google.com/dns/docs"
  (:require [happyapi.providers.google :as client]))

(defn managedZoneOperations-get
  "Fetches the representation of an existing Operation.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/managedZoneOperations/get

project <> 
managedZone <> 
operation <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project managedZone operation]
    (managedZoneOperations-get project managedZone operation nil))
  ([project managedZone operation optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}/operations/{operation}",
       :uri-template-args
       {"project" project,
        "managedZone" managedZone,
        "operation" operation},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn managedZoneOperations-list
  "Enumerates Operations for the given ManagedZone.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/managedZoneOperations/list

project <> 
managedZone <> 

optional:
maxResults <integer> Optional. Maximum number of results to be returned. If unspecified, the server decides how many results to return.
sortBy <string> Sorting criterion. The only supported values are START_TIME and ID."
  ([project managedZone]
    (managedZoneOperations-list project managedZone nil))
  ([project managedZone optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}/operations",
       :uri-template-args
       {"project" project, "managedZone" managedZone},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn managedZones-list
  "Enumerates ManagedZones that have been created but not yet deleted.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/managedZones/list

project <> 

optional:
maxResults <integer> Optional. Maximum number of results to be returned. If unspecified, the server decides how many results to return.
dnsName <string> Restricts the list to return only zones with this domain name."
  ([project] (managedZones-list project nil))
  ([project optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones",
       :uri-template-args {"project" project},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn managedZones-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/managedZones/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dns.googleapis.com/dns/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
     :body GoogleIamV1SetIamPolicyRequest}))

(defn managedZones-delete
  "Deletes a previously created ManagedZone.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/managedZones/delete

project <> 
managedZone <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project managedZone] (managedZones-delete project managedZone nil))
  ([project managedZone optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}",
       :uri-template-args
       {"project" project, "managedZone" managedZone},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn managedZones-update
  "Updates an existing ManagedZone.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/managedZones/update

project <> 
managedZone <> 
ManagedZone:
ManagedZone

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project managedZone ManagedZone]
    (managedZones-update project managedZone ManagedZone nil))
  ([project managedZone ManagedZone optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}",
       :uri-template-args
       {"project" project, "managedZone" managedZone},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body ManagedZone})))

(defn managedZones-patch
  "Applies a partial update to an existing ManagedZone.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/managedZones/patch

project <> 
managedZone <> 
ManagedZone:
ManagedZone

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project managedZone ManagedZone]
    (managedZones-patch project managedZone ManagedZone nil))
  ([project managedZone ManagedZone optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}",
       :uri-template-args
       {"project" project, "managedZone" managedZone},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body ManagedZone})))

(defn managedZones-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/managedZones/getIamPolicy

resource <> 
GoogleIamV1GetIamPolicyRequest:
GoogleIamV1GetIamPolicyRequest"
  [resource GoogleIamV1GetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dns.googleapis.com/dns/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/ndev.clouddns.readonly"
      "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
     :body GoogleIamV1GetIamPolicyRequest}))

(defn managedZones-create
  "Creates a new ManagedZone.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/managedZones/create

project <> 
ManagedZone:
ManagedZone

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project ManagedZone] (managedZones-create project ManagedZone nil))
  ([project ManagedZone optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones",
       :uri-template-args {"project" project},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body ManagedZone})))

(defn managedZones-get
  "Fetches the representation of an existing ManagedZone.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/managedZones/get

project <> 
managedZone <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project managedZone] (managedZones-get project managedZone nil))
  ([project managedZone optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}",
       :uri-template-args
       {"project" project, "managedZone" managedZone},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn managedZones-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this returns an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/managedZones/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://dns.googleapis.com/dns/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/ndev.clouddns.readonly"
      "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
     :body GoogleIamV1TestIamPermissionsRequest}))

(defn changes-create
  "Atomically updates the ResourceRecordSet collection.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/changes/create

project <> 
managedZone <> 
Change:
Change

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project managedZone Change]
    (changes-create project managedZone Change nil))
  ([project managedZone Change optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}/changes",
       :uri-template-args
       {"project" project, "managedZone" managedZone},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body Change})))

(defn changes-get
  "Fetches the representation of an existing Change.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/changes/get

project <> 
managedZone <> 
changeId <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project managedZone changeId]
    (changes-get project managedZone changeId nil))
  ([project managedZone changeId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}/changes/{changeId}",
       :uri-template-args
       {"project" project,
        "managedZone" managedZone,
        "changeId" changeId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn changes-list
  "Enumerates Changes to a ResourceRecordSet collection.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/changes/list

project <> 
managedZone <> 

optional:
maxResults <integer> Optional. Maximum number of results to be returned. If unspecified, the server decides how many results to return.
sortBy <string> Sorting criterion. The only supported value is change sequence.
sortOrder <string> Sorting order direction: 'ascending' or 'descending'."
  ([project managedZone] (changes-list project managedZone nil))
  ([project managedZone optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}/changes",
       :uri-template-args
       {"project" project, "managedZone" managedZone},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn policies-create
  "Creates a new Policy.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/policies/create

project <> 
Policy:
Policy

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project Policy] (policies-create project Policy nil))
  ([project Policy optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/policies",
       :uri-template-args {"project" project},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body Policy})))

(defn policies-get
  "Fetches the representation of an existing Policy.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/policies/get

project <> 
policy <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project policy] (policies-get project policy nil))
  ([project policy optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/policies/{policy}",
       :uri-template-args {"project" project, "policy" policy},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn policies-list
  "Enumerates all Policies associated with a project.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/policies/list

project <> 

optional:
maxResults <integer> Optional. Maximum number of results to be returned. If unspecified, the server decides how many results to return."
  ([project] (policies-list project nil))
  ([project optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/policies",
       :uri-template-args {"project" project},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn policies-delete
  "Deletes a previously created Policy. Fails if the policy is still being referenced by a network.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/policies/delete

project <> 
policy <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project policy] (policies-delete project policy nil))
  ([project policy optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/policies/{policy}",
       :uri-template-args {"project" project, "policy" policy},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn policies-patch
  "Applies a partial update to an existing Policy.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/policies/patch

project <> 
policy <> 
Policy:
Policy

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project policy Policy] (policies-patch project policy Policy nil))
  ([project policy Policy optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/policies/{policy}",
       :uri-template-args {"project" project, "policy" policy},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body Policy})))

(defn policies-update
  "Updates an existing Policy.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/policies/update

project <> 
policy <> 
Policy:
Policy

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project policy Policy] (policies-update project policy Policy nil))
  ([project policy Policy optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/policies/{policy}",
       :uri-template-args {"project" project, "policy" policy},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body Policy})))

(defn responsePolicyRules-create
  "Creates a new Response Policy Rule.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/responsePolicyRules/create

project <> 
responsePolicy <> 
ResponsePolicyRule:
ResponsePolicyRule

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project responsePolicy ResponsePolicyRule]
    (responsePolicyRules-create
      project
      responsePolicy
      ResponsePolicyRule
      nil))
  ([project responsePolicy ResponsePolicyRule optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/responsePolicies/{responsePolicy}/rules",
       :uri-template-args
       {"project" project, "responsePolicy" responsePolicy},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body ResponsePolicyRule})))

(defn responsePolicyRules-get
  "Fetches the representation of an existing Response Policy Rule.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/responsePolicyRules/get

project <> 
responsePolicy <> 
responsePolicyRule <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project responsePolicy responsePolicyRule]
    (responsePolicyRules-get
      project
      responsePolicy
      responsePolicyRule
      nil))
  ([project responsePolicy responsePolicyRule optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/responsePolicies/{responsePolicy}/rules/{responsePolicyRule}",
       :uri-template-args
       {"project" project,
        "responsePolicy" responsePolicy,
        "responsePolicyRule" responsePolicyRule},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn responsePolicyRules-delete
  "Deletes a previously created Response Policy Rule.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/responsePolicyRules/delete

project <> 
responsePolicy <> 
responsePolicyRule <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project responsePolicy responsePolicyRule]
    (responsePolicyRules-delete
      project
      responsePolicy
      responsePolicyRule
      nil))
  ([project responsePolicy responsePolicyRule optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/responsePolicies/{responsePolicy}/rules/{responsePolicyRule}",
       :uri-template-args
       {"project" project,
        "responsePolicy" responsePolicy,
        "responsePolicyRule" responsePolicyRule},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn responsePolicyRules-list
  "Enumerates all Response Policy Rules associated with a project.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/responsePolicyRules/list

project <> 
responsePolicy <> 

optional:
maxResults <integer> Optional. Maximum number of results to be returned. If unspecified, the server decides how many results to return."
  ([project responsePolicy]
    (responsePolicyRules-list project responsePolicy nil))
  ([project responsePolicy optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/responsePolicies/{responsePolicy}/rules",
       :uri-template-args
       {"project" project, "responsePolicy" responsePolicy},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn responsePolicyRules-patch
  "Applies a partial update to an existing Response Policy Rule.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/responsePolicyRules/patch

project <> 
responsePolicy <> 
responsePolicyRule <> 
ResponsePolicyRule:
ResponsePolicyRule

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project responsePolicy responsePolicyRule ResponsePolicyRule]
    (responsePolicyRules-patch
      project
      responsePolicy
      responsePolicyRule
      ResponsePolicyRule
      nil))
  ([project
    responsePolicy
    responsePolicyRule
    ResponsePolicyRule
    optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/responsePolicies/{responsePolicy}/rules/{responsePolicyRule}",
       :uri-template-args
       {"project" project,
        "responsePolicy" responsePolicy,
        "responsePolicyRule" responsePolicyRule},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body ResponsePolicyRule})))

(defn responsePolicyRules-update
  "Updates an existing Response Policy Rule.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/responsePolicyRules/update

project <> 
responsePolicy <> 
responsePolicyRule <> 
ResponsePolicyRule:
ResponsePolicyRule

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project responsePolicy responsePolicyRule ResponsePolicyRule]
    (responsePolicyRules-update
      project
      responsePolicy
      responsePolicyRule
      ResponsePolicyRule
      nil))
  ([project
    responsePolicy
    responsePolicyRule
    ResponsePolicyRule
    optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/responsePolicies/{responsePolicy}/rules/{responsePolicyRule}",
       :uri-template-args
       {"project" project,
        "responsePolicy" responsePolicy,
        "responsePolicyRule" responsePolicyRule},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body ResponsePolicyRule})))

(defn responsePolicies-create
  "Creates a new Response Policy
https://cloud.google.com/dns/docs/v1/reference/rest/v1/responsePolicies/create

project <> 
ResponsePolicy:
ResponsePolicy

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project ResponsePolicy]
    (responsePolicies-create project ResponsePolicy nil))
  ([project ResponsePolicy optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/responsePolicies",
       :uri-template-args {"project" project},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body ResponsePolicy})))

(defn responsePolicies-get
  "Fetches the representation of an existing Response Policy.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/responsePolicies/get

project <> 
responsePolicy <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project responsePolicy]
    (responsePolicies-get project responsePolicy nil))
  ([project responsePolicy optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/responsePolicies/{responsePolicy}",
       :uri-template-args
       {"project" project, "responsePolicy" responsePolicy},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn responsePolicies-list
  "Enumerates all Response Policies associated with a project.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/responsePolicies/list

project <> 

optional:
maxResults <integer> Optional. Maximum number of results to be returned. If unspecified, the server decides how many results to return."
  ([project] (responsePolicies-list project nil))
  ([project optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/responsePolicies",
       :uri-template-args {"project" project},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn responsePolicies-delete
  "Deletes a previously created Response Policy. Fails if the response policy is non-empty or still being referenced by a network.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/responsePolicies/delete

project <> 
responsePolicy <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project responsePolicy]
    (responsePolicies-delete project responsePolicy nil))
  ([project responsePolicy optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/responsePolicies/{responsePolicy}",
       :uri-template-args
       {"project" project, "responsePolicy" responsePolicy},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn responsePolicies-patch
  "Applies a partial update to an existing Response Policy.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/responsePolicies/patch

project <> 
responsePolicy <> 
ResponsePolicy:
ResponsePolicy

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project responsePolicy ResponsePolicy]
    (responsePolicies-patch project responsePolicy ResponsePolicy nil))
  ([project responsePolicy ResponsePolicy optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/responsePolicies/{responsePolicy}",
       :uri-template-args
       {"project" project, "responsePolicy" responsePolicy},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body ResponsePolicy})))

(defn responsePolicies-update
  "Updates an existing Response Policy.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/responsePolicies/update

project <> 
responsePolicy <> 
ResponsePolicy:
ResponsePolicy

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project responsePolicy ResponsePolicy]
    (responsePolicies-update
      project
      responsePolicy
      ResponsePolicy
      nil))
  ([project responsePolicy ResponsePolicy optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/responsePolicies/{responsePolicy}",
       :uri-template-args
       {"project" project, "responsePolicy" responsePolicy},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body ResponsePolicy})))

(defn projects-get
  "Fetches the representation of an existing Project.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/projects/get

project <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project] (projects-get project nil))
  ([project optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}",
       :uri-template-args {"project" project},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn dnsKeys-get
  "Fetches the representation of an existing DnsKey.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/dnsKeys/get

project <> 
managedZone <> 
dnsKeyId <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
digestType <string> An optional comma-separated list of digest types to compute and display for key signing keys. If omitted, the recommended digest type is computed and displayed."
  ([project managedZone dnsKeyId]
    (dnsKeys-get project managedZone dnsKeyId nil))
  ([project managedZone dnsKeyId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}/dnsKeys/{dnsKeyId}",
       :uri-template-args
       {"project" project,
        "managedZone" managedZone,
        "dnsKeyId" dnsKeyId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn dnsKeys-list
  "Enumerates DnsKeys to a ResourceRecordSet collection.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/dnsKeys/list

project <> 
managedZone <> 

optional:
maxResults <integer> Optional. Maximum number of results to be returned. If unspecified, the server decides how many results to return.
digestType <string> An optional comma-separated list of digest types to compute and display for key signing keys. If omitted, the recommended digest type is computed and displayed."
  ([project managedZone] (dnsKeys-list project managedZone nil))
  ([project managedZone optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}/dnsKeys",
       :uri-template-args
       {"project" project, "managedZone" managedZone},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn resourceRecordSets-list
  "Enumerates ResourceRecordSets that you have created but not yet deleted.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/resourceRecordSets/list

project <> 
managedZone <> 

optional:
maxResults <integer> Optional. Maximum number of results to be returned. If unspecified, the server decides how many results to return.
name <string> Restricts the list to return only records with this fully qualified domain name.
type <string> Restricts the list to return only records of this type. If present, the \"name\" parameter must also be present."
  ([project managedZone]
    (resourceRecordSets-list project managedZone nil))
  ([project managedZone optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}/rrsets",
       :uri-template-args
       {"project" project, "managedZone" managedZone},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn resourceRecordSets-create
  "Creates a new ResourceRecordSet.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/resourceRecordSets/create

project <> 
managedZone <> 
ResourceRecordSet:
ResourceRecordSet

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project managedZone ResourceRecordSet]
    (resourceRecordSets-create
      project
      managedZone
      ResourceRecordSet
      nil))
  ([project managedZone ResourceRecordSet optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}/rrsets",
       :uri-template-args
       {"project" project, "managedZone" managedZone},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body ResourceRecordSet})))

(defn resourceRecordSets-get
  "Fetches the representation of an existing ResourceRecordSet.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/resourceRecordSets/get

project <> 
managedZone <> 
name <> 
type <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project managedZone name type]
    (resourceRecordSets-get project managedZone name type nil))
  ([project managedZone name type optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}/rrsets/{name}/{type}",
       :uri-template-args
       {"project" project,
        "managedZone" managedZone,
        "name" name,
        "type" type},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/ndev.clouddns.readonly"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn resourceRecordSets-delete
  "Deletes a previously created ResourceRecordSet.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/resourceRecordSets/delete

project <> 
managedZone <> 
name <> 
type <> 

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project managedZone name type]
    (resourceRecordSets-delete project managedZone name type nil))
  ([project managedZone name type optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}/rrsets/{name}/{type}",
       :uri-template-args
       {"project" project,
        "managedZone" managedZone,
        "name" name,
        "type" type},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"]})))

(defn resourceRecordSets-patch
  "Applies a partial update to an existing ResourceRecordSet.
https://cloud.google.com/dns/docs/v1/reference/rest/v1/resourceRecordSets/patch

project <> 
managedZone <> 
name <> 
type <> 
ResourceRecordSet:
ResourceRecordSet

optional:
clientOperationId <string> For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection."
  ([project managedZone name type ResourceRecordSet]
    (resourceRecordSets-patch
      project
      managedZone
      name
      type
      ResourceRecordSet
      nil))
  ([project managedZone name type ResourceRecordSet optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://dns.googleapis.com/dns/v1/projects/{project}/managedZones/{managedZone}/rrsets/{name}/{type}",
       :uri-template-args
       {"project" project,
        "managedZone" managedZone,
        "name" name,
        "type" type},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/ndev.clouddns.readwrite"],
       :body ResourceRecordSet})))
