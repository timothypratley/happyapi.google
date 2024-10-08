(ns happyapi.google.cloudchannel-v1
  "Cloud Channel API
The Cloud Channel API enables Google Cloud partners to have a single unified resale platform and APIs across all of Google Cloud including GCP, Workspace, Maps and Chrome.
See: https://cloud.google.com/channel/docs")

(defn operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"]})

(defn operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"]})

(defn operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/operations/cancel

name <> 
GoogleLongrunningCancelOperationRequest:
GoogleLongrunningCancelOperationRequest"
  [name GoogleLongrunningCancelOperationRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleLongrunningCancelOperationRequest})

(defn accounts-checkCloudIdentityAccountsExist
  "Confirms the existence of Cloud Identity accounts based on the domain and if the Cloud Identity accounts are owned by the reseller. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * INVALID_VALUE: Invalid domain value in the request. Return value: A list of CloudIdentityCustomerAccount resources for the domain (may be empty) Note: in the v1alpha1 version of the API, a NOT_FOUND error returns if no CloudIdentityCustomerAccount resources match the domain.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/checkCloudIdentityAccountsExist

parent <> 
GoogleCloudChannelV1CheckCloudIdentityAccountsExistRequest:
GoogleCloudChannelV1CheckCloudIdentityAccountsExistRequest"
  [parent GoogleCloudChannelV1CheckCloudIdentityAccountsExistRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+parent}:checkCloudIdentityAccountsExist",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1CheckCloudIdentityAccountsExistRequest})

(defn accounts-listTransferableSkus
  "List TransferableSkus of a customer based on the Cloud Identity ID or Customer Name in the request. Use this method to list the entitlements information of an unowned customer. You should provide the customer's Cloud Identity ID or Customer Name. Possible error codes: * PERMISSION_DENIED: * The customer doesn't belong to the reseller and has no auth token. * The supplied auth token is invalid. * The reseller account making the request is different from the reseller account in the query. * INVALID_ARGUMENT: Required request parameters are missing or invalid. Return value: A list of the customer's TransferableSku.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/listTransferableSkus

parent <> 
GoogleCloudChannelV1ListTransferableSkusRequest:
GoogleCloudChannelV1ListTransferableSkusRequest"
  [parent GoogleCloudChannelV1ListTransferableSkusRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+parent}:listTransferableSkus",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1ListTransferableSkusRequest})

(defn accounts-listTransferableOffers
  "List TransferableOffers of a customer based on Cloud Identity ID or Customer Name in the request. Use this method when a reseller gets the entitlement information of an unowned customer. The reseller should provide the customer's Cloud Identity ID or Customer Name. Possible error codes: * PERMISSION_DENIED: * The customer doesn't belong to the reseller and has no auth token. * The customer provided incorrect reseller information when generating auth token. * The reseller account making the request is different from the reseller account in the query. * The reseller is not authorized to transact on this Product. See https://support.google.com/channelservices/answer/9759265 * INVALID_ARGUMENT: Required request parameters are missing or invalid. Return value: List of TransferableOffer for the given customer and SKU.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/listTransferableOffers

parent <> 
GoogleCloudChannelV1ListTransferableOffersRequest:
GoogleCloudChannelV1ListTransferableOffersRequest"
  [parent GoogleCloudChannelV1ListTransferableOffersRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+parent}:listTransferableOffers",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1ListTransferableOffersRequest})

(defn accounts-register
  "Registers a service account with subscriber privileges on the Cloud Pub/Sub topic for this Channel Services account. After you create a subscriber, you get the events through SubscriberEvent Possible error codes: * PERMISSION_DENIED: The reseller account making the request and the provided reseller account are different, or the impersonated user is not a super admin. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The topic name with the registered service email address.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/register

account <> 
GoogleCloudChannelV1RegisterSubscriberRequest:
GoogleCloudChannelV1RegisterSubscriberRequest"
  [account GoogleCloudChannelV1RegisterSubscriberRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+account}:register",
   :uri-template-args {"account" account},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1RegisterSubscriberRequest})

(defn accounts-unregister
  "Unregisters a service account with subscriber privileges on the Cloud Pub/Sub topic created for this Channel Services account. If there are no service accounts left with subscriber privileges, this deletes the topic. You can call ListSubscribers to check for these accounts. Possible error codes: * PERMISSION_DENIED: The reseller account making the request and the provided reseller account are different, or the impersonated user is not a super admin. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The topic resource doesn't exist. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The topic name that unregistered the service email address. Returns a success response if the service email address wasn't registered with the topic.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/unregister

account <> 
GoogleCloudChannelV1UnregisterSubscriberRequest:
GoogleCloudChannelV1UnregisterSubscriberRequest"
  [account GoogleCloudChannelV1UnregisterSubscriberRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+account}:unregister",
   :uri-template-args {"account" account},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1UnregisterSubscriberRequest})

(defn accounts-listSubscribers
  "Lists service accounts with subscriber privileges on the Cloud Pub/Sub topic created for this Channel Services account. Possible error codes: * PERMISSION_DENIED: The reseller account making the request and the provided reseller account are different, or the impersonated user is not a super admin. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The topic resource doesn't exist. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: A list of service email addresses.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/listSubscribers

account <> 

optional:
pageSize <integer> Optional. The maximum number of service accounts to return. The service may return fewer than this value. If unspecified, returns at most 100 service accounts. The maximum value is 1000; the server will coerce values above 1000.
integrator <string> Optional. Resource name of the integrator."
  ([account] (accounts-listSubscribers account nil))
  ([account optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+account}:listSubscribers",
     :uri-template-args {"account" account},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-reports-run
  "Begins generation of data for a given report. The report identifier is a UID (for example, `613bf59q`). Possible error codes: * PERMISSION_DENIED: The user doesn't have access to this report. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The report identifier was not found. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata contains an instance of OperationMetadata. To get the results of report generation, call CloudChannelReportsService.FetchReportResults with the RunReportJobResponse.report_job. Deprecated: Please use [Export Channel Services data to BigQuery](https://cloud.google.com/channel/docs/rebilling/export-data-to-bigquery) instead.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/reports/run

name <> 
GoogleCloudChannelV1RunReportJobRequest:
GoogleCloudChannelV1RunReportJobRequest"
  [name GoogleCloudChannelV1RunReportJobRequest]
  {:method :post,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}:run",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/apps.reports.usage.readonly"],
   :body GoogleCloudChannelV1RunReportJobRequest})

(defn accounts-reports-list
  "Lists the reports that RunReportJob can run. These reports include an ID, a description, and the list of columns that will be in the result. Deprecated: Please use [Export Channel Services data to BigQuery](https://cloud.google.com/channel/docs/rebilling/export-data-to-bigquery) instead.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/reports/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size of the report. The server might return fewer results than requested. If unspecified, returns 20 reports. The maximum value is 100.
languageCode <string> Optional. The BCP-47 language code, such as \"en-US\". If specified, the response is localized to the corresponding language code if the original data sources support it. Default is \"en-US\"."
  ([parent] (accounts-reports-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+parent}/reports",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/apps.reports.usage.readonly"]}))

(defn accounts-reportJobs-fetchReportResults
  "Retrieves data generated by CloudChannelReportsService.RunReportJob. Deprecated: Please use [Export Channel Services data to BigQuery](https://cloud.google.com/channel/docs/rebilling/export-data-to-bigquery) instead.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/reportJobs/fetchReportResults

reportJob <> 
GoogleCloudChannelV1FetchReportResultsRequest:
GoogleCloudChannelV1FetchReportResultsRequest"
  [reportJob GoogleCloudChannelV1FetchReportResultsRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+reportJob}:fetchReportResults",
   :uri-template-args {"reportJob" reportJob},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/apps.reports.usage.readonly"],
   :body GoogleCloudChannelV1FetchReportResultsRequest})

