(ns happyapi.google.composer-v1
  "Cloud Composer API
Manages Apache Airflow environments on Google Cloud Platform.
See: https://cloud.google.com/composer/")

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://composer.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://composer.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://composer.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-environments-stopAirflowCommand
  "Stops Airflow CLI command execution.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/stopAirflowCommand

environment <> 
StopAirflowCommandRequest:
StopAirflowCommandRequest"
  [environment StopAirflowCommandRequest]
  {:method :post,
   :uri-template
   "https://composer.googleapis.com/v1/{+environment}:stopAirflowCommand",
   :uri-template-args {"environment" environment},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body StopAirflowCommandRequest})

(defn projects-locations-environments-fetchDatabaseProperties
  "Fetches database properties.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/fetchDatabaseProperties

environment <> "
  [environment]
  {:method :get,
   :uri-template
   "https://composer.googleapis.com/v1/{+environment}:fetchDatabaseProperties",
   :uri-template-args {"environment" environment},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-environments-saveSnapshot
  "Creates a snapshots of a Cloud Composer environment. As a result of this operation, snapshot of environment's state is stored in a location specified in the SaveSnapshotRequest.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/saveSnapshot

environment <> 
SaveSnapshotRequest:
SaveSnapshotRequest"
  [environment SaveSnapshotRequest]
  {:method :post,
   :uri-template
   "https://composer.googleapis.com/v1/{+environment}:saveSnapshot",
   :uri-template-args {"environment" environment},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SaveSnapshotRequest})

(defn projects-locations-environments-list
  "List environments.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/list

parent <> 

optional:
pageSize <integer> The maximum number of environments to return."
  ([parent] (projects-locations-environments-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://composer.googleapis.com/v1/{+parent}/environments",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-environments-delete
  "Delete an environment.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://composer.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-environments-checkUpgrade
  "Check if an upgrade operation on the environment will succeed. In case of problems detailed info can be found in the returned Operation.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/checkUpgrade

environment <> 
CheckUpgradeRequest:
CheckUpgradeRequest"
  [environment CheckUpgradeRequest]
  {:method :post,
   :uri-template
   "https://composer.googleapis.com/v1/{+environment}:checkUpgrade",
   :uri-template-args {"environment" environment},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CheckUpgradeRequest})

(defn projects-locations-environments-patch
  "Update an environment.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/patch

name <> 
Environment:
Environment

optional:
updateMask <string> Required. A comma-separated list of paths, relative to `Environment`, of fields to update. For example, to set the version of scikit-learn to install in the environment to 0.19.0 and to remove an existing installation of numpy, the `updateMask` parameter would include the following two `paths` values: \"config.softwareConfig.pypiPackages.scikit-learn\" and \"config.softwareConfig.pypiPackages.numpy\". The included patch environment would specify the scikit-learn version as follows: { \"config\":{ \"softwareConfig\":{ \"pypiPackages\":{ \"scikit-learn\":\"==0.19.0\" } } } } Note that in the above example, any existing PyPI packages other than scikit-learn and numpy will be unaffected. Only one update type may be included in a single request's `updateMask`. For example, one cannot update both the PyPI packages and labels in the same request. However, it is possible to update multiple members of a map field simultaneously in the same request. For example, to set the labels \"label1\" and \"label2\" while clearing \"label3\" (assuming it already exists), one can provide the paths \"labels.label1\", \"labels.label2\", and \"labels.label3\" and populate the patch environment as follows: { \"labels\":{ \"label1\":\"new-label1-value\" \"label2\":\"new-label2-value\" } } Note that in the above example, any existing labels that are not included in the `updateMask` will be unaffected. It is also possible to replace an entire map field by providing the map field's path in the `updateMask`. The new value of the field will be that which is provided in the patch environment. For example, to delete all pre-existing user-specified PyPI packages and install botocore at version 1.7.14, the `updateMask` would contain the path \"config.softwareConfig.pypiPackages\", and the patch environment would be the following: { \"config\":{ \"softwareConfig\":{ \"pypiPackages\":{ \"botocore\":\"==1.7.14\" } } } } **Note:** Only the following fields can be updated: * `config.softwareConfig.pypiPackages` * Replace all custom custom PyPI packages. If a replacement package map is not included in `environment`, all custom PyPI packages are cleared. It is an error to provide both this mask and a mask specifying an individual package. * `config.softwareConfig.pypiPackages.`packagename * Update the custom PyPI package *packagename*, preserving other packages. To delete the package, include it in `updateMask`, and omit the mapping for it in `environment.config.softwareConfig.pypiPackages`. It is an error to provide both a mask of this form and the `config.softwareConfig.pypiPackages` mask. * `labels` * Replace all environment labels. If a replacement labels map is not included in `environment`, all labels are cleared. It is an error to provide both this mask and a mask specifying one or more individual labels. * `labels.`labelName * Set the label named *labelName*, while preserving other labels. To delete the label, include it in `updateMask` and omit its mapping in `environment.labels`. It is an error to provide both a mask of this form and the `labels` mask. * `config.nodeCount` * Horizontally scale the number of nodes in the environment. An integer greater than or equal to 3 must be provided in the `config.nodeCount` field. Supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. * `config.webServerNetworkAccessControl` * Replace the environment's current `WebServerNetworkAccessControl`. * `config.softwareConfig.airflowConfigOverrides` * Replace all Apache Airflow config overrides. If a replacement config overrides map is not included in `environment`, all config overrides are cleared. It is an error to provide both this mask and a mask specifying one or more individual config overrides. * `config.softwareConfig.airflowConfigOverrides.`section-name * Override the Apache Airflow config property *name* in the section named *section*, preserving other properties. To delete the property override, include it in `updateMask` and omit its mapping in `environment.config.softwareConfig.airflowConfigOverrides`. It is an error to provide both a mask of this form and the `config.softwareConfig.airflowConfigOverrides` mask. * `config.softwareConfig.envVariables` * Replace all environment variables. If a replacement environment variable map is not included in `environment`, all custom environment variables are cleared. * `config.softwareConfig.schedulerCount` * Horizontally scale the number of schedulers in Airflow. A positive integer not greater than the number of nodes must be provided in the `config.softwareConfig.schedulerCount` field. Supported for Cloud Composer environments in versions composer-1.*.*-airflow-2.*.*. * `config.databaseConfig.machineType` * Cloud SQL machine type used by Airflow database. It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8 or db-n1-standard-16. Supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. * `config.webServerConfig.machineType` * Machine type on which Airflow web server is running. It has to be one of: composer-n1-webserver-2, composer-n1-webserver-4 or composer-n1-webserver-8. Supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*."
  ([name Environment]
    (projects-locations-environments-patch name Environment nil))
  ([name Environment optional]
    {:method :patch,
     :uri-template "https://composer.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Environment}))

(defn projects-locations-environments-pollAirflowCommand
  "Polls Airflow CLI command execution and fetches logs.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/pollAirflowCommand

environment <> 
PollAirflowCommandRequest:
PollAirflowCommandRequest"
  [environment PollAirflowCommandRequest]
  {:method :post,
   :uri-template
   "https://composer.googleapis.com/v1/{+environment}:pollAirflowCommand",
   :uri-template-args {"environment" environment},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body PollAirflowCommandRequest})

(defn projects-locations-environments-loadSnapshot
  "Loads a snapshot of a Cloud Composer environment. As a result of this operation, a snapshot of environment's specified in LoadSnapshotRequest is loaded into the environment.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/loadSnapshot

environment <> 
LoadSnapshotRequest:
LoadSnapshotRequest"
  [environment LoadSnapshotRequest]
  {:method :post,
   :uri-template
   "https://composer.googleapis.com/v1/{+environment}:loadSnapshot",
   :uri-template-args {"environment" environment},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body LoadSnapshotRequest})

(defn projects-locations-environments-databaseFailover
  "Triggers database failover (only for highly resilient environments).
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/databaseFailover

environment <> 
DatabaseFailoverRequest:
DatabaseFailoverRequest"
  [environment DatabaseFailoverRequest]
  {:method :post,
   :uri-template
   "https://composer.googleapis.com/v1/{+environment}:databaseFailover",
   :uri-template-args {"environment" environment},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body DatabaseFailoverRequest})

(defn projects-locations-environments-create
  "Create a new environment.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/create

parent <> 
Environment:
Environment"
  [parent Environment]
  {:method :post,
   :uri-template
   "https://composer.googleapis.com/v1/{+parent}/environments",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body Environment})

(defn projects-locations-environments-executeAirflowCommand
  "Executes Airflow CLI command.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/executeAirflowCommand

environment <> 
ExecuteAirflowCommandRequest:
ExecuteAirflowCommandRequest"
  [environment ExecuteAirflowCommandRequest]
  {:method :post,
   :uri-template
   "https://composer.googleapis.com/v1/{+environment}:executeAirflowCommand",
   :uri-template-args {"environment" environment},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ExecuteAirflowCommandRequest})

(defn projects-locations-environments-get
  "Get an existing environment.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://composer.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-environments-workloads-list
  "Lists workloads in a Cloud Composer environment. Workload is a unit that runs a single Composer component. This method is supported for Cloud Composer environments in versions composer-3.*.*-airflow-*.*.* and newer.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/workloads/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of environments to return.
filter <string> Optional. The list filter. Currently only supports equality on the type field. The value of a field specified in the filter expression must be one ComposerWorkloadType enum option. It's possible to get multiple types using \"OR\" operator, e.g.: \"type=SCHEDULER OR type=CELERY_WORKER\". If not specified, all items are returned."
  ([parent]
    (projects-locations-environments-workloads-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://composer.googleapis.com/v1/{+parent}/workloads",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-environments-userWorkloadsSecrets-create
  "Creates a user workloads Secret. This method is supported for Cloud Composer environments in versions composer-3.*.*-airflow-*.*.* and newer.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/userWorkloadsSecrets/create

parent <> 
UserWorkloadsSecret:
UserWorkloadsSecret"
  [parent UserWorkloadsSecret]
  {:method :post,
   :uri-template
   "https://composer.googleapis.com/v1/{+parent}/userWorkloadsSecrets",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body UserWorkloadsSecret})

(defn projects-locations-environments-userWorkloadsSecrets-get
  "Gets an existing user workloads Secret. Values of the \"data\" field in the response are cleared. This method is supported for Cloud Composer environments in versions composer-3.*.*-airflow-*.*.* and newer.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/userWorkloadsSecrets/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://composer.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-environments-userWorkloadsSecrets-list
  "Lists user workloads Secrets. This method is supported for Cloud Composer environments in versions composer-3.*.*-airflow-*.*.* and newer.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/userWorkloadsSecrets/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of Secrets to return."
  ([parent]
    (projects-locations-environments-userWorkloadsSecrets-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://composer.googleapis.com/v1/{+parent}/userWorkloadsSecrets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-environments-userWorkloadsSecrets-update
  "Updates a user workloads Secret. This method is supported for Cloud Composer environments in versions composer-3.*.*-airflow-*.*.* and newer.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/userWorkloadsSecrets/update

name <> 
UserWorkloadsSecret:
UserWorkloadsSecret"
  [name UserWorkloadsSecret]
  {:method :put,
   :uri-template "https://composer.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body UserWorkloadsSecret})

(defn projects-locations-environments-userWorkloadsSecrets-delete
  "Deletes a user workloads Secret. This method is supported for Cloud Composer environments in versions composer-3.*.*-airflow-*.*.* and newer.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/userWorkloadsSecrets/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://composer.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-environments-userWorkloadsConfigMaps-create
  "Creates a user workloads ConfigMap. This method is supported for Cloud Composer environments in versions composer-3.*.*-airflow-*.*.* and newer.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/userWorkloadsConfigMaps/create

parent <> 
UserWorkloadsConfigMap:
UserWorkloadsConfigMap"
  [parent UserWorkloadsConfigMap]
  {:method :post,
   :uri-template
   "https://composer.googleapis.com/v1/{+parent}/userWorkloadsConfigMaps",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body UserWorkloadsConfigMap})

(defn projects-locations-environments-userWorkloadsConfigMaps-get
  "Gets an existing user workloads ConfigMap. This method is supported for Cloud Composer environments in versions composer-3.*.*-airflow-*.*.* and newer.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/userWorkloadsConfigMaps/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://composer.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-environments-userWorkloadsConfigMaps-list
  "Lists user workloads ConfigMaps. This method is supported for Cloud Composer environments in versions composer-3.*.*-airflow-*.*.* and newer.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/userWorkloadsConfigMaps/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of ConfigMaps to return."
  ([parent]
    (projects-locations-environments-userWorkloadsConfigMaps-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://composer.googleapis.com/v1/{+parent}/userWorkloadsConfigMaps",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-environments-userWorkloadsConfigMaps-update
  "Updates a user workloads ConfigMap. This method is supported for Cloud Composer environments in versions composer-3.*.*-airflow-*.*.* and newer.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/userWorkloadsConfigMaps/update

name <> 
UserWorkloadsConfigMap:
UserWorkloadsConfigMap"
  [name UserWorkloadsConfigMap]
  {:method :put,
   :uri-template "https://composer.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body UserWorkloadsConfigMap})

(defn projects-locations-environments-userWorkloadsConfigMaps-delete
  "Deletes a user workloads ConfigMap. This method is supported for Cloud Composer environments in versions composer-3.*.*-airflow-*.*.* and newer.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/environments/userWorkloadsConfigMaps/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://composer.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-imageVersions-list
  "List ImageVersions for provided location.
https://cloud.google.com/composer/v1/reference/rest/v1/projects/locations/imageVersions/list

parent <> 

optional:
pageSize <integer> The maximum number of image_versions to return.
includePastReleases <boolean> Whether or not image versions from old releases should be included."
  ([parent] (projects-locations-imageVersions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://composer.googleapis.com/v1/{+parent}/imageVersions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
