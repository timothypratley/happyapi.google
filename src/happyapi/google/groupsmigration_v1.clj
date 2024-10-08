(ns happyapi.google.groupsmigration-v1
  "Groups Migration API
The Groups Migration API allows domain administrators to archive emails into Google groups.
See: https://developers.google.com/workspace/guides/get-started")

(defn archive-insert
  "Inserts a new mail into the archive of the Google group.
https://developers.google.com/workspace/guides/get-started/v1/reference/rest/v1/archive/insert

groupId <> "
  [groupId]
  {:method :post,
   :uri-template
   "https://groupsmigration.googleapis.com/groups/v1/groups/{groupId}/archive",
   :uri-template-args {"groupId" groupId},
   :query-params {},
   :scopes ["https://www.googleapis.com/auth/apps.groups.migration"]})