(defn accounts-customers-listPurchasableOffers
  "Lists the following: * Offers that you can purchase for a customer. * Offers that you can change for an entitlement. Possible error codes: * PERMISSION_DENIED: * The customer doesn't belong to the reseller * The reseller is not authorized to transact on this Product. See https://support.google.com/channelservices/answer/9759265 * INVALID_ARGUMENT: Required request parameters are missing or invalid.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/listPurchasableOffers

customer <> 

optional:
changeOfferPurchase.billingAccount <string> Optional. Resource name of the new target Billing Account. Provide this Billing Account when setting up billing for a trial subscription. Format: accounts/{account_id}/billingAccounts/{billing_account_id}. This field is only relevant for multi-currency accounts. It should be left empty for single currency accounts.
createEntitlementPurchase.sku <string> Required. SKU that the result should be restricted to. Format: products/{product_id}/skus/{sku_id}.
changeOfferPurchase.entitlement <string> Required. Resource name of the entitlement. Format: accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}
changeOfferPurchase.newSku <string> Optional. Resource name of the new target SKU. Provide this SKU when upgrading or downgrading an entitlement. Format: products/{product_id}/skus/{sku_id}
languageCode <string> Optional. The BCP-47 language code. For example, \"en-US\". The response will localize in the corresponding language code, if specified. The default value is \"en-US\".
pageSize <integer> Optional. Requested page size. Server might return fewer results than requested. If unspecified, returns at most 100 Offers. The maximum value is 1000; the server will coerce values above 1000.
createEntitlementPurchase.billingAccount <string> Optional. Billing account that the result should be restricted to. Format: accounts/{account_id}/billingAccounts/{billing_account_id}."
  ([customer] (accounts-customers-listPurchasableOffers customer nil))
  ([customer optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+customer}:listPurchasableOffers",
     :uri-template-args {"customer" customer},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-customers-list
  "List Customers. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. Return value: List of Customers, or an empty list if there are no customers.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of customers to return. The service may return fewer than this value. If unspecified, returns at most 10 customers. The maximum value is 50.
filter <string> Optional. Filters applied to the [CloudChannelService.ListCustomers] results. See https://cloud.google.com/channel/docs/concepts/google-cloud/filter-customers for more information."
  ([parent] (accounts-customers-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+parent}/customers",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-customers-delete
  "Deletes the given Customer permanently. Possible error codes: * PERMISSION_DENIED: The account making the request does not own this customer. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * FAILED_PRECONDITION: The customer has existing entitlements. * NOT_FOUND: No Customer resource found for the name in the request.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"]})

