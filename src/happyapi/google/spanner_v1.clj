(ns happyapi.google.spanner-v1
  "Cloud Spanner API
Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.
See: https://cloud.google.com/spanner/")

(defn scans-list
  "Return available scans given a Database-specific resource name.
https://cloud.google.com/spanner/v1/reference/rest/v1/scans/list

parent <> 

optional:
view <string> Specifies which parts of the Scan should be returned in the response. Note, only the SUMMARY view (the default) is currently supported for ListScans.
filter <string> A filter expression to restrict the results based on information present in the available Scan collection. The filter applies to all fields within the Scan message except for `data`.
pageSize <integer> The maximum number of items to return."
  ([parent] (scans-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://spanner.googleapis.com/v1/{+parent}",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.data"]}))

(defn projects-instanceConfigs-list
  "Lists the supported instance configurations for a given project. Returns both Google-managed configurations and user-managed configurations.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigs/list

parent <> 

optional:
pageSize <integer> Number of instance configurations to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size."
  ([parent] (projects-instanceConfigs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://spanner.googleapis.com/v1/{+parent}/instanceConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instanceConfigs-get
  "Gets information about a particular instance configuration.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instanceConfigs-create
  "Creates an instance configuration and begins preparing it to be used. The returned long-running operation can be used to track the progress of preparing the new instance configuration. The instance configuration name is assigned by the caller. If the named instance configuration already exists, `CreateInstanceConfig` returns `ALREADY_EXISTS`. Immediately after the request returns: * The instance configuration is readable via the API, with all requested attributes. The instance configuration's reconciling field is set to true. Its state is `CREATING`. While the operation is pending: * Cancelling the operation renders the instance configuration immediately unreadable via the API. * Except for deleting the creating resource, all other attempts to modify the instance configuration are rejected. Upon completion of the returned operation: * Instances can be created using the instance configuration. * The instance configuration's reconciling field becomes false. Its state becomes `READY`. The returned long-running operation will have a name of the format `/operations/` and can be used to track creation of the instance configuration. The metadata field type is CreateInstanceConfigMetadata. The response field type is InstanceConfig, if successful. Authorization requires `spanner.instanceConfigs.create` permission on the resource parent.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigs/create

parent <> 
CreateInstanceConfigRequest:
CreateInstanceConfigRequest"
  [parent CreateInstanceConfigRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+parent}/instanceConfigs",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body CreateInstanceConfigRequest})

(defn projects-instanceConfigs-patch
  "Updates an instance configuration. The returned long-running operation can be used to track the progress of updating the instance. If the named instance configuration does not exist, returns `NOT_FOUND`. Only user-managed configurations can be updated. Immediately after the request returns: * The instance configuration's reconciling field is set to true. While the operation is pending: * Cancelling the operation sets its metadata's cancel_time. The operation is guaranteed to succeed at undoing all changes, after which point it terminates with a `CANCELLED` status. * All other attempts to modify the instance configuration are rejected. * Reading the instance configuration via the API continues to give the pre-request values. Upon completion of the returned operation: * Creating instances using the instance configuration uses the new values. * The new values of the instance configuration are readable via the API. * The instance configuration's reconciling field becomes false. The returned long-running operation will have a name of the format `/operations/` and can be used to track the instance configuration modification. The metadata field type is UpdateInstanceConfigMetadata. The response field type is InstanceConfig, if successful. Authorization requires `spanner.instanceConfigs.update` permission on the resource name.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigs/patch

name <> 
UpdateInstanceConfigRequest:
UpdateInstanceConfigRequest"
  [name UpdateInstanceConfigRequest]
  {:method :patch,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body UpdateInstanceConfigRequest})

(defn projects-instanceConfigs-delete
  "Deletes the instance configuration. Deletion is only allowed when no instances are using the configuration. If any instances are using the configuration, returns `FAILED_PRECONDITION`. Only user-managed configurations can be deleted. Authorization requires `spanner.instanceConfigs.delete` permission on the resource name.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigs/delete

name <> 

optional:
etag <string> Used for optimistic concurrency control as a way to help prevent simultaneous deletes of an instance configuration from overwriting each other. If not empty, the API only deletes the instance configuration when the etag provided matches the current status of the requested instance configuration. Otherwise, deletes the instance configuration without checking the current status of the requested instance configuration.
validateOnly <boolean> An option to validate, but not actually execute, a request, and provide the same response."
  ([name] (projects-instanceConfigs-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://spanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instanceConfigs-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigs/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-instanceConfigs-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://spanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instanceConfigs-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigs/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instanceConfigs-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigs/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instanceConfigs-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigs/operations/cancel

name <> "
  [name]
  {:method :post,
   :uri-template "https://spanner.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instanceConfigs-ssdCaches-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigs/ssdCaches/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-instanceConfigs-ssdCaches-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://spanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instanceConfigs-ssdCaches-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigs/ssdCaches/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instanceConfigs-ssdCaches-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigs/ssdCaches/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instanceConfigs-ssdCaches-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigs/ssdCaches/operations/cancel

name <> "
  [name]
  {:method :post,
   :uri-template "https://spanner.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instanceConfigOperations-list
  "Lists the user-managed instance configuration long-running operations in the given project. An instance configuration operation has a name of the form `projects//instanceConfigs//operations/`. The long-running operation metadata field type `metadata.type_url` describes the type of the metadata. Operations returned include those that have completed/failed/canceled within the last 7 days, and pending operations. Operations returned are ordered by `operation.metadata.value.start_time` in descending order starting from the most recently started operation.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instanceConfigOperations/list

parent <> 

optional:
filter <string> An expression that filters the list of returned operations. A filter expression consists of a field name, a comparison operator, and a value for filtering. The value must be a string, a number, or a boolean. The comparison operator must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`. Colon `:` is the contains operator. Filter rules are not case sensitive. The following fields in the Operation are eligible for filtering: * `name` - The name of the long-running operation * `done` - False if the operation is in progress, else true. * `metadata.@type` - the type of metadata. For example, the type string for CreateInstanceConfigMetadata is `type.googleapis.com/google.spanner.admin.instance.v1.CreateInstanceConfigMetadata`. * `metadata.` - any field in metadata.value. `metadata.@type` must be specified first, if filtering on metadata fields. * `error` - Error associated with the long-running operation. * `response.@type` - the type of response. * `response.` - any field in response.value. You can combine multiple expressions by enclosing each expression in parentheses. By default, expressions are combined with AND logic. However, you can specify AND, OR, and NOT logic explicitly. Here are a few examples: * `done:true` - The operation is complete. * `(metadata.@type=` \\ `type.googleapis.com/google.spanner.admin.instance.v1.CreateInstanceConfigMetadata) AND` \\ `(metadata.instance_config.name:custom-config) AND` \\ `(metadata.progress.start_time < \\\"2021-03-28T14:50:00Z\\\") AND` \\ `(error:*)` - Return operations where: * The operation's metadata type is CreateInstanceConfigMetadata. * The instance configuration name contains \"custom-config\". * The operation started before 2021-03-28T14:50:00Z. * The operation resulted in an error.
pageSize <integer> Number of operations to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size."
  ([parent] (projects-instanceConfigOperations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://spanner.googleapis.com/v1/{+parent}/instanceConfigOperations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-list
  "Lists all instances in the given project.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/list

parent <> 

optional:
pageSize <integer> Number of instances to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
filter <string> An expression for filtering the results of the request. Filter rules are case insensitive. The fields eligible for filtering are: * `name` * `display_name` * `labels.key` where key is the name of a label Some examples of using filters are: * `name:*` --> The instance has a name. * `name:Howl` --> The instance's name contains the string \"howl\". * `name:HOWL` --> Equivalent to above. * `NAME:howl` --> Equivalent to above. * `labels.env:*` --> The instance has the label \"env\". * `labels.env:dev` --> The instance has the label \"env\" and the value of the label contains the string \"dev\". * `name:howl labels.env:dev` --> The instance's name contains \"howl\" and it has the label \"env\" with its value containing \"dev\".
instanceDeadline <string> Deadline used while retrieving metadata for instances. Instances whose metadata cannot be retrieved within this deadline will be added to unreachable in ListInstancesResponse."
  ([parent] (projects-instances-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://spanner.googleapis.com/v1/{+parent}/instances",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-setIamPolicy
  "Sets the access control policy on an instance resource. Replaces any existing policy. Authorization requires `spanner.instances.setIamPolicy` on resource.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body SetIamPolicyRequest})

(defn projects-instances-delete
  "Deletes an instance. Immediately upon completion of the request: * Billing ceases for all of the instance's reserved resources. Soon afterward: * The instance and *all of its databases* immediately and irrevocably disappear from the API. All data in the databases is permanently deleted.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-patch
  "Updates an instance, and begins allocating or releasing resources as requested. The returned long-running operation can be used to track the progress of updating the instance. If the named instance does not exist, returns `NOT_FOUND`. Immediately upon completion of this request: * For resource types for which a decrease in the instance's allocation has been requested, billing is based on the newly-requested level. Until completion of the returned operation: * Cancelling the operation sets its metadata's cancel_time, and begins restoring resources to their pre-request values. The operation is guaranteed to succeed at undoing all resource changes, after which point it terminates with a `CANCELLED` status. * All other attempts to modify the instance are rejected. * Reading the instance via the API continues to give the pre-request resource levels. Upon completion of the returned operation: * Billing begins for all successfully-allocated resources (some types may have lower than the requested levels). * All newly-reserved resources are available for serving the instance's tables. * The instance's new resource levels are readable via the API. The returned long-running operation will have a name of the format `/operations/` and can be used to track the instance modification. The metadata field type is UpdateInstanceMetadata. The response field type is Instance, if successful. Authorization requires `spanner.instances.update` permission on the resource name.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/patch

name <> 
UpdateInstanceRequest:
UpdateInstanceRequest"
  [name UpdateInstanceRequest]
  {:method :patch,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body UpdateInstanceRequest})

(defn projects-instances-getIamPolicy
  "Gets the access control policy for an instance resource. Returns an empty policy if an instance exists but does not have a policy set. Authorization requires `spanner.instances.getIamPolicy` on resource.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body GetIamPolicyRequest})

(defn projects-instances-move
  "Moves an instance to the target instance configuration. You can use the returned long-running operation to track the progress of moving the instance. `MoveInstance` returns `FAILED_PRECONDITION` if the instance meets any of the following criteria: * Is undergoing a move to a different instance configuration * Has backups * Has an ongoing update * Contains any CMEK-enabled databases * Is a free trial instance While the operation is pending: * All other attempts to modify the instance, including changes to its compute capacity, are rejected. * The following database and backup admin operations are rejected: * `DatabaseAdmin.CreateDatabase` * `DatabaseAdmin.UpdateDatabaseDdl` (disabled if default_leader is specified in the request.) * `DatabaseAdmin.RestoreDatabase` * `DatabaseAdmin.CreateBackup` * `DatabaseAdmin.CopyBackup` * Both the source and target instance configurations are subject to hourly compute and storage charges. * The instance might experience higher read-write latencies and a higher transaction abort rate. However, moving an instance doesn't cause any downtime. The returned long-running operation has a name of the format `/operations/` and can be used to track the move instance operation. The metadata field type is MoveInstanceMetadata. The response field type is Instance, if successful. Cancelling the operation sets its metadata's cancel_time. Cancellation is not immediate because it involves moving any data previously moved to the target instance configuration back to the original instance configuration. You can use this operation to track the progress of the cancellation. Upon successful completion of the cancellation, the operation terminates with `CANCELLED` status. If not cancelled, upon completion of the returned operation: * The instance successfully moves to the target instance configuration. * You are billed for compute and storage in target instance configuration. Authorization requires the `spanner.instances.update` permission on the resource instance. For more details, see [Move an instance](https://cloud.google.com/spanner/docs/move-instance).
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/move

name <> 
MoveInstanceRequest:
MoveInstanceRequest"
  [name MoveInstanceRequest]
  {:method :post,
   :uri-template "https://spanner.googleapis.com/v1/{+name}:move",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body MoveInstanceRequest})

(defn projects-instances-create
  "Creates an instance and begins preparing it to begin serving. The returned long-running operation can be used to track the progress of preparing the new instance. The instance name is assigned by the caller. If the named instance already exists, `CreateInstance` returns `ALREADY_EXISTS`. Immediately upon completion of this request: * The instance is readable via the API, with all requested attributes but no allocated resources. Its state is `CREATING`. Until completion of the returned operation: * Cancelling the operation renders the instance immediately unreadable via the API. * The instance can be deleted. * All other attempts to modify the instance are rejected. Upon completion of the returned operation: * Billing for all successfully-allocated resources begins (some types may have lower than the requested levels). * Databases can be created in the instance. * The instance's allocated resource levels are readable via the API. * The instance's state becomes `READY`. The returned long-running operation will have a name of the format `/operations/` and can be used to track creation of the instance. The metadata field type is CreateInstanceMetadata. The response field type is Instance, if successful.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/create

parent <> 
CreateInstanceRequest:
CreateInstanceRequest"
  [parent CreateInstanceRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+parent}/instances",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body CreateInstanceRequest})

(defn projects-instances-get
  "Gets information about a particular instance.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/get

name <> 

optional:
fieldMask <string> If field_mask is present, specifies the subset of Instance fields that should be returned. If absent, all Instance fields are returned."
  ([name] (projects-instances-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://spanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-testIamPermissions
  "Returns permissions that the caller has on the specified instance resource. Attempting this RPC on a non-existent Cloud Spanner instance resource will result in a NOT_FOUND error if the user has `spanner.instances.list` permission on the containing Google Cloud Project. Otherwise returns an empty set of permissions.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body TestIamPermissionsRequest})

(defn projects-instances-databases-list
  "Lists Cloud Spanner databases.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/list

parent <> 

optional:
pageSize <integer> Number of databases to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size."
  ([parent] (projects-instances-databases-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://spanner.googleapis.com/v1/{+parent}/databases",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-databases-setIamPolicy
  "Sets the access control policy on a database or backup resource. Replaces any existing policy. Authorization requires `spanner.databases.setIamPolicy` permission on resource. For backups, authorization requires `spanner.backups.setIamPolicy` permission on resource.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body SetIamPolicyRequest})

(defn projects-instances-databases-changequorum
  "`ChangeQuorum` is strictly restricted to databases that use dual-region instance configurations. Initiates a background operation to change the quorum of a database from dual-region mode to single-region mode or vice versa. The returned long-running operation has a name of the format `projects//instances//databases//operations/` and can be used to track execution of the `ChangeQuorum`. The metadata field type is ChangeQuorumMetadata. Authorization requires `spanner.databases.changequorum` permission on the resource database.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/changequorum

name <> 
ChangeQuorumRequest:
ChangeQuorumRequest"
  [name ChangeQuorumRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+name}:changequorum",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body ChangeQuorumRequest})

(defn projects-instances-databases-patch
  "Updates a Cloud Spanner database. The returned long-running operation can be used to track the progress of updating the database. If the named database does not exist, returns `NOT_FOUND`. While the operation is pending: * The database's reconciling field is set to true. * Cancelling the operation is best-effort. If the cancellation succeeds, the operation metadata's cancel_time is set, the updates are reverted, and the operation terminates with a `CANCELLED` status. * New UpdateDatabase requests will return a `FAILED_PRECONDITION` error until the pending operation is done (returns successfully or with error). * Reading the database via the API continues to give the pre-request values. Upon completion of the returned operation: * The new values are in effect and readable via the API. * The database's reconciling field becomes false. The returned long-running operation will have a name of the format `projects//instances//databases//operations/` and can be used to track the database modification. The metadata field type is UpdateDatabaseMetadata. The response field type is Database, if successful.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/patch

name <> 
Database:
Database

optional:
updateMask <string> Required. The list of fields to update. Currently, only `enable_drop_protection` field can be updated."
  ([name Database]
    (projects-instances-databases-patch name Database nil))
  ([name Database optional]
    {:method :patch,
     :uri-template "https://spanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"],
     :body Database}))

(defn projects-instances-databases-getIamPolicy
  "Gets the access control policy for a database or backup resource. Returns an empty policy if a database or backup exists but does not have a policy set. Authorization requires `spanner.databases.getIamPolicy` permission on resource. For backups, authorization requires `spanner.backups.getIamPolicy` permission on resource.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body GetIamPolicyRequest})

(defn projects-instances-databases-updateDdl
  "Updates the schema of a Cloud Spanner database by creating/altering/dropping tables, columns, indexes, etc. The returned long-running operation will have a name of the format `/operations/` and can be used to track execution of the schema change(s). The metadata field type is UpdateDatabaseDdlMetadata. The operation has no response.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/updateDdl

database <> 
UpdateDatabaseDdlRequest:
UpdateDatabaseDdlRequest"
  [database UpdateDatabaseDdlRequest]
  {:method :patch,
   :uri-template "https://spanner.googleapis.com/v1/{+database}/ddl",
   :uri-template-args {"database" database},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body UpdateDatabaseDdlRequest})

(defn projects-instances-databases-create
  "Creates a new Spanner database and starts to prepare it for serving. The returned long-running operation will have a name of the format `/operations/` and can be used to track preparation of the database. The metadata field type is CreateDatabaseMetadata. The response field type is Database, if successful.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/create

parent <> 
CreateDatabaseRequest:
CreateDatabaseRequest"
  [parent CreateDatabaseRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+parent}/databases",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body CreateDatabaseRequest})

(defn projects-instances-databases-getDdl
  "Returns the schema of a Cloud Spanner database as a list of formatted DDL statements. This method does not show pending schema updates, those may be queried using the Operations API.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/getDdl

database <> "
  [database]
  {:method :get,
   :uri-template "https://spanner.googleapis.com/v1/{+database}/ddl",
   :uri-template-args {"database" database},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-databases-restore
  "Create a new database by restoring from a completed backup. The new database must be in the same project and in an instance with the same instance configuration as the instance containing the backup. The returned database long-running operation has a name of the format `projects//instances//databases//operations/`, and can be used to track the progress of the operation, and to cancel it. The metadata field type is RestoreDatabaseMetadata. The response type is Database, if successful. Cancelling the returned operation will stop the restore and delete the database. There can be only one database being restored into an instance at a time. Once the restore operation completes, a new restore operation can be initiated, without waiting for the optimize operation associated with the first restore to complete.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/restore

parent <> 
RestoreDatabaseRequest:
RestoreDatabaseRequest"
  [parent RestoreDatabaseRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+parent}/databases:restore",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body RestoreDatabaseRequest})

(defn projects-instances-databases-dropDatabase
  "Drops (aka deletes) a Cloud Spanner database. Completed backups for the database will be retained according to their `expire_time`. Note: Cloud Spanner might continue to accept requests for a few seconds after the database has been deleted.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/dropDatabase

database <> "
  [database]
  {:method :delete,
   :uri-template "https://spanner.googleapis.com/v1/{+database}",
   :uri-template-args {"database" database},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-databases-get
  "Gets the state of a Cloud Spanner database.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-databases-getScans
  "Request a specific scan with Database-specific data for Cloud Key Visualizer.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/getScans

name <> 

optional:
view <string> Specifies which parts of the Scan should be returned in the response. Note, if left unspecified, the FULL view is assumed.
startTime <string> These fields restrict the Database-specific information returned in the `Scan.data` field. If a `View` is provided that does not include the `Scan.data` field, these are ignored. This range of time must be entirely contained within the defined time range of the targeted scan. The lower bound for the time range to retrieve Scan data for.
endTime <string> The upper bound for the time range to retrieve Scan data for."
  ([name] (projects-instances-databases-getScans name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://spanner.googleapis.com/v1/{+name}/scans",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.data"]}))

(defn projects-instances-databases-testIamPermissions
  "Returns permissions that the caller has on the specified database or backup resource. Attempting this RPC on a non-existent Cloud Spanner database will result in a NOT_FOUND error if the user has `spanner.databases.list` permission on the containing Cloud Spanner instance. Otherwise returns an empty set of permissions. Calling this method on a backup that does not exist will result in a NOT_FOUND error if the user has `spanner.backups.list` permission on the containing instance.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body TestIamPermissionsRequest})

(defn projects-instances-databases-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-instances-databases-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://spanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-databases-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-databases-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-databases-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/operations/cancel

name <> "
  [name]
  {:method :post,
   :uri-template "https://spanner.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-databases-backupSchedules-setIamPolicy
  "Sets the access control policy on a database or backup resource. Replaces any existing policy. Authorization requires `spanner.databases.setIamPolicy` permission on resource. For backups, authorization requires `spanner.backups.setIamPolicy` permission on resource.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/backupSchedules/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body SetIamPolicyRequest})

(defn projects-instances-databases-backupSchedules-getIamPolicy
  "Gets the access control policy for a database or backup resource. Returns an empty policy if a database or backup exists but does not have a policy set. Authorization requires `spanner.databases.getIamPolicy` permission on resource. For backups, authorization requires `spanner.backups.getIamPolicy` permission on resource.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/backupSchedules/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body GetIamPolicyRequest})

(defn projects-instances-databases-backupSchedules-testIamPermissions
  "Returns permissions that the caller has on the specified database or backup resource. Attempting this RPC on a non-existent Cloud Spanner database will result in a NOT_FOUND error if the user has `spanner.databases.list` permission on the containing Cloud Spanner instance. Otherwise returns an empty set of permissions. Calling this method on a backup that does not exist will result in a NOT_FOUND error if the user has `spanner.backups.list` permission on the containing instance.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/backupSchedules/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body TestIamPermissionsRequest})

(defn projects-instances-databases-backupSchedules-create
  "Creates a new backup schedule.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/backupSchedules/create

parent <> 
BackupSchedule:
BackupSchedule

optional:
backupScheduleId <string> Required. The Id to use for the backup schedule. The `backup_schedule_id` appended to `parent` forms the full backup schedule name of the form `projects//instances//databases//backupSchedules/`."
  ([parent BackupSchedule]
    (projects-instances-databases-backupSchedules-create
      parent
      BackupSchedule
      nil))
  ([parent BackupSchedule optional]
    {:method :post,
     :uri-template
     "https://spanner.googleapis.com/v1/{+parent}/backupSchedules",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"],
     :body BackupSchedule}))

(defn projects-instances-databases-backupSchedules-get
  "Gets backup schedule for the input schedule name.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/backupSchedules/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-databases-backupSchedules-patch
  "Updates a backup schedule.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/backupSchedules/patch

name <> 
BackupSchedule:
BackupSchedule

optional:
updateMask <string> Required. A mask specifying which fields in the BackupSchedule resource should be updated. This mask is relative to the BackupSchedule resource, not to the request message. The field mask must always be specified; this prevents any future fields from being erased accidentally."
  ([name BackupSchedule]
    (projects-instances-databases-backupSchedules-patch
      name
      BackupSchedule
      nil))
  ([name BackupSchedule optional]
    {:method :patch,
     :uri-template "https://spanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"],
     :body BackupSchedule}))

(defn projects-instances-databases-backupSchedules-delete
  "Deletes a backup schedule.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/backupSchedules/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-databases-backupSchedules-list
  "Lists all the backup schedules for the database.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/backupSchedules/list

parent <> 

optional:
pageSize <integer> Optional. Number of backup schedules to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size."
  ([parent]
    (projects-instances-databases-backupSchedules-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://spanner.googleapis.com/v1/{+parent}/backupSchedules",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-databases-databaseRoles-testIamPermissions
  "Returns permissions that the caller has on the specified database or backup resource. Attempting this RPC on a non-existent Cloud Spanner database will result in a NOT_FOUND error if the user has `spanner.databases.list` permission on the containing Cloud Spanner instance. Otherwise returns an empty set of permissions. Calling this method on a backup that does not exist will result in a NOT_FOUND error if the user has `spanner.backups.list` permission on the containing instance.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/databaseRoles/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body TestIamPermissionsRequest})

(defn projects-instances-databases-databaseRoles-list
  "Lists Cloud Spanner database roles.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/databaseRoles/list

parent <> 

optional:
pageSize <integer> Number of database roles to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size."
  ([parent]
    (projects-instances-databases-databaseRoles-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://spanner.googleapis.com/v1/{+parent}/databaseRoles",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-databases-sessions-batchCreate
  "Creates multiple new sessions. This API can be used to initialize a session cache on the clients. See https://goo.gl/TgSFN2 for best practices on session cache management.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/batchCreate

database <> 
BatchCreateSessionsRequest:
BatchCreateSessionsRequest"
  [database BatchCreateSessionsRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+database}/sessions:batchCreate",
   :uri-template-args {"database" database},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"],
   :body BatchCreateSessionsRequest})

(defn projects-instances-databases-sessions-list
  "Lists all sessions in a given database.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/list

database <> 

optional:
pageSize <integer> Number of sessions to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
filter <string> An expression for filtering the results of the request. Filter rules are case insensitive. The fields eligible for filtering are: * `labels.key` where key is the name of a label Some examples of using filters are: * `labels.env:*` --> The session has the label \"env\". * `labels.env:dev` --> The session has the label \"env\" and the value of the label contains the string \"dev\"."
  ([database]
    (projects-instances-databases-sessions-list database nil))
  ([database optional]
    {:method :get,
     :uri-template
     "https://spanner.googleapis.com/v1/{+database}/sessions",
     :uri-template-args {"database" database},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.data"]}))

(defn projects-instances-databases-sessions-delete
  "Ends a session, releasing server resources associated with it. This will asynchronously trigger cancellation of any operations that are running with this session.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"]})

(defn projects-instances-databases-sessions-read
  "Reads rows from the database using key lookups and scans, as a simple key/value style alternative to ExecuteSql. This method cannot be used to return a result set larger than 10 MiB; if the read matches more data than that, the read fails with a `FAILED_PRECONDITION` error. Reads inside read-write transactions might return `ABORTED`. If this occurs, the application should restart the transaction from the beginning. See Transaction for more details. Larger result sets can be yielded in streaming fashion by calling StreamingRead instead.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/read

session <> 
ReadRequest:
ReadRequest"
  [session ReadRequest]
  {:method :post,
   :uri-template "https://spanner.googleapis.com/v1/{+session}:read",
   :uri-template-args {"session" session},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"],
   :body ReadRequest})

(defn projects-instances-databases-sessions-executeBatchDml
  "Executes a batch of SQL DML statements. This method allows many statements to be run with lower latency than submitting them sequentially with ExecuteSql. Statements are executed in sequential order. A request can succeed even if a statement fails. The ExecuteBatchDmlResponse.status field in the response provides information about the statement that failed. Clients must inspect this field to determine whether an error occurred. Execution stops after the first failed statement; the remaining statements are not executed.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/executeBatchDml

session <> 
ExecuteBatchDmlRequest:
ExecuteBatchDmlRequest"
  [session ExecuteBatchDmlRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+session}:executeBatchDml",
   :uri-template-args {"session" session},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"],
   :body ExecuteBatchDmlRequest})

(defn projects-instances-databases-sessions-commit
  "Commits a transaction. The request includes the mutations to be applied to rows in the database. `Commit` might return an `ABORTED` error. This can occur at any time; commonly, the cause is conflicts with concurrent transactions. However, it can also happen for a variety of other reasons. If `Commit` returns `ABORTED`, the caller should re-attempt the transaction from the beginning, re-using the same session. On very rare occasions, `Commit` might return `UNKNOWN`. This can happen, for example, if the client job experiences a 1+ hour networking failure. At that point, Cloud Spanner has lost track of the transaction outcome and we recommend that you perform another read from the database to see the state of things as they are now.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/commit

session <> 
CommitRequest:
CommitRequest"
  [session CommitRequest]
  {:method :post,
   :uri-template "https://spanner.googleapis.com/v1/{+session}:commit",
   :uri-template-args {"session" session},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"],
   :body CommitRequest})

(defn projects-instances-databases-sessions-batchWrite
  "Batches the supplied mutation groups in a collection of efficient transactions. All mutations in a group are committed atomically. However, mutations across groups can be committed non-atomically in an unspecified order and thus, they must be independent of each other. Partial failure is possible, i.e., some groups may have been committed successfully, while some may have failed. The results of individual batches are streamed into the response as the batches are applied. BatchWrite requests are not replay protected, meaning that each mutation group may be applied more than once. Replays of non-idempotent mutations may have undesirable effects. For example, replays of an insert mutation may produce an already exists error or if you use generated or commit timestamp-based keys, it may result in additional rows being added to the mutation's table. We recommend structuring your mutation groups to be idempotent to avoid this issue.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/batchWrite

session <> 
BatchWriteRequest:
BatchWriteRequest"
  [session BatchWriteRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+session}:batchWrite",
   :uri-template-args {"session" session},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"],
   :body BatchWriteRequest})

(defn projects-instances-databases-sessions-partitionQuery
  "Creates a set of partition tokens that can be used to execute a query operation in parallel. Each of the returned partition tokens can be used by ExecuteStreamingSql to specify a subset of the query result to read. The same session and read-only transaction must be used by the PartitionQueryRequest used to create the partition tokens and the ExecuteSqlRequests that use the partition tokens. Partition tokens become invalid when the session used to create them is deleted, is idle for too long, begins a new transaction, or becomes too old. When any of these happen, it is not possible to resume the query, and the whole operation must be restarted from the beginning.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/partitionQuery

session <> 
PartitionQueryRequest:
PartitionQueryRequest"
  [session PartitionQueryRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+session}:partitionQuery",
   :uri-template-args {"session" session},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"],
   :body PartitionQueryRequest})

(defn projects-instances-databases-sessions-executeSql
  "Executes an SQL statement, returning all results in a single reply. This method cannot be used to return a result set larger than 10 MiB; if the query yields more data than that, the query fails with a `FAILED_PRECONDITION` error. Operations inside read-write transactions might return `ABORTED`. If this occurs, the application should restart the transaction from the beginning. See Transaction for more details. Larger result sets can be fetched in streaming fashion by calling ExecuteStreamingSql instead.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/executeSql

session <> 
ExecuteSqlRequest:
ExecuteSqlRequest"
  [session ExecuteSqlRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+session}:executeSql",
   :uri-template-args {"session" session},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"],
   :body ExecuteSqlRequest})

(defn projects-instances-databases-sessions-streamingRead
  "Like Read, except returns the result set as a stream. Unlike Read, there is no limit on the size of the returned result set. However, no individual row in the result set can exceed 100 MiB, and no column value can exceed 10 MiB.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/streamingRead

session <> 
ReadRequest:
ReadRequest"
  [session ReadRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+session}:streamingRead",
   :uri-template-args {"session" session},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"],
   :body ReadRequest})

(defn projects-instances-databases-sessions-partitionRead
  "Creates a set of partition tokens that can be used to execute a read operation in parallel. Each of the returned partition tokens can be used by StreamingRead to specify a subset of the read result to read. The same session and read-only transaction must be used by the PartitionReadRequest used to create the partition tokens and the ReadRequests that use the partition tokens. There are no ordering guarantees on rows returned among the returned partition tokens, or even within each individual StreamingRead call issued with a partition_token. Partition tokens become invalid when the session used to create them is deleted, is idle for too long, begins a new transaction, or becomes too old. When any of these happen, it is not possible to resume the read, and the whole operation must be restarted from the beginning.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/partitionRead

session <> 
PartitionReadRequest:
PartitionReadRequest"
  [session PartitionReadRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+session}:partitionRead",
   :uri-template-args {"session" session},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"],
   :body PartitionReadRequest})

(defn projects-instances-databases-sessions-create
  "Creates a new session. A session can be used to perform transactions that read and/or modify data in a Cloud Spanner database. Sessions are meant to be reused for many consecutive transactions. Sessions can only execute one transaction at a time. To execute multiple concurrent read-write/write-only transactions, create multiple sessions. Note that standalone reads and queries use a transaction internally, and count toward the one transaction limit. Active sessions use additional server resources, so it is a good idea to delete idle and unneeded sessions. Aside from explicit deletes, Cloud Spanner may delete sessions for which no operations are sent for more than an hour. If a session is deleted, requests to it return `NOT_FOUND`. Idle sessions can be kept alive by sending a trivial SQL query periodically, e.g., `\"SELECT 1\"`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/create

database <> 
CreateSessionRequest:
CreateSessionRequest"
  [database CreateSessionRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+database}/sessions",
   :uri-template-args {"database" database},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"],
   :body CreateSessionRequest})

(defn projects-instances-databases-sessions-rollback
  "Rolls back a transaction, releasing any locks it holds. It is a good idea to call this for any transaction that includes one or more Read or ExecuteSql requests and ultimately decides not to commit. `Rollback` returns `OK` if it successfully aborts the transaction, the transaction was already aborted, or the transaction is not found. `Rollback` never returns `ABORTED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/rollback

session <> 
RollbackRequest:
RollbackRequest"
  [session RollbackRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+session}:rollback",
   :uri-template-args {"session" session},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"],
   :body RollbackRequest})

(defn projects-instances-databases-sessions-beginTransaction
  "Begins a new transaction. This step can often be skipped: Read, ExecuteSql and Commit can begin a new transaction as a side-effect.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/beginTransaction

session <> 
BeginTransactionRequest:
BeginTransactionRequest"
  [session BeginTransactionRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+session}:beginTransaction",
   :uri-template-args {"session" session},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"],
   :body BeginTransactionRequest})

(defn projects-instances-databases-sessions-get
  "Gets a session. Returns `NOT_FOUND` if the session does not exist. This is mainly useful for determining whether a session is still alive.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"]})

(defn projects-instances-databases-sessions-executeStreamingSql
  "Like ExecuteSql, except returns the result set as a stream. Unlike ExecuteSql, there is no limit on the size of the returned result set. However, no individual row in the result set can exceed 100 MiB, and no column value can exceed 10 MiB.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databases/sessions/executeStreamingSql

session <> 
ExecuteSqlRequest:
ExecuteSqlRequest"
  [session ExecuteSqlRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+session}:executeStreamingSql",
   :uri-template-args {"session" session},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.data"],
   :body ExecuteSqlRequest})

(defn projects-instances-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-instances-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://spanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/operations/cancel

name <> "
  [name]
  {:method :post,
   :uri-template "https://spanner.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-backups-list
  "Lists completed and pending backups. Backups returned are ordered by `create_time` in descending order, starting from the most recent `create_time`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backups/list

parent <> 

optional:
filter <string> An expression that filters the list of returned backups. A filter expression consists of a field name, a comparison operator, and a value for filtering. The value must be a string, a number, or a boolean. The comparison operator must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`. Colon `:` is the contains operator. Filter rules are not case sensitive. The following fields in the Backup are eligible for filtering: * `name` * `database` * `state` * `create_time` (and values are of the format YYYY-MM-DDTHH:MM:SSZ) * `expire_time` (and values are of the format YYYY-MM-DDTHH:MM:SSZ) * `version_time` (and values are of the format YYYY-MM-DDTHH:MM:SSZ) * `size_bytes` * `backup_schedules` You can combine multiple expressions by enclosing each expression in parentheses. By default, expressions are combined with AND logic, but you can specify AND, OR, and NOT logic explicitly. Here are a few examples: * `name:Howl` - The backup's name contains the string \"howl\". * `database:prod` - The database's name contains the string \"prod\". * `state:CREATING` - The backup is pending creation. * `state:READY` - The backup is fully created and ready for use. * `(name:howl) AND (create_time < \\\"2018-03-28T14:50:00Z\\\")` - The backup name contains the string \"howl\" and `create_time` of the backup is before 2018-03-28T14:50:00Z. * `expire_time < \\\"2018-03-28T14:50:00Z\\\"` - The backup `expire_time` is before 2018-03-28T14:50:00Z. * `size_bytes > 10000000000` - The backup's size is greater than 10GB * `backup_schedules:daily` - The backup is created from a schedule with \"daily\" in its name.
pageSize <integer> Number of backups to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size."
  ([parent] (projects-instances-backups-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://spanner.googleapis.com/v1/{+parent}/backups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-backups-setIamPolicy
  "Sets the access control policy on a database or backup resource. Replaces any existing policy. Authorization requires `spanner.databases.setIamPolicy` permission on resource. For backups, authorization requires `spanner.backups.setIamPolicy` permission on resource.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backups/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body SetIamPolicyRequest})

(defn projects-instances-backups-copy
  "Starts copying a Cloud Spanner Backup. The returned backup long-running operation will have a name of the format `projects//instances//backups//operations/` and can be used to track copying of the backup. The operation is associated with the destination backup. The metadata field type is CopyBackupMetadata. The response field type is Backup, if successful. Cancelling the returned operation will stop the copying and delete the destination backup. Concurrent CopyBackup requests can run on the same source backup.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backups/copy

parent <> 
CopyBackupRequest:
CopyBackupRequest"
  [parent CopyBackupRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+parent}/backups:copy",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body CopyBackupRequest})

(defn projects-instances-backups-delete
  "Deletes a pending or completed Backup.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backups/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-backups-patch
  "Updates a pending or completed Backup.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backups/patch

name <> 
Backup:
Backup

optional:
updateMask <string> Required. A mask specifying which fields (e.g. `expire_time`) in the Backup resource should be updated. This mask is relative to the Backup resource, not to the request message. The field mask must always be specified; this prevents any future fields from being erased accidentally by clients that do not know about them."
  ([name Backup] (projects-instances-backups-patch name Backup nil))
  ([name Backup optional]
    {:method :patch,
     :uri-template "https://spanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"],
     :body Backup}))

(defn projects-instances-backups-getIamPolicy
  "Gets the access control policy for a database or backup resource. Returns an empty policy if a database or backup exists but does not have a policy set. Authorization requires `spanner.databases.getIamPolicy` permission on resource. For backups, authorization requires `spanner.backups.getIamPolicy` permission on resource.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backups/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body GetIamPolicyRequest})

(defn projects-instances-backups-create
  "Starts creating a new Cloud Spanner Backup. The returned backup long-running operation will have a name of the format `projects//instances//backups//operations/` and can be used to track creation of the backup. The metadata field type is CreateBackupMetadata. The response field type is Backup, if successful. Cancelling the returned operation will stop the creation and delete the backup. There can be only one pending backup creation per database. Backup creation of different databases can run concurrently.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backups/create

parent <> 
Backup:
Backup

optional:
backupId <string> Required. The id of the backup to be created. The `backup_id` appended to `parent` forms the full backup name of the form `projects//instances//backups/`.
encryptionConfig.encryptionType <string> Required. The encryption type of the backup.
encryptionConfig.kmsKeyName <string> Optional. The Cloud KMS key that will be used to protect the backup. This field should be set only when encryption_type is `CUSTOMER_MANAGED_ENCRYPTION`. Values are of the form `projects//locations//keyRings//cryptoKeys/`.
encryptionConfig.kmsKeyNames <string> Optional. Specifies the KMS configuration for the one or more keys used to protect the backup. Values are of the form `projects//locations//keyRings//cryptoKeys/`. The keys referenced by kms_key_names must fully cover all regions of the backup's instance configuration. Some examples: * For single region instance configs, specify a single regional location KMS key. * For multi-regional instance configs of type GOOGLE_MANAGED, either specify a multi-regional location KMS key or multiple regional location KMS keys that cover all regions in the instance config. * For an instance config of type USER_MANAGED, please specify only regional location KMS keys to cover each region in the instance config. Multi-regional location KMS keys are not supported for USER_MANAGED instance configs."
  ([parent Backup]
    (projects-instances-backups-create parent Backup nil))
  ([parent Backup optional]
    {:method :post,
     :uri-template
     "https://spanner.googleapis.com/v1/{+parent}/backups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"],
     :body Backup}))

(defn projects-instances-backups-get
  "Gets metadata on a pending or completed Backup.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backups/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-backups-testIamPermissions
  "Returns permissions that the caller has on the specified database or backup resource. Attempting this RPC on a non-existent Cloud Spanner database will result in a NOT_FOUND error if the user has `spanner.databases.list` permission on the containing Cloud Spanner instance. Otherwise returns an empty set of permissions. Calling this method on a backup that does not exist will result in a NOT_FOUND error if the user has `spanner.backups.list` permission on the containing instance.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backups/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body TestIamPermissionsRequest})

(defn projects-instances-backups-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backups/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-instances-backups-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://spanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-backups-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backups/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-backups-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backups/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-backups-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backups/operations/cancel

name <> "
  [name]
  {:method :post,
   :uri-template "https://spanner.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-databaseOperations-list
  "Lists database longrunning-operations. A database operation has a name of the form `projects//instances//databases//operations/`. The long-running operation metadata field type `metadata.type_url` describes the type of the metadata. Operations returned include those that have completed/failed/canceled within the last 7 days, and pending operations.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/databaseOperations/list

parent <> 

optional:
filter <string> An expression that filters the list of returned operations. A filter expression consists of a field name, a comparison operator, and a value for filtering. The value must be a string, a number, or a boolean. The comparison operator must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`. Colon `:` is the contains operator. Filter rules are not case sensitive. The following fields in the Operation are eligible for filtering: * `name` - The name of the long-running operation * `done` - False if the operation is in progress, else true. * `metadata.@type` - the type of metadata. For example, the type string for RestoreDatabaseMetadata is `type.googleapis.com/google.spanner.admin.database.v1.RestoreDatabaseMetadata`. * `metadata.` - any field in metadata.value. `metadata.@type` must be specified first, if filtering on metadata fields. * `error` - Error associated with the long-running operation. * `response.@type` - the type of response. * `response.` - any field in response.value. You can combine multiple expressions by enclosing each expression in parentheses. By default, expressions are combined with AND logic. However, you can specify AND, OR, and NOT logic explicitly. Here are a few examples: * `done:true` - The operation is complete. * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.RestoreDatabaseMetadata) AND` \\ `(metadata.source_type:BACKUP) AND` \\ `(metadata.backup_info.backup:backup_howl) AND` \\ `(metadata.name:restored_howl) AND` \\ `(metadata.progress.start_time < \\\"2018-03-28T14:50:00Z\\\") AND` \\ `(error:*)` - Return operations where: * The operation's metadata type is RestoreDatabaseMetadata. * The database is restored from a backup. * The backup name contains \"backup_howl\". * The restored database's name contains \"restored_howl\". * The operation started before 2018-03-28T14:50:00Z. * The operation resulted in an error.
pageSize <integer> Number of operations to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size."
  ([parent] (projects-instances-databaseOperations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://spanner.googleapis.com/v1/{+parent}/databaseOperations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-backupOperations-list
  "Lists the backup long-running operations in the given instance. A backup operation has a name of the form `projects//instances//backups//operations/`. The long-running operation metadata field type `metadata.type_url` describes the type of the metadata. Operations returned include those that have completed/failed/canceled within the last 7 days, and pending operations. Operations returned are ordered by `operation.metadata.value.progress.start_time` in descending order starting from the most recently started operation.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/backupOperations/list

parent <> 

optional:
filter <string> An expression that filters the list of returned backup operations. A filter expression consists of a field name, a comparison operator, and a value for filtering. The value must be a string, a number, or a boolean. The comparison operator must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`. Colon `:` is the contains operator. Filter rules are not case sensitive. The following fields in the operation are eligible for filtering: * `name` - The name of the long-running operation * `done` - False if the operation is in progress, else true. * `metadata.@type` - the type of metadata. For example, the type string for CreateBackupMetadata is `type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata`. * `metadata.` - any field in metadata.value. `metadata.@type` must be specified first if filtering on metadata fields. * `error` - Error associated with the long-running operation. * `response.@type` - the type of response. * `response.` - any field in response.value. You can combine multiple expressions by enclosing each expression in parentheses. By default, expressions are combined with AND logic, but you can specify AND, OR, and NOT logic explicitly. Here are a few examples: * `done:true` - The operation is complete. * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata) AND` \\ `metadata.database:prod` - Returns operations where: * The operation's metadata type is CreateBackupMetadata. * The source database name of backup contains the string \"prod\". * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata) AND` \\ `(metadata.name:howl) AND` \\ `(metadata.progress.start_time < \\\"2018-03-28T14:50:00Z\\\") AND` \\ `(error:*)` - Returns operations where: * The operation's metadata type is CreateBackupMetadata. * The backup name contains the string \"howl\". * The operation started before 2018-03-28T14:50:00Z. * The operation resulted in an error. * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CopyBackupMetadata) AND` \\ `(metadata.source_backup:test) AND` \\ `(metadata.progress.start_time < \\\"2022-01-18T14:50:00Z\\\") AND` \\ `(error:*)` - Returns operations where: * The operation's metadata type is CopyBackupMetadata. * The source backup name contains the string \"test\". * The operation started before 2022-01-18T14:50:00Z. * The operation resulted in an error. * `((metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata) AND` \\ `(metadata.database:test_db)) OR` \\ `((metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CopyBackupMetadata) AND` \\ `(metadata.source_backup:test_bkp)) AND` \\ `(error:*)` - Returns operations where: * The operation's metadata matches either of criteria: * The operation's metadata type is CreateBackupMetadata AND the source database name of the backup contains the string \"test_db\" * The operation's metadata type is CopyBackupMetadata AND the source backup name contains the string \"test_bkp\" * The operation resulted in an error.
pageSize <integer> Number of operations to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size."
  ([parent] (projects-instances-backupOperations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://spanner.googleapis.com/v1/{+parent}/backupOperations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-instancePartitions-list
  "Lists all instance partitions for the given instance.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/instancePartitions/list

parent <> 

optional:
pageSize <integer> Number of instance partitions to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
instancePartitionDeadline <string> Optional. Deadline used while retrieving metadata for instance partitions. Instance partitions whose metadata cannot be retrieved within this deadline will be added to unreachable in ListInstancePartitionsResponse."
  ([parent] (projects-instances-instancePartitions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://spanner.googleapis.com/v1/{+parent}/instancePartitions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-instancePartitions-get
  "Gets information about a particular instance partition.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/instancePartitions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-instancePartitions-create
  "Creates an instance partition and begins preparing it to be used. The returned long-running operation can be used to track the progress of preparing the new instance partition. The instance partition name is assigned by the caller. If the named instance partition already exists, `CreateInstancePartition` returns `ALREADY_EXISTS`. Immediately upon completion of this request: * The instance partition is readable via the API, with all requested attributes but no allocated resources. Its state is `CREATING`. Until completion of the returned operation: * Cancelling the operation renders the instance partition immediately unreadable via the API. * The instance partition can be deleted. * All other attempts to modify the instance partition are rejected. Upon completion of the returned operation: * Billing for all successfully-allocated resources begins (some types may have lower than the requested levels). * Databases can start using this instance partition. * The instance partition's allocated resource levels are readable via the API. * The instance partition's state becomes `READY`. The returned long-running operation will have a name of the format `/operations/` and can be used to track creation of the instance partition. The metadata field type is CreateInstancePartitionMetadata. The response field type is InstancePartition, if successful.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/instancePartitions/create

parent <> 
CreateInstancePartitionRequest:
CreateInstancePartitionRequest"
  [parent CreateInstancePartitionRequest]
  {:method :post,
   :uri-template
   "https://spanner.googleapis.com/v1/{+parent}/instancePartitions",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body CreateInstancePartitionRequest})

(defn projects-instances-instancePartitions-delete
  "Deletes an existing instance partition. Requires that the instance partition is not used by any database or backup and is not the default instance partition of an instance. Authorization requires `spanner.instancePartitions.delete` permission on the resource name.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/instancePartitions/delete

name <> 

optional:
etag <string> Optional. If not empty, the API only deletes the instance partition when the etag provided matches the current status of the requested instance partition. Otherwise, deletes the instance partition without checking the current status of the requested instance partition."
  ([name] (projects-instances-instancePartitions-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://spanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-instancePartitions-patch
  "Updates an instance partition, and begins allocating or releasing resources as requested. The returned long-running operation can be used to track the progress of updating the instance partition. If the named instance partition does not exist, returns `NOT_FOUND`. Immediately upon completion of this request: * For resource types for which a decrease in the instance partition's allocation has been requested, billing is based on the newly-requested level. Until completion of the returned operation: * Cancelling the operation sets its metadata's cancel_time, and begins restoring resources to their pre-request values. The operation is guaranteed to succeed at undoing all resource changes, after which point it terminates with a `CANCELLED` status. * All other attempts to modify the instance partition are rejected. * Reading the instance partition via the API continues to give the pre-request resource levels. Upon completion of the returned operation: * Billing begins for all successfully-allocated resources (some types may have lower than the requested levels). * All newly-reserved resources are available for serving the instance partition's tables. * The instance partition's new resource levels are readable via the API. The returned long-running operation will have a name of the format `/operations/` and can be used to track the instance partition modification. The metadata field type is UpdateInstancePartitionMetadata. The response field type is InstancePartition, if successful. Authorization requires `spanner.instancePartitions.update` permission on the resource name.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/instancePartitions/patch

name <> 
UpdateInstancePartitionRequest:
UpdateInstancePartitionRequest"
  [name UpdateInstancePartitionRequest]
  {:method :patch,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"],
   :body UpdateInstancePartitionRequest})

(defn projects-instances-instancePartitions-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/instancePartitions/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name]
    (projects-instances-instancePartitions-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://spanner.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))

(defn projects-instances-instancePartitions-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/instancePartitions/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-instancePartitions-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/instancePartitions/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://spanner.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-instancePartitions-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/instancePartitions/operations/cancel

name <> "
  [name]
  {:method :post,
   :uri-template "https://spanner.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/spanner.admin"]})

(defn projects-instances-instancePartitionOperations-list
  "Lists instance partition long-running operations in the given instance. An instance partition operation has a name of the form `projects//instances//instancePartitions//operations/`. The long-running operation metadata field type `metadata.type_url` describes the type of the metadata. Operations returned include those that have completed/failed/canceled within the last 7 days, and pending operations. Operations returned are ordered by `operation.metadata.value.start_time` in descending order starting from the most recently started operation. Authorization requires `spanner.instancePartitionOperations.list` permission on the resource parent.
https://cloud.google.com/spanner/v1/reference/rest/v1/projects/instances/instancePartitionOperations/list

parent <> 

optional:
filter <string> Optional. An expression that filters the list of returned operations. A filter expression consists of a field name, a comparison operator, and a value for filtering. The value must be a string, a number, or a boolean. The comparison operator must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`. Colon `:` is the contains operator. Filter rules are not case sensitive. The following fields in the Operation are eligible for filtering: * `name` - The name of the long-running operation * `done` - False if the operation is in progress, else true. * `metadata.@type` - the type of metadata. For example, the type string for CreateInstancePartitionMetadata is `type.googleapis.com/google.spanner.admin.instance.v1.CreateInstancePartitionMetadata`. * `metadata.` - any field in metadata.value. `metadata.@type` must be specified first, if filtering on metadata fields. * `error` - Error associated with the long-running operation. * `response.@type` - the type of response. * `response.` - any field in response.value. You can combine multiple expressions by enclosing each expression in parentheses. By default, expressions are combined with AND logic. However, you can specify AND, OR, and NOT logic explicitly. Here are a few examples: * `done:true` - The operation is complete. * `(metadata.@type=` \\ `type.googleapis.com/google.spanner.admin.instance.v1.CreateInstancePartitionMetadata) AND` \\ `(metadata.instance_partition.name:custom-instance-partition) AND` \\ `(metadata.start_time < \\\"2021-03-28T14:50:00Z\\\") AND` \\ `(error:*)` - Return operations where: * The operation's metadata type is CreateInstancePartitionMetadata. * The instance partition name contains \"custom-instance-partition\". * The operation started before 2021-03-28T14:50:00Z. * The operation resulted in an error.
pageSize <integer> Optional. Number of operations to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
instancePartitionDeadline <string> Optional. Deadline used while retrieving metadata for instance partition operations. Instance partitions whose operation metadata cannot be retrieved within this deadline will be added to unreachable in ListInstancePartitionOperationsResponse."
  ([parent]
    (projects-instances-instancePartitionOperations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://spanner.googleapis.com/v1/{+parent}/instancePartitionOperations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/spanner.admin"]}))
