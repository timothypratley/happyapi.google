(ns happyapi.google.firebase-v1beta1
  "Firebase Management API
The Firebase Management API enables programmatic setup and management of Firebase projects, including a project's Firebase resources and Firebase apps.
See: https://firebase.google.com")

(defn operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/firebase"
    "https://www.googleapis.com/auth/firebase.readonly"]})

(defn projects-list
  "Lists each FirebaseProject accessible to the caller. The elements are returned in no particular order, but they will be a consistent view of the Projects when additional requests are made with a `pageToken`. This method is eventually consistent with Project mutations, which means newly provisioned Projects and recent modifications to existing Projects might not be reflected in the set of Projects. The list will include only ACTIVE Projects. Use GetFirebaseProject for consistent reads as well as for additional Project details.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/list

optional:
pageSize <integer> The maximum number of Projects to return in the response. The server may return fewer than this at its discretion. If no value is specified (or too large a value is specified), the server will impose its own limit. This value cannot be negative.
showDeleted <boolean> Optional. Controls whether Projects in the DELETED state should be returned in the response. If not specified, only `ACTIVE` Projects will be returned."
  ([] (projects-list nil))
  ([optional]
    {:method :get,
     :uri-template "https://firebase.googleapis.com/v1beta1/projects",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/firebase"
      "https://www.googleapis.com/auth/firebase.readonly"]}))

(defn projects-addGoogleAnalytics
  "Links the specified FirebaseProject with an existing [Google Analytics account](http://www.google.com/analytics/). Using this call, you can either: - Specify an `analyticsAccountId` to provision a new Google Analytics property within the specified account and associate the new property with the `FirebaseProject`. - Specify an existing `analyticsPropertyId` to associate the property with the `FirebaseProject`. Note that when you call `AddGoogleAnalytics`: 1. The first check determines if any existing data streams in the Google Analytics property correspond to any existing Firebase Apps in the `FirebaseProject` (based on the `packageName` or `bundleId` associated with the data stream). Then, as applicable, the data streams and apps are linked. Note that this auto-linking only applies to `AndroidApps` and `IosApps`. 2. If no corresponding data streams are found for the Firebase Apps, new data streams are provisioned in the Google Analytics property for each of the Firebase Apps. Note that a new data stream is always provisioned for a Web App even if it was previously associated with a data stream in the Analytics property. Learn more about the hierarchy and structure of Google Analytics accounts in the [Analytics documentation](https://support.google.com/analytics/answer/9303323). The result of this call is an [`Operation`](../../v1beta1/operations). Poll the `Operation` to track the provisioning process by calling GetOperation until [`done`](../../v1beta1/operations#Operation.FIELDS.done) is `true`. When `done` is `true`, the `Operation` has either succeeded or failed. If the `Operation` succeeded, its [`response`](../../v1beta1/operations#Operation.FIELDS.response) is set to an AnalyticsDetails; if the `Operation` failed, its [`error`](../../v1beta1/operations#Operation.FIELDS.error) is set to a google.rpc.Status. To call `AddGoogleAnalytics`, a project member must be an Owner for the existing `FirebaseProject` and have the [`Edit` permission](https://support.google.com/analytics/answer/2884495) for the Google Analytics account. If the `FirebaseProject` already has Google Analytics enabled, and you call `AddGoogleAnalytics` using an `analyticsPropertyId` that's different from the currently associated property, then the call will fail. Analytics may have already been enabled in the Firebase console or by specifying `timeZone` and `regionCode` in the call to [`AddFirebase`](../../v1beta1/projects/addFirebase).
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/addGoogleAnalytics

parent <> 
AddGoogleAnalyticsRequest:
AddGoogleAnalyticsRequest"
  [parent AddGoogleAnalyticsRequest]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+parent}:addGoogleAnalytics",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body AddGoogleAnalyticsRequest})

