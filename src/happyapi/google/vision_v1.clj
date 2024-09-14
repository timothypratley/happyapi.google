(ns happyapi.google.vision-v1
  "Cloud Vision API
Integrates Google Vision features, including image labeling, face, logo, and landmark detection, optical character recognition (OCR), and detection of explicit content, into applications.
See: https://cloud.google.com/vision/")

(defn operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/vision/v1/reference/rest/v1/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://vision.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-vision"]}))

(defn operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vision/v1/reference/rest/v1/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://vision.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"]})

(defn operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/vision/v1/reference/rest/v1/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://vision.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"]})

(defn operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/vision/v1/reference/rest/v1/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template "https://vision.googleapis.com/v1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body CancelOperationRequest})

(defn projects-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://vision.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"]})

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://vision.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"]})

(defn projects-locations-productSets-create
  "Creates and returns a new ProductSet resource. Possible errors: * Returns INVALID_ARGUMENT if display_name is missing, or is longer than 4096 characters.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/productSets/create

parent <> 
ProductSet:
ProductSet

optional:
productSetId <string> A user-supplied resource id for this ProductSet. If set, the server will attempt to use this value as the resource id. If it is already in use, an error is returned with code ALREADY_EXISTS. Must be at most 128 characters long. It cannot contain the character `/`."
  ([parent ProductSet]
    (projects-locations-productSets-create parent ProductSet nil))
  ([parent ProductSet optional]
    {:method :post,
     :uri-template
     "https://vision.googleapis.com/v1/{+parent}/productSets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-vision"],
     :body ProductSet}))

(defn projects-locations-productSets-list
  "Lists ProductSets in an unspecified order. Possible errors: * Returns INVALID_ARGUMENT if page_size is greater than 100, or less than 1.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/productSets/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return. Default 10, maximum 100."
  ([parent] (projects-locations-productSets-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://vision.googleapis.com/v1/{+parent}/productSets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-vision"]}))

(defn projects-locations-productSets-get
  "Gets information associated with a ProductSet. Possible errors: * Returns NOT_FOUND if the ProductSet does not exist.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/productSets/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://vision.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"]})

(defn projects-locations-productSets-patch
  "Makes changes to a ProductSet resource. Only display_name can be updated currently. Possible errors: * Returns NOT_FOUND if the ProductSet does not exist. * Returns INVALID_ARGUMENT if display_name is present in update_mask but missing from the request or longer than 4096 characters.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/productSets/patch

name <> 
ProductSet:
ProductSet

optional:
updateMask <string> The FieldMask that specifies which fields to update. If update_mask isn't specified, all mutable fields are to be updated. Valid mask path is `display_name`."
  ([name ProductSet]
    (projects-locations-productSets-patch name ProductSet nil))
  ([name ProductSet optional]
    {:method :patch,
     :uri-template "https://vision.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-vision"],
     :body ProductSet}))

(defn projects-locations-productSets-delete
  "Permanently deletes a ProductSet. Products and ReferenceImages in the ProductSet are not deleted. The actual image files are not deleted from Google Cloud Storage.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/productSets/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://vision.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"]})

(defn projects-locations-productSets-addProduct
  "Adds a Product to the specified ProductSet. If the Product is already present, no change is made. One Product can be added to at most 100 ProductSets. Possible errors: * Returns NOT_FOUND if the Product or the ProductSet doesn't exist.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/productSets/addProduct

name <> 
AddProductToProductSetRequest:
AddProductToProductSetRequest"
  [name AddProductToProductSetRequest]
  {:method :post,
   :uri-template "https://vision.googleapis.com/v1/{+name}:addProduct",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body AddProductToProductSetRequest})

(defn projects-locations-productSets-removeProduct
  "Removes a Product from the specified ProductSet.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/productSets/removeProduct

name <> 
RemoveProductFromProductSetRequest:
RemoveProductFromProductSetRequest"
  [name RemoveProductFromProductSetRequest]
  {:method :post,
   :uri-template
   "https://vision.googleapis.com/v1/{+name}:removeProduct",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body RemoveProductFromProductSetRequest})

(defn projects-locations-productSets-import
  "Asynchronous API that imports a list of reference images to specified product sets based on a list of image information. The google.longrunning.Operation API can be used to keep track of the progress and results of the request. `Operation.metadata` contains `BatchOperationMetadata`. (progress) `Operation.response` contains `ImportProductSetsResponse`. (results) The input source of this method is a csv file on Google Cloud Storage. For the format of the csv file please see ImportProductSetsGcsSource.csv_file_uri.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/productSets/import

parent <> 
ImportProductSetsRequest:
ImportProductSetsRequest"
  [parent ImportProductSetsRequest]
  {:method :post,
   :uri-template
   "https://vision.googleapis.com/v1/{+parent}/productSets:import",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body ImportProductSetsRequest})

(defn projects-locations-productSets-products-list
  "Lists the Products in a ProductSet, in an unspecified order. If the ProductSet does not exist, the products field of the response will be empty. Possible errors: * Returns INVALID_ARGUMENT if page_size is greater than 100 or less than 1.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/productSets/products/list

name <> 

optional:
pageSize <integer> The maximum number of items to return. Default 10, maximum 100."
  ([name] (projects-locations-productSets-products-list name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://vision.googleapis.com/v1/{+name}/products",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-vision"]}))

(defn projects-locations-products-create
  "Creates and returns a new product resource. Possible errors: * Returns INVALID_ARGUMENT if display_name is missing or longer than 4096 characters. * Returns INVALID_ARGUMENT if description is longer than 4096 characters. * Returns INVALID_ARGUMENT if product_category is missing or invalid.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/products/create

parent <> 
Product:
Product

optional:
productId <string> A user-supplied resource id for this Product. If set, the server will attempt to use this value as the resource id. If it is already in use, an error is returned with code ALREADY_EXISTS. Must be at most 128 characters long. It cannot contain the character `/`."
  ([parent Product]
    (projects-locations-products-create parent Product nil))
  ([parent Product optional]
    {:method :post,
     :uri-template
     "https://vision.googleapis.com/v1/{+parent}/products",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-vision"],
     :body Product}))

(defn projects-locations-products-list
  "Lists products in an unspecified order. Possible errors: * Returns INVALID_ARGUMENT if page_size is greater than 100 or less than 1.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/products/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return. Default 10, maximum 100."
  ([parent] (projects-locations-products-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://vision.googleapis.com/v1/{+parent}/products",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-vision"]}))

(defn projects-locations-products-get
  "Gets information associated with a Product. Possible errors: * Returns NOT_FOUND if the Product does not exist.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/products/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://vision.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"]})

(defn projects-locations-products-patch
  "Makes changes to a Product resource. Only the `display_name`, `description`, and `labels` fields can be updated right now. If labels are updated, the change will not be reflected in queries until the next index time. Possible errors: * Returns NOT_FOUND if the Product does not exist. * Returns INVALID_ARGUMENT if display_name is present in update_mask but is missing from the request or longer than 4096 characters. * Returns INVALID_ARGUMENT if description is present in update_mask but is longer than 4096 characters. * Returns INVALID_ARGUMENT if product_category is present in update_mask.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/products/patch

name <> 
Product:
Product

optional:
updateMask <string> The FieldMask that specifies which fields to update. If update_mask isn't specified, all mutable fields are to be updated. Valid mask paths include `product_labels`, `display_name`, and `description`."
  ([name Product] (projects-locations-products-patch name Product nil))
  ([name Product optional]
    {:method :patch,
     :uri-template "https://vision.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-vision"],
     :body Product}))

(defn projects-locations-products-delete
  "Permanently deletes a product and its reference images. Metadata of the product and all its images will be deleted right away, but search queries against ProductSets containing the product may still work until all related caches are refreshed.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/products/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://vision.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"]})

(defn projects-locations-products-purge
  "Asynchronous API to delete all Products in a ProductSet or all Products that are in no ProductSet. If a Product is a member of the specified ProductSet in addition to other ProductSets, the Product will still be deleted. It is recommended to not delete the specified ProductSet until after this operation has completed. It is also recommended to not add any of the Products involved in the batch delete to a new ProductSet while this operation is running because those Products may still end up deleted. It's not possible to undo the PurgeProducts operation. Therefore, it is recommended to keep the csv files used in ImportProductSets (if that was how you originally built the Product Set) before starting PurgeProducts, in case you need to re-import the data after deletion. If the plan is to purge all of the Products from a ProductSet and then re-use the empty ProductSet to re-import new Products into the empty ProductSet, you must wait until the PurgeProducts operation has finished for that ProductSet. The google.longrunning.Operation API can be used to keep track of the progress and results of the request. `Operation.metadata` contains `BatchOperationMetadata`. (progress)
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/products/purge

parent <> 
PurgeProductsRequest:
PurgeProductsRequest"
  [parent PurgeProductsRequest]
  {:method :post,
   :uri-template
   "https://vision.googleapis.com/v1/{+parent}/products:purge",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body PurgeProductsRequest})

(defn projects-locations-products-referenceImages-create
  "Creates and returns a new ReferenceImage resource. The `bounding_poly` field is optional. If `bounding_poly` is not specified, the system will try to detect regions of interest in the image that are compatible with the product_category on the parent product. If it is specified, detection is ALWAYS skipped. The system converts polygons into non-rotated rectangles. Note that the pipeline will resize the image if the image resolution is too large to process (above 50MP). Possible errors: * Returns INVALID_ARGUMENT if the image_uri is missing or longer than 4096 characters. * Returns INVALID_ARGUMENT if the product does not exist. * Returns INVALID_ARGUMENT if bounding_poly is not provided, and nothing compatible with the parent product's product_category is detected. * Returns INVALID_ARGUMENT if bounding_poly contains more than 10 polygons.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/products/referenceImages/create

parent <> 
ReferenceImage:
ReferenceImage

optional:
referenceImageId <string> A user-supplied resource id for the ReferenceImage to be added. If set, the server will attempt to use this value as the resource id. If it is already in use, an error is returned with code ALREADY_EXISTS. Must be at most 128 characters long. It cannot contain the character `/`."
  ([parent ReferenceImage]
    (projects-locations-products-referenceImages-create
      parent
      ReferenceImage
      nil))
  ([parent ReferenceImage optional]
    {:method :post,
     :uri-template
     "https://vision.googleapis.com/v1/{+parent}/referenceImages",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-vision"],
     :body ReferenceImage}))

(defn projects-locations-products-referenceImages-delete
  "Permanently deletes a reference image. The image metadata will be deleted right away, but search queries against ProductSets containing the image may still work until all related caches are refreshed. The actual image files are not deleted from Google Cloud Storage.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/products/referenceImages/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://vision.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"]})

(defn projects-locations-products-referenceImages-list
  "Lists reference images. Possible errors: * Returns NOT_FOUND if the parent product does not exist. * Returns INVALID_ARGUMENT if the page_size is greater than 100, or less than 1.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/products/referenceImages/list

parent <> 

optional:
pageSize <integer> The maximum number of items to return. Default 10, maximum 100."
  ([parent]
    (projects-locations-products-referenceImages-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://vision.googleapis.com/v1/{+parent}/referenceImages",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-vision"]}))

(defn projects-locations-products-referenceImages-get
  "Gets information associated with a ReferenceImage. Possible errors: * Returns NOT_FOUND if the specified image does not exist.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/products/referenceImages/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://vision.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"]})

(defn projects-locations-images-annotate
  "Run image detection and annotation for a batch of images.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/images/annotate

parent <> 
BatchAnnotateImagesRequest:
BatchAnnotateImagesRequest"
  [parent BatchAnnotateImagesRequest]
  {:method :post,
   :uri-template
   "https://vision.googleapis.com/v1/{+parent}/images:annotate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body BatchAnnotateImagesRequest})

(defn projects-locations-images-asyncBatchAnnotate
  "Run asynchronous image detection and annotation for a list of images. Progress and results can be retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateImagesResponse` (results). This service will write image annotation outputs to json files in customer GCS bucket, each json file containing BatchAnnotateImagesResponse proto.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/images/asyncBatchAnnotate

parent <> 
AsyncBatchAnnotateImagesRequest:
AsyncBatchAnnotateImagesRequest"
  [parent AsyncBatchAnnotateImagesRequest]
  {:method :post,
   :uri-template
   "https://vision.googleapis.com/v1/{+parent}/images:asyncBatchAnnotate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body AsyncBatchAnnotateImagesRequest})

(defn projects-locations-files-annotate
  "Service that performs image detection and annotation for a batch of files. Now only \"application/pdf\", \"image/tiff\" and \"image/gif\" are supported. This service will extract at most 5 (customers can specify which 5 in AnnotateFileRequest.pages) frames (gif) or pages (pdf or tiff) from each file provided and perform detection and annotation for each image extracted.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/files/annotate

parent <> 
BatchAnnotateFilesRequest:
BatchAnnotateFilesRequest"
  [parent BatchAnnotateFilesRequest]
  {:method :post,
   :uri-template
   "https://vision.googleapis.com/v1/{+parent}/files:annotate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body BatchAnnotateFilesRequest})

(defn projects-locations-files-asyncBatchAnnotate
  "Run asynchronous image detection and annotation for a list of generic files, such as PDF files, which may contain multiple pages and multiple images per page. Progress and results can be retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateFilesResponse` (results).
https://cloud.google.com/vision/v1/reference/rest/v1/projects/locations/files/asyncBatchAnnotate

parent <> 
AsyncBatchAnnotateFilesRequest:
AsyncBatchAnnotateFilesRequest"
  [parent AsyncBatchAnnotateFilesRequest]
  {:method :post,
   :uri-template
   "https://vision.googleapis.com/v1/{+parent}/files:asyncBatchAnnotate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body AsyncBatchAnnotateFilesRequest})

(defn projects-images-annotate
  "Run image detection and annotation for a batch of images.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/images/annotate

parent <> 
BatchAnnotateImagesRequest:
BatchAnnotateImagesRequest"
  [parent BatchAnnotateImagesRequest]
  {:method :post,
   :uri-template
   "https://vision.googleapis.com/v1/{+parent}/images:annotate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body BatchAnnotateImagesRequest})

(defn projects-images-asyncBatchAnnotate
  "Run asynchronous image detection and annotation for a list of images. Progress and results can be retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateImagesResponse` (results). This service will write image annotation outputs to json files in customer GCS bucket, each json file containing BatchAnnotateImagesResponse proto.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/images/asyncBatchAnnotate

parent <> 
AsyncBatchAnnotateImagesRequest:
AsyncBatchAnnotateImagesRequest"
  [parent AsyncBatchAnnotateImagesRequest]
  {:method :post,
   :uri-template
   "https://vision.googleapis.com/v1/{+parent}/images:asyncBatchAnnotate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body AsyncBatchAnnotateImagesRequest})

(defn projects-files-annotate
  "Service that performs image detection and annotation for a batch of files. Now only \"application/pdf\", \"image/tiff\" and \"image/gif\" are supported. This service will extract at most 5 (customers can specify which 5 in AnnotateFileRequest.pages) frames (gif) or pages (pdf or tiff) from each file provided and perform detection and annotation for each image extracted.
https://cloud.google.com/vision/v1/reference/rest/v1/projects/files/annotate

parent <> 
BatchAnnotateFilesRequest:
BatchAnnotateFilesRequest"
  [parent BatchAnnotateFilesRequest]
  {:method :post,
   :uri-template
   "https://vision.googleapis.com/v1/{+parent}/files:annotate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body BatchAnnotateFilesRequest})

(defn projects-files-asyncBatchAnnotate
  "Run asynchronous image detection and annotation for a list of generic files, such as PDF files, which may contain multiple pages and multiple images per page. Progress and results can be retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateFilesResponse` (results).
https://cloud.google.com/vision/v1/reference/rest/v1/projects/files/asyncBatchAnnotate

parent <> 
AsyncBatchAnnotateFilesRequest:
AsyncBatchAnnotateFilesRequest"
  [parent AsyncBatchAnnotateFilesRequest]
  {:method :post,
   :uri-template
   "https://vision.googleapis.com/v1/{+parent}/files:asyncBatchAnnotate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body AsyncBatchAnnotateFilesRequest})

(defn locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/vision/v1/reference/rest/v1/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://vision.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"]})

(defn images-annotate
  "Run image detection and annotation for a batch of images.
https://cloud.google.com/vision/v1/reference/rest/v1/images/annotate

BatchAnnotateImagesRequest:
BatchAnnotateImagesRequest"
  [BatchAnnotateImagesRequest]
  {:method :post,
   :uri-template "https://vision.googleapis.com/v1/images:annotate",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body BatchAnnotateImagesRequest})

(defn images-asyncBatchAnnotate
  "Run asynchronous image detection and annotation for a list of images. Progress and results can be retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateImagesResponse` (results). This service will write image annotation outputs to json files in customer GCS bucket, each json file containing BatchAnnotateImagesResponse proto.
https://cloud.google.com/vision/v1/reference/rest/v1/images/asyncBatchAnnotate

AsyncBatchAnnotateImagesRequest:
AsyncBatchAnnotateImagesRequest"
  [AsyncBatchAnnotateImagesRequest]
  {:method :post,
   :uri-template
   "https://vision.googleapis.com/v1/images:asyncBatchAnnotate",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body AsyncBatchAnnotateImagesRequest})

(defn files-annotate
  "Service that performs image detection and annotation for a batch of files. Now only \"application/pdf\", \"image/tiff\" and \"image/gif\" are supported. This service will extract at most 5 (customers can specify which 5 in AnnotateFileRequest.pages) frames (gif) or pages (pdf or tiff) from each file provided and perform detection and annotation for each image extracted.
https://cloud.google.com/vision/v1/reference/rest/v1/files/annotate

BatchAnnotateFilesRequest:
BatchAnnotateFilesRequest"
  [BatchAnnotateFilesRequest]
  {:method :post,
   :uri-template "https://vision.googleapis.com/v1/files:annotate",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body BatchAnnotateFilesRequest})

(defn files-asyncBatchAnnotate
  "Run asynchronous image detection and annotation for a list of generic files, such as PDF files, which may contain multiple pages and multiple images per page. Progress and results can be retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateFilesResponse` (results).
https://cloud.google.com/vision/v1/reference/rest/v1/files/asyncBatchAnnotate

AsyncBatchAnnotateFilesRequest:
AsyncBatchAnnotateFilesRequest"
  [AsyncBatchAnnotateFilesRequest]
  {:method :post,
   :uri-template
   "https://vision.googleapis.com/v1/files:asyncBatchAnnotate",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-vision"],
   :body AsyncBatchAnnotateFilesRequest})
