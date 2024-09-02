(ns happyapi.google.sqladmin-v1
  "Cloud SQL Admin API
API for Cloud SQL database instance management
See: https://cloud.google.com/sql/docs"
  (:require [happyapi.providers.google :as client]))

(defn sslCerts-createEphemeral
  "Generates a short-lived X509 certificate containing the provided public key and signed by a private key specific to the target instance. Users may use the certificate to authenticate as themselves when connecting to the database.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/sslCerts/createEphemeral

project <> 
instance <> 
SslCertsCreateEphemeralRequest:
SslCertsCreateEphemeralRequest"
  [project instance SslCertsCreateEphemeralRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/createEphemeral",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body SslCertsCreateEphemeralRequest}))

(defn sslCerts-delete
  "Deletes the SSL certificate. For First Generation instances, the certificate remains valid until the instance is restarted.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/sslCerts/delete

project <> 
instance <> 
sha1Fingerprint <> "
  [project instance sha1Fingerprint]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/sslCerts/{sha1Fingerprint}",
     :uri-template-args
     {"project" project,
      "instance" instance,
      "sha1Fingerprint" sha1Fingerprint},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn sslCerts-get
  "Retrieves a particular SSL certificate. Does not include the private key (required for usage). The private key must be saved from the response to initial creation.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/sslCerts/get

project <> 
instance <> 
sha1Fingerprint <> "
  [project instance sha1Fingerprint]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/sslCerts/{sha1Fingerprint}",
     :uri-template-args
     {"project" project,
      "instance" instance,
      "sha1Fingerprint" sha1Fingerprint},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn sslCerts-insert
  "Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the instance is restarted.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/sslCerts/insert

project <> 
instance <> 
SslCertsInsertRequest:
SslCertsInsertRequest"
  [project instance SslCertsInsertRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/sslCerts",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body SslCertsInsertRequest}))

(defn sslCerts-list
  "Lists all of the current SSL certificates for the instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/sslCerts/list

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/sslCerts",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn databases-delete
  "Deletes a database from a Cloud SQL instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/databases/delete

project <> 
instance <> 
database <> "
  [project instance database]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/databases/{database}",
     :uri-template-args
     {"project" project, "instance" instance, "database" database},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn databases-get
  "Retrieves a resource containing information about a database inside a Cloud SQL instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/databases/get

project <> 
instance <> 
database <> "
  [project instance database]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/databases/{database}",
     :uri-template-args
     {"project" project, "instance" instance, "database" database},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn databases-insert
  "Inserts a resource containing information about a database inside a Cloud SQL instance. **Note:** You can't modify the default character set and collation.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/databases/insert

project <> 
instance <> 
Database:
Database"
  [project instance Database]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/databases",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body Database}))

(defn databases-list
  "Lists databases in the specified Cloud SQL instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/databases/list

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/databases",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn databases-patch
  "Partially updates a resource containing information about a database inside a Cloud SQL instance. This method supports patch semantics.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/databases/patch

project <> 
instance <> 
database <> 
Database:
Database"
  [project instance database Database]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/databases/{database}",
     :uri-template-args
     {"project" project, "instance" instance, "database" database},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body Database}))

(defn databases-update
  "Updates a resource containing information about a database inside a Cloud SQL instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/databases/update

project <> 
instance <> 
database <> 
Database:
Database"
  [project instance database Database]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/databases/{database}",
     :uri-template-args
     {"project" project, "instance" instance, "database" database},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body Database}))

(defn flags-list
  "Lists all available database flags for Cloud SQL instances.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/flags/list

optional:
databaseVersion <string> Database type and version you want to retrieve flags for. By default, this method returns flags for all database types and versions."
  ([] (flags-list nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://sqladmin.googleapis.com/v1/flags",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sqlservice.admin"]})))

(defn connect-get
  "Retrieves connect settings about a Cloud SQL instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/connect/get

project <> 
instance <> 

optional:
readTime <string> Optional. Optional snapshot read timestamp to trade freshness for performance."
  ([project instance] (connect-get project instance nil))
  ([project instance optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/connectSettings",
       :uri-template-args {"project" project, "instance" instance},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sqlservice.admin"]})))

(defn connect-generateEphemeral
  "Generates a short-lived X509 certificate containing the provided public key and signed by a private key specific to the target instance. Users may use the certificate to authenticate as themselves when connecting to the database.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/connect/generateEphemeral

project <> 
instance <> 
GenerateEphemeralCertRequest:
GenerateEphemeralCertRequest"
  [project instance GenerateEphemeralCertRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}:generateEphemeralCert",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body GenerateEphemeralCertRequest}))

(defn users-delete
  "Deletes a user from a Cloud SQL instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/users/delete

project <> 
instance <> 

optional:
host <string> Host of the user in the instance.
name <string> Name of the user in the instance."
  ([project instance] (users-delete project instance nil))
  ([project instance optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/users",
       :uri-template-args {"project" project, "instance" instance},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sqlservice.admin"]})))

(defn users-get
  "Retrieves a resource containing information about a user.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/users/get

project <> 
instance <> 
name <> 

optional:
host <string> Host of a user of the instance."
  ([project instance name] (users-get project instance name nil))
  ([project instance name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/users/{name}",
       :uri-template-args
       {"project" project, "instance" instance, "name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sqlservice.admin"]})))

(defn users-insert
  "Creates a new user in a Cloud SQL instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/users/insert

project <> 
instance <> 
User:
User"
  [project instance User]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/users",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body User}))

(defn users-list
  "Lists users in the specified Cloud SQL instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/users/list

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/users",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn users-update
  "Updates an existing user in a Cloud SQL instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/users/update

project <> 
instance <> 
User:
User

optional:
host <string> Optional. Host of the user in the instance.
name <string> Name of the user in the instance."
  ([project instance User] (users-update project instance User nil))
  ([project instance User optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/users",
       :uri-template-args {"project" project, "instance" instance},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sqlservice.admin"],
       :body User})))

(defn projects-instances-rescheduleMaintenance
  "Reschedules the maintenance on the given instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/projects/instances/rescheduleMaintenance

project <> 
instance <> 
SqlInstancesRescheduleMaintenanceRequestBody:
SqlInstancesRescheduleMaintenanceRequestBody"
  [project instance SqlInstancesRescheduleMaintenanceRequestBody]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/rescheduleMaintenance",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body SqlInstancesRescheduleMaintenanceRequestBody}))

(defn projects-instances-verifyExternalSyncSettings
  "Verify External primary instance external sync settings.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/projects/instances/verifyExternalSyncSettings

project <> 
instance <> 
SqlInstancesVerifyExternalSyncSettingsRequest:
SqlInstancesVerifyExternalSyncSettingsRequest"
  [project instance SqlInstancesVerifyExternalSyncSettingsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/verifyExternalSyncSettings",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body SqlInstancesVerifyExternalSyncSettingsRequest}))

(defn projects-instances-startExternalSync
  "Start External primary instance migration.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/projects/instances/startExternalSync

project <> 
instance <> 
SqlInstancesStartExternalSyncRequest:
SqlInstancesStartExternalSyncRequest"
  [project instance SqlInstancesStartExternalSyncRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/startExternalSync",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body SqlInstancesStartExternalSyncRequest}))

(defn projects-instances-performDiskShrink
  "Perform Disk Shrink on primary instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/projects/instances/performDiskShrink

project <> 
instance <> 
PerformDiskShrinkContext:
PerformDiskShrinkContext"
  [project instance PerformDiskShrinkContext]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/performDiskShrink",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body PerformDiskShrinkContext}))

(defn projects-instances-getDiskShrinkConfig
  "Get Disk Shrink Config for a given instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/projects/instances/getDiskShrinkConfig

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/getDiskShrinkConfig",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn projects-instances-resetReplicaSize
  "Reset Replica Size to primary instance disk size.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/projects/instances/resetReplicaSize

project <> 
instance <> 
SqlInstancesResetReplicaSizeRequest:
SqlInstancesResetReplicaSizeRequest"
  [project instance SqlInstancesResetReplicaSizeRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/resetReplicaSize",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body SqlInstancesResetReplicaSizeRequest}))

(defn projects-instances-getLatestRecoveryTime
  "Get Latest Recovery Time for a given instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/projects/instances/getLatestRecoveryTime

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/getLatestRecoveryTime",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn tiers-list
  "Lists all available machine types (tiers) for Cloud SQL, for example, `db-custom-1-3840`. For more information, see https://cloud.google.com/sql/pricing.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/tiers/list

project <> "
  [project]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/tiers",
     :uri-template-args {"project" project},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn instances-list
  "Lists instances under a given project.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/list

project <> 

optional:
filter <string> A filter expression that filters resources listed in the response. The expression is in the form of field:value. For example, 'instanceType:CLOUD_SQL_INSTANCE'. Fields can be nested as needed as per their JSON representation, such as 'settings.userLabels.auto_start:true'. Multiple filter queries are space-separated. For example. 'state:RUNNABLE instanceType:CLOUD_SQL_INSTANCE'. By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly.
maxResults <integer> The maximum number of instances to return. The service may return fewer than this value. If unspecified, at most 500 instances are returned. The maximum value is 1000; values above 1000 are coerced to 1000."
  ([project] (instances-list project nil))
  ([project optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sqladmin.googleapis.com/v1/projects/{project}/instances",
       :uri-template-args {"project" project},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sqlservice.admin"]})))

(defn instances-failover
  "Initiates a manual failover of a high availability (HA) primary instance to a standby instance, which becomes the primary instance. Users are then rerouted to the new primary. For more information, see the [Overview of high availability](https://cloud.google.com/sql/docs/mysql/high-availability) page in the Cloud SQL documentation. If using Legacy HA (MySQL only), this causes the instance to failover to its failover replica instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/failover

project <> 
instance <> 
InstancesFailoverRequest:
InstancesFailoverRequest"
  [project instance InstancesFailoverRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/failover",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body InstancesFailoverRequest}))

(defn instances-addServerCa
  "Adds a new trusted Certificate Authority (CA) version for the specified instance. Required to prepare for a certificate rotation. If a CA version was previously added but never used in a certificate rotation, this operation replaces that version. There cannot be more than one CA version waiting to be rotated in. For instances that have enabled Certificate Authority Service (CAS) based server CA, please use AddServerCertificate to add a new server certificate.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/addServerCa

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/addServerCa",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn instances-listServerCas
  "Lists all of the trusted Certificate Authorities (CAs) for the specified instance. There can be up to three CAs listed: the CA that was used to sign the certificate that is currently in use, a CA that has been added but not yet used to sign a certificate, and a CA used to sign a certificate that has previously rotated out.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/listServerCas

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/listServerCas",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn instances-delete
  "Deletes a Cloud SQL instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/delete

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn instances-stopReplica
  "Stops the replication in the read replica instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/stopReplica

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/stopReplica",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn instances-demoteMaster
  "Demotes the stand-alone instance to be a Cloud SQL read replica for an external database server.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/demoteMaster

project <> 
instance <> 
InstancesDemoteMasterRequest:
InstancesDemoteMasterRequest"
  [project instance InstancesDemoteMasterRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/demoteMaster",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body InstancesDemoteMasterRequest}))

(defn instances-export
  "Exports data from a Cloud SQL instance to a Cloud Storage bucket as a SQL dump or CSV file.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/export

project <> 
instance <> 
InstancesExportRequest:
InstancesExportRequest"
  [project instance InstancesExportRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/export",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body InstancesExportRequest}))

(defn instances-truncateLog
  "Truncate MySQL general and slow query log tables MySQL only.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/truncateLog

project <> 
instance <> 
InstancesTruncateLogRequest:
InstancesTruncateLogRequest"
  [project instance InstancesTruncateLogRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/truncateLog",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body InstancesTruncateLogRequest}))

(defn instances-reencrypt
  "Reencrypt CMEK instance with latest key version.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/reencrypt

project <> 
instance <> 
InstancesReencryptRequest:
InstancesReencryptRequest"
  [project instance InstancesReencryptRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/reencrypt",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body InstancesReencryptRequest}))

(defn instances-restoreBackup
  "Restores a backup of a Cloud SQL instance. Using this operation might cause your instance to restart.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/restoreBackup

project <> 
instance <> 
InstancesRestoreBackupRequest:
InstancesRestoreBackupRequest"
  [project instance InstancesRestoreBackupRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/restoreBackup",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body InstancesRestoreBackupRequest}))

(defn instances-update
  "Updates settings of a Cloud SQL instance. Using this operation might cause your instance to restart.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/update

project <> 
instance <> 
DatabaseInstance:
DatabaseInstance"
  [project instance DatabaseInstance]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body DatabaseInstance}))

(defn instances-rotateServerCa
  "Rotates the server certificate to one signed by the Certificate Authority (CA) version previously added with the addServerCA method. For instances that have enabled Certificate Authority Service (CAS) based server CA, please use RotateServerCertificate to rotate the server certificate.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/rotateServerCa

project <> 
instance <> 
InstancesRotateServerCaRequest:
InstancesRotateServerCaRequest"
  [project instance InstancesRotateServerCaRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/rotateServerCa",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body InstancesRotateServerCaRequest}))

(defn instances-import
  "Imports data into a Cloud SQL instance from a SQL dump or CSV file in Cloud Storage.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/import

project <> 
instance <> 
InstancesImportRequest:
InstancesImportRequest"
  [project instance InstancesImportRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/import",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body InstancesImportRequest}))

(defn instances-releaseSsrsLease
  "Release a lease for the setup of SQL Server Reporting Services (SSRS).
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/releaseSsrsLease

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/releaseSsrsLease",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn instances-promoteReplica
  "Promotes the read replica instance to be an independent Cloud SQL primary instance. Using this operation might cause your instance to restart.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/promoteReplica

project <> 
instance <> 

optional:
failover <boolean> Set to true to invoke a replica failover to the designated DR replica. As part of replica failover, the promote operation attempts to add the original primary instance as a replica of the promoted DR replica when the original primary instance comes back online. If set to false or not specified, then the original primary instance becomes an independent Cloud SQL primary instance. Only applicable to MySQL."
  ([project instance] (instances-promoteReplica project instance nil))
  ([project instance optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/promoteReplica",
       :uri-template-args {"project" project, "instance" instance},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sqlservice.admin"]})))

(defn instances-switchover
  "Switches over from the primary instance to the designated DR replica instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/switchover

project <> 
instance <> 

optional:
dbTimeout <string> Optional. (MySQL only) Cloud SQL instance operations timeout, which is a sum of all database operations. Default value is 10 minutes and can be modified to a maximum value of 24 hours."
  ([project instance] (instances-switchover project instance nil))
  ([project instance optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/switchover",
       :uri-template-args {"project" project, "instance" instance},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sqlservice.admin"]})))

(defn instances-patch
  "Partially updates settings of a Cloud SQL instance by merging the request with the current configuration. This method supports patch semantics.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/patch

project <> 
instance <> 
DatabaseInstance:
DatabaseInstance"
  [project instance DatabaseInstance]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body DatabaseInstance}))

(defn instances-restart
  "Restarts a Cloud SQL instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/restart

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/restart",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn instances-demote
  "Demotes an existing standalone instance to be a Cloud SQL read replica for an external database server.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/demote

project <> 
instance <> 
InstancesDemoteRequest:
InstancesDemoteRequest"
  [project instance InstancesDemoteRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/demote",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body InstancesDemoteRequest}))

(defn instances-insert
  "Creates a new Cloud SQL instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/insert

project <> 
DatabaseInstance:
DatabaseInstance"
  [project DatabaseInstance]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances",
     :uri-template-args {"project" project},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body DatabaseInstance}))

(defn instances-clone
  "Creates a Cloud SQL instance as a clone of the source instance. Using this operation might cause your instance to restart.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/clone

project <> 
instance <> 
InstancesCloneRequest:
InstancesCloneRequest"
  [project instance InstancesCloneRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/clone",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body InstancesCloneRequest}))

(defn instances-acquireSsrsLease
  "Acquire a lease for the setup of SQL Server Reporting Services (SSRS).
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/acquireSsrsLease

project <> 
instance <> 
InstancesAcquireSsrsLeaseRequest:
InstancesAcquireSsrsLeaseRequest"
  [project instance InstancesAcquireSsrsLeaseRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/acquireSsrsLease",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body InstancesAcquireSsrsLeaseRequest}))

(defn instances-get
  "Retrieves a resource containing information about a Cloud SQL instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/get

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn instances-startReplica
  "Starts the replication in the read replica instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/startReplica

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/startReplica",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn instances-resetSslConfig
  "Deletes all client certificates and generates a new server SSL certificate for the instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/instances/resetSslConfig

project <> 
instance <> "
  [project instance]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/resetSslConfig",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn backupRuns-delete
  "Deletes the backup taken by a backup run.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/backupRuns/delete

project <> 
instance <> 
id <> "
  [project instance id]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/backupRuns/{id}",
     :uri-template-args
     {"project" project, "instance" instance, "id" id},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn backupRuns-get
  "Retrieves a resource containing information about a backup run.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/backupRuns/get

project <> 
instance <> 
id <> "
  [project instance id]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/backupRuns/{id}",
     :uri-template-args
     {"project" project, "instance" instance, "id" id},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn backupRuns-insert
  "Creates a new backup run on demand.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/backupRuns/insert

project <> 
instance <> 
BackupRun:
BackupRun"
  [project instance BackupRun]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/backupRuns",
     :uri-template-args {"project" project, "instance" instance},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"],
     :body BackupRun}))

(defn backupRuns-list
  "Lists all backup runs associated with the project or a given instance and configuration in the reverse chronological order of the backup initiation time.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/backupRuns/list

project <> 
instance <> 

optional:
maxResults <integer> Maximum number of backup runs per response."
  ([project instance] (backupRuns-list project instance nil))
  ([project instance optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sqladmin.googleapis.com/v1/projects/{project}/instances/{instance}/backupRuns",
       :uri-template-args {"project" project, "instance" instance},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sqlservice.admin"]})))

(defn operations-get
  "Retrieves an instance operation that has been performed on an instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/operations/get

project <> 
operation <> "
  [project operation]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/operations/{operation}",
     :uri-template-args {"project" project, "operation" operation},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))

(defn operations-list
  "Lists all instance operations that have been performed on the given Cloud SQL instance in the reverse chronological order of the start time.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/operations/list

project <> 

optional:
instance <string> Cloud SQL instance ID. This does not include the project ID.
maxResults <integer> Maximum number of operations per response."
  ([project] (operations-list project nil))
  ([project optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://sqladmin.googleapis.com/v1/projects/{project}/operations",
       :uri-template-args {"project" project},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/sqlservice.admin"]})))

(defn operations-cancel
  "Cancels an instance operation that has been performed on an instance.
https://cloud.google.com/sql/docs/v1/reference/rest/v1/operations/cancel

project <> 
operation <> "
  [project operation]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://sqladmin.googleapis.com/v1/projects/{project}/operations/{operation}/cancel",
     :uri-template-args {"project" project, "operation" operation},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/sqlservice.admin"]}))
