(ns happyapi.google.drivelabels-v2
  "Drive Labels API
An API for managing Drive Labels
See: https://developers.google.com/drive/labels/guides/overview")

(defn labels-list
  "List labels.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/list

optional:
view <string> When specified, only certain fields belonging to the indicated view are returned.
publishedOnly <boolean> Whether to include only published labels in the results. * When `true`, only the current published label revisions are returned. Disabled labels are included. Returned label resource names reference the published revision (`labels/{id}/{revision_id}`). * When `false`, the current label revisions are returned, which might not be published. Returned label resource names don't reference a specific revision (`labels/{id}`).
languageCode <string> The BCP-47 language code to use for evaluating localized field labels. When not specified, values in the default configured language are used.
useAdminAccess <boolean> Set to `true` in order to use the user's admin credentials. This will return all Labels within the customer.
customer <string> The customer to scope this list request to. For example: \"customers/abcd1234\". If unset, will return all labels within the current customer.
minimumRole <string> Specifies the level of access the user must have on the returned Labels. The minimum role a user must have on a label. Defaults to `READER`.
pageSize <integer> Maximum number of labels to return per page. Default: 50. Max: 200."
  ([] (labels-list nil))
  ([optional]
    {:method :get,
     :uri-template "https://drivelabels.googleapis.com/v2/labels",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.admin.labels.readonly"
      "https://www.googleapis.com/auth/drive.labels"
      "https://www.googleapis.com/auth/drive.labels.readonly"]}))

(defn labels-delete
  "Permanently deletes a Label and related metadata on Drive Items. Once deleted, the Label and related Drive item metadata will be deleted. Only draft Labels, and disabled Labels may be deleted.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/delete

name <> 

optional:
useAdminAccess <boolean> Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
writeControl.requiredRevisionId <string> The revision_id of the label that the write request will be applied to. If this is not the latest revision of the label, the request will not be processed and will return a 400 Bad Request error."
  ([name] (labels-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://drivelabels.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.labels"]}))

(defn labels-delta
  "Updates a single Label by applying a set of update requests resulting in a new draft revision. The batch update is all-or-nothing: If any of the update requests are invalid, no changes are applied. The resulting draft revision must be published before the changes may be used with Drive Items.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/delta

name <> 
GoogleAppsDriveLabelsV2DeltaUpdateLabelRequest:
GoogleAppsDriveLabelsV2DeltaUpdateLabelRequest"
  [name GoogleAppsDriveLabelsV2DeltaUpdateLabelRequest]
  {:method :post,
   :uri-template "https://drivelabels.googleapis.com/v2/{+name}:delta",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive.admin.labels"
    "https://www.googleapis.com/auth/drive.labels"],
   :body GoogleAppsDriveLabelsV2DeltaUpdateLabelRequest})

(defn labels-enable
  "Enable a disabled Label and restore it to its published state. This will result in a new published revision based on the current disabled published revision. If there is an existing disabled draft revision, a new revision will be created based on that draft and will be enabled.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/enable

name <> 
GoogleAppsDriveLabelsV2EnableLabelRequest:
GoogleAppsDriveLabelsV2EnableLabelRequest"
  [name GoogleAppsDriveLabelsV2EnableLabelRequest]
  {:method :post,
   :uri-template
   "https://drivelabels.googleapis.com/v2/{+name}:enable",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive.admin.labels"
    "https://www.googleapis.com/auth/drive.labels"],
   :body GoogleAppsDriveLabelsV2EnableLabelRequest})

(defn labels-updateLabelCopyMode
  "Updates a Label's `CopyMode`. Changes to this policy are not revisioned, do not require publishing, and take effect immediately.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/updateLabelCopyMode

name <> 
GoogleAppsDriveLabelsV2UpdateLabelCopyModeRequest:
GoogleAppsDriveLabelsV2UpdateLabelCopyModeRequest"
  [name GoogleAppsDriveLabelsV2UpdateLabelCopyModeRequest]
  {:method :post,
   :uri-template
   "https://drivelabels.googleapis.com/v2/{+name}:updateLabelCopyMode",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive.admin.labels"
    "https://www.googleapis.com/auth/drive.labels"],
   :body GoogleAppsDriveLabelsV2UpdateLabelCopyModeRequest})

(defn labels-disable
  "Disable a published Label. Disabling a Label will result in a new disabled published revision based on the current published revision. If there is a draft revision, a new disabled draft revision will be created based on the latest draft revision. Older draft revisions will be deleted. Once disabled, a label may be deleted with `DeleteLabel`.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/disable

name <> 
GoogleAppsDriveLabelsV2DisableLabelRequest:
GoogleAppsDriveLabelsV2DisableLabelRequest"
  [name GoogleAppsDriveLabelsV2DisableLabelRequest]
  {:method :post,
   :uri-template
   "https://drivelabels.googleapis.com/v2/{+name}:disable",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive.admin.labels"
    "https://www.googleapis.com/auth/drive.labels"],
   :body GoogleAppsDriveLabelsV2DisableLabelRequest})

