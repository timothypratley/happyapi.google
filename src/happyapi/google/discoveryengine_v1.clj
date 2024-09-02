(ns happyapi.google.discoveryengine-v1
  "Discovery Engine API
Discovery Engine API.
See: https://cloud.google.com/discovery-engine/media/docs"
  (:require [happyapi.providers.google :as client]))

(defn projects-provision
  "Provisions the project resource. During the process, related systems will get prepared and initialized. Caller must read the [Terms for data use](https://cloud.google.com/retail/data-use-terms), and optionally specify in request to provide consent to that service terms.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/provision

name <> 
GoogleCloudDiscoveryengineV1ProvisionProjectRequest:
GoogleCloudDiscoveryengineV1ProvisionProjectRequest"
  [name GoogleCloudDiscoveryengineV1ProvisionProjectRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+name}:provision",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1ProvisionProjectRequest}))

(defn projects-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/operations/cancel

name <> 
GoogleLongrunningCancelOperationRequest:
GoogleLongrunningCancelOperationRequest"
  [name GoogleLongrunningCancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleLongrunningCancelOperationRequest}))

(defn projects-locations-collections-dataConnector-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataConnector/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-collections-dataConnector-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataConnector-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataConnector/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-collections-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-completeQuery
  "Completes the specified user input with keyword suggestions.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/completeQuery

dataStore <> 

optional:
query <string> Required. The typeahead input used to fetch suggestions. Maximum length is 128 characters.
queryModel <string> Specifies the autocomplete data model. This overrides any model specified in the Configuration > Autocomplete section of the Cloud console. Currently supported values: * `document` - Using suggestions generated from user-imported documents. * `search-history` - Using suggestions generated from the past history of SearchService.Search API calls. Do not use it when there is no traffic for Search API. * `user-event` - Using suggestions generated from user-imported search events. * `document-completable` - Using suggestions taken directly from user-imported document fields marked as completable. Default values: * `document` is the default model for regular dataStores. * `search-history` is the default model for site search dataStores.
userPseudoId <string> A unique identifier for tracking visitors. For example, this could be implemented with an HTTP cookie, which should be able to uniquely identify a visitor on a single device. This unique identifier should not change if the visitor logs in or out of the website. This field should NOT have a fixed value such as `unknown_visitor`. This should be the same identifier as UserEvent.user_pseudo_id and SearchRequest.user_pseudo_id. The field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
includeTailSuggestions <boolean> Indicates if tail suggestions should be returned if there are no suggestions that match the full query. Even if set to true, if there are suggestions that match the full query, those are returned and no tail suggestions are returned."
  ([dataStore]
    (projects-locations-collections-dataStores-completeQuery
      dataStore
      nil))
  ([dataStore optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+dataStore}:completeQuery",
       :uri-template-args {"dataStore" dataStore},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-create
  "Creates a DataStore. DataStore is for storing Documents. To serve these documents for Search, or Recommendation use case, an Engine needs to be created separately.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/create

parent <> 
GoogleCloudDiscoveryengineV1DataStore:
GoogleCloudDiscoveryengineV1DataStore

optional:
dataStoreId <string> Required. The ID to use for the DataStore, which will become the final component of the DataStore's resource name. This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034) standard with a length limit of 63 characters. Otherwise, an INVALID_ARGUMENT error is returned.
createAdvancedSiteSearch <boolean> A boolean flag indicating whether user want to directly create an advanced data store for site search. If the data store is not configured as site search (GENERIC vertical and PUBLIC_WEBSITE content_config), this flag will be ignored.
skipDefaultSchemaCreation <boolean> A boolean flag indicating whether to skip the default schema creation for the data store. Only enable this flag if you are certain that the default schema is incompatible with your use case. If set to true, you must manually create a schema for the data store before any documents can be ingested. This flag cannot be specified if `data_store.starting_schema` is specified."
  ([parent GoogleCloudDiscoveryengineV1DataStore]
    (projects-locations-collections-dataStores-create
      parent
      GoogleCloudDiscoveryengineV1DataStore
      nil))
  ([parent GoogleCloudDiscoveryengineV1DataStore optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/dataStores",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1DataStore})))

(defn projects-locations-collections-dataStores-get
  "Gets a DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-list
  "Lists all the DataStores associated with the project.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/list

parent <> 

optional:
pageSize <integer> Maximum number of DataStores to return. If unspecified, defaults to 10. The maximum allowed value is 50. Values above 50 will be coerced to 50. If this field is negative, an INVALID_ARGUMENT is returned.
filter <string> Filter by solution type . For example: `filter = 'solution_type:SOLUTION_TYPE_SEARCH'`"
  ([parent]
    (projects-locations-collections-dataStores-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/dataStores",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-delete
  "Deletes a DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-patch
  "Updates a DataStore
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/patch

name <> 
GoogleCloudDiscoveryengineV1DataStore:
GoogleCloudDiscoveryengineV1DataStore

optional:
updateMask <string> Indicates which fields in the provided DataStore to update. If an unsupported or unknown field is provided, an INVALID_ARGUMENT error is returned."
  ([name GoogleCloudDiscoveryengineV1DataStore]
    (projects-locations-collections-dataStores-patch
      name
      GoogleCloudDiscoveryengineV1DataStore
      nil))
  ([name GoogleCloudDiscoveryengineV1DataStore optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1DataStore})))

(defn projects-locations-collections-dataStores-trainCustomModel
  "Trains a custom model.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/trainCustomModel

dataStore <> 
GoogleCloudDiscoveryengineV1TrainCustomModelRequest:
GoogleCloudDiscoveryengineV1TrainCustomModelRequest"
  [dataStore GoogleCloudDiscoveryengineV1TrainCustomModelRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+dataStore}:trainCustomModel",
     :uri-template-args {"dataStore" dataStore},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1TrainCustomModelRequest}))

(defn projects-locations-collections-dataStores-getSiteSearchEngine
  "Gets the SiteSearchEngine.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/getSiteSearchEngine

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-branches-batchGetDocumentsMetadata
  "Gets index freshness metadata for Documents. Supported for website search only.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/branches/batchGetDocumentsMetadata

parent <> 

optional:
matcher.urisMatcher.uris <string> The exact URIs to match by.
matcher.fhirMatcher.fhirResources <string> Required. The FHIR resources to match by. Format: projects/{project}/locations/{location}/datasets/{dataset}/fhirStores/{fhir_store}/fhir/{resource_type}/{fhir_resource_id}"
  ([parent]
    (projects-locations-collections-dataStores-branches-batchGetDocumentsMetadata
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/batchGetDocumentsMetadata",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-branches-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/branches/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-collections-dataStores-branches-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-branches-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/branches/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-branches-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/branches/operations/cancel

name <> 
GoogleLongrunningCancelOperationRequest:
GoogleLongrunningCancelOperationRequest"
  [name GoogleLongrunningCancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleLongrunningCancelOperationRequest}))

(defn projects-locations-collections-dataStores-branches-documents-get
  "Gets a Document.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/branches/documents/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-branches-documents-list
  "Gets a list of Documents.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/branches/documents/list

parent <> 

optional:
pageSize <integer> Maximum number of Documents to return. If unspecified, defaults to 100. The maximum allowed value is 1000. Values above 1000 are set to 1000. If this field is negative, an `INVALID_ARGUMENT` error is returned."
  ([parent]
    (projects-locations-collections-dataStores-branches-documents-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/documents",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-branches-documents-create
  "Creates a Document.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/branches/documents/create

parent <> 
GoogleCloudDiscoveryengineV1Document:
GoogleCloudDiscoveryengineV1Document

optional:
documentId <string> Required. The ID to use for the Document, which becomes the final component of the Document.name. If the caller does not have permission to create the Document, regardless of whether or not it exists, a `PERMISSION_DENIED` error is returned. This field must be unique among all Documents with the same parent. Otherwise, an `ALREADY_EXISTS` error is returned. This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034) standard with a length limit of 63 characters. Otherwise, an `INVALID_ARGUMENT` error is returned."
  ([parent GoogleCloudDiscoveryengineV1Document]
    (projects-locations-collections-dataStores-branches-documents-create
      parent
      GoogleCloudDiscoveryengineV1Document
      nil))
  ([parent GoogleCloudDiscoveryengineV1Document optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/documents",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Document})))

(defn projects-locations-collections-dataStores-branches-documents-patch
  "Updates a Document.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/branches/documents/patch

name <> 
GoogleCloudDiscoveryengineV1Document:
GoogleCloudDiscoveryengineV1Document

optional:
allowMissing <boolean> If set to `true` and the Document is not found, a new Document is be created.
updateMask <string> Indicates which fields in the provided imported 'document' to update. If not set, by default updates all fields."
  ([name GoogleCloudDiscoveryengineV1Document]
    (projects-locations-collections-dataStores-branches-documents-patch
      name
      GoogleCloudDiscoveryengineV1Document
      nil))
  ([name GoogleCloudDiscoveryengineV1Document optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Document})))

(defn projects-locations-collections-dataStores-branches-documents-delete
  "Deletes a Document.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/branches/documents/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-branches-documents-import
  "Bulk import of multiple Documents. Request processing may be synchronous. Non-existing items are created. Note: It is possible for a subset of the Documents to be successfully updated.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/branches/documents/import

parent <> 
GoogleCloudDiscoveryengineV1ImportDocumentsRequest:
GoogleCloudDiscoveryengineV1ImportDocumentsRequest"
  [parent GoogleCloudDiscoveryengineV1ImportDocumentsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/documents:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1ImportDocumentsRequest}))

(defn projects-locations-collections-dataStores-branches-documents-purge
  "Permanently deletes all selected Documents in a branch. This process is asynchronous. Depending on the number of Documents to be deleted, this operation can take hours to complete. Before the delete operation completes, some Documents might still be returned by DocumentService.GetDocument or DocumentService.ListDocuments. To get a list of the Documents to be deleted, set PurgeDocumentsRequest.force to false.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/branches/documents/purge

parent <> 
GoogleCloudDiscoveryengineV1PurgeDocumentsRequest:
GoogleCloudDiscoveryengineV1PurgeDocumentsRequest"
  [parent GoogleCloudDiscoveryengineV1PurgeDocumentsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/documents:purge",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1PurgeDocumentsRequest}))

(defn projects-locations-collections-dataStores-completionSuggestions-import
  "Imports CompletionSuggestions for a DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/completionSuggestions/import

parent <> 
GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest:
GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest"
  [parent
   GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/completionSuggestions:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest}))

(defn projects-locations-collections-dataStores-completionSuggestions-purge
  "Permanently deletes all CompletionSuggestions for a DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/completionSuggestions/purge

parent <> 
GoogleCloudDiscoveryengineV1PurgeCompletionSuggestionsRequest:
GoogleCloudDiscoveryengineV1PurgeCompletionSuggestionsRequest"
  [parent
   GoogleCloudDiscoveryengineV1PurgeCompletionSuggestionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/completionSuggestions:purge",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudDiscoveryengineV1PurgeCompletionSuggestionsRequest}))

(defn projects-locations-collections-dataStores-schemas-get
  "Gets a Schema.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/schemas/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-schemas-list
  "Gets a list of Schemas.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/schemas/list

parent <> 

optional:
pageSize <integer> The maximum number of Schemas to return. The service may return fewer than this value. If unspecified, at most 100 Schemas are returned. The maximum value is 1000; values above 1000 are set to 1000."
  ([parent]
    (projects-locations-collections-dataStores-schemas-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/schemas",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-schemas-create
  "Creates a Schema.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/schemas/create

parent <> 
GoogleCloudDiscoveryengineV1Schema:
GoogleCloudDiscoveryengineV1Schema

optional:
schemaId <string> Required. The ID to use for the Schema, which becomes the final component of the Schema.name. This field should conform to [RFC-1034](https://tools.ietf.org/html/rfc1034) standard with a length limit of 63 characters."
  ([parent GoogleCloudDiscoveryengineV1Schema]
    (projects-locations-collections-dataStores-schemas-create
      parent
      GoogleCloudDiscoveryengineV1Schema
      nil))
  ([parent GoogleCloudDiscoveryengineV1Schema optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/schemas",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Schema})))

(defn projects-locations-collections-dataStores-schemas-patch
  "Updates a Schema.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/schemas/patch

name <> 
GoogleCloudDiscoveryengineV1Schema:
GoogleCloudDiscoveryengineV1Schema

optional:
allowMissing <boolean> If set to true, and the Schema is not found, a new Schema is created. In this situation, `update_mask` is ignored."
  ([name GoogleCloudDiscoveryengineV1Schema]
    (projects-locations-collections-dataStores-schemas-patch
      name
      GoogleCloudDiscoveryengineV1Schema
      nil))
  ([name GoogleCloudDiscoveryengineV1Schema optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Schema})))

(defn projects-locations-collections-dataStores-schemas-delete
  "Deletes a Schema.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/schemas/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-schemas-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/schemas/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-collections-dataStores-schemas-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-schemas-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/schemas/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-siteSearchEngine-enableAdvancedSiteSearch
  "Upgrade from basic site search to advanced site search.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/enableAdvancedSiteSearch

siteSearchEngine <> 
GoogleCloudDiscoveryengineV1EnableAdvancedSiteSearchRequest:
GoogleCloudDiscoveryengineV1EnableAdvancedSiteSearchRequest"
  [siteSearchEngine
   GoogleCloudDiscoveryengineV1EnableAdvancedSiteSearchRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+siteSearchEngine}:enableAdvancedSiteSearch",
     :uri-template-args {"siteSearchEngine" siteSearchEngine},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudDiscoveryengineV1EnableAdvancedSiteSearchRequest}))

(defn projects-locations-collections-dataStores-siteSearchEngine-disableAdvancedSiteSearch
  "Downgrade from advanced site search to basic site search.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/disableAdvancedSiteSearch

siteSearchEngine <> 
GoogleCloudDiscoveryengineV1DisableAdvancedSiteSearchRequest:
GoogleCloudDiscoveryengineV1DisableAdvancedSiteSearchRequest"
  [siteSearchEngine
   GoogleCloudDiscoveryengineV1DisableAdvancedSiteSearchRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+siteSearchEngine}:disableAdvancedSiteSearch",
     :uri-template-args {"siteSearchEngine" siteSearchEngine},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudDiscoveryengineV1DisableAdvancedSiteSearchRequest}))

(defn projects-locations-collections-dataStores-siteSearchEngine-recrawlUris
  "Request on-demand recrawl for a list of URIs.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/recrawlUris

siteSearchEngine <> 
GoogleCloudDiscoveryengineV1RecrawlUrisRequest:
GoogleCloudDiscoveryengineV1RecrawlUrisRequest"
  [siteSearchEngine GoogleCloudDiscoveryengineV1RecrawlUrisRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+siteSearchEngine}:recrawlUris",
     :uri-template-args {"siteSearchEngine" siteSearchEngine},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1RecrawlUrisRequest}))

(defn projects-locations-collections-dataStores-siteSearchEngine-batchVerifyTargetSites
  "Verify target sites' ownership and validity. This API sends all the target sites under site search engine for verification.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/batchVerifyTargetSites

parent <> 
GoogleCloudDiscoveryengineV1BatchVerifyTargetSitesRequest:
GoogleCloudDiscoveryengineV1BatchVerifyTargetSitesRequest"
  [parent GoogleCloudDiscoveryengineV1BatchVerifyTargetSitesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}:batchVerifyTargetSites",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1BatchVerifyTargetSitesRequest}))

(defn projects-locations-collections-dataStores-siteSearchEngine-fetchDomainVerificationStatus
  "Returns list of target sites with its domain verification status. This method can only be called under data store with BASIC_SITE_SEARCH state at the moment.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/fetchDomainVerificationStatus

siteSearchEngine <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default. The maximum value is 1000; values above 1000 will be coerced to 1000. If this field is negative, an INVALID_ARGUMENT error is returned."
  ([siteSearchEngine]
    (projects-locations-collections-dataStores-siteSearchEngine-fetchDomainVerificationStatus
      siteSearchEngine
      nil))
  ([siteSearchEngine optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+siteSearchEngine}:fetchDomainVerificationStatus",
       :uri-template-args {"siteSearchEngine" siteSearchEngine},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-siteSearchEngine-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-collections-dataStores-siteSearchEngine-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-siteSearchEngine-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-siteSearchEngine-targetSites-create
  "Creates a TargetSite.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/targetSites/create

parent <> 
GoogleCloudDiscoveryengineV1TargetSite:
GoogleCloudDiscoveryengineV1TargetSite"
  [parent GoogleCloudDiscoveryengineV1TargetSite]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/targetSites",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1TargetSite}))

(defn projects-locations-collections-dataStores-siteSearchEngine-targetSites-batchCreate
  "Creates TargetSite in a batch.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/targetSites/batchCreate

parent <> 
GoogleCloudDiscoveryengineV1BatchCreateTargetSitesRequest:
GoogleCloudDiscoveryengineV1BatchCreateTargetSitesRequest"
  [parent GoogleCloudDiscoveryengineV1BatchCreateTargetSitesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/targetSites:batchCreate",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1BatchCreateTargetSitesRequest}))

(defn projects-locations-collections-dataStores-siteSearchEngine-targetSites-get
  "Gets a TargetSite.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/targetSites/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-siteSearchEngine-targetSites-patch
  "Updates a TargetSite.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/targetSites/patch

name <> 
GoogleCloudDiscoveryengineV1TargetSite:
GoogleCloudDiscoveryengineV1TargetSite"
  [name GoogleCloudDiscoveryengineV1TargetSite]
  (client/*api-request*
    {:method :patch,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1TargetSite}))

(defn projects-locations-collections-dataStores-siteSearchEngine-targetSites-delete
  "Deletes a TargetSite.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/targetSites/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-siteSearchEngine-targetSites-list
  "Gets a list of TargetSites.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/targetSites/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default. The maximum value is 1000; values above 1000 will be coerced to 1000. If this field is negative, an INVALID_ARGUMENT error is returned."
  ([parent]
    (projects-locations-collections-dataStores-siteSearchEngine-targetSites-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/targetSites",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-siteSearchEngine-targetSites-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/targetSites/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-collections-dataStores-siteSearchEngine-targetSites-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-siteSearchEngine-targetSites-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/siteSearchEngine/targetSites/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-sessions-create
  "Creates a Session. If the Session to create already exists, an ALREADY_EXISTS error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/sessions/create

parent <> 
GoogleCloudDiscoveryengineV1Session:
GoogleCloudDiscoveryengineV1Session"
  [parent GoogleCloudDiscoveryengineV1Session]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/sessions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1Session}))

(defn projects-locations-collections-dataStores-sessions-delete
  "Deletes a Session. If the Session to delete does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/sessions/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-sessions-patch
  "Updates a Session. Session action type cannot be changed. If the Session to update does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/sessions/patch

name <> 
GoogleCloudDiscoveryengineV1Session:
GoogleCloudDiscoveryengineV1Session

optional:
updateMask <string> Indicates which fields in the provided Session to update. The following are NOT supported: * Session.name If not set or empty, all supported fields are updated."
  ([name GoogleCloudDiscoveryengineV1Session]
    (projects-locations-collections-dataStores-sessions-patch
      name
      GoogleCloudDiscoveryengineV1Session
      nil))
  ([name GoogleCloudDiscoveryengineV1Session optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Session})))

(defn projects-locations-collections-dataStores-sessions-get
  "Gets a Session.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/sessions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-sessions-list
  "Lists all Sessions by their parent DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/sessions/list

parent <> 

optional:
pageSize <integer> Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
filter <string> A filter to apply on the list results. The supported features are: user_pseudo_id, state. Example: \"user_pseudo_id = some_id\"
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `update_time` * `create_time` * `session_name` Example: \"update_time desc\" \"create_time\""
  ([parent]
    (projects-locations-collections-dataStores-sessions-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/sessions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-sessions-answers-get
  "Gets a Answer.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/sessions/answers/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-servingConfigs-search
  "Performs a search.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/servingConfigs/search

servingConfig <> 
GoogleCloudDiscoveryengineV1SearchRequest:
GoogleCloudDiscoveryengineV1SearchRequest"
  [servingConfig GoogleCloudDiscoveryengineV1SearchRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+servingConfig}:search",
     :uri-template-args {"servingConfig" servingConfig},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1SearchRequest}))

(defn projects-locations-collections-dataStores-servingConfigs-answer
  "Answer query method.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/servingConfigs/answer

servingConfig <> 
GoogleCloudDiscoveryengineV1AnswerQueryRequest:
GoogleCloudDiscoveryengineV1AnswerQueryRequest"
  [servingConfig GoogleCloudDiscoveryengineV1AnswerQueryRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+servingConfig}:answer",
     :uri-template-args {"servingConfig" servingConfig},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1AnswerQueryRequest}))

(defn projects-locations-collections-dataStores-servingConfigs-recommend
  "Makes a recommendation, which requires a contextual user event.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/servingConfigs/recommend

servingConfig <> 
GoogleCloudDiscoveryengineV1RecommendRequest:
GoogleCloudDiscoveryengineV1RecommendRequest"
  [servingConfig GoogleCloudDiscoveryengineV1RecommendRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+servingConfig}:recommend",
     :uri-template-args {"servingConfig" servingConfig},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1RecommendRequest}))

(defn projects-locations-collections-dataStores-suggestionDenyListEntries-import
  "Imports all SuggestionDenyListEntry for a DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/suggestionDenyListEntries/import

parent <> 
GoogleCloudDiscoveryengineV1ImportSuggestionDenyListEntriesRequest:
GoogleCloudDiscoveryengineV1ImportSuggestionDenyListEntriesRequest"
  [parent
   GoogleCloudDiscoveryengineV1ImportSuggestionDenyListEntriesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/suggestionDenyListEntries:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudDiscoveryengineV1ImportSuggestionDenyListEntriesRequest}))

(defn projects-locations-collections-dataStores-suggestionDenyListEntries-purge
  "Permanently deletes all SuggestionDenyListEntry for a DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/suggestionDenyListEntries/purge

parent <> 
GoogleCloudDiscoveryengineV1PurgeSuggestionDenyListEntriesRequest:
GoogleCloudDiscoveryengineV1PurgeSuggestionDenyListEntriesRequest"
  [parent
   GoogleCloudDiscoveryengineV1PurgeSuggestionDenyListEntriesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/suggestionDenyListEntries:purge",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudDiscoveryengineV1PurgeSuggestionDenyListEntriesRequest}))

(defn projects-locations-collections-dataStores-customModels-list
  "Gets a list of all the custom models.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/customModels/list

dataStore <> "
  [dataStore]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+dataStore}/customModels",
     :uri-template-args {"dataStore" dataStore},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-userEvents-write
  "Writes a single user event.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/userEvents/write

parent <> 
GoogleCloudDiscoveryengineV1UserEvent:
GoogleCloudDiscoveryengineV1UserEvent

optional:
writeAsync <boolean> If set to true, the user event is written asynchronously after validation, and the API responds without waiting for the write."
  ([parent GoogleCloudDiscoveryengineV1UserEvent]
    (projects-locations-collections-dataStores-userEvents-write
      parent
      GoogleCloudDiscoveryengineV1UserEvent
      nil))
  ([parent GoogleCloudDiscoveryengineV1UserEvent optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/userEvents:write",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1UserEvent})))

(defn projects-locations-collections-dataStores-userEvents-collect
  "Writes a single user event from the browser. This uses a GET request to due to browser restriction of POST-ing to a third-party domain. This method is used only by the Discovery Engine API JavaScript pixel and Google Tag Manager. Users should not call this method directly.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/userEvents/collect

parent <> 

optional:
userEvent <string> Required. URL encoded UserEvent proto with a length limit of 2,000,000 characters.
uri <string> The URL including cgi-parameters but excluding the hash fragment with a length limit of 5,000 characters. This is often more useful than the referer URL, because many browsers only send the domain for third-party requests.
ets <string> The event timestamp in milliseconds. This prevents browser caching of otherwise identical get requests. The name is abbreviated to reduce the payload bytes."
  ([parent]
    (projects-locations-collections-dataStores-userEvents-collect
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/userEvents:collect",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-userEvents-purge
  "Deletes permanently all user events specified by the filter provided. Depending on the number of events specified by the filter, this operation could take hours or days to complete. To test a filter, use the list command first.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/userEvents/purge

parent <> 
GoogleCloudDiscoveryengineV1PurgeUserEventsRequest:
GoogleCloudDiscoveryengineV1PurgeUserEventsRequest"
  [parent GoogleCloudDiscoveryengineV1PurgeUserEventsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/userEvents:purge",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1PurgeUserEventsRequest}))

(defn projects-locations-collections-dataStores-userEvents-import
  "Bulk import of user events. Request processing might be synchronous. Events that already exist are skipped. Use this method for backfilling historical user events. Operation.response is of type ImportResponse. Note that it is possible for a subset of the items to be successfully inserted. Operation.metadata is of type ImportMetadata.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/userEvents/import

parent <> 
GoogleCloudDiscoveryengineV1ImportUserEventsRequest:
GoogleCloudDiscoveryengineV1ImportUserEventsRequest"
  [parent GoogleCloudDiscoveryengineV1ImportUserEventsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/userEvents:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1ImportUserEventsRequest}))

(defn projects-locations-collections-dataStores-controls-create
  "Creates a Control. By default 1000 controls are allowed for a data store. A request can be submitted to adjust this limit. If the Control to create already exists, an ALREADY_EXISTS error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/controls/create

parent <> 
GoogleCloudDiscoveryengineV1Control:
GoogleCloudDiscoveryengineV1Control

optional:
controlId <string> Required. The ID to use for the Control, which will become the final component of the Control's resource name. This value must be within 1-63 characters. Valid characters are /a-z-_/."
  ([parent GoogleCloudDiscoveryengineV1Control]
    (projects-locations-collections-dataStores-controls-create
      parent
      GoogleCloudDiscoveryengineV1Control
      nil))
  ([parent GoogleCloudDiscoveryengineV1Control optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/controls",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Control})))

(defn projects-locations-collections-dataStores-controls-delete
  "Deletes a Control. If the Control to delete does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/controls/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-controls-patch
  "Updates a Control. Control action type cannot be changed. If the Control to update does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/controls/patch

name <> 
GoogleCloudDiscoveryengineV1Control:
GoogleCloudDiscoveryengineV1Control

optional:
updateMask <string> Optional. Indicates which fields in the provided Control to update. The following are NOT supported: * Control.name * Control.solution_type If not set or empty, all supported fields are updated."
  ([name GoogleCloudDiscoveryengineV1Control]
    (projects-locations-collections-dataStores-controls-patch
      name
      GoogleCloudDiscoveryengineV1Control
      nil))
  ([name GoogleCloudDiscoveryengineV1Control optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Control})))

(defn projects-locations-collections-dataStores-controls-get
  "Gets a Control.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/controls/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-controls-list
  "Lists all Controls by their parent DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/controls/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
filter <string> Optional. A filter to apply on the list results. Supported features: * List all the products under the parent branch if filter is unset. Currently this field is unsupported."
  ([parent]
    (projects-locations-collections-dataStores-controls-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/controls",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-conversations-converse
  "Converses a conversation.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/conversations/converse

name <> 
GoogleCloudDiscoveryengineV1ConverseConversationRequest:
GoogleCloudDiscoveryengineV1ConverseConversationRequest"
  [name GoogleCloudDiscoveryengineV1ConverseConversationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+name}:converse",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1ConverseConversationRequest}))

(defn projects-locations-collections-dataStores-conversations-create
  "Creates a Conversation. If the Conversation to create already exists, an ALREADY_EXISTS error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/conversations/create

parent <> 
GoogleCloudDiscoveryengineV1Conversation:
GoogleCloudDiscoveryengineV1Conversation"
  [parent GoogleCloudDiscoveryengineV1Conversation]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/conversations",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1Conversation}))

(defn projects-locations-collections-dataStores-conversations-delete
  "Deletes a Conversation. If the Conversation to delete does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/conversations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-conversations-patch
  "Updates a Conversation. Conversation action type cannot be changed. If the Conversation to update does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/conversations/patch

name <> 
GoogleCloudDiscoveryengineV1Conversation:
GoogleCloudDiscoveryengineV1Conversation

optional:
updateMask <string> Indicates which fields in the provided Conversation to update. The following are NOT supported: * Conversation.name If not set or empty, all supported fields are updated."
  ([name GoogleCloudDiscoveryengineV1Conversation]
    (projects-locations-collections-dataStores-conversations-patch
      name
      GoogleCloudDiscoveryengineV1Conversation
      nil))
  ([name GoogleCloudDiscoveryengineV1Conversation optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Conversation})))

(defn projects-locations-collections-dataStores-conversations-get
  "Gets a Conversation.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/conversations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-conversations-list
  "Lists all Conversations by their parent DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/conversations/list

parent <> 

optional:
pageSize <integer> Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
filter <string> A filter to apply on the list results. The supported features are: user_pseudo_id, state. Example: \"user_pseudo_id = some_id\"
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `update_time` * `create_time` * `conversation_name` Example: \"update_time desc\" \"create_time\""
  ([parent]
    (projects-locations-collections-dataStores-conversations-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/conversations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-models-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/models/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-collections-dataStores-models-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-models-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/models/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-dataStores-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-collections-dataStores-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-dataStores-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/dataStores/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-engines-create
  "Creates a Engine.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/create

parent <> 
GoogleCloudDiscoveryengineV1Engine:
GoogleCloudDiscoveryengineV1Engine

optional:
engineId <string> Required. The ID to use for the Engine, which will become the final component of the Engine's resource name. This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034) standard with a length limit of 63 characters. Otherwise, an INVALID_ARGUMENT error is returned."
  ([parent GoogleCloudDiscoveryengineV1Engine]
    (projects-locations-collections-engines-create
      parent
      GoogleCloudDiscoveryengineV1Engine
      nil))
  ([parent GoogleCloudDiscoveryengineV1Engine optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/engines",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Engine})))

(defn projects-locations-collections-engines-delete
  "Deletes a Engine.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-engines-patch
  "Updates an Engine
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/patch

name <> 
GoogleCloudDiscoveryengineV1Engine:
GoogleCloudDiscoveryengineV1Engine

optional:
updateMask <string> Indicates which fields in the provided Engine to update. If an unsupported or unknown field is provided, an INVALID_ARGUMENT error is returned."
  ([name GoogleCloudDiscoveryengineV1Engine]
    (projects-locations-collections-engines-patch
      name
      GoogleCloudDiscoveryengineV1Engine
      nil))
  ([name GoogleCloudDiscoveryengineV1Engine optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Engine})))

(defn projects-locations-collections-engines-get
  "Gets a Engine.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-engines-list
  "Lists all the Engines associated with the project.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/list

parent <> 

optional:
pageSize <integer> Optional. Not supported.
filter <string> Optional. Filter by solution type. For example: solution_type=SOLUTION_TYPE_SEARCH"
  ([parent] (projects-locations-collections-engines-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/engines",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-engines-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-collections-engines-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-engines-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-engines-controls-create
  "Creates a Control. By default 1000 controls are allowed for a data store. A request can be submitted to adjust this limit. If the Control to create already exists, an ALREADY_EXISTS error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/controls/create

parent <> 
GoogleCloudDiscoveryengineV1Control:
GoogleCloudDiscoveryengineV1Control

optional:
controlId <string> Required. The ID to use for the Control, which will become the final component of the Control's resource name. This value must be within 1-63 characters. Valid characters are /a-z-_/."
  ([parent GoogleCloudDiscoveryengineV1Control]
    (projects-locations-collections-engines-controls-create
      parent
      GoogleCloudDiscoveryengineV1Control
      nil))
  ([parent GoogleCloudDiscoveryengineV1Control optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/controls",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Control})))

(defn projects-locations-collections-engines-controls-delete
  "Deletes a Control. If the Control to delete does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/controls/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-engines-controls-patch
  "Updates a Control. Control action type cannot be changed. If the Control to update does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/controls/patch

name <> 
GoogleCloudDiscoveryengineV1Control:
GoogleCloudDiscoveryengineV1Control

optional:
updateMask <string> Optional. Indicates which fields in the provided Control to update. The following are NOT supported: * Control.name * Control.solution_type If not set or empty, all supported fields are updated."
  ([name GoogleCloudDiscoveryengineV1Control]
    (projects-locations-collections-engines-controls-patch
      name
      GoogleCloudDiscoveryengineV1Control
      nil))
  ([name GoogleCloudDiscoveryengineV1Control optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Control})))

(defn projects-locations-collections-engines-controls-get
  "Gets a Control.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/controls/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-engines-controls-list
  "Lists all Controls by their parent DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/controls/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
filter <string> Optional. A filter to apply on the list results. Supported features: * List all the products under the parent branch if filter is unset. Currently this field is unsupported."
  ([parent]
    (projects-locations-collections-engines-controls-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/controls",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-engines-servingConfigs-search
  "Performs a search.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/servingConfigs/search

servingConfig <> 
GoogleCloudDiscoveryengineV1SearchRequest:
GoogleCloudDiscoveryengineV1SearchRequest"
  [servingConfig GoogleCloudDiscoveryengineV1SearchRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+servingConfig}:search",
     :uri-template-args {"servingConfig" servingConfig},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1SearchRequest}))

(defn projects-locations-collections-engines-servingConfigs-answer
  "Answer query method.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/servingConfigs/answer

servingConfig <> 
GoogleCloudDiscoveryengineV1AnswerQueryRequest:
GoogleCloudDiscoveryengineV1AnswerQueryRequest"
  [servingConfig GoogleCloudDiscoveryengineV1AnswerQueryRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+servingConfig}:answer",
     :uri-template-args {"servingConfig" servingConfig},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1AnswerQueryRequest}))

(defn projects-locations-collections-engines-servingConfigs-recommend
  "Makes a recommendation, which requires a contextual user event.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/servingConfigs/recommend

servingConfig <> 
GoogleCloudDiscoveryengineV1RecommendRequest:
GoogleCloudDiscoveryengineV1RecommendRequest"
  [servingConfig GoogleCloudDiscoveryengineV1RecommendRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+servingConfig}:recommend",
     :uri-template-args {"servingConfig" servingConfig},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1RecommendRequest}))

(defn projects-locations-collections-engines-conversations-converse
  "Converses a conversation.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/conversations/converse

name <> 
GoogleCloudDiscoveryengineV1ConverseConversationRequest:
GoogleCloudDiscoveryengineV1ConverseConversationRequest"
  [name GoogleCloudDiscoveryengineV1ConverseConversationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+name}:converse",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1ConverseConversationRequest}))

(defn projects-locations-collections-engines-conversations-create
  "Creates a Conversation. If the Conversation to create already exists, an ALREADY_EXISTS error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/conversations/create

parent <> 
GoogleCloudDiscoveryengineV1Conversation:
GoogleCloudDiscoveryengineV1Conversation"
  [parent GoogleCloudDiscoveryengineV1Conversation]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/conversations",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1Conversation}))

(defn projects-locations-collections-engines-conversations-delete
  "Deletes a Conversation. If the Conversation to delete does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/conversations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-engines-conversations-patch
  "Updates a Conversation. Conversation action type cannot be changed. If the Conversation to update does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/conversations/patch

name <> 
GoogleCloudDiscoveryengineV1Conversation:
GoogleCloudDiscoveryengineV1Conversation

optional:
updateMask <string> Indicates which fields in the provided Conversation to update. The following are NOT supported: * Conversation.name If not set or empty, all supported fields are updated."
  ([name GoogleCloudDiscoveryengineV1Conversation]
    (projects-locations-collections-engines-conversations-patch
      name
      GoogleCloudDiscoveryengineV1Conversation
      nil))
  ([name GoogleCloudDiscoveryengineV1Conversation optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Conversation})))

(defn projects-locations-collections-engines-conversations-get
  "Gets a Conversation.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/conversations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-engines-conversations-list
  "Lists all Conversations by their parent DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/conversations/list

parent <> 

optional:
pageSize <integer> Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
filter <string> A filter to apply on the list results. The supported features are: user_pseudo_id, state. Example: \"user_pseudo_id = some_id\"
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `update_time` * `create_time` * `conversation_name` Example: \"update_time desc\" \"create_time\""
  ([parent]
    (projects-locations-collections-engines-conversations-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/conversations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-engines-sessions-create
  "Creates a Session. If the Session to create already exists, an ALREADY_EXISTS error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/sessions/create

parent <> 
GoogleCloudDiscoveryengineV1Session:
GoogleCloudDiscoveryengineV1Session"
  [parent GoogleCloudDiscoveryengineV1Session]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/sessions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1Session}))

(defn projects-locations-collections-engines-sessions-delete
  "Deletes a Session. If the Session to delete does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/sessions/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-engines-sessions-patch
  "Updates a Session. Session action type cannot be changed. If the Session to update does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/sessions/patch

name <> 
GoogleCloudDiscoveryengineV1Session:
GoogleCloudDiscoveryengineV1Session

optional:
updateMask <string> Indicates which fields in the provided Session to update. The following are NOT supported: * Session.name If not set or empty, all supported fields are updated."
  ([name GoogleCloudDiscoveryengineV1Session]
    (projects-locations-collections-engines-sessions-patch
      name
      GoogleCloudDiscoveryengineV1Session
      nil))
  ([name GoogleCloudDiscoveryengineV1Session optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Session})))

(defn projects-locations-collections-engines-sessions-get
  "Gets a Session.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/sessions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-collections-engines-sessions-list
  "Lists all Sessions by their parent DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/sessions/list

parent <> 

optional:
pageSize <integer> Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
filter <string> A filter to apply on the list results. The supported features are: user_pseudo_id, state. Example: \"user_pseudo_id = some_id\"
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `update_time` * `create_time` * `session_name` Example: \"update_time desc\" \"create_time\""
  ([parent]
    (projects-locations-collections-engines-sessions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/sessions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-collections-engines-sessions-answers-get
  "Gets a Answer.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/collections/engines/sessions/answers/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-identity_mapping_stores-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/identity_mapping_stores/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-identity_mapping_stores-operations-list
      name
      nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-identity_mapping_stores-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/identity_mapping_stores/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-completeQuery
  "Completes the specified user input with keyword suggestions.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/completeQuery

dataStore <> 

optional:
query <string> Required. The typeahead input used to fetch suggestions. Maximum length is 128 characters.
queryModel <string> Specifies the autocomplete data model. This overrides any model specified in the Configuration > Autocomplete section of the Cloud console. Currently supported values: * `document` - Using suggestions generated from user-imported documents. * `search-history` - Using suggestions generated from the past history of SearchService.Search API calls. Do not use it when there is no traffic for Search API. * `user-event` - Using suggestions generated from user-imported search events. * `document-completable` - Using suggestions taken directly from user-imported document fields marked as completable. Default values: * `document` is the default model for regular dataStores. * `search-history` is the default model for site search dataStores.
userPseudoId <string> A unique identifier for tracking visitors. For example, this could be implemented with an HTTP cookie, which should be able to uniquely identify a visitor on a single device. This unique identifier should not change if the visitor logs in or out of the website. This field should NOT have a fixed value such as `unknown_visitor`. This should be the same identifier as UserEvent.user_pseudo_id and SearchRequest.user_pseudo_id. The field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
includeTailSuggestions <boolean> Indicates if tail suggestions should be returned if there are no suggestions that match the full query. Even if set to true, if there are suggestions that match the full query, those are returned and no tail suggestions are returned."
  ([dataStore]
    (projects-locations-dataStores-completeQuery dataStore nil))
  ([dataStore optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+dataStore}:completeQuery",
       :uri-template-args {"dataStore" dataStore},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataStores-create
  "Creates a DataStore. DataStore is for storing Documents. To serve these documents for Search, or Recommendation use case, an Engine needs to be created separately.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/create

parent <> 
GoogleCloudDiscoveryengineV1DataStore:
GoogleCloudDiscoveryengineV1DataStore

optional:
dataStoreId <string> Required. The ID to use for the DataStore, which will become the final component of the DataStore's resource name. This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034) standard with a length limit of 63 characters. Otherwise, an INVALID_ARGUMENT error is returned.
createAdvancedSiteSearch <boolean> A boolean flag indicating whether user want to directly create an advanced data store for site search. If the data store is not configured as site search (GENERIC vertical and PUBLIC_WEBSITE content_config), this flag will be ignored.
skipDefaultSchemaCreation <boolean> A boolean flag indicating whether to skip the default schema creation for the data store. Only enable this flag if you are certain that the default schema is incompatible with your use case. If set to true, you must manually create a schema for the data store before any documents can be ingested. This flag cannot be specified if `data_store.starting_schema` is specified."
  ([parent GoogleCloudDiscoveryengineV1DataStore]
    (projects-locations-dataStores-create
      parent
      GoogleCloudDiscoveryengineV1DataStore
      nil))
  ([parent GoogleCloudDiscoveryengineV1DataStore optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/dataStores",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1DataStore})))

(defn projects-locations-dataStores-get
  "Gets a DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-list
  "Lists all the DataStores associated with the project.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/list

parent <> 

optional:
pageSize <integer> Maximum number of DataStores to return. If unspecified, defaults to 10. The maximum allowed value is 50. Values above 50 will be coerced to 50. If this field is negative, an INVALID_ARGUMENT is returned.
filter <string> Filter by solution type . For example: `filter = 'solution_type:SOLUTION_TYPE_SEARCH'`"
  ([parent] (projects-locations-dataStores-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/dataStores",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataStores-delete
  "Deletes a DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-patch
  "Updates a DataStore
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/patch

name <> 
GoogleCloudDiscoveryengineV1DataStore:
GoogleCloudDiscoveryengineV1DataStore

optional:
updateMask <string> Indicates which fields in the provided DataStore to update. If an unsupported or unknown field is provided, an INVALID_ARGUMENT error is returned."
  ([name GoogleCloudDiscoveryengineV1DataStore]
    (projects-locations-dataStores-patch
      name
      GoogleCloudDiscoveryengineV1DataStore
      nil))
  ([name GoogleCloudDiscoveryengineV1DataStore optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1DataStore})))

(defn projects-locations-dataStores-getSiteSearchEngine
  "Gets the SiteSearchEngine.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/getSiteSearchEngine

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-branches-batchGetDocumentsMetadata
  "Gets index freshness metadata for Documents. Supported for website search only.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/branches/batchGetDocumentsMetadata

parent <> 

optional:
matcher.urisMatcher.uris <string> The exact URIs to match by.
matcher.fhirMatcher.fhirResources <string> Required. The FHIR resources to match by. Format: projects/{project}/locations/{location}/datasets/{dataset}/fhirStores/{fhir_store}/fhir/{resource_type}/{fhir_resource_id}"
  ([parent]
    (projects-locations-dataStores-branches-batchGetDocumentsMetadata
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/batchGetDocumentsMetadata",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataStores-branches-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/branches/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-dataStores-branches-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataStores-branches-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/branches/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-branches-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/branches/operations/cancel

name <> 
GoogleLongrunningCancelOperationRequest:
GoogleLongrunningCancelOperationRequest"
  [name GoogleLongrunningCancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleLongrunningCancelOperationRequest}))

(defn projects-locations-dataStores-branches-documents-get
  "Gets a Document.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/branches/documents/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-branches-documents-list
  "Gets a list of Documents.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/branches/documents/list

parent <> 

optional:
pageSize <integer> Maximum number of Documents to return. If unspecified, defaults to 100. The maximum allowed value is 1000. Values above 1000 are set to 1000. If this field is negative, an `INVALID_ARGUMENT` error is returned."
  ([parent]
    (projects-locations-dataStores-branches-documents-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/documents",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataStores-branches-documents-create
  "Creates a Document.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/branches/documents/create

parent <> 
GoogleCloudDiscoveryengineV1Document:
GoogleCloudDiscoveryengineV1Document

optional:
documentId <string> Required. The ID to use for the Document, which becomes the final component of the Document.name. If the caller does not have permission to create the Document, regardless of whether or not it exists, a `PERMISSION_DENIED` error is returned. This field must be unique among all Documents with the same parent. Otherwise, an `ALREADY_EXISTS` error is returned. This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034) standard with a length limit of 63 characters. Otherwise, an `INVALID_ARGUMENT` error is returned."
  ([parent GoogleCloudDiscoveryengineV1Document]
    (projects-locations-dataStores-branches-documents-create
      parent
      GoogleCloudDiscoveryengineV1Document
      nil))
  ([parent GoogleCloudDiscoveryengineV1Document optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/documents",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Document})))

(defn projects-locations-dataStores-branches-documents-patch
  "Updates a Document.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/branches/documents/patch

name <> 
GoogleCloudDiscoveryengineV1Document:
GoogleCloudDiscoveryengineV1Document

optional:
allowMissing <boolean> If set to `true` and the Document is not found, a new Document is be created.
updateMask <string> Indicates which fields in the provided imported 'document' to update. If not set, by default updates all fields."
  ([name GoogleCloudDiscoveryengineV1Document]
    (projects-locations-dataStores-branches-documents-patch
      name
      GoogleCloudDiscoveryengineV1Document
      nil))
  ([name GoogleCloudDiscoveryengineV1Document optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Document})))

(defn projects-locations-dataStores-branches-documents-delete
  "Deletes a Document.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/branches/documents/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-branches-documents-import
  "Bulk import of multiple Documents. Request processing may be synchronous. Non-existing items are created. Note: It is possible for a subset of the Documents to be successfully updated.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/branches/documents/import

parent <> 
GoogleCloudDiscoveryengineV1ImportDocumentsRequest:
GoogleCloudDiscoveryengineV1ImportDocumentsRequest"
  [parent GoogleCloudDiscoveryengineV1ImportDocumentsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/documents:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1ImportDocumentsRequest}))

(defn projects-locations-dataStores-branches-documents-purge
  "Permanently deletes all selected Documents in a branch. This process is asynchronous. Depending on the number of Documents to be deleted, this operation can take hours to complete. Before the delete operation completes, some Documents might still be returned by DocumentService.GetDocument or DocumentService.ListDocuments. To get a list of the Documents to be deleted, set PurgeDocumentsRequest.force to false.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/branches/documents/purge

parent <> 
GoogleCloudDiscoveryengineV1PurgeDocumentsRequest:
GoogleCloudDiscoveryengineV1PurgeDocumentsRequest"
  [parent GoogleCloudDiscoveryengineV1PurgeDocumentsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/documents:purge",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1PurgeDocumentsRequest}))

(defn projects-locations-dataStores-completionSuggestions-import
  "Imports CompletionSuggestions for a DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/completionSuggestions/import

parent <> 
GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest:
GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest"
  [parent
   GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/completionSuggestions:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest}))

(defn projects-locations-dataStores-completionSuggestions-purge
  "Permanently deletes all CompletionSuggestions for a DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/completionSuggestions/purge

parent <> 
GoogleCloudDiscoveryengineV1PurgeCompletionSuggestionsRequest:
GoogleCloudDiscoveryengineV1PurgeCompletionSuggestionsRequest"
  [parent
   GoogleCloudDiscoveryengineV1PurgeCompletionSuggestionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/completionSuggestions:purge",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudDiscoveryengineV1PurgeCompletionSuggestionsRequest}))

(defn projects-locations-dataStores-schemas-get
  "Gets a Schema.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/schemas/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-schemas-list
  "Gets a list of Schemas.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/schemas/list

parent <> 

optional:
pageSize <integer> The maximum number of Schemas to return. The service may return fewer than this value. If unspecified, at most 100 Schemas are returned. The maximum value is 1000; values above 1000 are set to 1000."
  ([parent] (projects-locations-dataStores-schemas-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/schemas",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataStores-schemas-create
  "Creates a Schema.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/schemas/create

parent <> 
GoogleCloudDiscoveryengineV1Schema:
GoogleCloudDiscoveryengineV1Schema

optional:
schemaId <string> Required. The ID to use for the Schema, which becomes the final component of the Schema.name. This field should conform to [RFC-1034](https://tools.ietf.org/html/rfc1034) standard with a length limit of 63 characters."
  ([parent GoogleCloudDiscoveryengineV1Schema]
    (projects-locations-dataStores-schemas-create
      parent
      GoogleCloudDiscoveryengineV1Schema
      nil))
  ([parent GoogleCloudDiscoveryengineV1Schema optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/schemas",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Schema})))

(defn projects-locations-dataStores-schemas-patch
  "Updates a Schema.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/schemas/patch

name <> 
GoogleCloudDiscoveryengineV1Schema:
GoogleCloudDiscoveryengineV1Schema

optional:
allowMissing <boolean> If set to true, and the Schema is not found, a new Schema is created. In this situation, `update_mask` is ignored."
  ([name GoogleCloudDiscoveryengineV1Schema]
    (projects-locations-dataStores-schemas-patch
      name
      GoogleCloudDiscoveryengineV1Schema
      nil))
  ([name GoogleCloudDiscoveryengineV1Schema optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Schema})))

(defn projects-locations-dataStores-schemas-delete
  "Deletes a Schema.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/schemas/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-siteSearchEngine-enableAdvancedSiteSearch
  "Upgrade from basic site search to advanced site search.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/siteSearchEngine/enableAdvancedSiteSearch

siteSearchEngine <> 
GoogleCloudDiscoveryengineV1EnableAdvancedSiteSearchRequest:
GoogleCloudDiscoveryengineV1EnableAdvancedSiteSearchRequest"
  [siteSearchEngine
   GoogleCloudDiscoveryengineV1EnableAdvancedSiteSearchRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+siteSearchEngine}:enableAdvancedSiteSearch",
     :uri-template-args {"siteSearchEngine" siteSearchEngine},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudDiscoveryengineV1EnableAdvancedSiteSearchRequest}))

(defn projects-locations-dataStores-siteSearchEngine-disableAdvancedSiteSearch
  "Downgrade from advanced site search to basic site search.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/siteSearchEngine/disableAdvancedSiteSearch

siteSearchEngine <> 
GoogleCloudDiscoveryengineV1DisableAdvancedSiteSearchRequest:
GoogleCloudDiscoveryengineV1DisableAdvancedSiteSearchRequest"
  [siteSearchEngine
   GoogleCloudDiscoveryengineV1DisableAdvancedSiteSearchRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+siteSearchEngine}:disableAdvancedSiteSearch",
     :uri-template-args {"siteSearchEngine" siteSearchEngine},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudDiscoveryengineV1DisableAdvancedSiteSearchRequest}))

(defn projects-locations-dataStores-siteSearchEngine-recrawlUris
  "Request on-demand recrawl for a list of URIs.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/siteSearchEngine/recrawlUris

siteSearchEngine <> 
GoogleCloudDiscoveryengineV1RecrawlUrisRequest:
GoogleCloudDiscoveryengineV1RecrawlUrisRequest"
  [siteSearchEngine GoogleCloudDiscoveryengineV1RecrawlUrisRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+siteSearchEngine}:recrawlUris",
     :uri-template-args {"siteSearchEngine" siteSearchEngine},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1RecrawlUrisRequest}))

(defn projects-locations-dataStores-siteSearchEngine-targetSites-create
  "Creates a TargetSite.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/siteSearchEngine/targetSites/create

parent <> 
GoogleCloudDiscoveryengineV1TargetSite:
GoogleCloudDiscoveryengineV1TargetSite"
  [parent GoogleCloudDiscoveryengineV1TargetSite]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/targetSites",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1TargetSite}))

(defn projects-locations-dataStores-siteSearchEngine-targetSites-batchCreate
  "Creates TargetSite in a batch.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/siteSearchEngine/targetSites/batchCreate

parent <> 
GoogleCloudDiscoveryengineV1BatchCreateTargetSitesRequest:
GoogleCloudDiscoveryengineV1BatchCreateTargetSitesRequest"
  [parent GoogleCloudDiscoveryengineV1BatchCreateTargetSitesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/targetSites:batchCreate",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1BatchCreateTargetSitesRequest}))

(defn projects-locations-dataStores-siteSearchEngine-targetSites-get
  "Gets a TargetSite.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/siteSearchEngine/targetSites/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-siteSearchEngine-targetSites-patch
  "Updates a TargetSite.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/siteSearchEngine/targetSites/patch

name <> 
GoogleCloudDiscoveryengineV1TargetSite:
GoogleCloudDiscoveryengineV1TargetSite"
  [name GoogleCloudDiscoveryengineV1TargetSite]
  (client/*api-request*
    {:method :patch,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1TargetSite}))

(defn projects-locations-dataStores-siteSearchEngine-targetSites-delete
  "Deletes a TargetSite.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/siteSearchEngine/targetSites/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-siteSearchEngine-targetSites-list
  "Gets a list of TargetSites.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/siteSearchEngine/targetSites/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default. The maximum value is 1000; values above 1000 will be coerced to 1000. If this field is negative, an INVALID_ARGUMENT error is returned."
  ([parent]
    (projects-locations-dataStores-siteSearchEngine-targetSites-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/targetSites",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataStores-sessions-create
  "Creates a Session. If the Session to create already exists, an ALREADY_EXISTS error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/sessions/create

parent <> 
GoogleCloudDiscoveryengineV1Session:
GoogleCloudDiscoveryengineV1Session"
  [parent GoogleCloudDiscoveryengineV1Session]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/sessions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1Session}))

(defn projects-locations-dataStores-sessions-delete
  "Deletes a Session. If the Session to delete does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/sessions/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-sessions-patch
  "Updates a Session. Session action type cannot be changed. If the Session to update does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/sessions/patch

name <> 
GoogleCloudDiscoveryengineV1Session:
GoogleCloudDiscoveryengineV1Session

optional:
updateMask <string> Indicates which fields in the provided Session to update. The following are NOT supported: * Session.name If not set or empty, all supported fields are updated."
  ([name GoogleCloudDiscoveryengineV1Session]
    (projects-locations-dataStores-sessions-patch
      name
      GoogleCloudDiscoveryengineV1Session
      nil))
  ([name GoogleCloudDiscoveryengineV1Session optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Session})))

(defn projects-locations-dataStores-sessions-get
  "Gets a Session.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/sessions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-sessions-list
  "Lists all Sessions by their parent DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/sessions/list

parent <> 

optional:
pageSize <integer> Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
filter <string> A filter to apply on the list results. The supported features are: user_pseudo_id, state. Example: \"user_pseudo_id = some_id\"
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `update_time` * `create_time` * `session_name` Example: \"update_time desc\" \"create_time\""
  ([parent] (projects-locations-dataStores-sessions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/sessions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataStores-sessions-answers-get
  "Gets a Answer.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/sessions/answers/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-servingConfigs-search
  "Performs a search.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/servingConfigs/search

servingConfig <> 
GoogleCloudDiscoveryengineV1SearchRequest:
GoogleCloudDiscoveryengineV1SearchRequest"
  [servingConfig GoogleCloudDiscoveryengineV1SearchRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+servingConfig}:search",
     :uri-template-args {"servingConfig" servingConfig},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1SearchRequest}))

(defn projects-locations-dataStores-servingConfigs-answer
  "Answer query method.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/servingConfigs/answer

servingConfig <> 
GoogleCloudDiscoveryengineV1AnswerQueryRequest:
GoogleCloudDiscoveryengineV1AnswerQueryRequest"
  [servingConfig GoogleCloudDiscoveryengineV1AnswerQueryRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+servingConfig}:answer",
     :uri-template-args {"servingConfig" servingConfig},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1AnswerQueryRequest}))

(defn projects-locations-dataStores-servingConfigs-recommend
  "Makes a recommendation, which requires a contextual user event.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/servingConfigs/recommend

servingConfig <> 
GoogleCloudDiscoveryengineV1RecommendRequest:
GoogleCloudDiscoveryengineV1RecommendRequest"
  [servingConfig GoogleCloudDiscoveryengineV1RecommendRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+servingConfig}:recommend",
     :uri-template-args {"servingConfig" servingConfig},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1RecommendRequest}))

(defn projects-locations-dataStores-suggestionDenyListEntries-import
  "Imports all SuggestionDenyListEntry for a DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/suggestionDenyListEntries/import

parent <> 
GoogleCloudDiscoveryengineV1ImportSuggestionDenyListEntriesRequest:
GoogleCloudDiscoveryengineV1ImportSuggestionDenyListEntriesRequest"
  [parent
   GoogleCloudDiscoveryengineV1ImportSuggestionDenyListEntriesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/suggestionDenyListEntries:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudDiscoveryengineV1ImportSuggestionDenyListEntriesRequest}))

(defn projects-locations-dataStores-suggestionDenyListEntries-purge
  "Permanently deletes all SuggestionDenyListEntry for a DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/suggestionDenyListEntries/purge

parent <> 
GoogleCloudDiscoveryengineV1PurgeSuggestionDenyListEntriesRequest:
GoogleCloudDiscoveryengineV1PurgeSuggestionDenyListEntriesRequest"
  [parent
   GoogleCloudDiscoveryengineV1PurgeSuggestionDenyListEntriesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/suggestionDenyListEntries:purge",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudDiscoveryengineV1PurgeSuggestionDenyListEntriesRequest}))

(defn projects-locations-dataStores-userEvents-write
  "Writes a single user event.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/userEvents/write

parent <> 
GoogleCloudDiscoveryengineV1UserEvent:
GoogleCloudDiscoveryengineV1UserEvent

optional:
writeAsync <boolean> If set to true, the user event is written asynchronously after validation, and the API responds without waiting for the write."
  ([parent GoogleCloudDiscoveryengineV1UserEvent]
    (projects-locations-dataStores-userEvents-write
      parent
      GoogleCloudDiscoveryengineV1UserEvent
      nil))
  ([parent GoogleCloudDiscoveryengineV1UserEvent optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/userEvents:write",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1UserEvent})))

(defn projects-locations-dataStores-userEvents-collect
  "Writes a single user event from the browser. This uses a GET request to due to browser restriction of POST-ing to a third-party domain. This method is used only by the Discovery Engine API JavaScript pixel and Google Tag Manager. Users should not call this method directly.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/userEvents/collect

parent <> 

optional:
userEvent <string> Required. URL encoded UserEvent proto with a length limit of 2,000,000 characters.
uri <string> The URL including cgi-parameters but excluding the hash fragment with a length limit of 5,000 characters. This is often more useful than the referer URL, because many browsers only send the domain for third-party requests.
ets <string> The event timestamp in milliseconds. This prevents browser caching of otherwise identical get requests. The name is abbreviated to reduce the payload bytes."
  ([parent]
    (projects-locations-dataStores-userEvents-collect parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/userEvents:collect",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataStores-userEvents-purge
  "Deletes permanently all user events specified by the filter provided. Depending on the number of events specified by the filter, this operation could take hours or days to complete. To test a filter, use the list command first.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/userEvents/purge

parent <> 
GoogleCloudDiscoveryengineV1PurgeUserEventsRequest:
GoogleCloudDiscoveryengineV1PurgeUserEventsRequest"
  [parent GoogleCloudDiscoveryengineV1PurgeUserEventsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/userEvents:purge",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1PurgeUserEventsRequest}))

(defn projects-locations-dataStores-userEvents-import
  "Bulk import of user events. Request processing might be synchronous. Events that already exist are skipped. Use this method for backfilling historical user events. Operation.response is of type ImportResponse. Note that it is possible for a subset of the items to be successfully inserted. Operation.metadata is of type ImportMetadata.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/userEvents/import

parent <> 
GoogleCloudDiscoveryengineV1ImportUserEventsRequest:
GoogleCloudDiscoveryengineV1ImportUserEventsRequest"
  [parent GoogleCloudDiscoveryengineV1ImportUserEventsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/userEvents:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1ImportUserEventsRequest}))

(defn projects-locations-dataStores-controls-create
  "Creates a Control. By default 1000 controls are allowed for a data store. A request can be submitted to adjust this limit. If the Control to create already exists, an ALREADY_EXISTS error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/controls/create

parent <> 
GoogleCloudDiscoveryengineV1Control:
GoogleCloudDiscoveryengineV1Control

optional:
controlId <string> Required. The ID to use for the Control, which will become the final component of the Control's resource name. This value must be within 1-63 characters. Valid characters are /a-z-_/."
  ([parent GoogleCloudDiscoveryengineV1Control]
    (projects-locations-dataStores-controls-create
      parent
      GoogleCloudDiscoveryengineV1Control
      nil))
  ([parent GoogleCloudDiscoveryengineV1Control optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/controls",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Control})))

(defn projects-locations-dataStores-controls-delete
  "Deletes a Control. If the Control to delete does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/controls/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-controls-patch
  "Updates a Control. Control action type cannot be changed. If the Control to update does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/controls/patch

name <> 
GoogleCloudDiscoveryengineV1Control:
GoogleCloudDiscoveryengineV1Control

optional:
updateMask <string> Optional. Indicates which fields in the provided Control to update. The following are NOT supported: * Control.name * Control.solution_type If not set or empty, all supported fields are updated."
  ([name GoogleCloudDiscoveryengineV1Control]
    (projects-locations-dataStores-controls-patch
      name
      GoogleCloudDiscoveryengineV1Control
      nil))
  ([name GoogleCloudDiscoveryengineV1Control optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Control})))

(defn projects-locations-dataStores-controls-get
  "Gets a Control.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/controls/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-controls-list
  "Lists all Controls by their parent DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/controls/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
filter <string> Optional. A filter to apply on the list results. Supported features: * List all the products under the parent branch if filter is unset. Currently this field is unsupported."
  ([parent] (projects-locations-dataStores-controls-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/controls",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataStores-conversations-converse
  "Converses a conversation.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/conversations/converse

name <> 
GoogleCloudDiscoveryengineV1ConverseConversationRequest:
GoogleCloudDiscoveryengineV1ConverseConversationRequest"
  [name GoogleCloudDiscoveryengineV1ConverseConversationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+name}:converse",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1ConverseConversationRequest}))

(defn projects-locations-dataStores-conversations-create
  "Creates a Conversation. If the Conversation to create already exists, an ALREADY_EXISTS error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/conversations/create

parent <> 
GoogleCloudDiscoveryengineV1Conversation:
GoogleCloudDiscoveryengineV1Conversation"
  [parent GoogleCloudDiscoveryengineV1Conversation]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+parent}/conversations",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1Conversation}))

(defn projects-locations-dataStores-conversations-delete
  "Deletes a Conversation. If the Conversation to delete does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/conversations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-conversations-patch
  "Updates a Conversation. Conversation action type cannot be changed. If the Conversation to update does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/conversations/patch

name <> 
GoogleCloudDiscoveryengineV1Conversation:
GoogleCloudDiscoveryengineV1Conversation

optional:
updateMask <string> Indicates which fields in the provided Conversation to update. The following are NOT supported: * Conversation.name If not set or empty, all supported fields are updated."
  ([name GoogleCloudDiscoveryengineV1Conversation]
    (projects-locations-dataStores-conversations-patch
      name
      GoogleCloudDiscoveryengineV1Conversation
      nil))
  ([name GoogleCloudDiscoveryengineV1Conversation optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1Conversation})))

(defn projects-locations-dataStores-conversations-get
  "Gets a Conversation.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/conversations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-conversations-list
  "Lists all Conversations by their parent DataStore.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/conversations/list

parent <> 

optional:
pageSize <integer> Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
filter <string> A filter to apply on the list results. The supported features are: user_pseudo_id, state. Example: \"user_pseudo_id = some_id\"
orderBy <string> A comma-separated list of fields to order by, sorted in ascending order. Use \"desc\" after a field name for descending. Supported fields: * `update_time` * `create_time` * `conversation_name` Example: \"update_time desc\" \"create_time\""
  ([parent]
    (projects-locations-dataStores-conversations-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/conversations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataStores-models-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/models/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-dataStores-models-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataStores-models-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/models/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataStores-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-dataStores-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-dataStores-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/dataStores/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://discoveryengine.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-groundingConfigs-check
  "Performs a grounding check.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/groundingConfigs/check

groundingConfig <> 
GoogleCloudDiscoveryengineV1CheckGroundingRequest:
GoogleCloudDiscoveryengineV1CheckGroundingRequest"
  [groundingConfig GoogleCloudDiscoveryengineV1CheckGroundingRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+groundingConfig}:check",
     :uri-template-args {"groundingConfig" groundingConfig},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1CheckGroundingRequest}))

(defn projects-locations-rankingConfigs-rank
  "Ranks a list of text records based on the given input query.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/rankingConfigs/rank

rankingConfig <> 
GoogleCloudDiscoveryengineV1RankRequest:
GoogleCloudDiscoveryengineV1RankRequest"
  [rankingConfig GoogleCloudDiscoveryengineV1RankRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://discoveryengine.googleapis.com/v1/{+rankingConfig}:rank",
     :uri-template-args {"rankingConfig" rankingConfig},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDiscoveryengineV1RankRequest}))

(defn projects-locations-userEvents-write
  "Writes a single user event.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/userEvents/write

parent <> 
GoogleCloudDiscoveryengineV1UserEvent:
GoogleCloudDiscoveryengineV1UserEvent

optional:
writeAsync <boolean> If set to true, the user event is written asynchronously after validation, and the API responds without waiting for the write."
  ([parent GoogleCloudDiscoveryengineV1UserEvent]
    (projects-locations-userEvents-write
      parent
      GoogleCloudDiscoveryengineV1UserEvent
      nil))
  ([parent GoogleCloudDiscoveryengineV1UserEvent optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/userEvents:write",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudDiscoveryengineV1UserEvent})))

(defn projects-locations-userEvents-collect
  "Writes a single user event from the browser. This uses a GET request to due to browser restriction of POST-ing to a third-party domain. This method is used only by the Discovery Engine API JavaScript pixel and Google Tag Manager. Users should not call this method directly.
https://cloud.google.com/discovery-engine/media/docs/v1/reference/rest/v1/projects/locations/userEvents/collect

parent <> 

optional:
userEvent <string> Required. URL encoded UserEvent proto with a length limit of 2,000,000 characters.
uri <string> The URL including cgi-parameters but excluding the hash fragment with a length limit of 5,000 characters. This is often more useful than the referer URL, because many browsers only send the domain for third-party requests.
ets <string> The event timestamp in milliseconds. This prevents browser caching of otherwise identical get requests. The name is abbreviated to reduce the payload bytes."
  ([parent] (projects-locations-userEvents-collect parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://discoveryengine.googleapis.com/v1/{+parent}/userEvents:collect",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
