(ns happyapi.google.driveactivity-v2
  "Drive Activity API
Provides a historical view of activity in Google Drive.
See: https://developers.google.com/drive/activity/v2"
  (:require [happyapi.providers.google :as client]))

(defn activity-query
  "Query past activity in Google Drive.
https://developers.google.com/drive/activity/v2/v2/reference/rest/v2/activity/query

QueryDriveActivityRequest:
QueryDriveActivityRequest"
  [QueryDriveActivityRequest]
  (client/api-request
    {:method :post,
     :uri-template
     "https://driveactivity.googleapis.com/v2/activity:query",
     :uri-template-args {},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/drive.activity"
      "https://www.googleapis.com/auth/drive.activity.readonly"],
     :body QueryDriveActivityRequest}))
