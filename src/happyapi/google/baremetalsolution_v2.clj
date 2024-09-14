(ns happyapi.google.baremetalsolution-v2
  "Bare Metal Solution API
Provides ways to manage Bare Metal Solution hardware installed in a regional extension located near a Google Cloud data center.
See: https://cloud.google.com/bare-metal")

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://baremetalsolution.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-sshKeys-list
  "Lists the public SSH keys registered for the specified project. These SSH keys are used only for the interactive serial console feature.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/sshKeys/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return."
  ([parent] (projects-locations-sshKeys-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+parent}/sshKeys",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-sshKeys-create
  "Register a public SSH key in the specified project for use with the interactive serial console feature.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/sshKeys/create

parent <> 
SSHKey:
SSHKey

optional:
sshKeyId <string> Required. The ID to use for the key, which will become the final component of the key's resource name. This value must match the regex: [a-zA-Z0-9@.\\-_]{1,64}"
  ([parent SSHKey]
    (projects-locations-sshKeys-create parent SSHKey nil))
  ([parent SSHKey optional]
    {:method :post,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+parent}/sshKeys",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SSHKey}))

(defn projects-locations-sshKeys-delete
  "Deletes a public SSH key registered in the specified project.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/sshKeys/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://baremetalsolution.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-volumes-list
  "List storage volumes in a given project and location.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/list

parent <> 

optional:
pageSize <integer> Requested page size. The server might return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> List filter."
  ([parent] (projects-locations-volumes-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+parent}/volumes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-volumes-get
  "Get details of a single storage volume.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://baremetalsolution.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-volumes-patch
  "Update details of a single storage volume.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/patch

name <> 
Volume:
Volume

optional:
updateMask <string> The list of fields to update. The only currently supported fields are: 'labels'"
  ([name Volume] (projects-locations-volumes-patch name Volume nil))
  ([name Volume optional]
    {:method :patch,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Volume}))

(defn projects-locations-volumes-rename
  "RenameVolume sets a new name for a volume. Use with caution, previous names become immediately invalidated.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/rename

name <> 
RenameVolumeRequest:
RenameVolumeRequest"
  [name RenameVolumeRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:rename",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RenameVolumeRequest})

(defn projects-locations-volumes-evict
  "Skips volume's cooloff and deletes it now. Volume must be in cooloff state.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/evict

name <> 
EvictVolumeRequest:
EvictVolumeRequest"
  [name EvictVolumeRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:evict",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body EvictVolumeRequest})

(defn projects-locations-volumes-resize
  "Emergency Volume resize.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/resize

volume <> 
ResizeVolumeRequest:
ResizeVolumeRequest"
  [volume ResizeVolumeRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+volume}:resize",
   :uri-template-args {"volume" volume},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ResizeVolumeRequest})

(defn projects-locations-volumes-snapshots-create
  "Takes a snapshot of a boot volume. Returns INVALID_ARGUMENT if called for a non-boot volume.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/snapshots/create

parent <> 
VolumeSnapshot:
VolumeSnapshot"
  [parent VolumeSnapshot]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+parent}/snapshots",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body VolumeSnapshot})

(defn projects-locations-volumes-snapshots-restoreVolumeSnapshot
  "Uses the specified snapshot to restore its parent volume. Returns INVALID_ARGUMENT if called for a non-boot volume.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/snapshots/restoreVolumeSnapshot

volumeSnapshot <> 
RestoreVolumeSnapshotRequest:
RestoreVolumeSnapshotRequest"
  [volumeSnapshot RestoreVolumeSnapshotRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+volumeSnapshot}:restoreVolumeSnapshot",
   :uri-template-args {"volumeSnapshot" volumeSnapshot},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RestoreVolumeSnapshotRequest})

(defn projects-locations-volumes-snapshots-delete
  "Deletes a volume snapshot. Returns INVALID_ARGUMENT if called for a non-boot volume.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/snapshots/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://baremetalsolution.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-volumes-snapshots-get
  "Returns the specified snapshot resource. Returns INVALID_ARGUMENT if called for a non-boot volume.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/snapshots/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://baremetalsolution.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-volumes-snapshots-list
  "Retrieves the list of snapshots for the specified volume. Returns a response with an empty list of snapshots if called for a non-boot volume.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/snapshots/list

parent <> 

optional:
pageSize <integer> Requested page size. The server might return fewer items than requested. If unspecified, server will pick an appropriate default."
  ([parent] (projects-locations-volumes-snapshots-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+parent}/snapshots",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-volumes-luns-get
  "Get details of a single storage logical unit number(LUN).
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/luns/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://baremetalsolution.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-volumes-luns-list
  "List storage volume luns for given storage volume.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/luns/list

parent <> 

optional:
pageSize <integer> Requested page size. The server might return fewer items than requested. If unspecified, server will pick an appropriate default."
  ([parent] (projects-locations-volumes-luns-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+parent}/luns",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-volumes-luns-evict
  "Skips lun's cooloff and deletes it now. Lun must be in cooloff state.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/volumes/luns/evict

name <> 
EvictLunRequest:
EvictLunRequest"
  [name EvictLunRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:evict",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body EvictLunRequest})

(defn projects-locations-networks-list
  "List network in a given project and location.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/networks/list

parent <> 

optional:
pageSize <integer> Requested page size. The server might return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> List filter."
  ([parent] (projects-locations-networks-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+parent}/networks",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-networks-listNetworkUsage
  "List all Networks (and used IPs for each Network) in the vendor account associated with the specified project.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/networks/listNetworkUsage

location <> "
  [location]
  {:method :get,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+location}/networks:listNetworkUsage",
   :uri-template-args {"location" location},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-networks-get
  "Get details of a single network.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/networks/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://baremetalsolution.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-networks-patch
  "Update details of a single network.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/networks/patch

name <> 
Network:
Network

optional:
updateMask <string> The list of fields to update. The only currently supported fields are: `labels`, `reservations`, `vrf.vlan_attachments`"
  ([name Network] (projects-locations-networks-patch name Network nil))
  ([name Network optional]
    {:method :patch,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Network}))

(defn projects-locations-networks-rename
  "RenameNetwork sets a new name for a network. Use with caution, previous names become immediately invalidated.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/networks/rename

name <> 
RenameNetworkRequest:
RenameNetworkRequest"
  [name RenameNetworkRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:rename",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RenameNetworkRequest})

(defn projects-locations-osImages-list
  "Retrieves the list of OS images which are currently approved.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/osImages/list

parent <> 

optional:
pageSize <integer> Requested page size. The server might return fewer items than requested. If unspecified, server will pick an appropriate default. Notice that page_size field is not supported and won't be respected in the API request for now, will be updated when pagination is supported."
  ([parent] (projects-locations-osImages-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+parent}/osImages",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-osImages-get
  "Get details of a single OS image.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/osImages/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://baremetalsolution.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-nfsShares-get
  "Get details of a single NFS share.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/nfsShares/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://baremetalsolution.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-nfsShares-list
  "List NFS shares.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/nfsShares/list

parent <> 

optional:
pageSize <integer> Requested page size. The server might return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> List filter."
  ([parent] (projects-locations-nfsShares-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+parent}/nfsShares",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-nfsShares-patch
  "Update details of a single NFS share.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/nfsShares/patch

name <> 
NfsShare:
NfsShare

optional:
updateMask <string> The list of fields to update. The only currently supported fields are: `labels` `allowed_clients`"
  ([name NfsShare]
    (projects-locations-nfsShares-patch name NfsShare nil))
  ([name NfsShare optional]
    {:method :patch,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body NfsShare}))

(defn projects-locations-nfsShares-create
  "Create an NFS share.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/nfsShares/create

parent <> 
NfsShare:
NfsShare"
  [parent NfsShare]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+parent}/nfsShares",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body NfsShare})

(defn projects-locations-nfsShares-rename
  "RenameNfsShare sets a new name for an nfsshare. Use with caution, previous names become immediately invalidated.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/nfsShares/rename

name <> 
RenameNfsShareRequest:
RenameNfsShareRequest"
  [name RenameNfsShareRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:rename",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RenameNfsShareRequest})

(defn projects-locations-nfsShares-delete
  "Delete an NFS share. The underlying volume is automatically deleted.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/nfsShares/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://baremetalsolution.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-provisioningQuotas-list
  "List the budget details to provision resources on a given project.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/provisioningQuotas/list

parent <> 

optional:
pageSize <integer> Requested page size. The server might return fewer items than requested. If unspecified, server will pick an appropriate default. Notice that page_size field is not supported and won't be respected in the API request for now, will be updated when pagination is supported."
  ([parent] (projects-locations-provisioningQuotas-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+parent}/provisioningQuotas",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-stop
  "Stop a running server.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/stop

name <> 
StopInstanceRequest:
StopInstanceRequest"
  [name StopInstanceRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:stop",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body StopInstanceRequest})

(defn projects-locations-instances-rename
  "RenameInstance sets a new name for an instance. Use with caution, previous names become immediately invalidated.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/rename

name <> 
RenameInstanceRequest:
RenameInstanceRequest"
  [name RenameInstanceRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:rename",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RenameInstanceRequest})

(defn projects-locations-instances-loadAuthInfo
  "Load auth info for a server.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/loadAuthInfo

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:loadAuthInfo",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-instances-list
  "List servers in a given project and location.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, the server will pick an appropriate default.
filter <string> List filter."
  ([parent] (projects-locations-instances-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+parent}/instances",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-instances-disableHyperthreading
  "Perform disable hyperthreading operation on a single server.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/disableHyperthreading

name <> 
DisableHyperthreadingRequest:
DisableHyperthreadingRequest"
  [name DisableHyperthreadingRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:disableHyperthreading",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body DisableHyperthreadingRequest})

(defn projects-locations-instances-enableHyperthreading
  "Perform enable hyperthreading operation on a single server.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/enableHyperthreading

name <> 
EnableHyperthreadingRequest:
EnableHyperthreadingRequest"
  [name EnableHyperthreadingRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:enableHyperthreading",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body EnableHyperthreadingRequest})

(defn projects-locations-instances-reset
  "Perform an ungraceful, hard reset on a server. Equivalent to shutting the power off and then turning it back on.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/reset

name <> 
ResetInstanceRequest:
ResetInstanceRequest"
  [name ResetInstanceRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:reset",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ResetInstanceRequest})

(defn projects-locations-instances-enableInteractiveSerialConsole
  "Enable the interactive serial console feature on an instance.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/enableInteractiveSerialConsole

name <> 
EnableInteractiveSerialConsoleRequest:
EnableInteractiveSerialConsoleRequest"
  [name EnableInteractiveSerialConsoleRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:enableInteractiveSerialConsole",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body EnableInteractiveSerialConsoleRequest})

(defn projects-locations-instances-start
  "Starts a server that was shutdown.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/start

name <> 
StartInstanceRequest:
StartInstanceRequest"
  [name StartInstanceRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:start",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body StartInstanceRequest})

(defn projects-locations-instances-disableInteractiveSerialConsole
  "Disable the interactive serial console feature on an instance.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/disableInteractiveSerialConsole

name <> 
DisableInteractiveSerialConsoleRequest:
DisableInteractiveSerialConsoleRequest"
  [name DisableInteractiveSerialConsoleRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:disableInteractiveSerialConsole",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body DisableInteractiveSerialConsoleRequest})

(defn projects-locations-instances-patch
  "Update details of a single server.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/patch

name <> 
Instance:
Instance

optional:
updateMask <string> The list of fields to update. The currently supported fields are: `labels` `hyperthreading_enabled` `os_image` `ssh_keys` `kms_key_version`"
  ([name Instance]
    (projects-locations-instances-patch name Instance nil))
  ([name Instance optional]
    {:method :patch,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Instance}))

(defn projects-locations-instances-detachLun
  "Detach LUN from Instance.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/detachLun

instance <> 
DetachLunRequest:
DetachLunRequest"
  [instance DetachLunRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+instance}:detachLun",
   :uri-template-args {"instance" instance},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body DetachLunRequest})

(defn projects-locations-instances-get
  "Get details about a single server.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://baremetalsolution.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-instances-reimage
  "Perform reimage operation on a single server.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/instances/reimage

name <> 
ReimageInstanceRequest:
ReimageInstanceRequest"
  [name ReimageInstanceRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+name}:reimage",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ReimageInstanceRequest})

(defn projects-locations-provisioningConfigs-submit
  "Submit a provisiong configuration for a given project.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/provisioningConfigs/submit

parent <> 
SubmitProvisioningConfigRequest:
SubmitProvisioningConfigRequest"
  [parent SubmitProvisioningConfigRequest]
  {:method :post,
   :uri-template
   "https://baremetalsolution.googleapis.com/v2/{+parent}/provisioningConfigs:submit",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SubmitProvisioningConfigRequest})

(defn projects-locations-provisioningConfigs-get
  "Get ProvisioningConfig by name.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/provisioningConfigs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://baremetalsolution.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-provisioningConfigs-create
  "Create new ProvisioningConfig.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/provisioningConfigs/create

parent <> 
ProvisioningConfig:
ProvisioningConfig

optional:
email <string> Optional. Email provided to send a confirmation with provisioning config to."
  ([parent ProvisioningConfig]
    (projects-locations-provisioningConfigs-create
      parent
      ProvisioningConfig
      nil))
  ([parent ProvisioningConfig optional]
    {:method :post,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+parent}/provisioningConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ProvisioningConfig}))

(defn projects-locations-provisioningConfigs-patch
  "Update existing ProvisioningConfig.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/provisioningConfigs/patch

name <> 
ProvisioningConfig:
ProvisioningConfig

optional:
updateMask <string> Required. The list of fields to update.
email <string> Optional. Email provided to send a confirmation with provisioning config to."
  ([name ProvisioningConfig]
    (projects-locations-provisioningConfigs-patch
      name
      ProvisioningConfig
      nil))
  ([name ProvisioningConfig optional]
    {:method :patch,
     :uri-template
     "https://baremetalsolution.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body ProvisioningConfig}))

(defn projects-locations-operations-get
  "Get details about an operation.
https://cloud.google.com/bare-metal/v2/reference/rest/v2/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://baremetalsolution.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})
