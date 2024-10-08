(ns happyapi.google.cloudprofiler-v2
  "Cloud Profiler API
Manages continuous profiling information.
See: https://cloud.google.com/products/operations")

(defn projects-profiles-create
  "CreateProfile creates a new profile resource in the online mode. _Direct use of this API is discouraged, please use a [supported profiler agent](https://cloud.google.com/profiler/docs/about-profiler#profiling_agent) instead for profile collection._ The server ensures that the new profiles are created at a constant rate per deployment, so the creation request may hang for some time until the next profile session is available. The request may fail with ABORTED error if the creation is not available within ~1m, the response will indicate the duration of the backoff the client should take before attempting creating a profile again. The backoff duration is returned in google.rpc.RetryInfo extension on the response status. To a gRPC client, the extension will be return as a binary-serialized proto in the trailing metadata item named \"google.rpc.retryinfo-bin\". 
https://cloud.google.com/products/operations/v2/reference/rest/v2/projects/profiles/create

parent <> 
CreateProfileRequest:
CreateProfileRequest"
  [parent CreateProfileRequest]
  {:method :post,
   :uri-template
   "https://cloudprofiler.googleapis.com/v2/{+parent}/profiles",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/monitoring"
    "https://www.googleapis.com/auth/monitoring.write"],
   :body CreateProfileRequest})

(defn projects-profiles-createOffline
  "CreateOfflineProfile creates a new profile resource in the offline mode. The client provides the profile to create along with the profile bytes, the server records it. _Direct use of this API is discouraged, please use a [supported profiler agent](https://cloud.google.com/profiler/docs/about-profiler#profiling_agent) instead for profile collection._
https://cloud.google.com/products/operations/v2/reference/rest/v2/projects/profiles/createOffline

parent <> 
Profile:
Profile"
  [parent Profile]
  {:method :post,
   :uri-template
   "https://cloudprofiler.googleapis.com/v2/{+parent}/profiles:createOffline",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/monitoring"
    "https://www.googleapis.com/auth/monitoring.write"],
   :body Profile})

(defn projects-profiles-patch
  "UpdateProfile updates the profile bytes and labels on the profile resource created in the online mode. Updating the bytes for profiles created in the offline mode is currently not supported: the profile content must be provided at the time of the profile creation. _Direct use of this API is discouraged, please use a [supported profiler agent](https://cloud.google.com/profiler/docs/about-profiler#profiling_agent) instead for profile collection._
https://cloud.google.com/products/operations/v2/reference/rest/v2/projects/profiles/patch

name <> 
Profile:
Profile

optional:
updateMask <string> Field mask used to specify the fields to be overwritten. Currently only profile_bytes and labels fields are supported by UpdateProfile, so only those fields can be specified in the mask. When no mask is provided, all fields are overwritten."
  ([name Profile] (projects-profiles-patch name Profile nil))
  ([name Profile optional]
    {:method :patch,
     :uri-template "https://cloudprofiler.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.write"],
     :body Profile}))

(defn projects-profiles-list
  "Lists profiles which have been collected so far and for which the caller has permission to view.
https://cloud.google.com/products/operations/v2/reference/rest/v2/projects/profiles/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of items to return. Default page_size is 1000. Max limit is 1000."
  ([parent] (projects-profiles-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudprofiler.googleapis.com/v2/{+parent}/profiles",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/monitoring"
      "https://www.googleapis.com/auth/monitoring.write"]}))
