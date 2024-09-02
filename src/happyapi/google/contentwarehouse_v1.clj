(ns happyapi.google.contentwarehouse-v1
  "Document AI Warehouse API

See: https://cloud.google.com/document-warehouse/docs/overview"
  (:require [happyapi.providers.google :as client]))

(defn projects-fetchAcl
  "Gets the access control policy for a resource. Returns NOT_FOUND error if the resource does not exist. Returns an empty policy if the resource exists but does not have a policy set.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/fetchAcl

resource <> 
GoogleCloudContentwarehouseV1FetchAclRequest:
GoogleCloudContentwarehouseV1FetchAclRequest"
  [resource GoogleCloudContentwarehouseV1FetchAclRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+resource}:fetchAcl",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1FetchAclRequest}))

(defn projects-setAcl
  "Sets the access control policy for a resource. Replaces any existing policy.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/setAcl

resource <> 
GoogleCloudContentwarehouseV1SetAclRequest:
GoogleCloudContentwarehouseV1SetAclRequest"
  [resource GoogleCloudContentwarehouseV1SetAclRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+resource}:setAcl",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1SetAclRequest}))

(defn projects-locations-initialize
  "Provisions resources for given tenant project. Returns a long running operation.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/initialize

location <> 
GoogleCloudContentwarehouseV1InitializeProjectRequest:
GoogleCloudContentwarehouseV1InitializeProjectRequest"
  [location GoogleCloudContentwarehouseV1InitializeProjectRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+location}:initialize",
     :uri-template-args {"location" location},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1InitializeProjectRequest}))

(defn projects-locations-getStatus
  "Get the project status.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/getStatus

location <> "
  [location]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+location}:getStatus",
     :uri-template-args {"location" location},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-runPipeline
  "Run a predefined pipeline.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/runPipeline

name <> 
GoogleCloudContentwarehouseV1RunPipelineRequest:
GoogleCloudContentwarehouseV1RunPipelineRequest"
  [name GoogleCloudContentwarehouseV1RunPipelineRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}:runPipeline",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1RunPipelineRequest}))

(defn projects-locations-ruleSets-list
  "Lists rulesets.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/ruleSets/list

parent <> 

optional:
pageSize <integer> The maximum number of rule sets to return. The service may return fewer than this value. If unspecified, at most 50 rule sets will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-ruleSets-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://contentwarehouse.googleapis.com/v1/{+parent}/ruleSets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-ruleSets-patch
  "Updates a ruleset. Returns INVALID_ARGUMENT if the name of the ruleset is non-empty and does not equal the existing name.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/ruleSets/patch

name <> 
GoogleCloudContentwarehouseV1UpdateRuleSetRequest:
GoogleCloudContentwarehouseV1UpdateRuleSetRequest"
  [name GoogleCloudContentwarehouseV1UpdateRuleSetRequest]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1UpdateRuleSetRequest}))

(defn projects-locations-ruleSets-delete
  "Deletes a ruleset. Returns NOT_FOUND if the document does not exist.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/ruleSets/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-ruleSets-create
  "Creates a ruleset.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/ruleSets/create

parent <> 
GoogleCloudContentwarehouseV1RuleSet:
GoogleCloudContentwarehouseV1RuleSet"
  [parent GoogleCloudContentwarehouseV1RuleSet]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+parent}/ruleSets",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1RuleSet}))

(defn projects-locations-ruleSets-get
  "Gets a ruleset. Returns NOT_FOUND if the ruleset does not exist.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/ruleSets/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-documentSchemas-list
  "Lists document schemas.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documentSchemas/list

parent <> 

optional:
pageSize <integer> The maximum number of document schemas to return. The service may return fewer than this value. If unspecified, at most 50 document schemas will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-documentSchemas-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://contentwarehouse.googleapis.com/v1/{+parent}/documentSchemas",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-documentSchemas-get
  "Gets a document schema. Returns NOT_FOUND if the document schema does not exist.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documentSchemas/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-documentSchemas-delete
  "Deletes a document schema. Returns NOT_FOUND if the document schema does not exist. Returns BAD_REQUEST if the document schema has documents depending on it.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documentSchemas/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-documentSchemas-create
  "Creates a document schema.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documentSchemas/create

parent <> 
GoogleCloudContentwarehouseV1DocumentSchema:
GoogleCloudContentwarehouseV1DocumentSchema"
  [parent GoogleCloudContentwarehouseV1DocumentSchema]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+parent}/documentSchemas",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1DocumentSchema}))

