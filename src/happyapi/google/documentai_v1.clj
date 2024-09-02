(ns happyapi.google.documentai-v1
  "Cloud Document AI API
Service to parse structured information from unstructured or semi-structured documents using state-of-the-art Google AI such as natural language, computer vision, translation, and AutoML.
See: https://cloud.google.com/document-ai/docs/"
  (:require [happyapi.providers.google :as client]))

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/list

name <> 

optional:
pageSize <integer> The maximum number of results to return. If not set, the service selects a default.
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160)."
  ([name] (projects-locations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://documentai.googleapis.com/v1/{+name}/locations",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-fetchProcessorTypes
  "Fetches processor types. Note that we don't use ListProcessorTypes here, because it isn't paginated.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/fetchProcessorTypes

parent <> "
  [parent]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://documentai.googleapis.com/v1/{+parent}:fetchProcessorTypes",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://documentai.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-processors-list
  "Lists all processors which belong to this project.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/list

parent <> 

optional:
pageSize <integer> The maximum number of processors to return. If unspecified, at most `50` processors will be returned. The maximum value is `100`. Values above `100` will be coerced to `100`."
  ([parent] (projects-locations-processors-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://documentai.googleapis.com/v1/{+parent}/processors",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-processors-setDefaultProcessorVersion
  "Set the default (active) version of a Processor that will be used in ProcessDocument and BatchProcessDocuments.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/setDefaultProcessorVersion

processor <> 
GoogleCloudDocumentaiV1SetDefaultProcessorVersionRequest:
GoogleCloudDocumentaiV1SetDefaultProcessorVersionRequest"
  [processor GoogleCloudDocumentaiV1SetDefaultProcessorVersionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+processor}:setDefaultProcessorVersion",
     :uri-template-args {"processor" processor},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDocumentaiV1SetDefaultProcessorVersionRequest}))

(defn projects-locations-processors-delete
  "Deletes the processor, unloads all deployed model artifacts if it was enabled and then deletes all artifacts associated with this processor.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://documentai.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-processors-process
  "Processes a single document.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/process

name <> 
GoogleCloudDocumentaiV1ProcessRequest:
GoogleCloudDocumentaiV1ProcessRequest"
  [name GoogleCloudDocumentaiV1ProcessRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+name}:process",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDocumentaiV1ProcessRequest}))

(defn projects-locations-processors-enable
  "Enables a processor
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/enable

name <> 
GoogleCloudDocumentaiV1EnableProcessorRequest:
GoogleCloudDocumentaiV1EnableProcessorRequest"
  [name GoogleCloudDocumentaiV1EnableProcessorRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+name}:enable",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDocumentaiV1EnableProcessorRequest}))

(defn projects-locations-processors-disable
  "Disables a processor
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/disable

name <> 
GoogleCloudDocumentaiV1DisableProcessorRequest:
GoogleCloudDocumentaiV1DisableProcessorRequest"
  [name GoogleCloudDocumentaiV1DisableProcessorRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+name}:disable",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDocumentaiV1DisableProcessorRequest}))

(defn projects-locations-processors-create
  "Creates a processor from the ProcessorType provided. The processor will be at `ENABLED` state by default after its creation. Note that this method requires the `documentai.processors.create` permission on the project, which is highly privileged. A user or service account with this permission can create new processors that can interact with any gcs bucket in your project.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/create

parent <> 
GoogleCloudDocumentaiV1Processor:
GoogleCloudDocumentaiV1Processor"
  [parent GoogleCloudDocumentaiV1Processor]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+parent}/processors",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDocumentaiV1Processor}))

(defn projects-locations-processors-get
  "Gets a processor detail.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://documentai.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-processors-batchProcess
  "LRO endpoint to batch process many documents. The output is written to Cloud Storage as JSON in the [Document] format.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/batchProcess

name <> 
GoogleCloudDocumentaiV1BatchProcessRequest:
GoogleCloudDocumentaiV1BatchProcessRequest"
  [name GoogleCloudDocumentaiV1BatchProcessRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+name}:batchProcess",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDocumentaiV1BatchProcessRequest}))

(defn projects-locations-processors-processorVersions-deploy
  "Deploys the processor version.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/processorVersions/deploy

name <> 
GoogleCloudDocumentaiV1DeployProcessorVersionRequest:
GoogleCloudDocumentaiV1DeployProcessorVersionRequest"
  [name GoogleCloudDocumentaiV1DeployProcessorVersionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+name}:deploy",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDocumentaiV1DeployProcessorVersionRequest}))

(defn projects-locations-processors-processorVersions-undeploy
  "Undeploys the processor version.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/processorVersions/undeploy

name <> 
GoogleCloudDocumentaiV1UndeployProcessorVersionRequest:
GoogleCloudDocumentaiV1UndeployProcessorVersionRequest"
  [name GoogleCloudDocumentaiV1UndeployProcessorVersionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+name}:undeploy",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDocumentaiV1UndeployProcessorVersionRequest}))

(defn projects-locations-processors-processorVersions-list
  "Lists all versions of a processor.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/processorVersions/list

parent <> 

optional:
pageSize <integer> The maximum number of processor versions to return. If unspecified, at most `10` processor versions will be returned. The maximum value is `20`. Values above `20` will be coerced to `20`."
  ([parent]
    (projects-locations-processors-processorVersions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://documentai.googleapis.com/v1/{+parent}/processorVersions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-processors-processorVersions-evaluateProcessorVersion
  "Evaluates a ProcessorVersion against annotated documents, producing an Evaluation.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/processorVersions/evaluateProcessorVersion

processorVersion <> 
GoogleCloudDocumentaiV1EvaluateProcessorVersionRequest:
GoogleCloudDocumentaiV1EvaluateProcessorVersionRequest"
  [processorVersion
   GoogleCloudDocumentaiV1EvaluateProcessorVersionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+processorVersion}:evaluateProcessorVersion",
     :uri-template-args {"processorVersion" processorVersion},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDocumentaiV1EvaluateProcessorVersionRequest}))

(defn projects-locations-processors-processorVersions-delete
  "Deletes the processor version, all artifacts under the processor version will be deleted.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/processorVersions/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://documentai.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-processors-processorVersions-process
  "Processes a single document.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/processorVersions/process

name <> 
GoogleCloudDocumentaiV1ProcessRequest:
GoogleCloudDocumentaiV1ProcessRequest"
  [name GoogleCloudDocumentaiV1ProcessRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+name}:process",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDocumentaiV1ProcessRequest}))

(defn projects-locations-processors-processorVersions-train
  "Trains a new processor version. Operation metadata is returned as TrainProcessorVersionMetadata.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/processorVersions/train

parent <> 
GoogleCloudDocumentaiV1TrainProcessorVersionRequest:
GoogleCloudDocumentaiV1TrainProcessorVersionRequest"
  [parent GoogleCloudDocumentaiV1TrainProcessorVersionRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+parent}/processorVersions:train",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDocumentaiV1TrainProcessorVersionRequest}))

(defn projects-locations-processors-processorVersions-get
  "Gets a processor version detail.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/processorVersions/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://documentai.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-processors-processorVersions-batchProcess
  "LRO endpoint to batch process many documents. The output is written to Cloud Storage as JSON in the [Document] format.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/processorVersions/batchProcess

name <> 
GoogleCloudDocumentaiV1BatchProcessRequest:
GoogleCloudDocumentaiV1BatchProcessRequest"
  [name GoogleCloudDocumentaiV1BatchProcessRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+name}:batchProcess",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDocumentaiV1BatchProcessRequest}))

(defn projects-locations-processors-processorVersions-evaluations-list
  "Retrieves a set of evaluations for a given processor version.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/processorVersions/evaluations/list

parent <> 

optional:
pageSize <integer> The standard list page size. If unspecified, at most `5` evaluations are returned. The maximum value is `100`. Values above `100` are coerced to `100`."
  ([parent]
    (projects-locations-processors-processorVersions-evaluations-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://documentai.googleapis.com/v1/{+parent}/evaluations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-processors-processorVersions-evaluations-get
  "Retrieves a specific evaluation.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/processorVersions/evaluations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://documentai.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-processors-humanReviewConfig-reviewDocument
  "Send a document for Human Review. The input document should be processed by the specified processor.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processors/humanReviewConfig/reviewDocument

humanReviewConfig <> 
GoogleCloudDocumentaiV1ReviewDocumentRequest:
GoogleCloudDocumentaiV1ReviewDocumentRequest"
  [humanReviewConfig GoogleCloudDocumentaiV1ReviewDocumentRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+humanReviewConfig}:reviewDocument",
     :uri-template-args {"humanReviewConfig" humanReviewConfig},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body GoogleCloudDocumentaiV1ReviewDocumentRequest}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://documentai.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    (client/*api-request*
      {:method :get,
       :uri-template "https://documentai.googleapis.com/v1/{+name}",
       :uri-template-args {"name" name},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/operations/cancel

name <> "
  [name]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://documentai.googleapis.com/v1/{+name}:cancel",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-processorTypes-get
  "Gets a processor type detail.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processorTypes/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://documentai.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-processorTypes-list
  "Lists the processor types that exist.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/locations/processorTypes/list

parent <> 

optional:
pageSize <integer> The maximum number of processor types to return. If unspecified, at most `100` processor types will be returned. The maximum value is `500`. Values above `500` will be coerced to `500`."
  ([parent] (projects-locations-processorTypes-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://documentai.googleapis.com/v1/{+parent}/processorTypes",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))

(defn projects-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/projects/operations/get

name <> "
  [name]
  (client/*api-request*
    {:method :get,
     :uri-template "https://documentai.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/document-ai/docs/v1/reference/rest/v1/operations/delete

name <> "
  [name]
  (client/*api-request*
    {:method :delete,
     :uri-template "https://documentai.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))
