(ns happyapi.google.iam-v2
  "Identity and Access Management (IAM) API
Manages identity and access control for Google Cloud resources, including the creation of service accounts, which you can use to authenticate to Google and make API calls. Enabling this API also enables the IAM Service Account Credentials API (iamcredentials.googleapis.com). However, disabling this API doesn't disable the IAM Service Account Credentials API. 
See: https://cloud.google.com/security/products/iam")

(defn policies-listPolicies
  "Retrieves the policies of the specified kind that are attached to a resource. The response lists only policy metadata. In particular, policy rules are omitted.
https://cloud.google.com/security/products/iam/v2/reference/rest/v2/policies/listPolicies

parent <> 

optional:
pageSize <integer> The maximum number of policies to return. IAM ignores this value and uses the value 1000."
  ([parent] (policies-listPolicies parent nil))
  ([parent optional]
    {:method :get,
     :uri-template "https://iam.googleapis.com/v2/{+parent}",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn policies-get
  "Gets a policy.
https://cloud.google.com/security/products/iam/v2/reference/rest/v2/policies/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://iam.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn policies-createPolicy
  "Creates a policy.
https://cloud.google.com/security/products/iam/v2/reference/rest/v2/policies/createPolicy

parent <> 
GoogleIamV2Policy:
GoogleIamV2Policy

optional:
policyId <string> The ID to use for this policy, which will become the final component of the policy's resource name. The ID must contain 3 to 63 characters. It can contain lowercase letters and numbers, as well as dashes (`-`) and periods (`.`). The first character must be a lowercase letter."
  ([parent GoogleIamV2Policy]
    (policies-createPolicy parent GoogleIamV2Policy nil))
  ([parent GoogleIamV2Policy optional]
    {:method :post,
     :uri-template "https://iam.googleapis.com/v2/{+parent}",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleIamV2Policy}))

(defn policies-update
  "Updates the specified policy. You can update only the rules and the display name for the policy. To update a policy, you should use a read-modify-write loop: 1. Use GetPolicy to read the current version of the policy. 2. Modify the policy as needed. 3. Use `UpdatePolicy` to write the updated policy. This pattern helps prevent conflicts between concurrent updates.
https://cloud.google.com/security/products/iam/v2/reference/rest/v2/policies/update

name <> 
GoogleIamV2Policy:
GoogleIamV2Policy"
  [name GoogleIamV2Policy]
  {:method :put,
   :uri-template "https://iam.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleIamV2Policy})

(defn policies-delete
  "Deletes a policy. This action is permanent.
https://cloud.google.com/security/products/iam/v2/reference/rest/v2/policies/delete

name <> 

optional:
etag <string> Optional. The expected `etag` of the policy to delete. If the value does not match the value that is stored in IAM, the request fails with a `409` error code and `ABORTED` status. If you omit this field, the policy is deleted regardless of its current `etag`."
  ([name] (policies-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://iam.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn policies-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/security/products/iam/v2/reference/rest/v2/policies/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://iam.googleapis.com/v2/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})
