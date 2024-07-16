(ns happyapi.google.analyticsadmin-v1beta
  "Google Analytics Admin API
Manage properties in Google Analytics. Warning: Creating multiple Customer Applications, Accounts, or Projects to simulate or act as a single Customer Application, Account, or Project (respectively) or to circumvent Service-specific usage limits or quotas is a direct violation of Google Cloud Platform Terms of Service as well as Google APIs Terms of Service. These actions can result in immediate termination of your GCP project(s) without any warning.
See: https://developers.google.com/analytics/devguides/config/admin/v1?csw=1"
  (:require [happyapi.providers.google :as client]))

(defn accountSummaries-list
  "Returns summaries of all accounts accessible by the caller.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/accountSummaries/list

optional:
pageSize <integer> The maximum number of AccountSummary resources to return. The service may return fewer than this value, even if there are additional pages. If unspecified, at most 50 resources will be returned. The maximum value is 200; (higher values will be coerced to the maximum)"
  ([] (accountSummaries-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/accountSummaries",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn properties-getDataRetentionSettings
  "Returns the singleton data retention settings for this property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/getDataRetentionSettings

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn properties-list
  "Returns child Properties under the specified parent Account. Only \"GA4\" properties will be returned. Properties will be excluded if the caller does not have access. Soft-deleted (ie: \"trashed\") properties are excluded by default. Returns an empty list if no relevant properties are found.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/list

optional:
showDeleted <boolean> Whether to include soft-deleted (ie: \"trashed\") Properties in the results. Properties can be inspected to determine whether they are deleted or not.
filter <string> Required. An expression for filtering the results of the request. Fields eligible for filtering are: `parent:`(The resource name of the parent account/property) or `ancestor:`(The resource name of the parent account) or `firebase_project:`(The id or number of the linked firebase project). Some examples of filters: ``` | Filter | Description | |-----------------------------|-------------------------------------------| | parent:accounts/123 | The account with account id: 123. | | parent:properties/123 | The property with property id: 123. | | ancestor:accounts/123 | The account with account id: 123. | | firebase_project:project-id | The firebase project with id: project-id. | | firebase_project:123 | The firebase project with number: 123. | ```
pageSize <integer> The maximum number of resources to return. The service may return fewer than this value, even if there are additional pages. If unspecified, at most 50 resources will be returned. The maximum value is 200; (higher values will be coerced to the maximum)"
  ([] (properties-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/properties",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn properties-delete
  "Marks target Property as soft-deleted (ie: \"trashed\") and returns it. This API does not have a method to restore soft-deleted properties. However, they can be restored using the Trash Can UI. If the properties are not restored before the expiration time, the Property and all child resources (eg: GoogleAdsLinks, Streams, AccessBindings) will be permanently purged. https://support.google.com/analytics/answer/6154772 Returns an error if the target is not found, or is not a GA4 Property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn properties-acknowledgeUserDataCollection
  "Acknowledges the terms of user data collection for the specified property. This acknowledgement must be completed (either in the Google Analytics UI or through this API) before MeasurementProtocolSecret resources may be created.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/acknowledgeUserDataCollection

property <> 
GoogleAnalyticsAdminV1betaAcknowledgeUserDataCollectionRequest:
GoogleAnalyticsAdminV1betaAcknowledgeUserDataCollectionRequest"
  [property
   GoogleAnalyticsAdminV1betaAcknowledgeUserDataCollectionRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+property}:acknowledgeUserDataCollection",
     :uri-template-args {"property" property},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body
     GoogleAnalyticsAdminV1betaAcknowledgeUserDataCollectionRequest}))

(defn properties-updateDataRetentionSettings
  "Updates the singleton data retention settings for this property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/updateDataRetentionSettings

name <> 
GoogleAnalyticsAdminV1betaDataRetentionSettings:
GoogleAnalyticsAdminV1betaDataRetentionSettings

optional:
updateMask <string> Required. The list of fields to be updated. Field names must be in snake case (e.g., \"field_to_update\"). Omitted fields will not be updated. To replace the entire entity, use one path with the string \"*\" to match all fields."
  ([name GoogleAnalyticsAdminV1betaDataRetentionSettings]
    (properties-updateDataRetentionSettings
      name
      GoogleAnalyticsAdminV1betaDataRetentionSettings
      nil))
  ([name GoogleAnalyticsAdminV1betaDataRetentionSettings optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body GoogleAnalyticsAdminV1betaDataRetentionSettings})))

(defn properties-runAccessReport
  "Returns a customized report of data access records. The report provides records of each time a user reads Google Analytics reporting data. Access records are retained for up to 2 years. Data Access Reports can be requested for a property. Reports may be requested for any property, but dimensions that aren't related to quota can only be requested on Google Analytics 360 properties. This method is only available to Administrators. These data access records include GA4 UI Reporting, GA4 UI Explorations, GA4 Data API, and other products like Firebase & Admob that can retrieve data from Google Analytics through a linkage. These records don't include property configuration changes like adding a stream or changing a property's time zone. For configuration change history, see [searchChangeHistoryEvents](https://developers.google.com/analytics/devguides/config/admin/v1/rest/v1alpha/accounts/searchChangeHistoryEvents).
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/runAccessReport

entity <> 
GoogleAnalyticsAdminV1betaRunAccessReportRequest:
GoogleAnalyticsAdminV1betaRunAccessReportRequest"
  [entity GoogleAnalyticsAdminV1betaRunAccessReportRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+entity}:runAccessReport",
     :uri-template-args {"entity" entity},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"],
     :body GoogleAnalyticsAdminV1betaRunAccessReportRequest}))

(defn properties-patch
  "Updates a property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/patch

name <> 
GoogleAnalyticsAdminV1betaProperty:
GoogleAnalyticsAdminV1betaProperty

optional:
updateMask <string> Required. The list of fields to be updated. Field names must be in snake case (e.g., \"field_to_update\"). Omitted fields will not be updated. To replace the entire entity, use one path with the string \"*\" to match all fields."
  ([name GoogleAnalyticsAdminV1betaProperty]
    (properties-patch name GoogleAnalyticsAdminV1betaProperty nil))
  ([name GoogleAnalyticsAdminV1betaProperty optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body GoogleAnalyticsAdminV1betaProperty})))

(defn properties-create
  "Creates an \"GA4\" property with the specified location and attributes.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/create

GoogleAnalyticsAdminV1betaProperty:
GoogleAnalyticsAdminV1betaProperty"
  [GoogleAnalyticsAdminV1betaProperty]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/properties",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body GoogleAnalyticsAdminV1betaProperty}))

(defn properties-get
  "Lookup for a single \"GA4\" Property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn properties-conversionEvents-delete
  "Deletes a conversion event in a property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/conversionEvents/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn properties-conversionEvents-create
  "Creates a conversion event with the specified attributes.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/conversionEvents/create

parent <> 
GoogleAnalyticsAdminV1betaConversionEvent:
GoogleAnalyticsAdminV1betaConversionEvent"
  [parent GoogleAnalyticsAdminV1betaConversionEvent]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+parent}/conversionEvents",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body GoogleAnalyticsAdminV1betaConversionEvent}))

(defn properties-conversionEvents-patch
  "Updates a conversion event with the specified attributes.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/conversionEvents/patch

name <> 
GoogleAnalyticsAdminV1betaConversionEvent:
GoogleAnalyticsAdminV1betaConversionEvent

optional:
updateMask <string> Required. The list of fields to be updated. Field names must be in snake case (e.g., \"field_to_update\"). Omitted fields will not be updated. To replace the entire entity, use one path with the string \"*\" to match all fields."
  ([name GoogleAnalyticsAdminV1betaConversionEvent]
    (properties-conversionEvents-patch
      name
      GoogleAnalyticsAdminV1betaConversionEvent
      nil))
  ([name GoogleAnalyticsAdminV1betaConversionEvent optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body GoogleAnalyticsAdminV1betaConversionEvent})))

(defn properties-conversionEvents-get
  "Retrieve a single conversion event.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/conversionEvents/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn properties-conversionEvents-list
  "Returns a list of conversion events in the specified parent property. Returns an empty list if no conversion events are found.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/conversionEvents/list

parent <> 

optional:
pageSize <integer> The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200; (higher values will be coerced to the maximum)"
  ([parent] (properties-conversionEvents-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+parent}/conversionEvents",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn properties-dataStreams-patch
  "Updates a DataStream on a property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/dataStreams/patch

name <> 
GoogleAnalyticsAdminV1betaDataStream:
GoogleAnalyticsAdminV1betaDataStream

optional:
updateMask <string> Required. The list of fields to be updated. Omitted fields will not be updated. To replace the entire entity, use one path with the string \"*\" to match all fields."
  ([name GoogleAnalyticsAdminV1betaDataStream]
    (properties-dataStreams-patch
      name
      GoogleAnalyticsAdminV1betaDataStream
      nil))
  ([name GoogleAnalyticsAdminV1betaDataStream optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body GoogleAnalyticsAdminV1betaDataStream})))

(defn properties-dataStreams-get
  "Lookup for a single DataStream.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/dataStreams/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn properties-dataStreams-create
  "Creates a DataStream.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/dataStreams/create

parent <> 
GoogleAnalyticsAdminV1betaDataStream:
GoogleAnalyticsAdminV1betaDataStream"
  [parent GoogleAnalyticsAdminV1betaDataStream]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+parent}/dataStreams",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body GoogleAnalyticsAdminV1betaDataStream}))

(defn properties-dataStreams-delete
  "Deletes a DataStream on a property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/dataStreams/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn properties-dataStreams-list
  "Lists DataStreams on a property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/dataStreams/list

parent <> 

optional:
pageSize <integer> The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200 (higher values will be coerced to the maximum)."
  ([parent] (properties-dataStreams-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+parent}/dataStreams",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn properties-dataStreams-measurementProtocolSecrets-delete
  "Deletes target MeasurementProtocolSecret.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/dataStreams/measurementProtocolSecrets/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn properties-dataStreams-measurementProtocolSecrets-get
  "Lookup for a single \"GA4\" MeasurementProtocolSecret.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/dataStreams/measurementProtocolSecrets/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn properties-dataStreams-measurementProtocolSecrets-create
  "Creates a measurement protocol secret.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/dataStreams/measurementProtocolSecrets/create

parent <> 
GoogleAnalyticsAdminV1betaMeasurementProtocolSecret:
GoogleAnalyticsAdminV1betaMeasurementProtocolSecret"
  [parent GoogleAnalyticsAdminV1betaMeasurementProtocolSecret]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+parent}/measurementProtocolSecrets",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body GoogleAnalyticsAdminV1betaMeasurementProtocolSecret}))

(defn properties-dataStreams-measurementProtocolSecrets-list
  "Returns child MeasurementProtocolSecrets under the specified parent Property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/dataStreams/measurementProtocolSecrets/list

parent <> 

optional:
pageSize <integer> The maximum number of resources to return. If unspecified, at most 10 resources will be returned. The maximum value is 10. Higher values will be coerced to the maximum."
  ([parent]
    (properties-dataStreams-measurementProtocolSecrets-list
      parent
      nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+parent}/measurementProtocolSecrets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn properties-dataStreams-measurementProtocolSecrets-patch
  "Updates a measurement protocol secret.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/dataStreams/measurementProtocolSecrets/patch

name <> 
GoogleAnalyticsAdminV1betaMeasurementProtocolSecret:
GoogleAnalyticsAdminV1betaMeasurementProtocolSecret

optional:
updateMask <string> Required. The list of fields to be updated. Omitted fields will not be updated."
  ([name GoogleAnalyticsAdminV1betaMeasurementProtocolSecret]
    (properties-dataStreams-measurementProtocolSecrets-patch
      name
      GoogleAnalyticsAdminV1betaMeasurementProtocolSecret
      nil))
  ([name GoogleAnalyticsAdminV1betaMeasurementProtocolSecret optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body GoogleAnalyticsAdminV1betaMeasurementProtocolSecret})))

(defn properties-keyEvents-create
  "Creates a Key Event.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/keyEvents/create

parent <> 
GoogleAnalyticsAdminV1betaKeyEvent:
GoogleAnalyticsAdminV1betaKeyEvent"
  [parent GoogleAnalyticsAdminV1betaKeyEvent]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+parent}/keyEvents",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body GoogleAnalyticsAdminV1betaKeyEvent}))

(defn properties-keyEvents-list
  "Returns a list of Key Events in the specified parent property. Returns an empty list if no Key Events are found.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/keyEvents/list

parent <> 

optional:
pageSize <integer> The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200; (higher values will be coerced to the maximum)"
  ([parent] (properties-keyEvents-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+parent}/keyEvents",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn properties-keyEvents-delete
  "Deletes a Key Event.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/keyEvents/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn properties-keyEvents-patch
  "Updates a Key Event.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/keyEvents/patch

name <> 
GoogleAnalyticsAdminV1betaKeyEvent:
GoogleAnalyticsAdminV1betaKeyEvent

optional:
updateMask <string> Required. The list of fields to be updated. Field names must be in snake case (e.g., \"field_to_update\"). Omitted fields will not be updated. To replace the entire entity, use one path with the string \"*\" to match all fields."
  ([name GoogleAnalyticsAdminV1betaKeyEvent]
    (properties-keyEvents-patch
      name
      GoogleAnalyticsAdminV1betaKeyEvent
      nil))
  ([name GoogleAnalyticsAdminV1betaKeyEvent optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body GoogleAnalyticsAdminV1betaKeyEvent})))

(defn properties-keyEvents-get
  "Retrieve a single Key Event.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/keyEvents/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn properties-customDimensions-archive
  "Archives a CustomDimension on a property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/customDimensions/archive

name <> 
GoogleAnalyticsAdminV1betaArchiveCustomDimensionRequest:
GoogleAnalyticsAdminV1betaArchiveCustomDimensionRequest"
  [name GoogleAnalyticsAdminV1betaArchiveCustomDimensionRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}:archive",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body GoogleAnalyticsAdminV1betaArchiveCustomDimensionRequest}))

(defn properties-customDimensions-get
  "Lookup for a single CustomDimension.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/customDimensions/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn properties-customDimensions-patch
  "Updates a CustomDimension on a property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/customDimensions/patch

name <> 
GoogleAnalyticsAdminV1betaCustomDimension:
GoogleAnalyticsAdminV1betaCustomDimension

optional:
updateMask <string> Required. The list of fields to be updated. Omitted fields will not be updated. To replace the entire entity, use one path with the string \"*\" to match all fields."
  ([name GoogleAnalyticsAdminV1betaCustomDimension]
    (properties-customDimensions-patch
      name
      GoogleAnalyticsAdminV1betaCustomDimension
      nil))
  ([name GoogleAnalyticsAdminV1betaCustomDimension optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body GoogleAnalyticsAdminV1betaCustomDimension})))

(defn properties-customDimensions-create
  "Creates a CustomDimension.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/customDimensions/create

parent <> 
GoogleAnalyticsAdminV1betaCustomDimension:
GoogleAnalyticsAdminV1betaCustomDimension"
  [parent GoogleAnalyticsAdminV1betaCustomDimension]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+parent}/customDimensions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body GoogleAnalyticsAdminV1betaCustomDimension}))

(defn properties-customDimensions-list
  "Lists CustomDimensions on a property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/customDimensions/list

parent <> 

optional:
pageSize <integer> The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200 (higher values will be coerced to the maximum)."
  ([parent] (properties-customDimensions-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+parent}/customDimensions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn properties-firebaseLinks-delete
  "Deletes a FirebaseLink on a property
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/firebaseLinks/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn properties-firebaseLinks-list
  "Lists FirebaseLinks on a property. Properties can have at most one FirebaseLink.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/firebaseLinks/list

parent <> 

optional:
pageSize <integer> The maximum number of resources to return. The service may return fewer than this value, even if there are additional pages. If unspecified, at most 50 resources will be returned. The maximum value is 200; (higher values will be coerced to the maximum)"
  ([parent] (properties-firebaseLinks-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+parent}/firebaseLinks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn properties-firebaseLinks-create
  "Creates a FirebaseLink. Properties can have at most one FirebaseLink.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/firebaseLinks/create

parent <> 
GoogleAnalyticsAdminV1betaFirebaseLink:
GoogleAnalyticsAdminV1betaFirebaseLink"
  [parent GoogleAnalyticsAdminV1betaFirebaseLink]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+parent}/firebaseLinks",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body GoogleAnalyticsAdminV1betaFirebaseLink}))

(defn properties-googleAdsLinks-create
  "Creates a GoogleAdsLink.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/googleAdsLinks/create

parent <> 
GoogleAnalyticsAdminV1betaGoogleAdsLink:
GoogleAnalyticsAdminV1betaGoogleAdsLink"
  [parent GoogleAnalyticsAdminV1betaGoogleAdsLink]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+parent}/googleAdsLinks",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body GoogleAnalyticsAdminV1betaGoogleAdsLink}))

(defn properties-googleAdsLinks-list
  "Lists GoogleAdsLinks on a property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/googleAdsLinks/list

parent <> 

optional:
pageSize <integer> The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200 (higher values will be coerced to the maximum)."
  ([parent] (properties-googleAdsLinks-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+parent}/googleAdsLinks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn properties-googleAdsLinks-delete
  "Deletes a GoogleAdsLink on a property
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/googleAdsLinks/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn properties-googleAdsLinks-patch
  "Updates a GoogleAdsLink on a property
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/googleAdsLinks/patch

name <> 
GoogleAnalyticsAdminV1betaGoogleAdsLink:
GoogleAnalyticsAdminV1betaGoogleAdsLink

optional:
updateMask <string> Required. The list of fields to be updated. Field names must be in snake case (e.g., \"field_to_update\"). Omitted fields will not be updated. To replace the entire entity, use one path with the string \"*\" to match all fields."
  ([name GoogleAnalyticsAdminV1betaGoogleAdsLink]
    (properties-googleAdsLinks-patch
      name
      GoogleAnalyticsAdminV1betaGoogleAdsLink
      nil))
  ([name GoogleAnalyticsAdminV1betaGoogleAdsLink optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body GoogleAnalyticsAdminV1betaGoogleAdsLink})))

(defn properties-customMetrics-patch
  "Updates a CustomMetric on a property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/customMetrics/patch

name <> 
GoogleAnalyticsAdminV1betaCustomMetric:
GoogleAnalyticsAdminV1betaCustomMetric

optional:
updateMask <string> Required. The list of fields to be updated. Omitted fields will not be updated. To replace the entire entity, use one path with the string \"*\" to match all fields."
  ([name GoogleAnalyticsAdminV1betaCustomMetric]
    (properties-customMetrics-patch
      name
      GoogleAnalyticsAdminV1betaCustomMetric
      nil))
  ([name GoogleAnalyticsAdminV1betaCustomMetric optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body GoogleAnalyticsAdminV1betaCustomMetric})))

(defn properties-customMetrics-list
  "Lists CustomMetrics on a property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/customMetrics/list

parent <> 

optional:
pageSize <integer> The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200 (higher values will be coerced to the maximum)."
  ([parent] (properties-customMetrics-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+parent}/customMetrics",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))

(defn properties-customMetrics-archive
  "Archives a CustomMetric on a property.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/customMetrics/archive

name <> 
GoogleAnalyticsAdminV1betaArchiveCustomMetricRequest:
GoogleAnalyticsAdminV1betaArchiveCustomMetricRequest"
  [name GoogleAnalyticsAdminV1betaArchiveCustomMetricRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}:archive",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body GoogleAnalyticsAdminV1betaArchiveCustomMetricRequest}))

(defn properties-customMetrics-get
  "Lookup for a single CustomMetric.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/customMetrics/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn properties-customMetrics-create
  "Creates a CustomMetric.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/properties/customMetrics/create

parent <> 
GoogleAnalyticsAdminV1betaCustomMetric:
GoogleAnalyticsAdminV1betaCustomMetric"
  [parent GoogleAnalyticsAdminV1betaCustomMetric]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+parent}/customMetrics",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body GoogleAnalyticsAdminV1betaCustomMetric}))

(defn accounts-get
  "Lookup for a single Account.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/accounts/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn accounts-delete
  "Marks target Account as soft-deleted (ie: \"trashed\") and returns it. This API does not have a method to restore soft-deleted accounts. However, they can be restored using the Trash Can UI. If the accounts are not restored before the expiration time, the account and all child resources (eg: Properties, GoogleAdsLinks, Streams, AccessBindings) will be permanently purged. https://support.google.com/analytics/answer/6154772 Returns an error if the target is not found.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/accounts/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"]}))

(defn accounts-getDataSharingSettings
  "Get data sharing settings on an account. Data sharing settings are singletons.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/accounts/getDataSharingSettings

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"]}))

(defn accounts-searchChangeHistoryEvents
  "Searches through all changes to an account or its children given the specified set of filters.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/accounts/searchChangeHistoryEvents

account <> 
GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest:
GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest"
  [account GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+account}:searchChangeHistoryEvents",
     :uri-template-args {"account" account},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body GoogleAnalyticsAdminV1betaSearchChangeHistoryEventsRequest}))

(defn accounts-provisionAccountTicket
  "Requests a ticket for creating an account.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/accounts/provisionAccountTicket

GoogleAnalyticsAdminV1betaProvisionAccountTicketRequest:
GoogleAnalyticsAdminV1betaProvisionAccountTicketRequest"
  [GoogleAnalyticsAdminV1betaProvisionAccountTicketRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/accounts:provisionAccountTicket",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/analytics.edit"],
     :body GoogleAnalyticsAdminV1betaProvisionAccountTicketRequest}))