(defn accounts-customers-transferEntitlements
  "Transfers customer entitlements to new reseller. Possible error codes: * PERMISSION_DENIED: * The customer doesn't belong to the reseller. * The reseller is not authorized to transact on this Product. See https://support.google.com/channelservices/answer/9759265 * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The customer or offer resource was not found. * ALREADY_EXISTS: The SKU was already transferred for the customer. * CONDITION_NOT_MET or FAILED_PRECONDITION: * The SKU requires domain verification to transfer, but the domain is not verified. * An Add-On SKU (example, Vault or Drive) is missing the pre-requisite SKU (example, G Suite Basic). * (Developer accounts only) Reseller and resold domain must meet the following naming requirements: * Domain names must start with goog-test. * Domain names must include the reseller domain. * Specify all transferring entitlements. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/transferEntitlements

parent <> 
GoogleCloudChannelV1TransferEntitlementsRequest:
GoogleCloudChannelV1TransferEntitlementsRequest"
  [parent GoogleCloudChannelV1TransferEntitlementsRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+parent}:transferEntitlements",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1TransferEntitlementsRequest})

(defn accounts-customers-listPurchasableSkus
  "Lists the following: * SKUs that you can purchase for a customer * SKUs that you can upgrade or downgrade for an entitlement. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/listPurchasableSkus

customer <> 

optional:
createEntitlementPurchase.product <string> Required. List SKUs belonging to this Product. Format: products/{product_id}. Supports products/- to retrieve SKUs for all products.
changeOfferPurchase.entitlement <string> Required. Resource name of the entitlement. Format: accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}
changeOfferPurchase.changeType <string> Required. Change Type for the entitlement.
pageSize <integer> Optional. Requested page size. Server might return fewer results than requested. If unspecified, returns at most 100 SKUs. The maximum value is 1000; the server will coerce values above 1000.
languageCode <string> Optional. The BCP-47 language code. For example, \"en-US\". The response will localize in the corresponding language code, if specified. The default value is \"en-US\"."
  ([customer] (accounts-customers-listPurchasableSkus customer nil))
  ([customer optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+customer}:listPurchasableSkus",
     :uri-template-args {"customer" customer},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-customers-transferEntitlementsToGoogle
  "Transfers customer entitlements from their current reseller to Google. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The customer or offer resource was not found. * ALREADY_EXISTS: The SKU was already transferred for the customer. * CONDITION_NOT_MET or FAILED_PRECONDITION: * The SKU requires domain verification to transfer, but the domain is not verified. * An Add-On SKU (example, Vault or Drive) is missing the pre-requisite SKU (example, G Suite Basic). * (Developer accounts only) Reseller and resold domain must meet the following naming requirements: * Domain names must start with goog-test. * Domain names must include the reseller domain. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The response will contain google.protobuf.Empty on success. The Operation metadata will contain an instance of OperationMetadata.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/transferEntitlementsToGoogle

parent <> 
GoogleCloudChannelV1TransferEntitlementsToGoogleRequest:
GoogleCloudChannelV1TransferEntitlementsToGoogleRequest"
  [parent GoogleCloudChannelV1TransferEntitlementsToGoogleRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+parent}:transferEntitlementsToGoogle",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1TransferEntitlementsToGoogleRequest})

(defn accounts-customers-provisionCloudIdentity
  "Creates a Cloud Identity for the given customer using the customer's information, or the information provided here. Possible error codes: * PERMISSION_DENIED: * The customer doesn't belong to the reseller. * You are not authorized to provision cloud identity id. See https://support.google.com/channelservices/answer/9759265 * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The customer was not found. * ALREADY_EXISTS: The customer's primary email already exists. Retry after changing the customer's primary contact email. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata contains an instance of OperationMetadata.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/provisionCloudIdentity

customer <> 
GoogleCloudChannelV1ProvisionCloudIdentityRequest:
GoogleCloudChannelV1ProvisionCloudIdentityRequest"
  [customer GoogleCloudChannelV1ProvisionCloudIdentityRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+customer}:provisionCloudIdentity",
   :uri-template-args {"customer" customer},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1ProvisionCloudIdentityRequest})

(defn accounts-customers-import
  "Imports a Customer from the Cloud Identity associated with the provided Cloud Identity ID or domain before a TransferEntitlements call. If a linked Customer already exists and overwrite_if_exists is true, it will update that Customer's data. Possible error codes: * PERMISSION_DENIED: * The reseller account making the request is different from the reseller account in the API request. * You are not authorized to import the customer. See https://support.google.com/channelservices/answer/9759265 * NOT_FOUND: Cloud Identity doesn't exist or was deleted. * INVALID_ARGUMENT: Required parameters are missing, or the auth_token is expired or invalid. * ALREADY_EXISTS: A customer already exists and has conflicting critical fields. Requires an overwrite. Return value: The Customer.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/import

parent <> 
GoogleCloudChannelV1ImportCustomerRequest:
GoogleCloudChannelV1ImportCustomerRequest"
  [parent GoogleCloudChannelV1ImportCustomerRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+parent}/customers:import",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1ImportCustomerRequest})

(defn accounts-customers-patch
  "Updates an existing Customer resource for the reseller or distributor. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: No Customer resource found for the name in the request. Return value: The updated Customer resource.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/patch

name <> 
GoogleCloudChannelV1Customer:
GoogleCloudChannelV1Customer

optional:
updateMask <string> The update mask that applies to the resource. Optional."
  ([name GoogleCloudChannelV1Customer]
    (accounts-customers-patch name GoogleCloudChannelV1Customer nil))
  ([name GoogleCloudChannelV1Customer optional]
    {:method :patch,
     :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"],
     :body GoogleCloudChannelV1Customer}))

(defn accounts-customers-create
  "Creates a new Customer resource under the reseller or distributor account. Possible error codes: * PERMISSION_DENIED: * The reseller account making the request is different from the reseller account in the API request. * You are not authorized to create a customer. See https://support.google.com/channelservices/answer/9759265 * INVALID_ARGUMENT: * Required request parameters are missing or invalid. * Domain field value doesn't match the primary email domain. Return value: The newly created Customer resource.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/create

parent <> 
GoogleCloudChannelV1Customer:
GoogleCloudChannelV1Customer"
  [parent GoogleCloudChannelV1Customer]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+parent}/customers",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1Customer})

(defn accounts-customers-get
  "Returns the requested Customer resource. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The customer resource doesn't exist. Usually the result of an invalid name parameter. Return value: The Customer resource.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"]})

