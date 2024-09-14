(ns happyapi.google.firebasehosting-v1
  "Firebase Hosting API
The Firebase Hosting REST API enables programmatic and customizable management and deployments to your Firebase-hosted sites. Use this REST API to create and manage channels and sites as well as to deploy new or updated hosting configurations and content files.
See: https://firebase.google.com/docs/hosting/")

(defn operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://firebase.google.com/docs/hosting/v1/reference/rest/v1/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://firebasehosting.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes nil}))

(defn operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://firebase.google.com/docs/hosting/v1/reference/rest/v1/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://firebasehosting.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil})

(defn operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://firebase.google.com/docs/hosting/v1/reference/rest/v1/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template
   "https://firebasehosting.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes nil,
   :body CancelOperationRequest})

(defn projects-sites-customDomains-operations-delete
  "DeleteOperation is a part of the google.longrunning.Operations interface, but is not implemented for CustomDomain resources.
https://firebase.google.com/docs/hosting/v1/reference/rest/v1/projects/sites/customDomains/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://firebasehosting.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"]})

(defn projects-sites-customDomains-operations-cancel
  "CancelOperation is a part of the google.longrunning.Operations interface, but is not implemented for CustomDomain resources.
https://firebase.google.com/docs/hosting/v1/reference/rest/v1/projects/sites/customDomains/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template
   "https://firebasehosting.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/firebase"],
   :body CancelOperationRequest})
