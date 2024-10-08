(ns happyapi.google.billingbudgets-v1
  "Cloud Billing Budget API
The Cloud Billing Budget API stores Cloud Billing budgets, which define a budget plan and the rules to execute as spend is tracked against that plan.
See: https://cloud.google.com/billing/docs/how-to/budget-api-overview")

(defn billingAccounts-budgets-delete
  "Deletes a budget. Returns successfully if already deleted.
https://cloud.google.com/billing/docs/how-to/budget-api-overview/v1/reference/rest/v1/billingAccounts/budgets/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://billingbudgets.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-billing"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn billingAccounts-budgets-list
  "Returns a list of budgets for a billing account. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. When reading from the API, you will not see these fields in the return value, though they may have been set in the Cloud Console.
https://cloud.google.com/billing/docs/how-to/budget-api-overview/v1/reference/rest/v1/billingAccounts/budgets/list

parent <> 

optional:
scope <string> Optional. Set the scope of the budgets to be returned, in the format of the resource name. The scope of a budget is the cost that it tracks, such as costs for a single project, or the costs for all projects in a folder. Only project scope (in the format of \"projects/project-id\" or \"projects/123\") is supported in this field. When this field is set to a project's resource name, the budgets returned are tracking the costs for that project.
pageSize <integer> Optional. The maximum number of budgets to return per page. The default and maximum value are 100."
  ([parent] (billingAccounts-budgets-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://billingbudgets.googleapis.com/v1/{+parent}/budgets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-billing"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn billingAccounts-budgets-patch
  "Updates a budget and returns the updated budget. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. Budget fields that are not exposed in this API will not be changed by this method.
https://cloud.google.com/billing/docs/how-to/budget-api-overview/v1/reference/rest/v1/billingAccounts/budgets/patch

name <> 
GoogleCloudBillingBudgetsV1Budget:
GoogleCloudBillingBudgetsV1Budget

optional:
updateMask <string> Optional. Indicates which fields in the provided budget to update. Read-only fields (such as `name`) cannot be changed. If this is not provided, then only fields with non-default values from the request are updated. See https://developers.google.com/protocol-buffers/docs/proto3#default for more details about default values."
  ([name GoogleCloudBillingBudgetsV1Budget]
    (billingAccounts-budgets-patch
      name
      GoogleCloudBillingBudgetsV1Budget
      nil))
  ([name GoogleCloudBillingBudgetsV1Budget optional]
    {:method :patch,
     :uri-template "https://billingbudgets.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-billing"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudBillingBudgetsV1Budget}))

(defn billingAccounts-budgets-get
  "Returns a budget. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. When reading from the API, you will not see these fields in the return value, though they may have been set in the Cloud Console.
https://cloud.google.com/billing/docs/how-to/budget-api-overview/v1/reference/rest/v1/billingAccounts/budgets/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://billingbudgets.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-billing"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn billingAccounts-budgets-create
  "Creates a new budget. See [Quotas and limits](https://cloud.google.com/billing/quotas) for more information on the limits of the number of budgets you can create.
https://cloud.google.com/billing/docs/how-to/budget-api-overview/v1/reference/rest/v1/billingAccounts/budgets/create

parent <> 
GoogleCloudBillingBudgetsV1Budget:
GoogleCloudBillingBudgetsV1Budget"
  [parent GoogleCloudBillingBudgetsV1Budget]
  {:method :post,
   :uri-template
   "https://billingbudgets.googleapis.com/v1/{+parent}/budgets",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-billing"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudBillingBudgetsV1Budget})
