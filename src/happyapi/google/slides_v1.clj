(ns happyapi.google.slides-v1
  "Google Slides API
Reads and writes Google Slides presentations.
See: https://developers.google.com/slides/"
  (:require [happyapi.providers.google :as client]))

(defn presentations-get
  "Gets the latest version of the specified presentation.
https://developers.google.com/slides/v1/reference/rest/v1/presentations/get

presentationId <> "
  [presentationId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://slides.googleapis.com/v1/presentations/{+presentationId}",
     :uri-template-args {"presentationId" presentationId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/drive.readonly"
      "https://www.googleapis.com/auth/presentations"
      "https://www.googleapis.com/auth/presentations.readonly"]}))

(defn presentations-create
  "Creates a blank presentation using the title given in the request. If a `presentationId` is provided, it is used as the ID of the new presentation. Otherwise, a new ID is generated. Other fields in the request, including any provided content, are ignored. Returns the created presentation.
https://developers.google.com/slides/v1/reference/rest/v1/presentations/create

Presentation:
Presentation"
  [Presentation]
  (client/api-request
    {:method :post,
     :uri-template "https://slides.googleapis.com/v1/presentations",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/presentations"],
     :body Presentation}))

(defn presentations-batchUpdate
  "Applies one or more updates to the presentation. Each request is validated before being applied. If any request is not valid, then the entire request will fail and nothing will be applied. Some requests have replies to give you some information about how they are applied. Other requests do not need to return information; these each return an empty reply. The order of replies matches that of the requests. For example, suppose you call batchUpdate with four updates, and only the third one returns information. The response would have two empty replies: the reply to the third request, and another empty reply, in that order. Because other users may be editing the presentation, the presentation might not exactly reflect your changes: your changes may be altered with respect to collaborator changes. If there are no collaborators, the presentation should reflect your changes. In any case, the updates in your request are guaranteed to be applied together atomically.
https://developers.google.com/slides/v1/reference/rest/v1/presentations/batchUpdate

presentationId <> 
BatchUpdatePresentationRequest:
BatchUpdatePresentationRequest"
  [presentationId BatchUpdatePresentationRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://slides.googleapis.com/v1/presentations/{presentationId}:batchUpdate",
     :uri-template-args {"presentationId" presentationId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/drive.readonly"
      "https://www.googleapis.com/auth/presentations"
      "https://www.googleapis.com/auth/spreadsheets"
      "https://www.googleapis.com/auth/spreadsheets.readonly"],
     :body BatchUpdatePresentationRequest}))

(defn presentations-pages-get
  "Gets the latest version of the specified page in the presentation.
https://developers.google.com/slides/v1/reference/rest/v1/presentations/pages/get

presentationId <> 
pageObjectId <> "
  [presentationId pageObjectId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://slides.googleapis.com/v1/presentations/{presentationId}/pages/{pageObjectId}",
     :uri-template-args
     {"presentationId" presentationId, "pageObjectId" pageObjectId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive"
      "https://www.googleapis.com/auth/drive.file"
      "https://www.googleapis.com/auth/drive.readonly"
      "https://www.googleapis.com/auth/presentations"
      "https://www.googleapis.com/auth/presentations.readonly"]}))

(defn presentations-pages-getThumbnail
  "Generates a thumbnail of the latest version of the specified page in the presentation and returns a URL to the thumbnail image. This request counts as an [expensive read request](/slides/limits) for quota purposes.
https://developers.google.com/slides/v1/reference/rest/v1/presentations/pages/getThumbnail

presentationId <> 
pageObjectId <> 

optional:
thumbnailProperties.mimeType <string> The optional mime type of the thumbnail image. If you don't specify the mime type, the mime type defaults to PNG.
thumbnailProperties.thumbnailSize <string> The optional thumbnail image size. If you don't specify the size, the server chooses a default size of the image."
  ([presentationId pageObjectId]
    (presentations-pages-getThumbnail presentationId pageObjectId nil))
  ([presentationId pageObjectId optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://slides.googleapis.com/v1/presentations/{presentationId}/pages/{pageObjectId}/thumbnail",
       :uri-template-args
       {"presentationId" presentationId, "pageObjectId" pageObjectId},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/drive"
        "https://www.googleapis.com/auth/drive.file"
        "https://www.googleapis.com/auth/drive.readonly"
        "https://www.googleapis.com/auth/presentations"
        "https://www.googleapis.com/auth/presentations.readonly"]})))
