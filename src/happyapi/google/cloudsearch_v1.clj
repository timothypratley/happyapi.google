(ns happyapi.google.cloudsearch-v1
  "Cloud Search API
Cloud Search provides cloud-based search capabilities over Google Workspace data. The Cloud Search API allows indexing of non-Google Workspace data into Cloud Search.
See: https://developers.google.com/cloud-search/docs/guides/")

(defn operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudsearch.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.debug"
    "https://www.googleapis.com/auth/cloud_search.indexing"
    "https://www.googleapis.com/auth/cloud_search.settings"
    "https://www.googleapis.com/auth/cloud_search.settings.indexing"
    "https://www.googleapis.com/auth/cloud_search.settings.query"]})

(defn operations-lro-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/operations/lro/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (operations-lro-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://cloudsearch.googleapis.com/v1/{+name}/lro",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.debug"
      "https://www.googleapis.com/auth/cloud_search.indexing"
      "https://www.googleapis.com/auth/cloud_search.settings"
      "https://www.googleapis.com/auth/cloud_search.settings.indexing"
      "https://www.googleapis.com/auth/cloud_search.settings.query"]}))

(defn debug-datasources-items-checkAccess
  "Checks whether an item is accessible by specified principal. Principal must be a user; groups and domain values aren't supported. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/debug/datasources/items/checkAccess

name <> 
Principal:
Principal

optional:
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([name Principal]
    (debug-datasources-items-checkAccess name Principal nil))
  ([name Principal optional]
    {:method :post,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/debug/{+name}:checkAccess",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.debug"],
     :body Principal}))

(defn debug-datasources-items-searchByViewUrl
  "Fetches the item whose viewUrl exactly matches that of the URL provided in the request. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/debug/datasources/items/searchByViewUrl

name <> 
SearchItemsByViewUrlRequest:
SearchItemsByViewUrlRequest"
  [name SearchItemsByViewUrlRequest]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/debug/{+name}/items:searchByViewUrl",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.debug"],
   :body SearchItemsByViewUrlRequest})

(defn debug-datasources-items-unmappedids-list
  "List all unmapped identities for a specific item. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/debug/datasources/items/unmappedids/list

parent <> 

optional:
pageSize <integer> Maximum number of items to fetch in a request. Defaults to 100.
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([parent] (debug-datasources-items-unmappedids-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/debug/{+parent}/unmappedids",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.debug"]}))

(defn debug-identitysources-unmappedids-list
  "Lists unmapped user identities for an identity source. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/debug/identitysources/unmappedids/list

parent <> 

optional:
resolutionStatusCode <string> Limit users selection to this status.
pageSize <integer> Maximum number of items to fetch in a request. Defaults to 100.
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([parent] (debug-identitysources-unmappedids-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/debug/{+parent}/unmappedids",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.debug"]}))

(defn debug-identitysources-items-listForunmappedidentity
  "Lists names of items associated with an unmapped identity. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/debug/identitysources/items/listForunmappedidentity

parent <> 

optional:
userResourceName <string> 
groupResourceName <string> 
pageSize <integer> Maximum number of items to fetch in a request. Defaults to 100.
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([parent]
    (debug-identitysources-items-listForunmappedidentity parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/debug/{+parent}/items:forunmappedidentity",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.debug"]}))

(defn settings-getCustomer
  "Get customer settings. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/getCustomer"
  []
  {:method :get,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/settings/customer",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.settings"
    "https://www.googleapis.com/auth/cloud_search.settings.indexing"]})

(defn settings-updateCustomer
  "Update customer settings. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/updateCustomer

CustomerSettings:
CustomerSettings

optional:
updateMask <string> Update mask to control which fields get updated. If you specify a field in the update_mask but don't specify its value here, that field will be cleared. If the mask is not present or empty, all fields will be updated. Currently supported field paths: vpc_settings and audit_logging_settings"
  ([CustomerSettings] (settings-updateCustomer CustomerSettings nil))
  ([CustomerSettings optional]
    {:method :patch,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/settings/customer",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.settings"
      "https://www.googleapis.com/auth/cloud_search.settings.indexing"],
     :body CustomerSettings}))

