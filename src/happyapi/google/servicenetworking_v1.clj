(ns happyapi.google.servicenetworking-v1
  "Service Networking API
Provides automatic management of network configurations necessary for certain services.
See: https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started")

(defn operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://servicenetworking.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"]}))

(defn operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://servicenetworking.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"]})

(defn operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body CancelOperationRequest})

(defn operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://servicenetworking.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"]})

(defn services-validate
  "Service producers use this method to validate if the consumer provided network, project and requested range are valid. This allows them to use a fail-fast mechanism for consumer requests, and not have to wait for AddSubnetwork operation completion to determine if user request is invalid.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/validate

parent <> 
ValidateConsumerConfigRequest:
ValidateConsumerConfigRequest"
  [parent ValidateConsumerConfigRequest]
  {:method :post,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}:validate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body ValidateConsumerConfigRequest})

(defn services-searchRange
  "Service producers can use this method to find a currently unused range within consumer allocated ranges. This returned range is not reserved, and not guaranteed to remain unused. It will validate previously provided allocated ranges, find non-conflicting sub-range of requested size (expressed in number of leading bits of ipv4 network mask, as in CIDR range notation).
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/searchRange

parent <> 
SearchRangeRequest:
SearchRangeRequest"
  [parent SearchRangeRequest]
  {:method :post,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}:searchRange",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body SearchRangeRequest})

(defn services-disableVpcServiceControls
  "Disables VPC service controls for a connection.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/disableVpcServiceControls

parent <> 
DisableVpcServiceControlsRequest:
DisableVpcServiceControlsRequest"
  [parent DisableVpcServiceControlsRequest]
  {:method :patch,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}:disableVpcServiceControls",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body DisableVpcServiceControlsRequest})

(defn services-addSubnetwork
  "For service producers, provisions a new subnet in a peered service's shared VPC network in the requested region and with the requested size that's expressed as a CIDR range (number of leading bits of ipV4 network mask). The method checks against the assigned allocated ranges to find a non-conflicting IP address range. The method will reuse a subnet if subsequent calls contain the same subnet name, region, and prefix length. This method will make producer's tenant project to be a shared VPC service project as needed.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/addSubnetwork

parent <> 
AddSubnetworkRequest:
AddSubnetworkRequest"
  [parent AddSubnetworkRequest]
  {:method :post,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}:addSubnetwork",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body AddSubnetworkRequest})

(defn services-enableVpcServiceControls
  "Enables VPC service controls for a connection.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/enableVpcServiceControls

parent <> 
EnableVpcServiceControlsRequest:
EnableVpcServiceControlsRequest"
  [parent EnableVpcServiceControlsRequest]
  {:method :patch,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}:enableVpcServiceControls",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body EnableVpcServiceControlsRequest})

(defn services-connections-deleteConnection
  "Deletes a private service access connection.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/connections/deleteConnection

name <> 
DeleteConnectionRequest:
DeleteConnectionRequest"
  [name DeleteConnectionRequest]
  {:method :post,
   :uri-template "https://servicenetworking.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body DeleteConnectionRequest})

(defn services-connections-patch
  "Updates the allocated ranges that are assigned to a connection.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/connections/patch

name <> 
Connection:
Connection

optional:
updateMask <string> The update mask. If this is omitted, it defaults to \"*\". You can only update the listed peering ranges.
force <boolean> If a previously defined allocated range is removed, force flag must be set to true."
  ([name Connection] (services-connections-patch name Connection nil))
  ([name Connection optional]
    {:method :patch,
     :uri-template
     "https://servicenetworking.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"],
     :body Connection}))

(defn services-connections-list
  "List the private connections that are configured in a service consumer's VPC network.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/connections/list

parent <> 

optional:
network <string> The name of service consumer's VPC network that's connected with service producer network through a private connection. The network name must be in the following format: `projects/{project}/global/networks/{network}`. {project} is a project number, such as in `12345` that includes the VPC service consumer's VPC network. {network} is the name of the service consumer's VPC network."
  ([parent] (services-connections-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://servicenetworking.googleapis.com/v1/{+parent}/connections",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"]}))

(defn services-connections-create
  "Creates a private connection that establishes a VPC Network Peering connection to a VPC network in the service producer's organization. The administrator of the service consumer's VPC network invokes this method. The administrator must assign one or more allocated IP ranges for provisioning subnetworks in the service producer's VPC network. This connection is used for all supported services in the service producer's organization, so it only needs to be invoked once.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/connections/create

parent <> 
Connection:
Connection"
  [parent Connection]
  {:method :post,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}/connections",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body Connection})

(defn services-projects-global-networks-get
  "Service producers use this method to get the configuration of their connection including the import/export of custom routes and subnetwork routes with public IP.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/projects/global/networks/get

name <> 

optional:
includeUsedIpRanges <boolean> Optional. When true, include the used IP ranges as part of the GetConsumerConfig output. This includes routes created inside the service networking network, consumer network, peers of the consumer network, and reserved ranges inside the service networking network. By default, this is false"
  ([name] (services-projects-global-networks-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://servicenetworking.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"]}))

(defn services-projects-global-networks-getVpcServiceControls
  "Consumers use this method to find out the state of VPC Service Controls. The controls could be enabled or disabled for a connection.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/projects/global/networks/getVpcServiceControls

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+name}/vpcServiceControls",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"]})

(defn services-projects-global-networks-updateConsumerConfig
  "Service producers use this method to update the configuration of their connection including the import/export of custom routes and subnetwork routes with public IP.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/projects/global/networks/updateConsumerConfig

parent <> 
UpdateConsumerConfigRequest:
UpdateConsumerConfigRequest"
  [parent UpdateConsumerConfigRequest]
  {:method :patch,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}:updateConsumerConfig",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body UpdateConsumerConfigRequest})

(defn services-projects-global-networks-dnsZones-list
  "* Service producers can use this method to retrieve a list of available DNS zones in the shared producer host project and the matching peering zones in the consumer project. *
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/projects/global/networks/dnsZones/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}/dnsZones:list",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"]})

(defn services-projects-global-networks-dnsZones-get
  "Service producers can use this method to retrieve a DNS zone in the shared producer host project and the matching peering zones in consumer project
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/projects/global/networks/dnsZones/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://servicenetworking.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"]})

(defn services-projects-global-networks-peeredDnsDomains-list
  "Lists peered DNS domains for a connection.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/projects/global/networks/peeredDnsDomains/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}/peeredDnsDomains",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"]})

(defn services-projects-global-networks-peeredDnsDomains-delete
  "Deletes a peered DNS domain.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/projects/global/networks/peeredDnsDomains/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://servicenetworking.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"]})

(defn services-projects-global-networks-peeredDnsDomains-create
  "Creates a peered DNS domain which sends requests for records in given namespace originating in the service producer VPC network to the consumer VPC network to be resolved.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/projects/global/networks/peeredDnsDomains/create

parent <> 
PeeredDnsDomain:
PeeredDnsDomain"
  [parent PeeredDnsDomain]
  {:method :post,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}/peeredDnsDomains",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body PeeredDnsDomain})

(defn services-roles-add
  "Service producers can use this method to add roles in the shared VPC host project. Each role is bound to the provided member. Each role must be selected from within an allowlisted set of roles. Each role is applied at only the granularity specified in the allowlist.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/roles/add

parent <> 
AddRolesRequest:
AddRolesRequest"
  [parent AddRolesRequest]
  {:method :post,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}/roles:add",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body AddRolesRequest})

(defn services-dnsRecordSets-add
  "Service producers can use this method to add DNS record sets to private DNS zones in the shared producer host project.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/dnsRecordSets/add

parent <> 
AddDnsRecordSetRequest:
AddDnsRecordSetRequest"
  [parent AddDnsRecordSetRequest]
  {:method :post,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}/dnsRecordSets:add",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body AddDnsRecordSetRequest})

(defn services-dnsRecordSets-remove
  "Service producers can use this method to remove DNS record sets from private DNS zones in the shared producer host project.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/dnsRecordSets/remove

parent <> 
RemoveDnsRecordSetRequest:
RemoveDnsRecordSetRequest"
  [parent RemoveDnsRecordSetRequest]
  {:method :post,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}/dnsRecordSets:remove",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body RemoveDnsRecordSetRequest})

(defn services-dnsRecordSets-list
  "Producers can use this method to retrieve a list of available DNS RecordSets available inside the private zone on the tenant host project accessible from their network.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/dnsRecordSets/list

parent <> 

optional:
zone <string> Required. The name of the private DNS zone in the shared producer host project from which the record set will be removed.
consumerNetwork <string> Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project}/global/networks/{network} {project} is the project number, as in '12345' {network} is the network name."
  ([parent] (services-dnsRecordSets-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://servicenetworking.googleapis.com/v1/{+parent}/dnsRecordSets:list",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"]}))

(defn services-dnsRecordSets-get
  "Producers can use this method to retrieve information about the DNS record set added to the private zone inside the shared tenant host project associated with a consumer network.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/dnsRecordSets/get

parent <> 

optional:
zone <string> Required. The name of the zone containing the record set.
type <string> Required. RecordSet Type eg. type='A'. See the list of [Supported DNS Types](https://cloud.google.com/dns/records/json-record).
consumerNetwork <string> Required. The consumer network containing the record set. Must be in the form of projects/{project}/global/networks/{network}
domain <string> Required. The domain name of the zone containing the recordset."
  ([parent] (services-dnsRecordSets-get parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://servicenetworking.googleapis.com/v1/{+parent}/dnsRecordSets:get",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"]}))

(defn services-dnsRecordSets-update
  "Service producers can use this method to update DNS record sets from private DNS zones in the shared producer host project.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/dnsRecordSets/update

parent <> 
UpdateDnsRecordSetRequest:
UpdateDnsRecordSetRequest"
  [parent UpdateDnsRecordSetRequest]
  {:method :post,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}/dnsRecordSets:update",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body UpdateDnsRecordSetRequest})

(defn services-dnsZones-remove
  "Service producers can use this method to remove private DNS zones in the shared producer host project and matching peering zones in the consumer project.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/dnsZones/remove

parent <> 
RemoveDnsZoneRequest:
RemoveDnsZoneRequest"
  [parent RemoveDnsZoneRequest]
  {:method :post,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}/dnsZones:remove",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body RemoveDnsZoneRequest})

(defn services-dnsZones-add
  "Service producers can use this method to add private DNS zones in the shared producer host project and matching peering zones in the consumer project.
https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started/v1/reference/rest/v1/services/dnsZones/add

parent <> 
AddDnsZoneRequest:
AddDnsZoneRequest"
  [parent AddDnsZoneRequest]
  {:method :post,
   :uri-template
   "https://servicenetworking.googleapis.com/v1/{+parent}/dnsZones:add",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/service.management"],
   :body AddDnsZoneRequest})
