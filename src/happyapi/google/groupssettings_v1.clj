(ns happyapi.google.groupssettings-v1
  "Groups Settings API
Manages permission levels and related settings of a group.
See: https://developers.google.com/admin-sdk/groups-settings/concepts"
  (:require [happyapi.providers.google :as client]))

(defn groups-get
  "Gets one resource by id.
https://developers.google.com/admin-sdk/groups-settings/concepts/v1/reference/rest/v1/groups/get

groupUniqueId <> "
  [groupUniqueId]
  (client/api-request
    {:method :get,
     :uri-template
     "https://www.googleapis.com/groups/v1/groups/{groupUniqueId}",
     :uri-template-args {"groupUniqueId" groupUniqueId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/apps.groups.settings"]}))

(defn groups-patch
  "Updates an existing resource. This method supports patch semantics.
https://developers.google.com/admin-sdk/groups-settings/concepts/v1/reference/rest/v1/groups/patch

groupUniqueId <> 
Groups:
Groups"
  [groupUniqueId Groups]
  (client/api-request
    {:method :patch,
     :uri-template
     "https://www.googleapis.com/groups/v1/groups/{groupUniqueId}",
     :uri-template-args {"groupUniqueId" groupUniqueId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/apps.groups.settings"],
     :body Groups}))

(defn groups-update
  "Updates an existing resource.
https://developers.google.com/admin-sdk/groups-settings/concepts/v1/reference/rest/v1/groups/update

groupUniqueId <> 
Groups:
Groups"
  [groupUniqueId Groups]
  (client/api-request
    {:method :put,
     :uri-template
     "https://www.googleapis.com/groups/v1/groups/{groupUniqueId}",
     :uri-template-args {"groupUniqueId" groupUniqueId},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/apps.groups.settings"],
     :body Groups}))
