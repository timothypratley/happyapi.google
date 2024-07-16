(ns happyapi.google.contactcenteraiplatform-v1alpha1
  "Contact Center AI Platform API

See: https://cloud.google.com/solutions/contact-center-ai-platform"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-queryContactCenterQuota
  "Queries the contact center quota, an aggregation over all the projects, that belongs to the billing account, which the input project belongs to.
https://cloud.google.com/solutions/contact-center-ai-platform/v1alpha1/reference/rest/v1alpha1/projects/locations/queryContactCenterQuota

parent <> "
  [parent]
  (client/api-request
    {:method :get,
     :uri-template
     "https://contactcenteraiplatform.googleapis.com/v1alpha1/{+parent}:queryContactCenterQuota",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/solutions/contact-center-ai-platform/v1alpha1/reference/rest/v1alpha1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://contactcenteraiplatform.googleapis.com/v1alpha1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/solutions/contact-center-ai-platform/v1alpha1/reference/rest/v1alpha1/projects/locations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://contactcenteraiplatform.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/solutions/contact-center-ai-platform/v1alpha1/reference/rest/v1alpha1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://contactcenteraiplatform.googleapis.com/v1alpha1/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/solutions/contact-center-ai-platform/v1alpha1/reference/rest/v1alpha1/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://contactcenteraiplatform.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/solutions/contact-center-ai-platform/v1alpha1/reference/rest/v1alpha1/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://contactcenteraiplatform.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/solutions/contact-center-ai-platform/v1alpha1/reference/rest/v1alpha1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://contactcenteraiplatform.googleapis.com/v1alpha1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CancelOperationRequest}))

(defn projects-locations-contactCenters-list
  "Lists ContactCenters in a given project and location.
https://cloud.google.com/solutions/contact-center-ai-platform/v1alpha1/reference/rest/v1alpha1/projects/locations/contactCenters/list

parent <> 

optional:
pageSize <integer> Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
filter <string> Filtering results
orderBy <string> Hint for how to order the results"
  ([parent] (projects-locations-contactCenters-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://contactcenteraiplatform.googleapis.com/v1alpha1/{+parent}/contactCenters",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-contactCenters-get
  "Gets details of a single ContactCenter.
https://cloud.google.com/solutions/contact-center-ai-platform/v1alpha1/reference/rest/v1alpha1/projects/locations/contactCenters/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://contactcenteraiplatform.googleapis.com/v1alpha1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-contactCenters-create
  "Creates a new ContactCenter in a given project and location.
https://cloud.google.com/solutions/contact-center-ai-platform/v1alpha1/reference/rest/v1alpha1/projects/locations/contactCenters/create

parent <> 
ContactCenter:
ContactCenter

optional:
contactCenterId <string> Required. Id of the requesting object If auto-generating Id server-side, remove this field and contact_center_id from the method_signature of Create RPC
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([parent ContactCenter]
    (projects-locations-contactCenters-create
      parent
      ContactCenter
      nil))
  ([parent ContactCenter optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://contactcenteraiplatform.googleapis.com/v1alpha1/{+parent}/contactCenters",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ContactCenter})))

(defn projects-locations-contactCenters-patch
  "Updates the parameters of a single ContactCenter.
https://cloud.google.com/solutions/contact-center-ai-platform/v1alpha1/reference/rest/v1alpha1/projects/locations/contactCenters/patch

name <> 
ContactCenter:
ContactCenter

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten in the ContactCenter resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name ContactCenter]
    (projects-locations-contactCenters-patch name ContactCenter nil))
  ([name ContactCenter optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://contactcenteraiplatform.googleapis.com/v1alpha1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body ContactCenter})))

(defn projects-locations-contactCenters-delete
  "Deletes a single ContactCenter.
https://cloud.google.com/solutions/contact-center-ai-platform/v1alpha1/reference/rest/v1alpha1/projects/locations/contactCenters/delete

name <> 

optional:
requestId <string> Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000)."
  ([name] (projects-locations-contactCenters-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://contactcenteraiplatform.googleapis.com/v1alpha1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
