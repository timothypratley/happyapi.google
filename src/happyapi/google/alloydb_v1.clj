(ns happyapi.google.alloydb-v1
  "AlloyDB API
AlloyDB for PostgreSQL is an open source-compatible database service that provides a powerful option for migrating, modernizing, or building commercial-grade applications. It offers full compatibility with standard PostgreSQL, and is more than 4x faster for transactional workloads and up to 100x faster for analytical queries than standard PostgreSQL in our performance tests. AlloyDB for PostgreSQL offers a 99.99 percent availability SLA inclusive of maintenance. AlloyDB is optimized for the most demanding use cases, allowing you to build new applications that require high transaction throughput, large database sizes, or multiple read resources; scale existing PostgreSQL workloads with no application changes; and modernize legacy proprietary databases. 
See: https://cloud.google.com/alloydb/")

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://alloydb.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://alloydb.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://alloydb.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://alloydb.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://alloydb.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template "https://alloydb.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CancelOperationRequest})

(defn projects-locations-clusters-list
  "Lists Clusters in a given project and location.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Optional. Filtering results
orderBy <string> Optional. Hint for how to order the results"
  ([parent] (projects-locations-clusters-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://alloydb.googleapis.com/v1/{+parent}/clusters",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clusters-delete
  "Deletes a single Cluster.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
etag <string> Optional. The current etag of the Cluster. If an etag is provided and does not match the current etag of the Cluster, deletion will be blocked and an ABORTED error will be returned.
validateOnly <boolean> Optional. If set, performs request validation (e.g. permission checks and any other type of validation), but do not actually execute the delete.
force <boolean> Optional. Whether to cascade delete child instances for given cluster."
  ([name] (projects-locations-clusters-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://alloydb.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clusters-promote
  "Promotes a SECONDARY cluster. This turns down replication from the PRIMARY cluster and promotes a secondary cluster into its own standalone cluster. Imperative only.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/promote

name <> 
PromoteClusterRequest:
PromoteClusterRequest"
  [name PromoteClusterRequest]
  {:method :post,
   :uri-template "https://alloydb.googleapis.com/v1/{+name}:promote",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body PromoteClusterRequest})

(defn projects-locations-clusters-switchover
  "Switches the role of PRIMARY and SECONDARY cluster without any data loss. This promotes the SECONDARY cluster to PRIMARY and sets up original PRIMARY cluster to replicate from this newly promoted cluster.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/switchover

name <> 
SwitchoverClusterRequest:
SwitchoverClusterRequest"
  [name SwitchoverClusterRequest]
  {:method :post,
   :uri-template
   "https://alloydb.googleapis.com/v1/{+name}:switchover",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SwitchoverClusterRequest})

(defn projects-locations-clusters-patch
  "Updates the parameters of a single Cluster.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/patch

name <> 
Cluster:
Cluster

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the Cluster resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, performs request validation (e.g. permission checks and any other type of validation), but do not actually execute the update request.
allowMissing <boolean> Optional. If set to true, update succeeds even if cluster is not found. In that case, a new cluster is created and `update_mask` is ignored."
  ([name Cluster] (projects-locations-clusters-patch name Cluster nil))
  ([name Cluster optional]
    {:method :patch,
     :uri-template "https://alloydb.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Cluster}))

(defn projects-locations-clusters-createsecondary
  "Creates a cluster of type SECONDARY in the given location using the primary cluster as the source.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/createsecondary

parent <> 
Cluster:
Cluster

optional:
clusterId <string> Required. ID of the requesting object (the secondary cluster).
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, performs request validation (e.g. permission checks and any other type of validation), but do not actually execute the create request."
  ([parent Cluster]
    (projects-locations-clusters-createsecondary parent Cluster nil))
  ([parent Cluster optional]
    {:method :post,
     :uri-template
     "https://alloydb.googleapis.com/v1/{+parent}/clusters:createsecondary",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Cluster}))

(defn projects-locations-clusters-create
  "Creates a new Cluster in a given project and location.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/create

parent <> 
Cluster:
Cluster

optional:
clusterId <string> Required. ID of the requesting object.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, performs request validation (e.g. permission checks and any other type of validation), but do not actually execute the create request."
  ([parent Cluster]
    (projects-locations-clusters-create parent Cluster nil))
  ([parent Cluster optional]
    {:method :post,
     :uri-template
     "https://alloydb.googleapis.com/v1/{+parent}/clusters",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Cluster}))

(defn projects-locations-clusters-restore
  "Creates a new Cluster in a given project and location, with a volume restored from the provided source, either a backup ID or a point-in-time and a source cluster.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/restore

parent <> 
RestoreClusterRequest:
RestoreClusterRequest"
  [parent RestoreClusterRequest]
  {:method :post,
   :uri-template
   "https://alloydb.googleapis.com/v1/{+parent}/clusters:restore",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RestoreClusterRequest})

(defn projects-locations-clusters-get
  "Gets details of a single Cluster.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/get

name <> 

optional:
view <string> Optional. The view of the cluster to return. Returns all default fields if not set."
  ([name] (projects-locations-clusters-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://alloydb.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clusters-instances-list
  "Lists Instances in a given project and location.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/instances/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Optional. Filtering results
orderBy <string> Optional. Hint for how to order the results"
  ([parent] (projects-locations-clusters-instances-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://alloydb.googleapis.com/v1/{+parent}/instances",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clusters-instances-injectFault
  "Injects fault in an instance. Imperative only.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/instances/injectFault

name <> 
InjectFaultRequest:
InjectFaultRequest"
  [name InjectFaultRequest]
  {:method :post,
   :uri-template
   "https://alloydb.googleapis.com/v1/{+name}:injectFault",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body InjectFaultRequest})

(defn projects-locations-clusters-instances-failover
  "Forces a Failover for a highly available instance. Failover promotes the HA standby instance as the new primary. Imperative only.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/instances/failover

name <> 
FailoverInstanceRequest:
FailoverInstanceRequest"
  [name FailoverInstanceRequest]
  {:method :post,
   :uri-template "https://alloydb.googleapis.com/v1/{+name}:failover",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body FailoverInstanceRequest})

(defn projects-locations-clusters-instances-delete
  "Deletes a single Instance.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/instances/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
etag <string> Optional. The current etag of the Instance. If an etag is provided and does not match the current etag of the Instance, deletion will be blocked and an ABORTED error will be returned.
validateOnly <boolean> Optional. If set, performs request validation (e.g. permission checks and any other type of validation), but do not actually execute the delete."
  ([name] (projects-locations-clusters-instances-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://alloydb.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clusters-instances-getConnectionInfo
  "Get instance metadata used for a connection.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/instances/getConnectionInfo

parent <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent]
    (projects-locations-clusters-instances-getConnectionInfo
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://alloydb.googleapis.com/v1/{+parent}/connectionInfo",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clusters-instances-patch
  "Updates the parameters of a single Instance.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/instances/patch

name <> 
Instance:
Instance

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the Instance resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, performs request validation (e.g. permission checks and any other type of validation), but do not actually execute the update request.
allowMissing <boolean> Optional. If set to true, update succeeds even if instance is not found. In that case, a new instance is created and `update_mask` is ignored."
  ([name Instance]
    (projects-locations-clusters-instances-patch name Instance nil))
  ([name Instance optional]
    {:method :patch,
     :uri-template "https://alloydb.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Instance}))

(defn projects-locations-clusters-instances-restart
  "Restart an Instance in a cluster. Imperative only.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/instances/restart

name <> 
RestartInstanceRequest:
RestartInstanceRequest"
  [name RestartInstanceRequest]
  {:method :post,
   :uri-template "https://alloydb.googleapis.com/v1/{+name}:restart",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RestartInstanceRequest})

(defn projects-locations-clusters-instances-createsecondary
  "Creates a new SECONDARY Instance in a given project and location.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/instances/createsecondary

parent <> 
Instance:
Instance

optional:
instanceId <string> Required. ID of the requesting object.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, performs request validation (e.g. permission checks and any other type of validation), but do not actually execute the create request."
  ([parent Instance]
    (projects-locations-clusters-instances-createsecondary
      parent
      Instance
      nil))
  ([parent Instance optional]
    {:method :post,
     :uri-template
     "https://alloydb.googleapis.com/v1/{+parent}/instances:createsecondary",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Instance}))

(defn projects-locations-clusters-instances-create
  "Creates a new Instance in a given project and location.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/instances/create

parent <> 
Instance:
Instance

optional:
instanceId <string> Required. ID of the requesting object.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, performs request validation (e.g. permission checks and any other type of validation), but do not actually execute the create request."
  ([parent Instance]
    (projects-locations-clusters-instances-create parent Instance nil))
  ([parent Instance optional]
    {:method :post,
     :uri-template
     "https://alloydb.googleapis.com/v1/{+parent}/instances",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Instance}))

(defn projects-locations-clusters-instances-get
  "Gets details of a single Instance.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/instances/get

name <> 

optional:
view <string> The view of the instance to return."
  ([name] (projects-locations-clusters-instances-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://alloydb.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clusters-users-list
  "Lists Users in a given project and location.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/users/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Optional. Filtering results
orderBy <string> Optional. Hint for how to order the results"
  ([parent] (projects-locations-clusters-users-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://alloydb.googleapis.com/v1/{+parent}/users",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clusters-users-get
  "Gets details of a single User.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/users/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://alloydb.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-clusters-users-create
  "Creates a new User in a given project, location, and cluster.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/users/create

parent <> 
User:
User

optional:
userId <string> Required. ID of the requesting object.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, the backend validates the request, but doesn't actually execute it."
  ([parent User]
    (projects-locations-clusters-users-create parent User nil))
  ([parent User optional]
    {:method :post,
     :uri-template "https://alloydb.googleapis.com/v1/{+parent}/users",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body User}))

(defn projects-locations-clusters-users-patch
  "Updates the parameters of a single User.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/users/patch

name <> 
User:
User

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the User resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, the backend validates the request, but doesn't actually execute it.
allowMissing <boolean> Optional. Allow missing fields in the update mask."
  ([name User] (projects-locations-clusters-users-patch name User nil))
  ([name User optional]
    {:method :patch,
     :uri-template "https://alloydb.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body User}))

(defn projects-locations-clusters-users-delete
  "Deletes a single User.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/clusters/users/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, the backend validates the request, but doesn't actually execute it."
  ([name] (projects-locations-clusters-users-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://alloydb.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backups-list
  "Lists Backups in a given project and location.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/backups/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Filtering results
orderBy <string> Hint for how to order the results"
  ([parent] (projects-locations-backups-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://alloydb.googleapis.com/v1/{+parent}/backups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-backups-get
  "Gets details of a single Backup.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/backups/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://alloydb.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-backups-create
  "Creates a new Backup in a given project and location.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/backups/create

parent <> 
Backup:
Backup

optional:
backupId <string> Required. ID of the requesting object.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, the backend validates the request, but doesn't actually execute it."
  ([parent Backup]
    (projects-locations-backups-create parent Backup nil))
  ([parent Backup optional]
    {:method :post,
     :uri-template
     "https://alloydb.googleapis.com/v1/{+parent}/backups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Backup}))

(defn projects-locations-backups-patch
  "Updates the parameters of a single Backup.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/backups/patch

name <> 
Backup:
Backup

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the Backup resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, the backend validates the request, but doesn't actually execute it.
allowMissing <boolean> Optional. If set to true, update succeeds even if instance is not found. In that case, a new backup is created and `update_mask` is ignored."
  ([name Backup] (projects-locations-backups-patch name Backup nil))
  ([name Backup optional]
    {:method :patch,
     :uri-template "https://alloydb.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Backup}))

(defn projects-locations-backups-delete
  "Deletes a single Backup.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/backups/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, the backend validates the request, but doesn't actually execute it.
etag <string> Optional. The current etag of the Backup. If an etag is provided and does not match the current etag of the Backup, deletion will be blocked and an ABORTED error will be returned."
  ([name] (projects-locations-backups-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://alloydb.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-supportedDatabaseFlags-list
  "Lists SupportedDatabaseFlags for a given project and location.
https://cloud.google.com/alloydb/v1/reference/rest/v1/projects/locations/supportedDatabaseFlags/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default."
  ([parent]
    (projects-locations-supportedDatabaseFlags-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://alloydb.googleapis.com/v1/{+parent}/supportedDatabaseFlags",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
