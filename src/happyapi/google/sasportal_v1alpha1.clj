(ns happyapi.google.sasportal-v1alpha1
  "SAS Portal API

See: https://developers.google.com/spectrum-access-system/"
  (:require [happyapi.providers.google :as client]))

(defn customers-list
  "Returns a list of requested customers.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/list

optional:
pageSize <integer> The maximum number of customers to return in the response."
  ([] (customers-list nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/customers",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn customers-patch
  "Updates an existing customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/patch

name <> 
SasPortalCustomer:
SasPortalCustomer

optional:
updateMask <string> Fields to be updated."
  ([name SasPortalCustomer]
    (customers-patch name SasPortalCustomer nil))
  ([name SasPortalCustomer optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"],
       :body SasPortalCustomer})))

(defn customers-migrateOrganization
  "Migrates a SAS organization to the cloud. This will create GCP projects for each deployment and associate them. The SAS Organization is linked to the gcp project that called the command. go/sas-legacy-customer-migration
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/migrateOrganization

SasPortalMigrateOrganizationRequest:
SasPortalMigrateOrganizationRequest"
  [SasPortalMigrateOrganizationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/customers:migrateOrganization",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalMigrateOrganizationRequest}))

(defn customers-setupSasAnalytics
  "Setups the a GCP Project to receive SAS Analytics messages via GCP Pub/Sub with a subscription to BigQuery. All the Pub/Sub topics and BigQuery tables are created automatically as part of this service.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/setupSasAnalytics

SasPortalSetupSasAnalyticsRequest:
SasPortalSetupSasAnalyticsRequest"
  [SasPortalSetupSasAnalyticsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/customers:setupSasAnalytics",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalSetupSasAnalyticsRequest}))

(defn customers-listLegacyOrganizations
  "Returns a list of legacy organizations.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/listLegacyOrganizations"
  []
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/customers:listLegacyOrganizations",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn customers-get
  "Returns a requested customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn customers-provisionDeployment
  "Creates a new SAS deployment through the GCP workflow. Creates a SAS organization if an organization match is not found.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/provisionDeployment

SasPortalProvisionDeploymentRequest:
SasPortalProvisionDeploymentRequest"
  [SasPortalProvisionDeploymentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/customers:provisionDeployment",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalProvisionDeploymentRequest}))

(defn customers-listGcpProjectDeployments
  "Returns a list of SAS deployments associated with current GCP project. Includes whether SAS analytics has been enabled or not.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/listGcpProjectDeployments"
  []
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/customers:listGcpProjectDeployments",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn customers-nodes-delete
  "Deletes a node.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/nodes/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn customers-nodes-get
  "Returns a requested node.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/nodes/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn customers-nodes-move
  "Moves a node under another node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/nodes/move

name <> 
SasPortalMoveNodeRequest:
SasPortalMoveNodeRequest"
  [name SasPortalMoveNodeRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+name}:move",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalMoveNodeRequest}))

(defn customers-nodes-list
  "Lists nodes.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/nodes/list

parent <> 

optional:
filter <string> The filter expression. The filter should have the following format: \"DIRECT_CHILDREN\" or format: \"direct_children\". The filter is case insensitive. If empty, then no nodes are filtered.
pageSize <integer> The maximum number of nodes to return in the response."
  ([parent] (customers-nodes-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/nodes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn customers-nodes-patch
  "Updates an existing node.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/nodes/patch

name <> 
SasPortalNode:
SasPortalNode

optional:
updateMask <string> Fields to be updated."
  ([name SasPortalNode] (customers-nodes-patch name SasPortalNode nil))
  ([name SasPortalNode optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"],
       :body SasPortalNode})))

(defn customers-nodes-create
  "Creates a new node.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/nodes/create

parent <> 
SasPortalNode:
SasPortalNode"
  [parent SasPortalNode]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/nodes",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalNode}))

(defn customers-nodes-devices-create
  "Creates a device under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/nodes/devices/create

parent <> 
SasPortalDevice:
SasPortalDevice"
  [parent SasPortalDevice]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalDevice}))

(defn customers-nodes-devices-list
  "Lists devices under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/nodes/devices/list

parent <> 

optional:
pageSize <integer> The maximum number of devices to return in the response. If empty or zero, all devices will be listed. Must be in the range [0, 1000].
filter <string> The filter expression. The filter should have one of the following formats: \"sn=123454\" or \"display_name=MyDevice\". sn corresponds to serial number of the device. The filter is case insensitive."
  ([parent] (customers-nodes-devices-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn customers-nodes-devices-createSigned
  "Creates a signed device under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/nodes/devices/createSigned

parent <> 
SasPortalCreateSignedDeviceRequest:
SasPortalCreateSignedDeviceRequest"
  [parent SasPortalCreateSignedDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices:createSigned",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalCreateSignedDeviceRequest}))

(defn customers-nodes-deployments-create
  "Creates a new deployment.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/nodes/deployments/create

parent <> 
SasPortalDeployment:
SasPortalDeployment"
  [parent SasPortalDeployment]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/deployments",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalDeployment}))

(defn customers-nodes-deployments-list
  "Lists deployments.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/nodes/deployments/list

parent <> 

optional:
pageSize <integer> The maximum number of deployments to return in the response.
filter <string> The filter expression. The filter should have the following format: \"DIRECT_CHILDREN\" or format: \"direct_children\". The filter is case insensitive. If empty, then no deployments are filtered."
  ([parent] (customers-nodes-deployments-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/deployments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn customers-nodes-nodes-list
  "Lists nodes.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/nodes/nodes/list

parent <> 

optional:
pageSize <integer> The maximum number of nodes to return in the response.
filter <string> The filter expression. The filter should have the following format: \"DIRECT_CHILDREN\" or format: \"direct_children\". The filter is case insensitive. If empty, then no nodes are filtered."
  ([parent] (customers-nodes-nodes-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/nodes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn customers-nodes-nodes-create
  "Creates a new node.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/nodes/nodes/create

parent <> 
SasPortalNode:
SasPortalNode"
  [parent SasPortalNode]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/nodes",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalNode}))

(defn customers-devices-list
  "Lists devices under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/devices/list

parent <> 

optional:
pageSize <integer> The maximum number of devices to return in the response. If empty or zero, all devices will be listed. Must be in the range [0, 1000].
filter <string> The filter expression. The filter should have one of the following formats: \"sn=123454\" or \"display_name=MyDevice\". sn corresponds to serial number of the device. The filter is case insensitive."
  ([parent] (customers-devices-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn customers-devices-delete
  "Deletes a device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/devices/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn customers-devices-signDevice
  "Signs a device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/devices/signDevice

name <> 
SasPortalSignDeviceRequest:
SasPortalSignDeviceRequest"
  [name SasPortalSignDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+name}:signDevice",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalSignDeviceRequest}))

(defn customers-devices-updateSigned
  "Updates a signed device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/devices/updateSigned

name <> 
SasPortalUpdateSignedDeviceRequest:
SasPortalUpdateSignedDeviceRequest"
  [name SasPortalUpdateSignedDeviceRequest]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+name}:updateSigned",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalUpdateSignedDeviceRequest}))

(defn customers-devices-patch
  "Updates a device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/devices/patch

name <> 
SasPortalDevice:
SasPortalDevice

optional:
updateMask <string> Fields to be updated."
  ([name SasPortalDevice]
    (customers-devices-patch name SasPortalDevice nil))
  ([name SasPortalDevice optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"],
       :body SasPortalDevice})))

(defn customers-devices-move
  "Moves a device under another node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/devices/move

name <> 
SasPortalMoveDeviceRequest:
SasPortalMoveDeviceRequest"
  [name SasPortalMoveDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+name}:move",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalMoveDeviceRequest}))

(defn customers-devices-create
  "Creates a device under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/devices/create

parent <> 
SasPortalDevice:
SasPortalDevice"
  [parent SasPortalDevice]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalDevice}))

(defn customers-devices-createSigned
  "Creates a signed device under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/devices/createSigned

parent <> 
SasPortalCreateSignedDeviceRequest:
SasPortalCreateSignedDeviceRequest"
  [parent SasPortalCreateSignedDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices:createSigned",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalCreateSignedDeviceRequest}))

(defn customers-devices-get
  "Gets details about a device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/devices/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn customers-deployments-create
  "Creates a new deployment.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/deployments/create

parent <> 
SasPortalDeployment:
SasPortalDeployment"
  [parent SasPortalDeployment]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/deployments",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalDeployment}))

(defn customers-deployments-list
  "Lists deployments.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/deployments/list

parent <> 

optional:
pageSize <integer> The maximum number of deployments to return in the response.
filter <string> The filter expression. The filter should have the following format: \"DIRECT_CHILDREN\" or format: \"direct_children\". The filter is case insensitive. If empty, then no deployments are filtered."
  ([parent] (customers-deployments-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/deployments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn customers-deployments-patch
  "Updates an existing deployment.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/deployments/patch

name <> 
SasPortalDeployment:
SasPortalDeployment

optional:
updateMask <string> Fields to be updated."
  ([name SasPortalDeployment]
    (customers-deployments-patch name SasPortalDeployment nil))
  ([name SasPortalDeployment optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"],
       :body SasPortalDeployment})))

(defn customers-deployments-move
  "Moves a deployment under another node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/deployments/move

name <> 
SasPortalMoveDeploymentRequest:
SasPortalMoveDeploymentRequest"
  [name SasPortalMoveDeploymentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+name}:move",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalMoveDeploymentRequest}))

(defn customers-deployments-delete
  "Deletes a deployment.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/deployments/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn customers-deployments-get
  "Returns a requested deployment.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/deployments/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn customers-deployments-devices-createSigned
  "Creates a signed device under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/deployments/devices/createSigned

parent <> 
SasPortalCreateSignedDeviceRequest:
SasPortalCreateSignedDeviceRequest"
  [parent SasPortalCreateSignedDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices:createSigned",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalCreateSignedDeviceRequest}))

(defn customers-deployments-devices-list
  "Lists devices under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/deployments/devices/list

parent <> 

optional:
pageSize <integer> The maximum number of devices to return in the response. If empty or zero, all devices will be listed. Must be in the range [0, 1000].
filter <string> The filter expression. The filter should have one of the following formats: \"sn=123454\" or \"display_name=MyDevice\". sn corresponds to serial number of the device. The filter is case insensitive."
  ([parent] (customers-deployments-devices-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn customers-deployments-devices-create
  "Creates a device under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/customers/deployments/devices/create

parent <> 
SasPortalDevice:
SasPortalDevice"
  [parent SasPortalDevice]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalDevice}))

(defn deployments-get
  "Returns a requested deployment.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/deployments/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn deployments-devices-patch
  "Updates a device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/deployments/devices/patch

name <> 
SasPortalDevice:
SasPortalDevice

optional:
updateMask <string> Fields to be updated."
  ([name SasPortalDevice]
    (deployments-devices-patch name SasPortalDevice nil))
  ([name SasPortalDevice optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"],
       :body SasPortalDevice})))

(defn deployments-devices-move
  "Moves a device under another node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/deployments/devices/move

name <> 
SasPortalMoveDeviceRequest:
SasPortalMoveDeviceRequest"
  [name SasPortalMoveDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+name}:move",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalMoveDeviceRequest}))

(defn deployments-devices-get
  "Gets details about a device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/deployments/devices/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn deployments-devices-delete
  "Deletes a device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/deployments/devices/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn deployments-devices-signDevice
  "Signs a device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/deployments/devices/signDevice

name <> 
SasPortalSignDeviceRequest:
SasPortalSignDeviceRequest"
  [name SasPortalSignDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+name}:signDevice",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalSignDeviceRequest}))

(defn deployments-devices-updateSigned
  "Updates a signed device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/deployments/devices/updateSigned

name <> 
SasPortalUpdateSignedDeviceRequest:
SasPortalUpdateSignedDeviceRequest"
  [name SasPortalUpdateSignedDeviceRequest]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+name}:updateSigned",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalUpdateSignedDeviceRequest}))

(defn policies-set
  "Sets the access control policy on the specified resource. Replaces any existing policy.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/policies/set

SasPortalSetPolicyRequest:
SasPortalSetPolicyRequest"
  [SasPortalSetPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/policies:set",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalSetPolicyRequest}))

(defn policies-test
  "Returns permissions that a caller has on the specified resource.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/policies/test

SasPortalTestPermissionsRequest:
SasPortalTestPermissionsRequest"
  [SasPortalTestPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/policies:test",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalTestPermissionsRequest}))

(defn policies-get
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/policies/get

SasPortalGetPolicyRequest:
SasPortalGetPolicyRequest"
  [SasPortalGetPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/policies:get",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalGetPolicyRequest}))

(defn nodes-get
  "Returns a requested node.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn nodes-nodes-get
  "Returns a requested node.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/nodes/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn nodes-nodes-delete
  "Deletes a node.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/nodes/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn nodes-nodes-list
  "Lists nodes.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/nodes/list

parent <> 

optional:
pageSize <integer> The maximum number of nodes to return in the response.
filter <string> The filter expression. The filter should have the following format: \"DIRECT_CHILDREN\" or format: \"direct_children\". The filter is case insensitive. If empty, then no nodes are filtered."
  ([parent] (nodes-nodes-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/nodes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn nodes-nodes-move
  "Moves a node under another node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/nodes/move

name <> 
SasPortalMoveNodeRequest:
SasPortalMoveNodeRequest"
  [name SasPortalMoveNodeRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+name}:move",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalMoveNodeRequest}))

(defn nodes-nodes-create
  "Creates a new node.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/nodes/create

parent <> 
SasPortalNode:
SasPortalNode"
  [parent SasPortalNode]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/nodes",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalNode}))

(defn nodes-nodes-patch
  "Updates an existing node.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/nodes/patch

name <> 
SasPortalNode:
SasPortalNode

optional:
updateMask <string> Fields to be updated."
  ([name SasPortalNode] (nodes-nodes-patch name SasPortalNode nil))
  ([name SasPortalNode optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"],
       :body SasPortalNode})))

(defn nodes-nodes-deployments-create
  "Creates a new deployment.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/nodes/deployments/create

parent <> 
SasPortalDeployment:
SasPortalDeployment"
  [parent SasPortalDeployment]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/deployments",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalDeployment}))

(defn nodes-nodes-deployments-list
  "Lists deployments.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/nodes/deployments/list

parent <> 

optional:
filter <string> The filter expression. The filter should have the following format: \"DIRECT_CHILDREN\" or format: \"direct_children\". The filter is case insensitive. If empty, then no deployments are filtered.
pageSize <integer> The maximum number of deployments to return in the response."
  ([parent] (nodes-nodes-deployments-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/deployments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn nodes-nodes-nodes-create
  "Creates a new node.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/nodes/nodes/create

parent <> 
SasPortalNode:
SasPortalNode"
  [parent SasPortalNode]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/nodes",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalNode}))

(defn nodes-nodes-nodes-list
  "Lists nodes.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/nodes/nodes/list

parent <> 

optional:
filter <string> The filter expression. The filter should have the following format: \"DIRECT_CHILDREN\" or format: \"direct_children\". The filter is case insensitive. If empty, then no nodes are filtered.
pageSize <integer> The maximum number of nodes to return in the response."
  ([parent] (nodes-nodes-nodes-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/nodes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn nodes-nodes-devices-createSigned
  "Creates a signed device under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/nodes/devices/createSigned

parent <> 
SasPortalCreateSignedDeviceRequest:
SasPortalCreateSignedDeviceRequest"
  [parent SasPortalCreateSignedDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices:createSigned",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalCreateSignedDeviceRequest}))

(defn nodes-nodes-devices-list
  "Lists devices under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/nodes/devices/list

parent <> 

optional:
filter <string> The filter expression. The filter should have one of the following formats: \"sn=123454\" or \"display_name=MyDevice\". sn corresponds to serial number of the device. The filter is case insensitive.
pageSize <integer> The maximum number of devices to return in the response. If empty or zero, all devices will be listed. Must be in the range [0, 1000]."
  ([parent] (nodes-nodes-devices-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn nodes-nodes-devices-create
  "Creates a device under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/nodes/devices/create

parent <> 
SasPortalDevice:
SasPortalDevice"
  [parent SasPortalDevice]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalDevice}))

(defn nodes-devices-list
  "Lists devices under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/devices/list

parent <> 

optional:
filter <string> The filter expression. The filter should have one of the following formats: \"sn=123454\" or \"display_name=MyDevice\". sn corresponds to serial number of the device. The filter is case insensitive.
pageSize <integer> The maximum number of devices to return in the response. If empty or zero, all devices will be listed. Must be in the range [0, 1000]."
  ([parent] (nodes-devices-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn nodes-devices-delete
  "Deletes a device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/devices/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn nodes-devices-signDevice
  "Signs a device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/devices/signDevice

name <> 
SasPortalSignDeviceRequest:
SasPortalSignDeviceRequest"
  [name SasPortalSignDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+name}:signDevice",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalSignDeviceRequest}))

(defn nodes-devices-updateSigned
  "Updates a signed device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/devices/updateSigned

name <> 
SasPortalUpdateSignedDeviceRequest:
SasPortalUpdateSignedDeviceRequest"
  [name SasPortalUpdateSignedDeviceRequest]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+name}:updateSigned",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalUpdateSignedDeviceRequest}))

(defn nodes-devices-patch
  "Updates a device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/devices/patch

name <> 
SasPortalDevice:
SasPortalDevice

optional:
updateMask <string> Fields to be updated."
  ([name SasPortalDevice]
    (nodes-devices-patch name SasPortalDevice nil))
  ([name SasPortalDevice optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"],
       :body SasPortalDevice})))

(defn nodes-devices-move
  "Moves a device under another node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/devices/move

name <> 
SasPortalMoveDeviceRequest:
SasPortalMoveDeviceRequest"
  [name SasPortalMoveDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+name}:move",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalMoveDeviceRequest}))

(defn nodes-devices-create
  "Creates a device under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/devices/create

parent <> 
SasPortalDevice:
SasPortalDevice"
  [parent SasPortalDevice]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalDevice}))

(defn nodes-devices-createSigned
  "Creates a signed device under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/devices/createSigned

parent <> 
SasPortalCreateSignedDeviceRequest:
SasPortalCreateSignedDeviceRequest"
  [parent SasPortalCreateSignedDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices:createSigned",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalCreateSignedDeviceRequest}))

(defn nodes-devices-get
  "Gets details about a device.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/devices/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn nodes-deployments-delete
  "Deletes a deployment.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/deployments/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn nodes-deployments-get
  "Returns a requested deployment.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/deployments/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://sasportal.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"]}))

(defn nodes-deployments-list
  "Lists deployments.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/deployments/list

parent <> 

optional:
filter <string> The filter expression. The filter should have the following format: \"DIRECT_CHILDREN\" or format: \"direct_children\". The filter is case insensitive. If empty, then no deployments are filtered.
pageSize <integer> The maximum number of deployments to return in the response."
  ([parent] (nodes-deployments-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/deployments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn nodes-deployments-patch
  "Updates an existing deployment.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/deployments/patch

name <> 
SasPortalDeployment:
SasPortalDeployment

optional:
updateMask <string> Fields to be updated."
  ([name SasPortalDeployment]
    (nodes-deployments-patch name SasPortalDeployment nil))
  ([name SasPortalDeployment optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"],
       :body SasPortalDeployment})))

(defn nodes-deployments-move
  "Moves a deployment under another node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/deployments/move

name <> 
SasPortalMoveDeploymentRequest:
SasPortalMoveDeploymentRequest"
  [name SasPortalMoveDeploymentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+name}:move",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalMoveDeploymentRequest}))

(defn nodes-deployments-devices-createSigned
  "Creates a signed device under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/deployments/devices/createSigned

parent <> 
SasPortalCreateSignedDeviceRequest:
SasPortalCreateSignedDeviceRequest"
  [parent SasPortalCreateSignedDeviceRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices:createSigned",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalCreateSignedDeviceRequest}))

(defn nodes-deployments-devices-create
  "Creates a device under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/deployments/devices/create

parent <> 
SasPortalDevice:
SasPortalDevice"
  [parent SasPortalDevice]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalDevice}))

(defn nodes-deployments-devices-list
  "Lists devices under a node or customer.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/nodes/deployments/devices/list

parent <> 

optional:
filter <string> The filter expression. The filter should have one of the following formats: \"sn=123454\" or \"display_name=MyDevice\". sn corresponds to serial number of the device. The filter is case insensitive.
pageSize <integer> The maximum number of devices to return in the response. If empty or zero, all devices will be listed. Must be in the range [0, 1000]."
  ([parent] (nodes-deployments-devices-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sasportal.googleapis.com/v1alpha1/{+parent}/devices",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sasportal"]})))

(defn installer-validate
  "Validates the identity of a Certified Professional Installer (CPI).
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/installer/validate

SasPortalValidateInstallerRequest:
SasPortalValidateInstallerRequest"
  [SasPortalValidateInstallerRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/installer:validate",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalValidateInstallerRequest}))

(defn installer-generateSecret
  "Generates a secret to be used with the ValidateInstaller.
https://developers.google.com/spectrum-access-system/v1alpha1/reference/rest/v1alpha1/installer/generateSecret

SasPortalGenerateSecretRequest:
SasPortalGenerateSecretRequest"
  [SasPortalGenerateSecretRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sasportal.googleapis.com/v1alpha1/installer:generateSecret",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sasportal"],
     :body SasPortalGenerateSecretRequest}))
