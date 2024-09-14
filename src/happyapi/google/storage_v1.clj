(ns happyapi.google.storage-v1
  "Cloud Storage JSON API
Stores and retrieves potentially large, immutable data objects.
See: https://cloud.google.com/storage/docs/json_api")

(defn defaultObjectAccessControls-delete
  "Permanently deletes the default object ACL entry for the specified entity on the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/defaultObjectAccessControls/delete

bucket <> 
entity <> 

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket entity]
    (defaultObjectAccessControls-delete bucket entity nil))
  ([bucket entity optional]
    {:method :delete,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/defaultObjectAcl/{entity}",
     :uri-template-args {"bucket" bucket, "entity" entity},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"]}))

(defn defaultObjectAccessControls-get
  "Returns the default object ACL entry for the specified entity on the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/defaultObjectAccessControls/get

bucket <> 
entity <> 

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket entity] (defaultObjectAccessControls-get bucket entity nil))
  ([bucket entity optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/defaultObjectAcl/{entity}",
     :uri-template-args {"bucket" bucket, "entity" entity},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"]}))

(defn defaultObjectAccessControls-insert
  "Creates a new default object ACL entry on the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/defaultObjectAccessControls/insert

bucket <> 
ObjectAccessControl:
ObjectAccessControl

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket ObjectAccessControl]
    (defaultObjectAccessControls-insert
      bucket
      ObjectAccessControl
      nil))
  ([bucket ObjectAccessControl optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/defaultObjectAcl",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body ObjectAccessControl}))

(defn defaultObjectAccessControls-list
  "Retrieves default object ACL entries on the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/defaultObjectAccessControls/list

bucket <> 

optional:
ifMetagenerationMatch <string> If present, only return default ACL listing if the bucket's current metageneration matches this value.
ifMetagenerationNotMatch <string> If present, only return default ACL listing if the bucket's current metageneration does not match the given value.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket] (defaultObjectAccessControls-list bucket nil))
  ([bucket optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/defaultObjectAcl",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"]}))

(defn defaultObjectAccessControls-patch
  "Patches a default object ACL entry on the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/defaultObjectAccessControls/patch

bucket <> 
entity <> 
ObjectAccessControl:
ObjectAccessControl

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket entity ObjectAccessControl]
    (defaultObjectAccessControls-patch
      bucket
      entity
      ObjectAccessControl
      nil))
  ([bucket entity ObjectAccessControl optional]
    {:method :patch,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/defaultObjectAcl/{entity}",
     :uri-template-args {"bucket" bucket, "entity" entity},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body ObjectAccessControl}))

(defn defaultObjectAccessControls-update
  "Updates a default object ACL entry on the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/defaultObjectAccessControls/update

bucket <> 
entity <> 
ObjectAccessControl:
ObjectAccessControl

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket entity ObjectAccessControl]
    (defaultObjectAccessControls-update
      bucket
      entity
      ObjectAccessControl
      nil))
  ([bucket entity ObjectAccessControl optional]
    {:method :put,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/defaultObjectAcl/{entity}",
     :uri-template-args {"bucket" bucket, "entity" entity},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body ObjectAccessControl}))

(defn notifications-delete
  "Permanently deletes a notification subscription.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/notifications/delete

bucket <> 
notification <> 

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket notification]
    (notifications-delete bucket notification nil))
  ([bucket notification optional]
    {:method :delete,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/notificationConfigs/{notification}",
     :uri-template-args {"bucket" bucket, "notification" notification},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn notifications-get
  "View a notification configuration.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/notifications/get

bucket <> 
notification <> 

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket notification] (notifications-get bucket notification nil))
  ([bucket notification optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/notificationConfigs/{notification}",
     :uri-template-args {"bucket" bucket, "notification" notification},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn notifications-insert
  "Creates a notification subscription for a given bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/notifications/insert

bucket <> 
Notification:
Notification

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket Notification]
    (notifications-insert bucket Notification nil))
  ([bucket Notification optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/notificationConfigs",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"],
     :body Notification}))