(defn settings-searchapplications-list
  "Lists all search applications. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/searchapplications/list

optional:
pageSize <integer> The maximum number of items to return.
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([] (settings-searchapplications-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/settings/searchapplications",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.settings"
      "https://www.googleapis.com/auth/cloud_search.settings.query"]}))

(defn settings-searchapplications-get
  "Gets the specified search application. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/searchapplications/get

name <> 

optional:
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([name] (settings-searchapplications-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/settings/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.settings"
      "https://www.googleapis.com/auth/cloud_search.settings.query"]}))

(defn settings-searchapplications-create
  "Creates a search application. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/searchapplications/create

SearchApplication:
SearchApplication"
  [SearchApplication]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/settings/searchapplications",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.settings"
    "https://www.googleapis.com/auth/cloud_search.settings.query"],
   :body SearchApplication})

(defn settings-searchapplications-update
  "Updates a search application. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/searchapplications/update

name <> 
SearchApplication:
SearchApplication

optional:
updateMask <string> Only applies to [`settings.searchapplications.patch`](https://developers.google.com/cloud-search/docs/reference/rest/v1/settings.searchapplications/patch). Update mask to control which fields to update. Example field paths: `search_application.name`, `search_application.displayName`. * If `update_mask` is non-empty, then only the fields specified in the `update_mask` are updated. * If you specify a field in the `update_mask`, but don't specify its value in the `search_application`, then that field is cleared. * If the `update_mask` is not present or empty or has the value `*`, then all fields are updated."
  ([name SearchApplication]
    (settings-searchapplications-update name SearchApplication nil))
  ([name SearchApplication optional]
    {:method :put,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/settings/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.settings"
      "https://www.googleapis.com/auth/cloud_search.settings.query"],
     :body SearchApplication}))

(defn settings-searchapplications-patch
  "Updates a search application. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/searchapplications/patch

name <> 
SearchApplication:
SearchApplication

optional:
updateMask <string> Only applies to [`settings.searchapplications.patch`](https://developers.google.com/cloud-search/docs/reference/rest/v1/settings.searchapplications/patch). Update mask to control which fields to update. Example field paths: `search_application.name`, `search_application.displayName`. * If `update_mask` is non-empty, then only the fields specified in the `update_mask` are updated. * If you specify a field in the `update_mask`, but don't specify its value in the `search_application`, then that field is cleared. * If the `update_mask` is not present or empty or has the value `*`, then all fields are updated."
  ([name SearchApplication]
    (settings-searchapplications-patch name SearchApplication nil))
  ([name SearchApplication optional]
    {:method :patch,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/settings/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.settings"
      "https://www.googleapis.com/auth/cloud_search.settings.query"],
     :body SearchApplication}))

(defn settings-searchapplications-delete
  "Deletes a search application. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/searchapplications/delete

name <> 

optional:
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([name] (settings-searchapplications-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/settings/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.settings"
      "https://www.googleapis.com/auth/cloud_search.settings.query"]}))

(defn settings-searchapplications-reset
  "Resets a search application to default settings. This will return an empty response. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/searchapplications/reset

name <> 
ResetSearchApplicationRequest:
ResetSearchApplicationRequest"
  [name ResetSearchApplicationRequest]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/settings/{+name}:reset",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.settings"
    "https://www.googleapis.com/auth/cloud_search.settings.query"],
   :body ResetSearchApplicationRequest})

(defn settings-datasources-create
  "Creates a datasource. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/datasources/create

DataSource:
DataSource"
  [DataSource]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/settings/datasources",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.settings"
    "https://www.googleapis.com/auth/cloud_search.settings.indexing"],
   :body DataSource})

