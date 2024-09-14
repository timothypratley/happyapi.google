(ns happyapi.google.clouddeploy-v1
  "Cloud Deploy API

See: https://cloud.google.com/deploy/")

(defn projects-locations-getConfig
  "Gets the configuration for a location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/getConfig

name <> "
  [name]
  {:method :get,
   :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CancelOperationRequest})

(defn projects-locations-deliveryPipelines-rollbackTarget
  "Creates a `Rollout` to roll back the specified target.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/rollbackTarget

name <> 
RollbackTargetRequest:
RollbackTargetRequest"
  [name RollbackTargetRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+name}:rollbackTarget",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RollbackTargetRequest})

(defn projects-locations-deliveryPipelines-list
  "Lists DeliveryPipelines in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/list

parent <> 

optional:
pageSize <integer> The maximum number of pipelines to return. The service may return fewer than this value. If unspecified, at most 50 pipelines will be returned. The maximum value is 1000; values above 1000 will be set to 1000.
filter <string> Filter pipelines to be returned. See https://google.aip.dev/160 for more details.
orderBy <string> Field to sort by. See https://google.aip.dev/132#ordering for more details."
  ([parent] (projects-locations-deliveryPipelines-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/deliveryPipelines",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deliveryPipelines-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-deliveryPipelines-delete
  "Deletes a single DeliveryPipeline.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
allowMissing <boolean> Optional. If set to true, then deleting an already deleted or non-existing `DeliveryPipeline` will succeed.
validateOnly <boolean> Optional. If set, validate the request and preview the review, but do not actually post it.
force <boolean> Optional. If set to true, all child resources under this pipeline will also be deleted. Otherwise, the request will only work if the pipeline has no child resources.
etag <string> Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding."
  ([name] (projects-locations-deliveryPipelines-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deliveryPipelines-patch
  "Updates the parameters of a single DeliveryPipeline.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/patch

name <> 
DeliveryPipeline:
DeliveryPipeline

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten by the update in the `DeliveryPipeline` resource. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it's in the mask. If the user doesn't provide a mask then all fields are overwritten.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
allowMissing <boolean> Optional. If set to true, updating a `DeliveryPipeline` that does not exist will result in the creation of a new `DeliveryPipeline`.
validateOnly <boolean> Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made."
  ([name DeliveryPipeline]
    (projects-locations-deliveryPipelines-patch
      name
      DeliveryPipeline
      nil))
  ([name DeliveryPipeline optional]
    {:method :patch,
     :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body DeliveryPipeline}))

(defn projects-locations-deliveryPipelines-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-deliveryPipelines-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deliveryPipelines-create
  "Creates a new DeliveryPipeline in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/create

parent <> 
DeliveryPipeline:
DeliveryPipeline

optional:
deliveryPipelineId <string> Required. ID of the `DeliveryPipeline`.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made."
  ([parent DeliveryPipeline]
    (projects-locations-deliveryPipelines-create
      parent
      DeliveryPipeline
      nil))
  ([parent DeliveryPipeline optional]
    {:method :post,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/deliveryPipelines",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body DeliveryPipeline}))

(defn projects-locations-deliveryPipelines-get
  "Gets details of a single DeliveryPipeline.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-deliveryPipelines-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-deliveryPipelines-releases-list
  "Lists Releases in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of `Release` objects to return. The service may return fewer than this value. If unspecified, at most 50 `Release` objects will be returned. The maximum value is 1000; values above 1000 will be set to 1000.
filter <string> Optional. Filter releases to be returned. See https://google.aip.dev/160 for more details.
orderBy <string> Optional. Field to sort by. See https://google.aip.dev/132#ordering for more details."
  ([parent]
    (projects-locations-deliveryPipelines-releases-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/releases",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deliveryPipelines-releases-get
  "Gets details of a single Release.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-deliveryPipelines-releases-create
  "Creates a new Release in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/create

parent <> 
Release:
Release

optional:
releaseId <string> Required. ID of the `Release`.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made."
  ([parent Release]
    (projects-locations-deliveryPipelines-releases-create
      parent
      Release
      nil))
  ([parent Release optional]
    {:method :post,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/releases",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Release}))

(defn projects-locations-deliveryPipelines-releases-abandon
  "Abandons a Release in the Delivery Pipeline.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/abandon

name <> 
AbandonReleaseRequest:
AbandonReleaseRequest"
  [name AbandonReleaseRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+name}:abandon",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body AbandonReleaseRequest})

(defn projects-locations-deliveryPipelines-releases-rollouts-approve
  "Approves a Rollout.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/rollouts/approve

name <> 
ApproveRolloutRequest:
ApproveRolloutRequest"
  [name ApproveRolloutRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+name}:approve",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body ApproveRolloutRequest})

(defn projects-locations-deliveryPipelines-releases-rollouts-advance
  "Advances a Rollout in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/rollouts/advance

name <> 
AdvanceRolloutRequest:
AdvanceRolloutRequest"
  [name AdvanceRolloutRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+name}:advance",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body AdvanceRolloutRequest})

(defn projects-locations-deliveryPipelines-releases-rollouts-cancel
  "Cancels a Rollout in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/rollouts/cancel

name <> 
CancelRolloutRequest:
CancelRolloutRequest"
  [name CancelRolloutRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CancelRolloutRequest})

(defn projects-locations-deliveryPipelines-releases-rollouts-list
  "Lists Rollouts in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/rollouts/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of `Rollout` objects to return. The service may return fewer than this value. If unspecified, at most 50 `Rollout` objects will be returned. The maximum value is 1000; values above 1000 will be set to 1000.
filter <string> Optional. Filter rollouts to be returned. See https://google.aip.dev/160 for more details.
orderBy <string> Optional. Field to sort by. See https://google.aip.dev/132#ordering for more details."
  ([parent]
    (projects-locations-deliveryPipelines-releases-rollouts-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/rollouts",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deliveryPipelines-releases-rollouts-get
  "Gets details of a single Rollout.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/rollouts/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-deliveryPipelines-releases-rollouts-create
  "Creates a new Rollout in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/rollouts/create

parent <> 
Rollout:
Rollout

optional:
rolloutId <string> Required. ID of the `Rollout`.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made.
startingPhaseId <string> Optional. The starting phase ID for the `Rollout`. If empty the `Rollout` will start at the first phase."
  ([parent Rollout]
    (projects-locations-deliveryPipelines-releases-rollouts-create
      parent
      Rollout
      nil))
  ([parent Rollout optional]
    {:method :post,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/rollouts",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Rollout}))

(defn projects-locations-deliveryPipelines-releases-rollouts-ignoreJob
  "Ignores the specified Job in a Rollout.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/rollouts/ignoreJob

rollout <> 
IgnoreJobRequest:
IgnoreJobRequest"
  [rollout IgnoreJobRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+rollout}:ignoreJob",
   :uri-template-args {"rollout" rollout},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body IgnoreJobRequest})

(defn projects-locations-deliveryPipelines-releases-rollouts-retryJob
  "Retries the specified Job in a Rollout.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/rollouts/retryJob

rollout <> 
RetryJobRequest:
RetryJobRequest"
  [rollout RetryJobRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+rollout}:retryJob",
   :uri-template-args {"rollout" rollout},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RetryJobRequest})

(defn projects-locations-deliveryPipelines-releases-rollouts-jobRuns-list
  "Lists JobRuns in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/rollouts/jobRuns/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of `JobRun` objects to return. The service may return fewer than this value. If unspecified, at most 50 `JobRun` objects will be returned. The maximum value is 1000; values above 1000 will be set to 1000.
filter <string> Optional. Filter results to be returned. See https://google.aip.dev/160 for more details.
orderBy <string> Optional. Field to sort by. See https://google.aip.dev/132#ordering for more details."
  ([parent]
    (projects-locations-deliveryPipelines-releases-rollouts-jobRuns-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/jobRuns",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deliveryPipelines-releases-rollouts-jobRuns-get
  "Gets details of a single JobRun.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/rollouts/jobRuns/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-deliveryPipelines-releases-rollouts-jobRuns-terminate
  "Terminates a Job Run in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/releases/rollouts/jobRuns/terminate

name <> 
TerminateJobRunRequest:
TerminateJobRunRequest"
  [name TerminateJobRunRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+name}:terminate",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TerminateJobRunRequest})

(defn projects-locations-deliveryPipelines-automations-create
  "Creates a new Automation in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/automations/create

parent <> 
Automation:
Automation

optional:
automationId <string> Required. ID of the `Automation`.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made."
  ([parent Automation]
    (projects-locations-deliveryPipelines-automations-create
      parent
      Automation
      nil))
  ([parent Automation optional]
    {:method :post,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/automations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Automation}))

(defn projects-locations-deliveryPipelines-automations-patch
  "Updates the parameters of a single Automation resource.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/automations/patch

name <> 
Automation:
Automation

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten by the update in the `Automation` resource. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it's in the mask. If the user doesn't provide a mask then all fields are overwritten.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
allowMissing <boolean> Optional. If set to true, updating a `Automation` that does not exist will result in the creation of a new `Automation`.
validateOnly <boolean> Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made."
  ([name Automation]
    (projects-locations-deliveryPipelines-automations-patch
      name
      Automation
      nil))
  ([name Automation optional]
    {:method :patch,
     :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Automation}))

(defn projects-locations-deliveryPipelines-automations-delete
  "Deletes a single Automation resource.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/automations/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
allowMissing <boolean> Optional. If set to true, then deleting an already deleted or non-existing `Automation` will succeed.
validateOnly <boolean> Optional. If set, validate the request and verify whether the resource exists, but do not actually post it.
etag <string> Optional. The weak etag of the request. This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding."
  ([name]
    (projects-locations-deliveryPipelines-automations-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deliveryPipelines-automations-get
  "Gets details of a single Automation.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/automations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-deliveryPipelines-automations-list
  "Lists Automations in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/automations/list

parent <> 

optional:
pageSize <integer> The maximum number of automations to return. The service may return fewer than this value. If unspecified, at most 50 automations will be returned. The maximum value is 1000; values above 1000 will be set to 1000.
filter <string> Filter automations to be returned. All fields can be used in the filter.
orderBy <string> Field to sort by."
  ([parent]
    (projects-locations-deliveryPipelines-automations-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/automations",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deliveryPipelines-automationRuns-get
  "Gets details of a single AutomationRun.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/automationRuns/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-deliveryPipelines-automationRuns-list
  "Lists AutomationRuns in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/automationRuns/list

parent <> 

optional:
pageSize <integer> The maximum number of automationRuns to return. The service may return fewer than this value. If unspecified, at most 50 automationRuns will be returned. The maximum value is 1000; values above 1000 will be set to 1000.
filter <string> Filter automationRuns to be returned. All fields can be used in the filter.
orderBy <string> Field to sort by."
  ([parent]
    (projects-locations-deliveryPipelines-automationRuns-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/automationRuns",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-deliveryPipelines-automationRuns-cancel
  "Cancels an AutomationRun. The `state` of the `AutomationRun` after cancelling is `CANCELLED`. `CancelAutomationRun` can be called on AutomationRun in the state `IN_PROGRESS` and `PENDING`; AutomationRun in a different state returns an `FAILED_PRECONDITION` error.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/deliveryPipelines/automationRuns/cancel

name <> 
CancelAutomationRunRequest:
CancelAutomationRunRequest"
  [name CancelAutomationRunRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CancelAutomationRunRequest})

(defn projects-locations-targets-list
  "Lists Targets in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/targets/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of `Target` objects to return. The service may return fewer than this value. If unspecified, at most 50 `Target` objects will be returned. The maximum value is 1000; values above 1000 will be set to 1000.
filter <string> Optional. Filter targets to be returned. See https://google.aip.dev/160 for more details.
orderBy <string> Optional. Field to sort by. See https://google.aip.dev/132#ordering for more details."
  ([parent] (projects-locations-targets-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/targets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-targets-get
  "Gets details of a single Target.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/targets/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-targets-create
  "Creates a new Target in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/targets/create

parent <> 
Target:
Target

optional:
targetId <string> Required. ID of the `Target`.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made."
  ([parent Target]
    (projects-locations-targets-create parent Target nil))
  ([parent Target optional]
    {:method :post,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/targets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Target}))

(defn projects-locations-targets-patch
  "Updates the parameters of a single Target.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/targets/patch

name <> 
Target:
Target

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten by the update in the `Target` resource. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it's in the mask. If the user doesn't provide a mask then all fields are overwritten.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
allowMissing <boolean> Optional. If set to true, updating a `Target` that does not exist will result in the creation of a new `Target`.
validateOnly <boolean> Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made."
  ([name Target] (projects-locations-targets-patch name Target nil))
  ([name Target optional]
    {:method :patch,
     :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body Target}))

(defn projects-locations-targets-delete
  "Deletes a single Target.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/targets/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
allowMissing <boolean> Optional. If set to true, then deleting an already deleted or non-existing `Target` will succeed.
validateOnly <boolean> Optional. If set, validate the request and preview the review, but do not actually post it.
etag <string> Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding."
  ([name] (projects-locations-targets-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-targets-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/targets/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-targets-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/targets/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-targets-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-targets-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/targets/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-customTargetTypes-list
  "Lists CustomTargetTypes in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/customTargetTypes/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of `CustomTargetType` objects to return. The service may return fewer than this value. If unspecified, at most 50 `CustomTargetType` objects will be returned. The maximum value is 1000; values above 1000 will be set to 1000.
filter <string> Optional. Filter custom target types to be returned. See https://google.aip.dev/160 for more details.
orderBy <string> Optional. Field to sort by. See https://google.aip.dev/132#ordering for more details."
  ([parent] (projects-locations-customTargetTypes-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/customTargetTypes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-customTargetTypes-get
  "Gets details of a single CustomTargetType.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/customTargetTypes/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-customTargetTypes-create
  "Creates a new CustomTargetType in a given project and location.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/customTargetTypes/create

parent <> 
CustomTargetType:
CustomTargetType

optional:
customTargetTypeId <string> Required. ID of the `CustomTargetType`.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
validateOnly <boolean> Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made."
  ([parent CustomTargetType]
    (projects-locations-customTargetTypes-create
      parent
      CustomTargetType
      nil))
  ([parent CustomTargetType optional]
    {:method :post,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+parent}/customTargetTypes",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CustomTargetType}))

(defn projects-locations-customTargetTypes-patch
  "Updates a single CustomTargetType.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/customTargetTypes/patch

name <> 
CustomTargetType:
CustomTargetType

optional:
updateMask <string> Required. Field mask is used to specify the fields to be overwritten by the update in the `CustomTargetType` resource. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it's in the mask. If the user doesn't provide a mask then all fields are overwritten.
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
allowMissing <boolean> Optional. If set to true, updating a `CustomTargetType` that does not exist will result in the creation of a new `CustomTargetType`.
validateOnly <boolean> Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made."
  ([name CustomTargetType]
    (projects-locations-customTargetTypes-patch
      name
      CustomTargetType
      nil))
  ([name CustomTargetType optional]
    {:method :patch,
     :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CustomTargetType}))

(defn projects-locations-customTargetTypes-delete
  "Deletes a single CustomTargetType.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/customTargetTypes/delete

name <> 

optional:
requestId <string> Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server knows to ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
allowMissing <boolean> Optional. If set to true, then deleting an already deleted or non-existing `CustomTargetType` will succeed.
validateOnly <boolean> Optional. If set to true, the request is validated but no actual change is made.
etag <string> Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding."
  ([name] (projects-locations-customTargetTypes-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://clouddeploy.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-customTargetTypes-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/customTargetTypes/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://clouddeploy.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-customTargetTypes-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/deploy/v1/reference/rest/v1/projects/locations/customTargetTypes/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource]
    (projects-locations-customTargetTypes-getIamPolicy resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://clouddeploy.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
