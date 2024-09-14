(ns happyapi.google.bigquerydatapolicy-v1
  "BigQuery Data Policy API
Allows users to manage BigQuery data policies.
See: https://cloud.google.com/bigquery/docs/column-data-masking")

(defn projects-locations-dataPolicies-rename
  "Renames the id (display name) of the specified data policy.
https://cloud.google.com/bigquery/docs/column-data-masking/v1/reference/rest/v1/projects/locations/dataPolicies/rename

name <> 
RenameDataPolicyRequest:
RenameDataPolicyRequest"
  [name RenameDataPolicyRequest]
  {:method :post,
   :uri-template
   "https://bigquerydatapolicy.googleapis.com/v1/{+name}:rename",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body RenameDataPolicyRequest})

(defn projects-locations-dataPolicies-list
  "List all of the data policies in the specified parent project.
https://cloud.google.com/bigquery/docs/column-data-masking/v1/reference/rest/v1/projects/locations/dataPolicies/list

parent <> 

optional:
pageSize <integer> The maximum number of data policies to return. Must be a value between 1 and 1000. If not set, defaults to 50.
filter <string> Filters the data policies by policy tags that they are associated with. Currently filter only supports \"policy_tag\" based filtering and OR based predicates. Sample filter can be \"policy_tag: projects/1/locations/us/taxonomies/2/policyTags/3\". You may also use wildcard such as \"policy_tag: projects/1/locations/us/taxonomies/2*\". Please note that OR predicates cannot be used with wildcard filters."
  ([parent] (projects-locations-dataPolicies-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://bigquerydatapolicy.googleapis.com/v1/{+parent}/dataPolicies",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataPolicies-setIamPolicy
  "Sets the IAM policy for the specified data policy.
https://cloud.google.com/bigquery/docs/column-data-masking/v1/reference/rest/v1/projects/locations/dataPolicies/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://bigquerydatapolicy.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-dataPolicies-delete
  "Deletes the data policy specified by its resource name.
https://cloud.google.com/bigquery/docs/column-data-masking/v1/reference/rest/v1/projects/locations/dataPolicies/delete

name <> 

optional:
force <boolean> Optional. If true, the data policy will be deleted even when it is referenced by one or more table columns."
  ([name] (projects-locations-dataPolicies-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://bigquerydatapolicy.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataPolicies-patch
  "Updates the metadata for an existing data policy. The target data policy can be specified by the resource name.
https://cloud.google.com/bigquery/docs/column-data-masking/v1/reference/rest/v1/projects/locations/dataPolicies/patch

name <> 
DataPolicy:
DataPolicy

optional:
updateMask <string> The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If not set, defaults to all of the fields that are allowed to update. Updates to the `name` and `dataPolicyId` fields are not allowed.
allowMissing <boolean> Optional. If set to true, and the data policy is not found, a new data policy will be created. In this situation, update_mask is ignored."
  ([name DataPolicy]
    (projects-locations-dataPolicies-patch name DataPolicy nil))
  ([name DataPolicy optional]
    {:method :patch,
     :uri-template
     "https://bigquerydatapolicy.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body DataPolicy}))

(defn projects-locations-dataPolicies-getIamPolicy
  "Gets the IAM policy for the specified data policy.
https://cloud.google.com/bigquery/docs/column-data-masking/v1/reference/rest/v1/projects/locations/dataPolicies/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://bigquerydatapolicy.googleapis.com/v1/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body GetIamPolicyRequest})

(defn projects-locations-dataPolicies-create
  "Creates a new data policy under a project with the given `dataPolicyId` (used as the display name), policy tag, and data policy type.
https://cloud.google.com/bigquery/docs/column-data-masking/v1/reference/rest/v1/projects/locations/dataPolicies/create

parent <> 
DataPolicy:
DataPolicy"
  [parent DataPolicy]
  {:method :post,
   :uri-template
   "https://bigquerydatapolicy.googleapis.com/v1/{+parent}/dataPolicies",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body DataPolicy})

(defn projects-locations-dataPolicies-get
  "Gets the data policy specified by its resource name.
https://cloud.google.com/bigquery/docs/column-data-masking/v1/reference/rest/v1/projects/locations/dataPolicies/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://bigquerydatapolicy.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-dataPolicies-testIamPermissions
  "Returns the caller's permission on the specified data policy resource.
https://cloud.google.com/bigquery/docs/column-data-masking/v1/reference/rest/v1/projects/locations/dataPolicies/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://bigquerydatapolicy.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})