(defn projects-addFirebase
  "Adds Firebase resources to the specified existing [Google Cloud Platform (GCP) `Project`] (https://cloud.google.com/resource-manager/reference/rest/v1/projects). Since a FirebaseProject is actually also a GCP `Project`, a `FirebaseProject` has the same underlying GCP identifiers (`projectNumber` and `projectId`). This allows for easy interop with Google APIs. The result of this call is an [`Operation`](../../v1beta1/operations). Poll the `Operation` to track the provisioning process by calling GetOperation until [`done`](../../v1beta1/operations#Operation.FIELDS.done) is `true`. When `done` is `true`, the `Operation` has either succeeded or failed. If the `Operation` succeeded, its [`response`](../../v1beta1/operations#Operation.FIELDS.response) is set to a FirebaseProject; if the `Operation` failed, its [`error`](../../v1beta1/operations#Operation.FIELDS.error) is set to a google.rpc.Status. The `Operation` is automatically deleted after completion, so there is no need to call DeleteOperation. This method does not modify any billing account information on the underlying GCP `Project`. To call `AddFirebase`, a project member or service account must have the following permissions (the IAM roles of Editor and Owner contain these permissions): `firebase.projects.update`, `resourcemanager.projects.get`, `serviceusage.services.enable`, and `serviceusage.services.get`.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/addFirebase

project <> 
AddFirebaseRequest:
AddFirebaseRequest"
  [project AddFirebaseRequest]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+project}:addFirebase",
   :uri-template-args {"project" project},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body AddFirebaseRequest})

(defn projects-getAdminSdkConfig
  "Gets the configuration artifact associated with the specified FirebaseProject, which can be used by servers to simplify initialization. Typically, this configuration is used with the Firebase Admin SDK [initializeApp](https://firebase.google.com/docs/admin/setup#initialize_the_sdk) command.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/getAdminSdkConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/firebase"
    "https://www.googleapis.com/auth/firebase.readonly"]})

(defn projects-searchApps
  "Lists all available Apps for the specified FirebaseProject. This is a convenience method. Typically, interaction with an App should be done using the platform-specific service, but some tool use-cases require a summary of all known Apps (such as for App selector interfaces).
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/searchApps

parent <> 

optional:
pageSize <integer> The maximum number of Apps to return in the response. The server may return fewer than this value at its discretion. If no value is specified (or too large a value is specified), then the server will impose its own limit. This value cannot be negative.
filter <string> A query string compatible with Google's [AIP-160 standard](https://google.aip.dev/160). Use any of the following fields in a query: * [`app_id`](../projects/searchApps#FirebaseAppInfo.FIELDS.app_id) * [`namespace`](../projects/searchApps#FirebaseAppInfo.FIELDS.namespace) * [`platform`](../projects/searchApps#FirebaseAppInfo.FIELDS.platform) This query also supports the following \"virtual\" fields. These are fields which are not actually part of the returned resource object, but they can be queried as if they are pre-populated with specific values. * `sha1_hash` or `sha1_hashes`: This field is considered to be a _repeated_ `string` field, populated with the list of all SHA-1 certificate fingerprints registered with the AndroidApp. This list is empty if the App is not an `AndroidApp`. * `sha256_hash` or `sha256_hashes`: This field is considered to be a _repeated_ `string` field, populated with the list of all SHA-256 certificate fingerprints registered with the AndroidApp. This list is empty if the App is not an `AndroidApp`. * `app_store_id`: This field is considered to be a _singular_ `string` field, populated with the Apple App Store ID registered with the IosApp. This field is empty if the App is not an `IosApp`. * `team_id`: This field is considered to be a _singular_ `string` field, populated with the Apple team ID registered with the IosApp. This field is empty if the App is not an `IosApp`.
showDeleted <boolean> Controls whether Apps in the DELETED state should be returned. If not specified, only `ACTIVE` Apps will be returned."
  ([parent] (projects-searchApps parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://firebase.googleapis.com/v1beta1/{+parent}:searchApps",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/firebase"
      "https://www.googleapis.com/auth/firebase.readonly"]}))

