(ns happyapi.google.orgpolicy-v2
  "Organization Policy API
The Organization Policy API allows users to configure governance rules on their Google Cloud resources across the resource hierarchy.
See: https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest")

(defn projects-policies-list
  "Retrieves all of the policies that exist on a particular resource.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/projects/policies/list

parent <> 

optional:
pageSize <integer> Size of the pages to be returned. This is currently unsupported and will be ignored. The server may at any point start using this field to limit page size."
  ([parent] (projects-policies-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://orgpolicy.googleapis.com/v2/{+parent}/policies",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-policies-get
  "Gets a policy on a resource. If no policy is set on the resource, `NOT_FOUND` is returned. The `etag` value can be used with `UpdatePolicy()` to update a policy during read-modify-write.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/projects/policies/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://orgpolicy.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-policies-getEffectivePolicy
  "Gets the effective policy on a resource. This is the result of merging policies in the resource hierarchy and evaluating conditions. The returned policy will not have an `etag` or `condition` set because it is an evaluated policy across multiple resources. Subtrees of Resource Manager resource hierarchy with 'under:' prefix will not be expanded.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/projects/policies/getEffectivePolicy

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://orgpolicy.googleapis.com/v2/{+name}:getEffectivePolicy",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-policies-create
  "Creates a policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint does not exist. Returns a `google.rpc.Status` with `google.rpc.Code.ALREADY_EXISTS` if the policy already exists on the given Google Cloud resource.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/projects/policies/create

parent <> 
GoogleCloudOrgpolicyV2Policy:
GoogleCloudOrgpolicyV2Policy"
  [parent GoogleCloudOrgpolicyV2Policy]
  {:method :post,
   :uri-template
   "https://orgpolicy.googleapis.com/v2/{+parent}/policies",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudOrgpolicyV2Policy})

(defn projects-policies-delete
  "Deletes a policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint or organization policy does not exist.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/projects/policies/delete

name <> 

optional:
etag <string> Optional. The current etag of policy. If an etag is provided and does not match the current etag of the policy, deletion will be blocked and an ABORTED error will be returned."
  ([name] (projects-policies-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://orgpolicy.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-policies-patch
  "Updates a policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint or the policy do not exist. Returns a `google.rpc.Status` with `google.rpc.Code.ABORTED` if the etag supplied in the request does not match the persisted etag of the policy Note: the supplied policy will perform a full overwrite of all fields.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/projects/policies/patch

name <> 
GoogleCloudOrgpolicyV2Policy:
GoogleCloudOrgpolicyV2Policy

optional:
updateMask <string> Field mask used to specify the fields to be overwritten in the policy by the set. The fields specified in the update_mask are relative to the policy, not the full request."
  ([name GoogleCloudOrgpolicyV2Policy]
    (projects-policies-patch name GoogleCloudOrgpolicyV2Policy nil))
  ([name GoogleCloudOrgpolicyV2Policy optional]
    {:method :patch,
     :uri-template "https://orgpolicy.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudOrgpolicyV2Policy}))

(defn projects-constraints-list
  "Lists constraints that could be applied on the specified resource.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/projects/constraints/list

parent <> 

optional:
pageSize <integer> Size of the pages to be returned. This is currently unsupported and will be ignored. The server may at any point start using this field to limit page size."
  ([parent] (projects-constraints-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://orgpolicy.googleapis.com/v2/{+parent}/constraints",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-constraints-list
  "Lists constraints that could be applied on the specified resource.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/folders/constraints/list

parent <> 

optional:
pageSize <integer> Size of the pages to be returned. This is currently unsupported and will be ignored. The server may at any point start using this field to limit page size."
  ([parent] (folders-constraints-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://orgpolicy.googleapis.com/v2/{+parent}/constraints",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-policies-delete
  "Deletes a policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint or organization policy does not exist.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/folders/policies/delete

name <> 

optional:
etag <string> Optional. The current etag of policy. If an etag is provided and does not match the current etag of the policy, deletion will be blocked and an ABORTED error will be returned."
  ([name] (folders-policies-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://orgpolicy.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-policies-get
  "Gets a policy on a resource. If no policy is set on the resource, `NOT_FOUND` is returned. The `etag` value can be used with `UpdatePolicy()` to update a policy during read-modify-write.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/folders/policies/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://orgpolicy.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn folders-policies-patch
  "Updates a policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint or the policy do not exist. Returns a `google.rpc.Status` with `google.rpc.Code.ABORTED` if the etag supplied in the request does not match the persisted etag of the policy Note: the supplied policy will perform a full overwrite of all fields.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/folders/policies/patch

name <> 
GoogleCloudOrgpolicyV2Policy:
GoogleCloudOrgpolicyV2Policy

optional:
updateMask <string> Field mask used to specify the fields to be overwritten in the policy by the set. The fields specified in the update_mask are relative to the policy, not the full request."
  ([name GoogleCloudOrgpolicyV2Policy]
    (folders-policies-patch name GoogleCloudOrgpolicyV2Policy nil))
  ([name GoogleCloudOrgpolicyV2Policy optional]
    {:method :patch,
     :uri-template "https://orgpolicy.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudOrgpolicyV2Policy}))

(defn folders-policies-getEffectivePolicy
  "Gets the effective policy on a resource. This is the result of merging policies in the resource hierarchy and evaluating conditions. The returned policy will not have an `etag` or `condition` set because it is an evaluated policy across multiple resources. Subtrees of Resource Manager resource hierarchy with 'under:' prefix will not be expanded.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/folders/policies/getEffectivePolicy

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://orgpolicy.googleapis.com/v2/{+name}:getEffectivePolicy",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn folders-policies-list
  "Retrieves all of the policies that exist on a particular resource.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/folders/policies/list

parent <> 

optional:
pageSize <integer> Size of the pages to be returned. This is currently unsupported and will be ignored. The server may at any point start using this field to limit page size."
  ([parent] (folders-policies-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://orgpolicy.googleapis.com/v2/{+parent}/policies",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn folders-policies-create
  "Creates a policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint does not exist. Returns a `google.rpc.Status` with `google.rpc.Code.ALREADY_EXISTS` if the policy already exists on the given Google Cloud resource.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/folders/policies/create

parent <> 
GoogleCloudOrgpolicyV2Policy:
GoogleCloudOrgpolicyV2Policy"
  [parent GoogleCloudOrgpolicyV2Policy]
  {:method :post,
   :uri-template
   "https://orgpolicy.googleapis.com/v2/{+parent}/policies",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudOrgpolicyV2Policy})

(defn organizations-constraints-list
  "Lists constraints that could be applied on the specified resource.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/organizations/constraints/list

parent <> 

optional:
pageSize <integer> Size of the pages to be returned. This is currently unsupported and will be ignored. The server may at any point start using this field to limit page size."
  ([parent] (organizations-constraints-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://orgpolicy.googleapis.com/v2/{+parent}/constraints",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-policies-patch
  "Updates a policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint or the policy do not exist. Returns a `google.rpc.Status` with `google.rpc.Code.ABORTED` if the etag supplied in the request does not match the persisted etag of the policy Note: the supplied policy will perform a full overwrite of all fields.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/organizations/policies/patch

name <> 
GoogleCloudOrgpolicyV2Policy:
GoogleCloudOrgpolicyV2Policy

optional:
updateMask <string> Field mask used to specify the fields to be overwritten in the policy by the set. The fields specified in the update_mask are relative to the policy, not the full request."
  ([name GoogleCloudOrgpolicyV2Policy]
    (organizations-policies-patch
      name
      GoogleCloudOrgpolicyV2Policy
      nil))
  ([name GoogleCloudOrgpolicyV2Policy optional]
    {:method :patch,
     :uri-template "https://orgpolicy.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudOrgpolicyV2Policy}))

(defn organizations-policies-get
  "Gets a policy on a resource. If no policy is set on the resource, `NOT_FOUND` is returned. The `etag` value can be used with `UpdatePolicy()` to update a policy during read-modify-write.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/organizations/policies/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://orgpolicy.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-policies-create
  "Creates a policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint does not exist. Returns a `google.rpc.Status` with `google.rpc.Code.ALREADY_EXISTS` if the policy already exists on the given Google Cloud resource.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/organizations/policies/create

parent <> 
GoogleCloudOrgpolicyV2Policy:
GoogleCloudOrgpolicyV2Policy"
  [parent GoogleCloudOrgpolicyV2Policy]
  {:method :post,
   :uri-template
   "https://orgpolicy.googleapis.com/v2/{+parent}/policies",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudOrgpolicyV2Policy})

(defn organizations-policies-delete
  "Deletes a policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint or organization policy does not exist.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/organizations/policies/delete

name <> 

optional:
etag <string> Optional. The current etag of policy. If an etag is provided and does not match the current etag of the policy, deletion will be blocked and an ABORTED error will be returned."
  ([name] (organizations-policies-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://orgpolicy.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-policies-getEffectivePolicy
  "Gets the effective policy on a resource. This is the result of merging policies in the resource hierarchy and evaluating conditions. The returned policy will not have an `etag` or `condition` set because it is an evaluated policy across multiple resources. Subtrees of Resource Manager resource hierarchy with 'under:' prefix will not be expanded.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/organizations/policies/getEffectivePolicy

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://orgpolicy.googleapis.com/v2/{+name}:getEffectivePolicy",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-policies-list
  "Retrieves all of the policies that exist on a particular resource.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/organizations/policies/list

parent <> 

optional:
pageSize <integer> Size of the pages to be returned. This is currently unsupported and will be ignored. The server may at any point start using this field to limit page size."
  ([parent] (organizations-policies-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://orgpolicy.googleapis.com/v2/{+parent}/policies",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-customConstraints-delete
  "Deletes a custom constraint. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint does not exist.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/organizations/customConstraints/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://orgpolicy.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-customConstraints-patch
  "Updates a custom constraint. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint does not exist. Note: the supplied policy will perform a full overwrite of all fields.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/organizations/customConstraints/patch

name <> 
GoogleCloudOrgpolicyV2CustomConstraint:
GoogleCloudOrgpolicyV2CustomConstraint"
  [name GoogleCloudOrgpolicyV2CustomConstraint]
  {:method :patch,
   :uri-template "https://orgpolicy.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudOrgpolicyV2CustomConstraint})

(defn organizations-customConstraints-list
  "Retrieves all of the custom constraints that exist on a particular organization resource.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/organizations/customConstraints/list

parent <> 

optional:
pageSize <integer> Size of the pages to be returned. This is currently unsupported and will be ignored. The server may at any point start using this field to limit page size."
  ([parent] (organizations-customConstraints-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://orgpolicy.googleapis.com/v2/{+parent}/customConstraints",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-customConstraints-create
  "Creates a custom constraint. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the organization does not exist. Returns a `google.rpc.Status` with `google.rpc.Code.ALREADY_EXISTS` if the constraint already exists on the given organization.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/organizations/customConstraints/create

parent <> 
GoogleCloudOrgpolicyV2CustomConstraint:
GoogleCloudOrgpolicyV2CustomConstraint"
  [parent GoogleCloudOrgpolicyV2CustomConstraint]
  {:method :post,
   :uri-template
   "https://orgpolicy.googleapis.com/v2/{+parent}/customConstraints",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudOrgpolicyV2CustomConstraint})

(defn organizations-customConstraints-get
  "Gets a custom constraint. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the custom constraint does not exist.
https://cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/reference/rest/v2/organizations/customConstraints/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://orgpolicy.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})
