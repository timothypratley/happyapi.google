(ns happyapi.google.policytroubleshooter-v1
  "Policy Troubleshooter API

See: https://cloud.google.com/security/products/iam"
  (:require [happyapi.providers.google :as client]))

(defn iam-troubleshoot
  "Checks whether a principal has a specific permission for a specific resource, and explains why the principal does or does not have that permission.
https://cloud.google.com/security/products/iam/v1/reference/rest/v1/iam/troubleshoot

GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest:
GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest"
  [GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://policytroubleshooter.googleapis.com/v1/iam:troubleshoot",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body
     GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyRequest}))