(defn projects-getAnalyticsDetails
  "Gets the Google Analytics details currently associated with the specified FirebaseProject. If the `FirebaseProject` is not yet linked to Google Analytics, then the response to `GetAnalyticsDetails` is `NOT_FOUND`.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/getAnalyticsDetails

name <> "
  [name]
  {:method :get,
   :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/firebase"
    "https://www.googleapis.com/auth/firebase.readonly"]})

(defn projects-patch
  "Updates the attributes of the specified FirebaseProject. All [query parameters](#query-parameters) are required.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/patch

name <> 
FirebaseProject:
FirebaseProject

optional:
updateMask <string> Specifies which fields of the FirebaseProject to update. Note that the following fields are immutable: `name`, `project_id`, and `project_number`. To update `state`, use any of the following Google Cloud endpoints: [`projects.delete`](https://cloud.google.com/resource-manager/reference/rest/v1/projects/delete) or [`projects.undelete`](https://cloud.google.com/resource-manager/reference/rest/v1/projects/undelete)"
  ([name FirebaseProject] (projects-patch name FirebaseProject nil))
  ([name FirebaseProject optional]
    {:method :patch,
     :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"],
     :body FirebaseProject}))

(defn projects-removeAnalytics
  "Unlinks the specified FirebaseProject from its Google Analytics account. This call removes the association of the specified `FirebaseProject` with its current Google Analytics property. However, this call does not delete the Google Analytics resources, such as the Google Analytics property or any data streams. These resources may be re-associated later to the `FirebaseProject` by calling [`AddGoogleAnalytics`](../../v1beta1/projects/addGoogleAnalytics) and specifying the same `analyticsPropertyId`. For Android Apps and iOS Apps, this call re-links data streams with their corresponding apps. However, for Web Apps, this call provisions a *new* data stream for each Web App. To call `RemoveAnalytics`, a project member must be an Owner for the `FirebaseProject`.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/removeAnalytics

parent <> 
RemoveAnalyticsRequest:
RemoveAnalyticsRequest"
  [parent RemoveAnalyticsRequest]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+parent}:removeAnalytics",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body RemoveAnalyticsRequest})

(defn projects-get
  "Gets the specified FirebaseProject.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/firebase"
    "https://www.googleapis.com/auth/firebase.readonly"]})

(defn projects-androidApps-get
  "Gets the specified AndroidApp.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/androidApps/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/firebase"
    "https://www.googleapis.com/auth/firebase.readonly"]})

(defn projects-androidApps-list
  "Lists each AndroidApp associated with the specified FirebaseProject. The elements are returned in no particular order, but will be a consistent view of the Apps when additional requests are made with a `pageToken`.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/androidApps/list

parent <> 

optional:
pageSize <integer> The maximum number of Apps to return in the response. The server may return fewer than this at its discretion. If no value is specified (or too large a value is specified), then the server will impose its own limit.
showDeleted <boolean> Controls whether Apps in the DELETED state should be returned in the response. If not specified, only `ACTIVE` Apps will be returned."
  ([parent] (projects-androidApps-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://firebase.googleapis.com/v1beta1/{+parent}/androidApps",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/firebase"
      "https://www.googleapis.com/auth/firebase.readonly"]}))

(defn projects-androidApps-create
  "Requests the creation of a new AndroidApp in the specified FirebaseProject. The result of this call is an `Operation` which can be used to track the provisioning process. The `Operation` is automatically deleted after completion, so there is no need to call `DeleteOperation`.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/androidApps/create

parent <> 
AndroidApp:
AndroidApp"
  [parent AndroidApp]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+parent}/androidApps",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body AndroidApp})

(defn projects-androidApps-patch
  "Updates the attributes of the specified AndroidApp.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/androidApps/patch

name <> 
AndroidApp:
AndroidApp

optional:
updateMask <string> Specifies which fields of the AndroidApp to update. Note that the following fields are immutable: `name`, `app_id`, `project_id`, and `package_name`. To update `state`, use any of the following endpoints: RemoveAndroidApp or UndeleteAndroidApp."
  ([name AndroidApp] (projects-androidApps-patch name AndroidApp nil))
  ([name AndroidApp optional]
    {:method :patch,
     :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"],
     :body AndroidApp}))

