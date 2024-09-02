(ns happyapi.google.licensing-v1
  "Enterprise License Manager API
The Google Enterprise License Manager API lets you manage Google Workspace and related licenses for all users of a customer that you manage.
See: https://developers.google.com/admin-sdk/licensing/v1/how-tos/concepts"
  (:require [happyapi.providers.google :as client]))

(defn licenseAssignments-delete
  "Revoke a license.
https://developers.google.com/admin-sdk/licensing/v1/how-tos/concepts/v1/reference/rest/v1/licenseAssignments/delete

productId <> 
skuId <> 
userId <> "
  [productId skuId userId]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://licensing.googleapis.com/apps/licensing/v1/product/{productId}/sku/{skuId}/user/{userId}",
     :uri-template-args
     {"productId" productId, "skuId" skuId, "userId" userId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/apps.licensing"]}))

(defn licenseAssignments-get
  "Get a specific user's license by product SKU.
https://developers.google.com/admin-sdk/licensing/v1/how-tos/concepts/v1/reference/rest/v1/licenseAssignments/get

productId <> 
skuId <> 
userId <> "
  [productId skuId userId]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://licensing.googleapis.com/apps/licensing/v1/product/{productId}/sku/{skuId}/user/{userId}",
     :uri-template-args
     {"productId" productId, "skuId" skuId, "userId" userId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/apps.licensing"]}))

(defn licenseAssignments-insert
  "Assign a license.
https://developers.google.com/admin-sdk/licensing/v1/how-tos/concepts/v1/reference/rest/v1/licenseAssignments/insert

productId <> 
skuId <> 
LicenseAssignmentInsert:
LicenseAssignmentInsert"
  [productId skuId LicenseAssignmentInsert]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://licensing.googleapis.com/apps/licensing/v1/product/{productId}/sku/{skuId}/user",
     :uri-template-args {"productId" productId, "skuId" skuId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/apps.licensing"],
     :body LicenseAssignmentInsert}))

(defn licenseAssignments-listForProduct
  "List all users assigned licenses for a specific product SKU.
https://developers.google.com/admin-sdk/licensing/v1/how-tos/concepts/v1/reference/rest/v1/licenseAssignments/listForProduct

productId <> 
customerId <> 

optional:
maxResults <integer> The `maxResults` query string determines how many entries are returned on each page of a large response. This is an optional parameter. The value must be a positive number."
  ([productId customerId]
    (licenseAssignments-listForProduct productId customerId nil))
  ([productId customerId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://licensing.googleapis.com/apps/licensing/v1/product/{productId}/users",
       :uri-template-args {"productId" productId},
       :query-params (merge {"customerId" customerId} optional),
       :scopes ["https://www.googleapis.com/auth/apps.licensing"]})))

(defn licenseAssignments-listForProductAndSku
  "List all users assigned licenses for a specific product SKU.
https://developers.google.com/admin-sdk/licensing/v1/how-tos/concepts/v1/reference/rest/v1/licenseAssignments/listForProductAndSku

productId <> 
skuId <> 
customerId <> 

optional:
maxResults <integer> The `maxResults` query string determines how many entries are returned on each page of a large response. This is an optional parameter. The value must be a positive number."
  ([productId skuId customerId]
    (licenseAssignments-listForProductAndSku
      productId
      skuId
      customerId
      nil))
  ([productId skuId customerId optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://licensing.googleapis.com/apps/licensing/v1/product/{productId}/sku/{skuId}/users",
       :uri-template-args {"productId" productId, "skuId" skuId},
       :query-params (merge {"customerId" customerId} optional),
       :scopes ["https://www.googleapis.com/auth/apps.licensing"]})))

(defn licenseAssignments-update
  "Reassign a user's product SKU with a different SKU in the same product.
https://developers.google.com/admin-sdk/licensing/v1/how-tos/concepts/v1/reference/rest/v1/licenseAssignments/update

productId <> 
skuId <> 
userId <> 
LicenseAssignment:
LicenseAssignment"
  [productId skuId userId LicenseAssignment]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://licensing.googleapis.com/apps/licensing/v1/product/{productId}/sku/{skuId}/user/{userId}",
     :uri-template-args
     {"productId" productId, "skuId" skuId, "userId" userId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/apps.licensing"],
     :body LicenseAssignment}))

(defn licenseAssignments-patch
  "Reassign a user's product SKU with a different SKU in the same product. This method supports patch semantics.
https://developers.google.com/admin-sdk/licensing/v1/how-tos/concepts/v1/reference/rest/v1/licenseAssignments/patch

productId <> 
skuId <> 
userId <> 
LicenseAssignment:
LicenseAssignment"
  [productId skuId userId LicenseAssignment]
  (client/*api-request*
    {:method :patch,
     :uri-template
     "https://licensing.googleapis.com/apps/licensing/v1/product/{productId}/sku/{skuId}/user/{userId}",
     :uri-template-args
     {"productId" productId, "skuId" skuId, "userId" userId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/apps.licensing"],
     :body LicenseAssignment}))