(defn accounts-runAccessReport
  "Returns a customized report of data access records. The report provides records of each time a user reads Google Analytics reporting data. Access records are retained for up to 2 years. Data Access Reports can be requested for a property. Reports may be requested for any property, but dimensions that aren't related to quota can only be requested on Google Analytics 360 properties. This method is only available to Administrators. These data access records include GA4 UI Reporting, GA4 UI Explorations, GA4 Data API, and other products like Firebase & Admob that can retrieve data from Google Analytics through a linkage. These records don't include property configuration changes like adding a stream or changing a property's time zone. For configuration change history, see [searchChangeHistoryEvents](https://developers.google.com/analytics/devguides/config/admin/v1/rest/v1alpha/accounts/searchChangeHistoryEvents).
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/accounts/runAccessReport

entity <> 
GoogleAnalyticsAdminV1betaRunAccessReportRequest:
GoogleAnalyticsAdminV1betaRunAccessReportRequest"
  [entity GoogleAnalyticsAdminV1betaRunAccessReportRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://analyticsadmin.googleapis.com/v1beta/{+entity}:runAccessReport",
     :uri-template-args {"entity" entity},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/analytics.edit"
      "https://www.googleapis.com/auth/analytics.readonly"],
     :body GoogleAnalyticsAdminV1betaRunAccessReportRequest}))