(defn settings-datasources-delete
  "Deletes a datasource. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/datasources/delete

name <> 

optional:
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([name] (settings-datasources-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/settings/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.settings"
      "https://www.googleapis.com/auth/cloud_search.settings.indexing"]}))

(defn settings-datasources-get
  "Gets a datasource. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/datasources/get

name <> 

optional:
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([name] (settings-datasources-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/settings/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.settings"
      "https://www.googleapis.com/auth/cloud_search.settings.indexing"]}))

(defn settings-datasources-update
  "Updates a datasource. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/datasources/update

name <> 
UpdateDataSourceRequest:
UpdateDataSourceRequest"
  [name UpdateDataSourceRequest]
  {:method :put,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/settings/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.settings"
    "https://www.googleapis.com/auth/cloud_search.settings.indexing"],
   :body UpdateDataSourceRequest})

(defn settings-datasources-patch
  "Updates a datasource. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/datasources/patch

name <> 
DataSource:
DataSource

optional:
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
updateMask <string> Only applies to [`settings.datasources.patch`](https://developers.google.com/cloud-search/docs/reference/rest/v1/settings.datasources/patch). Update mask to control which fields to update. Example field paths: `name`, `displayName`. * If `update_mask` is non-empty, then only the fields specified in the `update_mask` are updated. * If you specify a field in the `update_mask`, but don't specify its value in the source, that field is cleared. * If the `update_mask` is not present or empty or has the value `*`, then all fields are updated."
  ([name DataSource] (settings-datasources-patch name DataSource nil))
  ([name DataSource optional]
    {:method :patch,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/settings/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.settings"
      "https://www.googleapis.com/auth/cloud_search.settings.indexing"],
     :body DataSource}))

(defn settings-datasources-list
  "Lists datasources. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/settings/datasources/list

optional:
pageSize <integer> Maximum number of datasources to fetch in a request. The max value is 1000. The default value is 1000.
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([] (settings-datasources-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/settings/datasources",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.settings"
      "https://www.googleapis.com/auth/cloud_search.settings.indexing"]}))

(defn initializeCustomer
  "Enables `third party` support in Google Cloud Search. **Note:** This API requires an admin account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/initializeCustomer

InitializeCustomerRequest:
InitializeCustomerRequest"
  [InitializeCustomerRequest]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1:initializeCustomer",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.settings"
    "https://www.googleapis.com/auth/cloud_search.settings.indexing"],
   :body InitializeCustomerRequest})

(defn indexing-datasources-updateSchema
  "Updates the schema of a data source. This method does not perform incremental updates to the schema. Instead, this method updates the schema by overwriting the entire schema. **Note:** This API requires an admin or service account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/indexing/datasources/updateSchema

name <> 
UpdateSchemaRequest:
UpdateSchemaRequest"
  [name UpdateSchemaRequest]
  {:method :put,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/indexing/{+name}/schema",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.settings"
    "https://www.googleapis.com/auth/cloud_search.settings.indexing"],
   :body UpdateSchemaRequest})

(defn indexing-datasources-getSchema
  "Gets the schema of a data source. **Note:** This API requires an admin or service account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/indexing/datasources/getSchema

name <> 

optional:
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([name] (indexing-datasources-getSchema name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/indexing/{+name}/schema",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.settings"
      "https://www.googleapis.com/auth/cloud_search.settings.indexing"]}))

(defn indexing-datasources-deleteSchema
  "Deletes the schema of a data source. **Note:** This API requires an admin or service account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/indexing/datasources/deleteSchema

name <> 

optional:
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([name] (indexing-datasources-deleteSchema name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/indexing/{+name}/schema",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.settings"
      "https://www.googleapis.com/auth/cloud_search.settings.indexing"]}))

