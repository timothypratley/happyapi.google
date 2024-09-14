(ns happyapi.google.webrisk-v1
  "Web Risk API

See: https://cloud.google.com/security/products/web-risk")

(defn hashes-search
  "Gets the full hashes that match the requested hash prefix. This is used after a hash prefix is looked up in a threatList and there is a match. The client side threatList only holds partial hashes so the client must query this method to determine if there is a full hash match of a threat.
https://cloud.google.com/security/products/web-risk/v1/reference/rest/v1/hashes/search

optional:
hashPrefix <string> A hash prefix, consisting of the most significant 4-32 bytes of a SHA256 hash. For JSON requests, this field is base64-encoded. Note that if this parameter is provided by a URI, it must be encoded using the web safe base64 variant (RFC 4648).
threatTypes <string> Required. The ThreatLists to search in. Multiple ThreatLists may be specified."
  ([] (hashes-search nil))
  ([optional]
    {:method :get,
     :uri-template "https://webrisk.googleapis.com/v1/hashes:search",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/security/products/web-risk/v1/reference/rest/v1/projects/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name] (projects-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://webrisk.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes nil}))

(defn projects-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/security/products/web-risk/v1/reference/rest/v1/projects/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://webrisk.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn projects-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/security/products/web-risk/v1/reference/rest/v1/projects/operations/cancel

name <> 
GoogleLongrunningCancelOperationRequest:
GoogleLongrunningCancelOperationRequest"
  [name GoogleLongrunningCancelOperationRequest]
  {:method :post,
   :uri-template "https://webrisk.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil,
   :body GoogleLongrunningCancelOperationRequest})

(defn projects-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/security/products/web-risk/v1/reference/rest/v1/projects/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://webrisk.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-submissions-create
  "Creates a Submission of a URI suspected of containing phishing content to be reviewed. If the result verifies the existence of malicious phishing content, the site will be added to the [Google's Social Engineering lists](https://support.google.com/webmasters/answer/6350487/) in order to protect users that could get exposed to this threat in the future. Only allowlisted projects can use this method during Early Access. Please reach out to Sales or your customer engineer to obtain access.
https://cloud.google.com/security/products/web-risk/v1/reference/rest/v1/projects/submissions/create

parent <> 
GoogleCloudWebriskV1Submission:
GoogleCloudWebriskV1Submission"
  [parent GoogleCloudWebriskV1Submission]
  {:method :post,
   :uri-template
   "https://webrisk.googleapis.com/v1/{+parent}/submissions",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudWebriskV1Submission})

(defn threatLists-computeDiff
  "Gets the most recent threat list diffs. These diffs should be applied to a local database of hashes to keep it up-to-date. If the local database is empty or excessively out-of-date, a complete snapshot of the database will be returned. This Method only updates a single ThreatList at a time. To update multiple ThreatList databases, this method needs to be called once for each list.
https://cloud.google.com/security/products/web-risk/v1/reference/rest/v1/threatLists/computeDiff

optional:
constraints.maxDatabaseEntries <integer> Sets the maximum number of entries that the client is willing to have in the local database. This should be a power of 2 between 2**10 and 2**20. If zero, no database size limit is set.
constraints.maxDiffEntries <integer> The maximum size in number of entries. The diff will not contain more entries than this value. This should be a power of 2 between 2**10 and 2**20. If zero, no diff size limit is set.
constraints.supportedCompressions <string> The compression types supported by the client.
versionToken <string> The current version token of the client for the requested list (the client version that was received from the last successful diff). If the client does not have a version token (this is the first time calling ComputeThreatListDiff), this may be left empty and a full database snapshot will be returned.
threatType <string> Required. The threat list to update. Only a single ThreatType should be specified per request. If you want to handle multiple ThreatTypes, you must make one request per ThreatType."
  ([] (threatLists-computeDiff nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://webrisk.googleapis.com/v1/threatLists:computeDiff",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn uris-search
  "This method is used to check whether a URI is on a given threatList. Multiple threatLists may be searched in a single query. The response will list all requested threatLists the URI was found to match. If the URI is not found on any of the requested ThreatList an empty response will be returned.
https://cloud.google.com/security/products/web-risk/v1/reference/rest/v1/uris/search

optional:
uri <string> Required. The URI to be checked for matches.
threatTypes <string> Required. The ThreatLists to search in. Multiple ThreatLists may be specified."
  ([] (uris-search nil))
  ([optional]
    {:method :get,
     :uri-template "https://webrisk.googleapis.com/v1/uris:search",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