(defn labels-publish
  "Publish all draft changes to the Label. Once published, the Label may not return to its draft state. See `google.apps.drive.labels.v2.Lifecycle` for more information. Publishing a Label will result in a new published revision. All previous draft revisions will be deleted. Previous published revisions will be kept but are subject to automated deletion as needed. Once published, some changes are no longer permitted. Generally, any change that would invalidate or cause new restrictions on existing metadata related to the Label will be rejected. For example, the following changes to a Label will be rejected after the Label is published: * The label cannot be directly deleted. It must be disabled first, then deleted. * Field.FieldType cannot be changed. * Changes to Field validation options cannot reject something that was previously accepted. * Reducing the max entries.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/publish

name <> 
GoogleAppsDriveLabelsV2PublishLabelRequest:
GoogleAppsDriveLabelsV2PublishLabelRequest"
  [name GoogleAppsDriveLabelsV2PublishLabelRequest]
  {:method :post,
   :uri-template
   "https://drivelabels.googleapis.com/v2/{+name}:publish",
   :uri-template-args {"name" name},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive.admin.labels"
    "https://www.googleapis.com/auth/drive.labels"],
   :body GoogleAppsDriveLabelsV2PublishLabelRequest})

(defn labels-create
  "Creates a new Label.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/create

GoogleAppsDriveLabelsV2Label:
GoogleAppsDriveLabelsV2Label

optional:
useAdminAccess <boolean> Set to `true` in order to use the user's admin privileges. The server will verify the user is an admin before allowing access.
languageCode <string> The BCP-47 language code to use for evaluating localized Field labels in response. When not specified, values in the default configured language will be used."
  ([GoogleAppsDriveLabelsV2Label]
    (labels-create GoogleAppsDriveLabelsV2Label nil))
  ([GoogleAppsDriveLabelsV2Label optional]
    {:method :post,
     :uri-template "https://drivelabels.googleapis.com/v2/labels",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.labels"],
     :body GoogleAppsDriveLabelsV2Label}))

(defn labels-get
  "Get a label by its resource name. Resource name may be any of: * `labels/{id}` - See `labels/{id}@latest` * `labels/{id}@latest` - Gets the latest revision of the label. * `labels/{id}@published` - Gets the current published revision of the label. * `labels/{id}@{revision_id}` - Gets the label at the specified revision ID.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/get

name <> 

optional:
useAdminAccess <boolean> Set to `true` in order to use the user's admin credentials. The server verifies that the user is an admin for the label before allowing access.
languageCode <string> The BCP-47 language code to use for evaluating localized field labels. When not specified, values in the default configured language are used.
view <string> When specified, only certain fields belonging to the indicated view are returned."
  ([name] (labels-get name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://drivelabels.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.admin.labels.readonly"
      "https://www.googleapis.com/auth/drive.labels"
      "https://www.googleapis.com/auth/drive.labels.readonly"]}))

(defn labels-updatePermissions
  "Updates a Label's permissions. If a permission for the indicated principal doesn't exist, a new Label Permission is created, otherwise the existing permission is updated. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/updatePermissions

parent <> 
GoogleAppsDriveLabelsV2LabelPermission:
GoogleAppsDriveLabelsV2LabelPermission

optional:
useAdminAccess <boolean> Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access."
  ([parent GoogleAppsDriveLabelsV2LabelPermission]
    (labels-updatePermissions
      parent
      GoogleAppsDriveLabelsV2LabelPermission
      nil))
  ([parent GoogleAppsDriveLabelsV2LabelPermission optional]
    {:method :patch,
     :uri-template
     "https://drivelabels.googleapis.com/v2/{+parent}/permissions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.labels"],
     :body GoogleAppsDriveLabelsV2LabelPermission}))

(defn labels-locks-list
  "Lists the LabelLocks on a Label.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/locks/list

parent <> 

optional:
pageSize <integer> Maximum number of Locks to return per page. Default: 100. Max: 200."
  ([parent] (labels-locks-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://drivelabels.googleapis.com/v2/{+parent}/locks",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.admin.labels.readonly"
      "https://www.googleapis.com/auth/drive.labels"
      "https://www.googleapis.com/auth/drive.labels.readonly"]}))