(defn indexing-datasources-items-list
  "Lists all or a subset of Item resources. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/indexing/datasources/items/list

name <> 

optional:
connectorName <string> The name of connector making this call. Format: datasources/{source_id}/connectors/{ID}
brief <boolean> When set to true, the indexing system only populates the following fields: name, version, queue. metadata.hash, metadata.title, metadata.sourceRepositoryURL, metadata.objectType, metadata.createTime, metadata.updateTime, metadata.contentLanguage, metadata.mimeType, structured_data.hash, content.hash, itemType, itemStatus.code, itemStatus.processingError.code, itemStatus.repositoryError.type, If this value is false, then all the fields are populated in Item.
pageSize <integer> Maximum number of items to fetch in a request. The max value is 1000 when brief is true. The max value is 10 if brief is false. The default value is 10
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([name] (indexing-datasources-items-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/indexing/{+name}/items",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.indexing"]}))

(defn indexing-datasources-items-index
  "Updates Item ACL, metadata, and content. It will insert the Item if it does not exist. This method does not support partial updates. Fields with no provided values are cleared out in the Cloud Search index. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/indexing/datasources/items/index

name <> 
IndexItemRequest:
IndexItemRequest"
  [name IndexItemRequest]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/indexing/{+name}:index",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.indexing"],
   :body IndexItemRequest})

(defn indexing-datasources-items-deleteQueueItems
  "Deletes all items in a queue. This method is useful for deleting stale items. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/indexing/datasources/items/deleteQueueItems

name <> 
DeleteQueueItemsRequest:
DeleteQueueItemsRequest"
  [name DeleteQueueItemsRequest]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/indexing/{+name}/items:deleteQueueItems",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.indexing"],
   :body DeleteQueueItemsRequest})

(defn indexing-datasources-items-unreserve
  "Unreserves all items from a queue, making them all eligible to be polled. This method is useful for resetting the indexing queue after a connector has been restarted. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/indexing/datasources/items/unreserve

name <> 
UnreserveItemsRequest:
UnreserveItemsRequest"
  [name UnreserveItemsRequest]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/indexing/{+name}/items:unreserve",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.indexing"],
   :body UnreserveItemsRequest})

(defn indexing-datasources-items-delete
  "Deletes Item resource for the specified resource name. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/indexing/datasources/items/delete

name <> 

optional:
version <string> Required. The incremented version of the item to delete from the index. The indexing system stores the version from the datasource as a byte string and compares the Item version in the index to the version of the queued Item using lexical ordering. Cloud Search Indexing won't delete any queued item with a version value that is less than or equal to the version of the currently indexed item. The maximum length for this field is 1024 bytes. For information on how item version affects the deletion process, refer to [Handle revisions after manual deletes](https://developers.google.com/cloud-search/docs/guides/operations).
connectorName <string> The name of connector making this call. Format: datasources/{source_id}/connectors/{ID}
mode <string> Required. The RequestMode for this request.
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([name] (indexing-datasources-items-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/indexing/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.indexing"]}))

(defn indexing-datasources-items-upload
  "Creates an upload session for uploading item content. For items smaller than 100 KB, it's easier to embed the content inline within an index request. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/indexing/datasources/items/upload

name <> 
StartUploadItemRequest:
StartUploadItemRequest"
  [name StartUploadItemRequest]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/indexing/{+name}:upload",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.indexing"],
   :body StartUploadItemRequest})

(defn indexing-datasources-items-push
  "Pushes an item onto a queue for later polling and updating. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/indexing/datasources/items/push

name <> 
PushItemRequest:
PushItemRequest"
  [name PushItemRequest]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/indexing/{+name}:push",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.indexing"],
   :body PushItemRequest})

(defn indexing-datasources-items-poll
  "Polls for unreserved items from the indexing queue and marks a set as reserved, starting with items that have the oldest timestamp from the highest priority ItemStatus. The priority order is as follows: ERROR MODIFIED NEW_ITEM ACCEPTED Reserving items ensures that polling from other threads cannot create overlapping sets. After handling the reserved items, the client should put items back into the unreserved state, either by calling index, or by calling push with the type REQUEUE. Items automatically become available (unreserved) after 4 hours even if no update or push method is called. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/indexing/datasources/items/poll

name <> 
PollItemsRequest:
PollItemsRequest"
  [name PollItemsRequest]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/indexing/{+name}/items:poll",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.indexing"],
   :body PollItemsRequest})

