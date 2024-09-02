(ns happyapi.google.fcm-v1
  "Firebase Cloud Messaging API
FCM send API that provides a cross-platform messaging solution to reliably deliver messages at no cost.
See: https://firebase.google.com/docs/cloud-messaging"
  (:require [happyapi.providers.google :as client]))

(defn projects-messages-send
  "Send a message to specified target (a registration token, topic or condition).
https://firebase.google.com/docs/cloud-messaging/v1/reference/rest/v1/projects/messages/send

parent <> 
SendMessageRequest:
SendMessageRequest"
  [parent SendMessageRequest]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://fcm.googleapis.com/v1/{+parent}/messages:send",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/cloud-platform"
      "https://www.googleapis.com/auth/firebase.messaging"],
     :body SendMessageRequest}))
