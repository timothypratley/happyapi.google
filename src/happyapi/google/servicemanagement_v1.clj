(ns happyapi.google.servicemanagement-v1
  "Service Management API
Google Service Management allows service producers to publish their services on Google Cloud Platform so that they can be discovered and used by service consumers.
See: https://cloud.google.com/service-infrastructure/docs"
  (:require [happyapi.providers.google :as client]))

(defn operations-list
  "Lists service operations that match the specified filter in the request.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/operations/list

optional:
name <string> Not used.
filter <string> A string for filtering Operations. The following filter fields are supported: * serviceName: Required. Only `=` operator is allowed. * startTime: The time this job was started, in ISO 8601 format. Allowed operators are `>=`, `>`, `<=`, and `<`. * status: Can be `done`, `in_progress`, or `failed`. Allowed operators are `=`, and `!=`. Filter expression supports conjunction (AND) and disjunction (OR) logical operators. However, the serviceName restriction must be at the top-level and can only be combined with other restrictions via the AND logical operator. Examples: * `serviceName={some-service}.googleapis.com` * `serviceName={some-service}.googleapis.com AND startTime>=\"2017-02-01\"` * `serviceName={some-service}.googleapis.com AND status=done` * `serviceName={some-service}.googleapis.com AND (status=done OR startTime>=\"2017-02-01\")`
pageSize <integer> The maximum number of operations to return. If unspecified, defaults to 50. The maximum value is 100."
  ([] (operations-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://servicemanagement.googleapis.com/v1/operations",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/service.management"]})))

(defn operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"]}))

(defn services-list
  "Lists managed services. Returns all public services. For authenticated users, also returns all services the calling user has \"servicemanagement.services.get\" permission for.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/list

optional:
producerProjectId <string> Include services produced by the specified project.
pageSize <integer> The max number of items to include in the response list. Page size is 50 if not specified. Maximum value is 500.
consumerId <string> Include services consumed by the specified consumer. The Google Service Management implementation accepts the following forms: - project:"
  ([] (services-list nil))
  ([optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://servicemanagement.googleapis.com/v1/services",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/service.management"
        "https://www.googleapis.com/auth/service.management.readonly"]})))

(defn services-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"],
     :body SetIamPolicyRequest}))

(defn services-delete
  "Deletes a managed service. This method will change the service to the `Soft-Delete` state for 30 days. Within this period, service producers may call UndeleteService to restore the service. After 30 days, the service will be permanently deleted. Operation
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/delete

serviceName <> "
  [serviceName]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/services/{serviceName}",
     :uri-template-args {"serviceName" serviceName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"]}))

(defn services-undelete
  "Revives a previously deleted managed service. The method restores the service using the configuration at the time the service was deleted. The target service must exist and must have been deleted within the last 30 days. Operation
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/undelete

serviceName <> "
  [serviceName]
  (client/api-request
    {:method :post,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/services/{serviceName}:undelete",
     :uri-template-args {"serviceName" serviceName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"]}))

(defn services-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/service.management"
      "https://www.googleapis.com/auth/service.management.readonly"],
     :body GetIamPolicyRequest}))

(defn services-create
  "Creates a new managed service. A managed service is immutable, and is subject to mandatory 30-day data retention. You cannot move a service or recreate it within 30 days after deletion. One producer project can own no more than 500 services. For security and reliability purposes, a production service should be hosted in a dedicated producer project. Operation
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/create

ManagedService:
ManagedService"
  [ManagedService]
  (client/api-request
    {:method :post,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/services",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"],
     :body ManagedService}))

(defn services-getConfig
  "Gets a service configuration (version) for a managed service.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/getConfig

serviceName <> 

optional:
configId <string> Required. The id of the service configuration resource. This field must be specified for the server to return all fields, including `SourceInfo`.
view <string> Specifies which parts of the Service Config should be returned in the response."
  ([serviceName] (services-getConfig serviceName nil))
  ([serviceName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://servicemanagement.googleapis.com/v1/services/{serviceName}/config",
       :uri-template-args {"serviceName" serviceName},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/service.management"
        "https://www.googleapis.com/auth/service.management.readonly"]})))

(defn services-get
  "Gets a managed service. Authentication is required unless the service is public.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/get

serviceName <> "
  [serviceName]
  (client/api-request
    {:method :get,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/services/{serviceName}",
     :uri-template-args {"serviceName" serviceName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/service.management"
      "https://www.googleapis.com/auth/service.management.readonly"]}))

(defn services-generateConfigReport
  "Generates and returns a report (errors, warnings and changes from existing configurations) associated with GenerateConfigReportRequest.new_value If GenerateConfigReportRequest.old_value is specified, GenerateConfigReportRequest will contain a single ChangeReport based on the comparison between GenerateConfigReportRequest.new_value and GenerateConfigReportRequest.old_value. If GenerateConfigReportRequest.old_value is not specified, this method will compare GenerateConfigReportRequest.new_value with the last pushed service configuration.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/generateConfigReport

GenerateConfigReportRequest:
GenerateConfigReportRequest"
  [GenerateConfigReportRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/services:generateConfigReport",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"],
     :body GenerateConfigReportRequest}))

