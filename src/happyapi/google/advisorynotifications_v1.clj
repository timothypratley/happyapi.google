(ns happyapi.google.advisorynotifications-v1
  "Advisory Notifications API
An API for accessing Advisory Notifications in Google Cloud
See: https://cloud.google.com/advisory-notifications/docs")

(defn projects-locations-getSettings
  "Get notification settings.
https://cloud.google.com/advisory-notifications/docs/v1/reference/rest/v1/projects/locations/getSettings

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://advisorynotifications.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-updateSettings
  "Update notification settings.
https://cloud.google.com/advisory-notifications/docs/v1/reference/rest/v1/projects/locations/updateSettings

name <> 
GoogleCloudAdvisorynotificationsV1Settings:
GoogleCloudAdvisorynotificationsV1Settings"
  [name GoogleCloudAdvisorynotificationsV1Settings]
  {:method :patch,
   :uri-template
   "https://advisorynotifications.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudAdvisorynotificationsV1Settings})

(defn projects-locations-notifications-list
  "Lists notifications under a given parent.
https://cloud.google.com/advisory-notifications/docs/v1/reference/rest/v1/projects/locations/notifications/list

parent <> 

optional:
view <string> Specifies which parts of the notification resource should be returned in the response.
pageSize <integer> The maximum number of notifications to return. The service may return fewer than this value. If unspecified or equal to 0, at most 50 notifications will be returned. The maximum value is 50; values above 50 will be coerced to 50.
languageCode <string> ISO code for requested localization language. If unset, will be interpereted as \"en\". If the requested language is valid, but not supported for this notification, English will be returned with an \"Not applicable\" LocalizationState. If the ISO code is invalid (i.e. not a real language), this RPC will throw an error."
  ([parent] (projects-locations-notifications-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://advisorynotifications.googleapis.com/v1/{+parent}/notifications",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-notifications-get
  "Gets a notification.
https://cloud.google.com/advisory-notifications/docs/v1/reference/rest/v1/projects/locations/notifications/get

name <> 

optional:
languageCode <string> ISO code for requested localization language. If unset, will be interpereted as \"en\". If the requested language is valid, but not supported for this notification, English will be returned with an \"Not applicable\" LocalizationState. If the ISO code is invalid (i.e. not a real language), this RPC will throw an error."
  ([name] (projects-locations-notifications-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://advisorynotifications.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-getSettings
  "Get notification settings.
https://cloud.google.com/advisory-notifications/docs/v1/reference/rest/v1/organizations/locations/getSettings

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://advisorynotifications.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn organizations-locations-updateSettings
  "Update notification settings.
https://cloud.google.com/advisory-notifications/docs/v1/reference/rest/v1/organizations/locations/updateSettings

name <> 
GoogleCloudAdvisorynotificationsV1Settings:
GoogleCloudAdvisorynotificationsV1Settings"
  [name GoogleCloudAdvisorynotificationsV1Settings]
  {:method :patch,
   :uri-template
   "https://advisorynotifications.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudAdvisorynotificationsV1Settings})

(defn organizations-locations-notifications-get
  "Gets a notification.
https://cloud.google.com/advisory-notifications/docs/v1/reference/rest/v1/organizations/locations/notifications/get

name <> 

optional:
languageCode <string> ISO code for requested localization language. If unset, will be interpereted as \"en\". If the requested language is valid, but not supported for this notification, English will be returned with an \"Not applicable\" LocalizationState. If the ISO code is invalid (i.e. not a real language), this RPC will throw an error."
  ([name] (organizations-locations-notifications-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://advisorynotifications.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn organizations-locations-notifications-list
  "Lists notifications under a given parent.
https://cloud.google.com/advisory-notifications/docs/v1/reference/rest/v1/organizations/locations/notifications/list

parent <> 

optional:
languageCode <string> ISO code for requested localization language. If unset, will be interpereted as \"en\". If the requested language is valid, but not supported for this notification, English will be returned with an \"Not applicable\" LocalizationState. If the ISO code is invalid (i.e. not a real language), this RPC will throw an error.
pageSize <integer> The maximum number of notifications to return. The service may return fewer than this value. If unspecified or equal to 0, at most 50 notifications will be returned. The maximum value is 50; values above 50 will be coerced to 50.
view <string> Specifies which parts of the notification resource should be returned in the response."
  ([parent] (organizations-locations-notifications-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://advisorynotifications.googleapis.com/v1/{+parent}/notifications",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
