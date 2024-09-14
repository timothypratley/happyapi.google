(ns happyapi.google.analyticshub-v1
  "Analytics Hub API
Exchange data and analytics assets securely and efficiently.
See: https://cloud.google.com/bigquery/docs/analytics-hub-introduction")

(defn projects-locations-dataExchanges-list
  "Lists all data exchanges in a given project and location.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection."
  ([parent] (projects-locations-dataExchanges-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://analyticshub.googleapis.com/v1/{+parent}/dataExchanges",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataExchanges-setIamPolicy
  "Sets the IAM policy.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://analyticshub.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-dataExchanges-delete
  "Deletes an existing data exchange.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://analyticshub.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-dataExchanges-patch
  "Updates an existing data exchange.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/patch

name <> 
DataExchange:
DataExchange

optional:
updateMask <string> Required. Field mask specifies the fields to update in the data exchange resource. The fields specified in the `updateMask` are relative to the resource and are not a full request."
  ([name DataExchange]
    (projects-locations-dataExchanges-patch name DataExchange nil))
  ([name DataExchange optional]
    {:method :patch,
     :uri-template "https://analyticshub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body DataExchange}))

(defn projects-locations-dataExchanges-getIamPolicy
  "Gets the IAM policy.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://analyticshub.googleapis.com/v1/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body GetIamPolicyRequest})

(defn projects-locations-dataExchanges-create
  "Creates a new data exchange.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/create

parent <> 
DataExchange:
DataExchange

optional:
dataExchangeId <string> Required. The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Max length: 100 bytes."
  ([parent DataExchange]
    (projects-locations-dataExchanges-create parent DataExchange nil))
  ([parent DataExchange optional]
    {:method :post,
     :uri-template
     "https://analyticshub.googleapis.com/v1/{+parent}/dataExchanges",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body DataExchange}))

(defn projects-locations-dataExchanges-subscribe
  "Creates a Subscription to a Data Clean Room. This is a long-running operation as it will create one or more linked datasets.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/subscribe

name <> 
SubscribeDataExchangeRequest:
SubscribeDataExchangeRequest"
  [name SubscribeDataExchangeRequest]
  {:method :post,
   :uri-template
   "https://analyticshub.googleapis.com/v1/{+name}:subscribe",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SubscribeDataExchangeRequest})

(defn projects-locations-dataExchanges-get
  "Gets the details of a data exchange.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://analyticshub.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-dataExchanges-testIamPermissions
  "Returns the permissions that a caller has.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://analyticshub.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-dataExchanges-listSubscriptions
  "Lists all subscriptions on a given Data Exchange or Listing.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/listSubscriptions

resource <> 

optional:
includeDeletedSubscriptions <boolean> If selected, includes deleted subscriptions in the response (up to 63 days after deletion).
pageSize <integer> The maximum number of results to return in a single response page."
  ([resource]
    (projects-locations-dataExchanges-listSubscriptions resource nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://analyticshub.googleapis.com/v1/{+resource}:listSubscriptions",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataExchanges-listings-list
  "Lists all listings in a given project and location.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/listings/list

parent <> 

optional:
pageSize <integer> The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection."
  ([parent]
    (projects-locations-dataExchanges-listings-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://analyticshub.googleapis.com/v1/{+parent}/listings",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-dataExchanges-listings-setIamPolicy
  "Sets the IAM policy.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/listings/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://analyticshub.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn projects-locations-dataExchanges-listings-delete
  "Deletes a listing.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/listings/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://analyticshub.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-dataExchanges-listings-patch
  "Updates an existing listing.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/listings/patch

name <> 
Listing:
Listing

optional:
updateMask <string> Required. Field mask specifies the fields to update in the listing resource. The fields specified in the `updateMask` are relative to the resource and are not a full request."
  ([name Listing]
    (projects-locations-dataExchanges-listings-patch name Listing nil))
  ([name Listing optional]
    {:method :patch,
     :uri-template "https://analyticshub.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body Listing}))

(defn projects-locations-dataExchanges-listings-getIamPolicy
  "Gets the IAM policy.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/listings/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://analyticshub.googleapis.com/v1/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body GetIamPolicyRequest})

(defn projects-locations-dataExchanges-listings-create
  "Creates a new listing.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/listings/create

parent <> 
Listing:
Listing

optional:
listingId <string> Required. The ID of the listing to create. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Max length: 100 bytes."
  ([parent Listing]
    (projects-locations-dataExchanges-listings-create
      parent
      Listing
      nil))
  ([parent Listing optional]
    {:method :post,
     :uri-template
     "https://analyticshub.googleapis.com/v1/{+parent}/listings",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"],
     :body Listing}))

(defn projects-locations-dataExchanges-listings-subscribe
  "Subscribes to a listing. Currently, with Analytics Hub, you can create listings that reference only BigQuery datasets. Upon subscription to a listing for a BigQuery dataset, Analytics Hub creates a linked dataset in the subscriber's project.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/listings/subscribe

name <> 
SubscribeListingRequest:
SubscribeListingRequest"
  [name SubscribeListingRequest]
  {:method :post,
   :uri-template
   "https://analyticshub.googleapis.com/v1/{+name}:subscribe",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SubscribeListingRequest})

(defn projects-locations-dataExchanges-listings-get
  "Gets the details of a listing.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/listings/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://analyticshub.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-dataExchanges-listings-testIamPermissions
  "Returns the permissions that a caller has.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/listings/testIamPermissions

resource <> 
TestIamPermissionsRequest:
TestIamPermissionsRequest"
  [resource TestIamPermissionsRequest]
  {:method :post,
   :uri-template
   "https://analyticshub.googleapis.com/v1/{+resource}:testIamPermissions",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body TestIamPermissionsRequest})

(defn projects-locations-dataExchanges-listings-listSubscriptions
  "Lists all subscriptions on a given Data Exchange or Listing.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/dataExchanges/listings/listSubscriptions

resource <> 

optional:
includeDeletedSubscriptions <boolean> If selected, includes deleted subscriptions in the response (up to 63 days after deletion).
pageSize <integer> The maximum number of results to return in a single response page."
  ([resource]
    (projects-locations-dataExchanges-listings-listSubscriptions
      resource
      nil))
  ([resource optional]
    {:method :get,
     :uri-template
     "https://analyticshub.googleapis.com/v1/{+resource}:listSubscriptions",
     :uri-template-args {"resource" resource},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-subscriptions-refresh
  "Refreshes a Subscription to a Data Exchange. A Data Exchange can become stale when a publisher adds or removes data. This is a long-running operation as it may create many linked datasets.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/subscriptions/refresh

name <> 
RefreshSubscriptionRequest:
RefreshSubscriptionRequest"
  [name RefreshSubscriptionRequest]
  {:method :post,
   :uri-template
   "https://analyticshub.googleapis.com/v1/{+name}:refresh",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body RefreshSubscriptionRequest})

(defn projects-locations-subscriptions-get
  "Gets the details of a Subscription.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/subscriptions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://analyticshub.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-subscriptions-list
  "Lists all subscriptions in a given project and location.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/subscriptions/list

parent <> 

optional:
filter <string> An expression for filtering the results of the request. Eligible fields for filtering are: + `listing` + `data_exchange` Alternatively, a literal wrapped in double quotes may be provided. This will be checked for an exact match against both fields above. In all cases, the full Data Exchange or Listing resource name must be provided. Some example of using filters: + data_exchange=\"projects/myproject/locations/us/dataExchanges/123\" + listing=\"projects/123/locations/us/dataExchanges/456/listings/789\" + \"projects/myproject/locations/us/dataExchanges/123\"
pageSize <integer> The maximum number of results to return in a single response page."
  ([parent] (projects-locations-subscriptions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://analyticshub.googleapis.com/v1/{+parent}/subscriptions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-subscriptions-revoke
  "Revokes a given subscription.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/subscriptions/revoke

name <> 
RevokeSubscriptionRequest:
RevokeSubscriptionRequest"
  [name RevokeSubscriptionRequest]
  {:method :post,
   :uri-template
   "https://analyticshub.googleapis.com/v1/{+name}:revoke",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body RevokeSubscriptionRequest})

(defn projects-locations-subscriptions-delete
  "Deletes a subscription.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/subscriptions/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://analyticshub.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-subscriptions-getIamPolicy
  "Gets the IAM policy.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/subscriptions/getIamPolicy

resource <> 
GetIamPolicyRequest:
GetIamPolicyRequest"
  [resource GetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://analyticshub.googleapis.com/v1/{+resource}:getIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body GetIamPolicyRequest})

(defn projects-locations-subscriptions-setIamPolicy
  "Sets the IAM policy.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/projects/locations/subscriptions/setIamPolicy

resource <> 
SetIamPolicyRequest:
SetIamPolicyRequest"
  [resource SetIamPolicyRequest]
  {:method :post,
   :uri-template
   "https://analyticshub.googleapis.com/v1/{+resource}:setIamPolicy",
   :uri-template-args {"resource" resource},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/bigquery"
    "https://www.googleapis.com/auth/cloud-platform"],
   :body SetIamPolicyRequest})

(defn organizations-locations-dataExchanges-list
  "Lists all data exchanges from projects in a given organization and location.
https://cloud.google.com/bigquery/docs/analytics-hub-introduction/v1/reference/rest/v1/organizations/locations/dataExchanges/list

organization <> 

optional:
pageSize <integer> The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection."
  ([organization]
    (organizations-locations-dataExchanges-list organization nil))
  ([organization optional]
    {:method :get,
     :uri-template
     "https://analyticshub.googleapis.com/v1/{+organization}/dataExchanges",
     :uri-template-args {"organization" organization},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/bigquery"
      "https://www.googleapis.com/auth/cloud-platform"]}))
