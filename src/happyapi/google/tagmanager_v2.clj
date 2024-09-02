(ns happyapi.google.tagmanager-v2
  "Tag Manager API
This API allows clients to access and modify container and tag configuration.
See: https://developers.google.com/tag-platform/tag-manager"
  (:require [happyapi.providers.google :as client]))

(defn accounts-list
  "Lists all GTM Accounts that a user has access to.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/list

optional:
includeGoogleTags <boolean> Also retrieve accounts associated with Google Tag when true."
  ([] (accounts-list nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/accounts",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.manage.accounts"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-get
  "Gets a GTM Account.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.manage.accounts"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-update
  "Updates a GTM Account.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/update

path <> 
Account:
Account

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the account in storage."
  ([path Account] (accounts-update path Account nil))
  ([path Account optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.manage.accounts"],
       :body Account})))

(defn accounts-user_permissions-create
  "Creates a user's Account & Container access.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/user_permissions/create

parent <> 
UserPermission:
UserPermission"
  [parent UserPermission]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/user_permissions",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.manage.users"],
     :body UserPermission}))

(defn accounts-user_permissions-list
  "List all users that have access to the account along with Account and Container user access granted to each of them.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/user_permissions/list

parent <> "
  ([parent] (accounts-user_permissions-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/user_permissions",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.manage.users"]})))

(defn accounts-user_permissions-get
  "Gets a user's Account & Container access.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/user_permissions/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.manage.users"]}))

