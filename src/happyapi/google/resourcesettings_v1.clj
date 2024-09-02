(ns happyapi.google.resourcesettings-v1
  "Resource Settings API
The Resource Settings API allows users to control and modify the behavior of their GCP resources (e.g., VM, firewall, Project, etc.) across the Cloud Resource Hierarchy.
See: https://cloud.google.com/resource-manager/docs/resource-settings/overview"
  (:require [happyapi.providers.google :as client]))

(defn projects-settings-get
  "Returns a specified setting. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not exist.
https://cloud.google.com/resource-manager/docs/resource-settings/overview/v1/reference/rest/v1/projects/settings/get

name <> 

optional:
view <string> The SettingView for this request."
  ([name] (projects-settings-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://resourcesettings.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-settings-patch
  "Updates a specified setting. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not exist. Returns a `google.rpc.Status` with `google.rpc.Code.FAILED_PRECONDITION` if the setting is flagged as read only. Returns a `google.rpc.Status` with `google.rpc.Code.ABORTED` if the etag supplied in the request does not match the persisted etag of the setting value. On success, the response will contain only `name`, `local_value` and `etag`. The `metadata` and `effective_value` cannot be updated through this API. Note: the supplied setting will perform a full overwrite of the `local_value` field.
https://cloud.google.com/resource-manager/docs/resource-settings/overview/v1/reference/rest/v1/projects/settings/patch

name <> 
GoogleCloudResourcesettingsV1Setting:
GoogleCloudResourcesettingsV1Setting"
  [name GoogleCloudResourcesettingsV1Setting]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://resourcesettings.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudResourcesettingsV1Setting}))

(defn projects-settings-list
  "Lists all the settings that are available on the Cloud resource `parent`.
https://cloud.google.com/resource-manager/docs/resource-settings/overview/v1/reference/rest/v1/projects/settings/list

parent <> 

optional:
pageSize <integer> Unused. The size of the page to be returned.
view <string> The SettingView for this request."
  ([parent] (projects-settings-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://resourcesettings.googleapis.com/v1/{+parent}/settings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-settings-list
  "Lists all the settings that are available on the Cloud resource `parent`.
https://cloud.google.com/resource-manager/docs/resource-settings/overview/v1/reference/rest/v1/organizations/settings/list

parent <> 

optional:
view <string> The SettingView for this request.
pageSize <integer> Unused. The size of the page to be returned."
  ([parent] (organizations-settings-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://resourcesettings.googleapis.com/v1/{+parent}/settings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-settings-get
  "Returns a specified setting. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not exist.
https://cloud.google.com/resource-manager/docs/resource-settings/overview/v1/reference/rest/v1/organizations/settings/get

name <> 

optional:
view <string> The SettingView for this request."
  ([name] (organizations-settings-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://resourcesettings.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn organizations-settings-patch
  "Updates a specified setting. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not exist. Returns a `google.rpc.Status` with `google.rpc.Code.FAILED_PRECONDITION` if the setting is flagged as read only. Returns a `google.rpc.Status` with `google.rpc.Code.ABORTED` if the etag supplied in the request does not match the persisted etag of the setting value. On success, the response will contain only `name`, `local_value` and `etag`. The `metadata` and `effective_value` cannot be updated through this API. Note: the supplied setting will perform a full overwrite of the `local_value` field.
https://cloud.google.com/resource-manager/docs/resource-settings/overview/v1/reference/rest/v1/organizations/settings/patch

name <> 
GoogleCloudResourcesettingsV1Setting:
GoogleCloudResourcesettingsV1Setting"
  [name GoogleCloudResourcesettingsV1Setting]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://resourcesettings.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudResourcesettingsV1Setting}))

(defn folders-settings-list
  "Lists all the settings that are available on the Cloud resource `parent`.
https://cloud.google.com/resource-manager/docs/resource-settings/overview/v1/reference/rest/v1/folders/settings/list

parent <> 

optional:
pageSize <integer> Unused. The size of the page to be returned.
view <string> The SettingView for this request."
  ([parent] (folders-settings-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://resourcesettings.googleapis.com/v1/{+parent}/settings",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-settings-get
  "Returns a specified setting. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not exist.
https://cloud.google.com/resource-manager/docs/resource-settings/overview/v1/reference/rest/v1/folders/settings/get

name <> 

optional:
view <string> The SettingView for this request."
  ([name] (folders-settings-get name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://resourcesettings.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn folders-settings-patch
  "Updates a specified setting. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the setting does not exist. Returns a `google.rpc.Status` with `google.rpc.Code.FAILED_PRECONDITION` if the setting is flagged as read only. Returns a `google.rpc.Status` with `google.rpc.Code.ABORTED` if the etag supplied in the request does not match the persisted etag of the setting value. On success, the response will contain only `name`, `local_value` and `etag`. The `metadata` and `effective_value` cannot be updated through this API. Note: the supplied setting will perform a full overwrite of the `local_value` field.
https://cloud.google.com/resource-manager/docs/resource-settings/overview/v1/reference/rest/v1/folders/settings/patch

name <> 
GoogleCloudResourcesettingsV1Setting:
GoogleCloudResourcesettingsV1Setting"
  [name GoogleCloudResourcesettingsV1Setting]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://resourcesettings.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudResourcesettingsV1Setting}))