(defn labels-permissions-list
  "Lists a Label's permissions.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/permissions/list

parent <> 

optional:
useAdminAccess <boolean> Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
pageSize <integer> Maximum number of permissions to return per page. Default: 50. Max: 200."
  ([parent] (labels-permissions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://drivelabels.googleapis.com/v2/{+parent}/permissions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.admin.labels.readonly"
      "https://www.googleapis.com/auth/drive.labels"
      "https://www.googleapis.com/auth/drive.labels.readonly"]}))

(defn labels-permissions-delete
  "Deletes a Label's permission. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/permissions/delete

name <> 

optional:
useAdminAccess <boolean> Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access."
  ([name] (labels-permissions-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://drivelabels.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.labels"]}))

(defn labels-permissions-batchDelete
  "Deletes Label permissions. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/permissions/batchDelete

parent <> 
GoogleAppsDriveLabelsV2BatchDeleteLabelPermissionsRequest:
GoogleAppsDriveLabelsV2BatchDeleteLabelPermissionsRequest"
  [parent GoogleAppsDriveLabelsV2BatchDeleteLabelPermissionsRequest]
  {:method :post,
   :uri-template
   "https://drivelabels.googleapis.com/v2/{+parent}/permissions:batchDelete",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive.admin.labels"
    "https://www.googleapis.com/auth/drive.labels"],
   :body GoogleAppsDriveLabelsV2BatchDeleteLabelPermissionsRequest})

(defn labels-permissions-create
  "Updates a Label's permissions. If a permission for the indicated principal doesn't exist, a new Label Permission is created, otherwise the existing permission is updated. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/permissions/create

parent <> 
GoogleAppsDriveLabelsV2LabelPermission:
GoogleAppsDriveLabelsV2LabelPermission

optional:
useAdminAccess <boolean> Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access."
  ([parent GoogleAppsDriveLabelsV2LabelPermission]
    (labels-permissions-create
      parent
      GoogleAppsDriveLabelsV2LabelPermission
      nil))
  ([parent GoogleAppsDriveLabelsV2LabelPermission optional]
    {:method :post,
     :uri-template
     "https://drivelabels.googleapis.com/v2/{+parent}/permissions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.labels"],
     :body GoogleAppsDriveLabelsV2LabelPermission}))

(defn labels-permissions-batchUpdate
  "Updates Label permissions. If a permission for the indicated principal doesn't exist, a new Label Permission is created, otherwise the existing permission is updated. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/permissions/batchUpdate

parent <> 
GoogleAppsDriveLabelsV2BatchUpdateLabelPermissionsRequest:
GoogleAppsDriveLabelsV2BatchUpdateLabelPermissionsRequest"
  [parent GoogleAppsDriveLabelsV2BatchUpdateLabelPermissionsRequest]
  {:method :post,
   :uri-template
   "https://drivelabels.googleapis.com/v2/{+parent}/permissions:batchUpdate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive.admin.labels"
    "https://www.googleapis.com/auth/drive.labels"],
   :body GoogleAppsDriveLabelsV2BatchUpdateLabelPermissionsRequest})

(defn labels-revisions-updatePermissions
  "Updates a Label's permissions. If a permission for the indicated principal doesn't exist, a new Label Permission is created, otherwise the existing permission is updated. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/revisions/updatePermissions

parent <> 
GoogleAppsDriveLabelsV2LabelPermission:
GoogleAppsDriveLabelsV2LabelPermission

optional:
useAdminAccess <boolean> Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access."
  ([parent GoogleAppsDriveLabelsV2LabelPermission]
    (labels-revisions-updatePermissions
      parent
      GoogleAppsDriveLabelsV2LabelPermission
      nil))
  ([parent GoogleAppsDriveLabelsV2LabelPermission optional]
    {:method :patch,
     :uri-template
     "https://drivelabels.googleapis.com/v2/{+parent}/permissions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.labels"],
     :body GoogleAppsDriveLabelsV2LabelPermission}))

(defn labels-revisions-locks-list
  "Lists the LabelLocks on a Label.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/revisions/locks/list

parent <> 

optional:
pageSize <integer> Maximum number of Locks to return per page. Default: 100. Max: 200."
  ([parent] (labels-revisions-locks-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://drivelabels.googleapis.com/v2/{+parent}/locks",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.admin.labels.readonly"
      "https://www.googleapis.com/auth/drive.labels"
      "https://www.googleapis.com/auth/drive.labels.readonly"]}))

