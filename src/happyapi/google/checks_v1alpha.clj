(ns happyapi.google.checks-v1alpha
  "Checks API
The Checks API contains powerful and easy-to-use privacy and compliance APIs that interact with the Checks product and its underlying technology.
See: https://developers.google.com/checks")

(defn media-upload
  "Analyzes the uploaded app bundle and returns a google.longrunning.Operation containing the generated Report. ## Example (upload only) Send a regular POST request with the header `X-Goog-Upload-Protocol: raw`. ``` POST https://checks.googleapis.com/upload/v1alpha/{parent=accounts/*/apps/*}/reports:analyzeUpload HTTP/1.1 X-Goog-Upload-Protocol: raw Content-Length: Content-Type: application/octet-stream ``` ## Example (upload with metadata) Send a multipart POST request where the first body part contains the metadata JSON and the second body part contains the binary upload. Include the header `X-Goog-Upload-Protocol: multipart`. ``` POST https://checks.googleapis.com/upload/v1alpha/{parent=accounts/*/apps/*}/reports:analyzeUpload HTTP/1.1 X-Goog-Upload-Protocol: multipart Content-Length: ? Content-Type: multipart/related; boundary=BOUNDARY --BOUNDARY Content-Type: application/json {\"code_reference_id\":\"db5bcc20f94055fb5bc08cbb9b0e7a5530308786\"} --BOUNDARY --BOUNDARY-- ``` *Note:* Metadata-only requests are not supported. 
https://developers.google.com/checks/v1alpha/reference/rest/v1alpha/media/upload

parent <> 
GoogleChecksReportV1alphaAnalyzeUploadRequest:
GoogleChecksReportV1alphaAnalyzeUploadRequest"
  [parent GoogleChecksReportV1alphaAnalyzeUploadRequest]
  {:method :post,
   :uri-template
   "https://checks.googleapis.com/v1alpha/{+parent}/reports:analyzeUpload",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes nil,
   :body GoogleChecksReportV1alphaAnalyzeUploadRequest})

(defn accounts-apps-get
  "Gets an app.
https://developers.google.com/checks/v1alpha/reference/rest/v1alpha/accounts/apps/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://checks.googleapis.com/v1alpha/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn accounts-apps-list
  "Lists the apps under the given account.
https://developers.google.com/checks/v1alpha/reference/rest/v1alpha/accounts/apps/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return. The server may further constrain the maximum number of results returned in a single page. If unspecified, the server will decide the number of results to be returned."
  ([parent] (accounts-apps-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://checks.googleapis.com/v1alpha/{+parent}/apps",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes nil}))

(defn accounts-apps-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://developers.google.com/checks/v1alpha/reference/rest/v1alpha/accounts/apps/operations/wait

name <> 
WaitOperationRequest:
WaitOperationRequest"
  [name WaitOperationRequest]
  {:method :post,
   :uri-template "https://checks.googleapis.com/v1alpha/{+name}:wait",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil,
   :body WaitOperationRequest})

(defn accounts-apps-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://developers.google.com/checks/v1alpha/reference/rest/v1alpha/accounts/apps/operations/list

name <> 

optional:
pageSize <integer> The standard list page size.
filter <string> The standard list filter."
  ([name] (accounts-apps-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://checks.googleapis.com/v1alpha/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes nil}))

(defn accounts-apps-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://developers.google.com/checks/v1alpha/reference/rest/v1alpha/accounts/apps/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://checks.googleapis.com/v1alpha/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn accounts-apps-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://developers.google.com/checks/v1alpha/reference/rest/v1alpha/accounts/apps/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://checks.googleapis.com/v1alpha/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn accounts-apps-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://developers.google.com/checks/v1alpha/reference/rest/v1alpha/accounts/apps/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template
   "https://checks.googleapis.com/v1alpha/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil,
   :body CancelOperationRequest})

(defn accounts-apps-reports-list
  "Lists reports for the specified app. By default, only the name and results_uri fields are returned. You can include other fields by listing them in the `fields` URL query parameter. For example, `?fields=reports(name,checks)` will return the name and checks fields.
https://developers.google.com/checks/v1alpha/reference/rest/v1alpha/accounts/apps/reports/list

parent <> 

optional:
filter <string> Optional. An [AIP-160](https://google.aip.dev/160) filter string to filter reports. Example: `appBundle.releaseType = PRE_RELEASE`
checksFilter <string> Optional. An [AIP-160](https://google.aip.dev/160) filter string to filter checks within reports. Only checks that match the filter string are included in the response. Example: `state = FAILED`
pageSize <integer> Optional. The maximum number of reports to return. If unspecified, at most 10 reports will be returned. The maximum value is 50; values above 50 will be coerced to 50."
  ([parent] (accounts-apps-reports-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://checks.googleapis.com/v1alpha/{+parent}/reports",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes nil}))

(defn accounts-apps-reports-get
  "Gets a report. By default, only the name and results_uri fields are returned. You can include other fields by listing them in the `fields` URL query parameter. For example, `?fields=name,checks` will return the name and checks fields.
https://developers.google.com/checks/v1alpha/reference/rest/v1alpha/accounts/apps/reports/get

name <> 

optional:
checksFilter <string> Optional. An [AIP-160](https://google.aip.dev/160) filter string to filter checks within the report. Only checks that match the filter string are included in the response. Example: `state = FAILED`"
  ([name] (accounts-apps-reports-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://checks.googleapis.com/v1alpha/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes nil}))
