(ns happyapi.google.developerconnect-v1
  "Developer Connect API
Connect third-party source code management to Google
See: https://cloud.google.com/developer-connect/docs/overview")

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://developerconnect.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://developerconnect.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://developerconnect.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://developerconnect.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://developerconnect.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template
   "https://developerconnect.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CancelOperationRequest})

(defn projects-locations-connections-list
  "Lists Connections in a given project and location.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Optional. Filtering results
orderBy <string> Optional. Hint for how to order the results"
  ([parent] (projects-locations-connections-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://developerconnect.googleapis.com/v1/{+parent}/connections",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-get
  "Gets details of a single Connection.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://developerconnect.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-connections-create
  "Creates a new Connection in a given project and location.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/create

parent <> 
Connection:
Connection

optional:
connectionId <string> Required. Id of the requesting object If auto-generating Id server-side, remove this field and connection_id from the method_signature of Create RPC
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, validate the request, but do not actually post it."
  ([parent Connection]
    (projects-locations-connections-create parent Connection nil))
  ([parent Connection optional]
    {:method :post,
     :uri-template
     "https://developerconnect.googleapis.com/v1/{+parent}/connections",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Connection}))

(defn projects-locations-connections-patch
  "Updates the parameters of a single Connection.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/patch

name <> 
Connection:
Connection

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the Connection resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
allowMissing <boolean> Optional. If set to true, and the connection is not found a new connection will be created. In this situation `update_mask` is ignored. The creation will succeed only if the input connection has all the necessary information (e.g a github_config with both user_oauth_token and installation_id properties).
validateOnly <boolean> Optional. If set, validate the request, but do not actually post it."
  ([name Connection]
    (projects-locations-connections-patch name Connection nil))
  ([name Connection optional]
    {:method :patch,
     :uri-template
     "https://developerconnect.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Connection}))

(defn projects-locations-connections-delete
  "Deletes a single Connection.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, validate the request, but do not actually post it.
etag <string> Optional. The current etag of the Connection. If an etag is provided and does not match the current etag of the Connection, deletion will be blocked and an ABORTED error will be returned."
  ([name] (projects-locations-connections-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://developerconnect.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-fetchLinkableGitRepositories
  "FetchLinkableGitRepositories returns a list of git repositories from an SCM that are available to be added to a Connection.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/fetchLinkableGitRepositories

connection <> 

optional:
pageSize <integer> Optional. Number of results to return in the list. Defaults to 20."
  ([connection]
    (projects-locations-connections-fetchLinkableGitRepositories
      connection
      nil))
  ([connection optional]
    {:method :get,
     :uri-template
     "https://developerconnect.googleapis.com/v1/{+connection}:fetchLinkableGitRepositories",
     :uri-template-args {"connection" connection},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-fetchGitHubInstallations
  "FetchGitHubInstallations returns the list of GitHub Installations that are available to be added to a Connection. For github.com, only installations accessible to the authorizer token are returned. For GitHub Enterprise, all installations are returned.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/fetchGitHubInstallations

connection <> "
  [connection]
  {:method :get,
   :uri-template
   "https://developerconnect.googleapis.com/v1/{+connection}:fetchGitHubInstallations",
   :uri-template-args {"connection" connection},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-connections-gitRepositoryLinks-create
  "Creates a GitRepositoryLink. Upon linking a Git Repository, Developer Connect will configure the Git Repository to send webhook events to Developer Connect. Connections that use Firebase GitHub Application will have events forwarded to the Firebase service. All other Connections will have events forwarded to Cloud Build.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/gitRepositoryLinks/create

parent <> 
GitRepositoryLink:
GitRepositoryLink

optional:
gitRepositoryLinkId <string> Required. The ID to use for the repository, which will become the final component of the repository's resource name. This ID should be unique in the connection. Allows alphanumeric characters and any of -._~%!$&'()*+,;=@.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, validate the request, but do not actually post it."
  ([parent GitRepositoryLink]
    (projects-locations-connections-gitRepositoryLinks-create
      parent
      GitRepositoryLink
      nil))
  ([parent GitRepositoryLink optional]
    {:method :post,
     :uri-template
     "https://developerconnect.googleapis.com/v1/{+parent}/gitRepositoryLinks",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GitRepositoryLink}))

(defn projects-locations-connections-gitRepositoryLinks-delete
  "Deletes a single GitRepositoryLink.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/gitRepositoryLinks/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set, validate the request, but do not actually post it.
etag <string> Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding."
  ([name]
    (projects-locations-connections-gitRepositoryLinks-delete
      name
      nil))
  ([name optional]
    {:method :delete,
     :uri-template
     "https://developerconnect.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-gitRepositoryLinks-list
  "Lists GitRepositoryLinks in a given project, location, and connection.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/gitRepositoryLinks/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Optional. Filtering results
orderBy <string> Optional. Hint for how to order the results"
  ([parent]
    (projects-locations-connections-gitRepositoryLinks-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://developerconnect.googleapis.com/v1/{+parent}/gitRepositoryLinks",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-connections-gitRepositoryLinks-get
  "Gets details of a single GitRepositoryLink.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/gitRepositoryLinks/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://developerconnect.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-connections-gitRepositoryLinks-fetchReadWriteToken
  "Fetches read/write token of a given gitRepositoryLink.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/gitRepositoryLinks/fetchReadWriteToken

gitRepositoryLink <> 
FetchReadWriteTokenRequest:
FetchReadWriteTokenRequest"
  [gitRepositoryLink FetchReadWriteTokenRequest]
  {:method :post,
   :uri-template
   "https://developerconnect.googleapis.com/v1/{+gitRepositoryLink}:fetchReadWriteToken",
   :uri-template-args {"gitRepositoryLink" gitRepositoryLink},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body FetchReadWriteTokenRequest})

(defn projects-locations-connections-gitRepositoryLinks-fetchReadToken
  "Fetches read token of a given gitRepositoryLink.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/gitRepositoryLinks/fetchReadToken

gitRepositoryLink <> 
FetchReadTokenRequest:
FetchReadTokenRequest"
  [gitRepositoryLink FetchReadTokenRequest]
  {:method :post,
   :uri-template
   "https://developerconnect.googleapis.com/v1/{+gitRepositoryLink}:fetchReadToken",
   :uri-template-args {"gitRepositoryLink" gitRepositoryLink},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body FetchReadTokenRequest})

(defn projects-locations-connections-gitRepositoryLinks-fetchGitRefs
  "Fetch the list of branches or tags for a given repository.
https://cloud.google.com/developer-connect/docs/overview/v1/reference/rest/v1/projects/locations/connections/gitRepositoryLinks/fetchGitRefs

gitRepositoryLink <> 

optional:
refType <string> Required. Type of refs to fetch.
pageSize <integer> Optional. Number of results to return in the list. Default to 20."
  ([gitRepositoryLink]
    (projects-locations-connections-gitRepositoryLinks-fetchGitRefs
      gitRepositoryLink
      nil))
  ([gitRepositoryLink optional]
    {:method :get,
     :uri-template
     "https://developerconnect.googleapis.com/v1/{+gitRepositoryLink}:fetchGitRefs",
     :uri-template-args {"gitRepositoryLink" gitRepositoryLink},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
