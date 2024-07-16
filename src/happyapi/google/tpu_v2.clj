(ns happyapi.google.tpu-v2
  "Cloud TPU API
TPU API provides customers with access to Google TPU technology.
See: https://cloud.google.com/tpu/"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://tpu.googleapis.com/v2/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://tpu.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-generateServiceIdentity
  "Generates the Cloud TPU service identity for the project.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/generateServiceIdentity

parent <> 
GenerateServiceIdentityRequest:
GenerateServiceIdentityRequest"
  [parent GenerateServiceIdentityRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://tpu.googleapis.com/v2/{+parent}:generateServiceIdentity",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GenerateServiceIdentityRequest}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://tpu.googleapis.com/v2/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://tpu.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://tpu.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/operations/cancel

name <> "
  [name]
  (client/api-request
    {:method :post,
     :uri-template "https://tpu.googleapis.com/v2/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-nodes-list
  "Lists nodes.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/nodes/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return."
  ([parent] (projects-locations-nodes-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template "https://tpu.googleapis.com/v2/{+parent}/nodes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-nodes-get
  "Gets the details of a node.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/nodes/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://tpu.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-nodes-create
  "Creates a node.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/nodes/create

parent <> 
Node:
Node

optional:
nodeId <string> The unqualified resource name."
  ([parent Node] (projects-locations-nodes-create parent Node nil))
  ([parent Node optional]
    (client/api-request
      {:method :post,
       :uri-template "https://tpu.googleapis.com/v2/{+parent}/nodes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Node})))

(defn projects-locations-nodes-delete
  "Deletes a node.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/nodes/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://tpu.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-nodes-stop
  "Stops a node. This operation is only available with single TPU nodes.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/nodes/stop

name <> 
StopNodeRequest:
StopNodeRequest"
  [name StopNodeRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://tpu.googleapis.com/v2/{+name}:stop",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body StopNodeRequest}))

(defn projects-locations-nodes-start
  "Starts a node.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/nodes/start

name <> 
StartNodeRequest:
StartNodeRequest"
  [name StartNodeRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://tpu.googleapis.com/v2/{+name}:start",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body StartNodeRequest}))

(defn projects-locations-nodes-patch
  "Updates the configurations of a node.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/nodes/patch

name <> 
Node:
Node

optional:
updateMask <string> Required. Mask of fields from Node to update. Supported fields: [description, tags, labels, metadata, network_config.enable_external_ips]."
  ([name Node] (projects-locations-nodes-patch name Node nil))
  ([name Node optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://tpu.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Node})))

(defn projects-locations-nodes-getGuestAttributes
  "Retrieves the guest attributes for the node.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/nodes/getGuestAttributes

name <> 
GetGuestAttributesRequest:
GetGuestAttributesRequest"
  [name GetGuestAttributesRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://tpu.googleapis.com/v2/{+name}:getGuestAttributes",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GetGuestAttributesRequest}))

(defn projects-locations-queuedResources-list
  "Lists queued resources.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/queuedResources/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of items to return."
  ([parent] (projects-locations-queuedResources-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://tpu.googleapis.com/v2/{+parent}/queuedResources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-queuedResources-get
  "Gets details of a queued resource.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/queuedResources/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://tpu.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-queuedResources-create
  "Creates a QueuedResource TPU instance.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/queuedResources/create

parent <> 
QueuedResource:
QueuedResource

optional:
queuedResourceId <string> Optional. The unqualified resource name. Should follow the `^[A-Za-z0-9_.~+%-]+$` regex format.
requestId <string> Optional. Idempotent request UUID."
  ([parent QueuedResource]
    (projects-locations-queuedResources-create
      parent
      QueuedResource
      nil))
  ([parent QueuedResource optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://tpu.googleapis.com/v2/{+parent}/queuedResources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body QueuedResource})))

(defn projects-locations-queuedResources-delete
  "Deletes a QueuedResource TPU instance.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/queuedResources/delete

name <> 

optional:
requestId <string> Optional. Idempotent request UUID.
force <boolean> Optional. If set to true, all running nodes belonging to this queued resource will be deleted first and then the queued resource will be deleted. Otherwise (i.e. force=false), the queued resource will only be deleted if its nodes have already been deleted or the queued resource is in the ACCEPTED, FAILED, or SUSPENDED state."
  ([name] (projects-locations-queuedResources-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://tpu.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-queuedResources-reset
  "Resets a QueuedResource TPU instance
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/queuedResources/reset

name <> 
ResetQueuedResourceRequest:
ResetQueuedResourceRequest"
  [name ResetQueuedResourceRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://tpu.googleapis.com/v2/{+name}:reset",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ResetQueuedResourceRequest}))

(defn projects-locations-acceleratorTypes-list
  "Lists accelerator types supported by this API.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/acceleratorTypes/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return.
filter <string> List filter.
orderBy <string> Sort results."
  ([parent] (projects-locations-acceleratorTypes-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://tpu.googleapis.com/v2/{+parent}/acceleratorTypes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-acceleratorTypes-get
  "Gets AcceleratorType.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/acceleratorTypes/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://tpu.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-runtimeVersions-list
  "Lists runtime versions supported by this API.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/runtimeVersions/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return.
filter <string> List filter.
orderBy <string> Sort results."
  ([parent] (projects-locations-runtimeVersions-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://tpu.googleapis.com/v2/{+parent}/runtimeVersions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-runtimeVersions-get
  "Gets a runtime version.
https://cloud.google.com/tpu/v2/reference/rest/v2/projects/locations/runtimeVersions/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://tpu.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
