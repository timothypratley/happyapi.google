(ns happyapi.google.retail-v2
  "Vertex AI Search for Retail API
Vertex AI Search for Retail API is made up of Retail Search, Browse and Recommendations. These discovery AI solutions help you implement personalized search, browse and recommendations, based on machine learning models, across your websites and mobile applications.
See: https://cloud.google.com/use-cases/recommendations")

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://retail.googleapis.com/v2/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-list
  "Lists all the Catalogs associated with the project.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/list

parent <> 

optional:
pageSize <integer> Maximum number of Catalogs to return. If unspecified, defaults to 50. The maximum allowed value is 1000. Values above 1000 will be coerced to 1000. If this field is negative, an INVALID_ARGUMENT is returned."
  ([parent] (projects-locations-catalogs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://retail.googleapis.com/v2/{+parent}/catalogs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-getCompletionConfig
  "Gets a CompletionConfig.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/getCompletionConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-updateAttributesConfig
  "Updates the AttributesConfig. The catalog attributes in the request will be updated in the catalog, or inserted if they do not exist. Existing catalog attributes not included in the request will remain unchanged. Attributes that are assigned to products, but do not exist at the catalog level, are always included in the response. The product attribute is assigned default values for missing catalog attribute fields, e.g., searchable and dynamic facetable options.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/updateAttributesConfig

name <> 
GoogleCloudRetailV2AttributesConfig:
GoogleCloudRetailV2AttributesConfig

optional:
updateMask <string> Indicates which fields in the provided AttributesConfig to update. The following is the only supported field: * AttributesConfig.catalog_attributes If not set, all supported fields are updated."
  ([name GoogleCloudRetailV2AttributesConfig]
    (projects-locations-catalogs-updateAttributesConfig
      name
      GoogleCloudRetailV2AttributesConfig
      nil))
  ([name GoogleCloudRetailV2AttributesConfig optional]
    {:method :patch,
     :uri-template "https://retail.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRetailV2AttributesConfig}))

(defn projects-locations-catalogs-getDefaultBranch
  "Get which branch is currently default branch set by CatalogService.SetDefaultBranch method under a specified parent catalog.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/getDefaultBranch

catalog <> "
  [catalog]
  {:method :get,
   :uri-template
   "https://retail.googleapis.com/v2/{+catalog}:getDefaultBranch",
   :uri-template-args {"catalog" catalog},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-completeQuery
  "Completes the specified prefix with keyword suggestions. This feature is only available for users who have Retail Search enabled. Enable Retail Search on Cloud Console before using this feature.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/completeQuery

catalog <> 

optional:
languageCodes <string> Note that this field applies for `user-data` dataset only. For requests with `cloud-retail` dataset, setting this field has no effect. The language filters applied to the output suggestions. If set, it should contain the language of the query. If not set, suggestions are returned without considering language restrictions. This is the BCP-47 language code, such as \"en-US\" or \"sr-Latn\". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47). The maximum number of language codes is 3.
dataset <string> Determines which dataset to use for fetching completion. \"user-data\" will use the imported dataset through CompletionService.ImportCompletionData. \"cloud-retail\" will use the dataset generated by cloud retail based on user events. If leave empty, it will use the \"user-data\". Current supported values: * user-data * cloud-retail: This option requires enabling auto-learning function first. See [guidelines](https://cloud.google.com/retail/docs/completion-overview#generated-completion-dataset).
query <string> Required. The query used to generate suggestions. The maximum number of allowed characters is 255.
visitorId <string> Required field. A unique identifier for tracking visitors. For example, this could be implemented with an HTTP cookie, which should be able to uniquely identify a visitor on a single device. This unique identifier should not change if the visitor logs in or out of the website. The field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
maxSuggestions <integer> Completion max suggestions. If left unset or set to 0, then will fallback to the configured value CompletionConfig.max_suggestions. The maximum allowed max suggestions is 20. If it is set higher, it will be capped by 20.
deviceType <string> The device type context for completion suggestions. We recommend that you leave this field empty. It can apply different suggestions on different device types, e.g. `DESKTOP`, `MOBILE`. If it is empty, the suggestions are across all device types. Supported formats: * `UNKNOWN_DEVICE_TYPE` * `DESKTOP` * `MOBILE` * A customized string starts with `OTHER_`, e.g. `OTHER_IPHONE`.
enableAttributeSuggestions <boolean> If true, attribute suggestions are enabled and provided in the response. This field is only available for the \"cloud-retail\" dataset.
entity <string> The entity for customers who run multiple entities, domains, sites, or regions, for example, `Google US`, `Google Ads`, `Waymo`, `google.com`, `youtube.com`, etc. If this is set, it must be an exact match with UserEvent.entity to get per-entity autocomplete results."
  ([catalog] (projects-locations-catalogs-completeQuery catalog nil))
  ([catalog optional]
    {:method :get,
     :uri-template
     "https://retail.googleapis.com/v2/{+catalog}:completeQuery",
     :uri-template-args {"catalog" catalog},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-updateCompletionConfig
  "Updates the CompletionConfigs.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/updateCompletionConfig

name <> 
GoogleCloudRetailV2CompletionConfig:
GoogleCloudRetailV2CompletionConfig

optional:
updateMask <string> Indicates which fields in the provided CompletionConfig to update. The following are the only supported fields: * CompletionConfig.matching_order * CompletionConfig.max_suggestions * CompletionConfig.min_prefix_length * CompletionConfig.auto_learning If not set, all supported fields are updated."
  ([name GoogleCloudRetailV2CompletionConfig]
    (projects-locations-catalogs-updateCompletionConfig
      name
      GoogleCloudRetailV2CompletionConfig
      nil))
  ([name GoogleCloudRetailV2CompletionConfig optional]
    {:method :patch,
     :uri-template "https://retail.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRetailV2CompletionConfig}))

(defn projects-locations-catalogs-patch
  "Updates the Catalogs.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/patch

name <> 
GoogleCloudRetailV2Catalog:
GoogleCloudRetailV2Catalog

optional:
updateMask <string> Indicates which fields in the provided Catalog to update. If an unsupported or unknown field is provided, an INVALID_ARGUMENT error is returned."
  ([name GoogleCloudRetailV2Catalog]
    (projects-locations-catalogs-patch
      name
      GoogleCloudRetailV2Catalog
      nil))
  ([name GoogleCloudRetailV2Catalog optional]
    {:method :patch,
     :uri-template "https://retail.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRetailV2Catalog}))

(defn projects-locations-catalogs-getAttributesConfig
  "Gets an AttributesConfig.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/getAttributesConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-exportAnalyticsMetrics
  "Exports analytics metrics. `Operation.response` is of type `ExportAnalyticsMetricsResponse`. `Operation.metadata` is of type `ExportMetadata`.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/exportAnalyticsMetrics

catalog <> 
GoogleCloudRetailV2ExportAnalyticsMetricsRequest:
GoogleCloudRetailV2ExportAnalyticsMetricsRequest"
  [catalog GoogleCloudRetailV2ExportAnalyticsMetricsRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+catalog}:exportAnalyticsMetrics",
   :uri-template-args {"catalog" catalog},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2ExportAnalyticsMetricsRequest})

(defn projects-locations-catalogs-setDefaultBranch
  "Set a specified branch id as default branch. API methods such as SearchService.Search, ProductService.GetProduct, ProductService.ListProducts will treat requests using \"default_branch\" to the actual branch id set as default. For example, if `projects/*/locations/*/catalogs/*/branches/1` is set as default, setting SearchRequest.branch to `projects/*/locations/*/catalogs/*/branches/default_branch` is equivalent to setting SearchRequest.branch to `projects/*/locations/*/catalogs/*/branches/1`. Using multiple branches can be useful when developers would like to have a staging branch to test and verify for future usage. When it becomes ready, developers switch on the staging branch using this API while keeping using `projects/*/locations/*/catalogs/*/branches/default_branch` as SearchRequest.branch to route the traffic to this staging branch. CAUTION: If you have live predict/search traffic, switching the default branch could potentially cause outages if the ID space of the new branch is very different from the old one. More specifically: * PredictionService will only return product IDs from branch {newBranch}. * SearchService will only return product IDs from branch {newBranch} (if branch is not explicitly set). * UserEventService will only join events with products from branch {newBranch}.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/setDefaultBranch

catalog <> 
GoogleCloudRetailV2SetDefaultBranchRequest:
GoogleCloudRetailV2SetDefaultBranchRequest"
  [catalog GoogleCloudRetailV2SetDefaultBranchRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+catalog}:setDefaultBranch",
   :uri-template-args {"catalog" catalog},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2SetDefaultBranchRequest})

(defn projects-locations-catalogs-branches-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/branches/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-branches-products-addFulfillmentPlaces
  "We recommend that you use the ProductService.AddLocalInventories method instead of the ProductService.AddFulfillmentPlaces method. ProductService.AddLocalInventories achieves the same results but provides more fine-grained control over ingesting local inventory data. Incrementally adds place IDs to Product.fulfillment_info.place_ids. This process is asynchronous and does not require the Product to exist before updating fulfillment information. If the request is valid, the update will be enqueued and processed downstream. As a consequence, when a response is returned, the added place IDs are not immediately manifested in the Product queried by ProductService.GetProduct or ProductService.ListProducts. The returned Operations will be obsolete after 1 day, and GetOperation API will return NOT_FOUND afterwards. If conflicting updates are issued, the Operations associated with the stale updates will not be marked as done until being obsolete.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/branches/products/addFulfillmentPlaces

product <> 
GoogleCloudRetailV2AddFulfillmentPlacesRequest:
GoogleCloudRetailV2AddFulfillmentPlacesRequest"
  [product GoogleCloudRetailV2AddFulfillmentPlacesRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+product}:addFulfillmentPlaces",
   :uri-template-args {"product" product},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2AddFulfillmentPlacesRequest})

(defn projects-locations-catalogs-branches-products-addLocalInventories
  "Updates local inventory information for a Product at a list of places, while respecting the last update timestamps of each inventory field. This process is asynchronous and does not require the Product to exist before updating inventory information. If the request is valid, the update will be enqueued and processed downstream. As a consequence, when a response is returned, updates are not immediately manifested in the Product queried by ProductService.GetProduct or ProductService.ListProducts. Local inventory information can only be modified using this method. ProductService.CreateProduct and ProductService.UpdateProduct has no effect on local inventories. The returned Operations will be obsolete after 1 day, and GetOperation API will return NOT_FOUND afterwards. If conflicting updates are issued, the Operations associated with the stale updates will not be marked as done until being obsolete.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/branches/products/addLocalInventories

product <> 
GoogleCloudRetailV2AddLocalInventoriesRequest:
GoogleCloudRetailV2AddLocalInventoriesRequest"
  [product GoogleCloudRetailV2AddLocalInventoriesRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+product}:addLocalInventories",
   :uri-template-args {"product" product},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2AddLocalInventoriesRequest})

(defn projects-locations-catalogs-branches-products-list
  "Gets a list of Products.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/branches/products/list

parent <> 

optional:
pageSize <integer> Maximum number of Products to return. If unspecified, defaults to 100. The maximum allowed value is 1000. Values above 1000 will be coerced to 1000. If this field is negative, an INVALID_ARGUMENT error is returned.
filter <string> A filter to apply on the list results. Supported features: * List all the products under the parent branch if filter is unset. * List Product.Type.VARIANT Products sharing the same Product.Type.PRIMARY Product. For example: `primary_product_id = \"some_product_id\"` * List Products bundled in a Product.Type.COLLECTION Product. For example: `collection_product_id = \"some_product_id\"` * List Products with a partibular type. For example: `type = \"PRIMARY\"` `type = \"VARIANT\"` `type = \"COLLECTION\"` If the field is unrecognizable, an INVALID_ARGUMENT error is returned. If the specified Product.Type.PRIMARY Product or Product.Type.COLLECTION Product does not exist, a NOT_FOUND error is returned.
readMask <string> The fields of Product to return in the responses. If not set or empty, the following fields are returned: * Product.name * Product.id * Product.title * Product.uri * Product.images * Product.price_info * Product.brands If \"*\" is provided, all fields are returned. Product.name is always returned no matter what mask is set. If an unsupported or unknown field is provided, an INVALID_ARGUMENT error is returned."
  ([parent]
    (projects-locations-catalogs-branches-products-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://retail.googleapis.com/v2/{+parent}/products",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-branches-products-delete
  "Deletes a Product.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/branches/products/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-branches-products-purge
  "Permanently deletes all selected Products under a branch. This process is asynchronous. If the request is valid, the removal will be enqueued and processed offline. Depending on the number of Products, this operation could take hours to complete. Before the operation completes, some Products may still be returned by ProductService.GetProduct or ProductService.ListProducts. Depending on the number of Products, this operation could take hours to complete. To get a sample of Products that would be deleted, set PurgeProductsRequest.force to false.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/branches/products/purge

parent <> 
GoogleCloudRetailV2PurgeProductsRequest:
GoogleCloudRetailV2PurgeProductsRequest"
  [parent GoogleCloudRetailV2PurgeProductsRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+parent}/products:purge",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2PurgeProductsRequest})

(defn projects-locations-catalogs-branches-products-import
  "Bulk import of multiple Products. Request processing may be synchronous. Non-existing items are created. Note that it is possible for a subset of the Products to be successfully updated.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/branches/products/import

parent <> 
GoogleCloudRetailV2ImportProductsRequest:
GoogleCloudRetailV2ImportProductsRequest"
  [parent GoogleCloudRetailV2ImportProductsRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+parent}/products:import",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2ImportProductsRequest})

(defn projects-locations-catalogs-branches-products-removeFulfillmentPlaces
  "We recommend that you use the ProductService.RemoveLocalInventories method instead of the ProductService.RemoveFulfillmentPlaces method. ProductService.RemoveLocalInventories achieves the same results but provides more fine-grained control over ingesting local inventory data. Incrementally removes place IDs from a Product.fulfillment_info.place_ids. This process is asynchronous and does not require the Product to exist before updating fulfillment information. If the request is valid, the update will be enqueued and processed downstream. As a consequence, when a response is returned, the removed place IDs are not immediately manifested in the Product queried by ProductService.GetProduct or ProductService.ListProducts. The returned Operations will be obsolete after 1 day, and GetOperation API will return NOT_FOUND afterwards. If conflicting updates are issued, the Operations associated with the stale updates will not be marked as done until being obsolete.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/branches/products/removeFulfillmentPlaces

product <> 
GoogleCloudRetailV2RemoveFulfillmentPlacesRequest:
GoogleCloudRetailV2RemoveFulfillmentPlacesRequest"
  [product GoogleCloudRetailV2RemoveFulfillmentPlacesRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+product}:removeFulfillmentPlaces",
   :uri-template-args {"product" product},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2RemoveFulfillmentPlacesRequest})

(defn projects-locations-catalogs-branches-products-patch
  "Updates a Product.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/branches/products/patch

name <> 
GoogleCloudRetailV2Product:
GoogleCloudRetailV2Product

optional:
updateMask <string> Indicates which fields in the provided Product to update. The immutable and output only fields are NOT supported. If not set, all supported fields (the fields that are neither immutable nor output only) are updated. If an unsupported or unknown field is provided, an INVALID_ARGUMENT error is returned. The attribute key can be updated by setting the mask path as \"attributes.${key_name}\". If a key name is present in the mask but not in the patching product from the request, this key will be deleted after the update.
allowMissing <boolean> If set to true, and the Product is not found, a new Product will be created. In this situation, `update_mask` is ignored."
  ([name GoogleCloudRetailV2Product]
    (projects-locations-catalogs-branches-products-patch
      name
      GoogleCloudRetailV2Product
      nil))
  ([name GoogleCloudRetailV2Product optional]
    {:method :patch,
     :uri-template "https://retail.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRetailV2Product}))

(defn projects-locations-catalogs-branches-products-removeLocalInventories
  "Remove local inventory information for a Product at a list of places at a removal timestamp. This process is asynchronous. If the request is valid, the removal will be enqueued and processed downstream. As a consequence, when a response is returned, removals are not immediately manifested in the Product queried by ProductService.GetProduct or ProductService.ListProducts. Local inventory information can only be removed using this method. ProductService.CreateProduct and ProductService.UpdateProduct has no effect on local inventories. The returned Operations will be obsolete after 1 day, and GetOperation API will return NOT_FOUND afterwards. If conflicting updates are issued, the Operations associated with the stale updates will not be marked as done until being obsolete.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/branches/products/removeLocalInventories

product <> 
GoogleCloudRetailV2RemoveLocalInventoriesRequest:
GoogleCloudRetailV2RemoveLocalInventoriesRequest"
  [product GoogleCloudRetailV2RemoveLocalInventoriesRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+product}:removeLocalInventories",
   :uri-template-args {"product" product},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2RemoveLocalInventoriesRequest})

(defn projects-locations-catalogs-branches-products-create
  "Creates a Product.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/branches/products/create

parent <> 
GoogleCloudRetailV2Product:
GoogleCloudRetailV2Product

optional:
productId <string> Required. The ID to use for the Product, which will become the final component of the Product.name. If the caller does not have permission to create the Product, regardless of whether or not it exists, a PERMISSION_DENIED error is returned. This field must be unique among all Products with the same parent. Otherwise, an ALREADY_EXISTS error is returned. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned."
  ([parent GoogleCloudRetailV2Product]
    (projects-locations-catalogs-branches-products-create
      parent
      GoogleCloudRetailV2Product
      nil))
  ([parent GoogleCloudRetailV2Product optional]
    {:method :post,
     :uri-template
     "https://retail.googleapis.com/v2/{+parent}/products",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRetailV2Product}))

(defn projects-locations-catalogs-branches-products-setInventory
  "Updates inventory information for a Product while respecting the last update timestamps of each inventory field. This process is asynchronous and does not require the Product to exist before updating fulfillment information. If the request is valid, the update is enqueued and processed downstream. As a consequence, when a response is returned, updates are not immediately manifested in the Product queried by ProductService.GetProduct or ProductService.ListProducts. When inventory is updated with ProductService.CreateProduct and ProductService.UpdateProduct, the specified inventory field value(s) overwrite any existing value(s) while ignoring the last update time for this field. Furthermore, the last update times for the specified inventory fields are overwritten by the times of the ProductService.CreateProduct or ProductService.UpdateProduct request. If no inventory fields are set in CreateProductRequest.product, then any pre-existing inventory information for this product is used. If no inventory fields are set in SetInventoryRequest.set_mask, then any existing inventory information is preserved. Pre-existing inventory information can only be updated with ProductService.SetInventory, ProductService.AddFulfillmentPlaces, and ProductService.RemoveFulfillmentPlaces. The returned Operations is obsolete after one day, and the GetOperation API returns `NOT_FOUND` afterwards. If conflicting updates are issued, the Operations associated with the stale updates are not marked as done until they are obsolete.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/branches/products/setInventory

name <> 
GoogleCloudRetailV2SetInventoryRequest:
GoogleCloudRetailV2SetInventoryRequest"
  [name GoogleCloudRetailV2SetInventoryRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+name}:setInventory",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2SetInventoryRequest})

(defn projects-locations-catalogs-branches-products-get
  "Gets a Product.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/branches/products/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-placements-search
  "Performs a search. This feature is only available for users who have Retail Search enabled. Enable Retail Search on Cloud Console before using this feature.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/placements/search

placement <> 
GoogleCloudRetailV2SearchRequest:
GoogleCloudRetailV2SearchRequest"
  [placement GoogleCloudRetailV2SearchRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+placement}:search",
   :uri-template-args {"placement" placement},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2SearchRequest})

(defn projects-locations-catalogs-placements-predict
  "Makes a recommendation prediction.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/placements/predict

placement <> 
GoogleCloudRetailV2PredictRequest:
GoogleCloudRetailV2PredictRequest"
  [placement GoogleCloudRetailV2PredictRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+placement}:predict",
   :uri-template-args {"placement" placement},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2PredictRequest})

(defn projects-locations-catalogs-completionData-import
  "Bulk import of processed completion dataset. Request processing is asynchronous. Partial updating is not supported. The operation is successfully finished only after the imported suggestions are indexed successfully and ready for serving. The process takes hours. This feature is only available for users who have Retail Search enabled. Enable Retail Search on Cloud Console before using this feature.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/completionData/import

parent <> 
GoogleCloudRetailV2ImportCompletionDataRequest:
GoogleCloudRetailV2ImportCompletionDataRequest"
  [parent GoogleCloudRetailV2ImportCompletionDataRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+parent}/completionData:import",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2ImportCompletionDataRequest})

(defn projects-locations-catalogs-attributesConfig-addCatalogAttribute
  "Adds the specified CatalogAttribute to the AttributesConfig. If the CatalogAttribute to add already exists, an ALREADY_EXISTS error is returned.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/attributesConfig/addCatalogAttribute

attributesConfig <> 
GoogleCloudRetailV2AddCatalogAttributeRequest:
GoogleCloudRetailV2AddCatalogAttributeRequest"
  [attributesConfig GoogleCloudRetailV2AddCatalogAttributeRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+attributesConfig}:addCatalogAttribute",
   :uri-template-args {"attributesConfig" attributesConfig},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2AddCatalogAttributeRequest})

(defn projects-locations-catalogs-attributesConfig-removeCatalogAttribute
  "Removes the specified CatalogAttribute from the AttributesConfig. If the CatalogAttribute to remove does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/attributesConfig/removeCatalogAttribute

attributesConfig <> 
GoogleCloudRetailV2RemoveCatalogAttributeRequest:
GoogleCloudRetailV2RemoveCatalogAttributeRequest"
  [attributesConfig GoogleCloudRetailV2RemoveCatalogAttributeRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+attributesConfig}:removeCatalogAttribute",
   :uri-template-args {"attributesConfig" attributesConfig},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2RemoveCatalogAttributeRequest})

(defn projects-locations-catalogs-attributesConfig-replaceCatalogAttribute
  "Replaces the specified CatalogAttribute in the AttributesConfig by updating the catalog attribute with the same CatalogAttribute.key. If the CatalogAttribute to replace does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/attributesConfig/replaceCatalogAttribute

attributesConfig <> 
GoogleCloudRetailV2ReplaceCatalogAttributeRequest:
GoogleCloudRetailV2ReplaceCatalogAttributeRequest"
  [attributesConfig GoogleCloudRetailV2ReplaceCatalogAttributeRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+attributesConfig}:replaceCatalogAttribute",
   :uri-template-args {"attributesConfig" attributesConfig},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2ReplaceCatalogAttributeRequest})

(defn projects-locations-catalogs-servingConfigs-addControl
  "Enables a Control on the specified ServingConfig. The control is added in the last position of the list of controls it belongs to (e.g. if it's a facet spec control it will be applied in the last position of servingConfig.facetSpecIds) Returns a ALREADY_EXISTS error if the control has already been applied. Returns a FAILED_PRECONDITION error if the addition could exceed maximum number of control allowed for that type of control.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/servingConfigs/addControl

servingConfig <> 
GoogleCloudRetailV2AddControlRequest:
GoogleCloudRetailV2AddControlRequest"
  [servingConfig GoogleCloudRetailV2AddControlRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+servingConfig}:addControl",
   :uri-template-args {"servingConfig" servingConfig},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2AddControlRequest})

(defn projects-locations-catalogs-servingConfigs-predict
  "Makes a recommendation prediction.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/servingConfigs/predict

placement <> 
GoogleCloudRetailV2PredictRequest:
GoogleCloudRetailV2PredictRequest"
  [placement GoogleCloudRetailV2PredictRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+placement}:predict",
   :uri-template-args {"placement" placement},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2PredictRequest})

(defn projects-locations-catalogs-servingConfigs-list
  "Lists all ServingConfigs linked to this catalog.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/servingConfigs/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of results to return. If unspecified, defaults to 100. If a value greater than 100 is provided, at most 100 results are returned."
  ([parent]
    (projects-locations-catalogs-servingConfigs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://retail.googleapis.com/v2/{+parent}/servingConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-servingConfigs-delete
  "Deletes a ServingConfig. Returns a NotFound error if the ServingConfig does not exist.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/servingConfigs/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-servingConfigs-removeControl
  "Disables a Control on the specified ServingConfig. The control is removed from the ServingConfig. Returns a NOT_FOUND error if the Control is not enabled for the ServingConfig.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/servingConfigs/removeControl

servingConfig <> 
GoogleCloudRetailV2RemoveControlRequest:
GoogleCloudRetailV2RemoveControlRequest"
  [servingConfig GoogleCloudRetailV2RemoveControlRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+servingConfig}:removeControl",
   :uri-template-args {"servingConfig" servingConfig},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2RemoveControlRequest})

(defn projects-locations-catalogs-servingConfigs-patch
  "Updates a ServingConfig.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/servingConfigs/patch

name <> 
GoogleCloudRetailV2ServingConfig:
GoogleCloudRetailV2ServingConfig

optional:
updateMask <string> Indicates which fields in the provided ServingConfig to update. The following are NOT supported: * ServingConfig.name If not set, all supported fields are updated."
  ([name GoogleCloudRetailV2ServingConfig]
    (projects-locations-catalogs-servingConfigs-patch
      name
      GoogleCloudRetailV2ServingConfig
      nil))
  ([name GoogleCloudRetailV2ServingConfig optional]
    {:method :patch,
     :uri-template "https://retail.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRetailV2ServingConfig}))

(defn projects-locations-catalogs-servingConfigs-create
  "Creates a ServingConfig. A maximum of 100 ServingConfigs are allowed in a Catalog, otherwise a FAILED_PRECONDITION error is returned.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/servingConfigs/create

parent <> 
GoogleCloudRetailV2ServingConfig:
GoogleCloudRetailV2ServingConfig

optional:
servingConfigId <string> Required. The ID to use for the ServingConfig, which will become the final component of the ServingConfig's resource name. This value should be 4-63 characters, and valid characters are /a-z-_/."
  ([parent GoogleCloudRetailV2ServingConfig]
    (projects-locations-catalogs-servingConfigs-create
      parent
      GoogleCloudRetailV2ServingConfig
      nil))
  ([parent GoogleCloudRetailV2ServingConfig optional]
    {:method :post,
     :uri-template
     "https://retail.googleapis.com/v2/{+parent}/servingConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRetailV2ServingConfig}))

(defn projects-locations-catalogs-servingConfigs-search
  "Performs a search. This feature is only available for users who have Retail Search enabled. Enable Retail Search on Cloud Console before using this feature.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/servingConfigs/search

placement <> 
GoogleCloudRetailV2SearchRequest:
GoogleCloudRetailV2SearchRequest"
  [placement GoogleCloudRetailV2SearchRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+placement}:search",
   :uri-template-args {"placement" placement},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2SearchRequest})

(defn projects-locations-catalogs-servingConfigs-get
  "Gets a ServingConfig. Returns a NotFound error if the ServingConfig does not exist.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/servingConfigs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-userEvents-write
  "Writes a single user event.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/userEvents/write

parent <> 
GoogleCloudRetailV2UserEvent:
GoogleCloudRetailV2UserEvent

optional:
writeAsync <boolean> If set to true, the user event will be written asynchronously after validation, and the API will respond without waiting for the write. Therefore, silent failures can occur even if the API returns success. In case of silent failures, error messages can be found in Stackdriver logs."
  ([parent GoogleCloudRetailV2UserEvent]
    (projects-locations-catalogs-userEvents-write
      parent
      GoogleCloudRetailV2UserEvent
      nil))
  ([parent GoogleCloudRetailV2UserEvent optional]
    {:method :post,
     :uri-template
     "https://retail.googleapis.com/v2/{+parent}/userEvents:write",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRetailV2UserEvent}))

(defn projects-locations-catalogs-userEvents-collect
  "Writes a single user event from the browser. This uses a GET request to due to browser restriction of POST-ing to a 3rd party domain. This method is used only by the Retail API JavaScript pixel and Google Tag Manager. Users should not call this method directly.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/userEvents/collect

parent <> 

optional:
prebuiltRule <string> The prebuilt rule name that can convert a specific type of raw_json. For example: \"ga4_bq\" rule for the GA4 user event schema.
userEvent <string> Required. URL encoded UserEvent proto with a length limit of 2,000,000 characters.
uri <string> The URL including cgi-parameters but excluding the hash fragment with a length limit of 5,000 characters. This is often more useful than the referer URL, because many browsers only send the domain for 3rd party requests.
ets <string> The event timestamp in milliseconds. This prevents browser caching of otherwise identical get requests. The name is abbreviated to reduce the payload bytes.
rawJson <string> An arbitrary serialized JSON string that contains necessary information that can comprise a user event. When this field is specified, the user_event field will be ignored. Note: line-delimited JSON is not supported, a single JSON only."
  ([parent]
    (projects-locations-catalogs-userEvents-collect parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://retail.googleapis.com/v2/{+parent}/userEvents:collect",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-userEvents-purge
  "Deletes permanently all user events specified by the filter provided. Depending on the number of events specified by the filter, this operation could take hours or days to complete. To test a filter, use the list command first.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/userEvents/purge

parent <> 
GoogleCloudRetailV2PurgeUserEventsRequest:
GoogleCloudRetailV2PurgeUserEventsRequest"
  [parent GoogleCloudRetailV2PurgeUserEventsRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+parent}/userEvents:purge",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2PurgeUserEventsRequest})

(defn projects-locations-catalogs-userEvents-import
  "Bulk import of User events. Request processing might be synchronous. Events that already exist are skipped. Use this method for backfilling historical user events. `Operation.response` is of type `ImportResponse`. Note that it is possible for a subset of the items to be successfully inserted. `Operation.metadata` is of type `ImportMetadata`.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/userEvents/import

parent <> 
GoogleCloudRetailV2ImportUserEventsRequest:
GoogleCloudRetailV2ImportUserEventsRequest"
  [parent GoogleCloudRetailV2ImportUserEventsRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+parent}/userEvents:import",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2ImportUserEventsRequest})

(defn projects-locations-catalogs-userEvents-rejoin
  "Starts a user-event rejoin operation with latest product catalog. Events are not annotated with detailed product information for products that are missing from the catalog when the user event is ingested. These events are stored as unjoined events with limited usage on training and serving. You can use this method to start a join operation on specified events with the latest version of product catalog. You can also use this method to correct events joined with the wrong product catalog. A rejoin operation can take hours or days to complete.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/userEvents/rejoin

parent <> 
GoogleCloudRetailV2RejoinUserEventsRequest:
GoogleCloudRetailV2RejoinUserEventsRequest"
  [parent GoogleCloudRetailV2RejoinUserEventsRequest]
  {:method :post,
   :uri-template
   "https://retail.googleapis.com/v2/{+parent}/userEvents:rejoin",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2RejoinUserEventsRequest})

(defn projects-locations-catalogs-controls-create
  "Creates a Control. If the Control to create already exists, an ALREADY_EXISTS error is returned.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/controls/create

parent <> 
GoogleCloudRetailV2Control:
GoogleCloudRetailV2Control

optional:
controlId <string> Required. The ID to use for the Control, which will become the final component of the Control's resource name. This value should be 4-63 characters, and valid characters are /a-z-_/."
  ([parent GoogleCloudRetailV2Control]
    (projects-locations-catalogs-controls-create
      parent
      GoogleCloudRetailV2Control
      nil))
  ([parent GoogleCloudRetailV2Control optional]
    {:method :post,
     :uri-template
     "https://retail.googleapis.com/v2/{+parent}/controls",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRetailV2Control}))

(defn projects-locations-catalogs-controls-delete
  "Deletes a Control. If the Control to delete does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/controls/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-controls-patch
  "Updates a Control. Control cannot be set to a different oneof field, if so an INVALID_ARGUMENT is returned. If the Control to update does not exist, a NOT_FOUND error is returned.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/controls/patch

name <> 
GoogleCloudRetailV2Control:
GoogleCloudRetailV2Control

optional:
updateMask <string> Indicates which fields in the provided Control to update. The following are NOT supported: * Control.name If not set or empty, all supported fields are updated."
  ([name GoogleCloudRetailV2Control]
    (projects-locations-catalogs-controls-patch
      name
      GoogleCloudRetailV2Control
      nil))
  ([name GoogleCloudRetailV2Control optional]
    {:method :patch,
     :uri-template "https://retail.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRetailV2Control}))

(defn projects-locations-catalogs-controls-get
  "Gets a Control.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/controls/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-controls-list
  "Lists all Controls by their parent Catalog.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/controls/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
filter <string> Optional. A filter to apply on the list results. Supported features: * List all the products under the parent branch if filter is unset. * List controls that are used in a single ServingConfig: 'serving_config = \"boosted_home_page_cvr\"'"
  ([parent] (projects-locations-catalogs-controls-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://retail.googleapis.com/v2/{+parent}/controls",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-models-create
  "Creates a new model.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/models/create

parent <> 
GoogleCloudRetailV2Model:
GoogleCloudRetailV2Model

optional:
dryRun <boolean> Optional. Whether to run a dry run to validate the request (without actually creating the model)."
  ([parent GoogleCloudRetailV2Model]
    (projects-locations-catalogs-models-create
      parent
      GoogleCloudRetailV2Model
      nil))
  ([parent GoogleCloudRetailV2Model optional]
    {:method :post,
     :uri-template "https://retail.googleapis.com/v2/{+parent}/models",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRetailV2Model}))

(defn projects-locations-catalogs-models-get
  "Gets a model.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/models/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-models-pause
  "Pauses the training of an existing model.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/models/pause

name <> 
GoogleCloudRetailV2PauseModelRequest:
GoogleCloudRetailV2PauseModelRequest"
  [name GoogleCloudRetailV2PauseModelRequest]
  {:method :post,
   :uri-template "https://retail.googleapis.com/v2/{+name}:pause",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2PauseModelRequest})

(defn projects-locations-catalogs-models-resume
  "Resumes the training of an existing model.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/models/resume

name <> 
GoogleCloudRetailV2ResumeModelRequest:
GoogleCloudRetailV2ResumeModelRequest"
  [name GoogleCloudRetailV2ResumeModelRequest]
  {:method :post,
   :uri-template "https://retail.googleapis.com/v2/{+name}:resume",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2ResumeModelRequest})

(defn projects-locations-catalogs-models-delete
  "Deletes an existing model.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/models/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-models-list
  "Lists all the models linked to this event store.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/models/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000."
  ([parent] (projects-locations-catalogs-models-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://retail.googleapis.com/v2/{+parent}/models",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-models-patch
  "Update of model metadata. Only fields that currently can be updated are: `filtering_option` and `periodic_tuning_state`. If other values are provided, this API method ignores them.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/models/patch

name <> 
GoogleCloudRetailV2Model:
GoogleCloudRetailV2Model

optional:
updateMask <string> Optional. Indicates which fields in the provided 'model' to update. If not set, by default updates all fields."
  ([name GoogleCloudRetailV2Model]
    (projects-locations-catalogs-models-patch
      name
      GoogleCloudRetailV2Model
      nil))
  ([name GoogleCloudRetailV2Model optional]
    {:method :patch,
     :uri-template "https://retail.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRetailV2Model}))

(defn projects-locations-catalogs-models-tune
  "Tunes an existing model.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/models/tune

name <> 
GoogleCloudRetailV2TuneModelRequest:
GoogleCloudRetailV2TuneModelRequest"
  [name GoogleCloudRetailV2TuneModelRequest]
  {:method :post,
   :uri-template "https://retail.googleapis.com/v2/{+name}:tune",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRetailV2TuneModelRequest})

(defn projects-locations-catalogs-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-catalogs-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://retail.googleapis.com/v2/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/locations/catalogs/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://retail.googleapis.com/v2/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/use-cases/recommendations/v2/reference/rest/v2/projects/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://retail.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})
