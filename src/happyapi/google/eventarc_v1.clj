(ns happyapi.google.eventarc-v1
  "Eventarc API
Build event-driven applications on Google Cloud Platform.
See: https://cloud.google.com/eventarc/docs"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-getGoogleChannelConfig
  "Get a GoogleChannelConfig
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/getGoogleChannelConfig

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://eventarc.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-updateGoogleChannelConfig
  "Update a single GoogleChannelConfig
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/updateGoogleChannelConfig

name <> 
GoogleChannelConfig:
GoogleChannelConfig

optional:
updateMask <string> The fields to be updated; only fields explicitly provided are updated. If no field mask is provided, all provided fields in the request are updated. To update all fields, provide a field mask of \"*\"."
  ([name GoogleChannelConfig]
    (projects-locations-updateGoogleChannelConfig
      name
      GoogleChannelConfig
      nil))
  ([name GoogleChannelConfig optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://eventarc.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleChannelConfig})))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://eventarc.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://eventarc.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://eventarc.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://eventarc.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://eventarc.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
GoogleLongrunningCancelOperationRequest:
GoogleLongrunningCancelOperationRequest"
  [name GoogleLongrunningCancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://eventarc.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleLongrunningCancelOperationRequest}))

(defn projects-locations-triggers-get
  "Get a single trigger.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/triggers/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://eventarc.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-triggers-list
  "List triggers.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/triggers/list

parent <> 

optional:
pageSize <integer> The maximum number of triggers to return on each page. Note: The service may send fewer.
orderBy <string> The sorting order of the resources returned. Value should be a comma-separated list of fields. The default sorting order is ascending. To specify descending order for a field, append a `desc` suffix; for example: `name desc, trigger_id`.
filter <string> Filter field. Used to filter the Triggers to be listed. Possible filters are described in https://google.aip.dev/160. For example, using \"?filter=destination:gke\" would list only Triggers with a gke destination."
  ([parent] (projects-locations-triggers-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://eventarc.googleapis.com/v1/{+parent}/triggers",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-triggers-create
  "Create a new trigger in a particular project and location.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/triggers/create

parent <> 
Trigger:
Trigger

optional:
triggerId <string> Required. The user-provided ID to be assigned to the trigger.
validateOnly <boolean> Optional. If set, validate the request and preview the review, but do not post it."
  ([parent Trigger]
    (projects-locations-triggers-create parent Trigger nil))
  ([parent Trigger optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://eventarc.googleapis.com/v1/{+parent}/triggers",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Trigger})))

(defn projects-locations-triggers-patch
  "Update a single trigger.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/triggers/patch

name <> 
Trigger:
Trigger

optional:
updateMask <string> The fields to be updated; only fields explicitly provided are updated. If no field mask is provided, all provided fields in the request are updated. To update all fields, provide a field mask of \"*\".
allowMissing <boolean> If set to true, and the trigger is not found, a new trigger will be created. In this situation, `update_mask` is ignored.
validateOnly <boolean> Optional. If set, validate the request and preview the review, but do not post it."
  ([name Trigger] (projects-locations-triggers-patch name Trigger nil))
  ([name Trigger optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://eventarc.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Trigger})))

(defn projects-locations-triggers-delete
  "Delete a single trigger.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/triggers/delete

name <> 

optional:
etag <string> If provided, the trigger will only be deleted if the etag matches the current etag on the resource.
allowMissing <boolean> If set to true, and the trigger is not found, the request will succeed but no action will be taken on the server.
validateOnly <boolean> Optional. If set, validate the request and preview the review, but do not post it."
  ([name] (projects-locations-triggers-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://eventarc.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-triggers-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/triggers/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://eventarc.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-triggers-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/triggers/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-triggers-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://eventarc.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-triggers-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/triggers/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://eventarc.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-channels-get
  "Get a single Channel.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channels/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://eventarc.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-channels-list
  "List channels.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channels/list

parent <> 

optional:
pageSize <integer> The maximum number of channels to return on each page. Note: The service may send fewer.
orderBy <string> The sorting order of the resources returned. Value should be a comma-separated list of fields. The default sorting order is ascending. To specify descending order for a field, append a `desc` suffix; for example: `name desc, channel_id`."
  ([parent] (projects-locations-channels-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://eventarc.googleapis.com/v1/{+parent}/channels",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-channels-create
  "Create a new channel in a particular project and location.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channels/create

parent <> 
Channel:
Channel

optional:
channelId <string> Required. The user-provided ID to be assigned to the channel.
validateOnly <boolean> Optional. If set, validate the request and preview the review, but do not post it."
  ([parent Channel]
    (projects-locations-channels-create parent Channel nil))
  ([parent Channel optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://eventarc.googleapis.com/v1/{+parent}/channels",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Channel})))

(defn projects-locations-channels-patch
  "Update a single channel.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channels/patch

name <> 
Channel:
Channel

optional:
updateMask <string> The fields to be updated; only fields explicitly provided are updated. If no field mask is provided, all provided fields in the request are updated. To update all fields, provide a field mask of \"*\".
validateOnly <boolean> Optional. If set, validate the request and preview the review, but do not post it."
  ([name Channel] (projects-locations-channels-patch name Channel nil))
  ([name Channel optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://eventarc.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Channel})))

(defn projects-locations-channels-delete
  "Delete a single channel.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channels/delete

name <> 

optional:
validateOnly <boolean> Optional. If set, validate the request and preview the review, but do not post it."
  ([name] (projects-locations-channels-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://eventarc.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-channels-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channels/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://eventarc.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-channels-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channels/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-channels-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://eventarc.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-channels-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channels/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://eventarc.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-providers-get
  "Get a single Provider.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/providers/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://eventarc.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-providers-list
  "List providers.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/providers/list

parent <> 

optional:
pageSize <integer> The maximum number of providers to return on each page.
orderBy <string> The sorting order of the resources returned. Value should be a comma-separated list of fields. The default sorting oder is ascending. To specify descending order for a field, append a `desc` suffix; for example: `name desc, _id`.
filter <string> The filter field that the list request will filter on."
  ([parent] (projects-locations-providers-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://eventarc.googleapis.com/v1/{+parent}/providers",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-channelConnections-get
  "Get a single ChannelConnection.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channelConnections/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://eventarc.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-channelConnections-list
  "List channel connections.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channelConnections/list

parent <> 

optional:
pageSize <integer> The maximum number of channel connections to return on each page. Note: The service may send fewer responses."
  ([parent] (projects-locations-channelConnections-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://eventarc.googleapis.com/v1/{+parent}/channelConnections",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-channelConnections-create
  "Create a new ChannelConnection in a particular project and location.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channelConnections/create

parent <> 
ChannelConnection:
ChannelConnection

optional:
channelConnectionId <string> Required. The user-provided ID to be assigned to the channel connection."
  ([parent ChannelConnection]
    (projects-locations-channelConnections-create
      parent
      ChannelConnection
      nil))
  ([parent ChannelConnection optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://eventarc.googleapis.com/v1/{+parent}/channelConnections",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ChannelConnection})))

(defn projects-locations-channelConnections-delete
  "Delete a single ChannelConnection.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channelConnections/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://eventarc.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-channelConnections-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channelConnections/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://eventarc.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-channelConnections-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channelConnections/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-channelConnections-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://eventarc.googleapis.com/v1/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-channelConnections-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/eventarc/docs/v1/reference/rest/v1/projects/locations/channelConnections/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://eventarc.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))
