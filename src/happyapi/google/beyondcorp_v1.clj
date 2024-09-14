(ns happyapi.google.beyondcorp-v1
  "BeyondCorp API
Beyondcorp Enterprise provides identity and context aware access controls for enterprise resources and enables zero-trust access. Using the Beyondcorp Enterprise APIs, enterprises can set up multi-cloud and on-prem connectivity solutions.
See: https://cloud.google.com/")

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://beyondcorp.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://beyondcorp.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://beyondcorp.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
GoogleLongrunningCancelOperationRequest:
GoogleLongrunningCancelOperationRequest"
  [name GoogleLongrunningCancelOperationRequest]
  {:method :post,
   :uri-template "https://beyondcorp.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleLongrunningCancelOperationRequest})

(defn projects-locations-appConnections-list
  "Lists AppConnections in a given project and location.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnections/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of items to return. If not specified, a default value of 50 will be used by the service. Regardless of the page_size value, the response may include a partial list and a caller should only rely on response's next_page_token to determine if there are more instances left to be queried.
filter <string> Optional. A filter specifying constraints of a list operation.
orderBy <string> Optional. Specifies the ordering of results. See [Sorting order](https://cloud.google.com/apis/design/design_patterns#sorting_order) for more information."
  ([parent] (projects-locations-appConnections-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+parent}/appConnections",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-appConnections-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnections/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1SetIamPolicyRequest})

(defn projects-locations-appConnections-resolve
  "Resolves AppConnections details for a given AppConnector. An internal method called by a connector to find AppConnections to connect to.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnections/resolve

parent <> 

optional:
appConnectorId <string> Required. BeyondCorp Connector name of the connector associated with those AppConnections using the form: `projects/{project_id}/locations/{location_id}/appConnectors/{app_connector_id}`
pageSize <integer> Optional. The maximum number of items to return. If not specified, a default value of 50 will be used by the service. Regardless of the page_size value, the response may include a partial list and a caller should only rely on response's next_page_token to determine if there are more instances left to be queried."
  ([parent] (projects-locations-appConnections-resolve parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+parent}/appConnections:resolve",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-appConnections-delete
  "Deletes a single AppConnection.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnections/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, validates request by executing a dry-run which would not alter the resource in any way."
  ([name] (projects-locations-appConnections-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://beyondcorp.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-appConnections-patch
  "Updates the parameters of a single AppConnection.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnections/patch

name <> 
GoogleCloudBeyondcorpAppconnectionsV1AppConnection:
GoogleCloudBeyondcorpAppconnectionsV1AppConnection

optional:
updateMask <string> Required. Mask of fields to update. At least one path must be supplied in this field. The elements of the repeated paths field may only include these fields from [BeyondCorp.AppConnection]: * `labels` * `display_name` * `application_endpoint` * `connectors`
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, validates request by executing a dry-run which would not alter the resource in any way.
allowMissing <boolean> Optional. If set as true, will create the resource if it is not found."
  ([name GoogleCloudBeyondcorpAppconnectionsV1AppConnection]
    (projects-locations-appConnections-patch
      name
      GoogleCloudBeyondcorpAppconnectionsV1AppConnection
      nil))
  ([name GoogleCloudBeyondcorpAppconnectionsV1AppConnection optional]
    {:method :patch,
     :uri-template "https://beyondcorp.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudBeyondcorpAppconnectionsV1AppConnection}))

(defn projects-locations-appConnections-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnections/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-appConnections-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-appConnections-create
  "Creates a new AppConnection in a given project and location.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnections/create

parent <> 
GoogleCloudBeyondcorpAppconnectionsV1AppConnection:
GoogleCloudBeyondcorpAppconnectionsV1AppConnection

optional:
appConnectionId <string> Optional. User-settable AppConnection resource ID. * Must start with a letter. * Must contain between 4-63 characters from `/a-z-/`. * Must end with a number or a letter.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, validates request by executing a dry-run which would not alter the resource in any way."
  ([parent GoogleCloudBeyondcorpAppconnectionsV1AppConnection]
    (projects-locations-appConnections-create
      parent
      GoogleCloudBeyondcorpAppconnectionsV1AppConnection
      nil))
  ([parent GoogleCloudBeyondcorpAppconnectionsV1AppConnection optional]
    {:method :post,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+parent}/appConnections",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudBeyondcorpAppconnectionsV1AppConnection}))

(defn projects-locations-appConnections-get
  "Gets details of a single AppConnection.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnections/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://beyondcorp.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-appConnections-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnections/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1TestIamPermissionsRequest})

(defn projects-locations-appConnectors-list
  "Lists AppConnectors in a given project and location.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnectors/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of items to return. If not specified, a default value of 50 will be used by the service. Regardless of the page_size value, the response may include a partial list and a caller should only rely on response's next_page_token to determine if there are more instances left to be queried.
filter <string> Optional. A filter specifying constraints of a list operation.
orderBy <string> Optional. Specifies the ordering of results. See [Sorting order](https://cloud.google.com/apis/design/design_patterns#sorting_order) for more information."
  ([parent] (projects-locations-appConnectors-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+parent}/appConnectors",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-appConnectors-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnectors/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1SetIamPolicyRequest})

(defn projects-locations-appConnectors-delete
  "Deletes a single AppConnector.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnectors/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, validates request by executing a dry-run which would not alter the resource in any way."
  ([name] (projects-locations-appConnectors-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://beyondcorp.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-appConnectors-reportStatus
  "Report status for a given connector.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnectors/reportStatus

appConnector <> 
GoogleCloudBeyondcorpAppconnectorsV1ReportStatusRequest:
GoogleCloudBeyondcorpAppconnectorsV1ReportStatusRequest"
  [appConnector
   GoogleCloudBeyondcorpAppconnectorsV1ReportStatusRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+appConnector}:reportStatus",
   :uri-template-args {"appConnector" appConnector},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudBeyondcorpAppconnectorsV1ReportStatusRequest})

(defn projects-locations-appConnectors-resolveInstanceConfig
  "Gets instance configuration for a given AppConnector. An internal method called by a AppConnector to get its container config.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnectors/resolveInstanceConfig

appConnector <> "
  [appConnector]
  {:method :get,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+appConnector}:resolveInstanceConfig",
   :uri-template-args {"appConnector" appConnector},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-appConnectors-patch
  "Updates the parameters of a single AppConnector.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnectors/patch

name <> 
GoogleCloudBeyondcorpAppconnectorsV1AppConnector:
GoogleCloudBeyondcorpAppconnectorsV1AppConnector

optional:
updateMask <string> Required. Mask of fields to update. At least one path must be supplied in this field. The elements of the repeated paths field may only include these fields from [BeyondCorp.AppConnector]: * `labels` * `display_name`
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, validates request by executing a dry-run which would not alter the resource in any way."
  ([name GoogleCloudBeyondcorpAppconnectorsV1AppConnector]
    (projects-locations-appConnectors-patch
      name
      GoogleCloudBeyondcorpAppconnectorsV1AppConnector
      nil))
  ([name GoogleCloudBeyondcorpAppconnectorsV1AppConnector optional]
    {:method :patch,
     :uri-template "https://beyondcorp.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudBeyondcorpAppconnectorsV1AppConnector}))

(defn projects-locations-appConnectors-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnectors/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-appConnectors-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-appConnectors-create
  "Creates a new AppConnector in a given project and location.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnectors/create

parent <> 
GoogleCloudBeyondcorpAppconnectorsV1AppConnector:
GoogleCloudBeyondcorpAppconnectorsV1AppConnector

optional:
appConnectorId <string> Optional. User-settable AppConnector resource ID. * Must start with a letter. * Must contain between 4-63 characters from `/a-z-/`. * Must end with a number or a letter.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, validates request by executing a dry-run which would not alter the resource in any way."
  ([parent GoogleCloudBeyondcorpAppconnectorsV1AppConnector]
    (projects-locations-appConnectors-create
      parent
      GoogleCloudBeyondcorpAppconnectorsV1AppConnector
      nil))
  ([parent GoogleCloudBeyondcorpAppconnectorsV1AppConnector optional]
    {:method :post,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+parent}/appConnectors",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudBeyondcorpAppconnectorsV1AppConnector}))

(defn projects-locations-appConnectors-get
  "Gets details of a single AppConnector.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnectors/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://beyondcorp.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-appConnectors-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appConnectors/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1TestIamPermissionsRequest})

(defn projects-locations-appGateways-list
  "Lists AppGateways in a given project and location.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appGateways/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of items to return. If not specified, a default value of 50 will be used by the service. Regardless of the page_size value, the response may include a partial list and a caller should only rely on response's next_page_token to determine if there are more instances left to be queried.
filter <string> Optional. A filter specifying constraints of a list operation.
orderBy <string> Optional. Specifies the ordering of results. See [Sorting order](https://cloud.google.com/apis/design/design_patterns#sorting_order) for more information."
  ([parent] (projects-locations-appGateways-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+parent}/appGateways",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-appGateways-shouldThrottle
  "Calls the Bouncer method ShouldThrottle to check if a request should be throttled.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appGateways/shouldThrottle

name <> 

optional:
port <integer> Optional. The port that is being throttled
requestedAmount <string> Optional. The current throughput through the port (mbps)"
  ([name] (projects-locations-appGateways-shouldThrottle name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+name}:shouldThrottle",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-appGateways-get
  "Gets details of a single AppGateway.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appGateways/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://beyondcorp.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-appGateways-create
  "Creates a new AppGateway in a given project and location.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appGateways/create

parent <> 
AppGateway:
AppGateway

optional:
appGatewayId <string> Optional. User-settable AppGateway resource ID. * Must start with a letter. * Must contain between 4-63 characters from `/a-z-/`. * Must end with a number or a letter.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, validates request by executing a dry-run which would not alter the resource in any way."
  ([parent AppGateway]
    (projects-locations-appGateways-create parent AppGateway nil))
  ([parent AppGateway optional]
    {:method :post,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+parent}/appGateways",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AppGateway}))

(defn projects-locations-appGateways-delete
  "Deletes a single AppGateway.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appGateways/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, validates request by executing a dry-run which would not alter the resource in any way."
  ([name] (projects-locations-appGateways-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://beyondcorp.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-appGateways-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appGateways/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1SetIamPolicyRequest})

(defn projects-locations-appGateways-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appGateways/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-appGateways-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-appGateways-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/appGateways/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1TestIamPermissionsRequest})

(defn projects-locations-clientConnectorServices-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/clientConnectorServices/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1SetIamPolicyRequest})

(defn projects-locations-clientConnectorServices-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/clientConnectorServices/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-clientConnectorServices-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clientConnectorServices-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/clientConnectorServices/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1TestIamPermissionsRequest})

(defn projects-locations-clientGateways-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/clientGateways/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1SetIamPolicyRequest})

(defn projects-locations-clientGateways-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/clientGateways/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-clientGateways-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clientGateways-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/v1/reference/rest/v1/projects/locations/clientGateways/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1TestIamPermissionsRequest})

(defn organizations-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/v1/reference/rest/v1/organizations/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (organizations-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/v1/reference/rest/v1/organizations/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://beyondcorp.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/v1/reference/rest/v1/organizations/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://beyondcorp.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/v1/reference/rest/v1/organizations/locations/operations/cancel

name <> 
GoogleLongrunningCancelOperationRequest:
GoogleLongrunningCancelOperationRequest"
  [name GoogleLongrunningCancelOperationRequest]
  {:method :post,
   :uri-template "https://beyondcorp.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleLongrunningCancelOperationRequest})

(defn organizations-locations-global-partnerTenants-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/v1/reference/rest/v1/organizations/locations/global/partnerTenants/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1SetIamPolicyRequest})

(defn organizations-locations-global-partnerTenants-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/v1/reference/rest/v1/organizations/locations/global/partnerTenants/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (organizations-locations-global-partnerTenants-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-global-partnerTenants-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/v1/reference/rest/v1/organizations/locations/global/partnerTenants/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1TestIamPermissionsRequest})

(defn organizations-locations-global-partnerTenants-proxyConfigs-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/v1/reference/rest/v1/organizations/locations/global/partnerTenants/proxyConfigs/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1SetIamPolicyRequest})

(defn organizations-locations-global-partnerTenants-proxyConfigs-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/v1/reference/rest/v1/organizations/locations/global/partnerTenants/proxyConfigs/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (organizations-locations-global-partnerTenants-proxyConfigs-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-global-partnerTenants-proxyConfigs-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/v1/reference/rest/v1/organizations/locations/global/partnerTenants/proxyConfigs/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1TestIamPermissionsRequest})

(defn organizations-locations-global-partnerTenants-browserDlpRules-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/v1/reference/rest/v1/organizations/locations/global/partnerTenants/browserDlpRules/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1SetIamPolicyRequest})

(defn organizations-locations-global-partnerTenants-browserDlpRules-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/v1/reference/rest/v1/organizations/locations/global/partnerTenants/browserDlpRules/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (organizations-locations-global-partnerTenants-browserDlpRules-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://beyondcorp.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-global-partnerTenants-browserDlpRules-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/v1/reference/rest/v1/organizations/locations/global/partnerTenants/browserDlpRules/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://beyondcorp.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV1TestIamPermissionsRequest})