(defn accounts-patch
  "Updates an account.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/accounts/patch

name <> 
GoogleAnalyticsAdminV1betaAccount:
GoogleAnalyticsAdminV1betaAccount

optional:
updateMask <string> Required. The list of fields to be updated. Field names must be in snake case (for example, \"field_to_update\"). Omitted fields will not be updated. To replace the entire entity, use one path with the string \"*\" to match all fields."
  ([name GoogleAnalyticsAdminV1betaAccount]
    (accounts-patch name GoogleAnalyticsAdminV1betaAccount nil))
  ([name GoogleAnalyticsAdminV1betaAccount optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/analytics.edit"],
       :body GoogleAnalyticsAdminV1betaAccount})))

(defn accounts-list
  "Returns all accounts accessible by the caller. Note that these accounts might not currently have GA4 properties. Soft-deleted (ie: \"trashed\") accounts are excluded by default. Returns an empty list if no relevant accounts are found.
https://developers.google.com/analytics/devguides/config/admin/v1?csw=1/v1beta/reference/rest/v1beta/accounts/list

optional:
showDeleted <boolean> Whether to include soft-deleted (ie: \"trashed\") Accounts in the results. Accounts can be inspected to determine whether they are deleted or not.
pageSize <integer> The maximum number of resources to return. The service may return fewer than this value, even if there are additional pages. If unspecified, at most 50 resources will be returned. The maximum value is 200; (higher values will be coerced to the maximum)"
  ([] (accounts-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://analyticsadmin.googleapis.com/v1beta/accounts",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/analytics.edit"
        "https://www.googleapis.com/auth/analytics.readonly"]})))