(defn projects-locations-documentSchemas-patch
  "Updates a Document Schema. Returns INVALID_ARGUMENT if the name of the Document Schema is non-empty and does not equal the existing name. Supports only appending new properties, adding new ENUM possible values, and updating the EnumTypeOptions.validation_check_disabled flag for ENUM possible values. Updating existing properties will result into INVALID_ARGUMENT.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documentSchemas/patch

name <> 
GoogleCloudContentwarehouseV1UpdateDocumentSchemaRequest:
GoogleCloudContentwarehouseV1UpdateDocumentSchemaRequest"
  [name GoogleCloudContentwarehouseV1UpdateDocumentSchemaRequest]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1UpdateDocumentSchemaRequest}))

(defn projects-locations-documents-delete
  "Deletes a document. Returns NOT_FOUND if the document does not exist.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/delete

name <> 
GoogleCloudContentwarehouseV1DeleteDocumentRequest:
GoogleCloudContentwarehouseV1DeleteDocumentRequest"
  [name GoogleCloudContentwarehouseV1DeleteDocumentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}:delete",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1DeleteDocumentRequest}))

(defn projects-locations-documents-setAcl
  "Sets the access control policy for a resource. Replaces any existing policy.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/setAcl

resource <> 
GoogleCloudContentwarehouseV1SetAclRequest:
GoogleCloudContentwarehouseV1SetAclRequest"
  [resource GoogleCloudContentwarehouseV1SetAclRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+resource}:setAcl",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1SetAclRequest}))

(defn projects-locations-documents-patch
  "Updates a document. Returns INVALID_ARGUMENT if the name of the document is non-empty and does not equal the existing name.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/patch

name <> 
GoogleCloudContentwarehouseV1UpdateDocumentRequest:
GoogleCloudContentwarehouseV1UpdateDocumentRequest"
  [name GoogleCloudContentwarehouseV1UpdateDocumentRequest]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1UpdateDocumentRequest}))