(defn services-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/service.management"
      "https://www.googleapis.com/auth/service.management.readonly"],
     :body TestIamPermissionsRequest}))

(defn services-configs-list
  "Lists the history of the service configuration for a managed service, from the newest to the oldest.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/configs/list

serviceName <> 

optional:
pageSize <integer> The max number of items to include in the response list. Page size is 50 if not specified. Maximum value is 100."
  ([serviceName] (services-configs-list serviceName nil))
  ([serviceName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://servicemanagement.googleapis.com/v1/services/{serviceName}/configs",
       :uri-template-args {"serviceName" serviceName},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/service.management"
        "https://www.googleapis.com/auth/service.management.readonly"]})))

(defn services-configs-get
  "Gets a service configuration (version) for a managed service.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/configs/get

serviceName <> 
configId <> 

optional:
view <string> Specifies which parts of the Service Config should be returned in the response."
  ([serviceName configId]
    (services-configs-get serviceName configId nil))
  ([serviceName configId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://servicemanagement.googleapis.com/v1/services/{serviceName}/configs/{configId}",
       :uri-template-args
       {"serviceName" serviceName, "configId" configId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/service.management"
        "https://www.googleapis.com/auth/service.management.readonly"]})))

(defn services-configs-create
  "Creates a new service configuration (version) for a managed service. This method only stores the service configuration. To roll out the service configuration to backend systems please call CreateServiceRollout. Only the 100 most recent service configurations and ones referenced by existing rollouts are kept for each service. The rest will be deleted eventually.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/configs/create

serviceName <> 
Service:
Service"
  [serviceName Service]
  (client/api-request
    {:method :post,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/services/{serviceName}/configs",
     :uri-template-args {"serviceName" serviceName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"],
     :body Service}))

(defn services-configs-submit
  "Creates a new service configuration (version) for a managed service based on user-supplied configuration source files (for example: OpenAPI Specification). This method stores the source configurations as well as the generated service configuration. To rollout the service configuration to other services, please call CreateServiceRollout. Only the 100 most recent configuration sources and ones referenced by existing service configurtions are kept for each service. The rest will be deleted eventually. Operation
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/configs/submit

serviceName <> 
SubmitConfigSourceRequest:
SubmitConfigSourceRequest"
  [serviceName SubmitConfigSourceRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/services/{serviceName}/configs:submit",
     :uri-template-args {"serviceName" serviceName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"],
     :body SubmitConfigSourceRequest}))

(defn services-rollouts-list
  "Lists the history of the service configuration rollouts for a managed service, from the newest to the oldest.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/rollouts/list

serviceName <> 

optional:
pageSize <integer> The max number of items to include in the response list. Page size is 50 if not specified. Maximum value is 100.
filter <string> Required. Use `filter` to return subset of rollouts. The following filters are supported: -- By status. For example, `filter='status=SUCCESS'` -- By strategy. For example, `filter='strategy=TrafficPercentStrategy'`"
  ([serviceName] (services-rollouts-list serviceName nil))
  ([serviceName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://servicemanagement.googleapis.com/v1/services/{serviceName}/rollouts",
       :uri-template-args {"serviceName" serviceName},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/cloud-platform"
        "https://www.googleapis.com/auth/cloud-platform.read-only"
        "https://www.googleapis.com/auth/service.management"
        "https://www.googleapis.com/auth/service.management.readonly"]})))

(defn services-rollouts-get
  "Gets a service configuration rollout.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/rollouts/get

serviceName <> 
rolloutId <> "
  [serviceName rolloutId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/services/{serviceName}/rollouts/{rolloutId}",
     :uri-template-args
     {"serviceName" serviceName, "rolloutId" rolloutId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/service.management"
      "https://www.googleapis.com/auth/service.management.readonly"]}))

(defn services-rollouts-create
  "Creates a new service configuration rollout. Based on rollout, the Google Service Management will roll out the service configurations to different backend services. For example, the logging configuration will be pushed to Google Cloud Logging. Please note that any previous pending and running Rollouts and associated Operations will be automatically cancelled so that the latest Rollout will not be blocked by previous Rollouts. Only the 100 most recent (in any state) and the last 10 successful (if not already part of the set of 100 most recent) rollouts are kept for each service. The rest will be deleted eventually. Operation
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/rollouts/create

serviceName <> 
Rollout:
Rollout"
  [serviceName Rollout]
  (client/api-request
    {:method :post,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/services/{serviceName}/rollouts",
     :uri-template-args {"serviceName" serviceName},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"],
     :body Rollout}))

(defn services-consumers-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/consumers/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/service.management"],
     :body SetIamPolicyRequest}))

(defn services-consumers-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/consumers/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/{+resource}:getIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/service.management"
      "https://www.googleapis.com/auth/service.management.readonly"],
     :body GetIamPolicyRequest}))

(defn services-consumers-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/service-infrastructure/docs/v1/reference/rest/v1/services/consumers/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://servicemanagement.googleapis.com/v1/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-platform.read-only"
      "https://www.googleapis.com/auth/service.management"
      "https://www.googleapis.com/auth/service.management.readonly"],
     :body TestIamPermissionsRequest}))
