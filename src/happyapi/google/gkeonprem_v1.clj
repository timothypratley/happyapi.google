(ns happyapi.google.gkeonprem-v1
  "GDC Virtual API

See: https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs")

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template "https://gkeonprem.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CancelOperationRequest})

(defn projects-locations-bareMetalClusters-list
  "Lists bare metal clusters in a given project and location.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, at most 50 clusters will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> A resource filtering expression following https://google.aip.dev/160. When non-empty, only resource's whose attributes field matches the filter are returned.
view <string> View for bare metal Clusters. When `BASIC` is specified, only the cluster resource name and admin cluster membership are returned. The default/unset value `CLUSTER_VIEW_UNSPECIFIED` is the same as `FULL', which returns the complete cluster configuration details.
allowMissing <boolean> Optional. If true, return list of BareMetal Clusters including the ones that only exists in RMS."
  ([parent] (projects-locations-bareMetalClusters-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/bareMetalClusters",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalClusters-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-bareMetalClusters-delete
  "Deletes a single bare metal Cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/delete

name <> 

optional:
etag <string> The current etag of the bare metal Cluster. If an etag is provided and does not match the current etag of the cluster, deletion will be blocked and an ABORTED error will be returned.
allowMissing <boolean> If set to true, and the bare metal cluster is not found, the request will succeed but no action will be taken on the server and return a completed LRO.
validateOnly <boolean> Validate the request without actually doing any updates.
force <boolean> If set to true, any node pools from the cluster will also be deleted.
ignoreErrors <boolean> If set to true, the deletion of a bare metal user cluster resource will succeed even if errors occur during deletion. This parameter can be used when you want to delete GCP's cluster resource and the on-prem admin cluster that hosts your user cluster is disconnected / unreachable or deleted. WARNING: Using this parameter when your user cluster still exists may result in a deleted GCP user cluster but an existing on-prem user cluster."
  ([name] (projects-locations-bareMetalClusters-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalClusters-unenroll
  "Unenrolls an existing bare metal user cluster and its node pools from the Anthos On-Prem API within a given project and location. Unenrollment removes the Cloud reference to the cluster without modifying the underlying OnPrem Resources. Clusters and node pools will continue to run; however, they will no longer be accessible through the Anthos On-Prem API or its clients.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/unenroll

name <> 

optional:
etag <string> The current etag of the bare metal Cluster. If an etag is provided and does not match the current etag of the cluster, deletion will be blocked and an ABORTED error will be returned.
allowMissing <boolean> If set to true, and the bare metal cluster is not found, the request will succeed but no action will be taken on the server and return a completed LRO.
validateOnly <boolean> Validate the request without actually doing any updates.
force <boolean> This is required if the cluster has any associated node pools. When set, any child node pools will also be unenrolled."
  ([name] (projects-locations-bareMetalClusters-unenroll name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}:unenroll",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalClusters-patch
  "Updates the parameters of a single bare metal Cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/patch

name <> 
BareMetalCluster:
BareMetalCluster

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the BareMetalCluster resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all populated fields in the BareMetalCluster message will be updated. Empty fields will be ignored unless a field mask is used.
allowMissing <boolean> If set to true, and the bare metal cluster is not found, the request will create a new bare metal cluster with the provided configuration. The user must have both create and update permission to call Update with allow_missing set to true.
validateOnly <boolean> Validate the request without actually doing any updates."
  ([name BareMetalCluster]
    (projects-locations-bareMetalClusters-patch
      name
      BareMetalCluster
      nil))
  ([name BareMetalCluster optional]
    {:method :patch,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BareMetalCluster}))

(defn projects-locations-bareMetalClusters-queryVersionConfig
  "Queries the bare metal user cluster version config.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/queryVersionConfig

parent <> 

optional:
createConfig.adminClusterMembership <string> The admin cluster membership. This is the full resource name of the admin cluster's fleet membership. Format: \"projects/{project}/locations/{location}/memberships/{membership}\"
createConfig.adminClusterName <string> The admin cluster resource name. This is the full resource name of the admin cluster resource. Format: \"projects/{project}/locations/{location}/bareMetalAdminClusters/{bare_metal_admin_cluster}\"
upgradeConfig.clusterName <string> The user cluster resource name. This is the full resource name of the user cluster resource. Format: \"projects/{project}/locations/{location}/bareMetalClusters/{bare_metal_cluster}\""
  ([parent]
    (projects-locations-bareMetalClusters-queryVersionConfig
      parent
      nil))
  ([parent optional]
    {:method :post,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/bareMetalClusters:queryVersionConfig",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalClusters-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-bareMetalClusters-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalClusters-enroll
  "Enrolls an existing bare metal user cluster and its node pools to the Anthos On-Prem API within a given project and location. Through enrollment, an existing cluster will become Anthos On-Prem API managed. The corresponding GCP resources will be created and all future modifications to the cluster and/or its node pools will be expected to be performed through the API.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/enroll

parent <> 
EnrollBareMetalClusterRequest:
EnrollBareMetalClusterRequest"
  [parent EnrollBareMetalClusterRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+parent}/bareMetalClusters:enroll",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body EnrollBareMetalClusterRequest})

(defn projects-locations-bareMetalClusters-create
  "Creates a new bare metal cluster in a given project and location.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/create

parent <> 
BareMetalCluster:
BareMetalCluster

optional:
bareMetalClusterId <string> Required. User provided identifier that is used as part of the resource name; must conform to RFC-1034 and additionally restrict to lower-cased letters. This comes out roughly to: /^a-z+[a-z0-9]$/
validateOnly <boolean> Validate the request without actually doing any updates.
allowPreflightFailure <boolean> Optional. If set to true, CLM will force CCFE to persist the cluster resource in RMS when the creation fails during standalone preflight checks. In that case the subsequent create call will fail with \"cluster already exists\" error and hence a update cluster is required to fix the cluster."
  ([parent BareMetalCluster]
    (projects-locations-bareMetalClusters-create
      parent
      BareMetalCluster
      nil))
  ([parent BareMetalCluster optional]
    {:method :post,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/bareMetalClusters",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BareMetalCluster}))

(defn projects-locations-bareMetalClusters-get
  "Gets details of a single bare metal Cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/get

name <> 

optional:
view <string> View for bare metal user cluster. When `BASIC` is specified, only the cluster resource name and admin cluster membership are returned. The default/unset value `CLUSTER_VIEW_UNSPECIFIED` is the same as `FULL', which returns the complete cluster configuration details.
allowMissing <boolean> Optional. If true, return BareMetal Cluster including the one that only exists in RMS."
  ([name] (projects-locations-bareMetalClusters-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalClusters-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-bareMetalClusters-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-bareMetalClusters-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalClusters-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-bareMetalClusters-bareMetalNodePools-list
  "Lists bare metal node pools in a given project, location and bare metal cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/bareMetalNodePools/list

parent <> 

optional:
pageSize <integer> The maximum number of node pools to return. The service may return fewer than this value. If unspecified, at most 50 node pools will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
view <string> View for bare metal node pools. When `BASIC` is specified, only the node pool resource name is returned. The default/unset value `NODE_POOL_VIEW_UNSPECIFIED` is the same as `FULL', which returns the complete node pool configuration details."
  ([parent]
    (projects-locations-bareMetalClusters-bareMetalNodePools-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/bareMetalNodePools",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalClusters-bareMetalNodePools-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/bareMetalNodePools/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-bareMetalClusters-bareMetalNodePools-delete
  "Deletes a single bare metal node pool.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/bareMetalNodePools/delete

name <> 

optional:
etag <string> The current etag of the BareMetalNodePool. If an etag is provided and does not match the current etag of the node pool, deletion will be blocked and an ABORTED error will be returned.
allowMissing <boolean> If set to true, and the bare metal node pool is not found, the request will succeed but no action will be taken on the server and return a completed LRO.
validateOnly <boolean> If set, only validate the request, but do not actually delete the node pool.
ignoreErrors <boolean> If set to true, the deletion of a bare metal node pool resource will succeed even if errors occur during deletion. This parameter can be used when you want to delete GCP's node pool resource and you've already deleted the on-prem admin cluster that hosted your node pool. WARNING: Using this parameter when your user cluster still exists may result in a deleted GCP node pool but an existing on-prem node pool."
  ([name]
    (projects-locations-bareMetalClusters-bareMetalNodePools-delete
      name
      nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalClusters-bareMetalNodePools-unenroll
  "Unenrolls a bare metal node pool from Anthos On-Prem API.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/bareMetalNodePools/unenroll

name <> 

optional:
etag <string> The current etag of the bare metal node pool. If an etag is provided and does not match the current etag of node pool, deletion will be blocked and an ABORTED error will be returned.
allowMissing <boolean> If set to true, and the bare metal node pool is not found, the request will succeed but no action will be taken on the server and return a completed LRO.
validateOnly <boolean> If set, only validate the request, but do not actually unenroll the node pool."
  ([name]
    (projects-locations-bareMetalClusters-bareMetalNodePools-unenroll
      name
      nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}:unenroll",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalClusters-bareMetalNodePools-patch
  "Updates the parameters of a single bare metal node pool.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/bareMetalNodePools/patch

name <> 
BareMetalNodePool:
BareMetalNodePool

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the BareMetalNodePool resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all populated fields in the BareMetalNodePool message will be updated. Empty fields will be ignored unless a field mask is used.
allowMissing <boolean> If set to true, and the bare metal node pool is not found, the request will create a new bare metal node pool with the provided configuration. The user must have both create and update permission to call Update with allow_missing set to true.
validateOnly <boolean> Validate the request without actually doing any updates."
  ([name BareMetalNodePool]
    (projects-locations-bareMetalClusters-bareMetalNodePools-patch
      name
      BareMetalNodePool
      nil))
  ([name BareMetalNodePool optional]
    {:method :patch,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BareMetalNodePool}))

(defn projects-locations-bareMetalClusters-bareMetalNodePools-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/bareMetalNodePools/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-bareMetalClusters-bareMetalNodePools-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalClusters-bareMetalNodePools-enroll
  "Enrolls an existing bare metal node pool to the Anthos On-Prem API within a given project and location. Through enrollment, an existing node pool will become Anthos On-Prem API managed. The corresponding GCP resources will be created.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/bareMetalNodePools/enroll

parent <> 
EnrollBareMetalNodePoolRequest:
EnrollBareMetalNodePoolRequest"
  [parent EnrollBareMetalNodePoolRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+parent}/bareMetalNodePools:enroll",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body EnrollBareMetalNodePoolRequest})

(defn projects-locations-bareMetalClusters-bareMetalNodePools-create
  "Creates a new bare metal node pool in a given project, location and Bare Metal cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/bareMetalNodePools/create

parent <> 
BareMetalNodePool:
BareMetalNodePool

optional:
bareMetalNodePoolId <string> The ID to use for the node pool, which will become the final component of the node pool's resource name. This value must be up to 63 characters, and valid characters are /a-z-/. The value must not be permitted to be a UUID (or UUID-like: anything matching /^[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}$/i).
validateOnly <boolean> If set, only validate the request, but do not actually create the node pool."
  ([parent BareMetalNodePool]
    (projects-locations-bareMetalClusters-bareMetalNodePools-create
      parent
      BareMetalNodePool
      nil))
  ([parent BareMetalNodePool optional]
    {:method :post,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/bareMetalNodePools",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BareMetalNodePool}))

(defn projects-locations-bareMetalClusters-bareMetalNodePools-get
  "Gets details of a single bare metal node pool.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/bareMetalNodePools/get

name <> 

optional:
view <string> View for bare metal node pool. When `BASIC` is specified, only the node pool resource name is returned. The default/unset value `NODE_POOL_VIEW_UNSPECIFIED` is the same as `FULL', which returns the complete node pool configuration details."
  ([name]
    (projects-locations-bareMetalClusters-bareMetalNodePools-get
      name
      nil))
  ([name optional]
    {:method :get,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalClusters-bareMetalNodePools-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/bareMetalNodePools/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-bareMetalClusters-bareMetalNodePools-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/bareMetalNodePools/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-bareMetalClusters-bareMetalNodePools-operations-list
      name
      nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalClusters-bareMetalNodePools-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalClusters/bareMetalNodePools/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-vmwareClusters-list
  "Lists VMware Clusters in a given project and location.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, at most 50 clusters will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> A resource filtering expression following https://google.aip.dev/160. When non-empty, only resource's whose attributes field matches the filter are returned.
view <string> View for VMware clusters. When `BASIC` is specified, only the cluster resource name and admin cluster membership are returned. The default/unset value `CLUSTER_VIEW_UNSPECIFIED` is the same as `FULL', which returns the complete cluster configuration details.
allowMissing <boolean> Optional. If true, return list of Vmware Clusters including the ones that only exists in RMS."
  ([parent] (projects-locations-vmwareClusters-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/vmwareClusters",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareClusters-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-vmwareClusters-delete
  "Deletes a single VMware Cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/delete

name <> 

optional:
etag <string> The current etag of the VMware cluster. If an etag is provided and does not match the current etag of the cluster, deletion will be blocked and an ABORTED error will be returned.
allowMissing <boolean> If set to true, and the VMware cluster is not found, the request will succeed but no action will be taken on the server and return a completed LRO.
validateOnly <boolean> Validate the request without actually doing any updates.
force <boolean> If set to true, any node pools from the cluster will also be deleted.
ignoreErrors <boolean> If set to true, the deletion of a VMware user cluster resource will succeed even if errors occur during deletion. This parameter can be used when you want to delete GCP's cluster resource and the on-prem admin cluster that hosts your user cluster is disconnected / unreachable or deleted. WARNING: Using this parameter when your user cluster still exists may result in a deleted GCP user cluster but an existing on-prem user cluster."
  ([name] (projects-locations-vmwareClusters-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareClusters-unenroll
  "Unenrolls an existing VMware user cluster and its node pools from the Anthos On-Prem API within a given project and location. Unenrollment removes the Cloud reference to the cluster without modifying the underlying OnPrem Resources. Clusters and node pools will continue to run; however, they will no longer be accessible through the Anthos On-Prem API or UI.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/unenroll

name <> 

optional:
etag <string> The current etag of the VMware Cluster. If an etag is provided and does not match the current etag of the cluster, deletion will be blocked and an ABORTED error will be returned.
allowMissing <boolean> If set to true, and the VMware cluster is not found, the request will succeed but no action will be taken on the server and return a completed LRO.
validateOnly <boolean> Validate the request without actually doing any updates.
force <boolean> This is required if the cluster has any associated node pools. When set, any child node pools will also be unenrolled."
  ([name] (projects-locations-vmwareClusters-unenroll name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}:unenroll",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareClusters-patch
  "Updates the parameters of a single VMware cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/patch

name <> 
VmwareCluster:
VmwareCluster

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the VMwareCluster resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all populated fields in the VmwareCluster message will be updated. Empty fields will be ignored unless a field mask is used.
validateOnly <boolean> Validate the request without actually doing any updates."
  ([name VmwareCluster]
    (projects-locations-vmwareClusters-patch name VmwareCluster nil))
  ([name VmwareCluster optional]
    {:method :patch,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body VmwareCluster}))

(defn projects-locations-vmwareClusters-queryVersionConfig
  "Queries the VMware user cluster version config.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/queryVersionConfig

parent <> 

optional:
createConfig.adminClusterMembership <string> The admin cluster membership. This is the full resource name of the admin cluster's fleet membership. Format: \"projects/{project}/locations/{location}/memberships/{membership}\"
createConfig.adminClusterName <string> The admin cluster resource name. This is the full resource name of the admin cluster resource. Format: \"projects/{project}/locations/{location}/vmwareAdminClusters/{vmware_admin_cluster}\"
upgradeConfig.clusterName <string> The user cluster resource name. This is the full resource name of the user cluster resource. Format: \"projects/{project}/locations/{location}/vmwareClusters/{vmware_cluster}\""
  ([parent]
    (projects-locations-vmwareClusters-queryVersionConfig parent nil))
  ([parent optional]
    {:method :post,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/vmwareClusters:queryVersionConfig",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareClusters-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-vmwareClusters-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareClusters-enroll
  "Enrolls an existing VMware user cluster and its node pools to the Anthos On-Prem API within a given project and location. Through enrollment, an existing cluster will become Anthos On-Prem API managed. The corresponding GCP resources will be created and all future modifications to the cluster and/or its node pools will be expected to be performed through the API.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/enroll

parent <> 
EnrollVmwareClusterRequest:
EnrollVmwareClusterRequest"
  [parent EnrollVmwareClusterRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+parent}/vmwareClusters:enroll",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body EnrollVmwareClusterRequest})

(defn projects-locations-vmwareClusters-create
  "Creates a new VMware user cluster in a given project and location.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/create

parent <> 
VmwareCluster:
VmwareCluster

optional:
vmwareClusterId <string> User provided identifier that is used as part of the resource name; This value must be up to 40 characters and follow RFC-1123 (https://tools.ietf.org/html/rfc1123) format.
validateOnly <boolean> Validate the request without actually doing any updates.
allowPreflightFailure <boolean> Optional. If set to true, CLM will force CCFE to persist the cluster resource in RMS when the creation fails during standalone preflight checks. In that case the subsequent create call will fail with \"cluster already exists\" error and hence a update cluster is required to fix the cluster."
  ([parent VmwareCluster]
    (projects-locations-vmwareClusters-create
      parent
      VmwareCluster
      nil))
  ([parent VmwareCluster optional]
    {:method :post,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/vmwareClusters",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body VmwareCluster}))

(defn projects-locations-vmwareClusters-get
  "Gets details of a single VMware Cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/get

name <> 

optional:
view <string> View for VMware user cluster. When `BASIC` is specified, only the cluster resource name and admin cluster membership are returned. The default/unset value `CLUSTER_VIEW_UNSPECIFIED` is the same as `FULL', which returns the complete cluster configuration details.
allowMissing <boolean> Optional. If true, return Vmware Cluster including the one that only exists in RMS."
  ([name] (projects-locations-vmwareClusters-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareClusters-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-vmwareClusters-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-vmwareClusters-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareClusters-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-vmwareClusters-vmwareNodePools-list
  "Lists VMware node pools in a given project, location and VMWare cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/vmwareNodePools/list

parent <> 

optional:
pageSize <integer> The maximum number of node pools to return. The service may return fewer than this value. If unspecified, at most 50 node pools will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
view <string> View for VMware node pools. When `BASIC` is specified, only the node pool resource name is returned. The default/unset value `NODE_POOL_VIEW_UNSPECIFIED` is the same as `FULL', which returns the complete node pool configuration details."
  ([parent]
    (projects-locations-vmwareClusters-vmwareNodePools-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/vmwareNodePools",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareClusters-vmwareNodePools-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/vmwareNodePools/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-vmwareClusters-vmwareNodePools-delete
  "Deletes a single VMware node pool.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/vmwareNodePools/delete

name <> 

optional:
etag <string> The current etag of the VmwareNodePool. If an etag is provided and does not match the current etag of the node pool, deletion will be blocked and an ABORTED error will be returned.
allowMissing <boolean> If set to true, and the VMware node pool is not found, the request will succeed but no action will be taken on the server and return a completed LRO.
validateOnly <boolean> If set, only validate the request, but do not actually delete the node pool.
ignoreErrors <boolean> If set to true, the deletion of a VMware node pool resource will succeed even if errors occur during deletion. This parameter can be used when you want to delete GCP's node pool resource and you've already deleted the on-prem admin cluster that hosted your node pool. WARNING: Using this parameter when your user cluster still exists may result in a deleted GCP node pool but an existing on-prem node pool."
  ([name]
    (projects-locations-vmwareClusters-vmwareNodePools-delete
      name
      nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareClusters-vmwareNodePools-unenroll
  "Unenrolls a VMware node pool to Anthos On-Prem API
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/vmwareNodePools/unenroll

name <> 

optional:
etag <string> The current etag of the VMware node pool. If an etag is provided and does not match the current etag of node pool, deletion will be blocked and an ABORTED error will be returned.
allowMissing <boolean> If set to true, and the VMware node pool is not found, the request will succeed but no action will be taken on the server and return a completed LRO.
validateOnly <boolean> If set, only validate the request, but do not actually unenroll the node pool."
  ([name]
    (projects-locations-vmwareClusters-vmwareNodePools-unenroll
      name
      nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}:unenroll",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareClusters-vmwareNodePools-patch
  "Updates the parameters of a single VMware node pool.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/vmwareNodePools/patch

name <> 
VmwareNodePool:
VmwareNodePool

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the VMwareNodePool resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all populated fields in the VMwareNodePool message will be updated. Empty fields will be ignored unless a field mask is used.
validateOnly <boolean> Validate the request without actually doing any updates."
  ([name VmwareNodePool]
    (projects-locations-vmwareClusters-vmwareNodePools-patch
      name
      VmwareNodePool
      nil))
  ([name VmwareNodePool optional]
    {:method :patch,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body VmwareNodePool}))

(defn projects-locations-vmwareClusters-vmwareNodePools-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/vmwareNodePools/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-vmwareClusters-vmwareNodePools-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareClusters-vmwareNodePools-enroll
  "Enrolls a VMware node pool to Anthos On-Prem API
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/vmwareNodePools/enroll

parent <> 
EnrollVmwareNodePoolRequest:
EnrollVmwareNodePoolRequest"
  [parent EnrollVmwareNodePoolRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+parent}/vmwareNodePools:enroll",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body EnrollVmwareNodePoolRequest})

(defn projects-locations-vmwareClusters-vmwareNodePools-create
  "Creates a new VMware node pool in a given project, location and VMWare cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/vmwareNodePools/create

parent <> 
VmwareNodePool:
VmwareNodePool

optional:
vmwareNodePoolId <string> The ID to use for the node pool, which will become the final component of the node pool's resource name. This value must be up to 40 characters and follow RFC-1123 (https://tools.ietf.org/html/rfc1123) format. The value must not be permitted to be a UUID (or UUID-like: anything matching /^[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}$/i).
validateOnly <boolean> If set, only validate the request, but do not actually create the node pool."
  ([parent VmwareNodePool]
    (projects-locations-vmwareClusters-vmwareNodePools-create
      parent
      VmwareNodePool
      nil))
  ([parent VmwareNodePool optional]
    {:method :post,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/vmwareNodePools",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body VmwareNodePool}))

(defn projects-locations-vmwareClusters-vmwareNodePools-get
  "Gets details of a single VMware node pool.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/vmwareNodePools/get

name <> 

optional:
view <string> View for VMware node pool. When `BASIC` is specified, only the node pool resource name is returned. The default/unset value `NODE_POOL_VIEW_UNSPECIFIED` is the same as `FULL', which returns the complete node pool configuration details."
  ([name]
    (projects-locations-vmwareClusters-vmwareNodePools-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareClusters-vmwareNodePools-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/vmwareNodePools/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-vmwareClusters-vmwareNodePools-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/vmwareNodePools/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-vmwareClusters-vmwareNodePools-operations-list
      name
      nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareClusters-vmwareNodePools-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareClusters/vmwareNodePools/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-vmwareAdminClusters-list
  "Lists VMware admin clusters in a given project and location.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareAdminClusters/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, at most 50 clusters will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
view <string> View for VMware admin clusters. When `BASIC` is specified, only the admin cluster resource name and membership are returned. The default/unset value `CLUSTER_VIEW_UNSPECIFIED` is the same as `FULL', which returns the complete admin cluster configuration details.
allowMissing <boolean> Optional. If true, return list of Vmware Admin Clusters including the ones that only exists in RMS."
  ([parent] (projects-locations-vmwareAdminClusters-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/vmwareAdminClusters",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareAdminClusters-get
  "Gets details of a single VMware admin cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareAdminClusters/get

name <> 

optional:
view <string> View for VMware admin cluster. When `BASIC` is specified, only the cluster resource name and membership are returned. The default/unset value `CLUSTER_VIEW_UNSPECIFIED` is the same as `FULL', which returns the complete cluster configuration details.
allowMissing <boolean> Optional. If true, return Vmware Admin Cluster including the one that only exists in RMS."
  ([name] (projects-locations-vmwareAdminClusters-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareAdminClusters-enroll
  "Enrolls an existing VMware admin cluster to the Anthos On-Prem API within a given project and location. Through enrollment, an existing admin cluster will become Anthos On-Prem API managed. The corresponding GCP resources will be created and all future modifications to the cluster will be expected to be performed through the API.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareAdminClusters/enroll

parent <> 
EnrollVmwareAdminClusterRequest:
EnrollVmwareAdminClusterRequest"
  [parent EnrollVmwareAdminClusterRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+parent}/vmwareAdminClusters:enroll",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body EnrollVmwareAdminClusterRequest})

(defn projects-locations-vmwareAdminClusters-unenroll
  "Unenrolls an existing VMware admin cluster from the Anthos On-Prem API within a given project and location. Unenrollment removes the Cloud reference to the cluster without modifying the underlying OnPrem Resources. Clusters will continue to run; however, they will no longer be accessible through the Anthos On-Prem API or its clients.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareAdminClusters/unenroll

name <> 

optional:
etag <string> The current etag of the VMware admin cluster. If an etag is provided and does not match the current etag of the cluster, deletion will be blocked and an ABORTED error will be returned.
allowMissing <boolean> If set to true, and the VMware admin cluster is not found, the request will succeed but no action will be taken on the server and return a completed LRO.
validateOnly <boolean> Validate the request without actually doing any updates."
  ([name] (projects-locations-vmwareAdminClusters-unenroll name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}:unenroll",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareAdminClusters-patch
  "Updates the parameters of a single VMware admin cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareAdminClusters/patch

name <> 
VmwareAdminCluster:
VmwareAdminCluster

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the VMwareAdminCluster resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all populated fields in the VmwareAdminCluster message will be updated. Empty fields will be ignored unless a field mask is used.
validateOnly <boolean> Validate the request without actually doing any updates."
  ([name VmwareAdminCluster]
    (projects-locations-vmwareAdminClusters-patch
      name
      VmwareAdminCluster
      nil))
  ([name VmwareAdminCluster optional]
    {:method :patch,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body VmwareAdminCluster}))

(defn projects-locations-vmwareAdminClusters-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareAdminClusters/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-vmwareAdminClusters-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareAdminClusters/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-vmwareAdminClusters-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareAdminClusters-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareAdminClusters/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-vmwareAdminClusters-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareAdminClusters/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-vmwareAdminClusters-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-vmwareAdminClusters-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/vmwareAdminClusters/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-bareMetalAdminClusters-list
  "Lists bare metal admin clusters in a given project and location.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalAdminClusters/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, at most 50 clusters will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
view <string> View for bare metal admin clusters. When `BASIC` is specified, only the admin cluster resource name and membership are returned. The default/unset value `CLUSTER_VIEW_UNSPECIFIED` is the same as `FULL', which returns the complete admin cluster configuration details.
allowMissing <boolean> Optional. If true, return list of BareMetal Admin Clusters including the ones that only exists in RMS."
  ([parent]
    (projects-locations-bareMetalAdminClusters-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/bareMetalAdminClusters",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalAdminClusters-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalAdminClusters/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-bareMetalAdminClusters-unenroll
  "Unenrolls an existing bare metal admin cluster from the Anthos On-Prem API within a given project and location. Unenrollment removes the Cloud reference to the cluster without modifying the underlying OnPrem Resources. Clusters will continue to run; however, they will no longer be accessible through the Anthos On-Prem API or its clients.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalAdminClusters/unenroll

name <> 

optional:
etag <string> The current etag of the bare metal admin cluster. If an etag is provided and does not match the current etag of the cluster, deletion will be blocked and an ABORTED error will be returned.
allowMissing <boolean> If set to true, and the bare metal admin cluster is not found, the request will succeed but no action will be taken on the server and return a completed LRO.
validateOnly <boolean> Validate the request without actually doing any updates.
ignoreErrors <boolean> If set to true, the unenrollment of a bare metal admin cluster resource will succeed even if errors occur during unenrollment. This parameter can be used when you want to unenroll admin cluster resource and the on-prem admin cluster is disconnected / unreachable. WARNING: Using this parameter when your admin cluster still exists may result in a deleted GCP admin cluster but existing resourcelink in on-prem admin cluster and membership."
  ([name]
    (projects-locations-bareMetalAdminClusters-unenroll name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}:unenroll",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalAdminClusters-patch
  "Updates the parameters of a single bare metal admin cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalAdminClusters/patch

name <> 
BareMetalAdminCluster:
BareMetalAdminCluster

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the BareMetalAdminCluster resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all populated fields in the BareMetalAdminCluster message will be updated. Empty fields will be ignored unless a field mask is used.
validateOnly <boolean> Validate the request without actually doing any updates."
  ([name BareMetalAdminCluster]
    (projects-locations-bareMetalAdminClusters-patch
      name
      BareMetalAdminCluster
      nil))
  ([name BareMetalAdminCluster optional]
    {:method :patch,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BareMetalAdminCluster}))

(defn projects-locations-bareMetalAdminClusters-queryVersionConfig
  "Queries the bare metal admin cluster version config.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalAdminClusters/queryVersionConfig

parent <> 

optional:
upgradeConfig.clusterName <string> The admin cluster resource name. This is the full resource name of the admin cluster resource. Format: \"projects/{project}/locations/{location}/bareMetalAdminClusters/{bare_metal_admin_cluster}\""
  ([parent]
    (projects-locations-bareMetalAdminClusters-queryVersionConfig
      parent
      nil))
  ([parent optional]
    {:method :post,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/bareMetalAdminClusters:queryVersionConfig",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalAdminClusters-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalAdminClusters/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-bareMetalAdminClusters-getIamPolicy
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalAdminClusters-enroll
  "Enrolls an existing bare metal admin cluster to the Anthos On-Prem API within a given project and location. Through enrollment, an existing admin cluster will become Anthos On-Prem API managed. The corresponding GCP resources will be created and all future modifications to the cluster will be expected to be performed through the API.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalAdminClusters/enroll

parent <> 
EnrollBareMetalAdminClusterRequest:
EnrollBareMetalAdminClusterRequest"
  [parent EnrollBareMetalAdminClusterRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+parent}/bareMetalAdminClusters:enroll",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body EnrollBareMetalAdminClusterRequest})

(defn projects-locations-bareMetalAdminClusters-create
  "Creates a new bare metal admin cluster in a given project and location. The API needs to be combined with creating a bootstrap cluster to work. See: https://cloud.google.com/anthos/clusters/docs/bare-metal/latest/installing/creating-clusters/create-admin-cluster-api#prepare_bootstrap_environment
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalAdminClusters/create

parent <> 
BareMetalAdminCluster:
BareMetalAdminCluster

optional:
bareMetalAdminClusterId <string> Required. User provided identifier that is used as part of the resource name; must conform to RFC-1034 and additionally restrict to lower-cased letters. This comes out roughly to: /^a-z+[a-z0-9]$/
validateOnly <boolean> Validate the request without actually doing any updates.
allowPreflightFailure <boolean> Optional. If set to true, CLM will force CCFE to persist the cluster resource in RMS when the creation fails during standalone preflight checks. In that case the subsequent create call will fail with \"cluster already exists\" error and hence a update cluster is required to fix the cluster."
  ([parent BareMetalAdminCluster]
    (projects-locations-bareMetalAdminClusters-create
      parent
      BareMetalAdminCluster
      nil))
  ([parent BareMetalAdminCluster optional]
    {:method :post,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+parent}/bareMetalAdminClusters",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body BareMetalAdminCluster}))

(defn projects-locations-bareMetalAdminClusters-get
  "Gets details of a single bare metal admin cluster.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalAdminClusters/get

name <> 

optional:
view <string> View for bare metal admin cluster. When `BASIC` is specified, only the cluster resource name and membership are returned. The default/unset value `CLUSTER_VIEW_UNSPECIFIED` is the same as `FULL', which returns the complete cluster configuration details.
allowMissing <boolean> Optional. If true, return BareMetal Admin Cluster including the one that only exists in RMS."
  ([name] (projects-locations-bareMetalAdminClusters-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalAdminClusters-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalAdminClusters/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://gkeonprem.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-bareMetalAdminClusters-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalAdminClusters/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-locations-bareMetalAdminClusters-operations-list
      name
      nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://gkeonprem.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-bareMetalAdminClusters-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/kubernetes-engine/distributed-cloud/vmware/docs/v1/reference/rest/v1/projects/locations/bareMetalAdminClusters/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://gkeonprem.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})
