(ns happyapi.google.content-v2.1
  "Content API for Shopping
Manage your product listings and accounts for Google Shopping
See: https://developers.google.com/shopping-content/guides/quickstart"
  (:require [happyapi.providers.google :as client]))

(defn conversionsources-create
  "Creates a new conversion source.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/conversionsources/create

merchantId <> 
ConversionSource:
ConversionSource"
  [merchantId ConversionSource]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/conversionsources",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ConversionSource}))

(defn conversionsources-patch
  "Updates information of an existing conversion source.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/conversionsources/patch

merchantId <> 
conversionSourceId <> 
ConversionSource:
ConversionSource

optional:
updateMask <string> Required. List of fields being updated."
  ([merchantId conversionSourceId ConversionSource]
    (conversionsources-patch
      merchantId
      conversionSourceId
      ConversionSource
      nil))
  ([merchantId conversionSourceId ConversionSource optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/conversionsources/{conversionSourceId}",
       :uri-template-args
       {"merchantId" merchantId,
        "conversionSourceId" conversionSourceId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"],
       :body ConversionSource})))

(defn conversionsources-delete
  "Archives an existing conversion source. It will be recoverable for 30 days. This archiving behavior is not typical in the Content API and unique to this service.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/conversionsources/delete

merchantId <> 
conversionSourceId <> "
  [merchantId conversionSourceId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/conversionsources/{conversionSourceId}",
     :uri-template-args
     {"merchantId" merchantId,
      "conversionSourceId" conversionSourceId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn conversionsources-undelete
  "Re-enables an archived conversion source.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/conversionsources/undelete

merchantId <> 
conversionSourceId <> 
UndeleteConversionSourceRequest:
UndeleteConversionSourceRequest"
  [merchantId conversionSourceId UndeleteConversionSourceRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/conversionsources/{conversionSourceId}:undelete",
     :uri-template-args
     {"merchantId" merchantId,
      "conversionSourceId" conversionSourceId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body UndeleteConversionSourceRequest}))

(defn conversionsources-get
  "Fetches a conversion source.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/conversionsources/get

merchantId <> 
conversionSourceId <> "
  [merchantId conversionSourceId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/conversionsources/{conversionSourceId}",
     :uri-template-args
     {"merchantId" merchantId,
      "conversionSourceId" conversionSourceId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn conversionsources-list
  "Retrieves the list of conversion sources the caller has access to.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/conversionsources/list

merchantId <> 

optional:
pageSize <integer> The maximum number of conversion sources to return in a page. If no `page_size` is specified, `100` is used as the default value. The maximum value is `200`. Values above `200` will be coerced to `200`. Regardless of pagination, at most `200` conversion sources are returned in total.
showDeleted <boolean> If true, also returns archived conversion sources."
  ([merchantId] (conversionsources-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/conversionsources",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn products-custombatch
  "Retrieves, inserts, and deletes multiple products in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/products/custombatch

ProductsCustomBatchRequest:
ProductsCustomBatchRequest"
  [ProductsCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/products/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ProductsCustomBatchRequest}))

(defn products-delete
  "Deletes a product from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/products/delete

merchantId <> 
productId <> 

optional:
feedId <string> The Content API Supplemental Feed ID. If present then product deletion applies to the data in a supplemental feed. If absent, entire product will be deleted."
  ([merchantId productId] (products-delete merchantId productId nil))
  ([merchantId productId optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products/{productId}",
       :uri-template-args
       {"merchantId" merchantId, "productId" productId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn products-get
  "Retrieves a product from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/products/get

merchantId <> 
productId <> "
  [merchantId productId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products/{productId}",
     :uri-template-args
     {"merchantId" merchantId, "productId" productId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn products-insert
  "Uploads a product to your Merchant Center account. If an item with the same channel, contentLanguage, offerId, and targetCountry already exists, this method updates that entry.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/products/insert

merchantId <> 
Product:
Product

optional:
feedId <string> The Content API Supplemental Feed ID. If present then product insertion applies to the data in a supplemental feed."
  ([merchantId Product] (products-insert merchantId Product nil))
  ([merchantId Product optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"],
       :body Product})))

(defn products-update
  "Updates an existing product in your Merchant Center account. Only updates attributes provided in the request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/products/update

merchantId <> 
productId <> 
Product:
Product

optional:
updateMask <string> The comma-separated list of product attributes to be updated. Example: `\"title,salePrice\"`. Attributes specified in the update mask without a value specified in the body will be deleted from the product. *You must specify the update mask to delete attributes.* Only top-level product attributes can be updated. If not defined, product attributes with set values will be updated and other attributes will stay unchanged."
  ([merchantId productId Product]
    (products-update merchantId productId Product nil))
  ([merchantId productId Product optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products/{productId}",
       :uri-template-args
       {"merchantId" merchantId, "productId" productId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"],
       :body Product})))

(defn products-list
  "Lists the products in your Merchant Center account. The response might contain fewer items than specified by maxResults. Rely on nextPageToken to determine if there are more items to be requested.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/products/list

merchantId <> 

optional:
maxResults <integer> The maximum number of products to return in the response, used for paging. The default value is 25. The maximum value is 250."
  ([merchantId] (products-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn shippingsettings-custombatch
  "Retrieves and updates the shipping settings of multiple accounts in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/custombatch

ShippingsettingsCustomBatchRequest:
ShippingsettingsCustomBatchRequest"
  [ShippingsettingsCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/shippingsettings/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ShippingsettingsCustomBatchRequest}))

(defn shippingsettings-get
  "Retrieves the shipping settings of the account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/get

merchantId <> 
accountId <> "
  [merchantId accountId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/shippingsettings/{accountId}",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn shippingsettings-getsupportedcarriers
  "Retrieves supported carriers and carrier services for an account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/getsupportedcarriers

merchantId <> "
  [merchantId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/supportedCarriers",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn shippingsettings-getsupportedholidays
  "Retrieves supported holidays for an account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/getsupportedholidays

merchantId <> "
  [merchantId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/supportedHolidays",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn shippingsettings-getsupportedpickupservices
  "Retrieves supported pickup services for an account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/getsupportedpickupservices

merchantId <> "
  [merchantId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/supportedPickupServices",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn shippingsettings-list
  "Lists the shipping settings of the sub-accounts in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/list

merchantId <> 

optional:
maxResults <integer> The maximum number of shipping settings to return in the response, used for paging."
  ([merchantId] (shippingsettings-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/shippingsettings",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn shippingsettings-update
  "Updates the shipping settings of the account. Any fields that are not provided are deleted from the resource.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/update

merchantId <> 
accountId <> 
ShippingSettings:
ShippingSettings"
  [merchantId accountId ShippingSettings]
  (client/api-request
    {:method :put,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/shippingsettings/{accountId}",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ShippingSettings}))

(defn orderreturns-acknowledge
  "Acks an order return in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orderreturns/acknowledge

merchantId <> 
returnId <> 
OrderreturnsAcknowledgeRequest:
OrderreturnsAcknowledgeRequest"
  [merchantId returnId OrderreturnsAcknowledgeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orderreturns/{returnId}/acknowledge",
     :uri-template-args {"merchantId" merchantId, "returnId" returnId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrderreturnsAcknowledgeRequest}))

(defn orderreturns-createorderreturn
  "Create return in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orderreturns/createorderreturn

merchantId <> 
OrderreturnsCreateOrderReturnRequest:
OrderreturnsCreateOrderReturnRequest"
  [merchantId OrderreturnsCreateOrderReturnRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orderreturns/createOrderReturn",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrderreturnsCreateOrderReturnRequest}))

(defn orderreturns-get
  "Retrieves an order return from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orderreturns/get

merchantId <> 
returnId <> "
  [merchantId returnId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orderreturns/{returnId}",
     :uri-template-args {"merchantId" merchantId, "returnId" returnId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn orderreturns-list
  "Lists order returns in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orderreturns/list

merchantId <> 

optional:
googleOrderIds <string> Obtains order returns with the specified order ids. If this parameter is provided, createdStartDate, createdEndDate, shipmentType, shipmentStatus, shipmentState and acknowledged parameters must be not set. Note: if googleOrderId and shipmentTrackingNumber parameters are provided, the obtained results will include all order returns that either match the specified order id or the specified tracking number.
shipmentTypes <string> Obtains order returns that match any shipment type provided in this parameter. When this parameter is not provided, order returns are obtained regardless of their shipment types.
acknowledged <boolean> Obtains order returns that match the acknowledgement status. When set to true, obtains order returns that have been acknowledged. When false, obtains order returns that have not been acknowledged. When not provided, obtains order returns regardless of their acknowledgement status. We recommend using this filter set to `false`, in conjunction with the `acknowledge` call, such that only un-acknowledged order returns are returned. 
maxResults <integer> The maximum number of order returns to return in the response, used for paging. The default value is 25 returns per page, and the maximum allowed value is 250 returns per page.
orderBy <string> Return the results in the specified order.
createdStartDate <string> Obtains order returns created after this date (inclusively), in ISO 8601 format.
shipmentStatus <string> Obtains order returns that match any shipment status provided in this parameter. When this parameter is not provided, order returns are obtained regardless of their shipment statuses.
createdEndDate <string> Obtains order returns created before this date (inclusively), in ISO 8601 format.
shipmentStates <string> Obtains order returns that match any shipment state provided in this parameter. When this parameter is not provided, order returns are obtained regardless of their shipment states.
shipmentTrackingNumbers <string> Obtains order returns with the specified tracking numbers. If this parameter is provided, createdStartDate, createdEndDate, shipmentType, shipmentStatus, shipmentState and acknowledged parameters must be not set. Note: if googleOrderId and shipmentTrackingNumber parameters are provided, the obtained results will include all order returns that either match the specified order id or the specified tracking number."
  ([merchantId] (orderreturns-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orderreturns",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn orderreturns-process
  "Processes return in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orderreturns/process

merchantId <> 
returnId <> 
OrderreturnsProcessRequest:
OrderreturnsProcessRequest"
  [merchantId returnId OrderreturnsProcessRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orderreturns/{returnId}/process",
     :uri-template-args {"merchantId" merchantId, "returnId" returnId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrderreturnsProcessRequest}))

(defn orderreturns-labels-create
  "Links a return shipping label to a return id. You can only create one return label per return id. Since the label is sent to the buyer, the linked return label cannot be updated or deleted. If you try to create multiple return shipping labels for a single return id, every create request except the first will fail.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orderreturns/labels/create

merchantId <> 
returnId <> 
ReturnShippingLabel:
ReturnShippingLabel"
  [merchantId returnId ReturnShippingLabel]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orderreturns/{returnId}/labels",
     :uri-template-args {"merchantId" merchantId, "returnId" returnId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ReturnShippingLabel}))

(defn returnpolicy-custombatch
  "Batches multiple return policy related calls in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicy/custombatch

ReturnpolicyCustomBatchRequest:
ReturnpolicyCustomBatchRequest"
  [ReturnpolicyCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/returnpolicy/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ReturnpolicyCustomBatchRequest}))

(defn returnpolicy-delete
  "Deletes a return policy for the given Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicy/delete

merchantId <> 
returnPolicyId <> "
  [merchantId returnPolicyId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicy/{returnPolicyId}",
     :uri-template-args
     {"merchantId" merchantId, "returnPolicyId" returnPolicyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn returnpolicy-get
  "Gets a return policy of the Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicy/get

merchantId <> 
returnPolicyId <> "
  [merchantId returnPolicyId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicy/{returnPolicyId}",
     :uri-template-args
     {"merchantId" merchantId, "returnPolicyId" returnPolicyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn returnpolicy-insert
  "Inserts a return policy for the Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicy/insert

merchantId <> 
ReturnPolicy:
ReturnPolicy"
  [merchantId ReturnPolicy]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicy",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ReturnPolicy}))

(defn returnpolicy-list
  "Lists the return policies of the Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicy/list

merchantId <> "
  [merchantId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicy",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn collectionstatuses-get
  "Gets the status of a collection from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/collectionstatuses/get

merchantId <> 
collectionId <> "
  [merchantId collectionId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/collectionstatuses/{collectionId}",
     :uri-template-args
     {"merchantId" merchantId, "collectionId" collectionId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn collectionstatuses-list
  "Lists the statuses of the collections in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/collectionstatuses/list

merchantId <> 

optional:
pageSize <integer> The maximum number of collection statuses to return in the response, used for paging. Defaults to 50; values above 1000 will be coerced to 1000."
  ([merchantId] (collectionstatuses-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/collectionstatuses",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn pos-custombatch
  "Batches multiple POS-related calls in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/custombatch

PosCustomBatchRequest:
PosCustomBatchRequest"
  [PosCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/pos/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body PosCustomBatchRequest}))

(defn pos-delete
  "Deletes a store for the given merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/delete

merchantId <> 
targetMerchantId <> 
storeCode <> "
  [merchantId targetMerchantId storeCode]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pos/{targetMerchantId}/store/{storeCode}",
     :uri-template-args
     {"merchantId" merchantId,
      "targetMerchantId" targetMerchantId,
      "storeCode" storeCode},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn pos-get
  "Retrieves information about the given store.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/get

merchantId <> 
targetMerchantId <> 
storeCode <> "
  [merchantId targetMerchantId storeCode]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pos/{targetMerchantId}/store/{storeCode}",
     :uri-template-args
     {"merchantId" merchantId,
      "targetMerchantId" targetMerchantId,
      "storeCode" storeCode},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn pos-insert
  "Creates a store for the given merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/insert

merchantId <> 
targetMerchantId <> 
PosStore:
PosStore"
  [merchantId targetMerchantId PosStore]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pos/{targetMerchantId}/store",
     :uri-template-args
     {"merchantId" merchantId, "targetMerchantId" targetMerchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body PosStore}))

(defn pos-inventory
  "Submit inventory for the given merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/inventory

merchantId <> 
targetMerchantId <> 
PosInventoryRequest:
PosInventoryRequest"
  [merchantId targetMerchantId PosInventoryRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pos/{targetMerchantId}/inventory",
     :uri-template-args
     {"merchantId" merchantId, "targetMerchantId" targetMerchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body PosInventoryRequest}))

(defn pos-list
  "Lists the stores of the target merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/list

merchantId <> 
targetMerchantId <> "
  [merchantId targetMerchantId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pos/{targetMerchantId}/store",
     :uri-template-args
     {"merchantId" merchantId, "targetMerchantId" targetMerchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn pos-sale
  "Submit a sale event for the given merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/sale

merchantId <> 
targetMerchantId <> 
PosSaleRequest:
PosSaleRequest"
  [merchantId targetMerchantId PosSaleRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pos/{targetMerchantId}/sale",
     :uri-template-args
     {"merchantId" merchantId, "targetMerchantId" targetMerchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body PosSaleRequest}))

(defn productdeliverytime-create
  "Creates or updates the delivery time of a product.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/productdeliverytime/create

merchantId <> 
ProductDeliveryTime:
ProductDeliveryTime"
  [merchantId ProductDeliveryTime]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/productdeliverytime",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ProductDeliveryTime}))

(defn productdeliverytime-get
  "Gets `productDeliveryTime` by `productId`.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/productdeliverytime/get

merchantId <> 
productId <> "
  [merchantId productId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/productdeliverytime/{productId}",
     :uri-template-args
     {"merchantId" merchantId, "productId" productId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn productdeliverytime-delete
  "Deletes the delivery time of a product.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/productdeliverytime/delete

merchantId <> 
productId <> "
  [merchantId productId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/productdeliverytime/{productId}",
     :uri-template-args
     {"merchantId" merchantId, "productId" productId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn recommendations-generate
  "Generates recommendations for a merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/recommendations/generate

merchantId <> 

optional:
languageCode <string> Optional. Language code of the client. If not set, the result will be in default language (English). This language code affects all fields prefixed with \"localized\". This should be set to ISO 639-1 country code. List of currently verified supported language code: en, fr, cs, da, de, es, it, nl, no, pl, pt, pt, fi, sv, vi, tr, th, ko, zh-CN, zh-TW, ja, id, hi
allowedTag <string> Optional. List of allowed tags. Tags are a set of predefined strings that describe the category that individual recommendation types belong to. User can specify zero or more tags in this field to indicate what categories of recommendations they want to receive. Current list of supported tags: - TREND"
  ([merchantId] (recommendations-generate merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/recommendations/generate",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn recommendations-reportInteraction
  "Reports an interaction on a recommendation for a merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/recommendations/reportInteraction

merchantId <> 
ReportInteractionRequest:
ReportInteractionRequest"
  [merchantId ReportInteractionRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/recommendations/reportInteraction",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ReportInteractionRequest}))

(defn settlementreports-get
  "Retrieves a settlement report from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/settlementreports/get

merchantId <> 
settlementId <> "
  [merchantId settlementId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/settlementreports/{settlementId}",
     :uri-template-args
     {"merchantId" merchantId, "settlementId" settlementId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn settlementreports-list
  "Retrieves a list of settlement reports from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/settlementreports/list

merchantId <> 

optional:
maxResults <integer> The maximum number of settlements to return in the response, used for paging. The default value is 200 returns per page, and the maximum allowed value is 5000 returns per page.
transferStartDate <string> Obtains settlements which have transactions after this date (inclusively), in ISO 8601 format.
transferEndDate <string> Obtains settlements which have transactions before this date (inclusively), in ISO 8601 format."
  ([merchantId] (settlementreports-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/settlementreports",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn settlementtransactions-list
  "Retrieves a list of transactions for the settlement.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/settlementtransactions/list

merchantId <> 
settlementId <> 

optional:
maxResults <integer> The maximum number of transactions to return in the response, used for paging. The default value is 200 transactions per page, and the maximum allowed value is 5000 transactions per page.
transactionIds <string> The list of transactions to return. If not set, all transactions will be returned."
  ([merchantId settlementId]
    (settlementtransactions-list merchantId settlementId nil))
  ([merchantId settlementId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/settlementreports/{settlementId}/transactions",
       :uri-template-args
       {"merchantId" merchantId, "settlementId" settlementId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn returnpolicyonline-get
  "Gets an existing return policy.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicyonline/get

merchantId <> 
returnPolicyId <> "
  [merchantId returnPolicyId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicyonline/{returnPolicyId}",
     :uri-template-args
     {"merchantId" merchantId, "returnPolicyId" returnPolicyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn returnpolicyonline-create
  "Creates a new return policy.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicyonline/create

merchantId <> 
ReturnPolicyOnline:
ReturnPolicyOnline"
  [merchantId ReturnPolicyOnline]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicyonline",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ReturnPolicyOnline}))

(defn returnpolicyonline-delete
  "Deletes an existing return policy.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicyonline/delete

merchantId <> 
returnPolicyId <> "
  [merchantId returnPolicyId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicyonline/{returnPolicyId}",
     :uri-template-args
     {"merchantId" merchantId, "returnPolicyId" returnPolicyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn returnpolicyonline-patch
  "Updates an existing return policy.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicyonline/patch

merchantId <> 
returnPolicyId <> 
ReturnPolicyOnline:
ReturnPolicyOnline"
  [merchantId returnPolicyId ReturnPolicyOnline]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicyonline/{returnPolicyId}",
     :uri-template-args
     {"merchantId" merchantId, "returnPolicyId" returnPolicyId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ReturnPolicyOnline}))

(defn returnpolicyonline-list
  "Lists all existing return policies.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicyonline/list

merchantId <> "
  [merchantId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicyonline",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn reports-search
  "Retrieves merchant performance metrics matching the search query and optionally segmented by selected dimensions.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/reports/search

merchantId <> 
SearchRequest:
SearchRequest"
  [merchantId SearchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/reports/search",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body SearchRequest}))

(defn shoppingadsprogram-get
  "Retrieves the status and review eligibility for the Shopping Ads program. Returns errors and warnings if they require action to resolve, will become disapprovals, or impact impressions. Use `accountstatuses` to view all issues for an account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shoppingadsprogram/get

merchantId <> "
  [merchantId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/shoppingadsprogram",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn shoppingadsprogram-requestreview
  "Requests a review of Shopping ads in a specific region. This method deprecated. Use the `MerchantSupportService` to view product and account issues and request a review.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shoppingadsprogram/requestreview

merchantId <> 
RequestReviewShoppingAdsRequest:
RequestReviewShoppingAdsRequest"
  [merchantId RequestReviewShoppingAdsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/shoppingadsprogram/requestreview",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body RequestReviewShoppingAdsRequest}))

(defn pubsubnotificationsettings-get
  "Retrieves a Merchant Center account's pubsub notification settings.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pubsubnotificationsettings/get

merchantId <> "
  [merchantId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pubsubnotificationsettings",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn pubsubnotificationsettings-update
  "Register a Merchant Center account for pubsub notifications. Note that cloud topic name shouldn't be provided as part of the request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pubsubnotificationsettings/update

merchantId <> 
PubsubNotificationSettings:
PubsubNotificationSettings"
  [merchantId PubsubNotificationSettings]
  (client/api-request
    {:method :put,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pubsubnotificationsettings",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body PubsubNotificationSettings}))

(defn productstatuses-custombatch
  "Gets the statuses of multiple products in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/productstatuses/custombatch

ProductstatusesCustomBatchRequest:
ProductstatusesCustomBatchRequest"
  [ProductstatusesCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/productstatuses/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ProductstatusesCustomBatchRequest}))

(defn productstatuses-get
  "Gets the status of a product from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/productstatuses/get

merchantId <> 
productId <> 

optional:
destinations <string> If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination."
  ([merchantId productId]
    (productstatuses-get merchantId productId nil))
  ([merchantId productId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/productstatuses/{productId}",
       :uri-template-args
       {"merchantId" merchantId, "productId" productId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn productstatuses-list
  "Lists the statuses of the products in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/productstatuses/list

merchantId <> 

optional:
maxResults <integer> The maximum number of product statuses to return in the response, used for paging. The default value is 25. The maximum value is 250.
destinations <string> If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination."
  ([merchantId] (productstatuses-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/productstatuses",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn collections-get
  "Retrieves a collection from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/collections/get

merchantId <> 
collectionId <> "
  [merchantId collectionId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/collections/{collectionId}",
     :uri-template-args
     {"merchantId" merchantId, "collectionId" collectionId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn collections-list
  "Lists the collections in your Merchant Center account. The response might contain fewer items than specified by page_size. Rely on next_page_token to determine if there are more items to be requested.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/collections/list

merchantId <> 

optional:
pageSize <integer> The maximum number of collections to return in the response, used for paging. Defaults to 50; values above 1000 will be coerced to 1000."
  ([merchantId] (collections-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/collections",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn collections-create
  "Uploads a collection to your Merchant Center account. If a collection with the same collectionId already exists, this method updates that entry. In each update, the collection is completely replaced by the fields in the body of the update request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/collections/create

merchantId <> 
Collection:
Collection"
  [merchantId Collection]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/collections",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body Collection}))

(defn collections-delete
  "Deletes a collection from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/collections/delete

merchantId <> 
collectionId <> "
  [merchantId collectionId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/collections/{collectionId}",
     :uri-template-args
     {"merchantId" merchantId, "collectionId" collectionId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn returnaddress-custombatch
  "Batches multiple return address related calls in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnaddress/custombatch

ReturnaddressCustomBatchRequest:
ReturnaddressCustomBatchRequest"
  [ReturnaddressCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/returnaddress/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ReturnaddressCustomBatchRequest}))

(defn returnaddress-delete
  "Deletes a return address for the given Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnaddress/delete

merchantId <> 
returnAddressId <> "
  [merchantId returnAddressId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnaddress/{returnAddressId}",
     :uri-template-args
     {"merchantId" merchantId, "returnAddressId" returnAddressId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn returnaddress-get
  "Gets a return address of the Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnaddress/get

merchantId <> 
returnAddressId <> "
  [merchantId returnAddressId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnaddress/{returnAddressId}",
     :uri-template-args
     {"merchantId" merchantId, "returnAddressId" returnAddressId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn returnaddress-insert
  "Inserts a return address for the Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnaddress/insert

merchantId <> 
ReturnAddress:
ReturnAddress"
  [merchantId ReturnAddress]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnaddress",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ReturnAddress}))

(defn returnaddress-list
  "Lists the return addresses of the Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnaddress/list

merchantId <> 

optional:
maxResults <integer> The maximum number of addresses in the response, used for paging.
country <string> List only return addresses applicable to the given country of sale. When omitted, all return addresses are listed."
  ([merchantId] (returnaddress-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnaddress",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn orderreports-listdisbursements
  "Retrieves a report for disbursements from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orderreports/listdisbursements

merchantId <> 

optional:
maxResults <integer> The maximum number of disbursements to return in the response, used for paging.
disbursementStartDate <string> The first date which disbursements occurred. In ISO 8601 format.
disbursementEndDate <string> The last date which disbursements occurred. In ISO 8601 format. Default: current date."
  ([merchantId] (orderreports-listdisbursements merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orderreports/disbursements",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn orderreports-listtransactions
  "Retrieves a list of transactions for a disbursement from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orderreports/listtransactions

merchantId <> 
disbursementId <> 

optional:
maxResults <integer> The maximum number of disbursements to return in the response, used for paging.
transactionStartDate <string> The first date in which transaction occurred. In ISO 8601 format.
transactionEndDate <string> The last date in which transaction occurred. In ISO 8601 format. Default: current date."
  ([merchantId disbursementId]
    (orderreports-listtransactions merchantId disbursementId nil))
  ([merchantId disbursementId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orderreports/disbursements/{disbursementId}/transactions",
       :uri-template-args
       {"merchantId" merchantId, "disbursementId" disbursementId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn accounts-updatelabels
  "Updates labels that are assigned to the Merchant Center account by CSS user.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/updatelabels

merchantId <> 
accountId <> 
AccountsUpdateLabelsRequest:
AccountsUpdateLabelsRequest"
  [merchantId accountId AccountsUpdateLabelsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}/updatelabels",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body AccountsUpdateLabelsRequest}))

(defn accounts-list
  "Lists the sub-accounts in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/list

merchantId <> 

optional:
maxResults <integer> The maximum number of accounts to return in the response, used for paging.
view <string> Controls which fields will be populated. Acceptable values are: \"merchant\" and \"css\". The default value is \"merchant\".
label <string> If view is set to \"css\", only return accounts that are assigned label with given ID.
name <string> If set, only the accounts with the given name (case sensitive) will be returned."
  ([merchantId] (accounts-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn accounts-authinfo
  "Returns information about the authenticated user.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/authinfo"
  []
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/accounts/authinfo",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounts-delete
  "Deletes a Merchant Center sub-account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/delete

merchantId <> 
accountId <> 

optional:
force <boolean> Option to delete sub-accounts with products. The default value is false."
  ([merchantId accountId] (accounts-delete merchantId accountId nil))
  ([merchantId accountId optional]
    (client/api-request
      {:method :delete,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}",
       :uri-template-args
       {"merchantId" merchantId, "accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn accounts-listlinks
  "Returns the list of accounts linked to your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/listlinks

merchantId <> 
accountId <> 

optional:
maxResults <integer> The maximum number of links to return in the response, used for pagination. The minimum allowed value is 5 results per page. If provided value is lower than 5, it will be automatically increased to 5."
  ([merchantId accountId]
    (accounts-listlinks merchantId accountId nil))
  ([merchantId accountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}/listlinks",
       :uri-template-args
       {"merchantId" merchantId, "accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn accounts-custombatch
  "Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/custombatch

AccountsCustomBatchRequest:
AccountsCustomBatchRequest"
  [AccountsCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/accounts/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body AccountsCustomBatchRequest}))

(defn accounts-claimwebsite
  "Claims the website of a Merchant Center sub-account. Merchant accounts with approved third-party CSSs aren't required to claim a website.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/claimwebsite

merchantId <> 
accountId <> 

optional:
overwrite <boolean> Only available to selected merchants, for example multi-client accounts (MCAs) and their sub-accounts. When set to `True`, this option removes any existing claim on the requested website and replaces it with a claim from the account that makes the request."
  ([merchantId accountId]
    (accounts-claimwebsite merchantId accountId nil))
  ([merchantId accountId optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}/claimwebsite",
       :uri-template-args
       {"merchantId" merchantId, "accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn accounts-update
  "Updates a Merchant Center account. Any fields that are not provided are deleted from the resource.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/update

merchantId <> 
accountId <> 
Account:
Account"
  [merchantId accountId Account]
  (client/api-request
    {:method :put,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body Account}))

(defn accounts-requestphoneverification
  "Request verification code to start phone verification.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/requestphoneverification

merchantId <> 
accountId <> 
RequestPhoneVerificationRequest:
RequestPhoneVerificationRequest"
  [merchantId accountId RequestPhoneVerificationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}/requestphoneverification",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body RequestPhoneVerificationRequest}))

(defn accounts-link
  "Performs an action on a link between two Merchant Center accounts, namely accountId and linkedAccountId.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/link

merchantId <> 
accountId <> 
AccountsLinkRequest:
AccountsLinkRequest"
  [merchantId accountId AccountsLinkRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}/link",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body AccountsLinkRequest}))

(defn accounts-verifyphonenumber
  "Validates verification code to verify phone number for the account. If successful this will overwrite the value of `accounts.businessinformation.phoneNumber`. Only verified phone number will replace an existing verified phone number.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/verifyphonenumber

merchantId <> 
accountId <> 
VerifyPhoneNumberRequest:
VerifyPhoneNumberRequest"
  [merchantId accountId VerifyPhoneNumberRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}/verifyphonenumber",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body VerifyPhoneNumberRequest}))

(defn accounts-insert
  "Creates a Merchant Center sub-account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/insert

merchantId <> 
Account:
Account"
  [merchantId Account]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body Account}))

(defn accounts-get
  "Retrieves a Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/get

merchantId <> 
accountId <> 

optional:
view <string> Controls which fields will be populated. Acceptable values are: \"merchant\" and \"css\". The default value is \"merchant\"."
  ([merchantId accountId] (accounts-get merchantId accountId nil))
  ([merchantId accountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}",
       :uri-template-args
       {"merchantId" merchantId, "accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn accounts-credentials-create
  "Uploads credentials for the Merchant Center account. If credentials already exist for this Merchant Center account and purpose, this method updates them.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/credentials/create

accountId <> 
AccountCredentials:
AccountCredentials"
  [accountId AccountCredentials]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/credentials",
     :uri-template-args {"accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body AccountCredentials}))

(defn accounts-labels-list
  "Lists the labels assigned to an account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/labels/list

accountId <> 

optional:
pageSize <integer> The maximum number of labels to return. The service may return fewer than this value. If unspecified, at most 50 labels will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([accountId] (accounts-labels-list accountId nil))
  ([accountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/labels",
       :uri-template-args {"accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn accounts-labels-create
  "Creates a new label, not assigned to any account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/labels/create

accountId <> 
AccountLabel:
AccountLabel"
  [accountId AccountLabel]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/labels",
     :uri-template-args {"accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body AccountLabel}))

(defn accounts-labels-patch
  "Updates a label.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/labels/patch

accountId <> 
labelId <> 
AccountLabel:
AccountLabel"
  [accountId labelId AccountLabel]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/labels/{labelId}",
     :uri-template-args {"accountId" accountId, "labelId" labelId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body AccountLabel}))

(defn accounts-labels-delete
  "Deletes a label and removes it from all accounts to which it was assigned.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/labels/delete

accountId <> 
labelId <> "
  [accountId labelId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/labels/{labelId}",
     :uri-template-args {"accountId" accountId, "labelId" labelId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounts-returncarrier-create
  "Links return carrier to a merchant account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/returncarrier/create

accountId <> 
AccountReturnCarrier:
AccountReturnCarrier"
  [accountId AccountReturnCarrier]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/returncarrier",
     :uri-template-args {"accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body AccountReturnCarrier}))

(defn accounts-returncarrier-patch
  "Updates a return carrier in the merchant account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/returncarrier/patch

accountId <> 
carrierAccountId <> 
AccountReturnCarrier:
AccountReturnCarrier"
  [accountId carrierAccountId AccountReturnCarrier]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/returncarrier/{carrierAccountId}",
     :uri-template-args
     {"accountId" accountId, "carrierAccountId" carrierAccountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body AccountReturnCarrier}))

(defn accounts-returncarrier-delete
  "Delete a return carrier in the merchant account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/returncarrier/delete

accountId <> 
carrierAccountId <> "
  [accountId carrierAccountId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/returncarrier/{carrierAccountId}",
     :uri-template-args
     {"accountId" accountId, "carrierAccountId" carrierAccountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounts-returncarrier-list
  "Lists available return carriers in the merchant account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/returncarrier/list

accountId <> "
  [accountId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/returncarrier",
     :uri-template-args {"accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn orderinvoices-createchargeinvoice
  "Creates a charge invoice for a shipment group, and triggers a charge capture for orderinvoice enabled orders.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orderinvoices/createchargeinvoice

merchantId <> 
orderId <> 
OrderinvoicesCreateChargeInvoiceRequest:
OrderinvoicesCreateChargeInvoiceRequest"
  [merchantId orderId OrderinvoicesCreateChargeInvoiceRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orderinvoices/{orderId}/createChargeInvoice",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrderinvoicesCreateChargeInvoiceRequest}))

(defn orderinvoices-createrefundinvoice
  "Creates a refund invoice for one or more shipment groups, and triggers a refund for orderinvoice enabled orders. This can only be used for line items that have previously been charged using `createChargeInvoice`. All amounts (except for the summary) are incremental with respect to the previous invoice.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orderinvoices/createrefundinvoice

merchantId <> 
orderId <> 
OrderinvoicesCreateRefundInvoiceRequest:
OrderinvoicesCreateRefundInvoiceRequest"
  [merchantId orderId OrderinvoicesCreateRefundInvoiceRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orderinvoices/{orderId}/createRefundInvoice",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrderinvoicesCreateRefundInvoiceRequest}))

(defn quotas-list
  "Lists the daily call quota and usage per method for your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/quotas/list

merchantId <> 

optional:
pageSize <integer> The maximum number of quotas to return in the response, used for paging. Defaults to 500; values above 1000 will be coerced to 1000."
  ([merchantId] (quotas-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/quotas",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn regionalinventory-custombatch
  "Updates regional inventory for multiple products or regions in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/regionalinventory/custombatch

RegionalinventoryCustomBatchRequest:
RegionalinventoryCustomBatchRequest"
  [RegionalinventoryCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/regionalinventory/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body RegionalinventoryCustomBatchRequest}))

(defn regionalinventory-insert
  "Updates the regional inventory of a product in your Merchant Center account. If a regional inventory with the same region ID already exists, this method updates that entry.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/regionalinventory/insert

merchantId <> 
productId <> 
RegionalInventory:
RegionalInventory"
  [merchantId productId RegionalInventory]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products/{productId}/regionalinventory",
     :uri-template-args
     {"merchantId" merchantId, "productId" productId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body RegionalInventory}))

(defn localinventory-custombatch
  "Updates local inventory for multiple products or stores in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/localinventory/custombatch

LocalinventoryCustomBatchRequest:
LocalinventoryCustomBatchRequest"
  [LocalinventoryCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/localinventory/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body LocalinventoryCustomBatchRequest}))

(defn localinventory-insert
  "Updates the local inventory of a product in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/localinventory/insert

merchantId <> 
productId <> 
LocalInventory:
LocalInventory"
  [merchantId productId LocalInventory]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products/{productId}/localinventory",
     :uri-template-args
     {"merchantId" merchantId, "productId" productId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body LocalInventory}))

(defn liasettings-list
  "Lists the LIA settings of the sub-accounts in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/list

merchantId <> 

optional:
maxResults <integer> The maximum number of LIA settings to return in the response, used for paging."
  ([merchantId] (liasettings-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn liasettings-requestgmbaccess
  "Requests access to a specified Business Profile.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/requestgmbaccess

merchantId <> 
accountId <> 
gmbEmail <> "
  [merchantId accountId gmbEmail]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}/requestgmbaccess",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params {"gmbEmail" gmbEmail},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn liasettings-requestinventoryverification
  "Requests inventory validation for the specified country.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/requestinventoryverification

merchantId <> 
accountId <> 
country <> "
  [merchantId accountId country]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}/requestinventoryverification/{country}",
     :uri-template-args
     {"merchantId" merchantId,
      "accountId" accountId,
      "country" country},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn liasettings-custombatch
  "Retrieves and/or updates the LIA settings of multiple accounts in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/custombatch

LiasettingsCustomBatchRequest:
LiasettingsCustomBatchRequest"
  [LiasettingsCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/liasettings/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body LiasettingsCustomBatchRequest}))

(defn liasettings-setposdataprovider
  "Sets the POS data provider for the specified country.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/setposdataprovider

merchantId <> 
accountId <> 
country <> 

optional:
posDataProviderId <string> The ID of POS data provider.
posExternalAccountId <string> The account ID by which this merchant is known to the POS data provider."
  ([merchantId accountId country]
    (liasettings-setposdataprovider merchantId accountId country nil))
  ([merchantId accountId country optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}/setposdataprovider",
       :uri-template-args
       {"merchantId" merchantId, "accountId" accountId},
       :query-params (merge {"country" country} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn liasettings-setinventoryverificationcontact
  "Sets the inventory verification contract for the specified country.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/setinventoryverificationcontact

merchantId <> 
accountId <> 
country <> 
language <> 
contactName <> 
contactEmail <> "
  [merchantId accountId country language contactName contactEmail]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}/setinventoryverificationcontact",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params
     {"country" country,
      "language" language,
      "contactName" contactName,
      "contactEmail" contactEmail},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn liasettings-update
  "Updates the LIA settings of the account. Any fields that are not provided are deleted from the resource.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/update

merchantId <> 
accountId <> 
LiaSettings:
LiaSettings"
  [merchantId accountId LiaSettings]
  (client/api-request
    {:method :put,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body LiaSettings}))

(defn liasettings-listposdataproviders
  "Retrieves the list of POS data providers that have active settings for the all eiligible countries.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/listposdataproviders"
  []
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/liasettings/posdataproviders",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn liasettings-getaccessiblegmbaccounts
  "Retrieves the list of accessible Business Profiles.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/getaccessiblegmbaccounts

merchantId <> 
accountId <> "
  [merchantId accountId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}/accessiblegmbaccounts",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn liasettings-setomnichannelexperience
  "Sets the omnichannel experience for the specified country. Only supported for merchants whose POS data provider is trusted to enable the corresponding experience. For more context, see these help articles [about LFP](https://support.google.com/merchants/answer/7676652) and [how to get started](https://support.google.com/merchants/answer/7676578) with it.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/setomnichannelexperience

merchantId <> 
accountId <> 

optional:
country <string> The CLDR country code (for example, \"US\") for which the omnichannel experience is selected.
lsfType <string> The Local Store Front (LSF) type for this country. Acceptable values are: - \"`ghlsf`\" (Google-Hosted Local Store Front) - \"`mhlsfBasic`\" (Merchant-Hosted Local Store Front Basic) - \"`mhlsfFull`\" (Merchant-Hosted Local Store Front Full) More details about these types can be found here.
pickupTypes <string> The Pickup types for this country. Acceptable values are: - \"`pickupToday`\" - \"`pickupLater`\" "
  ([merchantId accountId]
    (liasettings-setomnichannelexperience merchantId accountId nil))
  ([merchantId accountId optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}/setomnichannelexperience",
       :uri-template-args
       {"merchantId" merchantId, "accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn liasettings-get
  "Retrieves the LIA settings of the account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/get

merchantId <> 
accountId <> "
  [merchantId accountId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn buyongoogleprograms-get
  "Retrieves a status of the BoG program for your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/buyongoogleprograms/get

merchantId <> 
regionCode <> "
  [merchantId regionCode]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/buyongoogleprograms/{regionCode}",
     :uri-template-args
     {"merchantId" merchantId, "regionCode" regionCode},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn buyongoogleprograms-patch
  "Updates the status of the BoG program for your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/buyongoogleprograms/patch

merchantId <> 
regionCode <> 
BuyOnGoogleProgramStatus:
BuyOnGoogleProgramStatus

optional:
updateMask <string> The list of fields to update. If the update mask is not provided, then all the fields set in buyOnGoogleProgramStatus will be updated. Clearing fields is only possible if update mask is provided."
  ([merchantId regionCode BuyOnGoogleProgramStatus]
    (buyongoogleprograms-patch
      merchantId
      regionCode
      BuyOnGoogleProgramStatus
      nil))
  ([merchantId regionCode BuyOnGoogleProgramStatus optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/buyongoogleprograms/{regionCode}",
       :uri-template-args
       {"merchantId" merchantId, "regionCode" regionCode},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"],
       :body BuyOnGoogleProgramStatus})))

(defn buyongoogleprograms-onboard
  "Onboards the BoG program in your Merchant Center account. By using this method, you agree to the [Terms of Service](https://merchants.google.com/mc/termsofservice/transactions/US/latest). Calling this method is only possible if the authenticated account is the same as the merchant id in the request. Calling this method multiple times will only accept Terms of Service if the latest version is not currently signed.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/buyongoogleprograms/onboard

merchantId <> 
regionCode <> 
OnboardBuyOnGoogleProgramRequest:
OnboardBuyOnGoogleProgramRequest"
  [merchantId regionCode OnboardBuyOnGoogleProgramRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/buyongoogleprograms/{regionCode}/onboard",
     :uri-template-args
     {"merchantId" merchantId, "regionCode" regionCode},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OnboardBuyOnGoogleProgramRequest}))

(defn buyongoogleprograms-requestreview
  "Requests review and then activates the BoG program in your Merchant Center account for the first time. Moves the program to the REVIEW_PENDING state. This method is only available to selected merchants.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/buyongoogleprograms/requestreview

merchantId <> 
regionCode <> 
RequestReviewBuyOnGoogleProgramRequest:
RequestReviewBuyOnGoogleProgramRequest"
  [merchantId regionCode RequestReviewBuyOnGoogleProgramRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/buyongoogleprograms/{regionCode}/requestreview",
     :uri-template-args
     {"merchantId" merchantId, "regionCode" regionCode},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body RequestReviewBuyOnGoogleProgramRequest}))

(defn buyongoogleprograms-activate
  "Reactivates the BoG program in your Merchant Center account. Moves the program to the active state when allowed, for example, when paused. This method is only available to selected merchants.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/buyongoogleprograms/activate

merchantId <> 
regionCode <> 
ActivateBuyOnGoogleProgramRequest:
ActivateBuyOnGoogleProgramRequest"
  [merchantId regionCode ActivateBuyOnGoogleProgramRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/buyongoogleprograms/{regionCode}/activate",
     :uri-template-args
     {"merchantId" merchantId, "regionCode" regionCode},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ActivateBuyOnGoogleProgramRequest}))

(defn buyongoogleprograms-pause
  "Pauses the BoG program in your Merchant Center account. This method is only available to selected merchants.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/buyongoogleprograms/pause

merchantId <> 
regionCode <> 
PauseBuyOnGoogleProgramRequest:
PauseBuyOnGoogleProgramRequest"
  [merchantId regionCode PauseBuyOnGoogleProgramRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/buyongoogleprograms/{regionCode}/pause",
     :uri-template-args
     {"merchantId" merchantId, "regionCode" regionCode},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body PauseBuyOnGoogleProgramRequest}))

(defn regions-get
  "Retrieves a region defined in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/regions/get

merchantId <> 
regionId <> "
  [merchantId regionId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/regions/{regionId}",
     :uri-template-args {"merchantId" merchantId, "regionId" regionId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn regions-create
  "Creates a region definition in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/regions/create

merchantId <> 
Region:
Region

optional:
regionId <string> Required. The id of the region to create."
  ([merchantId Region] (regions-create merchantId Region nil))
  ([merchantId Region optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/regions",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"],
       :body Region})))

(defn regions-patch
  "Updates a region definition in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/regions/patch

merchantId <> 
regionId <> 
Region:
Region

optional:
updateMask <string> Optional. The comma-separated field mask indicating the fields to update. Example: `\"displayName,postalCodeArea.regionCode\"`."
  ([merchantId regionId Region]
    (regions-patch merchantId regionId Region nil))
  ([merchantId regionId Region optional]
    (client/api-request
      {:method :patch,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/regions/{regionId}",
       :uri-template-args
       {"merchantId" merchantId, "regionId" regionId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"],
       :body Region})))

(defn regions-delete
  "Deletes a region definition from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/regions/delete

merchantId <> 
regionId <> "
  [merchantId regionId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/regions/{regionId}",
     :uri-template-args {"merchantId" merchantId, "regionId" regionId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn regions-list
  "Lists the regions in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/regions/list

merchantId <> 

optional:
pageSize <integer> The maximum number of regions to return. The service may return fewer than this value. If unspecified, at most 50 rules will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([merchantId] (regions-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/regions",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn freelistingsprogram-get
  "Retrieves the status and review eligibility for the free listing program. Returns errors and warnings if they require action to resolve, will become disapprovals, or impact impressions. Use `accountstatuses` to view all issues for an account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/freelistingsprogram/get

merchantId <> "
  [merchantId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/freelistingsprogram",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn freelistingsprogram-requestreview
  "Requests a review of free listings in a specific region. This method deprecated. Use the `MerchantSupportService` to view product and account issues and request a review.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/freelistingsprogram/requestreview

merchantId <> 
RequestReviewFreeListingsRequest:
RequestReviewFreeListingsRequest"
  [merchantId RequestReviewFreeListingsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/freelistingsprogram/requestreview",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body RequestReviewFreeListingsRequest}))

(defn freelistingsprogram-checkoutsettings-get
  "Gets Checkout settings for the given merchant. This includes information about review state, enrollment state and URL settings.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/freelistingsprogram/checkoutsettings/get

merchantId <> "
  [merchantId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/freelistingsprogram/checkoutsettings",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn freelistingsprogram-checkoutsettings-insert
  "Enrolls merchant in `Checkout` program.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/freelistingsprogram/checkoutsettings/insert

merchantId <> 
InsertCheckoutSettingsRequest:
InsertCheckoutSettingsRequest"
  [merchantId InsertCheckoutSettingsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/freelistingsprogram/checkoutsettings",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body InsertCheckoutSettingsRequest}))

(defn freelistingsprogram-checkoutsettings-delete
  "Deletes `Checkout` settings and unenrolls merchant from `Checkout` program.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/freelistingsprogram/checkoutsettings/delete

merchantId <> "
  [merchantId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/freelistingsprogram/checkoutsettings",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounttax-custombatch
  "Retrieves and updates tax settings of multiple accounts in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounttax/custombatch

AccounttaxCustomBatchRequest:
AccounttaxCustomBatchRequest"
  [AccounttaxCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/accounttax/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body AccounttaxCustomBatchRequest}))

(defn accounttax-get
  "Retrieves the tax settings of the account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounttax/get

merchantId <> 
accountId <> "
  [merchantId accountId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounttax/{accountId}",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounttax-list
  "Lists the tax settings of the sub-accounts in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounttax/list

merchantId <> 

optional:
maxResults <integer> The maximum number of tax settings to return in the response, used for paging."
  ([merchantId] (accounttax-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounttax",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn accounttax-update
  "Updates the tax settings of the account. Any fields that are not provided are deleted from the resource.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounttax/update

merchantId <> 
accountId <> 
AccountTax:
AccountTax"
  [merchantId accountId AccountTax]
  (client/api-request
    {:method :put,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounttax/{accountId}",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body AccountTax}))

(defn datafeeds-custombatch
  "Deletes, fetches, gets, inserts and updates multiple datafeeds in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/custombatch

DatafeedsCustomBatchRequest:
DatafeedsCustomBatchRequest"
  [DatafeedsCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/datafeeds/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body DatafeedsCustomBatchRequest}))

(defn datafeeds-delete
  "Deletes a datafeed configuration from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/delete

merchantId <> 
datafeedId <> "
  [merchantId datafeedId]
  (client/api-request
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeeds/{datafeedId}",
     :uri-template-args
     {"merchantId" merchantId, "datafeedId" datafeedId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn datafeeds-fetchnow
  "Invokes a fetch for the datafeed in your Merchant Center account. If you need to call this method more than once per day, we recommend you use the [Products service](https://developers.google.com/shopping-content/reference/rest/v2.1/products) to update your product data.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/fetchnow

merchantId <> 
datafeedId <> "
  [merchantId datafeedId]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeeds/{datafeedId}/fetchNow",
     :uri-template-args
     {"merchantId" merchantId, "datafeedId" datafeedId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn datafeeds-get
  "Retrieves a datafeed configuration from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/get

merchantId <> 
datafeedId <> "
  [merchantId datafeedId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeeds/{datafeedId}",
     :uri-template-args
     {"merchantId" merchantId, "datafeedId" datafeedId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn datafeeds-insert
  "Registers a datafeed configuration with your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/insert

merchantId <> 
Datafeed:
Datafeed"
  [merchantId Datafeed]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeeds",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body Datafeed}))

(defn datafeeds-list
  "Lists the configurations for datafeeds in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/list

merchantId <> 

optional:
maxResults <integer> The maximum number of products to return in the response, used for paging."
  ([merchantId] (datafeeds-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeeds",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn datafeeds-update
  "Updates a datafeed configuration of your Merchant Center account. Any fields that are not provided are deleted from the resource.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/update

merchantId <> 
datafeedId <> 
Datafeed:
Datafeed"
  [merchantId datafeedId Datafeed]
  (client/api-request
    {:method :put,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeeds/{datafeedId}",
     :uri-template-args
     {"merchantId" merchantId, "datafeedId" datafeedId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body Datafeed}))

(defn ordertrackingsignals-create
  "Creates new order tracking signal.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/ordertrackingsignals/create

merchantId <> 
OrderTrackingSignal:
OrderTrackingSignal"
  [merchantId OrderTrackingSignal]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/ordertrackingsignals",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrderTrackingSignal}))

(defn promotions-create
  "Inserts a promotion for your Merchant Center account. If the promotion already exists, then it updates the promotion instead. To [end or delete] (https://developers.google.com/shopping-content/guides/promotions#end_a_promotion) a promotion update the time period of the promotion to a time that has already passed.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/promotions/create

merchantId <> 
Promotion:
Promotion"
  [merchantId Promotion]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/promotions",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body Promotion}))

(defn promotions-get
  "Retrieves a promotion from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/promotions/get

merchantId <> 
id <> "
  [merchantId id]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/promotions/{id}",
     :uri-template-args {"merchantId" merchantId, "id" id},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn promotions-list
  "List all promotions from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/promotions/list

merchantId <> 

optional:
pageSize <integer> The maximum number of promotions to return. The service may return fewer than this value. If unspecified, at most 50 labels will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
countryCode <string> [CLDR country code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml) (for example, \"US\"), used as a filter on promotions target country.
languageCode <string> The two-letter ISO 639-1 language code associated with the promotions, used as a filter."
  ([merchantId] (promotions-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/promotions",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn csses-list
  "Lists CSS domains affiliated with a CSS group.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/csses/list

cssGroupId <> 

optional:
pageSize <integer> The maximum number of CSS domains to return. The service may return fewer than this value. If unspecified, at most 50 CSS domains will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([cssGroupId] (csses-list cssGroupId nil))
  ([cssGroupId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{cssGroupId}/csses",
       :uri-template-args {"cssGroupId" cssGroupId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn csses-get
  "Retrieves a single CSS domain by ID.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/csses/get

cssGroupId <> 
cssDomainId <> "
  [cssGroupId cssDomainId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{cssGroupId}/csses/{cssDomainId}",
     :uri-template-args
     {"cssGroupId" cssGroupId, "cssDomainId" cssDomainId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn csses-updatelabels
  "Updates labels that are assigned to a CSS domain by its CSS group.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/csses/updatelabels

cssGroupId <> 
cssDomainId <> 
LabelIds:
LabelIds"
  [cssGroupId cssDomainId LabelIds]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{cssGroupId}/csses/{cssDomainId}/updatelabels",
     :uri-template-args
     {"cssGroupId" cssGroupId, "cssDomainId" cssDomainId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body LabelIds}))

(defn merchantsupport-renderaccountissues
  "Provide a list of merchant's issues with a support content and available actions. This content and actions are meant to be rendered and shown in third-party applications.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/merchantsupport/renderaccountissues

merchantId <> 
RenderAccountIssuesRequestPayload:
RenderAccountIssuesRequestPayload

optional:
languageCode <string> Optional. The [IETF BCP-47](https://tools.ietf.org/html/bcp47) language code used to localize support content. If not set, the result will be in default language `en-US`.
timeZone <string> Optional. The [IANA](https://www.iana.org/time-zones) timezone used to localize times in support content. For example 'America/Los_Angeles'. If not set, results will use as a default UTC."
  ([merchantId RenderAccountIssuesRequestPayload]
    (merchantsupport-renderaccountissues
      merchantId
      RenderAccountIssuesRequestPayload
      nil))
  ([merchantId RenderAccountIssuesRequestPayload optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/merchantsupport/renderaccountissues",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"],
       :body RenderAccountIssuesRequestPayload})))

(defn merchantsupport-renderproductissues
  "Provide a list of issues for merchant's product with a support content and available actions. This content and actions are meant to be rendered and shown in third-party applications.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/merchantsupport/renderproductissues

merchantId <> 
productId <> 
RenderProductIssuesRequestPayload:
RenderProductIssuesRequestPayload

optional:
languageCode <string> Optional. The [IETF BCP-47](https://tools.ietf.org/html/bcp47) language code used to localize support content. If not set, the result will be in default language `en-US`.
timeZone <string> Optional. The [IANA](https://www.iana.org/time-zones) timezone used to localize times in support content. For example 'America/Los_Angeles'. If not set, results will use as a default UTC."
  ([merchantId productId RenderProductIssuesRequestPayload]
    (merchantsupport-renderproductissues
      merchantId
      productId
      RenderProductIssuesRequestPayload
      nil))
  ([merchantId productId RenderProductIssuesRequestPayload optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/merchantsupport/renderproductissues/{productId}",
       :uri-template-args
       {"merchantId" merchantId, "productId" productId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"],
       :body RenderProductIssuesRequestPayload})))

(defn merchantsupport-triggeraction
  "Start an action. The action can be requested by merchants in third-party application. Before merchants can request the action, the third-party application needs to show them action specific content and display a user input form. The action can be successfully started only once all `required` inputs are provided. If any `required` input is missing, or invalid value was provided, the service will return 400 error. Validation errors will contain Ids for all problematic field together with translated, human readable error messages that can be shown to the user.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/merchantsupport/triggeraction

merchantId <> 
TriggerActionPayload:
TriggerActionPayload

optional:
languageCode <string> Optional. Language code [IETF BCP 47 syntax](https://tools.ietf.org/html/bcp47) used to localize the response. If not set, the result will be in default language `en-US`."
  ([merchantId TriggerActionPayload]
    (merchantsupport-triggeraction
      merchantId
      TriggerActionPayload
      nil))
  ([merchantId TriggerActionPayload optional]
    (client/api-request
      {:method :post,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/merchantsupport/triggeraction",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"],
       :body TriggerActionPayload})))

(defn orders-list
  "Lists the orders in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/list

merchantId <> 

optional:
maxResults <integer> The maximum number of orders to return in the response, used for paging. The default value is 25 orders per page, and the maximum allowed value is 250 orders per page.
statuses <string> Obtains orders that match any of the specified statuses. Note that `active` is a shortcut for `pendingShipment` and `partiallyShipped`, and `completed` is a shortcut for `shipped`, `partiallyDelivered`, `delivered`, `partiallyReturned`, `returned`, and `canceled`.
placedDateStart <string> Obtains orders placed after this date (inclusively), in ISO 8601 format.
placedDateEnd <string> Obtains orders placed before this date (exclusively), in ISO 8601 format.
orderBy <string> Order results by placement date in descending or ascending order. Acceptable values are: - placedDateAsc - placedDateDesc 
acknowledged <boolean> Obtains orders that match the acknowledgement status. When set to true, obtains orders that have been acknowledged. When false, obtains orders that have not been acknowledged. We recommend using this filter set to `false`, in conjunction with the `acknowledge` call, such that only un-acknowledged orders are returned. "
  ([merchantId] (orders-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn orders-updatemerchantorderid
  "Updates the merchant order ID for a given order.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/updatemerchantorderid

merchantId <> 
orderId <> 
OrdersUpdateMerchantOrderIdRequest:
OrdersUpdateMerchantOrderIdRequest"
  [merchantId orderId OrdersUpdateMerchantOrderIdRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/updateMerchantOrderId",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersUpdateMerchantOrderIdRequest}))

(defn orders-refunditem
  "Issues a partial or total refund for items and shipment.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/refunditem

merchantId <> 
orderId <> 
OrdersRefundItemRequest:
OrdersRefundItemRequest"
  [merchantId orderId OrdersRefundItemRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/refunditem",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersRefundItemRequest}))

(defn orders-getbymerchantorderid
  "Retrieves an order using merchant order ID.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/getbymerchantorderid

merchantId <> 
merchantOrderId <> "
  [merchantId merchantOrderId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/ordersbymerchantid/{merchantOrderId}",
     :uri-template-args
     {"merchantId" merchantId, "merchantOrderId" merchantOrderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn orders-cancel
  "Cancels all line items in an order, making a full refund.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/cancel

merchantId <> 
orderId <> 
OrdersCancelRequest:
OrdersCancelRequest"
  [merchantId orderId OrdersCancelRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/cancel",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersCancelRequest}))

(defn orders-shiplineitems
  "Marks line item(s) as shipped.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/shiplineitems

merchantId <> 
orderId <> 
OrdersShipLineItemsRequest:
OrdersShipLineItemsRequest"
  [merchantId orderId OrdersShipLineItemsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/shipLineItems",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersShipLineItemsRequest}))

(defn orders-captureOrder
  "Capture funds from the customer for the current order total. This method should be called after the merchant verifies that they are able and ready to start shipping the order. This method blocks until a response is received from the payment processsor. If this method succeeds, the merchant is guaranteed to receive funds for the order after shipment. If the request fails, it can be retried or the order may be cancelled. This method cannot be called after the entire order is already shipped. A rejected error code is returned when the payment service provider has declined the charge. This indicates a problem between the PSP and either the merchant's or customer's account. Sometimes this error will be resolved by the customer. We recommend retrying these errors once per day or cancelling the order with reason `failedToCaptureFunds` if the items cannot be held.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/captureOrder

merchantId <> 
orderId <> 
CaptureOrderRequest:
CaptureOrderRequest"
  [merchantId orderId CaptureOrderRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/captureOrder",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body CaptureOrderRequest}))

(defn orders-rejectreturnlineitem
  "Rejects return on an line item.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/rejectreturnlineitem

merchantId <> 
orderId <> 
OrdersRejectReturnLineItemRequest:
OrdersRejectReturnLineItemRequest"
  [merchantId orderId OrdersRejectReturnLineItemRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/rejectReturnLineItem",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersRejectReturnLineItemRequest}))

(defn orders-canceltestorderbycustomer
  "Sandbox only. Cancels a test order for customer-initiated cancellation.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/canceltestorderbycustomer

merchantId <> 
orderId <> 
OrdersCancelTestOrderByCustomerRequest:
OrdersCancelTestOrderByCustomerRequest"
  [merchantId orderId OrdersCancelTestOrderByCustomerRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/testorders/{orderId}/cancelByCustomer",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersCancelTestOrderByCustomerRequest}))

(defn orders-setlineitemmetadata
  "Sets (or overrides if it already exists) merchant provided annotations in the form of key-value pairs. A common use case would be to supply us with additional structured information about a line item that cannot be provided through other methods. Submitted key-value pairs can be retrieved as part of the orders resource.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/setlineitemmetadata

merchantId <> 
orderId <> 
OrdersSetLineItemMetadataRequest:
OrdersSetLineItemMetadataRequest"
  [merchantId orderId OrdersSetLineItemMetadataRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/setLineItemMetadata",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersSetLineItemMetadataRequest}))

(defn orders-gettestordertemplate
  "Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/gettestordertemplate

merchantId <> 
templateName <> 

optional:
country <string> The country of the template to retrieve. Defaults to \"`US`\"."
  ([merchantId templateName]
    (orders-gettestordertemplate merchantId templateName nil))
  ([merchantId templateName optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/testordertemplates/{templateName}",
       :uri-template-args
       {"merchantId" merchantId, "templateName" templateName},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn orders-createtestorder
  "Sandbox only. Creates a test order.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/createtestorder

merchantId <> 
OrdersCreateTestOrderRequest:
OrdersCreateTestOrderRequest"
  [merchantId OrdersCreateTestOrderRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/testorders",
     :uri-template-args {"merchantId" merchantId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersCreateTestOrderRequest}))

(defn orders-advancetestorder
  "Sandbox only. Moves a test order from state \"`inProgress`\" to state \"`pendingShipment`\".
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/advancetestorder

merchantId <> 
orderId <> "
  [merchantId orderId]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/testorders/{orderId}/advance",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn orders-returnrefundlineitem
  "Returns and refunds a line item. Note that this method can only be called on fully shipped orders. The Orderreturns API is the preferred way to handle returns after you receive a return from a customer. You can use Orderreturns.list or Orderreturns.get to search for the return, and then use Orderreturns.processreturn to issue the refund. If the return cannot be found, then we recommend using this API to issue a refund.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/returnrefundlineitem

merchantId <> 
orderId <> 
OrdersReturnRefundLineItemRequest:
OrdersReturnRefundLineItemRequest"
  [merchantId orderId OrdersReturnRefundLineItemRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/returnRefundLineItem",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersReturnRefundLineItemRequest}))

(defn orders-updateshipment
  "Updates a shipment's status, carrier, and/or tracking ID.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/updateshipment

merchantId <> 
orderId <> 
OrdersUpdateShipmentRequest:
OrdersUpdateShipmentRequest"
  [merchantId orderId OrdersUpdateShipmentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/updateShipment",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersUpdateShipmentRequest}))

(defn orders-acknowledge
  "Marks an order as acknowledged.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/acknowledge

merchantId <> 
orderId <> 
OrdersAcknowledgeRequest:
OrdersAcknowledgeRequest"
  [merchantId orderId OrdersAcknowledgeRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/acknowledge",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersAcknowledgeRequest}))

(defn orders-createtestreturn
  "Sandbox only. Creates a test return.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/createtestreturn

merchantId <> 
orderId <> 
OrdersCreateTestReturnRequest:
OrdersCreateTestReturnRequest"
  [merchantId orderId OrdersCreateTestReturnRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/testreturn",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersCreateTestReturnRequest}))

(defn orders-instorerefundlineitem
  "Deprecated. Notifies that item return and refund was handled directly by merchant outside of Google payments processing (for example, cash refund done in store). Note: We recommend calling the returnrefundlineitem method to refund in-store returns. We will issue the refund directly to the customer. This helps to prevent possible differences arising between merchant and Google transaction records. We also recommend having the point of sale system communicate with Google to ensure that customers do not receive a double refund by first refunding through Google then through an in-store return.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/instorerefundlineitem

merchantId <> 
orderId <> 
OrdersInStoreRefundLineItemRequest:
OrdersInStoreRefundLineItemRequest"
  [merchantId orderId OrdersInStoreRefundLineItemRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/inStoreRefundLineItem",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersInStoreRefundLineItemRequest}))

(defn orders-updatelineitemshippingdetails
  "Updates ship by and delivery by dates for a line item.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/updatelineitemshippingdetails

merchantId <> 
orderId <> 
OrdersUpdateLineItemShippingDetailsRequest:
OrdersUpdateLineItemShippingDetailsRequest"
  [merchantId orderId OrdersUpdateLineItemShippingDetailsRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/updateLineItemShippingDetails",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersUpdateLineItemShippingDetailsRequest}))

(defn orders-refundorder
  "Issues a partial or total refund for an order.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/refundorder

merchantId <> 
orderId <> 
OrdersRefundOrderRequest:
OrdersRefundOrderRequest"
  [merchantId orderId OrdersRefundOrderRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/refundorder",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersRefundOrderRequest}))

(defn orders-cancellineitem
  "Cancels a line item, making a full refund.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/cancellineitem

merchantId <> 
orderId <> 
OrdersCancelLineItemRequest:
OrdersCancelLineItemRequest"
  [merchantId orderId OrdersCancelLineItemRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}/cancelLineItem",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body OrdersCancelLineItemRequest}))

(defn orders-get
  "Retrieves an order from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/orders/get

merchantId <> 
orderId <> "
  [merchantId orderId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/orders/{orderId}",
     :uri-template-args {"merchantId" merchantId, "orderId" orderId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accountstatuses-custombatch
  "Retrieves multiple Merchant Center account statuses in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accountstatuses/custombatch

AccountstatusesCustomBatchRequest:
AccountstatusesCustomBatchRequest"
  [AccountstatusesCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/accountstatuses/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body AccountstatusesCustomBatchRequest}))

(defn accountstatuses-get
  "Retrieves the status of a Merchant Center account. No itemLevelIssues are returned for multi-client accounts.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accountstatuses/get

merchantId <> 
accountId <> 

optional:
destinations <string> If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination."
  ([merchantId accountId]
    (accountstatuses-get merchantId accountId nil))
  ([merchantId accountId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accountstatuses/{accountId}",
       :uri-template-args
       {"merchantId" merchantId, "accountId" accountId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn accountstatuses-list
  "Lists the statuses of the sub-accounts in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accountstatuses/list

merchantId <> 

optional:
maxResults <integer> The maximum number of account statuses to return in the response, used for paging.
destinations <string> If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
name <string> If set, only the accounts with the given name (case sensitive) will be returned."
  ([merchantId] (accountstatuses-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accountstatuses",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn datafeedstatuses-custombatch
  "Gets multiple Merchant Center datafeed statuses in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeedstatuses/custombatch

DatafeedstatusesCustomBatchRequest:
DatafeedstatusesCustomBatchRequest"
  [DatafeedstatusesCustomBatchRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/datafeedstatuses/batch",
     :uri-template-args {},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/content"],
     :body DatafeedstatusesCustomBatchRequest}))

(defn datafeedstatuses-get
  "Retrieves the status of a datafeed from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeedstatuses/get

merchantId <> 
datafeedId <> 

optional:
country <string> Deprecated. Use `feedLabel` instead. The country to get the datafeed status for. If this parameter is provided then `language` must also be provided. Note that this parameter is required for feeds targeting multiple countries and languages, since a feed may have a different status for each target.
feedLabel <string> The feed label to get the datafeed status for. If this parameter is provided then `language` must also be provided. Note that this parameter is required for feeds targeting multiple countries and languages, since a feed may have a different status for each target.
language <string> The language to get the datafeed status for. If this parameter is provided then `country` must also be provided. Note that this parameter is required for feeds targeting multiple countries and languages, since a feed may have a different status for each target."
  ([merchantId datafeedId]
    (datafeedstatuses-get merchantId datafeedId nil))
  ([merchantId datafeedId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeedstatuses/{datafeedId}",
       :uri-template-args
       {"merchantId" merchantId, "datafeedId" datafeedId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))

(defn datafeedstatuses-list
  "Lists the statuses of the datafeeds in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeedstatuses/list

merchantId <> 

optional:
maxResults <integer> The maximum number of products to return in the response, used for paging."
  ([merchantId] (datafeedstatuses-list merchantId nil))
  ([merchantId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeedstatuses",
       :uri-template-args {"merchantId" merchantId},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/content"]})))
