(ns happyapi.google.recommendationengine-v1beta1
  "Recommendations AI (Beta)
Note that we now highly recommend new customers to use Retail API, which incorporates the GA version of the Recommendations AI funtionalities. To enable Retail API, please visit https://console.cloud.google.com/apis/library/retail.googleapis.com. The Recommendations AI service enables customers to build end-to-end personalized recommendation systems without requiring a high level of expertise in machine learning, recommendation system, or Google Cloud.
See: https://cloud.google.com/retail/docs")

(defn projects-locations-catalogs-list
  "Lists all the catalog configurations associated with the project.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000."
  ([parent] (projects-locations-catalogs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://recommendationengine.googleapis.com/v1beta1/{+parent}/catalogs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-patch
  "Updates the catalog configuration.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/patch

name <> 
GoogleCloudRecommendationengineV1beta1Catalog:
GoogleCloudRecommendationengineV1beta1Catalog

optional:
updateMask <string> Optional. Indicates which fields in the provided 'catalog' to update. If not set, will only update the catalog_item_level_config field. Currently only fields that can be updated are catalog_item_level_config."
  ([name GoogleCloudRecommendationengineV1beta1Catalog]
    (projects-locations-catalogs-patch
      name
      GoogleCloudRecommendationengineV1beta1Catalog
      nil))
  ([name GoogleCloudRecommendationengineV1beta1Catalog optional]
    {:method :patch,
     :uri-template
     "https://recommendationengine.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommendationengineV1beta1Catalog}))

(defn projects-locations-catalogs-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-catalogs-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://recommendationengine.googleapis.com/v1beta1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://recommendationengine.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-eventStores-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/eventStores/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-catalogs-eventStores-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://recommendationengine.googleapis.com/v1beta1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-eventStores-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/eventStores/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://recommendationengine.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-eventStores-predictionApiKeyRegistrations-create
  "Register an API key for use with predict method.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/eventStores/predictionApiKeyRegistrations/create

parent <> 
GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest:
GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest"
  [parent
   GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest]
  {:method :post,
   :uri-template
   "https://recommendationengine.googleapis.com/v1beta1/{+parent}/predictionApiKeyRegistrations",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body
   GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest})

(defn projects-locations-catalogs-eventStores-predictionApiKeyRegistrations-list
  "List the registered apiKeys for use with predict method.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/eventStores/predictionApiKeyRegistrations/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of results to return per page. If unset, the service will choose a reasonable default."
  ([parent]
    (projects-locations-catalogs-eventStores-predictionApiKeyRegistrations-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://recommendationengine.googleapis.com/v1beta1/{+parent}/predictionApiKeyRegistrations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-eventStores-predictionApiKeyRegistrations-delete
  "Unregister an apiKey from using for predict method.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/eventStores/predictionApiKeyRegistrations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template
   "https://recommendationengine.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-eventStores-placements-predict
  "Makes a recommendation prediction. If using API Key based authentication, the API Key must be registered using the PredictionApiKeyRegistry service. [Learn more](https://cloud.google.com/recommendations-ai/docs/setting-up#register-key).
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/eventStores/placements/predict

name <> 
GoogleCloudRecommendationengineV1beta1PredictRequest:
GoogleCloudRecommendationengineV1beta1PredictRequest"
  [name GoogleCloudRecommendationengineV1beta1PredictRequest]
  {:method :post,
   :uri-template
   "https://recommendationengine.googleapis.com/v1beta1/{+name}:predict",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRecommendationengineV1beta1PredictRequest})

(defn projects-locations-catalogs-eventStores-userEvents-write
  "Writes a single user event.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/eventStores/userEvents/write

parent <> 
GoogleCloudRecommendationengineV1beta1UserEvent:
GoogleCloudRecommendationengineV1beta1UserEvent"
  [parent GoogleCloudRecommendationengineV1beta1UserEvent]
  {:method :post,
   :uri-template
   "https://recommendationengine.googleapis.com/v1beta1/{+parent}/userEvents:write",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRecommendationengineV1beta1UserEvent})

(defn projects-locations-catalogs-eventStores-userEvents-collect
  "Writes a single user event from the browser. This uses a GET request to due to browser restriction of POST-ing to a 3rd party domain. This method is used only by the Recommendations AI JavaScript pixel. Users should not call this method directly.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/eventStores/userEvents/collect

parent <> 

optional:
userEvent <string> Required. URL encoded UserEvent proto.
uri <string> Optional. The url including cgi-parameters but excluding the hash fragment. The URL must be truncated to 1.5K bytes to conservatively be under the 2K bytes. This is often more useful than the referer url, because many browsers only send the domain for 3rd party requests.
ets <string> Optional. The event timestamp in milliseconds. This prevents browser caching of otherwise identical get requests. The name is abbreviated to reduce the payload bytes."
  ([parent]
    (projects-locations-catalogs-eventStores-userEvents-collect
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://recommendationengine.googleapis.com/v1beta1/{+parent}/userEvents:collect",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-eventStores-userEvents-list
  "Gets a list of user events within a time range, with potential filtering. The method does not list unjoined user events. Unjoined user event definition: when a user event is ingested from Recommendations AI User Event APIs, the catalog item included in the user event is connected with the current catalog. If a catalog item of the ingested event is not in the current catalog, it could lead to degraded model quality. This is called an unjoined event.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/eventStores/userEvents/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of results to return per page. If zero, the service will choose a reasonable default.
filter <string> Optional. Filtering expression to specify restrictions over returned events. This is a sequence of terms, where each term applies some kind of a restriction to the returned user events. Use this expression to restrict results to a specific time range, or filter events by eventType. eg: eventTime > \"2012-04-23T18:25:43.511Z\" eventsMissingCatalogItems eventTime<\"2012-04-23T18:25:43.511Z\" eventType=search We expect only 3 types of fields: * eventTime: this can be specified a maximum of 2 times, once with a less than operator and once with a greater than operator. The eventTime restrict should result in one contiguous valid eventTime range. * eventType: only 1 eventType restriction can be specified. * eventsMissingCatalogItems: specififying this will restrict results to events for which catalog items were not found in the catalog. The default behavior is to return only those events for which catalog items were found. Some examples of valid filters expressions: * Example 1: eventTime > \"2012-04-23T18:25:43.511Z\" eventTime < \"2012-04-23T18:30:43.511Z\" * Example 2: eventTime > \"2012-04-23T18:25:43.511Z\" eventType = detail-page-view * Example 3: eventsMissingCatalogItems eventType = search eventTime < \"2018-04-23T18:30:43.511Z\" * Example 4: eventTime > \"2012-04-23T18:25:43.511Z\" * Example 5: eventType = search * Example 6: eventsMissingCatalogItems"
  ([parent]
    (projects-locations-catalogs-eventStores-userEvents-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://recommendationengine.googleapis.com/v1beta1/{+parent}/userEvents",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-eventStores-userEvents-purge
  "Deletes permanently all user events specified by the filter provided. Depending on the number of events specified by the filter, this operation could take hours or days to complete. To test a filter, use the list command first.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/eventStores/userEvents/purge

parent <> 
GoogleCloudRecommendationengineV1beta1PurgeUserEventsRequest:
GoogleCloudRecommendationengineV1beta1PurgeUserEventsRequest"
  [parent GoogleCloudRecommendationengineV1beta1PurgeUserEventsRequest]
  {:method :post,
   :uri-template
   "https://recommendationengine.googleapis.com/v1beta1/{+parent}/userEvents:purge",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRecommendationengineV1beta1PurgeUserEventsRequest})

(defn projects-locations-catalogs-eventStores-userEvents-import
  "Bulk import of User events. Request processing might be synchronous. Events that already exist are skipped. Use this method for backfilling historical user events. Operation.response is of type ImportResponse. Note that it is possible for a subset of the items to be successfully inserted. Operation.metadata is of type ImportMetadata.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/eventStores/userEvents/import

parent <> 
GoogleCloudRecommendationengineV1beta1ImportUserEventsRequest:
GoogleCloudRecommendationengineV1beta1ImportUserEventsRequest"
  [parent
   GoogleCloudRecommendationengineV1beta1ImportUserEventsRequest]
  {:method :post,
   :uri-template
   "https://recommendationengine.googleapis.com/v1beta1/{+parent}/userEvents:import",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRecommendationengineV1beta1ImportUserEventsRequest})

(defn projects-locations-catalogs-eventStores-userEvents-rejoin
  "Triggers a user event rejoin operation with latest catalog data. Events will not be annotated with detailed catalog information if catalog item is missing at the time the user event is ingested, and these events are stored as unjoined events with a limited usage on training and serving. This API can be used to trigger a 'join' operation on specified events with latest version of catalog items. It can also be used to correct events joined with wrong catalog items.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/eventStores/userEvents/rejoin

parent <> 
GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest:
GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest"
  [parent
   GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest]
  {:method :post,
   :uri-template
   "https://recommendationengine.googleapis.com/v1beta1/{+parent}/userEvents:rejoin",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest})

(defn projects-locations-catalogs-catalogItems-create
  "Creates a catalog item.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/catalogItems/create

parent <> 
GoogleCloudRecommendationengineV1beta1CatalogItem:
GoogleCloudRecommendationengineV1beta1CatalogItem"
  [parent GoogleCloudRecommendationengineV1beta1CatalogItem]
  {:method :post,
   :uri-template
   "https://recommendationengine.googleapis.com/v1beta1/{+parent}/catalogItems",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudRecommendationengineV1beta1CatalogItem})

(defn projects-locations-catalogs-catalogItems-get
  "Gets a specific catalog item.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/catalogItems/get

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://recommendationengine.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-catalogItems-list
  "Gets a list of catalog items.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/catalogItems/list

parent <> 

optional:
pageSize <integer> Optional. Maximum number of results to return per page. If zero, the service will choose a reasonable default.
filter <string> Optional. Use of this field is not supported by version v1beta1."
  ([parent] (projects-locations-catalogs-catalogItems-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://recommendationengine.googleapis.com/v1beta1/{+parent}/catalogItems",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-catalogs-catalogItems-patch
  "Updates a catalog item. Partial updating is supported. Non-existing items will be created.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/catalogItems/patch

name <> 
GoogleCloudRecommendationengineV1beta1CatalogItem:
GoogleCloudRecommendationengineV1beta1CatalogItem

optional:
updateMask <string> Optional. Indicates which fields in the provided 'item' to update. If not set, will by default update all fields."
  ([name GoogleCloudRecommendationengineV1beta1CatalogItem]
    (projects-locations-catalogs-catalogItems-patch
      name
      GoogleCloudRecommendationengineV1beta1CatalogItem
      nil))
  ([name GoogleCloudRecommendationengineV1beta1CatalogItem optional]
    {:method :patch,
     :uri-template
     "https://recommendationengine.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRecommendationengineV1beta1CatalogItem}))

(defn projects-locations-catalogs-catalogItems-delete
  "Deletes a catalog item.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/catalogItems/delete

name <> "
  [name]
  {:method :delete,
   :uri-template
   "https://recommendationengine.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-catalogs-catalogItems-import
  "Bulk import of multiple catalog items. Request processing may be synchronous. No partial updating supported. Non-existing items will be created. Operation.response is of type ImportResponse. Note that it is possible for a subset of the items to be successfully updated.
https://cloud.google.com/retail/docs/v1beta1/reference/rest/v1beta1/projects/locations/catalogs/catalogItems/import

parent <> 
GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequest:
GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequest"
  [parent
   GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequest]
  {:method :post,
   :uri-template
   "https://recommendationengine.googleapis.com/v1beta1/{+parent}/catalogItems:import",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body
   GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequest})
