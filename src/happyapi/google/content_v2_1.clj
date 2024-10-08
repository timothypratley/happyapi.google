(ns happyapi.google.content-v2-1
  "Content API for Shopping
Manage your product listings and accounts for Google Shopping
See: https://developers.google.com/shopping-content/guides/quickstart")

(defn conversionsources-create
  "Creates a new conversion source.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/conversionsources/create

merchantId <> 
ConversionSource:
ConversionSource"
  [merchantId ConversionSource]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/conversionsources",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body ConversionSource})

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
    {:method :patch,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/conversionsources/{conversionSourceId}",
     :uri-template-args
     {"merchantId" merchantId,
      "conversionSourceId" conversionSourceId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"],
     :body ConversionSource}))

(defn conversionsources-delete
  "Archives an existing conversion source. It will be recoverable for 30 days. This archiving behavior is not typical in the Content API and unique to this service.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/conversionsources/delete

merchantId <> 
conversionSourceId <> "
  [merchantId conversionSourceId]
  {:method :delete,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/conversionsources/{conversionSourceId}",
   :uri-template-args
   {"merchantId" merchantId, "conversionSourceId" conversionSourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn conversionsources-undelete
  "Re-enables an archived conversion source.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/conversionsources/undelete

merchantId <> 
conversionSourceId <> 
UndeleteConversionSourceRequest:
UndeleteConversionSourceRequest"
  [merchantId conversionSourceId UndeleteConversionSourceRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/conversionsources/{conversionSourceId}:undelete",
   :uri-template-args
   {"merchantId" merchantId, "conversionSourceId" conversionSourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body UndeleteConversionSourceRequest})

(defn conversionsources-get
  "Fetches a conversion source.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/conversionsources/get

merchantId <> 
conversionSourceId <> "
  [merchantId conversionSourceId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/conversionsources/{conversionSourceId}",
   :uri-template-args
   {"merchantId" merchantId, "conversionSourceId" conversionSourceId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn conversionsources-list
  "Retrieves the list of conversion sources the caller has access to.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/conversionsources/list

merchantId <> 

optional:
pageSize <integer> The maximum number of conversion sources to return in a page. If no `page_size` is specified, `100` is used as the default value. The maximum value is `200`. Values above `200` will be coerced to `200`. Regardless of pagination, at most `200` conversion sources are returned in total.
showDeleted <boolean> If true, also returns archived conversion sources."
  ([merchantId] (conversionsources-list merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/conversionsources",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn products-custombatch
  "Retrieves, inserts, and deletes multiple products in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/products/custombatch

ProductsCustomBatchRequest:
ProductsCustomBatchRequest"
  [ProductsCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/products/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body ProductsCustomBatchRequest})

(defn products-delete
  "Deletes a product from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/products/delete

merchantId <> 
productId <> 

optional:
feedId <string> The Content API Supplemental Feed ID. If present then product deletion applies to the data in a supplemental feed. If absent, entire product will be deleted."
  ([merchantId productId] (products-delete merchantId productId nil))
  ([merchantId productId optional]
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products/{productId}",
     :uri-template-args
     {"merchantId" merchantId, "productId" productId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn products-get
  "Retrieves a product from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/products/get

merchantId <> 
productId <> "
  [merchantId productId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products/{productId}",
   :uri-template-args {"merchantId" merchantId, "productId" productId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

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
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"],
     :body Product}))

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
    {:method :patch,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products/{productId}",
     :uri-template-args
     {"merchantId" merchantId, "productId" productId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"],
     :body Product}))

(defn products-list
  "Lists the products in your Merchant Center account. The response might contain fewer items than specified by maxResults. Rely on nextPageToken to determine if there are more items to be requested.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/products/list

merchantId <> 

optional:
maxResults <integer> The maximum number of products to return in the response, used for paging. The default value is 25. The maximum value is 250."
  ([merchantId] (products-list merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn shippingsettings-custombatch
  "Retrieves and updates the shipping settings of multiple accounts in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/custombatch

ShippingsettingsCustomBatchRequest:
ShippingsettingsCustomBatchRequest"
  [ShippingsettingsCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/shippingsettings/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body ShippingsettingsCustomBatchRequest})

(defn shippingsettings-get
  "Retrieves the shipping settings of the account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/get

merchantId <> 
accountId <> "
  [merchantId accountId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/shippingsettings/{accountId}",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn shippingsettings-getsupportedcarriers
  "Retrieves supported carriers and carrier services for an account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/getsupportedcarriers

merchantId <> "
  [merchantId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/supportedCarriers",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn shippingsettings-getsupportedholidays
  "Retrieves supported holidays for an account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/getsupportedholidays

merchantId <> "
  [merchantId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/supportedHolidays",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn shippingsettings-getsupportedpickupservices
  "Retrieves supported pickup services for an account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/getsupportedpickupservices

merchantId <> "
  [merchantId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/supportedPickupServices",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn shippingsettings-list
  "Lists the shipping settings of the sub-accounts in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/list

merchantId <> 

optional:
maxResults <integer> The maximum number of shipping settings to return in the response, used for paging."
  ([merchantId] (shippingsettings-list merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/shippingsettings",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn shippingsettings-update
  "Updates the shipping settings of the account. Any fields that are not provided are deleted from the resource.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shippingsettings/update

merchantId <> 
accountId <> 
ShippingSettings:
ShippingSettings"
  [merchantId accountId ShippingSettings]
  {:method :put,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/shippingsettings/{accountId}",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body ShippingSettings})

(defn returnpolicy-custombatch
  "Batches multiple return policy related calls in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicy/custombatch

ReturnpolicyCustomBatchRequest:
ReturnpolicyCustomBatchRequest"
  [ReturnpolicyCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/returnpolicy/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body ReturnpolicyCustomBatchRequest})

(defn returnpolicy-delete
  "Deletes a return policy for the given Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicy/delete

merchantId <> 
returnPolicyId <> "
  [merchantId returnPolicyId]
  {:method :delete,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicy/{returnPolicyId}",
   :uri-template-args
   {"merchantId" merchantId, "returnPolicyId" returnPolicyId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn returnpolicy-get
  "Gets a return policy of the Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicy/get

merchantId <> 
returnPolicyId <> "
  [merchantId returnPolicyId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicy/{returnPolicyId}",
   :uri-template-args
   {"merchantId" merchantId, "returnPolicyId" returnPolicyId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn returnpolicy-insert
  "Inserts a return policy for the Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicy/insert

merchantId <> 
ReturnPolicy:
ReturnPolicy"
  [merchantId ReturnPolicy]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicy",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body ReturnPolicy})

(defn returnpolicy-list
  "Lists the return policies of the Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicy/list

merchantId <> "
  [merchantId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicy",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn collectionstatuses-get
  "Gets the status of a collection from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/collectionstatuses/get

merchantId <> 
collectionId <> "
  [merchantId collectionId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/collectionstatuses/{collectionId}",
   :uri-template-args
   {"merchantId" merchantId, "collectionId" collectionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn collectionstatuses-list
  "Lists the statuses of the collections in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/collectionstatuses/list

merchantId <> 

optional:
pageSize <integer> The maximum number of collection statuses to return in the response, used for paging. Defaults to 50; values above 1000 will be coerced to 1000."
  ([merchantId] (collectionstatuses-list merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/collectionstatuses",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn pos-custombatch
  "Batches multiple POS-related calls in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/custombatch

PosCustomBatchRequest:
PosCustomBatchRequest"
  [PosCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/pos/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body PosCustomBatchRequest})

(defn pos-delete
  "Deletes a store for the given merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/delete

merchantId <> 
targetMerchantId <> 
storeCode <> "
  [merchantId targetMerchantId storeCode]
  {:method :delete,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pos/{targetMerchantId}/store/{storeCode}",
   :uri-template-args
   {"merchantId" merchantId,
    "targetMerchantId" targetMerchantId,
    "storeCode" storeCode},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn pos-get
  "Retrieves information about the given store.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/get

merchantId <> 
targetMerchantId <> 
storeCode <> "
  [merchantId targetMerchantId storeCode]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pos/{targetMerchantId}/store/{storeCode}",
   :uri-template-args
   {"merchantId" merchantId,
    "targetMerchantId" targetMerchantId,
    "storeCode" storeCode},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn pos-insert
  "Creates a store for the given merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/insert

merchantId <> 
targetMerchantId <> 
PosStore:
PosStore"
  [merchantId targetMerchantId PosStore]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pos/{targetMerchantId}/store",
   :uri-template-args
   {"merchantId" merchantId, "targetMerchantId" targetMerchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body PosStore})

(defn pos-inventory
  "Submit inventory for the given merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/inventory

merchantId <> 
targetMerchantId <> 
PosInventoryRequest:
PosInventoryRequest"
  [merchantId targetMerchantId PosInventoryRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pos/{targetMerchantId}/inventory",
   :uri-template-args
   {"merchantId" merchantId, "targetMerchantId" targetMerchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body PosInventoryRequest})

(defn pos-list
  "Lists the stores of the target merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/list

merchantId <> 
targetMerchantId <> "
  [merchantId targetMerchantId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pos/{targetMerchantId}/store",
   :uri-template-args
   {"merchantId" merchantId, "targetMerchantId" targetMerchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn pos-sale
  "Submit a sale event for the given merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pos/sale

merchantId <> 
targetMerchantId <> 
PosSaleRequest:
PosSaleRequest"
  [merchantId targetMerchantId PosSaleRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pos/{targetMerchantId}/sale",
   :uri-template-args
   {"merchantId" merchantId, "targetMerchantId" targetMerchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body PosSaleRequest})

(defn productdeliverytime-create
  "Creates or updates the delivery time of a product.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/productdeliverytime/create

merchantId <> 
ProductDeliveryTime:
ProductDeliveryTime"
  [merchantId ProductDeliveryTime]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/productdeliverytime",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body ProductDeliveryTime})

(defn productdeliverytime-get
  "Gets `productDeliveryTime` by `productId`.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/productdeliverytime/get

merchantId <> 
productId <> "
  [merchantId productId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/productdeliverytime/{productId}",
   :uri-template-args {"merchantId" merchantId, "productId" productId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn productdeliverytime-delete
  "Deletes the delivery time of a product.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/productdeliverytime/delete

merchantId <> 
productId <> "
  [merchantId productId]
  {:method :delete,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/productdeliverytime/{productId}",
   :uri-template-args {"merchantId" merchantId, "productId" productId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn recommendations-generate
  "Generates recommendations for a merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/recommendations/generate

merchantId <> 

optional:
languageCode <string> Optional. Language code of the client. If not set, the result will be in default language (English). This language code affects all fields prefixed with \"localized\". This should be set to ISO 639-1 country code. List of currently verified supported language code: en, fr, cs, da, de, es, it, nl, no, pl, pt, pt, fi, sv, vi, tr, th, ko, zh-CN, zh-TW, ja, id, hi
allowedTag <string> Optional. List of allowed tags. Tags are a set of predefined strings that describe the category that individual recommendation types belong to. User can specify zero or more tags in this field to indicate what categories of recommendations they want to receive. Current list of supported tags: - TREND"
  ([merchantId] (recommendations-generate merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/recommendations/generate",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn recommendations-reportInteraction
  "Reports an interaction on a recommendation for a merchant.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/recommendations/reportInteraction

merchantId <> 
ReportInteractionRequest:
ReportInteractionRequest"
  [merchantId ReportInteractionRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/recommendations/reportInteraction",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body ReportInteractionRequest})

(defn settlementreports-get
  "Retrieves a settlement report from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/settlementreports/get

merchantId <> 
settlementId <> "
  [merchantId settlementId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/settlementreports/{settlementId}",
   :uri-template-args
   {"merchantId" merchantId, "settlementId" settlementId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

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
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/settlementreports",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

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
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/settlementreports/{settlementId}/transactions",
     :uri-template-args
     {"merchantId" merchantId, "settlementId" settlementId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn returnpolicyonline-get
  "Gets an existing return policy.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicyonline/get

merchantId <> 
returnPolicyId <> "
  [merchantId returnPolicyId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicyonline/{returnPolicyId}",
   :uri-template-args
   {"merchantId" merchantId, "returnPolicyId" returnPolicyId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn returnpolicyonline-create
  "Creates a new return policy.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicyonline/create

merchantId <> 
ReturnPolicyOnline:
ReturnPolicyOnline"
  [merchantId ReturnPolicyOnline]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicyonline",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body ReturnPolicyOnline})

(defn returnpolicyonline-delete
  "Deletes an existing return policy.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicyonline/delete

merchantId <> 
returnPolicyId <> "
  [merchantId returnPolicyId]
  {:method :delete,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicyonline/{returnPolicyId}",
   :uri-template-args
   {"merchantId" merchantId, "returnPolicyId" returnPolicyId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn returnpolicyonline-patch
  "Updates an existing return policy.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicyonline/patch

merchantId <> 
returnPolicyId <> 
ReturnPolicyOnline:
ReturnPolicyOnline"
  [merchantId returnPolicyId ReturnPolicyOnline]
  {:method :patch,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicyonline/{returnPolicyId}",
   :uri-template-args
   {"merchantId" merchantId, "returnPolicyId" returnPolicyId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body ReturnPolicyOnline})

(defn returnpolicyonline-list
  "Lists all existing return policies.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnpolicyonline/list

merchantId <> "
  [merchantId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnpolicyonline",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn reports-search
  "Retrieves merchant performance metrics matching the search query and optionally segmented by selected dimensions.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/reports/search

merchantId <> 
SearchRequest:
SearchRequest"
  [merchantId SearchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/reports/search",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body SearchRequest})

(defn shoppingadsprogram-get
  "Retrieves the status and review eligibility for the Shopping Ads program. Returns errors and warnings if they require action to resolve, will become disapprovals, or impact impressions. Use `accountstatuses` to view all issues for an account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shoppingadsprogram/get

merchantId <> "
  [merchantId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/shoppingadsprogram",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn shoppingadsprogram-requestreview
  "Requests a review of Shopping ads in a specific region. This method deprecated. Use the `MerchantSupportService` to view product and account issues and request a review.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/shoppingadsprogram/requestreview

merchantId <> 
RequestReviewShoppingAdsRequest:
RequestReviewShoppingAdsRequest"
  [merchantId RequestReviewShoppingAdsRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/shoppingadsprogram/requestreview",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body RequestReviewShoppingAdsRequest})

(defn pubsubnotificationsettings-get
  "Retrieves a Merchant Center account's pubsub notification settings.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pubsubnotificationsettings/get

merchantId <> "
  [merchantId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pubsubnotificationsettings",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn pubsubnotificationsettings-update
  "Register a Merchant Center account for pubsub notifications. Note that cloud topic name shouldn't be provided as part of the request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/pubsubnotificationsettings/update

merchantId <> 
PubsubNotificationSettings:
PubsubNotificationSettings"
  [merchantId PubsubNotificationSettings]
  {:method :put,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/pubsubnotificationsettings",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body PubsubNotificationSettings})

(defn productstatuses-custombatch
  "Gets the statuses of multiple products in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/productstatuses/custombatch

ProductstatusesCustomBatchRequest:
ProductstatusesCustomBatchRequest"
  [ProductstatusesCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/productstatuses/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body ProductstatusesCustomBatchRequest})

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
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/productstatuses/{productId}",
     :uri-template-args
     {"merchantId" merchantId, "productId" productId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn productstatuses-list
  "Lists the statuses of the products in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/productstatuses/list

merchantId <> 

optional:
maxResults <integer> The maximum number of product statuses to return in the response, used for paging. The default value is 25. The maximum value is 250.
destinations <string> If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination."
  ([merchantId] (productstatuses-list merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/productstatuses",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn collections-get
  "Retrieves a collection from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/collections/get

merchantId <> 
collectionId <> "
  [merchantId collectionId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/collections/{collectionId}",
   :uri-template-args
   {"merchantId" merchantId, "collectionId" collectionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn collections-list
  "Lists the collections in your Merchant Center account. The response might contain fewer items than specified by page_size. Rely on next_page_token to determine if there are more items to be requested.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/collections/list

merchantId <> 

optional:
pageSize <integer> The maximum number of collections to return in the response, used for paging. Defaults to 50; values above 1000 will be coerced to 1000."
  ([merchantId] (collections-list merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/collections",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn collections-create
  "Uploads a collection to your Merchant Center account. If a collection with the same collectionId already exists, this method updates that entry. In each update, the collection is completely replaced by the fields in the body of the update request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/collections/create

merchantId <> 
Collection:
Collection"
  [merchantId Collection]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/collections",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body Collection})

(defn collections-delete
  "Deletes a collection from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/collections/delete

merchantId <> 
collectionId <> "
  [merchantId collectionId]
  {:method :delete,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/collections/{collectionId}",
   :uri-template-args
   {"merchantId" merchantId, "collectionId" collectionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn returnaddress-custombatch
  "Batches multiple return address related calls in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnaddress/custombatch

ReturnaddressCustomBatchRequest:
ReturnaddressCustomBatchRequest"
  [ReturnaddressCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/returnaddress/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body ReturnaddressCustomBatchRequest})

(defn returnaddress-delete
  "Deletes a return address for the given Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnaddress/delete

merchantId <> 
returnAddressId <> "
  [merchantId returnAddressId]
  {:method :delete,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnaddress/{returnAddressId}",
   :uri-template-args
   {"merchantId" merchantId, "returnAddressId" returnAddressId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn returnaddress-get
  "Gets a return address of the Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnaddress/get

merchantId <> 
returnAddressId <> "
  [merchantId returnAddressId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnaddress/{returnAddressId}",
   :uri-template-args
   {"merchantId" merchantId, "returnAddressId" returnAddressId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn returnaddress-insert
  "Inserts a return address for the Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnaddress/insert

merchantId <> 
ReturnAddress:
ReturnAddress"
  [merchantId ReturnAddress]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnaddress",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body ReturnAddress})

(defn returnaddress-list
  "Lists the return addresses of the Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/returnaddress/list

merchantId <> 

optional:
maxResults <integer> The maximum number of addresses in the response, used for paging.
country <string> List only return addresses applicable to the given country of sale. When omitted, all return addresses are listed."
  ([merchantId] (returnaddress-list merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/returnaddress",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounts-updatelabels
  "Updates labels that are assigned to the Merchant Center account by CSS user.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/updatelabels

merchantId <> 
accountId <> 
AccountsUpdateLabelsRequest:
AccountsUpdateLabelsRequest"
  [merchantId accountId AccountsUpdateLabelsRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}/updatelabels",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body AccountsUpdateLabelsRequest})

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
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounts-authinfo
  "Returns information about the authenticated user.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/authinfo"
  []
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/accounts/authinfo",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn accounts-delete
  "Deletes a Merchant Center sub-account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/delete

merchantId <> 
accountId <> 

optional:
force <boolean> Option to delete sub-accounts with products. The default value is false."
  ([merchantId accountId] (accounts-delete merchantId accountId nil))
  ([merchantId accountId optional]
    {:method :delete,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

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
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}/listlinks",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounts-custombatch
  "Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/custombatch

AccountsCustomBatchRequest:
AccountsCustomBatchRequest"
  [AccountsCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/accounts/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body AccountsCustomBatchRequest})

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
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}/claimwebsite",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounts-update
  "Updates a Merchant Center account. Any fields that are not provided are deleted from the resource.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/update

merchantId <> 
accountId <> 
Account:
Account"
  [merchantId accountId Account]
  {:method :put,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body Account})

(defn accounts-requestphoneverification
  "Request verification code to start phone verification.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/requestphoneverification

merchantId <> 
accountId <> 
RequestPhoneVerificationRequest:
RequestPhoneVerificationRequest"
  [merchantId accountId RequestPhoneVerificationRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}/requestphoneverification",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body RequestPhoneVerificationRequest})

(defn accounts-link
  "Performs an action on a link between two Merchant Center accounts, namely accountId and linkedAccountId.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/link

merchantId <> 
accountId <> 
AccountsLinkRequest:
AccountsLinkRequest"
  [merchantId accountId AccountsLinkRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}/link",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body AccountsLinkRequest})

(defn accounts-verifyphonenumber
  "Validates verification code to verify phone number for the account. If successful this will overwrite the value of `accounts.businessinformation.phoneNumber`. Only verified phone number will replace an existing verified phone number.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/verifyphonenumber

merchantId <> 
accountId <> 
VerifyPhoneNumberRequest:
VerifyPhoneNumberRequest"
  [merchantId accountId VerifyPhoneNumberRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}/verifyphonenumber",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body VerifyPhoneNumberRequest})

(defn accounts-insert
  "Creates a Merchant Center sub-account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/insert

merchantId <> 
Account:
Account"
  [merchantId Account]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body Account})

(defn accounts-get
  "Retrieves a Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/get

merchantId <> 
accountId <> 

optional:
view <string> Controls which fields will be populated. Acceptable values are: \"merchant\" and \"css\". The default value is \"merchant\"."
  ([merchantId accountId] (accounts-get merchantId accountId nil))
  ([merchantId accountId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounts/{accountId}",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounts-credentials-create
  "Uploads credentials for the Merchant Center account. If credentials already exist for this Merchant Center account and purpose, this method updates them.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/credentials/create

accountId <> 
AccountCredentials:
AccountCredentials"
  [accountId AccountCredentials]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/credentials",
   :uri-template-args {"accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body AccountCredentials})

(defn accounts-labels-list
  "Lists the labels assigned to an account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/labels/list

accountId <> 

optional:
pageSize <integer> The maximum number of labels to return. The service may return fewer than this value. If unspecified, at most 50 labels will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([accountId] (accounts-labels-list accountId nil))
  ([accountId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/labels",
     :uri-template-args {"accountId" accountId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounts-labels-create
  "Creates a new label, not assigned to any account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/labels/create

accountId <> 
AccountLabel:
AccountLabel"
  [accountId AccountLabel]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/labels",
   :uri-template-args {"accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body AccountLabel})

(defn accounts-labels-patch
  "Updates a label.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/labels/patch

accountId <> 
labelId <> 
AccountLabel:
AccountLabel"
  [accountId labelId AccountLabel]
  {:method :patch,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/labels/{labelId}",
   :uri-template-args {"accountId" accountId, "labelId" labelId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body AccountLabel})

(defn accounts-labels-delete
  "Deletes a label and removes it from all accounts to which it was assigned.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/labels/delete

accountId <> 
labelId <> "
  [accountId labelId]
  {:method :delete,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/labels/{labelId}",
   :uri-template-args {"accountId" accountId, "labelId" labelId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn accounts-returncarrier-create
  "Links return carrier to a merchant account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/returncarrier/create

accountId <> 
AccountReturnCarrier:
AccountReturnCarrier"
  [accountId AccountReturnCarrier]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/returncarrier",
   :uri-template-args {"accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body AccountReturnCarrier})

(defn accounts-returncarrier-patch
  "Updates a return carrier in the merchant account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/returncarrier/patch

accountId <> 
carrierAccountId <> 
AccountReturnCarrier:
AccountReturnCarrier"
  [accountId carrierAccountId AccountReturnCarrier]
  {:method :patch,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/returncarrier/{carrierAccountId}",
   :uri-template-args
   {"accountId" accountId, "carrierAccountId" carrierAccountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body AccountReturnCarrier})

(defn accounts-returncarrier-delete
  "Delete a return carrier in the merchant account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/returncarrier/delete

accountId <> 
carrierAccountId <> "
  [accountId carrierAccountId]
  {:method :delete,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/returncarrier/{carrierAccountId}",
   :uri-template-args
   {"accountId" accountId, "carrierAccountId" carrierAccountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn accounts-returncarrier-list
  "Lists available return carriers in the merchant account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounts/returncarrier/list

accountId <> "
  [accountId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/accounts/{accountId}/returncarrier",
   :uri-template-args {"accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn quotas-list
  "Lists the daily call quota and usage per method for your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/quotas/list

merchantId <> 

optional:
pageSize <integer> The maximum number of quotas to return in the response, used for paging. Defaults to 500; values above 1000 will be coerced to 1000."
  ([merchantId] (quotas-list merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/quotas",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn regionalinventory-custombatch
  "Updates regional inventory for multiple products or regions in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/regionalinventory/custombatch

RegionalinventoryCustomBatchRequest:
RegionalinventoryCustomBatchRequest"
  [RegionalinventoryCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/regionalinventory/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body RegionalinventoryCustomBatchRequest})

(defn regionalinventory-insert
  "Updates the regional inventory of a product in your Merchant Center account. If a regional inventory with the same region ID already exists, this method updates that entry.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/regionalinventory/insert

merchantId <> 
productId <> 
RegionalInventory:
RegionalInventory"
  [merchantId productId RegionalInventory]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products/{productId}/regionalinventory",
   :uri-template-args {"merchantId" merchantId, "productId" productId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body RegionalInventory})

(defn localinventory-custombatch
  "Updates local inventory for multiple products or stores in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/localinventory/custombatch

LocalinventoryCustomBatchRequest:
LocalinventoryCustomBatchRequest"
  [LocalinventoryCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/localinventory/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body LocalinventoryCustomBatchRequest})

(defn localinventory-insert
  "Updates the local inventory of a product in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/localinventory/insert

merchantId <> 
productId <> 
LocalInventory:
LocalInventory"
  [merchantId productId LocalInventory]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/products/{productId}/localinventory",
   :uri-template-args {"merchantId" merchantId, "productId" productId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body LocalInventory})

(defn liasettings-list
  "Lists the LIA settings of the sub-accounts in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/list

merchantId <> 

optional:
maxResults <integer> The maximum number of LIA settings to return in the response, used for paging."
  ([merchantId] (liasettings-list merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn liasettings-requestgmbaccess
  "Requests access to a specified Business Profile.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/requestgmbaccess

merchantId <> 
accountId <> 
gmbEmail <> "
  [merchantId accountId gmbEmail]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}/requestgmbaccess",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params {"gmbEmail" gmbEmail},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn liasettings-requestinventoryverification
  "Requests inventory validation for the specified country.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/requestinventoryverification

merchantId <> 
accountId <> 
country <> "
  [merchantId accountId country]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}/requestinventoryverification/{country}",
   :uri-template-args
   {"merchantId" merchantId, "accountId" accountId, "country" country},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn liasettings-custombatch
  "Retrieves and/or updates the LIA settings of multiple accounts in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/custombatch

LiasettingsCustomBatchRequest:
LiasettingsCustomBatchRequest"
  [LiasettingsCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/liasettings/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body LiasettingsCustomBatchRequest})

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
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}/setposdataprovider",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params (merge {"country" country} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

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
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}/setinventoryverificationcontact",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params
   {"country" country,
    "language" language,
    "contactName" contactName,
    "contactEmail" contactEmail},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn liasettings-update
  "Updates the LIA settings of the account. Any fields that are not provided are deleted from the resource.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/update

merchantId <> 
accountId <> 
LiaSettings:
LiaSettings"
  [merchantId accountId LiaSettings]
  {:method :put,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body LiaSettings})

(defn liasettings-listposdataproviders
  "Retrieves the list of POS data providers that have active settings for the all eiligible countries.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/listposdataproviders"
  []
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/liasettings/posdataproviders",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn liasettings-getaccessiblegmbaccounts
  "Retrieves the list of accessible Business Profiles.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/getaccessiblegmbaccounts

merchantId <> 
accountId <> "
  [merchantId accountId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}/accessiblegmbaccounts",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

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
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}/setomnichannelexperience",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn liasettings-get
  "Retrieves the LIA settings of the account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/liasettings/get

merchantId <> 
accountId <> "
  [merchantId accountId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/liasettings/{accountId}",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn regions-get
  "Retrieves a region defined in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/regions/get

merchantId <> 
regionId <> "
  [merchantId regionId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/regions/{regionId}",
   :uri-template-args {"merchantId" merchantId, "regionId" regionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

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
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/regions",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"],
     :body Region}))

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
    {:method :patch,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/regions/{regionId}",
     :uri-template-args {"merchantId" merchantId, "regionId" regionId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"],
     :body Region}))

(defn regions-delete
  "Deletes a region definition from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/regions/delete

merchantId <> 
regionId <> "
  [merchantId regionId]
  {:method :delete,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/regions/{regionId}",
   :uri-template-args {"merchantId" merchantId, "regionId" regionId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn regions-list
  "Lists the regions in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/regions/list

merchantId <> 

optional:
pageSize <integer> The maximum number of regions to return. The service may return fewer than this value. If unspecified, at most 50 rules will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([merchantId] (regions-list merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/regions",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn freelistingsprogram-get
  "Retrieves the status and review eligibility for the free listing program. Returns errors and warnings if they require action to resolve, will become disapprovals, or impact impressions. Use `accountstatuses` to view all issues for an account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/freelistingsprogram/get

merchantId <> "
  [merchantId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/freelistingsprogram",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn freelistingsprogram-requestreview
  "Requests a review of free listings in a specific region. This method deprecated. Use the `MerchantSupportService` to view product and account issues and request a review.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/freelistingsprogram/requestreview

merchantId <> 
RequestReviewFreeListingsRequest:
RequestReviewFreeListingsRequest"
  [merchantId RequestReviewFreeListingsRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/freelistingsprogram/requestreview",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body RequestReviewFreeListingsRequest})

(defn freelistingsprogram-checkoutsettings-get
  "Gets Checkout settings for the given merchant. This includes information about review state, enrollment state and URL settings.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/freelistingsprogram/checkoutsettings/get

merchantId <> "
  [merchantId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/freelistingsprogram/checkoutsettings",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn freelistingsprogram-checkoutsettings-insert
  "Enrolls merchant in `Checkout` program.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/freelistingsprogram/checkoutsettings/insert

merchantId <> 
InsertCheckoutSettingsRequest:
InsertCheckoutSettingsRequest"
  [merchantId InsertCheckoutSettingsRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/freelistingsprogram/checkoutsettings",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body InsertCheckoutSettingsRequest})

(defn freelistingsprogram-checkoutsettings-delete
  "Deletes `Checkout` settings and unenrolls merchant from `Checkout` program.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/freelistingsprogram/checkoutsettings/delete

merchantId <> "
  [merchantId]
  {:method :delete,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/freelistingsprogram/checkoutsettings",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn accounttax-custombatch
  "Retrieves and updates tax settings of multiple accounts in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounttax/custombatch

AccounttaxCustomBatchRequest:
AccounttaxCustomBatchRequest"
  [AccounttaxCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/accounttax/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body AccounttaxCustomBatchRequest})

(defn accounttax-get
  "Retrieves the tax settings of the account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounttax/get

merchantId <> 
accountId <> "
  [merchantId accountId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounttax/{accountId}",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn accounttax-list
  "Lists the tax settings of the sub-accounts in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounttax/list

merchantId <> 

optional:
maxResults <integer> The maximum number of tax settings to return in the response, used for paging."
  ([merchantId] (accounttax-list merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounttax",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn accounttax-update
  "Updates the tax settings of the account. Any fields that are not provided are deleted from the resource.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accounttax/update

merchantId <> 
accountId <> 
AccountTax:
AccountTax"
  [merchantId accountId AccountTax]
  {:method :put,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accounttax/{accountId}",
   :uri-template-args {"merchantId" merchantId, "accountId" accountId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body AccountTax})

(defn datafeeds-custombatch
  "Deletes, fetches, gets, inserts and updates multiple datafeeds in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/custombatch

DatafeedsCustomBatchRequest:
DatafeedsCustomBatchRequest"
  [DatafeedsCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/datafeeds/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body DatafeedsCustomBatchRequest})

(defn datafeeds-delete
  "Deletes a datafeed configuration from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/delete

merchantId <> 
datafeedId <> "
  [merchantId datafeedId]
  {:method :delete,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeeds/{datafeedId}",
   :uri-template-args
   {"merchantId" merchantId, "datafeedId" datafeedId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn datafeeds-fetchnow
  "Invokes a fetch for the datafeed in your Merchant Center account. If you need to call this method more than once per day, we recommend you use the [Products service](https://developers.google.com/shopping-content/reference/rest/v2.1/products) to update your product data.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/fetchnow

merchantId <> 
datafeedId <> "
  [merchantId datafeedId]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeeds/{datafeedId}/fetchNow",
   :uri-template-args
   {"merchantId" merchantId, "datafeedId" datafeedId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn datafeeds-get
  "Retrieves a datafeed configuration from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/get

merchantId <> 
datafeedId <> "
  [merchantId datafeedId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeeds/{datafeedId}",
   :uri-template-args
   {"merchantId" merchantId, "datafeedId" datafeedId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn datafeeds-insert
  "Registers a datafeed configuration with your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/insert

merchantId <> 
Datafeed:
Datafeed"
  [merchantId Datafeed]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeeds",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body Datafeed})

(defn datafeeds-list
  "Lists the configurations for datafeeds in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/list

merchantId <> 

optional:
maxResults <integer> The maximum number of products to return in the response, used for paging."
  ([merchantId] (datafeeds-list merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeeds",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn datafeeds-update
  "Updates a datafeed configuration of your Merchant Center account. Any fields that are not provided are deleted from the resource.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeeds/update

merchantId <> 
datafeedId <> 
Datafeed:
Datafeed"
  [merchantId datafeedId Datafeed]
  {:method :put,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeeds/{datafeedId}",
   :uri-template-args
   {"merchantId" merchantId, "datafeedId" datafeedId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body Datafeed})

(defn ordertrackingsignals-create
  "Creates new order tracking signal.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/ordertrackingsignals/create

merchantId <> 
OrderTrackingSignal:
OrderTrackingSignal"
  [merchantId OrderTrackingSignal]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/ordertrackingsignals",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body OrderTrackingSignal})

(defn promotions-create
  "Inserts a promotion for your Merchant Center account. If the promotion already exists, then it updates the promotion instead. To [end or delete] (https://developers.google.com/shopping-content/guides/promotions#end_a_promotion) a promotion update the time period of the promotion to a time that has already passed.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/promotions/create

merchantId <> 
Promotion:
Promotion"
  [merchantId Promotion]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/promotions",
   :uri-template-args {"merchantId" merchantId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body Promotion})

(defn promotions-get
  "Retrieves a promotion from your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/promotions/get

merchantId <> 
id <> "
  [merchantId id]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/promotions/{id}",
   :uri-template-args {"merchantId" merchantId, "id" id},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

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
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/promotions",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn csses-list
  "Lists CSS domains affiliated with a CSS group.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/csses/list

cssGroupId <> 

optional:
pageSize <integer> The maximum number of CSS domains to return. The service may return fewer than this value. If unspecified, at most 50 CSS domains will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([cssGroupId] (csses-list cssGroupId nil))
  ([cssGroupId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{cssGroupId}/csses",
     :uri-template-args {"cssGroupId" cssGroupId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn csses-get
  "Retrieves a single CSS domain by ID.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/csses/get

cssGroupId <> 
cssDomainId <> "
  [cssGroupId cssDomainId]
  {:method :get,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{cssGroupId}/csses/{cssDomainId}",
   :uri-template-args
   {"cssGroupId" cssGroupId, "cssDomainId" cssDomainId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"]})

(defn csses-updatelabels
  "Updates labels that are assigned to a CSS domain by its CSS group.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/csses/updatelabels

cssGroupId <> 
cssDomainId <> 
LabelIds:
LabelIds"
  [cssGroupId cssDomainId LabelIds]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/{cssGroupId}/csses/{cssDomainId}/updatelabels",
   :uri-template-args
   {"cssGroupId" cssGroupId, "cssDomainId" cssDomainId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body LabelIds})

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
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/merchantsupport/renderaccountissues",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"],
     :body RenderAccountIssuesRequestPayload}))

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
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/merchantsupport/renderproductissues/{productId}",
     :uri-template-args
     {"merchantId" merchantId, "productId" productId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"],
     :body RenderProductIssuesRequestPayload}))

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
    {:method :post,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/merchantsupport/triggeraction",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"],
     :body TriggerActionPayload}))

(defn accountstatuses-custombatch
  "Retrieves multiple Merchant Center account statuses in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/accountstatuses/custombatch

AccountstatusesCustomBatchRequest:
AccountstatusesCustomBatchRequest"
  [AccountstatusesCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/accountstatuses/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body AccountstatusesCustomBatchRequest})

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
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accountstatuses/{accountId}",
     :uri-template-args
     {"merchantId" merchantId, "accountId" accountId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

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
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/accountstatuses",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn datafeedstatuses-custombatch
  "Gets multiple Merchant Center datafeed statuses in a single request.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeedstatuses/custombatch

DatafeedstatusesCustomBatchRequest:
DatafeedstatusesCustomBatchRequest"
  [DatafeedstatusesCustomBatchRequest]
  {:method :post,
   :uri-template
   "https://shoppingcontent.googleapis.com/content/v2.1/datafeedstatuses/batch",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/content"],
   :body DatafeedstatusesCustomBatchRequest})

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
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeedstatuses/{datafeedId}",
     :uri-template-args
     {"merchantId" merchantId, "datafeedId" datafeedId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))

(defn datafeedstatuses-list
  "Lists the statuses of the datafeeds in your Merchant Center account.
https://developers.google.com/shopping-content/guides/quickstart/v2.1/reference/rest/v2.1/datafeedstatuses/list

merchantId <> 

optional:
maxResults <integer> The maximum number of products to return in the response, used for paging."
  ([merchantId] (datafeedstatuses-list merchantId nil))
  ([merchantId optional]
    {:method :get,
     :uri-template
     "https://shoppingcontent.googleapis.com/content/v2.1/{merchantId}/datafeedstatuses",
     :uri-template-args {"merchantId" merchantId},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/content"]}))
