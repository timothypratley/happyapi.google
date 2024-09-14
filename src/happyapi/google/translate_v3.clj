(ns happyapi.google.translate-v3
  "Cloud Translation API
Integrates text translation into your website or application.
See: https://cloud.google.com/translate/docs/setup")

(defn projects-translateText
  "Translates input text and returns translated text.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/translateText

parent <> 
TranslateTextRequest:
TranslateTextRequest"
  [parent TranslateTextRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}:translateText",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body TranslateTextRequest})

(defn projects-romanizeText
  "Romanize input text written in non-Latin scripts to Latin text.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/romanizeText

parent <> 
RomanizeTextRequest:
RomanizeTextRequest"
  [parent RomanizeTextRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}:romanizeText",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body RomanizeTextRequest})

(defn projects-detectLanguage
  "Detects the language of text within a request.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/detectLanguage

parent <> 
DetectLanguageRequest:
DetectLanguageRequest"
  [parent DetectLanguageRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}:detectLanguage",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body DetectLanguageRequest})

(defn projects-getSupportedLanguages
  "Returns a list of supported languages for translation.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/getSupportedLanguages

parent <> 

optional:
displayLanguageCode <string> Optional. The language to use to return localized, human readable names of supported languages. If missing, then display names are not returned in a response.
model <string> Optional. Get supported languages of this model. The format depends on model type: - AutoML Translation models: `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}` - General (built-in) models: `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`, Returns languages supported by the specified model. If missing, we get supported languages of Google general NMT model."
  ([parent] (projects-getSupportedLanguages parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://translation.googleapis.com/v3/{+parent}/supportedLanguages",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"]}))

(defn projects-locations-adaptiveMtTranslate
  "Translate text using Adaptive MT.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/adaptiveMtTranslate

parent <> 
AdaptiveMtTranslateRequest:
AdaptiveMtTranslateRequest"
  [parent AdaptiveMtTranslateRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}:adaptiveMtTranslate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body AdaptiveMtTranslateRequest})

(defn projects-locations-batchTranslateDocument
  "Translates a large volume of document in asynchronous batch mode. This function provides real-time output as the inputs are being processed. If caller cancels a request, the partial results (for an input file, it's all or nothing) may still be available on the specified output location. This call returns immediately and you can use google.longrunning.Operation.name to poll the status of the call.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/batchTranslateDocument

parent <> 
BatchTranslateDocumentRequest:
BatchTranslateDocumentRequest"
  [parent BatchTranslateDocumentRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}:batchTranslateDocument",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body BatchTranslateDocumentRequest})

(defn projects-locations-list
  "Lists information about the supported locations for this service.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/list

name <> 

optional:
filter <string> A filter to narrow down results to a preferred subset. The filtering language accepts strings like `\"displayName=tokyo\"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
pageSize <integer> The maximum number of results to return. If not set, the service selects a default."
  ([name] (projects-locations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://translation.googleapis.com/v3/{+name}/locations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"]}))

(defn projects-locations-translateText
  "Translates input text and returns translated text.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/translateText

parent <> 
TranslateTextRequest:
TranslateTextRequest"
  [parent TranslateTextRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}:translateText",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body TranslateTextRequest})

(defn projects-locations-romanizeText
  "Romanize input text written in non-Latin scripts to Latin text.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/romanizeText

parent <> 
RomanizeTextRequest:
RomanizeTextRequest"
  [parent RomanizeTextRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}:romanizeText",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body RomanizeTextRequest})

(defn projects-locations-batchTranslateText
  "Translates a large volume of text in asynchronous batch mode. This function provides real-time output as the inputs are being processed. If caller cancels a request, the partial results (for an input file, it's all or nothing) may still be available on the specified output location. This call returns immediately and you can use google.longrunning.Operation.name to poll the status of the call.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/batchTranslateText

parent <> 
BatchTranslateTextRequest:
BatchTranslateTextRequest"
  [parent BatchTranslateTextRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}:batchTranslateText",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body BatchTranslateTextRequest})

(defn projects-locations-getSupportedLanguages
  "Returns a list of supported languages for translation.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/getSupportedLanguages

parent <> 

optional:
displayLanguageCode <string> Optional. The language to use to return localized, human readable names of supported languages. If missing, then display names are not returned in a response.
model <string> Optional. Get supported languages of this model. The format depends on model type: - AutoML Translation models: `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}` - General (built-in) models: `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`, Returns languages supported by the specified model. If missing, we get supported languages of Google general NMT model."
  ([parent] (projects-locations-getSupportedLanguages parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://translation.googleapis.com/v3/{+parent}/supportedLanguages",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"]}))

(defn projects-locations-detectLanguage
  "Detects the language of text within a request.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/detectLanguage

parent <> 
DetectLanguageRequest:
DetectLanguageRequest"
  [parent DetectLanguageRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}:detectLanguage",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body DetectLanguageRequest})

(defn projects-locations-get
  "Gets information about a location.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-translateDocument
  "Translates documents in synchronous mode.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/translateDocument

parent <> 
TranslateDocumentRequest:
TranslateDocumentRequest"
  [parent TranslateDocumentRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}:translateDocument",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body TranslateDocumentRequest})

(defn projects-locations-operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/operations/list

name <> 

optional:
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([name] (projects-locations-operations-list name nil))
  ([name optional]
    {:method :get,
     :uri-template
     "https://translation.googleapis.com/v3/{+name}/operations",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"]}))

(defn projects-locations-operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-operations-delete
  "Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/operations/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-operations-cancel
  "Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/operations/cancel

name <> 
CancelOperationRequest:
CancelOperationRequest"
  [name CancelOperationRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+name}:cancel",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body CancelOperationRequest})

(defn projects-locations-operations-wait
  "Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/operations/wait

name <> 
WaitOperationRequest:
WaitOperationRequest"
  [name WaitOperationRequest]
  {:method :post,
   :uri-template "https://translation.googleapis.com/v3/{+name}:wait",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body WaitOperationRequest})

(defn projects-locations-glossaries-create
  "Creates a glossary and returns the long-running operation. Returns NOT_FOUND, if the project doesn't exist.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/glossaries/create

parent <> 
Glossary:
Glossary"
  [parent Glossary]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}/glossaries",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body Glossary})

(defn projects-locations-glossaries-patch
  "Updates a glossary. A LRO is used since the update can be async if the glossary's entry file is updated.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/glossaries/patch

name <> 
Glossary:
Glossary

optional:
updateMask <string> The list of fields to be updated. Currently only `display_name` and 'input_config'"
  ([name Glossary]
    (projects-locations-glossaries-patch name Glossary nil))
  ([name Glossary optional]
    {:method :patch,
     :uri-template "https://translation.googleapis.com/v3/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"],
     :body Glossary}))

(defn projects-locations-glossaries-list
  "Lists glossaries in a project. Returns NOT_FOUND, if the project doesn't exist.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/glossaries/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. The server may return fewer glossaries than requested. If unspecified, the server picks an appropriate default.
filter <string> Optional. Filter specifying constraints of a list operation. Specify the constraint by the format of \"key=value\", where key must be \"src\" or \"tgt\", and the value must be a valid language code. For multiple restrictions, concatenate them by \"AND\" (uppercase only), such as: \"src=en-US AND tgt=zh-CN\". Notice that the exact match is used here, which means using 'en-US' and 'en' can lead to different results, which depends on the language code you used when you create the glossary. For the unidirectional glossaries, the \"src\" and \"tgt\" add restrictions on the source and target language code separately. For the equivalent term set glossaries, the \"src\" and/or \"tgt\" add restrictions on the term set. For example: \"src=en-US AND tgt=zh-CN\" will only pick the unidirectional glossaries which exactly match the source language code as \"en-US\" and the target language code \"zh-CN\", but all equivalent term set glossaries which contain \"en-US\" and \"zh-CN\" in their language set will be picked. If missing, no filtering is performed."
  ([parent] (projects-locations-glossaries-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://translation.googleapis.com/v3/{+parent}/glossaries",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"]}))

(defn projects-locations-glossaries-get
  "Gets a glossary. Returns NOT_FOUND, if the glossary doesn't exist.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/glossaries/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-glossaries-delete
  "Deletes a glossary, or cancels glossary construction if the glossary isn't created yet. Returns NOT_FOUND, if the glossary doesn't exist.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/glossaries/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-glossaries-glossaryEntries-get
  "Gets a single glossary entry by the given id.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/glossaries/glossaryEntries/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-glossaries-glossaryEntries-list
  "List the entries for the glossary.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/glossaries/glossaryEntries/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. The server may return fewer glossary entries than requested. If unspecified, the server picks an appropriate default."
  ([parent]
    (projects-locations-glossaries-glossaryEntries-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://translation.googleapis.com/v3/{+parent}/glossaryEntries",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"]}))

(defn projects-locations-glossaries-glossaryEntries-create
  "Creates a glossary entry.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/glossaries/glossaryEntries/create

parent <> 
GlossaryEntry:
GlossaryEntry"
  [parent GlossaryEntry]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}/glossaryEntries",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body GlossaryEntry})

(defn projects-locations-glossaries-glossaryEntries-patch
  "Updates a glossary entry.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/glossaries/glossaryEntries/patch

name <> 
GlossaryEntry:
GlossaryEntry"
  [name GlossaryEntry]
  {:method :patch,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body GlossaryEntry})

(defn projects-locations-glossaries-glossaryEntries-delete
  "Deletes a single entry from the glossary
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/glossaries/glossaryEntries/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-datasets-create
  "Creates a Dataset.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/datasets/create

parent <> 
Dataset:
Dataset"
  [parent Dataset]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}/datasets",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body Dataset})

(defn projects-locations-datasets-get
  "Gets a Dataset.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/datasets/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-datasets-list
  "Lists datasets.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/datasets/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. The server can return fewer results than requested."
  ([parent] (projects-locations-datasets-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://translation.googleapis.com/v3/{+parent}/datasets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"]}))

(defn projects-locations-datasets-delete
  "Deletes a dataset and all of its contents.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/datasets/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-datasets-importData
  "Import sentence pairs into translation Dataset.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/datasets/importData

dataset <> 
ImportDataRequest:
ImportDataRequest"
  [dataset ImportDataRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+dataset}:importData",
   :uri-template-args {"dataset" dataset},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body ImportDataRequest})

(defn projects-locations-datasets-exportData
  "Exports dataset's data to the provided output location.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/datasets/exportData

dataset <> 
ExportDataRequest:
ExportDataRequest"
  [dataset ExportDataRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+dataset}:exportData",
   :uri-template-args {"dataset" dataset},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body ExportDataRequest})

(defn projects-locations-datasets-examples-list
  "Lists sentence pairs in the dataset.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/datasets/examples/list

parent <> 

optional:
filter <string> Optional. An expression for filtering the examples that will be returned. Example filter: * `usage=TRAIN`
pageSize <integer> Optional. Requested page size. The server can return fewer results than requested."
  ([parent] (projects-locations-datasets-examples-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://translation.googleapis.com/v3/{+parent}/examples",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"]}))

(defn projects-locations-adaptiveMtDatasets-create
  "Creates an Adaptive MT dataset.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/adaptiveMtDatasets/create

parent <> 
AdaptiveMtDataset:
AdaptiveMtDataset"
  [parent AdaptiveMtDataset]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}/adaptiveMtDatasets",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body AdaptiveMtDataset})

(defn projects-locations-adaptiveMtDatasets-delete
  "Deletes an Adaptive MT dataset, including all its entries and associated metadata.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/adaptiveMtDatasets/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-adaptiveMtDatasets-get
  "Gets the Adaptive MT dataset.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/adaptiveMtDatasets/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-adaptiveMtDatasets-list
  "Lists all Adaptive MT datasets for which the caller has read permission.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/adaptiveMtDatasets/list

parent <> 

optional:
pageSize <integer> Optional. Requested page size. The server may return fewer results than requested. If unspecified, the server picks an appropriate default.
filter <string> Optional. An expression for filtering the results of the request. Filter is not supported yet."
  ([parent] (projects-locations-adaptiveMtDatasets-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://translation.googleapis.com/v3/{+parent}/adaptiveMtDatasets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"]}))

(defn projects-locations-adaptiveMtDatasets-importAdaptiveMtFile
  "Imports an AdaptiveMtFile and adds all of its sentences into the AdaptiveMtDataset.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/adaptiveMtDatasets/importAdaptiveMtFile

parent <> 
ImportAdaptiveMtFileRequest:
ImportAdaptiveMtFileRequest"
  [parent ImportAdaptiveMtFileRequest]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}:importAdaptiveMtFile",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body ImportAdaptiveMtFileRequest})

(defn projects-locations-adaptiveMtDatasets-adaptiveMtFiles-get
  "Gets and AdaptiveMtFile
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/adaptiveMtDatasets/adaptiveMtFiles/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-adaptiveMtDatasets-adaptiveMtFiles-delete
  "Deletes an AdaptiveMtFile along with its sentences.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/adaptiveMtDatasets/adaptiveMtFiles/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-adaptiveMtDatasets-adaptiveMtFiles-list
  "Lists all AdaptiveMtFiles associated to an AdaptiveMtDataset.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/adaptiveMtDatasets/adaptiveMtFiles/list

parent <> 

optional:
pageSize <integer> Optional. "
  ([parent]
    (projects-locations-adaptiveMtDatasets-adaptiveMtFiles-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://translation.googleapis.com/v3/{+parent}/adaptiveMtFiles",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"]}))

(defn projects-locations-adaptiveMtDatasets-adaptiveMtFiles-adaptiveMtSentences-list
  "Lists all AdaptiveMtSentences under a given file/dataset.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/adaptiveMtDatasets/adaptiveMtFiles/adaptiveMtSentences/list

parent <> 

optional:
pageSize <integer> "
  ([parent]
    (projects-locations-adaptiveMtDatasets-adaptiveMtFiles-adaptiveMtSentences-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://translation.googleapis.com/v3/{+parent}/adaptiveMtSentences",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"]}))

(defn projects-locations-adaptiveMtDatasets-adaptiveMtSentences-list
  "Lists all AdaptiveMtSentences under a given file/dataset.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/adaptiveMtDatasets/adaptiveMtSentences/list

parent <> 

optional:
pageSize <integer> "
  ([parent]
    (projects-locations-adaptiveMtDatasets-adaptiveMtSentences-list
      parent
      nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://translation.googleapis.com/v3/{+parent}/adaptiveMtSentences",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"]}))

(defn projects-locations-models-create
  "Creates a Model.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/models/create

parent <> 
Model:
Model"
  [parent Model]
  {:method :post,
   :uri-template
   "https://translation.googleapis.com/v3/{+parent}/models",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"],
   :body Model})

(defn projects-locations-models-list
  "Lists models.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/models/list

parent <> 

optional:
filter <string> Optional. An expression for filtering the models that will be returned. Supported filter: `dataset_id=${dataset_id}`
pageSize <integer> Optional. Requested page size. The server can return fewer results than requested."
  ([parent] (projects-locations-models-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://translation.googleapis.com/v3/{+parent}/models",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/cloud-translation"]}))

(defn projects-locations-models-get
  "Gets a model.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/models/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})

(defn projects-locations-models-delete
  "Deletes a model.
https://cloud.google.com/translate/docs/setup/v3/reference/rest/v3/projects/locations/models/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://translation.googleapis.com/v3/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/cloud-platform"
    "https://www.googleapis.com/auth/cloud-translation"]})
