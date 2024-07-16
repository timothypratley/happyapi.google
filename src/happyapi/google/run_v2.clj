(ns happyapi.google.run-v2
  "Cloud Run Admin API
Deploy and manage user provided container images that scale automatically based on incoming requests. The Cloud Run Admin API v1 follows the Knative Serving API specification, while v2 is aligned with Google Cloud AIP-based API standards, as described in https://google.aip.dev/.
See: https://cloud.google.com/run/"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-exportProjectMetadata
  "Export generated customer metadata for a given project.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/exportProjectMetadata

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://run.googleapis.com/v2/{+name}:exportProjectMetadata",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-exportMetadata
  "Export generated customer metadata for a given resource.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/exportMetadata

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://run.googleapis.com/v2/{+name}:exportMetadata",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-exportImageMetadata
  "Export image metadata for a given resource.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/exportImageMetadata

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://run.googleapis.com/v2/{+name}:exportImageMetadata",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-exportImage
  "Export image for a given resource.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/exportImage

name <> 
GoogleCloudRunV2ExportImageRequest:
GoogleCloudRunV2ExportImageRequest"
  [name GoogleCloudRunV2ExportImageRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://run.googleapis.com/v2/{+name}:exportImage",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRunV2ExportImageRequest}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/operations/list

name <> 

optional:
filter <string> Optional. A filter for matching the completed or in-progress operations. The supported formats of *filter* are: To query for only completed operations: done:true To query for only ongoing operations: done:false Must be empty to query for all of the latest operations for the given parent project.
pageSize <integer> The maximum number of records that should be returned. Requested page size cannot exceed 100. If not set or set to less than or equal to 0, the default page size is 100. ."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://run.googleapis.com/v2/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://run.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/operations/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://run.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/operations/wait

name <> 
GoogleLongrunningWaitOperationRequest:
GoogleLongrunningWaitOperationRequest"
  [name GoogleLongrunningWaitOperationRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://run.googleapis.com/v2/{+name}:wait",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleLongrunningWaitOperationRequest}))

(defn projects-locations-jobs-list
  "Lists Jobs. Results are sorted by creation time, descending.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/list

parent <> 

optional:
pageSize <integer> Maximum number of Jobs to return in this call.
showDeleted <boolean> If true, returns deleted (but unexpired) resources along with active ones."
  ([parent] (projects-locations-jobs-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template "https://run.googleapis.com/v2/{+parent}/jobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-jobs-setIamPolicy
  "Sets the IAM Access control policy for the specified Job. Overwrites any existing policy.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://run.googleapis.com/v2/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1SetIamPolicyRequest}))

(defn projects-locations-jobs-delete
  "Deletes a Job.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/delete

name <> 

optional:
validateOnly <boolean> Indicates that the request should be validated without actually deleting any resources.
etag <string> A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during updates."
  ([name] (projects-locations-jobs-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://run.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-jobs-run
  "Triggers creation of a new Execution of this Job.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/run

name <> 
GoogleCloudRunV2RunJobRequest:
GoogleCloudRunV2RunJobRequest"
  [name GoogleCloudRunV2RunJobRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://run.googleapis.com/v2/{+name}:run",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRunV2RunJobRequest}))

(defn projects-locations-jobs-patch
  "Updates a Job.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/patch

name <> 
GoogleCloudRunV2Job:
GoogleCloudRunV2Job

optional:
validateOnly <boolean> Indicates that the request should be validated and default values populated, without persisting the request or updating any resources.
allowMissing <boolean> Optional. If set to true, and if the Job does not exist, it will create a new one. Caller must have both create and update permissions for this call if this is set to true."
  ([name GoogleCloudRunV2Job]
    (projects-locations-jobs-patch name GoogleCloudRunV2Job nil))
  ([name GoogleCloudRunV2Job optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://run.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudRunV2Job})))

(defn projects-locations-jobs-getIamPolicy
  "Gets the IAM Access Control policy currently in effect for the given Job. This result does not include any inherited policies.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-jobs-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://run.googleapis.com/v2/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-jobs-create
  "Creates a Job.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/create

parent <> 
GoogleCloudRunV2Job:
GoogleCloudRunV2Job

optional:
jobId <string> Required. The unique identifier for the Job. The name of the job becomes {parent}/jobs/{job_id}.
validateOnly <boolean> Indicates that the request should be validated and default values populated, without persisting the request or creating any resources."
  ([parent GoogleCloudRunV2Job]
    (projects-locations-jobs-create parent GoogleCloudRunV2Job nil))
  ([parent GoogleCloudRunV2Job optional]
    (client/api-request
      {:method :post,
       :uri-template "https://run.googleapis.com/v2/{+parent}/jobs",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudRunV2Job})))

(defn projects-locations-jobs-get
  "Gets information about a Job.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://run.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobs-testIamPermissions
  "Returns permissions that a caller has on the specified Project. There are no permissions required for making this API call.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://run.googleapis.com/v2/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1TestIamPermissionsRequest}))

(defn projects-locations-jobs-executions-exportStatus
  "Read the status of an image export operation.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/executions/exportStatus

name <> 
operationId <> "
  [name operationId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://run.googleapis.com/v2/{+name}/{+operationId}:exportStatus",
     :uri-template-args {"name" name, "operationId" operationId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobs-executions-get
  "Gets information about an Execution.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/executions/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://run.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobs-executions-list
  "Lists Executions from a Job. Results are sorted by creation time, descending.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/executions/list

parent <> 

optional:
pageSize <integer> Maximum number of Executions to return in this call.
showDeleted <boolean> If true, returns deleted (but unexpired) resources along with active ones."
  ([parent] (projects-locations-jobs-executions-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://run.googleapis.com/v2/{+parent}/executions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-jobs-executions-delete
  "Deletes an Execution.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/executions/delete

name <> 

optional:
validateOnly <boolean> Indicates that the request should be validated without actually deleting any resources.
etag <string> A system-generated fingerprint for this version of the resource. This may be used to detect modification conflict during updates."
  ([name] (projects-locations-jobs-executions-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://run.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-jobs-executions-cancel
  "Cancels an Execution.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/executions/cancel

name <> 
GoogleCloudRunV2CancelExecutionRequest:
GoogleCloudRunV2CancelExecutionRequest"
  [name GoogleCloudRunV2CancelExecutionRequest]
  (client/api-request
    {:method :post,
     :uri-template "https://run.googleapis.com/v2/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudRunV2CancelExecutionRequest}))

(defn projects-locations-jobs-executions-tasks-get
  "Gets information about a Task.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/executions/tasks/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://run.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-jobs-executions-tasks-list
  "Lists Tasks from an Execution of a Job.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/jobs/executions/tasks/list

parent <> 

optional:
pageSize <integer> Maximum number of Tasks to return in this call.
showDeleted <boolean> If true, returns deleted (but unexpired) resources along with active ones."
  ([parent] (projects-locations-jobs-executions-tasks-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template "https://run.googleapis.com/v2/{+parent}/tasks",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-services-create
  "Creates a new Service in a given project and location.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/services/create

parent <> 
GoogleCloudRunV2Service:
GoogleCloudRunV2Service

optional:
serviceId <string> Required. The unique identifier for the Service. It must begin with letter, and cannot end with hyphen; must contain fewer than 50 characters. The name of the service becomes {parent}/services/{service_id}.
validateOnly <boolean> Indicates that the request should be validated and default values populated, without persisting the request or creating any resources."
  ([parent GoogleCloudRunV2Service]
    (projects-locations-services-create
      parent
      GoogleCloudRunV2Service
      nil))
  ([parent GoogleCloudRunV2Service optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://run.googleapis.com/v2/{+parent}/services",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudRunV2Service})))

(defn projects-locations-services-get
  "Gets information about a Service.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/services/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://run.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-services-list
  "Lists Services. Results are sorted by creation time, descending.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/services/list

parent <> 

optional:
pageSize <integer> Maximum number of Services to return in this call.
showDeleted <boolean> If true, returns deleted (but unexpired) resources along with active ones."
  ([parent] (projects-locations-services-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://run.googleapis.com/v2/{+parent}/services",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-services-patch
  "Updates a Service.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/services/patch

name <> 
GoogleCloudRunV2Service:
GoogleCloudRunV2Service

optional:
updateMask <string> Optional. The list of fields to be updated.
validateOnly <boolean> Indicates that the request should be validated and default values populated, without persisting the request or updating any resources.
allowMissing <boolean> Optional. If set to true, and if the Service does not exist, it will create a new one. The caller must have 'run.services.create' permissions if this is set to true and the Service does not exist."
  ([name GoogleCloudRunV2Service]
    (projects-locations-services-patch
      name
      GoogleCloudRunV2Service
      nil))
  ([name GoogleCloudRunV2Service optional]
    (client/api-request
      {:method :patch,
       :uri-template "https://run.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body GoogleCloudRunV2Service})))

(defn projects-locations-services-delete
  "Deletes a Service. This will cause the Service to stop serving traffic and will delete all revisions.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/services/delete

name <> 

optional:
validateOnly <boolean> Indicates that the request should be validated without actually deleting any resources.
etag <string> A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during updates."
  ([name] (projects-locations-services-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://run.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-services-getIamPolicy
  "Gets the IAM Access Control policy currently in effect for the given Cloud Run Service. This result does not include any inherited policies.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/services/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-services-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://run.googleapis.com/v2/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-services-setIamPolicy
  "Sets the IAM Access control policy for the specified Service. Overwrites any existing policy.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/services/setIamPolicy

resource <> 
GoogleIamV1SetIamPolicyRequest:
GoogleIamV1SetIamPolicyRequest"
  [resource GoogleIamV1SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://run.googleapis.com/v2/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1SetIamPolicyRequest}))

(defn projects-locations-services-testIamPermissions
  "Returns permissions that a caller has on the specified Project. There are no permissions required for making this API call.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/services/testIamPermissions

resource <> 
GoogleIamV1TestIamPermissionsRequest:
GoogleIamV1TestIamPermissionsRequest"
  [resource GoogleIamV1TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://run.googleapis.com/v2/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV1TestIamPermissionsRequest}))

(defn projects-locations-services-revisions-exportStatus
  "Read the status of an image export operation.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/services/revisions/exportStatus

name <> 
operationId <> "
  [name operationId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://run.googleapis.com/v2/{+name}/{+operationId}:exportStatus",
     :uri-template-args {"name" name, "operationId" operationId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-services-revisions-get
  "Gets information about a Revision.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/services/revisions/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://run.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-services-revisions-list
  "Lists Revisions from a given Service, or from a given location. Results are sorted by creation time, descending.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/services/revisions/list

parent <> 

optional:
pageSize <integer> Maximum number of revisions to return in this call.
showDeleted <boolean> If true, returns deleted (but unexpired) resources along with active ones."
  ([parent] (projects-locations-services-revisions-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://run.googleapis.com/v2/{+parent}/revisions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-services-revisions-delete
  "Deletes a Revision.
https://cloud.google.com/run/v2/reference/rest/v2/projects/locations/services/revisions/delete

name <> 

optional:
validateOnly <boolean> Indicates that the request should be validated without actually deleting any resources.
etag <string> A system-generated fingerprint for this version of the resource. This may be used to detect modification conflict during updates."
  ([name] (projects-locations-services-revisions-delete name nil))
  ([name optional]
    (client/api-request
      {:method :delete,
       :uri-template "https://run.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
