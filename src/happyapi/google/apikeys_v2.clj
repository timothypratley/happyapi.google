(ns happyapi.google.apikeys-v2
  "API Keys API
Manages the API keys associated with developer projects.
See: https://cloud.google.com/api-keys/docs"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-keys-undelete
  "Undeletes an API key which was deleted within 30 days. NOTE: Key is a global resource; hence the only supported value for location is `global`.
https://cloud.google.com/api-keys/docs/v2/reference/rest/v2/projects/locations/keys/undelete

name <> 
V2UndeleteKeyRequest:
V2UndeleteKeyRequest"
  [name V2UndeleteKeyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://apikeys.googleapis.com/v2/{+name}:undelete",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body V2UndeleteKeyRequest}))

(defn projects-locations-keys-create
  "Creates a new API key. NOTE: Key is a global resource; hence the only supported value for location is `global`.
https://cloud.google.com/api-keys/docs/v2/reference/rest/v2/projects/locations/keys/create

parent <> 
V2Key:
V2Key

optional:
keyId <string> User specified key id (optional). If specified, it will become the final component of the key resource name. The id must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. In another word, the id must match the regular expression: `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`. The id must NOT be a UUID-like string."
  ([parent V2Key] (projects-locations-keys-create parent V2Key nil))
  ([parent V2Key optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://apikeys.googleapis.com/v2/{+parent}/keys",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body V2Key})))

(defn projects-locations-keys-delete
  "Deletes an API key. Deleted key can be retrieved within 30 days of deletion. Afterward, key will be purged from the project. NOTE: Key is a global resource; hence the only supported value for location is `global`.
https://cloud.google.com/api-keys/docs/v2/reference/rest/v2/projects/locations/keys/delete

name <> 

optional:
etag <string> Optional. The etag known to the client for the expected state of the key. This is to be used for optimistic concurrency."
  ([name] (projects-locations-keys-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://apikeys.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-keys-list
  "Lists the API keys owned by a project. The key string of the API key isn't included in the response. NOTE: Key is a global resource; hence the only supported value for location is `global`.
https://cloud.google.com/api-keys/docs/v2/reference/rest/v2/projects/locations/keys/list

parent <> 

optional:
showDeleted <boolean> Optional. Indicate that keys deleted in the past 30 days should also be returned.
pageSize <integer> Optional. Specifies the maximum number of results to be returned at a time."
  ([parent] (projects-locations-keys-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://apikeys.googleapis.com/v2/{+parent}/keys",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))

(defn projects-locations-keys-patch
  "Patches the modifiable fields of an API key. The key string of the API key isn't included in the response. NOTE: Key is a global resource; hence the only supported value for location is `global`.
https://cloud.google.com/api-keys/docs/v2/reference/rest/v2/projects/locations/keys/patch

name <> 
V2Key:
V2Key

optional:
updateMask <string> The field mask specifies which fields to be updated as part of this request. All other fields are ignored. Mutable fields are: `display_name`, `restrictions`, and `annotations`. If an update mask is not provided, the service treats it as an implied mask equivalent to all allowed fields that are set on the wire. If the field mask has a special value \"*\", the service treats it equivalent to replace all allowed mutable fields."
  ([name V2Key] (projects-locations-keys-patch name V2Key nil))
  ([name V2Key optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://apikeys.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body V2Key})))

(defn projects-locations-keys-get
  "Gets the metadata for an API key. The key string of the API key isn't included in the response. NOTE: Key is a global resource; hence the only supported value for location is `global`.
https://cloud.google.com/api-keys/docs/v2/reference/rest/v2/projects/locations/keys/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://apikeys.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn projects-locations-keys-getKeyString
  "Get the key string for an API key. NOTE: Key is a global resource; hence the only supported value for location is `global`.
https://cloud.google.com/api-keys/docs/v2/reference/rest/v2/projects/locations/keys/getKeyString

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://apikeys.googleapis.com/v2/{+name}/keyString",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/api-keys/docs/v2/reference/rest/v2/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://apikeys.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"]}))

(defn keys-lookupKey
  "Find the parent project and resource name of the API key that matches the key string in the request. If the API key has been purged, resource name will not be set. The service account must have the `apikeys.keys.lookup` permission on the parent project.
https://cloud.google.com/api-keys/docs/v2/reference/rest/v2/keys/lookupKey

optional:
keyString <string> Required. Finds the project that owns the key string value."
  ([] (keys-lookupKey nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://apikeys.googleapis.com/v2/keys:lookupKey",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"]})))
