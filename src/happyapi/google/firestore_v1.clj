(ns happyapi.google.firestore-v1
  "Cloud Firestore API
Accesses the NoSQL document database built for automatic scaling, high performance, and ease of application development. 
See: https://cloud.google.com/firestore")

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://firestore.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://firestore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"]})

(defn projects-locations-backups-get
  "Gets information about a backup.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/locations/backups/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://firestore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"]})

(defn projects-locations-backups-list
  "Lists all the backups.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/locations/backups/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://firestore.googleapis.com/v1/{+parent}/backups",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"]})

(defn projects-locations-backups-delete
  "Deletes a backup.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/locations/backups/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://firestore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"]})

(defn projects-databases-importDocuments
  "Imports documents into Google Cloud Firestore. Existing documents with the same name are overwritten. The import occurs in the background and its progress can be monitored and managed via the Operation resource that is created. If an ImportDocuments operation is cancelled, it is possible that a subset of the data has already been imported to Cloud Firestore.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/importDocuments

name <> 
GoogleFirestoreAdminV1ImportDocumentsRequest:
GoogleFirestoreAdminV1ImportDocumentsRequest"
  [name GoogleFirestoreAdminV1ImportDocumentsRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+name}:importDocuments",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body GoogleFirestoreAdminV1ImportDocumentsRequest})

(defn projects-databases-exportDocuments
  "Exports a copy of all or a subset of documents from Google Cloud Firestore to another storage system, such as Google Cloud Storage. Recent updates to documents may not be reflected in the export. The export occurs in the background and its progress can be monitored and managed via the Operation resource that is created. The output of an export may only be used once the associated operation is done. If an export operation is cancelled before completion it may leave partial data behind in Google Cloud Storage. For more details on export behavior and output format, refer to: https://cloud.google.com/firestore/docs/manage-data/export-import
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/exportDocuments

name <> 
GoogleFirestoreAdminV1ExportDocumentsRequest:
GoogleFirestoreAdminV1ExportDocumentsRequest"
  [name GoogleFirestoreAdminV1ExportDocumentsRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+name}:exportDocuments",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body GoogleFirestoreAdminV1ExportDocumentsRequest})

(defn projects-databases-list
  "List all the databases in the project.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/list

parent <> 

optional:
showDeleted <boolean> If true, also returns deleted resources."
  ([parent] (projects-databases-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://firestore.googleapis.com/v1/{+parent}/databases",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"]}))

(defn projects-databases-delete
  "Deletes a database.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/delete

name <> 

optional:
etag <string> The current etag of the Database. If an etag is provided and does not match the current etag of the database, deletion will be blocked and a FAILED_PRECONDITION error will be returned."
  ([name] (projects-databases-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://firestore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"]}))

(defn projects-databases-patch
  "Updates a database.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/patch

name <> 
GoogleFirestoreAdminV1Database:
GoogleFirestoreAdminV1Database

optional:
updateMask <string> The list of fields to be updated."
  ([name GoogleFirestoreAdminV1Database]
    (projects-databases-patch name GoogleFirestoreAdminV1Database nil))
  ([name GoogleFirestoreAdminV1Database optional]
    {:method :patch,
     :uri-template "https://firestore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"],
     :body GoogleFirestoreAdminV1Database}))

(defn projects-databases-bulkDeleteDocuments
  "Bulk deletes a subset of documents from Google Cloud Firestore. Documents created or updated after the underlying system starts to process the request will not be deleted. The bulk delete occurs in the background and its progress can be monitored and managed via the Operation resource that is created. For more details on bulk delete behavior, refer to: https://cloud.google.com/firestore/docs/manage-data/bulk-delete
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/bulkDeleteDocuments

name <> 
GoogleFirestoreAdminV1BulkDeleteDocumentsRequest:
GoogleFirestoreAdminV1BulkDeleteDocumentsRequest"
  [name GoogleFirestoreAdminV1BulkDeleteDocumentsRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+name}:bulkDeleteDocuments",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body GoogleFirestoreAdminV1BulkDeleteDocumentsRequest})

(defn projects-databases-create
  "Create a database.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/create

parent <> 
GoogleFirestoreAdminV1Database:
GoogleFirestoreAdminV1Database

optional:
databaseId <string> Required. The ID to use for the database, which will become the final component of the database's resource name. This value should be 4-63 characters. Valid characters are /a-z-/ with first character a letter and the last a letter or a number. Must not be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/. \"(default)\" database ID is also valid."
  ([parent GoogleFirestoreAdminV1Database]
    (projects-databases-create
      parent
      GoogleFirestoreAdminV1Database
      nil))
  ([parent GoogleFirestoreAdminV1Database optional]
    {:method :post,
     :uri-template
     "https://firestore.googleapis.com/v1/{+parent}/databases",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"],
     :body GoogleFirestoreAdminV1Database}))

(defn projects-databases-restore
  "Creates a new database by restoring from an existing backup. The new database must be in the same cloud region or multi-region location as the existing backup. This behaves similar to FirestoreAdmin.CreateDatabase except instead of creating a new empty database, a new database is created with the database type, index configuration, and documents from an existing backup. The long-running operation can be used to track the progress of the restore, with the Operation's metadata field type being the RestoreDatabaseMetadata. The response type is the Database if the restore was successful. The new database is not readable or writeable until the LRO has completed.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/restore

parent <> 
GoogleFirestoreAdminV1RestoreDatabaseRequest:
GoogleFirestoreAdminV1RestoreDatabaseRequest"
  [parent GoogleFirestoreAdminV1RestoreDatabaseRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+parent}/databases:restore",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body GoogleFirestoreAdminV1RestoreDatabaseRequest})

(defn projects-databases-get
  "Gets information about a database.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://firestore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"]})

(defn projects-databases-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-databases-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://firestore.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"]}))

(defn projects-databases-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://firestore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"]})

(defn projects-databases-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://firestore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"]})

(defn projects-databases-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/operations/cancel

name <> 
GoogleLongrunningCancelOperationRequest:
GoogleLongrunningCancelOperationRequest"
  [name GoogleLongrunningCancelOperationRequest]
  {:method :post,
   :uri-template "https://firestore.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body GoogleLongrunningCancelOperationRequest})

(defn projects-databases-collectionGroups-indexes-create
  "Creates a composite index. This returns a google.longrunning.Operation which may be used to track the status of the creation. The metadata for the operation will be the type IndexOperationMetadata.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/collectionGroups/indexes/create

parent <> 
GoogleFirestoreAdminV1Index:
GoogleFirestoreAdminV1Index"
  [parent GoogleFirestoreAdminV1Index]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+parent}/indexes",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body GoogleFirestoreAdminV1Index})

(defn projects-databases-collectionGroups-indexes-list
  "Lists composite indexes.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/collectionGroups/indexes/list

parent <> 

optional:
filter <string> The filter to apply to list results.
pageSize <integer> The number of results to return."
  ([parent]
    (projects-databases-collectionGroups-indexes-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://firestore.googleapis.com/v1/{+parent}/indexes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"]}))

(defn projects-databases-collectionGroups-indexes-get
  "Gets a composite index.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/collectionGroups/indexes/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://firestore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"]})

(defn projects-databases-collectionGroups-indexes-delete
  "Deletes a composite index.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/collectionGroups/indexes/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://firestore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"]})

(defn projects-databases-collectionGroups-fields-get
  "Gets the metadata and configuration for a Field.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/collectionGroups/fields/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://firestore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"]})

(defn projects-databases-collectionGroups-fields-patch
  "Updates a field configuration. Currently, field updates apply only to single field index configuration. However, calls to FirestoreAdmin.UpdateField should provide a field mask to avoid changing any configuration that the caller isn't aware of. The field mask should be specified as: `{ paths: \"index_config\" }`. This call returns a google.longrunning.Operation which may be used to track the status of the field update. The metadata for the operation will be the type FieldOperationMetadata. To configure the default field settings for the database, use the special `Field` with resource name: `projects/{project_id}/databases/{database_id}/collectionGroups/__default__/fields/*`.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/collectionGroups/fields/patch

name <> 
GoogleFirestoreAdminV1Field:
GoogleFirestoreAdminV1Field

optional:
updateMask <string> A mask, relative to the field. If specified, only configuration specified by this field_mask will be updated in the field."
  ([name GoogleFirestoreAdminV1Field]
    (projects-databases-collectionGroups-fields-patch
      name
      GoogleFirestoreAdminV1Field
      nil))
  ([name GoogleFirestoreAdminV1Field optional]
    {:method :patch,
     :uri-template "https://firestore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"],
     :body GoogleFirestoreAdminV1Field}))

(defn projects-databases-collectionGroups-fields-list
  "Lists the field configuration and metadata for this database. Currently, FirestoreAdmin.ListFields only supports listing fields that have been explicitly overridden. To issue this query, call FirestoreAdmin.ListFields with the filter set to `indexConfig.usesAncestorConfig:false` or `ttlConfig:*`.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/collectionGroups/fields/list

parent <> 

optional:
filter <string> The filter to apply to list results. Currently, FirestoreAdmin.ListFields only supports listing fields that have been explicitly overridden. To issue this query, call FirestoreAdmin.ListFields with a filter that includes `indexConfig.usesAncestorConfig:false` or `ttlConfig:*`.
pageSize <integer> The number of results to return."
  ([parent]
    (projects-databases-collectionGroups-fields-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://firestore.googleapis.com/v1/{+parent}/fields",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"]}))

(defn projects-databases-backupSchedules-create
  "Creates a backup schedule on a database. At most two backup schedules can be configured on a database, one daily backup schedule and one weekly backup schedule.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/backupSchedules/create

parent <> 
GoogleFirestoreAdminV1BackupSchedule:
GoogleFirestoreAdminV1BackupSchedule"
  [parent GoogleFirestoreAdminV1BackupSchedule]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+parent}/backupSchedules",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body GoogleFirestoreAdminV1BackupSchedule})

(defn projects-databases-backupSchedules-get
  "Gets information about a backup schedule.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/backupSchedules/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://firestore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"]})

(defn projects-databases-backupSchedules-list
  "List backup schedules.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/backupSchedules/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://firestore.googleapis.com/v1/{+parent}/backupSchedules",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"]})

(defn projects-databases-backupSchedules-patch
  "Updates a backup schedule.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/backupSchedules/patch

name <> 
GoogleFirestoreAdminV1BackupSchedule:
GoogleFirestoreAdminV1BackupSchedule

optional:
updateMask <string> The list of fields to be updated."
  ([name GoogleFirestoreAdminV1BackupSchedule]
    (projects-databases-backupSchedules-patch
      name
      GoogleFirestoreAdminV1BackupSchedule
      nil))
  ([name GoogleFirestoreAdminV1BackupSchedule optional]
    {:method :patch,
     :uri-template "https://firestore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"],
     :body GoogleFirestoreAdminV1BackupSchedule}))

(defn projects-databases-backupSchedules-delete
  "Deletes a backup schedule.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/backupSchedules/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://firestore.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"]})

(defn projects-databases-documents-listCollectionIds
  "Lists all the collection IDs underneath a document.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/listCollectionIds

parent <> 
ListCollectionIdsRequest:
ListCollectionIdsRequest"
  [parent ListCollectionIdsRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+parent}:listCollectionIds",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body ListCollectionIdsRequest})

(defn projects-databases-documents-runAggregationQuery
  "Runs an aggregation query. Rather than producing Document results like Firestore.RunQuery, this API allows running an aggregation to produce a series of AggregationResult server-side. High-Level Example: ``` -- Return the number of documents in table given a filter. SELECT COUNT(*) FROM ( SELECT * FROM k where a = true ); ```
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/runAggregationQuery

parent <> 
RunAggregationQueryRequest:
RunAggregationQueryRequest"
  [parent RunAggregationQueryRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+parent}:runAggregationQuery",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body RunAggregationQueryRequest})

(defn projects-databases-documents-list
  "Lists documents.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/list

parent <> 
collectionId <> 

optional:
transaction <string> Perform the read as part of an already active transaction.
showMissing <boolean> If the list should show missing documents. A document is missing if it does not exist, but there are sub-documents nested underneath it. When true, such missing documents will be returned with a key but will not have fields, `create_time`, or `update_time` set. Requests with `show_missing` may not specify `where` or `order_by`.
pageSize <integer> Optional. The maximum number of documents to return in a single response. Firestore may return fewer than this value.
mask.fieldPaths <string> The list of field paths in the mask. See Document.fields for a field path syntax reference.
orderBy <string> Optional. The optional ordering of the documents to return. For example: `priority desc, __name__ desc`. This mirrors the `ORDER BY` used in Firestore queries but in a string representation. When absent, documents are ordered based on `__name__ ASC`.
readTime <string> Perform the read at the provided time. This must be a microsecond precision timestamp within the past one hour, or if Point-in-Time Recovery is enabled, can additionally be a whole minute timestamp within the past 7 days."
  ([parent collectionId]
    (projects-databases-documents-list parent collectionId nil))
  ([parent collectionId optional]
    {:method :get,
     :uri-template
     "https://firestore.googleapis.com/v1/{+parent}/{collectionId}",
     :uri-template-args {"collectionId" collectionId, "parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"]}))

(defn projects-databases-documents-delete
  "Deletes a document.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/delete

name <> 

optional:
currentDocument.exists <boolean> When set to `true`, the target document must exist. When set to `false`, the target document must not exist.
currentDocument.updateTime <string> When set, the target document must exist and have been last updated at that time. Timestamp must be microsecond aligned."
  ([name] (projects-databases-documents-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://firestore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"]}))

(defn projects-databases-documents-createDocument
  "Creates a new document.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/createDocument

parent <> 
collectionId <> 
Document:
Document

optional:
documentId <string> The client-assigned document ID to use for this document. Optional. If not specified, an ID will be assigned by the service.
mask.fieldPaths <string> The list of field paths in the mask. See Document.fields for a field path syntax reference."
  ([parent collectionId Document]
    (projects-databases-documents-createDocument
      parent
      collectionId
      Document
      nil))
  ([parent collectionId Document optional]
    {:method :post,
     :uri-template
     "https://firestore.googleapis.com/v1/{+parent}/{collectionId}",
     :uri-template-args {"parent" parent, "collectionId" collectionId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"],
     :body Document}))

(defn projects-databases-documents-commit
  "Commits a transaction, while optionally updating documents.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/commit

database <> 
CommitRequest:
CommitRequest"
  [database CommitRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+database}/documents:commit",
   :uri-template-args {"database" database},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body CommitRequest})

(defn projects-databases-documents-listen
  "Listens to changes. This method is only available via gRPC or WebChannel (not REST).
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/listen

database <> 
ListenRequest:
ListenRequest"
  [database ListenRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+database}/documents:listen",
   :uri-template-args {"database" database},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body ListenRequest})

(defn projects-databases-documents-batchWrite
  "Applies a batch of write operations. The BatchWrite method does not apply the write operations atomically and can apply them out of order. Method does not allow more than one write per document. Each write succeeds or fails independently. See the BatchWriteResponse for the success status of each write. If you require an atomically applied set of writes, use Commit instead.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/batchWrite

database <> 
BatchWriteRequest:
BatchWriteRequest"
  [database BatchWriteRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+database}/documents:batchWrite",
   :uri-template-args {"database" database},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body BatchWriteRequest})

(defn projects-databases-documents-patch
  "Updates or inserts a document.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/patch

name <> 
Document:
Document

optional:
updateMask.fieldPaths <string> The list of field paths in the mask. See Document.fields for a field path syntax reference.
mask.fieldPaths <string> The list of field paths in the mask. See Document.fields for a field path syntax reference.
currentDocument.exists <boolean> When set to `true`, the target document must exist. When set to `false`, the target document must not exist.
currentDocument.updateTime <string> When set, the target document must exist and have been last updated at that time. Timestamp must be microsecond aligned."
  ([name Document]
    (projects-databases-documents-patch name Document nil))
  ([name Document optional]
    {:method :patch,
     :uri-template "https://firestore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"],
     :body Document}))

(defn projects-databases-documents-partitionQuery
  "Partitions a query by returning partition cursors that can be used to run the query in parallel. The returned partition cursors are split points that can be used by RunQuery as starting/end points for the query results.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/partitionQuery

parent <> 
PartitionQueryRequest:
PartitionQueryRequest"
  [parent PartitionQueryRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+parent}:partitionQuery",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body PartitionQueryRequest})

(defn projects-databases-documents-listDocuments
  "Lists documents.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/listDocuments

parent <> 
collectionId <> 

optional:
transaction <string> Perform the read as part of an already active transaction.
showMissing <boolean> If the list should show missing documents. A document is missing if it does not exist, but there are sub-documents nested underneath it. When true, such missing documents will be returned with a key but will not have fields, `create_time`, or `update_time` set. Requests with `show_missing` may not specify `where` or `order_by`.
pageSize <integer> Optional. The maximum number of documents to return in a single response. Firestore may return fewer than this value.
mask.fieldPaths <string> The list of field paths in the mask. See Document.fields for a field path syntax reference.
orderBy <string> Optional. The optional ordering of the documents to return. For example: `priority desc, __name__ desc`. This mirrors the `ORDER BY` used in Firestore queries but in a string representation. When absent, documents are ordered based on `__name__ ASC`.
readTime <string> Perform the read at the provided time. This must be a microsecond precision timestamp within the past one hour, or if Point-in-Time Recovery is enabled, can additionally be a whole minute timestamp within the past 7 days."
  ([parent collectionId]
    (projects-databases-documents-listDocuments
      parent
      collectionId
      nil))
  ([parent collectionId optional]
    {:method :get,
     :uri-template
     "https://firestore.googleapis.com/v1/{+parent}/{collectionId}",
     :uri-template-args {"collectionId" collectionId, "parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"]}))

(defn projects-databases-documents-batchGet
  "Gets multiple documents. Documents returned by this method are not guaranteed to be returned in the same order that they were requested.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/batchGet

database <> 
BatchGetDocumentsRequest:
BatchGetDocumentsRequest"
  [database BatchGetDocumentsRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+database}/documents:batchGet",
   :uri-template-args {"database" database},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body BatchGetDocumentsRequest})

(defn projects-databases-documents-rollback
  "Rolls back a transaction.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/rollback

database <> 
RollbackRequest:
RollbackRequest"
  [database RollbackRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+database}/documents:rollback",
   :uri-template-args {"database" database},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body RollbackRequest})

(defn projects-databases-documents-beginTransaction
  "Starts a new transaction.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/beginTransaction

database <> 
BeginTransactionRequest:
BeginTransactionRequest"
  [database BeginTransactionRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+database}/documents:beginTransaction",
   :uri-template-args {"database" database},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body BeginTransactionRequest})

(defn projects-databases-documents-runQuery
  "Runs a query.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/runQuery

parent <> 
RunQueryRequest:
RunQueryRequest"
  [parent RunQueryRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+parent}:runQuery",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body RunQueryRequest})

(defn projects-databases-documents-write
  "Streams batches of document updates and deletes, in order. This method is only available via gRPC or WebChannel (not REST).
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/write

database <> 
WriteRequest:
WriteRequest"
  [database WriteRequest]
  {:method :post,
   :uri-template
   "https://firestore.googleapis.com/v1/{+database}/documents:write",
   :uri-template-args {"database" database},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/datastore"],
   :body WriteRequest})

(defn projects-databases-documents-get
  "Gets a single document.
https://cloud.google.com/firestore/v1/reference/rest/v1/projects/databases/documents/get

name <> 

optional:
mask.fieldPaths <string> The list of field paths in the mask. See Document.fields for a field path syntax reference.
transaction <string> Reads the document in a transaction.
readTime <string> Reads the version of the document at the given time. This must be a microsecond precision timestamp within the past one hour, or if Point-in-Time Recovery is enabled, can additionally be a whole minute timestamp within the past 7 days."
  ([name] (projects-databases-documents-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://firestore.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/datastore"]}))
