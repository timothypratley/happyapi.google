(ns happyapi.google.datalabeling-v1beta1
  "Data Labeling API
Public API for Google Cloud AI Data Labeling Service.
See: https://cloud.google.com/ai-platform/data-labeling/docs")

(defn projects-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/operations/cancel

name <> "
  [name]
  {:method :get,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-datasets-create
  "Creates dataset. If success return a Dataset resource.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/create

parent <> 
GoogleCloudDatalabelingV1beta1CreateDatasetRequest:
GoogleCloudDatalabelingV1beta1CreateDatasetRequest"
  [parent GoogleCloudDatalabelingV1beta1CreateDatasetRequest]
  {:method :post,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+parent}/datasets",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudDatalabelingV1beta1CreateDatasetRequest})

(defn projects-datasets-get
  "Gets dataset by resource name.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-datasets-list
  "Lists datasets under a project. Pagination is supported.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/list

parent <> 

optional:
filter <string> Optional. Filter on dataset is not supported at this moment.
pageSize <integer> Optional. Requested page size. Server may return fewer results than requested. Default value is 100."
  ([parent] (projects-datasets-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+parent}/datasets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-datasets-delete
  "Deletes a dataset by resource name.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-datasets-importData
  "Imports data into dataset based on source locations defined in request. It can be called multiple times for the same dataset. Each dataset can only have one long running operation running on it. For example, no labeling task (also long running operation) can be started while importing is still ongoing. Vice versa.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/importData

name <> 
GoogleCloudDatalabelingV1beta1ImportDataRequest:
GoogleCloudDatalabelingV1beta1ImportDataRequest"
  [name GoogleCloudDatalabelingV1beta1ImportDataRequest]
  {:method :post,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+name}:importData",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudDatalabelingV1beta1ImportDataRequest})

(defn projects-datasets-exportData
  "Exports data and annotations from dataset.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/exportData

name <> 
GoogleCloudDatalabelingV1beta1ExportDataRequest:
GoogleCloudDatalabelingV1beta1ExportDataRequest"
  [name GoogleCloudDatalabelingV1beta1ExportDataRequest]
  {:method :post,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+name}:exportData",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudDatalabelingV1beta1ExportDataRequest})

(defn projects-datasets-dataItems-get
  "Gets a data item in a dataset by resource name. This API can be called after data are imported into dataset.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/dataItems/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-datasets-dataItems-list
  "Lists data items in a dataset. This API can be called after data are imported into dataset. Pagination is supported.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/dataItems/list

parent <> 

optional:
filter <string> Optional. Filter is not supported at this moment.
pageSize <integer> Optional. Requested page size. Server may return fewer results than requested. Default value is 100."
  ([parent] (projects-datasets-dataItems-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+parent}/dataItems",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-datasets-annotatedDatasets-get
  "Gets an annotated dataset by resource name.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-datasets-annotatedDatasets-list
  "Lists annotated datasets for a dataset. Pagination is supported.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/list

parent <> 

optional:
filter <string> Optional. Filter is not supported at this moment.
pageSize <integer> Optional. Requested page size. Server may return fewer results than requested. Default value is 100."
  ([parent] (projects-datasets-annotatedDatasets-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+parent}/annotatedDatasets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-datasets-annotatedDatasets-delete
  "Deletes an annotated dataset by resource name.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-datasets-annotatedDatasets-dataItems-get
  "Gets a data item in a dataset by resource name. This API can be called after data are imported into dataset.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/dataItems/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-datasets-annotatedDatasets-dataItems-list
  "Lists data items in a dataset. This API can be called after data are imported into dataset. Pagination is supported.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/dataItems/list

parent <> 

optional:
filter <string> Optional. Filter is not supported at this moment.
pageSize <integer> Optional. Requested page size. Server may return fewer results than requested. Default value is 100."
  ([parent]
    (projects-datasets-annotatedDatasets-dataItems-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+parent}/dataItems",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-datasets-annotatedDatasets-examples-get
  "Gets an example by resource name, including both data and annotation.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/examples/get

name <> 

optional:
filter <string> Optional. An expression for filtering Examples. Filter by annotation_spec.display_name is supported. Format \"annotation_spec.display_name = {display_name}\""
  ([name] (projects-datasets-annotatedDatasets-examples-get name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-datasets-annotatedDatasets-examples-list
  "Lists examples in an annotated dataset. Pagination is supported.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/examples/list

parent <> 

optional:
filter <string> Optional. An expression for filtering Examples. For annotated datasets that have annotation spec set, filter by annotation_spec.display_name is supported. Format \"annotation_spec.display_name = {display_name}\"
pageSize <integer> Optional. Requested page size. Server may return fewer results than requested. Default value is 100."
  ([parent]
    (projects-datasets-annotatedDatasets-examples-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+parent}/examples",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-datasets-annotatedDatasets-feedbackThreads-get
  "Get a FeedbackThread object.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/feedbackThreads/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-datasets-annotatedDatasets-feedbackThreads-list
  "List FeedbackThreads with pagination.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/feedbackThreads/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer results than requested. Default value is 100."
  ([parent]
    (projects-datasets-annotatedDatasets-feedbackThreads-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+parent}/feedbackThreads",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-datasets-annotatedDatasets-feedbackThreads-delete
  "Delete a FeedbackThread.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/feedbackThreads/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-datasets-annotatedDatasets-feedbackThreads-feedbackMessages-create
  "Create a FeedbackMessage object.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/feedbackThreads/feedbackMessages/create

parent <> 
GoogleCloudDatalabelingV1beta1FeedbackMessage:
GoogleCloudDatalabelingV1beta1FeedbackMessage"
  [parent GoogleCloudDatalabelingV1beta1FeedbackMessage]
  {:method :post,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+parent}/feedbackMessages",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudDatalabelingV1beta1FeedbackMessage})

(defn projects-datasets-annotatedDatasets-feedbackThreads-feedbackMessages-get
  "Get a FeedbackMessage object.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/feedbackThreads/feedbackMessages/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-datasets-annotatedDatasets-feedbackThreads-feedbackMessages-list
  "List FeedbackMessages with pagination.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/feedbackThreads/feedbackMessages/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. Server may return fewer results than requested. Default value is 100."
  ([parent]
    (projects-datasets-annotatedDatasets-feedbackThreads-feedbackMessages-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+parent}/feedbackMessages",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-datasets-annotatedDatasets-feedbackThreads-feedbackMessages-delete
  "Delete a FeedbackMessage.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/annotatedDatasets/feedbackThreads/feedbackMessages/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-datasets-image-label
  "Starts a labeling task for image. The type of image labeling task is configured by feature in the request.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/image/label

parent <> 
GoogleCloudDatalabelingV1beta1LabelImageRequest:
GoogleCloudDatalabelingV1beta1LabelImageRequest"
  [parent GoogleCloudDatalabelingV1beta1LabelImageRequest]
  {:method :post,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+parent}/image:label",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudDatalabelingV1beta1LabelImageRequest})

(defn projects-datasets-video-label
  "Starts a labeling task for video. The type of video labeling task is configured by feature in the request.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/video/label

parent <> 
GoogleCloudDatalabelingV1beta1LabelVideoRequest:
GoogleCloudDatalabelingV1beta1LabelVideoRequest"
  [parent GoogleCloudDatalabelingV1beta1LabelVideoRequest]
  {:method :post,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+parent}/video:label",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudDatalabelingV1beta1LabelVideoRequest})

(defn projects-datasets-text-label
  "Starts a labeling task for text. The type of text labeling task is configured by feature in the request.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/text/label

parent <> 
GoogleCloudDatalabelingV1beta1LabelTextRequest:
GoogleCloudDatalabelingV1beta1LabelTextRequest"
  [parent GoogleCloudDatalabelingV1beta1LabelTextRequest]
  {:method :post,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+parent}/text:label",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudDatalabelingV1beta1LabelTextRequest})

(defn projects-datasets-evaluations-get
  "Gets an evaluation by resource name (to search, use projects.evaluations.search).
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/evaluations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-datasets-evaluations-exampleComparisons-search
  "Searches example comparisons from an evaluation. The return format is a list of example comparisons that show ground truth and prediction(s) for a single input. Search by providing an evaluation ID.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/datasets/evaluations/exampleComparisons/search

parent <> 
GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest:
GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest"
  [parent
   GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest]
  {:method :post,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+parent}/exampleComparisons:search",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest})

(defn projects-annotationSpecSets-create
  "Creates an annotation spec set by providing a set of labels.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/annotationSpecSets/create

parent <> 
GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest:
GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest"
  [parent GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest]
  {:method :post,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+parent}/annotationSpecSets",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest})

(defn projects-annotationSpecSets-get
  "Gets an annotation spec set by resource name.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/annotationSpecSets/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-annotationSpecSets-list
  "Lists annotation spec sets for a project. Pagination is supported.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/annotationSpecSets/list

parent <> 

optional:
filter <string> Optional. Filter is not supported at this moment.
pageSize <integer> Optional. Requested page size. Server may return fewer results than requested. Default value is 100."
  ([parent] (projects-annotationSpecSets-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+parent}/annotationSpecSets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-annotationSpecSets-delete
  "Deletes an annotation spec set by resource name.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/annotationSpecSets/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-instructions-create
  "Creates an instruction for how data should be labeled.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/instructions/create

parent <> 
GoogleCloudDatalabelingV1beta1CreateInstructionRequest:
GoogleCloudDatalabelingV1beta1CreateInstructionRequest"
  [parent GoogleCloudDatalabelingV1beta1CreateInstructionRequest]
  {:method :post,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+parent}/instructions",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudDatalabelingV1beta1CreateInstructionRequest})

(defn projects-instructions-get
  "Gets an instruction by resource name.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/instructions/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-instructions-list
  "Lists instructions for a project. Pagination is supported.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/instructions/list

parent <> 

optional:
filter <string> Optional. Filter is not supported at this moment.
pageSize <integer> Optional. Requested page size. Server may return fewer results than requested. Default value is 100."
  ([parent] (projects-instructions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+parent}/instructions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-instructions-delete
  "Deletes an instruction object by resource name.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/instructions/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-evaluations-search
  "Searches evaluations within a project.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/evaluations/search

parent <> 

optional:
filter <string> Optional. To search evaluations, you can filter by the following: * evaluation_job.evaluation_job_id (the last part of EvaluationJob.name) * evaluation_job.model_id (the {model_name} portion of EvaluationJob.modelVersion) * evaluation_job.evaluation_job_run_time_start (Minimum threshold for the evaluationJobRunTime that created the evaluation) * evaluation_job.evaluation_job_run_time_end (Maximum threshold for the evaluationJobRunTime that created the evaluation) * evaluation_job.job_state (EvaluationJob.state) * annotation_spec.display_name (the Evaluation contains a metric for the annotation spec with this displayName) To filter by multiple critiera, use the `AND` operator or the `OR` operator. The following examples shows a string that filters by several critiera: \"evaluation_job.evaluation_job_id = {evaluation_job_id} AND evaluation_job.model_id = {model_name} AND evaluation_job.evaluation_job_run_time_start = {timestamp_1} AND evaluation_job.evaluation_job_run_time_end = {timestamp_2} AND annotation_spec.display_name = {display_name}\"
pageSize <integer> Optional. Requested page size. Server may return fewer results than requested. Default value is 100."
  ([parent] (projects-evaluations-search parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+parent}/evaluations:search",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-evaluationJobs-create
  "Creates an evaluation job.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/evaluationJobs/create

parent <> 
GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest:
GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest"
  [parent GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest]
  {:method :post,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+parent}/evaluationJobs",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest})

(defn projects-evaluationJobs-patch
  "Updates an evaluation job. You can only update certain fields of the job's EvaluationJobConfig: `humanAnnotationConfig.instruction`, `exampleCount`, and `exampleSamplePercentage`. If you want to change any other aspect of the evaluation job, you must delete the job and create a new one.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/evaluationJobs/patch

name <> 
GoogleCloudDatalabelingV1beta1EvaluationJob:
GoogleCloudDatalabelingV1beta1EvaluationJob

optional:
updateMask <string> Optional. Mask for which fields to update. You can only provide the following fields: * `evaluationJobConfig.humanAnnotationConfig.instruction` * `evaluationJobConfig.exampleCount` * `evaluationJobConfig.exampleSamplePercentage` You can provide more than one of these fields by separating them with commas."
  ([name GoogleCloudDatalabelingV1beta1EvaluationJob]
    (projects-evaluationJobs-patch
      name
      GoogleCloudDatalabelingV1beta1EvaluationJob
      nil))
  ([name GoogleCloudDatalabelingV1beta1EvaluationJob optional]
    {:method :patch,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDatalabelingV1beta1EvaluationJob}))

(defn projects-evaluationJobs-get
  "Gets an evaluation job by resource name.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/evaluationJobs/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-evaluationJobs-pause
  "Pauses an evaluation job. Pausing an evaluation job that is already in a `PAUSED` state is a no-op.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/evaluationJobs/pause

name <> 
GoogleCloudDatalabelingV1beta1PauseEvaluationJobRequest:
GoogleCloudDatalabelingV1beta1PauseEvaluationJobRequest"
  [name GoogleCloudDatalabelingV1beta1PauseEvaluationJobRequest]
  {:method :post,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+name}:pause",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudDatalabelingV1beta1PauseEvaluationJobRequest})

(defn projects-evaluationJobs-resume
  "Resumes a paused evaluation job. A deleted evaluation job can't be resumed. Resuming a running or scheduled evaluation job is a no-op.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/evaluationJobs/resume

name <> 
GoogleCloudDatalabelingV1beta1ResumeEvaluationJobRequest:
GoogleCloudDatalabelingV1beta1ResumeEvaluationJobRequest"
  [name GoogleCloudDatalabelingV1beta1ResumeEvaluationJobRequest]
  {:method :post,
   :uri-template
   "https://datalabeling.googleapis.com/v1beta1/{+name}:resume",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body GoogleCloudDatalabelingV1beta1ResumeEvaluationJobRequest})

(defn projects-evaluationJobs-delete
  "Stops and deletes an evaluation job.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/evaluationJobs/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://datalabeling.googleapis.com/v1beta1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-evaluationJobs-list
  "Lists all evaluation jobs within a project with possible filters. Pagination is supported.
https://cloud.google.com/ai-platform/data-labeling/docs/v1beta1/reference/rest/v1beta1/projects/evaluationJobs/list

parent <> 

optional:
filter <string> Optional. You can filter the jobs to list by model_id (also known as model_name, as described in EvaluationJob.modelVersion) or by evaluation job state (as described in EvaluationJob.state). To filter by both criteria, use the `AND` operator or the `OR` operator. For example, you can use the following string for your filter: \"evaluation_job.model_id = {model_name} AND evaluation_job.state = {evaluation_job_state}\"
pageSize <integer> Optional. Requested page size. Server may return fewer results than requested. Default value is 100."
  ([parent] (projects-evaluationJobs-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://datalabeling.googleapis.com/v1beta1/{+parent}/evaluationJobs",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
