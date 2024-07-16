(ns happyapi.google.vmmigration-v1
  "VM Migration API
Use the Migrate to Virtual Machines API to programmatically migrate workloads. 
See: https://cloud.google.com/products/cloud-migration/virtual-machines"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://vmmigration.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-sources-list
  "Lists Sources in a given project and location.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of sources to return. The service may return fewer than this value. If unspecified, at most 500 sources will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Optional. The filter request.
orderBy <string> Optional. the order by fields for the result."
  ([parent] (projects-locations-sources-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/sources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-get
  "Gets details of a single Source.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-sources-create
  "Creates a new Source in a given project and location.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/create

parent <> 
Source:
Source

optional:
sourceId <string> Required. The source identifier.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent Source]
    (projects-locations-sources-create parent Source nil))
  ([parent Source optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/sources",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Source})))

(defn projects-locations-sources-patch
  "Updates the parameters of a single Source.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/patch

name <> 
Source:
Source

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the Source resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Source] (projects-locations-sources-patch name Source nil))
  ([name Source optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Source})))

(defn projects-locations-sources-delete
  "Deletes a single Source.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-sources-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-fetchInventory
  "List remote source's inventory of VMs. The remote source is the onprem vCenter (remote in the sense it's not in Compute Engine). The inventory describes the list of existing VMs in that source. Note that this operation lists the VMs on the remote source, as opposed to listing the MigratingVms resources in the vmmigration service.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/fetchInventory

source <> 

optional:
forceRefresh <boolean> If this flag is set to true, the source will be queried instead of using cached results. Using this flag will make the call slower.
pageSize <integer> The maximum number of VMs to return. The service may return fewer than this value. For AWS source: If unspecified, at most 500 VMs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000. For VMWare source: If unspecified, all VMs will be returned. There is no limit for maximum value."
  ([source] (projects-locations-sources-fetchInventory source nil))
  ([source optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+source}:fetchInventory",
       :uri-template-args {"source" source},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-utilizationReports-list
  "Lists Utilization Reports of the given Source.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/utilizationReports/list

parent <> 

optional:
view <string> Optional. The level of details of each report. Defaults to BASIC.
pageSize <integer> Optional. The maximum number of reports to return. The service may return fewer than this value. If unspecified, at most 500 reports will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Optional. The filter request.
orderBy <string> Optional. the order by fields for the result."
  ([parent]
    (projects-locations-sources-utilizationReports-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/utilizationReports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-utilizationReports-get
  "Gets a single Utilization Report.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/utilizationReports/get

name <> 

optional:
view <string> Optional. The level of details of the report. Defaults to FULL"
  ([name] (projects-locations-sources-utilizationReports-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-utilizationReports-create
  "Creates a new UtilizationReport.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/utilizationReports/create

parent <> 
UtilizationReport:
UtilizationReport

optional:
utilizationReportId <string> Required. The ID to use for the report, which will become the final component of the reports's resource name. This value maximum length is 63 characters, and valid characters are /a-z-/. It must start with an english letter and must not end with a hyphen.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent UtilizationReport]
    (projects-locations-sources-utilizationReports-create
      parent
      UtilizationReport
      nil))
  ([parent UtilizationReport optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/utilizationReports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body UtilizationReport})))

(defn projects-locations-sources-utilizationReports-delete
  "Deletes a single Utilization Report.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/utilizationReports/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name]
    (projects-locations-sources-utilizationReports-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-datacenterConnectors-list
  "Lists DatacenterConnectors in a given Source.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/datacenterConnectors/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of connectors to return. The service may return fewer than this value. If unspecified, at most 500 sources will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Optional. The filter request.
orderBy <string> Optional. the order by fields for the result."
  ([parent]
    (projects-locations-sources-datacenterConnectors-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/datacenterConnectors",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-datacenterConnectors-get
  "Gets details of a single DatacenterConnector.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/datacenterConnectors/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-sources-datacenterConnectors-create
  "Creates a new DatacenterConnector in a given Source.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/datacenterConnectors/create

parent <> 
DatacenterConnector:
DatacenterConnector

optional:
datacenterConnectorId <string> Required. The datacenterConnector identifier.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent DatacenterConnector]
    (projects-locations-sources-datacenterConnectors-create
      parent
      DatacenterConnector
      nil))
  ([parent DatacenterConnector optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/datacenterConnectors",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body DatacenterConnector})))

(defn projects-locations-sources-datacenterConnectors-delete
  "Deletes a single DatacenterConnector.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/datacenterConnectors/delete

name <> 

optional:
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name]
    (projects-locations-sources-datacenterConnectors-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-datacenterConnectors-upgradeAppliance
  "Upgrades the appliance relate to this DatacenterConnector to the in-place updateable version.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/datacenterConnectors/upgradeAppliance

datacenterConnector <> 
UpgradeApplianceRequest:
UpgradeApplianceRequest"
  [datacenterConnector UpgradeApplianceRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://vmmigration.googleapis.com/v1/{+datacenterConnector}:upgradeAppliance",
     :uri-template-args {"datacenterConnector" datacenterConnector},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body UpgradeApplianceRequest}))

(defn projects-locations-sources-migratingVms-startMigration
  "Starts migration for a VM. Starts the process of uploading data and creating snapshots, in replication cycles scheduled by the policy.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/startMigration

migratingVm <> 
StartMigrationRequest:
StartMigrationRequest"
  [migratingVm StartMigrationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://vmmigration.googleapis.com/v1/{+migratingVm}:startMigration",
     :uri-template-args {"migratingVm" migratingVm},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body StartMigrationRequest}))

(defn projects-locations-sources-migratingVms-list
  "Lists MigratingVms in a given Source.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of migrating VMs to return. The service may return fewer than this value. If unspecified, at most 500 migrating VMs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Optional. The filter request.
orderBy <string> Optional. the order by fields for the result.
view <string> Optional. The level of details of each migrating VM."
  ([parent] (projects-locations-sources-migratingVms-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/migratingVms",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-migratingVms-finalizeMigration
  "Marks a migration as completed, deleting migration resources that are no longer being used. Only applicable after cutover is done.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/finalizeMigration

migratingVm <> 
FinalizeMigrationRequest:
FinalizeMigrationRequest"
  [migratingVm FinalizeMigrationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://vmmigration.googleapis.com/v1/{+migratingVm}:finalizeMigration",
     :uri-template-args {"migratingVm" migratingVm},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body FinalizeMigrationRequest}))

(defn projects-locations-sources-migratingVms-delete
  "Deletes a single MigratingVm.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-sources-migratingVms-resumeMigration
  "Resumes a migration for a VM. When called on a paused migration, will start the process of uploading data and creating snapshots; when called on a completed cut-over migration, will update the migration to active state and start the process of uploading data and creating snapshots.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/resumeMigration

migratingVm <> 
ResumeMigrationRequest:
ResumeMigrationRequest"
  [migratingVm ResumeMigrationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://vmmigration.googleapis.com/v1/{+migratingVm}:resumeMigration",
     :uri-template-args {"migratingVm" migratingVm},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ResumeMigrationRequest}))

(defn projects-locations-sources-migratingVms-patch
  "Updates the parameters of a single MigratingVm.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/patch

name <> 
MigratingVm:
MigratingVm

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the MigratingVm resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name MigratingVm]
    (projects-locations-sources-migratingVms-patch
      name
      MigratingVm
      nil))
  ([name MigratingVm optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body MigratingVm})))

(defn projects-locations-sources-migratingVms-pauseMigration
  "Pauses a migration for a VM. If cycle tasks are running they will be cancelled, preserving source task data. Further replication cycles will not be triggered while the VM is paused.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/pauseMigration

migratingVm <> 
PauseMigrationRequest:
PauseMigrationRequest"
  [migratingVm PauseMigrationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://vmmigration.googleapis.com/v1/{+migratingVm}:pauseMigration",
     :uri-template-args {"migratingVm" migratingVm},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body PauseMigrationRequest}))

(defn projects-locations-sources-migratingVms-create
  "Creates a new MigratingVm in a given Source.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/create

parent <> 
MigratingVm:
MigratingVm

optional:
migratingVmId <string> Required. The migratingVm identifier.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent MigratingVm]
    (projects-locations-sources-migratingVms-create
      parent
      MigratingVm
      nil))
  ([parent MigratingVm optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/migratingVms",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body MigratingVm})))

(defn projects-locations-sources-migratingVms-get
  "Gets details of a single MigratingVm.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/get

name <> 

optional:
view <string> Optional. The level of details of the migrating VM."
  ([name] (projects-locations-sources-migratingVms-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-migratingVms-cloneJobs-create
  "Initiates a Clone of a specific migrating VM.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/cloneJobs/create

parent <> 
CloneJob:
CloneJob

optional:
cloneJobId <string> Required. The clone job identifier.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent CloneJob]
    (projects-locations-sources-migratingVms-cloneJobs-create
      parent
      CloneJob
      nil))
  ([parent CloneJob optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/cloneJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body CloneJob})))

(defn projects-locations-sources-migratingVms-cloneJobs-cancel
  "Initiates the cancellation of a running clone job.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/cloneJobs/cancel

name <> 
CancelCloneJobRequest:
CancelCloneJobRequest"
  [name CancelCloneJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://vmmigration.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelCloneJobRequest}))

(defn projects-locations-sources-migratingVms-cloneJobs-list
  "Lists the CloneJobs of a migrating VM. Only 25 most recent CloneJobs are listed.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/cloneJobs/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of clone jobs to return. The service may return fewer than this value. If unspecified, at most 500 clone jobs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Optional. The filter request.
orderBy <string> Optional. the order by fields for the result."
  ([parent]
    (projects-locations-sources-migratingVms-cloneJobs-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/cloneJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-migratingVms-cloneJobs-get
  "Gets details of a single CloneJob.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/cloneJobs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-sources-migratingVms-cutoverJobs-create
  "Initiates a Cutover of a specific migrating VM. The returned LRO is completed when the cutover job resource is created and the job is initiated.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/cutoverJobs/create

parent <> 
CutoverJob:
CutoverJob

optional:
cutoverJobId <string> Required. The cutover job identifier.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent CutoverJob]
    (projects-locations-sources-migratingVms-cutoverJobs-create
      parent
      CutoverJob
      nil))
  ([parent CutoverJob optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/cutoverJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body CutoverJob})))

(defn projects-locations-sources-migratingVms-cutoverJobs-cancel
  "Initiates the cancellation of a running cutover job.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/cutoverJobs/cancel

name <> 
CancelCutoverJobRequest:
CancelCutoverJobRequest"
  [name CancelCutoverJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://vmmigration.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelCutoverJobRequest}))

(defn projects-locations-sources-migratingVms-cutoverJobs-list
  "Lists the CutoverJobs of a migrating VM. Only 25 most recent CutoverJobs are listed.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/cutoverJobs/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of cutover jobs to return. The service may return fewer than this value. If unspecified, at most 500 cutover jobs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Optional. The filter request.
orderBy <string> Optional. the order by fields for the result."
  ([parent]
    (projects-locations-sources-migratingVms-cutoverJobs-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/cutoverJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-migratingVms-cutoverJobs-get
  "Gets details of a single CutoverJob.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/cutoverJobs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-sources-migratingVms-replicationCycles-list
  "Lists ReplicationCycles in a given MigratingVM.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/replicationCycles/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of replication cycles to return. The service may return fewer than this value. If unspecified, at most 100 migrating VMs will be returned. The maximum value is 100; values above 100 will be coerced to 100.
filter <string> Optional. The filter request.
orderBy <string> Optional. the order by fields for the result."
  ([parent]
    (projects-locations-sources-migratingVms-replicationCycles-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/replicationCycles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-sources-migratingVms-replicationCycles-get
  "Gets details of a single ReplicationCycle.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/migratingVms/replicationCycles/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-sources-diskMigrationJobs-run
  "Runs the disk migration job.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/diskMigrationJobs/run

name <> 
RunDiskMigrationJobRequest:
RunDiskMigrationJobRequest"
  [name RunDiskMigrationJobRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}:run",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RunDiskMigrationJobRequest}))

(defn projects-locations-sources-diskMigrationJobs-cancel
  "Cancels the disk migration job.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/sources/diskMigrationJobs/cancel

name <> 
CancelDiskMigrationJobRequest:
CancelDiskMigrationJobRequest"
  [name CancelDiskMigrationJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://vmmigration.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelDiskMigrationJobRequest}))

(defn projects-locations-groups-list
  "Lists Groups in a given project and location.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/groups/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of groups to return. The service may return fewer than this value. If unspecified, at most 500 groups will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Optional. The filter request.
orderBy <string> Optional. the order by fields for the result."
  ([parent] (projects-locations-groups-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/groups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-groups-get
  "Gets details of a single Group.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/groups/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-groups-create
  "Creates a new Group in a given project and location.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/groups/create

parent <> 
Group:
Group

optional:
groupId <string> Required. The group identifier.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent Group] (projects-locations-groups-create parent Group nil))
  ([parent Group optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/groups",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Group})))

(defn projects-locations-groups-patch
  "Updates the parameters of a single Group.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/groups/patch

name <> 
Group:
Group

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the Group resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name Group] (projects-locations-groups-patch name Group nil))
  ([name Group optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Group})))

(defn projects-locations-groups-delete
  "Deletes a single Group.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/groups/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-groups-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-groups-addGroupMigration
  "Adds a MigratingVm to a Group.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/groups/addGroupMigration

group <> 
AddGroupMigrationRequest:
AddGroupMigrationRequest"
  [group AddGroupMigrationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://vmmigration.googleapis.com/v1/{+group}:addGroupMigration",
     :uri-template-args {"group" group},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AddGroupMigrationRequest}))

(defn projects-locations-groups-removeGroupMigration
  "Removes a MigratingVm from a Group.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/groups/removeGroupMigration

group <> 
RemoveGroupMigrationRequest:
RemoveGroupMigrationRequest"
  [group RemoveGroupMigrationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://vmmigration.googleapis.com/v1/{+group}:removeGroupMigration",
     :uri-template-args {"group" group},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RemoveGroupMigrationRequest}))

(defn projects-locations-targetProjects-list
  "Lists TargetProjects in a given project. NOTE: TargetProject is a global resource; hence the only supported value for location is `global`.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/targetProjects/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of targets to return. The service may return fewer than this value. If unspecified, at most 500 targets will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Optional. The filter request.
orderBy <string> Optional. the order by fields for the result."
  ([parent] (projects-locations-targetProjects-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/targetProjects",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-targetProjects-get
  "Gets details of a single TargetProject. NOTE: TargetProject is a global resource; hence the only supported value for location is `global`.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/targetProjects/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-targetProjects-create
  "Creates a new TargetProject in a given project. NOTE: TargetProject is a global resource; hence the only supported value for location is `global`.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/targetProjects/create

parent <> 
TargetProject:
TargetProject

optional:
targetProjectId <string> Required. The target_project identifier.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent TargetProject]
    (projects-locations-targetProjects-create
      parent
      TargetProject
      nil))
  ([parent TargetProject optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/targetProjects",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TargetProject})))

(defn projects-locations-targetProjects-patch
  "Updates the parameters of a single TargetProject. NOTE: TargetProject is a global resource; hence the only supported value for location is `global`.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/targetProjects/patch

name <> 
TargetProject:
TargetProject

optional:
updateMask <string> Field mask is used to specify the fields to be overwritten in the TargetProject resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name TargetProject]
    (projects-locations-targetProjects-patch name TargetProject nil))
  ([name TargetProject optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body TargetProject})))

(defn projects-locations-targetProjects-delete
  "Deletes a single TargetProject. NOTE: TargetProject is a global resource; hence the only supported value for location is `global`.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/targetProjects/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-targetProjects-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-imageImports-list
  "Lists ImageImports in a given project.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/imageImports/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of targets to return. The service may return fewer than this value. If unspecified, at most 500 targets will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Optional. The filter request (according to https://google.aip.dev/160).
orderBy <string> Optional. The order by fields for the result (according to https://google.aip.dev/132#ordering). Currently ordering is only possible by \"name\" field."
  ([parent] (projects-locations-imageImports-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/imageImports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-imageImports-get
  "Gets details of a single ImageImport.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/imageImports/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-imageImports-create
  "Creates a new ImageImport in a given project.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/imageImports/create

parent <> 
ImageImport:
ImageImport

optional:
imageImportId <string> Required. The image import identifier. This value maximum length is 63 characters, and valid characters are /a-z-/. It must start with an english letter and must not end with a hyphen.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent ImageImport]
    (projects-locations-imageImports-create parent ImageImport nil))
  ([parent ImageImport optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/imageImports",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ImageImport})))

(defn projects-locations-imageImports-delete
  "Deletes a single ImageImport.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/imageImports/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-imageImports-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-imageImports-imageImportJobs-list
  "Lists ImageImportJobs in a given project.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/imageImports/imageImportJobs/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of targets to return. The service may return fewer than this value. If unspecified, at most 500 targets will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Optional. The filter request (according to https://google.aip.dev/160).
orderBy <string> Optional. The order by fields for the result (according to https://google.aip.dev/132#ordering). Currently ordering is only possible by \"name\" field."
  ([parent]
    (projects-locations-imageImports-imageImportJobs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://vmmigration.googleapis.com/v1/{+parent}/imageImportJobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-imageImports-imageImportJobs-get
  "Gets details of a single ImageImportJob.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/imageImports/imageImportJobs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://vmmigration.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-imageImports-imageImportJobs-cancel
  "Initiates the cancellation of a running clone job.
https://cloud.google.com/products/cloud-migration/virtual-machines/v1/reference/rest/v1/projects/locations/imageImports/imageImportJobs/cancel

name <> 
CancelImageImportJobRequest:
CancelImageImportJobRequest"
  [name CancelImageImportJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://vmmigration.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelImageImportJobRequest}))
