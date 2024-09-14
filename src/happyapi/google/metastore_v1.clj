(ns happyapi.google.metastore-v1
  "Dataproc Metastore API
The Dataproc Metastore API is used to manage the lifecycle and configuration of metastore services.
See: https://cloud.google.com/dataproc-metastore/docs")

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like \"displayName=tokyo\", and is documented in more detail in AIP-160 (https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://metastore.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://metastore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns UNIMPLEMENTED.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://metastore.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://metastore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns google.rpc.Code.UNIMPLEMENTED.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://metastore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns google.rpc.Code.UNIMPLEMENTED. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to Code.CANCELLED.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template "https://metastore.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CancelOperationRequest})

(defn projects-locations-federations-list
  "Lists federations in a project and location.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/federations/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of federations to return. The response may contain less than the maximum number. If unspecified, no more than 500 services are returned. The maximum value is 1000; values above 1000 are changed to 1000.
filter <string> Optional. The filter to apply to list results.
orderBy <string> Optional. Specify the ordering of results as described in Sorting Order (https://cloud.google.com/apis/design/design_patterns#sorting_order). If not specified, the results will be sorted in the default order."
  ([parent] (projects-locations-federations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://metastore.googleapis.com/v1/{+parent}/federations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-federations-get
  "Gets the details of a single federation.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/federations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://metastore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-federations-create
  "Creates a metastore federation in a project and location.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/federations/create

parent <> 
Federation:
Federation

optional:
federationId <string> Required. The ID of the metastore federation, which is used as the final component of the metastore federation's name.This value must be between 2 and 63 characters long inclusive, begin with a letter, end with a letter or number, and consist of alpha-numeric ASCII characters or hyphens.
requestId <string> Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported."
  ([parent Federation]
    (projects-locations-federations-create parent Federation nil))
  ([parent Federation optional]
    {:method :post,
     :uri-template
     "https://metastore.googleapis.com/v1/{+parent}/federations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Federation}))

(defn projects-locations-federations-patch
  "Updates the fields of a federation.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/federations/patch

name <> 
Federation:
Federation

optional:
updateMask <string> Required. A field mask used to specify the fields to be overwritten in the metastore federation resource by the update. Fields specified in the update_mask are relative to the resource (not to the full request). A field is overwritten if it is in the mask.
requestId <string> Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported."
  ([name Federation]
    (projects-locations-federations-patch name Federation nil))
  ([name Federation optional]
    {:method :patch,
     :uri-template "https://metastore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Federation}))

(defn projects-locations-federations-delete
  "Deletes a single federation.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/federations/delete

name <> 

optional:
requestId <string> Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported."
  ([name] (projects-locations-federations-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://metastore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-federations-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/federations/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-federations-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/federations/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy.Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset.The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1.To learn which resources support conditions in their IAM policies, see the IAM documentation (https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-federations-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://metastore.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-federations-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/federations/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-services-startMigration
  "Starts the Managed Migration process.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/startMigration

service <> 
StartMigrationRequest:
StartMigrationRequest"
  [service StartMigrationRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+service}:startMigration",
   :uri-template-args {"service" service},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body StartMigrationRequest})

(defn projects-locations-services-list
  "Lists services in a project and location.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of services to return. The response may contain less than the maximum number. If unspecified, no more than 500 services are returned. The maximum value is 1000; values above 1000 are changed to 1000.
filter <string> Optional. The filter to apply to list results.
orderBy <string> Optional. Specify the ordering of results as described in Sorting Order (https://cloud.google.com/apis/design/design_patterns#sorting_order). If not specified, the results will be sorted in the default order."
  ([parent] (projects-locations-services-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://metastore.googleapis.com/v1/{+parent}/services",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-services-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-services-delete
  "Deletes a single service.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/delete

name <> 

optional:
requestId <string> Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported."
  ([name] (projects-locations-services-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://metastore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-services-completeMigration
  "Completes the managed migration process. The Dataproc Metastore service will switch to using its own backend database after successful migration.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/completeMigration

service <> 
CompleteMigrationRequest:
CompleteMigrationRequest"
  [service CompleteMigrationRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+service}:completeMigration",
   :uri-template-args {"service" service},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CompleteMigrationRequest})

(defn projects-locations-services-moveTableToDatabase
  "Move a table to another database.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/moveTableToDatabase

service <> 
MoveTableToDatabaseRequest:
MoveTableToDatabaseRequest"
  [service MoveTableToDatabaseRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+service}:moveTableToDatabase",
   :uri-template-args {"service" service},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body MoveTableToDatabaseRequest})

(defn projects-locations-services-queryMetadata
  "Query Dataproc Metastore metadata.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/queryMetadata

service <> 
QueryMetadataRequest:
QueryMetadataRequest"
  [service QueryMetadataRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+service}:queryMetadata",
   :uri-template-args {"service" service},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body QueryMetadataRequest})

(defn projects-locations-services-alterTableProperties
  "Alter metadata table properties.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/alterTableProperties

service <> 
AlterTablePropertiesRequest:
AlterTablePropertiesRequest"
  [service AlterTablePropertiesRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+service}:alterTableProperties",
   :uri-template-args {"service" service},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body AlterTablePropertiesRequest})

(defn projects-locations-services-cancelMigration
  "Cancels the ongoing Managed Migration process.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/cancelMigration

service <> 
CancelMigrationRequest:
CancelMigrationRequest"
  [service CancelMigrationRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+service}:cancelMigration",
   :uri-template-args {"service" service},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CancelMigrationRequest})

(defn projects-locations-services-alterLocation
  "Alter metadata resource location. The metadata resource can be a database, table, or partition. This functionality only updates the parent directory for the respective metadata resource and does not transfer any existing data to the new location.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/alterLocation

service <> 
AlterMetadataResourceLocationRequest:
AlterMetadataResourceLocationRequest"
  [service AlterMetadataResourceLocationRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+service}:alterLocation",
   :uri-template-args {"service" service},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body AlterMetadataResourceLocationRequest})

(defn projects-locations-services-patch
  "Updates the parameters of a single service.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/patch

name <> 
Service:
Service

optional:
updateMask <string> Required. A field mask used to specify the fields to be overwritten in the metastore service resource by the update. Fields specified in the update_mask are relative to the resource (not to the full request). A field is overwritten if it is in the mask.
requestId <string> Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported."
  ([name Service] (projects-locations-services-patch name Service nil))
  ([name Service optional]
    {:method :patch,
     :uri-template "https://metastore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Service}))

(defn projects-locations-services-exportMetadata
  "Exports metadata from a service.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/exportMetadata

service <> 
ExportMetadataRequest:
ExportMetadataRequest"
  [service ExportMetadataRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+service}:exportMetadata",
   :uri-template-args {"service" service},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ExportMetadataRequest})

(defn projects-locations-services-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy.Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset.The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1.To learn which resources support conditions in their IAM policies, see the IAM documentation (https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-services-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://metastore.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-services-create
  "Creates a metastore service in a project and location.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/create

parent <> 
Service:
Service

optional:
serviceId <string> Required. The ID of the metastore service, which is used as the final component of the metastore service's name.This value must be between 2 and 63 characters long inclusive, begin with a letter, end with a letter or number, and consist of alpha-numeric ASCII characters or hyphens.
requestId <string> Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported."
  ([parent Service]
    (projects-locations-services-create parent Service nil))
  ([parent Service optional]
    {:method :post,
     :uri-template
     "https://metastore.googleapis.com/v1/{+parent}/services",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Service}))

(defn projects-locations-services-restore
  "Restores a service from a backup.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/restore

service <> 
RestoreServiceRequest:
RestoreServiceRequest"
  [service RestoreServiceRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+service}:restore",
   :uri-template-args {"service" service},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RestoreServiceRequest})

(defn projects-locations-services-get
  "Gets the details of a single service.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://metastore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-services-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-services-metadataImports-list
  "Lists imports in a service.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/metadataImports/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of imports to return. The response may contain less than the maximum number. If unspecified, no more than 500 imports are returned. The maximum value is 1000; values above 1000 are changed to 1000.
filter <string> Optional. The filter to apply to list results.
orderBy <string> Optional. Specify the ordering of results as described in Sorting Order (https://cloud.google.com/apis/design/design_patterns#sorting_order). If not specified, the results will be sorted in the default order."
  ([parent]
    (projects-locations-services-metadataImports-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://metastore.googleapis.com/v1/{+parent}/metadataImports",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-services-metadataImports-get
  "Gets details of a single import.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/metadataImports/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://metastore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-services-metadataImports-create
  "Creates a new MetadataImport in a given project and location.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/metadataImports/create

parent <> 
MetadataImport:
MetadataImport

optional:
metadataImportId <string> Required. The ID of the metadata import, which is used as the final component of the metadata import's name.This value must be between 1 and 64 characters long, begin with a letter, end with a letter or number, and consist of alpha-numeric ASCII characters or hyphens.
requestId <string> Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported."
  ([parent MetadataImport]
    (projects-locations-services-metadataImports-create
      parent
      MetadataImport
      nil))
  ([parent MetadataImport optional]
    {:method :post,
     :uri-template
     "https://metastore.googleapis.com/v1/{+parent}/metadataImports",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body MetadataImport}))

(defn projects-locations-services-metadataImports-patch
  "Updates a single import. Only the description field of MetadataImport is supported to be updated.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/metadataImports/patch

name <> 
MetadataImport:
MetadataImport

optional:
updateMask <string> Required. A field mask used to specify the fields to be overwritten in the metadata import resource by the update. Fields specified in the update_mask are relative to the resource (not to the full request). A field is overwritten if it is in the mask.
requestId <string> Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported."
  ([name MetadataImport]
    (projects-locations-services-metadataImports-patch
      name
      MetadataImport
      nil))
  ([name MetadataImport optional]
    {:method :patch,
     :uri-template "https://metastore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body MetadataImport}))

(defn projects-locations-services-backups-list
  "Lists backups in a service.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/backups/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of backups to return. The response may contain less than the maximum number. If unspecified, no more than 500 backups are returned. The maximum value is 1000; values above 1000 are changed to 1000.
filter <string> Optional. The filter to apply to list results.
orderBy <string> Optional. Specify the ordering of results as described in Sorting Order (https://cloud.google.com/apis/design/design_patterns#sorting_order). If not specified, the results will be sorted in the default order."
  ([parent] (projects-locations-services-backups-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://metastore.googleapis.com/v1/{+parent}/backups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-services-backups-get
  "Gets details of a single backup.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/backups/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://metastore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-services-backups-create
  "Creates a new backup in a given project and location.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/backups/create

parent <> 
Backup:
Backup

optional:
backupId <string> Required. The ID of the backup, which is used as the final component of the backup's name.This value must be between 1 and 64 characters long, begin with a letter, end with a letter or number, and consist of alpha-numeric ASCII characters or hyphens.
requestId <string> Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported."
  ([parent Backup]
    (projects-locations-services-backups-create parent Backup nil))
  ([parent Backup optional]
    {:method :post,
     :uri-template
     "https://metastore.googleapis.com/v1/{+parent}/backups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Backup}))

(defn projects-locations-services-backups-delete
  "Deletes a single backup.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/backups/delete

name <> 

optional:
requestId <string> Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported."
  ([name] (projects-locations-services-backups-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://metastore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-services-backups-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/backups/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-services-backups-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/backups/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy.Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset.The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1.To learn which resources support conditions in their IAM policies, see the IAM documentation (https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-services-backups-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://metastore.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-services-migrationExecutions-get
  "Gets details of a single migration execution.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/migrationExecutions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://metastore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-services-migrationExecutions-list
  "Lists migration executions on a service.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/migrationExecutions/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of migration executions to return. The response may contain less than the maximum number. If unspecified, no more than 500 migration executions are returned. The maximum value is 1000; values above 1000 are changed to 1000.
filter <string> Optional. The filter to apply to list results.
orderBy <string> Optional. Specify the ordering of results as described in Sorting Order (https://cloud.google.com/apis/design/design_patterns#sorting_order). If not specified, the results will be sorted in the default order."
  ([parent]
    (projects-locations-services-migrationExecutions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://metastore.googleapis.com/v1/{+parent}/migrationExecutions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-services-migrationExecutions-delete
  "Deletes a single migration execution.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/migrationExecutions/delete

name <> 

optional:
requestId <string> Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported."
  ([name]
    (projects-locations-services-migrationExecutions-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://metastore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-services-databases-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/databases/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-services-databases-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/databases/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy.Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset.The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1.To learn which resources support conditions in their IAM policies, see the IAM documentation (https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-services-databases-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://metastore.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-services-databases-tables-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/databases/tables/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://metastore.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-services-databases-tables-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/dataproc-metastore/docs/v1/reference/rest/v1/projects/locations/services/databases/tables/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy.Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset.The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1.To learn which resources support conditions in their IAM policies, see the IAM documentation (https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-services-databases-tables-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://metastore.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