(defn indexing-datasources-items-get
  "Gets Item resource by item name. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/indexing/datasources/items/get

name <> 

optional:
connectorName <string> The name of connector making this call. Format: datasources/{source_id}/connectors/{ID}
debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field."
  ([name] (indexing-datasources-items-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/indexing/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.indexing"]}))

(defn query-suggest
  "Provides suggestions for autocompleting the query. **Note:** This API requires a standard end user account to execute. A service account can't perform Query API requests directly; to use a service account to perform queries, set up [Google Workspace domain-wide delegation of authority](https://developers.google.com/cloud-search/docs/guides/delegation/).
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/query/suggest

SuggestRequest:
SuggestRequest"
  [SuggestRequest]
  {:method :post,
   :uri-template "https://cloudsearch.googleapis.com/v1/query/suggest",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.query"],
   :body SuggestRequest})

(defn query-search
  "The Cloud Search Query API provides the search method, which returns the most relevant results from a user query. The results can come from Google Workspace apps, such as Gmail or Google Drive, or they can come from data that you have indexed from a third party. **Note:** This API requires a standard end user account to execute. A service account can't perform Query API requests directly; to use a service account to perform queries, set up [Google Workspace domain-wide delegation of authority](https://developers.google.com/cloud-search/docs/guides/delegation/).
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/query/search

SearchRequest:
SearchRequest"
  [SearchRequest]
  {:method :post,
   :uri-template "https://cloudsearch.googleapis.com/v1/query/search",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.query"],
   :body SearchRequest})

(defn query-removeActivity
  "Provides functionality to remove logged activity for a user. Currently to be used only for Chat 1p clients **Note:** This API requires a standard end user account to execute. A service account can't perform Remove Activity requests directly; to use a service account to perform queries, set up [Google Workspace domain-wide delegation of authority](https://developers.google.com/cloud-search/docs/guides/delegation/).
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/query/removeActivity

RemoveActivityRequest:
RemoveActivityRequest"
  [RemoveActivityRequest]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/query:removeActivity",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.query"],
   :body RemoveActivityRequest})

(defn query-debugSearch
  "Returns Debug information for Cloud Search Query API provides the search method. **Note:** This API requires a standard end user account to execute. A service account can't perform Query API requests directly; to use a service account to perform queries, set up [Google Workspace domain-wide delegation of authority](https://developers.google.com/cloud-search/docs/guides/delegation/).
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/query/debugSearch

SearchRequest:
SearchRequest"
  [SearchRequest]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/query:debugSearch",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.query"],
   :body SearchRequest})

(defn query-sources-list
  "Returns list of sources that user can use for Search and Suggest APIs. **Note:** This API requires a standard end user account to execute. A service account can't perform Query API requests directly; to use a service account to perform queries, set up [Google Workspace domain-wide delegation of authority](https://developers.google.com/cloud-search/docs/guides/delegation/).
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/query/sources/list

optional:
requestOptions.languageCode <string> The BCP-47 language code, such as \"en-US\" or \"sr-Latn\". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For translations. Set this field using the language set in browser or for the page. In the event that the user's language preference is known, set this field to the known user language. When specified, the documents in search results are biased towards the specified language. The Suggest API uses this field as a hint to make better third-party autocomplete predictions.
requestOptions.debugOptions.enableDebugging <boolean> If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
requestOptions.timeZone <string> Current user's time zone id, such as \"America/Los_Angeles\" or \"Australia/Sydney\". These IDs are defined by [Unicode Common Locale Data Repository (CLDR)](http://cldr.unicode.org/) project, and currently available in the file [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml). This field is used to correctly interpret date and time queries. If this field is not specified, the default time zone (UTC) is used.
requestOptions.searchApplicationId <string> The ID generated when you create a search application using the [admin console](https://support.google.com/a/answer/9043922)."
  ([] (query-sources-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/query/sources",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.query"]}))