(defn projects-androidApps-remove
  "Removes the specified AndroidApp from the FirebaseProject.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/androidApps/remove

name <> 
RemoveAndroidAppRequest:
RemoveAndroidAppRequest"
  [name RemoveAndroidAppRequest]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+name}:remove",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body RemoveAndroidAppRequest})

(defn projects-androidApps-undelete
  "Restores the specified AndroidApp to the FirebaseProject.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/androidApps/undelete

name <> 
UndeleteAndroidAppRequest:
UndeleteAndroidAppRequest"
  [name UndeleteAndroidAppRequest]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+name}:undelete",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body UndeleteAndroidAppRequest})

(defn projects-androidApps-getConfig
  "Gets the configuration artifact associated with the specified AndroidApp.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/androidApps/getConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/firebase"
    "https://www.googleapis.com/auth/firebase.readonly"]})

(defn projects-androidApps-sha-list
  "Lists the SHA-1 and SHA-256 certificates for the specified AndroidApp.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/androidApps/sha/list

parent <> "
  [parent]
  {:method :get,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+parent}/sha",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/firebase"
    "https://www.googleapis.com/auth/firebase.readonly"]})

(defn projects-androidApps-sha-create
  "Adds a ShaCertificate to the specified AndroidApp.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/androidApps/sha/create

parent <> 
ShaCertificate:
ShaCertificate"
  [parent ShaCertificate]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+parent}/sha",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body ShaCertificate})

(defn projects-androidApps-sha-delete
  "Removes a ShaCertificate from the specified AndroidApp.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/androidApps/sha/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"]})

(defn projects-iosApps-get
  "Gets the specified IosApp.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/iosApps/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/firebase"
    "https://www.googleapis.com/auth/firebase.readonly"]})

(defn projects-iosApps-list
  "Lists each IosApp associated with the specified FirebaseProject. The elements are returned in no particular order, but will be a consistent view of the Apps when additional requests are made with a `pageToken`.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/iosApps/list

parent <> 

optional:
pageSize <integer> The maximum number of Apps to return in the response. The server may return fewer than this at its discretion. If no value is specified (or too large a value is specified), the server will impose its own limit.
showDeleted <boolean> Controls whether Apps in the DELETED state should be returned in the response. If not specified, only `ACTIVE` Apps will be returned."
  ([parent] (projects-iosApps-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://firebase.googleapis.com/v1beta1/{+parent}/iosApps",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/firebase"
      "https://www.googleapis.com/auth/firebase.readonly"]}))

(defn projects-iosApps-create
  "Requests the creation of a new IosApp in the specified FirebaseProject. The result of this call is an `Operation` which can be used to track the provisioning process. The `Operation` is automatically deleted after completion, so there is no need to call `DeleteOperation`.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/iosApps/create

parent <> 
IosApp:
IosApp"
  [parent IosApp]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+parent}/iosApps",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body IosApp})

(defn projects-iosApps-patch
  "Updates the attributes of the specified IosApp.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/iosApps/patch

name <> 
IosApp:
IosApp

optional:
updateMask <string> Specifies which fields of the IosApp to update. Note that the following fields are immutable: `name`, `app_id`, `project_id`, and `bundle_id`. To update `state`, use any of the following endpoints: RemoveIosApp or UndeleteIosApp."
  ([name IosApp] (projects-iosApps-patch name IosApp nil))
  ([name IosApp optional]
    {:method :patch,
     :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"],
     :body IosApp}))

(defn projects-iosApps-remove
  "Removes the specified IosApp from the FirebaseProject.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/iosApps/remove

name <> 
RemoveIosAppRequest:
RemoveIosAppRequest"
  [name RemoveIosAppRequest]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+name}:remove",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body RemoveIosAppRequest})

