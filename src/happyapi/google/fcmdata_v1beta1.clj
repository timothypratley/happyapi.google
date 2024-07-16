(ns happyapi.google.fcmdata-v1beta1
  "Firebase Cloud Messaging Data API
Provides additional information about Firebase Cloud Messaging (FCM) message sends and deliveries.
See: https://firebase.google.com/docs/cloud-messaging"
  (:require [happyapi.providers.google :as client]))

(defn projects-androidApps-deliveryData-list
  "List aggregate delivery data for the given Android application.
https://firebase.google.com/docs/cloud-messaging/v1beta1/reference/rest/v1beta1/projects/androidApps/deliveryData/list

parent <> 

optional:
pageSize <integer> The maximum number of entries to return. The service may return fewer than this value. If unspecified, at most 1,000 entries will be returned. The maximum value is 10,000; values above 10,000 will be capped to 10,000. This default may change over time."
  ([parent] (projects-androidApps-deliveryData-list parent nil))
  ([parent optional]
    (client/api-request
      {:method :get,
       :uri-template
       "https://fcmdata.googleapis.com/v1beta1/{+parent}/deliveryData",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes ["https://www.googleapis.com/auth/cloud-platform"]})))
