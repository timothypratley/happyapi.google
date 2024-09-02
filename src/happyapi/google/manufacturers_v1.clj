(ns happyapi.google.manufacturers-v1
  "Manufacturer Center API
Public API for managing Manufacturer Center related data.
See: https://developers.google.com/manufacturers/quickstart"
  (:require [happyapi.providers.google :as client]))

(defn accounts-products-list
  "Lists all the products in a Manufacturer Center account.
https://developers.google.com/manufacturers/quickstart/v1/reference/rest/v1/accounts/products/list

parent <> 

optional:
pageSize <integer> Maximum number of product statuses to return in the response, used for paging.
include <string> The information to be included in the response. Only sections listed here will be returned."
  ([parent] (accounts-products-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://manufacturers.googleapis.com/v1/{+parent}/products",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/manufacturercenter"]})))

(defn accounts-products-get
  "Gets the product from a Manufacturer Center account, including product issues. A recently updated product takes around 15 minutes to process. Changes are only visible after it has been processed. While some issues may be available once the product has been processed, other issues may take days to appear.
https://developers.google.com/manufacturers/quickstart/v1/reference/rest/v1/accounts/products/get

parent <> 
name <> 

optional:
include <string> The information to be included in the response. Only sections listed here will be returned."
  ([parent name] (accounts-products-get parent name nil))
  ([parent name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://manufacturers.googleapis.com/v1/{+parent}/products/{+name}",
       :uri-template-args {"parent" parent, "name" name},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/manufacturercenter"]})))

(defn accounts-products-update
  "Inserts or updates the attributes of the product in a Manufacturer Center account. Creates a product with the provided attributes. If the product already exists, then all attributes are replaced with the new ones. The checks at upload time are minimal. All required attributes need to be present for a product to be valid. Issues may show up later after the API has accepted a new upload for a product and it is possible to overwrite an existing valid product with an invalid product. To detect this, you should retrieve the product and check it for issues once the new version is available. Uploaded attributes first need to be processed before they can be retrieved. Until then, new products will be unavailable, and retrieval of previously uploaded products will return the original state of the product.
https://developers.google.com/manufacturers/quickstart/v1/reference/rest/v1/accounts/products/update

parent <> 
name <> 
Attributes:
Attributes"
  [parent name Attributes]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://manufacturers.googleapis.com/v1/{+parent}/products/{+name}",
     :uri-template-args {"parent" parent, "name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/manufacturercenter"],
     :body Attributes}))

(defn accounts-products-delete
  "Deletes the product from a Manufacturer Center account.
https://developers.google.com/manufacturers/quickstart/v1/reference/rest/v1/accounts/products/delete

parent <> 
name <> "
  [parent name]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://manufacturers.googleapis.com/v1/{+parent}/products/{+name}",
     :uri-template-args {"parent" parent, "name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/manufacturercenter"]}))

(defn accounts-languages-productCertifications-patch
  "Updates (or creates if allow_missing = true) a product certification which links certifications with products. This method can only be called by certification bodies.
https://developers.google.com/manufacturers/quickstart/v1/reference/rest/v1/accounts/languages/productCertifications/patch

name <> 
ProductCertification:
ProductCertification

optional:
updateMask <string> Optional. The list of fields to update according to aip.dev/134. However, only full update is supported as of right now. Therefore, it can be either ignored or set to \"*\". Setting any other values will returns UNIMPLEMENTED error."
  ([name ProductCertification]
    (accounts-languages-productCertifications-patch
      name
      ProductCertification
      nil))
  ([name ProductCertification optional]
    (client/*api-request*
      {:method :patch,
       :uri-template "https://manufacturers.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/manufacturercenter"],
       :body ProductCertification})))

(defn accounts-languages-productCertifications-list
  "Lists product certifications from a specified certification body. This method can only be called by certification bodies.
https://developers.google.com/manufacturers/quickstart/v1/reference/rest/v1/accounts/languages/productCertifications/list

parent <> 

optional:
pageSize <integer> Optional. The maximum number of product certifications to return. The service may return fewer than this value. If unspecified, at most 50 product certifications will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (accounts-languages-productCertifications-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://manufacturers.googleapis.com/v1/{+parent}/productCertifications",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/manufacturercenter"]})))

(defn accounts-languages-productCertifications-get
  "Gets a product certification by its name. This method can only be called by certification bodies.
https://developers.google.com/manufacturers/quickstart/v1/reference/rest/v1/accounts/languages/productCertifications/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://manufacturers.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/manufacturercenter"]}))

(defn accounts-languages-productCertifications-delete
  "Deletes a product certification by its name. This method can only be called by certification bodies.
https://developers.google.com/manufacturers/quickstart/v1/reference/rest/v1/accounts/languages/productCertifications/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://manufacturers.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/manufacturercenter"]}))