(defn labels-revisions-permissions-batchDelete
  "Deletes Label permissions. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/revisions/permissions/batchDelete

parent <> 
GoogleAppsDriveLabelsV2BatchDeleteLabelPermissionsRequest:
GoogleAppsDriveLabelsV2BatchDeleteLabelPermissionsRequest"
  [parent GoogleAppsDriveLabelsV2BatchDeleteLabelPermissionsRequest]
  {:method :post,
   :uri-template
   "https://drivelabels.googleapis.com/v2/{+parent}/permissions:batchDelete",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive.admin.labels"
    "https://www.googleapis.com/auth/drive.labels"],
   :body GoogleAppsDriveLabelsV2BatchDeleteLabelPermissionsRequest})

(defn labels-revisions-permissions-batchUpdate
  "Updates Label permissions. If a permission for the indicated principal doesn't exist, a new Label Permission is created, otherwise the existing permission is updated. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/revisions/permissions/batchUpdate

parent <> 
GoogleAppsDriveLabelsV2BatchUpdateLabelPermissionsRequest:
GoogleAppsDriveLabelsV2BatchUpdateLabelPermissionsRequest"
  [parent GoogleAppsDriveLabelsV2BatchUpdateLabelPermissionsRequest]
  {:method :post,
   :uri-template
   "https://drivelabels.googleapis.com/v2/{+parent}/permissions:batchUpdate",
   :uri-template-args {"parent" parent},
   :query-params {},
   :scopes
   ["https://www.googleapis.com/auth/drive.admin.labels"
    "https://www.googleapis.com/auth/drive.labels"],
   :body GoogleAppsDriveLabelsV2BatchUpdateLabelPermissionsRequest})

(defn labels-revisions-permissions-delete
  "Deletes a Label's permission. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/revisions/permissions/delete

name <> 

optional:
useAdminAccess <boolean> Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access."
  ([name] (labels-revisions-permissions-delete name nil))
  ([name optional]
    {:method :delete,
     :uri-template "https://drivelabels.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.labels"]}))

(defn labels-revisions-permissions-create
  "Updates a Label's permissions. If a permission for the indicated principal doesn't exist, a new Label Permission is created, otherwise the existing permission is updated. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/revisions/permissions/create

parent <> 
GoogleAppsDriveLabelsV2LabelPermission:
GoogleAppsDriveLabelsV2LabelPermission

optional:
useAdminAccess <boolean> Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access."
  ([parent GoogleAppsDriveLabelsV2LabelPermission]
    (labels-revisions-permissions-create
      parent
      GoogleAppsDriveLabelsV2LabelPermission
      nil))
  ([parent GoogleAppsDriveLabelsV2LabelPermission optional]
    {:method :post,
     :uri-template
     "https://drivelabels.googleapis.com/v2/{+parent}/permissions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.labels"],
     :body GoogleAppsDriveLabelsV2LabelPermission}))

(defn labels-revisions-permissions-list
  "Lists a Label's permissions.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/labels/revisions/permissions/list

parent <> 

optional:
pageSize <integer> Maximum number of permissions to return per page. Default: 50. Max: 200.
useAdminAccess <boolean> Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access."
  ([parent] (labels-revisions-permissions-list parent nil))
  ([parent optional]
    {:method :get,
     :uri-template
     "https://drivelabels.googleapis.com/v2/{+parent}/permissions",
     :uri-template-args {"parent" parent},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.admin.labels.readonly"
      "https://www.googleapis.com/auth/drive.labels"
      "https://www.googleapis.com/auth/drive.labels.readonly"]}))

(defn users-getCapabilities
  "Gets the user capabilities.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/users/getCapabilities

name <> 

optional:
customer <string> The customer to scope this request to. For example: \"customers/abcd1234\". If unset, will return settings within the current customer."
  ([name] (users-getCapabilities name nil))
  ([name optional]
    {:method :get,
     :uri-template "https://drivelabels.googleapis.com/v2/{+name}",
     :uri-template-args {"name" name},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.admin.labels.readonly"
      "https://www.googleapis.com/auth/drive.labels"
      "https://www.googleapis.com/auth/drive.labels.readonly"]}))

(defn limits-getLabel
  "Get the constraints on the structure of a Label; such as, the maximum number of Fields allowed and maximum length of the label title.
https://developers.google.com/drive/labels/guides/overview/v2/reference/rest/v2/limits/getLabel

optional:
name <string> Required. Label revision resource name Must be: \"limits/label\""
  ([] (limits-getLabel nil))
  ([optional]
    {:method :get,
     :uri-template
     "https://drivelabels.googleapis.com/v2/limits/label",
     :uri-template-args {},
     :query-params (merge {} optional),
     :scopes
     ["https://www.googleapis.com/auth/drive.admin.labels"
      "https://www.googleapis.com/auth/drive.admin.labels.readonly"
      "https://www.googleapis.com/auth/drive.labels"
      "https://www.googleapis.com/auth/drive.labels.readonly"]}))