(defn stats-getIndex
  "Gets indexed item statistics aggreggated across all data sources. This API only returns statistics for previous dates; it doesn't return statistics for the current day. **Note:** This API requires a standard end user account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/stats/getIndex

optional:
fromDate.year <integer> Year of date. Must be from 1 to 9999.
fromDate.month <integer> Month of date. Must be from 1 to 12.
fromDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month.
toDate.year <integer> Year of date. Must be from 1 to 9999.
toDate.month <integer> Month of date. Must be from 1 to 12.
toDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month."
  ([] (stats-getIndex nil))
  ([optional]
    {:method :get,
     :uri-template "https://cloudsearch.googleapis.com/v1/stats/index",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.stats"
      "https://www.googleapis.com/auth/cloud_search.stats.indexing"]}))

(defn stats-getQuery
  "Get the query statistics for customer. **Note:** This API requires a standard end user account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/stats/getQuery

optional:
fromDate.year <integer> Year of date. Must be from 1 to 9999.
fromDate.month <integer> Month of date. Must be from 1 to 12.
fromDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month.
toDate.year <integer> Year of date. Must be from 1 to 9999.
toDate.month <integer> Month of date. Must be from 1 to 12.
toDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month."
  ([] (stats-getQuery nil))
  ([optional]
    {:method :get,
     :uri-template "https://cloudsearch.googleapis.com/v1/stats/query",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.stats"
      "https://www.googleapis.com/auth/cloud_search.stats.indexing"]}))

(defn stats-getUser
  "Get the users statistics for customer. **Note:** This API requires a standard end user account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/stats/getUser

optional:
fromDate.year <integer> Year of date. Must be from 1 to 9999.
fromDate.month <integer> Month of date. Must be from 1 to 12.
fromDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month.
toDate.year <integer> Year of date. Must be from 1 to 9999.
toDate.month <integer> Month of date. Must be from 1 to 12.
toDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month."
  ([] (stats-getUser nil))
  ([optional]
    {:method :get,
     :uri-template "https://cloudsearch.googleapis.com/v1/stats/user",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.stats"
      "https://www.googleapis.com/auth/cloud_search.stats.indexing"]}))

(defn stats-getSession
  "Get the # of search sessions, % of successful sessions with a click query statistics for customer. **Note:** This API requires a standard end user account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/stats/getSession

optional:
fromDate.year <integer> Year of date. Must be from 1 to 9999.
fromDate.month <integer> Month of date. Must be from 1 to 12.
fromDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month.
toDate.year <integer> Year of date. Must be from 1 to 9999.
toDate.month <integer> Month of date. Must be from 1 to 12.
toDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month."
  ([] (stats-getSession nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/stats/session",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.stats"
      "https://www.googleapis.com/auth/cloud_search.stats.indexing"]}))

(defn stats-getSearchapplication
  "Get search application stats for customer. **Note:** This API requires a standard end user account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/stats/getSearchapplication

optional:
startDate.year <integer> Year of date. Must be from 1 to 9999.
startDate.month <integer> Month of date. Must be from 1 to 12.
startDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month.
endDate.year <integer> Year of date. Must be from 1 to 9999.
endDate.month <integer> Month of date. Must be from 1 to 12.
endDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month."
  ([] (stats-getSearchapplication nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/stats/searchapplication",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.stats"
      "https://www.googleapis.com/auth/cloud_search.stats.indexing"]}))