(defn projects-iosApps-undelete
  "Restores the specified IosApp to the FirebaseProject.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/iosApps/undelete

name <> 
UndeleteIosAppRequest:
UndeleteIosAppRequest"
  [name UndeleteIosAppRequest]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+name}:undelete",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body UndeleteIosAppRequest})

(defn projects-iosApps-getConfig
  "Gets the configuration artifact associated with the specified IosApp.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/iosApps/getConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/firebase"
    "https://www.googleapis.com/auth/firebase.readonly"]})

(defn projects-availableLocations-list
  "**DEPRECATED.** _Instead, use the applicable resource-specific REST API (or associated documentation, as needed) to determine valid locations for each resource used in your Project._ Lists the valid Google Cloud Platform (GCP) resource locations for the specified Project (including a FirebaseProject). One of these locations can be selected as the Project's [_default_ GCP resource location](https://firebase.google.com/docs/projects/locations), which is the geographical location where the Project's resources, such as Cloud Firestore, will be provisioned by default. However, if the default GCP resource location has already been set for the Project, then this setting cannot be changed. This call checks for any possible [location restrictions](https://cloud.google.com/resource-manager/docs/organization-policy/defining-locations) for the specified Project and, thus, might return a subset of all possible GCP resource locations. To list all GCP resource locations (regardless of any restrictions), call the endpoint without specifying a unique project identifier (that is, `/v1beta1/{parent=projects/-}/listAvailableLocations`). To call `ListAvailableLocations` with a specified project, a member must be at minimum a Viewer of the Project. Calls without a specified project do not require any specific project permissions.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/availableLocations/list

parent <> 

optional:
pageSize <integer> The maximum number of locations to return in the response. The server may return fewer than this value at its discretion. If no value is specified (or too large a value is specified), then the server will impose its own limit. This value cannot be negative."
  ([parent] (projects-availableLocations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://firebase.googleapis.com/v1beta1/{+parent}/availableLocations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/firebase"
      "https://www.googleapis.com/auth/firebase.readonly"]}))

(defn projects-defaultLocation-finalize
  "**DEPRECATED.** _Instead, use the applicable resource-specific REST API to set the location for each resource used in your Project._ Sets the default Google Cloud Platform (GCP) resource location for the specified FirebaseProject. This method creates an App Engine application with a [default Cloud Storage bucket](https://cloud.google.com/appengine/docs/standard/python/googlecloudstorageclient/setting-up-cloud-storage#activating_a_cloud_storage_bucket), located in the specified [`locationId`](#body.request_body.FIELDS.location_id). This location must be one of the available [GCP resource locations](https://firebase.google.com/docs/projects/locations). After the default GCP resource location is finalized, or if it was already set, it cannot be changed. The default GCP resource location for the specified `FirebaseProject` might already be set because either the underlying GCP `Project` already has an App Engine application or `FinalizeDefaultLocation` was previously called with a specified `locationId`. Any new calls to `FinalizeDefaultLocation` with a *different* specified `locationId` will return a 409 error. The result of this call is an [`Operation`](../../v1beta1/operations), which can be used to track the provisioning process. The [`response`](../../v1beta1/operations#Operation.FIELDS.response) type of the `Operation` is google.protobuf.Empty. The `Operation` can be polled by its `name` using GetOperation until `done` is true. When `done` is true, the `Operation` has either succeeded or failed. If the `Operation` has succeeded, its [`response`](../../v1beta1/operations#Operation.FIELDS.response) will be set to a google.protobuf.Empty; if the `Operation` has failed, its `error` will be set to a google.rpc.Status. The `Operation` is automatically deleted after completion, so there is no need to call DeleteOperation. All fields listed in the [request body](#request-body) are required. To call `FinalizeDefaultLocation`, a member must be an Owner of the Project.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/defaultLocation/finalize

parent <> 
FinalizeDefaultLocationRequest:
FinalizeDefaultLocationRequest"
  [parent FinalizeDefaultLocationRequest]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+parent}/defaultLocation:finalize",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body FinalizeDefaultLocationRequest})

