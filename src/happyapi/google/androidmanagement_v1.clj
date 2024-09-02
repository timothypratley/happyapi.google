(ns happyapi.google.androidmanagement-v1
  "Android Management API
The Android Management API provides remote enterprise management of Android devices and apps.
See: https://developers.google.com/android/management"
  (:require [happyapi.providers.google :as client]))

(defn signupUrls-create
  "Creates an enterprise signup URL.
https://developers.google.com/android/management/v1/reference/rest/v1/signupUrls/create

optional:
projectId <string> The ID of the Google Cloud Platform project which will own the enterprise.
callbackUrl <string> The callback URL that the admin will be redirected to after successfully creating an enterprise. Before redirecting there the system will add a query parameter to this URL named enterpriseToken which will contain an opaque token to be used for the create enterprise request. The URL will be parsed then reformatted in order to add the enterpriseToken parameter, so there may be some minor formatting changes.
adminEmail <string> Optional. Email address used to prefill the admin field of the enterprise signup form. This value is a hint only and can be altered by the user."
  ([] (signupUrls-create nil))
  ([optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/signupUrls",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"]})))

(defn enterprises-create
  "Creates an enterprise. This is the last step in the enterprise signup flow. See also: SigninDetail
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/create

Enterprise:
Enterprise

optional:
projectId <string> The ID of the Google Cloud Platform project which will own the enterprise.
signupUrlName <string> The name of the SignupUrl used to sign up for the enterprise. Set this when creating a customer-managed enterprise (https://developers.google.com/android/management/create-enterprise#customer-managed_enterprises) and not when creating a deprecated EMM-managed enterprise (https://developers.google.com/android/management/create-enterprise#emm-managed_enterprises).
enterpriseToken <string> The enterprise token appended to the callback URL. Set this when creating a customer-managed enterprise (https://developers.google.com/android/management/create-enterprise#customer-managed_enterprises) and not when creating a deprecated EMM-managed enterprise (https://developers.google.com/android/management/create-enterprise#emm-managed_enterprises).
agreementAccepted <boolean> Whether the enterprise admin has seen and agreed to the managed Google Play Agreement (https://www.android.com/enterprise/terms/). Do not set this field for any customer-managed enterprise (https://developers.google.com/android/management/create-enterprise#customer-managed_enterprises). Set this to field to true for all EMM-managed enterprises (https://developers.google.com/android/management/create-enterprise#emm-managed_enterprises)."
  ([Enterprise] (enterprises-create Enterprise nil))
  ([Enterprise optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/enterprises",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"],
       :body Enterprise})))

(defn enterprises-delete
  "Permanently deletes an enterprise and all accounts and data associated with it. Warning: this will result in a cascaded deletion of all AM API devices associated with the deleted enterprise. Only available for EMM-managed enterprises.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"]}))

(defn enterprises-get
  "Gets an enterprise.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"]}))

(defn enterprises-patch
  "Updates an enterprise. See also: SigninDetail
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/patch

name <> 
Enterprise:
Enterprise

optional:
updateMask <string> The field mask indicating the fields to update. If not set, all modifiable fields will be modified."
  ([name Enterprise] (enterprises-patch name Enterprise nil))
  ([name Enterprise optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"],
       :body Enterprise})))

(defn enterprises-list
  "Lists EMM-managed enterprises. Only BASIC fields are returned.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/list

optional:
projectId <string> Required. The Cloud project ID of the EMM managing the enterprises.
pageSize <integer> The requested page size. The actual page size may be fixed to a min or max value.
view <string> Specifies which Enterprise fields to return. This method only supports BASIC."
  ([] (enterprises-list nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/enterprises",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"]})))

(defn enterprises-enrollmentTokens-create
  "Creates an enrollment token for a given enterprise. It's up to the caller's responsibility to manage the lifecycle of newly created tokens and deleting them when they're not intended to be used anymore.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/enrollmentTokens/create

parent <> 
EnrollmentToken:
EnrollmentToken"
  [parent EnrollmentToken]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+parent}/enrollmentTokens",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"],
     :body EnrollmentToken}))

(defn enterprises-enrollmentTokens-delete
  "Deletes an enrollment token. This operation invalidates the token, preventing its future use.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/enrollmentTokens/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"]}))

(defn enterprises-enrollmentTokens-get
  "Gets an active, unexpired enrollment token. A partial view of the enrollment token is returned. Only the following fields are populated: name, expirationTimestamp, allowPersonalUsage, value, qrCode. This method is meant to help manage active enrollment tokens lifecycle. For security reasons, it's recommended to delete active enrollment tokens as soon as they're not intended to be used anymore.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/enrollmentTokens/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"]}))

(defn enterprises-enrollmentTokens-list
  "Lists active, unexpired enrollment tokens for a given enterprise. The list items contain only a partial view of EnrollmentToken object. Only the following fields are populated: name, expirationTimestamp, allowPersonalUsage, value, qrCode. This method is meant to help manage active enrollment tokens lifecycle. For security reasons, it's recommended to delete active enrollment tokens as soon as they're not intended to be used anymore.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/enrollmentTokens/list

parent <> 

optional:
pageSize <integer> The requested page size. The service may return fewer than this value. If unspecified, at most 10 items will be returned. The maximum value is 100; values above 100 will be coerced to 100."
  ([parent] (enterprises-enrollmentTokens-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/{+parent}/enrollmentTokens",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"]})))