(defn projects-locations-documents-fetchAcl
  "Gets the access control policy for a resource. Returns NOT_FOUND error if the resource does not exist. Returns an empty policy if the resource exists but does not have a policy set.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/fetchAcl

resource <> 
GoogleCloudContentwarehouseV1FetchAclRequest:
GoogleCloudContentwarehouseV1FetchAclRequest"
  [resource GoogleCloudContentwarehouseV1FetchAclRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+resource}:fetchAcl",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1FetchAclRequest}))

(defn projects-locations-documents-lock
  "Lock the document so the document cannot be updated by other users.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/lock

name <> 
GoogleCloudContentwarehouseV1LockDocumentRequest:
GoogleCloudContentwarehouseV1LockDocumentRequest"
  [name GoogleCloudContentwarehouseV1LockDocumentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}:lock",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1LockDocumentRequest}))

(defn projects-locations-documents-create
  "Creates a document.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/create

parent <> 
GoogleCloudContentwarehouseV1CreateDocumentRequest:
GoogleCloudContentwarehouseV1CreateDocumentRequest"
  [parent GoogleCloudContentwarehouseV1CreateDocumentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+parent}/documents",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1CreateDocumentRequest}))

(defn projects-locations-documents-linkedSources
  "Return all source document-links from the document.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/linkedSources

parent <> 
GoogleCloudContentwarehouseV1ListLinkedSourcesRequest:
GoogleCloudContentwarehouseV1ListLinkedSourcesRequest"
  [parent GoogleCloudContentwarehouseV1ListLinkedSourcesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+parent}/linkedSources",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1ListLinkedSourcesRequest}))

(defn projects-locations-documents-linkedTargets
  "Return all target document-links from the document.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/linkedTargets

parent <> 
GoogleCloudContentwarehouseV1ListLinkedTargetsRequest:
GoogleCloudContentwarehouseV1ListLinkedTargetsRequest"
  [parent GoogleCloudContentwarehouseV1ListLinkedTargetsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+parent}/linkedTargets",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1ListLinkedTargetsRequest}))

(defn projects-locations-documents-search
  "Searches for documents using provided SearchDocumentsRequest. This call only returns documents that the caller has permission to search against.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/search

parent <> 
GoogleCloudContentwarehouseV1SearchDocumentsRequest:
GoogleCloudContentwarehouseV1SearchDocumentsRequest"
  [parent GoogleCloudContentwarehouseV1SearchDocumentsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+parent}/documents:search",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1SearchDocumentsRequest}))

(defn projects-locations-documents-get
  "Gets a document. Returns NOT_FOUND if the document does not exist.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/get

name <> 
GoogleCloudContentwarehouseV1GetDocumentRequest:
GoogleCloudContentwarehouseV1GetDocumentRequest"
  [name GoogleCloudContentwarehouseV1GetDocumentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}:get",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1GetDocumentRequest}))

(defn projects-locations-documents-referenceId-get
  "Gets a document. Returns NOT_FOUND if the document does not exist.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/referenceId/get

name <> 
GoogleCloudContentwarehouseV1GetDocumentRequest:
GoogleCloudContentwarehouseV1GetDocumentRequest"
  [name GoogleCloudContentwarehouseV1GetDocumentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}:get",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1GetDocumentRequest}))

(defn projects-locations-documents-referenceId-delete
  "Deletes a document. Returns NOT_FOUND if the document does not exist.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/referenceId/delete

name <> 
GoogleCloudContentwarehouseV1DeleteDocumentRequest:
GoogleCloudContentwarehouseV1DeleteDocumentRequest"
  [name GoogleCloudContentwarehouseV1DeleteDocumentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}:delete",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1DeleteDocumentRequest}))

(defn projects-locations-documents-referenceId-patch
  "Updates a document. Returns INVALID_ARGUMENT if the name of the document is non-empty and does not equal the existing name.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/referenceId/patch

name <> 
GoogleCloudContentwarehouseV1UpdateDocumentRequest:
GoogleCloudContentwarehouseV1UpdateDocumentRequest"
  [name GoogleCloudContentwarehouseV1UpdateDocumentRequest]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1UpdateDocumentRequest}))

(defn projects-locations-documents-documentLinks-create
  "Create a link between a source document and a target document.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/documentLinks/create

parent <> 
GoogleCloudContentwarehouseV1CreateDocumentLinkRequest:
GoogleCloudContentwarehouseV1CreateDocumentLinkRequest"
  [parent GoogleCloudContentwarehouseV1CreateDocumentLinkRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+parent}/documentLinks",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1CreateDocumentLinkRequest}))

(defn projects-locations-documents-documentLinks-delete
  "Remove the link between the source and target documents.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/documents/documentLinks/delete

name <> 
GoogleCloudContentwarehouseV1DeleteDocumentLinkRequest:
GoogleCloudContentwarehouseV1DeleteDocumentLinkRequest"
  [name GoogleCloudContentwarehouseV1DeleteDocumentLinkRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}:delete",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1DeleteDocumentLinkRequest}))

(defn projects-locations-synonymSets-list
  "Returns all SynonymSets (for all contexts) for the specified location.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/synonymSets/list

parent <> 

optional:
pageSize <integer> The maximum number of synonymSets to return. The service may return fewer than this value. If unspecified, at most 50 rule sets will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-synonymSets-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://contentwarehouse.googleapis.com/v1/{+parent}/synonymSets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-synonymSets-patch
  "Remove the existing SynonymSet for the context and replaces it with a new one. Throws a NOT_FOUND exception if the SynonymSet is not found.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/synonymSets/patch

name <> 
GoogleCloudContentwarehouseV1SynonymSet:
GoogleCloudContentwarehouseV1SynonymSet"
  [name GoogleCloudContentwarehouseV1SynonymSet]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1SynonymSet}))

(defn projects-locations-synonymSets-create
  "Creates a SynonymSet for a single context. Throws an ALREADY_EXISTS exception if a synonymset already exists for the context.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/synonymSets/create

parent <> 
GoogleCloudContentwarehouseV1SynonymSet:
GoogleCloudContentwarehouseV1SynonymSet"
  [parent GoogleCloudContentwarehouseV1SynonymSet]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+parent}/synonymSets",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudContentwarehouseV1SynonymSet}))

(defn projects-locations-synonymSets-delete
  "Deletes a SynonymSet for a given context. Throws a NOT_FOUND exception if the SynonymSet is not found.
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/synonymSets/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-synonymSets-get
  "Gets a SynonymSet for a particular context. Throws a NOT_FOUND exception if the Synonymset does not exist
https://cloud.google.com/document-warehouse/docs/overview/v1/reference/rest/v1/projects/locations/synonymSets/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://contentwarehouse.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