(defn notifications-list
  "Retrieves a list of notification subscriptions for a given bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/notifications/list

bucket <> 

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket] (notifications-list bucket nil))
  ([bucket optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/notificationConfigs",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn buckets-list
  "Retrieves a list of buckets for a given project.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/list

project <> 

optional:
maxResults <integer> Maximum number of buckets to return in a single response. The service will use this parameter or 1,000 items, whichever is smaller.
prefix <string> Filter results to buckets whose names begin with this prefix.
softDeleted <boolean> If true, only soft-deleted bucket versions will be returned. The default is false. For more information, see [Soft Delete](https://cloud.google.com/storage/docs/soft-delete).
projection <string> Set of properties to return. Defaults to noAcl.
userProject <string> The project to be billed for this request."
  ([project] (buckets-list project nil))
  ([project optional]
    {:method :get,
     :uri-template "https://storage.googleapis.com/storage/v1/b",
     :uri-template-args {},
     :query-params (merge {"project" project} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn buckets-setIamPolicy
  "Updates an IAM policy for the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/setIamPolicy

bucket <> 
Policy:
Policy

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket Policy] (buckets-setIamPolicy bucket Policy nil))
  ([bucket Policy optional]
    {:method :put,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/iam",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body Policy}))

(defn buckets-delete
  "Deletes an empty bucket. Deletions are permanent unless soft delete is enabled on the bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/delete

bucket <> 

optional:
ifMetagenerationMatch <string> If set, only deletes the bucket if its metageneration matches this value.
ifMetagenerationNotMatch <string> If set, only deletes the bucket if its metageneration does not match this value.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket] (buckets-delete bucket nil))
  ([bucket optional]
    {:method :delete,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn buckets-lockRetentionPolicy
  "Locks retention policy on a bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/lockRetentionPolicy

bucket <> 
ifMetagenerationMatch <> 

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket ifMetagenerationMatch]
    (buckets-lockRetentionPolicy bucket ifMetagenerationMatch nil))
  ([bucket ifMetagenerationMatch optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/lockRetentionPolicy",
     :uri-template-args {"bucket" bucket},
     :query-params
     (merge {"ifMetagenerationMatch" ifMetagenerationMatch} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn buckets-update
  "Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/update

bucket <> 
Bucket:
Bucket

optional:
ifMetagenerationMatch <string> Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
ifMetagenerationNotMatch <string> Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
predefinedAcl <string> Apply a predefined set of access controls to this bucket.
predefinedDefaultObjectAcl <string> Apply a predefined set of default object access controls to this bucket.
projection <string> Set of properties to return. Defaults to full.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket Bucket] (buckets-update bucket Bucket nil))
  ([bucket Bucket optional]
    {:method :put,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body Bucket}))

(defn buckets-patch
  "Patches a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/patch

bucket <> 
Bucket:
Bucket

optional:
ifMetagenerationMatch <string> Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
ifMetagenerationNotMatch <string> Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
predefinedAcl <string> Apply a predefined set of access controls to this bucket.
predefinedDefaultObjectAcl <string> Apply a predefined set of default object access controls to this bucket.
projection <string> Set of properties to return. Defaults to full.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket Bucket] (buckets-patch bucket Bucket nil))
  ([bucket Bucket optional]
    {:method :patch,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body Bucket}))

(defn buckets-getIamPolicy
  "Returns an IAM policy for the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/getIamPolicy

bucket <> 

optional:
optionsRequestedPolicyVersion <integer> The IAM policy format version to be returned. If the optionsRequestedPolicyVersion is for an older version that doesn't support part of the requested IAM policy, the request fails.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket] (buckets-getIamPolicy bucket nil))
  ([bucket optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/iam",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"]}))

(defn buckets-getStorageLayout
  "Returns the storage layout configuration for the specified bucket. Note that this operation requires storage.objects.list permission.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/getStorageLayout

bucket <> 

optional:
prefix <string> An optional prefix used for permission check. It is useful when the caller only has storage.objects.list permission under a specific prefix."
  ([bucket] (buckets-getStorageLayout bucket nil))
  ([bucket optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/storageLayout",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn buckets-insert
  "Creates a new bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/insert

project <> 
Bucket:
Bucket

optional:
predefinedAcl <string> Apply a predefined set of access controls to this bucket.
predefinedDefaultObjectAcl <string> Apply a predefined set of default object access controls to this bucket.
projection <string> Set of properties to return. Defaults to noAcl, unless the bucket resource specifies acl or defaultObjectAcl properties, when it defaults to full.
userProject <string> The project to be billed for this request.
enableObjectRetention <boolean> When set to true, object retention is enabled for this bucket."
  ([project Bucket] (buckets-insert project Bucket nil))
  ([project Bucket optional]
    {:method :post,
     :uri-template "https://storage.googleapis.com/storage/v1/b",
     :uri-template-args {},
     :query-params (merge {"project" project} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"],
     :body Bucket}))

(defn buckets-restore
  "Restores a soft-deleted bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/restore

bucket <> 
generation <> 

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket generation] (buckets-restore bucket generation nil))
  ([bucket generation optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/restore",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {"generation" generation} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn buckets-get
  "Returns metadata for the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/get

bucket <> 

optional:
generation <string> If present, specifies the generation of the bucket. This is required if softDeleted is true.
softDeleted <boolean> If true, return the soft-deleted version of this bucket. The default is false. For more information, see [Soft Delete](https://cloud.google.com/storage/docs/soft-delete).
ifMetagenerationMatch <string> Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
ifMetagenerationNotMatch <string> Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
projection <string> Set of properties to return. Defaults to noAcl.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket] (buckets-get bucket nil))
  ([bucket optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn buckets-testIamPermissions
  "Tests a set of permissions on the given bucket to see which, if any, are held by the caller.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/testIamPermissions

bucket <> 
permissions <> 

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket permissions]
    (buckets-testIamPermissions bucket permissions nil))
  ([bucket permissions optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/iam/testPermissions",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {"permissions" permissions} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn managedFolders-delete
  "Permanently deletes a managed folder.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/managedFolders/delete

bucket <> 
managedFolder <> 

optional:
ifMetagenerationMatch <string> If set, only deletes the managed folder if its metageneration matches this value.
ifMetagenerationNotMatch <string> If set, only deletes the managed folder if its metageneration does not match this value.
allowNonEmpty <boolean> Allows the deletion of a managed folder even if it is not empty. A managed folder is empty if there are no objects or managed folders that it applies to. Callers must have storage.managedFolders.setIamPolicy permission."
  ([bucket managedFolder]
    (managedFolders-delete bucket managedFolder nil))
  ([bucket managedFolder optional]
    {:method :delete,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/managedFolders/{managedFolder}",
     :uri-template-args
     {"bucket" bucket, "managedFolder" managedFolder},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn managedFolders-get
  "Returns metadata of the specified managed folder.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/managedFolders/get

bucket <> 
managedFolder <> 

optional:
ifMetagenerationMatch <string> Makes the return of the managed folder metadata conditional on whether the managed folder's current metageneration matches the given value.
ifMetagenerationNotMatch <string> Makes the return of the managed folder metadata conditional on whether the managed folder's current metageneration does not match the given value."
  ([bucket managedFolder]
    (managedFolders-get bucket managedFolder nil))
  ([bucket managedFolder optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/managedFolders/{managedFolder}",
     :uri-template-args
     {"bucket" bucket, "managedFolder" managedFolder},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn managedFolders-getIamPolicy
  "Returns an IAM policy for the specified managed folder.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/managedFolders/getIamPolicy

bucket <> 
managedFolder <> 

optional:
optionsRequestedPolicyVersion <integer> The IAM policy format version to be returned. If the optionsRequestedPolicyVersion is for an older version that doesn't support part of the requested IAM policy, the request fails.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket managedFolder]
    (managedFolders-getIamPolicy bucket managedFolder nil))
  ([bucket managedFolder optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/managedFolders/{managedFolder}/iam",
     :uri-template-args
     {"bucket" bucket, "managedFolder" managedFolder},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn managedFolders-insert
  "Creates a new managed folder.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/managedFolders/insert

bucket <> 
ManagedFolder:
ManagedFolder"
  [bucket ManagedFolder]
  {:method :post,
   :uri-template
   "https://storage.googleapis.com/storage/v1/b/{bucket}/managedFolders",
   :uri-template-args {"bucket" bucket},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/devstorage.full_control"
    "https://www.googleapis.com/auth/devstorage.read_write"],
   :body ManagedFolder})

(defn managedFolders-list
  "Lists managed folders in the given bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/managedFolders/list

bucket <> 

optional:
pageSize <integer> Maximum number of items to return in a single page of responses.
prefix <string> The managed folder name/path prefix to filter the output list of results."
  ([bucket] (managedFolders-list bucket nil))
  ([bucket optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/managedFolders",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn managedFolders-setIamPolicy
  "Updates an IAM policy for the specified managed folder.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/managedFolders/setIamPolicy

bucket <> 
managedFolder <> 
Policy:
Policy

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket managedFolder Policy]
    (managedFolders-setIamPolicy bucket managedFolder Policy nil))
  ([bucket managedFolder Policy optional]
    {:method :put,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/managedFolders/{managedFolder}/iam",
     :uri-template-args
     {"bucket" bucket, "managedFolder" managedFolder},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body Policy}))

(defn managedFolders-testIamPermissions
  "Tests a set of permissions on the given managed folder to see which, if any, are held by the caller.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/managedFolders/testIamPermissions

bucket <> 
managedFolder <> 
permissions <> 

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket managedFolder permissions]
    (managedFolders-testIamPermissions
      bucket
      managedFolder
      permissions
      nil))
  ([bucket managedFolder permissions optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/managedFolders/{managedFolder}/iam/testPermissions",
     :uri-template-args
     {"bucket" bucket, "managedFolder" managedFolder},
     :query-params (merge {"permissions" permissions} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn anywhereCaches-insert
  "Creates an Anywhere Cache instance.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/anywhereCaches/insert

bucket <> 
AnywhereCache:
AnywhereCache"
  [bucket AnywhereCache]
  {:method :post,
   :uri-template
   "https://storage.googleapis.com/storage/v1/b/{bucket}/anywhereCaches",
   :uri-template-args {"bucket" bucket},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/devstorage.full_control"
    "https://www.googleapis.com/auth/devstorage.read_write"],
   :body AnywhereCache})

(defn anywhereCaches-update
  "Updates the config(ttl and admissionPolicy) of an Anywhere Cache instance.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/anywhereCaches/update

bucket <> 
anywhereCacheId <> 
AnywhereCache:
AnywhereCache"
  [bucket anywhereCacheId AnywhereCache]
  {:method :patch,
   :uri-template
   "https://storage.googleapis.com/storage/v1/b/{bucket}/anywhereCaches/{anywhereCacheId}",
   :uri-template-args
   {"bucket" bucket, "anywhereCacheId" anywhereCacheId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/devstorage.full_control"
    "https://www.googleapis.com/auth/devstorage.read_write"],
   :body AnywhereCache})

(defn anywhereCaches-get
  "Returns the metadata of an Anywhere Cache instance.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/anywhereCaches/get

bucket <> 
anywhereCacheId <> "
  [bucket anywhereCacheId]
  {:method :get,
   :uri-template
   "https://storage.googleapis.com/storage/v1/b/{bucket}/anywhereCaches/{anywhereCacheId}",
   :uri-template-args
   {"bucket" bucket, "anywhereCacheId" anywhereCacheId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/devstorage.full_control"
    "https://www.googleapis.com/auth/devstorage.read_only"
    "https://www.googleapis.com/auth/devstorage.read_write"]})

(defn anywhereCaches-list
  "Returns a list of Anywhere Cache instances of the bucket matching the criteria.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/anywhereCaches/list

bucket <> 

optional:
pageSize <integer> Maximum number of items to return in a single page of responses. Maximum 1000."
  ([bucket] (anywhereCaches-list bucket nil))
  ([bucket optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/anywhereCaches",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn anywhereCaches-pause
  "Pauses an Anywhere Cache instance.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/anywhereCaches/pause

bucket <> 
anywhereCacheId <> "
  [bucket anywhereCacheId]
  {:method :post,
   :uri-template
   "https://storage.googleapis.com/storage/v1/b/{bucket}/anywhereCaches/{anywhereCacheId}/pause",
   :uri-template-args
   {"bucket" bucket, "anywhereCacheId" anywhereCacheId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/devstorage.full_control"
    "https://www.googleapis.com/auth/devstorage.read_write"]})

(defn anywhereCaches-resume
  "Resumes a paused or disabled Anywhere Cache instance.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/anywhereCaches/resume

bucket <> 
anywhereCacheId <> "
  [bucket anywhereCacheId]
  {:method :post,
   :uri-template
   "https://storage.googleapis.com/storage/v1/b/{bucket}/anywhereCaches/{anywhereCacheId}/resume",
   :uri-template-args
   {"bucket" bucket, "anywhereCacheId" anywhereCacheId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/devstorage.full_control"
    "https://www.googleapis.com/auth/devstorage.read_write"]})

(defn anywhereCaches-disable
  "Disables an Anywhere Cache instance.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/anywhereCaches/disable

bucket <> 
anywhereCacheId <> "
  [bucket anywhereCacheId]
  {:method :post,
   :uri-template
   "https://storage.googleapis.com/storage/v1/b/{bucket}/anywhereCaches/{anywhereCacheId}/disable",
   :uri-template-args
   {"bucket" bucket, "anywhereCacheId" anywhereCacheId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/devstorage.full_control"
    "https://www.googleapis.com/auth/devstorage.read_write"]})

(defn objects-list
  "Retrieves a list of objects matching the criteria.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/list

bucket <> 

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets.
versions <boolean> If true, lists all versions of an object as distinct results. The default is false. For more information, see [Object Versioning](https://cloud.google.com/storage/docs/object-versioning).
includeTrailingDelimiter <boolean> If true, objects that end in exactly one instance of delimiter will have their metadata included in items in addition to prefixes.
prefix <string> Filter results to objects whose names begin with this prefix.
endOffset <string> Filter results to objects whose names are lexicographically before endOffset. If startOffset is also set, the objects listed will have names between startOffset (inclusive) and endOffset (exclusive).
maxResults <integer> Maximum number of items plus prefixes to return in a single page of responses. As duplicate prefixes are omitted, fewer total results may be returned than requested. The service will use this parameter or 1,000 items, whichever is smaller.
matchGlob <string> Filter results to objects and prefixes that match this glob pattern.
startOffset <string> Filter results to objects whose names are lexicographically equal to or after startOffset. If endOffset is also set, the objects listed will have names between startOffset (inclusive) and endOffset (exclusive).
delimiter <string> Returns results in a directory-like mode. items will contain only objects whose names, aside from the prefix, do not contain delimiter. Objects whose names, aside from the prefix, contain delimiter will have their name, truncated after the delimiter, returned in prefixes. Duplicate prefixes are omitted.
projection <string> Set of properties to return. Defaults to noAcl.
includeFoldersAsPrefixes <boolean> Only applicable if delimiter is set to '/'. If true, will also include folders and managed folders (besides objects) in the returned prefixes.
softDeleted <boolean> If true, only soft-deleted object versions will be listed. The default is false. For more information, see [Soft Delete](https://cloud.google.com/storage/docs/soft-delete)."
  ([bucket] (objects-list bucket nil))
  ([bucket optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn objects-setIamPolicy
  "Updates an IAM policy for the specified object.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/setIamPolicy

bucket <> 
object <> 
Policy:
Policy

optional:
generation <string> If present, selects a specific revision of this object (as opposed to the latest version, the default).
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket object Policy]
    (objects-setIamPolicy bucket object Policy nil))
  ([bucket object Policy optional]
    {:method :put,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}/iam",
     :uri-template-args {"bucket" bucket, "object" object},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"],
     :body Policy}))

(defn objects-rewrite
  "Rewrites a source object to a destination object. Optionally overrides metadata.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/rewrite

sourceBucket <> 
sourceObject <> 
destinationBucket <> 
destinationObject <> 
Object:
Object

optional:
ifMetagenerationNotMatch <string> Makes the operation conditional on whether the destination object's current metageneration does not match the given value.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets.
ifSourceGenerationNotMatch <string> Makes the operation conditional on whether the source object's current generation does not match the given value.
ifSourceMetagenerationMatch <string> Makes the operation conditional on whether the source object's current metageneration matches the given value.
maxBytesRewrittenPerCall <string> The maximum number of bytes that will be rewritten per rewrite request. Most callers shouldn't need to specify this parameter - it is primarily in place to support testing. If specified the value must be an integral multiple of 1 MiB (1048576). Also, this only applies to requests where the source and destination span locations and/or storage classes. Finally, this value must not change across rewrite calls else you'll get an error that the rewriteToken is invalid.
destinationPredefinedAcl <string> Apply a predefined set of access controls to the destination object.
ifSourceGenerationMatch <string> Makes the operation conditional on whether the source object's current generation matches the given value.
ifGenerationMatch <string> Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
rewriteToken <string> Include this field (from the previous rewrite response) on each rewrite request after the first one, until the rewrite response 'done' flag is true. Calls that provide a rewriteToken can omit all other request fields, but if included those fields must match the values provided in the first rewrite request.
sourceGeneration <string> If present, selects a specific revision of the source object (as opposed to the latest version, the default).
ifGenerationNotMatch <string> Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
destinationKmsKeyName <string> Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the object. Overrides the object metadata's kms_key_name value, if any.
projection <string> Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
ifMetagenerationMatch <string> Makes the operation conditional on whether the destination object's current metageneration matches the given value.
ifSourceMetagenerationNotMatch <string> Makes the operation conditional on whether the source object's current metageneration does not match the given value."
  ([sourceBucket
    sourceObject
    destinationBucket
    destinationObject
    Object]
    (objects-rewrite
      sourceBucket
      sourceObject
      destinationBucket
      destinationObject
      Object
      nil))
  ([sourceBucket
    sourceObject
    destinationBucket
    destinationObject
    Object
    optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{sourceBucket}/o/{sourceObject}/rewriteTo/b/{destinationBucket}/o/{destinationObject}",
     :uri-template-args
     {"destinationBucket" destinationBucket,
      "destinationObject" destinationObject,
      "sourceBucket" sourceBucket,
      "sourceObject" sourceObject},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"],
     :body Object}))

(defn objects-watchAll
  "Watch for changes on all objects in a bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/watchAll

bucket <> 
Channel:
Channel

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets.
versions <boolean> If true, lists all versions of an object as distinct results. The default is false. For more information, see [Object Versioning](https://cloud.google.com/storage/docs/object-versioning).
includeTrailingDelimiter <boolean> If true, objects that end in exactly one instance of delimiter will have their metadata included in items in addition to prefixes.
prefix <string> Filter results to objects whose names begin with this prefix.
endOffset <string> Filter results to objects whose names are lexicographically before endOffset. If startOffset is also set, the objects listed will have names between startOffset (inclusive) and endOffset (exclusive).
maxResults <integer> Maximum number of items plus prefixes to return in a single page of responses. As duplicate prefixes are omitted, fewer total results may be returned than requested. The service will use this parameter or 1,000 items, whichever is smaller.
startOffset <string> Filter results to objects whose names are lexicographically equal to or after startOffset. If endOffset is also set, the objects listed will have names between startOffset (inclusive) and endOffset (exclusive).
delimiter <string> Returns results in a directory-like mode. items will contain only objects whose names, aside from the prefix, do not contain delimiter. Objects whose names, aside from the prefix, contain delimiter will have their name, truncated after the delimiter, returned in prefixes. Duplicate prefixes are omitted.
projection <string> Set of properties to return. Defaults to noAcl."
  ([bucket Channel] (objects-watchAll bucket Channel nil))
  ([bucket Channel optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/watch",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"],
     :body Channel}))

(defn objects-copy
  "Copies a source object to a destination object. Optionally overrides metadata.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/copy

sourceBucket <> 
sourceObject <> 
destinationBucket <> 
destinationObject <> 
Object:
Object

optional:
ifMetagenerationNotMatch <string> Makes the operation conditional on whether the destination object's current metageneration does not match the given value.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets.
ifSourceGenerationNotMatch <string> Makes the operation conditional on whether the source object's current generation does not match the given value.
ifSourceMetagenerationMatch <string> Makes the operation conditional on whether the source object's current metageneration matches the given value.
destinationPredefinedAcl <string> Apply a predefined set of access controls to the destination object.
ifSourceGenerationMatch <string> Makes the operation conditional on whether the source object's current generation matches the given value.
ifGenerationMatch <string> Makes the operation conditional on whether the destination object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
sourceGeneration <string> If present, selects a specific revision of the source object (as opposed to the latest version, the default).
ifGenerationNotMatch <string> Makes the operation conditional on whether the destination object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
destinationKmsKeyName <string> Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the object. Overrides the object metadata's kms_key_name value, if any.
projection <string> Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
ifMetagenerationMatch <string> Makes the operation conditional on whether the destination object's current metageneration matches the given value.
ifSourceMetagenerationNotMatch <string> Makes the operation conditional on whether the source object's current metageneration does not match the given value."
  ([sourceBucket
    sourceObject
    destinationBucket
    destinationObject
    Object]
    (objects-copy
      sourceBucket
      sourceObject
      destinationBucket
      destinationObject
      Object
      nil))
  ([sourceBucket
    sourceObject
    destinationBucket
    destinationObject
    Object
    optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{sourceBucket}/o/{sourceObject}/copyTo/b/{destinationBucket}/o/{destinationObject}",
     :uri-template-args
     {"destinationBucket" destinationBucket,
      "destinationObject" destinationObject,
      "sourceBucket" sourceBucket,
      "sourceObject" sourceObject},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"],
     :body Object}))

(defn objects-delete
  "Deletes an object and its metadata. Deletions are permanent if versioning is not enabled for the bucket, or if the generation parameter is used.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/delete

bucket <> 
object <> 

optional:
generation <string> If present, permanently deletes a specific revision of this object (as opposed to the latest version, the default).
ifGenerationMatch <string> Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
ifGenerationNotMatch <string> Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
ifMetagenerationMatch <string> Makes the operation conditional on whether the object's current metageneration matches the given value.
ifMetagenerationNotMatch <string> Makes the operation conditional on whether the object's current metageneration does not match the given value.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket object] (objects-delete bucket object nil))
  ([bucket object optional]
    {:method :delete,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}",
     :uri-template-args {"bucket" bucket, "object" object},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn objects-update
  "Updates an object's metadata.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/update

bucket <> 
object <> 
Object:
Object

optional:
ifMetagenerationNotMatch <string> Makes the operation conditional on whether the object's current metageneration does not match the given value.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets.
predefinedAcl <string> Apply a predefined set of access controls to this object.
ifGenerationMatch <string> Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
generation <string> If present, selects a specific revision of this object (as opposed to the latest version, the default).
overrideUnlockedRetention <boolean> Must be true to remove the retention configuration, reduce its unlocked retention period, or change its mode from unlocked to locked.
ifGenerationNotMatch <string> Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
projection <string> Set of properties to return. Defaults to full.
ifMetagenerationMatch <string> Makes the operation conditional on whether the object's current metageneration matches the given value."
  ([bucket object Object] (objects-update bucket object Object nil))
  ([bucket object Object optional]
    {:method :put,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}",
     :uri-template-args {"object" object, "bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body Object}))

(defn objects-patch
  "Patches an object's metadata.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/patch

bucket <> 
object <> 
Object:
Object

optional:
ifMetagenerationNotMatch <string> Makes the operation conditional on whether the object's current metageneration does not match the given value.
userProject <string> The project to be billed for this request, for Requester Pays buckets.
predefinedAcl <string> Apply a predefined set of access controls to this object.
ifGenerationMatch <string> Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
generation <string> If present, selects a specific revision of this object (as opposed to the latest version, the default).
overrideUnlockedRetention <boolean> Must be true to remove the retention configuration, reduce its unlocked retention period, or change its mode from unlocked to locked.
ifGenerationNotMatch <string> Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
projection <string> Set of properties to return. Defaults to full.
ifMetagenerationMatch <string> Makes the operation conditional on whether the object's current metageneration matches the given value."
  ([bucket object Object] (objects-patch bucket object Object nil))
  ([bucket object Object optional]
    {:method :patch,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}",
     :uri-template-args {"object" object, "bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body Object}))

(defn objects-bulkRestore
  "Initiates a long-running bulk restore operation on the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/bulkRestore

bucket <> 
BulkRestoreObjectsRequest:
BulkRestoreObjectsRequest"
  [bucket BulkRestoreObjectsRequest]
  {:method :post,
   :uri-template
   "https://storage.googleapis.com/storage/v1/b/{bucket}/o/bulkRestore",
   :uri-template-args {"bucket" bucket},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/devstorage.full_control"
    "https://www.googleapis.com/auth/devstorage.read_write"],
   :body BulkRestoreObjectsRequest})

(defn objects-compose
  "Concatenates a list of existing objects into a new object in the same bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/compose

destinationBucket <> 
destinationObject <> 
ComposeRequest:
ComposeRequest

optional:
destinationPredefinedAcl <string> Apply a predefined set of access controls to the destination object.
ifGenerationMatch <string> Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
ifMetagenerationMatch <string> Makes the operation conditional on whether the object's current metageneration matches the given value.
kmsKeyName <string> Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the object. Overrides the object metadata's kms_key_name value, if any.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([destinationBucket destinationObject ComposeRequest]
    (objects-compose
      destinationBucket
      destinationObject
      ComposeRequest
      nil))
  ([destinationBucket destinationObject ComposeRequest optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{destinationBucket}/o/{destinationObject}/compose",
     :uri-template-args
     {"destinationBucket" destinationBucket,
      "destinationObject" destinationObject},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"],
     :body ComposeRequest}))

(defn objects-getIamPolicy
  "Returns an IAM policy for the specified object.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/getIamPolicy

bucket <> 
object <> 

optional:
generation <string> If present, selects a specific revision of this object (as opposed to the latest version, the default).
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket object] (objects-getIamPolicy bucket object nil))
  ([bucket object optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}/iam",
     :uri-template-args {"bucket" bucket, "object" object},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn objects-insert
  "Stores a new object and metadata.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/insert

bucket <> 
Object:
Object

optional:
ifMetagenerationNotMatch <string> Makes the operation conditional on whether the object's current metageneration does not match the given value.
contentEncoding <string> If set, sets the contentEncoding property of the final object to this value. Setting this parameter is equivalent to setting the contentEncoding metadata property. This can be useful when uploading an object with uploadType=media to indicate the encoding of the content being uploaded.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets.
predefinedAcl <string> Apply a predefined set of access controls to this object.
ifGenerationMatch <string> Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
name <string> Name of the object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any. For information about how to URL encode object names to be path safe, see [Encoding URI Path Parts](https://cloud.google.com/storage/docs/request-endpoints#encoding).
ifGenerationNotMatch <string> Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
projection <string> Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
kmsKeyName <string> Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the object. Overrides the object metadata's kms_key_name value, if any.
ifMetagenerationMatch <string> Makes the operation conditional on whether the object's current metageneration matches the given value."
  ([bucket Object] (objects-insert bucket Object nil))
  ([bucket Object optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"],
     :body Object}))

(defn objects-restore
  "Restores a soft-deleted object.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/restore

bucket <> 
object <> 
generation <> 

optional:
ifMetagenerationNotMatch <string> Makes the operation conditional on whether none of the object's live metagenerations match the given value.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets.
ifGenerationMatch <string> Makes the operation conditional on whether the object's one live generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
ifGenerationNotMatch <string> Makes the operation conditional on whether none of the object's live generations match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
copySourceAcl <boolean> If true, copies the source object's ACL; otherwise, uses the bucket's default object ACL. The default is false.
projection <string> Set of properties to return. Defaults to full.
ifMetagenerationMatch <string> Makes the operation conditional on whether the object's one live metageneration matches the given value."
  ([bucket object generation]
    (objects-restore bucket object generation nil))
  ([bucket object generation optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}/restore",
     :uri-template-args {"object" object, "bucket" bucket},
     :query-params (merge {"generation" generation} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"]}))

(defn objects-get
  "Retrieves an object or its metadata.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/get

bucket <> 
object <> 

optional:
ifMetagenerationNotMatch <string> Makes the operation conditional on whether the object's current metageneration does not match the given value.
userProject <string> The project to be billed for this request. Required for Requester Pays buckets.
ifGenerationMatch <string> Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
generation <string> If present, selects a specific revision of this object (as opposed to the latest version, the default).
ifGenerationNotMatch <string> Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
projection <string> Set of properties to return. Defaults to noAcl.
softDeleted <boolean> If true, only soft-deleted object versions will be listed. The default is false. For more information, see [Soft Delete](https://cloud.google.com/storage/docs/soft-delete).
ifMetagenerationMatch <string> Makes the operation conditional on whether the object's current metageneration matches the given value."
  ([bucket object] (objects-get bucket object nil))
  ([bucket object optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}",
     :uri-template-args {"object" object, "bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn objects-testIamPermissions
  "Tests a set of permissions on the given object to see which, if any, are held by the caller.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objects/testIamPermissions

bucket <> 
object <> 
permissions <> 

optional:
generation <string> If present, selects a specific revision of this object (as opposed to the latest version, the default).
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket object permissions]
    (objects-testIamPermissions bucket object permissions nil))
  ([bucket object permissions optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}/iam/testPermissions",
     :uri-template-args {"bucket" bucket, "object" object},
     :query-params (merge {"permissions" permissions} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn folders-delete
  "Permanently deletes a folder. Only applicable to buckets with hierarchical namespace enabled.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/folders/delete

bucket <> 
folder <> 

optional:
ifMetagenerationMatch <string> If set, only deletes the folder if its metageneration matches this value.
ifMetagenerationNotMatch <string> If set, only deletes the folder if its metageneration does not match this value."
  ([bucket folder] (folders-delete bucket folder nil))
  ([bucket folder optional]
    {:method :delete,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/folders/{folder}",
     :uri-template-args {"bucket" bucket, "folder" folder},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn folders-get
  "Returns metadata for the specified folder. Only applicable to buckets with hierarchical namespace enabled.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/folders/get

bucket <> 
folder <> 

optional:
ifMetagenerationMatch <string> Makes the return of the folder metadata conditional on whether the folder's current metageneration matches the given value.
ifMetagenerationNotMatch <string> Makes the return of the folder metadata conditional on whether the folder's current metageneration does not match the given value."
  ([bucket folder] (folders-get bucket folder nil))
  ([bucket folder optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/folders/{folder}",
     :uri-template-args {"bucket" bucket, "folder" folder},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn folders-insert
  "Creates a new folder. Only applicable to buckets with hierarchical namespace enabled.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/folders/insert

bucket <> 
Folder:
Folder

optional:
recursive <boolean> If true, any parent folder which doesn’t exist will be created automatically."
  ([bucket Folder] (folders-insert bucket Folder nil))
  ([bucket Folder optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/folders",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"],
     :body Folder}))

(defn folders-list
  "Retrieves a list of folders matching the criteria. Only applicable to buckets with hierarchical namespace enabled.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/folders/list

bucket <> 

optional:
delimiter <string> Returns results in a directory-like mode. The only supported value is '/'. If set, items will only contain folders that either exactly match the prefix, or are one level below the prefix.
endOffset <string> Filter results to folders whose names are lexicographically before endOffset. If startOffset is also set, the folders listed will have names between startOffset (inclusive) and endOffset (exclusive).
pageSize <integer> Maximum number of items to return in a single page of responses.
prefix <string> Filter results to folders whose paths begin with this prefix. If set, the value must either be an empty string or end with a '/'.
startOffset <string> Filter results to folders whose names are lexicographically equal to or after startOffset. If endOffset is also set, the folders listed will have names between startOffset (inclusive) and endOffset (exclusive)."
  ([bucket] (folders-list bucket nil))
  ([bucket optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/folders",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn folders-rename
  "Renames a source folder to a destination folder. Only applicable to buckets with hierarchical namespace enabled.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/folders/rename

bucket <> 
sourceFolder <> 
destinationFolder <> 

optional:
ifSourceMetagenerationMatch <string> Makes the operation conditional on whether the source object's current metageneration matches the given value.
ifSourceMetagenerationNotMatch <string> Makes the operation conditional on whether the source object's current metageneration does not match the given value."
  ([bucket sourceFolder destinationFolder]
    (folders-rename bucket sourceFolder destinationFolder nil))
  ([bucket sourceFolder destinationFolder optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/folders/{sourceFolder}/renameTo/folders/{destinationFolder}",
     :uri-template-args
     {"bucket" bucket,
      "destinationFolder" destinationFolder,
      "sourceFolder" sourceFolder},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn bucketAccessControls-delete
  "Permanently deletes the ACL entry for the specified entity on the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/bucketAccessControls/delete

bucket <> 
entity <> 

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket entity] (bucketAccessControls-delete bucket entity nil))
  ([bucket entity optional]
    {:method :delete,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/acl/{entity}",
     :uri-template-args {"bucket" bucket, "entity" entity},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"]}))

(defn bucketAccessControls-get
  "Returns the ACL entry for the specified entity on the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/bucketAccessControls/get

bucket <> 
entity <> 

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket entity] (bucketAccessControls-get bucket entity nil))
  ([bucket entity optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/acl/{entity}",
     :uri-template-args {"bucket" bucket, "entity" entity},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"]}))

(defn bucketAccessControls-insert
  "Creates a new ACL entry on the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/bucketAccessControls/insert

bucket <> 
BucketAccessControl:
BucketAccessControl

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket BucketAccessControl]
    (bucketAccessControls-insert bucket BucketAccessControl nil))
  ([bucket BucketAccessControl optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/acl",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body BucketAccessControl}))

(defn bucketAccessControls-list
  "Retrieves ACL entries on the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/bucketAccessControls/list

bucket <> 

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket] (bucketAccessControls-list bucket nil))
  ([bucket optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/acl",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"]}))

(defn bucketAccessControls-patch
  "Patches an ACL entry on the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/bucketAccessControls/patch

bucket <> 
entity <> 
BucketAccessControl:
BucketAccessControl

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket entity BucketAccessControl]
    (bucketAccessControls-patch bucket entity BucketAccessControl nil))
  ([bucket entity BucketAccessControl optional]
    {:method :patch,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/acl/{entity}",
     :uri-template-args {"bucket" bucket, "entity" entity},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body BucketAccessControl}))

(defn bucketAccessControls-update
  "Updates an ACL entry on the specified bucket.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/bucketAccessControls/update

bucket <> 
entity <> 
BucketAccessControl:
BucketAccessControl

optional:
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket entity BucketAccessControl]
    (bucketAccessControls-update
      bucket
      entity
      BucketAccessControl
      nil))
  ([bucket entity BucketAccessControl optional]
    {:method :put,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/acl/{entity}",
     :uri-template-args {"bucket" bucket, "entity" entity},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body BucketAccessControl}))

(defn projects-hmacKeys-create
  "Creates a new HMAC key for the specified service account.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/projects/hmacKeys/create

projectId <> 
serviceAccountEmail <> 

optional:
userProject <string> The project to be billed for this request."
  ([projectId serviceAccountEmail]
    (projects-hmacKeys-create projectId serviceAccountEmail nil))
  ([projectId serviceAccountEmail optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/projects/{projectId}/hmacKeys",
     :uri-template-args {"projectId" projectId},
     :query-params
     (merge {"serviceAccountEmail" serviceAccountEmail} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"]}))

(defn projects-hmacKeys-delete
  "Deletes an HMAC key.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/projects/hmacKeys/delete

projectId <> 
accessId <> 

optional:
userProject <string> The project to be billed for this request."
  ([projectId accessId]
    (projects-hmacKeys-delete projectId accessId nil))
  ([projectId accessId optional]
    {:method :delete,
     :uri-template
     "https://storage.googleapis.com/storage/v1/projects/{projectId}/hmacKeys/{accessId}",
     :uri-template-args {"accessId" accessId, "projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn projects-hmacKeys-get
  "Retrieves an HMAC key's metadata
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/projects/hmacKeys/get

projectId <> 
accessId <> 

optional:
userProject <string> The project to be billed for this request."
  ([projectId accessId] (projects-hmacKeys-get projectId accessId nil))
  ([projectId accessId optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/projects/{projectId}/hmacKeys/{accessId}",
     :uri-template-args {"accessId" accessId, "projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"]}))

(defn projects-hmacKeys-list
  "Retrieves a list of HMAC keys matching the criteria.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/projects/hmacKeys/list

projectId <> 

optional:
maxResults <integer> Maximum number of items to return in a single page of responses. The service uses this parameter or 250 items, whichever is smaller. The max number of items per page will also be limited by the number of distinct service accounts in the response. If the number of service accounts in a single response is too high, the page will truncated and a next page token will be returned.
serviceAccountEmail <string> If present, only keys for the given service account are returned.
showDeletedKeys <boolean> Whether or not to show keys in the DELETED state.
userProject <string> The project to be billed for this request."
  ([projectId] (projects-hmacKeys-list projectId nil))
  ([projectId optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/projects/{projectId}/hmacKeys",
     :uri-template-args {"projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"]}))

(defn projects-hmacKeys-update
  "Updates the state of an HMAC key. See the [HMAC Key resource descriptor](https://cloud.google.com/storage/docs/json_api/v1/projects/hmacKeys/update#request-body) for valid states.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/projects/hmacKeys/update

projectId <> 
accessId <> 
HmacKeyMetadata:
HmacKeyMetadata

optional:
userProject <string> The project to be billed for this request."
  ([projectId accessId HmacKeyMetadata]
    (projects-hmacKeys-update projectId accessId HmacKeyMetadata nil))
  ([projectId accessId HmacKeyMetadata optional]
    {:method :put,
     :uri-template
     "https://storage.googleapis.com/storage/v1/projects/{projectId}/hmacKeys/{accessId}",
     :uri-template-args {"accessId" accessId, "projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body HmacKeyMetadata}))

(defn projects-serviceAccount-get
  "Get the email address of this project's Google Cloud Storage service account.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/projects/serviceAccount/get

projectId <> 

optional:
userProject <string> The project to be billed for this request."
  ([projectId] (projects-serviceAccount-get projectId nil))
  ([projectId optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/projects/{projectId}/serviceAccount",
     :uri-template-args {"projectId" projectId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))

(defn objectAccessControls-delete
  "Permanently deletes the ACL entry for the specified entity on the specified object.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objectAccessControls/delete

bucket <> 
object <> 
entity <> 

optional:
generation <string> If present, selects a specific revision of this object (as opposed to the latest version, the default).
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket object entity]
    (objectAccessControls-delete bucket object entity nil))
  ([bucket object entity optional]
    {:method :delete,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}/acl/{entity}",
     :uri-template-args
     {"bucket" bucket, "entity" entity, "object" object},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"]}))

(defn objectAccessControls-get
  "Returns the ACL entry for the specified entity on the specified object.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objectAccessControls/get

bucket <> 
object <> 
entity <> 

optional:
generation <string> If present, selects a specific revision of this object (as opposed to the latest version, the default).
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket object entity]
    (objectAccessControls-get bucket object entity nil))
  ([bucket object entity optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}/acl/{entity}",
     :uri-template-args
     {"bucket" bucket, "entity" entity, "object" object},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"]}))

(defn objectAccessControls-insert
  "Creates a new ACL entry on the specified object.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objectAccessControls/insert

bucket <> 
object <> 
ObjectAccessControl:
ObjectAccessControl

optional:
generation <string> If present, selects a specific revision of this object (as opposed to the latest version, the default).
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket object ObjectAccessControl]
    (objectAccessControls-insert
      bucket
      object
      ObjectAccessControl
      nil))
  ([bucket object ObjectAccessControl optional]
    {:method :post,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}/acl",
     :uri-template-args {"bucket" bucket, "object" object},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body ObjectAccessControl}))

(defn objectAccessControls-list
  "Retrieves ACL entries on the specified object.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objectAccessControls/list

bucket <> 
object <> 

optional:
generation <string> If present, selects a specific revision of this object (as opposed to the latest version, the default).
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket object] (objectAccessControls-list bucket object nil))
  ([bucket object optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}/acl",
     :uri-template-args {"bucket" bucket, "object" object},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"]}))

(defn objectAccessControls-patch
  "Patches an ACL entry on the specified object.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objectAccessControls/patch

bucket <> 
object <> 
entity <> 
ObjectAccessControl:
ObjectAccessControl

optional:
generation <string> If present, selects a specific revision of this object (as opposed to the latest version, the default).
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket object entity ObjectAccessControl]
    (objectAccessControls-patch
      bucket
      object
      entity
      ObjectAccessControl
      nil))
  ([bucket object entity ObjectAccessControl optional]
    {:method :patch,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}/acl/{entity}",
     :uri-template-args
     {"bucket" bucket, "entity" entity, "object" object},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body ObjectAccessControl}))

(defn objectAccessControls-update
  "Updates an ACL entry on the specified object.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/objectAccessControls/update

bucket <> 
object <> 
entity <> 
ObjectAccessControl:
ObjectAccessControl

optional:
generation <string> If present, selects a specific revision of this object (as opposed to the latest version, the default).
userProject <string> The project to be billed for this request. Required for Requester Pays buckets."
  ([bucket object entity ObjectAccessControl]
    (objectAccessControls-update
      bucket
      object
      entity
      ObjectAccessControl
      nil))
  ([bucket object entity ObjectAccessControl optional]
    {:method :put,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/o/{object}/acl/{entity}",
     :uri-template-args
     {"bucket" bucket, "entity" entity, "object" object},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/devstorage.full_control"],
     :body ObjectAccessControl}))

(defn channels-stop
  "Stop watching resources through this channel
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/channels/stop

Channel:
Channel"
  [Channel]
  {:method :post,
   :uri-template
   "https://storage.googleapis.com/storage/v1/channels/stop",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/devstorage.full_control"
    "https://www.googleapis.com/auth/devstorage.read_only"
    "https://www.googleapis.com/auth/devstorage.read_write"],
   :body Channel})

(defn buckets-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/operations/cancel

bucket <> 
operationId <> "
  [bucket operationId]
  {:method :post,
   :uri-template
   "https://storage.googleapis.com/storage/v1/b/{bucket}/operations/{operationId}/cancel",
   :uri-template-args {"bucket" bucket, "operationId" operationId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/devstorage.full_control"
    "https://www.googleapis.com/auth/devstorage.read_write"]})

(defn buckets-operations-get
  "Gets the latest state of a long-running operation.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/operations/get

bucket <> 
operationId <> "
  [bucket operationId]
  {:method :get,
   :uri-template
   "https://storage.googleapis.com/storage/v1/b/{bucket}/operations/{operationId}",
   :uri-template-args {"bucket" bucket, "operationId" operationId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/devstorage.full_control"
    "https://www.googleapis.com/auth/devstorage.read_only"
    "https://www.googleapis.com/auth/devstorage.read_write"]})

(defn buckets-operations-list
  "Lists operations that match the specified filter in the request.
https://cloud.google.com/storage/docs/json_api/v1/reference/rest/v1/buckets/operations/list

bucket <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> Maximum number of items to return in a single page of responses. Fewer total results may be returned than requested. The service uses this parameter or 100 items, whichever is smaller."
  ([bucket] (buckets-operations-list bucket nil))
  ([bucket optional]
    {:method :get,
     :uri-template
     "https://storage.googleapis.com/storage/v1/b/{bucket}/operations",
     :uri-template-args {"bucket" bucket},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/devstorage.full_control"
      "https://www.googleapis.com/auth/devstorage.read_only"
      "https://www.googleapis.com/auth/devstorage.read_write"]}))