(defn accounts-user_permissions-update
  "Updates a user's Account & Container access.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/user_permissions/update

path <> 
UserPermission:
UserPermission"
  [path UserPermission]
  (client/*api-request*
    {:method :put,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.manage.users"],
     :body UserPermission}))

(defn accounts-user_permissions-delete
  "Removes a user from the account, revoking access to it and all of its containers.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/user_permissions/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.manage.users"]}))

(defn accounts-containers-list
  "Lists all Containers that belongs to a GTM Account.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/list

parent <> "
  ([parent] (accounts-containers-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/containers",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-delete
  "Deletes a Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.delete.containers"]}))

(defn accounts-containers-snippet
  "Gets the tagging snippet for a Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/snippet

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:snippet",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-lookup
  "Looks up a Container by destination ID or tag ID.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/lookup

optional:
destinationId <string> Destination ID linked to a GTM Container, e.g. AW-123456789. Example: accounts/containers:lookup?destination_id={destination_id}. Only one of destination_id or tag_id should be set.
tagId <string> Tag ID for a GTM Container, e.g. GTM-123456789. Example: accounts/containers:lookup?tag_id={tag_id}. Only one of destination_id or tag_id should be set."
  ([] (accounts-containers-lookup nil))
  ([optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/accounts/containers:lookup",
       :uri-template-args {},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-update
  "Updates a Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/update

path <> 
Container:
Container

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the container in storage."
  ([path Container] (accounts-containers-update path Container nil))
  ([path Container optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body Container})))

(defn accounts-containers-create
  "Creates a Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/create

parent <> 
Container:
Container"
  [parent Container]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/containers",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
     :body Container}))

(defn accounts-containers-move_tag_id
  "Move Tag ID out of a Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/move_tag_id

path <> 

optional:
tagId <string> Tag ID to be removed from the current Container.
tagName <string> The name for the newly created tag.
copyUsers <boolean> Whether or not to copy users from this tag to the new tag.
copySettings <boolean> Whether or not to copy tag settings from this tag to the new tag.
allowUserPermissionFeatureUpdate <boolean> Must be set to true to allow features.user_permissions to change from false to true. If this operation causes an update but this bit is false, the operation will fail.
copyTermsOfService <boolean> Must be set to true to accept all terms of service agreements copied from the current tag to the newly created tag. If this bit is false, the operation will fail."
  ([path] (accounts-containers-move_tag_id path nil))
  ([path optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:move_tag_id",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-combine
  "Combines Containers.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/combine

path <> 

optional:
containerId <string> ID of container that will be merged into the current container.
allowUserPermissionFeatureUpdate <boolean> Must be set to true to allow features.user_permissions to change from false to true. If this operation causes an update but this bit is false, the operation will fail.
settingSource <string> Specify the source of config setting after combine"
  ([path] (accounts-containers-combine path nil))
  ([path optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:combine",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-get
  "Gets a Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-destinations-get
  "Gets a Destination.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/destinations/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-destinations-list
  "Lists all Destinations linked to a GTM Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/destinations/list

parent <> "
  [parent]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/destinations",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-destinations-link
  "Adds a Destination to this Container and removes it from the Container to which it is currently linked.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/destinations/link

parent <> 

optional:
destinationId <string> Destination ID to be linked to the current container.
allowUserPermissionFeatureUpdate <boolean> Must be set to true to allow features.user_permissions to change from false to true. If this operation causes an update but this bit is false, the operation will fail."
  ([parent] (accounts-containers-destinations-link parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/destinations:link",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-workspaces-list
  "Lists all Workspaces that belong to a GTM Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/list

parent <> "
  ([parent] (accounts-containers-workspaces-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/workspaces",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-workspaces-delete
  "Deletes a Workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.delete.containers"]}))

(defn accounts-containers-workspaces-getStatus
  "Finds conflicting and modified entities in the workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/getStatus

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}/status",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-workspaces-update
  "Updates a Workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/update

path <> 
Workspace:
Workspace

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the workspace in storage."
  ([path Workspace]
    (accounts-containers-workspaces-update path Workspace nil))
  ([path Workspace optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body Workspace})))

(defn accounts-containers-workspaces-sync
  "Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/sync

path <> "
  [path]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:sync",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"]}))

(defn accounts-containers-workspaces-resolve_conflict
  "Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/resolve_conflict

path <> 
Entity:
Entity

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the entity_in_workspace in the merge conflict."
  ([path Entity]
    (accounts-containers-workspaces-resolve_conflict path Entity nil))
  ([path Entity optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:resolve_conflict",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body Entity})))

(defn accounts-containers-workspaces-create
  "Creates a Workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/create

parent <> 
Workspace:
Workspace"
  [parent Workspace]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/workspaces",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
     :body Workspace}))

(defn accounts-containers-workspaces-quick_preview
  "Quick previews a workspace by creating a fake container version from all entities in the provided workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/quick_preview

path <> "
  [path]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:quick_preview",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containerversions"]}))

(defn accounts-containers-workspaces-get
  "Gets a Workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-workspaces-create_version
  "Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created version.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/create_version

path <> 
CreateContainerVersionRequestVersionOptions:
CreateContainerVersionRequestVersionOptions"
  [path CreateContainerVersionRequestVersionOptions]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:create_version",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containerversions"],
     :body CreateContainerVersionRequestVersionOptions}))

(defn accounts-containers-workspaces-zones-create
  "Creates a GTM Zone.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/zones/create

parent <> 
Zone:
Zone"
  [parent Zone]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/zones",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
     :body Zone}))

(defn accounts-containers-workspaces-zones-list
  "Lists all GTM Zones of a GTM container workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/zones/list

parent <> "
  ([parent] (accounts-containers-workspaces-zones-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/zones",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-workspaces-zones-get
  "Gets a GTM Zone.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/zones/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-workspaces-zones-update
  "Updates a GTM Zone.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/zones/update

path <> 
Zone:
Zone

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the zone in storage."
  ([path Zone]
    (accounts-containers-workspaces-zones-update path Zone nil))
  ([path Zone optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body Zone})))

(defn accounts-containers-workspaces-zones-delete
  "Deletes a GTM Zone.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/zones/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"]}))

(defn accounts-containers-workspaces-zones-revert
  "Reverts changes to a GTM Zone in a GTM Workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/zones/revert

path <> 

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the zone in storage."
  ([path] (accounts-containers-workspaces-zones-revert path nil))
  ([path optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:revert",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-workspaces-tags-create
  "Creates a GTM Tag.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/tags/create

parent <> 
Tag:
Tag"
  [parent Tag]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/tags",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
     :body Tag}))

(defn accounts-containers-workspaces-tags-list
  "Lists all GTM Tags of a Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/tags/list

parent <> "
  ([parent] (accounts-containers-workspaces-tags-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/tags",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-workspaces-tags-get
  "Gets a GTM Tag.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/tags/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-workspaces-tags-update
  "Updates a GTM Tag.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/tags/update

path <> 
Tag:
Tag

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the tag in storage."
  ([path Tag]
    (accounts-containers-workspaces-tags-update path Tag nil))
  ([path Tag optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body Tag})))

(defn accounts-containers-workspaces-tags-delete
  "Deletes a GTM Tag.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/tags/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"]}))

(defn accounts-containers-workspaces-tags-revert
  "Reverts changes to a GTM Tag in a GTM Workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/tags/revert

path <> 

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of thetag in storage."
  ([path] (accounts-containers-workspaces-tags-revert path nil))
  ([path optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:revert",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-workspaces-clients-create
  "Creates a GTM Client.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/clients/create

parent <> 
Client:
Client"
  [parent Client]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/clients",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
     :body Client}))

(defn accounts-containers-workspaces-clients-list
  "Lists all GTM Clients of a GTM container workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/clients/list

parent <> "
  ([parent] (accounts-containers-workspaces-clients-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/clients",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-workspaces-clients-get
  "Gets a GTM Client.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/clients/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-workspaces-clients-update
  "Updates a GTM Client.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/clients/update

path <> 
Client:
Client

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the client in storage."
  ([path Client]
    (accounts-containers-workspaces-clients-update path Client nil))
  ([path Client optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body Client})))

(defn accounts-containers-workspaces-clients-delete
  "Deletes a GTM Client.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/clients/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"]}))

(defn accounts-containers-workspaces-clients-revert
  "Reverts changes to a GTM Client in a GTM Workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/clients/revert

path <> 

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the client in storage."
  ([path] (accounts-containers-workspaces-clients-revert path nil))
  ([path optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:revert",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-workspaces-gtag_config-create
  "Creates a Google tag config.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/gtag_config/create

parent <> 
GtagConfig:
GtagConfig"
  [parent GtagConfig]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/gtag_config",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
     :body GtagConfig}))

(defn accounts-containers-workspaces-gtag_config-list
  "Lists all Google tag configs in a Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/gtag_config/list

parent <> "
  ([parent]
    (accounts-containers-workspaces-gtag_config-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/gtag_config",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-workspaces-gtag_config-get
  "Gets a Google tag config.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/gtag_config/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-workspaces-gtag_config-update
  "Updates a Google tag config.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/gtag_config/update

path <> 
GtagConfig:
GtagConfig

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the config in storage."
  ([path GtagConfig]
    (accounts-containers-workspaces-gtag_config-update
      path
      GtagConfig
      nil))
  ([path GtagConfig optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body GtagConfig})))

(defn accounts-containers-workspaces-gtag_config-delete
  "Deletes a Google tag config.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/gtag_config/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"]}))

(defn accounts-containers-workspaces-variables-create
  "Creates a GTM Variable.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/variables/create

parent <> 
Variable:
Variable"
  [parent Variable]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/variables",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
     :body Variable}))

(defn accounts-containers-workspaces-variables-list
  "Lists all GTM Variables of a Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/variables/list

parent <> "
  ([parent] (accounts-containers-workspaces-variables-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/variables",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-workspaces-variables-get
  "Gets a GTM Variable.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/variables/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-workspaces-variables-update
  "Updates a GTM Variable.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/variables/update

path <> 
Variable:
Variable

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the variable in storage."
  ([path Variable]
    (accounts-containers-workspaces-variables-update
      path
      Variable
      nil))
  ([path Variable optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body Variable})))

(defn accounts-containers-workspaces-variables-delete
  "Deletes a GTM Variable.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/variables/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"]}))

(defn accounts-containers-workspaces-variables-revert
  "Reverts changes to a GTM Variable in a GTM Workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/variables/revert

path <> 

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the variable in storage."
  ([path] (accounts-containers-workspaces-variables-revert path nil))
  ([path optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:revert",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-workspaces-built_in_variables-create
  "Creates one or more GTM Built-In Variables.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/built_in_variables/create

parent <> 

optional:
type <string> The types of built-in variables to enable."
  ([parent]
    (accounts-containers-workspaces-built_in_variables-create
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/built_in_variables",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-workspaces-built_in_variables-delete
  "Deletes one or more GTM Built-In Variables.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/built_in_variables/delete

path <> 

optional:
type <string> The types of built-in variables to delete."
  ([path]
    (accounts-containers-workspaces-built_in_variables-delete
      path
      nil))
  ([path optional]
    (client/*api-request*
      {:method :delete,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-workspaces-built_in_variables-list
  "Lists all the enabled Built-In Variables of a GTM Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/built_in_variables/list

parent <> "
  ([parent]
    (accounts-containers-workspaces-built_in_variables-list
      parent
      nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/built_in_variables",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-workspaces-built_in_variables-revert
  "Reverts changes to a GTM Built-In Variables in a GTM Workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/built_in_variables/revert

path <> 

optional:
type <string> The type of built-in variable to revert."
  ([path]
    (accounts-containers-workspaces-built_in_variables-revert
      path
      nil))
  ([path optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}/built_in_variables:revert",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-workspaces-folders-create
  "Creates a GTM Folder.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/folders/create

parent <> 
Folder:
Folder"
  [parent Folder]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/folders",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
     :body Folder}))

(defn accounts-containers-workspaces-folders-list
  "Lists all GTM Folders of a Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/folders/list

parent <> "
  ([parent] (accounts-containers-workspaces-folders-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/folders",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-workspaces-folders-get
  "Gets a GTM Folder.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/folders/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-workspaces-folders-entities
  "List all entities in a GTM Folder.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/folders/entities

path <> "
  ([path] (accounts-containers-workspaces-folders-entities path nil))
  ([path optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:entities",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-workspaces-folders-update
  "Updates a GTM Folder.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/folders/update

path <> 
Folder:
Folder

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the folder in storage."
  ([path Folder]
    (accounts-containers-workspaces-folders-update path Folder nil))
  ([path Folder optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body Folder})))

(defn accounts-containers-workspaces-folders-delete
  "Deletes a GTM Folder.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/folders/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"]}))

(defn accounts-containers-workspaces-folders-move_entities_to_folder
  "Moves entities to a GTM Folder. If {folder_id} in the request path equals 0, this will instead move entities out of the folder they currently belong to.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/folders/move_entities_to_folder

path <> 
Folder:
Folder

optional:
tagId <string> The tags to be moved to the folder.
variableId <string> The variables to be moved to the folder.
triggerId <string> The triggers to be moved to the folder."
  ([path Folder]
    (accounts-containers-workspaces-folders-move_entities_to_folder
      path
      Folder
      nil))
  ([path Folder optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:move_entities_to_folder",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body Folder})))

(defn accounts-containers-workspaces-folders-revert
  "Reverts changes to a GTM Folder in a GTM Workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/folders/revert

path <> 

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the tag in storage."
  ([path] (accounts-containers-workspaces-folders-revert path nil))
  ([path optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:revert",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-workspaces-templates-create
  "Creates a GTM Custom Template.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/templates/create

parent <> 
CustomTemplate:
CustomTemplate"
  [parent CustomTemplate]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/templates",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
     :body CustomTemplate}))

(defn accounts-containers-workspaces-templates-list
  "Lists all GTM Templates of a GTM container workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/templates/list

parent <> "
  ([parent] (accounts-containers-workspaces-templates-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/templates",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-workspaces-templates-get
  "Gets a GTM Template.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/templates/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-workspaces-templates-update
  "Updates a GTM Template.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/templates/update

path <> 
CustomTemplate:
CustomTemplate

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the templates in storage."
  ([path CustomTemplate]
    (accounts-containers-workspaces-templates-update
      path
      CustomTemplate
      nil))
  ([path CustomTemplate optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body CustomTemplate})))

(defn accounts-containers-workspaces-templates-delete
  "Deletes a GTM Template.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/templates/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"]}))

(defn accounts-containers-workspaces-templates-revert
  "Reverts changes to a GTM Template in a GTM Workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/templates/revert

path <> 

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the template in storage."
  ([path] (accounts-containers-workspaces-templates-revert path nil))
  ([path optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:revert",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-workspaces-triggers-create
  "Creates a GTM Trigger.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/triggers/create

parent <> 
Trigger:
Trigger"
  [parent Trigger]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/triggers",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
     :body Trigger}))

(defn accounts-containers-workspaces-triggers-list
  "Lists all GTM Triggers of a Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/triggers/list

parent <> "
  ([parent] (accounts-containers-workspaces-triggers-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/triggers",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-workspaces-triggers-get
  "Gets a GTM Trigger.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/triggers/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-workspaces-triggers-update
  "Updates a GTM Trigger.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/triggers/update

path <> 
Trigger:
Trigger

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the trigger in storage."
  ([path Trigger]
    (accounts-containers-workspaces-triggers-update path Trigger nil))
  ([path Trigger optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body Trigger})))

(defn accounts-containers-workspaces-triggers-delete
  "Deletes a GTM Trigger.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/triggers/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"]}))

(defn accounts-containers-workspaces-triggers-revert
  "Reverts changes to a GTM Trigger in a GTM Workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/triggers/revert

path <> 

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the trigger in storage."
  ([path] (accounts-containers-workspaces-triggers-revert path nil))
  ([path optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:revert",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-workspaces-transformations-create
  "Creates a GTM Transformation.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/transformations/create

parent <> 
Transformation:
Transformation"
  [parent Transformation]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/transformations",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
     :body Transformation}))

(defn accounts-containers-workspaces-transformations-list
  "Lists all GTM Transformations of a GTM container workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/transformations/list

parent <> "
  ([parent]
    (accounts-containers-workspaces-transformations-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/transformations",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-workspaces-transformations-get
  "Gets a GTM Transformation.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/transformations/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-workspaces-transformations-update
  "Updates a GTM Transformation.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/transformations/update

path <> 
Transformation:
Transformation

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the transformation in storage."
  ([path Transformation]
    (accounts-containers-workspaces-transformations-update
      path
      Transformation
      nil))
  ([path Transformation optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body Transformation})))

(defn accounts-containers-workspaces-transformations-delete
  "Deletes a GTM Transformation.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/transformations/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"]}))

(defn accounts-containers-workspaces-transformations-revert
  "Reverts changes to a GTM Transformation in a GTM Workspace.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/workspaces/transformations/revert

path <> 

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the transformation in storage."
  ([path]
    (accounts-containers-workspaces-transformations-revert path nil))
  ([path optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:revert",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"]})))

(defn accounts-containers-versions-get
  "Gets a Container Version.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/versions/get

path <> 

optional:
containerVersionId <string> The GTM ContainerVersion ID. Specify published to retrieve the currently published version."
  ([path] (accounts-containers-versions-get path nil))
  ([path optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.edit.containerversions"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-versions-update
  "Updates a Container Version.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/versions/update

path <> 
ContainerVersion:
ContainerVersion

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the container version in storage."
  ([path ContainerVersion]
    (accounts-containers-versions-update path ContainerVersion nil))
  ([path ContainerVersion optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containerversions"],
       :body ContainerVersion})))

(defn accounts-containers-versions-delete
  "Deletes a Container Version.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/versions/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containerversions"]}))

(defn accounts-containers-versions-undelete
  "Undeletes a Container Version.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/versions/undelete

path <> "
  [path]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:undelete",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containerversions"]}))

(defn accounts-containers-versions-publish
  "Publishes a Container Version.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/versions/publish

path <> 

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the container version in storage."
  ([path] (accounts-containers-versions-publish path nil))
  ([path optional]
    (client/*api-request*
      {:method :post,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:publish",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.publish"]})))

(defn accounts-containers-versions-set_latest
  "Sets the latest version used for synchronization of workspaces when detecting conflicts and errors.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/versions/set_latest

path <> "
  [path]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:set_latest",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"]}))

(defn accounts-containers-versions-live
  "Gets the live (i.e. published) container version
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/versions/live

parent <> "
  [parent]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/versions:live",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-version_headers-list
  "Lists all Container Versions of a GTM Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/version_headers/list

parent <> 

optional:
includeDeleted <boolean> Also retrieve deleted (archived) versions when true."
  ([parent] (accounts-containers-version_headers-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/version_headers",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.edit.containerversions"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-version_headers-latest
  "Gets the latest container version header
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/version_headers/latest

parent <> "
  [parent]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/version_headers:latest",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-environments-create
  "Creates a GTM Environment.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/environments/create

parent <> 
Environment:
Environment"
  [parent Environment]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/environments",
     :uri-template-args {"parent" parent},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
     :body Environment}))

(defn accounts-containers-environments-list
  "Lists all GTM Environments of a GTM Container.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/environments/list

parent <> "
  ([parent] (accounts-containers-environments-list parent nil))
  ([parent optional]
    (client/*api-request*
      {:method :get,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+parent}/environments",
       :uri-template-args {"parent" parent},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"
        "https://www.googleapis.com/auth/tagmanager.readonly"]})))

(defn accounts-containers-environments-get
  "Gets a GTM Environment.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/environments/get

path <> "
  [path]
  (client/*api-request*
    {:method :get,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"
      "https://www.googleapis.com/auth/tagmanager.readonly"]}))

(defn accounts-containers-environments-update
  "Updates a GTM Environment.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/environments/update

path <> 
Environment:
Environment

optional:
fingerprint <string> When provided, this fingerprint must match the fingerprint of the environment in storage."
  ([path Environment]
    (accounts-containers-environments-update path Environment nil))
  ([path Environment optional]
    (client/*api-request*
      {:method :put,
       :uri-template
       "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
       :uri-template-args {"path" path},
       :query-params (merge {} optional),
       :scopes
       ["https://www.googleapis.com/auth/tagmanager.edit.containers"],
       :body Environment})))

(defn accounts-containers-environments-delete
  "Deletes a GTM Environment.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/environments/delete

path <> "
  [path]
  (client/*api-request*
    {:method :delete,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes
     ["https://www.googleapis.com/auth/tagmanager.edit.containers"]}))

(defn accounts-containers-environments-reauthorize
  "Re-generates the authorization code for a GTM Environment.
https://developers.google.com/tag-platform/tag-manager/v2/reference/rest/v2/accounts/containers/environments/reauthorize

path <> 
Environment:
Environment"
  [path Environment]
  (client/*api-request*
    {:method :post,
     :uri-template
     "https://tagmanager.googleapis.com/tagmanager/v2/{+path}:reauthorize",
     :uri-template-args {"path" path},
     :query-params {},
     :scopes ["https://www.googleapis.com/auth/tagmanager.publish"],
     :body Environment}))
