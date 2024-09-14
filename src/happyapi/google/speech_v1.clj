(ns happyapi.google.speech-v1
  "Cloud Speech-to-Text API
Converts audio to text by applying powerful neural network models.
See: https://cloud.google.com/speech-to-text/docs/transcribe-api")

(defn projects-locations-phraseSets-create
  "Create a set of phrase hints. Each item in the set can be a single word or a multi-word phrase. The items in the PhraseSet are favored by the recognition model when you send a call that includes the PhraseSet.
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/projects/locations/phraseSets/create

parent <> 
CreatePhraseSetRequest:
CreatePhraseSetRequest"
  [parent CreatePhraseSetRequest]
  {:method :post,
   :uri-template
   "https://speech.googleapis.com/v1/{+parent}/phraseSets",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CreatePhraseSetRequest})

(defn projects-locations-phraseSets-get
  "Get a phrase set.
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/projects/locations/phraseSets/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://speech.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-phraseSets-list
  "List phrase sets.
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/projects/locations/phraseSets/list

parent <> 

optional:
pageSize <integer> The maximum number of phrase sets to return. The service may return fewer than this value. If unspecified, at most 50 phrase sets will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-phraseSets-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://speech.googleapis.com/v1/{+parent}/phraseSets",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-phraseSets-patch
  "Update a phrase set.
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/projects/locations/phraseSets/patch

name <> 
PhraseSet:
PhraseSet

optional:
updateMask <string> The list of fields to be updated."
  ([name PhraseSet]
    (projects-locations-phraseSets-patch name PhraseSet nil))
  ([name PhraseSet optional]
    {:method :patch,
     :uri-template "https://speech.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body PhraseSet}))

(defn projects-locations-phraseSets-delete
  "Delete a phrase set.
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/projects/locations/phraseSets/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://speech.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-customClasses-create
  "Create a custom class.
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/projects/locations/customClasses/create

parent <> 
CreateCustomClassRequest:
CreateCustomClassRequest"
  [parent CreateCustomClassRequest]
  {:method :post,
   :uri-template
   "https://speech.googleapis.com/v1/{+parent}/customClasses",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body CreateCustomClassRequest})

(defn projects-locations-customClasses-get
  "Get a custom class.
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/projects/locations/customClasses/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://speech.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn projects-locations-customClasses-list
  "List custom classes.
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/projects/locations/customClasses/list

parent <> 

optional:
pageSize <integer> The maximum number of custom classes to return. The service may return fewer than this value. If unspecified, at most 50 custom classes will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000."
  ([parent] (projects-locations-customClasses-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://speech.googleapis.com/v1/{+parent}/customClasses",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn projects-locations-customClasses-patch
  "Update a custom class.
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/projects/locations/customClasses/patch

name <> 
CustomClass:
CustomClass

optional:
updateMask <string> The list of fields to be updated."
  ([name CustomClass]
    (projects-locations-customClasses-patch name CustomClass nil))
  ([name CustomClass optional]
    {:method :patch,
     :uri-template "https://speech.googleapis.com/v1/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"],
     :body CustomClass}))

(defn projects-locations-customClasses-delete
  "Delete a custom class.
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/projects/locations/customClasses/delete

name <> "
  [name]
  {:method :delete,
   :uri-template "https://speech.googleapis.com/v1/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn operations-list
  "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`.
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/operations/list

optional:
name <string> The name of the operation's parent resource.
filter <string> The standard list filter.
pageSize <integer> The standard list page size."
  ([] (operations-list nil))
  ([optional]
    {:method :get,
     :uri-template "https://speech.googleapis.com/v1/operations",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes ["https://www.googleapis.com/auth/cloud-platform"]}))

(defn operations-get
  "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/operations/get

name <> "
  [name]
  {:method :get,
   :uri-template "https://speech.googleapis.com/v1/operations/{+name}",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"]})

(defn speech-recognize
  "Performs synchronous speech recognition: receive results after all audio has been sent and processed.
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/speech/recognize

RecognizeRequest:
RecognizeRequest"
  [RecognizeRequest]
  {:method :post,
   :uri-template "https://speech.googleapis.com/v1/speech:recognize",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body RecognizeRequest})

(defn speech-longrunningrecognize
  "Performs asynchronous speech recognition: receive results via the google.longrunning.Operations interface. Returns either an `Operation.error` or an `Operation.response` which contains a `LongRunningRecognizeResponse` message. For more information on asynchronous speech recognition, see the [how-to](https://cloud.google.com/speech-to-text/docs/async-recognize).
https://cloud.google.com/speech-to-text/docs/transcribe-api/v1/reference/rest/v1/speech/longrunningrecognize

LongRunningRecognizeRequest:
LongRunningRecognizeRequest"
  [LongRunningRecognizeRequest]
  {:method :post,
   :uri-template
   "https://speech.googleapis.com/v1/speech:longrunningrecognize",
   :uri-template-args {},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/cloud-platform"],
   :body LongRunningRecognizeRequest})
