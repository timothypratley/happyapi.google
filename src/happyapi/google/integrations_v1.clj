(ns happyapi.google.integrations-v1
  "Application Integration API

See: https://cloud.google.com/application-integration")

(defn callback-generateToken
  "Receives the auth code and auth config id to combine that with the client id and secret to retrieve access tokens from the token endpoint. Returns either a success or error message when it's done.
https://cloud.google.com/application-integration/v1/reference/rest/v1/callback/generateToken

optional:
redirectUri <string> Redirect uri of the auth code request
product <string> Which product sends the request
gcpProjectId <string> The gcp project id of the request
code <string> The auth code for the given request
state <string> The auth config id for the given request"
  ([] (callback-generateToken nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/callback:generateToken",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn connectorPlatformRegions-enumerate
  "Enumerates the regions for which Connector Platform is provisioned.
https://cloud.google.com/application-integration/v1/reference/rest/v1/connectorPlatformRegions/enumerate"
  []
  {:method :get,
   :uri-template
   "https://integrations.googleapis.com/v1/connectorPlatformRegions:enumerate",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-getClientmetadata
  "Gets the metadata info for the requested client
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/getClientmetadata

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/clientmetadata",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-getClients
  "Gets the client configuration for the given project and location resource name
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/getClients

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/clients",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-products-integrations-test
  "Execute the integration in draft state
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/test

name <> 
GoogleCloudIntegrationsV1alphaTestIntegrationsRequest:
GoogleCloudIntegrationsV1alphaTestIntegrationsRequest"
  [name GoogleCloudIntegrationsV1alphaTestIntegrationsRequest]
  {:method :post,
   :uri-template "https://integrations.googleapis.com/v1/{+name}:test",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaTestIntegrationsRequest})

(defn projects-locations-products-integrations-execute
  "Executes integrations synchronously by passing the trigger id in the request body. The request is not returned until the requested executions are either fulfilled or experienced an error. If the integration name is not specified (passing `-`), all of the associated integration under the given trigger_id will be executed. Otherwise only the specified integration for the given `trigger_id` is executed. This is helpful for execution the integration from UI.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/execute

name <> 
GoogleCloudIntegrationsV1alphaExecuteIntegrationsRequest:
GoogleCloudIntegrationsV1alphaExecuteIntegrationsRequest"
  [name GoogleCloudIntegrationsV1alphaExecuteIntegrationsRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:execute",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaExecuteIntegrationsRequest})

(defn projects-locations-products-integrations-schedule
  "Schedules an integration for execution by passing the trigger id and the scheduled time in the request body.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/schedule

name <> 
GoogleCloudIntegrationsV1alphaScheduleIntegrationsRequest:
GoogleCloudIntegrationsV1alphaScheduleIntegrationsRequest"
  [name GoogleCloudIntegrationsV1alphaScheduleIntegrationsRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:schedule",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaScheduleIntegrationsRequest})

(defn projects-locations-products-integrations-list
  "Returns the list of all integrations in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/list

parent <> 

optional:
filter <string> Filter on fields of IntegrationVersion. Fields can be compared with literal values by use of \":\" (containment), \"=\" (equality), \">\" (greater), \"<\" (less than), >=\" (greater than or equal to), \"<=\" (less than or equal to), and \"!=\" (inequality) operators. Negation, conjunction, and disjunction are written using NOT, AND, and OR keywords. For example, organization_id=\\\"1\\\" AND state=ACTIVE AND description:\"test\". Filtering cannot be performed on repeated fields like `task_config`.
pageSize <integer> The page size for the resquest.
orderBy <string> The results would be returned in order you specified here. Supported sort keys are: Descending sort order by \"last_modified_time\", \"created_time\", \"snapshot_number\". Ascending sort order by the integration name."
  ([parent] (projects-locations-products-integrations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/integrations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-products-integrations-executions-download
  "Download the execution.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/executions/download

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:download",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-products-integrations-executions-list
  "Lists the results of all the integration executions. The response includes the same information as the [execution log](https://cloud.google.com/application-integration/docs/viewing-logs) in the Integration UI.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/executions/list

parent <> 

optional:
filterParams.endTime <string> End timestamp.
filterParams.parameterPairKey <string> Param key in the key value pair filter.
filterParams.parameterValue <string> Param value. DEPRECATED. User parameter_pair_value instead.
readMask <string> Optional. View mask for the response data. If set, only the field specified will be returned as part of the result. If not set, all fields in Execution will be filled and returned. Supported fields: trigger_id execution_method create_time update_time execution_details execution_details.state execution_details.execution_snapshots execution_details.attempt_stats execution_details.event_execution_snapshots_size request_parameters cloud_logging_details snapshot_number replay_info
filterParams.workflowName <string> Workflow name.
filterParams.eventStatuses <string> List of possible event statuses.
filterParams.customFilter <string> Optional user-provided custom filter.
pageSize <integer> Optional. The size of entries in the response.
filterParams.parameterType <string> Param type.
filterParams.parameterKey <string> Param key. DEPRECATED. User parameter_pair_key instead.
orderBy <string> Optional. The results would be returned in order you specified here. Currently supporting \"create_time\".
refreshAcl <boolean> Optional. If true, the service will use the most recent acl information to list event execution infos and renew the acl cache. Note that fetching the most recent acl is synchronous, so it will increase RPC call latency.
filterParams.executionId <string> Execution id.
filter <string> Optional. Standard filter field, we support filtering on following fields: workflow_name: the name of the integration. CreateTimestamp: the execution created time. event_execution_state: the state of the executions. execution_id: the id of the execution. trigger_id: the id of the trigger. parameter_type: the type of the parameters involved in the execution. All fields support for EQUALS, in additional: CreateTimestamp support for LESS_THAN, GREATER_THAN ParameterType support for HAS For example: \"parameter_type\" HAS \\\"string\\\" Also supports operators like AND, OR, NOT For example, trigger_id=\\\"id1\\\" AND workflow_name=\\\"testWorkflow\\\"
filterParams.parameterPairValue <string> Param value in the key value pair filter.
truncateParams <boolean> Optional. If true, the service will truncate the params to only keep the first 1000 characters of string params and empty the executions in order to make response smaller. Only works for UI and when the params fields are not filtered out.
filterParams.startTime <string> Start timestamp.
filterParams.taskStatuses <string> List of possible task statuses.
snapshotMetadataWithoutParams <boolean> Optional. If true, the service will provide execution info with snapshot metadata only i.e. without event parameters."
  ([parent]
    (projects-locations-products-integrations-executions-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/executions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-products-integrations-executions-get
  "Get an execution in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/executions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-products-integrations-executions-suspensions-lift
  "* Lifts suspension for the Suspension task. Fetch corresponding suspension with provided suspension Id, resolve suspension, and set up suspension result for the Suspension Task.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/executions/suspensions/lift

name <> 
GoogleCloudIntegrationsV1alphaLiftSuspensionRequest:
GoogleCloudIntegrationsV1alphaLiftSuspensionRequest"
  [name GoogleCloudIntegrationsV1alphaLiftSuspensionRequest]
  {:method :post,
   :uri-template "https://integrations.googleapis.com/v1/{+name}:lift",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaLiftSuspensionRequest})

(defn projects-locations-products-integrations-executions-suspensions-list
  "* Lists suspensions associated with a specific execution. Only those with permissions to resolve the relevant suspensions will be able to view them.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/executions/suspensions/list

parent <> 

optional:
filter <string> Standard filter field.
orderBy <string> Field name to order by.
pageSize <integer> Maximum number of entries in the response."
  ([parent]
    (projects-locations-products-integrations-executions-suspensions-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/suspensions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-products-integrations-executions-suspensions-resolve
  "* Resolves (lifts/rejects) any number of suspensions. If the integration is already running, only the status of the suspension is updated. Otherwise, the suspended integration will begin execution again.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/executions/suspensions/resolve

name <> 
GoogleCloudIntegrationsV1alphaResolveSuspensionRequest:
GoogleCloudIntegrationsV1alphaResolveSuspensionRequest"
  [name GoogleCloudIntegrationsV1alphaResolveSuspensionRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:resolve",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaResolveSuspensionRequest})

(defn projects-locations-products-integrations-versions-unpublish
  "Sets the status of the ACTIVE integration to SNAPSHOT with a new tag \"PREVIOUSLY_PUBLISHED\" after validating it. The \"HEAD\" and \"PUBLISH_REQUESTED\" tags do not change. This RPC throws an exception if the version being snapshot is not ACTIVE. Audit fields added include action, action_by, action_timestamp.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/versions/unpublish

name <> 
GoogleCloudIntegrationsV1alphaUnpublishIntegrationVersionRequest:
GoogleCloudIntegrationsV1alphaUnpublishIntegrationVersionRequest"
  [name
   GoogleCloudIntegrationsV1alphaUnpublishIntegrationVersionRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:unpublish",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body
   GoogleCloudIntegrationsV1alphaUnpublishIntegrationVersionRequest})

(defn projects-locations-products-integrations-versions-list
  "Returns the list of all integration versions in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/versions/list

parent <> 

optional:
fieldMask <string> The field mask which specifies the particular data to be returned.
orderBy <string> The results would be returned in order you specified here. Currently supported sort keys are: Descending sort order for \"last_modified_time\", \"created_time\", \"snapshot_number\" Ascending sort order for \"name\".
pageSize <integer> The maximum number of versions to return. The service may return fewer than this value. If unspecified, at most 50 versions will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Filter on fields of IntegrationVersion. Fields can be compared with literal values by use of \":\" (containment), \"=\" (equality), \">\" (greater), \"<\" (less than), >=\" (greater than or equal to), \"<=\" (less than or equal to), and \"!=\" (inequality) operators. Negation, conjunction, and disjunction are written using NOT, AND, and OR keywords. For example, organization_id=\\\"1\\\" AND state=ACTIVE AND description:\"test\". Filtering cannot be performed on repeated fields like `task_config`."
  ([parent]
    (projects-locations-products-integrations-versions-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/versions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-products-integrations-versions-delete
  "Soft-deletes the integration. Changes the status of the integration to ARCHIVED. If the integration being ARCHIVED is tagged as \"HEAD\", the tag is removed from this snapshot and set to the previous non-ARCHIVED snapshot. The PUBLISH_REQUESTED, DUE_FOR_DELETION tags are removed too. This RPC throws an exception if the version being deleted is DRAFT, and if the `locked_by` user is not the same as the user performing the Delete. Audit fields updated include last_modified_timestamp, last_modified_by. Any existing lock is released when Deleting a integration. Currently, there is no undelete mechanism.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/versions/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-products-integrations-versions-download
  "Downloads an integration. Retrieves the `IntegrationVersion` for a given `integration_id` and returns the response as a string.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/versions/download

name <> 

optional:
files <string> Optional. Integration related file to download like Integration Json, Config variable, testcase etc.
fileFormat <string> File format for download request."
  ([name]
    (projects-locations-products-integrations-versions-download
      name
      nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+name}:download",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-products-integrations-versions-upload
  "Uploads an integration. The content can be a previously downloaded integration. Performs the same function as CreateDraftIntegrationVersion, but accepts input in a string format, which holds the complete representation of the IntegrationVersion content.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/versions/upload

parent <> 
GoogleCloudIntegrationsV1alphaUploadIntegrationVersionRequest:
GoogleCloudIntegrationsV1alphaUploadIntegrationVersionRequest"
  [parent
   GoogleCloudIntegrationsV1alphaUploadIntegrationVersionRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/versions:upload",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaUploadIntegrationVersionRequest})

(defn projects-locations-products-integrations-versions-patch
  "Update a integration with a draft version in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/versions/patch

name <> 
GoogleCloudIntegrationsV1alphaIntegrationVersion:
GoogleCloudIntegrationsV1alphaIntegrationVersion

optional:
updateMask <string> Field mask specifying the fields in the above integration that have been modified and need to be updated."
  ([name GoogleCloudIntegrationsV1alphaIntegrationVersion]
    (projects-locations-products-integrations-versions-patch
      name
      GoogleCloudIntegrationsV1alphaIntegrationVersion
      nil))
  ([name GoogleCloudIntegrationsV1alphaIntegrationVersion optional]
    {:method :patch,
     :uri-template "https://integrations.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaIntegrationVersion}))

(defn projects-locations-products-integrations-versions-takeoverEditLock
  "Clears the `locked_by` and `locked_at_timestamp`in the DRAFT version of this integration. It then performs the same action as the CreateDraftIntegrationVersion (i.e., copies the DRAFT version of the integration as a SNAPSHOT and then creates a new DRAFT version with the `locked_by` set to the `user_taking_over` and the `locked_at_timestamp` set to the current timestamp). Both the `locked_by` and `user_taking_over` are notified via email about the takeover. This RPC throws an exception if the integration is not in DRAFT status or if the `locked_by` and `locked_at_timestamp` fields are not set.The TakeoverEdit lock is treated the same as an edit of the integration, and hence shares ACLs with edit. Audit fields updated include last_modified_timestamp, last_modified_by.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/versions/takeoverEditLock

integrationVersion <> 
GoogleCloudIntegrationsV1alphaTakeoverEditLockRequest:
GoogleCloudIntegrationsV1alphaTakeoverEditLockRequest"
  [integrationVersion
   GoogleCloudIntegrationsV1alphaTakeoverEditLockRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+integrationVersion}:takeoverEditLock",
   :uri-template-args {"integrationVersion" integrationVersion},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaTakeoverEditLockRequest})

(defn projects-locations-products-integrations-versions-publish
  "This RPC throws an exception if the integration is in ARCHIVED or ACTIVE state. This RPC throws an exception if the version being published is DRAFT, and if the `locked_by` user is not the same as the user performing the Publish. Audit fields updated include last_published_timestamp, last_published_by, last_modified_timestamp, last_modified_by. Any existing lock is on this integration is released.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/versions/publish

name <> 
GoogleCloudIntegrationsV1alphaPublishIntegrationVersionRequest:
GoogleCloudIntegrationsV1alphaPublishIntegrationVersionRequest"
  [name GoogleCloudIntegrationsV1alphaPublishIntegrationVersionRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:publish",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body
   GoogleCloudIntegrationsV1alphaPublishIntegrationVersionRequest})

(defn projects-locations-products-integrations-versions-create
  "Create a integration with a draft version in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/versions/create

parent <> 
GoogleCloudIntegrationsV1alphaIntegrationVersion:
GoogleCloudIntegrationsV1alphaIntegrationVersion

optional:
createSampleIntegrations <boolean> Optional. Optional. Indicates if sample workflow should be created.
newIntegration <boolean> Set this flag to true, if draft version is to be created for a brand new integration. False, if the request is for an existing integration. For backward compatibility reasons, even if this flag is set to `false` and no existing integration is found, a new draft integration will still be created."
  ([parent GoogleCloudIntegrationsV1alphaIntegrationVersion]
    (projects-locations-products-integrations-versions-create
      parent
      GoogleCloudIntegrationsV1alphaIntegrationVersion
      nil))
  ([parent GoogleCloudIntegrationsV1alphaIntegrationVersion optional]
    {:method :post,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/versions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaIntegrationVersion}))

(defn projects-locations-products-integrations-versions-get
  "Get a integration in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/integrations/versions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-products-certificates-list
  "List all the certificates that match the filter. Restrict to certificate of current client only.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/certificates/list

parent <> 

optional:
pageSize <integer> The size of entries in the response. If unspecified, defaults to 100.
readMask <string> The mask which specifies fields that need to be returned in the Certificate's response.
filter <string> Filtering as supported in https://developers.google.com/authorized-buyers/apis/guides/list-filters."
  ([parent] (projects-locations-products-certificates-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/certificates",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-products-certificates-patch
  "Updates the certificate by id. If new certificate file is updated, it will register with the trawler service, re-encrypt with cloud KMS and update the Spanner record. Other fields will directly update the Spanner record. Returns the Certificate.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/certificates/patch

name <> 
GoogleCloudIntegrationsV1alphaCertificate:
GoogleCloudIntegrationsV1alphaCertificate

optional:
updateMask <string> Field mask specifying the fields in the above Certificate that have been modified and need to be updated."
  ([name GoogleCloudIntegrationsV1alphaCertificate]
    (projects-locations-products-certificates-patch
      name
      GoogleCloudIntegrationsV1alphaCertificate
      nil))
  ([name GoogleCloudIntegrationsV1alphaCertificate optional]
    {:method :patch,
     :uri-template "https://integrations.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaCertificate}))

(defn projects-locations-products-certificates-create
  "Creates a new certificate. The certificate will be registered to the trawler service and will be encrypted using cloud KMS and stored in Spanner Returns the certificate.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/certificates/create

parent <> 
GoogleCloudIntegrationsV1alphaCertificate:
GoogleCloudIntegrationsV1alphaCertificate"
  [parent GoogleCloudIntegrationsV1alphaCertificate]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/certificates",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaCertificate})

(defn projects-locations-products-certificates-get
  "Get a certificates in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/certificates/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-products-certificates-delete
  "Delete a certificate
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/certificates/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-products-cloudFunctions-create
  "Creates a cloud function project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/cloudFunctions/create

parent <> 
GoogleCloudIntegrationsV1alphaCreateCloudFunctionRequest:
GoogleCloudIntegrationsV1alphaCreateCloudFunctionRequest"
  [parent GoogleCloudIntegrationsV1alphaCreateCloudFunctionRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/cloudFunctions",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaCreateCloudFunctionRequest})

(defn projects-locations-products-authConfigs-list
  "Lists all auth configs that match the filter. Restrict to auth configs belong to the current client only.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/authConfigs/list

parent <> 

optional:
filter <string> Filtering as supported in https://developers.google.com/authorized-buyers/apis/guides/list-filters.
pageSize <integer> The size of entries in the response. If unspecified, defaults to 100.
readMask <string> The mask which specifies fields that need to be returned in the AuthConfig's response."
  ([parent] (projects-locations-products-authConfigs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/authConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-products-authConfigs-patch
  "Updates an auth config. If credential is updated, fetch the encrypted auth config from Spanner, decrypt with Cloud KMS key, update the credential fields, re-encrypt with Cloud KMS key and update the Spanner record. For other fields, directly update the Spanner record. Returns the encrypted auth config.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/authConfigs/patch

name <> 
GoogleCloudIntegrationsV1alphaAuthConfig:
GoogleCloudIntegrationsV1alphaAuthConfig

optional:
clientCertificate.sslCertificate <string> The ssl certificate encoded in PEM format. This string must include the begin header and end footer lines. For example, -----BEGIN CERTIFICATE----- MIICTTCCAbagAwIBAgIJAPT0tSKNxan/MA0GCSqGSIb3DQEBCwUAMCoxFzAVBgNV BAoTDkdvb2dsZSBURVNUSU5HMQ8wDQYDVQQDEwZ0ZXN0Q0EwHhcNMTUwMTAxMDAw MDAwWhcNMjUwMTAxMDAwMDAwWjAuMRcwFQYDVQQKEw5Hb29nbGUgVEVTVElORzET MBEGA1UEAwwKam9lQGJhbmFuYTCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA vDYFgMgxi5W488d9J7UpCInl0NXmZQpJDEHE4hvkaRlH7pnC71H0DLt0/3zATRP1 JzY2+eqBmbGl4/sgZKYv8UrLnNyQNUTsNx1iZAfPUflf5FwgVsai8BM0pUciq1NB xD429VFcrGZNucvFLh72RuRFIKH8WUpiK/iZNFkWhZ0CAwEAAaN3MHUwDgYDVR0P AQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMBBggrBgEFBQcDAjAMBgNVHRMB Af8EAjAAMBkGA1UdDgQSBBCVgnFBCWgL/iwCqnGrhTPQMBsGA1UdIwQUMBKAEKey Um2o4k2WiEVA0ldQvNYwDQYJKoZIhvcNAQELBQADgYEAYK986R4E3L1v+Q6esBtW JrUwA9UmJRSQr0N5w3o9XzarU37/bkjOP0Fw0k/A6Vv1n3vlciYfBFaBIam1qRHr 5dMsYf4CZS6w50r7hyzqyrwDoyNxkLnd2PdcHT/sym1QmflsjEs7pejtnohO6N2H wQW6M0H7Zt8claGRla4fKkg= -----END CERTIFICATE-----
clientCertificate.passphrase <string> 'passphrase' should be left unset if private key is not encrypted. Note that 'passphrase' is not the password for web server, but an extra layer of security to protected private key.
updateMask <string> Field mask specifying the fields in the above AuthConfig that have been modified and need to be updated.
clientCertificate.encryptedPrivateKey <string> The ssl certificate encoded in PEM format. This string must include the begin header and end footer lines. For example, -----BEGIN CERTIFICATE----- MIICTTCCAbagAwIBAgIJAPT0tSKNxan/MA0GCSqGSIb3DQEBCwUAMCoxFzAVBgNV BAoTDkdvb2dsZSBURVNUSU5HMQ8wDQYDVQQDEwZ0ZXN0Q0EwHhcNMTUwMTAxMDAw MDAwWhcNMjUwMTAxMDAwMDAwWjAuMRcwFQYDVQQKEw5Hb29nbGUgVEVTVElORzET MBEGA1UEAwwKam9lQGJhbmFuYTCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA vDYFgMgxi5W488d9J7UpCInl0NXmZQpJDEHE4hvkaRlH7pnC71H0DLt0/3zATRP1 JzY2+eqBmbGl4/sgZKYv8UrLnNyQNUTsNx1iZAfPUflf5FwgVsai8BM0pUciq1NB xD429VFcrGZNucvFLh72RuRFIKH8WUpiK/iZNFkWhZ0CAwEAAaN3MHUwDgYDVR0P AQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMBBggrBgEFBQcDAjAMBgNVHRMB Af8EAjAAMBkGA1UdDgQSBBCVgnFBCWgL/iwCqnGrhTPQMBsGA1UdIwQUMBKAEKey Um2o4k2WiEVA0ldQvNYwDQYJKoZIhvcNAQELBQADgYEAYK986R4E3L1v+Q6esBtW JrUwA9UmJRSQr0N5w3o9XzarU37/bkjOP0Fw0k/A6Vv1n3vlciYfBFaBIam1qRHr 5dMsYf4CZS6w50r7hyzqyrwDoyNxkLnd2PdcHT/sym1QmflsjEs7pejtnohO6N2H wQW6M0H7Zt8claGRla4fKkg= -----END CERTIFICATE-----"
  ([name GoogleCloudIntegrationsV1alphaAuthConfig]
    (projects-locations-products-authConfigs-patch
      name
      GoogleCloudIntegrationsV1alphaAuthConfig
      nil))
  ([name GoogleCloudIntegrationsV1alphaAuthConfig optional]
    {:method :patch,
     :uri-template "https://integrations.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaAuthConfig}))

(defn projects-locations-products-authConfigs-delete
  "Deletes an auth config.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/authConfigs/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-products-authConfigs-create
  "Creates an auth config record. Fetch corresponding credentials for specific auth types, e.g. access token for OAuth 2.0, JWT token for JWT. Encrypt the auth config with Cloud KMS and store the encrypted credentials in Spanner. Returns the encrypted auth config.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/authConfigs/create

parent <> 
GoogleCloudIntegrationsV1alphaAuthConfig:
GoogleCloudIntegrationsV1alphaAuthConfig

optional:
clientCertificate.passphrase <string> 'passphrase' should be left unset if private key is not encrypted. Note that 'passphrase' is not the password for web server, but an extra layer of security to protected private key.
clientCertificate.sslCertificate <string> The ssl certificate encoded in PEM format. This string must include the begin header and end footer lines. For example, -----BEGIN CERTIFICATE----- MIICTTCCAbagAwIBAgIJAPT0tSKNxan/MA0GCSqGSIb3DQEBCwUAMCoxFzAVBgNV BAoTDkdvb2dsZSBURVNUSU5HMQ8wDQYDVQQDEwZ0ZXN0Q0EwHhcNMTUwMTAxMDAw MDAwWhcNMjUwMTAxMDAwMDAwWjAuMRcwFQYDVQQKEw5Hb29nbGUgVEVTVElORzET MBEGA1UEAwwKam9lQGJhbmFuYTCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA vDYFgMgxi5W488d9J7UpCInl0NXmZQpJDEHE4hvkaRlH7pnC71H0DLt0/3zATRP1 JzY2+eqBmbGl4/sgZKYv8UrLnNyQNUTsNx1iZAfPUflf5FwgVsai8BM0pUciq1NB xD429VFcrGZNucvFLh72RuRFIKH8WUpiK/iZNFkWhZ0CAwEAAaN3MHUwDgYDVR0P AQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMBBggrBgEFBQcDAjAMBgNVHRMB Af8EAjAAMBkGA1UdDgQSBBCVgnFBCWgL/iwCqnGrhTPQMBsGA1UdIwQUMBKAEKey Um2o4k2WiEVA0ldQvNYwDQYJKoZIhvcNAQELBQADgYEAYK986R4E3L1v+Q6esBtW JrUwA9UmJRSQr0N5w3o9XzarU37/bkjOP0Fw0k/A6Vv1n3vlciYfBFaBIam1qRHr 5dMsYf4CZS6w50r7hyzqyrwDoyNxkLnd2PdcHT/sym1QmflsjEs7pejtnohO6N2H wQW6M0H7Zt8claGRla4fKkg= -----END CERTIFICATE-----
clientCertificate.encryptedPrivateKey <string> The ssl certificate encoded in PEM format. This string must include the begin header and end footer lines. For example, -----BEGIN CERTIFICATE----- MIICTTCCAbagAwIBAgIJAPT0tSKNxan/MA0GCSqGSIb3DQEBCwUAMCoxFzAVBgNV BAoTDkdvb2dsZSBURVNUSU5HMQ8wDQYDVQQDEwZ0ZXN0Q0EwHhcNMTUwMTAxMDAw MDAwWhcNMjUwMTAxMDAwMDAwWjAuMRcwFQYDVQQKEw5Hb29nbGUgVEVTVElORzET MBEGA1UEAwwKam9lQGJhbmFuYTCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA vDYFgMgxi5W488d9J7UpCInl0NXmZQpJDEHE4hvkaRlH7pnC71H0DLt0/3zATRP1 JzY2+eqBmbGl4/sgZKYv8UrLnNyQNUTsNx1iZAfPUflf5FwgVsai8BM0pUciq1NB xD429VFcrGZNucvFLh72RuRFIKH8WUpiK/iZNFkWhZ0CAwEAAaN3MHUwDgYDVR0P AQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMBBggrBgEFBQcDAjAMBgNVHRMB Af8EAjAAMBkGA1UdDgQSBBCVgnFBCWgL/iwCqnGrhTPQMBsGA1UdIwQUMBKAEKey Um2o4k2WiEVA0ldQvNYwDQYJKoZIhvcNAQELBQADgYEAYK986R4E3L1v+Q6esBtW JrUwA9UmJRSQr0N5w3o9XzarU37/bkjOP0Fw0k/A6Vv1n3vlciYfBFaBIam1qRHr 5dMsYf4CZS6w50r7hyzqyrwDoyNxkLnd2PdcHT/sym1QmflsjEs7pejtnohO6N2H wQW6M0H7Zt8claGRla4fKkg= -----END CERTIFICATE-----"
  ([parent GoogleCloudIntegrationsV1alphaAuthConfig]
    (projects-locations-products-authConfigs-create
      parent
      GoogleCloudIntegrationsV1alphaAuthConfig
      nil))
  ([parent GoogleCloudIntegrationsV1alphaAuthConfig optional]
    {:method :post,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/authConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaAuthConfig}))

(defn projects-locations-products-authConfigs-get
  "Gets a complete auth config. If the auth config doesn't exist, Code.NOT_FOUND exception will be thrown. Returns the decrypted auth config.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/authConfigs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-products-sfdcInstances-delete
  "Deletes an sfdc instance.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/sfdcInstances/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-products-sfdcInstances-list
  "Lists all sfdc instances that match the filter. Restrict to sfdc instances belonging to the current client only.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/sfdcInstances/list

parent <> 

optional:
pageSize <integer> The size of entries in the response. If unspecified, defaults to 100.
readMask <string> The mask which specifies fields that need to be returned in the SfdcInstance's response.
filter <string> Filtering as supported in https://developers.google.com/authorized-buyers/apis/guides/list-filters."
  ([parent]
    (projects-locations-products-sfdcInstances-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/sfdcInstances",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-products-sfdcInstances-patch
  "Updates an sfdc instance. Updates the sfdc instance in spanner. Returns the sfdc instance.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/sfdcInstances/patch

name <> 
GoogleCloudIntegrationsV1alphaSfdcInstance:
GoogleCloudIntegrationsV1alphaSfdcInstance

optional:
updateMask <string> Field mask specifying the fields in the above SfdcInstance that have been modified and need to be updated."
  ([name GoogleCloudIntegrationsV1alphaSfdcInstance]
    (projects-locations-products-sfdcInstances-patch
      name
      GoogleCloudIntegrationsV1alphaSfdcInstance
      nil))
  ([name GoogleCloudIntegrationsV1alphaSfdcInstance optional]
    {:method :patch,
     :uri-template "https://integrations.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaSfdcInstance}))

(defn projects-locations-products-sfdcInstances-get
  "Gets an sfdc instance. If the instance doesn't exist, Code.NOT_FOUND exception will be thrown.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/sfdcInstances/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-products-sfdcInstances-create
  "Creates an sfdc instance record. Store the sfdc instance in Spanner. Returns the sfdc instance.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/sfdcInstances/create

parent <> 
GoogleCloudIntegrationsV1alphaSfdcInstance:
GoogleCloudIntegrationsV1alphaSfdcInstance"
  [parent GoogleCloudIntegrationsV1alphaSfdcInstance]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/sfdcInstances",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaSfdcInstance})

(defn projects-locations-products-sfdcInstances-sfdcChannels-list
  "Lists all sfdc channels that match the filter. Restrict to sfdc channels belonging to the current client only.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/sfdcInstances/sfdcChannels/list

parent <> 

optional:
readMask <string> The mask which specifies fields that need to be returned in the SfdcChannel's response.
pageSize <integer> The size of entries in the response. If unspecified, defaults to 100.
filter <string> Filtering as supported in https://developers.google.com/authorized-buyers/apis/guides/list-filters."
  ([parent]
    (projects-locations-products-sfdcInstances-sfdcChannels-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/sfdcChannels",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-products-sfdcInstances-sfdcChannels-delete
  "Deletes an sfdc channel.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/sfdcInstances/sfdcChannels/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-products-sfdcInstances-sfdcChannels-get
  "Gets an sfdc channel. If the channel doesn't exist, Code.NOT_FOUND exception will be thrown.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/sfdcInstances/sfdcChannels/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-products-sfdcInstances-sfdcChannels-patch
  "Updates an sfdc channel. Updates the sfdc channel in spanner. Returns the sfdc channel.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/sfdcInstances/sfdcChannels/patch

name <> 
GoogleCloudIntegrationsV1alphaSfdcChannel:
GoogleCloudIntegrationsV1alphaSfdcChannel

optional:
updateMask <string> Field mask specifying the fields in the above SfdcChannel that have been modified and need to be updated."
  ([name GoogleCloudIntegrationsV1alphaSfdcChannel]
    (projects-locations-products-sfdcInstances-sfdcChannels-patch
      name
      GoogleCloudIntegrationsV1alphaSfdcChannel
      nil))
  ([name GoogleCloudIntegrationsV1alphaSfdcChannel optional]
    {:method :patch,
     :uri-template "https://integrations.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaSfdcChannel}))

(defn projects-locations-products-sfdcInstances-sfdcChannels-create
  "Creates an sfdc channel record. Store the sfdc channel in Spanner. Returns the sfdc channel.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/products/sfdcInstances/sfdcChannels/create

parent <> 
GoogleCloudIntegrationsV1alphaSfdcChannel:
GoogleCloudIntegrationsV1alphaSfdcChannel"
  [parent GoogleCloudIntegrationsV1alphaSfdcChannel]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/sfdcChannels",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaSfdcChannel})

(defn projects-locations-sfdcInstances-get
  "Gets an sfdc instance. If the instance doesn't exist, Code.NOT_FOUND exception will be thrown.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/sfdcInstances/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-sfdcInstances-list
  "Lists all sfdc instances that match the filter. Restrict to sfdc instances belonging to the current client only.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/sfdcInstances/list

parent <> 

optional:
readMask <string> The mask which specifies fields that need to be returned in the SfdcInstance's response.
pageSize <integer> The size of entries in the response. If unspecified, defaults to 100.
filter <string> Filtering as supported in https://developers.google.com/authorized-buyers/apis/guides/list-filters."
  ([parent] (projects-locations-sfdcInstances-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/sfdcInstances",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-sfdcInstances-patch
  "Updates an sfdc instance. Updates the sfdc instance in spanner. Returns the sfdc instance.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/sfdcInstances/patch

name <> 
GoogleCloudIntegrationsV1alphaSfdcInstance:
GoogleCloudIntegrationsV1alphaSfdcInstance

optional:
updateMask <string> Field mask specifying the fields in the above SfdcInstance that have been modified and need to be updated."
  ([name GoogleCloudIntegrationsV1alphaSfdcInstance]
    (projects-locations-sfdcInstances-patch
      name
      GoogleCloudIntegrationsV1alphaSfdcInstance
      nil))
  ([name GoogleCloudIntegrationsV1alphaSfdcInstance optional]
    {:method :patch,
     :uri-template "https://integrations.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaSfdcInstance}))

(defn projects-locations-sfdcInstances-create
  "Creates an sfdc instance record. Store the sfdc instance in Spanner. Returns the sfdc instance.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/sfdcInstances/create

parent <> 
GoogleCloudIntegrationsV1alphaSfdcInstance:
GoogleCloudIntegrationsV1alphaSfdcInstance"
  [parent GoogleCloudIntegrationsV1alphaSfdcInstance]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/sfdcInstances",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaSfdcInstance})

(defn projects-locations-sfdcInstances-delete
  "Deletes an sfdc instance.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/sfdcInstances/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-sfdcInstances-sfdcChannels-create
  "Creates an sfdc channel record. Store the sfdc channel in Spanner. Returns the sfdc channel.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/sfdcInstances/sfdcChannels/create

parent <> 
GoogleCloudIntegrationsV1alphaSfdcChannel:
GoogleCloudIntegrationsV1alphaSfdcChannel"
  [parent GoogleCloudIntegrationsV1alphaSfdcChannel]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/sfdcChannels",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaSfdcChannel})

(defn projects-locations-sfdcInstances-sfdcChannels-patch
  "Updates an sfdc channel. Updates the sfdc channel in spanner. Returns the sfdc channel.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/sfdcInstances/sfdcChannels/patch

name <> 
GoogleCloudIntegrationsV1alphaSfdcChannel:
GoogleCloudIntegrationsV1alphaSfdcChannel

optional:
updateMask <string> Field mask specifying the fields in the above SfdcChannel that have been modified and need to be updated."
  ([name GoogleCloudIntegrationsV1alphaSfdcChannel]
    (projects-locations-sfdcInstances-sfdcChannels-patch
      name
      GoogleCloudIntegrationsV1alphaSfdcChannel
      nil))
  ([name GoogleCloudIntegrationsV1alphaSfdcChannel optional]
    {:method :patch,
     :uri-template "https://integrations.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaSfdcChannel}))

(defn projects-locations-sfdcInstances-sfdcChannels-get
  "Gets an sfdc channel. If the channel doesn't exist, Code.NOT_FOUND exception will be thrown.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/sfdcInstances/sfdcChannels/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-sfdcInstances-sfdcChannels-delete
  "Deletes an sfdc channel.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/sfdcInstances/sfdcChannels/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-sfdcInstances-sfdcChannels-list
  "Lists all sfdc channels that match the filter. Restrict to sfdc channels belonging to the current client only.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/sfdcInstances/sfdcChannels/list

parent <> 

optional:
readMask <string> The mask which specifies fields that need to be returned in the SfdcChannel's response.
filter <string> Filtering as supported in https://developers.google.com/authorized-buyers/apis/guides/list-filters.
pageSize <integer> The size of entries in the response. If unspecified, defaults to 100."
  ([parent]
    (projects-locations-sfdcInstances-sfdcChannels-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/sfdcChannels",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-appsScriptProjects-create
  "Creates an Apps Script project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/appsScriptProjects/create

parent <> 
GoogleCloudIntegrationsV1alphaCreateAppsScriptProjectRequest:
GoogleCloudIntegrationsV1alphaCreateAppsScriptProjectRequest"
  [parent GoogleCloudIntegrationsV1alphaCreateAppsScriptProjectRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/appsScriptProjects",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaCreateAppsScriptProjectRequest})

(defn projects-locations-appsScriptProjects-link
  "Links a existing Apps Script project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/appsScriptProjects/link

parent <> 
GoogleCloudIntegrationsV1alphaLinkAppsScriptProjectRequest:
GoogleCloudIntegrationsV1alphaLinkAppsScriptProjectRequest"
  [parent GoogleCloudIntegrationsV1alphaLinkAppsScriptProjectRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/appsScriptProjects:link",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaLinkAppsScriptProjectRequest})

(defn projects-locations-certificates-create
  "Creates a new certificate. The certificate will be registered to the trawler service and will be encrypted using cloud KMS and stored in Spanner Returns the certificate.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/certificates/create

parent <> 
GoogleCloudIntegrationsV1alphaCertificate:
GoogleCloudIntegrationsV1alphaCertificate"
  [parent GoogleCloudIntegrationsV1alphaCertificate]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/certificates",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaCertificate})

(defn projects-locations-certificates-patch
  "Updates the certificate by id. If new certificate file is updated, it will register with the trawler service, re-encrypt with cloud KMS and update the Spanner record. Other fields will directly update the Spanner record. Returns the Certificate.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/certificates/patch

name <> 
GoogleCloudIntegrationsV1alphaCertificate:
GoogleCloudIntegrationsV1alphaCertificate

optional:
updateMask <string> Field mask specifying the fields in the above Certificate that have been modified and need to be updated."
  ([name GoogleCloudIntegrationsV1alphaCertificate]
    (projects-locations-certificates-patch
      name
      GoogleCloudIntegrationsV1alphaCertificate
      nil))
  ([name GoogleCloudIntegrationsV1alphaCertificate optional]
    {:method :patch,
     :uri-template "https://integrations.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaCertificate}))

(defn projects-locations-certificates-list
  "List all the certificates that match the filter. Restrict to certificate of current client only.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/certificates/list

parent <> 

optional:
filter <string> Filtering as supported in https://developers.google.com/authorized-buyers/apis/guides/list-filters.
readMask <string> The mask which specifies fields that need to be returned in the Certificate's response.
pageSize <integer> The size of entries in the response. If unspecified, defaults to 100."
  ([parent] (projects-locations-certificates-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/certificates",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-certificates-delete
  "Delete a certificate
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/certificates/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-certificates-get
  "Get a certificates in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/certificates/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-authConfigs-get
  "Gets a complete auth config. If the auth config doesn't exist, Code.NOT_FOUND exception will be thrown. Returns the decrypted auth config.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/authConfigs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-authConfigs-create
  "Creates an auth config record. Fetch corresponding credentials for specific auth types, e.g. access token for OAuth 2.0, JWT token for JWT. Encrypt the auth config with Cloud KMS and store the encrypted credentials in Spanner. Returns the encrypted auth config.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/authConfigs/create

parent <> 
GoogleCloudIntegrationsV1alphaAuthConfig:
GoogleCloudIntegrationsV1alphaAuthConfig

optional:
clientCertificate.passphrase <string> 'passphrase' should be left unset if private key is not encrypted. Note that 'passphrase' is not the password for web server, but an extra layer of security to protected private key.
clientCertificate.encryptedPrivateKey <string> The ssl certificate encoded in PEM format. This string must include the begin header and end footer lines. For example, -----BEGIN CERTIFICATE----- MIICTTCCAbagAwIBAgIJAPT0tSKNxan/MA0GCSqGSIb3DQEBCwUAMCoxFzAVBgNV BAoTDkdvb2dsZSBURVNUSU5HMQ8wDQYDVQQDEwZ0ZXN0Q0EwHhcNMTUwMTAxMDAw MDAwWhcNMjUwMTAxMDAwMDAwWjAuMRcwFQYDVQQKEw5Hb29nbGUgVEVTVElORzET MBEGA1UEAwwKam9lQGJhbmFuYTCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA vDYFgMgxi5W488d9J7UpCInl0NXmZQpJDEHE4hvkaRlH7pnC71H0DLt0/3zATRP1 JzY2+eqBmbGl4/sgZKYv8UrLnNyQNUTsNx1iZAfPUflf5FwgVsai8BM0pUciq1NB xD429VFcrGZNucvFLh72RuRFIKH8WUpiK/iZNFkWhZ0CAwEAAaN3MHUwDgYDVR0P AQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMBBggrBgEFBQcDAjAMBgNVHRMB Af8EAjAAMBkGA1UdDgQSBBCVgnFBCWgL/iwCqnGrhTPQMBsGA1UdIwQUMBKAEKey Um2o4k2WiEVA0ldQvNYwDQYJKoZIhvcNAQELBQADgYEAYK986R4E3L1v+Q6esBtW JrUwA9UmJRSQr0N5w3o9XzarU37/bkjOP0Fw0k/A6Vv1n3vlciYfBFaBIam1qRHr 5dMsYf4CZS6w50r7hyzqyrwDoyNxkLnd2PdcHT/sym1QmflsjEs7pejtnohO6N2H wQW6M0H7Zt8claGRla4fKkg= -----END CERTIFICATE-----
clientCertificate.sslCertificate <string> The ssl certificate encoded in PEM format. This string must include the begin header and end footer lines. For example, -----BEGIN CERTIFICATE----- MIICTTCCAbagAwIBAgIJAPT0tSKNxan/MA0GCSqGSIb3DQEBCwUAMCoxFzAVBgNV BAoTDkdvb2dsZSBURVNUSU5HMQ8wDQYDVQQDEwZ0ZXN0Q0EwHhcNMTUwMTAxMDAw MDAwWhcNMjUwMTAxMDAwMDAwWjAuMRcwFQYDVQQKEw5Hb29nbGUgVEVTVElORzET MBEGA1UEAwwKam9lQGJhbmFuYTCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA vDYFgMgxi5W488d9J7UpCInl0NXmZQpJDEHE4hvkaRlH7pnC71H0DLt0/3zATRP1 JzY2+eqBmbGl4/sgZKYv8UrLnNyQNUTsNx1iZAfPUflf5FwgVsai8BM0pUciq1NB xD429VFcrGZNucvFLh72RuRFIKH8WUpiK/iZNFkWhZ0CAwEAAaN3MHUwDgYDVR0P AQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMBBggrBgEFBQcDAjAMBgNVHRMB Af8EAjAAMBkGA1UdDgQSBBCVgnFBCWgL/iwCqnGrhTPQMBsGA1UdIwQUMBKAEKey Um2o4k2WiEVA0ldQvNYwDQYJKoZIhvcNAQELBQADgYEAYK986R4E3L1v+Q6esBtW JrUwA9UmJRSQr0N5w3o9XzarU37/bkjOP0Fw0k/A6Vv1n3vlciYfBFaBIam1qRHr 5dMsYf4CZS6w50r7hyzqyrwDoyNxkLnd2PdcHT/sym1QmflsjEs7pejtnohO6N2H wQW6M0H7Zt8claGRla4fKkg= -----END CERTIFICATE-----"
  ([parent GoogleCloudIntegrationsV1alphaAuthConfig]
    (projects-locations-authConfigs-create
      parent
      GoogleCloudIntegrationsV1alphaAuthConfig
      nil))
  ([parent GoogleCloudIntegrationsV1alphaAuthConfig optional]
    {:method :post,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/authConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaAuthConfig}))

(defn projects-locations-authConfigs-patch
  "Updates an auth config. If credential is updated, fetch the encrypted auth config from Spanner, decrypt with Cloud KMS key, update the credential fields, re-encrypt with Cloud KMS key and update the Spanner record. For other fields, directly update the Spanner record. Returns the encrypted auth config.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/authConfigs/patch

name <> 
GoogleCloudIntegrationsV1alphaAuthConfig:
GoogleCloudIntegrationsV1alphaAuthConfig

optional:
clientCertificate.encryptedPrivateKey <string> The ssl certificate encoded in PEM format. This string must include the begin header and end footer lines. For example, -----BEGIN CERTIFICATE----- MIICTTCCAbagAwIBAgIJAPT0tSKNxan/MA0GCSqGSIb3DQEBCwUAMCoxFzAVBgNV BAoTDkdvb2dsZSBURVNUSU5HMQ8wDQYDVQQDEwZ0ZXN0Q0EwHhcNMTUwMTAxMDAw MDAwWhcNMjUwMTAxMDAwMDAwWjAuMRcwFQYDVQQKEw5Hb29nbGUgVEVTVElORzET MBEGA1UEAwwKam9lQGJhbmFuYTCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA vDYFgMgxi5W488d9J7UpCInl0NXmZQpJDEHE4hvkaRlH7pnC71H0DLt0/3zATRP1 JzY2+eqBmbGl4/sgZKYv8UrLnNyQNUTsNx1iZAfPUflf5FwgVsai8BM0pUciq1NB xD429VFcrGZNucvFLh72RuRFIKH8WUpiK/iZNFkWhZ0CAwEAAaN3MHUwDgYDVR0P AQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMBBggrBgEFBQcDAjAMBgNVHRMB Af8EAjAAMBkGA1UdDgQSBBCVgnFBCWgL/iwCqnGrhTPQMBsGA1UdIwQUMBKAEKey Um2o4k2WiEVA0ldQvNYwDQYJKoZIhvcNAQELBQADgYEAYK986R4E3L1v+Q6esBtW JrUwA9UmJRSQr0N5w3o9XzarU37/bkjOP0Fw0k/A6Vv1n3vlciYfBFaBIam1qRHr 5dMsYf4CZS6w50r7hyzqyrwDoyNxkLnd2PdcHT/sym1QmflsjEs7pejtnohO6N2H wQW6M0H7Zt8claGRla4fKkg= -----END CERTIFICATE-----
clientCertificate.passphrase <string> 'passphrase' should be left unset if private key is not encrypted. Note that 'passphrase' is not the password for web server, but an extra layer of security to protected private key.
clientCertificate.sslCertificate <string> The ssl certificate encoded in PEM format. This string must include the begin header and end footer lines. For example, -----BEGIN CERTIFICATE----- MIICTTCCAbagAwIBAgIJAPT0tSKNxan/MA0GCSqGSIb3DQEBCwUAMCoxFzAVBgNV BAoTDkdvb2dsZSBURVNUSU5HMQ8wDQYDVQQDEwZ0ZXN0Q0EwHhcNMTUwMTAxMDAw MDAwWhcNMjUwMTAxMDAwMDAwWjAuMRcwFQYDVQQKEw5Hb29nbGUgVEVTVElORzET MBEGA1UEAwwKam9lQGJhbmFuYTCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA vDYFgMgxi5W488d9J7UpCInl0NXmZQpJDEHE4hvkaRlH7pnC71H0DLt0/3zATRP1 JzY2+eqBmbGl4/sgZKYv8UrLnNyQNUTsNx1iZAfPUflf5FwgVsai8BM0pUciq1NB xD429VFcrGZNucvFLh72RuRFIKH8WUpiK/iZNFkWhZ0CAwEAAaN3MHUwDgYDVR0P AQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMBBggrBgEFBQcDAjAMBgNVHRMB Af8EAjAAMBkGA1UdDgQSBBCVgnFBCWgL/iwCqnGrhTPQMBsGA1UdIwQUMBKAEKey Um2o4k2WiEVA0ldQvNYwDQYJKoZIhvcNAQELBQADgYEAYK986R4E3L1v+Q6esBtW JrUwA9UmJRSQr0N5w3o9XzarU37/bkjOP0Fw0k/A6Vv1n3vlciYfBFaBIam1qRHr 5dMsYf4CZS6w50r7hyzqyrwDoyNxkLnd2PdcHT/sym1QmflsjEs7pejtnohO6N2H wQW6M0H7Zt8claGRla4fKkg= -----END CERTIFICATE-----
updateMask <string> Field mask specifying the fields in the above AuthConfig that have been modified and need to be updated."
  ([name GoogleCloudIntegrationsV1alphaAuthConfig]
    (projects-locations-authConfigs-patch
      name
      GoogleCloudIntegrationsV1alphaAuthConfig
      nil))
  ([name GoogleCloudIntegrationsV1alphaAuthConfig optional]
    {:method :patch,
     :uri-template "https://integrations.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaAuthConfig}))

(defn projects-locations-authConfigs-delete
  "Deletes an auth config.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/authConfigs/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-authConfigs-list
  "Lists all auth configs that match the filter. Restrict to auth configs belong to the current client only.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/authConfigs/list

parent <> 

optional:
readMask <string> The mask which specifies fields that need to be returned in the AuthConfig's response.
pageSize <integer> The size of entries in the response. If unspecified, defaults to 100.
filter <string> Filtering as supported in https://developers.google.com/authorized-buyers/apis/guides/list-filters."
  ([parent] (projects-locations-authConfigs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/authConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clients-switch
  "Update client from GMEK to CMEK
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/clients/switch

parent <> 
GoogleCloudIntegrationsV1alphaSwitchEncryptionRequest:
GoogleCloudIntegrationsV1alphaSwitchEncryptionRequest"
  [parent GoogleCloudIntegrationsV1alphaSwitchEncryptionRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/clients:switch",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaSwitchEncryptionRequest})

(defn projects-locations-clients-deprovision
  "Perform the deprovisioning steps to disable a user GCP project to use IP and purge all related data in a wipeout-compliant way.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/clients/deprovision

parent <> 
GoogleCloudIntegrationsV1alphaDeprovisionClientRequest:
GoogleCloudIntegrationsV1alphaDeprovisionClientRequest"
  [parent GoogleCloudIntegrationsV1alphaDeprovisionClientRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/clients:deprovision",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaDeprovisionClientRequest})

(defn projects-locations-clients-replace
  "Update run-as service account for provisioned client
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/clients/replace

parent <> 
GoogleCloudIntegrationsV1alphaReplaceServiceAccountRequest:
GoogleCloudIntegrationsV1alphaReplaceServiceAccountRequest"
  [parent GoogleCloudIntegrationsV1alphaReplaceServiceAccountRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/clients:replace",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaReplaceServiceAccountRequest})

(defn projects-locations-clients-provision
  "Perform the provisioning steps to enable a user GCP project to use IP. If GCP project already registered on IP end via Apigee Integration, provisioning will fail.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/clients/provision

parent <> 
GoogleCloudIntegrationsV1alphaProvisionClientRequest:
GoogleCloudIntegrationsV1alphaProvisionClientRequest"
  [parent GoogleCloudIntegrationsV1alphaProvisionClientRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/clients:provision",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaProvisionClientRequest})

(defn projects-locations-clients-switchVariableMasking
  "Update variable masking for provisioned client
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/clients/switchVariableMasking

parent <> 
GoogleCloudIntegrationsV1alphaSwitchVariableMaskingRequest:
GoogleCloudIntegrationsV1alphaSwitchVariableMaskingRequest"
  [parent GoogleCloudIntegrationsV1alphaSwitchVariableMaskingRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/clients:switchVariableMasking",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaSwitchVariableMaskingRequest})

(defn projects-locations-templates-list
  "Lists all templates matching the filter.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/templates/list

parent <> 

optional:
orderBy <string> Optional. The results would be returned in the order you specified here.
readMask <string> Optional. The mask which specifies fields that need to be returned in the template's response.
pageSize <integer> Optional. The size of the response entries. If unspecified, defaults to 100. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Optional. Standard filter field to filter templates. client_id filter won't be supported and will restrict to templates belonging to the current client only. Return all templates of the current client if the filter is empty. Also supports operators like AND, OR, NOT For example, \"status=\\\"ACTIVE\\\""
  ([parent] (projects-locations-templates-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/templates",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-templates-delete
  "Deletes a template
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/templates/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-templates-download
  "Downloads a template. Retrieves the `Template` and returns the response as a string.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/templates/download

name <> 

optional:
fileFormat <string> Required. File format for download request."
  ([name] (projects-locations-templates-download name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+name}:download",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-templates-upload
  "Uploads a template. The content can be a previously downloaded template. Performs the same function as CreateTemplate, but accepts input in a string format, which holds the complete representation of the Template content.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/templates/upload

parent <> 
GoogleCloudIntegrationsV1alphaUploadTemplateRequest:
GoogleCloudIntegrationsV1alphaUploadTemplateRequest"
  [parent GoogleCloudIntegrationsV1alphaUploadTemplateRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/templates:upload",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaUploadTemplateRequest})

(defn projects-locations-templates-unshare
  "Unshare a template from given clients. Owner of the template can unshare template with clients. Shared client can only unshare the template from itself. PERMISSION_DENIED would be thrown if request is not from owner or for unsharing itself.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/templates/unshare

name <> 
GoogleCloudIntegrationsV1alphaUnshareTemplateRequest:
GoogleCloudIntegrationsV1alphaUnshareTemplateRequest"
  [name GoogleCloudIntegrationsV1alphaUnshareTemplateRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:unshare",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaUnshareTemplateRequest})

(defn projects-locations-templates-import
  "Import the template to an existing integration. This api would keep track of usage_count and last_used_time. PERMISSION_DENIED would be thrown if template is not accessible by client.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/templates/import

name <> 
GoogleCloudIntegrationsV1alphaImportTemplateRequest:
GoogleCloudIntegrationsV1alphaImportTemplateRequest"
  [name GoogleCloudIntegrationsV1alphaImportTemplateRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:import",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaImportTemplateRequest})

(defn projects-locations-templates-patch
  "Updates the template by given id.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/templates/patch

name <> 
GoogleCloudIntegrationsV1alphaTemplate:
GoogleCloudIntegrationsV1alphaTemplate

optional:
updateMask <string> Required. Field mask specifying the fields in the above template that have been modified and must be updated."
  ([name GoogleCloudIntegrationsV1alphaTemplate]
    (projects-locations-templates-patch
      name
      GoogleCloudIntegrationsV1alphaTemplate
      nil))
  ([name GoogleCloudIntegrationsV1alphaTemplate optional]
    {:method :patch,
     :uri-template "https://integrations.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaTemplate}))

(defn projects-locations-templates-create
  "Creates a new template
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/templates/create

parent <> 
GoogleCloudIntegrationsV1alphaTemplate:
GoogleCloudIntegrationsV1alphaTemplate"
  [parent GoogleCloudIntegrationsV1alphaTemplate]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/templates",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaTemplate})

(defn projects-locations-templates-use
  "Use the template to create integration. This api would keep track of usage_count and last_used_time. PERMISSION_DENIED would be thrown if template is not accessible by client.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/templates/use

name <> 
GoogleCloudIntegrationsV1alphaUseTemplateRequest:
GoogleCloudIntegrationsV1alphaUseTemplateRequest"
  [name GoogleCloudIntegrationsV1alphaUseTemplateRequest]
  {:method :post,
   :uri-template "https://integrations.googleapis.com/v1/{+name}:use",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaUseTemplateRequest})

(defn projects-locations-templates-search
  "Search templates based on user query and filters. This api would query the templates and return a list of templates based on the user filter.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/templates/search

parent <> 

optional:
readMask <string> Optional. The mask which specifies fields that need to be returned in the template's response.
pageSize <integer> Optional. The size of the response entries. If unspecified, defaults to 100. The maximum value is 1000; values above 1000 will be coerced to 1000.
orderBy <string> Optional. The results would be returned in the order you specified here.
filter <string> Optional. Standard filter field to filter templates. client_id filter won't be supported and will restrict to templates belonging to the current client only. Return all templates of the current client if the filter is empty. Also supports operators like AND, OR, NOT For example, \"status=\\\"ACTIVE\\\""
  ([parent] (projects-locations-templates-search parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/templates:search",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-templates-get
  "Get a template in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/templates/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-templates-share
  "Share a template with other clients. Only the template owner can share the templates with other projects. PERMISSION_DENIED would be thrown if the request is not from the owner.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/templates/share

name <> 
GoogleCloudIntegrationsV1alphaShareTemplateRequest:
GoogleCloudIntegrationsV1alphaShareTemplateRequest"
  [name GoogleCloudIntegrationsV1alphaShareTemplateRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:share",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaShareTemplateRequest})

(defn projects-locations-cloudFunctions-create
  "Creates a cloud function project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/cloudFunctions/create

parent <> 
GoogleCloudIntegrationsV1alphaCreateCloudFunctionRequest:
GoogleCloudIntegrationsV1alphaCreateCloudFunctionRequest"
  [parent GoogleCloudIntegrationsV1alphaCreateCloudFunctionRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/cloudFunctions",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaCreateCloudFunctionRequest})

(defn projects-locations-integrations-execute
  "Executes integrations synchronously by passing the trigger id in the request body. The request is not returned until the requested executions are either fulfilled or experienced an error. If the integration name is not specified (passing `-`), all of the associated integration under the given trigger_id will be executed. Otherwise only the specified integration for the given `trigger_id` is executed. This is helpful for execution the integration from UI.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/execute

name <> 
GoogleCloudIntegrationsV1alphaExecuteIntegrationsRequest:
GoogleCloudIntegrationsV1alphaExecuteIntegrationsRequest"
  [name GoogleCloudIntegrationsV1alphaExecuteIntegrationsRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:execute",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaExecuteIntegrationsRequest})

(defn projects-locations-integrations-schedule
  "Schedules an integration for execution by passing the trigger id and the scheduled time in the request body.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/schedule

name <> 
GoogleCloudIntegrationsV1alphaScheduleIntegrationsRequest:
GoogleCloudIntegrationsV1alphaScheduleIntegrationsRequest"
  [name GoogleCloudIntegrationsV1alphaScheduleIntegrationsRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:schedule",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaScheduleIntegrationsRequest})

(defn projects-locations-integrations-test
  "Execute the integration in draft state
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/test

name <> 
GoogleCloudIntegrationsV1alphaTestIntegrationsRequest:
GoogleCloudIntegrationsV1alphaTestIntegrationsRequest"
  [name GoogleCloudIntegrationsV1alphaTestIntegrationsRequest]
  {:method :post,
   :uri-template "https://integrations.googleapis.com/v1/{+name}:test",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaTestIntegrationsRequest})

(defn projects-locations-integrations-list
  "Returns the list of all integrations in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/list

parent <> 

optional:
pageSize <integer> The page size for the resquest.
filter <string> Filter on fields of IntegrationVersion. Fields can be compared with literal values by use of \":\" (containment), \"=\" (equality), \">\" (greater), \"<\" (less than), >=\" (greater than or equal to), \"<=\" (less than or equal to), and \"!=\" (inequality) operators. Negation, conjunction, and disjunction are written using NOT, AND, and OR keywords. For example, organization_id=\\\"1\\\" AND state=ACTIVE AND description:\"test\". Filtering cannot be performed on repeated fields like `task_config`.
orderBy <string> The results would be returned in order you specified here. Supported sort keys are: Descending sort order by \"last_modified_time\", \"created_time\", \"snapshot_number\". Ascending sort order by the integration name."
  ([parent] (projects-locations-integrations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/integrations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-integrations-executeEvent
  "Executes an integration on receiving events from Integration Connector triggers, Eventarc or CPS Trigger. Input data to integration is received in body in json format
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/executeEvent

name <> 
object:
object

optional:
triggerId <string> Required. Id of the integration trigger config. The trigger_id is in the format: `integration_connector_trigger/projects/{gcp_project_id}/location/{location}/connections/{connection_name}/subscriptions/{subscription_name}`."
  ([name object]
    (projects-locations-integrations-executeEvent name object nil))
  ([name object optional]
    {:method :post,
     :uri-template
     "https://integrations.googleapis.com/v1/{+name}:executeEvent",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body object}))

(defn projects-locations-integrations-delete
  "Delete the selected integration and all versions inside
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-integrations-versions-unpublish
  "Sets the status of the ACTIVE integration to SNAPSHOT with a new tag \"PREVIOUSLY_PUBLISHED\" after validating it. The \"HEAD\" and \"PUBLISH_REQUESTED\" tags do not change. This RPC throws an exception if the version being snapshot is not ACTIVE. Audit fields added include action, action_by, action_timestamp.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/versions/unpublish

name <> 
GoogleCloudIntegrationsV1alphaUnpublishIntegrationVersionRequest:
GoogleCloudIntegrationsV1alphaUnpublishIntegrationVersionRequest"
  [name
   GoogleCloudIntegrationsV1alphaUnpublishIntegrationVersionRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:unpublish",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body
   GoogleCloudIntegrationsV1alphaUnpublishIntegrationVersionRequest})

(defn projects-locations-integrations-versions-list
  "Returns the list of all integration versions in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/versions/list

parent <> 

optional:
filter <string> Filter on fields of IntegrationVersion. Fields can be compared with literal values by use of \":\" (containment), \"=\" (equality), \">\" (greater), \"<\" (less than), >=\" (greater than or equal to), \"<=\" (less than or equal to), and \"!=\" (inequality) operators. Negation, conjunction, and disjunction are written using NOT, AND, and OR keywords. For example, organization_id=\\\"1\\\" AND state=ACTIVE AND description:\"test\". Filtering cannot be performed on repeated fields like `task_config`.
fieldMask <string> The field mask which specifies the particular data to be returned.
orderBy <string> The results would be returned in order you specified here. Currently supported sort keys are: Descending sort order for \"last_modified_time\", \"created_time\", \"snapshot_number\" Ascending sort order for \"name\".
pageSize <integer> The maximum number of versions to return. The service may return fewer than this value. If unspecified, at most 50 versions will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-integrations-versions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/versions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-integrations-versions-delete
  "Soft-deletes the integration. Changes the status of the integration to ARCHIVED. If the integration being ARCHIVED is tagged as \"HEAD\", the tag is removed from this snapshot and set to the previous non-ARCHIVED snapshot. The PUBLISH_REQUESTED, DUE_FOR_DELETION tags are removed too. This RPC throws an exception if the version being deleted is DRAFT, and if the `locked_by` user is not the same as the user performing the Delete. Audit fields updated include last_modified_timestamp, last_modified_by. Any existing lock is released when Deleting a integration. Currently, there is no undelete mechanism.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/versions/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-integrations-versions-download
  "Downloads an integration. Retrieves the `IntegrationVersion` for a given `integration_id` and returns the response as a string.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/versions/download

name <> 

optional:
files <string> Optional. Integration related file to download like Integration Json, Config variable, testcase etc.
fileFormat <string> File format for download request."
  ([name] (projects-locations-integrations-versions-download name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+name}:download",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-integrations-versions-upload
  "Uploads an integration. The content can be a previously downloaded integration. Performs the same function as CreateDraftIntegrationVersion, but accepts input in a string format, which holds the complete representation of the IntegrationVersion content.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/versions/upload

parent <> 
GoogleCloudIntegrationsV1alphaUploadIntegrationVersionRequest:
GoogleCloudIntegrationsV1alphaUploadIntegrationVersionRequest"
  [parent
   GoogleCloudIntegrationsV1alphaUploadIntegrationVersionRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+parent}/versions:upload",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaUploadIntegrationVersionRequest})

(defn projects-locations-integrations-versions-patch
  "Update a integration with a draft version in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/versions/patch

name <> 
GoogleCloudIntegrationsV1alphaIntegrationVersion:
GoogleCloudIntegrationsV1alphaIntegrationVersion

optional:
updateMask <string> Field mask specifying the fields in the above integration that have been modified and need to be updated."
  ([name GoogleCloudIntegrationsV1alphaIntegrationVersion]
    (projects-locations-integrations-versions-patch
      name
      GoogleCloudIntegrationsV1alphaIntegrationVersion
      nil))
  ([name GoogleCloudIntegrationsV1alphaIntegrationVersion optional]
    {:method :patch,
     :uri-template "https://integrations.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaIntegrationVersion}))

(defn projects-locations-integrations-versions-publish
  "This RPC throws an exception if the integration is in ARCHIVED or ACTIVE state. This RPC throws an exception if the version being published is DRAFT, and if the `locked_by` user is not the same as the user performing the Publish. Audit fields updated include last_published_timestamp, last_published_by, last_modified_timestamp, last_modified_by. Any existing lock is on this integration is released.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/versions/publish

name <> 
GoogleCloudIntegrationsV1alphaPublishIntegrationVersionRequest:
GoogleCloudIntegrationsV1alphaPublishIntegrationVersionRequest"
  [name GoogleCloudIntegrationsV1alphaPublishIntegrationVersionRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:publish",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body
   GoogleCloudIntegrationsV1alphaPublishIntegrationVersionRequest})

(defn projects-locations-integrations-versions-create
  "Create a integration with a draft version in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/versions/create

parent <> 
GoogleCloudIntegrationsV1alphaIntegrationVersion:
GoogleCloudIntegrationsV1alphaIntegrationVersion

optional:
newIntegration <boolean> Set this flag to true, if draft version is to be created for a brand new integration. False, if the request is for an existing integration. For backward compatibility reasons, even if this flag is set to `false` and no existing integration is found, a new draft integration will still be created.
createSampleIntegrations <boolean> Optional. Optional. Indicates if sample workflow should be created."
  ([parent GoogleCloudIntegrationsV1alphaIntegrationVersion]
    (projects-locations-integrations-versions-create
      parent
      GoogleCloudIntegrationsV1alphaIntegrationVersion
      nil))
  ([parent GoogleCloudIntegrationsV1alphaIntegrationVersion optional]
    {:method :post,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/versions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudIntegrationsV1alphaIntegrationVersion}))

(defn projects-locations-integrations-versions-get
  "Get a integration in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/versions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-integrations-versions-downloadJsonPackage
  "Downloads an Integration version package like IntegrationVersion,Integration Config etc. Retrieves the IntegrationVersion package for a given `integration_id` and returns the response as a JSON.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/versions/downloadJsonPackage

name <> 

optional:
files <string> Optional. Integration related file to download like Integration Version, Config variable, testcase etc."
  ([name]
    (projects-locations-integrations-versions-downloadJsonPackage
      name
      nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+name}:downloadJsonPackage",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-integrations-executions-list
  "Lists the results of all the integration executions. The response includes the same information as the [execution log](https://cloud.google.com/application-integration/docs/viewing-logs) in the Integration UI.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/executions/list

parent <> 

optional:
filterParams.endTime <string> End timestamp.
filterParams.parameterPairKey <string> Param key in the key value pair filter.
filterParams.parameterValue <string> Param value. DEPRECATED. User parameter_pair_value instead.
readMask <string> Optional. View mask for the response data. If set, only the field specified will be returned as part of the result. If not set, all fields in Execution will be filled and returned. Supported fields: trigger_id execution_method create_time update_time execution_details execution_details.state execution_details.execution_snapshots execution_details.attempt_stats execution_details.event_execution_snapshots_size request_parameters cloud_logging_details snapshot_number replay_info
filterParams.workflowName <string> Workflow name.
filterParams.eventStatuses <string> List of possible event statuses.
filterParams.customFilter <string> Optional user-provided custom filter.
pageSize <integer> Optional. The size of entries in the response.
filterParams.parameterType <string> Param type.
filterParams.parameterKey <string> Param key. DEPRECATED. User parameter_pair_key instead.
orderBy <string> Optional. The results would be returned in order you specified here. Currently supporting \"create_time\".
refreshAcl <boolean> Optional. If true, the service will use the most recent acl information to list event execution infos and renew the acl cache. Note that fetching the most recent acl is synchronous, so it will increase RPC call latency.
filterParams.executionId <string> Execution id.
filter <string> Optional. Standard filter field, we support filtering on following fields: workflow_name: the name of the integration. CreateTimestamp: the execution created time. event_execution_state: the state of the executions. execution_id: the id of the execution. trigger_id: the id of the trigger. parameter_type: the type of the parameters involved in the execution. All fields support for EQUALS, in additional: CreateTimestamp support for LESS_THAN, GREATER_THAN ParameterType support for HAS For example: \"parameter_type\" HAS \\\"string\\\" Also supports operators like AND, OR, NOT For example, trigger_id=\\\"id1\\\" AND workflow_name=\\\"testWorkflow\\\"
filterParams.parameterPairValue <string> Param value in the key value pair filter.
truncateParams <boolean> Optional. If true, the service will truncate the params to only keep the first 1000 characters of string params and empty the executions in order to make response smaller. Only works for UI and when the params fields are not filtered out.
filterParams.startTime <string> Start timestamp.
filterParams.taskStatuses <string> List of possible task statuses.
snapshotMetadataWithoutParams <boolean> Optional. If true, the service will provide execution info with snapshot metadata only i.e. without event parameters."
  ([parent]
    (projects-locations-integrations-executions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/executions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-integrations-executions-get
  "Get an execution in the specified project.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/executions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-integrations-executions-download
  "Download the execution.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/executions/download

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:download",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-integrations-executions-suspensions-list
  "* Lists suspensions associated with a specific execution. Only those with permissions to resolve the relevant suspensions will be able to view them.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/executions/suspensions/list

parent <> 

optional:
pageSize <integer> Maximum number of entries in the response.
filter <string> Standard filter field.
orderBy <string> Field name to order by."
  ([parent]
    (projects-locations-integrations-executions-suspensions-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/suspensions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-integrations-executions-suspensions-lift
  "* Lifts suspension for the Suspension task. Fetch corresponding suspension with provided suspension Id, resolve suspension, and set up suspension result for the Suspension Task.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/executions/suspensions/lift

name <> 
GoogleCloudIntegrationsV1alphaLiftSuspensionRequest:
GoogleCloudIntegrationsV1alphaLiftSuspensionRequest"
  [name GoogleCloudIntegrationsV1alphaLiftSuspensionRequest]
  {:method :post,
   :uri-template "https://integrations.googleapis.com/v1/{+name}:lift",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaLiftSuspensionRequest})

(defn projects-locations-integrations-executions-suspensions-resolve
  "* Resolves (lifts/rejects) any number of suspensions. If the integration is already running, only the status of the suspension is updated. Otherwise, the suspended integration will begin execution again.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/integrations/executions/suspensions/resolve

name <> 
GoogleCloudIntegrationsV1alphaResolveSuspensionRequest:
GoogleCloudIntegrationsV1alphaResolveSuspensionRequest"
  [name GoogleCloudIntegrationsV1alphaResolveSuspensionRequest]
  {:method :post,
   :uri-template
   "https://integrations.googleapis.com/v1/{+name}:resolve",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudIntegrationsV1alphaResolveSuspensionRequest})

(defn projects-locations-connections-getConnectionSchemaMetadata
  "Lists the available entities and actions associated with a Connection.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/connections/getConnectionSchemaMetadata

name <> "
  [name]
  {:method :get,
   :uri-template "https://integrations.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-connections-list
  "Lists Connections in a given project and location.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/connections/list

parent <> 

optional:
pageSize <integer> Page size.
filter <string> Filter.
orderBy <string> Order by parameters."
  ([parent] (projects-locations-connections-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/connections",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-runtimeEntitySchemas-list
  "Lists the JSON schemas for the properties of runtime entities, filtered by entity name.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/connections/runtimeEntitySchemas/list

parent <> 

optional:
pageSize <integer> Page size.
filter <string> Filter. Only the entity field with literal equality operator is supported."
  ([parent]
    (projects-locations-connections-runtimeEntitySchemas-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/runtimeEntitySchemas",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-runtimeActionSchemas-list
  "Lists the JSON schemas for the inputs and outputs of actions, filtered by action name.
https://cloud.google.com/application-integration/v1/reference/rest/v1/projects/locations/connections/runtimeActionSchemas/list

parent <> 

optional:
pageSize <integer> Page size.
filter <string> Filter. Only the action field with literal equality operator is supported."
  ([parent]
    (projects-locations-connections-runtimeActionSchemas-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://integrations.googleapis.com/v1/{+parent}/runtimeActionSchemas",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
