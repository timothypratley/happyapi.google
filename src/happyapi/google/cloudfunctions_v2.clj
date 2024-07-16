(ns happyapi.google.cloudfunctions-v2
  "Cloud Functions API
Manages lightweight user-provided functions executed in response to events.
See: https://cloud.google.com/functions"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://cloudfunctions.googleapis.com/v2/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://cloudfunctions.googleapis.com/v2/{+name}/operations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/operations/get

name <> "
  [name]
  (client/api-request
    {:method :get,
     :uri-template "https://cloudfunctions.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-functions-commitFunctionUpgrade
  "Finalizes the upgrade after which function upgrade can not be rolled back. This is the last step of the multi step process to upgrade 1st Gen functions to 2nd Gen. Deletes all original 1st Gen related configuration and resources.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/commitFunctionUpgrade

name <> 
CommitFunctionUpgradeRequest:
CommitFunctionUpgradeRequest"
  [name CommitFunctionUpgradeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://cloudfunctions.googleapis.com/v2/{+name}:commitFunctionUpgrade",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CommitFunctionUpgradeRequest}))

(defn projects-locations-functions-list
  "Returns a list of functions that belong to the requested project.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/list

parent <> 

optional:
pageSize <integer> Maximum number of functions to return per call. The largest allowed page_size is 1,000, if the page_size is omitted or specified as greater than 1,000 then it will be replaced as 1,000. The size of the list response can be less than specified when used with filters.
filter <string> The filter for Functions that match the filter expression, following the syntax outlined in https://google.aip.dev/160.
orderBy <string> The sorting order of the resources returned. Value should be a comma separated list of fields. The default sorting oder is ascending. See https://google.aip.dev/132#ordering."
  ([parent] (projects-locations-functions-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://cloudfunctions.googleapis.com/v2/{+parent}/functions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-functions-setIamPolicy
  "Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://cloudfunctions.googleapis.com/v2/{+resource}:setIamPolicy",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetIamPolicyRequest}))

(defn projects-locations-functions-delete
  "Deletes a function with the given name from the specified project. If the given function is used by some trigger, the trigger will be updated to remove this function.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/delete

name <> "
  [name]
  (client/api-request
    {:method :delete,
     :uri-template "https://cloudfunctions.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-functions-generateUploadUrl
  "Returns a signed URL for uploading a function source code. For more information about the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls. Once the function source code upload is complete, the used signed URL should be provided in CreateFunction or UpdateFunction request as a reference to the function source code. When uploading source code to the generated signed URL, please follow these restrictions: * Source file type should be a zip file. * No credentials should be attached - the signed URLs provide access to the target bucket using internal service identity; if credentials were attached, the identity from the credentials would be used, but that identity does not have permissions to upload files to the URL. When making a HTTP PUT request, specify this header: * `content-type: application/zip` Do not specify this header: * `Authorization: Bearer YOUR_TOKEN`
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/generateUploadUrl

parent <> 
GenerateUploadUrlRequest:
GenerateUploadUrlRequest"
  [parent GenerateUploadUrlRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://cloudfunctions.googleapis.com/v2/{+parent}/functions:generateUploadUrl",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GenerateUploadUrlRequest}))

(defn projects-locations-functions-abortFunctionUpgrade
  "Aborts generation upgrade process for a function with the given name from the specified project. Deletes all 2nd Gen copy related configuration and resources which were created during the upgrade process.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/abortFunctionUpgrade

name <> 
AbortFunctionUpgradeRequest:
AbortFunctionUpgradeRequest"
  [name AbortFunctionUpgradeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://cloudfunctions.googleapis.com/v2/{+name}:abortFunctionUpgrade",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body AbortFunctionUpgradeRequest}))

(defn projects-locations-functions-rollbackFunctionUpgradeTraffic
  "Reverts the traffic target of a function from the 2nd Gen copy to the original 1st Gen function. After this operation, all new traffic would be served by the 1st Gen.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/rollbackFunctionUpgradeTraffic

name <> 
RollbackFunctionUpgradeTrafficRequest:
RollbackFunctionUpgradeTrafficRequest"
  [name RollbackFunctionUpgradeTrafficRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://cloudfunctions.googleapis.com/v2/{+name}:rollbackFunctionUpgradeTraffic",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RollbackFunctionUpgradeTrafficRequest}))

(defn projects-locations-functions-patch
  "Updates existing function.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/patch

name <> 
Function:
Function

optional:
updateMask <string> The list of fields to be updated. If no field mask is provided, all provided fields in the request will be updated."
  ([name Function]
    (projects-locations-functions-patch name Function nil))
  ([name Function optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://cloudfunctions.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Function})))

(defn projects-locations-functions-generateDownloadUrl
  "Returns a signed URL for downloading deployed function source code. The URL is only valid for a limited period and should be used within 30 minutes of generation. For more information about the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/generateDownloadUrl

name <> 
GenerateDownloadUrlRequest:
GenerateDownloadUrlRequest"
  [name GenerateDownloadUrlRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://cloudfunctions.googleapis.com/v2/{+name}:generateDownloadUrl",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GenerateDownloadUrlRequest}))

(defn projects-locations-functions-getIamPolicy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/getIamPolicy

resource <> 

optional:
options.requestedPolicyVersion <integer> Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies)."
  ([resource] (projects-locations-functions-getIamPolicy resource nil))
  ([resource optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://cloudfunctions.googleapis.com/v2/{+resource}:getIamPolicy",
       :uri-template-args {"resource" resource},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-functions-redirectFunctionUpgradeTraffic
  "Changes the traffic target of a function from the original 1st Gen function to the 2nd Gen copy. This is the second step of the multi step process to upgrade 1st Gen functions to 2nd Gen. After this operation, all new traffic will be served by 2nd Gen copy.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/redirectFunctionUpgradeTraffic

name <> 
RedirectFunctionUpgradeTrafficRequest:
RedirectFunctionUpgradeTrafficRequest"
  [name RedirectFunctionUpgradeTrafficRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://cloudfunctions.googleapis.com/v2/{+name}:redirectFunctionUpgradeTraffic",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body RedirectFunctionUpgradeTrafficRequest}))

(defn projects-locations-functions-create
  "Creates a new function. If a function with the given name already exists in the specified project, the long running operation will return `ALREADY_EXISTS` error.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/create

parent <> 
Function:
Function

optional:
functionId <string> The ID to use for the function, which will become the final component of the function's resource name. This value should be 4-63 characters, and valid characters are /a-z-/."
  ([parent Function]
    (projects-locations-functions-create parent Function nil))
  ([parent Function optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://cloudfunctions.googleapis.com/v2/{+parent}/functions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"],
       :body Function})))

(defn projects-locations-functions-setupFunctionUpgradeConfig
  "Creates a 2nd Gen copy of the function configuration based on the 1st Gen function with the given name. This is the first step of the multi step process to upgrade 1st Gen functions to 2nd Gen. Only 2nd Gen configuration is setup as part of this request and traffic continues to be served by 1st Gen.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/setupFunctionUpgradeConfig

name <> 
SetupFunctionUpgradeConfigRequest:
SetupFunctionUpgradeConfigRequest"
  [name SetupFunctionUpgradeConfigRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://cloudfunctions.googleapis.com/v2/{+name}:setupFunctionUpgradeConfig",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body SetupFunctionUpgradeConfigRequest}))

(defn projects-locations-functions-get
  "Returns a function with the given name from the requested project.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/get

name <> 

optional:
revision <string> Optional. The optional version of the 1st gen function whose details should be obtained. The version of a 1st gen function is an integer that starts from 1 and gets incremented on redeployments. GCF may keep historical configs for old versions of 1st gen function. This field can be specified to fetch the historical configs. This field is valid only for GCF 1st gen function."
  ([name] (projects-locations-functions-get name nil))
  ([name optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://cloudfunctions.googleapis.com/v2/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-functions-testIamPermissions
  "Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may \"fail open\" without warning.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/functions/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://cloudfunctions.googleapis.com/v2/{+resource}:testIamPermissions",
     :uri-template-args {"resource" resource},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body TestIamPermissionsRequest}))

(defn projects-locations-runtimes-list
  "Returns a list of runtimes that are supported for the requested project.
https://cloud.google.com/functions/v2/reference/rest/v2/projects/locations/runtimes/list

parent <> 

optional:
filter <string> The filter for Runtimes that match the filter expression, following the syntax outlined in https://google.aip.dev/160."
  ([parent] (projects-locations-runtimes-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://cloudfunctions.googleapis.com/v2/{+parent}/runtimes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
