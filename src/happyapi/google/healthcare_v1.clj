(ns happyapi.google.healthcare-v1
  "Cloud Healthcare API
Manage, store, and access healthcare data in Google Cloud Platform.
See: https://cloud.google.com/healthcare")

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-deidentify
  "Creates a new dataset containing de-identified data from the source dataset. The metadata field type is OperationMetadata. If the request is successful, the response field type is DeidentifySummary. If errors occur, error is set. The LRO result may still be successful if de-identification fails for some DICOM instances. The new de-identified dataset will not contain these failed resources. Failed resource totals are tracked in Operation.metadata. Error details are also logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/deidentify

sourceDataset <> 
DeidentifyDatasetRequest:
DeidentifyDatasetRequest"
  [sourceDataset DeidentifyDatasetRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+sourceDataset}:deidentify",
   :uri-template-args {"sourceDataset" sourceDataset},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body DeidentifyDatasetRequest})

(defn projects-locations-datasets-list
  "Lists the health datasets in the current project.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return. If not specified, 100 is used. May not be larger than 1000."
  ([parent] (projects-locations-datasets-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/datasets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-datasets-delete
  "Deletes the specified health dataset and all data contained in the dataset. Deleting a dataset does not affect the sources from which the dataset was imported (if any).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-patch
  "Updates dataset metadata.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/patch

name <> 
Dataset:
Dataset

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask"
  ([name Dataset] (projects-locations-datasets-patch name Dataset nil))
  ([name Dataset optional]
    {:method :patch,
     :uri-template "https://healthcare.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body Dataset}))

(defn projects-locations-datasets-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-datasets-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-create
  "Creates a new health dataset. Results are returned through the Operation interface which returns either an `Operation.response` which contains a Dataset or `Operation.error`. The metadata field type is OperationMetadata.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/create

parent <> 
Dataset:
Dataset

optional:
datasetId <string> Required. The ID of the dataset that is being created. The string must match the following regex: `[\\p{L}\\p{N}_\\-\\.]{1,256}`."
  ([parent Dataset]
    (projects-locations-datasets-create parent Dataset nil))
  ([parent Dataset optional]
    {:method :post,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/datasets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body Dataset}))

(defn projects-locations-datasets-get
  "Gets any metadata associated with a dataset.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-datasets-consentStores-list
  "Lists the consent stores in the specified dataset.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/list

parent <> 

optional:
pageSize <integer> Optional. Limit on the number of consent stores to return in a single response. If not specified, 100 is used. May not be larger than 1000.
filter <string> Optional. Restricts the stores returned to those matching a filter. Only filtering on labels is supported. For example, `filter=labels.key=value`."
  ([parent]
    (projects-locations-datasets-consentStores-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/consentStores",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-consentStores-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-datasets-consentStores-delete
  "Deletes the specified consent store and removes all the consent store's data.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-consentStores-patch
  "Updates the specified consent store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/patch

name <> 
ConsentStore:
ConsentStore

optional:
updateMask <string> Required. The update mask that applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask. Only the `labels`, `default_consent_ttl`, and `enable_consent_create_on_update` fields are allowed to be updated."
  ([name ConsentStore]
    (projects-locations-datasets-consentStores-patch
      name
      ConsentStore
      nil))
  ([name ConsentStore optional]
    {:method :patch,
     :uri-template "https://healthcare.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body ConsentStore}))

(defn projects-locations-datasets-consentStores-evaluateUserConsents
  "Evaluates the user's Consents for all matching User data mappings. Note: User data mappings are indexed asynchronously, which can cause a slight delay between the time mappings are created or updated and when they are included in EvaluateUserConsents results.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/evaluateUserConsents

consentStore <> 
EvaluateUserConsentsRequest:
EvaluateUserConsentsRequest"
  [consentStore EvaluateUserConsentsRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+consentStore}:evaluateUserConsents",
   :uri-template-args {"consentStore" consentStore},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body EvaluateUserConsentsRequest})

(defn projects-locations-datasets-consentStores-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-datasets-consentStores-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-consentStores-create
  "Creates a new consent store in the parent dataset. Attempting to create a consent store with the same ID as an existing store fails with an ALREADY_EXISTS error.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/create

parent <> 
ConsentStore:
ConsentStore

optional:
consentStoreId <string> Required. The ID of the consent store to create. The string must match the following regex: `[\\p{L}\\p{N}_\\-\\.]{1,256}`. Cannot be changed after creation."
  ([parent ConsentStore]
    (projects-locations-datasets-consentStores-create
      parent
      ConsentStore
      nil))
  ([parent ConsentStore optional]
    {:method :post,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/consentStores",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body ConsentStore}))

(defn projects-locations-datasets-consentStores-checkDataAccess
  "Checks if a particular data_id of a User data mapping in the specified consent store is consented for the specified use.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/checkDataAccess

consentStore <> 
CheckDataAccessRequest:
CheckDataAccessRequest"
  [consentStore CheckDataAccessRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+consentStore}:checkDataAccess",
   :uri-template-args {"consentStore" consentStore},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body CheckDataAccessRequest})

(defn projects-locations-datasets-consentStores-queryAccessibleData
  "Queries all data_ids that are consented for a specified use in the given consent store and writes them to a specified destination. The returned Operation includes a progress counter for the number of User data mappings processed. If the request is successful, a detailed response is returned of type QueryAccessibleDataResponse, contained in the response field when the operation finishes. The metadata field type is OperationMetadata. Errors are logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). For example, the following sample log entry shows a `failed to evaluate consent policy` error that occurred during a QueryAccessibleData call to consent store `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}`. ```json jsonPayload: { @type: \"type.googleapis.com/google.cloud.healthcare.logging.QueryAccessibleDataLogEntry\" error: { code: 9 message: \"failed to evaluate consent policy\" } resourceName: \"projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}\" } logName: \"projects/{project_id}/logs/healthcare.googleapis.com%2Fquery_accessible_data\" operation: { id: \"projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/operations/{operation_id}\" producer: \"healthcare.googleapis.com/QueryAccessibleData\" } receiveTimestamp: \"TIMESTAMP\" resource: { labels: { consent_store_id: \"{consent_store_id}\" dataset_id: \"{dataset_id}\" location: \"{location_id}\" project_id: \"{project_id}\" } type: \"healthcare_consent_store\" } severity: \"ERROR\" timestamp: \"TIMESTAMP\" ```
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/queryAccessibleData

consentStore <> 
QueryAccessibleDataRequest:
QueryAccessibleDataRequest"
  [consentStore QueryAccessibleDataRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+consentStore}:queryAccessibleData",
   :uri-template-args {"consentStore" consentStore},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body QueryAccessibleDataRequest})

(defn projects-locations-datasets-consentStores-get
  "Gets the specified consent store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-consentStores-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-datasets-consentStores-attributeDefinitions-create
  "Creates a new Attribute definition in the parent consent store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/attributeDefinitions/create

parent <> 
AttributeDefinition:
AttributeDefinition

optional:
attributeDefinitionId <string> Required. The ID of the Attribute definition to create. The string must match the following regex: `_a-zA-Z{0,255}` and must not be a reserved keyword within the Common Expression Language as listed on https://github.com/google/cel-spec/blob/master/doc/langdef.md."
  ([parent AttributeDefinition]
    (projects-locations-datasets-consentStores-attributeDefinitions-create
      parent
      AttributeDefinition
      nil))
  ([parent AttributeDefinition optional]
    {:method :post,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/attributeDefinitions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body AttributeDefinition}))

(defn projects-locations-datasets-consentStores-attributeDefinitions-get
  "Gets the specified Attribute definition.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/attributeDefinitions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-consentStores-attributeDefinitions-delete
  "Deletes the specified Attribute definition. Fails if the Attribute definition is referenced by any User data mapping, or the latest revision of any Consent.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/attributeDefinitions/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-consentStores-attributeDefinitions-patch
  "Updates the specified Attribute definition.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/attributeDefinitions/patch

name <> 
AttributeDefinition:
AttributeDefinition

optional:
updateMask <string> Required. The update mask that applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask. Only the `description`, `allowed_values`, `consent_default_values` and `data_mapping_default_value` fields can be updated. The updated `allowed_values` must contain all values from the previous `allowed_values`."
  ([name AttributeDefinition]
    (projects-locations-datasets-consentStores-attributeDefinitions-patch
      name
      AttributeDefinition
      nil))
  ([name AttributeDefinition optional]
    {:method :patch,
     :uri-template "https://healthcare.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body AttributeDefinition}))

(defn projects-locations-datasets-consentStores-attributeDefinitions-list
  "Lists the Attribute definitions in the specified consent store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/attributeDefinitions/list

parent <> 

optional:
pageSize <integer> Optional. Limit on the number of Attribute definitions to return in a single response. If not specified, 100 is used. May not be larger than 1000.
filter <string> Optional. Restricts the attributes returned to those matching a filter. The only field available for filtering is `category`. For example, `filter=category=\\\"REQUEST\\\"`."
  ([parent]
    (projects-locations-datasets-consentStores-attributeDefinitions-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/attributeDefinitions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-consentStores-consentArtifacts-create
  "Creates a new Consent artifact in the parent consent store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consentArtifacts/create

parent <> 
ConsentArtifact:
ConsentArtifact"
  [parent ConsentArtifact]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/consentArtifacts",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body ConsentArtifact})

(defn projects-locations-datasets-consentStores-consentArtifacts-get
  "Gets the specified Consent artifact.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consentArtifacts/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-consentStores-consentArtifacts-delete
  "Deletes the specified Consent artifact. Fails if the artifact is referenced by the latest revision of any Consent.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consentArtifacts/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-consentStores-consentArtifacts-list
  "Lists the Consent artifacts in the specified consent store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consentArtifacts/list

parent <> 

optional:
pageSize <integer> Optional. Limit on the number of consent artifacts to return in a single response. If not specified, 100 is used. May not be larger than 1000.
filter <string> Optional. Restricts the artifacts returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `\"query text\"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `\"Comment = great\"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. The fields available for filtering are: - user_id. For example, `filter=user_id=\\\"user123\\\"`. - consent_content_version - metadata. For example, `filter=Metadata(\\\"testkey\\\")=\\\"value\\\"` or `filter=HasMetadata(\\\"testkey\\\")`."
  ([parent]
    (projects-locations-datasets-consentStores-consentArtifacts-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/consentArtifacts",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-consentStores-consents-list
  "Lists the Consent in the given consent store, returning each Consent's latest revision.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consents/list

parent <> 

optional:
pageSize <integer> Optional. Limit on the number of Consents to return in a single response. If not specified, 100 is used. May not be larger than 1000.
filter <string> Optional. Restricts the Consents returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `\"query text\"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `\"Comment = great\"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. The fields available for filtering are: - user_id. For example, `filter='user_id=\"user123\"'`. - consent_artifact - state - revision_create_time - metadata. For example, `filter=Metadata(\\\"testkey\\\")=\\\"value\\\"` or `filter=HasMetadata(\\\"testkey\\\")`."
  ([parent]
    (projects-locations-datasets-consentStores-consents-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/consents",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-consentStores-consents-delete
  "Deletes the Consent and its revisions. To keep a record of the Consent but mark it inactive, see [RevokeConsent]. To delete a revision of a Consent, see [DeleteConsentRevision]. This operation does not delete the related Consent artifact.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consents/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-consentStores-consents-activate
  "Activates the latest revision of the specified Consent by committing a new revision with `state` updated to `ACTIVE`. If the latest revision of the specified Consent is in the `ACTIVE` state, no new revision is committed. A FAILED_PRECONDITION error occurs if the latest revision of the specified Consent is in the `REJECTED` or `REVOKED` state.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consents/activate

name <> 
ActivateConsentRequest:
ActivateConsentRequest"
  [name ActivateConsentRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+name}:activate",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body ActivateConsentRequest})

(defn projects-locations-datasets-consentStores-consents-patch
  "Updates the latest revision of the specified Consent by committing a new revision with the changes. A FAILED_PRECONDITION error occurs if the latest revision of the specified Consent is in the `REJECTED` or `REVOKED` state.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consents/patch

name <> 
Consent:
Consent

optional:
updateMask <string> Required. The update mask to apply to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask. Only the `user_id`, `policies`, `consent_artifact`, and `metadata` fields can be updated."
  ([name Consent]
    (projects-locations-datasets-consentStores-consents-patch
      name
      Consent
      nil))
  ([name Consent optional]
    {:method :patch,
     :uri-template "https://healthcare.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body Consent}))

(defn projects-locations-datasets-consentStores-consents-listRevisions
  "Lists the revisions of the specified Consent in reverse chronological order.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consents/listRevisions

name <> 

optional:
pageSize <integer> Optional. Limit on the number of revisions to return in a single response. If not specified, 100 is used. May not be larger than 1000.
filter <string> Optional. Restricts the revisions returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `\"query text\"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `\"Comment = great\"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. Fields available for filtering are: - user_id. For example, `filter='user_id=\"user123\"'`. - consent_artifact - state - revision_create_time - metadata. For example, `filter=Metadata(\\\"testkey\\\")=\\\"value\\\"` or `filter=HasMetadata(\\\"testkey\\\")`."
  ([name]
    (projects-locations-datasets-consentStores-consents-listRevisions
      name
      nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+name}:listRevisions",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-consentStores-consents-create
  "Creates a new Consent in the parent consent store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consents/create

parent <> 
Consent:
Consent"
  [parent Consent]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/consents",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body Consent})

(defn projects-locations-datasets-consentStores-consents-reject
  "Rejects the latest revision of the specified Consent by committing a new revision with `state` updated to `REJECTED`. If the latest revision of the specified Consent is in the `REJECTED` state, no new revision is committed. A FAILED_PRECONDITION error occurs if the latest revision of the specified Consent is in the `ACTIVE` or `REVOKED` state.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consents/reject

name <> 
RejectConsentRequest:
RejectConsentRequest"
  [name RejectConsentRequest]
  {:method :post,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}:reject",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body RejectConsentRequest})

(defn projects-locations-datasets-consentStores-consents-get
  "Gets the specified revision of a Consent, or the latest revision if `revision_id` is not specified in the resource name.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consents/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-consentStores-consents-revoke
  "Revokes the latest revision of the specified Consent by committing a new revision with `state` updated to `REVOKED`. If the latest revision of the specified Consent is in the `REVOKED` state, no new revision is committed. A FAILED_PRECONDITION error occurs if the latest revision of the given consent is in `DRAFT` or `REJECTED` state.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consents/revoke

name <> 
RevokeConsentRequest:
RevokeConsentRequest"
  [name RevokeConsentRequest]
  {:method :post,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}:revoke",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body RevokeConsentRequest})

(defn projects-locations-datasets-consentStores-consents-deleteRevision
  "Deletes the specified revision of a Consent. An INVALID_ARGUMENT error occurs if the specified revision is the latest revision.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/consents/deleteRevision

name <> "
  [name]
  {:method :delete,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+name}:deleteRevision",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-consentStores-userDataMappings-create
  "Creates a new User data mapping in the parent consent store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/userDataMappings/create

parent <> 
UserDataMapping:
UserDataMapping"
  [parent UserDataMapping]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/userDataMappings",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body UserDataMapping})

(defn projects-locations-datasets-consentStores-userDataMappings-get
  "Gets the specified User data mapping.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/userDataMappings/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-consentStores-userDataMappings-delete
  "Deletes the specified User data mapping.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/userDataMappings/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-consentStores-userDataMappings-patch
  "Updates the specified User data mapping.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/userDataMappings/patch

name <> 
UserDataMapping:
UserDataMapping

optional:
updateMask <string> Required. The update mask that applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask. Only the `data_id`, `user_id` and `resource_attributes` fields can be updated."
  ([name UserDataMapping]
    (projects-locations-datasets-consentStores-userDataMappings-patch
      name
      UserDataMapping
      nil))
  ([name UserDataMapping optional]
    {:method :patch,
     :uri-template "https://healthcare.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body UserDataMapping}))

(defn projects-locations-datasets-consentStores-userDataMappings-list
  "Lists the User data mappings in the specified consent store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/userDataMappings/list

parent <> 

optional:
pageSize <integer> Optional. Limit on the number of User data mappings to return in a single response. If not specified, 100 is used. May not be larger than 1000.
filter <string> Optional. Restricts the User data mappings returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `\"query text\"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `\"Comment = great\"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. The fields available for filtering are: - data_id - user_id. For example, `filter=user_id=\\\"user123\\\"`. - archived - archive_time"
  ([parent]
    (projects-locations-datasets-consentStores-userDataMappings-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/userDataMappings",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-consentStores-userDataMappings-archive
  "Archives the specified User data mapping.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/consentStores/userDataMappings/archive

name <> 
ArchiveUserDataMappingRequest:
ArchiveUserDataMappingRequest"
  [name ArchiveUserDataMappingRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+name}:archive",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body ArchiveUserDataMappingRequest})

(defn projects-locations-datasets-dataMapperWorkspaces-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dataMapperWorkspaces/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-datasets-dataMapperWorkspaces-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dataMapperWorkspaces/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-datasets-dataMapperWorkspaces-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-dataMapperWorkspaces-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dataMapperWorkspaces/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-datasets-dicomStores-deidentify
  "De-identifies data from the source store and writes it to the destination store. The metadata field type is OperationMetadata. If the request is successful, the response field type is DeidentifyDicomStoreSummary. If errors occur, error is set. The LRO result may still be successful if de-identification fails for some DICOM instances. The output DICOM store will not contain these failed resources. Failed resource totals are tracked in Operation.metadata. Error details are also logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/deidentify

sourceStore <> 
DeidentifyDicomStoreRequest:
DeidentifyDicomStoreRequest"
  [sourceStore DeidentifyDicomStoreRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+sourceStore}:deidentify",
   :uri-template-args {"sourceStore" sourceStore},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body DeidentifyDicomStoreRequest})

(defn projects-locations-datasets-dicomStores-list
  "Lists the DICOM stores in the given dataset.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/list

parent <> 

optional:
pageSize <integer> Limit on the number of DICOM stores to return in a single response. If not specified, 100 is used. May not be larger than 1000.
filter <string> Restricts stores returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `\"query text\"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `\"Comment = great\"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. Only filtering on labels is supported. For example, `labels.key=value`."
  ([parent] (projects-locations-datasets-dicomStores-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/dicomStores",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-dicomStores-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-datasets-dicomStores-storeInstances
  "StoreInstances stores DICOM instances associated with study instance unique identifiers (SUID). See [Store Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.5). For details on the implementation of StoreInstances, see [Store transaction](https://cloud.google.com/healthcare/docs/dicom#store_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call StoreInstances, see [Store DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#store-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/storeInstances

parent <> 
dicomWebPath <> 
HttpBody:
HttpBody"
  [parent dicomWebPath HttpBody]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body HttpBody})

(defn projects-locations-datasets-dicomStores-searchForInstances
  "SearchForInstances returns a list of matching instances. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the implementation of SearchForInstances, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call SearchForInstances, see [Search for DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#search-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/searchForInstances

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-searchForStudies
  "SearchForStudies returns a list of matching studies. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the implementation of SearchForStudies, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call SearchForStudies, see [Search for DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#search-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/searchForStudies

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-delete
  "Deletes the specified DICOM store and removes all images that are contained within it.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-export
  "Exports data to the specified destination by copying it from the DICOM store. Errors are also logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging). The metadata field type is OperationMetadata.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/export

name <> 
ExportDicomDataRequest:
ExportDicomDataRequest"
  [name ExportDicomDataRequest]
  {:method :post,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}:export",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body ExportDicomDataRequest})

(defn projects-locations-datasets-dicomStores-searchForSeries
  "SearchForSeries returns a list of matching series. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the implementation of SearchForSeries, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call SearchForSeries, see [Search for DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#search-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/searchForSeries

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-import
  "Imports data into the DICOM store by copying it from the specified source. Errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging). The metadata field type is OperationMetadata.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/import

name <> 
ImportDicomDataRequest:
ImportDicomDataRequest"
  [name ImportDicomDataRequest]
  {:method :post,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}:import",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body ImportDicomDataRequest})

(defn projects-locations-datasets-dicomStores-patch
  "Updates the specified DICOM store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/patch

name <> 
DicomStore:
DicomStore

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask"
  ([name DicomStore]
    (projects-locations-datasets-dicomStores-patch
      name
      DicomStore
      nil))
  ([name DicomStore optional]
    {:method :patch,
     :uri-template "https://healthcare.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body DicomStore}))

(defn projects-locations-datasets-dicomStores-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-datasets-dicomStores-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-dicomStores-create
  "Creates a new DICOM store within the parent dataset.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/create

parent <> 
DicomStore:
DicomStore

optional:
dicomStoreId <string> Required. The ID of the DICOM store that is being created. Any string value up to 256 characters in length."
  ([parent DicomStore]
    (projects-locations-datasets-dicomStores-create
      parent
      DicomStore
      nil))
  ([parent DicomStore optional]
    {:method :post,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/dicomStores",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body DicomStore}))

(defn projects-locations-datasets-dicomStores-setBlobStorageSettings
  "SetBlobStorageSettings sets the blob storage settings of the specified resources.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/setBlobStorageSettings

resource <> 
SetBlobStorageSettingsRequest:
SetBlobStorageSettingsRequest"
  [resource SetBlobStorageSettingsRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:setBlobStorageSettings",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetBlobStorageSettingsRequest})

(defn projects-locations-datasets-dicomStores-getDICOMStoreMetrics
  "Gets metrics associated with the DICOM store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/getDICOMStoreMetrics

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+name}:getDICOMStoreMetrics",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-get
  "Gets the specified DICOM store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-datasets-dicomStores-dicomWeb-studies-setBlobStorageSettings
  "SetBlobStorageSettings sets the blob storage settings of the specified resources.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/dicomWeb/studies/setBlobStorageSettings

resource <> 
SetBlobStorageSettingsRequest:
SetBlobStorageSettingsRequest"
  [resource SetBlobStorageSettingsRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:setBlobStorageSettings",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetBlobStorageSettingsRequest})

(defn projects-locations-datasets-dicomStores-dicomWeb-studies-getStudyMetrics
  "GetStudyMetrics returns metrics for a study.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/dicomWeb/studies/getStudyMetrics

study <> "
  [study]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+study}:getStudyMetrics",
   :uri-template-args {"study" study},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-dicomWeb-studies-series-getSeriesMetrics
  "GetSeriesMetrics returns metrics for a series.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/dicomWeb/studies/series/getSeriesMetrics

series <> "
  [series]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+series}:getSeriesMetrics",
   :uri-template-args {"series" series},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-dicomWeb-studies-series-instances-getStorageInfo
  "GetStorageInfo returns the storage info of the specified resource.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/dicomWeb/studies/series/instances/getStorageInfo

resource <> "
  [resource]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:getStorageInfo",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-retrieveStudy
  "RetrieveStudy returns all instances within the given study. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveStudy, see [DICOM study/series/instances](https://cloud.google.com/healthcare/docs/dicom#dicom_studyseriesinstances) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveStudy, see [Retrieve DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieve-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/retrieveStudy

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-retrieveMetadata
  "RetrieveStudyMetadata returns instance associated with the given study presented as metadata with the bulk data removed. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveStudyMetadata, see [Metadata resources](https://cloud.google.com/healthcare/docs/dicom#metadata_resources) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveStudyMetadata, see [Retrieve metadata](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieve-metadata).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/retrieveMetadata

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-searchForSeries
  "SearchForSeries returns a list of matching series. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the implementation of SearchForSeries, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call SearchForSeries, see [Search for DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#search-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/searchForSeries

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-searchForInstances
  "SearchForInstances returns a list of matching instances. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the implementation of SearchForInstances, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call SearchForInstances, see [Search for DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#search-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/searchForInstances

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-delete
  "DeleteStudy deletes all instances within the given study. Delete requests are equivalent to the GET requests specified in the Retrieve transaction. The method returns an Operation which will be marked successful when the deletion is complete. Warning: Instances cannot be inserted into a study that is being deleted by an operation until the operation completes. For samples that show how to call DeleteStudy, see [Delete a study, series, or instance](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#delete-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/delete

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :delete,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-storeInstances
  "StoreInstances stores DICOM instances associated with study instance unique identifiers (SUID). See [Store Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.5). For details on the implementation of StoreInstances, see [Store transaction](https://cloud.google.com/healthcare/docs/dicom#store_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call StoreInstances, see [Store DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#store-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/storeInstances

parent <> 
dicomWebPath <> 
HttpBody:
HttpBody"
  [parent dicomWebPath HttpBody]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body HttpBody})

(defn projects-locations-datasets-dicomStores-studies-series-retrieveSeries
  "RetrieveSeries returns all instances within the given study and series. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveSeries, see [DICOM study/series/instances](https://cloud.google.com/healthcare/docs/dicom#dicom_studyseriesinstances) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveSeries, see [Retrieve DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieve-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/series/retrieveSeries

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-series-retrieveMetadata
  "RetrieveSeriesMetadata returns instance associated with the given study and series, presented as metadata with the bulk data removed. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveSeriesMetadata, see [Metadata resources](https://cloud.google.com/healthcare/docs/dicom#metadata_resources) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveSeriesMetadata, see [Retrieve metadata](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieve-metadata).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/series/retrieveMetadata

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-series-searchForInstances
  "SearchForInstances returns a list of matching instances. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the implementation of SearchForInstances, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call SearchForInstances, see [Search for DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#search-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/series/searchForInstances

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-series-delete
  "DeleteSeries deletes all instances within the given study and series. Delete requests are equivalent to the GET requests specified in the Retrieve transaction. The method returns an Operation which will be marked successful when the deletion is complete. Warning: Instances cannot be inserted into a series that is being deleted by an operation until the operation completes. For samples that show how to call DeleteSeries, see [Delete a study, series, or instance](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#delete-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/series/delete

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :delete,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-series-instances-retrieveInstance
  "RetrieveInstance returns instance associated with the given study, series, and SOP Instance UID. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveInstance, see [DICOM study/series/instances](https://cloud.google.com/healthcare/docs/dicom#dicom_studyseriesinstances) and [DICOM instances](https://cloud.google.com/healthcare/docs/dicom#dicom_instances) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveInstance, see [Retrieve an instance](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieve-instance).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/series/instances/retrieveInstance

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-series-instances-retrieveRendered
  "RetrieveRenderedInstance returns instance associated with the given study, series, and SOP Instance UID in an acceptable Rendered Media Type. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveRenderedInstance, see [Rendered resources](https://cloud.google.com/healthcare/docs/dicom#rendered_resources) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveRenderedInstance, see [Retrieve consumer image formats](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieve-consumer).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/series/instances/retrieveRendered

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-series-instances-retrieveMetadata
  "RetrieveInstanceMetadata returns instance associated with the given study, series, and SOP Instance UID presented as metadata with the bulk data removed. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveInstanceMetadata, see [Metadata resources](https://cloud.google.com/healthcare/docs/dicom#metadata_resources) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveInstanceMetadata, see [Retrieve metadata](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieve-metadata).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/series/instances/retrieveMetadata

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-series-instances-delete
  "DeleteInstance deletes an instance associated with the given study, series, and SOP Instance UID. Delete requests are equivalent to the GET requests specified in the Retrieve transaction. Study and series search results can take a few seconds to be updated after an instance is deleted using DeleteInstance. For samples that show how to call DeleteInstance, see [Delete a study, series, or instance](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#delete-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/series/instances/delete

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :delete,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-series-instances-frames-retrieveFrames
  "RetrieveFrames returns instances associated with the given study, series, SOP Instance UID and frame numbers. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4}. For details on the implementation of RetrieveFrames, see [DICOM frames](https://cloud.google.com/healthcare/docs/dicom#dicom_frames) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveFrames, see [Retrieve DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieve-dicom).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/series/instances/frames/retrieveFrames

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-dicomStores-studies-series-instances-frames-retrieveRendered
  "RetrieveRenderedFrames returns instances associated with the given study, series, SOP Instance UID and frame numbers in an acceptable Rendered Media Type. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveRenderedFrames, see [Rendered resources](https://cloud.google.com/healthcare/docs/dicom#rendered_resources) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveRenderedFrames, see [Retrieve consumer image formats](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieve-consumer).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/dicomStores/studies/series/instances/frames/retrieveRendered

parent <> 
dicomWebPath <> "
  [parent dicomWebPath]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/dicomWeb/{+dicomWebPath}",
   :uri-template-args {"parent" parent, "dicomWebPath" dicomWebPath},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-hl7V2Stores-list
  "Lists the HL7v2 stores in the given dataset.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/list

parent <> 

optional:
pageSize <integer> Limit on the number of HL7v2 stores to return in a single response. If not specified, 100 is used. May not be larger than 1000.
filter <string> Restricts stores returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `\"query text\"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `\"Comment = great\"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. Only filtering on labels is supported. For example, `labels.key=value`."
  ([parent] (projects-locations-datasets-hl7V2Stores-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/hl7V2Stores",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-hl7V2Stores-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-datasets-hl7V2Stores-delete
  "Deletes the specified HL7v2 store and removes all messages that it contains.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-hl7V2Stores-export
  "Exports the messages to a destination. To filter messages to be exported, define a filter using the start and end time, relative to the message generation time (MSH.7). This API returns an Operation that can be used to track the status of the job by calling GetOperation. Immediate fatal errors appear in the error field. Otherwise, when the operation finishes, a detailed response of type ExportMessagesResponse is returned in the response field. The metadata field type for this operation is OperationMetadata.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/export

name <> 
ExportMessagesRequest:
ExportMessagesRequest"
  [name ExportMessagesRequest]
  {:method :post,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}:export",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body ExportMessagesRequest})

(defn projects-locations-datasets-hl7V2Stores-import
  "Import messages to the HL7v2 store by loading data from the specified sources. This method is optimized to load large quantities of data using import semantics that ignore some HL7v2 store configuration options and are not suitable for all use cases. It is primarily intended to load data into an empty HL7v2 store that is not being used by other clients. An existing message will be overwritten if a duplicate message is imported. A duplicate message is a message with the same raw bytes as a message that already exists in this HL7v2 store. When a message is overwritten, its labels will also be overwritten. The import operation is idempotent unless the input data contains multiple valid messages with the same raw bytes but different labels. In that case, after the import completes, the store contains exactly one message with those raw bytes but there is no ordering guarantee on which version of the labels it has. The operation result counters do not count duplicated raw bytes as an error and count one success for each message in the input, which might result in a success count larger than the number of messages in the HL7v2 store. If some messages fail to import, for example due to parsing errors, successfully imported messages are not rolled back. This method returns an Operation that can be used to track the status of the import by calling GetOperation. Immediate fatal errors appear in the error field, errors are also logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). Otherwise, when the operation finishes, a response of type ImportMessagesResponse is returned in the response field. The metadata field type for this operation is OperationMetadata.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/import

name <> 
ImportMessagesRequest:
ImportMessagesRequest"
  [name ImportMessagesRequest]
  {:method :post,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}:import",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body ImportMessagesRequest})

(defn projects-locations-datasets-hl7V2Stores-patch
  "Updates the HL7v2 store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/patch

name <> 
Hl7V2Store:
Hl7V2Store

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask"
  ([name Hl7V2Store]
    (projects-locations-datasets-hl7V2Stores-patch
      name
      Hl7V2Store
      nil))
  ([name Hl7V2Store optional]
    {:method :patch,
     :uri-template "https://healthcare.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body Hl7V2Store}))

(defn projects-locations-datasets-hl7V2Stores-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-datasets-hl7V2Stores-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-hl7V2Stores-create
  "Creates a new HL7v2 store within the parent dataset.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/create

parent <> 
Hl7V2Store:
Hl7V2Store

optional:
hl7V2StoreId <string> Required. The ID of the HL7v2 store that is being created. The string must match the following regex: `[\\p{L}\\p{N}_\\-\\.]{1,256}`."
  ([parent Hl7V2Store]
    (projects-locations-datasets-hl7V2Stores-create
      parent
      Hl7V2Store
      nil))
  ([parent Hl7V2Store optional]
    {:method :post,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/hl7V2Stores",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body Hl7V2Store}))

(defn projects-locations-datasets-hl7V2Stores-rollback
  "Rolls back messages from the HL7v2 store to the specified time. This method returns an Operation that can be used to track the status of the rollback by calling GetOperation. Immediate fatal errors appear in the error field, errors are also logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). Otherwise, when the operation finishes, a detailed response of type RollbackHl7V2MessagesResponse is returned in the response field. The metadata field type for this operation is OperationMetadata.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/rollback

name <> 
RollbackHl7V2MessagesRequest:
RollbackHl7V2MessagesRequest"
  [name RollbackHl7V2MessagesRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+name}:rollback",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body RollbackHl7V2MessagesRequest})

(defn projects-locations-datasets-hl7V2Stores-get
  "Gets the specified HL7v2 store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-hl7V2Stores-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-datasets-hl7V2Stores-getHL7v2StoreMetrics
  "Gets metrics associated with the HL7v2 store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/getHL7v2StoreMetrics

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+name}:getHL7v2StoreMetrics",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-hl7V2Stores-messages-ingest
  "Parses and stores an HL7v2 message. This method triggers an asynchronous notification to any Pub/Sub topic configured in Hl7V2Store.Hl7V2NotificationConfig, if the filtering matches the message. If an MLLP adapter is configured to listen to a Pub/Sub topic, the adapter transmits the message when a notification is received. If the method is successful, it generates a response containing an HL7v2 acknowledgment (`ACK`) message. If the method encounters an error, it returns a negative acknowledgment (`NACK`) message. This behavior is suitable for replying to HL7v2 interface systems that expect these acknowledgments.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/messages/ingest

parent <> 
IngestMessageRequest:
IngestMessageRequest"
  [parent IngestMessageRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/messages:ingest",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body IngestMessageRequest})

(defn projects-locations-datasets-hl7V2Stores-messages-create
  "Parses and stores an HL7v2 message. This method triggers an asynchronous notification to any Pub/Sub topic configured in Hl7V2Store.Hl7V2NotificationConfig, if the filtering matches the message. If an MLLP adapter is configured to listen to a Pub/Sub topic, the adapter transmits the message when a notification is received.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/messages/create

parent <> 
CreateMessageRequest:
CreateMessageRequest"
  [parent CreateMessageRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/messages",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body CreateMessageRequest})

(defn projects-locations-datasets-hl7V2Stores-messages-get
  "Gets an HL7v2 message.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/messages/get

name <> 

optional:
view <string> Specifies which parts of the Message resource to return in the response. When unspecified, equivalent to FULL."
  ([name]
    (projects-locations-datasets-hl7V2Stores-messages-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://healthcare.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-hl7V2Stores-messages-delete
  "Deletes an HL7v2 message.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/messages/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-hl7V2Stores-messages-list
  "Lists all the messages in the given HL7v2 store with support for filtering. Note: HL7v2 messages are indexed asynchronously, so there might be a slight delay between the time a message is created and when it can be found through a filter.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/messages/list

parent <> 

optional:
pageSize <integer> Limit on the number of messages to return in a single response. If not specified, 100 is used. May not be larger than 1000.
filter <string> Restricts messages returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `\"query text\"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `\"Comment = great\"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. Fields/functions available for filtering are: * `message_type`, from the MSH-9.1 field. For example, `NOT message_type = \"ADT\"`. * `send_date` or `sendDate`, the YYYY-MM-DD date the message was sent in the dataset's time_zone, from the MSH-7 segment. For example, `send_date < \"2017-01-02\"`. * `send_time`, the timestamp when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7 segment. For example, `send_time < \"2017-01-02T00:00:00-05:00\"`. * `create_time`, the timestamp when the message was created in the HL7v2 store. Use the RFC3339 time format for comparisons. For example, `create_time < \"2017-01-02T00:00:00-05:00\"`. * `send_facility`, the care center that the message came from, from the MSH-4 segment. For example, `send_facility = \"ABC\"`. * `PatientId(value, type)`, which matches if the message lists a patient having an ID of the given value and type in the PID-2, PID-3, or PID-4 segments. For example, `PatientId(\"123456\", \"MRN\")`. * `labels.x`, a string value of the label with key `x` as set using the Message.labels map. For example, `labels.\"priority\"=\"high\"`. The operator `:*` can be used to assert the existence of a label. For example, `labels.\"priority\":*`.
orderBy <string> Orders messages returned by the specified order_by clause. Syntax: https://cloud.google.com/apis/design/design_patterns#sorting_order Fields available for ordering are: * `send_time`
view <string> Specifies the parts of the Message to return in the response. When unspecified, equivalent to BASIC. Setting this to anything other than BASIC with a `page_size` larger than the default can generate a large response, which impacts the performance of this method."
  ([parent]
    (projects-locations-datasets-hl7V2Stores-messages-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/messages",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-hl7V2Stores-messages-patch
  "Update the message. The contents of the message in Message.data and data extracted from the contents such as Message.create_time cannot be altered. Only the Message.labels field is allowed to be updated. The labels in the request are merged with the existing set of labels. Existing labels with the same keys are updated.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/hl7V2Stores/messages/patch

name <> 
Message:
Message

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask"
  ([name Message]
    (projects-locations-datasets-hl7V2Stores-messages-patch
      name
      Message
      nil))
  ([name Message optional]
    {:method :patch,
     :uri-template "https://healthcare.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body Message}))

(defn projects-locations-datasets-fhirStores-deidentify
  "De-identifies data from the source store and writes it to the destination store. The metadata field type is OperationMetadata. If the request is successful, the response field type is DeidentifyFhirStoreSummary. If errors occur, error is set. Error details are also logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/deidentify

sourceStore <> 
DeidentifyFhirStoreRequest:
DeidentifyFhirStoreRequest"
  [sourceStore DeidentifyFhirStoreRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+sourceStore}:deidentify",
   :uri-template-args {"sourceStore" sourceStore},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body DeidentifyFhirStoreRequest})

(defn projects-locations-datasets-fhirStores-list
  "Lists the FHIR stores in the given dataset.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/list

parent <> 

optional:
pageSize <integer> Limit on the number of FHIR stores to return in a single response. If not specified, 100 is used. May not be larger than 1000.
filter <string> Restricts stores returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `\"query text\"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `\"Comment = great\"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `>`, `>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. Only filtering on labels is supported, for example `labels.key=value`."
  ([parent] (projects-locations-datasets-fhirStores-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/fhirStores",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-fhirStores-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-datasets-fhirStores-delete
  "Deletes the specified FHIR store and removes all resources within it.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-fhirStores-export
  "Export resources from the FHIR store to the specified destination. This method returns an Operation that can be used to track the status of the export by calling GetOperation. Immediate fatal errors appear in the error field, errors are also logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). Otherwise, when the operation finishes, a detailed response of type ExportResourcesResponse is returned in the response field. The metadata field type for this operation is OperationMetadata.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/export

name <> 
ExportResourcesRequest:
ExportResourcesRequest"
  [name ExportResourcesRequest]
  {:method :post,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}:export",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body ExportResourcesRequest})

(defn projects-locations-datasets-fhirStores-import
  "Imports resources to the FHIR store by loading data from the specified sources. This method is optimized to load large quantities of data using import semantics that ignore some FHIR store configuration options and are not suitable for all use cases. It is primarily intended to load data into an empty FHIR store that is not being used by other clients. In cases where this method is not appropriate, consider using ExecuteBundle to load data. Every resource in the input must contain a client-supplied ID. Each resource is stored using the supplied ID regardless of the enable_update_create setting on the FHIR store. It is strongly advised not to include or encode any sensitive data such as patient identifiers in client-specified resource IDs. Those IDs are part of the FHIR resource path recorded in Cloud Audit Logs and Cloud Pub/Sub notifications. Those IDs can also be contained in reference fields within other resources. The import process does not enforce referential integrity, regardless of the disable_referential_integrity setting on the FHIR store. This allows the import of resources with arbitrary interdependencies without considering grouping or ordering, but if the input data contains invalid references or if some resources fail to be imported, the FHIR store might be left in a state that violates referential integrity. The import process does not trigger Pub/Sub notification or BigQuery streaming update, regardless of how those are configured on the FHIR store. If a resource with the specified ID already exists, the most recent version of the resource is overwritten without creating a new historical version, regardless of the disable_resource_versioning setting on the FHIR store. If transient failures occur during the import, it's possible that successfully imported resources will be overwritten more than once. The import operation is idempotent unless the input data contains multiple valid resources with the same ID but different contents. In that case, after the import completes, the store contains exactly one resource with that ID but there is no ordering guarantee on which version of the contents it will have. The operation result counters do not count duplicate IDs as an error and count one success for each resource in the input, which might result in a success count larger than the number of resources in the FHIR store. This often occurs when importing data organized in bundles produced by Patient-everything where each bundle contains its own copy of a resource such as Practitioner that might be referred to by many patients. If some resources fail to import, for example due to parsing errors, successfully imported resources are not rolled back. The location and format of the input data is specified by the parameters in ImportResourcesRequest. Note that if no format is specified, this method assumes the `BUNDLE` format. When using the `BUNDLE` format this method ignores the `Bundle.type` field, except that `history` bundles are rejected, and does not apply any of the bundle processing semantics for batch or transaction bundles. Unlike in ExecuteBundle, transaction bundles are not executed as a single transaction and bundle-internal references are not rewritten. The bundle is treated as a collection of resources to be written as provided in `Bundle.entry.resource`, ignoring `Bundle.entry.request`. As an example, this allows the import of `searchset` bundles produced by a FHIR search or Patient-everything operation. This method returns an Operation that can be used to track the status of the import by calling GetOperation. Immediate fatal errors appear in the error field, errors are also logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). Otherwise, when the operation finishes, a detailed response of type ImportResourcesResponse is returned in the response field. The metadata field type for this operation is OperationMetadata.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/import

name <> 
ImportResourcesRequest:
ImportResourcesRequest"
  [name ImportResourcesRequest]
  {:method :post,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}:import",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body ImportResourcesRequest})

(defn projects-locations-datasets-fhirStores-patch
  "Updates the configuration of the specified FHIR store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/patch

name <> 
FhirStore:
FhirStore

optional:
updateMask <string> Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask"
  ([name FhirStore]
    (projects-locations-datasets-fhirStores-patch name FhirStore nil))
  ([name FhirStore optional]
    {:method :patch,
     :uri-template "https://healthcare.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body FhirStore}))

(defn projects-locations-datasets-fhirStores-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-datasets-fhirStores-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-fhirStores-create
  "Creates a new FHIR store within the parent dataset.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/create

parent <> 
FhirStore:
FhirStore

optional:
fhirStoreId <string> Required. The ID of the FHIR store that is being created. The string must match the following regex: `[\\p{L}\\p{N}_\\-\\.]{1,256}`."
  ([parent FhirStore]
    (projects-locations-datasets-fhirStores-create
      parent
      FhirStore
      nil))
  ([parent FhirStore optional]
    {:method :post,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/fhirStores",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body FhirStore}))

(defn projects-locations-datasets-fhirStores-rollback
  "Rolls back resources from the FHIR store to the specified time. This method returns an Operation that can be used to track the status of the rollback by calling GetOperation. Immediate fatal errors appear in the error field, errors are also logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). Otherwise, when the operation finishes, a detailed response of type RollbackFhirResourcesResponse is returned in the response field. The metadata field type for this operation is OperationMetadata.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/rollback

name <> 
RollbackFhirResourcesRequest:
RollbackFhirResourcesRequest"
  [name RollbackFhirResourcesRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+name}:rollback",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body RollbackFhirResourcesRequest})

(defn projects-locations-datasets-fhirStores-get
  "Gets the configuration of the specified FHIR store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-fhirStores-getFHIRStoreMetrics
  "Gets metrics associated with the FHIR store.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/getFHIRStoreMetrics

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+name}:getFHIRStoreMetrics",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-fhirStores-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-datasets-fhirStores-fhir-capabilities
  "Gets the FHIR capability statement ([STU3](http://hl7.org/implement/standards/fhir/STU3/capabilitystatement.html), [R4](http://hl7.org/implement/standards/fhir/R4/capabilitystatement.html)), or the [conformance statement](http://hl7.org/implement/standards/fhir/DSTU2/conformance.html) in the DSTU2 case for the store, which contains a description of functionality supported by the server. Implements the FHIR standard capabilities interaction ([STU3](http://hl7.org/implement/standards/fhir/STU3/http.html#capabilities), [R4](http://hl7.org/implement/standards/fhir/R4/http.html#capabilities)), or the [conformance interaction](http://hl7.org/implement/standards/fhir/DSTU2/http.html#conformance) in the DSTU2 case. On success, the response body contains a JSON-encoded representation of a `CapabilityStatement` resource.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/capabilities

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+name}/fhir/metadata",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-fhirStores-fhir-vread
  "Gets the contents of a version (current or historical) of a FHIR resource by version ID. Implements the FHIR standard vread interaction ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/http.html#vread), [STU3](http://hl7.org/implement/standards/fhir/STU3/http.html#vread), [R4](http://hl7.org/implement/standards/fhir/R4/http.html#vread)). On success, the response body contains a JSON-encoded representation of the resource. Errors generated by the FHIR store contain a JSON-encoded `OperationOutcome` resource describing the reason for the error. If the request cannot be mapped to a valid API method on a FHIR store, a generic GCP error might be returned instead. For samples that show how to call `vread`, see [Retrieving a FHIR resource version](https://cloud.google.com/healthcare/docs/how-tos/fhir-resources#retrieving_a_fhir_resource_version).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/vread

name <> "
  [name]
  {:method :get,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-fhirStores-fhir-delete
  "Deletes a FHIR resource. Implements the FHIR standard delete interaction ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/http.html#delete), [STU3](http://hl7.org/implement/standards/fhir/STU3/http.html#delete), [R4](http://hl7.org/implement/standards/fhir/R4/http.html#delete)). Note: Unless resource versioning is disabled by setting the disable_resource_versioning flag on the FHIR store, the deleted resources will be moved to a history repository that can still be retrieved through vread and related methods, unless they are removed by the purge method. For samples that show how to call `delete`, see [Deleting a FHIR resource](https://cloud.google.com/healthcare/docs/how-tos/fhir-resources#deleting_a_fhir_resource).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-fhirStores-fhir-executeBundle
  "Executes all the requests in the given Bundle. Implements the FHIR standard batch/transaction interaction ([DSTU2](https://hl7.org/implement/standards/fhir/DSTU2/http.html#transaction), [STU3](https://hl7.org/implement/standards/fhir/STU3/http.html#transaction), [R4](https://hl7.org/implement/standards/fhir/R4/http.html#transaction)). Supports all interactions within a bundle, except search. This method accepts Bundles of type `batch` and `transaction`, processing them according to the batch processing rules ([DSTU2](https://hl7.org/implement/standards/fhir/DSTU2/http.html#2.1.0.16.1), [STU3](https://hl7.org/implement/standards/fhir/STU3/http.html#2.21.0.17.1), [R4](https://hl7.org/implement/standards/fhir/R4/http.html#brules)) and transaction processing rules ([DSTU2](https://hl7.org/implement/standards/fhir/DSTU2/http.html#2.1.0.16.2), [STU3](https://hl7.org/implement/standards/fhir/STU3/http.html#2.21.0.17.2), [R4](https://hl7.org/implement/standards/fhir/R4/http.html#trules)). The request body must contain a JSON-encoded FHIR `Bundle` resource, and the request headers must contain `Content-Type: application/fhir+json`. For a batch bundle or a successful transaction, the response body contains a JSON-encoded representation of a `Bundle` resource of type `batch-response` or `transaction-response` containing one entry for each entry in the request, with the outcome of processing the entry. In the case of an error for a transaction bundle, the response body contains a JSON-encoded `OperationOutcome` resource describing the reason for the error. If the request cannot be mapped to a valid API method on a FHIR store, a generic GCP error might be returned instead. This method checks permissions for each request in the bundle. The `executeBundle` permission is required to call this method, but you must also grant sufficient permissions to execute the individual requests in the bundle. For example, if the bundle contains a request to create a FHIR resource, the caller must also have been granted the `healthcare.fhirResources.create` permission. You can use audit logs to view the permissions for `executeBundle` and each request in the bundle. For more information, see [Viewing Cloud Audit logs](https://cloud.google.com/healthcare-api/docs/how-tos/audit-logging). For samples that show how to call `executeBundle`, see [Managing FHIR resources using FHIR bundles](https://cloud.google.com/healthcare/docs/how-tos/fhir-bundles).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/executeBundle

parent <> 
HttpBody:
HttpBody"
  [parent HttpBody]
  {:method :post,
   :uri-template "https://healthcare.googleapis.com/v1/{+parent}/fhir",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body HttpBody})

(defn projects-locations-datasets-fhirStores-fhir-search-type
  "Searches for resources in the given FHIR store according to criteria specified as query parameters. Implements the FHIR standard search interaction ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/http.html#search), [STU3](http://hl7.org/implement/standards/fhir/STU3/http.html#search), [R4](http://hl7.org/implement/standards/fhir/R4/http.html#search)) using the search semantics described in the FHIR Search specification ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/search.html), [STU3](http://hl7.org/implement/standards/fhir/STU3/search.html), [R4](http://hl7.org/implement/standards/fhir/R4/search.html)). Supports four methods of search defined by the specification: * `GET [base]?[parameters]` to search across all resources. * `GET [base]/[type]?[parameters]` to search resources of a specified type. * `POST [base]/_search?[parameters]` as an alternate form having the same semantics as the `GET` method across all resources. * `POST [base]/[type]/_search?[parameters]` as an alternate form having the same semantics as the `GET` method for the specified type. The `GET` and `POST` methods do not support compartment searches. The `POST` method does not support `application/x-www-form-urlencoded` search parameters. On success, the response body contains a JSON-encoded representation of a `Bundle` resource of type `searchset`, containing the results of the search. Errors generated by the FHIR store contain a JSON-encoded `OperationOutcome` resource describing the reason for the error. If the request cannot be mapped to a valid API method on a FHIR store, a generic GCP error might be returned instead. The server's capability statement, retrieved through capabilities, indicates what search parameters are supported on each FHIR resource. A list of all search parameters defined by the specification can be found in the FHIR Search Parameter Registry ([STU3](http://hl7.org/implement/standards/fhir/STU3/searchparameter-registry.html), [R4](http://hl7.org/implement/standards/fhir/R4/searchparameter-registry.html)). FHIR search parameters for DSTU2 can be found on each resource's definition page. Supported search modifiers: `:missing`, `:exact`, `:contains`, `:text`, `:in`, `:not-in`, `:above`, `:below`, `:[type]`, `:not`, and `recurse` (DSTU2 and STU3) or `:iterate` (R4). Supported search result parameters: `_sort`, `_count`, `_include`, `_revinclude`, `_summary=text`, `_summary=data`, and `_elements`. The maximum number of search results returned defaults to 100, which can be overridden by the `_count` parameter up to a maximum limit of 1000. The server might return fewer resources than requested to prevent excessively large responses. If there are additional results, the returned `Bundle` contains a link of `relation` \"next\", which has a `_page_token` parameter for an opaque pagination token that can be used to retrieve the next page. Resources with a total size larger than 5MB or a field count larger than 50,000 might not be fully searchable as the server might trim its generated search index in those cases. Note: FHIR resources are indexed asynchronously, so there might be a slight delay between the time a resource is created or changed, and the time when the change reflects in search results. The only exception is resource identifier data, which is indexed synchronously as a special index. As a result, searching using resource identifier is not subject to indexing delay. To use the special synchronous index, the search term for identifier should be in the pattern `identifier=[system]|[value]` or `identifier=[value]`, and any of the following search result parameters can be used: * `_count` * `_include` * `_revinclude` * `_summary` * `_elements` If your query contains any other search parameters, the standard asynchronous index will be used instead. Note that searching against the special index is optimized for resolving a small number of matches. The search isn't optimized if your identifier search criteria matches a large number (i.e. more than 2,000) of resources. For a search query that will match a large number of resources, you can avoiding using the special synchronous index by including an additional `_sort` parameter in your query. Use `_sort=-_lastUpdated` if you want to keep the default sorting order. Note: The special synchronous identifier index are currently disabled for DocumentReference and DocumentManifest searches. For samples and detailed information, see [Searching for FHIR resources](https://cloud.google.com/healthcare/docs/how-tos/fhir-search) and [Advanced FHIR search features](https://cloud.google.com/healthcare/docs/how-tos/fhir-advanced-search).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/search-type

parent <> 
resourceType <> 
SearchResourcesRequest:
SearchResourcesRequest"
  [parent resourceType SearchResourcesRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/fhir/{resourceType}/_search",
   :uri-template-args {"parent" parent, "resourceType" resourceType},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SearchResourcesRequest})

(defn projects-locations-datasets-fhirStores-fhir-read
  "Gets the contents of a FHIR resource. Implements the FHIR standard read interaction ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/http.html#read), [STU3](http://hl7.org/implement/standards/fhir/STU3/http.html#read), [R4](http://hl7.org/implement/standards/fhir/R4/http.html#read)). Also supports the FHIR standard conditional read interaction ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/http.html#cread), [STU3](http://hl7.org/implement/standards/fhir/STU3/http.html#cread), [R4](http://hl7.org/implement/standards/fhir/R4/http.html#cread)) specified by supplying an `If-Modified-Since` header with a date/time value or an `If-None-Match` header with an ETag value. On success, the response body contains a JSON-encoded representation of the resource. Errors generated by the FHIR store contain a JSON-encoded `OperationOutcome` resource describing the reason for the error. If the request cannot be mapped to a valid API method on a FHIR store, a generic GCP error might be returned instead. For samples that show how to call `read`, see [Getting a FHIR resource](https://cloud.google.com/healthcare/docs/how-tos/fhir-resources#getting_a_fhir_resource).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/read

name <> "
  [name]
  {:method :get,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-fhirStores-fhir-update
  "Updates the entire contents of a resource. Implements the FHIR standard update interaction ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/http.html#update), [STU3](http://hl7.org/implement/standards/fhir/STU3/http.html#update), [R4](http://hl7.org/implement/standards/fhir/R4/http.html#update)). If the specified resource does not exist and the FHIR store has enable_update_create set, creates the resource with the client-specified ID. It is strongly advised not to include or encode any sensitive data such as patient identifiers in client-specified resource IDs. Those IDs are part of the FHIR resource path recorded in Cloud Audit Logs and Pub/Sub notifications. Those IDs can also be contained in reference fields within other resources. The request body must contain a JSON-encoded FHIR resource, and the request headers must contain `Content-Type: application/fhir+json`. The resource must contain an `id` element having an identical value to the ID in the REST path of the request. On success, the response body contains a JSON-encoded representation of the updated resource, including the server-assigned version ID. Errors generated by the FHIR store contain a JSON-encoded `OperationOutcome` resource describing the reason for the error. If the request cannot be mapped to a valid API method on a FHIR store, a generic GCP error might be returned instead. For samples that show how to call `update`, see [Updating a FHIR resource](https://cloud.google.com/healthcare/docs/how-tos/fhir-resources#updating_a_fhir_resource).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/update

name <> 
HttpBody:
HttpBody"
  [name HttpBody]
  {:method :put,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body HttpBody})

(defn projects-locations-datasets-fhirStores-fhir-Resource-validate
  "Validates an input FHIR resource's conformance to its profiles and the profiles configured on the FHIR store. Implements the FHIR extended operation $validate ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/resource-operations.html#validate), [STU3](http://hl7.org/implement/standards/fhir/STU3/resource-operations.html#validate), or [R4](http://hl7.org/implement/standards/fhir/R4/resource-operation-validate.html)). The request body must contain a JSON-encoded FHIR resource, and the request headers must contain `Content-Type: application/fhir+json`. The `Parameters` input syntax is not supported. The `profile` query parameter can be used to request that the resource only be validated against a specific profile. If a profile with the given URL cannot be found in the FHIR store then an error is returned. Errors generated by validation contain a JSON-encoded `OperationOutcome` resource describing the reason for the error. If the request cannot be mapped to a valid API method on a FHIR store, a generic GCP error might be returned instead.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/Resource-validate

parent <> 
type <> 
HttpBody:
HttpBody

optional:
profile <string> Required. The canonical URL of a profile that this resource should be validated against. For example, to validate a Patient resource against the US Core Patient profile this parameter would be `http://hl7.org/fhir/us/core/StructureDefinition/us-core-patient`. A StructureDefinition with this canonical URL must exist in the FHIR store."
  ([parent type HttpBody]
    (projects-locations-datasets-fhirStores-fhir-Resource-validate
      parent
      type
      HttpBody
      nil))
  ([parent type HttpBody optional]
    {:method :post,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+parent}/fhir/{+type}/$validate",
     :uri-template-args {"parent" parent, "type" type},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body HttpBody}))

(defn projects-locations-datasets-fhirStores-fhir-patch
  "Updates part of an existing resource by applying the operations specified in a [JSON Patch](http://jsonpatch.com/) document. Implements the FHIR standard patch interaction ([STU3](http://hl7.org/implement/standards/fhir/STU3/http.html#patch), [R4](http://hl7.org/implement/standards/fhir/R4/http.html#patch)). DSTU2 doesn't define a patch method, but the server supports it in the same way it supports STU3. The request body must contain a JSON Patch document, and the request headers must contain `Content-Type: application/json-patch+json`. On success, the response body contains a JSON-encoded representation of the updated resource, including the server-assigned version ID. Errors generated by the FHIR store contain a JSON-encoded `OperationOutcome` resource describing the reason for the error. If the request cannot be mapped to a valid API method on a FHIR store, a generic GCP error might be returned instead. For samples that show how to call `patch`, see [Patching a FHIR resource](https://cloud.google.com/healthcare/docs/how-tos/fhir-resources#patching_a_fhir_resource).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/patch

name <> 
HttpBody:
HttpBody"
  [name HttpBody]
  {:method :patch,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body HttpBody})

(defn projects-locations-datasets-fhirStores-fhir-Patient-everything
  "Retrieves a Patient resource and resources related to that patient. Implements the FHIR extended operation Patient-everything ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/patient-operations.html#everything), [STU3](http://hl7.org/implement/standards/fhir/STU3/patient-operations.html#everything), [R4](http://hl7.org/implement/standards/fhir/R4/patient-operations.html#everything)). On success, the response body contains a JSON-encoded representation of a `Bundle` resource of type `searchset`, containing the results of the operation. Errors generated by the FHIR store contain a JSON-encoded `OperationOutcome` resource describing the reason for the error. If the request cannot be mapped to a valid API method on a FHIR store, a generic GCP error might be returned instead. The resources in scope for the response are: * The patient resource itself. * All the resources directly referenced by the patient resource. * Resources directly referencing the patient resource that meet the inclusion criteria. The inclusion criteria are based on the membership rules in the patient compartment definition ([DSTU2](http://hl7.org/fhir/DSTU2/compartment-patient.html), [STU3](http://www.hl7.org/fhir/stu3/compartmentdefinition-patient.html), [R4](http://hl7.org/fhir/R4/compartmentdefinition-patient.html)), which details the eligible resource types and referencing search parameters. For samples that show how to call `Patient-everything`, see [Getting all patient compartment resources](https://cloud.google.com/healthcare/docs/how-tos/fhir-resources#getting_all_patient_compartment_resources).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/Patient-everything

name <> 

optional:
start <string> Optional. The response includes records subsequent to the start date. The date uses the format YYYY-MM-DD. If no start date is provided, all records prior to the end date are in scope.
end <string> Optional. The response includes records prior to the end date. The date uses the format YYYY-MM-DD. If no end date is provided, all records subsequent to the start date are in scope.
_page_token <string> Used to retrieve the next or previous page of results when using pagination. Set `_page_token` to the value of _page_token set in next or previous page links' url. Next and previous page are returned in the response bundle's links field, where `link.relation` is \"previous\" or \"next\". Omit `_page_token` if no previous request has been made.
_count <integer> Optional. Maximum number of resources in a page. If not specified, 100 is used. May not be larger than 1000.
_since <string> Optional. If provided, only resources updated after this time are returned. The time uses the format YYYY-MM-DDThh:mm:ss.sss+zz:zz. For example, `2015-02-07T13:28:17.239+02:00` or `2017-01-01T00:00:00Z`. The time must be specified to the second and include a time zone.
_type <string> Optional. String of comma-delimited FHIR resource types. If provided, only resources of the specified resource type(s) are returned. Specifying multiple `_type` parameters isn't supported. For example, the result of `_type=Observation&_type=Encounter` is undefined. Use `_type=Observation,Encounter` instead."
  ([name]
    (projects-locations-datasets-fhirStores-fhir-Patient-everything
      name
      nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+name}/$everything",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-fhirStores-fhir-Resource-purge
  "Deletes all the historical versions of a resource (excluding the current version) from the FHIR store. To remove all versions of a resource, first delete the current version and then call this method. This is not a FHIR standard operation. For samples that show how to call `Resource-purge`, see [Deleting historical versions of a FHIR resource](https://cloud.google.com/healthcare/docs/how-tos/fhir-resources#deleting_historical_versions_of_a_fhir_resource).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/Resource-purge

name <> "
  [name]
  {:method :delete,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}/$purge",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-fhirStores-fhir-history
  "Lists all the versions of a resource (including the current version and deleted versions) from the FHIR store. Implements the per-resource form of the FHIR standard history interaction ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/http.html#history), [STU3](http://hl7.org/implement/standards/fhir/STU3/http.html#history), [R4](http://hl7.org/implement/standards/fhir/R4/http.html#history)). On success, the response body contains a JSON-encoded representation of a `Bundle` resource of type `history`, containing the version history sorted from most recent to oldest versions. Errors generated by the FHIR store contain a JSON-encoded `OperationOutcome` resource describing the reason for the error. If the request cannot be mapped to a valid API method on a FHIR store, a generic GCP error might be returned instead. For samples that show how to call `history`, see [Listing FHIR resource versions](https://cloud.google.com/healthcare/docs/how-tos/fhir-resources#listing_fhir_resource_versions).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/history

name <> 

optional:
_count <integer> The maximum number of search results on a page. If not specified, 100 is used. May not be larger than 1000.
_since <string> Only include resource versions that were created at or after the given instant in time. The instant in time uses the format YYYY-MM-DDThh:mm:ss.sss+zz:zz (for example 2015-02-07T13:28:17.239+02:00 or 2017-01-01T00:00:00Z). The time must be specified to the second and include a time zone.
_at <string> Only include resource versions that were current at some point during the time period specified in the date time value. The date parameter format is yyyy-mm-ddThh:mm:ss[Z|(+|-)hh:mm] Clients may specify any of the following: * An entire year: `_at=2019` * An entire month: `_at=2019-01` * A specific day: `_at=2019-01-20` * A specific second: `_at=2018-12-31T23:59:58Z`
_page_token <string> Used to retrieve the first, previous, next, or last page of resource versions when using pagination. Value should be set to the value of `_page_token` set in next or previous page links' URLs. Next and previous page are returned in the response bundle's links field, where `link.relation` is \"previous\" or \"next\". Omit `_page_token` if no previous request has been made."
  ([name]
    (projects-locations-datasets-fhirStores-fhir-history name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+name}/_history",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-fhirStores-fhir-conditionalPatch
  "If a resource is found with the identifier specified in the query parameters, updates part of that resource by applying the operations specified in a [JSON Patch](http://jsonpatch.com/) document. Implements the FHIR standard conditional patch interaction, limited to searching by resource identifier. DSTU2 doesn't define a conditional patch method, but the server supports it in the same way it supports STU3. Search term for identifier should be in the pattern `identifier=system|value` or `identifier=value` - similar to the `search` method on resources with a specific identifier. If the search criteria identify more than one match, the request returns a `412 Precondition Failed` error. The request body must contain a JSON Patch document, and the request headers must contain `Content-Type: application/json-patch+json`. On success, the response body contains a JSON-encoded representation of the updated resource, including the server-assigned version ID. Errors generated by the FHIR store contain a JSON-encoded `OperationOutcome` resource describing the reason for the error. If the request cannot be mapped to a valid API method on a FHIR store, a generic GCP error might be returned instead. For samples that show how to call `conditionalPatch`, see [Conditionally patching a FHIR resource](https://cloud.google.com/healthcare/docs/how-tos/fhir-resources#conditionally_patching_a_fhir_resource).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/conditionalPatch

parent <> 
type <> 
HttpBody:
HttpBody"
  [parent type HttpBody]
  {:method :patch,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/fhir/{+type}",
   :uri-template-args {"parent" parent, "type" type},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body HttpBody})

(defn projects-locations-datasets-fhirStores-fhir-create
  "Creates a FHIR resource. Implements the FHIR standard create interaction ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/http.html#create), [STU3](http://hl7.org/implement/standards/fhir/STU3/http.html#create), [R4](http://hl7.org/implement/standards/fhir/R4/http.html#create)), which creates a new resource with a server-assigned resource ID. Also supports the FHIR standard conditional create interaction ([DSTU2](https://hl7.org/implement/standards/fhir/DSTU2/http.html#ccreate), [STU3](https://hl7.org/implement/standards/fhir/STU3/http.html#ccreate), [R4](https://hl7.org/implement/standards/fhir/R4/http.html#ccreate)), specified by supplying an `If-None-Exist` header containing a FHIR search query, limited to searching by resource identifier. If no resources match this search query, the server processes the create operation as normal. When using conditional create, the search term for identifier should be in the pattern `identifier=system|value` or `identifier=value` - similar to the `search` method on resources with a specific identifier. The request body must contain a JSON-encoded FHIR resource, and the request headers must contain `Content-Type: application/fhir+json`. On success, the response body contains a JSON-encoded representation of the resource as it was created on the server, including the server-assigned resource ID and version ID. Errors generated by the FHIR store contain a JSON-encoded `OperationOutcome` resource describing the reason for the error. If the request cannot be mapped to a valid API method on a FHIR store, a generic GCP error might be returned instead. For samples that show how to call `create`, see [Creating a FHIR resource](https://cloud.google.com/healthcare/docs/how-tos/fhir-resources#creating_a_fhir_resource).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/create

parent <> 
type <> 
HttpBody:
HttpBody"
  [parent type HttpBody]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/fhir/{+type}",
   :uri-template-args {"parent" parent, "type" type},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body HttpBody})

(defn projects-locations-datasets-fhirStores-fhir-conditionalDelete
  "Deletes a FHIR resource that match an identifier search query. Implements the FHIR standard conditional delete interaction, limited to searching by resource identifier. If multiple resources match, 412 Precondition Failed error will be returned. Search term for identifier should be in the pattern `identifier=system|value` or `identifier=value` - similar to the `search` method on resources with a specific identifier. Note: Unless resource versioning is disabled by setting the disable_resource_versioning flag on the FHIR store, the deleted resource is moved to a history repository that can still be retrieved through vread and related methods, unless they are removed by the purge method. For samples that show how to call `conditionalDelete`, see [Conditionally deleting a FHIR resource](https://cloud.google.com/healthcare/docs/how-tos/fhir-resources#conditionally_deleting_a_fhir_resource).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/conditionalDelete

parent <> 
type <> "
  [parent type]
  {:method :delete,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/fhir/{+type}",
   :uri-template-args {"parent" parent, "type" type},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-fhirStores-fhir-conditionalUpdate
  "If a resource is found with the identifier specified in the query parameters, updates the entire contents of that resource. Implements the FHIR standard conditional update interaction, limited to searching by resource identifier. Search term for identifier should be in the pattern `identifier=system|value` or `identifier=value` - similar to the `search` method on resources with a specific identifier. If the search criteria identify more than one match, the request returns a `412 Precondition Failed` error. If the search criteria identify zero matches, and the supplied resource body contains an `id`, and the FHIR store has enable_update_create set, creates the resource with the client-specified ID. It is strongly advised not to include or encode any sensitive data such as patient identifiers in client-specified resource IDs. Those IDs are part of the FHIR resource path recorded in Cloud Audit Logs and Pub/Sub notifications. Those IDs can also be contained in reference fields within other resources. If the search criteria identify zero matches, and the supplied resource body does not contain an `id`, the resource is created with a server-assigned ID as per the create method. The request body must contain a JSON-encoded FHIR resource, and the request headers must contain `Content-Type: application/fhir+json`. On success, the response body contains a JSON-encoded representation of the updated resource, including the server-assigned version ID. Errors generated by the FHIR store contain a JSON-encoded `OperationOutcome` resource describing the reason for the error. If the request cannot be mapped to a valid API method on a FHIR store, a generic GCP error might be returned instead. For samples that show how to call `conditionalUpdate`, see [Conditionally updating a FHIR resource](https://cloud.google.com/healthcare/docs/how-tos/fhir-resources#conditionally_updating_a_fhir_resource).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/conditionalUpdate

parent <> 
type <> 
HttpBody:
HttpBody"
  [parent type HttpBody]
  {:method :put,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/fhir/{+type}",
   :uri-template-args {"parent" parent, "type" type},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body HttpBody})

(defn projects-locations-datasets-fhirStores-fhir-search
  "Searches for resources in the given FHIR store according to criteria specified as query parameters. Implements the FHIR standard search interaction ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/http.html#search), [STU3](http://hl7.org/implement/standards/fhir/STU3/http.html#search), [R4](http://hl7.org/implement/standards/fhir/R4/http.html#search)) using the search semantics described in the FHIR Search specification ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/search.html), [STU3](http://hl7.org/implement/standards/fhir/STU3/search.html), [R4](http://hl7.org/implement/standards/fhir/R4/search.html)). Supports four methods of search defined by the specification: * `GET [base]?[parameters]` to search across all resources. * `GET [base]/[type]?[parameters]` to search resources of a specified type. * `POST [base]/_search?[parameters]` as an alternate form having the same semantics as the `GET` method across all resources. * `POST [base]/[type]/_search?[parameters]` as an alternate form having the same semantics as the `GET` method for the specified type. The `GET` and `POST` methods do not support compartment searches. The `POST` method does not support `application/x-www-form-urlencoded` search parameters. On success, the response body contains a JSON-encoded representation of a `Bundle` resource of type `searchset`, containing the results of the search. Errors generated by the FHIR store contain a JSON-encoded `OperationOutcome` resource describing the reason for the error. If the request cannot be mapped to a valid API method on a FHIR store, a generic GCP error might be returned instead. The server's capability statement, retrieved through capabilities, indicates what search parameters are supported on each FHIR resource. A list of all search parameters defined by the specification can be found in the FHIR Search Parameter Registry ([STU3](http://hl7.org/implement/standards/fhir/STU3/searchparameter-registry.html), [R4](http://hl7.org/implement/standards/fhir/R4/searchparameter-registry.html)). FHIR search parameters for DSTU2 can be found on each resource's definition page. Supported search modifiers: `:missing`, `:exact`, `:contains`, `:text`, `:in`, `:not-in`, `:above`, `:below`, `:[type]`, `:not`, and `recurse` (DSTU2 and STU3) or `:iterate` (R4). Supported search result parameters: `_sort`, `_count`, `_include`, `_revinclude`, `_summary=text`, `_summary=data`, and `_elements`. The maximum number of search results returned defaults to 100, which can be overridden by the `_count` parameter up to a maximum limit of 1000. The server might return fewer resources than requested to prevent excessively large responses. If there are additional results, the returned `Bundle` contains a link of `relation` \"next\", which has a `_page_token` parameter for an opaque pagination token that can be used to retrieve the next page. Resources with a total size larger than 5MB or a field count larger than 50,000 might not be fully searchable as the server might trim its generated search index in those cases. Note: FHIR resources are indexed asynchronously, so there might be a slight delay between the time a resource is created or changed, and the time when the change reflects in search results. The only exception is resource identifier data, which is indexed synchronously as a special index. As a result, searching using resource identifier is not subject to indexing delay. To use the special synchronous index, the search term for identifier should be in the pattern `identifier=[system]|[value]` or `identifier=[value]`, and any of the following search result parameters can be used: * `_count` * `_include` * `_revinclude` * `_summary` * `_elements` If your query contains any other search parameters, the standard asynchronous index will be used instead. Note that searching against the special index is optimized for resolving a small number of matches. The search isn't optimized if your identifier search criteria matches a large number (i.e. more than 2,000) of resources. For a search query that will match a large number of resources, you can avoiding using the special synchronous index by including an additional `_sort` parameter in your query. Use `_sort=-_lastUpdated` if you want to keep the default sorting order. Note: The special synchronous identifier index are currently disabled for DocumentReference and DocumentManifest searches. For samples and detailed information, see [Searching for FHIR resources](https://cloud.google.com/healthcare/docs/how-tos/fhir-search) and [Advanced FHIR search features](https://cloud.google.com/healthcare/docs/how-tos/fhir-advanced-search).
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/fhirStores/fhir/search

parent <> 
SearchResourcesRequest:
SearchResourcesRequest"
  [parent SearchResourcesRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+parent}/fhir/_search",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SearchResourcesRequest})

(defn projects-locations-datasets-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-datasets-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://healthcare.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-healthcare"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-datasets-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-datasets-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/datasets/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template "https://healthcare.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body CancelOperationRequest})

(defn projects-locations-services-nlp-analyzeEntities
  "Analyze heathcare entity in a document. Its response includes the recognized entity mentions and the relationships between them. AnalyzeEntities uses context aware models to detect entities.
https://cloud.google.com/healthcare/v1/reference/rest/v1/projects/locations/services/nlp/analyzeEntities

nlpService <> 
AnalyzeEntitiesRequest:
AnalyzeEntitiesRequest"
  [nlpService AnalyzeEntitiesRequest]
  {:method :post,
   :uri-template
   "https://healthcare.googleapis.com/v1/{+nlpService}:analyzeEntities",
   :uri-template-args {"nlpService" nlpService},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-healthcare"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body AnalyzeEntitiesRequest})