(defn stats-index-datasources-get
  "Gets indexed item statistics for a single data source. **Note:** This API requires a standard end user account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/stats/index/datasources/get

name <> 

optional:
fromDate.year <integer> Year of date. Must be from 1 to 9999.
fromDate.month <integer> Month of date. Must be from 1 to 12.
fromDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month.
toDate.year <integer> Year of date. Must be from 1 to 9999.
toDate.month <integer> Month of date. Must be from 1 to 12.
toDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month."
  ([name] (stats-index-datasources-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/stats/index/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.stats"
      "https://www.googleapis.com/auth/cloud_search.stats.indexing"]}))

(defn stats-query-searchapplications-get
  "Get the query statistics for search application. **Note:** This API requires a standard end user account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/stats/query/searchapplications/get

name <> 

optional:
fromDate.year <integer> Year of date. Must be from 1 to 9999.
fromDate.month <integer> Month of date. Must be from 1 to 12.
fromDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month.
toDate.year <integer> Year of date. Must be from 1 to 9999.
toDate.month <integer> Month of date. Must be from 1 to 12.
toDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month."
  ([name] (stats-query-searchapplications-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/stats/query/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.stats"
      "https://www.googleapis.com/auth/cloud_search.stats.indexing"]}))

(defn stats-user-searchapplications-get
  "Get the users statistics for search application. **Note:** This API requires a standard end user account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/stats/user/searchapplications/get

name <> 

optional:
fromDate.year <integer> Year of date. Must be from 1 to 9999.
fromDate.month <integer> Month of date. Must be from 1 to 12.
fromDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month.
toDate.year <integer> Year of date. Must be from 1 to 9999.
toDate.month <integer> Month of date. Must be from 1 to 12.
toDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month."
  ([name] (stats-user-searchapplications-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/stats/user/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.stats"
      "https://www.googleapis.com/auth/cloud_search.stats.indexing"]}))

(defn stats-session-searchapplications-get
  "Get the # of search sessions, % of successful sessions with a click query statistics for search application. **Note:** This API requires a standard end user account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/stats/session/searchapplications/get

name <> 

optional:
fromDate.year <integer> Year of date. Must be from 1 to 9999.
fromDate.month <integer> Month of date. Must be from 1 to 12.
fromDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month.
toDate.year <integer> Year of date. Must be from 1 to 9999.
toDate.month <integer> Month of date. Must be from 1 to 12.
toDate.day <integer> Day of month. Must be from 1 to 31 and valid for the year and month."
  ([name] (stats-session-searchapplications-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://cloudsearch.googleapis.com/v1/stats/session/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud_search"
      "https://www.googleapis.com/auth/cloud_search.stats"
      "https://www.googleapis.com/auth/cloud_search.stats.indexing"]}))

(defn media-upload
  "Uploads media for indexing. The upload endpoint supports direct and resumable upload protocols and is intended for large items that can not be [inlined during index requests](https://developers.google.com/cloud-search/docs/reference/rest/v1/indexing.datasources.items#itemcontent). To index large content: 1. Call indexing.datasources.items.upload with the item name to begin an upload session and retrieve the UploadItemRef. 1. Call media.upload to upload the content, as a streaming request, using the same resource name from the UploadItemRef from step 1. 1. Call indexing.datasources.items.index to index the item. Populate the [ItemContent](/cloud-search/docs/reference/rest/v1/indexing.datasources.items#ItemContent) with the UploadItemRef from step 1. For additional information, see [Create a content connector using the REST API](https://developers.google.com/cloud-search/docs/guides/content-connector#rest). **Note:** This API requires a service account to execute.
https://developers.google.com/cloud-search/docs/guides/v1/reference/rest/v1/media/upload

resourceName <> 
Media:
Media"
  [resourceName Media]
  {:method :post,
   :uri-template
   "https://cloudsearch.googleapis.com/v1/media/{+resourceName}",
   :uri-template-args {"resourceName" resourceName},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud_search"
    "https://www.googleapis.com/auth/cloud_search.indexing"],
   :body Media})
