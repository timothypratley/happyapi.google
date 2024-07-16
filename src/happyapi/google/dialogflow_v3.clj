(ns happyapi.google.dialogflow-v3
  "Dialogflow API
Builds conversational interfaces (for example, chatbots, and voice-powered apps and devices).
See: https://cloud.google.com/dialogflow/"
  (:require [happyapi.providers.google :as client]))

(defn projects-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/operations/cancel

name <> "
  [name]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/operations/cancel

name <> "
  [name]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-securitySettings-create
  "Create security settings in the specified location.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/securitySettings/create

parent <> 
GoogleCloudDialogflowCxV3SecuritySettings:
GoogleCloudDialogflowCxV3SecuritySettings"
  [parent GoogleCloudDialogflowCxV3SecuritySettings]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/securitySettings",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3SecuritySettings}))

(defn projects-locations-securitySettings-get
  "Retrieves the specified SecuritySettings. The returned settings may be stale by up to 1 minute.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/securitySettings/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-securitySettings-patch
  "Updates the specified SecuritySettings.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/securitySettings/patch

name <> 
GoogleCloudDialogflowCxV3SecuritySettings:
GoogleCloudDialogflowCxV3SecuritySettings

optional:
updateMask <string> Required. The mask to control which fields get updated. If the mask is not present, all fields will be updated."
  ([name GoogleCloudDialogflowCxV3SecuritySettings]
    (projects-locations-securitySettings-patch
      name
      GoogleCloudDialogflowCxV3SecuritySettings
      nil))
  ([name GoogleCloudDialogflowCxV3SecuritySettings optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3SecuritySettings})))

