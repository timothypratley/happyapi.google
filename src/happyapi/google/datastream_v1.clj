(ns happyapi.google.datastream-v1
  "Datastream API

See: https://cloud.google.com/datastream/"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-fetchStaticIps
  "The FetchStaticIps API call exposes the static IP addresses used by Datastream.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/fetchStaticIps

name <> 

optional:
pageSize <integer> Maximum number of Ips to return, will likely not be specified."
  ([name] (projects-locations-fetchStaticIps name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datastream.googleapis.com/v1/{+name}:fetchStaticIps",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datastream.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://datastream.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datastream.googleapis.com/v1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://datastream.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://datastream.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://datastream.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-connectionProfiles-list
  "Use this method to list connection profiles created in a project and location.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/connectionProfiles/list

parent <> 

optional:
pageSize <integer> Maximum number of connection profiles to return. If unspecified, at most 50 connection profiles will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Filter request.
orderBy <string> Order by fields for the result."
  ([parent] (projects-locations-connectionProfiles-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datastream.googleapis.com/v1/{+parent}/connectionProfiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-connectionProfiles-get
  "Use this method to get details about a connection profile.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/connectionProfiles/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://datastream.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connectionProfiles-create
  "Use this method to create a connection profile in a project and location.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/connectionProfiles/create

parent <> 
ConnectionProfile:
ConnectionProfile

optional:
connectionProfileId <string> Required. The connection profile identifier.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. Only validate the connection profile, but don't create any resources. The default is false.
force <boolean> Optional. Create the connection profile without validating it."
  ([parent ConnectionProfile]
    (projects-locations-connectionProfiles-create
      parent
      ConnectionProfile
      nil))
  ([parent ConnectionProfile optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://datastream.googleapis.com/v1/{+parent}/connectionProfiles",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ConnectionProfile})))

(defn projects-locations-connectionProfiles-patch
  "Use this method to update the parameters of a connection profile.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/connectionProfiles/patch

name <> 
ConnectionProfile:
ConnectionProfile

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the ConnectionProfile resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. Only validate the connection profile, but don't update any resources. The default is false.
force <boolean> Optional. Update the connection profile without validating it."
  ([name ConnectionProfile]
    (projects-locations-connectionProfiles-patch
      name
      ConnectionProfile
      nil))
  ([name ConnectionProfile optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://datastream.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ConnectionProfile})))

(defn projects-locations-connectionProfiles-delete
  "Use this method to delete a connection profile.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/connectionProfiles/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-connectionProfiles-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://datastream.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-connectionProfiles-discover
  "Use this method to discover a connection profile. The discover API call exposes the data objects and metadata belonging to the profile. Typically, a request returns children data objects of a parent data object that's optionally supplied in the request.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/connectionProfiles/discover

parent <> 
DiscoverConnectionProfileRequest:
DiscoverConnectionProfileRequest"
  [parent DiscoverConnectionProfileRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://datastream.googleapis.com/v1/{+parent}/connectionProfiles:discover",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body DiscoverConnectionProfileRequest}))

(defn projects-locations-streams-list
  "Use this method to list streams in a project and location.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/streams/list

parent <> 

optional:
pageSize <integer> Maximum number of streams to return. If unspecified, at most 50 streams will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Filter request.
orderBy <string> Order by fields for the result."
  ([parent] (projects-locations-streams-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datastream.googleapis.com/v1/{+parent}/streams",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-streams-get
  "Use this method to get details about a stream.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/streams/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://datastream.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-streams-create
  "Use this method to create a stream.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/streams/create

parent <> 
Stream:
Stream

optional:
streamId <string> Required. The stream identifier.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. Only validate the stream, but don't create any resources. The default is false.
force <boolean> Optional. Create the stream without validating it."
  ([parent Stream]
    (projects-locations-streams-create parent Stream nil))
  ([parent Stream optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://datastream.googleapis.com/v1/{+parent}/streams",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Stream})))

(defn projects-locations-streams-patch
  "Use this method to update the configuration of a stream.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/streams/patch

name <> 
Stream:
Stream

optional:
updateMask <string> Optional. Field mask is used to specify the fields to be overwritten in the stream resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. Only validate the stream with the changes, without actually updating it. The default is false.
force <boolean> Optional. Update the stream without validating it."
  ([name Stream] (projects-locations-streams-patch name Stream nil))
  ([name Stream optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://datastream.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Stream})))

(defn projects-locations-streams-delete
  "Use this method to delete a stream.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/streams/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-streams-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://datastream.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-streams-run
  "Use this method to start, resume or recover a stream with a non default CDC strategy. NOTE: This feature is currently experimental.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/streams/run

name <> 
RunStreamRequest:
RunStreamRequest"
  [name RunStreamRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://datastream.googleapis.com/v1/{+name}:run",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RunStreamRequest}))

(defn projects-locations-streams-objects-get
  "Use this method to get details about a stream object.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/streams/objects/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://datastream.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-streams-objects-lookup
  "Use this method to look up a stream object by its source object identifier.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/streams/objects/lookup

parent <> 
LookupStreamObjectRequest:
LookupStreamObjectRequest"
  [parent LookupStreamObjectRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://datastream.googleapis.com/v1/{+parent}/objects:lookup",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body LookupStreamObjectRequest}))

(defn projects-locations-streams-objects-list
  "Use this method to list the objects of a specific stream.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/streams/objects/list

parent <> 

optional:
pageSize <integer> Maximum number of objects to return. Default is 50. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-streams-objects-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datastream.googleapis.com/v1/{+parent}/objects",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-streams-objects-startBackfillJob
  "Use this method to start a backfill job for the specified stream object.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/streams/objects/startBackfillJob

object <> 
StartBackfillJobRequest:
StartBackfillJobRequest"
  [object StartBackfillJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://datastream.googleapis.com/v1/{+object}:startBackfillJob",
     :uri-template-args {"object" object},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body StartBackfillJobRequest}))

(defn projects-locations-streams-objects-stopBackfillJob
  "Use this method to stop a backfill job for the specified stream object.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/streams/objects/stopBackfillJob

object <> 
StopBackfillJobRequest:
StopBackfillJobRequest"
  [object StopBackfillJobRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://datastream.googleapis.com/v1/{+object}:stopBackfillJob",
     :uri-template-args {"object" object},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body StopBackfillJobRequest}))

(defn projects-locations-privateConnections-create
  "Use this method to create a private connectivity configuration.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/privateConnections/create

parent <> 
PrivateConnection:
PrivateConnection

optional:
privateConnectionId <string> Required. The private connectivity identifier.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
force <boolean> Optional. If set to true, will skip validations."
  ([parent PrivateConnection]
    (projects-locations-privateConnections-create
      parent
      PrivateConnection
      nil))
  ([parent PrivateConnection optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://datastream.googleapis.com/v1/{+parent}/privateConnections",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body PrivateConnection})))

(defn projects-locations-privateConnections-get
  "Use this method to get details about a private connectivity configuration.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/privateConnections/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://datastream.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-privateConnections-list
  "Use this method to list private connectivity configurations in a project and location.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/privateConnections/list

parent <> 

optional:
pageSize <integer> Maximum number of private connectivity configurations to return. If unspecified, at most 50 private connectivity configurations that will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Filter request.
orderBy <string> Order by fields for the result."
  ([parent] (projects-locations-privateConnections-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datastream.googleapis.com/v1/{+parent}/privateConnections",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-privateConnections-delete
  "Use this method to delete a private connectivity configuration.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/privateConnections/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
force <boolean> Optional. If set to true, any child routes that belong to this PrivateConnection will also be deleted."
  ([name] (projects-locations-privateConnections-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://datastream.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-privateConnections-routes-create
  "Use this method to create a route for a private connectivity configuration in a project and location.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/privateConnections/routes/create

parent <> 
Route:
Route

optional:
routeId <string> Required. The Route identifier.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent Route]
    (projects-locations-privateConnections-routes-create
      parent
      Route
      nil))
  ([parent Route optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://datastream.googleapis.com/v1/{+parent}/routes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Route})))

(defn projects-locations-privateConnections-routes-get
  "Use this method to get details about a route.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/privateConnections/routes/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://datastream.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-privateConnections-routes-list
  "Use this method to list routes created for a private connectivity configuration in a project and location.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/privateConnections/routes/list

parent <> 

optional:
pageSize <integer> Maximum number of Routes to return. The service may return fewer than this value. If unspecified, at most 50 Routes will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
filter <string> Filter request.
orderBy <string> Order by fields for the result."
  ([parent]
    (projects-locations-privateConnections-routes-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://datastream.googleapis.com/v1/{+parent}/routes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-privateConnections-routes-delete
  "Use this method to delete a route.
https://cloud.google.com/datastream/v1/reference/rest/v1/projects/locations/privateConnections/routes/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name]
    (projects-locations-privateConnections-routes-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://datastream.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