(defn projects-webApps-get
  "Gets the specified WebApp.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/webApps/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/firebase"
    "https://www.googleapis.com/auth/firebase.readonly"]})

(defn projects-webApps-list
  "Lists each WebApp associated with the specified FirebaseProject. The elements are returned in no particular order, but will be a consistent view of the Apps when additional requests are made with a `pageToken`.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/webApps/list

parent <> 

optional:
pageSize <integer> The maximum number of Apps to return in the response. The server may return fewer than this value at its discretion. If no value is specified (or too large a value is specified), then the server will impose its own limit.
showDeleted <boolean> Controls whether Apps in the DELETED state should be returned in the response. If not specified, only `ACTIVE` Apps will be returned."
  ([parent] (projects-webApps-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://firebase.googleapis.com/v1beta1/{+parent}/webApps",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/firebase"
      "https://www.googleapis.com/auth/firebase.readonly"]}))

(defn projects-webApps-create
  "Requests the creation of a new WebApp in the specified FirebaseProject. The result of this call is an `Operation` which can be used to track the provisioning process. The `Operation` is automatically deleted after completion, so there is no need to call `DeleteOperation`.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/webApps/create

parent <> 
WebApp:
WebApp"
  [parent WebApp]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+parent}/webApps",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body WebApp})

(defn projects-webApps-patch
  "Updates the attributes of the specified WebApp.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/webApps/patch

name <> 
WebApp:
WebApp

optional:
updateMask <string> Specifies which fields of the WebApp to update. Note that the following fields are immutable: `name`, `app_id`, and `project_id`. To update `state`, use any of the following endpoints: RemoveWebApp or UndeleteWebApp."
  ([name WebApp] (projects-webApps-patch name WebApp nil))
  ([name WebApp optional]
    {:method :patch,
     :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase"],
     :body WebApp}))

(defn projects-webApps-remove
  "Removes the specified WebApp from the FirebaseProject.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/webApps/remove

name <> 
RemoveWebAppRequest:
RemoveWebAppRequest"
  [name RemoveWebAppRequest]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+name}:remove",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body RemoveWebAppRequest})

(defn projects-webApps-undelete
  "Restores the specified WebApp to the FirebaseProject.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/webApps/undelete

name <> 
UndeleteWebAppRequest:
UndeleteWebAppRequest"
  [name UndeleteWebAppRequest]
  {:method :post,
   :uri-template
   "https://firebase.googleapis.com/v1beta1/{+name}:undelete",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body UndeleteWebAppRequest})

(defn projects-webApps-getConfig
  "Gets the configuration artifact associated with the specified WebApp.
https://firebase.google.com/v1beta1/reference/rest/v1beta1/projects/webApps/getConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://firebase.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-platform.read-only"
    "https://www.googleapis.com/auth/firebase"
    "https://www.googleapis.com/auth/firebase.readonly"]})

(defn availableProjects-list
  "Lists each [Google Cloud Platform (GCP) `Project`] (https://cloud.google.com/resource-manager/reference/rest/v1/projects) that can have Firebase resources added to it. A Project will only be listed if: - The caller has sufficient [Google IAM](https://cloud.google.com/iam) permissions to call AddFirebase. - The Project is not already a FirebaseProject. - The Project is not in an Organization which has policies that prevent Firebase resources from being added. 
https://firebase.google.com/v1beta1/reference/rest/v1beta1/availableProjects/list

optional:
pageSize <integer> The maximum number of Projects to return in the response. The server may return fewer than this value at its discretion. If no value is specified (or too large a value is specified), the server will impose its own limit. This value cannot be negative."
  ([] (availableProjects-list nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://firebase.googleapis.com/v1beta1/availableProjects",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/firebase"
      "https://www.googleapis.com/auth/firebase.readonly"]}))