(defn projects-locations-securitySettings-list
  "Returns the list of all security settings in the specified location.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/securitySettings/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 20 and at most 100."
  ([parent] (projects-locations-securitySettings-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/securitySettings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-securitySettings-delete
  "Deletes the specified SecuritySettings.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/securitySettings/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-getValidationResult
  "Gets the latest agent validation result. Agent validation is performed when ValidateAgent is called.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/getValidationResult

name <> 

optional:
languageCode <string> If not specified, the agent's default language is used."
  ([name] (projects-locations-agents-getValidationResult name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-list
  "Returns the list of all agents in the specified location.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000."
  ([parent] (projects-locations-agents-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/agents",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-delete
  "Deletes the specified agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-export
  "Exports the specified agent to a binary file. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: ExportAgentResponse
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/export

name <> 
GoogleCloudDialogflowCxV3ExportAgentRequest:
GoogleCloudDialogflowCxV3ExportAgentRequest"
  [name GoogleCloudDialogflowCxV3ExportAgentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+name}:export",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3ExportAgentRequest}))

(defn projects-locations-agents-validate
  "Validates the specified agent and creates or updates validation results. The agent in draft version is validated. Please call this API after the training is completed to get the complete validation results.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/validate

name <> 
GoogleCloudDialogflowCxV3ValidateAgentRequest:
GoogleCloudDialogflowCxV3ValidateAgentRequest"
  [name GoogleCloudDialogflowCxV3ValidateAgentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+name}:validate",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3ValidateAgentRequest}))

(defn projects-locations-agents-getGenerativeSettings
  "Gets the generative settings for the agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/getGenerativeSettings

name <> 

optional:
languageCode <string> Required. Language code of the generative settings."
  ([name] (projects-locations-agents-getGenerativeSettings name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-patch
  "Updates the specified agent. Note: You should always train flows prior to sending them queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/patch

name <> 
GoogleCloudDialogflowCxV3Agent:
GoogleCloudDialogflowCxV3Agent

optional:
updateMask <string> The mask to control which fields get updated. If the mask is not present, all fields will be updated."
  ([name GoogleCloudDialogflowCxV3Agent]
    (projects-locations-agents-patch
      name
      GoogleCloudDialogflowCxV3Agent
      nil))
  ([name GoogleCloudDialogflowCxV3Agent optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3Agent})))

(defn projects-locations-agents-updateGenerativeSettings
  "Updates the generative settings for the agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/updateGenerativeSettings

name <> 
GoogleCloudDialogflowCxV3GenerativeSettings:
GoogleCloudDialogflowCxV3GenerativeSettings

optional:
updateMask <string> Optional. The mask to control which fields get updated. If the mask is not present, all fields will be updated."
  ([name GoogleCloudDialogflowCxV3GenerativeSettings]
    (projects-locations-agents-updateGenerativeSettings
      name
      GoogleCloudDialogflowCxV3GenerativeSettings
      nil))
  ([name GoogleCloudDialogflowCxV3GenerativeSettings optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3GenerativeSettings})))

(defn projects-locations-agents-create
  "Creates an agent in the specified location. Note: You should always train flows prior to sending them queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/create

parent <> 
GoogleCloudDialogflowCxV3Agent:
GoogleCloudDialogflowCxV3Agent"
  [parent GoogleCloudDialogflowCxV3Agent]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/agents",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3Agent}))

(defn projects-locations-agents-restore
  "Restores the specified agent from a binary file. Replaces the current agent with a new one. Note that all existing resources in agent (e.g. intents, entity types, flows) will be removed. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: An [Empty message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty) Note: You should always train flows prior to sending them queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/restore

name <> 
GoogleCloudDialogflowCxV3RestoreAgentRequest:
GoogleCloudDialogflowCxV3RestoreAgentRequest"
  [name GoogleCloudDialogflowCxV3RestoreAgentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+name}:restore",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3RestoreAgentRequest}))

(defn projects-locations-agents-get
  "Retrieves the specified agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-entityTypes-get
  "Retrieves the specified entity type.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/entityTypes/get

name <> 

optional:
languageCode <string> The language to retrieve the entity type for. The following fields are language dependent: * `EntityType.entities.value` * `EntityType.entities.synonyms` * `EntityType.excluded_phrases.value` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([name] (projects-locations-agents-entityTypes-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-entityTypes-create
  "Creates an entity type in the specified agent. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/entityTypes/create

parent <> 
GoogleCloudDialogflowCxV3EntityType:
GoogleCloudDialogflowCxV3EntityType

optional:
languageCode <string> The language of the following fields in `entity_type`: * `EntityType.entities.value` * `EntityType.entities.synonyms` * `EntityType.excluded_phrases.value` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([parent GoogleCloudDialogflowCxV3EntityType]
    (projects-locations-agents-entityTypes-create
      parent
      GoogleCloudDialogflowCxV3EntityType
      nil))
  ([parent GoogleCloudDialogflowCxV3EntityType optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/entityTypes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3EntityType})))

(defn projects-locations-agents-entityTypes-patch
  "Updates the specified entity type. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/entityTypes/patch

name <> 
GoogleCloudDialogflowCxV3EntityType:
GoogleCloudDialogflowCxV3EntityType

optional:
languageCode <string> The language of the following fields in `entity_type`: * `EntityType.entities.value` * `EntityType.entities.synonyms` * `EntityType.excluded_phrases.value` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
updateMask <string> The mask to control which fields get updated."
  ([name GoogleCloudDialogflowCxV3EntityType]
    (projects-locations-agents-entityTypes-patch
      name
      GoogleCloudDialogflowCxV3EntityType
      nil))
  ([name GoogleCloudDialogflowCxV3EntityType optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3EntityType})))

(defn projects-locations-agents-entityTypes-delete
  "Deletes the specified entity type. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/entityTypes/delete

name <> 

optional:
force <boolean> This field has no effect for entity type not being used. For entity types that are used by intents or pages: * If `force` is set to false, an error will be returned with message indicating the referencing resources. * If `force` is set to true, Dialogflow will remove the entity type, as well as any references to the entity type (i.e. Page parameter of the entity type will be changed to '@sys.any' and intent parameter of the entity type will be removed)."
  ([name] (projects-locations-agents-entityTypes-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-entityTypes-list
  "Returns the list of all entity types in the specified agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/entityTypes/list

parent <> 

optional:
languageCode <string> The language to list entity types for. The following fields are language dependent: * `EntityType.entities.value` * `EntityType.entities.synonyms` * `EntityType.excluded_phrases.value` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000."
  ([parent] (projects-locations-agents-entityTypes-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/entityTypes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-entityTypes-export
  "Exports the selected entity types.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/entityTypes/export

parent <> 
GoogleCloudDialogflowCxV3ExportEntityTypesRequest:
GoogleCloudDialogflowCxV3ExportEntityTypesRequest"
  [parent GoogleCloudDialogflowCxV3ExportEntityTypesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/entityTypes:export",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3ExportEntityTypesRequest}))

(defn projects-locations-agents-entityTypes-import
  "Imports the specified entitytypes into the agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/entityTypes/import

parent <> 
GoogleCloudDialogflowCxV3ImportEntityTypesRequest:
GoogleCloudDialogflowCxV3ImportEntityTypesRequest"
  [parent GoogleCloudDialogflowCxV3ImportEntityTypesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/entityTypes:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3ImportEntityTypesRequest}))

(defn projects-locations-agents-sessions-detectIntent
  "Processes a natural language query and returns structured, actionable data as a result. This method is not idempotent, because it may cause session entity types to be updated, which in turn might affect results of future queries. Note: Always use agent versions for production traffic. See [Versions and environments](https://cloud.google.com/dialogflow/cx/docs/concept/version).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/sessions/detectIntent

session <> 
GoogleCloudDialogflowCxV3DetectIntentRequest:
GoogleCloudDialogflowCxV3DetectIntentRequest"
  [session GoogleCloudDialogflowCxV3DetectIntentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+session}:detectIntent",
     :uri-template-args {"session" session},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3DetectIntentRequest}))

(defn projects-locations-agents-sessions-serverStreamingDetectIntent
  "Processes a natural language query and returns structured, actionable data as a result through server-side streaming. Server-side streaming allows Dialogflow to send [partial responses](https://cloud.google.com/dialogflow/cx/docs/concept/fulfillment#partial-response) earlier in a single request.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/sessions/serverStreamingDetectIntent

session <> 
GoogleCloudDialogflowCxV3DetectIntentRequest:
GoogleCloudDialogflowCxV3DetectIntentRequest"
  [session GoogleCloudDialogflowCxV3DetectIntentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+session}:serverStreamingDetectIntent",
     :uri-template-args {"session" session},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3DetectIntentRequest}))

(defn projects-locations-agents-sessions-matchIntent
  "Returns preliminary intent match results, doesn't change the session status.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/sessions/matchIntent

session <> 
GoogleCloudDialogflowCxV3MatchIntentRequest:
GoogleCloudDialogflowCxV3MatchIntentRequest"
  [session GoogleCloudDialogflowCxV3MatchIntentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+session}:matchIntent",
     :uri-template-args {"session" session},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3MatchIntentRequest}))

(defn projects-locations-agents-sessions-fulfillIntent
  "Fulfills a matched intent returned by MatchIntent. Must be called after MatchIntent, with input from MatchIntentResponse. Otherwise, the behavior is undefined.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/sessions/fulfillIntent

session <> 
GoogleCloudDialogflowCxV3FulfillIntentRequest:
GoogleCloudDialogflowCxV3FulfillIntentRequest"
  [session GoogleCloudDialogflowCxV3FulfillIntentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+session}:fulfillIntent",
     :uri-template-args {"session" session},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3FulfillIntentRequest}))

(defn projects-locations-agents-sessions-submitAnswerFeedback
  "Updates the feedback received from the user for a single turn of the bot response.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/sessions/submitAnswerFeedback

session <> 
GoogleCloudDialogflowCxV3SubmitAnswerFeedbackRequest:
GoogleCloudDialogflowCxV3SubmitAnswerFeedbackRequest"
  [session GoogleCloudDialogflowCxV3SubmitAnswerFeedbackRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+session}:submitAnswerFeedback",
     :uri-template-args {"session" session},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3SubmitAnswerFeedbackRequest}))

(defn projects-locations-agents-sessions-entityTypes-list
  "Returns the list of all session entity types in the specified session.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/sessions/entityTypes/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000."
  ([parent]
    (projects-locations-agents-sessions-entityTypes-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/entityTypes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-sessions-entityTypes-get
  "Retrieves the specified session entity type.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/sessions/entityTypes/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-sessions-entityTypes-create
  "Creates a session entity type.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/sessions/entityTypes/create

parent <> 
GoogleCloudDialogflowCxV3SessionEntityType:
GoogleCloudDialogflowCxV3SessionEntityType"
  [parent GoogleCloudDialogflowCxV3SessionEntityType]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/entityTypes",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3SessionEntityType}))

(defn projects-locations-agents-sessions-entityTypes-patch
  "Updates the specified session entity type.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/sessions/entityTypes/patch

name <> 
GoogleCloudDialogflowCxV3SessionEntityType:
GoogleCloudDialogflowCxV3SessionEntityType

optional:
updateMask <string> The mask to control which fields get updated."
  ([name GoogleCloudDialogflowCxV3SessionEntityType]
    (projects-locations-agents-sessions-entityTypes-patch
      name
      GoogleCloudDialogflowCxV3SessionEntityType
      nil))
  ([name GoogleCloudDialogflowCxV3SessionEntityType optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3SessionEntityType})))

(defn projects-locations-agents-sessions-entityTypes-delete
  "Deletes the specified session entity type.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/sessions/entityTypes/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-intents-list
  "Returns the list of all intents in the specified agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/intents/list

parent <> 

optional:
languageCode <string> The language to list intents for. The following fields are language dependent: * `Intent.training_phrases.parts.text` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
intentView <string> The resource view to apply to the returned intent.
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000."
  ([parent] (projects-locations-agents-intents-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/intents",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-intents-get
  "Retrieves the specified intent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/intents/get

name <> 

optional:
languageCode <string> The language to retrieve the intent for. The following fields are language dependent: * `Intent.training_phrases.parts.text` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([name] (projects-locations-agents-intents-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-intents-create
  "Creates an intent in the specified agent. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/intents/create

parent <> 
GoogleCloudDialogflowCxV3Intent:
GoogleCloudDialogflowCxV3Intent

optional:
languageCode <string> The language of the following fields in `intent`: * `Intent.training_phrases.parts.text` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([parent GoogleCloudDialogflowCxV3Intent]
    (projects-locations-agents-intents-create
      parent
      GoogleCloudDialogflowCxV3Intent
      nil))
  ([parent GoogleCloudDialogflowCxV3Intent optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/intents",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3Intent})))

(defn projects-locations-agents-intents-patch
  "Updates the specified intent. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/intents/patch

name <> 
GoogleCloudDialogflowCxV3Intent:
GoogleCloudDialogflowCxV3Intent

optional:
languageCode <string> The language of the following fields in `intent`: * `Intent.training_phrases.parts.text` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
updateMask <string> The mask to control which fields get updated. If the mask is not present, all fields will be updated."
  ([name GoogleCloudDialogflowCxV3Intent]
    (projects-locations-agents-intents-patch
      name
      GoogleCloudDialogflowCxV3Intent
      nil))
  ([name GoogleCloudDialogflowCxV3Intent optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3Intent})))

(defn projects-locations-agents-intents-delete
  "Deletes the specified intent. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/intents/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-intents-import
  "Imports the specified intents into the agent. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: ImportIntentsMetadata - `response`: ImportIntentsResponse
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/intents/import

parent <> 
GoogleCloudDialogflowCxV3ImportIntentsRequest:
GoogleCloudDialogflowCxV3ImportIntentsRequest"
  [parent GoogleCloudDialogflowCxV3ImportIntentsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/intents:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3ImportIntentsRequest}))

(defn projects-locations-agents-intents-export
  "Exports the selected intents. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: ExportIntentsMetadata - `response`: ExportIntentsResponse
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/intents/export

parent <> 
GoogleCloudDialogflowCxV3ExportIntentsRequest:
GoogleCloudDialogflowCxV3ExportIntentsRequest"
  [parent GoogleCloudDialogflowCxV3ExportIntentsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/intents:export",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3ExportIntentsRequest}))

(defn projects-locations-agents-webhooks-list
  "Returns the list of all webhooks in the specified agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/webhooks/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000."
  ([parent] (projects-locations-agents-webhooks-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/webhooks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-webhooks-get
  "Retrieves the specified webhook.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/webhooks/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-webhooks-create
  "Creates a webhook in the specified agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/webhooks/create

parent <> 
GoogleCloudDialogflowCxV3Webhook:
GoogleCloudDialogflowCxV3Webhook"
  [parent GoogleCloudDialogflowCxV3Webhook]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/webhooks",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3Webhook}))

(defn projects-locations-agents-webhooks-patch
  "Updates the specified webhook.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/webhooks/patch

name <> 
GoogleCloudDialogflowCxV3Webhook:
GoogleCloudDialogflowCxV3Webhook

optional:
updateMask <string> The mask to control which fields get updated. If the mask is not present, all fields will be updated."
  ([name GoogleCloudDialogflowCxV3Webhook]
    (projects-locations-agents-webhooks-patch
      name
      GoogleCloudDialogflowCxV3Webhook
      nil))
  ([name GoogleCloudDialogflowCxV3Webhook optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3Webhook})))

(defn projects-locations-agents-webhooks-delete
  "Deletes the specified webhook.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/webhooks/delete

name <> 

optional:
force <boolean> This field has no effect for webhook not being used. For webhooks that are used by pages/flows/transition route groups: * If `force` is set to false, an error will be returned with message indicating the referenced resources. * If `force` is set to true, Dialogflow will remove the webhook, as well as any references to the webhook (i.e. Webhook and tagin fulfillments that point to this webhook will be removed)."
  ([name] (projects-locations-agents-webhooks-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-environments-list
  "Returns the list of all environments in the specified Agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 20 and at most 100."
  ([parent] (projects-locations-agents-environments-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/environments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-environments-get
  "Retrieves the specified Environment.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-environments-create
  "Creates an Environment in the specified Agent. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: Environment
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/create

parent <> 
GoogleCloudDialogflowCxV3Environment:
GoogleCloudDialogflowCxV3Environment"
  [parent GoogleCloudDialogflowCxV3Environment]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/environments",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3Environment}))

(defn projects-locations-agents-environments-patch
  "Updates the specified Environment. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: Environment
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/patch

name <> 
GoogleCloudDialogflowCxV3Environment:
GoogleCloudDialogflowCxV3Environment

optional:
updateMask <string> Required. The mask to control which fields get updated."
  ([name GoogleCloudDialogflowCxV3Environment]
    (projects-locations-agents-environments-patch
      name
      GoogleCloudDialogflowCxV3Environment
      nil))
  ([name GoogleCloudDialogflowCxV3Environment optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3Environment})))

(defn projects-locations-agents-environments-delete
  "Deletes the specified Environment.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-environments-lookupEnvironmentHistory
  "Looks up the history of the specified Environment.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/lookupEnvironmentHistory

name <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000."
  ([name]
    (projects-locations-agents-environments-lookupEnvironmentHistory
      name
      nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+name}:lookupEnvironmentHistory",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-environments-runContinuousTest
  "Kicks off a continuous test under the specified Environment. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: RunContinuousTestMetadata - `response`: RunContinuousTestResponse
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/runContinuousTest

environment <> 
GoogleCloudDialogflowCxV3RunContinuousTestRequest:
GoogleCloudDialogflowCxV3RunContinuousTestRequest"
  [environment GoogleCloudDialogflowCxV3RunContinuousTestRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+environment}:runContinuousTest",
     :uri-template-args {"environment" environment},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3RunContinuousTestRequest}))

(defn projects-locations-agents-environments-deployFlow
  "Deploys a flow to the specified Environment. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: DeployFlowMetadata - `response`: DeployFlowResponse
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/deployFlow

environment <> 
GoogleCloudDialogflowCxV3DeployFlowRequest:
GoogleCloudDialogflowCxV3DeployFlowRequest"
  [environment GoogleCloudDialogflowCxV3DeployFlowRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+environment}:deployFlow",
     :uri-template-args {"environment" environment},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3DeployFlowRequest}))

(defn projects-locations-agents-environments-deployments-list
  "Returns the list of all deployments in the specified Environment.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/deployments/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 20 and at most 100."
  ([parent]
    (projects-locations-agents-environments-deployments-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/deployments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-environments-deployments-get
  "Retrieves the specified Deployment.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/deployments/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-environments-sessions-detectIntent
  "Processes a natural language query and returns structured, actionable data as a result. This method is not idempotent, because it may cause session entity types to be updated, which in turn might affect results of future queries. Note: Always use agent versions for production traffic. See [Versions and environments](https://cloud.google.com/dialogflow/cx/docs/concept/version).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/sessions/detectIntent

session <> 
GoogleCloudDialogflowCxV3DetectIntentRequest:
GoogleCloudDialogflowCxV3DetectIntentRequest"
  [session GoogleCloudDialogflowCxV3DetectIntentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+session}:detectIntent",
     :uri-template-args {"session" session},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3DetectIntentRequest}))

(defn projects-locations-agents-environments-sessions-serverStreamingDetectIntent
  "Processes a natural language query and returns structured, actionable data as a result through server-side streaming. Server-side streaming allows Dialogflow to send [partial responses](https://cloud.google.com/dialogflow/cx/docs/concept/fulfillment#partial-response) earlier in a single request.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/sessions/serverStreamingDetectIntent

session <> 
GoogleCloudDialogflowCxV3DetectIntentRequest:
GoogleCloudDialogflowCxV3DetectIntentRequest"
  [session GoogleCloudDialogflowCxV3DetectIntentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+session}:serverStreamingDetectIntent",
     :uri-template-args {"session" session},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3DetectIntentRequest}))

(defn projects-locations-agents-environments-sessions-matchIntent
  "Returns preliminary intent match results, doesn't change the session status.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/sessions/matchIntent

session <> 
GoogleCloudDialogflowCxV3MatchIntentRequest:
GoogleCloudDialogflowCxV3MatchIntentRequest"
  [session GoogleCloudDialogflowCxV3MatchIntentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+session}:matchIntent",
     :uri-template-args {"session" session},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3MatchIntentRequest}))

(defn projects-locations-agents-environments-sessions-fulfillIntent
  "Fulfills a matched intent returned by MatchIntent. Must be called after MatchIntent, with input from MatchIntentResponse. Otherwise, the behavior is undefined.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/sessions/fulfillIntent

session <> 
GoogleCloudDialogflowCxV3FulfillIntentRequest:
GoogleCloudDialogflowCxV3FulfillIntentRequest"
  [session GoogleCloudDialogflowCxV3FulfillIntentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+session}:fulfillIntent",
     :uri-template-args {"session" session},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3FulfillIntentRequest}))

(defn projects-locations-agents-environments-sessions-entityTypes-list
  "Returns the list of all session entity types in the specified session.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/sessions/entityTypes/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000."
  ([parent]
    (projects-locations-agents-environments-sessions-entityTypes-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/entityTypes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-environments-sessions-entityTypes-get
  "Retrieves the specified session entity type.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/sessions/entityTypes/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-environments-sessions-entityTypes-create
  "Creates a session entity type.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/sessions/entityTypes/create

parent <> 
GoogleCloudDialogflowCxV3SessionEntityType:
GoogleCloudDialogflowCxV3SessionEntityType"
  [parent GoogleCloudDialogflowCxV3SessionEntityType]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/entityTypes",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3SessionEntityType}))

(defn projects-locations-agents-environments-sessions-entityTypes-patch
  "Updates the specified session entity type.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/sessions/entityTypes/patch

name <> 
GoogleCloudDialogflowCxV3SessionEntityType:
GoogleCloudDialogflowCxV3SessionEntityType

optional:
updateMask <string> The mask to control which fields get updated."
  ([name GoogleCloudDialogflowCxV3SessionEntityType]
    (projects-locations-agents-environments-sessions-entityTypes-patch
      name
      GoogleCloudDialogflowCxV3SessionEntityType
      nil))
  ([name GoogleCloudDialogflowCxV3SessionEntityType optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3SessionEntityType})))

(defn projects-locations-agents-environments-sessions-entityTypes-delete
  "Deletes the specified session entity type.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/sessions/entityTypes/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-environments-continuousTestResults-list
  "Fetches a list of continuous test results for a given environment.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/continuousTestResults/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000."
  ([parent]
    (projects-locations-agents-environments-continuousTestResults-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/continuousTestResults",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-environments-experiments-list
  "Returns the list of all experiments in the specified Environment.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/experiments/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 20 and at most 100."
  ([parent]
    (projects-locations-agents-environments-experiments-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/experiments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-environments-experiments-get
  "Retrieves the specified Experiment.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/experiments/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-environments-experiments-create
  "Creates an Experiment in the specified Environment.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/experiments/create

parent <> 
GoogleCloudDialogflowCxV3Experiment:
GoogleCloudDialogflowCxV3Experiment"
  [parent GoogleCloudDialogflowCxV3Experiment]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/experiments",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3Experiment}))

(defn projects-locations-agents-environments-experiments-patch
  "Updates the specified Experiment.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/experiments/patch

name <> 
GoogleCloudDialogflowCxV3Experiment:
GoogleCloudDialogflowCxV3Experiment

optional:
updateMask <string> Required. The mask to control which fields get updated."
  ([name GoogleCloudDialogflowCxV3Experiment]
    (projects-locations-agents-environments-experiments-patch
      name
      GoogleCloudDialogflowCxV3Experiment
      nil))
  ([name GoogleCloudDialogflowCxV3Experiment optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3Experiment})))

(defn projects-locations-agents-environments-experiments-delete
  "Deletes the specified Experiment.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/experiments/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-environments-experiments-start
  "Starts the specified Experiment. This rpc only changes the state of experiment from PENDING to RUNNING.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/experiments/start

name <> 
GoogleCloudDialogflowCxV3StartExperimentRequest:
GoogleCloudDialogflowCxV3StartExperimentRequest"
  [name GoogleCloudDialogflowCxV3StartExperimentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+name}:start",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3StartExperimentRequest}))

(defn projects-locations-agents-environments-experiments-stop
  "Stops the specified Experiment. This rpc only changes the state of experiment from RUNNING to DONE.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/environments/experiments/stop

name <> 
GoogleCloudDialogflowCxV3StopExperimentRequest:
GoogleCloudDialogflowCxV3StopExperimentRequest"
  [name GoogleCloudDialogflowCxV3StopExperimentRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}:stop",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3StopExperimentRequest}))

(defn projects-locations-agents-transitionRouteGroups-list
  "Returns the list of all transition route groups in the specified flow.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/transitionRouteGroups/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000.
languageCode <string> The language to list transition route groups for. The following fields are language dependent: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([parent]
    (projects-locations-agents-transitionRouteGroups-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/transitionRouteGroups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-transitionRouteGroups-get
  "Retrieves the specified TransitionRouteGroup.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/transitionRouteGroups/get

name <> 

optional:
languageCode <string> The language to retrieve the transition route group for. The following fields are language dependent: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([name]
    (projects-locations-agents-transitionRouteGroups-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-transitionRouteGroups-create
  "Creates an TransitionRouteGroup in the specified flow. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/transitionRouteGroups/create

parent <> 
GoogleCloudDialogflowCxV3TransitionRouteGroup:
GoogleCloudDialogflowCxV3TransitionRouteGroup

optional:
languageCode <string> The language of the following fields in `TransitionRouteGroup`: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([parent GoogleCloudDialogflowCxV3TransitionRouteGroup]
    (projects-locations-agents-transitionRouteGroups-create
      parent
      GoogleCloudDialogflowCxV3TransitionRouteGroup
      nil))
  ([parent GoogleCloudDialogflowCxV3TransitionRouteGroup optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/transitionRouteGroups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3TransitionRouteGroup})))

(defn projects-locations-agents-transitionRouteGroups-patch
  "Updates the specified TransitionRouteGroup. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/transitionRouteGroups/patch

name <> 
GoogleCloudDialogflowCxV3TransitionRouteGroup:
GoogleCloudDialogflowCxV3TransitionRouteGroup

optional:
updateMask <string> The mask to control which fields get updated.
languageCode <string> The language of the following fields in `TransitionRouteGroup`: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([name GoogleCloudDialogflowCxV3TransitionRouteGroup]
    (projects-locations-agents-transitionRouteGroups-patch
      name
      GoogleCloudDialogflowCxV3TransitionRouteGroup
      nil))
  ([name GoogleCloudDialogflowCxV3TransitionRouteGroup optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3TransitionRouteGroup})))

(defn projects-locations-agents-transitionRouteGroups-delete
  "Deletes the specified TransitionRouteGroup. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/transitionRouteGroups/delete

name <> 

optional:
force <boolean> This field has no effect for transition route group that no page is using. If the transition route group is referenced by any page: * If `force` is set to false, an error will be returned with message indicating pages that reference the transition route group. * If `force` is set to true, Dialogflow will remove the transition route group, as well as any reference to it."
  ([name]
    (projects-locations-agents-transitionRouteGroups-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-generators-list
  "Returns the list of all generators in the specified agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/generators/list

parent <> 

optional:
languageCode <string> The language to list generators for.
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000."
  ([parent] (projects-locations-agents-generators-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/generators",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-generators-get
  "Retrieves the specified generator.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/generators/get

name <> 

optional:
languageCode <string> The language to list generators for."
  ([name] (projects-locations-agents-generators-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-generators-create
  "Creates a generator in the specified agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/generators/create

parent <> 
GoogleCloudDialogflowCxV3Generator:
GoogleCloudDialogflowCxV3Generator

optional:
languageCode <string> The language to create generators for the following fields: * `Generator.prompt_text.text` If not specified, the agent's default language is used."
  ([parent GoogleCloudDialogflowCxV3Generator]
    (projects-locations-agents-generators-create
      parent
      GoogleCloudDialogflowCxV3Generator
      nil))
  ([parent GoogleCloudDialogflowCxV3Generator optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/generators",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3Generator})))

(defn projects-locations-agents-generators-patch
  "Update the specified generator.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/generators/patch

name <> 
GoogleCloudDialogflowCxV3Generator:
GoogleCloudDialogflowCxV3Generator

optional:
languageCode <string> The language to list generators for.
updateMask <string> The mask to control which fields get updated. If the mask is not present, all fields will be updated."
  ([name GoogleCloudDialogflowCxV3Generator]
    (projects-locations-agents-generators-patch
      name
      GoogleCloudDialogflowCxV3Generator
      nil))
  ([name GoogleCloudDialogflowCxV3Generator optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3Generator})))

(defn projects-locations-agents-generators-delete
  "Deletes the specified generators.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/generators/delete

name <> 

optional:
force <boolean> This field has no effect for generators not being used. For generators that are used by pages/flows/transition route groups: * If `force` is set to false, an error will be returned with message indicating the referenced resources. * If `force` is set to true, Dialogflow will remove the generator, as well as any references to the generator (i.e. Generator) in fulfillments."
  ([name] (projects-locations-agents-generators-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-changelogs-list
  "Returns the list of Changelogs.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/changelogs/list

parent <> 

optional:
filter <string> The filter string. Supports filter by user_email, resource, type and create_time. Some examples: 1. By user email: user_email = \"someone@google.com\" 2. By resource name: resource = \"projects/123/locations/global/agents/456/flows/789\" 3. By resource display name: display_name = \"my agent\" 4. By action: action = \"Create\" 5. By type: type = \"flows\" 6. By create time. Currently predicates on `create_time` and `create_time_epoch_seconds` are supported: create_time_epoch_seconds > 1551790877 AND create_time <= 2017-01-15T01:30:15.01Z 7. Combination of above filters: resource = \"projects/123/locations/global/agents/456/flows/789\" AND user_email = \"someone@google.com\" AND create_time <= 2017-01-15T01:30:15.01Z
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000."
  ([parent] (projects-locations-agents-changelogs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/changelogs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-changelogs-get
  "Retrieves the specified Changelog.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/changelogs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-testCases-list
  "Fetches a list of test cases for a given agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/testCases/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 20. Note that when TestCaseView = FULL, the maximum page size allowed is 20. When TestCaseView = BASIC, the maximum page size allowed is 500.
view <string> Specifies whether response should include all fields or just the metadata."
  ([parent] (projects-locations-agents-testCases-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/testCases",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-testCases-export
  "Exports the test cases under the agent to a Cloud Storage bucket or a local file. Filter can be applied to export a subset of test cases. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: ExportTestCasesMetadata - `response`: ExportTestCasesResponse
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/testCases/export

parent <> 
GoogleCloudDialogflowCxV3ExportTestCasesRequest:
GoogleCloudDialogflowCxV3ExportTestCasesRequest"
  [parent GoogleCloudDialogflowCxV3ExportTestCasesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/testCases:export",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3ExportTestCasesRequest}))

(defn projects-locations-agents-testCases-run
  "Kicks off a test case run. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: RunTestCaseMetadata - `response`: RunTestCaseResponse
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/testCases/run

name <> 
GoogleCloudDialogflowCxV3RunTestCaseRequest:
GoogleCloudDialogflowCxV3RunTestCaseRequest"
  [name GoogleCloudDialogflowCxV3RunTestCaseRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}:run",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3RunTestCaseRequest}))

(defn projects-locations-agents-testCases-import
  "Imports the test cases from a Cloud Storage bucket or a local file. It always creates new test cases and won't overwrite any existing ones. The provided ID in the imported test case is neglected. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: ImportTestCasesMetadata - `response`: ImportTestCasesResponse
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/testCases/import

parent <> 
GoogleCloudDialogflowCxV3ImportTestCasesRequest:
GoogleCloudDialogflowCxV3ImportTestCasesRequest"
  [parent GoogleCloudDialogflowCxV3ImportTestCasesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/testCases:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3ImportTestCasesRequest}))

(defn projects-locations-agents-testCases-calculateCoverage
  "Calculates the test coverage for an agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/testCases/calculateCoverage

agent <> 

optional:
type <string> Required. The type of coverage requested."
  ([agent]
    (projects-locations-agents-testCases-calculateCoverage agent nil))
  ([agent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+agent}/testCases:calculateCoverage",
       :uri-template-args {"agent" agent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-testCases-patch
  "Updates the specified test case.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/testCases/patch

name <> 
GoogleCloudDialogflowCxV3TestCase:
GoogleCloudDialogflowCxV3TestCase

optional:
updateMask <string> Required. The mask to specify which fields should be updated. The `creationTime` and `lastTestResult` cannot be updated."
  ([name GoogleCloudDialogflowCxV3TestCase]
    (projects-locations-agents-testCases-patch
      name
      GoogleCloudDialogflowCxV3TestCase
      nil))
  ([name GoogleCloudDialogflowCxV3TestCase optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3TestCase})))

(defn projects-locations-agents-testCases-create
  "Creates a test case for the given agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/testCases/create

parent <> 
GoogleCloudDialogflowCxV3TestCase:
GoogleCloudDialogflowCxV3TestCase"
  [parent GoogleCloudDialogflowCxV3TestCase]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/testCases",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3TestCase}))

(defn projects-locations-agents-testCases-batchRun
  "Kicks off a batch run of test cases. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: BatchRunTestCasesMetadata - `response`: BatchRunTestCasesResponse
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/testCases/batchRun

parent <> 
GoogleCloudDialogflowCxV3BatchRunTestCasesRequest:
GoogleCloudDialogflowCxV3BatchRunTestCasesRequest"
  [parent GoogleCloudDialogflowCxV3BatchRunTestCasesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/testCases:batchRun",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3BatchRunTestCasesRequest}))

(defn projects-locations-agents-testCases-get
  "Gets a test case.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/testCases/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-testCases-batchDelete
  "Batch deletes test cases.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/testCases/batchDelete

parent <> 
GoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest:
GoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest"
  [parent GoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/testCases:batchDelete",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest}))

(defn projects-locations-agents-testCases-results-list
  "Fetches the list of run results for the given test case. A maximum of 100 results are kept for each test case.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/testCases/results/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000.
filter <string> The filter expression used to filter test case results. See [API Filtering](https://aip.dev/160). The expression is case insensitive. Only 'AND' is supported for logical operators. The supported syntax is listed below in detail: [AND ] ... [AND latest] The supported fields and operators are: field operator `environment` `=`, `IN` (Use value `draft` for draft environment) `test_time` `>`, `<` `latest` only returns the latest test result in all results for each test case. Examples: * \"environment=draft AND latest\" matches the latest test result for each test case in the draft environment. * \"environment IN (e1,e2)\" matches any test case results with an environment resource name of either \"e1\" or \"e2\". * \"test_time > 1602540713\" matches any test case results with test time later than a unix timestamp in seconds 1602540713."
  ([parent]
    (projects-locations-agents-testCases-results-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/results",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-testCases-results-get
  "Gets a test case result.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/testCases/results/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-flows-getValidationResult
  "Gets the latest flow validation result. Flow validation is performed when ValidateFlow is called.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/getValidationResult

name <> 

optional:
languageCode <string> If not specified, the agent's default language is used."
  ([name]
    (projects-locations-agents-flows-getValidationResult name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-flows-list
  "Returns the list of all flows in the specified agent.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000.
languageCode <string> The language to list flows for. The following fields are language dependent: * `Flow.event_handlers.trigger_fulfillment.messages` * `Flow.event_handlers.trigger_fulfillment.conditional_cases` * `Flow.transition_routes.trigger_fulfillment.messages` * `Flow.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([parent] (projects-locations-agents-flows-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/flows",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-flows-delete
  "Deletes a specified flow.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/delete

name <> 

optional:
force <boolean> This field has no effect for flows with no incoming transitions. For flows with incoming transitions: * If `force` is set to false, an error will be returned with message indicating the incoming transitions. * If `force` is set to true, Dialogflow will remove the flow, as well as any transitions to the flow (i.e. Target flow in event handlers or Target flow in transition routes that point to this flow will be cleared)."
  ([name] (projects-locations-agents-flows-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-flows-export
  "Exports the specified flow to a binary file. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: ExportFlowResponse Note that resources (e.g. intents, entities, webhooks) that the flow references will also be exported.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/export

name <> 
GoogleCloudDialogflowCxV3ExportFlowRequest:
GoogleCloudDialogflowCxV3ExportFlowRequest"
  [name GoogleCloudDialogflowCxV3ExportFlowRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+name}:export",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3ExportFlowRequest}))

(defn projects-locations-agents-flows-validate
  "Validates the specified flow and creates or updates validation results. Please call this API after the training is completed to get the complete validation results.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/validate

name <> 
GoogleCloudDialogflowCxV3ValidateFlowRequest:
GoogleCloudDialogflowCxV3ValidateFlowRequest"
  [name GoogleCloudDialogflowCxV3ValidateFlowRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+name}:validate",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3ValidateFlowRequest}))

(defn projects-locations-agents-flows-train
  "Trains the specified flow. Note that only the flow in 'draft' environment is trained. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: An [Empty message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty) Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/train

name <> 
GoogleCloudDialogflowCxV3TrainFlowRequest:
GoogleCloudDialogflowCxV3TrainFlowRequest"
  [name GoogleCloudDialogflowCxV3TrainFlowRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+name}:train",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3TrainFlowRequest}))

(defn projects-locations-agents-flows-import
  "Imports the specified flow to the specified agent from a binary file. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: ImportFlowResponse Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/import

parent <> 
GoogleCloudDialogflowCxV3ImportFlowRequest:
GoogleCloudDialogflowCxV3ImportFlowRequest"
  [parent GoogleCloudDialogflowCxV3ImportFlowRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/flows:import",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3ImportFlowRequest}))

(defn projects-locations-agents-flows-patch
  "Updates the specified flow. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/patch

name <> 
GoogleCloudDialogflowCxV3Flow:
GoogleCloudDialogflowCxV3Flow

optional:
updateMask <string> The mask to control which fields get updated. If the mask is not present, all fields will be updated.
languageCode <string> The language of the following fields in `flow`: * `Flow.event_handlers.trigger_fulfillment.messages` * `Flow.event_handlers.trigger_fulfillment.conditional_cases` * `Flow.transition_routes.trigger_fulfillment.messages` * `Flow.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([name GoogleCloudDialogflowCxV3Flow]
    (projects-locations-agents-flows-patch
      name
      GoogleCloudDialogflowCxV3Flow
      nil))
  ([name GoogleCloudDialogflowCxV3Flow optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3Flow})))

(defn projects-locations-agents-flows-create
  "Creates a flow in the specified agent. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/create

parent <> 
GoogleCloudDialogflowCxV3Flow:
GoogleCloudDialogflowCxV3Flow

optional:
languageCode <string> The language of the following fields in `flow`: * `Flow.event_handlers.trigger_fulfillment.messages` * `Flow.event_handlers.trigger_fulfillment.conditional_cases` * `Flow.transition_routes.trigger_fulfillment.messages` * `Flow.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([parent GoogleCloudDialogflowCxV3Flow]
    (projects-locations-agents-flows-create
      parent
      GoogleCloudDialogflowCxV3Flow
      nil))
  ([parent GoogleCloudDialogflowCxV3Flow optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/flows",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3Flow})))

(defn projects-locations-agents-flows-get
  "Retrieves the specified flow.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/get

name <> 

optional:
languageCode <string> The language to retrieve the flow for. The following fields are language dependent: * `Flow.event_handlers.trigger_fulfillment.messages` * `Flow.event_handlers.trigger_fulfillment.conditional_cases` * `Flow.transition_routes.trigger_fulfillment.messages` * `Flow.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([name] (projects-locations-agents-flows-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-flows-pages-list
  "Returns the list of all pages in the specified flow.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/pages/list

parent <> 

optional:
languageCode <string> The language to list pages for. The following fields are language dependent: * `Page.entry_fulfillment.messages` * `Page.entry_fulfillment.conditional_cases` * `Page.event_handlers.trigger_fulfillment.messages` * `Page.event_handlers.trigger_fulfillment.conditional_cases` * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages` * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases` * `Page.form.parameters.fill_behavior.reprompt_event_handlers.messages` * `Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases` * `Page.transition_routes.trigger_fulfillment.messages` * `Page.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000."
  ([parent] (projects-locations-agents-flows-pages-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/pages",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-flows-pages-get
  "Retrieves the specified page.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/pages/get

name <> 

optional:
languageCode <string> The language to retrieve the page for. The following fields are language dependent: * `Page.entry_fulfillment.messages` * `Page.entry_fulfillment.conditional_cases` * `Page.event_handlers.trigger_fulfillment.messages` * `Page.event_handlers.trigger_fulfillment.conditional_cases` * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages` * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases` * `Page.form.parameters.fill_behavior.reprompt_event_handlers.messages` * `Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases` * `Page.transition_routes.trigger_fulfillment.messages` * `Page.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([name] (projects-locations-agents-flows-pages-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-flows-pages-create
  "Creates a page in the specified flow. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/pages/create

parent <> 
GoogleCloudDialogflowCxV3Page:
GoogleCloudDialogflowCxV3Page

optional:
languageCode <string> The language of the following fields in `page`: * `Page.entry_fulfillment.messages` * `Page.entry_fulfillment.conditional_cases` * `Page.event_handlers.trigger_fulfillment.messages` * `Page.event_handlers.trigger_fulfillment.conditional_cases` * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages` * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases` * `Page.form.parameters.fill_behavior.reprompt_event_handlers.messages` * `Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases` * `Page.transition_routes.trigger_fulfillment.messages` * `Page.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([parent GoogleCloudDialogflowCxV3Page]
    (projects-locations-agents-flows-pages-create
      parent
      GoogleCloudDialogflowCxV3Page
      nil))
  ([parent GoogleCloudDialogflowCxV3Page optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/pages",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3Page})))

(defn projects-locations-agents-flows-pages-patch
  "Updates the specified page. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/pages/patch

name <> 
GoogleCloudDialogflowCxV3Page:
GoogleCloudDialogflowCxV3Page

optional:
languageCode <string> The language of the following fields in `page`: * `Page.entry_fulfillment.messages` * `Page.entry_fulfillment.conditional_cases` * `Page.event_handlers.trigger_fulfillment.messages` * `Page.event_handlers.trigger_fulfillment.conditional_cases` * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages` * `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases` * `Page.form.parameters.fill_behavior.reprompt_event_handlers.messages` * `Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases` * `Page.transition_routes.trigger_fulfillment.messages` * `Page.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
updateMask <string> The mask to control which fields get updated. If the mask is not present, all fields will be updated."
  ([name GoogleCloudDialogflowCxV3Page]
    (projects-locations-agents-flows-pages-patch
      name
      GoogleCloudDialogflowCxV3Page
      nil))
  ([name GoogleCloudDialogflowCxV3Page optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3Page})))

(defn projects-locations-agents-flows-pages-delete
  "Deletes the specified page. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/pages/delete

name <> 

optional:
force <boolean> This field has no effect for pages with no incoming transitions. For pages with incoming transitions: * If `force` is set to false, an error will be returned with message indicating the incoming transitions. * If `force` is set to true, Dialogflow will remove the page, as well as any transitions to the page (i.e. Target page in event handlers or Target page in transition routes that point to this page will be cleared)."
  ([name] (projects-locations-agents-flows-pages-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-flows-transitionRouteGroups-list
  "Returns the list of all transition route groups in the specified flow.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/transitionRouteGroups/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 100 and at most 1000.
languageCode <string> The language to list transition route groups for. The following fields are language dependent: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([parent]
    (projects-locations-agents-flows-transitionRouteGroups-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/transitionRouteGroups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-flows-transitionRouteGroups-get
  "Retrieves the specified TransitionRouteGroup.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/transitionRouteGroups/get

name <> 

optional:
languageCode <string> The language to retrieve the transition route group for. The following fields are language dependent: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([name]
    (projects-locations-agents-flows-transitionRouteGroups-get
      name
      nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-flows-transitionRouteGroups-create
  "Creates an TransitionRouteGroup in the specified flow. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/transitionRouteGroups/create

parent <> 
GoogleCloudDialogflowCxV3TransitionRouteGroup:
GoogleCloudDialogflowCxV3TransitionRouteGroup

optional:
languageCode <string> The language of the following fields in `TransitionRouteGroup`: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([parent GoogleCloudDialogflowCxV3TransitionRouteGroup]
    (projects-locations-agents-flows-transitionRouteGroups-create
      parent
      GoogleCloudDialogflowCxV3TransitionRouteGroup
      nil))
  ([parent GoogleCloudDialogflowCxV3TransitionRouteGroup optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/transitionRouteGroups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3TransitionRouteGroup})))

(defn projects-locations-agents-flows-transitionRouteGroups-patch
  "Updates the specified TransitionRouteGroup. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/transitionRouteGroups/patch

name <> 
GoogleCloudDialogflowCxV3TransitionRouteGroup:
GoogleCloudDialogflowCxV3TransitionRouteGroup

optional:
updateMask <string> The mask to control which fields get updated.
languageCode <string> The language of the following fields in `TransitionRouteGroup`: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used."
  ([name GoogleCloudDialogflowCxV3TransitionRouteGroup]
    (projects-locations-agents-flows-transitionRouteGroups-patch
      name
      GoogleCloudDialogflowCxV3TransitionRouteGroup
      nil))
  ([name GoogleCloudDialogflowCxV3TransitionRouteGroup optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3TransitionRouteGroup})))

(defn projects-locations-agents-flows-transitionRouteGroups-delete
  "Deletes the specified TransitionRouteGroup. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/transitionRouteGroups/delete

name <> 

optional:
force <boolean> This field has no effect for transition route group that no page is using. If the transition route group is referenced by any page: * If `force` is set to false, an error will be returned with message indicating pages that reference the transition route group. * If `force` is set to true, Dialogflow will remove the transition route group, as well as any reference to it."
  ([name]
    (projects-locations-agents-flows-transitionRouteGroups-delete
      name
      nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-flows-versions-list
  "Returns the list of all versions in the specified Flow.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/versions/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return in a single page. By default 20 and at most 100."
  ([parent] (projects-locations-agents-flows-versions-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://dialogflow.googleapis.com/v3/{+parent}/versions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"]})))

(defn projects-locations-agents-flows-versions-get
  "Retrieves the specified Version.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/versions/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-flows-versions-create
  "Creates a Version in the specified Flow. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: CreateVersionOperationMetadata - `response`: Version
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/versions/create

parent <> 
GoogleCloudDialogflowCxV3Version:
GoogleCloudDialogflowCxV3Version"
  [parent GoogleCloudDialogflowCxV3Version]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+parent}/versions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3Version}))

(defn projects-locations-agents-flows-versions-patch
  "Updates the specified Version.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/versions/patch

name <> 
GoogleCloudDialogflowCxV3Version:
GoogleCloudDialogflowCxV3Version

optional:
updateMask <string> Required. The mask to control which fields get updated. Currently only `description` and `display_name` can be updated."
  ([name GoogleCloudDialogflowCxV3Version]
    (projects-locations-agents-flows-versions-patch
      name
      GoogleCloudDialogflowCxV3Version
      nil))
  ([name GoogleCloudDialogflowCxV3Version optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/dialogflow"],
       :body GoogleCloudDialogflowCxV3Version})))

(defn projects-locations-agents-flows-versions-delete
  "Deletes the specified Version.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/versions/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"]}))

(defn projects-locations-agents-flows-versions-load
  "Loads resources in the specified version to the draft flow. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: An [Empty message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty)
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/versions/load

name <> 
GoogleCloudDialogflowCxV3LoadVersionRequest:
GoogleCloudDialogflowCxV3LoadVersionRequest"
  [name GoogleCloudDialogflowCxV3LoadVersionRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://dialogflow.googleapis.com/v3/{+name}:load",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3LoadVersionRequest}))

(defn projects-locations-agents-flows-versions-compareVersions
  "Compares the specified base version with target version.
https://cloud.google.com/dialogflow/v3/reference/rest/v3/projects/locations/agents/flows/versions/compareVersions

baseVersion <> 
GoogleCloudDialogflowCxV3CompareVersionsRequest:
GoogleCloudDialogflowCxV3CompareVersionsRequest"
  [baseVersion GoogleCloudDialogflowCxV3CompareVersionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://dialogflow.googleapis.com/v3/{+baseVersion}:compareVersions",
     :uri-template-args {"baseVersion" baseVersion},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/dialogflow"],
     :body GoogleCloudDialogflowCxV3CompareVersionsRequest}))