(defn accounts-customers-queryEligibleBillingAccounts
  "Lists the billing accounts that are eligible to purchase particular SKUs for a given customer. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. Return value: Based on the provided list of SKUs, returns a list of SKU groups that must be purchased using the same billing account and the billing accounts eligible to purchase each SKU group.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/queryEligibleBillingAccounts

customer <> 

optional:
skus <string> Required. List of SKUs to list eligible billing accounts for. At least one SKU is required. Format: products/{product_id}/skus/{sku_id}."
  ([customer]
    (accounts-customers-queryEligibleBillingAccounts customer nil))
  ([customer optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+customer}:queryEligibleBillingAccounts",
     :uri-template-args {"customer" customer},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-customers-entitlements-list
  "Lists Entitlements belonging to a customer. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. Return value: A list of the customer's Entitlements.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/entitlements/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server might return fewer results than requested. If unspecified, return at most 50 entitlements. The maximum value is 100; the server will coerce values above 100."
  ([parent] (accounts-customers-entitlements-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+parent}/entitlements",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-customers-entitlements-startPaidService
  "Starts paid service for a trial entitlement. Starts paid service for a trial entitlement immediately. This method is only applicable if a plan is set up for a trial entitlement but has some trial days remaining. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Entitlement resource not found. * FAILED_PRECONDITION/NOT_IN_TRIAL: This method only works for entitlement on trial plans. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/entitlements/startPaidService

name <> 
GoogleCloudChannelV1StartPaidServiceRequest:
GoogleCloudChannelV1StartPaidServiceRequest"
  [name GoogleCloudChannelV1StartPaidServiceRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+name}:startPaidService",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1StartPaidServiceRequest})

(defn accounts-customers-entitlements-cancel
  "Cancels a previously fulfilled entitlement. An entitlement cancellation is a long-running operation. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * FAILED_PRECONDITION: There are Google Cloud projects linked to the Google Cloud entitlement's Cloud Billing subaccount. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Entitlement resource not found. * DELETION_TYPE_NOT_ALLOWED: Cancel is only allowed for Google Workspace add-ons, or entitlements for Google Cloud's development platform. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The response will contain google.protobuf.Empty on success. The Operation metadata will contain an instance of OperationMetadata.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/entitlements/cancel

name <> 
GoogleCloudChannelV1CancelEntitlementRequest:
GoogleCloudChannelV1CancelEntitlementRequest"
  [name GoogleCloudChannelV1CancelEntitlementRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1CancelEntitlementRequest})

(defn accounts-customers-entitlements-activate
  "Activates a previously suspended entitlement. Entitlements suspended for pending ToS acceptance can't be activated using this method. An entitlement activation is a long-running operation and it updates the state of the customer entitlement. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Entitlement resource not found. * SUSPENSION_NOT_RESELLER_INITIATED: Can only activate reseller-initiated suspensions and entitlements that have accepted the TOS. * NOT_SUSPENDED: Can only activate suspended entitlements not in an ACTIVE state. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/entitlements/activate

name <> 
GoogleCloudChannelV1ActivateEntitlementRequest:
GoogleCloudChannelV1ActivateEntitlementRequest"
  [name GoogleCloudChannelV1ActivateEntitlementRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+name}:activate",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1ActivateEntitlementRequest})

(defn accounts-customers-entitlements-suspend
  "Suspends a previously fulfilled entitlement. An entitlement suspension is a long-running operation. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Entitlement resource not found. * NOT_ACTIVE: Entitlement is not active. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/entitlements/suspend

name <> 
GoogleCloudChannelV1SuspendEntitlementRequest:
GoogleCloudChannelV1SuspendEntitlementRequest"
  [name GoogleCloudChannelV1SuspendEntitlementRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+name}:suspend",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1SuspendEntitlementRequest})

(defn accounts-customers-entitlements-changeRenewalSettings
  "Updates the renewal settings for an existing customer entitlement. An entitlement update is a long-running operation and it updates the entitlement as a result of fulfillment. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Entitlement resource not found. * NOT_COMMITMENT_PLAN: Renewal Settings are only applicable for a commitment plan. Can't enable or disable renewals for non-commitment plans. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/entitlements/changeRenewalSettings

name <> 
GoogleCloudChannelV1ChangeRenewalSettingsRequest:
GoogleCloudChannelV1ChangeRenewalSettingsRequest"
  [name GoogleCloudChannelV1ChangeRenewalSettingsRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+name}:changeRenewalSettings",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1ChangeRenewalSettingsRequest})

(defn accounts-customers-entitlements-create
  "Creates an entitlement for a customer. Possible error codes: * PERMISSION_DENIED: * The customer doesn't belong to the reseller. * The reseller is not authorized to transact on this Product. See https://support.google.com/channelservices/answer/9759265 * INVALID_ARGUMENT: * Required request parameters are missing or invalid. * There is already a customer entitlement for a SKU from the same product family. * INVALID_VALUE: Make sure the OfferId is valid. If it is, contact Google Channel support for further troubleshooting. * NOT_FOUND: The customer or offer resource was not found. * ALREADY_EXISTS: * The SKU was already purchased for the customer. * The customer's primary email already exists. Retry after changing the customer's primary contact email. * CONDITION_NOT_MET or FAILED_PRECONDITION: * The domain required for purchasing a SKU has not been verified. * A pre-requisite SKU required to purchase an Add-On SKU is missing. For example, Google Workspace Business Starter is required to purchase Vault or Drive. * (Developer accounts only) Reseller and resold domain must meet the following naming requirements: * Domain names must start with goog-test. * Domain names must include the reseller domain. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/entitlements/create

parent <> 
GoogleCloudChannelV1CreateEntitlementRequest:
GoogleCloudChannelV1CreateEntitlementRequest"
  [parent GoogleCloudChannelV1CreateEntitlementRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+parent}/entitlements",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1CreateEntitlementRequest})

(defn accounts-customers-entitlements-changeOffer
  "Updates the Offer for an existing customer entitlement. An entitlement update is a long-running operation and it updates the entitlement as a result of fulfillment. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Offer or Entitlement resource not found. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/entitlements/changeOffer

name <> 
GoogleCloudChannelV1ChangeOfferRequest:
GoogleCloudChannelV1ChangeOfferRequest"
  [name GoogleCloudChannelV1ChangeOfferRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+name}:changeOffer",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1ChangeOfferRequest})

(defn accounts-customers-entitlements-lookupOffer
  "Returns the requested Offer resource. Possible error codes: * PERMISSION_DENIED: The entitlement doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Entitlement or offer was not found. Return value: The Offer resource.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/entitlements/lookupOffer

entitlement <> "
  [entitlement]
  {:method :get,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+entitlement}:lookupOffer",
   :uri-template-args {"entitlement" entitlement},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"]})

(defn accounts-customers-entitlements-listEntitlementChanges
  "List entitlement history. Possible error codes: * PERMISSION_DENIED: The reseller account making the request and the provided reseller account are different. * INVALID_ARGUMENT: Missing or invalid required fields in the request. * NOT_FOUND: The parent resource doesn't exist. Usually the result of an invalid name parameter. * INTERNAL: Any non-user error related to a technical issue in the backend. In this case, contact CloudChannel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. In this case, contact Cloud Channel support. Return value: List of EntitlementChanges.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/entitlements/listEntitlementChanges

parent <> 

optional:
pageSize <integer> Optional. The maximum number of entitlement changes to return. The service may return fewer than this value. If unspecified, returns at most 10 entitlement changes. The maximum value is 50; the server will coerce values above 50.
filter <string> Optional. Filters applied to the list results."
  ([parent]
    (accounts-customers-entitlements-listEntitlementChanges
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+parent}:listEntitlementChanges",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-customers-entitlements-get
  "Returns the requested Entitlement resource. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The customer entitlement was not found. Return value: The requested Entitlement resource.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/entitlements/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"]})

(defn accounts-customers-entitlements-changeParameters
  "Change parameters of the entitlement. An entitlement update is a long-running operation and it updates the entitlement as a result of fulfillment. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. For example, the number of seats being changed is greater than the allowed number of max seats, or decreasing seats for a commitment based plan. * NOT_FOUND: Entitlement resource not found. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/entitlements/changeParameters

name <> 
GoogleCloudChannelV1ChangeParametersRequest:
GoogleCloudChannelV1ChangeParametersRequest"
  [name GoogleCloudChannelV1ChangeParametersRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+name}:changeParameters",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1ChangeParametersRequest})

(defn accounts-customers-customerRepricingConfigs-get
  "Gets information about how a Reseller modifies their bill before sending it to a Customer. Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different. * NOT_FOUND: The CustomerRepricingConfig was not found. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the CustomerRepricingConfig resource, otherwise returns an error.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/customerRepricingConfigs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"]})

(defn accounts-customers-customerRepricingConfigs-list
  "Lists information about how a Reseller modifies their bill before sending it to a Customer. Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different. * NOT_FOUND: The CustomerRepricingConfig specified does not exist or is not associated with the given account. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the CustomerRepricingConfig resources. The data for each resource is displayed in the ascending order of: * Customer ID * RepricingConfig.EntitlementGranularity.entitlement * RepricingConfig.effective_invoice_month * CustomerRepricingConfig.update_time If unsuccessful, returns an error.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/customerRepricingConfigs/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of repricing configs to return. The service may return fewer than this value. If unspecified, returns a maximum of 50 rules. The maximum value is 100; values above 100 will be coerced to 100.
filter <string> Optional. A filter for [CloudChannelService.ListCustomerRepricingConfigs] results (customer only). You can use this filter when you support a BatchGet-like query. To use the filter, you must set `parent=accounts/{account_id}/customers/-`. Example: customer = accounts/account_id/customers/c1 OR customer = accounts/account_id/customers/c2."
  ([parent]
    (accounts-customers-customerRepricingConfigs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+parent}/customerRepricingConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-customers-customerRepricingConfigs-create
  "Creates a CustomerRepricingConfig. Call this method to set modifications for a specific customer's bill. You can only create configs if the RepricingConfig.effective_invoice_month is a future month. If needed, you can create a config for the current month, with some restrictions. When creating a config for a future month, make sure there are no existing configs for that RepricingConfig.effective_invoice_month. The following restrictions are for creating configs in the current month. * This functionality is reserved for recovering from an erroneous config, and should not be used for regular business cases. * The new config will not modify exports used with other configs. Changes to the config may be immediate, but may take up to 24 hours. * There is a limit of ten configs for any RepricingConfig.EntitlementGranularity.entitlement, for any RepricingConfig.effective_invoice_month. * The contained CustomerRepricingConfig.repricing_config value must be different from the value used in the current config for a RepricingConfig.EntitlementGranularity.entitlement. Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different. * INVALID_ARGUMENT: Missing or invalid required parameters in the request. Also displays if the updated config is for the current month or past months. * NOT_FOUND: The CustomerRepricingConfig specified does not exist or is not associated with the given account. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the updated CustomerRepricingConfig resource, otherwise returns an error.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/customerRepricingConfigs/create

parent <> 
GoogleCloudChannelV1CustomerRepricingConfig:
GoogleCloudChannelV1CustomerRepricingConfig"
  [parent GoogleCloudChannelV1CustomerRepricingConfig]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+parent}/customerRepricingConfigs",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1CustomerRepricingConfig})

(defn accounts-customers-customerRepricingConfigs-patch
  "Updates a CustomerRepricingConfig. Call this method to set modifications for a specific customer's bill. This method overwrites the existing CustomerRepricingConfig. You can only update configs if the RepricingConfig.effective_invoice_month is a future month. To make changes to configs for the current month, use CreateCustomerRepricingConfig, taking note of its restrictions. You cannot update the RepricingConfig.effective_invoice_month. When updating a config in the future: * This config must already exist. Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different. * INVALID_ARGUMENT: Missing or invalid required parameters in the request. Also displays if the updated config is for the current month or past months. * NOT_FOUND: The CustomerRepricingConfig specified does not exist or is not associated with the given account. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the updated CustomerRepricingConfig resource, otherwise returns an error.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/customerRepricingConfigs/patch

name <> 
GoogleCloudChannelV1CustomerRepricingConfig:
GoogleCloudChannelV1CustomerRepricingConfig"
  [name GoogleCloudChannelV1CustomerRepricingConfig]
  {:method :patch,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1CustomerRepricingConfig})

(defn accounts-customers-customerRepricingConfigs-delete
  "Deletes the given CustomerRepricingConfig permanently. You can only delete configs if their RepricingConfig.effective_invoice_month is set to a date after the current month. Possible error codes: * PERMISSION_DENIED: The account making the request does not own this customer. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * FAILED_PRECONDITION: The CustomerRepricingConfig is active or in the past. * NOT_FOUND: No CustomerRepricingConfig found for the name in the request.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/customers/customerRepricingConfigs/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"]})

(defn accounts-channelPartnerLinks-list
  "List ChannelPartnerLinks belonging to a distributor. You must be a distributor to call this method. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. Return value: The list of the distributor account's ChannelPartnerLink resources.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server might return fewer results than requested. If unspecified, server will pick a default size (25). The maximum value is 200; the server will coerce values above 200.
view <string> Optional. The level of granularity the ChannelPartnerLink will display."
  ([parent] (accounts-channelPartnerLinks-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+parent}/channelPartnerLinks",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-channelPartnerLinks-get
  "Returns the requested ChannelPartnerLink resource. You must be a distributor to call this method. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: ChannelPartnerLink resource not found because of an invalid channel partner link name. Return value: The ChannelPartnerLink resource.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/get

name <> 

optional:
view <string> Optional. The level of granularity the ChannelPartnerLink will display."
  ([name] (accounts-channelPartnerLinks-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-channelPartnerLinks-create
  "Initiates a channel partner link between a distributor and a reseller, or between resellers in an n-tier reseller channel. Invited partners need to follow the invite_link_uri provided in the response to accept. After accepting the invitation, a link is set up between the two parties. You must be a distributor to call this method. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * ALREADY_EXISTS: The ChannelPartnerLink sent in the request already exists. * NOT_FOUND: No Cloud Identity customer exists for provided domain. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The new ChannelPartnerLink resource.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/create

parent <> 
GoogleCloudChannelV1ChannelPartnerLink:
GoogleCloudChannelV1ChannelPartnerLink"
  [parent GoogleCloudChannelV1ChannelPartnerLink]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+parent}/channelPartnerLinks",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1ChannelPartnerLink})

(defn accounts-channelPartnerLinks-patch
  "Updates a channel partner link. Distributors call this method to change a link's status. For example, to suspend a partner link. You must be a distributor to call this method. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: * Required request parameters are missing or invalid. * Link state cannot change from invited to active or suspended. * Cannot send reseller_cloud_identity_id, invite_url, or name in update mask. * NOT_FOUND: ChannelPartnerLink resource not found. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The updated ChannelPartnerLink resource.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/patch

name <> 
GoogleCloudChannelV1UpdateChannelPartnerLinkRequest:
GoogleCloudChannelV1UpdateChannelPartnerLinkRequest"
  [name GoogleCloudChannelV1UpdateChannelPartnerLinkRequest]
  {:method :patch,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1UpdateChannelPartnerLinkRequest})

(defn accounts-channelPartnerLinks-customers-list
  "List Customers. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. Return value: List of Customers, or an empty list if there are no customers.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/customers/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of customers to return. The service may return fewer than this value. If unspecified, returns at most 10 customers. The maximum value is 50.
filter <string> Optional. Filters applied to the [CloudChannelService.ListCustomers] results. See https://cloud.google.com/channel/docs/concepts/google-cloud/filter-customers for more information."
  ([parent] (accounts-channelPartnerLinks-customers-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+parent}/customers",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-channelPartnerLinks-customers-get
  "Returns the requested Customer resource. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The customer resource doesn't exist. Usually the result of an invalid name parameter. Return value: The Customer resource.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/customers/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"]})

(defn accounts-channelPartnerLinks-customers-create
  "Creates a new Customer resource under the reseller or distributor account. Possible error codes: * PERMISSION_DENIED: * The reseller account making the request is different from the reseller account in the API request. * You are not authorized to create a customer. See https://support.google.com/channelservices/answer/9759265 * INVALID_ARGUMENT: * Required request parameters are missing or invalid. * Domain field value doesn't match the primary email domain. Return value: The newly created Customer resource.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/customers/create

parent <> 
GoogleCloudChannelV1Customer:
GoogleCloudChannelV1Customer"
  [parent GoogleCloudChannelV1Customer]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+parent}/customers",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1Customer})

(defn accounts-channelPartnerLinks-customers-patch
  "Updates an existing Customer resource for the reseller or distributor. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: No Customer resource found for the name in the request. Return value: The updated Customer resource.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/customers/patch

name <> 
GoogleCloudChannelV1Customer:
GoogleCloudChannelV1Customer

optional:
updateMask <string> The update mask that applies to the resource. Optional."
  ([name GoogleCloudChannelV1Customer]
    (accounts-channelPartnerLinks-customers-patch
      name
      GoogleCloudChannelV1Customer
      nil))
  ([name GoogleCloudChannelV1Customer optional]
    {:method :patch,
     :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"],
     :body GoogleCloudChannelV1Customer}))

(defn accounts-channelPartnerLinks-customers-delete
  "Deletes the given Customer permanently. Possible error codes: * PERMISSION_DENIED: The account making the request does not own this customer. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * FAILED_PRECONDITION: The customer has existing entitlements. * NOT_FOUND: No Customer resource found for the name in the request.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/customers/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"]})

(defn accounts-channelPartnerLinks-customers-import
  "Imports a Customer from the Cloud Identity associated with the provided Cloud Identity ID or domain before a TransferEntitlements call. If a linked Customer already exists and overwrite_if_exists is true, it will update that Customer's data. Possible error codes: * PERMISSION_DENIED: * The reseller account making the request is different from the reseller account in the API request. * You are not authorized to import the customer. See https://support.google.com/channelservices/answer/9759265 * NOT_FOUND: Cloud Identity doesn't exist or was deleted. * INVALID_ARGUMENT: Required parameters are missing, or the auth_token is expired or invalid. * ALREADY_EXISTS: A customer already exists and has conflicting critical fields. Requires an overwrite. Return value: The Customer.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/customers/import

parent <> 
GoogleCloudChannelV1ImportCustomerRequest:
GoogleCloudChannelV1ImportCustomerRequest"
  [parent GoogleCloudChannelV1ImportCustomerRequest]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+parent}/customers:import",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1ImportCustomerRequest})

(defn accounts-channelPartnerLinks-channelPartnerRepricingConfigs-get
  "Gets information about how a Distributor modifies their bill before sending it to a ChannelPartner. Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different. * NOT_FOUND: The ChannelPartnerRepricingConfig was not found. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the ChannelPartnerRepricingConfig resource, otherwise returns an error.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/channelPartnerRepricingConfigs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"]})

(defn accounts-channelPartnerLinks-channelPartnerRepricingConfigs-list
  "Lists information about how a Reseller modifies their bill before sending it to a ChannelPartner. Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different. * NOT_FOUND: The ChannelPartnerRepricingConfig specified does not exist or is not associated with the given account. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the ChannelPartnerRepricingConfig resources. The data for each resource is displayed in the ascending order of: * Channel Partner ID * RepricingConfig.effective_invoice_month * ChannelPartnerRepricingConfig.update_time If unsuccessful, returns an error.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/channelPartnerRepricingConfigs/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of repricing configs to return. The service may return fewer than this value. If unspecified, returns a maximum of 50 rules. The maximum value is 100; values above 100 will be coerced to 100.
filter <string> Optional. A filter for [CloudChannelService.ListChannelPartnerRepricingConfigs] results (channel_partner_link only). You can use this filter when you support a BatchGet-like query. To use the filter, you must set `parent=accounts/{account_id}/channelPartnerLinks/-`. Example: `channel_partner_link = accounts/account_id/channelPartnerLinks/c1` OR `channel_partner_link = accounts/account_id/channelPartnerLinks/c2`."
  ([parent]
    (accounts-channelPartnerLinks-channelPartnerRepricingConfigs-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+parent}/channelPartnerRepricingConfigs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-channelPartnerLinks-channelPartnerRepricingConfigs-create
  "Creates a ChannelPartnerRepricingConfig. Call this method to set modifications for a specific ChannelPartner's bill. You can only create configs if the RepricingConfig.effective_invoice_month is a future month. If needed, you can create a config for the current month, with some restrictions. When creating a config for a future month, make sure there are no existing configs for that RepricingConfig.effective_invoice_month. The following restrictions are for creating configs in the current month. * This functionality is reserved for recovering from an erroneous config, and should not be used for regular business cases. * The new config will not modify exports used with other configs. Changes to the config may be immediate, but may take up to 24 hours. * There is a limit of ten configs for any ChannelPartner or RepricingConfig.EntitlementGranularity.entitlement, for any RepricingConfig.effective_invoice_month. * The contained ChannelPartnerRepricingConfig.repricing_config value must be different from the value used in the current config for a ChannelPartner. Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different. * INVALID_ARGUMENT: Missing or invalid required parameters in the request. Also displays if the updated config is for the current month or past months. * NOT_FOUND: The ChannelPartnerRepricingConfig specified does not exist or is not associated with the given account. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the updated ChannelPartnerRepricingConfig resource, otherwise returns an error.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/channelPartnerRepricingConfigs/create

parent <> 
GoogleCloudChannelV1ChannelPartnerRepricingConfig:
GoogleCloudChannelV1ChannelPartnerRepricingConfig"
  [parent GoogleCloudChannelV1ChannelPartnerRepricingConfig]
  {:method :post,
   :uri-template
   "https://cloudchannel.googleapis.com/v1/{+parent}/channelPartnerRepricingConfigs",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1ChannelPartnerRepricingConfig})

(defn accounts-channelPartnerLinks-channelPartnerRepricingConfigs-patch
  "Updates a ChannelPartnerRepricingConfig. Call this method to set modifications for a specific ChannelPartner's bill. This method overwrites the existing CustomerRepricingConfig. You can only update configs if the RepricingConfig.effective_invoice_month is a future month. To make changes to configs for the current month, use CreateChannelPartnerRepricingConfig, taking note of its restrictions. You cannot update the RepricingConfig.effective_invoice_month. When updating a config in the future: * This config must already exist. Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different. * INVALID_ARGUMENT: Missing or invalid required parameters in the request. Also displays if the updated config is for the current month or past months. * NOT_FOUND: The ChannelPartnerRepricingConfig specified does not exist or is not associated with the given account. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the updated ChannelPartnerRepricingConfig resource, otherwise returns an error.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/channelPartnerRepricingConfigs/patch

name <> 
GoogleCloudChannelV1ChannelPartnerRepricingConfig:
GoogleCloudChannelV1ChannelPartnerRepricingConfig"
  [name GoogleCloudChannelV1ChannelPartnerRepricingConfig]
  {:method :patch,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"],
   :body GoogleCloudChannelV1ChannelPartnerRepricingConfig})

(defn accounts-channelPartnerLinks-channelPartnerRepricingConfigs-delete
  "Deletes the given ChannelPartnerRepricingConfig permanently. You can only delete configs if their RepricingConfig.effective_invoice_month is set to a date after the current month. Possible error codes: * PERMISSION_DENIED: The account making the request does not own this customer. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * FAILED_PRECONDITION: The ChannelPartnerRepricingConfig is active or in the past. * NOT_FOUND: No ChannelPartnerRepricingConfig found for the name in the request.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/channelPartnerLinks/channelPartnerRepricingConfigs/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://cloudchannel.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.order"]})

(defn accounts-skuGroups-list
  "Lists the Rebilling supported SKU groups the account is authorized to sell. Reference: https://cloud.google.com/skus/sku-groups Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different, or the account doesn't exist. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the SkuGroup resources. The data for each resource is displayed in the alphabetical order of SKU group display name. The data for each resource is displayed in the ascending order of SkuGroup.display_name If unsuccessful, returns an error.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/skuGroups/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of SKU groups to return. The service may return fewer than this value. If unspecified, returns a maximum of 1000 SKU groups. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (accounts-skuGroups-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+parent}/skuGroups",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-skuGroups-billableSkus-list
  "Lists the Billable SKUs in a given SKU group. Possible error codes: PERMISSION_DENIED: If the account making the request and the account being queried for are different, or the account doesn't exist. INVALID_ARGUMENT: Missing or invalid required parameters in the request. INTERNAL: Any non-user error related to technical issue in the backend. In this case, contact cloud channel support. Return Value: If successful, the BillableSku resources. The data for each resource is displayed in the ascending order of: * BillableSku.service_display_name * BillableSku.sku_display_name If unsuccessful, returns an error.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/skuGroups/billableSkus/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of SKUs to return. The service may return fewer than this value. If unspecified, returns a maximum of 100000 SKUs. The maximum value is 100000; values above 100000 will be coerced to 100000."
  ([parent] (accounts-skuGroups-billableSkus-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+parent}/billableSkus",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn accounts-offers-list
  "Lists the Offers the reseller can sell. Possible error codes: * INVALID_ARGUMENT: Required request parameters are missing or invalid.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/accounts/offers/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server might return fewer results than requested. If unspecified, returns at most 500 Offers. The maximum value is 1000; the server will coerce values above 1000.
filter <string> Optional. The expression to filter results by name (name of the Offer), sku.name (name of the SKU), or sku.product.name (name of the Product). Example 1: sku.product.name=products/p1 AND sku.name!=products/p1/skus/s1 Example 2: name=accounts/a1/offers/o1
languageCode <string> Optional. The BCP-47 language code. For example, \"en-US\". The response will localize in the corresponding language code, if specified. The default value is \"en-US\".
showFutureOffers <boolean> Optional. A boolean flag that determines if a response returns future offers 30 days from now. If the show_future_offers is true, the response will only contain offers that are scheduled to be available 30 days from now."
  ([parent] (accounts-offers-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+parent}/offers",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn products-list
  "Lists the Products the reseller is authorized to sell. Possible error codes: * INVALID_ARGUMENT: Required request parameters are missing or invalid.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/products/list

optional:
account <string> Required. The resource name of the reseller account. Format: accounts/{account_id}.
pageSize <integer> Optional. Requested page size. Server might return fewer results than requested. If unspecified, returns at most 100 Products. The maximum value is 1000; the server will coerce values above 1000.
languageCode <string> Optional. The BCP-47 language code. For example, \"en-US\". The response will localize in the corresponding language code, if specified. The default value is \"en-US\"."
  ([] (products-list nil))
  ([optional]
    {:method :get,
     :uri-template "https://cloudchannel.googleapis.com/v1/products",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn products-skus-list
  "Lists the SKUs for a product the reseller is authorized to sell. Possible error codes: * INVALID_ARGUMENT: Required request parameters are missing or invalid.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/products/skus/list

parent <> 

optional:
account <string> Required. Resource name of the reseller. Format: accounts/{account_id}.
pageSize <integer> Optional. Requested page size. Server might return fewer results than requested. If unspecified, returns at most 100 SKUs. The maximum value is 1000; the server will coerce values above 1000.
languageCode <string> Optional. The BCP-47 language code. For example, \"en-US\". The response will localize in the corresponding language code, if specified. The default value is \"en-US\"."
  ([parent] (products-skus-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+parent}/skus",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn integrators-register
  "Registers a service account with subscriber privileges on the Cloud Pub/Sub topic for this Channel Services account. After you create a subscriber, you get the events through SubscriberEvent Possible error codes: * PERMISSION_DENIED: The reseller account making the request and the provided reseller account are different, or the impersonated user is not a super admin. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The topic name with the registered service email address.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/integrators/register

integrator <> 

optional:
account <string> Optional. Resource name of the account.
serviceAccount <string> Required. Service account that provides subscriber access to the registered topic."
  ([integrator] (integrators-register integrator nil))
  ([integrator optional]
    {:method :post,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+integrator}:register",
     :uri-template-args {"integrator" integrator},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn integrators-unregister
  "Unregisters a service account with subscriber privileges on the Cloud Pub/Sub topic created for this Channel Services account. If there are no service accounts left with subscriber privileges, this deletes the topic. You can call ListSubscribers to check for these accounts. Possible error codes: * PERMISSION_DENIED: The reseller account making the request and the provided reseller account are different, or the impersonated user is not a super admin. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The topic resource doesn't exist. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The topic name that unregistered the service email address. Returns a success response if the service email address wasn't registered with the topic.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/integrators/unregister

integrator <> 

optional:
account <string> Optional. Resource name of the account.
serviceAccount <string> Required. Service account to unregister from subscriber access to the topic."
  ([integrator] (integrators-unregister integrator nil))
  ([integrator optional]
    {:method :post,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+integrator}:unregister",
     :uri-template-args {"integrator" integrator},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))

(defn integrators-listSubscribers
  "Lists service accounts with subscriber privileges on the Cloud Pub/Sub topic created for this Channel Services account. Possible error codes: * PERMISSION_DENIED: The reseller account making the request and the provided reseller account are different, or the impersonated user is not a super admin. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The topic resource doesn't exist. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: A list of service email addresses.
https://cloud.google.com/channel/docs/v1/reference/rest/v1/integrators/listSubscribers

integrator <> 

optional:
account <string> Optional. Resource name of the account.
pageSize <integer> Optional. The maximum number of service accounts to return. The service may return fewer than this value. If unspecified, returns at most 100 service accounts. The maximum value is 1000; the server will coerce values above 1000."
  ([integrator] (integrators-listSubscribers integrator nil))
  ([integrator optional]
    {:method :get,
     :uri-template
     "https://cloudchannel.googleapis.com/v1/{+integrator}:listSubscribers",
     :uri-template-args {"integrator" integrator},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/apps.order"]}))
