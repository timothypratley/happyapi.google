(ns happyapi.google.forms-v1
  "Google Forms API
Reads and writes Google Forms and responses.
See: https://developers.google.com/forms/api/guides")

(defn forms-create
  "Create a new form using the title given in the provided form message in the request. *Important:* Only the form.info.title and form.info.document_title fields are copied to the new form. All other fields including the form description, items and settings are disallowed. To create a new form and add items, you must first call forms.create to create an empty form with a title and (optional) document title, and then call forms.update to add the items.
https://developers.google.com/forms/api/guides/v1/reference/rest/v1/forms/create

Form:
Form"
  [Form]
  {:method :post,
   :uri-template "https://forms.googleapis.com/v1/forms",
   :uri-template-args {},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/forms.body"],
   :body Form})

(defn forms-get
  "Get a form.
https://developers.google.com/forms/api/guides/v1/reference/rest/v1/forms/get

formId <> "
  [formId]
  {:method :get,
   :uri-template "https://forms.googleapis.com/v1/forms/{formId}",
   :uri-template-args {"formId" formId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/drive.readonly"
    "https://www.googleapis.com/auth/forms.body"
    "https://www.googleapis.com/auth/forms.body.readonly"]})

(defn forms-batchUpdate
  "Change the form with a batch of updates.
https://developers.google.com/forms/api/guides/v1/reference/rest/v1/forms/batchUpdate

formId <> 
BatchUpdateFormRequest:
BatchUpdateFormRequest"
  [formId BatchUpdateFormRequest]
  {:method :post,
   :uri-template
   "https://forms.googleapis.com/v1/forms/{formId}:batchUpdate",
   :uri-template-args {"formId" formId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/forms.body"],
   :body BatchUpdateFormRequest})

(defn forms-responses-get
  "Get one response from the form.
https://developers.google.com/forms/api/guides/v1/reference/rest/v1/forms/responses/get

formId <> 
responseId <> "
  [formId responseId]
  {:method :get,
   :uri-template
   "https://forms.googleapis.com/v1/forms/{formId}/responses/{responseId}",
   :uri-template-args {"formId" formId, "responseId" responseId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/forms.responses.readonly"]})

(defn forms-responses-list
  "List a form's responses.
https://developers.google.com/forms/api/guides/v1/reference/rest/v1/forms/responses/list

formId <> 

optional:
filter <string> Which form responses to return. Currently, the only supported filters are: * timestamp > *N* which means to get all form responses submitted after (but not at) timestamp *N*. * timestamp >= *N* which means to get all form responses submitted at and after timestamp *N*. For both supported filters, timestamp must be formatted in RFC3339 UTC \"Zulu\" format. Examples: \"2014-10-02T15:01:23Z\" and \"2014-10-02T15:01:23.045123456Z\".
pageSize <integer> The maximum number of responses to return. The service may return fewer than this value. If unspecified or zero, at most 5000 responses are returned."
  ([formId] (forms-responses-list formId nil))
  ([formId optional]
    {:method :get,
     :uri-template
     "https://forms.googleapis.com/v1/forms/{formId}/responses",
     :uri-template-args {"formId" formId},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/forms.responses.readonly"]}))

(defn forms-watches-create
  "Create a new watch. If a watch ID is provided, it must be unused. For each invoking project, the per form limit is one watch per Watch.EventType. A watch expires seven days after it is created (see Watch.expire_time).
https://developers.google.com/forms/api/guides/v1/reference/rest/v1/forms/watches/create

formId <> 
CreateWatchRequest:
CreateWatchRequest"
  [formId CreateWatchRequest]
  {:method :post,
   :uri-template
   "https://forms.googleapis.com/v1/forms/{formId}/watches",
   :uri-template-args {"formId" formId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/drive.readonly"
    "https://www.googleapis.com/auth/forms.body"
    "https://www.googleapis.com/auth/forms.body.readonly"
    "https://www.googleapis.com/auth/forms.responses.readonly"],
   :body CreateWatchRequest})

(defn forms-watches-list
  "Return a list of the watches owned by the invoking project. The maximum number of watches is two: For each invoker, the limit is one for each event type per form.
https://developers.google.com/forms/api/guides/v1/reference/rest/v1/forms/watches/list

formId <> "
  [formId]
  {:method :get,
   :uri-template
   "https://forms.googleapis.com/v1/forms/{formId}/watches",
   :uri-template-args {"formId" formId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/drive.readonly"
    "https://www.googleapis.com/auth/forms.body"
    "https://www.googleapis.com/auth/forms.body.readonly"
    "https://www.googleapis.com/auth/forms.responses.readonly"]})

(defn forms-watches-renew
  "Renew an existing watch for seven days. The state of the watch after renewal is `ACTIVE`, and the `expire_time` is seven days from the renewal. Renewing a watch in an error state (e.g. `SUSPENDED`) succeeds if the error is no longer present, but fail otherwise. After a watch has expired, RenewWatch returns `NOT_FOUND`.
https://developers.google.com/forms/api/guides/v1/reference/rest/v1/forms/watches/renew

formId <> 
watchId <> 
RenewWatchRequest:
RenewWatchRequest"
  [formId watchId RenewWatchRequest]
  {:method :post,
   :uri-template
   "https://forms.googleapis.com/v1/forms/{formId}/watches/{watchId}:renew",
   :uri-template-args {"formId" formId, "watchId" watchId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/drive.readonly"
    "https://www.googleapis.com/auth/forms.body"
    "https://www.googleapis.com/auth/forms.body.readonly"
    "https://www.googleapis.com/auth/forms.responses.readonly"],
   :body RenewWatchRequest})

(defn forms-watches-delete
  "Delete a watch.
https://developers.google.com/forms/api/guides/v1/reference/rest/v1/forms/watches/delete

formId <> 
watchId <> "
  [formId watchId]
  {:method :delete,
   :uri-template
   "https://forms.googleapis.com/v1/forms/{formId}/watches/{watchId}",
   :uri-template-args {"formId" formId, "watchId" watchId},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive"
    "https://www.googleapis.com/auth/drive.file"
    "https://www.googleapis.com/auth/drive.readonly"
    "https://www.googleapis.com/auth/forms.body"
    "https://www.googleapis.com/auth/forms.body.readonly"
    "https://www.googleapis.com/auth/forms.responses.readonly"]})
