(ns happyapi.google.docs-v1
  "Google Docs API
Reads and writes Google Docs documents.
See: https://developers.google.com/docs/"
  (:require [happyapi.providers.google :as client]))

(defn documents-get
  "Gets the latest version of the specified document.
https://developers.google.com/docs/v1/reference/rest/v1/documents/get

documentId <> 

optional:
suggestionsViewMode <string> The suggestions view mode to apply to the document. This allows viewing the document with all suggestions inline, accepted or rejected. If one is not specified, DEFAULT_FOR_CURRENT_ACCESS is used."
  ([documentId] (documents-get documentId nil))
  ([documentId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://docs.googleapis.com/v1/documents/{documentId}",
       :uri-template-args {"documentId" documentId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/documents"
        "https://www.googleapis.com/auth/documents.readonly"
        "https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.readonly"]})))

(defn documents-create
  "Creates a blank document using the title given in the request. Other fields in the request, including any provided content, are ignored. Returns the created document.
https://developers.google.com/docs/v1/reference/rest/v1/documents/create

Document:
Document"
  [Document]
  (client/api-request
    {:method :post,
     :uri-template "https://docs.googleapis.com/v1/documents",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/documents"
      "https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"],
     :body Document}))

(defn documents-batchUpdate
  "Applies one or more updates to the document. Each request is validated before being applied. If any request is not valid, then the entire request will fail and nothing will be applied. Some requests have replies to give you some information about how they are applied. Other requests do not need to return information; these each return an empty reply. The order of replies matches that of the requests. For example, suppose you call batchUpdate with four updates, and only the third one returns information. The response would have two empty replies, the reply to the third request, and another empty reply, in that order. Because other users may be editing the document, the document might not exactly reflect your changes: your changes may be altered with respect to collaborator changes. If there are no collaborators, the document should reflect your changes. In any case, the updates in your request are guaranteed to be applied together atomically.
https://developers.google.com/docs/v1/reference/rest/v1/documents/batchUpdate

documentId <> 
BatchUpdateDocumentRequest:
BatchUpdateDocumentRequest"
  [documentId BatchUpdateDocumentRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://docs.googleapis.com/v1/documents/{documentId}:batchUpdate",
     :uri-template-args {"documentId" documentId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/documents"
      "https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"],
     :body BatchUpdateDocumentRequest}))
