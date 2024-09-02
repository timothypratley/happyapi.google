(ns happyapi.google.container-v1
  "Kubernetes Engine API
Builds and manages container-based applications, powered by the open source Kubernetes technology.
See: https://cloud.google.com/kubernetes-engine"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-getServerConfig
  "Returns configuration info about the Google Kubernetes Engine service.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/getServerConfig

name <> 

optional:
projectId <string> Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
zone <string> Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) to return operations for. This field has been deprecated and replaced by the name field."
  ([name] (projects-locations-getServerConfig name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://container.googleapis.com/v1/{+name}/serverConfig",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-clusters-checkAutopilotCompatibility
  "Checks the cluster compatibility with Autopilot mode, and returns a list of compatibility issues.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/checkAutopilotCompatibility

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:checkAutopilotCompatibility",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-clusters-setLegacyAbac
  "Enables or disables the ABAC authorization mechanism on a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/setLegacyAbac

name <> 
SetLegacyAbacRequest:
SetLegacyAbacRequest"
  [name SetLegacyAbacRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:setLegacyAbac",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetLegacyAbacRequest}))

(defn projects-locations-clusters-list
  "Lists all clusters owned by a project in either the specified zone or all zones.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/list

parent <> 

optional:
projectId <string> Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the parent field.
zone <string> Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides, or \"-\" for all zones. This field has been deprecated and replaced by the parent field."
  ([parent] (projects-locations-clusters-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://container.googleapis.com/v1/{+parent}/clusters",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-clusters-setMaintenancePolicy
  "Sets the maintenance policy for a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/setMaintenancePolicy

name <> 
SetMaintenancePolicyRequest:
SetMaintenancePolicyRequest"
  [name SetMaintenancePolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:setMaintenancePolicy",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetMaintenancePolicyRequest}))

(defn projects-locations-clusters-delete
  "Deletes the cluster, including the Kubernetes endpoint and all worker nodes. Firewalls and routes that were configured during cluster creation are also deleted. Other Google Compute Engine resources that might be in use by the cluster, such as load balancer resources, are not deleted if they weren't present when the cluster was initially created.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/delete

name <> 

optional:
projectId <string> Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
zone <string> Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
clusterId <string> Deprecated. The name of the cluster to delete. This field has been deprecated and replaced by the name field."
  ([name] (projects-locations-clusters-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://container.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-clusters-setResourceLabels
  "Sets labels on a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/setResourceLabels

name <> 
SetLabelsRequest:
SetLabelsRequest"
  [name SetLabelsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:setResourceLabels",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetLabelsRequest}))

(defn projects-locations-clusters-startIpRotation
  "Starts master IP rotation.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/startIpRotation

name <> 
StartIPRotationRequest:
StartIPRotationRequest"
  [name StartIPRotationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:startIpRotation",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body StartIPRotationRequest}))

(defn projects-locations-clusters-setLocations
  "Sets the locations for a specific cluster. Deprecated. Use [projects.locations.clusters.update](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/update) instead.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/setLocations

name <> 
SetLocationsRequest:
SetLocationsRequest"
  [name SetLocationsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:setLocations",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetLocationsRequest}))

(defn projects-locations-clusters-setAddons
  "Sets the addons for a specific cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/setAddons

name <> 
SetAddonsConfigRequest:
SetAddonsConfigRequest"
  [name SetAddonsConfigRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:setAddons",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetAddonsConfigRequest}))

(defn projects-locations-clusters-update
  "Updates the settings of a specific cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/update

name <> 
UpdateClusterRequest:
UpdateClusterRequest"
  [name UpdateClusterRequest]
  (client/*api-request*
    {:method :put,
     :uri-template "https://container.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UpdateClusterRequest}))

(defn projects-locations-clusters-setMasterAuth
  "Sets master auth materials. Currently supports changing the admin password or a specific cluster, either via password generation or explicitly setting the password.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/setMasterAuth

name <> 
SetMasterAuthRequest:
SetMasterAuthRequest"
  [name SetMasterAuthRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:setMasterAuth",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetMasterAuthRequest}))

(defn projects-locations-clusters-setMonitoring
  "Sets the monitoring service for a specific cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/setMonitoring

name <> 
SetMonitoringServiceRequest:
SetMonitoringServiceRequest"
  [name SetMonitoringServiceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:setMonitoring",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetMonitoringServiceRequest}))

(defn projects-locations-clusters-getJwks
  "Gets the public component of the cluster signing keys in JSON Web Key format.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/getJwks

parent <> "
  [parent]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://container.googleapis.com/v1/{+parent}/jwks",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes nil}))

(defn projects-locations-clusters-create
  "Creates a cluster, consisting of the specified number and type of Google Compute Engine instances. By default, the cluster is created in the project's [default network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks). One firewall is added for the cluster. After cluster creation, the Kubelet creates routes for each node to allow the containers on that node to communicate with all other instances in the cluster. Finally, an entry is added to the project's global metadata indicating which CIDR range the cluster is using.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/create

parent <> 
CreateClusterRequest:
CreateClusterRequest"
  [parent CreateClusterRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+parent}/clusters",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CreateClusterRequest}))

(defn projects-locations-clusters-completeIpRotation
  "Completes master IP rotation.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/completeIpRotation

name <> 
CompleteIPRotationRequest:
CompleteIPRotationRequest"
  [name CompleteIPRotationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:completeIpRotation",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CompleteIPRotationRequest}))

(defn projects-locations-clusters-get
  "Gets the details of a specific cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/get

name <> 

optional:
projectId <string> Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
zone <string> Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
clusterId <string> Deprecated. The name of the cluster to retrieve. This field has been deprecated and replaced by the name field."
  ([name] (projects-locations-clusters-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://container.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-clusters-setLogging
  "Sets the logging service for a specific cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/setLogging

name <> 
SetLoggingServiceRequest:
SetLoggingServiceRequest"
  [name SetLoggingServiceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:setLogging",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetLoggingServiceRequest}))

(defn projects-locations-clusters-updateMaster
  "Updates the master for a specific cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/updateMaster

name <> 
UpdateMasterRequest:
UpdateMasterRequest"
  [name UpdateMasterRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:updateMaster",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UpdateMasterRequest}))

(defn projects-locations-clusters-setNetworkPolicy
  "Enables or disables Network Policy for a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/setNetworkPolicy

name <> 
SetNetworkPolicyRequest:
SetNetworkPolicyRequest"
  [name SetNetworkPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:setNetworkPolicy",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetNetworkPolicyRequest}))

(defn projects-locations-clusters-nodePools-list
  "Lists the node pools for a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/nodePools/list

parent <> 

optional:
projectId <string> Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the parent field.
zone <string> Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
clusterId <string> Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field."
  ([parent] (projects-locations-clusters-nodePools-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://container.googleapis.com/v1/{+parent}/nodePools",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-clusters-nodePools-delete
  "Deletes a node pool from a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/nodePools/delete

name <> 

optional:
projectId <string> Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
zone <string> Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
clusterId <string> Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
nodePoolId <string> Deprecated. The name of the node pool to delete. This field has been deprecated and replaced by the name field."
  ([name] (projects-locations-clusters-nodePools-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template "https://container.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-clusters-nodePools-update
  "Updates the version and/or image type for the specified node pool.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/nodePools/update

name <> 
UpdateNodePoolRequest:
UpdateNodePoolRequest"
  [name UpdateNodePoolRequest]
  (client/*api-request*
    {:method :put,
     :uri-template "https://container.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UpdateNodePoolRequest}))

(defn projects-locations-clusters-nodePools-setManagement
  "Sets the NodeManagement options for a node pool.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/nodePools/setManagement

name <> 
SetNodePoolManagementRequest:
SetNodePoolManagementRequest"
  [name SetNodePoolManagementRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:setManagement",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetNodePoolManagementRequest}))

(defn projects-locations-clusters-nodePools-completeUpgrade
  "CompleteNodePoolUpgrade will signal an on-going node pool upgrade to complete.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/nodePools/completeUpgrade

name <> 
CompleteNodePoolUpgradeRequest:
CompleteNodePoolUpgradeRequest"
  [name CompleteNodePoolUpgradeRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:completeUpgrade",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CompleteNodePoolUpgradeRequest}))

(defn projects-locations-clusters-nodePools-setAutoscaling
  "Sets the autoscaling settings for the specified node pool.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/nodePools/setAutoscaling

name <> 
SetNodePoolAutoscalingRequest:
SetNodePoolAutoscalingRequest"
  [name SetNodePoolAutoscalingRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:setAutoscaling",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetNodePoolAutoscalingRequest}))

(defn projects-locations-clusters-nodePools-setSize
  "Sets the size for a specific node pool. The new size will be used for all replicas, including future replicas created by modifying NodePool.locations.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/nodePools/setSize

name <> 
SetNodePoolSizeRequest:
SetNodePoolSizeRequest"
  [name SetNodePoolSizeRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:setSize",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetNodePoolSizeRequest}))

(defn projects-locations-clusters-nodePools-create
  "Creates a node pool for a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/nodePools/create

parent <> 
CreateNodePoolRequest:
CreateNodePoolRequest"
  [parent CreateNodePoolRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+parent}/nodePools",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CreateNodePoolRequest}))

(defn projects-locations-clusters-nodePools-rollback
  "Rolls back a previously Aborted or Failed NodePool upgrade. This makes no changes if the last upgrade successfully completed.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/nodePools/rollback

name <> 
RollbackNodePoolUpgradeRequest:
RollbackNodePoolUpgradeRequest"
  [name RollbackNodePoolUpgradeRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:rollback",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RollbackNodePoolUpgradeRequest}))

(defn projects-locations-clusters-nodePools-get
  "Retrieves the requested node pool.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/nodePools/get

name <> 

optional:
projectId <string> Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
zone <string> Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
clusterId <string> Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
nodePoolId <string> Deprecated. The name of the node pool. This field has been deprecated and replaced by the name field."
  ([name] (projects-locations-clusters-nodePools-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://container.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-clusters-well-known-getOpenid-configuration
  "Gets the OIDC discovery document for the cluster. See the [OpenID Connect Discovery 1.0 specification](https://openid.net/specs/openid-connect-discovery-1_0.html) for details.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/clusters/well-known/getOpenid-configuration

parent <> "
  [parent]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://container.googleapis.com/v1/{+parent}/.well-known/openid-configuration",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes nil}))

(defn projects-locations-operations-list
  "Lists all operations in a project in a specific zone or all zones.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/operations/list

parent <> 

optional:
projectId <string> Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the parent field.
zone <string> Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) to return operations for, or `-` for all zones. This field has been deprecated and replaced by the parent field."
  ([parent] (projects-locations-operations-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://container.googleapis.com/v1/{+parent}/operations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the specified operation.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/operations/get

name <> 

optional:
projectId <string> Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
zone <string> Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
operationId <string> Deprecated. The server-assigned `name` of the operation. This field has been deprecated and replaced by the name field."
  ([name] (projects-locations-operations-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://container.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-cancel
  "Cancels the specified operation.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-zones-getServerconfig
  "Returns configuration info about the Google Kubernetes Engine service.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/getServerconfig

projectId <> 
zone <> 

optional:
name <string> The name (project and location) of the server config to get, specified in the format `projects/*/locations/*`."
  ([projectId zone]
    (projects-zones-getServerconfig projectId zone nil))
  ([projectId zone optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/serverconfig",
       :uri-template-args {"projectId" projectId, "zone" zone},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-zones-clusters-logging
  "Sets the logging service for a specific cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/logging

projectId <> 
zone <> 
clusterId <> 
SetLoggingServiceRequest:
SetLoggingServiceRequest"
  [projectId zone clusterId SetLoggingServiceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/logging",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetLoggingServiceRequest}))

(defn projects-zones-clusters-list
  "Lists all clusters owned by a project in either the specified zone or all zones.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/list

projectId <> 
zone <> 

optional:
parent <string> The parent (project and location) where the clusters will be listed. Specified in the format `projects/*/locations/*`. Location \"-\" matches all zones and all regions."
  ([projectId zone] (projects-zones-clusters-list projectId zone nil))
  ([projectId zone optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters",
       :uri-template-args {"projectId" projectId, "zone" zone},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-zones-clusters-addons
  "Sets the addons for a specific cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/addons

projectId <> 
zone <> 
clusterId <> 
SetAddonsConfigRequest:
SetAddonsConfigRequest"
  [projectId zone clusterId SetAddonsConfigRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/addons",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetAddonsConfigRequest}))

(defn projects-zones-clusters-setMaintenancePolicy
  "Sets the maintenance policy for a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/setMaintenancePolicy

projectId <> 
zone <> 
clusterId <> 
SetMaintenancePolicyRequest:
SetMaintenancePolicyRequest"
  [projectId zone clusterId SetMaintenancePolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}:setMaintenancePolicy",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetMaintenancePolicyRequest}))

(defn projects-zones-clusters-delete
  "Deletes the cluster, including the Kubernetes endpoint and all worker nodes. Firewalls and routes that were configured during cluster creation are also deleted. Other Google Compute Engine resources that might be in use by the cluster, such as load balancer resources, are not deleted if they weren't present when the cluster was initially created.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/delete

projectId <> 
zone <> 
clusterId <> 

optional:
name <string> The name (project, location, cluster) of the cluster to delete. Specified in the format `projects/*/locations/*/clusters/*`."
  ([projectId zone clusterId]
    (projects-zones-clusters-delete projectId zone clusterId nil))
  ([projectId zone clusterId optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}",
       :uri-template-args
       {"projectId" projectId, "zone" zone, "clusterId" clusterId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-zones-clusters-startIpRotation
  "Starts master IP rotation.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/startIpRotation

projectId <> 
zone <> 
clusterId <> 
StartIPRotationRequest:
StartIPRotationRequest"
  [projectId zone clusterId StartIPRotationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}:startIpRotation",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body StartIPRotationRequest}))

(defn projects-zones-clusters-update
  "Updates the settings of a specific cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/update

projectId <> 
zone <> 
clusterId <> 
UpdateClusterRequest:
UpdateClusterRequest"
  [projectId zone clusterId UpdateClusterRequest]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UpdateClusterRequest}))

(defn projects-zones-clusters-monitoring
  "Sets the monitoring service for a specific cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/monitoring

projectId <> 
zone <> 
clusterId <> 
SetMonitoringServiceRequest:
SetMonitoringServiceRequest"
  [projectId zone clusterId SetMonitoringServiceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/monitoring",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetMonitoringServiceRequest}))

(defn projects-zones-clusters-locations
  "Sets the locations for a specific cluster. Deprecated. Use [projects.locations.clusters.update](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/update) instead.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/locations

projectId <> 
zone <> 
clusterId <> 
SetLocationsRequest:
SetLocationsRequest"
  [projectId zone clusterId SetLocationsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/locations",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetLocationsRequest}))

(defn projects-zones-clusters-setMasterAuth
  "Sets master auth materials. Currently supports changing the admin password or a specific cluster, either via password generation or explicitly setting the password.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/setMasterAuth

projectId <> 
zone <> 
clusterId <> 
SetMasterAuthRequest:
SetMasterAuthRequest"
  [projectId zone clusterId SetMasterAuthRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}:setMasterAuth",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetMasterAuthRequest}))

(defn projects-zones-clusters-legacyAbac
  "Enables or disables the ABAC authorization mechanism on a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/legacyAbac

projectId <> 
zone <> 
clusterId <> 
SetLegacyAbacRequest:
SetLegacyAbacRequest"
  [projectId zone clusterId SetLegacyAbacRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/legacyAbac",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetLegacyAbacRequest}))

(defn projects-zones-clusters-create
  "Creates a cluster, consisting of the specified number and type of Google Compute Engine instances. By default, the cluster is created in the project's [default network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks). One firewall is added for the cluster. After cluster creation, the Kubelet creates routes for each node to allow the containers on that node to communicate with all other instances in the cluster. Finally, an entry is added to the project's global metadata indicating which CIDR range the cluster is using.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/create

projectId <> 
zone <> 
CreateClusterRequest:
CreateClusterRequest"
  [projectId zone CreateClusterRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters",
     :uri-template-args {"projectId" projectId, "zone" zone},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CreateClusterRequest}))

(defn projects-zones-clusters-resourceLabels
  "Sets labels on a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/resourceLabels

projectId <> 
zone <> 
clusterId <> 
SetLabelsRequest:
SetLabelsRequest"
  [projectId zone clusterId SetLabelsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/resourceLabels",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetLabelsRequest}))

(defn projects-zones-clusters-master
  "Updates the master for a specific cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/master

projectId <> 
zone <> 
clusterId <> 
UpdateMasterRequest:
UpdateMasterRequest"
  [projectId zone clusterId UpdateMasterRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/master",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UpdateMasterRequest}))

(defn projects-zones-clusters-completeIpRotation
  "Completes master IP rotation.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/completeIpRotation

projectId <> 
zone <> 
clusterId <> 
CompleteIPRotationRequest:
CompleteIPRotationRequest"
  [projectId zone clusterId CompleteIPRotationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}:completeIpRotation",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CompleteIPRotationRequest}))

(defn projects-zones-clusters-get
  "Gets the details of a specific cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/get

projectId <> 
zone <> 
clusterId <> 

optional:
name <string> The name (project, location, cluster) of the cluster to retrieve. Specified in the format `projects/*/locations/*/clusters/*`."
  ([projectId zone clusterId]
    (projects-zones-clusters-get projectId zone clusterId nil))
  ([projectId zone clusterId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}",
       :uri-template-args
       {"projectId" projectId, "zone" zone, "clusterId" clusterId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-zones-clusters-setNetworkPolicy
  "Enables or disables Network Policy for a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/setNetworkPolicy

projectId <> 
zone <> 
clusterId <> 
SetNetworkPolicyRequest:
SetNetworkPolicyRequest"
  [projectId zone clusterId SetNetworkPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}:setNetworkPolicy",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetNetworkPolicyRequest}))

(defn projects-zones-clusters-nodePools-list
  "Lists the node pools for a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/nodePools/list

projectId <> 
zone <> 
clusterId <> 

optional:
parent <string> The parent (project, location, cluster name) where the node pools will be listed. Specified in the format `projects/*/locations/*/clusters/*`."
  ([projectId zone clusterId]
    (projects-zones-clusters-nodePools-list
      projectId
      zone
      clusterId
      nil))
  ([projectId zone clusterId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/nodePools",
       :uri-template-args
       {"projectId" projectId, "zone" zone, "clusterId" clusterId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-zones-clusters-nodePools-delete
  "Deletes a node pool from a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/nodePools/delete

projectId <> 
zone <> 
clusterId <> 
nodePoolId <> 

optional:
name <string> The name (project, location, cluster, node pool id) of the node pool to delete. Specified in the format `projects/*/locations/*/clusters/*/nodePools/*`."
  ([projectId zone clusterId nodePoolId]
    (projects-zones-clusters-nodePools-delete
      projectId
      zone
      clusterId
      nodePoolId
      nil))
  ([projectId zone clusterId nodePoolId optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/nodePools/{nodePoolId}",
       :uri-template-args
       {"projectId" projectId,
        "zone" zone,
        "clusterId" clusterId,
        "nodePoolId" nodePoolId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-zones-clusters-nodePools-update
  "Updates the version and/or image type for the specified node pool.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/nodePools/update

projectId <> 
zone <> 
clusterId <> 
nodePoolId <> 
UpdateNodePoolRequest:
UpdateNodePoolRequest"
  [projectId zone clusterId nodePoolId UpdateNodePoolRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/nodePools/{nodePoolId}/update",
     :uri-template-args
     {"projectId" projectId,
      "zone" zone,
      "clusterId" clusterId,
      "nodePoolId" nodePoolId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UpdateNodePoolRequest}))

(defn projects-zones-clusters-nodePools-setManagement
  "Sets the NodeManagement options for a node pool.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/nodePools/setManagement

projectId <> 
zone <> 
clusterId <> 
nodePoolId <> 
SetNodePoolManagementRequest:
SetNodePoolManagementRequest"
  [projectId zone clusterId nodePoolId SetNodePoolManagementRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/nodePools/{nodePoolId}/setManagement",
     :uri-template-args
     {"projectId" projectId,
      "zone" zone,
      "clusterId" clusterId,
      "nodePoolId" nodePoolId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetNodePoolManagementRequest}))

(defn projects-zones-clusters-nodePools-setSize
  "Sets the size for a specific node pool. The new size will be used for all replicas, including future replicas created by modifying NodePool.locations.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/nodePools/setSize

projectId <> 
zone <> 
clusterId <> 
nodePoolId <> 
SetNodePoolSizeRequest:
SetNodePoolSizeRequest"
  [projectId zone clusterId nodePoolId SetNodePoolSizeRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/nodePools/{nodePoolId}/setSize",
     :uri-template-args
     {"projectId" projectId,
      "zone" zone,
      "clusterId" clusterId,
      "nodePoolId" nodePoolId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetNodePoolSizeRequest}))

(defn projects-zones-clusters-nodePools-create
  "Creates a node pool for a cluster.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/nodePools/create

projectId <> 
zone <> 
clusterId <> 
CreateNodePoolRequest:
CreateNodePoolRequest"
  [projectId zone clusterId CreateNodePoolRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/nodePools",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "clusterId" clusterId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CreateNodePoolRequest}))

(defn projects-zones-clusters-nodePools-rollback
  "Rolls back a previously Aborted or Failed NodePool upgrade. This makes no changes if the last upgrade successfully completed.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/nodePools/rollback

projectId <> 
zone <> 
clusterId <> 
nodePoolId <> 
RollbackNodePoolUpgradeRequest:
RollbackNodePoolUpgradeRequest"
  [projectId zone clusterId nodePoolId RollbackNodePoolUpgradeRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/nodePools/{nodePoolId}:rollback",
     :uri-template-args
     {"projectId" projectId,
      "zone" zone,
      "clusterId" clusterId,
      "nodePoolId" nodePoolId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RollbackNodePoolUpgradeRequest}))

(defn projects-zones-clusters-nodePools-get
  "Retrieves the requested node pool.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/nodePools/get

projectId <> 
zone <> 
clusterId <> 
nodePoolId <> 

optional:
name <string> The name (project, location, cluster, node pool id) of the node pool to get. Specified in the format `projects/*/locations/*/clusters/*/nodePools/*`."
  ([projectId zone clusterId nodePoolId]
    (projects-zones-clusters-nodePools-get
      projectId
      zone
      clusterId
      nodePoolId
      nil))
  ([projectId zone clusterId nodePoolId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/nodePools/{nodePoolId}",
       :uri-template-args
       {"projectId" projectId,
        "zone" zone,
        "clusterId" clusterId,
        "nodePoolId" nodePoolId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-zones-clusters-nodePools-autoscaling
  "Sets the autoscaling settings for the specified node pool.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/clusters/nodePools/autoscaling

projectId <> 
zone <> 
clusterId <> 
nodePoolId <> 
SetNodePoolAutoscalingRequest:
SetNodePoolAutoscalingRequest"
  [projectId zone clusterId nodePoolId SetNodePoolAutoscalingRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/clusters/{clusterId}/nodePools/{nodePoolId}/autoscaling",
     :uri-template-args
     {"projectId" projectId,
      "zone" zone,
      "clusterId" clusterId,
      "nodePoolId" nodePoolId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetNodePoolAutoscalingRequest}))

(defn projects-zones-operations-list
  "Lists all operations in a project in a specific zone or all zones.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/operations/list

projectId <> 
zone <> 

optional:
parent <string> The parent (project and location) where the operations will be listed. Specified in the format `projects/*/locations/*`. Location \"-\" matches all zones and all regions."
  ([projectId zone]
    (projects-zones-operations-list projectId zone nil))
  ([projectId zone optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/operations",
       :uri-template-args {"projectId" projectId, "zone" zone},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-zones-operations-get
  "Gets the specified operation.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/operations/get

projectId <> 
zone <> 
operationId <> 

optional:
name <string> The name (project, location, operation id) of the operation to get. Specified in the format `projects/*/locations/*/operations/*`."
  ([projectId zone operationId]
    (projects-zones-operations-get projectId zone operationId nil))
  ([projectId zone operationId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/operations/{operationId}",
       :uri-template-args
       {"projectId" projectId, "zone" zone, "operationId" operationId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-zones-operations-cancel
  "Cancels the specified operation.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/zones/operations/cancel

projectId <> 
zone <> 
operationId <> 
CancelOperationRequest:
CancelOperationRequest"
  [projectId zone operationId CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://container.googleapis.com/v1/projects/{projectId}/zones/{zone}/operations/{operationId}:cancel",
     :uri-template-args
     {"projectId" projectId, "zone" zone, "operationId" operationId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-aggregated-usableSubnetworks-list
  "Lists subnetworks that are usable for creating clusters in a project.
https://cloud.google.com/kubernetes-engine/v1/reference/rest/v1/projects/aggregated/usableSubnetworks/list

parent <> 

optional:
filter <string> Filtering currently only supports equality on the networkProjectId and must be in the form: \"networkProjectId=[PROJECTID]\", where `networkProjectId` is the project which owns the listed subnetworks. This defaults to the parent project ID.
pageSize <integer> The max number of results per page that should be returned. If the number of available results is larger than `page_size`, a `next_page_token` is returned which can be used to get the next page of results in subsequent requests. Acceptable values are 0 to 500, inclusive. (Default: 500)"
  ([parent] (projects-aggregated-usableSubnetworks-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://container.googleapis.com/v1/{+parent}/aggregated/usableSubnetworks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
