(ns happyapi.google.groupsmigration-v1
  "Groups Migration API
The Groups Migration API allows domain administrators to archive emails into Google groups.
See: https://developers.google.com/admin-sdk/groups-migration/v1/guides/overview"
  (:require [happyapi.providers.google :as client]))

(defn archive-insert
  "Inserts a new mail into the archive of the Google group.
https://developers.google.com/admin-sdk/groups-migration/v1/guides/overview/v1/reference/rest/v1/archive/insert

groupId <> "
  [groupId]
  (client/api-request
    {:method :post,
     :uri-template
     "https://groupsmigration.googleapis.com/groups/v1/groups/{groupId}/archive",
     :uri-template-args {"groupId" groupId},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/apps.groups.migration"]}))
