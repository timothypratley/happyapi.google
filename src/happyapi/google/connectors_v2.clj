(ns happyapi.google.connectors-v2
  "Connectors API
Enables users to create and manage connections to Google Cloud services and third-party business applications using the Connectors interface.
See: https://cloud.google.com/integration-connectors/docs/overview")

(defn projects-locations-connections-checkStatus
  "Reports the status of the connection. Note that when the connection is in a state that is not ACTIVE, the implementation of this RPC method must return a Status with the corresponding State instead of returning a gRPC status code that is not \"OK\", which indicates that ConnectionStatus itself, not the connection, failed.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/checkStatus

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://connectors.googleapis.com/v2/{+name}:checkStatus",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-connections-checkReadiness
  "Reports readiness status of the connector. Similar logic to GetStatus but modified for kubernetes health check to understand.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/checkReadiness

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://connectors.googleapis.com/v2/{+name}:checkReadiness",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-connections-exchangeAuthCode
  "ExchangeAuthCode exchanges the OAuth authorization code (and other necessary data) for an access token (and associated credentials).
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/exchangeAuthCode

name <> 
ExchangeAuthCodeRequest:
ExchangeAuthCodeRequest"
  [name ExchangeAuthCodeRequest]
  {:method :post,
   :uri-template
   "https://connectors.googleapis.com/v2/{+name}:exchangeAuthCode",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ExchangeAuthCodeRequest})

(defn projects-locations-connections-refreshAccessToken
  "RefreshAccessToken exchanges the OAuth refresh token (and other necessary data) for a new access token (and new associated credentials).
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/refreshAccessToken

name <> 
RefreshAccessTokenRequest:
RefreshAccessTokenRequest"
  [name RefreshAccessTokenRequest]
  {:method :post,
   :uri-template
   "https://connectors.googleapis.com/v2/{+name}:refreshAccessToken",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RefreshAccessTokenRequest})

(defn projects-locations-connections-executeSqlQuery
  "Executes a SQL statement specified in the body of the request. An example of this SQL statement in the case of Salesforce connector would be 'select * from Account a, Order o where a.Id = o.AccountId'.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/executeSqlQuery

connection <> 
ExecuteSqlQueryRequest:
ExecuteSqlQueryRequest"
  [connection ExecuteSqlQueryRequest]
  {:method :post,
   :uri-template
   "https://connectors.googleapis.com/v2/{+connection}:executeSqlQuery",
   :uri-template-args {"connection" connection},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ExecuteSqlQueryRequest})

(defn projects-locations-connections-actions-execute
  "Executes an action with the name specified in the request. The input parameters for executing the action are passed through the body of the ExecuteAction request.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/actions/execute

name <> 
ExecuteActionRequest:
ExecuteActionRequest"
  [name ExecuteActionRequest]
  {:method :post,
   :uri-template
   "https://connectors.googleapis.com/v2/{+name}:execute",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ExecuteActionRequest})

(defn projects-locations-connections-actions-list
  "Gets the schema of all the actions supported by the connector.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/actions/list

parent <> 

optional:
pageSize <integer> Number of Actions to return. Defaults to 25.
view <string> Specifies which fields of the Action are returned in the response."
  ([parent] (projects-locations-connections-actions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://connectors.googleapis.com/v2/{+parent}/actions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-actions-get
  "Gets the schema of the given action.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/actions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://connectors.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-connections-entityTypes-get
  "Gets metadata of given entity type
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/entityTypes/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://connectors.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-connections-entityTypes-list
  "Lists metadata related to all entity types present in the external system.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/entityTypes/list

parent <> 

optional:
pageSize <integer> Number of entity types to return. Defaults to 25.
view <string> Specifies which fields of the Entity Type are returned in the response."
  ([parent]
    (projects-locations-connections-entityTypes-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://connectors.googleapis.com/v2/{+parent}/entityTypes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-entityTypes-entities-list
  "Lists entity rows of a particular entity type contained in the request. Note: 1. Currently, only max of one 'sort_by' column is supported. 2. If no 'sort_by' column is provided, the primary key of the table is used. If zero or more than one primary key is available, we default to the unpaginated list entities logic which only returns the first page. 3. The values of the 'sort_by' columns must uniquely identify an entity row, otherwise undefined behaviors may be observed during pagination. 4. Since transactions are not supported, any updates, inserts or deletes during pagination can lead to stale data being returned or other unexpected behaviors.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/entityTypes/entities/list

parent <> 

optional:
pageSize <integer> Number of entity rows to return. Defaults page size = 25. Max page size = 200.
sortBy <string> List of 'sort_by' columns to use when returning the results.
conditions <string> Conditions to be used when listing entities. From a proto standpoint, There are no restrictions on what can be passed using this field. The connector documentation should have information about what format of filters/conditions are supported."
  ([parent]
    (projects-locations-connections-entityTypes-entities-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://connectors.googleapis.com/v2/{+parent}/entities",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-entityTypes-entities-get
  "Gets a single entity row matching the entity type and entity id specified in the request.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/entityTypes/entities/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://connectors.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-connections-entityTypes-entities-create
  "Creates a new entity row of the specified entity type in the external system. The field values for creating the row are contained in the body of the request. The response message contains a `Entity` message object returned as a response by the external system.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/entityTypes/entities/create

parent <> 
Entity:
Entity"
  [parent Entity]
  {:method :post,
   :uri-template
   "https://connectors.googleapis.com/v2/{+parent}/entities",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body Entity})

(defn projects-locations-connections-entityTypes-entities-patch
  "Updates an existing entity row matching the entity type and entity id specified in the request. The fields in the entity row that need to be modified are contained in the body of the request. All unspecified fields are left unchanged. The response message contains a `Entity` message object returned as a response by the external system.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/entityTypes/entities/patch

name <> 
Entity:
Entity"
  [name Entity]
  {:method :patch,
   :uri-template "https://connectors.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body Entity})

(defn projects-locations-connections-entityTypes-entities-updateEntitiesWithConditions
  "Updates entities based on conditions specified in the request and not on entity id.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/entityTypes/entities/updateEntitiesWithConditions

entityType <> 
Entity:
Entity

optional:
conditions <string> Required. Conditions to be used when updating entities. From a proto standpoint, There are no restrictions on what can be passed using this field. The connector documentation should have information about what format of filters/conditions are supported. Note: If this conditions field is left empty, an exception is thrown. We don't want to consider 'empty conditions' to be a match-all case. Connector developers can determine and document what a match-all case constraint would be."
  ([entityType Entity]
    (projects-locations-connections-entityTypes-entities-updateEntitiesWithConditions
      entityType
      Entity
      nil))
  ([entityType Entity optional]
    {:method :post,
     :uri-template
     "https://connectors.googleapis.com/v2/{+entityType}/entities:updateEntitiesWithConditions",
     :uri-template-args {"entityType" entityType},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Entity}))

(defn projects-locations-connections-entityTypes-entities-delete
  "Deletes an existing entity row matching the entity type and entity id specified in the request.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/entityTypes/entities/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://connectors.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-connections-entityTypes-entities-deleteEntitiesWithConditions
  "Deletes entities based on conditions specified in the request and not on entity id.
https://cloud.google.com/integration-connectors/docs/overview/v2/reference/rest/v2/projects/locations/connections/entityTypes/entities/deleteEntitiesWithConditions

entityType <> 

optional:
conditions <string> Required. Conditions to be used when deleting entities. From a proto standpoint, There are no restrictions on what can be passed using this field. The connector documentation should have information about what format of filters/conditions are supported. Note: If this conditions field is left empty, an exception is thrown. We don't want to consider 'empty conditions' to be a match-all case. Connector developers can determine and document what a match-all case constraint would be."
  ([entityType]
    (projects-locations-connections-entityTypes-entities-deleteEntitiesWithConditions
      entityType
      nil))
  ([entityType optional]
    {:method :post,
     :uri-template
     "https://connectors.googleapis.com/v2/{+entityType}/entities:deleteEntitiesWithConditions",
     :uri-template-args {"entityType" entityType},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