(defn enterprises-webTokens-create
  "Creates a web token to access an embeddable managed Google Play web UI for a given enterprise.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/webTokens/create

parent <> 
WebToken:
WebToken"
  [parent WebToken]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+parent}/webTokens",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"],
     :body WebToken}))

(defn enterprises-devices-get
  "Gets a device. Deleted devices will respond with a 404 error.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/devices/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"]}))

(defn enterprises-devices-list
  "Lists devices for a given enterprise. Deleted devices are not returned in the response.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/devices/list

parent <> 

optional:
pageSize <integer> The requested page size. The actual page size may be fixed to a min or max value."
  ([parent] (enterprises-devices-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/{+parent}/devices",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"]})))

(defn enterprises-devices-patch
  "Updates a device.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/devices/patch

name <> 
Device:
Device

optional:
updateMask <string> The field mask indicating the fields to update. If not set, all modifiable fields will be modified."
  ([name Device] (enterprises-devices-patch name Device nil))
  ([name Device optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"],
       :body Device})))

(defn enterprises-devices-delete
  "Deletes a device. This operation wipes the device. Deleted devices do not show up in enterprises.devices.list calls and a 404 is returned from enterprises.devices.get.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/devices/delete

name <> 

optional:
wipeDataFlags <string> Optional flags that control the device wiping behavior.
wipeReasonMessage <string> Optional. A short message displayed to the user before wiping the work profile on personal devices. This has no effect on company owned devices. The maximum message length is 200 characters."
  ([name] (enterprises-devices-delete name nil))
  ([name optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"]})))

(defn enterprises-devices-issueCommand
  "Issues a command to a device. The Operation resource returned contains a Command in its metadata field. Use the get operation method to get the status of the command.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/devices/issueCommand

name <> 
Command:
Command"
  [name Command]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}:issueCommand",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"],
     :body Command}))

(defn enterprises-devices-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns UNIMPLEMENTED.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/devices/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (enterprises-devices-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"]})))

(defn enterprises-devices-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/devices/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"]}))

(defn enterprises-devices-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns google.rpc.Code.UNIMPLEMENTED. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to Code.CANCELLED.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/devices/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"]}))

(defn enterprises-policies-get
  "Gets a policy.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/policies/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"]}))

(defn enterprises-policies-list
  "Lists policies for a given enterprise.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/policies/list

parent <> 

optional:
pageSize <integer> The requested page size. The actual page size may be fixed to a min or max value."
  ([parent] (enterprises-policies-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/{+parent}/policies",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"]})))

(defn enterprises-policies-patch
  "Updates or creates a policy.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/policies/patch

name <> 
Policy:
Policy

optional:
updateMask <string> The field mask indicating the fields to update. If not set, all modifiable fields will be modified."
  ([name Policy] (enterprises-policies-patch name Policy nil))
  ([name Policy optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"],
       :body Policy})))

(defn enterprises-policies-delete
  "Deletes a policy. This operation is only permitted if no devices are currently referencing the policy.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/policies/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"]}))

(defn enterprises-applications-get
  "Gets info about an application.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/applications/get

name <> 

optional:
languageCode <string> The preferred language for localized application info, as a BCP47 tag (e.g. \"en-US\", \"de\"). If not specified the default language of the application will be used."
  ([name] (enterprises-applications-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"]})))

(defn enterprises-webApps-create
  "Creates a web app.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/webApps/create

parent <> 
WebApp:
WebApp"
  [parent WebApp]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+parent}/webApps",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"],
     :body WebApp}))

(defn enterprises-webApps-get
  "Gets a web app.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/webApps/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"]}))

(defn enterprises-webApps-list
  "Lists web apps for a given enterprise.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/webApps/list

parent <> 

optional:
pageSize <integer> The requested page size. This is a hint and the actual page size in the response may be different."
  ([parent] (enterprises-webApps-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/{+parent}/webApps",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"]})))

(defn enterprises-webApps-patch
  "Updates a web app.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/webApps/patch

name <> 
WebApp:
WebApp

optional:
updateMask <string> The field mask indicating the fields to update. If not set, all modifiable fields will be modified."
  ([name WebApp] (enterprises-webApps-patch name WebApp nil))
  ([name WebApp optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"],
       :body WebApp})))

(defn enterprises-webApps-delete
  "Deletes a web app.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/webApps/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"]}))

(defn enterprises-migrationTokens-create
  "Creates a migration token, to migrate an existing device from being managed by the EMM's Device Policy Controller (DPC) to being managed by the Android Management API. See the guide (https://developers.google.com/android/management/dpc-migration) for more details.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/migrationTokens/create

parent <> 
MigrationToken:
MigrationToken"
  [parent MigrationToken]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+parent}/migrationTokens",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"],
     :body MigrationToken}))

(defn enterprises-migrationTokens-get
  "Gets a migration token.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/migrationTokens/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"]}))

(defn enterprises-migrationTokens-list
  "Lists migration tokens.
https://developers.google.com/android/management/v1/reference/rest/v1/enterprises/migrationTokens/list

parent <> 

optional:
pageSize <integer> The maximum number of migration tokens to return. Fewer migration tokens may be returned. If unspecified, at most 100 migration tokens will be returned. The maximum value is 100; values above 100 will be coerced to 100."
  ([parent] (enterprises-migrationTokens-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://androidmanagement.googleapis.com/v1/{+parent}/migrationTokens",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/androidmanagement"]})))

(defn provisioningInfo-get
  "Get the device provisioning information by the identifier provided in the sign-in url.
https://developers.google.com/android/management/v1/reference/rest/v1/provisioningInfo/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://androidmanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/androidmanagement"]}))
