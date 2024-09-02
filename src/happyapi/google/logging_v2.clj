(ns happyapi.google.logging-v2
  "Cloud Logging API
Writes log entries and manages your Cloud Logging configuration.
See: https://cloud.google.com/logging/docs/"
  (:require [happyapi.providers.google :as client]))

(defn monitoredResourceDescriptors-list
  "Lists the descriptors for monitored resource types used by Logging.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/monitoredResourceDescriptors/list

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([] (monitoredResourceDescriptors-list nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/monitoredResourceDescriptors",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn sinks-list
  "Lists sinks.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/sinks/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
filter <string> Optional. A filter expression to constrain the sinks returned. Today, this only supports the following strings: '' 'in_scope(\"ALL\")', 'in_scope(\"ANCESTOR\")', 'in_scope(\"DEFAULT\")'.Description of scopes below. ALL: Includes all of the sinks which can be returned in any other scope. ANCESTOR: Includes intercepting sinks owned by ancestor resources. DEFAULT: Includes sinks owned by parent.When the empty string is provided, then the filter 'in_scope(\"DEFAULT\")' is applied."
  ([parent] (sinks-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/sinks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn sinks-get
  "Gets a sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/sinks/get

sinkName <> "
  [sinkName]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
     :uri-template-args {"sinkName" sinkName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn sinks-create
  "Creates a sink that exports specified log entries to a destination. The export begins upon ingress, unless the sink's writer_identity is not permitted to write to the destination. A sink can export log entries only from the resource owning the sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/sinks/create

parent <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. Determines the kind of IAM identity returned as writer_identity in the new sink. If this value is omitted or set to false, and if the sink's parent is a project, then the value returned as writer_identity is the same group or service account used by Cloud Logging before the addition of writer identities to this API. The sink's destination must be in the same project as the sink itself.If this field is set to true, or if the sink is owned by a non-project resource such as an organization, then the value of writer_identity will be a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) used by the sinks with the same parent. For more information, see writer_identity in LogSink.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated."
  ([parent LogSink] (sinks-create parent LogSink nil))
  ([parent LogSink optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/sinks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn sinks-update
  "Updates a sink. This method replaces the values of the destination and filter fields of the existing sink with the corresponding values from the new sink.The updated sink might also have a new writer_identity; see the unique_writer_identity field.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/sinks/update

sinkName <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the updated sink depends on both the old and new values of this field: If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity. If the old value is false and the new value is true, then writer_identity is changed to a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) owned by Cloud Logging. It is an error if the old value is true and the new value is set to false or defaulted to false.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated.
updateMask <string> Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility purposes:destination,filter,includeChildrenAt some point in the future, behavior will be removed and specifying an empty updateMask will be an error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([sinkName LogSink] (sinks-update sinkName LogSink nil))
  ([sinkName LogSink optional]
    (client/*api-request*
      {:method :put,
       :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
       :uri-template-args {"sinkName" sinkName},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn sinks-delete
  "Deletes a sink. If the sink has a unique writer_identity, then that service account is also deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/sinks/delete

sinkName <> "
  [sinkName]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
     :uri-template-args {"sinkName" sinkName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like \"displayName=tokyo\", and is documented in more detail in AIP-160 (https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn locations-get
  "Gets information about a location.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns UNIMPLEMENTED.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns google.rpc.Code.UNIMPLEMENTED. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to Code.CANCELLED.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://logging.googleapis.com/v2/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body CancelOperationRequest}))

(defn locations-buckets-list
  "Lists log buckets.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (locations-buckets-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn locations-buckets-get
  "Gets a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn locations-buckets-createAsync
  "Creates a log bucket asynchronously that can be used to store log entries.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/createAsync

parent <> 
LogBucket:
LogBucket

optional:
bucketId <string> Required. A client-assigned identifier such as \"my-bucket\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. Bucket identifiers must start with an alphanumeric character."
  ([parent LogBucket]
    (locations-buckets-createAsync parent LogBucket nil))
  ([parent LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets:createAsync",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn locations-buckets-updateAsync
  "Updates a log bucket asynchronously.If the bucket has a lifecycle_state of DELETE_REQUESTED, then FAILED_PRECONDITION will be returned.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/updateAsync

name <> 
LogBucket:
LogBucket

optional:
updateMask <string> Required. Field mask that specifies the fields in bucket that need an update. A bucket field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see: https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=retention_days"
  ([name LogBucket] (locations-buckets-updateAsync name LogBucket nil))
  ([name LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}:updateAsync",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn locations-buckets-create
  "Creates a log bucket that can be used to store log entries. After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/create

parent <> 
LogBucket:
LogBucket

optional:
bucketId <string> Required. A client-assigned identifier such as \"my-bucket\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. Bucket identifiers must start with an alphanumeric character."
  ([parent LogBucket] (locations-buckets-create parent LogBucket nil))
  ([parent LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn locations-buckets-patch
  "Updates a log bucket.If the bucket has a lifecycle_state of DELETE_REQUESTED, then FAILED_PRECONDITION will be returned.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/patch

name <> 
LogBucket:
LogBucket

optional:
updateMask <string> Required. Field mask that specifies the fields in bucket that need an update. A bucket field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see: https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=retention_days"
  ([name LogBucket] (locations-buckets-patch name LogBucket nil))
  ([name LogBucket optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn locations-buckets-delete
  "Deletes a log bucket.Changes the bucket's lifecycle_state to the DELETE_REQUESTED state. After 7 days, the bucket will be purged and all log entries in the bucket will be permanently deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn locations-buckets-undelete
  "Undeletes a log bucket. A bucket that has been deleted can be undeleted within the grace period of 7 days.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/undelete

name <> 
UndeleteBucketRequest:
UndeleteBucketRequest"
  [name UndeleteBucketRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}:undelete",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body UndeleteBucketRequest}))

(defn locations-buckets-views-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/views/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body SetIamPolicyRequest}))

(defn locations-buckets-views-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/views/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"],
     :body GetIamPolicyRequest}))

(defn locations-buckets-views-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/views/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"],
     :body TestIamPermissionsRequest}))

(defn locations-buckets-views-list
  "Lists views on a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/views/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request.Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (locations-buckets-views-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/views",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn locations-buckets-views-get
  "Gets a view on a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/views/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn locations-buckets-views-create
  "Creates a view over log entries in a log bucket. A bucket may contain a maximum of 30 views.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/views/create

parent <> 
LogView:
LogView

optional:
viewId <string> Required. A client-assigned identifier such as \"my-view\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods."
  ([parent LogView]
    (locations-buckets-views-create parent LogView nil))
  ([parent LogView optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/views",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogView})))

(defn locations-buckets-views-patch
  "Updates a view on a log bucket. This method replaces the value of the filter field from the existing view with the corresponding value from the new view. If an UNAVAILABLE error is returned, this indicates that system is not in a state where it can update the view. If this occurs, please try again in a few minutes.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/views/patch

name <> 
LogView:
LogView

optional:
updateMask <string> Optional. Field mask that specifies the fields in view that need an update. A field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([name LogView] (locations-buckets-views-patch name LogView nil))
  ([name LogView optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogView})))

(defn locations-buckets-views-delete
  "Deletes a view on a log bucket. If an UNAVAILABLE error is returned, this indicates that system is not in a state where it can delete the view. If this occurs, please try again in a few minutes.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/views/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn locations-buckets-links-list
  "Lists links.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/links/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request."
  ([parent] (locations-buckets-links-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/links",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn locations-buckets-links-get
  "Gets a link.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/links/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn locations-buckets-links-create
  "Asynchronously creates a linked dataset in BigQuery which makes it possible to use BigQuery to read the logs stored in the log bucket. A log bucket may currently only contain one link.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/links/create

parent <> 
Link:
Link

optional:
linkId <string> Required. The ID to use for the link. The link_id can have up to 100 characters. A valid link_id must only have alphanumeric characters and underscores within it."
  ([parent Link] (locations-buckets-links-create parent Link nil))
  ([parent Link optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/links",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body Link})))

(defn locations-buckets-links-delete
  "Deletes a link. This will also delete the corresponding BigQuery linked dataset.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/locations/buckets/links/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn logs-delete
  "Deletes all the log entries in a log for the _Default Log Bucket. The log reappears if it receives new entries. Log entries written shortly before the delete operation might not be deleted. Entries received after the delete operation with a timestamp before the operation will be deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/logs/delete

logName <> "
  [logName]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+logName}",
     :uri-template-args {"logName" logName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn logs-list
  "Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/logs/list

parent <> 

optional:
resourceNames <string> Optional. List of resource names to list logs for: projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]To support legacy queries, it could also be: projects/[PROJECT_ID] organizations/[ORGANIZATION_ID] billingAccounts/[BILLING_ACCOUNT_ID] folders/[FOLDER_ID]The resource name in the parent field is added to this list.
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (logs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/logs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn exclusions-list
  "Lists all the exclusions on the _Default sink in a parent resource.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/exclusions/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (exclusions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/exclusions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn exclusions-get
  "Gets the description of an exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/exclusions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn exclusions-create
  "Creates a new exclusion in the _Default sink in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions in a resource.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/exclusions/create

parent <> 
LogExclusion:
LogExclusion"
  [parent LogExclusion]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+parent}/exclusions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body LogExclusion}))

(defn exclusions-patch
  "Changes one or more properties of an existing exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/exclusions/patch

name <> 
LogExclusion:
LogExclusion

optional:
updateMask <string> Required. A non-empty list of fields to change in the existing exclusion. New values for the fields are taken from the corresponding fields in the LogExclusion included in this request. Fields not mentioned in update_mask are not changed and are ignored in the request.For example, to change the filter and description of an exclusion, specify an update_mask of \"filter,description\"."
  ([name LogExclusion] (exclusions-patch name LogExclusion nil))
  ([name LogExclusion optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogExclusion})))

(defn exclusions-delete
  "Deletes an exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/exclusions/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn folders-getCmekSettings
  "Gets the Logging CMEK settings for the given resource.Note: CMEK for the Log Router can be configured for Google Cloud projects, folders, organizations, and billing accounts. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.See Enabling CMEK for Log Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/getCmekSettings

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}/cmekSettings",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn folders-getSettings
  "Gets the settings for the given resource.Note: Settings can be retrieved for Google Cloud projects, folders, organizations, and billing accounts.See View default resource settings for Logging (https://cloud.google.com/logging/docs/default-settings#view-org-settings) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/getSettings

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}/settings",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn folders-updateSettings
  "Updates the settings for the given resource. This method applies to all feature configurations for organization and folders.UpdateSettings fails when any of the following are true: The value of storage_location either isn't supported by Logging or violates the location OrgPolicy. The default_sink_config field is set, but it has an unspecified filter write mode. The value of kms_key_name is invalid. The associated service account doesn't have the required roles/cloudkms.cryptoKeyEncrypterDecrypter role assigned for the key. Access to the key is disabled.See Configure default settings for organizations and folders (https://cloud.google.com/logging/docs/default-settings) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/updateSettings

name <> 
Settings:
Settings

optional:
updateMask <string> Optional. Field mask identifying which fields from settings should be updated. A field will be overwritten if and only if it is in the update mask. Output only fields cannot be updated.See FieldMask for more information.For example: \"updateMask=kmsKeyName\""
  ([name Settings] (folders-updateSettings name Settings nil))
  ([name Settings optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/settings",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body Settings})))

(defn folders-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like \"displayName=tokyo\", and is documented in more detail in AIP-160 (https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (folders-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn folders-locations-get
  "Gets information about a location.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn folders-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns UNIMPLEMENTED.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (folders-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn folders-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn folders-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns google.rpc.Code.UNIMPLEMENTED. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to Code.CANCELLED.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://logging.googleapis.com/v2/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body CancelOperationRequest}))

(defn folders-locations-buckets-list
  "Lists log buckets.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (folders-locations-buckets-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn folders-locations-buckets-get
  "Gets a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn folders-locations-buckets-createAsync
  "Creates a log bucket asynchronously that can be used to store log entries.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/createAsync

parent <> 
LogBucket:
LogBucket

optional:
bucketId <string> Required. A client-assigned identifier such as \"my-bucket\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. Bucket identifiers must start with an alphanumeric character."
  ([parent LogBucket]
    (folders-locations-buckets-createAsync parent LogBucket nil))
  ([parent LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets:createAsync",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn folders-locations-buckets-updateAsync
  "Updates a log bucket asynchronously.If the bucket has a lifecycle_state of DELETE_REQUESTED, then FAILED_PRECONDITION will be returned.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/updateAsync

name <> 
LogBucket:
LogBucket

optional:
updateMask <string> Required. Field mask that specifies the fields in bucket that need an update. A bucket field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see: https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=retention_days"
  ([name LogBucket]
    (folders-locations-buckets-updateAsync name LogBucket nil))
  ([name LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}:updateAsync",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn folders-locations-buckets-create
  "Creates a log bucket that can be used to store log entries. After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/create

parent <> 
LogBucket:
LogBucket

optional:
bucketId <string> Required. A client-assigned identifier such as \"my-bucket\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. Bucket identifiers must start with an alphanumeric character."
  ([parent LogBucket]
    (folders-locations-buckets-create parent LogBucket nil))
  ([parent LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn folders-locations-buckets-patch
  "Updates a log bucket.If the bucket has a lifecycle_state of DELETE_REQUESTED, then FAILED_PRECONDITION will be returned.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/patch

name <> 
LogBucket:
LogBucket

optional:
updateMask <string> Required. Field mask that specifies the fields in bucket that need an update. A bucket field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see: https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=retention_days"
  ([name LogBucket]
    (folders-locations-buckets-patch name LogBucket nil))
  ([name LogBucket optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn folders-locations-buckets-delete
  "Deletes a log bucket.Changes the bucket's lifecycle_state to the DELETE_REQUESTED state. After 7 days, the bucket will be purged and all log entries in the bucket will be permanently deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn folders-locations-buckets-undelete
  "Undeletes a log bucket. A bucket that has been deleted can be undeleted within the grace period of 7 days.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/undelete

name <> 
UndeleteBucketRequest:
UndeleteBucketRequest"
  [name UndeleteBucketRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}:undelete",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body UndeleteBucketRequest}))

(defn folders-locations-buckets-views-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/views/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body SetIamPolicyRequest}))

(defn folders-locations-buckets-views-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/views/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"],
     :body GetIamPolicyRequest}))

(defn folders-locations-buckets-views-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/views/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"],
     :body TestIamPermissionsRequest}))

(defn folders-locations-buckets-views-list
  "Lists views on a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/views/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request.Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (folders-locations-buckets-views-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/views",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn folders-locations-buckets-views-get
  "Gets a view on a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/views/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn folders-locations-buckets-views-create
  "Creates a view over log entries in a log bucket. A bucket may contain a maximum of 30 views.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/views/create

parent <> 
LogView:
LogView

optional:
viewId <string> Required. A client-assigned identifier such as \"my-view\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods."
  ([parent LogView]
    (folders-locations-buckets-views-create parent LogView nil))
  ([parent LogView optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/views",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogView})))

(defn folders-locations-buckets-views-patch
  "Updates a view on a log bucket. This method replaces the value of the filter field from the existing view with the corresponding value from the new view. If an UNAVAILABLE error is returned, this indicates that system is not in a state where it can update the view. If this occurs, please try again in a few minutes.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/views/patch

name <> 
LogView:
LogView

optional:
updateMask <string> Optional. Field mask that specifies the fields in view that need an update. A field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([name LogView]
    (folders-locations-buckets-views-patch name LogView nil))
  ([name LogView optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogView})))

(defn folders-locations-buckets-views-delete
  "Deletes a view on a log bucket. If an UNAVAILABLE error is returned, this indicates that system is not in a state where it can delete the view. If this occurs, please try again in a few minutes.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/views/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn folders-locations-buckets-views-logs-list
  "Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/views/logs/list

parent <> 

optional:
resourceNames <string> Optional. List of resource names to list logs for: projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]To support legacy queries, it could also be: projects/[PROJECT_ID] organizations/[ORGANIZATION_ID] billingAccounts/[BILLING_ACCOUNT_ID] folders/[FOLDER_ID]The resource name in the parent field is added to this list.
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (folders-locations-buckets-views-logs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/logs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn folders-locations-buckets-links-list
  "Lists links.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/links/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request."
  ([parent] (folders-locations-buckets-links-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/links",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn folders-locations-buckets-links-get
  "Gets a link.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/links/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn folders-locations-buckets-links-create
  "Asynchronously creates a linked dataset in BigQuery which makes it possible to use BigQuery to read the logs stored in the log bucket. A log bucket may currently only contain one link.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/links/create

parent <> 
Link:
Link

optional:
linkId <string> Required. The ID to use for the link. The link_id can have up to 100 characters. A valid link_id must only have alphanumeric characters and underscores within it."
  ([parent Link]
    (folders-locations-buckets-links-create parent Link nil))
  ([parent Link optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/links",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body Link})))

(defn folders-locations-buckets-links-delete
  "Deletes a link. This will also delete the corresponding BigQuery linked dataset.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/buckets/links/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn folders-locations-savedQueries-list
  "Lists the SavedQueries that were created by the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/savedQueries/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request.Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
filter <string> Optional. Specifies the type (\"Logging\" or \"OpsAnalytics\") and the visibility (PRIVATE or SHARED) of the saved queries to list. If provided, the filter must contain either the type function or a visibility token, or both. If both are chosen, they can be placed in any order, but they must be joined by the AND operator or the empty character.The two supported type function calls are: type(\"Logging\") type(\"OpsAnalytics\")The two supported visibility tokens are: visibility = PRIVATE visibility = SHAREDFor example:type(\"Logging\") AND visibility = PRIVATE visibility=SHARED type(\"OpsAnalytics\") type(\"OpsAnalytics)\" visibility = PRIVATE visibility = SHARED"
  ([parent] (folders-locations-savedQueries-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/savedQueries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn folders-locations-savedQueries-get
  "Returns all data associated with the requested query.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/savedQueries/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn folders-locations-savedQueries-create
  "Creates a new SavedQuery for the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/savedQueries/create

parent <> 
SavedQuery:
SavedQuery

optional:
savedQueryId <string> Optional. The ID to use for the saved query, which will become the final component of the saved query's resource name.If the saved_query_id is not provided, the system will generate an alphanumeric ID.The saved_query_id is limited to 100 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, periods.First character has to be alphanumeric."
  ([parent SavedQuery]
    (folders-locations-savedQueries-create parent SavedQuery nil))
  ([parent SavedQuery optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/savedQueries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body SavedQuery})))

(defn folders-locations-savedQueries-patch
  "Updates an existing SavedQuery.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/savedQueries/patch

name <> 
SavedQuery:
SavedQuery

optional:
updateMask <string> Required. A non-empty list of fields to change in the existing saved query. Fields are relative to the saved_query and new values for the fields are taken from the corresponding fields in the SavedQuery included in this request. Fields not mentioned in update_mask are not changed and are ignored in the request.To update all mutable fields, specify an update_mask of *.For example, to change the description and query filter text of a saved query, specify an update_mask of \"description, query.filter\"."
  ([name SavedQuery]
    (folders-locations-savedQueries-patch name SavedQuery nil))
  ([name SavedQuery optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body SavedQuery})))

(defn folders-locations-savedQueries-delete
  "Deletes an existing SavedQuery that was created by the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/savedQueries/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn folders-locations-recentQueries-list
  "Lists the RecentQueries that were created by the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/locations/recentQueries/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
filter <string> Optional. Specifies the type (\"Logging\" or \"OpsAnalytics\") of the recent queries to list. The only valid value for this field is one of the two allowable type function calls, which are the following: type(\"Logging\") type(\"OpsAnalytics\")"
  ([parent] (folders-locations-recentQueries-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/recentQueries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn folders-exclusions-list
  "Lists all the exclusions on the _Default sink in a parent resource.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/exclusions/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (folders-exclusions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/exclusions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn folders-exclusions-get
  "Gets the description of an exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/exclusions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn folders-exclusions-create
  "Creates a new exclusion in the _Default sink in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions in a resource.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/exclusions/create

parent <> 
LogExclusion:
LogExclusion"
  [parent LogExclusion]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+parent}/exclusions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body LogExclusion}))

(defn folders-exclusions-patch
  "Changes one or more properties of an existing exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/exclusions/patch

name <> 
LogExclusion:
LogExclusion

optional:
updateMask <string> Required. A non-empty list of fields to change in the existing exclusion. New values for the fields are taken from the corresponding fields in the LogExclusion included in this request. Fields not mentioned in update_mask are not changed and are ignored in the request.For example, to change the filter and description of an exclusion, specify an update_mask of \"filter,description\"."
  ([name LogExclusion]
    (folders-exclusions-patch name LogExclusion nil))
  ([name LogExclusion optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogExclusion})))

(defn folders-exclusions-delete
  "Deletes an exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/exclusions/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn folders-sinks-list
  "Lists sinks.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/sinks/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
filter <string> Optional. A filter expression to constrain the sinks returned. Today, this only supports the following strings: '' 'in_scope(\"ALL\")', 'in_scope(\"ANCESTOR\")', 'in_scope(\"DEFAULT\")'.Description of scopes below. ALL: Includes all of the sinks which can be returned in any other scope. ANCESTOR: Includes intercepting sinks owned by ancestor resources. DEFAULT: Includes sinks owned by parent.When the empty string is provided, then the filter 'in_scope(\"DEFAULT\")' is applied."
  ([parent] (folders-sinks-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/sinks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn folders-sinks-get
  "Gets a sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/sinks/get

sinkName <> "
  [sinkName]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
     :uri-template-args {"sinkName" sinkName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn folders-sinks-create
  "Creates a sink that exports specified log entries to a destination. The export begins upon ingress, unless the sink's writer_identity is not permitted to write to the destination. A sink can export log entries only from the resource owning the sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/sinks/create

parent <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. Determines the kind of IAM identity returned as writer_identity in the new sink. If this value is omitted or set to false, and if the sink's parent is a project, then the value returned as writer_identity is the same group or service account used by Cloud Logging before the addition of writer identities to this API. The sink's destination must be in the same project as the sink itself.If this field is set to true, or if the sink is owned by a non-project resource such as an organization, then the value of writer_identity will be a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) used by the sinks with the same parent. For more information, see writer_identity in LogSink.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated."
  ([parent LogSink] (folders-sinks-create parent LogSink nil))
  ([parent LogSink optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/sinks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn folders-sinks-update
  "Updates a sink. This method replaces the values of the destination and filter fields of the existing sink with the corresponding values from the new sink.The updated sink might also have a new writer_identity; see the unique_writer_identity field.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/sinks/update

sinkName <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the updated sink depends on both the old and new values of this field: If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity. If the old value is false and the new value is true, then writer_identity is changed to a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) owned by Cloud Logging. It is an error if the old value is true and the new value is set to false or defaulted to false.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated.
updateMask <string> Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility purposes:destination,filter,includeChildrenAt some point in the future, behavior will be removed and specifying an empty updateMask will be an error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([sinkName LogSink] (folders-sinks-update sinkName LogSink nil))
  ([sinkName LogSink optional]
    (client/*api-request*
      {:method :put,
       :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
       :uri-template-args {"sinkName" sinkName},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn folders-sinks-patch
  "Updates a sink. This method replaces the values of the destination and filter fields of the existing sink with the corresponding values from the new sink.The updated sink might also have a new writer_identity; see the unique_writer_identity field.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/sinks/patch

sinkName <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the updated sink depends on both the old and new values of this field: If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity. If the old value is false and the new value is true, then writer_identity is changed to a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) owned by Cloud Logging. It is an error if the old value is true and the new value is set to false or defaulted to false.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated.
updateMask <string> Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility purposes:destination,filter,includeChildrenAt some point in the future, behavior will be removed and specifying an empty updateMask will be an error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([sinkName LogSink] (folders-sinks-patch sinkName LogSink nil))
  ([sinkName LogSink optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
       :uri-template-args {"sinkName" sinkName},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn folders-sinks-delete
  "Deletes a sink. If the sink has a unique writer_identity, then that service account is also deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/sinks/delete

sinkName <> "
  [sinkName]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
     :uri-template-args {"sinkName" sinkName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn folders-logs-delete
  "Deletes all the log entries in a log for the _Default Log Bucket. The log reappears if it receives new entries. Log entries written shortly before the delete operation might not be deleted. Entries received after the delete operation with a timestamp before the operation will be deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/logs/delete

logName <> "
  [logName]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+logName}",
     :uri-template-args {"logName" logName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn folders-logs-list
  "Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/folders/logs/list

parent <> 

optional:
resourceNames <string> Optional. List of resource names to list logs for: projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]To support legacy queries, it could also be: projects/[PROJECT_ID] organizations/[ORGANIZATION_ID] billingAccounts/[BILLING_ACCOUNT_ID] folders/[FOLDER_ID]The resource name in the parent field is added to this list.
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (folders-logs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/logs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn entries-copy
  "Copies a set of log entries from a log bucket to a Cloud Storage bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/entries/copy

CopyLogEntriesRequest:
CopyLogEntriesRequest"
  [CopyLogEntriesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://logging.googleapis.com/v2/entries:copy",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body CopyLogEntriesRequest}))

(defn entries-write
  "Writes log entries to Logging. This API method is the only way to send log entries to Logging. This method is used, directly or indirectly, by the Logging agent (fluentd) and all logging libraries configured to use Logging. A single request may contain log entries for a maximum of 1000 different resource names (projects, organizations, billing accounts or folders), where the resource name for a log entry is determined from its logName field.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/entries/write

WriteLogEntriesRequest:
WriteLogEntriesRequest"
  [WriteLogEntriesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://logging.googleapis.com/v2/entries:write",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.write"],
     :body WriteLogEntriesRequest}))

(defn entries-list
  "Lists log entries. Use this method to retrieve log entries that originated from a project/folder/organization/billing account. For ways to export log entries, see Exporting Logs (https://cloud.google.com/logging/docs/export).
https://cloud.google.com/logging/docs/v2/reference/rest/v2/entries/list

ListLogEntriesRequest:
ListLogEntriesRequest"
  [ListLogEntriesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://logging.googleapis.com/v2/entries:list",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"],
     :body ListLogEntriesRequest}))

(defn entries-tail
  "Streaming read of log entries as they are received. Until the stream is terminated, it will continue reading logs.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/entries/tail

TailLogEntriesRequest:
TailLogEntriesRequest"
  [TailLogEntriesRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://logging.googleapis.com/v2/entries:tail",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"],
     :body TailLogEntriesRequest}))

(defn organizations-getCmekSettings
  "Gets the Logging CMEK settings for the given resource.Note: CMEK for the Log Router can be configured for Google Cloud projects, folders, organizations, and billing accounts. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.See Enabling CMEK for Log Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/getCmekSettings

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}/cmekSettings",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn organizations-updateCmekSettings
  "Updates the Log Router CMEK settings for the given resource.Note: CMEK for the Log Router can currently only be configured for Google Cloud organizations. Once configured, it applies to all projects and folders in the Google Cloud organization.UpdateCmekSettings fails when any of the following are true: The value of kms_key_name is invalid. The associated service account doesn't have the required roles/cloudkms.cryptoKeyEncrypterDecrypter role assigned for the key. Access to the key is disabled.See Enabling CMEK for Log Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/updateCmekSettings

name <> 
CmekSettings:
CmekSettings

optional:
updateMask <string> Optional. Field mask identifying which fields from cmek_settings should be updated. A field will be overwritten if and only if it is in the update mask. Output only fields cannot be updated.See FieldMask for more information.For example: \"updateMask=kmsKeyName\""
  ([name CmekSettings]
    (organizations-updateCmekSettings name CmekSettings nil))
  ([name CmekSettings optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/cmekSettings",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body CmekSettings})))

(defn organizations-getSettings
  "Gets the settings for the given resource.Note: Settings can be retrieved for Google Cloud projects, folders, organizations, and billing accounts.See View default resource settings for Logging (https://cloud.google.com/logging/docs/default-settings#view-org-settings) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/getSettings

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}/settings",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn organizations-updateSettings
  "Updates the settings for the given resource. This method applies to all feature configurations for organization and folders.UpdateSettings fails when any of the following are true: The value of storage_location either isn't supported by Logging or violates the location OrgPolicy. The default_sink_config field is set, but it has an unspecified filter write mode. The value of kms_key_name is invalid. The associated service account doesn't have the required roles/cloudkms.cryptoKeyEncrypterDecrypter role assigned for the key. Access to the key is disabled.See Configure default settings for organizations and folders (https://cloud.google.com/logging/docs/default-settings) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/updateSettings

name <> 
Settings:
Settings

optional:
updateMask <string> Optional. Field mask identifying which fields from settings should be updated. A field will be overwritten if and only if it is in the update mask. Output only fields cannot be updated.See FieldMask for more information.For example: \"updateMask=kmsKeyName\""
  ([name Settings] (organizations-updateSettings name Settings nil))
  ([name Settings optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/settings",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body Settings})))

(defn organizations-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like \"displayName=tokyo\", and is documented in more detail in AIP-160 (https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (organizations-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn organizations-locations-get
  "Gets information about a location.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn organizations-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns UNIMPLEMENTED.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (organizations-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn organizations-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn organizations-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns google.rpc.Code.UNIMPLEMENTED. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to Code.CANCELLED.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://logging.googleapis.com/v2/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body CancelOperationRequest}))

(defn organizations-locations-buckets-list
  "Lists log buckets.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (organizations-locations-buckets-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn organizations-locations-buckets-get
  "Gets a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn organizations-locations-buckets-createAsync
  "Creates a log bucket asynchronously that can be used to store log entries.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/createAsync

parent <> 
LogBucket:
LogBucket

optional:
bucketId <string> Required. A client-assigned identifier such as \"my-bucket\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. Bucket identifiers must start with an alphanumeric character."
  ([parent LogBucket]
    (organizations-locations-buckets-createAsync parent LogBucket nil))
  ([parent LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets:createAsync",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn organizations-locations-buckets-updateAsync
  "Updates a log bucket asynchronously.If the bucket has a lifecycle_state of DELETE_REQUESTED, then FAILED_PRECONDITION will be returned.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/updateAsync

name <> 
LogBucket:
LogBucket

optional:
updateMask <string> Required. Field mask that specifies the fields in bucket that need an update. A bucket field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see: https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=retention_days"
  ([name LogBucket]
    (organizations-locations-buckets-updateAsync name LogBucket nil))
  ([name LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}:updateAsync",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn organizations-locations-buckets-create
  "Creates a log bucket that can be used to store log entries. After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/create

parent <> 
LogBucket:
LogBucket

optional:
bucketId <string> Required. A client-assigned identifier such as \"my-bucket\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. Bucket identifiers must start with an alphanumeric character."
  ([parent LogBucket]
    (organizations-locations-buckets-create parent LogBucket nil))
  ([parent LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn organizations-locations-buckets-patch
  "Updates a log bucket.If the bucket has a lifecycle_state of DELETE_REQUESTED, then FAILED_PRECONDITION will be returned.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/patch

name <> 
LogBucket:
LogBucket

optional:
updateMask <string> Required. Field mask that specifies the fields in bucket that need an update. A bucket field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see: https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=retention_days"
  ([name LogBucket]
    (organizations-locations-buckets-patch name LogBucket nil))
  ([name LogBucket optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn organizations-locations-buckets-delete
  "Deletes a log bucket.Changes the bucket's lifecycle_state to the DELETE_REQUESTED state. After 7 days, the bucket will be purged and all log entries in the bucket will be permanently deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn organizations-locations-buckets-undelete
  "Undeletes a log bucket. A bucket that has been deleted can be undeleted within the grace period of 7 days.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/undelete

name <> 
UndeleteBucketRequest:
UndeleteBucketRequest"
  [name UndeleteBucketRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}:undelete",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body UndeleteBucketRequest}))

(defn organizations-locations-buckets-views-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/views/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body SetIamPolicyRequest}))

(defn organizations-locations-buckets-views-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/views/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"],
     :body GetIamPolicyRequest}))

(defn organizations-locations-buckets-views-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/views/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"],
     :body TestIamPermissionsRequest}))

(defn organizations-locations-buckets-views-list
  "Lists views on a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/views/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request.Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (organizations-locations-buckets-views-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/views",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn organizations-locations-buckets-views-get
  "Gets a view on a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/views/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn organizations-locations-buckets-views-create
  "Creates a view over log entries in a log bucket. A bucket may contain a maximum of 30 views.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/views/create

parent <> 
LogView:
LogView

optional:
viewId <string> Required. A client-assigned identifier such as \"my-view\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods."
  ([parent LogView]
    (organizations-locations-buckets-views-create parent LogView nil))
  ([parent LogView optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/views",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogView})))

(defn organizations-locations-buckets-views-patch
  "Updates a view on a log bucket. This method replaces the value of the filter field from the existing view with the corresponding value from the new view. If an UNAVAILABLE error is returned, this indicates that system is not in a state where it can update the view. If this occurs, please try again in a few minutes.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/views/patch

name <> 
LogView:
LogView

optional:
updateMask <string> Optional. Field mask that specifies the fields in view that need an update. A field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([name LogView]
    (organizations-locations-buckets-views-patch name LogView nil))
  ([name LogView optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogView})))

(defn organizations-locations-buckets-views-delete
  "Deletes a view on a log bucket. If an UNAVAILABLE error is returned, this indicates that system is not in a state where it can delete the view. If this occurs, please try again in a few minutes.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/views/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn organizations-locations-buckets-views-logs-list
  "Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/views/logs/list

parent <> 

optional:
resourceNames <string> Optional. List of resource names to list logs for: projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]To support legacy queries, it could also be: projects/[PROJECT_ID] organizations/[ORGANIZATION_ID] billingAccounts/[BILLING_ACCOUNT_ID] folders/[FOLDER_ID]The resource name in the parent field is added to this list.
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent]
    (organizations-locations-buckets-views-logs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/logs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn organizations-locations-buckets-links-list
  "Lists links.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/links/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request."
  ([parent] (organizations-locations-buckets-links-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/links",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn organizations-locations-buckets-links-get
  "Gets a link.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/links/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn organizations-locations-buckets-links-create
  "Asynchronously creates a linked dataset in BigQuery which makes it possible to use BigQuery to read the logs stored in the log bucket. A log bucket may currently only contain one link.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/links/create

parent <> 
Link:
Link

optional:
linkId <string> Required. The ID to use for the link. The link_id can have up to 100 characters. A valid link_id must only have alphanumeric characters and underscores within it."
  ([parent Link]
    (organizations-locations-buckets-links-create parent Link nil))
  ([parent Link optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/links",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body Link})))

(defn organizations-locations-buckets-links-delete
  "Deletes a link. This will also delete the corresponding BigQuery linked dataset.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/buckets/links/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn organizations-locations-savedQueries-list
  "Lists the SavedQueries that were created by the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/savedQueries/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request.Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
filter <string> Optional. Specifies the type (\"Logging\" or \"OpsAnalytics\") and the visibility (PRIVATE or SHARED) of the saved queries to list. If provided, the filter must contain either the type function or a visibility token, or both. If both are chosen, they can be placed in any order, but they must be joined by the AND operator or the empty character.The two supported type function calls are: type(\"Logging\") type(\"OpsAnalytics\")The two supported visibility tokens are: visibility = PRIVATE visibility = SHAREDFor example:type(\"Logging\") AND visibility = PRIVATE visibility=SHARED type(\"OpsAnalytics\") type(\"OpsAnalytics)\" visibility = PRIVATE visibility = SHARED"
  ([parent] (organizations-locations-savedQueries-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/savedQueries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn organizations-locations-savedQueries-get
  "Returns all data associated with the requested query.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/savedQueries/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn organizations-locations-savedQueries-create
  "Creates a new SavedQuery for the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/savedQueries/create

parent <> 
SavedQuery:
SavedQuery

optional:
savedQueryId <string> Optional. The ID to use for the saved query, which will become the final component of the saved query's resource name.If the saved_query_id is not provided, the system will generate an alphanumeric ID.The saved_query_id is limited to 100 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, periods.First character has to be alphanumeric."
  ([parent SavedQuery]
    (organizations-locations-savedQueries-create
      parent
      SavedQuery
      nil))
  ([parent SavedQuery optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/savedQueries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body SavedQuery})))

(defn organizations-locations-savedQueries-patch
  "Updates an existing SavedQuery.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/savedQueries/patch

name <> 
SavedQuery:
SavedQuery

optional:
updateMask <string> Required. A non-empty list of fields to change in the existing saved query. Fields are relative to the saved_query and new values for the fields are taken from the corresponding fields in the SavedQuery included in this request. Fields not mentioned in update_mask are not changed and are ignored in the request.To update all mutable fields, specify an update_mask of *.For example, to change the description and query filter text of a saved query, specify an update_mask of \"description, query.filter\"."
  ([name SavedQuery]
    (organizations-locations-savedQueries-patch name SavedQuery nil))
  ([name SavedQuery optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body SavedQuery})))

(defn organizations-locations-savedQueries-delete
  "Deletes an existing SavedQuery that was created by the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/savedQueries/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn organizations-locations-recentQueries-list
  "Lists the RecentQueries that were created by the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/locations/recentQueries/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
filter <string> Optional. Specifies the type (\"Logging\" or \"OpsAnalytics\") of the recent queries to list. The only valid value for this field is one of the two allowable type function calls, which are the following: type(\"Logging\") type(\"OpsAnalytics\")"
  ([parent] (organizations-locations-recentQueries-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/recentQueries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn organizations-exclusions-list
  "Lists all the exclusions on the _Default sink in a parent resource.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/exclusions/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (organizations-exclusions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/exclusions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn organizations-exclusions-get
  "Gets the description of an exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/exclusions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn organizations-exclusions-create
  "Creates a new exclusion in the _Default sink in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions in a resource.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/exclusions/create

parent <> 
LogExclusion:
LogExclusion"
  [parent LogExclusion]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+parent}/exclusions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body LogExclusion}))

(defn organizations-exclusions-patch
  "Changes one or more properties of an existing exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/exclusions/patch

name <> 
LogExclusion:
LogExclusion

optional:
updateMask <string> Required. A non-empty list of fields to change in the existing exclusion. New values for the fields are taken from the corresponding fields in the LogExclusion included in this request. Fields not mentioned in update_mask are not changed and are ignored in the request.For example, to change the filter and description of an exclusion, specify an update_mask of \"filter,description\"."
  ([name LogExclusion]
    (organizations-exclusions-patch name LogExclusion nil))
  ([name LogExclusion optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogExclusion})))

(defn organizations-exclusions-delete
  "Deletes an exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/exclusions/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn organizations-sinks-list
  "Lists sinks.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/sinks/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
filter <string> Optional. A filter expression to constrain the sinks returned. Today, this only supports the following strings: '' 'in_scope(\"ALL\")', 'in_scope(\"ANCESTOR\")', 'in_scope(\"DEFAULT\")'.Description of scopes below. ALL: Includes all of the sinks which can be returned in any other scope. ANCESTOR: Includes intercepting sinks owned by ancestor resources. DEFAULT: Includes sinks owned by parent.When the empty string is provided, then the filter 'in_scope(\"DEFAULT\")' is applied."
  ([parent] (organizations-sinks-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/sinks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn organizations-sinks-get
  "Gets a sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/sinks/get

sinkName <> "
  [sinkName]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
     :uri-template-args {"sinkName" sinkName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn organizations-sinks-create
  "Creates a sink that exports specified log entries to a destination. The export begins upon ingress, unless the sink's writer_identity is not permitted to write to the destination. A sink can export log entries only from the resource owning the sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/sinks/create

parent <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. Determines the kind of IAM identity returned as writer_identity in the new sink. If this value is omitted or set to false, and if the sink's parent is a project, then the value returned as writer_identity is the same group or service account used by Cloud Logging before the addition of writer identities to this API. The sink's destination must be in the same project as the sink itself.If this field is set to true, or if the sink is owned by a non-project resource such as an organization, then the value of writer_identity will be a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) used by the sinks with the same parent. For more information, see writer_identity in LogSink.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated."
  ([parent LogSink] (organizations-sinks-create parent LogSink nil))
  ([parent LogSink optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/sinks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn organizations-sinks-update
  "Updates a sink. This method replaces the values of the destination and filter fields of the existing sink with the corresponding values from the new sink.The updated sink might also have a new writer_identity; see the unique_writer_identity field.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/sinks/update

sinkName <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the updated sink depends on both the old and new values of this field: If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity. If the old value is false and the new value is true, then writer_identity is changed to a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) owned by Cloud Logging. It is an error if the old value is true and the new value is set to false or defaulted to false.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated.
updateMask <string> Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility purposes:destination,filter,includeChildrenAt some point in the future, behavior will be removed and specifying an empty updateMask will be an error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([sinkName LogSink]
    (organizations-sinks-update sinkName LogSink nil))
  ([sinkName LogSink optional]
    (client/*api-request*
      {:method :put,
       :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
       :uri-template-args {"sinkName" sinkName},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn organizations-sinks-patch
  "Updates a sink. This method replaces the values of the destination and filter fields of the existing sink with the corresponding values from the new sink.The updated sink might also have a new writer_identity; see the unique_writer_identity field.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/sinks/patch

sinkName <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the updated sink depends on both the old and new values of this field: If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity. If the old value is false and the new value is true, then writer_identity is changed to a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) owned by Cloud Logging. It is an error if the old value is true and the new value is set to false or defaulted to false.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated.
updateMask <string> Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility purposes:destination,filter,includeChildrenAt some point in the future, behavior will be removed and specifying an empty updateMask will be an error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([sinkName LogSink] (organizations-sinks-patch sinkName LogSink nil))
  ([sinkName LogSink optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
       :uri-template-args {"sinkName" sinkName},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn organizations-sinks-delete
  "Deletes a sink. If the sink has a unique writer_identity, then that service account is also deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/sinks/delete

sinkName <> "
  [sinkName]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
     :uri-template-args {"sinkName" sinkName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn organizations-logs-delete
  "Deletes all the log entries in a log for the _Default Log Bucket. The log reappears if it receives new entries. Log entries written shortly before the delete operation might not be deleted. Entries received after the delete operation with a timestamp before the operation will be deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/logs/delete

logName <> "
  [logName]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+logName}",
     :uri-template-args {"logName" logName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn organizations-logs-list
  "Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/organizations/logs/list

parent <> 

optional:
resourceNames <string> Optional. List of resource names to list logs for: projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]To support legacy queries, it could also be: projects/[PROJECT_ID] organizations/[ORGANIZATION_ID] billingAccounts/[BILLING_ACCOUNT_ID] folders/[FOLDER_ID]The resource name in the parent field is added to this list.
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (organizations-logs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/logs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn projects-getCmekSettings
  "Gets the Logging CMEK settings for the given resource.Note: CMEK for the Log Router can be configured for Google Cloud projects, folders, organizations, and billing accounts. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.See Enabling CMEK for Log Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/getCmekSettings

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}/cmekSettings",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn projects-getSettings
  "Gets the settings for the given resource.Note: Settings can be retrieved for Google Cloud projects, folders, organizations, and billing accounts.See View default resource settings for Logging (https://cloud.google.com/logging/docs/default-settings#view-org-settings) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/getSettings

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}/settings",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like \"displayName=tokyo\", and is documented in more detail in AIP-160 (https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns UNIMPLEMENTED.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns google.rpc.Code.UNIMPLEMENTED. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to Code.CANCELLED.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://logging.googleapis.com/v2/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body CancelOperationRequest}))

(defn projects-locations-buckets-list
  "Lists log buckets.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (projects-locations-buckets-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn projects-locations-buckets-get
  "Gets a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn projects-locations-buckets-createAsync
  "Creates a log bucket asynchronously that can be used to store log entries.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/createAsync

parent <> 
LogBucket:
LogBucket

optional:
bucketId <string> Required. A client-assigned identifier such as \"my-bucket\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. Bucket identifiers must start with an alphanumeric character."
  ([parent LogBucket]
    (projects-locations-buckets-createAsync parent LogBucket nil))
  ([parent LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets:createAsync",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn projects-locations-buckets-updateAsync
  "Updates a log bucket asynchronously.If the bucket has a lifecycle_state of DELETE_REQUESTED, then FAILED_PRECONDITION will be returned.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/updateAsync

name <> 
LogBucket:
LogBucket

optional:
updateMask <string> Required. Field mask that specifies the fields in bucket that need an update. A bucket field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see: https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=retention_days"
  ([name LogBucket]
    (projects-locations-buckets-updateAsync name LogBucket nil))
  ([name LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}:updateAsync",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn projects-locations-buckets-create
  "Creates a log bucket that can be used to store log entries. After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/create

parent <> 
LogBucket:
LogBucket

optional:
bucketId <string> Required. A client-assigned identifier such as \"my-bucket\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. Bucket identifiers must start with an alphanumeric character."
  ([parent LogBucket]
    (projects-locations-buckets-create parent LogBucket nil))
  ([parent LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn projects-locations-buckets-patch
  "Updates a log bucket.If the bucket has a lifecycle_state of DELETE_REQUESTED, then FAILED_PRECONDITION will be returned.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/patch

name <> 
LogBucket:
LogBucket

optional:
updateMask <string> Required. Field mask that specifies the fields in bucket that need an update. A bucket field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see: https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=retention_days"
  ([name LogBucket]
    (projects-locations-buckets-patch name LogBucket nil))
  ([name LogBucket optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn projects-locations-buckets-delete
  "Deletes a log bucket.Changes the bucket's lifecycle_state to the DELETE_REQUESTED state. After 7 days, the bucket will be purged and all log entries in the bucket will be permanently deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn projects-locations-buckets-undelete
  "Undeletes a log bucket. A bucket that has been deleted can be undeleted within the grace period of 7 days.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/undelete

name <> 
UndeleteBucketRequest:
UndeleteBucketRequest"
  [name UndeleteBucketRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}:undelete",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body UndeleteBucketRequest}))

(defn projects-locations-buckets-views-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/views/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body SetIamPolicyRequest}))

(defn projects-locations-buckets-views-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/views/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"],
     :body GetIamPolicyRequest}))

(defn projects-locations-buckets-views-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/views/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-buckets-views-list
  "Lists views on a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/views/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request.Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (projects-locations-buckets-views-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/views",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn projects-locations-buckets-views-get
  "Gets a view on a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/views/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn projects-locations-buckets-views-create
  "Creates a view over log entries in a log bucket. A bucket may contain a maximum of 30 views.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/views/create

parent <> 
LogView:
LogView

optional:
viewId <string> Required. A client-assigned identifier such as \"my-view\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods."
  ([parent LogView]
    (projects-locations-buckets-views-create parent LogView nil))
  ([parent LogView optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/views",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogView})))

(defn projects-locations-buckets-views-patch
  "Updates a view on a log bucket. This method replaces the value of the filter field from the existing view with the corresponding value from the new view. If an UNAVAILABLE error is returned, this indicates that system is not in a state where it can update the view. If this occurs, please try again in a few minutes.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/views/patch

name <> 
LogView:
LogView

optional:
updateMask <string> Optional. Field mask that specifies the fields in view that need an update. A field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([name LogView]
    (projects-locations-buckets-views-patch name LogView nil))
  ([name LogView optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogView})))

(defn projects-locations-buckets-views-delete
  "Deletes a view on a log bucket. If an UNAVAILABLE error is returned, this indicates that system is not in a state where it can delete the view. If this occurs, please try again in a few minutes.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/views/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn projects-locations-buckets-views-logs-list
  "Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/views/logs/list

parent <> 

optional:
resourceNames <string> Optional. List of resource names to list logs for: projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]To support legacy queries, it could also be: projects/[PROJECT_ID] organizations/[ORGANIZATION_ID] billingAccounts/[BILLING_ACCOUNT_ID] folders/[FOLDER_ID]The resource name in the parent field is added to this list.
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (projects-locations-buckets-views-logs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/logs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn projects-locations-buckets-links-list
  "Lists links.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/links/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request."
  ([parent] (projects-locations-buckets-links-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/links",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn projects-locations-buckets-links-get
  "Gets a link.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/links/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn projects-locations-buckets-links-create
  "Asynchronously creates a linked dataset in BigQuery which makes it possible to use BigQuery to read the logs stored in the log bucket. A log bucket may currently only contain one link.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/links/create

parent <> 
Link:
Link

optional:
linkId <string> Required. The ID to use for the link. The link_id can have up to 100 characters. A valid link_id must only have alphanumeric characters and underscores within it."
  ([parent Link]
    (projects-locations-buckets-links-create parent Link nil))
  ([parent Link optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/links",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body Link})))

(defn projects-locations-buckets-links-delete
  "Deletes a link. This will also delete the corresponding BigQuery linked dataset.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/buckets/links/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn projects-locations-savedQueries-list
  "Lists the SavedQueries that were created by the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/savedQueries/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request.Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
filter <string> Optional. Specifies the type (\"Logging\" or \"OpsAnalytics\") and the visibility (PRIVATE or SHARED) of the saved queries to list. If provided, the filter must contain either the type function or a visibility token, or both. If both are chosen, they can be placed in any order, but they must be joined by the AND operator or the empty character.The two supported type function calls are: type(\"Logging\") type(\"OpsAnalytics\")The two supported visibility tokens are: visibility = PRIVATE visibility = SHAREDFor example:type(\"Logging\") AND visibility = PRIVATE visibility=SHARED type(\"OpsAnalytics\") type(\"OpsAnalytics)\" visibility = PRIVATE visibility = SHARED"
  ([parent] (projects-locations-savedQueries-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/savedQueries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn projects-locations-savedQueries-get
  "Returns all data associated with the requested query.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/savedQueries/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn projects-locations-savedQueries-create
  "Creates a new SavedQuery for the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/savedQueries/create

parent <> 
SavedQuery:
SavedQuery

optional:
savedQueryId <string> Optional. The ID to use for the saved query, which will become the final component of the saved query's resource name.If the saved_query_id is not provided, the system will generate an alphanumeric ID.The saved_query_id is limited to 100 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, periods.First character has to be alphanumeric."
  ([parent SavedQuery]
    (projects-locations-savedQueries-create parent SavedQuery nil))
  ([parent SavedQuery optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/savedQueries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body SavedQuery})))

(defn projects-locations-savedQueries-patch
  "Updates an existing SavedQuery.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/savedQueries/patch

name <> 
SavedQuery:
SavedQuery

optional:
updateMask <string> Required. A non-empty list of fields to change in the existing saved query. Fields are relative to the saved_query and new values for the fields are taken from the corresponding fields in the SavedQuery included in this request. Fields not mentioned in update_mask are not changed and are ignored in the request.To update all mutable fields, specify an update_mask of *.For example, to change the description and query filter text of a saved query, specify an update_mask of \"description, query.filter\"."
  ([name SavedQuery]
    (projects-locations-savedQueries-patch name SavedQuery nil))
  ([name SavedQuery optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body SavedQuery})))

(defn projects-locations-savedQueries-delete
  "Deletes an existing SavedQuery that was created by the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/savedQueries/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn projects-locations-recentQueries-list
  "Lists the RecentQueries that were created by the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/locations/recentQueries/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
filter <string> Optional. Specifies the type (\"Logging\" or \"OpsAnalytics\") of the recent queries to list. The only valid value for this field is one of the two allowable type function calls, which are the following: type(\"Logging\") type(\"OpsAnalytics\")"
  ([parent] (projects-locations-recentQueries-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/recentQueries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn projects-exclusions-list
  "Lists all the exclusions on the _Default sink in a parent resource.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/exclusions/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (projects-exclusions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/exclusions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn projects-exclusions-get
  "Gets the description of an exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/exclusions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn projects-exclusions-create
  "Creates a new exclusion in the _Default sink in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions in a resource.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/exclusions/create

parent <> 
LogExclusion:
LogExclusion"
  [parent LogExclusion]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+parent}/exclusions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body LogExclusion}))

(defn projects-exclusions-patch
  "Changes one or more properties of an existing exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/exclusions/patch

name <> 
LogExclusion:
LogExclusion

optional:
updateMask <string> Required. A non-empty list of fields to change in the existing exclusion. New values for the fields are taken from the corresponding fields in the LogExclusion included in this request. Fields not mentioned in update_mask are not changed and are ignored in the request.For example, to change the filter and description of an exclusion, specify an update_mask of \"filter,description\"."
  ([name LogExclusion]
    (projects-exclusions-patch name LogExclusion nil))
  ([name LogExclusion optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogExclusion})))

(defn projects-exclusions-delete
  "Deletes an exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/exclusions/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn projects-sinks-list
  "Lists sinks.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/sinks/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
filter <string> Optional. A filter expression to constrain the sinks returned. Today, this only supports the following strings: '' 'in_scope(\"ALL\")', 'in_scope(\"ANCESTOR\")', 'in_scope(\"DEFAULT\")'.Description of scopes below. ALL: Includes all of the sinks which can be returned in any other scope. ANCESTOR: Includes intercepting sinks owned by ancestor resources. DEFAULT: Includes sinks owned by parent.When the empty string is provided, then the filter 'in_scope(\"DEFAULT\")' is applied."
  ([parent] (projects-sinks-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/sinks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn projects-sinks-get
  "Gets a sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/sinks/get

sinkName <> "
  [sinkName]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
     :uri-template-args {"sinkName" sinkName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn projects-sinks-create
  "Creates a sink that exports specified log entries to a destination. The export begins upon ingress, unless the sink's writer_identity is not permitted to write to the destination. A sink can export log entries only from the resource owning the sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/sinks/create

parent <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. Determines the kind of IAM identity returned as writer_identity in the new sink. If this value is omitted or set to false, and if the sink's parent is a project, then the value returned as writer_identity is the same group or service account used by Cloud Logging before the addition of writer identities to this API. The sink's destination must be in the same project as the sink itself.If this field is set to true, or if the sink is owned by a non-project resource such as an organization, then the value of writer_identity will be a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) used by the sinks with the same parent. For more information, see writer_identity in LogSink.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated."
  ([parent LogSink] (projects-sinks-create parent LogSink nil))
  ([parent LogSink optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/sinks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn projects-sinks-update
  "Updates a sink. This method replaces the values of the destination and filter fields of the existing sink with the corresponding values from the new sink.The updated sink might also have a new writer_identity; see the unique_writer_identity field.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/sinks/update

sinkName <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the updated sink depends on both the old and new values of this field: If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity. If the old value is false and the new value is true, then writer_identity is changed to a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) owned by Cloud Logging. It is an error if the old value is true and the new value is set to false or defaulted to false.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated.
updateMask <string> Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility purposes:destination,filter,includeChildrenAt some point in the future, behavior will be removed and specifying an empty updateMask will be an error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([sinkName LogSink] (projects-sinks-update sinkName LogSink nil))
  ([sinkName LogSink optional]
    (client/*api-request*
      {:method :put,
       :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
       :uri-template-args {"sinkName" sinkName},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn projects-sinks-patch
  "Updates a sink. This method replaces the values of the destination and filter fields of the existing sink with the corresponding values from the new sink.The updated sink might also have a new writer_identity; see the unique_writer_identity field.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/sinks/patch

sinkName <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the updated sink depends on both the old and new values of this field: If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity. If the old value is false and the new value is true, then writer_identity is changed to a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) owned by Cloud Logging. It is an error if the old value is true and the new value is set to false or defaulted to false.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated.
updateMask <string> Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility purposes:destination,filter,includeChildrenAt some point in the future, behavior will be removed and specifying an empty updateMask will be an error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([sinkName LogSink] (projects-sinks-patch sinkName LogSink nil))
  ([sinkName LogSink optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
       :uri-template-args {"sinkName" sinkName},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn projects-sinks-delete
  "Deletes a sink. If the sink has a unique writer_identity, then that service account is also deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/sinks/delete

sinkName <> "
  [sinkName]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
     :uri-template-args {"sinkName" sinkName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn projects-logs-delete
  "Deletes all the log entries in a log for the _Default Log Bucket. The log reappears if it receives new entries. Log entries written shortly before the delete operation might not be deleted. Entries received after the delete operation with a timestamp before the operation will be deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/logs/delete

logName <> "
  [logName]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+logName}",
     :uri-template-args {"logName" logName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn projects-logs-list
  "Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/logs/list

parent <> 

optional:
resourceNames <string> Optional. List of resource names to list logs for: projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]To support legacy queries, it could also be: projects/[PROJECT_ID] organizations/[ORGANIZATION_ID] billingAccounts/[BILLING_ACCOUNT_ID] folders/[FOLDER_ID]The resource name in the parent field is added to this list.
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (projects-logs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/logs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn projects-metrics-list
  "Lists logs-based metrics.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/metrics/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (projects-metrics-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/metrics",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn projects-metrics-get
  "Gets a logs-based metric.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/metrics/get

metricName <> "
  [metricName]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+metricName}",
     :uri-template-args {"metricName" metricName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn projects-metrics-create
  "Creates a logs-based metric.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/metrics/create

parent <> 
LogMetric:
LogMetric"
  [parent LogMetric]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+parent}/metrics",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.write"],
     :body LogMetric}))

(defn projects-metrics-update
  "Creates or updates a logs-based metric.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/metrics/update

metricName <> 
LogMetric:
LogMetric"
  [metricName LogMetric]
  (client/*api-request*
    {:method :put,
     :uri-template "https://logging.googleapis.com/v2/{+metricName}",
     :uri-template-args {"metricName" metricName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.write"],
     :body LogMetric}))

(defn projects-metrics-delete
  "Deletes a logs-based metric.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/projects/metrics/delete

metricName <> "
  [metricName]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+metricName}",
     :uri-template-args {"metricName" metricName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.write"]}))

(defn billingAccounts-getCmekSettings
  "Gets the Logging CMEK settings for the given resource.Note: CMEK for the Log Router can be configured for Google Cloud projects, folders, organizations, and billing accounts. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.See Enabling CMEK for Log Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/getCmekSettings

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}/cmekSettings",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn billingAccounts-getSettings
  "Gets the settings for the given resource.Note: Settings can be retrieved for Google Cloud projects, folders, organizations, and billing accounts.See View default resource settings for Logging (https://cloud.google.com/logging/docs/default-settings#view-org-settings) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/getSettings

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}/settings",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn billingAccounts-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like \"displayName=tokyo\", and is documented in more detail in AIP-160 (https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (billingAccounts-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn billingAccounts-locations-get
  "Gets information about a location.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn billingAccounts-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns UNIMPLEMENTED.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (billingAccounts-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn billingAccounts-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn billingAccounts-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns google.rpc.Code.UNIMPLEMENTED. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to Code.CANCELLED.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  (client/*api-request*
    {:method :post,
     :uri-template "https://logging.googleapis.com/v2/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body CancelOperationRequest}))

(defn billingAccounts-locations-buckets-list
  "Lists log buckets.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (billingAccounts-locations-buckets-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn billingAccounts-locations-buckets-get
  "Gets a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn billingAccounts-locations-buckets-createAsync
  "Creates a log bucket asynchronously that can be used to store log entries.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/createAsync

parent <> 
LogBucket:
LogBucket

optional:
bucketId <string> Required. A client-assigned identifier such as \"my-bucket\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. Bucket identifiers must start with an alphanumeric character."
  ([parent LogBucket]
    (billingAccounts-locations-buckets-createAsync
      parent
      LogBucket
      nil))
  ([parent LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets:createAsync",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn billingAccounts-locations-buckets-updateAsync
  "Updates a log bucket asynchronously.If the bucket has a lifecycle_state of DELETE_REQUESTED, then FAILED_PRECONDITION will be returned.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/updateAsync

name <> 
LogBucket:
LogBucket

optional:
updateMask <string> Required. Field mask that specifies the fields in bucket that need an update. A bucket field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see: https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=retention_days"
  ([name LogBucket]
    (billingAccounts-locations-buckets-updateAsync name LogBucket nil))
  ([name LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}:updateAsync",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn billingAccounts-locations-buckets-create
  "Creates a log bucket that can be used to store log entries. After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/create

parent <> 
LogBucket:
LogBucket

optional:
bucketId <string> Required. A client-assigned identifier such as \"my-bucket\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. Bucket identifiers must start with an alphanumeric character."
  ([parent LogBucket]
    (billingAccounts-locations-buckets-create parent LogBucket nil))
  ([parent LogBucket optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/buckets",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn billingAccounts-locations-buckets-patch
  "Updates a log bucket.If the bucket has a lifecycle_state of DELETE_REQUESTED, then FAILED_PRECONDITION will be returned.After a bucket has been created, the bucket's location cannot be changed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/patch

name <> 
LogBucket:
LogBucket

optional:
updateMask <string> Required. Field mask that specifies the fields in bucket that need an update. A bucket field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see: https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=retention_days"
  ([name LogBucket]
    (billingAccounts-locations-buckets-patch name LogBucket nil))
  ([name LogBucket optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogBucket})))

(defn billingAccounts-locations-buckets-delete
  "Deletes a log bucket.Changes the bucket's lifecycle_state to the DELETE_REQUESTED state. After 7 days, the bucket will be purged and all log entries in the bucket will be permanently deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn billingAccounts-locations-buckets-undelete
  "Undeletes a log bucket. A bucket that has been deleted can be undeleted within the grace period of 7 days.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/undelete

name <> 
UndeleteBucketRequest:
UndeleteBucketRequest"
  [name UndeleteBucketRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}:undelete",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body UndeleteBucketRequest}))

(defn billingAccounts-locations-buckets-views-list
  "Lists views on a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/views/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request.Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (billingAccounts-locations-buckets-views-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/views",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn billingAccounts-locations-buckets-views-get
  "Gets a view on a log bucket.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/views/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn billingAccounts-locations-buckets-views-create
  "Creates a view over log entries in a log bucket. A bucket may contain a maximum of 30 views.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/views/create

parent <> 
LogView:
LogView

optional:
viewId <string> Required. A client-assigned identifier such as \"my-view\". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods."
  ([parent LogView]
    (billingAccounts-locations-buckets-views-create
      parent
      LogView
      nil))
  ([parent LogView optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/views",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogView})))

(defn billingAccounts-locations-buckets-views-patch
  "Updates a view on a log bucket. This method replaces the value of the filter field from the existing view with the corresponding value from the new view. If an UNAVAILABLE error is returned, this indicates that system is not in a state where it can update the view. If this occurs, please try again in a few minutes.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/views/patch

name <> 
LogView:
LogView

optional:
updateMask <string> Optional. Field mask that specifies the fields in view that need an update. A field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([name LogView]
    (billingAccounts-locations-buckets-views-patch name LogView nil))
  ([name LogView optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogView})))

(defn billingAccounts-locations-buckets-views-delete
  "Deletes a view on a log bucket. If an UNAVAILABLE error is returned, this indicates that system is not in a state where it can delete the view. If this occurs, please try again in a few minutes.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/views/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn billingAccounts-locations-buckets-views-logs-list
  "Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/views/logs/list

parent <> 

optional:
resourceNames <string> Optional. List of resource names to list logs for: projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]To support legacy queries, it could also be: projects/[PROJECT_ID] organizations/[ORGANIZATION_ID] billingAccounts/[BILLING_ACCOUNT_ID] folders/[FOLDER_ID]The resource name in the parent field is added to this list.
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent]
    (billingAccounts-locations-buckets-views-logs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/logs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn billingAccounts-locations-buckets-links-list
  "Lists links.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/links/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request."
  ([parent] (billingAccounts-locations-buckets-links-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/links",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn billingAccounts-locations-buckets-links-get
  "Gets a link.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/links/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn billingAccounts-locations-buckets-links-create
  "Asynchronously creates a linked dataset in BigQuery which makes it possible to use BigQuery to read the logs stored in the log bucket. A log bucket may currently only contain one link.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/links/create

parent <> 
Link:
Link

optional:
linkId <string> Required. The ID to use for the link. The link_id can have up to 100 characters. A valid link_id must only have alphanumeric characters and underscores within it."
  ([parent Link]
    (billingAccounts-locations-buckets-links-create parent Link nil))
  ([parent Link optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/links",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body Link})))

(defn billingAccounts-locations-buckets-links-delete
  "Deletes a link. This will also delete the corresponding BigQuery linked dataset.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/buckets/links/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn billingAccounts-locations-savedQueries-list
  "Lists the SavedQueries that were created by the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/savedQueries/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request.Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
filter <string> Optional. Specifies the type (\"Logging\" or \"OpsAnalytics\") and the visibility (PRIVATE or SHARED) of the saved queries to list. If provided, the filter must contain either the type function or a visibility token, or both. If both are chosen, they can be placed in any order, but they must be joined by the AND operator or the empty character.The two supported type function calls are: type(\"Logging\") type(\"OpsAnalytics\")The two supported visibility tokens are: visibility = PRIVATE visibility = SHAREDFor example:type(\"Logging\") AND visibility = PRIVATE visibility=SHARED type(\"OpsAnalytics\") type(\"OpsAnalytics)\" visibility = PRIVATE visibility = SHARED"
  ([parent] (billingAccounts-locations-savedQueries-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/savedQueries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn billingAccounts-locations-savedQueries-get
  "Returns all data associated with the requested query.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/savedQueries/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn billingAccounts-locations-savedQueries-create
  "Creates a new SavedQuery for the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/savedQueries/create

parent <> 
SavedQuery:
SavedQuery

optional:
savedQueryId <string> Optional. The ID to use for the saved query, which will become the final component of the saved query's resource name.If the saved_query_id is not provided, the system will generate an alphanumeric ID.The saved_query_id is limited to 100 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, periods.First character has to be alphanumeric."
  ([parent SavedQuery]
    (billingAccounts-locations-savedQueries-create
      parent
      SavedQuery
      nil))
  ([parent SavedQuery optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/savedQueries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body SavedQuery})))

(defn billingAccounts-locations-savedQueries-patch
  "Updates an existing SavedQuery.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/savedQueries/patch

name <> 
SavedQuery:
SavedQuery

optional:
updateMask <string> Required. A non-empty list of fields to change in the existing saved query. Fields are relative to the saved_query and new values for the fields are taken from the corresponding fields in the SavedQuery included in this request. Fields not mentioned in update_mask are not changed and are ignored in the request.To update all mutable fields, specify an update_mask of *.For example, to change the description and query filter text of a saved query, specify an update_mask of \"description, query.filter\"."
  ([name SavedQuery]
    (billingAccounts-locations-savedQueries-patch name SavedQuery nil))
  ([name SavedQuery optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body SavedQuery})))

(defn billingAccounts-locations-savedQueries-delete
  "Deletes an existing SavedQuery that was created by the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/savedQueries/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn billingAccounts-locations-recentQueries-list
  "Lists the RecentQueries that were created by the user making the request.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/locations/recentQueries/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
filter <string> Optional. Specifies the type (\"Logging\" or \"OpsAnalytics\") of the recent queries to list. The only valid value for this field is one of the two allowable type function calls, which are the following: type(\"Logging\") type(\"OpsAnalytics\")"
  ([parent] (billingAccounts-locations-recentQueries-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/recentQueries",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn billingAccounts-exclusions-list
  "Lists all the exclusions on the _Default sink in a parent resource.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/exclusions/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (billingAccounts-exclusions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/exclusions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn billingAccounts-exclusions-get
  "Gets the description of an exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/exclusions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn billingAccounts-exclusions-create
  "Creates a new exclusion in the _Default sink in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions in a resource.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/exclusions/create

parent <> 
LogExclusion:
LogExclusion"
  [parent LogExclusion]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://logging.googleapis.com/v2/{+parent}/exclusions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"],
     :body LogExclusion}))

(defn billingAccounts-exclusions-patch
  "Changes one or more properties of an existing exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/exclusions/patch

name <> 
LogExclusion:
LogExclusion

optional:
updateMask <string> Required. A non-empty list of fields to change in the existing exclusion. New values for the fields are taken from the corresponding fields in the LogExclusion included in this request. Fields not mentioned in update_mask are not changed and are ignored in the request.For example, to change the filter and description of an exclusion, specify an update_mask of \"filter,description\"."
  ([name LogExclusion]
    (billingAccounts-exclusions-patch name LogExclusion nil))
  ([name LogExclusion optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogExclusion})))

(defn billingAccounts-exclusions-delete
  "Deletes an exclusion in the _Default sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/exclusions/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn billingAccounts-sinks-list
  "Lists sinks.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/sinks/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
filter <string> Optional. A filter expression to constrain the sinks returned. Today, this only supports the following strings: '' 'in_scope(\"ALL\")', 'in_scope(\"ANCESTOR\")', 'in_scope(\"DEFAULT\")'.Description of scopes below. ALL: Includes all of the sinks which can be returned in any other scope. ANCESTOR: Includes intercepting sinks owned by ancestor resources. DEFAULT: Includes sinks owned by parent.When the empty string is provided, then the filter 'in_scope(\"DEFAULT\")' is applied."
  ([parent] (billingAccounts-sinks-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/sinks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn billingAccounts-sinks-get
  "Gets a sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/sinks/get

sinkName <> "
  [sinkName]
  (client/*api-request*
    {:method :get,
     :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
     :uri-template-args {"sinkName" sinkName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn billingAccounts-sinks-create
  "Creates a sink that exports specified log entries to a destination. The export begins upon ingress, unless the sink's writer_identity is not permitted to write to the destination. A sink can export log entries only from the resource owning the sink.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/sinks/create

parent <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. Determines the kind of IAM identity returned as writer_identity in the new sink. If this value is omitted or set to false, and if the sink's parent is a project, then the value returned as writer_identity is the same group or service account used by Cloud Logging before the addition of writer identities to this API. The sink's destination must be in the same project as the sink itself.If this field is set to true, or if the sink is owned by a non-project resource such as an organization, then the value of writer_identity will be a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) used by the sinks with the same parent. For more information, see writer_identity in LogSink.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated."
  ([parent LogSink] (billingAccounts-sinks-create parent LogSink nil))
  ([parent LogSink optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/sinks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn billingAccounts-sinks-update
  "Updates a sink. This method replaces the values of the destination and filter fields of the existing sink with the corresponding values from the new sink.The updated sink might also have a new writer_identity; see the unique_writer_identity field.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/sinks/update

sinkName <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the updated sink depends on both the old and new values of this field: If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity. If the old value is false and the new value is true, then writer_identity is changed to a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) owned by Cloud Logging. It is an error if the old value is true and the new value is set to false or defaulted to false.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated.
updateMask <string> Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility purposes:destination,filter,includeChildrenAt some point in the future, behavior will be removed and specifying an empty updateMask will be an error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([sinkName LogSink]
    (billingAccounts-sinks-update sinkName LogSink nil))
  ([sinkName LogSink optional]
    (client/*api-request*
      {:method :put,
       :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
       :uri-template-args {"sinkName" sinkName},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn billingAccounts-sinks-patch
  "Updates a sink. This method replaces the values of the destination and filter fields of the existing sink with the corresponding values from the new sink.The updated sink might also have a new writer_identity; see the unique_writer_identity field.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/sinks/patch

sinkName <> 
LogSink:
LogSink

optional:
uniqueWriterIdentity <boolean> Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the updated sink depends on both the old and new values of this field: If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity. If the old value is false and the new value is true, then writer_identity is changed to a service agent (https://cloud.google.com/iam/docs/service-account-types#service-agents) owned by Cloud Logging. It is an error if the old value is true and the new value is set to false or defaulted to false.
customWriterIdentity <string> Optional. The service account provided by the caller that will be used to write the log entries. The format must be serviceAccount:some@email. This field can only be specified when you are routing logs to a log bucket that is in a different project than the sink. When not specified, a Logging service account will automatically be generated.
updateMask <string> Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility purposes:destination,filter,includeChildrenAt some point in the future, behavior will be removed and specifying an empty updateMask will be an error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter"
  ([sinkName LogSink]
    (billingAccounts-sinks-patch sinkName LogSink nil))
  ([sinkName LogSink optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
       :uri-template-args {"sinkName" sinkName},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body LogSink})))

(defn billingAccounts-sinks-delete
  "Deletes a sink. If the sink has a unique writer_identity, then that service account is also deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/sinks/delete

sinkName <> "
  [sinkName]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+sinkName}",
     :uri-template-args {"sinkName" sinkName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn billingAccounts-logs-delete
  "Deletes all the log entries in a log for the _Default Log Bucket. The log reappears if it receives new entries. Log entries written shortly before the delete operation might not be deleted. Entries received after the delete operation with a timestamp before the operation will be deleted.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/logs/delete

logName <> "
  [logName]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://logging.googleapis.com/v2/{+logName}",
     :uri-template-args {"logName" logName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/logging.admin"]}))

(defn billingAccounts-logs-list
  "Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/billingAccounts/logs/list

parent <> 

optional:
resourceNames <string> Optional. List of resource names to list logs for: projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]To support legacy queries, it could also be: projects/[PROJECT_ID] organizations/[ORGANIZATION_ID] billingAccounts/[BILLING_ACCOUNT_ID] folders/[FOLDER_ID]The resource name in the parent field is added to this list.
pageSize <integer> Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available."
  ([parent] (billingAccounts-logs-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://logging.googleapis.com/v2/{+parent}/logs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/logging.admin"
        "https://www.googleapis.com/auth/logging.read"]})))

(defn getCmekSettings
  "Gets the Logging CMEK settings for the given resource.Note: CMEK for the Log Router can be configured for Google Cloud projects, folders, organizations, and billing accounts. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.See Enabling CMEK for Log Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/getCmekSettings

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}/cmekSettings",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn updateCmekSettings
  "Updates the Log Router CMEK settings for the given resource.Note: CMEK for the Log Router can currently only be configured for Google Cloud organizations. Once configured, it applies to all projects and folders in the Google Cloud organization.UpdateCmekSettings fails when any of the following are true: The value of kms_key_name is invalid. The associated service account doesn't have the required roles/cloudkms.cryptoKeyEncrypterDecrypter role assigned for the key. Access to the key is disabled.See Enabling CMEK for Log Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/updateCmekSettings

name <> 
CmekSettings:
CmekSettings

optional:
updateMask <string> Optional. Field mask identifying which fields from cmek_settings should be updated. A field will be overwritten if and only if it is in the update mask. Output only fields cannot be updated.See FieldMask for more information.For example: \"updateMask=kmsKeyName\""
  ([name CmekSettings] (updateCmekSettings name CmekSettings nil))
  ([name CmekSettings optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/cmekSettings",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body CmekSettings})))

(defn getSettings
  "Gets the settings for the given resource.Note: Settings can be retrieved for Google Cloud projects, folders, organizations, and billing accounts.See View default resource settings for Logging (https://cloud.google.com/logging/docs/default-settings#view-org-settings) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/getSettings

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://logging.googleapis.com/v2/{+name}/settings",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/logging.admin"
      "https://www.googleapis.com/auth/logging.read"]}))

(defn updateSettings
  "Updates the settings for the given resource. This method applies to all feature configurations for organization and folders.UpdateSettings fails when any of the following are true: The value of storage_location either isn't supported by Logging or violates the location OrgPolicy. The default_sink_config field is set, but it has an unspecified filter write mode. The value of kms_key_name is invalid. The associated service account doesn't have the required roles/cloudkms.cryptoKeyEncrypterDecrypter role assigned for the key. Access to the key is disabled.See Configure default settings for organizations and folders (https://cloud.google.com/logging/docs/default-settings) for more information.
https://cloud.google.com/logging/docs/v2/reference/rest/v2/updateSettings

name <> 
Settings:
Settings

optional:
updateMask <string> Optional. Field mask identifying which fields from settings should be updated. A field will be overwritten if and only if it is in the update mask. Output only fields cannot be updated.See FieldMask for more information.For example: \"updateMask=kmsKeyName\""
  ([name Settings] (updateSettings name Settings nil))
  ([name Settings optional]
    (client/*api-request*
      {:method :patch,
       :uri-template
       "https://logging.googleapis.com/v2/{+name}/settings",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/logging.admin"],
       :body Settings})))
